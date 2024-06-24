/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.pbo_pertemuan11_interface;

/**
 *
 * @author A-2
 */
public class Mobil {

    private final String merek;
    private final String model;

    public Mobil(String merek, String model) {
        this.merek = merek;
        this.model = model;
    }

    public String getMerek() {
        return merek;
    }

    public String getModel() {
        return model;
    }

    public void info() {
        System.out.println("Mobil: " + merek + " " + model);
    }
}
