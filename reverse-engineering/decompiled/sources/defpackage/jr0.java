package defpackage;

import app.chalo.premiumbus.data.models.app.PBStopPlaceSelectedAppModel;
import app.chalo.premiumbus.ui.passpurchaselanding.PbPassPurchaseLandingScreenDataState;
import app.chalo.premiumbus.ui.stopselection.PBStopSelectionScreenBottomSheetType;
import app.chalo.premiumbus.ui.stopselection.PremiumBusStopSelectionViewState;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class jr0 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f17432a;
    public final /* synthetic */ PBStopPlaceSelectedAppModel b;
    public final /* synthetic */ PBStopPlaceSelectedAppModel c;

    public /* synthetic */ jr0(PBStopPlaceSelectedAppModel pBStopPlaceSelectedAppModel, PBStopPlaceSelectedAppModel pBStopPlaceSelectedAppModel2, int i) {
        this.f17432a = i;
        this.b = pBStopPlaceSelectedAppModel;
        this.c = pBStopPlaceSelectedAppModel2;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f17432a) {
            case 0:
                PbPassPurchaseLandingScreenDataState it = (PbPassPurchaseLandingScreenDataState) obj;
                Intrinsics.i(it, "it");
                return PbPassPurchaseLandingScreenDataState.a(it, null, false, false, false, new PBStopSelectionScreenBottomSheetType.NewRouteSuggestion(this.b, this.c), null, null, null, false, false, 4055);
            default:
                PremiumBusStopSelectionViewState it2 = (PremiumBusStopSelectionViewState) obj;
                Intrinsics.i(it2, "it");
                return PremiumBusStopSelectionViewState.a(it2, null, false, false, null, null, new PBStopSelectionScreenBottomSheetType.NewRouteSuggestion(this.b, this.c), null, false, null, false, false, null, null, 131037);
        }
    }
}
