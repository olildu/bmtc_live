package app.chalo.validationsdk.blevalidation.ui;

import app.chalo.constants.Source;
import app.chalo.models.validation.ValidationProduct;
import app.chalo.validationsdk.blevalidation.config.ProductValidationAnalyticManager;
import app.chalo.validationsdk.blevalidation.helper.BleValidationPrerequisitesStateHelper;
import app.chalo.validationsdk.legacy.Product;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "app.chalo.validationsdk.blevalidation.ui.BleValidationFragmentComponentAndroid$handleBlePermissionsUpdatedIntent$1", f = "BleValidationFragmentComponent.android.kt", l = {488}, m = "invokeSuspend", v = 1)
final class BleValidationFragmentComponentAndroid$handleBlePermissionsUpdatedIntent$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ boolean $arePermissionsGranted;
    int label;
    final /* synthetic */ BleValidationFragmentComponentAndroid this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BleValidationFragmentComponentAndroid$handleBlePermissionsUpdatedIntent$1(BleValidationFragmentComponentAndroid bleValidationFragmentComponentAndroid, boolean z, Continuation continuation) {
        super(2, continuation);
        this.this$0 = bleValidationFragmentComponentAndroid;
        this.$arePermissionsGranted = z;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new BleValidationFragmentComponentAndroid$handleBlePermissionsUpdatedIntent$1(this.this$0, this.$arePermissionsGranted, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((BleValidationFragmentComponentAndroid$handleBlePermissionsUpdatedIntent$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f17538a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            ResultKt.b(obj);
            BleValidationMetaData bleValidationMetaData = ((BleValidationState) this.this$0.f.getValue()).j;
            Product product = bleValidationMetaData != null ? bleValidationMetaData.c : null;
            BleValidationMetaData bleValidationMetaData2 = ((BleValidationState) this.this$0.f.getValue()).j;
            ValidationProduct validationProduct = bleValidationMetaData2 != null ? bleValidationMetaData2.d.b : null;
            BleValidationFragmentComponentAndroid bleValidationFragmentComponentAndroid = this.this$0;
            boolean z = this.$arePermissionsGranted;
            if (product != null && validationProduct != null) {
                ProductValidationAnalyticManager productValidationAnalyticManager = bleValidationFragmentComponentAndroid.J;
                if (productValidationAnalyticManager != null) {
                    productValidationAnalyticManager.i(z, product, Source.BLE_VALIDATION_ACTIVITY.getSourceName());
                }
                BleValidationPrerequisitesStateHelper bleValidationPrerequisitesStateHelper = bleValidationFragmentComponentAndroid.m;
                this.label = 1;
                if (bleValidationPrerequisitesStateHelper.h(validationProduct, this) == coroutineSingletons) {
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
