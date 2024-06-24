package com.example.elasticsearch_demo.model.enum_model;

public enum GenderEnum {
    MALE(0), FEMALE(1);
    public final int value;
    GenderEnum(int i){
        value = i;
    }
}
