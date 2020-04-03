package com.gcarpee.masterdice.view.activities;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;

import com.gcarpee.masterdice.R;
import com.gcarpee.masterdice.view.fragment.FragmentRolling;

public class MainActivity extends AppCompatActivity {

    private FragmentRolling fragmentRolling;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        fragmentRolling = new FragmentRolling();

        putFragment(R.id.activity_main_layout,fragmentRolling);

    }

    public void putFragment(Integer id, Fragment fragment){
        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.replace(id,fragment);
        fragmentTransaction.commit();
    }
}