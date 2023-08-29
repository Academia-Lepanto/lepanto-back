package com.lepanto.testing.api.core.service;

import com.ontimize.jee.common.dto.EntityResult;

import java.util.List;
import java.util.Map;

public interface IAptitudesService {
    public EntityResult aptitudesQuery(Map<String, Object> keyMap, List<String> attrList);

    // Inserta un nuevo registro de aptitud en la base de datos.
    public EntityResult aptitudesInsert(Map<String, Object> attrMap);
}


