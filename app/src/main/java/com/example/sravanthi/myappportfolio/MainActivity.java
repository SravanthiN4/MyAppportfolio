package com.example.sravanthi.myappportfolio;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.settings_menu, menu);
        return true;
    }

    public void spotifyStreamer(View view)
    {
        Toast.makeText(getApplicationContext(),"This button will launch Spotify Streamer App",Toast.LENGTH_SHORT).show();
    }

    public void scoresApp(View view)
    {
        Toast.makeText(getApplicationContext(),"This button will launch Scores App",Toast.LENGTH_SHORT).show();
    }

    public void libraryApp(View view)
    {
        Toast.makeText(getApplicationContext(),"This button will launch Library App",Toast.LENGTH_SHORT).show();
    }

    public void buildItBigger(View view)
    {
        Toast.makeText(getApplicationContext(),"This button will launch Build It Bigger App",Toast.LENGTH_SHORT).show();
    }

    public void xyzReader(View view)
    {
        Toast.makeText(getApplicationContext(),"This button will launch XYZ Reader App",Toast.LENGTH_SHORT).show();
    }
    public void capstoneProject(View view)
    {
        Toast.makeText(getApplicationContext(),"This button will launch Capstone: My Own App",Toast.LENGTH_SHORT).show();
    }
}
