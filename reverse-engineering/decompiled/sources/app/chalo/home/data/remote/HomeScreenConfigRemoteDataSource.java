package app.chalo.home.data.remote;

import app.chalo.contract.BasicInfoContract;
import app.chalo.home.data.model.api.response.CheckAppUpdateResponseApiModel;
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
import defpackage.n10;
import defpackage.t8;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.serialization.builtins.BuiltinSerializersKt;
import kotlinx.serialization.json.Json;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lapp/chalo/home/data/remote/HomeScreenConfigRemoteDataSource;", "Lapp/chalo/home/data/remote/IHomeScreenConfigRemoteDataSource;", "Companion", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class HomeScreenConfigRemoteDataSource implements IHomeScreenConfigRemoteDataSource {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final NetworkManager f2977a;
    public final StringProvider b;
    public final BasicInfoContract c;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\f\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0004R\u0014\u0010\u0007\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0004R\u0014\u0010\b\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\u0004R\u0014\u0010\t\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\u0004R\u0014\u0010\n\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010\u0004R\u0014\u0010\u000b\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000b\u0010\u0004R\u0014\u0010\f\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\f\u0010\u0004R\u0014\u0010\r\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\r\u0010\u0004¨\u0006\u000e"}, d2 = {"Lapp/chalo/home/data/remote/HomeScreenConfigRemoteDataSource$Companion;", "", "", "USER_ID", "Ljava/lang/String;", "PATH_PARAM_CITY", "HOME_SCREEN_CONFIG_URL", "QUERY_PARAM_SOURCE", "QUERY_PARAM_APP_VER", "AUTO_LINK_DEVICE_ID_URL", "CHECK_UPDATE_URL", "HEADER_IF_NONE_MATCH", "HEADER_ETAG", "HEADER_LOCALE", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
    }

    public HomeScreenConfigRemoteDataSource(NetworkManager networkManager, GenericNetworkExceptionMapper genericNetworkExceptionMapper, StringProvider stringProvider, BasicInfoContract basicInfoContract) {
        this.f2977a = networkManager;
        this.b = stringProvider;
        this.c = basicInfoContract;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // app.chalo.home.data.remote.IHomeScreenConfigRemoteDataSource
    public final Object a(ContinuationImpl continuationImpl) throws Exception {
        HomeScreenConfigRemoteDataSource$checkIfUpdateRequired$1 homeScreenConfigRemoteDataSource$checkIfUpdateRequired$1;
        NetworkResponse networkResponse;
        if (continuationImpl instanceof HomeScreenConfigRemoteDataSource$checkIfUpdateRequired$1) {
            homeScreenConfigRemoteDataSource$checkIfUpdateRequired$1 = (HomeScreenConfigRemoteDataSource$checkIfUpdateRequired$1) continuationImpl;
            int i = homeScreenConfigRemoteDataSource$checkIfUpdateRequired$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                homeScreenConfigRemoteDataSource$checkIfUpdateRequired$1.label = i - Integer.MIN_VALUE;
            } else {
                homeScreenConfigRemoteDataSource$checkIfUpdateRequired$1 = new HomeScreenConfigRemoteDataSource$checkIfUpdateRequired$1(this, continuationImpl);
            }
        } else {
            homeScreenConfigRemoteDataSource$checkIfUpdateRequired$1 = new HomeScreenConfigRemoteDataSource$checkIfUpdateRequired$1(this, continuationImpl);
        }
        Object objC = homeScreenConfigRemoteDataSource$checkIfUpdateRequired$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = homeScreenConfigRemoteDataSource$checkIfUpdateRequired$1.label;
        Object objB = null;
        if (i2 != 0) {
            if (i2 == 1) {
                ResultKt.b(objC);
            } else {
                if (i2 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                networkResponse = (NetworkResponse) homeScreenConfigRemoteDataSource$checkIfUpdateRequired$1.L$0;
                ResultKt.b(objC);
            }
            throw GenericNetworkExceptionMapper.a(networkResponse, null, new n10((String) objC, 9));
        }
        ResultKt.b(objC);
        NetworkRequestBuilder networkRequestBuilderD = this.f2977a.d();
        networkRequestBuilderD.j("configuration/v1/appVersionCheck");
        networkRequestBuilderD.f(HttpRequestType.GET);
        networkRequestBuilderD.b();
        ChaloRequest chaloRequestE = networkRequestBuilderD.e();
        homeScreenConfigRemoteDataSource$checkIfUpdateRequired$1.label = 1;
        objC = chaloRequestE.c(homeScreenConfigRemoteDataSource$checkIfUpdateRequired$1);
        if (objC != coroutineSingletons) {
        }
        return coroutineSingletons;
        NetworkResponse networkResponse2 = (NetworkResponse) objC;
        boolean z = networkResponse2.f6522a;
        String str = networkResponse2.c;
        if (!z) {
            homeScreenConfigRemoteDataSource$checkIfUpdateRequired$1.L$0 = networkResponse2;
            homeScreenConfigRemoteDataSource$checkIfUpdateRequired$1.label = 2;
            Object objB2 = this.b.b(StringEnum.SOMETHING_WENT_WRONG, new Object[0], homeScreenConfigRemoteDataSource$checkIfUpdateRequired$1);
            if (objB2 != coroutineSingletons) {
                networkResponse = networkResponse2;
                objC = objB2;
                throw GenericNetworkExceptionMapper.a(networkResponse, null, new n10((String) objC, 9));
            }
            return coroutineSingletons;
        }
        Json json = ChaloJson.b;
        NetworkSuccessResponseParseException networkSuccessResponseParseException = new NetworkSuccessResponseParseException("Response json is either null or empty");
        if (str != null) {
            try {
                json.getClass();
                objB = json.b(str, BuiltinSerializersKt.c(CheckAppUpdateResponseApiModel.INSTANCE.serializer()));
            } catch (Exception e) {
                networkSuccessResponseParseException = new NetworkSuccessResponseParseException(t8.g(CheckAppUpdateResponseApiModel.class, e.getMessage(), str));
                networkResponse2.g.b(networkSuccessResponseParseException);
            }
        }
        if (objB != null) {
            return (CheckAppUpdateResponseApiModel) objB;
        }
        throw networkSuccessResponseParseException;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00f7, code lost:
    
        if (r12 == r1) goto L40;
     */
    @Override // app.chalo.home.data.remote.IHomeScreenConfigRemoteDataSource
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.io.Serializable b(java.lang.String r9, java.lang.String r10, java.lang.String r11, kotlin.coroutines.jvm.internal.ContinuationImpl r12) throws java.lang.Exception {
        /*
            Method dump skipped, instruction units count: 264
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: app.chalo.home.data.remote.HomeScreenConfigRemoteDataSource.b(java.lang.String, java.lang.String, java.lang.String, kotlin.coroutines.jvm.internal.ContinuationImpl):java.io.Serializable");
    }
}
