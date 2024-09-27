package poe.spring.domain.member.model.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import poe.spring.domain.member.model.entity.Member;

public interface MemberRepo extends JpaRepository<Member, Long> {
}
