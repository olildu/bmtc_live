package app.chalo.login.truecaller;

import defpackage.cb0;
import defpackage.dd;
import defpackage.vo1;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/login/truecaller/TruecallerProfile;", "", "login_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class TruecallerProfile {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f5293a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;
    public final String g;

    public TruecallerProfile(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        this.f5293a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
        this.f = str6;
        this.g = str7;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TruecallerProfile)) {
            return false;
        }
        TruecallerProfile truecallerProfile = (TruecallerProfile) obj;
        return Intrinsics.d(this.f5293a, truecallerProfile.f5293a) && Intrinsics.d(this.b, truecallerProfile.b) && Intrinsics.d(this.c, truecallerProfile.c) && Intrinsics.d(this.d, truecallerProfile.d) && Intrinsics.d(this.e, truecallerProfile.e) && Intrinsics.d(this.f, truecallerProfile.f) && Intrinsics.d(this.g, truecallerProfile.g);
    }

    public final int hashCode() {
        String str = this.f5293a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.b;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.c;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.d;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.e;
        int iHashCode5 = (iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.f;
        int iHashCode6 = (iHashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.g;
        return iHashCode6 + (str7 != null ? str7.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbE = dd.e("TruecallerProfile(payload=", this.f5293a, ", signature=", this.b, ", signatureAlgorithm=");
        cb0.t(sbE, this.c, ", phoneNumber=", this.d, ", firstName=");
        cb0.t(sbE, this.e, ", lastName=", this.f, ", email=");
        return vo1.p(sbE, this.g, ")");
    }
}
