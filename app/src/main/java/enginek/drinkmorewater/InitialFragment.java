package enginek.drinkmorewater;

import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

/**
 * Created by Joseph Kessler on 2/25/2017.
 */

public class InitialFragment extends Fragment {

    private View view;
    private Context context;

    private EditText weight, exercise;
    private Spinner time;
    private Button next;

    @Override
    public View onCreateView(LayoutInflater inflater, final ViewGroup container, Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.initial_fragment, container, false);
        context = view.getContext();

        weight = (EditText) view.findViewById(R.id.weight);
        exercise = (EditText) view.findViewById(R.id.exercise);
        time = (Spinner) view.findViewById(R.id.time);

        next = (Button) view.findViewById(R.id.next);
        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(weight.getText().toString().equals(""))
                    Toast.makeText(context, "You need to enter your weight!", Toast.LENGTH_SHORT).show();
                else{

                }
            }
        });

        return view;
    }
}
