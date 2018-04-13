package com.ongc.ongchospitalcare;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Dell-pc on 12-06-2017.
 */

public class ongcDatabaseHelper extends SQLiteOpenHelper{
    private static final String DB_NAME = "ongcDatabase";
    private static final int DB_VERSION = 1; // the version of the database
    private static final String TABLE_NAME="medicine";
    private static final String KEY_ID="key_id";
    private static final String CATEGORY="category";
    private static final String MED_NAME="med_name";



     ongcDatabaseHelper(Context context) {
        super(context, DB_NAME,null,DB_VERSION );
    }

    @Override
    public void onCreate(SQLiteDatabase db) {

        String CREATE_TABLE="CREATE TABLE"+TABLE_NAME+"("+KEY_ID+"INTEGER PRIMARY KEY AUTOINCREMENT,"+CATEGORY+"TEXT,"+MED_NAME+"TEXT"+")";
        db.execSQL( CREATE_TABLE);
        insertTABLE_NAME(db, "TAB", "CLOFRANIL (50 mg)");
        insertTABLE_NAME(db, "TAB", "CLOMIDAC (50 mg)");
        insertTABLE_NAME(db, "TAB", "CLOMINE (75 mg)");
        insertTABLE_NAME(db, "TAB", "CLONIL (10 mg)");
        insertTABLE_NAME(db, "TAB", "CLONIL (25 mg)");
        insertTABLE_NAME(db, "TAB", "CLONIL (50 mg)");
        insertTABLE_NAME(db, "INJ", "CLONIL (75 mg)");
        insertTABLE_NAME(db, "INJ", "LONAZEP (.25 mg)");
        insertTABLE_NAME(db, "INJ", "LONAZEP (1.5 mg)");
        insertTABLE_NAME(db, "INJ", "LONAZEP (2 mg)");
        insertTABLE_NAME(db, "INJ", "LOZEP (.5 mg)");
        insertTABLE_NAME(db, "INJ", "LOZEP (2 mg)");
        insertTABLE_NAME(db, "DROP", "Ozepam (.5 mg)");
        insertTABLE_NAME(db, "DROP", "Rivotril (.5 Mg)");
        insertTABLE_NAME(db, "DROP", "Rivotril (2 Mg)");
        insertTABLE_NAME(db, "DROP", "Arkamin (100 mcg)");
        insertTABLE_NAME(db, "DROP", "Cargrel 75");
        insertTABLE_NAME(db, "DROP", "Clopivas AP 150");
        insertTABLE_NAME(db, "LIQUID", "Avil Expectorant");
        insertTABLE_NAME(db, "LIQUID", "Chericof");
        insertTABLE_NAME(db, "LIQUID", "Plagril (75 mg)");
        insertTABLE_NAME(db, "LIQUID", "Plagril A (75 Mg)");
        insertTABLE_NAME(db, "LIQUID", "Candid V6");
        insertTABLE_NAME(db, "LIQUID", "Surfaz V");
        insertTABLE_NAME(db, "CAP", "Sizopin (100 mg)");
        insertTABLE_NAME(db, "CAP", "Sizopin (25 mg)");
        insertTABLE_NAME(db, "CAP", "Sizopin (50 mg)");
        insertTABLE_NAME(db, "CAP", "Skizoril (100 mg)");
        insertTABLE_NAME(db, "CAP", "Skizoril (25 mg)");
        insertTABLE_NAME(db, "CAP", "Skizoril (50 mg)");
        insertTABLE_NAME(db, "SPRAY", "Syclop (100 mg)");
        insertTABLE_NAME(db, "SPRAY", "Syclop (25 mg)");
        insertTABLE_NAME(db, "SPRAY", "Zopin (100 mg)");
        insertTABLE_NAME(db, "SPRAY", "Zopin (25 mg)");
        insertTABLE_NAME(db, "SPRAY", "Zopin (50 mg)");
        insertTABLE_NAME(db, "SPRAY", "Eurythmic (100 Mg)");
        insertTABLE_NAME(db, "LCL APPLN", "Eurythmic (200 Mg)");
        insertTABLE_NAME(db, "LCL APPLN", "Eliwel (10 mg)");
        insertTABLE_NAME(db, "LCL APPLN", "Eliwel (25 mg)");
        insertTABLE_NAME(db, "LCL APPLN", "Eliwel (75 mg)");
        insertTABLE_NAME(db, "LCL APPLN", "Goldep SR (10 mg)");
        insertTABLE_NAME(db, "LCL APPLN", "Goldep SR (25 mg)");
        insertTABLE_NAME(db, "ROLL", "Libotryp (12.5 mg)");
        insertTABLE_NAME(db, "ROLL", "Libotrypds (25 mg)");
        insertTABLE_NAME(db, "ROLL", "Sarotena (10 mg)");
        insertTABLE_NAME(db, "ROLL", "Sarotena (75 mg)");
        insertTABLE_NAME(db, "ROLL", "Tryptomer (10 Mg)");
        insertTABLE_NAME(db, "ROLL", "Tryptomer (25 Mg)");
        insertTABLE_NAME(db, "TAB", "Tryptomer (75 Mg)");
        insertTABLE_NAME(db, "RESPULES", "Cordarone X 200");
        insertTABLE_NAME(db, "RESPULES", "Amcard (2.5 Mg)");
        insertTABLE_NAME(db, "RESPULES", "Amcard (5 Mg)");
        insertTABLE_NAME(db, "RESPULES", "Amlodac (2.5 Mg)");
        insertTABLE_NAME(db, "RESPULES", "Amlodac (5 Mg)");
        insertTABLE_NAME(db, "RESPULES", "Amlodepin (2.5 mg)");
        insertTABLE_NAME(db, "TAPE", "Amlodepin (5 mg)");
        insertTABLE_NAME(db, "TAPE", "Corvadil (2.5 Mg)");
        insertTABLE_NAME(db, "TAPE", "Corvadil (5 Mg)");
        insertTABLE_NAME(db, "TAPE", "Myodura (2.5 Mg)");
        insertTABLE_NAME(db, "TAPE", "Myodura (5 Mg)");
        insertTABLE_NAME(db, "TAPE", "Stamlo (2.5 Mg)");
        insertTABLE_NAME(db, "PKT", "Stamlo (5 Mg)");
        insertTABLE_NAME(db, "PKT", "Amcard  A T");
        insertTABLE_NAME(db, "PKT", "Amdepin A T");
        insertTABLE_NAME(db, "PKT", "Amlodac AT");
        insertTABLE_NAME(db, "PKT", "Amlodepin AT");
        insertTABLE_NAME(db, "PKT", "Corvadil A");
        insertTABLE_NAME(db, "RESPICAPS", "Stamlo Beta");
        insertTABLE_NAME(db, "RESPICAPS", "Amlopress AT");
        insertTABLE_NAME(db, "RESPICAPS", "Demolox (50 mg)");
        insertTABLE_NAME(db, "RESPICAPS", "Elden (25 mg)");
        insertTABLE_NAME(db, "RESPICAPS", "Elden (75 mg)");
        insertTABLE_NAME(db, "RESPICAPS", "Exodep (25 mg)");
        insertTABLE_NAME(db, "LOTION", "Dolonil-S");
        insertTABLE_NAME(db, "LOTION", "Azilide (500MG)");
        insertTABLE_NAME(db, "LOTION", "Microcef-200 DT");
        insertTABLE_NAME(db, "LOTION", "Nelsid-DS");
        insertTABLE_NAME(db, "LOTION", "Nelsid");
        insertTABLE_NAME(db, "LOTION", "LEPEZ-30");
        insertTABLE_NAME(db, "SACHET", "Nuroclad Forte");
        insertTABLE_NAME(db, "SACHET", "Sistal Plus");
        insertTABLE_NAME(db, "SACHET", "Biopril-AM");
        insertTABLE_NAME(db, "SACHET", "Odifex-120");
        insertTABLE_NAME(db, "SACHET", "Diaglim-1");
        insertTABLE_NAME(db, "SACHET", "Diaglim-2");
        insertTABLE_NAME(db, "SACHET", "Symtor (20mg)");
        insertTABLE_NAME(db, "SACHET", "LINOSPAN-600");
        insertTABLE_NAME(db, "SUPPOST", "Voltanec");
        insertTABLE_NAME(db, "SUPPOST", "Full-24");
        insertTABLE_NAME(db, "SUPPOST", "Orofer XT");
        insertTABLE_NAME(db, "SUPPOST", "Emsulide");
        insertTABLE_NAME(db, "SUPPOST", "Ziprax-200 DT");
        insertTABLE_NAME(db, "SUPPOST", "Azithral-500");
        insertTABLE_NAME(db, "INHALER", "Pioglar -15");
        insertTABLE_NAME(db, "INHALER", "Pioglar -30");
        insertTABLE_NAME(db, "INHALER", "Pioglar-M ,15+500");
        insertTABLE_NAME(db, "INHALER", "Losar-A");
        insertTABLE_NAME(db, "INHALER", "Lasix");
        insertTABLE_NAME(db, "INHALER", "Cycloset- TM");
        insertTABLE_NAME(db, "SET", "Plavas 150");
        insertTABLE_NAME(db, "SET", "Plavas 75");
        insertTABLE_NAME(db, "SET", "New Livfit");
        insertTABLE_NAME(db, "SET", "Regesterone (5 mg)");
        insertTABLE_NAME(db, "SET", "Tegrital  CR 200");
        insertTABLE_NAME(db, "SET", "Pantocid (40 mg)");
        insertTABLE_NAME(db, "POWDER", "Urivoid (25 mg)");
        insertTABLE_NAME(db, "POWDER", "Montair -10");
        insertTABLE_NAME(db, "POWDER", "Telmisat - H");
        insertTABLE_NAME(db, "POWDER", "Telmisat - 40");
        insertTABLE_NAME(db, "POWDER", "Sun Prazin (25 mg)");
        insertTABLE_NAME(db, "POWDER", "Flagyl (200mg)");
        insertTABLE_NAME(db, "ROTACAP", "Metrogyl 400");
        insertTABLE_NAME(db, "ROTACAP", "Metron");
        insertTABLE_NAME(db, "ROTACAP", "Depnon (10 mg)");
        insertTABLE_NAME(db, "ROTACAP", "Depnon (30 mg)");
        insertTABLE_NAME(db, "ROTACAP", "Seridac (30 mg)");
        insertTABLE_NAME(db, "ROTACAP", "Geston (100 mg)");
        insertTABLE_NAME(db, "SYRINGE", "Geston (200 mg)");
        insertTABLE_NAME(db, "SYRINGE", "Microgest (200 Mg)");
        insertTABLE_NAME(db, "SYRINGE", "Susten (100 Mg)");
        insertTABLE_NAME(db, "SYRINGE", "Susten (200 Mg)");
        insertTABLE_NAME(db, "SYRINGE", "Susten (400 Mg)");
        insertTABLE_NAME(db, "SYRINGE", "Uniprogestin M (100 mg)");
        insertTABLE_NAME(db, "TAB", "Uterogeston (100 mg)");
        insertTABLE_NAME(db, "TAB", "Uterogeston (200 mg)");
        insertTABLE_NAME(db, "TAB", "Minoz");
        insertTABLE_NAME(db, "TAB", "Mirazep (15 mg)");
        insertTABLE_NAME(db, "TAB", "Mirnite (15 mg)");
        insertTABLE_NAME(db, "TAB", "Mirnite (30 mg)");
        insertTABLE_NAME(db, "TAB", "Mirnite (45 mg)");
        insertTABLE_NAME(db, "TAB", "Mirt (15 mg)");
        insertTABLE_NAME(db, "TAB", "Mirt (45 mg)");
        insertTABLE_NAME(db, "TAB", "Mirtaz (15 mg)");
        insertTABLE_NAME(db, "TAB", "Mirtaz (30 mg)");
        insertTABLE_NAME(db, "TAB", "Mirtaz (7.5 mg)");
        insertTABLE_NAME(db, "TAB", "Morex (150 Mg)");
        insertTABLE_NAME(db, "TAB", "Morex (300 Mg)");
        insertTABLE_NAME(db, "TAB", "Morcontin (10 mg)");
        insertTABLE_NAME(db, "TAB", "Morcontin (30 mg)");
        insertTABLE_NAME(db, "TAB", "Dugesic");
        insertTABLE_NAME(db, "TAB", "Lobak");
        insertTABLE_NAME(db, "TAB", "Myospaz Forte");
        insertTABLE_NAME(db, "TAB", "Veniz-XR (75 mg)");
        insertTABLE_NAME(db, "TAB", "Exodep (75 mg)");
        insertTABLE_NAME(db, "TAB", "Prothiaden 25");
        insertTABLE_NAME(db, "TAB", "Prothiaden 75");
        insertTABLE_NAME(db, "TAB", "Doxacard (1 mg)");
        insertTABLE_NAME(db, "TAB", "Doxacard (2 mg)");
        insertTABLE_NAME(db, "TAB", "Doxacard (4 mg)");
        insertTABLE_NAME(db, "TAB", "Ceedox DT 100");
        insertTABLE_NAME(db, "TAB", "Doxy -1");
        insertTABLE_NAME(db, "TAB", "Nomit (10 Mg)");
        insertTABLE_NAME(db, "TAB", "Drotin Ds");
        insertTABLE_NAME(db, "TAB", "Nobel Spas");
        insertTABLE_NAME(db, "TAB", "Duphaston (10 Mg)");
        insertTABLE_NAME(db, "TAB", "Ebast - 20");
        insertTABLE_NAME(db, "TAB", "Erostin 10");
        insertTABLE_NAME(db, "TAB", "ECee2");
        insertTABLE_NAME(db, "TAB", "Norlevo");
        insertTABLE_NAME(db, "TAB", "Enace (2.5 mg)");
        insertTABLE_NAME(db, "TAB", "Enapril (10 mg)");
        insertTABLE_NAME(db, "TAB", "Enapril (2.5 mg)");
        insertTABLE_NAME(db, "TAB", "Myoace (5 Mg)");
        insertTABLE_NAME(db, "TAB", "Becozyme C Forte");
        insertTABLE_NAME(db, "TAB", "XYZ3");
        insertTABLE_NAME(db, "TAB", "Zincovit");
        insertTABLE_NAME(db, "TAB", "Betahist / Forte (16mg)");
        insertTABLE_NAME(db, "TAB", "Betahist / Forte (8mg)");
        insertTABLE_NAME(db, "TAB", "Betavert (16 mg)");
        insertTABLE_NAME(db, "TAB", "Vertin (8 mg)");
        insertTABLE_NAME(db, "TAB", "Vertistar (8 mg)");
        insertTABLE_NAME(db, "TAB", "Betnelan");
        insertTABLE_NAME(db, "TAB", "Betnesol");
        insertTABLE_NAME(db, "TAB", "B-Crip (2.5 mg)");
        insertTABLE_NAME(db, "TAB", "B-Crip (5 mg)");
        insertTABLE_NAME(db, "TAB", "Parlodel (2.5 mg)");
        insertTABLE_NAME(db, "TAB", "Proctinal (1.25 mg)");
        insertTABLE_NAME(db, "TAB", "Proctinal (2.5 mg)");
        insertTABLE_NAME(db, "TAB", "Sicriptine (1.25 mg)");
        insertTABLE_NAME(db, "TAB", "Sicriptine (2.5 mg)");
        insertTABLE_NAME(db, "TAB", "Parlodel (2.5 mg)");
        insertTABLE_NAME(db, "TAB", "Serne (100 mg)");
        insertTABLE_NAME(db, "TAB", "Serne (25 mg)");
        insertTABLE_NAME(db, "TAB", "Serne (50 mg)");
        insertTABLE_NAME(db, "TAB", "Serta  (100 Mg)");
        insertTABLE_NAME(db, "TAB", "Serta  (25 Mg)");
        insertTABLE_NAME(db, "TAB", "Sertil (50 mg)");
        insertTABLE_NAME(db, "TAB", "Sertima (100 mg)");
        insertTABLE_NAME(db, "TAB", "Sertima (50 mg)");
        insertTABLE_NAME(db, "TAB", "Tralin (100 mg)");
        insertTABLE_NAME(db, "TAB", "Tralin (50 mg)");
        insertTABLE_NAME(db, "TAB", "Xsert (50 mg)");
        insertTABLE_NAME(db, "TAB", "Zert-od (25 mg)");
        insertTABLE_NAME(db, "TAB", "Zert-od (50 mg)");
        insertTABLE_NAME(db, "TAB", "Zosert (100 mg)");
        insertTABLE_NAME(db, "TAB", "Zosert (25 mg)");
        insertTABLE_NAME(db, "TAB", "Zosert (50 mg)");
        insertTABLE_NAME(db, "TAB", "Zotral (100 mg)");
        insertTABLE_NAME(db, "TAB", "Zotral (25 mg)");
        insertTABLE_NAME(db, "TAB", "Zotral (50 mg)");
        insertTABLE_NAME(db, "TAB", "Simvas 10");
        insertTABLE_NAME(db, "TAB", "Zosta 10");
        insertTABLE_NAME(db, "TAB", "Epilex 200");
        insertTABLE_NAME(db, "TAB", "Valparin (200mg)");
        insertTABLE_NAME(db, "TAB", "Encorate (200 Mg)");
        insertTABLE_NAME(db, "TAB", "Encorate (300 Mg)");
        insertTABLE_NAME(db, "TAB", "Encorate Chrono (200 Mg)");
        insertTABLE_NAME(db, "TAB", "Encorate Chrono (500 Mg)");
        insertTABLE_NAME(db, "TAB", "Valate (200 Mg)");
        insertTABLE_NAME(db, "TAB", "Valate (500 Mg)");
        insertTABLE_NAME(db, "TAB", "Valparin (500 Mg)");
        insertTABLE_NAME(db, "TAB", "Valparin Chrono (200 Mg)");
        insertTABLE_NAME(db, "TAB", "Valparin Chrono (300 Mg)");
        insertTABLE_NAME(db, "TAB", "Valparin Chrono (500 Mg)");
        insertTABLE_NAME(db, "TAB", "Valprol CR (200 mg)");
        insertTABLE_NAME(db, "TAB", "Valprol CR (300 mg)");
        insertTABLE_NAME(db, "TAB", "Valprol CR (500 mg)");
        insertTABLE_NAME(db, "TAB", "Valrate CR (200 mg)");
        insertTABLE_NAME(db, "TAB", "Valrate CR (300 mg)");
        insertTABLE_NAME(db, "TAB", "Valrate CR (500 mg)");
        insertTABLE_NAME(db, "TAB", "Menofit");
        insertTABLE_NAME(db, "TAB", "Venla (25 mg)");
        insertTABLE_NAME(db, "TAB", "Venla (37.5 mg)");
        insertTABLE_NAME(db, "TAB", "Venla-XR (150 mg)");
        insertTABLE_NAME(db, "TAB", "Venla-XR (37.5 mg)");
        insertTABLE_NAME(db, "TAB", "Venlift (37.5 mg)");
        insertTABLE_NAME(db, "TAB", "Venlift (75 mg)");
        insertTABLE_NAME(db, "TAB", "Venlor (25 mg)");
        insertTABLE_NAME(db, "TAB", "Venlor (37.5 mg)");
        insertTABLE_NAME(db, "TAB", "Venlor XR (150 mg)");
        insertTABLE_NAME(db, "TAB", "Venod (150 mg)");
        insertTABLE_NAME(db, "TAB", "Ven-od (37.5 mg)");
        insertTABLE_NAME(db, "TAB", "Ven-OD (75 mg)");
        insertTABLE_NAME(db, "TAB", "Vexor (150 mg)");
        insertTABLE_NAME(db, "TAB", "Vexor (75 mg)");
        insertTABLE_NAME(db, "TAB", "Vexor (37.5 mg)");
        insertTABLE_NAME(db, "TAB", "Calaptin (120 Mg)");
        insertTABLE_NAME(db, "TAB", "Calaptin (240 Mg)");
        insertTABLE_NAME(db, "TAB", "Calaptin (40 Mg)");
        insertTABLE_NAME(db, "TAB", "Calaptin (80 Mg)");
        insertTABLE_NAME(db, "TAB", "Isoptin (40 Mg)");
        insertTABLE_NAME(db, "TAB", "Isoptin (80 Mg)");
        insertTABLE_NAME(db, "TAB", "Calciflavone");
        insertTABLE_NAME(db, "TAB", "Estovan");
        insertTABLE_NAME(db, "TAB", "Menocese");
        insertTABLE_NAME(db, "TAB", "Menoease");
        insertTABLE_NAME(db, "TAB", "Menopace");
        insertTABLE_NAME(db, "TAB", "Stilnite (10 mg)");
        insertTABLE_NAME(db, "TAB", "Stilnite (5 mg)");
        insertTABLE_NAME(db, "TAB", "Zalep (5 mg)");
        insertTABLE_NAME(db, "TAB", "Zalpilo (10 mg)");
        insertTABLE_NAME(db, "TAB", "Zalpilo (5 mg)");
        insertTABLE_NAME(db, "TAB", "Zaplon (10 mg)");
        insertTABLE_NAME(db, "TAB", "Zaplon (5 mg)");
        insertTABLE_NAME(db, "TAB", "Zaso (10 mg)");
        insertTABLE_NAME(db, "TAB", "Zaso (5 mg)");
        insertTABLE_NAME(db, "TAB", "Zidovir 300");
        insertTABLE_NAME(db, "TAB", "Ambiz (10 mg)");
        insertTABLE_NAME(db, "TAB", "Dactive (5 mg)");
        insertTABLE_NAME(db, "TAB", "Sumitran");
        insertTABLE_NAME(db, "TAB1", "Vomikind (4 Mg)");
        insertTABLE_NAME(db, "TAB", "Menoctyl 40");
        insertTABLE_NAME(db, "TAB", "Oxep (150 mg)");
        insertTABLE_NAME(db, "TAB1", "Oxep (300 mg)");
        insertTABLE_NAME(db, "TAB", "Oxep (600 mg)");
        insertTABLE_NAME(db, "TAB", "Orapent 40");
        insertTABLE_NAME(db, "TAB1", "Patodac 40");
        insertTABLE_NAME(db, "TAB", "Pencid 40");
        insertTABLE_NAME(db, "TAB", "Topraz 40");




    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
db.execSQL("DROP TABLE IF EXISTS"+TABLE_NAME);
        onCreate(db);
    }
    private  void insertTABLE_NAME(SQLiteDatabase db, String category,
                                      String medname) {
         db = this.getWritableDatabase();


        ContentValues medValues = new ContentValues();
        medValues.put("CATEGORY", category);
        medValues.put("MED_NAME", medname);
        db.insert("TABLE_NAME", null, medValues);
        db.close();
    }
    public List<String> getAllLabels(){
        List<String> labels = new ArrayList<String>();
String TAB1="TAB1";
        // Select All Query
        SQLiteDatabase db = this.getReadableDatabase();
        Cursor cursor = db.query ("TABLE_NAME",
                new String[] {"CATEGORY", "MED_NAME"},
                "CATEGORY = ?",
                new String[] {"TAB"},
                null, null,null);

        // looping through all rows and adding to list
        if (cursor.moveToFirst()) {
            do {
                labels.add(cursor.getString(1));
            } while (cursor.moveToNext());
        }

        // closing connection
        cursor.close();
        db.close();

        // returning lables
        return labels;
    }
    public List<String> getAllLabels2(){
        List<String> labels = new ArrayList<String>();
        String TAB1="TAB1";
        // Select All Query
        SQLiteDatabase db = this.getReadableDatabase();
        Cursor cursor = db.query ("TABLE_NAME",
                new String[] {"CATEGORY", "MED_NAME"},
                "CATEGORY = ?",
                new String[] {"INJ"},
                null, null,null);

        // looping through all rows and adding to list
        if (cursor.moveToFirst()) {
            do {
                labels.add(cursor.getString(1));
            } while (cursor.moveToNext());
        }

        // closing connection
        cursor.close();
        db.close();

        // returning lables
        return labels;
    }
    public List<String> getAllLabels3(){
        List<String> labels = new ArrayList<String>();
        String TAB1="TAB1";
        // Select All Query
        SQLiteDatabase db = this.getReadableDatabase();
        Cursor cursor = db.query ("TABLE_NAME",
                new String[] {"CATEGORY", "MED_NAME"},
                "CATEGORY = ?",
                new String[] {"DROP"},
                null, null,null);

        // looping through all rows and adding to list
        if (cursor.moveToFirst()) {
            do {
                labels.add(cursor.getString(1));
            } while (cursor.moveToNext());
        }

        // closing connection
        cursor.close();
        db.close();

        // returning lables
        return labels;
    }
    public List<String> getAllLabels4(){
        List<String> labels = new ArrayList<String>();
        String TAB1="TAB1";
        // Select All Query
        SQLiteDatabase db = this.getReadableDatabase();
        Cursor cursor = db.query ("TABLE_NAME",
                new String[] {"CATEGORY", "MED_NAME"},
                "CATEGORY = ?",
                new String[] {"LIQUID"},
                null, null,null);

        // looping through all rows and adding to list
        if (cursor.moveToFirst()) {
            do {
                labels.add(cursor.getString(1));
            } while (cursor.moveToNext());
        }

        // closing connection
        cursor.close();
        db.close();

        // returning lables
        return labels;
    }
    public List<String> getAllLabels5(){
        List<String> labels = new ArrayList<String>();
        String TAB1="TAB1";
        // Select All Query
        SQLiteDatabase db = this.getReadableDatabase();
        Cursor cursor = db.query ("TABLE_NAME",
                new String[] {"CATEGORY", "MED_NAME"},
                "CATEGORY = ?",
                new String[] {"CAP"},
                null, null,null);

        // looping through all rows and adding to list
        if (cursor.moveToFirst()) {
            do {
                labels.add(cursor.getString(1));
            } while (cursor.moveToNext());
        }

        // closing connection
        cursor.close();
        db.close();

        // returning lables
        return labels;
    }
    public List<String> getAllLabels6(){
        List<String> labels = new ArrayList<String>();
        String TAB1="TAB1";
        // Select All Query
        SQLiteDatabase db = this.getReadableDatabase();
        Cursor cursor = db.query ("TABLE_NAME",
                new String[] {"CATEGORY", "MED_NAME"},
                "CATEGORY = ?",
                new String[] {"SPRAY"},
                null, null,null);

        // looping through all rows and adding to list
        if (cursor.moveToFirst()) {
            do {
                labels.add(cursor.getString(1));
            } while (cursor.moveToNext());
        }

        // closing connection
        cursor.close();
        db.close();

        // returning lables
        return labels;
    }
    public List<String> getAllLabels7(){
        List<String> labels = new ArrayList<String>();
        String TAB1="TAB1";
        // Select All Query
        SQLiteDatabase db = this.getReadableDatabase();
        Cursor cursor = db.query ("TABLE_NAME",
                new String[] {"CATEGORY", "MED_NAME"},
                "CATEGORY = ?",
                new String[] {"LCL APPLN"},
                null, null,null);

        // looping through all rows and adding to list
        if (cursor.moveToFirst()) {
            do {
                labels.add(cursor.getString(1));
            } while (cursor.moveToNext());
        }

        // closing connection
        cursor.close();
        db.close();

        // returning lables
        return labels;
    }
    public List<String> getAllLabels8(){
        List<String> labels = new ArrayList<String>();
        String TAB1="TAB1";
        // Select All Query
        SQLiteDatabase db = this.getReadableDatabase();
        Cursor cursor = db.query ("TABLE_NAME",
                new String[] {"CATEGORY", "MED_NAME"},
                "CATEGORY = ?",
                new String[] {"ROLL"},
                null, null,null);

        // looping through all rows and adding to list
        if (cursor.moveToFirst()) {
            do {
                labels.add(cursor.getString(1));
            } while (cursor.moveToNext());
        }

        // closing connection
        cursor.close();
        db.close();

        // returning lables
        return labels;
    }
    public List<String> getAllLabels9(){
        List<String> labels = new ArrayList<String>();
        String TAB1="TAB1";
        // Select All Query
        SQLiteDatabase db = this.getReadableDatabase();
        Cursor cursor = db.query ("TABLE_NAME",
                new String[] {"CATEGORY", "MED_NAME"},
                "CATEGORY = ?",
                new String[] {"RESPULES"},
                null, null,null);

        // looping through all rows and adding to list
        if (cursor.moveToFirst()) {
            do {
                labels.add(cursor.getString(1));
            } while (cursor.moveToNext());
        }

        // closing connection
        cursor.close();
        db.close();

        // returning lables
        return labels;
    }
    public List<String> getAllLabels10(){
        List<String> labels = new ArrayList<String>();
        String TAB1="TAB1";
        // Select All Query
        SQLiteDatabase db = this.getReadableDatabase();
        Cursor cursor = db.query ("TABLE_NAME",
                new String[] {"CATEGORY", "MED_NAME"},
                "CATEGORY = ?",
                new String[] {"TAPE"},
                null, null,null);

        // looping through all rows and adding to list
        if (cursor.moveToFirst()) {
            do {
                labels.add(cursor.getString(1));
            } while (cursor.moveToNext());
        }

        // closing connection
        cursor.close();
        db.close();

        // returning lables
        return labels;
    }
    public List<String> getAllLabels11(){
        List<String> labels = new ArrayList<String>();
        String TAB1="TAB1";
        // Select All Query
        SQLiteDatabase db = this.getReadableDatabase();
        Cursor cursor = db.query ("TABLE_NAME",
                new String[] {"CATEGORY", "MED_NAME"},
                "CATEGORY = ?",
                new String[] {"PKT"},
                null, null,null);

        // looping through all rows and adding to list
        if (cursor.moveToFirst()) {
            do {
                labels.add(cursor.getString(1));
            } while (cursor.moveToNext());
        }

        // closing connection
        cursor.close();
        db.close();

        // returning lables
        return labels;
    }
    public List<String> getAllLabels12(){
        List<String> labels = new ArrayList<String>();
        String TAB1="TAB1";
        // Select All Query
        SQLiteDatabase db = this.getReadableDatabase();
        Cursor cursor = db.query ("TABLE_NAME",
                new String[] {"CATEGORY", "MED_NAME"},
                "CATEGORY = ?",
                new String[] {"RESPICAPS"},
                null, null,null);

        // looping through all rows and adding to list
        if (cursor.moveToFirst()) {
            do {
                labels.add(cursor.getString(1));
            } while (cursor.moveToNext());
        }

        // closing connection
        cursor.close();
        db.close();

        // returning lables
        return labels;
    }
    public List<String> getAllLabels13(){
        List<String> labels = new ArrayList<String>();
        String TAB1="TAB1";
        // Select All Query
        SQLiteDatabase db = this.getReadableDatabase();
        Cursor cursor = db.query ("TABLE_NAME",
                new String[] {"CATEGORY", "MED_NAME"},
                "CATEGORY = ?",
                new String[] {"LOTION"},
                null, null,null);

        // looping through all rows and adding to list
        if (cursor.moveToFirst()) {
            do {
                labels.add(cursor.getString(1));
            } while (cursor.moveToNext());
        }

        // closing connection
        cursor.close();
        db.close();

        // returning lables
        return labels;
    }
    public List<String> getAllLabels14(){
        List<String> labels = new ArrayList<String>();
        String TAB1="TAB1";
        // Select All Query
        SQLiteDatabase db = this.getReadableDatabase();
        Cursor cursor = db.query ("TABLE_NAME",
                new String[] {"CATEGORY", "MED_NAME"},
                "CATEGORY = ?",
                new String[] {"SACHET"},
                null, null,null);

        // looping through all rows and adding to list
        if (cursor.moveToFirst()) {
            do {
                labels.add(cursor.getString(1));
            } while (cursor.moveToNext());
        }

        // closing connection
        cursor.close();
        db.close();

        // returning lables
        return labels;
    }
    public List<String> getAllLabels15(){
        List<String> labels = new ArrayList<String>();
        String TAB1="TAB1";
        // Select All Query
        SQLiteDatabase db = this.getReadableDatabase();
        Cursor cursor = db.query ("TABLE_NAME",
                new String[] {"CATEGORY", "MED_NAME"},
                "CATEGORY = ?",
                new String[] {"SUPPOST"},
                null, null,null);

        // looping through all rows and adding to list
        if (cursor.moveToFirst()) {
            do {
                labels.add(cursor.getString(1));
            } while (cursor.moveToNext());
        }

        // closing connection
        cursor.close();
        db.close();

        // returning lables
        return labels;
    }
    public List<String> getAllLabels16(){
        List<String> labels = new ArrayList<String>();
        String TAB1="TAB1";
        // Select All Query
        SQLiteDatabase db = this.getReadableDatabase();
        Cursor cursor = db.query ("TABLE_NAME",
                new String[] {"CATEGORY", "MED_NAME"},
                "CATEGORY = ?",
                new String[] {"INHALER"},
                null, null,null);

        // looping through all rows and adding to list
        if (cursor.moveToFirst()) {
            do {
                labels.add(cursor.getString(1));
            } while (cursor.moveToNext());
        }

        // closing connection
        cursor.close();
        db.close();

        // returning lables
        return labels;
    }
    public List<String> getAllLabels17(){
        List<String> labels = new ArrayList<String>();
        String TAB1="TAB1";
        // Select All Query
        SQLiteDatabase db = this.getReadableDatabase();
        Cursor cursor = db.query ("TABLE_NAME",
                new String[] {"CATEGORY", "MED_NAME"},
                "CATEGORY = ?",
                new String[] {"SET"},
                null, null,null);

        // looping through all rows and adding to list
        if (cursor.moveToFirst()) {
            do {
                labels.add(cursor.getString(1));
            } while (cursor.moveToNext());
        }

        // closing connection
        cursor.close();
        db.close();

        // returning lables
        return labels;
    }
    public List<String> getAllLabels18(){
        List<String> labels = new ArrayList<String>();
        String TAB1="TAB1";
        // Select All Query
        SQLiteDatabase db = this.getReadableDatabase();
        Cursor cursor = db.query ("TABLE_NAME",
                new String[] {"CATEGORY", "MED_NAME"},
                "CATEGORY = ?",
                new String[] {"POWDER"},
                null, null,null);

        // looping through all rows and adding to list
        if (cursor.moveToFirst()) {
            do {
                labels.add(cursor.getString(1));
            } while (cursor.moveToNext());
        }

        // closing connection
        cursor.close();
        db.close();

        // returning lables
        return labels;
    }
    public List<String> getAllLabels19(){
        List<String> labels = new ArrayList<String>();
        String TAB1="TAB1";
        // Select All Query
        SQLiteDatabase db = this.getReadableDatabase();
        Cursor cursor = db.query ("TABLE_NAME",
                new String[] {"CATEGORY", "MED_NAME"},
                "CATEGORY = ?",
                new String[] {"ROTACAP"},
                null, null,null);

        // looping through all rows and adding to list
        if (cursor.moveToFirst()) {
            do {
                labels.add(cursor.getString(1));
            } while (cursor.moveToNext());
        }

        // closing connection
        cursor.close();
        db.close();

        // returning lables
        return labels;
    }
    public List<String> getAllLabels20(){
        List<String> labels = new ArrayList<String>();
        String TAB1="TAB1";
        // Select All Query
        SQLiteDatabase db = this.getReadableDatabase();
        Cursor cursor = db.query ("TABLE_NAME",
                new String[] {"CATEGORY", "MED_NAME"},
                "CATEGORY = ?",
                new String[] {"SYRINGE"},
                null, null,null);

        // looping through all rows and adding to list
        if (cursor.moveToFirst()) {
            do {
                labels.add(cursor.getString(1));
            } while (cursor.moveToNext());
        }

        // closing connection
        cursor.close();
        db.close();

        // returning lables
        return labels;
    }

}

