package app.chalo.recent.database.repository.recent;

import app.chalo.contract.BasicInfoContract;
import app.chalo.recent.localsource.recent.RecentStopAndRouteBasedLocalDataSource;
import java.util.Set;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.sync.MutexKt;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lapp/chalo/recent/database/repository/recent/StopAndRouteBasedRecentRepositoryImpl;", "Lapp/chalo/recent/database/repository/recent/StopAndRouteBasedRecentRepository;", "Companion", "framework-city-data_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class StopAndRouteBasedRecentRepositoryImpl implements StopAndRouteBasedRecentRepository {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final RecentStopAndRouteBasedLocalDataSource f8956a;
    public final BasicInfoContract b;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lapp/chalo/recent/database/repository/recent/StopAndRouteBasedRecentRepositoryImpl$Companion;", "", "", "MAX_RECENT_STOP_BASED_TRIP", "I", "framework-city-data_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
    }

    public StopAndRouteBasedRecentRepositoryImpl(RecentStopAndRouteBasedLocalDataSource recentStopAndRouteBasedLocalDataSource, BasicInfoContract basicInfoContract) {
        this.f8956a = recentStopAndRouteBasedLocalDataSource;
        this.b = basicInfoContract;
        MutexKt.a();
    }

    @Override // app.chalo.recent.database.repository.recent.StopAndRouteBasedRecentRepository
    public final Object a(String str, Set set, Continuation continuation) {
        return this.f8956a.c(str, set);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0055, code lost:
    
        if (r3.b(r7, r0) == r1) goto L21;
     */
    @Override // app.chalo.recent.database.repository.recent.StopAndRouteBasedRecentRepository
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(app.chalo.recent.model.app.RecentStopAndRouteBasedAppModel r7, boolean r8, kotlin.coroutines.jvm.internal.ContinuationImpl r9) {
        /*
            r6 = this;
            boolean r0 = r9 instanceof app.chalo.recent.database.repository.recent.StopAndRouteBasedRecentRepositoryImpl$insertOrUpdate$1
            if (r0 == 0) goto L13
            r0 = r9
            app.chalo.recent.database.repository.recent.StopAndRouteBasedRecentRepositoryImpl$insertOrUpdate$1 r0 = (app.chalo.recent.database.repository.recent.StopAndRouteBasedRecentRepositoryImpl$insertOrUpdate$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            app.chalo.recent.database.repository.recent.StopAndRouteBasedRecentRepositoryImpl$insertOrUpdate$1 r0 = new app.chalo.recent.database.repository.recent.StopAndRouteBasedRecentRepositoryImpl$insertOrUpdate$1
            r0.<init>(r6, r9)
        L18:
            java.lang.Object r9 = r0.result
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r2 = r0.label
            app.chalo.recent.localsource.recent.RecentStopAndRouteBasedLocalDataSource r3 = r6.f8956a
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L3c
            if (r2 == r5) goto L34
            if (r2 != r4) goto L2c
            kotlin.ResultKt.b(r9)
            goto L58
        L2c:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L34:
            java.lang.Object r7 = r0.L$0
            app.chalo.recent.model.app.RecentStopAndRouteBasedAppModel r7 = (app.chalo.recent.model.app.RecentStopAndRouteBasedAppModel) r7
            kotlin.ResultKt.b(r9)
            goto L4a
        L3c:
            kotlin.ResultKt.b(r9)
            r0.L$0 = r7
            r0.label = r5
            java.lang.Object r8 = r3.d(r7, r8, r0)
            if (r8 != r1) goto L4a
            goto L57
        L4a:
            java.lang.String r7 = r7.b
            r8 = 0
            r0.L$0 = r8
            r0.label = r4
            java.lang.Object r7 = r3.b(r7, r0)
            if (r7 != r1) goto L58
        L57:
            return r1
        L58:
            kotlin.Unit r7 = kotlin.Unit.f17538a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: app.chalo.recent.database.repository.recent.StopAndRouteBasedRecentRepositoryImpl.b(app.chalo.recent.model.app.RecentStopAndRouteBasedAppModel, boolean, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }
}
