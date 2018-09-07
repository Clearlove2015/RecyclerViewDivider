package com.zc.recyclerviewdivider.activity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.zc.recyclerviewdivider.R;
import com.zc.recyclerviewdivider.adapter.MyListAdapter;
import com.zc.recyclerviewdivider.divider.SpaceItemDecoration;
import com.zc.recyclerviewdivider.util.DisplayUtil;
import com.zc.recyclerviewdivider.util.InitDataUtil;

import butterknife.Bind;
import butterknife.ButterKnife;

public class ListActivity extends AppCompatActivity {

    @Bind(R.id.rv)
    RecyclerView rv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);
        ButterKnife.bind(this);
        initRV();
    }

    public void initRV(){
        rv.setLayoutManager(new LinearLayoutManager(this));
        //添加线性布局空白间隔(比较完美)
        rv.addItemDecoration(new SpaceItemDecoration(DisplayUtil.dip2px(this,10),SpaceItemDecoration.LINEARLAYOUT));
        rv.setAdapter(new MyListAdapter(InitDataUtil.getFData()));
    }
}
