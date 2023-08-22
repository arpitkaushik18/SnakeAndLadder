package org.designpatterns.model;

public class Snake {

    private Integer start;
    private Integer end;

    public Integer getStart() {
        return start;
    }

    public void setStart(Integer start) {
        this.start = start;
    }

    public Integer getEnd() {
        return end;
    }

    public void setEnd(Integer end) {
        this.end = end;
    }

    public Snake(Integer start, Integer end) {
        this.start = start;
        this.end = end;
    }
}
