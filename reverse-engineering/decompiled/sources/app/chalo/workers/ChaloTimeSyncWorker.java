package app.chalo.workers;

import android.content.Context;
import androidx.work.CoroutineWorker;
import androidx.work.WorkerParameters;
import app.chalo.worker.BackgroundWorkerResultMapperKt;
import app.chalo.worker.BackgroundWorkerTaskDelegate;
import app.chalo.worker.BackgroundWorkerTaskResult;
import in.juspay.hyper.constants.LogCategory;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import org.koin.core.Koin;
import org.koin.core.component.KoinComponent;
import org.koin.core.component.KoinScopeComponent;
import org.koin.core.context.GlobalContext;
import org.koin.core.qualifier.StringQualifier;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\tB\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\b¨\u0006\n"}, d2 = {"Lapp/chalo/workers/ChaloTimeSyncWorker;", "Landroidx/work/CoroutineWorker;", "Lorg/koin/core/component/KoinComponent;", "Landroid/content/Context;", LogCategory.CONTEXT, "Landroidx/work/WorkerParameters;", "params", "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;)V", "Companion", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class ChaloTimeSyncWorker extends CoroutineWorker implements KoinComponent {
    public static final Companion b = new Companion();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f11119a;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004¨\u0006\u0006"}, d2 = {"Lapp/chalo/workers/ChaloTimeSyncWorker$Companion;", "", "", "PERIODIC_CHALO_TIME_BACKGROUND_SYNC_WORK_ID", "Ljava/lang/String;", "PERIODIC_CHALO_TIME_BACKGROUND_SYNC_WORK_TAG", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        /* JADX WARN: Code restructure failed: missing block: B:21:0x0099, code lost:
        
            if (app.chalo.utils.ContextExtsKt.a(r2, "chaloTimeBackgroundSyncWorkTag", r4, r0) == r1) goto L22;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object a(android.content.Context r10, kotlin.coroutines.Continuation r11) {
            /*
                r9 = this;
                boolean r0 = r11 instanceof app.chalo.workers.ChaloTimeSyncWorker$Companion$setupChaloTimeBackgroundSyncRequest$1
                if (r0 == 0) goto L13
                r0 = r11
                app.chalo.workers.ChaloTimeSyncWorker$Companion$setupChaloTimeBackgroundSyncRequest$1 r0 = (app.chalo.workers.ChaloTimeSyncWorker$Companion$setupChaloTimeBackgroundSyncRequest$1) r0
                int r1 = r0.label
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.label = r1
                goto L18
            L13:
                app.chalo.workers.ChaloTimeSyncWorker$Companion$setupChaloTimeBackgroundSyncRequest$1 r0 = new app.chalo.workers.ChaloTimeSyncWorker$Companion$setupChaloTimeBackgroundSyncRequest$1
                r0.<init>(r9, r11)
            L18:
                java.lang.Object r11 = r0.result
                kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
                int r2 = r0.label
                r3 = 2
                r4 = 1
                if (r2 == 0) goto L3f
                if (r2 == r4) goto L33
                if (r2 != r3) goto L2b
                kotlin.ResultKt.b(r11)
                goto L9c
            L2b:
                java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
                java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
                r10.<init>(r11)
                throw r10
            L33:
                java.lang.Object r10 = r0.L$1
                androidx.work.Constraints r10 = (androidx.work.Constraints) r10
                java.lang.Object r2 = r0.L$0
                android.content.Context r2 = (android.content.Context) r2
                kotlin.ResultKt.b(r11)
                goto L64
            L3f:
                kotlin.ResultKt.b(r11)
                androidx.work.Constraints$Builder r11 = new androidx.work.Constraints$Builder
                r11.<init>()
                androidx.work.NetworkType r2 = androidx.work.NetworkType.CONNECTED
                androidx.work.Constraints$Builder r11 = r11.setRequiredNetworkType(r2)
                androidx.work.Constraints r11 = r11.build()
                app.chalo.superpass.utils.ChaloConfigUtils r2 = app.chalo.superpass.utils.ChaloConfigUtils.f9611a
                r0.L$0 = r10
                r0.L$1 = r11
                r0.label = r4
                java.lang.Object r2 = r2.b(r0)
                if (r2 != r1) goto L60
                goto L9b
            L60:
                r8 = r2
                r2 = r10
                r10 = r11
                r11 = r8
            L64:
                java.lang.Number r11 = (java.lang.Number) r11
                long r4 = r11.longValue()
                java.util.concurrent.TimeUnit r11 = java.util.concurrent.TimeUnit.MINUTES
                androidx.work.PeriodicWorkRequest$Builder r6 = new androidx.work.PeriodicWorkRequest$Builder
                java.lang.Class<app.chalo.workers.ChaloTimeSyncWorker> r7 = app.chalo.workers.ChaloTimeSyncWorker.class
                r6.<init>(r7, r4, r11)
                java.lang.String r11 = "chaloTimeBackgroundSyncWorkTag"
                androidx.work.WorkRequest$Builder r4 = r6.addTag(r11)
                androidx.work.PeriodicWorkRequest$Builder r4 = (androidx.work.PeriodicWorkRequest.Builder) r4
                androidx.work.WorkRequest$Builder r10 = r4.setConstraints(r10)
                androidx.work.PeriodicWorkRequest$Builder r10 = (androidx.work.PeriodicWorkRequest.Builder) r10
                androidx.work.WorkRequest r10 = r10.build()
                androidx.work.PeriodicWorkRequest r10 = (androidx.work.PeriodicWorkRequest) r10
                ti r4 = new ti
                r5 = 8
                r4.<init>(r5, r2, r10)
                r10 = 0
                r0.L$0 = r10
                r0.L$1 = r10
                r0.label = r3
                java.lang.Object r10 = app.chalo.utils.ContextExtsKt.a(r2, r11, r4, r0)
                if (r10 != r1) goto L9c
            L9b:
                return r1
            L9c:
                kotlin.Unit r10 = kotlin.Unit.f17538a
                return r10
            */
            throw new UnsupportedOperationException("Method not decompiled: app.chalo.workers.ChaloTimeSyncWorker.Companion.a(android.content.Context, kotlin.coroutines.Continuation):java.lang.Object");
        }
    }

    /* JADX INFO: renamed from: app.chalo.workers.ChaloTimeSyncWorker$doWork$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "app.chalo.workers.ChaloTimeSyncWorker", f = "ChaloTimeSyncWorker.kt", l = {29}, m = "doWork", v = 1)
    final class AnonymousClass1 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        public AnonymousClass1(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return ChaloTimeSyncWorker.this.doWork(this);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChaloTimeSyncWorker(Context context, WorkerParameters params) {
        super(context, params);
        Intrinsics.i(context, "context");
        Intrinsics.i(params, "params");
        final StringQualifier stringQualifier = new StringQualifier("chalo_time_sync_worker_task");
        this.f11119a = LazyKt.a(LazyThreadSafetyMode.SYNCHRONIZED, new Function0<BackgroundWorkerTaskDelegate>() { // from class: app.chalo.workers.ChaloTimeSyncWorker$special$$inlined$inject$default$1
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                Object obj = this.f11120a;
                boolean z = obj instanceof KoinScopeComponent;
                return (z ? ((KoinScopeComponent) obj).i0() : GlobalContext.f18817a.a().c.d).d(Reflection.a(BackgroundWorkerTaskDelegate.class), null, stringQualifier);
            }
        });
    }

    @Override // org.koin.core.component.KoinComponent
    public final Koin L() {
        return GlobalContext.f18817a.a();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r5v2, types: [java.lang.Object, kotlin.Lazy] */
    @Override // androidx.work.CoroutineWorker
    public final Object doWork(Continuation continuation) {
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
        Object objA = anonymousClass1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = anonymousClass1.label;
        if (i2 == 0) {
            ResultKt.b(objA);
            BackgroundWorkerTaskDelegate backgroundWorkerTaskDelegate = (BackgroundWorkerTaskDelegate) this.f11119a.getValue();
            anonymousClass1.label = 1;
            objA = backgroundWorkerTaskDelegate.a(anonymousClass1);
            if (objA == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(objA);
        }
        return BackgroundWorkerResultMapperKt.a((BackgroundWorkerTaskResult) objA);
    }
}
