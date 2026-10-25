package app.chalo.ncmc.remote;

import app.chalo.ncmc.data.NcmcCardResponseApiModel;
import app.chalo.ncmc.data.NcmcOfflineRechargeRequestApiModel;
import app.chalo.ncmc.data.NcmcOfflineRechargeResponseApiModel;
import app.chalo.network.NetworkManager;
import app.chalo.network.config.ChaloJson;
import app.chalo.network.exception.NetworkSuccessResponseParseException;
import app.chalo.network.mapper.GenericNetworkExceptionMapper;
import app.chalo.network.rest.request.ChaloRequest;
import app.chalo.network.rest.request.HttpRequestType;
import app.chalo.network.rest.request.NetworkRequestBuilder;
import app.chalo.network.rest.response.NetworkResponse;
import app.chalo.providers.stringprovider.StringEnum;
import app.chalo.providers.stringprovider.StringProvider;
import defpackage.hj0;
import defpackage.im0;
import defpackage.sk0;
import defpackage.t8;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.serialization.builtins.BuiltinSerializersKt;
import kotlinx.serialization.json.Json;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lapp/chalo/ncmc/remote/NcmcCardRemoteDataSource;", "Lapp/chalo/ncmc/remote/INcmcCardRemoteDataSource;", "Companion", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class NcmcCardRemoteDataSource implements INcmcCardRemoteDataSource {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final NetworkManager f6256a;
    public final StringProvider b;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0019\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0004R\u0014\u0010\u0007\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0004R\u0014\u0010\b\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\u0004R\u0014\u0010\t\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\u0004R\u0014\u0010\n\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010\u0004R\u0014\u0010\u000b\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000b\u0010\u0004R\u0014\u0010\f\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\f\u0010\u0004R\u0014\u0010\r\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\r\u0010\u0004R\u0014\u0010\u000e\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000e\u0010\u0004R\u0014\u0010\u000f\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000f\u0010\u0004R\u0014\u0010\u0010\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0010\u0010\u0004R\u0014\u0010\u0011\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0011\u0010\u0004R\u0014\u0010\u0012\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0004R\u0014\u0010\u0013\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0013\u0010\u0004R\u0014\u0010\u0014\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0014\u0010\u0004R\u0014\u0010\u0015\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0015\u0010\u0004R\u0014\u0010\u0016\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0016\u0010\u0004R\u0014\u0010\u0017\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0017\u0010\u0004R\u0014\u0010\u0018\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0018\u0010\u0004R\u0014\u0010\u0019\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0019\u0010\u0004R\u0014\u0010\u001a\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001a\u0010\u0004¨\u0006\u001b"}, d2 = {"Lapp/chalo/ncmc/remote/NcmcCardRemoteDataSource$Companion;", "", "", "SUB_URL_GET_NCMC_CARD", "Ljava/lang/String;", "PARAM_USER_ID", "PARAM_CARD_NUMBER", "PARAM_KIT_NUMBER", "PARAM_CARD_Type", "PARAM_PAGE", "SUB_URL_NCMC_OFFLINE_RECHARGE", "SUB_URL_NCMC_OFFLINE_RECHARGE_CONFIRM", "SUB_URL_NCMC_ONLINE_CREATE_ORDER", "SUB_URL_GET_CARD_TRANSACTIONS", "SUB_URL_LINK_CHALO_CARD", "SUB_URL_CARD_INFO", "PARAM_CITY", "PARAM_NCMC", "PARAM_APP_VER", "SUB_URL_CARD_RECHARGE_CONFIGURATION", "SUB_URL", "SUB_URL_GET_CARD_LINKING_ELIGIBILITY", "SUB_URL_UNLINK_CARD", "SUB_URL_BLOCK_CARD", "SUB_URL_CHANGE_NCMC_CARD_PIN", "SUB_URL_CARD_VALIDATION", "SUB_URL_UVIK_INTENT_HASH", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
    }

    public NcmcCardRemoteDataSource(NetworkManager networkManager, GenericNetworkExceptionMapper genericNetworkExceptionMapper, StringProvider stringProvider) {
        this.f6256a = networkManager;
        this.b = stringProvider;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x0172, code lost:
    
        if (r13 == r1) goto L77;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v0, types: [app.chalo.ncmc.remote.NcmcCardRemoteDataSource] */
    /* JADX WARN: Type inference failed for: r12v0, types: [java.lang.Object, java.lang.String] */
    /* JADX WARN: Type inference failed for: r12v1 */
    /* JADX WARN: Type inference failed for: r12v15 */
    /* JADX WARN: Type inference failed for: r12v17 */
    /* JADX WARN: Type inference failed for: r12v2, types: [app.chalo.network.rest.response.NetworkResponse] */
    /* JADX WARN: Type inference failed for: r12v9, types: [app.chalo.network.rest.response.NetworkResponse, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r14v12 */
    /* JADX WARN: Type inference failed for: r14v14 */
    /* JADX WARN: Type inference failed for: r14v17, types: [app.chalo.network.rest.response.NetworkResponse] */
    /* JADX WARN: Type inference failed for: r14v18 */
    /* JADX WARN: Type inference failed for: r14v8 */
    @Override // app.chalo.ncmc.remote.INcmcCardRemoteDataSource
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(java.lang.String r12, kotlin.coroutines.jvm.internal.ContinuationImpl r13, boolean r14) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 376
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: app.chalo.ncmc.remote.NcmcCardRemoteDataSource.a(java.lang.String, kotlin.coroutines.jvm.internal.ContinuationImpl, boolean):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0103, code lost:
    
        if (r13 == r1) goto L39;
     */
    @Override // app.chalo.ncmc.remote.INcmcCardRemoteDataSource
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(int r8, java.lang.String r9, java.lang.String r10, java.lang.String r11, java.lang.String r12, kotlin.coroutines.jvm.internal.ContinuationImpl r13) throws java.lang.Exception {
        /*
            Method dump skipped, instruction units count: 276
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: app.chalo.ncmc.remote.NcmcCardRemoteDataSource.b(int, java.lang.String, java.lang.String, java.lang.String, java.lang.String, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00ca, code lost:
    
        if (r9 == r1) goto L33;
     */
    @Override // app.chalo.ncmc.remote.INcmcCardRemoteDataSource
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(java.lang.String r8, kotlin.coroutines.jvm.internal.ContinuationImpl r9) throws java.lang.Exception {
        /*
            Method dump skipped, instruction units count: 218
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: app.chalo.ncmc.remote.NcmcCardRemoteDataSource.c(java.lang.String, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00ba, code lost:
    
        if (r9 == r1) goto L33;
     */
    @Override // app.chalo.ncmc.remote.INcmcCardRemoteDataSource
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d(java.lang.String r8, kotlin.coroutines.jvm.internal.ContinuationImpl r9) throws java.lang.Exception {
        /*
            Method dump skipped, instruction units count: 203
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: app.chalo.ncmc.remote.NcmcCardRemoteDataSource.d(java.lang.String, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // app.chalo.ncmc.remote.INcmcCardRemoteDataSource
    public final Object e(String str, ContinuationImpl continuationImpl) throws Exception {
        NcmcCardRemoteDataSource$getNCMCCardData$1 ncmcCardRemoteDataSource$getNCMCCardData$1;
        if (continuationImpl instanceof NcmcCardRemoteDataSource$getNCMCCardData$1) {
            ncmcCardRemoteDataSource$getNCMCCardData$1 = (NcmcCardRemoteDataSource$getNCMCCardData$1) continuationImpl;
            int i = ncmcCardRemoteDataSource$getNCMCCardData$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                ncmcCardRemoteDataSource$getNCMCCardData$1.label = i - Integer.MIN_VALUE;
            } else {
                ncmcCardRemoteDataSource$getNCMCCardData$1 = new NcmcCardRemoteDataSource$getNCMCCardData$1(this, continuationImpl);
            }
        } else {
            ncmcCardRemoteDataSource$getNCMCCardData$1 = new NcmcCardRemoteDataSource$getNCMCCardData$1(this, continuationImpl);
        }
        Object objC = ncmcCardRemoteDataSource$getNCMCCardData$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = ncmcCardRemoteDataSource$getNCMCCardData$1.label;
        if (i2 == 0) {
            ResultKt.b(objC);
            NetworkRequestBuilder networkRequestBuilderD = this.f6256a.d();
            networkRequestBuilderD.j("payments/public/wallet/v2/user/card");
            networkRequestBuilderD.a("userId", str, networkRequestBuilderD.f6519a.f);
            networkRequestBuilderD.b();
            networkRequestBuilderD.f(HttpRequestType.GET);
            ChaloRequest chaloRequestE = networkRequestBuilderD.e();
            ncmcCardRemoteDataSource$getNCMCCardData$1.label = 1;
            objC = chaloRequestE.c(ncmcCardRemoteDataSource$getNCMCCardData$1);
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
            throw GenericNetworkExceptionMapper.a(networkResponse, null, new im0(0));
        }
        Json json = ChaloJson.b;
        NetworkSuccessResponseParseException networkSuccessResponseParseException = new NetworkSuccessResponseParseException("Response json is either null or empty");
        if (str2 != null) {
            try {
                json.getClass();
                objB = json.b(str2, BuiltinSerializersKt.c(NcmcCardResponseApiModel.INSTANCE.serializer()));
            } catch (Exception e) {
                networkSuccessResponseParseException = new NetworkSuccessResponseParseException(t8.g(NcmcCardResponseApiModel.class, e.getMessage(), str2));
                networkResponse.g.b(networkSuccessResponseParseException);
            }
        }
        if (objB != null) {
            return (NcmcCardResponseApiModel) objB;
        }
        throw networkSuccessResponseParseException;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00c5, code lost:
    
        if (r9 == r1) goto L33;
     */
    @Override // app.chalo.ncmc.remote.INcmcCardRemoteDataSource
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object f(app.chalo.ncmc.data.apirequestmodel.ChangeNcmcCardPinApiRequestModel r8, kotlin.coroutines.jvm.internal.ContinuationImpl r9) throws java.lang.Exception {
        /*
            Method dump skipped, instruction units count: 214
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: app.chalo.ncmc.remote.NcmcCardRemoteDataSource.f(app.chalo.ncmc.data.apirequestmodel.ChangeNcmcCardPinApiRequestModel, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00c1, code lost:
    
        if (r8 == r1) goto L33;
     */
    @Override // app.chalo.ncmc.remote.INcmcCardRemoteDataSource
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object g(java.lang.String r7, kotlin.coroutines.jvm.internal.ContinuationImpl r8) throws java.lang.Exception {
        /*
            Method dump skipped, instruction units count: 210
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: app.chalo.ncmc.remote.NcmcCardRemoteDataSource.g(java.lang.String, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00c5, code lost:
    
        if (r9 == r1) goto L33;
     */
    @Override // app.chalo.ncmc.remote.INcmcCardRemoteDataSource
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object h(app.chalo.ncmc.data.apirequestmodel.BlockNCMCCardApiRequestModel r8, kotlin.coroutines.jvm.internal.ContinuationImpl r9) throws java.lang.Exception {
        /*
            Method dump skipped, instruction units count: 214
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: app.chalo.ncmc.remote.NcmcCardRemoteDataSource.h(app.chalo.ncmc.data.apirequestmodel.BlockNCMCCardApiRequestModel, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // app.chalo.ncmc.remote.INcmcCardRemoteDataSource
    public final Object i(NcmcOfflineRechargeRequestApiModel ncmcOfflineRechargeRequestApiModel, ContinuationImpl continuationImpl) throws Exception {
        NcmcCardRemoteDataSource$placeNcmcOfflineWalletRechargeOrder$1 ncmcCardRemoteDataSource$placeNcmcOfflineWalletRechargeOrder$1;
        if (continuationImpl instanceof NcmcCardRemoteDataSource$placeNcmcOfflineWalletRechargeOrder$1) {
            ncmcCardRemoteDataSource$placeNcmcOfflineWalletRechargeOrder$1 = (NcmcCardRemoteDataSource$placeNcmcOfflineWalletRechargeOrder$1) continuationImpl;
            int i = ncmcCardRemoteDataSource$placeNcmcOfflineWalletRechargeOrder$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                ncmcCardRemoteDataSource$placeNcmcOfflineWalletRechargeOrder$1.label = i - Integer.MIN_VALUE;
            } else {
                ncmcCardRemoteDataSource$placeNcmcOfflineWalletRechargeOrder$1 = new NcmcCardRemoteDataSource$placeNcmcOfflineWalletRechargeOrder$1(this, continuationImpl);
            }
        } else {
            ncmcCardRemoteDataSource$placeNcmcOfflineWalletRechargeOrder$1 = new NcmcCardRemoteDataSource$placeNcmcOfflineWalletRechargeOrder$1(this, continuationImpl);
        }
        Object objC = ncmcCardRemoteDataSource$placeNcmcOfflineWalletRechargeOrder$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = ncmcCardRemoteDataSource$placeNcmcOfflineWalletRechargeOrder$1.label;
        if (i2 == 0) {
            ResultKt.b(objC);
            NetworkRequestBuilder networkRequestBuilderD = this.f6256a.d();
            networkRequestBuilderD.j("mticketing/v1/wallet/ncmc/offlineRecharge");
            networkRequestBuilderD.f(HttpRequestType.POST);
            networkRequestBuilderD.b();
            Json json = ChaloJson.b;
            json.getClass();
            networkRequestBuilderD.i(json.a(NcmcOfflineRechargeRequestApiModel.INSTANCE.serializer(), ncmcOfflineRechargeRequestApiModel));
            ChaloRequest chaloRequestE = networkRequestBuilderD.e();
            ncmcCardRemoteDataSource$placeNcmcOfflineWalletRechargeOrder$1.label = 1;
            objC = chaloRequestE.c(ncmcCardRemoteDataSource$placeNcmcOfflineWalletRechargeOrder$1);
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
            throw GenericNetworkExceptionMapper.a(networkResponse, null, new sk0(28));
        }
        Json json2 = ChaloJson.b;
        NetworkSuccessResponseParseException networkSuccessResponseParseException = new NetworkSuccessResponseParseException("Response json is either null or empty");
        if (str != null) {
            try {
                json2.getClass();
                objB = json2.b(str, BuiltinSerializersKt.c(NcmcOfflineRechargeResponseApiModel.INSTANCE.serializer()));
            } catch (Exception e) {
                networkSuccessResponseParseException = new NetworkSuccessResponseParseException(t8.g(NcmcOfflineRechargeResponseApiModel.class, e.getMessage(), str));
                networkResponse.g.b(networkSuccessResponseParseException);
            }
        }
        if (objB != null) {
            return (NcmcOfflineRechargeResponseApiModel) objB;
        }
        throw networkSuccessResponseParseException;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00c5, code lost:
    
        if (r9 == r1) goto L33;
     */
    @Override // app.chalo.ncmc.remote.INcmcCardRemoteDataSource
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object j(app.chalo.models.CreateCardRechargeOrderRequestApiModel r8, kotlin.coroutines.jvm.internal.ContinuationImpl r9) throws java.lang.Exception {
        /*
            Method dump skipped, instruction units count: 213
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: app.chalo.ncmc.remote.NcmcCardRemoteDataSource.j(app.chalo.models.CreateCardRechargeOrderRequestApiModel, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00c5, code lost:
    
        if (r9 == r1) goto L33;
     */
    @Override // app.chalo.ncmc.remote.INcmcCardRemoteDataSource
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object k(app.chalo.ncmc.data.apirequestmodel.LinkChaloCardRequestApiModel r8, kotlin.coroutines.jvm.internal.ContinuationImpl r9) throws java.lang.Exception {
        /*
            Method dump skipped, instruction units count: 214
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: app.chalo.ncmc.remote.NcmcCardRemoteDataSource.k(app.chalo.ncmc.data.apirequestmodel.LinkChaloCardRequestApiModel, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00d4, code lost:
    
        if (r10 == r1) goto L33;
     */
    @Override // app.chalo.ncmc.remote.INcmcCardRemoteDataSource
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object l(app.chalo.ncmc.domain.CardValidationRequestApiModel r9, kotlin.coroutines.jvm.internal.ContinuationImpl r10) throws java.lang.Exception {
        /*
            Method dump skipped, instruction units count: 228
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: app.chalo.ncmc.remote.NcmcCardRemoteDataSource.l(app.chalo.ncmc.domain.CardValidationRequestApiModel, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00c5, code lost:
    
        if (r9 == r1) goto L33;
     */
    @Override // app.chalo.ncmc.remote.INcmcCardRemoteDataSource
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m(app.chalo.ncmc.data.NcmcOnlineCardRechargeRequestApiModel r8, kotlin.coroutines.jvm.internal.ContinuationImpl r9) throws java.lang.Exception {
        /*
            Method dump skipped, instruction units count: 213
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: app.chalo.ncmc.remote.NcmcCardRemoteDataSource.m(app.chalo.ncmc.data.NcmcOnlineCardRechargeRequestApiModel, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00c5, code lost:
    
        if (r9 == r1) goto L33;
     */
    @Override // app.chalo.ncmc.remote.INcmcCardRemoteDataSource
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object n(app.chalo.ncmc.data.NcmcOfflineRechargeConfirmRequestModel r8, kotlin.coroutines.jvm.internal.ContinuationImpl r9) throws java.lang.Exception {
        /*
            Method dump skipped, instruction units count: 214
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: app.chalo.ncmc.remote.NcmcCardRemoteDataSource.n(app.chalo.ncmc.data.NcmcOfflineRechargeConfirmRequestModel, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00c5, code lost:
    
        if (r9 == r1) goto L33;
     */
    @Override // app.chalo.ncmc.remote.INcmcCardRemoteDataSource
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object o(app.chalo.ncmc.data.apirequestmodel.IntentHashRequestApiModel r8, kotlin.coroutines.jvm.internal.ContinuationImpl r9) throws java.lang.Exception {
        /*
            Method dump skipped, instruction units count: 214
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: app.chalo.ncmc.remote.NcmcCardRemoteDataSource.o(app.chalo.ncmc.data.apirequestmodel.IntentHashRequestApiModel, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Serializable p(NetworkResponse networkResponse, ContinuationImpl continuationImpl) {
        NcmcCardRemoteDataSource$fetchLinkedChaloCardsInfoError$1 ncmcCardRemoteDataSource$fetchLinkedChaloCardsInfoError$1;
        if (continuationImpl instanceof NcmcCardRemoteDataSource$fetchLinkedChaloCardsInfoError$1) {
            ncmcCardRemoteDataSource$fetchLinkedChaloCardsInfoError$1 = (NcmcCardRemoteDataSource$fetchLinkedChaloCardsInfoError$1) continuationImpl;
            int i = ncmcCardRemoteDataSource$fetchLinkedChaloCardsInfoError$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                ncmcCardRemoteDataSource$fetchLinkedChaloCardsInfoError$1.label = i - Integer.MIN_VALUE;
            } else {
                ncmcCardRemoteDataSource$fetchLinkedChaloCardsInfoError$1 = new NcmcCardRemoteDataSource$fetchLinkedChaloCardsInfoError$1(this, continuationImpl);
            }
        } else {
            ncmcCardRemoteDataSource$fetchLinkedChaloCardsInfoError$1 = new NcmcCardRemoteDataSource$fetchLinkedChaloCardsInfoError$1(this, continuationImpl);
        }
        Object objB = ncmcCardRemoteDataSource$fetchLinkedChaloCardsInfoError$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = ncmcCardRemoteDataSource$fetchLinkedChaloCardsInfoError$1.label;
        if (i2 == 0) {
            ResultKt.b(objB);
            ncmcCardRemoteDataSource$fetchLinkedChaloCardsInfoError$1.L$0 = networkResponse;
            ncmcCardRemoteDataSource$fetchLinkedChaloCardsInfoError$1.label = 1;
            objB = this.b.b(StringEnum.SOMETHING_WENT_WRONG, new Object[0], ncmcCardRemoteDataSource$fetchLinkedChaloCardsInfoError$1);
            if (objB == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            networkResponse = (NetworkResponse) ncmcCardRemoteDataSource$fetchLinkedChaloCardsInfoError$1.L$0;
            ResultKt.b(objB);
        }
        return GenericNetworkExceptionMapper.a(networkResponse, null, new hj0((String) objB, 10));
    }
}
