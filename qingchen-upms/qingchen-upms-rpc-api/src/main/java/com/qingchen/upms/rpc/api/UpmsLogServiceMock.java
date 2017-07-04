package com.qingchen.upms.rpc.api;


import com.qingchen.common.base.BaseServiceMock;
import com.qingchen.upms.dao.mapper.UpmsLogMapper;
import com.qingchen.upms.dao.model.UpmsLog;
import com.qingchen.upms.dao.model.UpmsLogExample;

/**
* 降级实现UpmsLogService接口
* Created by shuzheng on 2017/7/3.
*/
public class UpmsLogServiceMock extends BaseServiceMock<UpmsLogMapper, UpmsLog, UpmsLogExample> implements UpmsLogService {

}
