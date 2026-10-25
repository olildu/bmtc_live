package app.chalo.domain;

import app.chalo.buildconfig.ProductFlavor;
import app.chalo.data.CityClusterConfiguration;
import app.chalo.data.ClusterConfig;
import app.chalo.features.chaloconfig.ChaloConfigFeature;
import app.chalo.network.config.ChaloJson;
import java.util.LinkedHashMap;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.sync.Mutex;
import kotlinx.coroutines.sync.MutexImpl;
import kotlinx.serialization.json.Json;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "Lapp/chalo/data/ClusterConfig;", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "app.chalo.domain.GetClusterConfigForCityUseCase$invoke$2", f = "GetClusterConfigForCityUseCase.kt", l = {101, 43, 47, 51}, m = "invokeSuspend", v = 1)
final class GetClusterConfigForCityUseCase$invoke$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super ClusterConfig>, Object> {
    final /* synthetic */ String $cityId;
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    final /* synthetic */ GetClusterConfigForCityUseCase this$0;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f2494a;

        static {
            int[] iArr = new int[ProductFlavor.values().length];
            try {
                iArr[ProductFlavor.PRIMARY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ProductFlavor.BETA.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ProductFlavor.ALPHA.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f2494a = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GetClusterConfigForCityUseCase$invoke$2(GetClusterConfigForCityUseCase getClusterConfigForCityUseCase, String str, Continuation continuation) {
        super(2, continuation);
        this.this$0 = getClusterConfigForCityUseCase;
        this.$cityId = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new GetClusterConfigForCityUseCase$invoke$2(this.this$0, this.$cityId, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((GetClusterConfigForCityUseCase$invoke$2) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f17538a);
    }

    /* JADX WARN: Code duplicated, block: B:63:0x0140 A[Catch: all -> 0x002a, Exception -> 0x016b, TryCatch #1 {Exception -> 0x016b, blocks: (B:60:0x011f, B:61:0x013a, B:63:0x0140, B:65:0x014e, B:70:0x016d), top: B:79:0x011f, outer: #2 }] */
    /* JADX WARN: Code duplicated, block: B:81:0x014e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:83:? A[LOOP:0: B:61:0x013a->B:83:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [int] */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v12, types: [kotlinx.coroutines.sync.Mutex] */
    /* JADX WARN: Type inference failed for: r3v2, types: [kotlinx.coroutines.sync.Mutex] */
    /* JADX WARN: Type inference failed for: r3v23 */
    /* JADX WARN: Type inference failed for: r3v24 */
    /* JADX WARN: Type inference failed for: r3v25 */
    /* JADX WARN: Type inference failed for: r3v6 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        GetClusterConfigForCityUseCase getClusterConfigForCityUseCase;
        Mutex mutex;
        String str;
        GetClusterConfigForCityUseCase getClusterConfigForCityUseCase2;
        String str2;
        Mutex mutex2;
        Mutex mutex3;
        Mutex mutex4;
        String str3;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        ?? r3 = this.label;
        try {
            try {
                if (r3 == 0) {
                    ResultKt.b(obj);
                    getClusterConfigForCityUseCase = this.this$0;
                    MutexImpl mutexImpl = getClusterConfigForCityUseCase.g;
                    String str4 = this.$cityId;
                    this.L$0 = mutexImpl;
                    this.L$1 = getClusterConfigForCityUseCase;
                    this.L$2 = str4;
                    this.label = 1;
                    if (mutexImpl.a(this) != coroutineSingletons) {
                        mutex = mutexImpl;
                        str = str4;
                    }
                    return coroutineSingletons;
                }
                if (r3 != 1) {
                    if (r3 == 2) {
                        str2 = (String) this.L$2;
                        getClusterConfigForCityUseCase2 = (GetClusterConfigForCityUseCase) this.L$1;
                        Mutex mutex5 = (Mutex) this.L$0;
                        ResultKt.b(obj);
                        mutex4 = mutex5;
                        str3 = (String) obj;
                        r3 = mutex4;
                        String message = "cityClusterConfigurationString: " + str3;
                        Intrinsics.i(message, "message");
                        Json json = ChaloJson.b;
                        json.getClass();
                        for (ClusterConfig clusterConfig : ((CityClusterConfiguration) json.b(str3, CityClusterConfiguration.INSTANCE.serializer())).f2338a) {
                            if (clusterConfig.b.contains(str2)) {
                                getClusterConfigForCityUseCase2.f.put(str2, clusterConfig);
                                String message2 = "cityClusterConfig3: " + clusterConfig;
                                Intrinsics.i(message2, "message");
                                r3.e(null);
                                return clusterConfig;
                            }
                        }
                        getClusterConfigForCityUseCase2.f.put(str2, new ClusterConfig(str2, CollectionsKt.R(str2)));
                        String message3 = "cityClusterConfig4: " + new ClusterConfig(str2, CollectionsKt.R(str2));
                        Intrinsics.i(message3, "message");
                        ClusterConfig clusterConfig2 = new ClusterConfig(str2, CollectionsKt.R(str2));
                        r3.e(null);
                        return clusterConfig2;
                    }
                    if (r3 == 3) {
                        str2 = (String) this.L$2;
                        getClusterConfigForCityUseCase2 = (GetClusterConfigForCityUseCase) this.L$1;
                        Mutex mutex6 = (Mutex) this.L$0;
                        ResultKt.b(obj);
                        mutex2 = mutex6;
                        str3 = (String) obj;
                        r3 = mutex2;
                        String message4 = "cityClusterConfigurationString: " + str3;
                        Intrinsics.i(message4, "message");
                        Json json2 = ChaloJson.b;
                        json2.getClass();
                        while (r14.hasNext()) {
                            if (clusterConfig.b.contains(str2)) {
                                getClusterConfigForCityUseCase2.f.put(str2, clusterConfig);
                                String message5 = "cityClusterConfig3: " + clusterConfig;
                                Intrinsics.i(message5, "message");
                                r3.e(null);
                                return clusterConfig;
                            }
                        }
                        getClusterConfigForCityUseCase2.f.put(str2, new ClusterConfig(str2, CollectionsKt.R(str2)));
                        String message6 = "cityClusterConfig4: " + new ClusterConfig(str2, CollectionsKt.R(str2));
                        Intrinsics.i(message6, "message");
                        ClusterConfig clusterConfig3 = new ClusterConfig(str2, CollectionsKt.R(str2));
                        r3.e(null);
                        return clusterConfig3;
                    }
                    if (r3 != 4) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    str2 = (String) this.L$2;
                    getClusterConfigForCityUseCase2 = (GetClusterConfigForCityUseCase) this.L$1;
                    Mutex mutex7 = (Mutex) this.L$0;
                    ResultKt.b(obj);
                    mutex3 = mutex7;
                    str3 = (String) obj;
                    r3 = mutex3;
                    String message7 = "cityClusterConfigurationString: " + str3;
                    Intrinsics.i(message7, "message");
                    try {
                        Json json3 = ChaloJson.b;
                        json3.getClass();
                        while (r14.hasNext()) {
                            if (clusterConfig.b.contains(str2)) {
                                getClusterConfigForCityUseCase2.f.put(str2, clusterConfig);
                                String message8 = "cityClusterConfig3: " + clusterConfig;
                                Intrinsics.i(message8, "message");
                                r3.e(null);
                                return clusterConfig;
                            }
                        }
                        getClusterConfigForCityUseCase2.f.put(str2, new ClusterConfig(str2, CollectionsKt.R(str2)));
                        String message9 = "cityClusterConfig4: " + new ClusterConfig(str2, CollectionsKt.R(str2));
                        Intrinsics.i(message9, "message");
                        ClusterConfig clusterConfig4 = new ClusterConfig(str2, CollectionsKt.R(str2));
                        r3.e(null);
                        return clusterConfig4;
                    } catch (Exception e) {
                        getClusterConfigForCityUseCase2.e.i(e);
                        String message10 = "cityClusterConfig5 exception = " + e.getMessage() + " config =  : " + new ClusterConfig(str2, CollectionsKt.R(str2));
                        Intrinsics.i(message10, "message");
                        ClusterConfig clusterConfig5 = new ClusterConfig(str2, CollectionsKt.R(str2));
                        r3.e(null);
                        return clusterConfig5;
                    }
                }
                str = (String) this.L$2;
                GetClusterConfigForCityUseCase getClusterConfigForCityUseCase3 = (GetClusterConfigForCityUseCase) this.L$1;
                mutex = (Mutex) this.L$0;
                ResultKt.b(obj);
                getClusterConfigForCityUseCase = getClusterConfigForCityUseCase3;
                LinkedHashMap linkedHashMap = getClusterConfigForCityUseCase.f;
                ChaloConfigFeature chaloConfigFeature = getClusterConfigForCityUseCase.f2493a;
                ClusterConfig clusterConfig6 = (ClusterConfig) linkedHashMap.get(str);
                if (clusterConfig6 != null) {
                    String message11 = "cityClusterConfig2: " + clusterConfig6;
                    Intrinsics.i(message11, "message");
                    mutex.e(null);
                    return clusterConfig6;
                }
                if (getClusterConfigForCityUseCase.b.f()) {
                    this.L$0 = mutex;
                    this.L$1 = getClusterConfigForCityUseCase;
                    this.L$2 = str;
                    this.label = 2;
                    Object objA = chaloConfigFeature.a("cityClusterConfigurationDev", this);
                    if (objA != coroutineSingletons) {
                        getClusterConfigForCityUseCase2 = getClusterConfigForCityUseCase;
                        obj = objA;
                        str2 = str;
                        mutex4 = mutex;
                        str3 = (String) obj;
                        r3 = mutex4;
                        String message12 = "cityClusterConfigurationString: " + str3;
                        Intrinsics.i(message12, "message");
                        Json json4 = ChaloJson.b;
                        json4.getClass();
                        while (r14.hasNext()) {
                            if (clusterConfig.b.contains(str2)) {
                                getClusterConfigForCityUseCase2.f.put(str2, clusterConfig);
                                String message13 = "cityClusterConfig3: " + clusterConfig;
                                Intrinsics.i(message13, "message");
                                r3.e(null);
                                return clusterConfig;
                            }
                        }
                        getClusterConfigForCityUseCase2.f.put(str2, new ClusterConfig(str2, CollectionsKt.R(str2)));
                        String message14 = "cityClusterConfig4: " + new ClusterConfig(str2, CollectionsKt.R(str2));
                        Intrinsics.i(message14, "message");
                        ClusterConfig clusterConfig7 = new ClusterConfig(str2, CollectionsKt.R(str2));
                        r3.e(null);
                        return clusterConfig7;
                    }
                } else {
                    int i = WhenMappings.f2494a[getClusterConfigForCityUseCase.c.getB().ordinal()];
                    if (i != 1) {
                        if (i != 2 && i != 3) {
                            throw new NoWhenBranchMatchedException();
                        }
                        this.L$0 = mutex;
                        this.L$1 = getClusterConfigForCityUseCase;
                        this.L$2 = str;
                        this.label = 4;
                        Object objA2 = chaloConfigFeature.a("cityClusterConfigurationBeta", this);
                        if (objA2 != coroutineSingletons) {
                            getClusterConfigForCityUseCase2 = getClusterConfigForCityUseCase;
                            obj = objA2;
                            str2 = str;
                            mutex3 = mutex;
                            str3 = (String) obj;
                            r3 = mutex3;
                            String message15 = "cityClusterConfigurationString: " + str3;
                            Intrinsics.i(message15, "message");
                            Json json5 = ChaloJson.b;
                            json5.getClass();
                            while (r14.hasNext()) {
                                if (clusterConfig.b.contains(str2)) {
                                    getClusterConfigForCityUseCase2.f.put(str2, clusterConfig);
                                    String message16 = "cityClusterConfig3: " + clusterConfig;
                                    Intrinsics.i(message16, "message");
                                    r3.e(null);
                                    return clusterConfig;
                                }
                            }
                            getClusterConfigForCityUseCase2.f.put(str2, new ClusterConfig(str2, CollectionsKt.R(str2)));
                            String message17 = "cityClusterConfig4: " + new ClusterConfig(str2, CollectionsKt.R(str2));
                            Intrinsics.i(message17, "message");
                            ClusterConfig clusterConfig8 = new ClusterConfig(str2, CollectionsKt.R(str2));
                            r3.e(null);
                            return clusterConfig8;
                        }
                    } else {
                        this.L$0 = mutex;
                        this.L$1 = getClusterConfigForCityUseCase;
                        this.L$2 = str;
                        this.label = 3;
                        Object objA3 = chaloConfigFeature.a("cityClusterConfigurationProd", this);
                        if (objA3 != coroutineSingletons) {
                            getClusterConfigForCityUseCase2 = getClusterConfigForCityUseCase;
                            obj = objA3;
                            str2 = str;
                            mutex2 = mutex;
                            str3 = (String) obj;
                            r3 = mutex2;
                            String message18 = "cityClusterConfigurationString: " + str3;
                            Intrinsics.i(message18, "message");
                            Json json6 = ChaloJson.b;
                            json6.getClass();
                            while (r14.hasNext()) {
                                if (clusterConfig.b.contains(str2)) {
                                    getClusterConfigForCityUseCase2.f.put(str2, clusterConfig);
                                    String message19 = "cityClusterConfig3: " + clusterConfig;
                                    Intrinsics.i(message19, "message");
                                    r3.e(null);
                                    return clusterConfig;
                                }
                            }
                            getClusterConfigForCityUseCase2.f.put(str2, new ClusterConfig(str2, CollectionsKt.R(str2)));
                            String message110 = "cityClusterConfig4: " + new ClusterConfig(str2, CollectionsKt.R(str2));
                            Intrinsics.i(message110, "message");
                            ClusterConfig clusterConfig9 = new ClusterConfig(str2, CollectionsKt.R(str2));
                            r3.e(null);
                            return clusterConfig9;
                        }
                    }
                }
                return coroutineSingletons;
            } catch (Throwable th) {
                th = th;
                r3 = mutex;
                r3.e(null);
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            r3.e(null);
            throw th;
        }
    }
}
