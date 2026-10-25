package app.chalo.ncmc.ui.entercarddetails;

import app.chalo.ncmc.data.appmodel.ChaloCardRechargeConfigAppModel;
import defpackage.cb0;
import defpackage.nf1;
import defpackage.t10;
import defpackage.z40;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/ncmc/ui/entercarddetails/EnterCardDetailsViewState;", "", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class EnterCardDetailsViewState {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ChaloCardRechargeConfigAppModel f6336a;
    public final int b;
    public final String c;
    public final String d;
    public final String e;
    public final boolean f;
    public final boolean g;
    public final boolean h;
    public final boolean i;
    public final boolean j;
    public final String k;
    public final boolean l;

    public /* synthetic */ EnterCardDetailsViewState(int i, int i2, ChaloCardRechargeConfigAppModel chaloCardRechargeConfigAppModel, String str, String str2, String str3, String str4, boolean z, boolean z2, boolean z3) {
        this((i2 & 1) != 0 ? null : chaloCardRechargeConfigAppModel, (i2 & 2) != 0 ? 16 : i, (i2 & 4) != 0 ? "" : str, (i2 & 8) != 0 ? "" : str2, (i2 & 16) != 0 ? null : str3, (i2 & 32) != 0 ? false : z, (i2 & 64) != 0 ? false : z2, false, false, false, (i2 & 1024) != 0 ? "" : str4, (i2 & 2048) != 0 ? false : z3);
    }

    public static EnterCardDetailsViewState a(EnterCardDetailsViewState enterCardDetailsViewState, ChaloCardRechargeConfigAppModel chaloCardRechargeConfigAppModel, String str, String str2, String str3, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, String str4, boolean z6, int i) {
        if ((i & 1) != 0) {
            chaloCardRechargeConfigAppModel = enterCardDetailsViewState.f6336a;
        }
        ChaloCardRechargeConfigAppModel chaloCardRechargeConfigAppModel2 = chaloCardRechargeConfigAppModel;
        int i2 = enterCardDetailsViewState.b;
        if ((i & 4) != 0) {
            str = enterCardDetailsViewState.c;
        }
        String currentEnteredCardNumber = str;
        String currentEnteredReEnterCardNumber = (i & 8) != 0 ? enterCardDetailsViewState.d : str2;
        String str5 = (i & 16) != 0 ? enterCardDetailsViewState.e : str3;
        boolean z7 = (i & 32) != 0 ? enterCardDetailsViewState.f : z;
        boolean z8 = (i & 64) != 0 ? enterCardDetailsViewState.g : z2;
        boolean z9 = (i & 128) != 0 ? enterCardDetailsViewState.h : z3;
        boolean z10 = (i & 256) != 0 ? enterCardDetailsViewState.i : z4;
        boolean z11 = (i & 512) != 0 ? enterCardDetailsViewState.j : z5;
        String cardNumberToLink = (i & 1024) != 0 ? enterCardDetailsViewState.k : str4;
        boolean z12 = (i & 2048) != 0 ? enterCardDetailsViewState.l : z6;
        enterCardDetailsViewState.getClass();
        Intrinsics.i(currentEnteredCardNumber, "currentEnteredCardNumber");
        Intrinsics.i(currentEnteredReEnterCardNumber, "currentEnteredReEnterCardNumber");
        Intrinsics.i(cardNumberToLink, "cardNumberToLink");
        return new EnterCardDetailsViewState(chaloCardRechargeConfigAppModel2, i2, currentEnteredCardNumber, currentEnteredReEnterCardNumber, str5, z7, z8, z9, z10, z11, cardNumberToLink, z12);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof EnterCardDetailsViewState)) {
            return false;
        }
        EnterCardDetailsViewState enterCardDetailsViewState = (EnterCardDetailsViewState) obj;
        return Intrinsics.d(this.f6336a, enterCardDetailsViewState.f6336a) && this.b == enterCardDetailsViewState.b && Intrinsics.d(this.c, enterCardDetailsViewState.c) && Intrinsics.d(this.d, enterCardDetailsViewState.d) && Intrinsics.d(this.e, enterCardDetailsViewState.e) && this.f == enterCardDetailsViewState.f && this.g == enterCardDetailsViewState.g && this.h == enterCardDetailsViewState.h && this.i == enterCardDetailsViewState.i && this.j == enterCardDetailsViewState.j && Intrinsics.d(this.k, enterCardDetailsViewState.k) && this.l == enterCardDetailsViewState.l;
    }

    public final int hashCode() {
        ChaloCardRechargeConfigAppModel chaloCardRechargeConfigAppModel = this.f6336a;
        int iE = nf1.e(nf1.e((((chaloCardRechargeConfigAppModel == null ? 0 : chaloCardRechargeConfigAppModel.hashCode()) * 31) + this.b) * 31, 31, this.c), 31, this.d);
        String str = this.e;
        return nf1.e((((((((((((iE + (str != null ? str.hashCode() : 0)) * 31) + (this.f ? 1231 : 1237)) * 31) + (this.g ? 1231 : 1237)) * 31) + (this.h ? 1231 : 1237)) * 31) + (this.i ? 1231 : 1237)) * 31) + (this.j ? 1231 : 1237)) * 31, 31, this.k) + (this.l ? 1231 : 1237);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("EnterCardDetailsViewState(chaloCardRechargeConfigAppModel=");
        sb.append(this.f6336a);
        sb.append(", maxDigitsAllowed=");
        sb.append(this.b);
        sb.append(", currentEnteredCardNumber=");
        cb0.t(sb, this.c, ", currentEnteredReEnterCardNumber=", this.d, ", cardNumberValidationError=");
        t10.s(this.e, ", isProceedBtnEnabled=", ", isReEnterCardNumberFieldEnabled=", sb, this.f);
        z40.r(sb, this.g, ", shouldShowLoadingDialog=", this.h, ", showFullScreenLoader=");
        z40.r(sb, this.i, ", showFullScreenError=", this.j, ", cardNumberToLink=");
        sb.append(this.k);
        sb.append(", showCardLinkBottomSheet=");
        sb.append(this.l);
        sb.append(")");
        return sb.toString();
    }

    public EnterCardDetailsViewState(ChaloCardRechargeConfigAppModel chaloCardRechargeConfigAppModel, int i, String currentEnteredCardNumber, String currentEnteredReEnterCardNumber, String str, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, String cardNumberToLink, boolean z6) {
        Intrinsics.i(currentEnteredCardNumber, "currentEnteredCardNumber");
        Intrinsics.i(currentEnteredReEnterCardNumber, "currentEnteredReEnterCardNumber");
        Intrinsics.i(cardNumberToLink, "cardNumberToLink");
        this.f6336a = chaloCardRechargeConfigAppModel;
        this.b = i;
        this.c = currentEnteredCardNumber;
        this.d = currentEnteredReEnterCardNumber;
        this.e = str;
        this.f = z;
        this.g = z2;
        this.h = z3;
        this.i = z4;
        this.j = z5;
        this.k = cardNumberToLink;
        this.l = z6;
    }
}
