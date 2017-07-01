package com.example.srijanrana.iphonecalculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView TVinput;
    Button BTc;
    Button BTmod;
    Button BTdiv;
    Button BTmul;
    Button BTadd;
    Button BTsub;
    Button BT1;
    Button BT2;
    Button BT3;
    Button BT4;
    Button BT5;
    Button BT6;
    Button BT7;
    Button BT8;
    Button BT9;
    Button BT0;
    Button BTdot;
    Button BTeq;
    Button BTpm;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TVinput=(TextView)findViewById(R.id.TVinput);
        BTmod=(Button)findViewById(R.id.BTmod);
        BTdiv=(Button)findViewById(R.id.BTdiv);
        BTmul=(Button)findViewById(R.id.BTmul);
        BTsub=(Button)findViewById(R.id.BTsub);
        BTadd=(Button)findViewById(R.id.BTadd);
        BT1=(Button)findViewById(R.id.BT1);
        BT2=(Button)findViewById(R.id.BT2);
        BT3=(Button)findViewById(R.id.BT3);
        BT4=(Button)findViewById(R.id.BT4);
        BT5=(Button)findViewById(R.id.BT5);
        BT6=(Button)findViewById(R.id.BT6);
        BT7=(Button)findViewById(R.id.BT7);
        BT8=(Button)findViewById(R.id.BT8);
        BT9=(Button)findViewById(R.id.BT9);
        BT0=(Button)findViewById(R.id.BT0);
        BTdot=(Button)findViewById(R.id.BTdot);
        BTc=(Button)findViewById(R.id.BTc);
        BTeq=(Button)findViewById(R.id.BTeq);
        BTpm=(Button)findViewById(R.id.BTpm);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    int p;
    String S1="";
    public void get(View v)
    {
        if(v==BT1)
            S1=S1+"1";
        else if(v==BT2)
            S1=S1+"2";
        else if(v==BT3)
            S1=S1+"3";
        else if(v==BT4)
            S1=S1+"4";
        else if(v==BT5)
            S1=S1+"5";
        else if(v==BT6)
            S1=S1+"6";
        else if(v==BT7)
            S1=S1+"7";
        else if(v==BT8)
            S1=S1+"8";
        else if(v==BT9)
            S1=S1+"9";
        else if(v==BT0)
            S1=S1+"0";
        else if(v==BTdot)
            S1=S1+".";
        else if(v==BTpm)
            S1=S1+"-";
        TVinput.setText(S1);
    }
    double a=0.0d;
    double result=0.0d;
    public void onClick(View v)
    {   if(result==0.0d)
        result=Double.parseDouble(TVinput.getText().toString());

        else if(p!=6)
    {
        a=Double.parseDouble(TVinput.getText().toString());
        equals(v);
    }



        S1="";
        if(v==BTadd)
            p=1;
        if(v==BTsub)
            p=2;
        if(v==BTmul)
            p=3;
        if(v==BTdiv)
            p=4;
        if(v==BTmod)
            p=5;
    }

    public void cancel(View v)
    {
        result=0.0d;
        TVinput.setText("");
        a=0.0d;
        S1="";
    }
    public void equals(View v)
    {
        if(v==BTeq)
        {
            a=Double.parseDouble(TVinput.getText().toString());
            S1="";
        }

        if(p==1)
        {
            result=result+a;
        }
        else if(p==2)
        {
            result=result-a;
        }
        else if(p==3)
        {
            result=result*a;
        }
        else if(p==4)
        {
            result=result/a;
        }else if(p==5)
        {
            result=result%a;;
        }
        if(v==BTeq) {
            TVinput.setText("" + result);
        }
        p=6;

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
