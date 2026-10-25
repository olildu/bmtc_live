package defpackage;

import android.graphics.ColorSpace;
import androidx.compose.runtime.CancellationHandle;
import androidx.media3.datasource.DataSpec;
import androidx.media3.datasource.cache.CacheKeyFactory;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ne implements CacheKeyFactory, CancellationHandle {
    public static /* bridge */ /* synthetic */ ColorSpace.Rgb b(Object obj) {
        return (ColorSpace.Rgb) obj;
    }

    @Override // androidx.media3.datasource.cache.CacheKeyFactory
    public String buildCacheKey(DataSpec dataSpec) {
        return oe.a(dataSpec);
    }

    @Override // androidx.compose.runtime.CancellationHandle
    public void cancel() {
        CancellationHandle.Companion.Empty$lambda$0();
    }
}
