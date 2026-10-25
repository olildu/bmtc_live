package defpackage;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.lazy.grid.LazyGridMeasureResult;
import androidx.compose.foundation.lazy.grid.LazyGridState$prefetchScope$1;
import androidx.compose.foundation.lazy.layout.LazyLayoutPrefetchState;
import androidx.compose.material3.WideNavigationRailKt;
import androidx.compose.runtime.State;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Ref;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ae0 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f279a = 1;
    public final /* synthetic */ int b;
    public final /* synthetic */ List c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Serializable e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;

    public /* synthetic */ ae0(int i, MeasureScope measureScope, Ref.ObjectRef objectRef, ArrayList arrayList, Arrangement.Vertical vertical, State state) {
        this.b = i;
        this.d = measureScope;
        this.e = objectRef;
        this.c = arrayList;
        this.f = vertical;
        this.g = state;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f279a) {
            case 0:
                return LazyGridState$prefetchScope$1.scheduleLinePrefetch$lambda$0$0$0$0(this.c, (Ref.IntRef) this.e, (List) this.d, (Function1) this.f, this.b, (LazyGridMeasureResult) this.g, (LazyLayoutPrefetchState.PrefetchResultScope) obj);
            default:
                return WideNavigationRailKt.AnonymousClass1.AnonymousClass2.measure_3p2s80s$lambda$6(this.b, (MeasureScope) this.d, (Ref.ObjectRef) this.e, this.c, (Arrangement.Vertical) this.f, (State) this.g, (Placeable.PlacementScope) obj);
        }
    }

    public /* synthetic */ ae0(ArrayList arrayList, Ref.IntRef intRef, List list, Function1 function1, int i, LazyGridMeasureResult lazyGridMeasureResult) {
        this.c = arrayList;
        this.e = intRef;
        this.d = list;
        this.f = function1;
        this.b = i;
        this.g = lazyGridMeasureResult;
    }
}
