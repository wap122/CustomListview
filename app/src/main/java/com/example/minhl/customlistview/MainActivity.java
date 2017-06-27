package com.example.minhl.customlistview;

import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.app.AppCompatCallback;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

import model.Contact;
import model.CustemAdapterNew;

public class MainActivity extends AppCompatActivity implements OnCustomEventListener {

    private ListView lvContact;
    private ArrayList<Contact> arrayContact = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initWidget();
        lvContact = (ListView) findViewById(R.id.lv_contact);

        lvContact.setAdapter(new CustemAdapterNew(this, this, arrayContact));
        lvContact.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(MainActivity.this, "Chạm vào Name để finish activity", Toast.LENGTH_SHORT).show();
            }
        });
    }

    @Override
    public void onEvent() {
        finish();
    }

    public void initWidget() {

        Contact contact1 = new Contact("Le Van Minh", "098123xxx", Color.RED);
        Contact contact2 = new Contact("Võ Văn Tá", "01667 585 545", Color.GREEN);
        Contact contact3 = new Contact("Lê Tấn Dũng", "0918 033 033", Color.GRAY);
        Contact contact4 = new Contact("Trương Quang Lâm", "0978 102 102", Color.YELLOW);
        Contact contact5 = new Contact("Võ Duy Tính", "01667 333 000", Color.BLACK);
        Contact contact6 = new Contact("Trần Văn Toàn", "08 999 321", Color.BLUE);
        Contact contact7 = new Contact("Lại Thế Quang", "01222 331 331", Color.CYAN);
        Contact contact8 = new Contact("Võ Duy Tính", "01667 333 000", Color.BLACK);
        Contact contact9 = new Contact("Trần Văn Toàn", "08 999 321", Color.BLUE);
        Contact contact10 = new Contact("Lại Thế Quang", "01222 331 331", Color.CYAN);
        arrayContact.add(contact1);
        arrayContact.add(contact2);
        arrayContact.add(contact3);
        arrayContact.add(contact4);
        arrayContact.add(contact5);
        arrayContact.add(contact6);
        arrayContact.add(contact8);
        arrayContact.add(contact9);
        arrayContact.add(contact10);
    }
}
