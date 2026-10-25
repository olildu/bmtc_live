package app.chalo.premiumbus.ui.faredetails;

import app.chalo.premiumbus.data.models.api.request.PBTicketSelectedPassengerApiRequestModel;
import app.chalo.premiumbus.data.models.api.request.PBTicketSelectedTripDetailsApiRequestModel;
import app.chalo.premiumbus.ui.faredetails.contract.PremiumBusFareDetailsDataState;
import app.chalo.premiumbus.ui.faredetails.contract.PremiumBusFareDetailsSharedContext;
import java.util.List;
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
@DebugMetadata(c = "app.chalo.premiumbus.ui.faredetails.FreshPurchaseDelegate$handleOnPayButtonClickedIntent$3", f = "FreshPurchaseDelegate.kt", l = {533, 554, 583, 614, 623}, m = "invokeSuspend", v = 1)
final class FreshPurchaseDelegate$handleOnPayButtonClickedIntent$3 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ String $agency;
    final /* synthetic */ long $amount;
    final /* synthetic */ String $configId;
    final /* synthetic */ PremiumBusFareDetailsSharedContext $context;
    final /* synthetic */ PremiumBusFareDetailsDataState $loadedState;
    final /* synthetic */ List<PBTicketSelectedPassengerApiRequestModel> $passengerDetails;
    final /* synthetic */ PBTicketSelectedTripDetailsApiRequestModel $tripDetails;
    Object L$0;
    int label;
    final /* synthetic */ FreshPurchaseDelegate this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FreshPurchaseDelegate$handleOnPayButtonClickedIntent$3(FreshPurchaseDelegate freshPurchaseDelegate, PremiumBusFareDetailsSharedContext premiumBusFareDetailsSharedContext, String str, long j, PBTicketSelectedTripDetailsApiRequestModel pBTicketSelectedTripDetailsApiRequestModel, List list, PremiumBusFareDetailsDataState premiumBusFareDetailsDataState, String str2, Continuation continuation) {
        super(2, continuation);
        this.this$0 = freshPurchaseDelegate;
        this.$context = premiumBusFareDetailsSharedContext;
        this.$configId = str;
        this.$amount = j;
        this.$tripDetails = pBTicketSelectedTripDetailsApiRequestModel;
        this.$passengerDetails = list;
        this.$loadedState = premiumBusFareDetailsDataState;
        this.$agency = str2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new FreshPurchaseDelegate$handleOnPayButtonClickedIntent$3(this.this$0, this.$context, this.$configId, this.$amount, this.$tripDetails, this.$passengerDetails, this.$loadedState, this.$agency, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((FreshPurchaseDelegate$handleOnPayButtonClickedIntent$3) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f17538a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:135:0x0428, code lost:
    
        if (r0 == r10) goto L136;
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x033f, code lost:
    
        if (r0 == r10) goto L136;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r46) {
        /*
            Method dump skipped, instruction units count: 1083
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: app.chalo.premiumbus.ui.faredetails.FreshPurchaseDelegate$handleOnPayButtonClickedIntent$3.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
