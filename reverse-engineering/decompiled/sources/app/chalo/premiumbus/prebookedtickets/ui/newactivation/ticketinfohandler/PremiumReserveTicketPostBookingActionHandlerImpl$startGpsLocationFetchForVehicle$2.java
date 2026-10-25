package app.chalo.premiumbus.prebookedtickets.ui.newactivation.ticketinfohandler;

import app.chalo.livetracking.provider.tracking.VehicleGpsDataResult;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "app.chalo.premiumbus.prebookedtickets.ui.newactivation.ticketinfohandler.PremiumReserveTicketPostBookingActionHandlerImpl$startGpsLocationFetchForVehicle$2", f = "PremiumReserveTicketPostBookingActionHandlerImpl.kt", l = {1838}, m = "invokeSuspend", v = 1)
final class PremiumReserveTicketPostBookingActionHandlerImpl$startGpsLocationFetchForVehicle$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ PremiumReserveTicketPostBookingActionHandlerImpl this$0;

    /* JADX INFO: renamed from: app.chalo.premiumbus.prebookedtickets.ui.newactivation.ticketinfohandler.PremiumReserveTicketPostBookingActionHandlerImpl$startGpsLocationFetchForVehicle$2$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    final class AnonymousClass1<T> implements FlowCollector {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ PremiumReserveTicketPostBookingActionHandlerImpl f7469a;

        public AnonymousClass1(PremiumReserveTicketPostBookingActionHandlerImpl premiumReserveTicketPostBookingActionHandlerImpl) {
            this.f7469a = premiumReserveTicketPostBookingActionHandlerImpl;
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        /* JADX WARN: Code restructure failed: missing block: B:23:0x0076, code lost:
        
            if (r5.g0(r8, false, r0) == r1) goto L24;
         */
        @Override // kotlinx.coroutines.flow.FlowCollector
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object emit(app.chalo.livetracking.provider.tracking.VehicleGpsDataResult.Success r8, kotlin.coroutines.Continuation r9) {
            /*
                r7 = this;
                boolean r0 = r9 instanceof app.chalo.premiumbus.prebookedtickets.ui.newactivation.ticketinfohandler.PremiumReserveTicketPostBookingActionHandlerImpl$startGpsLocationFetchForVehicle$2$1$emit$1
                if (r0 == 0) goto L13
                r0 = r9
                app.chalo.premiumbus.prebookedtickets.ui.newactivation.ticketinfohandler.PremiumReserveTicketPostBookingActionHandlerImpl$startGpsLocationFetchForVehicle$2$1$emit$1 r0 = (app.chalo.premiumbus.prebookedtickets.ui.newactivation.ticketinfohandler.PremiumReserveTicketPostBookingActionHandlerImpl$startGpsLocationFetchForVehicle$2$1$emit$1) r0
                int r1 = r0.label
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.label = r1
                goto L18
            L13:
                app.chalo.premiumbus.prebookedtickets.ui.newactivation.ticketinfohandler.PremiumReserveTicketPostBookingActionHandlerImpl$startGpsLocationFetchForVehicle$2$1$emit$1 r0 = new app.chalo.premiumbus.prebookedtickets.ui.newactivation.ticketinfohandler.PremiumReserveTicketPostBookingActionHandlerImpl$startGpsLocationFetchForVehicle$2$1$emit$1
                r0.<init>(r7, r9)
            L18:
                java.lang.Object r9 = r0.result
                kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
                int r2 = r0.label
                r3 = 2
                r4 = 0
                app.chalo.premiumbus.prebookedtickets.ui.newactivation.ticketinfohandler.PremiumReserveTicketPostBookingActionHandlerImpl r5 = r7.f7469a
                r6 = 1
                if (r2 == 0) goto L3d
                if (r2 == r6) goto L35
                if (r2 != r3) goto L2d
                kotlin.ResultKt.b(r9)
                goto L79
            L2d:
                java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
                r8.<init>(r9)
                throw r8
            L35:
                java.lang.Object r8 = r0.L$0
                app.chalo.livetracking.provider.tracking.VehicleGpsDataResult$Success r8 = (app.chalo.livetracking.provider.tracking.VehicleGpsDataResult.Success) r8
                kotlin.ResultKt.b(r9)
                goto L56
            L3d:
                kotlin.ResultKt.b(r9)
                r5.d0 = r6
                kotlinx.coroutines.Job r9 = r5.c0
                if (r9 == 0) goto L4b
                kotlinx.coroutines.JobSupport r9 = (kotlinx.coroutines.JobSupport) r9
                r9.cancel(r4)
            L4b:
                r0.L$0 = r8
                r0.label = r6
                java.lang.Object r9 = app.chalo.premiumbus.prebookedtickets.ui.newactivation.ticketinfohandler.PremiumReserveTicketPostBookingActionHandlerImpl.F(r5, r0)
                if (r9 != r1) goto L56
                goto L78
            L56:
                app.chalo.livetracking.provider.tracking.model.LiveVehicleGpsData r9 = r8.f4364a
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                java.lang.String r6 = "gps location: "
                r2.<init>(r6)
                r2.append(r9)
                java.lang.String r9 = r2.toString()
                java.lang.String r2 = "message"
                kotlin.jvm.internal.Intrinsics.i(r9, r2)
                app.chalo.livetracking.provider.tracking.model.LiveVehicleGpsData r8 = r8.f4364a
                r0.L$0 = r4
                r0.label = r3
                r9 = 0
                java.lang.Object r8 = r5.g0(r8, r9, r0)
                if (r8 != r1) goto L79
            L78:
                return r1
            L79:
                kotlin.Unit r8 = kotlin.Unit.f17538a
                return r8
            */
            throw new UnsupportedOperationException("Method not decompiled: app.chalo.premiumbus.prebookedtickets.ui.newactivation.ticketinfohandler.PremiumReserveTicketPostBookingActionHandlerImpl$startGpsLocationFetchForVehicle$2.AnonymousClass1.emit(app.chalo.livetracking.provider.tracking.VehicleGpsDataResult$Success, kotlin.coroutines.Continuation):java.lang.Object");
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PremiumReserveTicketPostBookingActionHandlerImpl$startGpsLocationFetchForVehicle$2(PremiumReserveTicketPostBookingActionHandlerImpl premiumReserveTicketPostBookingActionHandlerImpl, Continuation continuation) {
        super(2, continuation);
        this.this$0 = premiumReserveTicketPostBookingActionHandlerImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new PremiumReserveTicketPostBookingActionHandlerImpl$startGpsLocationFetchForVehicle$2(this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((PremiumReserveTicketPostBookingActionHandlerImpl$startGpsLocationFetchForVehicle$2) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f17538a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        String str;
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
        PremiumBusBookingVehicleInfoState premiumBusBookingVehicleInfoState = ((PremiumReserveTicketPostBookingActionState) FlowKt.c(this.this$0.H).getValue()).m;
        PremiumBusBookingVehicleInfoState.VehicleAssigned vehicleAssigned = premiumBusBookingVehicleInfoState instanceof PremiumBusBookingVehicleInfoState.VehicleAssigned ? (PremiumBusBookingVehicleInfoState.VehicleAssigned) premiumBusBookingVehicleInfoState : null;
        if (vehicleAssigned != null && (str = vehicleAssigned.b) != null) {
            final Flow flowF = this.this$0.v.f(5000L, str);
            Flow<Object> flow = new Flow<Object>() { // from class: app.chalo.premiumbus.prebookedtickets.ui.newactivation.ticketinfohandler.PremiumReserveTicketPostBookingActionHandlerImpl$startGpsLocationFetchForVehicle$2$invokeSuspend$$inlined$filterIsInstance$1

                /* JADX INFO: renamed from: app.chalo.premiumbus.prebookedtickets.ui.newactivation.ticketinfohandler.PremiumReserveTicketPostBookingActionHandlerImpl$startGpsLocationFetchForVehicle$2$invokeSuspend$$inlined$filterIsInstance$1$2, reason: invalid class name */
                /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
                @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
                public final class AnonymousClass2<T> implements FlowCollector {

                    /* JADX INFO: renamed from: a, reason: collision with root package name */
                    public final /* synthetic */ FlowCollector f7471a;

                    /* JADX INFO: renamed from: app.chalo.premiumbus.prebookedtickets.ui.newactivation.ticketinfohandler.PremiumReserveTicketPostBookingActionHandlerImpl$startGpsLocationFetchForVehicle$2$invokeSuspend$$inlined$filterIsInstance$1$2$1, reason: invalid class name */
                    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
                    @DebugMetadata(c = "app.chalo.premiumbus.prebookedtickets.ui.newactivation.ticketinfohandler.PremiumReserveTicketPostBookingActionHandlerImpl$startGpsLocationFetchForVehicle$2$invokeSuspend$$inlined$filterIsInstance$1$2", f = "PremiumReserveTicketPostBookingActionHandlerImpl.kt", l = {50}, m = "emit", v = 1)
                    public final class AnonymousClass1 extends ContinuationImpl {
                        Object L$0;
                        Object L$1;
                        int label;
                        /* synthetic */ Object result;

                        public AnonymousClass1(Continuation continuation) {
                            super(continuation);
                        }

                        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                        public final Object invokeSuspend(Object obj) {
                            this.result = obj;
                            this.label |= Integer.MIN_VALUE;
                            return AnonymousClass2.this.emit(null, this);
                        }
                    }

                    public AnonymousClass2(FlowCollector flowCollector) {
                        this.f7471a = flowCollector;
                    }

                    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
                    @Override // kotlinx.coroutines.flow.FlowCollector
                    public final Object emit(Object obj, Continuation continuation) {
                        AnonymousClass1 anonymousClass1;
                        if (continuation instanceof AnonymousClass1) {
                            anonymousClass1 = (AnonymousClass1) continuation;
                            int i = anonymousClass1.label;
                            if ((i & Integer.MIN_VALUE) != 0) {
                                anonymousClass1.label = i - Integer.MIN_VALUE;
                            } else {
                                anonymousClass1 = new AnonymousClass1(continuation);
                            }
                        } else {
                            anonymousClass1 = new AnonymousClass1(continuation);
                        }
                        Object obj2 = anonymousClass1.result;
                        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                        int i2 = anonymousClass1.label;
                        if (i2 == 0) {
                            ResultKt.b(obj2);
                            if (obj instanceof VehicleGpsDataResult.Success) {
                                anonymousClass1.label = 1;
                                if (this.f7471a.emit(obj, anonymousClass1) == coroutineSingletons) {
                                    return coroutineSingletons;
                                }
                            }
                        } else {
                            if (i2 != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            ResultKt.b(obj2);
                        }
                        return Unit.f17538a;
                    }
                }

                @Override // kotlinx.coroutines.flow.Flow
                public final Object collect(FlowCollector flowCollector, Continuation continuation) {
                    Object objCollect = flowF.collect(new AnonymousClass2(flowCollector), continuation);
                    return objCollect == CoroutineSingletons.COROUTINE_SUSPENDED ? objCollect : Unit.f17538a;
                }
            };
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0);
            this.label = 1;
            if (flow.collect(anonymousClass1, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        }
        return unit;
    }
}
