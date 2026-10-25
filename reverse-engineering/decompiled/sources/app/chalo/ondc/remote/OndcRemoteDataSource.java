package app.chalo.ondc.remote;

import app.chalo.ondc.model.api.request.ONDCFetchFareRequestApiModel;
import app.chalo.ondc.model.api.request.OndcBookingRequestApiModel;
import app.chalo.ondc.model.api.request.OndcConfirmBookingApiModel;
import app.chalo.ondc.model.api.request.OndcOrderRequestApiModel;
import app.chalo.providers.cityprovider.impl.data.models.app.ChaloTransitMode;
import java.util.LinkedHashMap;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/ondc/remote/OndcRemoteDataSource;", "", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public interface OndcRemoteDataSource {
    Object a(LinkedHashMap linkedHashMap, String str, ContinuationImpl continuationImpl);

    Object b(String str, ContinuationImpl continuationImpl);

    Object c(OndcOrderRequestApiModel ondcOrderRequestApiModel, ContinuationImpl continuationImpl);

    Object d(OndcConfirmBookingApiModel ondcConfirmBookingApiModel, ContinuationImpl continuationImpl);

    Object e(ONDCFetchFareRequestApiModel oNDCFetchFareRequestApiModel, ContinuationImpl continuationImpl);

    Object f(String str, ContinuationImpl continuationImpl);

    Object g(String str, ContinuationImpl continuationImpl);

    Object h(String str, String str2, ChaloTransitMode chaloTransitMode, ContinuationImpl continuationImpl);

    Object i(String str, String str2, ContinuationImpl continuationImpl);

    Object j(OndcBookingRequestApiModel ondcBookingRequestApiModel, ContinuationImpl continuationImpl);
}
