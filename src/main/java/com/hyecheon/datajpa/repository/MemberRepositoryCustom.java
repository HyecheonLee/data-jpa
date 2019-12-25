package com.hyecheon.datajpa.repository;

import com.hyecheon.datajpa.entity.Member;

import java.util.List;

public interface MemberRepositoryCustom {
    public List<Member> findMemberCustom();
}
