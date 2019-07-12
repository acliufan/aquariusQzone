package com.service;

import com.bean.Person;
import com.bean.QPerson;
import com.dao.TestDao;
import com.google.common.collect.Lists;
import com.mysema.query.BooleanBuilder;
import com.mysema.query.util.CollectionUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jdbc.query.QueryDslJdbcTemplate;
import org.springframework.data.jpa.repository.Query;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import java.util.List;
/**
 * Created by Administrator on 2019/1/31 0031.
 */
@Service
@Transactional
public class TestService {
    @Autowired
    private TestDao testDao ;//自动注入,可以直接使用的testDao来调用TestDao的方法，拿来即用
    @Autowired
    private JdbcTemplate jdbcTemplate;
    @Autowired
    private QueryDslJdbcTemplate queryDslJdbcTemplate;
    private QPerson $ = QPerson.person;
    private static final Logger logger = LoggerFactory.getLogger(TestService.class);
  /*  是把Spring里面的bean的配置也给去掉，
     使得spring配置文件里面只有一个自动扫描的标签，
    增强Java代码的内聚性并进一步减少配置文件。*/
    public String saveInfo(Person person){
        String returnWords="";
        try{
            testDao.save(person);
            returnWords="success";
        }catch(Exception e){
            e.printStackTrace();
            returnWords="failed";
        }
       return returnWords;
    }
    public List<Person> queryInfo(){
        BooleanBuilder condition = new BooleanBuilder();
        condition.and($.username.eq("a Average Joe"));
        return Lists.newArrayList(testDao.findAll(condition));
    }
    public List<Person> queryInfoBySql(String submitArea){
        String sql="select * from person where username=\'"+submitArea+"\'";
        jdbcTemplate = (JdbcTemplate) queryDslJdbcTemplate.getJdbcOperations();
        List<Person> lists = jdbcTemplate.query(sql, new Object[]{}, new BeanPropertyRowMapper<Person>(Person.class));
        if(org.springframework.util.CollectionUtils.isEmpty(lists)){
            return  Lists.newArrayList();
        }
        return lists;
    }
   public Person findByAddress(){
        Person person=new Person();
        String address="China";
        person=testDao.findPeopleByAddressEquals(address);
        return person;
    }
}
