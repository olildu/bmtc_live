package app.chalo.validationsdk.blevalidation.ui.qrvalidation;

import app.chalo.validationsdk.blevalidation.data.models.ProductValidationData;
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
@DebugMetadata(c = "app.chalo.validationsdk.blevalidation.ui.qrvalidation.QRValidationComponent$convertToUiState$13$1", f = "QRValidationComponent.kt", l = {991, 997}, m = "invokeSuspend", v = 1)
final class QRValidationComponent$convertToUiState$13$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ ProductValidationData $productValidationData;
    int label;
    final /* synthetic */ QRValidationComponent this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public QRValidationComponent$convertToUiState$13$1(ProductValidationData productValidationData, QRValidationComponent qRValidationComponent, Continuation continuation) {
        super(2, continuation);
        this.$productValidationData = productValidationData;
        this.this$0 = qRValidationComponent;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new QRValidationComponent$convertToUiState$13$1(this.$productValidationData, this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((QRValidationComponent$convertToUiState$13$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f17538a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x006a, code lost:
    
        if (r11.e(r1, r3, r4, r10) == r0) goto L18;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r11) {
        /*
            r10 = this;
            kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r1 = r10.label
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L1d
            if (r1 == r3) goto L19
            if (r1 != r2) goto L11
            kotlin.ResultKt.b(r11)
            r8 = r10
            goto L6d
        L11:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r0)
            throw r11
        L19:
            kotlin.ResultKt.b(r11)
            goto L40
        L1d:
            kotlin.ResultKt.b(r11)
            app.chalo.validationsdk.blevalidation.data.models.ProductValidationData r5 = r10.$productValidationData
            if (r5 == 0) goto L40
            app.chalo.validationsdk.blevalidation.ui.qrvalidation.QRValidationComponent r11 = r10.this$0
            app.chalo.validationsdk.blevalidation.config.ProductValidationAnalyticManager r11 = r11.P0()
            app.chalo.constants.Source r1 = app.chalo.constants.Source.QR_VALIDATION_FRAGMENT
            java.lang.String r6 = r1.getSourceName()
            r10.label = r3
            java.lang.String r4 = "activation duration expired dialog view summary clicked"
            r7 = 0
            r9 = 24
            r8 = r10
            r3 = r11
            java.lang.Object r11 = app.chalo.validationsdk.blevalidation.config.ProductValidationAnalyticManager.DefaultImpls.a(r3, r4, r5, r6, r7, r8, r9)
            if (r11 != r0) goto L41
            goto L6c
        L40:
            r8 = r10
        L41:
            app.chalo.validationsdk.blevalidation.ui.qrvalidation.QRValidationComponent r11 = r8.this$0
            app.chalo.validationsdk.blevalidation.data.models.ProductValidationConfig r11 = r11.Q0()
            app.chalo.validationsdk.blevalidation.config.ProductValidationNavigationManager r11 = r11.getC()
            app.chalo.validationsdk.blevalidation.ui.qrvalidation.QRValidationComponent r1 = r8.this$0
            kotlin.Lazy r1 = r1.G
            java.lang.Object r1 = r1.getValue()
            app.chalo.validationsdk.legacy.Product r1 = (app.chalo.validationsdk.legacy.Product) r1
            app.chalo.constants.Source r3 = app.chalo.constants.Source.QR_VALIDATION_FRAGMENT
            java.lang.String r3 = r3.getSourceName()
            app.chalo.scenes.PopUpToConfig$Finish r4 = new app.chalo.scenes.PopUpToConfig$Finish
            app.chalo.validationsdk.blevalidation.ui.qrvalidation.QRValidationComponent r5 = r8.this$0
            app.chalo.scenes.args.ValidationArgs$QrValidationScreenArgs r5 = r5.k
            r4.<init>(r5)
            r8.label = r2
            java.lang.Object r11 = r11.e(r1, r3, r4, r10)
            if (r11 != r0) goto L6d
        L6c:
            return r0
        L6d:
            app.chalo.validationsdk.blevalidation.ui.qrvalidation.QRValidationComponent r11 = r8.this$0
            kz0 r0 = new kz0
            r1 = 7
            r0.<init>(r1)
            r11.E0(r0)
            kotlin.Unit r11 = kotlin.Unit.f17538a
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: app.chalo.validationsdk.blevalidation.ui.qrvalidation.QRValidationComponent$convertToUiState$13$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
