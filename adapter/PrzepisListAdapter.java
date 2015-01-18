package com.example.student7.cookbook.adapter;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

import org.androidannotations.annotations.EBean;
import org.androidannotations.annotations.RootContext;

import java.util.ArrayList;
import java.util.List;

import com.example.student7.cookbook.data.Przepis;
import com.example.student7.cookbook.data.CookBook;
import com.example.student7.cookbook.itemView.PrzepisItemView;
import com.example.student7.cookbook.itemView.PrzepisItemView_;

@EBean
public class PrzepisListAdapter extends BaseAdapter {

    @RootContext
    Context context;

    List<Przepis> records = new ArrayList<Przepis>();

    public PrzepisListAdapter() {
    }

    @Override
    public int getCount() {
        return records.size();
    }

    @Override
    public Przepis getItem(int i) {
        return records.get(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        PrzepisItemView przepisItemView;
        if (convertView == null) {
            przepisItemView = PrzepisItemView_.build(context);
        } else {
            przepisItemView = (PrzepisItemView) convertView;
        }

        przepisItemView.bind(getItem(position));

        return przepisItemView;
    }

    public void update(CookBook cookBook) {
        records.clear();
        records.addAll(cookBook.records);
        notifyDataSetChanged();
    }

}