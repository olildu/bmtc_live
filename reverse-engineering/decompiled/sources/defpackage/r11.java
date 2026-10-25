package defpackage;

import app.chalo.home.nearbytrips.data.model.NearbyStopAndTripsUiModel;
import app.chalo.home.ui.regularbus.RegularBusViewIntent;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class r11 implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f19170a;
    public final /* synthetic */ Function1 b;
    public final /* synthetic */ NearbyStopAndTripsUiModel c;

    public /* synthetic */ r11(Function1 function1, NearbyStopAndTripsUiModel nearbyStopAndTripsUiModel, int i) {
        this.f19170a = i;
        this.b = function1;
        this.c = nearbyStopAndTripsUiModel;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f19170a) {
            case 0:
                this.b.invoke(new RegularBusViewIntent.SeeAllStopsClickedIntent(this.c));
                break;
            case 1:
                this.b.invoke(new RegularBusViewIntent.SeeAllBusesClickedIntent(this.c));
                break;
            case 2:
                this.b.invoke(this.c);
                break;
            case 3:
                this.b.invoke(this.c);
                break;
            case 4:
                this.b.invoke(this.c);
                break;
            default:
                this.b.invoke(this.c);
                break;
        }
        return Unit.f17538a;
    }
}
