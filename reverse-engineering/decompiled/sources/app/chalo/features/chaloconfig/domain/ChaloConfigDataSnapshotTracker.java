package app.chalo.features.chaloconfig.domain;

import defpackage.uf0;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlowKt;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lapp/chalo/features/chaloconfig/domain/ChaloConfigDataSnapshotTracker;", "", "TrackerState", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class ChaloConfigDataSnapshotTracker {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final MutableStateFlow f2647a;
    public final Flow b;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0082\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/features/chaloconfig/domain/ChaloConfigDataSnapshotTracker$TrackerState;", "", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class TrackerState {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final long f2648a;
        public final boolean b;
        public final Long c;
        public final long d;

        public TrackerState(long j, boolean z, Long l, long j2) {
            this.f2648a = j;
            this.b = z;
            this.c = l;
            this.d = j2;
        }

        public static TrackerState a(TrackerState trackerState, long j, boolean z, Long l, long j2, int i) {
            if ((i & 1) != 0) {
                j = trackerState.f2648a;
            }
            long j3 = j;
            if ((i & 8) != 0) {
                j2 = trackerState.d;
            }
            trackerState.getClass();
            return new TrackerState(j3, z, l, j2);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof TrackerState)) {
                return false;
            }
            TrackerState trackerState = (TrackerState) obj;
            return this.f2648a == trackerState.f2648a && this.b == trackerState.b && Intrinsics.d(this.c, trackerState.c) && this.d == trackerState.d;
        }

        public final int hashCode() {
            long j = this.f2648a;
            int i = ((((int) (j ^ (j >>> 32))) * 31) + (this.b ? 1231 : 1237)) * 31;
            Long l = this.c;
            int iHashCode = l == null ? 0 : l.hashCode();
            long j2 = this.d;
            return ((i + iHashCode) * 31) + ((int) ((j2 >>> 32) ^ j2));
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("TrackerState(revision=");
            sb.append(this.f2648a);
            sb.append(", isStable=");
            sb.append(this.b);
            sb.append(", activeToken=");
            sb.append(this.c);
            sb.append(", nextToken=");
            return uf0.m(this.d, ")", sb);
        }
    }

    public ChaloConfigDataSnapshotTracker() {
        final MutableStateFlow mutableStateFlowA = StateFlowKt.a(new TrackerState(0L, true, null, 1L));
        this.f2647a = mutableStateFlowA;
        this.b = FlowKt.m(new Flow<ChaloConfigDataSnapshot>() { // from class: app.chalo.features.chaloconfig.domain.ChaloConfigDataSnapshotTracker$special$$inlined$map$1

            /* JADX INFO: renamed from: app.chalo.features.chaloconfig.domain.ChaloConfigDataSnapshotTracker$special$$inlined$map$1$2, reason: invalid class name */
            /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
            @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
            public final class AnonymousClass2<T> implements FlowCollector {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final /* synthetic */ FlowCollector f2650a;

                /* JADX INFO: renamed from: app.chalo.features.chaloconfig.domain.ChaloConfigDataSnapshotTracker$special$$inlined$map$1$2$1, reason: invalid class name */
                @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
                @DebugMetadata(c = "app.chalo.features.chaloconfig.domain.ChaloConfigDataSnapshotTracker$special$$inlined$map$1$2", f = "ChaloConfigDataSnapshotTracker.kt", l = {50}, m = "emit", v = 1)
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
                    this.f2650a = flowCollector;
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
                        ChaloConfigDataSnapshotTracker.TrackerState trackerState = (ChaloConfigDataSnapshotTracker.TrackerState) obj;
                        ChaloConfigDataSnapshot chaloConfigDataSnapshot = new ChaloConfigDataSnapshot(trackerState.f2648a, trackerState.b);
                        anonymousClass1.label = 1;
                        if (this.f2650a.emit(chaloConfigDataSnapshot, anonymousClass1) == coroutineSingletons) {
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
                Object objCollect = mutableStateFlowA.collect(new AnonymousClass2(flowCollector), continuation);
                return objCollect == CoroutineSingletons.COROUTINE_SUSPENDED ? objCollect : Unit.f17538a;
            }
        });
    }

    public final long a() {
        MutableStateFlow mutableStateFlow;
        TrackerState trackerState;
        long j;
        do {
            mutableStateFlow = this.f2647a;
            trackerState = (TrackerState) mutableStateFlow.getValue();
            j = trackerState.d;
        } while (!mutableStateFlow.c(trackerState, TrackerState.a(trackerState, 0L, false, Long.valueOf(j), j + 1, 1)));
        return j;
    }

    public final void b(long j) {
        MutableStateFlow mutableStateFlow;
        TrackerState trackerState;
        do {
            mutableStateFlow = this.f2647a;
            trackerState = (TrackerState) mutableStateFlow.getValue();
            Long l = trackerState.c;
            if (l == null || l.longValue() != j) {
                return;
            }
        } while (!mutableStateFlow.c(trackerState, TrackerState.a(trackerState, 0L, true, null, 0L, 9)));
    }

    public final void c(long j) {
        MutableStateFlow mutableStateFlow;
        TrackerState trackerState;
        do {
            mutableStateFlow = this.f2647a;
            trackerState = (TrackerState) mutableStateFlow.getValue();
            Long l = trackerState.c;
            if (l == null || l.longValue() != j) {
                return;
            }
        } while (!mutableStateFlow.c(trackerState, TrackerState.a(trackerState, trackerState.f2648a + 1, true, null, 0L, 8)));
    }

    public final ChaloConfigDataSnapshot d() {
        TrackerState trackerState = (TrackerState) this.f2647a.getValue();
        return new ChaloConfigDataSnapshot(trackerState.f2648a, trackerState.b);
    }
}
