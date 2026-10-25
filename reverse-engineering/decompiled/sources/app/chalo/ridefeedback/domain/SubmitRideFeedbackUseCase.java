package app.chalo.ridefeedback.domain;

import app.chalo.network.exception.NetworkSuccessResponseParseException;
import app.chalo.network.model.GenericChaloErrorResponse;
import app.chalo.productbooking.common.data.error.ProductBookingDataSourceError;
import app.chalo.ridefeedback.data.RideFeedbackRepository;
import app.chalo.ridefeedback.data.exception.RideFeedbackRemoteDataException;
import app.chalo.utils.ChaloUseCaseResult;
import defpackage.dd;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/ridefeedback/domain/SubmitRideFeedbackUseCase;", "", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class SubmitRideFeedbackUseCase {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final RideFeedbackRepository f9090a;

    public SubmitRideFeedbackUseCase(RideFeedbackRepository rideFeedbackRepository) {
        this.f9090a = rideFeedbackRepository;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(List list, ContinuationImpl continuationImpl) {
        SubmitRideFeedbackUseCase$invoke$1 submitRideFeedbackUseCase$invoke$1;
        Object unknown;
        if (continuationImpl instanceof SubmitRideFeedbackUseCase$invoke$1) {
            submitRideFeedbackUseCase$invoke$1 = (SubmitRideFeedbackUseCase$invoke$1) continuationImpl;
            int i = submitRideFeedbackUseCase$invoke$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                submitRideFeedbackUseCase$invoke$1.label = i - Integer.MIN_VALUE;
            } else {
                submitRideFeedbackUseCase$invoke$1 = new SubmitRideFeedbackUseCase$invoke$1(this, continuationImpl);
            }
        } else {
            submitRideFeedbackUseCase$invoke$1 = new SubmitRideFeedbackUseCase$invoke$1(this, continuationImpl);
        }
        Object objM = submitRideFeedbackUseCase$invoke$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = submitRideFeedbackUseCase$invoke$1.label;
        try {
            if (i2 == 0) {
                ResultKt.b(objM);
                RideFeedbackRepository rideFeedbackRepository = this.f9090a;
                submitRideFeedbackUseCase$invoke$1.label = 1;
                objM = rideFeedbackRepository.m(list, submitRideFeedbackUseCase$invoke$1);
                if (objM == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.b(objM);
            }
            return new ChaloUseCaseResult.Success(objM);
        } catch (CancellationException e) {
            throw e;
        } catch (Exception e2) {
            if (e2 instanceof RideFeedbackRemoteDataException) {
                String message = e2.getMessage();
                RideFeedbackRemoteDataException rideFeedbackRemoteDataException = (RideFeedbackRemoteDataException) e2;
                GenericChaloErrorResponse errorResponse = rideFeedbackRemoteDataException.getErrorResponse();
                String strC = dd.c(errorResponse != null ? Integer.valueOf(errorResponse.f6497a) : null, message, " code: ");
                GenericChaloErrorResponse errorResponse2 = rideFeedbackRemoteDataException.getErrorResponse();
                unknown = new ProductBookingDataSourceError.API(strC, errorResponse2 != null ? Integer.valueOf(errorResponse2.f6497a) : null);
            } else {
                unknown = e2 instanceof NetworkSuccessResponseParseException ? ProductBookingDataSourceError.ResponseParsing.b : new ProductBookingDataSourceError.Unknown(e2.getMessage());
            }
            return new ChaloUseCaseResult.Failure(unknown);
        }
    }
}
