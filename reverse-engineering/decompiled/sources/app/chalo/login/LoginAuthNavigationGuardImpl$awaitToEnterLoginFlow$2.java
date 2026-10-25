package app.chalo.login;

import app.chalo.features.foreground.ActiveSceneInStackResolverImpl$currentScreenAsFlow$$inlined$map$1;
import app.chalo.scenes.ChaloScenes;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
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
@DebugMetadata(c = "app.chalo.login.LoginAuthNavigationGuardImpl$awaitToEnterLoginFlow$2", f = "LoginAuthNavigationGuardImpl.kt", l = {ModuleDescriptor.MODULE_VERSION}, m = "invokeSuspend", v = 1)
final class LoginAuthNavigationGuardImpl$awaitToEnterLoginFlow$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ LoginAuthNavigationGuardImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LoginAuthNavigationGuardImpl$awaitToEnterLoginFlow$2(LoginAuthNavigationGuardImpl loginAuthNavigationGuardImpl, Continuation continuation) {
        super(2, continuation);
        this.this$0 = loginAuthNavigationGuardImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new LoginAuthNavigationGuardImpl$awaitToEnterLoginFlow$2(this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((LoginAuthNavigationGuardImpl$awaitToEnterLoginFlow$2) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f17538a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            ResultKt.b(obj);
            final ActiveSceneInStackResolverImpl$currentScreenAsFlow$$inlined$map$1 activeSceneInStackResolverImpl$currentScreenAsFlow$$inlined$map$1A = this.this$0.b.a();
            Flow<Unit> flow = new Flow<Unit>() { // from class: app.chalo.login.LoginAuthNavigationGuardImpl$awaitToEnterLoginFlow$2$invokeSuspend$$inlined$mapNotNull$1

                /* JADX INFO: renamed from: app.chalo.login.LoginAuthNavigationGuardImpl$awaitToEnterLoginFlow$2$invokeSuspend$$inlined$mapNotNull$1$2, reason: invalid class name */
                /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
                @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
                public final class AnonymousClass2<T> implements FlowCollector {

                    /* JADX INFO: renamed from: a, reason: collision with root package name */
                    public final /* synthetic */ FlowCollector f5187a;

                    /* JADX INFO: renamed from: app.chalo.login.LoginAuthNavigationGuardImpl$awaitToEnterLoginFlow$2$invokeSuspend$$inlined$mapNotNull$1$2$1, reason: invalid class name */
                    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
                    @DebugMetadata(c = "app.chalo.login.LoginAuthNavigationGuardImpl$awaitToEnterLoginFlow$2$invokeSuspend$$inlined$mapNotNull$1$2", f = "LoginAuthNavigationGuardImpl.kt", l = {52}, m = "emit", v = 1)
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
                        this.f5187a = flowCollector;
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
                        ChaloScenes chaloScenes = (ChaloScenes) obj;
                        Unit unit2 = (chaloScenes == ChaloScenes.LoginOptions || chaloScenes == ChaloScenes.LoginOtp || chaloScenes == ChaloScenes.UserConsent) ? unit : null;
                        if (unit2 != null) {
                            anonymousClass1.label = 1;
                            if (this.f5187a.emit(unit2, anonymousClass1) == coroutineSingletons) {
                                return coroutineSingletons;
                            }
                        }
                        return unit;
                    }
                }

                @Override // kotlinx.coroutines.flow.Flow
                public final Object collect(FlowCollector flowCollector, Continuation continuation) {
                    Object objCollect = activeSceneInStackResolverImpl$currentScreenAsFlow$$inlined$map$1A.collect(new AnonymousClass2(flowCollector), continuation);
                    return objCollect == CoroutineSingletons.COROUTINE_SUSPENDED ? objCollect : Unit.f17538a;
                }
            };
            this.label = 1;
            if (FlowKt.t(flow, this) == coroutineSingletons) {
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
