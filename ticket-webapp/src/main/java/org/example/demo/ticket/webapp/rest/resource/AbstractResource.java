package org.example.demo.ticket.webapp.rest.resource;

import org.example.demo.ticket.business.impl.IManagerFactory;

public abstract class AbstractResource {

    private static IManagerFactory managerFactory;

    protected static IManagerFactory getManagerFactory() {
        return managerFactory;
    }

    public static void setManagerFactory(IManagerFactory managerFactory) {
        AbstractResource.managerFactory = managerFactory;
    }
}
