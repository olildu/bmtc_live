package app.chalo.premiumbus.prebookedtickets.ui.newactivation.ticketinfohandler;

import app.chalo.livetracking.provider.tracking.LiveStopEtaResult;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u0003H\n¨\u0006\u0004"}, d2 = {"<anonymous>", "", "R", "Lkotlinx/coroutines/flow/FlowCollector;", "kotlinx/coroutines/flow/FlowKt__EmittersKt$transform$1"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "app.chalo.premiumbus.prebookedtickets.ui.newactivation.ticketinfohandler.PremiumReserveTicketPostBookingActionHandlerImpl$handleTripEndProcess$2$invokeSuspend$$inlined$transform$1", f = "PremiumReserveTicketPostBookingActionHandlerImpl.kt", l = {36}, m = "invokeSuspend", v = 1)
public final class PremiumReserveTicketPostBookingActionHandlerImpl$handleTripEndProcess$2$invokeSuspend$$inlined$transform$1 extends SuspendLambda implements Function2<FlowCollector<? super LiveStopEtaResult.Success>, Continuation<? super Unit>, Object> {
    final /* synthetic */ Flow $this_transform;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ PremiumReserveTicketPostBookingActionHandlerImpl this$0;

    /* JADX INFO: renamed from: app.chalo.premiumbus.prebookedtickets.ui.newactivation.ticketinfohandler.PremiumReserveTicketPostBookingActionHandlerImpl$handleTripEndProcess$2$invokeSuspend$$inlined$transform$1$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public final class AnonymousClass1<T> implements FlowCollector {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ FlowCollector f7458a;
        public final /* synthetic */ PremiumReserveTicketPostBookingActionHandlerImpl b;

        /* JADX INFO: renamed from: app.chalo.premiumbus.prebookedtickets.ui.newactivation.ticketinfohandler.PremiumReserveTicketPostBookingActionHandlerImpl$handleTripEndProcess$2$invokeSuspend$$inlined$transform$1$1$1, reason: invalid class name and collision with other inner class name */
        @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
        @DebugMetadata(c = "app.chalo.premiumbus.prebookedtickets.ui.newactivation.ticketinfohandler.PremiumReserveTicketPostBookingActionHandlerImpl$handleTripEndProcess$2$invokeSuspend$$inlined$transform$1$1", f = "PremiumReserveTicketPostBookingActionHandlerImpl.kt", l = {42, 51}, m = "emit", v = 1)
        public final class C01371 extends ContinuationImpl {
            Object L$0;
            Object L$1;
            int label;
            /* synthetic */ Object result;

            public C01371(Continuation continuation) {
                super(continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                this.result = obj;
                this.label |= Integer.MIN_VALUE;
                return AnonymousClass1.this.emit(null, this);
            }
        }

        public AnonymousClass1(FlowCollector flowCollector, PremiumReserveTicketPostBookingActionHandlerImpl premiumReserveTicketPostBookingActionHandlerImpl) {
            this.b = premiumReserveTicketPostBookingActionHandlerImpl;
            this.f7458a = flowCollector;
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        /* JADX WARN: Code restructure failed: missing block: B:36:0x00a2, code lost:
        
            if (r7.emit(r2, r0) == r1) goto L37;
         */
        @Override // kotlinx.coroutines.flow.FlowCollector
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object emit(java.lang.Object r9, kotlin.coroutines.Continuation r10) {
            /*
                r8 = this;
                boolean r0 = r10 instanceof app.chalo.premiumbus.prebookedtickets.ui.newactivation.ticketinfohandler.PremiumReserveTicketPostBookingActionHandlerImpl$handleTripEndProcess$2$invokeSuspend$$inlined$transform$1.AnonymousClass1.C01371
                if (r0 == 0) goto L13
                r0 = r10
                app.chalo.premiumbus.prebookedtickets.ui.newactivation.ticketinfohandler.PremiumReserveTicketPostBookingActionHandlerImpl$handleTripEndProcess$2$invokeSuspend$$inlined$transform$1$1$1 r0 = (app.chalo.premiumbus.prebookedtickets.ui.newactivation.ticketinfohandler.PremiumReserveTicketPostBookingActionHandlerImpl$handleTripEndProcess$2$invokeSuspend$$inlined$transform$1.AnonymousClass1.C01371) r0
                int r1 = r0.label
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.label = r1
                goto L18
            L13:
                app.chalo.premiumbus.prebookedtickets.ui.newactivation.ticketinfohandler.PremiumReserveTicketPostBookingActionHandlerImpl$handleTripEndProcess$2$invokeSuspend$$inlined$transform$1$1$1 r0 = new app.chalo.premiumbus.prebookedtickets.ui.newactivation.ticketinfohandler.PremiumReserveTicketPostBookingActionHandlerImpl$handleTripEndProcess$2$invokeSuspend$$inlined$transform$1$1$1
                r0.<init>(r10)
            L18:
                java.lang.Object r10 = r0.result
                kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
                int r2 = r0.label
                app.chalo.premiumbus.prebookedtickets.ui.newactivation.ticketinfohandler.PremiumReserveTicketPostBookingActionHandlerImpl r3 = r8.b
                r4 = 2
                r5 = 1
                r6 = 0
                if (r2 == 0) goto L42
                if (r2 == r5) goto L36
                if (r2 != r4) goto L2e
                kotlin.ResultKt.b(r10)
                goto La5
            L2e:
                java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
                java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
                r9.<init>(r10)
                throw r9
            L36:
                java.lang.Object r9 = r0.L$1
                kotlinx.coroutines.flow.FlowCollector r9 = (kotlinx.coroutines.flow.FlowCollector) r9
                java.lang.Object r2 = r0.L$0
                app.chalo.livetracking.provider.tracking.LiveStopEtaResult$Success r2 = (app.chalo.livetracking.provider.tracking.LiveStopEtaResult.Success) r2
                kotlin.ResultKt.b(r10)
                goto L76
            L42:
                kotlin.ResultKt.b(r10)
                r2 = r9
                app.chalo.livetracking.provider.tracking.LiveStopEtaResult$Success r2 = (app.chalo.livetracking.provider.tracking.LiveStopEtaResult.Success) r2
                java.lang.StringBuilder r9 = new java.lang.StringBuilder
                java.lang.String r10 = "stop data for trip end process "
                r9.<init>(r10)
                r9.append(r2)
                java.lang.String r9 = r9.toString()
                java.lang.String r10 = "message"
                kotlin.jvm.internal.Intrinsics.i(r9, r10)
                app.chalo.livetracking.provider.tracking.model.StopLiveEtaAppModel r9 = r2.f4339a
                app.chalo.livetracking.provider.tracking.model.StopLiveEtaAppModel$AllBusPassed r10 = app.chalo.livetracking.provider.tracking.model.StopLiveEtaAppModel.AllBusPassed.f4371a
                boolean r10 = kotlin.jvm.internal.Intrinsics.d(r9, r10)
                kotlinx.coroutines.flow.FlowCollector r7 = r8.f7458a
                if (r10 == 0) goto L81
                r0.L$0 = r2
                r0.L$1 = r7
                r0.label = r5
                java.lang.Object r9 = app.chalo.premiumbus.prebookedtickets.ui.newactivation.ticketinfohandler.PremiumReserveTicketPostBookingActionHandlerImpl.D(r3, r0)
                if (r9 != r1) goto L75
                goto La4
            L75:
                r9 = r7
            L76:
                kotlinx.coroutines.Job r10 = r3.e0
                if (r10 == 0) goto L7f
                kotlinx.coroutines.JobSupport r10 = (kotlinx.coroutines.JobSupport) r10
                r10.cancel(r6)
            L7f:
                r7 = r9
                goto L98
            L81:
                boolean r10 = r9 instanceof app.chalo.livetracking.provider.tracking.model.StopLiveEtaAppModel.EstimatedEta
                if (r10 != 0) goto L98
                boolean r10 = r9 instanceof app.chalo.livetracking.provider.tracking.model.StopLiveEtaAppModel.FixedEta
                if (r10 != 0) goto L98
                app.chalo.livetracking.provider.tracking.model.StopLiveEtaAppModel$NotAvailable r10 = app.chalo.livetracking.provider.tracking.model.StopLiveEtaAppModel.NotAvailable.f4374a
                boolean r9 = kotlin.jvm.internal.Intrinsics.d(r9, r10)
                if (r9 == 0) goto L92
                goto L98
            L92:
                kotlin.NoWhenBranchMatchedException r9 = new kotlin.NoWhenBranchMatchedException
                r9.<init>()
                throw r9
            L98:
                r0.L$0 = r6
                r0.L$1 = r6
                r0.label = r4
                java.lang.Object r9 = r7.emit(r2, r0)
                if (r9 != r1) goto La5
            La4:
                return r1
            La5:
                kotlin.Unit r9 = kotlin.Unit.f17538a
                return r9
            */
            throw new UnsupportedOperationException("Method not decompiled: app.chalo.premiumbus.prebookedtickets.ui.newactivation.ticketinfohandler.PremiumReserveTicketPostBookingActionHandlerImpl$handleTripEndProcess$2$invokeSuspend$$inlined$transform$1.AnonymousClass1.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PremiumReserveTicketPostBookingActionHandlerImpl$handleTripEndProcess$2$invokeSuspend$$inlined$transform$1(Flow flow, Continuation continuation, PremiumReserveTicketPostBookingActionHandlerImpl premiumReserveTicketPostBookingActionHandlerImpl) {
        super(2, continuation);
        this.$this_transform = flow;
        this.this$0 = premiumReserveTicketPostBookingActionHandlerImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        PremiumReserveTicketPostBookingActionHandlerImpl$handleTripEndProcess$2$invokeSuspend$$inlined$transform$1 premiumReserveTicketPostBookingActionHandlerImpl$handleTripEndProcess$2$invokeSuspend$$inlined$transform$1 = new PremiumReserveTicketPostBookingActionHandlerImpl$handleTripEndProcess$2$invokeSuspend$$inlined$transform$1(this.$this_transform, continuation, this.this$0);
        premiumReserveTicketPostBookingActionHandlerImpl$handleTripEndProcess$2$invokeSuspend$$inlined$transform$1.L$0 = obj;
        return premiumReserveTicketPostBookingActionHandlerImpl$handleTripEndProcess$2$invokeSuspend$$inlined$transform$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((PremiumReserveTicketPostBookingActionHandlerImpl$handleTripEndProcess$2$invokeSuspend$$inlined$transform$1) create((FlowCollector) obj, (Continuation) obj2)).invokeSuspend(Unit.f17538a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            ResultKt.b(obj);
            FlowCollector flowCollector = (FlowCollector) this.L$0;
            Flow flow = this.$this_transform;
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(flowCollector, this.this$0);
            this.label = 1;
            if (flow.collect(anonymousClass1, this) == coroutineSingletons) {
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
