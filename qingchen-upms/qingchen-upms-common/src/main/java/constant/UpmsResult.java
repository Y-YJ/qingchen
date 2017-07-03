package constant;

import com.qingchen.common.base.BaseResult;

/**
 * \
 * \                                                 )
 * \                                               (  (
 * \                                              ) ) )
 * \                  ......,.....................)  )
 * \                 |.....|..................... ))
 * \                                 [[[_________________________________]]]
 * \                                         Blog: www.qingchen.red
 * \                                          Created by PhpStorm.
 * \                                            Date: 2017/7/3 0003
 * \                                              User: 清晨
 * \
 */
public class UpmsResult extends BaseResult {
    public UpmsResult(UpmsResultConstant upmsResultConstant, Object data) {
        super(upmsResultConstant.getCode(), upmsResultConstant.getMessage(), data);
    }
}
