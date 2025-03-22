package com.huyuhui.leanproduct.framework.own.mvcClass.server.service.impl;

import com.huyuhui.leanproduct.framework.own.mvcClass.api.request.ChatFilter;
import com.huyuhui.leanproduct.framework.own.mvcClass.api.response.ChatResp;
import com.huyuhui.leanproduct.framework.own.mvcClass.server.persistence.repository.ChatRepository;
import com.huyuhui.leanproduct.framework.own.mvcClass.server.service.ChatService;
import org.assertj.core.util.Lists;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author: cody
 * @create: 2025/03/22
 **/
@Service
public class ChatServiceImpl implements ChatService {
    @Autowired
    private ChatRepository chatRepository;
    
    
    @Override
    public List<ChatResp> search(ChatFilter chatFilter){
        chatRepository.search(chatFilter);
        return Lists.newArrayList();
    }
}
