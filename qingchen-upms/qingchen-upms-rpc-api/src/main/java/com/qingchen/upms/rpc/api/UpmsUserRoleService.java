package com.qingchen.upms.rpc.api;

import com.qingchen.common.base.BaseService;
import com.qingchen.upms.dao.model.UpmsUserRole;
import com.qingchen.upms.dao.model.UpmsUserRoleExample;

/**
* UpmsUserRoleService接口
* Created by qingchen on 2017/7/3.
*/
public interface UpmsUserRoleService extends BaseService<UpmsUserRole, UpmsUserRoleExample> {
    /**
     * 用户角色
     * @param roleIds 角色ids
     * @param id 用户id
     * @return
     */
    int role(String[] roleIds, int id);
}