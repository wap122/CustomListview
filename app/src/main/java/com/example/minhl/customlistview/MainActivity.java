package com.example.minhl.customlistview;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

import model.Contact;
import model.CustemAdapterNew;

public class MainActivity extends AppCompatActivity {

    private ListView lvContact;
    private ArrayList<Contact> arrayContact = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initWidget();
        lvContact = (ListView) findViewById(R.id.lv_contact);

        lvContact.setAdapter(new CustemAdapterNew(this, arrayContact));
//        lvContact.setOnItemClickListener(new AdapterView.OnItemClickListener() {
//            @Override
//            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
//                Toast.makeText(MainActivity.this, String.valueOf(arrayContact.get(position)), Toast.LENGTH_SHORT).show();
//            }
//        });
    }

    public void initWidget() {

        Contact contact1 = new Contact("Trương Đình Chiến", "0988 933 xxx", Color.RED);
        Contact contact2 = new Contact("Võ Văn Tá", "01667 585 545", Color.GREEN);
        Contact contact3 = new Contact("Lê Tấn Dũng", "0918 033 033", Color.GRAY);
        Contact contact4 = new Contact("Trương Quang Lâm", "0978 102 102", Color.YELLOW);
//        Contact contact5 = new Contact("Võ Duy Tính", "01667 333 000", Color.BLACK);
//        Contact contact6 = new Contact("Trần Văn Toàn", "08 999 321", Color.BLUE);
//        Contact contact7 = new Contact("Lại Thế Quang", "01222 331 331", Color.CYAN);
//        Contact contact8 = new Contact("Võ Duy Tính", "01667 333 000", Color.BLACK);
//        Contact contact9 = new Contact("Trần Văn Toàn", "08 999 321", Color.BLUE);
//        Contact contact10 = new Contact("Lại Thế Quang", "01222 331 331", Color.CYAN);
        arrayContact.add(contact1);
        arrayContact.add(contact2);
        arrayContact.add(contact3);
        arrayContact.add(contact4);
//        arrayContact.add(contact5);
//        arrayContact.add(contact6);
//        arrayContact.add(contact8);
//        arrayContact.add(contact9);
//        arrayContact.add(contact10);
    }
}
