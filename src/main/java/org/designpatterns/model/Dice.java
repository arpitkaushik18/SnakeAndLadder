package org.designpatterns.model;

import java.util.concurrent.ThreadLocalRandom;

public class Dice {

    private Integer min;
    private Integer max;

    private Integer rollCount;

    public Dice(Integer min, Integer max) {
        this.min = min;
        this.max = max;
        this.rollCount = 1;
    }

    public Integer rollDice(){
        Integer curCount = 0;
        Integer totalVal = 0;
        while (curCount < rollCount){
            totalVal += ThreadLocalRandom.current().nextInt(min,max+1);
            curCount+=1;
        }
        return totalVal;
    }
}
