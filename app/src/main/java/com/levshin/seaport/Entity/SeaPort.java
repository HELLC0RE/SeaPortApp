package com.levshin.seaport.Entity;

import com.levshin.seaport.Entity.Income;

public class SeaPort {
    private Income[] incomes;

    public SeaPort(Income[] incomes) {
        this.incomes = incomes;
    }
    public float calculateTotalRevenue() {
        float totalRevenue = 0;
        for (Income income : incomes) {
            totalRevenue += income.calculateIncome();
        }
        return totalRevenue;
    }
}
