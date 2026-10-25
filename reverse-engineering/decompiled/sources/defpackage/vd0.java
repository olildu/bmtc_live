package defpackage;

import androidx.compose.foundation.lazy.LazyListMeasureKt;
import androidx.compose.foundation.lazy.grid.LazyGridMeasureKt;
import androidx.compose.ui.layout.Placeable;
import java.util.List;
import kotlin.jvm.functions.Function1;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class vd0 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f19826a;
    public final /* synthetic */ List b;
    public final /* synthetic */ List c;
    public final /* synthetic */ boolean d;

    public /* synthetic */ vd0(List list, List list2, boolean z, int i) {
        this.f19826a = i;
        this.b = list;
        this.c = list2;
        this.d = z;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f19826a) {
            case 0:
                return LazyGridMeasureKt.measureLazyGrid_t1x4au0$lambda$8$0(this.b, this.c, this.d, (Placeable.PlacementScope) obj);
            default:
                return LazyListMeasureKt.measureLazyList__s_dbAc$lambda$8$0(this.b, this.c, this.d, (Placeable.PlacementScope) obj);
        }
    }
}
