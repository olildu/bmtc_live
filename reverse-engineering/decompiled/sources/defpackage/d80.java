package defpackage;

import app.chalo.home.ui.home.HomeScreenComponent;
import app.chalo.home.ui.home.HomeScreenViewIntent;
import app.chalo.home.ui.home.HomeScreenViewState;
import app.chalo.home.ui.home.LocationTooltipData;
import app.chalo.home.ui.home.LocationTurnOnTooltipType;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class d80 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15436a;
    public final /* synthetic */ HomeScreenComponent b;

    public /* synthetic */ d80(HomeScreenComponent homeScreenComponent, int i) {
        this.f15436a = i;
        this.b = homeScreenComponent;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f15436a) {
            case 0:
                HomeScreenViewState it = (HomeScreenViewState) obj;
                Intrinsics.i(it, "it");
                return HomeScreenViewState.a(it, null, null, null, null, null, null, null, null, false, null, new LocationTooltipData(this.b.A.getR(), LocationTurnOnTooltipType.RequestLocationPermission.f3586a), null, null, null, null, false, false, false, 522239);
            default:
                HomeScreenViewIntent intent = (HomeScreenViewIntent) obj;
                Intrinsics.i(intent, "intent");
                this.b.R0(intent);
                return Unit.f17538a;
        }
    }
}
