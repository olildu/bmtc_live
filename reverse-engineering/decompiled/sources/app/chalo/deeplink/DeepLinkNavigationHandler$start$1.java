package app.chalo.deeplink;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "result", "Lapp/chalo/deeplink/DeepLinkResolutionResult;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "app.chalo.deeplink.DeepLinkNavigationHandler$start$1", f = "DeepLinkNavigationHandler.kt", l = {63, 70}, m = "invokeSuspend", v = 1)
final class DeepLinkNavigationHandler$start$1 extends SuspendLambda implements Function2<DeepLinkResolutionResult, Continuation<? super Unit>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ DeepLinkNavigationHandler this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DeepLinkNavigationHandler$start$1(DeepLinkNavigationHandler deepLinkNavigationHandler, Continuation continuation) {
        super(2, continuation);
        this.this$0 = deepLinkNavigationHandler;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        DeepLinkNavigationHandler$start$1 deepLinkNavigationHandler$start$1 = new DeepLinkNavigationHandler$start$1(this.this$0, continuation);
        deepLinkNavigationHandler$start$1.L$0 = obj;
        return deepLinkNavigationHandler$start$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((DeepLinkNavigationHandler$start$1) create((DeepLinkResolutionResult) obj, (Continuation) obj2)).invokeSuspend(Unit.f17538a);
    }

    /* JADX WARN: Code duplicated, block: B:28:0x00b1  */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0076, code lost:
    
        if (app.chalo.deeplink.DeepLinkNavigationHandler.a(r2, r21) == r1) goto L19;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r22) {
        /*
            Method dump skipped, instruction units count: 1331
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: app.chalo.deeplink.DeepLinkNavigationHandler$start$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
