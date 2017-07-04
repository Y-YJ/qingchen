package com.qingchen.upms.rpc.api;

import com.alibaba.fastjson.JSONArray;
import com.qingchen.common.base.BaseService;
import com.qingchen.upms.dao.model.UpmsPermission;
import com.qingchen.upms.dao.model.UpmsPermissionExample;

/**
* UpmsPermissionService接口
* Created by shuzheng on 2017/7/3.
*/
public interface UpmsPermissionService extends BaseService<UpmsPermission, UpmsPermissionExample> {

    JSONArray getTreeByRoleId(Integer roleId);

    JSONArray getTreeByUserId(Integer usereId, Byte type);
}