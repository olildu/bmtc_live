package app.chalo.productpurchase.passpurchase.ui.confirmation;

import app.chalo.compose.theme.ChaloPadding;
import app.chalo.compose.theme.ChaloThemeHelper;
import app.chalo.uistate.text.TextUIState;
import defpackage.py;
import defpackage.r30;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/productpurchase/passpurchase/ui/confirmation/ConfirmSuperPassOffersSectionUIState;", "", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class ConfirmSuperPassOffersSectionUIState {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextUIState.ChaloTextUIState f8362a;
    public final ConfirmSuperPassOfferCardUIState b;
    public final ChaloPadding c;
    public final ChaloPadding d;
    public final ChaloPadding e;

    public ConfirmSuperPassOffersSectionUIState(TextUIState.ChaloTextUIState chaloTextUIState, ConfirmSuperPassOfferCardUIState confirmSuperPassOfferCardUIState) {
        ChaloPadding chaloPadding = new ChaloPadding(ChaloThemeHelper.a().i, 0.0f, 0.0f, 0.0f, 14);
        ChaloPadding chaloPadding2 = new ChaloPadding(ChaloThemeHelper.a().h, 0.0f, 2);
        ChaloPadding chaloPadding3 = new ChaloPadding(ChaloThemeHelper.a().h, 0.0f, 0.0f, 0.0f, 14);
        this.f8362a = chaloTextUIState;
        this.b = confirmSuperPassOfferCardUIState;
        this.c = chaloPadding;
        this.d = chaloPadding2;
        this.e = chaloPadding3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ConfirmSuperPassOffersSectionUIState)) {
            return false;
        }
        ConfirmSuperPassOffersSectionUIState confirmSuperPassOffersSectionUIState = (ConfirmSuperPassOffersSectionUIState) obj;
        return Intrinsics.d(this.f8362a, confirmSuperPassOffersSectionUIState.f8362a) && Intrinsics.d(this.b, confirmSuperPassOffersSectionUIState.b) && Intrinsics.d(this.c, confirmSuperPassOffersSectionUIState.c) && Intrinsics.d(this.d, confirmSuperPassOffersSectionUIState.d) && Intrinsics.d(this.e, confirmSuperPassOffersSectionUIState.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + r30.c(this.d, r30.c(this.c, (this.b.hashCode() + (this.f8362a.hashCode() * 31)) * 31, 31), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ConfirmSuperPassOffersSectionUIState(title=");
        sb.append(this.f8362a);
        sb.append(", offerCard=");
        sb.append(this.b);
        sb.append(", titlePadding=");
        r30.o(sb, this.c, ", contentPadding=", this.d, ", cardPadding=");
        return py.e(sb, this.e, ")");
    }
}
