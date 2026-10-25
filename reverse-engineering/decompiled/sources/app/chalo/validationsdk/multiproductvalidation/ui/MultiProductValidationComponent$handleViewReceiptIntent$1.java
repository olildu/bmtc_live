package app.chalo.validationsdk.multiproductvalidation.ui;

import app.chalo.validationsdk.blevalidation.config.ChildValidationDelegate;
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
@DebugMetadata(c = "app.chalo.validationsdk.multiproductvalidation.ui.MultiProductValidationComponent$handleViewReceiptIntent$1", f = "MultiProductValidationComponent.kt", l = {446, 447}, m = "invokeSuspend", v = 1)
final class MultiProductValidationComponent$handleViewReceiptIntent$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ ChildValidationDelegate $delegate;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MultiProductValidationComponent$handleViewReceiptIntent$1(ChildValidationDelegate childValidationDelegate, Continuation continuation) {
        super(2, continuation);
        this.$delegate = childValidationDelegate;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new MultiProductValidationComponent$handleViewReceiptIntent$1(this.$delegate, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((MultiProductValidationComponent$handleViewReceiptIntent$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f17538a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0051, code lost:
    
        if (app.chalo.validationsdk.blevalidation.config.ProductValidationNavigationManager.DefaultImpls.a(r3, r4, r5, null, null, r10, 28) == r0) goto L15;
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
            goto L54
        L10:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r0)
            throw r11
        L18:
            kotlin.ResultKt.b(r11)
            goto L34
        L1c:
            kotlin.ResultKt.b(r11)
            app.chalo.validationsdk.blevalidation.config.ChildValidationDelegate r11 = r10.$delegate
            app.chalo.validationsdk.blevalidation.data.models.ProductValidationConfig r11 = r11.c
            app.chalo.validationsdk.blevalidation.config.ProductValidationAnalyticManager r11 = r11.getB()
            app.chalo.validationsdk.blevalidation.config.ChildValidationDelegate r1 = r10.$delegate
            app.chalo.validationsdk.blevalidation.data.models.ProductValidationData r1 = r1.b
            r10.label = r3
            java.lang.Object r11 = r11.h(r1, r10)
            if (r11 != r0) goto L34
            goto L53
        L34:
            app.chalo.validationsdk.blevalidation.config.ChildValidationDelegate r11 = r10.$delegate
            app.chalo.validationsdk.blevalidation.data.models.ProductValidationConfig r11 = r11.c
            app.chalo.validationsdk.blevalidation.config.ProductValidationNavigationManager r3 = r11.getC()
            app.chalo.validationsdk.blevalidation.config.ChildValidationDelegate r11 = r10.$delegate
            app.chalo.validationsdk.blevalidation.data.models.ProductValidationData r4 = r11.b
            app.chalo.constants.Source r11 = app.chalo.constants.Source.MULTI_PRODUCT_VALIDATION_SCREEN
            java.lang.String r5 = r11.getSourceName()
            r10.label = r2
            r6 = 0
            r7 = 0
            r9 = 28
            r8 = r10
            java.lang.Object r11 = app.chalo.validationsdk.blevalidation.config.ProductValidationNavigationManager.DefaultImpls.a(r3, r4, r5, r6, r7, r8, r9)
            if (r11 != r0) goto L54
        L53:
            return r0
        L54:
            kotlin.Unit r11 = kotlin.Unit.f17538a
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: app.chalo.validationsdk.multiproductvalidation.ui.MultiProductValidationComponent$handleViewReceiptIntent$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
