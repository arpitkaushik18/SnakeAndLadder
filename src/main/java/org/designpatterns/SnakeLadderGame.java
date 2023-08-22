package org.designpatterns;

import org.designpatterns.model.*;

import java.util.*;

public class SnakeLadderGame {

    public Deque<User> userList;
    public HashMap<Integer,Integer> snakeMap;
    public HashMap<Integer,Integer> ladderMap;
    public Board board;

    public Dice dice;

    public void init(){

        userList = new LinkedList<>();

        board = new Board(10);
        User user1 = new User("Ramesh");
        userList.add(user1);
        User user2 = new User("Suresh");
        userList.add(user2);


        Snake snake1 = new Snake(22,1);
        Snake snake2 = new Snake(45,12);
        Snake snake3 = new Snake(75,32);
        Snake snake4 = new Snake(99,2);

        snakeMap = new HashMap<>();
        snakeMap.put(snake1.getStart(),snake1.getEnd());
        snakeMap.put(snake2.getStart(),snake2.getEnd());
        snakeMap.put(snake3.getStart(),snake3.getEnd());
        snakeMap.put(snake4.getStart(),snake4.getEnd());

        Ladder ladder1 = new Ladder(4,25);
        Ladder ladder2 = new Ladder(5,42);
        Ladder ladder3 = new Ladder(11,32);
        Ladder ladder4 = new Ladder(54,82);

        ladderMap = new HashMap<>();
        ladderMap.put(ladder1.getStart(),ladder1.getEnd());
        ladderMap.put(ladder2.getStart(),ladder2.getEnd());
        ladderMap.put(ladder3.getStart(),ladder3.getEnd());
        ladderMap.put(ladder4.getStart(),ladder4.getEnd());

        dice = new Dice(1,6);

    }

    public String startGame(){

        boolean isWinner = false;
        while (!isWinner){

            User currentUser = userList.getFirst();
            userList.removeFirst();
            Integer pos = currentUser.getPos();
            System.out.println(" User name : " + currentUser.getName() + " current position is " + currentUser.getPos());
            Integer newPos = pos + dice.rollDice();

            pos = getNewPos(newPos);
            if(pos == board.getBoardSize()* board.getBoardSize()){
                System.out.println("Username " + currentUser.getName() + " Won the game.");
                return currentUser.getName();
            }
            currentUser.setPos(pos);
            System.out.println(" User name : " + currentUser.getName() + " current position after turn is " + currentUser.getPos());
            userList.addLast(currentUser);
        }
        return "tie";
    }

    private Integer getNewPos(Integer newPos) {
        if(newPos > board.getBoardSize()* board.getBoardSize()){
            return 0;
        }

        else if(snakeMap.containsKey(newPos)){
            System.out.println("Snake bite. position set to " + snakeMap.get(newPos) );
        }

        else if(ladderMap.containsKey(newPos)){
            System.out.println("Ladder got. position set to " + ladderMap.get(newPos) );
        }

        return newPos;

    }


}
