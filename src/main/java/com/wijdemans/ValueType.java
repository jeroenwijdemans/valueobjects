package com.wijdemans;

import java.io.Serializable;

public class ValueType<T extends Serializable> implements Serializable {

    private static final long serialVersionUID = 1002L;

    private final T value;

    public ValueType(T value) {
        if (value == null) {
            throw new IllegalArgumentException("Value may not be null");
        }
        this.value = value;
    }

    public T getValue() {
        return value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ValueType<?> valueType = (ValueType<?>) o;
        if (!value.equals(valueType.value)) return false;
        return true;
    }

    @Override
    public int hashCode() {
        return value.hashCode();
    }

    @Override
    public String toString() {
        return value.toString();
    }
}
