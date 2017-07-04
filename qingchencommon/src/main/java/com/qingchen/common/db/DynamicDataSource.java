package com.qingchen.common.db;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.jdbc.datasource.lookup.AbstractRoutingDataSource;

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
 * \                                            Date: 2017/6/29 0029
 * \                                              User: 清晨
 * \
 */
public class DynamicDataSource extends AbstractRoutingDataSource {

    private final static Logger _log = LoggerFactory.getLogger(DynamicDataSource.class);

    private static final ThreadLocal<String> contextHolder = new ThreadLocal<String>();
    @Override
    protected Object determineCurrentLookupKey() {
        String dataSource = getDataSource();
        _log.info("当前操作使用的数据源：{}", dataSource);
        return dataSource;
    }

    /**
     * 设置数据源
     * @param dataSource
     */
    public static void setDataSource(String dataSource) {
        contextHolder.set(dataSource);
    }

    /**
     * 获取数据源
     * @return
     */
    public static String getDataSource() {
        String dataSource = contextHolder.get();
        // 如果没有指定数据源，使用默认数据源
        if (null == dataSource) {
            DynamicDataSource.setDataSource(DataSourceEnum.MASTER.getDefault());
        }
        return contextHolder.get();
    }

    /**
     * 清除数据源
     */
    public static void clearDataSource() {
        contextHolder.remove();
    }
}
