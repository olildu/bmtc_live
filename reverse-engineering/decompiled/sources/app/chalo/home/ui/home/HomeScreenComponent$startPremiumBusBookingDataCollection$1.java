package app.chalo.home.ui.home;

import app.chalo.premiumbus.data.models.app.PremiumStopDetailsAppModel;
import app.chalo.premiumbus.data.models.entity.PremiumReserveTicketStatus;
import app.chalo.premiumbus.prebookedtickets.ui.newactivation.NewPremiumReserveTicketDetailsScreenType;
import app.chalo.premiumbus.prebookedtickets.ui.newactivation.ticketinfohandler.PremiumBusBookingCardData;
import app.chalo.premiumbus.prebookedtickets.ui.newactivation.ticketinfohandler.PremiumBusBookingTripTimeInfoState;
import app.chalo.premiumbus.prebookedtickets.ui.newactivation.ticketinfohandler.PremiumBusBookingVehicleInfoState;
import app.chalo.premiumbus.prebookedtickets.ui.newactivation.ticketinfohandler.PremiumBusPostBookingStopSchedule;
import app.chalo.premiumbus.prebookedtickets.ui.newactivation.ticketinfohandler.PremiumReserveTicketPostBookingActionState;
import app.chalo.premiumbus.prebookedtickets.ui.newactivation.ticketinfohandler.PremiumReserveTicketStopDirectionsInfoState;
import defpackage.e40;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.StateFlow;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "app.chalo.home.ui.home.HomeScreenComponent$startPremiumBusBookingDataCollection$1", f = "HomeScreenComponent.kt", l = {1103}, m = "invokeSuspend", v = 1)
final class HomeScreenComponent$startPremiumBusBookingDataCollection$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ HomeScreenComponent this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HomeScreenComponent$startPremiumBusBookingDataCollection$1(HomeScreenComponent homeScreenComponent, Continuation continuation) {
        super(2, continuation);
        this.this$0 = homeScreenComponent;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new HomeScreenComponent$startPremiumBusBookingDataCollection$1(this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((HomeScreenComponent$startPremiumBusBookingDataCollection$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f17538a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            ResultKt.b(obj);
            StateFlow state = this.this$0.q.getState();
            final HomeScreenComponent homeScreenComponent = this.this$0;
            FlowCollector flowCollector = new FlowCollector() { // from class: app.chalo.home.ui.home.HomeScreenComponent$startPremiumBusBookingDataCollection$1.1
                @Override // kotlinx.coroutines.flow.FlowCollector
                public final Object emit(Object obj2, Continuation continuation) {
                    PremiumBusBookingVehicleInfoState premiumBusBookingVehicleInfoState;
                    PremiumBusBookingTripTimeInfoState premiumBusBookingTripTimeInfoState;
                    PremiumReserveTicketPostBookingActionState premiumReserveTicketPostBookingActionState = (PremiumReserveTicketPostBookingActionState) obj2;
                    String str = premiumReserveTicketPostBookingActionState.f7473a;
                    PremiumReserveTicketStatus premiumReserveTicketStatus = premiumReserveTicketPostBookingActionState.c;
                    Unit unit = Unit.f17538a;
                    HomeScreenComponent homeScreenComponent2 = homeScreenComponent;
                    if (str == null || (premiumBusBookingVehicleInfoState = premiumReserveTicketPostBookingActionState.m) == null || (premiumBusBookingTripTimeInfoState = premiumReserveTicketPostBookingActionState.k) == null || premiumReserveTicketStatus == null) {
                        homeScreenComponent2.E0(new e40(premiumReserveTicketPostBookingActionState, 14));
                        return unit;
                    }
                    PremiumBusPostBookingStopSchedule premiumBusPostBookingStopSchedule = premiumReserveTicketPostBookingActionState.i;
                    PremiumBusPostBookingStopSchedule premiumBusPostBookingStopSchedule2 = premiumReserveTicketPostBookingActionState.j;
                    String strB = homeScreenComponent2.r.b();
                    PremiumStopDetailsAppModel premiumStopDetailsAppModel = premiumReserveTicketPostBookingActionState.d;
                    String str2 = premiumStopDetailsAppModel != null ? premiumStopDetailsAppModel.b : null;
                    PremiumStopDetailsAppModel premiumStopDetailsAppModel2 = premiumReserveTicketPostBookingActionState.e;
                    String str3 = premiumStopDetailsAppModel2 != null ? premiumStopDetailsAppModel2.b : null;
                    String str4 = premiumReserveTicketPostBookingActionState.f;
                    PremiumReserveTicketStopDirectionsInfoState premiumReserveTicketStopDirectionsInfoState = premiumReserveTicketPostBookingActionState.q;
                    NewPremiumReserveTicketDetailsScreenType.INSTANCE.getClass();
                    homeScreenComponent2.E0(new e40(new PremiumBusBookingCardData("", "", str, premiumBusBookingVehicleInfoState, premiumBusPostBookingStopSchedule, premiumBusPostBookingStopSchedule2, premiumBusBookingTripTimeInfoState, strB, premiumReserveTicketStatus, str2, str3, str4, premiumReserveTicketStopDirectionsInfoState, NewPremiumReserveTicketDetailsScreenType.Companion.a(premiumReserveTicketStatus), null, 65537), 15));
                    return unit;
                }
            };
            this.label = 1;
            if (state.collect(flowCollector, this) == coroutineSingletons) {
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
