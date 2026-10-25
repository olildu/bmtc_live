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
@DebugMetadata(c = "app.chalo.validationsdk.blevalidation.ui.qrvalidation.QRValidationComponent$handleValidationSuccessBottomSheetNegativeBtnClicked$1", f = "QRValidationComponent.kt", l = {804, 808}, m = "invokeSuspend", v = 1)
final class QRValidationComponent$handleValidationSuccessBottomSheetNegativeBtnClicked$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ QRValidationIntent.ValidationSuccessBottomSheetNegativeBtnClicked $intent;
    int label;
    final /* synthetic */ QRValidationComponent this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public QRValidationComponent$handleValidationSuccessBottomSheetNegativeBtnClicked$1(QRValidationComponent qRValidationComponent, QRValidationIntent.ValidationSuccessBottomSheetNegativeBtnClicked validationSuccessBottomSheetNegativeBtnClicked, Continuation continuation) {
        super(2, continuation);
        this.this$0 = qRValidationComponent;
        this.$intent = validationSuccessBottomSheetNegativeBtnClicked;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new QRValidationComponent$handleValidationSuccessBottomSheetNegativeBtnClicked$1(this.this$0, this.$intent, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((QRValidationComponent$handleValidationSuccessBottomSheetNegativeBtnClicked$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f17538a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0078, code lost:
    
        if (r3.d(r4, r5, r6, r7, true, r10) == r0) goto L15;
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
            if (r1 == 0) goto L1c
            if (r1 == r3) goto L18
            if (r1 != r2) goto L10
            kotlin.ResultKt.b(r11)
            goto L7b
        L10:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r0)
            throw r11
        L18:
            kotlin.ResultKt.b(r11)
            goto L44
        L1c:
            kotlin.ResultKt.b(r11)
            app.chalo.validationsdk.blevalidation.ui.qrvalidation.QRValidationComponent r11 = r10.this$0
            kz0 r1 = new kz0
            r4 = 12
            r1.<init>(r4)
            r11.E0(r1)
            app.chalo.validationsdk.blevalidation.ui.qrvalidation.QRValidationComponent r11 = r10.this$0
            app.chalo.validationsdk.blevalidation.config.ProductValidationAnalyticManager r11 = r11.P0()
            app.chalo.validationsdk.blevalidation.ui.qrvalidation.QRValidationIntent$ValidationSuccessBottomSheetNegativeBtnClicked r1 = r10.$intent
            app.chalo.receipt.ProductReceiptData r1 = r1.f10647a
            app.chalo.constants.Source r4 = app.chalo.constants.Source.STATIC_QR_SCREEN
            java.lang.String r4 = r4.getSourceName()
            r10.label = r3
            java.lang.Object r11 = r11.u(r1, r4, r10)
            if (r11 != r0) goto L44
            goto L7a
        L44:
            app.chalo.validationsdk.blevalidation.ui.qrvalidation.QRValidationComponent r11 = r10.this$0
            app.chalo.validationsdk.blevalidation.data.models.ProductValidationConfig r11 = r11.Q0()
            app.chalo.validationsdk.blevalidation.config.ProductValidationNavigationManager r3 = r11.getC()
            app.chalo.validationsdk.blevalidation.ui.qrvalidation.QRValidationIntent$ValidationSuccessBottomSheetNegativeBtnClicked r11 = r10.$intent
            app.chalo.validationsdk.blevalidation.data.models.ProductValidationData r4 = r11.b
            app.chalo.constants.Source r11 = app.chalo.constants.Source.QR_VALIDATION_FRAGMENT
            java.lang.String r5 = r11.getSourceName()
            app.chalo.validationsdk.blevalidation.ui.qrvalidation.QRValidationComponent r11 = r10.this$0
            kotlinx.coroutines.flow.StateFlow r11 = r11.f
            java.lang.Object r11 = r11.getValue()
            app.chalo.validationsdk.blevalidation.ui.qrvalidation.QRValidationDataState r11 = (app.chalo.validationsdk.blevalidation.ui.qrvalidation.QRValidationDataState) r11
            java.lang.String r6 = r11.i
            app.chalo.validationsdk.blevalidation.ui.qrvalidation.QRValidationComponent r11 = r10.this$0
            kotlinx.coroutines.flow.StateFlow r11 = r11.f
            java.lang.Object r11 = r11.getValue()
            app.chalo.validationsdk.blevalidation.ui.qrvalidation.QRValidationDataState r11 = (app.chalo.validationsdk.blevalidation.ui.qrvalidation.QRValidationDataState) r11
            java.lang.Long r7 = r11.j
            r10.label = r2
            r8 = 1
            r9 = r10
            java.lang.Object r11 = r3.d(r4, r5, r6, r7, r8, r9)
            if (r11 != r0) goto L7b
        L7a:
            return r0
        L7b:
            kotlin.Unit r11 = kotlin.Unit.f17538a
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: app.chalo.validationsdk.blevalidation.ui.qrvalidation.QRValidationComponent$handleValidationSuccessBottomSheetNegativeBtnClicked$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
