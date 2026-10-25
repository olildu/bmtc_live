package app.chalo.citydata.data.model.app;

import defpackage.cb0;
import defpackage.d41;
import defpackage.dd;
import defpackage.nf1;
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
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lapp/chalo/citydata/data/model/app/RouteStopsInfo;", "", "Companion", "$serializer", "framework-city-data_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@Serializable
public final /* data */ class RouteStopsInfo {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion();
    public static final Lazy[] i;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f1717a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;
    public final List g;
    public final List h;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/citydata/data/model/app/RouteStopsInfo$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lapp/chalo/citydata/data/model/app/RouteStopsInfo;", "serializer", "()Lkotlinx/serialization/KSerializer;", "framework-city-data_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public final KSerializer<RouteStopsInfo> serializer() {
            return RouteStopsInfo$$serializer.f1718a;
        }
    }

    static {
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
        i = new Lazy[]{null, null, null, null, null, null, LazyKt.a(lazyThreadSafetyMode, new d41(8)), LazyKt.a(lazyThreadSafetyMode, new d41(9))};
    }

    public /* synthetic */ RouteStopsInfo(String str, String str2, String str3, String str4, int i2, List list, List list2, String str5, String str6) {
        if (63 != (i2 & 63)) {
            PluginExceptionsKt.b(RouteStopsInfo$$serializer.f1718a.getDescriptor(), i2, 63);
            throw null;
        }
        this.f1717a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
        this.f = str6;
        if ((i2 & 64) == 0) {
            this.g = null;
        } else {
            this.g = list;
        }
        if ((i2 & 128) == 0) {
            this.h = null;
        } else {
            this.h = list2;
        }
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final List getG() {
        return this.g;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final List getH() {
        return this.h;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RouteStopsInfo)) {
            return false;
        }
        RouteStopsInfo routeStopsInfo = (RouteStopsInfo) obj;
        return Intrinsics.d(this.f1717a, routeStopsInfo.f1717a) && Intrinsics.d(this.b, routeStopsInfo.b) && Intrinsics.d(this.c, routeStopsInfo.c) && Intrinsics.d(this.d, routeStopsInfo.d) && Intrinsics.d(this.e, routeStopsInfo.e) && Intrinsics.d(this.f, routeStopsInfo.f) && Intrinsics.d(this.g, routeStopsInfo.g) && Intrinsics.d(this.h, routeStopsInfo.h);
    }

    public final int hashCode() {
        int iE = nf1.e(nf1.e(nf1.e(nf1.e(nf1.e(this.f1717a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e), 31, this.f);
        List list = this.g;
        int iHashCode = (iE + (list == null ? 0 : list.hashCode())) * 31;
        List list2 = this.h;
        return iHashCode + (list2 != null ? list2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbE = dd.e("RouteStopsInfo(routeId=", this.f1717a, ", routeName=", this.b, ", startStopId=");
        cb0.t(sbE, this.c, ", startStopName=", this.d, ", endStopId=");
        cb0.t(sbE, this.e, ", endStopName=", this.f, ", specialFeatures=");
        sbE.append(this.g);
        sbE.append(", spf=");
        sbE.append(this.h);
        sbE.append(")");
        return sbE.toString();
    }

    public RouteStopsInfo(String routeId, String routeName, String startStopId, String startStopName, String endStopId, String endStopName, ArrayList arrayList, ArrayList arrayList2) {
        Intrinsics.i(routeId, "routeId");
        Intrinsics.i(routeName, "routeName");
        Intrinsics.i(startStopId, "startStopId");
        Intrinsics.i(startStopName, "startStopName");
        Intrinsics.i(endStopId, "endStopId");
        Intrinsics.i(endStopName, "endStopName");
        this.f1717a = routeId;
        this.b = routeName;
        this.c = startStopId;
        this.d = startStopName;
        this.e = endStopId;
        this.f = endStopName;
        this.g = arrayList;
        this.h = arrayList2;
    }
}
