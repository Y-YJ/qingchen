package com.qingchen.upms.rpc.api;

import com.alibaba.fastjson.JSONArray;
import com.qingchen.common.base.BaseService;
import com.qingchen.upms.dao.model.UpmsUserPermission;
import com.qingchen.upms.dao.model.UpmsUserPermissionExample;

/**
* UpmsUserPermissionService接口
* Created by qingchen on 2017/7/3.
*/
public interface UpmsUserPermissionService extends BaseService<UpmsUserPermission, UpmsUserPermissionExample> {
    /**
     * 用户权限
     * @param datas 权限数据
     * @param id 用户id
     * @return
     */
    int permission(JSONArray datas, int id);
}