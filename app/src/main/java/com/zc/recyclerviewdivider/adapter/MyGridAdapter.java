package com.zc.recyclerviewdivider.adapter;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.zc.recyclerviewdivider.R;

import java.util.List;

import butterknife.Bind;
import butterknife.ButterKnife;

/**
 * Created by zc on 2018/9/4.
 */

public class MyGridAdapter extends RecyclerView.Adapter {
    private List<Integer> mData;

    public MyGridAdapter(List<Integer> mData) {
        this.mData = mData;
    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        //网格Item
        View view = inflater.inflate(R.layout.item_rv_grid, parent, false);
        return new ItemViewHolder(view);
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {
        ItemViewHolder itemHolder = (ItemViewHolder) holder;

    }

    @Override
    public int getItemCount() {
        return mData.size();
    }

    class ItemViewHolder extends RecyclerView.ViewHolder {
        @Bind(R.id.iv)
        ImageView iv;

        public ItemViewHolder(View itemView) {
            super(itemView);
            ButterKnife.bind(this,itemView);
        }
    }
}
