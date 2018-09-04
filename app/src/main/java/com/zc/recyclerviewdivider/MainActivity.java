package com.zc.recyclerviewdivider;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.zc.recyclerviewdivider.adapter.MyAdapter;
import com.zc.recyclerviewdivider.divider.SpaceItemDecoration;
import com.zc.recyclerviewdivider.util.DisplayUtil;
import com.zc.recyclerviewdivider.util.InitDataUtil;

import butterknife.Bind;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity {

    @Bind(R.id.rv)
    RecyclerView rv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
        initRV();
    }

    public void initRV() {
        rv.setLayoutManager(new GridLayoutManager(this, 6, LinearLayoutManager.VERTICAL, false));
//        rv.addItemDecoration(new DividerGridItemDecoration(this));//添加网格布局分割线
//        rv.addItemDecoration(new GridSpanDecoration(DisplayUtil.dip2px(this,10)));//添加网格布局空白间隔（方法一：有点小bug）
        rv.addItemDecoration(new SpaceItemDecoration(DisplayUtil.dip2px(this, 10), 0, true, SpaceItemDecoration.GRIDLAYOUT));//添加网格布局空白间隔(方法二：比较完美)

        rv.setAdapter(new MyAdapter(InitDataUtil.getFData()));
    }
}
