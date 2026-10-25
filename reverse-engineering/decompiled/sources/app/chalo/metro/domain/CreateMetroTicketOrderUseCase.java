package app.chalo.metro.domain;

import app.chalo.instantticket.data.exception.ProductBookingRemoteDataException;
import app.chalo.metro.data.api.MetroTicketTripDetails;
import app.chalo.metro.data.app.MetroTicketOrderRequestAppModel;
import app.chalo.metro.repository.MetroRepository;
import app.chalo.models.ordercreation.CreateOrderResponseAppModel;
import app.chalo.models.productbooking.ChaloTicketBookingMode;
import app.chalo.network.exception.ChaloLocalException;
import app.chalo.network.exception.NetworkSuccessResponseParseException;
import app.chalo.network.model.GenericChaloErrorResponse;
import app.chalo.productbooking.common.data.error.ProductBookingDataSourceError;
import app.chalo.providers.cityprovider.CityProvider;
import app.chalo.providers.cityprovider.CityProviderKt;
import app.chalo.utils.ChaloUseCaseResult;
import defpackage.dd;
import java.util.ArrayList;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/metro/domain/CreateMetroTicketOrderUseCase;", "", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class CreateMetroTicketOrderUseCase {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final MetroRepository f5437a;
    public final CityProvider b;

    public CreateMetroTicketOrderUseCase(MetroRepository metroRepository, CityProvider cityProvider) {
        this.f5437a = metroRepository;
        this.b = cityProvider;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    public final Object a(ChaloTicketBookingMode chaloTicketBookingMode, String str, long j, ArrayList arrayList, MetroTicketTripDetails metroTicketTripDetails, ContinuationImpl continuationImpl) {
        CreateMetroTicketOrderUseCase$invoke$1 createMetroTicketOrderUseCase$invoke$1;
        String lowerCase;
        if (continuationImpl instanceof CreateMetroTicketOrderUseCase$invoke$1) {
            createMetroTicketOrderUseCase$invoke$1 = (CreateMetroTicketOrderUseCase$invoke$1) continuationImpl;
            int i = createMetroTicketOrderUseCase$invoke$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                createMetroTicketOrderUseCase$invoke$1.label = i - Integer.MIN_VALUE;
            } else {
                createMetroTicketOrderUseCase$invoke$1 = new CreateMetroTicketOrderUseCase$invoke$1(this, continuationImpl);
            }
        } else {
            createMetroTicketOrderUseCase$invoke$1 = new CreateMetroTicketOrderUseCase$invoke$1(this, continuationImpl);
        }
        Object objG = createMetroTicketOrderUseCase$invoke$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = createMetroTicketOrderUseCase$invoke$1.label;
        try {
            if (i2 == 0) {
                ResultKt.b(objG);
                String strB = CityProviderKt.b(this.b);
                if (strB != null) {
                    lowerCase = strB.toLowerCase(Locale.ROOT);
                    Intrinsics.h(lowerCase, "toLowerCase(...)");
                } else {
                    lowerCase = "";
                }
                MetroTicketOrderRequestAppModel metroTicketOrderRequestAppModel = new MetroTicketOrderRequestAppModel(chaloTicketBookingMode, str, j, arrayList, metroTicketTripDetails, lowerCase);
                MetroRepository metroRepository = this.f5437a;
                createMetroTicketOrderUseCase$invoke$1.label = 1;
                objG = metroRepository.g(metroTicketOrderRequestAppModel, createMetroTicketOrderUseCase$invoke$1);
                if (objG == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.b(objG);
            }
            return new ChaloUseCaseResult.Success((CreateOrderResponseAppModel) objG);
        } catch (Exception e) {
            if (e instanceof ChaloLocalException) {
                return new ChaloUseCaseResult.Failure(new ProductBookingDataSourceError.Local(e.getMessage()));
            }
            if (!(e instanceof ProductBookingRemoteDataException)) {
                return e instanceof NetworkSuccessResponseParseException ? new ChaloUseCaseResult.Failure(ProductBookingDataSourceError.ResponseParsing.b) : new ChaloUseCaseResult.Failure(new ProductBookingDataSourceError.Unknown(e.getMessage()));
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
