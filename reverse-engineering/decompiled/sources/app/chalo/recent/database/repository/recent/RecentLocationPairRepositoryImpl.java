package app.chalo.recent.database.repository.recent;

import app.chalo.contract.BasicInfoContract;
import app.chalo.data.ClusterConfig;
import app.chalo.data.RecentsCacheProperties;
import app.chalo.domain.GetClusterConfigForCityUseCase;
import app.chalo.recent.localsource.recent.RecentLocationPairLocalDataSource;
import app.chalo.recent.model.app.RecentLocationPairAppModel;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.sync.Mutex;
import kotlinx.coroutines.sync.MutexImpl;
import kotlinx.coroutines.sync.MutexKt;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lapp/chalo/recent/database/repository/recent/RecentLocationPairRepositoryImpl;", "Lapp/chalo/recent/database/repository/recent/RecentLocationPairRepository;", "Companion", "framework-city-data_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class RecentLocationPairRepositoryImpl implements RecentLocationPairRepository {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final RecentLocationPairLocalDataSource f8953a;
    public final BasicInfoContract b;
    public final GetClusterConfigForCityUseCase c;
    public final MutexImpl d = MutexKt.a();

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lapp/chalo/recent/database/repository/recent/RecentLocationPairRepositoryImpl$Companion;", "", "", "DEFAULT_MAX_RECENT_LOCATION_PAIRS", "I", "framework-city-data_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
    }

    public RecentLocationPairRepositoryImpl(RecentLocationPairLocalDataSource recentLocationPairLocalDataSource, BasicInfoContract basicInfoContract, GetClusterConfigForCityUseCase getClusterConfigForCityUseCase) {
        this.f8953a = recentLocationPairLocalDataSource;
        this.b = basicInfoContract;
        this.c = getClusterConfigForCityUseCase;
    }

    /* JADX WARN: Code duplicated, block: B:28:0x006c A[PHI: r2 r10 r11
      0x006c: PHI (r2v9 kotlinx.coroutines.sync.Mutex) = (r2v33 kotlinx.coroutines.sync.Mutex), (r2v34 kotlinx.coroutines.sync.Mutex) binds: [B:35:0x009d, B:27:0x0069] A[DONT_GENERATE, DONT_INLINE]
      0x006c: PHI (r10v6 java.lang.String) = (r10v2 java.lang.String), (r10v10 java.lang.String) binds: [B:35:0x009d, B:27:0x0069] A[DONT_GENERATE, DONT_INLINE]
      0x006c: PHI (r11v5 java.lang.Object) = (r11v4 java.lang.Object), (r11v1 java.lang.Object) binds: [B:35:0x009d, B:27:0x0069] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:36:0x009f  */
    /* JADX WARN: Code duplicated, block: B:39:0x00b8  */
    /* JADX WARN: Code duplicated, block: B:40:0x00b9 A[Catch: all -> 0x003b, PHI: r2 r6 r10 r11
      0x00b9: PHI (r2v12 kotlinx.coroutines.sync.Mutex) = (r2v31 kotlinx.coroutines.sync.Mutex), (r2v32 kotlinx.coroutines.sync.Mutex) binds: [B:38:0x00b6, B:24:0x005c] A[DONT_GENERATE, DONT_INLINE]
      0x00b9: PHI (r6v1 java.lang.String) = (r6v0 java.lang.String), (r6v3 java.lang.String) binds: [B:38:0x00b6, B:24:0x005c] A[DONT_GENERATE, DONT_INLINE]
      0x00b9: PHI (r10v11 int) = (r10v7 int), (r10v13 int) binds: [B:38:0x00b6, B:24:0x005c] A[DONT_GENERATE, DONT_INLINE]
      0x00b9: PHI (r11v9 java.lang.Object) = (r11v8 java.lang.Object), (r11v1 java.lang.Object) binds: [B:38:0x00b6, B:24:0x005c] A[DONT_GENERATE, DONT_INLINE], TryCatch #0 {all -> 0x003b, blocks: (B:13:0x0036, B:60:0x00f8, B:62:0x00fe, B:18:0x0043, B:57:0x00ee, B:59:0x00f2, B:21:0x004d, B:54:0x00e0, B:24:0x005c, B:40:0x00b9, B:42:0x00bf, B:44:0x00c3, B:51:0x00d1, B:27:0x0069, B:37:0x00a1, B:34:0x0092), top: B:69:0x0023 }] */
    /* JADX WARN: Code duplicated, block: B:42:0x00bf A[Catch: all -> 0x003b, TryCatch #0 {all -> 0x003b, blocks: (B:13:0x0036, B:60:0x00f8, B:62:0x00fe, B:18:0x0043, B:57:0x00ee, B:59:0x00f2, B:21:0x004d, B:54:0x00e0, B:24:0x005c, B:40:0x00b9, B:42:0x00bf, B:44:0x00c3, B:51:0x00d1, B:27:0x0069, B:37:0x00a1, B:34:0x0092), top: B:69:0x0023 }] */
    /* JADX WARN: Code duplicated, block: B:46:0x00c8  */
    /* JADX WARN: Code duplicated, block: B:49:0x00cd  */
    /* JADX WARN: Code duplicated, block: B:51:0x00d1 A[Catch: all -> 0x003b, TRY_ENTER, TryCatch #0 {all -> 0x003b, blocks: (B:13:0x0036, B:60:0x00f8, B:62:0x00fe, B:18:0x0043, B:57:0x00ee, B:59:0x00f2, B:21:0x004d, B:54:0x00e0, B:24:0x005c, B:40:0x00b9, B:42:0x00bf, B:44:0x00c3, B:51:0x00d1, B:27:0x0069, B:37:0x00a1, B:34:0x0092), top: B:69:0x0023 }] */
    /* JADX WARN: Code duplicated, block: B:53:0x00df  */
    /* JADX WARN: Code duplicated, block: B:54:0x00e0 A[Catch: all -> 0x003b, PHI: r2 r11
      0x00e0: PHI (r2v15 kotlinx.coroutines.sync.Mutex) = (r2v29 kotlinx.coroutines.sync.Mutex), (r2v30 kotlinx.coroutines.sync.Mutex) binds: [B:52:0x00dd, B:21:0x004d] A[DONT_GENERATE, DONT_INLINE]
      0x00e0: PHI (r11v19 java.lang.Object) = (r11v16 java.lang.Object), (r11v1 java.lang.Object) binds: [B:52:0x00dd, B:21:0x004d] A[DONT_GENERATE, DONT_INLINE], TryCatch #0 {all -> 0x003b, blocks: (B:13:0x0036, B:60:0x00f8, B:62:0x00fe, B:18:0x0043, B:57:0x00ee, B:59:0x00f2, B:21:0x004d, B:54:0x00e0, B:24:0x005c, B:40:0x00b9, B:42:0x00bf, B:44:0x00c3, B:51:0x00d1, B:27:0x0069, B:37:0x00a1, B:34:0x0092), top: B:69:0x0023 }] */
    /* JADX WARN: Code duplicated, block: B:56:0x00ed  */
    /* JADX WARN: Code duplicated, block: B:57:0x00ee A[Catch: all -> 0x003b, PHI: r2 r11
      0x00ee: PHI (r2v18 ??) = (r2v27 ??), (r2v28 ??) binds: [B:55:0x00eb, B:18:0x0043] A[DONT_GENERATE, DONT_INLINE]
      0x00ee: PHI (r11v22 java.lang.Object) = (r11v21 java.lang.Object), (r11v1 java.lang.Object) binds: [B:55:0x00eb, B:18:0x0043] A[DONT_GENERATE, DONT_INLINE], TryCatch #0 {all -> 0x003b, blocks: (B:13:0x0036, B:60:0x00f8, B:62:0x00fe, B:18:0x0043, B:57:0x00ee, B:59:0x00f2, B:21:0x004d, B:54:0x00e0, B:24:0x005c, B:40:0x00b9, B:42:0x00bf, B:44:0x00c3, B:51:0x00d1, B:27:0x0069, B:37:0x00a1, B:34:0x0092), top: B:69:0x0023 }] */
    /* JADX WARN: Code duplicated, block: B:59:0x00f2 A[Catch: all -> 0x003b, TryCatch #0 {all -> 0x003b, blocks: (B:13:0x0036, B:60:0x00f8, B:62:0x00fe, B:18:0x0043, B:57:0x00ee, B:59:0x00f2, B:21:0x004d, B:54:0x00e0, B:24:0x005c, B:40:0x00b9, B:42:0x00bf, B:44:0x00c3, B:51:0x00d1, B:27:0x0069, B:37:0x00a1, B:34:0x0092), top: B:69:0x0023 }] */
    /* JADX WARN: Code duplicated, block: B:62:0x00fe A[Catch: all -> 0x003b, TRY_LEAVE, TryCatch #0 {all -> 0x003b, blocks: (B:13:0x0036, B:60:0x00f8, B:62:0x00fe, B:18:0x0043, B:57:0x00ee, B:59:0x00f2, B:21:0x004d, B:54:0x00e0, B:24:0x005c, B:40:0x00b9, B:42:0x00bf, B:44:0x00c3, B:51:0x00d1, B:27:0x0069, B:37:0x00a1, B:34:0x0092), top: B:69:0x0023 }] */
    /* JADX WARN: Code duplicated, block: B:72:0x0115 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:74:? A[LOOP:0: B:60:0x00f8->B:74:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [int] */
    /* JADX WARN: Type inference failed for: r2v1, types: [kotlinx.coroutines.sync.Mutex] */
    /* JADX WARN: Type inference failed for: r2v18 */
    /* JADX WARN: Type inference failed for: r2v21, types: [kotlinx.coroutines.sync.Mutex] */
    /* JADX WARN: Type inference failed for: r2v22, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v25 */
    /* JADX WARN: Type inference failed for: r2v26 */
    /* JADX WARN: Type inference failed for: r2v27 */
    /* JADX WARN: Type inference failed for: r2v28 */
    public final Object a(String str, ContinuationImpl continuationImpl) {
        RecentLocationPairRepositoryImpl$purgeOldEntries$1 recentLocationPairRepositoryImpl$purgeOldEntries$1;
        Mutex mutex;
        Mutex mutex2;
        String str2;
        int iIntValue;
        Mutex mutex3;
        RecentsCacheProperties recentsCacheProperties;
        int iIntValue2;
        int i;
        Integer num;
        Mutex mutex4;
        List list;
        Iterator it;
        String str3;
        String str4;
        if (continuationImpl instanceof RecentLocationPairRepositoryImpl$purgeOldEntries$1) {
            recentLocationPairRepositoryImpl$purgeOldEntries$1 = (RecentLocationPairRepositoryImpl$purgeOldEntries$1) continuationImpl;
            int i2 = recentLocationPairRepositoryImpl$purgeOldEntries$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                recentLocationPairRepositoryImpl$purgeOldEntries$1.label = i2 - Integer.MIN_VALUE;
            } else {
                recentLocationPairRepositoryImpl$purgeOldEntries$1 = new RecentLocationPairRepositoryImpl$purgeOldEntries$1(this, continuationImpl);
            }
        } else {
            recentLocationPairRepositoryImpl$purgeOldEntries$1 = new RecentLocationPairRepositoryImpl$purgeOldEntries$1(this, continuationImpl);
        }
        Object objC = recentLocationPairRepositoryImpl$purgeOldEntries$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        ?? r2 = recentLocationPairRepositoryImpl$purgeOldEntries$1.label;
        Unit unit = Unit.f17538a;
        RecentLocationPairLocalDataSource recentLocationPairLocalDataSource = this.f8953a;
        try {
            switch (r2) {
                case 0:
                    ResultKt.b(objC);
                    recentLocationPairRepositoryImpl$purgeOldEntries$1.L$0 = str;
                    MutexImpl mutexImpl = this.d;
                    recentLocationPairRepositoryImpl$purgeOldEntries$1.L$1 = mutexImpl;
                    recentLocationPairRepositoryImpl$purgeOldEntries$1.label = 1;
                    if (mutexImpl.a(recentLocationPairRepositoryImpl$purgeOldEntries$1) != coroutineSingletons) {
                        mutex = mutexImpl;
                        recentLocationPairRepositoryImpl$purgeOldEntries$1.L$0 = str;
                        recentLocationPairRepositoryImpl$purgeOldEntries$1.L$1 = mutex;
                        recentLocationPairRepositoryImpl$purgeOldEntries$1.label = 2;
                        objC = recentLocationPairLocalDataSource.c(str, recentLocationPairRepositoryImpl$purgeOldEntries$1);
                        mutex2 = mutex;
                        if (objC == coroutineSingletons) {
                            str2 = str;
                            iIntValue = ((Number) objC).intValue();
                            GetClusterConfigForCityUseCase getClusterConfigForCityUseCase = this.c;
                            recentLocationPairRepositoryImpl$purgeOldEntries$1.L$0 = str2;
                            recentLocationPairRepositoryImpl$purgeOldEntries$1.L$1 = mutex2;
                            recentLocationPairRepositoryImpl$purgeOldEntries$1.I$0 = iIntValue;
                            recentLocationPairRepositoryImpl$purgeOldEntries$1.label = 3;
                            objC = getClusterConfigForCityUseCase.a(str2, recentLocationPairRepositoryImpl$purgeOldEntries$1);
                            mutex3 = mutex2;
                            if (objC != coroutineSingletons) {
                                recentsCacheProperties = ((ClusterConfig) objC).d;
                                if (recentsCacheProperties != null || (num = recentsCacheProperties.f) == null) {
                                    iIntValue2 = 10;
                                } else {
                                    iIntValue2 = num.intValue();
                                }
                                i = iIntValue - iIntValue2;
                                if (i <= 0) {
                                    mutex3.e(null);
                                    return unit;
                                }
                                recentLocationPairRepositoryImpl$purgeOldEntries$1.L$0 = mutex3;
                                recentLocationPairRepositoryImpl$purgeOldEntries$1.L$1 = null;
                                recentLocationPairRepositoryImpl$purgeOldEntries$1.label = 4;
                                objC = recentLocationPairLocalDataSource.d(i, str2, false);
                                if (objC == coroutineSingletons) {
                                    mutex4 = mutex3;
                                } else {
                                    mutex4 = mutex3;
                                    recentLocationPairRepositoryImpl$purgeOldEntries$1.L$0 = mutex4;
                                    recentLocationPairRepositoryImpl$purgeOldEntries$1.label = 5;
                                    objC = FlowKt.v((Flow) objC, recentLocationPairRepositoryImpl$purgeOldEntries$1);
                                    r2 = mutex4;
                                    if (objC != coroutineSingletons) {
                                        list = (List) objC;
                                        if (list != null) {
                                            it = list.iterator();
                                            r2 = r2;
                                            while (it.hasNext()) {
                                                RecentLocationPairAppModel recentLocationPairAppModel = (RecentLocationPairAppModel) it.next();
                                                str3 = recentLocationPairAppModel.e;
                                                str4 = recentLocationPairAppModel.f;
                                                recentLocationPairRepositoryImpl$purgeOldEntries$1.L$0 = r2;
                                                recentLocationPairRepositoryImpl$purgeOldEntries$1.L$1 = it;
                                                recentLocationPairRepositoryImpl$purgeOldEntries$1.label = 6;
                                                if (recentLocationPairLocalDataSource.e(str3, str4, recentLocationPairRepositoryImpl$purgeOldEntries$1) == coroutineSingletons) {
                                                }
                                                break;
                                            }
                                        }
                                        r2.e(null);
                                        return unit;
                                    }
                                }
                            }
                        }
                    }
                    return coroutineSingletons;
                case 1:
                    Mutex mutex5 = (Mutex) recentLocationPairRepositoryImpl$purgeOldEntries$1.L$1;
                    String str5 = (String) recentLocationPairRepositoryImpl$purgeOldEntries$1.L$0;
                    ResultKt.b(objC);
                    mutex = mutex5;
                    str = str5;
                    recentLocationPairRepositoryImpl$purgeOldEntries$1.L$0 = str;
                    recentLocationPairRepositoryImpl$purgeOldEntries$1.L$1 = mutex;
                    recentLocationPairRepositoryImpl$purgeOldEntries$1.label = 2;
                    objC = recentLocationPairLocalDataSource.c(str, recentLocationPairRepositoryImpl$purgeOldEntries$1);
                    mutex2 = mutex;
                    if (objC == coroutineSingletons) {
                        str2 = str;
                        iIntValue = ((Number) objC).intValue();
                        GetClusterConfigForCityUseCase getClusterConfigForCityUseCase2 = this.c;
                        recentLocationPairRepositoryImpl$purgeOldEntries$1.L$0 = str2;
                        recentLocationPairRepositoryImpl$purgeOldEntries$1.L$1 = mutex2;
                        recentLocationPairRepositoryImpl$purgeOldEntries$1.I$0 = iIntValue;
                        recentLocationPairRepositoryImpl$purgeOldEntries$1.label = 3;
                        objC = getClusterConfigForCityUseCase2.a(str2, recentLocationPairRepositoryImpl$purgeOldEntries$1);
                        mutex3 = mutex2;
                        if (objC != coroutineSingletons) {
                            recentsCacheProperties = ((ClusterConfig) objC).d;
                            if (recentsCacheProperties != null) {
                                iIntValue2 = 10;
                            } else {
                                iIntValue2 = 10;
                            }
                            i = iIntValue - iIntValue2;
                            if (i <= 0) {
                                mutex3.e(null);
                                return unit;
                            }
                            recentLocationPairRepositoryImpl$purgeOldEntries$1.L$0 = mutex3;
                            recentLocationPairRepositoryImpl$purgeOldEntries$1.L$1 = null;
                            recentLocationPairRepositoryImpl$purgeOldEntries$1.label = 4;
                            objC = recentLocationPairLocalDataSource.d(i, str2, false);
                            if (objC == coroutineSingletons) {
                                mutex4 = mutex3;
                            } else {
                                mutex4 = mutex3;
                                recentLocationPairRepositoryImpl$purgeOldEntries$1.L$0 = mutex4;
                                recentLocationPairRepositoryImpl$purgeOldEntries$1.label = 5;
                                objC = FlowKt.v((Flow) objC, recentLocationPairRepositoryImpl$purgeOldEntries$1);
                                r2 = mutex4;
                                if (objC != coroutineSingletons) {
                                    list = (List) objC;
                                    if (list != null) {
                                        it = list.iterator();
                                        r2 = r2;
                                        while (it.hasNext()) {
                                            RecentLocationPairAppModel recentLocationPairAppModel2 = (RecentLocationPairAppModel) it.next();
                                            str3 = recentLocationPairAppModel2.e;
                                            str4 = recentLocationPairAppModel2.f;
                                            recentLocationPairRepositoryImpl$purgeOldEntries$1.L$0 = r2;
                                            recentLocationPairRepositoryImpl$purgeOldEntries$1.L$1 = it;
                                            recentLocationPairRepositoryImpl$purgeOldEntries$1.label = 6;
                                            if (recentLocationPairLocalDataSource.e(str3, str4, recentLocationPairRepositoryImpl$purgeOldEntries$1) == coroutineSingletons) {
                                            }
                                            break;
                                        }
                                    }
                                    r2.e(null);
                                    return unit;
                                }
                            }
                        }
                    }
                    return coroutineSingletons;
                case 2:
                    Mutex mutex6 = (Mutex) recentLocationPairRepositoryImpl$purgeOldEntries$1.L$1;
                    str = (String) recentLocationPairRepositoryImpl$purgeOldEntries$1.L$0;
                    ResultKt.b(objC);
                    mutex2 = mutex6;
                    str2 = str;
                    iIntValue = ((Number) objC).intValue();
                    GetClusterConfigForCityUseCase getClusterConfigForCityUseCase3 = this.c;
                    recentLocationPairRepositoryImpl$purgeOldEntries$1.L$0 = str2;
                    recentLocationPairRepositoryImpl$purgeOldEntries$1.L$1 = mutex2;
                    recentLocationPairRepositoryImpl$purgeOldEntries$1.I$0 = iIntValue;
                    recentLocationPairRepositoryImpl$purgeOldEntries$1.label = 3;
                    objC = getClusterConfigForCityUseCase3.a(str2, recentLocationPairRepositoryImpl$purgeOldEntries$1);
                    mutex3 = mutex2;
                    if (objC != coroutineSingletons) {
                        recentsCacheProperties = ((ClusterConfig) objC).d;
                        if (recentsCacheProperties != null) {
                            iIntValue2 = 10;
                        } else {
                            iIntValue2 = 10;
                        }
                        i = iIntValue - iIntValue2;
                        if (i <= 0) {
                            mutex3.e(null);
                            return unit;
                        }
                        recentLocationPairRepositoryImpl$purgeOldEntries$1.L$0 = mutex3;
                        recentLocationPairRepositoryImpl$purgeOldEntries$1.L$1 = null;
                        recentLocationPairRepositoryImpl$purgeOldEntries$1.label = 4;
                        objC = recentLocationPairLocalDataSource.d(i, str2, false);
                        if (objC == coroutineSingletons) {
                            mutex4 = mutex3;
                        } else {
                            mutex4 = mutex3;
                            recentLocationPairRepositoryImpl$purgeOldEntries$1.L$0 = mutex4;
                            recentLocationPairRepositoryImpl$purgeOldEntries$1.label = 5;
                            objC = FlowKt.v((Flow) objC, recentLocationPairRepositoryImpl$purgeOldEntries$1);
                            r2 = mutex4;
                            if (objC != coroutineSingletons) {
                                list = (List) objC;
                                if (list != null) {
                                    it = list.iterator();
                                    r2 = r2;
                                    while (it.hasNext()) {
                                        RecentLocationPairAppModel recentLocationPairAppModel3 = (RecentLocationPairAppModel) it.next();
                                        str3 = recentLocationPairAppModel3.e;
                                        str4 = recentLocationPairAppModel3.f;
                                        recentLocationPairRepositoryImpl$purgeOldEntries$1.L$0 = r2;
                                        recentLocationPairRepositoryImpl$purgeOldEntries$1.L$1 = it;
                                        recentLocationPairRepositoryImpl$purgeOldEntries$1.label = 6;
                                        if (recentLocationPairLocalDataSource.e(str3, str4, recentLocationPairRepositoryImpl$purgeOldEntries$1) == coroutineSingletons) {
                                        }
                                        break;
                                    }
                                }
                                r2.e(null);
                                return unit;
                            }
                        }
                    }
                    return coroutineSingletons;
                case 3:
                    iIntValue = recentLocationPairRepositoryImpl$purgeOldEntries$1.I$0;
                    Mutex mutex7 = (Mutex) recentLocationPairRepositoryImpl$purgeOldEntries$1.L$1;
                    str2 = (String) recentLocationPairRepositoryImpl$purgeOldEntries$1.L$0;
                    ResultKt.b(objC);
                    mutex3 = mutex7;
                    recentsCacheProperties = ((ClusterConfig) objC).d;
                    if (recentsCacheProperties != null) {
                        iIntValue2 = 10;
                    } else {
                        iIntValue2 = 10;
                    }
                    i = iIntValue - iIntValue2;
                    if (i <= 0) {
                        mutex3.e(null);
                        return unit;
                    }
                    recentLocationPairRepositoryImpl$purgeOldEntries$1.L$0 = mutex3;
                    recentLocationPairRepositoryImpl$purgeOldEntries$1.L$1 = null;
                    recentLocationPairRepositoryImpl$purgeOldEntries$1.label = 4;
                    objC = recentLocationPairLocalDataSource.d(i, str2, false);
                    if (objC == coroutineSingletons) {
                        mutex4 = mutex3;
                    } else {
                        mutex4 = mutex3;
                        recentLocationPairRepositoryImpl$purgeOldEntries$1.L$0 = mutex4;
                        recentLocationPairRepositoryImpl$purgeOldEntries$1.label = 5;
                        objC = FlowKt.v((Flow) objC, recentLocationPairRepositoryImpl$purgeOldEntries$1);
                        r2 = mutex4;
                        if (objC != coroutineSingletons) {
                            list = (List) objC;
                            if (list != null) {
                                it = list.iterator();
                                r2 = r2;
                                while (it.hasNext()) {
                                    RecentLocationPairAppModel recentLocationPairAppModel4 = (RecentLocationPairAppModel) it.next();
                                    str3 = recentLocationPairAppModel4.e;
                                    str4 = recentLocationPairAppModel4.f;
                                    recentLocationPairRepositoryImpl$purgeOldEntries$1.L$0 = r2;
                                    recentLocationPairRepositoryImpl$purgeOldEntries$1.L$1 = it;
                                    recentLocationPairRepositoryImpl$purgeOldEntries$1.label = 6;
                                    if (recentLocationPairLocalDataSource.e(str3, str4, recentLocationPairRepositoryImpl$purgeOldEntries$1) == coroutineSingletons) {
                                    }
                                    break;
                                }
                            }
                            r2.e(null);
                            return unit;
                        }
                    }
                    return coroutineSingletons;
                case 4:
                    Mutex mutex8 = (Mutex) recentLocationPairRepositoryImpl$purgeOldEntries$1.L$0;
                    ResultKt.b(objC);
                    mutex4 = mutex8;
                    mutex4 = mutex3;
                    recentLocationPairRepositoryImpl$purgeOldEntries$1.L$0 = mutex4;
                    recentLocationPairRepositoryImpl$purgeOldEntries$1.label = 5;
                    objC = FlowKt.v((Flow) objC, recentLocationPairRepositoryImpl$purgeOldEntries$1);
                    r2 = mutex4;
                    if (objC != coroutineSingletons) {
                        list = (List) objC;
                        if (list != null) {
                            it = list.iterator();
                            r2 = r2;
                            while (it.hasNext()) {
                                RecentLocationPairAppModel recentLocationPairAppModel5 = (RecentLocationPairAppModel) it.next();
                                str3 = recentLocationPairAppModel5.e;
                                str4 = recentLocationPairAppModel5.f;
                                recentLocationPairRepositoryImpl$purgeOldEntries$1.L$0 = r2;
                                recentLocationPairRepositoryImpl$purgeOldEntries$1.L$1 = it;
                                recentLocationPairRepositoryImpl$purgeOldEntries$1.label = 6;
                                if (recentLocationPairLocalDataSource.e(str3, str4, recentLocationPairRepositoryImpl$purgeOldEntries$1) == coroutineSingletons) {
                                }
                                break;
                            }
                        }
                        r2.e(null);
                        return unit;
                    }
                    return coroutineSingletons;
                case 5:
                    Mutex mutex9 = (Mutex) recentLocationPairRepositoryImpl$purgeOldEntries$1.L$0;
                    ResultKt.b(objC);
                    r2 = mutex9;
                    list = (List) objC;
                    if (list != null) {
                        it = list.iterator();
                        r2 = r2;
                        while (it.hasNext()) {
                            RecentLocationPairAppModel recentLocationPairAppModel6 = (RecentLocationPairAppModel) it.next();
                            str3 = recentLocationPairAppModel6.e;
                            str4 = recentLocationPairAppModel6.f;
                            recentLocationPairRepositoryImpl$purgeOldEntries$1.L$0 = r2;
                            recentLocationPairRepositoryImpl$purgeOldEntries$1.L$1 = it;
                            recentLocationPairRepositoryImpl$purgeOldEntries$1.label = 6;
                            if (recentLocationPairLocalDataSource.e(str3, str4, recentLocationPairRepositoryImpl$purgeOldEntries$1) == coroutineSingletons) {
                                return coroutineSingletons;
                            }
                            break;
                        }
                    }
                    r2.e(null);
                    return unit;
                case 6:
                    it = (Iterator) recentLocationPairRepositoryImpl$purgeOldEntries$1.L$1;
                    Mutex mutex10 = (Mutex) recentLocationPairRepositoryImpl$purgeOldEntries$1.L$0;
                    ResultKt.b(objC);
                    r2 = mutex10;
                    while (it.hasNext()) {
                        RecentLocationPairAppModel recentLocationPairAppModel7 = (RecentLocationPairAppModel) it.next();
                        str3 = recentLocationPairAppModel7.e;
                        str4 = recentLocationPairAppModel7.f;
                        recentLocationPairRepositoryImpl$purgeOldEntries$1.L$0 = r2;
                        recentLocationPairRepositoryImpl$purgeOldEntries$1.L$1 = it;
                        recentLocationPairRepositoryImpl$purgeOldEntries$1.label = 6;
                        if (recentLocationPairLocalDataSource.e(str3, str4, recentLocationPairRepositoryImpl$purgeOldEntries$1) == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                        break;
                    }
                    r2.e(null);
                    return unit;
                default:
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } catch (Throwable th) {
            r2.e(null);
            throw th;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0055, code lost:
    
        if (a(r6, r0) == r1) goto L21;
     */
    @Override // app.chalo.recent.database.repository.recent.RecentLocationPairRepository
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(app.chalo.recent.model.app.RecentLocationPairAppModel r6, boolean r7, kotlin.coroutines.jvm.internal.ContinuationImpl r8) {
        /*
            r5 = this;
            boolean r0 = r8 instanceof app.chalo.recent.database.repository.recent.RecentLocationPairRepositoryImpl$insertOrUpdate$1
            if (r0 == 0) goto L13
            r0 = r8
            app.chalo.recent.database.repository.recent.RecentLocationPairRepositoryImpl$insertOrUpdate$1 r0 = (app.chalo.recent.database.repository.recent.RecentLocationPairRepositoryImpl$insertOrUpdate$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            app.chalo.recent.database.repository.recent.RecentLocationPairRepositoryImpl$insertOrUpdate$1 r0 = new app.chalo.recent.database.repository.recent.RecentLocationPairRepositoryImpl$insertOrUpdate$1
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
            app.chalo.recent.model.app.RecentLocationPairAppModel r6 = (app.chalo.recent.model.app.RecentLocationPairAppModel) r6
            kotlin.ResultKt.b(r8)
            goto L4a
        L3a:
            kotlin.ResultKt.b(r8)
            r0.L$0 = r6
            r0.label = r4
            app.chalo.recent.localsource.recent.RecentLocationPairLocalDataSource r8 = r5.f8953a
            java.lang.Object r7 = r8.b(r6, r7, r0)
            if (r7 != r1) goto L4a
            goto L57
        L4a:
            java.lang.String r6 = r6.f
            r7 = 0
            r0.L$0 = r7
            r0.label = r3
            java.lang.Object r6 = r5.a(r6, r0)
            if (r6 != r1) goto L58
        L57:
            return r1
        L58:
            kotlin.Unit r6 = kotlin.Unit.f17538a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: app.chalo.recent.database.repository.recent.RecentLocationPairRepositoryImpl.b(app.chalo.recent.model.app.RecentLocationPairAppModel, boolean, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // app.chalo.recent.database.repository.recent.RecentLocationPairRepository
    public final Object c(int i, String str, ContinuationImpl continuationImpl, boolean z) {
        RecentLocationPairRepositoryImpl$getForCity$1 recentLocationPairRepositoryImpl$getForCity$1;
        if (continuationImpl instanceof RecentLocationPairRepositoryImpl$getForCity$1) {
            recentLocationPairRepositoryImpl$getForCity$1 = (RecentLocationPairRepositoryImpl$getForCity$1) continuationImpl;
            int i2 = recentLocationPairRepositoryImpl$getForCity$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                recentLocationPairRepositoryImpl$getForCity$1.label = i2 - Integer.MIN_VALUE;
            } else {
                recentLocationPairRepositoryImpl$getForCity$1 = new RecentLocationPairRepositoryImpl$getForCity$1(this, continuationImpl);
            }
        } else {
            recentLocationPairRepositoryImpl$getForCity$1 = new RecentLocationPairRepositoryImpl$getForCity$1(this, continuationImpl);
        }
        Object obj = recentLocationPairRepositoryImpl$getForCity$1.result;
        Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i3 = recentLocationPairRepositoryImpl$getForCity$1.label;
        if (i3 == 0) {
            ResultKt.b(obj);
            recentLocationPairRepositoryImpl$getForCity$1.L$0 = str;
            recentLocationPairRepositoryImpl$getForCity$1.Z$0 = z;
            recentLocationPairRepositoryImpl$getForCity$1.I$0 = i;
            recentLocationPairRepositoryImpl$getForCity$1.label = 1;
            if (a(str, recentLocationPairRepositoryImpl$getForCity$1) != obj2) {
            }
        }
        if (i3 != 1) {
            if (i3 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(obj);
            return obj;
        }
        i = recentLocationPairRepositoryImpl$getForCity$1.I$0;
        z = recentLocationPairRepositoryImpl$getForCity$1.Z$0;
        str = (String) recentLocationPairRepositoryImpl$getForCity$1.L$0;
        ResultKt.b(obj);
        recentLocationPairRepositoryImpl$getForCity$1.L$0 = null;
        recentLocationPairRepositoryImpl$getForCity$1.label = 2;
        Object objD = this.f8953a.d(i, str, z);
        return objD == obj2 ? obj2 : objD;
    }
}
