package defpackage;

import app.chalo.metro.ui.landing.MetroLandingScreenDataState;
import app.chalo.metro.ui.regular.StopBasedMetroLandingScreenDataState;
import app.chalo.recent.model.app.RecentStopBasedTripAppModel;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class oi0 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f18601a;
    public final /* synthetic */ RecentStopBasedTripAppModel b;

    public /* synthetic */ oi0(RecentStopBasedTripAppModel recentStopBasedTripAppModel, int i) {
        this.f18601a = i;
        this.b = recentStopBasedTripAppModel;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f18601a) {
            case 0:
                MetroLandingScreenDataState it = (MetroLandingScreenDataState) obj;
                Intrinsics.i(it, "it");
                RecentStopBasedTripAppModel recentStopBasedTripAppModel = this.b;
                return MetroLandingScreenDataState.a(it, false, null, null, null, null, null, null, null, null, null, recentStopBasedTripAppModel.g, recentStopBasedTripAppModel.h, null, 5119);
            default:
                StopBasedMetroLandingScreenDataState it2 = (StopBasedMetroLandingScreenDataState) obj;
                Intrinsics.i(it2, "it");
                RecentStopBasedTripAppModel recentStopBasedTripAppModel2 = this.b;
                return StopBasedMetroLandingScreenDataState.a(it2, null, false, null, null, null, null, null, null, recentStopBasedTripAppModel2.g, recentStopBasedTripAppModel2.h, null, null, null, 7422);
        }
    }
}
