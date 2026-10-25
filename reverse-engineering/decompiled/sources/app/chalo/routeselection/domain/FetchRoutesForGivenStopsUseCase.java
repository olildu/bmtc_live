package app.chalo.routeselection.domain;

import app.chalo.ondc.repository.OndcRepository;
import app.chalo.providers.cityprovider.CityProvider;
import app.chalo.routeselection.data.repository.RouteSelectionRepository;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/routeselection/domain/FetchRoutesForGivenStopsUseCase;", "", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class FetchRoutesForGivenStopsUseCase {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CityProvider f9178a;
    public final RouteSelectionRepository b;
    public final OndcRepository c;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f9179a;

        static {
            int[] iArr = new int[RouteForStopPairRequestType.values().length];
            try {
                iArr[RouteForStopPairRequestType.REGULAR.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[RouteForStopPairRequestType.ONDC.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f9179a = iArr;
        }
    }

    public FetchRoutesForGivenStopsUseCase(CityProvider cityProvider, RouteSelectionRepository routeSelectionRepository, OndcRepository ondcRepository) {
        this.f9178a = cityProvider;
        this.b = routeSelectionRepository;
        this.c = ondcRepository;
    }

    /* JADX WARN: Code duplicated, block: B:35:0x0077  */
    /* JADX WARN: Code duplicated, block: B:36:0x0078 A[Catch: AvailableRoutesFetchFailedException -> 0x002e, CancellationException -> 0x0032, Exception -> 0x00a0, ChaloLocalException -> 0x00a3, NetworkSuccessResponseParseException -> 0x00a6, TryCatch #2 {ChaloLocalException -> 0x00a3, NetworkSuccessResponseParseException -> 0x00a6, AvailableRoutesFetchFailedException -> 0x002e, CancellationException -> 0x0032, Exception -> 0x00a0, blocks: (B:13:0x002a, B:33:0x006d, B:36:0x0078, B:21:0x003e, B:43:0x008f, B:47:0x009a, B:27:0x0050, B:30:0x005c, B:38:0x007e, B:39:0x0083, B:40:0x0084), top: B:55:0x0024 }] */
    /* JADX WARN: Code duplicated, block: B:8:0x0016  */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x008c, code lost:
    
        if (r0 == r1) goto L42;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(java.lang.String r11, java.lang.String r12, java.lang.String r13, app.chalo.routeselection.domain.RouteForStopPairRequestType r14, app.chalo.providers.cityprovider.impl.data.models.app.ChaloTransitMode r15, boolean r16, kotlin.coroutines.jvm.internal.ContinuationImpl r17) {
        /*
            r10 = this;
            r0 = r17
            boolean r1 = r0 instanceof app.chalo.routeselection.domain.FetchRoutesForGivenStopsUseCase$invoke$1
            if (r1 == 0) goto L16
            r1 = r0
            app.chalo.routeselection.domain.FetchRoutesForGivenStopsUseCase$invoke$1 r1 = (app.chalo.routeselection.domain.FetchRoutesForGivenStopsUseCase$invoke$1) r1
            int r2 = r1.label
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L16
            int r2 = r2 - r3
            r1.label = r2
        L14:
            r9 = r1
            goto L1c
        L16:
            app.chalo.routeselection.domain.FetchRoutesForGivenStopsUseCase$invoke$1 r1 = new app.chalo.routeselection.domain.FetchRoutesForGivenStopsUseCase$invoke$1
            r1.<init>(r10, r0)
            goto L14
        L1c:
            java.lang.Object r0 = r9.result
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r2 = r9.label
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L42
            if (r2 == r4) goto L3e
            if (r2 != r3) goto L36
            kotlin.ResultKt.b(r0)     // Catch: app.chalo.productbooking.routeselection.data.exception.AvailableRoutesFetchFailedException -> L2e java.util.concurrent.CancellationException -> L32 java.lang.Exception -> La0 app.chalo.network.exception.ChaloLocalException -> La3 app.chalo.network.exception.NetworkSuccessResponseParseException -> La6
            goto L6d
        L2e:
            r0 = move-exception
            r11 = r0
            goto La9
        L32:
            r0 = move-exception
            r11 = r0
            goto Lb4
        L36:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r12)
            throw r11
        L3e:
            kotlin.ResultKt.b(r0)     // Catch: app.chalo.productbooking.routeselection.data.exception.AvailableRoutesFetchFailedException -> L2e java.util.concurrent.CancellationException -> L32 java.lang.Exception -> La0 app.chalo.network.exception.ChaloLocalException -> La3 app.chalo.network.exception.NetworkSuccessResponseParseException -> La6
            goto L8f
        L42:
            kotlin.ResultKt.b(r0)
            app.chalo.providers.cityprovider.CityProvider r0 = r10.f9178a
            java.lang.String r6 = app.chalo.providers.cityprovider.CityProviderKt.b(r0)
            if (r6 != 0) goto L50
            app.chalo.routeselection.domain.FetchRoutesResult$CityNotAvailable r11 = app.chalo.routeselection.domain.FetchRoutesResult.CityNotAvailable.f9180a
            return r11
        L50:
            int[] r0 = app.chalo.routeselection.domain.FetchRoutesForGivenStopsUseCase.WhenMappings.f9179a     // Catch: app.chalo.productbooking.routeselection.data.exception.AvailableRoutesFetchFailedException -> L2e java.util.concurrent.CancellationException -> L32 java.lang.Exception -> La0 app.chalo.network.exception.ChaloLocalException -> La3 app.chalo.network.exception.NetworkSuccessResponseParseException -> La6
            int r14 = r14.ordinal()     // Catch: app.chalo.productbooking.routeselection.data.exception.AvailableRoutesFetchFailedException -> L2e java.util.concurrent.CancellationException -> L32 java.lang.Exception -> La0 app.chalo.network.exception.ChaloLocalException -> La3 app.chalo.network.exception.NetworkSuccessResponseParseException -> La6
            r14 = r0[r14]     // Catch: app.chalo.productbooking.routeselection.data.exception.AvailableRoutesFetchFailedException -> L2e java.util.concurrent.CancellationException -> L32 java.lang.Exception -> La0 app.chalo.network.exception.ChaloLocalException -> La3 app.chalo.network.exception.NetworkSuccessResponseParseException -> La6
            if (r14 == r4) goto L84
            if (r14 != r3) goto L7e
            app.chalo.ondc.repository.OndcRepository r2 = r10.c     // Catch: app.chalo.productbooking.routeselection.data.exception.AvailableRoutesFetchFailedException -> L2e java.util.concurrent.CancellationException -> L32 java.lang.Exception -> La0 app.chalo.network.exception.ChaloLocalException -> La3 app.chalo.network.exception.NetworkSuccessResponseParseException -> La6
            r9.label = r3     // Catch: app.chalo.productbooking.routeselection.data.exception.AvailableRoutesFetchFailedException -> L2e java.util.concurrent.CancellationException -> L32 java.lang.Exception -> La0 app.chalo.network.exception.ChaloLocalException -> La3 app.chalo.network.exception.NetworkSuccessResponseParseException -> La6
            r3 = r11
            r4 = r12
            r5 = r13
            r7 = r15
            r8 = r16
            java.lang.Object r0 = r2.l(r3, r4, r5, r6, r7, r8, r9)     // Catch: app.chalo.productbooking.routeselection.data.exception.AvailableRoutesFetchFailedException -> L2e java.util.concurrent.CancellationException -> L32 java.lang.Exception -> La0 app.chalo.network.exception.ChaloLocalException -> La3 app.chalo.network.exception.NetworkSuccessResponseParseException -> La6
            if (r0 != r1) goto L6d
            goto L8e
        L6d:
            app.chalo.ondc.model.app.OndcRouteSearchResultAppModel r0 = (app.chalo.ondc.model.app.OndcRouteSearchResultAppModel) r0     // Catch: app.chalo.productbooking.routeselection.data.exception.AvailableRoutesFetchFailedException -> L2e java.util.concurrent.CancellationException -> L32 java.lang.Exception -> La0 app.chalo.network.exception.ChaloLocalException -> La3 app.chalo.network.exception.NetworkSuccessResponseParseException -> La6
            java.util.List r11 = r0.f6770a     // Catch: app.chalo.productbooking.routeselection.data.exception.AvailableRoutesFetchFailedException -> L2e java.util.concurrent.CancellationException -> L32 java.lang.Exception -> La0 app.chalo.network.exception.ChaloLocalException -> La3 app.chalo.network.exception.NetworkSuccessResponseParseException -> La6
            boolean r11 = r11.isEmpty()     // Catch: app.chalo.productbooking.routeselection.data.exception.AvailableRoutesFetchFailedException -> L2e java.util.concurrent.CancellationException -> L32 java.lang.Exception -> La0 app.chalo.network.exception.ChaloLocalException -> La3 app.chalo.network.exception.NetworkSuccessResponseParseException -> La6
            if (r11 == 0) goto L78
            goto L97
        L78:
            app.chalo.routeselection.domain.FetchRoutesResult$Success$Ondc r11 = new app.chalo.routeselection.domain.FetchRoutesResult$Success$Ondc     // Catch: app.chalo.productbooking.routeselection.data.exception.AvailableRoutesFetchFailedException -> L2e java.util.concurrent.CancellationException -> L32 java.lang.Exception -> La0 app.chalo.network.exception.ChaloLocalException -> La3 app.chalo.network.exception.NetworkSuccessResponseParseException -> La6
            r11.<init>(r0)     // Catch: app.chalo.productbooking.routeselection.data.exception.AvailableRoutesFetchFailedException -> L2e java.util.concurrent.CancellationException -> L32 java.lang.Exception -> La0 app.chalo.network.exception.ChaloLocalException -> La3 app.chalo.network.exception.NetworkSuccessResponseParseException -> La6
            return r11
        L7e:
            kotlin.NoWhenBranchMatchedException r11 = new kotlin.NoWhenBranchMatchedException     // Catch: app.chalo.productbooking.routeselection.data.exception.AvailableRoutesFetchFailedException -> L2e java.util.concurrent.CancellationException -> L32 java.lang.Exception -> La0 app.chalo.network.exception.ChaloLocalException -> La3 app.chalo.network.exception.NetworkSuccessResponseParseException -> La6
            r11.<init>()     // Catch: app.chalo.productbooking.routeselection.data.exception.AvailableRoutesFetchFailedException -> L2e java.util.concurrent.CancellationException -> L32 java.lang.Exception -> La0 app.chalo.network.exception.ChaloLocalException -> La3 app.chalo.network.exception.NetworkSuccessResponseParseException -> La6
            throw r11     // Catch: app.chalo.productbooking.routeselection.data.exception.AvailableRoutesFetchFailedException -> L2e java.util.concurrent.CancellationException -> L32 java.lang.Exception -> La0 app.chalo.network.exception.ChaloLocalException -> La3 app.chalo.network.exception.NetworkSuccessResponseParseException -> La6
        L84:
            app.chalo.routeselection.data.repository.RouteSelectionRepository r14 = r10.b     // Catch: app.chalo.productbooking.routeselection.data.exception.AvailableRoutesFetchFailedException -> L2e java.util.concurrent.CancellationException -> L32 java.lang.Exception -> La0 app.chalo.network.exception.ChaloLocalException -> La3 app.chalo.network.exception.NetworkSuccessResponseParseException -> La6
            r9.label = r4     // Catch: app.chalo.productbooking.routeselection.data.exception.AvailableRoutesFetchFailedException -> L2e java.util.concurrent.CancellationException -> L32 java.lang.Exception -> La0 app.chalo.network.exception.ChaloLocalException -> La3 app.chalo.network.exception.NetworkSuccessResponseParseException -> La6
            java.io.Serializable r0 = r14.a(r11, r12, r6, r9)     // Catch: app.chalo.productbooking.routeselection.data.exception.AvailableRoutesFetchFailedException -> L2e java.util.concurrent.CancellationException -> L32 java.lang.Exception -> La0 app.chalo.network.exception.ChaloLocalException -> La3 app.chalo.network.exception.NetworkSuccessResponseParseException -> La6
            if (r0 != r1) goto L8f
        L8e:
            return r1
        L8f:
            java.util.List r0 = (java.util.List) r0     // Catch: app.chalo.productbooking.routeselection.data.exception.AvailableRoutesFetchFailedException -> L2e java.util.concurrent.CancellationException -> L32 java.lang.Exception -> La0 app.chalo.network.exception.ChaloLocalException -> La3 app.chalo.network.exception.NetworkSuccessResponseParseException -> La6
            boolean r11 = r0.isEmpty()     // Catch: app.chalo.productbooking.routeselection.data.exception.AvailableRoutesFetchFailedException -> L2e java.util.concurrent.CancellationException -> L32 java.lang.Exception -> La0 app.chalo.network.exception.ChaloLocalException -> La3 app.chalo.network.exception.NetworkSuccessResponseParseException -> La6
            if (r11 == 0) goto L9a
        L97:
            app.chalo.routeselection.domain.FetchRoutesResult$NoRoutesAvailable r11 = app.chalo.routeselection.domain.FetchRoutesResult.NoRoutesAvailable.f9182a
            return r11
        L9a:
            app.chalo.routeselection.domain.FetchRoutesResult$Success$Regular r11 = new app.chalo.routeselection.domain.FetchRoutesResult$Success$Regular     // Catch: app.chalo.productbooking.routeselection.data.exception.AvailableRoutesFetchFailedException -> L2e java.util.concurrent.CancellationException -> L32 java.lang.Exception -> La0 app.chalo.network.exception.ChaloLocalException -> La3 app.chalo.network.exception.NetworkSuccessResponseParseException -> La6
            r11.<init>(r0)     // Catch: app.chalo.productbooking.routeselection.data.exception.AvailableRoutesFetchFailedException -> L2e java.util.concurrent.CancellationException -> L32 java.lang.Exception -> La0 app.chalo.network.exception.ChaloLocalException -> La3 app.chalo.network.exception.NetworkSuccessResponseParseException -> La6
            return r11
        La0:
            app.chalo.routeselection.domain.FetchRoutesResult$UnknownException r11 = app.chalo.routeselection.domain.FetchRoutesResult.UnknownException.f9187a
            goto Lb3
        La3:
            app.chalo.routeselection.domain.FetchRoutesResult$LocalException r11 = app.chalo.routeselection.domain.FetchRoutesResult.LocalException.f9181a
            goto Lb3
        La6:
            app.chalo.routeselection.domain.FetchRoutesResult$ResponseParseException r11 = app.chalo.routeselection.domain.FetchRoutesResult.ResponseParseException.f9183a
            goto Lb3
        La9:
            app.chalo.routeselection.domain.FetchRoutesResult$ServerError r12 = new app.chalo.routeselection.domain.FetchRoutesResult$ServerError
            java.lang.String r11 = r11.getMessage()
            r12.<init>(r11)
            r11 = r12
        Lb3:
            return r11
        Lb4:
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: app.chalo.routeselection.domain.FetchRoutesForGivenStopsUseCase.a(java.lang.String, java.lang.String, java.lang.String, app.chalo.routeselection.domain.RouteForStopPairRequestType, app.chalo.providers.cityprovider.impl.data.models.app.ChaloTransitMode, boolean, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }
}
