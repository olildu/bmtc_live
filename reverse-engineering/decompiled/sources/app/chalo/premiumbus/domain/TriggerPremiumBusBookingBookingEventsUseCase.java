package app.chalo.premiumbus.domain;

import app.chalo.analytics.contract.AnalyticsContract;
import app.chalo.constants.Source;
import app.chalo.contract.BasicInfoContract;
import app.chalo.data.PremiumBusNativeCityWiseConfigAppModel;
import app.chalo.datastore.LocalDataStore$getFlowFromLocalDataStore$$inlined$map$1;
import app.chalo.features.adjust.AdjustManager;
import app.chalo.premiumbus.data.PremiumBusDataStoreWrapper;
import app.chalo.premiumbus.data.models.app.PremiumPassengerDetailsAppModel;
import app.chalo.premiumbus.data.models.app.PremiumReserveTicketAppModel;
import app.chalo.premiumbus.data.models.app.PremiumReserveTicketBookingPropertiesAppModel;
import app.chalo.premiumbus.data.models.app.PremiumReserveTicketFareAndPassengerPropertiesAppModel;
import app.chalo.premiumbus.data.models.app.PremiumReserveTicketTripPropertiesAppModel;
import app.chalo.premiumbus.data.models.app.PremiumStopDetailsAppModel;
import app.chalo.premiumbus.data.repository.PremiumBusRepository;
import app.chalo.providers.cityprovider.CityProvider;
import app.chalo.providers.cityprovider.CityProviderKt;
import app.chalo.usecase.GetPremiumBusCurrentCityConfigUseCase;
import defpackage.uf0;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.EmptyList;
import kotlin.collections.MapsKt;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/premiumbus/domain/TriggerPremiumBusBookingBookingEventsUseCase;", "", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class TriggerPremiumBusBookingBookingEventsUseCase {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final PremiumBusRepository f7260a;
    public final GetPremiumBusCurrentCityConfigUseCase b;
    public final GetPremiumReserveTicketByIdUseCase c;
    public final CityProvider d;
    public final AnalyticsContract e;
    public final AdjustManager f;
    public final PremiumBusDataStoreWrapper g;
    public final BasicInfoContract h;

    public TriggerPremiumBusBookingBookingEventsUseCase(PremiumBusRepository premiumBusRepository, GetPremiumBusCurrentCityConfigUseCase getPremiumBusCurrentCityConfigUseCase, GetPremiumReserveTicketByIdUseCase getPremiumReserveTicketByIdUseCase, CityProvider cityProvider, AnalyticsContract analyticsContract, AdjustManager adjustManager, PremiumBusDataStoreWrapper premiumBusDataStoreWrapper, BasicInfoContract basicInfoContract) {
        this.f7260a = premiumBusRepository;
        this.b = getPremiumBusCurrentCityConfigUseCase;
        this.c = getPremiumReserveTicketByIdUseCase;
        this.d = cityProvider;
        this.e = analyticsContract;
        this.f = adjustManager;
        this.g = premiumBusDataStoreWrapper;
        this.h = basicInfoContract;
    }

    public static String a(TriggerPremiumBusBookingBookingEventsUseCase triggerPremiumBusBookingBookingEventsUseCase, int i) {
        boolean z = (i & 1) == 0;
        boolean z2 = (i & 2) == 0;
        boolean z3 = (i & 4) == 0;
        boolean z4 = (i & 8) == 0;
        if (triggerPremiumBusBookingBookingEventsUseCase.h.f()) {
            if (z) {
                return "ncd1rq";
            }
            if (z2) {
                return "swt8mi";
            }
            if (z3) {
                return "231zsn";
            }
            if (z4) {
                return "c92g1r";
            }
            return null;
        }
        if (z) {
            return "czhnbr";
        }
        if (z2) {
            return "qy5cse";
        }
        if (z3) {
            return "c9urxh";
        }
        if (z4) {
            return "u68w5o";
        }
        return null;
    }

    public static Map c(PremiumReserveTicketAppModel premiumReserveTicketAppModel) {
        PremiumReserveTicketBookingPropertiesAppModel premiumReserveTicketBookingPropertiesAppModel = premiumReserveTicketAppModel.f7113a;
        Pair pair = new Pair("bookingId", premiumReserveTicketBookingPropertiesAppModel.f7114a);
        PremiumReserveTicketTripPropertiesAppModel premiumReserveTicketTripPropertiesAppModel = premiumReserveTicketAppModel.b;
        Pair pair2 = new Pair("tripId", premiumReserveTicketTripPropertiesAppModel.f7117a);
        Pair pair3 = new Pair("route id", premiumReserveTicketTripPropertiesAppModel.e);
        Pair pair4 = new Pair("route name", premiumReserveTicketTripPropertiesAppModel.f);
        PremiumStopDetailsAppModel premiumStopDetailsAppModel = premiumReserveTicketTripPropertiesAppModel.g;
        Pair pair5 = new Pair("fromStopId", premiumStopDetailsAppModel.f7121a);
        PremiumStopDetailsAppModel premiumStopDetailsAppModel2 = premiumReserveTicketTripPropertiesAppModel.h;
        Pair pair6 = new Pair("toStopId", premiumStopDetailsAppModel2.f7121a);
        Pair pair7 = new Pair("fromStopName", premiumStopDetailsAppModel.b);
        Pair pair8 = new Pair("toStopName", premiumStopDetailsAppModel2.b);
        String str = premiumReserveTicketBookingPropertiesAppModel.j;
        if (str == null) {
            str = "";
        }
        return MapsKt.i(pair, pair2, pair3, pair4, pair5, pair6, pair7, pair8, new Pair("passId", str));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object b(ContinuationImpl continuationImpl) {
        TriggerPremiumBusBookingBookingEventsUseCase$getAllPremiumReserveTickets$1 triggerPremiumBusBookingBookingEventsUseCase$getAllPremiumReserveTickets$1;
        String lowerCase;
        if (continuationImpl instanceof TriggerPremiumBusBookingBookingEventsUseCase$getAllPremiumReserveTickets$1) {
            triggerPremiumBusBookingBookingEventsUseCase$getAllPremiumReserveTickets$1 = (TriggerPremiumBusBookingBookingEventsUseCase$getAllPremiumReserveTickets$1) continuationImpl;
            int i = triggerPremiumBusBookingBookingEventsUseCase$getAllPremiumReserveTickets$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                triggerPremiumBusBookingBookingEventsUseCase$getAllPremiumReserveTickets$1.label = i - Integer.MIN_VALUE;
            } else {
                triggerPremiumBusBookingBookingEventsUseCase$getAllPremiumReserveTickets$1 = new TriggerPremiumBusBookingBookingEventsUseCase$getAllPremiumReserveTickets$1(this, continuationImpl);
            }
        } else {
            triggerPremiumBusBookingBookingEventsUseCase$getAllPremiumReserveTickets$1 = new TriggerPremiumBusBookingBookingEventsUseCase$getAllPremiumReserveTickets$1(this, continuationImpl);
        }
        Object objV = triggerPremiumBusBookingBookingEventsUseCase$getAllPremiumReserveTickets$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = triggerPremiumBusBookingBookingEventsUseCase$getAllPremiumReserveTickets$1.label;
        if (i2 == 0) {
            ResultKt.b(objV);
            String strB = CityProviderKt.b(this.d);
            if (strB != null) {
                lowerCase = strB.toLowerCase(Locale.ROOT);
                Intrinsics.h(lowerCase, "toLowerCase(...)");
            } else {
                lowerCase = "";
            }
            Flow flowA = PremiumBusRepository.DefaultImpls.a(this.f7260a, lowerCase, null, 6);
            triggerPremiumBusBookingBookingEventsUseCase$getAllPremiumReserveTickets$1.label = 1;
            objV = FlowKt.v(flowA, triggerPremiumBusBookingBookingEventsUseCase$getAllPremiumReserveTickets$1);
            if (objV == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(objV);
        }
        List list = (List) objV;
        return list == null ? EmptyList.f17557a : list;
    }

    /* JADX WARN: Code duplicated, block: B:53:0x021d  */
    /* JADX WARN: Code duplicated, block: B:54:0x0226  */
    /* JADX WARN: Code duplicated, block: B:57:0x023b  */
    /* JADX WARN: Code duplicated, block: B:63:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    public final Object d(String str, String str2, boolean z, Map map, ContinuationImpl continuationImpl) {
        TriggerPremiumBusBookingBookingEventsUseCase$invoke$1 triggerPremiumBusBookingBookingEventsUseCase$invoke$1;
        String str3;
        Map map2;
        String str4;
        boolean z2;
        int i;
        int i2;
        int i3;
        Object obj;
        TriggerPremiumBusBookingBookingEventsUseCase$invoke$1 triggerPremiumBusBookingBookingEventsUseCase$invoke$2;
        PremiumReserveTicketAppModel premiumReserveTicketAppModel;
        Object objE;
        String str5;
        boolean zBooleanValue;
        String strA;
        String str6;
        if (continuationImpl instanceof TriggerPremiumBusBookingBookingEventsUseCase$invoke$1) {
            triggerPremiumBusBookingBookingEventsUseCase$invoke$1 = (TriggerPremiumBusBookingBookingEventsUseCase$invoke$1) continuationImpl;
            int i4 = triggerPremiumBusBookingBookingEventsUseCase$invoke$1.label;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                triggerPremiumBusBookingBookingEventsUseCase$invoke$1.label = i4 - Integer.MIN_VALUE;
            } else {
                triggerPremiumBusBookingBookingEventsUseCase$invoke$1 = new TriggerPremiumBusBookingBookingEventsUseCase$invoke$1(this, continuationImpl);
            }
        } else {
            triggerPremiumBusBookingBookingEventsUseCase$invoke$1 = new TriggerPremiumBusBookingBookingEventsUseCase$invoke$1(this, continuationImpl);
        }
        Object objV = triggerPremiumBusBookingBookingEventsUseCase$invoke$1.result;
        Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i5 = triggerPremiumBusBookingBookingEventsUseCase$invoke$1.label;
        AnalyticsContract analyticsContract = this.e;
        Unit unit = Unit.f17538a;
        if (i5 == 0) {
            ResultKt.b(objV);
            Flow flowA = this.c.a(str);
            triggerPremiumBusBookingBookingEventsUseCase$invoke$1.L$0 = str;
            str3 = str2;
            triggerPremiumBusBookingBookingEventsUseCase$invoke$1.L$1 = str3;
            map2 = map;
            triggerPremiumBusBookingBookingEventsUseCase$invoke$1.L$2 = map2;
            triggerPremiumBusBookingBookingEventsUseCase$invoke$1.Z$0 = z;
            triggerPremiumBusBookingBookingEventsUseCase$invoke$1.label = 1;
            objV = FlowKt.v(flowA, triggerPremiumBusBookingBookingEventsUseCase$invoke$1);
            if (objV != obj2) {
                str4 = str;
                z2 = z;
            }
            return obj2;
        }
        if (i5 == 1) {
            z2 = triggerPremiumBusBookingBookingEventsUseCase$invoke$1.Z$0;
            Map map3 = (Map) triggerPremiumBusBookingBookingEventsUseCase$invoke$1.L$2;
            String str7 = (String) triggerPremiumBusBookingBookingEventsUseCase$invoke$1.L$1;
            str4 = (String) triggerPremiumBusBookingBookingEventsUseCase$invoke$1.L$0;
            ResultKt.b(objV);
            map2 = map3;
            str3 = str7;
        } else {
            if (i5 != 2) {
                if (i5 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.b(objV);
                return unit;
            }
            PremiumReserveTicketAppModel premiumReserveTicketAppModel2 = (PremiumReserveTicketAppModel) triggerPremiumBusBookingBookingEventsUseCase$invoke$1.L$1;
            str3 = (String) triggerPremiumBusBookingBookingEventsUseCase$invoke$1.L$0;
            ResultKt.b(objV);
            premiumReserveTicketAppModel = premiumReserveTicketAppModel2;
            triggerPremiumBusBookingBookingEventsUseCase$invoke$2 = triggerPremiumBusBookingBookingEventsUseCase$invoke$1;
            obj = null;
            i = 7;
            i2 = 11;
            objE = objV;
            i3 = 3;
        }
        str5 = str3;
        zBooleanValue = ((Boolean) objE).booleanValue();
        if (zBooleanValue) {
            strA = a(this, i2);
            str6 = "booking_airportexpress";
        } else {
            strA = a(this, i);
            str6 = "booking_non_airportexpress";
        }
        AnalyticsContract.DefaultImpls.a(analyticsContract, str6, str5, c(premiumReserveTicketAppModel), null, true, 8);
        if (strA != null) {
            this.f.a(premiumReserveTicketAppModel.d.f7115a, strA);
        }
        triggerPremiumBusBookingBookingEventsUseCase$invoke$2.L$0 = obj;
        triggerPremiumBusBookingBookingEventsUseCase$invoke$2.L$1 = obj;
        triggerPremiumBusBookingBookingEventsUseCase$invoke$2.label = i3;
        if (j(premiumReserveTicketAppModel, zBooleanValue, str5, triggerPremiumBusBookingBookingEventsUseCase$invoke$2) != obj2) {
            return obj2;
        }
        return unit;
        PremiumReserveTicketAppModel premiumReserveTicketAppModel3 = (PremiumReserveTicketAppModel) objV;
        if (premiumReserveTicketAppModel3 == null) {
            return unit;
        }
        PremiumReserveTicketBookingPropertiesAppModel premiumReserveTicketBookingPropertiesAppModel = premiumReserveTicketAppModel3.f7113a;
        PremiumReserveTicketTripPropertiesAppModel premiumReserveTicketTripPropertiesAppModel = premiumReserveTicketAppModel3.b;
        String str8 = premiumReserveTicketTripPropertiesAppModel.f7117a;
        String str9 = premiumReserveTicketTripPropertiesAppModel.e;
        i = 7;
        String str10 = premiumReserveTicketTripPropertiesAppModel.f;
        i2 = 11;
        long j = premiumReserveTicketTripPropertiesAppModel.b;
        boolean z3 = z2;
        PremiumStopDetailsAppModel premiumStopDetailsAppModel = premiumReserveTicketTripPropertiesAppModel.g;
        String str11 = premiumStopDetailsAppModel.f7121a;
        String str12 = premiumStopDetailsAppModel.b;
        PremiumStopDetailsAppModel premiumStopDetailsAppModel2 = premiumReserveTicketTripPropertiesAppModel.h;
        String str13 = premiumStopDetailsAppModel2.f7121a;
        String str14 = premiumStopDetailsAppModel2.b;
        String strName = premiumReserveTicketBookingPropertiesAppModel.h.name();
        PremiumReserveTicketFareAndPassengerPropertiesAppModel premiumReserveTicketFareAndPassengerPropertiesAppModel = premiumReserveTicketAppModel3.d;
        TriggerPremiumBusBookingBookingEventsUseCase$invoke$1 triggerPremiumBusBookingBookingEventsUseCase$invoke$3 = triggerPremiumBusBookingBookingEventsUseCase$invoke$1;
        long j2 = premiumReserveTicketFareAndPassengerPropertiesAppModel.f7115a;
        String str15 = premiumReserveTicketBookingPropertiesAppModel.j;
        Iterator it = premiumReserveTicketFareAndPassengerPropertiesAppModel.b.iterator();
        int i6 = 0;
        while (it.hasNext()) {
            i6 += ((PremiumPassengerDetailsAppModel) it.next()).c;
            j2 = j2;
        }
        LinkedHashMap linkedHashMapK = MapsKt.k(new Pair("bookingId", str4), new Pair("tripId", str8), new Pair("route id", str9), new Pair("route name", str10), new Pair("tripDate", String.valueOf(j)), new Pair("pickupStopId", str11), new Pair("pickupStopName", str12), new Pair("dropStopId", str13), new Pair("dropStopName", str14), new Pair("ticketStatus", strName), new Pair("fare", String.valueOf(j2)), new Pair("passUsedForBooking", str15 == null ? "" : str15), new Pair("passengerCount", String.valueOf(i6)), new Pair("bookingSource", (str15 == null || str15.length() == 0) ? "" : "pass"), new Pair("couponApplied", Boolean.valueOf(z3)));
        if (map2 != null) {
            linkedHashMapK.putAll(map2);
        }
        Source source = Source.PRODUCT_BOOKING_SUCCESS_FRAGMENT;
        i3 = 3;
        analyticsContract = analyticsContract;
        obj = null;
        AnalyticsContract.DefaultImpls.a(analyticsContract, "pb booking confirmed", source.getSourceName(), linkedHashMapK, null, true, 8);
        if (z3) {
            AnalyticsContract.DefaultImpls.a(analyticsContract, "pb coupon booking confirmed", source.getSourceName(), null, null, true, 12);
        }
        triggerPremiumBusBookingBookingEventsUseCase$invoke$2 = triggerPremiumBusBookingBookingEventsUseCase$invoke$3;
        triggerPremiumBusBookingBookingEventsUseCase$invoke$2.L$0 = str3;
        premiumReserveTicketAppModel = premiumReserveTicketAppModel3;
        triggerPremiumBusBookingBookingEventsUseCase$invoke$2.L$1 = premiumReserveTicketAppModel;
        triggerPremiumBusBookingBookingEventsUseCase$invoke$2.L$2 = null;
        triggerPremiumBusBookingBookingEventsUseCase$invoke$2.label = 2;
        objE = e(premiumReserveTicketAppModel, triggerPremiumBusBookingBookingEventsUseCase$invoke$2);
        if (objE != obj2) {
            str5 = str3;
            zBooleanValue = ((Boolean) objE).booleanValue();
            if (zBooleanValue) {
                strA = a(this, i2);
                str6 = "booking_airportexpress";
            } else {
                strA = a(this, i);
                str6 = "booking_non_airportexpress";
            }
            AnalyticsContract.DefaultImpls.a(analyticsContract, str6, str5, c(premiumReserveTicketAppModel), null, true, 8);
            if (strA != null) {
                this.f.a(premiumReserveTicketAppModel.d.f7115a, strA);
            }
            triggerPremiumBusBookingBookingEventsUseCase$invoke$2.L$0 = obj;
            triggerPremiumBusBookingBookingEventsUseCase$invoke$2.L$1 = obj;
            triggerPremiumBusBookingBookingEventsUseCase$invoke$2.label = i3;
            if (j(premiumReserveTicketAppModel, zBooleanValue, str5, triggerPremiumBusBookingBookingEventsUseCase$invoke$2) != obj2) {
                return unit;
            }
        }
        return obj2;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object e(PremiumReserveTicketAppModel premiumReserveTicketAppModel, ContinuationImpl continuationImpl) {
        TriggerPremiumBusBookingBookingEventsUseCase$isBookingForAirport$1 triggerPremiumBusBookingBookingEventsUseCase$isBookingForAirport$1;
        if (continuationImpl instanceof TriggerPremiumBusBookingBookingEventsUseCase$isBookingForAirport$1) {
            triggerPremiumBusBookingBookingEventsUseCase$isBookingForAirport$1 = (TriggerPremiumBusBookingBookingEventsUseCase$isBookingForAirport$1) continuationImpl;
            int i = triggerPremiumBusBookingBookingEventsUseCase$isBookingForAirport$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                triggerPremiumBusBookingBookingEventsUseCase$isBookingForAirport$1.label = i - Integer.MIN_VALUE;
            } else {
                triggerPremiumBusBookingBookingEventsUseCase$isBookingForAirport$1 = new TriggerPremiumBusBookingBookingEventsUseCase$isBookingForAirport$1(this, continuationImpl);
            }
        } else {
            triggerPremiumBusBookingBookingEventsUseCase$isBookingForAirport$1 = new TriggerPremiumBusBookingBookingEventsUseCase$isBookingForAirport$1(this, continuationImpl);
        }
        Object objA = triggerPremiumBusBookingBookingEventsUseCase$isBookingForAirport$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = triggerPremiumBusBookingBookingEventsUseCase$isBookingForAirport$1.label;
        boolean z = true;
        if (i2 == 0) {
            ResultKt.b(objA);
            triggerPremiumBusBookingBookingEventsUseCase$isBookingForAirport$1.L$0 = premiumReserveTicketAppModel;
            triggerPremiumBusBookingBookingEventsUseCase$isBookingForAirport$1.label = 1;
            objA = this.b.a(triggerPremiumBusBookingBookingEventsUseCase$isBookingForAirport$1);
            if (objA == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            premiumReserveTicketAppModel = (PremiumReserveTicketAppModel) triggerPremiumBusBookingBookingEventsUseCase$isBookingForAirport$1.L$0;
            ResultKt.b(objA);
        }
        Iterable iterable = ((PremiumBusNativeCityWiseConfigAppModel) objA).f;
        if (iterable == null) {
            iterable = EmptyList.f17557a;
        }
        Iterable<String> iterable2 = iterable;
        if ((iterable2 instanceof Collection) && ((Collection) iterable2).isEmpty()) {
            z = false;
        } else {
            for (String str : iterable2) {
                if (Intrinsics.d(str, premiumReserveTicketAppModel.b.g.f7121a) || Intrinsics.d(str, premiumReserveTicketAppModel.b.h.f7121a)) {
                }
            }
            z = false;
        }
        return Boolean.valueOf(z);
    }

    /* JADX WARN: Code duplicated, block: B:27:0x0074 A[PHI: r2 r9
      0x0074: PHI (r2v6 java.lang.String) = (r2v2 java.lang.String), (r2v7 java.lang.String) binds: [B:26:0x006e, B:38:0x00a2] A[DONT_GENERATE, DONT_INLINE]
      0x0074: PHI (r9v5 java.util.Iterator) = (r9v2 java.util.Iterator), (r9v6 java.util.Iterator) binds: [B:26:0x006e, B:38:0x00a2] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:29:0x007a  */
    /* JADX WARN: Code duplicated, block: B:31:0x008a  */
    /* JADX WARN: Code duplicated, block: B:37:0x00a1  */
    /* JADX WARN: Code duplicated, block: B:39:0x00a4  */
    /* JADX WARN: Code duplicated, block: B:41:0x00a7  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:32:0x0094 -> B:34:0x0097). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public final java.lang.Object f(java.lang.String r9, kotlin.coroutines.jvm.internal.ContinuationImpl r10) {
        /*
            r8 = this;
            boolean r0 = r10 instanceof app.chalo.premiumbus.domain.TriggerPremiumBusBookingBookingEventsUseCase$isFirstAirportRide$1
            if (r0 == 0) goto L13
            r0 = r10
            app.chalo.premiumbus.domain.TriggerPremiumBusBookingBookingEventsUseCase$isFirstAirportRide$1 r0 = (app.chalo.premiumbus.domain.TriggerPremiumBusBookingBookingEventsUseCase$isFirstAirportRide$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            app.chalo.premiumbus.domain.TriggerPremiumBusBookingBookingEventsUseCase$isFirstAirportRide$1 r0 = new app.chalo.premiumbus.domain.TriggerPremiumBusBookingBookingEventsUseCase$isFirstAirportRide$1
            r0.<init>(r8, r10)
        L18:
            java.lang.Object r10 = r0.result
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r2 = r0.label
            r3 = 3
            r4 = 2
            r5 = 0
            r6 = 1
            if (r2 == 0) goto L4d
            if (r2 == r6) goto L45
            if (r2 == r4) goto L39
            if (r2 != r3) goto L31
            int r9 = r0.I$0
            kotlin.ResultKt.b(r10)
            goto Lb9
        L31:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L39:
            java.lang.Object r9 = r0.L$1
            java.util.Iterator r9 = (java.util.Iterator) r9
            java.lang.Object r2 = r0.L$0
            java.lang.String r2 = (java.lang.String) r2
            kotlin.ResultKt.b(r10)
            goto L97
        L45:
            java.lang.Object r9 = r0.L$0
            java.lang.String r9 = (java.lang.String) r9
            kotlin.ResultKt.b(r10)
            goto L5b
        L4d:
            kotlin.ResultKt.b(r10)
            r0.L$0 = r9
            r0.label = r6
            java.lang.Object r10 = r8.b(r0)
            if (r10 != r1) goto L5b
            goto Lb8
        L5b:
            java.util.List r10 = (java.util.List) r10
            java.lang.Iterable r10 = (java.lang.Iterable) r10
            boolean r2 = r10 instanceof java.util.Collection
            if (r2 == 0) goto L6e
            r2 = r10
            java.util.Collection r2 = (java.util.Collection) r2
            boolean r2 = r2.isEmpty()
            if (r2 == 0) goto L6e
        L6c:
            r9 = r5
            goto La5
        L6e:
            java.util.Iterator r10 = r10.iterator()
            r2 = r9
            r9 = r10
        L74:
            boolean r10 = r9.hasNext()
            if (r10 == 0) goto L6c
            java.lang.Object r10 = r9.next()
            app.chalo.premiumbus.data.models.app.PremiumReserveTicketAppModel r10 = (app.chalo.premiumbus.data.models.app.PremiumReserveTicketAppModel) r10
            app.chalo.premiumbus.data.models.app.PremiumReserveTicketBookingPropertiesAppModel r7 = r10.f7113a
            java.lang.String r7 = r7.f7114a
            boolean r7 = r7.equals(r2)
            if (r7 != 0) goto La1
            r0.L$0 = r2
            r0.L$1 = r9
            r0.label = r4
            java.lang.Object r10 = r8.e(r10, r0)
            if (r10 != r1) goto L97
            goto Lb8
        L97:
            java.lang.Boolean r10 = (java.lang.Boolean) r10
            boolean r10 = r10.booleanValue()
            if (r10 == 0) goto La1
            r10 = r6
            goto La2
        La1:
            r10 = r5
        La2:
            if (r10 == 0) goto L74
            r9 = r6
        La5:
            if (r9 == 0) goto Lb9
            r10 = 0
            r0.L$0 = r10
            r0.L$1 = r10
            r0.I$0 = r9
            r0.label = r3
            app.chalo.premiumbus.data.PremiumBusDataStoreWrapper r10 = r8.g
            java.lang.Object r10 = r10.d(r0)
            if (r10 != r1) goto Lb9
        Lb8:
            return r1
        Lb9:
            if (r9 != 0) goto Lbc
            r5 = r6
        Lbc:
            java.lang.Boolean r9 = java.lang.Boolean.valueOf(r5)
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: app.chalo.premiumbus.domain.TriggerPremiumBusBookingBookingEventsUseCase.f(java.lang.String, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:27:0x0074 A[PHI: r2 r9
      0x0074: PHI (r2v6 java.lang.String) = (r2v2 java.lang.String), (r2v7 java.lang.String) binds: [B:26:0x006e, B:38:0x00a2] A[DONT_GENERATE, DONT_INLINE]
      0x0074: PHI (r9v5 java.util.Iterator) = (r9v2 java.util.Iterator), (r9v6 java.util.Iterator) binds: [B:26:0x006e, B:38:0x00a2] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:29:0x007a  */
    /* JADX WARN: Code duplicated, block: B:31:0x008a  */
    /* JADX WARN: Code duplicated, block: B:37:0x00a1  */
    /* JADX WARN: Code duplicated, block: B:39:0x00a4  */
    /* JADX WARN: Code duplicated, block: B:41:0x00a7  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:32:0x0094 -> B:34:0x0097). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public final java.lang.Object g(java.lang.String r9, kotlin.coroutines.jvm.internal.ContinuationImpl r10) {
        /*
            r8 = this;
            boolean r0 = r10 instanceof app.chalo.premiumbus.domain.TriggerPremiumBusBookingBookingEventsUseCase$isFirstNonAirportRide$1
            if (r0 == 0) goto L13
            r0 = r10
            app.chalo.premiumbus.domain.TriggerPremiumBusBookingBookingEventsUseCase$isFirstNonAirportRide$1 r0 = (app.chalo.premiumbus.domain.TriggerPremiumBusBookingBookingEventsUseCase$isFirstNonAirportRide$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            app.chalo.premiumbus.domain.TriggerPremiumBusBookingBookingEventsUseCase$isFirstNonAirportRide$1 r0 = new app.chalo.premiumbus.domain.TriggerPremiumBusBookingBookingEventsUseCase$isFirstNonAirportRide$1
            r0.<init>(r8, r10)
        L18:
            java.lang.Object r10 = r0.result
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r2 = r0.label
            r3 = 3
            r4 = 2
            r5 = 0
            r6 = 1
            if (r2 == 0) goto L4d
            if (r2 == r6) goto L45
            if (r2 == r4) goto L39
            if (r2 != r3) goto L31
            int r9 = r0.I$0
            kotlin.ResultKt.b(r10)
            goto Lb9
        L31:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L39:
            java.lang.Object r9 = r0.L$1
            java.util.Iterator r9 = (java.util.Iterator) r9
            java.lang.Object r2 = r0.L$0
            java.lang.String r2 = (java.lang.String) r2
            kotlin.ResultKt.b(r10)
            goto L97
        L45:
            java.lang.Object r9 = r0.L$0
            java.lang.String r9 = (java.lang.String) r9
            kotlin.ResultKt.b(r10)
            goto L5b
        L4d:
            kotlin.ResultKt.b(r10)
            r0.L$0 = r9
            r0.label = r6
            java.lang.Object r10 = r8.b(r0)
            if (r10 != r1) goto L5b
            goto Lb8
        L5b:
            java.util.List r10 = (java.util.List) r10
            java.lang.Iterable r10 = (java.lang.Iterable) r10
            boolean r2 = r10 instanceof java.util.Collection
            if (r2 == 0) goto L6e
            r2 = r10
            java.util.Collection r2 = (java.util.Collection) r2
            boolean r2 = r2.isEmpty()
            if (r2 == 0) goto L6e
        L6c:
            r9 = r5
            goto La5
        L6e:
            java.util.Iterator r10 = r10.iterator()
            r2 = r9
            r9 = r10
        L74:
            boolean r10 = r9.hasNext()
            if (r10 == 0) goto L6c
            java.lang.Object r10 = r9.next()
            app.chalo.premiumbus.data.models.app.PremiumReserveTicketAppModel r10 = (app.chalo.premiumbus.data.models.app.PremiumReserveTicketAppModel) r10
            app.chalo.premiumbus.data.models.app.PremiumReserveTicketBookingPropertiesAppModel r7 = r10.f7113a
            java.lang.String r7 = r7.f7114a
            boolean r7 = r7.equals(r2)
            if (r7 != 0) goto La1
            r0.L$0 = r2
            r0.L$1 = r9
            r0.label = r4
            java.lang.Object r10 = r8.e(r10, r0)
            if (r10 != r1) goto L97
            goto Lb8
        L97:
            java.lang.Boolean r10 = (java.lang.Boolean) r10
            boolean r10 = r10.booleanValue()
            if (r10 != 0) goto La1
            r10 = r6
            goto La2
        La1:
            r10 = r5
        La2:
            if (r10 == 0) goto L74
            r9 = r6
        La5:
            if (r9 == 0) goto Lb9
            r10 = 0
            r0.L$0 = r10
            r0.L$1 = r10
            r0.I$0 = r9
            r0.label = r3
            app.chalo.premiumbus.data.PremiumBusDataStoreWrapper r10 = r8.g
            java.lang.Object r10 = r10.g(r0)
            if (r10 != r1) goto Lb9
        Lb8:
            return r1
        Lb9:
            if (r9 != 0) goto Lbc
            r5 = r6
        Lbc:
            java.lang.Boolean r9 = java.lang.Boolean.valueOf(r5)
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: app.chalo.premiumbus.domain.TriggerPremiumBusBookingBookingEventsUseCase.g(java.lang.String, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object h(ContinuationImpl continuationImpl) {
        TriggerPremiumBusBookingBookingEventsUseCase$shouldCheckForFirstAirportRide$1 triggerPremiumBusBookingBookingEventsUseCase$shouldCheckForFirstAirportRide$1;
        if (continuationImpl instanceof TriggerPremiumBusBookingBookingEventsUseCase$shouldCheckForFirstAirportRide$1) {
            triggerPremiumBusBookingBookingEventsUseCase$shouldCheckForFirstAirportRide$1 = (TriggerPremiumBusBookingBookingEventsUseCase$shouldCheckForFirstAirportRide$1) continuationImpl;
            int i = triggerPremiumBusBookingBookingEventsUseCase$shouldCheckForFirstAirportRide$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                triggerPremiumBusBookingBookingEventsUseCase$shouldCheckForFirstAirportRide$1.label = i - Integer.MIN_VALUE;
            } else {
                triggerPremiumBusBookingBookingEventsUseCase$shouldCheckForFirstAirportRide$1 = new TriggerPremiumBusBookingBookingEventsUseCase$shouldCheckForFirstAirportRide$1(this, continuationImpl);
            }
        } else {
            triggerPremiumBusBookingBookingEventsUseCase$shouldCheckForFirstAirportRide$1 = new TriggerPremiumBusBookingBookingEventsUseCase$shouldCheckForFirstAirportRide$1(this, continuationImpl);
        }
        Object objV = triggerPremiumBusBookingBookingEventsUseCase$shouldCheckForFirstAirportRide$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = triggerPremiumBusBookingBookingEventsUseCase$shouldCheckForFirstAirportRide$1.label;
        if (i2 == 0) {
            ResultKt.b(objV);
            LocalDataStore$getFlowFromLocalDataStore$$inlined$map$1 localDataStore$getFlowFromLocalDataStore$$inlined$map$1E = this.g.e();
            triggerPremiumBusBookingBookingEventsUseCase$shouldCheckForFirstAirportRide$1.label = 1;
            objV = FlowKt.v(localDataStore$getFlowFromLocalDataStore$$inlined$map$1E, triggerPremiumBusBookingBookingEventsUseCase$shouldCheckForFirstAirportRide$1);
            if (objV == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(objV);
        }
        return Boolean.valueOf(!Intrinsics.d(objV, Boolean.TRUE));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object i(ContinuationImpl continuationImpl) {
        TriggerPremiumBusBookingBookingEventsUseCase$shouldCheckForFirstNonAirportRide$1 triggerPremiumBusBookingBookingEventsUseCase$shouldCheckForFirstNonAirportRide$1;
        if (continuationImpl instanceof TriggerPremiumBusBookingBookingEventsUseCase$shouldCheckForFirstNonAirportRide$1) {
            triggerPremiumBusBookingBookingEventsUseCase$shouldCheckForFirstNonAirportRide$1 = (TriggerPremiumBusBookingBookingEventsUseCase$shouldCheckForFirstNonAirportRide$1) continuationImpl;
            int i = triggerPremiumBusBookingBookingEventsUseCase$shouldCheckForFirstNonAirportRide$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                triggerPremiumBusBookingBookingEventsUseCase$shouldCheckForFirstNonAirportRide$1.label = i - Integer.MIN_VALUE;
            } else {
                triggerPremiumBusBookingBookingEventsUseCase$shouldCheckForFirstNonAirportRide$1 = new TriggerPremiumBusBookingBookingEventsUseCase$shouldCheckForFirstNonAirportRide$1(this, continuationImpl);
            }
        } else {
            triggerPremiumBusBookingBookingEventsUseCase$shouldCheckForFirstNonAirportRide$1 = new TriggerPremiumBusBookingBookingEventsUseCase$shouldCheckForFirstNonAirportRide$1(this, continuationImpl);
        }
        Object objV = triggerPremiumBusBookingBookingEventsUseCase$shouldCheckForFirstNonAirportRide$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = triggerPremiumBusBookingBookingEventsUseCase$shouldCheckForFirstNonAirportRide$1.label;
        if (i2 == 0) {
            ResultKt.b(objV);
            LocalDataStore$getFlowFromLocalDataStore$$inlined$map$1 localDataStore$getFlowFromLocalDataStore$$inlined$map$1I = this.g.i();
            triggerPremiumBusBookingBookingEventsUseCase$shouldCheckForFirstNonAirportRide$1.label = 1;
            objV = FlowKt.v(localDataStore$getFlowFromLocalDataStore$$inlined$map$1I, triggerPremiumBusBookingBookingEventsUseCase$shouldCheckForFirstNonAirportRide$1);
            if (objV == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(objV);
        }
        return Boolean.valueOf(!Intrinsics.d(objV, Boolean.TRUE));
    }

    /* JADX WARN: Code duplicated, block: B:26:0x00d6  */
    /* JADX WARN: Code duplicated, block: B:29:0x00ed  */
    /* JADX WARN: Code duplicated, block: B:32:0x00f8  */
    /* JADX WARN: Code duplicated, block: B:35:0x010b  */
    /* JADX WARN: Code duplicated, block: B:38:0x011d A[PHI: r2 r9 r10 r11
      0x011d: PHI (r2v17 app.chalo.premiumbus.data.models.app.PremiumReserveTicketAppModel) = 
      (r2v7 app.chalo.premiumbus.data.models.app.PremiumReserveTicketAppModel)
      (r2v19 app.chalo.premiumbus.data.models.app.PremiumReserveTicketAppModel)
     binds: [B:31:0x00f6, B:51:0x0163] A[DONT_GENERATE, DONT_INLINE]
      0x011d: PHI (r9v18 kotlin.jvm.internal.Ref$ObjectRef) = (r9v6 kotlin.jvm.internal.Ref$ObjectRef), (r9v20 kotlin.jvm.internal.Ref$ObjectRef) binds: [B:31:0x00f6, B:51:0x0163] A[DONT_GENERATE, DONT_INLINE]
      0x011d: PHI (r10v20 kotlin.jvm.internal.Ref$ObjectRef) = (r10v10 kotlin.jvm.internal.Ref$ObjectRef), (r10v21 kotlin.jvm.internal.Ref$ObjectRef) binds: [B:31:0x00f6, B:51:0x0163] A[DONT_GENERATE, DONT_INLINE]
      0x011d: PHI (r11v15 java.lang.String) = (r11v4 java.lang.String), (r11v17 java.lang.String) binds: [B:31:0x00f6, B:51:0x0163] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:39:0x0123 A[PHI: r2 r9 r10 r11
      0x0123: PHI (r2v10 kotlin.jvm.internal.Ref$ObjectRef) = (r2v2 kotlin.jvm.internal.Ref$ObjectRef), (r2v12 kotlin.jvm.internal.Ref$ObjectRef) binds: [B:25:0x00d4, B:45:0x0142] A[DONT_GENERATE, DONT_INLINE]
      0x0123: PHI (r9v12 app.chalo.premiumbus.data.models.app.PremiumReserveTicketAppModel) = 
      (r9v1 app.chalo.premiumbus.data.models.app.PremiumReserveTicketAppModel)
      (r9v13 app.chalo.premiumbus.data.models.app.PremiumReserveTicketAppModel)
     binds: [B:25:0x00d4, B:45:0x0142] A[DONT_GENERATE, DONT_INLINE]
      0x0123: PHI (r10v16 kotlin.jvm.internal.Ref$ObjectRef) = (r10v7 kotlin.jvm.internal.Ref$ObjectRef), (r10v17 kotlin.jvm.internal.Ref$ObjectRef) binds: [B:25:0x00d4, B:45:0x0142] A[DONT_GENERATE, DONT_INLINE]
      0x0123: PHI (r11v10 java.lang.String) = (r11v1 java.lang.String), (r11v12 java.lang.String) binds: [B:25:0x00d4, B:45:0x0142] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:46:0x0144  */
    /* JADX WARN: Code duplicated, block: B:49:0x015a  */
    /* JADX WARN: Code duplicated, block: B:52:0x0165  */
    /* JADX WARN: Code duplicated, block: B:55:0x0177  */
    /* JADX WARN: Code duplicated, block: B:59:0x018c  */
    /* JADX WARN: Code duplicated, block: B:62:0x019f  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v18, types: [T, java.lang.String] */
    /* JADX WARN: Type inference failed for: r12v32, types: [T, java.lang.String] */
    public final Object j(PremiumReserveTicketAppModel premiumReserveTicketAppModel, boolean z, String str, ContinuationImpl continuationImpl) {
        TriggerPremiumBusBookingBookingEventsUseCase$triggerFirstBookingConfirmedEvent$1 triggerPremiumBusBookingBookingEventsUseCase$triggerFirstBookingConfirmedEvent$1;
        Ref.ObjectRef objectRef;
        Ref.ObjectRef objectRef2;
        PremiumReserveTicketAppModel premiumReserveTicketAppModel2;
        Ref.ObjectRef objectRef3;
        PremiumReserveTicketAppModel premiumReserveTicketAppModel3;
        String str2;
        Ref.ObjectRef objectRef4;
        String str3;
        String str4;
        if (continuationImpl instanceof TriggerPremiumBusBookingBookingEventsUseCase$triggerFirstBookingConfirmedEvent$1) {
            triggerPremiumBusBookingBookingEventsUseCase$triggerFirstBookingConfirmedEvent$1 = (TriggerPremiumBusBookingBookingEventsUseCase$triggerFirstBookingConfirmedEvent$1) continuationImpl;
            int i = triggerPremiumBusBookingBookingEventsUseCase$triggerFirstBookingConfirmedEvent$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                triggerPremiumBusBookingBookingEventsUseCase$triggerFirstBookingConfirmedEvent$1.label = i - Integer.MIN_VALUE;
            } else {
                triggerPremiumBusBookingBookingEventsUseCase$triggerFirstBookingConfirmedEvent$1 = new TriggerPremiumBusBookingBookingEventsUseCase$triggerFirstBookingConfirmedEvent$1(this, continuationImpl);
            }
        } else {
            triggerPremiumBusBookingBookingEventsUseCase$triggerFirstBookingConfirmedEvent$1 = new TriggerPremiumBusBookingBookingEventsUseCase$triggerFirstBookingConfirmedEvent$1(this, continuationImpl);
        }
        Object objF = triggerPremiumBusBookingBookingEventsUseCase$triggerFirstBookingConfirmedEvent$1.result;
        Object obj = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = triggerPremiumBusBookingBookingEventsUseCase$triggerFirstBookingConfirmedEvent$1.label;
        PremiumBusDataStoreWrapper premiumBusDataStoreWrapper = this.g;
        switch (i2) {
            case 0:
                Ref.ObjectRef objectRefV = uf0.v(objF);
                objectRef = new Ref.ObjectRef();
                if (z) {
                    triggerPremiumBusBookingBookingEventsUseCase$triggerFirstBookingConfirmedEvent$1.L$0 = premiumReserveTicketAppModel;
                    triggerPremiumBusBookingBookingEventsUseCase$triggerFirstBookingConfirmedEvent$1.L$1 = str;
                    triggerPremiumBusBookingBookingEventsUseCase$triggerFirstBookingConfirmedEvent$1.L$2 = objectRefV;
                    triggerPremiumBusBookingBookingEventsUseCase$triggerFirstBookingConfirmedEvent$1.L$3 = objectRef;
                    triggerPremiumBusBookingBookingEventsUseCase$triggerFirstBookingConfirmedEvent$1.label = 1;
                    Object objH = h(triggerPremiumBusBookingBookingEventsUseCase$triggerFirstBookingConfirmedEvent$1);
                    if (objH != obj) {
                        objF = objH;
                        objectRef2 = objectRefV;
                        if (((Boolean) objF).booleanValue()) {
                            String str5 = premiumReserveTicketAppModel.f7113a.f7114a;
                            triggerPremiumBusBookingBookingEventsUseCase$triggerFirstBookingConfirmedEvent$1.L$0 = premiumReserveTicketAppModel;
                            triggerPremiumBusBookingBookingEventsUseCase$triggerFirstBookingConfirmedEvent$1.L$1 = str;
                            triggerPremiumBusBookingBookingEventsUseCase$triggerFirstBookingConfirmedEvent$1.L$2 = objectRef2;
                            triggerPremiumBusBookingBookingEventsUseCase$triggerFirstBookingConfirmedEvent$1.L$3 = objectRef;
                            triggerPremiumBusBookingBookingEventsUseCase$triggerFirstBookingConfirmedEvent$1.label = 2;
                            objF = f(str5, triggerPremiumBusBookingBookingEventsUseCase$triggerFirstBookingConfirmedEvent$1);
                            if (objF != obj) {
                                Ref.ObjectRef objectRef5 = objectRef;
                                premiumReserveTicketAppModel2 = premiumReserveTicketAppModel;
                                objectRef3 = objectRef5;
                                if (((Boolean) objF).booleanValue()) {
                                    triggerPremiumBusBookingBookingEventsUseCase$triggerFirstBookingConfirmedEvent$1.L$0 = premiumReserveTicketAppModel2;
                                    triggerPremiumBusBookingBookingEventsUseCase$triggerFirstBookingConfirmedEvent$1.L$1 = str;
                                    triggerPremiumBusBookingBookingEventsUseCase$triggerFirstBookingConfirmedEvent$1.L$2 = objectRef2;
                                    triggerPremiumBusBookingBookingEventsUseCase$triggerFirstBookingConfirmedEvent$1.L$3 = objectRef3;
                                    triggerPremiumBusBookingBookingEventsUseCase$triggerFirstBookingConfirmedEvent$1.label = 3;
                                    if (premiumBusDataStoreWrapper.d(triggerPremiumBusBookingBookingEventsUseCase$triggerFirstBookingConfirmedEvent$1) != obj) {
                                        premiumReserveTicketAppModel3 = premiumReserveTicketAppModel2;
                                        objectRef2.element = "firstride_airportexpress";
                                        objectRef3.element = a(this, 14);
                                        str2 = str;
                                        objectRef4 = objectRef3;
                                        premiumReserveTicketAppModel = premiumReserveTicketAppModel3;
                                    }
                                } else {
                                    String str6 = str;
                                    objectRef4 = objectRef3;
                                    premiumReserveTicketAppModel = premiumReserveTicketAppModel2;
                                    str2 = str6;
                                }
                            }
                        } else {
                            Ref.ObjectRef objectRef6 = objectRef;
                            str2 = str;
                            objectRef4 = objectRef6;
                        }
                        str3 = (String) objectRef2.element;
                        if (str3 != null) {
                            AnalyticsContract.DefaultImpls.a(this.e, str3, str2, c(premiumReserveTicketAppModel), null, true, 8);
                        }
                        str4 = (String) objectRef4.element;
                        if (str4 != null) {
                            this.f.a(premiumReserveTicketAppModel.d.f7115a, str4);
                        }
                        return Unit.f17538a;
                    }
                } else {
                    triggerPremiumBusBookingBookingEventsUseCase$triggerFirstBookingConfirmedEvent$1.L$0 = premiumReserveTicketAppModel;
                    triggerPremiumBusBookingBookingEventsUseCase$triggerFirstBookingConfirmedEvent$1.L$1 = str;
                    triggerPremiumBusBookingBookingEventsUseCase$triggerFirstBookingConfirmedEvent$1.L$2 = objectRefV;
                    triggerPremiumBusBookingBookingEventsUseCase$triggerFirstBookingConfirmedEvent$1.L$3 = objectRef;
                    triggerPremiumBusBookingBookingEventsUseCase$triggerFirstBookingConfirmedEvent$1.label = 4;
                    Object objI = i(triggerPremiumBusBookingBookingEventsUseCase$triggerFirstBookingConfirmedEvent$1);
                    if (objI != obj) {
                        objF = objI;
                        objectRef2 = objectRefV;
                        if (((Boolean) objF).booleanValue()) {
                            String str7 = premiumReserveTicketAppModel.f7113a.f7114a;
                            triggerPremiumBusBookingBookingEventsUseCase$triggerFirstBookingConfirmedEvent$1.L$0 = premiumReserveTicketAppModel;
                            triggerPremiumBusBookingBookingEventsUseCase$triggerFirstBookingConfirmedEvent$1.L$1 = str;
                            triggerPremiumBusBookingBookingEventsUseCase$triggerFirstBookingConfirmedEvent$1.L$2 = objectRef2;
                            triggerPremiumBusBookingBookingEventsUseCase$triggerFirstBookingConfirmedEvent$1.L$3 = objectRef;
                            triggerPremiumBusBookingBookingEventsUseCase$triggerFirstBookingConfirmedEvent$1.label = 5;
                            objF = g(str7, triggerPremiumBusBookingBookingEventsUseCase$triggerFirstBookingConfirmedEvent$1);
                            if (objF != obj) {
                                Ref.ObjectRef objectRef7 = objectRef;
                                premiumReserveTicketAppModel2 = premiumReserveTicketAppModel;
                                objectRef3 = objectRef7;
                                if (((Boolean) objF).booleanValue()) {
                                    triggerPremiumBusBookingBookingEventsUseCase$triggerFirstBookingConfirmedEvent$1.L$0 = premiumReserveTicketAppModel2;
                                    triggerPremiumBusBookingBookingEventsUseCase$triggerFirstBookingConfirmedEvent$1.L$1 = str;
                                    triggerPremiumBusBookingBookingEventsUseCase$triggerFirstBookingConfirmedEvent$1.L$2 = objectRef2;
                                    triggerPremiumBusBookingBookingEventsUseCase$triggerFirstBookingConfirmedEvent$1.L$3 = objectRef3;
                                    triggerPremiumBusBookingBookingEventsUseCase$triggerFirstBookingConfirmedEvent$1.label = 6;
                                    if (premiumBusDataStoreWrapper.g(triggerPremiumBusBookingBookingEventsUseCase$triggerFirstBookingConfirmedEvent$1) != obj) {
                                        premiumReserveTicketAppModel3 = premiumReserveTicketAppModel2;
                                        objectRef2.element = "firstride_non_airportexpress";
                                        objectRef3.element = a(this, 13);
                                        str2 = str;
                                        objectRef4 = objectRef3;
                                        premiumReserveTicketAppModel = premiumReserveTicketAppModel3;
                                    }
                                } else {
                                    String str8 = str;
                                    objectRef4 = objectRef3;
                                    premiumReserveTicketAppModel = premiumReserveTicketAppModel2;
                                    str2 = str8;
                                }
                            }
                        } else {
                            Ref.ObjectRef objectRef8 = objectRef;
                            str2 = str;
                            objectRef4 = objectRef8;
                        }
                        str3 = (String) objectRef2.element;
                        if (str3 != null) {
                            AnalyticsContract.DefaultImpls.a(this.e, str3, str2, c(premiumReserveTicketAppModel), null, true, 8);
                        }
                        str4 = (String) objectRef4.element;
                        if (str4 != null) {
                            this.f.a(premiumReserveTicketAppModel.d.f7115a, str4);
                        }
                        return Unit.f17538a;
                    }
                }
                return obj;
            case 1:
                Ref.ObjectRef objectRef9 = (Ref.ObjectRef) triggerPremiumBusBookingBookingEventsUseCase$triggerFirstBookingConfirmedEvent$1.L$3;
                objectRef2 = (Ref.ObjectRef) triggerPremiumBusBookingBookingEventsUseCase$triggerFirstBookingConfirmedEvent$1.L$2;
                str = (String) triggerPremiumBusBookingBookingEventsUseCase$triggerFirstBookingConfirmedEvent$1.L$1;
                PremiumReserveTicketAppModel premiumReserveTicketAppModel4 = (PremiumReserveTicketAppModel) triggerPremiumBusBookingBookingEventsUseCase$triggerFirstBookingConfirmedEvent$1.L$0;
                ResultKt.b(objF);
                objectRef = objectRef9;
                premiumReserveTicketAppModel = premiumReserveTicketAppModel4;
                if (((Boolean) objF).booleanValue()) {
                    String str9 = premiumReserveTicketAppModel.f7113a.f7114a;
                    triggerPremiumBusBookingBookingEventsUseCase$triggerFirstBookingConfirmedEvent$1.L$0 = premiumReserveTicketAppModel;
                    triggerPremiumBusBookingBookingEventsUseCase$triggerFirstBookingConfirmedEvent$1.L$1 = str;
                    triggerPremiumBusBookingBookingEventsUseCase$triggerFirstBookingConfirmedEvent$1.L$2 = objectRef2;
                    triggerPremiumBusBookingBookingEventsUseCase$triggerFirstBookingConfirmedEvent$1.L$3 = objectRef;
                    triggerPremiumBusBookingBookingEventsUseCase$triggerFirstBookingConfirmedEvent$1.label = 2;
                    objF = f(str9, triggerPremiumBusBookingBookingEventsUseCase$triggerFirstBookingConfirmedEvent$1);
                    if (objF != obj) {
                        Ref.ObjectRef objectRef10 = objectRef;
                        premiumReserveTicketAppModel2 = premiumReserveTicketAppModel;
                        objectRef3 = objectRef10;
                        if (((Boolean) objF).booleanValue()) {
                            triggerPremiumBusBookingBookingEventsUseCase$triggerFirstBookingConfirmedEvent$1.L$0 = premiumReserveTicketAppModel2;
                            triggerPremiumBusBookingBookingEventsUseCase$triggerFirstBookingConfirmedEvent$1.L$1 = str;
                            triggerPremiumBusBookingBookingEventsUseCase$triggerFirstBookingConfirmedEvent$1.L$2 = objectRef2;
                            triggerPremiumBusBookingBookingEventsUseCase$triggerFirstBookingConfirmedEvent$1.L$3 = objectRef3;
                            triggerPremiumBusBookingBookingEventsUseCase$triggerFirstBookingConfirmedEvent$1.label = 3;
                            if (premiumBusDataStoreWrapper.d(triggerPremiumBusBookingBookingEventsUseCase$triggerFirstBookingConfirmedEvent$1) != obj) {
                                premiumReserveTicketAppModel3 = premiumReserveTicketAppModel2;
                                objectRef2.element = "firstride_airportexpress";
                                objectRef3.element = a(this, 14);
                                str2 = str;
                                objectRef4 = objectRef3;
                                premiumReserveTicketAppModel = premiumReserveTicketAppModel3;
                            }
                        } else {
                            String str10 = str;
                            objectRef4 = objectRef3;
                            premiumReserveTicketAppModel = premiumReserveTicketAppModel2;
                            str2 = str10;
                        }
                    }
                    return obj;
                }
                Ref.ObjectRef objectRef11 = objectRef;
                str2 = str;
                objectRef4 = objectRef11;
                str3 = (String) objectRef2.element;
                if (str3 != null) {
                    AnalyticsContract.DefaultImpls.a(this.e, str3, str2, c(premiumReserveTicketAppModel), null, true, 8);
                }
                str4 = (String) objectRef4.element;
                if (str4 != null) {
                    this.f.a(premiumReserveTicketAppModel.d.f7115a, str4);
                }
                return Unit.f17538a;
            case 2:
                objectRef3 = (Ref.ObjectRef) triggerPremiumBusBookingBookingEventsUseCase$triggerFirstBookingConfirmedEvent$1.L$3;
                objectRef2 = (Ref.ObjectRef) triggerPremiumBusBookingBookingEventsUseCase$triggerFirstBookingConfirmedEvent$1.L$2;
                str = (String) triggerPremiumBusBookingBookingEventsUseCase$triggerFirstBookingConfirmedEvent$1.L$1;
                premiumReserveTicketAppModel2 = (PremiumReserveTicketAppModel) triggerPremiumBusBookingBookingEventsUseCase$triggerFirstBookingConfirmedEvent$1.L$0;
                ResultKt.b(objF);
                if (((Boolean) objF).booleanValue()) {
                    triggerPremiumBusBookingBookingEventsUseCase$triggerFirstBookingConfirmedEvent$1.L$0 = premiumReserveTicketAppModel2;
                    triggerPremiumBusBookingBookingEventsUseCase$triggerFirstBookingConfirmedEvent$1.L$1 = str;
                    triggerPremiumBusBookingBookingEventsUseCase$triggerFirstBookingConfirmedEvent$1.L$2 = objectRef2;
                    triggerPremiumBusBookingBookingEventsUseCase$triggerFirstBookingConfirmedEvent$1.L$3 = objectRef3;
                    triggerPremiumBusBookingBookingEventsUseCase$triggerFirstBookingConfirmedEvent$1.label = 3;
                    if (premiumBusDataStoreWrapper.d(triggerPremiumBusBookingBookingEventsUseCase$triggerFirstBookingConfirmedEvent$1) != obj) {
                        premiumReserveTicketAppModel3 = premiumReserveTicketAppModel2;
                        objectRef2.element = "firstride_airportexpress";
                        objectRef3.element = a(this, 14);
                        str2 = str;
                        objectRef4 = objectRef3;
                        premiumReserveTicketAppModel = premiumReserveTicketAppModel3;
                    }
                    return obj;
                }
                String str11 = str;
                objectRef4 = objectRef3;
                premiumReserveTicketAppModel = premiumReserveTicketAppModel2;
                str2 = str11;
                str3 = (String) objectRef2.element;
                if (str3 != null) {
                    AnalyticsContract.DefaultImpls.a(this.e, str3, str2, c(premiumReserveTicketAppModel), null, true, 8);
                }
                str4 = (String) objectRef4.element;
                if (str4 != null) {
                    this.f.a(premiumReserveTicketAppModel.d.f7115a, str4);
                }
                return Unit.f17538a;
            case 3:
                objectRef3 = (Ref.ObjectRef) triggerPremiumBusBookingBookingEventsUseCase$triggerFirstBookingConfirmedEvent$1.L$3;
                objectRef2 = (Ref.ObjectRef) triggerPremiumBusBookingBookingEventsUseCase$triggerFirstBookingConfirmedEvent$1.L$2;
                str = (String) triggerPremiumBusBookingBookingEventsUseCase$triggerFirstBookingConfirmedEvent$1.L$1;
                premiumReserveTicketAppModel3 = (PremiumReserveTicketAppModel) triggerPremiumBusBookingBookingEventsUseCase$triggerFirstBookingConfirmedEvent$1.L$0;
                ResultKt.b(objF);
                objectRef2.element = "firstride_airportexpress";
                objectRef3.element = a(this, 14);
                str2 = str;
                objectRef4 = objectRef3;
                premiumReserveTicketAppModel = premiumReserveTicketAppModel3;
                str3 = (String) objectRef2.element;
                if (str3 != null) {
                    AnalyticsContract.DefaultImpls.a(this.e, str3, str2, c(premiumReserveTicketAppModel), null, true, 8);
                }
                str4 = (String) objectRef4.element;
                if (str4 != null) {
                    this.f.a(premiumReserveTicketAppModel.d.f7115a, str4);
                }
                return Unit.f17538a;
            case 4:
                Ref.ObjectRef objectRef12 = (Ref.ObjectRef) triggerPremiumBusBookingBookingEventsUseCase$triggerFirstBookingConfirmedEvent$1.L$3;
                objectRef2 = (Ref.ObjectRef) triggerPremiumBusBookingBookingEventsUseCase$triggerFirstBookingConfirmedEvent$1.L$2;
                str = (String) triggerPremiumBusBookingBookingEventsUseCase$triggerFirstBookingConfirmedEvent$1.L$1;
                PremiumReserveTicketAppModel premiumReserveTicketAppModel5 = (PremiumReserveTicketAppModel) triggerPremiumBusBookingBookingEventsUseCase$triggerFirstBookingConfirmedEvent$1.L$0;
                ResultKt.b(objF);
                objectRef = objectRef12;
                premiumReserveTicketAppModel = premiumReserveTicketAppModel5;
                if (((Boolean) objF).booleanValue()) {
                    String str12 = premiumReserveTicketAppModel.f7113a.f7114a;
                    triggerPremiumBusBookingBookingEventsUseCase$triggerFirstBookingConfirmedEvent$1.L$0 = premiumReserveTicketAppModel;
                    triggerPremiumBusBookingBookingEventsUseCase$triggerFirstBookingConfirmedEvent$1.L$1 = str;
                    triggerPremiumBusBookingBookingEventsUseCase$triggerFirstBookingConfirmedEvent$1.L$2 = objectRef2;
                    triggerPremiumBusBookingBookingEventsUseCase$triggerFirstBookingConfirmedEvent$1.L$3 = objectRef;
                    triggerPremiumBusBookingBookingEventsUseCase$triggerFirstBookingConfirmedEvent$1.label = 5;
                    objF = g(str12, triggerPremiumBusBookingBookingEventsUseCase$triggerFirstBookingConfirmedEvent$1);
                    if (objF != obj) {
                        Ref.ObjectRef objectRef13 = objectRef;
                        premiumReserveTicketAppModel2 = premiumReserveTicketAppModel;
                        objectRef3 = objectRef13;
                        if (((Boolean) objF).booleanValue()) {
                            triggerPremiumBusBookingBookingEventsUseCase$triggerFirstBookingConfirmedEvent$1.L$0 = premiumReserveTicketAppModel2;
                            triggerPremiumBusBookingBookingEventsUseCase$triggerFirstBookingConfirmedEvent$1.L$1 = str;
                            triggerPremiumBusBookingBookingEventsUseCase$triggerFirstBookingConfirmedEvent$1.L$2 = objectRef2;
                            triggerPremiumBusBookingBookingEventsUseCase$triggerFirstBookingConfirmedEvent$1.L$3 = objectRef3;
                            triggerPremiumBusBookingBookingEventsUseCase$triggerFirstBookingConfirmedEvent$1.label = 6;
                            if (premiumBusDataStoreWrapper.g(triggerPremiumBusBookingBookingEventsUseCase$triggerFirstBookingConfirmedEvent$1) != obj) {
                                premiumReserveTicketAppModel3 = premiumReserveTicketAppModel2;
                                objectRef2.element = "firstride_non_airportexpress";
                                objectRef3.element = a(this, 13);
                                str2 = str;
                                objectRef4 = objectRef3;
                                premiumReserveTicketAppModel = premiumReserveTicketAppModel3;
                            }
                        } else {
                            String str13 = str;
                            objectRef4 = objectRef3;
                            premiumReserveTicketAppModel = premiumReserveTicketAppModel2;
                            str2 = str13;
                        }
                    }
                    return obj;
                }
                Ref.ObjectRef objectRef14 = objectRef;
                str2 = str;
                objectRef4 = objectRef14;
                str3 = (String) objectRef2.element;
                if (str3 != null) {
                    AnalyticsContract.DefaultImpls.a(this.e, str3, str2, c(premiumReserveTicketAppModel), null, true, 8);
                }
                str4 = (String) objectRef4.element;
                if (str4 != null) {
                    this.f.a(premiumReserveTicketAppModel.d.f7115a, str4);
                }
                return Unit.f17538a;
            case 5:
                objectRef3 = (Ref.ObjectRef) triggerPremiumBusBookingBookingEventsUseCase$triggerFirstBookingConfirmedEvent$1.L$3;
                objectRef2 = (Ref.ObjectRef) triggerPremiumBusBookingBookingEventsUseCase$triggerFirstBookingConfirmedEvent$1.L$2;
                str = (String) triggerPremiumBusBookingBookingEventsUseCase$triggerFirstBookingConfirmedEvent$1.L$1;
                premiumReserveTicketAppModel2 = (PremiumReserveTicketAppModel) triggerPremiumBusBookingBookingEventsUseCase$triggerFirstBookingConfirmedEvent$1.L$0;
                ResultKt.b(objF);
                if (((Boolean) objF).booleanValue()) {
                    triggerPremiumBusBookingBookingEventsUseCase$triggerFirstBookingConfirmedEvent$1.L$0 = premiumReserveTicketAppModel2;
                    triggerPremiumBusBookingBookingEventsUseCase$triggerFirstBookingConfirmedEvent$1.L$1 = str;
                    triggerPremiumBusBookingBookingEventsUseCase$triggerFirstBookingConfirmedEvent$1.L$2 = objectRef2;
                    triggerPremiumBusBookingBookingEventsUseCase$triggerFirstBookingConfirmedEvent$1.L$3 = objectRef3;
                    triggerPremiumBusBookingBookingEventsUseCase$triggerFirstBookingConfirmedEvent$1.label = 6;
                    if (premiumBusDataStoreWrapper.g(triggerPremiumBusBookingBookingEventsUseCase$triggerFirstBookingConfirmedEvent$1) != obj) {
                        premiumReserveTicketAppModel3 = premiumReserveTicketAppModel2;
                        objectRef2.element = "firstride_non_airportexpress";
                        objectRef3.element = a(this, 13);
                        str2 = str;
                        objectRef4 = objectRef3;
                        premiumReserveTicketAppModel = premiumReserveTicketAppModel3;
                    }
                    return obj;
                }
                String str14 = str;
                objectRef4 = objectRef3;
                premiumReserveTicketAppModel = premiumReserveTicketAppModel2;
                str2 = str14;
                str3 = (String) objectRef2.element;
                if (str3 != null) {
                    AnalyticsContract.DefaultImpls.a(this.e, str3, str2, c(premiumReserveTicketAppModel), null, true, 8);
                }
                str4 = (String) objectRef4.element;
                if (str4 != null) {
                    this.f.a(premiumReserveTicketAppModel.d.f7115a, str4);
                }
                return Unit.f17538a;
            case 6:
                objectRef3 = (Ref.ObjectRef) triggerPremiumBusBookingBookingEventsUseCase$triggerFirstBookingConfirmedEvent$1.L$3;
                objectRef2 = (Ref.ObjectRef) triggerPremiumBusBookingBookingEventsUseCase$triggerFirstBookingConfirmedEvent$1.L$2;
                str = (String) triggerPremiumBusBookingBookingEventsUseCase$triggerFirstBookingConfirmedEvent$1.L$1;
                premiumReserveTicketAppModel3 = (PremiumReserveTicketAppModel) triggerPremiumBusBookingBookingEventsUseCase$triggerFirstBookingConfirmedEvent$1.L$0;
                ResultKt.b(objF);
                objectRef2.element = "firstride_non_airportexpress";
                objectRef3.element = a(this, 13);
                str2 = str;
                objectRef4 = objectRef3;
                premiumReserveTicketAppModel = premiumReserveTicketAppModel3;
                str3 = (String) objectRef2.element;
                if (str3 != null) {
                    AnalyticsContract.DefaultImpls.a(this.e, str3, str2, c(premiumReserveTicketAppModel), null, true, 8);
                }
                str4 = (String) objectRef4.element;
                if (str4 != null) {
                    this.f.a(premiumReserveTicketAppModel.d.f7115a, str4);
                }
                return Unit.f17538a;
            default:
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }
}
