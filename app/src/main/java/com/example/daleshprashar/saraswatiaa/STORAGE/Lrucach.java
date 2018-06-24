package com.example.daleshprashar.saraswatiaa.STORAGE;

import android.graphics.Bitmap;
import android.support.v4.util.LruCache;

public class Lrucach {
    int cacheSizeInKB = 1024 * 10; // 10MB
    LruCache<String, Bitmap> cache = new LruCache<String, Bitmap>(cacheSizeInKB) {

      /*  @Override
        protected void entryRemoved(boolean evicted, String key, Bitmap old, Bitmap new) {
        }
*/
        /**
         * Measure item size in kilobytes rather than units,
         * which is more practical for a bitmap cache
         */
        @Override
        protected int sizeOf(String key, Bitmap value) {
            final int bitmapSize =  value.getByteCount() / 1024;
            return bitmapSize == 0 ? 1 : bitmapSize;
        }
    };

}
