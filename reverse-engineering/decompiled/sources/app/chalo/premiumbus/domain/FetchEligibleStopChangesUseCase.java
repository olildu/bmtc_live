package app.chalo.premiumbus.domain;

import app.chalo.network.exception.ChaloLocalException;
import app.chalo.network.exception.NetworkSuccessResponseParseException;
import app.chalo.premiumbus.data.exceptions.PBChangeStopFailedException;
import app.chalo.premiumbus.data.models.app.EligibleStopChangesAppModel;
import app.chalo.premiumbus.data.repository.PremiumBusRepository;
import app.chalo.utils.ChaloUseCaseResult;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/premiumbus/domain/FetchEligibleStopChangesUseCase;", "", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class FetchEligibleStopChangesUseCase {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final PremiumBusRepository f7185a;

    public FetchEligibleStopChangesUseCase(PremiumBusRepository premiumBusRepository) {
        this.f7185a = premiumBusRepository;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(String str, ContinuationImpl continuationImpl) {
        FetchEligibleStopChangesUseCase$invoke$1 fetchEligibleStopChangesUseCase$invoke$1;
        if (continuationImpl instanceof FetchEligibleStopChangesUseCase$invoke$1) {
            fetchEligibleStopChangesUseCase$invoke$1 = (FetchEligibleStopChangesUseCase$invoke$1) continuationImpl;
            int i = fetchEligibleStopChangesUseCase$invoke$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                fetchEligibleStopChangesUseCase$invoke$1.label = i - Integer.MIN_VALUE;
            } else {
                fetchEligibleStopChangesUseCase$invoke$1 = new FetchEligibleStopChangesUseCase$invoke$1(this, continuationImpl);
            }
        } else {
            fetchEligibleStopChangesUseCase$invoke$1 = new FetchEligibleStopChangesUseCase$invoke$1(this, continuationImpl);
        }
        Object objL = fetchEligibleStopChangesUseCase$invoke$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = fetchEligibleStopChangesUseCase$invoke$1.label;
        try {
            if (i2 == 0) {
                ResultKt.b(objL);
                PremiumBusRepository premiumBusRepository = this.f7185a;
                fetchEligibleStopChangesUseCase$invoke$1.label = 1;
                objL = premiumBusRepository.l(str, fetchEligibleStopChangesUseCase$invoke$1);
                if (objL == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.b(objL);
            }
            return new ChaloUseCaseResult.Success((EligibleStopChangesAppModel) objL);
        } catch (ChaloLocalException unused) {
            return new ChaloUseCaseResult.Failure(FetchEligibleStopsFailureReason.LOCAL_ERROR);
        } catch (NetworkSuccessResponseParseException unused2) {
            return new ChaloUseCaseResult.Failure(FetchEligibleStopsFailureReason.PARSE_ERROR);
        } catch (PBChangeStopFailedException unused3) {
            return new ChaloUseCaseResult.Failure(FetchEligibleStopsFailureReason.SERVER_ERROR);
        } catch (CancellationException e) {
            throw e;
        } catch (Exception unused4) {
            return new ChaloUseCaseResult.Failure(FetchEligibleStopsFailureReason.UNKNOWN_ERROR);
        }
    }
}
