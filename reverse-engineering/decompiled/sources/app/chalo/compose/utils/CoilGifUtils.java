package app.chalo.compose.utils;

import android.content.Context;
import android.os.Build;
import coil3.ComponentRegistry;
import coil3.ImageLoader;
import coil3.gif.AnimatedImageDecoder;
import coil3.gif.GifDecoder;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/compose/utils/CoilGifUtils;", "", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class CoilGifUtils {
    public static ImageLoader.Builder a(Context platformContext) {
        Intrinsics.i(platformContext, "platformContext");
        ImageLoader.Builder builder = new ImageLoader.Builder(platformContext);
        ComponentRegistry.Builder builder2 = new ComponentRegistry.Builder();
        if (Build.VERSION.SDK_INT >= 28) {
            builder2.a(new AnimatedImageDecoder.Factory());
        } else {
            builder2.a(new GifDecoder.Factory());
        }
        builder.c = builder2.d();
        return builder;
    }
}
