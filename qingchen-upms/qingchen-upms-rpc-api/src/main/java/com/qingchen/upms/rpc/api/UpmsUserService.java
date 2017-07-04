package com.qingchen.upms.rpc.api;

import com.qingchen.common.base.BaseService;
import com.qingchen.upms.dao.model.UpmsUser;
import com.qingchen.upms.dao.model.UpmsUserExample;

/**
* UpmsUserService接口
* Created by qingchen on 2017/7/3.
*/
public interface UpmsUserService extends BaseService<UpmsUser, UpmsUserExample> {
    UpmsUser createUser(UpmsUser upmsUser);
}