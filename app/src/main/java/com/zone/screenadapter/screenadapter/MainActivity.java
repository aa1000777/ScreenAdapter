package com.zone.screenadapter.screenadapter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.Display;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        float px = getResources().getDimension(R.dimen.x100);
        System.out.println("x100---->"+px+"px");
        DisplayMetrics dm = new DisplayMetrics();
        getWindowManager().getDefaultDisplay().getMetrics(dm);//display = getWindowManager().getDefaultDisplay();display.getMetrics(dm)（把屏幕尺寸信息赋值给DisplayMetrics dm）;
        System.out.println("width:"+dm.widthPixels+"\t height:"+dm.heightPixels+"\t dpi:"+dm.densityDpi);
        System.out.println("Xd:"+getResources().getDimension(R.dimen.xD));

        float fontPx = getResources().getDimension(R.dimen.font20px);
        System.out.println("font20---->"+fontPx+"px");
    }
}
