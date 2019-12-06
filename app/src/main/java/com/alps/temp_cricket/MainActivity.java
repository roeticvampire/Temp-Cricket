package com.alps.temp_cricket;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
TextView genSpeech;
TextView disp;
Button button;
EditText beats;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        genSpeech=findViewById(R.id.genSpeech);
        disp=findViewById(R.id.disp);
        button=findViewById(R.id.button);
        beats=findViewById(R.id.beats);
        disp.setVisibility(View.GONE);
        String genn= "Did you know \n that you can tell the temperature\n by counting the chirps of a cricket?\n It’s true!";
        genSpeech.setText(genn);
        //int chirp=0;
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {String str =beats.getText().toString().trim();
                if(str.length()>0)
                {int chirp = Integer.parseInt(str);
            double temp= chirp/3.0 +4.0;
            double fal= temp*10;
            fal= Math.round(fal);
            temp=fal/10;
            String outt= "The temperature is : "+temp+"° C";
            disp.setText(outt);
            disp.setVisibility(View.VISIBLE);}
                else disp.setVisibility(View.GONE);




            }
        });



    }
}
