package com.itmayiedu.service;

import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.concurrent.TimeUnit;

/**
 * Created by wangjian on 2018/3/26.
 */
@Service
public class UserService {
    @Autowired
    private StringRedisTemplate stringRedisTemplate;
    public void setString(String key,String value){
        this.setObject(key,value,null);
    }
    public void setString(String key,String value,Long time){
        this.setObject(key,value,time);
    }
    public void setList(String key,List<String> listValue){
        this.setObject(key,listValue,null);
    }

    public void setObject(String key,Object value,Long time){
        if(StringUtils.isEmpty(key)||value == null){
            return;
        }
        if(value instanceof String){
            String strValue = (String) value;
            stringRedisTemplate.opsForValue().set(key,strValue);
            if(time!=null){
                stringRedisTemplate.opsForValue().set(key,strValue,time, TimeUnit.SECONDS);
            }
            return;
        }
        if(value instanceof List){
            List<String> list=(List<String>)value;
            for(String string:list){
                stringRedisTemplate.opsForList().leftPush(key,string);
            }
            return;
        }

    }
    public String getStringkey(String key){
        return stringRedisTemplate.opsForValue().get(key);
    }
}
