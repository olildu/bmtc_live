package app.chalo.home.ui.base;

import androidx.media3.extractor.ts.PsExtractor;
import app.chalo.ridefeedback.data.dao.PostRideFeedbackEntity;
import app.chalo.ridefeedback.domain.ObservePendingRideFeedbackPromptsUseCase;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.EmptyList;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function3;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.FlowKt__BuildersKt$flowOf$$inlined$unsafeFlow$2;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0003*\b\u0012\u0004\u0012\u0002H\u00020\u00042\u0006\u0010\u0005\u001a\u0002H\u0003H\n¨\u0006\u0006"}, d2 = {"<anonymous>", "", "R", "T", "Lkotlinx/coroutines/flow/FlowCollector;", "it", "kotlinx/coroutines/flow/FlowKt__MergeKt$flatMapLatest$1"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "app.chalo.home.ui.base.HomeComponent$3$invokeSuspend$$inlined$flatMapLatest$1", f = "HomeComponent.kt", l = {PsExtractor.PRIVATE_STREAM_1}, m = "invokeSuspend", v = 1)
public final class HomeComponent$3$invokeSuspend$$inlined$flatMapLatest$1 extends SuspendLambda implements Function3<FlowCollector<? super List<? extends PostRideFeedbackEntity>>, Pair<? extends String, ? extends String>, Continuation<? super Unit>, Object> {
    private /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    int label;
    final /* synthetic */ HomeComponent this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HomeComponent$3$invokeSuspend$$inlined$flatMapLatest$1(HomeComponent homeComponent, Continuation continuation) {
        super(3, continuation);
        this.this$0 = homeComponent;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        HomeComponent$3$invokeSuspend$$inlined$flatMapLatest$1 homeComponent$3$invokeSuspend$$inlined$flatMapLatest$1 = new HomeComponent$3$invokeSuspend$$inlined$flatMapLatest$1(this.this$0, (Continuation) obj3);
        homeComponent$3$invokeSuspend$$inlined$flatMapLatest$1.L$0 = (FlowCollector) obj;
        homeComponent$3$invokeSuspend$$inlined$flatMapLatest$1.L$1 = obj2;
        return homeComponent$3$invokeSuspend$$inlined$flatMapLatest$1.invokeSuspend(Unit.f17538a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Flow flowKt__BuildersKt$flowOf$$inlined$unsafeFlow$2;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            ResultKt.b(obj);
            FlowCollector flowCollector = (FlowCollector) this.L$0;
            Pair pair = (Pair) this.L$1;
            String str = (String) pair.getFirst();
            String str2 = (String) pair.getSecond();
            if (str == null || str2 == null) {
                flowKt__BuildersKt$flowOf$$inlined$unsafeFlow$2 = new FlowKt__BuildersKt$flowOf$$inlined$unsafeFlow$2(EmptyList.f17557a);
            } else {
                final ObservePendingRideFeedbackPromptsUseCase observePendingRideFeedbackPromptsUseCase = this.this$0.w0;
                observePendingRideFeedbackPromptsUseCase.getClass();
                final Flow flowE = observePendingRideFeedbackPromptsUseCase.f9080a.e(str, str2);
                flowKt__BuildersKt$flowOf$$inlined$unsafeFlow$2 = new Flow<List<? extends PostRideFeedbackEntity>>() { // from class: app.chalo.ridefeedback.domain.ObservePendingRideFeedbackPromptsUseCase$invoke$$inlined$map$1

                    /* JADX INFO: renamed from: app.chalo.ridefeedback.domain.ObservePendingRideFeedbackPromptsUseCase$invoke$$inlined$map$1$2, reason: invalid class name */
                    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
                    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
                    public final class AnonymousClass2<T> implements FlowCollector {

                        /* JADX INFO: renamed from: a, reason: collision with root package name */
                        public final /* synthetic */ FlowCollector f9082a;
                        public final /* synthetic */ ObservePendingRideFeedbackPromptsUseCase b;

                        /* JADX INFO: renamed from: app.chalo.ridefeedback.domain.ObservePendingRideFeedbackPromptsUseCase$invoke$$inlined$map$1$2$1, reason: invalid class name */
                        @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
                        @DebugMetadata(c = "app.chalo.ridefeedback.domain.ObservePendingRideFeedbackPromptsUseCase$invoke$$inlined$map$1$2", f = "ObservePendingRideFeedbackPromptsUseCase.kt", l = {51, 50}, m = "emit", v = 1)
                        public final class AnonymousClass1 extends ContinuationImpl {
                            Object L$0;
                            Object L$1;
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

                        public AnonymousClass2(FlowCollector flowCollector, ObservePendingRideFeedbackPromptsUseCase observePendingRideFeedbackPromptsUseCase) {
                            this.f9082a = flowCollector;
                            this.b = observePendingRideFeedbackPromptsUseCase;
                        }

                        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
                        /* JADX WARN: Code restructure failed: missing block: B:31:0x00af, code lost:
                        
                            if (r2.emit(r12, r0) == r1) goto L32;
                         */
                        @Override // kotlinx.coroutines.flow.FlowCollector
                        /*
                            Code decompiled incorrectly, please refer to instructions dump.
                            To view partially-correct add '--show-bad-code' argument
                        */
                        public final java.lang.Object emit(java.lang.Object r12, kotlin.coroutines.Continuation r13) {
                            /*
                                r11 = this;
                                boolean r0 = r13 instanceof app.chalo.ridefeedback.domain.ObservePendingRideFeedbackPromptsUseCase$invoke$$inlined$map$1.AnonymousClass2.AnonymousClass1
                                if (r0 == 0) goto L13
                                r0 = r13
                                app.chalo.ridefeedback.domain.ObservePendingRideFeedbackPromptsUseCase$invoke$$inlined$map$1$2$1 r0 = (app.chalo.ridefeedback.domain.ObservePendingRideFeedbackPromptsUseCase$invoke$$inlined$map$1.AnonymousClass2.AnonymousClass1) r0
                                int r1 = r0.label
                                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                                r3 = r1 & r2
                                if (r3 == 0) goto L13
                                int r1 = r1 - r2
                                r0.label = r1
                                goto L18
                            L13:
                                app.chalo.ridefeedback.domain.ObservePendingRideFeedbackPromptsUseCase$invoke$$inlined$map$1$2$1 r0 = new app.chalo.ridefeedback.domain.ObservePendingRideFeedbackPromptsUseCase$invoke$$inlined$map$1$2$1
                                r0.<init>(r13)
                            L18:
                                java.lang.Object r13 = r0.result
                                kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
                                int r2 = r0.label
                                r3 = 2
                                r4 = 1
                                if (r2 == 0) goto L3f
                                if (r2 == r4) goto L33
                                if (r2 != r3) goto L2b
                                kotlin.ResultKt.b(r13)
                                goto Lb2
                            L2b:
                                java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
                                java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
                                r12.<init>(r13)
                                throw r12
                            L33:
                                java.lang.Object r12 = r0.L$1
                                java.util.List r12 = (java.util.List) r12
                                java.lang.Object r2 = r0.L$0
                                kotlinx.coroutines.flow.FlowCollector r2 = (kotlinx.coroutines.flow.FlowCollector) r2
                                kotlin.ResultKt.b(r13)
                                goto L57
                            L3f:
                                kotlin.ResultKt.b(r13)
                                java.util.List r12 = (java.util.List) r12
                                app.chalo.ridefeedback.domain.ObservePendingRideFeedbackPromptsUseCase r13 = r11.b
                                app.chalo.contract.BasicInfoContract r13 = r13.b
                                kotlinx.coroutines.flow.FlowCollector r2 = r11.f9082a
                                r0.L$0 = r2
                                r0.L$1 = r12
                                r0.label = r4
                                java.lang.Object r13 = r13.c(r0)
                                if (r13 != r1) goto L57
                                goto Lb1
                            L57:
                                java.lang.Number r13 = (java.lang.Number) r13
                                long r4 = r13.longValue()
                                java.lang.Iterable r12 = (java.lang.Iterable) r12
                                java.util.ArrayList r13 = new java.util.ArrayList
                                r13.<init>()
                                java.util.Iterator r12 = r12.iterator()
                            L68:
                                boolean r6 = r12.hasNext()
                                if (r6 == 0) goto L94
                                java.lang.Object r6 = r12.next()
                                r7 = r6
                                app.chalo.ridefeedback.data.dao.PostRideFeedbackEntity r7 = (app.chalo.ridefeedback.data.dao.PostRideFeedbackEntity) r7
                                java.lang.String r8 = "entry"
                                kotlin.jvm.internal.Intrinsics.i(r7, r8)
                                app.chalo.ridefeedback.data.app.RideFeedbackFillStatus r8 = r7.m
                                app.chalo.ridefeedback.data.app.RideFeedbackFillStatus r9 = app.chalo.ridefeedback.data.app.RideFeedbackFillStatus.NOT_FILLED
                                if (r8 == r9) goto L84
                                app.chalo.ridefeedback.data.app.RideFeedbackFillStatus r9 = app.chalo.ridefeedback.data.app.RideFeedbackFillStatus.PARTIAL
                                if (r8 != r9) goto L68
                            L84:
                                long r7 = r7.i
                                long r7 = r4 - r7
                                r9 = 86400000(0x5265c00, double:4.2687272E-316)
                                int r7 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
                                if (r7 < 0) goto L90
                                goto L68
                            L90:
                                r13.add(r6)
                                goto L68
                            L94:
                                app.chalo.ridefeedback.domain.ObservePendingRideFeedbackPromptsUseCase$invoke$lambda$0$$inlined$sortedByDescending$1 r12 = new app.chalo.ridefeedback.domain.ObservePendingRideFeedbackPromptsUseCase$invoke$lambda$0$$inlined$sortedByDescending$1
                                r12.<init>()
                                java.util.List r12 = kotlin.collections.CollectionsKt.v0(r12, r13)
                                java.lang.Iterable r12 = (java.lang.Iterable) r12
                                r13 = 3
                                java.util.List r12 = kotlin.collections.CollectionsKt.x0(r12, r13)
                                r13 = 0
                                r0.L$0 = r13
                                r0.L$1 = r13
                                r0.label = r3
                                java.lang.Object r12 = r2.emit(r12, r0)
                                if (r12 != r1) goto Lb2
                            Lb1:
                                return r1
                            Lb2:
                                kotlin.Unit r12 = kotlin.Unit.f17538a
                                return r12
                            */
                            throw new UnsupportedOperationException("Method not decompiled: app.chalo.ridefeedback.domain.ObservePendingRideFeedbackPromptsUseCase$invoke$$inlined$map$1.AnonymousClass2.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
                        }
                    }

                    @Override // kotlinx.coroutines.flow.Flow
                    public final Object collect(FlowCollector flowCollector2, Continuation continuation) {
                        Object objCollect = flowE.collect(new AnonymousClass2(flowCollector2, observePendingRideFeedbackPromptsUseCase), continuation);
                        return objCollect == CoroutineSingletons.COROUTINE_SUSPENDED ? objCollect : Unit.f17538a;
                    }
                };
            }
            this.label = 1;
            if (FlowKt.r(flowCollector, flowKt__BuildersKt$flowOf$$inlined$unsafeFlow$2, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(obj);
        }
        return Unit.f17538a;
    }
}
