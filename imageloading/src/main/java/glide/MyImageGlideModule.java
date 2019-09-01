package glide;

import android.app.Activity;
import android.content.Context;
import android.support.annotation.NonNull;

import com.bumptech.glide.Glide;
import com.bumptech.glide.GlideBuilder;
import com.bumptech.glide.MemoryCategory;
import com.bumptech.glide.Registry;
import com.bumptech.glide.annotation.GlideModule;
import com.bumptech.glide.load.engine.Engine;
import com.bumptech.glide.load.engine.cache.LruResourceCache;
import com.bumptech.glide.load.engine.cache.MemorySizeCalculator;
import com.bumptech.glide.load.model.ModelLoaderFactory;
import com.bumptech.glide.module.AppGlideModule;
import java.io.InputStream;

@GlideModule
public class MyImageGlideModule extends AppGlideModule {

    @Override
    public void registerComponents(@NonNull Context context, @NonNull Glide glide, @NonNull Registry registry) {
        super.registerComponents(context, glide, registry);
        glide.setMemoryCategory(MemoryCategory.LOW);
//        registry.append(MyImageModel.class, InputStream.class, new MyImageStreamLoader.Factory());
    }

    @Override
    public boolean isManifestParsingEnabled() {
        return false;
    }


    @Override
    public void applyOptions(@NonNull Context context, @NonNull GlideBuilder builder) {
        super.applyOptions(context, builder);
        MemorySizeCalculator calculator = new MemorySizeCalculator.Builder(context)
                                              .setMemoryCacheScreens(2)
                                              .build();
        builder.setMemoryCache(new LruResourceCache(calculator.getMemoryCacheSize()));

        // overwrite the cache size directely.
        int memorySize = 1024 * 1024 * 20;
        builder.setMemoryCache(new LruResourceCache(memorySize));



    }
}
