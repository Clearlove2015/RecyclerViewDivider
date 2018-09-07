package com.zc.recyclerviewdivider;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import com.zc.recyclerviewdivider.activity.GridActivity;
import com.zc.recyclerviewdivider.activity.ListActivity;

import butterknife.Bind;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity {

    @Bind(R.id.btn_list)
    Button btnList;
    @Bind(R.id.btn_grid)
    Button btnGrid;
    @Bind(R.id.btn_staggered)
    Button btnStaggered;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
    }

    @OnClick({R.id.btn_list, R.id.btn_grid, R.id.btn_staggered})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.btn_list:
                startActivity(new Intent(MainActivity.this, ListActivity.class));
                break;
            case R.id.btn_grid:
                startActivity(new Intent(MainActivity.this, GridActivity.class));
                break;
            case R.id.btn_staggered:
                break;
        }
    }
}
