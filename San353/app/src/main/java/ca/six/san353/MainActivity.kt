package ca.six.san353

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import ca.six.san353.biz.game.GameActivity
import ca.six.san353.utils.jump
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnMainStart.setOnClickListener { view -> jump(GameActivity::class.java) }

    }
}
