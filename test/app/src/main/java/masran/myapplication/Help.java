package masran.myapplication;

import android.Manifest;
import android.app.Notification;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Build;
import android.support.design.widget.FloatingActionButton;
import android.support.v4.app.ActivityCompat;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;

/**
 * Created by Mas'Z on 3/21/2018.
 */

public class Help extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.help);

    }
    //----------------------------------siriros----------------------------------------------------
    public void BtnOnClick(View view){
        final int REQUEST_PHONE_CALL = 1;
        Intent callIntent = new Intent(Intent.ACTION_CALL);
        callIntent.setData(Uri.parse("tel:0973530088"));//076361888
        if (android.os.Build.VERSION.SDK_INT >= Build.VERSION_CODES.M){
            if(ContextCompat.checkSelfPermission(Help.this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED){
                ActivityCompat.requestPermissions(Help.this, new String[]{Manifest.permission.CALL_PHONE}, REQUEST_PHONE_CALL);
            }else{
                //-------------------------------places the call-----------------------------------
                startActivity(callIntent);
            }
        }
    }
    //------------------------------------krungtep---------------------------------------------------
    public void Btn1OnClick(View view){
        final int REQUEST_PHONE_CALL = 1;
        Intent callIntent = new Intent(Intent.ACTION_CALL);
        callIntent.setData(Uri.parse("tel:0973530088"));//076254425
        if (android.os.Build.VERSION.SDK_INT >= Build.VERSION_CODES.M){
            if(ContextCompat.checkSelfPermission(Help.this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED){
                ActivityCompat.requestPermissions(Help.this, new String[]{Manifest.permission.CALL_PHONE}, REQUEST_PHONE_CALL);
            }else{
                //-------------------------------places the call-----------------------------------
                startActivity(callIntent);
            }
        }
    }
    //------------------------------------------vachira----------------------------------------------
    public void Btn2OnClick(View view){
        final int REQUEST_PHONE_CALL = 1;
        Intent callIntent = new Intent(Intent.ACTION_CALL);
        callIntent.setData(Uri.parse("tel:0973530088"));//076361234
        if (android.os.Build.VERSION.SDK_INT >= Build.VERSION_CODES.M){
            if(ContextCompat.checkSelfPermission(Help.this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED){
                ActivityCompat.requestPermissions(Help.this, new String[]{Manifest.permission.CALL_PHONE}, REQUEST_PHONE_CALL);
            }else{
                //-------------------------------places the call-----------------------------------
                startActivity(callIntent);
            }
        }
    }
    //--------------------------------------- อ บ จ ---------------------------------------------
    public void Btn3OnClick(View view){
        final int REQUEST_PHONE_CALL = 1;
        Intent callIntent = new Intent(Intent.ACTION_CALL);
        callIntent.setData(Uri.parse("tel:0973530088"));//076358888
        if (android.os.Build.VERSION.SDK_INT >= Build.VERSION_CODES.M){
            if(ContextCompat.checkSelfPermission(Help.this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED){
                ActivityCompat.requestPermissions(Help.this, new String[]{Manifest.permission.CALL_PHONE}, REQUEST_PHONE_CALL);
            }else{
                //-------------------------------places the call-----------------------------------
                startActivity(callIntent);
            }
        }
    }
    //--------------------------------------dibuk-----------------------------------------------
    public void Btn4OnClick(View view){
        final int REQUEST_PHONE_CALL = 1;
        Intent callIntent = new Intent(Intent.ACTION_CALL);
        callIntent.setData(Uri.parse("tel:0973530088"));//076298298
        if (android.os.Build.VERSION.SDK_INT >= Build.VERSION_CODES.M){
            if(ContextCompat.checkSelfPermission(Help.this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED){
                ActivityCompat.requestPermissions(Help.this, new String[]{Manifest.permission.CALL_PHONE}, REQUEST_PHONE_CALL);
            }else{
                //-------------------------------places the call-----------------------------------
                startActivity(callIntent);
            }
        }
    }
    //--------------------------------------patong---------------------------------------------------
    public void Btn5OnClick(View view){
        final int REQUEST_PHONE_CALL = 1;
        Intent callIntent = new Intent(Intent.ACTION_CALL);
        callIntent.setData(Uri.parse("tel:0973530088"));//076342633
        if (android.os.Build.VERSION.SDK_INT >= Build.VERSION_CODES.M){
            if(ContextCompat.checkSelfPermission(Help.this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED){
                ActivityCompat.requestPermissions(Help.this, new String[]{Manifest.permission.CALL_PHONE}, REQUEST_PHONE_CALL);
            }else{
                //-------------------------------places the call-----------------------------------
                startActivity(callIntent);
            }
        }
    }
    //----------------------------------------------------------------------------------------------
}


