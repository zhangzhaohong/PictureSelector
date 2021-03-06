package com.luck.picture.lib.engine;

import android.content.Context;
import android.widget.ImageView;

import com.luck.picture.lib.listener.ImageCompleteCallback;
import com.luck.picture.lib.widget.longimage.SubsamplingScaleImageView;

import androidx.annotation.NonNull;

/**
 * @author：luck
 * @date：2019-11-13 16:59
 * @describe：图片加载引擎接口
 */
public interface ImageEngine {
    /**
     * 加载图片
     */
    void loadImage(@NonNull Context context, @NonNull String url, @NonNull ImageView imageView);

    /**
     * 加载图片
     */
    void loadImage(@NonNull Context context, @NonNull String url, @NonNull ImageView imageView, SubsamplingScaleImageView longImageView, ImageCompleteCallback callback);

    /**
     * 加载网络长图适配
     */
    @Deprecated
    void loadImage(@NonNull Context context, @NonNull String url, @NonNull ImageView imageView, SubsamplingScaleImageView longImageView);


    /**
     * 加载相册目录图片
     *
     * @param context   上下文
     * @param url       图片路径
     * @param imageView 承载图片ImageView
     */
    void loadFolderImage(@NonNull Context context, @NonNull String url, @NonNull ImageView imageView);

    /**
     * 加载gif图片
     *
     * @param context   上下文
     * @param url       图片路径
     * @param imageView 承载图片ImageView
     */
    void loadAsGifImage(@NonNull Context context, @NonNull String url, @NonNull ImageView imageView);

    /**
     * 加载图片列表图片
     *
     * @param context   上下文
     * @param url       图片路径
     * @param imageView 承载图片ImageView
     */
    void loadGridImage(@NonNull Context context, @NonNull String url, @NonNull ImageView imageView);
}
