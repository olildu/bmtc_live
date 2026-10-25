package app.chalo.livetracking.universalsearch;

import androidx.media3.extractor.ts.TsExtractor;
import app.chalo.livetracking.universalsearch.domain.TransitModeSearchFilter;
import app.chalo.location.LatLng;
import app.chalo.providers.cityprovider.impl.data.models.app.ChaloTransitMode;
import app.chalo.universalsearch.data.UniversalSearchFlowSource;
import app.chalo.universalsearch.data.UniversalSearchOptions;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "app.chalo.livetracking.universalsearch.UniversalSearchManagerImpl$handleRemoteFetchQuery$1", f = "UniversalSearchManagerImpl.kt", l = {118, TsExtractor.TS_STREAM_TYPE_HDMV_DTS, 148, 157, 157, 158, 164, 196}, m = "invokeSuspend", v = 1)
final class UniversalSearchManagerImpl$handleRemoteFetchQuery$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ UniversalSearchResultAnalyticProperties $additionalAnalyticProperties;
    final /* synthetic */ String $previousQuery;
    final /* synthetic */ String $query;
    final /* synthetic */ UniversalSearchFlowSource $source;
    final /* synthetic */ ChaloTransitMode $transitMode;
    final /* synthetic */ TransitModeSearchFilter $transitModeSearchFilter;
    final /* synthetic */ UniversalSearchOptions $universalSearchOptions;
    final /* synthetic */ LatLng $userLatLng;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ UniversalSearchManagerImpl this$0;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f4963a;

        static {
            int[] iArr = new int[UniversalSearchFlowSource.values().length];
            try {
                iArr[UniversalSearchFlowSource.TRIP_PLANNER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[UniversalSearchFlowSource.STOP_FOCUSED_TRIP_PLANNER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[UniversalSearchFlowSource.HOME_WORK_SELECTION.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[UniversalSearchFlowSource.HOME_SCREEN_MAIN_FRAGMENT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[UniversalSearchFlowSource.STOP_BASED_ROUTE_SEARCH_SCREEN.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[UniversalSearchFlowSource.PREMIUM_FROM_STOP_SELECTION.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[UniversalSearchFlowSource.PREMIUM_TO_STOP_SELECTION.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[UniversalSearchFlowSource.NEAR_BY_STOPS.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[UniversalSearchFlowSource.HOME_SCREEN_TAB.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[UniversalSearchFlowSource.REGULAR_BUS_SCREEN_TAB.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr[UniversalSearchFlowSource.HOME_PREFERENCE_SELECTION.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr[UniversalSearchFlowSource.WORK_PREFERECNCE_SELECTION.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr[UniversalSearchFlowSource.UNKNOWN.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr[UniversalSearchFlowSource.CITY_SELECTION.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                iArr[UniversalSearchFlowSource.ONDC_STOP_BASED_SEARCH_SCREEN.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            f4963a = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UniversalSearchManagerImpl$handleRemoteFetchQuery$1(String str, UniversalSearchFlowSource universalSearchFlowSource, UniversalSearchManagerImpl universalSearchManagerImpl, String str2, UniversalSearchOptions universalSearchOptions, ChaloTransitMode chaloTransitMode, UniversalSearchResultAnalyticProperties universalSearchResultAnalyticProperties, TransitModeSearchFilter transitModeSearchFilter, LatLng latLng, Continuation continuation) {
        super(2, continuation);
        this.$previousQuery = str;
        this.$source = universalSearchFlowSource;
        this.this$0 = universalSearchManagerImpl;
        this.$query = str2;
        this.$universalSearchOptions = universalSearchOptions;
        this.$transitMode = chaloTransitMode;
        this.$additionalAnalyticProperties = universalSearchResultAnalyticProperties;
        this.$transitModeSearchFilter = transitModeSearchFilter;
        this.$userLatLng = latLng;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        UniversalSearchManagerImpl$handleRemoteFetchQuery$1 universalSearchManagerImpl$handleRemoteFetchQuery$1 = new UniversalSearchManagerImpl$handleRemoteFetchQuery$1(this.$previousQuery, this.$source, this.this$0, this.$query, this.$universalSearchOptions, this.$transitMode, this.$additionalAnalyticProperties, this.$transitModeSearchFilter, this.$userLatLng, continuation);
        universalSearchManagerImpl$handleRemoteFetchQuery$1.L$0 = obj;
        return universalSearchManagerImpl$handleRemoteFetchQuery$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((UniversalSearchManagerImpl$handleRemoteFetchQuery$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f17538a);
    }

    /* JADX WARN: Code duplicated, block: B:104:0x0169 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:22:0x0074 A[PHI: r1
      0x0074: PHI (r1v3 kotlinx.coroutines.CoroutineScope) = 
      (r1v2 kotlinx.coroutines.CoroutineScope)
      (r1v2 kotlinx.coroutines.CoroutineScope)
      (r1v2 kotlinx.coroutines.CoroutineScope)
      (r1v5 kotlinx.coroutines.CoroutineScope)
     binds: [B:15:0x005c, B:17:0x0062, B:20:0x0070, B:13:0x004a] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:24:0x007a  */
    /* JADX WARN: Code duplicated, block: B:26:0x0087  */
    /* JADX WARN: Code duplicated, block: B:28:0x008d  */
    /* JADX WARN: Code duplicated, block: B:32:0x00b3  */
    /* JADX WARN: Code duplicated, block: B:35:0x00c4 A[PHI: r1 r14
      0x00c4: PHI (r1v12 kotlinx.coroutines.CoroutineScope) = (r1v3 kotlinx.coroutines.CoroutineScope), (r1v14 kotlinx.coroutines.CoroutineScope) binds: [B:33:0x00c0, B:10:0x002f] A[DONT_GENERATE, DONT_INLINE]
      0x00c4: PHI (r14v28 java.lang.Object) = (r14v19 java.lang.Object), (r14v0 java.lang.Object) binds: [B:33:0x00c0, B:10:0x002f] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:38:0x00d3 A[PHI: r1 r14
      0x00d3: PHI (r1v15 kotlinx.coroutines.CoroutineScope) = (r1v12 kotlinx.coroutines.CoroutineScope), (r1v17 kotlinx.coroutines.CoroutineScope) binds: [B:36:0x00cf, B:9:0x0026] A[DONT_GENERATE, DONT_INLINE]
      0x00d3: PHI (r14v31 java.lang.Object) = (r14v30 java.lang.Object), (r14v0 java.lang.Object) binds: [B:36:0x00cf, B:9:0x0026] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:40:0x00d7  */
    /* JADX WARN: Code duplicated, block: B:45:0x00f7  */
    /* JADX WARN: Code duplicated, block: B:49:0x011a  */
    /* JADX WARN: Code duplicated, block: B:52:0x0139  */
    /* JADX WARN: Code duplicated, block: B:54:0x0147  */
    /* JADX WARN: Code duplicated, block: B:55:0x014a  */
    /* JADX WARN: Code duplicated, block: B:57:0x014e  */
    /* JADX WARN: Code duplicated, block: B:58:0x0151  */
    /* JADX WARN: Code duplicated, block: B:60:0x0155  */
    /* JADX WARN: Code duplicated, block: B:61:0x0158  */
    /* JADX WARN: Code duplicated, block: B:63:0x015c  */
    /* JADX WARN: Code duplicated, block: B:64:0x015f  */
    /* JADX WARN: Code duplicated, block: B:66:0x0163  */
    /* JADX WARN: Code duplicated, block: B:76:0x0187  */
    /* JADX WARN: Code duplicated, block: B:81:0x01a6  */
    /* JADX WARN: Code duplicated, block: B:83:0x01b3  */
    /* JADX WARN: Code duplicated, block: B:90:0x01d7  */
    /* JADX WARN: Code duplicated, block: B:93:0x01f8  */
    /* JADX WARN: Code duplicated, block: B:99:0x01bc A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00ab, code lost:
    
        if (r14 == r0) goto L95;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00ef, code lost:
    
        if (r14 == r0) goto L95;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x0113, code lost:
    
        if (r14 == r0) goto L95;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x017b, code lost:
    
        if (r14 == r0) goto L95;
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x0205, code lost:
    
        if (app.chalo.livetracking.universalsearch.UniversalSearchManagerImpl.e(r14, r6, r13) == r0) goto L95;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r14) {
        /*
            Method dump skipped, instruction units count: 580
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: app.chalo.livetracking.universalsearch.UniversalSearchManagerImpl$handleRemoteFetchQuery$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
