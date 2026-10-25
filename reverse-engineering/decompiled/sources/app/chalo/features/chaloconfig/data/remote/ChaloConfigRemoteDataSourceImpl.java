package app.chalo.features.chaloconfig.data.remote;

import app.chalo.contract.BasicInfoContract;
import app.chalo.features.chaloconfig.data.model.ChaloConfigApiResponseModel;
import app.chalo.features.language.data.Language;
import app.chalo.network.NetworkManager;
import app.chalo.network.config.ChaloJson;
import app.chalo.network.exception.NetworkSuccessResponseParseException;
import app.chalo.network.mapper.GenericNetworkExceptionMapper;
import app.chalo.network.rest.request.ChaloRequest;
import app.chalo.network.rest.request.HttpRequestType;
import app.chalo.network.rest.request.NetworkRequestBuilder;
import app.chalo.network.rest.response.NetworkResponse;
import defpackage.bj;
import defpackage.t8;
import defpackage.vo1;
import java.io.Serializable;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.collections.MapsKt;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.builtins.BuiltinSerializersKt;
import kotlinx.serialization.json.Json;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lapp/chalo/features/chaloconfig/data/remote/ChaloConfigRemoteDataSourceImpl;", "Lapp/chalo/features/chaloconfig/data/remote/ChaloConfigRemoteDataSource;", "Companion", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class ChaloConfigRemoteDataSourceImpl implements ChaloConfigRemoteDataSource {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final NetworkManager f2644a;
    public final BasicInfoContract b;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0004R\u0014\u0010\u0007\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0004R\u0014\u0010\b\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\u0004¨\u0006\t"}, d2 = {"Lapp/chalo/features/chaloconfig/data/remote/ChaloConfigRemoteDataSourceImpl$Companion;", "", "", "CHALO_CONFIG_ENDPOINT_V2", "Ljava/lang/String;", "QUERY_PARAM_LOCALE", "QUERY_PARAM_APP_VER", "HEADER_IF_NONE_MATCH", "HEADER_ETAG", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f2645a;

        static {
            int[] iArr = new int[Language.values().length];
            try {
                iArr[Language.ENGLISH.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            f2645a = iArr;
        }
    }

    public ChaloConfigRemoteDataSourceImpl(NetworkManager networkManager, GenericNetworkExceptionMapper genericNetworkExceptionMapper, BasicInfoContract basicInfoContract) {
        this.f2644a = networkManager;
        this.b = basicInfoContract;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // app.chalo.features.chaloconfig.data.remote.ChaloConfigRemoteDataSource
    public final Serializable a(Language language, String str, ContinuationImpl continuationImpl) throws Exception {
        ChaloConfigRemoteDataSourceImpl$fetchChaloConfig$1 chaloConfigRemoteDataSourceImpl$fetchChaloConfig$1;
        Object objB;
        if (continuationImpl instanceof ChaloConfigRemoteDataSourceImpl$fetchChaloConfig$1) {
            chaloConfigRemoteDataSourceImpl$fetchChaloConfig$1 = (ChaloConfigRemoteDataSourceImpl$fetchChaloConfig$1) continuationImpl;
            int i = chaloConfigRemoteDataSourceImpl$fetchChaloConfig$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                chaloConfigRemoteDataSourceImpl$fetchChaloConfig$1.label = i - Integer.MIN_VALUE;
            } else {
                chaloConfigRemoteDataSourceImpl$fetchChaloConfig$1 = new ChaloConfigRemoteDataSourceImpl$fetchChaloConfig$1(this, continuationImpl);
            }
        } else {
            chaloConfigRemoteDataSourceImpl$fetchChaloConfig$1 = new ChaloConfigRemoteDataSourceImpl$fetchChaloConfig$1(this, continuationImpl);
        }
        Object objC = chaloConfigRemoteDataSourceImpl$fetchChaloConfig$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = chaloConfigRemoteDataSourceImpl$fetchChaloConfig$1.label;
        if (i2 == 0) {
            ResultKt.b(objC);
            int i3 = WhenMappings.f2645a[language.ordinal()];
            BasicInfoContract basicInfoContract = this.b;
            Map mapS = i3 == 1 ? vo1.s("appVer", String.valueOf(basicInfoContract.h())) : MapsKt.i(new Pair("locale", language.getLocale()), new Pair("appVer", String.valueOf(basicInfoContract.h())));
            String message = "Rc fetch queries: " + mapS;
            Intrinsics.i(message, "message");
            NetworkRequestBuilder networkRequestBuilderD = this.f2644a.d();
            networkRequestBuilderD.j("configuration/rc/v2");
            networkRequestBuilderD.h(mapS);
            if (str == null) {
                str = "";
            }
            networkRequestBuilderD.a("If-None-Match", str, networkRequestBuilderD.f6519a.e);
            networkRequestBuilderD.f(HttpRequestType.GET);
            ChaloRequest chaloRequestE = networkRequestBuilderD.e();
            chaloConfigRemoteDataSourceImpl$fetchChaloConfig$1.label = 1;
            objC = chaloRequestE.c(chaloConfigRemoteDataSourceImpl$fetchChaloConfig$1);
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
        String message2 = "Rc fetch success: " + z;
        Intrinsics.i(message2, "message");
        if (!networkResponse.f6522a) {
            throw GenericNetworkExceptionMapper.a(networkResponse, null, new bj(9));
        }
        Json json = ChaloJson.b;
        NetworkSuccessResponseParseException networkSuccessResponseParseException = new NetworkSuccessResponseParseException("Response json is either null or empty");
        if (str2 != null) {
            try {
                json.getClass();
                objB = json.b(str2, BuiltinSerializersKt.c(ChaloConfigApiResponseModel.INSTANCE.serializer()));
            } catch (Exception e) {
                networkSuccessResponseParseException = new NetworkSuccessResponseParseException(t8.g(ChaloConfigApiResponseModel.class, e.getMessage(), str2));
                networkResponse.g.b(networkSuccessResponseParseException);
                objB = null;
            }
        } else {
            objB = null;
        }
        if (objB == null) {
            throw networkSuccessResponseParseException;
        }
        Map map = networkResponse.e;
        return new Pair(objB, map != null ? (List) map.get("etag") : null);
    }
}
