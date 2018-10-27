package com.example.a21_pc14.evaluacionii_moviles;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private static final String TAG ="DEPURACION" ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

setTitle("RH13-I04-002     USO");



    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d(TAG, "Estamos en el evento onPause");
    }

    @Override
    protected void onPostResume() {
        super.onPostResume();

        Log.d(TAG, "Estamos en el evento onResume");
        //validacion si el alto es mayor q el ancho
        if(this.getWindowManager().getDefaultDisplay().getHeight() >
                this.getWindowManager().getDefaultDisplay().getWidth()){
            Toast.makeText(this, "La pantalla esta en vertical", Toast.LENGTH_SHORT).show();
        }else{
            Toast.makeText(this, "La pantalla esta en horizontal", Toast.LENGTH_SHORT).show();
        }




    }
}
