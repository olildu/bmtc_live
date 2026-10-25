package defpackage;

import androidx.compose.foundation.lazy.LazyListStateKt;
import androidx.compose.foundation.lazy.grid.LazyGridStateKt;
import androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridStateKt;
import kotlin.jvm.functions.Function0;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ce0 implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f11277a;
    public final /* synthetic */ int b;
    public final /* synthetic */ int c;

    public /* synthetic */ ce0(int i, int i2, int i3) {
        this.f11277a = i3;
        this.b = i;
        this.c = i2;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f11277a) {
            case 0:
                return LazyGridStateKt.rememberLazyGridState$lambda$0$0(this.b, this.c);
            case 1:
                return LazyListStateKt.rememberLazyListState$lambda$0$0(this.b, this.c);
            default:
                return LazyStaggeredGridStateKt.rememberLazyStaggeredGridState$lambda$0$0(this.b, this.c);
        }
    }
}
