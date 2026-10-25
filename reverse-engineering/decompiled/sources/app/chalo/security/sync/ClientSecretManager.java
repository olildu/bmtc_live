package app.chalo.security.sync;

import app.chalo.network.NetworkManager;
import app.chalo.network.config.ChaloJson;
import app.chalo.network.exception.NetworkSuccessResponseParseException;
import app.chalo.network.rest.request.ChaloRequest;
import app.chalo.network.rest.request.HttpRequestType;
import app.chalo.network.rest.request.NetworkRequestBuilder;
import app.chalo.network.rest.response.NetworkResponse;
import app.chalo.security.sync.config.dao.ConfigDao;
import app.chalo.security.sync.config.entity.ConfigEntity;
import app.chalo.security.sync.secret.ClientSecretResponseModel;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Reflection;
import kotlinx.serialization.builtins.BuiltinSerializersKt;
import kotlinx.serialization.json.Json;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lapp/chalo/security/sync/ClientSecretManager;", "", "Companion", "security_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class ClientSecretManager {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ConfigDao f9375a;
    public final NetworkManager b;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004¨\u0006\u0006"}, d2 = {"Lapp/chalo/security/sync/ClientSecretManager$Companion;", "", "", "SUB_URL_SECRET_KEY", "Ljava/lang/String;", "SERVER_PUBLIC_KEY", "security_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
    }

    public ClientSecretManager(ConfigDao configDao, NetworkManager networkManager) {
        this.f9375a = configDao;
        this.b = networkManager;
    }

    /* JADX WARN: Code duplicated, block: B:32:0x0081 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(ContinuationImpl continuationImpl) throws NetworkSuccessResponseParseException {
        ClientSecretManager$getClientSecret$1 clientSecretManager$getClientSecret$1;
        String str;
        ConfigEntity configEntity;
        if (continuationImpl instanceof ClientSecretManager$getClientSecret$1) {
            clientSecretManager$getClientSecret$1 = (ClientSecretManager$getClientSecret$1) continuationImpl;
            int i = clientSecretManager$getClientSecret$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                clientSecretManager$getClientSecret$1.label = i - Integer.MIN_VALUE;
            } else {
                clientSecretManager$getClientSecret$1 = new ClientSecretManager$getClientSecret$1(this, continuationImpl);
            }
        } else {
            clientSecretManager$getClientSecret$1 = new ClientSecretManager$getClientSecret$1(this, continuationImpl);
        }
        Object objA = clientSecretManager$getClientSecret$1.result;
        Object obj = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = clientSecretManager$getClientSecret$1.label;
        ConfigDao configDao = this.f9375a;
        if (i2 == 0) {
            ResultKt.b(objA);
            clientSecretManager$getClientSecret$1.label = 1;
            objA = configDao.a(clientSecretManager$getClientSecret$1);
            if (objA != obj) {
            }
            return obj;
        }
        if (i2 == 1) {
            ResultKt.b(objA);
        } else {
            if (i2 != 2) {
                if (i2 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                String str2 = (String) clientSecretManager$getClientSecret$1.L$0;
                ResultKt.b(objA);
                return str2;
            }
            ResultKt.b(objA);
        }
        str = (String) objA;
        System.out.println((Object) "fetched key from sever");
        configEntity = new ConfigEntity("SERVER_PUBLIC_KEY", str);
        clientSecretManager$getClientSecret$1.L$0 = str;
        clientSecretManager$getClientSecret$1.label = 3;
        if (configDao.b(configEntity, clientSecretManager$getClientSecret$1) != obj) {
            return obj;
        }
        return str;
        ConfigEntity configEntity2 = (ConfigEntity) objA;
        if (configEntity2 != null) {
            System.out.println((Object) "got key from db");
            return configEntity2.b;
        }
        clientSecretManager$getClientSecret$1.label = 2;
        objA = b(clientSecretManager$getClientSecret$1);
        if (objA != obj) {
            str = (String) objA;
            System.out.println((Object) "fetched key from sever");
            configEntity = new ConfigEntity("SERVER_PUBLIC_KEY", str);
            clientSecretManager$getClientSecret$1.L$0 = str;
            clientSecretManager$getClientSecret$1.label = 3;
            if (configDao.b(configEntity, clientSecretManager$getClientSecret$1) != obj) {
                return str;
            }
        }
        return obj;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object b(ContinuationImpl continuationImpl) throws NetworkSuccessResponseParseException {
        ClientSecretManager$sendServerPublicKey$1 clientSecretManager$sendServerPublicKey$1;
        if (continuationImpl instanceof ClientSecretManager$sendServerPublicKey$1) {
            clientSecretManager$sendServerPublicKey$1 = (ClientSecretManager$sendServerPublicKey$1) continuationImpl;
            int i = clientSecretManager$sendServerPublicKey$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                clientSecretManager$sendServerPublicKey$1.label = i - Integer.MIN_VALUE;
            } else {
                clientSecretManager$sendServerPublicKey$1 = new ClientSecretManager$sendServerPublicKey$1(this, continuationImpl);
            }
        } else {
            clientSecretManager$sendServerPublicKey$1 = new ClientSecretManager$sendServerPublicKey$1(this, continuationImpl);
        }
        Object objC = clientSecretManager$sendServerPublicKey$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = clientSecretManager$sendServerPublicKey$1.label;
        if (i2 == 0) {
            ResultKt.b(objC);
            System.out.println((Object) "making api call for server public key");
            NetworkRequestBuilder networkRequestBuilderD = this.b.d();
            networkRequestBuilderD.b();
            networkRequestBuilderD.c();
            networkRequestBuilderD.j("mticketing/v2/client/secret");
            networkRequestBuilderD.f(HttpRequestType.GET);
            ChaloRequest chaloRequestE = networkRequestBuilderD.e();
            clientSecretManager$sendServerPublicKey$1.label = 1;
            objC = chaloRequestE.c(clientSecretManager$sendServerPublicKey$1);
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
        Json json = ChaloJson.b;
        NetworkSuccessResponseParseException networkSuccessResponseParseException = new NetworkSuccessResponseParseException("Response json is either null or empty");
        Object objB = null;
        try {
            String str = networkResponse.c;
            if (str != null) {
                json.getClass();
                objB = json.b(str, BuiltinSerializersKt.c(ClientSecretResponseModel.INSTANCE.serializer()));
            }
        } catch (Exception e) {
            networkSuccessResponseParseException = new NetworkSuccessResponseParseException(NetworkResponse.Companion.a(e.getMessage(), Reflection.a(ClientSecretResponseModel.class).f(), networkResponse.c));
            networkResponse.g.b(networkSuccessResponseParseException);
        }
        if (objB != null) {
            return ((ClientSecretResponseModel) objB).f9393a;
        }
        throw networkSuccessResponseParseException;
    }
}
