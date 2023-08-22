package org.designpatterns;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {

        System.out.println( "Let's Start Snake and ladder" );

        SnakeLadderGame snakeLadderGame = new SnakeLadderGame();
        snakeLadderGame.init();
        snakeLadderGame.startGame();
    }
}
