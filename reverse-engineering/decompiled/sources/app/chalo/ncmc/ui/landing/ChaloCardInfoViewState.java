package app.chalo.ncmc.ui.landing;

import app.chalo.ncmc.data.appmodel.ChaloCardActivePass;
import app.chalo.ncmc.data.appmodel.ChaloCardDetails;
import defpackage.cb0;
import defpackage.nf1;
import defpackage.pk0;
import defpackage.r30;
import defpackage.t10;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/ncmc/ui/landing/ChaloCardInfoViewState;", "", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class ChaloCardInfoViewState {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ChaloCardDetails f6359a;
    public final List b;
    public final boolean c;
    public final int d;
    public final SelectedCardDetailsUiModel e;
    public final ChaloCardActivePass f;
    public final String g;
    public final FetchCardStatus h;
    public final ChaloCardInfoScreenLayoutType i;
    public final ChaloCardInfoDetailScreenLayoutType j;
    public final boolean k;
    public final String l;
    public final String m;
    public final String n;
    public final String o;
    public final boolean p;
    public final ConfirmationDialogType q;
    public final boolean r;
    public final List s;
    public final boolean t;
    public final CardInfoLandingScreenBottomSheetType u;
    public final boolean v;

    public ChaloCardInfoViewState(ChaloCardDetails chaloCardDetails, List maskedCardNumbers, boolean z, int i, SelectedCardDetailsUiModel selectedCardDetailsUiModel, ChaloCardActivePass chaloCardActivePass, String str, FetchCardStatus cardFetchStatus, ChaloCardInfoScreenLayoutType layoutType, ChaloCardInfoDetailScreenLayoutType cardInfoDetailType, boolean z2, String str2, String str3, String str4, String str5, boolean z3, ConfirmationDialogType confirmationDialogType, boolean z4, List genericChaloCardOperationList, boolean z5, CardInfoLandingScreenBottomSheetType cardInfoLandingScreenBottomSheetType, boolean z6) {
        Intrinsics.i(maskedCardNumbers, "maskedCardNumbers");
        Intrinsics.i(cardFetchStatus, "cardFetchStatus");
        Intrinsics.i(layoutType, "layoutType");
        Intrinsics.i(cardInfoDetailType, "cardInfoDetailType");
        Intrinsics.i(confirmationDialogType, "confirmationDialogType");
        Intrinsics.i(genericChaloCardOperationList, "genericChaloCardOperationList");
        this.f6359a = chaloCardDetails;
        this.b = maskedCardNumbers;
        this.c = z;
        this.d = i;
        this.e = selectedCardDetailsUiModel;
        this.f = chaloCardActivePass;
        this.g = str;
        this.h = cardFetchStatus;
        this.i = layoutType;
        this.j = cardInfoDetailType;
        this.k = z2;
        this.l = str2;
        this.m = str3;
        this.n = str4;
        this.o = str5;
        this.p = z3;
        this.q = confirmationDialogType;
        this.r = z4;
        this.s = genericChaloCardOperationList;
        this.t = z5;
        this.u = cardInfoLandingScreenBottomSheetType;
        this.v = z6;
    }

    public static ChaloCardInfoViewState a(ChaloCardInfoViewState chaloCardInfoViewState, ChaloCardDetails chaloCardDetails, List list, boolean z, int i, SelectedCardDetailsUiModel selectedCardDetailsUiModel, ChaloCardActivePass chaloCardActivePass, String str, FetchCardStatus fetchCardStatus, ChaloCardInfoScreenLayoutType chaloCardInfoScreenLayoutType, ChaloCardInfoDetailScreenLayoutType chaloCardInfoDetailScreenLayoutType, boolean z2, String str2, String str3, String str4, String str5, boolean z3, ConfirmationDialogType confirmationDialogType, boolean z4, List list2, boolean z5, CardInfoLandingScreenBottomSheetType cardInfoLandingScreenBottomSheetType, boolean z6, int i2) {
        ChaloCardDetails chaloCardDetails2 = (i2 & 1) != 0 ? chaloCardInfoViewState.f6359a : chaloCardDetails;
        List maskedCardNumbers = (i2 & 2) != 0 ? chaloCardInfoViewState.b : list;
        boolean z7 = (i2 & 4) != 0 ? chaloCardInfoViewState.c : z;
        int i3 = (i2 & 8) != 0 ? chaloCardInfoViewState.d : i;
        SelectedCardDetailsUiModel selectedCardDetailsUiModel2 = (i2 & 16) != 0 ? chaloCardInfoViewState.e : selectedCardDetailsUiModel;
        ChaloCardActivePass chaloCardActivePass2 = (i2 & 32) != 0 ? chaloCardInfoViewState.f : chaloCardActivePass;
        String activePassDescription = (i2 & 64) != 0 ? chaloCardInfoViewState.g : str;
        FetchCardStatus cardFetchStatus = (i2 & 128) != 0 ? chaloCardInfoViewState.h : fetchCardStatus;
        ChaloCardInfoScreenLayoutType layoutType = (i2 & 256) != 0 ? chaloCardInfoViewState.i : chaloCardInfoScreenLayoutType;
        ChaloCardInfoDetailScreenLayoutType cardInfoDetailType = (i2 & 512) != 0 ? chaloCardInfoViewState.j : chaloCardInfoDetailScreenLayoutType;
        chaloCardInfoViewState.getClass();
        boolean z8 = (i2 & 2048) != 0 ? chaloCardInfoViewState.k : z2;
        String sampleTitle = (i2 & 4096) != 0 ? chaloCardInfoViewState.l : str2;
        String sampleSubtitle = (i2 & 8192) != 0 ? chaloCardInfoViewState.m : str3;
        String sampleReceiptUrl = (i2 & 16384) != 0 ? chaloCardInfoViewState.n : str4;
        String str6 = (i2 & 32768) != 0 ? chaloCardInfoViewState.o : str5;
        boolean z9 = (i2 & 65536) != 0 ? chaloCardInfoViewState.p : z3;
        ConfirmationDialogType confirmationDialogType2 = (i2 & 131072) != 0 ? chaloCardInfoViewState.q : confirmationDialogType;
        ChaloCardDetails chaloCardDetails3 = chaloCardDetails2;
        boolean z10 = (i2 & 262144) != 0 ? chaloCardInfoViewState.r : z4;
        List genericChaloCardOperationList = (i2 & 524288) != 0 ? chaloCardInfoViewState.s : list2;
        boolean z11 = z7;
        boolean z12 = (i2 & 1048576) != 0 ? chaloCardInfoViewState.t : z5;
        CardInfoLandingScreenBottomSheetType bottomSheetType = (i2 & 2097152) != 0 ? chaloCardInfoViewState.u : cardInfoLandingScreenBottomSheetType;
        int i4 = i3;
        boolean z13 = (i2 & 4194304) != 0 ? chaloCardInfoViewState.v : z6;
        chaloCardInfoViewState.getClass();
        Intrinsics.i(maskedCardNumbers, "maskedCardNumbers");
        Intrinsics.i(selectedCardDetailsUiModel2, "selectedCardDetailsUiModel");
        Intrinsics.i(activePassDescription, "activePassDescription");
        Intrinsics.i(cardFetchStatus, "cardFetchStatus");
        Intrinsics.i(layoutType, "layoutType");
        Intrinsics.i(cardInfoDetailType, "cardInfoDetailType");
        Intrinsics.i(sampleTitle, "sampleTitle");
        Intrinsics.i(sampleSubtitle, "sampleSubtitle");
        Intrinsics.i(sampleReceiptUrl, "sampleReceiptUrl");
        Intrinsics.i(confirmationDialogType2, "confirmationDialogType");
        Intrinsics.i(genericChaloCardOperationList, "genericChaloCardOperationList");
        Intrinsics.i(bottomSheetType, "bottomSheetType");
        return new ChaloCardInfoViewState(chaloCardDetails3, maskedCardNumbers, z11, i4, selectedCardDetailsUiModel2, chaloCardActivePass2, activePassDescription, cardFetchStatus, layoutType, cardInfoDetailType, z8, sampleTitle, sampleSubtitle, sampleReceiptUrl, str6, z9, confirmationDialogType2, z10, genericChaloCardOperationList, z12, bottomSheetType, z13);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ChaloCardInfoViewState)) {
            return false;
        }
        ChaloCardInfoViewState chaloCardInfoViewState = (ChaloCardInfoViewState) obj;
        return Intrinsics.d(this.f6359a, chaloCardInfoViewState.f6359a) && Intrinsics.d(this.b, chaloCardInfoViewState.b) && this.c == chaloCardInfoViewState.c && this.d == chaloCardInfoViewState.d && Intrinsics.d(this.e, chaloCardInfoViewState.e) && Intrinsics.d(this.f, chaloCardInfoViewState.f) && Intrinsics.d(this.g, chaloCardInfoViewState.g) && this.h == chaloCardInfoViewState.h && this.i == chaloCardInfoViewState.i && this.j == chaloCardInfoViewState.j && this.k == chaloCardInfoViewState.k && Intrinsics.d(this.l, chaloCardInfoViewState.l) && Intrinsics.d(this.m, chaloCardInfoViewState.m) && Intrinsics.d(this.n, chaloCardInfoViewState.n) && Intrinsics.d(this.o, chaloCardInfoViewState.o) && this.p == chaloCardInfoViewState.p && this.q == chaloCardInfoViewState.q && this.r == chaloCardInfoViewState.r && Intrinsics.d(this.s, chaloCardInfoViewState.s) && this.t == chaloCardInfoViewState.t && Intrinsics.d(this.u, chaloCardInfoViewState.u) && this.v == chaloCardInfoViewState.v;
    }

    public final int hashCode() {
        ChaloCardDetails chaloCardDetails = this.f6359a;
        int iHashCode = (this.e.hashCode() + ((((r30.b((chaloCardDetails == null ? 0 : chaloCardDetails.hashCode()) * 31, 31, this.b) + (this.c ? 1231 : 1237)) * 31) + this.d) * 31)) * 31;
        ChaloCardActivePass chaloCardActivePass = this.f;
        int iE = nf1.e(nf1.e(nf1.e((((((this.j.hashCode() + ((this.i.hashCode() + ((this.h.hashCode() + nf1.e((iHashCode + (chaloCardActivePass == null ? 0 : chaloCardActivePass.hashCode())) * 31, 31, this.g)) * 31)) * 31)) * 31) + 1237) * 31) + (this.k ? 1231 : 1237)) * 31, 31, this.l), 31, this.m), 31, this.n);
        String str = this.o;
        return ((this.u.hashCode() + ((r30.b((((this.q.hashCode() + ((((iE + (str != null ? str.hashCode() : 0)) * 31) + (this.p ? 1231 : 1237)) * 31)) * 31) + (this.r ? 1231 : 1237)) * 31, 31, this.s) + (this.t ? 1231 : 1237)) * 31)) * 31) + (this.v ? 1231 : 1237);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ChaloCardInfoViewState(chaloCardDetails=");
        sb.append(this.f6359a);
        sb.append(", maskedCardNumbers=");
        sb.append(this.b);
        sb.append(", showLoadingDialogue=");
        sb.append(this.c);
        sb.append(", currentCardPosition=");
        sb.append(this.d);
        sb.append(", selectedCardDetailsUiModel=");
        sb.append(this.e);
        sb.append(", activePassDetails=");
        sb.append(this.f);
        sb.append(", activePassDescription=");
        sb.append(this.g);
        sb.append(", cardFetchStatus=");
        sb.append(this.h);
        sb.append(", layoutType=");
        sb.append(this.i);
        sb.append(", cardInfoDetailType=");
        sb.append(this.j);
        sb.append(", shouldShowComingSoonBottomsheet=false, shouldShowFetchFailedSnackbar=");
        pk0.x(", sampleTitle=", this.l, ", sampleSubtitle=", sb, this.k);
        cb0.t(sb, this.m, ", sampleReceiptUrl=", this.n, ", eligibleCardNumber=");
        t10.s(this.o, ", showUserConfirmationDialog=", ", confirmationDialogType=", sb, this.p);
        sb.append(this.q);
        sb.append(", showDisclaimerText=");
        sb.append(this.r);
        sb.append(", genericChaloCardOperationList=");
        sb.append(this.s);
        sb.append(", shouldShowOtherCardOptions=");
        sb.append(this.t);
        sb.append(", bottomSheetType=");
        sb.append(this.u);
        sb.append(", showPendingRechargeBanner=");
        sb.append(this.v);
        sb.append(")");
        return sb.toString();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public ChaloCardInfoViewState(List list, FetchCardStatus fetchCardStatus, List list2, int i) {
        List list3 = (i & 2) != 0 ? EmptyList.f17557a : list;
        EmptyList emptyList = EmptyList.f17557a;
        this(null, list3, false, 0, new SelectedCardDetailsUiModel(true, "", "", false, false, (List) emptyList, (ChaloCardActivePassDetailsUiModel) null, 192), null, "", (i & 128) != 0 ? FetchCardStatus.FETCHING : fetchCardStatus, ChaloCardInfoScreenLayoutType.ALL_CARDS, ChaloCardInfoDetailScreenLayoutType.CARD_INFO, false, "", "", "", null, false, ConfirmationDialogType.UNLINK_CARD, false, (i & 524288) != 0 ? emptyList : list2, false, CardInfoLandingScreenBottomSheetType.None.f6341a, false);
    }
}
