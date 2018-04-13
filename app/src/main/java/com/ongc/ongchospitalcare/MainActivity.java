package com.ongc.ongchospitalcare;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemSelectedListener;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.Spinner;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends Activity implements
        OnItemSelectedListener{
    Spinner s1,s2,spinner;
    AutoCompleteTextView suggestion_box;
    ongcDatabaseHelper db;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        // TODO Auto-generated method stub
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        s1 = (Spinner)findViewById(R.id.spinner1);
        s2 = (Spinner)findViewById(R.id.spinner2);
        suggestion_box=(AutoCompleteTextView) findViewById(R.id.suggestionbox);
        s1.setOnItemSelectedListener(this);



    }
    @Override
    public void onItemSelected(AdapterView<?> arg0, View arg1, int arg2,
                               long arg3) {
        // TODO Auto-generated method stub
        String sp1= String.valueOf(s1.getSelectedItem());
        Toast.makeText(this, sp1, Toast.LENGTH_SHORT).show();



        if(sp1.contentEquals("TAB")) {
            List<String> list = new ArrayList<String>();
            list.add("Clofranil (50 mg)");
            list.add("Clomidac (50 mg)");
            list.add("Clonil (10 mg)");
            list.add("Clomine (75 mg)");
            list.add("Lonazep (1 mg)");
            list.add("Lozep (2 mg)");
            ArrayAdapter<String> dataAdapter = new ArrayAdapter<String>(this,
                    android.R.layout.simple_spinner_item, list);
            dataAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
            dataAdapter.notifyDataSetChanged();
            s2.setAdapter(dataAdapter);
            suggestion_box.setAdapter(dataAdapter);
        }
        if(sp1.contentEquals("CAP")) {
            List<String> list = new ArrayList<String>();
            list.add("Amoxybid (250 Mg)");
            list.add("Blumox (500 Mg)");
            list.add("Comoxyl (500 Mg)");
            list.add("Mox (500 Mg)");
            list.add("Danogen -100");
            ArrayAdapter<String> dataAdapter2 = new ArrayAdapter<String>(this,
                    android.R.layout.simple_spinner_item, list);
            dataAdapter2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
            dataAdapter2.notifyDataSetChanged();
            s2.setAdapter(dataAdapter2);
            suggestion_box.setAdapter(dataAdapter2);
        }
        if(sp1.contentEquals("SPRAY")) {
            List<String> list = new ArrayList<String>();
            list.add("Flomist Nasal Spray");
            list.add("FLOWN");
            list.add("Fluticone Nasal  Spray");
            list.add("Ctrivin (10 ml)");
            list.add("Meta (50 mcg)");
            ArrayAdapter<String> dataAdapter2 = new ArrayAdapter<String>(this,
                    android.R.layout.simple_spinner_item, list);
            dataAdapter2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
            dataAdapter2.notifyDataSetChanged();
            s2.setAdapter(dataAdapter2);
            suggestion_box.setAdapter(dataAdapter2);
        }
        if(sp1.contentEquals("LCL APPLN")) {
            List<String> list = new ArrayList<String>();
            list.add("Ovidine");
            list.add("HYDROCOLL 10 X 10cm");
            list.add("Atrauman");
            list.add("Fucidin Cream (5gm)");
            list.add("Fastum gel");
            ArrayAdapter<String> dataAdapter2 = new ArrayAdapter<String>(this,
                    android.R.layout.simple_spinner_item, list);
            dataAdapter2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
            dataAdapter2.notifyDataSetChanged();
            s2.setAdapter(dataAdapter2);
            suggestion_box.setAdapter(dataAdapter2);
        }
        if(sp1.contentEquals("ROLL")) {
            List<String> list = new ArrayList<String>();
            list.add("Safix (15cm)");
            list.add("Orthoroll  (15cm)");
            list.add("Leukocrep (10cm)");
            list.add("Leukocrep (8cm)");
            list.add("Articast (12.5 Cm)");
            ArrayAdapter<String> dataAdapter2 = new ArrayAdapter<String>(this,
                    android.R.layout.simple_spinner_item, list);
            dataAdapter2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
            dataAdapter2.notifyDataSetChanged();
            s2.setAdapter(dataAdapter2);
            suggestion_box.setAdapter(dataAdapter2);
        }
        if(sp1.contentEquals("RESPULES")) {
            List<String> list = new ArrayList<String>();
            list.add("Asthalin Respules");
            list.add("Budecort (.5mg) Respules (2ml)");
            list.add("Derihaler (2.5ml)");
            list.add("Derihaler (2.5ml)");
            list.add("Derinide (2ml)");
            ArrayAdapter<String> dataAdapter2 = new ArrayAdapter<String>(this,
                    android.R.layout.simple_spinner_item, list);
            dataAdapter2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
            dataAdapter2.notifyDataSetChanged();
            s2.setAdapter(dataAdapter2);
            suggestion_box.setAdapter(dataAdapter2);
        }
        if(sp1.contentEquals("TAPE")) {
            List<String> list = new ArrayList<String>();
            list.add("Micropore 10 cm");
            list.add("Micropore (2.5 cm)");
            list.add("Micropore (5 cm)");
            list.add("Micropore (7.5 cm)");
            list.add("BAND-AID");
            ArrayAdapter<String> dataAdapter2 = new ArrayAdapter<String>(this,
                    android.R.layout.simple_spinner_item, list);
            dataAdapter2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
            dataAdapter2.notifyDataSetChanged();
            s2.setAdapter(dataAdapter2);
            suggestion_box.setAdapter(dataAdapter2);
        }
        if(sp1.contentEquals("RESPICAPS")) {
            List<String> list = new ArrayList<String>();
            list.add("Formonide 200 Resp");
            ArrayAdapter<String> dataAdapter2 = new ArrayAdapter<String>(this,
                    android.R.layout.simple_spinner_item, list);
            dataAdapter2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
            dataAdapter2.notifyDataSetChanged();
            s2.setAdapter(dataAdapter2);
            suggestion_box.setAdapter(dataAdapter2);
        }
        if(sp1.contentEquals("LOTION")) {
            List<String> list = new ArrayList<String>();
            list.add("Wokadine Sugical Scrub (500ml)");
            list.add("povidone Surgical Scrub (500ml)");
            list.add("Wokadine Sugical Scrub (250ml)");
            list.add("Ascabiol");
            list.add("Emscab");
            ArrayAdapter<String> dataAdapter2 = new ArrayAdapter<String>(this,
                    android.R.layout.simple_spinner_item, list);
            dataAdapter2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
            dataAdapter2.notifyDataSetChanged();
            s2.setAdapter(dataAdapter2);
            suggestion_box.setAdapter(dataAdapter2);
        }
        if(sp1.contentEquals("SACHET")) {
            List<String> list = new ArrayList<String>();
            list.add("Biogit");
            list.add("Econorm");
            list.add("Rock Bon Vitanules");
            list.add("Novalac Z");
            list.add("Enterolife Sachet");
            ArrayAdapter<String> dataAdapter2 = new ArrayAdapter<String>(this,
                    android.R.layout.simple_spinner_item, list);
            dataAdapter2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
            dataAdapter2.notifyDataSetChanged();
            s2.setAdapter(dataAdapter2);
            suggestion_box.setAdapter(dataAdapter2);
        }
        if(sp1.contentEquals("SUPPOST")) {
            List<String> list = new ArrayList<String>();
            list.add("Glycerine Suppost ( Child )");
            list.add("Justin Supp (100mg)");
            list.add("Glycerine Suppost ( Adult )");
            list.add("Dulcolax Suppos (Adult)");
            list.add("Dulcolax Suppos ( Child)");
            ArrayAdapter<String> dataAdapter2 = new ArrayAdapter<String>(this,
                    android.R.layout.simple_spinner_item, list);
            dataAdapter2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
            dataAdapter2.notifyDataSetChanged();
            s2.setAdapter(dataAdapter2);
            suggestion_box.setAdapter(dataAdapter2);
        }
        if(sp1.contentEquals("INHALER")) {
            List<String> list = new ArrayList<String>();
            list.add("Seretide Accuhaler 250");
            list.add("Foracort 100");
            list.add("Beclate 100");
            list.add("Duolin");
            list.add("Foracort 400");
            ArrayAdapter<String> dataAdapter2 = new ArrayAdapter<String>(this,
                    android.R.layout.simple_spinner_item, list);
            dataAdapter2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
            dataAdapter2.notifyDataSetChanged();
            s2.setAdapter(dataAdapter2);
            suggestion_box.setAdapter(dataAdapter2);
        }
        if(sp1.contentEquals("SET")) {
            List<String> list = new ArrayList<String>();
            list.add("RockBon PTH  Pen");
            ArrayAdapter<String> dataAdapter2 = new ArrayAdapter<String>(this,
                    android.R.layout.simple_spinner_item, list);
            dataAdapter2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
            dataAdapter2.notifyDataSetChanged();
            s2.setAdapter(dataAdapter2);
            suggestion_box.setAdapter(dataAdapter2);
        }
        if(sp1.contentEquals("POWDER")) {
            List<String> list = new ArrayList<String>();
            list.add("Neosporin (10gm)");
            list.add("Triben  Dusting Powder");
            list.add("Nebasulf");
            ArrayAdapter<String> dataAdapter2 = new ArrayAdapter<String>(this,
                    android.R.layout.simple_spinner_item, list);
            dataAdapter2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
            dataAdapter2.notifyDataSetChanged();
            s2.setAdapter(dataAdapter2);
            suggestion_box.setAdapter(dataAdapter2);
        }
        if(sp1.contentEquals("DROP")) {
            List<String> list = new ArrayList<String>();
            list.add("Candid Ear");
            list.add("Locula 20%");
            list.add("Moxoft-KTL");
            list.add("Latoprost R T Eye Drop");
            list.add("Travisight");
            ArrayAdapter<String> dataAdapter2 = new ArrayAdapter<String>(this,
                    android.R.layout.simple_spinner_item, list);
            dataAdapter2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
            dataAdapter2.notifyDataSetChanged();
            s2.setAdapter(dataAdapter2);
            suggestion_box.setAdapter(dataAdapter2);
        }
        if(sp1.contentEquals("INJ")) {
            List<String> list = new ArrayList<String>();
            list.add("SII RABIVAX");
            list.add("Pregnyl 5000 I.U.");
            list.add("Metronidazol");
            list.add("Pentazocin");
            list.add("Pethidine");
            ArrayAdapter<String> dataAdapter2 = new ArrayAdapter<String>(this,
                    android.R.layout.simple_spinner_item, list);
            dataAdapter2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
            dataAdapter2.notifyDataSetChanged();
            s2.setAdapter(dataAdapter2);
            suggestion_box.setAdapter(dataAdapter2);
        }
        if(sp1.contentEquals("LIQUID")) {
            List<String> list = new ArrayList<String>();
            list.add("Avil Expectorant");
            list.add("Chericof");
            list.add("Cofrom syp");
            list.add("Megaclav Syp");
            list.add("Piriton CS");
            ArrayAdapter<String> dataAdapter2 = new ArrayAdapter<String>(this,
                    android.R.layout.simple_spinner_item, list);
            dataAdapter2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
            dataAdapter2.notifyDataSetChanged();
            s2.setAdapter(dataAdapter2);
            suggestion_box.setAdapter(dataAdapter2);
        }


    }
    @Override
    public void onNothingSelected(AdapterView<?> arg0) {
        // TODO Auto-generated method stub

    }
    public void movetoAlarm(View view)
    {
        Intent intent2=new Intent(this, alarmActivity.class);
        startActivity(intent2);
    }
    private void loadSpinnerData()
    {
        List<String> labels=db.getAllLabels2();
        ArrayAdapter<String> adapter=new ArrayAdapter<String>(this,android.R.layout.simple_spinner_item,labels);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(adapter);
    }
    private void loadSpinnerData1()
    {
        List<String> labels=db.getAllLabels3();
        ArrayAdapter<String> adapter=new ArrayAdapter<String>(this,android.R.layout.simple_spinner_item,labels);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(adapter);
    }
    private void loadSpinnerData2()
    {
        List<String> labels=db.getAllLabels4();
        ArrayAdapter<String> adapter=new ArrayAdapter<String>(this,android.R.layout.simple_spinner_item,labels);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(adapter);
    }
    private void loadSpinnerData3()
    {
        List<String> labels=db.getAllLabels5();
        ArrayAdapter<String> adapter=new ArrayAdapter<String>(this,android.R.layout.simple_spinner_item,labels);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(adapter);
    }
    private void loadSpinnerData4()
    {
        List<String> labels=db.getAllLabels6();
        ArrayAdapter<String> adapter=new ArrayAdapter<String>(this,android.R.layout.simple_spinner_item,labels);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(adapter);
    }
    private void loadSpinnerData5()
    {
        List<String> labels=db.getAllLabels7();
        ArrayAdapter<String> adapter=new ArrayAdapter<String>(this,android.R.layout.simple_spinner_item,labels);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(adapter);
    }
    private void loadSpinnerData6()
    {
        List<String> labels=db.getAllLabels8();
        ArrayAdapter<String> adapter=new ArrayAdapter<String>(this,android.R.layout.simple_spinner_item,labels);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(adapter);
    }
    private void loadSpinnerData7()
    {
        List<String> labels=db.getAllLabels9();
        ArrayAdapter<String> adapter=new ArrayAdapter<String>(this,android.R.layout.simple_spinner_item,labels);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(adapter);
    }
    private void loadSpinnerData8()
    {
        List<String> labels=db.getAllLabels10();
        ArrayAdapter<String> adapter=new ArrayAdapter<String>(this,android.R.layout.simple_spinner_item,labels);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(adapter);
    }
    private void loadSpinnerData9()
    {
        List<String> labels=db.getAllLabels11();
        ArrayAdapter<String> adapter=new ArrayAdapter<String>(this,android.R.layout.simple_spinner_item,labels);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(adapter);
    }
    private void loadSpinnerData10()
    {
        List<String> labels=db.getAllLabels12();
        ArrayAdapter<String> adapter=new ArrayAdapter<String>(this,android.R.layout.simple_spinner_item,labels);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(adapter);
    }
    private void loadSpinnerData11()
    {
        List<String> labels=db.getAllLabels13();
        ArrayAdapter<String> adapter=new ArrayAdapter<String>(this,android.R.layout.simple_spinner_item,labels);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(adapter);
    }
    private void loadSpinnerData12()
    {
        List<String> labels=db.getAllLabels14();
        ArrayAdapter<String> adapter=new ArrayAdapter<String>(this,android.R.layout.simple_spinner_item,labels);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(adapter);
    }
    private void loadSpinnerData13()
    {
        List<String> labels=db.getAllLabels15();
        ArrayAdapter<String> adapter=new ArrayAdapter<String>(this,android.R.layout.simple_spinner_item,labels);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(adapter);
    }


}


