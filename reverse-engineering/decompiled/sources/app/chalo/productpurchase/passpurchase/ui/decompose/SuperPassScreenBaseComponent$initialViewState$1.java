package app.chalo.productpurchase.passpurchase.ui.decompose;

import androidx.media3.extractor.ts.TsExtractor;
import app.chalo.productpurchase.passpurchase.ui.SuperPassPurchaseSharedState;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u0002H\u0001\"\b\b\u0000\u0010\u0001*\u00020\u0002*\u00020\u0003H\n"}, d2 = {"<anonymous>", "ViewState", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "app.chalo.productpurchase.passpurchase.ui.decompose.SuperPassScreenBaseComponent$initialViewState$1", f = "SuperPassScreenBaseComponent.kt", l = {TsExtractor.TS_STREAM_TYPE_HDMV_DTS}, m = "invokeSuspend", v = 1)
final class SuperPassScreenBaseComponent$initialViewState$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<Object>, Object> {
    int label;
    final /* synthetic */ SuperPassScreenBaseComponent<Object, Object, Object, Object> this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SuperPassScreenBaseComponent$initialViewState$1(SuperPassScreenBaseComponent superPassScreenBaseComponent, Continuation continuation) {
        super(2, continuation);
        this.this$0 = superPassScreenBaseComponent;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new SuperPassScreenBaseComponent$initialViewState$1(this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((SuperPassScreenBaseComponent$initialViewState$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f17538a);
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
        SuperPassScreenBaseComponent<Object, Object, Object, Object> superPassScreenBaseComponent = this.this$0;
        SuperPassPurchaseSharedState superPassPurchaseSharedState = (SuperPassPurchaseSharedState) superPassScreenBaseComponent.c.getState().getValue();
        Object value = this.this$0.f.getValue();
        this.label = 1;
        Object objA = superPassScreenBaseComponent.a(superPassPurchaseSharedState, value, this);
        return objA == coroutineSingletons ? coroutineSingletons : objA;
    }
}
