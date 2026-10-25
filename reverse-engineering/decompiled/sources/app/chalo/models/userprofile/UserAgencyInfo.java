package app.chalo.models.userprofile;

import defpackage.dn1;
import defpackage.nf1;
import defpackage.r30;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.internal.PluginExceptionsKt;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0003\u0003\u0004\u0002¨\u0006\u0005"}, d2 = {"Lapp/chalo/models/userprofile/UserAgencyInfo;", "", "Companion", "STATUS", "$serializer", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@Serializable
public final /* data */ class UserAgencyInfo {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion();
    public static final Lazy[] g;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final STATUS f5688a;
    public final Map b;
    public final Map c;
    public final String d;
    public final String e;
    public final String f;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/models/userprofile/UserAgencyInfo$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lapp/chalo/models/userprofile/UserAgencyInfo;", "serializer", "()Lkotlinx/serialization/KSerializer;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public final KSerializer<UserAgencyInfo> serializer() {
            return UserAgencyInfo$$serializer.f5689a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\r\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\r¨\u0006\u000e"}, d2 = {"Lapp/chalo/models/userprofile/UserAgencyInfo$STATUS;", "", "<init>", "(Ljava/lang/String;I)V", "VERIFIED", "UNVERIFIED", "BLOCKED", "BANNED", "REJECTED", "PAYMENT_PENDING", "FAILED", "TRANSACTION_PENDING", "PENDING", "SUCCESS", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public enum STATUS {
        VERIFIED,
        UNVERIFIED,
        BLOCKED,
        BANNED,
        REJECTED,
        PAYMENT_PENDING,
        FAILED,
        TRANSACTION_PENDING,
        PENDING,
        SUCCESS;

        private static final /* synthetic */ EnumEntries $ENTRIES = EnumEntriesKt.a(values());

        public static EnumEntries<STATUS> getEntries() {
            return $ENTRIES;
        }
    }

    static {
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
        g = new Lazy[]{LazyKt.a(lazyThreadSafetyMode, new dn1(6)), LazyKt.a(lazyThreadSafetyMode, new dn1(7)), LazyKt.a(lazyThreadSafetyMode, new dn1(8)), null, null, null};
    }

    public /* synthetic */ UserAgencyInfo(int i, STATUS status, Map map, Map map2, String str, String str2, String str3) {
        if (9 != (i & 9)) {
            PluginExceptionsKt.b(UserAgencyInfo$$serializer.f5689a.getDescriptor(), i, 9);
            throw null;
        }
        this.f5688a = status;
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = map;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = map2;
        }
        this.d = str;
        if ((i & 16) == 0) {
            this.e = null;
        } else {
            this.e = str2;
        }
        if ((i & 32) == 0) {
            this.f = null;
        } else {
            this.f = str3;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof UserAgencyInfo)) {
            return false;
        }
        UserAgencyInfo userAgencyInfo = (UserAgencyInfo) obj;
        return this.f5688a == userAgencyInfo.f5688a && Intrinsics.d(this.b, userAgencyInfo.b) && Intrinsics.d(this.c, userAgencyInfo.c) && Intrinsics.d(this.d, userAgencyInfo.d) && Intrinsics.d(this.e, userAgencyInfo.e) && Intrinsics.d(this.f, userAgencyInfo.f);
    }

    public final int hashCode() {
        int iHashCode = this.f5688a.hashCode() * 31;
        Map map = this.b;
        int iHashCode2 = (iHashCode + (map == null ? 0 : map.hashCode())) * 31;
        Map map2 = this.c;
        int iE = nf1.e((iHashCode2 + (map2 == null ? 0 : map2.hashCode())) * 31, 31, this.d);
        String str = this.e;
        int iHashCode3 = (iE + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f;
        return iHashCode3 + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("UserAgencyInfo(status=");
        sb.append(this.f5688a);
        sb.append(", agencyFields=");
        sb.append(this.b);
        sb.append(", proofs=");
        sb.append(this.c);
        sb.append(", agency=");
        sb.append(this.d);
        sb.append(", city=");
        return r30.i(sb, this.e, ", passengerType=", this.f, ")");
    }

    public UserAgencyInfo(STATUS status, LinkedHashMap linkedHashMap, String agency) {
        Intrinsics.i(status, "status");
        Intrinsics.i(agency, "agency");
        this.f5688a = status;
        this.b = null;
        this.c = linkedHashMap;
        this.d = agency;
        this.e = null;
        this.f = null;
    }
}
