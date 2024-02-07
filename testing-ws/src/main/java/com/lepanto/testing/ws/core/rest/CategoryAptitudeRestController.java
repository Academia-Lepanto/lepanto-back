package com.lepanto.testing.ws.core.rest;

import com.lepanto.testing.api.core.service.ICategoryAptitudeService;
import com.ontimize.jee.server.rest.ORestController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = {
    "http://www.psicotecnicos-admin.academialepanto.com"}, allowCredentials = "true")
@RestController
@RequestMapping("/categoryAptitude")
public class CategoryAptitudeRestController extends ORestController<ICategoryAptitudeService> {

  @Autowired
  ICategoryAptitudeService categoryAptitudeService;

  @Override
  public ICategoryAptitudeService getService() {
    return this.categoryAptitudeService;
  }


}

