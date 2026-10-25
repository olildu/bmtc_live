package app.chalo.citydata.data.model.mapper;

import app.chalo.citydata.data.model.app.LiveSeatAvailabilityApplicable;
import app.chalo.citydata.data.model.app.RouteAppModel;
import app.chalo.citydata.data.model.app.RouteLiveDetailsAppModel;
import app.chalo.citydata.data.model.app.RouteSpecialFeatureAppModel;
import app.chalo.citydata.data.model.app.RouteSpecialFeatureType;
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
import app.chalo.providers.RouteNamingSchemeType;
import app.chalo.providers.cityprovider.impl.data.models.app.ChaloTransitMode;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"framework-city-data_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class EntityToAppKt {
    public static final RouteAppModel a(RouteEntity routeEntity) {
        String str;
        boolean z;
        String str2;
        LiveSeatAvailabilityApplicable liveSeatAvailabilityApplicable;
        ArrayList arrayList;
        List list;
        String str3 = "<this>";
        Intrinsics.i(routeEntity, "<this>");
        RouteEntityDetailedData routeEntityDetailedData = routeEntity.l;
        int i = routeEntity.f1783a;
        String str4 = routeEntity.c;
        String str5 = routeEntity.d;
        ChaloTransitMode chaloTransitMode = routeEntityDetailedData.f1784a;
        List list2 = routeEntityDetailedData.b;
        List list3 = list2;
        ArrayList arrayList2 = new ArrayList(CollectionsKt.v(list3, 10));
        Iterator it = list3.iterator();
        while (it.hasNext()) {
            arrayList2.add(c((RouteStopEntityModel) it.next()));
        }
        StopAppModel stopAppModelC = c((RouteStopEntityModel) CollectionsKt.P(list2));
        RouteEntityTripTimingTableModel routeEntityTripTimingTableModel = routeEntityDetailedData.c;
        Intrinsics.i(routeEntityTripTimingTableModel, "<this>");
        TimeTableStatus timeTableStatus = routeEntityTripTimingTableModel.f1792a;
        int i2 = routeEntityTripTimingTableModel.b;
        List list4 = routeEntityTripTimingTableModel.d;
        ArrayList arrayList3 = new ArrayList(CollectionsKt.v(list4, 10));
        Iterator it2 = list4.iterator();
        while (it2.hasNext()) {
            arrayList3.add(b((RoutEntityTimingModel) it2.next()));
        }
        List list5 = routeEntityTripTimingTableModel.c;
        ArrayList arrayList4 = new ArrayList(CollectionsKt.v(list5, 10));
        Iterator it3 = list5.iterator();
        while (it3.hasNext()) {
            RouteEntityShortTripTimingModel routeEntityShortTripTimingModel = (RouteEntityShortTripTimingModel) it3.next();
            Intrinsics.i(routeEntityShortTripTimingModel, "<this>");
            String str6 = routeEntityShortTripTimingModel.b;
            Iterator it4 = it3;
            String str7 = routeEntityShortTripTimingModel.f1788a;
            List list6 = routeEntityShortTripTimingModel.c;
            int i3 = i;
            String str8 = str4;
            String str9 = str5;
            ArrayList arrayList5 = new ArrayList(CollectionsKt.v(list6, 10));
            Iterator it5 = list6.iterator();
            while (it5.hasNext()) {
                arrayList5.add(b((RoutEntityTimingModel) it5.next()));
            }
            arrayList4.add(new ShortTripTimingAppModel(str6, str7, arrayList5));
            it3 = it4;
            i = i3;
            str4 = str8;
            str5 = str9;
        }
        int i4 = i;
        String str10 = str4;
        String str11 = str5;
        RouteTripTimingAppModel routeTripTimingAppModel = new RouteTripTimingAppModel(timeTableStatus, i2, arrayList4, arrayList3);
        boolean z2 = routeEntityDetailedData.d;
        boolean z3 = routeEntityDetailedData.e;
        String str12 = routeEntityDetailedData.f;
        List list7 = routeEntity.h;
        ArrayList arrayList6 = new ArrayList(CollectionsKt.v(list7, 10));
        Iterator it6 = list7.iterator();
        while (it6.hasNext()) {
            arrayList6.add(new RouteSpecialFeatureAppModel((String) it6.next(), RouteSpecialFeatureType.NEW));
        }
        LiveSeatAvailabilityApplicable.Companion companion = LiveSeatAvailabilityApplicable.INSTANCE;
        int i5 = routeEntityDetailedData.g;
        companion.getClass();
        LiveSeatAvailabilityApplicable yes = i5 == 0 ? LiveSeatAvailabilityApplicable.No.INSTANCE : new LiveSeatAvailabilityApplicable.Yes(i5);
        RouteEntityLiveDataDetails routeEntityLiveDataDetails = routeEntity.k;
        Intrinsics.i(routeEntityLiveDataDetails, "<this>");
        RouteLiveDetailsAppModel routeLiveDetailsAppModel = new RouteLiveDetailsAppModel(routeEntityLiveDataDetails.e, routeEntityLiveDataDetails.f1786a, routeEntityLiveDataDetails.b, routeEntityLiveDataDetails.c, routeEntityLiveDataDetails.d);
        boolean z4 = routeEntityDetailedData.h;
        String str13 = routeEntity.g;
        RouteNamingSchemeType routeNamingSchemeType = routeEntity.n;
        String str14 = routeEntity.m;
        List list8 = routeEntityDetailedData.i;
        if (list8 != null) {
            List list9 = list8;
            ArrayList arrayList7 = new ArrayList(CollectionsKt.v(list9, 10));
            Iterator it7 = list9.iterator();
            while (it7.hasNext()) {
                TrafficSignalEntityModel trafficSignalEntityModel = (TrafficSignalEntityModel) it7.next();
                Intrinsics.i(trafficSignalEntityModel, str3);
                arrayList7.add(new TrafficSignalAppModel(new LatLng(trafficSignalEntityModel.b, trafficSignalEntityModel.c), trafficSignalEntityModel.f1796a));
                it7 = it7;
                str3 = str3;
                str14 = str14;
                str12 = str12;
                z4 = z4;
                arrayList6 = arrayList6;
                yes = yes;
            }
            str = str14;
            z = z4;
            str2 = str12;
            liveSeatAvailabilityApplicable = yes;
            arrayList = arrayList6;
            list = arrayList7;
        } else {
            str = str14;
            z = z4;
            str2 = str12;
            liveSeatAvailabilityApplicable = yes;
            arrayList = arrayList6;
            list = EmptyList.f17557a;
        }
        return new RouteAppModel(i4, str10, str11, chaloTransitMode, arrayList2, (String) null, (String) null, stopAppModelC, routeTripTimingAppModel, str13, z2, z3, str2, arrayList, liveSeatAvailabilityApplicable, routeLiveDetailsAppModel, z, list, str, routeNamingSchemeType, 96);
    }

    public static final RouteTiming b(RoutEntityTimingModel routEntityTimingModel) {
        Intrinsics.i(routEntityTimingModel, "<this>");
        if (routEntityTimingModel.f1781a) {
            RouteEntityTimeTableWithFrequencyModel routeEntityTimeTableWithFrequencyModel = routEntityTimingModel.c;
            return new RouteTiming.FrequencyTiming(routeEntityTimeTableWithFrequencyModel != null ? routeEntityTimeTableWithFrequencyModel.f1790a : -1L, routeEntityTimeTableWithFrequencyModel != null ? routeEntityTimeTableWithFrequencyModel.b : -1L, routeEntityTimeTableWithFrequencyModel != null ? routeEntityTimeTableWithFrequencyModel.c : -1L, routEntityTimingModel.d);
        }
        Long l = routEntityTimingModel.b;
        return new RouteTiming.FixedTiming(l != null ? l.longValue() : -1L, routEntityTimingModel.d);
    }

    public static final StopAppModel c(RouteStopEntityModel routeStopEntityModel) {
        Intrinsics.i(routeStopEntityModel, "<this>");
        return new StopAppModel(routeStopEntityModel.f1794a, routeStopEntityModel.b, new LatLng(routeStopEntityModel.c, routeStopEntityModel.d), routeStopEntityModel.e, routeStopEntityModel.f, null);
    }
}
