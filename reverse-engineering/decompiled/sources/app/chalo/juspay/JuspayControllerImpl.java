package app.chalo.juspay;

import androidx.media3.exoplayer.ExoPlayer;
import app.chalo.analytics.contract.AnalyticsContract;
import app.chalo.behaviour.policy.JuspayPolicy;
import app.chalo.behaviour.policy.ResolveJuspayPolicyUseCase;
import app.chalo.contract.BasicInfoContract;
import app.chalo.login.manager.UserProfileDetailsProviderImpl$getUserProfileDetailsAsFlow$$inlined$map$1;
import app.chalo.providers.CoroutineContextProvider;
import app.chalo.providers.UserProfileDetailsProvider;
import app.chalo.providers.cityprovider.CityProvider;
import app.chalo.providers.cityprovider.impl.data.models.app.CityAppModel;
import app.chalo.userprofile.UserProfileAppModel;
import app.chalo.utils.KAtomicRef;
import defpackage.vo1;
import java.util.Map;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CompletableDeferred;
import kotlinx.coroutines.CompletableDeferredKt;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Deferred;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.JobKt;
import kotlinx.coroutines.JobSupport;
import kotlinx.coroutines.NonCancellable;
import kotlinx.coroutines.SupervisorKt;
import kotlinx.coroutines.TimeoutKt;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1;
import kotlinx.coroutines.flow.FlowKt__ZipKt$combine$$inlined$unsafeFlow$1;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import kotlinx.coroutines.internal.ContextScope;
import kotlinx.coroutines.sync.Mutex;
import kotlinx.coroutines.sync.MutexImpl;
import kotlinx.coroutines.sync.MutexKt;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u00012\u00020\u0002:\u0003\u0003\u0004\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/juspay/JuspayControllerImpl;", "Lapp/chalo/juspay/JuspayController;", "Lapp/chalo/juspay/JuspayControllerHost;", "TerminalOutcome", "SdkReadiness", "Companion", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class JuspayControllerImpl implements JuspayController, JuspayControllerHost {
    public static final JuspaySdkStatus.InitiationFailed u = new JuspaySdkStatus.InitiationFailed(null, "juspay sdk unavailable");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final BasicInfoContract f4029a;
    public final AnalyticsContract b;
    public final ResolveJuspayPolicyUseCase c;
    public final JuspaySdkAdapterImpl d;
    public final ContextScope e;
    public final MutableStateFlow f;
    public final StateFlow g;
    public final MutexImpl h;
    public final FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1 i;
    public final KAtomicRef j;
    public final KAtomicRef k;
    public final MutexImpl l;
    public final CompletableDeferred m;
    public boolean n;
    public final Job o;
    public final Job p;
    public final MutexImpl q;
    public Deferred r;
    public boolean s;
    public final MutableStateFlow t;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0014\b\u0082\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00058\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007R\u0014\u0010\b\u001a\u00020\u00058\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\u0007R\u0014\u0010\t\u001a\u00020\u00058\u0006X\u0086T¢\u0006\u0006\n\u0004\b\t\u0010\u0007R\u0014\u0010\n\u001a\u00020\u00058\u0006X\u0086T¢\u0006\u0006\n\u0004\b\n\u0010\u0007R\u0014\u0010\u000b\u001a\u00020\u00058\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000b\u0010\u0007R\u0014\u0010\r\u001a\u00020\f8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0014\u0010\u000f\u001a\u00020\f8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000f\u0010\u000eR\u0014\u0010\u0010\u001a\u00020\f8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0010\u0010\u000eR\u0014\u0010\u0011\u001a\u00020\u00058\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0011\u0010\u0007R\u0014\u0010\u0012\u001a\u00020\f8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0012\u0010\u000eR\u0014\u0010\u0013\u001a\u00020\f8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0013\u0010\u000eR\u0014\u0010\u0014\u001a\u00020\f8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0014\u0010\u000eR\u0014\u0010\u0015\u001a\u00020\f8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0015\u0010\u000eR\u0014\u0010\u0016\u001a\u00020\f8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0016\u0010\u000eR\u0014\u0010\u0017\u001a\u00020\u00058\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0017\u0010\u0007R\u0014\u0010\u0018\u001a\u00020\f8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0018\u0010\u000eR\u0014\u0010\u0019\u001a\u00020\f8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0019\u0010\u000eR\u0014\u0010\u001a\u001a\u00020\f8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001a\u0010\u000eR\u0014\u0010\u001b\u001a\u00020\f8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001b\u0010\u000eR\u0014\u0010\u001c\u001a\u00020\f8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001c\u0010\u000eR\u0014\u0010\u001d\u001a\u00020\f8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001d\u0010\u000eR\u0014\u0010\u001e\u001a\u00020\f8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001e\u0010\u000eR\u0014\u0010\u001f\u001a\u00020\f8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001f\u0010\u000e¨\u0006 "}, d2 = {"Lapp/chalo/juspay/JuspayControllerImpl$Companion;", "", "", "MAX_INITIATE_RETRIES", "I", "", "SDK_EXCHANGE_TIMEOUT_MS", "J", "SDK_STATE_CHANGE_TIMEOUT", "SDK_STATE_CHANGE_POLL_INTERVAL", "TERMINATION_POLL_INTERVAL_MS", "TERMINATION_TIMEOUT_MS", "", "SDK_UNAVAILABLE_REASON", "Ljava/lang/String;", "TERMINATION_FAILED_REASON", "LOG_TAG", "OPERATION_HANDOVER_TIMEOUT_MS", "SDK_INITIATE_FAILED_REASON", "SDK_NOT_READY_REASON", "SESSION_EXPIRED_REASON", "RESULT_UNAVAILABLE_REASON", "TIMED_OUT_REASON", "OPERATION_RELEVANCE_CHECK_INTERVAL", "OPERATION_ACTIVE_REASON", "ATTRIBUTE_ATTEMPT", "ATTRIBUTE_EAGER_INITIALISE_ENABLED", "ATTRIBUTE_CONDITIONS_COMPLETE", "ATTRIBUTE_EAGER_INITIALISE_TRIGGER", "EAGER_INITIALISE_SOURCE", "TRIGGER_CONDITIONS_CHANGED", "TRIGGER_CONFIG_SETTLED", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\br\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\b"}, d2 = {"Lapp/chalo/juspay/JuspayControllerImpl$SdkReadiness;", "", "Ready", "NotReady", "Unknown", "Lapp/chalo/juspay/JuspayControllerImpl$SdkReadiness$NotReady;", "Lapp/chalo/juspay/JuspayControllerImpl$SdkReadiness$Ready;", "Lapp/chalo/juspay/JuspayControllerImpl$SdkReadiness$Unknown;", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public interface SdkReadiness {

        /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/juspay/JuspayControllerImpl$SdkReadiness$NotReady;", "Lapp/chalo/juspay/JuspayControllerImpl$SdkReadiness;", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class NotReady implements SdkReadiness {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final NotReady f4030a = new NotReady();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof NotReady);
            }

            public final int hashCode() {
                return -44953618;
            }

            public final String toString() {
                return "NotReady";
            }
        }

        /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/juspay/JuspayControllerImpl$SdkReadiness$Ready;", "Lapp/chalo/juspay/JuspayControllerImpl$SdkReadiness;", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class Ready implements SdkReadiness {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final Ready f4031a = new Ready();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof Ready);
            }

            public final int hashCode() {
                return -1914371835;
            }

            public final String toString() {
                return "Ready";
            }
        }

        /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/juspay/JuspayControllerImpl$SdkReadiness$Unknown;", "Lapp/chalo/juspay/JuspayControllerImpl$SdkReadiness;", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class Unknown implements SdkReadiness {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final Unknown f4032a = new Unknown();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof Unknown);
            }

            public final int hashCode() {
                return 1464369964;
            }

            public final String toString() {
                return "Unknown";
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\br\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\b"}, d2 = {"Lapp/chalo/juspay/JuspayControllerImpl$TerminalOutcome;", "", "SessionExpired", "Result", "Failed", "Lapp/chalo/juspay/JuspayControllerImpl$TerminalOutcome$Failed;", "Lapp/chalo/juspay/JuspayControllerImpl$TerminalOutcome$Result;", "Lapp/chalo/juspay/JuspayControllerImpl$TerminalOutcome$SessionExpired;", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public interface TerminalOutcome {

        /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/juspay/JuspayControllerImpl$TerminalOutcome$Failed;", "Lapp/chalo/juspay/JuspayControllerImpl$TerminalOutcome;", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class Failed implements TerminalOutcome {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final String f4033a;

            public Failed(String str) {
                this.f4033a = str;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof Failed) && Intrinsics.d(this.f4033a, ((Failed) obj).f4033a);
            }

            public final int hashCode() {
                String str = this.f4033a;
                if (str == null) {
                    return 0;
                }
                return str.hashCode();
            }

            public final String toString() {
                return vo1.B("Failed(reason=", this.f4033a, ")");
            }
        }

        /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/juspay/JuspayControllerImpl$TerminalOutcome$Result;", "Lapp/chalo/juspay/JuspayControllerImpl$TerminalOutcome;", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class Result implements TerminalOutcome {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final JusPayResultAppModel f4034a;

            public Result(JusPayResultAppModel jusPayResultAppModel) {
                this.f4034a = jusPayResultAppModel;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof Result) && Intrinsics.d(this.f4034a, ((Result) obj).f4034a);
            }

            public final int hashCode() {
                return this.f4034a.hashCode();
            }

            public final String toString() {
                return "Result(result=" + this.f4034a + ")";
            }
        }

        /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/juspay/JuspayControllerImpl$TerminalOutcome$SessionExpired;", "Lapp/chalo/juspay/JuspayControllerImpl$TerminalOutcome;", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class SessionExpired implements TerminalOutcome {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final SessionExpired f4035a = new SessionExpired();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof SessionExpired);
            }

            public final int hashCode() {
                return 2005622567;
            }

            public final String toString() {
                return "SessionExpired";
            }
        }
    }

    public JuspayControllerImpl(HyperServiceHolderSDK hyperServiceHolderSDK, CreateJusPaySDKRequestJsonUseCase createJusPaySDKRequestJsonUseCase, ProcessJuspayResultObjectUseCase processJuspayResultObjectUseCase, BasicInfoContract basicInfoContract, AnalyticsContract analyticsContract, CoroutineContextProvider coroutineContextProvider, CityProvider cityProvider, UserProfileDetailsProvider userProfileDetailsProvider, ResolveJuspayPolicyUseCase resolveJuspayPolicyUseCase) {
        this.f4029a = basicInfoContract;
        this.b = analyticsContract;
        this.c = resolveJuspayPolicyUseCase;
        this.d = new JuspaySdkAdapterImpl(createJusPaySDKRequestJsonUseCase, processJuspayResultObjectUseCase, hyperServiceHolderSDK);
        ContextScope contextScopeA = CoroutineScopeKt.a(CoroutineContext.Element.DefaultImpls.d((JobSupport) SupervisorKt.b(), coroutineContextProvider.a()));
        this.e = contextScopeA;
        MutableStateFlow mutableStateFlowA = StateFlowKt.a(new JuspayState(JuspaySdkStatus.NotInitialised.f4072a, JuspayUpiSessionState.Unknown.f4083a));
        this.f = mutableStateFlowA;
        this.g = FlowKt.c(mutableStateFlowA);
        this.h = MutexKt.a();
        final StateFlow stateFlowB = cityProvider.getE();
        Flow<String> flow = new Flow<String>() { // from class: app.chalo.juspay.JuspayControllerImpl$special$$inlined$map$1

            /* JADX INFO: renamed from: app.chalo.juspay.JuspayControllerImpl$special$$inlined$map$1$2, reason: invalid class name */
            /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
            @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
            public final class AnonymousClass2<T> implements FlowCollector {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final /* synthetic */ FlowCollector f4040a;

                /* JADX INFO: renamed from: app.chalo.juspay.JuspayControllerImpl$special$$inlined$map$1$2$1, reason: invalid class name */
                @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
                @DebugMetadata(c = "app.chalo.juspay.JuspayControllerImpl$special$$inlined$map$1$2", f = "JuspayControllerImpl.kt", l = {50}, m = "emit", v = 1)
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
                    this.f4040a = flowCollector;
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
                        CityAppModel cityAppModel = (CityAppModel) obj;
                        String str = cityAppModel != null ? cityAppModel.f8854a : null;
                        anonymousClass1.label = 1;
                        if (this.f4040a.emit(str, anonymousClass1) == coroutineSingletons) {
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
                Object objCollect = stateFlowB.collect(new AnonymousClass2(flowCollector), continuation);
                return objCollect == CoroutineSingletons.COROUTINE_SUSPENDED ? objCollect : Unit.f17538a;
            }
        };
        final UserProfileDetailsProviderImpl$getUserProfileDetailsAsFlow$$inlined$map$1 userProfileDetailsProviderImpl$getUserProfileDetailsAsFlow$$inlined$map$1E = userProfileDetailsProvider.e();
        this.i = new FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1(FlowKt.m(new FlowKt__ZipKt$combine$$inlined$unsafeFlow$1(flow, new Flow<String>() { // from class: app.chalo.juspay.JuspayControllerImpl$special$$inlined$map$2

            /* JADX INFO: renamed from: app.chalo.juspay.JuspayControllerImpl$special$$inlined$map$2$2, reason: invalid class name */
            /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
            @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
            public final class AnonymousClass2<T> implements FlowCollector {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final /* synthetic */ FlowCollector f4042a;

                /* JADX INFO: renamed from: app.chalo.juspay.JuspayControllerImpl$special$$inlined$map$2$2$1, reason: invalid class name */
                @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
                @DebugMetadata(c = "app.chalo.juspay.JuspayControllerImpl$special$$inlined$map$2$2", f = "JuspayControllerImpl.kt", l = {50}, m = "emit", v = 1)
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
                    this.f4042a = flowCollector;
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
                        UserProfileAppModel userProfileAppModel = (UserProfileAppModel) obj;
                        String str = userProfileAppModel != null ? userProfileAppModel.i : null;
                        anonymousClass1.label = 1;
                        if (this.f4042a.emit(str, anonymousClass1) == coroutineSingletons) {
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
                Object objCollect = userProfileDetailsProviderImpl$getUserProfileDetailsAsFlow$$inlined$map$1E.collect(new AnonymousClass2(flowCollector), continuation);
                return objCollect == CoroutineSingletons.COROUTINE_SUSPENDED ? objCollect : Unit.f17538a;
            }
        }, new JuspayControllerImpl$conditionsFlow$3(3, null))), new JuspayControllerImpl$conditionsFlow$4(2, null));
        this.j = new KAtomicRef(null);
        Boolean bool = Boolean.FALSE;
        this.k = new KAtomicRef(bool);
        this.l = MutexKt.a();
        this.m = CompletableDeferredKt.c();
        this.o = BuildersKt.d(contextScopeA, null, null, new JuspayControllerImpl$conditionsJob$1(this, null), 3);
        this.p = BuildersKt.d(contextScopeA, null, null, new JuspayControllerImpl$policyJob$1(this, null), 3);
        this.q = MutexKt.a();
        this.t = StateFlowKt.a(bool);
    }

    /* JADX WARN: Code duplicated, block: B:35:0x00aa  */
    /* JADX WARN: Code duplicated, block: B:39:0x00bd A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x008f, code lost:
    
        if (r10 == r1) goto L38;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object i(app.chalo.juspay.JuspayControllerImpl r7, app.chalo.juspay.JuspayInitiateConditions r8, app.chalo.juspay.JuspayInitiateConditions r9, kotlin.coroutines.jvm.internal.ContinuationImpl r10) throws java.lang.Throwable {
        /*
            r7.getClass()
            boolean r0 = r10 instanceof app.chalo.juspay.JuspayControllerImpl$onConditionsChanged$1
            if (r0 == 0) goto L16
            r0 = r10
            app.chalo.juspay.JuspayControllerImpl$onConditionsChanged$1 r0 = (app.chalo.juspay.JuspayControllerImpl$onConditionsChanged$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L16
            int r1 = r1 - r2
            r0.label = r1
            goto L1b
        L16:
            app.chalo.juspay.JuspayControllerImpl$onConditionsChanged$1 r0 = new app.chalo.juspay.JuspayControllerImpl$onConditionsChanged$1
            r0.<init>(r7, r10)
        L1b:
            java.lang.Object r10 = r0.result
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r2 = r0.label
            kotlin.Unit r3 = kotlin.Unit.f17538a
            r4 = 3
            r5 = 2
            r6 = 1
            if (r2 == 0) goto L4f
            if (r2 == r6) goto L46
            if (r2 == r5) goto L3a
            if (r2 != r4) goto L32
            kotlin.ResultKt.b(r10)
            return r3
        L32:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L3a:
            java.lang.Object r7 = r0.L$1
            app.chalo.juspay.JuspayControllerImpl r7 = (app.chalo.juspay.JuspayControllerImpl) r7
            java.lang.Object r8 = r0.L$0
            app.chalo.juspay.JuspayInitiateConditions r8 = (app.chalo.juspay.JuspayInitiateConditions) r8
            kotlin.ResultKt.b(r10)
            goto Lab
        L46:
            java.lang.Object r8 = r0.L$0
            r9 = r8
            app.chalo.juspay.JuspayInitiateConditions r9 = (app.chalo.juspay.JuspayInitiateConditions) r9
            kotlin.ResultKt.b(r10)
            goto L92
        L4f:
            kotlin.ResultKt.b(r10)
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            java.lang.String r2 = "onConditionsChanged: "
            r10.<init>(r2)
            r10.append(r8)
            java.lang.String r2 = " -- "
            r10.append(r2)
            r10.append(r9)
            java.lang.String r10 = r10.toString()
            java.lang.String r2 = "message"
            kotlin.jvm.internal.Intrinsics.i(r10, r2)
            if (r8 == 0) goto L76
            boolean r8 = r8.a()
            if (r8 != r6) goto L76
            goto L86
        L76:
            app.chalo.utils.KAtomicRef r8 = r7.k
            java.util.concurrent.atomic.AtomicReference r8 = r8.f10429a
            java.lang.Object r8 = r8.get()
            java.lang.Boolean r8 = (java.lang.Boolean) r8
            boolean r8 = r8.booleanValue()
            if (r8 == 0) goto L9b
        L86:
            r0.L$0 = r9
            r0.label = r6
            r8 = 0
            java.lang.Object r10 = r7.z(r8, r0)
            if (r10 != r1) goto L92
            goto Lbc
        L92:
            java.lang.Boolean r10 = (java.lang.Boolean) r10
            boolean r8 = r10.booleanValue()
            if (r8 != 0) goto L9b
            return r3
        L9b:
            app.chalo.behaviour.policy.ResolveJuspayPolicyUseCase r8 = r7.c
            r0.L$0 = r9
            r0.L$1 = r7
            r0.label = r5
            java.lang.Object r10 = r8.a(r0)
            if (r10 != r1) goto Laa
            goto Lbc
        Laa:
            r8 = r9
        Lab:
            app.chalo.behaviour.policy.JuspayPolicy r10 = (app.chalo.behaviour.policy.JuspayPolicy) r10
            r9 = 0
            r0.L$0 = r9
            r0.L$1 = r9
            r0.label = r4
            java.lang.String r9 = "conditions_changed"
            java.lang.Object r7 = r7.k(r10, r8, r9, r0)
            if (r7 != r1) goto Lbd
        Lbc:
            return r1
        Lbd:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: app.chalo.juspay.JuspayControllerImpl.i(app.chalo.juspay.JuspayControllerImpl, app.chalo.juspay.JuspayInitiateConditions, app.chalo.juspay.JuspayInitiateConditions, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    public static final Object j(JuspayControllerImpl juspayControllerImpl, JuspaySdkAdapter juspaySdkAdapter, JuspayInitiateConditions juspayInitiateConditions, String str, ContinuationImpl continuationImpl) {
        JuspayControllerImpl$runUpiSessionFetch$1 juspayControllerImpl$runUpiSessionFetch$1;
        JuspayUpiSessionState unavailable;
        JuspayUpiSessionState available;
        juspayControllerImpl.getClass();
        if (continuationImpl instanceof JuspayControllerImpl$runUpiSessionFetch$1) {
            juspayControllerImpl$runUpiSessionFetch$1 = (JuspayControllerImpl$runUpiSessionFetch$1) continuationImpl;
            int i = juspayControllerImpl$runUpiSessionFetch$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                juspayControllerImpl$runUpiSessionFetch$1.label = i - Integer.MIN_VALUE;
            } else {
                juspayControllerImpl$runUpiSessionFetch$1 = new JuspayControllerImpl$runUpiSessionFetch$1(juspayControllerImpl, continuationImpl);
            }
        } else {
            juspayControllerImpl$runUpiSessionFetch$1 = new JuspayControllerImpl$runUpiSessionFetch$1(juspayControllerImpl, continuationImpl);
        }
        Object objO = juspayControllerImpl$runUpiSessionFetch$1.result;
        Object obj = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = juspayControllerImpl$runUpiSessionFetch$1.label;
        if (i2 == 0) {
            ResultKt.b(objO);
            juspayControllerImpl.x("juspay action initiated", str, MapsKt.h(new Pair("action", JusPayAction.GetUpiSessionToken.getActionName())));
            JusPaySDKRequestAppModel jusPaySDKRequestAppModel = JusPaySDKRequestAppModel.GetUpiSessionToken.b;
            juspayControllerImpl$runUpiSessionFetch$1.L$0 = juspaySdkAdapter;
            juspayControllerImpl$runUpiSessionFetch$1.L$1 = juspayInitiateConditions;
            juspayControllerImpl$runUpiSessionFetch$1.L$2 = str;
            juspayControllerImpl$runUpiSessionFetch$1.label = 1;
            objO = juspayControllerImpl.o(juspaySdkAdapter, jusPaySDKRequestAppModel, juspayControllerImpl$runUpiSessionFetch$1);
            if (objO == obj) {
                return obj;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            str = (String) juspayControllerImpl$runUpiSessionFetch$1.L$2;
            juspayInitiateConditions = (JuspayInitiateConditions) juspayControllerImpl$runUpiSessionFetch$1.L$1;
            juspaySdkAdapter = (JuspaySdkAdapter) juspayControllerImpl$runUpiSessionFetch$1.L$0;
            ResultKt.b(objO);
        }
        TerminalOutcome terminalOutcome = (TerminalOutcome) objO;
        if (!juspayControllerImpl.q(juspayInitiateConditions)) {
            JuspayUpiSessionState juspayUpiSessionState = JuspayUpiSessionState.Unknown.f4083a;
            juspayControllerImpl.w(juspayUpiSessionState);
            return juspayUpiSessionState;
        }
        if (!r(juspaySdkAdapter)) {
            JuspayUpiSessionState unavailable2 = new JuspayUpiSessionState.Unavailable("sdk terminated midflight");
            juspayControllerImpl.w(unavailable2);
            return unavailable2;
        }
        if (terminalOutcome instanceof TerminalOutcome.SessionExpired) {
            juspayControllerImpl.x("juspay sdk session expired", str, null);
            if (!juspayControllerImpl.s) {
                juspayControllerImpl.s = true;
                BuildersKt.d(juspayControllerImpl.e, null, null, new JuspayControllerImpl$refreshAuthInBackground$1(juspayControllerImpl, juspayInitiateConditions, str, null), 3);
            }
        }
        if (terminalOutcome == null) {
            unavailable = new JuspayUpiSessionState.Unavailable("juspay request timed out");
        } else if (terminalOutcome.equals(TerminalOutcome.SessionExpired.f4035a)) {
            unavailable = new JuspayUpiSessionState.Unavailable("juspay session expired");
        } else if (terminalOutcome instanceof TerminalOutcome.Failed) {
            unavailable = new JuspayUpiSessionState.Unavailable(((TerminalOutcome.Failed) terminalOutcome).f4033a);
        } else {
            if (!(terminalOutcome instanceof TerminalOutcome.Result)) {
                throw new NoWhenBranchMatchedException();
            }
            JusPayResultAppModel jusPayResultAppModel = ((TerminalOutcome.Result) terminalOutcome).f4034a;
            if (jusPayResultAppModel instanceof JusPayErrorResultAppModel) {
                available = new JuspayUpiSessionState.Unavailable(((JusPayErrorResultAppModel) jusPayResultAppModel).e);
            } else if (jusPayResultAppModel instanceof JusPaySuccessResultAppModel) {
                JusPayResultDataType jusPayResultDataType = ((JusPaySuccessResultAppModel) jusPayResultAppModel).e;
                JusPayResultDataType.UpiSessionToken upiSessionToken = jusPayResultDataType instanceof JusPayResultDataType.UpiSessionToken ? (JusPayResultDataType.UpiSessionToken) jusPayResultDataType : null;
                if (upiSessionToken != null) {
                    available = new JuspayUpiSessionState.Available(upiSessionToken);
                } else {
                    unavailable = new JuspayUpiSessionState.Unavailable(null);
                }
            } else {
                if (!jusPayResultAppModel.equals(JusPayUnkonownResultAppModel.INSTANCE)) {
                    throw new NoWhenBranchMatchedException();
                }
                unavailable = new JuspayUpiSessionState.Unavailable(null);
            }
            unavailable = available;
        }
        juspayControllerImpl.w(unavailable);
        return unavailable;
    }

    public static boolean r(JuspaySdkAdapter juspaySdkAdapter) {
        SdkReadiness sdkReadinessY = y(juspaySdkAdapter);
        if (sdkReadinessY.equals(SdkReadiness.NotReady.f4030a)) {
            return false;
        }
        if (sdkReadinessY.equals(SdkReadiness.Ready.f4031a) || sdkReadinessY.equals(SdkReadiness.Unknown.f4032a)) {
            return true;
        }
        throw new NoWhenBranchMatchedException();
    }

    public static boolean t(String str, String str2) {
        if (Intrinsics.d(str, str2)) {
            return true;
        }
        if (str == null || StringsKt.F(str)) {
            vo1.x("unattributed signal adopted, awaiting=", str2, "message");
            return true;
        }
        String message = "foreign signal dropped, signalRequestId=" + str + " awaiting=" + str2;
        Intrinsics.i(message, "message");
        return false;
    }

    public static SdkReadiness y(JuspaySdkAdapter juspaySdkAdapter) {
        try {
            return juspaySdkAdapter.d() ? SdkReadiness.Ready.f4031a : SdkReadiness.NotReady.f4030a;
        } catch (Exception e) {
            String message = "readiness check fail: " + e;
            Intrinsics.i(message, "message");
            return SdkReadiness.Unknown.f4032a;
        }
    }

    /* JADX WARN: Code duplicated, block: B:100:0x0195  */
    /* JADX WARN: Code duplicated, block: B:103:0x01ab  */
    /* JADX WARN: Code duplicated, block: B:25:0x0079  */
    /* JADX WARN: Code duplicated, block: B:28:0x0087  */
    /* JADX WARN: Code duplicated, block: B:30:0x00be A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:31:0x00bf  */
    /* JADX WARN: Code duplicated, block: B:34:0x00cb  */
    /* JADX WARN: Code duplicated, block: B:35:0x00d4  */
    /* JADX WARN: Code duplicated, block: B:37:0x00dc  */
    /* JADX WARN: Code duplicated, block: B:38:0x00e4  */
    /* JADX WARN: Code duplicated, block: B:40:0x00e8  */
    /* JADX WARN: Code duplicated, block: B:41:0x00f2  */
    /* JADX WARN: Code duplicated, block: B:43:0x00f6  */
    /* JADX WARN: Code duplicated, block: B:45:0x00fe  */
    /* JADX WARN: Code duplicated, block: B:47:0x0109  */
    /* JADX WARN: Code duplicated, block: B:49:0x010d  */
    /* JADX WARN: Code duplicated, block: B:51:0x0115  */
    /* JADX WARN: Code duplicated, block: B:52:0x0118  */
    /* JADX WARN: Code duplicated, block: B:54:0x011b  */
    /* JADX WARN: Code duplicated, block: B:55:0x011e  */
    /* JADX WARN: Code duplicated, block: B:58:0x0123  */
    /* JADX WARN: Code duplicated, block: B:59:0x0125  */
    /* JADX WARN: Code duplicated, block: B:60:0x012b  */
    /* JADX WARN: Code duplicated, block: B:62:0x0133  */
    /* JADX WARN: Code duplicated, block: B:66:0x013f  */
    /* JADX WARN: Code duplicated, block: B:68:0x0143  */
    /* JADX WARN: Code duplicated, block: B:69:0x0147  */
    /* JADX WARN: Code duplicated, block: B:71:0x014a  */
    /* JADX WARN: Code duplicated, block: B:72:0x014d  */
    /* JADX WARN: Code duplicated, block: B:79:0x015e  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code duplicated, block: B:81:0x0164  */
    /* JADX WARN: Code duplicated, block: B:87:0x0173  */
    /* JADX WARN: Code duplicated, block: B:91:0x017e  */
    /* JADX WARN: Code duplicated, block: B:93:0x0182  */
    /* JADX WARN: Code duplicated, block: B:97:0x018f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:31:0x00bf -> B:32:0x00c4). Please report as a decompilation issue!!! */
    public final Object A(JuspayInitiateConditions juspayInitiateConditions, String str, ContinuationImpl continuationImpl) {
        JuspayControllerImpl$runInitiate$1 juspayControllerImpl$runInitiate$1;
        JusPaySDKRequestAppModel.InitiateSDK initiateSDK;
        JuspayInitiateConditions juspayInitiateConditions2;
        int i;
        JuspaySdkStatus initiationFailed;
        JuspaySdkAdapter juspaySdkAdapter;
        String str2;
        JuspaySdkStatus.InitiationFailed initiationFailed2;
        JusPaySDKInitiateStatus jusPaySDKInitiateStatus;
        String strName;
        Object objO;
        String str3;
        JuspayInitiateConditions juspayInitiateConditions3;
        JuspayControllerImpl juspayControllerImpl;
        JusPayResultAppModel jusPayResultAppModel;
        JuspaySdkStatus initiationFailed3;
        JusPayResultDataType jusPayResultDataType;
        JusPayResultDataType.InitiateSDK initiateSDK2;
        JusPaySDKInitiateStatus jusPaySDKInitiateStatus2;
        JuspaySdkStatus.InitiationFailed initiationFailed4;
        JuspaySdkStatus.InitiationFailed initiationFailed5;
        JusPaySDKInitiateStatus jusPaySDKInitiateStatus3;
        if (continuationImpl instanceof JuspayControllerImpl$runInitiate$1) {
            juspayControllerImpl$runInitiate$1 = (JuspayControllerImpl$runInitiate$1) continuationImpl;
            int i2 = juspayControllerImpl$runInitiate$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                juspayControllerImpl$runInitiate$1.label = i2 - Integer.MIN_VALUE;
            } else {
                juspayControllerImpl$runInitiate$1 = new JuspayControllerImpl$runInitiate$1(this, continuationImpl);
            }
        } else {
            juspayControllerImpl$runInitiate$1 = new JuspayControllerImpl$runInitiate$1(this, continuationImpl);
        }
        Object obj = juspayControllerImpl$runInitiate$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i3 = juspayControllerImpl$runInitiate$1.label;
        JuspaySdkStatus.Ready ready = JuspaySdkStatus.Ready.f4073a;
        if (i3 == 0) {
            ResultKt.b(obj);
            JuspaySdkAdapterImpl juspaySdkAdapterImpl = this.d;
            if (juspaySdkAdapterImpl == null) {
                return new JuspayInitiateResult.Failed(u);
            }
            initiateSDK = new JusPaySDKRequestAppModel.InitiateSDK(this.f4029a.f() ? JusPayEnvironment.Sandbox : JusPayEnvironment.Production);
            juspayInitiateConditions2 = juspayInitiateConditions;
            i = 0;
            initiationFailed = new JuspaySdkStatus.InitiationFailed(null, null);
            juspaySdkAdapter = juspaySdkAdapterImpl;
            str2 = str;
            if (i < 4) {
                if (!initiationFailed.equals(ready)) {
                    if (!initiationFailed.equals(JuspaySdkStatus.Abandoned.f4069a)) {
                        if (initiationFailed instanceof JuspaySdkStatus.InitiationFailed) {
                            if (!(initiationFailed instanceof JuspaySdkStatus.Initialising) || initiationFailed.equals(JuspaySdkStatus.NotInitialised.f4072a) || initiationFailed.equals(JuspaySdkStatus.Terminating.f4074a) || (initiationFailed instanceof JuspaySdkStatus.TerminationFailed)) {
                                return JuspayInitiateResult.SdkStateUnknown.f4050a;
                            }
                            throw new NoWhenBranchMatchedException();
                        }
                        initiationFailed2 = (JuspaySdkStatus.InitiationFailed) initiationFailed;
                        jusPaySDKInitiateStatus = initiationFailed2.f4071a;
                        if (jusPaySDKInitiateStatus != null || (strName = jusPaySDKInitiateStatus.name()) == null) {
                            strName = initiationFailed2.b;
                        }
                        if (strName == null) {
                            strName = "juspay sdk initiate failed";
                        }
                        x("juspay sdk initiate failed", str2, MapsKt.h(new Pair("reason", strName)));
                        return new JuspayInitiateResult.Failed(initiationFailed);
                    }
                    return JuspayInitiateResult.Abandoned.f4047a;
                }
            } else if (!y(juspaySdkAdapter).equals(SdkReadiness.Ready.f4031a)) {
                int i4 = i + 1;
                v(new JuspaySdkStatus.Initialising(new Integer(i4)));
                x("juspay sdk initiate request", str2, MapsKt.h(new Pair("attempt", String.valueOf(i4))));
                juspayControllerImpl$runInitiate$1.L$0 = juspayInitiateConditions2;
                juspayControllerImpl$runInitiate$1.L$1 = str2;
                juspayControllerImpl$runInitiate$1.L$2 = juspaySdkAdapter;
                juspayControllerImpl$runInitiate$1.L$3 = initiateSDK;
                juspayControllerImpl$runInitiate$1.L$4 = this;
                juspayControllerImpl$runInitiate$1.I$0 = i;
                juspayControllerImpl$runInitiate$1.label = 1;
                objO = o(juspaySdkAdapter, initiateSDK, juspayControllerImpl$runInitiate$1);
                if (objO == coroutineSingletons) {
                    return coroutineSingletons;
                }
                str3 = str2;
                obj = objO;
                juspayInitiateConditions3 = juspayInitiateConditions2;
                juspayControllerImpl = this;
            }
            return JuspayInitiateResult.Ready.f4049a;
        }
        if (i3 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        i = juspayControllerImpl$runInitiate$1.I$0;
        juspayControllerImpl = (JuspayControllerImpl) juspayControllerImpl$runInitiate$1.L$4;
        initiateSDK = (JusPaySDKRequestAppModel.InitiateSDK) juspayControllerImpl$runInitiate$1.L$3;
        juspaySdkAdapter = (JuspaySdkAdapter) juspayControllerImpl$runInitiate$1.L$2;
        str3 = (String) juspayControllerImpl$runInitiate$1.L$1;
        juspayInitiateConditions3 = (JuspayInitiateConditions) juspayControllerImpl$runInitiate$1.L$0;
        ResultKt.b(obj);
        TerminalOutcome terminalOutcome = (TerminalOutcome) obj;
        juspayControllerImpl.getClass();
        if (terminalOutcome != null) {
            initiationFailed3 = new JuspaySdkStatus.InitiationFailed(null, "juspay request timed out");
        } else if (!terminalOutcome.equals(TerminalOutcome.SessionExpired.f4035a)) {
            initiationFailed3 = new JuspaySdkStatus.InitiationFailed(null, "juspay session expired");
        } else if (!(terminalOutcome instanceof TerminalOutcome.Failed)) {
            initiationFailed3 = new JuspaySdkStatus.InitiationFailed(null, ((TerminalOutcome.Failed) terminalOutcome).f4033a);
        } else {
            if (terminalOutcome instanceof TerminalOutcome.Result) {
                throw new NoWhenBranchMatchedException();
            }
            jusPayResultAppModel = ((TerminalOutcome.Result) terminalOutcome).f4034a;
            if (!(jusPayResultAppModel instanceof JusPayErrorResultAppModel)) {
                initiationFailed4 = new JuspaySdkStatus.InitiationFailed(null, ((JusPayErrorResultAppModel) jusPayResultAppModel).e);
            } else if (!(jusPayResultAppModel instanceof JusPaySuccessResultAppModel)) {
                jusPayResultDataType = ((JusPaySuccessResultAppModel) jusPayResultAppModel).e;
                if (jusPayResultDataType instanceof JusPayResultDataType.InitiateSDK) {
                    initiateSDK2 = (JusPayResultDataType.InitiateSDK) jusPayResultDataType;
                } else {
                    initiateSDK2 = null;
                }
                if (initiateSDK2 != null) {
                    jusPaySDKInitiateStatus2 = initiateSDK2.b;
                } else {
                    jusPaySDKInitiateStatus2 = null;
                }
                if (jusPaySDKInitiateStatus2 == JusPaySDKInitiateStatus.Success) {
                    initiationFailed3 = ready;
                } else {
                    initiationFailed4 = new JuspaySdkStatus.InitiationFailed(jusPaySDKInitiateStatus2, null);
                }
            } else {
                if (jusPayResultAppModel.equals(JusPayUnkonownResultAppModel.INSTANCE)) {
                    throw new NoWhenBranchMatchedException();
                }
                initiationFailed3 = new JuspaySdkStatus.InitiationFailed(null, null);
            }
            initiationFailed3 = initiationFailed4;
        }
        if (q(juspayInitiateConditions3)) {
            if (initiationFailed3 instanceof JuspaySdkStatus.InitiationFailed) {
                initiationFailed5 = (JuspaySdkStatus.InitiationFailed) initiationFailed3;
            } else {
                initiationFailed5 = null;
            }
            if (initiationFailed5 != null) {
                jusPaySDKInitiateStatus3 = initiationFailed5.f4071a;
            } else {
                jusPaySDKInitiateStatus3 = null;
            }
            if (jusPaySDKInitiateStatus3 == null && jusPaySDKInitiateStatus3 != JusPaySDKInitiateStatus.Success) {
                i++;
                str2 = str3;
                initiationFailed = initiationFailed3;
                juspayInitiateConditions2 = juspayInitiateConditions3;
                if (i < 4) {
                    if (!y(juspaySdkAdapter).equals(SdkReadiness.Ready.f4031a)) {
                        int i5 = i + 1;
                        v(new JuspaySdkStatus.Initialising(new Integer(i5)));
                        x("juspay sdk initiate request", str2, MapsKt.h(new Pair("attempt", String.valueOf(i5))));
                        juspayControllerImpl$runInitiate$1.L$0 = juspayInitiateConditions2;
                        juspayControllerImpl$runInitiate$1.L$1 = str2;
                        juspayControllerImpl$runInitiate$1.L$2 = juspaySdkAdapter;
                        juspayControllerImpl$runInitiate$1.L$3 = initiateSDK;
                        juspayControllerImpl$runInitiate$1.L$4 = this;
                        juspayControllerImpl$runInitiate$1.I$0 = i;
                        juspayControllerImpl$runInitiate$1.label = 1;
                        objO = o(juspaySdkAdapter, initiateSDK, juspayControllerImpl$runInitiate$1);
                        if (objO == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                        str3 = str2;
                        obj = objO;
                        juspayInitiateConditions3 = juspayInitiateConditions2;
                        juspayControllerImpl = this;
                        TerminalOutcome terminalOutcome2 = (TerminalOutcome) obj;
                        juspayControllerImpl.getClass();
                        if (terminalOutcome2 != null) {
                            initiationFailed3 = new JuspaySdkStatus.InitiationFailed(null, "juspay request timed out");
                        } else if (!terminalOutcome2.equals(TerminalOutcome.SessionExpired.f4035a)) {
                            initiationFailed3 = new JuspaySdkStatus.InitiationFailed(null, "juspay session expired");
                        } else if (!(terminalOutcome2 instanceof TerminalOutcome.Failed)) {
                            initiationFailed3 = new JuspaySdkStatus.InitiationFailed(null, ((TerminalOutcome.Failed) terminalOutcome2).f4033a);
                        } else {
                            if (terminalOutcome2 instanceof TerminalOutcome.Result) {
                                throw new NoWhenBranchMatchedException();
                            }
                            jusPayResultAppModel = ((TerminalOutcome.Result) terminalOutcome2).f4034a;
                            if (!(jusPayResultAppModel instanceof JusPayErrorResultAppModel)) {
                                initiationFailed4 = new JuspaySdkStatus.InitiationFailed(null, ((JusPayErrorResultAppModel) jusPayResultAppModel).e);
                            } else if (!(jusPayResultAppModel instanceof JusPaySuccessResultAppModel)) {
                                jusPayResultDataType = ((JusPaySuccessResultAppModel) jusPayResultAppModel).e;
                                if (jusPayResultDataType instanceof JusPayResultDataType.InitiateSDK) {
                                    initiateSDK2 = (JusPayResultDataType.InitiateSDK) jusPayResultDataType;
                                } else {
                                    initiateSDK2 = null;
                                }
                                if (initiateSDK2 != null) {
                                    jusPaySDKInitiateStatus2 = initiateSDK2.b;
                                } else {
                                    jusPaySDKInitiateStatus2 = null;
                                }
                                if (jusPaySDKInitiateStatus2 == JusPaySDKInitiateStatus.Success) {
                                    initiationFailed3 = ready;
                                } else {
                                    initiationFailed4 = new JuspaySdkStatus.InitiationFailed(jusPaySDKInitiateStatus2, null);
                                }
                            } else {
                                if (jusPayResultAppModel.equals(JusPayUnkonownResultAppModel.INSTANCE)) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                initiationFailed3 = new JuspaySdkStatus.InitiationFailed(null, null);
                            }
                            initiationFailed3 = initiationFailed4;
                        }
                        if (q(juspayInitiateConditions3)) {
                            if (initiationFailed3 instanceof JuspaySdkStatus.InitiationFailed) {
                                initiationFailed5 = (JuspaySdkStatus.InitiationFailed) initiationFailed3;
                            } else {
                                initiationFailed5 = null;
                            }
                            if (initiationFailed5 != null) {
                                jusPaySDKInitiateStatus3 = initiationFailed5.f4071a;
                            } else {
                                jusPaySDKInitiateStatus3 = null;
                            }
                            if (jusPaySDKInitiateStatus3 == null) {
                            }
                            str2 = str3;
                            initiationFailed = initiationFailed3;
                        }
                    }
                }
                return JuspayInitiateResult.Ready.f4049a;
            }
            str2 = str3;
            initiationFailed = initiationFailed3;
            if (!initiationFailed.equals(ready)) {
                if (!initiationFailed.equals(JuspaySdkStatus.Abandoned.f4069a)) {
                    if (initiationFailed instanceof JuspaySdkStatus.InitiationFailed) {
                        if (initiationFailed instanceof JuspaySdkStatus.Initialising) {
                        }
                        return JuspayInitiateResult.SdkStateUnknown.f4050a;
                    }
                    initiationFailed2 = (JuspaySdkStatus.InitiationFailed) initiationFailed;
                    jusPaySDKInitiateStatus = initiationFailed2.f4071a;
                    if (jusPaySDKInitiateStatus != null) {
                        strName = initiationFailed2.b;
                    } else {
                        strName = initiationFailed2.b;
                    }
                    if (strName == null) {
                        strName = "juspay sdk initiate failed";
                    }
                    x("juspay sdk initiate failed", str2, MapsKt.h(new Pair("reason", strName)));
                    return new JuspayInitiateResult.Failed(initiationFailed);
                }
            }
            return JuspayInitiateResult.Ready.f4049a;
        }
        return JuspayInitiateResult.Abandoned.f4047a;
    }

    @Override // app.chalo.juspay.JuspayControllerHost
    public final void a(int i, int i2, Object obj) {
        this.d.c.a(i, i2, obj);
    }

    /* JADX WARN: Code duplicated, block: B:35:0x00aa  */
    /* JADX WARN: Code duplicated, block: B:37:0x00b5  */
    /* JADX WARN: Code duplicated, block: B:40:0x00c4 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // app.chalo.juspay.JuspayController
    public final Object c(String str, ContinuationImpl continuationImpl) throws Throwable {
        JuspayControllerImpl$refreshUpiSession$1 juspayControllerImpl$refreshUpiSession$1;
        String str2;
        JuspayInitiateConditions juspayInitiateConditions;
        if (continuationImpl instanceof JuspayControllerImpl$refreshUpiSession$1) {
            juspayControllerImpl$refreshUpiSession$1 = (JuspayControllerImpl$refreshUpiSession$1) continuationImpl;
            int i = juspayControllerImpl$refreshUpiSession$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                juspayControllerImpl$refreshUpiSession$1.label = i - Integer.MIN_VALUE;
            } else {
                juspayControllerImpl$refreshUpiSession$1 = new JuspayControllerImpl$refreshUpiSession$1(this, continuationImpl);
            }
        } else {
            juspayControllerImpl$refreshUpiSession$1 = new JuspayControllerImpl$refreshUpiSession$1(this, continuationImpl);
        }
        Object objC = juspayControllerImpl$refreshUpiSession$1.result;
        Object obj = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = juspayControllerImpl$refreshUpiSession$1.label;
        Unit unit = Unit.f17538a;
        if (i2 == 0) {
            ResultKt.b(objC);
            JuspayControllerImpl$refreshUpiSession$2 juspayControllerImpl$refreshUpiSession$2 = new JuspayControllerImpl$refreshUpiSession$2(this, null);
            juspayControllerImpl$refreshUpiSession$1.L$0 = str;
            juspayControllerImpl$refreshUpiSession$1.label = 1;
            objC = TimeoutKt.c(30000L, juspayControllerImpl$refreshUpiSession$2, juspayControllerImpl$refreshUpiSession$1);
            if (objC != obj) {
            }
            return obj;
        }
        if (i2 == 1) {
            str = (String) juspayControllerImpl$refreshUpiSession$1.L$0;
            ResultKt.b(objC);
        } else {
            if (i2 != 2) {
                if (i2 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.b(objC);
                return unit;
            }
            juspayInitiateConditions = (JuspayInitiateConditions) juspayControllerImpl$refreshUpiSession$1.L$1;
            str2 = (String) juspayControllerImpl$refreshUpiSession$1.L$0;
            ResultKt.b(objC);
        }
        if (!Intrinsics.d(JuspayControllerImplKt.a((JuspayInitiateResult) objC), JuspaySdkStatus.Ready.f4073a)) {
            w(new JuspayUpiSessionState.Unavailable("Something went wrong"));
            return unit;
        }
        juspayControllerImpl$refreshUpiSession$1.L$0 = null;
        juspayControllerImpl$refreshUpiSession$1.L$1 = null;
        juspayControllerImpl$refreshUpiSession$1.label = 3;
        if (p(this.d, juspayInitiateConditions, str2, juspayControllerImpl$refreshUpiSession$1) != obj) {
            return obj;
        }
        return unit;
        if (objC == null) {
            w(new JuspayUpiSessionState.Unavailable("juspay operation still active"));
            return unit;
        }
        JuspayInitiateConditions juspayInitiateConditions2 = (JuspayInitiateConditions) this.j.f10429a.get();
        if (juspayInitiateConditions2 == null) {
            w(new JuspayUpiSessionState.Unavailable("sdk initiate conditions unavailable"));
            return unit;
        }
        w(JuspayUpiSessionState.Fetching.f4081a);
        juspayControllerImpl$refreshUpiSession$1.L$0 = str;
        juspayControllerImpl$refreshUpiSession$1.L$1 = juspayInitiateConditions2;
        juspayControllerImpl$refreshUpiSession$1.label = 2;
        Object objN = n(juspayInitiateConditions2, str, juspayControllerImpl$refreshUpiSession$1);
        if (objN != obj) {
            str2 = str;
            juspayInitiateConditions = juspayInitiateConditions2;
            objC = objN;
            if (!Intrinsics.d(JuspayControllerImplKt.a((JuspayInitiateResult) objC), JuspaySdkStatus.Ready.f4073a)) {
                w(new JuspayUpiSessionState.Unavailable("Something went wrong"));
                return unit;
            }
            juspayControllerImpl$refreshUpiSession$1.L$0 = null;
            juspayControllerImpl$refreshUpiSession$1.L$1 = null;
            juspayControllerImpl$refreshUpiSession$1.label = 3;
            if (p(this.d, juspayInitiateConditions, str2, juspayControllerImpl$refreshUpiSession$1) != obj) {
                return unit;
            }
        }
        return obj;
    }

    @Override // app.chalo.juspay.JuspayController
    public final Flow d(String source) {
        Intrinsics.i(source, "source");
        return FlowKt.h(new JuspayControllerImpl$operationFlow$1(this, source, JusPaySDKRequestAppModel.AccountManagement.b, null));
    }

    @Override // app.chalo.juspay.JuspayController
    public final Flow e(String amount, String str, String chaloOrderId, String productType, String source) {
        Intrinsics.i(amount, "amount");
        Intrinsics.i(chaloOrderId, "chaloOrderId");
        Intrinsics.i(productType, "productType");
        Intrinsics.i(source, "source");
        return FlowKt.h(new JuspayControllerImpl$operationFlow$1(this, source, new JusPaySDKRequestAppModel.OnBoardingAndPay(amount, str, chaloOrderId, productType), null));
    }

    @Override // app.chalo.juspay.JuspayController
    public final Flow f(String source) {
        Intrinsics.i(source, "source");
        return FlowKt.h(new JuspayControllerImpl$operationFlow$1(this, source, new JusPaySDKRequestAppModel.UpiUiScanPay(), null));
    }

    @Override // app.chalo.juspay.JuspayControllerHost
    public final Object g(SuspendLambda suspendLambda) throws Throwable {
        this.n = true;
        CompletableDeferred completableDeferred = this.m;
        Unit unit = Unit.f17538a;
        completableDeferred.complete(unit);
        ((JobSupport) this.o).cancel(null);
        ((JobSupport) this.p).cancel(null);
        Object objG = BuildersKt.g(NonCancellable.f17739a, new JuspayControllerImpl$dispose$2(this, null), suspendLambda);
        return objG == CoroutineSingletons.COROUTINE_SUSPENDED ? objG : unit;
    }

    @Override // app.chalo.juspay.JuspayController
    /* JADX INFO: renamed from: getState, reason: from getter */
    public final StateFlow getG() {
        return this.g;
    }

    @Override // app.chalo.juspay.JuspayControllerHost
    public final boolean h() {
        return ((Boolean) this.t.getValue()).booleanValue() || this.h.d();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object k(JuspayPolicy juspayPolicy, JuspayInitiateConditions juspayInitiateConditions, String str, ContinuationImpl continuationImpl) throws Throwable {
        JuspayControllerImpl$applyEagerInitialisePolicy$1 juspayControllerImpl$applyEagerInitialisePolicy$1;
        if (continuationImpl instanceof JuspayControllerImpl$applyEagerInitialisePolicy$1) {
            juspayControllerImpl$applyEagerInitialisePolicy$1 = (JuspayControllerImpl$applyEagerInitialisePolicy$1) continuationImpl;
            int i = juspayControllerImpl$applyEagerInitialisePolicy$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                juspayControllerImpl$applyEagerInitialisePolicy$1.label = i - Integer.MIN_VALUE;
            } else {
                juspayControllerImpl$applyEagerInitialisePolicy$1 = new JuspayControllerImpl$applyEagerInitialisePolicy$1(this, continuationImpl);
            }
        } else {
            juspayControllerImpl$applyEagerInitialisePolicy$1 = new JuspayControllerImpl$applyEagerInitialisePolicy$1(this, continuationImpl);
        }
        Object objN = juspayControllerImpl$applyEagerInitialisePolicy$1.result;
        Object obj = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = juspayControllerImpl$applyEagerInitialisePolicy$1.label;
        Unit unit = Unit.f17538a;
        if (i2 == 0) {
            ResultKt.b(objN);
            boolean z = juspayPolicy.f1003a;
            boolean z2 = juspayInitiateConditions != null && juspayInitiateConditions.a();
            x("juspay sdk eager initialise policy resolved", "juspay_eager_initialise", MapsKt.i(new Pair("eagerInitialiseEnabled", Boolean.valueOf(z)), new Pair("conditionsComplete", Boolean.valueOf(z2)), new Pair("eagerInitialiseTrigger", str)));
            if (!z) {
                String message = str + " eager initialise disabled by policy";
                Intrinsics.i(message, "message");
                u();
                return unit;
            }
            if (this.n || !z2) {
                String message2 = str + " skipping eager initialise";
                Intrinsics.i(message2, "message");
                u();
                return unit;
            }
            juspayControllerImpl$applyEagerInitialisePolicy$1.L$0 = str;
            juspayControllerImpl$applyEagerInitialisePolicy$1.label = 1;
            objN = n(juspayInitiateConditions, "juspay_eager_initialise", juspayControllerImpl$applyEagerInitialisePolicy$1);
            if (objN == obj) {
                return obj;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            str = (String) juspayControllerImpl$applyEagerInitialisePolicy$1.L$0;
            ResultKt.b(objN);
        }
        String message3 = str + " eager initialise result: " + ((JuspayInitiateResult) objN);
        Intrinsics.i(message3, "message");
        return unit;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object l(JuspaySdkAdapter juspaySdkAdapter, SdkReadiness sdkReadiness, ContinuationImpl continuationImpl) {
        JuspayControllerImpl$awaitSdkState$1 juspayControllerImpl$awaitSdkState$1;
        if (continuationImpl instanceof JuspayControllerImpl$awaitSdkState$1) {
            juspayControllerImpl$awaitSdkState$1 = (JuspayControllerImpl$awaitSdkState$1) continuationImpl;
            int i = juspayControllerImpl$awaitSdkState$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                juspayControllerImpl$awaitSdkState$1.label = i - Integer.MIN_VALUE;
            } else {
                juspayControllerImpl$awaitSdkState$1 = new JuspayControllerImpl$awaitSdkState$1(this, continuationImpl);
            }
        } else {
            juspayControllerImpl$awaitSdkState$1 = new JuspayControllerImpl$awaitSdkState$1(this, continuationImpl);
        }
        Object objC = juspayControllerImpl$awaitSdkState$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = juspayControllerImpl$awaitSdkState$1.label;
        if (i2 == 0) {
            ResultKt.b(objC);
            JuspayControllerImpl$awaitSdkState$2 juspayControllerImpl$awaitSdkState$2 = new JuspayControllerImpl$awaitSdkState$2(this, juspaySdkAdapter, sdkReadiness, null);
            juspayControllerImpl$awaitSdkState$1.L$0 = juspaySdkAdapter;
            juspayControllerImpl$awaitSdkState$1.label = 1;
            objC = TimeoutKt.c(ExoPlayer.DEFAULT_DETACH_SURFACE_TIMEOUT_MS, juspayControllerImpl$awaitSdkState$2, juspayControllerImpl$awaitSdkState$1);
            if (objC == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            juspaySdkAdapter = (JuspaySdkAdapter) juspayControllerImpl$awaitSdkState$1.L$0;
            ResultKt.b(objC);
        }
        SdkReadiness sdkReadiness2 = (SdkReadiness) objC;
        return sdkReadiness2 == null ? y(juspaySdkAdapter) : sdkReadiness2;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object m(ContinuationImpl continuationImpl) throws Throwable {
        JuspayControllerImpl$cancelInFlightUpiSession$1 juspayControllerImpl$cancelInFlightUpiSession$1;
        Mutex mutex;
        Mutex mutex2;
        Throwable th;
        if (continuationImpl instanceof JuspayControllerImpl$cancelInFlightUpiSession$1) {
            juspayControllerImpl$cancelInFlightUpiSession$1 = (JuspayControllerImpl$cancelInFlightUpiSession$1) continuationImpl;
            int i = juspayControllerImpl$cancelInFlightUpiSession$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                juspayControllerImpl$cancelInFlightUpiSession$1.label = i - Integer.MIN_VALUE;
            } else {
                juspayControllerImpl$cancelInFlightUpiSession$1 = new JuspayControllerImpl$cancelInFlightUpiSession$1(this, continuationImpl);
            }
        } else {
            juspayControllerImpl$cancelInFlightUpiSession$1 = new JuspayControllerImpl$cancelInFlightUpiSession$1(this, continuationImpl);
        }
        Object obj = juspayControllerImpl$cancelInFlightUpiSession$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = juspayControllerImpl$cancelInFlightUpiSession$1.label;
        try {
            if (i2 == 0) {
                ResultKt.b(obj);
                mutex = this.q;
                juspayControllerImpl$cancelInFlightUpiSession$1.L$0 = mutex;
                juspayControllerImpl$cancelInFlightUpiSession$1.label = 1;
                if (mutex.a(juspayControllerImpl$cancelInFlightUpiSession$1) != coroutineSingletons) {
                }
                return coroutineSingletons;
            }
            if (i2 != 1) {
                if (i2 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                mutex2 = (Mutex) juspayControllerImpl$cancelInFlightUpiSession$1.L$0;
                try {
                    ResultKt.b(obj);
                    mutex = mutex2;
                    mutex.e(null);
                    return Unit.f17538a;
                } catch (Throwable th2) {
                    th = th2;
                    mutex2.e(null);
                    throw th;
                }
            }
            Mutex mutex3 = (Mutex) juspayControllerImpl$cancelInFlightUpiSession$1.L$0;
            ResultKt.b(obj);
            mutex = mutex3;
            Deferred deferred = this.r;
            this.r = null;
            if (deferred != null) {
                juspayControllerImpl$cancelInFlightUpiSession$1.L$0 = mutex;
                juspayControllerImpl$cancelInFlightUpiSession$1.label = 2;
                if (JobKt.d(deferred, juspayControllerImpl$cancelInFlightUpiSession$1) != coroutineSingletons) {
                    mutex2 = mutex;
                    mutex = mutex2;
                }
                return coroutineSingletons;
            }
            mutex.e(null);
            return Unit.f17538a;
        } catch (Throwable th3) {
            mutex2 = mutex;
            th = th3;
            mutex2.e(null);
            throw th;
        }
    }

    /* JADX WARN: Code duplicated, block: B:100:0x01df  */
    /* JADX WARN: Code duplicated, block: B:103:0x01e6  */
    /* JADX WARN: Code duplicated, block: B:105:0x01ea A[Catch: all -> 0x0189, TRY_ENTER, TryCatch #1 {all -> 0x0189, blocks: (B:93:0x01b4, B:101:0x01e0, B:105:0x01ea, B:108:0x01f1, B:110:0x01f5, B:111:0x01fe, B:115:0x020b, B:117:0x0213, B:147:0x0297, B:148:0x029c, B:63:0x014f, B:68:0x015c, B:76:0x0177, B:78:0x0181, B:83:0x018d, B:85:0x0193, B:88:0x019a, B:89:0x019f, B:90:0x01a0), top: B:153:0x014f }] */
    /* JADX WARN: Code duplicated, block: B:107:0x01f0  */
    /* JADX WARN: Code duplicated, block: B:108:0x01f1 A[Catch: all -> 0x0189, TryCatch #1 {all -> 0x0189, blocks: (B:93:0x01b4, B:101:0x01e0, B:105:0x01ea, B:108:0x01f1, B:110:0x01f5, B:111:0x01fe, B:115:0x020b, B:117:0x0213, B:147:0x0297, B:148:0x029c, B:63:0x014f, B:68:0x015c, B:76:0x0177, B:78:0x0181, B:83:0x018d, B:85:0x0193, B:88:0x019a, B:89:0x019f, B:90:0x01a0), top: B:153:0x014f }] */
    /* JADX WARN: Code duplicated, block: B:110:0x01f5 A[Catch: all -> 0x0189, TryCatch #1 {all -> 0x0189, blocks: (B:93:0x01b4, B:101:0x01e0, B:105:0x01ea, B:108:0x01f1, B:110:0x01f5, B:111:0x01fe, B:115:0x020b, B:117:0x0213, B:147:0x0297, B:148:0x029c, B:63:0x014f, B:68:0x015c, B:76:0x0177, B:78:0x0181, B:83:0x018d, B:85:0x0193, B:88:0x019a, B:89:0x019f, B:90:0x01a0), top: B:153:0x014f }] */
    /* JADX WARN: Code duplicated, block: B:111:0x01fe A[Catch: all -> 0x0189, TryCatch #1 {all -> 0x0189, blocks: (B:93:0x01b4, B:101:0x01e0, B:105:0x01ea, B:108:0x01f1, B:110:0x01f5, B:111:0x01fe, B:115:0x020b, B:117:0x0213, B:147:0x0297, B:148:0x029c, B:63:0x014f, B:68:0x015c, B:76:0x0177, B:78:0x0181, B:83:0x018d, B:85:0x0193, B:88:0x019a, B:89:0x019f, B:90:0x01a0), top: B:153:0x014f }] */
    /* JADX WARN: Code duplicated, block: B:115:0x020b A[Catch: all -> 0x0189, TryCatch #1 {all -> 0x0189, blocks: (B:93:0x01b4, B:101:0x01e0, B:105:0x01ea, B:108:0x01f1, B:110:0x01f5, B:111:0x01fe, B:115:0x020b, B:117:0x0213, B:147:0x0297, B:148:0x029c, B:63:0x014f, B:68:0x015c, B:76:0x0177, B:78:0x0181, B:83:0x018d, B:85:0x0193, B:88:0x019a, B:89:0x019f, B:90:0x01a0), top: B:153:0x014f }] */
    /* JADX WARN: Code duplicated, block: B:117:0x0213 A[Catch: all -> 0x0189, TRY_LEAVE, TryCatch #1 {all -> 0x0189, blocks: (B:93:0x01b4, B:101:0x01e0, B:105:0x01ea, B:108:0x01f1, B:110:0x01f5, B:111:0x01fe, B:115:0x020b, B:117:0x0213, B:147:0x0297, B:148:0x029c, B:63:0x014f, B:68:0x015c, B:76:0x0177, B:78:0x0181, B:83:0x018d, B:85:0x0193, B:88:0x019a, B:89:0x019f, B:90:0x01a0), top: B:153:0x014f }] */
    /* JADX WARN: Code duplicated, block: B:120:0x0224  */
    /* JADX WARN: Code duplicated, block: B:128:0x0252  */
    /* JADX WARN: Code duplicated, block: B:131:0x0259  */
    /* JADX WARN: Code duplicated, block: B:133:0x025d A[Catch: all -> 0x005f, TRY_ENTER, TryCatch #4 {all -> 0x005f, blocks: (B:19:0x0056, B:121:0x0225, B:129:0x0253, B:133:0x025d, B:135:0x0263, B:136:0x0268, B:138:0x026e, B:139:0x027d, B:141:0x0283, B:145:0x0291, B:146:0x0296, B:26:0x0078), top: B:158:0x003f }] */
    /* JADX WARN: Code duplicated, block: B:135:0x0263 A[Catch: all -> 0x005f, TryCatch #4 {all -> 0x005f, blocks: (B:19:0x0056, B:121:0x0225, B:129:0x0253, B:133:0x025d, B:135:0x0263, B:136:0x0268, B:138:0x026e, B:139:0x027d, B:141:0x0283, B:145:0x0291, B:146:0x0296, B:26:0x0078), top: B:158:0x003f }] */
    /* JADX WARN: Code duplicated, block: B:136:0x0268 A[Catch: all -> 0x005f, TryCatch #4 {all -> 0x005f, blocks: (B:19:0x0056, B:121:0x0225, B:129:0x0253, B:133:0x025d, B:135:0x0263, B:136:0x0268, B:138:0x026e, B:139:0x027d, B:141:0x0283, B:145:0x0291, B:146:0x0296, B:26:0x0078), top: B:158:0x003f }] */
    /* JADX WARN: Code duplicated, block: B:138:0x026e A[Catch: all -> 0x005f, TryCatch #4 {all -> 0x005f, blocks: (B:19:0x0056, B:121:0x0225, B:129:0x0253, B:133:0x025d, B:135:0x0263, B:136:0x0268, B:138:0x026e, B:139:0x027d, B:141:0x0283, B:145:0x0291, B:146:0x0296, B:26:0x0078), top: B:158:0x003f }] */
    /* JADX WARN: Code duplicated, block: B:139:0x027d A[Catch: all -> 0x005f, TryCatch #4 {all -> 0x005f, blocks: (B:19:0x0056, B:121:0x0225, B:129:0x0253, B:133:0x025d, B:135:0x0263, B:136:0x0268, B:138:0x026e, B:139:0x027d, B:141:0x0283, B:145:0x0291, B:146:0x0296, B:26:0x0078), top: B:158:0x003f }] */
    /* JADX WARN: Code duplicated, block: B:141:0x0283 A[Catch: all -> 0x005f, TRY_LEAVE, TryCatch #4 {all -> 0x005f, blocks: (B:19:0x0056, B:121:0x0225, B:129:0x0253, B:133:0x025d, B:135:0x0263, B:136:0x0268, B:138:0x026e, B:139:0x027d, B:141:0x0283, B:145:0x0291, B:146:0x0296, B:26:0x0078), top: B:158:0x003f }] */
    /* JADX WARN: Code duplicated, block: B:145:0x0291 A[Catch: all -> 0x005f, TRY_ENTER, TryCatch #4 {all -> 0x005f, blocks: (B:19:0x0056, B:121:0x0225, B:129:0x0253, B:133:0x025d, B:135:0x0263, B:136:0x0268, B:138:0x026e, B:139:0x027d, B:141:0x0283, B:145:0x0291, B:146:0x0296, B:26:0x0078), top: B:158:0x003f }] */
    /* JADX WARN: Code duplicated, block: B:147:0x0297 A[Catch: all -> 0x0189, TRY_ENTER, TryCatch #1 {all -> 0x0189, blocks: (B:93:0x01b4, B:101:0x01e0, B:105:0x01ea, B:108:0x01f1, B:110:0x01f5, B:111:0x01fe, B:115:0x020b, B:117:0x0213, B:147:0x0297, B:148:0x029c, B:63:0x014f, B:68:0x015c, B:76:0x0177, B:78:0x0181, B:83:0x018d, B:85:0x0193, B:88:0x019a, B:89:0x019f, B:90:0x01a0), top: B:153:0x014f }] */
    /* JADX WARN: Code duplicated, block: B:151:0x016a A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:154:0x01d3 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:156:0x0246 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:50:0x011d  */
    /* JADX WARN: Code duplicated, block: B:52:0x0121  */
    /* JADX WARN: Code duplicated, block: B:62:0x014b  */
    /* JADX WARN: Code duplicated, block: B:65:0x0155  */
    /* JADX WARN: Code duplicated, block: B:67:0x015a  */
    /* JADX WARN: Code duplicated, block: B:76:0x0177 A[Catch: all -> 0x0189, TRY_ENTER, TryCatch #1 {all -> 0x0189, blocks: (B:93:0x01b4, B:101:0x01e0, B:105:0x01ea, B:108:0x01f1, B:110:0x01f5, B:111:0x01fe, B:115:0x020b, B:117:0x0213, B:147:0x0297, B:148:0x029c, B:63:0x014f, B:68:0x015c, B:76:0x0177, B:78:0x0181, B:83:0x018d, B:85:0x0193, B:88:0x019a, B:89:0x019f, B:90:0x01a0), top: B:153:0x014f }] */
    /* JADX WARN: Code duplicated, block: B:78:0x0181 A[Catch: all -> 0x0189, TRY_LEAVE, TryCatch #1 {all -> 0x0189, blocks: (B:93:0x01b4, B:101:0x01e0, B:105:0x01ea, B:108:0x01f1, B:110:0x01f5, B:111:0x01fe, B:115:0x020b, B:117:0x0213, B:147:0x0297, B:148:0x029c, B:63:0x014f, B:68:0x015c, B:76:0x0177, B:78:0x0181, B:83:0x018d, B:85:0x0193, B:88:0x019a, B:89:0x019f, B:90:0x01a0), top: B:153:0x014f }] */
    /* JADX WARN: Code duplicated, block: B:7:0x001e  */
    /* JADX WARN: Code duplicated, block: B:83:0x018d A[Catch: all -> 0x0189, TRY_ENTER, TryCatch #1 {all -> 0x0189, blocks: (B:93:0x01b4, B:101:0x01e0, B:105:0x01ea, B:108:0x01f1, B:110:0x01f5, B:111:0x01fe, B:115:0x020b, B:117:0x0213, B:147:0x0297, B:148:0x029c, B:63:0x014f, B:68:0x015c, B:76:0x0177, B:78:0x0181, B:83:0x018d, B:85:0x0193, B:88:0x019a, B:89:0x019f, B:90:0x01a0), top: B:153:0x014f }] */
    /* JADX WARN: Code duplicated, block: B:85:0x0193 A[Catch: all -> 0x0189, TryCatch #1 {all -> 0x0189, blocks: (B:93:0x01b4, B:101:0x01e0, B:105:0x01ea, B:108:0x01f1, B:110:0x01f5, B:111:0x01fe, B:115:0x020b, B:117:0x0213, B:147:0x0297, B:148:0x029c, B:63:0x014f, B:68:0x015c, B:76:0x0177, B:78:0x0181, B:83:0x018d, B:85:0x0193, B:88:0x019a, B:89:0x019f, B:90:0x01a0), top: B:153:0x014f }] */
    /* JADX WARN: Code duplicated, block: B:92:0x01b2  */
    /* JADX WARN: Code duplicated, block: B:93:0x01b4 A[Catch: all -> 0x0189, PHI: r0 r2 r3 r9 r16 r17
      0x01b4: PHI (r0v21 app.chalo.juspay.JuspayInitiateConditions) = (r0v16 app.chalo.juspay.JuspayInitiateConditions), (r0v47 app.chalo.juspay.JuspayInitiateConditions) binds: [B:91:0x01b0, B:27:0x007b] A[DONT_GENERATE, DONT_INLINE]
      0x01b4: PHI (r2v20 java.lang.Object) = (r2v15 java.lang.Object), (r2v34 java.lang.Object) binds: [B:91:0x01b0, B:27:0x007b] A[DONT_GENERATE, DONT_INLINE]
      0x01b4: PHI (r3v14 app.chalo.juspay.JuspaySdkAdapter) = (r3v11 app.chalo.juspay.JuspaySdkAdapter), (r3v27 app.chalo.juspay.JuspaySdkAdapter) binds: [B:91:0x01b0, B:27:0x007b] A[DONT_GENERATE, DONT_INLINE]
      0x01b4: PHI (r9v6 kotlinx.coroutines.sync.Mutex) = (r9v4 kotlinx.coroutines.sync.Mutex), (r9v14 kotlinx.coroutines.sync.Mutex) binds: [B:91:0x01b0, B:27:0x007b] A[DONT_GENERATE, DONT_INLINE]
      0x01b4: PHI (r16v2 app.chalo.juspay.JuspayInitiateResult$SdkStateUnknown) = 
      (r16v1 app.chalo.juspay.JuspayInitiateResult$SdkStateUnknown)
      (r16v3 app.chalo.juspay.JuspayInitiateResult$SdkStateUnknown)
     binds: [B:91:0x01b0, B:27:0x007b] A[DONT_GENERATE, DONT_INLINE]
      0x01b4: PHI (r17v3 app.chalo.juspay.JuspayInitiateResult$Ready) = (r17v2 app.chalo.juspay.JuspayInitiateResult$Ready), (r17v5 app.chalo.juspay.JuspayInitiateResult$Ready) binds: [B:91:0x01b0, B:27:0x007b] A[DONT_GENERATE, DONT_INLINE], TRY_LEAVE, TryCatch #1 {all -> 0x0189, blocks: (B:93:0x01b4, B:101:0x01e0, B:105:0x01ea, B:108:0x01f1, B:110:0x01f5, B:111:0x01fe, B:115:0x020b, B:117:0x0213, B:147:0x0297, B:148:0x029c, B:63:0x014f, B:68:0x015c, B:76:0x0177, B:78:0x0181, B:83:0x018d, B:85:0x0193, B:88:0x019a, B:89:0x019f, B:90:0x01a0), top: B:153:0x014f }] */
    /* JADX WARN: Instruction removed from duplicated block: B:93:0x01b4, please report this as an issue */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r20v0, types: [app.chalo.juspay.JuspayControllerImpl] */
    /* JADX WARN: Type inference failed for: r3v13 */
    /* JADX WARN: Type inference failed for: r3v2, types: [kotlinx.coroutines.sync.Mutex] */
    /* JADX WARN: Type inference failed for: r3v35 */
    /* JADX WARN: Type inference failed for: r3v36 */
    public final Object n(JuspayInitiateConditions juspayInitiateConditions, String str, ContinuationImpl continuationImpl) throws Throwable {
        JuspayControllerImpl$ensureInitialisedForCurrentConditions$1 juspayControllerImpl$ensureInitialisedForCurrentConditions$1;
        Object obj;
        ?? r3;
        JuspaySdkAdapter juspaySdkAdapter;
        String str2;
        JuspayInitiateConditions juspayInitiateConditions2;
        JuspayInitiateResult.Ready ready;
        SdkReadiness sdkReadinessY;
        Mutex mutex;
        JuspaySdkAdapter juspaySdkAdapter2;
        JuspayInitiateConditions juspayInitiateConditions3;
        String str3;
        JuspaySdkAdapter juspaySdkAdapter3;
        JuspayInitiateResult.SdkStateUnknown sdkStateUnknown;
        SdkReadiness sdkReadinessY2;
        Object objA;
        JuspayInitiateResult juspayInitiateResult;
        JuspayInitiateResult.SdkStateUnknown sdkStateUnknown2;
        JuspayInitiateResult.Ready ready2;
        Object objL;
        Mutex mutex2;
        Mutex mutex3;
        JuspayInitiateResult failed;
        Mutex mutex4;
        Object obj2;
        SdkReadiness sdkReadiness;
        Object obj3 = "sdk readiness post initialise: ";
        if (continuationImpl instanceof JuspayControllerImpl$ensureInitialisedForCurrentConditions$1) {
            juspayControllerImpl$ensureInitialisedForCurrentConditions$1 = (JuspayControllerImpl$ensureInitialisedForCurrentConditions$1) continuationImpl;
            int i = juspayControllerImpl$ensureInitialisedForCurrentConditions$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                juspayControllerImpl$ensureInitialisedForCurrentConditions$1.label = i - Integer.MIN_VALUE;
            } else {
                juspayControllerImpl$ensureInitialisedForCurrentConditions$1 = new JuspayControllerImpl$ensureInitialisedForCurrentConditions$1(this, continuationImpl);
            }
        } else {
            juspayControllerImpl$ensureInitialisedForCurrentConditions$1 = new JuspayControllerImpl$ensureInitialisedForCurrentConditions$1(this, continuationImpl);
        }
        Object obj4 = juspayControllerImpl$ensureInitialisedForCurrentConditions$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = juspayControllerImpl$ensureInitialisedForCurrentConditions$1.label;
        SdkReadiness.NotReady notReady = SdkReadiness.NotReady.f4030a;
        SdkReadiness.Unknown unknown = SdkReadiness.Unknown.f4032a;
        JuspaySdkStatus.Ready ready3 = JuspaySdkStatus.Ready.f4073a;
        JuspayInitiateResult.Ready ready4 = JuspayInitiateResult.Ready.f4049a;
        SdkReadiness.Ready ready5 = SdkReadiness.Ready.f4031a;
        KAtomicRef kAtomicRef = this.k;
        JuspayInitiateResult.Abandoned abandoned = JuspayInitiateResult.Abandoned.f4047a;
        Object obj5 = obj4;
        JuspayInitiateResult.SdkStateUnknown sdkStateUnknown3 = JuspayInitiateResult.SdkStateUnknown.f4050a;
        try {
            if (i2 == 0) {
                ResultKt.b(obj5);
                String message = "initiate called: " + juspayInitiateConditions;
                Intrinsics.i(message, "message");
                JuspaySdkAdapterImpl juspaySdkAdapterImpl = this.d;
                if (juspaySdkAdapterImpl == null) {
                    return new JuspayInitiateResult.Failed(u);
                }
                if (!q(juspayInitiateConditions)) {
                    return abandoned;
                }
                if (((Boolean) kAtomicRef.f10429a.get()).booleanValue()) {
                    juspayControllerImpl$ensureInitialisedForCurrentConditions$1.L$0 = juspayInitiateConditions;
                    juspayControllerImpl$ensureInitialisedForCurrentConditions$1.L$1 = str;
                    juspayControllerImpl$ensureInitialisedForCurrentConditions$1.L$2 = juspaySdkAdapterImpl;
                    juspayControllerImpl$ensureInitialisedForCurrentConditions$1.label = 1;
                    Object objZ = z(false, juspayControllerImpl$ensureInitialisedForCurrentConditions$1);
                    if (objZ != coroutineSingletons) {
                        obj5 = objZ;
                        juspaySdkAdapter = juspaySdkAdapterImpl;
                        str2 = str;
                        juspayInitiateConditions2 = juspayInitiateConditions;
                    }
                } else {
                    juspaySdkAdapter = juspaySdkAdapterImpl;
                    str2 = str;
                    juspayInitiateConditions2 = juspayInitiateConditions;
                    ready = ready4;
                    sdkReadinessY = y(juspaySdkAdapter);
                    if (sdkReadinessY.equals(ready5)) {
                        v(ready3);
                        return ready;
                    }
                    if (sdkReadinessY.equals(unknown) && !sdkReadinessY.equals(notReady)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    juspayControllerImpl$ensureInitialisedForCurrentConditions$1.L$0 = juspayInitiateConditions2;
                    juspayControllerImpl$ensureInitialisedForCurrentConditions$1.L$1 = str2;
                    juspayControllerImpl$ensureInitialisedForCurrentConditions$1.L$2 = juspaySdkAdapter;
                    mutex = this.l;
                    juspayControllerImpl$ensureInitialisedForCurrentConditions$1.L$3 = mutex;
                    juspaySdkAdapter2 = juspaySdkAdapter;
                    juspayControllerImpl$ensureInitialisedForCurrentConditions$1.label = 2;
                    if (mutex.a(juspayControllerImpl$ensureInitialisedForCurrentConditions$1) != coroutineSingletons) {
                        juspayInitiateConditions3 = juspayInitiateConditions2;
                        str3 = str2;
                        juspaySdkAdapter3 = juspaySdkAdapter2;
                        if (!q(juspayInitiateConditions3)) {
                            mutex.e(null);
                            return abandoned;
                        }
                        sdkStateUnknown = sdkStateUnknown3;
                        if (((Boolean) kAtomicRef.f10429a.get()).booleanValue()) {
                            s();
                            mutex.e(null);
                            return sdkStateUnknown;
                        }
                        sdkReadinessY2 = y(juspaySdkAdapter3);
                        if (sdkReadinessY2.equals(ready5)) {
                            v(ready3);
                            mutex.e(null);
                            return ready;
                        }
                        if (!sdkReadinessY2.equals(unknown)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        juspayControllerImpl$ensureInitialisedForCurrentConditions$1.L$0 = juspayInitiateConditions3;
                        juspayControllerImpl$ensureInitialisedForCurrentConditions$1.L$1 = juspaySdkAdapter3;
                        juspayControllerImpl$ensureInitialisedForCurrentConditions$1.L$2 = mutex;
                        juspayControllerImpl$ensureInitialisedForCurrentConditions$1.L$3 = null;
                        juspayControllerImpl$ensureInitialisedForCurrentConditions$1.label = 3;
                        objA = A(juspayInitiateConditions3, str3, juspayControllerImpl$ensureInitialisedForCurrentConditions$1);
                        if (objA != coroutineSingletons) {
                            juspayInitiateResult = (JuspayInitiateResult) objA;
                            String message2 = "initiate result: " + juspayInitiateResult;
                            Intrinsics.i(message2, "message");
                            if (((Boolean) kAtomicRef.f10429a.get()).booleanValue()) {
                                s();
                                mutex.e(null);
                                return sdkStateUnknown;
                            }
                            if (!q(juspayInitiateConditions3)) {
                                mutex.e(null);
                                return abandoned;
                            }
                            if (!Intrinsics.d(juspayInitiateResult, abandoned)) {
                                if (juspayInitiateResult instanceof JuspayInitiateResult.Failed) {
                                    sdkStateUnknown2 = sdkStateUnknown;
                                    if (Intrinsics.d(juspayInitiateResult, sdkStateUnknown2)) {
                                        ready2 = ready;
                                        if (Intrinsics.d(juspayInitiateResult, ready2)) {
                                            throw new NoWhenBranchMatchedException();
                                        }
                                        juspayControllerImpl$ensureInitialisedForCurrentConditions$1.L$0 = juspayInitiateConditions3;
                                        juspayControllerImpl$ensureInitialisedForCurrentConditions$1.L$1 = mutex;
                                        juspayControllerImpl$ensureInitialisedForCurrentConditions$1.L$2 = null;
                                        juspayControllerImpl$ensureInitialisedForCurrentConditions$1.label = 4;
                                        objL = l(juspaySdkAdapter3, ready5, juspayControllerImpl$ensureInitialisedForCurrentConditions$1);
                                        if (objL != coroutineSingletons) {
                                            mutex2 = mutex;
                                            sdkReadiness = (SdkReadiness) objL;
                                            String message3 = "sdk readiness post initialise: " + sdkReadiness;
                                            Intrinsics.i(message3, "message");
                                            if (((Boolean) kAtomicRef.f10429a.get()).booleanValue()) {
                                                s();
                                                mutex2.e(null);
                                                return sdkStateUnknown2;
                                            }
                                            if (!q(juspayInitiateConditions3)) {
                                                mutex2.e(null);
                                                return abandoned;
                                            }
                                            if (!Intrinsics.d(sdkReadiness, ready5)) {
                                                if (Intrinsics.d(sdkReadiness, notReady)) {
                                                    JuspaySdkStatus.Initialising initialising = new JuspaySdkStatus.Initialising(null);
                                                    v(initialising);
                                                    failed = new JuspayInitiateResult.Failed(initialising);
                                                    mutex3 = mutex2;
                                                } else {
                                                    if (!Intrinsics.d(sdkReadiness, unknown)) {
                                                        throw new NoWhenBranchMatchedException();
                                                    }
                                                    obj2 = null;
                                                    v(new JuspaySdkStatus.Initialising(null));
                                                    failed = sdkStateUnknown2;
                                                    mutex4 = mutex2;
                                                }
                                                mutex4.e(obj2);
                                                return failed;
                                            }
                                            v(ready3);
                                            failed = ready2;
                                            mutex3 = mutex2;
                                        }
                                    }
                                    obj2 = null;
                                    mutex4 = mutex3;
                                    mutex4.e(obj2);
                                    return failed;
                                }
                                v(((JuspayInitiateResult.Failed) juspayInitiateResult).f4048a);
                            }
                            mutex3 = mutex;
                            failed = juspayInitiateResult;
                            obj2 = null;
                            mutex4 = mutex3;
                            mutex4.e(obj2);
                            return failed;
                        }
                    }
                }
                return coroutineSingletons;
            }
            if (i2 == 1) {
                juspaySdkAdapter = (JuspaySdkAdapter) juspayControllerImpl$ensureInitialisedForCurrentConditions$1.L$2;
                str2 = (String) juspayControllerImpl$ensureInitialisedForCurrentConditions$1.L$1;
                juspayInitiateConditions2 = (JuspayInitiateConditions) juspayControllerImpl$ensureInitialisedForCurrentConditions$1.L$0;
                ResultKt.b(obj5);
            } else {
                if (i2 == 2) {
                    Mutex mutex5 = (Mutex) juspayControllerImpl$ensureInitialisedForCurrentConditions$1.L$3;
                    juspaySdkAdapter3 = (JuspaySdkAdapter) juspayControllerImpl$ensureInitialisedForCurrentConditions$1.L$2;
                    str3 = (String) juspayControllerImpl$ensureInitialisedForCurrentConditions$1.L$1;
                    juspayInitiateConditions3 = (JuspayInitiateConditions) juspayControllerImpl$ensureInitialisedForCurrentConditions$1.L$0;
                    ResultKt.b(obj5);
                    ready = ready4;
                    mutex = mutex5;
                    try {
                        if (!q(juspayInitiateConditions3)) {
                            mutex.e(null);
                            return abandoned;
                        }
                        sdkStateUnknown = sdkStateUnknown3;
                        if (((Boolean) kAtomicRef.f10429a.get()).booleanValue()) {
                            try {
                                s();
                                mutex.e(null);
                                return sdkStateUnknown;
                            } catch (Throwable th) {
                                th = th;
                                obj = null;
                                r3 = mutex;
                                r3.e(obj);
                                throw th;
                            }
                        }
                        sdkReadinessY2 = y(juspaySdkAdapter3);
                        if (sdkReadinessY2.equals(ready5)) {
                            v(ready3);
                            mutex.e(null);
                            return ready;
                        }
                        if (!sdkReadinessY2.equals(unknown) && !sdkReadinessY2.equals(notReady)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        juspayControllerImpl$ensureInitialisedForCurrentConditions$1.L$0 = juspayInitiateConditions3;
                        juspayControllerImpl$ensureInitialisedForCurrentConditions$1.L$1 = juspaySdkAdapter3;
                        juspayControllerImpl$ensureInitialisedForCurrentConditions$1.L$2 = mutex;
                        juspayControllerImpl$ensureInitialisedForCurrentConditions$1.L$3 = null;
                        juspayControllerImpl$ensureInitialisedForCurrentConditions$1.label = 3;
                        objA = A(juspayInitiateConditions3, str3, juspayControllerImpl$ensureInitialisedForCurrentConditions$1);
                        if (objA != coroutineSingletons) {
                            juspayInitiateResult = (JuspayInitiateResult) objA;
                            String message4 = "initiate result: " + juspayInitiateResult;
                            Intrinsics.i(message4, "message");
                            if (((Boolean) kAtomicRef.f10429a.get()).booleanValue()) {
                                s();
                                mutex.e(null);
                                return sdkStateUnknown;
                            }
                            if (!q(juspayInitiateConditions3)) {
                                mutex.e(null);
                                return abandoned;
                            }
                            if (!Intrinsics.d(juspayInitiateResult, abandoned)) {
                                if (juspayInitiateResult instanceof JuspayInitiateResult.Failed) {
                                    sdkStateUnknown2 = sdkStateUnknown;
                                    if (Intrinsics.d(juspayInitiateResult, sdkStateUnknown2)) {
                                        ready2 = ready;
                                        if (Intrinsics.d(juspayInitiateResult, ready2)) {
                                            throw new NoWhenBranchMatchedException();
                                        }
                                        juspayControllerImpl$ensureInitialisedForCurrentConditions$1.L$0 = juspayInitiateConditions3;
                                        juspayControllerImpl$ensureInitialisedForCurrentConditions$1.L$1 = mutex;
                                        juspayControllerImpl$ensureInitialisedForCurrentConditions$1.L$2 = null;
                                        juspayControllerImpl$ensureInitialisedForCurrentConditions$1.label = 4;
                                        objL = l(juspaySdkAdapter3, ready5, juspayControllerImpl$ensureInitialisedForCurrentConditions$1);
                                        if (objL != coroutineSingletons) {
                                            mutex2 = mutex;
                                        }
                                    }
                                    obj2 = null;
                                    mutex4 = mutex3;
                                    mutex4.e(obj2);
                                    return failed;
                                }
                                v(((JuspayInitiateResult.Failed) juspayInitiateResult).f4048a);
                            }
                            mutex3 = mutex;
                            failed = juspayInitiateResult;
                            obj2 = null;
                            mutex4 = mutex3;
                            mutex4.e(obj2);
                            return failed;
                        }
                        return coroutineSingletons;
                    } catch (Throwable th2) {
                        th = th2;
                        obj3 = mutex;
                        obj = null;
                        r3 = obj3;
                        r3.e(obj);
                        throw th;
                    }
                }
                if (i2 == 3) {
                    Mutex mutex6 = (Mutex) juspayControllerImpl$ensureInitialisedForCurrentConditions$1.L$2;
                    JuspaySdkAdapter juspaySdkAdapter4 = (JuspaySdkAdapter) juspayControllerImpl$ensureInitialisedForCurrentConditions$1.L$1;
                    JuspayInitiateConditions juspayInitiateConditions4 = (JuspayInitiateConditions) juspayControllerImpl$ensureInitialisedForCurrentConditions$1.L$0;
                    ResultKt.b(obj5);
                    sdkStateUnknown = sdkStateUnknown3;
                    ready = ready4;
                    objA = obj5;
                    mutex = mutex6;
                    juspaySdkAdapter3 = juspaySdkAdapter4;
                    juspayInitiateConditions3 = juspayInitiateConditions4;
                    juspayInitiateResult = (JuspayInitiateResult) objA;
                    String message5 = "initiate result: " + juspayInitiateResult;
                    Intrinsics.i(message5, "message");
                    if (((Boolean) kAtomicRef.f10429a.get()).booleanValue()) {
                        try {
                            s();
                            mutex.e(null);
                            return sdkStateUnknown;
                        } catch (Throwable th3) {
                            th = th3;
                            obj = null;
                            r3 = mutex;
                            r3.e(obj);
                            throw th;
                        }
                    }
                    if (!q(juspayInitiateConditions3)) {
                        mutex.e(null);
                        return abandoned;
                    }
                    if (!Intrinsics.d(juspayInitiateResult, abandoned)) {
                        if (juspayInitiateResult instanceof JuspayInitiateResult.Failed) {
                            sdkStateUnknown2 = sdkStateUnknown;
                            if (Intrinsics.d(juspayInitiateResult, sdkStateUnknown2)) {
                                ready2 = ready;
                                if (Intrinsics.d(juspayInitiateResult, ready2)) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                juspayControllerImpl$ensureInitialisedForCurrentConditions$1.L$0 = juspayInitiateConditions3;
                                juspayControllerImpl$ensureInitialisedForCurrentConditions$1.L$1 = mutex;
                                juspayControllerImpl$ensureInitialisedForCurrentConditions$1.L$2 = null;
                                juspayControllerImpl$ensureInitialisedForCurrentConditions$1.label = 4;
                                objL = l(juspaySdkAdapter3, ready5, juspayControllerImpl$ensureInitialisedForCurrentConditions$1);
                                if (objL != coroutineSingletons) {
                                    mutex2 = mutex;
                                }
                                return coroutineSingletons;
                            }
                            obj2 = null;
                            mutex4 = mutex3;
                            mutex4.e(obj2);
                            return failed;
                        }
                        v(((JuspayInitiateResult.Failed) juspayInitiateResult).f4048a);
                    }
                    mutex3 = mutex;
                    failed = juspayInitiateResult;
                    obj2 = null;
                    mutex4 = mutex3;
                    mutex4.e(obj2);
                    return failed;
                }
                if (i2 != 4) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                Mutex mutex7 = (Mutex) juspayControllerImpl$ensureInitialisedForCurrentConditions$1.L$1;
                juspayInitiateConditions3 = (JuspayInitiateConditions) juspayControllerImpl$ensureInitialisedForCurrentConditions$1.L$0;
                ResultKt.b(obj5);
                sdkStateUnknown2 = sdkStateUnknown3;
                ready2 = ready4;
                objL = obj5;
                mutex2 = mutex7;
            }
            sdkReadiness = (SdkReadiness) objL;
            String message6 = "sdk readiness post initialise: " + sdkReadiness;
            Intrinsics.i(message6, "message");
            if (((Boolean) kAtomicRef.f10429a.get()).booleanValue()) {
                try {
                    s();
                    mutex2.e(null);
                    return sdkStateUnknown2;
                } catch (Throwable th4) {
                    th = th4;
                    obj = null;
                    r3 = mutex2;
                    r3.e(obj);
                    throw th;
                }
            }
            if (!q(juspayInitiateConditions3)) {
                mutex2.e(null);
                return abandoned;
            }
            if (!Intrinsics.d(sdkReadiness, ready5)) {
                if (Intrinsics.d(sdkReadiness, notReady)) {
                    JuspaySdkStatus.Initialising initialising2 = new JuspaySdkStatus.Initialising(null);
                    v(initialising2);
                    failed = new JuspayInitiateResult.Failed(initialising2);
                    mutex3 = mutex2;
                } else {
                    if (!Intrinsics.d(sdkReadiness, unknown)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    obj2 = null;
                    v(new JuspaySdkStatus.Initialising(null));
                    failed = sdkStateUnknown2;
                    mutex4 = mutex2;
                }
                mutex4.e(obj2);
                return failed;
            }
            v(ready3);
            failed = ready2;
            mutex3 = mutex2;
            obj2 = null;
            mutex4 = mutex3;
            mutex4.e(obj2);
            return failed;
            if (!((Boolean) obj5).booleanValue()) {
                return sdkStateUnknown3;
            }
            ready = ready4;
            sdkReadinessY = y(juspaySdkAdapter);
            if (sdkReadinessY.equals(ready5)) {
                v(ready3);
                return ready;
            }
            if (sdkReadinessY.equals(unknown)) {
            }
            juspayControllerImpl$ensureInitialisedForCurrentConditions$1.L$0 = juspayInitiateConditions2;
            juspayControllerImpl$ensureInitialisedForCurrentConditions$1.L$1 = str2;
            juspayControllerImpl$ensureInitialisedForCurrentConditions$1.L$2 = juspaySdkAdapter;
            mutex = this.l;
            juspayControllerImpl$ensureInitialisedForCurrentConditions$1.L$3 = mutex;
            juspaySdkAdapter2 = juspaySdkAdapter;
            juspayControllerImpl$ensureInitialisedForCurrentConditions$1.label = 2;
            if (mutex.a(juspayControllerImpl$ensureInitialisedForCurrentConditions$1) != coroutineSingletons) {
                juspayInitiateConditions3 = juspayInitiateConditions2;
                str3 = str2;
                juspaySdkAdapter3 = juspaySdkAdapter2;
                if (!q(juspayInitiateConditions3)) {
                    mutex.e(null);
                    return abandoned;
                }
                sdkStateUnknown = sdkStateUnknown3;
                if (((Boolean) kAtomicRef.f10429a.get()).booleanValue()) {
                    s();
                    mutex.e(null);
                    return sdkStateUnknown;
                }
                sdkReadinessY2 = y(juspaySdkAdapter3);
                if (sdkReadinessY2.equals(ready5)) {
                    v(ready3);
                    mutex.e(null);
                    return ready;
                }
                if (!sdkReadinessY2.equals(unknown)) {
                    throw new NoWhenBranchMatchedException();
                }
                juspayControllerImpl$ensureInitialisedForCurrentConditions$1.L$0 = juspayInitiateConditions3;
                juspayControllerImpl$ensureInitialisedForCurrentConditions$1.L$1 = juspaySdkAdapter3;
                juspayControllerImpl$ensureInitialisedForCurrentConditions$1.L$2 = mutex;
                juspayControllerImpl$ensureInitialisedForCurrentConditions$1.L$3 = null;
                juspayControllerImpl$ensureInitialisedForCurrentConditions$1.label = 3;
                objA = A(juspayInitiateConditions3, str3, juspayControllerImpl$ensureInitialisedForCurrentConditions$1);
                if (objA != coroutineSingletons) {
                    juspayInitiateResult = (JuspayInitiateResult) objA;
                    String message7 = "initiate result: " + juspayInitiateResult;
                    Intrinsics.i(message7, "message");
                    if (((Boolean) kAtomicRef.f10429a.get()).booleanValue()) {
                        s();
                        mutex.e(null);
                        return sdkStateUnknown;
                    }
                    if (!q(juspayInitiateConditions3)) {
                        mutex.e(null);
                        return abandoned;
                    }
                    if (!Intrinsics.d(juspayInitiateResult, abandoned)) {
                        if (juspayInitiateResult instanceof JuspayInitiateResult.Failed) {
                            sdkStateUnknown2 = sdkStateUnknown;
                            if (Intrinsics.d(juspayInitiateResult, sdkStateUnknown2)) {
                                ready2 = ready;
                                if (Intrinsics.d(juspayInitiateResult, ready2)) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                juspayControllerImpl$ensureInitialisedForCurrentConditions$1.L$0 = juspayInitiateConditions3;
                                juspayControllerImpl$ensureInitialisedForCurrentConditions$1.L$1 = mutex;
                                juspayControllerImpl$ensureInitialisedForCurrentConditions$1.L$2 = null;
                                juspayControllerImpl$ensureInitialisedForCurrentConditions$1.label = 4;
                                objL = l(juspaySdkAdapter3, ready5, juspayControllerImpl$ensureInitialisedForCurrentConditions$1);
                                if (objL != coroutineSingletons) {
                                    mutex2 = mutex;
                                    sdkReadiness = (SdkReadiness) objL;
                                    String message8 = "sdk readiness post initialise: " + sdkReadiness;
                                    Intrinsics.i(message8, "message");
                                    if (((Boolean) kAtomicRef.f10429a.get()).booleanValue()) {
                                        s();
                                        mutex2.e(null);
                                        return sdkStateUnknown2;
                                    }
                                    if (!q(juspayInitiateConditions3)) {
                                        mutex2.e(null);
                                        return abandoned;
                                    }
                                    if (!Intrinsics.d(sdkReadiness, ready5)) {
                                        if (Intrinsics.d(sdkReadiness, notReady)) {
                                            JuspaySdkStatus.Initialising initialising3 = new JuspaySdkStatus.Initialising(null);
                                            v(initialising3);
                                            failed = new JuspayInitiateResult.Failed(initialising3);
                                            mutex3 = mutex2;
                                        } else {
                                            if (!Intrinsics.d(sdkReadiness, unknown)) {
                                                throw new NoWhenBranchMatchedException();
                                            }
                                            obj2 = null;
                                            v(new JuspaySdkStatus.Initialising(null));
                                            failed = sdkStateUnknown2;
                                            mutex4 = mutex2;
                                        }
                                        mutex4.e(obj2);
                                        return failed;
                                    }
                                    v(ready3);
                                    failed = ready2;
                                    mutex3 = mutex2;
                                }
                            }
                            obj2 = null;
                            mutex4 = mutex3;
                            mutex4.e(obj2);
                            return failed;
                        }
                        v(((JuspayInitiateResult.Failed) juspayInitiateResult).f4048a);
                    }
                    mutex3 = mutex;
                    failed = juspayInitiateResult;
                    obj2 = null;
                    mutex4 = mutex3;
                    mutex4.e(obj2);
                    return failed;
                }
            }
            return coroutineSingletons;
        } catch (Throwable th5) {
            th = th5;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0084, code lost:
    
        if (r15 == r1) goto L26;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v0, types: [app.chalo.juspay.JuspaySdkAdapter, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r13v1, types: [kotlinx.coroutines.sync.Mutex] */
    /* JADX WARN: Type inference failed for: r13v10 */
    /* JADX WARN: Type inference failed for: r13v11 */
    /* JADX WARN: Type inference failed for: r13v4, types: [kotlinx.coroutines.sync.Mutex] */
    /* JADX WARN: Type inference failed for: r7v0 */
    /* JADX WARN: Type inference failed for: r7v1, types: [app.chalo.juspay.JuspaySdkAdapter] */
    /* JADX WARN: Type inference failed for: r7v2 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object o(app.chalo.juspay.JuspaySdkAdapter r13, app.chalo.juspay.JusPaySDKRequestAppModel r14, kotlin.coroutines.jvm.internal.ContinuationImpl r15) {
        /*
            r12 = this;
            boolean r0 = r15 instanceof app.chalo.juspay.JuspayControllerImpl$executeAwaitingTerminal$1
            if (r0 == 0) goto L13
            r0 = r15
            app.chalo.juspay.JuspayControllerImpl$executeAwaitingTerminal$1 r0 = (app.chalo.juspay.JuspayControllerImpl$executeAwaitingTerminal$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            app.chalo.juspay.JuspayControllerImpl$executeAwaitingTerminal$1 r0 = new app.chalo.juspay.JuspayControllerImpl$executeAwaitingTerminal$1
            r0.<init>(r12, r15)
        L18:
            java.lang.Object r15 = r0.result
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r2 = r0.label
            r3 = 2
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L51
            if (r2 == r4) goto L3a
            if (r2 != r3) goto L32
            java.lang.Object r13 = r0.L$0
            kotlinx.coroutines.sync.Mutex r13 = (kotlinx.coroutines.sync.Mutex) r13
            kotlin.ResultKt.b(r15)     // Catch: java.lang.Throwable -> L2f
            goto L87
        L2f:
            r0 = move-exception
            r14 = r0
            goto L8d
        L32:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r14 = "call to 'resume' before 'invoke' with coroutine"
            r13.<init>(r14)
            throw r13
        L3a:
            java.lang.Object r13 = r0.L$3
            kotlinx.coroutines.sync.Mutex r13 = (kotlinx.coroutines.sync.Mutex) r13
            java.lang.Object r14 = r0.L$2
            java.lang.String r14 = (java.lang.String) r14
            java.lang.Object r2 = r0.L$1
            app.chalo.juspay.JusPaySDKRequestAppModel r2 = (app.chalo.juspay.JusPaySDKRequestAppModel) r2
            java.lang.Object r4 = r0.L$0
            app.chalo.juspay.JuspaySdkAdapter r4 = (app.chalo.juspay.JuspaySdkAdapter) r4
            kotlin.ResultKt.b(r15)
            r9 = r14
            r8 = r2
            r7 = r4
            goto L6f
        L51:
            kotlin.ResultKt.b(r15)
            java.lang.String r15 = app.chalo.utils.KUUID.a()
            r0.L$0 = r13
            r0.L$1 = r14
            r0.L$2 = r15
            kotlinx.coroutines.sync.MutexImpl r2 = r12.h
            r0.L$3 = r2
            r0.label = r4
            java.lang.Object r4 = r2.a(r0)
            if (r4 != r1) goto L6b
            goto L86
        L6b:
            r7 = r13
            r8 = r14
            r9 = r15
            r13 = r2
        L6f:
            app.chalo.juspay.JuspayControllerImpl$executeAwaitingTerminal$2$1 r6 = new app.chalo.juspay.JuspayControllerImpl$executeAwaitingTerminal$2$1     // Catch: java.lang.Throwable -> L2f
            r11 = 0
            r10 = r12
            r6.<init>(r7, r8, r9, r10, r11)     // Catch: java.lang.Throwable -> L2f
            r0.L$0 = r13     // Catch: java.lang.Throwable -> L2f
            r0.L$1 = r5     // Catch: java.lang.Throwable -> L2f
            r0.L$2 = r5     // Catch: java.lang.Throwable -> L2f
            r0.L$3 = r5     // Catch: java.lang.Throwable -> L2f
            r0.label = r3     // Catch: java.lang.Throwable -> L2f
            java.lang.Object r15 = kotlinx.coroutines.CoroutineScopeKt.c(r6, r0)     // Catch: java.lang.Throwable -> L2f
            if (r15 != r1) goto L87
        L86:
            return r1
        L87:
            app.chalo.juspay.JuspayControllerImpl$TerminalOutcome r15 = (app.chalo.juspay.JuspayControllerImpl.TerminalOutcome) r15     // Catch: java.lang.Throwable -> L2f
            r13.e(r5)
            return r15
        L8d:
            r13.e(r5)
            throw r14
        */
        throw new UnsupportedOperationException("Method not decompiled: app.chalo.juspay.JuspayControllerImpl.o(app.chalo.juspay.JuspaySdkAdapter, app.chalo.juspay.JusPaySDKRequestAppModel, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    @Override // app.chalo.juspay.JuspayController
    public final boolean onBackPressed() {
        return this.d.c.onBackPressed();
    }

    /* JADX WARN: Code duplicated, block: B:37:0x0086 A[Catch: all -> 0x00c0, TRY_ENTER, TRY_LEAVE, TryCatch #0 {all -> 0x00c0, blocks: (B:26:0x006e, B:37:0x0086), top: B:59:0x006e }] */
    /* JADX WARN: Code duplicated, block: B:50:0x00b9  */
    /* JADX WARN: Code duplicated, block: B:52:0x00bc  */
    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00a7, code lost:
    
        if (r0 == r1) goto L43;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v13 */
    /* JADX WARN: Type inference failed for: r13v14 */
    /* JADX WARN: Type inference failed for: r13v8, types: [kotlinx.coroutines.Deferred] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object p(app.chalo.juspay.JuspaySdkAdapterImpl r11, app.chalo.juspay.JuspayInitiateConditions r12, java.lang.String r13, kotlin.coroutines.jvm.internal.ContinuationImpl r14) throws java.lang.Throwable {
        /*
            r10 = this;
            boolean r0 = r14 instanceof app.chalo.juspay.JuspayControllerImpl$fetchUpiSession$1
            if (r0 == 0) goto L14
            r0 = r14
            app.chalo.juspay.JuspayControllerImpl$fetchUpiSession$1 r0 = (app.chalo.juspay.JuspayControllerImpl$fetchUpiSession$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L14
            int r1 = r1 - r2
            r0.label = r1
        L12:
            r14 = r0
            goto L1a
        L14:
            app.chalo.juspay.JuspayControllerImpl$fetchUpiSession$1 r0 = new app.chalo.juspay.JuspayControllerImpl$fetchUpiSession$1
            r0.<init>(r10, r14)
            goto L12
        L1a:
            java.lang.Object r0 = r14.result
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r2 = r14.label
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L53
            if (r2 == r4) goto L3b
            if (r2 != r3) goto L33
            kotlin.ResultKt.b(r0)     // Catch: java.util.concurrent.CancellationException -> L2e
            r5 = r10
            goto Laa
        L2e:
            r0 = move-exception
            r11 = r0
            r5 = r10
            goto Laf
        L33:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r12)
            throw r11
        L3b:
            java.lang.Object r11 = r14.L$3
            kotlinx.coroutines.sync.Mutex r11 = (kotlinx.coroutines.sync.Mutex) r11
            java.lang.Object r12 = r14.L$2
            r13 = r12
            java.lang.String r13 = (java.lang.String) r13
            java.lang.Object r12 = r14.L$1
            app.chalo.juspay.JuspayInitiateConditions r12 = (app.chalo.juspay.JuspayInitiateConditions) r12
            java.lang.Object r2 = r14.L$0
            app.chalo.juspay.JuspaySdkAdapter r2 = (app.chalo.juspay.JuspaySdkAdapter) r2
            kotlin.ResultKt.b(r0)
            r6 = r2
        L50:
            r7 = r12
            r8 = r13
            goto L6d
        L53:
            kotlin.ResultKt.b(r0)
            r14.L$0 = r11
            r14.L$1 = r12
            r14.L$2 = r13
            kotlinx.coroutines.sync.MutexImpl r0 = r10.q
            r14.L$3 = r0
            r14.label = r4
            java.lang.Object r2 = r0.a(r14)
            if (r2 != r1) goto L6a
            r5 = r10
            goto La9
        L6a:
            r6 = r11
            r11 = r0
            goto L50
        L6d:
            r12 = 0
            kotlinx.coroutines.Deferred r13 = r10.r     // Catch: java.lang.Throwable -> Lc0
            if (r13 == 0) goto L86
            r0 = r13
            kotlinx.coroutines.AbstractCoroutine r0 = (kotlinx.coroutines.AbstractCoroutine) r0     // Catch: java.lang.Throwable -> L82
            boolean r0 = r0.isActive()     // Catch: java.lang.Throwable -> L82
            if (r0 == 0) goto L7c
            goto L7d
        L7c:
            r13 = r12
        L7d:
            if (r13 != 0) goto L80
            goto L86
        L80:
            r5 = r10
            goto L96
        L82:
            r0 = move-exception
            r13 = r0
            r5 = r10
            goto Lc3
        L86:
            kotlinx.coroutines.internal.ContextScope r13 = r10.e     // Catch: java.lang.Throwable -> Lc0
            app.chalo.juspay.JuspayControllerImpl$fetchUpiSession$attempt$1$2 r4 = new app.chalo.juspay.JuspayControllerImpl$fetchUpiSession$attempt$1$2     // Catch: java.lang.Throwable -> Lc0
            r9 = 0
            r5 = r10
            r4.<init>(r5, r6, r7, r8, r9)     // Catch: java.lang.Throwable -> Lbd
            r0 = 3
            kotlinx.coroutines.Deferred r13 = kotlinx.coroutines.BuildersKt.b(r13, r12, r12, r4, r0)     // Catch: java.lang.Throwable -> Lbd
            r5.r = r13     // Catch: java.lang.Throwable -> Lbd
        L96:
            r11.e(r12)
            r14.L$0 = r12     // Catch: java.util.concurrent.CancellationException -> Lad
            r14.L$1 = r12     // Catch: java.util.concurrent.CancellationException -> Lad
            r14.L$2 = r12     // Catch: java.util.concurrent.CancellationException -> Lad
            r14.L$3 = r12     // Catch: java.util.concurrent.CancellationException -> Lad
            r14.label = r3     // Catch: java.util.concurrent.CancellationException -> Lad
            java.lang.Object r0 = r13.q(r14)     // Catch: java.util.concurrent.CancellationException -> Lad
            if (r0 != r1) goto Laa
        La9:
            return r1
        Laa:
            app.chalo.juspay.JuspayUpiSessionState r0 = (app.chalo.juspay.JuspayUpiSessionState) r0     // Catch: java.util.concurrent.CancellationException -> Lad
            return r0
        Lad:
            r0 = move-exception
            r11 = r0
        Laf:
            kotlin.coroutines.CoroutineContext r12 = r14.getContext()
            boolean r12 = kotlinx.coroutines.JobKt.h(r12)
            if (r12 == 0) goto Lbc
            app.chalo.juspay.JuspayUpiSessionState$Unknown r11 = app.chalo.juspay.JuspayUpiSessionState.Unknown.f4083a
            return r11
        Lbc:
            throw r11
        Lbd:
            r0 = move-exception
        Lbe:
            r13 = r0
            goto Lc3
        Lc0:
            r0 = move-exception
            r5 = r10
            goto Lbe
        Lc3:
            r11.e(r12)
            throw r13
        */
        throw new UnsupportedOperationException("Method not decompiled: app.chalo.juspay.JuspayControllerImpl.p(app.chalo.juspay.JuspaySdkAdapterImpl, app.chalo.juspay.JuspayInitiateConditions, java.lang.String, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    public final boolean q(JuspayInitiateConditions juspayInitiateConditions) {
        return !this.n && Intrinsics.d(this.j.f10429a.get(), juspayInitiateConditions) && juspayInitiateConditions.a();
    }

    public final void s() {
        JuspaySdkStatus juspaySdkStatus = ((JuspayState) this.f.getValue()).f4077a;
        if (Intrinsics.d(juspaySdkStatus, JuspaySdkStatus.Ready.f4073a) || (juspaySdkStatus instanceof JuspaySdkStatus.Initialising)) {
            v(JuspaySdkStatus.Terminating.f4074a);
        }
    }

    public final void u() {
        if (((Boolean) this.k.f10429a.get()).booleanValue() || !y(this.d).equals(SdkReadiness.Ready.f4031a)) {
            v(JuspaySdkStatus.NotInitialised.f4072a);
        }
    }

    public final void v(JuspaySdkStatus juspaySdkStatus) {
        MutableStateFlow mutableStateFlow;
        Object value;
        do {
            mutableStateFlow = this.f;
            value = mutableStateFlow.getValue();
        } while (!mutableStateFlow.c(value, JuspayState.a((JuspayState) value, juspaySdkStatus, null, 2)));
    }

    public final void w(JuspayUpiSessionState juspayUpiSessionState) {
        MutableStateFlow mutableStateFlow;
        Object value;
        do {
            mutableStateFlow = this.f;
            value = mutableStateFlow.getValue();
        } while (!mutableStateFlow.c(value, JuspayState.a((JuspayState) value, null, juspayUpiSessionState, 1)));
    }

    public final void x(String str, String str2, Map map) {
        AnalyticsContract.DefaultImpls.a(this.b, str, str2, map, null, false, 24);
    }

    /* JADX WARN: Code duplicated, block: B:45:0x00c6  */
    /* JADX WARN: Code duplicated, block: B:48:0x00cf A[Catch: all -> 0x0042, TryCatch #1 {all -> 0x0042, blocks: (B:14:0x003d, B:46:0x00c7, B:48:0x00cf, B:61:0x011c, B:49:0x00dd, B:51:0x00e5, B:52:0x00ee, B:54:0x00f6, B:55:0x00fa, B:56:0x00ff), top: B:68:0x003d }] */
    /* JADX WARN: Code duplicated, block: B:49:0x00dd A[Catch: all -> 0x0042, TryCatch #1 {all -> 0x0042, blocks: (B:14:0x003d, B:46:0x00c7, B:48:0x00cf, B:61:0x011c, B:49:0x00dd, B:51:0x00e5, B:52:0x00ee, B:54:0x00f6, B:55:0x00fa, B:56:0x00ff), top: B:68:0x003d }] */
    /* JADX WARN: Code duplicated, block: B:51:0x00e5 A[Catch: all -> 0x0042, TryCatch #1 {all -> 0x0042, blocks: (B:14:0x003d, B:46:0x00c7, B:48:0x00cf, B:61:0x011c, B:49:0x00dd, B:51:0x00e5, B:52:0x00ee, B:54:0x00f6, B:55:0x00fa, B:56:0x00ff), top: B:68:0x003d }] */
    /* JADX WARN: Code duplicated, block: B:52:0x00ee A[Catch: all -> 0x0042, TryCatch #1 {all -> 0x0042, blocks: (B:14:0x003d, B:46:0x00c7, B:48:0x00cf, B:61:0x011c, B:49:0x00dd, B:51:0x00e5, B:52:0x00ee, B:54:0x00f6, B:55:0x00fa, B:56:0x00ff), top: B:68:0x003d }] */
    /* JADX WARN: Code duplicated, block: B:54:0x00f6 A[Catch: all -> 0x0042, TryCatch #1 {all -> 0x0042, blocks: (B:14:0x003d, B:46:0x00c7, B:48:0x00cf, B:61:0x011c, B:49:0x00dd, B:51:0x00e5, B:52:0x00ee, B:54:0x00f6, B:55:0x00fa, B:56:0x00ff), top: B:68:0x003d }] */
    /* JADX WARN: Code duplicated, block: B:55:0x00fa A[Catch: all -> 0x0042, TryCatch #1 {all -> 0x0042, blocks: (B:14:0x003d, B:46:0x00c7, B:48:0x00cf, B:61:0x011c, B:49:0x00dd, B:51:0x00e5, B:52:0x00ee, B:54:0x00f6, B:55:0x00fa, B:56:0x00ff), top: B:68:0x003d }] */
    /* JADX WARN: Code duplicated, block: B:7:0x001a  */
    public final Object z(boolean z, ContinuationImpl continuationImpl) throws Throwable {
        JuspayControllerImpl$requestTermination$1 juspayControllerImpl$requestTermination$1;
        JuspaySdkAdapter juspaySdkAdapter;
        Mutex mutex;
        boolean z2;
        boolean z3;
        Mutex mutex2;
        JuspaySdkAdapter juspaySdkAdapter2;
        SdkReadiness sdkReadiness;
        if (continuationImpl instanceof JuspayControllerImpl$requestTermination$1) {
            juspayControllerImpl$requestTermination$1 = (JuspayControllerImpl$requestTermination$1) continuationImpl;
            int i = juspayControllerImpl$requestTermination$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                juspayControllerImpl$requestTermination$1.label = i - Integer.MIN_VALUE;
            } else {
                juspayControllerImpl$requestTermination$1 = new JuspayControllerImpl$requestTermination$1(this, continuationImpl);
            }
        } else {
            juspayControllerImpl$requestTermination$1 = new JuspayControllerImpl$requestTermination$1(this, continuationImpl);
        }
        Object objL = juspayControllerImpl$requestTermination$1.result;
        Object obj = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = juspayControllerImpl$requestTermination$1.label;
        SdkReadiness sdkReadiness2 = SdkReadiness.NotReady.f4030a;
        JuspaySdkStatus juspaySdkStatus = JuspaySdkStatus.Terminating.f4074a;
        KAtomicRef kAtomicRef = this.k;
        JuspayUpiSessionState juspayUpiSessionState = JuspayUpiSessionState.Unknown.f4083a;
        if (i2 == 0) {
            ResultKt.b(objL);
            w(juspayUpiSessionState);
            juspaySdkAdapter = this.d;
            juspayControllerImpl$requestTermination$1.L$0 = juspaySdkAdapter;
            MutexImpl mutexImpl = this.l;
            juspayControllerImpl$requestTermination$1.L$1 = mutexImpl;
            juspayControllerImpl$requestTermination$1.Z$0 = z;
            juspayControllerImpl$requestTermination$1.label = 1;
            if (mutexImpl.a(juspayControllerImpl$requestTermination$1) != obj) {
                mutex = mutexImpl;
                z2 = z;
            }
            return obj;
        }
        if (i2 != 1) {
            if (i2 == 2) {
                Mutex mutex3 = (Mutex) juspayControllerImpl$requestTermination$1.L$1;
                juspaySdkAdapter2 = (JuspaySdkAdapter) juspayControllerImpl$requestTermination$1.L$0;
                try {
                    ResultKt.b(objL);
                    mutex = mutex3;
                    v(juspaySdkStatus);
                    w(juspayUpiSessionState);
                    try {
                        juspaySdkAdapter2.b();
                        juspayControllerImpl$requestTermination$1.L$0 = mutex;
                        juspayControllerImpl$requestTermination$1.L$1 = null;
                        juspayControllerImpl$requestTermination$1.label = 3;
                        objL = l(juspaySdkAdapter2, sdkReadiness2, juspayControllerImpl$requestTermination$1);
                        if (objL != obj) {
                            mutex2 = mutex;
                        }
                        return obj;
                    } catch (CancellationException e) {
                        throw e;
                    } catch (Exception e2) {
                        String message = "terminate exception: " + e2;
                        Intrinsics.i(message, "message");
                        v(new JuspaySdkStatus.TerminationFailed());
                        mutex2 = mutex;
                    }
                } catch (Throwable th) {
                    th = th;
                    mutex2 = mutex3;
                }
            } else {
                if (i2 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                mutex2 = (Mutex) juspayControllerImpl$requestTermination$1.L$0;
                try {
                    ResultKt.b(objL);
                } catch (Throwable th2) {
                    th = th2;
                }
            }
            mutex2.e(null);
            throw th;
        }
        z2 = juspayControllerImpl$requestTermination$1.Z$0;
        mutex = (Mutex) juspayControllerImpl$requestTermination$1.L$1;
        JuspaySdkAdapter juspaySdkAdapter3 = (JuspaySdkAdapter) juspayControllerImpl$requestTermination$1.L$0;
        ResultKt.b(objL);
        juspaySdkAdapter = juspaySdkAdapter3;
        sdkReadiness = (SdkReadiness) objL;
        if (Intrinsics.d(sdkReadiness, sdkReadiness2)) {
            kAtomicRef.f10429a.set(Boolean.FALSE);
            v(JuspaySdkStatus.NotInitialised.f4072a);
            z3 = true;
        } else {
            if (Intrinsics.d(sdkReadiness, SdkReadiness.Ready.f4031a)) {
                v(new JuspaySdkStatus.TerminationFailed());
            } else {
                if (Intrinsics.d(sdkReadiness, SdkReadiness.Unknown.f4032a)) {
                    throw new NoWhenBranchMatchedException();
                }
                v(juspaySdkStatus);
            }
            z3 = false;
        }
        Boolean boolValueOf = Boolean.valueOf(z3);
        mutex2.e(null);
        return boolValueOf;
        if (!z2) {
            try {
                if (!((Boolean) kAtomicRef.f10429a.get()).booleanValue()) {
                    z3 = true;
                    mutex2 = mutex;
                }
                Boolean boolValueOf2 = Boolean.valueOf(z3);
                mutex2.e(null);
                return boolValueOf2;
            } catch (Throwable th3) {
                th = th3;
                mutex2 = mutex;
            }
        }
        juspayControllerImpl$requestTermination$1.L$0 = juspaySdkAdapter;
        juspayControllerImpl$requestTermination$1.L$1 = mutex;
        juspayControllerImpl$requestTermination$1.label = 2;
        if (m(juspayControllerImpl$requestTermination$1) != obj) {
            juspaySdkAdapter2 = juspaySdkAdapter;
            v(juspaySdkStatus);
            w(juspayUpiSessionState);
            juspaySdkAdapter2.b();
            juspayControllerImpl$requestTermination$1.L$0 = mutex;
            juspayControllerImpl$requestTermination$1.L$1 = null;
            juspayControllerImpl$requestTermination$1.label = 3;
            objL = l(juspaySdkAdapter2, sdkReadiness2, juspayControllerImpl$requestTermination$1);
            if (objL != obj) {
                mutex2 = mutex;
                sdkReadiness = (SdkReadiness) objL;
                if (Intrinsics.d(sdkReadiness, sdkReadiness2)) {
                    kAtomicRef.f10429a.set(Boolean.FALSE);
                    v(JuspaySdkStatus.NotInitialised.f4072a);
                    z3 = true;
                } else {
                    if (Intrinsics.d(sdkReadiness, SdkReadiness.Ready.f4031a)) {
                        v(new JuspaySdkStatus.TerminationFailed());
                    } else {
                        if (Intrinsics.d(sdkReadiness, SdkReadiness.Unknown.f4032a)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        v(juspaySdkStatus);
                    }
                    z3 = false;
                }
                Boolean boolValueOf3 = Boolean.valueOf(z3);
                mutex2.e(null);
                return boolValueOf3;
            }
        }
        return obj;
    }

    @Override // app.chalo.juspay.JuspayControllerHost
    public final JuspayControllerImpl b() {
        return this;
    }
}
