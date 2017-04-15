package com.indivoid.scriptobot;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ListView;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

public class MainActivity extends AppCompatActivity {

//    Long ddd = System.currentTimeMillis();
//
//    String dt = sdf.format(ddd);

//    Date date = new Date();
//    String dt = date.toString();

    SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
    Date date = new Date();
    String dt = sdf.format(date);

    private ListView listView;
    private TransactionAdapter transactionAdapter;
    List <Transactions> data = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        List <Transactions> adapterData = getDataList();
        transactionAdapter = new TransactionAdapter(MainActivity.this, adapterData);

        listView = (ListView)findViewById(R.id.listview);
        listView.setAdapter(transactionAdapter);

    }

    private List<Transactions> getDataList() {

        data.add(new Transactions(dt,"Telephone", 20000));
        data.add(new Transactions(dt, "Car", 200000));
        data.add(new Transactions(dt, "Notebook", 60000));
        data.add(new Transactions(dt, "Jeans", 10000));
        data.add(new Transactions(dt, "Girl", 80000));

        return data;

    }

}
