package app.chalo.premiumbus.ui.bulkbookingsuccess;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import app.chalo.analytics.AnalyticsContractImplKt;
import app.chalo.constants.Source;
import app.chalo.models.SuperPassSubTypes;
import app.chalo.premiumbus.data.SuperPassDataWrapper;
import app.chalo.premiumbus.data.SuperPassStatusAppModel;
import app.chalo.premiumbus.data.SuperPassTripPreferencesAppModel;
import app.chalo.premiumbus.data.SuperPassUiPropertiesAppModel;
import app.chalo.premiumbus.data.SuperPassValidationPropertiesAppModel;
import app.chalo.premiumbus.ui.seatselection.PremiumBusSeatSelectionFlowType;
import app.chalo.premiumbus.ui.slotselection.DateAndSlotSelectedForBulkBooking;
import app.chalo.premiumbus.ui.slotselection.SlotsAvailableForSelection;
import app.chalo.productbooking.common.data.models.app.ProductConfigCompleteDetailsListAppModel;
import app.chalo.productbooking.common.domain.FetchCompleteProductConfigByIdWithLocalCacheUseCase;
import app.chalo.providers.toast.KotlinToastManagerKt;
import app.chalo.providers.toast.ToastLength;
import app.chalo.utils.ChaloUseCaseResult;
import defpackage.gt0;
import defpackage.ta;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.EmptyList;
import kotlin.collections.MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "app.chalo.premiumbus.ui.bulkbookingsuccess.PremiumBusBulkBookingConfirmationComponent$handleInitializationIntent$2", f = "PremiumBusBulkBookingConfirmationComponent.kt", l = {TypedValues.CycleType.TYPE_CUSTOM_WAVE_SHAPE, TypedValues.CycleType.TYPE_WAVE_OFFSET, 427, 454, 457}, m = "invokeSuspend", v = 1)
final class PremiumBusBulkBookingConfirmationComponent$handleInitializationIntent$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ PremiumBusBulkBookingConfirmationIntent.InitializationIntent $intent;
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    Object L$5;
    int label;
    final /* synthetic */ PremiumBusBulkBookingConfirmationComponent this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PremiumBusBulkBookingConfirmationComponent$handleInitializationIntent$2(PremiumBusBulkBookingConfirmationIntent.InitializationIntent initializationIntent, PremiumBusBulkBookingConfirmationComponent premiumBusBulkBookingConfirmationComponent, Continuation continuation) {
        super(2, continuation);
        this.$intent = initializationIntent;
        this.this$0 = premiumBusBulkBookingConfirmationComponent;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new PremiumBusBulkBookingConfirmationComponent$handleInitializationIntent$2(this.$intent, this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((PremiumBusBulkBookingConfirmationComponent$handleInitializationIntent$2) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f17538a);
    }

    /* JADX WARN: Code duplicated, block: B:27:0x0125  */
    /* JADX WARN: Code duplicated, block: B:30:0x012f A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:45:0x01b3  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        PremiumBusSeatSelectionFlowType.BulkBooking bulkBooking;
        String str;
        SuperPassSubTypes superPassSubTypesA;
        Object objA;
        Object objB;
        SuperPassSubTypes superPassSubTypes;
        PremiumBusSeatSelectionFlowType.BulkBooking bulkBooking2;
        String str2;
        SuperPassTripPreferencesAppModel superPassTripPreferencesAppModel;
        SuperPassUiPropertiesAppModel superPassUiPropertiesAppModel;
        Object objC;
        SuperPassSubTypes superPassSubTypes2;
        SuperPassUiPropertiesAppModel superPassUiPropertiesAppModel2;
        PremiumBusSeatSelectionFlowType.BulkBooking bulkBooking3;
        Object objF0;
        PassInfo passInfo;
        PremiumBusSeatSelectionFlowType.BulkBooking bulkBooking4;
        String str3;
        SuperPassSubTypes superPassSubTypes3;
        Map map;
        String str4;
        Object objA2;
        String str5;
        SuperPassSubTypes superPassSubTypes4;
        PremiumBusSeatSelectionFlowType.BulkBooking bulkBooking5;
        PassInfo passInfo2;
        Map map2;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        Unit unit = Unit.f17538a;
        char c = 5;
        char c2 = 4;
        char c3 = 3;
        char c4 = 1;
        char c5 = 2;
        List list = null;
        if (i == 0) {
            ResultKt.b(obj);
            bulkBooking = this.$intent.f7497a;
            str = bulkBooking.d;
            SuperPassSubTypes.Companion companion = SuperPassSubTypes.INSTANCE;
            String str6 = bulkBooking.e;
            companion.getClass();
            superPassSubTypesA = SuperPassSubTypes.Companion.a(str6);
            SuperPassDataWrapper superPassDataWrapper = this.this$0.l;
            this.L$0 = bulkBooking;
            this.L$1 = str;
            this.L$2 = superPassSubTypesA;
            this.label = 1;
            objA = superPassDataWrapper.a(str, superPassSubTypesA, this);
            if (objA != coroutineSingletons) {
            }
            return coroutineSingletons;
        }
        if (i == 1) {
            superPassSubTypesA = (SuperPassSubTypes) this.L$2;
            str = (String) this.L$1;
            bulkBooking = (PremiumBusSeatSelectionFlowType.BulkBooking) this.L$0;
            ResultKt.b(obj);
            objA = obj;
        } else {
            if (i == 2) {
                SuperPassTripPreferencesAppModel superPassTripPreferencesAppModel2 = (SuperPassTripPreferencesAppModel) this.L$3;
                SuperPassSubTypes superPassSubTypes5 = (SuperPassSubTypes) this.L$2;
                String str7 = (String) this.L$1;
                PremiumBusSeatSelectionFlowType.BulkBooking bulkBooking6 = (PremiumBusSeatSelectionFlowType.BulkBooking) this.L$0;
                ResultKt.b(obj);
                superPassTripPreferencesAppModel = superPassTripPreferencesAppModel2;
                bulkBooking2 = bulkBooking6;
                str2 = str7;
                superPassSubTypes = superPassSubTypes5;
                objB = obj;
                superPassUiPropertiesAppModel = (SuperPassUiPropertiesAppModel) objB;
                SuperPassDataWrapper superPassDataWrapper2 = this.this$0.l;
                this.L$0 = bulkBooking2;
                this.L$1 = str2;
                this.L$2 = superPassSubTypes;
                this.L$3 = superPassTripPreferencesAppModel;
                this.L$4 = superPassUiPropertiesAppModel;
                this.label = 3;
                objC = superPassDataWrapper2.c(str2, superPassSubTypes, this);
                if (objC != coroutineSingletons) {
                    superPassSubTypes2 = superPassSubTypes;
                    superPassUiPropertiesAppModel2 = superPassUiPropertiesAppModel;
                    bulkBooking3 = bulkBooking2;
                    SuperPassTripPreferencesAppModel superPassTripPreferencesAppModel3 = superPassTripPreferencesAppModel;
                    SuperPassValidationPropertiesAppModel superPassValidationPropertiesAppModel = (SuperPassValidationPropertiesAppModel) objC;
                    if (superPassUiPropertiesAppModel2 != null) {
                    }
                    this.this$0.E0(new gt0(10));
                    KotlinToastManagerKt.a(this.this$0.m, "pass data not available", ToastLength.LONG);
                    return unit;
                }
                return coroutineSingletons;
            }
            if (i == 3) {
                SuperPassUiPropertiesAppModel superPassUiPropertiesAppModel3 = (SuperPassUiPropertiesAppModel) this.L$4;
                superPassTripPreferencesAppModel = (SuperPassTripPreferencesAppModel) this.L$3;
                SuperPassSubTypes superPassSubTypes6 = (SuperPassSubTypes) this.L$2;
                str2 = (String) this.L$1;
                bulkBooking3 = (PremiumBusSeatSelectionFlowType.BulkBooking) this.L$0;
                ResultKt.b(obj);
                objC = obj;
                superPassSubTypes2 = superPassSubTypes6;
                superPassUiPropertiesAppModel2 = superPassUiPropertiesAppModel3;
                SuperPassTripPreferencesAppModel superPassTripPreferencesAppModel4 = superPassTripPreferencesAppModel;
                SuperPassValidationPropertiesAppModel superPassValidationPropertiesAppModel2 = (SuperPassValidationPropertiesAppModel) objC;
                if (superPassUiPropertiesAppModel2 != null || superPassValidationPropertiesAppModel2 == null || superPassTripPreferencesAppModel4 == null) {
                    this.this$0.E0(new gt0(10));
                    KotlinToastManagerKt.a(this.this$0.m, "pass data not available", ToastLength.LONG);
                    return unit;
                }
                String str8 = superPassUiPropertiesAppModel2.g;
                String str9 = superPassUiPropertiesAppModel2.l;
                long j = superPassValidationPropertiesAppModel2.c;
                SuperPassStatusAppModel superPassStatusAppModel = superPassValidationPropertiesAppModel2.f6977a;
                int iA = superPassValidationPropertiesAppModel2.a();
                Integer num = superPassValidationPropertiesAppModel2.e;
                PassInfo passInfo3 = new PassInfo(str8, str9, j, superPassStatusAppModel, iA, num != null ? num.intValue() : -1, superPassTripPreferencesAppModel4, superPassUiPropertiesAppModel2.b, EmptyList.f17557a, superPassSubTypes2, superPassUiPropertiesAppModel2.m);
                SuperPassSubTypes superPassSubTypes7 = superPassSubTypes2;
                LinkedHashMap linkedHashMapG0 = PremiumBusBulkBookingConfirmationComponent.G0(this.this$0, bulkBooking3.j);
                PremiumBusBulkBookingConfirmationComponent premiumBusBulkBookingConfirmationComponent = this.this$0;
                List list2 = bulkBooking3.j;
                this.L$0 = bulkBooking3;
                this.L$1 = str2;
                this.L$2 = superPassSubTypes7;
                this.L$3 = superPassUiPropertiesAppModel2;
                this.L$4 = passInfo3;
                this.L$5 = linkedHashMapG0;
                this.label = 4;
                objF0 = PremiumBusBulkBookingConfirmationComponent.F0(premiumBusBulkBookingConfirmationComponent, list2, this);
                if (objF0 != coroutineSingletons) {
                    passInfo = passInfo3;
                    bulkBooking4 = bulkBooking3;
                    str3 = str2;
                    superPassSubTypes3 = superPassSubTypes7;
                    map = linkedHashMapG0;
                    str4 = (String) objF0;
                    FetchCompleteProductConfigByIdWithLocalCacheUseCase fetchCompleteProductConfigByIdWithLocalCacheUseCase = this.this$0.r;
                    String str10 = superPassUiPropertiesAppModel2.l;
                    this.L$0 = bulkBooking4;
                    this.L$1 = str3;
                    this.L$2 = superPassSubTypes3;
                    this.L$3 = passInfo;
                    this.L$4 = map;
                    this.L$5 = str4;
                    this.label = 5;
                    objA2 = fetchCompleteProductConfigByIdWithLocalCacheUseCase.a(str10, null, null, this);
                    if (objA2 != coroutineSingletons) {
                        str5 = str4;
                        superPassSubTypes4 = superPassSubTypes3;
                        bulkBooking5 = bulkBooking4;
                        passInfo2 = passInfo;
                        map2 = map;
                    }
                }
                return coroutineSingletons;
            }
            if (i == 4) {
                map = (Map) this.L$5;
                passInfo = (PassInfo) this.L$4;
                superPassUiPropertiesAppModel2 = (SuperPassUiPropertiesAppModel) this.L$3;
                superPassSubTypes3 = (SuperPassSubTypes) this.L$2;
                str3 = (String) this.L$1;
                bulkBooking4 = (PremiumBusSeatSelectionFlowType.BulkBooking) this.L$0;
                ResultKt.b(obj);
                objF0 = obj;
                str4 = (String) objF0;
                FetchCompleteProductConfigByIdWithLocalCacheUseCase fetchCompleteProductConfigByIdWithLocalCacheUseCase2 = this.this$0.r;
                String str11 = superPassUiPropertiesAppModel2.l;
                this.L$0 = bulkBooking4;
                this.L$1 = str3;
                this.L$2 = superPassSubTypes3;
                this.L$3 = passInfo;
                this.L$4 = map;
                this.L$5 = str4;
                this.label = 5;
                objA2 = fetchCompleteProductConfigByIdWithLocalCacheUseCase2.a(str11, null, null, this);
                if (objA2 != coroutineSingletons) {
                    str5 = str4;
                    superPassSubTypes4 = superPassSubTypes3;
                    bulkBooking5 = bulkBooking4;
                    passInfo2 = passInfo;
                    map2 = map;
                }
                return coroutineSingletons;
            }
            if (i != 5) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            String str12 = (String) this.L$5;
            Map map3 = (Map) this.L$4;
            PassInfo passInfo4 = (PassInfo) this.L$3;
            SuperPassSubTypes superPassSubTypes8 = (SuperPassSubTypes) this.L$2;
            String str13 = (String) this.L$1;
            PremiumBusSeatSelectionFlowType.BulkBooking bulkBooking7 = (PremiumBusSeatSelectionFlowType.BulkBooking) this.L$0;
            ResultKt.b(obj);
            str5 = str12;
            c3 = 3;
            c4 = 1;
            c5 = 2;
            superPassSubTypes4 = superPassSubTypes8;
            bulkBooking5 = bulkBooking7;
            objA2 = obj;
            str3 = str13;
            map2 = map3;
            passInfo2 = passInfo4;
        }
        ChaloUseCaseResult chaloUseCaseResult = (ChaloUseCaseResult) objA2;
        if (!(chaloUseCaseResult instanceof ChaloUseCaseResult.Failure)) {
            if (!(chaloUseCaseResult instanceof ChaloUseCaseResult.Success)) {
                throw new NoWhenBranchMatchedException();
            }
            list = ((ProductConfigCompleteDetailsListAppModel) ((ChaloUseCaseResult.Success) chaloUseCaseResult).f10419a).f8205a.f;
        }
        this.this$0.E0(new ta(bulkBooking5, this.$intent, str3, map2, passInfo2, str5, list, 1));
        PremiumBusBulkBookingConfirmationComponent premiumBusBulkBookingConfirmationComponent2 = this.this$0;
        String str14 = passInfo2.b;
        String str15 = bulkBooking5.f;
        String str16 = bulkBooking5.g;
        List list3 = bulkBooking5.j;
        List list4 = bulkBooking5.k;
        Source source = this.$intent.b;
        premiumBusBulkBookingConfirmationComponent2.getClass();
        List list5 = list3;
        ArrayList arrayList = new ArrayList();
        Iterator it = list5.iterator();
        while (it.hasNext()) {
            List list6 = ((DateAndSlotSelectedForBulkBooking) it.next()).d;
            char c6 = c;
            SuperPassSubTypes superPassSubTypes9 = superPassSubTypes4;
            char c7 = c2;
            ArrayList arrayList2 = new ArrayList(CollectionsKt.v(list6, 10));
            Iterator it2 = list6.iterator();
            while (it2.hasNext()) {
                arrayList2.add(((SlotsAvailableForSelection) it2.next()).f7902a.b);
            }
            CollectionsKt.i(arrayList2, arrayList);
            superPassSubTypes4 = superPassSubTypes9;
            c = c6;
            c2 = c7;
        }
        SuperPassSubTypes superPassSubTypes10 = superPassSubTypes4;
        char c8 = c;
        char c9 = c2;
        List listZ = CollectionsKt.z(arrayList);
        Iterator it3 = list5.iterator();
        int size = 0;
        while (it3.hasNext()) {
            size += ((DateAndSlotSelectedForBulkBooking) it3.next()).d.size();
        }
        Pair pair = new Pair("passId", str3);
        Pair pair2 = new Pair("configId", str14);
        Pair pair3 = new Pair("from stop id", str15);
        Pair pair4 = new Pair("to stop id", str16);
        Pair pair5 = new Pair("trip ids", CollectionsKt.O(listZ, ",", null, null, null, 62));
        Pair pair6 = new Pair("noOfSeatsSelected", String.valueOf(list4.size()));
        Pair pair7 = new Pair("number of trips", String.valueOf(size));
        Pair pair8 = new Pair("productSubType", superPassSubTypes10.toString());
        Pair[] pairArr = new Pair[8];
        pairArr[0] = pair;
        pairArr[c4] = pair2;
        pairArr[c5] = pair3;
        pairArr[c3] = pair4;
        pairArr[c9] = pair5;
        pairArr[c8] = pair6;
        pairArr[6] = pair7;
        pairArr[7] = pair8;
        AnalyticsContractImplKt.a(premiumBusBulkBookingConfirmationComponent2.p, "bulk booking cnf screen opened", Source.PREMIUM_BUS_PRE_BOOKING_RIDES_CONFIRMATION_SCREEN, source, MapsKt.k(pairArr), 48);
        return unit;
        SuperPassTripPreferencesAppModel superPassTripPreferencesAppModel5 = (SuperPassTripPreferencesAppModel) objA;
        SuperPassDataWrapper superPassDataWrapper3 = this.this$0.l;
        this.L$0 = bulkBooking;
        this.L$1 = str;
        this.L$2 = superPassSubTypesA;
        this.L$3 = superPassTripPreferencesAppModel5;
        this.label = 2;
        objB = superPassDataWrapper3.b(str, superPassSubTypesA, this);
        if (objB != coroutineSingletons) {
            PremiumBusSeatSelectionFlowType.BulkBooking bulkBooking8 = bulkBooking;
            superPassSubTypes = superPassSubTypesA;
            bulkBooking2 = bulkBooking8;
            str2 = str;
            superPassTripPreferencesAppModel = superPassTripPreferencesAppModel5;
            superPassUiPropertiesAppModel = (SuperPassUiPropertiesAppModel) objB;
            SuperPassDataWrapper superPassDataWrapper4 = this.this$0.l;
            this.L$0 = bulkBooking2;
            this.L$1 = str2;
            this.L$2 = superPassSubTypes;
            this.L$3 = superPassTripPreferencesAppModel;
            this.L$4 = superPassUiPropertiesAppModel;
            this.label = 3;
            objC = superPassDataWrapper4.c(str2, superPassSubTypes, this);
            if (objC != coroutineSingletons) {
                superPassSubTypes2 = superPassSubTypes;
                superPassUiPropertiesAppModel2 = superPassUiPropertiesAppModel;
                bulkBooking3 = bulkBooking2;
                SuperPassTripPreferencesAppModel superPassTripPreferencesAppModel6 = superPassTripPreferencesAppModel;
                SuperPassValidationPropertiesAppModel superPassValidationPropertiesAppModel3 = (SuperPassValidationPropertiesAppModel) objC;
                if (superPassUiPropertiesAppModel2 != null) {
                }
                this.this$0.E0(new gt0(10));
                KotlinToastManagerKt.a(this.this$0.m, "pass data not available", ToastLength.LONG);
                return unit;
            }
        }
        return coroutineSingletons;
    }
}
