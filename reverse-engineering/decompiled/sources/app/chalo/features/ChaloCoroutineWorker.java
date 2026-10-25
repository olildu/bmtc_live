package app.chalo.features;

import android.content.Context;
import androidx.work.CoroutineWorker;
import androidx.work.ListenableWorker;
import androidx.work.WorkerParameters;
import app.chalo.contract.AppUsageTrackingContract;
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

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b'\u0018\u00002\u00020\u00012\u00020\u0002B\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lapp/chalo/features/ChaloCoroutineWorker;", "Landroidx/work/CoroutineWorker;", "Lorg/koin/core/component/KoinComponent;", "Landroid/content/Context;", LogCategory.CONTEXT, "Landroidx/work/WorkerParameters;", "params", "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;)V", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class ChaloCoroutineWorker extends CoroutineWorker implements KoinComponent {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f2620a;

    /* JADX INFO: renamed from: app.chalo.features.ChaloCoroutineWorker$doWork$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "app.chalo.features.ChaloCoroutineWorker", f = "ChaloCoroutineWorker.kt", l = {18, 21}, m = "doWork$suspendImpl", v = 1)
    final class AnonymousClass1 extends ContinuationImpl {
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
            return ChaloCoroutineWorker.b(ChaloCoroutineWorker.this, this);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChaloCoroutineWorker(Context context, WorkerParameters params) {
        super(context, params);
        Intrinsics.i(context, "context");
        Intrinsics.i(params, "params");
        this.f2620a = LazyKt.a(LazyThreadSafetyMode.SYNCHRONIZED, new Function0<AppUsageTrackingContract>() { // from class: app.chalo.features.ChaloCoroutineWorker$special$$inlined$inject$default$1
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                Object obj = this.f2621a;
                return (obj instanceof KoinScopeComponent ? ((KoinScopeComponent) obj).getF18811a() : GlobalContext.f18817a.a().c.d).d(Reflection.a(AppUsageTrackingContract.class), null, null);
            }
        });
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r6v2, types: [java.lang.Object, kotlin.Lazy] */
    public static Object b(ChaloCoroutineWorker chaloCoroutineWorker, Continuation continuation) {
        AnonymousClass1 anonymousClass1;
        if (continuation instanceof AnonymousClass1) {
            anonymousClass1 = (AnonymousClass1) continuation;
            int i = anonymousClass1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                anonymousClass1.label = i - Integer.MIN_VALUE;
            } else {
                anonymousClass1 = chaloCoroutineWorker.new AnonymousClass1(continuation);
            }
        } else {
            anonymousClass1 = chaloCoroutineWorker.new AnonymousClass1(continuation);
        }
        Object objB = anonymousClass1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = anonymousClass1.label;
        if (i2 == 0) {
            ResultKt.b(objB);
            AppUsageTrackingContract appUsageTrackingContract = (AppUsageTrackingContract) chaloCoroutineWorker.f2620a.getValue();
            anonymousClass1.L$0 = chaloCoroutineWorker;
            anonymousClass1.label = 1;
            objB = appUsageTrackingContract.b(anonymousClass1);
            if (objB != coroutineSingletons) {
            }
        }
        if (i2 != 1) {
            if (i2 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(objB);
            return objB;
        }
        chaloCoroutineWorker = (ChaloCoroutineWorker) anonymousClass1.L$0;
        ResultKt.b(objB);
        if (!((Boolean) objB).booleanValue()) {
            ListenableWorker.Result resultSuccess = ListenableWorker.Result.success();
            Intrinsics.h(resultSuccess, "success(...)");
            return resultSuccess;
        }
        anonymousClass1.L$0 = null;
        anonymousClass1.label = 2;
        Object objC = chaloCoroutineWorker.c(anonymousClass1);
        return objC == coroutineSingletons ? coroutineSingletons : objC;
    }

    @Override // org.koin.core.component.KoinComponent
    public final Koin L() {
        return GlobalContext.f18817a.a();
    }

    public abstract Object c(ContinuationImpl continuationImpl);

    @Override // androidx.work.CoroutineWorker
    public final Object doWork(Continuation continuation) {
        return b(this, continuation);
    }
}
