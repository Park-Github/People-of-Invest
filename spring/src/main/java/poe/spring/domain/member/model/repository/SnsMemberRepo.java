package poe.spring.domain.member.model.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import poe.spring.domain.member.model.entity.SnsMember;

public interface SnsMemberRepo extends JpaRepository<SnsMember, Long> {
}
