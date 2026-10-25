package app.chalo.productpurchase.passpurchase.ui.enteruserdetails;

import app.chalo.scenes.args.SuperPassBasicUserPurpose;
import app.chalo.userprofile.Gender;
import defpackage.nf1;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/productpurchase/passpurchase/ui/enteruserdetails/SuperPassEnterUserDetailsDataState;", "", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class SuperPassEnterUserDetailsDataState {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f8412a;
    public final Gender b;
    public final Long c;
    public final Long d;
    public final boolean e;
    public final SuperPassBasicUserPurpose f;
    public final SuperPassBasicDetailsDialogType g;

    public SuperPassEnterUserDetailsDataState(String fullName, Gender gender, Long l, Long l2, boolean z, SuperPassBasicUserPurpose superPassBasicUserPurpose, SuperPassBasicDetailsDialogType superPassBasicDetailsDialogType) {
        Intrinsics.i(fullName, "fullName");
        Intrinsics.i(gender, "gender");
        this.f8412a = fullName;
        this.b = gender;
        this.c = l;
        this.d = l2;
        this.e = z;
        this.f = superPassBasicUserPurpose;
        this.g = superPassBasicDetailsDialogType;
    }

    public static SuperPassEnterUserDetailsDataState a(SuperPassEnterUserDetailsDataState superPassEnterUserDetailsDataState, String str, Gender gender, Long l, Long l2, boolean z, SuperPassBasicUserPurpose superPassBasicUserPurpose, SuperPassBasicDetailsDialogType superPassBasicDetailsDialogType, int i) {
        if ((i & 1) != 0) {
            str = superPassEnterUserDetailsDataState.f8412a;
        }
        String fullName = str;
        if ((i & 2) != 0) {
            gender = superPassEnterUserDetailsDataState.b;
        }
        Gender gender2 = gender;
        if ((i & 4) != 0) {
            l = superPassEnterUserDetailsDataState.c;
        }
        Long l3 = l;
        if ((i & 8) != 0) {
            l2 = superPassEnterUserDetailsDataState.d;
        }
        Long l4 = l2;
        if ((i & 16) != 0) {
            z = superPassEnterUserDetailsDataState.e;
        }
        boolean z2 = z;
        if ((i & 32) != 0) {
            superPassBasicUserPurpose = superPassEnterUserDetailsDataState.f;
        }
        SuperPassBasicUserPurpose superPassBasicUserPurpose2 = superPassBasicUserPurpose;
        if ((i & 64) != 0) {
            superPassBasicDetailsDialogType = superPassEnterUserDetailsDataState.g;
        }
        superPassEnterUserDetailsDataState.getClass();
        Intrinsics.i(fullName, "fullName");
        Intrinsics.i(gender2, "gender");
        return new SuperPassEnterUserDetailsDataState(fullName, gender2, l3, l4, z2, superPassBasicUserPurpose2, superPassBasicDetailsDialogType);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SuperPassEnterUserDetailsDataState)) {
            return false;
        }
        SuperPassEnterUserDetailsDataState superPassEnterUserDetailsDataState = (SuperPassEnterUserDetailsDataState) obj;
        return Intrinsics.d(this.f8412a, superPassEnterUserDetailsDataState.f8412a) && this.b == superPassEnterUserDetailsDataState.b && Intrinsics.d(this.c, superPassEnterUserDetailsDataState.c) && Intrinsics.d(this.d, superPassEnterUserDetailsDataState.d) && this.e == superPassEnterUserDetailsDataState.e && this.f == superPassEnterUserDetailsDataState.f && Intrinsics.d(this.g, superPassEnterUserDetailsDataState.g);
    }

    public final int hashCode() {
        int iHashCode = (this.b.hashCode() + (this.f8412a.hashCode() * 31)) * 31;
        Long l = this.c;
        int iHashCode2 = (iHashCode + (l == null ? 0 : l.hashCode())) * 31;
        Long l2 = this.d;
        int iHashCode3 = (((iHashCode2 + (l2 == null ? 0 : l2.hashCode())) * 31) + (this.e ? 1231 : 1237)) * 31;
        SuperPassBasicUserPurpose superPassBasicUserPurpose = this.f;
        int iHashCode4 = (iHashCode3 + (superPassBasicUserPurpose == null ? 0 : superPassBasicUserPurpose.hashCode())) * 31;
        SuperPassBasicDetailsDialogType superPassBasicDetailsDialogType = this.g;
        return iHashCode4 + (superPassBasicDetailsDialogType != null ? superPassBasicDetailsDialogType.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SuperPassEnterUserDetailsDataState(fullName=");
        sb.append(this.f8412a);
        sb.append(", gender=");
        sb.append(this.b);
        sb.append(", dobInMillis=");
        nf1.w(sb, this.c, ", passStartTime=", this.d, ", areAllRequiredFieldsSet=");
        sb.append(this.e);
        sb.append(", purpose=");
        sb.append(this.f);
        sb.append(", dialogType=");
        sb.append(this.g);
        sb.append(")");
        return sb.toString();
    }

    public /* synthetic */ SuperPassEnterUserDetailsDataState() {
        this("", Gender.MALE, null, null, false, null, null);
    }
}
