package com.group.books.repos;

import com.group.books.entities.Member;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MemberRepository extends JpaRepository<Member, Integer> {
    Member findById(int memberId);
    Member findByLoginId(String loginId);
    boolean existsByLoginId(String loginId);

    Member findByNameAndEmail(String username, String email);

    Member findByLoginIdAndNameAndEmail(String loginId, String name, String email);

    Member findByLoginIdAndPassword(String loginId, String password);
}
