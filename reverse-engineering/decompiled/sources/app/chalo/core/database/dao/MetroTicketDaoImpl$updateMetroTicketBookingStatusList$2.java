package app.chalo.core.database.dao;

import app.chalo.metro.dao.MetroTicketBookingStatusUpdateEntity;
import app.chalo.metro.data.app.MetroTicketStatus;
import app.chalo.vault.db.ChaloCoreDatabaseKt;
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
@DebugMetadata(c = "app.chalo.core.database.dao.MetroTicketDaoImpl$updateMetroTicketBookingStatusList$2", f = "MetroTicketDaoImpl.kt", l = {109}, m = "invokeSuspend", v = 1)
final class MetroTicketDaoImpl$updateMetroTicketBookingStatusList$2 extends SuspendLambda implements Function1<Continuation<? super Unit>, Object> {
    final /* synthetic */ List<MetroTicketBookingStatusUpdateEntity> $statusList;
    Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ MetroTicketDaoImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MetroTicketDaoImpl$updateMetroTicketBookingStatusList$2(MetroTicketDaoImpl metroTicketDaoImpl, List list, Continuation continuation) {
        super(1, continuation);
        this.$statusList = list;
        this.this$0 = metroTicketDaoImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Continuation continuation) {
        return new MetroTicketDaoImpl$updateMetroTicketBookingStatusList$2(this.this$0, this.$statusList, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return ((MetroTicketDaoImpl$updateMetroTicketBookingStatusList$2) create((Continuation) obj)).invokeSuspend(Unit.f17538a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        MetroTicketDaoImpl metroTicketDaoImpl;
        Iterator it;
        Object obj2;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            ResultKt.b(obj);
            List<MetroTicketBookingStatusUpdateEntity> list = this.$statusList;
            metroTicketDaoImpl = this.this$0;
            it = list.iterator();
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            it = (Iterator) this.L$1;
            metroTicketDaoImpl = (MetroTicketDaoImpl) this.L$0;
            ResultKt.b(obj);
        }
        do {
            boolean zHasNext = it.hasNext();
            obj2 = Unit.f17538a;
            if (!zHasNext) {
                return obj2;
            }
            MetroTicketBookingStatusUpdateEntity metroTicketBookingStatusUpdateEntity = (MetroTicketBookingStatusUpdateEntity) it.next();
            String str = metroTicketBookingStatusUpdateEntity.f5399a;
            MetroTicketStatus metroTicketStatus = metroTicketBookingStatusUpdateEntity.b;
            this.L$0 = metroTicketDaoImpl;
            this.L$1 = it;
            this.label = 1;
            Object objA = ChaloCoreDatabaseKt.a(metroTicketDaoImpl.b, new MetroTicketDaoImpl$updateMetroTicketBookingStatus$2(metroTicketDaoImpl, metroTicketStatus, str, null), this);
            if (objA == CoroutineSingletons.COROUTINE_SUSPENDED) {
                obj2 = objA;
            }
        } while (obj2 != coroutineSingletons);
        return coroutineSingletons;
    }
}
