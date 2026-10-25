package app.chalo.walletframework.wallet.data.remote;

import app.chalo.contract.BasicInfoContract;
import app.chalo.crashlytics.CrashlyticsLogger;
import app.chalo.models.ordercreation.CreateOrderResponseApiModel;
import app.chalo.network.NetworkManager;
import app.chalo.network.config.ChaloJson;
import app.chalo.network.exception.NetworkSuccessResponseParseException;
import app.chalo.network.mapper.GenericNetworkExceptionMapper;
import app.chalo.network.rest.request.ChaloRequest;
import app.chalo.network.rest.request.HttpRequestType;
import app.chalo.network.rest.request.NetworkRequestBuilder;
import app.chalo.network.rest.response.NetworkResponse;
import app.chalo.providers.cityprovider.CityProvider;
import app.chalo.providers.cityprovider.CityProviderKt;
import app.chalo.walletframework.wallet.data.model.apimodel.request.ClosedLoopWalletMigrationRequestApiModel;
import app.chalo.walletframework.wallet.data.model.apimodel.request.ClosedLoopWalletRegisterRequestApiModel;
import app.chalo.walletframework.wallet.data.model.apimodel.request.ClosedLoopWalletSyncHistoryRequestApiModel;
import app.chalo.walletframework.wallet.data.model.apimodel.request.WalletMigrationRequestApiModel;
import app.chalo.walletframework.wallet.data.model.apimodel.request.WalletRechargeOrderRequestApiModel;
import app.chalo.walletframework.wallet.data.model.apimodel.request.WalletSyncHistoryRequestApiModel;
import app.chalo.walletframework.wallet.data.model.apimodel.response.AllWalletsSyncResponseApiModel;
import app.chalo.walletframework.wallet.data.model.apimodel.response.ClosedLoopWalletRegisterResponseApiModel;
import app.chalo.walletframework.wallet.data.model.apimodel.response.WalletLoadBalanceConfigBaseApiResponseModel;
import app.chalo.walletframework.wallet.data.model.apimodel.response.WalletMigrationResponseApiModel;
import app.chalo.walletframework.wallet.data.model.apimodel.response.WalletSyncHistoryResponseApiModel;
import defpackage.hp1;
import defpackage.ip1;
import defpackage.t8;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlinx.serialization.builtins.BuiltinSerializersKt;
import kotlinx.serialization.json.Json;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lapp/chalo/walletframework/wallet/data/remote/WalletRemoteDataSourceImpl;", "Lapp/chalo/walletframework/wallet/data/remote/WalletRemoteDataSource;", "Companion", "framework-wallet_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class WalletRemoteDataSourceImpl implements WalletRemoteDataSource {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final NetworkManager f11018a;
    public final CrashlyticsLogger b;
    public final CityProvider c;
    public final BasicInfoContract d;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\r\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0004R\u0014\u0010\u0007\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0004R\u0014\u0010\b\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\u0004R\u0014\u0010\t\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\u0004R\u0014\u0010\n\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010\u0004R\u0014\u0010\u000b\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000b\u0010\u0004R\u0014\u0010\f\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\f\u0010\u0004R\u0014\u0010\r\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\r\u0010\u0004R\u0014\u0010\u000e\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000e\u0010\u0004¨\u0006\u000f"}, d2 = {"Lapp/chalo/walletframework/wallet/data/remote/WalletRemoteDataSourceImpl$Companion;", "", "", "SUB_URL_SYNC_SEMI_CLOSED_WALLET", "Ljava/lang/String;", "SUB_URL_SYNC_CLOSED_WALLET", "SUB_URL_REGISTER_CLOSED_WALLET", "SUB_URL_ALL_WALLETS_META_SYNC", "CLOSED_WALLET_RECHARGE_ORDER_SUB_URL", "WALLET_CONFIG_SUB_URL", "WALLET_RECHARGE_ORDER_SUB_URL", "WALLET_MIGRATION_SUB_URL", "WALLET_SEMI_CLOSED_AUTO_RECLAIM_SUB_URL", "WALLET_CLOSED_LOOP_AUTO_RECLAIM_SUB_URL", "HEADER_USER_ID", "framework-wallet_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
    }

    public WalletRemoteDataSourceImpl(NetworkManager networkManager, CrashlyticsLogger crashlyticsLogger, CityProvider cityProvider, GenericNetworkExceptionMapper genericNetworkExceptionMapper, BasicInfoContract basicInfoContract) {
        this.f11018a = networkManager;
        this.b = crashlyticsLogger;
        this.c = cityProvider;
        this.d = basicInfoContract;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // app.chalo.walletframework.wallet.data.remote.WalletRemoteDataSource
    public final Object f(WalletMigrationRequestApiModel walletMigrationRequestApiModel, ContinuationImpl continuationImpl) throws Exception {
        WalletRemoteDataSourceImpl$semiClosedWalletAutoReclaim$1 walletRemoteDataSourceImpl$semiClosedWalletAutoReclaim$1;
        if (continuationImpl instanceof WalletRemoteDataSourceImpl$semiClosedWalletAutoReclaim$1) {
            walletRemoteDataSourceImpl$semiClosedWalletAutoReclaim$1 = (WalletRemoteDataSourceImpl$semiClosedWalletAutoReclaim$1) continuationImpl;
            int i = walletRemoteDataSourceImpl$semiClosedWalletAutoReclaim$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                walletRemoteDataSourceImpl$semiClosedWalletAutoReclaim$1.label = i - Integer.MIN_VALUE;
            } else {
                walletRemoteDataSourceImpl$semiClosedWalletAutoReclaim$1 = new WalletRemoteDataSourceImpl$semiClosedWalletAutoReclaim$1(this, continuationImpl);
            }
        } else {
            walletRemoteDataSourceImpl$semiClosedWalletAutoReclaim$1 = new WalletRemoteDataSourceImpl$semiClosedWalletAutoReclaim$1(this, continuationImpl);
        }
        Object objC = walletRemoteDataSourceImpl$semiClosedWalletAutoReclaim$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = walletRemoteDataSourceImpl$semiClosedWalletAutoReclaim$1.label;
        if (i2 == 0) {
            ResultKt.b(objC);
            NetworkRequestBuilder networkRequestBuilderD = this.f11018a.d();
            Json json = ChaloJson.b;
            json.getClass();
            networkRequestBuilderD.i(json.a(WalletMigrationRequestApiModel.INSTANCE.serializer(), walletMigrationRequestApiModel));
            networkRequestBuilderD.j("payments/public/wallet/v2/autoReclaim");
            networkRequestBuilderD.f(HttpRequestType.POST);
            networkRequestBuilderD.b();
            ChaloRequest chaloRequestE = networkRequestBuilderD.e();
            walletRemoteDataSourceImpl$semiClosedWalletAutoReclaim$1.label = 1;
            objC = chaloRequestE.c(walletRemoteDataSourceImpl$semiClosedWalletAutoReclaim$1);
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
        String str = networkResponse.c;
        Object objB = null;
        if (!z) {
            throw GenericNetworkExceptionMapper.a(networkResponse, null, new ip1(networkResponse, 1));
        }
        Json json2 = ChaloJson.b;
        NetworkSuccessResponseParseException networkSuccessResponseParseException = new NetworkSuccessResponseParseException("Response json is either null or empty");
        if (str != null) {
            try {
                json2.getClass();
                objB = json2.b(str, BuiltinSerializersKt.c(WalletMigrationResponseApiModel.INSTANCE.serializer()));
            } catch (Exception e) {
                networkSuccessResponseParseException = new NetworkSuccessResponseParseException(t8.g(WalletMigrationResponseApiModel.class, e.getMessage(), str));
                networkResponse.g.b(networkSuccessResponseParseException);
            }
        }
        if (objB != null) {
            return (WalletMigrationResponseApiModel) objB;
        }
        throw networkSuccessResponseParseException;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // app.chalo.walletframework.wallet.data.remote.WalletRemoteDataSource
    public final Object g(ClosedLoopWalletMigrationRequestApiModel closedLoopWalletMigrationRequestApiModel, ContinuationImpl continuationImpl) throws Exception {
        WalletRemoteDataSourceImpl$closedLoopWalletAutoReclaim$1 walletRemoteDataSourceImpl$closedLoopWalletAutoReclaim$1;
        if (continuationImpl instanceof WalletRemoteDataSourceImpl$closedLoopWalletAutoReclaim$1) {
            walletRemoteDataSourceImpl$closedLoopWalletAutoReclaim$1 = (WalletRemoteDataSourceImpl$closedLoopWalletAutoReclaim$1) continuationImpl;
            int i = walletRemoteDataSourceImpl$closedLoopWalletAutoReclaim$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                walletRemoteDataSourceImpl$closedLoopWalletAutoReclaim$1.label = i - Integer.MIN_VALUE;
            } else {
                walletRemoteDataSourceImpl$closedLoopWalletAutoReclaim$1 = new WalletRemoteDataSourceImpl$closedLoopWalletAutoReclaim$1(this, continuationImpl);
            }
        } else {
            walletRemoteDataSourceImpl$closedLoopWalletAutoReclaim$1 = new WalletRemoteDataSourceImpl$closedLoopWalletAutoReclaim$1(this, continuationImpl);
        }
        Object objC = walletRemoteDataSourceImpl$closedLoopWalletAutoReclaim$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = walletRemoteDataSourceImpl$closedLoopWalletAutoReclaim$1.label;
        if (i2 == 0) {
            ResultKt.b(objC);
            NetworkRequestBuilder networkRequestBuilderD = this.f11018a.d();
            networkRequestBuilderD.j("payments/public/cldw/v1/autoReclaim");
            networkRequestBuilderD.f(HttpRequestType.POST);
            Json json = ChaloJson.b;
            json.getClass();
            networkRequestBuilderD.i(json.a(ClosedLoopWalletMigrationRequestApiModel.INSTANCE.serializer(), closedLoopWalletMigrationRequestApiModel));
            networkRequestBuilderD.b();
            ChaloRequest chaloRequestE = networkRequestBuilderD.e();
            walletRemoteDataSourceImpl$closedLoopWalletAutoReclaim$1.label = 1;
            objC = chaloRequestE.c(walletRemoteDataSourceImpl$closedLoopWalletAutoReclaim$1);
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
        String str = networkResponse.c;
        Object objB = null;
        if (!z) {
            throw GenericNetworkExceptionMapper.a(networkResponse, null, new ip1(networkResponse, 0));
        }
        Json json2 = ChaloJson.b;
        NetworkSuccessResponseParseException networkSuccessResponseParseException = new NetworkSuccessResponseParseException("Response json is either null or empty");
        if (str != null) {
            try {
                json2.getClass();
                objB = json2.b(str, BuiltinSerializersKt.c(WalletMigrationResponseApiModel.INSTANCE.serializer()));
            } catch (Exception e) {
                networkSuccessResponseParseException = new NetworkSuccessResponseParseException(t8.g(WalletMigrationResponseApiModel.class, e.getMessage(), str));
                networkResponse.g.b(networkSuccessResponseParseException);
            }
        }
        if (objB != null) {
            return (WalletMigrationResponseApiModel) objB;
        }
        throw networkSuccessResponseParseException;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // app.chalo.walletframework.wallet.data.remote.WalletRemoteDataSource
    public final Object h(WalletMigrationRequestApiModel walletMigrationRequestApiModel, ContinuationImpl continuationImpl) throws Exception {
        WalletRemoteDataSourceImpl$postDeviceIdForWalletMigration$1 walletRemoteDataSourceImpl$postDeviceIdForWalletMigration$1;
        if (continuationImpl instanceof WalletRemoteDataSourceImpl$postDeviceIdForWalletMigration$1) {
            walletRemoteDataSourceImpl$postDeviceIdForWalletMigration$1 = (WalletRemoteDataSourceImpl$postDeviceIdForWalletMigration$1) continuationImpl;
            int i = walletRemoteDataSourceImpl$postDeviceIdForWalletMigration$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                walletRemoteDataSourceImpl$postDeviceIdForWalletMigration$1.label = i - Integer.MIN_VALUE;
            } else {
                walletRemoteDataSourceImpl$postDeviceIdForWalletMigration$1 = new WalletRemoteDataSourceImpl$postDeviceIdForWalletMigration$1(this, continuationImpl);
            }
        } else {
            walletRemoteDataSourceImpl$postDeviceIdForWalletMigration$1 = new WalletRemoteDataSourceImpl$postDeviceIdForWalletMigration$1(this, continuationImpl);
        }
        Object objC = walletRemoteDataSourceImpl$postDeviceIdForWalletMigration$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = walletRemoteDataSourceImpl$postDeviceIdForWalletMigration$1.label;
        if (i2 == 0) {
            ResultKt.b(objC);
            NetworkRequestBuilder networkRequestBuilderD = this.f11018a.d();
            Json json = ChaloJson.b;
            json.getClass();
            networkRequestBuilderD.i(json.a(WalletMigrationRequestApiModel.INSTANCE.serializer(), walletMigrationRequestApiModel));
            networkRequestBuilderD.j("payments/public/wallet/v2/reclaimRequest");
            networkRequestBuilderD.f(HttpRequestType.POST);
            networkRequestBuilderD.b();
            ChaloRequest chaloRequestE = networkRequestBuilderD.e();
            walletRemoteDataSourceImpl$postDeviceIdForWalletMigration$1.label = 1;
            objC = chaloRequestE.c(walletRemoteDataSourceImpl$postDeviceIdForWalletMigration$1);
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
        String str = networkResponse.c;
        Object objB = null;
        if (!z) {
            throw GenericNetworkExceptionMapper.a(networkResponse, null, new hp1(1));
        }
        Json json2 = ChaloJson.b;
        NetworkSuccessResponseParseException networkSuccessResponseParseException = new NetworkSuccessResponseParseException("Response json is either null or empty");
        if (str != null) {
            try {
                json2.getClass();
                objB = json2.b(str, BuiltinSerializersKt.c(WalletMigrationResponseApiModel.INSTANCE.serializer()));
            } catch (Exception e) {
                networkSuccessResponseParseException = new NetworkSuccessResponseParseException(t8.g(WalletMigrationResponseApiModel.class, e.getMessage(), str));
                networkResponse.g.b(networkSuccessResponseParseException);
            }
        }
        if (objB != null) {
            return (WalletMigrationResponseApiModel) objB;
        }
        throw networkSuccessResponseParseException;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // app.chalo.walletframework.wallet.data.remote.WalletRemoteDataSource
    public final Object i(ClosedLoopWalletSyncHistoryRequestApiModel closedLoopWalletSyncHistoryRequestApiModel, ContinuationImpl continuationImpl) throws Exception {
        WalletRemoteDataSourceImpl$syncClosedWalletAndQuickPayOrdersAndFetchWalletTransactionsIfRequired$1 walletRemoteDataSourceImpl$syncClosedWalletAndQuickPayOrdersAndFetchWalletTransactionsIfRequired$1;
        if (continuationImpl instanceof WalletRemoteDataSourceImpl$syncClosedWalletAndQuickPayOrdersAndFetchWalletTransactionsIfRequired$1) {
            walletRemoteDataSourceImpl$syncClosedWalletAndQuickPayOrdersAndFetchWalletTransactionsIfRequired$1 = (WalletRemoteDataSourceImpl$syncClosedWalletAndQuickPayOrdersAndFetchWalletTransactionsIfRequired$1) continuationImpl;
            int i = walletRemoteDataSourceImpl$syncClosedWalletAndQuickPayOrdersAndFetchWalletTransactionsIfRequired$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                walletRemoteDataSourceImpl$syncClosedWalletAndQuickPayOrdersAndFetchWalletTransactionsIfRequired$1.label = i - Integer.MIN_VALUE;
            } else {
                walletRemoteDataSourceImpl$syncClosedWalletAndQuickPayOrdersAndFetchWalletTransactionsIfRequired$1 = new WalletRemoteDataSourceImpl$syncClosedWalletAndQuickPayOrdersAndFetchWalletTransactionsIfRequired$1(this, continuationImpl);
            }
        } else {
            walletRemoteDataSourceImpl$syncClosedWalletAndQuickPayOrdersAndFetchWalletTransactionsIfRequired$1 = new WalletRemoteDataSourceImpl$syncClosedWalletAndQuickPayOrdersAndFetchWalletTransactionsIfRequired$1(this, continuationImpl);
        }
        Object objC = walletRemoteDataSourceImpl$syncClosedWalletAndQuickPayOrdersAndFetchWalletTransactionsIfRequired$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = walletRemoteDataSourceImpl$syncClosedWalletAndQuickPayOrdersAndFetchWalletTransactionsIfRequired$1.label;
        if (i2 == 0) {
            ResultKt.b(objC);
            NetworkRequestBuilder networkRequestBuilderD = this.f11018a.d();
            networkRequestBuilderD.j("payments/public/cldw/v1/syncWallet");
            networkRequestBuilderD.f(HttpRequestType.POST);
            networkRequestBuilderD.b();
            Json json = ChaloJson.b;
            json.getClass();
            networkRequestBuilderD.i(json.a(ClosedLoopWalletSyncHistoryRequestApiModel.INSTANCE.serializer(), closedLoopWalletSyncHistoryRequestApiModel));
            ChaloRequest chaloRequestE = networkRequestBuilderD.e();
            walletRemoteDataSourceImpl$syncClosedWalletAndQuickPayOrdersAndFetchWalletTransactionsIfRequired$1.label = 1;
            objC = chaloRequestE.c(walletRemoteDataSourceImpl$syncClosedWalletAndQuickPayOrdersAndFetchWalletTransactionsIfRequired$1);
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
        String str = networkResponse.c;
        Object objB = null;
        if (!z) {
            throw GenericNetworkExceptionMapper.a(networkResponse, null, new hp1(4));
        }
        Json json2 = ChaloJson.b;
        NetworkSuccessResponseParseException networkSuccessResponseParseException = new NetworkSuccessResponseParseException("Response json is either null or empty");
        if (str != null) {
            try {
                json2.getClass();
                objB = json2.b(str, BuiltinSerializersKt.c(WalletSyncHistoryResponseApiModel.INSTANCE.serializer()));
            } catch (Exception e) {
                networkSuccessResponseParseException = new NetworkSuccessResponseParseException(t8.g(WalletSyncHistoryResponseApiModel.class, e.getMessage(), str));
                networkResponse.g.b(networkSuccessResponseParseException);
            }
        }
        if (objB != null) {
            return (WalletSyncHistoryResponseApiModel) objB;
        }
        throw networkSuccessResponseParseException;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // app.chalo.walletframework.wallet.data.remote.WalletRemoteDataSource
    public final Object j(WalletSyncHistoryRequestApiModel walletSyncHistoryRequestApiModel, ContinuationImpl continuationImpl) throws Exception {
        WalletRemoteDataSourceImpl$syncSemiClosedWalletAndQuickPayOrdersAndFetchWalletTransactionsIfRequired$1 walletRemoteDataSourceImpl$syncSemiClosedWalletAndQuickPayOrdersAndFetchWalletTransactionsIfRequired$1;
        if (continuationImpl instanceof WalletRemoteDataSourceImpl$syncSemiClosedWalletAndQuickPayOrdersAndFetchWalletTransactionsIfRequired$1) {
            walletRemoteDataSourceImpl$syncSemiClosedWalletAndQuickPayOrdersAndFetchWalletTransactionsIfRequired$1 = (WalletRemoteDataSourceImpl$syncSemiClosedWalletAndQuickPayOrdersAndFetchWalletTransactionsIfRequired$1) continuationImpl;
            int i = walletRemoteDataSourceImpl$syncSemiClosedWalletAndQuickPayOrdersAndFetchWalletTransactionsIfRequired$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                walletRemoteDataSourceImpl$syncSemiClosedWalletAndQuickPayOrdersAndFetchWalletTransactionsIfRequired$1.label = i - Integer.MIN_VALUE;
            } else {
                walletRemoteDataSourceImpl$syncSemiClosedWalletAndQuickPayOrdersAndFetchWalletTransactionsIfRequired$1 = new WalletRemoteDataSourceImpl$syncSemiClosedWalletAndQuickPayOrdersAndFetchWalletTransactionsIfRequired$1(this, continuationImpl);
            }
        } else {
            walletRemoteDataSourceImpl$syncSemiClosedWalletAndQuickPayOrdersAndFetchWalletTransactionsIfRequired$1 = new WalletRemoteDataSourceImpl$syncSemiClosedWalletAndQuickPayOrdersAndFetchWalletTransactionsIfRequired$1(this, continuationImpl);
        }
        Object objC = walletRemoteDataSourceImpl$syncSemiClosedWalletAndQuickPayOrdersAndFetchWalletTransactionsIfRequired$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = walletRemoteDataSourceImpl$syncSemiClosedWalletAndQuickPayOrdersAndFetchWalletTransactionsIfRequired$1.label;
        if (i2 == 0) {
            ResultKt.b(objC);
            NetworkRequestBuilder networkRequestBuilderD = this.f11018a.d();
            networkRequestBuilderD.j("mticketing/v2/wallet/syncWallet");
            networkRequestBuilderD.f(HttpRequestType.POST);
            networkRequestBuilderD.b();
            networkRequestBuilderD.c();
            Json json = ChaloJson.b;
            json.getClass();
            networkRequestBuilderD.i(json.a(WalletSyncHistoryRequestApiModel.INSTANCE.serializer(), walletSyncHistoryRequestApiModel));
            ChaloRequest chaloRequestE = networkRequestBuilderD.e();
            walletRemoteDataSourceImpl$syncSemiClosedWalletAndQuickPayOrdersAndFetchWalletTransactionsIfRequired$1.label = 1;
            objC = chaloRequestE.c(walletRemoteDataSourceImpl$syncSemiClosedWalletAndQuickPayOrdersAndFetchWalletTransactionsIfRequired$1);
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
        String str = networkResponse.c;
        Object objB = null;
        if (!z) {
            throw GenericNetworkExceptionMapper.a(networkResponse, null, new hp1(5));
        }
        Json json2 = ChaloJson.b;
        NetworkSuccessResponseParseException networkSuccessResponseParseException = new NetworkSuccessResponseParseException("Response json is either null or empty");
        if (str != null) {
            try {
                json2.getClass();
                objB = json2.b(str, BuiltinSerializersKt.c(WalletSyncHistoryResponseApiModel.INSTANCE.serializer()));
            } catch (Exception e) {
                networkSuccessResponseParseException = new NetworkSuccessResponseParseException(t8.g(WalletSyncHistoryResponseApiModel.class, e.getMessage(), str));
                networkResponse.g.b(networkSuccessResponseParseException);
            }
        }
        if (objB != null) {
            return (WalletSyncHistoryResponseApiModel) objB;
        }
        throw networkSuccessResponseParseException;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // app.chalo.walletframework.wallet.data.remote.WalletRemoteDataSource
    public final Object k(WalletRechargeOrderRequestApiModel walletRechargeOrderRequestApiModel, ContinuationImpl continuationImpl) throws Exception {
        WalletRemoteDataSourceImpl$placeSemiClosedWalletRechargeOrder$1 walletRemoteDataSourceImpl$placeSemiClosedWalletRechargeOrder$1;
        if (continuationImpl instanceof WalletRemoteDataSourceImpl$placeSemiClosedWalletRechargeOrder$1) {
            walletRemoteDataSourceImpl$placeSemiClosedWalletRechargeOrder$1 = (WalletRemoteDataSourceImpl$placeSemiClosedWalletRechargeOrder$1) continuationImpl;
            int i = walletRemoteDataSourceImpl$placeSemiClosedWalletRechargeOrder$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                walletRemoteDataSourceImpl$placeSemiClosedWalletRechargeOrder$1.label = i - Integer.MIN_VALUE;
            } else {
                walletRemoteDataSourceImpl$placeSemiClosedWalletRechargeOrder$1 = new WalletRemoteDataSourceImpl$placeSemiClosedWalletRechargeOrder$1(this, continuationImpl);
            }
        } else {
            walletRemoteDataSourceImpl$placeSemiClosedWalletRechargeOrder$1 = new WalletRemoteDataSourceImpl$placeSemiClosedWalletRechargeOrder$1(this, continuationImpl);
        }
        Object objC = walletRemoteDataSourceImpl$placeSemiClosedWalletRechargeOrder$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = walletRemoteDataSourceImpl$placeSemiClosedWalletRechargeOrder$1.label;
        if (i2 == 0) {
            ResultKt.b(objC);
            NetworkRequestBuilder networkRequestBuilderD = this.f11018a.d();
            Json json = ChaloJson.b;
            json.getClass();
            networkRequestBuilderD.i(json.a(WalletRechargeOrderRequestApiModel.INSTANCE.serializer(), walletRechargeOrderRequestApiModel));
            networkRequestBuilderD.j("mticketing/v2/wallet/rechargeOrder");
            networkRequestBuilderD.f(HttpRequestType.POST);
            networkRequestBuilderD.b();
            ChaloRequest chaloRequestE = networkRequestBuilderD.e();
            walletRemoteDataSourceImpl$placeSemiClosedWalletRechargeOrder$1.label = 1;
            objC = chaloRequestE.c(walletRemoteDataSourceImpl$placeSemiClosedWalletRechargeOrder$1);
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
        String str = networkResponse.c;
        Object objB = null;
        if (!z) {
            throw GenericNetworkExceptionMapper.a(networkResponse, null, new ip1(networkResponse, 2));
        }
        Json json2 = ChaloJson.b;
        NetworkSuccessResponseParseException networkSuccessResponseParseException = new NetworkSuccessResponseParseException("Response json is either null or empty");
        if (str != null) {
            try {
                json2.getClass();
                objB = json2.b(str, BuiltinSerializersKt.c(CreateOrderResponseApiModel.INSTANCE.serializer()));
            } catch (Exception e) {
                networkSuccessResponseParseException = new NetworkSuccessResponseParseException(t8.g(CreateOrderResponseApiModel.class, e.getMessage(), str));
                networkResponse.g.b(networkSuccessResponseParseException);
            }
        }
        if (objB != null) {
            return (CreateOrderResponseApiModel) objB;
        }
        throw networkSuccessResponseParseException;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // app.chalo.walletframework.wallet.data.remote.WalletRemoteDataSource
    public final Object l(ContinuationImpl continuationImpl) throws Exception {
        WalletRemoteDataSourceImpl$getWalletLoadBalanceConfig$1 walletRemoteDataSourceImpl$getWalletLoadBalanceConfig$1;
        String lowerCase;
        if (continuationImpl instanceof WalletRemoteDataSourceImpl$getWalletLoadBalanceConfig$1) {
            walletRemoteDataSourceImpl$getWalletLoadBalanceConfig$1 = (WalletRemoteDataSourceImpl$getWalletLoadBalanceConfig$1) continuationImpl;
            int i = walletRemoteDataSourceImpl$getWalletLoadBalanceConfig$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                walletRemoteDataSourceImpl$getWalletLoadBalanceConfig$1.label = i - Integer.MIN_VALUE;
            } else {
                walletRemoteDataSourceImpl$getWalletLoadBalanceConfig$1 = new WalletRemoteDataSourceImpl$getWalletLoadBalanceConfig$1(this, continuationImpl);
            }
        } else {
            walletRemoteDataSourceImpl$getWalletLoadBalanceConfig$1 = new WalletRemoteDataSourceImpl$getWalletLoadBalanceConfig$1(this, continuationImpl);
        }
        Object objC = walletRemoteDataSourceImpl$getWalletLoadBalanceConfig$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = walletRemoteDataSourceImpl$getWalletLoadBalanceConfig$1.label;
        Object objB = null;
        if (i2 == 0) {
            ResultKt.b(objC);
            String strB = CityProviderKt.b(this.c);
            if (strB != null) {
                lowerCase = strB.toLowerCase(Locale.ROOT);
                Intrinsics.h(lowerCase, "toLowerCase(...)");
            } else {
                lowerCase = null;
            }
            String strR = StringsKt.R(StringsKt.R("configuration/v2/cities/{city}/wallet?appVer={appVer}", "{city}", String.valueOf(lowerCase)), "{appVer}", String.valueOf(this.d.h()));
            NetworkRequestBuilder networkRequestBuilderD = this.f11018a.d();
            networkRequestBuilderD.j(strR);
            networkRequestBuilderD.f(HttpRequestType.GET);
            networkRequestBuilderD.b();
            ChaloRequest chaloRequestE = networkRequestBuilderD.e();
            walletRemoteDataSourceImpl$getWalletLoadBalanceConfig$1.label = 1;
            objC = chaloRequestE.c(walletRemoteDataSourceImpl$getWalletLoadBalanceConfig$1);
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
        String str = networkResponse.c;
        if (!z) {
            throw GenericNetworkExceptionMapper.a(networkResponse, null, new hp1(3));
        }
        Json json = ChaloJson.b;
        NetworkSuccessResponseParseException networkSuccessResponseParseException = new NetworkSuccessResponseParseException("Response json is either null or empty");
        if (str != null) {
            try {
                json.getClass();
                objB = json.b(str, BuiltinSerializersKt.c(WalletLoadBalanceConfigBaseApiResponseModel.INSTANCE.serializer()));
            } catch (Exception e) {
                networkSuccessResponseParseException = new NetworkSuccessResponseParseException(t8.g(WalletLoadBalanceConfigBaseApiResponseModel.class, e.getMessage(), str));
                networkResponse.g.b(networkSuccessResponseParseException);
            }
        }
        if (objB != null) {
            return (WalletLoadBalanceConfigBaseApiResponseModel) objB;
        }
        throw networkSuccessResponseParseException;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // app.chalo.walletframework.wallet.data.remote.WalletRemoteDataSource
    public final Object m(ClosedLoopWalletRegisterRequestApiModel closedLoopWalletRegisterRequestApiModel, ContinuationImpl continuationImpl) throws Exception {
        WalletRemoteDataSourceImpl$registerClosedLoopWallet$1 walletRemoteDataSourceImpl$registerClosedLoopWallet$1;
        if (continuationImpl instanceof WalletRemoteDataSourceImpl$registerClosedLoopWallet$1) {
            walletRemoteDataSourceImpl$registerClosedLoopWallet$1 = (WalletRemoteDataSourceImpl$registerClosedLoopWallet$1) continuationImpl;
            int i = walletRemoteDataSourceImpl$registerClosedLoopWallet$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                walletRemoteDataSourceImpl$registerClosedLoopWallet$1.label = i - Integer.MIN_VALUE;
            } else {
                walletRemoteDataSourceImpl$registerClosedLoopWallet$1 = new WalletRemoteDataSourceImpl$registerClosedLoopWallet$1(this, continuationImpl);
            }
        } else {
            walletRemoteDataSourceImpl$registerClosedLoopWallet$1 = new WalletRemoteDataSourceImpl$registerClosedLoopWallet$1(this, continuationImpl);
        }
        Object objC = walletRemoteDataSourceImpl$registerClosedLoopWallet$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = walletRemoteDataSourceImpl$registerClosedLoopWallet$1.label;
        if (i2 == 0) {
            ResultKt.b(objC);
            NetworkRequestBuilder networkRequestBuilderD = this.f11018a.d();
            networkRequestBuilderD.j("payments/public/cldw/v1/register");
            networkRequestBuilderD.f(HttpRequestType.POST);
            networkRequestBuilderD.b();
            Json json = ChaloJson.b;
            json.getClass();
            networkRequestBuilderD.i(json.a(ClosedLoopWalletRegisterRequestApiModel.INSTANCE.serializer(), closedLoopWalletRegisterRequestApiModel));
            ChaloRequest chaloRequestE = networkRequestBuilderD.e();
            walletRemoteDataSourceImpl$registerClosedLoopWallet$1.label = 1;
            objC = chaloRequestE.c(walletRemoteDataSourceImpl$registerClosedLoopWallet$1);
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
        String str = networkResponse.c;
        Object objB = null;
        if (!z) {
            throw GenericNetworkExceptionMapper.a(networkResponse, null, new hp1(0));
        }
        Json json2 = ChaloJson.b;
        NetworkSuccessResponseParseException networkSuccessResponseParseException = new NetworkSuccessResponseParseException("Response json is either null or empty");
        if (str != null) {
            try {
                json2.getClass();
                objB = json2.b(str, BuiltinSerializersKt.c(ClosedLoopWalletRegisterResponseApiModel.INSTANCE.serializer()));
            } catch (Exception e) {
                networkSuccessResponseParseException = new NetworkSuccessResponseParseException(t8.g(ClosedLoopWalletRegisterResponseApiModel.class, e.getMessage(), str));
                networkResponse.g.b(networkSuccessResponseParseException);
            }
        }
        if (objB != null) {
            return (ClosedLoopWalletRegisterResponseApiModel) objB;
        }
        throw networkSuccessResponseParseException;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // app.chalo.walletframework.wallet.data.remote.WalletRemoteDataSource
    public final Object n(WalletRechargeOrderRequestApiModel walletRechargeOrderRequestApiModel, ContinuationImpl continuationImpl) throws Exception {
        WalletRemoteDataSourceImpl$placeClosedLoopWalletRechargeOrder$1 walletRemoteDataSourceImpl$placeClosedLoopWalletRechargeOrder$1;
        if (continuationImpl instanceof WalletRemoteDataSourceImpl$placeClosedLoopWalletRechargeOrder$1) {
            walletRemoteDataSourceImpl$placeClosedLoopWalletRechargeOrder$1 = (WalletRemoteDataSourceImpl$placeClosedLoopWalletRechargeOrder$1) continuationImpl;
            int i = walletRemoteDataSourceImpl$placeClosedLoopWalletRechargeOrder$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                walletRemoteDataSourceImpl$placeClosedLoopWalletRechargeOrder$1.label = i - Integer.MIN_VALUE;
            } else {
                walletRemoteDataSourceImpl$placeClosedLoopWalletRechargeOrder$1 = new WalletRemoteDataSourceImpl$placeClosedLoopWalletRechargeOrder$1(this, continuationImpl);
            }
        } else {
            walletRemoteDataSourceImpl$placeClosedLoopWalletRechargeOrder$1 = new WalletRemoteDataSourceImpl$placeClosedLoopWalletRechargeOrder$1(this, continuationImpl);
        }
        Object objC = walletRemoteDataSourceImpl$placeClosedLoopWalletRechargeOrder$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = walletRemoteDataSourceImpl$placeClosedLoopWalletRechargeOrder$1.label;
        if (i2 == 0) {
            ResultKt.b(objC);
            NetworkRequestBuilder networkRequestBuilderD = this.f11018a.d();
            networkRequestBuilderD.j("payments/public/cldw/v1/recharge/order");
            networkRequestBuilderD.f(HttpRequestType.POST);
            networkRequestBuilderD.b();
            Json json = ChaloJson.b;
            json.getClass();
            networkRequestBuilderD.i(json.a(WalletRechargeOrderRequestApiModel.INSTANCE.serializer(), walletRechargeOrderRequestApiModel));
            ChaloRequest chaloRequestE = networkRequestBuilderD.e();
            walletRemoteDataSourceImpl$placeClosedLoopWalletRechargeOrder$1.label = 1;
            objC = chaloRequestE.c(walletRemoteDataSourceImpl$placeClosedLoopWalletRechargeOrder$1);
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
        String str = networkResponse.c;
        Object objB = null;
        if (!z) {
            throw GenericNetworkExceptionMapper.a(networkResponse, null, new ip1(networkResponse, 3));
        }
        Json json2 = ChaloJson.b;
        NetworkSuccessResponseParseException networkSuccessResponseParseException = new NetworkSuccessResponseParseException("Response json is either null or empty");
        if (str != null) {
            try {
                json2.getClass();
                objB = json2.b(str, BuiltinSerializersKt.c(CreateOrderResponseApiModel.INSTANCE.serializer()));
            } catch (Exception e) {
                networkSuccessResponseParseException = new NetworkSuccessResponseParseException(t8.g(CreateOrderResponseApiModel.class, e.getMessage(), str));
                networkResponse.g.b(networkSuccessResponseParseException);
            }
        }
        if (objB != null) {
            return (CreateOrderResponseApiModel) objB;
        }
        throw networkSuccessResponseParseException;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // app.chalo.walletframework.wallet.data.remote.WalletRemoteDataSource
    public final Object o(String str, ContinuationImpl continuationImpl) throws Exception {
        WalletRemoteDataSourceImpl$syncUserAllWalletsMetaData$1 walletRemoteDataSourceImpl$syncUserAllWalletsMetaData$1;
        if (continuationImpl instanceof WalletRemoteDataSourceImpl$syncUserAllWalletsMetaData$1) {
            walletRemoteDataSourceImpl$syncUserAllWalletsMetaData$1 = (WalletRemoteDataSourceImpl$syncUserAllWalletsMetaData$1) continuationImpl;
            int i = walletRemoteDataSourceImpl$syncUserAllWalletsMetaData$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                walletRemoteDataSourceImpl$syncUserAllWalletsMetaData$1.label = i - Integer.MIN_VALUE;
            } else {
                walletRemoteDataSourceImpl$syncUserAllWalletsMetaData$1 = new WalletRemoteDataSourceImpl$syncUserAllWalletsMetaData$1(this, continuationImpl);
            }
        } else {
            walletRemoteDataSourceImpl$syncUserAllWalletsMetaData$1 = new WalletRemoteDataSourceImpl$syncUserAllWalletsMetaData$1(this, continuationImpl);
        }
        Object objC = walletRemoteDataSourceImpl$syncUserAllWalletsMetaData$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = walletRemoteDataSourceImpl$syncUserAllWalletsMetaData$1.label;
        if (i2 == 0) {
            ResultKt.b(objC);
            NetworkRequestBuilder networkRequestBuilderD = this.f11018a.d();
            networkRequestBuilderD.j("payments/public/ppi/v1/digital-wallets");
            networkRequestBuilderD.f(HttpRequestType.GET);
            networkRequestBuilderD.b();
            networkRequestBuilderD.a("userId", str, networkRequestBuilderD.f6519a.e);
            ChaloRequest chaloRequestE = networkRequestBuilderD.e();
            walletRemoteDataSourceImpl$syncUserAllWalletsMetaData$1.label = 1;
            objC = chaloRequestE.c(walletRemoteDataSourceImpl$syncUserAllWalletsMetaData$1);
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
        Object objB = null;
        if (!z) {
            throw GenericNetworkExceptionMapper.a(networkResponse, null, new hp1(2));
        }
        Json json = ChaloJson.b;
        NetworkSuccessResponseParseException networkSuccessResponseParseException = new NetworkSuccessResponseParseException("Response json is either null or empty");
        if (str2 != null) {
            try {
                json.getClass();
                objB = json.b(str2, BuiltinSerializersKt.c(AllWalletsSyncResponseApiModel.INSTANCE.serializer()));
            } catch (Exception e) {
                networkSuccessResponseParseException = new NetworkSuccessResponseParseException(t8.g(AllWalletsSyncResponseApiModel.class, e.getMessage(), str2));
                networkResponse.g.b(networkSuccessResponseParseException);
            }
        }
        if (objB != null) {
            return (AllWalletsSyncResponseApiModel) objB;
        }
        throw networkSuccessResponseParseException;
    }
}
