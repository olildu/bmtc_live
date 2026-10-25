package app.chalo.home.ui.profile;

import app.chalo.userprofile.Gender;
import defpackage.b3;
import defpackage.cb0;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/home/ui/profile/ProfileDrawerCardData;", "", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class ProfileDrawerCardData {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f3592a;
    public final String b;
    public final String c;
    public final String d;
    public final Gender e;
    public final boolean f;
    public final boolean g;
    public final int h;
    public final int i;

    public ProfileDrawerCardData(boolean z, String str, String str2, String str3, Gender gender, boolean z2, boolean z3, int i, int i2) {
        Intrinsics.i(gender, "gender");
        this.f3592a = z;
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = gender;
        this.f = z2;
        this.g = z3;
        this.h = i;
        this.i = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ProfileDrawerCardData)) {
            return false;
        }
        ProfileDrawerCardData profileDrawerCardData = (ProfileDrawerCardData) obj;
        return this.f3592a == profileDrawerCardData.f3592a && Intrinsics.d(this.b, profileDrawerCardData.b) && Intrinsics.d(this.c, profileDrawerCardData.c) && Intrinsics.d(this.d, profileDrawerCardData.d) && this.e == profileDrawerCardData.e && this.f == profileDrawerCardData.f && this.g == profileDrawerCardData.g && this.h == profileDrawerCardData.h && this.i == profileDrawerCardData.i;
    }

    public final int hashCode() {
        int i = (this.f3592a ? 1231 : 1237) * 31;
        String str = this.b;
        int iHashCode = (i + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.c;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.d;
        return ((((((((this.e.hashCode() + ((iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31)) * 31) + (this.f ? 1231 : 1237)) * 31) + (this.g ? 1231 : 1237)) * 31) + this.h) * 31) + this.i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ProfileDrawerCardData(isUserLoggedIn=");
        sb.append(this.f3592a);
        sb.append(", profileImageUrl=");
        sb.append(this.b);
        sb.append(", fullName=");
        cb0.t(sb, this.c, ", phoneNumber=", this.d, ", gender=");
        sb.append(this.e);
        sb.append(", isProfileComplete=");
        sb.append(this.f);
        sb.append(", shouldShowNudgeBanner=");
        sb.append(this.g);
        sb.append(", completedCount=");
        sb.append(this.h);
        sb.append(", totalCount=");
        return b3.f(")", this.i, sb);
    }

    public /* synthetic */ ProfileDrawerCardData(boolean z, String str, String str2, String str3, Gender gender, boolean z2, int i, int i2, int i3) {
        this(z, (i3 & 2) != 0 ? null : str, (i3 & 4) != 0 ? null : str2, (i3 & 8) != 0 ? null : str3, (i3 & 16) != 0 ? Gender.NULL : gender, (i3 & 32) != 0 ? false : z2, false, (i3 & 128) != 0 ? 0 : i, (i3 & 256) != 0 ? 0 : i2);
    }
}
