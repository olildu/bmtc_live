package app.chalo.core.database.dao;

import app.chalo.core.Ondc_metro_ticket_tableQueries;
import defpackage.kb0;
import defpackage.ln0;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0006\n\u0000\n\u0002\u0010\u0002\u0010\u0000\u001a\u00020\u0001H\n"}, d2 = {"<anonymous>", ""}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "app.chalo.core.database.dao.OndcMetroTicketDaoImpl$updateMetroTicketExpiryTime$2", f = "OndcMetroTicketDaoImpl.kt", l = {}, m = "invokeSuspend", v = 1)
final class OndcMetroTicketDaoImpl$updateMetroTicketExpiryTime$2 extends SuspendLambda implements Function1<Continuation<? super Unit>, Object> {
    final /* synthetic */ String $bookingId;
    final /* synthetic */ long $updatedExpiryTime;
    int label;
    final /* synthetic */ OndcMetroTicketDaoImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OndcMetroTicketDaoImpl$updateMetroTicketExpiryTime$2(OndcMetroTicketDaoImpl ondcMetroTicketDaoImpl, long j, String str, Continuation continuation) {
        super(1, continuation);
        this.this$0 = ondcMetroTicketDaoImpl;
        this.$updatedExpiryTime = j;
        this.$bookingId = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Continuation continuation) {
        return new OndcMetroTicketDaoImpl$updateMetroTicketExpiryTime$2(this.this$0, this.$updatedExpiryTime, this.$bookingId, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        OndcMetroTicketDaoImpl$updateMetroTicketExpiryTime$2 ondcMetroTicketDaoImpl$updateMetroTicketExpiryTime$2 = (OndcMetroTicketDaoImpl$updateMetroTicketExpiryTime$2) create((Continuation) obj);
        Unit unit = Unit.f17538a;
        ondcMetroTicketDaoImpl$updateMetroTicketExpiryTime$2.invokeSuspend(unit);
        return unit;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.b(obj);
        Ondc_metro_ticket_tableQueries ondc_metro_ticket_tableQueries = this.this$0.f2064a;
        Long l = new Long(this.$updatedExpiryTime);
        String bookingId = this.$bookingId;
        ondc_metro_ticket_tableQueries.getClass();
        Intrinsics.i(bookingId, "bookingId");
        ondc_metro_ticket_tableQueries.f697a.A0(1848614635, "UPDATE ondc_metro_ticket_table SET activationExpiryTime = ? WHERE bookingId = ?", new kb0(2, bookingId, l));
        ondc_metro_ticket_tableQueries.T(1848614635, new ln0(25));
        return Unit.f17538a;
    }
}
