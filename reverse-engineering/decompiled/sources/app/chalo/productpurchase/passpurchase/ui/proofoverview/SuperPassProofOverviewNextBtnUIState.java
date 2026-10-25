package app.chalo.productpurchase.passpurchase.ui.proofoverview;

import app.chalo.compose.theme.ChaloDimens;
import app.chalo.compose.theme.ChaloPadding;
import app.chalo.compose.theme.ChaloThemeHelper;
import app.chalo.compose.theme.UIShape;
import app.chalo.uistate.button.ButtonUIState;
import app.chalo.uistate.card.CardUISpec;
import app.chalo.uistate.text.TextUIState;
import defpackage.py;
import defpackage.r30;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/productpurchase/passpurchase/ui/proofoverview/SuperPassProofOverviewNextBtnUIState;", "", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class SuperPassProofOverviewNextBtnUIState {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ButtonUIState f8478a;
    public final SuperPassProofOverviewConsentUIState b;
    public final TextUIState c;
    public final CardUISpec d;
    public final ChaloPadding e;
    public final ChaloPadding f;
    public final ChaloPadding g;

    public SuperPassProofOverviewNextBtnUIState(ButtonUIState btn, SuperPassProofOverviewConsentUIState superPassProofOverviewConsentUIState, TextUIState.ChaloTextUIState chaloTextUIState) {
        CardUISpec cardUISpec = new CardUISpec(UIShape.f1926a, ChaloThemeHelper.a().f1916a, ChaloThemeHelper.a().f);
        ChaloDimens chaloDimensA = ChaloThemeHelper.a();
        ChaloPadding chaloPadding = new ChaloPadding(superPassProofOverviewConsentUIState != null ? chaloDimensA.f : chaloDimensA.h, 0.0f, 0.0f, 0.0f, 14);
        ChaloPadding chaloPadding2 = new ChaloPadding(0.0f, ChaloThemeHelper.a().h, ChaloThemeHelper.a().h, ChaloThemeHelper.a().h, 1);
        ChaloPadding chaloPadding3 = new ChaloPadding(0.0f, 0.0f, 0.0f, ChaloThemeHelper.a().h, 7);
        Intrinsics.i(btn, "btn");
        this.f8478a = btn;
        this.b = superPassProofOverviewConsentUIState;
        this.c = chaloTextUIState;
        this.d = cardUISpec;
        this.e = chaloPadding;
        this.f = chaloPadding2;
        this.g = chaloPadding3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SuperPassProofOverviewNextBtnUIState)) {
            return false;
        }
        SuperPassProofOverviewNextBtnUIState superPassProofOverviewNextBtnUIState = (SuperPassProofOverviewNextBtnUIState) obj;
        return Intrinsics.d(this.f8478a, superPassProofOverviewNextBtnUIState.f8478a) && Intrinsics.d(this.b, superPassProofOverviewNextBtnUIState.b) && Intrinsics.d(this.c, superPassProofOverviewNextBtnUIState.c) && Intrinsics.d(this.d, superPassProofOverviewNextBtnUIState.d) && Intrinsics.d(this.e, superPassProofOverviewNextBtnUIState.e) && Intrinsics.d(this.f, superPassProofOverviewNextBtnUIState.f) && Intrinsics.d(this.g, superPassProofOverviewNextBtnUIState.g);
    }

    public final int hashCode() {
        int iHashCode = this.f8478a.hashCode() * 31;
        SuperPassProofOverviewConsentUIState superPassProofOverviewConsentUIState = this.b;
        int iHashCode2 = (iHashCode + (superPassProofOverviewConsentUIState == null ? 0 : superPassProofOverviewConsentUIState.hashCode())) * 31;
        TextUIState textUIState = this.c;
        return this.g.hashCode() + r30.c(this.f, r30.c(this.e, (this.d.hashCode() + ((iHashCode2 + (textUIState != null ? textUIState.hashCode() : 0)) * 31)) * 31, 31), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SuperPassProofOverviewNextBtnUIState(btn=");
        sb.append(this.f8478a);
        sb.append(", consentSection=");
        sb.append(this.b);
        sb.append(", infoText=");
        sb.append(this.c);
        sb.append(", cardUISpec=");
        sb.append(this.d);
        sb.append(", contentPadding=");
        r30.o(sb, this.e, ", internalPadding=", this.f, ", paddingAroundInfo=");
        return py.e(sb, this.g, ")");
    }
}
