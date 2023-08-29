package com.lepanto.testing.model.core.service;

import com.lepanto.testing.api.core.service.ICategoryAptitudeService;
import com.lepanto.testing.model.core.dao.CategoryAptitudeDao;
import com.ontimize.jee.common.dto.EntityResult;
import com.ontimize.jee.common.gui.SearchValue;
import com.ontimize.jee.server.dao.DefaultOntimizeDaoHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Lazy
@Service("CategoryAptitudeService")
public class CategoryAptitudeService implements ICategoryAptitudeService {

    @Autowired
    private CategoryAptitudeDao categoryAptitudeDao;
    @Autowired
    private DefaultOntimizeDaoHelper daoHelper;
    @Override
    public EntityResult categoryAptitudeQuery(Map<String, Object> keyMap, List<String> attrList) {
            List<Integer> categories = null;
            if (keyMap.get(categoryAptitudeDao.ATTR_APTITUDE_ID) != null) {
                Map<String, Object> keys = new HashMap<>();
                List<String> attr = new ArrayList<>();
                attr.add(categoryAptitudeDao.ATTR_CATEGORY_ID);
                keys.put(categoryAptitudeDao.ATTR_APTITUDE_ID, keyMap.get(categoryAptitudeDao.ATTR_APTITUDE_ID));
                EntityResult categoriesRelations = this.daoHelper.query(categoryAptitudeDao, keys, attr);
                if (categoriesRelations.isWrong()) {
                    return categoriesRelations;
                }
                if (!categoriesRelations.isEmpty()) {
                    categories = new ArrayList<>();
                    for (int i = 0; i < categoriesRelations.calculateRecordNumber(); i++) {
                        categories.add((Integer) categoriesRelations.getRecordValues(i).get(categoryAptitudeDao.ATTR_CATEGORY_ID));
                    }
                }
            }
            if (categories != null) {
                keyMap.put(categoryAptitudeDao.ATTR_CATEGORY_ID, new SearchValue(SearchValue.NOT_IN, categories));
            }
            return this.daoHelper.query(categoryAptitudeDao, keyMap, attrList);
    }

    @Override
    public EntityResult allCategoryAptitudeQuery(Map<Object, String> keyMap, List<String> attrList) {
        return this.daoHelper.query(categoryAptitudeDao, keyMap, attrList);
    }
}
