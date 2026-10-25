package app.chalo.validationsdk.blevalidation.helper;

import app.chalo.ble_communication.model.BLETransferData;
import app.chalo.constants.Source;
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
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "app.chalo.validationsdk.blevalidation.helper.BleValidationWithTwoWayPilotHelper$startBleLoggingAndDataCollectionOperations$3", f = "BleValidationWithTwoWayPilotHelper.kt", l = {79}, m = "invokeSuspend", v = 1)
final class BleValidationWithTwoWayPilotHelper$startBleLoggingAndDataCollectionOperations$3 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ BleValidationWithTwoWayPilotHelper this$0;

    /* JADX INFO: renamed from: app.chalo.validationsdk.blevalidation.helper.BleValidationWithTwoWayPilotHelper$startBleLoggingAndDataCollectionOperations$3$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    final class AnonymousClass1<T> implements FlowCollector {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ BleValidationWithTwoWayPilotHelper f10553a;

        public AnonymousClass1(BleValidationWithTwoWayPilotHelper bleValidationWithTwoWayPilotHelper) {
            this.f10553a = bleValidationWithTwoWayPilotHelper;
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        @Override // kotlinx.coroutines.flow.FlowCollector
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object emit(BLETransferData.DuplexConnectionBLETransferData duplexConnectionBLETransferData, Continuation continuation) {
            BleValidationWithTwoWayPilotHelper$startBleLoggingAndDataCollectionOperations$3$1$emit$1 bleValidationWithTwoWayPilotHelper$startBleLoggingAndDataCollectionOperations$3$1$emit$1;
            if (continuation instanceof BleValidationWithTwoWayPilotHelper$startBleLoggingAndDataCollectionOperations$3$1$emit$1) {
                bleValidationWithTwoWayPilotHelper$startBleLoggingAndDataCollectionOperations$3$1$emit$1 = (BleValidationWithTwoWayPilotHelper$startBleLoggingAndDataCollectionOperations$3$1$emit$1) continuation;
                int i = bleValidationWithTwoWayPilotHelper$startBleLoggingAndDataCollectionOperations$3$1$emit$1.label;
                if ((i & Integer.MIN_VALUE) != 0) {
                    bleValidationWithTwoWayPilotHelper$startBleLoggingAndDataCollectionOperations$3$1$emit$1.label = i - Integer.MIN_VALUE;
                } else {
                    bleValidationWithTwoWayPilotHelper$startBleLoggingAndDataCollectionOperations$3$1$emit$1 = new BleValidationWithTwoWayPilotHelper$startBleLoggingAndDataCollectionOperations$3$1$emit$1(this, continuation);
                }
            } else {
                bleValidationWithTwoWayPilotHelper$startBleLoggingAndDataCollectionOperations$3$1$emit$1 = new BleValidationWithTwoWayPilotHelper$startBleLoggingAndDataCollectionOperations$3$1$emit$1(this, continuation);
            }
            Object obj = bleValidationWithTwoWayPilotHelper$startBleLoggingAndDataCollectionOperations$3$1$emit$1.result;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i2 = bleValidationWithTwoWayPilotHelper$startBleLoggingAndDataCollectionOperations$3$1$emit$1.label;
            Unit unit = Unit.f17538a;
            BleValidationWithTwoWayPilotHelper bleValidationWithTwoWayPilotHelper = this.f10553a;
            if (i2 == 0) {
                ResultKt.b(obj);
                if (duplexConnectionBLETransferData != null) {
                    MutableStateFlow mutableStateFlow = bleValidationWithTwoWayPilotHelper.j;
                    byte[] bArr = duplexConnectionBLETransferData.f1132a;
                    bleValidationWithTwoWayPilotHelper$startBleLoggingAndDataCollectionOperations$3$1$emit$1.L$0 = duplexConnectionBLETransferData;
                    bleValidationWithTwoWayPilotHelper$startBleLoggingAndDataCollectionOperations$3$1$emit$1.label = 1;
                    if (mutableStateFlow.emit(bArr, bleValidationWithTwoWayPilotHelper$startBleLoggingAndDataCollectionOperations$3$1$emit$1) != coroutineSingletons) {
                    }
                }
            }
            if (i2 != 1) {
                if (i2 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.b(obj);
                return unit;
            }
            duplexConnectionBLETransferData = (BLETransferData.DuplexConnectionBLETransferData) bleValidationWithTwoWayPilotHelper$startBleLoggingAndDataCollectionOperations$3$1$emit$1.L$0;
            ResultKt.b(obj);
            TwoWayBleCommPilotLogger twoWayBleCommPilotLogger = bleValidationWithTwoWayPilotHelper.b;
            Source source = bleValidationWithTwoWayPilotHelper.e;
            bleValidationWithTwoWayPilotHelper$startBleLoggingAndDataCollectionOperations$3$1$emit$1.L$0 = null;
            bleValidationWithTwoWayPilotHelper$startBleLoggingAndDataCollectionOperations$3$1$emit$1.label = 2;
            return twoWayBleCommPilotLogger.j(duplexConnectionBLETransferData, source, bleValidationWithTwoWayPilotHelper$startBleLoggingAndDataCollectionOperations$3$1$emit$1) == coroutineSingletons ? coroutineSingletons : unit;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BleValidationWithTwoWayPilotHelper$startBleLoggingAndDataCollectionOperations$3(BleValidationWithTwoWayPilotHelper bleValidationWithTwoWayPilotHelper, Continuation continuation) {
        super(2, continuation);
        this.this$0 = bleValidationWithTwoWayPilotHelper;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new BleValidationWithTwoWayPilotHelper$startBleLoggingAndDataCollectionOperations$3(this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((BleValidationWithTwoWayPilotHelper$startBleLoggingAndDataCollectionOperations$3) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f17538a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            ResultKt.b(obj);
            StateFlow stateFlowA = this.this$0.f10550a.a();
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0);
            this.label = 1;
            if (stateFlowA.collect(anonymousClass1, this) == coroutineSingletons) {
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
