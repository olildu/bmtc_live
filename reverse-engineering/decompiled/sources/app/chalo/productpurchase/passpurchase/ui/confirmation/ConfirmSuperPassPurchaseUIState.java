package app.chalo.productpurchase.passpurchase.ui.confirmation;

import app.chalo.compose.theme.ChaloThemeHelper;
import app.chalo.productpurchase.passpurchase.ui.proofoverview.EnlargedProofImageUIState;
import app.chalo.uistate.base.ChaloColorToken;
import app.chalo.uistate.bottomsheet.TncBottomSheetUIState;
import app.chalo.uistate.dialog.DatePickerUIState;
import app.chalo.uistate.dialog.LoadingDialogUIState;
import app.chalo.uistate.divider.DividerUIState;
import app.chalo.uistate.image.ImageUIState;
import app.chalo.uistate.image.ImageUrlUIState;
import app.chalo.uistate.text.TextUIState;
import app.chalo.uistate.text.TextWithSpecialFeaturesTagsUIState;
import app.chalo.uistate.toolbar.ToolbarUIState;
import defpackage.pk0;
import defpackage.py;
import defpackage.r30;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/productpurchase/passpurchase/ui/confirmation/ConfirmSuperPassPurchaseUIState;", "", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class ConfirmSuperPassPurchaseUIState {
    public final ConfirmSuperPassOffersSectionUIState A;
    public final PassStateDateChangeInfoBannerUIState B;
    public final ConfirmSuperPassPurchaseUISpec C;
    public final ImageUrlUIState D;
    public final ImageUIState E;
    public final TextUIState.ChaloTextUIState F;
    public final ArrayList G;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ToolbarUIState f8382a;
    public final TextUIState b;
    public final TextUIState c;
    public final List d;
    public final DividerUIState e;
    public final DividerUIState f;
    public final TextUIState g;
    public final TextUIState h;
    public final TextUIState i;
    public final TextWithSpecialFeaturesTagsUIState j;
    public final TextUIState k;
    public final TextUIState l;
    public final TextUIState m;
    public final TextUIState n;
    public final ImageUIState o;
    public final TextUIState p;
    public final TextUIState q;
    public final SuperPassFareDetailsUIState r;
    public final SuperPassTncSectionUIState s;
    public final SuperPassConfirmBtnUIState t;
    public final EnlargedProofImageUIState u;
    public final DatePickerUIState v;
    public final LoadingDialogUIState w;
    public final TncBottomSheetUIState x;
    public final PassAlreadyAvailedBottomSheetUIState y;
    public final FareMappingFailedBottomSheetUIState z;

    public ConfirmSuperPassPurchaseUIState(ToolbarUIState toolbar, TextUIState title, TextUIState textUIState, List list, TextUIState.ChaloTextUIState productName, TextUIState textUIState2, TextUIState textUIState3, TextWithSpecialFeaturesTagsUIState textWithSpecialFeaturesTagsUIState, TextUIState.ChaloTextUIState passStartDateTitle, TextUIState.ChaloTextUIState chaloTextUIState, TextUIState.ChaloTextUIState chaloTextUIState2, TextUIState.ChaloTextUIState chaloTextUIState3, ImageUIState imageUIState, TextUIState.ChaloTextUIState chaloTextUIState4, TextUIState.StyledTextUIState styledTextUIState, SuperPassFareDetailsUIState fareDetails, SuperPassTncSectionUIState tnc, SuperPassConfirmBtnUIState confirmBtn, EnlargedProofImageUIState enlargedProofImageUIState, DatePickerUIState datePickerUIState, LoadingDialogUIState loadingDialogUIState, TncBottomSheetUIState tncBottomSheetUIState, PassAlreadyAvailedBottomSheetUIState passAlreadyAvailedBottomSheetUIState, FareMappingFailedBottomSheetUIState fareMappingFailedBottomSheetUIState, ConfirmSuperPassOffersSectionUIState confirmSuperPassOffersSectionUIState, PassStateDateChangeInfoBannerUIState passStateDateChangeInfoBannerUIState, ImageUrlUIState imageUrlUIState, ImageUIState imageUIState2, TextUIState.ChaloTextUIState chaloTextUIState5, ArrayList arrayList) {
        float f = ChaloThemeHelper.a().f;
        ChaloColorToken.ActivityBackground activityBackground = ChaloColorToken.ActivityBackground.f9755a;
        DividerUIState dividerUIState = new DividerUIState(f, activityBackground, null, 4);
        DividerUIState dividerUIState2 = new DividerUIState(ChaloThemeHelper.a().u, activityBackground, null, 4);
        ConfirmSuperPassPurchaseUISpec confirmSuperPassPurchaseUISpec = new ConfirmSuperPassPurchaseUISpec();
        Intrinsics.i(toolbar, "toolbar");
        Intrinsics.i(title, "title");
        Intrinsics.i(productName, "productName");
        Intrinsics.i(passStartDateTitle, "passStartDateTitle");
        Intrinsics.i(fareDetails, "fareDetails");
        Intrinsics.i(tnc, "tnc");
        Intrinsics.i(confirmBtn, "confirmBtn");
        this.f8382a = toolbar;
        this.b = title;
        this.c = textUIState;
        this.d = list;
        this.e = dividerUIState;
        this.f = dividerUIState2;
        this.g = productName;
        this.h = textUIState2;
        this.i = textUIState3;
        this.j = textWithSpecialFeaturesTagsUIState;
        this.k = passStartDateTitle;
        this.l = chaloTextUIState;
        this.m = chaloTextUIState2;
        this.n = chaloTextUIState3;
        this.o = imageUIState;
        this.p = chaloTextUIState4;
        this.q = styledTextUIState;
        this.r = fareDetails;
        this.s = tnc;
        this.t = confirmBtn;
        this.u = enlargedProofImageUIState;
        this.v = datePickerUIState;
        this.w = loadingDialogUIState;
        this.x = tncBottomSheetUIState;
        this.y = passAlreadyAvailedBottomSheetUIState;
        this.z = fareMappingFailedBottomSheetUIState;
        this.A = confirmSuperPassOffersSectionUIState;
        this.B = passStateDateChangeInfoBannerUIState;
        this.C = confirmSuperPassPurchaseUISpec;
        this.D = imageUrlUIState;
        this.E = imageUIState2;
        this.F = chaloTextUIState5;
        this.G = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ConfirmSuperPassPurchaseUIState)) {
            return false;
        }
        ConfirmSuperPassPurchaseUIState confirmSuperPassPurchaseUIState = (ConfirmSuperPassPurchaseUIState) obj;
        return Intrinsics.d(this.f8382a, confirmSuperPassPurchaseUIState.f8382a) && Intrinsics.d(this.b, confirmSuperPassPurchaseUIState.b) && Intrinsics.d(this.c, confirmSuperPassPurchaseUIState.c) && Intrinsics.d(this.d, confirmSuperPassPurchaseUIState.d) && Intrinsics.d(this.e, confirmSuperPassPurchaseUIState.e) && Intrinsics.d(this.f, confirmSuperPassPurchaseUIState.f) && Intrinsics.d(this.g, confirmSuperPassPurchaseUIState.g) && Intrinsics.d(this.h, confirmSuperPassPurchaseUIState.h) && Intrinsics.d(this.i, confirmSuperPassPurchaseUIState.i) && Intrinsics.d(this.j, confirmSuperPassPurchaseUIState.j) && Intrinsics.d(this.k, confirmSuperPassPurchaseUIState.k) && Intrinsics.d(this.l, confirmSuperPassPurchaseUIState.l) && Intrinsics.d(this.m, confirmSuperPassPurchaseUIState.m) && Intrinsics.d(this.n, confirmSuperPassPurchaseUIState.n) && Intrinsics.d(this.o, confirmSuperPassPurchaseUIState.o) && Intrinsics.d(this.p, confirmSuperPassPurchaseUIState.p) && Intrinsics.d(this.q, confirmSuperPassPurchaseUIState.q) && Intrinsics.d(this.r, confirmSuperPassPurchaseUIState.r) && Intrinsics.d(this.s, confirmSuperPassPurchaseUIState.s) && Intrinsics.d(this.t, confirmSuperPassPurchaseUIState.t) && Intrinsics.d(this.u, confirmSuperPassPurchaseUIState.u) && Intrinsics.d(this.v, confirmSuperPassPurchaseUIState.v) && Intrinsics.d(this.w, confirmSuperPassPurchaseUIState.w) && Intrinsics.d(this.x, confirmSuperPassPurchaseUIState.x) && Intrinsics.d(this.y, confirmSuperPassPurchaseUIState.y) && Intrinsics.d(this.z, confirmSuperPassPurchaseUIState.z) && Intrinsics.d(this.A, confirmSuperPassPurchaseUIState.A) && Intrinsics.d(this.B, confirmSuperPassPurchaseUIState.B) && Intrinsics.d(this.C, confirmSuperPassPurchaseUIState.C) && Intrinsics.d(this.D, confirmSuperPassPurchaseUIState.D) && Intrinsics.d(this.E, confirmSuperPassPurchaseUIState.E) && Intrinsics.d(this.F, confirmSuperPassPurchaseUIState.F) && Intrinsics.d(this.G, confirmSuperPassPurchaseUIState.G);
    }

    public final int hashCode() {
        int iC = pk0.c(this.b, this.f8382a.hashCode() * 31, 31);
        TextUIState textUIState = this.c;
        int iHashCode = (iC + (textUIState == null ? 0 : textUIState.hashCode())) * 31;
        List list = this.d;
        int iC2 = pk0.c(this.g, py.c(this.f, py.c(this.e, (iHashCode + (list == null ? 0 : list.hashCode())) * 31, 31), 31), 31);
        TextUIState textUIState2 = this.h;
        int iHashCode2 = (iC2 + (textUIState2 == null ? 0 : textUIState2.hashCode())) * 31;
        TextUIState textUIState3 = this.i;
        int iHashCode3 = (iHashCode2 + (textUIState3 == null ? 0 : textUIState3.hashCode())) * 31;
        TextWithSpecialFeaturesTagsUIState textWithSpecialFeaturesTagsUIState = this.j;
        int iC3 = pk0.c(this.k, (iHashCode3 + (textWithSpecialFeaturesTagsUIState == null ? 0 : textWithSpecialFeaturesTagsUIState.hashCode())) * 31, 31);
        TextUIState textUIState4 = this.l;
        int iHashCode4 = (iC3 + (textUIState4 == null ? 0 : textUIState4.hashCode())) * 31;
        TextUIState textUIState5 = this.m;
        int iHashCode5 = (iHashCode4 + (textUIState5 == null ? 0 : textUIState5.hashCode())) * 31;
        TextUIState textUIState6 = this.n;
        int iE = r30.e(this.o, (iHashCode5 + (textUIState6 == null ? 0 : textUIState6.hashCode())) * 31, 31);
        TextUIState textUIState7 = this.p;
        int iHashCode6 = (iE + (textUIState7 == null ? 0 : textUIState7.hashCode())) * 31;
        TextUIState textUIState8 = this.q;
        int iHashCode7 = (this.t.hashCode() + ((this.s.hashCode() + ((this.r.hashCode() + ((iHashCode6 + (textUIState8 == null ? 0 : textUIState8.hashCode())) * 31)) * 31)) * 31)) * 31;
        EnlargedProofImageUIState enlargedProofImageUIState = this.u;
        int iHashCode8 = (iHashCode7 + (enlargedProofImageUIState == null ? 0 : enlargedProofImageUIState.hashCode())) * 31;
        DatePickerUIState datePickerUIState = this.v;
        int iHashCode9 = (iHashCode8 + (datePickerUIState == null ? 0 : datePickerUIState.hashCode())) * 31;
        LoadingDialogUIState loadingDialogUIState = this.w;
        int iHashCode10 = (iHashCode9 + (loadingDialogUIState == null ? 0 : loadingDialogUIState.hashCode())) * 31;
        TncBottomSheetUIState tncBottomSheetUIState = this.x;
        int iHashCode11 = (iHashCode10 + (tncBottomSheetUIState == null ? 0 : tncBottomSheetUIState.hashCode())) * 31;
        PassAlreadyAvailedBottomSheetUIState passAlreadyAvailedBottomSheetUIState = this.y;
        int iHashCode12 = (iHashCode11 + (passAlreadyAvailedBottomSheetUIState == null ? 0 : passAlreadyAvailedBottomSheetUIState.hashCode())) * 31;
        FareMappingFailedBottomSheetUIState fareMappingFailedBottomSheetUIState = this.z;
        int iHashCode13 = (iHashCode12 + (fareMappingFailedBottomSheetUIState == null ? 0 : fareMappingFailedBottomSheetUIState.hashCode())) * 31;
        ConfirmSuperPassOffersSectionUIState confirmSuperPassOffersSectionUIState = this.A;
        int iHashCode14 = (iHashCode13 + (confirmSuperPassOffersSectionUIState == null ? 0 : confirmSuperPassOffersSectionUIState.hashCode())) * 31;
        PassStateDateChangeInfoBannerUIState passStateDateChangeInfoBannerUIState = this.B;
        int iHashCode15 = (this.C.hashCode() + ((iHashCode14 + (passStateDateChangeInfoBannerUIState == null ? 0 : passStateDateChangeInfoBannerUIState.hashCode())) * 31)) * 31;
        ImageUrlUIState imageUrlUIState = this.D;
        int iHashCode16 = (iHashCode15 + (imageUrlUIState == null ? 0 : imageUrlUIState.hashCode())) * 31;
        ImageUIState imageUIState = this.E;
        int iHashCode17 = (iHashCode16 + (imageUIState == null ? 0 : imageUIState.hashCode())) * 31;
        TextUIState.ChaloTextUIState chaloTextUIState = this.F;
        int iHashCode18 = (iHashCode17 + (chaloTextUIState == null ? 0 : chaloTextUIState.hashCode())) * 31;
        ArrayList arrayList = this.G;
        return iHashCode18 + (arrayList != null ? arrayList.hashCode() : 0);
    }

    public final String toString() {
        return "ConfirmSuperPassPurchaseUIState(toolbar=" + this.f8382a + ", title=" + this.b + ", userName=" + this.c + ", uploadedProof=" + this.d + ", sectionDivider=" + this.e + ", finalDivider=" + this.f + ", productName=" + this.g + ", rideDetails=" + this.h + ", subcategoryInfoNote=" + this.i + ", productDurationCategoryName=" + this.j + ", passStartDateTitle=" + this.k + ", passStartDate=" + this.l + ", passExpiryDate=" + this.m + ", changeDateBtn=" + this.n + ", startAndExpiryBtwImage=" + this.o + ", userDetailsTitleForNoProof=" + this.p + ", userNameForNoProof=" + this.q + ", fareDetails=" + this.r + ", tnc=" + this.s + ", confirmBtn=" + this.t + ", zoomedImage=" + this.u + ", datePickerDialog=" + this.v + ", loadingDialog=" + this.w + ", tncBottomSheet=" + this.x + ", passAlreadyAvailedBottomSheet=" + this.y + ", fareMappingFailedBottomSheet=" + this.z + ", offersSection=" + this.A + ", passStartDateChangeInfoBanner=" + this.B + ", spec=" + this.C + ", productBrandingImageUrlUIState=" + this.D + ", productBrandingImageUIState=" + this.E + ", productBrandingTitleUIState=" + this.F + ", bannerUIStateList=" + this.G + ")";
    }
}
