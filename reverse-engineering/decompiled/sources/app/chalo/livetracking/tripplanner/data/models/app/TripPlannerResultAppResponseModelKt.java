package app.chalo.livetracking.tripplanner.data.models.app;

import app.chalo.citydata.data.model.app.RouteServiceType;
import app.chalo.providers.cityprovider.impl.data.models.app.ChaloTransitMode;
import app.chalo.utils.CollectionUtilsKt;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.collections.IntIterator;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntProgressionIterator;
import kotlin.ranges.IntRange;
import kotlin.text.StringsKt;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"livetracking_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class TripPlannerResultAppResponseModelKt {

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f4684a;
        public static final /* synthetic */ int[] b;

        static {
            int[] iArr = new int[RouteServiceType.values().length];
            try {
                iArr[RouteServiceType.PREMIUM.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[RouteServiceType.REGULAR.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[RouteServiceType.ALL.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f4684a = iArr;
            int[] iArr2 = new int[ChaloTransitMode.values().length];
            try {
                iArr2[ChaloTransitMode.BUS.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[ChaloTransitMode.METRO.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[ChaloTransitMode.TRAIN.ordinal()] = 3;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr2[ChaloTransitMode.CAB.ordinal()] = 4;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr2[ChaloTransitMode.MONORAIL.ordinal()] = 5;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr2[ChaloTransitMode.FERRY.ordinal()] = 6;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr2[ChaloTransitMode.ALL.ordinal()] = 7;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr2[ChaloTransitMode.UNKNOWN.ordinal()] = 8;
            } catch (NoSuchFieldError unused11) {
            }
            b = iArr2;
        }
    }

    public static final void a(LinkedHashMap linkedHashMap, TripPlannerResultAppResponseModel success) {
        byte b;
        Intrinsics.i(success, "success");
        List list = success.f4682a;
        int size = list.size();
        int i = -1;
        int i2 = -1;
        int i3 = -1;
        int i4 = -1;
        int i5 = 0;
        int i6 = 0;
        int i7 = 0;
        int i8 = 0;
        boolean z = false;
        int i9 = 0;
        for (Object obj : list) {
            int i10 = i5 + 1;
            if (i5 < 0) {
                CollectionsKt.z0();
                throw null;
            }
            List list2 = ((TripPlannerItineraryAppResponseModel) obj).f;
            if (f(list2)) {
                i6++;
                if (g(list2)) {
                    i8++;
                    if (i2 == -1) {
                        i2 = i5;
                    }
                    z = true;
                }
                if (b(list2)) {
                    if (i3 != -1) {
                        i5 = i3;
                    }
                    i9++;
                    i3 = i5;
                }
            } else {
                if (c(list2)) {
                    i7++;
                    if (i == -1) {
                        i = i5;
                    }
                    z = true;
                }
                if (b(list2)) {
                    if (i4 != -1) {
                        i5 = i4;
                    }
                    i9++;
                    i4 = i5;
                }
            }
            i5 = i10;
        }
        Iterator it = success.b.iterator();
        int i11 = -1;
        int i12 = 0;
        int i13 = 0;
        int i14 = 0;
        while (it.hasNext()) {
            Object next = it.next();
            int i15 = i12 + 1;
            if (i12 < 0) {
                CollectionsKt.z0();
                throw null;
            }
            TripPlannerItineraryAppResponseModel tripPlannerItineraryAppResponseModel = (TripPlannerItineraryAppResponseModel) next;
            i13++;
            Iterator it2 = it;
            if (f(tripPlannerItineraryAppResponseModel.f) && b(tripPlannerItineraryAppResponseModel.f)) {
                b = -1;
                if (i11 != -1) {
                    i12 = i11;
                }
                i14++;
                i11 = i12;
            } else {
                b = -1;
            }
            i12 = i15;
            it = it2;
        }
        linkedHashMap.put("totalItineraries", String.valueOf(size));
        linkedHashMap.put("totalDirectItineraries", String.valueOf(i6));
        linkedHashMap.put("totalNonDirectItineraries", String.valueOf(size - i6));
        linkedHashMap.put("totalDirectPremiumBusItineraries", String.valueOf(i8));
        linkedHashMap.put("totalNonDirectPremiumBusItineraries", String.valueOf(i7));
        linkedHashMap.put("firstPBDirectPosition", String.valueOf(i2));
        linkedHashMap.put("firstPBPosition", String.valueOf(i));
        linkedHashMap.put("containsPremiumBusLeg", String.valueOf(z));
        linkedHashMap.put("totalResultsWithETA", String.valueOf(i9));
        linkedHashMap.put("firstDirectItineraryWithETAIndex", String.valueOf(i3));
        linkedHashMap.put("firstIndirectItineraryWithETAIndex", String.valueOf(i4));
        linkedHashMap.put("nearbyItineraryCount", String.valueOf(i13));
        linkedHashMap.put("nearbyItineraryTotalResultsWithETA", String.valueOf(i14));
        linkedHashMap.put("firstNearbyDirectItineraryWithETAIndex", String.valueOf(i11));
    }

    public static final boolean b(List list) {
        Intrinsics.i(list, "<this>");
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (obj instanceof TripPlannerLegAppModel.Bus) {
                arrayList.add(obj);
            }
        }
        if (arrayList.isEmpty()) {
            return false;
        }
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj2 = arrayList.get(i);
            i++;
            if (((TripPlannerLegAppModel.Bus) obj2).i()) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0028 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:14:0x002a A[RETURN] */
    public static final boolean c(List list) {
        Intrinsics.i(list, "<this>");
        for (Object obj : list) {
            TripPlannerLegAppModel tripPlannerLegAppModel = (TripPlannerLegAppModel) obj;
            if ((tripPlannerLegAppModel instanceof TripPlannerLegAppModel.Bus) && ((TripPlannerLegAppModel.Bus) tripPlannerLegAppModel).G == RouteServiceType.PREMIUM) {
                if (obj != null) {
                    return true;
                }
                return false;
            }
        }
        obj = null;
        if (obj != null) {
            return true;
        }
        return false;
    }

    public static final LinkedHashMap d(TripPlannerItineraryAppResponseModel tripPlannerItineraryAppResponseModel) {
        boolean z;
        String str;
        Intrinsics.i(tripPlannerItineraryAppResponseModel, "<this>");
        Pair pair = new Pair("totalItineraryDistance", String.valueOf(tripPlannerItineraryAppResponseModel.b));
        Pair pair2 = new Pair("totalItineraryFare", String.valueOf(tripPlannerItineraryAppResponseModel.c));
        Pair pair3 = new Pair("totalTravelTime", String.valueOf(tripPlannerItineraryAppResponseModel.d));
        List list = tripPlannerItineraryAppResponseModel.f;
        Pair pair4 = new Pair("totalLegSize", String.valueOf(list.size()));
        Pair pair5 = new Pair("result position", String.valueOf(tripPlannerItineraryAppResponseModel.h + 1));
        List list2 = list;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list2) {
            if (obj instanceof TripPlannerLegAppModel.Bus) {
                arrayList.add(obj);
            }
        }
        Pair pair6 = new Pair("noOfBusLegs", String.valueOf(arrayList.size()));
        ArrayList arrayList2 = new ArrayList();
        for (Object obj2 : list2) {
            if (obj2 instanceof TripPlannerLegAppModel.Auto) {
                arrayList2.add(obj2);
            }
        }
        Pair pair7 = new Pair("noOfAutoLegs", String.valueOf(arrayList2.size()));
        ArrayList arrayList3 = new ArrayList();
        for (Object obj3 : list2) {
            if (obj3 instanceof TripPlannerLegAppModel.Walk) {
                arrayList3.add(obj3);
            }
        }
        Pair pair8 = new Pair("noOfWalkLegs", String.valueOf(arrayList3.size()));
        ArrayList arrayList4 = new ArrayList();
        for (Object obj4 : list2) {
            if (obj4 instanceof TripPlannerLegAppModel.Metro) {
                arrayList4.add(obj4);
            }
        }
        Pair pair9 = new Pair("noOfMetroLegs", String.valueOf(arrayList4.size()));
        ArrayList arrayList5 = new ArrayList();
        for (Object obj5 : list2) {
            if (obj5 instanceof TripPlannerLegAppModel.Bus) {
                arrayList5.add(obj5);
            }
        }
        int i = 0;
        if (arrayList5.isEmpty()) {
            z = false;
            break;
        }
        int size = arrayList5.size();
        int i2 = 0;
        while (true) {
            if (i2 >= size) {
                z = false;
                break;
            }
            Object obj6 = arrayList5.get(i2);
            i2++;
            if (((TripPlannerLegAppModel.Bus) obj6).i()) {
                z = true;
                break;
            }
        }
        Map mapI = MapsKt.i(pair, pair2, pair3, pair4, pair5, pair6, pair7, pair8, pair9, new Pair("isEtaAvailable", String.valueOf(z)));
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Object obj7 : CollectionUtilsKt.b(6, list)) {
            int i3 = i + 1;
            if (i < 0) {
                CollectionsKt.z0();
                throw null;
            }
            TripPlannerLegAppModel tripPlannerLegAppModel = (TripPlannerLegAppModel) obj7;
            if (tripPlannerLegAppModel instanceof TripPlannerLegAppModel.Bus) {
                str = "BUS";
            } else if (tripPlannerLegAppModel instanceof TripPlannerLegAppModel.Metro) {
                str = "METRO";
            } else if (tripPlannerLegAppModel instanceof TripPlannerLegAppModel.Auto) {
                str = "AUTO";
            } else if (tripPlannerLegAppModel instanceof TripPlannerLegAppModel.Taxi) {
                str = "CAB";
            } else if (tripPlannerLegAppModel instanceof TripPlannerLegAppModel.Walk) {
                str = "WALK";
            } else if (tripPlannerLegAppModel instanceof TripPlannerLegAppModel.Railway) {
                str = "TRAIN";
            } else if (tripPlannerLegAppModel instanceof TripPlannerLegAppModel.Ferry) {
                str = "FERRY";
            } else {
                if (!(tripPlannerLegAppModel instanceof TripPlannerLegAppModel.MonoRail)) {
                    throw new NoWhenBranchMatchedException();
                }
                str = "MONORAIL";
            }
            linkedHashMap.put("legMode" + i, str);
            i = i3;
        }
        return MapsKt.l(mapI, linkedHashMap);
    }

    public static final ArrayList e(List list) {
        int i;
        Intrinsics.i(list, "<this>");
        ArrayList arrayList = new ArrayList();
        int i2 = 0;
        while (i2 < list.size()) {
            if (((TripPlannerLegAppModel) list.get(i2)) instanceof TripPlannerLegAppModel.Metro) {
                int i3 = i2;
                while (true) {
                    i = i3 + 1;
                    if (i >= list.size() || !(list.get(i) instanceof TripPlannerLegAppModel.Metro)) {
                        break;
                    }
                    i3 = i;
                }
                IntRange intRange = new IntRange(i2, i3, 1);
                ArrayList arrayList2 = new ArrayList(CollectionsKt.v(intRange, 10));
                Iterator<Integer> it = intRange.iterator();
                while (((IntProgressionIterator) it).c) {
                    Object obj = list.get(((IntIterator) it).nextInt());
                    Intrinsics.g(obj, "null cannot be cast to non-null type app.chalo.livetracking.tripplanner.data.models.app.TripPlannerLegAppModel.Metro");
                    arrayList2.add((TripPlannerLegAppModel.Metro) obj);
                }
                arrayList.add(arrayList2);
                i2 = i;
            } else {
                i2++;
            }
        }
        return arrayList;
    }

    public static final boolean f(List list) {
        int i;
        Intrinsics.i(list, "<this>");
        List list2 = list;
        if ((list2 instanceof Collection) && list2.isEmpty()) {
            i = 0;
        } else {
            Iterator it = list2.iterator();
            i = 0;
            while (it.hasNext()) {
                if (h((TripPlannerLegAppModel) it.next()) && (i = i + 1) < 0) {
                    CollectionsKt.y0();
                    throw null;
                }
            }
        }
        return i == 1;
    }

    public static final boolean g(List list) {
        Intrinsics.i(list, "<this>");
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (obj instanceof TripPlannerLegAppModel.Bus) {
                arrayList.add(obj);
            }
        }
        if (f(arrayList)) {
            TripPlannerLegAppModel.Bus bus = (TripPlannerLegAppModel.Bus) CollectionsKt.H(arrayList);
            RouteServiceType routeServiceType = bus != null ? bus.G : null;
            int i = routeServiceType == null ? -1 : WhenMappings.f4684a[routeServiceType.ordinal()];
            if (i != -1) {
                if (i == 1) {
                    return true;
                }
                if (i != 2 && i != 3) {
                    throw new NoWhenBranchMatchedException();
                }
            }
        }
        return false;
    }

    public static final boolean h(TripPlannerLegAppModel tripPlannerLegAppModel) {
        Intrinsics.i(tripPlannerLegAppModel, "<this>");
        return (tripPlannerLegAppModel instanceof TripPlannerLegAppModel.Bus) || (tripPlannerLegAppModel instanceof TripPlannerLegAppModel.Metro);
    }

    public static final TripPlannerLegLiveBusNumberAvailability i(TripPlannerLegAppModel.Bus bus) {
        String str;
        Intrinsics.i(bus, "<this>");
        LiveEtaAppModel liveEtaAppModel = bus.H;
        return (liveEtaAppModel == null || (str = liveEtaAppModel.b) == null || !(StringsKt.F(str) ^ true)) ? TripPlannerLegLiveBusNumberAvailability.NotAvailable.f4677a : new TripPlannerLegLiveBusNumberAvailability.Available(str);
    }
}
