package com.wenpeng.fan.dao;

import com.wenpeng.fan.entity.User;
import com.wenpeng.fan.tool.MybatisSession;
import org.apache.ibatis.session.SqlSession;

import java.util.List;

public class UserDao {
    SqlSession session = MybatisSession.getSession();

    public int insert(User user){
        int rint = session.insert("user.insertUser",user); // 第一个参数是mapper xml里的namespace+MappedStatement对应的id
        session.commit();// 不要忘记提交
        return rint;
    }

    public void delete(int id){
        session.delete("deleteUser",id);
        session.commit();
    }

    public User select01(int id){
        User user=session.selectOne("findUserById",id);
        session.commit();
        return user;
    }

    public List<User> select02(List<Integer> ids){
        List<User> users=session.selectList("findUserById",ids);
        return users;
    }

    public User select03(User userselect){
        User user=session.selectOne("findUserByuserandpwd",userselect);
        session.commit();
        return user;
    }
    public User select04(User userselect){
        User user=session.selectOne("findUserByuserandpwdtrim",userselect);
        session.commit();
        return user;
    }
    public User select05(User userselect){
        User user=session.selectOne("findUserById",userselect);
        session.commit();
        return user;
    }

    public void updata(User user){
        session.update("updateUser",user);
        session.commit();
    }


}
