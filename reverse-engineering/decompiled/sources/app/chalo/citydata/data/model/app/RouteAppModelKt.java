package app.chalo.citydata.data.model.app;

import app.chalo.providers.RouteNamingSchemeType;
import app.chalo.providers.cityprovider.impl.data.models.app.ChaloTransitMode;
import app.chalo.recent.model.app.RecentRouteAppModel;
import app.chalo.recent.model.app.RecentsSpecialStatus;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"framework-city-data_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class RouteAppModelKt {
    public static final RecentRouteAppModel a(RouteAppModel routeAppModel, String str, RecentsSpecialStatus recentSpecialStatus) {
        Intrinsics.i(routeAppModel, "<this>");
        Intrinsics.i(recentSpecialStatus, "recentSpecialStatus");
        String str2 = routeAppModel.b;
        String str3 = routeAppModel.c;
        List list = routeAppModel.e;
        String str4 = ((StopAppModel) CollectionsKt.F(list)).b;
        String str5 = ((StopAppModel) CollectionsKt.P(list)).b;
        String str6 = routeAppModel.j;
        List list2 = routeAppModel.n;
        boolean zContains = list2.contains(new RouteSpecialFeatureAppModel("AC", RouteSpecialFeatureType.LEGACY));
        List list3 = list2;
        ArrayList arrayList = new ArrayList(CollectionsKt.v(list3, 10));
        Iterator it = list3.iterator();
        while (it.hasNext()) {
            arrayList.add(((RouteSpecialFeatureAppModel) it.next()).f1715a);
        }
        return new RecentRouteAppModel(str2, str, str3, str4, str5, str6, zContains, arrayList, routeAppModel.k, recentSpecialStatus, 0L, routeAppModel.s, routeAppModel.t, 6656);
    }

    public static final RouteAppModel b(RouteAppModel routeAppModel, int i) {
        RouteTripTimingAppModel routeTripTimingAppModel = routeAppModel.i;
        List list = routeTripTimingAppModel.d;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (((RouteTiming) obj).c.charAt(i) == '1') {
                arrayList.add(obj);
            }
        }
        List<ShortTripTimingAppModel> list2 = routeTripTimingAppModel.c;
        ArrayList arrayList2 = new ArrayList(CollectionsKt.v(list2, 10));
        for (ShortTripTimingAppModel shortTripTimingAppModel : list2) {
            List list3 = shortTripTimingAppModel.c;
            ArrayList arrayList3 = new ArrayList();
            for (Object obj2 : list3) {
                if (((RouteTiming) obj2).c.charAt(i) == '1') {
                    arrayList3.add(obj2);
                }
            }
            String startStopId = shortTripTimingAppModel.f1724a;
            String endStopId = shortTripTimingAppModel.b;
            Intrinsics.i(startStopId, "startStopId");
            Intrinsics.i(endStopId, "endStopId");
            arrayList2.add(new ShortTripTimingAppModel(startStopId, endStopId, arrayList3));
        }
        TimeTableStatus timeTableStatus = routeTripTimingAppModel.f1722a;
        int i2 = routeTripTimingAppModel.b;
        Intrinsics.i(timeTableStatus, "timeTableStatus");
        RouteTripTimingAppModel routeTripTimingAppModel2 = new RouteTripTimingAppModel(timeTableStatus, i2, arrayList2, arrayList);
        int i3 = routeAppModel.f1709a;
        String routeId = routeAppModel.b;
        String routeName = routeAppModel.c;
        ChaloTransitMode transitMode = routeAppModel.d;
        List stopsList = routeAppModel.e;
        String str = routeAppModel.f;
        String str2 = routeAppModel.g;
        StopAppModel endStop = routeAppModel.h;
        String agencyName = routeAppModel.j;
        boolean z = routeAppModel.k;
        boolean z2 = routeAppModel.l;
        String mapPolyLineString = routeAppModel.m;
        List specialFeature = routeAppModel.n;
        LiveSeatAvailabilityApplicable liveSeatAvailabilityApplicable = routeAppModel.o;
        RouteLiveDetailsAppModel routeLiveDetails = routeAppModel.p;
        boolean z3 = routeAppModel.q;
        List trafficSignalLocationsOnRouteList = routeAppModel.r;
        String str3 = routeAppModel.s;
        RouteNamingSchemeType routeNamingSchemeType = routeAppModel.t;
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
        return new RouteAppModel(i3, routeId, routeName, transitMode, stopsList, str, str2, endStop, routeTripTimingAppModel2, agencyName, z, z2, mapPolyLineString, specialFeature, liveSeatAvailabilityApplicable, routeLiveDetails, z3, trafficSignalLocationsOnRouteList, str3, routeNamingSchemeType);
    }
}
