package com.example.gridlayout;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    List<Book> lstBook;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lstBook = new ArrayList<>();
        lstBook.add(new Book("Hello1","CategoryBook1","Description Book1",R.drawable.burger));
        lstBook.add(new Book("Hello2","CategoryBook2","Description Book2",R.drawable.coffee));
        lstBook.add(new Book("Hello3","CategoryBook3","Description Book3",R.drawable.burger));
        lstBook.add(new Book("Hello4","CategoryBook4","Description Book4",R.drawable.coffee));
        lstBook.add(new Book("Hello5","CategoryBook5","Description Book5",R.drawable.burger));
        lstBook.add(new Book("Hello6","CategoryBook6","Description Book6",R.drawable.coffee));
        lstBook.add(new Book("Hello7","CategoryBook7","Description Book7",R.drawable.burger));
        lstBook.add(new Book("Hello8","CategoryBook8","Description Book8",R.drawable.coffee));
        lstBook.add(new Book("Hello9","CategoryBook9","Description Book9",R.drawable.burger));
        lstBook.add(new Book("Hello10","CategoryBook10","Description Book10",R.drawable.coffee));
        lstBook.add(new Book("Hello11","CategoryBook11","Description Book11",R.drawable.burger));
        lstBook.add(new Book("Hello12","CategoryBook12","Description Book12",R.drawable.coffee));

        RecyclerView myrv = (RecyclerView) findViewById(R.id.recycler_view_id);
        RecyclerviewAdapter myadapter = new RecyclerviewAdapter(this,lstBook);
        myrv.setLayoutManager(new GridLayoutManager(this,2));
        myrv.setAdapter(myadapter);

    }
}
