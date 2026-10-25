package app.cash.sqldelight.coroutines;

import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlinx.coroutines.flow.AbstractFlow;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0003¸\u0006\u0002"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lkotlinx/coroutines/flow/Flow;", "kotlinx/coroutines/flow/FlowKt__TransformKt$map$$inlined$unsafeTransform$1", "kotlinx-coroutines-core"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class FlowQuery$mapToList$$inlined$map$1 implements Flow<List<Object>> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Flow f702a;
    public final /* synthetic */ CoroutineContext b;

    /* JADX INFO: renamed from: app.cash.sqldelight.coroutines.FlowQuery$mapToList$$inlined$map$1$2, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public final class AnonymousClass2<T> implements FlowCollector {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ FlowCollector f703a;
        public final /* synthetic */ CoroutineContext b;

        /* JADX INFO: renamed from: app.cash.sqldelight.coroutines.FlowQuery$mapToList$$inlined$map$1$2$1, reason: invalid class name */
        @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
        @DebugMetadata(c = "app.cash.sqldelight.coroutines.FlowQuery$mapToList$$inlined$map$1$2", f = "FlowExtensions.kt", l = {51, 50}, m = "emit")
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

        public AnonymousClass2(FlowCollector flowCollector, CoroutineContext coroutineContext) {
            this.f703a = flowCollector;
            this.b = coroutineContext;
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        /* JADX WARN: Code restructure failed: missing block: B:20:0x005c, code lost:
        
            if (r7.emit(r8, r0) == r1) goto L21;
         */
        @Override // kotlinx.coroutines.flow.FlowCollector
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object emit(java.lang.Object r7, kotlin.coroutines.Continuation r8) throws java.lang.Throwable {
            /*
                r6 = this;
                boolean r0 = r8 instanceof app.cash.sqldelight.coroutines.FlowQuery$mapToList$$inlined$map$1.AnonymousClass2.AnonymousClass1
                if (r0 == 0) goto L13
                r0 = r8
                app.cash.sqldelight.coroutines.FlowQuery$mapToList$$inlined$map$1$2$1 r0 = (app.cash.sqldelight.coroutines.FlowQuery$mapToList$$inlined$map$1.AnonymousClass2.AnonymousClass1) r0
                int r1 = r0.label
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.label = r1
                goto L18
            L13:
                app.cash.sqldelight.coroutines.FlowQuery$mapToList$$inlined$map$1$2$1 r0 = new app.cash.sqldelight.coroutines.FlowQuery$mapToList$$inlined$map$1$2$1
                r0.<init>(r8)
            L18:
                java.lang.Object r8 = r0.result
                kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
                int r2 = r0.label
                r3 = 0
                r4 = 2
                r5 = 1
                if (r2 == 0) goto L3b
                if (r2 == r5) goto L33
                if (r2 != r4) goto L2b
                kotlin.ResultKt.b(r8)
                goto L5f
            L2b:
                java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
                r7.<init>(r8)
                throw r7
            L33:
                java.lang.Object r7 = r0.L$0
                kotlinx.coroutines.flow.FlowCollector r7 = (kotlinx.coroutines.flow.FlowCollector) r7
                kotlin.ResultKt.b(r8)
                goto L54
            L3b:
                kotlin.ResultKt.b(r8)
                app.cash.sqldelight.Query r7 = (app.cash.sqldelight.Query) r7
                app.cash.sqldelight.coroutines.FlowQuery$mapToList$1$1 r8 = new app.cash.sqldelight.coroutines.FlowQuery$mapToList$1$1
                r8.<init>(r7, r3)
                kotlinx.coroutines.flow.FlowCollector r7 = r6.f703a
                r0.L$0 = r7
                r0.label = r5
                kotlin.coroutines.CoroutineContext r2 = r6.b
                java.lang.Object r8 = kotlinx.coroutines.BuildersKt.g(r2, r8, r0)
                if (r8 != r1) goto L54
                goto L5e
            L54:
                r0.L$0 = r3
                r0.label = r4
                java.lang.Object r7 = r7.emit(r8, r0)
                if (r7 != r1) goto L5f
            L5e:
                return r1
            L5f:
                kotlin.Unit r7 = kotlin.Unit.f17538a
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: app.cash.sqldelight.coroutines.FlowQuery$mapToList$$inlined$map$1.AnonymousClass2.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
        }
    }

    public FlowQuery$mapToList$$inlined$map$1(Flow flow, CoroutineContext coroutineContext) {
        this.f702a = flow;
        this.b = coroutineContext;
    }

    @Override // kotlinx.coroutines.flow.Flow
    public final Object collect(FlowCollector flowCollector, Continuation continuation) throws Throwable {
        Object objCollect = ((AbstractFlow) this.f702a).collect(new AnonymousClass2(flowCollector, this.b), continuation);
        return objCollect == CoroutineSingletons.COROUTINE_SUSPENDED ? objCollect : Unit.f17538a;
    }
}
