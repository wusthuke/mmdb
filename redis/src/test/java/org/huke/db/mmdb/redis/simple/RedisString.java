package org.huke.db.mmdb.redis.simple;

import redis.clients.jedis.Jedis;

/**
 * 类RedisString.java的实现描述：类实现描述
 *
 * http://www.cnblogs.com/stephen-liu74/archive/2012/04/16/2370212.html
 *
 * @author huke 2016/5/13 17:26
 */
public class RedisString extends RedisSupport {


    private void testSimpleGetSet() {
        Jedis jedis = super.getJedis();
        jedis.set("name", "huke");
        System.out.println("name: " + jedis.get("name"));
    }

    private void testSetex() {
        Jedis jedis = super.getJedis();

        jedis.setex("name", 2, "胡科");
    }
}
