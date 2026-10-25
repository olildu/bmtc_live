package defpackage;

import androidx.compose.foundation.lazy.LazyListStateKt;
import androidx.compose.foundation.lazy.grid.LazyGridStateKt;
import androidx.compose.foundation.lazy.layout.LazyLayoutCacheWindow;
import kotlin.jvm.functions.Function0;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class be0 implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f11189a;
    public final /* synthetic */ LazyLayoutCacheWindow b;
    public final /* synthetic */ int c;
    public final /* synthetic */ int d;

    public /* synthetic */ be0(LazyLayoutCacheWindow lazyLayoutCacheWindow, int i, int i2, int i3) {
        this.f11189a = i3;
        this.b = lazyLayoutCacheWindow;
        this.c = i;
        this.d = i2;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f11189a) {
            case 0:
                return LazyGridStateKt.rememberLazyGridState$lambda$3$0(this.b, this.c, this.d);
            default:
                return LazyListStateKt.rememberLazyListState$lambda$3$0(this.b, this.c, this.d);
        }
    }
}
