package app.chalo.ble_communication.domain;

import com.silencelaboratories.silentride.operations.SilentRideOperation;
import com.silencelaboratories.silentride.operations.SilentRideOperationStatus;
import com.silencelaboratories.silentride.operations.StopPassiveModeSilentRidePassengerOperation;
import defpackage.l8;
import defpackage.wb;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.channels.ProduceKt;
import kotlinx.coroutines.channels.ProducerScope;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00030\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/channels/ProducerScope;", "Lcom/silencelaboratories/silentride/operations/SilentRideOperationStatus;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "app.chalo.ble_communication.domain.BLEOperationExecutor$getOperationStatusFlow$17", f = "BLEOperationExecutor.kt", l = {298}, m = "invokeSuspend", v = 1)
final class BLEOperationExecutor$getOperationStatusFlow$17 extends SuspendLambda implements Function2<ProducerScope<? super SilentRideOperationStatus>, Continuation<? super Unit>, Object> {
    final /* synthetic */ SilentRideOperation $slOperation;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BLEOperationExecutor$getOperationStatusFlow$17(SilentRideOperation silentRideOperation, Continuation continuation) {
        super(2, continuation);
        this.$slOperation = silentRideOperation;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        BLEOperationExecutor$getOperationStatusFlow$17 bLEOperationExecutor$getOperationStatusFlow$17 = new BLEOperationExecutor$getOperationStatusFlow$17(this.$slOperation, continuation);
        bLEOperationExecutor$getOperationStatusFlow$17.L$0 = obj;
        return bLEOperationExecutor$getOperationStatusFlow$17;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((BLEOperationExecutor$getOperationStatusFlow$17) create((ProducerScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f17538a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            ResultKt.b(obj);
            ProducerScope producerScope = (ProducerScope) this.L$0;
            ((StopPassiveModeSilentRidePassengerOperation) this.$slOperation).e(new l8(producerScope, 8));
            this.label = 1;
            if (ProduceKt.a(producerScope, new wb(8), this) == coroutineSingletons) {
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
