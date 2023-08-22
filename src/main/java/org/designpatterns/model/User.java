package org.designpatterns.model;

import org.designpatterns.Utils.IdGenerator;

public class User {
    String name;
    Integer userId;

    Integer pos;

    public User(String name) {
        this.name = name;
        this.userId = IdGenerator.getId();
        this.pos = 1;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getPos() {
        return pos;
    }

    public void setPos(Integer newPos) {
        pos = newPos;
    }
}
