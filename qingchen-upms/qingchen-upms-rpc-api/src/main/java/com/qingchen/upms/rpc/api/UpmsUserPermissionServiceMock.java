package com.qingchen.upms.rpc.api;

import com.alibaba.fastjson.JSONArray;
import com.qingchen.common.base.BaseServiceMock;
import com.qingchen.upms.dao.mapper.UpmsUserPermissionMapper;
import com.qingchen.upms.dao.model.UpmsUserPermission;
import com.qingchen.upms.dao.model.UpmsUserPermissionExample;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
* 降级实现UpmsUserPermissionService接口
* Created by qingchen on 2017/7/3.
*/
public class UpmsUserPermissionServiceMock extends BaseServiceMock<UpmsUserPermissionMapper, UpmsUserPermission, UpmsUserPermissionExample> implements UpmsUserPermissionService {
    private static Logger _log = LoggerFactory.getLogger(UpmsUserPermissionServiceMock.class);


    public int permission(JSONArray datas, int id) {
        _log.info("UpmsUserPermissionServiceMock => permission");
        return 0;
    }
}
