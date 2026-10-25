package app.chalo.home.domain;

import app.chalo.analytics.contract.AnalyticsContract;
import app.chalo.citydata.data.model.app.RouteStopsInfo;
import app.chalo.contract.BasicInfoContract;
import app.chalo.helper.FeedbackFeature;
import app.chalo.home.data.repository.TicketRepository;
import app.chalo.models.mticketing.MTicket;
import app.chalo.models.mticketing.MTicketUtilsHelper;
import app.chalo.providers.CoroutineContextProvider;
import app.chalo.superpass.data.dao.SuperPassDao;
import app.chalo.superpass.data.features.IDigitalTripReceiptFeature;
import app.chalo.superpass.data.models.entities.RideBasedSuperPass;
import app.chalo.superpass.data.models.entities.RideBasedSuperPassRideDetails;
import app.chalo.superpass.data.models.entities.RideBasedSuperPassValidationProperties;
import app.chalo.superpass.data.models.entities.SuperPass;
import app.chalo.superpass.data.repository.SuperPassRepository;
import app.chalo.superpass.utils.MixpanelUtil;
import app.chalo.usecase.GetProductConfigFromProductIdUseCase;
import app.chalo.usecase.GetValidationProcessFlowDetailsForValidationProductUseCase;
import app.chalo.utils.MobileTicketingConverters;
import app.chalo.utils.timeutil.TimeUtilsContract;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.npci.upi.security.pinactivitycomponent.CLConstants;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/home/domain/ActivateProductIfRequiredUseCase;", "", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class ActivateProductIfRequiredUseCase {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AnalyticsContract f2984a;
    public final SuperPassRepository b;
    public final IDigitalTripReceiptFeature c;
    public final BasicInfoContract d;
    public final GetValidationProcessFlowDetailsForValidationProductUseCase e;
    public final TicketRepository f;
    public final CoroutineContextProvider g;
    public final TimeUtilsContract h;
    public final GetProductConfigFromProductIdUseCase i;
    public final FeedbackFeature j;
    public final MTicketUtilsHelper k;

    public ActivateProductIfRequiredUseCase(AnalyticsContract analyticsContract, SuperPassRepository superPassRepository, IDigitalTripReceiptFeature iDigitalTripReceiptFeature, BasicInfoContract basicInfoContract, GetValidationProcessFlowDetailsForValidationProductUseCase getValidationProcessFlowDetailsForValidationProductUseCase, TicketRepository ticketRepository, CoroutineContextProvider coroutineContextProvider, TimeUtilsContract timeUtilsContract, GetProductConfigFromProductIdUseCase getProductConfigFromProductIdUseCase, FeedbackFeature feedbackFeature, MTicketUtilsHelper mTicketUtilsHelper, MobileTicketingConverters mobileTicketingConverters) {
        this.f2984a = analyticsContract;
        this.b = superPassRepository;
        this.c = iDigitalTripReceiptFeature;
        this.d = basicInfoContract;
        this.e = getValidationProcessFlowDetailsForValidationProductUseCase;
        this.f = ticketRepository;
        this.g = coroutineContextProvider;
        this.h = timeUtilsContract;
        this.i = getProductConfigFromProductIdUseCase;
        this.j = feedbackFeature;
        this.k = mTicketUtilsHelper;
    }

    /* JADX WARN: Code duplicated, block: B:29:0x014d  */
    /* JADX WARN: Code duplicated, block: B:30:0x0150  */
    /* JADX WARN: Code duplicated, block: B:33:0x0163  */
    /* JADX WARN: Code duplicated, block: B:34:0x0166  */
    /* JADX WARN: Code duplicated, block: B:37:0x0179  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    public static final Object a(ActivateProductIfRequiredUseCase activateProductIfRequiredUseCase, MTicket mTicket, ContinuationImpl continuationImpl) {
        ActivateProductIfRequiredUseCase$raiseMTicketActivatedEvent$1 activateProductIfRequiredUseCase$raiseMTicketActivatedEvent$1;
        Pair[] pairArr;
        String str;
        MTicket mTicket2;
        TimeUtilsContract timeUtilsContract;
        Pair[] pairArr2;
        String str2;
        TimeUtilsContract timeUtilsContract2;
        Pair[] pairArr3;
        Pair[] pairArr4;
        MTicket mTicket3;
        RouteStopsInfo routeStopsInfo;
        String str3;
        String str4;
        BasicInfoContract basicInfoContract = activateProductIfRequiredUseCase.d;
        TimeUtilsContract timeUtilsContract3 = activateProductIfRequiredUseCase.h;
        if (continuationImpl instanceof ActivateProductIfRequiredUseCase$raiseMTicketActivatedEvent$1) {
            activateProductIfRequiredUseCase$raiseMTicketActivatedEvent$1 = (ActivateProductIfRequiredUseCase$raiseMTicketActivatedEvent$1) continuationImpl;
            int i = activateProductIfRequiredUseCase$raiseMTicketActivatedEvent$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                activateProductIfRequiredUseCase$raiseMTicketActivatedEvent$1.label = i - Integer.MIN_VALUE;
            } else {
                activateProductIfRequiredUseCase$raiseMTicketActivatedEvent$1 = new ActivateProductIfRequiredUseCase$raiseMTicketActivatedEvent$1(activateProductIfRequiredUseCase, continuationImpl);
            }
        } else {
            activateProductIfRequiredUseCase$raiseMTicketActivatedEvent$1 = new ActivateProductIfRequiredUseCase$raiseMTicketActivatedEvent$1(activateProductIfRequiredUseCase, continuationImpl);
        }
        Object objC = activateProductIfRequiredUseCase$raiseMTicketActivatedEvent$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = activateProductIfRequiredUseCase$raiseMTicketActivatedEvent$1.label;
        int i3 = 2;
        int i4 = 1;
        if (i2 == 0) {
            ResultKt.b(objC);
            pairArr = new Pair[14];
            String str5 = mTicket.b;
            if (str5 == null) {
                str5 = "";
            }
            pairArr[0] = new Pair("userId", str5);
            activateProductIfRequiredUseCase$raiseMTicketActivatedEvent$1.L$0 = mTicket;
            activateProductIfRequiredUseCase$raiseMTicketActivatedEvent$1.L$1 = pairArr;
            activateProductIfRequiredUseCase$raiseMTicketActivatedEvent$1.L$2 = pairArr;
            str = "time";
            activateProductIfRequiredUseCase$raiseMTicketActivatedEvent$1.L$3 = "time";
            activateProductIfRequiredUseCase$raiseMTicketActivatedEvent$1.L$4 = timeUtilsContract3;
            activateProductIfRequiredUseCase$raiseMTicketActivatedEvent$1.I$0 = 1;
            activateProductIfRequiredUseCase$raiseMTicketActivatedEvent$1.label = 1;
            objC = basicInfoContract.c(activateProductIfRequiredUseCase$raiseMTicketActivatedEvent$1);
            if (objC != coroutineSingletons) {
                mTicket2 = mTicket;
                timeUtilsContract = timeUtilsContract3;
                pairArr2 = pairArr;
            }
            return coroutineSingletons;
        }
        if (i2 == 1) {
            i4 = activateProductIfRequiredUseCase$raiseMTicketActivatedEvent$1.I$0;
            timeUtilsContract = (TimeUtilsContract) activateProductIfRequiredUseCase$raiseMTicketActivatedEvent$1.L$4;
            str = (String) activateProductIfRequiredUseCase$raiseMTicketActivatedEvent$1.L$3;
            Pair[] pairArr5 = (Pair[]) activateProductIfRequiredUseCase$raiseMTicketActivatedEvent$1.L$2;
            Pair[] pairArr6 = (Pair[]) activateProductIfRequiredUseCase$raiseMTicketActivatedEvent$1.L$1;
            mTicket2 = (MTicket) activateProductIfRequiredUseCase$raiseMTicketActivatedEvent$1.L$0;
            ResultKt.b(objC);
            pairArr2 = pairArr5;
            pairArr = pairArr6;
        } else {
            if (i2 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            i3 = activateProductIfRequiredUseCase$raiseMTicketActivatedEvent$1.I$0;
            timeUtilsContract2 = (TimeUtilsContract) activateProductIfRequiredUseCase$raiseMTicketActivatedEvent$1.L$4;
            str2 = (String) activateProductIfRequiredUseCase$raiseMTicketActivatedEvent$1.L$3;
            pairArr3 = (Pair[]) activateProductIfRequiredUseCase$raiseMTicketActivatedEvent$1.L$2;
            pairArr4 = (Pair[]) activateProductIfRequiredUseCase$raiseMTicketActivatedEvent$1.L$1;
            mTicket3 = (MTicket) activateProductIfRequiredUseCase$raiseMTicketActivatedEvent$1.L$0;
            ResultKt.b(objC);
        }
        pairArr3[i3] = new Pair(str2, timeUtilsContract2.Q(((Number) objC).longValue()));
        String str6 = mTicket3.f5615a;
        routeStopsInfo = mTicket3.f;
        pairArr4[3] = new Pair("bookingId", str6);
        pairArr4[4] = new Pair("passengerTypes", MobileTicketingConverters.j(mTicket3.h));
        pairArr4[5] = new Pair("fare", new Double(activateProductIfRequiredUseCase.k.i(mTicket3)));
        pairArr4[6] = new Pair("startDate", timeUtilsContract3.Q(mTicket3.i));
        pairArr4[7] = new Pair("expiryDate", timeUtilsContract3.Q(mTicket3.j));
        pairArr4[8] = new Pair("city", mTicket3.d);
        pairArr4[9] = new Pair("agency", mTicket3.e);
        if (routeStopsInfo != null) {
            str3 = routeStopsInfo.f1717a;
        } else {
            str3 = null;
        }
        pairArr4[10] = new Pair("upTripRouteId", String.valueOf(str3));
        if (routeStopsInfo != null) {
            str4 = routeStopsInfo.c;
        } else {
            str4 = null;
        }
        pairArr4[11] = new Pair("upTripStartStopId", String.valueOf(str4));
        pairArr4[12] = new Pair("upTripEndStopId", String.valueOf(routeStopsInfo != null ? routeStopsInfo.e : null));
        pairArr4[13] = new Pair("isFreeRide", String.valueOf(mTicket3.s));
        AnalyticsContract.DefaultImpls.a(activateProductIfRequiredUseCase.f2984a, "mticket activated", "", MapsKt.k(pairArr4), null, false, 24);
        return Unit.f17538a;
        pairArr2[i4] = new Pair(str, timeUtilsContract.e(((Number) objC).longValue()));
        activateProductIfRequiredUseCase$raiseMTicketActivatedEvent$1.L$0 = mTicket2;
        activateProductIfRequiredUseCase$raiseMTicketActivatedEvent$1.L$1 = pairArr;
        activateProductIfRequiredUseCase$raiseMTicketActivatedEvent$1.L$2 = pairArr;
        activateProductIfRequiredUseCase$raiseMTicketActivatedEvent$1.L$3 = CLConstants.SHARED_PREFERENCE_ITEM_DATE;
        activateProductIfRequiredUseCase$raiseMTicketActivatedEvent$1.L$4 = timeUtilsContract3;
        activateProductIfRequiredUseCase$raiseMTicketActivatedEvent$1.I$0 = 2;
        activateProductIfRequiredUseCase$raiseMTicketActivatedEvent$1.label = 2;
        objC = basicInfoContract.c(activateProductIfRequiredUseCase$raiseMTicketActivatedEvent$1);
        if (objC != coroutineSingletons) {
            str2 = CLConstants.SHARED_PREFERENCE_ITEM_DATE;
            timeUtilsContract2 = timeUtilsContract3;
            pairArr3 = pairArr;
            pairArr4 = pairArr3;
            mTicket3 = mTicket2;
            pairArr3[i3] = new Pair(str2, timeUtilsContract2.Q(((Number) objC).longValue()));
            String str7 = mTicket3.f5615a;
            routeStopsInfo = mTicket3.f;
            pairArr4[3] = new Pair("bookingId", str7);
            pairArr4[4] = new Pair("passengerTypes", MobileTicketingConverters.j(mTicket3.h));
            pairArr4[5] = new Pair("fare", new Double(activateProductIfRequiredUseCase.k.i(mTicket3)));
            pairArr4[6] = new Pair("startDate", timeUtilsContract3.Q(mTicket3.i));
            pairArr4[7] = new Pair("expiryDate", timeUtilsContract3.Q(mTicket3.j));
            pairArr4[8] = new Pair("city", mTicket3.d);
            pairArr4[9] = new Pair("agency", mTicket3.e);
            if (routeStopsInfo != null) {
                str3 = routeStopsInfo.f1717a;
            } else {
                str3 = null;
            }
            pairArr4[10] = new Pair("upTripRouteId", String.valueOf(str3));
            if (routeStopsInfo != null) {
                str4 = routeStopsInfo.c;
            } else {
                str4 = null;
            }
            pairArr4[11] = new Pair("upTripStartStopId", String.valueOf(str4));
            pairArr4[12] = new Pair("upTripEndStopId", String.valueOf(routeStopsInfo != null ? routeStopsInfo.e : null));
            pairArr4[13] = new Pair("isFreeRide", String.valueOf(mTicket3.s));
            AnalyticsContract.DefaultImpls.a(activateProductIfRequiredUseCase.f2984a, "mticket activated", "", MapsKt.k(pairArr4), null, false, 24);
            return Unit.f17538a;
        }
        return coroutineSingletons;
    }

    /* JADX WARN: Code duplicated, block: B:28:0x00b1  */
    /* JADX WARN: Code duplicated, block: B:31:0x00ba  */
    /* JADX WARN: Code duplicated, block: B:33:0x00c2  */
    /* JADX WARN: Code duplicated, block: B:35:0x00c8  */
    /* JADX WARN: Code duplicated, block: B:37:0x00d0  */
    /* JADX WARN: Code duplicated, block: B:40:0x00df  */
    /* JADX WARN: Code duplicated, block: B:44:0x00f5  */
    /* JADX WARN: Code duplicated, block: B:47:0x00fe  */
    /* JADX WARN: Code duplicated, block: B:49:0x0106  */
    /* JADX WARN: Code duplicated, block: B:52:0x0113 A[PHI: r10 r11
      0x0113: PHI (r10v18 app.chalo.superpass.data.models.entities.SuperPass) = 
      (r10v14 app.chalo.superpass.data.models.entities.SuperPass)
      (r10v20 app.chalo.superpass.data.models.entities.SuperPass)
     binds: [B:50:0x010f, B:16:0x0056] A[DONT_GENERATE, DONT_INLINE]
      0x0113: PHI (r11v27 java.lang.Object) = (r11v25 java.lang.Object), (r11v1 java.lang.Object) binds: [B:50:0x010f, B:16:0x0056] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:55:0x013c  */
    /* JADX WARN: Code duplicated, block: B:58:0x0140 A[PHI: r10
      0x0140: PHI (r10v21 app.chalo.superpass.data.models.entities.SuperPass) = 
      (r10v18 app.chalo.superpass.data.models.entities.SuperPass)
      (r10v24 app.chalo.superpass.data.models.entities.SuperPass)
     binds: [B:56:0x013d, B:15:0x004d] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:61:0x0156  */
    /* JADX WARN: Code duplicated, block: B:64:0x0172  */
    /* JADX WARN: Code duplicated, block: B:67:0x0176  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x0181, code lost:
    
        if (e(r10, r0) == r1) goto L70;
     */
    /* JADX WARN: Type inference failed for: r11v30, types: [java.lang.Object, kotlin.Lazy] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(app.chalo.superpass.data.models.entities.MagicSuperPass r10, kotlin.coroutines.jvm.internal.ContinuationImpl r11) {
        /*
            Method dump skipped, instruction units count: 420
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: app.chalo.home.domain.ActivateProductIfRequiredUseCase.b(app.chalo.superpass.data.models.entities.MagicSuperPass, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:30:0x00bf  */
    /* JADX WARN: Code duplicated, block: B:33:0x00c8  */
    /* JADX WARN: Code duplicated, block: B:35:0x00d0  */
    /* JADX WARN: Code duplicated, block: B:38:0x00e7 A[PHI: r2 r5 r9 r10
      0x00e7: PHI (r2v6 app.chalo.superpass.data.models.entities.RideBasedSuperPassValidationProperties) = 
      (r2v5 app.chalo.superpass.data.models.entities.RideBasedSuperPassValidationProperties)
      (r2v8 app.chalo.superpass.data.models.entities.RideBasedSuperPassValidationProperties)
     binds: [B:36:0x00e3, B:20:0x0072] A[DONT_GENERATE, DONT_INLINE]
      0x00e7: PHI (r5v4 app.chalo.superpass.data.models.entities.RideBasedSuperPass) = 
      (r5v2 app.chalo.superpass.data.models.entities.RideBasedSuperPass)
      (r5v6 app.chalo.superpass.data.models.entities.RideBasedSuperPass)
     binds: [B:36:0x00e3, B:20:0x0072] A[DONT_GENERATE, DONT_INLINE]
      0x00e7: PHI (r9v10 java.lang.String) = (r9v6 java.lang.String), (r9v13 java.lang.String) binds: [B:36:0x00e3, B:20:0x0072] A[DONT_GENERATE, DONT_INLINE]
      0x00e7: PHI (r10v13 java.lang.Object) = (r10v11 java.lang.Object), (r10v1 java.lang.Object) binds: [B:36:0x00e3, B:20:0x0072] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:41:0x00fe  */
    /* JADX WARN: Code duplicated, block: B:44:0x0107  */
    /* JADX WARN: Code duplicated, block: B:49:0x012b  */
    /* JADX WARN: Code duplicated, block: B:51:0x0131  */
    /* JADX WARN: Code duplicated, block: B:53:0x0139  */
    /* JADX WARN: Code duplicated, block: B:56:0x0148  */
    /* JADX WARN: Code duplicated, block: B:60:0x015e  */
    /* JADX WARN: Code duplicated, block: B:63:0x0167  */
    /* JADX WARN: Code duplicated, block: B:65:0x016f  */
    /* JADX WARN: Code duplicated, block: B:68:0x0177 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:74:0x018e A[PHI: r9 r10
      0x018e: PHI (r9v31 app.chalo.superpass.data.models.entities.RideBasedSuperPass) = 
      (r9v26 app.chalo.superpass.data.models.entities.RideBasedSuperPass)
      (r9v34 app.chalo.superpass.data.models.entities.RideBasedSuperPass)
     binds: [B:72:0x018b, B:15:0x0045] A[DONT_GENERATE, DONT_INLINE]
      0x018e: PHI (r10v41 java.lang.Object) = (r10v38 java.lang.Object), (r10v1 java.lang.Object) binds: [B:72:0x018b, B:15:0x0045] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:76:0x0196  */
    /* JADX WARN: Code duplicated, block: B:79:0x01a3 A[PHI: r9 r10
      0x01a3: PHI (r9v35 app.chalo.superpass.data.models.entities.RideBasedSuperPass) = 
      (r9v31 app.chalo.superpass.data.models.entities.RideBasedSuperPass)
      (r9v37 app.chalo.superpass.data.models.entities.RideBasedSuperPass)
     binds: [B:77:0x01a0, B:14:0x003c] A[DONT_GENERATE, DONT_INLINE]
      0x01a3: PHI (r10v47 java.lang.Object) = (r10v46 java.lang.Object), (r10v1 java.lang.Object) binds: [B:77:0x01a0, B:14:0x003c] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code duplicated, block: B:82:0x01cf  */
    /* JADX WARN: Code duplicated, block: B:85:0x01d4 A[PHI: r2 r9
      0x01d4: PHI (r2v16 long) = (r2v15 long), (r2v17 long) binds: [B:83:0x01d1, B:13:0x0031] A[DONT_GENERATE, DONT_INLINE]
      0x01d4: PHI (r9v38 app.chalo.superpass.data.models.entities.RideBasedSuperPass) = 
      (r9v35 app.chalo.superpass.data.models.entities.RideBasedSuperPass)
      (r9v41 app.chalo.superpass.data.models.entities.RideBasedSuperPass)
     binds: [B:83:0x01d1, B:13:0x0031] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:90:0x01ee  */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0116, code lost:
    
        if (r10 == r1) goto L87;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x01e3, code lost:
    
        if (f(r9, r2, r0) == r1) goto L87;
     */
    /* JADX WARN: Type inference failed for: r10v50, types: [java.lang.Object, kotlin.Lazy] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(app.chalo.superpass.data.models.entities.RideBasedSuperPass r9, kotlin.coroutines.jvm.internal.ContinuationImpl r10) {
        /*
            Method dump skipped, instruction units count: 530
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: app.chalo.home.domain.ActivateProductIfRequiredUseCase.c(app.chalo.superpass.data.models.entities.RideBasedSuperPass, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x005b, code lost:
    
        if (r9 == r1) goto L80;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d(app.chalo.home.domain.ChaloUserBookingType r8, kotlin.coroutines.jvm.internal.ContinuationImpl r9) {
        /*
            Method dump skipped, instruction units count: 271
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: app.chalo.home.domain.ActivateProductIfRequiredUseCase.d(app.chalo.home.domain.ChaloUserBookingType, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    public final Object e(SuperPass superPass, ContinuationImpl continuationImpl) {
        ActivateProductIfRequiredUseCase$raiseSuperPassActivatedEvent$1 activateProductIfRequiredUseCase$raiseSuperPassActivatedEvent$1;
        Map map;
        AnalyticsContract analyticsContract;
        String str;
        String str2;
        if (continuationImpl instanceof ActivateProductIfRequiredUseCase$raiseSuperPassActivatedEvent$1) {
            activateProductIfRequiredUseCase$raiseSuperPassActivatedEvent$1 = (ActivateProductIfRequiredUseCase$raiseSuperPassActivatedEvent$1) continuationImpl;
            int i = activateProductIfRequiredUseCase$raiseSuperPassActivatedEvent$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                activateProductIfRequiredUseCase$raiseSuperPassActivatedEvent$1.label = i - Integer.MIN_VALUE;
            } else {
                activateProductIfRequiredUseCase$raiseSuperPassActivatedEvent$1 = new ActivateProductIfRequiredUseCase$raiseSuperPassActivatedEvent$1(this, continuationImpl);
            }
        } else {
            activateProductIfRequiredUseCase$raiseSuperPassActivatedEvent$1 = new ActivateProductIfRequiredUseCase$raiseSuperPassActivatedEvent$1(this, continuationImpl);
        }
        Object obj = activateProductIfRequiredUseCase$raiseSuperPassActivatedEvent$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = activateProductIfRequiredUseCase$raiseSuperPassActivatedEvent$1.label;
        if (i2 == 0) {
            ResultKt.b(obj);
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            MixpanelUtil mixpanelUtil = MixpanelUtil.f9617a;
            activateProductIfRequiredUseCase$raiseSuperPassActivatedEvent$1.L$0 = linkedHashMap;
            AnalyticsContract analyticsContract2 = this.f2984a;
            activateProductIfRequiredUseCase$raiseSuperPassActivatedEvent$1.L$1 = analyticsContract2;
            activateProductIfRequiredUseCase$raiseSuperPassActivatedEvent$1.L$2 = "pass activated";
            activateProductIfRequiredUseCase$raiseSuperPassActivatedEvent$1.L$3 = "";
            activateProductIfRequiredUseCase$raiseSuperPassActivatedEvent$1.label = 1;
            if (mixpanelUtil.c(linkedHashMap, superPass, activateProductIfRequiredUseCase$raiseSuperPassActivatedEvent$1) == coroutineSingletons) {
                return coroutineSingletons;
            }
            map = linkedHashMap;
            analyticsContract = analyticsContract2;
            str = "pass activated";
            str2 = "";
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            String str3 = (String) activateProductIfRequiredUseCase$raiseSuperPassActivatedEvent$1.L$3;
            String str4 = (String) activateProductIfRequiredUseCase$raiseSuperPassActivatedEvent$1.L$2;
            AnalyticsContract analyticsContract3 = (AnalyticsContract) activateProductIfRequiredUseCase$raiseSuperPassActivatedEvent$1.L$1;
            Map map2 = (Map) activateProductIfRequiredUseCase$raiseSuperPassActivatedEvent$1.L$0;
            ResultKt.b(obj);
            map = map2;
            str2 = str3;
            str = str4;
            analyticsContract = analyticsContract3;
        }
        AnalyticsContract.DefaultImpls.a(analyticsContract, str, str2, map, null, false, 24);
        return Unit.f17538a;
    }

    /* JADX WARN: Code duplicated, block: B:36:0x00c8 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:8:0x0020  */
    public final Object f(RideBasedSuperPass rideBasedSuperPass, long j, ContinuationImpl continuationImpl) {
        ActivateProductIfRequiredUseCase$updateRideBasedSuperPassRideDetailsForFreshActivation$1 activateProductIfRequiredUseCase$updateRideBasedSuperPassRideDetailsForFreshActivation$1;
        SuperPassDao superPassDao;
        long j2;
        List list;
        RideBasedSuperPass rideBasedSuperPass2 = rideBasedSuperPass;
        SuperPassDao superPassDao2 = this.b.b;
        if (continuationImpl instanceof ActivateProductIfRequiredUseCase$updateRideBasedSuperPassRideDetailsForFreshActivation$1) {
            activateProductIfRequiredUseCase$updateRideBasedSuperPassRideDetailsForFreshActivation$1 = (ActivateProductIfRequiredUseCase$updateRideBasedSuperPassRideDetailsForFreshActivation$1) continuationImpl;
            int i = activateProductIfRequiredUseCase$updateRideBasedSuperPassRideDetailsForFreshActivation$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                activateProductIfRequiredUseCase$updateRideBasedSuperPassRideDetailsForFreshActivation$1.label = i - Integer.MIN_VALUE;
            } else {
                activateProductIfRequiredUseCase$updateRideBasedSuperPassRideDetailsForFreshActivation$1 = new ActivateProductIfRequiredUseCase$updateRideBasedSuperPassRideDetailsForFreshActivation$1(this, continuationImpl);
            }
        } else {
            activateProductIfRequiredUseCase$updateRideBasedSuperPassRideDetailsForFreshActivation$1 = new ActivateProductIfRequiredUseCase$updateRideBasedSuperPassRideDetailsForFreshActivation$1(this, continuationImpl);
        }
        ActivateProductIfRequiredUseCase$updateRideBasedSuperPassRideDetailsForFreshActivation$1 activateProductIfRequiredUseCase$updateRideBasedSuperPassRideDetailsForFreshActivation$2 = activateProductIfRequiredUseCase$updateRideBasedSuperPassRideDetailsForFreshActivation$1;
        Object obj = activateProductIfRequiredUseCase$updateRideBasedSuperPassRideDetailsForFreshActivation$2.result;
        Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = activateProductIfRequiredUseCase$updateRideBasedSuperPassRideDetailsForFreshActivation$2.label;
        Object obj3 = Unit.f17538a;
        if (i2 != 0) {
            if (i2 == 1) {
                long j3 = activateProductIfRequiredUseCase$updateRideBasedSuperPassRideDetailsForFreshActivation$2.J$0;
                List list2 = (List) activateProductIfRequiredUseCase$updateRideBasedSuperPassRideDetailsForFreshActivation$2.L$1;
                RideBasedSuperPass rideBasedSuperPass3 = (RideBasedSuperPass) activateProductIfRequiredUseCase$updateRideBasedSuperPassRideDetailsForFreshActivation$2.L$0;
                ResultKt.b(obj);
                superPassDao = superPassDao2;
                j2 = j3;
                list = list2;
                rideBasedSuperPass2 = rideBasedSuperPass3;
            } else {
                if (i2 != 2) {
                    if (i2 != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.b(obj);
                    return obj3;
                }
                rideBasedSuperPass2 = (RideBasedSuperPass) activateProductIfRequiredUseCase$updateRideBasedSuperPassRideDetailsForFreshActivation$2.L$0;
                ResultKt.b(obj);
            }
            activateProductIfRequiredUseCase$updateRideBasedSuperPassRideDetailsForFreshActivation$2.L$0 = null;
            activateProductIfRequiredUseCase$updateRideBasedSuperPassRideDetailsForFreshActivation$2.label = 3;
            if (e(rideBasedSuperPass2, activateProductIfRequiredUseCase$updateRideBasedSuperPassRideDetailsForFreshActivation$2) != obj2) {
                return obj2;
            }
            return obj3;
        }
        ResultKt.b(obj);
        RideBasedSuperPassValidationProperties rideBasedSuperPassValidationProperties = rideBasedSuperPass2.g;
        ArrayList arrayListE0 = CollectionsKt.E0(rideBasedSuperPassValidationProperties.o.c);
        arrayListE0.add(new Long(j));
        RideBasedSuperPassRideDetails rideBasedSuperPassRideDetails = rideBasedSuperPassValidationProperties.o;
        rideBasedSuperPassRideDetails.getClass();
        rideBasedSuperPassRideDetails.c = arrayListE0;
        RideBasedSuperPassRideDetails rideBasedSuperPassRideDetails2 = rideBasedSuperPassValidationProperties.o;
        boolean z = rideBasedSuperPassRideDetails2.d;
        String str = rideBasedSuperPass2.f9560a.f9566a;
        long j4 = rideBasedSuperPassRideDetails2.b;
        activateProductIfRequiredUseCase$updateRideBasedSuperPassRideDetailsForFreshActivation$2.L$0 = rideBasedSuperPass2;
        activateProductIfRequiredUseCase$updateRideBasedSuperPassRideDetailsForFreshActivation$2.L$1 = arrayListE0;
        activateProductIfRequiredUseCase$updateRideBasedSuperPassRideDetailsForFreshActivation$2.J$0 = j;
        activateProductIfRequiredUseCase$updateRideBasedSuperPassRideDetailsForFreshActivation$2.label = 1;
        superPassDao = superPassDao2;
        Object objF = superPassDao.F(arrayListE0, z, str, j, j4, activateProductIfRequiredUseCase$updateRideBasedSuperPassRideDetailsForFreshActivation$2);
        if (objF != obj2) {
            activateProductIfRequiredUseCase$updateRideBasedSuperPassRideDetailsForFreshActivation$2 = activateProductIfRequiredUseCase$updateRideBasedSuperPassRideDetailsForFreshActivation$2;
            objF = obj3;
        }
        if (objF != obj2) {
            j2 = j;
            list = arrayListE0;
        }
        return obj2;
        String str2 = rideBasedSuperPass2.f9560a.f9566a;
        activateProductIfRequiredUseCase$updateRideBasedSuperPassRideDetailsForFreshActivation$2.L$0 = rideBasedSuperPass2;
        activateProductIfRequiredUseCase$updateRideBasedSuperPassRideDetailsForFreshActivation$2.L$1 = null;
        activateProductIfRequiredUseCase$updateRideBasedSuperPassRideDetailsForFreshActivation$2.label = 2;
        Object objD = superPassDao.d(list, j2, str2, activateProductIfRequiredUseCase$updateRideBasedSuperPassRideDetailsForFreshActivation$2);
        if (objD != obj2) {
            objD = obj3;
        }
        if (objD != obj2) {
            activateProductIfRequiredUseCase$updateRideBasedSuperPassRideDetailsForFreshActivation$2.L$0 = null;
            activateProductIfRequiredUseCase$updateRideBasedSuperPassRideDetailsForFreshActivation$2.label = 3;
            if (e(rideBasedSuperPass2, activateProductIfRequiredUseCase$updateRideBasedSuperPassRideDetailsForFreshActivation$2) != obj2) {
                return obj3;
            }
        }
        return obj2;
    }
}
