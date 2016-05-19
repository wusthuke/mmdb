package org.huke.db.mmdb.redis.simple;

import redis.clients.jedis.Jedis;

/**
 * 类RedisString.java的实现描述：类实现描述
 *
 * http://www.cnblogs.com/stephen-liu74/archive/2012/04/16/2370212.html
 *
 * @author huke 2016/5/13 17:26
 */
public class RedisString {

    public static void main(String[] args) {
        // 连接本地 redis 服务
        Jedis jedis = new Jedis("localhost", 6379);
        System.out.println("Connection to server successfully");

        // 设置 redis 字符串数据
        jedis.set("name", "胡科 test");

        // 获取存储数据并输出
        System.out.println("Stored Name is : " + jedis.get("name"));
    }
}
