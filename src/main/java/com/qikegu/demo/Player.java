package com.qikegu.demo;

public class Player {

    Weapon weapon;

    // weapon 被注入进来
    Player(Weapon weapon){
        this.weapon = weapon;

    }

    public void attack() {
        weapon.attack();
    }

    public void setWeapon(Weapon weapon){
        this.weapon = weapon;
    }
}
