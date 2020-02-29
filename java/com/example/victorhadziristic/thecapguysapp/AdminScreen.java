package com.example.victorhadziristic.thecapguysapp;

import android.content.Intent;
import android.os.Environment;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class AdminScreen extends ActionBarActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_admin_screen);

        File folder = new File(Environment.getExternalStorageDirectory() + "/temp");
        boolean success = true;
        if (!folder.exists())
        {
            success = folder.mkdir();
        }
        if (success)
        {
            Toast.makeText(getApplicationContext(), "Registry Successfully Created", Toast.LENGTH_SHORT).show();
        }
        else
        {
            Toast.makeText(getApplicationContext(), "ERROR: Registry Creation Failed", Toast.LENGTH_SHORT).show();
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_admin_screen, menu);
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

    public void onSessionCreate(View view)
    {
        Calendar c = Calendar.getInstance();
        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd_HH-mm-ss");
        String dateStamp = df.format(c.getTime());
        String header = "Name, Email, Brand, Style" + "\n";
        String FileName = dateStamp + ".csv";
        String state;
        state = Environment.getExternalStorageState();

        if (Environment.MEDIA_MOUNTED.equals(state))
        {
            File root = Environment.getExternalStorageDirectory();
            File dir = new File(root.getAbsolutePath() + "/Sessions");
            if (!dir.exists()) {
                dir.mkdir();
            }
            File file = new File(dir, FileName);
            try {
                FileOutputStream fileOutputStream = new FileOutputStream(file);
                fileOutputStream.write(header.getBytes());
                fileOutputStream.close();
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }
            File rootQ = Environment.getExternalStorageDirectory();
            File dirQ = new File(rootQ.getAbsolutePath() + "/temp/varq");
            if (!dirQ.exists()) {
                dirQ.mkdir();
            }
            File fileQ = new File(dirQ, "varq.txt");
            try {
                FileOutputStream fileOutputStream = new FileOutputStream(fileQ);
                fileOutputStream.write(FileName.getBytes());
                fileOutputStream.close();
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }
            Intent PersonalInfoIntent = new Intent(AdminScreen.this, PersonalInformation.class);
            startActivity(PersonalInfoIntent);
        }
        else
        {
            Toast.makeText(getApplicationContext(), "SD card Not Found", Toast.LENGTH_LONG).show();
        }
    }
}
