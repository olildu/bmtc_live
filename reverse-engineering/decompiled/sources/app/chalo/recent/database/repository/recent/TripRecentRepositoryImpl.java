package app.chalo.recent.database.repository.recent;

import app.chalo.contract.BasicInfoContract;
import app.chalo.domain.GetClusterConfigForCityUseCase;
import app.chalo.recent.localsource.recent.RecentTripLocalDataSource;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.sync.MutexImpl;
import kotlinx.coroutines.sync.MutexKt;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lapp/chalo/recent/database/repository/recent/TripRecentRepositoryImpl;", "Lapp/chalo/recent/database/repository/recent/TripRecentRepository;", "Companion", "framework-city-data_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class TripRecentRepositoryImpl implements TripRecentRepository {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final RecentTripLocalDataSource f8959a;
    public final BasicInfoContract b;
    public final GetClusterConfigForCityUseCase c;
    public final MutexImpl d = MutexKt.a();

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lapp/chalo/recent/database/repository/recent/TripRecentRepositoryImpl$Companion;", "", "", "MAX_RECENT_TRIPS", "I", "framework-city-data_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
    }

    public TripRecentRepositoryImpl(RecentTripLocalDataSource recentTripLocalDataSource, BasicInfoContract basicInfoContract, GetClusterConfigForCityUseCase getClusterConfigForCityUseCase) {
        this.f8959a = recentTripLocalDataSource;
        this.b = basicInfoContract;
        this.c = getClusterConfigForCityUseCase;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0074, code lost:
    
        if (r1.a(r8, r3, r4, r6) == r0) goto L23;
     */
    @Override // app.chalo.recent.database.repository.recent.TripRecentRepository
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(java.lang.String r8, java.lang.String r9, kotlin.coroutines.jvm.internal.ContinuationImpl r10) {
        /*
            r7 = this;
            boolean r0 = r10 instanceof app.chalo.recent.database.repository.recent.TripRecentRepositoryImpl$increaseAccessCountAndUpdateTime$1
            if (r0 == 0) goto L14
            r0 = r10
            app.chalo.recent.database.repository.recent.TripRecentRepositoryImpl$increaseAccessCountAndUpdateTime$1 r0 = (app.chalo.recent.database.repository.recent.TripRecentRepositoryImpl$increaseAccessCountAndUpdateTime$1) r0
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
            app.chalo.recent.database.repository.recent.TripRecentRepositoryImpl$increaseAccessCountAndUpdateTime$1 r0 = new app.chalo.recent.database.repository.recent.TripRecentRepositoryImpl$increaseAccessCountAndUpdateTime$1
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
            goto L77
        L2c:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L34:
            java.lang.Object r8 = r6.L$2
            java.lang.String r8 = (java.lang.String) r8
            java.lang.Object r9 = r6.L$1
            app.chalo.recent.localsource.recent.RecentTripLocalDataSource r9 = (app.chalo.recent.localsource.recent.RecentTripLocalDataSource) r9
            java.lang.Object r1 = r6.L$0
            java.lang.String r1 = (java.lang.String) r1
            kotlin.ResultKt.b(r10)
            r3 = r1
            r1 = r9
            goto L60
        L46:
            kotlin.ResultKt.b(r10)
            r6.L$0 = r9
            app.chalo.recent.localsource.recent.RecentTripLocalDataSource r10 = r7.f8959a
            r6.L$1 = r10
            r6.L$2 = r8
            r6.label = r3
            app.chalo.contract.BasicInfoContract r1 = r7.b
            java.lang.Object r1 = r1.c(r6)
            if (r1 != r0) goto L5c
            goto L76
        L5c:
            r3 = r1
            r1 = r10
            r10 = r3
            r3 = r9
        L60:
            java.lang.Number r10 = (java.lang.Number) r10
            long r4 = r10.longValue()
            r9 = 0
            r6.L$0 = r9
            r6.L$1 = r9
            r6.L$2 = r9
            r6.label = r2
            r2 = r8
            java.lang.Object r8 = r1.a(r2, r3, r4, r6)
            if (r8 != r0) goto L77
        L76:
            return r0
        L77:
            kotlin.Unit r8 = kotlin.Unit.f17538a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: app.chalo.recent.database.repository.recent.TripRecentRepositoryImpl.a(java.lang.String, java.lang.String, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0055, code lost:
    
        if (f(r6, r0) == r1) goto L21;
     */
    @Override // app.chalo.recent.database.repository.recent.TripRecentRepository
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(app.chalo.recent.model.app.RecentTripAppModel r6, boolean r7, kotlin.coroutines.jvm.internal.ContinuationImpl r8) {
        /*
            r5 = this;
            boolean r0 = r8 instanceof app.chalo.recent.database.repository.recent.TripRecentRepositoryImpl$insertOrUpdateTripRecent$1
            if (r0 == 0) goto L13
            r0 = r8
            app.chalo.recent.database.repository.recent.TripRecentRepositoryImpl$insertOrUpdateTripRecent$1 r0 = (app.chalo.recent.database.repository.recent.TripRecentRepositoryImpl$insertOrUpdateTripRecent$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            app.chalo.recent.database.repository.recent.TripRecentRepositoryImpl$insertOrUpdateTripRecent$1 r0 = new app.chalo.recent.database.repository.recent.TripRecentRepositoryImpl$insertOrUpdateTripRecent$1
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
            app.chalo.recent.model.app.RecentTripAppModel r6 = (app.chalo.recent.model.app.RecentTripAppModel) r6
            kotlin.ResultKt.b(r8)
            goto L4a
        L3a:
            kotlin.ResultKt.b(r8)
            r0.L$0 = r6
            r0.label = r4
            app.chalo.recent.localsource.recent.RecentTripLocalDataSource r8 = r5.f8959a
            java.lang.Object r7 = r8.b(r6, r7, r0)
            if (r7 != r1) goto L4a
            goto L57
        L4a:
            java.lang.String r6 = r6.f
            r7 = 0
            r0.L$0 = r7
            r0.label = r3
            java.lang.Object r6 = r5.f(r6, r0)
            if (r6 != r1) goto L58
        L57:
            return r1
        L58:
            kotlin.Unit r6 = kotlin.Unit.f17538a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: app.chalo.recent.database.repository.recent.TripRecentRepositoryImpl.b(app.chalo.recent.model.app.RecentTripAppModel, boolean, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    @Override // app.chalo.recent.database.repository.recent.TripRecentRepository
    public final Object c(String str, String str2, Continuation continuation) {
        Object objC = this.f8959a.c(str, str2, (ContinuationImpl) continuation);
        return objC == CoroutineSingletons.COROUTINE_SUSPENDED ? objC : Unit.f17538a;
    }

    @Override // app.chalo.recent.database.repository.recent.TripRecentRepository
    public final Object d(String str, Set set, Continuation continuation) {
        return this.f8959a.d(str, set);
    }

    @Override // app.chalo.recent.database.repository.recent.TripRecentRepository
    public final Object e(int i, String str, ContinuationImpl continuationImpl) {
        return this.f8959a.e(i, str, true);
    }

    /* JADX WARN: Code duplicated, block: B:43:0x00bb  */
    /* JADX WARN: Code duplicated, block: B:44:0x00bc A[Catch: all -> 0x003d, PHI: r2 r7 r13 r14
      0x00bc: PHI (r2v5 ??) = (r2v14 ??), (r2v13 ??) binds: [B:42:0x00b9, B:27:0x005e] A[DONT_GENERATE, DONT_INLINE]
      0x00bc: PHI (r7v2 java.lang.Object) = (r7v1 java.lang.Object), (r7v11 java.lang.Object) binds: [B:42:0x00b9, B:27:0x005e] A[DONT_GENERATE, DONT_INLINE]
      0x00bc: PHI (r13v7 kotlinx.coroutines.sync.Mutex) = (r13v6 kotlinx.coroutines.sync.Mutex), (r13v17 kotlinx.coroutines.sync.Mutex) binds: [B:42:0x00b9, B:27:0x005e] A[DONT_GENERATE, DONT_INLINE]
      0x00bc: PHI (r14v11 int) = (r14v10 int), (r14v19 int) binds: [B:42:0x00b9, B:27:0x005e] A[DONT_GENERATE, DONT_INLINE], TryCatch #2 {all -> 0x003d, blocks: (B:16:0x0038, B:23:0x004c, B:58:0x00e2, B:44:0x00bc, B:46:0x00c2, B:48:0x00c6, B:55:0x00d4, B:31:0x0070, B:41:0x00a5), top: B:71:0x0028 }] */
    /* JADX WARN: Code duplicated, block: B:46:0x00c2 A[Catch: all -> 0x003d, TryCatch #2 {all -> 0x003d, blocks: (B:16:0x0038, B:23:0x004c, B:58:0x00e2, B:44:0x00bc, B:46:0x00c2, B:48:0x00c6, B:55:0x00d4, B:31:0x0070, B:41:0x00a5), top: B:71:0x0028 }] */
    /* JADX WARN: Code duplicated, block: B:50:0x00cb  */
    /* JADX WARN: Code duplicated, block: B:53:0x00d0  */
    /* JADX WARN: Code duplicated, block: B:55:0x00d4 A[Catch: all -> 0x003d, TRY_ENTER, TryCatch #2 {all -> 0x003d, blocks: (B:16:0x0038, B:23:0x004c, B:58:0x00e2, B:44:0x00bc, B:46:0x00c2, B:48:0x00c6, B:55:0x00d4, B:31:0x0070, B:41:0x00a5), top: B:71:0x0028 }] */
    /* JADX WARN: Code duplicated, block: B:57:0x00e1  */
    /* JADX WARN: Code duplicated, block: B:58:0x00e2 A[Catch: all -> 0x003d, PHI: r13 r14
      0x00e2: PHI (r13v8 kotlinx.coroutines.sync.Mutex) = (r13v7 kotlinx.coroutines.sync.Mutex), (r13v19 kotlinx.coroutines.sync.Mutex) binds: [B:56:0x00df, B:23:0x004c] A[DONT_GENERATE, DONT_INLINE]
      0x00e2: PHI (r14v14 java.lang.Object) = (r14v13 java.lang.Object), (r14v1 java.lang.Object) binds: [B:56:0x00df, B:23:0x004c] A[DONT_GENERATE, DONT_INLINE], TRY_LEAVE, TryCatch #2 {all -> 0x003d, blocks: (B:16:0x0038, B:23:0x004c, B:58:0x00e2, B:44:0x00bc, B:46:0x00c2, B:48:0x00c6, B:55:0x00d4, B:31:0x0070, B:41:0x00a5), top: B:71:0x0028 }] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x00f1, code lost:
    
        if (((kotlinx.coroutines.flow.Flow) r14).collect(r2, r0) == r1) goto L60;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v0, types: [java.lang.Object, java.lang.String] */
    /* JADX WARN: Type inference failed for: r13v1, types: [kotlinx.coroutines.sync.Mutex] */
    /* JADX WARN: Type inference failed for: r13v12 */
    /* JADX WARN: Type inference failed for: r13v16 */
    /* JADX WARN: Type inference failed for: r13v2, types: [java.lang.Object, java.lang.String] */
    /* JADX WARN: Type inference failed for: r13v23 */
    /* JADX WARN: Type inference failed for: r13v4 */
    /* JADX WARN: Type inference failed for: r2v13 */
    /* JADX WARN: Type inference failed for: r2v14 */
    /* JADX WARN: Type inference failed for: r2v15 */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v4, types: [java.lang.Object, java.lang.String] */
    /* JADX WARN: Type inference failed for: r2v5, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r4v0, types: [app.chalo.recent.localsource.recent.RecentTripLocalDataSource] */
    /* JADX WARN: Type inference failed for: r8v1, types: [app.chalo.domain.GetClusterConfigForCityUseCase] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object f(java.lang.String r13, kotlin.coroutines.jvm.internal.ContinuationImpl r14) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 256
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: app.chalo.recent.database.repository.recent.TripRecentRepositoryImpl.f(java.lang.String, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }
}
