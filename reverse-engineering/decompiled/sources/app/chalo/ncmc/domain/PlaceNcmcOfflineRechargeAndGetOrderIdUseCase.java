package app.chalo.ncmc.domain;

import app.chalo.ncmc.data.NcmcOfflineRechargeResponseApiModel;
import app.chalo.ncmc.data.error.NcmcOfflineRechargeOrderCreationException;
import app.chalo.ncmc.repository.INcmcCardRepository;
import app.chalo.network.model.GenericChaloErrorResponse;
import app.chalo.providers.UserProfileDetailsProvider;
import app.chalo.utils.ChaloUseCaseResult;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/ncmc/domain/PlaceNcmcOfflineRechargeAndGetOrderIdUseCase;", "", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class PlaceNcmcOfflineRechargeAndGetOrderIdUseCase {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final INcmcCardRepository f6247a;
    public final UserProfileDetailsProvider b;

    public PlaceNcmcOfflineRechargeAndGetOrderIdUseCase(INcmcCardRepository iNcmcCardRepository, UserProfileDetailsProvider userProfileDetailsProvider) {
        this.f6247a = iNcmcCardRepository;
        this.b = userProfileDetailsProvider;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    public final Object a(int i, String str, String str2, String str3, ContinuationImpl continuationImpl) {
        PlaceNcmcOfflineRechargeAndGetOrderIdUseCase$invoke$1 placeNcmcOfflineRechargeAndGetOrderIdUseCase$invoke$1;
        NcmcOfflineRechargeFailureReason ncmcOfflineRechargeFailureReason;
        if (continuationImpl instanceof PlaceNcmcOfflineRechargeAndGetOrderIdUseCase$invoke$1) {
            placeNcmcOfflineRechargeAndGetOrderIdUseCase$invoke$1 = (PlaceNcmcOfflineRechargeAndGetOrderIdUseCase$invoke$1) continuationImpl;
            int i2 = placeNcmcOfflineRechargeAndGetOrderIdUseCase$invoke$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                placeNcmcOfflineRechargeAndGetOrderIdUseCase$invoke$1.label = i2 - Integer.MIN_VALUE;
            } else {
                placeNcmcOfflineRechargeAndGetOrderIdUseCase$invoke$1 = new PlaceNcmcOfflineRechargeAndGetOrderIdUseCase$invoke$1(this, continuationImpl);
            }
        } else {
            placeNcmcOfflineRechargeAndGetOrderIdUseCase$invoke$1 = new PlaceNcmcOfflineRechargeAndGetOrderIdUseCase$invoke$1(this, continuationImpl);
        }
        PlaceNcmcOfflineRechargeAndGetOrderIdUseCase$invoke$1 placeNcmcOfflineRechargeAndGetOrderIdUseCase$invoke$2 = placeNcmcOfflineRechargeAndGetOrderIdUseCase$invoke$1;
        Object objM = placeNcmcOfflineRechargeAndGetOrderIdUseCase$invoke$2.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i3 = placeNcmcOfflineRechargeAndGetOrderIdUseCase$invoke$2.label;
        try {
            if (i3 == 0) {
                ResultKt.b(objM);
                INcmcCardRepository iNcmcCardRepository = this.f6247a;
                String strValueOf = String.valueOf(this.b.m());
                placeNcmcOfflineRechargeAndGetOrderIdUseCase$invoke$2.label = 1;
                objM = iNcmcCardRepository.m(i, str, str2, str3, strValueOf, placeNcmcOfflineRechargeAndGetOrderIdUseCase$invoke$2);
                if (objM == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i3 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.b(objM);
            }
            NcmcOfflineRechargeResponseApiModel ncmcOfflineRechargeResponseApiModel = (NcmcOfflineRechargeResponseApiModel) objM;
            String str4 = ncmcOfflineRechargeResponseApiModel.b;
            if (str4 != null && str4.length() != 0) {
                return new ChaloUseCaseResult.Success(ncmcOfflineRechargeResponseApiModel.b);
            }
            return new ChaloUseCaseResult.Failure(new NcmcOfflineRechargeFailureDetails(null, NcmcOfflineRechargeFailureReason.INVALID_ORDER_ID));
        } catch (NcmcOfflineRechargeOrderCreationException e) {
            GenericChaloErrorResponse errorResponse = e.getErrorResponse();
            Integer num = errorResponse != null ? new Integer(errorResponse.f6497a) : null;
            if (num != null && num.intValue() == 3001) {
                ncmcOfflineRechargeFailureReason = NcmcOfflineRechargeFailureReason.CARD_NOT_FOUND;
            } else if (num != null && num.intValue() == 3000) {
                ncmcOfflineRechargeFailureReason = NcmcOfflineRechargeFailureReason.USER_NOT_FOUND;
            } else {
                ncmcOfflineRechargeFailureReason = (num != null && num.intValue() == 3102) ? NcmcOfflineRechargeFailureReason.OFFLINE_LIMIT_EXCEEDED : NcmcOfflineRechargeFailureReason.SERVER_ERROR;
            }
            GenericChaloErrorResponse errorResponse2 = e.getErrorResponse();
            return new ChaloUseCaseResult.Failure(new NcmcOfflineRechargeFailureDetails(errorResponse2 != null ? errorResponse2.b : null, ncmcOfflineRechargeFailureReason));
        } catch (Exception unused) {
            return new ChaloUseCaseResult.Failure(new NcmcOfflineRechargeFailureDetails(null, NcmcOfflineRechargeFailureReason.UNKNOWN_ERROR));
        }
    }
}
