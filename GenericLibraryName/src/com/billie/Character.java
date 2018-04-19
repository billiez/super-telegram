/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.billie;
import java.util.Random;

/**
 *
 * @author billie
 */
public class Character {
    private static final Random RAND = new Random();
    
    private final String name;
    private final int    baseInitiative;
    private       int    rolledInitiative;
    
    public Character(String name, int initiative) {
        this.name             = name;
        this.baseInitiative   = initiative;
        this.rolledInitiative = this.baseInitiative;
    }
    
    public int rollInitiative() {
        rolledInitiative = this.baseInitiative + RAND.nextInt(20) + 1;
        return rolledInitiative;
    }
    
    public int getRolledInitiative() {
        return rolledInitiative;
    }
    
    @Override
    public String toString() {
        return  "Name:        " + name             + "\n" +
                "Base init:   " + baseInitiative   + "\n" +
                "Rolled init: " + rolledInitiative;
    }
}
