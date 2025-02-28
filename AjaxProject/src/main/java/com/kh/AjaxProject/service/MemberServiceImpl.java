package com.kh.AjaxProject.service;

import com.kh.AjaxProject.DTO.Member;
import java.util.List;

import com.kh.AjaxProject.Mapper.MemberMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MemberServiceImpl implements MemberService {

    // 필드 삽입은 권장되지 않습니다.
    @Autowired
    private MemberMapper memberMapper;

    @Override
    public List<Member> getAllMembers() {
        return memberMapper.getAllMembers();
    }
}
