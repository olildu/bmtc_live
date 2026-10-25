package app.chalo.livetracking.tripplanner.domain;

import app.chalo.citydata.data.model.app.TimeTableStatus;
import app.chalo.features.wallet.CurrencyFeature;
import app.chalo.livetracking.tripplanner.data.models.app.TripPlannerIntermediateStopInfoAppResponseModel;
import app.chalo.livetracking.tripplanner.data.models.app.TripPlannerLegAppModel;
import app.chalo.livetracking.tripplanner.data.models.app.TripPlannerLegFareInfoAppResponseModel;
import app.chalo.livetracking.tripplanner.ui.result.TripPlannerLegUiModel;
import app.chalo.providers.RouteNamingSchemeType;
import app.chalo.providers.stringprovider.StringEnum;
import app.chalo.providers.stringprovider.StringProvider;
import app.chalo.stoptripdetails.domain.GetTimeTableDisclaimerTextUseCase;
import app.chalo.utils.timeutil.TimeUtilsContract;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/livetracking/tripplanner/domain/ProcessTripPlannerLegForUiUseCase;", "", "livetracking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class ProcessTripPlannerLegForUiUseCase {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final GetTimeTableDisclaimerTextUseCase f4709a;
    public final StringProvider b;
    public final CurrencyFeature c;
    public final TimeUtilsContract d;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f4710a;

        static {
            int[] iArr = new int[TimeTableStatus.values().length];
            try {
                iArr[TimeTableStatus.INVALID.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[TimeTableStatus.VALID.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[TimeTableStatus.VALID_WITH_DISCLAIMER.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[TimeTableStatus.UNKNOWN.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f4710a = iArr;
        }
    }

    public ProcessTripPlannerLegForUiUseCase(GetTimeTableDisclaimerTextUseCase getTimeTableDisclaimerTextUseCase, StringProvider stringProvider, CurrencyFeature currencyFeature, TimeUtilsContract timeUtilsContract) {
        this.f4709a = getTimeTableDisclaimerTextUseCase;
        this.b = stringProvider;
        this.c = currencyFeature;
        this.d = timeUtilsContract;
    }

    public final String a(TripPlannerLegFareInfoAppResponseModel tripPlannerLegFareInfoAppResponseModel) {
        if (tripPlannerLegFareInfoAppResponseModel.b == null) {
            return null;
        }
        return this.c.d() + ((int) tripPlannerLegFareInfoAppResponseModel.b.doubleValue());
    }

    /* JADX WARN: Code duplicated, block: B:39:0x00d6  */
    /* JADX WARN: Code duplicated, block: B:40:0x00d8  */
    /* JADX WARN: Code duplicated, block: B:67:0x0147  */
    /* JADX WARN: Code duplicated, block: B:68:0x0149  */
    /* JADX WARN: Code duplicated, block: B:7:0x001d  */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x009f, code lost:
    
        if (r4 == r6) goto L62;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00bf, code lost:
    
        if (r4 == r6) goto L62;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x0111, code lost:
    
        if (r4 == r6) goto L62;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x0131, code lost:
    
        if (r4 == r6) goto L62;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(app.chalo.livetracking.tripplanner.data.models.app.TripPlannerLegAppModel r18, app.chalo.providers.stringprovider.StringEnum r19, app.chalo.providers.stringprovider.StringEnum r20, kotlin.coroutines.jvm.internal.ContinuationImpl r21) {
        /*
            Method dump skipped, instruction units count: 383
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: app.chalo.livetracking.tripplanner.domain.ProcessTripPlannerLegForUiUseCase.b(app.chalo.livetracking.tripplanner.data.models.app.TripPlannerLegAppModel, app.chalo.providers.stringprovider.StringEnum, app.chalo.providers.stringprovider.StringEnum, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:100:0x01d5  */
    /* JADX WARN: Code duplicated, block: B:101:0x01de  */
    /* JADX WARN: Code duplicated, block: B:104:0x01e6  */
    /* JADX WARN: Code duplicated, block: B:105:0x01e9  */
    /* JADX WARN: Code duplicated, block: B:109:0x020a  */
    /* JADX WARN: Code duplicated, block: B:113:0x021a  */
    /* JADX WARN: Code duplicated, block: B:114:0x021d  */
    /* JADX WARN: Code duplicated, block: B:117:0x0225  */
    /* JADX WARN: Code duplicated, block: B:118:0x0228  */
    /* JADX WARN: Code duplicated, block: B:120:0x022c  */
    /* JADX WARN: Code duplicated, block: B:121:0x022f  */
    /* JADX WARN: Code duplicated, block: B:131:0x026f  */
    /* JADX WARN: Code duplicated, block: B:132:0x0274  */
    /* JADX WARN: Code duplicated, block: B:135:0x027a  */
    /* JADX WARN: Code duplicated, block: B:138:0x028c  */
    /* JADX WARN: Code duplicated, block: B:139:0x0292  */
    /* JADX WARN: Code duplicated, block: B:142:0x02a8  */
    /* JADX WARN: Code duplicated, block: B:143:0x02ab  */
    /* JADX WARN: Code duplicated, block: B:145:0x02b6  */
    /* JADX WARN: Code duplicated, block: B:147:0x02b9  */
    /* JADX WARN: Code duplicated, block: B:149:0x02bc  */
    /* JADX WARN: Code duplicated, block: B:152:0x02c0  */
    /* JADX WARN: Code duplicated, block: B:157:0x02d1  */
    /* JADX WARN: Code duplicated, block: B:160:0x02d6  */
    /* JADX WARN: Code duplicated, block: B:163:0x02ec  */
    /* JADX WARN: Code duplicated, block: B:164:0x02ef  */
    /* JADX WARN: Code duplicated, block: B:168:0x0312  */
    /* JADX WARN: Code duplicated, block: B:172:0x0322  */
    /* JADX WARN: Code duplicated, block: B:173:0x0325  */
    /* JADX WARN: Code duplicated, block: B:176:0x032d  */
    /* JADX WARN: Code duplicated, block: B:177:0x0330  */
    /* JADX WARN: Code duplicated, block: B:179:0x0334  */
    /* JADX WARN: Code duplicated, block: B:180:0x0337  */
    /* JADX WARN: Code duplicated, block: B:186:0x031c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:188:0x030c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:191:0x0214 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:193:0x0204 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:76:0x017a  */
    /* JADX WARN: Code duplicated, block: B:77:0x017d  */
    /* JADX WARN: Code duplicated, block: B:79:0x0187  */
    /* JADX WARN: Code duplicated, block: B:7:0x0021  */
    /* JADX WARN: Code duplicated, block: B:80:0x0189 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:81:0x018b A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:83:0x018e  */
    /* JADX WARN: Code duplicated, block: B:88:0x01a2  */
    /* JADX WARN: Code duplicated, block: B:91:0x01a9  */
    /* JADX WARN: Code duplicated, block: B:94:0x01bd  */
    /* JADX WARN: Code duplicated, block: B:97:0x01c5  */
    public final Object c(TripPlannerLegAppModel tripPlannerLegAppModel, String str, String str2, StringEnum stringEnum, StringEnum stringEnum2, ContinuationImpl continuationImpl) {
        ProcessTripPlannerLegForUiUseCase$invoke$1 processTripPlannerLegForUiUseCase$invoke$1;
        String str3;
        TripPlannerLegAppModel.Bus bus;
        Integer num;
        TimeTableStatus timeTableStatus;
        int i;
        Object objA;
        String str4;
        String str5;
        String str6;
        TripPlannerLegAppModel tripPlannerLegAppModel2;
        List list;
        String strA;
        int size;
        String str7;
        String str8;
        ArrayList arrayList;
        Iterator it;
        String str9;
        String str10;
        String str11;
        String str12;
        String str13;
        TripPlannerLegFareInfoAppResponseModel tripPlannerLegFareInfoAppResponseModel;
        Integer num2;
        List list2;
        String strA2;
        long jDoubleValue;
        int size2;
        TimeTableStatus timeTableStatus2;
        int i2;
        Object objA2;
        TripPlannerLegAppModel tripPlannerLegAppModel3;
        String str14;
        String str15;
        String str16;
        long j;
        int i3;
        String str17;
        String str18;
        ArrayList arrayList2;
        Iterator it2;
        String str19;
        String str20;
        String str21;
        String str22;
        TripPlannerLegAppModel tripPlannerLegAppModel4 = tripPlannerLegAppModel;
        String str23 = str;
        String str24 = str2;
        if (continuationImpl instanceof ProcessTripPlannerLegForUiUseCase$invoke$1) {
            processTripPlannerLegForUiUseCase$invoke$1 = (ProcessTripPlannerLegForUiUseCase$invoke$1) continuationImpl;
            int i4 = processTripPlannerLegForUiUseCase$invoke$1.label;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                processTripPlannerLegForUiUseCase$invoke$1.label = i4 - Integer.MIN_VALUE;
            } else {
                processTripPlannerLegForUiUseCase$invoke$1 = new ProcessTripPlannerLegForUiUseCase$invoke$1(this, continuationImpl);
            }
        } else {
            processTripPlannerLegForUiUseCase$invoke$1 = new ProcessTripPlannerLegForUiUseCase$invoke$1(this, continuationImpl);
        }
        Object objB = processTripPlannerLegForUiUseCase$invoke$1.result;
        Object obj = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i5 = processTripPlannerLegForUiUseCase$invoke$1.label;
        GetTimeTableDisclaimerTextUseCase getTimeTableDisclaimerTextUseCase = this.f4709a;
        TimeUtilsContract timeUtilsContract = this.d;
        if (i5 != 0) {
            if (i5 == 1) {
                String str25 = (String) processTripPlannerLegForUiUseCase$invoke$1.L$2;
                str23 = (String) processTripPlannerLegForUiUseCase$invoke$1.L$1;
                TripPlannerLegAppModel tripPlannerLegAppModel5 = (TripPlannerLegAppModel) processTripPlannerLegForUiUseCase$invoke$1.L$0;
                ResultKt.b(objB);
                str24 = str25;
                tripPlannerLegAppModel4 = tripPlannerLegAppModel5;
                str3 = (String) objB;
                bus = (TripPlannerLegAppModel.Bus) tripPlannerLegAppModel4;
                processTripPlannerLegForUiUseCase$invoke$1.L$0 = tripPlannerLegAppModel4;
                processTripPlannerLegForUiUseCase$invoke$1.L$1 = str23;
                processTripPlannerLegForUiUseCase$invoke$1.L$2 = str24;
                processTripPlannerLegForUiUseCase$invoke$1.L$3 = str3;
                processTripPlannerLegForUiUseCase$invoke$1.label = 2;
                num = bus.x;
                timeTableStatus = bus.y;
                if (num != null) {
                    i = WhenMappings.f4710a[timeTableStatus.ordinal()];
                    if (i != 1) {
                        if (i != 2) {
                            if (i != 3) {
                                if (i != 4) {
                                    throw new NoWhenBranchMatchedException();
                                }
                            }
                        }
                        objB = null;
                    }
                    objA = getTimeTableDisclaimerTextUseCase.a(timeTableStatus, bus.x.intValue(), processTripPlannerLegForUiUseCase$invoke$1);
                    if (objA != obj) {
                        objA = (String) objA;
                    }
                    objB = objA;
                } else {
                    objB = null;
                }
                if (objB != obj) {
                    String str26 = str24;
                    str4 = str23;
                    str5 = str26;
                    str6 = str3;
                    tripPlannerLegAppModel2 = tripPlannerLegAppModel4;
                }
                return obj;
            }
            if (i5 != 2) {
                if (i5 == 3) {
                    String str27 = (String) processTripPlannerLegForUiUseCase$invoke$1.L$2;
                    str23 = (String) processTripPlannerLegForUiUseCase$invoke$1.L$1;
                    TripPlannerLegAppModel tripPlannerLegAppModel6 = (TripPlannerLegAppModel) processTripPlannerLegForUiUseCase$invoke$1.L$0;
                    ResultKt.b(objB);
                    str24 = str27;
                    tripPlannerLegAppModel4 = tripPlannerLegAppModel6;
                    str13 = (String) objB;
                    TripPlannerLegAppModel.Metro metro = (TripPlannerLegAppModel.Metro) tripPlannerLegAppModel4;
                    tripPlannerLegFareInfoAppResponseModel = metro.B;
                    num2 = metro.x;
                    list2 = metro.A;
                    if (tripPlannerLegFareInfoAppResponseModel != null) {
                        strA2 = a(tripPlannerLegFareInfoAppResponseModel);
                    } else {
                        strA2 = null;
                    }
                    Double d = metro.l;
                    jDoubleValue = (long) (((double) 1000) * (d != null ? d.doubleValue() : 0.0d));
                    if (list2.size() >= 2) {
                        size2 = list2.size() - 2;
                    } else {
                        size2 = 0;
                    }
                    processTripPlannerLegForUiUseCase$invoke$1.L$0 = tripPlannerLegAppModel4;
                    processTripPlannerLegForUiUseCase$invoke$1.L$1 = str23;
                    processTripPlannerLegForUiUseCase$invoke$1.L$2 = str24;
                    processTripPlannerLegForUiUseCase$invoke$1.L$3 = str13;
                    processTripPlannerLegForUiUseCase$invoke$1.L$4 = strA2;
                    processTripPlannerLegForUiUseCase$invoke$1.J$0 = jDoubleValue;
                    processTripPlannerLegForUiUseCase$invoke$1.I$0 = size2;
                    processTripPlannerLegForUiUseCase$invoke$1.label = 4;
                    timeTableStatus2 = metro.y;
                    if (num2 != null) {
                        i2 = WhenMappings.f4710a[timeTableStatus2.ordinal()];
                        if (i2 != 1) {
                            if (i2 != 2) {
                                if (i2 != 3) {
                                    if (i2 != 4) {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                }
                            }
                            objA2 = null;
                        }
                        objA2 = getTimeTableDisclaimerTextUseCase.a(timeTableStatus2, num2.intValue(), processTripPlannerLegForUiUseCase$invoke$1);
                        if (objA2 != obj) {
                            objA2 = (String) objA2;
                        }
                    } else {
                        objA2 = null;
                    }
                    if (objA2 != obj) {
                        tripPlannerLegAppModel3 = tripPlannerLegAppModel4;
                        str14 = str23;
                        str15 = str24;
                        str16 = strA2;
                        j = jDoubleValue;
                        i3 = size2;
                        objB = objA2;
                    }
                    return obj;
                }
                if (i5 != 4) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                int i6 = processTripPlannerLegForUiUseCase$invoke$1.I$0;
                j = processTripPlannerLegForUiUseCase$invoke$1.J$0;
                str16 = (String) processTripPlannerLegForUiUseCase$invoke$1.L$4;
                str13 = (String) processTripPlannerLegForUiUseCase$invoke$1.L$3;
                str15 = (String) processTripPlannerLegForUiUseCase$invoke$1.L$2;
                str14 = (String) processTripPlannerLegForUiUseCase$invoke$1.L$1;
                tripPlannerLegAppModel3 = (TripPlannerLegAppModel) processTripPlannerLegForUiUseCase$invoke$1.L$0;
                ResultKt.b(objB);
                i3 = i6;
                String str28 = str13;
                String str29 = (String) objB;
                TripPlannerLegAppModel.Metro metro2 = (TripPlannerLegAppModel.Metro) tripPlannerLegAppModel3;
                String str30 = metro2.p;
                str17 = metro2.q;
                if (str17 == null) {
                    str18 = "";
                } else {
                    str18 = str17;
                }
                RouteNamingSchemeType routeNamingSchemeType = metro2.C;
                String str31 = metro2.s.b;
                String str32 = metro2.u.b;
                String str33 = metro2.D;
                List list3 = metro2.z;
                List list4 = metro2.A;
                arrayList2 = new ArrayList();
                it2 = list4.iterator();
                while (it2.hasNext()) {
                    str22 = ((TripPlannerIntermediateStopInfoAppResponseModel) it2.next()).b;
                    if (str22 != null) {
                        arrayList2.add(str22);
                    }
                }
                if (str16 == null) {
                    str19 = "";
                } else {
                    str19 = str16;
                }
                String strW = timeUtilsContract.w(j);
                if (str14 == null) {
                    str20 = "";
                } else {
                    str20 = str14;
                }
                if (str15 == null) {
                    str21 = "";
                } else {
                    str21 = str15;
                }
                return new TripPlannerLegUiModel.Metro(str30, str18, routeNamingSchemeType, str33, str31, str32, list3, null, str28, null, arrayList2, str19, strW, str20, str21, i3, str29, metro2.G, metro2.H, metro2.I);
            }
            String str34 = (String) processTripPlannerLegForUiUseCase$invoke$1.L$3;
            str5 = (String) processTripPlannerLegForUiUseCase$invoke$1.L$2;
            str4 = (String) processTripPlannerLegForUiUseCase$invoke$1.L$1;
            tripPlannerLegAppModel2 = (TripPlannerLegAppModel) processTripPlannerLegForUiUseCase$invoke$1.L$0;
            ResultKt.b(objB);
            str6 = str34;
            String str35 = (String) objB;
            TripPlannerLegAppModel.Bus bus2 = (TripPlannerLegAppModel.Bus) tripPlannerLegAppModel2;
            TripPlannerLegFareInfoAppResponseModel tripPlannerLegFareInfoAppResponseModel2 = bus2.B;
            list = bus2.A;
            strA = tripPlannerLegFareInfoAppResponseModel2 != null ? a(tripPlannerLegFareInfoAppResponseModel2) : null;
            Double d2 = bus2.l;
            long jDoubleValue2 = (long) (((double) 1000) * (d2 != null ? d2.doubleValue() : 0.0d));
            if (list.size() >= 2) {
                size = list.size() - 2;
            } else {
                size = 0;
            }
            String str36 = bus2.p;
            str7 = bus2.q;
            if (str7 == null) {
                str8 = "";
            } else {
                str8 = str7;
            }
            RouteNamingSchemeType routeNamingSchemeType2 = bus2.C;
            String str37 = bus2.s.b;
            String str38 = bus2.u.b;
            String str39 = bus2.D;
            List list5 = bus2.z;
            arrayList = new ArrayList();
            it = list.iterator();
            while (it.hasNext()) {
                str12 = ((TripPlannerIntermediateStopInfoAppResponseModel) it.next()).b;
                if (str12 != null) {
                    arrayList.add(str12);
                }
            }
            if (strA == null) {
                str9 = "";
            } else {
                str9 = strA;
            }
            String strW2 = timeUtilsContract.w(jDoubleValue2);
            if (str4 == null) {
                str10 = "";
            } else {
                str10 = str4;
            }
            if (str5 == null) {
                str11 = "";
            } else {
                str11 = str5;
            }
            return new TripPlannerLegUiModel.Bus(str36, str8, routeNamingSchemeType2, str39, str37, str38, list5, null, str6, null, arrayList, str9, strW2, str10, str11, size, str35, bus2.G);
        }
        ResultKt.b(objB);
        if (Intrinsics.d(tripPlannerLegAppModel4, TripPlannerLegAppModel.MonoRail.INSTANCE)) {
            return TripPlannerLegUiModel.MonoRail.f4758a;
        }
        if (tripPlannerLegAppModel4 instanceof TripPlannerLegAppModel.Railway) {
            return TripPlannerLegUiModel.Railway.f4759a;
        }
        if (Intrinsics.d(tripPlannerLegAppModel4, TripPlannerLegAppModel.Ferry.INSTANCE)) {
            return TripPlannerLegUiModel.Ferry.f4756a;
        }
        if (tripPlannerLegAppModel4 instanceof TripPlannerLegAppModel.Auto) {
            TripPlannerLegAppModel.Auto auto = (TripPlannerLegAppModel.Auto) tripPlannerLegAppModel4;
            Double d3 = auto.k;
            long jDoubleValue3 = (long) (((double) 1000) * (d3 != null ? d3.doubleValue() : 0.0d));
            TripPlannerLegFareInfoAppResponseModel tripPlannerLegFareInfoAppResponseModel3 = auto.o;
            String strA3 = tripPlannerLegFareInfoAppResponseModel3 != null ? a(tripPlannerLegFareInfoAppResponseModel3) : null;
            String str40 = auto.l;
            if (str40 == null) {
                str40 = "";
            }
            return new TripPlannerLegUiModel.Auto(str40, timeUtilsContract.w(jDoubleValue3), strA3);
        }
        if (tripPlannerLegAppModel4 instanceof TripPlannerLegAppModel.Taxi) {
            TripPlannerLegAppModel.Taxi taxi = (TripPlannerLegAppModel.Taxi) tripPlannerLegAppModel4;
            Double d4 = taxi.k;
            long jDoubleValue4 = (long) (((double) 1000) * (d4 != null ? d4.doubleValue() : 0.0d));
            TripPlannerLegFareInfoAppResponseModel tripPlannerLegFareInfoAppResponseModel4 = taxi.o;
            String strA4 = tripPlannerLegFareInfoAppResponseModel4 != null ? a(tripPlannerLegFareInfoAppResponseModel4) : null;
            String str41 = taxi.l;
            if (str41 == null) {
                str41 = "";
            }
            return new TripPlannerLegUiModel.Taxi(str41, timeUtilsContract.w(jDoubleValue4), strA4);
        }
        if (tripPlannerLegAppModel4 instanceof TripPlannerLegAppModel.Walk) {
            TripPlannerLegAppModel.Walk walk = (TripPlannerLegAppModel.Walk) tripPlannerLegAppModel4;
            Double d5 = walk.l;
            long jDoubleValue5 = (long) (((double) 1000) * (d5 != null ? d5.doubleValue() : 0.0d));
            String str42 = walk.n;
            if (str42 == null) {
                str42 = "";
            }
            return new TripPlannerLegUiModel.Walk(str42, timeUtilsContract.w(jDoubleValue5));
        }
        if (tripPlannerLegAppModel4 instanceof TripPlannerLegAppModel.Bus) {
            processTripPlannerLegForUiUseCase$invoke$1.L$0 = tripPlannerLegAppModel4;
            processTripPlannerLegForUiUseCase$invoke$1.L$1 = str23;
            processTripPlannerLegForUiUseCase$invoke$1.L$2 = str24;
            processTripPlannerLegForUiUseCase$invoke$1.label = 1;
            objB = b(tripPlannerLegAppModel4, stringEnum, stringEnum2, processTripPlannerLegForUiUseCase$invoke$1);
            if (objB != obj) {
                str3 = (String) objB;
                bus = (TripPlannerLegAppModel.Bus) tripPlannerLegAppModel4;
                processTripPlannerLegForUiUseCase$invoke$1.L$0 = tripPlannerLegAppModel4;
                processTripPlannerLegForUiUseCase$invoke$1.L$1 = str23;
                processTripPlannerLegForUiUseCase$invoke$1.L$2 = str24;
                processTripPlannerLegForUiUseCase$invoke$1.L$3 = str3;
                processTripPlannerLegForUiUseCase$invoke$1.label = 2;
                num = bus.x;
                timeTableStatus = bus.y;
                if (num != null) {
                    i = WhenMappings.f4710a[timeTableStatus.ordinal()];
                    if (i != 1) {
                        if (i != 2) {
                            if (i != 3) {
                                if (i != 4) {
                                    throw new NoWhenBranchMatchedException();
                                }
                            }
                        }
                        objB = null;
                    }
                    objA = getTimeTableDisclaimerTextUseCase.a(timeTableStatus, bus.x.intValue(), processTripPlannerLegForUiUseCase$invoke$1);
                    if (objA != obj) {
                        objA = (String) objA;
                    }
                    objB = objA;
                } else {
                    objB = null;
                }
                if (objB != obj) {
                    String str210 = str24;
                    str4 = str23;
                    str5 = str210;
                    str6 = str3;
                    tripPlannerLegAppModel2 = tripPlannerLegAppModel4;
                    String str310 = (String) objB;
                    TripPlannerLegAppModel.Bus bus3 = (TripPlannerLegAppModel.Bus) tripPlannerLegAppModel2;
                    TripPlannerLegFareInfoAppResponseModel tripPlannerLegFareInfoAppResponseModel5 = bus3.B;
                    list = bus3.A;
                    if (tripPlannerLegFareInfoAppResponseModel5 != null) {
                    }
                    Double d6 = bus3.l;
                    long jDoubleValue6 = (long) (((double) 1000) * (d6 != null ? d6.doubleValue() : 0.0d));
                    if (list.size() >= 2) {
                        size = list.size() - 2;
                    } else {
                        size = 0;
                    }
                    String str311 = bus3.p;
                    str7 = bus3.q;
                    if (str7 == null) {
                        str8 = "";
                    } else {
                        str8 = str7;
                    }
                    RouteNamingSchemeType routeNamingSchemeType3 = bus3.C;
                    String str312 = bus3.s.b;
                    String str313 = bus3.u.b;
                    String str314 = bus3.D;
                    List list6 = bus3.z;
                    arrayList = new ArrayList();
                    it = list.iterator();
                    while (it.hasNext()) {
                        str12 = ((TripPlannerIntermediateStopInfoAppResponseModel) it.next()).b;
                        if (str12 != null) {
                            arrayList.add(str12);
                        }
                    }
                    if (strA == null) {
                        str9 = "";
                    } else {
                        str9 = strA;
                    }
                    String strW3 = timeUtilsContract.w(jDoubleValue6);
                    if (str4 == null) {
                        str10 = "";
                    } else {
                        str10 = str4;
                    }
                    if (str5 == null) {
                        str11 = "";
                    } else {
                        str11 = str5;
                    }
                    return new TripPlannerLegUiModel.Bus(str311, str8, routeNamingSchemeType3, str314, str312, str313, list6, null, str6, null, arrayList, str9, strW3, str10, str11, size, str310, bus3.G);
                }
            }
        } else {
            if (!(tripPlannerLegAppModel4 instanceof TripPlannerLegAppModel.Metro)) {
                throw new NoWhenBranchMatchedException();
            }
            processTripPlannerLegForUiUseCase$invoke$1.L$0 = tripPlannerLegAppModel4;
            processTripPlannerLegForUiUseCase$invoke$1.L$1 = str23;
            processTripPlannerLegForUiUseCase$invoke$1.L$2 = str24;
            processTripPlannerLegForUiUseCase$invoke$1.label = 3;
            objB = b(tripPlannerLegAppModel4, stringEnum, stringEnum2, processTripPlannerLegForUiUseCase$invoke$1);
            if (objB != obj) {
                str13 = (String) objB;
                TripPlannerLegAppModel.Metro metro3 = (TripPlannerLegAppModel.Metro) tripPlannerLegAppModel4;
                tripPlannerLegFareInfoAppResponseModel = metro3.B;
                num2 = metro3.x;
                list2 = metro3.A;
                if (tripPlannerLegFareInfoAppResponseModel != null) {
                    strA2 = a(tripPlannerLegFareInfoAppResponseModel);
                } else {
                    strA2 = null;
                }
                Double d7 = metro3.l;
                jDoubleValue = (long) (((double) 1000) * (d7 != null ? d7.doubleValue() : 0.0d));
                if (list2.size() >= 2) {
                    size2 = list2.size() - 2;
                } else {
                    size2 = 0;
                }
                processTripPlannerLegForUiUseCase$invoke$1.L$0 = tripPlannerLegAppModel4;
                processTripPlannerLegForUiUseCase$invoke$1.L$1 = str23;
                processTripPlannerLegForUiUseCase$invoke$1.L$2 = str24;
                processTripPlannerLegForUiUseCase$invoke$1.L$3 = str13;
                processTripPlannerLegForUiUseCase$invoke$1.L$4 = strA2;
                processTripPlannerLegForUiUseCase$invoke$1.J$0 = jDoubleValue;
                processTripPlannerLegForUiUseCase$invoke$1.I$0 = size2;
                processTripPlannerLegForUiUseCase$invoke$1.label = 4;
                timeTableStatus2 = metro3.y;
                if (num2 != null) {
                    i2 = WhenMappings.f4710a[timeTableStatus2.ordinal()];
                    if (i2 != 1) {
                        if (i2 != 2) {
                            if (i2 != 3) {
                                if (i2 != 4) {
                                    throw new NoWhenBranchMatchedException();
                                }
                            }
                        }
                        objA2 = null;
                    }
                    objA2 = getTimeTableDisclaimerTextUseCase.a(timeTableStatus2, num2.intValue(), processTripPlannerLegForUiUseCase$invoke$1);
                    if (objA2 != obj) {
                        objA2 = (String) objA2;
                    }
                } else {
                    objA2 = null;
                }
                if (objA2 != obj) {
                    tripPlannerLegAppModel3 = tripPlannerLegAppModel4;
                    str14 = str23;
                    str15 = str24;
                    str16 = strA2;
                    j = jDoubleValue;
                    i3 = size2;
                    objB = objA2;
                    String str211 = str13;
                    String str212 = (String) objB;
                    TripPlannerLegAppModel.Metro metro4 = (TripPlannerLegAppModel.Metro) tripPlannerLegAppModel3;
                    String str315 = metro4.p;
                    str17 = metro4.q;
                    if (str17 == null) {
                        str18 = "";
                    } else {
                        str18 = str17;
                    }
                    RouteNamingSchemeType routeNamingSchemeType4 = metro4.C;
                    String str316 = metro4.s.b;
                    String str317 = metro4.u.b;
                    String str318 = metro4.D;
                    List list7 = metro4.z;
                    List list8 = metro4.A;
                    arrayList2 = new ArrayList();
                    it2 = list8.iterator();
                    while (it2.hasNext()) {
                        str22 = ((TripPlannerIntermediateStopInfoAppResponseModel) it2.next()).b;
                        if (str22 != null) {
                            arrayList2.add(str22);
                        }
                    }
                    if (str16 == null) {
                        str19 = "";
                    } else {
                        str19 = str16;
                    }
                    String strW4 = timeUtilsContract.w(j);
                    if (str14 == null) {
                        str20 = "";
                    } else {
                        str20 = str14;
                    }
                    if (str15 == null) {
                        str21 = "";
                    } else {
                        str21 = str15;
                    }
                    return new TripPlannerLegUiModel.Metro(str315, str18, routeNamingSchemeType4, str318, str316, str317, list7, null, str211, null, arrayList2, str19, strW4, str20, str21, i3, str212, metro4.G, metro4.H, metro4.I);
                }
            }
        }
        return obj;
    }
}
