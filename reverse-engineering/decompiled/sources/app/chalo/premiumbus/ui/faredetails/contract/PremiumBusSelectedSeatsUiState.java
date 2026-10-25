package app.chalo.premiumbus.ui.faredetails.contract;

import app.chalo.compose.theme.ChaloThemeHelper;
import app.chalo.uistate.base.ChaloColorToken;
import app.chalo.uistate.divider.DividerUIState;
import app.chalo.uistate.image.ImageUIState;
import app.chalo.uistate.text.TextUIState;
import defpackage.pk0;
import defpackage.py;
import defpackage.r30;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/premiumbus/ui/faredetails/contract/PremiumBusSelectedSeatsUiState;", "", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class PremiumBusSelectedSeatsUiState {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ImageUIState f7634a;
    public final TextUIState.ChaloTextUIState b;
    public final TextUIState.ChaloTextUIState c;
    public final DividerUIState d;
    public final PremiumBusSelectedSeatsUISpecs e;

    public PremiumBusSelectedSeatsUiState(ImageUIState seatIconUIState, TextUIState.ChaloTextUIState seatNumbersTextUIState, TextUIState.ChaloTextUIState chaloTextUIState) {
        DividerUIState dividerUIState = new DividerUIState(ChaloThemeHelper.a().b, ChaloColorToken.DividerColor.f9793a, null, 4);
        PremiumBusSelectedSeatsUISpecs premiumBusSelectedSeatsUISpecs = new PremiumBusSelectedSeatsUISpecs();
        Intrinsics.i(seatIconUIState, "seatIconUIState");
        Intrinsics.i(seatNumbersTextUIState, "seatNumbersTextUIState");
        this.f7634a = seatIconUIState;
        this.b = seatNumbersTextUIState;
        this.c = chaloTextUIState;
        this.d = dividerUIState;
        this.e = premiumBusSelectedSeatsUISpecs;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PremiumBusSelectedSeatsUiState)) {
            return false;
        }
        PremiumBusSelectedSeatsUiState premiumBusSelectedSeatsUiState = (PremiumBusSelectedSeatsUiState) obj;
        return Intrinsics.d(this.f7634a, premiumBusSelectedSeatsUiState.f7634a) && Intrinsics.d(this.b, premiumBusSelectedSeatsUiState.b) && Intrinsics.d(this.c, premiumBusSelectedSeatsUiState.c) && Intrinsics.d(this.d, premiumBusSelectedSeatsUiState.d) && Intrinsics.d(this.e, premiumBusSelectedSeatsUiState.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + py.c(this.d, r30.f(this.c, r30.f(this.b, this.f7634a.hashCode() * 31, 31), 31), 31);
    }

    public final String toString() {
        StringBuilder sbN = pk0.n("PremiumBusSelectedSeatsUiState(seatIconUIState=", this.f7634a, ", seatNumbersTextUIState=", this.b, ", changeSeatTextUIState=");
        sbN.append(this.c);
        sbN.append(", dividerUIState=");
        sbN.append(this.d);
        sbN.append(", specs=");
        sbN.append(this.e);
        sbN.append(")");
        return sbN.toString();
    }
}
