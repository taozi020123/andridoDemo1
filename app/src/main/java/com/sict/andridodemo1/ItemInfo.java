package com.sict.andridodemo1;

import java.io.Serializable;

public class ItemInfo implements Serializable {
   private int life;
   private int attack;
   private int speed;
   private String name;
    public ItemInfo(int life,int attack,int speed,String name){
        this.life=life;
        this.attack=attack;
        this.speed=speed;
        this.name=name;
    }
    public int getLife() { return life; }

    public void setLife(int life) { this.life = life;}

    public int getAttack() { return attack; }
    public void setAttack(int attack) { this.attack = attack; }
    public int getSpeed() { return speed; }
    public void setSpeed(int speed) { this.speed = speed; }
    public String getName() { return name; }
    public void setName(String name) { this.name = name;}
}
