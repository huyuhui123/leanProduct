-- 可重入锁

local key = KEYS[1]
local requestId = ARGV[1]
local lockExpireMils = tonumber(ARGV[2])
local result = redis.call('setnx', key, requestId)

if result == 1 then
    -- 获取锁成功，设置过期时间
    redis.call('pexpire', key, lockExpireMils)
else
    -- 获取锁失败
    local currentValue = redis.call('get', key)

    if currentValue == requestId then
        -- 重入锁，更新过期时间
        result = 1
        redis.call('expire', key, lockExpireMils)
    else
        -- 锁被其他线程持有
        result = -1
    end
end

-- 返回获取锁的结果
return result