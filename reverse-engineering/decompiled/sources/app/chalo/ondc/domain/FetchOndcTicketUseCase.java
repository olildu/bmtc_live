package app.chalo.ondc.domain;

import app.chalo.network.exception.ChaloLocalException;
import app.chalo.network.exception.NetworkSuccessResponseParseException;
import app.chalo.ondc.model.api.response.OndcMobileTicketProductDataApiResponseModel;
import app.chalo.ondc.repository.OndcRepository;
import app.chalo.productbooking.common.data.exception.MobileTicketProductFetchFailedException;
import app.chalo.productbooking.common.data.models.api.response.GenericMobileTicketProductApiResponseModel;
import app.chalo.productbooking.common.domain.MobileTicketByIdFetchFailedReason;
import app.chalo.utils.ChaloUseCaseResult;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/ondc/domain/FetchOndcTicketUseCase;", "", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class FetchOndcTicketUseCase {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final OndcRepository f6716a;

    public FetchOndcTicketUseCase(OndcRepository ondcRepository) {
        this.f6716a = ondcRepository;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(String str, String str2, String str3, ContinuationImpl continuationImpl) {
        FetchOndcTicketUseCase$invoke$1 fetchOndcTicketUseCase$invoke$1;
        if (continuationImpl instanceof FetchOndcTicketUseCase$invoke$1) {
            fetchOndcTicketUseCase$invoke$1 = (FetchOndcTicketUseCase$invoke$1) continuationImpl;
            int i = fetchOndcTicketUseCase$invoke$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                fetchOndcTicketUseCase$invoke$1.label = i - Integer.MIN_VALUE;
            } else {
                fetchOndcTicketUseCase$invoke$1 = new FetchOndcTicketUseCase$invoke$1(this, continuationImpl);
            }
        } else {
            fetchOndcTicketUseCase$invoke$1 = new FetchOndcTicketUseCase$invoke$1(this, continuationImpl);
        }
        Object objG = fetchOndcTicketUseCase$invoke$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = fetchOndcTicketUseCase$invoke$1.label;
        try {
            if (i2 == 0) {
                ResultKt.b(objG);
                OndcRepository ondcRepository = this.f6716a;
                fetchOndcTicketUseCase$invoke$1.L$0 = str;
                fetchOndcTicketUseCase$invoke$1.label = 1;
                objG = ondcRepository.g(str, str2, str3, fetchOndcTicketUseCase$invoke$1);
                if (objG == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                str = (String) fetchOndcTicketUseCase$invoke$1.L$0;
                ResultKt.b(objG);
            }
            GenericMobileTicketProductApiResponseModel genericMobileTicketProductApiResponseModel = ((OndcMobileTicketProductDataApiResponseModel) objG).f6758a;
            if (genericMobileTicketProductApiResponseModel != null) {
                return Intrinsics.d(genericMobileTicketProductApiResponseModel.f8124a, str) ? new ChaloUseCaseResult.Success(genericMobileTicketProductApiResponseModel) : new ChaloUseCaseResult.Failure(MobileTicketByIdFetchFailedReason.NO_PRODUCT_RECEIVED);
            }
            return new ChaloUseCaseResult.Failure(MobileTicketByIdFetchFailedReason.NO_PRODUCT_RECEIVED);
        } catch (ChaloLocalException unused) {
            return new ChaloUseCaseResult.Failure(MobileTicketByIdFetchFailedReason.LOCAL_ERROR);
        } catch (NetworkSuccessResponseParseException unused2) {
            return new ChaloUseCaseResult.Failure(MobileTicketByIdFetchFailedReason.PARSE_ERROR);
        } catch (MobileTicketProductFetchFailedException unused3) {
            return new ChaloUseCaseResult.Failure(MobileTicketByIdFetchFailedReason.SERVER_ERROR);
        } catch (Exception unused4) {
            return new ChaloUseCaseResult.Failure(MobileTicketByIdFetchFailedReason.UNKNOWN_ERROR);
        }
    }
}
