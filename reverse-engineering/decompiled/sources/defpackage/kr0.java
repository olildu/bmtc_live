package defpackage;

import app.chalo.premiumbus.domain.FetchPBStopPointsResult;
import app.chalo.premiumbus.ui.passpurchaselanding.PbPassPurchaseLandingScreenDataState;
import app.chalo.premiumbus.ui.slotselection.PremiumBusSlotSelectionDataState;
import app.chalo.premiumbus.ui.stopselection.PBStopSelectionScreenBottomSheetType;
import app.chalo.premiumbus.ui.stopselection.PremiumBusStopSelectionViewState;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class kr0 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f18252a;
    public final /* synthetic */ FetchPBStopPointsResult.Success b;

    public /* synthetic */ kr0(FetchPBStopPointsResult.Success success, int i) {
        this.f18252a = i;
        this.b = success;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f18252a) {
            case 0:
                return PbPassPurchaseLandingScreenDataState.a((PbPassPurchaseLandingScreenDataState) obj, null, false, false, false, new PBStopSelectionScreenBottomSheetType.MultipleOriginDestinationSelection(this.b.f7192a), null, null, null, false, false, 4055);
            case 1:
                PremiumBusSlotSelectionDataState it = (PremiumBusSlotSelectionDataState) obj;
                Intrinsics.i(it, "it");
                return PremiumBusSlotSelectionDataState.a(it, false, false, false, null, null, null, null, null, null, 0, null, null, null, false, null, null, null, null, false, null, null, this.b.f7192a, 0, null, false, null, null, null, null, null, -8388609);
            default:
                return PremiumBusStopSelectionViewState.a((PremiumBusStopSelectionViewState) obj, null, false, false, null, null, new PBStopSelectionScreenBottomSheetType.MultipleOriginDestinationSelection(this.b.f7192a), null, false, null, false, false, null, null, 131037);
        }
    }
}
