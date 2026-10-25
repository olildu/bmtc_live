package app.chalo.quickpay.validation;

import app.chalo.validationsdk.blevalidation.data.models.ProductValidationData;
import app.chalo.validationsdk.legacy.Product;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "Lapp/chalo/validationsdk/blevalidation/data/models/ProductValidationData;", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "app.chalo.quickpay.validation.QuickPayTicketProductValidationConfig$getProductData$2", f = "QuickPayTicketProductValidationConfig.kt", l = {54, 55, 60}, m = "invokeSuspend", v = 1)
final class QuickPayTicketProductValidationConfig$getProductData$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super ProductValidationData>, Object> {
    final /* synthetic */ Product $product;
    Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ QuickPayTicketProductValidationConfig this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public QuickPayTicketProductValidationConfig$getProductData$2(QuickPayTicketProductValidationConfig quickPayTicketProductValidationConfig, Product product, Continuation continuation) {
        super(2, continuation);
        this.this$0 = quickPayTicketProductValidationConfig;
        this.$product = product;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new QuickPayTicketProductValidationConfig$getProductData$2(this.this$0, this.$product, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((QuickPayTicketProductValidationConfig$getProductData$2) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f17538a);
    }

    /* JADX WARN: Code duplicated, block: B:27:0x0073  */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0051, code lost:
    
        if (r6 == r0) goto L26;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r6) {
        /*
            r5 = this;
            kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r1 = r5.label
            r2 = 3
            r3 = 2
            r4 = 1
            if (r1 == 0) goto L2b
            if (r1 == r4) goto L27
            if (r1 == r3) goto L23
            if (r1 != r2) goto L1b
            java.lang.Object r0 = r5.L$1
            app.chalo.walletframework.wallet.data.model.WalletTypeIdentifier r0 = (app.chalo.walletframework.wallet.data.model.WalletTypeIdentifier) r0
            java.lang.Object r1 = r5.L$0
            app.chalo.walletframework.quickpay.data.model.appmodel.QuickPayAppModel r1 = (app.chalo.walletframework.quickpay.data.model.appmodel.QuickPayAppModel) r1
            kotlin.ResultKt.b(r6)
            goto L76
        L1b:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L23:
            kotlin.ResultKt.b(r6)
            goto L54
        L27:
            kotlin.ResultKt.b(r6)
            goto L41
        L2b:
            kotlin.ResultKt.b(r6)
            app.chalo.quickpay.validation.QuickPayTicketProductValidationConfig r6 = r5.this$0
            app.chalo.walletframework.quickpay.data.repository.QuickPayRepository r6 = r6.f
            app.chalo.validationsdk.legacy.Product r1 = r5.$product
            java.lang.String r1 = r1.f10666a
            r5.label = r4
            java.lang.String r4 = ""
            java.lang.Object r6 = r6.p(r1, r4, r5)
            if (r6 != r0) goto L41
            goto L72
        L41:
            app.chalo.walletframework.quickpay.data.model.appmodel.WalletScopedQuickPay r6 = (app.chalo.walletframework.quickpay.data.model.appmodel.WalletScopedQuickPay) r6
            if (r6 != 0) goto L5a
            app.chalo.quickpay.validation.QuickPayTicketProductValidationConfig r6 = r5.this$0
            app.chalo.validationsdk.legacy.Product r1 = r5.$product
            java.lang.String r1 = r1.f10666a
            r5.label = r3
            java.lang.Object r6 = app.chalo.quickpay.validation.QuickPayTicketProductValidationConfig.o(r6, r1, r5)
            if (r6 != r0) goto L54
            goto L72
        L54:
            app.chalo.walletframework.quickpay.data.model.appmodel.WalletScopedQuickPay r6 = (app.chalo.walletframework.quickpay.data.model.appmodel.WalletScopedQuickPay) r6
            if (r6 != 0) goto L5a
            r6 = 0
            return r6
        L5a:
            app.chalo.walletframework.wallet.data.model.appmodel.WalletAppModel r1 = r6.b
            app.chalo.walletframework.wallet.data.model.WalletTypeIdentifier r1 = app.chalo.walletframework.wallet.data.model.WalletTypeIdentifier.Companion.b(r1)
            app.chalo.walletframework.quickpay.data.model.appmodel.QuickPayAppModel r6 = r6.f10920a
            app.chalo.quickpay.validation.QuickPayTicketProductValidationConfig r3 = r5.this$0
            app.chalo.walletframework.wallet.domain.ResolveQuickPayProductNameUseCase r3 = r3.i
            r5.L$0 = r6
            r5.L$1 = r1
            r5.label = r2
            java.lang.Object r2 = r3.b(r1, r5)
            if (r2 != r0) goto L73
        L72:
            return r0
        L73:
            r0 = r1
            r1 = r6
            r6 = r2
        L76:
            java.lang.String r6 = (java.lang.String) r6
            app.chalo.quickpay.validation.manager.QuickPayValidationModel r6 = app.chalo.quickpay.validation.manager.QuickPayValidationModelKt.a(r1, r0, r6)
            app.chalo.quickpay.validation.QuickPayTicketProductValidationConfig r0 = r5.this$0
            app.chalo.validationsdk.blevalidation.data.models.ProductValidationData r0 = r0.e
            r0.m(r6)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: app.chalo.quickpay.validation.QuickPayTicketProductValidationConfig$getProductData$2.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
