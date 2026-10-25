package defpackage;

import androidx.compose.foundation.layout.ColumnMeasurePolicy;
import androidx.compose.material3.SegmentedButtonContentMeasurePolicy;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import java.util.ArrayList;
import kotlin.jvm.functions.Function1;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class cq implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15397a = 1;
    public final /* synthetic */ MeasureScope b;
    public final /* synthetic */ int c;
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;

    public /* synthetic */ cq(ArrayList arrayList, MeasureScope measureScope, SegmentedButtonContentMeasurePolicy segmentedButtonContentMeasurePolicy, int i, ArrayList arrayList2, int i2) {
        this.e = arrayList;
        this.b = measureScope;
        this.f = segmentedButtonContentMeasurePolicy;
        this.c = i;
        this.g = arrayList2;
        this.d = i2;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f15397a) {
            case 0:
                return ColumnMeasurePolicy.placeHelper$lambda$0$0((Placeable[]) this.e, (ColumnMeasurePolicy) this.f, this.c, this.d, this.b, (int[]) this.g, (Placeable.PlacementScope) obj);
            default:
                return SegmentedButtonContentMeasurePolicy.measure_3p2s80s$lambda$8((ArrayList) this.e, this.b, (SegmentedButtonContentMeasurePolicy) this.f, this.c, (ArrayList) this.g, this.d, (Placeable.PlacementScope) obj);
        }
    }

    public /* synthetic */ cq(Placeable[] placeableArr, ColumnMeasurePolicy columnMeasurePolicy, int i, int i2, MeasureScope measureScope, int[] iArr) {
        this.e = placeableArr;
        this.f = columnMeasurePolicy;
        this.c = i;
        this.d = i2;
        this.b = measureScope;
        this.g = iArr;
    }
}
