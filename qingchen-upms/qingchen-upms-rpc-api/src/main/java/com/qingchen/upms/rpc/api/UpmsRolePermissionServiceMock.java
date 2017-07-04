package com.qingchen.upms.rpc.api;

import com.alibaba.fastjson.JSONArray;
import com.qingchen.common.base.BaseServiceMock;
import com.qingchen.upms.dao.mapper.UpmsRolePermissionMapper;
import com.qingchen.upms.dao.model.UpmsRolePermission;
import com.qingchen.upms.dao.model.UpmsRolePermissionExample;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
* 降级实现UpmsRolePermissionService接口
* Created by qingchen on 2017/7/3.
*/
public class UpmsRolePermissionServiceMock extends BaseServiceMock<UpmsRolePermissionMapper, UpmsRolePermission, UpmsRolePermissionExample> implements UpmsRolePermissionService {
    private static Logger _log = LoggerFactory.getLogger(UpmsRolePermissionServiceMock.class);


    public int rolePermission(JSONArray datas, int id) {
        _log.info("UpmsRolePermissionServiceMock => rolePermission");
        return 0;
    }
}
