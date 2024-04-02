package com.example.designpatterns.builderpattern;

public class App {
    
    public static void main(String[] args) {
        Computer pc = Computer.Builder()
                         .RAM("16 GB")
                         .cpu("intel i5")
                         .storage("500 GB")
                         .build();
        
    }
}