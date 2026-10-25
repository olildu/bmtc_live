package app.chalo.ncmc.ui.cardlinking.linking;

import defpackage.b3;
import defpackage.cb0;
import defpackage.dd;
import defpackage.hq0;
import defpackage.nf1;
import defpackage.z40;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/ncmc/ui/cardlinking/linking/ChaloCardLinkViewState;", "", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class ChaloCardLinkViewState {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f6279a;
    public final String b;
    public final boolean c;
    public final boolean d;
    public final CardLinkingErrorType e;
    public final boolean f;
    public final String g;
    public final String h;
    public final int i;
    public final int j;
    public final int k;
    public final int l;
    public final boolean m;

    public /* synthetic */ ChaloCardLinkViewState(String str, String str2, CardLinkingErrorType cardLinkingErrorType, String str3, int i, int i2, int i3, int i4, int i5) {
        this((i5 & 1) != 0 ? "" : str, (i5 & 2) != 0 ? "" : str2, false, false, (i5 & 16) != 0 ? CardLinkingErrorType.NO_ERROR : cardLinkingErrorType, false, "", (i5 & 128) != 0 ? "" : str3, (i5 & 256) != 0 ? -1 : i, (i5 & 512) != 0 ? -1 : i2, (i5 & 1024) != 0 ? -1 : i3, (i5 & 2048) != 0 ? -1 : i4, false);
    }

    public static ChaloCardLinkViewState a(ChaloCardLinkViewState chaloCardLinkViewState, String str, String str2, boolean z, boolean z2, CardLinkingErrorType cardLinkingErrorType, boolean z3, String str3, String str4, int i, int i2, int i3, int i4, boolean z4, int i5) {
        if ((i5 & 1) != 0) {
            str = chaloCardLinkViewState.f6279a;
        }
        String currentlyEnteredCardNo = str;
        String currentlyEnteredLinkCode = (i5 & 2) != 0 ? chaloCardLinkViewState.b : str2;
        boolean z5 = (i5 & 4) != 0 ? chaloCardLinkViewState.c : z;
        boolean z6 = (i5 & 8) != 0 ? chaloCardLinkViewState.d : z2;
        CardLinkingErrorType cardLinkingErrorType2 = (i5 & 16) != 0 ? chaloCardLinkViewState.e : cardLinkingErrorType;
        boolean z7 = (i5 & 32) != 0 ? chaloCardLinkViewState.f : z3;
        String dialogErrorCopy = (i5 & 64) != 0 ? chaloCardLinkViewState.g : str3;
        String sampleReceiptUrl = (i5 & 128) != 0 ? chaloCardLinkViewState.h : str4;
        int i6 = (i5 & 256) != 0 ? chaloCardLinkViewState.i : i;
        int i7 = (i5 & 512) != 0 ? chaloCardLinkViewState.j : i2;
        int i8 = (i5 & 1024) != 0 ? chaloCardLinkViewState.k : i3;
        int i9 = (i5 & 2048) != 0 ? chaloCardLinkViewState.l : i4;
        boolean z8 = (i5 & 4096) != 0 ? chaloCardLinkViewState.m : z4;
        chaloCardLinkViewState.getClass();
        Intrinsics.i(currentlyEnteredCardNo, "currentlyEnteredCardNo");
        Intrinsics.i(currentlyEnteredLinkCode, "currentlyEnteredLinkCode");
        Intrinsics.i(cardLinkingErrorType2, "cardLinkingErrorType");
        Intrinsics.i(dialogErrorCopy, "dialogErrorCopy");
        Intrinsics.i(sampleReceiptUrl, "sampleReceiptUrl");
        return new ChaloCardLinkViewState(currentlyEnteredCardNo, currentlyEnteredLinkCode, z5, z6, cardLinkingErrorType2, z7, dialogErrorCopy, sampleReceiptUrl, i6, i7, i8, i9, z8);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ChaloCardLinkViewState)) {
            return false;
        }
        ChaloCardLinkViewState chaloCardLinkViewState = (ChaloCardLinkViewState) obj;
        return Intrinsics.d(this.f6279a, chaloCardLinkViewState.f6279a) && Intrinsics.d(this.b, chaloCardLinkViewState.b) && this.c == chaloCardLinkViewState.c && this.d == chaloCardLinkViewState.d && this.e == chaloCardLinkViewState.e && this.f == chaloCardLinkViewState.f && Intrinsics.d(this.g, chaloCardLinkViewState.g) && Intrinsics.d(this.h, chaloCardLinkViewState.h) && this.i == chaloCardLinkViewState.i && this.j == chaloCardLinkViewState.j && this.k == chaloCardLinkViewState.k && this.l == chaloCardLinkViewState.l && this.m == chaloCardLinkViewState.m;
    }

    public final int hashCode() {
        return ((((((((nf1.e(nf1.e((((this.e.hashCode() + ((((nf1.e(this.f6279a.hashCode() * 31, 31, this.b) + (this.c ? 1231 : 1237)) * 31) + (this.d ? 1231 : 1237)) * 31)) * 31) + (this.f ? 1231 : 1237)) * 31, 31, this.g), 31, this.h) + this.i) * 31) + this.j) * 31) + this.k) * 31) + this.l) * 31) + (this.m ? 1231 : 1237);
    }

    public final String toString() {
        StringBuilder sbE = dd.e("ChaloCardLinkViewState(currentlyEnteredCardNo=", this.f6279a, ", currentlyEnteredLinkCode=", this.b, ", isProceedBtnEnabled=");
        z40.r(sbE, this.c, ", isLoaderVisible=", this.d, ", cardLinkingErrorType=");
        sbE.append(this.e);
        sbE.append(", shouldShowErrorDialog=");
        sbE.append(this.f);
        sbE.append(", dialogErrorCopy=");
        cb0.t(sbE, this.g, ", sampleReceiptUrl=", this.h, ", maxCardNumberLength=");
        hq0.p(this.i, this.j, ", maxLinkCodeLength=", ", minCardNumberLength=", sbE);
        hq0.p(this.k, this.l, ", minLinkCodeLength=", ", isCardLinkedToAnotherNoDialogVisible=", sbE);
        return b3.g(")", sbE, this.m);
    }

    public ChaloCardLinkViewState(String currentlyEnteredCardNo, String currentlyEnteredLinkCode, boolean z, boolean z2, CardLinkingErrorType cardLinkingErrorType, boolean z3, String dialogErrorCopy, String sampleReceiptUrl, int i, int i2, int i3, int i4, boolean z4) {
        Intrinsics.i(currentlyEnteredCardNo, "currentlyEnteredCardNo");
        Intrinsics.i(currentlyEnteredLinkCode, "currentlyEnteredLinkCode");
        Intrinsics.i(cardLinkingErrorType, "cardLinkingErrorType");
        Intrinsics.i(dialogErrorCopy, "dialogErrorCopy");
        Intrinsics.i(sampleReceiptUrl, "sampleReceiptUrl");
        this.f6279a = currentlyEnteredCardNo;
        this.b = currentlyEnteredLinkCode;
        this.c = z;
        this.d = z2;
        this.e = cardLinkingErrorType;
        this.f = z3;
        this.g = dialogErrorCopy;
        this.h = sampleReceiptUrl;
        this.i = i;
        this.j = i2;
        this.k = i3;
        this.l = i4;
        this.m = z4;
    }
}
