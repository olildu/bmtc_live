package app.chalo.metro.domain;

import app.chalo.metro.repository.MetroRepository;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/metro/domain/FetchAndStoreMetroLiveBookingStatusUseCase;", "", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class FetchAndStoreMetroLiveBookingStatusUseCase {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final MetroRepository f5438a;

    public FetchAndStoreMetroLiveBookingStatusUseCase(MetroRepository metroRepository) {
        this.f5438a = metroRepository;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0082, code lost:
    
        if (r3.k(r8, r0) == r1) goto L30;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(java.util.List r8, kotlin.coroutines.jvm.internal.ContinuationImpl r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof app.chalo.metro.domain.FetchAndStoreMetroLiveBookingStatusUseCase$invoke$1
            if (r0 == 0) goto L13
            r0 = r9
            app.chalo.metro.domain.FetchAndStoreMetroLiveBookingStatusUseCase$invoke$1 r0 = (app.chalo.metro.domain.FetchAndStoreMetroLiveBookingStatusUseCase$invoke$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            app.chalo.metro.domain.FetchAndStoreMetroLiveBookingStatusUseCase$invoke$1 r0 = new app.chalo.metro.domain.FetchAndStoreMetroLiveBookingStatusUseCase$invoke$1
            r0.<init>(r7, r9)
        L18:
            java.lang.Object r9 = r0.result
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r2 = r0.label
            app.chalo.metro.repository.MetroRepository r3 = r7.f5438a
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L3a
            if (r2 == r5) goto L36
            if (r2 != r4) goto L2e
            kotlin.ResultKt.b(r9)     // Catch: java.lang.Exception -> L2c
            goto L85
        L2c:
            r8 = move-exception
            goto L8d
        L2e:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L36:
            kotlin.ResultKt.b(r9)     // Catch: java.lang.Exception -> L2c
            goto L4b
        L3a:
            kotlin.ResultKt.b(r9)
            app.chalo.metro.data.api.MetroLiveBookingStatusRequestApiModel r9 = new app.chalo.metro.data.api.MetroLiveBookingStatusRequestApiModel     // Catch: java.lang.Exception -> L2c
            r9.<init>(r8)     // Catch: java.lang.Exception -> L2c
            r0.label = r5     // Catch: java.lang.Exception -> L2c
            java.io.Serializable r9 = r3.b(r9, r0)     // Catch: java.lang.Exception -> L2c
            if (r9 != r1) goto L4b
            goto L84
        L4b:
            java.util.List r9 = (java.util.List) r9     // Catch: java.lang.Exception -> L2c
            java.lang.Iterable r9 = (java.lang.Iterable) r9     // Catch: java.lang.Exception -> L2c
            java.util.ArrayList r8 = new java.util.ArrayList     // Catch: java.lang.Exception -> L2c
            r2 = 10
            int r2 = kotlin.collections.CollectionsKt.v(r9, r2)     // Catch: java.lang.Exception -> L2c
            r8.<init>(r2)     // Catch: java.lang.Exception -> L2c
            java.util.Iterator r9 = r9.iterator()     // Catch: java.lang.Exception -> L2c
        L5e:
            boolean r2 = r9.hasNext()     // Catch: java.lang.Exception -> L2c
            if (r2 == 0) goto L7c
            java.lang.Object r2 = r9.next()     // Catch: java.lang.Exception -> L2c
            app.chalo.metro.data.app.MetroLiveBookingStatusResponseAppModel r2 = (app.chalo.metro.data.app.MetroLiveBookingStatusResponseAppModel) r2     // Catch: java.lang.Exception -> L2c
            java.lang.String r5 = "<this>"
            kotlin.jvm.internal.Intrinsics.i(r2, r5)     // Catch: java.lang.Exception -> L2c
            app.chalo.metro.dao.MetroTicketBookingStatusUpdateEntity r5 = new app.chalo.metro.dao.MetroTicketBookingStatusUpdateEntity     // Catch: java.lang.Exception -> L2c
            java.lang.String r6 = r2.f5430a     // Catch: java.lang.Exception -> L2c
            app.chalo.metro.data.app.MetroTicketStatus r2 = r2.b     // Catch: java.lang.Exception -> L2c
            r5.<init>(r6, r2)     // Catch: java.lang.Exception -> L2c
            r8.add(r5)     // Catch: java.lang.Exception -> L2c
            goto L5e
        L7c:
            r0.label = r4     // Catch: java.lang.Exception -> L2c
            java.lang.Object r8 = r3.k(r8, r0)     // Catch: java.lang.Exception -> L2c
            if (r8 != r1) goto L85
        L84:
            return r1
        L85:
            app.chalo.utils.ChaloUseCaseResult$Success r8 = new app.chalo.utils.ChaloUseCaseResult$Success     // Catch: java.lang.Exception -> L2c
            kotlin.Unit r9 = kotlin.Unit.f17538a     // Catch: java.lang.Exception -> L2c
            r8.<init>(r9)     // Catch: java.lang.Exception -> L2c
            return r8
        L8d:
            app.chalo.utils.ChaloUseCaseResult$Failure r9 = new app.chalo.utils.ChaloUseCaseResult$Failure
            java.lang.String r8 = r8.getMessage()
            if (r8 != 0) goto L97
            java.lang.String r8 = "Unknown error"
        L97:
            r9.<init>(r8)
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: app.chalo.metro.domain.FetchAndStoreMetroLiveBookingStatusUseCase.a(java.util.List, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }
}
