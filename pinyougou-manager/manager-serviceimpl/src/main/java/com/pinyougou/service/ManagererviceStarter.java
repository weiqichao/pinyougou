package com.pinyougou.service;

import com.alibaba.dubbo.config.spring.context.annotation.DubboComponentScan;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

/*
                       .::::.
                     .::::::::.
                    :::::::::::  FUCK YOU
                ..:::::::::::'
              '::::::::::::'
                .::::::::::
           '::::::::::::::..
                ..::::::::::::.
              ``::::::::::::::::
               ::::``:::::::::'        .:::.
              ::::'   ':::::'       .::::::::.
            .::::'      ::::     .:::::::'::::.
           .:::'       :::::  .:::::::::' ':::::.
          .::'        :::::.:::::::::'      ':::::.
         .::'         ::::::::::::::'         ``::::.
     ...:::           ::::::::::::'              ``::.
    ```` ':.          ':::::::::'                  ::::..
                       '.:::::'                    ':'````..
*/
@SpringBootApplication
//@DubboComponentScan(basePackages = {"com.weiqichao.p2p.user.service "})
//如果不在里面添加包的名字，会默认扫描本类所在的包以子包下面的的内容
@DubboComponentScan
@ImportResource(value = {"classpath:mybatis.xml"})
@MapperScan(basePackages = {"com.pinyougou.manager.dao"})//扫描Mapper接口。一定要指定Mapper具体所在的包，不要写一个大的包，因为他的标准只有一个，是只要是接口就创建代理对象
public class ManagererviceStarter {
    public static void main(String[] args) {
        SpringApplication.run(ManagererviceStarter.class,args);
    }
}
