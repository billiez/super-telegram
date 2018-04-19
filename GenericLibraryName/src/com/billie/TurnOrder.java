/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.billie;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;

/**
 *
 * @author billie
 */
public class TurnOrder {
    public static List<? extends Character> sortForCombat(
            Collection<? extends Character> characters,
            Collection<? extends Character> enemies) {
        List<Character> output = 
                new ArrayList<>(characters.size() + enemies.size());
        
        output.addAll(characters);
        output.addAll(enemies);
        output.forEach(Character::rollInitiative);
        output.sort(Comparator
                .comparingInt(Character::getRolledInitiative).reversed());
        return output;
    }
    
    public static void main(String[] args) {
        List<Character> players = new ArrayList<>();
        List<Character> enemies = new ArrayList<>();
        players.add(new Character("Kenny", 5));
        players.add(new Character("Billie", 6));
        enemies.add(new Monster("Red the Terrible", 10));
        
        sortForCombat(players, enemies).forEach(System.out::println);
    }
}
