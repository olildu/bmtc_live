package app.chalo.checkout.di;

import app.chalo.checkout.analytics.ICheckoutAnalyticsHelper;
import app.chalo.checkout.data.resolver.CheckoutPaymentDataResolver;
import app.chalo.checkout.ui.screen.checkout.customurl.CustomUrlCheckoutComponent;
import app.chalo.checkout.utility.InstalledUpiAppsHelperProvider;
import app.chalo.crashlytics.CrashlyticsLogger;
import app.chalo.providers.stringprovider.StringProvider;
import app.chalo.providers.toast.KotlinToastManager;
import app.chalo.scenes.ChaloNavigationManager;
import app.chalo.scenes.args.CustomUrlCheckoutArgs;
import com.arkivanov.decompose.ComponentContext;
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
public final class CheckoutSharedModuleKt$commonModule$lambda$0$$inlined$factoryOf$default$28 implements Function2<Scope, ParametersHolder, CustomUrlCheckoutComponent> {
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) throws ClosedScopeException {
        Scope scope = (Scope) obj;
        Object objD = scope.d(i71.k(scope, "$this$factory", (ParametersHolder) obj2, "it", ComponentContext.class), null, null);
        Object objD2 = scope.d(Reflection.a(CustomUrlCheckoutArgs.class), null, null);
        Object objD3 = scope.d(Reflection.a(CheckoutPaymentDataResolver.class), null, null);
        Object objD4 = scope.d(Reflection.a(ICheckoutAnalyticsHelper.class), null, null);
        Object objD5 = scope.d(Reflection.a(CrashlyticsLogger.class), null, null);
        Object objD6 = scope.d(Reflection.a(InstalledUpiAppsHelperProvider.class), null, null);
        Object objD7 = scope.d(Reflection.a(StringProvider.class), null, null);
        return new CustomUrlCheckoutComponent((ComponentContext) objD, (CustomUrlCheckoutArgs) objD2, (CheckoutPaymentDataResolver) objD3, (ICheckoutAnalyticsHelper) objD4, (CrashlyticsLogger) objD5, (InstalledUpiAppsHelperProvider) objD6, (StringProvider) objD7, (ChaloNavigationManager) scope.d(Reflection.a(ChaloNavigationManager.class), null, null), (KotlinToastManager) scope.d(Reflection.a(KotlinToastManager.class), null, null));
    }
}
