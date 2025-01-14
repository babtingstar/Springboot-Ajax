package com.kh.AjaxProject.Controller;

import com.kh.AjaxProject.DTO.Member;
import com.kh.AjaxProject.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Controller
public class MemberController {

    @Autowired
    private MemberService memberService;

    // ResponseEntity 제대로 데이터를 전달했는 지 확인
    /*
    ResponseEntity<>
        ResponseEntity.ok();
     */

    @GetMapping
    public String index() {
        return  "index";
    }

//    @GetMapping("/api/members")
//    public ResponseEntity<List<Member>> getAllMembers() {
//        return ResponseEntity.ok(memberService.getAllMembers());
//    }
}
