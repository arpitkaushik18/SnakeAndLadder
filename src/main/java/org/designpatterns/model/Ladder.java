package org.designpatterns.model;

public class Ladder {

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

    public Ladder(Integer start, Integer end) {
        this.start = start;
        this.end = end;
    }
}
