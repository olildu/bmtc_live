package app.chalo.superpass.utils;

import app.chalo.constants.CurrencyRoundOffLogic;
import app.chalo.contract.BasicInfoContract;
import app.chalo.electricitybill.data.model.appmodel.ElectricityBillAppModel;
import app.chalo.features.wallet.CurrencyFeature;
import app.chalo.models.mticketing.MTicketTripReceipt;
import app.chalo.models.mticketing.MTicketUtilsHelper;
import app.chalo.network.config.ChaloJson;
import app.chalo.superpass.data.models.entities.RideBasedSuperPass;
import app.chalo.superpass.data.models.entities.RideBasedSuperPassValidationProperties;
import app.chalo.superpass.data.models.entities.SuperPass;
import app.chalo.superpass.data.models.entities.SuperPassProperties;
import app.chalo.superpass.data.models.entities.SuperPassValidationProperties;
import app.chalo.utils.MobileTicketingConverters;
import app.chalo.utils.timeutil.TimeUtilsContract;
import defpackage.vo1;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.internal.ProgressionUtilKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.LongSerializer;
import kotlinx.serialization.json.Json;
import org.koin.core.Koin;
import org.koin.core.component.KoinComponent;
import org.koin.core.component.KoinScopeComponent;
import org.koin.core.context.GlobalContext;
import org.npci.upi.security.pinactivitycomponent.CLConstants;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/superpass/utils/MixpanelUtil;", "Lorg/koin/core/component/KoinComponent;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class MixpanelUtil implements KoinComponent {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final MixpanelUtil f9617a;
    public static final Object b;
    public static final Object c;
    public static final Object d;
    public static final Object e;
    public static final Object f;

    static {
        final MixpanelUtil mixpanelUtil = new MixpanelUtil();
        f9617a = mixpanelUtil;
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.SYNCHRONIZED;
        b = LazyKt.a(lazyThreadSafetyMode, new Function0<TimeUtilsContract>() { // from class: app.chalo.superpass.utils.MixpanelUtil$special$$inlined$inject$default$1
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                Object obj = this.f9618a;
                return (obj instanceof KoinScopeComponent ? ((KoinScopeComponent) obj).i0() : GlobalContext.f18817a.a().c.d).d(Reflection.a(TimeUtilsContract.class), null, null);
            }
        });
        c = LazyKt.a(lazyThreadSafetyMode, new Function0<BasicInfoContract>() { // from class: app.chalo.superpass.utils.MixpanelUtil$special$$inlined$inject$default$2
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                Object obj = this.f9619a;
                return (obj instanceof KoinScopeComponent ? ((KoinScopeComponent) obj).i0() : GlobalContext.f18817a.a().c.d).d(Reflection.a(BasicInfoContract.class), null, null);
            }
        });
        d = LazyKt.a(lazyThreadSafetyMode, new Function0<CurrencyFeature>() { // from class: app.chalo.superpass.utils.MixpanelUtil$special$$inlined$inject$default$3
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                Object obj = this.f9620a;
                return (obj instanceof KoinScopeComponent ? ((KoinScopeComponent) obj).i0() : GlobalContext.f18817a.a().c.d).d(Reflection.a(CurrencyFeature.class), null, null);
            }
        });
        e = LazyKt.a(lazyThreadSafetyMode, new Function0<MTicketUtilsHelper>() { // from class: app.chalo.superpass.utils.MixpanelUtil$special$$inlined$inject$default$4
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                Object obj = this.f9621a;
                return (obj instanceof KoinScopeComponent ? ((KoinScopeComponent) obj).i0() : GlobalContext.f18817a.a().c.d).d(Reflection.a(MTicketUtilsHelper.class), null, null);
            }
        });
        f = LazyKt.a(lazyThreadSafetyMode, new Function0<MobileTicketingConverters>() { // from class: app.chalo.superpass.utils.MixpanelUtil$special$$inlined$inject$default$5
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                Object obj = this.f9622a;
                return (obj instanceof KoinScopeComponent ? ((KoinScopeComponent) obj).i0() : GlobalContext.f18817a.a().c.d).d(Reflection.a(MobileTicketingConverters.class), null, null);
            }
        });
    }

    /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object, kotlin.Lazy] */
    public static void a(LinkedHashMap linkedHashMap, ElectricityBillAppModel electricityBillAppModel) {
        Intrinsics.i(electricityBillAppModel, "electricityBillAppModel");
        linkedHashMap.put("consumerNumber", electricityBillAppModel.c);
        linkedHashMap.put("consumerName", electricityBillAppModel.d);
        linkedHashMap.put("billDate", d().Q(electricityBillAppModel.f2538a));
        linkedHashMap.put("dueDate", d().Q(electricityBillAppModel.b));
        ?? r0 = d;
        CurrencyFeature currencyFeature = (CurrencyFeature) r0.getValue();
        long j = electricityBillAppModel.f;
        CurrencyRoundOffLogic currencyRoundOffLogic = CurrencyRoundOffLogic.ROUND_OFF_LOGIC_NO_ROUNDING;
        linkedHashMap.put("dueAmount", Double.valueOf(currencyFeature.f(j, currencyRoundOffLogic)));
        linkedHashMap.put("userEnteredAmount", Double.valueOf(((CurrencyFeature) r0.getValue()).f(electricityBillAppModel.g, currencyRoundOffLogic)));
        String str = electricityBillAppModel.h;
        if (str == null) {
            str = "";
        }
        linkedHashMap.put("transaction id", str);
        linkedHashMap.put("isPaymentAlreadyDone", Boolean.valueOf(electricityBillAppModel.e));
    }

    public static void b(LinkedHashMap linkedHashMap, MTicketTripReceipt mTicketTripReceipt) {
        if (mTicketTripReceipt == null || mTicketTripReceipt.c == -1) {
            linkedHashMap.put("isTripReceiptAvailable", Boolean.FALSE);
        } else {
            linkedHashMap.put("isTripReceiptAvailable", Boolean.TRUE);
        }
        if (mTicketTripReceipt != null) {
            linkedHashMap.put("mticketId", mTicketTripReceipt.f5623a);
            linkedHashMap.put("productSubType", "singleJourneyTicket");
            linkedHashMap.put("productType", "singleJourneyTicket");
            linkedHashMap.put("conductorId", mTicketTripReceipt.e);
            linkedHashMap.put("activationTime", d().e(mTicketTripReceipt.b));
            linkedHashMap.put("punchTime", d().e(mTicketTripReceipt.c));
            linkedHashMap.put("vehicleNo", mTicketTripReceipt.d);
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    public static TimeUtilsContract d() {
        return (TimeUtilsContract) b.getValue();
    }

    @Override // org.koin.core.component.KoinComponent
    public final Koin L() {
        return GlobalContext.f18817a.a();
    }

    /* JADX WARN: Code duplicated, block: B:34:0x018f  */
    /* JADX WARN: Code duplicated, block: B:37:0x01b3  */
    /* JADX WARN: Code duplicated, block: B:40:0x01f6  */
    /* JADX WARN: Code duplicated, block: B:43:0x0234 A[LOOP:0: B:43:0x0234->B:56:0x028b, LOOP_START, PHI: r2
      0x0234: PHI (r2v30 int) = (r2v29 int), (r2v31 int) binds: [B:42:0x0232, B:56:0x028b] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:45:0x023e  */
    /* JADX WARN: Code duplicated, block: B:50:0x0262  */
    /* JADX WARN: Code duplicated, block: B:56:0x028b A[LOOP:0: B:43:0x0234->B:56:0x028b, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:64:0x028d A[EDGE_INSN: B:64:0x028d->B:57:0x028d BREAK  A[LOOP:0: B:43:0x0234->B:56:0x028b], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x001b  */
    /* JADX WARN: Type inference failed for: r7v0, types: [java.lang.Object, kotlin.Lazy] */
    public final Object c(LinkedHashMap linkedHashMap, SuperPass superPass, ContinuationImpl continuationImpl) {
        MixpanelUtil$addSuperPassPropertiesToEvent$1 mixpanelUtil$addSuperPassPropertiesToEvent$1;
        TimeUtilsContract timeUtilsContractD;
        Object objC;
        SuperPass superPass2;
        String str;
        Map map;
        TimeUtilsContract timeUtilsContractD2;
        String str2;
        SuperPass superPass3;
        Map map2;
        String str3;
        SuperPass superPass4;
        Map map3;
        String str4;
        SuperPass superPass5;
        Map map4;
        Map map5;
        List list;
        int i;
        int iA;
        int i2;
        String strA;
        String strA2;
        Map map6 = linkedHashMap;
        if (continuationImpl instanceof MixpanelUtil$addSuperPassPropertiesToEvent$1) {
            mixpanelUtil$addSuperPassPropertiesToEvent$1 = (MixpanelUtil$addSuperPassPropertiesToEvent$1) continuationImpl;
            int i3 = mixpanelUtil$addSuperPassPropertiesToEvent$1.label;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                mixpanelUtil$addSuperPassPropertiesToEvent$1.label = i3 - Integer.MIN_VALUE;
            } else {
                mixpanelUtil$addSuperPassPropertiesToEvent$1 = new MixpanelUtil$addSuperPassPropertiesToEvent$1(this, continuationImpl);
            }
        } else {
            mixpanelUtil$addSuperPassPropertiesToEvent$1 = new MixpanelUtil$addSuperPassPropertiesToEvent$1(this, continuationImpl);
        }
        Object objD = mixpanelUtil$addSuperPassPropertiesToEvent$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i4 = mixpanelUtil$addSuperPassPropertiesToEvent$1.label;
        ?? r7 = c;
        Unit unit = Unit.f17538a;
        if (i4 == 0) {
            ResultKt.b(objD);
            if (superPass == null) {
                return unit;
            }
            map6.put("product user name", superPass.getC().c.c);
            map6.put("product user phone", superPass.getC().c.b);
            timeUtilsContractD = d();
            BasicInfoContract basicInfoContract = (BasicInfoContract) r7.getValue();
            mixpanelUtil$addSuperPassPropertiesToEvent$1.L$0 = map6;
            mixpanelUtil$addSuperPassPropertiesToEvent$1.L$1 = superPass;
            mixpanelUtil$addSuperPassPropertiesToEvent$1.L$2 = map6;
            mixpanelUtil$addSuperPassPropertiesToEvent$1.L$3 = "time";
            mixpanelUtil$addSuperPassPropertiesToEvent$1.L$4 = timeUtilsContractD;
            mixpanelUtil$addSuperPassPropertiesToEvent$1.label = 1;
            objC = basicInfoContract.c(mixpanelUtil$addSuperPassPropertiesToEvent$1);
            if (objC != coroutineSingletons) {
                superPass2 = superPass;
                str = "time";
                map = map6;
            }
            return coroutineSingletons;
        }
        if (i4 == 1) {
            TimeUtilsContract timeUtilsContract = (TimeUtilsContract) mixpanelUtil$addSuperPassPropertiesToEvent$1.L$4;
            str = (String) mixpanelUtil$addSuperPassPropertiesToEvent$1.L$3;
            Map map7 = (Map) mixpanelUtil$addSuperPassPropertiesToEvent$1.L$2;
            superPass2 = (SuperPass) mixpanelUtil$addSuperPassPropertiesToEvent$1.L$1;
            map = (Map) mixpanelUtil$addSuperPassPropertiesToEvent$1.L$0;
            ResultKt.b(objD);
            timeUtilsContractD = timeUtilsContract;
            map6 = map7;
            objC = objD;
        } else {
            if (i4 == 2) {
                timeUtilsContractD2 = (TimeUtilsContract) mixpanelUtil$addSuperPassPropertiesToEvent$1.L$4;
                str2 = (String) mixpanelUtil$addSuperPassPropertiesToEvent$1.L$3;
                map2 = (Map) mixpanelUtil$addSuperPassPropertiesToEvent$1.L$2;
                superPass3 = (SuperPass) mixpanelUtil$addSuperPassPropertiesToEvent$1.L$1;
                Map map8 = (Map) mixpanelUtil$addSuperPassPropertiesToEvent$1.L$0;
                ResultKt.b(objD);
                map = map8;
                map2.put(str2, timeUtilsContractD2.Q(((Number) objD).longValue()));
                TimeUtilsContract timeUtilsContractD3 = d();
                SuperPassValidationProperties b2 = superPass3.getB();
                SuperPassProperties superPassProperties = superPass3.f9560a;
                map.put("startDate", timeUtilsContractD3.Q(b2.b));
                int i5 = superPass3.getC().f9578a;
                StringBuilder sb = new StringBuilder();
                sb.append(i5);
                map.put("num Days", sb.toString());
                map.put("productType", superPassProperties.b);
                map.put("productSubType", superPassProperties.c.name());
                map.put("passId", superPassProperties.f9566a);
                map.put("transaction id", superPass3.e.f9573a);
                mixpanelUtil$addSuperPassPropertiesToEvent$1.L$0 = map;
                mixpanelUtil$addSuperPassPropertiesToEvent$1.L$1 = superPass3;
                mixpanelUtil$addSuperPassPropertiesToEvent$1.L$2 = map;
                str3 = "last activation time stamp";
                mixpanelUtil$addSuperPassPropertiesToEvent$1.L$3 = "last activation time stamp";
                mixpanelUtil$addSuperPassPropertiesToEvent$1.L$4 = null;
                mixpanelUtil$addSuperPassPropertiesToEvent$1.label = 3;
                objD = superPass3.d(mixpanelUtil$addSuperPassPropertiesToEvent$1);
                if (objD != coroutineSingletons) {
                    superPass4 = superPass3;
                    map3 = map;
                    map3.put(str3, objD);
                    map.put("configId", superPass4.d.f9569a);
                    map.put("fare", new Double(superPass4.getC().f.f9545a));
                    if (superPass4 instanceof RideBasedSuperPass) {
                        RideBasedSuperPass rideBasedSuperPass = (RideBasedSuperPass) superPass4;
                        RideBasedSuperPassValidationProperties rideBasedSuperPassValidationProperties = rideBasedSuperPass.g;
                        map.put("ss total trip count", new Integer(rideBasedSuperPassValidationProperties.m));
                        map.put("total trip count available", new Integer(rideBasedSuperPass.o()));
                        map.put("ss daily trip count", new Integer(rideBasedSuperPassValidationProperties.l));
                        mixpanelUtil$addSuperPassPropertiesToEvent$1.L$0 = map;
                        mixpanelUtil$addSuperPassPropertiesToEvent$1.L$1 = superPass4;
                        mixpanelUtil$addSuperPassPropertiesToEvent$1.L$2 = map;
                        mixpanelUtil$addSuperPassPropertiesToEvent$1.L$3 = "ss daily trip count available";
                        mixpanelUtil$addSuperPassPropertiesToEvent$1.label = 4;
                        objD = rideBasedSuperPass.p(mixpanelUtil$addSuperPassPropertiesToEvent$1);
                        if (objD != coroutineSingletons) {
                            str4 = "ss daily trip count available";
                            superPass5 = superPass4;
                            map4 = map;
                            map5 = map4;
                        }
                    }
                    map.put("isSuperPass", Boolean.TRUE);
                    return unit;
                }
                return coroutineSingletons;
            }
            if (i4 == 3) {
                str3 = (String) mixpanelUtil$addSuperPassPropertiesToEvent$1.L$3;
                map3 = (Map) mixpanelUtil$addSuperPassPropertiesToEvent$1.L$2;
                superPass4 = (SuperPass) mixpanelUtil$addSuperPassPropertiesToEvent$1.L$1;
                Map map9 = (Map) mixpanelUtil$addSuperPassPropertiesToEvent$1.L$0;
                ResultKt.b(objD);
                map = map9;
                map3.put(str3, objD);
                map.put("configId", superPass4.d.f9569a);
                map.put("fare", new Double(superPass4.getC().f.f9545a));
                if (superPass4 instanceof RideBasedSuperPass) {
                    RideBasedSuperPass rideBasedSuperPass2 = (RideBasedSuperPass) superPass4;
                    RideBasedSuperPassValidationProperties rideBasedSuperPassValidationProperties2 = rideBasedSuperPass2.g;
                    map.put("ss total trip count", new Integer(rideBasedSuperPassValidationProperties2.m));
                    map.put("total trip count available", new Integer(rideBasedSuperPass2.o()));
                    map.put("ss daily trip count", new Integer(rideBasedSuperPassValidationProperties2.l));
                    mixpanelUtil$addSuperPassPropertiesToEvent$1.L$0 = map;
                    mixpanelUtil$addSuperPassPropertiesToEvent$1.L$1 = superPass4;
                    mixpanelUtil$addSuperPassPropertiesToEvent$1.L$2 = map;
                    mixpanelUtil$addSuperPassPropertiesToEvent$1.L$3 = "ss daily trip count available";
                    mixpanelUtil$addSuperPassPropertiesToEvent$1.label = 4;
                    objD = rideBasedSuperPass2.p(mixpanelUtil$addSuperPassPropertiesToEvent$1);
                    if (objD != coroutineSingletons) {
                        str4 = "ss daily trip count available";
                        superPass5 = superPass4;
                        map4 = map;
                        map5 = map4;
                    }
                    return coroutineSingletons;
                }
                map.put("isSuperPass", Boolean.TRUE);
                return unit;
            }
            if (i4 != 4) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            str4 = (String) mixpanelUtil$addSuperPassPropertiesToEvent$1.L$3;
            map4 = (Map) mixpanelUtil$addSuperPassPropertiesToEvent$1.L$2;
            superPass5 = (SuperPass) mixpanelUtil$addSuperPassPropertiesToEvent$1.L$1;
            map5 = (Map) mixpanelUtil$addSuperPassPropertiesToEvent$1.L$0;
            ResultKt.b(objD);
        }
        map4.put(str4, objD);
        RideBasedSuperPass rideBasedSuperPass3 = (RideBasedSuperPass) superPass5;
        map5.put("ss max trip price", new Double(rideBasedSuperPass3.h.m));
        list = rideBasedSuperPass3.g.o.c;
        map5.put("previous ride activation time stamps size", new Integer(list.size()));
        i = 0;
        iA = ProgressionUtilKt.a(0, list.size() - 1, 10);
        if (iA >= 0) {
            while (true) {
                i2 = i + 10;
                if (i2 < list.size()) {
                    String strJ = vo1.j(i, "previous ride activation time stamps_");
                    ChaloJson chaloJson = ChaloJson.f6455a;
                    List listSubList = list.subList(i, i2);
                    try {
                        Json json = ChaloJson.b;
                        json.getClass();
                        strA2 = json.a(new ArrayListSerializer(LongSerializer.f18151a), listSubList);
                    } catch (Exception unused) {
                        strA2 = null;
                    }
                    map5.put(strJ, String.valueOf(strA2));
                } else {
                    String strJ2 = vo1.j(i, "previous ride activation time stamps_");
                    ChaloJson chaloJson2 = ChaloJson.f6455a;
                    List listSubList2 = list.subList(i, list.size());
                    try {
                        Json json2 = ChaloJson.b;
                        json2.getClass();
                        strA = json2.a(new ArrayListSerializer(LongSerializer.f18151a), listSubList2);
                    } catch (Exception unused2) {
                        strA = null;
                    }
                    map5.put(strJ2, String.valueOf(strA));
                }
                if (i != iA) {
                    break;
                }
                i = i2;
            }
        }
        map = map5;
        map.put("isSuperPass", Boolean.TRUE);
        return unit;
        map6.put(str, timeUtilsContractD.x(((Number) objC).longValue()));
        timeUtilsContractD2 = d();
        BasicInfoContract basicInfoContract2 = (BasicInfoContract) r7.getValue();
        mixpanelUtil$addSuperPassPropertiesToEvent$1.L$0 = map;
        mixpanelUtil$addSuperPassPropertiesToEvent$1.L$1 = superPass2;
        mixpanelUtil$addSuperPassPropertiesToEvent$1.L$2 = map;
        mixpanelUtil$addSuperPassPropertiesToEvent$1.L$3 = CLConstants.SHARED_PREFERENCE_ITEM_DATE;
        mixpanelUtil$addSuperPassPropertiesToEvent$1.L$4 = timeUtilsContractD2;
        mixpanelUtil$addSuperPassPropertiesToEvent$1.label = 2;
        Object objC2 = basicInfoContract2.c(mixpanelUtil$addSuperPassPropertiesToEvent$1);
        if (objC2 != coroutineSingletons) {
            objD = objC2;
            str2 = CLConstants.SHARED_PREFERENCE_ITEM_DATE;
            superPass3 = superPass2;
            map2 = map;
            map2.put(str2, timeUtilsContractD2.Q(((Number) objD).longValue()));
            TimeUtilsContract timeUtilsContractD4 = d();
            SuperPassValidationProperties b3 = superPass3.getB();
            SuperPassProperties superPassProperties2 = superPass3.f9560a;
            map.put("startDate", timeUtilsContractD4.Q(b3.b));
            int i6 = superPass3.getC().f9578a;
            StringBuilder sb2 = new StringBuilder();
            sb2.append(i6);
            map.put("num Days", sb2.toString());
            map.put("productType", superPassProperties2.b);
            map.put("productSubType", superPassProperties2.c.name());
            map.put("passId", superPassProperties2.f9566a);
            map.put("transaction id", superPass3.e.f9573a);
            mixpanelUtil$addSuperPassPropertiesToEvent$1.L$0 = map;
            mixpanelUtil$addSuperPassPropertiesToEvent$1.L$1 = superPass3;
            mixpanelUtil$addSuperPassPropertiesToEvent$1.L$2 = map;
            str3 = "last activation time stamp";
            mixpanelUtil$addSuperPassPropertiesToEvent$1.L$3 = "last activation time stamp";
            mixpanelUtil$addSuperPassPropertiesToEvent$1.L$4 = null;
            mixpanelUtil$addSuperPassPropertiesToEvent$1.label = 3;
            objD = superPass3.d(mixpanelUtil$addSuperPassPropertiesToEvent$1);
            if (objD != coroutineSingletons) {
                superPass4 = superPass3;
                map3 = map;
                map3.put(str3, objD);
                map.put("configId", superPass4.d.f9569a);
                map.put("fare", new Double(superPass4.getC().f.f9545a));
                if (superPass4 instanceof RideBasedSuperPass) {
                    RideBasedSuperPass rideBasedSuperPass4 = (RideBasedSuperPass) superPass4;
                    RideBasedSuperPassValidationProperties rideBasedSuperPassValidationProperties3 = rideBasedSuperPass4.g;
                    map.put("ss total trip count", new Integer(rideBasedSuperPassValidationProperties3.m));
                    map.put("total trip count available", new Integer(rideBasedSuperPass4.o()));
                    map.put("ss daily trip count", new Integer(rideBasedSuperPassValidationProperties3.l));
                    mixpanelUtil$addSuperPassPropertiesToEvent$1.L$0 = map;
                    mixpanelUtil$addSuperPassPropertiesToEvent$1.L$1 = superPass4;
                    mixpanelUtil$addSuperPassPropertiesToEvent$1.L$2 = map;
                    mixpanelUtil$addSuperPassPropertiesToEvent$1.L$3 = "ss daily trip count available";
                    mixpanelUtil$addSuperPassPropertiesToEvent$1.label = 4;
                    objD = rideBasedSuperPass4.p(mixpanelUtil$addSuperPassPropertiesToEvent$1);
                    if (objD != coroutineSingletons) {
                        str4 = "ss daily trip count available";
                        superPass5 = superPass4;
                        map4 = map;
                        map5 = map4;
                        map4.put(str4, objD);
                        RideBasedSuperPass rideBasedSuperPass5 = (RideBasedSuperPass) superPass5;
                        map5.put("ss max trip price", new Double(rideBasedSuperPass5.h.m));
                        list = rideBasedSuperPass5.g.o.c;
                        map5.put("previous ride activation time stamps size", new Integer(list.size()));
                        i = 0;
                        iA = ProgressionUtilKt.a(0, list.size() - 1, 10);
                        if (iA >= 0) {
                            while (true) {
                                i2 = i + 10;
                                if (i2 < list.size()) {
                                    String strJ3 = vo1.j(i, "previous ride activation time stamps_");
                                    ChaloJson chaloJson3 = ChaloJson.f6455a;
                                    List listSubList3 = list.subList(i, i2);
                                    Json json3 = ChaloJson.b;
                                    json3.getClass();
                                    strA2 = json3.a(new ArrayListSerializer(LongSerializer.f18151a), listSubList3);
                                    map5.put(strJ3, String.valueOf(strA2));
                                } else {
                                    String strJ4 = vo1.j(i, "previous ride activation time stamps_");
                                    ChaloJson chaloJson4 = ChaloJson.f6455a;
                                    List listSubList4 = list.subList(i, list.size());
                                    Json json4 = ChaloJson.b;
                                    json4.getClass();
                                    strA = json4.a(new ArrayListSerializer(LongSerializer.f18151a), listSubList4);
                                    map5.put(strJ4, String.valueOf(strA));
                                }
                                if (i != iA) {
                                    break;
                                    break;
                                }
                                i = i2;
                            }
                        }
                        map = map5;
                    }
                }
                map.put("isSuperPass", Boolean.TRUE);
                return unit;
            }
        }
        return coroutineSingletons;
    }
}
