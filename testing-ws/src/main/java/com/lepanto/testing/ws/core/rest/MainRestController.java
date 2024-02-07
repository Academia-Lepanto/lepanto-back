package com.lepanto.testing.ws.core.rest;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = {
    "http://www.psicotecnicos-admin.academialepanto.com"}, allowCredentials = "true")
@RestController
public class MainRestController {

  @RequestMapping(value = "/main", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
  public String main() {
    return "index";
  }

}
