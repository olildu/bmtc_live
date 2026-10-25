package app.chalo.checkout.data.repository.remote;

import app.chalo.checkout.analytics.ICheckoutAnalyticsHelper;
import app.chalo.network.NetworkManager;
import app.chalo.network.mapper.GenericNetworkExceptionMapper;
import app.chalo.providers.stringprovider.StringProvider;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lapp/chalo/checkout/data/repository/remote/CheckoutRemoteDataSource;", "Lapp/chalo/checkout/data/repository/remote/ICheckoutRemoteDataSource;", "Companion", "checkout_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class CheckoutRemoteDataSource implements ICheckoutRemoteDataSource {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final NetworkManager f1351a;
    public final StringProvider b;
    public final ICheckoutAnalyticsHelper c;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0010\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0004R\u0014\u0010\u0007\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0004R\u0014\u0010\b\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\u0004R\u0014\u0010\t\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\t\u0010\u0004R\u0014\u0010\n\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\n\u0010\u0004R\u0014\u0010\u000b\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000b\u0010\u0004R\u0014\u0010\f\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\f\u0010\u0004R\u0014\u0010\r\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\r\u0010\u0004R\u0014\u0010\u000e\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000e\u0010\u0004R\u0014\u0010\u000f\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000f\u0010\u0004R\u0014\u0010\u0010\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0010\u0010\u0004R\u0014\u0010\u0011\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0011\u0010\u0004¨\u0006\u0012"}, d2 = {"Lapp/chalo/checkout/data/repository/remote/CheckoutRemoteDataSource$Companion;", "", "", "VERSION_KEY", "Ljava/lang/String;", "CITY_KEY", "AGENCY_KEY", "PRODUCT_TYPE", "ORDER_ID", "CHALO_ORDER_ID", "USER_ID", "PAYMENT_METHODS_ENDPOINT", "ORDER_STATUS_ENDPOINT", "PAYMENT_STATUS_ENDPOINT", "LAZY_PAY_ENDPOINT", "CREATE_CHALO_PAY_ORDER_ENDPOINT", "CHALO_PAY_PAYMENT_ENDPOINT", "CLOSED_LOOP_WALLET_PAYMENT_ENDPOINT", "checkout_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
    }

    public CheckoutRemoteDataSource(NetworkManager networkManager, GenericNetworkExceptionMapper genericNetworkExceptionMapper, StringProvider stringProvider, ICheckoutAnalyticsHelper iCheckoutAnalyticsHelper) {
        this.f1351a = networkManager;
        this.b = stringProvider;
        this.c = iCheckoutAnalyticsHelper;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00b5, code lost:
    
        if (r8 == r1) goto L33;
     */
    @Override // app.chalo.checkout.data.repository.remote.ICheckoutRemoteDataSource
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(java.util.Map r7, kotlin.coroutines.jvm.internal.ContinuationImpl r8) throws java.lang.Exception {
        /*
            r6 = this;
            boolean r0 = r8 instanceof app.chalo.checkout.data.repository.remote.CheckoutRemoteDataSource$getOrderStatus$1
            if (r0 == 0) goto L13
            r0 = r8
            app.chalo.checkout.data.repository.remote.CheckoutRemoteDataSource$getOrderStatus$1 r0 = (app.chalo.checkout.data.repository.remote.CheckoutRemoteDataSource$getOrderStatus$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            app.chalo.checkout.data.repository.remote.CheckoutRemoteDataSource$getOrderStatus$1 r0 = new app.chalo.checkout.data.repository.remote.CheckoutRemoteDataSource$getOrderStatus$1
            r0.<init>(r6, r8)
        L18:
            java.lang.Object r8 = r0.result
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r2 = r0.label
            r3 = 0
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L3c
            if (r2 == r5) goto L38
            if (r2 == r4) goto L2f
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L2f:
            java.lang.Object r7 = r0.L$0
            app.chalo.network.rest.response.NetworkResponse r7 = (app.chalo.network.rest.response.NetworkResponse) r7
            kotlin.ResultKt.b(r8)
            goto Lb8
        L38:
            kotlin.ResultKt.b(r8)
            goto L63
        L3c:
            kotlin.ResultKt.b(r8)
            app.chalo.network.NetworkManager r8 = r6.f1351a
            app.chalo.network.rest.request.NetworkRequestBuilder r8 = r8.d()
            java.lang.String r2 = "paymentmanager/v2/order/status"
            r8.j(r2)
            app.chalo.network.rest.request.HttpRequestType r2 = app.chalo.network.rest.request.HttpRequestType.POST
            r8.f(r2)
            r8.h(r7)
            r8.b()
            app.chalo.network.rest.request.ChaloRequest r7 = r8.e()
            r0.label = r5
            java.lang.Object r8 = r7.c(r0)
            if (r8 != r1) goto L63
            goto Lb7
        L63:
            r7 = r8
            app.chalo.network.rest.response.NetworkResponse r7 = (app.chalo.network.rest.response.NetworkResponse) r7
            boolean r8 = r7.f6522a
            java.lang.String r2 = r7.c
            if (r8 == 0) goto La6
            kotlinx.serialization.json.Json r8 = app.chalo.network.config.ChaloJson.b
            app.chalo.network.exception.NetworkSuccessResponseParseException r0 = new app.chalo.network.exception.NetworkSuccessResponseParseException
            java.lang.String r1 = "Response json is either null or empty"
            r0.<init>(r1)
            if (r2 == 0) goto La0
            r8.getClass()     // Catch: java.lang.Exception -> L8b
            app.chalo.checkout.data.model.api.response.OrderStatusResponseAPIModel$Companion r1 = app.chalo.checkout.data.model.api.response.OrderStatusResponseAPIModel.INSTANCE     // Catch: java.lang.Exception -> L8b
            kotlinx.serialization.KSerializer r1 = r1.serializer()     // Catch: java.lang.Exception -> L8b
            kotlinx.serialization.KSerializer r1 = kotlinx.serialization.builtins.BuiltinSerializersKt.c(r1)     // Catch: java.lang.Exception -> L8b
            kotlinx.serialization.DeserializationStrategy r1 = (kotlinx.serialization.DeserializationStrategy) r1     // Catch: java.lang.Exception -> L8b
            java.lang.Object r3 = r8.b(r2, r1)     // Catch: java.lang.Exception -> L8b
            goto La0
        L8b:
            r8 = move-exception
            app.chalo.network.exception.NetworkSuccessResponseParseException r0 = new app.chalo.network.exception.NetworkSuccessResponseParseException
            java.lang.String r8 = r8.getMessage()
            java.lang.Class<app.chalo.checkout.data.model.api.response.OrderStatusResponseAPIModel> r1 = app.chalo.checkout.data.model.api.response.OrderStatusResponseAPIModel.class
            java.lang.String r8 = defpackage.t8.g(r1, r8, r2)
            r0.<init>(r8)
            app.chalo.network.NetworkCrashlyticsLogger r7 = r7.g
            r7.b(r0)
        La0:
            if (r3 == 0) goto La5
            app.chalo.checkout.data.model.api.response.OrderStatusResponseAPIModel r3 = (app.chalo.checkout.data.model.api.response.OrderStatusResponseAPIModel) r3
            return r3
        La5:
            throw r0
        La6:
            app.chalo.providers.stringprovider.StringEnum r8 = app.chalo.providers.stringprovider.StringEnum.SOMETHING_WENT_WRONG
            r2 = 0
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r0.L$0 = r7
            r0.label = r4
            app.chalo.providers.stringprovider.StringProvider r4 = r6.b
            java.lang.Object r8 = r4.b(r8, r2, r0)
            if (r8 != r1) goto Lb8
        Lb7:
            return r1
        Lb8:
            java.lang.String r8 = (java.lang.String) r8
            k2 r0 = new k2
            r1 = 15
            r0.<init>(r8, r1)
            java.lang.Exception r7 = app.chalo.network.mapper.GenericNetworkExceptionMapper.a(r7, r3, r0)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: app.chalo.checkout.data.repository.remote.CheckoutRemoteDataSource.a(java.util.Map, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00c6, code lost:
    
        if (r9 == r1) goto L33;
     */
    @Override // app.chalo.checkout.data.repository.remote.ICheckoutRemoteDataSource
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(app.chalo.checkout.data.model.api.request.ChaloPayOrderRequestApiModel r8, kotlin.coroutines.jvm.internal.ContinuationImpl r9) throws java.lang.Exception {
        /*
            Method dump skipped, instruction units count: 215
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: app.chalo.checkout.data.repository.remote.CheckoutRemoteDataSource.b(app.chalo.checkout.data.model.api.request.ChaloPayOrderRequestApiModel, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00c6, code lost:
    
        if (r9 == r1) goto L33;
     */
    @Override // app.chalo.checkout.data.repository.remote.ICheckoutRemoteDataSource
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(app.chalo.checkout.data.model.api.request.LazyPayRequestApiModel r8, kotlin.coroutines.jvm.internal.ContinuationImpl r9) throws java.lang.Exception {
        /*
            Method dump skipped, instruction units count: 215
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: app.chalo.checkout.data.repository.remote.CheckoutRemoteDataSource.c(app.chalo.checkout.data.model.api.request.LazyPayRequestApiModel, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00df, code lost:
    
        if (r12 == r1) goto L33;
     */
    @Override // app.chalo.checkout.data.repository.remote.ICheckoutRemoteDataSource
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d(java.util.Map r11, kotlin.coroutines.jvm.internal.ContinuationImpl r12) throws java.lang.Exception {
        /*
            Method dump skipped, instruction units count: 240
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: app.chalo.checkout.data.repository.remote.CheckoutRemoteDataSource.d(java.util.Map, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00c6, code lost:
    
        if (r9 == r1) goto L33;
     */
    @Override // app.chalo.checkout.data.repository.remote.ICheckoutRemoteDataSource
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object e(app.chalo.checkout.data.model.api.request.ChaloPayPaymentRequestApiModel r8, kotlin.coroutines.jvm.internal.ContinuationImpl r9) throws java.lang.Exception {
        /*
            Method dump skipped, instruction units count: 215
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: app.chalo.checkout.data.repository.remote.CheckoutRemoteDataSource.e(app.chalo.checkout.data.model.api.request.ChaloPayPaymentRequestApiModel, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00c6, code lost:
    
        if (r9 == r1) goto L33;
     */
    @Override // app.chalo.checkout.data.repository.remote.ICheckoutRemoteDataSource
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object f(app.chalo.checkout.data.model.api.request.PaymentStatusRequestApiModel r8, kotlin.coroutines.jvm.internal.ContinuationImpl r9) throws java.lang.Exception {
        /*
            Method dump skipped, instruction units count: 215
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: app.chalo.checkout.data.repository.remote.CheckoutRemoteDataSource.f(app.chalo.checkout.data.model.api.request.PaymentStatusRequestApiModel, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00c6, code lost:
    
        if (r9 == r1) goto L33;
     */
    @Override // app.chalo.checkout.data.repository.remote.ICheckoutRemoteDataSource
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object g(app.chalo.checkout.data.model.api.request.ClosedLoopWalletPaymentRequestApiModel r8, kotlin.coroutines.jvm.internal.ContinuationImpl r9) throws java.lang.Exception {
        /*
            Method dump skipped, instruction units count: 215
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: app.chalo.checkout.data.repository.remote.CheckoutRemoteDataSource.g(app.chalo.checkout.data.model.api.request.ClosedLoopWalletPaymentRequestApiModel, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }
}
