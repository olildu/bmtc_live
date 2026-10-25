package app.chalo.instantticket.data;

import app.chalo.instantticket.data.localsource.InstantTicketLocalDataSource;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "app.chalo.instantticket.data.InstantTicketRepositoryImpl", f = "InstantTicketRepositoryImpl.kt", l = {120}, m = "getActiveOrPaymentProcessingInstantTicketsAsFlow", v = 1)
final class InstantTicketRepositoryImpl$getActiveOrPaymentProcessingInstantTicketsAsFlow$1 extends ContinuationImpl {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ InstantTicketRepositoryImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InstantTicketRepositoryImpl$getActiveOrPaymentProcessingInstantTicketsAsFlow$1(InstantTicketRepositoryImpl instantTicketRepositoryImpl, Continuation continuation) {
        super(continuation);
        this.this$0 = instantTicketRepositoryImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        InstantTicketRepositoryImpl$getActiveOrPaymentProcessingInstantTicketsAsFlow$1 instantTicketRepositoryImpl$getActiveOrPaymentProcessingInstantTicketsAsFlow$1;
        InstantTicketLocalDataSource instantTicketLocalDataSource;
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        InstantTicketRepositoryImpl instantTicketRepositoryImpl = this.this$0;
        instantTicketRepositoryImpl.getClass();
        int i = this.label;
        if ((i & Integer.MIN_VALUE) != 0) {
            this.label = i - Integer.MIN_VALUE;
            instantTicketRepositoryImpl$getActiveOrPaymentProcessingInstantTicketsAsFlow$1 = this;
        } else {
            instantTicketRepositoryImpl$getActiveOrPaymentProcessingInstantTicketsAsFlow$1 = new InstantTicketRepositoryImpl$getActiveOrPaymentProcessingInstantTicketsAsFlow$1(instantTicketRepositoryImpl, this);
        }
        Object obj2 = instantTicketRepositoryImpl$getActiveOrPaymentProcessingInstantTicketsAsFlow$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = instantTicketRepositoryImpl$getActiveOrPaymentProcessingInstantTicketsAsFlow$1.label;
        if (i2 == 0) {
            ResultKt.b(obj2);
            InstantTicketLocalDataSource instantTicketLocalDataSource2 = instantTicketRepositoryImpl.b;
            instantTicketRepositoryImpl$getActiveOrPaymentProcessingInstantTicketsAsFlow$1.L$0 = instantTicketLocalDataSource2;
            instantTicketRepositoryImpl$getActiveOrPaymentProcessingInstantTicketsAsFlow$1.label = 1;
            Object objO = instantTicketRepositoryImpl.o(instantTicketRepositoryImpl$getActiveOrPaymentProcessingInstantTicketsAsFlow$1);
            if (objO == coroutineSingletons) {
                return coroutineSingletons;
            }
            obj2 = objO;
            instantTicketLocalDataSource = instantTicketLocalDataSource2;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            instantTicketLocalDataSource = (InstantTicketLocalDataSource) instantTicketRepositoryImpl$getActiveOrPaymentProcessingInstantTicketsAsFlow$1.L$0;
            ResultKt.b(obj2);
        }
        List list = (List) obj2;
        String strM = instantTicketRepositoryImpl.e.m();
        if (strM == null) {
            strM = "";
        }
        return instantTicketLocalDataSource.j(strM, list);
    }
}
