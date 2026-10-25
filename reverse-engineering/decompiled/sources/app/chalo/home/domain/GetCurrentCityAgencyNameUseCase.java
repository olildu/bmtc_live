package app.chalo.home.domain;

import app.chalo.providers.cityprovider.CityProvider;
import app.chalo.utils.ConcurrentMutableMap;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/home/domain/GetCurrentCityAgencyNameUseCase;", "", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class GetCurrentCityAgencyNameUseCase {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final GetHomeScreenConfigUseCase f3035a;
    public final CityProvider b;
    public final ConcurrentMutableMap c = new ConcurrentMutableMap();
    public String d;

    public GetCurrentCityAgencyNameUseCase(GetHomeScreenConfigUseCase getHomeScreenConfigUseCase, CityProvider cityProvider) {
        this.f3035a = getHomeScreenConfigUseCase;
        this.b = cityProvider;
    }

    /* JADX WARN: Code duplicated, block: B:20:0x0052 A[PHI: r2 r10
      0x0052: PHI (r2v4 java.lang.String) = (r2v2 java.lang.String), (r2v12 java.lang.String) binds: [B:32:0x0085, B:19:0x004b] A[DONT_GENERATE, DONT_INLINE]
      0x0052: PHI (r10v7 java.lang.Object) = (r10v6 java.lang.Object), (r10v1 java.lang.Object) binds: [B:32:0x0085, B:19:0x004b] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:36:0x008c  */
    /* JADX WARN: Code duplicated, block: B:39:0x009d  */
    /* JADX WARN: Code duplicated, block: B:42:0x00a2  */
    /* JADX WARN: Code duplicated, block: B:47:0x00b5 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:49:0x00b7 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0078, code lost:
    
        if (r3.a(r0) == r1) goto L46;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(kotlin.coroutines.jvm.internal.ContinuationImpl r10) {
        /*
            r9 = this;
            boolean r0 = r10 instanceof app.chalo.home.domain.GetCurrentCityAgencyNameUseCase$invoke$1
            if (r0 == 0) goto L13
            r0 = r10
            app.chalo.home.domain.GetCurrentCityAgencyNameUseCase$invoke$1 r0 = (app.chalo.home.domain.GetCurrentCityAgencyNameUseCase$invoke$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            app.chalo.home.domain.GetCurrentCityAgencyNameUseCase$invoke$1 r0 = new app.chalo.home.domain.GetCurrentCityAgencyNameUseCase$invoke$1
            r0.<init>(r9, r10)
        L18:
            java.lang.Object r10 = r0.result
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r2 = r0.label
            app.chalo.utils.ConcurrentMutableMap r3 = r9.c
            r4 = 4
            r5 = 3
            r6 = 2
            r7 = 1
            r8 = 0
            if (r2 == 0) goto L5c
            if (r2 == r7) goto L54
            if (r2 == r6) goto L4b
            if (r2 == r5) goto L3f
            if (r2 != r4) goto L37
            java.lang.Object r0 = r0.L$0
            java.lang.String r0 = (java.lang.String) r0
            kotlin.ResultKt.b(r10)
            return r0
        L37:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r0)
            throw r10
        L3f:
            java.lang.Object r2 = r0.L$1
            app.chalo.home.domain.GetCurrentCityAgencyNameUseCase r2 = (app.chalo.home.domain.GetCurrentCityAgencyNameUseCase) r2
            java.lang.Object r3 = r0.L$0
            java.lang.String r3 = (java.lang.String) r3
            kotlin.ResultKt.b(r10)
            goto L9e
        L4b:
            java.lang.Object r2 = r0.L$0
            java.lang.String r2 = (java.lang.String) r2
            kotlin.ResultKt.b(r10)
        L52:
            r3 = r2
            goto L88
        L54:
            java.lang.Object r2 = r0.L$0
            java.lang.String r2 = (java.lang.String) r2
            kotlin.ResultKt.b(r10)
            goto L7b
        L5c:
            kotlin.ResultKt.b(r10)
            app.chalo.providers.cityprovider.CityProvider r10 = r9.b
            java.lang.String r2 = app.chalo.providers.cityprovider.CityProviderKt.b(r10)
            if (r2 != 0) goto L68
            goto Lb6
        L68:
            java.lang.String r10 = r9.d
            boolean r10 = kotlin.jvm.internal.Intrinsics.d(r10, r2)
            if (r10 != 0) goto L7d
            r0.L$0 = r2
            r0.label = r7
            java.lang.Object r10 = r3.a(r0)
            if (r10 != r1) goto L7b
            goto Lb4
        L7b:
            r9.d = r2
        L7d:
            r0.L$0 = r2
            r0.label = r6
            java.lang.Object r10 = r3.b(r2, r0)
            if (r10 != r1) goto L52
            goto Lb4
        L88:
            java.lang.String r10 = (java.lang.String) r10
            if (r10 != 0) goto Lb7
            r0.L$0 = r3
            r0.L$1 = r9
            r0.label = r5
            app.chalo.homescreen.data.model.app.HomeScreenConfigGetType r10 = app.chalo.homescreen.data.model.app.HomeScreenConfigGetType.BYPASS_REFRESH_IF_CACHED_DATA_AVAILABLE
            app.chalo.home.domain.GetHomeScreenConfigUseCase r2 = r9.f3035a
            java.lang.Object r10 = r2.c(r3, r10, r0)
            if (r10 != r1) goto L9d
            goto Lb4
        L9d:
            r2 = r9
        L9e:
            app.chalo.homescreen.data.model.app.HomeScreenConfigAppModel r10 = (app.chalo.homescreen.data.model.app.HomeScreenConfigAppModel) r10
            if (r10 == 0) goto Lb6
            java.lang.String r10 = r10.f3749a
            if (r10 == 0) goto Lb6
            app.chalo.utils.ConcurrentMutableMap r2 = r2.c
            r0.L$0 = r10
            r0.L$1 = r8
            r0.label = r4
            java.lang.Object r0 = r2.c(r3, r10, r0)
            if (r0 != r1) goto Lb5
        Lb4:
            return r1
        Lb5:
            return r10
        Lb6:
            return r8
        Lb7:
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: app.chalo.home.domain.GetCurrentCityAgencyNameUseCase.a(kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }
}
