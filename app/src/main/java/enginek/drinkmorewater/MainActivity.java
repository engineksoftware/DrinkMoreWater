package enginek.drinkmorewater;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //TODO: Change this so it only runs on the first start.
        Intent intent = new Intent(this, SetupActivity.class);
        startActivity(intent);
        finish();
    }
}
