package app.chalo.productpurchase.passpurchase.ui.proofoverview;

import app.chalo.superpass.data.models.entities.ProfileRejectionReason;
import defpackage.hq0;
import defpackage.nf1;
import defpackage.pk0;
import defpackage.z40;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/productpurchase/passpurchase/ui/proofoverview/SuperPassProofOverviewDataState;", "", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class SuperPassProofOverviewDataState {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f8466a;
    public final boolean b;
    public final boolean c;
    public final String d;
    public final boolean e;
    public final List f;
    public final List g;
    public final ProfileRejectionReason h;
    public final Map i;
    public final boolean j;
    public final boolean k;
    public final boolean l;
    public final boolean m;
    public final boolean n;
    public final EnlargeProofImage o;

    public SuperPassProofOverviewDataState(boolean z, boolean z2, boolean z3, String fullName, boolean z4, List list, List list2, ProfileRejectionReason profileRejectionReason, Map map, boolean z5, boolean z6, boolean z7, boolean z8, boolean z9, EnlargeProofImage enlargeProofImage) {
        Intrinsics.i(fullName, "fullName");
        this.f8466a = z;
        this.b = z2;
        this.c = z3;
        this.d = fullName;
        this.e = z4;
        this.f = list;
        this.g = list2;
        this.h = profileRejectionReason;
        this.i = map;
        this.j = z5;
        this.k = z6;
        this.l = z7;
        this.m = z8;
        this.n = z9;
        this.o = enlargeProofImage;
    }

    public static SuperPassProofOverviewDataState a(SuperPassProofOverviewDataState superPassProofOverviewDataState, boolean z, boolean z2, boolean z3, String str, boolean z4, List list, List list2, ProfileRejectionReason profileRejectionReason, Map map, boolean z5, boolean z6, boolean z7, boolean z8, boolean z9, EnlargeProofImage enlargeProofImage, int i) {
        boolean z10 = (i & 1) != 0 ? superPassProofOverviewDataState.f8466a : z;
        boolean z11 = (i & 2) != 0 ? superPassProofOverviewDataState.b : z2;
        boolean z12 = (i & 4) != 0 ? superPassProofOverviewDataState.c : z3;
        String fullName = (i & 8) != 0 ? superPassProofOverviewDataState.d : str;
        boolean z13 = (i & 16) != 0 ? superPassProofOverviewDataState.e : z4;
        List list3 = (i & 32) != 0 ? superPassProofOverviewDataState.f : list;
        List list4 = (i & 64) != 0 ? superPassProofOverviewDataState.g : list2;
        ProfileRejectionReason profileRejectionReason2 = (i & 128) != 0 ? superPassProofOverviewDataState.h : profileRejectionReason;
        Map map2 = (i & 256) != 0 ? superPassProofOverviewDataState.i : map;
        boolean z14 = (i & 512) != 0 ? superPassProofOverviewDataState.j : z5;
        boolean z15 = (i & 1024) != 0 ? superPassProofOverviewDataState.k : z6;
        boolean z16 = (i & 2048) != 0 ? superPassProofOverviewDataState.l : z7;
        boolean z17 = (i & 4096) != 0 ? superPassProofOverviewDataState.m : z8;
        boolean z18 = (i & 8192) != 0 ? superPassProofOverviewDataState.n : z9;
        EnlargeProofImage enlargeProofImage2 = (i & 16384) != 0 ? superPassProofOverviewDataState.o : enlargeProofImage;
        superPassProofOverviewDataState.getClass();
        Intrinsics.i(fullName, "fullName");
        return new SuperPassProofOverviewDataState(z10, z11, z12, fullName, z13, list3, list4, profileRejectionReason2, map2, z14, z15, z16, z17, z18, enlargeProofImage2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SuperPassProofOverviewDataState)) {
            return false;
        }
        SuperPassProofOverviewDataState superPassProofOverviewDataState = (SuperPassProofOverviewDataState) obj;
        return this.f8466a == superPassProofOverviewDataState.f8466a && this.b == superPassProofOverviewDataState.b && this.c == superPassProofOverviewDataState.c && Intrinsics.d(this.d, superPassProofOverviewDataState.d) && this.e == superPassProofOverviewDataState.e && Intrinsics.d(this.f, superPassProofOverviewDataState.f) && Intrinsics.d(this.g, superPassProofOverviewDataState.g) && Intrinsics.d(this.h, superPassProofOverviewDataState.h) && Intrinsics.d(this.i, superPassProofOverviewDataState.i) && this.j == superPassProofOverviewDataState.j && this.k == superPassProofOverviewDataState.k && this.l == superPassProofOverviewDataState.l && this.m == superPassProofOverviewDataState.m && this.n == superPassProofOverviewDataState.n && Intrinsics.d(this.o, superPassProofOverviewDataState.o);
    }

    public final int hashCode() {
        int iE = (nf1.e((((((this.f8466a ? 1231 : 1237) * 31) + (this.b ? 1231 : 1237)) * 31) + (this.c ? 1231 : 1237)) * 31, 31, this.d) + (this.e ? 1231 : 1237)) * 31;
        List list = this.f;
        int iHashCode = (iE + (list == null ? 0 : list.hashCode())) * 31;
        List list2 = this.g;
        int iHashCode2 = (iHashCode + (list2 == null ? 0 : list2.hashCode())) * 31;
        ProfileRejectionReason profileRejectionReason = this.h;
        int iHashCode3 = (iHashCode2 + (profileRejectionReason == null ? 0 : profileRejectionReason.hashCode())) * 31;
        Map map = this.i;
        int iHashCode4 = (((((((((((iHashCode3 + (map == null ? 0 : map.hashCode())) * 31) + (this.j ? 1231 : 1237)) * 31) + (this.k ? 1231 : 1237)) * 31) + (this.l ? 1231 : 1237)) * 31) + (this.m ? 1231 : 1237)) * 31) + (this.n ? 1231 : 1237)) * 31;
        EnlargeProofImage enlargeProofImage = this.o;
        return iHashCode4 + (enlargeProofImage != null ? enlargeProofImage.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbR = nf1.r("SuperPassProofOverviewDataState(reInitiate=", ", reApply=", ", freshApplication=", this.f8466a, this.b);
        pk0.x(", fullName=", this.d, ", isProofVerificationRequired=", sbR, this.c);
        hq0.w(sbR, this.e, ", generalRejectionReasonsList=", this.f, ", proofRejectionReasonsList=");
        sbR.append(this.g);
        sbR.append(", profileRejectionReasonsList=");
        sbR.append(this.h);
        sbR.append(", proofUploadDetailsMap=");
        sbR.append(this.i);
        sbR.append(", shouldShowPermissionRationale=");
        sbR.append(this.j);
        sbR.append(", areAllProofsUploaded=");
        z40.r(sbR, this.k, ", isNameChangeComplete=", this.l, ", shouldShowConsentCheckbox=");
        z40.r(sbR, this.m, ", isConsentCheckboxChecked=", this.n, ", enlargeProofImage=");
        sbR.append(this.o);
        sbR.append(")");
        return sbR.toString();
    }

    public /* synthetic */ SuperPassProofOverviewDataState(boolean z, boolean z2, boolean z3, String str, LinkedHashMap linkedHashMap, boolean z4, boolean z5, boolean z6, boolean z7, EnlargeProofImage enlargeProofImage, int i) {
        this((i & 1) != 0 ? false : z, (i & 2) != 0 ? false : z2, (i & 4) != 0 ? true : z3, (i & 8) != 0 ? "" : str, true, null, null, null, (i & 256) != 0 ? null : linkedHashMap, false, (i & 1024) != 0 ? false : z4, (i & 2048) != 0 ? false : z5, (i & 4096) != 0 ? false : z6, (i & 8192) != 0 ? false : z7, (i & 16384) != 0 ? null : enlargeProofImage);
    }
}
