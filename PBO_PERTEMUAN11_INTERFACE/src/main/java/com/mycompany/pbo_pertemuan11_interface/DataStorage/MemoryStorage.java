/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.pbo_pertemuan11_interface.DataStorage;

import java.util.ArrayList;

/**
 *
 * @author A-2
 */
    // Implementasi MemoryStorage menggunakan ArrayList

    public class MemoryStorage implements DataStorage {

        private ArrayList<String> data;

        public MemoryStorage() {
            this.data = new ArrayList<>();
        }

        @Override
        public void writeData(String data) {
            this.data.add(data);
        }

        @Override
        public String readData() {
            StringBuilder sb = new StringBuilder();
            for (String item : this.data) {
                sb.append(item);
            }
            return sb.toString();
        }
    }