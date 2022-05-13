package com.example.myservice.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * packageName : com.example.myservice.model
 * fileName : Dept2
 * author : ds
 * date : 2022-05-13
 * description :
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * —————————————————————————————
 * 2022-05-13         ds          최초 생성
 */
@Getter
@Setter
public class Dept2 {
    private int dno; // 숫자 ( 부서번호 )
    //    Json 속성명으로 정의하는 어노테이션
//    { "속성명" : "값" }
    @JsonProperty(value = "dname")
    private String dname; // 문자열 ( 부서이름 )
    @JsonProperty(value = "loc")
    private String loc; // 문자열 ( 지역 )

//    setter/ getter 만들기
}
