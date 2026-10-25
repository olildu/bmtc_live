package app.chalo.instantticket.data.remotesource;

import app.chalo.instantticket.data.model.api.request.FetchMobileTicketFareRequestApiModel;
import app.chalo.instantticket.data.model.api.request.InstantTicketOrderRequestApiModel;
import app.chalo.instantticket.data.model.api.request.ValidateInstantTicketFareRequestApiModel;
import java.util.Map;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/instantticket/data/remotesource/InstantTicketRemoteDataSource;", "", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public interface InstantTicketRemoteDataSource {
    Object a(FetchMobileTicketFareRequestApiModel fetchMobileTicketFareRequestApiModel, ContinuationImpl continuationImpl);

    Object b(InstantTicketOrderRequestApiModel instantTicketOrderRequestApiModel, ContinuationImpl continuationImpl);

    Object c(String str, ContinuationImpl continuationImpl);

    Object d(String str, ContinuationImpl continuationImpl);

    Object e(String str, Map map, ContinuationImpl continuationImpl);

    Object f(ValidateInstantTicketFareRequestApiModel validateInstantTicketFareRequestApiModel, ContinuationImpl continuationImpl);
}
