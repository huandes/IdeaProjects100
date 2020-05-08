package com.hds;

import org.junit.Test;
import redis.clients.jedis.Jedis;

public class TestJedis {

    @Test
    public void testJedis() {
        //创建一个Jedis的连接
        Jedis jedis = new Jedis("127.0.0.1", 6379);
//        jedis.select(1);//设置数据库

        //执行redis命令
        jedis.set("mytest", "hello world, this is jedis client!");
        //从redis中取值
        String result = jedis.get("mytest");
        //打印结果
        System.out.println(result);
        //关闭连接
        jedis.close();
    }

}
