package glide;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;

import com.bumptech.glide.load.Options;
import com.bumptech.glide.load.model.ModelLoader;
import com.bumptech.glide.load.model.ModelLoaderFactory;
import com.bumptech.glide.load.model.MultiModelLoaderFactory;

import java.io.InputStream;

import okhttp3.OkHttpClient;

public class MyImageStreamLoader implements ModelLoader<MyImageModel, InputStream>{



    @Nullable
    @Override
    public LoadData<InputStream> buildLoadData(@NonNull MyImageModel myImageModel, int width, int height, @NonNull Options options) {
        return null;
    }

    @Override
    public boolean handles(@NonNull MyImageModel myImageModel) {
        return false;
    }

    public static class Factory implements ModelLoaderFactory<MyImageModel, InputStream> {
        public Factory(OkHttpClient httpClient) {

        }

        @NonNull
        @Override
        public ModelLoader<MyImageModel, InputStream> build(@NonNull MultiModelLoaderFactory multiFactory) {
            return null;
        }

        @Override
        public void teardown() {

        }
    }




}
