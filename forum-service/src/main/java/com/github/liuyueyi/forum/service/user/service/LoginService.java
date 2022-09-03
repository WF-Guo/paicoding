package com.github.liuyueyi.forum.service.user.service;

import com.github.liueyueyi.forum.api.model.vo.user.dto.BaseUserInfoDTO;
import com.google.common.collect.Sets;

import java.util.Set;

/**
 * @author YiHui
 * @date 2022/8/15
 */
public interface LoginService {
    String SESSION_KEY = "f-session";
    Set<String> LOGIN_CODE_KEY = Sets.newHashSet("登录", "login");


    /**
     * 获取登录验证码
     *
     * @param uuid
     * @return
     */
    String getVerifyCode(String uuid);

    /**
     * 登录
     *
     * @param code
     * @return
     */
    String login(String code);

    /**
     * 登出
     *
     * @param session
     */
    void logout(String session);


    /**
     * 获取登录的用户信息
     *
     * @param session
     * @return
     */
    BaseUserInfoDTO getUserBySessionId(String session);
}
