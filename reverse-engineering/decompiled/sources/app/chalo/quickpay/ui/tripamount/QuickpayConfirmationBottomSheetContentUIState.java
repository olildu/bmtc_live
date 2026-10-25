package app.chalo.quickpay.ui.tripamount;

import app.chalo.uistate.YesBankBrandingUIState;
import app.chalo.uistate.button.ButtonUIState;
import app.chalo.uistate.text.TextUIState;
import defpackage.pk0;
import defpackage.r30;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/quickpay/ui/tripamount/QuickpayConfirmationBottomSheetContentUIState;", "", "wallet_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class QuickpayConfirmationBottomSheetContentUIState {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextUIState f8897a;
    public final TextUIState b;
    public final TextUIState c;
    public final TextUIState d;
    public final TextUIState e;
    public final ButtonUIState f;
    public final YesBankBrandingUIState g;

    public QuickpayConfirmationBottomSheetContentUIState(TextUIState title, TextUIState amount, TextUIState remainingAmount, TextUIState textUIState, TextUIState tnc, ButtonUIState nextBtn, YesBankBrandingUIState yesBankBrandingUIState) {
        Intrinsics.i(title, "title");
        Intrinsics.i(amount, "amount");
        Intrinsics.i(remainingAmount, "remainingAmount");
        Intrinsics.i(tnc, "tnc");
        Intrinsics.i(nextBtn, "nextBtn");
        this.f8897a = title;
        this.b = amount;
        this.c = remainingAmount;
        this.d = textUIState;
        this.e = tnc;
        this.f = nextBtn;
        this.g = yesBankBrandingUIState;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof QuickpayConfirmationBottomSheetContentUIState)) {
            return false;
        }
        QuickpayConfirmationBottomSheetContentUIState quickpayConfirmationBottomSheetContentUIState = (QuickpayConfirmationBottomSheetContentUIState) obj;
        return Intrinsics.d(this.f8897a, quickpayConfirmationBottomSheetContentUIState.f8897a) && Intrinsics.d(this.b, quickpayConfirmationBottomSheetContentUIState.b) && Intrinsics.d(this.c, quickpayConfirmationBottomSheetContentUIState.c) && Intrinsics.d(this.d, quickpayConfirmationBottomSheetContentUIState.d) && Intrinsics.d(this.e, quickpayConfirmationBottomSheetContentUIState.e) && Intrinsics.d(this.f, quickpayConfirmationBottomSheetContentUIState.f) && Intrinsics.d(this.g, quickpayConfirmationBottomSheetContentUIState.g);
    }

    public final int hashCode() {
        int iC = pk0.c(this.c, pk0.c(this.b, this.f8897a.hashCode() * 31, 31), 31);
        TextUIState textUIState = this.d;
        int iD = r30.d(this.f, pk0.c(this.e, (iC + (textUIState == null ? 0 : textUIState.hashCode())) * 31, 31), 31);
        YesBankBrandingUIState yesBankBrandingUIState = this.g;
        return iD + (yesBankBrandingUIState != null ? yesBankBrandingUIState.hashCode() : 0);
    }

    public final String toString() {
        return "QuickpayConfirmationBottomSheetContentUIState(title=" + this.f8897a + ", amount=" + this.b + ", remainingAmount=" + this.c + ", errorText=" + this.d + ", tnc=" + this.e + ", nextBtn=" + this.f + ", yesBankBranding=" + this.g + ")";
    }
}
