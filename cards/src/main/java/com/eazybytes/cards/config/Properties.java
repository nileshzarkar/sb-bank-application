package com.eazybytes.cards.config;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class Properties {
    private String msg;
    public Properties(String msg) {
        this.msg = msg;
    }
}