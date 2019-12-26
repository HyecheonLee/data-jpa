package com.hyecheon.datajpa.repository;

import com.hyecheon.datajpa.entity.Member;
import com.hyecheon.datajpa.entity.Team;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.util.StringUtils;

import javax.persistence.criteria.*;

public class MemberSpec {

    public static Specification<Member> teamName(final String teamName) {
        return (Specification<Member>) (root, query, criteriaBuilder) -> {
            if (StringUtils.isEmpty(teamName)) {
                return null;
            }
            final Join<Member, Team> t = root.join("team", JoinType.INNER);
            return criteriaBuilder.equal(t.get("name"), teamName);
        };
    }

    public static Specification<Member> username(final String username) {
        return (Specification<Member>) (root, query, criteriaBuilder) -> criteriaBuilder.equal(root.get("username"), username);
    }
}
