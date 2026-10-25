package app.chalo.core.database.dao;

import app.chalo.core.Metro_ticket_tableQueries;
import app.chalo.metro.dao.MetroTicketEntity;
import defpackage.t60;
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
@Metadata(d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001H\n"}, d2 = {"<anonymous>", "Lapp/chalo/core/Metro_ticket_tableQueries;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "app.chalo.core.database.dao.MetroTicketDaoImpl$clearExistingDataAndInsertMetroTickets$2", f = "MetroTicketDaoImpl.kt", l = {}, m = "invokeSuspend", v = 1)
final class MetroTicketDaoImpl$clearExistingDataAndInsertMetroTickets$2 extends SuspendLambda implements Function1<Continuation<? super Metro_ticket_tableQueries>, Object> {
    final /* synthetic */ List<MetroTicketEntity> $ticketsList;
    int label;
    final /* synthetic */ MetroTicketDaoImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MetroTicketDaoImpl$clearExistingDataAndInsertMetroTickets$2(MetroTicketDaoImpl metroTicketDaoImpl, List list, Continuation continuation) {
        super(1, continuation);
        this.this$0 = metroTicketDaoImpl;
        this.$ticketsList = list;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Continuation continuation) {
        return new MetroTicketDaoImpl$clearExistingDataAndInsertMetroTickets$2(this.this$0, this.$ticketsList, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return ((MetroTicketDaoImpl$clearExistingDataAndInsertMetroTickets$2) create((Continuation) obj)).invokeSuspend(Unit.f17538a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.b(obj);
        Metro_ticket_tableQueries metro_ticket_tableQueries = this.this$0.f2054a;
        metro_ticket_tableQueries.V(new t60(26, metro_ticket_tableQueries, this.$ticketsList));
        return metro_ticket_tableQueries;
    }
}
