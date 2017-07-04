package com.qingchen.upms.rpc.service.impl;


import com.qingchen.common.annotation.BaseService;
import com.qingchen.common.base.BaseServiceImpl;
import com.qingchen.upms.dao.mapper.UpmsOrganizationMapper;
import com.qingchen.upms.dao.model.UpmsOrganization;
import com.qingchen.upms.dao.model.UpmsOrganizationExample;
import com.qingchen.upms.rpc.api.UpmsOrganizationService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
* UpmsOrganizationService实现
* Created by qingchen on 2017/3/20.
*/
@Service
@Transactional
@BaseService
public class UpmsOrganizationServiceImpl extends BaseServiceImpl<UpmsOrganizationMapper, UpmsOrganization, UpmsOrganizationExample> implements UpmsOrganizationService {

    private static Logger _log = LoggerFactory.getLogger(UpmsOrganizationServiceImpl.class);

    @Autowired
    UpmsOrganizationMapper upmsOrganizationMapper;

}