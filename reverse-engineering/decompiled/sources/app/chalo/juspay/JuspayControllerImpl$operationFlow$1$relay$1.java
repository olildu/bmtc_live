package app.chalo.juspay;

import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.channels.ProducerScope;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.SharedFlow;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "app.chalo.juspay.JuspayControllerImpl$operationFlow$1$relay$1", f = "JuspayControllerImpl.kt", l = {514}, m = "invokeSuspend", v = 1)
final class JuspayControllerImpl$operationFlow$1$relay$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ ProducerScope<JuspayOperationUpdate> $$this$channelFlow;
    final /* synthetic */ JuspayInitiateConditions $conditionSnapshot;
    final /* synthetic */ Ref.BooleanRef $reachedTerminal;
    final /* synthetic */ Ref.BooleanRef $requestAbandoned;
    final /* synthetic */ String $requestId;
    final /* synthetic */ String $source;
    int label;
    final /* synthetic */ JuspayControllerImpl this$0;

    /* JADX INFO: renamed from: app.chalo.juspay.JuspayControllerImpl$operationFlow$1$relay$1$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    final class AnonymousClass1<T> implements FlowCollector {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Ref.BooleanRef f4038a;
        public final /* synthetic */ JuspayControllerImpl b;
        public final /* synthetic */ String c;
        public final /* synthetic */ JuspayInitiateConditions d;
        public final /* synthetic */ Ref.BooleanRef e;
        public final /* synthetic */ String f;
        public final /* synthetic */ ProducerScope g;

        public AnonymousClass1(Ref.BooleanRef booleanRef, JuspayControllerImpl juspayControllerImpl, String str, JuspayInitiateConditions juspayInitiateConditions, Ref.BooleanRef booleanRef2, String str2, ProducerScope producerScope) {
            this.f4038a = booleanRef;
            this.b = juspayControllerImpl;
            this.c = str;
            this.d = juspayInitiateConditions;
            this.e = booleanRef2;
            this.f = str2;
            this.g = producerScope;
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        /* JADX WARN: Code duplicated, block: B:80:0x0166  */
        @Override // kotlinx.coroutines.flow.FlowCollector
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object emit(JusPaySdkResultAppModel jusPaySdkResultAppModel, Continuation continuation) {
            JuspayControllerImpl$operationFlow$1$relay$1$1$emit$1 juspayControllerImpl$operationFlow$1$relay$1$1$emit$1;
            JuspayOperationUpdate failed;
            JuspayOperationUpdate juspayOperationUpdate;
            Object value;
            if (continuation instanceof JuspayControllerImpl$operationFlow$1$relay$1$1$emit$1) {
                juspayControllerImpl$operationFlow$1$relay$1$1$emit$1 = (JuspayControllerImpl$operationFlow$1$relay$1$1$emit$1) continuation;
                int i = juspayControllerImpl$operationFlow$1$relay$1$1$emit$1.label;
                if ((i & Integer.MIN_VALUE) != 0) {
                    juspayControllerImpl$operationFlow$1$relay$1$1$emit$1.label = i - Integer.MIN_VALUE;
                } else {
                    juspayControllerImpl$operationFlow$1$relay$1$1$emit$1 = new JuspayControllerImpl$operationFlow$1$relay$1$1$emit$1(this, continuation);
                }
            } else {
                juspayControllerImpl$operationFlow$1$relay$1$1$emit$1 = new JuspayControllerImpl$operationFlow$1$relay$1$1$emit$1(this, continuation);
            }
            Object obj = juspayControllerImpl$operationFlow$1$relay$1$1$emit$1.result;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i2 = juspayControllerImpl$operationFlow$1$relay$1$1$emit$1.label;
            ProducerScope producerScope = this.g;
            Unit unit = Unit.f17538a;
            if (i2 == 0) {
                ResultKt.b(obj);
                Ref.BooleanRef booleanRef = this.f4038a;
                if (!booleanRef.element) {
                    JuspayControllerImpl juspayControllerImpl = this.b;
                    juspayControllerImpl.getClass();
                    boolean z = jusPaySdkResultAppModel instanceof JusPaySdkResultAppModel.ProcessResult;
                    boolean zR = false;
                    JuspayOperationFailure.SessionExpired sessionExpired = JuspayOperationFailure.SessionExpired.f4055a;
                    String str = this.c;
                    JuspayOperationFailure.ResultUnavailable resultUnavailable = JuspayOperationFailure.ResultUnavailable.f4052a;
                    if (z) {
                        JusPayResultAppModel jusPayResultAppModel = ((JusPaySdkResultAppModel.ProcessResult) jusPaySdkResultAppModel).f4012a;
                        if (!JuspayControllerImpl.t(jusPayResultAppModel.getB(), str)) {
                            jusPayResultAppModel = null;
                        }
                        if (jusPayResultAppModel == null) {
                            failed = null;
                        } else if (jusPayResultAppModel instanceof JusPayErrorResultAppModel) {
                            failed = new JuspayOperationUpdate.Completed(new JuspayOperationResult.Error((JusPayErrorResultAppModel) jusPayResultAppModel));
                        } else if (jusPayResultAppModel instanceof JusPaySuccessResultAppModel) {
                            JusPayResultDataType jusPayResultDataType = ((JusPaySuccessResultAppModel) jusPayResultAppModel).e;
                            if (jusPayResultDataType instanceof JusPayResultDataType.OnBoardingAndPay) {
                                failed = new JuspayOperationUpdate.Completed(new JuspayOperationResult.Onboarding((JusPayResultDataType.OnBoardingAndPay) jusPayResultDataType));
                            } else if (jusPayResultDataType instanceof JusPayResultDataType.Management) {
                                failed = new JuspayOperationUpdate.Completed(new JuspayOperationResult.Management((JusPayResultDataType.Management) jusPayResultDataType));
                            } else if (jusPayResultDataType instanceof JusPayResultDataType.UpiUiScanPay) {
                                failed = new JuspayOperationUpdate.Completed(new JuspayOperationResult.UpiUiScanPay((JusPayResultDataType.UpiUiScanPay) jusPayResultDataType));
                            } else {
                                if (!(jusPayResultDataType instanceof JusPayResultDataType.InitiateSDK) && !(jusPayResultDataType instanceof JusPayResultDataType.UpiSessionToken) && !Intrinsics.d(jusPayResultDataType, JusPayResultDataType.UpdateAuth.INSTANCE) && !Intrinsics.d(jusPayResultDataType, JusPayResultDataType.Unknown.INSTANCE)) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                failed = new JuspayOperationUpdate.Failed(resultUnavailable);
                            }
                        } else {
                            if (!jusPayResultAppModel.equals(JusPayUnkonownResultAppModel.INSTANCE)) {
                                throw new NoWhenBranchMatchedException();
                            }
                            failed = new JuspayOperationUpdate.Failed(resultUnavailable);
                        }
                    } else if (jusPaySdkResultAppModel instanceof JusPaySdkResultAppModel.ShowLoader) {
                        failed = new JuspayOperationUpdate.Loading(true);
                        if (!JuspayControllerImpl.t(((JusPaySdkResultAppModel.ShowLoader) jusPaySdkResultAppModel).f4015a, str)) {
                            failed = null;
                        }
                    } else if (jusPaySdkResultAppModel instanceof JusPaySdkResultAppModel.HideLoader) {
                        failed = new JuspayOperationUpdate.Loading(false);
                        if (!JuspayControllerImpl.t(((JusPaySdkResultAppModel.HideLoader) jusPaySdkResultAppModel).f4011a, str)) {
                            failed = null;
                        }
                    } else if (jusPaySdkResultAppModel instanceof JusPaySdkResultAppModel.Error) {
                        JusPaySdkResultAppModel.Error error = (JusPaySdkResultAppModel.Error) jusPaySdkResultAppModel;
                        failed = new JuspayOperationUpdate.Failed(new JuspayOperationFailure.Error(error.f4010a));
                        if (!JuspayControllerImpl.t(error.b, str)) {
                            failed = null;
                        }
                    } else if (Intrinsics.d(jusPaySdkResultAppModel, JusPaySdkResultAppModel.SessionExpired.f4014a)) {
                        failed = new JuspayOperationUpdate.Failed(sessionExpired);
                    } else {
                        if (Intrinsics.d(jusPaySdkResultAppModel, JusPaySdkResultAppModel.ResultUnavailable.f4013a)) {
                            failed = new JuspayOperationUpdate.Failed(resultUnavailable);
                            if (!((Boolean) juspayControllerImpl.t.getValue()).booleanValue()) {
                            }
                        } else if (!Intrinsics.d(jusPaySdkResultAppModel, JusPaySdkResultAppModel.Unknown.f4016a)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        failed = null;
                    }
                    if (failed != null) {
                        JuspaySdkAdapterImpl juspaySdkAdapterImpl = juspayControllerImpl.d;
                        JuspayInitiateConditions juspayInitiateConditions = this.d;
                        if (juspaySdkAdapterImpl != null && juspayControllerImpl.q(juspayInitiateConditions)) {
                            zR = JuspayControllerImpl.r(juspaySdkAdapterImpl);
                        }
                        if (zR) {
                            juspayOperationUpdate = failed;
                        } else {
                            this.e.element = true;
                            juspayOperationUpdate = JuspayOperationUpdate.Abandoned.f4060a;
                        }
                        if (juspayOperationUpdate.a()) {
                            booleanRef.element = true;
                            if ((juspayOperationUpdate instanceof JuspayOperationUpdate.Failed) && ((JuspayOperationUpdate.Failed) juspayOperationUpdate).f4062a.equals(sessionExpired)) {
                                String str2 = this.f;
                                juspayControllerImpl.x("juspay sdk session expired", str2, null);
                                MutableStateFlow mutableStateFlow = juspayControllerImpl.f;
                                do {
                                    value = mutableStateFlow.getValue();
                                } while (!mutableStateFlow.c(value, JuspayState.a((JuspayState) value, null, JuspayUpiSessionState.Expired.f4080a, 1)));
                                if (!juspayControllerImpl.s) {
                                    juspayControllerImpl.s = true;
                                    BuildersKt.d(juspayControllerImpl.e, null, null, new JuspayControllerImpl$refreshAuthInBackground$1(juspayControllerImpl, juspayInitiateConditions, str2, null), 3);
                                }
                            }
                        }
                        juspayControllerImpl$operationFlow$1$relay$1$1$emit$1.L$0 = juspayOperationUpdate;
                        juspayControllerImpl$operationFlow$1$relay$1$1$emit$1.label = 1;
                        if (producerScope.send(juspayOperationUpdate, juspayControllerImpl$operationFlow$1$relay$1$1$emit$1) == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                    }
                }
                return unit;
            }
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            juspayOperationUpdate = (JuspayOperationUpdate) juspayControllerImpl$operationFlow$1$relay$1$1$emit$1.L$0;
            ResultKt.b(obj);
            if (juspayOperationUpdate.a()) {
                producerScope.close(null);
            }
            return unit;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public JuspayControllerImpl$operationFlow$1$relay$1(JuspayControllerImpl juspayControllerImpl, Ref.BooleanRef booleanRef, String str, JuspayInitiateConditions juspayInitiateConditions, Ref.BooleanRef booleanRef2, String str2, ProducerScope producerScope, Continuation continuation) {
        super(2, continuation);
        this.this$0 = juspayControllerImpl;
        this.$reachedTerminal = booleanRef;
        this.$requestId = str;
        this.$conditionSnapshot = juspayInitiateConditions;
        this.$requestAbandoned = booleanRef2;
        this.$source = str2;
        this.$$this$channelFlow = producerScope;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new JuspayControllerImpl$operationFlow$1$relay$1(this.this$0, this.$reachedTerminal, this.$requestId, this.$conditionSnapshot, this.$requestAbandoned, this.$source, this.$$this$channelFlow, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((JuspayControllerImpl$operationFlow$1$relay$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f17538a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            ResultKt.b(obj);
            JuspayControllerImpl juspayControllerImpl = this.this$0;
            SharedFlow sharedFlow = juspayControllerImpl.d.e;
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$reachedTerminal, juspayControllerImpl, this.$requestId, this.$conditionSnapshot, this.$requestAbandoned, this.$source, this.$$this$channelFlow);
            this.label = 1;
            if (sharedFlow.collect(anonymousClass1, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(obj);
        }
        throw new KotlinNothingValueException();
    }
}
