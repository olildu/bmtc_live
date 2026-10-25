package app.chalo.home.di;

import app.chalo.analytics.contract.AnalyticsContract;
import app.chalo.contract.BasicInfoContract;
import app.chalo.contract.NavigationContract;
import app.chalo.crashlytics.CrashlyticsLogger;
import app.chalo.features.foreground.ActiveSceneInStackResolver;
import app.chalo.notification.managers.NotificationDisplayDataManagerImpl;
import app.chalo.productpurchase.passpurchase.domain.PassPurchaseSceneResolverUseCase;
import app.chalo.providers.UserProfileDetailsProvider;
import app.chalo.utils.MobileTicketingConverters;
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
public final class SharedHomeModuleKt$notification$$inlined$factoryOf$2 implements Function2<Scope, ParametersHolder, NotificationDisplayDataManagerImpl> {
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) throws ClosedScopeException {
        Scope scope = (Scope) obj;
        Object objD = scope.d(i71.k(scope, "$this$factory", (ParametersHolder) obj2, "it", UserProfileDetailsProvider.class), null, null);
        Object objD2 = scope.d(Reflection.a(ActiveSceneInStackResolver.class), null, null);
        Object objD3 = scope.d(Reflection.a(PassPurchaseSceneResolverUseCase.class), null, null);
        Object objD4 = scope.d(Reflection.a(MobileTicketingConverters.class), null, null);
        Object objD5 = scope.d(Reflection.a(AnalyticsContract.class), null, null);
        Object objD6 = scope.d(Reflection.a(BasicInfoContract.class), null, null);
        return new NotificationDisplayDataManagerImpl((UserProfileDetailsProvider) objD, (ActiveSceneInStackResolver) objD2, (PassPurchaseSceneResolverUseCase) objD3, (MobileTicketingConverters) objD4, (AnalyticsContract) objD5, (BasicInfoContract) objD6, (NavigationContract) scope.d(Reflection.a(NavigationContract.class), null, null), (CrashlyticsLogger) scope.d(Reflection.a(CrashlyticsLogger.class), null, null));
    }
}
