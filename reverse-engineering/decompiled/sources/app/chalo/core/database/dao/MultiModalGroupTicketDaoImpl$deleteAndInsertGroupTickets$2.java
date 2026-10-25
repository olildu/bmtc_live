package app.chalo.core.database.dao;

import app.chalo.instantticket.data.model.InstantTicketEntity;
import app.chalo.metro.dao.ondc.OndcMetroTicketEntity;
import app.chalo.multimodalticket.data.model.MultiModalGroupTicketEntity;
import defpackage.aj;
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
@DebugMetadata(c = "app.chalo.core.database.dao.MultiModalGroupTicketDaoImpl$deleteAndInsertGroupTickets$2", f = "MultiModalGroupTicketDaoImpl.kt", l = {}, m = "invokeSuspend", v = 1)
final class MultiModalGroupTicketDaoImpl$deleteAndInsertGroupTickets$2 extends SuspendLambda implements Function1<Continuation<? super Unit>, Object> {
    final /* synthetic */ List<String> $cityIdsList;
    final /* synthetic */ List<MultiModalGroupTicketEntity> $groups;
    final /* synthetic */ List<InstantTicketEntity> $instantTickets;
    final /* synthetic */ List<OndcMetroTicketEntity> $ondcMetroTickets;
    final /* synthetic */ String $userId;
    int label;
    final /* synthetic */ MultiModalGroupTicketDaoImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MultiModalGroupTicketDaoImpl$deleteAndInsertGroupTickets$2(MultiModalGroupTicketDaoImpl multiModalGroupTicketDaoImpl, String str, List list, List list2, List list3, List list4, Continuation continuation) {
        super(1, continuation);
        this.this$0 = multiModalGroupTicketDaoImpl;
        this.$userId = str;
        this.$cityIdsList = list;
        this.$groups = list2;
        this.$instantTickets = list3;
        this.$ondcMetroTickets = list4;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Continuation continuation) {
        return new MultiModalGroupTicketDaoImpl$deleteAndInsertGroupTickets$2(this.this$0, this.$userId, this.$cityIdsList, this.$groups, this.$instantTickets, this.$ondcMetroTickets, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) throws Throwable {
        MultiModalGroupTicketDaoImpl$deleteAndInsertGroupTickets$2 multiModalGroupTicketDaoImpl$deleteAndInsertGroupTickets$2 = (MultiModalGroupTicketDaoImpl$deleteAndInsertGroupTickets$2) create((Continuation) obj);
        Unit unit = Unit.f17538a;
        multiModalGroupTicketDaoImpl$deleteAndInsertGroupTickets$2.invokeSuspend(unit);
        return unit;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.b(obj);
        MultiModalGroupTicketDaoImpl multiModalGroupTicketDaoImpl = this.this$0;
        multiModalGroupTicketDaoImpl.f2055a.V(new aj(multiModalGroupTicketDaoImpl, this.$userId, this.$cityIdsList, this.$groups, this.$instantTickets, this.$ondcMetroTickets));
        return Unit.f17538a;
    }
}
