package app.chalo.appmigrationpreconditions.orchestrator;

import app.chalo.features.chaloconfig.ChaloConfigFetchStatus;
import app.chalo.utils.ChaloUseCaseResult;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineStart;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\u0010\u0000\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001*\u00020\u0004H\n"}, d2 = {"<anonymous>", "Lapp/chalo/utils/ChaloUseCaseResult;", "", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "app.chalo.appmigrationpreconditions.orchestrator.IosMigrationFlowOrchestrator$performChaloConfigFetch$2", f = "IosMigrationFlowOrchestrator.kt", l = {184, 187, 194}, m = "invokeSuspend", v = 1)
final class IosMigrationFlowOrchestrator$performChaloConfigFetch$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super ChaloUseCaseResult<Unit, String>>, Object> {
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ IosMigrationFlowOrchestrator this$0;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f960a;

        static {
            int[] iArr = new int[ChaloConfigFetchStatus.values().length];
            try {
                iArr[ChaloConfigFetchStatus.FETCH_SUCCESSFUL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ChaloConfigFetchStatus.FETCH_FAILED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ChaloConfigFetchStatus.FETCHING_NOT_STARTED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[ChaloConfigFetchStatus.FETCH_IN_PROGRESS.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f960a = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IosMigrationFlowOrchestrator$performChaloConfigFetch$2(IosMigrationFlowOrchestrator iosMigrationFlowOrchestrator, Continuation continuation) {
        super(2, continuation);
        this.this$0 = iosMigrationFlowOrchestrator;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        IosMigrationFlowOrchestrator$performChaloConfigFetch$2 iosMigrationFlowOrchestrator$performChaloConfigFetch$2 = new IosMigrationFlowOrchestrator$performChaloConfigFetch$2(this.this$0, continuation);
        iosMigrationFlowOrchestrator$performChaloConfigFetch$2.L$0 = obj;
        return iosMigrationFlowOrchestrator$performChaloConfigFetch$2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((IosMigrationFlowOrchestrator$performChaloConfigFetch$2) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f17538a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            ResultKt.b(obj);
            BuildersKt.b((CoroutineScope) this.L$0, null, CoroutineStart.UNDISPATCHED, new IosMigrationFlowOrchestrator$performChaloConfigFetch$2$fetchingStartedJob$1(this.this$0, null), 1);
            this.this$0.getClass();
            throw null;
        }
        if (i == 1) {
            ResultKt.b(obj);
            this.this$0.getClass();
            throw null;
        }
        if (i != 2) {
            if (i != 3) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(obj);
            return new ChaloUseCaseResult.Success(Unit.f17538a);
        }
        ResultKt.b(obj);
        int i2 = WhenMappings.f960a[((ChaloConfigFetchStatus) obj).ordinal()];
        if (i2 == 1) {
            this.this$0.getClass();
            this.label = 3;
            throw null;
        }
        if (i2 == 2) {
            return new ChaloUseCaseResult.Failure("Remote config fetch failed");
        }
        if (i2 == 3 || i2 == 4) {
            return new ChaloUseCaseResult.Failure("Remote config transient state returned");
        }
        throw new NoWhenBranchMatchedException();
    }
}
