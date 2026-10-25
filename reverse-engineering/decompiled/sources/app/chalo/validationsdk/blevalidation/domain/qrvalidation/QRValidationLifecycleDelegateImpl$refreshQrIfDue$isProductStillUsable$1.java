package app.chalo.validationsdk.blevalidation.domain.qrvalidation;

import app.chalo.validationsdk.blevalidation.data.models.ProductValidationData;
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
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "app.chalo.validationsdk.blevalidation.domain.qrvalidation.QRValidationLifecycleDelegateImpl$refreshQrIfDue$isProductStillUsable$1", f = "QRValidationLifecycleDelegate.kt", l = {286}, m = "invokeSuspend", v = 1)
final class QRValidationLifecycleDelegateImpl$refreshQrIfDue$isProductStillUsable$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Boolean>, Object> {
    final /* synthetic */ ProductValidationData $productData;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public QRValidationLifecycleDelegateImpl$refreshQrIfDue$isProductStillUsable$1(ProductValidationData productValidationData, Continuation continuation) {
        super(2, continuation);
        this.$productData = productValidationData;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new QRValidationLifecycleDelegateImpl$refreshQrIfDue$isProductStillUsable$1(this.$productData, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((QRValidationLifecycleDelegateImpl$refreshQrIfDue$isProductStillUsable$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f17538a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(obj);
            return obj;
        }
        ResultKt.b(obj);
        ProductValidationData productValidationData = this.$productData;
        this.label = 1;
        Object objC = productValidationData.C(this);
        return objC == coroutineSingletons ? coroutineSingletons : objC;
    }
}
