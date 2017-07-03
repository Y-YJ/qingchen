package com.qingchen.upms.server;

import com.qingchen.common.base.BaseInterface;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

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
public class Initialize implements BaseInterface {
    private static Logger _log = LoggerFactory.getLogger(Initialize.class);

    public void init() {
        _log.info(">>>>>>>初始化");
    }
}
