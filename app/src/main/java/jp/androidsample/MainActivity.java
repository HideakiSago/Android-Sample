package jp.androidsample;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private int count = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // テキストやボタンの情報を取得します。
        final TextView text = findViewById(R.id.message);
        final Button button = findViewById(R.id.button);

        // ボタンをクリックしたときに動かす処理を登録します。
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // テキストにメッセージを表示します。
                text.setText("Count: " + count);
                // カウントを上げます。
                count = count + 1;
            }
        });
    }
}
