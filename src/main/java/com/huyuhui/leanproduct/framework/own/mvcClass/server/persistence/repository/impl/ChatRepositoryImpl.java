package com.huyuhui.leanproduct.framework.own.mvcClass.server.persistence.repository.impl;

import com.huyuhui.leanproduct.framework.own.mvcClass.api.request.ChatFilter;
import com.huyuhui.leanproduct.framework.own.mvcClass.server.persistence.dataobject.ChatDO;
import com.huyuhui.leanproduct.framework.own.mvcClass.server.persistence.mapper.ChatMapper;
import com.huyuhui.leanproduct.framework.own.mvcClass.server.persistence.repository.ChatRepository;
import org.assertj.core.util.Lists;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author: cody
 * @create: 2025/03/22
 **/
@Repository
public class ChatRepositoryImpl implements ChatRepository {
    @Autowired
    private ChatMapper chatMapper;
    /**
     * 查询
     */
    @Override
    public List<ChatDO> search(ChatFilter chatFilter){
        
        
        //chatMapper.selectList()
        return Lists.newArrayList();
    }

    /**
     * 
     */

}
