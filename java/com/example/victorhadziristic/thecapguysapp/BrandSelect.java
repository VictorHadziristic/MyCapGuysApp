package com.example.victorhadziristic.thecapguysapp;

import android.content.Intent;
import android.os.Environment;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.Toast;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;


public class BrandSelect extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_brand_select);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_brand_select, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
    String brandSelect = "";
    int checked;
    String state;
    String customBrand;

    boolean select_47=false;
    boolean select_tcg=false;
    boolean select_inspe=false;
    boolean select_jordan=false;
    boolean select_inspdes=false;
    boolean select_nike=false;
    boolean select_mandn=false;
    boolean select_nera=false;
    boolean select_reebok=false;
    boolean select_adidas=false;
    boolean select_hbto=false;
    boolean select_nba=false;
    boolean select_mlb=false;
    boolean select_nfl=false;
    boolean select_nhl=false;
    boolean select_416=false;
    boolean select_doctor=false;
    boolean select_custom=false;
    boolean select_lacer=false;
    boolean select_crooks=false;
    boolean select_kangol=false;
    boolean select_obey=false;
    boolean select_zephyr=false;
    boolean select_supreme=false;


    public void brand_47(View view) {
        if (select_47 == false)
        {
            select_47 = true;
            ImageButton button_47 = (ImageButton)view;
            button_47.setImageResource(R.drawable.slogo_47);
            checked = checked + 1;
        }
        else{
            select_47 = false;
            ImageButton button_47 = (ImageButton)view;
            button_47.setImageResource(R.drawable.logo_47);
            checked = checked - 1;
        }
    }
    public void brand_tcg(View view) {
        if (select_tcg == false)
        {
            select_tcg = true;
            ImageButton button_tcg = (ImageButton)view;
            button_tcg.setImageResource(R.drawable.slogo_tcg);
            checked = checked + 1;
        }
        else{
            select_tcg = false;
            ImageButton button_tcg = (ImageButton)view;
            button_tcg.setImageResource(R.drawable.logo_tcg);
            checked = checked - 1;
        }
    }
    public void brand_inspiredExclusives(View view) {
        if (select_inspe == false)
        {
            select_inspe = true;
            ImageButton button_inspe = (ImageButton)view;
            button_inspe.setImageResource(R.drawable.slogo_inspe);
            checked = checked + 1;
        }
        else{
            select_inspe = false;
            ImageButton button_inspe = (ImageButton)view;
            button_inspe.setImageResource(R.drawable.logo_inspe);
            checked = checked - 1;
        }
    }
    public void brand_jordan(View view) {
        if (select_jordan == false)
        {
            select_jordan = true;
            ImageButton button = (ImageButton)view;
            button.setImageResource(R.drawable.slogo_jordan);
            checked = checked + 1;
        }
        else{
            select_jordan = false;
            ImageButton button = (ImageButton)view;
            button.setImageResource(R.drawable.logo_jordan);
            checked = checked - 1;
        }
    }
    public void brand_inspiredDesigns(View view) {
        if (select_inspdes == false)
        {
            select_inspdes = true;
            ImageButton button = (ImageButton)view;
            button.setImageResource(R.drawable.slogo_inspdes);
            checked = checked + 1;
        }
        else{
            select_inspdes = false;
            ImageButton button = (ImageButton)view;
            button.setImageResource(R.drawable.logo_inspdes);
            checked = checked - 1;
        }
    }
    public void brand_nike(View view) {
        if (select_nike == false)
        {
            select_nike = true;
            ImageButton button = (ImageButton)view;
            button.setImageResource(R.drawable.slogo_nike);
            checked = checked + 1;
        }
        else{
            select_nike = false;
            ImageButton button = (ImageButton)view;
            button.setImageResource(R.drawable.logo_nike);
            checked = checked - 1;
        }
    }
    public void brand_mandn(View view) {
        if (select_mandn == false)
        {
            select_mandn = true;
            ImageButton button = (ImageButton)view;
            button.setImageResource(R.drawable.slogo_mandn);
            checked = checked + 1;
        }
        else{
            select_mandn = false;
            ImageButton button = (ImageButton)view;
            button.setImageResource(R.drawable.logo_mandn);
            checked = checked - 1;
        }
    }
    public void brand_nera(View view) {
        if (select_nera == false)
        {
            select_nera = true;
            ImageButton button = (ImageButton)view;
            button.setImageResource(R.drawable.slogo_nera);
            checked = checked + 1;
        }
        else{
            select_nera = false;
            ImageButton button = (ImageButton)view;
            button.setImageResource(R.drawable.logo_nera);
            checked = checked - 1;
        }
    }
    public void brand_reebok(View view) {
        if (select_reebok == false)
        {
            select_reebok = true;
            ImageButton button = (ImageButton)view;
            button.setImageResource(R.drawable.slogo_reebok);
            checked = checked + 1;
        }
        else{
            select_reebok = false;
            ImageButton button = (ImageButton)view;
            button.setImageResource(R.drawable.logo_reebok);
            checked = checked - 1;
        }
    }
    public void brand_adidas(View view) {
        if (select_adidas == false)
        {
            select_adidas = true;
            ImageButton button = (ImageButton)view;
            button.setImageResource(R.drawable.slogo_adidas);
            checked = checked + 1;
        }
        else{
            select_adidas = false;
            ImageButton button = (ImageButton)view;
            button.setImageResource(R.drawable.logo_adidas);
            checked = checked - 1;
        }
    }
    public void brand_hbto(View view) {
        if (select_hbto == false)
        {
            select_hbto = true;
            ImageButton button = (ImageButton)view;
            button.setImageResource(R.drawable.slogo_hbto);
            checked = checked + 1;
        }
        else{
            select_hbto = false;
            ImageButton button = (ImageButton)view;
            button.setImageResource(R.drawable.logo_hbto);
            checked = checked - 1;
        }
    }
    public void brand_nba(View view) {
        if (select_nba == false)
        {
            select_nba = true;
            ImageButton button = (ImageButton)view;
            button.setImageResource(R.drawable.slogo_nba);
            checked = checked + 1;
        }
        else{
            select_nba = false;
            ImageButton button = (ImageButton)view;
            button.setImageResource(R.drawable.logo_nba);
            checked = checked - 1;
        }
    }
    public void brand_mlb(View view) {
        if (select_mlb == false)
        {
            select_mlb = true;
            ImageButton button = (ImageButton)view;
            button.setImageResource(R.drawable.slogo_mlb);
            checked = checked + 1;
        }
        else{
            select_mlb = false;
            ImageButton button = (ImageButton)view;
            button.setImageResource(R.drawable.logo_mlb);
            checked = checked - 1;
        }
    }
    public void brand_nfl(View view) {
        if (select_nfl == false)
        {
            select_nfl = true;
            ImageButton button = (ImageButton)view;
            button.setImageResource(R.drawable.slogo_nfl);
            checked = checked + 1;
        }
        else{
            select_nfl = false;
            ImageButton button = (ImageButton)view;
            button.setImageResource(R.drawable.logo_nfl);
            checked = checked - 1;
        }
    }
    public void brand_nhl(View view) {
        if (select_nhl == false)
        {
            select_nhl = true;
            ImageButton button = (ImageButton)view;
            button.setImageResource(R.drawable.slogo_nhl);
            checked = checked + 1;
        }
        else{
            select_nhl = false;
            ImageButton button = (ImageButton)view;
            button.setImageResource(R.drawable.logo_nhl);
            checked = checked - 1;
        }
    }
    public void brand_416(View view) {
        if (select_416 == false)
        {
            select_416 = true;
            ImageButton button = (ImageButton)view;
            button.setImageResource(R.drawable.slogo_416);
            checked = checked + 1;
        }
        else{
            select_416 = false;
            ImageButton button = (ImageButton)view;
            button.setImageResource(R.drawable.logo_416);
            checked = checked - 1;
        }
    }
    public void brand_doctor(View view) {
        if (select_doctor == false)
        {
            select_doctor = true;
            ImageButton button = (ImageButton)view;
            button.setImageResource(R.drawable.slogo_doctor);
            checked = checked + 1;
        }
        else{
            select_doctor = false;
            ImageButton button = (ImageButton)view;
            button.setImageResource(R.drawable.logo_doctor);
            checked = checked - 1;
        }
    }
    ////////////
    public void brand_lacer(View view) {
        if (select_lacer == false)
        {
            select_lacer = true;
            ImageButton button = (ImageButton)view;
            button.setImageResource(R.drawable.slogo_lacer);
            checked = checked + 1;
        }
        else{
            select_lacer = false;
            ImageButton button = (ImageButton)view;
            button.setImageResource(R.drawable.logo_lacer);
            checked = checked - 1;
        }
    }
    public void brand_crooks(View view) {
        if (select_crooks == false)
        {
            select_crooks = true;
            ImageButton button = (ImageButton)view;
            button.setImageResource(R.drawable.slogo_crooks);
            checked = checked + 1;
        }
        else{
            select_crooks = false;
            ImageButton button = (ImageButton)view;
            button.setImageResource(R.drawable.logo_crooks);
            checked = checked - 1;
        }
    }
    public void brand_kangol(View view) {
        if (select_kangol == false)
        {
            select_kangol = true;
            ImageButton button = (ImageButton)view;
            button.setImageResource(R.drawable.slogo_kangol);
            checked = checked + 1;
        }
        else{
            select_kangol = false;
            ImageButton button = (ImageButton)view;
            button.setImageResource(R.drawable.logo_kangol);
            checked = checked - 1;
        }
    }
    public void brand_obey(View view) {
        if (select_obey == false)
        {
            select_obey = true;
            ImageButton button = (ImageButton)view;
            button.setImageResource(R.drawable.slogo_obey);
            checked = checked + 1;
        }
        else{
            select_obey = false;
            ImageButton button = (ImageButton)view;
            button.setImageResource(R.drawable.logo_obey);
            checked = checked - 1;
        }
    }
    public void brand_zephyr(View view) {
        if (select_zephyr == false)
        {
            select_zephyr = true;
            ImageButton button = (ImageButton)view;
            button.setImageResource(R.drawable.slogo_zephyr);
            checked = checked + 1;
        }
        else{
            select_zephyr = false;
            ImageButton button = (ImageButton)view;
            button.setImageResource(R.drawable.logo_zephyr);
            checked = checked - 1;
        }
    }
    public void brand_supreme(View view) {
        if (select_supreme == false)
        {
            select_supreme = true;
            ImageButton button = (ImageButton)view;
            button.setImageResource(R.drawable.slogo_supreme);
            checked = checked + 1;
        }
        else{
            select_supreme = false;
            ImageButton button = (ImageButton)view;
            button.setImageResource(R.drawable.logo_supreme);
            checked = checked - 1;
        }
    }
    public void onBrandSubmission(View view)
    {
        EditText customBrandET = (EditText) findViewById(R.id.EditText_customBrand);
        customBrand = String.valueOf(customBrandET.getText());
        if (customBrand.length()!=0)
        {
            checked = checked +1;
        }
        if (checked != 0)
        {
            if (select_47 == true)
            {
                brandSelect = brandSelect + " '47";
            }
            if (select_tcg == true)
            {
                brandSelect = brandSelect + " TCG";
            }
            if (select_inspe == true)
            {
                brandSelect = brandSelect + " Inspired_Exclusives";
            }
            if (select_jordan == true)
            {
                brandSelect = brandSelect + " Jordan";
            }
            if (select_inspdes == true)
            {
                brandSelect = brandSelect + " Inspired_Designs";
            }
            if (select_nike == true)
            {
                brandSelect = brandSelect + " Nike";
            }
            if (select_mandn == true)
            {
                brandSelect = brandSelect + " Mitchell_and_Ness";
            }
            if (select_nera == true)
            {
                brandSelect = brandSelect + " New_Era";
            }
            if (select_reebok == true)
            {
                brandSelect = brandSelect + " Reebok";
            }
            if (select_adidas == true)
            {
                brandSelect = brandSelect + " Adidas";
            }
            if (select_hbto == true)
            {
                brandSelect = brandSelect + " HBTO";
            }
            if (select_nba == true)
            {
                brandSelect = brandSelect + " NBA";
            }
            if (select_mlb == true)
            {
                brandSelect = brandSelect + " MLB";
            }
            if (select_nfl == true)
            {
                brandSelect = brandSelect + " NFL";
            }
            if (select_nhl == true)
            {
                brandSelect = brandSelect + " NHL";
            }
            if (select_416 == true)
            {
                brandSelect = brandSelect + " 416";
            }
            if (select_doctor == true)
            {
                brandSelect = brandSelect + " The_Doctor_Bird";
            }
            if (select_custom == true)
            {
                brandSelect = brandSelect + " " + customBrand;
            }
            if (select_lacer == true)
            {
                brandSelect = brandSelect + " Lacer";
            }
            if (select_crooks == true)
            {
                brandSelect = brandSelect + " Crooks&Castles";
            }
            if (select_kangol == true)
            {
                brandSelect = brandSelect + " Kangol";
            }
            if (select_obey == true)
            {
                brandSelect = brandSelect + " Obey";
            }
            if (select_zephyr == true)
            {
                brandSelect = brandSelect + " Zephyr";
            }
            if (select_supreme == true)
            {
                brandSelect = brandSelect + " Supreme";
            }
            state = Environment.getExternalStorageState();
            if (Environment.MEDIA_MOUNTED.equals(state))
            {
                File root3 = Environment.getExternalStorageDirectory();
                File dir3 = new File(root3.getAbsolutePath()+"/temp/var3");
                if (!dir3.exists())
                {
                    dir3.mkdir();
                }
                File file3 = new File(dir3,"var3.txt");
                try {
                    FileOutputStream fileOutputStream = new FileOutputStream(file3);
                    fileOutputStream.write(brandSelect.getBytes());
                    fileOutputStream.close();
                } catch (FileNotFoundException e) {
                    e.printStackTrace();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            else
            {
                Toast.makeText(getApplicationContext(), "SD card Not Found", Toast.LENGTH_LONG).show();
            }
            Intent BrandSelectIntent = new Intent(this, StyleSelect.class);
            startActivity(BrandSelectIntent);
        }
        else {
            Toast.makeText(getApplicationContext(), "Please make a selection", Toast.LENGTH_LONG).show();
        }
    }
    public void onSelectAll(View view) {
        brandse
        state = Environment.getExternalStorageState();
        if (Environment.MEDIA_MOUNTED.equals(state))
        {
            File root3 = Environment.getExternalStorageDirectory();
            File dir3 = new File(root3.getAbsolutePath()+"/temp/var3");
            if (!dir3.exists())
            {
                dir3.mkdir();
            }
            File file3 = new File(dir3,"var3.txt");
            try {
                FileOutputStream fileOutputStream = new FileOutputStream(file3);
                fileOutputStream.write(brandSelect.getBytes());
                fileOutputStream.close();
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        else
        {
            Toast.makeText(getApplicationContext(), "SD card Not Found", Toast.LENGTH_LONG).show();
        }
        Intent BrandSelectIntent = new Intent(this, StyleSelect.class);
        startActivity(BrandSelectIntent);
    }
    public void onBrandClear(View view) {
        EditText customBrandET = (EditText) findViewById(R.id.EditText_customBrand);
        customBrandET.setText("");
    }
    public void onCancel(View view) {
        Intent cancelIntent = new Intent(this, PersonalInformation.class);
        startActivity(cancelIntent);
    }
}
