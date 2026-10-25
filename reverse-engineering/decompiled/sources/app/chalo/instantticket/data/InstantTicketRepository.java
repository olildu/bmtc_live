package app.chalo.instantticket.data;

import app.chalo.instantticket.data.model.InstantTicketReceipt;
import app.chalo.instantticket.data.model.app.request.FetchMobileTicketFareRequestAppModel;
import app.chalo.instantticket.data.model.app.request.InstantTicketOrderRequestAppModel;
import app.chalo.instantticket.data.model.app.request.ValidateInstantTicketFareRequestAppModel;
import app.chalo.livetracking.universalsearch.data.model.api.AutoCompleteResultApiRequestModel;
import app.chalo.models.UserBookingsStatusType;
import java.io.Serializable;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.flow.Flow;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/instantticket/data/InstantTicketRepository;", "", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public interface InstantTicketRepository {

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class DefaultImpls {
    }

    Flow a(String str);

    Object b(InstantTicketReceipt instantTicketReceipt, Continuation continuation);

    Object c(String str, ContinuationImpl continuationImpl);

    Object d(String str, ContinuationImpl continuationImpl);

    Object e(UserBookingsStatusType userBookingsStatusType, ContinuationImpl continuationImpl);

    Object f(Continuation continuation);

    Object g(ValidateInstantTicketFareRequestAppModel validateInstantTicketFareRequestAppModel, ContinuationImpl continuationImpl);

    Flow h(String str);

    Serializable i(AutoCompleteResultApiRequestModel.Default r1, ContinuationImpl continuationImpl);

    Object j(long j, String str, Continuation continuation);

    Object k(FetchMobileTicketFareRequestAppModel fetchMobileTicketFareRequestAppModel, ContinuationImpl continuationImpl);

    Object l(InstantTicketOrderRequestAppModel instantTicketOrderRequestAppModel, ContinuationImpl continuationImpl);

    Object m(ArrayList arrayList, Continuation continuation);

    Object n(String str, ContinuationImpl continuationImpl);
}
