package app.chalo.premiumbus.prebookedtickets.domain;

import app.chalo.network.exception.ChaloLocalException;
import app.chalo.network.exception.NetworkSuccessResponseParseException;
import app.chalo.premiumbus.data.exceptions.PBTicketUpdateOptionsFetchFailedException;
import app.chalo.premiumbus.data.repository.PremiumBusRepository;
import app.chalo.utils.ChaloUseCaseResult;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/premiumbus/prebookedtickets/domain/FetchPremiumBusTicketsUpdateOptionsUseCase;", "", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class FetchPremiumBusTicketsUpdateOptionsUseCase {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final PremiumBusRepository f7304a;

    public FetchPremiumBusTicketsUpdateOptionsUseCase(PremiumBusRepository premiumBusRepository) {
        this.f7304a = premiumBusRepository;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(String str, String str2, String str3, ContinuationImpl continuationImpl) {
        FetchPremiumBusTicketsUpdateOptionsUseCase$invoke$1 fetchPremiumBusTicketsUpdateOptionsUseCase$invoke$1;
        if (continuationImpl instanceof FetchPremiumBusTicketsUpdateOptionsUseCase$invoke$1) {
            fetchPremiumBusTicketsUpdateOptionsUseCase$invoke$1 = (FetchPremiumBusTicketsUpdateOptionsUseCase$invoke$1) continuationImpl;
            int i = fetchPremiumBusTicketsUpdateOptionsUseCase$invoke$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                fetchPremiumBusTicketsUpdateOptionsUseCase$invoke$1.label = i - Integer.MIN_VALUE;
            } else {
                fetchPremiumBusTicketsUpdateOptionsUseCase$invoke$1 = new FetchPremiumBusTicketsUpdateOptionsUseCase$invoke$1(this, continuationImpl);
            }
        } else {
            fetchPremiumBusTicketsUpdateOptionsUseCase$invoke$1 = new FetchPremiumBusTicketsUpdateOptionsUseCase$invoke$1(this, continuationImpl);
        }
        Object objY = fetchPremiumBusTicketsUpdateOptionsUseCase$invoke$1.result;
        Object obj = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = fetchPremiumBusTicketsUpdateOptionsUseCase$invoke$1.label;
        try {
            if (i2 == 0) {
                ResultKt.b(objY);
                PremiumBusRepository premiumBusRepository = this.f7304a;
                fetchPremiumBusTicketsUpdateOptionsUseCase$invoke$1.label = 1;
                objY = premiumBusRepository.y(str, str2, str3, fetchPremiumBusTicketsUpdateOptionsUseCase$invoke$1);
                if (objY == obj) {
                    return obj;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.b(objY);
            }
            List list = (List) objY;
            return !list.isEmpty() ? new ChaloUseCaseResult.Success(list) : new ChaloUseCaseResult.Failure(PremiumBusTicketUpdateOptionsFailureReason.NO_OPTIONS_AVAILABLE);
        } catch (ChaloLocalException unused) {
            return new ChaloUseCaseResult.Failure(PremiumBusTicketUpdateOptionsFailureReason.LOCAL_ERROR);
        } catch (NetworkSuccessResponseParseException unused2) {
            return new ChaloUseCaseResult.Failure(PremiumBusTicketUpdateOptionsFailureReason.PARSE_ERROR);
        } catch (PBTicketUpdateOptionsFetchFailedException unused3) {
            return new ChaloUseCaseResult.Failure(PremiumBusTicketUpdateOptionsFailureReason.SERVER_ERROR);
        } catch (Exception unused4) {
            return new ChaloUseCaseResult.Failure(PremiumBusTicketUpdateOptionsFailureReason.UNKNOWN_ERROR);
        }
    }
}
