package com.example.myservice.controller;

import com.example.myservice.dao.Dept2Dao;
import com.example.myservice.dao.Dept3Dao;
import com.example.myservice.dao.DeptDao;
import com.example.myservice.dao.EMPDao;
import com.example.myservice.model.Dept;
import com.example.myservice.model.Dept2;
import com.example.myservice.model.Dept3;
import com.example.myservice.model.EMP;
import com.example.myservice.service.Dept2ServiceImpl;
import com.example.myservice.service.Dept3ServiceImpl;
import com.example.myservice.service.DeptServiceImpl;
import com.example.myservice.service.EMPService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * packageName : com.example.myservice.controller
 * fileName : DeptController
 * author : ds
 * date : 2022-05-12
 * description : 메뉴달기 , 반환값 : json파일형태
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2022-05-12         ds          최초 생성
 */
// @RestController : 메뉴달기 , 반환값 : json파일형태 ( Vue 연동 )
// @Controller : jsp, html , 타임리프 파일 형태
// Rest API :
// CRUD ( Insert : Post, Select : Get, Update : Put, Delete : Delete )
@RestController
public class DeptController {

//    @Autowired : 객체를 자동 의존성 주입( 자동 DI )
    @Autowired
    DeptDao deptDao;

    @Autowired
    Dept2Dao dept2Dao;

    @Autowired
    Dept3Dao dept3Dao;
//    @Autowired : 객체를 자동 의존성 주입( 자동 DI ) 대상 : 스프링에 등록된 객체만
//    스프링에 객체를 등록 : 클래스 위에 @Component, @Service, @repository
    @Autowired
    DeptServiceImpl deptService;

    @Autowired
    Dept2ServiceImpl dept2Service;

    @Autowired
    Dept3ServiceImpl dept3Service;
    @Autowired
    EMPDao empDao;

    @Autowired
    EMPService empService;




//    @GetMapping : 메뉴 달기 : /main , select 실행
//    localhost:8000/main 접속 : 새메뉴
//    @GetMapping("/dept/all")
//    public List<Dept> selectAll() {
////      List<Dept> list = deptDao.selectList();
//        List<Dept> list = deptDao.selectAll();
//        return list; // json파일 형태로 보임
//    }
//    // @PostMapping : insert 실행
//    // HTML : 헤더(머리말) , 본문(BODY)
//    // @RequestBody : 본문에 TEXT / JSON 형태로 데이터를 전송하겠음.
//    @PostMapping("/dept/new")
//    public List<Dept> insertMember(@RequestBody Dept dept) {
////        웹 브라우저에서 JSON형태로 데이터를 넘겨받아( dept 객체 )
////        DB에 INSERT문을 실행하는 부분
//        deptService.insertMember(dept);
////        데이터 추가되었는지 결과 확인 ( DB Select )
//        return deptDao.selectAll();
//    }

//    @GetMapping("/dept2/all")
//    public List<Dept2> selectAll() {
////      List<Dept> list = deptDao.selectList();
//        List<Dept2> list = dept2Dao.selectAll();
//        return list; // json파일 형태로 보임
//    }
//    // @PostMapping : insert 실행
//    // HTML : 헤더(머리말) , 본문(BODY)
//    // @RequestBody : 본문에 TEXT / JSON 형태로 데이터를 전송하겠음.
//    @PostMapping("/dept2/new")
//    public List<Dept2> insertMember(@RequestBody Dept2 dept2) {
////        웹 브라우저에서 JSON형태로 데이터를 넘겨받아( dept 객체 )
////        DB에 INSERT문을 실행하는 부분
//        dept2Service.insertMember(dept2);
////        데이터 추가되었는지 결과 확인 ( DB Select )
//        return dept2Dao.selectAll();
//    }

//    @GetMapping("/dept3/all")
//    public List<Dept3> selectAll() {
////      List<Dept> list = deptDao.selectList();
//        List<Dept3> list = dept3Dao.selectAll();
//        return list; // json파일 형태로 보임
//    }
//    // @PostMapping : insert 실행
//    // HTML : 헤더(머리말) , 본문(BODY)
//    // @RequestBody : 본문에 TEXT / JSON 형태로 데이터를 전송하겠음.
//    @PostMapping("/dept3/new")
//    public List<Dept3> insertMember(@RequestBody Dept3 dept3) {
////        웹 브라우저에서 JSON형태로 데이터를 넘겨받아( dept 객체 )
////        DB에 INSERT문을 실행하는 부분
//        dept3Service.insertMember(dept3);
////        데이터 추가되었는지 결과 확인 ( DB Select )
//        return dept3Dao.selectAll();
//    }

    @GetMapping("/EMP/all")
    public List<EMP> selectAll() {
//      List<Dept> list = deptDao.selectList();
        List<EMP> list = empDao.selectall();
        return list; // json파일 형태로 보임
    }
    // @PostMapping : insert 실행
    // HTML : 헤더(머리말) , 본문(BODY)
    // @RequestBody : 본문에 TEXT / JSON 형태로 데이터를 전송하겠음.
    @PostMapping("/EMP/new")
    public List<EMP> insertMember(@RequestBody EMP emp) {
//        웹 브라우저에서 JSON형태로 데이터를 넘겨받아( dept 객체 )
//        DB에 INSERT문을 실행하는 부분
        empService.insertMember(emp);
//        데이터 추가되었는지 결과 확인 ( DB Select )
        return empDao.selectall();
    }
}









