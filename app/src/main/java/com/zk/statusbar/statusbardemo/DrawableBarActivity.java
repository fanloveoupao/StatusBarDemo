package com.zk.statusbar.statusbardemo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

/**
 * author: ZK.
 * date:   On 2017/8/5.
 */
public class DrawableBarActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_color_bar);
        BarUtil.setStatusBar(this, R.mipmap.ic_launcher);
    }


}