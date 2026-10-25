package app.chalo.premiumbus.ui.faredetails.contract;

import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/premiumbus/ui/faredetails/contract/PremiumBusPassengerDetailsSectionUiState;", "", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class PremiumBusPassengerDetailsSectionUiState {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f7626a;
    public final PremiumBusPassengerDetailsUISpecs b;

    public PremiumBusPassengerDetailsSectionUiState(ArrayList arrayList) {
        PremiumBusPassengerDetailsUISpecs premiumBusPassengerDetailsUISpecs = new PremiumBusPassengerDetailsUISpecs();
        this.f7626a = arrayList;
        this.b = premiumBusPassengerDetailsUISpecs;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PremiumBusPassengerDetailsSectionUiState)) {
            return false;
        }
        PremiumBusPassengerDetailsSectionUiState premiumBusPassengerDetailsSectionUiState = (PremiumBusPassengerDetailsSectionUiState) obj;
        return Intrinsics.d(this.f7626a, premiumBusPassengerDetailsSectionUiState.f7626a) && Intrinsics.d(this.b, premiumBusPassengerDetailsSectionUiState.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f7626a.hashCode() * 31);
    }

    public final String toString() {
        return "PremiumBusPassengerDetailsSectionUiState(passengers=" + this.f7626a + ", specs=" + this.b + ")";
    }
}
