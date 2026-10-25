package app.chalo.validationsdk.multiproductvalidation.ui;

import app.chalo.validationsdk.blevalidation.config.ChildValidationDelegate;
import app.chalo.validationsdk.blevalidation.data.models.ProductValidationData;
import app.chalo.validationsdk.blevalidation.domain.qrvalidation.QRValidationLifecycleResult;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "app.chalo.validationsdk.multiproductvalidation.ui.MultiProductValidationComponent$startQrLifecycle$1", f = "MultiProductValidationComponent.kt", l = {288}, m = "invokeSuspend", v = 1)
final class MultiProductValidationComponent$startQrLifecycle$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ ProductValidationData $child;
    int label;
    final /* synthetic */ MultiProductValidationComponent this$0;

    /* JADX INFO: renamed from: app.chalo.validationsdk.multiproductvalidation.ui.MultiProductValidationComponent$startQrLifecycle$1$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "result", "Lapp/chalo/validationsdk/blevalidation/domain/qrvalidation/QRValidationLifecycleResult;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "app.chalo.validationsdk.multiproductvalidation.ui.MultiProductValidationComponent$startQrLifecycle$1$1", f = "MultiProductValidationComponent.kt", l = {290}, m = "invokeSuspend", v = 1)
    final class AnonymousClass1 extends SuspendLambda implements Function2<QRValidationLifecycleResult, Continuation<? super Unit>, Object> {
        final /* synthetic */ ProductValidationData $child;
        /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ MultiProductValidationComponent this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(MultiProductValidationComponent multiProductValidationComponent, ProductValidationData productValidationData, Continuation continuation) {
            super(2, continuation);
            this.this$0 = multiProductValidationComponent;
            this.$child = productValidationData;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, this.$child, continuation);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            return ((AnonymousClass1) create((QRValidationLifecycleResult) obj, (Continuation) obj2)).invokeSuspend(Unit.f17538a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            Unit unit = Unit.f17538a;
            if (i != 0) {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.b(obj);
                return unit;
            }
            ResultKt.b(obj);
            QRValidationLifecycleResult qRValidationLifecycleResult = (QRValidationLifecycleResult) this.L$0;
            ProductValidationData productValidationData = ((MultiProductValidationDataState) this.this$0.f.getValue()).c;
            if (Intrinsics.d(productValidationData != null ? productValidationData.getId() : null, this.$child.getId())) {
                MultiProductValidationComponent multiProductValidationComponent = this.this$0;
                ProductValidationData productValidationData2 = this.$child;
                this.label = 1;
                if (MultiProductValidationComponent.K0(multiProductValidationComponent, productValidationData2, qRValidationLifecycleResult, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            }
            return unit;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MultiProductValidationComponent$startQrLifecycle$1(MultiProductValidationComponent multiProductValidationComponent, ProductValidationData productValidationData, Continuation continuation) {
        super(2, continuation);
        this.this$0 = multiProductValidationComponent;
        this.$child = productValidationData;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new MultiProductValidationComponent$startQrLifecycle$1(this.this$0, this.$child, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((MultiProductValidationComponent$startQrLifecycle$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f17538a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        Unit unit = Unit.f17538a;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(obj);
            return unit;
        }
        ResultKt.b(obj);
        ChildValidationDelegate childValidationDelegateL0 = this.this$0.L0(this.$child);
        if (childValidationDelegateL0 != null) {
            ProductValidationData productValidationData = ((MultiProductValidationDataState) this.this$0.f.getValue()).c;
            if (Intrinsics.d(productValidationData != null ? productValidationData.getId() : null, this.$child.getId())) {
                Flow flowA = this.this$0.n.a(this.$child, childValidationDelegateL0.f10469a);
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, this.$child, null);
                this.label = 1;
                if (FlowKt.j(flowA, anonymousClass1, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            }
        }
        return unit;
    }
}
