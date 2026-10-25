package app.chalo.ble_communication.feature.logging;

import app.chalo.crashlytics.CrashlyticsLog;
import app.chalo.crashlytics.CrashlyticsLogger;
import app.chalo.crashlytics.CrashlyticsLoggingException;
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
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "app.chalo.ble_communication.feature.logging.BLELoggingFeature$onSLOperationStatusUpdate$1", f = "BLELoggingFeature.kt", l = {}, m = "invokeSuspend", v = 1)
final class BLELoggingFeature$onSLOperationStatusUpdate$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ SilentRideOperation $slOperation;
    final /* synthetic */ SilentRideOperationStatus $slOperationStatus;
    int label;
    final /* synthetic */ BLELoggingFeature this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BLELoggingFeature$onSLOperationStatusUpdate$1(BLELoggingFeature bLELoggingFeature, SilentRideOperation silentRideOperation, SilentRideOperationStatus silentRideOperationStatus, Continuation continuation) {
        super(2, continuation);
        this.this$0 = bLELoggingFeature;
        this.$slOperation = silentRideOperation;
        this.$slOperationStatus = silentRideOperationStatus;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new BLELoggingFeature$onSLOperationStatusUpdate$1(this.this$0, this.$slOperation, this.$slOperationStatus, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        BLELoggingFeature$onSLOperationStatusUpdate$1 bLELoggingFeature$onSLOperationStatusUpdate$1 = (BLELoggingFeature$onSLOperationStatusUpdate$1) create((CoroutineScope) obj, (Continuation) obj2);
        Unit unit = Unit.f17538a;
        bLELoggingFeature$onSLOperationStatusUpdate$1.invokeSuspend(unit);
        return unit;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CrashlyticsLoggingException sendDataDriverDeviceOperationLoggingEx;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.b(obj);
        BLELoggingFeature bLELoggingFeature = this.this$0;
        SilentRideOperation silentRideOperation = this.$slOperation;
        SilentRideOperationStatus silentRideOperationStatus = this.$slOperationStatus;
        bLELoggingFeature.getClass();
        if (bLELoggingFeature.e(silentRideOperationStatus.f15363a, silentRideOperation.b)) {
            CrashlyticsLogger crashlyticsLogger = bLELoggingFeature.d;
            String strValueOf = String.valueOf(silentRideOperation.getK());
            String str = silentRideOperationStatus.b;
            if (str == null) {
                str = "";
            }
            crashlyticsLogger.g(new CrashlyticsLog(strValueOf, str));
        }
        BLELoggingFeature bLELoggingFeature2 = this.this$0;
        SilentRideOperation silentRideOperation2 = this.$slOperation;
        SilentRideOperationStatus silentRideOperationStatus2 = this.$slOperationStatus;
        bLELoggingFeature2.getClass();
        if (!(silentRideOperationStatus2 instanceof SilentRideOperationStatus.Validate) && !(silentRideOperationStatus2 instanceof SilentRideOperationStatus.InProgress) && !(silentRideOperationStatus2 instanceof SilentRideOperationStatus.NotStarted) && !(silentRideOperationStatus2 instanceof SilentRideOperationStatus.OnNext)) {
            if (!(silentRideOperationStatus2 instanceof SilentRideOperationStatus.AlreadyCompleted) && !(silentRideOperationStatus2 instanceof SilentRideOperationStatus.Failed) && !(silentRideOperationStatus2 instanceof SilentRideOperationStatus.FailureAwaited) && !(silentRideOperationStatus2 instanceof SilentRideOperationStatus.Rejected) && !(silentRideOperationStatus2 instanceof SilentRideOperationStatus.Success) && !(silentRideOperationStatus2 instanceof SilentRideOperationStatus.SuccessAwaited)) {
                throw new NoWhenBranchMatchedException();
            }
            CrashlyticsLogger crashlyticsLogger2 = bLELoggingFeature2.d;
            if (silentRideOperation2 instanceof StartActiveModeBroadcastDriverOperation) {
                sendDataDriverDeviceOperationLoggingEx = new StartActiveModeBroadcastDriverOperationLoggingEx();
            } else if (silentRideOperation2 instanceof StartActiveModeScanDriverOperation) {
                sendDataDriverDeviceOperationLoggingEx = new StartActiveModeScanDriverOperationLoggingEx();
            } else if (silentRideOperation2 instanceof StartPassiveModeSilentRideDriverOperation) {
                sendDataDriverDeviceOperationLoggingEx = new StartPassiveModeSilentRideDriverOperationLoggingEx();
            } else if (silentRideOperation2 instanceof StopActiveModeBroadcastDriverOperation) {
                sendDataDriverDeviceOperationLoggingEx = new StopActiveModeBroadcastDriverOperationLoggingEx();
            } else if (silentRideOperation2 instanceof StopActiveModeScanDriverOperation) {
                sendDataDriverDeviceOperationLoggingEx = new StopActiveModeScanDriverOperationLoggingEx();
            } else if (silentRideOperation2 instanceof StopPassiveModeSilentRideDriverOperation) {
                sendDataDriverDeviceOperationLoggingEx = new StopPassiveModeSilentRideDriverOperationLoggingEx();
            } else if (silentRideOperation2 instanceof ConnectPassengerDeviceOperation) {
                sendDataDriverDeviceOperationLoggingEx = new ConnectPassengerDeviceOperationLoggingEx();
            } else if (silentRideOperation2 instanceof DisconnectPassengerDeviceOperation) {
                sendDataDriverDeviceOperationLoggingEx = new DisconnectPassengerDeviceOperationLoggingEx();
            } else if (silentRideOperation2 instanceof SendDataPassengerDeviceOperation) {
                sendDataDriverDeviceOperationLoggingEx = new SendDataPassengerDeviceOperationLoggingEx();
            } else if (silentRideOperation2 instanceof StartActiveModeBroadcastPassengerOperation) {
                sendDataDriverDeviceOperationLoggingEx = new StartActiveModeBroadcastPassengerOperationLoggingEx();
            } else if (silentRideOperation2 instanceof StartActiveModeScanPassengerOperation) {
                sendDataDriverDeviceOperationLoggingEx = new StartActiveModeScanPassengerOperationLoggingEx();
            } else if (silentRideOperation2 instanceof StartPassiveModeSilentRidePassengerOperation) {
                sendDataDriverDeviceOperationLoggingEx = new StartPassiveModeSilentRidePassengerOperationLoggingEx();
            } else if (silentRideOperation2 instanceof StopActiveModeBroadcastPassengerOperation) {
                sendDataDriverDeviceOperationLoggingEx = new StopActiveModeBroadcastPassengerOperationLoggingEx();
            } else if (silentRideOperation2 instanceof StopActiveModeScanPassengerOperation) {
                sendDataDriverDeviceOperationLoggingEx = new StopActiveModeScanPassengerOperationLoggingEx();
            } else if (silentRideOperation2 instanceof StopPassiveModeSilentRidePassengerOperation) {
                sendDataDriverDeviceOperationLoggingEx = new StopPassiveModeSilentRidePassengerOperationLoggingEx();
            } else if (silentRideOperation2 instanceof DisconnectDriverDeviceOperation) {
                sendDataDriverDeviceOperationLoggingEx = new DisconnectDriverDeviceOperationLoggingEx();
            } else {
                if (!(silentRideOperation2 instanceof SendDataDriverDeviceOperation)) {
                    throw new NoWhenBranchMatchedException();
                }
                sendDataDriverDeviceOperationLoggingEx = new SendDataDriverDeviceOperationLoggingEx();
            }
            crashlyticsLogger2.d(sendDataDriverDeviceOperationLoggingEx);
        }
        return Unit.f17538a;
    }
}
