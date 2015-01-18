package com.example.student7.cookbook;

import android.app.ProgressDialog;
import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.widget.ListView;
import android.widget.Toast;

import org.androidannotations.annotations.AfterViews;
import org.androidannotations.annotations.Bean;
import org.androidannotations.annotations.Click;
import org.androidannotations.annotations.EActivity;
import org.androidannotations.annotations.Extra;
import org.androidannotations.annotations.ItemClick;
import org.androidannotations.annotations.NonConfigurationInstance;
import org.androidannotations.annotations.OptionsItem;
import org.androidannotations.annotations.OptionsMenu;
import org.androidannotations.annotations.ViewById;

import com.example.student7.cookbook.adapter.PrzepisListAdapter;
import com.example.student7.cookbook.data.Przepis;
import com.example.student7.cookbook.data.CookBook;
import com.example.student7.cookbook.data.User;

import java.io.Serializable;

@EActivity(R.layout.activity_przepisy)
@OptionsMenu(R.menu.przepisy)
public class PrzepisyActivity extends ActionBarActivity {

    @ViewById
    ListView list;

    @Bean
    PrzepisListAdapter adapter;

    @Bean
    @NonConfigurationInstance
    RestBackgroundTask restBackgroundTask;

    ProgressDialog ringProgressDialog;

    @Extra
    User user;

    @AfterViews
    void init() {
        list.setAdapter(adapter);
        ringProgressDialog = new ProgressDialog(this);
        ringProgressDialog.setMessage("Loading...");
        ringProgressDialog.setIndeterminate(true);
    }

    @ItemClick
    void listItemClicked(Przepis przepis) {
        //Toast.makeText(this, item.title, Toast.LENGTH_SHORT).show();
        //DetailsActivity_.intent(this).Przepis(przepis).start();
    }


    @Click
    void refreshClicked()    {
        ringProgressDialog.show();
        restBackgroundTask.getCookBook();
    }

    public void updateCookbook(CookBook cookBook) {
        ringProgressDialog.dismiss();
        adapter.update(cookBook);
    }

    public void showError(Exception e) {
        ringProgressDialog.dismiss();
        Toast.makeText(this, e.getMessage(), Toast.LENGTH_LONG).show();
        e.printStackTrace();
    }

    @Click
    void dodajClicked() {
        Intent logowanieintent = new Intent(this, LoginActivity_.class);
        startActivity(logowanieintent);
    }

    /*@OptionsItem
    void settingsSelected() {
    }
*/


}