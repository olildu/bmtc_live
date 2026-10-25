package defpackage;

import androidx.compose.runtime.ComposerImplKt;
import app.chalo.livetracking.routedetails.data.model.ui.RouteDetailsMapUiModelKt;
import app.chalo.livetracking.ui.routedetailsscreen.RouteDetailsComponent;
import app.chalo.livetracking.ui.routedetailsscreen.RouteDetailsDataState;
import app.chalo.livetracking.ui.routedetailsscreen.RouteDetailsIntent;
import app.chalo.livetracking.ui.routedetailsscreen.RouteDetailsViewType;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class p31 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f19001a;
    public final /* synthetic */ RouteDetailsComponent b;

    public /* synthetic */ p31(RouteDetailsComponent routeDetailsComponent, int i) {
        this.f19001a = i;
        this.b = routeDetailsComponent;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f19001a) {
            case 0:
                RouteDetailsDataState it = (RouteDetailsDataState) obj;
                Intrinsics.i(it, "it");
                return RouteDetailsDataState.a(it, false, null, null, null, null, null, null, RouteDetailsViewType.StopListForUserDestinationUpdate.f4881a, null, null, null, RouteDetailsMapUiModelKt.b(it.m, this.b.z0), null, false, false, null, null, null, null, false, null, null, false, false, false, null, null, false, false, null, "", false, null, false, null, false, -4225, ComposerImplKt.nodeKey);
            case 1:
                RouteDetailsDataState it2 = (RouteDetailsDataState) obj;
                Intrinsics.i(it2, "it");
                return RouteDetailsDataState.a(it2, false, null, null, null, null, null, null, null, null, null, null, null, null, false, false, null, null, null, this.b.n0, false, null, null, false, false, false, null, null, false, false, null, null, false, null, false, null, false, -1048577, 127);
            case 2:
                RouteDetailsDataState it3 = (RouteDetailsDataState) obj;
                Intrinsics.i(it3, "it");
                return RouteDetailsDataState.a(it3, false, null, null, null, null, null, null, RouteDetailsViewType.StopSearchForEta.f4882a, null, null, null, RouteDetailsMapUiModelKt.b(it3.m, this.b.z0), null, false, false, null, null, null, null, false, null, null, false, false, false, null, null, false, false, null, "", false, null, false, null, false, -4225, ComposerImplKt.nodeKey);
            default:
                String it4 = (String) obj;
                Intrinsics.i(it4, "it");
                this.b.f1(new RouteDetailsIntent.ReportProblemFeedbackEntered(it4));
                return Unit.f17538a;
        }
    }
}
