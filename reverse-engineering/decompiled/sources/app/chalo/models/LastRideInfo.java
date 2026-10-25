package app.chalo.models;

import defpackage.dd;
import defpackage.t10;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lapp/chalo/models/LastRideInfo;", "", "Companion", "$serializer", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@Serializable
public final /* data */ class LastRideInfo {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f5584a;
    public final String b;
    public final long c;
    public final long d;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/models/LastRideInfo$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lapp/chalo/models/LastRideInfo;", "serializer", "()Lkotlinx/serialization/KSerializer;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public final KSerializer<LastRideInfo> serializer() {
            return LastRideInfo$$serializer.f5585a;
        }
    }

    public /* synthetic */ LastRideInfo(long j, String str, String str2, long j2, int i) {
        if ((i & 1) == 0) {
            this.f5584a = null;
        } else {
            this.f5584a = str;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = str2;
        }
        if ((i & 4) == 0) {
            this.c = 0L;
        } else {
            this.c = j;
        }
        if ((i & 8) == 0) {
            this.d = 0L;
        } else {
            this.d = j2;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LastRideInfo)) {
            return false;
        }
        LastRideInfo lastRideInfo = (LastRideInfo) obj;
        return Intrinsics.d(this.f5584a, lastRideInfo.f5584a) && Intrinsics.d(this.b, lastRideInfo.b) && this.c == lastRideInfo.c && this.d == lastRideInfo.d;
    }

    public final int hashCode() {
        String str = this.f5584a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.b;
        int iHashCode2 = str2 != null ? str2.hashCode() : 0;
        long j = this.c;
        int i = (((iHashCode + iHashCode2) * 31) + ((int) (j ^ (j >>> 32)))) * 31;
        long j2 = this.d;
        return i + ((int) (j2 ^ (j2 >>> 32)));
    }

    public final String toString() {
        StringBuilder sbE = dd.e("LastRideInfo(bookingId=", this.f5584a, ", productType=", this.b, ", activationTimeStamp=");
        sbE.append(this.c);
        return t10.g(this.d, ", activationDuration=", ")", sbE);
    }

    public LastRideInfo(String str, String str2, long j, long j2) {
        this.f5584a = str;
        this.b = str2;
        this.c = j;
        this.d = j2;
    }
}
