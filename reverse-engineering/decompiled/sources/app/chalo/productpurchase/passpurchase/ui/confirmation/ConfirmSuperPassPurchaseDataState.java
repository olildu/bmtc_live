package app.chalo.productpurchase.passpurchase.ui.confirmation;

import app.chalo.productpurchase.passpurchase.ui.proofoverview.EnlargeProofImage;
import app.chalo.providers.iconassetprovider.IconType;
import defpackage.cb0;
import defpackage.nf1;
import defpackage.xs;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/productpurchase/passpurchase/ui/confirmation/ConfirmSuperPassPurchaseDataState;", "", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class ConfirmSuperPassPurchaseDataState {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f8364a;
    public final boolean b;
    public final PassConfirmationDialogType c;
    public final PassConfirmationBottomSheetType d;
    public final EnlargeProofImage e;
    public final boolean f;
    public final String g;
    public final String h;
    public final IconType i;
    public final PassValidityInfo j;
    public final List k;

    public ConfirmSuperPassPurchaseDataState(boolean z, boolean z2, PassConfirmationDialogType passConfirmationDialogType, PassConfirmationBottomSheetType passConfirmationBottomSheetType, EnlargeProofImage enlargeProofImage, boolean z3, String str, String str2, IconType iconType, PassValidityInfo passValidityInfo, List list) {
        this.f8364a = z;
        this.b = z2;
        this.c = passConfirmationDialogType;
        this.d = passConfirmationBottomSheetType;
        this.e = enlargeProofImage;
        this.f = z3;
        this.g = str;
        this.h = str2;
        this.i = iconType;
        this.j = passValidityInfo;
        this.k = list;
    }

    public static ConfirmSuperPassPurchaseDataState a(ConfirmSuperPassPurchaseDataState confirmSuperPassPurchaseDataState, boolean z, boolean z2, PassConfirmationDialogType passConfirmationDialogType, PassConfirmationBottomSheetType passConfirmationBottomSheetType, EnlargeProofImage enlargeProofImage, String str, String str2, IconType iconType, PassValidityInfo passValidityInfo, List list, int i) {
        if ((i & 1) != 0) {
            z = confirmSuperPassPurchaseDataState.f8364a;
        }
        boolean z3 = z;
        if ((i & 2) != 0) {
            z2 = confirmSuperPassPurchaseDataState.b;
        }
        boolean z4 = z2;
        if ((i & 4) != 0) {
            passConfirmationDialogType = confirmSuperPassPurchaseDataState.c;
        }
        PassConfirmationDialogType passConfirmationDialogType2 = passConfirmationDialogType;
        PassConfirmationBottomSheetType passConfirmationBottomSheetType2 = (i & 8) != 0 ? confirmSuperPassPurchaseDataState.d : passConfirmationBottomSheetType;
        EnlargeProofImage enlargeProofImage2 = (i & 16) != 0 ? confirmSuperPassPurchaseDataState.e : enlargeProofImage;
        boolean z5 = (i & 32) != 0 ? confirmSuperPassPurchaseDataState.f : false;
        String str3 = (i & 64) != 0 ? confirmSuperPassPurchaseDataState.g : str;
        String str4 = (i & 128) != 0 ? confirmSuperPassPurchaseDataState.h : str2;
        IconType iconType2 = (i & 256) != 0 ? confirmSuperPassPurchaseDataState.i : iconType;
        PassValidityInfo passValidityInfo2 = (i & 512) != 0 ? confirmSuperPassPurchaseDataState.j : passValidityInfo;
        List list2 = (i & 1024) != 0 ? confirmSuperPassPurchaseDataState.k : list;
        confirmSuperPassPurchaseDataState.getClass();
        return new ConfirmSuperPassPurchaseDataState(z3, z4, passConfirmationDialogType2, passConfirmationBottomSheetType2, enlargeProofImage2, z5, str3, str4, iconType2, passValidityInfo2, list2);
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final PassConfirmationBottomSheetType getD() {
        return this.d;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final PassConfirmationDialogType getC() {
        return this.c;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final EnlargeProofImage getE() {
        return this.e;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final boolean getF8364a() {
        return this.f8364a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ConfirmSuperPassPurchaseDataState)) {
            return false;
        }
        ConfirmSuperPassPurchaseDataState confirmSuperPassPurchaseDataState = (ConfirmSuperPassPurchaseDataState) obj;
        return this.f8364a == confirmSuperPassPurchaseDataState.f8364a && this.b == confirmSuperPassPurchaseDataState.b && Intrinsics.d(this.c, confirmSuperPassPurchaseDataState.c) && Intrinsics.d(this.d, confirmSuperPassPurchaseDataState.d) && Intrinsics.d(this.e, confirmSuperPassPurchaseDataState.e) && this.f == confirmSuperPassPurchaseDataState.f && Intrinsics.d(this.g, confirmSuperPassPurchaseDataState.g) && Intrinsics.d(this.h, confirmSuperPassPurchaseDataState.h) && this.i == confirmSuperPassPurchaseDataState.i && Intrinsics.d(this.j, confirmSuperPassPurchaseDataState.j) && Intrinsics.d(this.k, confirmSuperPassPurchaseDataState.k);
    }

    public final int hashCode() {
        int i = (((this.f8364a ? 1231 : 1237) * 31) + (this.b ? 1231 : 1237)) * 31;
        PassConfirmationDialogType passConfirmationDialogType = this.c;
        int iHashCode = (i + (passConfirmationDialogType == null ? 0 : passConfirmationDialogType.hashCode())) * 31;
        PassConfirmationBottomSheetType passConfirmationBottomSheetType = this.d;
        int iHashCode2 = (iHashCode + (passConfirmationBottomSheetType == null ? 0 : passConfirmationBottomSheetType.hashCode())) * 31;
        EnlargeProofImage enlargeProofImage = this.e;
        int iHashCode3 = (((iHashCode2 + (enlargeProofImage == null ? 0 : enlargeProofImage.hashCode())) * 31) + (this.f ? 1231 : 1237)) * 31;
        String str = this.g;
        int iHashCode4 = (iHashCode3 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.h;
        int iHashCode5 = (iHashCode4 + (str2 == null ? 0 : str2.hashCode())) * 31;
        IconType iconType = this.i;
        int iHashCode6 = (iHashCode5 + (iconType == null ? 0 : iconType.hashCode())) * 31;
        PassValidityInfo passValidityInfo = this.j;
        int iHashCode7 = (iHashCode6 + (passValidityInfo == null ? 0 : passValidityInfo.hashCode())) * 31;
        List list = this.k;
        return iHashCode7 + (list != null ? list.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbR = nf1.r("ConfirmSuperPassPurchaseDataState(isFareLayoutExpanded=", ", isProfileSubmittedForVerification=", ", dialog=", this.f8364a, this.b);
        sbR.append(this.c);
        sbR.append(", bottomSheet=");
        sbR.append(this.d);
        sbR.append(", zoomedImage=");
        sbR.append(this.e);
        sbR.append(", isPremiumPassLandingFlow=");
        sbR.append(this.f);
        sbR.append(", passStartDateChangeInfoBanner=");
        cb0.t(sbR, this.g, ", brandingUrl=", this.h, ", brandingIcon=");
        sbR.append(this.i);
        sbR.append(", passValidityInfo=");
        sbR.append(this.j);
        sbR.append(", banners=");
        return xs.l(sbR, this.k, ")");
    }
}
