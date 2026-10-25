package app.chalo.juspay;

import androidx.media3.extractor.ts.TsExtractor;
import app.chalo.behaviour.policy.JuspayPolicy;
import app.chalo.behaviour.policy.ResolveJuspayPolicyUseCase;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "app.chalo.juspay.JuspayControllerImpl$policyJob$1", f = "JuspayControllerImpl.kt", l = {TsExtractor.TS_STREAM_TYPE_SPLICE_INFO}, m = "invokeSuspend", v = 1)
final class JuspayControllerImpl$policyJob$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ JuspayControllerImpl this$0;

    /* JADX INFO: renamed from: app.chalo.juspay.JuspayControllerImpl$policyJob$1$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "policy", "Lapp/chalo/behaviour/policy/JuspayPolicy;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "app.chalo.juspay.JuspayControllerImpl$policyJob$1$1", f = "JuspayControllerImpl.kt", l = {TsExtractor.TS_STREAM_TYPE_E_AC3}, m = "invokeSuspend", v = 1)
    final class AnonymousClass1 extends SuspendLambda implements Function2<JuspayPolicy, Continuation<? super Unit>, Object> {
        /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ JuspayControllerImpl this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(JuspayControllerImpl juspayControllerImpl, Continuation continuation) {
            super(2, continuation);
            this.this$0 = juspayControllerImpl;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, continuation);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            return ((AnonymousClass1) create((JuspayPolicy) obj, (Continuation) obj2)).invokeSuspend(Unit.f17538a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i == 0) {
                ResultKt.b(obj);
                JuspayPolicy juspayPolicy = (JuspayPolicy) this.L$0;
                JuspayControllerImpl juspayControllerImpl = this.this$0;
                JuspayInitiateConditions juspayInitiateConditions = (JuspayInitiateConditions) juspayControllerImpl.j.f10429a.get();
                this.label = 1;
                if (juspayControllerImpl.k(juspayPolicy, juspayInitiateConditions, "config_settled", this) == coroutineSingletons) {
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

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public JuspayControllerImpl$policyJob$1(JuspayControllerImpl juspayControllerImpl, Continuation continuation) {
        super(2, continuation);
        this.this$0 = juspayControllerImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new JuspayControllerImpl$policyJob$1(this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((JuspayControllerImpl$policyJob$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f17538a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            ResultKt.b(obj);
            final ResolveJuspayPolicyUseCase resolveJuspayPolicyUseCase = this.this$0.c;
            final Flow flow = resolveJuspayPolicyUseCase.d.e;
            Flow flowM = FlowKt.m(new Flow<JuspayPolicy>() { // from class: app.chalo.behaviour.policy.ResolveJuspayPolicyUseCase$policyFlow$$inlined$map$1

                /* JADX INFO: renamed from: app.chalo.behaviour.policy.ResolveJuspayPolicyUseCase$policyFlow$$inlined$map$1$2, reason: invalid class name */
                /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
                @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
                public final class AnonymousClass2<T> implements FlowCollector {

                    /* JADX INFO: renamed from: a, reason: collision with root package name */
                    public final /* synthetic */ FlowCollector f1044a;
                    public final /* synthetic */ ResolveJuspayPolicyUseCase b;

                    /* JADX INFO: renamed from: app.chalo.behaviour.policy.ResolveJuspayPolicyUseCase$policyFlow$$inlined$map$1$2$1, reason: invalid class name */
                    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
                    @DebugMetadata(c = "app.chalo.behaviour.policy.ResolveJuspayPolicyUseCase$policyFlow$$inlined$map$1$2", f = "ResolveJuspayPolicyUseCase.kt", l = {51, 50}, m = "emit", v = 1)
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

                    public AnonymousClass2(FlowCollector flowCollector, ResolveJuspayPolicyUseCase resolveJuspayPolicyUseCase) {
                        this.f1044a = flowCollector;
                        this.b = resolveJuspayPolicyUseCase;
                    }

                    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
                    /* JADX WARN: Code restructure failed: missing block: B:20:0x005a, code lost:
                    
                        if (r6.emit(r7, r0) == r1) goto L21;
                     */
                    @Override // kotlinx.coroutines.flow.FlowCollector
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                        To view partially-correct add '--show-bad-code' argument
                    */
                    public final java.lang.Object emit(java.lang.Object r6, kotlin.coroutines.Continuation r7) {
                        /*
                            r5 = this;
                            boolean r0 = r7 instanceof app.chalo.behaviour.policy.ResolveJuspayPolicyUseCase$policyFlow$$inlined$map$1.AnonymousClass2.AnonymousClass1
                            if (r0 == 0) goto L13
                            r0 = r7
                            app.chalo.behaviour.policy.ResolveJuspayPolicyUseCase$policyFlow$$inlined$map$1$2$1 r0 = (app.chalo.behaviour.policy.ResolveJuspayPolicyUseCase$policyFlow$$inlined$map$1.AnonymousClass2.AnonymousClass1) r0
                            int r1 = r0.label
                            r2 = -2147483648(0xffffffff80000000, float:-0.0)
                            r3 = r1 & r2
                            if (r3 == 0) goto L13
                            int r1 = r1 - r2
                            r0.label = r1
                            goto L18
                        L13:
                            app.chalo.behaviour.policy.ResolveJuspayPolicyUseCase$policyFlow$$inlined$map$1$2$1 r0 = new app.chalo.behaviour.policy.ResolveJuspayPolicyUseCase$policyFlow$$inlined$map$1$2$1
                            r0.<init>(r7)
                        L18:
                            java.lang.Object r7 = r0.result
                            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
                            int r2 = r0.label
                            r3 = 2
                            r4 = 1
                            if (r2 == 0) goto L3a
                            if (r2 == r4) goto L32
                            if (r2 != r3) goto L2a
                            kotlin.ResultKt.b(r7)
                            goto L5d
                        L2a:
                            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
                            r6.<init>(r7)
                            throw r6
                        L32:
                            java.lang.Object r6 = r0.L$0
                            kotlinx.coroutines.flow.FlowCollector r6 = (kotlinx.coroutines.flow.FlowCollector) r6
                            kotlin.ResultKt.b(r7)
                            goto L51
                        L3a:
                            kotlin.ResultKt.b(r7)
                            java.lang.Number r6 = (java.lang.Number) r6
                            r6.longValue()
                            kotlinx.coroutines.flow.FlowCollector r6 = r5.f1044a
                            r0.L$0 = r6
                            r0.label = r4
                            app.chalo.behaviour.policy.ResolveJuspayPolicyUseCase r7 = r5.b
                            java.lang.Object r7 = r7.a(r0)
                            if (r7 != r1) goto L51
                            goto L5c
                        L51:
                            r2 = 0
                            r0.L$0 = r2
                            r0.label = r3
                            java.lang.Object r6 = r6.emit(r7, r0)
                            if (r6 != r1) goto L5d
                        L5c:
                            return r1
                        L5d:
                            kotlin.Unit r6 = kotlin.Unit.f17538a
                            return r6
                        */
                        throw new UnsupportedOperationException("Method not decompiled: app.chalo.behaviour.policy.ResolveJuspayPolicyUseCase$policyFlow$$inlined$map$1.AnonymousClass2.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
                    }
                }

                @Override // kotlinx.coroutines.flow.Flow
                public final Object collect(FlowCollector flowCollector, Continuation continuation) {
                    Object objCollect = flow.collect(new AnonymousClass2(flowCollector, resolveJuspayPolicyUseCase), continuation);
                    return objCollect == CoroutineSingletons.COROUTINE_SUSPENDED ? objCollect : Unit.f17538a;
                }
            });
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, null);
            this.label = 1;
            if (FlowKt.j(flowM, anonymousClass1, this) == coroutineSingletons) {
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
