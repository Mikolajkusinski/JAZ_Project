package com.jaz.JazProject.entities;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class IdHolder {
    int id;

    public IdHolder(){}

    public IdHolder(int id) {
        this.id = id;
    }
}
