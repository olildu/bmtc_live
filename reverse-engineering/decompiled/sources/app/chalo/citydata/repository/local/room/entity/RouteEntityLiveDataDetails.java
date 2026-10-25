package app.chalo.citydata.repository.local.room.entity;

import defpackage.nf1;
import defpackage.vo1;
import defpackage.z40;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.internal.PluginExceptionsKt;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lapp/chalo/citydata/repository/local/room/entity/RouteEntityLiveDataDetails;", "", "Companion", "$serializer", "framework-city-data_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@Serializable
public final /* data */ class RouteEntityLiveDataDetails {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f1786a;
    public final boolean b;
    public final boolean c;
    public final boolean d;
    public final String e;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/citydata/repository/local/room/entity/RouteEntityLiveDataDetails$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lapp/chalo/citydata/repository/local/room/entity/RouteEntityLiveDataDetails;", "serializer", "()Lkotlinx/serialization/KSerializer;", "framework-city-data_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public final KSerializer<RouteEntityLiveDataDetails> serializer() {
            return RouteEntityLiveDataDetails$$serializer.f1787a;
        }
    }

    public /* synthetic */ RouteEntityLiveDataDetails(int i, String str, boolean z, boolean z2, boolean z3, boolean z4) {
        if (31 != (i & 31)) {
            PluginExceptionsKt.b(RouteEntityLiveDataDetails$$serializer.f1787a.getDescriptor(), i, 31);
            throw null;
        }
        this.f1786a = z;
        this.b = z2;
        this.c = z3;
        this.d = z4;
        this.e = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RouteEntityLiveDataDetails)) {
            return false;
        }
        RouteEntityLiveDataDetails routeEntityLiveDataDetails = (RouteEntityLiveDataDetails) obj;
        return this.f1786a == routeEntityLiveDataDetails.f1786a && this.b == routeEntityLiveDataDetails.b && this.c == routeEntityLiveDataDetails.c && this.d == routeEntityLiveDataDetails.d && Intrinsics.d(this.e, routeEntityLiveDataDetails.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + ((((((((this.f1786a ? 1231 : 1237) * 31) + (this.b ? 1231 : 1237)) * 31) + (this.c ? 1231 : 1237)) * 31) + (this.d ? 1231 : 1237)) * 31);
    }

    public final String toString() {
        StringBuilder sbR = nf1.r("RouteEntityLiveDataDetails(mTicketEnabled=", ", routePassEnabled=", ", isAirportRoute=", this.f1786a, this.b);
        z40.r(sbR, this.c, ", isPremiumBusRoute=", this.d, ", availabilityId=");
        return vo1.p(sbR, this.e, ")");
    }

    public RouteEntityLiveDataDetails(String availabilityId, boolean z, boolean z2, boolean z3, boolean z4) {
        Intrinsics.i(availabilityId, "availabilityId");
        this.f1786a = z;
        this.b = z2;
        this.c = z3;
        this.d = z4;
        this.e = availabilityId;
    }
}
