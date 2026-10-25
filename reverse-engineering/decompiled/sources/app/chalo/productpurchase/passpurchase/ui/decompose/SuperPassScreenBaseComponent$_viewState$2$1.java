package app.chalo.productpurchase.passpurchase.ui.decompose;

import app.chalo.productpurchase.passpurchase.ui.SuperPassPurchaseSharedState;
import app.chalo.utils.chalologger.ChaloLog;
import com.arkivanov.decompose.value.MutableValue;
import com.arkivanov.essenty.lifecycle.Lifecycle;
import com.arkivanov.essenty.lifecycle.coroutines.RepeatOnLifecycleKt;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt__ZipKt$combine$$inlined$unsafeFlow$1;
import org.bouncycastle.asn1.eac.EACTags;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "app.chalo.productpurchase.passpurchase.ui.decompose.SuperPassScreenBaseComponent$_viewState$2$1", f = "SuperPassScreenBaseComponent.kt", l = {EACTags.DYNAMIC_INTERNAL_AUTHENTIFICATION}, m = "invokeSuspend", v = 1)
final class SuperPassScreenBaseComponent$_viewState$2$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ MutableValue<Object> $mutableValue;
    int label;
    final /* synthetic */ SuperPassScreenBaseComponent<Object, Object, Object, Object> this$0;

    /* JADX INFO: renamed from: app.chalo.productpurchase.passpurchase.ui.decompose.SuperPassScreenBaseComponent$_viewState$2$1$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "app.chalo.productpurchase.passpurchase.ui.decompose.SuperPassScreenBaseComponent$_viewState$2$1$1", f = "SuperPassScreenBaseComponent.kt", l = {64}, m = "invokeSuspend", v = 1)
    final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ MutableValue<Object> $mutableValue;
        int label;
        final /* synthetic */ SuperPassScreenBaseComponent<Object, Object, Object, Object> this$0;

        /* JADX INFO: renamed from: app.chalo.productpurchase.passpurchase.ui.decompose.SuperPassScreenBaseComponent$_viewState$2$1$1$1, reason: invalid class name and collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
        @Metadata(d1 = {"\u0000\u0010\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\u0010\u0000\u001a\u0002H\u0001\"\b\b\u0000\u0010\u0001*\u00020\u0002\"\b\b\u0001\u0010\u0003*\u00020\u00022\u0006\u0010\u0004\u001a\u0002H\u00032\u0006\u0010\u0005\u001a\u00020\u0006H\n"}, d2 = {"<anonymous>", "ViewState", "", "DataState", "dataState", "sharedState", "Lapp/chalo/productpurchase/passpurchase/ui/SuperPassPurchaseSharedState;"}, k = 3, mv = {2, 0, 0}, xi = 48)
        @DebugMetadata(c = "app.chalo.productpurchase.passpurchase.ui.decompose.SuperPassScreenBaseComponent$_viewState$2$1$1$1", f = "SuperPassScreenBaseComponent.kt", l = {63}, m = "invokeSuspend", v = 1)
        final class C01381 extends SuspendLambda implements Function3<Object, SuperPassPurchaseSharedState, Continuation<Object>, Object> {
            /* synthetic */ Object L$0;
            /* synthetic */ Object L$1;
            int label;
            final /* synthetic */ SuperPassScreenBaseComponent<Object, Object, Object, Object> this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C01381(SuperPassScreenBaseComponent superPassScreenBaseComponent, Continuation continuation) {
                super(3, continuation);
                this.this$0 = superPassScreenBaseComponent;
            }

            @Override // kotlin.jvm.functions.Function3
            public final Object invoke(Object obj, Object obj2, Object obj3) {
                C01381 c01381 = new C01381(this.this$0, (Continuation) obj3);
                c01381.L$0 = obj;
                c01381.L$1 = (SuperPassPurchaseSharedState) obj2;
                return c01381.invokeSuspend(Unit.f17538a);
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
                Object obj2 = this.L$0;
                SuperPassPurchaseSharedState superPassPurchaseSharedState = (SuperPassPurchaseSharedState) this.L$1;
                SuperPassScreenBaseComponent<Object, Object, Object, Object> superPassScreenBaseComponent = this.this$0;
                this.L$0 = null;
                this.label = 1;
                Object objA = superPassScreenBaseComponent.a(superPassPurchaseSharedState, obj2, this);
                return objA == coroutineSingletons ? coroutineSingletons : objA;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(SuperPassScreenBaseComponent superPassScreenBaseComponent, MutableValue mutableValue, Continuation continuation) {
            super(2, continuation);
            this.this$0 = superPassScreenBaseComponent;
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
                SuperPassScreenBaseComponent<Object, Object, Object, Object> superPassScreenBaseComponent = this.this$0;
                FlowKt__ZipKt$combine$$inlined$unsafeFlow$1 flowKt__ZipKt$combine$$inlined$unsafeFlow$1 = new FlowKt__ZipKt$combine$$inlined$unsafeFlow$1(superPassScreenBaseComponent.f, superPassScreenBaseComponent.c.getF(), new C01381(this.this$0, null));
                final SuperPassScreenBaseComponent<Object, Object, Object, Object> superPassScreenBaseComponent2 = this.this$0;
                final MutableValue<Object> mutableValue = this.$mutableValue;
                FlowCollector flowCollector = new FlowCollector() { // from class: app.chalo.productpurchase.passpurchase.ui.decompose.SuperPassScreenBaseComponent._viewState.2.1.1.2
                    @Override // kotlinx.coroutines.flow.FlowCollector
                    public final Object emit(Object obj2, Continuation continuation) {
                        ChaloLog.b(superPassScreenBaseComponent2.d, "DataState updated: " + obj2);
                        mutableValue.c(obj2);
                        return Unit.f17538a;
                    }
                };
                this.label = 1;
                if (flowKt__ZipKt$combine$$inlined$unsafeFlow$1.collect(flowCollector, this) == coroutineSingletons) {
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
    public SuperPassScreenBaseComponent$_viewState$2$1(SuperPassScreenBaseComponent superPassScreenBaseComponent, MutableValue mutableValue, Continuation continuation) {
        super(2, continuation);
        this.this$0 = superPassScreenBaseComponent;
        this.$mutableValue = mutableValue;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new SuperPassScreenBaseComponent$_viewState$2$1(this.this$0, this.$mutableValue, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((SuperPassScreenBaseComponent$_viewState$2$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f17538a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            ResultKt.b(obj);
            Lifecycle f12286a = this.this$0.f8402a.getF12286a();
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
