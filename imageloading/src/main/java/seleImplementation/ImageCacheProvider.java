package seleImplementation;

import android.graphics.Bitmap;
import android.util.LruCache;

/**
 * Created by Simon Meng on 2017/11/28.
 * Guangzhou Beauty Information Technology Co.,Ltd
 */

// Three - level Caching Mechanism
public class ImageCacheProvider {
    private LruCache<String, Bitmap> mLruCache;
    private int mMaxSize;

    public ImageCacheProvider() {
        mMaxSize = (int)(Runtime.getRuntime().maxMemory() / 8);
        mLruCache = new LruCache<String, Bitmap>(mMaxSize) {
            @Override
            protected int sizeOf(String key, Bitmap value) {
                return value.getRowBytes() * value.getHeight();
            }
        };

    }

    public Bitmap getBitmap(String url, int position) {
        Bitmap bitmap = null;
        bitmap = mLruCache.get(url);
        if (bitmap != null) {
            return bitmap;
        }
        return null;
    }

    private void getFromLocal(String url) {

    }


}
