const REST_API_KEY = '71fb781281129d416192bf3062799f08';
const booksContainer = document.getElementById('books-container');
const filter = document.getElementById('filter');

let size = 3;
let page = 1;

// Fetch books from API
async function getBooksByTitle(query) {
  const res = await fetch(
    `https://dapi.kakao.com/v3/search/book?size=${size}&page=${page}&target=title&query=${query}`,
    {
      method: 'GET',
      headers: {
        'Content-Type': 'application/json',
        Authorization: `KakaoAK ${REST_API_KEY}`,
      },
    }
  );

  const data = await res.json();

  return data;
}

// Show books
async function showBooks() {
  const books = await getBooksByTitle('해리포터');

  console.log('here' + books.documents[0].contents);

  books.documents.forEach((book) => {
    const bookEl = document.createElement('div');
    bookEl.classList.add('book');
    bookEl.innerHTML = `
      <div class="isbn">${book.isbn}</div>
      <div class="thumbnail"><img src=${book.thumbnail}></div>
      <div class="title">${book.title}</div>
      <div class="book-info">${book.contents}</div>
    `;

    booksContainer.appendChild(bookEl);
  });
}

// Show initial books
showBooks();
