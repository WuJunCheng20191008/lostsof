package com.demon.log4jprofiles.entity;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class ApplicationProperties {

    @Value("${logging.level.com.demon.log4jprofiles}")
    private String log4jprofiles;

    public String getLog4jprofiles() {
        return log4jprofiles;
    }

    public void setLog4jprofiles(String log4jprofiles) {
        this.log4jprofiles = log4jprofiles;
    }

    @Override
    public String toString() {
        return "ApplicationProperties{" +
                "log4jprofiles='" + log4jprofiles + '\'' +
                '}';
    }
}
