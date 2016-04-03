package in.good_work.les2justcofeestartchenko;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;


public class CofeeActivity extends AppCompatActivity implements View.OnClickListener {
    final static int COST_ONE_CUP = 5;
    int quantity = 0;
    Button plusBt;
    Button minusBt;
    Button odrerCheckBt;
    TextView quatityTv;
    TextView orderCheckTv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cofee);

        plusBt = (Button) findViewById(R.id.plus_bt);
        odrerCheckBt = (Button) findViewById(R.id.minus_bt);
        minusBt = (Button) findViewById(R.id.order_check_bt);
        quatityTv = (TextView) findViewById(R.id.quantity_tv);
        orderCheckTv = (TextView) findViewById(R.id.order_sum_tv);

        plusBt.setOnClickListener(this);
        minusBt.setOnClickListener(this);
        minusBt.setOnClickListener(this);
        odrerCheckBt.setOnClickListener(this);


    }

    @Override
    public void onClick(View v) {

        switch (v.getId()) {
            case R.id.plus_bt:
                this.quantity++;
                quatityTv.setText(Integer.toString(this.quantity));
                break;
            case R.id.minus_bt:
                if (this.quantity - 1 >= 0) {
                    this.quantity--;
                    quatityTv.setText(Integer.toString(this.quantity));
                }
                break;
            case R.id.order_check_bt:
                if (this.quantity > 0) {
                    orderCheckTv.setText("$ " + this.calcOrder());
                } else {
                    Toast toast = Toast.makeText(getApplicationContext(),
                            "Error calc oreder!", Toast.LENGTH_SHORT);
                    toast.show();
                }
                break;

        }
    }

    private int calcOrder() {
        return this.quantity * COST_ONE_CUP;
    }
}
