package ca.six.san353.biz.game

import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import ca.six.san353.R
import ca.six.san353.core.BaseActivity
import ca.six.san353.data.Card
import ca.six.san353.view.rv.OneAdapter
import ca.six.san353.view.rv.RvViewHolder
import kotlinx.android.synthetic.main.activity_game.*
import android.support.v7.widget.RecyclerView


class GameActivity : BaseActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_game);

        val data = ArrayList<Card>()
        for (i in 0..9) {
            data.add(Card())
        }

        val adapter = object : OneAdapter<Card>(R.layout.item_card, data) {
            override fun apply(vh: RvViewHolder, s: Card, position: Int) {

            }
        }

        rvMyCards.layoutManager = LinearLayoutManager(this, RecyclerView.HORIZONTAL, false)
        rvMyCards.adapter = adapter
    }
}