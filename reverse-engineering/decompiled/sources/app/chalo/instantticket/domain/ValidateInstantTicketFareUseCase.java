package app.chalo.instantticket.domain;

import app.chalo.instantticket.data.InstantTicketRepository;
import app.chalo.instantticket.data.exception.ProductBookingRemoteDataException;
import app.chalo.instantticket.data.model.api.response.ValidateInstantTicketFareResponseAppModel;
import app.chalo.instantticket.data.model.app.request.ValidateInstantTicketFareRequestAppModel;
import app.chalo.network.exception.ChaloLocalException;
import app.chalo.network.exception.NetworkSuccessResponseParseException;
import app.chalo.network.model.GenericChaloErrorResponse;
import app.chalo.productbooking.common.data.error.ProductBookingDataSourceError;
import app.chalo.productbooking.common.data.models.app.FareDetailsData;
import app.chalo.providers.cityprovider.CityProvider;
import app.chalo.providers.cityprovider.CityProviderKt;
import app.chalo.utils.ChaloUseCaseResult;
import defpackage.dd;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/instantticket/domain/ValidateInstantTicketFareUseCase;", "", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class ValidateInstantTicketFareUseCase {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final InstantTicketRepository f3905a;
    public final CityProvider b;

    public ValidateInstantTicketFareUseCase(InstantTicketRepository instantTicketRepository, CityProvider cityProvider) {
        this.f3905a = instantTicketRepository;
        this.b = cityProvider;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    public final Object a(long j, ArrayList arrayList, FareDetailsData fareDetailsData, ContinuationImpl continuationImpl) {
        ValidateInstantTicketFareUseCase$invoke$1 validateInstantTicketFareUseCase$invoke$1;
        if (continuationImpl instanceof ValidateInstantTicketFareUseCase$invoke$1) {
            validateInstantTicketFareUseCase$invoke$1 = (ValidateInstantTicketFareUseCase$invoke$1) continuationImpl;
            int i = validateInstantTicketFareUseCase$invoke$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                validateInstantTicketFareUseCase$invoke$1.label = i - Integer.MIN_VALUE;
            } else {
                validateInstantTicketFareUseCase$invoke$1 = new ValidateInstantTicketFareUseCase$invoke$1(this, continuationImpl);
            }
        } else {
            validateInstantTicketFareUseCase$invoke$1 = new ValidateInstantTicketFareUseCase$invoke$1(this, continuationImpl);
        }
        Object objG = validateInstantTicketFareUseCase$invoke$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = validateInstantTicketFareUseCase$invoke$1.label;
        try {
            if (i2 == 0) {
                ResultKt.b(objG);
                String strB = CityProviderKt.b(this.b);
                if (strB == null) {
                    return new ChaloUseCaseResult.Failure(ProductBookingDataSourceError.UnavailableCityDetails.b);
                }
                ValidateInstantTicketFareRequestAppModel validateInstantTicketFareRequestAppModel = new ValidateInstantTicketFareRequestAppModel(j, strB, fareDetailsData.f8185a.b, fareDetailsData.b.f8199a, fareDetailsData.c.f8199a, arrayList);
                InstantTicketRepository instantTicketRepository = this.f3905a;
                validateInstantTicketFareUseCase$invoke$1.label = 1;
                objG = instantTicketRepository.g(validateInstantTicketFareRequestAppModel, validateInstantTicketFareUseCase$invoke$1);
                if (objG == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.b(objG);
            }
            return new ChaloUseCaseResult.Success((ValidateInstantTicketFareResponseAppModel) objG);
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
