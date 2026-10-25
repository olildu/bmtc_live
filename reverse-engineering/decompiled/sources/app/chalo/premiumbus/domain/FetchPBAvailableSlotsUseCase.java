package app.chalo.premiumbus.domain;

import app.chalo.network.exception.ChaloLocalException;
import app.chalo.network.exception.NetworkSuccessResponseParseException;
import app.chalo.premiumbus.data.exceptions.PBAvailableSlotsFetchFailedException;
import app.chalo.premiumbus.data.models.app.PBAvailableSlotsAppRequestModel;
import app.chalo.premiumbus.data.repository.PremiumBusRepository;
import app.chalo.utils.ChaloUseCaseResult;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/premiumbus/domain/FetchPBAvailableSlotsUseCase;", "", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class FetchPBAvailableSlotsUseCase {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final PremiumBusRepository f7186a;

    public FetchPBAvailableSlotsUseCase(PremiumBusRepository premiumBusRepository) {
        this.f7186a = premiumBusRepository;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(PBAvailableSlotsAppRequestModel pBAvailableSlotsAppRequestModel, ContinuationImpl continuationImpl) {
        FetchPBAvailableSlotsUseCase$invoke$1 fetchPBAvailableSlotsUseCase$invoke$1;
        if (continuationImpl instanceof FetchPBAvailableSlotsUseCase$invoke$1) {
            fetchPBAvailableSlotsUseCase$invoke$1 = (FetchPBAvailableSlotsUseCase$invoke$1) continuationImpl;
            int i = fetchPBAvailableSlotsUseCase$invoke$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                fetchPBAvailableSlotsUseCase$invoke$1.label = i - Integer.MIN_VALUE;
            } else {
                fetchPBAvailableSlotsUseCase$invoke$1 = new FetchPBAvailableSlotsUseCase$invoke$1(this, continuationImpl);
            }
        } else {
            fetchPBAvailableSlotsUseCase$invoke$1 = new FetchPBAvailableSlotsUseCase$invoke$1(this, continuationImpl);
        }
        Object objP = fetchPBAvailableSlotsUseCase$invoke$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = fetchPBAvailableSlotsUseCase$invoke$1.label;
        try {
            if (i2 == 0) {
                ResultKt.b(objP);
                PremiumBusRepository premiumBusRepository = this.f7186a;
                fetchPBAvailableSlotsUseCase$invoke$1.label = 1;
                objP = premiumBusRepository.p(pBAvailableSlotsAppRequestModel, fetchPBAvailableSlotsUseCase$invoke$1);
                if (objP == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.b(objP);
            }
            return new ChaloUseCaseResult.Success(objP);
        } catch (ChaloLocalException unused) {
            return new ChaloUseCaseResult.Failure(PBAvailableSlotsFetchFailedReasons.LOCAL_ERROR);
        } catch (NetworkSuccessResponseParseException unused2) {
            return new ChaloUseCaseResult.Failure(PBAvailableSlotsFetchFailedReasons.PARSE_ERROR);
        } catch (PBAvailableSlotsFetchFailedException unused3) {
            return new ChaloUseCaseResult.Failure(PBAvailableSlotsFetchFailedReasons.SERVER_ERROR);
        } catch (Exception unused4) {
            return new ChaloUseCaseResult.Failure(PBAvailableSlotsFetchFailedReasons.UNKNOWN_ERROR);
        }
    }
}
