package app.chalo.ncmc.domain;

import app.chalo.ncmc.data.NcmcCardAppModel;
import app.chalo.ncmc.data.NcmcCardStatus;
import app.chalo.ncmc.data.error.NcmcCardRechargeNotFoundException;
import app.chalo.ncmc.repository.INcmcCardRepository;
import app.chalo.network.model.GenericChaloErrorResponse;
import app.chalo.providers.UserProfileDetailsProvider;
import app.chalo.utils.ChaloUseCaseResult;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/ncmc/domain/GetNcmcCardUseCase;", "", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class GetNcmcCardUseCase {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final INcmcCardRepository f6242a;
    public final UserProfileDetailsProvider b;

    public GetNcmcCardUseCase(INcmcCardRepository iNcmcCardRepository, UserProfileDetailsProvider userProfileDetailsProvider) {
        this.f6242a = iNcmcCardRepository;
        this.b = userProfileDetailsProvider;
    }

    public static NcmcCardAppModel a(String str, List list) {
        Object next;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            next = it.next();
            NcmcCardAppModel ncmcCardAppModel = (NcmcCardAppModel) next;
            if (str != null) {
                if (ncmcCardAppModel.d == NcmcCardStatus.ACTIVE && Intrinsics.d(ncmcCardAppModel.e, str)) {
                    return (NcmcCardAppModel) next;
                }
            } else if (ncmcCardAppModel.d == NcmcCardStatus.ACTIVE) {
                return (NcmcCardAppModel) next;
            }
        }
        next = null;
        return (NcmcCardAppModel) next;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object b(String str, ContinuationImpl continuationImpl) {
        GetNcmcCardUseCase$invoke$1 getNcmcCardUseCase$invoke$1;
        if (continuationImpl instanceof GetNcmcCardUseCase$invoke$1) {
            getNcmcCardUseCase$invoke$1 = (GetNcmcCardUseCase$invoke$1) continuationImpl;
            int i = getNcmcCardUseCase$invoke$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                getNcmcCardUseCase$invoke$1.label = i - Integer.MIN_VALUE;
            } else {
                getNcmcCardUseCase$invoke$1 = new GetNcmcCardUseCase$invoke$1(this, continuationImpl);
            }
        } else {
            getNcmcCardUseCase$invoke$1 = new GetNcmcCardUseCase$invoke$1(this, continuationImpl);
        }
        Object objE = getNcmcCardUseCase$invoke$1.result;
        Object obj = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = getNcmcCardUseCase$invoke$1.label;
        try {
            if (i2 == 0) {
                ResultKt.b(objE);
                INcmcCardRepository iNcmcCardRepository = this.f6242a;
                String strM = this.b.m();
                if (strM == null) {
                    strM = "";
                }
                getNcmcCardUseCase$invoke$1.L$0 = str;
                getNcmcCardUseCase$invoke$1.label = 1;
                objE = iNcmcCardRepository.e(strM, getNcmcCardUseCase$invoke$1);
                if (objE == obj) {
                    return obj;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                str = (String) getNcmcCardUseCase$invoke$1.L$0;
                ResultKt.b(objE);
            }
            NcmcCardAppModel ncmcCardAppModelA = a(str, (List) objE);
            return ncmcCardAppModelA != null ? new ChaloUseCaseResult.Success(ncmcCardAppModelA) : new ChaloUseCaseResult.Failure(GetNcmcCardFailureReason.NO_CARD_EXIST);
        } catch (NcmcCardRechargeNotFoundException e) {
            GenericChaloErrorResponse errorResponse = e.getErrorResponse();
            Integer num = errorResponse != null ? new Integer(errorResponse.f6497a) : null;
            if (num != null && num.intValue() == 3000) {
                return new ChaloUseCaseResult.Failure(GetNcmcCardFailureReason.NO_USER_FOUND);
            }
            return (num != null && num.intValue() == 3001) ? new ChaloUseCaseResult.Failure(GetNcmcCardFailureReason.NO_CARD_EXIST) : new ChaloUseCaseResult.Failure(GetNcmcCardFailureReason.NO_CARD_EXIST);
        } catch (Exception unused) {
            return new ChaloUseCaseResult.Failure(GetNcmcCardFailureReason.UNKNOWN_ERROR);
        }
    }
}
