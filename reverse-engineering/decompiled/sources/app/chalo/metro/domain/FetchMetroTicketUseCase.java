package app.chalo.metro.domain;

import app.chalo.metro.data.api.MetroTicketApiModel;
import app.chalo.metro.repository.MetroRepository;
import app.chalo.network.exception.ChaloLocalException;
import app.chalo.network.exception.NetworkSuccessResponseParseException;
import app.chalo.network.model.GenericChaloErrorResponse;
import app.chalo.productbooking.common.data.exception.MobileTicketProductFetchFailedException;
import app.chalo.productbooking.common.domain.MobileTicketByIdFetchFailedReason;
import app.chalo.utils.ChaloUseCaseResult;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lapp/chalo/metro/domain/FetchMetroTicketUseCase;", "", "Companion", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class FetchMetroTicketUseCase {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final MetroRepository f5441a;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lapp/chalo/metro/domain/FetchMetroTicketUseCase$Companion;", "", "", "PRODUCT_NOT_FOUND_ERROR_CODE", "I", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
    }

    public FetchMetroTicketUseCase(MetroRepository metroRepository) {
        this.f5441a = metroRepository;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(String str, String str2, String str3, ContinuationImpl continuationImpl) {
        FetchMetroTicketUseCase$invoke$1 fetchMetroTicketUseCase$invoke$1;
        if (continuationImpl instanceof FetchMetroTicketUseCase$invoke$1) {
            fetchMetroTicketUseCase$invoke$1 = (FetchMetroTicketUseCase$invoke$1) continuationImpl;
            int i = fetchMetroTicketUseCase$invoke$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                fetchMetroTicketUseCase$invoke$1.label = i - Integer.MIN_VALUE;
            } else {
                fetchMetroTicketUseCase$invoke$1 = new FetchMetroTicketUseCase$invoke$1(this, continuationImpl);
            }
        } else {
            fetchMetroTicketUseCase$invoke$1 = new FetchMetroTicketUseCase$invoke$1(this, continuationImpl);
        }
        Object objI = fetchMetroTicketUseCase$invoke$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = fetchMetroTicketUseCase$invoke$1.label;
        try {
            if (i2 == 0) {
                ResultKt.b(objI);
                MetroRepository metroRepository = this.f5441a;
                fetchMetroTicketUseCase$invoke$1.L$0 = str;
                fetchMetroTicketUseCase$invoke$1.label = 1;
                objI = metroRepository.i(str, str2, str3, fetchMetroTicketUseCase$invoke$1);
                if (objI == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                str = (String) fetchMetroTicketUseCase$invoke$1.L$0;
                ResultKt.b(objI);
            }
            MetroTicketApiModel metroTicketApiModel = (MetroTicketApiModel) objI;
            return Intrinsics.d(metroTicketApiModel.f5414a, str) ? new ChaloUseCaseResult.Success(metroTicketApiModel) : new ChaloUseCaseResult.Failure(MobileTicketByIdFetchFailedReason.NO_PRODUCT_RECEIVED);
        } catch (ChaloLocalException unused) {
            return new ChaloUseCaseResult.Failure(MobileTicketByIdFetchFailedReason.LOCAL_ERROR);
        } catch (NetworkSuccessResponseParseException unused2) {
            return new ChaloUseCaseResult.Failure(MobileTicketByIdFetchFailedReason.PARSE_ERROR);
        } catch (MobileTicketProductFetchFailedException e) {
            GenericChaloErrorResponse genericChaloErrorResponse = e.getGenericChaloErrorResponse();
            return (genericChaloErrorResponse == null || genericChaloErrorResponse.f6497a != 5002) ? new ChaloUseCaseResult.Failure(MobileTicketByIdFetchFailedReason.SERVER_ERROR) : new ChaloUseCaseResult.Failure(MobileTicketByIdFetchFailedReason.NO_PRODUCT_RECEIVED);
        } catch (Exception unused3) {
            return new ChaloUseCaseResult.Failure(MobileTicketByIdFetchFailedReason.UNKNOWN_ERROR);
        }
    }
}
