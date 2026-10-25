package app.chalo.premiumbus.ui.faredetails.contract;

import androidx.compose.ui.unit.Dp;
import app.chalo.compose.theme.ChaloPadding;
import app.chalo.compose.theme.ChaloThemeHelper;
import app.chalo.uistate.image.ImageUIState;
import app.chalo.uistate.text.TextUIState;
import defpackage.pk0;
import defpackage.r30;
import defpackage.vo1;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/premiumbus/ui/faredetails/contract/PremiumBusOfferHeaderStripUiState;", "", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class PremiumBusOfferHeaderStripUiState {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ImageUIState f7622a;
    public final TextUIState.ChaloTextUIState b;
    public final List c;
    public final ChaloPadding d;
    public final float e;

    public PremiumBusOfferHeaderStripUiState(ImageUIState iconUIState, TextUIState.ChaloTextUIState chaloTextUIState, List gradientColors) {
        float f = ChaloThemeHelper.a().g;
        float f2 = ChaloThemeHelper.a().f;
        ChaloPadding chaloPadding = new ChaloPadding(f2, f, f, f2);
        float f3 = ChaloThemeHelper.a().e;
        Intrinsics.i(iconUIState, "iconUIState");
        Intrinsics.i(gradientColors, "gradientColors");
        this.f7622a = iconUIState;
        this.b = chaloTextUIState;
        this.c = gradientColors;
        this.d = chaloPadding;
        this.e = f3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PremiumBusOfferHeaderStripUiState)) {
            return false;
        }
        PremiumBusOfferHeaderStripUiState premiumBusOfferHeaderStripUiState = (PremiumBusOfferHeaderStripUiState) obj;
        return Intrinsics.d(this.f7622a, premiumBusOfferHeaderStripUiState.f7622a) && Intrinsics.d(this.b, premiumBusOfferHeaderStripUiState.b) && Intrinsics.d(this.c, premiumBusOfferHeaderStripUiState.c) && Intrinsics.d(this.d, premiumBusOfferHeaderStripUiState.d) && Dp.m7283equalsimpl0(this.e, premiumBusOfferHeaderStripUiState.e);
    }

    public final int hashCode() {
        return Dp.m7284hashCodeimpl(this.e) + r30.c(this.d, r30.b(r30.f(this.b, this.f7622a.hashCode() * 31, 31), 31, this.c), 31);
    }

    public final String toString() {
        String strM7289toStringimpl = Dp.m7289toStringimpl(this.e);
        StringBuilder sbN = pk0.n("PremiumBusOfferHeaderStripUiState(iconUIState=", this.f7622a, ", textUIState=", this.b, ", gradientColors=");
        sbN.append(this.c);
        sbN.append(", contentPadding=");
        sbN.append(this.d);
        sbN.append(", spaceAfterIcon=");
        return vo1.p(sbN, strM7289toStringimpl, ")");
    }
}
