package defpackage;

import androidx.compose.foundation.lazy.LazyListIntervalContent;
import androidx.compose.foundation.lazy.grid.LazyGridIntervalContent;
import androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridIntervalContent;
import androidx.compose.runtime.ComposerImpl;
import kotlin.jvm.functions.Function1;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class zr implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f20225a;
    public final /* synthetic */ Object b;

    public /* synthetic */ zr(Object obj, int i) {
        this.f20225a = i;
        this.b = obj;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f20225a) {
            case 0:
                return Boolean.valueOf(ComposerImpl.stackTraceForValue$lambda$0(this.b, obj));
            case 1:
                return LazyGridIntervalContent.item$lambda$0$0(this.b, ((Integer) obj).intValue());
            case 2:
                return LazyGridIntervalContent.item$lambda$2(this.b, ((Integer) obj).intValue());
            case 3:
                return LazyListIntervalContent.item$lambda$0(this.b, ((Integer) obj).intValue());
            case 4:
                return LazyListIntervalContent.item$lambda$1(this.b, ((Integer) obj).intValue());
            case 5:
                return LazyStaggeredGridIntervalContent.item$lambda$0$0(this.b, ((Integer) obj).intValue());
            default:
                return LazyStaggeredGridIntervalContent.item$lambda$1(this.b, ((Integer) obj).intValue());
        }
    }
}
