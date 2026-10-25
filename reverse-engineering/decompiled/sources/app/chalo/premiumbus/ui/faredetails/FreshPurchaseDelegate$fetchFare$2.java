package app.chalo.premiumbus.ui.faredetails;

import app.chalo.premiumbus.ui.faredetails.contract.PremiumBusFareDetailsSharedContext;
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
@DebugMetadata(c = "app.chalo.premiumbus.ui.faredetails.FreshPurchaseDelegate$fetchFare$2", f = "FreshPurchaseDelegate.kt", l = {351, 361, 375}, m = "invokeSuspend", v = 1)
final class FreshPurchaseDelegate$fetchFare$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ PremiumBusFareDetailsSharedContext $context;
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    boolean Z$0;
    int label;
    final /* synthetic */ FreshPurchaseDelegate this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FreshPurchaseDelegate$fetchFare$2(PremiumBusFareDetailsSharedContext premiumBusFareDetailsSharedContext, FreshPurchaseDelegate freshPurchaseDelegate, Continuation continuation) {
        super(2, continuation);
        this.$context = premiumBusFareDetailsSharedContext;
        this.this$0 = freshPurchaseDelegate;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new FreshPurchaseDelegate$fetchFare$2(this.$context, this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((FreshPurchaseDelegate$fetchFare$2) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f17538a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0089, code lost:
    
        if (app.chalo.premiumbus.ui.faredetails.FreshPurchaseDelegate.h(r3, r2, r32) == r1) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00b8, code lost:
    
        if (r9 == r1) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00ed, code lost:
    
        if (r8.c(r6, app.chalo.premiumbus.ui.faredetails.contract.PremiumBusFareDetailsDataState.a(r4, false, new app.chalo.premiumbus.ui.faredetails.contract.PremiumBusFareDetailsError((java.lang.String) r9, true), 0, null, false, false, r2, null, null, null, null, null, null, 0, null, null, null, false, null, 1048440)) != false) goto L33;
     */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:29:0x00b8 -> B:8:0x0026). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r33) {
        /*
            Method dump skipped, instruction units count: 248
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: app.chalo.premiumbus.ui.faredetails.FreshPurchaseDelegate$fetchFare$2.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
