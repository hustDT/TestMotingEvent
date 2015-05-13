package com.example.dt.testmotingevent;

import android.media.tv.TvView;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.util.Log;
import android.view.MotionEvent;
import android.widget.TextView;


public class MainActivity extends ActionBarActivity {



    private static final String TAG="TestMotionEvent";
    TextView mAction;
    TextView mPosition;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mAction=(TextView)findViewById(R.id.textView);
        mPosition=(TextView)findViewById(R.id.textView2);

    }

    public boolean onTouchEvent(MotionEvent event)
    {
        Log.v(TAG,event.toString());
        float x=event.getX();
        float y=event.getY();
        int Action = event.getAction();

        mAction.setText("Action:"+Action);
        mPosition.setText("Position:("+x+","+y+")");

        return true;
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
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
}
