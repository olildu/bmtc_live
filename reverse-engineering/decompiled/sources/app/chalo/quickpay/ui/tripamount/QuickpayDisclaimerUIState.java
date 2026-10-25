package app.chalo.quickpay.ui.tripamount;

import app.chalo.compose.theme.ChaloPadding;
import app.chalo.compose.theme.ChaloThemeHelper;
import app.chalo.compose.theme.UIShape;
import app.chalo.uistate.base.ChaloColorToken;
import app.chalo.uistate.text.TextUIState;
import defpackage.r30;
import defpackage.z40;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/quickpay/ui/tripamount/QuickpayDisclaimerUIState;", "", "wallet_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class QuickpayDisclaimerUIState {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextUIState.ChaloTextUIState f8899a;
    public final ChaloPadding b;
    public final ChaloColorToken c;
    public final UIShape d;

    public QuickpayDisclaimerUIState(TextUIState.ChaloTextUIState chaloTextUIState) {
        float f = ChaloThemeHelper.a().f;
        float f2 = ChaloThemeHelper.a().h;
        ChaloPadding chaloPadding = new ChaloPadding(f, f2, f2, f);
        float f3 = ChaloThemeHelper.a().d;
        UIShape.Rectangle rectangle = new UIShape.Rectangle(f3, f3, f3, f3);
        this.f8899a = chaloTextUIState;
        this.b = chaloPadding;
        this.c = ChaloColorToken.OrangeBackground.f9832a;
        this.d = rectangle;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof QuickpayDisclaimerUIState)) {
            return false;
        }
        QuickpayDisclaimerUIState quickpayDisclaimerUIState = (QuickpayDisclaimerUIState) obj;
        return Intrinsics.d(this.f8899a, quickpayDisclaimerUIState.f8899a) && Intrinsics.d(this.b, quickpayDisclaimerUIState.b) && Intrinsics.d(this.c, quickpayDisclaimerUIState.c) && Intrinsics.d(this.d, quickpayDisclaimerUIState.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + z40.b(this.c, r30.c(this.b, this.f8899a.hashCode() * 31, 31), 31);
    }

    public final String toString() {
        return "QuickpayDisclaimerUIState(text=" + this.f8899a + ", internalPadding=" + this.b + ", background=" + this.c + ", shape=" + this.d + ")";
    }
}
