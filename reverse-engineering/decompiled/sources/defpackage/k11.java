package defpackage;

import app.chalo.home.data.model.app.LocationTooltipData;
import app.chalo.home.data.model.app.LocationTurnOnTooltipType;
import app.chalo.home.ui.regularbus.RegularBusComponent;
import app.chalo.home.ui.regularbus.RegularBusViewIntent;
import app.chalo.home.ui.regularbus.RegularBusViewState;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class k11 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f17456a;
    public final /* synthetic */ RegularBusComponent b;

    public /* synthetic */ k11(RegularBusComponent regularBusComponent, int i) {
        this.f17456a = i;
        this.b = regularBusComponent;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f17456a) {
            case 0:
                RegularBusViewState it = (RegularBusViewState) obj;
                Intrinsics.i(it, "it");
                return RegularBusViewState.a(it, false, null, null, null, false, null, null, null, null, null, null, null, new LocationTooltipData(this.b.s.getR(), LocationTurnOnTooltipType.RequestLocationPermission.f2946a), null, null, null, null, false, false, false, false, 4186111);
            case 1:
                RegularBusViewState it2 = (RegularBusViewState) obj;
                Intrinsics.i(it2, "it");
                return RegularBusViewState.a(it2, false, null, null, null, false, null, null, null, null, null, null, null, new LocationTooltipData(this.b.s.getR(), LocationTurnOnTooltipType.RequestLocationPermission.f2946a), null, null, null, null, false, false, false, false, 4186111);
            default:
                RegularBusViewIntent intent = (RegularBusViewIntent) obj;
                Intrinsics.i(intent, "intent");
                this.b.Z0(intent);
                return Unit.f17538a;
        }
    }
}
