package app.chalo.metro.domain;

import app.chalo.analytics.AnalyticsContractImplKt;
import app.chalo.analytics.contract.AnalyticsContract;
import app.chalo.constants.Source;
import app.chalo.instantticket.data.exception.InvalidFareResponseDataException;
import app.chalo.instantticket.data.exception.ProductBookingRemoteDataException;
import app.chalo.metro.repository.MetroRepository;
import app.chalo.network.exception.ChaloLocalException;
import app.chalo.network.exception.NetworkSuccessResponseParseException;
import app.chalo.network.model.GenericChaloErrorResponse;
import app.chalo.productbooking.common.data.error.ProductBookingDataSourceError;
import app.chalo.productbooking.common.data.models.app.request.TicketBookingFareRequestAppModel;
import app.chalo.providers.cityprovider.CityProvider;
import app.chalo.providers.cityprovider.CityProviderKt;
import app.chalo.providers.cityprovider.impl.data.models.app.ChaloTransitMode;
import app.chalo.utils.ChaloUseCaseResult;
import defpackage.dd;
import java.util.List;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.collections.MapsKt;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/metro/domain/FetchTicketBookingsFareUseCase;", "", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class FetchTicketBookingsFareUseCase {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CityProvider f5442a;
    public final MetroRepository b;
    public final AnalyticsContract c;

    public FetchTicketBookingsFareUseCase(CityProvider cityProvider, MetroRepository metroRepository, AnalyticsContract analyticsContract) {
        this.f5442a = cityProvider;
        this.b = metroRepository;
        this.c = analyticsContract;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(TicketBookingTripData ticketBookingTripData, String str, ChaloTransitMode chaloTransitMode, ContinuationImpl continuationImpl) {
        FetchTicketBookingsFareUseCase$invoke$1 fetchTicketBookingsFareUseCase$invoke$1;
        if (continuationImpl instanceof FetchTicketBookingsFareUseCase$invoke$1) {
            fetchTicketBookingsFareUseCase$invoke$1 = (FetchTicketBookingsFareUseCase$invoke$1) continuationImpl;
            int i = fetchTicketBookingsFareUseCase$invoke$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                fetchTicketBookingsFareUseCase$invoke$1.label = i - Integer.MIN_VALUE;
            } else {
                fetchTicketBookingsFareUseCase$invoke$1 = new FetchTicketBookingsFareUseCase$invoke$1(this, continuationImpl);
            }
        } else {
            fetchTicketBookingsFareUseCase$invoke$1 = new FetchTicketBookingsFareUseCase$invoke$1(this, continuationImpl);
        }
        Object objJ = fetchTicketBookingsFareUseCase$invoke$1.result;
        Object obj = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = fetchTicketBookingsFareUseCase$invoke$1.label;
        try {
            if (i2 == 0) {
                ResultKt.b(objJ);
                String strB = CityProviderKt.b(this.f5442a);
                if (strB == null) {
                    return new ChaloUseCaseResult.Failure(ProductBookingDataSourceError.UnavailableCityDetails.b);
                }
                String lowerCase = strB.toLowerCase(Locale.ROOT);
                Intrinsics.h(lowerCase, "toLowerCase(...)");
                ticketBookingTripData.getClass();
                TicketBookingFareRequestAppModel ticketBookingFareRequestAppModel = new TicketBookingFareRequestAppModel(lowerCase, chaloTransitMode, ticketBookingTripData.f5445a, ticketBookingTripData.b, str);
                MetroRepository metroRepository = this.b;
                fetchTicketBookingsFareUseCase$invoke$1.label = 1;
                objJ = metroRepository.j(ticketBookingFareRequestAppModel, fetchTicketBookingsFareUseCase$invoke$1);
                if (objJ == obj) {
                    return obj;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.b(objJ);
            }
            return new ChaloUseCaseResult.Success((List) objJ);
        } catch (Exception e) {
            boolean z = e instanceof InvalidFareResponseDataException;
            AnalyticsContractImplKt.b(this.c, "ticket fare fetch failure", Source.FARE_DETAILS_FETCH_USECASE, MapsKt.i(new Pair("type", String.valueOf(Reflection.a(e.getClass()).f())), new Pair("reason", String.valueOf(e.getMessage())), new Pair("invalidResponse", Boolean.valueOf(z))), false, 24);
            if (e instanceof ChaloLocalException) {
                return new ChaloUseCaseResult.Failure(new ProductBookingDataSourceError.Local(e.getMessage()));
            }
            if (!(e instanceof ProductBookingRemoteDataException)) {
                if (e instanceof NetworkSuccessResponseParseException) {
                    return new ChaloUseCaseResult.Failure(ProductBookingDataSourceError.ResponseParsing.b);
                }
                return z ? new ChaloUseCaseResult.Failure(ProductBookingDataSourceError.InvalidData.b) : new ChaloUseCaseResult.Failure(new ProductBookingDataSourceError.Unknown(e.getMessage()));
            }
            String message = e.getMessage();
            ProductBookingRemoteDataException productBookingRemoteDataException = (ProductBookingRemoteDataException) e;
            GenericChaloErrorResponse errorResponse = productBookingRemoteDataException.getErrorResponse();
            String strC = dd.c(errorResponse != null ? new Integer(errorResponse.f6497a) : null, message, " code: ");
            GenericChaloErrorResponse errorResponse2 = productBookingRemoteDataException.getErrorResponse();
            return new ChaloUseCaseResult.Failure(new ProductBookingDataSourceError.API(strC, errorResponse2 != null ? new Integer(errorResponse2.f6497a) : null));
        }
    }
}
