package app.chalo.validationsdk.blevalidation.ui.qrvalidation;

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
@DebugMetadata(c = "app.chalo.validationsdk.blevalidation.ui.qrvalidation.QRValidationComponent$handleViewTripReceiptIntent$1", f = "QRValidationComponent.kt", l = {479, 480}, m = "invokeSuspend", v = 1)
final class QRValidationComponent$handleViewTripReceiptIntent$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ QRValidationComponent this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public QRValidationComponent$handleViewTripReceiptIntent$1(QRValidationComponent qRValidationComponent, Continuation continuation) {
        super(2, continuation);
        this.this$0 = qRValidationComponent;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new QRValidationComponent$handleViewTripReceiptIntent$1(this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((QRValidationComponent$handleViewTripReceiptIntent$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f17538a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x007e, code lost:
    
        if (app.chalo.validationsdk.blevalidation.config.ProductValidationNavigationManager.DefaultImpls.a(r4, r5, r6, r7, r8, r11, 16) == r0) goto L19;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r12) {
        /*
            r11 = this;
            kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r1 = r11.label
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L26
            if (r1 == r3) goto L19
            if (r1 != r2) goto L11
            kotlin.ResultKt.b(r12)
            goto L81
        L11:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r0)
            throw r12
        L19:
            java.lang.Object r1 = r11.L$1
            app.chalo.validationsdk.blevalidation.data.models.ProductValidationData r1 = (app.chalo.validationsdk.blevalidation.data.models.ProductValidationData) r1
            java.lang.Object r3 = r11.L$0
            app.chalo.validationsdk.blevalidation.ui.qrvalidation.QRValidationComponent r3 = (app.chalo.validationsdk.blevalidation.ui.qrvalidation.QRValidationComponent) r3
            kotlin.ResultKt.b(r12)
        L24:
            r5 = r1
            goto L50
        L26:
            kotlin.ResultKt.b(r12)
            app.chalo.validationsdk.blevalidation.ui.qrvalidation.QRValidationComponent r12 = r11.this$0
            kotlinx.coroutines.flow.StateFlow r12 = r12.f
            java.lang.Object r12 = r12.getValue()
            app.chalo.validationsdk.blevalidation.ui.qrvalidation.QRValidationDataState r12 = (app.chalo.validationsdk.blevalidation.ui.qrvalidation.QRValidationDataState) r12
            app.chalo.validationsdk.blevalidation.data.models.ProductValidationData r1 = r12.f10635a
            if (r1 == 0) goto L81
            app.chalo.validationsdk.blevalidation.ui.qrvalidation.QRValidationComponent r12 = r11.this$0
            app.chalo.validationsdk.blevalidation.data.models.ProductValidationConfig r4 = r12.Q0()
            app.chalo.validationsdk.blevalidation.config.ProductValidationAnalyticManager r4 = r4.getB()
            r11.L$0 = r12
            r11.L$1 = r1
            r11.label = r3
            java.lang.Object r3 = r4.h(r1, r11)
            if (r3 != r0) goto L4e
            goto L80
        L4e:
            r3 = r12
            goto L24
        L50:
            app.chalo.validationsdk.blevalidation.data.models.ProductValidationConfig r12 = r3.Q0()
            kotlinx.coroutines.flow.StateFlow r1 = r3.f
            app.chalo.validationsdk.blevalidation.config.ProductValidationNavigationManager r4 = r12.getC()
            app.chalo.constants.Source r12 = app.chalo.constants.Source.QR_VALIDATION_FRAGMENT
            java.lang.String r6 = r12.getSourceName()
            java.lang.Object r12 = r1.getValue()
            app.chalo.validationsdk.blevalidation.ui.qrvalidation.QRValidationDataState r12 = (app.chalo.validationsdk.blevalidation.ui.qrvalidation.QRValidationDataState) r12
            java.lang.String r7 = r12.i
            java.lang.Object r12 = r1.getValue()
            app.chalo.validationsdk.blevalidation.ui.qrvalidation.QRValidationDataState r12 = (app.chalo.validationsdk.blevalidation.ui.qrvalidation.QRValidationDataState) r12
            java.lang.Long r8 = r12.j
            r12 = 0
            r11.L$0 = r12
            r11.L$1 = r12
            r11.label = r2
            r10 = 16
            r9 = r11
            java.lang.Object r12 = app.chalo.validationsdk.blevalidation.config.ProductValidationNavigationManager.DefaultImpls.a(r4, r5, r6, r7, r8, r9, r10)
            if (r12 != r0) goto L81
        L80:
            return r0
        L81:
            kotlin.Unit r12 = kotlin.Unit.f17538a
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: app.chalo.validationsdk.blevalidation.ui.qrvalidation.QRValidationComponent$handleViewTripReceiptIntent$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
