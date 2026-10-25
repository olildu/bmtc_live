package app.chalo.home.di;

import app.chalo.contract.NavigationContract;
import app.chalo.premiumbus.prebookedtickets.validation.PremiumReserveTicketValidationNavigationManager;
import app.chalo.scenes.ChaloNavigationManager;
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
public final class SharedHomeModuleKt$premiumBusValidationDependencies$$inlined$factoryOf$2 implements Function2<Scope, ParametersHolder, PremiumReserveTicketValidationNavigationManager> {
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) throws ClosedScopeException {
        Scope scope = (Scope) obj;
        return new PremiumReserveTicketValidationNavigationManager((NavigationContract) scope.d(i71.k(scope, "$this$factory", (ParametersHolder) obj2, "it", NavigationContract.class), null, null), (ChaloNavigationManager) scope.d(Reflection.a(ChaloNavigationManager.class), null, null));
    }
}
