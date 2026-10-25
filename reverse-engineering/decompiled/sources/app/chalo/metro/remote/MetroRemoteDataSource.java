package app.chalo.metro.remote;

import app.chalo.metro.data.api.MetroLiveBookingStatusRequestApiModel;
import app.chalo.metro.data.api.MetroTicketOrderRequestApiModel;
import app.chalo.metro.data.api.MetroTicketUpdateRequestApiModel;
import app.chalo.metro.data.api.TicketFinalFareRequestApiModel;
import app.chalo.productbooking.common.data.models.api.request.TicketBookingFareRequestApiModel;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/metro/remote/MetroRemoteDataSource;", "", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public interface MetroRemoteDataSource {
    Object b(MetroLiveBookingStatusRequestApiModel metroLiveBookingStatusRequestApiModel, ContinuationImpl continuationImpl);

    Object c(MetroTicketUpdateRequestApiModel metroTicketUpdateRequestApiModel, ContinuationImpl continuationImpl);

    Object d(TicketFinalFareRequestApiModel ticketFinalFareRequestApiModel, ContinuationImpl continuationImpl);

    Object e(String str, ContinuationImpl continuationImpl);

    Object f(TicketBookingFareRequestApiModel ticketBookingFareRequestApiModel, ContinuationImpl continuationImpl);

    Object g(MetroTicketOrderRequestApiModel metroTicketOrderRequestApiModel, ContinuationImpl continuationImpl);
}
