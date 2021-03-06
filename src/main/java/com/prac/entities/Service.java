package com.prac.entities;

import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * Created by Srikanth on 11/20/2016.
 */
@Entity
public class Service {
    @Id
    private int serviceId;

    private String serviceName;

    private String serviceStatus;

    private int pId;

    private int automatedTestCases;

    private int expectedToAutomate;


    public int getAutomatedTestCases() {
        return automatedTestCases;
    }

    public void setAutomatedTestCases(int automatedTestCases) {
        this.automatedTestCases = automatedTestCases;
    }

    public int getExpectedToAutomate() {
        return expectedToAutomate;
    }

    public void setExpectedToAutomate(int expecteToAutomate) {
        this.expectedToAutomate = expecteToAutomate;
    }


    public int getServiceId() {
        return serviceId;
    }

    public void setServiceId(int serviceId) {
        this.serviceId = serviceId;
    }

    public String getServiceName() {
        return serviceName;
    }

    public void setServiceName(String serviceName) {
        this.serviceName = serviceName;
    }

    public String getServiceStatus() {
        return serviceStatus;
    }

    public void setServiceStatus(String serviceStatus) {
        this.serviceStatus = serviceStatus;
    }

    public int getProductId() {
        return pId;
    }

    public void setProductId(int pId) {
        this.pId = pId;
    }
}
