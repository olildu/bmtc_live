package app.chalo.validationsdk.blevalidation.ui;

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
@DebugMetadata(c = "app.chalo.validationsdk.blevalidation.ui.BleValidationFragmentComponentAndroid$handleViewTripReceiptMenuOptionClickedIntent$1", f = "BleValidationFragmentComponent.android.kt", l = {673, 677}, m = "invokeSuspend", v = 1)
final class BleValidationFragmentComponentAndroid$handleViewTripReceiptMenuOptionClickedIntent$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ BleValidationFragmentComponentAndroid this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BleValidationFragmentComponentAndroid$handleViewTripReceiptMenuOptionClickedIntent$1(BleValidationFragmentComponentAndroid bleValidationFragmentComponentAndroid, Continuation continuation) {
        super(2, continuation);
        this.this$0 = bleValidationFragmentComponentAndroid;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new BleValidationFragmentComponentAndroid$handleViewTripReceiptMenuOptionClickedIntent$1(this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((BleValidationFragmentComponentAndroid$handleViewTripReceiptMenuOptionClickedIntent$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f17538a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0049, code lost:
    
        if (app.chalo.validationsdk.blevalidation.ui.BleValidationFragmentComponentAndroid.H0(r5, false, r4) == r0) goto L21;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r5) {
        /*
            r4 = this;
            kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r1 = r4.label
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L1c
            if (r1 == r3) goto L18
            if (r1 != r2) goto L10
            kotlin.ResultKt.b(r5)
            goto L4c
        L10:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L18:
            kotlin.ResultKt.b(r5)
            goto L40
        L1c:
            kotlin.ResultKt.b(r5)
            app.chalo.validationsdk.blevalidation.ui.BleValidationFragmentComponentAndroid r5 = r4.this$0
            app.chalo.validationsdk.blevalidation.config.ProductValidationAnalyticManager r1 = r5.J
            kotlinx.coroutines.flow.StateFlow r5 = r5.f
            java.lang.Object r5 = r5.getValue()
            app.chalo.validationsdk.blevalidation.ui.BleValidationState r5 = (app.chalo.validationsdk.blevalidation.ui.BleValidationState) r5
            app.chalo.validationsdk.blevalidation.ui.BleValidationMetaData r5 = r5.j
            if (r5 == 0) goto L32
            app.chalo.validationsdk.blevalidation.data.models.ProductValidationData r5 = r5.b
            goto L33
        L32:
            r5 = 0
        L33:
            if (r1 == 0) goto L40
            if (r5 == 0) goto L40
            r4.label = r3
            java.lang.Object r5 = r1.h(r5, r4)
            if (r5 != r0) goto L40
            goto L4b
        L40:
            app.chalo.validationsdk.blevalidation.ui.BleValidationFragmentComponentAndroid r5 = r4.this$0
            r4.label = r2
            r1 = 0
            java.lang.Object r5 = app.chalo.validationsdk.blevalidation.ui.BleValidationFragmentComponentAndroid.H0(r5, r1, r4)
            if (r5 != r0) goto L4c
        L4b:
            return r0
        L4c:
            kotlin.Unit r5 = kotlin.Unit.f17538a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: app.chalo.validationsdk.blevalidation.ui.BleValidationFragmentComponentAndroid$handleViewTripReceiptMenuOptionClickedIntent$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
