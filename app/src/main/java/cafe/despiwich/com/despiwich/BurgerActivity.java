package cafe.despiwich.com.despiwich;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class BurgerActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_category);

       getSupportFragmentManager()
               .beginTransaction()
               .replace(R.id.container, new BurgerFragment())
               .commit();
    }
}
