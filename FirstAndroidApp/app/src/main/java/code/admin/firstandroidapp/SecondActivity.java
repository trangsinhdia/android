package code.admin.firstandroidapp;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class SecondActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
    }

    public void showMe(View v){
        String message;
        EditText txt = findViewById(R.id.EditText01);
        message = "Xin Chào " + txt.getText().toString();
        Toast.makeText(getApplicationContext(), message, Toast.LENGTH_LONG).show();
    }
}
