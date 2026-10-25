package app.chalo.appmigrationpreconditions.orchestrator;

import androidx.media3.exoplayer.ExoPlayer;
import app.chalo.features.chaloconfig.ChaloConfigFetchStatus;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.TimeoutKt;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "Lapp/chalo/features/chaloconfig/ChaloConfigFetchStatus;", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "app.chalo.appmigrationpreconditions.orchestrator.IosMigrationFlowOrchestrator$performChaloConfigFetch$2$fetchingStartedJob$1", f = "IosMigrationFlowOrchestrator.kt", l = {178}, m = "invokeSuspend", v = 1)
final class IosMigrationFlowOrchestrator$performChaloConfigFetch$2$fetchingStartedJob$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super ChaloConfigFetchStatus>, Object> {
    int label;
    final /* synthetic */ IosMigrationFlowOrchestrator this$0;

    /* JADX INFO: renamed from: app.chalo.appmigrationpreconditions.orchestrator.IosMigrationFlowOrchestrator$performChaloConfigFetch$2$fetchingStartedJob$1$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "Lapp/chalo/features/chaloconfig/ChaloConfigFetchStatus;", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "app.chalo.appmigrationpreconditions.orchestrator.IosMigrationFlowOrchestrator$performChaloConfigFetch$2$fetchingStartedJob$1$1", f = "IosMigrationFlowOrchestrator.kt", l = {179}, m = "invokeSuspend", v = 1)
    final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super ChaloConfigFetchStatus>, Object> {
        int label;
        final /* synthetic */ IosMigrationFlowOrchestrator this$0;

        /* JADX INFO: renamed from: app.chalo.appmigrationpreconditions.orchestrator.IosMigrationFlowOrchestrator$performChaloConfigFetch$2$fetchingStartedJob$1$1$1, reason: invalid class name and collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
        @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "it", "Lapp/chalo/features/chaloconfig/ChaloConfigFetchStatus;"}, k = 3, mv = {2, 0, 0}, xi = 48)
        @DebugMetadata(c = "app.chalo.appmigrationpreconditions.orchestrator.IosMigrationFlowOrchestrator$performChaloConfigFetch$2$fetchingStartedJob$1$1$1", f = "IosMigrationFlowOrchestrator.kt", l = {}, m = "invokeSuspend", v = 1)
        final class C01001 extends SuspendLambda implements Function2<ChaloConfigFetchStatus, Continuation<? super Boolean>, Object> {
            /* synthetic */ Object L$0;
            int label;

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation create(Object obj, Continuation continuation) {
                C01001 c01001 = new C01001(2, continuation);
                c01001.L$0 = obj;
                return c01001;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return ((C01001) create((ChaloConfigFetchStatus) obj, (Continuation) obj2)).invokeSuspend(Unit.f17538a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.b(obj);
                return Boolean.valueOf(((ChaloConfigFetchStatus) this.L$0) == ChaloConfigFetchStatus.FETCH_IN_PROGRESS);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(IosMigrationFlowOrchestrator iosMigrationFlowOrchestrator, Continuation continuation) {
            super(2, continuation);
            this.this$0 = iosMigrationFlowOrchestrator;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new AnonymousClass1(this.this$0, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            AnonymousClass1 anonymousClass1 = (AnonymousClass1) create((CoroutineScope) obj, (Continuation) obj2);
            Unit unit = Unit.f17538a;
            anonymousClass1.invokeSuspend(unit);
            return unit;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i == 0) {
                ResultKt.b(obj);
                this.this$0.getClass();
                throw null;
            }
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(obj);
            return obj;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IosMigrationFlowOrchestrator$performChaloConfigFetch$2$fetchingStartedJob$1(IosMigrationFlowOrchestrator iosMigrationFlowOrchestrator, Continuation continuation) {
        super(2, continuation);
        this.this$0 = iosMigrationFlowOrchestrator;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new IosMigrationFlowOrchestrator$performChaloConfigFetch$2$fetchingStartedJob$1(this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((IosMigrationFlowOrchestrator$performChaloConfigFetch$2$fetchingStartedJob$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f17538a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(obj);
            return obj;
        }
        ResultKt.b(obj);
        AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, null);
        this.label = 1;
        Object objC = TimeoutKt.c(ExoPlayer.DEFAULT_DETACH_SURFACE_TIMEOUT_MS, anonymousClass1, this);
        return objC == coroutineSingletons ? coroutineSingletons : objC;
    }
}
