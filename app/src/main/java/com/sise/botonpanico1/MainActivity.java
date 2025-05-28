package com.sise.botonpanico1;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
private final String TAG = MainActivity.class.getSimpleName();
    private Button btnPerfilCiudadano;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.i(TAG, "Ejecutado metodo onCreate");
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        /*btnPerfilCiudadano = findViewById(R.id.antivitymain_btn_saludar);
        btnPerfilCiudadano.setOnClickListener(view->{
            Toast.makeText(this,"Abriendo Perfil ciudadano", Toast.LENGTH_SHORT).show();
        });*/
    }

    public void onClickPerfilCiudadano(View view){
        Toast.makeText(this,"abriendo perfil ciudadano", Toast.LENGTH_LONG).show();
    }
    @Override
    protected void onStart(){
        super.onStart();

        Log.i(TAG, "Ejecutado metodo onStart()");
    }
    @Override
    protected void onResume(){
        super.onResume();
        Log.i(TAG, "Ejecutado metodo onResume()");
    }
    @Override
    protected void onRestart(){
        super.onRestart();
        Log.i(TAG, "Ejecutado metodo onRestart()");
    }
    @Override
    protected void onPause(){
        super.onPause();
        Log.i(TAG, "Ejecutado metodo onPause()");
    }
    @Override
    protected void onStop(){
        super.onStop();
        Log.i(TAG, "Ejecutado metodo onStop()");
    }
    @Override
    protected void onDestroy(){
        super.onDestroy();
        Log.i(TAG, "Ejecutado metodo onDestroy()");
    }

    }