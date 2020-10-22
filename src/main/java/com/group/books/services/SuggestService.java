package com.group.books.services;

import com.group.books.entities.AnswerVO;
import com.group.books.entities.SuggestVO;
import com.group.books.entities.Member;

import java.util.List;

public interface SuggestService {

    List<SuggestVO> getSuggestList(SuggestVO vo);
    int getSuggestCount(SuggestVO vo);
    SuggestVO getSuggestOne(SuggestVO vo);
    void updateSuggestHit(SuggestVO vo);
    void insertSuggest(SuggestVO vo);
    void updateSuggest(SuggestVO vo);
    void deleteSuggest(SuggestVO vo);
    List<AnswerVO> getAnswerList(SuggestVO vo);
    void deleteAnswer(AnswerVO vo);
    void insertAnswer(AnswerVO vo);
}
