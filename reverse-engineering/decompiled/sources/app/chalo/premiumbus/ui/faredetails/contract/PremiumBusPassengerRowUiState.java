package app.chalo.premiumbus.ui.faredetails.contract;

import app.chalo.uistate.divider.DividerUIState;
import app.chalo.uistate.radiobutton.RadioButtonUIState;
import app.chalo.uistate.text.TextUIState;
import defpackage.n21;
import defpackage.r30;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/premiumbus/ui/faredetails/contract/PremiumBusPassengerRowUiState;", "", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class PremiumBusPassengerRowUiState {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextUIState.ChaloTextUIState f7628a;
    public final TextUIState.ChaloTextUIState b;
    public final TextUIState.ChaloTextUIState c;
    public final PremiumBusDiscountTagUiState d;
    public final RadioButtonUIState e;
    public final PremiumBusPassengerCounterUiState f;
    public final DividerUIState g;

    public PremiumBusPassengerRowUiState(TextUIState.ChaloTextUIState chaloTextUIState, TextUIState.ChaloTextUIState chaloTextUIState2, TextUIState.ChaloTextUIState chaloTextUIState3, PremiumBusDiscountTagUiState premiumBusDiscountTagUiState, RadioButtonUIState radioButtonUIState, PremiumBusPassengerCounterUiState premiumBusPassengerCounterUiState, DividerUIState dividerUIState) {
        this.f7628a = chaloTextUIState;
        this.b = chaloTextUIState2;
        this.c = chaloTextUIState3;
        this.d = premiumBusDiscountTagUiState;
        this.e = radioButtonUIState;
        this.f = premiumBusPassengerCounterUiState;
        this.g = dividerUIState;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PremiumBusPassengerRowUiState)) {
            return false;
        }
        PremiumBusPassengerRowUiState premiumBusPassengerRowUiState = (PremiumBusPassengerRowUiState) obj;
        return Intrinsics.d(this.f7628a, premiumBusPassengerRowUiState.f7628a) && Intrinsics.d(this.b, premiumBusPassengerRowUiState.b) && Intrinsics.d(this.c, premiumBusPassengerRowUiState.c) && Intrinsics.d(this.d, premiumBusPassengerRowUiState.d) && Intrinsics.d(this.e, premiumBusPassengerRowUiState.e) && Intrinsics.d(this.f, premiumBusPassengerRowUiState.f) && Intrinsics.d(this.g, premiumBusPassengerRowUiState.g);
    }

    public final int hashCode() {
        int iF = r30.f(this.b, this.f7628a.hashCode() * 31, 31);
        TextUIState.ChaloTextUIState chaloTextUIState = this.c;
        int iHashCode = (iF + (chaloTextUIState == null ? 0 : chaloTextUIState.hashCode())) * 31;
        PremiumBusDiscountTagUiState premiumBusDiscountTagUiState = this.d;
        int iHashCode2 = (iHashCode + (premiumBusDiscountTagUiState == null ? 0 : premiumBusDiscountTagUiState.hashCode())) * 31;
        RadioButtonUIState radioButtonUIState = this.e;
        int iHashCode3 = (iHashCode2 + (radioButtonUIState == null ? 0 : radioButtonUIState.hashCode())) * 31;
        PremiumBusPassengerCounterUiState premiumBusPassengerCounterUiState = this.f;
        int iHashCode4 = (iHashCode3 + (premiumBusPassengerCounterUiState == null ? 0 : premiumBusPassengerCounterUiState.hashCode())) * 31;
        DividerUIState dividerUIState = this.g;
        return iHashCode4 + (dividerUIState != null ? dividerUIState.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbJ = n21.j("PremiumBusPassengerRowUiState(nameTextUIState=", this.f7628a, ", payableFareTextUIState=", this.b, ", actualFareTextUIState=");
        sbJ.append(this.c);
        sbJ.append(", discountTag=");
        sbJ.append(this.d);
        sbJ.append(", radioButtonUIState=");
        sbJ.append(this.e);
        sbJ.append(", counter=");
        sbJ.append(this.f);
        sbJ.append(", dividerUIState=");
        sbJ.append(this.g);
        sbJ.append(")");
        return sbJ.toString();
    }
}
