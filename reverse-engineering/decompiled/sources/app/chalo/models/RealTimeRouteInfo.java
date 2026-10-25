package app.chalo.models;

import defpackage.cb0;
import defpackage.dd;
import defpackage.hz0;
import defpackage.nf1;
import defpackage.r30;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.internal.PluginExceptionsKt;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002\u0082\u0001\u0001\u0004¨\u0006\u0005"}, d2 = {"Lapp/chalo/models/RealTimeRouteInfo;", "", "Companion", "GeoRealTimeInfo", "Lapp/chalo/models/RealTimeRouteInfo$GeoRealTimeInfo;", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@Serializable
public abstract class RealTimeRouteInfo {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Object f5594a = LazyKt.a(LazyThreadSafetyMode.PUBLICATION, new hz0(12));

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/models/RealTimeRouteInfo$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lapp/chalo/models/RealTimeRouteInfo;", "serializer", "()Lkotlinx/serialization/KSerializer;", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
        public final KSerializer<RealTimeRouteInfo> serializer() {
            return (KSerializer) RealTimeRouteInfo.f5594a.getValue();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lapp/chalo/models/RealTimeRouteInfo$GeoRealTimeInfo;", "Lapp/chalo/models/RealTimeRouteInfo;", "Companion", "$serializer", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    @Serializable
    public static final /* data */ class GeoRealTimeInfo extends RealTimeRouteInfo {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion();
        public final String b;
        public final String c;
        public final String d;
        public final String e;
        public final String f;
        public final String g;
        public final String h;
        public final String i;

        /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/models/RealTimeRouteInfo$GeoRealTimeInfo$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lapp/chalo/models/RealTimeRouteInfo$GeoRealTimeInfo;", "serializer", "()Lkotlinx/serialization/KSerializer;", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class Companion {
            public final KSerializer<GeoRealTimeInfo> serializer() {
                return RealTimeRouteInfo$GeoRealTimeInfo$$serializer.f5595a;
            }
        }

        public /* synthetic */ GeoRealTimeInfo(int i, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8) {
            if (255 != (i & 255)) {
                PluginExceptionsKt.b(RealTimeRouteInfo$GeoRealTimeInfo$$serializer.f5595a.getDescriptor(), i, 255);
                throw null;
            }
            this.b = str;
            this.c = str2;
            this.d = str3;
            this.e = str4;
            this.f = str5;
            this.g = str6;
            this.h = str7;
            this.i = str8;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof GeoRealTimeInfo)) {
                return false;
            }
            GeoRealTimeInfo geoRealTimeInfo = (GeoRealTimeInfo) obj;
            return Intrinsics.d(this.b, geoRealTimeInfo.b) && Intrinsics.d(this.c, geoRealTimeInfo.c) && Intrinsics.d(this.d, geoRealTimeInfo.d) && Intrinsics.d(this.e, geoRealTimeInfo.e) && Intrinsics.d(this.f, geoRealTimeInfo.f) && Intrinsics.d(this.g, geoRealTimeInfo.g) && Intrinsics.d(this.h, geoRealTimeInfo.h) && Intrinsics.d(this.i, geoRealTimeInfo.i);
        }

        public final int hashCode() {
            int iE = nf1.e(nf1.e(nf1.e(nf1.e(nf1.e(nf1.e(this.b.hashCode() * 31, 31, this.c), 31, this.d), 31, this.e), 31, this.f), 31, this.g), 31, this.h);
            String str = this.i;
            return iE + (str == null ? 0 : str.hashCode());
        }

        public final String toString() {
            StringBuilder sbE = dd.e("GeoRealTimeInfo(streamId=", this.b, ", routeId=", this.c, ", routeName=");
            cb0.t(sbE, this.d, ", fromName=", this.e, ", toName=");
            cb0.t(sbE, this.f, ", mode=", this.g, ", agency=");
            return r30.i(sbE, this.h, ", vehicleId=", this.i, ")");
        }

        public GeoRealTimeInfo(String streamId, String routeId, String routeName, String fromName, String toName, String mode, String agency, String str) {
            Intrinsics.i(streamId, "streamId");
            Intrinsics.i(routeId, "routeId");
            Intrinsics.i(routeName, "routeName");
            Intrinsics.i(fromName, "fromName");
            Intrinsics.i(toName, "toName");
            Intrinsics.i(mode, "mode");
            Intrinsics.i(agency, "agency");
            this.b = streamId;
            this.c = routeId;
            this.d = routeName;
            this.e = fromName;
            this.f = toName;
            this.g = mode;
            this.h = agency;
            this.i = str;
        }
    }
}
