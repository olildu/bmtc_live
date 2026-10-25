package app.chalo.login.manager;

import app.chalo.contract.BasicInfoContract;
import app.chalo.crashlytics.CrashlyticsLogger;
import app.chalo.data.MiscellaneousCityWiseConfigForCity;
import app.chalo.data.UserConsentConfig;
import app.chalo.login.data.models.app.DpdpaUserConsentsInfoAppModel;
import app.chalo.login.data.repository.LoginRepository;
import app.chalo.login.domain.FetchConsentStatusFailureReason;
import app.chalo.login.domain.FetchDpdpaUserConsentUseCase;
import app.chalo.login.domain.UpdateUserConsentUseCase;
import app.chalo.login.domain.UserConsentUpdateFailureReason;
import app.chalo.usecase.GetMiscellaneousCityWiseFlagsConfigUseCase;
import app.chalo.userprofile.UserProfileAppModel;
import app.chalo.utils.ChaloUseCaseResult;
import defpackage.vo1;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.sync.Mutex;
import kotlinx.coroutines.sync.MutexImpl;
import kotlinx.coroutines.sync.MutexKt;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/login/manager/DpdpaConsentManagerImpl;", "Lapp/chalo/login/manager/DpdpaConsentManager;", "login_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class DpdpaConsentManagerImpl implements DpdpaConsentManager {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final FetchDpdpaUserConsentUseCase f5258a;
    public final UpdateUserConsentUseCase b;
    public final LoginRepository c;
    public final CrashlyticsLogger d;
    public final BasicInfoContract e;
    public final GetMiscellaneousCityWiseFlagsConfigUseCase f;
    public DpdpaConsentCacheInfo g;
    public UserConsentConfig h;
    public final MutexImpl i = MutexKt.a();

    public DpdpaConsentManagerImpl(FetchDpdpaUserConsentUseCase fetchDpdpaUserConsentUseCase, UpdateUserConsentUseCase updateUserConsentUseCase, LoginRepository loginRepository, CrashlyticsLogger crashlyticsLogger, BasicInfoContract basicInfoContract, GetMiscellaneousCityWiseFlagsConfigUseCase getMiscellaneousCityWiseFlagsConfigUseCase) {
        this.f5258a = fetchDpdpaUserConsentUseCase;
        this.b = updateUserConsentUseCase;
        this.c = loginRepository;
        this.d = crashlyticsLogger;
        this.e = basicInfoContract;
        this.f = getMiscellaneousCityWiseFlagsConfigUseCase;
    }

    @Override // app.chalo.login.manager.DpdpaConsentManager
    public final Object a(boolean z, ContinuationImpl continuationImpl) {
        Object objA = this.c.a(z, continuationImpl);
        return objA == CoroutineSingletons.COROUTINE_SUSPENDED ? objA : Unit.f17538a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // app.chalo.login.manager.DpdpaConsentManager
    public final Enum b(String str, ContinuationImpl continuationImpl) {
        DpdpaConsentManagerImpl$cachedConsentResultStatus$1 dpdpaConsentManagerImpl$cachedConsentResultStatus$1;
        if (continuationImpl instanceof DpdpaConsentManagerImpl$cachedConsentResultStatus$1) {
            dpdpaConsentManagerImpl$cachedConsentResultStatus$1 = (DpdpaConsentManagerImpl$cachedConsentResultStatus$1) continuationImpl;
            int i = dpdpaConsentManagerImpl$cachedConsentResultStatus$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                dpdpaConsentManagerImpl$cachedConsentResultStatus$1.label = i - Integer.MIN_VALUE;
            } else {
                dpdpaConsentManagerImpl$cachedConsentResultStatus$1 = new DpdpaConsentManagerImpl$cachedConsentResultStatus$1(this, continuationImpl);
            }
        } else {
            dpdpaConsentManagerImpl$cachedConsentResultStatus$1 = new DpdpaConsentManagerImpl$cachedConsentResultStatus$1(this, continuationImpl);
        }
        Object objH = dpdpaConsentManagerImpl$cachedConsentResultStatus$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = dpdpaConsentManagerImpl$cachedConsentResultStatus$1.label;
        if (i2 == 0) {
            ResultKt.b(objH);
            DpdpaConsentCacheInfo dpdpaConsentCacheInfo = this.g;
            if (dpdpaConsentCacheInfo == null) {
                return CachedConsentResultStatus.NOT_CACHED_IN_MEMORY;
            }
            if (!Intrinsics.d(dpdpaConsentCacheInfo.f5257a.f5191a, str)) {
                return CachedConsentResultStatus.NOT_CACHED_IN_MEMORY;
            }
            dpdpaConsentManagerImpl$cachedConsentResultStatus$1.label = 1;
            objH = h(dpdpaConsentCacheInfo, dpdpaConsentManagerImpl$cachedConsentResultStatus$1);
            if (objH == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(objH);
        }
        return ((Boolean) objH).booleanValue() ? CachedConsentResultStatus.EXPIRED : CachedConsentResultStatus.VALID;
    }

    /* JADX WARN: Code duplicated, block: B:37:0x0099  */
    /* JADX WARN: Code duplicated, block: B:38:0x009c A[Catch: all -> 0x0033, TRY_LEAVE, TryCatch #1 {all -> 0x0033, blocks: (B:14:0x002e, B:46:0x00bd, B:35:0x0091, B:38:0x009c), top: B:53:0x0022 }] */
    /* JADX WARN: Code duplicated, block: B:45:0x00ba  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v3 */
    /* JADX WARN: Type inference failed for: r11v4 */
    /* JADX WARN: Type inference failed for: r11v9 */
    /* JADX WARN: Type inference failed for: r8v0, types: [app.chalo.login.manager.DpdpaConsentManagerImpl] */
    /* JADX WARN: Type inference failed for: r9v0, types: [java.lang.Object, java.lang.String] */
    /* JADX WARN: Type inference failed for: r9v1, types: [kotlinx.coroutines.sync.Mutex] */
    /* JADX WARN: Type inference failed for: r9v10 */
    /* JADX WARN: Type inference failed for: r9v15 */
    /* JADX WARN: Type inference failed for: r9v18 */
    /* JADX WARN: Type inference failed for: r9v2, types: [java.lang.Object, java.lang.String] */
    /* JADX WARN: Type inference failed for: r9v23 */
    /* JADX WARN: Type inference failed for: r9v24 */
    /* JADX WARN: Type inference failed for: r9v5 */
    /* JADX WARN: Type inference failed for: r9v6, types: [java.lang.String] */
    @Override // app.chalo.login.manager.DpdpaConsentManager
    public final Object c(String str, ContinuationImpl continuationImpl, boolean z) throws Throwable {
        DpdpaConsentManagerImpl$fetchUserConsentStatus$1 dpdpaConsentManagerImpl$fetchUserConsentStatus$1;
        Mutex mutex;
        ?? r9;
        DpdpaConsentCacheInfo dpdpaConsentCacheInfo;
        ?? r11;
        Mutex mutex2;
        ?? r10;
        Object objF;
        Object success;
        if (continuationImpl instanceof DpdpaConsentManagerImpl$fetchUserConsentStatus$1) {
            dpdpaConsentManagerImpl$fetchUserConsentStatus$1 = (DpdpaConsentManagerImpl$fetchUserConsentStatus$1) continuationImpl;
            int i = dpdpaConsentManagerImpl$fetchUserConsentStatus$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                dpdpaConsentManagerImpl$fetchUserConsentStatus$1.label = i - Integer.MIN_VALUE;
            } else {
                dpdpaConsentManagerImpl$fetchUserConsentStatus$1 = new DpdpaConsentManagerImpl$fetchUserConsentStatus$1(this, continuationImpl);
            }
        } else {
            dpdpaConsentManagerImpl$fetchUserConsentStatus$1 = new DpdpaConsentManagerImpl$fetchUserConsentStatus$1(this, continuationImpl);
        }
        Object obj = dpdpaConsentManagerImpl$fetchUserConsentStatus$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = dpdpaConsentManagerImpl$fetchUserConsentStatus$1.label;
        try {
            try {
                if (i2 == 0) {
                    ResultKt.b(obj);
                    dpdpaConsentManagerImpl$fetchUserConsentStatus$1.L$0 = str;
                    mutex = this.i;
                    dpdpaConsentManagerImpl$fetchUserConsentStatus$1.L$1 = mutex;
                    dpdpaConsentManagerImpl$fetchUserConsentStatus$1.Z$0 = z;
                    dpdpaConsentManagerImpl$fetchUserConsentStatus$1.label = 1;
                    if (mutex.a(dpdpaConsentManagerImpl$fetchUserConsentStatus$1) != coroutineSingletons) {
                    }
                    r9 = str;
                    return coroutineSingletons;
                }
                if (i2 == 1) {
                    z = dpdpaConsentManagerImpl$fetchUserConsentStatus$1.Z$0;
                    Mutex mutex3 = (Mutex) dpdpaConsentManagerImpl$fetchUserConsentStatus$1.L$1;
                    String str2 = (String) dpdpaConsentManagerImpl$fetchUserConsentStatus$1.L$0;
                    ResultKt.b(obj);
                    mutex = mutex3;
                    r9 = str2;
                } else {
                    if (i2 == 2) {
                        DpdpaConsentCacheInfo dpdpaConsentCacheInfo2 = (DpdpaConsentCacheInfo) dpdpaConsentManagerImpl$fetchUserConsentStatus$1.L$2;
                        Mutex mutex4 = (Mutex) dpdpaConsentManagerImpl$fetchUserConsentStatus$1.L$1;
                        String str3 = (String) dpdpaConsentManagerImpl$fetchUserConsentStatus$1.L$0;
                        try {
                            ResultKt.b(obj);
                            dpdpaConsentCacheInfo = dpdpaConsentCacheInfo2;
                            mutex2 = mutex4;
                            r11 = str3;
                            if (((Boolean) obj).booleanValue()) {
                                mutex = mutex2;
                                r10 = r11;
                                this.g = null;
                                dpdpaConsentManagerImpl$fetchUserConsentStatus$1.L$0 = mutex;
                                dpdpaConsentManagerImpl$fetchUserConsentStatus$1.L$1 = null;
                                dpdpaConsentManagerImpl$fetchUserConsentStatus$1.L$2 = null;
                                dpdpaConsentManagerImpl$fetchUserConsentStatus$1.label = 3;
                                objF = f(r10, dpdpaConsentManagerImpl$fetchUserConsentStatus$1);
                                if (objF != coroutineSingletons) {
                                    Mutex mutex5 = mutex;
                                    obj = objF;
                                    mutex2 = mutex5;
                                }
                                r9 = str;
                                return coroutineSingletons;
                            }
                            success = new ChaloUseCaseResult.Success(dpdpaConsentCacheInfo.f5257a);
                            mutex2.e(null);
                            return success;
                        } catch (Throwable th) {
                            th = th;
                            str = mutex4;
                            str.e(null);
                            throw th;
                        }
                    }
                    if (i2 != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    mutex2 = (Mutex) dpdpaConsentManagerImpl$fetchUserConsentStatus$1.L$0;
                    ResultKt.b(obj);
                }
                success = (ChaloUseCaseResult) obj;
                mutex2.e(null);
                return success;
                r9 = str;
                dpdpaConsentCacheInfo = this.g;
                r10 = r9;
                if (z) {
                    this.g = null;
                    dpdpaConsentManagerImpl$fetchUserConsentStatus$1.L$0 = mutex;
                    dpdpaConsentManagerImpl$fetchUserConsentStatus$1.L$1 = null;
                    dpdpaConsentManagerImpl$fetchUserConsentStatus$1.L$2 = null;
                    dpdpaConsentManagerImpl$fetchUserConsentStatus$1.label = 3;
                    objF = f(r10, dpdpaConsentManagerImpl$fetchUserConsentStatus$1);
                    if (objF != coroutineSingletons) {
                        Mutex mutex6 = mutex;
                        obj = objF;
                        mutex2 = mutex6;
                        success = (ChaloUseCaseResult) obj;
                        mutex2.e(null);
                        return success;
                    }
                } else {
                    dpdpaConsentManagerImpl$fetchUserConsentStatus$1.L$0 = r9;
                    dpdpaConsentManagerImpl$fetchUserConsentStatus$1.L$1 = mutex;
                    dpdpaConsentManagerImpl$fetchUserConsentStatus$1.L$2 = dpdpaConsentCacheInfo;
                    dpdpaConsentManagerImpl$fetchUserConsentStatus$1.label = 2;
                    Object objI = i(r9, dpdpaConsentCacheInfo, dpdpaConsentManagerImpl$fetchUserConsentStatus$1);
                    if (objI != coroutineSingletons) {
                        r11 = r9;
                        mutex2 = mutex;
                        obj = objI;
                        if (((Boolean) obj).booleanValue()) {
                            mutex = mutex2;
                            r10 = r11;
                            this.g = null;
                            dpdpaConsentManagerImpl$fetchUserConsentStatus$1.L$0 = mutex;
                            dpdpaConsentManagerImpl$fetchUserConsentStatus$1.L$1 = null;
                            dpdpaConsentManagerImpl$fetchUserConsentStatus$1.L$2 = null;
                            dpdpaConsentManagerImpl$fetchUserConsentStatus$1.label = 3;
                            objF = f(r10, dpdpaConsentManagerImpl$fetchUserConsentStatus$1);
                            if (objF != coroutineSingletons) {
                                Mutex mutex7 = mutex;
                                obj = objF;
                                mutex2 = mutex7;
                                success = (ChaloUseCaseResult) obj;
                            }
                        } else {
                            success = new ChaloUseCaseResult.Success(dpdpaConsentCacheInfo.f5257a);
                        }
                        mutex2.e(null);
                        return success;
                    }
                }
                r9 = str;
                return coroutineSingletons;
            } catch (Throwable th2) {
                Mutex mutex8 = mutex;
                th = th2;
                str = mutex8;
                str.e(null);
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
        }
    }

    /* JADX WARN: Code duplicated, block: B:35:0x009a A[Catch: all -> 0x0054, TRY_LEAVE, TryCatch #1 {all -> 0x0054, blocks: (B:21:0x0050, B:33:0x0093, B:35:0x009a, B:41:0x00ca, B:43:0x00ce, B:46:0x00f3, B:47:0x00f8), top: B:54:0x0050 }] */
    /* JADX WARN: Code duplicated, block: B:38:0x00b4  */
    /* JADX WARN: Code duplicated, block: B:41:0x00ca A[Catch: all -> 0x0054, TRY_ENTER, TryCatch #1 {all -> 0x0054, blocks: (B:21:0x0050, B:33:0x0093, B:35:0x009a, B:41:0x00ca, B:43:0x00ce, B:46:0x00f3, B:47:0x00f8), top: B:54:0x0050 }] */
    /* JADX WARN: Code duplicated, block: B:43:0x00ce A[Catch: all -> 0x0054, TRY_LEAVE, TryCatch #1 {all -> 0x0054, blocks: (B:21:0x0050, B:33:0x0093, B:35:0x009a, B:41:0x00ca, B:43:0x00ce, B:46:0x00f3, B:47:0x00f8), top: B:54:0x0050 }] */
    /* JADX WARN: Code duplicated, block: B:46:0x00f3 A[Catch: all -> 0x0054, TRY_ENTER, TryCatch #1 {all -> 0x0054, blocks: (B:21:0x0050, B:33:0x0093, B:35:0x009a, B:41:0x00ca, B:43:0x00ce, B:46:0x00f3, B:47:0x00f8), top: B:54:0x0050 }] */
    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    /* JADX WARN: Instruction removed from duplicated block: B:43:0x00ce, please report this as an issue */
    @Override // app.chalo.login.manager.DpdpaConsentManager
    public final Object d(UserProfileAppModel userProfileAppModel, List list, ContinuationImpl continuationImpl) throws Throwable {
        DpdpaConsentManagerImpl$updateUserConsentStatus$1 dpdpaConsentManagerImpl$updateUserConsentStatus$1;
        Mutex mutex;
        Mutex mutex2;
        Mutex mutex3;
        ChaloUseCaseResult chaloUseCaseResult;
        DpdpaUserConsentsInfoAppModel dpdpaUserConsentsInfoAppModel;
        Object objC;
        ChaloUseCaseResult chaloUseCaseResult2;
        DpdpaUserConsentsInfoAppModel dpdpaUserConsentsInfoAppModel2;
        DpdpaConsentManagerImpl dpdpaConsentManagerImpl;
        if (continuationImpl instanceof DpdpaConsentManagerImpl$updateUserConsentStatus$1) {
            dpdpaConsentManagerImpl$updateUserConsentStatus$1 = (DpdpaConsentManagerImpl$updateUserConsentStatus$1) continuationImpl;
            int i = dpdpaConsentManagerImpl$updateUserConsentStatus$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                dpdpaConsentManagerImpl$updateUserConsentStatus$1.label = i - Integer.MIN_VALUE;
            } else {
                dpdpaConsentManagerImpl$updateUserConsentStatus$1 = new DpdpaConsentManagerImpl$updateUserConsentStatus$1(this, continuationImpl);
            }
        } else {
            dpdpaConsentManagerImpl$updateUserConsentStatus$1 = new DpdpaConsentManagerImpl$updateUserConsentStatus$1(this, continuationImpl);
        }
        Object obj = dpdpaConsentManagerImpl$updateUserConsentStatus$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = dpdpaConsentManagerImpl$updateUserConsentStatus$1.label;
        try {
            if (i2 == 0) {
                ResultKt.b(obj);
                dpdpaConsentManagerImpl$updateUserConsentStatus$1.L$0 = userProfileAppModel;
                dpdpaConsentManagerImpl$updateUserConsentStatus$1.L$1 = list;
                mutex = this.i;
                dpdpaConsentManagerImpl$updateUserConsentStatus$1.L$2 = mutex;
                dpdpaConsentManagerImpl$updateUserConsentStatus$1.label = 1;
                if (mutex.a(dpdpaConsentManagerImpl$updateUserConsentStatus$1) != coroutineSingletons) {
                }
                return coroutineSingletons;
            }
            if (i2 != 1) {
                if (i2 != 2) {
                    if (i2 != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    dpdpaConsentManagerImpl = (DpdpaConsentManagerImpl) dpdpaConsentManagerImpl$updateUserConsentStatus$1.L$3;
                    dpdpaUserConsentsInfoAppModel2 = (DpdpaUserConsentsInfoAppModel) dpdpaConsentManagerImpl$updateUserConsentStatus$1.L$2;
                    chaloUseCaseResult2 = (ChaloUseCaseResult) dpdpaConsentManagerImpl$updateUserConsentStatus$1.L$1;
                    mutex2 = (Mutex) dpdpaConsentManagerImpl$updateUserConsentStatus$1.L$0;
                    try {
                        ResultKt.b(obj);
                        dpdpaConsentManagerImpl.g = new DpdpaConsentCacheInfo(dpdpaUserConsentsInfoAppModel2, ((Number) obj).longValue());
                        chaloUseCaseResult = chaloUseCaseResult2;
                        mutex3 = mutex2;
                        mutex3.e(null);
                        return chaloUseCaseResult;
                    } catch (Throwable th) {
                        th = th;
                        mutex2.e(null);
                        throw th;
                    }
                }
                mutex3 = (Mutex) dpdpaConsentManagerImpl$updateUserConsentStatus$1.L$0;
                try {
                    ResultKt.b(obj);
                    chaloUseCaseResult = (ChaloUseCaseResult) obj;
                    if (chaloUseCaseResult instanceof ChaloUseCaseResult.Success) {
                        dpdpaUserConsentsInfoAppModel = (DpdpaUserConsentsInfoAppModel) ((ChaloUseCaseResult.Success) chaloUseCaseResult).f10419a;
                        BasicInfoContract basicInfoContract = this.e;
                        dpdpaConsentManagerImpl$updateUserConsentStatus$1.L$0 = mutex3;
                        dpdpaConsentManagerImpl$updateUserConsentStatus$1.L$1 = chaloUseCaseResult;
                        dpdpaConsentManagerImpl$updateUserConsentStatus$1.L$2 = dpdpaUserConsentsInfoAppModel;
                        dpdpaConsentManagerImpl$updateUserConsentStatus$1.L$3 = this;
                        dpdpaConsentManagerImpl$updateUserConsentStatus$1.label = 3;
                        objC = basicInfoContract.c(dpdpaConsentManagerImpl$updateUserConsentStatus$1);
                        if (objC != coroutineSingletons) {
                            chaloUseCaseResult2 = chaloUseCaseResult;
                            dpdpaUserConsentsInfoAppModel2 = dpdpaUserConsentsInfoAppModel;
                            obj = objC;
                            mutex2 = mutex3;
                            dpdpaConsentManagerImpl = this;
                            dpdpaConsentManagerImpl.g = new DpdpaConsentCacheInfo(dpdpaUserConsentsInfoAppModel2, ((Number) obj).longValue());
                            chaloUseCaseResult = chaloUseCaseResult2;
                            mutex3 = mutex2;
                        }
                        return coroutineSingletons;
                    }
                    if (chaloUseCaseResult instanceof ChaloUseCaseResult.Failure) {
                        throw new NoWhenBranchMatchedException();
                    }
                    this.d.i(new DpdpaConsentApiFailureLoggingException("Update user consent failed: " + ((UserConsentUpdateFailureReason) ((ChaloUseCaseResult.Failure) chaloUseCaseResult).f10418a).name()));
                    mutex3.e(null);
                    return chaloUseCaseResult;
                } catch (Throwable th2) {
                    mutex2 = mutex3;
                    th = th2;
                    mutex2.e(null);
                    throw th;
                }
            }
            Mutex mutex4 = (Mutex) dpdpaConsentManagerImpl$updateUserConsentStatus$1.L$2;
            list = (List) dpdpaConsentManagerImpl$updateUserConsentStatus$1.L$1;
            UserProfileAppModel userProfileAppModel2 = (UserProfileAppModel) dpdpaConsentManagerImpl$updateUserConsentStatus$1.L$0;
            ResultKt.b(obj);
            mutex = mutex4;
            userProfileAppModel = userProfileAppModel2;
            UpdateUserConsentUseCase updateUserConsentUseCase = this.b;
            dpdpaConsentManagerImpl$updateUserConsentStatus$1.L$0 = mutex;
            dpdpaConsentManagerImpl$updateUserConsentStatus$1.L$1 = null;
            dpdpaConsentManagerImpl$updateUserConsentStatus$1.L$2 = null;
            dpdpaConsentManagerImpl$updateUserConsentStatus$1.label = 2;
            Object objA = updateUserConsentUseCase.a(userProfileAppModel, list, dpdpaConsentManagerImpl$updateUserConsentStatus$1);
            if (objA != coroutineSingletons) {
                Mutex mutex5 = mutex;
                obj = objA;
                mutex3 = mutex5;
                chaloUseCaseResult = (ChaloUseCaseResult) obj;
                if (chaloUseCaseResult instanceof ChaloUseCaseResult.Success) {
                    dpdpaUserConsentsInfoAppModel = (DpdpaUserConsentsInfoAppModel) ((ChaloUseCaseResult.Success) chaloUseCaseResult).f10419a;
                    BasicInfoContract basicInfoContract2 = this.e;
                    dpdpaConsentManagerImpl$updateUserConsentStatus$1.L$0 = mutex3;
                    dpdpaConsentManagerImpl$updateUserConsentStatus$1.L$1 = chaloUseCaseResult;
                    dpdpaConsentManagerImpl$updateUserConsentStatus$1.L$2 = dpdpaUserConsentsInfoAppModel;
                    dpdpaConsentManagerImpl$updateUserConsentStatus$1.L$3 = this;
                    dpdpaConsentManagerImpl$updateUserConsentStatus$1.label = 3;
                    objC = basicInfoContract2.c(dpdpaConsentManagerImpl$updateUserConsentStatus$1);
                    if (objC != coroutineSingletons) {
                        chaloUseCaseResult2 = chaloUseCaseResult;
                        dpdpaUserConsentsInfoAppModel2 = dpdpaUserConsentsInfoAppModel;
                        obj = objC;
                        mutex2 = mutex3;
                        dpdpaConsentManagerImpl = this;
                        dpdpaConsentManagerImpl.g = new DpdpaConsentCacheInfo(dpdpaUserConsentsInfoAppModel2, ((Number) obj).longValue());
                        chaloUseCaseResult = chaloUseCaseResult2;
                        mutex3 = mutex2;
                    }
                } else {
                    if (chaloUseCaseResult instanceof ChaloUseCaseResult.Failure) {
                        throw new NoWhenBranchMatchedException();
                    }
                    this.d.i(new DpdpaConsentApiFailureLoggingException("Update user consent failed: " + ((UserConsentUpdateFailureReason) ((ChaloUseCaseResult.Failure) chaloUseCaseResult).f10418a).name()));
                }
                mutex3.e(null);
                return chaloUseCaseResult;
            }
            return coroutineSingletons;
        } catch (Throwable th3) {
            th = th3;
            mutex2 = mutex;
            mutex2.e(null);
            throw th;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // app.chalo.login.manager.DpdpaConsentManager
    public final Object e(ContinuationImpl continuationImpl) {
        DpdpaConsentManagerImpl$shouldRequestConsentAfterSplashScreen$1 dpdpaConsentManagerImpl$shouldRequestConsentAfterSplashScreen$1;
        if (continuationImpl instanceof DpdpaConsentManagerImpl$shouldRequestConsentAfterSplashScreen$1) {
            dpdpaConsentManagerImpl$shouldRequestConsentAfterSplashScreen$1 = (DpdpaConsentManagerImpl$shouldRequestConsentAfterSplashScreen$1) continuationImpl;
            int i = dpdpaConsentManagerImpl$shouldRequestConsentAfterSplashScreen$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                dpdpaConsentManagerImpl$shouldRequestConsentAfterSplashScreen$1.label = i - Integer.MIN_VALUE;
            } else {
                dpdpaConsentManagerImpl$shouldRequestConsentAfterSplashScreen$1 = new DpdpaConsentManagerImpl$shouldRequestConsentAfterSplashScreen$1(this, continuationImpl);
            }
        } else {
            dpdpaConsentManagerImpl$shouldRequestConsentAfterSplashScreen$1 = new DpdpaConsentManagerImpl$shouldRequestConsentAfterSplashScreen$1(this, continuationImpl);
        }
        Object objC = dpdpaConsentManagerImpl$shouldRequestConsentAfterSplashScreen$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = dpdpaConsentManagerImpl$shouldRequestConsentAfterSplashScreen$1.label;
        if (i2 == 0) {
            ResultKt.b(objC);
            dpdpaConsentManagerImpl$shouldRequestConsentAfterSplashScreen$1.label = 1;
            objC = this.c.c(dpdpaConsentManagerImpl$shouldRequestConsentAfterSplashScreen$1);
            if (objC == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(objC);
        }
        Boolean bool = (Boolean) objC;
        return Boolean.valueOf(bool != null ? bool.booleanValue() : false);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object f(String str, ContinuationImpl continuationImpl) {
        DpdpaConsentManagerImpl$fetchAndHandleConsentResult$1 dpdpaConsentManagerImpl$fetchAndHandleConsentResult$1;
        ChaloUseCaseResult chaloUseCaseResult;
        DpdpaUserConsentsInfoAppModel dpdpaUserConsentsInfoAppModel;
        DpdpaConsentManagerImpl dpdpaConsentManagerImpl;
        if (continuationImpl instanceof DpdpaConsentManagerImpl$fetchAndHandleConsentResult$1) {
            dpdpaConsentManagerImpl$fetchAndHandleConsentResult$1 = (DpdpaConsentManagerImpl$fetchAndHandleConsentResult$1) continuationImpl;
            int i = dpdpaConsentManagerImpl$fetchAndHandleConsentResult$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                dpdpaConsentManagerImpl$fetchAndHandleConsentResult$1.label = i - Integer.MIN_VALUE;
            } else {
                dpdpaConsentManagerImpl$fetchAndHandleConsentResult$1 = new DpdpaConsentManagerImpl$fetchAndHandleConsentResult$1(this, continuationImpl);
            }
        } else {
            dpdpaConsentManagerImpl$fetchAndHandleConsentResult$1 = new DpdpaConsentManagerImpl$fetchAndHandleConsentResult$1(this, continuationImpl);
        }
        Object objA = dpdpaConsentManagerImpl$fetchAndHandleConsentResult$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = dpdpaConsentManagerImpl$fetchAndHandleConsentResult$1.label;
        if (i2 == 0) {
            ResultKt.b(objA);
            dpdpaConsentManagerImpl$fetchAndHandleConsentResult$1.label = 1;
            objA = this.f5258a.a(str, dpdpaConsentManagerImpl$fetchAndHandleConsentResult$1);
            if (objA != coroutineSingletons) {
            }
            return coroutineSingletons;
        }
        if (i2 == 1) {
            ResultKt.b(objA);
        } else {
            if (i2 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            dpdpaUserConsentsInfoAppModel = (DpdpaUserConsentsInfoAppModel) dpdpaConsentManagerImpl$fetchAndHandleConsentResult$1.L$2;
            dpdpaConsentManagerImpl = (DpdpaConsentManagerImpl) dpdpaConsentManagerImpl$fetchAndHandleConsentResult$1.L$1;
            chaloUseCaseResult = (ChaloUseCaseResult) dpdpaConsentManagerImpl$fetchAndHandleConsentResult$1.L$0;
            ResultKt.b(objA);
        }
        dpdpaConsentManagerImpl.g = new DpdpaConsentCacheInfo(dpdpaUserConsentsInfoAppModel, ((Number) objA).longValue());
        return chaloUseCaseResult;
        ChaloUseCaseResult chaloUseCaseResult2 = (ChaloUseCaseResult) objA;
        if (!(chaloUseCaseResult2 instanceof ChaloUseCaseResult.Success)) {
            if (!(chaloUseCaseResult2 instanceof ChaloUseCaseResult.Failure)) {
                throw new NoWhenBranchMatchedException();
            }
            this.d.i(new DpdpaConsentApiFailureLoggingException(vo1.m("Fetch user consent failed: ", ((FetchConsentStatusFailureReason) ((ChaloUseCaseResult.Failure) chaloUseCaseResult2).f10418a).name())));
            return chaloUseCaseResult2;
        }
        DpdpaUserConsentsInfoAppModel dpdpaUserConsentsInfoAppModel2 = (DpdpaUserConsentsInfoAppModel) ((ChaloUseCaseResult.Success) chaloUseCaseResult2).f10419a;
        dpdpaConsentManagerImpl$fetchAndHandleConsentResult$1.L$0 = chaloUseCaseResult2;
        dpdpaConsentManagerImpl$fetchAndHandleConsentResult$1.L$1 = this;
        dpdpaConsentManagerImpl$fetchAndHandleConsentResult$1.L$2 = dpdpaUserConsentsInfoAppModel2;
        dpdpaConsentManagerImpl$fetchAndHandleConsentResult$1.label = 2;
        Object objC = this.e.c(dpdpaConsentManagerImpl$fetchAndHandleConsentResult$1);
        if (objC != coroutineSingletons) {
            chaloUseCaseResult = chaloUseCaseResult2;
            dpdpaUserConsentsInfoAppModel = dpdpaUserConsentsInfoAppModel2;
            objA = objC;
            dpdpaConsentManagerImpl = this;
            dpdpaConsentManagerImpl.g = new DpdpaConsentCacheInfo(dpdpaUserConsentsInfoAppModel, ((Number) objA).longValue());
            return chaloUseCaseResult;
        }
        return coroutineSingletons;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object g(ContinuationImpl continuationImpl) {
        DpdpaConsentManagerImpl$getUserConsentConfig$1 dpdpaConsentManagerImpl$getUserConsentConfig$1;
        DpdpaConsentManagerImpl dpdpaConsentManagerImpl;
        if (continuationImpl instanceof DpdpaConsentManagerImpl$getUserConsentConfig$1) {
            dpdpaConsentManagerImpl$getUserConsentConfig$1 = (DpdpaConsentManagerImpl$getUserConsentConfig$1) continuationImpl;
            int i = dpdpaConsentManagerImpl$getUserConsentConfig$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                dpdpaConsentManagerImpl$getUserConsentConfig$1.label = i - Integer.MIN_VALUE;
            } else {
                dpdpaConsentManagerImpl$getUserConsentConfig$1 = new DpdpaConsentManagerImpl$getUserConsentConfig$1(this, continuationImpl);
            }
        } else {
            dpdpaConsentManagerImpl$getUserConsentConfig$1 = new DpdpaConsentManagerImpl$getUserConsentConfig$1(this, continuationImpl);
        }
        Object objA = dpdpaConsentManagerImpl$getUserConsentConfig$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = dpdpaConsentManagerImpl$getUserConsentConfig$1.label;
        if (i2 == 0) {
            ResultKt.b(objA);
            UserConsentConfig userConsentConfig = this.h;
            if (userConsentConfig != null) {
                return userConsentConfig;
            }
            dpdpaConsentManagerImpl$getUserConsentConfig$1.L$0 = this;
            dpdpaConsentManagerImpl$getUserConsentConfig$1.label = 1;
            objA = this.f.a(dpdpaConsentManagerImpl$getUserConsentConfig$1);
            if (objA == coroutineSingletons) {
                return coroutineSingletons;
            }
            dpdpaConsentManagerImpl = this;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            dpdpaConsentManagerImpl = (DpdpaConsentManagerImpl) dpdpaConsentManagerImpl$getUserConsentConfig$1.L$0;
            ResultKt.b(objA);
        }
        UserConsentConfig userConsentConfig2 = ((MiscellaneousCityWiseConfigForCity) objA).s;
        dpdpaConsentManagerImpl.h = userConsentConfig2;
        return userConsentConfig2;
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0070  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object h(DpdpaConsentCacheInfo dpdpaConsentCacheInfo, ContinuationImpl continuationImpl) {
        DpdpaConsentManagerImpl$hasExpired$1 dpdpaConsentManagerImpl$hasExpired$1;
        long j;
        if (continuationImpl instanceof DpdpaConsentManagerImpl$hasExpired$1) {
            dpdpaConsentManagerImpl$hasExpired$1 = (DpdpaConsentManagerImpl$hasExpired$1) continuationImpl;
            int i = dpdpaConsentManagerImpl$hasExpired$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                dpdpaConsentManagerImpl$hasExpired$1.label = i - Integer.MIN_VALUE;
            } else {
                dpdpaConsentManagerImpl$hasExpired$1 = new DpdpaConsentManagerImpl$hasExpired$1(this, continuationImpl);
            }
        } else {
            dpdpaConsentManagerImpl$hasExpired$1 = new DpdpaConsentManagerImpl$hasExpired$1(this, continuationImpl);
        }
        Object objC = dpdpaConsentManagerImpl$hasExpired$1.result;
        Object obj = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = dpdpaConsentManagerImpl$hasExpired$1.label;
        if (i2 == 0) {
            ResultKt.b(objC);
            dpdpaConsentManagerImpl$hasExpired$1.L$0 = dpdpaConsentCacheInfo;
            dpdpaConsentManagerImpl$hasExpired$1.label = 1;
            objC = this.e.c(dpdpaConsentManagerImpl$hasExpired$1);
            if (objC != obj) {
            }
            return obj;
        }
        if (i2 == 1) {
            dpdpaConsentCacheInfo = (DpdpaConsentCacheInfo) dpdpaConsentManagerImpl$hasExpired$1.L$0;
            ResultKt.b(objC);
        } else {
            if (i2 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            j = dpdpaConsentManagerImpl$hasExpired$1.J$0;
            ResultKt.b(objC);
        }
        return Boolean.valueOf(j >= ((UserConsentConfig) objC).b);
        long jLongValue = ((Number) objC).longValue() - dpdpaConsentCacheInfo.b;
        dpdpaConsentManagerImpl$hasExpired$1.L$0 = null;
        dpdpaConsentManagerImpl$hasExpired$1.J$0 = jLongValue;
        dpdpaConsentManagerImpl$hasExpired$1.label = 2;
        Object objG = g(dpdpaConsentManagerImpl$hasExpired$1);
        if (objG != obj) {
            objC = objG;
            j = jLongValue;
            return Boolean.valueOf(j >= ((UserConsentConfig) objC).b);
        }
        return obj;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object i(String str, DpdpaConsentCacheInfo dpdpaConsentCacheInfo, ContinuationImpl continuationImpl) {
        DpdpaConsentManagerImpl$shouldRefreshConsentResult$1 dpdpaConsentManagerImpl$shouldRefreshConsentResult$1;
        if (continuationImpl instanceof DpdpaConsentManagerImpl$shouldRefreshConsentResult$1) {
            dpdpaConsentManagerImpl$shouldRefreshConsentResult$1 = (DpdpaConsentManagerImpl$shouldRefreshConsentResult$1) continuationImpl;
            int i = dpdpaConsentManagerImpl$shouldRefreshConsentResult$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                dpdpaConsentManagerImpl$shouldRefreshConsentResult$1.label = i - Integer.MIN_VALUE;
            } else {
                dpdpaConsentManagerImpl$shouldRefreshConsentResult$1 = new DpdpaConsentManagerImpl$shouldRefreshConsentResult$1(this, continuationImpl);
            }
        } else {
            dpdpaConsentManagerImpl$shouldRefreshConsentResult$1 = new DpdpaConsentManagerImpl$shouldRefreshConsentResult$1(this, continuationImpl);
        }
        Object objH = dpdpaConsentManagerImpl$shouldRefreshConsentResult$1.result;
        Object obj = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = dpdpaConsentManagerImpl$shouldRefreshConsentResult$1.label;
        boolean z = true;
        if (i2 == 0) {
            ResultKt.b(objH);
            if (dpdpaConsentCacheInfo != null) {
                dpdpaConsentManagerImpl$shouldRefreshConsentResult$1.L$0 = str;
                dpdpaConsentManagerImpl$shouldRefreshConsentResult$1.L$1 = dpdpaConsentCacheInfo;
                dpdpaConsentManagerImpl$shouldRefreshConsentResult$1.label = 1;
                objH = h(dpdpaConsentCacheInfo, dpdpaConsentManagerImpl$shouldRefreshConsentResult$1);
                if (objH == obj) {
                    return obj;
                }
            }
            return Boolean.valueOf(z);
        }
        if (i2 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        dpdpaConsentCacheInfo = (DpdpaConsentCacheInfo) dpdpaConsentManagerImpl$shouldRefreshConsentResult$1.L$1;
        str = (String) dpdpaConsentManagerImpl$shouldRefreshConsentResult$1.L$0;
        ResultKt.b(objH);
        if (!((Boolean) objH).booleanValue() && Intrinsics.d(dpdpaConsentCacheInfo.f5257a.f5191a, str)) {
            z = false;
        }
        return Boolean.valueOf(z);
    }
}
