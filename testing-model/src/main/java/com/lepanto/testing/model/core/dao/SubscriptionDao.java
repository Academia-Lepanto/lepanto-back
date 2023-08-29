package com.lepanto.testing.model.core.dao;

import com.ontimize.jee.server.dao.common.ConfigurationFile;
import com.ontimize.jee.server.dao.jdbc.OntimizeJdbcDaoSupport;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Repository;

@Lazy
@Repository(value = "SubscriptionDao")
@ConfigurationFile(
        configurationFile = "dao/SubscriptionDao.xml",
        configurationFilePlaceholder = "dao/placeholders.properties")
public class SubscriptionDao extends OntimizeJdbcDaoSupport {

    public static final String id = "id";
    public static final String subscription_type = "subscription_type";


}