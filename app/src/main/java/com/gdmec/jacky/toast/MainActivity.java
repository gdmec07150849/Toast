package com.gdmec.jacky.toast;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void showTxt(View view){
        Toast.makeText(this,"直接输出文字信息",Toast.LENGTH_LONG).show();
    }
    public void showView(View view){
        LayoutInflater li= (LayoutInflater) getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View liView=li.inflate(R.layout.toastinfo,null);
        Toast toast=new Toast(this);
        toast.setView(liView);
        toast.show();
    }
    public void showMine(View view){
        LinearLayout ll=new LinearLayout(this);
        Toast toast=Toast.makeText(this,"狗头--图文显示",Toast.LENGTH_LONG);
        View toastView=toast.getView();
        ll.setOrientation(LinearLayout.VERTICAL);
        ImageView imageView=new ImageView(this);
        imageView.setImageResource(R.drawable.dog);
        toast.setView(ll);
        ll.addView(imageView);
        ll.addView(toastView);
        toast.show();
    }
}
