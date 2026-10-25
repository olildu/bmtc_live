package app.chalo.validationsdk.blevalidation.ui;

import app.chalo.constants.Source;
import app.chalo.usecase.GetRideFeedbackDataUseCase;
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
@DebugMetadata(c = "app.chalo.validationsdk.blevalidation.ui.BleValidationFragmentComponentAndroid$handleConductorValidationExitBtnClickedPostValidationIntent$1", f = "BleValidationFragmentComponent.android.kt", l = {723}, m = "invokeSuspend", v = 1)
final class BleValidationFragmentComponentAndroid$handleConductorValidationExitBtnClickedPostValidationIntent$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ BleValidationFragmentComponentAndroid this$0;

    /* JADX INFO: renamed from: app.chalo.validationsdk.blevalidation.ui.BleValidationFragmentComponentAndroid$handleConductorValidationExitBtnClickedPostValidationIntent$1$2, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "app.chalo.validationsdk.blevalidation.ui.BleValidationFragmentComponentAndroid$handleConductorValidationExitBtnClickedPostValidationIntent$1$2", f = "BleValidationFragmentComponent.android.kt", l = {730}, m = "invokeSuspend", v = 1)
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

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            Unit unit = Unit.f17538a;
            if (i != 0) {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.b(obj);
                return unit;
            }
            ResultKt.b(obj);
            BleValidationFragmentComponentAndroid bleValidationFragmentComponentAndroid = this.this$0;
            GetRideFeedbackDataUseCase.FeedbackFilter feedbackFilter = GetRideFeedbackDataUseCase.FeedbackFilter.CONDUCTOR_VALIDATION;
            this.label = 1;
            BuildersKt.d(bleValidationFragmentComponentAndroid.j, null, null, new BleValidationFragmentComponentAndroid$collectRideFeedbackIfReqOrNavigateToHomeScreen$2(feedbackFilter, bleValidationFragmentComponentAndroid, null), 3);
            return unit == coroutineSingletons ? coroutineSingletons : unit;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BleValidationFragmentComponentAndroid$handleConductorValidationExitBtnClickedPostValidationIntent$1(BleValidationFragmentComponentAndroid bleValidationFragmentComponentAndroid, Continuation continuation) {
        super(2, continuation);
        this.this$0 = bleValidationFragmentComponentAndroid;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new BleValidationFragmentComponentAndroid$handleConductorValidationExitBtnClickedPostValidationIntent$1(this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((BleValidationFragmentComponentAndroid$handleConductorValidationExitBtnClickedPostValidationIntent$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f17538a);
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
                if (productValidationAnalyticManager.H(productValidationData, false, source, this) == coroutineSingletons) {
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
