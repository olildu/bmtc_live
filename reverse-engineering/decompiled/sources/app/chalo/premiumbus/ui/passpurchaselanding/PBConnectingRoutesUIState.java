package app.chalo.premiumbus.ui.passpurchaselanding;

import androidx.compose.ui.unit.Dp;
import app.chalo.compose.theme.ChaloThemeHelper;
import app.chalo.uistate.components.TextWithFilledTrailingIconUIState;
import app.chalo.uistate.text.TextUIState;
import defpackage.r30;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/premiumbus/ui/passpurchaselanding/PBConnectingRoutesUIState;", "", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class PBConnectingRoutesUIState {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f7643a;
    public final TextUIState.ChaloTextUIState b;
    public final TextWithFilledTrailingIconUIState c;

    public PBConnectingRoutesUIState(TextUIState.ChaloTextUIState title, TextWithFilledTrailingIconUIState textWithFilledTrailingIconUIState) {
        float f = ChaloThemeHelper.a().h;
        Intrinsics.i(title, "title");
        this.f7643a = f;
        this.b = title;
        this.c = textWithFilledTrailingIconUIState;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PBConnectingRoutesUIState)) {
            return false;
        }
        PBConnectingRoutesUIState pBConnectingRoutesUIState = (PBConnectingRoutesUIState) obj;
        return Dp.m7283equalsimpl0(this.f7643a, pBConnectingRoutesUIState.f7643a) && Intrinsics.d(this.b, pBConnectingRoutesUIState.b) && Intrinsics.d(this.c, pBConnectingRoutesUIState.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + r30.f(this.b, Dp.m7284hashCodeimpl(this.f7643a) * 31, 31);
    }

    public final String toString() {
        return "PBConnectingRoutesUIState(titleAndButtonSpace=" + Dp.m7289toStringimpl(this.f7643a) + ", title=" + this.b + ", buttonWithTrailingIcon=" + this.c + ")";
    }
}
