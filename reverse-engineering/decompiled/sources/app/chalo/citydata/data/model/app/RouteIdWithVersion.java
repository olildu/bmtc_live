package app.chalo.citydata.data.model.app;

import defpackage.hq0;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.internal.PluginExceptionsKt;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lapp/chalo/citydata/data/model/app/RouteIdWithVersion;", "", "Companion", "$serializer", "framework-city-data_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@Serializable
public final /* data */ class RouteIdWithVersion {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f1711a;
    public final String b;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/citydata/data/model/app/RouteIdWithVersion$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lapp/chalo/citydata/data/model/app/RouteIdWithVersion;", "serializer", "()Lkotlinx/serialization/KSerializer;", "framework-city-data_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public final KSerializer<RouteIdWithVersion> serializer() {
            return RouteIdWithVersion$$serializer.f1712a;
        }
    }

    public /* synthetic */ RouteIdWithVersion(int i, int i2, String str) {
        if (3 != (i & 3)) {
            PluginExceptionsKt.b(RouteIdWithVersion$$serializer.f1712a.getDescriptor(), i, 3);
            throw null;
        }
        this.f1711a = i2;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RouteIdWithVersion)) {
            return false;
        }
        RouteIdWithVersion routeIdWithVersion = (RouteIdWithVersion) obj;
        return this.f1711a == routeIdWithVersion.f1711a && Intrinsics.d(this.b, routeIdWithVersion.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f1711a * 31);
    }

    public final String toString() {
        return hq0.d(this.f1711a, "RouteIdWithVersion(version=", ", routeId=", this.b, ")");
    }

    public RouteIdWithVersion(int i, String routeId) {
        Intrinsics.i(routeId, "routeId");
        this.f1711a = i;
        this.b = routeId;
    }
}
