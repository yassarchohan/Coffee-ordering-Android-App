package com.example.yassarchohan.coffeeorderingapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;
import android.widget.Toast;

/**
 * This app displays an order form to order coffee.
 */
public class MainActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    int totalbill = 0;

    int quantitycoffee = 0;
    int quantitytea = 0;
    int quantitygreentea = 0;

    public void tocustomersmenu(View v) {
        Button btn = (Button) findViewById(R.id.menubutton);
        if (v == btn) {
            Intent intent = new Intent(MainActivity.this, customersmenu.class);
            MainActivity.this.startActivity(intent);
        }

    }


    //this is used to display final amount and order submitting message

    public void finalmessage(View view) {
        totalbill = quantitycoffee * 80 + quantitytea * 60 + quantitygreentea * 50 ;
        String message = "Thank for placing the order please wait, Total bill is Rs:"+totalbill ;
        Toast.makeText(this, message, Toast.LENGTH_LONG).show();

    }

    /**
     * The all below methods displays the given quantity and price values and updates on click of different items on the screen.
     */
    public void displayquantityofcoffee(View view) {
        Button btn = (Button) findViewById(R.id.increment1);
        int price;
        CheckBox Box = (CheckBox) findViewById(R.id.whippedcheckbox);
        if(Box.isChecked() && view == btn){
             price = 10;

        }
        else {
             price = 0;
        }
            quantitycoffee++;
            TextView quantityTextView = (TextView) findViewById(R.id.coffeequantity_Text_view);
            TextView pricecoffee = (TextView) findViewById(R.id.coffeeprice_text_view);
            price = quantitycoffee * 80 + price;
            quantityTextView.setText("" + quantitycoffee);
            pricecoffee.setText("Rs." + price);


    }


    public void displayquantityoftea(View view) {

        int price = 0;
        quantitytea++;
        TextView quantityTextView = (TextView) findViewById(R.id.teaquantity_Text_view);
        TextView pricecoffee = (TextView) findViewById(R.id.teaprice_text_view) ;
        price = quantitytea * 60;
        quantityTextView.setText("" + quantitytea);
        pricecoffee.setText("Rs." + price );


    }

    public void displayquantityofgreen(View view) {

        int price = 0;
        quantitygreentea++;
        TextView quantityTextView = (TextView) findViewById(R.id.greenteaquantity_Text_view);
        TextView pricecoffee = (TextView) findViewById(R.id.greenteaprice_text_view) ;
        price = quantitygreentea * 50;
        quantityTextView.setText("" + quantitygreentea);
        pricecoffee.setText("Rs." + price );


    }

    //the all below methods are used for decrement within price and quantity and updates and displays on screen

    public void decrementinpriceofcoffee(View view){
        int price = 0;
        quantitycoffee--;
        TextView quantityTextView = (TextView) findViewById(R.id.coffeequantity_Text_view);
        TextView pricecoffee = (TextView) findViewById(R.id.coffeeprice_text_view) ;
        price = quantitycoffee * 80;
        quantityTextView.setText("" + quantitycoffee);
        pricecoffee.setText("Rs." + price );

    }

    public void decrementinpriceoftea(View view){
        int price = 0;
        quantitytea--;
        TextView quantityTextView = (TextView) findViewById(R.id.teaquantity_Text_view);
        TextView pricecoffee = (TextView) findViewById(R.id.teaprice_text_view) ;
        price = quantitytea * 60;
        quantityTextView.setText("" + quantitytea);
        pricecoffee.setText("Rs." + price );


    }

    public void decrementinpriceofgreentea(View view){
        int price = 0;
        quantitygreentea--;
        TextView quantityTextView = (TextView) findViewById(R.id.greenteaquantity_Text_view);
        TextView pricecoffee = (TextView) findViewById(R.id.greenteaprice_text_view) ;
        price = quantitytea * 50;
        quantityTextView.setText("" + quantitygreentea);
        pricecoffee.setText("Rs." + price );



    }






}