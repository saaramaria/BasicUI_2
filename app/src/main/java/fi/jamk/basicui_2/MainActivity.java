package fi.jamk.basicui_2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.AutoCompleteTextView;
import android.widget.ArrayAdapter;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // AutoCompleteTextView
        AutoCompleteTextView actv = (AutoCompleteTextView)
                findViewById(R.id.login); // add stings to control
        ArrayAdapter<String> aa = new ArrayAdapter<String>(this,
                android.R.layout.simple_dropdown_item_1line,
                new String[]
                        {"Pasi","Juha","Kari","Jouni","Esa","Hannu"});
        actv.setAdapter(aa);

    }

    public void loginButtonClicked(View view) {
        //get login name
        final AutoCompleteTextView autoText = (AutoCompleteTextView) findViewById(R.id.login);
        final String text1 = autoText.getText().toString();

        //get password
        final EditText editText = (EditText) findViewById(R.id.password);
        final String text2 = editText.getText().toString();

        // toast message to screen
        Toast.makeText(getApplicationContext(), text1 + " " + text2,
                Toast.LENGTH_SHORT).show();
    }
}
