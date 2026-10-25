package app.chalo.recent.database.repository.recent;

import app.chalo.contract.BasicInfoContract;
import app.chalo.data.ClusterConfig;
import app.chalo.data.RecentsCacheProperties;
import app.chalo.domain.GetClusterConfigForCityUseCase;
import app.chalo.recent.localsource.recent.RecentRouteLocalDataSource;
import app.chalo.recent.model.app.RecentRouteAppModel;
import app.chalo.recent.model.app.RecentsSpecialStatus;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.sync.Mutex;
import kotlinx.coroutines.sync.MutexImpl;
import kotlinx.coroutines.sync.MutexKt;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lapp/chalo/recent/database/repository/recent/RouteRecentRepositoryImpl;", "Lapp/chalo/recent/database/repository/recent/RouteRecentRepository;", "Companion", "framework-city-data_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class RouteRecentRepositoryImpl implements RouteRecentRepository {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final RecentRouteLocalDataSource f8955a;
    public final BasicInfoContract b;
    public final GetClusterConfigForCityUseCase c;
    public final MutexImpl d = MutexKt.a();

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lapp/chalo/recent/database/repository/recent/RouteRecentRepositoryImpl$Companion;", "", "", "MAX_RECENT_ROUTES", "I", "framework-city-data_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
    }

    public RouteRecentRepositoryImpl(RecentRouteLocalDataSource recentRouteLocalDataSource, BasicInfoContract basicInfoContract, GetClusterConfigForCityUseCase getClusterConfigForCityUseCase) {
        this.f8955a = recentRouteLocalDataSource;
        this.b = basicInfoContract;
        this.c = getClusterConfigForCityUseCase;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0070, code lost:
    
        if (r1.a(r8, r3, r4, r6) == r0) goto L23;
     */
    @Override // app.chalo.recent.database.repository.recent.RouteRecentRepository
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(java.lang.String r8, java.lang.String r9, kotlin.coroutines.jvm.internal.ContinuationImpl r10) {
        /*
            r7 = this;
            boolean r0 = r10 instanceof app.chalo.recent.database.repository.recent.RouteRecentRepositoryImpl$increaseAccessCountAndUpdateTime$1
            if (r0 == 0) goto L14
            r0 = r10
            app.chalo.recent.database.repository.recent.RouteRecentRepositoryImpl$increaseAccessCountAndUpdateTime$1 r0 = (app.chalo.recent.database.repository.recent.RouteRecentRepositoryImpl$increaseAccessCountAndUpdateTime$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L14
            int r1 = r1 - r2
            r0.label = r1
        L12:
            r6 = r0
            goto L1a
        L14:
            app.chalo.recent.database.repository.recent.RouteRecentRepositoryImpl$increaseAccessCountAndUpdateTime$1 r0 = new app.chalo.recent.database.repository.recent.RouteRecentRepositoryImpl$increaseAccessCountAndUpdateTime$1
            r0.<init>(r7, r10)
            goto L12
        L1a:
            java.lang.Object r10 = r6.result
            kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r1 = r6.label
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L46
            if (r1 == r3) goto L34
            if (r1 != r2) goto L2c
            kotlin.ResultKt.b(r10)
            goto L73
        L2c:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L34:
            java.lang.Object r8 = r6.L$2
            r9 = r8
            java.lang.String r9 = (java.lang.String) r9
            java.lang.Object r8 = r6.L$1
            java.lang.String r8 = (java.lang.String) r8
            java.lang.Object r1 = r6.L$0
            app.chalo.recent.localsource.recent.RecentRouteLocalDataSource r1 = (app.chalo.recent.localsource.recent.RecentRouteLocalDataSource) r1
            kotlin.ResultKt.b(r10)
        L44:
            r3 = r9
            goto L5c
        L46:
            kotlin.ResultKt.b(r10)
            app.chalo.recent.localsource.recent.RecentRouteLocalDataSource r1 = r7.f8955a
            r6.L$0 = r1
            r6.L$1 = r8
            r6.L$2 = r9
            r6.label = r3
            app.chalo.contract.BasicInfoContract r10 = r7.b
            java.lang.Object r10 = r10.c(r6)
            if (r10 != r0) goto L44
            goto L72
        L5c:
            java.lang.Number r10 = (java.lang.Number) r10
            long r4 = r10.longValue()
            r9 = 0
            r6.L$0 = r9
            r6.L$1 = r9
            r6.L$2 = r9
            r6.label = r2
            r2 = r8
            java.lang.Object r8 = r1.a(r2, r3, r4, r6)
            if (r8 != r0) goto L73
        L72:
            return r0
        L73:
            kotlin.Unit r8 = kotlin.Unit.f17538a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: app.chalo.recent.database.repository.recent.RouteRecentRepositoryImpl.a(java.lang.String, java.lang.String, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    @Override // app.chalo.recent.database.repository.recent.RouteRecentRepository
    public final Object b(String str, String str2, ContinuationImpl continuationImpl) {
        Object objB = this.f8955a.b(str, str2, continuationImpl);
        return objB == CoroutineSingletons.COROUTINE_SUSPENDED ? objB : Unit.f17538a;
    }

    @Override // app.chalo.recent.database.repository.recent.RouteRecentRepository
    public final Object c(RecentsSpecialStatus recentsSpecialStatus, String str, String str2, ContinuationImpl continuationImpl) {
        return this.f8955a.g(recentsSpecialStatus, str, str2, continuationImpl);
    }

    @Override // app.chalo.recent.database.repository.recent.RouteRecentRepository
    public final Object d(String str, SuspendLambda suspendLambda) {
        return this.f8955a.k(str);
    }

    @Override // app.chalo.recent.database.repository.recent.RouteRecentRepository
    public final Object e(String str, Set set, Continuation continuation) {
        return this.f8955a.m(str, set);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0055, code lost:
    
        if (h(r6, r0) == r1) goto L21;
     */
    @Override // app.chalo.recent.database.repository.recent.RouteRecentRepository
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object f(app.chalo.recent.model.app.RecentRouteAppModel r6, boolean r7, kotlin.coroutines.jvm.internal.ContinuationImpl r8) {
        /*
            r5 = this;
            boolean r0 = r8 instanceof app.chalo.recent.database.repository.recent.RouteRecentRepositoryImpl$insertOrUpdateRouteRecent$1
            if (r0 == 0) goto L13
            r0 = r8
            app.chalo.recent.database.repository.recent.RouteRecentRepositoryImpl$insertOrUpdateRouteRecent$1 r0 = (app.chalo.recent.database.repository.recent.RouteRecentRepositoryImpl$insertOrUpdateRouteRecent$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            app.chalo.recent.database.repository.recent.RouteRecentRepositoryImpl$insertOrUpdateRouteRecent$1 r0 = new app.chalo.recent.database.repository.recent.RouteRecentRepositoryImpl$insertOrUpdateRouteRecent$1
            r0.<init>(r5, r8)
        L18:
            java.lang.Object r8 = r0.result
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r2 = r0.label
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3a
            if (r2 == r4) goto L32
            if (r2 != r3) goto L2a
            kotlin.ResultKt.b(r8)
            goto L58
        L2a:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L32:
            java.lang.Object r6 = r0.L$0
            app.chalo.recent.model.app.RecentRouteAppModel r6 = (app.chalo.recent.model.app.RecentRouteAppModel) r6
            kotlin.ResultKt.b(r8)
            goto L4a
        L3a:
            kotlin.ResultKt.b(r8)
            r0.L$0 = r6
            r0.label = r4
            app.chalo.recent.localsource.recent.RecentRouteLocalDataSource r8 = r5.f8955a
            java.lang.Object r7 = r8.d(r6, r7, r0)
            if (r7 != r1) goto L4a
            goto L57
        L4a:
            java.lang.String r6 = r6.f
            r7 = 0
            r0.L$0 = r7
            r0.label = r3
            java.lang.Object r6 = r5.h(r6, r0)
            if (r6 != r1) goto L58
        L57:
            return r1
        L58:
            kotlin.Unit r6 = kotlin.Unit.f17538a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: app.chalo.recent.database.repository.recent.RouteRecentRepositoryImpl.f(app.chalo.recent.model.app.RecentRouteAppModel, boolean, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    @Override // app.chalo.recent.database.repository.recent.RouteRecentRepository
    public final Object g(Continuation continuation) {
        return this.f8955a.j();
    }

    /* JADX WARN: Code duplicated, block: B:41:0x00b7  */
    /* JADX WARN: Code duplicated, block: B:42:0x00b8  */
    /* JADX WARN: Code duplicated, block: B:45:0x00c2 A[Catch: all -> 0x0041, TryCatch #0 {all -> 0x0041, blocks: (B:16:0x003c, B:58:0x00e9, B:60:0x00ef, B:23:0x0051, B:57:0x00e1, B:26:0x0060, B:43:0x00bc, B:45:0x00c2, B:47:0x00c6, B:54:0x00d4, B:29:0x006d, B:39:0x00a1, B:36:0x0094), top: B:67:0x0028 }] */
    /* JADX WARN: Code duplicated, block: B:49:0x00cb  */
    /* JADX WARN: Code duplicated, block: B:52:0x00d0  */
    /* JADX WARN: Code duplicated, block: B:54:0x00d4 A[Catch: all -> 0x0041, TRY_ENTER, TryCatch #0 {all -> 0x0041, blocks: (B:16:0x003c, B:58:0x00e9, B:60:0x00ef, B:23:0x0051, B:57:0x00e1, B:26:0x0060, B:43:0x00bc, B:45:0x00c2, B:47:0x00c6, B:54:0x00d4, B:29:0x006d, B:39:0x00a1, B:36:0x0094), top: B:67:0x0028 }] */
    /* JADX WARN: Code duplicated, block: B:56:0x00e0  */
    /* JADX WARN: Code duplicated, block: B:57:0x00e1 A[Catch: all -> 0x0041, PHI: r2 r14
      0x00e1: PHI (r2v7 kotlinx.coroutines.sync.Mutex) = (r2v22 kotlinx.coroutines.sync.Mutex), (r2v23 kotlinx.coroutines.sync.Mutex) binds: [B:55:0x00de, B:23:0x0051] A[DONT_GENERATE, DONT_INLINE]
      0x00e1: PHI (r14v16 java.lang.Object) = (r14v13 java.lang.Object), (r14v1 java.lang.Object) binds: [B:55:0x00de, B:23:0x0051] A[DONT_GENERATE, DONT_INLINE], TryCatch #0 {all -> 0x0041, blocks: (B:16:0x003c, B:58:0x00e9, B:60:0x00ef, B:23:0x0051, B:57:0x00e1, B:26:0x0060, B:43:0x00bc, B:45:0x00c2, B:47:0x00c6, B:54:0x00d4, B:29:0x006d, B:39:0x00a1, B:36:0x0094), top: B:67:0x0028 }] */
    /* JADX WARN: Code duplicated, block: B:60:0x00ef A[Catch: all -> 0x0041, TRY_LEAVE, TryCatch #0 {all -> 0x0041, blocks: (B:16:0x003c, B:58:0x00e9, B:60:0x00ef, B:23:0x0051, B:57:0x00e1, B:26:0x0060, B:43:0x00bc, B:45:0x00c2, B:47:0x00c6, B:54:0x00d4, B:29:0x006d, B:39:0x00a1, B:36:0x0094), top: B:67:0x0028 }] */
    /* JADX WARN: Code duplicated, block: B:70:0x0105 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:72:? A[LOOP:0: B:58:0x00e9->B:72:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [int] */
    /* JADX WARN: Type inference failed for: r2v1, types: [kotlinx.coroutines.sync.Mutex] */
    /* JADX WARN: Type inference failed for: r2v20 */
    /* JADX WARN: Type inference failed for: r2v21 */
    /* JADX WARN: Type inference failed for: r2v8, types: [java.lang.Object, kotlinx.coroutines.sync.Mutex] */
    public final Object h(String str, ContinuationImpl continuationImpl) {
        RouteRecentRepositoryImpl$purgeOldEntries$1 routeRecentRepositoryImpl$purgeOldEntries$1;
        Mutex mutex;
        Mutex mutex2;
        int iIntValue;
        Object objA;
        String str2;
        int i;
        Mutex mutex3;
        RecentsCacheProperties recentsCacheProperties;
        int iIntValue2;
        int i2;
        Integer num;
        Mutex mutex4;
        Iterator it;
        String str3;
        String str4;
        if (continuationImpl instanceof RouteRecentRepositoryImpl$purgeOldEntries$1) {
            routeRecentRepositoryImpl$purgeOldEntries$1 = (RouteRecentRepositoryImpl$purgeOldEntries$1) continuationImpl;
            int i3 = routeRecentRepositoryImpl$purgeOldEntries$1.label;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                routeRecentRepositoryImpl$purgeOldEntries$1.label = i3 - Integer.MIN_VALUE;
            } else {
                routeRecentRepositoryImpl$purgeOldEntries$1 = new RouteRecentRepositoryImpl$purgeOldEntries$1(this, continuationImpl);
            }
        } else {
            routeRecentRepositoryImpl$purgeOldEntries$1 = new RouteRecentRepositoryImpl$purgeOldEntries$1(this, continuationImpl);
        }
        Object objE = routeRecentRepositoryImpl$purgeOldEntries$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        ?? r2 = routeRecentRepositoryImpl$purgeOldEntries$1.label;
        Unit unit = Unit.f17538a;
        RecentRouteLocalDataSource recentRouteLocalDataSource = this.f8955a;
        try {
            if (r2 == 0) {
                ResultKt.b(objE);
                routeRecentRepositoryImpl$purgeOldEntries$1.L$0 = str;
                MutexImpl mutexImpl = this.d;
                routeRecentRepositoryImpl$purgeOldEntries$1.L$1 = mutexImpl;
                routeRecentRepositoryImpl$purgeOldEntries$1.label = 1;
                if (mutexImpl.a(routeRecentRepositoryImpl$purgeOldEntries$1) != coroutineSingletons) {
                    mutex = mutexImpl;
                }
                return coroutineSingletons;
            }
            if (r2 == 1) {
                Mutex mutex5 = (Mutex) routeRecentRepositoryImpl$purgeOldEntries$1.L$1;
                String str5 = (String) routeRecentRepositoryImpl$purgeOldEntries$1.L$0;
                ResultKt.b(objE);
                mutex = mutex5;
                str = str5;
            } else {
                if (r2 == 2) {
                    Mutex mutex6 = (Mutex) routeRecentRepositoryImpl$purgeOldEntries$1.L$1;
                    str = (String) routeRecentRepositoryImpl$purgeOldEntries$1.L$0;
                    ResultKt.b(objE);
                    mutex2 = mutex6;
                    iIntValue = ((Number) objE).intValue();
                    GetClusterConfigForCityUseCase getClusterConfigForCityUseCase = this.c;
                    routeRecentRepositoryImpl$purgeOldEntries$1.L$0 = str;
                    routeRecentRepositoryImpl$purgeOldEntries$1.L$1 = mutex2;
                    routeRecentRepositoryImpl$purgeOldEntries$1.I$0 = iIntValue;
                    routeRecentRepositoryImpl$purgeOldEntries$1.label = 3;
                    objA = getClusterConfigForCityUseCase.a(str, routeRecentRepositoryImpl$purgeOldEntries$1);
                    if (objA == coroutineSingletons) {
                        str2 = str;
                        i = iIntValue;
                        objE = objA;
                        mutex3 = mutex2;
                        recentsCacheProperties = ((ClusterConfig) objE).d;
                        if (recentsCacheProperties != null) {
                            iIntValue2 = 10;
                        } else {
                            iIntValue2 = 10;
                        }
                        i2 = i - iIntValue2;
                        if (i2 <= 0) {
                            mutex3.e(null);
                            return unit;
                        }
                        routeRecentRepositoryImpl$purgeOldEntries$1.L$0 = mutex3;
                        routeRecentRepositoryImpl$purgeOldEntries$1.L$1 = null;
                        routeRecentRepositoryImpl$purgeOldEntries$1.label = 4;
                        objE = recentRouteLocalDataSource.c(i2, str2, routeRecentRepositoryImpl$purgeOldEntries$1);
                        if (objE != coroutineSingletons) {
                            mutex4 = mutex3;
                        } else {
                            mutex4 = mutex3;
                            it = ((List) objE).iterator();
                            r2 = mutex4;
                        }
                    }
                    return coroutineSingletons;
                }
                if (r2 == 3) {
                    i = routeRecentRepositoryImpl$purgeOldEntries$1.I$0;
                    Mutex mutex7 = (Mutex) routeRecentRepositoryImpl$purgeOldEntries$1.L$1;
                    str2 = (String) routeRecentRepositoryImpl$purgeOldEntries$1.L$0;
                    ResultKt.b(objE);
                    mutex3 = mutex7;
                    recentsCacheProperties = ((ClusterConfig) objE).d;
                    if (recentsCacheProperties != null || (num = recentsCacheProperties.b) == null) {
                        iIntValue2 = 10;
                    } else {
                        iIntValue2 = num.intValue();
                    }
                    i2 = i - iIntValue2;
                    if (i2 <= 0) {
                        mutex3.e(null);
                        return unit;
                    }
                    routeRecentRepositoryImpl$purgeOldEntries$1.L$0 = mutex3;
                    routeRecentRepositoryImpl$purgeOldEntries$1.L$1 = null;
                    routeRecentRepositoryImpl$purgeOldEntries$1.label = 4;
                    objE = recentRouteLocalDataSource.c(i2, str2, routeRecentRepositoryImpl$purgeOldEntries$1);
                    if (objE != coroutineSingletons) {
                        mutex4 = mutex3;
                    } else {
                        mutex4 = mutex3;
                        it = ((List) objE).iterator();
                        r2 = mutex4;
                    }
                    return coroutineSingletons;
                }
                if (r2 == 4) {
                    Mutex mutex8 = (Mutex) routeRecentRepositoryImpl$purgeOldEntries$1.L$0;
                    ResultKt.b(objE);
                    mutex4 = mutex8;
                    mutex4 = mutex3;
                    it = ((List) objE).iterator();
                    r2 = mutex4;
                } else {
                    if (r2 != 5) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    it = (Iterator) routeRecentRepositoryImpl$purgeOldEntries$1.L$1;
                    Mutex mutex9 = (Mutex) routeRecentRepositoryImpl$purgeOldEntries$1.L$0;
                    ResultKt.b(objE);
                    r2 = mutex9;
                }
            }
            while (it.hasNext()) {
                RecentRouteAppModel recentRouteAppModel = (RecentRouteAppModel) it.next();
                str3 = recentRouteAppModel.e;
                str4 = recentRouteAppModel.f;
                routeRecentRepositoryImpl$purgeOldEntries$1.L$0 = r2;
                routeRecentRepositoryImpl$purgeOldEntries$1.L$1 = it;
                routeRecentRepositoryImpl$purgeOldEntries$1.label = 5;
                if (recentRouteLocalDataSource.b(str3, str4, routeRecentRepositoryImpl$purgeOldEntries$1) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            }
            r2.e(null);
            return unit;
            routeRecentRepositoryImpl$purgeOldEntries$1.L$0 = str;
            routeRecentRepositoryImpl$purgeOldEntries$1.L$1 = mutex;
            routeRecentRepositoryImpl$purgeOldEntries$1.label = 2;
            objE = recentRouteLocalDataSource.e(str, routeRecentRepositoryImpl$purgeOldEntries$1);
            mutex2 = mutex;
            if (objE != coroutineSingletons) {
                iIntValue = ((Number) objE).intValue();
                GetClusterConfigForCityUseCase getClusterConfigForCityUseCase2 = this.c;
                routeRecentRepositoryImpl$purgeOldEntries$1.L$0 = str;
                routeRecentRepositoryImpl$purgeOldEntries$1.L$1 = mutex2;
                routeRecentRepositoryImpl$purgeOldEntries$1.I$0 = iIntValue;
                routeRecentRepositoryImpl$purgeOldEntries$1.label = 3;
                objA = getClusterConfigForCityUseCase2.a(str, routeRecentRepositoryImpl$purgeOldEntries$1);
                if (objA == coroutineSingletons) {
                    str2 = str;
                    i = iIntValue;
                    objE = objA;
                    mutex3 = mutex2;
                    recentsCacheProperties = ((ClusterConfig) objE).d;
                    if (recentsCacheProperties != null) {
                        iIntValue2 = 10;
                    } else {
                        iIntValue2 = 10;
                    }
                    i2 = i - iIntValue2;
                    if (i2 <= 0) {
                        mutex3.e(null);
                        return unit;
                    }
                    routeRecentRepositoryImpl$purgeOldEntries$1.L$0 = mutex3;
                    routeRecentRepositoryImpl$purgeOldEntries$1.L$1 = null;
                    routeRecentRepositoryImpl$purgeOldEntries$1.label = 4;
                    objE = recentRouteLocalDataSource.c(i2, str2, routeRecentRepositoryImpl$purgeOldEntries$1);
                    if (objE != coroutineSingletons) {
                        mutex4 = mutex3;
                        it = ((List) objE).iterator();
                        r2 = mutex4;
                        while (it.hasNext()) {
                            RecentRouteAppModel recentRouteAppModel2 = (RecentRouteAppModel) it.next();
                            str3 = recentRouteAppModel2.e;
                            str4 = recentRouteAppModel2.f;
                            routeRecentRepositoryImpl$purgeOldEntries$1.L$0 = r2;
                            routeRecentRepositoryImpl$purgeOldEntries$1.L$1 = it;
                            routeRecentRepositoryImpl$purgeOldEntries$1.label = 5;
                            if (recentRouteLocalDataSource.b(str3, str4, routeRecentRepositoryImpl$purgeOldEntries$1) == coroutineSingletons) {
                            }
                        }
                        r2.e(null);
                        return unit;
                    }
                    mutex4 = mutex3;
                }
            }
            return coroutineSingletons;
        } catch (Throwable th) {
            r2.e(null);
            throw th;
        }
    }
}
