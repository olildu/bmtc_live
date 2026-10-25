package app.chalo.citydata.domain;

import app.chalo.citydata.repository.CityDataRepository;
import app.chalo.providers.cityprovider.CityProvider;
import app.chalo.providers.stringprovider.StringProvider;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/citydata/domain/FetchRoutesDataFromRemoteAndRefreshCacheIfRequiredUseCase;", "", "framework-city-data_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class FetchRoutesDataFromRemoteAndRefreshCacheIfRequiredUseCase {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CityProvider f1754a;
    public final CityDataRepository b;
    public final SyncRoutesDataUseCase c;
    public final GetRoutesToSyncUseCase d;
    public final ShouldUpdateRouteDataCacheUseCase e;
    public final StringProvider f;

    public FetchRoutesDataFromRemoteAndRefreshCacheIfRequiredUseCase(CityProvider cityProvider, CityDataRepository cityDataRepository, SyncRoutesDataUseCase syncRoutesDataUseCase, GetRoutesToSyncUseCase getRoutesToSyncUseCase, ShouldUpdateRouteDataCacheUseCase shouldUpdateRouteDataCacheUseCase, StringProvider stringProvider) {
        this.f1754a = cityProvider;
        this.b = cityDataRepository;
        this.c = syncRoutesDataUseCase;
        this.d = getRoutesToSyncUseCase;
        this.e = shouldUpdateRouteDataCacheUseCase;
        this.f = stringProvider;
    }

    /* JADX WARN: Code duplicated, block: B:35:0x00ab  */
    /* JADX WARN: Code duplicated, block: B:38:0x00ba  */
    /* JADX WARN: Code duplicated, block: B:40:0x00be  */
    /* JADX WARN: Code duplicated, block: B:53:0x0103  */
    /* JADX WARN: Code duplicated, block: B:59:0x0120  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x007e, code lost:
    
        if (r12 == r1) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00da, code lost:
    
        if (r12 == r1) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0115, code lost:
    
        if (r12 == r1) goto L55;
     */
    /* JADX WARN: Path cross not found for [B:10:0x0026, B:22:0x0066], limit reached: 59 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:54:0x0115 -> B:56:0x0118). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(java.util.List r11, kotlin.coroutines.jvm.internal.ContinuationImpl r12) {
        /*
            Method dump skipped, instruction units count: 302
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: app.chalo.citydata.domain.FetchRoutesDataFromRemoteAndRefreshCacheIfRequiredUseCase.a(java.util.List, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }
}
