package app.chalo.fileupload.data.remote;

import app.chalo.fileupload.data.models.request.UploadFileTypeRequestApiModel;
import app.chalo.fileupload.data.models.response.UploadFileResponseApiModel;
import app.chalo.network.NetworkManager;
import app.chalo.network.config.ChaloJson;
import app.chalo.network.exception.NetworkSuccessResponseParseException;
import app.chalo.network.mapper.GenericNetworkExceptionMapper;
import app.chalo.network.rest.request.ChaloRequest;
import app.chalo.network.rest.request.GenericRequestData;
import app.chalo.network.rest.request.HttpRequestType;
import app.chalo.network.rest.request.MultipartRequestData;
import app.chalo.network.rest.request.MultipartRequestFormDataType;
import app.chalo.network.rest.request.NetworkRequestBuilder;
import app.chalo.network.rest.response.NetworkResponse;
import defpackage.t8;
import defpackage.vm1;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.serialization.builtins.BuiltinSerializersKt;
import kotlinx.serialization.json.Json;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lapp/chalo/fileupload/data/remote/UploadFileRemoteDataSourceImpl;", "Lapp/chalo/fileupload/data/remote/UploadFileRemoteDataSource;", "Companion", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class UploadFileRemoteDataSourceImpl implements UploadFileRemoteDataSource {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final NetworkManager f2774a;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0004¨\u0006\u0007"}, d2 = {"Lapp/chalo/fileupload/data/remote/UploadFileRemoteDataSourceImpl$Companion;", "", "", "UPLOAD_FILE_SUB_URL", "Ljava/lang/String;", "FILE", "INFO", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
    }

    public UploadFileRemoteDataSourceImpl(NetworkManager networkManager, GenericNetworkExceptionMapper genericNetworkExceptionMapper) {
        this.f2774a = networkManager;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // app.chalo.fileupload.data.remote.UploadFileRemoteDataSource
    public final Object a(String str, UploadFileTypeRequestApiModel uploadFileTypeRequestApiModel, byte[] bArr, ContinuationImpl continuationImpl) throws Exception {
        UploadFileRemoteDataSourceImpl$uploadFileToServer$1 uploadFileRemoteDataSourceImpl$uploadFileToServer$1;
        if (continuationImpl instanceof UploadFileRemoteDataSourceImpl$uploadFileToServer$1) {
            uploadFileRemoteDataSourceImpl$uploadFileToServer$1 = (UploadFileRemoteDataSourceImpl$uploadFileToServer$1) continuationImpl;
            int i = uploadFileRemoteDataSourceImpl$uploadFileToServer$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                uploadFileRemoteDataSourceImpl$uploadFileToServer$1.label = i - Integer.MIN_VALUE;
            } else {
                uploadFileRemoteDataSourceImpl$uploadFileToServer$1 = new UploadFileRemoteDataSourceImpl$uploadFileToServer$1(this, continuationImpl);
            }
        } else {
            uploadFileRemoteDataSourceImpl$uploadFileToServer$1 = new UploadFileRemoteDataSourceImpl$uploadFileToServer$1(this, continuationImpl);
        }
        Object objC = uploadFileRemoteDataSourceImpl$uploadFileToServer$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = uploadFileRemoteDataSourceImpl$uploadFileToServer$1.label;
        if (i2 == 0) {
            ResultKt.b(objC);
            MultipartRequestFormDataType.ByteArrayData byteArrayData = new MultipartRequestFormDataType.ByteArrayData(str, bArr);
            Json json = ChaloJson.b;
            json.getClass();
            MultipartRequestFormDataType.StringData stringData = new MultipartRequestFormDataType.StringData(json.a(UploadFileTypeRequestApiModel.INSTANCE.serializer(), uploadFileTypeRequestApiModel));
            NetworkRequestBuilder networkRequestBuilderB = this.f2774a.b();
            networkRequestBuilderB.j("files/v1/upload");
            GenericRequestData genericRequestData = networkRequestBuilderB.f6519a;
            networkRequestBuilderB.f(HttpRequestType.POST);
            if (!(genericRequestData instanceof MultipartRequestData)) {
                throw new IllegalStateException("Please use NetworkManager.getStandardNetworkRequestBuilderForMultipartRequest() for multipart request");
            }
            MultipartRequestData multipartRequestData = (MultipartRequestData) genericRequestData;
            multipartRequestData.s = byteArrayData;
            multipartRequestData.t = stringData;
            networkRequestBuilderB.b();
            ChaloRequest chaloRequestE = networkRequestBuilderB.e();
            uploadFileRemoteDataSourceImpl$uploadFileToServer$1.label = 1;
            objC = chaloRequestE.c(uploadFileRemoteDataSourceImpl$uploadFileToServer$1);
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
            throw GenericNetworkExceptionMapper.a(networkResponse, null, new vm1(10));
        }
        Json json2 = ChaloJson.b;
        NetworkSuccessResponseParseException networkSuccessResponseParseException = new NetworkSuccessResponseParseException("Response json is either null or empty");
        if (str2 != null) {
            try {
                json2.getClass();
                objB = json2.b(str2, BuiltinSerializersKt.c(UploadFileResponseApiModel.INSTANCE.serializer()));
            } catch (Exception e) {
                networkSuccessResponseParseException = new NetworkSuccessResponseParseException(t8.g(UploadFileResponseApiModel.class, e.getMessage(), str2));
                networkResponse.g.b(networkSuccessResponseParseException);
            }
        }
        if (objB != null) {
            return (UploadFileResponseApiModel) objB;
        }
        throw networkSuccessResponseParseException;
    }
}
