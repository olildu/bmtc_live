package defpackage;

import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.foundation.lazy.grid.LazyGridState;
import androidx.compose.foundation.lazy.layout.LazyLayoutCacheWindow;
import java.util.List;
import kotlin.jvm.functions.Function1;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class zd0 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f20188a;
    public final /* synthetic */ LazyLayoutCacheWindow b;

    public /* synthetic */ zd0(LazyLayoutCacheWindow lazyLayoutCacheWindow, int i) {
        this.f20188a = i;
        this.b = lazyLayoutCacheWindow;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f20188a) {
            case 0:
                return LazyGridState.Companion.saver$lambda$3(this.b, (List) obj);
            default:
                return LazyListState.Companion.saver$lambda$3(this.b, (List) obj);
        }
    }
}
