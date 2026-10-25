package app.chalo.citydata.domain;

import app.chalo.citydata.data.model.app.RouteAppModel;
import app.chalo.citydata.data.model.app.request.RouteDetailsRequestOldAppModel;
import app.chalo.citydata.repository.CityDataRepository;
import app.chalo.contract.BasicInfoContract;
import app.chalo.features.language.LanguageFeature;
import app.chalo.providers.CoroutineContextProvider;
import app.chalo.providers.UserProfileDetailsProvider;
import app.chalo.providers.cityprovider.CityProvider;
import app.chalo.providers.stringprovider.StringProvider;
import app.chalo.utils.ChaloUseCaseResult;
import app.chalo.utils.timeutil.TimeUtilsContract;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/citydata/domain/FetchRouteDataFromRemoteUseCase;", "", "framework-city-data_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class FetchRouteDataFromRemoteUseCase {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CityProvider f1753a;
    public final UserProfileDetailsProvider b;
    public final LanguageFeature c;
    public final BasicInfoContract d;
    public final CityDataRepository e;
    public final FetchRoutesDataFromRemoteAndRefreshCacheIfRequiredUseCase f;
    public final StringProvider g;
    public final TimeUtilsContract h;

    public FetchRouteDataFromRemoteUseCase(CityProvider cityProvider, UserProfileDetailsProvider userProfileDetailsProvider, LanguageFeature languageFeature, BasicInfoContract basicInfoContract, CityDataRepository cityDataRepository, IsDynamicCityDataFetchEnabledUseCase isDynamicCityDataFetchEnabledUseCase, FetchRoutesDataFromRemoteAndRefreshCacheIfRequiredUseCase fetchRoutesDataFromRemoteAndRefreshCacheIfRequiredUseCase, StringProvider stringProvider, CoroutineContextProvider coroutineContextProvider, TimeUtilsContract timeUtilsContract) {
        this.f1753a = cityProvider;
        this.b = userProfileDetailsProvider;
        this.c = languageFeature;
        this.d = basicInfoContract;
        this.e = cityDataRepository;
        this.f = fetchRoutesDataFromRemoteAndRefreshCacheIfRequiredUseCase;
        this.g = stringProvider;
        this.h = timeUtilsContract;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(RouteDetailsRequestOldAppModel routeDetailsRequestOldAppModel, ContinuationImpl continuationImpl) {
        FetchRouteDataFromRemoteUseCase$fetchRouteDataWithOldModel$1 fetchRouteDataFromRemoteUseCase$fetchRouteDataWithOldModel$1;
        if (continuationImpl instanceof FetchRouteDataFromRemoteUseCase$fetchRouteDataWithOldModel$1) {
            fetchRouteDataFromRemoteUseCase$fetchRouteDataWithOldModel$1 = (FetchRouteDataFromRemoteUseCase$fetchRouteDataWithOldModel$1) continuationImpl;
            int i = fetchRouteDataFromRemoteUseCase$fetchRouteDataWithOldModel$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                fetchRouteDataFromRemoteUseCase$fetchRouteDataWithOldModel$1.label = i - Integer.MIN_VALUE;
            } else {
                fetchRouteDataFromRemoteUseCase$fetchRouteDataWithOldModel$1 = new FetchRouteDataFromRemoteUseCase$fetchRouteDataWithOldModel$1(this, continuationImpl);
            }
        } else {
            fetchRouteDataFromRemoteUseCase$fetchRouteDataWithOldModel$1 = new FetchRouteDataFromRemoteUseCase$fetchRouteDataWithOldModel$1(this, continuationImpl);
        }
        Object objI = fetchRouteDataFromRemoteUseCase$fetchRouteDataWithOldModel$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = fetchRouteDataFromRemoteUseCase$fetchRouteDataWithOldModel$1.label;
        if (i2 == 0) {
            ResultKt.b(objI);
            fetchRouteDataFromRemoteUseCase$fetchRouteDataWithOldModel$1.label = 1;
            objI = this.e.i(routeDetailsRequestOldAppModel, fetchRouteDataFromRemoteUseCase$fetchRouteDataWithOldModel$1);
            if (objI == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(objI);
        }
        return new ChaloUseCaseResult.Success((RouteAppModel) objI);
    }

    /* JADX WARN: Code duplicated, block: B:123:0x0117 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:49:0x00c9 A[Catch: Exception -> 0x0043, TryCatch #0 {Exception -> 0x0043, blocks: (B:15:0x003e, B:90:0x019f, B:21:0x004e, B:71:0x012d, B:24:0x0059, B:53:0x00e1, B:55:0x00e7, B:57:0x00f1, B:59:0x00f5, B:60:0x0101, B:62:0x0107, B:66:0x0118, B:68:0x011c, B:73:0x013a, B:75:0x0144, B:76:0x0149, B:27:0x0068, B:47:0x00c1, B:49:0x00c9, B:77:0x014a, B:79:0x015c, B:83:0x0162, B:85:0x0180, B:87:0x0189, B:28:0x006f, B:36:0x008b, B:31:0x0076, B:33:0x007c, B:38:0x0098, B:40:0x00a4, B:43:0x00a9), top: B:122:0x0032 }] */
    /* JADX WARN: Code duplicated, block: B:51:0x00dd  */
    /* JADX WARN: Code duplicated, block: B:52:0x00df  */
    /* JADX WARN: Code duplicated, block: B:55:0x00e7 A[Catch: Exception -> 0x0043, TryCatch #0 {Exception -> 0x0043, blocks: (B:15:0x003e, B:90:0x019f, B:21:0x004e, B:71:0x012d, B:24:0x0059, B:53:0x00e1, B:55:0x00e7, B:57:0x00f1, B:59:0x00f5, B:60:0x0101, B:62:0x0107, B:66:0x0118, B:68:0x011c, B:73:0x013a, B:75:0x0144, B:76:0x0149, B:27:0x0068, B:47:0x00c1, B:49:0x00c9, B:77:0x014a, B:79:0x015c, B:83:0x0162, B:85:0x0180, B:87:0x0189, B:28:0x006f, B:36:0x008b, B:31:0x0076, B:33:0x007c, B:38:0x0098, B:40:0x00a4, B:43:0x00a9), top: B:122:0x0032 }] */
    /* JADX WARN: Code duplicated, block: B:57:0x00f1 A[Catch: Exception -> 0x0043, TryCatch #0 {Exception -> 0x0043, blocks: (B:15:0x003e, B:90:0x019f, B:21:0x004e, B:71:0x012d, B:24:0x0059, B:53:0x00e1, B:55:0x00e7, B:57:0x00f1, B:59:0x00f5, B:60:0x0101, B:62:0x0107, B:66:0x0118, B:68:0x011c, B:73:0x013a, B:75:0x0144, B:76:0x0149, B:27:0x0068, B:47:0x00c1, B:49:0x00c9, B:77:0x014a, B:79:0x015c, B:83:0x0162, B:85:0x0180, B:87:0x0189, B:28:0x006f, B:36:0x008b, B:31:0x0076, B:33:0x007c, B:38:0x0098, B:40:0x00a4, B:43:0x00a9), top: B:122:0x0032 }] */
    /* JADX WARN: Code duplicated, block: B:59:0x00f5 A[Catch: Exception -> 0x0043, TryCatch #0 {Exception -> 0x0043, blocks: (B:15:0x003e, B:90:0x019f, B:21:0x004e, B:71:0x012d, B:24:0x0059, B:53:0x00e1, B:55:0x00e7, B:57:0x00f1, B:59:0x00f5, B:60:0x0101, B:62:0x0107, B:66:0x0118, B:68:0x011c, B:73:0x013a, B:75:0x0144, B:76:0x0149, B:27:0x0068, B:47:0x00c1, B:49:0x00c9, B:77:0x014a, B:79:0x015c, B:83:0x0162, B:85:0x0180, B:87:0x0189, B:28:0x006f, B:36:0x008b, B:31:0x0076, B:33:0x007c, B:38:0x0098, B:40:0x00a4, B:43:0x00a9), top: B:122:0x0032 }] */
    /* JADX WARN: Code duplicated, block: B:62:0x0107 A[Catch: Exception -> 0x0043, TryCatch #0 {Exception -> 0x0043, blocks: (B:15:0x003e, B:90:0x019f, B:21:0x004e, B:71:0x012d, B:24:0x0059, B:53:0x00e1, B:55:0x00e7, B:57:0x00f1, B:59:0x00f5, B:60:0x0101, B:62:0x0107, B:66:0x0118, B:68:0x011c, B:73:0x013a, B:75:0x0144, B:76:0x0149, B:27:0x0068, B:47:0x00c1, B:49:0x00c9, B:77:0x014a, B:79:0x015c, B:83:0x0162, B:85:0x0180, B:87:0x0189, B:28:0x006f, B:36:0x008b, B:31:0x0076, B:33:0x007c, B:38:0x0098, B:40:0x00a4, B:43:0x00a9), top: B:122:0x0032 }] */
    /* JADX WARN: Code duplicated, block: B:68:0x011c A[Catch: Exception -> 0x0043, TryCatch #0 {Exception -> 0x0043, blocks: (B:15:0x003e, B:90:0x019f, B:21:0x004e, B:71:0x012d, B:24:0x0059, B:53:0x00e1, B:55:0x00e7, B:57:0x00f1, B:59:0x00f5, B:60:0x0101, B:62:0x0107, B:66:0x0118, B:68:0x011c, B:73:0x013a, B:75:0x0144, B:76:0x0149, B:27:0x0068, B:47:0x00c1, B:49:0x00c9, B:77:0x014a, B:79:0x015c, B:83:0x0162, B:85:0x0180, B:87:0x0189, B:28:0x006f, B:36:0x008b, B:31:0x0076, B:33:0x007c, B:38:0x0098, B:40:0x00a4, B:43:0x00a9), top: B:122:0x0032 }] */
    /* JADX WARN: Code duplicated, block: B:70:0x012b  */
    /* JADX WARN: Code duplicated, block: B:73:0x013a A[Catch: Exception -> 0x0043, TryCatch #0 {Exception -> 0x0043, blocks: (B:15:0x003e, B:90:0x019f, B:21:0x004e, B:71:0x012d, B:24:0x0059, B:53:0x00e1, B:55:0x00e7, B:57:0x00f1, B:59:0x00f5, B:60:0x0101, B:62:0x0107, B:66:0x0118, B:68:0x011c, B:73:0x013a, B:75:0x0144, B:76:0x0149, B:27:0x0068, B:47:0x00c1, B:49:0x00c9, B:77:0x014a, B:79:0x015c, B:83:0x0162, B:85:0x0180, B:87:0x0189, B:28:0x006f, B:36:0x008b, B:31:0x0076, B:33:0x007c, B:38:0x0098, B:40:0x00a4, B:43:0x00a9), top: B:122:0x0032 }] */
    /* JADX WARN: Code duplicated, block: B:75:0x0144 A[Catch: Exception -> 0x0043, TryCatch #0 {Exception -> 0x0043, blocks: (B:15:0x003e, B:90:0x019f, B:21:0x004e, B:71:0x012d, B:24:0x0059, B:53:0x00e1, B:55:0x00e7, B:57:0x00f1, B:59:0x00f5, B:60:0x0101, B:62:0x0107, B:66:0x0118, B:68:0x011c, B:73:0x013a, B:75:0x0144, B:76:0x0149, B:27:0x0068, B:47:0x00c1, B:49:0x00c9, B:77:0x014a, B:79:0x015c, B:83:0x0162, B:85:0x0180, B:87:0x0189, B:28:0x006f, B:36:0x008b, B:31:0x0076, B:33:0x007c, B:38:0x0098, B:40:0x00a4, B:43:0x00a9), top: B:122:0x0032 }] */
    /* JADX WARN: Code duplicated, block: B:77:0x014a A[Catch: Exception -> 0x0043, TryCatch #0 {Exception -> 0x0043, blocks: (B:15:0x003e, B:90:0x019f, B:21:0x004e, B:71:0x012d, B:24:0x0059, B:53:0x00e1, B:55:0x00e7, B:57:0x00f1, B:59:0x00f5, B:60:0x0101, B:62:0x0107, B:66:0x0118, B:68:0x011c, B:73:0x013a, B:75:0x0144, B:76:0x0149, B:27:0x0068, B:47:0x00c1, B:49:0x00c9, B:77:0x014a, B:79:0x015c, B:83:0x0162, B:85:0x0180, B:87:0x0189, B:28:0x006f, B:36:0x008b, B:31:0x0076, B:33:0x007c, B:38:0x0098, B:40:0x00a4, B:43:0x00a9), top: B:122:0x0032 }] */
    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    /* JADX WARN: Code duplicated, block: B:85:0x0180 A[Catch: Exception -> 0x0043, TryCatch #0 {Exception -> 0x0043, blocks: (B:15:0x003e, B:90:0x019f, B:21:0x004e, B:71:0x012d, B:24:0x0059, B:53:0x00e1, B:55:0x00e7, B:57:0x00f1, B:59:0x00f5, B:60:0x0101, B:62:0x0107, B:66:0x0118, B:68:0x011c, B:73:0x013a, B:75:0x0144, B:76:0x0149, B:27:0x0068, B:47:0x00c1, B:49:0x00c9, B:77:0x014a, B:79:0x015c, B:83:0x0162, B:85:0x0180, B:87:0x0189, B:28:0x006f, B:36:0x008b, B:31:0x0076, B:33:0x007c, B:38:0x0098, B:40:0x00a4, B:43:0x00a9), top: B:122:0x0032 }] */
    /* JADX WARN: Code duplicated, block: B:86:0x0187  */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x019c, code lost:
    
        if (r0 == r4) goto L89;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.lang.String r26, kotlin.coroutines.jvm.internal.ContinuationImpl r27) {
        /*
            Method dump skipped, instruction units count: 561
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: app.chalo.citydata.domain.FetchRouteDataFromRemoteUseCase.b(java.lang.String, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }
}
