package com.lepanto.testing.ws.core.rest;

import com.lepanto.testing.api.core.service.IAptitudesService;
import com.ontimize.jee.server.rest.ORestController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/aptitudes")
public class AptitudesRestController extends ORestController<IAptitudesService> {

    @Autowired
    IAptitudesService aptitudesService;

    @Override
    public IAptitudesService getService() {
        return this.aptitudesService;
    }


}
