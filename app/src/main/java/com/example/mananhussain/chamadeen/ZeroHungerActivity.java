package com.example.mananhussain.chamadeen;

import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;

public class ZeroHungerActivity extends AppCompatActivity {

    String[] zerohungeritems;
    ListView listViewforhunger;
    Button bt;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.zerohunger);
        bt =(Button)findViewById(R.id.button2);
        bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                 Intent i = new Intent(getApplicationContext(), GetingDataActivity.class);
                startActivity(i);
            }
        });

        Intent intent = getIntent();

        Resources res = getResources();

        zerohungeritems = res.getStringArray(R.array.zerohungeritems);
        listViewforhunger = (ListView) findViewById(R.id.zerohungeritems);
        chamAdapterZeroHunger adapter2 = new chamAdapterZeroHunger(this, zerohungeritems);
        listViewforhunger.setAdapter(adapter2);
    }
}

class chamAdapterZeroHunger extends ArrayAdapter<String>
{
    Context context1;
    String[] titleArray1;
    chamAdapterZeroHunger(Context c, String [] titles){

        super(c,R.layout.singlerowofhunger, titles);
        this.context1 = c;
        this.titleArray1=titles;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        LayoutInflater inflater = (LayoutInflater) context1.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View row = inflater.inflate(R.layout.singlerowofhunger, parent, false);
        TextView textView= (TextView)row.findViewById(R.id.stvofzerohunger);

        textView.setText(titleArray1[position]);
        return row;
    }
}
