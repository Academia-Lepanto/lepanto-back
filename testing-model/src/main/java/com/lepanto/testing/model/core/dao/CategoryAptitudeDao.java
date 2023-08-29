package com.lepanto.testing.model.core.dao;

import com.ontimize.jee.server.dao.common.ConfigurationFile;
import com.ontimize.jee.server.dao.jdbc.OntimizeJdbcDaoSupport;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Repository;

@Repository(value = "CategoryAptitudeDao")
@Lazy
@ConfigurationFile(
        configurationFile = "dao/CategoryAptitudeDao.xml",
        configurationFilePlaceholder = "dao/placeholders.properties")
public class CategoryAptitudeDao extends OntimizeJdbcDaoSupport {
    public static final String ATTR_APTITUDE_ID = "aptitude_id";
    public static final String ATTR_CATEGORY_ID = "category_id";
    public static final String ATTR_APTITUDE_NAME = "aptitude_name";
}

