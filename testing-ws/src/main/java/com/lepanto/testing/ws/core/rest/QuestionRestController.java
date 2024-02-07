package com.lepanto.testing.ws.core.rest;

import com.lepanto.testing.api.core.service.IQuestionService;
import com.ontimize.jee.server.rest.ORestController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/questions")
public class QuestionRestController extends ORestController<IQuestionService> {

    @Autowired
    IQuestionService iQuestionService;

    @Override
    public IQuestionService getService() {
        return this.iQuestionService;
    }


}
