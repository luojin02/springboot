package com.fortis.inspection.component;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Component;
import org.springframework.util.CollectionUtils;
import org.springframework.util.ObjectUtils;

import java.io.Serializable;
import java.util.Collection;
import java.util.concurrent.TimeUnit;

@Component
public class RedisUtil {

    @Autowired
    private  RedisTemplate<String, Serializable> redisTemplate;

    /**
     * 设置缓存
     */
    public void setTokenCache(String key,String value){
        redisTemplate.opsForValue().set(key,value);
    }

    public void setTokenCache(String key,String value,Long timeout){
        redisTemplate.opsForValue().set(key,value,timeout,TimeUnit.SECONDS);
    }

    public void setTokenCache(String key,String value,Long timeout,TimeUnit unit){
        redisTemplate.opsForValue().set(key,value,timeout,unit);
    }

    /**
     * 获取缓存
     */
    public String getValue(String key){
        String value = (String)redisTemplate.opsForValue().get(key);
        if (ObjectUtils.isEmpty(value)){
            return null;
        }
        return value;
    }

    /**
     * 获取缓存剩余时间
     */
    public Long getCacheTime(String key){
        return redisTemplate.getExpire(key, TimeUnit.SECONDS);
    }

    /**
     * 删除缓存
     * @param key 可以传一个值 或多个
     */
    public void del(String ... key){
        if(key!=null&&key.length>0){
            if(key.length==1){
                redisTemplate.delete(key[0]);
            }else{
                Collection<String> collection = null;
                for(int i=0; i<key.length; i++) {
                    collection.add(key[i]);
                }
                redisTemplate.delete(collection);
            }
        }

    }



}

