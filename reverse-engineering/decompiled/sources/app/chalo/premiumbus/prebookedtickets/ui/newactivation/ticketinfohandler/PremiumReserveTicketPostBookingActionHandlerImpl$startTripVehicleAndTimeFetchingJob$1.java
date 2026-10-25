package app.chalo.premiumbus.prebookedtickets.ui.newactivation.ticketinfohandler;

import app.chalo.constants.Source;
import app.chalo.premiumbus.PremiumBusTripLiveInfo;
import app.chalo.premiumbus.data.models.app.PremiumReserveTicketAppModel;
import app.chalo.premiumbus.data.models.app.PremiumReserveTicketBookingPropertiesAppModel;
import app.chalo.premiumbus.domains.PremiumTicketActivationStatus;
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
import kotlinx.coroutines.flow.internal.ChannelFlowTransformLatest;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "app.chalo.premiumbus.prebookedtickets.ui.newactivation.ticketinfohandler.PremiumReserveTicketPostBookingActionHandlerImpl$startTripVehicleAndTimeFetchingJob$1", f = "PremiumReserveTicketPostBookingActionHandlerImpl.kt", l = {922}, m = "invokeSuspend", v = 1)
final class PremiumReserveTicketPostBookingActionHandlerImpl$startTripVehicleAndTimeFetchingJob$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ PremiumTicketActivationStatus $pbTicketActivationStatus;
    final /* synthetic */ Source $source;
    final /* synthetic */ PremiumReserveTicketAppModel $ticket;
    int label;
    final /* synthetic */ PremiumReserveTicketPostBookingActionHandlerImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PremiumReserveTicketPostBookingActionHandlerImpl$startTripVehicleAndTimeFetchingJob$1(PremiumReserveTicketPostBookingActionHandlerImpl premiumReserveTicketPostBookingActionHandlerImpl, PremiumTicketActivationStatus premiumTicketActivationStatus, Source source, PremiumReserveTicketAppModel premiumReserveTicketAppModel, Continuation continuation) {
        super(2, continuation);
        this.this$0 = premiumReserveTicketPostBookingActionHandlerImpl;
        this.$pbTicketActivationStatus = premiumTicketActivationStatus;
        this.$source = source;
        this.$ticket = premiumReserveTicketAppModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new PremiumReserveTicketPostBookingActionHandlerImpl$startTripVehicleAndTimeFetchingJob$1(this.this$0, this.$pbTicketActivationStatus, this.$source, this.$ticket, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((PremiumReserveTicketPostBookingActionHandlerImpl$startTripVehicleAndTimeFetchingJob$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f17538a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            ResultKt.b(obj);
            ChannelFlowTransformLatest channelFlowTransformLatestA = this.this$0.d.a(this.$pbTicketActivationStatus, this.$source);
            final PremiumReserveTicketPostBookingActionHandlerImpl premiumReserveTicketPostBookingActionHandlerImpl = this.this$0;
            final PremiumReserveTicketAppModel premiumReserveTicketAppModel = this.$ticket;
            FlowCollector flowCollector = new FlowCollector() { // from class: app.chalo.premiumbus.prebookedtickets.ui.newactivation.ticketinfohandler.PremiumReserveTicketPostBookingActionHandlerImpl$startTripVehicleAndTimeFetchingJob$1.1
                @Override // kotlinx.coroutines.flow.FlowCollector
                public final Object emit(Object obj2, Continuation continuation) {
                    PremiumBusTripLiveInfo premiumBusTripLiveInfo = (PremiumBusTripLiveInfo) obj2;
                    PremiumReserveTicketBookingPropertiesAppModel premiumReserveTicketBookingPropertiesAppModel = premiumReserveTicketAppModel.f7113a;
                    Object objZ = PremiumReserveTicketPostBookingActionHandlerImpl.z(premiumReserveTicketPostBookingActionHandlerImpl, premiumReserveTicketBookingPropertiesAppModel.f7114a, premiumReserveTicketBookingPropertiesAppModel.h, premiumBusTripLiveInfo.f6866a, premiumBusTripLiveInfo.b, premiumBusTripLiveInfo.c, premiumBusTripLiveInfo.d, premiumBusTripLiveInfo.e, premiumBusTripLiveInfo.f, continuation);
                    return objZ == CoroutineSingletons.COROUTINE_SUSPENDED ? objZ : Unit.f17538a;
                }
            };
            this.label = 1;
            if (channelFlowTransformLatestA.collect(flowCollector, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(obj);
        }
        return Unit.f17538a;
    }
}
