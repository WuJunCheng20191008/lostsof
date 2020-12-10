package com.demon.application_properties.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class PersonProperties {
    @Value("${com.demon.name}")
    private String name;
    @Value("${com.demon.password}")
    private Integer password;
    @Value("${com.demon.message}")
    private String message;
    @Value("${com.demon.value}")
    private String value;
    @Value("${com.demon.valueint}")
    private Integer valueint;

    @Override
    public String toString() {
        return "PersonProperties{" +
                "name='" + name + '\'' +
                ", password=" + password +
                ", message='" + message + '\'' +
                ", value='" + value + '\'' +
                ", valueint=" + valueint +
                '}';
    }

    public Integer getValueint() {
        return valueint;
    }

    public void setValueint(Integer valueint) {
        this.valueint = valueint;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public void setPassword(Integer password) {
        this.password = password;
    }

    public Integer getPassword() {
        return password;
    }

}
