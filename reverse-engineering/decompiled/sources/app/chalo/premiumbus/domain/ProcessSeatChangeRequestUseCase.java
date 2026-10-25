package app.chalo.premiumbus.domain;

import app.chalo.network.exception.ChaloLocalException;
import app.chalo.network.exception.NetworkSuccessResponseParseException;
import app.chalo.premiumbus.data.exceptions.PremiumBusSeatChangeFailureException;
import app.chalo.premiumbus.data.models.app.PremiumBusChangeSeatsAppResponseModel;
import app.chalo.premiumbus.data.models.app.PremiumBusChangeSeatsRequestAppModel;
import app.chalo.premiumbus.data.repository.PremiumBusRepository;
import app.chalo.utils.ChaloUseCaseResult;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.text.StringsKt;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/premiumbus/domain/ProcessSeatChangeRequestUseCase;", "", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class ProcessSeatChangeRequestUseCase {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final PremiumBusRepository f7233a;

    public ProcessSeatChangeRequestUseCase(PremiumBusRepository premiumBusRepository) {
        this.f7233a = premiumBusRepository;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(String str, List list, ContinuationImpl continuationImpl) {
        ProcessSeatChangeRequestUseCase$invoke$1 processSeatChangeRequestUseCase$invoke$1;
        if (continuationImpl instanceof ProcessSeatChangeRequestUseCase$invoke$1) {
            processSeatChangeRequestUseCase$invoke$1 = (ProcessSeatChangeRequestUseCase$invoke$1) continuationImpl;
            int i = processSeatChangeRequestUseCase$invoke$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                processSeatChangeRequestUseCase$invoke$1.label = i - Integer.MIN_VALUE;
            } else {
                processSeatChangeRequestUseCase$invoke$1 = new ProcessSeatChangeRequestUseCase$invoke$1(this, continuationImpl);
            }
        } else {
            processSeatChangeRequestUseCase$invoke$1 = new ProcessSeatChangeRequestUseCase$invoke$1(this, continuationImpl);
        }
        Object objU = processSeatChangeRequestUseCase$invoke$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = processSeatChangeRequestUseCase$invoke$1.label;
        try {
            if (i2 == 0) {
                ResultKt.b(objU);
                PremiumBusChangeSeatsRequestAppModel premiumBusChangeSeatsRequestAppModel = new PremiumBusChangeSeatsRequestAppModel(str, list);
                PremiumBusRepository premiumBusRepository = this.f7233a;
                processSeatChangeRequestUseCase$invoke$1.label = 1;
                objU = premiumBusRepository.u(premiumBusChangeSeatsRequestAppModel, processSeatChangeRequestUseCase$invoke$1);
                if (objU == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.b(objU);
            }
            return StringsKt.x(((PremiumBusChangeSeatsAppResponseModel) objU).f7100a, "SUCCESS", true) ? new ChaloUseCaseResult.Success(Boolean.TRUE) : new ChaloUseCaseResult.Failure(ProcessSeatChangeException.SEAT_ASSIGNMENT_FAILED);
        } catch (ChaloLocalException unused) {
            return new ChaloUseCaseResult.Failure(ProcessSeatChangeException.LOCAL_ERROR);
        } catch (NetworkSuccessResponseParseException unused2) {
            return new ChaloUseCaseResult.Failure(ProcessSeatChangeException.PARSE_ERROR);
        } catch (PremiumBusSeatChangeFailureException unused3) {
            return new ChaloUseCaseResult.Failure(ProcessSeatChangeException.SERVER_ERROR);
        } catch (Exception unused4) {
            return new ChaloUseCaseResult.Failure(ProcessSeatChangeException.UNKNOWN_ERROR);
        }
    }
}
