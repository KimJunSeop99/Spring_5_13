package com.example.myservice.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * packageName : com.example.myservice.model
 * fileName : Dept
 * author : ds
 * date : 2022-05-12
 * description : 부서 테이블의 데이터를 한건씩 담는 클래스
 *              ( dno (숫자), dname (문자열), loc(문자열) )
 *              Model == Vo == Dto == Entity ( 테이블의 데이터를 담는 그릇 )
 * ======================== ===================================
 * DATE            AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2022-05-12         ds          최초 생성
 */
// Rombok 의 기능 : setter / getter 를 자동으로 추가해줌
@Setter
@Getter
public class EMP {

    private int eno; // 숫자

    @JsonProperty(value = "ename")
    private String ename; // 문자열

    @JsonProperty(value = "job")
    private String job; // 문자열

    private int manager; // 문자열

    @JsonProperty(value = "hiredate")
    private String hiredate; // 문자열

    private int salary; //
    private int commission; //
    private int dno; //



//    setter/ getter 만들기
}










