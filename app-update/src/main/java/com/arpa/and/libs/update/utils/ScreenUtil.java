package com.arpa.and.libs.update.utils;

import android.content.Context;
import android.util.DisplayMetrics;

/**
 * 获取屏幕 宽 高
 */
public final class ScreenUtil {

    /**
     * 获取屏幕宽度（像素）
     *
     * @param context
     *         上下文
     *
     * @return px
     */
    public static int getWith(Context context) {
        DisplayMetrics dm = context.getResources().getDisplayMetrics();
        return dm.widthPixels;
    }

}
