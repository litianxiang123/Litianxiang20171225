package helloworld.example.com.litianxiang20171225;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView mTv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();

    }

    //视频
    public void video() {

    }

    private void initView() {
        mTv = (TextView) findViewById(R.id.tv);
    }
}
