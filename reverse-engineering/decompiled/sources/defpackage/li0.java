package defpackage;

import app.chalo.citydata.data.model.app.StopAppModel;
import app.chalo.livetracking.search.StopBasedSearchSelectedLocation;
import app.chalo.livetracking.search.StopBasedTripPlannerSearchDataState;
import app.chalo.metro.ui.landing.MetroLandingScreenDataState;
import app.chalo.metro.ui.regular.StopBasedMetroLandingScreenDataState;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class li0 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f18316a;
    public final /* synthetic */ StopAppModel b;

    public /* synthetic */ li0(int i, StopAppModel stopAppModel) {
        this.f18316a = i;
        this.b = stopAppModel;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f18316a) {
            case 0:
                MetroLandingScreenDataState it = (MetroLandingScreenDataState) obj;
                Intrinsics.i(it, "it");
                return MetroLandingScreenDataState.a(it, false, null, null, null, null, null, null, null, null, null, this.b, null, null, 7167);
            case 1:
                MetroLandingScreenDataState it2 = (MetroLandingScreenDataState) obj;
                Intrinsics.i(it2, "it");
                return MetroLandingScreenDataState.a(it2, false, null, null, null, null, null, null, null, null, null, null, this.b, null, 6143);
            case 2:
                return MetroLandingScreenDataState.a((MetroLandingScreenDataState) obj, false, null, null, null, null, null, null, null, null, null, this.b, null, null, 7167);
            case 3:
                return MetroLandingScreenDataState.a((MetroLandingScreenDataState) obj, false, null, null, null, null, null, null, null, null, null, null, this.b, null, 6143);
            case 4:
                StopBasedMetroLandingScreenDataState it3 = (StopBasedMetroLandingScreenDataState) obj;
                Intrinsics.i(it3, "it");
                return StopBasedMetroLandingScreenDataState.a(it3, null, false, null, null, null, null, null, null, this.b, null, null, null, null, 7934);
            case 5:
                StopBasedMetroLandingScreenDataState it4 = (StopBasedMetroLandingScreenDataState) obj;
                Intrinsics.i(it4, "it");
                return StopBasedMetroLandingScreenDataState.a(it4, null, false, null, null, null, null, null, null, null, this.b, null, null, null, 7678);
            case 6:
                StopBasedTripPlannerSearchDataState it5 = (StopBasedTripPlannerSearchDataState) obj;
                Intrinsics.i(it5, "it");
                return StopBasedTripPlannerSearchDataState.a(it5, new StopBasedSearchSelectedLocation.StopSelected(this.b), null, null, null, null, false, null, null, null, null, 2046);
            default:
                StopBasedTripPlannerSearchDataState it6 = (StopBasedTripPlannerSearchDataState) obj;
                Intrinsics.i(it6, "it");
                return StopBasedTripPlannerSearchDataState.a(it6, null, new StopBasedSearchSelectedLocation.StopSelected(this.b), null, null, null, false, null, null, null, null, 2045);
        }
    }
}
