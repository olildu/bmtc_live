package app.chalo.premiumbus.prebookedtickets.domain;

import app.chalo.data.PremiumReserveTicketOptionAction;
import app.chalo.network.exception.ChaloLocalException;
import app.chalo.network.exception.NetworkSuccessResponseParseException;
import app.chalo.premiumbus.data.exceptions.PBTicketUpdateReasonsFetchFailedException;
import app.chalo.premiumbus.data.repository.PremiumBusRepository;
import app.chalo.utils.ChaloUseCaseResult;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/premiumbus/prebookedtickets/domain/FetchPremiumBusProductsModificationReasonsListUseCase;", "", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class FetchPremiumBusProductsModificationReasonsListUseCase {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final PremiumBusRepository f7303a;

    public FetchPremiumBusProductsModificationReasonsListUseCase(PremiumBusRepository premiumBusRepository) {
        this.f7303a = premiumBusRepository;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(PremiumReserveTicketOptionAction premiumReserveTicketOptionAction, ContinuationImpl continuationImpl) {
        FetchPremiumBusProductsModificationReasonsListUseCase$invoke$1 fetchPremiumBusProductsModificationReasonsListUseCase$invoke$1;
        if (continuationImpl instanceof FetchPremiumBusProductsModificationReasonsListUseCase$invoke$1) {
            fetchPremiumBusProductsModificationReasonsListUseCase$invoke$1 = (FetchPremiumBusProductsModificationReasonsListUseCase$invoke$1) continuationImpl;
            int i = fetchPremiumBusProductsModificationReasonsListUseCase$invoke$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                fetchPremiumBusProductsModificationReasonsListUseCase$invoke$1.label = i - Integer.MIN_VALUE;
            } else {
                fetchPremiumBusProductsModificationReasonsListUseCase$invoke$1 = new FetchPremiumBusProductsModificationReasonsListUseCase$invoke$1(this, continuationImpl);
            }
        } else {
            fetchPremiumBusProductsModificationReasonsListUseCase$invoke$1 = new FetchPremiumBusProductsModificationReasonsListUseCase$invoke$1(this, continuationImpl);
        }
        Object objO = fetchPremiumBusProductsModificationReasonsListUseCase$invoke$1.result;
        Object obj = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = fetchPremiumBusProductsModificationReasonsListUseCase$invoke$1.label;
        try {
            if (i2 == 0) {
                ResultKt.b(objO);
                PremiumBusRepository premiumBusRepository = this.f7303a;
                fetchPremiumBusProductsModificationReasonsListUseCase$invoke$1.label = 1;
                objO = premiumBusRepository.o(premiumReserveTicketOptionAction, fetchPremiumBusProductsModificationReasonsListUseCase$invoke$1);
                if (objO == obj) {
                    return obj;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.b(objO);
            }
            List list = (List) objO;
            return !list.isEmpty() ? new ChaloUseCaseResult.Success(list) : new ChaloUseCaseResult.Failure(PremiumBusProductModificationReasonsFailureReason.NO_REASONS_AVAILABLE);
        } catch (ChaloLocalException unused) {
            return new ChaloUseCaseResult.Failure(PremiumBusProductModificationReasonsFailureReason.LOCAL_ERROR);
        } catch (NetworkSuccessResponseParseException unused2) {
            return new ChaloUseCaseResult.Failure(PremiumBusProductModificationReasonsFailureReason.PARSE_ERROR);
        } catch (PBTicketUpdateReasonsFetchFailedException unused3) {
            return new ChaloUseCaseResult.Failure(PremiumBusProductModificationReasonsFailureReason.SERVER_ERROR);
        } catch (Exception unused4) {
            return new ChaloUseCaseResult.Failure(PremiumBusProductModificationReasonsFailureReason.UNKNOWN_ERROR);
        }
    }
}
