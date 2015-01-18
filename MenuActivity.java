package com.example.student7.cookbook;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import org.androidannotations.annotations.Click;
import org.androidannotations.annotations.EActivity;

@EActivity(R.layout.activity_menu)
public class MenuActivity extends ActionBarActivity {






    @Click
    void przepisyClicked() {
        Intent secondintent = new Intent(this, PrzepisyActivity_.class);
        startActivity(secondintent);
    }

    void logowanieClicked() {
        Intent firstintent = new Intent(this, LoginActivity_.class);
        startActivity(firstintent);
    }


}
