package app.chalo.productbooking.common.domain;

import app.chalo.mvibase.simple.DataFetchOperationException;
import app.chalo.mvibase.simple.OperationFailureError;
import app.chalo.mvibase.simple.UseCaseOperationError;
import app.chalo.mvibase.simple.UseCaseOperationErrorKt;
import app.chalo.network.model.GenericChaloErrorResponse;
import app.chalo.premiumbus.data.exceptions.PBPreBookingBulkBookFailedException;
import app.chalo.premiumbus.data.repository.PremiumBusRepository;
import app.chalo.productbooking.common.data.models.app.request.BulkPreBookRequestAppModel;
import app.chalo.productbooking.common.data.models.app.response.BulkPreBookResponseAppModel;
import app.chalo.providers.cityprovider.CityProvider;
import app.chalo.providers.stringprovider.StringEnum;
import app.chalo.providers.stringprovider.StringProvider;
import app.chalo.utils.ChaloUseCaseResult;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/productbooking/common/domain/BulkPreBookUseCase;", "", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class BulkPreBookUseCase {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final PremiumBusRepository f8251a;
    public final CityProvider b;
    public final StringProvider c;

    public BulkPreBookUseCase(PremiumBusRepository premiumBusRepository, CityProvider cityProvider, StringProvider stringProvider) {
        this.f8251a = premiumBusRepository;
        this.b = cityProvider;
        this.c = stringProvider;
    }

    public static ChaloUseCaseResult.Failure a(BulkPreBookRequestFailedReason bulkPreBookRequestFailedReason, String str) {
        return new ChaloUseCaseResult.Failure(new UseCaseOperationError(new OperationFailureError.UseCaseSpecificError(bulkPreBookRequestFailedReason), bulkPreBookRequestFailedReason.getErrorCode(), str));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    public final Object b(String str, String str2, String str3, List list, List list2, boolean z, ContinuationImpl continuationImpl) {
        BulkPreBookUseCase$invoke$1 bulkPreBookUseCase$invoke$1;
        BulkPreBookRequestFailedReason bulkPreBookRequestFailedReason;
        BulkPreBookUseCase bulkPreBookUseCase;
        BulkPreBookRequestFailedReason next;
        BulkPreBookRequestFailedReason bulkPreBookRequestFailedReason2;
        BulkPreBookUseCase bulkPreBookUseCase2;
        if (continuationImpl instanceof BulkPreBookUseCase$invoke$1) {
            bulkPreBookUseCase$invoke$1 = (BulkPreBookUseCase$invoke$1) continuationImpl;
            int i = bulkPreBookUseCase$invoke$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                bulkPreBookUseCase$invoke$1.label = i - Integer.MIN_VALUE;
            } else {
                bulkPreBookUseCase$invoke$1 = new BulkPreBookUseCase$invoke$1(this, continuationImpl);
            }
        } else {
            bulkPreBookUseCase$invoke$1 = new BulkPreBookUseCase$invoke$1(this, continuationImpl);
        }
        Object objE = bulkPreBookUseCase$invoke$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = bulkPreBookUseCase$invoke$1.label;
        StringProvider stringProvider = this.c;
        try {
            if (i2 != 0) {
                if (i2 == 1) {
                    bulkPreBookRequestFailedReason2 = (BulkPreBookRequestFailedReason) bulkPreBookUseCase$invoke$1.L$1;
                    bulkPreBookUseCase2 = (BulkPreBookUseCase) bulkPreBookUseCase$invoke$1.L$0;
                    ResultKt.b(objE);
                    bulkPreBookUseCase2.getClass();
                    return a(bulkPreBookRequestFailedReason2, (String) objE);
                }
                if (i2 == 2) {
                    ResultKt.b(objE);
                    return new ChaloUseCaseResult.Success((BulkPreBookResponseAppModel) objE);
                }
                if (i2 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                bulkPreBookRequestFailedReason = (BulkPreBookRequestFailedReason) bulkPreBookUseCase$invoke$1.L$1;
                bulkPreBookUseCase = (BulkPreBookUseCase) bulkPreBookUseCase$invoke$1.L$0;
                ResultKt.b(objE);
                bulkPreBookUseCase.getClass();
                return a(bulkPreBookRequestFailedReason, (String) objE);
            }
            ResultKt.b(objE);
            String strH = this.b.h();
            if (strH != null) {
                PremiumBusRepository premiumBusRepository = this.f8251a;
                BulkPreBookRequestAppModel bulkPreBookRequestAppModel = new BulkPreBookRequestAppModel(strH, str, str2, str3, list, list2, z);
                bulkPreBookUseCase$invoke$1.label = 2;
                objE = premiumBusRepository.E(bulkPreBookRequestAppModel, bulkPreBookUseCase$invoke$1);
                if (objE == coroutineSingletons) {
                }
                return new ChaloUseCaseResult.Success((BulkPreBookResponseAppModel) objE);
            }
            bulkPreBookRequestFailedReason2 = BulkPreBookRequestFailedReason.CITY_NOT_FOUND;
            bulkPreBookUseCase$invoke$1.L$0 = this;
            bulkPreBookUseCase$invoke$1.L$1 = bulkPreBookRequestFailedReason2;
            bulkPreBookUseCase$invoke$1.label = 1;
            objE = stringProvider.b(StringEnum.SOMETHING_WENT_WRONG, new Object[0], bulkPreBookUseCase$invoke$1);
            if (objE != coroutineSingletons) {
                bulkPreBookUseCase2 = this;
                bulkPreBookUseCase2.getClass();
                return a(bulkPreBookRequestFailedReason2, (String) objE);
            }
            return coroutineSingletons;
        } catch (Exception e) {
            if (!(e instanceof PBPreBookingBulkBookFailedException)) {
                if (e instanceof DataFetchOperationException) {
                    return new ChaloUseCaseResult.Failure(UseCaseOperationErrorKt.a((DataFetchOperationException) e));
                }
                BulkPreBookRequestFailedReason bulkPreBookRequestFailedReason3 = BulkPreBookRequestFailedReason.UNKNOWN_ERROR;
                bulkPreBookUseCase$invoke$1.L$0 = this;
                bulkPreBookUseCase$invoke$1.L$1 = bulkPreBookRequestFailedReason3;
                bulkPreBookUseCase$invoke$1.label = 3;
                Object objB = stringProvider.b(StringEnum.SOMETHING_WENT_WRONG, new Object[0], bulkPreBookUseCase$invoke$1);
                if (objB != coroutineSingletons) {
                    bulkPreBookRequestFailedReason = bulkPreBookRequestFailedReason3;
                    objE = objB;
                    bulkPreBookUseCase = this;
                }
                return coroutineSingletons;
            }
            PBPreBookingBulkBookFailedException pBPreBookingBulkBookFailedException = (PBPreBookingBulkBookFailedException) e;
            GenericChaloErrorResponse genericChaloErrorResponse = pBPreBookingBulkBookFailedException.getGenericChaloErrorResponse();
            int errorCode = genericChaloErrorResponse != null ? genericChaloErrorResponse.f6497a : BulkPreBookRequestFailedReason.UNKNOWN_ERROR.getErrorCode();
            Iterator<BulkPreBookRequestFailedReason> it = BulkPreBookRequestFailedReason.getEntries().iterator();
            do {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
            } while (next.getErrorCode() != errorCode);
            BulkPreBookRequestFailedReason bulkPreBookRequestFailedReason4 = next;
            if (bulkPreBookRequestFailedReason4 == null) {
                bulkPreBookRequestFailedReason4 = BulkPreBookRequestFailedReason.UNKNOWN_ERROR;
            }
            GenericChaloErrorResponse genericChaloErrorResponse2 = pBPreBookingBulkBookFailedException.getGenericChaloErrorResponse();
            return a(bulkPreBookRequestFailedReason4, genericChaloErrorResponse2 != null ? genericChaloErrorResponse2.b : null);
        }
    }
}
