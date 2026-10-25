package app.chalo.citydata.domain;

import app.chalo.citydata.data.model.app.RouteAppModel;
import app.chalo.citydata.repository.CityDataRepository;
import app.chalo.providers.stringprovider.StringProvider;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/citydata/domain/GetRouteDataFromLocalOrRemoteUseCase;", "", "framework-city-data_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class GetRouteDataFromLocalOrRemoteUseCase {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CityDataRepository f1761a;
    public final FetchRoutesDataFromRemoteAndRefreshCacheIfRequiredUseCase b;
    public final StringProvider c;

    public GetRouteDataFromLocalOrRemoteUseCase(CityDataRepository cityDataRepository, FetchRoutesDataFromRemoteAndRefreshCacheIfRequiredUseCase fetchRoutesDataFromRemoteAndRefreshCacheIfRequiredUseCase, StringProvider stringProvider) {
        this.f1761a = cityDataRepository;
        this.b = fetchRoutesDataFromRemoteAndRefreshCacheIfRequiredUseCase;
        this.c = stringProvider;
    }

    public static ArrayList a(List list, List list2) {
        List list3 = list;
        ArrayList arrayList = new ArrayList(CollectionsKt.v(list3, 10));
        Iterator it = list3.iterator();
        while (it.hasNext()) {
            arrayList.add(((RouteAppModel) it.next()).b);
        }
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : list2) {
            if (!arrayList.contains((String) obj)) {
                arrayList2.add(obj);
            }
        }
        return arrayList2;
    }

    /* JADX WARN: Code duplicated, block: B:32:0x0086  */
    /* JADX WARN: Code duplicated, block: B:34:0x0090  */
    /* JADX WARN: Code duplicated, block: B:36:0x0094  */
    /* JADX WARN: Code duplicated, block: B:39:0x009f A[PHI: r9 r10
      0x009f: PHI (r9v6 java.util.List) = (r9v3 java.util.List), (r9v17 java.util.List) binds: [B:37:0x009c, B:17:0x003b] A[DONT_GENERATE, DONT_INLINE]
      0x009f: PHI (r10v13 java.lang.Object) = (r10v10 java.lang.Object), (r10v1 java.lang.Object) binds: [B:37:0x009c, B:17:0x003b] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:41:0x00ab  */
    /* JADX WARN: Code duplicated, block: B:43:0x00b1  */
    /* JADX WARN: Code duplicated, block: B:48:0x00d1  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00c1, code lost:
    
        if (r10 == r1) goto L45;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.util.List r9, kotlin.coroutines.jvm.internal.ContinuationImpl r10) {
        /*
            Method dump skipped, instruction units count: 215
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: app.chalo.citydata.domain.GetRouteDataFromLocalOrRemoteUseCase.b(java.util.List, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }
}
