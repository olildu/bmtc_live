package app.chalo.instantticket.ui.routeselection;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "app.chalo.instantticket.ui.routeselection.RouteBasedStopSearchForProductPurchaseComponent$handleNextButtonClickedIntent$1", f = "RouteBasedStopSearchForProductPurchaseComponent.kt", l = {220, 235, 237}, m = "invokeSuspend", v = 1)
final class RouteBasedStopSearchForProductPurchaseComponent$handleNextButtonClickedIntent$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int I$0;
    Object L$0;
    int label;
    final /* synthetic */ RouteBasedStopSearchForProductPurchaseComponent this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RouteBasedStopSearchForProductPurchaseComponent$handleNextButtonClickedIntent$1(RouteBasedStopSearchForProductPurchaseComponent routeBasedStopSearchForProductPurchaseComponent, Continuation continuation) {
        super(2, continuation);
        this.this$0 = routeBasedStopSearchForProductPurchaseComponent;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new RouteBasedStopSearchForProductPurchaseComponent$handleNextButtonClickedIntent$1(this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((RouteBasedStopSearchForProductPurchaseComponent$handleNextButtonClickedIntent$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f17538a);
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0097  */
    /* JADX WARN: Code duplicated, block: B:24:0x00b8  */
    /* JADX WARN: Code duplicated, block: B:27:0x00cb  */
    /* JADX WARN: Code duplicated, block: B:30:0x00dc A[PHI: r2 r5
      0x00dc: PHI (r2v24 int) = (r2v16 int), (r2v40 int) binds: [B:28:0x00d9, B:10:0x0022] A[DONT_GENERATE, DONT_INLINE]
      0x00dc: PHI (r5v2 java.lang.Object) = (r5v1 java.lang.Object), (r5v14 java.lang.Object) binds: [B:28:0x00d9, B:10:0x0022] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:32:0x00e2  */
    /* JADX WARN: Code duplicated, block: B:34:0x00ea  */
    /* JADX WARN: Code duplicated, block: B:39:0x010e  */
    /* JADX WARN: Code duplicated, block: B:42:0x0113  */
    /* JADX WARN: Code duplicated, block: B:45:0x011b  */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0077, code lost:
    
        if (r2 == r1) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00f8, code lost:
    
        if (r2 == r1) goto L36;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r22) {
        /*
            Method dump skipped, instruction units count: 420
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: app.chalo.instantticket.ui.routeselection.RouteBasedStopSearchForProductPurchaseComponent$handleNextButtonClickedIntent$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
