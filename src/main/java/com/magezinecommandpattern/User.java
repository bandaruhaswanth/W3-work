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
public class User {
    public static void main(String[] args) {
        Pages pages = new Pages();
        FashionMagazine fmagazine = new FashionMagazine();
        FitnessMagazine fitmag = new FitnessMagazine();
        EntertainmentMagazine entmagazine = new EntertainmentMagazine();
        
        pages.setCommand(new FashionTrends(fmagazine));
        pages.turnpage();
        
        pages.setCommand(new FitnessTrend(fitmag));
        pages.turnpage();
        
        pages.setCommand(new EntertainmentTrend(entmagazine));
        pages.turnpage();
    }
    
}
