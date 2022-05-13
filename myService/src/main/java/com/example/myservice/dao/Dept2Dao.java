package com.example.myservice.dao;

import com.example.myservice.model.Dept2;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * packageName : com.example.myservice.dao
 * fileName : Dept2Dao
 * author : ds
 * date : 2022-05-13
 * description :
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * —————————————————————————————
 * 2022-05-13         ds          최초 생성
 */
@Mapper
public interface Dept2Dao {
        //    select 문 메소드
//    List<Dept> selectList(); // 부서정보를 select하는 메소드
        List<Dept2> selectAll(); // 부서정보를 select하는 메소드

        void insert(Dept2 dept2); // 부서정보를 insert하는 메소드

}
