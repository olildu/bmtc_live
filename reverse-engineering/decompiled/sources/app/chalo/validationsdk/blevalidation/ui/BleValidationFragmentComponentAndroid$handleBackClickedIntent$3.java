package app.chalo.validationsdk.blevalidation.ui;

import app.chalo.models.validation.BleValidationArgs;
import app.chalo.validationsdk.blevalidation.data.models.ProductValidationData;
import app.chalo.validationsdk.blevalidation.helper.BleValidationPrerequisitesState;
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

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "app.chalo.validationsdk.blevalidation.ui.BleValidationFragmentComponentAndroid$handleBackClickedIntent$3", f = "BleValidationFragmentComponent.android.kt", l = {824}, m = "invokeSuspend", v = 1)
final class BleValidationFragmentComponentAndroid$handleBackClickedIntent$3 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ BleValidationFragmentComponentAndroid this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BleValidationFragmentComponentAndroid$handleBackClickedIntent$3(BleValidationFragmentComponentAndroid bleValidationFragmentComponentAndroid, Continuation continuation) {
        super(2, continuation);
        this.this$0 = bleValidationFragmentComponentAndroid;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new BleValidationFragmentComponentAndroid$handleBackClickedIntent$3(this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((BleValidationFragmentComponentAndroid$handleBackClickedIntent$3) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f17538a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            ResultKt.b(obj);
            BleValidationMetaData bleValidationMetaData = ((BleValidationState) this.this$0.f.getValue()).j;
            if (bleValidationMetaData != null) {
                BleValidationFragmentComponentAndroid bleValidationFragmentComponentAndroid = this.this$0;
                BleValidationPrerequisitesState bleValidationPrerequisitesState = (BleValidationPrerequisitesState) FlowKt.c(bleValidationFragmentComponentAndroid.m.g).getValue();
                ProductValidationData productValidationData = bleValidationMetaData.b;
                BleValidationArgs bleValidationArgs = bleValidationMetaData.d;
                this.label = 1;
                if (BleValidationFragmentComponentAndroid.K0(bleValidationFragmentComponentAndroid, bleValidationPrerequisitesState, productValidationData, bleValidationArgs, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
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
