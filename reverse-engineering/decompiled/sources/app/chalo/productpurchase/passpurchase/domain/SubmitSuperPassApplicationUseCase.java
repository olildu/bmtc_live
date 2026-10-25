package app.chalo.productpurchase.passpurchase.domain;

import app.chalo.models.BookableSuperPassConfiguration;
import app.chalo.models.productbooking.SuperPassPurchaseStopsInfo;
import app.chalo.network.exception.ChaloLocalException;
import app.chalo.network.exception.NetworkSuccessResponseParseException;
import app.chalo.network.model.GenericChaloErrorResponse;
import app.chalo.productpurchase.productselection.data.exceptions.PassApplicationSubmissionFailedException;
import app.chalo.productpurchase.productselection.data.models.api.PassApplicationSubmissionResponseApiModel;
import app.chalo.productpurchase.productselection.data.repository.ProductPurchaseRepository;
import app.chalo.superpass.data.models.entities.SuperPassUserDetails;
import app.chalo.utils.ChaloUseCaseResult;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/productpurchase/passpurchase/domain/SubmitSuperPassApplicationUseCase;", "", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class SubmitSuperPassApplicationUseCase {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ProductPurchaseRepository f8340a;

    public SubmitSuperPassApplicationUseCase(ProductPurchaseRepository productPurchaseRepository) {
        this.f8340a = productPurchaseRepository;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0016  */
    public final Object a(SuperPassUserDetails superPassUserDetails, BookableSuperPassConfiguration bookableSuperPassConfiguration, long j, HashMap map, SuperPassPurchaseStopsInfo superPassPurchaseStopsInfo, Boolean bool, ContinuationImpl continuationImpl) {
        SubmitSuperPassApplicationUseCase$invoke$1 submitSuperPassApplicationUseCase$invoke$1;
        ChaloUseCaseResult.Failure failure;
        if (continuationImpl instanceof SubmitSuperPassApplicationUseCase$invoke$1) {
            submitSuperPassApplicationUseCase$invoke$1 = (SubmitSuperPassApplicationUseCase$invoke$1) continuationImpl;
            int i = submitSuperPassApplicationUseCase$invoke$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                submitSuperPassApplicationUseCase$invoke$1.label = i - Integer.MIN_VALUE;
            } else {
                submitSuperPassApplicationUseCase$invoke$1 = new SubmitSuperPassApplicationUseCase$invoke$1(this, continuationImpl);
            }
        } else {
            submitSuperPassApplicationUseCase$invoke$1 = new SubmitSuperPassApplicationUseCase$invoke$1(this, continuationImpl);
        }
        SubmitSuperPassApplicationUseCase$invoke$1 submitSuperPassApplicationUseCase$invoke$2 = submitSuperPassApplicationUseCase$invoke$1;
        Object objG = submitSuperPassApplicationUseCase$invoke$2.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = submitSuperPassApplicationUseCase$invoke$2.label;
        try {
            if (i2 == 0) {
                ResultKt.b(objG);
                ProductPurchaseRepository productPurchaseRepository = this.f8340a;
                submitSuperPassApplicationUseCase$invoke$2.label = 1;
                objG = productPurchaseRepository.g(superPassUserDetails, bookableSuperPassConfiguration, j, map, superPassPurchaseStopsInfo, bool, submitSuperPassApplicationUseCase$invoke$2);
                if (objG == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.b(objG);
            }
            PassApplicationSubmissionResponseApiModel passApplicationSubmissionResponseApiModel = (PassApplicationSubmissionResponseApiModel) objG;
            String str = passApplicationSubmissionResponseApiModel.f8589a;
            String str2 = passApplicationSubmissionResponseApiModel.c;
            if (!Intrinsics.d(str, "true")) {
                if (str2 == null) {
                    str2 = "";
                }
                return new ChaloUseCaseResult.Failure(str2);
            }
            if (passApplicationSubmissionResponseApiModel.b != null) {
                return new ChaloUseCaseResult.Success(Unit.f17538a);
            }
            if (str2 == null) {
                str2 = "";
            }
            return new ChaloUseCaseResult.Failure(str2);
        } catch (ChaloLocalException e) {
            if (e instanceof ChaloLocalException.ServerErrorException) {
                GenericChaloErrorResponse genericChaloErrorResponse = ((ChaloLocalException.ServerErrorException) e).getGenericChaloErrorResponse();
                failure = new ChaloUseCaseResult.Failure(genericChaloErrorResponse != null ? genericChaloErrorResponse.b : null);
                return failure;
            }
            if ((e instanceof ChaloLocalException.NoInternetException) || (e instanceof ChaloLocalException.NoUpdateInFetchedDataBasedOnEtagVersion) || (e instanceof ChaloLocalException.RequestCancelledException) || (e instanceof ChaloLocalException.SecureCallUnauthorizedAndRefreshTokenServerUnreachableException) || (e instanceof ChaloLocalException.UnexpectedException)) {
                return new ChaloUseCaseResult.Failure(null);
            }
            throw new NoWhenBranchMatchedException();
        } catch (NetworkSuccessResponseParseException unused) {
            return new ChaloUseCaseResult.Failure(null);
        } catch (PassApplicationSubmissionFailedException e2) {
            String message = e2.getMessage();
            failure = new ChaloUseCaseResult.Failure(message != null ? message : "");
            return failure;
        } catch (Exception unused2) {
            return new ChaloUseCaseResult.Failure(null);
        }
    }
}
