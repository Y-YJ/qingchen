package com.qingchen.upms.rpc.api;

import com.qingchen.common.base.BaseService;
import com.qingchen.upms.dao.model.UpmsUserOrganization;
import com.qingchen.upms.dao.model.UpmsUserOrganizationExample;

/**
* UpmsUserOrganizationService接口
* Created by qingchen on 2017/7/3.
*/
public interface UpmsUserOrganizationService extends BaseService<UpmsUserOrganization, UpmsUserOrganizationExample> {
    /**
     * 用户组织
     * @param organizationIds 组织ids
     * @param id 用户id
     * @return
     */
    int organization(String[] organizationIds, int id);
}