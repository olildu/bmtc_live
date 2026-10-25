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
@DebugMetadata(c = "app.chalo.validationsdk.blevalidation.ui.qrvalidation.QRValidationComponent$handleReportProblemIntent$1", f = "QRValidationComponent.kt", l = {469, 473}, m = "invokeSuspend", v = 1)
final class QRValidationComponent$handleReportProblemIntent$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ QRValidationComponent this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public QRValidationComponent$handleReportProblemIntent$1(QRValidationComponent qRValidationComponent, Continuation continuation) {
        super(2, continuation);
        this.this$0 = qRValidationComponent;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new QRValidationComponent$handleReportProblemIntent$1(this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((QRValidationComponent$handleReportProblemIntent$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f17538a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0085, code lost:
    
        if (r1.g(r9, r8) == r0) goto L18;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r9) {
        /*
            r8 = this;
            kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r1 = r8.label
            java.lang.String r2 = "validationProduct"
            java.lang.String r3 = "<this>"
            r4 = 2
            r5 = 1
            if (r1 == 0) goto L29
            if (r1 == r5) goto L1d
            if (r1 != r4) goto L15
            kotlin.ResultKt.b(r9)
            goto L88
        L15:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r0)
            throw r9
        L1d:
            java.lang.Object r1 = r8.L$1
            app.chalo.validationsdk.blevalidation.data.models.ProductValidationData r1 = (app.chalo.validationsdk.blevalidation.data.models.ProductValidationData) r1
            java.lang.Object r5 = r8.L$0
            app.chalo.validationsdk.blevalidation.ui.qrvalidation.QRValidationComponent r5 = (app.chalo.validationsdk.blevalidation.ui.qrvalidation.QRValidationComponent) r5
            kotlin.ResultKt.b(r9)
            goto L5e
        L29:
            kotlin.ResultKt.b(r9)
            app.chalo.validationsdk.blevalidation.ui.qrvalidation.QRValidationComponent r9 = r8.this$0
            kotlinx.coroutines.flow.StateFlow r9 = r9.f
            java.lang.Object r9 = r9.getValue()
            app.chalo.validationsdk.blevalidation.ui.qrvalidation.QRValidationDataState r9 = (app.chalo.validationsdk.blevalidation.ui.qrvalidation.QRValidationDataState) r9
            app.chalo.validationsdk.blevalidation.data.models.ProductValidationData r1 = r9.f10635a
            if (r1 == 0) goto L88
            app.chalo.validationsdk.blevalidation.ui.qrvalidation.QRValidationComponent r9 = r8.this$0
            app.chalo.validationsdk.blevalidation.config.ProductValidationConfigProvider r6 = r9.o
            app.chalo.models.validation.ValidationProduct r7 = r9.W0()
            kotlin.jvm.internal.Intrinsics.i(r6, r3)
            kotlin.jvm.internal.Intrinsics.i(r7, r2)
            app.chalo.validationsdk.blevalidation.data.models.ProductValidationConfig r6 = r6.a(r7)
            app.chalo.validationsdk.blevalidation.config.ProductValidationAnalyticManager r6 = r6.getB()
            r8.L$0 = r9
            r8.L$1 = r1
            r8.label = r5
            java.lang.Object r5 = r6.G(r1, r8)
            if (r5 != r0) goto L5d
            goto L87
        L5d:
            r5 = r9
        L5e:
            app.chalo.validationsdk.blevalidation.config.ProductValidationConfigProvider r9 = r5.o
            app.chalo.models.validation.ValidationProduct r6 = r5.W0()
            kotlin.jvm.internal.Intrinsics.i(r9, r3)
            kotlin.jvm.internal.Intrinsics.i(r6, r2)
            app.chalo.validationsdk.blevalidation.data.models.ProductValidationConfig r9 = r9.a(r6)
            app.chalo.validationsdk.blevalidation.config.ProductValidationReportProblemManager r9 = r9.getE()
            app.chalo.validationsdk.legacy.RegularBusValidationScreen r2 = app.chalo.validationsdk.legacy.RegularBusValidationScreen.QR_SCREEN
            app.chalo.features.reportproblem.ReportProblemFeatureData r9 = r9.a(r1, r2)
            app.chalo.features.reportproblem.IReportProblemFeature r1 = r5.q
            r2 = 0
            r8.L$0 = r2
            r8.L$1 = r2
            r8.label = r4
            java.lang.Object r9 = r1.g(r9, r8)
            if (r9 != r0) goto L88
        L87:
            return r0
        L88:
            kotlin.Unit r9 = kotlin.Unit.f17538a
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: app.chalo.validationsdk.blevalidation.ui.qrvalidation.QRValidationComponent$handleReportProblemIntent$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
