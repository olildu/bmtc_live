package app.chalo.home.ui.history;

import app.chalo.premiumbus.data.models.app.PremiumStopDetailsAppModel;
import app.chalo.premiumbus.data.models.entity.PremiumReserveTicketStatus;
import app.chalo.premiumbus.prebookedtickets.ui.newactivation.NewPremiumReserveTicketDetailsScreenType;
import app.chalo.premiumbus.prebookedtickets.ui.newactivation.ticketinfohandler.PremiumBusBookingCardData;
import app.chalo.premiumbus.prebookedtickets.ui.newactivation.ticketinfohandler.PremiumBusBookingTripTimeInfoState;
import app.chalo.premiumbus.prebookedtickets.ui.newactivation.ticketinfohandler.PremiumBusBookingVehicleInfoState;
import app.chalo.premiumbus.prebookedtickets.ui.newactivation.ticketinfohandler.PremiumBusPostBookingStopSchedule;
import app.chalo.premiumbus.prebookedtickets.ui.newactivation.ticketinfohandler.PremiumReserveTicketPostBookingActionState;
import app.chalo.premiumbus.prebookedtickets.ui.newactivation.ticketinfohandler.PremiumReserveTicketStopDirectionsInfoState;
import defpackage.q60;
import java.util.LinkedHashMap;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.StateFlow;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "app.chalo.home.ui.history.MyTicketsComponent$startPremiumBusBookingDataCollection$1", f = "MyTicketsComponent.kt", l = {2865}, m = "invokeSuspend", v = 1)
final class MyTicketsComponent$startPremiumBusBookingDataCollection$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ String $bookingId;
    final /* synthetic */ String $productSubType;
    final /* synthetic */ String $productType;
    final /* synthetic */ StateFlow<PremiumReserveTicketPostBookingActionState> $stateFlow;
    int label;
    final /* synthetic */ MyTicketsComponent this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MyTicketsComponent$startPremiumBusBookingDataCollection$1(StateFlow stateFlow, String str, MyTicketsComponent myTicketsComponent, String str2, String str3, Continuation continuation) {
        super(2, continuation);
        this.$stateFlow = stateFlow;
        this.$bookingId = str;
        this.this$0 = myTicketsComponent;
        this.$productType = str2;
        this.$productSubType = str3;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new MyTicketsComponent$startPremiumBusBookingDataCollection$1(this.$stateFlow, this.$bookingId, this.this$0, this.$productType, this.$productSubType, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((MyTicketsComponent$startPremiumBusBookingDataCollection$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f17538a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            ResultKt.b(obj);
            StateFlow<PremiumReserveTicketPostBookingActionState> stateFlow = this.$stateFlow;
            final String str = this.$bookingId;
            final MyTicketsComponent myTicketsComponent = this.this$0;
            final String str2 = this.$productType;
            final String str3 = this.$productSubType;
            FlowCollector flowCollector = new FlowCollector() { // from class: app.chalo.home.ui.history.MyTicketsComponent$startPremiumBusBookingDataCollection$1.1
                @Override // kotlinx.coroutines.flow.FlowCollector
                public final Object emit(Object obj2, Continuation continuation) {
                    PremiumReserveTicketPostBookingActionState premiumReserveTicketPostBookingActionState = (PremiumReserveTicketPostBookingActionState) obj2;
                    boolean zD = Intrinsics.d(premiumReserveTicketPostBookingActionState.f7473a, str);
                    Unit unit = Unit.f17538a;
                    if (zD) {
                        String str4 = premiumReserveTicketPostBookingActionState.f7473a;
                        PremiumBusBookingVehicleInfoState premiumBusBookingVehicleInfoState = premiumReserveTicketPostBookingActionState.m;
                        if (premiumBusBookingVehicleInfoState != null) {
                            PremiumBusPostBookingStopSchedule premiumBusPostBookingStopSchedule = premiumReserveTicketPostBookingActionState.i;
                            PremiumBusPostBookingStopSchedule premiumBusPostBookingStopSchedule2 = premiumReserveTicketPostBookingActionState.j;
                            PremiumBusBookingTripTimeInfoState premiumBusBookingTripTimeInfoState = premiumReserveTicketPostBookingActionState.k;
                            if (premiumBusBookingTripTimeInfoState != null) {
                                MyTicketsComponent myTicketsComponent2 = myTicketsComponent;
                                String strB = myTicketsComponent2.o.b();
                                PremiumReserveTicketStatus premiumReserveTicketStatus = premiumReserveTicketPostBookingActionState.c;
                                if (premiumReserveTicketStatus != null) {
                                    PremiumStopDetailsAppModel premiumStopDetailsAppModel = premiumReserveTicketPostBookingActionState.d;
                                    String str5 = premiumStopDetailsAppModel != null ? premiumStopDetailsAppModel.b : null;
                                    PremiumStopDetailsAppModel premiumStopDetailsAppModel2 = premiumReserveTicketPostBookingActionState.e;
                                    String str6 = premiumStopDetailsAppModel2 != null ? premiumStopDetailsAppModel2.b : null;
                                    String str7 = premiumReserveTicketPostBookingActionState.f;
                                    PremiumReserveTicketStopDirectionsInfoState premiumReserveTicketStopDirectionsInfoState = premiumReserveTicketPostBookingActionState.q;
                                    NewPremiumReserveTicketDetailsScreenType.INSTANCE.getClass();
                                    PremiumBusBookingCardData premiumBusBookingCardData = new PremiumBusBookingCardData(str2, str3, str4, premiumBusBookingVehicleInfoState, premiumBusPostBookingStopSchedule, premiumBusPostBookingStopSchedule2, premiumBusBookingTripTimeInfoState, strB, premiumReserveTicketStatus, str5, str6, str7, premiumReserveTicketStopDirectionsInfoState, NewPremiumReserveTicketDetailsScreenType.Companion.a(premiumReserveTicketStatus), premiumReserveTicketPostBookingActionState.F, 1);
                                    LinkedHashMap linkedHashMapU = MapsKt.u(((MyTicketsDataState) myTicketsComponent2.f.getValue()).l);
                                    linkedHashMapU.put(premiumReserveTicketPostBookingActionState.f7473a, premiumBusBookingCardData);
                                    myTicketsComponent2.E0(new q60(linkedHashMapU, 2));
                                    return unit;
                                }
                            }
                        }
                    }
                    return unit;
                }
            };
            this.label = 1;
            if (stateFlow.collect(flowCollector, this) == coroutineSingletons) {
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
