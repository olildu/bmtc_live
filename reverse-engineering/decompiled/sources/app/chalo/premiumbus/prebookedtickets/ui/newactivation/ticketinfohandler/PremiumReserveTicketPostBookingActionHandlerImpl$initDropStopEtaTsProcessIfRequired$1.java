package app.chalo.premiumbus.prebookedtickets.ui.newactivation.ticketinfohandler;

import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.JobSupport;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.internal.ChannelFlowTransformLatest;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "app.chalo.premiumbus.prebookedtickets.ui.newactivation.ticketinfohandler.PremiumReserveTicketPostBookingActionHandlerImpl$initDropStopEtaTsProcessIfRequired$1", f = "PremiumReserveTicketPostBookingActionHandlerImpl.kt", l = {285}, m = "invokeSuspend", v = 1)
final class PremiumReserveTicketPostBookingActionHandlerImpl$initDropStopEtaTsProcessIfRequired$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ PremiumReserveTicketPostBookingActionHandlerImpl this$0;

    /* JADX INFO: renamed from: app.chalo.premiumbus.prebookedtickets.ui.newactivation.ticketinfohandler.PremiumReserveTicketPostBookingActionHandlerImpl$initDropStopEtaTsProcessIfRequired$1$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\u0010\u0000\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0004\u001a\u00020\u0005H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/flow/FlowCollector;", "", "it", ""}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "app.chalo.premiumbus.prebookedtickets.ui.newactivation.ticketinfohandler.PremiumReserveTicketPostBookingActionHandlerImpl$initDropStopEtaTsProcessIfRequired$1$1", f = "PremiumReserveTicketPostBookingActionHandlerImpl.kt", l = {283, 284}, m = "invokeSuspend", v = 1)
    final class AnonymousClass1 extends SuspendLambda implements Function3<FlowCollector<? super Boolean>, Long, Continuation<? super Unit>, Object> {
        /* synthetic */ long J$0;
        private /* synthetic */ Object L$0;
        int label;

        @Override // kotlin.jvm.functions.Function3
        public final Object invoke(Object obj, Object obj2, Object obj3) {
            long jLongValue = ((Number) obj2).longValue();
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(3, (Continuation) obj3);
            anonymousClass1.L$0 = (FlowCollector) obj;
            anonymousClass1.J$0 = jLongValue;
            return anonymousClass1.invokeSuspend(Unit.f17538a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:14:0x0056, code lost:
        
            if (r1.emit(r8, r7) == r0) goto L15;
         */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r8) {
            /*
                r7 = this;
                kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
                int r1 = r7.label
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L20
                if (r1 == r3) goto L18
                if (r1 != r2) goto L10
                kotlin.ResultKt.b(r8)
                goto L59
            L10:
                java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r8.<init>(r0)
                throw r8
            L18:
                java.lang.Object r1 = r7.L$0
                kotlinx.coroutines.flow.FlowCollector r1 = (kotlinx.coroutines.flow.FlowCollector) r1
                kotlin.ResultKt.b(r8)
                goto L4b
            L20:
                kotlin.ResultKt.b(r8)
                java.lang.Object r8 = r7.L$0
                r1 = r8
                kotlinx.coroutines.flow.FlowCollector r1 = (kotlinx.coroutines.flow.FlowCollector) r1
                long r4 = r7.J$0
                java.lang.StringBuilder r8 = new java.lang.StringBuilder
                java.lang.String r6 = "lastEtaFetchTsForDropStopStateFlow: "
                r8.<init>(r6)
                r8.append(r4)
                java.lang.String r8 = r8.toString()
                java.lang.String r4 = "message"
                kotlin.jvm.internal.Intrinsics.i(r8, r4)
                r7.L$0 = r1
                r7.label = r3
                r3 = 300000(0x493e0, double:1.482197E-318)
                java.lang.Object r8 = kotlinx.coroutines.DelayKt.b(r3, r7)
                if (r8 != r0) goto L4b
                goto L58
            L4b:
                java.lang.Boolean r8 = java.lang.Boolean.TRUE
                r3 = 0
                r7.L$0 = r3
                r7.label = r2
                java.lang.Object r8 = r1.emit(r8, r7)
                if (r8 != r0) goto L59
            L58:
                return r0
            L59:
                kotlin.Unit r8 = kotlin.Unit.f17538a
                return r8
            */
            throw new UnsupportedOperationException("Method not decompiled: app.chalo.premiumbus.prebookedtickets.ui.newactivation.ticketinfohandler.PremiumReserveTicketPostBookingActionHandlerImpl$initDropStopEtaTsProcessIfRequired$1.AnonymousClass1.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: renamed from: app.chalo.premiumbus.prebookedtickets.ui.newactivation.ticketinfohandler.PremiumReserveTicketPostBookingActionHandlerImpl$initDropStopEtaTsProcessIfRequired$1$2, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    final class AnonymousClass2<T> implements FlowCollector {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ PremiumReserveTicketPostBookingActionHandlerImpl f7459a;

        public AnonymousClass2(PremiumReserveTicketPostBookingActionHandlerImpl premiumReserveTicketPostBookingActionHandlerImpl) {
            this.f7459a = premiumReserveTicketPostBookingActionHandlerImpl;
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        public final Object a(boolean z, Continuation continuation) {
            PremiumReserveTicketPostBookingActionHandlerImpl$initDropStopEtaTsProcessIfRequired$1$2$emit$1 premiumReserveTicketPostBookingActionHandlerImpl$initDropStopEtaTsProcessIfRequired$1$2$emit$1;
            if (continuation instanceof PremiumReserveTicketPostBookingActionHandlerImpl$initDropStopEtaTsProcessIfRequired$1$2$emit$1) {
                premiumReserveTicketPostBookingActionHandlerImpl$initDropStopEtaTsProcessIfRequired$1$2$emit$1 = (PremiumReserveTicketPostBookingActionHandlerImpl$initDropStopEtaTsProcessIfRequired$1$2$emit$1) continuation;
                int i = premiumReserveTicketPostBookingActionHandlerImpl$initDropStopEtaTsProcessIfRequired$1$2$emit$1.label;
                if ((i & Integer.MIN_VALUE) != 0) {
                    premiumReserveTicketPostBookingActionHandlerImpl$initDropStopEtaTsProcessIfRequired$1$2$emit$1.label = i - Integer.MIN_VALUE;
                } else {
                    premiumReserveTicketPostBookingActionHandlerImpl$initDropStopEtaTsProcessIfRequired$1$2$emit$1 = new PremiumReserveTicketPostBookingActionHandlerImpl$initDropStopEtaTsProcessIfRequired$1$2$emit$1(this, continuation);
                }
            } else {
                premiumReserveTicketPostBookingActionHandlerImpl$initDropStopEtaTsProcessIfRequired$1$2$emit$1 = new PremiumReserveTicketPostBookingActionHandlerImpl$initDropStopEtaTsProcessIfRequired$1$2$emit$1(this, continuation);
            }
            Object obj = premiumReserveTicketPostBookingActionHandlerImpl$initDropStopEtaTsProcessIfRequired$1$2$emit$1.result;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i2 = premiumReserveTicketPostBookingActionHandlerImpl$initDropStopEtaTsProcessIfRequired$1$2$emit$1.label;
            PremiumReserveTicketPostBookingActionHandlerImpl premiumReserveTicketPostBookingActionHandlerImpl = this.f7459a;
            if (i2 == 0) {
                ResultKt.b(obj);
                premiumReserveTicketPostBookingActionHandlerImpl$initDropStopEtaTsProcessIfRequired$1$2$emit$1.label = 1;
                if (PremiumReserveTicketPostBookingActionHandlerImpl.D(premiumReserveTicketPostBookingActionHandlerImpl, premiumReserveTicketPostBookingActionHandlerImpl$initDropStopEtaTsProcessIfRequired$1$2$emit$1) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.b(obj);
            }
            Job job = premiumReserveTicketPostBookingActionHandlerImpl.b0;
            if (job != null) {
                ((JobSupport) job).cancel(null);
            }
            return Unit.f17538a;
        }

        @Override // kotlinx.coroutines.flow.FlowCollector
        public final /* bridge */ /* synthetic */ Object emit(Object obj, Continuation continuation) {
            return a(((Boolean) obj).booleanValue(), continuation);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PremiumReserveTicketPostBookingActionHandlerImpl$initDropStopEtaTsProcessIfRequired$1(PremiumReserveTicketPostBookingActionHandlerImpl premiumReserveTicketPostBookingActionHandlerImpl, Continuation continuation) {
        super(2, continuation);
        this.this$0 = premiumReserveTicketPostBookingActionHandlerImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new PremiumReserveTicketPostBookingActionHandlerImpl$initDropStopEtaTsProcessIfRequired$1(this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((PremiumReserveTicketPostBookingActionHandlerImpl$initDropStopEtaTsProcessIfRequired$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f17538a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            ResultKt.b(obj);
            ChannelFlowTransformLatest channelFlowTransformLatestH = FlowKt.H(this.this$0.a0, new AnonymousClass1(3, null));
            AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.this$0);
            this.label = 1;
            if (channelFlowTransformLatestH.collect(anonymousClass2, this) == coroutineSingletons) {
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
