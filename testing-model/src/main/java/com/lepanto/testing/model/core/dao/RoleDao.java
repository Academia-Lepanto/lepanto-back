package com.lepanto.testing.model.core.dao;

import com.ontimize.jee.server.dao.common.ConfigurationFile;
import com.ontimize.jee.server.dao.jdbc.OntimizeJdbcDaoSupport;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Repository;

@Lazy
@Repository(value = "RoleDao")
@ConfigurationFile(
        configurationFile = "dao/RoleDao.xml",
        configurationFilePlaceholder = "dao/placeholders.properties")
public class RoleDao extends OntimizeJdbcDaoSupport {

    public static final String id_rolename = "id_rolename";
    public static final String rolename = "rolename";
    public static final String xmlclientpermission = "xmlclientpermission";


}

