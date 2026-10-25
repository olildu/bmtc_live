package app.chalo.data;

import defpackage.pk0;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lapp/chalo/data/RecentsCacheProperties;", "", "Companion", "$serializer", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@Serializable
public final /* data */ class RecentsCacheProperties {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Integer f2394a;
    public final Integer b;
    public final Integer c;
    public final Integer d;
    public final Integer e;
    public final Integer f;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/data/RecentsCacheProperties$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lapp/chalo/data/RecentsCacheProperties;", "serializer", "()Lkotlinx/serialization/KSerializer;", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public final KSerializer<RecentsCacheProperties> serializer() {
            return RecentsCacheProperties$$serializer.f2395a;
        }
    }

    public /* synthetic */ RecentsCacheProperties(int i, Integer num, Integer num2, Integer num3, Integer num4, Integer num5, Integer num6) {
        if ((i & 1) == 0) {
            this.f2394a = null;
        } else {
            this.f2394a = num;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = num2;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = num3;
        }
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = num4;
        }
        if ((i & 16) == 0) {
            this.e = null;
        } else {
            this.e = num5;
        }
        if ((i & 32) == 0) {
            this.f = null;
        } else {
            this.f = num6;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RecentsCacheProperties)) {
            return false;
        }
        RecentsCacheProperties recentsCacheProperties = (RecentsCacheProperties) obj;
        return Intrinsics.d(this.f2394a, recentsCacheProperties.f2394a) && Intrinsics.d(this.b, recentsCacheProperties.b) && Intrinsics.d(this.c, recentsCacheProperties.c) && Intrinsics.d(this.d, recentsCacheProperties.d) && Intrinsics.d(this.e, recentsCacheProperties.e) && Intrinsics.d(this.f, recentsCacheProperties.f);
    }

    public final int hashCode() {
        Integer num = this.f2394a;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        Integer num2 = this.b;
        int iHashCode2 = (iHashCode + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.c;
        int iHashCode3 = (iHashCode2 + (num3 == null ? 0 : num3.hashCode())) * 31;
        Integer num4 = this.d;
        int iHashCode4 = (iHashCode3 + (num4 == null ? 0 : num4.hashCode())) * 31;
        Integer num5 = this.e;
        int iHashCode5 = (iHashCode4 + (num5 == null ? 0 : num5.hashCode())) * 31;
        Integer num6 = this.f;
        return iHashCode5 + (num6 != null ? num6.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("RecentsCacheProperties(maxRecentStops=");
        sb.append(this.f2394a);
        sb.append(", maxRecentRoutes=");
        sb.append(this.b);
        sb.append(", maxRecentPlaces=");
        pk0.y(sb, this.c, ", maxRecentTrips=", this.d, ", maxRecentStopBasedTrips=");
        sb.append(this.e);
        sb.append(", maxRecentLocationPairTrips=");
        sb.append(this.f);
        sb.append(")");
        return sb.toString();
    }
}
