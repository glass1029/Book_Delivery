package com.group.books.services.Impl;

import com.group.books.entities.AnswerVO;
import com.group.books.entities.Member;
import com.group.books.entities.SuggestVO;
import com.group.books.repos.SuggestDAO;
import com.group.books.services.SuggestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("suggestService")
class SuggestServiceImpl implements SuggestService {

    @Autowired
    private SuggestDAO suggestDAO;

    @Override
    public List<SuggestVO> getSuggestList(SuggestVO vo) {
        List<SuggestVO> suggestList = suggestDAO.getSuggestList(vo);
        return suggestList;
    }

    @Override
    public int getSuggestCount(SuggestVO vo) {
        int totalCount = suggestDAO.getSuggestCount(vo);
        return totalCount;
    }

    @Override
    public SuggestVO getSuggestOne(SuggestVO vo) {
        SuggestVO suggest = suggestDAO.getSuggestOne(vo);
        return suggest;
    }

    @Override
    public void updateSuggestHit(SuggestVO vo) {
        suggestDAO.updateSuggestHit(vo);
    }

    @Override
    public List<AnswerVO> getAnswerList(SuggestVO vo) {
        List<AnswerVO> answers = suggestDAO.getAnswerList(vo);
        return answers;
    }

    @Override
    public void insertAnswer(AnswerVO vo) {
        suggestDAO.insertAnswer(vo);
    }

    @Override
    public void deleteAnswer(AnswerVO vo) {
        suggestDAO.deleteAnswer(vo);
    }

    @Override
    public void insertSuggest(SuggestVO vo) {
        suggestDAO.insertSuggest(vo);
    }

    @Override
    public void updateSuggest(SuggestVO vo) {
        suggestDAO.updateSuggest(vo);
    }

    @Override
    public void deleteSuggest(SuggestVO vo) {
        suggestDAO.deleteSuggest(vo);
    }

}
