package com.example.couchbasesample;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.couchbase.config.AbstractCouchbaseConfiguration;

import java.util.Arrays;
import java.util.List;

@Configuration
public class CouchBaseConfig extends AbstractCouchbaseConfiguration {


    @Override
    public String getConnectionString() {
        return "127.0.0.1" ;
    }

    @Override
    public String getUserName() {
        return "Admin";
    }

    @Override
    public String getPassword() {
        return "password";
    }

    @Override
    public String getBucketName() {
        return "couchbasedb";
    }


}
