package com.lepanto.testing.model.core.service;

import com.lepanto.testing.api.core.service.IRoleService;
import com.lepanto.testing.api.core.service.ISubscriptionService;
import com.lepanto.testing.model.core.dao.RoleDao;
import com.lepanto.testing.model.core.dao.SubscriptionDao;
import com.ontimize.jee.common.dto.EntityResult;
import com.ontimize.jee.server.dao.DefaultOntimizeDaoHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Lazy
@Service("SubscriptionService")
public class SubscriptionService implements ISubscriptionService {

    @Autowired
    private SubscriptionDao subscriptionDao;

    @Autowired
    private DefaultOntimizeDaoHelper daoHelper;

    @Override
    public EntityResult subscriptionQuery(Map<String, Object> keyMap, List<String> attrList) {
        return this.daoHelper.query(subscriptionDao, keyMap, attrList);
    }
}
