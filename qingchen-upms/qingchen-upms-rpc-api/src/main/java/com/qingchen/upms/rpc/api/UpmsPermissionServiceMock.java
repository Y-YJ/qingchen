package com.qingchen.upms.rpc.api;

import com.alibaba.fastjson.JSONArray;
import com.qingchen.common.base.BaseServiceMock;
import com.qingchen.upms.dao.mapper.UpmsPermissionMapper;
import com.qingchen.upms.dao.model.UpmsPermission;
import com.qingchen.upms.dao.model.UpmsPermissionExample;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
* 降级实现UpmsPermissionService接口
* Created by qingchen on 2017/7/3.
*/
public class UpmsPermissionServiceMock extends BaseServiceMock<UpmsPermissionMapper, UpmsPermission, UpmsPermissionExample> implements UpmsPermissionService {
    private static Logger _log = LoggerFactory.getLogger(UpmsPermissionServiceMock.class);


    public JSONArray getTreeByRoleId(Integer roleId) {
        _log.info("UpmsPermissionServiceMock => getTreeByRoleId");
        return null;
    }


    public JSONArray getTreeByUserId(Integer usereId, Byte type) {
        _log.info("UpmsPermissionServiceMock => getTreeByUserId");
        return null;
    }
}
