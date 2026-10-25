package app.chalo.premiumbus.ui.faredetails;

import app.chalo.models.productbooking.SuperPassPurchaseStopsInfo;
import app.chalo.premiumbus.data.models.app.PremiumBusPassUpsellAppModel;
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
@DebugMetadata(c = "app.chalo.premiumbus.ui.faredetails.FreshPurchaseDelegate$handleSeeUpsellDetailsClickedIntent$2", f = "FreshPurchaseDelegate.kt", l = {226, 235, 244}, m = "invokeSuspend", v = 1)
final class FreshPurchaseDelegate$handleSeeUpsellDetailsClickedIntent$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ PremiumBusFareDetailsSharedContext $context;
    final /* synthetic */ SuperPassPurchaseStopsInfo $stopsInfo;
    final /* synthetic */ PremiumBusPassUpsellAppModel $upsell;
    Object L$0;
    int label;
    final /* synthetic */ FreshPurchaseDelegate this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FreshPurchaseDelegate$handleSeeUpsellDetailsClickedIntent$2(FreshPurchaseDelegate freshPurchaseDelegate, PremiumBusPassUpsellAppModel premiumBusPassUpsellAppModel, SuperPassPurchaseStopsInfo superPassPurchaseStopsInfo, PremiumBusFareDetailsSharedContext premiumBusFareDetailsSharedContext, Continuation continuation) {
        super(2, continuation);
        this.this$0 = freshPurchaseDelegate;
        this.$upsell = premiumBusPassUpsellAppModel;
        this.$stopsInfo = superPassPurchaseStopsInfo;
        this.$context = premiumBusFareDetailsSharedContext;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new FreshPurchaseDelegate$handleSeeUpsellDetailsClickedIntent$2(this.this$0, this.$upsell, this.$stopsInfo, this.$context, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((FreshPurchaseDelegate$handleSeeUpsellDetailsClickedIntent$2) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f17538a);
    }

    /* JADX WARN: Code duplicated, block: B:28:0x00c0  */
    /* JADX WARN: Code duplicated, block: B:33:0x00db  */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0071, code lost:
    
        if (r0 == r6) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00d2, code lost:
    
        if (r0 == r6) goto L30;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r33) {
        /*
            Method dump skipped, instruction units count: 241
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: app.chalo.premiumbus.ui.faredetails.FreshPurchaseDelegate$handleSeeUpsellDetailsClickedIntent$2.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
