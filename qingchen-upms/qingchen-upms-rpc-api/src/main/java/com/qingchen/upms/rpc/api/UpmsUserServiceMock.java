package com.qingchen.upms.rpc.api;

import com.qingchen.common.base.BaseServiceMock;
import com.qingchen.upms.dao.mapper.UpmsUserMapper;
import com.qingchen.upms.dao.model.UpmsUser;
import com.qingchen.upms.dao.model.UpmsUserExample;

/**
* 降级实现UpmsUserService接口
* Created by qingchen on 2017/7/3.
*/
public class UpmsUserServiceMock extends BaseServiceMock<UpmsUserMapper, UpmsUser, UpmsUserExample> implements UpmsUserService {

    public UpmsUser createUser(UpmsUser upmsUser) {
        return null;
    }
}
