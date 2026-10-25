package app.chalo.validationsdk.blevalidation.ui.qrvalidation;

import app.chalo.constants.Source;
import app.chalo.validationsdk.blevalidation.config.ProductValidationAnalyticManager;
import app.chalo.validationsdk.blevalidation.data.models.ProductValidationData;
import defpackage.kz0;
import defpackage.mz0;
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
@DebugMetadata(c = "app.chalo.validationsdk.blevalidation.ui.qrvalidation.QRValidationComponent$convertToUiState$12$1", f = "QRValidationComponent.kt", l = {965}, m = "invokeSuspend", v = 1)
final class QRValidationComponent$convertToUiState$12$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ ProductValidationData $productValidationData;
    int label;
    final /* synthetic */ QRValidationComponent this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public QRValidationComponent$convertToUiState$12$1(ProductValidationData productValidationData, QRValidationComponent qRValidationComponent, Continuation continuation) {
        super(2, continuation);
        this.$productValidationData = productValidationData;
        this.this$0 = qRValidationComponent;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new QRValidationComponent$convertToUiState$12$1(this.$productValidationData, this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((QRValidationComponent$convertToUiState$12$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f17538a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        QRValidationComponent$convertToUiState$12$1 qRValidationComponent$convertToUiState$12$1;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            ResultKt.b(obj);
            ProductValidationData productValidationData = this.$productValidationData;
            if (productValidationData != null) {
                ProductValidationAnalyticManager productValidationAnalyticManagerP0 = this.this$0.P0();
                String sourceName = Source.QR_VALIDATION_FRAGMENT.getSourceName();
                this.label = 1;
                qRValidationComponent$convertToUiState$12$1 = this;
                if (ProductValidationAnalyticManager.DefaultImpls.a(productValidationAnalyticManagerP0, "activation duration expired dialog ok clicked", productValidationData, sourceName, null, qRValidationComponent$convertToUiState$12$1, 24) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            }
            QRValidationComponent qRValidationComponent = qRValidationComponent$convertToUiState$12$1.this$0;
            qRValidationComponent.q0(new mz0(qRValidationComponent, 19));
            qRValidationComponent$convertToUiState$12$1.this$0.E0(new kz0(6));
            return Unit.f17538a;
        }
        if (i != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.b(obj);
        qRValidationComponent$convertToUiState$12$1 = this;
        QRValidationComponent qRValidationComponent2 = qRValidationComponent$convertToUiState$12$1.this$0;
        qRValidationComponent2.q0(new mz0(qRValidationComponent2, 19));
        qRValidationComponent$convertToUiState$12$1.this$0.E0(new kz0(6));
        return Unit.f17538a;
    }
}
