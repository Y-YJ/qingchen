package com.qingchen.upms.rpc.api;

import com.qingchen.common.base.BaseServiceMock;
import com.qingchen.upms.dao.mapper.UpmsSystemMapper;
import com.qingchen.upms.dao.model.UpmsSystem;
import com.qingchen.upms.dao.model.UpmsSystemExample;

/**
* 降级实现UpmsSystemService接口
* Created by qingchen on 2017/7/3.
*/
public class UpmsSystemServiceMock extends BaseServiceMock<UpmsSystemMapper, UpmsSystem, UpmsSystemExample> implements UpmsSystemService {

}
