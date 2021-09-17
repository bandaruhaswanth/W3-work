/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.magezinecommandpattern;

/**
 *
 * @author Mohit Computers
 */
public class EntertainmentTrend implements Command{
    EntertainmentMagazine entmagazine;
    public EntertainmentTrend(EntertainmentMagazine entmagazine){
        this.entmagazine=entmagazine;
    }
    @Override
    public void execute() {
        entmagazine.Trending();
     }
}
