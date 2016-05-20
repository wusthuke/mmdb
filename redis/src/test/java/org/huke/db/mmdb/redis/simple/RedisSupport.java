package org.huke.db.mmdb.redis.simple;

import redis.clients.jedis.Jedis;

/**
 * 类RedisSupport.java的实现描述：类实现描述
 *
 * @author huke 2016/5/18 19:05
 */
public class RedisSupport {

    private Jedis jedis = null;

    public Jedis getJedis() {
        if (this.jedis == null) {
            synchronized (this) {
                if (this.jedis == null) {
                    this.getJedis("localhost", 6379);
                }
            }
        }
        return this.jedis;
    }

    public Jedis getJedis(String host, int port) {
        if (this.jedis == null) {
            synchronized (this) {
                if (this.jedis == null) {
                    this.initiateJedis(host, port);
                }
            }
        }
        return this.jedis;
    }

    public void initiateJedis(String host, int port) {
        this.jedis = new Jedis(host, port);
    }
}
