package app.chalo.livetracking.frameworklivetracking.remote;

import app.chalo.network.NetworkManager;
import app.chalo.network.mapper.GenericNetworkExceptionMapper;
import app.chalo.providers.cityprovider.CityProvider;
import app.chalo.providers.stringprovider.StringProvider;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lapp/chalo/livetracking/frameworklivetracking/remote/LiveTrackingRemoteDataSourceImpl;", "Lapp/chalo/livetracking/frameworklivetracking/remote/LiveTrackingRemoteDataSource;", "Companion", "livetracking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class LiveTrackingRemoteDataSourceImpl implements LiveTrackingRemoteDataSource {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final NetworkManager f4336a;
    public final CityProvider b;
    public final StringProvider c;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0004¨\u0006\u0007"}, d2 = {"Lapp/chalo/livetracking/frameworklivetracking/remote/LiveTrackingRemoteDataSourceImpl$Companion;", "", "", "CITY_NAME_KEY", "Ljava/lang/String;", "CITY_PATH_PARAM_KEY", "STOP_ROUTE_ETA_SUB_URL", "livetracking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
    }

    public LiveTrackingRemoteDataSourceImpl(NetworkManager networkManager, GenericNetworkExceptionMapper genericNetworkExceptionMapper, CityProvider cityProvider, StringProvider stringProvider) {
        this.f4336a = networkManager;
        this.b = cityProvider;
        this.c = stringProvider;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00d2, code lost:
    
        if (r9 == r1) goto L36;
     */
    @Override // app.chalo.livetracking.frameworklivetracking.remote.LiveTrackingRemoteDataSource
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(app.chalo.livetracking.frameworklivetracking.data.model.api.request.GetEtaForRouteStopIdRequestApiModel r8, kotlin.coroutines.jvm.internal.ContinuationImpl r9) throws java.lang.Exception {
        /*
            Method dump skipped, instruction units count: 227
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: app.chalo.livetracking.frameworklivetracking.remote.LiveTrackingRemoteDataSourceImpl.a(app.chalo.livetracking.frameworklivetracking.data.model.api.request.GetEtaForRouteStopIdRequestApiModel, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }
}
