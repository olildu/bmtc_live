package app.chalo.productbooking.di;

import app.chalo.analytics.contract.AnalyticsContract;
import app.chalo.premiumbus.data.SuperPassDataWrapper;
import app.chalo.premiumbus.ui.bulkbookingsuccess.PremiumBusBulkBookingConfirmationComponent;
import app.chalo.productbooking.common.domain.BulkPreBookUseCase;
import app.chalo.productbooking.common.domain.FetchCompleteProductConfigByIdWithLocalCacheUseCase;
import app.chalo.providers.stringprovider.StringProvider;
import app.chalo.providers.toast.KotlinToastManager;
import app.chalo.scenes.ChaloNavigationManager;
import app.chalo.scenes.args.PremiumBusArgs;
import app.chalo.usecase.FormatTimeInMillisToGivenFormatUseCase;
import com.arkivanov.decompose.ComponentContext;
import defpackage.i71;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Reflection;
import org.koin.core.error.ClosedScopeException;
import org.koin.core.parameter.ParametersHolder;
import org.koin.core.scope.Scope;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
public final class SharedProductBookingModuleKt$premiumBus$$inlined$factoryOf$default$28 implements Function2<Scope, ParametersHolder, PremiumBusBulkBookingConfirmationComponent> {
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) throws ClosedScopeException {
        Scope scope = (Scope) obj;
        Object objD = scope.d(i71.k(scope, "$this$factory", (ParametersHolder) obj2, "it", PremiumBusArgs.PremiumBusBulkBookingConfirmationScreenArgs.class), null, null);
        Object objD2 = scope.d(Reflection.a(ComponentContext.class), null, null);
        Object objD3 = scope.d(Reflection.a(ChaloNavigationManager.class), null, null);
        Object objD4 = scope.d(Reflection.a(SuperPassDataWrapper.class), null, null);
        Object objD5 = scope.d(Reflection.a(KotlinToastManager.class), null, null);
        Object objD6 = scope.d(Reflection.a(StringProvider.class), null, null);
        Object objD7 = scope.d(Reflection.a(BulkPreBookUseCase.class), null, null);
        Object objD8 = scope.d(Reflection.a(AnalyticsContract.class), null, null);
        return new PremiumBusBulkBookingConfirmationComponent((PremiumBusArgs.PremiumBusBulkBookingConfirmationScreenArgs) objD, (ComponentContext) objD2, (ChaloNavigationManager) objD3, (SuperPassDataWrapper) objD4, (KotlinToastManager) objD5, (StringProvider) objD6, (BulkPreBookUseCase) objD7, (AnalyticsContract) objD8, (FormatTimeInMillisToGivenFormatUseCase) scope.d(Reflection.a(FormatTimeInMillisToGivenFormatUseCase.class), null, null), (FetchCompleteProductConfigByIdWithLocalCacheUseCase) scope.d(Reflection.a(FetchCompleteProductConfigByIdWithLocalCacheUseCase.class), null, null));
    }
}
