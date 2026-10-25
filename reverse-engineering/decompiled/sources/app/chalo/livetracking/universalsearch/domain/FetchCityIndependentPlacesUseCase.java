package app.chalo.livetracking.universalsearch.domain;

import app.chalo.features.language.LanguageFeature;
import app.chalo.livetracking.universalsearch.data.repository.TrackingRepository;
import app.chalo.location.ChaloLocationManager;
import app.chalo.providers.cityprovider.CityProvider;
import app.chalo.providers.stringprovider.StringProvider;
import app.chalo.usecase.GetDistinctIdUseCase;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/livetracking/universalsearch/domain/FetchCityIndependentPlacesUseCase;", "", "livetracking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class FetchCityIndependentPlacesUseCase {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TrackingRepository f5015a;
    public final ChaloLocationManager b;
    public final LanguageFeature c;
    public final CityProvider d;
    public final StringProvider e;
    public final GetDistinctIdUseCase f;
    public final GetAutoCompleteCurrentCityTimeoutConfigUseCase g;

    public FetchCityIndependentPlacesUseCase(TrackingRepository trackingRepository, ChaloLocationManager chaloLocationManager, LanguageFeature languageFeature, CityProvider cityProvider, StringProvider stringProvider, GetDistinctIdUseCase getDistinctIdUseCase, GetAutoCompleteCurrentCityTimeoutConfigUseCase getAutoCompleteCurrentCityTimeoutConfigUseCase) {
        this.f5015a = trackingRepository;
        this.b = chaloLocationManager;
        this.c = languageFeature;
        this.d = cityProvider;
        this.e = stringProvider;
        this.f = getDistinctIdUseCase;
        this.g = getAutoCompleteCurrentCityTimeoutConfigUseCase;
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0051 A[PHI: r0 r4 r8 r9
      0x0051: PHI (r0v36 java.lang.Object) = (r0v32 java.lang.Object), (r0v1 java.lang.Object) binds: [B:41:0x00df, B:18:0x0042] A[DONT_GENERATE, DONT_INLINE]
      0x0051: PHI (r4v19 app.chalo.location.LatLng) = (r4v13 app.chalo.location.LatLng), (r4v22 app.chalo.location.LatLng) binds: [B:41:0x00df, B:18:0x0042] A[DONT_GENERATE, DONT_INLINE]
      0x0051: PHI (r8v23 app.chalo.config.ChaloPhoneNumberCountry) = (r8v17 app.chalo.config.ChaloPhoneNumberCountry), (r8v26 app.chalo.config.ChaloPhoneNumberCountry) binds: [B:41:0x00df, B:18:0x0042] A[DONT_GENERATE, DONT_INLINE]
      0x0051: PHI (r9v6 java.lang.String) = (r9v3 java.lang.String), (r9v9 java.lang.String) binds: [B:41:0x00df, B:18:0x0042] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:31:0x00a0  */
    /* JADX WARN: Code duplicated, block: B:32:0x00a9  */
    /* JADX WARN: Code duplicated, block: B:35:0x00be  */
    /* JADX WARN: Code duplicated, block: B:38:0x00c7  */
    /* JADX WARN: Code duplicated, block: B:39:0x00cd  */
    /* JADX WARN: Code duplicated, block: B:46:0x0105 A[Catch: Exception -> 0x003f, TryCatch #0 {Exception -> 0x003f, blocks: (B:14:0x003a, B:54:0x0129, B:56:0x0138, B:61:0x0144, B:63:0x014f, B:44:0x00e7, B:46:0x0105, B:51:0x0111), top: B:104:0x0025 }] */
    /* JADX WARN: Code duplicated, block: B:50:0x010e  */
    /* JADX WARN: Code duplicated, block: B:53:0x0127  */
    /* JADX WARN: Code duplicated, block: B:56:0x0138 A[Catch: Exception -> 0x003f, TryCatch #0 {Exception -> 0x003f, blocks: (B:14:0x003a, B:54:0x0129, B:56:0x0138, B:61:0x0144, B:63:0x014f, B:44:0x00e7, B:46:0x0105, B:51:0x0111), top: B:104:0x0025 }] */
    /* JADX WARN: Code duplicated, block: B:59:0x0141  */
    /* JADX WARN: Code duplicated, block: B:61:0x0144 A[Catch: Exception -> 0x003f, TryCatch #0 {Exception -> 0x003f, blocks: (B:14:0x003a, B:54:0x0129, B:56:0x0138, B:61:0x0144, B:63:0x014f, B:44:0x00e7, B:46:0x0105, B:51:0x0111), top: B:104:0x0025 }] */
    /* JADX WARN: Code duplicated, block: B:63:0x014f A[Catch: Exception -> 0x003f, TRY_LEAVE, TryCatch #0 {Exception -> 0x003f, blocks: (B:14:0x003a, B:54:0x0129, B:56:0x0138, B:61:0x0144, B:63:0x014f, B:44:0x00e7, B:46:0x0105, B:51:0x0111), top: B:104:0x0025 }] */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x01de, code lost:
    
        if (r0 == r3) goto L100;
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x0211, code lost:
    
        if (r0 == r3) goto L100;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(java.lang.String r18, app.chalo.config.ChaloPhoneNumberCountry r19, kotlin.coroutines.jvm.internal.ContinuationImpl r20) {
        /*
            Method dump skipped, instruction units count: 564
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: app.chalo.livetracking.universalsearch.domain.FetchCityIndependentPlacesUseCase.a(java.lang.String, app.chalo.config.ChaloPhoneNumberCountry, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }
}
