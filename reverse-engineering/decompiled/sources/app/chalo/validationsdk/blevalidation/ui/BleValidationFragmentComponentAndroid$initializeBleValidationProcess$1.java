package app.chalo.validationsdk.blevalidation.ui;

import app.chalo.models.validation.BleValidationArgs;
import app.chalo.validationsdk.blevalidation.data.models.ProductValidationData;
import app.chalo.validationsdk.blevalidation.helper.BleValidationPrerequisitesState;
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
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.StateFlow;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "app.chalo.validationsdk.blevalidation.ui.BleValidationFragmentComponentAndroid$initializeBleValidationProcess$1", f = "BleValidationFragmentComponent.android.kt", l = {953}, m = "invokeSuspend", v = 1)
final class BleValidationFragmentComponentAndroid$initializeBleValidationProcess$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ BleValidationArgs $bleValidationArgs;
    final /* synthetic */ ProductValidationData $productValidationData;
    int label;
    final /* synthetic */ BleValidationFragmentComponentAndroid this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BleValidationFragmentComponentAndroid$initializeBleValidationProcess$1(BleValidationArgs bleValidationArgs, ProductValidationData productValidationData, BleValidationFragmentComponentAndroid bleValidationFragmentComponentAndroid, Continuation continuation) {
        super(2, continuation);
        this.this$0 = bleValidationFragmentComponentAndroid;
        this.$productValidationData = productValidationData;
        this.$bleValidationArgs = bleValidationArgs;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        BleValidationFragmentComponentAndroid bleValidationFragmentComponentAndroid = this.this$0;
        return new BleValidationFragmentComponentAndroid$initializeBleValidationProcess$1(this.$bleValidationArgs, this.$productValidationData, bleValidationFragmentComponentAndroid, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((BleValidationFragmentComponentAndroid$initializeBleValidationProcess$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f17538a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            ResultKt.b(obj);
            StateFlow stateFlowC = FlowKt.c(this.this$0.m.g);
            final BleValidationFragmentComponentAndroid bleValidationFragmentComponentAndroid = this.this$0;
            final ProductValidationData productValidationData = this.$productValidationData;
            final BleValidationArgs bleValidationArgs = this.$bleValidationArgs;
            FlowCollector flowCollector = new FlowCollector() { // from class: app.chalo.validationsdk.blevalidation.ui.BleValidationFragmentComponentAndroid$initializeBleValidationProcess$1.1
                @Override // kotlinx.coroutines.flow.FlowCollector
                public final Object emit(Object obj2, Continuation continuation) {
                    Object objK0 = BleValidationFragmentComponentAndroid.K0(bleValidationFragmentComponentAndroid, (BleValidationPrerequisitesState) obj2, productValidationData, bleValidationArgs, continuation);
                    return objK0 == CoroutineSingletons.COROUTINE_SUSPENDED ? objK0 : Unit.f17538a;
                }
            };
            this.label = 1;
            if (stateFlowC.collect(flowCollector, this) == coroutineSingletons) {
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
