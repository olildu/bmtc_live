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
@DebugMetadata(c = "app.chalo.validationsdk.blevalidation.ui.BleValidationFragmentComponentAndroid$completeRequiredSyncingPostTitoTapOutValidation$2", f = "BleValidationFragmentComponent.android.kt", l = {1169, 1170}, m = "invokeSuspend", v = 1)
final class BleValidationFragmentComponentAndroid$completeRequiredSyncingPostTitoTapOutValidation$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ BleValidationFragmentComponentAndroid this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BleValidationFragmentComponentAndroid$completeRequiredSyncingPostTitoTapOutValidation$2(BleValidationFragmentComponentAndroid bleValidationFragmentComponentAndroid, Continuation continuation) {
        super(2, continuation);
        this.this$0 = bleValidationFragmentComponentAndroid;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new BleValidationFragmentComponentAndroid$completeRequiredSyncingPostTitoTapOutValidation$2(this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((BleValidationFragmentComponentAndroid$completeRequiredSyncingPostTitoTapOutValidation$2) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f17538a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0042, code lost:
    
        if (app.chalo.validationsdk.blevalidation.ui.BleValidationFragmentComponentAndroid.L0(r6, r5) == r0) goto L18;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r6) {
        /*
            r5 = this;
            kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r1 = r5.label
            kotlin.Unit r2 = kotlin.Unit.f17538a
            r3 = 2
            r4 = 1
            if (r1 == 0) goto L1e
            if (r1 == r4) goto L1a
            if (r1 != r3) goto L12
            kotlin.ResultKt.b(r6)
            goto L45
        L12:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L1a:
            kotlin.ResultKt.b(r6)
            goto L3a
        L1e:
            kotlin.ResultKt.b(r6)
            app.chalo.validationsdk.blevalidation.ui.BleValidationFragmentComponentAndroid r6 = r5.this$0
            r5.label = r4
            app.chalo.validationsdk.blevalidation.helper.BleValidationProcessCompletionHelper r6 = r6.p
            kotlinx.coroutines.flow.StateFlow r6 = r6.k
            app.chalo.validationsdk.blevalidation.ui.BleValidationFragmentComponentAndroid$waitUntilTitoActivationSyncCompletion$2 r1 = new app.chalo.validationsdk.blevalidation.ui.BleValidationFragmentComponentAndroid$waitUntilTitoActivationSyncCompletion$2
            r4 = 0
            r1.<init>(r3, r4)
            java.lang.Object r6 = kotlinx.coroutines.flow.FlowKt.w(r6, r1, r5)
            if (r6 != r0) goto L36
            goto L37
        L36:
            r6 = r2
        L37:
            if (r6 != r0) goto L3a
            goto L44
        L3a:
            app.chalo.validationsdk.blevalidation.ui.BleValidationFragmentComponentAndroid r6 = r5.this$0
            r5.label = r3
            java.lang.Object r6 = app.chalo.validationsdk.blevalidation.ui.BleValidationFragmentComponentAndroid.L0(r6, r5)
            if (r6 != r0) goto L45
        L44:
            return r0
        L45:
            app.chalo.validationsdk.blevalidation.ui.BleValidationFragmentComponentAndroid r6 = r5.this$0
            r0 = 0
            r6.V0(r0)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: app.chalo.validationsdk.blevalidation.ui.BleValidationFragmentComponentAndroid$completeRequiredSyncingPostTitoTapOutValidation$2.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
