package app.chalo.walletframework.quickpay.data.remote;

import app.chalo.network.NetworkManager;
import app.chalo.network.config.ChaloJson;
import app.chalo.network.exception.NetworkSuccessResponseParseException;
import app.chalo.network.rest.request.ChaloRequest;
import app.chalo.network.rest.request.HttpRequestType;
import app.chalo.network.rest.request.NetworkRequestBuilder;
import app.chalo.network.rest.response.NetworkResponse;
import app.chalo.walletframework.quickpay.data.exception.QuickPayReceiptFetchFailedException;
import app.chalo.walletframework.quickpay.data.mapper.NetworkResponseToQuickPayReceiptFetchFailedExceptionMapper;
import app.chalo.walletframework.quickpay.data.model.apimodel.QuickPayReceiptResponseModel;
import defpackage.t8;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.text.StringsKt;
import kotlinx.serialization.builtins.BuiltinSerializersKt;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.json.Json;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lapp/chalo/walletframework/quickpay/data/remote/QuickPayRemoteDataSourceImpl;", "Lapp/chalo/walletframework/quickpay/data/remote/QuickPayRemoteDataSource;", "Companion", "framework-wallet_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class QuickPayRemoteDataSourceImpl implements QuickPayRemoteDataSource {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final NetworkManager f10921a;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0004R\u0014\u0010\u0007\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0004¨\u0006\b"}, d2 = {"Lapp/chalo/walletframework/quickpay/data/remote/QuickPayRemoteDataSourceImpl$Companion;", "", "", "QUICK_PAY_RECEIPTS_SUB_URL", "Ljava/lang/String;", "QUICK_PAY_RECEIPT_TXNID_SUB_URL", "CLW_QUICK_PAY_RECEIPT_TXNID_SUB_URL", "PARAM_TRANSACTION_ID", "framework-wallet_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
    }

    public QuickPayRemoteDataSourceImpl(NetworkManager networkManager, NetworkResponseToQuickPayReceiptFetchFailedExceptionMapper networkResponseToQuickPayReceiptFetchFailedExceptionMapper) {
        this.f10921a = networkManager;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // app.chalo.walletframework.quickpay.data.remote.QuickPayRemoteDataSource
    public final Object h(String str, ContinuationImpl continuationImpl) throws NetworkSuccessResponseParseException, QuickPayReceiptFetchFailedException {
        QuickPayRemoteDataSourceImpl$fetchClosedLoopQuickPayReceipt$1 quickPayRemoteDataSourceImpl$fetchClosedLoopQuickPayReceipt$1;
        if (continuationImpl instanceof QuickPayRemoteDataSourceImpl$fetchClosedLoopQuickPayReceipt$1) {
            quickPayRemoteDataSourceImpl$fetchClosedLoopQuickPayReceipt$1 = (QuickPayRemoteDataSourceImpl$fetchClosedLoopQuickPayReceipt$1) continuationImpl;
            int i = quickPayRemoteDataSourceImpl$fetchClosedLoopQuickPayReceipt$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                quickPayRemoteDataSourceImpl$fetchClosedLoopQuickPayReceipt$1.label = i - Integer.MIN_VALUE;
            } else {
                quickPayRemoteDataSourceImpl$fetchClosedLoopQuickPayReceipt$1 = new QuickPayRemoteDataSourceImpl$fetchClosedLoopQuickPayReceipt$1(this, continuationImpl);
            }
        } else {
            quickPayRemoteDataSourceImpl$fetchClosedLoopQuickPayReceipt$1 = new QuickPayRemoteDataSourceImpl$fetchClosedLoopQuickPayReceipt$1(this, continuationImpl);
        }
        Object objC = quickPayRemoteDataSourceImpl$fetchClosedLoopQuickPayReceipt$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = quickPayRemoteDataSourceImpl$fetchClosedLoopQuickPayReceipt$1.label;
        if (i2 == 0) {
            ResultKt.b(objC);
            NetworkRequestBuilder networkRequestBuilderD = this.f10921a.d();
            networkRequestBuilderD.j("payments/public/cldw/v1/spend/txnId/receipt");
            networkRequestBuilderD.a("transactionId", str, networkRequestBuilderD.f6519a.f);
            networkRequestBuilderD.b();
            networkRequestBuilderD.f(HttpRequestType.GET);
            ChaloRequest chaloRequestE = networkRequestBuilderD.e();
            quickPayRemoteDataSourceImpl$fetchClosedLoopQuickPayReceipt$1.label = 1;
            objC = chaloRequestE.c(quickPayRemoteDataSourceImpl$fetchClosedLoopQuickPayReceipt$1);
            if (objC == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(objC);
        }
        NetworkResponse networkResponse = (NetworkResponse) objC;
        boolean z = networkResponse.f6522a;
        String str2 = networkResponse.c;
        if (!z) {
            throw NetworkResponseToQuickPayReceiptFetchFailedExceptionMapper.a(networkResponse);
        }
        Json json = ChaloJson.b;
        NetworkSuccessResponseParseException networkSuccessResponseParseException = new NetworkSuccessResponseParseException("Response json is either null or empty");
        Object objB = null;
        if (str2 != null) {
            try {
                json.getClass();
                objB = json.b(str2, BuiltinSerializersKt.c(QuickPayReceiptResponseModel.INSTANCE.serializer()));
            } catch (Exception e) {
                networkSuccessResponseParseException = new NetworkSuccessResponseParseException(t8.g(QuickPayReceiptResponseModel.class, e.getMessage(), str2));
                networkResponse.g.b(networkSuccessResponseParseException);
            }
        }
        if (objB != null) {
            return (QuickPayReceiptResponseModel) objB;
        }
        throw networkSuccessResponseParseException;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // app.chalo.walletframework.quickpay.data.remote.QuickPayRemoteDataSource
    public final Object i(String str, ContinuationImpl continuationImpl) throws NetworkSuccessResponseParseException, QuickPayReceiptFetchFailedException {
        QuickPayRemoteDataSourceImpl$fetchQuickPayReceipt$1 quickPayRemoteDataSourceImpl$fetchQuickPayReceipt$1;
        if (continuationImpl instanceof QuickPayRemoteDataSourceImpl$fetchQuickPayReceipt$1) {
            quickPayRemoteDataSourceImpl$fetchQuickPayReceipt$1 = (QuickPayRemoteDataSourceImpl$fetchQuickPayReceipt$1) continuationImpl;
            int i = quickPayRemoteDataSourceImpl$fetchQuickPayReceipt$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                quickPayRemoteDataSourceImpl$fetchQuickPayReceipt$1.label = i - Integer.MIN_VALUE;
            } else {
                quickPayRemoteDataSourceImpl$fetchQuickPayReceipt$1 = new QuickPayRemoteDataSourceImpl$fetchQuickPayReceipt$1(this, continuationImpl);
            }
        } else {
            quickPayRemoteDataSourceImpl$fetchQuickPayReceipt$1 = new QuickPayRemoteDataSourceImpl$fetchQuickPayReceipt$1(this, continuationImpl);
        }
        Object objC = quickPayRemoteDataSourceImpl$fetchQuickPayReceipt$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = quickPayRemoteDataSourceImpl$fetchQuickPayReceipt$1.label;
        if (i2 == 0) {
            ResultKt.b(objC);
            NetworkRequestBuilder networkRequestBuilderD = this.f10921a.d();
            networkRequestBuilderD.j("mticketing/v2/quickpay/txnId/receipt");
            networkRequestBuilderD.a("transactionId", str, networkRequestBuilderD.f6519a.f);
            networkRequestBuilderD.b();
            networkRequestBuilderD.c();
            networkRequestBuilderD.f(HttpRequestType.GET);
            ChaloRequest chaloRequestE = networkRequestBuilderD.e();
            quickPayRemoteDataSourceImpl$fetchQuickPayReceipt$1.label = 1;
            objC = chaloRequestE.c(quickPayRemoteDataSourceImpl$fetchQuickPayReceipt$1);
            if (objC == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(objC);
        }
        NetworkResponse networkResponse = (NetworkResponse) objC;
        boolean z = networkResponse.f6522a;
        String str2 = networkResponse.c;
        if (!z) {
            throw NetworkResponseToQuickPayReceiptFetchFailedExceptionMapper.a(networkResponse);
        }
        Json json = ChaloJson.b;
        NetworkSuccessResponseParseException networkSuccessResponseParseException = new NetworkSuccessResponseParseException("Response json is either null or empty");
        Object objB = null;
        if (str2 != null) {
            try {
                json.getClass();
                objB = json.b(str2, BuiltinSerializersKt.c(QuickPayReceiptResponseModel.INSTANCE.serializer()));
            } catch (Exception e) {
                networkSuccessResponseParseException = new NetworkSuccessResponseParseException(t8.g(QuickPayReceiptResponseModel.class, e.getMessage(), str2));
                networkResponse.g.b(networkSuccessResponseParseException);
            }
        }
        if (objB != null) {
            return (QuickPayReceiptResponseModel) objB;
        }
        throw networkSuccessResponseParseException;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // app.chalo.walletframework.quickpay.data.remote.QuickPayRemoteDataSource
    public final Object j(String str, ContinuationImpl continuationImpl) throws NetworkSuccessResponseParseException, QuickPayReceiptFetchFailedException {
        QuickPayRemoteDataSourceImpl$fetchQuickPayReceiptsList$1 quickPayRemoteDataSourceImpl$fetchQuickPayReceiptsList$1;
        if (continuationImpl instanceof QuickPayRemoteDataSourceImpl$fetchQuickPayReceiptsList$1) {
            quickPayRemoteDataSourceImpl$fetchQuickPayReceiptsList$1 = (QuickPayRemoteDataSourceImpl$fetchQuickPayReceiptsList$1) continuationImpl;
            int i = quickPayRemoteDataSourceImpl$fetchQuickPayReceiptsList$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                quickPayRemoteDataSourceImpl$fetchQuickPayReceiptsList$1.label = i - Integer.MIN_VALUE;
            } else {
                quickPayRemoteDataSourceImpl$fetchQuickPayReceiptsList$1 = new QuickPayRemoteDataSourceImpl$fetchQuickPayReceiptsList$1(this, continuationImpl);
            }
        } else {
            quickPayRemoteDataSourceImpl$fetchQuickPayReceiptsList$1 = new QuickPayRemoteDataSourceImpl$fetchQuickPayReceiptsList$1(this, continuationImpl);
        }
        Object objC = quickPayRemoteDataSourceImpl$fetchQuickPayReceiptsList$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = quickPayRemoteDataSourceImpl$fetchQuickPayReceiptsList$1.label;
        if (i2 == 0) {
            ResultKt.b(objC);
            String strR = StringsKt.R("mticketing/v2/quickpay/receipts?userId={USER_ID}", "{USER_ID}", str);
            NetworkRequestBuilder networkRequestBuilderD = this.f10921a.d();
            networkRequestBuilderD.j(strR);
            networkRequestBuilderD.b();
            networkRequestBuilderD.c();
            networkRequestBuilderD.f(HttpRequestType.GET);
            ChaloRequest chaloRequestE = networkRequestBuilderD.e();
            quickPayRemoteDataSourceImpl$fetchQuickPayReceiptsList$1.label = 1;
            objC = chaloRequestE.c(quickPayRemoteDataSourceImpl$fetchQuickPayReceiptsList$1);
            if (objC == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(objC);
        }
        NetworkResponse networkResponse = (NetworkResponse) objC;
        boolean z = networkResponse.f6522a;
        String str2 = networkResponse.c;
        if (!z) {
            throw NetworkResponseToQuickPayReceiptFetchFailedExceptionMapper.a(networkResponse);
        }
        Json json = ChaloJson.b;
        NetworkSuccessResponseParseException networkSuccessResponseParseException = new NetworkSuccessResponseParseException("Response json is either null or empty");
        Object objB = null;
        if (str2 != null) {
            try {
                json.getClass();
                objB = json.b(str2, BuiltinSerializersKt.c(new ArrayListSerializer(QuickPayReceiptResponseModel.INSTANCE.serializer())));
            } catch (Exception e) {
                networkSuccessResponseParseException = new NetworkSuccessResponseParseException(t8.g(List.class, e.getMessage(), str2));
                networkResponse.g.b(networkSuccessResponseParseException);
            }
        }
        if (objB != null) {
            return (List) objB;
        }
        throw networkSuccessResponseParseException;
    }
}
