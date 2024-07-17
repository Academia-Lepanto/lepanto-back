package com.lepanto.testing.api.core.service;


import java.util.List;
import java.util.Map;

import com.ontimize.jee.common.dto.EntityResult;


public interface IQuestionService {

    public EntityResult questionQuery(Map<?, ?> keyMap, List<?> attrList);
    public EntityResult questionInsert(Map<?, ?> attrMap);
    public EntityResult questionUpdate(Map<?, ?> attrMap, Map<?, ?> keyMap);
    public EntityResult questionDelete(Map<String, Object> keyMap);
    public EntityResult questionCountQuery(Map<?, ?> keyMap, List<?> attrList);
    public EntityResult questionCountCategoryQuery(Map<?, ?> keyMap, List<?> attrList);

}
