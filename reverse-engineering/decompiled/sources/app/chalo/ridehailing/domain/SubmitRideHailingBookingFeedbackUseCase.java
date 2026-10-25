package app.chalo.ridehailing.domain;

import app.chalo.network.exception.ChaloLocalException;
import app.chalo.network.exception.NetworkSuccessResponseParseException;
import app.chalo.network.model.GenericChaloErrorResponse;
import app.chalo.productbooking.common.data.error.ProductBookingDataSourceError;
import app.chalo.ridehailing.data.RideHailingRepository;
import app.chalo.ridehailing.data.error.InvalidResponseDataException;
import app.chalo.ridehailing.data.exception.RideHailingRemoteDataException;
import app.chalo.utils.ChaloUseCaseResult;
import defpackage.dd;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/ridehailing/domain/SubmitRideHailingBookingFeedbackUseCase;", "", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class SubmitRideHailingBookingFeedbackUseCase {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final RideHailingRepository f9128a;

    public SubmitRideHailingBookingFeedbackUseCase(RideHailingRepository rideHailingRepository) {
        this.f9128a = rideHailingRepository;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(List list, ContinuationImpl continuationImpl) {
        SubmitRideHailingBookingFeedbackUseCase$invoke$1 submitRideHailingBookingFeedbackUseCase$invoke$1;
        Object unknown;
        if (continuationImpl instanceof SubmitRideHailingBookingFeedbackUseCase$invoke$1) {
            submitRideHailingBookingFeedbackUseCase$invoke$1 = (SubmitRideHailingBookingFeedbackUseCase$invoke$1) continuationImpl;
            int i = submitRideHailingBookingFeedbackUseCase$invoke$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                submitRideHailingBookingFeedbackUseCase$invoke$1.label = i - Integer.MIN_VALUE;
            } else {
                submitRideHailingBookingFeedbackUseCase$invoke$1 = new SubmitRideHailingBookingFeedbackUseCase$invoke$1(this, continuationImpl);
            }
        } else {
            submitRideHailingBookingFeedbackUseCase$invoke$1 = new SubmitRideHailingBookingFeedbackUseCase$invoke$1(this, continuationImpl);
        }
        Object objE = submitRideHailingBookingFeedbackUseCase$invoke$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = submitRideHailingBookingFeedbackUseCase$invoke$1.label;
        try {
            if (i2 == 0) {
                ResultKt.b(objE);
                RideHailingRepository rideHailingRepository = this.f9128a;
                submitRideHailingBookingFeedbackUseCase$invoke$1.label = 1;
                objE = rideHailingRepository.e(list, submitRideHailingBookingFeedbackUseCase$invoke$1);
                if (objE == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.b(objE);
            }
            return new ChaloUseCaseResult.Success(objE);
        } catch (Exception e) {
            if (e instanceof ChaloLocalException) {
                unknown = new ProductBookingDataSourceError.Local(e.getMessage());
            } else if (e instanceof RideHailingRemoteDataException) {
                String message = e.getMessage();
                RideHailingRemoteDataException rideHailingRemoteDataException = (RideHailingRemoteDataException) e;
                GenericChaloErrorResponse errorResponse = rideHailingRemoteDataException.getErrorResponse();
                String strC = dd.c(errorResponse != null ? Integer.valueOf(errorResponse.f6497a) : null, message, " code: ");
                GenericChaloErrorResponse errorResponse2 = rideHailingRemoteDataException.getErrorResponse();
                unknown = new ProductBookingDataSourceError.API(strC, errorResponse2 != null ? Integer.valueOf(errorResponse2.f6497a) : null);
            } else if (e instanceof NetworkSuccessResponseParseException) {
                unknown = ProductBookingDataSourceError.ResponseParsing.b;
            } else {
                unknown = e instanceof InvalidResponseDataException ? ProductBookingDataSourceError.InvalidData.b : new ProductBookingDataSourceError.Unknown(e.getMessage());
            }
            return new ChaloUseCaseResult.Failure(unknown);
        }
    }
}
