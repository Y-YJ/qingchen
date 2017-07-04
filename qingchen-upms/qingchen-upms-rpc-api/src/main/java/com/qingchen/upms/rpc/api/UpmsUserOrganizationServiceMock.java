package com.qingchen.upms.rpc.api;

import com.qingchen.common.base.BaseServiceMock;
import com.qingchen.upms.dao.mapper.UpmsUserOrganizationMapper;
import com.qingchen.upms.dao.model.UpmsUserOrganization;
import com.qingchen.upms.dao.model.UpmsUserOrganizationExample;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
* 降级实现UpmsUserOrganizationService接口
* Created by qingchen on 2017/7/3.
*/
public class UpmsUserOrganizationServiceMock extends BaseServiceMock<UpmsUserOrganizationMapper, UpmsUserOrganization, UpmsUserOrganizationExample> implements UpmsUserOrganizationService {
    private static Logger _log = LoggerFactory.getLogger(UpmsUserOrganizationServiceMock.class);


    public int organization(String[] organizationIds, int id) {
        _log.info("UpmsUserOrganizationServiceMock => organization");
        return 0;
    }
}
