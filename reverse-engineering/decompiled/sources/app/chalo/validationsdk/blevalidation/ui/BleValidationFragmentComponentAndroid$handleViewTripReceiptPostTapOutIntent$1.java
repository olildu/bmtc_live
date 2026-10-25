package app.chalo.validationsdk.blevalidation.ui;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import app.chalo.constants.Source;
import app.chalo.validationsdk.blevalidation.config.ProductValidationAnalyticManager;
import app.chalo.validationsdk.blevalidation.data.models.ProductValidationData;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "app.chalo.validationsdk.blevalidation.ui.BleValidationFragmentComponentAndroid$handleViewTripReceiptPostTapOutIntent$1", f = "BleValidationFragmentComponent.android.kt", l = {693}, m = "invokeSuspend", v = 1)
final class BleValidationFragmentComponentAndroid$handleViewTripReceiptPostTapOutIntent$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ BleValidationFragmentComponentAndroid this$0;

    /* JADX INFO: renamed from: app.chalo.validationsdk.blevalidation.ui.BleValidationFragmentComponentAndroid$handleViewTripReceiptPostTapOutIntent$1$2, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "app.chalo.validationsdk.blevalidation.ui.BleValidationFragmentComponentAndroid$handleViewTripReceiptPostTapOutIntent$1$2", f = "BleValidationFragmentComponent.android.kt", l = {TypedValues.TransitionType.TYPE_DURATION, TypedValues.TransitionType.TYPE_FROM}, m = "invokeSuspend", v = 1)
    final class AnonymousClass2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;
        final /* synthetic */ BleValidationFragmentComponentAndroid this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(BleValidationFragmentComponentAndroid bleValidationFragmentComponentAndroid, Continuation continuation) {
            super(2, continuation);
            this.this$0 = bleValidationFragmentComponentAndroid;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new AnonymousClass2(this.this$0, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            return ((AnonymousClass2) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f17538a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:14:0x0032, code lost:
        
            if (app.chalo.validationsdk.blevalidation.ui.BleValidationFragmentComponentAndroid.H0(r5, true, r4) == r0) goto L15;
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
                goto L35
            L10:
                java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r5.<init>(r0)
                throw r5
            L18:
                kotlin.ResultKt.b(r5)
                goto L2a
            L1c:
                kotlin.ResultKt.b(r5)
                app.chalo.validationsdk.blevalidation.ui.BleValidationFragmentComponentAndroid r5 = r4.this$0
                r4.label = r3
                java.lang.Object r5 = app.chalo.validationsdk.blevalidation.ui.BleValidationFragmentComponentAndroid.F0(r5, r4)
                if (r5 != r0) goto L2a
                goto L34
            L2a:
                app.chalo.validationsdk.blevalidation.ui.BleValidationFragmentComponentAndroid r5 = r4.this$0
                r4.label = r2
                java.lang.Object r5 = app.chalo.validationsdk.blevalidation.ui.BleValidationFragmentComponentAndroid.H0(r5, r3, r4)
                if (r5 != r0) goto L35
            L34:
                return r0
            L35:
                kotlin.Unit r5 = kotlin.Unit.f17538a
                return r5
            */
            throw new UnsupportedOperationException("Method not decompiled: app.chalo.validationsdk.blevalidation.ui.BleValidationFragmentComponentAndroid$handleViewTripReceiptPostTapOutIntent$1.AnonymousClass2.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BleValidationFragmentComponentAndroid$handleViewTripReceiptPostTapOutIntent$1(BleValidationFragmentComponentAndroid bleValidationFragmentComponentAndroid, Continuation continuation) {
        super(2, continuation);
        this.this$0 = bleValidationFragmentComponentAndroid;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new BleValidationFragmentComponentAndroid$handleViewTripReceiptPostTapOutIntent$1(this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((BleValidationFragmentComponentAndroid$handleViewTripReceiptPostTapOutIntent$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f17538a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            ResultKt.b(obj);
            BleValidationFragmentComponentAndroid bleValidationFragmentComponentAndroid = this.this$0;
            ProductValidationAnalyticManager productValidationAnalyticManager = bleValidationFragmentComponentAndroid.J;
            BleValidationMetaData bleValidationMetaData = ((BleValidationState) bleValidationFragmentComponentAndroid.f.getValue()).j;
            ProductValidationData productValidationData = bleValidationMetaData != null ? bleValidationMetaData.b : null;
            if (productValidationAnalyticManager != null && productValidationData != null) {
                Source source = Source.BLE_VALIDATION_ACTIVITY;
                this.label = 1;
                if (productValidationAnalyticManager.m(productValidationData, true, source, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(obj);
        }
        BleValidationFragmentComponentAndroid bleValidationFragmentComponentAndroid2 = this.this$0;
        BuildersKt.d(bleValidationFragmentComponentAndroid2.j, null, null, new AnonymousClass2(bleValidationFragmentComponentAndroid2, null), 3);
        return Unit.f17538a;
    }
}
