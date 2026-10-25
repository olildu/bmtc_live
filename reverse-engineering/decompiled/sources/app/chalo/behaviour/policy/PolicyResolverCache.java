package app.chalo.behaviour.policy;

import app.chalo.features.chaloconfig.domain.ChaloConfigDataSnapshot;
import app.chalo.features.chaloconfig.domain.ChaloConfigDataSnapshotTracker;
import java.util.LinkedHashMap;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.sync.Mutex;
import kotlinx.coroutines.sync.MutexImpl;
import kotlinx.coroutines.sync.MutexKt;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/behaviour/policy/PolicyResolverCache;", "", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class PolicyResolverCache {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ChaloConfigDataSnapshotTracker f1021a;
    public final MutexImpl b = MutexKt.a();
    public final LinkedHashMap c = new LinkedHashMap();
    public long d;
    public final Flow e;

    public PolicyResolverCache(ChaloConfigDataSnapshotTracker chaloConfigDataSnapshotTracker) {
        this.f1021a = chaloConfigDataSnapshotTracker;
        this.d = chaloConfigDataSnapshotTracker.d().f2646a;
        final PolicyResolverCache$special$$inlined$filter$1 policyResolverCache$special$$inlined$filter$1 = new PolicyResolverCache$special$$inlined$filter$1(chaloConfigDataSnapshotTracker.b);
        this.e = FlowKt.m(new Flow<Long>() { // from class: app.chalo.behaviour.policy.PolicyResolverCache$special$$inlined$map$1

            /* JADX INFO: renamed from: app.chalo.behaviour.policy.PolicyResolverCache$special$$inlined$map$1$2, reason: invalid class name */
            /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
            @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
            public final class AnonymousClass2<T> implements FlowCollector {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final /* synthetic */ FlowCollector f1025a;

                /* JADX INFO: renamed from: app.chalo.behaviour.policy.PolicyResolverCache$special$$inlined$map$1$2$1, reason: invalid class name */
                @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
                @DebugMetadata(c = "app.chalo.behaviour.policy.PolicyResolverCache$special$$inlined$map$1$2", f = "PolicyResolverCache.kt", l = {50}, m = "emit", v = 1)
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
                    this.f1025a = flowCollector;
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
                        Long l = new Long(((ChaloConfigDataSnapshot) obj).f2646a);
                        anonymousClass1.label = 1;
                        if (this.f1025a.emit(l, anonymousClass1) == coroutineSingletons) {
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
                Object objCollect = policyResolverCache$special$$inlined$filter$1.collect(new AnonymousClass2(flowCollector), continuation);
                return objCollect == CoroutineSingletons.COROUTINE_SUSPENDED ? objCollect : Unit.f17538a;
            }
        });
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(String str, ChaloConfigDataSnapshot chaloConfigDataSnapshot, ContinuationImpl continuationImpl) {
        PolicyResolverCache$readCached$1 policyResolverCache$readCached$1;
        Mutex mutex;
        Object obj;
        if (continuationImpl instanceof PolicyResolverCache$readCached$1) {
            policyResolverCache$readCached$1 = (PolicyResolverCache$readCached$1) continuationImpl;
            int i = policyResolverCache$readCached$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                policyResolverCache$readCached$1.label = i - Integer.MIN_VALUE;
            } else {
                policyResolverCache$readCached$1 = new PolicyResolverCache$readCached$1(this, continuationImpl);
            }
        } else {
            policyResolverCache$readCached$1 = new PolicyResolverCache$readCached$1(this, continuationImpl);
        }
        Object obj2 = policyResolverCache$readCached$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = policyResolverCache$readCached$1.label;
        if (i2 == 0) {
            ResultKt.b(obj2);
            policyResolverCache$readCached$1.L$0 = str;
            policyResolverCache$readCached$1.L$1 = chaloConfigDataSnapshot;
            mutex = this.b;
            policyResolverCache$readCached$1.L$2 = mutex;
            policyResolverCache$readCached$1.label = 1;
            if (mutex.a(policyResolverCache$readCached$1) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            Mutex mutex2 = (Mutex) policyResolverCache$readCached$1.L$2;
            chaloConfigDataSnapshot = (ChaloConfigDataSnapshot) policyResolverCache$readCached$1.L$1;
            String str2 = (String) policyResolverCache$readCached$1.L$0;
            ResultKt.b(obj2);
            mutex = mutex2;
            str = str2;
        }
        try {
            boolean z = chaloConfigDataSnapshot.b;
            long j = chaloConfigDataSnapshot.f2646a;
            LinkedHashMap linkedHashMap = this.c;
            if (z && j > this.d) {
                linkedHashMap.clear();
                this.d = j;
            }
            if (!this.f1021a.d().equals(chaloConfigDataSnapshot) || (obj = linkedHashMap.get(str)) == null) {
                obj = null;
            }
            return obj;
        } finally {
            mutex.e(null);
        }
    }

    /* JADX WARN: Code duplicated, block: B:29:0x0093  */
    /* JADX WARN: Code duplicated, block: B:32:0x00a4  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x007c, code lost:
    
        if (r2 == r1) goto L36;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.lang.String r9, kotlin.jvm.functions.Function1 r10, kotlin.jvm.functions.Function1 r11, kotlin.coroutines.Continuation r12) {
        /*
            r8 = this;
            boolean r0 = r12 instanceof app.chalo.behaviour.policy.PolicyResolverCache$resolve$1
            if (r0 == 0) goto L13
            r0 = r12
            app.chalo.behaviour.policy.PolicyResolverCache$resolve$1 r0 = (app.chalo.behaviour.policy.PolicyResolverCache$resolve$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            app.chalo.behaviour.policy.PolicyResolverCache$resolve$1 r0 = new app.chalo.behaviour.policy.PolicyResolverCache$resolve$1
            r0.<init>(r8, r12)
        L18:
            java.lang.Object r12 = r0.result
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r2 = r0.label
            r3 = 3
            r4 = 2
            r5 = 1
            r6 = 0
            if (r2 == 0) goto L61
            if (r2 == r5) goto L48
            if (r2 == r4) goto L38
            if (r2 != r3) goto L30
            java.lang.Object r9 = r0.L$0
            kotlin.ResultKt.b(r12)
            return r9
        L30:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L38:
            java.lang.Object r9 = r0.L$2
            app.chalo.features.chaloconfig.domain.ChaloConfigDataSnapshot r9 = (app.chalo.features.chaloconfig.domain.ChaloConfigDataSnapshot) r9
            java.lang.Object r10 = r0.L$1
            kotlin.jvm.functions.Function1 r10 = (kotlin.jvm.functions.Function1) r10
            java.lang.Object r11 = r0.L$0
            java.lang.String r11 = (java.lang.String) r11
            kotlin.ResultKt.b(r12)
            goto L98
        L48:
            java.lang.Object r9 = r0.L$3
            app.chalo.features.chaloconfig.domain.ChaloConfigDataSnapshot r9 = (app.chalo.features.chaloconfig.domain.ChaloConfigDataSnapshot) r9
            java.lang.Object r10 = r0.L$2
            r11 = r10
            kotlin.jvm.functions.Function1 r11 = (kotlin.jvm.functions.Function1) r11
            java.lang.Object r10 = r0.L$1
            kotlin.jvm.functions.Function1 r10 = (kotlin.jvm.functions.Function1) r10
            java.lang.Object r2 = r0.L$0
            java.lang.String r2 = (java.lang.String) r2
            kotlin.ResultKt.b(r12)
            r7 = r12
            r12 = r9
            r9 = r2
            r2 = r7
            goto L7f
        L61:
            kotlin.ResultKt.b(r12)
            app.chalo.features.chaloconfig.domain.ChaloConfigDataSnapshotTracker r12 = r8.f1021a
            app.chalo.features.chaloconfig.domain.ChaloConfigDataSnapshot r12 = r12.d()
            boolean r2 = r12.b
            if (r2 == 0) goto L82
            r0.L$0 = r9
            r0.L$1 = r10
            r0.L$2 = r11
            r0.L$3 = r12
            r0.label = r5
            java.lang.Object r2 = r8.a(r9, r12, r0)
            if (r2 != r1) goto L7f
            goto Lb6
        L7f:
            if (r2 == 0) goto L82
            return r2
        L82:
            r0.L$0 = r9
            r0.L$1 = r11
            r0.L$2 = r12
            r0.L$3 = r6
            r0.label = r4
            java.lang.Object r10 = r10.invoke(r0)
            if (r10 != r1) goto L93
            goto Lb6
        L93:
            r7 = r11
            r11 = r9
            r9 = r12
            r12 = r10
            r10 = r7
        L98:
            app.chalo.behaviour.policy.PolicyConfigFetchResult r12 = (app.chalo.behaviour.policy.PolicyConfigFetchResult) r12
            app.chalo.behaviour.policy.PolicyRemoteConfig r2 = r12.c
            java.lang.Object r10 = r10.invoke(r2)
            boolean r2 = r9.b
            if (r2 == 0) goto Lb7
            boolean r12 = r12.b
            if (r12 == 0) goto Lb7
            r0.L$0 = r10
            r0.L$1 = r6
            r0.L$2 = r6
            r0.label = r3
            java.lang.Object r9 = r8.c(r11, r9, r10, r0)
            if (r9 != r1) goto Lb7
        Lb6:
            return r1
        Lb7:
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: app.chalo.behaviour.policy.PolicyResolverCache.b(java.lang.String, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function1, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object c(String str, ChaloConfigDataSnapshot chaloConfigDataSnapshot, Object obj, ContinuationImpl continuationImpl) {
        PolicyResolverCache$writeCached$1 policyResolverCache$writeCached$1;
        Mutex mutex;
        if (continuationImpl instanceof PolicyResolverCache$writeCached$1) {
            policyResolverCache$writeCached$1 = (PolicyResolverCache$writeCached$1) continuationImpl;
            int i = policyResolverCache$writeCached$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                policyResolverCache$writeCached$1.label = i - Integer.MIN_VALUE;
            } else {
                policyResolverCache$writeCached$1 = new PolicyResolverCache$writeCached$1(this, continuationImpl);
            }
        } else {
            policyResolverCache$writeCached$1 = new PolicyResolverCache$writeCached$1(this, continuationImpl);
        }
        Object obj2 = policyResolverCache$writeCached$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = policyResolverCache$writeCached$1.label;
        if (i2 == 0) {
            ResultKt.b(obj2);
            policyResolverCache$writeCached$1.L$0 = str;
            policyResolverCache$writeCached$1.L$1 = chaloConfigDataSnapshot;
            policyResolverCache$writeCached$1.L$2 = obj;
            mutex = this.b;
            policyResolverCache$writeCached$1.L$3 = mutex;
            policyResolverCache$writeCached$1.label = 1;
            if (mutex.a(policyResolverCache$writeCached$1) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            Mutex mutex2 = (Mutex) policyResolverCache$writeCached$1.L$3;
            obj = policyResolverCache$writeCached$1.L$2;
            chaloConfigDataSnapshot = (ChaloConfigDataSnapshot) policyResolverCache$writeCached$1.L$1;
            String str2 = (String) policyResolverCache$writeCached$1.L$0;
            ResultKt.b(obj2);
            mutex = mutex2;
            str = str2;
        }
        try {
            boolean z = chaloConfigDataSnapshot.b;
            long j = chaloConfigDataSnapshot.f2646a;
            LinkedHashMap linkedHashMap = this.c;
            if (z && j > this.d) {
                linkedHashMap.clear();
                this.d = j;
            }
            ChaloConfigDataSnapshot chaloConfigDataSnapshotD = this.f1021a.d();
            if (chaloConfigDataSnapshotD.b && chaloConfigDataSnapshotD.equals(chaloConfigDataSnapshot) && obj != null) {
                linkedHashMap.put(str, obj);
            }
            return Unit.f17538a;
        } finally {
            mutex.e(null);
        }
    }
}
