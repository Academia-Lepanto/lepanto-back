package com.lepanto.testing.model.core.dao;


import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Repository;

import com.ontimize.jee.server.dao.common.ConfigurationFile;
import com.ontimize.jee.server.dao.jdbc.OntimizeJdbcDaoSupport;


@Lazy
@Repository(value = "QuestionDao")
@ConfigurationFile(configurationFile = "dao/QuestionDao.xml", configurationFilePlaceholder = "dao/placeholders.properties")
public class QuestionDao extends OntimizeJdbcDaoSupport {

    public static final String question_code = "question_code";
    public static final String question = "question";

    public static final String aptitude = "aptitude";
    public static final String category = "category";
    public static final String images = "images";
    public static final String imageexplication = "imageexplication";
    public static final String answer1 = "answer1";
    public static final String answer2 = "answer2";
    public static final String answer3 = "answer3";
    public static final String answer4 = "answer4";

    public static final String answer1_correct = "answer1_correct";
    public static final String answer2_correct = "answer2_correct";
    public static final String answer3_correct = "answer3_correct";
    public static final String answer4_correct = "answer4_correct";

    public static final String imageanswer1 = "imageanswer1";
    public static final String imageanswer2 = "imageanswer2";
    public static final String imageanswer3 = "imageanswer3";
    public static final String imageanswer4 = "imageanswer4";

    public static final String SCHEMA = "db_schema";

}
