package com.fortis.inspection.entity;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

public class User implements Serializable {
    private static final long serialVersionUID = 4220515347228129741L;
    @Setter
    @Getter
    private Integer id;
    @Setter
    @Getter
    private String username;
    @Setter
    @Getter
    private Integer age;

    public User(Integer id, String username, Integer age) {
        this.id = id;
        this.username = username;
        this.age = age;
    }

    public User() {
    }


}
