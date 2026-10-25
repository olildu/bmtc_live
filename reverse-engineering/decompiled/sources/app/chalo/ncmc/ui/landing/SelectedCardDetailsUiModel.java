package app.chalo.ncmc.ui.landing;

import defpackage.hq0;
import defpackage.nf1;
import defpackage.r30;
import defpackage.t10;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/ncmc/ui/landing/SelectedCardDetailsUiModel;", "", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class SelectedCardDetailsUiModel {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f6376a;
    public final String b;
    public final String c;
    public final boolean d;
    public final boolean e;
    public final List f;
    public final ChaloCardActivePassDetailsUiModel g;
    public final String h;

    public /* synthetic */ SelectedCardDetailsUiModel(boolean z, String str, String str2, boolean z2, boolean z3, List list, ChaloCardActivePassDetailsUiModel chaloCardActivePassDetailsUiModel, int i) {
        this(z, str, str2, z2, z3, list, (i & 64) != 0 ? null : chaloCardActivePassDetailsUiModel, (String) null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SelectedCardDetailsUiModel)) {
            return false;
        }
        SelectedCardDetailsUiModel selectedCardDetailsUiModel = (SelectedCardDetailsUiModel) obj;
        return this.f6376a == selectedCardDetailsUiModel.f6376a && Intrinsics.d(this.b, selectedCardDetailsUiModel.b) && Intrinsics.d(this.c, selectedCardDetailsUiModel.c) && this.d == selectedCardDetailsUiModel.d && this.e == selectedCardDetailsUiModel.e && Intrinsics.d(this.f, selectedCardDetailsUiModel.f) && Intrinsics.d(this.g, selectedCardDetailsUiModel.g) && Intrinsics.d(this.h, selectedCardDetailsUiModel.h);
    }

    public final int hashCode() {
        int iB = r30.b((((nf1.e(nf1.e((this.f6376a ? 1231 : 1237) * 31, 31, this.b), 31, this.c) + (this.d ? 1231 : 1237)) * 31) + (this.e ? 1231 : 1237)) * 31, 31, this.f);
        ChaloCardActivePassDetailsUiModel chaloCardActivePassDetailsUiModel = this.g;
        int iHashCode = (iB + (chaloCardActivePassDetailsUiModel == null ? 0 : chaloCardActivePassDetailsUiModel.hashCode())) * 31;
        String str = this.h;
        return iHashCode + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SelectedCardDetailsUiModel(isBlocked=");
        sb.append(this.f6376a);
        sb.append(", cardNumber=");
        sb.append(this.b);
        sb.append(", balanceString=");
        t10.s(this.c, ", isRechargeEnabled=", ", showOfflineBalance=", sb, this.d);
        hq0.w(sb, this.e, ", cardOperationList=", this.f, ", activePassDetails=");
        sb.append(this.g);
        sb.append(", pendingRechargeBannerTitle=");
        sb.append(this.h);
        sb.append(")");
        return sb.toString();
    }

    public SelectedCardDetailsUiModel(boolean z, String cardNumber, String balanceString, boolean z2, boolean z3, List cardOperationList, ChaloCardActivePassDetailsUiModel chaloCardActivePassDetailsUiModel, String str) {
        Intrinsics.i(cardNumber, "cardNumber");
        Intrinsics.i(balanceString, "balanceString");
        Intrinsics.i(cardOperationList, "cardOperationList");
        this.f6376a = z;
        this.b = cardNumber;
        this.c = balanceString;
        this.d = z2;
        this.e = z3;
        this.f = cardOperationList;
        this.g = chaloCardActivePassDetailsUiModel;
        this.h = str;
    }
}
