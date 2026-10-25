package app.chalo.productpurchase.passpurchase.ui.confirmation;

import app.chalo.compose.theme.ChaloPadding;
import app.chalo.compose.theme.ChaloThemeHelper;
import app.chalo.compose.theme.UIShape;
import app.chalo.uistate.button.ButtonUIState;
import app.chalo.uistate.card.CardUISpec;
import app.chalo.uistate.text.TextUIState;
import defpackage.r30;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/productpurchase/passpurchase/ui/confirmation/SuperPassConfirmBtnUIState;", "", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class SuperPassConfirmBtnUIState {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ButtonUIState f8397a;
    public final TextUIState.ChaloTextUIState b;
    public final TextUIState.ChaloTextUIState c;
    public final ChaloPadding d;
    public final ChaloPadding e;
    public final CardUISpec f;

    public SuperPassConfirmBtnUIState(ButtonUIState submit, TextUIState.ChaloTextUIState chaloTextUIState, TextUIState.ChaloTextUIState chaloTextUIState2) {
        float f = ChaloThemeHelper.a().h;
        ChaloPadding chaloPadding = new ChaloPadding(f, f, f, f);
        ChaloPadding chaloPadding2 = new ChaloPadding(ChaloThemeHelper.a().h, 0.0f, 0.0f, 0.0f, 14);
        CardUISpec cardUISpec = new CardUISpec(UIShape.f1926a, ChaloThemeHelper.a().f1916a, ChaloThemeHelper.a().f);
        Intrinsics.i(submit, "submit");
        this.f8397a = submit;
        this.b = chaloTextUIState;
        this.c = chaloTextUIState2;
        this.d = chaloPadding;
        this.e = chaloPadding2;
        this.f = cardUISpec;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SuperPassConfirmBtnUIState)) {
            return false;
        }
        SuperPassConfirmBtnUIState superPassConfirmBtnUIState = (SuperPassConfirmBtnUIState) obj;
        return Intrinsics.d(this.f8397a, superPassConfirmBtnUIState.f8397a) && Intrinsics.d(this.b, superPassConfirmBtnUIState.b) && Intrinsics.d(this.c, superPassConfirmBtnUIState.c) && Intrinsics.d(this.d, superPassConfirmBtnUIState.d) && Intrinsics.d(this.e, superPassConfirmBtnUIState.e) && Intrinsics.d(this.f, superPassConfirmBtnUIState.f);
    }

    public final int hashCode() {
        return this.f.hashCode() + r30.c(this.e, r30.c(this.d, r30.f(this.c, r30.f(this.b, this.f8397a.hashCode() * 31, 31), 31), 31), 31);
    }

    public final String toString() {
        return "SuperPassConfirmBtnUIState(submit=" + this.f8397a + ", totalAmountTitle=" + this.b + ", fareAmount=" + this.c + ", internalPadding=" + this.d + ", paddingAroundSubmitBtn=" + this.e + ", cardSpec=" + this.f + ")";
    }
}
