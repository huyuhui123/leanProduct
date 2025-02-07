-- 释放锁

local key = KEYS[1]
local requestId = ARGV[1]
local value = redis.call('get', key)

if value == requestId then
    -- 锁的持有者和当前请求的持有者相同，可以释放锁
    redis.call('del', key)
    return 1  -- 表示成功释放锁
else
    return -1  -- 表示锁已经被其他持有者或已过期，无法释放
end