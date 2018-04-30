package ca.six.san353.utils

import android.app.Activity
import android.content.Intent
import android.widget.EditText

fun Activity.jump(clz : Class<out Any>){
    val it = Intent(this, clz)
    this.startActivity(it)
}

fun Activity.jump(clz : Class<out Any>, args : Map<String, String>){
    val it = Intent(this, clz)
    for( (k,v) in args){
        it.putExtra(k, v)
    }
    this.startActivity(it)
}

fun EditText.string() : String {
    return this.getText()?.toString() ?: "" //this是指EditText对象。因为这是猴子补丁
}