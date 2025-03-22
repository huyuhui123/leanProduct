package com.huyuhui.leanproduct.framework.own.mvcClass.server.service;

import com.huyuhui.leanproduct.framework.own.mvcClass.api.request.ChatFilter;
import com.huyuhui.leanproduct.framework.own.mvcClass.api.response.ChatResp;

import java.util.List;

/**
 * @author: cody
 * @create: 2025/03/22
 **/

public interface ChatService {
    List<ChatResp> search(ChatFilter chatFilter);
}
