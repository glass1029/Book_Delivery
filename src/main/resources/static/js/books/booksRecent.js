const myUrl = 'http://localhost:8090';
const REST_API_KEY = '71fb781281129d416192bf3062799f08';

const size = 1;
const page = 1;


// get books
async function getAllBooks() {
  try {
    const res = await fetch(myUrl + `/api/books`);

    result = await res.json();

    console.log(res.status);
    if (res.status === 200) {
      $(document).ready(function() {
          var t = $('#dataTable').DataTable();

          result.forEach(async book => {
                  let row = document.createElement('tr');
                  let date = await getDateByTitle(book.bookName);
                  let thumbnail = await getThumbnail(book.bookName);

                  row.innerHTML = `<td>${book.bookId}</td>
                  <td><img src="${thumbnail}" alt="Image not found"/></td>
                  <td><a href="#" onclick="check(${book.bookId})" id="detail">${book.bookName}</a></td><td>${book.writer}</td><td>${book.publisher}</td><td>${date}</td>`;

                  t.row.add(row).draw(true);
                });

      } );
      console.log(result);
    } else {
      console.log(res.status);
    }
  } catch (err) {
    console.log(err.message);
  }
}



// Fetch publishing date from API
async function getDateByTitle(query) {
  const res = await fetch(
    `https://dapi.kakao.com/v3/search/book?size=${size}&page=${page}&target=title&query=${query}&sort=recency`,
    {
      method: 'GET',
      headers: {
        'Content-Type': 'application/json',
        Authorization: `KakaoAK ${REST_API_KEY}`,
      },
    }
  );

  const data = await res.json();

  if(data.meta.total_count === 0) {
    return "미등록";
  } else {
    return data.documents[0].datetime.split('T')[0];
  }
}

// Fetch thumbnail from API
async function getThumbnail(query) {
  const res = await fetch(
    `https://dapi.kakao.com/v3/search/book?size=${size}&page=${page}&target=title&query=${query}&sort=recency`,
    {
      method: 'GET',
      headers: {
        'Content-Type': 'application/json',
        Authorization: `KakaoAK ${REST_API_KEY}`,
      },
    }
  );

  const data = await res.json();

  if(data.meta.total_count === 0) {
    return "Image not found";
  } else {
    return data.documents[0].thumbnail;
  }
}



getAllBooks();


