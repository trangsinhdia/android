package code.admin.calculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button btnExe;
    EditText txt1, txt2;
    Spinner option;
    String operator;
    TextView txtResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        GetControls();

        btnExe.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                operator = option.getSelectedItem().toString();
                double a = Double.parseDouble(txt1.getText().toString());
                double b = Double.parseDouble(txt2.getText().toString());
                double c = Calculator(a, b);
                txtResult.setText(c + "");
            }
        });
    }

    private double Calculator(double a, double b){
        try{
            switch (operator){
                case "Cộng":
                    return a+b;
                case "Trừ":
                    return a-b;
                case "Nhân":
                    return a*b;
                case "Chia":
                    return a/b;
            }
        }
        catch (Exception e){
            Toast.makeText(getApplicationContext(), e.toString(), Toast.LENGTH_LONG).show();
        }
        return 0;
    }

    private void GetControls(){
        btnExe = (Button) findViewById(R.id.btnExec);
        txt1 = (EditText) findViewById(R.id.txt1);
        txt2 = (EditText) findViewById(R.id.txt2);
        option = (Spinner) findViewById(R.id.option);
        txtResult = (TextView) findViewById(R.id.txtResult);
    }
}
