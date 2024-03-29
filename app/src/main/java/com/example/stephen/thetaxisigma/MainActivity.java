package com.example.stephen.thetaxisigma;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.Arrays;


public class MainActivity extends Activity {

    private ListView mainList;
    private ArrayAdapter<String> listAdapter ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mainList= (ListView) findViewById( R.id.list );
        String[] options =  { "Events", "Cleaning Tasks", "Risk Management", "Scholarship",
                "Contact Info"};
        ArrayList<String> optionsList= new ArrayList<String>();
        optionsList.addAll(Arrays.asList(options));
        listAdapter = new ArrayAdapter<String>(this, R.layout.listrow, optionsList );
        mainList.setAdapter( listAdapter );

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}
