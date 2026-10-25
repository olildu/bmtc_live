package app.chalo.mvibase.simple;

import app.chalo.utils.chalologger.ChaloLog;
import com.arkivanov.decompose.value.MutableValue;
import com.arkivanov.essenty.lifecycle.Lifecycle;
import com.arkivanov.essenty.lifecycle.coroutines.RepeatOnLifecycleKt;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.StateFlow;
import org.bouncycastle.asn1.eac.EACTags;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "app.chalo.mvibase.simple.ChaloBaseStateMviComponent$_viewState$2$1", f = "ChaloBaseStateMviComponent.kt", l = {EACTags.DYNAMIC_EXTERNAL_AUTHENTIFICATION}, m = "invokeSuspend", v = 1)
final class ChaloBaseStateMviComponent$_viewState$2$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ MutableValue<Object> $mutableValue;
    int label;
    final /* synthetic */ ChaloBaseStateMviComponent<Object, Object, Object, Object> this$0;

    /* JADX INFO: renamed from: app.chalo.mvibase.simple.ChaloBaseStateMviComponent$_viewState$2$1$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "app.chalo.mvibase.simple.ChaloBaseStateMviComponent$_viewState$2$1$1", f = "ChaloBaseStateMviComponent.kt", l = {60}, m = "invokeSuspend", v = 1)
    final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ MutableValue<Object> $mutableValue;
        int label;
        final /* synthetic */ ChaloBaseStateMviComponent<Object, Object, Object, Object> this$0;

        /* JADX INFO: renamed from: app.chalo.mvibase.simple.ChaloBaseStateMviComponent$_viewState$2$1$1$1, reason: invalid class name and collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
        @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
        final class C01271<T> implements FlowCollector {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ ChaloBaseStateMviComponent f5984a;
            public final /* synthetic */ MutableValue b;

            public C01271(ChaloBaseStateMviComponent chaloBaseStateMviComponent, MutableValue mutableValue) {
                this.f5984a = chaloBaseStateMviComponent;
                this.b = mutableValue;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // kotlinx.coroutines.flow.FlowCollector
            public final Object emit(Object obj, Continuation continuation) {
                ChaloBaseStateMviComponent$_viewState$2$1$1$1$emit$1 chaloBaseStateMviComponent$_viewState$2$1$1$1$emit$1;
                MutableValue mutableValue;
                if (continuation instanceof ChaloBaseStateMviComponent$_viewState$2$1$1$1$emit$1) {
                    chaloBaseStateMviComponent$_viewState$2$1$1$1$emit$1 = (ChaloBaseStateMviComponent$_viewState$2$1$1$1$emit$1) continuation;
                    int i = chaloBaseStateMviComponent$_viewState$2$1$1$1$emit$1.label;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        chaloBaseStateMviComponent$_viewState$2$1$1$1$emit$1.label = i - Integer.MIN_VALUE;
                    } else {
                        chaloBaseStateMviComponent$_viewState$2$1$1$1$emit$1 = new ChaloBaseStateMviComponent$_viewState$2$1$1$1$emit$1(this, continuation);
                    }
                } else {
                    chaloBaseStateMviComponent$_viewState$2$1$1$1$emit$1 = new ChaloBaseStateMviComponent$_viewState$2$1$1$1$emit$1(this, continuation);
                }
                Object objP0 = chaloBaseStateMviComponent$_viewState$2$1$1$1$emit$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i2 = chaloBaseStateMviComponent$_viewState$2$1$1$1$emit$1.label;
                if (i2 == 0) {
                    ResultKt.b(objP0);
                    ChaloBaseStateMviComponent chaloBaseStateMviComponent = this.f5984a;
                    ChaloLog.b(chaloBaseStateMviComponent.c, "DataState updated: " + obj);
                    MutableValue mutableValue2 = this.b;
                    chaloBaseStateMviComponent$_viewState$2$1$1$1$emit$1.L$0 = mutableValue2;
                    chaloBaseStateMviComponent$_viewState$2$1$1$1$emit$1.label = 1;
                    objP0 = chaloBaseStateMviComponent.p0(obj, chaloBaseStateMviComponent$_viewState$2$1$1$1$emit$1);
                    if (objP0 == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    mutableValue = mutableValue2;
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    mutableValue = (MutableValue) chaloBaseStateMviComponent$_viewState$2$1$1$1$emit$1.L$0;
                    ResultKt.b(objP0);
                }
                mutableValue.c(objP0);
                return Unit.f17538a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(ChaloBaseStateMviComponent chaloBaseStateMviComponent, MutableValue mutableValue, Continuation continuation) {
            super(2, continuation);
            this.this$0 = chaloBaseStateMviComponent;
            this.$mutableValue = mutableValue;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new AnonymousClass1(this.this$0, this.$mutableValue, continuation);
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
                ChaloBaseStateMviComponent<Object, Object, Object, Object> chaloBaseStateMviComponent = this.this$0;
                StateFlow stateFlow = chaloBaseStateMviComponent.f;
                C01271 c01271 = new C01271(chaloBaseStateMviComponent, this.$mutableValue);
                this.label = 1;
                if (stateFlow.collect(c01271, this) == coroutineSingletons) {
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
    public ChaloBaseStateMviComponent$_viewState$2$1(ChaloBaseStateMviComponent chaloBaseStateMviComponent, MutableValue mutableValue, Continuation continuation) {
        super(2, continuation);
        this.this$0 = chaloBaseStateMviComponent;
        this.$mutableValue = mutableValue;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ChaloBaseStateMviComponent$_viewState$2$1(this.this$0, this.$mutableValue, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((ChaloBaseStateMviComponent$_viewState$2$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f17538a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            ResultKt.b(obj);
            Lifecycle f12286a = this.this$0.f5983a.getF12286a();
            Lifecycle.State state = Lifecycle.State.STARTED;
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, this.$mutableValue, null);
            this.label = 1;
            if (RepeatOnLifecycleKt.b(f12286a, state, anonymousClass1, this) == coroutineSingletons) {
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
