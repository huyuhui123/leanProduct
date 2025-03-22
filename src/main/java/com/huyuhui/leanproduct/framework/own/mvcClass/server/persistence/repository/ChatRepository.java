package com.huyuhui.leanproduct.framework.own.mvcClass.server.persistence.repository;

import com.huyuhui.leanproduct.framework.own.mvcClass.api.request.ChatFilter;
import com.huyuhui.leanproduct.framework.own.mvcClass.server.persistence.dataobject.ChatDO;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author: cody
 * @create: 2025/03/22
 **/
@Repository
public interface ChatRepository {

    List<ChatDO> search(ChatFilter chatFilter);
}
