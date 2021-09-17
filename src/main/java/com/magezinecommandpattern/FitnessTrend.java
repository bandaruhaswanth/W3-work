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
public class FitnessTrend implements Command{
    FitnessMagazine fitmagazine;
    public FitnessTrend(FitnessMagazine fitmagazine){
        this.fitmagazine=fitmagazine;
    }
    @Override
    public void execute() {
        fitmagazine.Trending();
     }
}
