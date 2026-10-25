package defpackage;

import app.chalo.productbooking.pickstop.PickStopComponent;
import app.chalo.productbooking.pickstop.PickStopDataState;
import app.chalo.productbooking.pickstop.PickStopIntent;
import app.chalo.providers.cityprovider.impl.data.models.app.ChaloTransitMode;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class xr0 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f20046a;
    public final /* synthetic */ PickStopComponent b;

    public /* synthetic */ xr0(PickStopComponent pickStopComponent, int i) {
        this.f20046a = i;
        this.b = pickStopComponent;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f20046a) {
            case 0:
                String it = (String) obj;
                Intrinsics.i(it, "it");
                this.b.I0(new PickStopIntent.SearchAndLoadStopListIntent(it));
                return Unit.f17538a;
            case 1:
                PickStopDataState it2 = (PickStopDataState) obj;
                Intrinsics.i(it2, "it");
                return PickStopDataState.a(it2, null, false, this.b.q, "", 19);
            default:
                PickStopDataState pickStopDataState = (PickStopDataState) obj;
                PickStopComponent pickStopComponent = this.b;
                ChaloTransitMode chaloTransitMode = pickStopComponent.k.d;
                if (chaloTransitMode == null) {
                    chaloTransitMode = ChaloTransitMode.UNKNOWN;
                }
                return PickStopDataState.a(pickStopDataState, chaloTransitMode, false, pickStopComponent.q, null, 24);
        }
    }
}
