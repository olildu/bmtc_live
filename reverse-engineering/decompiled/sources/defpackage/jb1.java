package defpackage;

import app.chalo.livetracking.search.SearchTarget;
import app.chalo.livetracking.search.StopBasedSearchSelectedLocation;
import app.chalo.livetracking.search.StopBasedTripPlannerSearchDataState;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class jb1 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f17390a;
    public final /* synthetic */ StopBasedSearchSelectedLocation b;
    public final /* synthetic */ StopBasedSearchSelectedLocation c;

    public /* synthetic */ jb1(StopBasedSearchSelectedLocation stopBasedSearchSelectedLocation, StopBasedSearchSelectedLocation stopBasedSearchSelectedLocation2, int i) {
        this.f17390a = i;
        this.b = stopBasedSearchSelectedLocation;
        this.c = stopBasedSearchSelectedLocation2;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f17390a) {
            case 0:
                StopBasedTripPlannerSearchDataState it = (StopBasedTripPlannerSearchDataState) obj;
                Intrinsics.i(it, "it");
                return StopBasedTripPlannerSearchDataState.a(it, this.b, this.c, null, null, null, false, null, null, null, null, 2044);
            case 1:
                StopBasedTripPlannerSearchDataState it2 = (StopBasedTripPlannerSearchDataState) obj;
                Intrinsics.i(it2, "it");
                return StopBasedTripPlannerSearchDataState.a(it2, this.b, this.c, null, null, null, false, null, null, null, null, 2044);
            default:
                StopBasedTripPlannerSearchDataState it3 = (StopBasedTripPlannerSearchDataState) obj;
                Intrinsics.i(it3, "it");
                return StopBasedTripPlannerSearchDataState.a(it3, this.b, this.c, null, null, null, false, null, null, null, SearchTarget.NONE, 1020);
        }
    }
}
