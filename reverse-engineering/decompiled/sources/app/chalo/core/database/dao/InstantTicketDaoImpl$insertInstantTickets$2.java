package app.chalo.core.database.dao;

import app.chalo.core.database.mappers.InstantTicketEntityMapperKt;
import app.chalo.instantticket.data.model.InstantTicketEntity;
import java.util.Iterator;
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
@Metadata(d1 = {"\u0000\u0006\n\u0000\n\u0002\u0010\u0002\u0010\u0000\u001a\u00020\u0001H\n"}, d2 = {"<anonymous>", ""}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "app.chalo.core.database.dao.InstantTicketDaoImpl$insertInstantTickets$2", f = "InstantTicketDaoImpl.kt", l = {}, m = "invokeSuspend", v = 1)
final class InstantTicketDaoImpl$insertInstantTickets$2 extends SuspendLambda implements Function1<Continuation<? super Unit>, Object> {
    final /* synthetic */ List<InstantTicketEntity> $instantTicketEntities;
    int label;
    final /* synthetic */ InstantTicketDaoImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InstantTicketDaoImpl$insertInstantTickets$2(InstantTicketDaoImpl instantTicketDaoImpl, List list, Continuation continuation) {
        super(1, continuation);
        this.$instantTicketEntities = list;
        this.this$0 = instantTicketDaoImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Continuation continuation) {
        return new InstantTicketDaoImpl$insertInstantTickets$2(this.this$0, this.$instantTicketEntities, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        InstantTicketDaoImpl$insertInstantTickets$2 instantTicketDaoImpl$insertInstantTickets$2 = (InstantTicketDaoImpl$insertInstantTickets$2) create((Continuation) obj);
        Unit unit = Unit.f17538a;
        instantTicketDaoImpl$insertInstantTickets$2.invokeSuspend(unit);
        return unit;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.b(obj);
        List<InstantTicketEntity> list = this.$instantTicketEntities;
        InstantTicketDaoImpl instantTicketDaoImpl = this.this$0;
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            instantTicketDaoImpl.f2051a.d0(InstantTicketEntityMapperKt.a((InstantTicketEntity) it.next()));
        }
        return Unit.f17538a;
    }
}
