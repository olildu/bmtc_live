package app.chalo.citydata.domain;

import app.chalo.citydata.repository.CityDataRepository;
import app.chalo.providers.cityprovider.CityProvider;
import app.chalo.providers.stringprovider.StringProvider;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/citydata/domain/FetchAllMetroStopsUseCase;", "", "framework-city-data_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class FetchAllMetroStopsUseCase {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CityProvider f1748a;
    public final CityDataRepository b;
    public final StringProvider c;

    public FetchAllMetroStopsUseCase(CityDataRepository cityDataRepository, CityProvider cityProvider, StringProvider stringProvider) {
        this.f1748a = cityProvider;
        this.b = cityDataRepository;
        this.c = stringProvider;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0088, code lost:
    
        if (r9 == r1) goto L65;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x00e7, code lost:
    
        if (r9 == r1) goto L65;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0107, code lost:
    
        if (r9 == r1) goto L65;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(kotlin.coroutines.jvm.internal.ContinuationImpl r9) {
        /*
            Method dump skipped, instruction units count: 284
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: app.chalo.citydata.domain.FetchAllMetroStopsUseCase.a(kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }
}
