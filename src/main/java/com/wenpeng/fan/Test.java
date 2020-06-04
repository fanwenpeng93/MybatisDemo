package com.wenpeng.fan;

import com.wenpeng.fan.dao.UserDao;
import com.wenpeng.fan.entity.User;

import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args) {

       UserDao userDao=new UserDao();
//        插入数据ok
//        User user=new User();
//        user.setPassword("1234");
//        user.setUsername("fan02");
//        userDao.insert(user);

//        查询一条数据ok
//        User u01=userDao.select01(1);
//        System.out.print(u01);

//        未完成
        List<Integer> ids=new ArrayList();
        ids.add(1);
        ids.add(2);
        List<User> users=userDao.select02(ids);
        System.out.print(users);

//        删除ok
//        userDao.delete(2);

//        更新ok
//        User user=new User();
//        user.setId(2);
//        user.setPassword("123466");
//        user.setUsername("fan02");
//        userDao.updata(user);

//        使用各种标签查询ok
//        User user=new User();
//        user.setPassword("123466");
//        user.setUsername("fan02");
//        System.out.print(userDao.select03(user));
//        System.out.print(userDao.select04(user));
//        System.out.print(userDao.select05(user));




    }
}
