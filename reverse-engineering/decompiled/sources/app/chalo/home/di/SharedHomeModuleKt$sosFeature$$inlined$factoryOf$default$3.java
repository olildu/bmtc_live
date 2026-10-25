package app.chalo.home.di;

import app.chalo.analytics.contract.AnalyticsContract;
import app.chalo.features.chalotime.ChaloTimeProvider;
import app.chalo.location.ChaloLocationManager;
import app.chalo.providers.UserProfileDetailsProvider;
import app.chalo.providers.cityprovider.CityProvider;
import app.chalo.providers.stringprovider.StringProvider;
import app.chalo.providers.toast.KotlinToastManager;
import app.chalo.scenes.ChaloNavigationManager;
import app.chalo.scenes.args.SosArgs;
import app.chalo.sos.SosScreenComponent;
import app.chalo.sos.SosScreenUIStateFactory;
import app.chalo.sos.feature.SosContactsFeature;
import app.chalo.sos.official.GetOfficialSosContactsUseCase;
import app.chalo.usecase.RaiseSOSUseCase;
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
public final class SharedHomeModuleKt$sosFeature$$inlined$factoryOf$default$3 implements Function2<Scope, ParametersHolder, SosScreenComponent> {
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) throws ClosedScopeException {
        Scope scope = (Scope) obj;
        Object objD = scope.d(i71.k(scope, "$this$factory", (ParametersHolder) obj2, "it", SosArgs.class), null, null);
        Object objD2 = scope.d(Reflection.a(ComponentContext.class), null, null);
        Object objD3 = scope.d(Reflection.a(SosContactsFeature.class), null, null);
        Object objD4 = scope.d(Reflection.a(ChaloNavigationManager.class), null, null);
        Object objD5 = scope.d(Reflection.a(KotlinToastManager.class), null, null);
        Object objD6 = scope.d(Reflection.a(StringProvider.class), null, null);
        Object objD7 = scope.d(Reflection.a(SosScreenUIStateFactory.class), null, null);
        Object objD8 = scope.d(Reflection.a(AnalyticsContract.class), null, null);
        Object objD9 = scope.d(Reflection.a(UserProfileDetailsProvider.class), null, null);
        Object objD10 = scope.d(Reflection.a(ChaloTimeProvider.class), null, null);
        Object objD11 = scope.d(Reflection.a(ChaloLocationManager.class), null, null);
        Object objD12 = scope.d(Reflection.a(RaiseSOSUseCase.class), null, null);
        return new SosScreenComponent((SosArgs) objD, (ComponentContext) objD2, (SosContactsFeature) objD3, (ChaloNavigationManager) objD4, (KotlinToastManager) objD5, (StringProvider) objD6, (SosScreenUIStateFactory) objD7, (AnalyticsContract) objD8, (UserProfileDetailsProvider) objD9, (ChaloTimeProvider) objD10, (ChaloLocationManager) objD11, (RaiseSOSUseCase) objD12, (CityProvider) scope.d(Reflection.a(CityProvider.class), null, null), (GetOfficialSosContactsUseCase) scope.d(Reflection.a(GetOfficialSosContactsUseCase.class), null, null));
    }
}
