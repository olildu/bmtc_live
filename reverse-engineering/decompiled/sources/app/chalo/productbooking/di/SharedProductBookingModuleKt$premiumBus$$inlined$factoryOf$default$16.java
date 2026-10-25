package app.chalo.productbooking.di;

import app.chalo.citydata.domain.FetchStopDetailsUseCase;
import app.chalo.compose.components.chalomap.ChaloMapMarkerInfoWindowProvider;
import app.chalo.premiumbus.ui.stopdetails.PBStopDetailsComponent;
import app.chalo.providers.stringprovider.StringProvider;
import app.chalo.scenes.ChaloNavigationManager;
import app.chalo.scenes.args.PremiumBusArgs;
import app.chalo.utils.SystemHelper;
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
public final class SharedProductBookingModuleKt$premiumBus$$inlined$factoryOf$default$16 implements Function2<Scope, ParametersHolder, PBStopDetailsComponent> {
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) throws ClosedScopeException {
        Scope scope = (Scope) obj;
        Object objD = scope.d(i71.k(scope, "$this$factory", (ParametersHolder) obj2, "it", PremiumBusArgs.PremiumStopDetailsArgs.class), null, null);
        Object objD2 = scope.d(Reflection.a(ComponentContext.class), null, null);
        Object objD3 = scope.d(Reflection.a(FetchStopDetailsUseCase.class), null, null);
        Object objD4 = scope.d(Reflection.a(StringProvider.class), null, null);
        Object objD5 = scope.d(Reflection.a(ChaloMapMarkerInfoWindowProvider.class), null, null);
        return new PBStopDetailsComponent((PremiumBusArgs.PremiumStopDetailsArgs) objD, (ComponentContext) objD2, (FetchStopDetailsUseCase) objD3, (StringProvider) objD4, (ChaloMapMarkerInfoWindowProvider) objD5, (ChaloNavigationManager) scope.d(Reflection.a(ChaloNavigationManager.class), null, null), (SystemHelper) scope.d(Reflection.a(SystemHelper.class), null, null));
    }
}
