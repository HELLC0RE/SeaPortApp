package com.levshin.seaport;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import com.levshin.seaport.Entity.Income;
import com.levshin.seaport.Entity.RentIncome;
import com.levshin.seaport.Entity.SeaPort;
import com.levshin.seaport.Entity.ServiceIncome;

public class MainActivity extends AppCompatActivity {

    private TextView output;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        output = findViewById(R.id.output);

        // Создание объектов доходов
        Income rentIncome = new RentIncome(170000);
        Income serviceIncome = new ServiceIncome(125, 3500);

        // Создание объекта морского порта
        Income[] incomes = {rentIncome, serviceIncome};
        SeaPort seaPort = new SeaPort(incomes);

        // Расчет и вывод выручки порта
        displayRevenue(seaPort.calculateTotalRevenue());
    }

    private void displayRevenue(float revenue) {
        output.setText("Выручка морского порта за месяц: " + revenue + " монет");
    }
}