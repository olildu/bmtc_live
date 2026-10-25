package app.chalo.userprofile.domain;

import app.chalo.userprofile.Gender;
import app.chalo.userprofile.UserProfileAppModel;
import defpackage.dd;
import defpackage.nf1;
import defpackage.pk0;
import defpackage.py;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/userprofile/domain/UpdateUserProfileRequest;", "", "login_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class UpdateUserProfileRequest {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f10325a;
    public final String b;
    public final String c;
    public final Gender d;
    public final Long e;
    public final String f;
    public final Integer g;

    public UpdateUserProfileRequest(UserProfileAppModel profile, String firstName, String lastName, String str, Gender gender, Long l, String str2, Integer num) {
        Intrinsics.i(profile, "profile");
        Intrinsics.i(firstName, "firstName");
        Intrinsics.i(lastName, "lastName");
        this.f10325a = firstName;
        this.b = lastName;
        this.c = str;
        this.d = gender;
        this.e = l;
        this.f = str2;
        this.g = num;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof UpdateUserProfileRequest)) {
            return false;
        }
        UpdateUserProfileRequest updateUserProfileRequest = (UpdateUserProfileRequest) obj;
        return Intrinsics.d(this.f10325a, updateUserProfileRequest.f10325a) && Intrinsics.d(this.b, updateUserProfileRequest.b) && Intrinsics.d(this.c, updateUserProfileRequest.c) && this.d == updateUserProfileRequest.d && Intrinsics.d(this.e, updateUserProfileRequest.e) && Intrinsics.d(this.f, updateUserProfileRequest.f) && Intrinsics.d(this.g, updateUserProfileRequest.g);
    }

    public final int hashCode() {
        int iE = nf1.e(this.f10325a.hashCode() * 31, 31, this.b);
        String str = this.c;
        int iHashCode = (iE + (str == null ? 0 : str.hashCode())) * 31;
        Gender gender = this.d;
        int iHashCode2 = (iHashCode + (gender == null ? 0 : gender.hashCode())) * 31;
        Long l = this.e;
        int iHashCode3 = (iHashCode2 + (l == null ? 0 : l.hashCode())) * 31;
        String str2 = this.f;
        int iHashCode4 = (iHashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Integer num = this.g;
        return iHashCode4 + (num != null ? num.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbE = dd.e("UpdateUserProfileRequest(firstName=", this.f10325a, ", lastName=", this.b, ", profilePhotoUrl=");
        sbE.append(this.c);
        sbE.append(", gender=");
        sbE.append(this.d);
        sbE.append(", dateOfBirthInMillis=");
        py.t(this.e, ", emailId=", this.f, ", age=", sbE);
        return pk0.k(sbE, this.g, ")");
    }
}
