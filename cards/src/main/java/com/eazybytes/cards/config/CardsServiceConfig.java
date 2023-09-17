package com.eazybytes.cards.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Configuration
@ConfigurationProperties(prefix = "cards")
@Getter @Setter @ToString
public class CardsServiceConfig {
    private String msg;
}
