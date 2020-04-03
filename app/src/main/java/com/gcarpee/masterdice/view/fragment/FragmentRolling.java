package com.gcarpee.masterdice.view.fragment;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.gcarpee.masterdice.R;
import com.gcarpee.masterdice.pojo.Dice;

import java.util.Random;


/**
 * A simple {@link Fragment} subclass.
 */
public class FragmentRolling extends Fragment {

    public FragmentRolling() {
        // Required empty public constructor
    }

    //Buttons
    private Button buttonMinus;
    private Button buttonPlus;
    private Button buttonDiceFour;
    private Button buttonDiceSix;
    private Button buttonDiceEight;
    private Button buttonDiceTen;
    private Button buttonDiceTwelve;
    private Button buttonDiceTwenty;

    //Dices
    private Dice diceFourSides = new Dice(1,4,4);
    private Dice diceSixSides = new Dice(1,6,6);
    private Dice diceEightSides = new Dice(1,8,8);
    private Dice diceTenSides = new Dice(1,10,10);
    private Dice diceTwelveSides = new Dice(1,12,12);
    private Dice diceTwentySides = new Dice(1,20,20);

    //Values
    private Integer min;
    private Integer max;
    private Integer newRoll;
    private Integer diceQuantity = 0;

    //TextViews
    private TextView textViewNumber;
    private TextView textViewDiceQuantity;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view =  inflater.inflate(R.layout.fragment_rolling, container, false);

        //TEXTVIEW
        textViewNumber = view.findViewById(R.id.fragment_rolling_number);
        textViewDiceQuantity = view.findViewById(R.id.fragment_rolling_textview_dice_quantity);

        //BUTTONS
        buttonMinus = view.findViewById(R.id.fragment_rolling_button_minus);
        buttonPlus = view.findViewById(R.id.fragment_rolling_button_plus);
        buttonDiceFour = view.findViewById(R.id.fragment_rolling_button_dice_four);
        buttonDiceSix = view.findViewById(R.id.fragment_rolling_button_dice_six);
        buttonDiceEight = view.findViewById(R.id.fragment_rolling_button_dice_eight);
        buttonDiceTen = view.findViewById(R.id.fragment_rolling_button_dice_ten);
        buttonDiceTwelve = view.findViewById(R.id.fragment_rolling_button_dice_twelve);
        buttonDiceTwenty = view.findViewById(R.id.fragment_rolling_button_dice_twenty);

        //MINUS /PLUS
        buttonMinus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(diceQuantity >= 1){
                    diceQuantity = diceQuantity - 1;
                    String s = diceQuantity.toString();
                    textViewDiceQuantity.setText(s);
                } else{

                    Toast.makeText(getContext(), "Is not possible to have less than 1 dice.", Toast.LENGTH_SHORT).show();
                }
            }
        });

        buttonPlus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                diceQuantity = diceQuantity + 1;
                String s = diceQuantity.toString();
                textViewDiceQuantity.setText(s);
            }
        });

        //DICES
        buttonDiceFour.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                min = diceFourSides.getMinNumber();
                max = diceFourSides.getMaxNumber();
                diceRolling(max,min);
            }
        });

        buttonDiceSix.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                min = diceSixSides.getMinNumber();
                max = diceSixSides.getMaxNumber();
                diceRolling(max,min);
            }
        });

        buttonDiceEight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                min = diceEightSides.getMinNumber();
                max = diceEightSides.getMaxNumber();
                diceRolling(max,min);
            }
        });

        buttonDiceTen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                min = diceTenSides.getMinNumber();
                max = diceTenSides.getMaxNumber();
                diceRolling(max,min);
            }
        });

        buttonDiceTwelve.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                min = diceTwelveSides.getMinNumber();
                max = diceTwelveSides.getMaxNumber();
                diceRolling(max,min);
            }
        });

        buttonDiceTwenty.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                min = diceTwentySides.getMinNumber();
                max = diceTwentySides.getMaxNumber();
                diceRolling(max,min);
            }
        });

        return view;
    }

    private void diceRolling(Integer max, Integer min){

        Integer diceQuantity = Integer.valueOf(textViewDiceQuantity.getText().toString());

        newRoll = new Random().nextInt((max - min) + 1) + min;
        newRoll = newRoll * diceQuantity;
        String s = diceQuantity.toString();
        textViewNumber.setText(s);

    }
}
