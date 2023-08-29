package com.lepanto.testing.model.core.service;

import com.lepanto.testing.api.core.service.IRoleService;
import com.lepanto.testing.model.core.dao.RoleDao;
import com.ontimize.jee.common.dto.EntityResult;
import com.ontimize.jee.server.dao.DefaultOntimizeDaoHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Lazy
@Service("RoleService")
public class RoleService implements IRoleService {

    @Autowired
    private RoleDao roleDao;

    @Autowired
    private DefaultOntimizeDaoHelper daoHelper;

    //Consulta el rol
    @Override
    public EntityResult roleQuery(Map<String, Object> keyMap, List<String> attrList) {
        return this.daoHelper.query(roleDao, keyMap, attrList);
    }
}
