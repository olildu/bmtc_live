package defpackage;

import androidx.compose.foundation.layout.RowMeasurePolicy;
import androidx.compose.runtime.ComposerImplKt;
import androidx.compose.ui.layout.Placeable;
import app.chalo.livetracking.routedetails.data.model.ui.RouteDetailsMapUiModel;
import app.chalo.livetracking.routedetails.data.model.ui.RouteDetailsStopHelpTag;
import app.chalo.livetracking.routedetails.data.model.ui.RouteDetailsStopUiModel;
import app.chalo.livetracking.ui.routedetailsscreen.RouteDetailsComponent;
import app.chalo.livetracking.ui.routedetailsscreen.RouteDetailsDataState;
import app.chalo.livetracking.ui.routedetailsscreen.RouteDetailsViewType;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class s31 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f19267a = 0;
    public final /* synthetic */ int b;
    public final /* synthetic */ int c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ s31(int i, RouteDetailsComponent routeDetailsComponent, int i2, List list, ArrayList arrayList) {
        this.b = i;
        this.d = routeDetailsComponent;
        this.c = i2;
        this.e = list;
        this.f = arrayList;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f19267a) {
            case 0:
                RouteDetailsComponent routeDetailsComponent = (RouteDetailsComponent) this.d;
                List list = (List) this.e;
                ArrayList arrayList = (ArrayList) this.f;
                RouteDetailsDataState it = (RouteDetailsDataState) obj;
                Intrinsics.i(it, "it");
                List list2 = it.j;
                String str = ((RouteDetailsStopUiModel) list2.get(this.b)).c;
                int i = routeDetailsComponent.h0;
                List list3 = list2;
                ArrayList arrayList2 = new ArrayList(CollectionsKt.v(list3, 10));
                int i2 = 0;
                for (Object obj2 : list3) {
                    int i3 = i2 + 1;
                    if (i2 < 0) {
                        CollectionsKt.z0();
                        throw null;
                    }
                    RouteDetailsStopUiModel routeDetailsStopUiModel = (RouteDetailsStopUiModel) obj2;
                    arrayList2.add(RouteDetailsStopUiModel.a(routeDetailsStopUiModel, false, false, i2 > i, false, i == i2, null, null, i2 == i ? CollectionsKt.d0(RouteDetailsStopHelpTag.USER_DESTINATION_STOP, routeDetailsStopUiModel.k) : this.c == i2 ? CollectionsKt.Z(routeDetailsStopUiModel.k, RouteDetailsStopHelpTag.USER_DESTINATION_STOP) : routeDetailsStopUiModel.k, null, 15199));
                    i2 = i3;
                }
                return RouteDetailsDataState.a(it, false, null, null, null, null, null, null, RouteDetailsViewType.MainScreen.f4880a, null, arrayList2, str, RouteDetailsMapUiModel.a(it.m, list, false, null, 6), null, false, false, null, null, null, null, true, null, null, false, false, false, arrayList, null, false, false, null, "", false, null, false, null, false, -272635521, ComposerImplKt.nodeKey);
            default:
                return RowMeasurePolicy.placeHelper$lambda$0$0((Placeable[]) this.d, (RowMeasurePolicy) this.e, this.b, this.c, (int[]) this.f, (Placeable.PlacementScope) obj);
        }
    }

    public /* synthetic */ s31(Placeable[] placeableArr, RowMeasurePolicy rowMeasurePolicy, int i, int i2, int[] iArr) {
        this.d = placeableArr;
        this.e = rowMeasurePolicy;
        this.b = i;
        this.c = i2;
        this.f = iArr;
    }
}
