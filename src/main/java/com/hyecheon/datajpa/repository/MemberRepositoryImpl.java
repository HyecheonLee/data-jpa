package com.hyecheon.datajpa.repository;

import com.hyecheon.datajpa.entity.Member;
import lombok.RequiredArgsConstructor;

import javax.persistence.EntityManager;
import java.util.List;

@RequiredArgsConstructor
public class MemberRepositoryImpl implements MemberRepositoryCustom {

    private final EntityManager em;

    public List<Member> findMemberCustom() {
        return em.createQuery("select m from Member m").getResultList();
    }
}
