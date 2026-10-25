package defpackage;

import app.chalo.metro.ui.landing.MetroLandingScreenViewIntent;
import app.chalo.metro.ui.regular.StopBasedMetroLandingScreenViewIntent;
import app.chalo.recent.model.app.RecentStopBasedTripAppModel;
import app.chalo.routeselection.ui.StopBasedRouteSearchIntent;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class ri0 implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f19213a;
    public final /* synthetic */ Function1 b;
    public final /* synthetic */ RecentStopBasedTripAppModel c;

    public /* synthetic */ ri0(Function1 function1, RecentStopBasedTripAppModel recentStopBasedTripAppModel, int i) {
        this.f19213a = i;
        this.b = function1;
        this.c = recentStopBasedTripAppModel;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f19213a) {
            case 0:
                this.b.invoke(new MetroLandingScreenViewIntent.OnRecentStopBasedPairClicked(this.c));
                break;
            case 1:
                this.b.invoke(new StopBasedMetroLandingScreenViewIntent.OnRecentStopBasedTripPairClicked(this.c));
                break;
            default:
                this.b.invoke(new StopBasedRouteSearchIntent.ClickRecentTripItemIntentBasedRoute(this.c));
                break;
        }
        return Unit.f17538a;
    }
}
