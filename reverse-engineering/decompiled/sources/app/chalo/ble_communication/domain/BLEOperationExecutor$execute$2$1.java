package app.chalo.ble_communication.domain;

import app.chalo.ble_communication.BLEOperationStatus;
import app.chalo.ble_communication.BLETerminalOperationStatus;
import com.silencelaboratories.silentride.operations.ConnectPassengerDeviceOperation;
import com.silencelaboratories.silentride.operations.DisconnectDriverDeviceOperation;
import com.silencelaboratories.silentride.operations.DisconnectPassengerDeviceOperation;
import com.silencelaboratories.silentride.operations.SendDataDriverDeviceOperation;
import com.silencelaboratories.silentride.operations.SendDataPassengerDeviceOperation;
import com.silencelaboratories.silentride.operations.SilentRideOperation;
import com.silencelaboratories.silentride.operations.SilentRideOperationStatus;
import com.silencelaboratories.silentride.operations.StartActiveModeBroadcastDriverOperation;
import com.silencelaboratories.silentride.operations.StartActiveModeBroadcastPassengerOperation;
import com.silencelaboratories.silentride.operations.StartActiveModeScanDriverOperation;
import com.silencelaboratories.silentride.operations.StartActiveModeScanPassengerOperation;
import com.silencelaboratories.silentride.operations.StartPassiveModeSilentRideDriverOperation;
import com.silencelaboratories.silentride.operations.StartPassiveModeSilentRidePassengerOperation;
import com.silencelaboratories.silentride.operations.StopActiveModeBroadcastDriverOperation;
import com.silencelaboratories.silentride.operations.StopActiveModeBroadcastPassengerOperation;
import com.silencelaboratories.silentride.operations.StopActiveModeScanDriverOperation;
import com.silencelaboratories.silentride.operations.StopActiveModeScanPassengerOperation;
import com.silencelaboratories.silentride.operations.StopPassiveModeSilentRideDriverOperation;
import com.silencelaboratories.silentride.operations.StopPassiveModeSilentRidePassengerOperation;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "Lapp/chalo/ble_communication/BLETerminalOperationStatus;", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "app.chalo.ble_communication.domain.BLEOperationExecutor$execute$2$1", f = "BLEOperationExecutor.kt", l = {115}, m = "invokeSuspend", v = 1)
final class BLEOperationExecutor$execute$2$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super BLETerminalOperationStatus>, Object> {
    final /* synthetic */ long $currTime;
    final /* synthetic */ boolean $shouldWaitUntilConfirmedSuccessOrFailure;
    final /* synthetic */ SilentRideOperation $slOperation;
    int label;
    final /* synthetic */ BLEOperationExecutor this$0;

    /* JADX INFO: renamed from: app.chalo.ble_communication.domain.BLEOperationExecutor$execute$2$1$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "operationStatus", "Lcom/silencelaboratories/silentride/operations/SilentRideOperationStatus;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "app.chalo.ble_communication.domain.BLEOperationExecutor$execute$2$1$1", f = "BLEOperationExecutor.kt", l = {}, m = "invokeSuspend", v = 1)
    final class AnonymousClass1 extends SuspendLambda implements Function2<SilentRideOperationStatus, Continuation<? super Unit>, Object> {
        final /* synthetic */ long $currTime;
        final /* synthetic */ boolean $shouldWaitUntilConfirmedSuccessOrFailure;
        final /* synthetic */ SilentRideOperation $slOperation;
        /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ BLEOperationExecutor this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(long j, BLEOperationExecutor bLEOperationExecutor, SilentRideOperation silentRideOperation, Continuation continuation, boolean z) {
            super(2, continuation);
            this.this$0 = bLEOperationExecutor;
            this.$currTime = j;
            this.$slOperation = silentRideOperation;
            this.$shouldWaitUntilConfirmedSuccessOrFailure = z;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$currTime, this.this$0, this.$slOperation, continuation, this.$shouldWaitUntilConfirmedSuccessOrFailure);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            AnonymousClass1 anonymousClass1 = (AnonymousClass1) create((SilentRideOperationStatus) obj, (Continuation) obj2);
            Unit unit = Unit.f17538a;
            anonymousClass1.invokeSuspend(unit);
            return unit;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(obj);
            SilentRideOperationStatus silentRideOperationStatus = (SilentRideOperationStatus) this.L$0;
            this.this$0.c.e();
            BLEOperationExecutor bLEOperationExecutor = this.this$0;
            bLEOperationExecutor.b.c(this.$slOperation, silentRideOperationStatus, BLEOperationExecutor.a(bLEOperationExecutor, silentRideOperationStatus));
            String message = "BLEOperationExecution: opCode = " + this.$slOperation.getK() + " || slOperationStatus = " + silentRideOperationStatus + " || operationStatus message = " + silentRideOperationStatus.b;
            Intrinsics.i(message, "message");
            return Unit.f17538a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BLEOperationExecutor$execute$2$1(long j, BLEOperationExecutor bLEOperationExecutor, SilentRideOperation silentRideOperation, Continuation continuation, boolean z) {
        super(2, continuation);
        this.this$0 = bLEOperationExecutor;
        this.$slOperation = silentRideOperation;
        this.$shouldWaitUntilConfirmedSuccessOrFailure = z;
        this.$currTime = j;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new BLEOperationExecutor$execute$2$1(this.$currTime, this.this$0, this.$slOperation, continuation, this.$shouldWaitUntilConfirmedSuccessOrFailure);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((BLEOperationExecutor$execute$2$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f17538a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Flow flowE;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            ResultKt.b(obj);
            BLEOperationExecutor bLEOperationExecutor = this.this$0;
            SilentRideOperation silentRideOperation = this.$slOperation;
            bLEOperationExecutor.getClass();
            if (silentRideOperation instanceof StopPassiveModeSilentRideDriverOperation) {
                flowE = FlowKt.e(new BLEOperationExecutor$getOperationStatusFlow$1(silentRideOperation, null));
            } else if (silentRideOperation instanceof ConnectPassengerDeviceOperation) {
                flowE = FlowKt.e(new BLEOperationExecutor$getOperationStatusFlow$2(silentRideOperation, null));
            } else if (silentRideOperation instanceof DisconnectPassengerDeviceOperation) {
                flowE = FlowKt.e(new BLEOperationExecutor$getOperationStatusFlow$3(silentRideOperation, null));
            } else if (silentRideOperation instanceof SendDataPassengerDeviceOperation) {
                flowE = FlowKt.e(new BLEOperationExecutor$getOperationStatusFlow$4(silentRideOperation, null));
            } else if (silentRideOperation instanceof StartPassiveModeSilentRidePassengerOperation) {
                flowE = FlowKt.e(new BLEOperationExecutor$getOperationStatusFlow$5(silentRideOperation, null));
            } else if (silentRideOperation instanceof DisconnectDriverDeviceOperation) {
                flowE = FlowKt.e(new BLEOperationExecutor$getOperationStatusFlow$6(silentRideOperation, null));
            } else if (silentRideOperation instanceof SendDataDriverDeviceOperation) {
                flowE = FlowKt.e(new BLEOperationExecutor$getOperationStatusFlow$7(silentRideOperation, null));
            } else if (silentRideOperation instanceof StartActiveModeBroadcastDriverOperation) {
                flowE = FlowKt.e(new BLEOperationExecutor$getOperationStatusFlow$8(silentRideOperation, null));
            } else if (silentRideOperation instanceof StartActiveModeScanDriverOperation) {
                flowE = FlowKt.e(new BLEOperationExecutor$getOperationStatusFlow$9(silentRideOperation, null));
            } else if (silentRideOperation instanceof StartPassiveModeSilentRideDriverOperation) {
                flowE = FlowKt.e(new BLEOperationExecutor$getOperationStatusFlow$10(silentRideOperation, null));
            } else if (silentRideOperation instanceof StopActiveModeBroadcastDriverOperation) {
                flowE = FlowKt.e(new BLEOperationExecutor$getOperationStatusFlow$11(silentRideOperation, null));
            } else if (silentRideOperation instanceof StopActiveModeScanDriverOperation) {
                flowE = FlowKt.e(new BLEOperationExecutor$getOperationStatusFlow$12(silentRideOperation, null));
            } else if (silentRideOperation instanceof StartActiveModeBroadcastPassengerOperation) {
                flowE = FlowKt.e(new BLEOperationExecutor$getOperationStatusFlow$13(silentRideOperation, null));
            } else if (silentRideOperation instanceof StartActiveModeScanPassengerOperation) {
                flowE = FlowKt.e(new BLEOperationExecutor$getOperationStatusFlow$14(silentRideOperation, null));
            } else if (silentRideOperation instanceof StopActiveModeBroadcastPassengerOperation) {
                flowE = FlowKt.e(new BLEOperationExecutor$getOperationStatusFlow$15(silentRideOperation, null));
            } else if (silentRideOperation instanceof StopActiveModeScanPassengerOperation) {
                flowE = FlowKt.e(new BLEOperationExecutor$getOperationStatusFlow$16(silentRideOperation, null));
            } else {
                if (!(silentRideOperation instanceof StopPassiveModeSilentRidePassengerOperation)) {
                    throw new NoWhenBranchMatchedException();
                }
                flowE = FlowKt.e(new BLEOperationExecutor$getOperationStatusFlow$17(silentRideOperation, null));
            }
            FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1 flowKt__TransformKt$onEach$$inlined$unsafeTransform$1 = new FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1(flowE, new AnonymousClass1(this.$currTime, this.this$0, this.$slOperation, null, this.$shouldWaitUntilConfirmedSuccessOrFailure));
            final BLEOperationExecutor bLEOperationExecutor2 = this.this$0;
            final BLEOperationExecutor$execute$2$1$invokeSuspend$$inlined$filterNot$1 bLEOperationExecutor$execute$2$1$invokeSuspend$$inlined$filterNot$1 = new BLEOperationExecutor$execute$2$1$invokeSuspend$$inlined$filterNot$1(flowKt__TransformKt$onEach$$inlined$unsafeTransform$1, bLEOperationExecutor2);
            Flow flowZ = FlowKt.z(new Flow<BLEOperationStatus>() { // from class: app.chalo.ble_communication.domain.BLEOperationExecutor$execute$2$1$invokeSuspend$$inlined$map$1

                /* JADX INFO: renamed from: app.chalo.ble_communication.domain.BLEOperationExecutor$execute$2$1$invokeSuspend$$inlined$map$1$2, reason: invalid class name */
                /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
                @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
                public final class AnonymousClass2<T> implements FlowCollector {

                    /* JADX INFO: renamed from: a, reason: collision with root package name */
                    public final /* synthetic */ FlowCollector f1114a;
                    public final /* synthetic */ BLEOperationExecutor b;

                    /* JADX INFO: renamed from: app.chalo.ble_communication.domain.BLEOperationExecutor$execute$2$1$invokeSuspend$$inlined$map$1$2$1, reason: invalid class name */
                    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
                    @DebugMetadata(c = "app.chalo.ble_communication.domain.BLEOperationExecutor$execute$2$1$invokeSuspend$$inlined$map$1$2", f = "BLEOperationExecutor.kt", l = {50}, m = "emit", v = 1)
                    public final class AnonymousClass1 extends ContinuationImpl {
                        Object L$0;
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

                    public AnonymousClass2(FlowCollector flowCollector, BLEOperationExecutor bLEOperationExecutor) {
                        this.f1114a = flowCollector;
                        this.b = bLEOperationExecutor;
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
                            BLEOperationStatus bLEOperationStatusA = BLEOperationExecutor.a(this.b, (SilentRideOperationStatus) obj);
                            anonymousClass1.label = 1;
                            if (this.f1114a.emit(bLEOperationStatusA, anonymousClass1) == coroutineSingletons) {
                                return coroutineSingletons;
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
                    Object objCollect = bLEOperationExecutor$execute$2$1$invokeSuspend$$inlined$filterNot$1.collect(new AnonymousClass2(flowCollector, bLEOperationExecutor2), continuation);
                    return objCollect == CoroutineSingletons.COROUTINE_SUSPENDED ? objCollect : Unit.f17538a;
                }
            }, bLEOperationExecutor2.f1110a.b());
            boolean z = this.$shouldWaitUntilConfirmedSuccessOrFailure;
            this.label = 1;
            obj = BLEOperationExecutor.b(bLEOperationExecutor, flowZ, z, this);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(obj);
        }
        SilentRideOperation silentRideOperation2 = this.$slOperation;
        String message = "BLEOperationCompleted  || operation = " + silentRideOperation2 + " || silentRideOperationCode = " + silentRideOperation2.getK() + " || terminalStatus = " + ((BLETerminalOperationStatus) obj);
        Intrinsics.i(message, "message");
        return obj;
    }
}
