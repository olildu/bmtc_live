package app.chalo.core.database.dao;

import app.chalo.core.Ondc_metro_ticket_tableQueries;
import app.chalo.metro.dao.ondc.OndcMetroTicketEntity;
import defpackage.za0;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001H\n"}, d2 = {"<anonymous>", "Lapp/chalo/core/Ondc_metro_ticket_tableQueries;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "app.chalo.core.database.dao.OndcMetroTicketDaoImpl$deleteAllAndInsertNewTickets$2", f = "OndcMetroTicketDaoImpl.kt", l = {}, m = "invokeSuspend", v = 1)
final class OndcMetroTicketDaoImpl$deleteAllAndInsertNewTickets$2 extends SuspendLambda implements Function1<Continuation<? super Ondc_metro_ticket_tableQueries>, Object> {
    final /* synthetic */ List<OndcMetroTicketEntity> $ondcMetroTicketEntities;
    int label;
    final /* synthetic */ OndcMetroTicketDaoImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OndcMetroTicketDaoImpl$deleteAllAndInsertNewTickets$2(OndcMetroTicketDaoImpl ondcMetroTicketDaoImpl, List list, Continuation continuation) {
        super(1, continuation);
        this.this$0 = ondcMetroTicketDaoImpl;
        this.$ondcMetroTicketEntities = list;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Continuation continuation) {
        return new OndcMetroTicketDaoImpl$deleteAllAndInsertNewTickets$2(this.this$0, this.$ondcMetroTicketEntities, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return ((OndcMetroTicketDaoImpl$deleteAllAndInsertNewTickets$2) create((Continuation) obj)).invokeSuspend(Unit.f17538a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.b(obj);
        OndcMetroTicketDaoImpl ondcMetroTicketDaoImpl = this.this$0;
        Ondc_metro_ticket_tableQueries ondc_metro_ticket_tableQueries = ondcMetroTicketDaoImpl.f2064a;
        ondc_metro_ticket_tableQueries.V(new za0(17, ondcMetroTicketDaoImpl, this.$ondcMetroTicketEntities, ondc_metro_ticket_tableQueries));
        return ondc_metro_ticket_tableQueries;
    }
}
