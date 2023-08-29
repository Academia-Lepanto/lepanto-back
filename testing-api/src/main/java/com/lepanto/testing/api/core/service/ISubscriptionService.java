package com.lepanto.testing.api.core.service;

import com.ontimize.jee.common.dto.EntityResult;

import java.util.List;
import java.util.Map;

public interface ISubscriptionService {

    public EntityResult subscriptionQuery(Map<String, Object> keyMap, List<String> attrList);
}