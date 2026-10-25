package app.chalo.ondc.domain;

import app.chalo.models.ondc.OndcTicketReceiptAppModel;
import app.chalo.network.exception.ChaloLocalException;
import app.chalo.network.exception.NetworkSuccessResponseParseException;
import app.chalo.ondc.error.OndcBookingReceiptInvalidResponseException;
import app.chalo.ondc.model.app.OndcTicketValidationReceiptDataKt;
import app.chalo.ondc.repository.OndcRepository;
import app.chalo.ondc.repository.OndcRepositoryImpl$getOndcTicketReceiptFlow$$inlined$map$1;
import app.chalo.utils.ChaloUseCaseResult;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.FlowKt;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/ondc/domain/FetchAndStoreOndcReceiptUseCase;", "", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class FetchAndStoreOndcReceiptUseCase {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final OndcRepository f6709a;

    public FetchAndStoreOndcReceiptUseCase(OndcRepository ondcRepository) {
        this.f6709a = ondcRepository;
    }

    /* JADX WARN: Code duplicated, block: B:42:0x008c A[Catch: Exception -> 0x0033, NetworkSuccessResponseParseException -> 0x0036, ChaloLocalException -> 0x0039, OndcBookingReceiptInvalidResponseException -> 0x003c, TryCatch #2 {ChaloLocalException -> 0x0039, NetworkSuccessResponseParseException -> 0x0036, OndcBookingReceiptInvalidResponseException -> 0x003c, Exception -> 0x0033, blocks: (B:14:0x002f, B:46:0x0098, B:27:0x004b, B:40:0x0082, B:42:0x008c, B:48:0x00a2, B:37:0x0077), top: B:58:0x0023 }] */
    /* JADX WARN: Code duplicated, block: B:45:0x0097  */
    /* JADX WARN: Code duplicated, block: B:48:0x00a2 A[Catch: Exception -> 0x0033, NetworkSuccessResponseParseException -> 0x0036, ChaloLocalException -> 0x0039, OndcBookingReceiptInvalidResponseException -> 0x003c, TRY_LEAVE, TryCatch #2 {ChaloLocalException -> 0x0039, NetworkSuccessResponseParseException -> 0x0036, OndcBookingReceiptInvalidResponseException -> 0x003c, Exception -> 0x0033, blocks: (B:14:0x002f, B:46:0x0098, B:27:0x004b, B:40:0x0082, B:42:0x008c, B:48:0x00a2, B:37:0x0077), top: B:58:0x0023 }] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(String str, ContinuationImpl continuationImpl) {
        FetchAndStoreOndcReceiptUseCase$invoke$1 fetchAndStoreOndcReceiptUseCase$invoke$1;
        OndcTicketReceiptAppModel ondcTicketReceiptAppModel;
        OndcTicketReceiptAppModel ondcTicketReceiptAppModel2;
        if (continuationImpl instanceof FetchAndStoreOndcReceiptUseCase$invoke$1) {
            fetchAndStoreOndcReceiptUseCase$invoke$1 = (FetchAndStoreOndcReceiptUseCase$invoke$1) continuationImpl;
            int i = fetchAndStoreOndcReceiptUseCase$invoke$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                fetchAndStoreOndcReceiptUseCase$invoke$1.label = i - Integer.MIN_VALUE;
            } else {
                fetchAndStoreOndcReceiptUseCase$invoke$1 = new FetchAndStoreOndcReceiptUseCase$invoke$1(this, continuationImpl);
            }
        } else {
            fetchAndStoreOndcReceiptUseCase$invoke$1 = new FetchAndStoreOndcReceiptUseCase$invoke$1(this, continuationImpl);
        }
        Object objV = fetchAndStoreOndcReceiptUseCase$invoke$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = fetchAndStoreOndcReceiptUseCase$invoke$1.label;
        OndcRepository ondcRepository = this.f6709a;
        try {
            if (i2 == 0) {
                ResultKt.b(objV);
                OndcRepositoryImpl$getOndcTicketReceiptFlow$$inlined$map$1 ondcRepositoryImpl$getOndcTicketReceiptFlow$$inlined$map$1A = ondcRepository.a(str);
                fetchAndStoreOndcReceiptUseCase$invoke$1.L$0 = str;
                fetchAndStoreOndcReceiptUseCase$invoke$1.label = 1;
                objV = FlowKt.v(ondcRepositoryImpl$getOndcTicketReceiptFlow$$inlined$map$1A, fetchAndStoreOndcReceiptUseCase$invoke$1);
                if (objV != coroutineSingletons) {
                }
                return coroutineSingletons;
            }
            if (i2 == 1) {
                str = (String) fetchAndStoreOndcReceiptUseCase$invoke$1.L$0;
                ResultKt.b(objV);
            } else {
                if (i2 == 2) {
                    str = (String) fetchAndStoreOndcReceiptUseCase$invoke$1.L$0;
                    ResultKt.b(objV);
                    ondcTicketReceiptAppModel = (OndcTicketReceiptAppModel) objV;
                    if (Intrinsics.d(ondcTicketReceiptAppModel.f5630a, str)) {
                        return new ChaloUseCaseResult.Failure(new OndcTicketReceiptFetchFailed());
                    }
                    fetchAndStoreOndcReceiptUseCase$invoke$1.L$0 = ondcTicketReceiptAppModel;
                    fetchAndStoreOndcReceiptUseCase$invoke$1.label = 3;
                    if (ondcRepository.s(ondcTicketReceiptAppModel, fetchAndStoreOndcReceiptUseCase$invoke$1) != coroutineSingletons) {
                        ondcTicketReceiptAppModel2 = ondcTicketReceiptAppModel;
                    }
                    return coroutineSingletons;
                }
                if (i2 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ondcTicketReceiptAppModel2 = (OndcTicketReceiptAppModel) fetchAndStoreOndcReceiptUseCase$invoke$1.L$0;
                ResultKt.b(objV);
            }
            return new ChaloUseCaseResult.Success(OndcTicketValidationReceiptDataKt.a(ondcTicketReceiptAppModel2));
            OndcTicketReceiptAppModel ondcTicketReceiptAppModel3 = (OndcTicketReceiptAppModel) objV;
            if (ondcTicketReceiptAppModel3 != null) {
                return new ChaloUseCaseResult.Success(OndcTicketValidationReceiptDataKt.a(ondcTicketReceiptAppModel3));
            }
            fetchAndStoreOndcReceiptUseCase$invoke$1.L$0 = str;
            fetchAndStoreOndcReceiptUseCase$invoke$1.label = 2;
            objV = ondcRepository.b(str, fetchAndStoreOndcReceiptUseCase$invoke$1);
            if (objV != coroutineSingletons) {
                ondcTicketReceiptAppModel = (OndcTicketReceiptAppModel) objV;
                if (Intrinsics.d(ondcTicketReceiptAppModel.f5630a, str)) {
                    return new ChaloUseCaseResult.Failure(new OndcTicketReceiptFetchFailed());
                }
                fetchAndStoreOndcReceiptUseCase$invoke$1.L$0 = ondcTicketReceiptAppModel;
                fetchAndStoreOndcReceiptUseCase$invoke$1.label = 3;
                if (ondcRepository.s(ondcTicketReceiptAppModel, fetchAndStoreOndcReceiptUseCase$invoke$1) != coroutineSingletons) {
                    ondcTicketReceiptAppModel2 = ondcTicketReceiptAppModel;
                    return new ChaloUseCaseResult.Success(OndcTicketValidationReceiptDataKt.a(ondcTicketReceiptAppModel2));
                }
            }
            return coroutineSingletons;
        } catch (ChaloLocalException e) {
            e.getMessage();
            return new ChaloUseCaseResult.Failure(new OndcTicketReceiptFetchFailed());
        } catch (NetworkSuccessResponseParseException e2) {
            e2.getMessage();
            return new ChaloUseCaseResult.Failure(new OndcTicketReceiptFetchFailed());
        } catch (OndcBookingReceiptInvalidResponseException e3) {
            e3.getMessage();
            return new ChaloUseCaseResult.Failure(new OndcTicketReceiptFetchFailed());
        } catch (Exception e4) {
            e4.getMessage();
            return new ChaloUseCaseResult.Failure(new OndcTicketReceiptFetchFailed());
        }
    }
}
