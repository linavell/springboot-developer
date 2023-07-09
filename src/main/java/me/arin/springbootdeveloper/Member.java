package me.arin.springbootdeveloper;

import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED) // 기본 생성자
@AllArgsConstructor
public class Member {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // 자동으로 기본키가 증가되도록 지정
    @Column(name = "id", updatable = false) // 데이터베이스의 컬럼과 필드 매핑
    private Long id;

    @Column(name = "name", nullable = false)
    private String name;
}
