package app.chalo.multimodalticket.domain;

import app.chalo.instantticket.data.exception.ProductBookingRemoteDataException;
import app.chalo.multimodalticket.data.model.app.GroupTicketSummaryRequestAppModel;
import app.chalo.multimodalticket.data.model.app.GroupTicketSummaryRequestAppModelKt;
import app.chalo.multimodalticket.data.model.app.GroupTicketSummaryResponseAppModel;
import app.chalo.multimodalticket.data.repository.MultiModalGroupTicketRepository;
import app.chalo.multimodalticket.error.MultiModalGroupTicketSummaryInvalidResponseException;
import app.chalo.network.exception.ChaloLocalException;
import app.chalo.network.exception.NetworkSuccessResponseParseException;
import app.chalo.network.model.GenericChaloErrorResponse;
import app.chalo.productbooking.common.data.error.ProductBookingDataSourceError;
import app.chalo.providers.cityprovider.CityProvider;
import app.chalo.providers.cityprovider.CityProviderKt;
import app.chalo.scenes.args.GroupTicketBookingSummaryArgs;
import app.chalo.utils.ChaloUseCaseResult;
import defpackage.dd;
import java.util.Locale;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/multimodalticket/domain/GetGroupTicketSummaryUseCase;", "", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class GetGroupTicketSummaryUseCase {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final MultiModalGroupTicketRepository f5885a;
    public final CityProvider b;

    public GetGroupTicketSummaryUseCase(MultiModalGroupTicketRepository multiModalGroupTicketRepository, CityProvider cityProvider) {
        this.f5885a = multiModalGroupTicketRepository;
        this.b = cityProvider;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(GroupTicketBookingSummaryArgs groupTicketBookingSummaryArgs, ContinuationImpl continuationImpl) throws Exception {
        GetGroupTicketSummaryUseCase$invoke$1 getGroupTicketSummaryUseCase$invoke$1;
        if (continuationImpl instanceof GetGroupTicketSummaryUseCase$invoke$1) {
            getGroupTicketSummaryUseCase$invoke$1 = (GetGroupTicketSummaryUseCase$invoke$1) continuationImpl;
            int i = getGroupTicketSummaryUseCase$invoke$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                getGroupTicketSummaryUseCase$invoke$1.label = i - Integer.MIN_VALUE;
            } else {
                getGroupTicketSummaryUseCase$invoke$1 = new GetGroupTicketSummaryUseCase$invoke$1(this, continuationImpl);
            }
        } else {
            getGroupTicketSummaryUseCase$invoke$1 = new GetGroupTicketSummaryUseCase$invoke$1(this, continuationImpl);
        }
        Object objI = getGroupTicketSummaryUseCase$invoke$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = getGroupTicketSummaryUseCase$invoke$1.label;
        try {
            if (i2 == 0) {
                ResultKt.b(objI);
                String strB = CityProviderKt.b(this.b);
                if (strB == null) {
                    return new ChaloUseCaseResult.Failure(ProductBookingDataSourceError.UnavailableCityDetails.b);
                }
                String lowerCase = strB.toLowerCase(Locale.ROOT);
                Intrinsics.h(lowerCase, "toLowerCase(...)");
                GroupTicketSummaryRequestAppModel groupTicketSummaryRequestAppModelA = GroupTicketSummaryRequestAppModelKt.a(groupTicketBookingSummaryArgs, lowerCase);
                MultiModalGroupTicketRepository multiModalGroupTicketRepository = this.f5885a;
                getGroupTicketSummaryUseCase$invoke$1.label = 1;
                objI = multiModalGroupTicketRepository.i(groupTicketSummaryRequestAppModelA, getGroupTicketSummaryUseCase$invoke$1);
                if (objI == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.b(objI);
            }
            return new ChaloUseCaseResult.Success((GroupTicketSummaryResponseAppModel) objI);
        } catch (Exception e) {
            if (e instanceof ChaloLocalException) {
                if (e instanceof ChaloLocalException.RequestCancelledException) {
                    throw new CancellationException(e.getMessage());
                }
                return new ChaloUseCaseResult.Failure(new ProductBookingDataSourceError.Local(e.getMessage()));
            }
            if (e instanceof ProductBookingRemoteDataException) {
                String message = e.getMessage();
                ProductBookingRemoteDataException productBookingRemoteDataException = (ProductBookingRemoteDataException) e;
                GenericChaloErrorResponse errorResponse = productBookingRemoteDataException.getErrorResponse();
                String strC = dd.c(errorResponse != null ? new Integer(errorResponse.f6497a) : null, message, " code: ");
                GenericChaloErrorResponse errorResponse2 = productBookingRemoteDataException.getErrorResponse();
                return new ChaloUseCaseResult.Failure(new ProductBookingDataSourceError.API(strC, errorResponse2 != null ? new Integer(errorResponse2.f6497a) : null));
            }
            if (e instanceof MultiModalGroupTicketSummaryInvalidResponseException) {
                return new ChaloUseCaseResult.Failure(ProductBookingDataSourceError.InvalidData.b);
            }
            if (e instanceof NetworkSuccessResponseParseException) {
                return new ChaloUseCaseResult.Failure(ProductBookingDataSourceError.ResponseParsing.b);
            }
            if (e instanceof CancellationException) {
                throw e;
            }
            return new ChaloUseCaseResult.Failure(new ProductBookingDataSourceError.Unknown(e.getMessage()));
        }
    }
}
