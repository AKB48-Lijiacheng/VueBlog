package com.zhuawatou.util;

import com.zhuawatou.shiro.AccountProfile;
import org.apache.shiro.SecurityUtils;

public class ShiroUtil {
    public static AccountProfile getProfile(){
        return (AccountProfile) SecurityUtils.getSubject().getPrincipal();
    }
}
