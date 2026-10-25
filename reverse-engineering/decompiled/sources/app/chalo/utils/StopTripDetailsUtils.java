package app.chalo.utils;

import app.chalo.citydata.data.model.app.SeatAvailabilityLevel;
import app.chalo.home.nearbytrips.domain.NearbyTripsDataManagerEtaResult;
import app.chalo.home.nearbytrips.domain.NearbyTripsDataManagerResult;
import app.chalo.providers.cityprovider.impl.data.models.app.ChaloTransitMode;
import app.chalo.stoptripdetails.data.model.app.EstimatedTimeType;
import app.chalo.stoptripdetails.data.model.app.FrequencyAppModel;
import app.chalo.stoptripdetails.data.model.app.StopTripDetailsAppModel;
import app.chalo.stoptripdetails.domain.GetRelevantScheduledTripFromStopTripsList;
import app.chalo.stoptripdetails.domain.GetRelevantScheduledTripFromStopTripsList$invoke$$inlined$compareBy$1;
import app.chalo.stoptripdetails.domain.GetRelevantScheduledTripFromStopTripsList$invoke$$inlined$sortedBy$1;
import app.chalo.utils.timeutil.TimeUtilsContract;
import com.inmobi.commons.core.configs.AdConfig;
import defpackage.cb0;
import defpackage.mb1;
import defpackage.vb;
import defpackage.vo1;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.math.MathKt;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/utils/StopTripDetailsUtils;", "", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class StopTripDetailsUtils {

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f10440a;
        public static final /* synthetic */ int[] b;
        public static final /* synthetic */ int[] c;

        static {
            int[] iArr = new int[EstimatedTimeType.values().length];
            try {
                iArr[EstimatedTimeType.EVERY_X_MIN.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EstimatedTimeType.AFTER_X.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[EstimatedTimeType.VALID.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[EstimatedTimeType.NO_MORE_TRIPS.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[EstimatedTimeType.VALID_WITH_DISCLAIMER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[EstimatedTimeType.INVALID.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            f10440a = iArr;
            int[] iArr2 = new int[SeatAvailabilityLevel.values().length];
            try {
                iArr2[SeatAvailabilityLevel.LOW.ordinal()] = 1;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr2[SeatAvailabilityLevel.MEDIUM.ordinal()] = 2;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr2[SeatAvailabilityLevel.HIGH.ordinal()] = 3;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr2[SeatAvailabilityLevel.UNKNOWN.ordinal()] = 4;
            } catch (NoSuchFieldError unused10) {
            }
            b = iArr2;
            int[] iArr3 = new int[ChaloTransitMode.values().length];
            try {
                iArr3[ChaloTransitMode.BUS.ordinal()] = 1;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr3[ChaloTransitMode.TRAIN.ordinal()] = 2;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr3[ChaloTransitMode.METRO.ordinal()] = 3;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr3[ChaloTransitMode.MONORAIL.ordinal()] = 4;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                iArr3[ChaloTransitMode.FERRY.ordinal()] = 5;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                iArr3[ChaloTransitMode.CAB.ordinal()] = 6;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                iArr3[ChaloTransitMode.ALL.ordinal()] = 7;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                iArr3[ChaloTransitMode.UNKNOWN.ordinal()] = 8;
            } catch (NoSuchFieldError unused18) {
            }
            c = iArr3;
        }
    }

    /* JADX WARN: Code duplicated, block: B:46:0x00f6  */
    /* JADX WARN: Code duplicated, block: B:51:0x010d  */
    /* JADX WARN: Code duplicated, block: B:90:0x00fe A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:92:0x00f0 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:95:0x011e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:97:0x010b A[SYNTHETIC] */
    public static List a(List list, ChaloTransitMode transitMode, GetRelevantScheduledTripFromStopTripsList getRelevantScheduledTripFromStopTripsList) {
        ArrayList arrayList;
        ArrayList arrayList2;
        int size;
        Object obj;
        Intrinsics.i(transitMode, "transitMode");
        Intrinsics.i(getRelevantScheduledTripFromStopTripsList, "getRelevantScheduledTripFromStopTripsList");
        switch (WhenMappings.c[transitMode.ordinal()]) {
            case 1:
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                for (Object obj2 : list) {
                    String str = ((StopTripDetailsAppModel) obj2).d;
                    Object arrayList3 = linkedHashMap.get(str);
                    if (arrayList3 == null) {
                        arrayList3 = new ArrayList();
                        linkedHashMap.put(str, arrayList3);
                    }
                    ((List) arrayList3).add(obj2);
                }
                LinkedHashMap linkedHashMap2 = new LinkedHashMap(MapsKt.g(linkedHashMap.size()));
                for (Map.Entry entry : linkedHashMap.entrySet()) {
                    Object key = entry.getKey();
                    List stopTripDetails = (List) entry.getValue();
                    Intrinsics.i(stopTripDetails, "stopTripDetails");
                    TimeUtilsContract timeUtilsContract = getRelevantScheduledTripFromStopTripsList.f9506a;
                    int iB = timeUtilsContract.B(null);
                    List list2 = stopTripDetails;
                    ArrayList arrayList4 = new ArrayList();
                    for (Object obj3 : list2) {
                        StopTripDetailsAppModel stopTripDetailsAppModel = (StopTripDetailsAppModel) obj3;
                        if (!(stopTripDetailsAppModel instanceof StopTripDetailsAppModel.FrequencyTrip)) {
                            if (stopTripDetailsAppModel instanceof StopTripDetailsAppModel.FixedTime) {
                                if (((StopTripDetailsAppModel.FixedTime) stopTripDetailsAppModel).p > iB) {
                                }
                            } else if (!(stopTripDetailsAppModel instanceof StopTripDetailsAppModel.UnknownTiming)) {
                                throw new NoWhenBranchMatchedException();
                            }
                            arrayList4.add(obj3);
                        } else if (((StopTripDetailsAppModel.FrequencyTrip) stopTripDetailsAppModel).c(timeUtilsContract.B(null)) != null) {
                            arrayList4.add(obj3);
                        }
                    }
                    ArrayList arrayListE0 = CollectionsKt.E0(arrayList4);
                    int i = 0;
                    if (arrayListE0.isEmpty()) {
                        arrayList = new ArrayList();
                        for (Object obj4 : list2) {
                            if (obj4 instanceof StopTripDetailsAppModel.FixedTime) {
                                arrayList.add(obj4);
                            }
                        }
                        arrayList2 = new ArrayList();
                        size = arrayList.size();
                        while (i < size) {
                            obj = arrayList.get(i);
                            i++;
                            if (((StopTripDetailsAppModel.FixedTime) obj).p < AdConfig.DEFAULT_CONTEXTUAL_DATA_EXPIRY_TIME + iB) {
                                arrayList2.add(obj);
                            }
                        }
                        CollectionsKt.i(CollectionsKt.v0(new GetRelevantScheduledTripFromStopTripsList$invoke$$inlined$sortedBy$1(), arrayList2), arrayListE0);
                    } else {
                        int size2 = arrayListE0.size();
                        int i2 = 0;
                        while (true) {
                            if (i2 < size2) {
                                Object obj5 = arrayListE0.get(i2);
                                i2++;
                                if (((StopTripDetailsAppModel) obj5) instanceof StopTripDetailsAppModel.FixedTime) {
                                }
                            } else {
                                arrayList = new ArrayList();
                                while (r0.hasNext()) {
                                    if (obj4 instanceof StopTripDetailsAppModel.FixedTime) {
                                        arrayList.add(obj4);
                                    }
                                }
                                arrayList2 = new ArrayList();
                                size = arrayList.size();
                                while (i < size) {
                                    obj = arrayList.get(i);
                                    i++;
                                    if (((StopTripDetailsAppModel.FixedTime) obj).p < AdConfig.DEFAULT_CONTEXTUAL_DATA_EXPIRY_TIME + iB) {
                                        arrayList2.add(obj);
                                    }
                                }
                                CollectionsKt.i(CollectionsKt.v0(new GetRelevantScheduledTripFromStopTripsList$invoke$$inlined$sortedBy$1(), arrayList2), arrayListE0);
                            }
                        }
                    }
                    linkedHashMap2.put(key, (StopTripDetailsAppModel) CollectionsKt.H(CollectionsKt.v0(new GetRelevantScheduledTripFromStopTripsList$invoke$$inlined$compareBy$1(), arrayListE0)));
                }
                LinkedHashMap linkedHashMap3 = new LinkedHashMap();
                for (Map.Entry entry2 : linkedHashMap2.entrySet()) {
                    if (((StopTripDetailsAppModel) entry2.getValue()) != null) {
                        linkedHashMap3.put(entry2.getKey(), entry2.getValue());
                    }
                }
                Collection<StopTripDetailsAppModel> collectionValues = linkedHashMap3.values();
                ArrayList arrayList5 = new ArrayList();
                for (StopTripDetailsAppModel stopTripDetailsAppModel2 : collectionValues) {
                    if (stopTripDetailsAppModel2 != null) {
                        arrayList5.add(stopTripDetailsAppModel2);
                    }
                }
                return CollectionsKt.D0(arrayList5);
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
                return list;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    public static String b(double d, TimeUtilsContract timeUtilsContract) {
        Intrinsics.i(timeUtilsContract, "timeUtilsContract");
        double d2 = 1000;
        double d3 = d * d2;
        double d4 = d3 / 1.1111111111111112d;
        if (d4 < 60.0d) {
            return timeUtilsContract.w(60000L);
        }
        if (d4 < 900.0d) {
            return timeUtilsContract.w((long) (d4 * d2));
        }
        if (d <= 1.0d) {
            return cb0.h((int) d3, " mts");
        }
        double dPow = Math.pow(10.0d, 1);
        return vo1.A(String.valueOf(((double) MathKt.e(d * dPow)) / dPow), " km");
    }

    public static boolean c(boolean z, List frequencyDataArray, TimeUtilsContract timeUtilsContract) {
        Intrinsics.i(frequencyDataArray, "frequencyDataArray");
        Intrinsics.i(timeUtilsContract, "timeUtilsContract");
        Object obj = null;
        int iB = timeUtilsContract.B(null);
        if (!z) {
            return false;
        }
        for (Object obj2 : frequencyDataArray) {
            FrequencyAppModel frequencyAppModel = (FrequencyAppModel) obj2;
            if (frequencyAppModel.f9493a.a(iB) || frequencyAppModel.f9493a.f9503a > iB) {
                obj = obj2;
                break;
            }
        }
        return obj == null;
    }

    public static boolean d(List list) {
        Intrinsics.i(list, "<this>");
        List list2 = list;
        if ((list2 instanceof Collection) && list2.isEmpty()) {
            return false;
        }
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            if (((NearbyTripsDataManagerResult) it.next()).b instanceof NearbyTripsDataManagerEtaResult.EtaReceived) {
                return true;
            }
        }
        return false;
    }

    public static List e(List list) {
        Intrinsics.i(list, "<this>");
        return CollectionsKt.v0(new vb(new Function1[]{new mb1(11), new mb1(12)}, 3), list);
    }
}
