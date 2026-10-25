package defpackage;

import app.chalo.livetracking.search.StopBasedTripPlannerSearchViewIntent;
import app.chalo.livetracking.stoptripplannerresult.StopTripPlannerResultIntent;
import app.chalo.recent.model.app.RecentPlaceAppModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class ob1 implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f18584a;
    public final /* synthetic */ Function1 b;
    public final /* synthetic */ RecentPlaceAppModel c;

    public /* synthetic */ ob1(Function1 function1, RecentPlaceAppModel recentPlaceAppModel, int i) {
        this.f18584a = i;
        this.b = function1;
        this.c = recentPlaceAppModel;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f18584a) {
            case 0:
                this.b.invoke(new StopBasedTripPlannerSearchViewIntent.RetryNearestStopFetchIntent(this.c));
                break;
            default:
                this.b.invoke(new StopTripPlannerResultIntent.RetryNearbyStopFetchIntent(this.c));
                break;
        }
        return Unit.f17538a;
    }
}
