package com.lepanto.testing.ws.core.rest;

import com.lepanto.testing.api.core.service.IRoleService;
import com.lepanto.testing.api.core.service.ISubscriptionService;
import com.ontimize.jee.server.rest.ORestController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/subscription")
public class SubscriptionRestController extends ORestController<ISubscriptionService> {

    @Autowired
    private ISubscriptionService subscriptionService;

    @Override
    public ISubscriptionService getService() {
        return this.subscriptionService;
    }


}