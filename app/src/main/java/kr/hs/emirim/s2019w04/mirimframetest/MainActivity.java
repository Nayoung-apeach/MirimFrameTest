package kr.hs.emirim.s2019w04.mirimframetest;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;


public class MainActivity extends AppCompatActivity {
    LinearLayout linearPark, linearSon, linearAan;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        linearPark = findViewById(R.id.linear_Park);
        linearSon = findViewById(R.id.linear_Son);
        linearAan = findViewById(R.id.linear_Aan);

        Button btnPark = findViewById(R.id.btn_Park);
        Button btnSon = findViewById(R.id.btn_Son);
        Button btnAan = findViewById(R.id.btn_Aan);

        btnPark.setOnClickListener(btnListener);
        btnSon.setOnClickListener(btnListener);
        btnAan.setOnClickListener(btnListener);
    }
    View.OnClickListener btnListener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            linearPark.setVisibility(View.INVISIBLE);
            linearSon.setVisibility(View.INVISIBLE);
            linearAan.setVisibility(View.INVISIBLE);
            switch (v.getId()){
                case R.id.btn_Park:
                    linearPark.setVisibility(View.VISIBLE);
                    break;
                case R.id.btn_Son:
                    linearSon.setVisibility(View.VISIBLE);
                    break;
                case R.id.btn_Aan:
                    linearAan.setVisibility(View.VISIBLE);
                    break;
            }
        }
    };
}