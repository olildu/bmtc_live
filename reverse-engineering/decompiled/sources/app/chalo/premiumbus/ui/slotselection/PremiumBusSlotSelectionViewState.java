package app.chalo.premiumbus.ui.slotselection;

import app.chalo.uistate.button.ButtonUIState;
import app.chalo.uistate.dialog.LoadingDialogUIState;
import defpackage.r30;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/premiumbus/ui/slotselection/PremiumBusSlotSelectionViewState;", "", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class PremiumBusSlotSelectionViewState {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final PremiumBusSlotSelectionSpecs f7895a;
    public final Long b;
    public final boolean c;
    public final LoadingDialogUIState d;
    public final boolean e;
    public final PremiumBusSlotSelectionToolBarUIState f;
    public final List g;
    public final SlotSelectionFullScreenErrorUIState h;
    public final ButtonUIState i;
    public final ButtonUIState j;
    public final PremiumBusBottomSheetTypeUIState k;
    public final String l;

    public PremiumBusSlotSelectionViewState(Long l, boolean z, LoadingDialogUIState loadingDialogUIState, boolean z2, PremiumBusSlotSelectionToolBarUIState toolBarUIState, List odPairWithSlotsCardAndSectionInfoUIState, SlotSelectionFullScreenErrorUIState slotSelectionFullScreenErrorUIState, ButtonUIState buttonUIState, ButtonUIState buttonUIState2, PremiumBusBottomSheetTypeUIState premiumBusBottomSheetTypeUIState, String str) {
        PremiumBusSlotSelectionSpecs premiumBusSlotSelectionSpecs = new PremiumBusSlotSelectionSpecs();
        Intrinsics.i(toolBarUIState, "toolBarUIState");
        Intrinsics.i(odPairWithSlotsCardAndSectionInfoUIState, "odPairWithSlotsCardAndSectionInfoUIState");
        this.f7895a = premiumBusSlotSelectionSpecs;
        this.b = l;
        this.c = z;
        this.d = loadingDialogUIState;
        this.e = z2;
        this.f = toolBarUIState;
        this.g = odPairWithSlotsCardAndSectionInfoUIState;
        this.h = slotSelectionFullScreenErrorUIState;
        this.i = buttonUIState;
        this.j = buttonUIState2;
        this.k = premiumBusBottomSheetTypeUIState;
        this.l = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PremiumBusSlotSelectionViewState)) {
            return false;
        }
        PremiumBusSlotSelectionViewState premiumBusSlotSelectionViewState = (PremiumBusSlotSelectionViewState) obj;
        return Intrinsics.d(this.f7895a, premiumBusSlotSelectionViewState.f7895a) && Intrinsics.d(this.b, premiumBusSlotSelectionViewState.b) && this.c == premiumBusSlotSelectionViewState.c && Intrinsics.d(this.d, premiumBusSlotSelectionViewState.d) && this.e == premiumBusSlotSelectionViewState.e && Intrinsics.d(this.f, premiumBusSlotSelectionViewState.f) && Intrinsics.d(this.g, premiumBusSlotSelectionViewState.g) && Intrinsics.d(this.h, premiumBusSlotSelectionViewState.h) && Intrinsics.d(this.i, premiumBusSlotSelectionViewState.i) && Intrinsics.d(this.j, premiumBusSlotSelectionViewState.j) && Intrinsics.d(this.k, premiumBusSlotSelectionViewState.k) && Intrinsics.d(this.l, premiumBusSlotSelectionViewState.l);
    }

    public final int hashCode() {
        int iHashCode = this.f7895a.hashCode() * 31;
        Long l = this.b;
        int iHashCode2 = (((iHashCode + (l == null ? 0 : l.hashCode())) * 31) + (this.c ? 1231 : 1237)) * 31;
        LoadingDialogUIState loadingDialogUIState = this.d;
        int iB = r30.b((this.f.hashCode() + ((((iHashCode2 + (loadingDialogUIState == null ? 0 : loadingDialogUIState.hashCode())) * 31) + (this.e ? 1231 : 1237)) * 31)) * 31, 31, this.g);
        SlotSelectionFullScreenErrorUIState slotSelectionFullScreenErrorUIState = this.h;
        int iHashCode3 = (iB + (slotSelectionFullScreenErrorUIState == null ? 0 : slotSelectionFullScreenErrorUIState.hashCode())) * 31;
        ButtonUIState buttonUIState = this.i;
        int iHashCode4 = (iHashCode3 + (buttonUIState == null ? 0 : buttonUIState.hashCode())) * 31;
        ButtonUIState buttonUIState2 = this.j;
        int iHashCode5 = (iHashCode4 + (buttonUIState2 == null ? 0 : buttonUIState2.hashCode())) * 31;
        PremiumBusBottomSheetTypeUIState premiumBusBottomSheetTypeUIState = this.k;
        int iHashCode6 = (iHashCode5 + (premiumBusBottomSheetTypeUIState == null ? 0 : premiumBusBottomSheetTypeUIState.hashCode())) * 31;
        String str = this.l;
        return iHashCode6 + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        return "PremiumBusSlotSelectionViewState(spec=" + this.f7895a + ", selectedSection=" + this.b + ", initialFetching=" + this.c + ", loadingDialogUIState=" + this.d + ", isFetchingSlots=" + this.e + ", toolBarUIState=" + this.f + ", odPairWithSlotsCardAndSectionInfoUIState=" + this.g + ", slotSelectionFullScreenErrorUIState=" + this.h + ", bookThisRideBtnUIState=" + this.i + ", bookForMultipleRideBtnUIState=" + this.j + ", bottomSheetStateUIState=" + this.k + ", snackBarMessage=" + this.l + ")";
    }
}
