package app.chalo.citydata.data.model.mapper;

import app.chalo.citydata.data.model.app.LiveSeatAvailabilityApplicable;
import app.chalo.citydata.data.model.app.RouteAppModel;
import app.chalo.citydata.data.model.app.RouteLiveDetailsAppModel;
import app.chalo.citydata.data.model.app.RouteSpecialFeatureAppModel;
import app.chalo.citydata.data.model.app.RouteTiming;
import app.chalo.citydata.data.model.app.RouteTripTimingAppModel;
import app.chalo.citydata.data.model.app.ShortTripTimingAppModel;
import app.chalo.citydata.data.model.app.StopAppModel;
import app.chalo.citydata.data.model.app.TimeTableStatus;
import app.chalo.citydata.data.model.app.TrafficSignalAppModel;
import app.chalo.citydata.repository.local.room.entity.RoutEntityTimingModel;
import app.chalo.citydata.repository.local.room.entity.RouteEntity;
import app.chalo.citydata.repository.local.room.entity.RouteEntityDetailedData;
import app.chalo.citydata.repository.local.room.entity.RouteEntityLiveDataDetails;
import app.chalo.citydata.repository.local.room.entity.RouteEntityShortTripTimingModel;
import app.chalo.citydata.repository.local.room.entity.RouteEntityTimeTableWithFrequencyModel;
import app.chalo.citydata.repository.local.room.entity.RouteEntityTripTimingTableModel;
import app.chalo.citydata.repository.local.room.entity.RouteStopEntityModel;
import app.chalo.citydata.repository.local.room.entity.TrafficSignalEntityModel;
import app.chalo.location.LatLng;
import app.chalo.providers.cityprovider.impl.data.models.app.ChaloTransitMode;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"framework-city-data_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class AppToEntityKt {
    public static final RoutEntityTimingModel a(RouteTiming routeTiming) {
        Intrinsics.i(routeTiming, "<this>");
        if (routeTiming instanceof RouteTiming.FixedTiming) {
            RouteTiming.FixedTiming fixedTiming = (RouteTiming.FixedTiming) routeTiming;
            return new RoutEntityTimingModel(false, Long.valueOf(fixedTiming.e), null, fixedTiming.g);
        }
        if (!(routeTiming instanceof RouteTiming.FrequencyTiming)) {
            throw new NoWhenBranchMatchedException();
        }
        RouteTiming.FrequencyTiming frequencyTiming = (RouteTiming.FrequencyTiming) routeTiming;
        return new RoutEntityTimingModel(true, null, new RouteEntityTimeTableWithFrequencyModel(frequencyTiming.e, frequencyTiming.f, frequencyTiming.g), frequencyTiming.i);
    }

    public static final RouteEntity b(RouteAppModel routeAppModel, String cityName, long j, long j2) {
        int i;
        String str = "<this>";
        Intrinsics.i(routeAppModel, "<this>");
        Intrinsics.i(cityName, "cityName");
        int i2 = routeAppModel.f1709a;
        String str2 = routeAppModel.b;
        String str3 = routeAppModel.c;
        List list = routeAppModel.e;
        String str4 = ((StopAppModel) CollectionsKt.F(list)).b;
        String str5 = routeAppModel.h.b;
        String str6 = routeAppModel.j;
        List list2 = routeAppModel.n;
        ArrayList arrayList = new ArrayList(CollectionsKt.v(list2, 10));
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            arrayList.add(((RouteSpecialFeatureAppModel) it.next()).f1715a);
        }
        RouteLiveDetailsAppModel routeLiveDetailsAppModel = routeAppModel.p;
        Intrinsics.i(routeLiveDetailsAppModel, "<this>");
        RouteEntityLiveDataDetails routeEntityLiveDataDetails = new RouteEntityLiveDataDetails(routeLiveDetailsAppModel.e, routeLiveDetailsAppModel.f1713a, routeLiveDetailsAppModel.b, routeLiveDetailsAppModel.c, routeLiveDetailsAppModel.d);
        LiveSeatAvailabilityApplicable liveSeatAvailabilityApplicable = routeAppModel.o;
        if (Intrinsics.d(liveSeatAvailabilityApplicable, LiveSeatAvailabilityApplicable.No.INSTANCE)) {
            i = -1;
        } else {
            if (!(liveSeatAvailabilityApplicable instanceof LiveSeatAvailabilityApplicable.Yes)) {
                throw new NoWhenBranchMatchedException();
            }
            i = ((LiveSeatAvailabilityApplicable.Yes) liveSeatAvailabilityApplicable).c;
        }
        int i3 = i;
        RouteTripTimingAppModel routeTiming = routeAppModel.i;
        Intrinsics.i(routeTiming, "routeTiming");
        TimeTableStatus timeTableStatus = routeTiming.f1722a;
        int i4 = routeTiming.b;
        List list3 = routeTiming.c;
        ArrayList arrayList2 = new ArrayList(CollectionsKt.v(list3, 10));
        Iterator it2 = list3.iterator();
        while (it2.hasNext()) {
            ShortTripTimingAppModel shortTripTimingAppModel = (ShortTripTimingAppModel) it2.next();
            Intrinsics.i(shortTripTimingAppModel, "<this>");
            String str7 = shortTripTimingAppModel.f1724a;
            Iterator it3 = it2;
            String str8 = shortTripTimingAppModel.b;
            List list4 = shortTripTimingAppModel.c;
            String str9 = str2;
            String str10 = str3;
            String str11 = str4;
            ArrayList arrayList3 = new ArrayList(CollectionsKt.v(list4, 10));
            Iterator it4 = list4.iterator();
            while (it4.hasNext()) {
                arrayList3.add(a((RouteTiming) it4.next()));
            }
            arrayList2.add(new RouteEntityShortTripTimingModel(str8, str7, arrayList3));
            it2 = it3;
            str2 = str9;
            str3 = str10;
            str4 = str11;
        }
        String str12 = str2;
        String str13 = str3;
        String str14 = str4;
        List list5 = routeTiming.d;
        ArrayList arrayList4 = new ArrayList(CollectionsKt.v(list5, 10));
        Iterator it5 = list5.iterator();
        while (it5.hasNext()) {
            arrayList4.add(a((RouteTiming) it5.next()));
        }
        RouteEntityTripTimingTableModel routeEntityTripTimingTableModel = new RouteEntityTripTimingTableModel(timeTableStatus, i4, arrayList2, arrayList4);
        ChaloTransitMode chaloTransitMode = routeAppModel.d;
        List<StopAppModel> list6 = list;
        ArrayList arrayList5 = new ArrayList(CollectionsKt.v(list6, 10));
        for (StopAppModel stopAppModel : list6) {
            Intrinsics.i(stopAppModel, "<this>");
            String str15 = stopAppModel.f1727a;
            String str16 = stopAppModel.b;
            LatLng latLng = stopAppModel.c;
            arrayList5.add(new RouteStopEntityModel(str15, str16, latLng.f5134a, latLng.b, stopAppModel.d, stopAppModel.e));
            chaloTransitMode = chaloTransitMode;
            routeEntityTripTimingTableModel = routeEntityTripTimingTableModel;
        }
        RouteEntityTripTimingTableModel routeEntityTripTimingTableModel2 = routeEntityTripTimingTableModel;
        ChaloTransitMode chaloTransitMode2 = chaloTransitMode;
        boolean z = routeAppModel.k;
        boolean z2 = routeAppModel.l;
        String str17 = routeAppModel.m;
        boolean z3 = routeAppModel.q;
        List<TrafficSignalAppModel> list7 = routeAppModel.r;
        ArrayList arrayList6 = new ArrayList(CollectionsKt.v(list7, 10));
        for (TrafficSignalAppModel trafficSignalAppModel : list7) {
            Intrinsics.i(trafficSignalAppModel, str);
            String str18 = trafficSignalAppModel.f1729a;
            LatLng latLng2 = trafficSignalAppModel.b;
            arrayList6.add(new TrafficSignalEntityModel(str18, latLng2.f5134a, latLng2.b));
            str = str;
            z = z;
        }
        return new RouteEntity(i2, cityName, str12, str13, str14, str5, str6, arrayList, j2, j, routeEntityLiveDataDetails, new RouteEntityDetailedData(chaloTransitMode2, arrayList5, routeEntityTripTimingTableModel2, z, z2, str17, i3, z3, arrayList6), routeAppModel.s, routeAppModel.t);
    }
}
