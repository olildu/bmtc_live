package app.chalo.validationsdk.blevalidation.helper;

import app.chalo.constants.Source;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.flow.MutableStateFlow;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "app.chalo.validationsdk.blevalidation.helper.BleValidationWithTwoWayPilotHelper$stopAllBLEOperationsAndSwitchOffBluetoothIfNeeded$1", f = "BleValidationWithTwoWayPilotHelper.kt", l = {284, 290}, m = "invokeSuspend", v = 1)
final class BleValidationWithTwoWayPilotHelper$stopAllBLEOperationsAndSwitchOffBluetoothIfNeeded$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ Map<String, Object> $additionalAnalyticsAttributesMap;
    final /* synthetic */ BleValidationStoppingReason $reason;
    final /* synthetic */ Source $source;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ BleValidationWithTwoWayPilotHelper this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BleValidationWithTwoWayPilotHelper$stopAllBLEOperationsAndSwitchOffBluetoothIfNeeded$1(BleValidationWithTwoWayPilotHelper bleValidationWithTwoWayPilotHelper, BleValidationStoppingReason bleValidationStoppingReason, Source source, Map map, Continuation continuation) {
        super(2, continuation);
        this.this$0 = bleValidationWithTwoWayPilotHelper;
        this.$reason = bleValidationStoppingReason;
        this.$source = source;
        this.$additionalAnalyticsAttributesMap = map;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        BleValidationWithTwoWayPilotHelper$stopAllBLEOperationsAndSwitchOffBluetoothIfNeeded$1 bleValidationWithTwoWayPilotHelper$stopAllBLEOperationsAndSwitchOffBluetoothIfNeeded$1 = new BleValidationWithTwoWayPilotHelper$stopAllBLEOperationsAndSwitchOffBluetoothIfNeeded$1(this.this$0, this.$reason, this.$source, this.$additionalAnalyticsAttributesMap, continuation);
        bleValidationWithTwoWayPilotHelper$stopAllBLEOperationsAndSwitchOffBluetoothIfNeeded$1.L$0 = obj;
        return bleValidationWithTwoWayPilotHelper$stopAllBLEOperationsAndSwitchOffBluetoothIfNeeded$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((BleValidationWithTwoWayPilotHelper$stopAllBLEOperationsAndSwitchOffBluetoothIfNeeded$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f17538a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineScope coroutineScope;
        CoroutineScope coroutineScope2;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            ResultKt.b(obj);
            coroutineScope = (CoroutineScope) this.L$0;
            MutableStateFlow mutableStateFlow = this.this$0.n;
            Pair pair = new Pair(new BleActiveModeStatus.Stopped(this.$reason.name()), new BlePassiveModeStatus.Stopped(this.$reason.name()));
            this.L$0 = coroutineScope;
            this.label = 1;
            if (mutableStateFlow.emit(pair, this) != coroutineSingletons) {
            }
            return coroutineSingletons;
        }
        if (i == 1) {
            CoroutineScope coroutineScope3 = (CoroutineScope) this.L$0;
            ResultKt.b(obj);
            coroutineScope = coroutineScope3;
        } else {
            if (i != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            coroutineScope2 = (CoroutineScope) this.L$0;
            ResultKt.b(obj);
        }
        CoroutineScopeKt.b(coroutineScope2, null);
        return Unit.f17538a;
        TwoWayBleCommPilotLogger twoWayBleCommPilotLogger = this.this$0.b;
        Source source = this.$source;
        Map<String, Object> map = this.$additionalAnalyticsAttributesMap;
        this.L$0 = coroutineScope;
        this.label = 2;
        if (twoWayBleCommPilotLogger.q(source, map, this) != coroutineSingletons) {
            coroutineScope2 = coroutineScope;
            CoroutineScopeKt.b(coroutineScope2, null);
            return Unit.f17538a;
        }
        return coroutineSingletons;
    }
}
