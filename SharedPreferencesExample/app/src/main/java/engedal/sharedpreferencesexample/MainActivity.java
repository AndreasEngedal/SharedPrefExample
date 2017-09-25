package engedal.sharedpreferencesexample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Main_content contentFragment = new Main_content();
        Bundle args = new Bundle();
        args.putInt("N1", 500);
        contentFragment.setArguments(args);

        getSupportFragmentManager().beginTransaction().replace(R.id.content_main, contentFragment).addToBackStack(null).commit();
    }
}
