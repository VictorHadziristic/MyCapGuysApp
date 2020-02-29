package com.example.victorhadziristic.thecapguysapp;

import android.content.Intent;
import android.os.Environment;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;


public class PersonalInformation extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_personal_information);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_personal_information, menu);
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
    String usersEmail;
    String usersName;
    String state;
    public void onTextDataSubmission(View view)
    {
        EditText usersNameET = (EditText) findViewById(R.id.editText_FullName);
        EditText usersEmailET = (EditText) findViewById(R.id.editText_Email);

        usersName = String.valueOf(usersNameET.getText());
        usersEmail = String.valueOf(usersEmailET.getText());

        if (usersName.length()==0){
            usersNameET.requestFocus();
            usersNameET.setError("Please enter your name");
        }
        else if (usersName.matches("[1234567890]+"))
        {
            usersNameET.requestFocus();
            usersNameET.setError("Enter only alphabetical characters");
        }
        else if(usersEmail.length()==0)
        {
            usersEmailET.requestFocus();
            usersEmailET.setError("Please enter an email");
        }
        else if (!usersEmail.contains("@"))
        {
            usersEmailET.requestFocus();
            usersEmailET.setError("Please enter a valid email");
        }
        else if (!usersEmail.contains("."))
        {
            usersEmailET.requestFocus();
            usersEmailET.setError("Please enter a valid email");
        }
        else
        {
            state = Environment.getExternalStorageState();
            if (Environment.MEDIA_MOUNTED.equals(state))
            {
                File root = Environment.getExternalStorageDirectory();
                File dir = new File(root.getAbsolutePath()+"/temp/var1");
                if (!dir.exists())
                {
                    dir.mkdir();
                }
                File file = new File(dir,"var1.txt");
                try {
                    FileOutputStream fileOutputStream = new FileOutputStream(file);
                    fileOutputStream.write(usersName.getBytes());
                    fileOutputStream.close();
                } catch (FileNotFoundException e) {
                    e.printStackTrace();
                } catch (IOException e) {
                    e.printStackTrace();
                }
                File root2 = Environment.getExternalStorageDirectory();
                File dir2 = new File(root2.getAbsolutePath()+"/temp/var2");
                if (!dir2.exists())
                {
                    dir2.mkdir();
                }
                File file2 = new File(dir2,"var2.txt");
                try {
                    FileOutputStream fileOutputStream = new FileOutputStream(file2);
                    fileOutputStream.write(usersEmail.getBytes());
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
            Intent nextActivity = new Intent(this, BrandSelect.class);
            startActivity(nextActivity);
        }
    }

    public void clearName(View view) {
        EditText usersNameET = (EditText) findViewById(R.id.editText_FullName);
        usersNameET.setText("");
    }

    public void clearEmail(View view) {
        EditText usersEmailET = (EditText) findViewById(R.id.editText_Email);
        usersEmailET.setText("");
    }
}
