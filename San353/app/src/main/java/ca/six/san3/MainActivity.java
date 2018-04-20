package ca.six.san3;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import ca.six.san3.core.BaseActivity;
import ca.six.san3.module.game.GameActivity;
import ca.six.san3.utils.JumpUtils;

public class MainActivity extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViewById(R.id.btnMainStart).setOnClickListener(v -> {
            JumpUtils.go(this, GameActivity.class);
        });
    }
}
