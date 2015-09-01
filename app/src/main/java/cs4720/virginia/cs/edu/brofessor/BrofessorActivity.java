package cs4720.virginia.cs.edu.brofessor;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class BrofessorActivity extends ActionBarActivity {

    private ArrayList<String> broNames = new ArrayList<String>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_brofessor);

        broNames = popluateBroNames();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_brofessor, menu);
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

    public void getBroName(View view) {

        EditText nameEditText = (EditText)findViewById(R.id.editText);
        Random rand = new Random();
        String name = "";

        name = broNames.get(rand.nextInt(broNames.size()-1)) + " " + broNames.get(rand.nextInt(broNames.size()-1)) + broNames.get(rand.nextInt(broNames.size()-1));
        nameEditText.setText(name);


    }

    private ArrayList<String> popluateBroNames() {
        ArrayList<String> names = new ArrayList<String>();

        String[] list = {"Brock", "Rock", "Awesome", "Stone", "Jim", "Steve", "Cool",  "Bro", "Brolo"};

        names.addAll(Arrays.asList(list));

        return names;
    }
}
