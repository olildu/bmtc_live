package app.chalo.home.data.repository;

import app.chalo.models.LastRideInfo;
import app.chalo.models.mticketing.MTicket;
import app.chalo.models.mticketing.MTicketActivationInfoAppModel;
import app.chalo.models.mticketing.MTicketTripReceipt;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.flow.Flow;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/home/data/repository/TicketRepository;", "", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public interface TicketRepository {
    Object a(MTicket mTicket, ContinuationImpl continuationImpl);

    Object b(String str, LastRideInfo lastRideInfo, ContinuationImpl continuationImpl);

    Object c(String str, ContinuationImpl continuationImpl);

    Object d(String str, MTicketTripReceipt mTicketTripReceipt, Continuation continuation);

    Object e(String str, ContinuationImpl continuationImpl);

    Object f(Continuation continuation);

    Object g(String str, ContinuationImpl continuationImpl);

    Object h(String str, ContinuationImpl continuationImpl);

    Object i(MTicketActivationInfoAppModel mTicketActivationInfoAppModel, ContinuationImpl continuationImpl);

    Object j(String str, String str2, ContinuationImpl continuationImpl);

    Flow k();

    Object l(Continuation continuation);
}
