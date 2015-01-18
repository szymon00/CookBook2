package com.example.student7.cookbook.itemView;


import android.content.Context;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.example.student7.cookbook.data.Przepis;

import org.androidannotations.annotations.EViewGroup;
import org.androidannotations.annotations.ViewById;

import com.example.student7.cookbook.R;
import com.example.student7.cookbook.data.Przepis;

@EViewGroup(R.layout.list_item)
public class PrzepisItemView extends RelativeLayout {

    @ViewById
    TextView title;

    @ViewById
    TextView introduction;

    @ViewById
    TextView ingredients;

    public PrzepisItemView(Context context) {
        super(context);
    }

    public void bind(Przepis przepis) {
        title.setText(przepis.title);
        introduction.setText(przepis.introduction);
        ingredients.setText(przepis.ingredients);
    }

}