package defpackage;

import androidx.compose.foundation.pager.PagerMeasureKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.ui.layout.Placeable;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class fp0 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15662a = 0;
    public final /* synthetic */ List b;
    public final /* synthetic */ MutableState c;

    public /* synthetic */ fp0(MutableState mutableState, List list) {
        this.c = mutableState;
        this.b = list;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f15662a) {
            case 0:
                return PagerMeasureKt.measurePager_7L1iB3k$lambda$18(this.c, this.b, (Placeable.PlacementScope) obj);
            default:
                this.c.setValue((String) this.b.get(((Integer) obj).intValue()));
                return Unit.f17538a;
        }
    }

    public /* synthetic */ fp0(List list, MutableState mutableState) {
        this.b = list;
        this.c = mutableState;
    }
}
