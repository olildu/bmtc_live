package app.chalo.citydata.data.model.app;

import app.chalo.providers.RouteNamingSchemeType;
import app.chalo.providers.cityprovider.impl.data.models.app.ChaloTransitMode;
import defpackage.cb0;
import defpackage.hq0;
import defpackage.n21;
import defpackage.nf1;
import defpackage.pk0;
import defpackage.r30;
import defpackage.y21;
import defpackage.z40;
import java.util.Iterator;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.internal.PluginExceptionsKt;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lapp/chalo/citydata/data/model/app/RouteAppModel;", "", "Companion", "$serializer", "framework-city-data_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@Serializable
public final /* data */ class RouteAppModel {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion();
    public static final Lazy[] u;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f1709a;
    public final String b;
    public final String c;
    public final ChaloTransitMode d;
    public final List e;
    public final String f;
    public final String g;
    public final StopAppModel h;
    public final RouteTripTimingAppModel i;
    public final String j;
    public final boolean k;
    public final boolean l;
    public final String m;
    public final List n;
    public final LiveSeatAvailabilityApplicable o;
    public final RouteLiveDetailsAppModel p;
    public final boolean q;
    public final List r;
    public final String s;
    public final RouteNamingSchemeType t;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/citydata/data/model/app/RouteAppModel$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lapp/chalo/citydata/data/model/app/RouteAppModel;", "serializer", "()Lkotlinx/serialization/KSerializer;", "framework-city-data_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public final KSerializer<RouteAppModel> serializer() {
            return RouteAppModel$$serializer.f1710a;
        }
    }

    static {
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
        u = new Lazy[]{null, null, null, LazyKt.a(lazyThreadSafetyMode, new y21(5)), LazyKt.a(lazyThreadSafetyMode, new y21(6)), null, null, null, null, null, null, null, null, LazyKt.a(lazyThreadSafetyMode, new y21(7)), LazyKt.a(lazyThreadSafetyMode, new y21(8)), null, null, LazyKt.a(lazyThreadSafetyMode, new y21(9)), null, LazyKt.a(lazyThreadSafetyMode, new y21(10))};
    }

    public RouteAppModel(int i, int i2, String str, String str2, ChaloTransitMode chaloTransitMode, List list, String str3, String str4, StopAppModel stopAppModel, RouteTripTimingAppModel routeTripTimingAppModel, String str5, boolean z, boolean z2, String str6, List list2, LiveSeatAvailabilityApplicable liveSeatAvailabilityApplicable, RouteLiveDetailsAppModel routeLiveDetailsAppModel, boolean z3, List list3, String str7, RouteNamingSchemeType routeNamingSchemeType) {
        if (130975 != (i & 130975)) {
            PluginExceptionsKt.b(RouteAppModel$$serializer.f1710a.getDescriptor(), i, 130975);
            throw null;
        }
        this.f1709a = i2;
        this.b = str;
        this.c = str2;
        this.d = chaloTransitMode;
        this.e = list;
        if ((i & 32) == 0) {
            this.f = null;
        } else {
            this.f = str3;
        }
        if ((i & 64) == 0) {
            this.g = null;
        } else {
            this.g = str4;
        }
        this.h = stopAppModel;
        this.i = routeTripTimingAppModel;
        this.j = str5;
        this.k = z;
        this.l = z2;
        this.m = str6;
        this.n = list2;
        this.o = liveSeatAvailabilityApplicable;
        this.p = routeLiveDetailsAppModel;
        this.q = z3;
        this.r = (131072 & i) == 0 ? EmptyList.f17557a : list3;
        if ((262144 & i) == 0) {
            this.s = null;
        } else {
            this.s = str7;
        }
        this.t = (i & 524288) == 0 ? RouteNamingSchemeType.DEFAULT : routeNamingSchemeType;
    }

    public final StopAppModel a(String stopId) {
        Object next;
        Intrinsics.i(stopId, "stopId");
        Iterator it = this.e.iterator();
        while (it.hasNext()) {
            next = it.next();
            if (Intrinsics.d(((StopAppModel) next).f1727a, stopId)) {
                return (StopAppModel) next;
            }
        }
        next = null;
        return (StopAppModel) next;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RouteAppModel)) {
            return false;
        }
        RouteAppModel routeAppModel = (RouteAppModel) obj;
        return this.f1709a == routeAppModel.f1709a && Intrinsics.d(this.b, routeAppModel.b) && Intrinsics.d(this.c, routeAppModel.c) && this.d == routeAppModel.d && Intrinsics.d(this.e, routeAppModel.e) && Intrinsics.d(this.f, routeAppModel.f) && Intrinsics.d(this.g, routeAppModel.g) && Intrinsics.d(this.h, routeAppModel.h) && Intrinsics.d(this.i, routeAppModel.i) && Intrinsics.d(this.j, routeAppModel.j) && this.k == routeAppModel.k && this.l == routeAppModel.l && Intrinsics.d(this.m, routeAppModel.m) && Intrinsics.d(this.n, routeAppModel.n) && Intrinsics.d(this.o, routeAppModel.o) && Intrinsics.d(this.p, routeAppModel.p) && this.q == routeAppModel.q && Intrinsics.d(this.r, routeAppModel.r) && Intrinsics.d(this.s, routeAppModel.s) && this.t == routeAppModel.t;
    }

    public final int hashCode() {
        int iB = r30.b(n21.c(this.d, nf1.e(nf1.e(this.f1709a * 31, 31, this.b), 31, this.c), 31), 31, this.e);
        String str = this.f;
        int iHashCode = (iB + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.g;
        int iB2 = r30.b((((this.p.hashCode() + ((this.o.hashCode() + r30.b(nf1.e((((nf1.e((this.i.hashCode() + n21.b(this.h, (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31, 31)) * 31, 31, this.j) + (this.k ? 1231 : 1237)) * 31) + (this.l ? 1231 : 1237)) * 31, 31, this.m), 31, this.n)) * 31)) * 31) + (this.q ? 1231 : 1237)) * 31, 31, this.r);
        String str3 = this.s;
        return this.t.hashCode() + ((iB2 + (str3 != null ? str3.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder sbP = nf1.p(this.f1709a, "RouteAppModel(version=", ", routeId=", this.b, ", routeName=");
        sbP.append(this.c);
        sbP.append(", transitMode=");
        sbP.append(this.d);
        sbP.append(", stopsList=");
        cb0.s(", fromStopName=", this.f, ", endStopName=", sbP, this.e);
        sbP.append(this.g);
        sbP.append(", endStop=");
        sbP.append(this.h);
        sbP.append(", routeTiming=");
        sbP.append(this.i);
        sbP.append(", agencyName=");
        sbP.append(this.j);
        sbP.append(", isFreeRideAvailable=");
        z40.r(sbP, this.k, ", isRouteDisrupted=", this.l, ", mapPolyLineString=");
        pk0.w(this.m, ", specialFeature=", ", liveSeatAvailabilityApplicable=", sbP, this.n);
        sbP.append(this.o);
        sbP.append(", routeLiveDetails=");
        sbP.append(this.p);
        sbP.append(", isShortTripAvailable=");
        hq0.w(sbP, this.q, ", trafficSignalLocationsOnRouteList=", this.r, ", via=");
        sbP.append(this.s);
        sbP.append(", routeNamingSchemeType=");
        sbP.append(this.t);
        sbP.append(")");
        return sbP.toString();
    }

    public RouteAppModel(int i, String routeId, String routeName, ChaloTransitMode transitMode, List stopsList, String str, String str2, StopAppModel endStop, RouteTripTimingAppModel routeTripTimingAppModel, String agencyName, boolean z, boolean z2, String mapPolyLineString, List specialFeature, LiveSeatAvailabilityApplicable liveSeatAvailabilityApplicable, RouteLiveDetailsAppModel routeLiveDetails, boolean z3, List trafficSignalLocationsOnRouteList, String str3, RouteNamingSchemeType routeNamingSchemeType) {
        Intrinsics.i(routeId, "routeId");
        Intrinsics.i(routeName, "routeName");
        Intrinsics.i(transitMode, "transitMode");
        Intrinsics.i(stopsList, "stopsList");
        Intrinsics.i(endStop, "endStop");
        Intrinsics.i(agencyName, "agencyName");
        Intrinsics.i(mapPolyLineString, "mapPolyLineString");
        Intrinsics.i(specialFeature, "specialFeature");
        Intrinsics.i(liveSeatAvailabilityApplicable, "liveSeatAvailabilityApplicable");
        Intrinsics.i(routeLiveDetails, "routeLiveDetails");
        Intrinsics.i(trafficSignalLocationsOnRouteList, "trafficSignalLocationsOnRouteList");
        Intrinsics.i(routeNamingSchemeType, "routeNamingSchemeType");
        this.f1709a = i;
        this.b = routeId;
        this.c = routeName;
        this.d = transitMode;
        this.e = stopsList;
        this.f = str;
        this.g = str2;
        this.h = endStop;
        this.i = routeTripTimingAppModel;
        this.j = agencyName;
        this.k = z;
        this.l = z2;
        this.m = mapPolyLineString;
        this.n = specialFeature;
        this.o = liveSeatAvailabilityApplicable;
        this.p = routeLiveDetails;
        this.q = z3;
        this.r = trafficSignalLocationsOnRouteList;
        this.s = str3;
        this.t = routeNamingSchemeType;
    }

    public RouteAppModel(int i, String str, String str2, ChaloTransitMode chaloTransitMode, List list, String str3, String str4, StopAppModel stopAppModel, RouteTripTimingAppModel routeTripTimingAppModel, String str5, boolean z, boolean z2, String str6, List list2, LiveSeatAvailabilityApplicable liveSeatAvailabilityApplicable, RouteLiveDetailsAppModel routeLiveDetailsAppModel, boolean z3, List list3, String str7, RouteNamingSchemeType routeNamingSchemeType, int i2) {
        this(i, str, str2, chaloTransitMode, list, (i2 & 32) != 0 ? null : str3, (i2 & 64) != 0 ? null : str4, stopAppModel, routeTripTimingAppModel, str5, z, z2, str6, list2, liveSeatAvailabilityApplicable, routeLiveDetailsAppModel, z3, (i2 & 131072) != 0 ? EmptyList.f17557a : list3, str7, routeNamingSchemeType);
    }
}
