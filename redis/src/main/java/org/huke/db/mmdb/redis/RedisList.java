package org.huke.db.mmdb.redis;

import redis.clients.jedis.Jedis;

/**
 * 类RedisList.java的实现描述：类实现描述
 * http://www.runoob.com/redis/redis-java.html
 * 
 * @author huke 2016/5/13 17:43
 */
public class RedisList {

    public static void main(String[] args) {
        // 连接本地 redis 服务
        Jedis jedis = new Jedis("localhost", 6379);
        System.out.println("Connection to server Successfully !");

        // 存储数据到列表中

    }
}
