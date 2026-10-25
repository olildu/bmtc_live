package app.chalo.premiumbus.ui.faredetails.contract;

import androidx.compose.ui.unit.Dp;
import app.chalo.compose.theme.ChaloThemeHelper;
import app.chalo.uistate.image.ImageUIState;
import app.chalo.uistate.text.TextUIState;
import defpackage.pk0;
import defpackage.r30;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/premiumbus/ui/faredetails/contract/PremiumBusPassengerCounterUiState;", "", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class PremiumBusPassengerCounterUiState {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ImageUIState f7625a;
    public final TextUIState.ChaloTextUIState b;
    public final ImageUIState c;
    public final float d;

    public PremiumBusPassengerCounterUiState(ImageUIState imageUIState, TextUIState.ChaloTextUIState chaloTextUIState, ImageUIState imageUIState2) {
        float f = ChaloThemeHelper.a().h;
        this.f7625a = imageUIState;
        this.b = chaloTextUIState;
        this.c = imageUIState2;
        this.d = f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PremiumBusPassengerCounterUiState)) {
            return false;
        }
        PremiumBusPassengerCounterUiState premiumBusPassengerCounterUiState = (PremiumBusPassengerCounterUiState) obj;
        return Intrinsics.d(this.f7625a, premiumBusPassengerCounterUiState.f7625a) && Intrinsics.d(this.b, premiumBusPassengerCounterUiState.b) && Intrinsics.d(this.c, premiumBusPassengerCounterUiState.c) && Dp.m7283equalsimpl0(this.d, premiumBusPassengerCounterUiState.d);
    }

    public final int hashCode() {
        return Dp.m7284hashCodeimpl(this.d) + r30.e(this.c, r30.f(this.b, this.f7625a.hashCode() * 31, 31), 31);
    }

    public final String toString() {
        String strM7289toStringimpl = Dp.m7289toStringimpl(this.d);
        StringBuilder sbN = pk0.n("PremiumBusPassengerCounterUiState(decrementIconUIState=", this.f7625a, ", countTextUIState=", this.b, ", incrementIconUIState=");
        sbN.append(this.c);
        sbN.append(", countHorizontalPadding=");
        sbN.append(strM7289toStringimpl);
        sbN.append(")");
        return sbN.toString();
    }
}
