package com.qingchen.upms.rpc.api;

import com.qingchen.common.base.BaseServiceMock;
import com.qingchen.upms.dao.mapper.UpmsUserRoleMapper;
import com.qingchen.upms.dao.model.UpmsUserRole;
import com.qingchen.upms.dao.model.UpmsUserRoleExample;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
* 降级实现UpmsUserRoleService接口
* Created by qingchen on 2017/7/3.
*/
public class UpmsUserRoleServiceMock extends BaseServiceMock<UpmsUserRoleMapper, UpmsUserRole, UpmsUserRoleExample> implements UpmsUserRoleService {
    private static Logger _log = LoggerFactory.getLogger(UpmsUserRoleServiceMock.class);


    public int role(String[] roleIds, int id) {
        _log.info("UpmsUserRoleServiceMock => role");
        return 0;
    }
}
