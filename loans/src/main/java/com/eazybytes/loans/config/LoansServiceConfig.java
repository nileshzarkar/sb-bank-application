package com.eazybytes.loans.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Configuration
@ConfigurationProperties(prefix = "loans")
@Getter @Setter @ToString
public class LoansServiceConfig {
    private String msg;
}
