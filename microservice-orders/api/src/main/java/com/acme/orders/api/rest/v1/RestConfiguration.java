package com.microservice.orders.api.rest.v1;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.dropwizard.Configuration;
import io.dropwizard.db.DataSourceFactory;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

public class RestConfiguration extends Configuration {

    @Valid
    @NotNull
    @JsonProperty("database")
    private DataSourceFactory database = new DataSourceFactory();

    @NotNull
    @JsonProperty("customersUrl")
    private String customersUrl;

    @NotNull
    @JsonProperty("catalogueUrl")
    private String catalogueUrl;

    @NotNull
    @JsonProperty("paymentsUrl")
    private String paymentsUrl;

    @NotNull
    @JsonProperty("authPublicKey")
    private String authPublicKey;

    public DataSourceFactory getDataSourceFactory() {
        return database;
    }

    public String getCustomersUrl() {
        return customersUrl;
    }

    public String getCatalogueUrl() {
        return catalogueUrl;
    }

    public String getPaymentsUrl() {
        return paymentsUrl;
    }

    public String getAuthPublicKey() {
        return authPublicKey;
    }
}
