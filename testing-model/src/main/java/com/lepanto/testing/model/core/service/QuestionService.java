package com.lepanto.testing.model.core.service;


import com.lepanto.testing.api.core.service.IQuestionService;
import com.lepanto.testing.model.core.dao.QuestionDao;
import com.ontimize.jee.common.dto.EntityResult;
import com.ontimize.jee.server.dao.DefaultOntimizeDaoHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;


@Lazy
@Service("QuestionService")
public class QuestionService implements IQuestionService {

    @Autowired
    private QuestionDao questionDao;

    @Autowired
    private DefaultOntimizeDaoHelper daoHelper;

    public EntityResult questionQuery(Map<?, ?> keyMap, List<?> attrList) {
        return this.daoHelper.query(questionDao, keyMap, attrList);
    }

    public EntityResult questionInsert(Map<?, ?> attrMap) {
        return this.daoHelper.insert(questionDao, attrMap);
    }

    public EntityResult questionUpdate(Map<?, ?> attrMap, Map<?, ?> keyMap) {
        return this.daoHelper.update(questionDao, attrMap, keyMap);
    }

    public EntityResult questionDelete(Map<String, Object> keyMap) {
        return this.daoHelper.delete(this.questionDao, keyMap);
    }

    public EntityResult questionCountQuery(Map<?, ?> keyMap, List<?> attrList) {
        return this.daoHelper.query(this.questionDao, keyMap, attrList, "countAptitudes");
    }
    public EntityResult questionCountCategoryQuery(Map<?, ?> keyMap, List<?> attrList) {
        return this.daoHelper.query(this.questionDao, keyMap, attrList, "countCategories");
    }
}
