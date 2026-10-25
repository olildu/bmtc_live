package defpackage;

import androidx.compose.foundation.lazy.LazyListMeasureKt;
import androidx.compose.foundation.lazy.grid.LazyGridMeasureKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.ui.layout.Placeable;
import java.util.List;
import kotlin.jvm.functions.Function1;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class wd0 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f19917a;
    public final /* synthetic */ MutableState b;
    public final /* synthetic */ List c;
    public final /* synthetic */ List d;
    public final /* synthetic */ boolean e;

    public /* synthetic */ wd0(MutableState mutableState, List list, List list2, boolean z, int i) {
        this.f19917a = i;
        this.b = mutableState;
        this.c = list;
        this.d = list2;
        this.e = z;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f19917a) {
            case 0:
                return LazyGridMeasureKt.measureLazyGrid_t1x4au0$lambda$8(this.b, this.c, this.d, this.e, (Placeable.PlacementScope) obj);
            default:
                return LazyListMeasureKt.measureLazyList__s_dbAc$lambda$8(this.b, this.c, this.d, this.e, (Placeable.PlacementScope) obj);
        }
    }
}
