package com.example.bulbul.cgpacalculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;

import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.InterstitialAd;

public class SecondSemester extends AppCompatActivity {
    private InterstitialAd interstitialAd;
    String[] CGPA_value;
    private Spinner CSE121,CSE122,CSE123,CSE124,CSE125,CSE126,CSE127;
    private TextView resultView;
    private Button button;
    double subCredit=18.0;
    double cse121,cse122,cse123,cse124,cse125,cse126,cse127;
    double totalCredit,result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second_semester);

        CGPA_value=getResources().getStringArray(R.array.main_subject);
        CSE121= (Spinner) findViewById(R.id.CS121);
        CSE122= (Spinner) findViewById(R.id.CS122);
        CSE123= (Spinner) findViewById(R.id.CS123);
        CSE124= (Spinner) findViewById(R.id.CS124);
        CSE125= (Spinner) findViewById(R.id.CS125);
        CSE126= (Spinner) findViewById(R.id.CS126);
        CSE127= (Spinner) findViewById(R.id.CS127);

        button= (Button) findViewById(R.id.show);
        resultView= (TextView) findViewById(R.id.resultId);



        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,R.layout.sample_view,R.id.textViewExampleId,CGPA_value);
        CSE121.setAdapter(adapter);
        ArrayAdapter<String> adapter2 = new ArrayAdapter<String>(this,R.layout.sample_view,R.id.textViewExampleId,CGPA_value);
        CSE122.setAdapter(adapter2);
        ArrayAdapter<String> adapter3 = new ArrayAdapter<String>(this,R.layout.sample_view,R.id.textViewExampleId,CGPA_value);
        CSE123.setAdapter(adapter3);
        ArrayAdapter<String> adapter4 = new ArrayAdapter<String>(this,R.layout.sample_view,R.id.textViewExampleId,CGPA_value);
        CSE124.setAdapter(adapter4);
        ArrayAdapter<String> adapter5 = new ArrayAdapter<String>(this,R.layout.sample_view,R.id.textViewExampleId,CGPA_value);
        CSE125.setAdapter(adapter5);
        ArrayAdapter<String> adapter6 = new ArrayAdapter<String>(this,R.layout.sample_view,R.id.textViewExampleId,CGPA_value);
        CSE126.setAdapter(adapter6);
        ArrayAdapter<String> adapter7 = new ArrayAdapter<String>(this,R.layout.sample_view,R.id.textViewExampleId,CGPA_value);
        CSE127.setAdapter(adapter7);


        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dataStructure();
                dataStructurePractical();
                electricalEngineering();
                electricalEngineeringPractical();
                Math();
                Statistics();
                discreteMath();

                totalCredit=cse121+cse122+cse123+cse124+cse125+cse126+cse127;
                result=(totalCredit/subCredit);
                //String CGPA= String.valueOf(result);
                resultView.setText(String.format( "Your Total CGPA is : %.2f", result ));


            }
        });
        setupInterstialAd();
    }

    //Intersetial add

    private void setupInterstialAd() {
        interstitialAd = new InterstitialAd(SecondSemester.this);
        interstitialAd.setAdUnitId(getResources().getString(R.string.intersetitial_add_unit));
        AdRequest adRequestFull = new AdRequest.Builder().build();
        interstitialAd.loadAd(adRequestFull);
        interstitialAd.setAdListener(new AdListener() {

            @Override
            public void onAdLoaded() {
                super.onAdLoaded();
                interstitialAd.show();
            }

        });
    }

    //-------------Method for CSE121----------------------

    public void dataStructure(){
        String value = CSE121.getSelectedItem().toString();
        if(value.equals("A+")){
            double setValue=4.0;
            cse121=setValue*3.0;



        }else if(value.equals("A")){
            double setValue=3.75;
            cse121=setValue*3.0;


        }else if(value.equals("A-")){
            double setValue=3.50;
            cse121=setValue*3.0;

        }else if(value.equals("B+")){
            double setValue=3.25;
            cse121=setValue*3.0;

        }else if(value.equals("B")){
            double setValue=3.00;
            cse121=setValue*3.0;

        }else if(value.equals("B-")){
            double setValue=2.75;
            cse121=setValue*3.0;

        }else if(value.equals("C+")){
            double setValue=2.50;
            cse121=setValue*3.0;

        }else if(value.equals("C")){
            double setValue=2.25;
            cse121=setValue*3.0;

        }else if(value.equals("D")){
            double setValue=2.00;
            cse121=setValue*3.0;

        }else if(value.equals("F")){
            double setValue=0.00;
            cse121=setValue*3.0;

        }
    }

    //---------------------Method for CSE122(Practical)----------------------------------------

    public void dataStructurePractical(){
        String value = CSE122.getSelectedItem().toString();
        if(value.equals("A+")){
            double setValue=4.0;
            cse122=setValue*1.5;

        }else if(value.equals("A")){
            double setValue=3.75;
            cse122=setValue*1.5;

        }else if(value.equals("A-")){
            double setValue=3.50;
            cse122=setValue*1.5;

        }else if(value.equals("B+")){
            double setValue=3.25;
            cse122=setValue*1.5;

        }else if(value.equals("B")){
            double setValue=3.00;
            cse122=setValue*1.5;

        }else if(value.equals("B-")){
            double setValue=2.75;
            cse122=setValue*1.5;

        }else if(value.equals("C+")){
            double setValue=2.50;
            cse122=setValue*1.5;

        }else if(value.equals("C")){
            double setValue=2.25;
            cse122=setValue*1.5;

        }else if(value.equals("D")){
            double setValue=2.00;
            cse122=setValue*1.5;

        }else if(value.equals("F")){
            double setValue=0.00;
            cse122=setValue*1.5;

        }

    }

    //----------------CSE123---------------------------------
    public void electricalEngineering(){
        String value = CSE123.getSelectedItem().toString();
        if(value.equals("A+")){
            double setValue=4.0;
            cse123=setValue*3.0;



        }else if(value.equals("A")){
            double setValue=3.75;
            cse123=setValue*3.0;


        }else if(value.equals("A-")){
            double setValue=3.50;
            cse123=setValue*3.0;

        }else if(value.equals("B+")){
            double setValue=3.25;
            cse123=setValue*3.0;

        }else if(value.equals("B")){
            double setValue=3.00;
            cse123=setValue*3.0;

        }else if(value.equals("B-")){
            double setValue=2.75;
            cse123=setValue*3.0;

        }else if(value.equals("C+")){
            double setValue=2.50;
            cse123=setValue*3.0;

        }else if(value.equals("C")){
            double setValue=2.25;
            cse123=setValue*3.0;

        }else if(value.equals("D")){
            double setValue=2.00;
            cse123=setValue*3.0;

        }else if(value.equals("F")){
            double setValue=0.00;
            cse123=setValue*3.0;

        }
    }

    //-----------------Method for CSE124(Practical)-----------------------------------------

    public void electricalEngineeringPractical(){
        String value = CSE124.getSelectedItem().toString();
        if(value.equals("A+")){
            double setValue=4.0;
            cse124=setValue*1.5;

        }else if(value.equals("A")){
            double setValue=3.75;
            cse124=setValue*1.5;

        }else if(value.equals("A-")){
            double setValue=3.50;
            cse124=setValue*1.5;

        }else if(value.equals("B+")){
            double setValue=3.25;
            cse124=setValue*1.5;

        }else if(value.equals("B")){
            double setValue=3.00;
            cse124=setValue*1.5;

        }else if(value.equals("B-")){
            double setValue=2.75;
            cse124=setValue*1.5;

        }else if(value.equals("C+")){
            double setValue=2.50;
            cse124=setValue*1.5;

        }else if(value.equals("C")){
            double setValue=2.25;
            cse124=setValue*1.5;

        }else if(value.equals("D")){
            double setValue=2.00;
            cse124=setValue*1.5;

        }else if(value.equals("F")){
            double setValue=0.00;
            cse124=setValue*1.5;

        }

    }

    //----------------------Method for CSE125-----------------------------

    public void Math(){
        String value = CSE125.getSelectedItem().toString();
        if(value.equals("A+")){
            double setValue=4.0;
            cse125=setValue*3.0;



        }else if(value.equals("A")){
            double setValue=3.75;
            cse125=setValue*3.0;


        }else if(value.equals("A-")){
            double setValue=3.50;
            cse125=setValue*3.0;

        }else if(value.equals("B+")){
            double setValue=3.25;
            cse125=setValue*3.0;

        }else if(value.equals("B")){
            double setValue=3.00;
            cse125=setValue*3.0;

        }else if(value.equals("B-")){
            double setValue=2.75;
            cse125=setValue*3.0;

        }else if(value.equals("C+")){
            double setValue=2.50;
            cse125=setValue*3.0;

        }else if(value.equals("C")){
            double setValue=2.25;
            cse125=setValue*3.0;

        }else if(value.equals("D")){
            double setValue=2.00;
            cse125=setValue*3.0;

        }else if(value.equals("F")){
            double setValue=0.00;
            cse125=setValue*3.0;

        }
    }

    //-----------------------Method for CSE126---------------------

    public void Statistics(){
        String value = CSE126.getSelectedItem().toString();
        if(value.equals("A+")){
            double setValue=4.0;
            cse126=setValue*3.0;



        }else if(value.equals("A")){
            double setValue=3.75;
            cse126=setValue*3.0;


        }else if(value.equals("A-")){
            double setValue=3.50;
            cse126=setValue*3.0;

        }else if(value.equals("B+")){
            double setValue=3.25;
            cse126=setValue*3.0;

        }else if(value.equals("B")){
            double setValue=3.00;
            cse126=setValue*3.0;

        }else if(value.equals("B-")){
            double setValue=2.75;
            cse126=setValue*3.0;

        }else if(value.equals("C+")){
            double setValue=2.50;
            cse126=setValue*3.0;

        }else if(value.equals("C")){
            double setValue=2.25;
            cse126=setValue*3.0;

        }else if(value.equals("D")){
            double setValue=2.00;
            cse126=setValue*3.0;

        }else if(value.equals("F")){
            double setValue=0.00;
            cse126=setValue*3.0;

        }
    }

    //-------------------------Method for CSE127------------------------------------

    public void discreteMath(){
        String value = CSE127.getSelectedItem().toString();
        if(value.equals("A+")){
            double setValue=4.0;
            cse127=setValue*3.0;



        }else if(value.equals("A")){
            double setValue=3.75;
            cse127=setValue*3.0;


        }else if(value.equals("A-")){
            double setValue=3.50;
            cse127=setValue*3.0;

        }else if(value.equals("B+")){
            double setValue=3.25;
            cse127=setValue*3.0;

        }else if(value.equals("B")){
            double setValue=3.00;
            cse127=setValue*3.0;

        }else if(value.equals("B-")){
            double setValue=2.75;
            cse127=setValue*3.0;

        }else if(value.equals("C+")){
            double setValue=2.50;
            cse127=setValue*3.0;

        }else if(value.equals("C")){
            double setValue=2.25;
            cse127=setValue*3.0;

        }else if(value.equals("D")){
            double setValue=2.00;
            cse127=setValue*3.0;

        }else if(value.equals("F")){
            double setValue=0.00;
            cse127=setValue*3.0;

        }
    }

}
