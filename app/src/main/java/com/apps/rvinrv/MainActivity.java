package com.apps.rvinrv;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.apps.rvinrv.adapter.ItemAdapter;
import com.apps.rvinrv.model.ModelItem;
import com.apps.rvinrv.model.SubModelItem;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RecyclerView rvItem = findViewById(R.id.rv_item);
        LinearLayoutManager layoutManager = new LinearLayoutManager(MainActivity.this);
        ItemAdapter itemAdapter = new ItemAdapter(buildItemList());
        rvItem.setAdapter(itemAdapter);
        rvItem.setLayoutManager(layoutManager);
    }

    private List<ModelItem> buildItemList() {
        List<ModelItem> itemList = new ArrayList<>();
        for (int i=0; i<10; i++) {
            ModelItem item = new ModelItem("Item "+i, buildSubItemList());
            itemList.add(item);
        }
        return itemList;
    }

    private List<SubModelItem> buildSubItemList() {
        List<SubModelItem> subItemList = new ArrayList<>();
        for (int i=0; i<3; i++) {
            SubModelItem subItem = new SubModelItem("Sub Item "+i, "Description "+i);
            subItemList.add(subItem);
        }
        return subItemList;
    }
}