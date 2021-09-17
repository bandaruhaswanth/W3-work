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
public class FashionTrends implements Command {

    FashionMagazine fmagazine;
    public FashionTrends(FashionMagazine fmagazine){
        this.fmagazine=fmagazine;
    }
    @Override
    public void execute() {
        fmagazine.Trending();
     }
    
}
