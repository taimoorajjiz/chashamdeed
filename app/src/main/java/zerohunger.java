import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import com.example.mananhussain.chamadeen.R;

import java.lang.reflect.Array;

/**
 * Created by Manan Hussain on 7/23/2017.
 */

public class zerohunger extends ArrayAdapter {
    Context context1;
    String[] titleArray1;

    zerohunger(Context c, String[] titles) {

        super(c, R.layout.singlerowofhunger, titles);
        this.context1 = c;
        this.titleArray1 = titles;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        LayoutInflater inflater = (LayoutInflater) context1.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View row = inflater.inflate(R.layout.singlerowofhunger, parent, false);
        TextView textView = (TextView) row.findViewById(R.id.stvofzerohunger);

        textView.setText(titleArray1[position]);
        return row;
    }
}
