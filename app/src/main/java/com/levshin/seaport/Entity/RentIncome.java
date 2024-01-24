package com.levshin.seaport.Entity;

import com.levshin.seaport.Entity.Income;

public class RentIncome extends Income {
        private float rentalAmount;
        public RentIncome(float rentalAmount) {
            super("Аренда площадей порта");
            this.rentalAmount = rentalAmount;
        }
        @Override
        public float calculateIncome() {
            return rentalAmount;
        }
}
