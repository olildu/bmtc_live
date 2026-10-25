package app.chalo.livetracking.tripplanner.data.mappers;

import app.chalo.citydata.data.model.api.response.RoutesDataResponseApiModelKt;
import app.chalo.citydata.data.model.app.RouteServiceType;
import app.chalo.citydata.data.model.app.StopAppModel;
import app.chalo.citydata.data.model.app.TimeTableStatus;
import app.chalo.extensions.UtilityExtensionsKt;
import app.chalo.livetracking.tripplanner.data.models.api.LiveEtaApiModel;
import app.chalo.livetracking.tripplanner.data.models.api.TripPlannerIntermediateStopInfoApiResponseModel;
import app.chalo.livetracking.tripplanner.data.models.api.TripPlannerItineraryApiResponseModel;
import app.chalo.livetracking.tripplanner.data.models.api.TripPlannerLegApiResponseModel;
import app.chalo.livetracking.tripplanner.data.models.api.TripPlannerLegFareInfoApiResponseModel;
import app.chalo.livetracking.tripplanner.data.models.api.TripPlannerLegFareTupleApiResponseModel;
import app.chalo.livetracking.tripplanner.data.models.api.TripPlannerModeRunningTimeRangeResponseApiModel;
import app.chalo.livetracking.tripplanner.data.models.api.TripPlannerResultApiResponseModel;
import app.chalo.livetracking.tripplanner.data.models.api.TripPlannerResultPayloadApiResponseModel;
import app.chalo.livetracking.tripplanner.data.models.app.LiveEtaAppModel;
import app.chalo.livetracking.tripplanner.data.models.app.TripPlannerIntermediateStopInfoAppResponseModel;
import app.chalo.livetracking.tripplanner.data.models.app.TripPlannerItineraryAppResponseModel;
import app.chalo.livetracking.tripplanner.data.models.app.TripPlannerLegAppModel;
import app.chalo.livetracking.tripplanner.data.models.app.TripPlannerLegFareInfoAppResponseModel;
import app.chalo.livetracking.tripplanner.data.models.app.TripPlannerLegFareTupleAppResponseModel;
import app.chalo.livetracking.tripplanner.data.models.app.TripPlannerModeRunningTimeRangeAppModel;
import app.chalo.livetracking.tripplanner.data.models.app.TripPlannerResultAppResponseModel;
import app.chalo.livetracking.universalsearch.data.model.api.StopsInfoApiModel;
import app.chalo.livetracking.universalsearch.data.model.app.AutoCompleteResultAppModelKt;
import app.chalo.location.LatLng;
import app.chalo.providers.RouteNamingSchemeType;
import app.chalo.utils.KUUID;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"livetracking_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class TripPlannerRemoteToAppModelsMappersKt {
    public static final LatLng a(Double d, Double d2) {
        if (d == null || d2 == null) {
            return null;
        }
        return new LatLng(d.doubleValue(), d2.doubleValue());
    }

    public static final TripPlannerIntermediateStopInfoAppResponseModel b(TripPlannerIntermediateStopInfoApiResponseModel tripPlannerIntermediateStopInfoApiResponseModel) {
        Intrinsics.i(tripPlannerIntermediateStopInfoApiResponseModel, "<this>");
        String str = tripPlannerIntermediateStopInfoApiResponseModel.f4632a;
        String str2 = tripPlannerIntermediateStopInfoApiResponseModel.b;
        Double d = tripPlannerIntermediateStopInfoApiResponseModel.c;
        double dDoubleValue = d != null ? d.doubleValue() : -1.0d;
        Double d2 = tripPlannerIntermediateStopInfoApiResponseModel.d;
        return new TripPlannerIntermediateStopInfoAppResponseModel(str, str2, new LatLng(dDoubleValue, d2 != null ? d2.doubleValue() : -1.0d));
    }

    public static final TripPlannerLegFareInfoAppResponseModel c(TripPlannerLegFareInfoApiResponseModel tripPlannerLegFareInfoApiResponseModel) {
        ArrayList arrayList;
        List list = tripPlannerLegFareInfoApiResponseModel.f4638a;
        if (list != null) {
            List<TripPlannerLegFareTupleApiResponseModel> list2 = list;
            arrayList = new ArrayList(CollectionsKt.v(list2, 10));
            for (TripPlannerLegFareTupleApiResponseModel tripPlannerLegFareTupleApiResponseModel : list2) {
                Intrinsics.i(tripPlannerLegFareTupleApiResponseModel, "<this>");
                arrayList.add(new TripPlannerLegFareTupleAppResponseModel(tripPlannerLegFareTupleApiResponseModel.f4640a, tripPlannerLegFareTupleApiResponseModel.b));
            }
        } else {
            arrayList = null;
        }
        return new TripPlannerLegFareInfoAppResponseModel(arrayList, tripPlannerLegFareInfoApiResponseModel.b);
    }

    public static final TripPlannerResultAppResponseModel d(TripPlannerResultApiResponseModel tripPlannerResultApiResponseModel) {
        List arrayList;
        List arrayList2;
        List list;
        List list2;
        Intrinsics.i(tripPlannerResultApiResponseModel, "<this>");
        TripPlannerResultPayloadApiResponseModel tripPlannerResultPayloadApiResponseModel = tripPlannerResultApiResponseModel.f4644a;
        int i = 0;
        if (tripPlannerResultPayloadApiResponseModel == null || (list2 = tripPlannerResultPayloadApiResponseModel.f4646a) == null) {
            arrayList = EmptyList.f17557a;
        } else {
            arrayList = new ArrayList();
            int i2 = 0;
            for (Object obj : list2) {
                int i3 = i2 + 1;
                if (i2 < 0) {
                    CollectionsKt.z0();
                    throw null;
                }
                TripPlannerItineraryAppResponseModel tripPlannerItineraryAppResponseModelE = e((TripPlannerItineraryApiResponseModel) obj, i2);
                if (tripPlannerItineraryAppResponseModelE != null) {
                    arrayList.add(tripPlannerItineraryAppResponseModelE);
                }
                i2 = i3;
            }
        }
        if (tripPlannerResultPayloadApiResponseModel == null || (list = tripPlannerResultPayloadApiResponseModel.b) == null) {
            arrayList2 = EmptyList.f17557a;
        } else {
            arrayList2 = new ArrayList();
            for (Object obj2 : list) {
                int i4 = i + 1;
                if (i < 0) {
                    CollectionsKt.z0();
                    throw null;
                }
                TripPlannerItineraryAppResponseModel tripPlannerItineraryAppResponseModelE2 = e((TripPlannerItineraryApiResponseModel) obj2, i);
                if (tripPlannerItineraryAppResponseModelE2 != null) {
                    arrayList2.add(tripPlannerItineraryAppResponseModelE2);
                }
                i = i4;
            }
        }
        return new TripPlannerResultAppResponseModel(arrayList, arrayList2);
    }

    /* JADX WARN: Code duplicated, block: B:192:0x03f8 A[LOOP:2: B:19:0x006e->B:192:0x03f8, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:210:0x0423 A[SYNTHETIC] */
    /* JADX WARN: Failed to find 'out' block for switch in B:30:0x00d5. Please report as an issue. */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v17, types: [kotlin.collections.EmptyList] */
    /* JADX WARN: Type inference failed for: r1v18 */
    /* JADX WARN: Type inference failed for: r1v24, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r1v34, types: [kotlin.collections.EmptyList] */
    /* JADX WARN: Type inference failed for: r1v35 */
    /* JADX WARN: Type inference failed for: r1v36, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r40v0, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r40v3, types: [java.util.List] */
    public static final TripPlannerItineraryAppResponseModel e(TripPlannerItineraryApiResponseModel tripPlannerItineraryApiResponseModel, int i) {
        LinkedHashMap linkedHashMap;
        String str;
        Object obj;
        ?? arrayList;
        RouteServiceType routeServiceTypeValueOf;
        LiveEtaAppModel liveEtaAppModel;
        Object bus;
        Object auto;
        Object railway;
        String str2;
        ?? arrayList2;
        RouteServiceType routeServiceTypeValueOf2;
        String str3 = "<this>";
        Intrinsics.i(tripPlannerItineraryApiResponseModel, "<this>");
        List<TripPlannerLegFareInfoApiResponseModel> list = tripPlannerItineraryApiResponseModel.f;
        if (list != null) {
            linkedHashMap = new LinkedHashMap();
            for (TripPlannerLegFareInfoApiResponseModel tripPlannerLegFareInfoApiResponseModel : list) {
                Iterator it = tripPlannerLegFareInfoApiResponseModel.c.iterator();
                while (it.hasNext()) {
                    linkedHashMap.put(Integer.valueOf(((Number) it.next()).intValue()), tripPlannerLegFareInfoApiResponseModel);
                }
            }
        } else {
            linkedHashMap = null;
        }
        String strA = KUUID.a();
        Double d = tripPlannerItineraryApiResponseModel.f4634a;
        Double d2 = tripPlannerItineraryApiResponseModel.b;
        Double d3 = tripPlannerItineraryApiResponseModel.c;
        Boolean bool = tripPlannerItineraryApiResponseModel.d;
        boolean zBooleanValue = bool != null ? bool.booleanValue() : false;
        List list2 = tripPlannerItineraryApiResponseModel.e;
        if (list2 == null) {
            return null;
        }
        List list3 = list2;
        ArrayList arrayList3 = new ArrayList(CollectionsKt.v(list3, 10));
        Iterator it2 = list3.iterator();
        int i2 = 0;
        while (it2.hasNext()) {
            Object next = it2.next();
            int i3 = i2 + 1;
            if (i2 < 0) {
                CollectionsKt.z0();
                throw null;
            }
            TripPlannerLegApiResponseModel tripPlannerLegApiResponseModel = (TripPlannerLegApiResponseModel) next;
            TripPlannerLegFareInfoApiResponseModel tripPlannerLegFareInfoApiResponseModel2 = linkedHashMap != null ? (TripPlannerLegFareInfoApiResponseModel) linkedHashMap.get(Integer.valueOf(i2)) : null;
            Intrinsics.i(tripPlannerLegApiResponseModel, str3);
            String str4 = tripPlannerLegApiResponseModel.C;
            String str5 = tripPlannerLegApiResponseModel.y;
            List list4 = tripPlannerLegApiResponseModel.w;
            String str6 = str3;
            List list5 = tripPlannerLegApiResponseModel.p;
            Integer num = tripPlannerLegApiResponseModel.o;
            Boolean bool2 = tripPlannerLegApiResponseModel.j;
            String str7 = tripPlannerLegApiResponseModel.v;
            String str8 = tripPlannerLegApiResponseModel.q;
            StopsInfoApiModel stopsInfoApiModel = tripPlannerLegApiResponseModel.t;
            StopsInfoApiModel stopsInfoApiModel2 = tripPlannerLegApiResponseModel.r;
            StopsInfoApiModel stopsInfoApiModel3 = tripPlannerLegApiResponseModel.s;
            Double d4 = tripPlannerLegApiResponseModel.d;
            Iterator it3 = it2;
            Double d5 = tripPlannerLegApiResponseModel.b;
            String str9 = str4;
            Double d6 = tripPlannerLegApiResponseModel.c;
            LinkedHashMap linkedHashMap2 = linkedHashMap;
            Double d7 = tripPlannerLegApiResponseModel.f4636a;
            String str10 = tripPlannerLegApiResponseModel.i;
            if (str10 != null) {
                switch (str10.hashCode()) {
                    case 66144:
                        str = strA;
                        if (str10.equals("BUS")) {
                            LatLng latLngA = a(d7, d6);
                            LatLng latLngA2 = a(d5, d4);
                            Double d8 = tripPlannerLegApiResponseModel.f;
                            String str11 = tripPlannerLegApiResponseModel.l;
                            String str12 = tripPlannerLegApiResponseModel.n;
                            TripPlannerLegFareInfoAppResponseModel tripPlannerLegFareInfoAppResponseModelC = tripPlannerLegFareInfoApiResponseModel2 != null ? c(tripPlannerLegFareInfoApiResponseModel2) : null;
                            Double d9 = tripPlannerLegApiResponseModel.e;
                            String str13 = tripPlannerLegApiResponseModel.k;
                            if (stopsInfoApiModel3 != null) {
                                StopAppModel stopAppModelA = AutoCompleteResultAppModelKt.a(stopsInfoApiModel3);
                                if (stopsInfoApiModel2 != null) {
                                    StopAppModel stopAppModelA2 = AutoCompleteResultAppModelKt.a(stopsInfoApiModel2);
                                    if (stopsInfoApiModel != null) {
                                        StopAppModel stopAppModelA3 = AutoCompleteResultAppModelKt.a(stopsInfoApiModel);
                                        if (str8 != null && str7 != null) {
                                            String str14 = tripPlannerLegApiResponseModel.u;
                                            boolean zBooleanValue2 = bool2 != null ? bool2.booleanValue() : false;
                                            Integer num2 = tripPlannerLegApiResponseModel.g;
                                            Integer num3 = tripPlannerLegApiResponseModel.m;
                                            TimeTableStatus timeTableStatusB = RoutesDataResponseApiModelKt.b(num != null ? num.intValue() : -1);
                                            if (list5 == null) {
                                                list5 = EmptyList.f17557a;
                                            }
                                            List list6 = list5;
                                            if (list4 != null) {
                                                List list7 = list4;
                                                arrayList = new ArrayList(CollectionsKt.v(list7, 10));
                                                Iterator it4 = list7.iterator();
                                                while (it4.hasNext()) {
                                                    arrayList.add(b((TripPlannerIntermediateStopInfoApiResponseModel) it4.next()));
                                                }
                                            } else {
                                                arrayList = EmptyList.f17557a;
                                            }
                                            ?? r40 = arrayList;
                                            RouteNamingSchemeType.INSTANCE.getClass();
                                            RouteNamingSchemeType routeNamingSchemeTypeA = RouteNamingSchemeType.Companion.a(str5);
                                            String str15 = tripPlannerLegApiResponseModel.z;
                                            Integer num4 = tripPlannerLegApiResponseModel.A;
                                            Integer num5 = tripPlannerLegApiResponseModel.B;
                                            RouteServiceType.Companion companion = RouteServiceType.INSTANCE;
                                            if (str9 == null) {
                                                str9 = "";
                                            }
                                            companion.getClass();
                                            try {
                                                routeServiceTypeValueOf = RouteServiceType.valueOf(str9);
                                            } catch (IllegalArgumentException unused) {
                                                routeServiceTypeValueOf = RouteServiceType.REGULAR;
                                            }
                                            RouteServiceType routeServiceType = routeServiceTypeValueOf;
                                            LiveEtaApiModel liveEtaApiModel = tripPlannerLegApiResponseModel.F;
                                            if (liveEtaApiModel != null) {
                                                String str16 = liveEtaApiModel.b;
                                                Integer num6 = liveEtaApiModel.f4630a;
                                                liveEtaAppModel = (num6 == null || str16 == null) ? null : new LiveEtaAppModel(num6.intValue(), str16);
                                            } else {
                                                num4 = num4;
                                                liveEtaAppModel = null;
                                            }
                                            TripPlannerModeRunningTimeRangeResponseApiModel tripPlannerModeRunningTimeRangeResponseApiModel = tripPlannerLegApiResponseModel.G;
                                            bus = new TripPlannerLegAppModel.Bus(latLngA, latLngA2, d9, d8, str13, str11, str12, str8, str7, str14, stopAppModelA, stopAppModelA2, stopAppModelA3, zBooleanValue2, num2, num3, timeTableStatusB, list6, r40, tripPlannerLegFareInfoAppResponseModelC, routeNamingSchemeTypeA, str15, num4, num5, routeServiceType, liveEtaAppModel, tripPlannerModeRunningTimeRangeResponseApiModel != null ? new TripPlannerModeRunningTimeRangeAppModel(tripPlannerModeRunningTimeRangeResponseApiModel.f4642a, tripPlannerModeRunningTimeRangeResponseApiModel.b) : null);
                                            obj = bus;
                                        }
                                    }
                                }
                            }
                        }
                        break;
                    case 2020783:
                        str = strA;
                        if (str10.equals("AUTO")) {
                            auto = new TripPlannerLegAppModel.Auto(a(d7, d6), a(d5, d4), tripPlannerLegApiResponseModel.f, tripPlannerLegApiResponseModel.l, tripPlannerLegApiResponseModel.n, tripPlannerLegApiResponseModel.k, tripPlannerLegFareInfoApiResponseModel2 != null ? c(tripPlannerLegFareInfoApiResponseModel2) : null);
                            obj = auto;
                            break;
                        }
                        break;
                    case 2567710:
                        str = strA;
                        if (str10.equals("TAXI")) {
                            auto = new TripPlannerLegAppModel.Taxi(a(d7, d6), a(d5, d4), tripPlannerLegApiResponseModel.f, tripPlannerLegApiResponseModel.l, tripPlannerLegApiResponseModel.n, tripPlannerLegApiResponseModel.k, tripPlannerLegFareInfoApiResponseModel2 != null ? c(tripPlannerLegFareInfoApiResponseModel2) : null);
                            obj = auto;
                            break;
                        }
                        break;
                    case 2656713:
                        str = strA;
                        if (str10.equals("WALK")) {
                            auto = new TripPlannerLegAppModel.Walk(a(d7, d6), a(d5, d4), tripPlannerLegApiResponseModel.e, tripPlannerLegApiResponseModel.f, tripPlannerLegApiResponseModel.k, tripPlannerLegApiResponseModel.l, tripPlannerLegApiResponseModel.n);
                            obj = auto;
                            break;
                        }
                        break;
                    case 66783482:
                        str = strA;
                        if (str10.equals("FERRY")) {
                            railway = TripPlannerLegAppModel.Ferry.INSTANCE;
                            obj = railway;
                            break;
                        }
                        break;
                    case 73250041:
                        str = strA;
                        if (str10.equals("METRO")) {
                            String str17 = tripPlannerLegApiResponseModel.E;
                            if (str17 != null) {
                                Regex regex = UtilityExtensionsKt.f2619a;
                                if (!UtilityExtensionsKt.f2619a.h(str17)) {
                                    str17 = null;
                                }
                                str2 = str17;
                            } else {
                                str2 = null;
                            }
                            LatLng latLngA3 = a(d7, d6);
                            LatLng latLngA4 = a(d5, d4);
                            Double d10 = tripPlannerLegApiResponseModel.f;
                            String str18 = tripPlannerLegApiResponseModel.l;
                            String str19 = tripPlannerLegApiResponseModel.n;
                            TripPlannerLegFareInfoAppResponseModel tripPlannerLegFareInfoAppResponseModelC2 = tripPlannerLegFareInfoApiResponseModel2 != null ? c(tripPlannerLegFareInfoApiResponseModel2) : null;
                            Double d11 = tripPlannerLegApiResponseModel.e;
                            String str20 = tripPlannerLegApiResponseModel.k;
                            if (stopsInfoApiModel3 != null) {
                                StopAppModel stopAppModelA4 = AutoCompleteResultAppModelKt.a(stopsInfoApiModel3);
                                if (stopsInfoApiModel2 != null) {
                                    StopAppModel stopAppModelA5 = AutoCompleteResultAppModelKt.a(stopsInfoApiModel2);
                                    if (stopsInfoApiModel != null) {
                                        StopAppModel stopAppModelA6 = AutoCompleteResultAppModelKt.a(stopsInfoApiModel);
                                        if (str8 != null && str7 != null) {
                                            String str21 = tripPlannerLegApiResponseModel.u;
                                            boolean zBooleanValue3 = bool2 != null ? bool2.booleanValue() : false;
                                            Integer num7 = tripPlannerLegApiResponseModel.g;
                                            Integer num8 = tripPlannerLegApiResponseModel.m;
                                            TimeTableStatus timeTableStatusB2 = RoutesDataResponseApiModelKt.b(num != null ? num.intValue() : -1);
                                            if (list5 == null) {
                                                list5 = EmptyList.f17557a;
                                            }
                                            List list8 = list5;
                                            if (list4 != null) {
                                                List list9 = list4;
                                                arrayList2 = new ArrayList(CollectionsKt.v(list9, 10));
                                                Iterator it5 = list9.iterator();
                                                while (it5.hasNext()) {
                                                    arrayList2.add(b((TripPlannerIntermediateStopInfoApiResponseModel) it5.next()));
                                                }
                                            } else {
                                                arrayList2 = EmptyList.f17557a;
                                            }
                                            RouteNamingSchemeType.INSTANCE.getClass();
                                            RouteNamingSchemeType routeNamingSchemeTypeA2 = RouteNamingSchemeType.Companion.a(str5);
                                            String str22 = tripPlannerLegApiResponseModel.z;
                                            Integer num9 = tripPlannerLegApiResponseModel.A;
                                            Integer num10 = tripPlannerLegApiResponseModel.B;
                                            RouteServiceType.Companion companion2 = RouteServiceType.INSTANCE;
                                            if (str9 == null) {
                                                str9 = "";
                                            }
                                            companion2.getClass();
                                            try {
                                                routeServiceTypeValueOf2 = RouteServiceType.valueOf(str9);
                                            } catch (IllegalArgumentException unused2) {
                                                routeServiceTypeValueOf2 = RouteServiceType.REGULAR;
                                            }
                                            bus = new TripPlannerLegAppModel.Metro(latLngA3, latLngA4, d11, d10, str20, str18, str19, str8, str7, str21, stopAppModelA4, stopAppModelA5, stopAppModelA6, zBooleanValue3, num7, num8, timeTableStatusB2, list8, arrayList2, tripPlannerLegFareInfoAppResponseModelC2, routeNamingSchemeTypeA2, str22, num9, num10, routeServiceTypeValueOf2, tripPlannerLegApiResponseModel.D, str2);
                                            obj = bus;
                                        }
                                    }
                                }
                            }
                        }
                        break;
                    case 459295989:
                        if (str10.equals("MONORAIL")) {
                            railway = TripPlannerLegAppModel.MonoRail.INSTANCE;
                            str = strA;
                            obj = railway;
                        } else {
                            str = strA;
                        }
                        break;
                    case 1691519485:
                        if (str10.equals("RAILWAY")) {
                            LatLng latLngA5 = a(d7, d6);
                            LatLng latLngA6 = a(d5, d4);
                            Double d12 = tripPlannerLegApiResponseModel.f;
                            String str23 = tripPlannerLegApiResponseModel.l;
                            String str24 = tripPlannerLegApiResponseModel.n;
                            TripPlannerLegFareInfoAppResponseModel tripPlannerLegFareInfoAppResponseModelC3 = tripPlannerLegFareInfoApiResponseModel2 != null ? c(tripPlannerLegFareInfoApiResponseModel2) : null;
                            Double d13 = tripPlannerLegApiResponseModel.e;
                            String str25 = tripPlannerLegApiResponseModel.k;
                            String str26 = tripPlannerLegApiResponseModel.x;
                            if (str26 == null || stopsInfoApiModel3 == null) {
                                str = strA;
                            } else {
                                StopAppModel stopAppModelA7 = AutoCompleteResultAppModelKt.a(stopsInfoApiModel3);
                                if (stopsInfoApiModel2 != null) {
                                    railway = new TripPlannerLegAppModel.Railway(latLngA5, latLngA6, d13, d12, str25, str23, str24, str26, stopAppModelA7, AutoCompleteResultAppModelKt.a(stopsInfoApiModel2), tripPlannerLegFareInfoAppResponseModelC3);
                                    str = strA;
                                    obj = railway;
                                } else {
                                    str = strA;
                                }
                            }
                        } else {
                            str = strA;
                        }
                        break;
                    default:
                        str = strA;
                        break;
                }
                if (obj == null) {
                    return null;
                }
                arrayList3.add(obj);
                i2 = i3;
                str3 = str6;
                it2 = it3;
                linkedHashMap = linkedHashMap2;
                strA = str;
            } else {
                str = strA;
            }
            obj = null;
            if (obj == null) {
                return null;
            }
            arrayList3.add(obj);
            i2 = i3;
            str3 = str6;
            it2 = it3;
            linkedHashMap = linkedHashMap2;
            strA = str;
        }
        String str27 = strA;
        List list10 = tripPlannerItineraryApiResponseModel.g;
        if (list10 == null) {
            list10 = EmptyList.f17557a;
        }
        return new TripPlannerItineraryAppResponseModel(str27, d, d2, d3, zBooleanValue, arrayList3, list10, i);
    }
}
