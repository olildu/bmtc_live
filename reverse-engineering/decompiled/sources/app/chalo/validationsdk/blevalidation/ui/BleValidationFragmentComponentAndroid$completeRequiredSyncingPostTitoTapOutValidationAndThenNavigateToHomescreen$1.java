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
@DebugMetadata(c = "app.chalo.validationsdk.blevalidation.ui.BleValidationFragmentComponentAndroid$completeRequiredSyncingPostTitoTapOutValidationAndThenNavigateToHomescreen$1", f = "BleValidationFragmentComponent.android.kt", l = {1135, 1143, 1153}, m = "invokeSuspend", v = 1)
final class BleValidationFragmentComponentAndroid$completeRequiredSyncingPostTitoTapOutValidationAndThenNavigateToHomescreen$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ BleValidationFragmentComponentAndroid this$0;

    /* JADX INFO: renamed from: app.chalo.validationsdk.blevalidation.ui.BleValidationFragmentComponentAndroid$completeRequiredSyncingPostTitoTapOutValidationAndThenNavigateToHomescreen$1$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "app.chalo.validationsdk.blevalidation.ui.BleValidationFragmentComponentAndroid$completeRequiredSyncingPostTitoTapOutValidationAndThenNavigateToHomescreen$1$1", f = "BleValidationFragmentComponent.android.kt", l = {1136, 1137}, m = "invokeSuspend", v = 1)
    final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;
        final /* synthetic */ BleValidationFragmentComponentAndroid this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(BleValidationFragmentComponentAndroid bleValidationFragmentComponentAndroid, Continuation continuation) {
            super(2, continuation);
            this.this$0 = bleValidationFragmentComponentAndroid;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new AnonymousClass1(this.this$0, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            return ((AnonymousClass1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f17538a);
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
                app.chalo.validationsdk.blevalidation.ui.BleValidationFragmentComponentAndroid r6 = r5.this$0
                r6.Q0()
                return r2
            */
            throw new UnsupportedOperationException("Method not decompiled: app.chalo.validationsdk.blevalidation.ui.BleValidationFragmentComponentAndroid$completeRequiredSyncingPostTitoTapOutValidationAndThenNavigateToHomescreen$1.AnonymousClass1.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BleValidationFragmentComponentAndroid$completeRequiredSyncingPostTitoTapOutValidationAndThenNavigateToHomescreen$1(BleValidationFragmentComponentAndroid bleValidationFragmentComponentAndroid, Continuation continuation) {
        super(2, continuation);
        this.this$0 = bleValidationFragmentComponentAndroid;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new BleValidationFragmentComponentAndroid$completeRequiredSyncingPostTitoTapOutValidationAndThenNavigateToHomescreen$1(this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((BleValidationFragmentComponentAndroid$completeRequiredSyncingPostTitoTapOutValidationAndThenNavigateToHomescreen$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f17538a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x003b, code lost:
    
        if (kotlinx.coroutines.TimeoutKt.b(r7, r1, r9) == r0) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0066, code lost:
    
        if (r4.n(r6, r10, r1, r9) == r0) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0095, code lost:
    
        if (r1.n(r6, "timedOut", r10, r9) == r0) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0097, code lost:
    
        return r0;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r10) {
        /*
            r9 = this;
            kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r1 = r9.label
            r2 = 0
            r3 = 3
            r4 = 2
            r5 = 1
            r6 = 0
            if (r1 == 0) goto L29
            if (r1 == r5) goto L22
            if (r1 == r4) goto L1d
            if (r1 != r3) goto L15
            kotlin.ResultKt.b(r10)
            goto L69
        L15:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r0)
            throw r10
        L1d:
            kotlin.ResultKt.b(r10)
            goto L98
        L22:
            kotlin.ResultKt.b(r10)     // Catch: java.lang.Exception -> L27 kotlinx.coroutines.TimeoutCancellationException -> L74
            goto La2
        L27:
            r10 = move-exception
            goto L3e
        L29:
            kotlin.ResultKt.b(r10)
            app.chalo.validationsdk.blevalidation.ui.BleValidationFragmentComponentAndroid r10 = r9.this$0     // Catch: java.lang.Exception -> L27 kotlinx.coroutines.TimeoutCancellationException -> L74
            long r7 = r10.N     // Catch: java.lang.Exception -> L27 kotlinx.coroutines.TimeoutCancellationException -> L74
            app.chalo.validationsdk.blevalidation.ui.BleValidationFragmentComponentAndroid$completeRequiredSyncingPostTitoTapOutValidationAndThenNavigateToHomescreen$1$1 r1 = new app.chalo.validationsdk.blevalidation.ui.BleValidationFragmentComponentAndroid$completeRequiredSyncingPostTitoTapOutValidationAndThenNavigateToHomescreen$1$1     // Catch: java.lang.Exception -> L27 kotlinx.coroutines.TimeoutCancellationException -> L74
            r1.<init>(r10, r6)     // Catch: java.lang.Exception -> L27 kotlinx.coroutines.TimeoutCancellationException -> L74
            r9.label = r5     // Catch: java.lang.Exception -> L27 kotlinx.coroutines.TimeoutCancellationException -> L74
            java.lang.Object r10 = kotlinx.coroutines.TimeoutKt.b(r7, r1, r9)     // Catch: java.lang.Exception -> L27 kotlinx.coroutines.TimeoutCancellationException -> L74
            if (r10 != r0) goto La2
            goto L97
        L3e:
            app.chalo.validationsdk.blevalidation.ui.BleValidationFragmentComponentAndroid r1 = r9.this$0
            app.chalo.validationsdk.blevalidation.config.ProductValidationAnalyticManager r4 = r1.J
            kotlinx.coroutines.flow.StateFlow r1 = r1.f
            java.lang.Object r1 = r1.getValue()
            app.chalo.validationsdk.blevalidation.ui.BleValidationState r1 = (app.chalo.validationsdk.blevalidation.ui.BleValidationState) r1
            app.chalo.validationsdk.blevalidation.ui.BleValidationMetaData r1 = r1.j
            if (r1 == 0) goto L50
            app.chalo.validationsdk.blevalidation.data.models.ProductValidationData r6 = r1.b
        L50:
            if (r4 == 0) goto L69
            if (r6 == 0) goto L69
            java.lang.String r10 = r10.getMessage()
            java.lang.String r1 = "exception "
            java.lang.String r10 = defpackage.vo1.m(r1, r10)
            app.chalo.constants.Source r1 = app.chalo.constants.Source.BLE_VALIDATION_ACTIVITY
            r9.label = r3
            java.lang.Object r10 = r4.n(r6, r10, r1, r9)
            if (r10 != r0) goto L69
            goto L97
        L69:
            app.chalo.validationsdk.blevalidation.ui.BleValidationFragmentComponentAndroid r10 = r9.this$0
            r10.V0(r2)
            app.chalo.validationsdk.blevalidation.ui.BleValidationFragmentComponentAndroid r10 = r9.this$0
            r10.Q0()
            goto La2
        L74:
            app.chalo.validationsdk.blevalidation.ui.BleValidationFragmentComponentAndroid r10 = r9.this$0
            app.chalo.validationsdk.blevalidation.config.ProductValidationAnalyticManager r1 = r10.J
            kotlinx.coroutines.flow.StateFlow r10 = r10.f
            java.lang.Object r10 = r10.getValue()
            app.chalo.validationsdk.blevalidation.ui.BleValidationState r10 = (app.chalo.validationsdk.blevalidation.ui.BleValidationState) r10
            app.chalo.validationsdk.blevalidation.ui.BleValidationMetaData r10 = r10.j
            if (r10 == 0) goto L86
            app.chalo.validationsdk.blevalidation.data.models.ProductValidationData r6 = r10.b
        L86:
            if (r1 == 0) goto L98
            if (r6 == 0) goto L98
            app.chalo.constants.Source r10 = app.chalo.constants.Source.BLE_VALIDATION_ACTIVITY
            r9.label = r4
            java.lang.String r3 = "timedOut"
            java.lang.Object r10 = r1.n(r6, r3, r10, r9)
            if (r10 != r0) goto L98
        L97:
            return r0
        L98:
            app.chalo.validationsdk.blevalidation.ui.BleValidationFragmentComponentAndroid r10 = r9.this$0
            r10.V0(r2)
            app.chalo.validationsdk.blevalidation.ui.BleValidationFragmentComponentAndroid r10 = r9.this$0
            r10.Q0()
        La2:
            kotlin.Unit r10 = kotlin.Unit.f17538a
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: app.chalo.validationsdk.blevalidation.ui.BleValidationFragmentComponentAndroid$completeRequiredSyncingPostTitoTapOutValidationAndThenNavigateToHomescreen$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
