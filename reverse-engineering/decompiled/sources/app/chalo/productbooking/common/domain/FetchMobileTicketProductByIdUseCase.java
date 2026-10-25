package app.chalo.productbooking.common.domain;

import app.chalo.network.exception.ChaloLocalException;
import app.chalo.network.exception.NetworkSuccessResponseParseException;
import app.chalo.premiumbus.data.repository.PremiumBusRepository;
import app.chalo.productbooking.common.data.exception.MobileTicketProductFetchFailedException;
import app.chalo.productbooking.common.data.models.api.response.GenericMobileTicketProductApiResponseModel;
import app.chalo.productbooking.common.data.models.api.response.GenericMobileTicketProductDataApiResponseModel;
import app.chalo.utils.ChaloUseCaseResult;
import java.util.Iterator;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.collections.EmptyList;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/productbooking/common/domain/FetchMobileTicketProductByIdUseCase;", "", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class FetchMobileTicketProductByIdUseCase {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final PremiumBusRepository f8262a;

    public FetchMobileTicketProductByIdUseCase(PremiumBusRepository premiumBusRepository) {
        this.f8262a = premiumBusRepository;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(String str, String str2, String str3, ContinuationImpl continuationImpl) {
        FetchMobileTicketProductByIdUseCase$invoke$1 fetchMobileTicketProductByIdUseCase$invoke$1;
        Object next;
        if (continuationImpl instanceof FetchMobileTicketProductByIdUseCase$invoke$1) {
            fetchMobileTicketProductByIdUseCase$invoke$1 = (FetchMobileTicketProductByIdUseCase$invoke$1) continuationImpl;
            int i = fetchMobileTicketProductByIdUseCase$invoke$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                fetchMobileTicketProductByIdUseCase$invoke$1.label = i - Integer.MIN_VALUE;
            } else {
                fetchMobileTicketProductByIdUseCase$invoke$1 = new FetchMobileTicketProductByIdUseCase$invoke$1(this, continuationImpl);
            }
        } else {
            fetchMobileTicketProductByIdUseCase$invoke$1 = new FetchMobileTicketProductByIdUseCase$invoke$1(this, continuationImpl);
        }
        Object objG = fetchMobileTicketProductByIdUseCase$invoke$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = fetchMobileTicketProductByIdUseCase$invoke$1.label;
        try {
            if (i2 == 0) {
                ResultKt.b(objG);
                PremiumBusRepository premiumBusRepository = this.f8262a;
                fetchMobileTicketProductByIdUseCase$invoke$1.L$0 = str;
                fetchMobileTicketProductByIdUseCase$invoke$1.L$1 = str2;
                fetchMobileTicketProductByIdUseCase$invoke$1.L$2 = str3;
                fetchMobileTicketProductByIdUseCase$invoke$1.label = 1;
                objG = premiumBusRepository.G(str, str2, str3, fetchMobileTicketProductByIdUseCase$invoke$1);
                if (objG == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                str3 = (String) fetchMobileTicketProductByIdUseCase$invoke$1.L$2;
                str2 = (String) fetchMobileTicketProductByIdUseCase$invoke$1.L$1;
                str = (String) fetchMobileTicketProductByIdUseCase$invoke$1.L$0;
                ResultKt.b(objG);
            }
            Iterable iterable = ((GenericMobileTicketProductDataApiResponseModel) objG).f8126a;
            if (iterable == null) {
                iterable = EmptyList.f17557a;
            }
            Iterator it = iterable.iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                GenericMobileTicketProductApiResponseModel genericMobileTicketProductApiResponseModel = (GenericMobileTicketProductApiResponseModel) next;
                if (Intrinsics.d(genericMobileTicketProductApiResponseModel.f8124a, str) && Intrinsics.d(genericMobileTicketProductApiResponseModel.c, str2) && Intrinsics.d(genericMobileTicketProductApiResponseModel.d, str3)) {
                    break;
                }
            }
            GenericMobileTicketProductApiResponseModel genericMobileTicketProductApiResponseModel2 = (GenericMobileTicketProductApiResponseModel) next;
            return genericMobileTicketProductApiResponseModel2 != null ? new ChaloUseCaseResult.Success(genericMobileTicketProductApiResponseModel2) : new ChaloUseCaseResult.Failure(MobileTicketByIdFetchFailedReason.NO_PRODUCT_RECEIVED);
        } catch (ChaloLocalException unused) {
            return new ChaloUseCaseResult.Failure(MobileTicketByIdFetchFailedReason.LOCAL_ERROR);
        } catch (NetworkSuccessResponseParseException unused2) {
            return new ChaloUseCaseResult.Failure(MobileTicketByIdFetchFailedReason.PARSE_ERROR);
        } catch (MobileTicketProductFetchFailedException unused3) {
            return new ChaloUseCaseResult.Failure(MobileTicketByIdFetchFailedReason.SERVER_ERROR);
        } catch (CancellationException e) {
            throw e;
        } catch (Exception unused4) {
            return new ChaloUseCaseResult.Failure(MobileTicketByIdFetchFailedReason.UNKNOWN_ERROR);
        }
    }
}
