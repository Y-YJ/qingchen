package com.qingchen.upms.rpc.service.impl;


import com.qingchen.common.annotation.BaseService;
import com.qingchen.common.base.BaseServiceImpl;
import com.qingchen.upms.dao.mapper.UpmsLogMapper;
import com.qingchen.upms.dao.model.UpmsLog;
import com.qingchen.upms.dao.model.UpmsLogExample;
import com.qingchen.upms.rpc.api.UpmsLogService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
* UpmsLogService实现
* Created by qingchen on 2017/3/20.
*/
@Service
@Transactional
@BaseService
public class UpmsLogServiceImpl extends BaseServiceImpl<UpmsLogMapper, UpmsLog, UpmsLogExample> implements UpmsLogService {

    private static Logger _log = LoggerFactory.getLogger(UpmsLogServiceImpl.class);

    @Autowired
    UpmsLogMapper upmsLogMapper;

}