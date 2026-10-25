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
@DebugMetadata(c = "app.chalo.validationsdk.blevalidation.ui.BleValidationFragmentComponentAndroid$handleViewTripReceiptPostConductorValidationCompleteIntent$1", f = "BleValidationFragmentComponent.android.kt", l = {682, 688}, m = "invokeSuspend", v = 1)
final class BleValidationFragmentComponentAndroid$handleViewTripReceiptPostConductorValidationCompleteIntent$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ BleValidationFragmentComponentAndroid this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BleValidationFragmentComponentAndroid$handleViewTripReceiptPostConductorValidationCompleteIntent$1(BleValidationFragmentComponentAndroid bleValidationFragmentComponentAndroid, Continuation continuation) {
        super(2, continuation);
        this.this$0 = bleValidationFragmentComponentAndroid;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new BleValidationFragmentComponentAndroid$handleViewTripReceiptPostConductorValidationCompleteIntent$1(this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((BleValidationFragmentComponentAndroid$handleViewTripReceiptPostConductorValidationCompleteIntent$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f17538a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x004b, code lost:
    
        if (app.chalo.validationsdk.blevalidation.ui.BleValidationFragmentComponentAndroid.H0(r7, true, r6) == r0) goto L21;
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
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L1c
            if (r1 == r3) goto L18
            if (r1 != r2) goto L10
            kotlin.ResultKt.b(r7)
            goto L4e
        L10:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L18:
            kotlin.ResultKt.b(r7)
            goto L43
        L1c:
            kotlin.ResultKt.b(r7)
            app.chalo.validationsdk.blevalidation.ui.BleValidationFragmentComponentAndroid r7 = r6.this$0
            app.chalo.validationsdk.blevalidation.config.ProductValidationAnalyticManager r1 = r7.J
            kotlinx.coroutines.flow.StateFlow r7 = r7.f
            java.lang.Object r7 = r7.getValue()
            app.chalo.validationsdk.blevalidation.ui.BleValidationState r7 = (app.chalo.validationsdk.blevalidation.ui.BleValidationState) r7
            app.chalo.validationsdk.blevalidation.ui.BleValidationMetaData r7 = r7.j
            if (r7 == 0) goto L32
            app.chalo.validationsdk.blevalidation.data.models.ProductValidationData r7 = r7.b
            goto L33
        L32:
            r7 = 0
        L33:
            if (r1 == 0) goto L43
            if (r7 == 0) goto L43
            app.chalo.constants.Source r4 = app.chalo.constants.Source.BLE_VALIDATION_ACTIVITY
            r6.label = r3
            r5 = 0
            java.lang.Object r7 = r1.m(r7, r5, r4, r6)
            if (r7 != r0) goto L43
            goto L4d
        L43:
            app.chalo.validationsdk.blevalidation.ui.BleValidationFragmentComponentAndroid r7 = r6.this$0
            r6.label = r2
            java.lang.Object r7 = app.chalo.validationsdk.blevalidation.ui.BleValidationFragmentComponentAndroid.H0(r7, r3, r6)
            if (r7 != r0) goto L4e
        L4d:
            return r0
        L4e:
            kotlin.Unit r7 = kotlin.Unit.f17538a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: app.chalo.validationsdk.blevalidation.ui.BleValidationFragmentComponentAndroid$handleViewTripReceiptPostConductorValidationCompleteIntent$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
