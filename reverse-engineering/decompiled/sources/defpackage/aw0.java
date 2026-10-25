package defpackage;

import app.chalo.premiumbus.data.models.app.PBStopPlaceSelectedAppModel;
import app.chalo.premiumbus.ui.stopselection.PremiumBusStopSelectionComponent;
import app.chalo.premiumbus.ui.stopselection.PremiumBusStopSelectionIntent;
import app.chalo.premiumbus.ui.stopselection.PremiumBusStopSelectionViewState;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class aw0 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f11148a;
    public final /* synthetic */ PremiumBusStopSelectionComponent b;

    public /* synthetic */ aw0(PremiumBusStopSelectionComponent premiumBusStopSelectionComponent, int i) {
        this.f11148a = i;
        this.b = premiumBusStopSelectionComponent;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f11148a) {
            case 0:
                PremiumBusStopSelectionViewState it = (PremiumBusStopSelectionViewState) obj;
                Intrinsics.i(it, "it");
                PremiumBusStopSelectionComponent premiumBusStopSelectionComponent = this.b;
                PBStopPlaceSelectedAppModel pBStopPlaceSelectedAppModel = premiumBusStopSelectionComponent.E;
                String str = pBStopPlaceSelectedAppModel != null ? pBStopPlaceSelectedAppModel.c : null;
                PBStopPlaceSelectedAppModel pBStopPlaceSelectedAppModel2 = premiumBusStopSelectionComponent.F;
                return PremiumBusStopSelectionViewState.a(it, null, false, false, str, pBStopPlaceSelectedAppModel2 != null ? pBStopPlaceSelectedAppModel2.c : null, null, null, false, null, false, false, null, null, 131047);
            case 1:
                PremiumBusStopSelectionViewState it2 = (PremiumBusStopSelectionViewState) obj;
                Intrinsics.i(it2, "it");
                PremiumBusStopSelectionComponent premiumBusStopSelectionComponent2 = this.b;
                PBStopPlaceSelectedAppModel pBStopPlaceSelectedAppModel3 = premiumBusStopSelectionComponent2.E;
                String str2 = pBStopPlaceSelectedAppModel3 != null ? pBStopPlaceSelectedAppModel3.c : null;
                PBStopPlaceSelectedAppModel pBStopPlaceSelectedAppModel4 = premiumBusStopSelectionComponent2.F;
                return PremiumBusStopSelectionViewState.a(it2, null, false, true, str2, pBStopPlaceSelectedAppModel4 != null ? pBStopPlaceSelectedAppModel4.c : null, null, null, false, null, Intrinsics.d(pBStopPlaceSelectedAppModel3 != null ? pBStopPlaceSelectedAppModel3.b : null, "userLocation"), false, null, null, 130019);
            default:
                PremiumBusStopSelectionIntent it3 = (PremiumBusStopSelectionIntent) obj;
                Intrinsics.i(it3, "it");
                this.b.L0(it3);
                return Unit.f17538a;
        }
    }
}
