package demo.Demo_Ui;

import android.app.TabActivity;
import android.os.Bundle;
import android.widget.TabHost;
import android.widget.TabHost.TabSpec;

public class MainActivity extends TabActivity{
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.test);

        TabHost tabHost = getTabHost();

        TabSpec page1 = tabHost.newTabSpec("参数预制卡")
                .setIndicator("参数预制卡")
                .setContent(R.id.tab1);
        tabHost.addTab(page1);

        TabSpec page2 = tabHost.newTabSpec("用户卡" )
                .setIndicator("用户卡")
                .setContent(R.id.tab2);
        tabHost.addTab(page2);

    }
}