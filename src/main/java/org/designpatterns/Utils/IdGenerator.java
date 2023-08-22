package org.designpatterns.Utils;

public class  IdGenerator {

    private static Integer id = 0;

    private IdGenerator(){
    }
    public static Integer getId(){
        id++;
        return id;
    }

}
