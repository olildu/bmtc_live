package app.chalo.validationsdk.blevalidation.ui.qrvalidation;

import app.chalo.validationsdk.blevalidation.data.models.ProductValidationData;
import app.chalo.validationsdk.blevalidation.domain.qrvalidation.QRValidationLifecycleResult;
import defpackage.mz0;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.JobSupport;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "app.chalo.validationsdk.blevalidation.ui.qrvalidation.QRValidationComponent$startQrLifecycle$1", f = "QRValidationComponent.kt", l = {441}, m = "invokeSuspend", v = 1)
final class QRValidationComponent$startQrLifecycle$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ ProductValidationData $productData;
    int label;
    final /* synthetic */ QRValidationComponent this$0;

    /* JADX INFO: renamed from: app.chalo.validationsdk.blevalidation.ui.qrvalidation.QRValidationComponent$startQrLifecycle$1$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "result", "Lapp/chalo/validationsdk/blevalidation/domain/qrvalidation/QRValidationLifecycleResult;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "app.chalo.validationsdk.blevalidation.ui.qrvalidation.QRValidationComponent$startQrLifecycle$1$1", f = "QRValidationComponent.kt", l = {446, 462}, m = "invokeSuspend", v = 1)
    final class AnonymousClass1 extends SuspendLambda implements Function2<QRValidationLifecycleResult, Continuation<? super Unit>, Object> {
        final /* synthetic */ Ref.BooleanRef $emptyQrRefreshRetryConsumed;
        final /* synthetic */ Ref.ObjectRef<Long> $lastObservedQrUpdateTime;
        /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ QRValidationComponent this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(QRValidationComponent qRValidationComponent, Ref.ObjectRef objectRef, Ref.BooleanRef booleanRef, Continuation continuation) {
            super(2, continuation);
            this.this$0 = qRValidationComponent;
            this.$lastObservedQrUpdateTime = objectRef;
            this.$emptyQrRefreshRetryConsumed = booleanRef;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, this.$lastObservedQrUpdateTime, this.$emptyQrRefreshRetryConsumed, continuation);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            return ((AnonymousClass1) create((QRValidationLifecycleResult) obj, (Continuation) obj2)).invokeSuspend(Unit.f17538a);
        }

        /* JADX WARN: Type inference failed for: r9v1, types: [T, java.lang.Long] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Ref.BooleanRef booleanRef;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            Unit unit = Unit.f17538a;
            if (i == 0) {
                ResultKt.b(obj);
                QRValidationLifecycleResult qRValidationLifecycleResult = (QRValidationLifecycleResult) this.L$0;
                QRValidationComponent qRValidationComponent = this.this$0;
                Long l = this.$lastObservedQrUpdateTime.element;
                qRValidationComponent.getClass();
                boolean z = l != null && qRValidationLifecycleResult.e > l.longValue();
                Ref.ObjectRef<Long> objectRef = this.$lastObservedQrUpdateTime;
                QRValidationComponent qRValidationComponent2 = this.this$0;
                Long l2 = objectRef.element;
                qRValidationComponent2.getClass();
                long jLongValue = l2 != null ? l2.longValue() : qRValidationLifecycleResult.e;
                long j = qRValidationLifecycleResult.e;
                boolean z2 = qRValidationLifecycleResult.f;
                boolean z3 = qRValidationLifecycleResult.b;
                List list = qRValidationLifecycleResult.f10519a;
                objectRef.element = new Long(Math.max(jLongValue, j));
                this.this$0.getClass();
                if (list.isEmpty() && !z3 && z2) {
                    Ref.BooleanRef booleanRef2 = this.$emptyQrRefreshRetryConsumed;
                    QRValidationComponent qRValidationComponent3 = this.this$0;
                    boolean z4 = booleanRef2.element;
                    this.L$0 = booleanRef2;
                    this.label = 1;
                    obj = QRValidationComponent.H0(qRValidationComponent3, qRValidationLifecycleResult, z, z4, this);
                    if (obj != coroutineSingletons) {
                        booleanRef = booleanRef2;
                    }
                } else {
                    this.$emptyQrRefreshRetryConsumed.element = false;
                    this.this$0.getClass();
                    if (list.isEmpty() && !z3 && !z2) {
                        QRValidationComponent qRValidationComponent4 = this.this$0;
                        Job job = qRValidationComponent4.K;
                        if (job != null) {
                            ((JobSupport) job).cancel(null);
                        }
                        qRValidationComponent4.q0(new mz0(qRValidationComponent4, 11));
                        return unit;
                    }
                    QRValidationComponent qRValidationComponent5 = this.this$0;
                    this.label = 2;
                    if (QRValidationComponent.M0(qRValidationComponent5, qRValidationLifecycleResult, this) != coroutineSingletons) {
                        return unit;
                    }
                }
                return coroutineSingletons;
            }
            if (i != 1) {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.b(obj);
                return unit;
            }
            booleanRef = (Ref.BooleanRef) this.L$0;
            ResultKt.b(obj);
            booleanRef.element = ((Boolean) obj).booleanValue();
            return unit;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public QRValidationComponent$startQrLifecycle$1(ProductValidationData productValidationData, QRValidationComponent qRValidationComponent, Continuation continuation) {
        super(2, continuation);
        this.this$0 = qRValidationComponent;
        this.$productData = productValidationData;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new QRValidationComponent$startQrLifecycle$1(this.$productData, this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((QRValidationComponent$startQrLifecycle$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f17538a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            ResultKt.b(obj);
            Ref.BooleanRef booleanRef = new Ref.BooleanRef();
            Ref.ObjectRef objectRef = new Ref.ObjectRef();
            QRValidationComponent qRValidationComponent = this.this$0;
            Flow flowA = qRValidationComponent.p.a(this.$productData, qRValidationComponent.W0());
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, objectRef, booleanRef, null);
            this.label = 1;
            if (FlowKt.j(flowA, anonymousClass1, this) == coroutineSingletons) {
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
