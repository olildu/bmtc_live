package app.chalo.premiumbus.bulkbookingridedetails.ui;

import app.chalo.analytics.contract.AnalyticsContract;
import app.chalo.constants.Source;
import app.chalo.premiumbus.bulkbookingridedetails.data.model.app.PbTripBookingResponseAppModel;
import app.chalo.premiumbus.bulkbookingridedetails.domain.FetchFailedAndUnderProcessBookingsAndUpdateAllBookingsInDBUseCase;
import app.chalo.premiumbus.data.models.app.PremiumReserveTicketAppModel;
import app.chalo.premiumbus.data.models.entity.PremiumReserveTicketStatus;
import app.chalo.utils.ChaloUseCaseResult;
import defpackage.mq0;
import defpackage.vo1;
import defpackage.za0;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
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
@DebugMetadata(c = "app.chalo.premiumbus.bulkbookingridedetails.ui.PbBulkBookingRideDetailsComponent$fetchRemotePremiumReserveTicketsAndUpdateStateForFailedAndUnderProcessBookings$2", f = "PbBulkBookingRideDetailsComponent.kt", l = {1440, 1457}, m = "invokeSuspend", v = 1)
final class PbBulkBookingRideDetailsComponent$fetchRemotePremiumReserveTicketsAndUpdateStateForFailedAndUnderProcessBookings$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ String $passId;
    Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ PbBulkBookingRideDetailsComponent this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PbBulkBookingRideDetailsComponent$fetchRemotePremiumReserveTicketsAndUpdateStateForFailedAndUnderProcessBookings$2(PbBulkBookingRideDetailsComponent pbBulkBookingRideDetailsComponent, String str, Continuation continuation) {
        super(2, continuation);
        this.this$0 = pbBulkBookingRideDetailsComponent;
        this.$passId = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new PbBulkBookingRideDetailsComponent$fetchRemotePremiumReserveTicketsAndUpdateStateForFailedAndUnderProcessBookings$2(this.this$0, this.$passId, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((PbBulkBookingRideDetailsComponent$fetchRemotePremiumReserveTicketsAndUpdateStateForFailedAndUnderProcessBookings$2) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f17538a);
    }

    /* JADX WARN: Code duplicated, block: B:25:0x00bc  */
    /* JADX WARN: Code duplicated, block: B:31:0x00e2  */
    /* JADX WARN: Code duplicated, block: B:37:0x0108  */
    /* JADX WARN: Code duplicated, block: B:46:0x00cb A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:48:0x00b6 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:50:0x00f1 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:53:0x00dc A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:56:0x0117 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:58:0x0102 A[SYNTHETIC] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Exception {
        Object objA;
        ChaloUseCaseResult chaloUseCaseResult;
        Object objI0;
        List list;
        ArrayList arrayList;
        ArrayList arrayList2;
        ArrayList arrayList3;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            ResultKt.b(obj);
            FetchFailedAndUnderProcessBookingsAndUpdateAllBookingsInDBUseCase fetchFailedAndUnderProcessBookingsAndUpdateAllBookingsInDBUseCase = this.this$0.o;
            String str = this.$passId;
            this.label = 1;
            objA = fetchFailedAndUnderProcessBookingsAndUpdateAllBookingsInDBUseCase.a(str, this);
            if (objA != coroutineSingletons) {
            }
            return coroutineSingletons;
        }
        if (i == 1) {
            ResultKt.b(obj);
            objA = obj;
        } else {
            if (i != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            list = (List) this.L$1;
            chaloUseCaseResult = (ChaloUseCaseResult) this.L$0;
            ResultKt.b(obj);
            objI0 = obj;
        }
        PbBulkBookingRideDetailsComponent pbBulkBookingRideDetailsComponent = this.this$0;
        pbBulkBookingRideDetailsComponent.E0(new za0(22, pbBulkBookingRideDetailsComponent, (List) objI0, chaloUseCaseResult));
        List list2 = list;
        arrayList = new ArrayList();
        for (Object obj2 : list2) {
            if (((PremiumReserveTicketAppModel) obj2).f7113a.h == PremiumReserveTicketStatus.ACTIVE) {
                arrayList.add(obj2);
            }
        }
        int size = arrayList.size();
        arrayList2 = new ArrayList();
        for (Object obj3 : list2) {
            if (((PremiumReserveTicketAppModel) obj3).f7113a.h == PremiumReserveTicketStatus.BOOKING_UNDER_PROCESS) {
                arrayList2.add(obj3);
            }
        }
        int size2 = arrayList2.size();
        arrayList3 = new ArrayList();
        for (Object obj4 : list2) {
            if (((PremiumReserveTicketAppModel) obj4).f7113a.h == PremiumReserveTicketStatus.BOOKING_FAILED) {
                arrayList3.add(obj4);
            }
        }
        int size3 = arrayList3.size();
        PbBulkBookingRideDetailsComponent pbBulkBookingRideDetailsComponent2 = this.this$0;
        AnalyticsContract.DefaultImpls.a(pbBulkBookingRideDetailsComponent2.s, "pb bulk booking pass ticket success", Source.PB_BULK_BOOKING_RIDE_DETAILS_SCREEN.getSourceName(), MapsKt.i(new Pair("passId", this.$passId), new Pair("activeRides", Integer.valueOf(size)), new Pair("bookingUnderProcessRides", Integer.valueOf(size2)), new Pair("bookingCancelledRides", Integer.valueOf(size3)), new Pair("remainingTrips", String.valueOf(((PbTripBookingResponseAppModel) ((ChaloUseCaseResult.Success) chaloUseCaseResult).f10419a).f6890a.i)), new Pair("pastBookings", Integer.valueOf(((PbBulkBookingRideDetailsViewState) pbBulkBookingRideDetailsComponent2.f.getValue()).c.size()))), null, false, 24);
        this.this$0.Q = true;
        return Unit.f17538a;
        chaloUseCaseResult = (ChaloUseCaseResult) objA;
        if (!(chaloUseCaseResult instanceof ChaloUseCaseResult.Failure)) {
            if (!(chaloUseCaseResult instanceof ChaloUseCaseResult.Success)) {
                throw new NoWhenBranchMatchedException();
            }
            List listV0 = CollectionsKt.v0(new PbBulkBookingRideDetailsComponent$fetchRemotePremiumReserveTicketsAndUpdateStateForFailedAndUnderProcessBookings$2$invokeSuspend$$inlined$sortedBy$1(), CollectionsKt.D(((PbTripBookingResponseAppModel) ((ChaloUseCaseResult.Success) chaloUseCaseResult).f10419a).b));
            PbBulkBookingRideDetailsComponent pbBulkBookingRideDetailsComponent3 = this.this$0;
            this.L$0 = chaloUseCaseResult;
            this.L$1 = listV0;
            this.label = 2;
            objI0 = PbBulkBookingRideDetailsComponent.I0(pbBulkBookingRideDetailsComponent3, listV0, this);
            if (objI0 != coroutineSingletons) {
                list = listV0;
                PbBulkBookingRideDetailsComponent pbBulkBookingRideDetailsComponent4 = this.this$0;
                pbBulkBookingRideDetailsComponent4.E0(new za0(22, pbBulkBookingRideDetailsComponent4, (List) objI0, chaloUseCaseResult));
                List list3 = list;
                arrayList = new ArrayList();
                while (r8.hasNext()) {
                    if (((PremiumReserveTicketAppModel) obj2).f7113a.h == PremiumReserveTicketStatus.ACTIVE) {
                        arrayList.add(obj2);
                    }
                }
                int size4 = arrayList.size();
                arrayList2 = new ArrayList();
                while (r9.hasNext()) {
                    if (((PremiumReserveTicketAppModel) obj3).f7113a.h == PremiumReserveTicketStatus.BOOKING_UNDER_PROCESS) {
                        arrayList2.add(obj3);
                    }
                }
                int size5 = arrayList2.size();
                arrayList3 = new ArrayList();
                while (r1.hasNext()) {
                    if (((PremiumReserveTicketAppModel) obj4).f7113a.h == PremiumReserveTicketStatus.BOOKING_FAILED) {
                        arrayList3.add(obj4);
                    }
                }
                int size6 = arrayList3.size();
                PbBulkBookingRideDetailsComponent pbBulkBookingRideDetailsComponent5 = this.this$0;
                AnalyticsContract.DefaultImpls.a(pbBulkBookingRideDetailsComponent5.s, "pb bulk booking pass ticket success", Source.PB_BULK_BOOKING_RIDE_DETAILS_SCREEN.getSourceName(), MapsKt.i(new Pair("passId", this.$passId), new Pair("activeRides", Integer.valueOf(size4)), new Pair("bookingUnderProcessRides", Integer.valueOf(size5)), new Pair("bookingCancelledRides", Integer.valueOf(size6)), new Pair("remainingTrips", String.valueOf(((PbTripBookingResponseAppModel) ((ChaloUseCaseResult.Success) chaloUseCaseResult).f10419a).f6890a.i)), new Pair("pastBookings", Integer.valueOf(((PbBulkBookingRideDetailsViewState) pbBulkBookingRideDetailsComponent5.f.getValue()).c.size()))), null, false, 24);
                this.this$0.Q = true;
            }
            return coroutineSingletons;
        }
        AnalyticsContract.DefaultImpls.a(this.this$0.s, "pb bulk booking pass ticket failure", Source.PB_BULK_BOOKING_RIDE_DETAILS_SCREEN.getSourceName(), vo1.s("passId", this.$passId), null, false, 24);
        this.this$0.E0(new mq0(14));
        this.this$0.Q = false;
        return Unit.f17538a;
    }
}
