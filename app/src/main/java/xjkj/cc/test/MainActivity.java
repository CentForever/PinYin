package xjkj.cc.test;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

import xjkj.cc.test.util.HanziToPinyin;


public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

            TextView textView = (TextView) findViewById(R.id.test);
            String sk = ContactLocaleUtils.getIntance().getSortKey("嫑窵覅誩嘦両燊砼勰顕", ContactLocaleUtils.FullNameStyle.CHINA);
            String sk2 = HanziToPinyin.getInstance().transliterate("嫑窵覅誩嘦両燊砼勰顕"/*, ContactLocaleUtils.FullNameStyle.CHINA*/);
            textView.setText(sk+"\n"+sk2);

        }
    }



