package app.chalo.features.chaloconfig.data;

import app.chalo.features.chaloconfig.ChaloConfigCacheStatus;
import app.chalo.features.chaloconfig.data.local.ChaloConfigLocalDataSource;
import app.chalo.features.chaloconfig.data.remote.ChaloConfigRemoteDataSource;
import app.chalo.features.chaloconfig.domain.GetChaloConfigDataKeyForLanguageUseCase;
import app.chalo.features.language.data.Language;
import com.amazon.aps.shared.metrics.model.ApsMetricsDataMap;
import defpackage.vo1;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lapp/chalo/features/chaloconfig/data/ChaloConfigRepositoryImpl;", "Lapp/chalo/features/chaloconfig/data/ChaloConfigRepository;", "Companion", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class ChaloConfigRepositoryImpl implements ChaloConfigRepository {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ChaloConfigLocalDataSource f2631a;
    public final ChaloConfigRemoteDataSource b;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0004R\u0014\u0010\u0007\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0004R\u0014\u0010\b\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\u0004¨\u0006\t"}, d2 = {"Lapp/chalo/features/chaloconfig/data/ChaloConfigRepositoryImpl$Companion;", "", "", "CHALO_CONFIG_DATA_STORE_NAME", "Ljava/lang/String;", "KEY_LAST_CACHED_AT_TIME", "KEY_CACHE_LANGUAGE", "KEY_CACHED_ETAG", "KEY_CACHE_STATUS", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
    }

    public ChaloConfigRepositoryImpl(ChaloConfigLocalDataSource chaloConfigLocalDataSource, ChaloConfigRemoteDataSource chaloConfigRemoteDataSource, GetChaloConfigDataKeyForLanguageUseCase getChaloConfigDataKeyForLanguageUseCase) {
        this.f2631a = chaloConfigLocalDataSource;
        this.b = chaloConfigRemoteDataSource;
    }

    public static String q(Language language) {
        return vo1.m("keyCachedEtag_", language.name());
    }

    @Override // app.chalo.features.chaloconfig.data.ChaloConfigRepository
    public final Object a(Language language, Continuation continuation) {
        Object objD = this.f2631a.d("keyCacheLanguage", language.name(), (ContinuationImpl) continuation);
        return objD == CoroutineSingletons.COROUTINE_SUSPENDED ? objD : Unit.f17538a;
    }

    @Override // app.chalo.features.chaloconfig.data.ChaloConfigRepository
    public final Object b(long j, Continuation continuation) {
        Object objD = this.f2631a.d("keyLastCachedAtTime", String.valueOf(j), (ContinuationImpl) continuation);
        return objD == CoroutineSingletons.COROUTINE_SUSPENDED ? objD : Unit.f17538a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // app.chalo.features.chaloconfig.data.ChaloConfigRepository
    public final Object c(Language language, ContinuationImpl continuationImpl) {
        ChaloConfigRepositoryImpl$getCachedEtag$1 chaloConfigRepositoryImpl$getCachedEtag$1;
        if (continuationImpl instanceof ChaloConfigRepositoryImpl$getCachedEtag$1) {
            chaloConfigRepositoryImpl$getCachedEtag$1 = (ChaloConfigRepositoryImpl$getCachedEtag$1) continuationImpl;
            int i = chaloConfigRepositoryImpl$getCachedEtag$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                chaloConfigRepositoryImpl$getCachedEtag$1.label = i - Integer.MIN_VALUE;
            } else {
                chaloConfigRepositoryImpl$getCachedEtag$1 = new ChaloConfigRepositoryImpl$getCachedEtag$1(this, continuationImpl);
            }
        } else {
            chaloConfigRepositoryImpl$getCachedEtag$1 = new ChaloConfigRepositoryImpl$getCachedEtag$1(this, continuationImpl);
        }
        Object objC = chaloConfigRepositoryImpl$getCachedEtag$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = chaloConfigRepositoryImpl$getCachedEtag$1.label;
        try {
            if (i2 == 0) {
                ResultKt.b(objC);
                String strQ = q(language);
                ChaloConfigLocalDataSource chaloConfigLocalDataSource = this.f2631a;
                chaloConfigRepositoryImpl$getCachedEtag$1.label = 1;
                objC = chaloConfigLocalDataSource.c(strQ, chaloConfigRepositoryImpl$getCachedEtag$1);
                if (objC == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.b(objC);
            }
            return (String) objC;
        } catch (IllegalArgumentException unused) {
            return null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // app.chalo.features.chaloconfig.data.ChaloConfigRepository
    public final Object d(ContinuationImpl continuationImpl) {
        ChaloConfigRepositoryImpl$getCacheStatusAsFlow$1 chaloConfigRepositoryImpl$getCacheStatusAsFlow$1;
        if (continuationImpl instanceof ChaloConfigRepositoryImpl$getCacheStatusAsFlow$1) {
            chaloConfigRepositoryImpl$getCacheStatusAsFlow$1 = (ChaloConfigRepositoryImpl$getCacheStatusAsFlow$1) continuationImpl;
            int i = chaloConfigRepositoryImpl$getCacheStatusAsFlow$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                chaloConfigRepositoryImpl$getCacheStatusAsFlow$1.label = i - Integer.MIN_VALUE;
            } else {
                chaloConfigRepositoryImpl$getCacheStatusAsFlow$1 = new ChaloConfigRepositoryImpl$getCacheStatusAsFlow$1(this, continuationImpl);
            }
        } else {
            chaloConfigRepositoryImpl$getCacheStatusAsFlow$1 = new ChaloConfigRepositoryImpl$getCacheStatusAsFlow$1(this, continuationImpl);
        }
        Object objE = chaloConfigRepositoryImpl$getCacheStatusAsFlow$1.result;
        Object obj = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = chaloConfigRepositoryImpl$getCacheStatusAsFlow$1.label;
        if (i2 == 0) {
            ResultKt.b(objE);
            chaloConfigRepositoryImpl$getCacheStatusAsFlow$1.label = 1;
            objE = this.f2631a.e();
            if (objE == obj) {
                return obj;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(objE);
        }
        final Flow flow = (Flow) objE;
        return new Flow<ChaloConfigCacheStatus>() { // from class: app.chalo.features.chaloconfig.data.ChaloConfigRepositoryImpl$getCacheStatusAsFlow$$inlined$map$1

            /* JADX INFO: renamed from: app.chalo.features.chaloconfig.data.ChaloConfigRepositoryImpl$getCacheStatusAsFlow$$inlined$map$1$2, reason: invalid class name */
            /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
            @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
            public final class AnonymousClass2<T> implements FlowCollector {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final /* synthetic */ FlowCollector f2633a;

                /* JADX INFO: renamed from: app.chalo.features.chaloconfig.data.ChaloConfigRepositoryImpl$getCacheStatusAsFlow$$inlined$map$1$2$1, reason: invalid class name */
                @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
                @DebugMetadata(c = "app.chalo.features.chaloconfig.data.ChaloConfigRepositoryImpl$getCacheStatusAsFlow$$inlined$map$1$2", f = "ChaloConfigRepositoryImpl.kt", l = {50}, m = "emit", v = 1)
                public final class AnonymousClass1 extends ContinuationImpl {
                    Object L$0;
                    int label;
                    /* synthetic */ Object result;

                    public AnonymousClass1(Continuation continuation) {
                        super(continuation);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Object invokeSuspend(Object obj) {
                        this.result = obj;
                        this.label |= Integer.MIN_VALUE;
                        return AnonymousClass2.this.emit(null, this);
                    }
                }

                public AnonymousClass2(FlowCollector flowCollector) {
                    this.f2633a = flowCollector;
                }

                /* JADX WARN: Code duplicated, block: B:7:0x0013  */
                @Override // kotlinx.coroutines.flow.FlowCollector
                public final Object emit(Object obj, Continuation continuation) {
                    AnonymousClass1 anonymousClass1;
                    if (continuation instanceof AnonymousClass1) {
                        anonymousClass1 = (AnonymousClass1) continuation;
                        int i = anonymousClass1.label;
                        if ((i & Integer.MIN_VALUE) != 0) {
                            anonymousClass1.label = i - Integer.MIN_VALUE;
                        } else {
                            anonymousClass1 = new AnonymousClass1(continuation);
                        }
                    } else {
                        anonymousClass1 = new AnonymousClass1(continuation);
                    }
                    Object obj2 = anonymousClass1.result;
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    int i2 = anonymousClass1.label;
                    if (i2 == 0) {
                        ResultKt.b(obj2);
                        String str = (String) obj;
                        ChaloConfigCacheStatus chaloConfigCacheStatusValueOf = str != null ? ChaloConfigCacheStatus.valueOf(str) : null;
                        anonymousClass1.label = 1;
                        if (this.f2633a.emit(chaloConfigCacheStatusValueOf, anonymousClass1) == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                    } else {
                        if (i2 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.b(obj2);
                    }
                    return Unit.f17538a;
                }
            }

            @Override // kotlinx.coroutines.flow.Flow
            public final Object collect(FlowCollector flowCollector, Continuation continuation) {
                Object objCollect = flow.collect(new AnonymousClass2(flowCollector), continuation);
                return objCollect == CoroutineSingletons.COROUTINE_SUSPENDED ? objCollect : Unit.f17538a;
            }
        };
    }

    @Override // app.chalo.features.chaloconfig.data.ChaloConfigRepository
    public final Object e(String str, String str2, Continuation continuation) {
        Object objD = this.f2631a.d(str, str2, (ContinuationImpl) continuation);
        return objD == CoroutineSingletons.COROUTINE_SUSPENDED ? objD : Unit.f17538a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // app.chalo.features.chaloconfig.data.ChaloConfigRepository
    public final Object f(Language language, String str, Continuation continuation) {
        ChaloConfigRepositoryImpl$getString$1 chaloConfigRepositoryImpl$getString$1;
        if (continuation instanceof ChaloConfigRepositoryImpl$getString$1) {
            chaloConfigRepositoryImpl$getString$1 = (ChaloConfigRepositoryImpl$getString$1) continuation;
            int i = chaloConfigRepositoryImpl$getString$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                chaloConfigRepositoryImpl$getString$1.label = i - Integer.MIN_VALUE;
            } else {
                chaloConfigRepositoryImpl$getString$1 = new ChaloConfigRepositoryImpl$getString$1(this, continuation);
            }
        } else {
            chaloConfigRepositoryImpl$getString$1 = new ChaloConfigRepositoryImpl$getString$1(this, continuation);
        }
        Object objP = chaloConfigRepositoryImpl$getString$1.result;
        Object obj = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = chaloConfigRepositoryImpl$getString$1.label;
        if (i2 == 0) {
            ResultKt.b(objP);
            chaloConfigRepositoryImpl$getString$1.label = 1;
            objP = p(language, str, chaloConfigRepositoryImpl$getString$1);
            if (objP == obj) {
                return obj;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(objP);
        }
        return ((ChaloConfigString) objP).f2634a;
    }

    @Override // app.chalo.features.chaloconfig.data.ChaloConfigRepository
    public final Object g(ChaloConfigCacheStatus chaloConfigCacheStatus, ContinuationImpl continuationImpl) {
        Object objD = this.f2631a.d("keyCacheStatus", chaloConfigCacheStatus.name(), continuationImpl);
        return objD == CoroutineSingletons.COROUTINE_SUSPENDED ? objD : Unit.f17538a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // app.chalo.features.chaloconfig.data.ChaloConfigRepository
    public final Object h(Language language, String str, ContinuationImpl continuationImpl) {
        ChaloConfigRepositoryImpl$getLong$1 chaloConfigRepositoryImpl$getLong$1;
        Long lT0;
        if (continuationImpl instanceof ChaloConfigRepositoryImpl$getLong$1) {
            chaloConfigRepositoryImpl$getLong$1 = (ChaloConfigRepositoryImpl$getLong$1) continuationImpl;
            int i = chaloConfigRepositoryImpl$getLong$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                chaloConfigRepositoryImpl$getLong$1.label = i - Integer.MIN_VALUE;
            } else {
                chaloConfigRepositoryImpl$getLong$1 = new ChaloConfigRepositoryImpl$getLong$1(this, continuationImpl);
            }
        } else {
            chaloConfigRepositoryImpl$getLong$1 = new ChaloConfigRepositoryImpl$getLong$1(this, continuationImpl);
        }
        Object objR = chaloConfigRepositoryImpl$getLong$1.result;
        Object obj = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = chaloConfigRepositoryImpl$getLong$1.label;
        long jLongValue = 0;
        if (i2 == 0) {
            ResultKt.b(objR);
            if (str != null) {
                chaloConfigRepositoryImpl$getLong$1.label = 1;
                objR = r(language, str, chaloConfigRepositoryImpl$getLong$1);
                if (objR == obj) {
                    return obj;
                }
            }
            return new Long(jLongValue);
        }
        if (i2 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.b(objR);
        String str2 = (String) objR;
        if (str2 != null && (lT0 = StringsKt.t0(str2)) != null) {
            jLongValue = lT0.longValue();
        }
        return new Long(jLongValue);
    }

    @Override // app.chalo.features.chaloconfig.data.ChaloConfigRepository
    public final Object i(ArrayList arrayList, Language language, Continuation continuation) {
        ArrayList arrayList2 = new ArrayList();
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            String str = (String) obj;
            if (!Intrinsics.d(str, "keyCacheStatus") && !Intrinsics.d(str, "keyCacheLanguage") && !Intrinsics.d(str, "keyLastCachedAtTime") && !Intrinsics.d(str, q(language))) {
                arrayList2.add(obj);
            }
        }
        Object objA = this.f2631a.a(arrayList2, (ContinuationImpl) continuation);
        return objA == CoroutineSingletons.COROUTINE_SUSPENDED ? objA : Unit.f17538a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // app.chalo.features.chaloconfig.data.ChaloConfigRepository
    public final Enum j(ContinuationImpl continuationImpl) {
        ChaloConfigRepositoryImpl$getCacheLanguage$1 chaloConfigRepositoryImpl$getCacheLanguage$1;
        if (continuationImpl instanceof ChaloConfigRepositoryImpl$getCacheLanguage$1) {
            chaloConfigRepositoryImpl$getCacheLanguage$1 = (ChaloConfigRepositoryImpl$getCacheLanguage$1) continuationImpl;
            int i = chaloConfigRepositoryImpl$getCacheLanguage$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                chaloConfigRepositoryImpl$getCacheLanguage$1.label = i - Integer.MIN_VALUE;
            } else {
                chaloConfigRepositoryImpl$getCacheLanguage$1 = new ChaloConfigRepositoryImpl$getCacheLanguage$1(this, continuationImpl);
            }
        } else {
            chaloConfigRepositoryImpl$getCacheLanguage$1 = new ChaloConfigRepositoryImpl$getCacheLanguage$1(this, continuationImpl);
        }
        Object objC = chaloConfigRepositoryImpl$getCacheLanguage$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = chaloConfigRepositoryImpl$getCacheLanguage$1.label;
        try {
            if (i2 == 0) {
                ResultKt.b(objC);
                ChaloConfigLocalDataSource chaloConfigLocalDataSource = this.f2631a;
                chaloConfigRepositoryImpl$getCacheLanguage$1.label = 1;
                objC = chaloConfigLocalDataSource.c("keyCacheLanguage", chaloConfigRepositoryImpl$getCacheLanguage$1);
                if (objC == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.b(objC);
            }
            String str = (String) objC;
            if (str != null) {
                return Language.valueOf(str);
            }
            return null;
        } catch (IllegalArgumentException unused) {
            return null;
        }
    }

    @Override // app.chalo.features.chaloconfig.data.ChaloConfigRepository
    public final Object k(Language language, Continuation continuation) {
        Object objA = this.f2631a.a(CollectionsKt.R(q(language)), (ContinuationImpl) continuation);
        return objA == CoroutineSingletons.COROUTINE_SUSPENDED ? objA : Unit.f17538a;
    }

    @Override // app.chalo.features.chaloconfig.data.ChaloConfigRepository
    public final Object l(Language language, String str, Continuation continuation) {
        return this.b.a(language, str, (ContinuationImpl) continuation);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // app.chalo.features.chaloconfig.data.ChaloConfigRepository
    public final Object m(Language language, String str, ContinuationImpl continuationImpl) {
        ChaloConfigRepositoryImpl$getBoolean$1 chaloConfigRepositoryImpl$getBoolean$1;
        if (continuationImpl instanceof ChaloConfigRepositoryImpl$getBoolean$1) {
            chaloConfigRepositoryImpl$getBoolean$1 = (ChaloConfigRepositoryImpl$getBoolean$1) continuationImpl;
            int i = chaloConfigRepositoryImpl$getBoolean$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                chaloConfigRepositoryImpl$getBoolean$1.label = i - Integer.MIN_VALUE;
            } else {
                chaloConfigRepositoryImpl$getBoolean$1 = new ChaloConfigRepositoryImpl$getBoolean$1(this, continuationImpl);
            }
        } else {
            chaloConfigRepositoryImpl$getBoolean$1 = new ChaloConfigRepositoryImpl$getBoolean$1(this, continuationImpl);
        }
        Object objR = chaloConfigRepositoryImpl$getBoolean$1.result;
        Object obj = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = chaloConfigRepositoryImpl$getBoolean$1.label;
        boolean zEqualsIgnoreCase = false;
        if (i2 == 0) {
            ResultKt.b(objR);
            if (str != null) {
                chaloConfigRepositoryImpl$getBoolean$1.label = 1;
                objR = r(language, str, chaloConfigRepositoryImpl$getBoolean$1);
                if (objR == obj) {
                    return obj;
                }
            }
            return Boolean.valueOf(zEqualsIgnoreCase);
        }
        if (i2 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.b(objR);
        String str2 = (String) objR;
        if (str2 != null) {
            zEqualsIgnoreCase = (str2.equalsIgnoreCase("1") || str2.equalsIgnoreCase(ApsMetricsDataMap.APSMETRICS_FIELD_TIMESTAMP) || str2.equalsIgnoreCase("true") || str2.equalsIgnoreCase("yes") || str2.equalsIgnoreCase("y")) ? true : str2.equalsIgnoreCase("on");
        }
        return Boolean.valueOf(zEqualsIgnoreCase);
    }

    @Override // app.chalo.features.chaloconfig.data.ChaloConfigRepository
    public final Object n(Continuation continuation) {
        return this.f2631a.b((ContinuationImpl) continuation);
    }

    @Override // app.chalo.features.chaloconfig.data.ChaloConfigRepository
    public final Object o(Language language, String str, Continuation continuation) {
        Object objD = this.f2631a.d(q(language), str, (ContinuationImpl) continuation);
        return objD == CoroutineSingletons.COROUTINE_SUSPENDED ? objD : Unit.f17538a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x006d, code lost:
    
        if (r11 == r1) goto L29;
     */
    @Override // app.chalo.features.chaloconfig.data.ChaloConfigRepository
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object p(app.chalo.features.language.data.Language r9, java.lang.String r10, kotlin.coroutines.Continuation r11) {
        /*
            r8 = this;
            boolean r0 = r11 instanceof app.chalo.features.chaloconfig.data.ChaloConfigRepositoryImpl$getStringWithPresence$1
            if (r0 == 0) goto L13
            r0 = r11
            app.chalo.features.chaloconfig.data.ChaloConfigRepositoryImpl$getStringWithPresence$1 r0 = (app.chalo.features.chaloconfig.data.ChaloConfigRepositoryImpl$getStringWithPresence$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            app.chalo.features.chaloconfig.data.ChaloConfigRepositoryImpl$getStringWithPresence$1 r0 = new app.chalo.features.chaloconfig.data.ChaloConfigRepositoryImpl$getStringWithPresence$1
            r0.<init>(r8, r11)
        L18:
            java.lang.Object r11 = r0.result
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r2 = r0.label
            app.chalo.features.chaloconfig.data.local.ChaloConfigLocalDataSource r3 = r8.f2631a
            r4 = 0
            java.lang.String r5 = ""
            r6 = 2
            r7 = 1
            if (r2 == 0) goto L40
            if (r2 == r7) goto L37
            if (r2 != r6) goto L2f
            kotlin.ResultKt.b(r11)
            goto L70
        L2f:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L37:
            java.lang.Object r9 = r0.L$0
            r10 = r9
            java.lang.String r10 = (java.lang.String) r10
            kotlin.ResultKt.b(r11)
            goto L5a
        L40:
            kotlin.ResultKt.b(r11)
            if (r10 != 0) goto L4b
            app.chalo.features.chaloconfig.data.ChaloConfigString r9 = new app.chalo.features.chaloconfig.data.ChaloConfigString
            r9.<init>(r5, r4)
            return r9
        L4b:
            java.lang.String r9 = app.chalo.features.chaloconfig.domain.GetChaloConfigDataKeyForLanguageUseCase.a(r10, r9)
            r0.L$0 = r10
            r0.label = r7
            java.lang.Object r11 = r3.c(r9, r0)
            if (r11 != r1) goto L5a
            goto L6f
        L5a:
            java.lang.String r11 = (java.lang.String) r11
            if (r11 == 0) goto L64
            app.chalo.features.chaloconfig.data.ChaloConfigString r9 = new app.chalo.features.chaloconfig.data.ChaloConfigString
            r9.<init>(r11, r7)
            return r9
        L64:
            r9 = 0
            r0.L$0 = r9
            r0.label = r6
            java.lang.Object r11 = r3.c(r10, r0)
            if (r11 != r1) goto L70
        L6f:
            return r1
        L70:
            java.lang.String r11 = (java.lang.String) r11
            if (r11 == 0) goto L7a
            app.chalo.features.chaloconfig.data.ChaloConfigString r9 = new app.chalo.features.chaloconfig.data.ChaloConfigString
            r9.<init>(r11, r7)
            return r9
        L7a:
            app.chalo.features.chaloconfig.data.ChaloConfigString r9 = new app.chalo.features.chaloconfig.data.ChaloConfigString
            r9.<init>(r5, r4)
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: app.chalo.features.chaloconfig.data.ChaloConfigRepositoryImpl.p(app.chalo.features.language.data.Language, java.lang.String, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object r(Language language, String str, ContinuationImpl continuationImpl) {
        ChaloConfigRepositoryImpl$retrieveValueFromDatastore$1 chaloConfigRepositoryImpl$retrieveValueFromDatastore$1;
        if (continuationImpl instanceof ChaloConfigRepositoryImpl$retrieveValueFromDatastore$1) {
            chaloConfigRepositoryImpl$retrieveValueFromDatastore$1 = (ChaloConfigRepositoryImpl$retrieveValueFromDatastore$1) continuationImpl;
            int i = chaloConfigRepositoryImpl$retrieveValueFromDatastore$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                chaloConfigRepositoryImpl$retrieveValueFromDatastore$1.label = i - Integer.MIN_VALUE;
            } else {
                chaloConfigRepositoryImpl$retrieveValueFromDatastore$1 = new ChaloConfigRepositoryImpl$retrieveValueFromDatastore$1(this, continuationImpl);
            }
        } else {
            chaloConfigRepositoryImpl$retrieveValueFromDatastore$1 = new ChaloConfigRepositoryImpl$retrieveValueFromDatastore$1(this, continuationImpl);
        }
        Object objC = chaloConfigRepositoryImpl$retrieveValueFromDatastore$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = chaloConfigRepositoryImpl$retrieveValueFromDatastore$1.label;
        ChaloConfigLocalDataSource chaloConfigLocalDataSource = this.f2631a;
        if (i2 == 0) {
            ResultKt.b(objC);
            String strA = GetChaloConfigDataKeyForLanguageUseCase.a(str, language);
            chaloConfigRepositoryImpl$retrieveValueFromDatastore$1.L$0 = str;
            chaloConfigRepositoryImpl$retrieveValueFromDatastore$1.label = 1;
            objC = chaloConfigLocalDataSource.c(strA, chaloConfigRepositoryImpl$retrieveValueFromDatastore$1);
            if (objC != coroutineSingletons) {
            }
        }
        if (i2 != 1) {
            if (i2 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(objC);
            return objC;
        }
        str = (String) chaloConfigRepositoryImpl$retrieveValueFromDatastore$1.L$0;
        ResultKt.b(objC);
        String str2 = (String) objC;
        if (str2 != null) {
            return str2;
        }
        chaloConfigRepositoryImpl$retrieveValueFromDatastore$1.L$0 = null;
        chaloConfigRepositoryImpl$retrieveValueFromDatastore$1.label = 2;
        Object objC2 = chaloConfigLocalDataSource.c(str, chaloConfigRepositoryImpl$retrieveValueFromDatastore$1);
        return objC2 == coroutineSingletons ? coroutineSingletons : objC2;
    }
}
