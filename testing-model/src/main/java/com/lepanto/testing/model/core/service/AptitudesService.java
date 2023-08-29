package com.lepanto.testing.model.core.service;

import com.lepanto.testing.api.core.service.IAptitudesService;
import com.lepanto.testing.model.core.dao.AptitudesDao;
import com.ontimize.jee.common.dto.EntityResult;
import com.ontimize.jee.server.dao.DefaultOntimizeDaoHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Lazy
@Service("AptitudesService")
public class AptitudesService implements IAptitudesService {


    @Autowired
    private AptitudesDao aptitudesDao;
    @Autowired
    private DefaultOntimizeDaoHelper daoHelper;


    //Consulta aptitudes
    @Override
    public EntityResult aptitudesQuery(Map<String, Object> keyMap, List<String> attrList) {
        return daoHelper.query(aptitudesDao, keyMap, attrList);

    }

    //Inserta paises
    @Override
    public EntityResult aptitudesInsert(Map<String, Object> attrMap) {
        return this.daoHelper.insert(aptitudesDao, attrMap);
    }


}
