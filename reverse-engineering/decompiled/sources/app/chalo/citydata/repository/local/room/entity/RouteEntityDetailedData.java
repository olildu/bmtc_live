package app.chalo.citydata.repository.local.room.entity;

import app.chalo.providers.cityprovider.impl.data.models.app.ChaloTransitMode;
import defpackage.nf1;
import defpackage.pk0;
import defpackage.r30;
import defpackage.xs;
import defpackage.y21;
import java.util.ArrayList;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.internal.PluginExceptionsKt;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lapp/chalo/citydata/repository/local/room/entity/RouteEntityDetailedData;", "", "Companion", "$serializer", "framework-city-data_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@Serializable
public final /* data */ class RouteEntityDetailedData {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion();
    public static final Lazy[] j;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ChaloTransitMode f1784a;
    public final List b;
    public final RouteEntityTripTimingTableModel c;
    public final boolean d;
    public final boolean e;
    public final String f;
    public final int g;
    public final boolean h;
    public final List i;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/citydata/repository/local/room/entity/RouteEntityDetailedData$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lapp/chalo/citydata/repository/local/room/entity/RouteEntityDetailedData;", "serializer", "()Lkotlinx/serialization/KSerializer;", "framework-city-data_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public final KSerializer<RouteEntityDetailedData> serializer() {
            return RouteEntityDetailedData$$serializer.f1785a;
        }
    }

    static {
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
        j = new Lazy[]{LazyKt.a(lazyThreadSafetyMode, new y21(22)), LazyKt.a(lazyThreadSafetyMode, new y21(23)), null, null, null, null, null, null, LazyKt.a(lazyThreadSafetyMode, new y21(24))};
    }

    public /* synthetic */ RouteEntityDetailedData(int i, ChaloTransitMode chaloTransitMode, List list, RouteEntityTripTimingTableModel routeEntityTripTimingTableModel, boolean z, boolean z2, String str, int i2, boolean z3, List list2) {
        if (255 != (i & 255)) {
            PluginExceptionsKt.b(RouteEntityDetailedData$$serializer.f1785a.getDescriptor(), i, 255);
            throw null;
        }
        this.f1784a = chaloTransitMode;
        this.b = list;
        this.c = routeEntityTripTimingTableModel;
        this.d = z;
        this.e = z2;
        this.f = str;
        this.g = i2;
        this.h = z3;
        if ((i & 256) == 0) {
            this.i = null;
        } else {
            this.i = list2;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RouteEntityDetailedData)) {
            return false;
        }
        RouteEntityDetailedData routeEntityDetailedData = (RouteEntityDetailedData) obj;
        return this.f1784a == routeEntityDetailedData.f1784a && Intrinsics.d(this.b, routeEntityDetailedData.b) && Intrinsics.d(this.c, routeEntityDetailedData.c) && this.d == routeEntityDetailedData.d && this.e == routeEntityDetailedData.e && Intrinsics.d(this.f, routeEntityDetailedData.f) && this.g == routeEntityDetailedData.g && this.h == routeEntityDetailedData.h && Intrinsics.d(this.i, routeEntityDetailedData.i);
    }

    public final int hashCode() {
        int iE = (((nf1.e((((((this.c.hashCode() + r30.b(this.f1784a.hashCode() * 31, 31, this.b)) * 31) + (this.d ? 1231 : 1237)) * 31) + (this.e ? 1231 : 1237)) * 31, 31, this.f) + this.g) * 31) + (this.h ? 1231 : 1237)) * 31;
        List list = this.i;
        return iE + (list == null ? 0 : list.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("RouteEntityDetailedData(transitMode=");
        sb.append(this.f1784a);
        sb.append(", stopsList=");
        sb.append(this.b);
        sb.append(", routeTiming=");
        sb.append(this.c);
        sb.append(", isFreeRideAvailable=");
        sb.append(this.d);
        sb.append(", isRouteDisrupted=");
        pk0.x(", mapPolyLineString=", this.f, ", liveSeatAvailabilityId=", sb, this.e);
        sb.append(this.g);
        sb.append(", isShortTripAvailable=");
        sb.append(this.h);
        sb.append(", trafficSignalLocationsOnRouteList=");
        return xs.l(sb, this.i, ")");
    }

    public RouteEntityDetailedData(ChaloTransitMode transitMode, ArrayList arrayList, RouteEntityTripTimingTableModel routeEntityTripTimingTableModel, boolean z, boolean z2, String mapPolyLineString, int i, boolean z3, ArrayList arrayList2) {
        Intrinsics.i(transitMode, "transitMode");
        Intrinsics.i(mapPolyLineString, "mapPolyLineString");
        this.f1784a = transitMode;
        this.b = arrayList;
        this.c = routeEntityTripTimingTableModel;
        this.d = z;
        this.e = z2;
        this.f = mapPolyLineString;
        this.g = i;
        this.h = z3;
        this.i = arrayList2;
    }
}
