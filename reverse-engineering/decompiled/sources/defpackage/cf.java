package defpackage;

import app.chalo.livetracking.tripplanner.ui.details.TripPlannerDetailsIntent;
import app.chalo.metro.ui.landing.MetroLandingScreenViewIntent;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class cf implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f11279a;
    public final /* synthetic */ Function1 b;
    public final /* synthetic */ int c;

    public /* synthetic */ cf(int i, int i2, Function1 function1) {
        this.f11279a = i2;
        this.b = function1;
        this.c = i;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f11279a) {
            case 0:
                this.b.invoke(Integer.valueOf(this.c));
                break;
            case 1:
                this.b.invoke(Integer.valueOf(this.c));
                break;
            case 2:
                this.b.invoke(new MetroLandingScreenViewIntent.OnLineSelectedClick(this.c));
                break;
            case 3:
                this.b.invoke(Integer.valueOf(this.c));
                break;
            case 4:
                this.b.invoke(Integer.valueOf(this.c));
                break;
            case 5:
                this.b.invoke(new TripPlannerDetailsIntent.TrackBusClickedIntent(this.c));
                break;
            case 6:
                this.b.invoke(Integer.valueOf(this.c));
                break;
            default:
                this.b.invoke(Integer.valueOf(this.c));
                break;
        }
        return Unit.f17538a;
    }
}
