package app.chalo.login;

import app.chalo.constants.Source;
import app.chalo.providers.UserProfileDetailsProvider;
import app.chalo.resultstatemanager.ResultStateDataCollector;
import app.chalo.scenes.ChaloNavigationManager;
import app.chalo.utils.KAtomicInt;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/login/LoginAuthGuardImpl;", "Lapp/chalo/login/LoginAuthGuard;", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class LoginAuthGuardImpl implements LoginAuthGuard {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final UserProfileDetailsProvider f5177a;
    public final ChaloNavigationManager b;
    public final KAtomicInt c;
    public final MutableStateFlow d;

    public LoginAuthGuardImpl(UserProfileDetailsProvider userProfileDetailsProvider, ChaloNavigationManager chaloNavigationManager) {
        this.f5177a = userProfileDetailsProvider;
        this.b = chaloNavigationManager;
        KAtomicInt kAtomicInt = new KAtomicInt();
        this.c = kAtomicInt;
        this.d = StateFlowKt.a(Integer.valueOf(kAtomicInt.f10428a.get()));
    }

    @Override // app.chalo.login.LoginAuthGuard
    public final Object a(Source source, ResultStateDataCollector resultStateDataCollector, SuspendLambda suspendLambda) {
        MutableStateFlow mutableStateFlow;
        Object value;
        UserProfileDetailsProvider userProfileDetailsProvider = this.f5177a;
        if (((Boolean) userProfileDetailsProvider.getG().getValue()).booleanValue()) {
            return LoginGuardResult.LOGGED_IN;
        }
        int iIncrementAndGet = this.c.f10428a.incrementAndGet();
        do {
            mutableStateFlow = this.d;
            value = mutableStateFlow.getValue();
            ((Number) value).intValue();
        } while (!mutableStateFlow.c(value, new Integer(iIncrementAndGet)));
        final StateFlow g = userProfileDetailsProvider.getG();
        return FlowKt.t(FlowKt.H(mutableStateFlow, new LoginAuthGuardImpl$awaitLoggedIn$$inlined$flatMapLatest$1(null, iIncrementAndGet, this, source, resultStateDataCollector, new Flow<Unit>() { // from class: app.chalo.login.LoginAuthGuardImpl$loginResultDataFlow-MBtNdOY$$inlined$mapNotNull$1

            /* JADX INFO: renamed from: app.chalo.login.LoginAuthGuardImpl$loginResultDataFlow-MBtNdOY$$inlined$mapNotNull$1$2, reason: invalid class name */
            /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
            @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
            public final class AnonymousClass2<T> implements FlowCollector {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final /* synthetic */ FlowCollector f5179a;

                /* JADX INFO: renamed from: app.chalo.login.LoginAuthGuardImpl$loginResultDataFlow-MBtNdOY$$inlined$mapNotNull$1$2$1, reason: invalid class name */
                @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
                @DebugMetadata(c = "app.chalo.login.LoginAuthGuardImpl$loginResultDataFlow-MBtNdOY$$inlined$mapNotNull$1$2", f = "LoginAuthGuardImpl.kt", l = {56}, m = "emit", v = 1)
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
                    this.f5179a = flowCollector;
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
                    Unit unit = Unit.f17538a;
                    if (i2 != 0) {
                        if (i2 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.b(obj2);
                        return unit;
                    }
                    ResultKt.b(obj2);
                    Unit unit2 = ((Boolean) obj).booleanValue() ? unit : null;
                    if (unit2 != null) {
                        anonymousClass1.label = 1;
                        if (this.f5179a.emit(unit2, anonymousClass1) == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                    }
                    return unit;
                }
            }

            @Override // kotlinx.coroutines.flow.Flow
            public final Object collect(FlowCollector flowCollector, Continuation continuation) {
                Object objCollect = g.collect(new AnonymousClass2(flowCollector), continuation);
                return objCollect == CoroutineSingletons.COROUTINE_SUSPENDED ? objCollect : Unit.f17538a;
            }
        })), suspendLambda);
    }
}
