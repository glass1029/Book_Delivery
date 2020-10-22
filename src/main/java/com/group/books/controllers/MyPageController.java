package com.group.books.controllers;

import java.util.Map;
import com.group.books.entities.MemberVO;
import com.group.books.entities.RentalVO;
import com.group.books.services.MyPageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.util.List;

@Controller
public class MyPageController {

    @Autowired
    MyPageService myPageService;
    
    //대여리스트 가져오기
    @RequestMapping(value = "/myRental", method = RequestMethod.GET)  //나의대여도서 조회
    public String myRental(Model model, RentalVO vo){

        //대여리스트 조회
        List<RentalVO> myRentalList = myPageService.getMyRentalList(vo);
        model.addAttribute("myRentalList", myRentalList);

        return "myRental";
    }
    //대여기간 연장
    @RequestMapping("/extendUpdate")
    public String extendUpdate(RentalVO vo) {
        myPageService.extendUpdate(vo);

        return "redirect:/myRental?member_id="+vo.getMember_id();
    }
    //책 반납처리
    @RequestMapping("/returnUpdate")
    public String returnUpdate(RentalVO vo) {
        myPageService.returnUpdate(vo);

        return "redirect:/myRental?member_id="+vo.getMember_id();
    }
//=======================================================================================
    //회원정보수정 전에 비밀번호 입력하는 페이지로 이동
    @RequestMapping("/checkGo")
    public String checkGo(MemberVO vo, Model model){
        MemberVO myInfo = myPageService.getMyInfo(vo);
        model.addAttribute("myInfo", myInfo);
        return "pwCheck";
    }

    //비밀번호 확인 후, 회원정보수정 페이지로 이동
    @RequestMapping(value="/pwCheck", method = RequestMethod.POST)
    public String pwCheck2(MemberVO vo, Model model, RedirectAttributes ra){
        String pw = vo.getPassword();
        MemberVO isPwRight = myPageService.pwLogin(vo);
        if(isPwRight != null && pw != null) {
            MemberVO myInfo = myPageService.getMyInfo(vo);
            model.addAttribute("myInfo", myInfo);

            model.addAttribute("message", "비밀번호 확인 성공!");
            return "myInfoModify";
        } else {
            //비밀번호 확인 실패시 다시 확인하기
            System.out.println(">>>>>비번없음 또는 불일치");
            ra.addFlashAttribute("message", "비밀번호를 확인하고 다시 입력해주세요.");
            ra.addFlashAttribute("url", "/checkGo");
            return  "redirect:/checkGo?member_id="+vo.getMember_id();

            //model.addAttribute("message", "비밀번호를 확인하고 입력해주세요.");
            //return "redirect:/checkGo?member_id="+vo.getMember_id();
        }
    }
    //회원정보 수정처리
    @RequestMapping(value= "/myInfoUpdate",  method = RequestMethod.POST)
    public String myInfoUpdate(MemberVO vo) {
        myPageService.myInfoUpdate(vo);
        return "/main";
    }
}
