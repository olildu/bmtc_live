package app.chalo.ondc.repository;

import app.chalo.ondc.dao.OndcTicketEntity;
import app.chalo.ondc.dao.OndcTicketEntityKt;
import app.chalo.ondc.local.OndcLocalDataSource;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "app.chalo.ondc.repository.OndcRepositoryImpl", f = "OndcRepositoryImpl.kt", l = {194}, m = "getAllOndcTickets", v = 1)
final class OndcRepositoryImpl$getAllOndcTickets$1 extends ContinuationImpl {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ OndcRepositoryImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OndcRepositoryImpl$getAllOndcTickets$1(OndcRepositoryImpl ondcRepositoryImpl, Continuation continuation) {
        super(continuation);
        this.this$0 = ondcRepositoryImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        OndcRepositoryImpl$getAllOndcTickets$1 ondcRepositoryImpl$getAllOndcTickets$1;
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        OndcRepositoryImpl ondcRepositoryImpl = this.this$0;
        ondcRepositoryImpl.getClass();
        int i = this.label;
        if ((i & Integer.MIN_VALUE) != 0) {
            this.label = i - Integer.MIN_VALUE;
            ondcRepositoryImpl$getAllOndcTickets$1 = this;
        } else {
            ondcRepositoryImpl$getAllOndcTickets$1 = new OndcRepositoryImpl$getAllOndcTickets$1(ondcRepositoryImpl, this);
        }
        Object objD = ondcRepositoryImpl$getAllOndcTickets$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = ondcRepositoryImpl$getAllOndcTickets$1.label;
        if (i2 == 0) {
            ResultKt.b(objD);
            OndcLocalDataSource ondcLocalDataSource = ondcRepositoryImpl.b;
            String strY = ondcRepositoryImpl.y();
            String strZ = ondcRepositoryImpl.z();
            ondcRepositoryImpl$getAllOndcTickets$1.label = 1;
            objD = ondcLocalDataSource.d(strY, strZ, ondcRepositoryImpl$getAllOndcTickets$1);
            if (objD == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(objD);
        }
        Iterable iterable = (Iterable) objD;
        ArrayList arrayList = new ArrayList(CollectionsKt.v(iterable, 10));
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            arrayList.add(OndcTicketEntityKt.a((OndcTicketEntity) it.next()));
        }
        return arrayList;
    }
}
