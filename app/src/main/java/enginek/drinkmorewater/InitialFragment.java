package enginek.drinkmorewater;

import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.Spinner;

/**
 * Created by Joseph Kessler on 2/25/2017.
 */

public class InitialFragment extends Fragment {

    private View view;
    private Context context;

    private EditText weight, exercise;
    private Spinner time;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.initial_fragment, container, false);

        weight = (EditText) view.findViewById(R.id.weight);
        exercise = (EditText) view.findViewById(R.id.exercise);
        time = (Spinner) view.findViewById(R.id.time);

        return view;
    }
}
