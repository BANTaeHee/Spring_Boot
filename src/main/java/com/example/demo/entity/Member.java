package com.example.demo.entity;

import lombok.*;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Getter
@ToString
public class Member extends BaseEntity{

    @Id // PK를 가지는 변수를 선언하는 것을 의미
    private String email;   // member 클래스는 이메일 주소를 PK.
    private String password;
    private String name;
}
