package app.chalo.premiumbus.bulkbookingridedetails.data.model.api;

import defpackage.cb0;
import defpackage.dd;
import defpackage.dn1;
import defpackage.nf1;
import defpackage.pk0;
import java.util.Map;
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
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lapp/chalo/premiumbus/bulkbookingridedetails/data/model/api/UserProfile;", "", "Companion", "$serializer", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@Serializable
public final /* data */ class UserProfile {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion();
    public static final Lazy[] l = {null, null, null, null, null, null, null, null, null, LazyKt.a(LazyThreadSafetyMode.PUBLICATION, new dn1(20)), null};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f6888a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;
    public final String g;
    public final String h;
    public final String i;
    public final Map j;
    public final Long k;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/premiumbus/bulkbookingridedetails/data/model/api/UserProfile$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lapp/chalo/premiumbus/bulkbookingridedetails/data/model/api/UserProfile;", "serializer", "()Lkotlinx/serialization/KSerializer;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public final KSerializer<UserProfile> serializer() {
            return UserProfile$$serializer.f6889a;
        }
    }

    public /* synthetic */ UserProfile(int i, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, Map map, Long l2) {
        if (2047 != (i & 2047)) {
            PluginExceptionsKt.b(UserProfile$$serializer.f6889a.getDescriptor(), i, 2047);
            throw null;
        }
        this.f6888a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
        this.f = str6;
        this.g = str7;
        this.h = str8;
        this.i = str9;
        this.j = map;
        this.k = l2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof UserProfile)) {
            return false;
        }
        UserProfile userProfile = (UserProfile) obj;
        return Intrinsics.d(this.f6888a, userProfile.f6888a) && Intrinsics.d(this.b, userProfile.b) && Intrinsics.d(this.c, userProfile.c) && Intrinsics.d(this.d, userProfile.d) && Intrinsics.d(this.e, userProfile.e) && Intrinsics.d(this.f, userProfile.f) && Intrinsics.d(this.g, userProfile.g) && Intrinsics.d(this.h, userProfile.h) && Intrinsics.d(this.i, userProfile.i) && Intrinsics.d(this.j, userProfile.j) && Intrinsics.d(this.k, userProfile.k);
    }

    public final int hashCode() {
        int iE = nf1.e(nf1.e(nf1.e(nf1.e(nf1.e(nf1.e(nf1.e(nf1.e(this.f6888a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e), 31, this.f), 31, this.g), 31, this.h), 31, this.i);
        Map map = this.j;
        int iHashCode = (iE + (map == null ? 0 : map.hashCode())) * 31;
        Long l2 = this.k;
        return iHashCode + (l2 != null ? l2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbE = dd.e("UserProfile(firstName=", this.f6888a, ", lastName=", this.b, ", profilePhoto=");
        cb0.t(sbE, this.c, ", gender=", this.d, ", mobileNumber=");
        cb0.t(sbE, this.e, ", countryCode=", this.f, ", mailId=");
        cb0.t(sbE, this.g, ", userId=", this.h, ", dateOfBirth=");
        sbE.append(this.i);
        sbE.append(", addFields=");
        sbE.append(this.j);
        sbE.append(", dobInMillis=");
        return pk0.l(sbE, this.k, ")");
    }
}
