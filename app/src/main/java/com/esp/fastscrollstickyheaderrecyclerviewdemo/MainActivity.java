package com.esp.fastscrollstickyheaderrecyclerviewdemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.timehop.stickyheadersrecyclerview.StickyRecyclerHeadersDecoration;

import java.util.ArrayList;
import java.util.List;

import in.myinnos.alphabetsindexfastscrollrecycler.IndexFastScrollRecyclerView;

public class MainActivity extends AppCompatActivity {

    private IndexFastScrollRecyclerView recyclerView;
    private LinearLayoutManager layoutManager;
    private ContactAdapter adapter;
    private List<Contact> contactList = new ArrayList<>();
    private StickyRecyclerHeadersDecoration stickyRecyclerHeadersDecoration;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initViews();
        fetchData();
    }

    private void initViews() {
        recyclerView = findViewById(R.id.recycler_view);
        layoutManager = new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false);
        adapter = new ContactAdapter(this, contactList);
        stickyRecyclerHeadersDecoration = new StickyRecyclerHeadersDecoration(adapter);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(adapter);
        recyclerView.addItemDecoration(stickyRecyclerHeadersDecoration);
        recyclerView.addItemDecoration(new DividerDecoration(this));
    }

    private void fetchData() {
        contactList.add(new Contact("Anh Toan", "0969696969"));
        contactList.add(new Contact("Anh Cong", "0969696969"));
        contactList.add(new Contact("Anh Quach", "0969696969"));
        contactList.add(new Contact("Anh An", "0969696969"));
        contactList.add(new Contact("Anh Hung", "0969696969"));
        contactList.add(new Contact("Anh Thai", "0969696969"));
        contactList.add(new Contact("Chi Linh", "0969696969"));
        contactList.add(new Contact("Chi Hoa", "0969696969"));
        contactList.add(new Contact("Chi Thao", "0969696969"));
        contactList.add(new Contact("Chi Dao", "0969696969"));
        contactList.add(new Contact("Binh", "0969696969"));
        contactList.add(new Contact("Binh A2", "0969696969"));
        contactList.add(new Contact("Binh CNTT", "0969696969"));
        contactList.add(new Contact("Bao", "0969696969"));
        contactList.add(new Contact("Ban", "0969696969"));
        contactList.add(new Contact("Ban A2", "0969696969"));
        contactList.add(new Contact("Be", "0969696969"));
        contactList.add(new Contact("Bibi", "0969696969"));
        contactList.add(new Contact("Chim Se Di Nang", "0969696969"));
        contactList.add(new Contact("Charlie Puth", "0969696969"));
        contactList.add(new Contact("Cong", "0969696969"));
        contactList.add(new Contact("Dao", "0969696969"));
        contactList.add(new Contact("Duyen", "0969696969"));
        contactList.add(new Contact("Dang", "0969696969"));
        contactList.add(new Contact("Hanh", "0969696969"));
        contactList.add(new Contact("Hong", "0969696969"));
        contactList.add(new Contact("Hoa", "0969696969"));
        contactList.add(new Contact("Hien", "0969696969"));
        contactList.add(new Contact("Hung", "0969696969"));
        contactList.add(new Contact("Hoang", "0969696969"));
        contactList.add(new Contact("Hang", "0969696969"));
        contactList.add(new Contact("Hiep", "0969696969"));
        contactList.add(new Contact("Huong", "0969696969"));
        contactList.add(new Contact("Hai", "0969696969"));
        contactList.add(new Contact("Huyen", "0969696969"));
        contactList.add(new Contact("Linh", "0969696969"));
        contactList.add(new Contact("Loan", "0969696969"));
        contactList.add(new Contact("Ly", "0969696969"));
        contactList.add(new Contact("Nhung", "0969696969"));
        contactList.add(new Contact("Nam", "0969696969"));
        contactList.add(new Contact("Manh", "0969696969"));
        contactList.add(new Contact("Minh", "0969696969"));
        contactList.add(new Contact("Minh", "0969696969"));
        contactList.add(new Contact("Me", "0969696969"));
        contactList.add(new Contact("Mai", "0969696969"));
        contactList.add(new Contact("Phuong", "0969696969"));
        contactList.add(new Contact("Phong", "0969696969"));
        contactList.add(new Contact("Quyen", "0969696969"));
        contactList.add(new Contact("Quyet", "0969696969"));
        contactList.add(new Contact("Son", "0969696969"));
        contactList.add(new Contact("Thai", "0969696969"));
        contactList.add(new Contact("Tam", "0969696969"));
        contactList.add(new Contact("Tung", "0969696969"));
        contactList.add(new Contact("Viet", "0969696969"));
        contactList.add(new Contact("Van", "0969696969"));
        adapter.notifyDataSetChanged();
    }
}
