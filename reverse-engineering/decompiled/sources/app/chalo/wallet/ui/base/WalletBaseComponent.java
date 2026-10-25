package app.chalo.wallet.ui.base;

import app.chalo.mvibase.simple.ChaloBaseStateMviComponent;
import app.chalo.wallet.ui.access.WalletAccessBaseContract;
import app.chalo.wallet.ui.access.WalletAccessIntent;
import app.chalo.wallet.ui.access.WalletAccessManager;
import app.chalo.wallet.ui.access.WalletAccessState;
import com.arkivanov.decompose.ComponentContext;
import com.arkivanov.decompose.value.MutableValue;
import com.arkivanov.decompose.value.MutableValueBuilderKt;
import com.arkivanov.decompose.value.Value;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.StateFlow;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b'\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u0001*\b\b\u0001\u0010\u0003*\u00020\u0001*\b\b\u0002\u0010\u0004*\u00020\u0001*\b\b\u0003\u0010\u0005*\u00020\u00012\u001a\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\u00062\u00020\u0007¨\u0006\b"}, d2 = {"Lapp/chalo/wallet/ui/base/WalletBaseComponent;", "", "ViewIntent", "DataState", "ViewState", "ViewSideEffect", "Lapp/chalo/mvibase/simple/ChaloBaseStateMviComponent;", "Lapp/chalo/wallet/ui/access/WalletAccessBaseContract;", "wallet_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class WalletBaseComponent<ViewIntent, DataState, ViewState, ViewSideEffect> extends ChaloBaseStateMviComponent<ViewIntent, DataState, ViewState, ViewSideEffect> implements WalletAccessBaseContract {
    public final WalletAccessManager k;
    public final MutableValue l;
    public final Value m;
    public final Flow n;
    public final StateFlow o;

    /* JADX INFO: renamed from: app.chalo.wallet.ui.base.WalletBaseComponent$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "app.chalo.wallet.ui.base.WalletBaseComponent$1", f = "WalletBaseComponent.kt", l = {46}, m = "invokeSuspend", v = 1)
    final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        public AnonymousClass1(Continuation continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new AnonymousClass1(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            return ((AnonymousClass1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f17538a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i == 0) {
                ResultKt.b(obj);
                StateFlow stateFlowD = WalletBaseComponent.this.k.getT();
                final WalletBaseComponent<Object, Object, Object, Object> walletBaseComponent = WalletBaseComponent.this;
                FlowCollector flowCollector = new FlowCollector() { // from class: app.chalo.wallet.ui.base.WalletBaseComponent.1.1
                    @Override // kotlinx.coroutines.flow.FlowCollector
                    public final Object emit(Object obj2, Continuation continuation) {
                        walletBaseComponent.l.c((WalletAccessState) obj2);
                        return Unit.f17538a;
                    }
                };
                this.label = 1;
                if (stateFlowD.collect(flowCollector, this) == coroutineSingletons) {
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

    /* JADX INFO: renamed from: app.chalo.wallet.ui.base.WalletBaseComponent$2, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "app.chalo.wallet.ui.base.WalletBaseComponent$2", f = "WalletBaseComponent.kt", l = {53}, m = "invokeSuspend", v = 1)
    final class AnonymousClass2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        public AnonymousClass2(Continuation continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new AnonymousClass2(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            return ((AnonymousClass2) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f17538a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i == 0) {
                ResultKt.b(obj);
                StateFlow stateFlowA = WalletBaseComponent.this.k.getV();
                final WalletBaseComponent<Object, Object, Object, Object> walletBaseComponent = WalletBaseComponent.this;
                FlowCollector flowCollector = new FlowCollector() { // from class: app.chalo.wallet.ui.base.WalletBaseComponent.2.1
                    @Override // kotlinx.coroutines.flow.FlowCollector
                    public final Object emit(Object obj2, Continuation continuation) {
                        walletBaseComponent.F0(((Boolean) obj2).booleanValue());
                        return Unit.f17538a;
                    }
                };
                this.label = 1;
                if (stateFlowA.collect(flowCollector, this) == coroutineSingletons) {
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

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WalletBaseComponent(ComponentContext componentContext, Function1 function1) {
        super(componentContext);
        Intrinsics.i(componentContext, "componentContext");
        WalletAccessManager walletAccessManager = (WalletAccessManager) function1.invoke(this.j);
        this.k = walletAccessManager;
        MutableValue mutableValueA = MutableValueBuilderKt.a(new WalletAccessState(null, null, null, null, null, null, null, 8191));
        this.l = mutableValueA;
        this.m = mutableValueA;
        this.n = walletAccessManager.i();
        this.o = walletAccessManager.getV();
        D0(new AnonymousClass1(null));
        D0(new AnonymousClass2(null));
    }

    public final void G0(WalletAccessIntent intent) {
        Intrinsics.i(intent, "intent");
        this.k.c(intent);
    }

    @Override // app.chalo.wallet.ui.access.WalletAccessBaseContract
    /* JADX INFO: renamed from: i, reason: from getter */
    public final Flow getN() {
        return this.n;
    }

    public void F0(boolean z) {
    }
}
