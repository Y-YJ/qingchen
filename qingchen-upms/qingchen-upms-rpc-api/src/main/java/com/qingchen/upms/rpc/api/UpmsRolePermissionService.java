package com.qingchen.upms.rpc.api;

import com.alibaba.fastjson.JSONArray;
import com.qingchen.common.base.BaseService;
import com.qingchen.upms.dao.model.UpmsRolePermission;
import com.qingchen.upms.dao.model.UpmsRolePermissionExample;

/**
* UpmsRolePermissionService接口
* Created by qingchen on 2017/7/3.
*/
public interface UpmsRolePermissionService extends BaseService<UpmsRolePermission, UpmsRolePermissionExample> {
    /**
     * 角色权限
     * @param datas 权限数据
     * @param id 角色id
     * @return
     */
    int rolePermission(JSONArray datas, int id);
}