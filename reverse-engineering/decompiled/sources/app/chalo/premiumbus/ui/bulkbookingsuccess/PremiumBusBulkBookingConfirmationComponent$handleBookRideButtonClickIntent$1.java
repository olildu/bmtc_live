package app.chalo.premiumbus.ui.bulkbookingsuccess;

import app.chalo.analytics.AnalyticsContractImplKt;
import app.chalo.analytics.contract.AnalyticsContract;
import app.chalo.bookingsuccess.data.BulkBookingAcknowledgementData;
import app.chalo.constants.Source;
import app.chalo.models.SuperPassSubTypes;
import app.chalo.mvibase.simple.UseCaseOperationError;
import app.chalo.network.config.ChaloJson;
import app.chalo.premiumbus.ui.slotselection.DateAndSlotSelectedForBulkBooking;
import app.chalo.premiumbus.ui.slotselection.SlotsAvailableForSelection;
import app.chalo.productbooking.common.domain.BulkPreBookRequestFailedReason;
import app.chalo.productbooking.common.domain.BulkPreBookUseCase;
import app.chalo.scenes.ChaloNavigationManager;
import app.chalo.scenes.ChaloNavigationRequest;
import app.chalo.scenes.args.BookingSuccessArgs;
import app.chalo.utils.ChaloUseCaseResult;
import defpackage.gt0;
import defpackage.vo1;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
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
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.serialization.json.Json;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "app.chalo.premiumbus.ui.bulkbookingsuccess.PremiumBusBulkBookingConfirmationComponent$handleBookRideButtonClickIntent$1", f = "PremiumBusBulkBookingConfirmationComponent.kt", l = {359, 370}, m = "invokeSuspend", v = 1)
final class PremiumBusBulkBookingConfirmationComponent$handleBookRideButtonClickIntent$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ PremiumBusBulkBookingConfirmationComponent this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PremiumBusBulkBookingConfirmationComponent$handleBookRideButtonClickIntent$1(PremiumBusBulkBookingConfirmationComponent premiumBusBulkBookingConfirmationComponent, Continuation continuation) {
        super(2, continuation);
        this.this$0 = premiumBusBulkBookingConfirmationComponent;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new PremiumBusBulkBookingConfirmationComponent$handleBookRideButtonClickIntent$1(this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((PremiumBusBulkBookingConfirmationComponent$handleBookRideButtonClickIntent$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f17538a);
    }

    /* JADX WARN: Code duplicated, block: B:28:0x00ae  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        List listZ;
        int size;
        String str;
        int i;
        int i2;
        Object objB;
        List list;
        List list2;
        Object objN0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i3 = this.label;
        Unit unit = Unit.f17538a;
        if (i3 == 0) {
            ResultKt.b(obj);
            String str2 = ((PremiumBusBulkBookingConfirmationDataState) this.this$0.f.getValue()).b;
            List list3 = ((PremiumBusBulkBookingConfirmationDataState) this.this$0.f.getValue()).c;
            if (list3 == null) {
                list3 = EmptyList.f17557a;
            }
            List list4 = list3;
            List list5 = ((PremiumBusBulkBookingConfirmationDataState) this.this$0.f.getValue()).d;
            if (list5 != null) {
                ArrayList arrayList = new ArrayList();
                Iterator it = list5.iterator();
                while (it.hasNext()) {
                    List list6 = ((DateAndSlotSelectedForBulkBooking) it.next()).d;
                    ArrayList arrayList2 = new ArrayList(CollectionsKt.v(list6, 10));
                    Iterator it2 = list6.iterator();
                    while (it2.hasNext()) {
                        arrayList2.add(((SlotsAvailableForSelection) it2.next()).f7902a.b);
                    }
                    CollectionsKt.i(arrayList2, arrayList);
                }
                listZ = CollectionsKt.z(arrayList);
                if (listZ == null) {
                    listZ = EmptyList.f17557a;
                }
            } else {
                listZ = EmptyList.f17557a;
            }
            List list7 = listZ;
            PassInfo passInfo = ((PremiumBusBulkBookingConfirmationDataState) this.this$0.f.getValue()).g;
            List list8 = ((PremiumBusBulkBookingConfirmationDataState) this.this$0.f.getValue()).d;
            if (list8 != null) {
                Iterator it3 = list8.iterator();
                size = 0;
                while (it3.hasNext()) {
                    size += ((DateAndSlotSelectedForBulkBooking) it3.next()).d.size();
                }
            } else {
                size = 0;
            }
            PremiumBusBulkBookingConfirmationComponent premiumBusBulkBookingConfirmationComponent = this.this$0;
            if (passInfo == null || (str = passInfo.b) == null) {
                str = "";
            }
            SuperPassSubTypes superPassSubTypes = passInfo != null ? passInfo.j : null;
            String str3 = ((PremiumBusBulkBookingConfirmationDataState) premiumBusBulkBookingConfirmationComponent.f.getValue()).i;
            if (str3 == null) {
                str3 = "";
            }
            i = 6;
            String str4 = ((PremiumBusBulkBookingConfirmationDataState) this.this$0.f.getValue()).j;
            if (str4 == null) {
                str4 = "";
            }
            i2 = 2;
            int i4 = 7;
            LinkedHashMap linkedHashMapK = MapsKt.k(new Pair("passId", str2), new Pair("configId", str), new Pair("from stop id", str3), new Pair("to stop id", str4), new Pair("trip ids", CollectionsKt.O(list7, ",", null, null, null, 62)), new Pair("noOfSeatsSelected", String.valueOf(list4.size())), new Pair("number of trips", String.valueOf(size)));
            if (superPassSubTypes != null) {
                linkedHashMapK.put("productSubType", superPassSubTypes.toString());
            }
            AnalyticsContractImplKt.b(premiumBusBulkBookingConfirmationComponent.p, "bulk booking cnf book ride clicked", Source.PREMIUM_BUS_PRE_BOOKING_RIDES_CONFIRMATION_SCREEN, linkedHashMapK, false, 24);
            this.this$0.E0(new gt0(i4));
            PremiumBusBulkBookingConfirmationComponent premiumBusBulkBookingConfirmationComponent2 = this.this$0;
            BulkPreBookUseCase bulkPreBookUseCase = premiumBusBulkBookingConfirmationComponent2.o;
            String str5 = ((PremiumBusBulkBookingConfirmationDataState) premiumBusBulkBookingConfirmationComponent2.f.getValue()).i;
            String str6 = str5 == null ? "" : str5;
            String str7 = ((PremiumBusBulkBookingConfirmationDataState) this.this$0.f.getValue()).j;
            String str8 = str7 == null ? "" : str7;
            boolean z = ((PremiumBusBulkBookingConfirmationDataState) this.this$0.f.getValue()).o;
            this.L$0 = list4;
            this.L$1 = list7;
            this.label = 1;
            objB = bulkPreBookUseCase.b(str2, str8, str6, list7, list4, z, this);
            if (objB != coroutineSingletons) {
                list = list7;
                list2 = list4;
            }
            return coroutineSingletons;
        }
        if (i3 != 1) {
            if (i3 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(obj);
            return unit;
        }
        List list9 = (List) this.L$1;
        List list10 = (List) this.L$0;
        ResultKt.b(obj);
        list = list9;
        list2 = list10;
        i2 = 2;
        i = 6;
        objB = obj;
        ChaloUseCaseResult chaloUseCaseResult = (ChaloUseCaseResult) objB;
        if (chaloUseCaseResult instanceof ChaloUseCaseResult.Failure) {
            this.this$0.E0(new gt0(8));
            UseCaseOperationError useCaseOperationError = (UseCaseOperationError) ((ChaloUseCaseResult.Failure) chaloUseCaseResult).f10418a;
            String str9 = ((PremiumBusBulkBookingConfirmationDataState) this.this$0.f.getValue()).i;
            String str10 = str9 == null ? "" : str9;
            String str11 = ((PremiumBusBulkBookingConfirmationDataState) this.this$0.f.getValue()).j;
            String str12 = str11 == null ? "" : str11;
            PremiumBusBulkBookingConfirmationComponent premiumBusBulkBookingConfirmationComponent3 = this.this$0;
            this.L$0 = null;
            this.L$1 = null;
            int i5 = i2;
            this.label = i5;
            ChaloNavigationManager chaloNavigationManager = premiumBusBulkBookingConfirmationComponent3.k;
            StateFlow stateFlow = premiumBusBulkBookingConfirmationComponent3.f;
            premiumBusBulkBookingConfirmationComponent3.E0(new gt0(i5));
            vo1.x("error.msg: ", useCaseOperationError.c, "message");
            AnalyticsContract analyticsContract = premiumBusBulkBookingConfirmationComponent3.p;
            Source source = Source.PREMIUM_BUS_PRE_BOOKING_RIDES_CONFIRMATION_SCREEN;
            LinkedHashMap linkedHashMapM0 = premiumBusBulkBookingConfirmationComponent3.M0();
            String str13 = useCaseOperationError.c;
            linkedHashMapM0.put("errorCode", str13 != null ? str13 : "");
            AnalyticsContractImplKt.b(analyticsContract, "bulk booking confirmation failed", source, linkedHashMapM0, false, 24);
            PassInfo passInfo2 = ((PremiumBusBulkBookingConfirmationDataState) stateFlow.getValue()).g;
            if (passInfo2 != null) {
                int i6 = useCaseOperationError.b;
                if (i6 == BulkPreBookRequestFailedReason.OVERLAPPING_BOOKING_ERROR.getErrorCode()) {
                    BulkBookingAcknowledgementData.OverlappingBookingFailure overlappingBookingFailure = new BulkBookingAcknowledgementData.OverlappingBookingFailure(useCaseOperationError.c, ((PremiumBusBulkBookingConfirmationDataState) stateFlow.getValue()).b, passInfo2.j, passInfo2.b, passInfo2.k);
                    Json json = ChaloJson.b;
                    json.getClass();
                    chaloNavigationManager.b(new ChaloNavigationRequest.Navigate(new BookingSuccessArgs.BulkBooking(source, json.a(BulkBookingAcknowledgementData.INSTANCE.serializer(), overlappingBookingFailure)), null, null, i));
                } else if (i6 == BulkPreBookRequestFailedReason.GENDER_MISMATCH_ERROR.getErrorCode()) {
                    objN0 = premiumBusBulkBookingConfirmationComponent3.N0(this);
                    if (objN0 != CoroutineSingletons.COROUTINE_SUSPENDED) {
                    }
                } else {
                    BulkBookingAcknowledgementData.BookingFailed bookingFailed = new BulkBookingAcknowledgementData.BookingFailed(((PremiumBusBulkBookingConfirmationDataState) stateFlow.getValue()).b, passInfo2.j, passInfo2.b, passInfo2.k, str12, str10, list, list2, ((PremiumBusBulkBookingConfirmationDataState) stateFlow.getValue()).o);
                    Json json2 = ChaloJson.b;
                    json2.getClass();
                    chaloNavigationManager.b(new ChaloNavigationRequest.Navigate(new BookingSuccessArgs.BulkBooking(source, json2.a(BulkBookingAcknowledgementData.INSTANCE.serializer(), bookingFailed)), null, null, 6));
                }
                objN0 = unit;
            } else {
                objN0 = unit;
            }
            if (objN0 == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (!(chaloUseCaseResult instanceof ChaloUseCaseResult.Success)) {
                throw new NoWhenBranchMatchedException();
            }
            this.this$0.E0(new gt0(9));
            PassInfo passInfo3 = ((PremiumBusBulkBookingConfirmationDataState) this.this$0.f.getValue()).g;
            if (passInfo3 != null) {
                PremiumBusBulkBookingConfirmationComponent premiumBusBulkBookingConfirmationComponent4 = this.this$0;
                AnalyticsContract analyticsContract2 = premiumBusBulkBookingConfirmationComponent4.p;
                Source source2 = Source.PREMIUM_BUS_PRE_BOOKING_RIDES_CONFIRMATION_SCREEN;
                AnalyticsContractImplKt.b(analyticsContract2, "bulk booking confirmation successful", source2, premiumBusBulkBookingConfirmationComponent4.M0(), false, 24);
                BulkBookingAcknowledgementData.BookingSuccess bookingSuccess = new BulkBookingAcknowledgementData.BookingSuccess(passInfo3.k, passInfo3.j, ((PremiumBusBulkBookingConfirmationDataState) this.this$0.f.getValue()).b, passInfo3.b);
                Json json3 = ChaloJson.b;
                json3.getClass();
                this.this$0.k.b(new ChaloNavigationRequest.Navigate(new BookingSuccessArgs.BulkBooking(source2, json3.a(BulkBookingAcknowledgementData.INSTANCE.serializer(), bookingSuccess)), null, null, 6));
                return unit;
            }
        }
        return unit;
    }
}
