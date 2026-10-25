package app.chalo.recent.database.entities;

import app.chalo.providers.cityprovider.impl.data.models.app.ChaloTransitMode;
import defpackage.cb0;
import defpackage.dd;
import defpackage.hz0;
import defpackage.n21;
import defpackage.nf1;
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
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lapp/chalo/recent/database/entities/RecentStopAndRouteBasedTripEntity;", "", "Companion", "$serializer", "framework-city-data_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@Serializable
public final /* data */ class RecentStopAndRouteBasedTripEntity {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion();
    public static final Lazy[] k = {null, null, null, null, null, null, null, LazyKt.a(LazyThreadSafetyMode.PUBLICATION, new hz0(28)), null, null};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f8943a;
    public final String b;
    public final String c;
    public final String d;
    public final RecentAdditionalRouteInfoEntity e;
    public final RecentStopInfoEntity f;
    public final RecentStopInfoEntity g;
    public final ChaloTransitMode h;
    public final long i;
    public final int j;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/recent/database/entities/RecentStopAndRouteBasedTripEntity$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lapp/chalo/recent/database/entities/RecentStopAndRouteBasedTripEntity;", "serializer", "()Lkotlinx/serialization/KSerializer;", "framework-city-data_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public final KSerializer<RecentStopAndRouteBasedTripEntity> serializer() {
            return RecentStopAndRouteBasedTripEntity$$serializer.f8944a;
        }
    }

    public /* synthetic */ RecentStopAndRouteBasedTripEntity(int i, String str, String str2, String str3, String str4, RecentAdditionalRouteInfoEntity recentAdditionalRouteInfoEntity, RecentStopInfoEntity recentStopInfoEntity, RecentStopInfoEntity recentStopInfoEntity2, ChaloTransitMode chaloTransitMode, long j, int i2) {
        if (255 != (i & 255)) {
            PluginExceptionsKt.b(RecentStopAndRouteBasedTripEntity$$serializer.f8944a.getDescriptor(), i, 255);
            throw null;
        }
        this.f8943a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = recentAdditionalRouteInfoEntity;
        this.f = recentStopInfoEntity;
        this.g = recentStopInfoEntity2;
        this.h = chaloTransitMode;
        if ((i & 256) == 0) {
            this.i = -1L;
        } else {
            this.i = j;
        }
        if ((i & 512) == 0) {
            this.j = 0;
        } else {
            this.j = i2;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RecentStopAndRouteBasedTripEntity)) {
            return false;
        }
        RecentStopAndRouteBasedTripEntity recentStopAndRouteBasedTripEntity = (RecentStopAndRouteBasedTripEntity) obj;
        return Intrinsics.d(this.f8943a, recentStopAndRouteBasedTripEntity.f8943a) && Intrinsics.d(this.b, recentStopAndRouteBasedTripEntity.b) && Intrinsics.d(this.c, recentStopAndRouteBasedTripEntity.c) && Intrinsics.d(this.d, recentStopAndRouteBasedTripEntity.d) && Intrinsics.d(this.e, recentStopAndRouteBasedTripEntity.e) && Intrinsics.d(this.f, recentStopAndRouteBasedTripEntity.f) && Intrinsics.d(this.g, recentStopAndRouteBasedTripEntity.g) && this.h == recentStopAndRouteBasedTripEntity.h && this.i == recentStopAndRouteBasedTripEntity.i && this.j == recentStopAndRouteBasedTripEntity.j;
    }

    public final int hashCode() {
        int iC = n21.c(this.h, (this.g.hashCode() + ((this.f.hashCode() + ((this.e.hashCode() + nf1.e(nf1.e(nf1.e(this.f8943a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d)) * 31)) * 31)) * 31, 31);
        long j = this.i;
        return ((iC + ((int) (j ^ (j >>> 32)))) * 31) + this.j;
    }

    public final String toString() {
        StringBuilder sbE = dd.e("RecentStopAndRouteBasedTripEntity(id=", this.f8943a, ", cityId=", this.b, ", routeId=");
        cb0.t(sbE, this.c, ", routeName=", this.d, ", additionRouteInfo=");
        sbE.append(this.e);
        sbE.append(", originStop=");
        sbE.append(this.f);
        sbE.append(", destinationStop=");
        sbE.append(this.g);
        sbE.append(", transitMode=");
        sbE.append(this.h);
        sbE.append(", accessTime=");
        sbE.append(this.i);
        sbE.append(", accessCount=");
        sbE.append(this.j);
        sbE.append(")");
        return sbE.toString();
    }

    public RecentStopAndRouteBasedTripEntity(String id, String cityId, String routeId, String routeName, RecentAdditionalRouteInfoEntity additionRouteInfo, RecentStopInfoEntity originStop, RecentStopInfoEntity destinationStop, ChaloTransitMode transitMode, long j, int i) {
        Intrinsics.i(id, "id");
        Intrinsics.i(cityId, "cityId");
        Intrinsics.i(routeId, "routeId");
        Intrinsics.i(routeName, "routeName");
        Intrinsics.i(additionRouteInfo, "additionRouteInfo");
        Intrinsics.i(originStop, "originStop");
        Intrinsics.i(destinationStop, "destinationStop");
        Intrinsics.i(transitMode, "transitMode");
        this.f8943a = id;
        this.b = cityId;
        this.c = routeId;
        this.d = routeName;
        this.e = additionRouteInfo;
        this.f = originStop;
        this.g = destinationStop;
        this.h = transitMode;
        this.i = j;
        this.j = i;
    }
}
