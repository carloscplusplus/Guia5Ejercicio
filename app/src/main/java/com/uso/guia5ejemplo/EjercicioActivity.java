package com.uso.guia5ejemplo;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;

/**
 * Created by Carlos on 14/10/2017.
 */

public class EjercicioActivity extends AppCompatActivity {

    ImageView imgView1, imgView2, imgView3;
    Button btnAnim1,btnAnim2,btnAnim3;

    Animation bajar_Aparecer;

    Boolean   es_der;
    Boolean   es_arriba;
    Boolean   es_visible;
    Boolean   es_zoomIN;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ejercicio);
        btnAnim1    = (Button) findViewById(R.id.btnIZQ);
        btnAnim2    = (Button) findViewById(R.id.btnCENT);
        btnAnim3    = (Button) findViewById(R.id.btnDER);

        imgView1    = (ImageView) findViewById(R.id.coronaIZQ);
        imgView2    = (ImageView) findViewById(R.id.coronaCENT);
        imgView3    = (ImageView) findViewById(R.id.coronaDER);


        //combinado
        //horizontal IZQUIERDA
        bajar_Aparecer = AnimationUtils.loadAnimation(this, R.anim.bajar_aparecer);
        bajar_Aparecer.setDuration(1000);
        bajar_Aparecer.setFillAfter(false);

        //variables de estado
/*        es_der      =true;
        es_arriba   =true;
        es_visible  =true;
        es_zoomIN   =true;

*/
        //zoom IZQUIERDA
        btnAnim1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //v.startAnimation(bajar_Aparecer);
                imgView1.startAnimation(bajar_Aparecer);
                //Para limpiar de animacion [Importante]
                //imgView1.setAnimation(null);
            }
        });

        //zoom CENTRO
        btnAnim2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //v.startAnimation();
                imgView2.startAnimation(bajar_Aparecer);
                //Para limpiar de animacion [Importante]
                //imgView2.setAnimation(null);
                v.setAnimation(null);
            }
        });

        //zoom DERECHA
        btnAnim3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //v.startAnimation(bajar_Aparecer);
                imgView3.startAnimation(bajar_Aparecer);
                //Para limpiar de animacion [Importante]
                //imgView3.setAnimation(null);
            }
        });
    }
/*    private void animacionesARRIBA_ABAJO(){
        if(es_arriba) {
            imgView1.startAnimation(anim_arriba);
        }else{
            imgView1.startAnimation(anim_abajo);
        }
        es_arriba=!es_arriba;
   }*/
}

