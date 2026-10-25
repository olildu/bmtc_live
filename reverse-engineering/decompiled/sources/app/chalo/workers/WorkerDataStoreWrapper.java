package app.chalo.workers;

import androidx.datastore.preferences.core.PreferencesKeys;
import app.chalo.datastore.LocalDataStore;
import app.chalo.datastore.LocalDataStore$getFlowFromLocalDataStore$$inlined$map$1;
import app.chalo.worker.IWorkerDataStore;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lapp/chalo/workers/WorkerDataStoreWrapper;", "Lapp/chalo/worker/IWorkerDataStore;", "Companion", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class WorkerDataStoreWrapper implements IWorkerDataStore {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LocalDataStore f11130a;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004¨\u0006\u0006"}, d2 = {"Lapp/chalo/workers/WorkerDataStoreWrapper$Companion;", "", "", "SYNC_INTERVAL_PREF_KEY_SUFFIX", "Ljava/lang/String;", "WORKER_STORE_KEY", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
    }

    public WorkerDataStoreWrapper(LocalDataStore localDataStore) {
        this.f11130a = localDataStore;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [app.chalo.workers.WorkerDataStoreWrapper$getCurrentPeriodicSyncIntervalForWorker$$inlined$map$1] */
    @Override // app.chalo.worker.IWorkerDataStore
    public final WorkerDataStoreWrapper$getCurrentPeriodicSyncIntervalForWorker$$inlined$map$1 a() {
        final LocalDataStore$getFlowFromLocalDataStore$$inlined$map$1 localDataStore$getFlowFromLocalDataStore$$inlined$map$1E = this.f11130a.e(PreferencesKeys.longKey("EncrkeySyncWorkTag_sync_interval"));
        return new Flow<Long>() { // from class: app.chalo.workers.WorkerDataStoreWrapper$getCurrentPeriodicSyncIntervalForWorker$$inlined$map$1

            /* JADX INFO: renamed from: app.chalo.workers.WorkerDataStoreWrapper$getCurrentPeriodicSyncIntervalForWorker$$inlined$map$1$2, reason: invalid class name */
            /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
            @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
            public final class AnonymousClass2<T> implements FlowCollector {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final /* synthetic */ FlowCollector f11132a;

                /* JADX INFO: renamed from: app.chalo.workers.WorkerDataStoreWrapper$getCurrentPeriodicSyncIntervalForWorker$$inlined$map$1$2$1, reason: invalid class name */
                @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
                @DebugMetadata(c = "app.chalo.workers.WorkerDataStoreWrapper$getCurrentPeriodicSyncIntervalForWorker$$inlined$map$1$2", f = "WorkerDataStoreWrapper.kt", l = {50}, m = "emit", v = 1)
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
                    this.f11132a = flowCollector;
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
                        Long l = (Long) obj;
                        Long l2 = new Long(l != null ? l.longValue() : -1L);
                        anonymousClass1.label = 1;
                        if (this.f11132a.emit(l2, anonymousClass1) == coroutineSingletons) {
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
                Object objCollect = localDataStore$getFlowFromLocalDataStore$$inlined$map$1E.collect(new AnonymousClass2(flowCollector), continuation);
                return objCollect == CoroutineSingletons.COROUTINE_SUSPENDED ? objCollect : Unit.f17538a;
            }
        };
    }

    @Override // app.chalo.worker.IWorkerDataStore
    public final Object b(long j, Continuation continuation) {
        Object objG = this.f11130a.g(PreferencesKeys.longKey("EncrkeySyncWorkTag_sync_interval"), new Long(j), continuation);
        return objG == CoroutineSingletons.COROUTINE_SUSPENDED ? objG : Unit.f17538a;
    }
}
