package com.wijdemans;


import java.util.UUID;

public class Id extends ValueType<String> {

    private static final long serialVersionUID = 1000L;

    public Id(String value) {
        super(value);
    }

    public static Id generate() {
        return new Id(UUID.randomUUID().toString());
    }
}
