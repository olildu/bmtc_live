package app.chalo.wallet.ui.mainbalance;

import androidx.compose.material3.internal.CalendarModelKt;
import app.chalo.models.contactsupport.ContactSupportUIState;
import app.chalo.uistate.dialog.ConfirmationDialogUiState;
import defpackage.nf1;
import defpackage.r30;
import defpackage.z40;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/wallet/ui/mainbalance/WalletBalanceViewState;", "", "wallet_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class WalletBalanceViewState {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f10883a;
    public final String b;
    public final boolean c;
    public final boolean d;
    public final WalletBalanceScreenType e;
    public final List f;
    public final List g;
    public final int h;
    public final List i;
    public final long j;
    public final ContactSupportUIState k;
    public final ConfirmationDialogUiState l;
    public final boolean m;

    public WalletBalanceViewState(boolean z, String walletBalance, boolean z2, boolean z3, WalletBalanceScreenType walletBalanceScreenType, List list, List wrapperList, int i, List promotionCardItems, ContactSupportUIState contactSupportUIState, ConfirmationDialogUiState confirmationDialogUiState, boolean z4) {
        Intrinsics.i(walletBalance, "walletBalance");
        Intrinsics.i(walletBalanceScreenType, "walletBalanceScreenType");
        Intrinsics.i(wrapperList, "wrapperList");
        Intrinsics.i(promotionCardItems, "promotionCardItems");
        Intrinsics.i(contactSupportUIState, "contactSupportUIState");
        this.f10883a = z;
        this.b = walletBalance;
        this.c = z2;
        this.d = z3;
        this.e = walletBalanceScreenType;
        this.f = list;
        this.g = wrapperList;
        this.h = i;
        this.i = promotionCardItems;
        this.j = CalendarModelKt.MillisecondsIn24Hours;
        this.k = contactSupportUIState;
        this.l = confirmationDialogUiState;
        this.m = z4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof WalletBalanceViewState)) {
            return false;
        }
        WalletBalanceViewState walletBalanceViewState = (WalletBalanceViewState) obj;
        return this.f10883a == walletBalanceViewState.f10883a && Intrinsics.d(this.b, walletBalanceViewState.b) && this.c == walletBalanceViewState.c && this.d == walletBalanceViewState.d && Intrinsics.d(this.e, walletBalanceViewState.e) && Intrinsics.d(this.f, walletBalanceViewState.f) && Intrinsics.d(this.g, walletBalanceViewState.g) && this.h == walletBalanceViewState.h && Intrinsics.d(this.i, walletBalanceViewState.i) && this.j == walletBalanceViewState.j && Intrinsics.d(this.k, walletBalanceViewState.k) && Intrinsics.d(this.l, walletBalanceViewState.l) && this.m == walletBalanceViewState.m;
    }

    public final int hashCode() {
        int iHashCode = (this.e.hashCode() + ((((nf1.e((this.f10883a ? 1231 : 1237) * 31, 31, this.b) + (this.c ? 1231 : 1237)) * 31) + (this.d ? 1231 : 1237)) * 31)) * 31;
        List list = this.f;
        int iB = r30.b((r30.b((iHashCode + (list == null ? 0 : list.hashCode())) * 31, 31, this.g) + this.h) * 31, 31, this.i);
        long j = this.j;
        int iHashCode2 = (this.k.hashCode() + ((iB + ((int) (j ^ (j >>> 32)))) * 31)) * 31;
        ConfirmationDialogUiState confirmationDialogUiState = this.l;
        return ((iHashCode2 + (confirmationDialogUiState != null ? confirmationDialogUiState.hashCode() : 0)) * 31) + (this.m ? 1231 : 1237);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("WalletBalanceViewState(showWalletAccessLoading=");
        sb.append(this.f10883a);
        sb.append(", walletBalance=");
        sb.append(this.b);
        sb.append(", addMoneyButtonEnabled=");
        z40.r(sb, this.c, ", showSeeAllTransactionsButton=", this.d, ", walletBalanceScreenType=");
        sb.append(this.e);
        sb.append(", transactions=");
        sb.append(this.f);
        sb.append(", wrapperList=");
        sb.append(this.g);
        sb.append(", currentPromotionCardIndex=");
        sb.append(this.h);
        sb.append(", promotionCardItems=");
        sb.append(this.i);
        sb.append(", reclaimDurationInMillis=");
        sb.append(this.j);
        sb.append(", contactSupportUIState=");
        sb.append(this.k);
        sb.append(", contactSupportDialogUiState=");
        sb.append(this.l);
        sb.append(", shouldShowYesBankBranding=");
        sb.append(this.m);
        sb.append(")");
        return sb.toString();
    }
}
