package com.ktv.service;

import com.ktv.bean.User;
import com.ktv.bean.UserExample;
import com.ktv.enums.ExceptionEnums;
import com.ktv.exception.KtvException;
import com.ktv.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    private UserMapper userMapper;

    public User findByNameAndPassword(String username, String password){
        UserExample example = new UserExample();
        example.createCriteria().andUserNameEqualTo(username).andUserPwdEqualTo(password);
        List<User> users = userMapper.selectByExample(example);
        if(users != null && users.size()>0){
            return users.get(0);
        }
        return null;
    }

    public void updateOrSave(User user){
        if(user==null){
            throw new KtvException(ExceptionEnums.PRAM_IS_NULL);
        }
        if(user.getUserId()==null){
            userMapper.insert(user);
        }else {
            userMapper.updateByPrimaryKey(user);
        }

    }

    public List<User> findAll(){
        return userMapper.selectByExample(new UserExample());
    }

}
