package com.example.demo.entity;

import lombok.*;

import javax.persistence.*;

@Entity
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Getter
@ToString(exclude = "board") // @ToString 주의
public class Reply extends BaseEntity{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long rno;
    private String text;
    private String replyer;
    // Board와 연관관계는 아직 작성하지 않음
    @ManyToOne
    private Board board; // 연관관계 지정
}
