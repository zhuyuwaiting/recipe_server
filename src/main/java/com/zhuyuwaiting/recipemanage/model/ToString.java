package com.zhuyuwaiting.recipemanage.model;



import org.apache.commons.lang3.builder.ToStringBuilder;

import java.io.Serializable;


public class ToString implements Serializable {

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }
}
