package com.example.myservice.service;

import com.example.myservice.dao.EMPDao;
import com.example.myservice.model.EMP;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * packageName : com.example.myservice.service
 * fileName : Dept2Servicelmpl
 * author : ds
 * date : 2022-05-13
 * description :
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * —————————————————————————————
 * 2022-05-13         ds          최초 생성
 */
@Service
public class EMPServiceImpl implements EMPService{

    @Autowired
    EMPDao empDao;

//    @Override
//    public List<Dept> selectList() {
//        return null;
//    }

    //  select문을 실행하는 서비스
    @Override
    public List<EMP> selectAll() {
        return empDao.selectall();

    }

    @Override
    public void insertMember(EMP emp) {
//       DB에 insert문을 실행하는 부분
        empDao.insertEMP(emp);
    }
}
