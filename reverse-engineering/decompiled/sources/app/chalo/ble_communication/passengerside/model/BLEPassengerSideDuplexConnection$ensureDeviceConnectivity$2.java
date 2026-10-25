package app.chalo.ble_communication.passengerside.model;

import app.chalo.ble_communication.BLEDuplexConnectionStatus;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.StateFlow;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "Lapp/chalo/ble_communication/BLEDuplexConnectionStatus;", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "app.chalo.ble_communication.passengerside.model.BLEPassengerSideDuplexConnection$ensureDeviceConnectivity$2", f = "BLEPassengerSideDuplexConnection.kt", l = {33}, m = "invokeSuspend", v = 1)
final class BLEPassengerSideDuplexConnection$ensureDeviceConnectivity$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super BLEDuplexConnectionStatus>, Object> {
    int label;
    final /* synthetic */ BLEPassengerSideDuplexConnection this$0;

    /* JADX INFO: renamed from: app.chalo.ble_communication.passengerside.model.BLEPassengerSideDuplexConnection$ensureDeviceConnectivity$2$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "it", "Lapp/chalo/ble_communication/BLEDuplexConnectionStatus;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "app.chalo.ble_communication.passengerside.model.BLEPassengerSideDuplexConnection$ensureDeviceConnectivity$2$1", f = "BLEPassengerSideDuplexConnection.kt", l = {}, m = "invokeSuspend", v = 1)
    final class AnonymousClass1 extends SuspendLambda implements Function2<BLEDuplexConnectionStatus, Continuation<? super Boolean>, Object> {
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
            return ((AnonymousClass1) create((BLEDuplexConnectionStatus) obj, (Continuation) obj2)).invokeSuspend(Unit.f17538a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(obj);
            return Boolean.valueOf(((BLEDuplexConnectionStatus) this.L$0) == BLEDuplexConnectionStatus.CONNECTED);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BLEPassengerSideDuplexConnection$ensureDeviceConnectivity$2(BLEPassengerSideDuplexConnection bLEPassengerSideDuplexConnection, Continuation continuation) {
        super(2, continuation);
        this.this$0 = bLEPassengerSideDuplexConnection;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new BLEPassengerSideDuplexConnection$ensureDeviceConnectivity$2(this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((BLEPassengerSideDuplexConnection$ensureDeviceConnectivity$2) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f17538a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            ResultKt.b(obj);
            StateFlow stateFlowC = FlowKt.c(this.this$0.c);
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(2, null);
            this.label = 1;
            obj = FlowKt.w(stateFlowC, anonymousClass1, this);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(obj);
        }
        BLEDuplexConnectionStatus bLEDuplexConnectionStatus = (BLEDuplexConnectionStatus) obj;
        return bLEDuplexConnectionStatus == null ? BLEDuplexConnectionStatus.CONNECTION_BUSY : bLEDuplexConnectionStatus;
    }
}
