package app.chalo.juspay;

import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.TimeoutKt;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.SharedFlow;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "Lapp/chalo/juspay/JuspayControllerImpl$TerminalOutcome;", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "app.chalo.juspay.JuspayControllerImpl$executeAwaitingTerminal$2$1$terminal$1", f = "JuspayControllerImpl.kt", l = {788}, m = "invokeSuspend", v = 1)
final class JuspayControllerImpl$executeAwaitingTerminal$2$1$terminal$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super JuspayControllerImpl.TerminalOutcome>, Object> {
    final /* synthetic */ JuspaySdkAdapter $adapter;
    final /* synthetic */ String $requestId;
    int label;
    final /* synthetic */ JuspayControllerImpl this$0;

    /* JADX INFO: renamed from: app.chalo.juspay.JuspayControllerImpl$executeAwaitingTerminal$2$1$terminal$1$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "Lapp/chalo/juspay/JuspayControllerImpl$TerminalOutcome;", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "app.chalo.juspay.JuspayControllerImpl$executeAwaitingTerminal$2$1$terminal$1$1", f = "JuspayControllerImpl.kt", l = {791}, m = "invokeSuspend", v = 1)
    final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super JuspayControllerImpl.TerminalOutcome>, Object> {
        final /* synthetic */ JuspaySdkAdapter $adapter;
        final /* synthetic */ String $requestId;
        int label;
        final /* synthetic */ JuspayControllerImpl this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(JuspaySdkAdapter juspaySdkAdapter, JuspayControllerImpl juspayControllerImpl, String str, Continuation continuation) {
            super(2, continuation);
            this.$adapter = juspaySdkAdapter;
            this.this$0 = juspayControllerImpl;
            this.$requestId = str;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new AnonymousClass1(this.$adapter, this.this$0, this.$requestId, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            return ((AnonymousClass1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f17538a);
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
            final SharedFlow e = this.$adapter.getE();
            final JuspayControllerImpl juspayControllerImpl = this.this$0;
            final String str = this.$requestId;
            Flow<JuspayControllerImpl.TerminalOutcome> flow = new Flow<JuspayControllerImpl.TerminalOutcome>() { // from class: app.chalo.juspay.JuspayControllerImpl$executeAwaitingTerminal$2$1$terminal$1$1$invokeSuspend$$inlined$mapNotNull$1

                /* JADX INFO: renamed from: app.chalo.juspay.JuspayControllerImpl$executeAwaitingTerminal$2$1$terminal$1$1$invokeSuspend$$inlined$mapNotNull$1$2, reason: invalid class name */
                /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
                @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
                public final class AnonymousClass2<T> implements FlowCollector {

                    /* JADX INFO: renamed from: a, reason: collision with root package name */
                    public final /* synthetic */ FlowCollector f4037a;
                    public final /* synthetic */ JuspayControllerImpl b;
                    public final /* synthetic */ String c;

                    /* JADX INFO: renamed from: app.chalo.juspay.JuspayControllerImpl$executeAwaitingTerminal$2$1$terminal$1$1$invokeSuspend$$inlined$mapNotNull$1$2$1, reason: invalid class name */
                    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
                    @DebugMetadata(c = "app.chalo.juspay.JuspayControllerImpl$executeAwaitingTerminal$2$1$terminal$1$1$invokeSuspend$$inlined$mapNotNull$1$2", f = "JuspayControllerImpl.kt", l = {52}, m = "emit", v = 1)
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

                    public AnonymousClass2(FlowCollector flowCollector, JuspayControllerImpl juspayControllerImpl, String str) {
                        this.f4037a = flowCollector;
                        this.b = juspayControllerImpl;
                        this.c = str;
                    }

                    /* JADX WARN: Code duplicated, block: B:18:0x0054 A[PHI: r8
                      0x0054: PHI (r8v13 java.lang.Object) = (r8v12 java.lang.Object), (r8v14 java.lang.Object) binds: [B:22:0x0069, B:17:0x0052] A[DONT_GENERATE, DONT_INLINE]] */
                    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
                    @Override // kotlinx.coroutines.flow.FlowCollector
                    public final Object emit(Object obj, Continuation continuation) {
                        AnonymousClass1 anonymousClass1;
                        Object failed;
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
                            JusPaySdkResultAppModel jusPaySdkResultAppModel = (JusPaySdkResultAppModel) obj;
                            this.b.getClass();
                            boolean z = jusPaySdkResultAppModel instanceof JusPaySdkResultAppModel.ProcessResult;
                            String str = this.c;
                            Object failed2 = null;
                            if (z) {
                                JusPayResultAppModel jusPayResultAppModel = ((JusPaySdkResultAppModel.ProcessResult) jusPaySdkResultAppModel).f4012a;
                                failed = new JuspayControllerImpl.TerminalOutcome.Result(jusPayResultAppModel);
                                if (JuspayControllerImpl.t(jusPayResultAppModel.getB(), str)) {
                                    failed2 = failed;
                                }
                            } else if (jusPaySdkResultAppModel instanceof JusPaySdkResultAppModel.Error) {
                                JusPaySdkResultAppModel.Error error = (JusPaySdkResultAppModel.Error) jusPaySdkResultAppModel;
                                failed = new JuspayControllerImpl.TerminalOutcome.Failed(error.f4010a);
                                if (JuspayControllerImpl.t(error.b, str)) {
                                    failed2 = failed;
                                }
                            } else if (Intrinsics.d(jusPaySdkResultAppModel, JusPaySdkResultAppModel.SessionExpired.f4014a)) {
                                failed2 = JuspayControllerImpl.TerminalOutcome.SessionExpired.f4035a;
                            } else if (Intrinsics.d(jusPaySdkResultAppModel, JusPaySdkResultAppModel.ResultUnavailable.f4013a)) {
                                failed2 = new JuspayControllerImpl.TerminalOutcome.Failed("juspay result unavailable");
                            } else if (!(jusPaySdkResultAppModel instanceof JusPaySdkResultAppModel.ShowLoader) && !(jusPaySdkResultAppModel instanceof JusPaySdkResultAppModel.HideLoader) && !Intrinsics.d(jusPaySdkResultAppModel, JusPaySdkResultAppModel.Unknown.f4016a)) {
                                throw new NoWhenBranchMatchedException();
                            }
                            if (failed2 != null) {
                                anonymousClass1.label = 1;
                                if (this.f4037a.emit(failed2, anonymousClass1) == coroutineSingletons) {
                                    return coroutineSingletons;
                                }
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
                    Object objCollect = e.collect(new AnonymousClass2(flowCollector, juspayControllerImpl, str), continuation);
                    return objCollect == CoroutineSingletons.COROUTINE_SUSPENDED ? objCollect : Unit.f17538a;
                }
            };
            this.label = 1;
            Object objT = FlowKt.t(flow, this);
            return objT == coroutineSingletons ? coroutineSingletons : objT;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public JuspayControllerImpl$executeAwaitingTerminal$2$1$terminal$1(JuspaySdkAdapter juspaySdkAdapter, JuspayControllerImpl juspayControllerImpl, String str, Continuation continuation) {
        super(2, continuation);
        this.$adapter = juspaySdkAdapter;
        this.this$0 = juspayControllerImpl;
        this.$requestId = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new JuspayControllerImpl$executeAwaitingTerminal$2$1$terminal$1(this.$adapter, this.this$0, this.$requestId, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((JuspayControllerImpl$executeAwaitingTerminal$2$1$terminal$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f17538a);
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
        AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$adapter, this.this$0, this.$requestId, null);
        this.label = 1;
        Object objC = TimeoutKt.c(120000L, anonymousClass1, this);
        return objC == coroutineSingletons ? coroutineSingletons : objC;
    }
}
