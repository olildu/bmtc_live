package app.chalo.models.userprofile;

import app.chalo.userprofile.Gender;
import defpackage.cb0;
import defpackage.dd;
import defpackage.dn1;
import defpackage.nf1;
import defpackage.vo1;
import java.util.HashMap;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.internal.PluginExceptionsKt;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lapp/chalo/models/userprofile/UserProfile;", "", "Companion", "$serializer", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@Serializable
public final /* data */ class UserProfile {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion();
    public static final Lazy[] j;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f5690a;
    public final String b;
    public final String c;
    public final Gender d;
    public final String e;
    public final String f;
    public final String g;
    public final String h;
    public final HashMap i;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/models/userprofile/UserProfile$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lapp/chalo/models/userprofile/UserProfile;", "serializer", "()Lkotlinx/serialization/KSerializer;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public final KSerializer<UserProfile> serializer() {
            return UserProfile$$serializer.f5691a;
        }
    }

    static {
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
        j = new Lazy[]{null, null, null, LazyKt.a(lazyThreadSafetyMode, new dn1(21)), null, null, null, null, LazyKt.a(lazyThreadSafetyMode, new dn1(22))};
    }

    public /* synthetic */ UserProfile(int i, String str, String str2, String str3, Gender gender, String str4, String str5, String str6, String str7, HashMap map) {
        if (31 != (i & 31)) {
            PluginExceptionsKt.b(UserProfile$$serializer.f5691a.getDescriptor(), i, 31);
            throw null;
        }
        this.f5690a = str;
        this.b = str2;
        this.c = str3;
        this.d = gender;
        this.e = str4;
        if ((i & 32) == 0) {
            this.f = null;
        } else {
            this.f = str5;
        }
        if ((i & 64) == 0) {
            this.g = null;
        } else {
            this.g = str6;
        }
        if ((i & 128) == 0) {
            this.h = null;
        } else {
            this.h = str7;
        }
        if ((i & 256) == 0) {
            this.i = null;
        } else {
            this.i = map;
        }
    }

    public final String a() {
        String str = this.c;
        int length = str.length();
        String str2 = this.b;
        if (length == 0) {
            return str2.length() == 0 ? "" : str2;
        }
        if (str2.length() == 0) {
            return str.length() == 0 ? "" : str;
        }
        return vo1.n(str2, " ", str);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof UserProfile)) {
            return false;
        }
        UserProfile userProfile = (UserProfile) obj;
        return Intrinsics.d(this.f5690a, userProfile.f5690a) && Intrinsics.d(this.b, userProfile.b) && Intrinsics.d(this.c, userProfile.c) && this.d == userProfile.d && Intrinsics.d(this.e, userProfile.e) && Intrinsics.d(this.f, userProfile.f) && Intrinsics.d(this.g, userProfile.g) && Intrinsics.d(this.h, userProfile.h) && Intrinsics.d(this.i, userProfile.i);
    }

    public final int hashCode() {
        String str = this.f5690a;
        int iE = nf1.e((this.d.hashCode() + nf1.e(nf1.e((str == null ? 0 : str.hashCode()) * 31, 31, this.b), 31, this.c)) * 31, 31, this.e);
        String str2 = this.f;
        int iHashCode = (iE + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.g;
        int iHashCode2 = (iHashCode + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.h;
        int iHashCode3 = (iHashCode2 + (str4 == null ? 0 : str4.hashCode())) * 31;
        HashMap map = this.i;
        return iHashCode3 + (map != null ? map.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbE = dd.e("UserProfile(userId=", this.f5690a, ", firstName=", this.b, ", lastName=");
        sbE.append(this.c);
        sbE.append(", gender=");
        sbE.append(this.d);
        sbE.append(", dateOfBirth=");
        cb0.t(sbE, this.e, ", emailId=", this.f, ", phone=");
        cb0.t(sbE, this.g, ", profilePhoto=", this.h, ", agencyInfo=");
        sbE.append(this.i);
        sbE.append(")");
        return sbE.toString();
    }

    public UserProfile(String firstName, String lastName, Gender gender, String dateOfBirth, String str, HashMap map) {
        Intrinsics.i(firstName, "firstName");
        Intrinsics.i(lastName, "lastName");
        Intrinsics.i(dateOfBirth, "dateOfBirth");
        this.f5690a = null;
        this.b = firstName;
        this.c = lastName;
        this.d = gender;
        this.e = dateOfBirth;
        this.f = null;
        this.g = null;
        this.h = str;
        this.i = map;
    }
}
