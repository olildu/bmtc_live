package defpackage;

import app.chalo.premiumbus.ui.slotselection.PBSlotSelectionScreenBottomSheetType;
import app.chalo.premiumbus.ui.slotselection.PremiumBusSlotSelectionDataState;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class av0 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f11146a;
    public final /* synthetic */ PBSlotSelectionScreenBottomSheetType.AvailablePurchaseOptions b;

    public /* synthetic */ av0(PBSlotSelectionScreenBottomSheetType.AvailablePurchaseOptions availablePurchaseOptions, int i) {
        this.f11146a = i;
        this.b = availablePurchaseOptions;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        PremiumBusSlotSelectionDataState it = (PremiumBusSlotSelectionDataState) obj;
        switch (this.f11146a) {
            case 0:
                Intrinsics.i(it, "it");
                break;
            case 1:
                Intrinsics.i(it, "it");
                break;
        }
        return PremiumBusSlotSelectionDataState.a(it, false, false, false, null, null, this.b, null, null, null, 0, null, null, null, false, null, null, null, null, false, null, null, null, 0, null, false, null, null, null, null, null, -35);
    }
}
