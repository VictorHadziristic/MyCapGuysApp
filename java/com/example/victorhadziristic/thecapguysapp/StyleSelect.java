package com.example.victorhadziristic.thecapguysapp;

import android.content.Intent;
import android.os.Environment;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class StyleSelect extends ActionBarActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_style_select);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_style_select, menu);
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
    String styleSelect="";
    int checked;
    String state;
    String logEntry;

    boolean select_flatbrim=false;
    boolean select_curvedbrim=false;
    boolean select_fitteds=false;
    boolean select_snapbacks=false;
    boolean select_strapbacks=false;
    boolean select_bucklebacks=false;
    boolean select_beanie=false;
    boolean select_pom=false;
    boolean select_bucket=false;
    boolean select_fedora=false;
    boolean select_shirts=false;
    boolean select_custom=false;

    public void style_flatbrim(View view) {
        if (select_flatbrim == false)
        {
            select_flatbrim = true;
            ImageButton button = (ImageButton)view;
            button.setImageResource(R.drawable.qstyle_flatbrim);
            checked = checked + 1;
        }
        else{
            select_flatbrim = false;
            ImageButton button = (ImageButton)view;
            button.setImageResource(R.drawable.style_flatbrim);
            checked = checked - 1;
        }
    }
    public void style_curvedbrim(View view) {
        if (select_curvedbrim == false)
        {
            select_curvedbrim = true;
            ImageButton button = (ImageButton)view;
            button.setImageResource(R.drawable.qstyle_curvedbrim);
            checked = checked + 1;
        }
        else{
            select_curvedbrim = false;
            ImageButton button = (ImageButton)view;
            button.setImageResource(R.drawable.style_curvedbrim);
            checked = checked - 1;
        }
    }
    public void style_fitteds(View view) {
        if (select_fitteds == false)
        {
            select_fitteds = true;
            ImageButton button = (ImageButton)view;
            button.setImageResource(R.drawable.qstyle_fitted);
            checked = checked + 1;
        }
        else{
            select_fitteds = false;
            ImageButton button = (ImageButton)view;
            button.setImageResource(R.drawable.style_fitted);
            checked = checked - 1;
        };
    }
    public void style_snapbacks(View view) {
        if (select_snapbacks == false)
        {
            select_snapbacks = true;
            ImageButton button = (ImageButton)view;
            button.setImageResource(R.drawable.qstyle_snapback);
            checked = checked + 1;
        }
        else{
            select_snapbacks = false;
            ImageButton button = (ImageButton)view;
            button.setImageResource(R.drawable.style_snapback);
            checked = checked - 1;
        }
    }
    public void style_strapbacks(View view) {
        if (select_strapbacks == false)
        {
            select_strapbacks = true;
            ImageButton button = (ImageButton)view;
            button.setImageResource(R.drawable.qstyle_strapback);
            checked = checked + 1;
        }
        else{
            select_strapbacks = false;
            ImageButton button = (ImageButton)view;
            button.setImageResource(R.drawable.style_strapback);
            checked = checked - 1;
        }
    }
    public void style_bucklebacks(View view) {
        if (select_bucklebacks == false)
        {
            select_bucklebacks = true;
            ImageButton button = (ImageButton)view;
            button.setImageResource(R.drawable.qstyle_bucklebacks);
            checked = checked + 1;
        }
        else{
            select_bucklebacks = false;
            ImageButton button = (ImageButton)view;
            button.setImageResource(R.drawable.style_bucklebacks);
            checked = checked - 1;
        }
    }
    public void style_beanie(View view) {
        if (select_beanie == false)
        {
            select_beanie = true;
            ImageButton button = (ImageButton)view;
            button.setImageResource(R.drawable.qstyle_beanie);
            checked = checked + 1;
        }
        else{
            select_beanie = false;
            ImageButton button = (ImageButton)view;
            button.setImageResource(R.drawable.style_beanie);
            checked = checked - 1;
        }
    }
    public void style_pom(View view) {
        if (select_pom == false)
        {
            select_pom = true;
            ImageButton button = (ImageButton)view;
            button.setImageResource(R.drawable.qstyle_pom);
            checked = checked + 1;
        }
        else{
            select_pom = false;
            ImageButton button = (ImageButton)view;
            button.setImageResource(R.drawable.style_pom);
            checked = checked - 1;
        }
    }
    public void style_bucket(View view) {
        if (select_bucket == false)
        {
            select_bucket = true;
            ImageButton button = (ImageButton)view;
            button.setImageResource(R.drawable.qstyle_bucket);
            checked = checked + 1;
        }
        else{
            select_bucket = false;
            ImageButton button = (ImageButton)view;
            button.setImageResource(R.drawable.style_bucket);
            checked = checked - 1;
        }
    }
    public void style_fedora(View view) {
        if (select_fedora == false)
        {
            select_fedora = true;
            ImageButton button = (ImageButton)view;
            button.setImageResource(R.drawable.qstyle_fedora);
            checked = checked + 1;
        }
        else{
            select_fedora = false;
            ImageButton button = (ImageButton)view;
            button.setImageResource(R.drawable.style_fedora);
            checked = checked - 1;
        }
    }
    public void style_shirts(View view) {
        if (select_shirts == false)
        {
            select_shirts = true;
            ImageButton button = (ImageButton)view;
            button.setImageResource(R.drawable.qstyle_shirt);
            checked = checked + 1;
        }
        else{
            select_shirts = false;
            ImageButton button = (ImageButton)view;
            button.setImageResource(R.drawable.style_shirt);
            checked = checked - 1;
        }
    }
    public void style_custom(View view) {
        if (select_custom == false)
        {
            select_custom = true;
            ImageButton button = (ImageButton)view;
            button.setImageResource(R.drawable.qstyle_custom);
            checked = checked + 1;
        }
        else{
            select_custom = false;
            ImageButton button = (ImageButton)view;
            button.setImageResource(R.drawable.style_custom);
            checked = checked - 1;
        }
    }


    public void onFinalSubmission(View view) {
        if (checked != 0)
        {
            if (select_flatbrim == true)
            {
                styleSelect = styleSelect + " Flat_Brim";
            }
            if (select_curvedbrim == true)
            {
                styleSelect = styleSelect + " Curved_Brim";
            }
            if (select_fitteds == true)
            {
                styleSelect = styleSelect + " Fitted";
            }
            if (select_snapbacks == true)
            {
                styleSelect = styleSelect + " Snap_Backs";
            }
            if (select_strapbacks == true)
            {
                styleSelect = styleSelect + " Strap_Backs";
            }
            if (select_bucklebacks == true)
            {
                styleSelect = styleSelect + " Buckle_Backs";
            }
            if (select_beanie == true)
            {
                styleSelect = styleSelect + " Beanie";
            }
            if (select_pom == true)
            {
                styleSelect = styleSelect + " Beanie_Pom";
            }
            if (select_bucket == true)
            {
                styleSelect = styleSelect + " Bucket_Hat";
            }
            if (select_fedora == true)
            {
                styleSelect = styleSelect + " Fedora";
            }
            if (select_shirts == true)
            {
                styleSelect = styleSelect + " Shirts";
            }
            if (select_custom == true)
            {
                styleSelect = styleSelect + " Custom";
            }

            String directory1 = Environment.getExternalStorageDirectory()+"/temp/var1/";
            String fileName1 = "var1.txt";
            File file1 = new File(directory1,fileName1);

            StringBuilder text1 = new StringBuilder();

            try {
                BufferedReader br1 = new BufferedReader(new FileReader(file1));
                String line1;

                while ((line1 = br1.readLine()) != null) {
                    text1.append(line1);
                    //text1.append('\n');
                }
                br1.close();
            }
            catch (IOException e) {
                //You'll need to add proper error handling here
            }
            String directory2 = Environment.getExternalStorageDirectory()+"/temp/var2/";
            String fileName2 = "var2.txt";
            File file2 = new File(directory2,fileName2);

            StringBuilder text2 = new StringBuilder();

            try {
                BufferedReader br2 = new BufferedReader(new FileReader(file2));
                String line2;

                while ((line2 = br2.readLine()) != null) {
                    text2.append(line2);
                    //text2.append('\n');
                }
                br2.close();
            }
            catch (IOException e) {
                //You'll need to add proper error handling here
            }
            String directory3 = Environment.getExternalStorageDirectory()+"/temp/var3/";
            String fileName3 = "var3.txt";
            File file3 = new File(directory3,fileName3);

            StringBuilder text3 = new StringBuilder();

            try {
                BufferedReader br3 = new BufferedReader(new FileReader(file3));
                String line3;

                while ((line3 = br3.readLine()) != null) {
                    text3.append(line3);
                    //text3.append('\n');
                }
                br3.close();
            }
            catch (IOException e) {
                //You'll need to add proper error handling here
            }

            state = Environment.getExternalStorageState();
            if (Environment.MEDIA_MOUNTED.equals(state))
            {
                File root4 = Environment.getExternalStorageDirectory();
                File dir4 = new File(root4.getAbsolutePath()+"/temp/var4");
                if (!dir4.exists())
                {
                    dir4.mkdir();
                }
                File file4 = new File(dir4,"var4.txt");
                try {
                    FileOutputStream fileOutputStream = new FileOutputStream(file4);
                    fileOutputStream.write(styleSelect.getBytes());
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
            String Qtext1 = String.valueOf(text1);
            String Qtext2 = String.valueOf(text2);
            String Qtext3 = String.valueOf(text3);
            logEntry = Qtext1 + "," + Qtext2 + "," + Qtext3 + "," + styleSelect + "\n";


            String directoryQ = Environment.getExternalStorageDirectory()+"/temp/varq/";
            String fileNameQ = "varq.txt";
            File fileQ = new File(directoryQ,fileNameQ);

            StringBuilder textQ = new StringBuilder();

            try {
                BufferedReader brQ = new BufferedReader(new FileReader(fileQ));
                String lineQ;

                while ((lineQ = brQ.readLine()) != null) {
                    textQ.append(lineQ);
                    //textQ.append('\n');
                }
                brQ.close();
            }
            catch (IOException e) {
                //You'll need to add proper error handling here
            }
            String directoryZ = Environment.getExternalStorageDirectory()+"/Sessions/";
            File entry = new File(directoryZ, String.valueOf(textQ));

            try {
                BufferedWriter writer = new BufferedWriter( new FileWriter( entry , true ) );
                writer.write(logEntry);
                writer.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
            //TextView test = (TextView)findViewById(R.id.textView);
            //test.append(" " + logEntry);
            Toast.makeText(getApplicationContext(), "Thank you for taking the time to fill out the form.", Toast.LENGTH_LONG).show();
            Toast.makeText(getApplicationContext(), "We appreciate your feedback.", Toast.LENGTH_LONG).show();

            Intent finalSubmission = new Intent(StyleSelect.this, PersonalInformation.class);
            startActivity(finalSubmission);
        }
        else
        {
            Toast.makeText(getApplicationContext(), "Please make a selection", Toast.LENGTH_LONG).show();
        }
    }
    public void onCancel2(View view) {
        Intent cancelIntent2 = new Intent(this, PersonalInformation.class);
        startActivity(cancelIntent2);
    }
}
