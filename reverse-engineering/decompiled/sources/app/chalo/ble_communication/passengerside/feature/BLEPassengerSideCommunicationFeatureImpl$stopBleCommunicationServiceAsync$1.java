package app.chalo.ble_communication.passengerside.feature;

import app.chalo.ble_communication.feature.BluetoothHardwareOperationsFeature;
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

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "app.chalo.ble_communication.passengerside.feature.BLEPassengerSideCommunicationFeatureImpl$stopBleCommunicationServiceAsync$1", f = "BLEPassengerSideCommunicationFeatureImpl.kt", l = {296, 297, 298, 300}, m = "invokeSuspend", v = 1)
final class BLEPassengerSideCommunicationFeatureImpl$stopBleCommunicationServiceAsync$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ BLEPassengerSideCommunicationFeatureImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BLEPassengerSideCommunicationFeatureImpl$stopBleCommunicationServiceAsync$1(BLEPassengerSideCommunicationFeatureImpl bLEPassengerSideCommunicationFeatureImpl, Continuation continuation) {
        super(2, continuation);
        this.this$0 = bLEPassengerSideCommunicationFeatureImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        BLEPassengerSideCommunicationFeatureImpl$stopBleCommunicationServiceAsync$1 bLEPassengerSideCommunicationFeatureImpl$stopBleCommunicationServiceAsync$1 = new BLEPassengerSideCommunicationFeatureImpl$stopBleCommunicationServiceAsync$1(this.this$0, continuation);
        bLEPassengerSideCommunicationFeatureImpl$stopBleCommunicationServiceAsync$1.L$0 = obj;
        return bLEPassengerSideCommunicationFeatureImpl$stopBleCommunicationServiceAsync$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((BLEPassengerSideCommunicationFeatureImpl$stopBleCommunicationServiceAsync$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f17538a);
    }

    /* JADX WARN: Code duplicated, block: B:24:0x006a A[PHI: r1
      0x006a: PHI (r1v6 kotlinx.coroutines.CoroutineScope) = (r1v5 kotlinx.coroutines.CoroutineScope), (r1v14 kotlinx.coroutines.CoroutineScope) binds: [B:22:0x0067, B:11:0x0023] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:26:0x0070  */
    /* JADX WARN: Code duplicated, block: B:31:0x0086  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineScope coroutineScope;
        BLEPassengerSideCommunicationFeatureImpl bLEPassengerSideCommunicationFeatureImpl;
        Boolean bool;
        BluetoothHardwareOperationsFeature bluetoothHardwareOperationsFeature;
        CoroutineScope coroutineScope2;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            ResultKt.b(obj);
            CoroutineScope coroutineScope3 = (CoroutineScope) this.L$0;
            BLEPassengerSideCommunicationFeatureImpl bLEPassengerSideCommunicationFeatureImpl2 = this.this$0;
            this.L$0 = coroutineScope3;
            this.label = 1;
            if (bLEPassengerSideCommunicationFeatureImpl2.m(this) != coroutineSingletons) {
                coroutineScope = coroutineScope3;
            }
            return coroutineSingletons;
        }
        if (i == 1) {
            coroutineScope = (CoroutineScope) this.L$0;
            ResultKt.b(obj);
        } else {
            if (i == 2) {
                coroutineScope = (CoroutineScope) this.L$0;
                ResultKt.b(obj);
                bLEPassengerSideCommunicationFeatureImpl = this.this$0;
                this.L$0 = coroutineScope;
                this.label = 3;
                if (bLEPassengerSideCommunicationFeatureImpl.o(this) != coroutineSingletons) {
                    bool = this.this$0.k;
                    if (bool != null) {
                        bluetoothHardwareOperationsFeature = this.this$0.c;
                        this.L$0 = coroutineScope;
                        this.label = 4;
                        if (bluetoothHardwareOperationsFeature.e(this) != coroutineSingletons) {
                            coroutineScope2 = coroutineScope;
                        }
                    }
                    CoroutineScopeKt.b(coroutineScope, null);
                    return Unit.f17538a;
                }
                return coroutineSingletons;
            }
            if (i == 3) {
                coroutineScope = (CoroutineScope) this.L$0;
                ResultKt.b(obj);
                bool = this.this$0.k;
                if (bool != null && (!bool.booleanValue())) {
                    bluetoothHardwareOperationsFeature = this.this$0.c;
                    this.L$0 = coroutineScope;
                    this.label = 4;
                    if (bluetoothHardwareOperationsFeature.e(this) != coroutineSingletons) {
                        coroutineScope2 = coroutineScope;
                    }
                    return coroutineSingletons;
                }
                CoroutineScopeKt.b(coroutineScope, null);
                return Unit.f17538a;
            }
            if (i != 4) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            coroutineScope2 = (CoroutineScope) this.L$0;
            ResultKt.b(obj);
        }
        coroutineScope = coroutineScope2;
        CoroutineScopeKt.b(coroutineScope, null);
        return Unit.f17538a;
        BLEPassengerSideCommunicationFeatureImpl bLEPassengerSideCommunicationFeatureImpl3 = this.this$0;
        this.L$0 = coroutineScope;
        this.label = 2;
        if (bLEPassengerSideCommunicationFeatureImpl3.n(this) != coroutineSingletons) {
            bLEPassengerSideCommunicationFeatureImpl = this.this$0;
            this.L$0 = coroutineScope;
            this.label = 3;
            if (bLEPassengerSideCommunicationFeatureImpl.o(this) != coroutineSingletons) {
                bool = this.this$0.k;
                if (bool != null) {
                    bluetoothHardwareOperationsFeature = this.this$0.c;
                    this.L$0 = coroutineScope;
                    this.label = 4;
                    if (bluetoothHardwareOperationsFeature.e(this) != coroutineSingletons) {
                        coroutineScope2 = coroutineScope;
                        coroutineScope = coroutineScope2;
                    }
                }
                CoroutineScopeKt.b(coroutineScope, null);
                return Unit.f17538a;
            }
        }
        return coroutineSingletons;
    }
}
