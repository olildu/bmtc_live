package app.chalo.onboarding.di;

import app.chalo.analytics.contract.AnalyticsContract;
import app.chalo.onboarding.citydiscontinued.CityDiscontinuedComponent;
import app.chalo.onboarding.citydiscontinued.CityDiscontinuedUIStateFactory;
import app.chalo.scenes.ChaloNavigationManager;
import app.chalo.scenes.args.CityDiscontinuedArgs;
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
public final class SharedOnboardingModuleKt$commonModule$lambda$0$$inlined$factoryOf$default$9 implements Function2<Scope, ParametersHolder, CityDiscontinuedComponent> {
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) throws ClosedScopeException {
        Scope scope = (Scope) obj;
        Object objD = scope.d(i71.k(scope, "$this$factory", (ParametersHolder) obj2, "it", ComponentContext.class), null, null);
        Object objD2 = scope.d(Reflection.a(CityDiscontinuedArgs.class), null, null);
        Object objD3 = scope.d(Reflection.a(CityDiscontinuedUIStateFactory.class), null, null);
        return new CityDiscontinuedComponent((ComponentContext) objD, (CityDiscontinuedArgs) objD2, (CityDiscontinuedUIStateFactory) objD3, (ChaloNavigationManager) scope.d(Reflection.a(ChaloNavigationManager.class), null, null), (AnalyticsContract) scope.d(Reflection.a(AnalyticsContract.class), null, null));
    }
}
