package com.example.designpatterns.builderpattern;

public class Computer {

    private final String RAM;
    private final String storage;
    private final String cpu;
    private final String gpu;

    private Computer(Builder builder) {
        this.RAM = builder.RAM;
        this.storage = builder.storage;
        this.cpu = builder.cpu;
        this.gpu = builder.gpu;
    }

    public String getRAM() {
        return this.RAM;
    }

    public String getStorage() {
        return this.storage;
    }

    public String getCpu() {
        return this.cpu;
    }

    public String getGpu() {
        return this.gpu;
    }


    public static class Builder {

        private String RAM;
        private String storage;
        private String cpu;
        private String gpu;

        public Builder() {
        }

        public Builder RAM(String RAM) {
            this.RAM = RAM;
            return this;
        }

        public Builder storage(String storage) {
            this.storage = storage;
            return this;
        }

        public Builder cpu(String cpu) {
            this.cpu = cpu;
            return this;
        }

        public Builder gpu(String gpu) {
            this.gpu = gpu;
            return this;
        }

        public Computer build() {
            return new Computer(this);
        }
    }
}