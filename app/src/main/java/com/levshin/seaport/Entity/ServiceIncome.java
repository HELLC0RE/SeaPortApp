package com.levshin.seaport.Entity;

import com.levshin.seaport.Entity.Income;

public class ServiceIncome extends Income {
        private int numberOfShips;
        private float serviceCostPerShip;

        public ServiceIncome(int numberOfShips, float serviceCostPerShip) {
            super("Обслуживание морских судов");
            this.numberOfShips = numberOfShips;
            this.serviceCostPerShip = serviceCostPerShip;
        }
        @Override
        public float calculateIncome() {
            return numberOfShips * serviceCostPerShip;
        }
}
