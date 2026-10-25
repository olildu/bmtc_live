package app.chalo.ondc.repository;

import app.chalo.models.UserBookingsStatusType;
import app.chalo.models.ondc.OndcTicketReceiptAppModel;
import app.chalo.ondc.model.app.OndcMetroTicketAppModel;
import app.chalo.ondc.model.app.OndcTicketAppModel;
import app.chalo.ondc.model.app.request.ONDCFetchFareRequestAppModel;
import app.chalo.ondc.model.app.request.OndcBookingRequestAppModel;
import app.chalo.ondc.model.app.request.OndcOrderRequestAppModel;
import app.chalo.providers.cityprovider.impl.data.models.app.ChaloTransitMode;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/ondc/repository/OndcRepository;", "", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public interface OndcRepository {

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class DefaultImpls {
    }

    OndcRepositoryImpl$getOndcTicketReceiptFlow$$inlined$map$1 a(String str);

    Object b(String str, ContinuationImpl continuationImpl);

    Object c(ArrayList arrayList, Continuation continuation);

    Object d(OndcTicketAppModel ondcTicketAppModel, ContinuationImpl continuationImpl);

    Object e(String str, String str2, String str3, Continuation continuation);

    Object f(Continuation continuation);

    Object g(String str, String str2, String str3, Continuation continuation);

    Object h(Continuation continuation);

    Object i(OndcBookingRequestAppModel ondcBookingRequestAppModel, ContinuationImpl continuationImpl);

    Object j(UserBookingsStatusType userBookingsStatusType, ContinuationImpl continuationImpl);

    Object k(String str, ContinuationImpl continuationImpl);

    Object l(String str, String str2, String str3, String str4, ChaloTransitMode chaloTransitMode, boolean z, ContinuationImpl continuationImpl);

    OndcRepositoryImpl$getOndcMetroTicketAsFlow$$inlined$map$1 m(String str);

    Object n(ArrayList arrayList, Continuation continuation);

    Object o(String str, String str2, ChaloTransitMode chaloTransitMode, ContinuationImpl continuationImpl);

    Object p(UserBookingsStatusType userBookingsStatusType, ContinuationImpl continuationImpl);

    Object q(String str, Continuation continuation);

    Object r(OndcMetroTicketAppModel ondcMetroTicketAppModel, Continuation continuation);

    Object s(OndcTicketReceiptAppModel ondcTicketReceiptAppModel, ContinuationImpl continuationImpl);

    Object t(String str, ChaloTransitMode chaloTransitMode, ContinuationImpl continuationImpl);

    Object u(ONDCFetchFareRequestAppModel oNDCFetchFareRequestAppModel, ContinuationImpl continuationImpl);

    Object v(String str, ContinuationImpl continuationImpl);

    Object w(OndcOrderRequestAppModel ondcOrderRequestAppModel, ContinuationImpl continuationImpl);

    OndcRepositoryImpl$getOndcTicketAsFlow$$inlined$map$1 x(String str);
}
