package masran.myapplication;

import android.Manifest;
import android.app.Activity;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.net.Uri;
import android.nfc.Tag;
import android.os.Build;
import android.os.Bundle;
import android.support.v4.app.ActivityCompat;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.DividerItemDecoration;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.helper.ItemTouchHelper;
import android.util.Log;
import android.view.View;
import android.widget.ArrayAdapter;

import com.baoyz.swipemenulistview.SwipeMenu;
import com.baoyz.swipemenulistview.SwipeMenuCreator;
import com.baoyz.swipemenulistview.SwipeMenuItem;
import com.baoyz.swipemenulistview.SwipeMenuListView;

import java.util.ArrayList;

import masran.myapplication.RecyclerView.HospitalListAdapter;
import masran.myapplication.RecyclerView.RecyclerItemTouchHelper;

/**
 * Created by Mas'Z on 3/21/2018.
 */

public class Map extends AppCompatActivity implements RecyclerItemTouchHelper.RecyclerItemTouchHelperListener {
    private static final String TAG = "Map";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_map);
//        SwipeMenuListView listView = (SwipeMenuListView) findViewById(R.id.lisview);

        RecyclerView recyclerView = findViewById(R.id.recyclerview);

        ArrayList<String > list = new ArrayList<>();
        list.add("โรงพยาบาลสิริโรจน์");
        list.add("โรงพยาบาลกรุงเทพภูเก็ต");
        list.add("โรงพยาบาลวชิระภูเก็ต");
        list.add("โรงพยาบาล อบจ ภูเก็ต");
        list.add("โรงพยาบาลดีบุก");
        list.add("โรงพยาบาลป่าตอง");
        list.add("โรงพยาบาลดีบุก");
        list.add("โรงพยาบาลป่าตอง");


        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setItemAnimator(new DefaultItemAnimator());
        recyclerView.addItemDecoration(new DividerItemDecoration(this, DividerItemDecoration.VERTICAL));

        ItemTouchHelper.SimpleCallback itemTouchHelper = new RecyclerItemTouchHelper(0,ItemTouchHelper.LEFT,this);
        new ItemTouchHelper(itemTouchHelper).attachToRecyclerView(recyclerView);

        HospitalListAdapter adapter = new HospitalListAdapter(list);
        recyclerView.setAdapter(adapter);

//        ArrayAdapter adapter = new ArrayAdapter(Map.this,android.R.layout.simple_list_item_1,list);
//        listView.setAdapter(adapter);
//
//        SwipeMenuCreator creator = new SwipeMenuCreator() {
//            @Override
//            public void create(SwipeMenu menu) {
//                SwipeMenuItem deleteItem = new SwipeMenuItem(
//                        getApplicationContext());
//                // set item background
//                deleteItem.setBackground(new ColorDrawable(Color.rgb(0xF9,
//                        0x3F, 0x25)));
//                // set item width
//                deleteItem.setWidth(170);
//                // set a icon
//                deleteItem.setIcon(R.drawable.ic_call);
//                // add to menu
//                menu.addMenuItem(deleteItem);
//
//            }
//        };
//        listView.setMenuCreator(creator);
//        listView.setOnMenuItemClickListener(new SwipeMenuListView.OnMenuItemClickListener() {
//            @Override
//            public boolean onMenuItemClick(int position, SwipeMenu menu, int index) {
//                switch (index) {
//                    case 0:
//                        Log.d(TAG,"onMenuItemClick cliked itemp one "+ index);
//                        break;
//                    case 1:
//                        Log.d(TAG,"onMenuItemClick cliked itemp two"+ index);
//
//                        final int REQUEST_PHONE_CALL = 1;
//                        Intent callIntent = new Intent(Intent.ACTION_CALL);
//                        callIntent.setData(Uri.parse("tel:0973530088"));//076361888
//                        if (android.os.Build.VERSION.SDK_INT >= Build.VERSION_CODES.M){
//                            if(ContextCompat.checkSelfPermission(Map.this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED){
//                                ActivityCompat.requestPermissions(Map.this, new String[]{Manifest.permission.CALL_PHONE}, REQUEST_PHONE_CALL);
//                            }else{
//                                //-------------------------------places the call-----------------------------------
//                                startActivity(callIntent);
//                            }
//                        }
//
//                        break;
//
//
//                }
//                // false : close the menu; true : not close the menu
//                return false;
//            }
//        });

    }

    @Override
    public void onSwiped(RecyclerView.ViewHolder viewHolder, int direction, int position) {
        if(position == 0){
            final int REQUEST_PHONE_CALL = 1;
            Intent callIntent = new Intent(Intent.ACTION_CALL);
            callIntent.setData(Uri.parse("tel:0973530088"));//076342633
            if (android.os.Build.VERSION.SDK_INT >= Build.VERSION_CODES.M){
                if(ContextCompat.checkSelfPermission(Map.this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED){
                    ActivityCompat.requestPermissions(Map.this, new String[]{Manifest.permission.CALL_PHONE}, REQUEST_PHONE_CALL);
                }else{
                    //-------------------------------places the call-----------------------------------
                    startActivity(callIntent);
                    this.finish();
                }
            }
        }
        if(position == 1){
            final int REQUEST_PHONE_CALL = 1;
            Intent callIntent = new Intent(Intent.ACTION_CALL);
            callIntent.setData(Uri.parse("tel:0973530088"));//076342633
            if (android.os.Build.VERSION.SDK_INT >= Build.VERSION_CODES.M){
                if(ContextCompat.checkSelfPermission(Map.this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED){
                    ActivityCompat.requestPermissions(Map.this, new String[]{Manifest.permission.CALL_PHONE}, REQUEST_PHONE_CALL);
                }else{
                    //-------------------------------places the call-----------------------------------
                    startActivity(callIntent);
                    this.finish();
                }
            }
        }
        if(position == 2){
            final int REQUEST_PHONE_CALL = 1;
            Intent callIntent = new Intent(Intent.ACTION_CALL);
            callIntent.setData(Uri.parse("tel:0973530088"));//076342633
            if (android.os.Build.VERSION.SDK_INT >= Build.VERSION_CODES.M){
                if(ContextCompat.checkSelfPermission(Map.this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED){
                    ActivityCompat.requestPermissions(Map.this, new String[]{Manifest.permission.CALL_PHONE}, REQUEST_PHONE_CALL);
                }else{
                    //-------------------------------places the call-----------------------------------
                    startActivity(callIntent);
                    this.finish();
                }
            }
        }
        if(position == 3){
            final int REQUEST_PHONE_CALL = 1;
            Intent callIntent = new Intent(Intent.ACTION_CALL);
            callIntent.setData(Uri.parse("tel:0973530088"));//076342633
            if (android.os.Build.VERSION.SDK_INT >= Build.VERSION_CODES.M){
                if(ContextCompat.checkSelfPermission(Map.this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED){
                    ActivityCompat.requestPermissions(Map.this, new String[]{Manifest.permission.CALL_PHONE}, REQUEST_PHONE_CALL);
                }else{
                    //-------------------------------places the call-----------------------------------
                    startActivity(callIntent);
                    this.finish();
                }
            }
        }
        if(position == 4){
            final int REQUEST_PHONE_CALL = 1;
            Intent callIntent = new Intent(Intent.ACTION_CALL);
            callIntent.setData(Uri.parse("tel:0973530088"));//076342633
            if (android.os.Build.VERSION.SDK_INT >= Build.VERSION_CODES.M){
                if(ContextCompat.checkSelfPermission(Map.this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED){
                    ActivityCompat.requestPermissions(Map.this, new String[]{Manifest.permission.CALL_PHONE}, REQUEST_PHONE_CALL);
                }else{
                    //-------------------------------places the call-----------------------------------
                    startActivity(callIntent);
                    this.finish();
                }
            }
        }
        if(position == 5){
            final int REQUEST_PHONE_CALL = 1;
            Intent callIntent = new Intent(Intent.ACTION_CALL);
            callIntent.setData(Uri.parse("tel:0973530088"));//076342633
            if (android.os.Build.VERSION.SDK_INT >= Build.VERSION_CODES.M){
                if(ContextCompat.checkSelfPermission(Map.this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED){
                    ActivityCompat.requestPermissions(Map.this, new String[]{Manifest.permission.CALL_PHONE}, REQUEST_PHONE_CALL);
                }else{
                    //-------------------------------places the call-----------------------------------
                    startActivity(callIntent);
                    this.finish();
                }
            }
        }



    }
}
