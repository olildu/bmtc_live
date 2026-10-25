package app.chalo.premiumbus.prebookedtickets.ui.newactivation.ticketinfohandler;

import app.chalo.providers.stringprovider.StringEnum;
import defpackage.eu0;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.DelayKt;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "app.chalo.premiumbus.prebookedtickets.ui.newactivation.ticketinfohandler.PremiumReserveTicketPostBookingActionHandlerImpl$startGpsLocationFetchForVehicle$1", f = "PremiumReserveTicketPostBookingActionHandlerImpl.kt", l = {1813, 1816}, m = "invokeSuspend", v = 1)
final class PremiumReserveTicketPostBookingActionHandlerImpl$startGpsLocationFetchForVehicle$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    private /* synthetic */ Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ PremiumReserveTicketPostBookingActionHandlerImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PremiumReserveTicketPostBookingActionHandlerImpl$startGpsLocationFetchForVehicle$1(PremiumReserveTicketPostBookingActionHandlerImpl premiumReserveTicketPostBookingActionHandlerImpl, Continuation continuation) {
        super(2, continuation);
        this.this$0 = premiumReserveTicketPostBookingActionHandlerImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        PremiumReserveTicketPostBookingActionHandlerImpl$startGpsLocationFetchForVehicle$1 premiumReserveTicketPostBookingActionHandlerImpl$startGpsLocationFetchForVehicle$1 = new PremiumReserveTicketPostBookingActionHandlerImpl$startGpsLocationFetchForVehicle$1(this.this$0, continuation);
        premiumReserveTicketPostBookingActionHandlerImpl$startGpsLocationFetchForVehicle$1.L$0 = obj;
        return premiumReserveTicketPostBookingActionHandlerImpl$startGpsLocationFetchForVehicle$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((PremiumReserveTicketPostBookingActionHandlerImpl$startGpsLocationFetchForVehicle$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f17538a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineScope coroutineScope;
        String str;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            ResultKt.b(obj);
            CoroutineScope coroutineScope2 = (CoroutineScope) this.L$0;
            this.L$0 = coroutineScope2;
            this.label = 1;
            Object objB = this.this$0.c.b(StringEnum.PREMIUM_BUS_ON_GPS_TRACKING_NOT_AVAILABLE_INFO_MSG, new Object[0], this);
            if (objB != coroutineSingletons) {
                coroutineScope = coroutineScope2;
                obj = objB;
            }
            return coroutineSingletons;
        }
        if (i == 1) {
            coroutineScope = (CoroutineScope) this.L$0;
            ResultKt.b(obj);
        } else {
            if (i != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            str = (String) this.L$1;
            coroutineScope = (CoroutineScope) this.L$0;
            ResultKt.b(obj);
        }
        CoroutineScopeKt.d(coroutineScope);
        this.this$0.f0(new eu0(str, 8));
        return Unit.f17538a;
        String str2 = (String) obj;
        this.L$0 = coroutineScope;
        this.L$1 = str2;
        this.label = 2;
        if (DelayKt.b(300000L, this) != coroutineSingletons) {
            str = str2;
            CoroutineScopeKt.d(coroutineScope);
            this.this$0.f0(new eu0(str, 8));
            return Unit.f17538a;
        }
        return coroutineSingletons;
    }
}
