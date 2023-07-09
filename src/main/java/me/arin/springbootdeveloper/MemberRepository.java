package me.arin.springbootdeveloper;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MemberRepository extends JpaRepository<Member, Long> {
    // 엔티티 이름과 기본키 타입을 제네릭에 넣어줌
}
