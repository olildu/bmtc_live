package app.chalo.premiumbus.ui.faredetails;

import app.chalo.premiumbus.data.models.api.request.PBTicketSelectedTripDetailsApiRequestModel;
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
@DebugMetadata(c = "app.chalo.premiumbus.ui.faredetails.TicketPurchaseThroughPassDelegate$handleOnPayButtonClickedIntent$3", f = "TicketPurchaseThroughPassDelegate.kt", l = {212, 234, 254, 259, 269, 290}, m = "invokeSuspend", v = 1)
final class TicketPurchaseThroughPassDelegate$handleOnPayButtonClickedIntent$3 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ PremiumBusFareDetailsSharedContext $context;
    final /* synthetic */ String $passId;
    final /* synthetic */ PBTicketSelectedTripDetailsApiRequestModel $tripDetails;
    Object L$0;
    int label;
    final /* synthetic */ TicketPurchaseThroughPassDelegate this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TicketPurchaseThroughPassDelegate$handleOnPayButtonClickedIntent$3(TicketPurchaseThroughPassDelegate ticketPurchaseThroughPassDelegate, PBTicketSelectedTripDetailsApiRequestModel pBTicketSelectedTripDetailsApiRequestModel, PremiumBusFareDetailsSharedContext premiumBusFareDetailsSharedContext, String str, Continuation continuation) {
        super(2, continuation);
        this.this$0 = ticketPurchaseThroughPassDelegate;
        this.$tripDetails = pBTicketSelectedTripDetailsApiRequestModel;
        this.$context = premiumBusFareDetailsSharedContext;
        this.$passId = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new TicketPurchaseThroughPassDelegate$handleOnPayButtonClickedIntent$3(this.this$0, this.$tripDetails, this.$context, this.$passId, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((TicketPurchaseThroughPassDelegate$handleOnPayButtonClickedIntent$3) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f17538a);
    }

    /* JADX WARN: Code duplicated, block: B:104:0x02f9  */
    /* JADX WARN: Code duplicated, block: B:17:0x0069  */
    /* JADX WARN: Code duplicated, block: B:27:0x0148  */
    /* JADX WARN: Code duplicated, block: B:29:0x014c  */
    /* JADX WARN: Code duplicated, block: B:31:0x0167  */
    /* JADX WARN: Code duplicated, block: B:33:0x0170 A[PHI: r17
      0x0170: PHI (r17v2 char) = (r17v0 char), (r17v0 char), (r17v0 char), (r17v0 char), (r17v0 char), (r17v0 char), (r17v3 char) binds: [B:40:0x0185, B:42:0x018b, B:44:0x0191, B:46:0x0197, B:48:0x019d, B:37:0x017e, B:32:0x016e] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:34:0x0173  */
    /* JADX WARN: Code duplicated, block: B:36:0x0179  */
    /* JADX WARN: Code duplicated, block: B:39:0x0181  */
    /* JADX WARN: Code duplicated, block: B:54:0x01d5  */
    /* JADX WARN: Code duplicated, block: B:56:0x01db  */
    /* JADX WARN: Code duplicated, block: B:60:0x01f2 A[PHI: r0
      0x01f2: PHI (r0v39 java.lang.String) = (r0v14 java.lang.String), (r0v23 java.lang.String), (r0v37 java.lang.String), (r0v46 java.lang.String) binds: [B:90:0x0283, B:55:0x01d9, B:59:0x01f0, B:94:0x0299] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:61:0x01f6  */
    /* JADX WARN: Code duplicated, block: B:91:0x0286  */
    /* JADX WARN: Code duplicated, block: B:99:0x02dc  */
    /* JADX WARN: Code restructure failed: missing block: B:100:0x02f0, code lost:
    
        if (r0 == r6) goto L101;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0106, code lost:
    
        if (app.chalo.premiumbus.ui.faredetails.PremiumBusFareDetailsDelegateSharedActionsKt.c(r0, r1, r3, r3, r2, r48) == r6) goto L101;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x01ec, code lost:
    
        if (r0 == r6) goto L101;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x023d, code lost:
    
        if (r0 == r6) goto L101;
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x0296, code lost:
    
        if (r0 == r6) goto L101;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r49) {
        /*
            Method dump skipped, instruction units count: 786
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: app.chalo.premiumbus.ui.faredetails.TicketPurchaseThroughPassDelegate$handleOnPayButtonClickedIntent$3.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
