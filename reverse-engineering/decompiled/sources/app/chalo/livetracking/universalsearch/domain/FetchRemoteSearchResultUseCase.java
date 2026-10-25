package app.chalo.livetracking.universalsearch.domain;

import app.chalo.analytics.contract.AnalyticsContract;
import app.chalo.features.language.LanguageFeature;
import app.chalo.livetracking.universalsearch.data.repository.TrackingRepository;
import app.chalo.location.ChaloLocationManager;
import app.chalo.providers.cityprovider.CityProvider;
import app.chalo.providers.stringprovider.StringProvider;
import app.chalo.universalsearch.data.UniversalSearchFlowSource;
import app.chalo.usecase.GetDistinctIdUseCase;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lapp/chalo/livetracking/universalsearch/domain/FetchRemoteSearchResultUseCase;", "", "Companion", "livetracking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class FetchRemoteSearchResultUseCase {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TrackingRepository f5031a;
    public final ChaloLocationManager b;
    public final LanguageFeature c;
    public final CityProvider d;
    public final StringProvider e;
    public final GetDistinctIdUseCase f;
    public final GetAutoCompleteCurrentCityTimeoutConfigUseCase g;
    public final AnalyticsContract h;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lapp/chalo/livetracking/universalsearch/domain/FetchRemoteSearchResultUseCase$Companion;", "", "", "API_ERROR_EVENT_NAME", "Ljava/lang/String;", "livetracking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f5032a;

        static {
            int[] iArr = new int[UniversalSearchFlowSource.values().length];
            try {
                iArr[UniversalSearchFlowSource.PREMIUM_TO_STOP_SELECTION.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[UniversalSearchFlowSource.PREMIUM_FROM_STOP_SELECTION.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[UniversalSearchFlowSource.HOME_SCREEN_MAIN_FRAGMENT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[UniversalSearchFlowSource.NEAR_BY_STOPS.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[UniversalSearchFlowSource.STOP_BASED_ROUTE_SEARCH_SCREEN.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[UniversalSearchFlowSource.TRIP_PLANNER.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[UniversalSearchFlowSource.REGULAR_BUS_SCREEN_TAB.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[UniversalSearchFlowSource.HOME_SCREEN_TAB.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[UniversalSearchFlowSource.ONDC_STOP_BASED_SEARCH_SCREEN.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[UniversalSearchFlowSource.STOP_FOCUSED_TRIP_PLANNER.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr[UniversalSearchFlowSource.UNKNOWN.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr[UniversalSearchFlowSource.HOME_WORK_SELECTION.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr[UniversalSearchFlowSource.HOME_PREFERENCE_SELECTION.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr[UniversalSearchFlowSource.WORK_PREFERECNCE_SELECTION.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                iArr[UniversalSearchFlowSource.CITY_SELECTION.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            f5032a = iArr;
        }
    }

    public FetchRemoteSearchResultUseCase(TrackingRepository trackingRepository, ChaloLocationManager chaloLocationManager, LanguageFeature languageFeature, CityProvider cityProvider, StringProvider stringProvider, GetDistinctIdUseCase getDistinctIdUseCase, GetAutoCompleteCurrentCityTimeoutConfigUseCase getAutoCompleteCurrentCityTimeoutConfigUseCase, AnalyticsContract analyticsContract) {
        this.f5031a = trackingRepository;
        this.b = chaloLocationManager;
        this.c = languageFeature;
        this.d = cityProvider;
        this.e = stringProvider;
        this.f = getDistinctIdUseCase;
        this.g = getAutoCompleteCurrentCityTimeoutConfigUseCase;
        this.h = analyticsContract;
    }

    /* JADX WARN: Code duplicated, block: B:101:0x021c  */
    /* JADX WARN: Code duplicated, block: B:104:0x0230 A[Catch: Exception -> 0x0218, TryCatch #1 {Exception -> 0x0218, blocks: (B:125:0x028a, B:126:0x028c, B:128:0x0299, B:133:0x02a7, B:135:0x02b2, B:119:0x0271, B:93:0x01f8, B:95:0x020e, B:102:0x021f, B:103:0x022d, B:104:0x0230, B:105:0x0235, B:106:0x0236, B:111:0x0243, B:113:0x024c, B:116:0x025f, B:120:0x0274, B:122:0x0278, B:137:0x02b8, B:138:0x02bd, B:108:0x023b, B:109:0x023e), top: B:190:0x01f8 }] */
    /* JADX WARN: Code duplicated, block: B:106:0x0236 A[Catch: Exception -> 0x0218, TryCatch #1 {Exception -> 0x0218, blocks: (B:125:0x028a, B:126:0x028c, B:128:0x0299, B:133:0x02a7, B:135:0x02b2, B:119:0x0271, B:93:0x01f8, B:95:0x020e, B:102:0x021f, B:103:0x022d, B:104:0x0230, B:105:0x0235, B:106:0x0236, B:111:0x0243, B:113:0x024c, B:116:0x025f, B:120:0x0274, B:122:0x0278, B:137:0x02b8, B:138:0x02bd, B:108:0x023b, B:109:0x023e), top: B:190:0x01f8 }] */
    /* JADX WARN: Code duplicated, block: B:108:0x023b A[Catch: Exception -> 0x0218, TryCatch #1 {Exception -> 0x0218, blocks: (B:125:0x028a, B:126:0x028c, B:128:0x0299, B:133:0x02a7, B:135:0x02b2, B:119:0x0271, B:93:0x01f8, B:95:0x020e, B:102:0x021f, B:103:0x022d, B:104:0x0230, B:105:0x0235, B:106:0x0236, B:111:0x0243, B:113:0x024c, B:116:0x025f, B:120:0x0274, B:122:0x0278, B:137:0x02b8, B:138:0x02bd, B:108:0x023b, B:109:0x023e), top: B:190:0x01f8 }] */
    /* JADX WARN: Code duplicated, block: B:109:0x023e A[Catch: Exception -> 0x0218, TryCatch #1 {Exception -> 0x0218, blocks: (B:125:0x028a, B:126:0x028c, B:128:0x0299, B:133:0x02a7, B:135:0x02b2, B:119:0x0271, B:93:0x01f8, B:95:0x020e, B:102:0x021f, B:103:0x022d, B:104:0x0230, B:105:0x0235, B:106:0x0236, B:111:0x0243, B:113:0x024c, B:116:0x025f, B:120:0x0274, B:122:0x0278, B:137:0x02b8, B:138:0x02bd, B:108:0x023b, B:109:0x023e), top: B:190:0x01f8 }] */
    /* JADX WARN: Code duplicated, block: B:111:0x0243 A[Catch: Exception -> 0x0218, TryCatch #1 {Exception -> 0x0218, blocks: (B:125:0x028a, B:126:0x028c, B:128:0x0299, B:133:0x02a7, B:135:0x02b2, B:119:0x0271, B:93:0x01f8, B:95:0x020e, B:102:0x021f, B:103:0x022d, B:104:0x0230, B:105:0x0235, B:106:0x0236, B:111:0x0243, B:113:0x024c, B:116:0x025f, B:120:0x0274, B:122:0x0278, B:137:0x02b8, B:138:0x02bd, B:108:0x023b, B:109:0x023e), top: B:190:0x01f8 }] */
    /* JADX WARN: Code duplicated, block: B:112:0x024a  */
    /* JADX WARN: Code duplicated, block: B:116:0x025f A[Catch: Exception -> 0x0218, TRY_ENTER, TryCatch #1 {Exception -> 0x0218, blocks: (B:125:0x028a, B:126:0x028c, B:128:0x0299, B:133:0x02a7, B:135:0x02b2, B:119:0x0271, B:93:0x01f8, B:95:0x020e, B:102:0x021f, B:103:0x022d, B:104:0x0230, B:105:0x0235, B:106:0x0236, B:111:0x0243, B:113:0x024c, B:116:0x025f, B:120:0x0274, B:122:0x0278, B:137:0x02b8, B:138:0x02bd, B:108:0x023b, B:109:0x023e), top: B:190:0x01f8 }] */
    /* JADX WARN: Code duplicated, block: B:118:0x026f  */
    /* JADX WARN: Code duplicated, block: B:120:0x0274 A[Catch: Exception -> 0x0218, TryCatch #1 {Exception -> 0x0218, blocks: (B:125:0x028a, B:126:0x028c, B:128:0x0299, B:133:0x02a7, B:135:0x02b2, B:119:0x0271, B:93:0x01f8, B:95:0x020e, B:102:0x021f, B:103:0x022d, B:104:0x0230, B:105:0x0235, B:106:0x0236, B:111:0x0243, B:113:0x024c, B:116:0x025f, B:120:0x0274, B:122:0x0278, B:137:0x02b8, B:138:0x02bd, B:108:0x023b, B:109:0x023e), top: B:190:0x01f8 }] */
    /* JADX WARN: Code duplicated, block: B:122:0x0278 A[Catch: Exception -> 0x0218, TryCatch #1 {Exception -> 0x0218, blocks: (B:125:0x028a, B:126:0x028c, B:128:0x0299, B:133:0x02a7, B:135:0x02b2, B:119:0x0271, B:93:0x01f8, B:95:0x020e, B:102:0x021f, B:103:0x022d, B:104:0x0230, B:105:0x0235, B:106:0x0236, B:111:0x0243, B:113:0x024c, B:116:0x025f, B:120:0x0274, B:122:0x0278, B:137:0x02b8, B:138:0x02bd, B:108:0x023b, B:109:0x023e), top: B:190:0x01f8 }] */
    /* JADX WARN: Code duplicated, block: B:124:0x0288  */
    /* JADX WARN: Code duplicated, block: B:128:0x0299 A[Catch: Exception -> 0x0218, TryCatch #1 {Exception -> 0x0218, blocks: (B:125:0x028a, B:126:0x028c, B:128:0x0299, B:133:0x02a7, B:135:0x02b2, B:119:0x0271, B:93:0x01f8, B:95:0x020e, B:102:0x021f, B:103:0x022d, B:104:0x0230, B:105:0x0235, B:106:0x0236, B:111:0x0243, B:113:0x024c, B:116:0x025f, B:120:0x0274, B:122:0x0278, B:137:0x02b8, B:138:0x02bd, B:108:0x023b, B:109:0x023e), top: B:190:0x01f8 }] */
    /* JADX WARN: Code duplicated, block: B:131:0x02a4  */
    /* JADX WARN: Code duplicated, block: B:133:0x02a7 A[Catch: Exception -> 0x0218, TryCatch #1 {Exception -> 0x0218, blocks: (B:125:0x028a, B:126:0x028c, B:128:0x0299, B:133:0x02a7, B:135:0x02b2, B:119:0x0271, B:93:0x01f8, B:95:0x020e, B:102:0x021f, B:103:0x022d, B:104:0x0230, B:105:0x0235, B:106:0x0236, B:111:0x0243, B:113:0x024c, B:116:0x025f, B:120:0x0274, B:122:0x0278, B:137:0x02b8, B:138:0x02bd, B:108:0x023b, B:109:0x023e), top: B:190:0x01f8 }] */
    /* JADX WARN: Code duplicated, block: B:135:0x02b2 A[Catch: Exception -> 0x0218, TryCatch #1 {Exception -> 0x0218, blocks: (B:125:0x028a, B:126:0x028c, B:128:0x0299, B:133:0x02a7, B:135:0x02b2, B:119:0x0271, B:93:0x01f8, B:95:0x020e, B:102:0x021f, B:103:0x022d, B:104:0x0230, B:105:0x0235, B:106:0x0236, B:111:0x0243, B:113:0x024c, B:116:0x025f, B:120:0x0274, B:122:0x0278, B:137:0x02b8, B:138:0x02bd, B:108:0x023b, B:109:0x023e), top: B:190:0x01f8 }] */
    /* JADX WARN: Code duplicated, block: B:137:0x02b8 A[Catch: Exception -> 0x0218, TryCatch #1 {Exception -> 0x0218, blocks: (B:125:0x028a, B:126:0x028c, B:128:0x0299, B:133:0x02a7, B:135:0x02b2, B:119:0x0271, B:93:0x01f8, B:95:0x020e, B:102:0x021f, B:103:0x022d, B:104:0x0230, B:105:0x0235, B:106:0x0236, B:111:0x0243, B:113:0x024c, B:116:0x025f, B:120:0x0274, B:122:0x0278, B:137:0x02b8, B:138:0x02bd, B:108:0x023b, B:109:0x023e), top: B:190:0x01f8 }] */
    /* JADX WARN: Code duplicated, block: B:146:0x02e1  */
    /* JADX WARN: Code duplicated, block: B:149:0x0313  */
    /* JADX WARN: Code duplicated, block: B:150:0x031c  */
    /* JADX WARN: Code duplicated, block: B:152:0x0320  */
    /* JADX WARN: Code duplicated, block: B:158:0x034c  */
    /* JADX WARN: Code duplicated, block: B:160:0x035a  */
    /* JADX WARN: Code duplicated, block: B:161:0x0362  */
    /* JADX WARN: Code duplicated, block: B:164:0x036d  */
    /* JADX WARN: Code duplicated, block: B:166:0x037b  */
    /* JADX WARN: Code duplicated, block: B:168:0x037f  */
    /* JADX WARN: Code duplicated, block: B:170:0x0385  */
    /* JADX WARN: Code duplicated, block: B:175:0x03a3  */
    /* JADX WARN: Code duplicated, block: B:177:0x03a7  */
    /* JADX WARN: Code duplicated, block: B:178:0x03af  */
    /* JADX WARN: Code duplicated, block: B:180:0x03b5  */
    /* JADX WARN: Code duplicated, block: B:186:0x03d3  */
    /* JADX WARN: Code duplicated, block: B:193:0x01ce A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:195:0x01bc A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:21:0x006f A[PHI: r0 r4 r8 r12
      0x006f: PHI (r0v74 java.lang.Object) = (r0v63 java.lang.Object), (r0v1 java.lang.Object) binds: [B:76:0x0196, B:20:0x0060] A[DONT_GENERATE, DONT_INLINE]
      0x006f: PHI (r4v28 app.chalo.location.LatLng) = (r4v22 app.chalo.location.LatLng), (r4v32 app.chalo.location.LatLng) binds: [B:76:0x0196, B:20:0x0060] A[DONT_GENERATE, DONT_INLINE]
      0x006f: PHI (r8v9 app.chalo.providers.cityprovider.impl.data.models.app.CityAppModel) = 
      (r8v4 app.chalo.providers.cityprovider.impl.data.models.app.CityAppModel)
      (r8v19 app.chalo.providers.cityprovider.impl.data.models.app.CityAppModel)
     binds: [B:76:0x0196, B:20:0x0060] A[DONT_GENERATE, DONT_INLINE]
      0x006f: PHI (r12v16 app.chalo.livetracking.universalsearch.domain.SearchSourceType) = 
      (r12v14 app.chalo.livetracking.universalsearch.domain.SearchSourceType)
      (r12v26 app.chalo.livetracking.universalsearch.domain.SearchSourceType)
     binds: [B:76:0x0196, B:20:0x0060] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:37:0x00dd  */
    /* JADX WARN: Code duplicated, block: B:42:0x00fa  */
    /* JADX WARN: Code duplicated, block: B:45:0x010b  */
    /* JADX WARN: Code duplicated, block: B:48:0x0117  */
    /* JADX WARN: Code duplicated, block: B:49:0x011d  */
    /* JADX WARN: Code duplicated, block: B:51:0x0120  */
    /* JADX WARN: Code duplicated, block: B:58:0x013f A[PHI: r12 r13
      0x013f: PHI (r12v9 app.chalo.providers.cityprovider.impl.data.models.app.CityAppModel) = 
      (r12v5 app.chalo.providers.cityprovider.impl.data.models.app.CityAppModel)
      (r12v10 app.chalo.providers.cityprovider.impl.data.models.app.CityAppModel)
     binds: [B:50:0x011e, B:57:0x013d] A[DONT_GENERATE, DONT_INLINE]
      0x013f: PHI (r13v5 app.chalo.livetracking.universalsearch.domain.SearchSourceType) = 
      (r13v3 app.chalo.livetracking.universalsearch.domain.SearchSourceType)
      (r13v6 app.chalo.livetracking.universalsearch.domain.SearchSourceType)
     binds: [B:50:0x011e, B:57:0x013d] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:63:0x0159  */
    /* JADX WARN: Code duplicated, block: B:66:0x015e  */
    /* JADX WARN: Code duplicated, block: B:67:0x0161  */
    /* JADX WARN: Code duplicated, block: B:70:0x0167  */
    /* JADX WARN: Code duplicated, block: B:75:0x0189  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Code duplicated, block: B:80:0x01a2  */
    /* JADX WARN: Code duplicated, block: B:81:0x01a4  */
    /* JADX WARN: Code duplicated, block: B:83:0x01a8  */
    /* JADX WARN: Code duplicated, block: B:87:0x01c2  */
    /* JADX WARN: Code duplicated, block: B:95:0x020e A[Catch: Exception -> 0x0218, TryCatch #1 {Exception -> 0x0218, blocks: (B:125:0x028a, B:126:0x028c, B:128:0x0299, B:133:0x02a7, B:135:0x02b2, B:119:0x0271, B:93:0x01f8, B:95:0x020e, B:102:0x021f, B:103:0x022d, B:104:0x0230, B:105:0x0235, B:106:0x0236, B:111:0x0243, B:113:0x024c, B:116:0x025f, B:120:0x0274, B:122:0x0278, B:137:0x02b8, B:138:0x02bd, B:108:0x023b, B:109:0x023e), top: B:190:0x01f8 }] */
    /* JADX WARN: Code restructure failed: missing block: B:171:0x0393, code lost:
    
        if (r0 == r3) goto L182;
     */
    /* JADX WARN: Code restructure failed: missing block: B:181:0x03c3, code lost:
    
        if (r0 == r3) goto L182;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00e9, code lost:
    
        if (r0 == r3) goto L182;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x0131, code lost:
    
        if (r0 == r3) goto L182;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x0178, code lost:
    
        if (r0 == r3) goto L182;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(app.chalo.livetracking.universalsearch.domain.SearchSourceType r27, kotlin.coroutines.jvm.internal.ContinuationImpl r28) {
        /*
            Method dump skipped, instruction units count: 1050
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: app.chalo.livetracking.universalsearch.domain.FetchRemoteSearchResultUseCase.a(app.chalo.livetracking.universalsearch.domain.SearchSourceType, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }
}
