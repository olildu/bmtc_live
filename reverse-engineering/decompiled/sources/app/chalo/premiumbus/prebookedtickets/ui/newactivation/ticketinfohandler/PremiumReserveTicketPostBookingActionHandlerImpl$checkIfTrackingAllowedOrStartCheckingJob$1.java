package app.chalo.premiumbus.prebookedtickets.ui.newactivation.ticketinfohandler;

import androidx.window.core.layout.WindowSizeClass;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "app.chalo.premiumbus.prebookedtickets.ui.newactivation.ticketinfohandler.PremiumReserveTicketPostBookingActionHandlerImpl$checkIfTrackingAllowedOrStartCheckingJob$1", f = "PremiumReserveTicketPostBookingActionHandlerImpl.kt", l = {1188, 1196, 1199, WindowSizeClass.WIDTH_DP_LARGE_LOWER_BOUND, 1205, 1206}, m = "invokeSuspend", v = 1)
final class PremiumReserveTicketPostBookingActionHandlerImpl$checkIfTrackingAllowedOrStartCheckingJob$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ PremiumReserveTicketPostBookingActionHandlerImpl this$0;

    /* JADX INFO: renamed from: app.chalo.premiumbus.prebookedtickets.ui.newactivation.ticketinfohandler.PremiumReserveTicketPostBookingActionHandlerImpl$checkIfTrackingAllowedOrStartCheckingJob$1$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "it", "Lapp/chalo/premiumbus/prebookedtickets/ui/newactivation/ticketinfohandler/PremiumReserveTicketPostBookingActionState;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "app.chalo.premiumbus.prebookedtickets.ui.newactivation.ticketinfohandler.PremiumReserveTicketPostBookingActionHandlerImpl$checkIfTrackingAllowedOrStartCheckingJob$1$1", f = "PremiumReserveTicketPostBookingActionHandlerImpl.kt", l = {}, m = "invokeSuspend", v = 1)
    final class AnonymousClass1 extends SuspendLambda implements Function2<PremiumReserveTicketPostBookingActionState, Continuation<? super Boolean>, Object> {
        /* synthetic */ Object L$0;
        int label;

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(2, continuation);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            return ((AnonymousClass1) create((PremiumReserveTicketPostBookingActionState) obj, (Continuation) obj2)).invokeSuspend(Unit.f17538a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(obj);
            return Boolean.valueOf(!(((PremiumReserveTicketPostBookingActionState) this.L$0).m instanceof PremiumBusBookingVehicleInfoState.NotFetched));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PremiumReserveTicketPostBookingActionHandlerImpl$checkIfTrackingAllowedOrStartCheckingJob$1(PremiumReserveTicketPostBookingActionHandlerImpl premiumReserveTicketPostBookingActionHandlerImpl, Continuation continuation) {
        super(2, continuation);
        this.this$0 = premiumReserveTicketPostBookingActionHandlerImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        PremiumReserveTicketPostBookingActionHandlerImpl$checkIfTrackingAllowedOrStartCheckingJob$1 premiumReserveTicketPostBookingActionHandlerImpl$checkIfTrackingAllowedOrStartCheckingJob$1 = new PremiumReserveTicketPostBookingActionHandlerImpl$checkIfTrackingAllowedOrStartCheckingJob$1(this.this$0, continuation);
        premiumReserveTicketPostBookingActionHandlerImpl$checkIfTrackingAllowedOrStartCheckingJob$1.L$0 = obj;
        return premiumReserveTicketPostBookingActionHandlerImpl$checkIfTrackingAllowedOrStartCheckingJob$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((PremiumReserveTicketPostBookingActionHandlerImpl$checkIfTrackingAllowedOrStartCheckingJob$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f17538a);
    }

    /* JADX WARN: Code duplicated, block: B:25:0x0083 A[PHI: r1
      0x0083: PHI (r1v15 kotlinx.coroutines.CoroutineScope) = 
      (r1v6 kotlinx.coroutines.CoroutineScope)
      (r1v10 kotlinx.coroutines.CoroutineScope)
      (r1v16 kotlinx.coroutines.CoroutineScope)
     binds: [B:23:0x0080, B:9:0x0029, B:44:0x00d6] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:27:0x0089  */
    /* JADX WARN: Code duplicated, block: B:30:0x0097 A[PHI: r1 r8
      0x0097: PHI (r1v13 kotlinx.coroutines.CoroutineScope) = (r1v12 kotlinx.coroutines.CoroutineScope), (r1v15 kotlinx.coroutines.CoroutineScope) binds: [B:8:0x0020, B:28:0x0094] A[DONT_GENERATE, DONT_INLINE]
      0x0097: PHI (r8v19 java.lang.Object) = (r8v0 java.lang.Object), (r8v28 java.lang.Object) binds: [B:8:0x0020, B:28:0x0094] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:32:0x009f  */
    /* JADX WARN: Code duplicated, block: B:40:0x00bd  */
    /* JADX WARN: Code duplicated, block: B:43:0x00cb A[PHI: r1
      0x00cb: PHI (r1v16 kotlinx.coroutines.CoroutineScope) = (r1v13 kotlinx.coroutines.CoroutineScope), (r1v18 kotlinx.coroutines.CoroutineScope) binds: [B:41:0x00c8, B:6:0x0012] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:41:0x00c8 -> B:43:0x00cb). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object r8) {
        /*
            Method dump skipped, instruction units count: 252
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: app.chalo.premiumbus.prebookedtickets.ui.newactivation.ticketinfohandler.PremiumReserveTicketPostBookingActionHandlerImpl$checkIfTrackingAllowedOrStartCheckingJob$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
