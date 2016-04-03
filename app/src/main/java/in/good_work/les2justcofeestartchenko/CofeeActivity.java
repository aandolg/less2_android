package in.good_work.les2justcofeestartchenko;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


public class CofeeActivity extends AppCompatActivity implements View.OnClickListener {
    final static int COST_ONE_CUP = 5;
    Button plusBt;
    Button minusBt;
    TextView quatityTv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cofee);

        plusBt = (Button) findViewById(R.id.plus_bt);
        minusBt = (Button) findViewById(R.id.minus_bt);
        quatityTv = (TextView) findViewById(R.id.quantity_tv);

        plusBt.setOnClickListener(this);
        minusBt.setOnClickListener(this);


    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.plus_bt:
                quatityTv.setText("Нажата кнопка Plus");
                break;
            case R.id.minus_bt:
                quatityTv.setText("Нажата кнопка minus");
                break;
        }
    }
}
