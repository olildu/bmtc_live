package app.chalo.premiumbus.ui.faredetails.contract;

import androidx.compose.ui.unit.Dp;
import app.chalo.compose.theme.ChaloPadding;
import app.chalo.compose.theme.ChaloThemeHelper;
import app.chalo.compose.theme.UIShape;
import app.chalo.uistate.base.ChaloColorToken;
import app.chalo.uistate.text.TextUIState;
import defpackage.pk0;
import defpackage.r30;
import defpackage.vo1;
import defpackage.z40;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/premiumbus/ui/faredetails/contract/PremiumBusIncludedInPassBannerUiState;", "", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class PremiumBusIncludedInPassBannerUiState {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextUIState.ChaloTextUIState f7619a;
    public final ChaloColorToken b;
    public final ChaloPadding c;
    public final UIShape d;
    public final float e;

    public PremiumBusIncludedInPassBannerUiState(TextUIState.ChaloTextUIState chaloTextUIState) {
        float f = ChaloThemeHelper.a().g;
        float f2 = ChaloThemeHelper.a().f;
        ChaloPadding chaloPadding = new ChaloPadding(f2, f, f, f2);
        UIShape shape = ChaloThemeHelper.d.g;
        float f3 = ChaloThemeHelper.b().c;
        Intrinsics.i(shape, "shape");
        this.f7619a = chaloTextUIState;
        this.b = ChaloColorToken.GreenBase.f9800a;
        this.c = chaloPadding;
        this.d = shape;
        this.e = f3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PremiumBusIncludedInPassBannerUiState)) {
            return false;
        }
        PremiumBusIncludedInPassBannerUiState premiumBusIncludedInPassBannerUiState = (PremiumBusIncludedInPassBannerUiState) obj;
        return Intrinsics.d(this.f7619a, premiumBusIncludedInPassBannerUiState.f7619a) && Intrinsics.d(this.b, premiumBusIncludedInPassBannerUiState.b) && Intrinsics.d(this.c, premiumBusIncludedInPassBannerUiState.c) && Intrinsics.d(this.d, premiumBusIncludedInPassBannerUiState.d) && Dp.m7283equalsimpl0(this.e, premiumBusIncludedInPassBannerUiState.e);
    }

    public final int hashCode() {
        return Dp.m7284hashCodeimpl(this.e) + pk0.b(this.d, r30.c(this.c, z40.b(this.b, this.f7619a.hashCode() * 31, 31), 31), 31);
    }

    public final String toString() {
        String strM7289toStringimpl = Dp.m7289toStringimpl(this.e);
        StringBuilder sb = new StringBuilder("PremiumBusIncludedInPassBannerUiState(textUIState=");
        sb.append(this.f7619a);
        sb.append(", backgroundColor=");
        sb.append(this.b);
        sb.append(", contentPadding=");
        sb.append(this.c);
        sb.append(", shape=");
        sb.append(this.d);
        sb.append(", elevation=");
        return vo1.p(sb, strM7289toStringimpl, ")");
    }
}
