package ca.six.san353.view.rv

import android.support.v7.widget.RecyclerView
import android.view.ViewGroup

abstract class OneAdapter<T>(var layoutResId: Int, data: List<T>) : RecyclerView.Adapter<RvViewHolder>() {
    var data: List<T>? = data

    override fun getItemCount(): Int {
        return if (data == null) 0 else data!!.size
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RvViewHolder {
        //        System.out.println("szw onCreateViewHolder()");
        return RvViewHolder.createViewHolder(parent, layoutResId)
    }

    override fun onBindViewHolder(holder: RvViewHolder, position: Int) {
        //        System.out.println("szw onBindViewHolder( "+position+" )");
        if (data != null && data!!.size > position) {
            apply(holder, data!![position], position)
        }
    }

    protected abstract fun apply(vh: RvViewHolder, t: T, position: Int)

}