package app.chalo.instantticket.ui.faredetails;

import app.chalo.instantticket.data.model.app.request.PassengerDetailData;
import app.chalo.ondc.model.api.request.OndcTicketTripDetails;
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
@DebugMetadata(c = "app.chalo.instantticket.ui.faredetails.FareDetailsComponent$createOndcBooking$2", f = "FareDetailsComponent.kt", l = {1101, 1122, 1143}, m = "invokeSuspend", v = 1)
final class FareDetailsComponent$createOndcBooking$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ String $configId;
    final /* synthetic */ List<PassengerDetailData> $passengerDetails;
    final /* synthetic */ String $providerId;
    final /* synthetic */ String $transactionId;
    final /* synthetic */ OndcTicketTripDetails $tripDetails;
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    final /* synthetic */ FareDetailsComponent this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FareDetailsComponent$createOndcBooking$2(FareDetailsComponent fareDetailsComponent, String str, String str2, List list, OndcTicketTripDetails ondcTicketTripDetails, String str3, Continuation continuation) {
        super(2, continuation);
        this.this$0 = fareDetailsComponent;
        this.$configId = str;
        this.$providerId = str2;
        this.$passengerDetails = list;
        this.$tripDetails = ondcTicketTripDetails;
        this.$transactionId = str3;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new FareDetailsComponent$createOndcBooking$2(this.this$0, this.$configId, this.$providerId, this.$passengerDetails, this.$tripDetails, this.$transactionId, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((FareDetailsComponent$createOndcBooking$2) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f17538a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:40:0x0147, code lost:
    
        if (r0 == r10) goto L41;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r20) {
        /*
            Method dump skipped, instruction units count: 364
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: app.chalo.instantticket.ui.faredetails.FareDetailsComponent$createOndcBooking$2.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
