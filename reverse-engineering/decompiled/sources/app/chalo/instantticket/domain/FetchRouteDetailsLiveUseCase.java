package app.chalo.instantticket.domain;

import app.chalo.features.language.LanguageFeature;
import app.chalo.instantticket.data.InstantTicketRepository;
import app.chalo.livetracking.universalsearch.domain.GetAutoCompleteCurrentCityTimeoutConfigUseCase;
import app.chalo.location.ChaloLocationManager;
import app.chalo.providers.cityprovider.CityProvider;
import app.chalo.providers.stringprovider.StringProvider;
import app.chalo.usecase.GetDistinctIdUseCase;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/instantticket/domain/FetchRouteDetailsLiveUseCase;", "", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class FetchRouteDetailsLiveUseCase {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final InstantTicketRepository f3901a;
    public final ChaloLocationManager b;
    public final LanguageFeature c;
    public final CityProvider d;
    public final StringProvider e;
    public final GetDistinctIdUseCase f;
    public final GetAutoCompleteCurrentCityTimeoutConfigUseCase g;

    public FetchRouteDetailsLiveUseCase(InstantTicketRepository instantTicketRepository, ChaloLocationManager chaloLocationManager, LanguageFeature languageFeature, CityProvider cityProvider, StringProvider stringProvider, GetDistinctIdUseCase getDistinctIdUseCase, GetAutoCompleteCurrentCityTimeoutConfigUseCase getAutoCompleteCurrentCityTimeoutConfigUseCase) {
        this.f3901a = instantTicketRepository;
        this.b = chaloLocationManager;
        this.c = languageFeature;
        this.d = cityProvider;
        this.e = stringProvider;
        this.f = getDistinctIdUseCase;
        this.g = getAutoCompleteCurrentCityTimeoutConfigUseCase;
    }

    /* JADX WARN: Code duplicated, block: B:141:0x0226 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:143:0x0213 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:20:0x005c A[PHI: r0 r4 r5 r9 r10 r11
      0x005c: PHI (r0v60 java.lang.Object) = (r0v49 java.lang.Object), (r0v1 java.lang.Object) binds: [B:72:0x01a9, B:19:0x0047] A[DONT_GENERATE, DONT_INLINE]
      0x005c: PHI (r4v20 boolean) = (r4v16 boolean), (r4v23 boolean) binds: [B:72:0x01a9, B:19:0x0047] A[DONT_GENERATE, DONT_INLINE]
      0x005c: PHI (r5v16 app.chalo.location.LatLng) = (r5v10 app.chalo.location.LatLng), (r5v29 app.chalo.location.LatLng) binds: [B:72:0x01a9, B:19:0x0047] A[DONT_GENERATE, DONT_INLINE]
      0x005c: PHI (r9v17 app.chalo.providers.cityprovider.impl.data.models.app.CityAppModel) = 
      (r9v12 app.chalo.providers.cityprovider.impl.data.models.app.CityAppModel)
      (r9v20 app.chalo.providers.cityprovider.impl.data.models.app.CityAppModel)
     binds: [B:72:0x01a9, B:19:0x0047] A[DONT_GENERATE, DONT_INLINE]
      0x005c: PHI (r10v17 app.chalo.livetracking.universalsearch.domain.AutoCompleteSearchFilter) = 
      (r10v12 app.chalo.livetracking.universalsearch.domain.AutoCompleteSearchFilter)
      (r10v20 app.chalo.livetracking.universalsearch.domain.AutoCompleteSearchFilter)
     binds: [B:72:0x01a9, B:19:0x0047] A[DONT_GENERATE, DONT_INLINE]
      0x005c: PHI (r11v16 java.lang.String) = (r11v14 java.lang.String), (r11v19 java.lang.String) binds: [B:72:0x01a9, B:19:0x0047] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:43:0x010f  */
    /* JADX WARN: Code duplicated, block: B:44:0x0114  */
    /* JADX WARN: Code duplicated, block: B:46:0x0117  */
    /* JADX WARN: Code duplicated, block: B:49:0x0130  */
    /* JADX WARN: Code duplicated, block: B:52:0x013b  */
    /* JADX WARN: Code duplicated, block: B:56:0x0149 A[PHI: r4 r9 r10 r11
      0x0149: PHI (r4v13 boolean) = (r4v11 boolean), (r4v14 boolean) binds: [B:45:0x0115, B:54:0x0141] A[DONT_GENERATE, DONT_INLINE]
      0x0149: PHI (r9v6 app.chalo.livetracking.universalsearch.domain.AutoCompleteSearchFilter) = 
      (r9v1 app.chalo.livetracking.universalsearch.domain.AutoCompleteSearchFilter)
      (r9v9 app.chalo.livetracking.universalsearch.domain.AutoCompleteSearchFilter)
     binds: [B:45:0x0115, B:54:0x0141] A[DONT_GENERATE, DONT_INLINE]
      0x0149: PHI (r10v6 app.chalo.providers.cityprovider.impl.data.models.app.CityAppModel) = 
      (r10v2 app.chalo.providers.cityprovider.impl.data.models.app.CityAppModel)
      (r10v8 app.chalo.providers.cityprovider.impl.data.models.app.CityAppModel)
     binds: [B:45:0x0115, B:54:0x0141] A[DONT_GENERATE, DONT_INLINE]
      0x0149: PHI (r11v8 java.lang.String) = (r11v4 java.lang.String), (r11v11 java.lang.String) binds: [B:45:0x0115, B:54:0x0141] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:59:0x0162  */
    /* JADX WARN: Code duplicated, block: B:62:0x0168  */
    /* JADX WARN: Code duplicated, block: B:63:0x016b  */
    /* JADX WARN: Code duplicated, block: B:66:0x0172  */
    /* JADX WARN: Code duplicated, block: B:71:0x0196  */
    /* JADX WARN: Code duplicated, block: B:77:0x01d1 A[Catch: Exception -> 0x0044, TryCatch #0 {Exception -> 0x0044, blocks: (B:15:0x003f, B:85:0x0204, B:87:0x0208, B:88:0x0213, B:90:0x0219, B:92:0x0226, B:94:0x022b, B:75:0x01b1, B:77:0x01d1, B:82:0x01dd), top: B:138:0x0028 }] */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Code duplicated, block: B:81:0x01da  */
    /* JADX WARN: Code duplicated, block: B:84:0x0202  */
    /* JADX WARN: Code duplicated, block: B:87:0x0208 A[Catch: Exception -> 0x0044, TryCatch #0 {Exception -> 0x0044, blocks: (B:15:0x003f, B:85:0x0204, B:87:0x0208, B:88:0x0213, B:90:0x0219, B:92:0x0226, B:94:0x022b, B:75:0x01b1, B:77:0x01d1, B:82:0x01dd), top: B:138:0x0028 }] */
    /* JADX WARN: Code duplicated, block: B:90:0x0219 A[Catch: Exception -> 0x0044, TryCatch #0 {Exception -> 0x0044, blocks: (B:15:0x003f, B:85:0x0204, B:87:0x0208, B:88:0x0213, B:90:0x0219, B:92:0x0226, B:94:0x022b, B:75:0x01b1, B:77:0x01d1, B:82:0x01dd), top: B:138:0x0028 }] */
    /* JADX WARN: Code restructure failed: missing block: B:123:0x02c2, code lost:
    
        if (r0 == r3) goto L134;
     */
    /* JADX WARN: Code restructure failed: missing block: B:133:0x02f8, code lost:
    
        if (r0 == r3) goto L134;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00d4, code lost:
    
        if (r0 == r3) goto L134;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x0185, code lost:
    
        if (r0 == r3) goto L134;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(java.lang.String r24, app.chalo.livetracking.universalsearch.domain.AutoCompleteSearchFilter r25, boolean r26, kotlin.coroutines.jvm.internal.ContinuationImpl r27) {
        /*
            Method dump skipped, instruction units count: 800
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: app.chalo.instantticket.domain.FetchRouteDetailsLiveUseCase.a(java.lang.String, app.chalo.livetracking.universalsearch.domain.AutoCompleteSearchFilter, boolean, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }
}
