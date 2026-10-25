package app.chalo.ncmc.domain;

import app.chalo.contract.BasicInfoContract;
import app.chalo.ncmc.data.error.ChaloCardValidationException;
import app.chalo.ncmc.repository.NcmcCardRepository;
import app.chalo.network.exception.ChaloLocalException;
import app.chalo.network.exception.NetworkSuccessResponseParseException;
import app.chalo.network.model.GenericChaloErrorResponse;
import app.chalo.utils.ChaloUseCaseResult;
import defpackage.dd;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/ncmc/domain/ValidateCardNumberUseCase;", "", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class ValidateCardNumberUseCase {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final NcmcCardRepository f6255a;
    public final BasicInfoContract b;

    public ValidateCardNumberUseCase(NcmcCardRepository ncmcCardRepository, BasicInfoContract basicInfoContract) {
        this.f6255a = ncmcCardRepository;
        this.b = basicInfoContract;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(String str, String str2, String str3, ContinuationImpl continuationImpl) {
        ValidateCardNumberUseCase$invoke$1 validateCardNumberUseCase$invoke$1;
        if (continuationImpl instanceof ValidateCardNumberUseCase$invoke$1) {
            validateCardNumberUseCase$invoke$1 = (ValidateCardNumberUseCase$invoke$1) continuationImpl;
            int i = validateCardNumberUseCase$invoke$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                validateCardNumberUseCase$invoke$1.label = i - Integer.MIN_VALUE;
            } else {
                validateCardNumberUseCase$invoke$1 = new ValidateCardNumberUseCase$invoke$1(this, continuationImpl);
            }
        } else {
            validateCardNumberUseCase$invoke$1 = new ValidateCardNumberUseCase$invoke$1(this, continuationImpl);
        }
        Object objQ = validateCardNumberUseCase$invoke$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = validateCardNumberUseCase$invoke$1.label;
        try {
            if (i2 == 0) {
                ResultKt.b(objQ);
                CardValidationRequestAppModel cardValidationRequestAppModel = new CardValidationRequestAppModel(str3, str, str2, this.b.h());
                NcmcCardRepository ncmcCardRepository = this.f6255a;
                validateCardNumberUseCase$invoke$1.label = 1;
                objQ = ncmcCardRepository.q(cardValidationRequestAppModel, validateCardNumberUseCase$invoke$1);
                if (objQ == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.b(objQ);
            }
            return new ChaloUseCaseResult.Success((CardValidationAppModel) objQ);
        } catch (Exception e) {
            if (e instanceof ChaloCardValidationException) {
                String message = e.getMessage();
                GenericChaloErrorResponse genericChaloErrorResponse = ((ChaloCardValidationException) e).getGenericChaloErrorResponse();
                return new ChaloUseCaseResult.Failure(new ChaloCardValidationFailureReason.ApiFailure(dd.c(genericChaloErrorResponse != null ? new Integer(genericChaloErrorResponse.f6497a) : null, message, " code: ")));
            }
            if (e instanceof NetworkSuccessResponseParseException) {
                return new ChaloUseCaseResult.Failure(ChaloCardValidationFailureReason.ResponseParseError.b);
            }
            return e instanceof ChaloLocalException ? new ChaloUseCaseResult.Failure(new ChaloCardValidationFailureReason.LocalError(e.getMessage())) : new ChaloUseCaseResult.Failure(new ChaloCardValidationFailureReason.ApiFailure(e.getMessage()));
        }
    }
}
