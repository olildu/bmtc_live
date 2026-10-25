package app.chalo.home.di;

import app.chalo.contract.BasicInfoContract;
import app.chalo.premiumbus.common.domain.PassUpsellPurchaseWrapperImpl;
import app.chalo.productbooking.common.domain.FetchCompleteProductConfigByIdUseCase;
import app.chalo.productbooking.common.domain.StoreCompleteProductConfigLocallyUseCase;
import app.chalo.productpurchase.passpurchase.domain.CreateSuperPassOrderUseCase;
import app.chalo.productpurchase.productselection.data.repository.ProductPurchaseRepository;
import app.chalo.productpurchase.utils.BookingHelper;
import app.chalo.providers.UserProfileDetailsProvider;
import app.chalo.utils.timeutil.TimeUtilsContract;
import defpackage.i71;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Reflection;
import org.koin.core.error.ClosedScopeException;
import org.koin.core.parameter.ParametersHolder;
import org.koin.core.scope.Scope;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
public final class SharedHomeModuleKt$premiumBus$$inlined$factoryOf$2 implements Function2<Scope, ParametersHolder, PassUpsellPurchaseWrapperImpl> {
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) throws ClosedScopeException {
        Scope scope = (Scope) obj;
        Object objD = scope.d(i71.k(scope, "$this$factory", (ParametersHolder) obj2, "it", ProductPurchaseRepository.class), null, null);
        Object objD2 = scope.d(Reflection.a(BookingHelper.class), null, null);
        Object objD3 = scope.d(Reflection.a(CreateSuperPassOrderUseCase.class), null, null);
        Object objD4 = scope.d(Reflection.a(FetchCompleteProductConfigByIdUseCase.class), null, null);
        Object objD5 = scope.d(Reflection.a(StoreCompleteProductConfigLocallyUseCase.class), null, null);
        Object objD6 = scope.d(Reflection.a(UserProfileDetailsProvider.class), null, null);
        return new PassUpsellPurchaseWrapperImpl((ProductPurchaseRepository) objD, (BookingHelper) objD2, (CreateSuperPassOrderUseCase) objD3, (FetchCompleteProductConfigByIdUseCase) objD4, (StoreCompleteProductConfigLocallyUseCase) objD5, (UserProfileDetailsProvider) objD6, (BasicInfoContract) scope.d(Reflection.a(BasicInfoContract.class), null, null), (TimeUtilsContract) scope.d(Reflection.a(TimeUtilsContract.class), null, null));
    }
}
