package com.huyuhui.leanproduct.redis.service;

import org.springframework.core.io.ClassPathResource;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.script.DefaultRedisScript;
import org.springframework.data.redis.serializer.RedisSerializer;
import org.springframework.scripting.support.ResourceScriptSource;
import org.springframework.stereotype.Component;

import java.util.Collections;

/**
 * @author: cody
 * @create: 2025/01/22
 **/
@Component
public class RedisServiceReentrantLock extends RedisService {
    private final DefaultRedisScript<Long> acquireLockScript;

    private final DefaultRedisScript<Long> reentrantLockScript;

    private final DefaultRedisScript<Long> releaseLockScript;

    public RedisServiceReentrantLock(RedisTemplate redisTemplate) {
        this.redisTemplate = redisTemplate;
        this.acquireLockScript = new DefaultRedisScript<>();
        this.acquireLockScript.setResultType(Long.class);
        this.acquireLockScript.setScriptSource(new ResourceScriptSource(new ClassPathResource("/script/acquireLock.lua")));

        this.reentrantLockScript = new DefaultRedisScript<>();
        this.reentrantLockScript.setResultType(Long.class);
        this.reentrantLockScript.setScriptSource(new ResourceScriptSource(new ClassPathResource("/script/reentrantLock.lua")));

        this.releaseLockScript = new DefaultRedisScript<>();
        this.releaseLockScript.setResultType(Long.class);
        this.releaseLockScript.setScriptSource(new ResourceScriptSource(new ClassPathResource("/script/releaseLock.lua")));
    }

    /**
     * 获取普通锁
     * @param key
     * @param requestId
     * @param lockExpireMils
     * @return
     */
    public Long acquireLock(String key, String requestId, long lockExpireMils) {
        RedisSerializer<String> argsSerializer = redisTemplate.getStringSerializer();
        RedisSerializer<Long> resultSerializer = redisTemplate.getStringSerializer();
        return (Long) redisTemplate.execute(acquireLockScript, argsSerializer, resultSerializer, Collections.singletonList(key), requestId, String.valueOf(lockExpireMils));
    }


    /**
     * 获取重入锁
     * @param key
     * @param requestId
     * @param lockExpireMils
     * @return
     */
    public Long reentrantLock(String key, String requestId, long lockExpireMils) {
        RedisSerializer<String> argsSerializer = redisTemplate.getStringSerializer();
        RedisSerializer<Long> resultSerializer = redisTemplate.getStringSerializer();
        return (Long) redisTemplate.execute(reentrantLockScript, argsSerializer, resultSerializer, Collections.singletonList(key), requestId, String.valueOf(lockExpireMils));
    }

    /**
     * 释放锁
     * @param key
     * @param requestId
     * @return
     */
    public Long releaseLock(String key, String requestId) {
        RedisSerializer<String> argsSerializer = redisTemplate.getStringSerializer();
        RedisSerializer<Long> resultSerializer = redisTemplate.getStringSerializer();
        return (Long) redisTemplate.execute(releaseLockScript, argsSerializer, resultSerializer, Collections.singletonList(key), requestId);
    }

    /**
     * HashKey 删除
     * @param key
     * @param hashKey
     * @return
     */
    public Long deleteHashKey(final String key, final String... hashKey)
    {
        return redisTemplate.opsForHash().delete(key, hashKey);
    }
}
