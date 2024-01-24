package com.levshin.seaport.Entity;

public abstract class Income {
    protected String name;

    public Income(String name) {
        this.name = name;
    }

    public abstract float calculateIncome();

}
