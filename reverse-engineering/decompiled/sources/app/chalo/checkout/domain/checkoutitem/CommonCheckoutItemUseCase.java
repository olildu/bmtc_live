package app.chalo.checkout.domain.checkoutitem;

import app.chalo.checkout.domain.provider.ICheckoutItemsProvider;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/checkout/domain/checkoutitem/CommonCheckoutItemUseCase;", "", "checkout_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class CommonCheckoutItemUseCase {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ICheckoutItemsProvider f1389a;

    public CommonCheckoutItemUseCase(ICheckoutItemsProvider iCheckoutItemsProvider) {
        this.f1389a = iCheckoutItemsProvider;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x005d, code lost:
    
        if (r8 == r1) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x007b, code lost:
    
        if (r8 == r1) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0099, code lost:
    
        if (r8 == r1) goto L36;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(app.chalo.checkout.data.model.app.PaymentInstrumentAppModel r7, kotlin.coroutines.jvm.internal.ContinuationImpl r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof app.chalo.checkout.domain.checkoutitem.CommonCheckoutItemUseCase$invoke$1
            if (r0 == 0) goto L13
            r0 = r8
            app.chalo.checkout.domain.checkoutitem.CommonCheckoutItemUseCase$invoke$1 r0 = (app.chalo.checkout.domain.checkoutitem.CommonCheckoutItemUseCase$invoke$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            app.chalo.checkout.domain.checkoutitem.CommonCheckoutItemUseCase$invoke$1 r0 = new app.chalo.checkout.domain.checkoutitem.CommonCheckoutItemUseCase$invoke$1
            r0.<init>(r6, r8)
        L18:
            java.lang.Object r8 = r0.result
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r2 = r0.label
            r3 = 3
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L49
            if (r2 == r5) goto L41
            if (r2 == r4) goto L39
            if (r2 != r3) goto L31
            java.lang.Object r7 = r0.L$0
            app.chalo.checkout.data.model.app.PaymentInstrumentAppModel r7 = (app.chalo.checkout.data.model.app.PaymentInstrumentAppModel) r7
            kotlin.ResultKt.b(r8)
            goto L9c
        L31:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L39:
            java.lang.Object r7 = r0.L$0
            app.chalo.checkout.data.model.app.PaymentInstrumentAppModel r7 = (app.chalo.checkout.data.model.app.PaymentInstrumentAppModel) r7
            kotlin.ResultKt.b(r8)
            goto L7e
        L41:
            java.lang.Object r7 = r0.L$0
            app.chalo.checkout.data.model.app.PaymentInstrumentAppModel r7 = (app.chalo.checkout.data.model.app.PaymentInstrumentAppModel) r7
            kotlin.ResultKt.b(r8)
            goto L60
        L49:
            kotlin.ResultKt.b(r8)
            boolean r8 = r7 instanceof app.chalo.checkout.data.model.app.PaymentInstrumentAppModel.UPIPaymentInstrumentAppModel
            app.chalo.checkout.domain.provider.ICheckoutItemsProvider r2 = r6.f1389a
            if (r8 == 0) goto L6c
            r8 = r7
            app.chalo.checkout.data.model.app.PaymentInstrumentAppModel$UPIPaymentInstrumentAppModel r8 = (app.chalo.checkout.data.model.app.PaymentInstrumentAppModel.UPIPaymentInstrumentAppModel) r8
            r0.L$0 = r7
            r0.label = r5
            java.lang.Object r8 = r2.b(r8, r0)
            if (r8 != r1) goto L60
            goto L9b
        L60:
            app.chalo.checkout.data.model.ui.PaymentUiItem r8 = (app.chalo.checkout.data.model.ui.PaymentUiItem) r8
            app.chalo.checkout.data.model.app.PaymentInstrumentAppModel$UPIPaymentInstrumentAppModel r7 = (app.chalo.checkout.data.model.app.PaymentInstrumentAppModel.UPIPaymentInstrumentAppModel) r7
            java.lang.String r7 = r7.d
            app.chalo.checkout.data.model.ui.CheckoutPaymentItem$IndividualCheckoutItem$UPIIntentPaymentItem r0 = new app.chalo.checkout.data.model.ui.CheckoutPaymentItem$IndividualCheckoutItem$UPIIntentPaymentItem
            r0.<init>(r8, r7)
            return r0
        L6c:
            boolean r8 = r7 instanceof app.chalo.checkout.data.model.app.PaymentInstrumentAppModel.WalletPaymentInstrumentAppModel
            if (r8 == 0) goto L8a
            r8 = r7
            app.chalo.checkout.data.model.app.PaymentInstrumentAppModel$WalletPaymentInstrumentAppModel r8 = (app.chalo.checkout.data.model.app.PaymentInstrumentAppModel.WalletPaymentInstrumentAppModel) r8
            r0.L$0 = r7
            r0.label = r4
            java.lang.Object r8 = r2.c(r8, r0)
            if (r8 != r1) goto L7e
            goto L9b
        L7e:
            app.chalo.checkout.data.model.ui.PaymentUiItem r8 = (app.chalo.checkout.data.model.ui.PaymentUiItem) r8
            app.chalo.checkout.data.model.app.PaymentInstrumentAppModel$WalletPaymentInstrumentAppModel r7 = (app.chalo.checkout.data.model.app.PaymentInstrumentAppModel.WalletPaymentInstrumentAppModel) r7
            java.lang.String r7 = r7.d
            app.chalo.checkout.data.model.ui.CheckoutPaymentItem$IndividualCheckoutItem$WalletPaymentItem r0 = new app.chalo.checkout.data.model.ui.CheckoutPaymentItem$IndividualCheckoutItem$WalletPaymentItem
            r0.<init>(r8, r7)
            return r0
        L8a:
            boolean r8 = r7 instanceof app.chalo.checkout.data.model.app.PaymentInstrumentAppModel.NetBankingPaymentInstrumentAppModel
            if (r8 == 0) goto La8
            r8 = r7
            app.chalo.checkout.data.model.app.PaymentInstrumentAppModel$NetBankingPaymentInstrumentAppModel r8 = (app.chalo.checkout.data.model.app.PaymentInstrumentAppModel.NetBankingPaymentInstrumentAppModel) r8
            r0.L$0 = r7
            r0.label = r3
            java.lang.Object r8 = r2.a(r8, r0)
            if (r8 != r1) goto L9c
        L9b:
            return r1
        L9c:
            app.chalo.checkout.data.model.ui.PaymentUiItem r8 = (app.chalo.checkout.data.model.ui.PaymentUiItem) r8
            app.chalo.checkout.data.model.app.PaymentInstrumentAppModel$NetBankingPaymentInstrumentAppModel r7 = (app.chalo.checkout.data.model.app.PaymentInstrumentAppModel.NetBankingPaymentInstrumentAppModel) r7
            java.lang.String r7 = r7.d
            app.chalo.checkout.data.model.ui.CheckoutPaymentItem$IndividualCheckoutItem$NetBankingPaymentItem r0 = new app.chalo.checkout.data.model.ui.CheckoutPaymentItem$IndividualCheckoutItem$NetBankingPaymentItem
            r0.<init>(r8, r7)
            return r0
        La8:
            kotlin.NoWhenBranchMatchedException r7 = new kotlin.NoWhenBranchMatchedException
            r7.<init>()
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: app.chalo.checkout.domain.checkoutitem.CommonCheckoutItemUseCase.a(app.chalo.checkout.data.model.app.PaymentInstrumentAppModel, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0057  */
    /* JADX WARN: Code duplicated, block: B:19:0x006b A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:20:0x006c  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:20:0x006c -> B:21:0x006d). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public final java.lang.Object b(java.util.List r6, kotlin.coroutines.jvm.internal.ContinuationImpl r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof app.chalo.checkout.domain.checkoutitem.CommonCheckoutItemUseCase$invoke$2
            if (r0 == 0) goto L13
            r0 = r7
            app.chalo.checkout.domain.checkoutitem.CommonCheckoutItemUseCase$invoke$2 r0 = (app.chalo.checkout.domain.checkoutitem.CommonCheckoutItemUseCase$invoke$2) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            app.chalo.checkout.domain.checkoutitem.CommonCheckoutItemUseCase$invoke$2 r0 = new app.chalo.checkout.domain.checkoutitem.CommonCheckoutItemUseCase$invoke$2
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.result
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L3b
            if (r2 != r3) goto L33
            java.lang.Object r6 = r0.L$2
            java.util.Collection r6 = (java.util.Collection) r6
            java.lang.Object r2 = r0.L$1
            java.util.Iterator r2 = (java.util.Iterator) r2
            java.lang.Object r4 = r0.L$0
            java.util.Collection r4 = (java.util.Collection) r4
            kotlin.ResultKt.b(r7)
            goto L6d
        L33:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L3b:
            kotlin.ResultKt.b(r7)
            java.lang.Iterable r6 = (java.lang.Iterable) r6
            java.util.ArrayList r7 = new java.util.ArrayList
            r2 = 10
            int r2 = kotlin.collections.CollectionsKt.v(r6, r2)
            r7.<init>(r2)
            java.util.Iterator r6 = r6.iterator()
            r2 = r6
            r6 = r7
        L51:
            boolean r7 = r2.hasNext()
            if (r7 == 0) goto L74
            java.lang.Object r7 = r2.next()
            app.chalo.checkout.data.model.app.PaymentInstrumentAppModel r7 = (app.chalo.checkout.data.model.app.PaymentInstrumentAppModel) r7
            r0.L$0 = r6
            r0.L$1 = r2
            r0.L$2 = r6
            r0.label = r3
            java.lang.Object r7 = r5.a(r7, r0)
            if (r7 != r1) goto L6c
            return r1
        L6c:
            r4 = r6
        L6d:
            app.chalo.checkout.data.model.ui.CheckoutPaymentItem$IndividualCheckoutItem r7 = (app.chalo.checkout.data.model.ui.CheckoutPaymentItem.IndividualCheckoutItem) r7
            r6.add(r7)
            r6 = r4
            goto L51
        L74:
            java.util.List r6 = (java.util.List) r6
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: app.chalo.checkout.domain.checkoutitem.CommonCheckoutItemUseCase.b(java.util.List, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }
}
