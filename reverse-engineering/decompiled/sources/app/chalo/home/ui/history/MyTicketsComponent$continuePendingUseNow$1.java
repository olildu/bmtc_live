package app.chalo.home.ui.history;

import app.chalo.home.domain.ChaloUserBookingType;
import app.chalo.models.SuperPassSubTypes;
import app.chalo.superpass.data.models.entities.SuperPassRepurchaseProperties;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "app.chalo.home.ui.history.MyTicketsComponent$continuePendingUseNow$1", f = "MyTicketsComponent.kt", l = {2159}, m = "invokeSuspend", v = 1)
final class MyTicketsComponent$continuePendingUseNow$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ MyTicketsComponent.PendingUseNowContext $context;
    int label;
    final /* synthetic */ MyTicketsComponent this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MyTicketsComponent$continuePendingUseNow$1(MyTicketsComponent myTicketsComponent, MyTicketsComponent.PendingUseNowContext pendingUseNowContext, Continuation continuation) {
        super(2, continuation);
        this.this$0 = myTicketsComponent;
        this.$context = pendingUseNowContext;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new MyTicketsComponent$continuePendingUseNow$1(this.this$0, this.$context, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((MyTicketsComponent$continuePendingUseNow$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f17538a);
    }

    /* JADX WARN: Code duplicated, block: B:46:0x0099  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object objZ1;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        Unit unit = Unit.f17538a;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(obj);
            return unit;
        }
        ResultKt.b(obj);
        MyTicketsComponent myTicketsComponent = this.this$0;
        MyTicketsComponent.PendingUseNowContext pendingUseNowContext = this.$context;
        ChaloUserBookingType chaloUserBookingType = pendingUseNowContext.f3393a;
        boolean z = pendingUseNowContext.b;
        this.label = 1;
        myTicketsComponent.getClass();
        if ((chaloUserBookingType instanceof ChaloUserBookingType.TicketBooking.InstantTicketBooking) || (chaloUserBookingType instanceof ChaloUserBookingType.TicketBooking.MobileTicketBooking) || (chaloUserBookingType instanceof ChaloUserBookingType.TicketBooking.PremiumBusBooking) || (chaloUserBookingType instanceof ChaloUserBookingType.TicketBooking.QuickPayBooking) || (chaloUserBookingType instanceof ChaloUserBookingType.SuperPassBooking.PendingSuperPassBooking) || (chaloUserBookingType instanceof ChaloUserBookingType.SuperPassBooking.SuperPassApplicationBooking) || (chaloUserBookingType instanceof ChaloUserBookingType.TicketBooking.OndcTicketBooking) || (chaloUserBookingType instanceof ChaloUserBookingType.TicketBooking.OndcMetroTicketBooking) || (chaloUserBookingType instanceof ChaloUserBookingType.TicketBooking.MultiModalGroupTicketBooking) || (chaloUserBookingType instanceof ChaloUserBookingType.TicketBooking.MetroTicketBooking)) {
            objZ1 = myTicketsComponent.z1(chaloUserBookingType, this);
            if (objZ1 != coroutineSingletons) {
                objZ1 = unit;
            }
        } else if (chaloUserBookingType instanceof ChaloUserBookingType.SuperPassBooking.MagicSuperPassBooking) {
            SuperPassSubTypes superPassSubTypes = SuperPassSubTypes.MAGIC_SUPER_PASS;
            SuperPassRepurchaseProperties superPassRepurchaseProperties = ((ChaloUserBookingType.SuperPassBooking.MagicSuperPassBooking) chaloUserBookingType).d.d;
            objZ1 = myTicketsComponent.e1(z, (ChaloUserBookingType.SuperPassBooking) chaloUserBookingType, superPassSubTypes, superPassRepurchaseProperties.f9569a, superPassRepurchaseProperties.c, this);
            if (objZ1 != coroutineSingletons) {
                objZ1 = unit;
            }
        } else {
            if (chaloUserBookingType instanceof ChaloUserBookingType.SuperPassBooking.RideBasedSuperPassBooking) {
                SuperPassSubTypes superPassSubTypes2 = SuperPassSubTypes.RIDE_BASED_SUPER_PASS;
                SuperPassRepurchaseProperties superPassRepurchaseProperties2 = ((ChaloUserBookingType.SuperPassBooking.RideBasedSuperPassBooking) chaloUserBookingType).d.d;
                objZ1 = myTicketsComponent.e1(z, (ChaloUserBookingType.SuperPassBooking) chaloUserBookingType, superPassSubTypes2, superPassRepurchaseProperties2.f9569a, superPassRepurchaseProperties2.c, this);
                if (objZ1 != coroutineSingletons) {
                }
            } else if (!(chaloUserBookingType instanceof ChaloUserBookingType.TicketBooking.PassRideBooking) && !(chaloUserBookingType instanceof ChaloUserBookingType.CardBooking.CardRechargeBooking) && !(chaloUserBookingType instanceof ChaloUserBookingType.CardBooking.CardTransactionReceiptBooking)) {
                throw new NoWhenBranchMatchedException();
            }
            objZ1 = unit;
        }
        return objZ1 == coroutineSingletons ? coroutineSingletons : unit;
    }
}
