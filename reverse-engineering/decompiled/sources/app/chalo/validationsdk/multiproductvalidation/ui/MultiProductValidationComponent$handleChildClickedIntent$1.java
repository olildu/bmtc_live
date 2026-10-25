package app.chalo.validationsdk.multiproductvalidation.ui;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import org.bouncycastle.math.Primes;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "app.chalo.validationsdk.multiproductvalidation.ui.MultiProductValidationComponent$handleChildClickedIntent$1", f = "MultiProductValidationComponent.kt", l = {TypedValues.PositionType.TYPE_PERCENT_X, Primes.SMALL_FACTOR_LIMIT, 216}, m = "invokeSuspend", v = 1)
final class MultiProductValidationComponent$handleChildClickedIntent$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ MultiProductValidationIntent.ChildClickedIntent $intent;
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    final /* synthetic */ MultiProductValidationComponent this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MultiProductValidationComponent$handleChildClickedIntent$1(MultiProductValidationComponent multiProductValidationComponent, MultiProductValidationIntent.ChildClickedIntent childClickedIntent, Continuation continuation) {
        super(2, continuation);
        this.this$0 = multiProductValidationComponent;
        this.$intent = childClickedIntent;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new MultiProductValidationComponent$handleChildClickedIntent$1(this.this$0, this.$intent, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((MultiProductValidationComponent$handleChildClickedIntent$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f17538a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:60:0x00f4, code lost:
    
        if (app.chalo.validationsdk.multiproductvalidation.ui.MultiProductValidationComponent.H0(r4, r14, r7, "multi product validation child deselected", r13) == r0) goto L61;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r14) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 257
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: app.chalo.validationsdk.multiproductvalidation.ui.MultiProductValidationComponent$handleChildClickedIntent$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
