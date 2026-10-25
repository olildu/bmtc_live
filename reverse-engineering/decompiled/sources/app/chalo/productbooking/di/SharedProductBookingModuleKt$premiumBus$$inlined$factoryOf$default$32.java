package app.chalo.productbooking.di;

import app.chalo.compose.components.chalomap.ChaloMapMarkerInfoWindowProvider;
import app.chalo.compose.components.chalomap.PolylineUtils;
import app.chalo.compose.components.chalomap.iconprovider.ChaloMapMarkerIconProvider;
import app.chalo.livetracking.frameworklivetracking.domain.CheckLiveBusDelayedUseCase;
import app.chalo.premiumbus.ui.changestop.PremiumBusChangeStopUIStateFactory;
import app.chalo.providers.stringprovider.StringProvider;
import app.chalo.utils.timeutil.TimeUtilsContract;
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
public final class SharedProductBookingModuleKt$premiumBus$$inlined$factoryOf$default$32 implements Function2<Scope, ParametersHolder, PremiumBusChangeStopUIStateFactory> {
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) throws ClosedScopeException {
        Scope scope = (Scope) obj;
        Object objD = scope.d(i71.k(scope, "$this$factory", (ParametersHolder) obj2, "it", StringProvider.class), null, null);
        Object objD2 = scope.d(Reflection.a(PolylineUtils.class), null, null);
        Object objD3 = scope.d(Reflection.a(TimeUtilsContract.class), null, null);
        Object objD4 = scope.d(Reflection.a(ChaloMapMarkerInfoWindowProvider.class), null, null);
        return new PremiumBusChangeStopUIStateFactory((StringProvider) objD, (PolylineUtils) objD2, (TimeUtilsContract) objD3, (ChaloMapMarkerInfoWindowProvider) objD4, (ChaloMapMarkerIconProvider) scope.d(Reflection.a(ChaloMapMarkerIconProvider.class), null, null), (CheckLiveBusDelayedUseCase) scope.d(Reflection.a(CheckLiveBusDelayedUseCase.class), null, null));
    }
}
