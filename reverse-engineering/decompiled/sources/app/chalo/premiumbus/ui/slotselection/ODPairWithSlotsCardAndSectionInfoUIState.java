package app.chalo.premiumbus.ui.slotselection;

import app.chalo.uistate.text.TextUIState;
import defpackage.r30;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/premiumbus/ui/slotselection/ODPairWithSlotsCardAndSectionInfoUIState;", "", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class ODPairWithSlotsCardAndSectionInfoUIState {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f7816a;
    public final PassPurchaseNudgeCardUIState b;
    public final NoRideAvailableForSelectedTimeUIState c;
    public final PBSlotSelectionTabItemUIState d;
    public final List e;
    public final TextUIState.ChaloTextUIState f;
    public final boolean g;

    public ODPairWithSlotsCardAndSectionInfoUIState(long j, PassPurchaseNudgeCardUIState passPurchaseNudgeCardUIState, NoRideAvailableForSelectedTimeUIState noRideAvailableForSelectedTimeUIState, PBSlotSelectionTabItemUIState sectionUIState, List odPairAndSlotsInfo, TextUIState.ChaloTextUIState chaloTextUIState, boolean z) {
        Intrinsics.i(sectionUIState, "sectionUIState");
        Intrinsics.i(odPairAndSlotsInfo, "odPairAndSlotsInfo");
        this.f7816a = j;
        this.b = passPurchaseNudgeCardUIState;
        this.c = noRideAvailableForSelectedTimeUIState;
        this.d = sectionUIState;
        this.e = odPairAndSlotsInfo;
        this.f = chaloTextUIState;
        this.g = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ODPairWithSlotsCardAndSectionInfoUIState)) {
            return false;
        }
        ODPairWithSlotsCardAndSectionInfoUIState oDPairWithSlotsCardAndSectionInfoUIState = (ODPairWithSlotsCardAndSectionInfoUIState) obj;
        return this.f7816a == oDPairWithSlotsCardAndSectionInfoUIState.f7816a && Intrinsics.d(this.b, oDPairWithSlotsCardAndSectionInfoUIState.b) && Intrinsics.d(this.c, oDPairWithSlotsCardAndSectionInfoUIState.c) && Intrinsics.d(this.d, oDPairWithSlotsCardAndSectionInfoUIState.d) && Intrinsics.d(this.e, oDPairWithSlotsCardAndSectionInfoUIState.e) && Intrinsics.d(this.f, oDPairWithSlotsCardAndSectionInfoUIState.f) && this.g == oDPairWithSlotsCardAndSectionInfoUIState.g;
    }

    public final int hashCode() {
        long j = this.f7816a;
        int i = ((int) (j ^ (j >>> 32))) * 31;
        PassPurchaseNudgeCardUIState passPurchaseNudgeCardUIState = this.b;
        int iHashCode = (i + (passPurchaseNudgeCardUIState == null ? 0 : passPurchaseNudgeCardUIState.hashCode())) * 31;
        NoRideAvailableForSelectedTimeUIState noRideAvailableForSelectedTimeUIState = this.c;
        int iB = r30.b((this.d.hashCode() + ((iHashCode + (noRideAvailableForSelectedTimeUIState == null ? 0 : noRideAvailableForSelectedTimeUIState.hashCode())) * 31)) * 31, 31, this.e);
        TextUIState.ChaloTextUIState chaloTextUIState = this.f;
        return ((iB + (chaloTextUIState != null ? chaloTextUIState.hashCode() : 0)) * 31) + (this.g ? 1231 : 1237);
    }

    public final String toString() {
        return "ODPairWithSlotsCardAndSectionInfoUIState(sectionId=" + this.f7816a + ", passPurchaseNudgeCardUIState=" + this.b + ", noRideAvailableForSelectedTime=" + this.c + ", sectionUIState=" + this.d + ", odPairAndSlotsInfo=" + this.e + ", loadMoreSlotsBtnUIState=" + this.f + ", isFetchingMoreSlots=" + this.g + ")";
    }
}
