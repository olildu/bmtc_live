package app.chalo.recent.database.repository.recent;

import app.chalo.contract.BasicInfoContract;
import app.chalo.data.ClusterConfig;
import app.chalo.data.RecentsCacheProperties;
import app.chalo.domain.GetClusterConfigForCityUseCase;
import app.chalo.recent.localsource.recent.RecentStopBasedTripLocalDataSource;
import app.chalo.recent.model.app.RecentStopBasedTripAppModel;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.sync.Mutex;
import kotlinx.coroutines.sync.MutexImpl;
import kotlinx.coroutines.sync.MutexKt;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lapp/chalo/recent/database/repository/recent/StopBasedTripRecentRepositoryImpl;", "Lapp/chalo/recent/database/repository/recent/StopBasedTripRecentRepository;", "Companion", "framework-city-data_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class StopBasedTripRecentRepositoryImpl implements StopBasedTripRecentRepository {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final RecentStopBasedTripLocalDataSource f8957a;
    public final BasicInfoContract b;
    public final GetClusterConfigForCityUseCase c;
    public final MutexImpl d = MutexKt.a();

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lapp/chalo/recent/database/repository/recent/StopBasedTripRecentRepositoryImpl$Companion;", "", "", "MAX_RECENT_STOP_BASED_TRIP", "I", "framework-city-data_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
    }

    public StopBasedTripRecentRepositoryImpl(RecentStopBasedTripLocalDataSource recentStopBasedTripLocalDataSource, BasicInfoContract basicInfoContract, GetClusterConfigForCityUseCase getClusterConfigForCityUseCase) {
        this.f8957a = recentStopBasedTripLocalDataSource;
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
        StopBasedTripRecentRepositoryImpl$purgeOldEntries$1 stopBasedTripRecentRepositoryImpl$purgeOldEntries$1;
        Mutex mutex;
        Mutex mutex2;
        String str2;
        int size;
        Mutex mutex3;
        RecentsCacheProperties recentsCacheProperties;
        int iIntValue;
        int i;
        Integer num;
        Mutex mutex4;
        List list;
        Iterator it;
        String str3;
        String str4;
        if (continuationImpl instanceof StopBasedTripRecentRepositoryImpl$purgeOldEntries$1) {
            stopBasedTripRecentRepositoryImpl$purgeOldEntries$1 = (StopBasedTripRecentRepositoryImpl$purgeOldEntries$1) continuationImpl;
            int i2 = stopBasedTripRecentRepositoryImpl$purgeOldEntries$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                stopBasedTripRecentRepositoryImpl$purgeOldEntries$1.label = i2 - Integer.MIN_VALUE;
            } else {
                stopBasedTripRecentRepositoryImpl$purgeOldEntries$1 = new StopBasedTripRecentRepositoryImpl$purgeOldEntries$1(this, continuationImpl);
            }
        } else {
            stopBasedTripRecentRepositoryImpl$purgeOldEntries$1 = new StopBasedTripRecentRepositoryImpl$purgeOldEntries$1(this, continuationImpl);
        }
        Object objE = stopBasedTripRecentRepositoryImpl$purgeOldEntries$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        ?? r2 = stopBasedTripRecentRepositoryImpl$purgeOldEntries$1.label;
        Unit unit = Unit.f17538a;
        RecentStopBasedTripLocalDataSource recentStopBasedTripLocalDataSource = this.f8957a;
        try {
            switch (r2) {
                case 0:
                    ResultKt.b(objE);
                    stopBasedTripRecentRepositoryImpl$purgeOldEntries$1.L$0 = str;
                    MutexImpl mutexImpl = this.d;
                    stopBasedTripRecentRepositoryImpl$purgeOldEntries$1.L$1 = mutexImpl;
                    stopBasedTripRecentRepositoryImpl$purgeOldEntries$1.label = 1;
                    if (mutexImpl.a(stopBasedTripRecentRepositoryImpl$purgeOldEntries$1) != coroutineSingletons) {
                        mutex = mutexImpl;
                        stopBasedTripRecentRepositoryImpl$purgeOldEntries$1.L$0 = str;
                        stopBasedTripRecentRepositoryImpl$purgeOldEntries$1.L$1 = mutex;
                        stopBasedTripRecentRepositoryImpl$purgeOldEntries$1.label = 2;
                        objE = recentStopBasedTripLocalDataSource.e(str, stopBasedTripRecentRepositoryImpl$purgeOldEntries$1);
                        mutex2 = mutex;
                        if (objE == coroutineSingletons) {
                            str2 = str;
                            size = ((List) objE).size();
                            GetClusterConfigForCityUseCase getClusterConfigForCityUseCase = this.c;
                            stopBasedTripRecentRepositoryImpl$purgeOldEntries$1.L$0 = str2;
                            stopBasedTripRecentRepositoryImpl$purgeOldEntries$1.L$1 = mutex2;
                            stopBasedTripRecentRepositoryImpl$purgeOldEntries$1.I$0 = size;
                            stopBasedTripRecentRepositoryImpl$purgeOldEntries$1.label = 3;
                            objE = getClusterConfigForCityUseCase.a(str2, stopBasedTripRecentRepositoryImpl$purgeOldEntries$1);
                            mutex3 = mutex2;
                            if (objE != coroutineSingletons) {
                                recentsCacheProperties = ((ClusterConfig) objE).d;
                                if (recentsCacheProperties != null || (num = recentsCacheProperties.e) == null) {
                                    iIntValue = 10;
                                } else {
                                    iIntValue = num.intValue();
                                }
                                i = size - iIntValue;
                                if (i <= 0) {
                                    mutex3.e(null);
                                    return unit;
                                }
                                stopBasedTripRecentRepositoryImpl$purgeOldEntries$1.L$0 = mutex3;
                                stopBasedTripRecentRepositoryImpl$purgeOldEntries$1.L$1 = null;
                                stopBasedTripRecentRepositoryImpl$purgeOldEntries$1.label = 4;
                                objE = recentStopBasedTripLocalDataSource.f(i, str2, false);
                                if (objE == coroutineSingletons) {
                                    mutex4 = mutex3;
                                } else {
                                    mutex4 = mutex3;
                                    stopBasedTripRecentRepositoryImpl$purgeOldEntries$1.L$0 = mutex4;
                                    stopBasedTripRecentRepositoryImpl$purgeOldEntries$1.label = 5;
                                    objE = FlowKt.v((Flow) objE, stopBasedTripRecentRepositoryImpl$purgeOldEntries$1);
                                    r2 = mutex4;
                                    if (objE != coroutineSingletons) {
                                        list = (List) objE;
                                        if (list != null) {
                                            it = list.iterator();
                                            r2 = r2;
                                            while (it.hasNext()) {
                                                RecentStopBasedTripAppModel recentStopBasedTripAppModel = (RecentStopBasedTripAppModel) it.next();
                                                str3 = recentStopBasedTripAppModel.e;
                                                str4 = recentStopBasedTripAppModel.f;
                                                stopBasedTripRecentRepositoryImpl$purgeOldEntries$1.L$0 = r2;
                                                stopBasedTripRecentRepositoryImpl$purgeOldEntries$1.L$1 = it;
                                                stopBasedTripRecentRepositoryImpl$purgeOldEntries$1.label = 6;
                                                if (recentStopBasedTripLocalDataSource.b(str3, str4, stopBasedTripRecentRepositoryImpl$purgeOldEntries$1) == coroutineSingletons) {
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
                    Mutex mutex5 = (Mutex) stopBasedTripRecentRepositoryImpl$purgeOldEntries$1.L$1;
                    String str5 = (String) stopBasedTripRecentRepositoryImpl$purgeOldEntries$1.L$0;
                    ResultKt.b(objE);
                    mutex = mutex5;
                    str = str5;
                    stopBasedTripRecentRepositoryImpl$purgeOldEntries$1.L$0 = str;
                    stopBasedTripRecentRepositoryImpl$purgeOldEntries$1.L$1 = mutex;
                    stopBasedTripRecentRepositoryImpl$purgeOldEntries$1.label = 2;
                    objE = recentStopBasedTripLocalDataSource.e(str, stopBasedTripRecentRepositoryImpl$purgeOldEntries$1);
                    mutex2 = mutex;
                    if (objE == coroutineSingletons) {
                        str2 = str;
                        size = ((List) objE).size();
                        GetClusterConfigForCityUseCase getClusterConfigForCityUseCase2 = this.c;
                        stopBasedTripRecentRepositoryImpl$purgeOldEntries$1.L$0 = str2;
                        stopBasedTripRecentRepositoryImpl$purgeOldEntries$1.L$1 = mutex2;
                        stopBasedTripRecentRepositoryImpl$purgeOldEntries$1.I$0 = size;
                        stopBasedTripRecentRepositoryImpl$purgeOldEntries$1.label = 3;
                        objE = getClusterConfigForCityUseCase2.a(str2, stopBasedTripRecentRepositoryImpl$purgeOldEntries$1);
                        mutex3 = mutex2;
                        if (objE != coroutineSingletons) {
                            recentsCacheProperties = ((ClusterConfig) objE).d;
                            if (recentsCacheProperties != null) {
                                iIntValue = 10;
                            } else {
                                iIntValue = 10;
                            }
                            i = size - iIntValue;
                            if (i <= 0) {
                                mutex3.e(null);
                                return unit;
                            }
                            stopBasedTripRecentRepositoryImpl$purgeOldEntries$1.L$0 = mutex3;
                            stopBasedTripRecentRepositoryImpl$purgeOldEntries$1.L$1 = null;
                            stopBasedTripRecentRepositoryImpl$purgeOldEntries$1.label = 4;
                            objE = recentStopBasedTripLocalDataSource.f(i, str2, false);
                            if (objE == coroutineSingletons) {
                                mutex4 = mutex3;
                            } else {
                                mutex4 = mutex3;
                                stopBasedTripRecentRepositoryImpl$purgeOldEntries$1.L$0 = mutex4;
                                stopBasedTripRecentRepositoryImpl$purgeOldEntries$1.label = 5;
                                objE = FlowKt.v((Flow) objE, stopBasedTripRecentRepositoryImpl$purgeOldEntries$1);
                                r2 = mutex4;
                                if (objE != coroutineSingletons) {
                                    list = (List) objE;
                                    if (list != null) {
                                        it = list.iterator();
                                        r2 = r2;
                                        while (it.hasNext()) {
                                            RecentStopBasedTripAppModel recentStopBasedTripAppModel2 = (RecentStopBasedTripAppModel) it.next();
                                            str3 = recentStopBasedTripAppModel2.e;
                                            str4 = recentStopBasedTripAppModel2.f;
                                            stopBasedTripRecentRepositoryImpl$purgeOldEntries$1.L$0 = r2;
                                            stopBasedTripRecentRepositoryImpl$purgeOldEntries$1.L$1 = it;
                                            stopBasedTripRecentRepositoryImpl$purgeOldEntries$1.label = 6;
                                            if (recentStopBasedTripLocalDataSource.b(str3, str4, stopBasedTripRecentRepositoryImpl$purgeOldEntries$1) == coroutineSingletons) {
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
                    Mutex mutex6 = (Mutex) stopBasedTripRecentRepositoryImpl$purgeOldEntries$1.L$1;
                    str = (String) stopBasedTripRecentRepositoryImpl$purgeOldEntries$1.L$0;
                    ResultKt.b(objE);
                    mutex2 = mutex6;
                    str2 = str;
                    size = ((List) objE).size();
                    GetClusterConfigForCityUseCase getClusterConfigForCityUseCase3 = this.c;
                    stopBasedTripRecentRepositoryImpl$purgeOldEntries$1.L$0 = str2;
                    stopBasedTripRecentRepositoryImpl$purgeOldEntries$1.L$1 = mutex2;
                    stopBasedTripRecentRepositoryImpl$purgeOldEntries$1.I$0 = size;
                    stopBasedTripRecentRepositoryImpl$purgeOldEntries$1.label = 3;
                    objE = getClusterConfigForCityUseCase3.a(str2, stopBasedTripRecentRepositoryImpl$purgeOldEntries$1);
                    mutex3 = mutex2;
                    if (objE != coroutineSingletons) {
                        recentsCacheProperties = ((ClusterConfig) objE).d;
                        if (recentsCacheProperties != null) {
                            iIntValue = 10;
                        } else {
                            iIntValue = 10;
                        }
                        i = size - iIntValue;
                        if (i <= 0) {
                            mutex3.e(null);
                            return unit;
                        }
                        stopBasedTripRecentRepositoryImpl$purgeOldEntries$1.L$0 = mutex3;
                        stopBasedTripRecentRepositoryImpl$purgeOldEntries$1.L$1 = null;
                        stopBasedTripRecentRepositoryImpl$purgeOldEntries$1.label = 4;
                        objE = recentStopBasedTripLocalDataSource.f(i, str2, false);
                        if (objE == coroutineSingletons) {
                            mutex4 = mutex3;
                        } else {
                            mutex4 = mutex3;
                            stopBasedTripRecentRepositoryImpl$purgeOldEntries$1.L$0 = mutex4;
                            stopBasedTripRecentRepositoryImpl$purgeOldEntries$1.label = 5;
                            objE = FlowKt.v((Flow) objE, stopBasedTripRecentRepositoryImpl$purgeOldEntries$1);
                            r2 = mutex4;
                            if (objE != coroutineSingletons) {
                                list = (List) objE;
                                if (list != null) {
                                    it = list.iterator();
                                    r2 = r2;
                                    while (it.hasNext()) {
                                        RecentStopBasedTripAppModel recentStopBasedTripAppModel3 = (RecentStopBasedTripAppModel) it.next();
                                        str3 = recentStopBasedTripAppModel3.e;
                                        str4 = recentStopBasedTripAppModel3.f;
                                        stopBasedTripRecentRepositoryImpl$purgeOldEntries$1.L$0 = r2;
                                        stopBasedTripRecentRepositoryImpl$purgeOldEntries$1.L$1 = it;
                                        stopBasedTripRecentRepositoryImpl$purgeOldEntries$1.label = 6;
                                        if (recentStopBasedTripLocalDataSource.b(str3, str4, stopBasedTripRecentRepositoryImpl$purgeOldEntries$1) == coroutineSingletons) {
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
                    size = stopBasedTripRecentRepositoryImpl$purgeOldEntries$1.I$0;
                    Mutex mutex7 = (Mutex) stopBasedTripRecentRepositoryImpl$purgeOldEntries$1.L$1;
                    str2 = (String) stopBasedTripRecentRepositoryImpl$purgeOldEntries$1.L$0;
                    ResultKt.b(objE);
                    mutex3 = mutex7;
                    recentsCacheProperties = ((ClusterConfig) objE).d;
                    if (recentsCacheProperties != null) {
                        iIntValue = 10;
                    } else {
                        iIntValue = 10;
                    }
                    i = size - iIntValue;
                    if (i <= 0) {
                        mutex3.e(null);
                        return unit;
                    }
                    stopBasedTripRecentRepositoryImpl$purgeOldEntries$1.L$0 = mutex3;
                    stopBasedTripRecentRepositoryImpl$purgeOldEntries$1.L$1 = null;
                    stopBasedTripRecentRepositoryImpl$purgeOldEntries$1.label = 4;
                    objE = recentStopBasedTripLocalDataSource.f(i, str2, false);
                    if (objE == coroutineSingletons) {
                        mutex4 = mutex3;
                    } else {
                        mutex4 = mutex3;
                        stopBasedTripRecentRepositoryImpl$purgeOldEntries$1.L$0 = mutex4;
                        stopBasedTripRecentRepositoryImpl$purgeOldEntries$1.label = 5;
                        objE = FlowKt.v((Flow) objE, stopBasedTripRecentRepositoryImpl$purgeOldEntries$1);
                        r2 = mutex4;
                        if (objE != coroutineSingletons) {
                            list = (List) objE;
                            if (list != null) {
                                it = list.iterator();
                                r2 = r2;
                                while (it.hasNext()) {
                                    RecentStopBasedTripAppModel recentStopBasedTripAppModel4 = (RecentStopBasedTripAppModel) it.next();
                                    str3 = recentStopBasedTripAppModel4.e;
                                    str4 = recentStopBasedTripAppModel4.f;
                                    stopBasedTripRecentRepositoryImpl$purgeOldEntries$1.L$0 = r2;
                                    stopBasedTripRecentRepositoryImpl$purgeOldEntries$1.L$1 = it;
                                    stopBasedTripRecentRepositoryImpl$purgeOldEntries$1.label = 6;
                                    if (recentStopBasedTripLocalDataSource.b(str3, str4, stopBasedTripRecentRepositoryImpl$purgeOldEntries$1) == coroutineSingletons) {
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
                    Mutex mutex8 = (Mutex) stopBasedTripRecentRepositoryImpl$purgeOldEntries$1.L$0;
                    ResultKt.b(objE);
                    mutex4 = mutex8;
                    mutex4 = mutex3;
                    stopBasedTripRecentRepositoryImpl$purgeOldEntries$1.L$0 = mutex4;
                    stopBasedTripRecentRepositoryImpl$purgeOldEntries$1.label = 5;
                    objE = FlowKt.v((Flow) objE, stopBasedTripRecentRepositoryImpl$purgeOldEntries$1);
                    r2 = mutex4;
                    if (objE != coroutineSingletons) {
                        list = (List) objE;
                        if (list != null) {
                            it = list.iterator();
                            r2 = r2;
                            while (it.hasNext()) {
                                RecentStopBasedTripAppModel recentStopBasedTripAppModel5 = (RecentStopBasedTripAppModel) it.next();
                                str3 = recentStopBasedTripAppModel5.e;
                                str4 = recentStopBasedTripAppModel5.f;
                                stopBasedTripRecentRepositoryImpl$purgeOldEntries$1.L$0 = r2;
                                stopBasedTripRecentRepositoryImpl$purgeOldEntries$1.L$1 = it;
                                stopBasedTripRecentRepositoryImpl$purgeOldEntries$1.label = 6;
                                if (recentStopBasedTripLocalDataSource.b(str3, str4, stopBasedTripRecentRepositoryImpl$purgeOldEntries$1) == coroutineSingletons) {
                                }
                                break;
                            }
                        }
                        r2.e(null);
                        return unit;
                    }
                    return coroutineSingletons;
                case 5:
                    Mutex mutex9 = (Mutex) stopBasedTripRecentRepositoryImpl$purgeOldEntries$1.L$0;
                    ResultKt.b(objE);
                    r2 = mutex9;
                    list = (List) objE;
                    if (list != null) {
                        it = list.iterator();
                        r2 = r2;
                        while (it.hasNext()) {
                            RecentStopBasedTripAppModel recentStopBasedTripAppModel6 = (RecentStopBasedTripAppModel) it.next();
                            str3 = recentStopBasedTripAppModel6.e;
                            str4 = recentStopBasedTripAppModel6.f;
                            stopBasedTripRecentRepositoryImpl$purgeOldEntries$1.L$0 = r2;
                            stopBasedTripRecentRepositoryImpl$purgeOldEntries$1.L$1 = it;
                            stopBasedTripRecentRepositoryImpl$purgeOldEntries$1.label = 6;
                            if (recentStopBasedTripLocalDataSource.b(str3, str4, stopBasedTripRecentRepositoryImpl$purgeOldEntries$1) == coroutineSingletons) {
                                return coroutineSingletons;
                            }
                            break;
                        }
                    }
                    r2.e(null);
                    return unit;
                case 6:
                    it = (Iterator) stopBasedTripRecentRepositoryImpl$purgeOldEntries$1.L$1;
                    Mutex mutex10 = (Mutex) stopBasedTripRecentRepositoryImpl$purgeOldEntries$1.L$0;
                    ResultKt.b(objE);
                    r2 = mutex10;
                    while (it.hasNext()) {
                        RecentStopBasedTripAppModel recentStopBasedTripAppModel7 = (RecentStopBasedTripAppModel) it.next();
                        str3 = recentStopBasedTripAppModel7.e;
                        str4 = recentStopBasedTripAppModel7.f;
                        stopBasedTripRecentRepositoryImpl$purgeOldEntries$1.L$0 = r2;
                        stopBasedTripRecentRepositoryImpl$purgeOldEntries$1.L$1 = it;
                        stopBasedTripRecentRepositoryImpl$purgeOldEntries$1.label = 6;
                        if (recentStopBasedTripLocalDataSource.b(str3, str4, stopBasedTripRecentRepositoryImpl$purgeOldEntries$1) == coroutineSingletons) {
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
    @Override // app.chalo.recent.database.repository.recent.StopBasedTripRecentRepository
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(app.chalo.recent.model.app.RecentStopBasedTripAppModel r6, boolean r7, kotlin.coroutines.jvm.internal.ContinuationImpl r8) {
        /*
            r5 = this;
            boolean r0 = r8 instanceof app.chalo.recent.database.repository.recent.StopBasedTripRecentRepositoryImpl$insertOrUpdateStopBasedTripRecent$1
            if (r0 == 0) goto L13
            r0 = r8
            app.chalo.recent.database.repository.recent.StopBasedTripRecentRepositoryImpl$insertOrUpdateStopBasedTripRecent$1 r0 = (app.chalo.recent.database.repository.recent.StopBasedTripRecentRepositoryImpl$insertOrUpdateStopBasedTripRecent$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            app.chalo.recent.database.repository.recent.StopBasedTripRecentRepositoryImpl$insertOrUpdateStopBasedTripRecent$1 r0 = new app.chalo.recent.database.repository.recent.StopBasedTripRecentRepositoryImpl$insertOrUpdateStopBasedTripRecent$1
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
            app.chalo.recent.model.app.RecentStopBasedTripAppModel r6 = (app.chalo.recent.model.app.RecentStopBasedTripAppModel) r6
            kotlin.ResultKt.b(r8)
            goto L4a
        L3a:
            kotlin.ResultKt.b(r8)
            r0.L$0 = r6
            r0.label = r4
            app.chalo.recent.localsource.recent.RecentStopBasedTripLocalDataSource r8 = r5.f8957a
            java.lang.Object r7 = r8.c(r6, r7, r0)
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
        throw new UnsupportedOperationException("Method not decompiled: app.chalo.recent.database.repository.recent.StopBasedTripRecentRepositoryImpl.c(app.chalo.recent.model.app.RecentStopBasedTripAppModel, boolean, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    @Override // app.chalo.recent.database.repository.recent.StopBasedTripRecentRepository
    public final Object d(String str, int i, SuspendLambda suspendLambda) {
        return this.f8957a.f(i, str, true);
    }

    @Override // app.chalo.recent.database.repository.recent.StopBasedTripRecentRepository
    public final Object e(String str, Set set, ContinuationImpl continuationImpl) {
        return this.f8957a.d(str, set);
    }
}
