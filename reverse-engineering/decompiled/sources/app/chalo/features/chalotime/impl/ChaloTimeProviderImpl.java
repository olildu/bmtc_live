package app.chalo.features.chalotime.impl;

import app.chalo.features.chalotime.ChaloTimeProvider;
import app.chalo.features.chalotime.data.ChaloTimeRepository;
import app.chalo.utils.ElapsedRealTimeClock;
import app.chalo.utils.SystemHelper;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/features/chalotime/impl/ChaloTimeProviderImpl;", "Lapp/chalo/features/chalotime/ChaloTimeProvider;", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class ChaloTimeProviderImpl implements ChaloTimeProvider {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ChaloTimeRepository f2682a;
    public final SystemHelper b;

    public ChaloTimeProviderImpl(ChaloTimeRepository chaloTimeRepository, SystemHelper systemHelper) {
        this.f2682a = chaloTimeRepository;
        this.b = systemHelper;
    }

    @Override // app.chalo.features.chalotime.ChaloTimeProvider
    public final boolean a() {
        return ((Boolean) BuildersKt.e(EmptyCoroutineContext.f17583a, new ChaloTimeProviderImpl$isChaloTimeAvailableBlocking$1(this, null))).booleanValue();
    }

    /* JADX WARN: Code duplicated, block: B:24:0x0079 A[PHI: r8
      0x0079: PHI (r8v7 java.lang.Object) = (r8v6 java.lang.Object), (r8v1 java.lang.Object) binds: [B:22:0x0076, B:16:0x0058] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:27:0x0087  */
    /* JADX WARN: Code duplicated, block: B:31:0x0098 A[PHI: r2 r8
      0x0098: PHI (r2v8 java.lang.Long) = (r2v5 java.lang.Long), (r2v10 java.lang.Long) binds: [B:29:0x0095, B:14:0x0048] A[DONT_GENERATE, DONT_INLINE]
      0x0098: PHI (r8v13 java.lang.Object) = (r8v12 java.lang.Object), (r8v1 java.lang.Object) binds: [B:29:0x0095, B:14:0x0048] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:34:0x00a8  */
    /* JADX WARN: Code duplicated, block: B:38:0x00bb  */
    /* JADX WARN: Code duplicated, block: B:41:0x00c1 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:48:0x00e7 A[ADDED_TO_REGION, ORIG_RETURN, RETURN] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // app.chalo.features.chalotime.ChaloTimeProvider
    public final Object b(ContinuationImpl continuationImpl) {
        ChaloTimeProviderImpl$getChaloTime$1 chaloTimeProviderImpl$getChaloTime$1;
        Long l;
        Object objG;
        Long l2;
        Long l3;
        Object objF;
        Long l4;
        Long l5;
        Long l6;
        if (continuationImpl instanceof ChaloTimeProviderImpl$getChaloTime$1) {
            chaloTimeProviderImpl$getChaloTime$1 = (ChaloTimeProviderImpl$getChaloTime$1) continuationImpl;
            int i = chaloTimeProviderImpl$getChaloTime$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                chaloTimeProviderImpl$getChaloTime$1.label = i - Integer.MIN_VALUE;
            } else {
                chaloTimeProviderImpl$getChaloTime$1 = new ChaloTimeProviderImpl$getChaloTime$1(this, continuationImpl);
            }
        } else {
            chaloTimeProviderImpl$getChaloTime$1 = new ChaloTimeProviderImpl$getChaloTime$1(this, continuationImpl);
        }
        Object objE = chaloTimeProviderImpl$getChaloTime$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = chaloTimeProviderImpl$getChaloTime$1.label;
        ChaloTimeRepository chaloTimeRepository = this.f2682a;
        switch (i2) {
            case 0:
                ResultKt.b(objE);
                chaloTimeProviderImpl$getChaloTime$1.label = 1;
                objE = chaloTimeRepository.e(chaloTimeProviderImpl$getChaloTime$1);
                if (objE != coroutineSingletons) {
                    chaloTimeProviderImpl$getChaloTime$1.label = 2;
                    objE = FlowKt.v((Flow) objE, chaloTimeProviderImpl$getChaloTime$1);
                    if (objE != coroutineSingletons) {
                        l = (Long) objE;
                        chaloTimeProviderImpl$getChaloTime$1.L$0 = l;
                        chaloTimeProviderImpl$getChaloTime$1.label = 3;
                        objG = chaloTimeRepository.g(chaloTimeProviderImpl$getChaloTime$1);
                        if (objG != coroutineSingletons) {
                            l2 = l;
                            objE = objG;
                            chaloTimeProviderImpl$getChaloTime$1.L$0 = l2;
                            chaloTimeProviderImpl$getChaloTime$1.label = 4;
                            objE = FlowKt.v((Flow) objE, chaloTimeProviderImpl$getChaloTime$1);
                            if (objE != coroutineSingletons) {
                                l3 = (Long) objE;
                                chaloTimeProviderImpl$getChaloTime$1.L$0 = l2;
                                chaloTimeProviderImpl$getChaloTime$1.L$1 = l3;
                                chaloTimeProviderImpl$getChaloTime$1.label = 5;
                                objF = chaloTimeRepository.f(chaloTimeProviderImpl$getChaloTime$1);
                                if (objF != coroutineSingletons) {
                                    l4 = l3;
                                    objE = objF;
                                    chaloTimeProviderImpl$getChaloTime$1.L$0 = l2;
                                    chaloTimeProviderImpl$getChaloTime$1.L$1 = l4;
                                    chaloTimeProviderImpl$getChaloTime$1.label = 6;
                                    objE = FlowKt.v((Flow) objE, chaloTimeProviderImpl$getChaloTime$1);
                                    if (objE != coroutineSingletons) {
                                        l5 = l2;
                                        l6 = l4;
                                        String str = (String) objE;
                                        if (l5 != null || l6 == null) {
                                            return null;
                                        }
                                        ElapsedRealTimeClock.INSTANCE.getClass();
                                        ElapsedRealTimeClock elapsedRealTimeClockA = ElapsedRealTimeClock.Companion.a(str);
                                        if (elapsedRealTimeClockA == null) {
                                            elapsedRealTimeClockA = ElapsedRealTimeClock.LEGACY_UPTIME;
                                        }
                                        long jE = this.b.e(elapsedRealTimeClockA);
                                        return new Long((jE - l6.longValue()) + l5.longValue());
                                    }
                                }
                            }
                        }
                    }
                }
                return coroutineSingletons;
            case 1:
                ResultKt.b(objE);
                chaloTimeProviderImpl$getChaloTime$1.label = 2;
                objE = FlowKt.v((Flow) objE, chaloTimeProviderImpl$getChaloTime$1);
                if (objE != coroutineSingletons) {
                    l = (Long) objE;
                    chaloTimeProviderImpl$getChaloTime$1.L$0 = l;
                    chaloTimeProviderImpl$getChaloTime$1.label = 3;
                    objG = chaloTimeRepository.g(chaloTimeProviderImpl$getChaloTime$1);
                    if (objG != coroutineSingletons) {
                        l2 = l;
                        objE = objG;
                        chaloTimeProviderImpl$getChaloTime$1.L$0 = l2;
                        chaloTimeProviderImpl$getChaloTime$1.label = 4;
                        objE = FlowKt.v((Flow) objE, chaloTimeProviderImpl$getChaloTime$1);
                        if (objE != coroutineSingletons) {
                            l3 = (Long) objE;
                            chaloTimeProviderImpl$getChaloTime$1.L$0 = l2;
                            chaloTimeProviderImpl$getChaloTime$1.L$1 = l3;
                            chaloTimeProviderImpl$getChaloTime$1.label = 5;
                            objF = chaloTimeRepository.f(chaloTimeProviderImpl$getChaloTime$1);
                            if (objF != coroutineSingletons) {
                                l4 = l3;
                                objE = objF;
                                chaloTimeProviderImpl$getChaloTime$1.L$0 = l2;
                                chaloTimeProviderImpl$getChaloTime$1.L$1 = l4;
                                chaloTimeProviderImpl$getChaloTime$1.label = 6;
                                objE = FlowKt.v((Flow) objE, chaloTimeProviderImpl$getChaloTime$1);
                                if (objE != coroutineSingletons) {
                                    l5 = l2;
                                    l6 = l4;
                                    String str2 = (String) objE;
                                    if (l5 != null) {
                                        return null;
                                    }
                                    return null;
                                }
                            }
                        }
                    }
                }
                return coroutineSingletons;
            case 2:
                ResultKt.b(objE);
                l = (Long) objE;
                chaloTimeProviderImpl$getChaloTime$1.L$0 = l;
                chaloTimeProviderImpl$getChaloTime$1.label = 3;
                objG = chaloTimeRepository.g(chaloTimeProviderImpl$getChaloTime$1);
                if (objG != coroutineSingletons) {
                    l2 = l;
                    objE = objG;
                    chaloTimeProviderImpl$getChaloTime$1.L$0 = l2;
                    chaloTimeProviderImpl$getChaloTime$1.label = 4;
                    objE = FlowKt.v((Flow) objE, chaloTimeProviderImpl$getChaloTime$1);
                    if (objE != coroutineSingletons) {
                        l3 = (Long) objE;
                        chaloTimeProviderImpl$getChaloTime$1.L$0 = l2;
                        chaloTimeProviderImpl$getChaloTime$1.L$1 = l3;
                        chaloTimeProviderImpl$getChaloTime$1.label = 5;
                        objF = chaloTimeRepository.f(chaloTimeProviderImpl$getChaloTime$1);
                        if (objF != coroutineSingletons) {
                            l4 = l3;
                            objE = objF;
                            chaloTimeProviderImpl$getChaloTime$1.L$0 = l2;
                            chaloTimeProviderImpl$getChaloTime$1.L$1 = l4;
                            chaloTimeProviderImpl$getChaloTime$1.label = 6;
                            objE = FlowKt.v((Flow) objE, chaloTimeProviderImpl$getChaloTime$1);
                            if (objE != coroutineSingletons) {
                                l5 = l2;
                                l6 = l4;
                                String str3 = (String) objE;
                                if (l5 != null) {
                                    return null;
                                }
                                return null;
                            }
                        }
                    }
                }
                return coroutineSingletons;
            case 3:
                l2 = (Long) chaloTimeProviderImpl$getChaloTime$1.L$0;
                ResultKt.b(objE);
                chaloTimeProviderImpl$getChaloTime$1.L$0 = l2;
                chaloTimeProviderImpl$getChaloTime$1.label = 4;
                objE = FlowKt.v((Flow) objE, chaloTimeProviderImpl$getChaloTime$1);
                if (objE != coroutineSingletons) {
                    l3 = (Long) objE;
                    chaloTimeProviderImpl$getChaloTime$1.L$0 = l2;
                    chaloTimeProviderImpl$getChaloTime$1.L$1 = l3;
                    chaloTimeProviderImpl$getChaloTime$1.label = 5;
                    objF = chaloTimeRepository.f(chaloTimeProviderImpl$getChaloTime$1);
                    if (objF != coroutineSingletons) {
                        l4 = l3;
                        objE = objF;
                        chaloTimeProviderImpl$getChaloTime$1.L$0 = l2;
                        chaloTimeProviderImpl$getChaloTime$1.L$1 = l4;
                        chaloTimeProviderImpl$getChaloTime$1.label = 6;
                        objE = FlowKt.v((Flow) objE, chaloTimeProviderImpl$getChaloTime$1);
                        if (objE != coroutineSingletons) {
                            l5 = l2;
                            l6 = l4;
                            String str4 = (String) objE;
                            if (l5 != null) {
                                return null;
                            }
                            return null;
                        }
                    }
                }
                return coroutineSingletons;
            case 4:
                l2 = (Long) chaloTimeProviderImpl$getChaloTime$1.L$0;
                ResultKt.b(objE);
                l3 = (Long) objE;
                chaloTimeProviderImpl$getChaloTime$1.L$0 = l2;
                chaloTimeProviderImpl$getChaloTime$1.L$1 = l3;
                chaloTimeProviderImpl$getChaloTime$1.label = 5;
                objF = chaloTimeRepository.f(chaloTimeProviderImpl$getChaloTime$1);
                if (objF != coroutineSingletons) {
                    l4 = l3;
                    objE = objF;
                    chaloTimeProviderImpl$getChaloTime$1.L$0 = l2;
                    chaloTimeProviderImpl$getChaloTime$1.L$1 = l4;
                    chaloTimeProviderImpl$getChaloTime$1.label = 6;
                    objE = FlowKt.v((Flow) objE, chaloTimeProviderImpl$getChaloTime$1);
                    if (objE != coroutineSingletons) {
                        l5 = l2;
                        l6 = l4;
                        String str5 = (String) objE;
                        if (l5 != null) {
                            return null;
                        }
                        return null;
                    }
                }
                return coroutineSingletons;
            case 5:
                Long l7 = (Long) chaloTimeProviderImpl$getChaloTime$1.L$1;
                Long l8 = (Long) chaloTimeProviderImpl$getChaloTime$1.L$0;
                ResultKt.b(objE);
                l4 = l7;
                l2 = l8;
                chaloTimeProviderImpl$getChaloTime$1.L$0 = l2;
                chaloTimeProviderImpl$getChaloTime$1.L$1 = l4;
                chaloTimeProviderImpl$getChaloTime$1.label = 6;
                objE = FlowKt.v((Flow) objE, chaloTimeProviderImpl$getChaloTime$1);
                if (objE != coroutineSingletons) {
                    l5 = l2;
                    l6 = l4;
                    String str6 = (String) objE;
                    if (l5 != null) {
                        return null;
                    }
                    return null;
                }
                return coroutineSingletons;
            case 6:
                l6 = (Long) chaloTimeProviderImpl$getChaloTime$1.L$1;
                l5 = (Long) chaloTimeProviderImpl$getChaloTime$1.L$0;
                ResultKt.b(objE);
                String str7 = (String) objE;
                if (l5 != null) {
                    return null;
                }
                return null;
            default:
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // app.chalo.features.chalotime.ChaloTimeProvider
    public final Object c(ContinuationImpl continuationImpl) {
        ChaloTimeProviderImpl$isChaloTimeAvailable$1 chaloTimeProviderImpl$isChaloTimeAvailable$1;
        if (continuationImpl instanceof ChaloTimeProviderImpl$isChaloTimeAvailable$1) {
            chaloTimeProviderImpl$isChaloTimeAvailable$1 = (ChaloTimeProviderImpl$isChaloTimeAvailable$1) continuationImpl;
            int i = chaloTimeProviderImpl$isChaloTimeAvailable$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                chaloTimeProviderImpl$isChaloTimeAvailable$1.label = i - Integer.MIN_VALUE;
            } else {
                chaloTimeProviderImpl$isChaloTimeAvailable$1 = new ChaloTimeProviderImpl$isChaloTimeAvailable$1(this, continuationImpl);
            }
        } else {
            chaloTimeProviderImpl$isChaloTimeAvailable$1 = new ChaloTimeProviderImpl$isChaloTimeAvailable$1(this, continuationImpl);
        }
        Object objB = chaloTimeProviderImpl$isChaloTimeAvailable$1.result;
        Object obj = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = chaloTimeProviderImpl$isChaloTimeAvailable$1.label;
        if (i2 == 0) {
            ResultKt.b(objB);
            chaloTimeProviderImpl$isChaloTimeAvailable$1.label = 1;
            objB = b(chaloTimeProviderImpl$isChaloTimeAvailable$1);
            if (objB == obj) {
                return obj;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(objB);
        }
        return Boolean.valueOf(objB != null);
    }
}
