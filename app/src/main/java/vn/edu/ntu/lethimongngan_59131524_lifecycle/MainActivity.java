package vn.edu.ntu.lethimongngan_59131524_lifecycle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.Lifecycle;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import java.text.SimpleDateFormat;
import java.util.Date;

public class MainActivity extends AppCompatActivity {
    TextView txtTG;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d("LifeCycle", "onCreate called");
        // cau 3
        txtTG = findViewById(R.id.txtTG);
        SimpleDateFormat spf = new SimpleDateFormat("HH:mm:ss");
        String strData = spf.format(new Date());
        txtTG.setText(strData);

        // cau 2
        Toast.makeText(getApplicationContext(),"onCreate called", Toast.LENGTH_SHORT).show();
    }
    @Override
    protected void onStart(){
        super.onStart();
        Log.d("LifeCycle", "onStart called");
        // cau 2
        Toast.makeText(getApplicationContext(),"onStart called", Toast.LENGTH_SHORT).show();
    }
    @Override
    protected void onRestart(){
        super.onRestart();
        Log.d("LifeCycle", "onRestart called");
        // cau 2
        Toast.makeText(getApplicationContext(),"onRestart called", Toast.LENGTH_SHORT).show();
    }
    @Override
    protected void onResume(){
        super.onResume();
        Log.d("LifeCycle", "onResume called");
        // cau 2
        Toast.makeText(getApplicationContext(),"onResume called", Toast.LENGTH_SHORT).show();
    }
    @Override
    protected void onPause(){
        super.onPause();
        Log.d("LifeCycle", "onPause called");
        // cau 2
        Toast.makeText(getApplicationContext(),"onPause called", Toast.LENGTH_SHORT).show();
    }
    @Override
    protected void onStop(){
        super.onStop();
        Log.d("LifeCycle", "onStop called");
        // cau 2
        Toast.makeText(getApplicationContext(),"onStop called", Toast.LENGTH_SHORT).show();
    }
    @Override
    protected void onDestroy(){
        super.onDestroy();
        Log.d("LifeCycle", "onDestroy called");
        // cau 2
        Toast.makeText(getApplicationContext(),"onDestroy called", Toast.LENGTH_SHORT).show();
    }
}
