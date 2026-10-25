package app.chalo.home.domain;

import app.chalo.contract.BasicInfoContract;
import app.chalo.crashlytics.CrashlyticsLogger;
import app.chalo.features.language.LanguageFeature;
import app.chalo.features.language.LanguagePlatformHelper;
import app.chalo.helper.HtmlTextUIHelper;
import app.chalo.home.data.exceptions.HomeRemoteDataException;
import app.chalo.home.data.mappers.HomeScreenConfigApiToAppModelMapperKt;
import app.chalo.home.data.model.api.HomeScreenConfigFetchApiModel;
import app.chalo.home.data.repository.IHomeScreenConfigRepository;
import app.chalo.homescreen.data.model.app.HomeScreenConfigAppModel;
import app.chalo.homescreen.data.model.app.HomeScreenConfigGetType;
import app.chalo.network.exception.ChaloLocalException;
import app.chalo.providers.CoroutineContextProvider;
import app.chalo.utils.CommonHtmlParser;
import defpackage.vo1;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.internal.ContextScope;
import kotlinx.coroutines.sync.Mutex;
import kotlinx.coroutines.sync.MutexImpl;
import kotlinx.coroutines.sync.MutexKt;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/home/domain/GetHomeScreenConfigUseCase;", "", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class GetHomeScreenConfigUseCase {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final IHomeScreenConfigRepository f3037a;
    public final BasicInfoContract b;
    public final CrashlyticsLogger c;
    public final HtmlTextUIHelper d;
    public final CommonHtmlParser e;
    public final LanguageFeature f;
    public final LanguagePlatformHelper g;
    public final LinkedHashMap h = new LinkedHashMap();
    public final MutexImpl i = MutexKt.a();
    public final ContextScope j;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f3038a;

        static {
            int[] iArr = new int[HomeScreenConfigGetType.values().length];
            try {
                iArr[HomeScreenConfigGetType.ONLY_RETURN_CACHED_DATA_EVEN_IF_NULL_AND_DO_NOT_REFRESH.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[HomeScreenConfigGetType.BYPASS_REFRESH_IF_CACHED_DATA_AVAILABLE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[HomeScreenConfigGetType.RETURN_CACHED_INFO_IF_AVL_AND_REFRESH_IN_BACKGROUND_FOR_NEXT_SESSION.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[HomeScreenConfigGetType.REFRESH_IN_BACKGROUND_FOR_NEXT_SESSION.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[HomeScreenConfigGetType.REFRESH_CONFIG_WHEN_LANGUAGE_CHANGED.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            f3038a = iArr;
        }
    }

    public GetHomeScreenConfigUseCase(IHomeScreenConfigRepository iHomeScreenConfigRepository, BasicInfoContract basicInfoContract, CrashlyticsLogger crashlyticsLogger, HtmlTextUIHelper htmlTextUIHelper, CommonHtmlParser commonHtmlParser, CoroutineContextProvider coroutineContextProvider, LanguageFeature languageFeature, LanguagePlatformHelper languagePlatformHelper) {
        this.f3037a = iHomeScreenConfigRepository;
        this.b = basicInfoContract;
        this.c = crashlyticsLogger;
        this.d = htmlTextUIHelper;
        this.e = commonHtmlParser;
        this.f = languageFeature;
        this.g = languagePlatformHelper;
        this.j = CoroutineScopeKt.a(coroutineContextProvider.b());
    }

    public static String b(String str, String str2) {
        return vo1.n(str, "_", str2);
    }

    /* JADX WARN: Code duplicated, block: B:32:0x00ad  */
    /* JADX WARN: Code duplicated, block: B:35:0x00be  */
    /* JADX WARN: Code duplicated, block: B:42:0x00d0 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(String str, String str2, ContinuationImpl continuationImpl) {
        GetHomeScreenConfigUseCase$getCachedHomeScreenConfigIfAvailable$1 getHomeScreenConfigUseCase$getCachedHomeScreenConfigIfAvailable$1;
        String str3;
        Mutex mutex;
        String str4;
        HomeScreenConfigAppModel homeScreenConfigAppModel;
        String str5;
        HomeScreenConfigAppModel homeScreenConfigAppModel2;
        if (continuationImpl instanceof GetHomeScreenConfigUseCase$getCachedHomeScreenConfigIfAvailable$1) {
            getHomeScreenConfigUseCase$getCachedHomeScreenConfigIfAvailable$1 = (GetHomeScreenConfigUseCase$getCachedHomeScreenConfigIfAvailable$1) continuationImpl;
            int i = getHomeScreenConfigUseCase$getCachedHomeScreenConfigIfAvailable$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                getHomeScreenConfigUseCase$getCachedHomeScreenConfigIfAvailable$1.label = i - Integer.MIN_VALUE;
            } else {
                getHomeScreenConfigUseCase$getCachedHomeScreenConfigIfAvailable$1 = new GetHomeScreenConfigUseCase$getCachedHomeScreenConfigIfAvailable$1(this, continuationImpl);
            }
        } else {
            getHomeScreenConfigUseCase$getCachedHomeScreenConfigIfAvailable$1 = new GetHomeScreenConfigUseCase$getCachedHomeScreenConfigIfAvailable$1(this, continuationImpl);
        }
        Object obj = getHomeScreenConfigUseCase$getCachedHomeScreenConfigIfAvailable$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = getHomeScreenConfigUseCase$getCachedHomeScreenConfigIfAvailable$1.label;
        LinkedHashMap linkedHashMap = this.h;
        Mutex mutex2 = this.i;
        try {
            if (i2 == 0) {
                ResultKt.b(obj);
                getHomeScreenConfigUseCase$getCachedHomeScreenConfigIfAvailable$1.L$0 = str;
                getHomeScreenConfigUseCase$getCachedHomeScreenConfigIfAvailable$1.L$1 = str2;
                getHomeScreenConfigUseCase$getCachedHomeScreenConfigIfAvailable$1.L$2 = mutex2;
                getHomeScreenConfigUseCase$getCachedHomeScreenConfigIfAvailable$1.label = 1;
                if (mutex2.a(getHomeScreenConfigUseCase$getCachedHomeScreenConfigIfAvailable$1) != coroutineSingletons) {
                    str3 = str2;
                    mutex = mutex2;
                }
                return coroutineSingletons;
            }
            if (i2 == 1) {
                Mutex mutex3 = (Mutex) getHomeScreenConfigUseCase$getCachedHomeScreenConfigIfAvailable$1.L$2;
                String str6 = (String) getHomeScreenConfigUseCase$getCachedHomeScreenConfigIfAvailable$1.L$1;
                String str7 = (String) getHomeScreenConfigUseCase$getCachedHomeScreenConfigIfAvailable$1.L$0;
                ResultKt.b(obj);
                str3 = str6;
                mutex = mutex3;
                str = str7;
            } else {
                if (i2 == 2) {
                    String str8 = (String) getHomeScreenConfigUseCase$getCachedHomeScreenConfigIfAvailable$1.L$1;
                    String str9 = (String) getHomeScreenConfigUseCase$getCachedHomeScreenConfigIfAvailable$1.L$0;
                    ResultKt.b(obj);
                    str4 = str8;
                    str = str9;
                    homeScreenConfigAppModel = (HomeScreenConfigAppModel) obj;
                    if (homeScreenConfigAppModel != null) {
                        return null;
                    }
                    getHomeScreenConfigUseCase$getCachedHomeScreenConfigIfAvailable$1.L$0 = str;
                    getHomeScreenConfigUseCase$getCachedHomeScreenConfigIfAvailable$1.L$1 = str4;
                    getHomeScreenConfigUseCase$getCachedHomeScreenConfigIfAvailable$1.L$2 = homeScreenConfigAppModel;
                    getHomeScreenConfigUseCase$getCachedHomeScreenConfigIfAvailable$1.L$3 = mutex2;
                    getHomeScreenConfigUseCase$getCachedHomeScreenConfigIfAvailable$1.label = 3;
                    if (mutex2.a(getHomeScreenConfigUseCase$getCachedHomeScreenConfigIfAvailable$1) != coroutineSingletons) {
                        str5 = str;
                        homeScreenConfigAppModel2 = homeScreenConfigAppModel;
                    }
                    return coroutineSingletons;
                }
                if (i2 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                mutex2 = (Mutex) getHomeScreenConfigUseCase$getCachedHomeScreenConfigIfAvailable$1.L$3;
                homeScreenConfigAppModel2 = (HomeScreenConfigAppModel) getHomeScreenConfigUseCase$getCachedHomeScreenConfigIfAvailable$1.L$2;
                str4 = (String) getHomeScreenConfigUseCase$getCachedHomeScreenConfigIfAvailable$1.L$1;
                str5 = (String) getHomeScreenConfigUseCase$getCachedHomeScreenConfigIfAvailable$1.L$0;
                ResultKt.b(obj);
            }
            try {
                linkedHashMap.put(b(str5, str4), homeScreenConfigAppModel2);
                return homeScreenConfigAppModel2;
            } finally {
                mutex2.e(null);
            }
            HomeScreenConfigAppModel homeScreenConfigAppModel3 = (HomeScreenConfigAppModel) linkedHashMap.get(b(str, str3));
            if (homeScreenConfigAppModel3 != null) {
                mutex.e(null);
                return homeScreenConfigAppModel3;
            }
            mutex.e(null);
            getHomeScreenConfigUseCase$getCachedHomeScreenConfigIfAvailable$1.L$0 = str;
            getHomeScreenConfigUseCase$getCachedHomeScreenConfigIfAvailable$1.L$1 = str3;
            getHomeScreenConfigUseCase$getCachedHomeScreenConfigIfAvailable$1.L$2 = null;
            getHomeScreenConfigUseCase$getCachedHomeScreenConfigIfAvailable$1.label = 2;
            Object objB = this.f3037a.b(str, str3, getHomeScreenConfigUseCase$getCachedHomeScreenConfigIfAvailable$1);
            if (objB != coroutineSingletons) {
                String str10 = str3;
                obj = objB;
                str4 = str10;
                homeScreenConfigAppModel = (HomeScreenConfigAppModel) obj;
                if (homeScreenConfigAppModel != null) {
                    return null;
                }
                getHomeScreenConfigUseCase$getCachedHomeScreenConfigIfAvailable$1.L$0 = str;
                getHomeScreenConfigUseCase$getCachedHomeScreenConfigIfAvailable$1.L$1 = str4;
                getHomeScreenConfigUseCase$getCachedHomeScreenConfigIfAvailable$1.L$2 = homeScreenConfigAppModel;
                getHomeScreenConfigUseCase$getCachedHomeScreenConfigIfAvailable$1.L$3 = mutex2;
                getHomeScreenConfigUseCase$getCachedHomeScreenConfigIfAvailable$1.label = 3;
                if (mutex2.a(getHomeScreenConfigUseCase$getCachedHomeScreenConfigIfAvailable$1) != coroutineSingletons) {
                    str5 = str;
                    homeScreenConfigAppModel2 = homeScreenConfigAppModel;
                    linkedHashMap.put(b(str5, str4), homeScreenConfigAppModel2);
                    return homeScreenConfigAppModel2;
                }
            }
            return coroutineSingletons;
        } catch (Throwable th) {
            mutex.e(null);
            throw th;
        }
    }

    /* JADX WARN: Code duplicated, block: B:38:0x00cd  */
    /* JADX WARN: Code duplicated, block: B:41:0x00de A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:42:0x00e0  */
    /* JADX WARN: Code duplicated, block: B:44:0x00e3 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:45:0x00e5 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:46:0x00e7  */
    /* JADX WARN: Code duplicated, block: B:49:0x00f9  */
    /* JADX WARN: Code duplicated, block: B:52:0x0100  */
    /* JADX WARN: Code duplicated, block: B:55:0x0112  */
    /* JADX WARN: Code duplicated, block: B:61:0x0129  */
    /* JADX WARN: Code duplicated, block: B:63:0x012f  */
    /* JADX WARN: Code duplicated, block: B:66:0x0149 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:67:0x014a  */
    /* JADX WARN: Code duplicated, block: B:70:0x015a  */
    /* JADX WARN: Code duplicated, block: B:73:0x0162  */
    /* JADX WARN: Code duplicated, block: B:75:0x016b  */
    /* JADX WARN: Code duplicated, block: B:78:0x017b A[PHI: r12 r13
      0x017b: PHI (r12v16 java.lang.String) = (r12v13 java.lang.String), (r12v19 java.lang.String) binds: [B:76:0x0178, B:19:0x0063] A[DONT_GENERATE, DONT_INLINE]
      0x017b: PHI (r13v21 java.lang.String) = (r13v18 java.lang.String), (r13v23 java.lang.String) binds: [B:76:0x0178, B:19:0x0063] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code duplicated, block: B:81:0x018a A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:82:0x018b  */
    /* JADX WARN: Code duplicated, block: B:85:0x019a  */
    /* JADX WARN: Code duplicated, block: B:88:0x01a2  */
    /* JADX WARN: Code duplicated, block: B:91:0x01af A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:92:0x01b0 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:93:0x01b1  */
    /* JADX WARN: Code duplicated, block: B:95:0x01bf A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:96:0x01c0 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:97:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x0122, code lost:
    
        if (r14 == r1) goto L95;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(java.lang.String r12, app.chalo.homescreen.data.model.app.HomeScreenConfigGetType r13, kotlin.coroutines.jvm.internal.ContinuationImpl r14) {
        /*
            Method dump skipped, instruction units count: 478
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: app.chalo.home.domain.GetHomeScreenConfigUseCase.c(java.lang.String, app.chalo.homescreen.data.model.app.HomeScreenConfigGetType, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:100:0x0190  */
    /* JADX WARN: Code duplicated, block: B:103:0x0196  */
    /* JADX WARN: Code duplicated, block: B:106:0x01a2  */
    /* JADX WARN: Code duplicated, block: B:109:0x01a5  */
    /* JADX WARN: Code duplicated, block: B:111:0x01a9  */
    /* JADX WARN: Code duplicated, block: B:124:0x01c8 A[PHI: r2 r5
      0x01c8: PHI (r2v5 java.lang.String) = (r2v6 java.lang.String), (r2v8 java.lang.String) binds: [B:94:0x0178, B:66:0x010d] A[DONT_GENERATE, DONT_INLINE]
      0x01c8: PHI (r5v0 java.lang.String) = (r5v1 java.lang.String), (r5v2 java.lang.String) binds: [B:94:0x0178, B:66:0x010d] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:126:0x01d9 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:127:0x01da A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:139:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:64:0x00fc  */
    /* JADX WARN: Code duplicated, block: B:67:0x010f A[Catch: Exception -> 0x00ed, ChaloLocalException -> 0x00f2, HomeRemoteDataException -> 0x00f7, TRY_LEAVE, TryCatch #11 {HomeRemoteDataException -> 0x00f7, ChaloLocalException -> 0x00f2, Exception -> 0x00ed, blocks: (B:52:0x00d1, B:54:0x00e2, B:65:0x00ff, B:67:0x010f), top: B:130:0x00d1 }] */
    /* JADX WARN: Code duplicated, block: B:70:0x0122  */
    /* JADX WARN: Code duplicated, block: B:74:0x013d  */
    /* JADX WARN: Code duplicated, block: B:77:0x0145 A[ADDED_TO_REGION, Catch: all -> 0x014d, REMOVE, TRY_ENTER, TryCatch #11 {all -> 0x014d, blocks: (B:77:0x0145, B:80:0x0150, B:82:0x015a), top: B:128:0x0143, outer: #8 }] */
    /* JADX WARN: Code duplicated, block: B:80:0x0150 A[Catch: all -> 0x014d, TryCatch #11 {all -> 0x014d, blocks: (B:77:0x0145, B:80:0x0150, B:82:0x015a), top: B:128:0x0143, outer: #8 }] */
    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    /* JADX WARN: Code duplicated, block: B:97:0x017e  */
    public final Object d(String str, String str2, ContinuationImpl continuationImpl, boolean z) {
        GetHomeScreenConfigUseCase$refreshCache$1 getHomeScreenConfigUseCase$refreshCache$1;
        String str3;
        Exception exc;
        ChaloLocalException chaloLocalException;
        HomeRemoteDataException homeRemoteDataException;
        String str4;
        String str5;
        Object objA;
        HomeScreenConfigAppModel homeScreenConfigAppModel;
        HomeScreenConfigAppModel homeScreenConfigAppModel2;
        HomeScreenConfigFetchApiModel homeScreenConfigFetchApiModel;
        List list;
        String str6;
        String str7;
        HomeScreenConfigAppModel homeScreenConfigAppModelE;
        HomeScreenConfigAppModel homeScreenConfigAppModel3;
        MutexImpl mutexImpl;
        String str8;
        boolean z2;
        HomeScreenConfigAppModel homeScreenConfigAppModel4;
        Mutex mutex;
        LinkedHashMap linkedHashMap;
        if (continuationImpl instanceof GetHomeScreenConfigUseCase$refreshCache$1) {
            getHomeScreenConfigUseCase$refreshCache$1 = (GetHomeScreenConfigUseCase$refreshCache$1) continuationImpl;
            int i = getHomeScreenConfigUseCase$refreshCache$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                getHomeScreenConfigUseCase$refreshCache$1.label = i - Integer.MIN_VALUE;
            } else {
                getHomeScreenConfigUseCase$refreshCache$1 = new GetHomeScreenConfigUseCase$refreshCache$1(this, continuationImpl);
            }
        } else {
            getHomeScreenConfigUseCase$refreshCache$1 = new GetHomeScreenConfigUseCase$refreshCache$1(this, continuationImpl);
        }
        GetHomeScreenConfigUseCase$refreshCache$1 getHomeScreenConfigUseCase$refreshCache$2 = getHomeScreenConfigUseCase$refreshCache$1;
        Object objA2 = getHomeScreenConfigUseCase$refreshCache$2.result;
        Object obj = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = getHomeScreenConfigUseCase$refreshCache$2.label;
        IHomeScreenConfigRepository iHomeScreenConfigRepository = this.f3037a;
        CrashlyticsLogger crashlyticsLogger = this.c;
        try {
            switch (i2) {
                case 0:
                    ResultKt.b(objA2);
                    getHomeScreenConfigUseCase$refreshCache$2.L$0 = str;
                    getHomeScreenConfigUseCase$refreshCache$2.L$1 = str2;
                    getHomeScreenConfigUseCase$refreshCache$2.Z$0 = z;
                    getHomeScreenConfigUseCase$refreshCache$2.label = 1;
                    objA2 = iHomeScreenConfigRepository.e(str, str2, getHomeScreenConfigUseCase$refreshCache$2);
                    if (objA2 != obj) {
                        str3 = str;
                        str5 = str2;
                        try {
                            Pair pair = (Pair) objA2;
                            homeScreenConfigFetchApiModel = (HomeScreenConfigFetchApiModel) pair.d();
                            list = (List) pair.e();
                            if (list != null || (str6 = (String) CollectionsKt.H(list)) == null) {
                                str6 = "";
                            }
                            str7 = str6;
                            homeScreenConfigAppModelE = HomeScreenConfigApiToAppModelMapperKt.e(homeScreenConfigFetchApiModel, str3, this.b.h(), this.d, this.e);
                            if (homeScreenConfigAppModelE != null) {
                                getHomeScreenConfigUseCase$refreshCache$2.L$0 = str3;
                                getHomeScreenConfigUseCase$refreshCache$2.L$1 = str5;
                                getHomeScreenConfigUseCase$refreshCache$2.L$2 = homeScreenConfigAppModelE;
                                getHomeScreenConfigUseCase$refreshCache$2.Z$0 = z;
                                getHomeScreenConfigUseCase$refreshCache$2.label = 2;
                                if (iHomeScreenConfigRepository.d(str3, str7, homeScreenConfigFetchApiModel, str5, getHomeScreenConfigUseCase$refreshCache$2) != obj) {
                                    homeScreenConfigAppModel3 = homeScreenConfigAppModelE;
                                    str2 = str5;
                                    str = str3;
                                    mutexImpl = this.i;
                                    getHomeScreenConfigUseCase$refreshCache$2.L$0 = str;
                                    getHomeScreenConfigUseCase$refreshCache$2.L$1 = str2;
                                    getHomeScreenConfigUseCase$refreshCache$2.L$2 = homeScreenConfigAppModel3;
                                    getHomeScreenConfigUseCase$refreshCache$2.L$3 = mutexImpl;
                                    getHomeScreenConfigUseCase$refreshCache$2.Z$0 = z;
                                    getHomeScreenConfigUseCase$refreshCache$2.label = 3;
                                    if (mutexImpl.a(getHomeScreenConfigUseCase$refreshCache$2) != obj) {
                                        str8 = str;
                                        z2 = z;
                                        homeScreenConfigAppModel4 = homeScreenConfigAppModel3;
                                        mutex = mutexImpl;
                                        linkedHashMap = this.h;
                                        try {
                                            try {
                                                if (z2 || linkedHashMap.get(b(str8, str2)) == null) {
                                                    linkedHashMap.put(b(str8, str2), homeScreenConfigAppModel4);
                                                }
                                                mutex.e(null);
                                                return homeScreenConfigAppModel4;
                                            } catch (Throwable th) {
                                                mutex.e(null);
                                                throw th;
                                            }
                                        } catch (HomeRemoteDataException e) {
                                            homeRemoteDataException = e;
                                            str3 = str8;
                                            crashlyticsLogger.i(homeRemoteDataException);
                                            str5 = str2;
                                            getHomeScreenConfigUseCase$refreshCache$2.L$0 = null;
                                            getHomeScreenConfigUseCase$refreshCache$2.L$1 = null;
                                            getHomeScreenConfigUseCase$refreshCache$2.L$2 = null;
                                            getHomeScreenConfigUseCase$refreshCache$2.L$3 = null;
                                            getHomeScreenConfigUseCase$refreshCache$2.label = 6;
                                            objA = a(str3, str5, getHomeScreenConfigUseCase$refreshCache$2);
                                            if (objA == obj) {
                                                return obj;
                                            }
                                            return objA;
                                        } catch (ChaloLocalException e2) {
                                            chaloLocalException = e2;
                                            str3 = str8;
                                            if (!(chaloLocalException instanceof ChaloLocalException.NoUpdateInFetchedDataBasedOnEtagVersion)) {
                                                getHomeScreenConfigUseCase$refreshCache$2.L$0 = str3;
                                                getHomeScreenConfigUseCase$refreshCache$2.L$1 = null;
                                                getHomeScreenConfigUseCase$refreshCache$2.L$2 = null;
                                                getHomeScreenConfigUseCase$refreshCache$2.L$3 = null;
                                                getHomeScreenConfigUseCase$refreshCache$2.label = 4;
                                                objA2 = a(str3, str2, getHomeScreenConfigUseCase$refreshCache$2);
                                                if (objA2 != obj) {
                                                    str4 = str3;
                                                    homeScreenConfigAppModel = (HomeScreenConfigAppModel) objA2;
                                                    if (homeScreenConfigAppModel != null) {
                                                        return homeScreenConfigAppModel;
                                                    }
                                                    getHomeScreenConfigUseCase$refreshCache$2.L$0 = homeScreenConfigAppModel;
                                                    getHomeScreenConfigUseCase$refreshCache$2.label = 5;
                                                    if (iHomeScreenConfigRepository.a(str4, getHomeScreenConfigUseCase$refreshCache$2) != obj) {
                                                        homeScreenConfigAppModel2 = homeScreenConfigAppModel;
                                                        return homeScreenConfigAppModel2;
                                                    }
                                                }
                                            } else {
                                                if (chaloLocalException instanceof ChaloLocalException.NoInternetException) {
                                                }
                                                crashlyticsLogger.i(chaloLocalException);
                                                str5 = str2;
                                                getHomeScreenConfigUseCase$refreshCache$2.L$0 = null;
                                                getHomeScreenConfigUseCase$refreshCache$2.L$1 = null;
                                                getHomeScreenConfigUseCase$refreshCache$2.L$2 = null;
                                                getHomeScreenConfigUseCase$refreshCache$2.L$3 = null;
                                                getHomeScreenConfigUseCase$refreshCache$2.label = 6;
                                                objA = a(str3, str5, getHomeScreenConfigUseCase$refreshCache$2);
                                                if (objA == obj) {
                                                    return objA;
                                                }
                                            }
                                            return obj;
                                        } catch (Exception e3) {
                                            exc = e3;
                                            str3 = str8;
                                            crashlyticsLogger.i(exc);
                                            str5 = str2;
                                            getHomeScreenConfigUseCase$refreshCache$2.L$0 = null;
                                            getHomeScreenConfigUseCase$refreshCache$2.L$1 = null;
                                            getHomeScreenConfigUseCase$refreshCache$2.L$2 = null;
                                            getHomeScreenConfigUseCase$refreshCache$2.L$3 = null;
                                            getHomeScreenConfigUseCase$refreshCache$2.label = 6;
                                            objA = a(str3, str5, getHomeScreenConfigUseCase$refreshCache$2);
                                            if (objA == obj) {
                                                return obj;
                                            }
                                            return objA;
                                        }
                                    }
                                }
                            } else {
                                getHomeScreenConfigUseCase$refreshCache$2.L$0 = null;
                                getHomeScreenConfigUseCase$refreshCache$2.L$1 = null;
                                getHomeScreenConfigUseCase$refreshCache$2.L$2 = null;
                                getHomeScreenConfigUseCase$refreshCache$2.L$3 = null;
                                getHomeScreenConfigUseCase$refreshCache$2.label = 6;
                                objA = a(str3, str5, getHomeScreenConfigUseCase$refreshCache$2);
                                if (objA == obj) {
                                    return objA;
                                }
                            }
                        } catch (HomeRemoteDataException e4) {
                            homeRemoteDataException = e4;
                            str2 = str5;
                            crashlyticsLogger.i(homeRemoteDataException);
                            str5 = str2;
                        } catch (ChaloLocalException e5) {
                            chaloLocalException = e5;
                            str2 = str5;
                            if (!(chaloLocalException instanceof ChaloLocalException.NoUpdateInFetchedDataBasedOnEtagVersion)) {
                                getHomeScreenConfigUseCase$refreshCache$2.L$0 = str3;
                                getHomeScreenConfigUseCase$refreshCache$2.L$1 = null;
                                getHomeScreenConfigUseCase$refreshCache$2.L$2 = null;
                                getHomeScreenConfigUseCase$refreshCache$2.L$3 = null;
                                getHomeScreenConfigUseCase$refreshCache$2.label = 4;
                                objA2 = a(str3, str2, getHomeScreenConfigUseCase$refreshCache$2);
                                if (objA2 != obj) {
                                    str4 = str3;
                                    homeScreenConfigAppModel = (HomeScreenConfigAppModel) objA2;
                                    if (homeScreenConfigAppModel != null) {
                                        return homeScreenConfigAppModel;
                                    }
                                    getHomeScreenConfigUseCase$refreshCache$2.L$0 = homeScreenConfigAppModel;
                                    getHomeScreenConfigUseCase$refreshCache$2.label = 5;
                                    if (iHomeScreenConfigRepository.a(str4, getHomeScreenConfigUseCase$refreshCache$2) != obj) {
                                        homeScreenConfigAppModel2 = homeScreenConfigAppModel;
                                        return homeScreenConfigAppModel2;
                                    }
                                }
                            } else {
                                if ((chaloLocalException instanceof ChaloLocalException.NoInternetException) && !(chaloLocalException instanceof ChaloLocalException.RequestCancelledException) && !(chaloLocalException instanceof ChaloLocalException.SecureCallUnauthorizedAndRefreshTokenServerUnreachableException) && !(chaloLocalException instanceof ChaloLocalException.ServerErrorException) && !(chaloLocalException instanceof ChaloLocalException.UnexpectedException)) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                crashlyticsLogger.i(chaloLocalException);
                                str5 = str2;
                                getHomeScreenConfigUseCase$refreshCache$2.L$0 = null;
                                getHomeScreenConfigUseCase$refreshCache$2.L$1 = null;
                                getHomeScreenConfigUseCase$refreshCache$2.L$2 = null;
                                getHomeScreenConfigUseCase$refreshCache$2.L$3 = null;
                                getHomeScreenConfigUseCase$refreshCache$2.label = 6;
                                objA = a(str3, str5, getHomeScreenConfigUseCase$refreshCache$2);
                                if (objA == obj) {
                                    return objA;
                                }
                            }
                        } catch (Exception e6) {
                            exc = e6;
                            str2 = str5;
                            crashlyticsLogger.i(exc);
                            str5 = str2;
                        }
                    }
                    return obj;
                case 1:
                    z = getHomeScreenConfigUseCase$refreshCache$2.Z$0;
                    str2 = (String) getHomeScreenConfigUseCase$refreshCache$2.L$1;
                    str = (String) getHomeScreenConfigUseCase$refreshCache$2.L$0;
                    ResultKt.b(objA2);
                    str3 = str;
                    str5 = str2;
                    Pair pair2 = (Pair) objA2;
                    homeScreenConfigFetchApiModel = (HomeScreenConfigFetchApiModel) pair2.d();
                    list = (List) pair2.e();
                    if (list != null) {
                        str6 = "";
                    } else {
                        str6 = "";
                    }
                    str7 = str6;
                    homeScreenConfigAppModelE = HomeScreenConfigApiToAppModelMapperKt.e(homeScreenConfigFetchApiModel, str3, this.b.h(), this.d, this.e);
                    if (homeScreenConfigAppModelE != null) {
                        getHomeScreenConfigUseCase$refreshCache$2.L$0 = str3;
                        getHomeScreenConfigUseCase$refreshCache$2.L$1 = str5;
                        getHomeScreenConfigUseCase$refreshCache$2.L$2 = homeScreenConfigAppModelE;
                        getHomeScreenConfigUseCase$refreshCache$2.Z$0 = z;
                        getHomeScreenConfigUseCase$refreshCache$2.label = 2;
                        if (iHomeScreenConfigRepository.d(str3, str7, homeScreenConfigFetchApiModel, str5, getHomeScreenConfigUseCase$refreshCache$2) != obj) {
                            homeScreenConfigAppModel3 = homeScreenConfigAppModelE;
                            str2 = str5;
                            str = str3;
                            mutexImpl = this.i;
                            getHomeScreenConfigUseCase$refreshCache$2.L$0 = str;
                            getHomeScreenConfigUseCase$refreshCache$2.L$1 = str2;
                            getHomeScreenConfigUseCase$refreshCache$2.L$2 = homeScreenConfigAppModel3;
                            getHomeScreenConfigUseCase$refreshCache$2.L$3 = mutexImpl;
                            getHomeScreenConfigUseCase$refreshCache$2.Z$0 = z;
                            getHomeScreenConfigUseCase$refreshCache$2.label = 3;
                            if (mutexImpl.a(getHomeScreenConfigUseCase$refreshCache$2) != obj) {
                                str8 = str;
                                z2 = z;
                                homeScreenConfigAppModel4 = homeScreenConfigAppModel3;
                                mutex = mutexImpl;
                                linkedHashMap = this.h;
                                if (z2) {
                                    linkedHashMap.put(b(str8, str2), homeScreenConfigAppModel4);
                                } else {
                                    linkedHashMap.put(b(str8, str2), homeScreenConfigAppModel4);
                                }
                                mutex.e(null);
                                return homeScreenConfigAppModel4;
                            }
                        }
                    } else {
                        getHomeScreenConfigUseCase$refreshCache$2.L$0 = null;
                        getHomeScreenConfigUseCase$refreshCache$2.L$1 = null;
                        getHomeScreenConfigUseCase$refreshCache$2.L$2 = null;
                        getHomeScreenConfigUseCase$refreshCache$2.L$3 = null;
                        getHomeScreenConfigUseCase$refreshCache$2.label = 6;
                        objA = a(str3, str5, getHomeScreenConfigUseCase$refreshCache$2);
                        if (objA == obj) {
                            return objA;
                        }
                    }
                    return obj;
                case 2:
                    boolean z3 = getHomeScreenConfigUseCase$refreshCache$2.Z$0;
                    HomeScreenConfigAppModel homeScreenConfigAppModel5 = (HomeScreenConfigAppModel) getHomeScreenConfigUseCase$refreshCache$2.L$2;
                    String str9 = (String) getHomeScreenConfigUseCase$refreshCache$2.L$1;
                    str3 = (String) getHomeScreenConfigUseCase$refreshCache$2.L$0;
                    try {
                        ResultKt.b(objA2);
                        homeScreenConfigAppModel3 = homeScreenConfigAppModel5;
                        str2 = str9;
                        z = z3;
                        str = str3;
                        mutexImpl = this.i;
                        getHomeScreenConfigUseCase$refreshCache$2.L$0 = str;
                        getHomeScreenConfigUseCase$refreshCache$2.L$1 = str2;
                        getHomeScreenConfigUseCase$refreshCache$2.L$2 = homeScreenConfigAppModel3;
                        getHomeScreenConfigUseCase$refreshCache$2.L$3 = mutexImpl;
                        getHomeScreenConfigUseCase$refreshCache$2.Z$0 = z;
                        getHomeScreenConfigUseCase$refreshCache$2.label = 3;
                        if (mutexImpl.a(getHomeScreenConfigUseCase$refreshCache$2) != obj) {
                            str8 = str;
                            z2 = z;
                            homeScreenConfigAppModel4 = homeScreenConfigAppModel3;
                            mutex = mutexImpl;
                            linkedHashMap = this.h;
                            if (z2) {
                                linkedHashMap.put(b(str8, str2), homeScreenConfigAppModel4);
                            } else {
                                linkedHashMap.put(b(str8, str2), homeScreenConfigAppModel4);
                            }
                            mutex.e(null);
                            return homeScreenConfigAppModel4;
                        }
                    } catch (HomeRemoteDataException e7) {
                        homeRemoteDataException = e7;
                        str2 = str9;
                        crashlyticsLogger.i(homeRemoteDataException);
                        str5 = str2;
                        getHomeScreenConfigUseCase$refreshCache$2.L$0 = null;
                        getHomeScreenConfigUseCase$refreshCache$2.L$1 = null;
                        getHomeScreenConfigUseCase$refreshCache$2.L$2 = null;
                        getHomeScreenConfigUseCase$refreshCache$2.L$3 = null;
                        getHomeScreenConfigUseCase$refreshCache$2.label = 6;
                        objA = a(str3, str5, getHomeScreenConfigUseCase$refreshCache$2);
                        if (objA == obj) {
                            return objA;
                        }
                    } catch (ChaloLocalException e8) {
                        chaloLocalException = e8;
                        str2 = str9;
                        if (!(chaloLocalException instanceof ChaloLocalException.NoUpdateInFetchedDataBasedOnEtagVersion)) {
                            getHomeScreenConfigUseCase$refreshCache$2.L$0 = str3;
                            getHomeScreenConfigUseCase$refreshCache$2.L$1 = null;
                            getHomeScreenConfigUseCase$refreshCache$2.L$2 = null;
                            getHomeScreenConfigUseCase$refreshCache$2.L$3 = null;
                            getHomeScreenConfigUseCase$refreshCache$2.label = 4;
                            objA2 = a(str3, str2, getHomeScreenConfigUseCase$refreshCache$2);
                            if (objA2 != obj) {
                                str4 = str3;
                                homeScreenConfigAppModel = (HomeScreenConfigAppModel) objA2;
                                if (homeScreenConfigAppModel != null) {
                                    return homeScreenConfigAppModel;
                                }
                                getHomeScreenConfigUseCase$refreshCache$2.L$0 = homeScreenConfigAppModel;
                                getHomeScreenConfigUseCase$refreshCache$2.label = 5;
                                if (iHomeScreenConfigRepository.a(str4, getHomeScreenConfigUseCase$refreshCache$2) != obj) {
                                    homeScreenConfigAppModel2 = homeScreenConfigAppModel;
                                    return homeScreenConfigAppModel2;
                                }
                            }
                        } else {
                            if (chaloLocalException instanceof ChaloLocalException.NoInternetException) {
                            }
                            crashlyticsLogger.i(chaloLocalException);
                            str5 = str2;
                            getHomeScreenConfigUseCase$refreshCache$2.L$0 = null;
                            getHomeScreenConfigUseCase$refreshCache$2.L$1 = null;
                            getHomeScreenConfigUseCase$refreshCache$2.L$2 = null;
                            getHomeScreenConfigUseCase$refreshCache$2.L$3 = null;
                            getHomeScreenConfigUseCase$refreshCache$2.label = 6;
                            objA = a(str3, str5, getHomeScreenConfigUseCase$refreshCache$2);
                            if (objA == obj) {
                                return objA;
                            }
                        }
                    } catch (Exception e9) {
                        exc = e9;
                        str2 = str9;
                        crashlyticsLogger.i(exc);
                        str5 = str2;
                        getHomeScreenConfigUseCase$refreshCache$2.L$0 = null;
                        getHomeScreenConfigUseCase$refreshCache$2.L$1 = null;
                        getHomeScreenConfigUseCase$refreshCache$2.L$2 = null;
                        getHomeScreenConfigUseCase$refreshCache$2.L$3 = null;
                        getHomeScreenConfigUseCase$refreshCache$2.label = 6;
                        objA = a(str3, str5, getHomeScreenConfigUseCase$refreshCache$2);
                        if (objA == obj) {
                            return objA;
                        }
                    }
                    return obj;
                case 3:
                    z2 = getHomeScreenConfigUseCase$refreshCache$2.Z$0;
                    Mutex mutex2 = (Mutex) getHomeScreenConfigUseCase$refreshCache$2.L$3;
                    homeScreenConfigAppModel4 = (HomeScreenConfigAppModel) getHomeScreenConfigUseCase$refreshCache$2.L$2;
                    String str10 = (String) getHomeScreenConfigUseCase$refreshCache$2.L$1;
                    str8 = (String) getHomeScreenConfigUseCase$refreshCache$2.L$0;
                    try {
                        ResultKt.b(objA2);
                        mutex = mutex2;
                        str2 = str10;
                        linkedHashMap = this.h;
                        if (z2) {
                            linkedHashMap.put(b(str8, str2), homeScreenConfigAppModel4);
                        } else {
                            linkedHashMap.put(b(str8, str2), homeScreenConfigAppModel4);
                        }
                        mutex.e(null);
                        return homeScreenConfigAppModel4;
                    } catch (HomeRemoteDataException e10) {
                        homeRemoteDataException = e10;
                        str2 = str10;
                        str3 = str8;
                        crashlyticsLogger.i(homeRemoteDataException);
                        str5 = str2;
                        getHomeScreenConfigUseCase$refreshCache$2.L$0 = null;
                        getHomeScreenConfigUseCase$refreshCache$2.L$1 = null;
                        getHomeScreenConfigUseCase$refreshCache$2.L$2 = null;
                        getHomeScreenConfigUseCase$refreshCache$2.L$3 = null;
                        getHomeScreenConfigUseCase$refreshCache$2.label = 6;
                        objA = a(str3, str5, getHomeScreenConfigUseCase$refreshCache$2);
                        if (objA == obj) {
                            return obj;
                        }
                        return objA;
                    } catch (ChaloLocalException e11) {
                        chaloLocalException = e11;
                        str2 = str10;
                        str3 = str8;
                        if (!(chaloLocalException instanceof ChaloLocalException.NoUpdateInFetchedDataBasedOnEtagVersion)) {
                            if (chaloLocalException instanceof ChaloLocalException.NoInternetException) {
                            }
                            crashlyticsLogger.i(chaloLocalException);
                            str5 = str2;
                            getHomeScreenConfigUseCase$refreshCache$2.L$0 = null;
                            getHomeScreenConfigUseCase$refreshCache$2.L$1 = null;
                            getHomeScreenConfigUseCase$refreshCache$2.L$2 = null;
                            getHomeScreenConfigUseCase$refreshCache$2.L$3 = null;
                            getHomeScreenConfigUseCase$refreshCache$2.label = 6;
                            objA = a(str3, str5, getHomeScreenConfigUseCase$refreshCache$2);
                            if (objA == obj) {
                                return objA;
                            }
                            break;
                        } else {
                            getHomeScreenConfigUseCase$refreshCache$2.L$0 = str3;
                            getHomeScreenConfigUseCase$refreshCache$2.L$1 = null;
                            getHomeScreenConfigUseCase$refreshCache$2.L$2 = null;
                            getHomeScreenConfigUseCase$refreshCache$2.L$3 = null;
                            getHomeScreenConfigUseCase$refreshCache$2.label = 4;
                            objA2 = a(str3, str2, getHomeScreenConfigUseCase$refreshCache$2);
                            if (objA2 != obj) {
                                str4 = str3;
                                homeScreenConfigAppModel = (HomeScreenConfigAppModel) objA2;
                                if (homeScreenConfigAppModel != null) {
                                    return homeScreenConfigAppModel;
                                }
                                getHomeScreenConfigUseCase$refreshCache$2.L$0 = homeScreenConfigAppModel;
                                getHomeScreenConfigUseCase$refreshCache$2.label = 5;
                                if (iHomeScreenConfigRepository.a(str4, getHomeScreenConfigUseCase$refreshCache$2) != obj) {
                                    homeScreenConfigAppModel2 = homeScreenConfigAppModel;
                                    return homeScreenConfigAppModel2;
                                }
                            }
                        }
                        return obj;
                    } catch (Exception e12) {
                        exc = e12;
                        str2 = str10;
                        str3 = str8;
                        crashlyticsLogger.i(exc);
                        str5 = str2;
                        getHomeScreenConfigUseCase$refreshCache$2.L$0 = null;
                        getHomeScreenConfigUseCase$refreshCache$2.L$1 = null;
                        getHomeScreenConfigUseCase$refreshCache$2.L$2 = null;
                        getHomeScreenConfigUseCase$refreshCache$2.L$3 = null;
                        getHomeScreenConfigUseCase$refreshCache$2.label = 6;
                        objA = a(str3, str5, getHomeScreenConfigUseCase$refreshCache$2);
                        if (objA == obj) {
                            return obj;
                        }
                        return objA;
                    }
                case 4:
                    str4 = (String) getHomeScreenConfigUseCase$refreshCache$2.L$0;
                    ResultKt.b(objA2);
                    homeScreenConfigAppModel = (HomeScreenConfigAppModel) objA2;
                    if (homeScreenConfigAppModel != null) {
                        return homeScreenConfigAppModel;
                    }
                    getHomeScreenConfigUseCase$refreshCache$2.L$0 = homeScreenConfigAppModel;
                    getHomeScreenConfigUseCase$refreshCache$2.label = 5;
                    if (iHomeScreenConfigRepository.a(str4, getHomeScreenConfigUseCase$refreshCache$2) != obj) {
                        homeScreenConfigAppModel2 = homeScreenConfigAppModel;
                        return homeScreenConfigAppModel2;
                    }
                    return obj;
                case 5:
                    homeScreenConfigAppModel2 = (HomeScreenConfigAppModel) getHomeScreenConfigUseCase$refreshCache$2.L$0;
                    ResultKt.b(objA2);
                    return homeScreenConfigAppModel2;
                case 6:
                    ResultKt.b(objA2);
                    return objA2;
                default:
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } catch (HomeRemoteDataException e13) {
            str3 = str;
            homeRemoteDataException = e13;
        } catch (ChaloLocalException e14) {
            str3 = str;
            chaloLocalException = e14;
        } catch (Exception e15) {
            str3 = str;
            exc = e15;
        }
    }
}
