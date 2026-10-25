package app.chalo.recent.database.entities;

import app.chalo.location.LatLng;
import app.chalo.providers.cityprovider.impl.data.models.app.ChaloTransitMode;
import defpackage.dd;
import defpackage.hz0;
import defpackage.i71;
import defpackage.n21;
import defpackage.nf1;
import defpackage.r30;
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
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lapp/chalo/recent/database/entities/RecentStopInfoEntity;", "", "Companion", "$serializer", "framework-city-data_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@Serializable
public final /* data */ class RecentStopInfoEntity {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion();
    public static final Lazy[] g = {null, null, null, LazyKt.a(LazyThreadSafetyMode.PUBLICATION, new hz0(29)), null, null};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f8947a;
    public final String b;
    public final LatLng c;
    public final ChaloTransitMode d;
    public final String e;
    public final String f;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/recent/database/entities/RecentStopInfoEntity$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lapp/chalo/recent/database/entities/RecentStopInfoEntity;", "serializer", "()Lkotlinx/serialization/KSerializer;", "framework-city-data_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public final KSerializer<RecentStopInfoEntity> serializer() {
            return RecentStopInfoEntity$$serializer.f8948a;
        }
    }

    public /* synthetic */ RecentStopInfoEntity(int i, String str, String str2, LatLng latLng, ChaloTransitMode chaloTransitMode, String str3, String str4) {
        if (63 != (i & 63)) {
            PluginExceptionsKt.b(RecentStopInfoEntity$$serializer.f8948a.getDescriptor(), i, 63);
            throw null;
        }
        this.f8947a = str;
        this.b = str2;
        this.c = latLng;
        this.d = chaloTransitMode;
        this.e = str3;
        this.f = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RecentStopInfoEntity)) {
            return false;
        }
        RecentStopInfoEntity recentStopInfoEntity = (RecentStopInfoEntity) obj;
        return Intrinsics.d(this.f8947a, recentStopInfoEntity.f8947a) && Intrinsics.d(this.b, recentStopInfoEntity.b) && Intrinsics.d(this.c, recentStopInfoEntity.c) && this.d == recentStopInfoEntity.d && Intrinsics.d(this.e, recentStopInfoEntity.e) && Intrinsics.d(this.f, recentStopInfoEntity.f);
    }

    public final int hashCode() {
        int iC = n21.c(this.d, i71.d(this.c, nf1.e(this.f8947a.hashCode() * 31, 31, this.b), 31), 31);
        String str = this.e;
        int iHashCode = (iC + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbE = dd.e("RecentStopInfoEntity(stopId=", this.f8947a, ", stopName=", this.b, ", stopLocation=");
        sbE.append(this.c);
        sbE.append(", transitMode=");
        sbE.append(this.d);
        sbE.append(", stopAddress=");
        return r30.i(sbE, this.e, ", partnerStopCode=", this.f, ")");
    }

    public RecentStopInfoEntity(String stopId, String stopName, LatLng stopLocation, ChaloTransitMode transitMode, String str, String str2) {
        Intrinsics.i(stopId, "stopId");
        Intrinsics.i(stopName, "stopName");
        Intrinsics.i(stopLocation, "stopLocation");
        Intrinsics.i(transitMode, "transitMode");
        this.f8947a = stopId;
        this.b = stopName;
        this.c = stopLocation;
        this.d = transitMode;
        this.e = str;
        this.f = str2;
    }
}
