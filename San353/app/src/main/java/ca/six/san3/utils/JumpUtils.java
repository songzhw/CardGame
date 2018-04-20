package ca.six.san3.utils;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;

public class JumpUtils {

    public static void go(Context ctx, Class clazz) {
        Intent it = new Intent(ctx, clazz);
        ctx.startActivity(it);
    }

}
