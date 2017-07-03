package com.qingchen.upms.rpc;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * \
 * \                                                 )
 * \                                               (  (
 * \                                              ) ) )
 * \                  ......,.....................)  )
 * \                 |.....|..................... ))
 * \                                 [[[_________________________________]]]
 * \                                         Blog: www.qingchen.red
 * \                                          Created by PhpStorm.
 * \                                            Date: 2017/7/3 0003
 * \                                              User: 清晨
 * \
 */
public class QingChenUpmsRpcServiceApplication {
    private static Logger _log = LoggerFactory.getLogger(QingChenUpmsRpcServiceApplication.class);

    public static void main(String[] args) {
        _log.info(">>>>> qingchen-upms-rpc-service 正在启动 <<<<<");
        new ClassPathXmlApplicationContext("classpath:META-INF/spring/*.xml");
        _log.info(">>>>> qingchen-upms-rpc-service 启动完成 <<<<<");
    }
}
