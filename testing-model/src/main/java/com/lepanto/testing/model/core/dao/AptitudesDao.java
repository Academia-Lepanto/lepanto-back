package com.lepanto.testing.model.core.dao;

import com.ontimize.jee.server.dao.common.ConfigurationFile;
import com.ontimize.jee.server.dao.jdbc.OntimizeJdbcDaoSupport;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Repository;

@Lazy
@Repository(value = "AptitudesDao")
@ConfigurationFile(
        configurationFile = "dao/AptitudesDao.xml",
        configurationFilePlaceholder = "dao/placeholders.properties")
public class AptitudesDao extends OntimizeJdbcDaoSupport {

    public static final String APTITUDE = "aptitude";
    public static final String CATEGORIES = "categories";

}
