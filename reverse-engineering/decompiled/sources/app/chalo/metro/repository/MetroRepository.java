package app.chalo.metro.repository;

import app.chalo.metro.data.api.MetroLiveBookingStatusRequestApiModel;
import app.chalo.metro.data.app.MetroTicketAppModel;
import app.chalo.metro.data.app.MetroTicketOrderRequestAppModel;
import app.chalo.metro.data.app.MetroTicketUpdateRequestAppModel;
import app.chalo.metro.data.app.TicketFinalFareRequestAppModel;
import app.chalo.models.UserBookingsStatusType;
import app.chalo.productbooking.common.data.models.app.request.TicketBookingFareRequestAppModel;
import java.io.Serializable;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/metro/repository/MetroRepository;", "", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public interface MetroRepository {

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class DefaultImpls {
    }

    Object a(Continuation continuation);

    Serializable b(MetroLiveBookingStatusRequestApiModel metroLiveBookingStatusRequestApiModel, ContinuationImpl continuationImpl);

    Object c(ArrayList arrayList, Continuation continuation);

    MetroRepositoryImpl$getMetroTicketAsFlow$$inlined$map$1 d(String str);

    Object e(MetroTicketAppModel metroTicketAppModel, Continuation continuation);

    Object f(UserBookingsStatusType userBookingsStatusType, ContinuationImpl continuationImpl);

    Object g(MetroTicketOrderRequestAppModel metroTicketOrderRequestAppModel, ContinuationImpl continuationImpl);

    Object h(TicketFinalFareRequestAppModel ticketFinalFareRequestAppModel, ContinuationImpl continuationImpl);

    Object i(String str, String str2, String str3, Continuation continuation);

    Serializable j(TicketBookingFareRequestAppModel ticketBookingFareRequestAppModel, ContinuationImpl continuationImpl);

    Object k(ArrayList arrayList, Continuation continuation);

    Object l(String str, ContinuationImpl continuationImpl);

    Object m(MetroTicketUpdateRequestAppModel metroTicketUpdateRequestAppModel, Continuation continuation);
}
