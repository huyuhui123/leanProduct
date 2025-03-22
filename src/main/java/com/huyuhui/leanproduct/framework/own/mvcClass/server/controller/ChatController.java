package com.huyuhui.leanproduct.framework.own.mvcClass.server.controller;

import com.huyuhui.leanproduct.framework.own.mvcClass.api.request.ChatFilter;
import com.huyuhui.leanproduct.framework.own.mvcClass.api.response.ChatResp;
import com.huyuhui.leanproduct.framework.own.mvcClass.server.service.ChatService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author: cody
 * @create: 2025/03/22
 **/
@RestController
public class ChatController {
    @Autowired
    private ChatService chatService;
    /**
     * 查询
     */
    @PostMapping("/")
    public List<ChatResp> search(@RequestBody ChatFilter chatFilter){
        return chatService.search(chatFilter);
    }
    
    /**
     * 新增
     */
    
    /**
     * 修改
     */
    
    /**
     * 删除
     */
}
