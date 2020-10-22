package com.group.books.repos;

import com.group.books.entities.AnswerVO;
import com.group.books.entities.Member;
import com.group.books.entities.SuggestVO;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository("suggestDAO")
public interface SuggestDAO {
    List<SuggestVO> getSuggestList(SuggestVO vo);
    int getSuggestCount(SuggestVO vo);
    SuggestVO getSuggestOne(SuggestVO vo);
    List<AnswerVO> getAnswerList(SuggestVO vo);
    void updateSuggestHit(SuggestVO vo);
    void insertSuggest(SuggestVO vo);
    void updateSuggest(SuggestVO vo);
    void deleteSuggest(SuggestVO vo);
    void deleteAnswer(AnswerVO vo);
    void insertAnswer(AnswerVO vo);
}
