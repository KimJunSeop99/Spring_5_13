package com.example.myservice.service;

import com.example.myservice.model.Dept2;
import com.example.myservice.model.EMP;

import java.util.List;

/**
 * packageName : com.example.myservice.service
 * fileName : Dept2Service2
 * author : ds
 * date : 2022-05-13
 * description :
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * —————————————————————————————
 * 2022-05-13         ds          최초 생성
 */
public interface EMPService {
    public List<EMP> selectAll(); // 부서정보 select하는 서비스

    //  select문을 실행하는 서비스

    void insertMember(EMP emp);
}
