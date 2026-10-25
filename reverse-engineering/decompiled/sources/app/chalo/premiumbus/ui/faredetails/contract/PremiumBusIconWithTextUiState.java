package app.chalo.premiumbus.ui.faredetails.contract;

import androidx.compose.ui.unit.Dp;
import app.chalo.compose.theme.ChaloThemeHelper;
import app.chalo.uistate.image.ImageUIState;
import app.chalo.uistate.text.TextUIState;
import defpackage.pk0;
import defpackage.r30;
import defpackage.vo1;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/premiumbus/ui/faredetails/contract/PremiumBusIconWithTextUiState;", "", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class PremiumBusIconWithTextUiState {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ImageUIState f7618a;
    public final TextUIState.ChaloTextUIState b;
    public final float c;

    public PremiumBusIconWithTextUiState(ImageUIState imageUIState, TextUIState.ChaloTextUIState chaloTextUIState) {
        float f = ChaloThemeHelper.a().d;
        this.f7618a = imageUIState;
        this.b = chaloTextUIState;
        this.c = f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PremiumBusIconWithTextUiState)) {
            return false;
        }
        PremiumBusIconWithTextUiState premiumBusIconWithTextUiState = (PremiumBusIconWithTextUiState) obj;
        return Intrinsics.d(this.f7618a, premiumBusIconWithTextUiState.f7618a) && Intrinsics.d(this.b, premiumBusIconWithTextUiState.b) && Dp.m7283equalsimpl0(this.c, premiumBusIconWithTextUiState.c);
    }

    public final int hashCode() {
        return Dp.m7284hashCodeimpl(this.c) + r30.f(this.b, this.f7618a.hashCode() * 31, 31);
    }

    public final String toString() {
        return vo1.p(pk0.n("PremiumBusIconWithTextUiState(iconUIState=", this.f7618a, ", textUIState=", this.b, ", spaceBetweenIconAndText="), Dp.m7289toStringimpl(this.c), ")");
    }
}
