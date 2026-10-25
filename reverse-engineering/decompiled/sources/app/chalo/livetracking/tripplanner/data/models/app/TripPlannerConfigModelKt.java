package app.chalo.livetracking.tripplanner.data.models.app;

import app.chalo.citydata.data.model.app.RouteServiceType;
import app.chalo.providers.cityprovider.impl.data.models.app.ChaloTransitMode;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"livetracking_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class TripPlannerConfigModelKt {
    public static final boolean a(TripPlannerTabType tripPlannerTabType) {
        Intrinsics.i(tripPlannerTabType, "<this>");
        return tripPlannerTabType.b == ChaloTransitMode.BUS && tripPlannerTabType.d == RouteServiceType.PREMIUM;
    }
}
