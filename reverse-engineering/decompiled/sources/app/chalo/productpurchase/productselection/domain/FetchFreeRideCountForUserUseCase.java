package app.chalo.productpurchase.productselection.domain;

import app.chalo.productpurchase.productselection.data.models.api.FreeRideCountDataApiModel;
import app.chalo.productpurchase.productselection.data.models.api.FreeRideCountResponseApiModel;
import app.chalo.productpurchase.productselection.data.repository.ProductPurchaseRepository;
import app.chalo.providers.UserProfileDetailsProvider;
import app.chalo.providers.cityprovider.CityProvider;
import app.chalo.providers.cityprovider.CityProviderKt;
import app.chalo.utils.ChaloUseCaseResult;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/productpurchase/productselection/domain/FetchFreeRideCountForUserUseCase;", "", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class FetchFreeRideCountForUserUseCase {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CityProvider f8656a;
    public final UserProfileDetailsProvider b;
    public final ProductPurchaseRepository c;

    public FetchFreeRideCountForUserUseCase(CityProvider cityProvider, UserProfileDetailsProvider userProfileDetailsProvider, ProductPurchaseRepository productPurchaseRepository) {
        this.f8656a = cityProvider;
        this.b = userProfileDetailsProvider;
        this.c = productPurchaseRepository;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(String str, ContinuationImpl continuationImpl) {
        FetchFreeRideCountForUserUseCase$invoke$1 fetchFreeRideCountForUserUseCase$invoke$1;
        Integer num;
        if (continuationImpl instanceof FetchFreeRideCountForUserUseCase$invoke$1) {
            fetchFreeRideCountForUserUseCase$invoke$1 = (FetchFreeRideCountForUserUseCase$invoke$1) continuationImpl;
            int i = fetchFreeRideCountForUserUseCase$invoke$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                fetchFreeRideCountForUserUseCase$invoke$1.label = i - Integer.MIN_VALUE;
            } else {
                fetchFreeRideCountForUserUseCase$invoke$1 = new FetchFreeRideCountForUserUseCase$invoke$1(this, continuationImpl);
            }
        } else {
            fetchFreeRideCountForUserUseCase$invoke$1 = new FetchFreeRideCountForUserUseCase$invoke$1(this, continuationImpl);
        }
        Object objI = fetchFreeRideCountForUserUseCase$invoke$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = fetchFreeRideCountForUserUseCase$invoke$1.label;
        try {
            if (i2 == 0) {
                ResultKt.b(objI);
                String strB = CityProviderKt.b(this.f8656a);
                if (strB == null) {
                    return new ChaloUseCaseResult.Failure("City not available");
                }
                String strM = this.b.m();
                if (strM == null) {
                    return new ChaloUseCaseResult.Failure("User not logged in");
                }
                ProductPurchaseRepository productPurchaseRepository = this.c;
                fetchFreeRideCountForUserUseCase$invoke$1.label = 1;
                objI = productPurchaseRepository.i(strM, strB, str, fetchFreeRideCountForUserUseCase$invoke$1);
                if (objI == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.b(objI);
            }
            FreeRideCountResponseApiModel freeRideCountResponseApiModel = (FreeRideCountResponseApiModel) objI;
            if (Intrinsics.d(freeRideCountResponseApiModel.f8565a, Boolean.TRUE)) {
                FreeRideCountDataApiModel freeRideCountDataApiModel = freeRideCountResponseApiModel.b;
                return (freeRideCountDataApiModel == null || (num = freeRideCountDataApiModel.f8563a) == null) ? new ChaloUseCaseResult.Failure("Invalid count") : new ChaloUseCaseResult.Success(new Integer(num.intValue()));
            }
            String str2 = freeRideCountResponseApiModel.c;
            if (str2 == null) {
                str2 = "Invalid status";
            }
            return new ChaloUseCaseResult.Failure(str2);
        } catch (Exception e) {
            String message = e.getMessage();
            if (message == null) {
                message = e.toString();
            }
            return new ChaloUseCaseResult.Failure(message);
        }
    }
}
