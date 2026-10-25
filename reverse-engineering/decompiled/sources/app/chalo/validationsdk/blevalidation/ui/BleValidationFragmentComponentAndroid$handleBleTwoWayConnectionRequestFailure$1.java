package app.chalo.validationsdk.blevalidation.ui;

import app.chalo.models.validation.BleValidationArgs;
import app.chalo.validationsdk.blevalidation.data.models.ProductValidationData;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "app.chalo.validationsdk.blevalidation.ui.BleValidationFragmentComponentAndroid$handleBleTwoWayConnectionRequestFailure$1", f = "BleValidationFragmentComponent.android.kt", l = {1878, 1878, 1879}, m = "invokeSuspend", v = 1)
final class BleValidationFragmentComponentAndroid$handleBleTwoWayConnectionRequestFailure$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ BleValidationArgs $bleValidationArgs;
    final /* synthetic */ ProductValidationData $productValidationData;
    int label;
    final /* synthetic */ BleValidationFragmentComponentAndroid this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BleValidationFragmentComponentAndroid$handleBleTwoWayConnectionRequestFailure$1(BleValidationArgs bleValidationArgs, ProductValidationData productValidationData, BleValidationFragmentComponentAndroid bleValidationFragmentComponentAndroid, Continuation continuation) {
        super(2, continuation);
        this.this$0 = bleValidationFragmentComponentAndroid;
        this.$bleValidationArgs = bleValidationArgs;
        this.$productValidationData = productValidationData;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new BleValidationFragmentComponentAndroid$handleBleTwoWayConnectionRequestFailure$1(this.$bleValidationArgs, this.$productValidationData, this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((BleValidationFragmentComponentAndroid$handleBleTwoWayConnectionRequestFailure$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f17538a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0050, code lost:
    
        if (r7.U0(r1, r3, r6) == r0) goto L20;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r7) {
        /*
            r6 = this;
            kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r1 = r6.label
            r2 = 3
            r3 = 2
            r4 = 1
            if (r1 == 0) goto L23
            if (r1 == r4) goto L1f
            if (r1 == r3) goto L1b
            if (r1 != r2) goto L13
            kotlin.ResultKt.b(r7)
            goto L53
        L13:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L1b:
            kotlin.ResultKt.b(r7)
            goto L44
        L1f:
            kotlin.ResultKt.b(r7)
            goto L37
        L23:
            kotlin.ResultKt.b(r7)
            app.chalo.validationsdk.blevalidation.ui.BleValidationFragmentComponentAndroid r7 = r6.this$0
            app.chalo.validationsdk.blevalidation.helper.GetTwoWayBleCommPilotConfigUseCase r7 = r7.s
            app.chalo.models.validation.BleValidationArgs r1 = r6.$bleValidationArgs
            app.chalo.models.validation.ValidationProduct r1 = r1.b
            r6.label = r4
            java.lang.Object r7 = r7.a(r1, r6)
            if (r7 != r0) goto L37
            goto L52
        L37:
            app.chalo.models.validation.TwoWayBLECommPilotConfig r7 = (app.chalo.models.validation.TwoWayBLECommPilotConfig) r7
            long r4 = r7.g
            r6.label = r3
            java.lang.Object r7 = kotlinx.coroutines.DelayKt.b(r4, r6)
            if (r7 != r0) goto L44
            goto L52
        L44:
            app.chalo.validationsdk.blevalidation.ui.BleValidationFragmentComponentAndroid r7 = r6.this$0
            app.chalo.validationsdk.blevalidation.data.models.ProductValidationData r1 = r6.$productValidationData
            app.chalo.models.validation.BleValidationArgs r3 = r6.$bleValidationArgs
            r6.label = r2
            java.lang.Object r7 = r7.U0(r1, r3, r6)
            if (r7 != r0) goto L53
        L52:
            return r0
        L53:
            kotlin.Unit r7 = kotlin.Unit.f17538a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: app.chalo.validationsdk.blevalidation.ui.BleValidationFragmentComponentAndroid$handleBleTwoWayConnectionRequestFailure$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
