package com.lepanto.testing.api.core.service;

import com.ontimize.jee.common.dto.EntityResult;

import java.util.List;
import java.util.Map;

public interface ICategoryAptitudeService {
    public EntityResult categoryAptitudeQuery(Map<String, Object> keyMap, List<String> attrList);
    // Consulta todas los categorias de una aptitud
    public EntityResult allCategoryAptitudeQuery(Map<Object, String> keyMap, List<String> attrList);

    public EntityResult allCategoryAptitudeInsert(Map<?, ?> attrMap);

    public EntityResult allCategoryAptitudeDelete(Map<String, Object> keyMap);
}

