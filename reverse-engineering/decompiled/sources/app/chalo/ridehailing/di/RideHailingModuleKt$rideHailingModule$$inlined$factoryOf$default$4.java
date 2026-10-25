package app.chalo.ridehailing.di;

import app.chalo.features.wallet.CurrencyFeature;
import app.chalo.providers.stringprovider.StringProvider;
import app.chalo.ridehailing.feedback.RideFeedbackCommonUIStateFactory;
import app.chalo.ridehailing.feedback.RideFeedbackUIStateFactory;
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
public final class RideHailingModuleKt$rideHailingModule$$inlined$factoryOf$default$4 implements Function2<Scope, ParametersHolder, RideFeedbackUIStateFactory> {
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) throws ClosedScopeException {
        Scope scope = (Scope) obj;
        Object objD = scope.d(i71.k(scope, "$this$factory", (ParametersHolder) obj2, "it", CurrencyFeature.class), null, null);
        return new RideFeedbackUIStateFactory((CurrencyFeature) objD, (StringProvider) scope.d(Reflection.a(StringProvider.class), null, null), (RideFeedbackCommonUIStateFactory) scope.d(Reflection.a(RideFeedbackCommonUIStateFactory.class), null, null));
    }
}
