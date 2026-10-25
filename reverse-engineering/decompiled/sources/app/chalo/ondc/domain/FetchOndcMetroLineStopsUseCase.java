package app.chalo.ondc.domain;

import app.chalo.instantticket.data.exception.ProductBookingRemoteDataException;
import app.chalo.metro.data.app.MetroLineStopListAppModel;
import app.chalo.network.exception.ChaloLocalException;
import app.chalo.network.exception.NetworkSuccessResponseParseException;
import app.chalo.network.model.GenericChaloErrorResponse;
import app.chalo.ondc.error.InvalidMetroLineStopListDataException;
import app.chalo.ondc.repository.OndcRepository;
import app.chalo.productbooking.common.data.error.ProductBookingDataSourceError;
import app.chalo.providers.cityprovider.CityProvider;
import app.chalo.providers.cityprovider.impl.data.models.app.ChaloTransitMode;
import app.chalo.providers.cityprovider.impl.data.models.app.CityAppModel;
import app.chalo.utils.ChaloUseCaseResult;
import defpackage.dd;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/ondc/domain/FetchOndcMetroLineStopsUseCase;", "", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class FetchOndcMetroLineStopsUseCase {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CityProvider f6713a;
    public final OndcRepository b;

    public FetchOndcMetroLineStopsUseCase(OndcRepository ondcRepository, CityProvider cityProvider) {
        this.f6713a = cityProvider;
        this.b = ondcRepository;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(String str, ContinuationImpl continuationImpl) {
        FetchOndcMetroLineStopsUseCase$invoke$1 fetchOndcMetroLineStopsUseCase$invoke$1;
        Object unknown;
        String str2;
        if (continuationImpl instanceof FetchOndcMetroLineStopsUseCase$invoke$1) {
            fetchOndcMetroLineStopsUseCase$invoke$1 = (FetchOndcMetroLineStopsUseCase$invoke$1) continuationImpl;
            int i = fetchOndcMetroLineStopsUseCase$invoke$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                fetchOndcMetroLineStopsUseCase$invoke$1.label = i - Integer.MIN_VALUE;
            } else {
                fetchOndcMetroLineStopsUseCase$invoke$1 = new FetchOndcMetroLineStopsUseCase$invoke$1(this, continuationImpl);
            }
        } else {
            fetchOndcMetroLineStopsUseCase$invoke$1 = new FetchOndcMetroLineStopsUseCase$invoke$1(this, continuationImpl);
        }
        Object objO = fetchOndcMetroLineStopsUseCase$invoke$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = fetchOndcMetroLineStopsUseCase$invoke$1.label;
        try {
            if (i2 == 0) {
                ResultKt.b(objO);
                CityAppModel cityAppModel = (CityAppModel) this.f6713a.b().getValue();
                if (cityAppModel != null && (str2 = cityAppModel.f8854a) != null) {
                    OndcRepository ondcRepository = this.b;
                    ChaloTransitMode chaloTransitMode = ChaloTransitMode.METRO;
                    fetchOndcMetroLineStopsUseCase$invoke$1.label = 1;
                    objO = ondcRepository.o(str2, str, chaloTransitMode, fetchOndcMetroLineStopsUseCase$invoke$1);
                    if (objO == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                }
                return new ChaloUseCaseResult.Failure(ProductBookingDataSourceError.UnavailableCityDetails.b);
            }
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(objO);
            return new ChaloUseCaseResult.Success(((MetroLineStopListAppModel) objO).f5429a);
        } catch (Exception e) {
            if (e instanceof ChaloLocalException) {
                unknown = new ProductBookingDataSourceError.Local(e.getMessage());
            } else if (e instanceof ProductBookingRemoteDataException) {
                String message = e.getMessage();
                ProductBookingRemoteDataException productBookingRemoteDataException = (ProductBookingRemoteDataException) e;
                GenericChaloErrorResponse errorResponse = productBookingRemoteDataException.getErrorResponse();
                String strC = dd.c(errorResponse != null ? new Integer(errorResponse.f6497a) : null, message, " code: ");
                GenericChaloErrorResponse errorResponse2 = productBookingRemoteDataException.getErrorResponse();
                unknown = new ProductBookingDataSourceError.API(strC, errorResponse2 != null ? new Integer(errorResponse2.f6497a) : null);
            } else if (e instanceof NetworkSuccessResponseParseException) {
                unknown = ProductBookingDataSourceError.ResponseParsing.b;
            } else {
                unknown = e instanceof InvalidMetroLineStopListDataException ? ProductBookingDataSourceError.InvalidData.b : new ProductBookingDataSourceError.Unknown(e.getMessage());
            }
            return new ChaloUseCaseResult.Failure(unknown);
        }
    }
}
