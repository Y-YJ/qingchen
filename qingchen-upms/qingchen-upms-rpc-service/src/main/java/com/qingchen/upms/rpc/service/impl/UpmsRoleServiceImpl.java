package com.qingchen.upms.rpc.service.impl;

import com.qingchen.common.annotation.BaseService;
import com.qingchen.common.base.BaseServiceImpl;
import com.qingchen.upms.dao.mapper.UpmsRoleMapper;
import com.qingchen.upms.dao.model.UpmsRole;
import com.qingchen.upms.dao.model.UpmsRoleExample;
import com.qingchen.upms.rpc.api.UpmsRoleService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
* UpmsRoleService实现
* Created by qingchen on 2017/3/20.
*/
@Service
@Transactional
@BaseService
public class UpmsRoleServiceImpl extends BaseServiceImpl<UpmsRoleMapper, UpmsRole, UpmsRoleExample> implements UpmsRoleService {

    private static Logger _log = LoggerFactory.getLogger(UpmsRoleServiceImpl.class);

    @Autowired
    UpmsRoleMapper upmsRoleMapper;

}