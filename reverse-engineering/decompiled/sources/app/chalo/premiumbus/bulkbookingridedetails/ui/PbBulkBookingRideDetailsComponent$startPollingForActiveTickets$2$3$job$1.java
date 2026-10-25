package app.chalo.premiumbus.bulkbookingridedetails.ui;

import app.chalo.constants.Source;
import app.chalo.premiumbus.ActivePremiumBusTicketsHelper;
import app.chalo.premiumbus.prebookedtickets.ui.newactivation.ticketinfohandler.PremiumBusBookingTripTimeInfoState;
import app.chalo.premiumbus.prebookedtickets.ui.newactivation.ticketinfohandler.PremiumBusBookingVehicleInfoState;
import app.chalo.premiumbus.prebookedtickets.ui.newactivation.ticketinfohandler.PremiumReserveTicketPostBookingActionHandler;
import app.chalo.premiumbus.prebookedtickets.ui.newactivation.ticketinfohandler.PremiumReserveTicketPostBookingActionState;
import java.util.ArrayList;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.sync.Mutex;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "app.chalo.premiumbus.bulkbookingridedetails.ui.PbBulkBookingRideDetailsComponent$startPollingForActiveTickets$2$3$job$1", f = "PbBulkBookingRideDetailsComponent.kt", l = {965}, m = "invokeSuspend", v = 1)
final class PbBulkBookingRideDetailsComponent$startPollingForActiveTickets$2$3$job$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ PremiumBusBulkBookingUpcomingRidesCardData $activeBooking;
    final /* synthetic */ ActivePremiumBusTicketsHelper $activePremiumBusTicketsHelperInstance;
    int label;
    final /* synthetic */ PbBulkBookingRideDetailsComponent this$0;

    /* JADX INFO: renamed from: app.chalo.premiumbus.bulkbookingridedetails.ui.PbBulkBookingRideDetailsComponent$startPollingForActiveTickets$2$3$job$1$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    final class AnonymousClass1<T> implements FlowCollector {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ PbBulkBookingRideDetailsComponent f6910a;
        public final /* synthetic */ ActivePremiumBusTicketsHelper b;

        public AnonymousClass1(PbBulkBookingRideDetailsComponent pbBulkBookingRideDetailsComponent, ActivePremiumBusTicketsHelper activePremiumBusTicketsHelper) {
            this.f6910a = pbBulkBookingRideDetailsComponent;
            this.b = activePremiumBusTicketsHelper;
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        /* JADX WARN: Type inference failed for: r9v4, types: [java.lang.Object, kotlin.Lazy] */
        @Override // kotlinx.coroutines.flow.FlowCollector
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object emit(PremiumReserveTicketPostBookingActionState premiumReserveTicketPostBookingActionState, Continuation continuation) {
            PbBulkBookingRideDetailsComponent$startPollingForActiveTickets$2$3$job$1$1$emit$1 pbBulkBookingRideDetailsComponent$startPollingForActiveTickets$2$3$job$1$1$emit$1;
            Mutex mutex;
            PremiumReserveTicketPostBookingActionState premiumReserveTicketPostBookingActionState2;
            PbBulkBookingRideDetailsComponent pbBulkBookingRideDetailsComponent;
            ActivePremiumBusTicketsHelper activePremiumBusTicketsHelper;
            Object obj;
            if (continuation instanceof PbBulkBookingRideDetailsComponent$startPollingForActiveTickets$2$3$job$1$1$emit$1) {
                pbBulkBookingRideDetailsComponent$startPollingForActiveTickets$2$3$job$1$1$emit$1 = (PbBulkBookingRideDetailsComponent$startPollingForActiveTickets$2$3$job$1$1$emit$1) continuation;
                int i = pbBulkBookingRideDetailsComponent$startPollingForActiveTickets$2$3$job$1$1$emit$1.label;
                if ((i & Integer.MIN_VALUE) != 0) {
                    pbBulkBookingRideDetailsComponent$startPollingForActiveTickets$2$3$job$1$1$emit$1.label = i - Integer.MIN_VALUE;
                } else {
                    pbBulkBookingRideDetailsComponent$startPollingForActiveTickets$2$3$job$1$1$emit$1 = new PbBulkBookingRideDetailsComponent$startPollingForActiveTickets$2$3$job$1$1$emit$1(this, continuation);
                }
            } else {
                pbBulkBookingRideDetailsComponent$startPollingForActiveTickets$2$3$job$1$1$emit$1 = new PbBulkBookingRideDetailsComponent$startPollingForActiveTickets$2$3$job$1$1$emit$1(this, continuation);
            }
            Object obj2 = pbBulkBookingRideDetailsComponent$startPollingForActiveTickets$2$3$job$1$1$emit$1.result;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i2 = pbBulkBookingRideDetailsComponent$startPollingForActiveTickets$2$3$job$1$1$emit$1.label;
            if (i2 == 0) {
                ResultKt.b(obj2);
                PbBulkBookingRideDetailsComponent pbBulkBookingRideDetailsComponent2 = this.f6910a;
                mutex = pbBulkBookingRideDetailsComponent2.G;
                pbBulkBookingRideDetailsComponent$startPollingForActiveTickets$2$3$job$1$1$emit$1.L$0 = premiumReserveTicketPostBookingActionState;
                pbBulkBookingRideDetailsComponent$startPollingForActiveTickets$2$3$job$1$1$emit$1.L$1 = mutex;
                pbBulkBookingRideDetailsComponent$startPollingForActiveTickets$2$3$job$1$1$emit$1.L$2 = pbBulkBookingRideDetailsComponent2;
                ActivePremiumBusTicketsHelper activePremiumBusTicketsHelper2 = this.b;
                pbBulkBookingRideDetailsComponent$startPollingForActiveTickets$2$3$job$1$1$emit$1.L$3 = activePremiumBusTicketsHelper2;
                pbBulkBookingRideDetailsComponent$startPollingForActiveTickets$2$3$job$1$1$emit$1.label = 1;
                if (mutex.a(pbBulkBookingRideDetailsComponent$startPollingForActiveTickets$2$3$job$1$1$emit$1) == coroutineSingletons) {
                    return coroutineSingletons;
                }
                premiumReserveTicketPostBookingActionState2 = premiumReserveTicketPostBookingActionState;
                pbBulkBookingRideDetailsComponent = pbBulkBookingRideDetailsComponent2;
                activePremiumBusTicketsHelper = activePremiumBusTicketsHelper2;
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                activePremiumBusTicketsHelper = (ActivePremiumBusTicketsHelper) pbBulkBookingRideDetailsComponent$startPollingForActiveTickets$2$3$job$1$1$emit$1.L$3;
                pbBulkBookingRideDetailsComponent = (PbBulkBookingRideDetailsComponent) pbBulkBookingRideDetailsComponent$startPollingForActiveTickets$2$3$job$1$1$emit$1.L$2;
                mutex = (Mutex) pbBulkBookingRideDetailsComponent$startPollingForActiveTickets$2$3$job$1$1$emit$1.L$1;
                premiumReserveTicketPostBookingActionState2 = (PremiumReserveTicketPostBookingActionState) pbBulkBookingRideDetailsComponent$startPollingForActiveTickets$2$3$job$1$1$emit$1.L$0;
                ResultKt.b(obj2);
            }
            try {
                pbBulkBookingRideDetailsComponent.O.add((PremiumReserveTicketPostBookingActionHandler) activePremiumBusTicketsHelper.f6848a.getValue());
                ArrayList arrayListE0 = CollectionsKt.E0(pbBulkBookingRideDetailsComponent.R);
                int size = arrayListE0.size();
                int i3 = 0;
                do {
                    if (i3 >= size) {
                        obj = null;
                        break;
                    }
                    obj = arrayListE0.get(i3);
                    i3++;
                } while (!Intrinsics.d(((PremiumBusBulkBookingUpcomingRidesCardData) obj).c, premiumReserveTicketPostBookingActionState2.f7473a));
                PremiumBusBulkBookingUpcomingRidesCardData premiumBusBulkBookingUpcomingRidesCardData = (PremiumBusBulkBookingUpcomingRidesCardData) obj;
                PremiumBusBookingVehicleInfoState premiumBusBookingVehicleInfoState = premiumReserveTicketPostBookingActionState2.m;
                PremiumBusBookingTripTimeInfoState premiumBusBookingTripTimeInfoState = premiumReserveTicketPostBookingActionState2.k;
                if (premiumBusBulkBookingUpcomingRidesCardData != null && premiumBusBookingVehicleInfoState != null && premiumBusBookingTripTimeInfoState != null) {
                    int iIndexOf = arrayListE0.indexOf(premiumBusBulkBookingUpcomingRidesCardData);
                    PremiumBusBulkBookingUpcomingRidesCardData premiumBusBulkBookingUpcomingRidesCardDataA = PremiumBusBulkBookingUpcomingRidesCardData.a(premiumBusBulkBookingUpcomingRidesCardData, premiumBusBookingVehicleInfoState, premiumBusBookingTripTimeInfoState, premiumReserveTicketPostBookingActionState2.q);
                    if (!premiumBusBulkBookingUpcomingRidesCardDataA.equals(premiumBusBulkBookingUpcomingRidesCardData)) {
                        arrayListE0.set(iIndexOf, premiumBusBulkBookingUpcomingRidesCardDataA);
                    }
                }
                pbBulkBookingRideDetailsComponent.R = arrayListE0;
                return Unit.f17538a;
            } finally {
                mutex.e(null);
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PbBulkBookingRideDetailsComponent$startPollingForActiveTickets$2$3$job$1(ActivePremiumBusTicketsHelper activePremiumBusTicketsHelper, PremiumBusBulkBookingUpcomingRidesCardData premiumBusBulkBookingUpcomingRidesCardData, PbBulkBookingRideDetailsComponent pbBulkBookingRideDetailsComponent, Continuation continuation) {
        super(2, continuation);
        this.$activePremiumBusTicketsHelperInstance = activePremiumBusTicketsHelper;
        this.$activeBooking = premiumBusBulkBookingUpcomingRidesCardData;
        this.this$0 = pbBulkBookingRideDetailsComponent;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new PbBulkBookingRideDetailsComponent$startPollingForActiveTickets$2$3$job$1(this.$activePremiumBusTicketsHelperInstance, this.$activeBooking, this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((PbBulkBookingRideDetailsComponent$startPollingForActiveTickets$2$3$job$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f17538a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            ResultKt.b(obj);
            StateFlow stateFlowA = this.$activePremiumBusTicketsHelperInstance.a(this.$activeBooking.c, true, Source.PB_BULK_BOOKING_RIDE_DETAILS_SCREEN);
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, this.$activePremiumBusTicketsHelperInstance);
            this.label = 1;
            if (stateFlowA.collect(anonymousClass1, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(obj);
        }
        throw new KotlinNothingValueException();
    }
}
