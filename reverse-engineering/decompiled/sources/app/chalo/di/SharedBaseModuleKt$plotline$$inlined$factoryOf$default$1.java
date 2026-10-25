package app.chalo.di;

import app.chalo.contract.BasicInfoContract;
import app.chalo.crashlytics.CrashlyticsLogger;
import app.chalo.plotline.HandleCustomActionUseCase;
import app.chalo.providers.UserProfileDetailsProvider;
import app.chalo.providers.stringprovider.StringProvider;
import app.chalo.utils.SystemHelper;
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
public final class SharedBaseModuleKt$plotline$$inlined$factoryOf$default$1 implements Function2<Scope, ParametersHolder, HandleCustomActionUseCase> {
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) throws ClosedScopeException {
        Scope scope = (Scope) obj;
        Object objD = scope.d(i71.k(scope, "$this$factory", (ParametersHolder) obj2, "it", StringProvider.class), null, null);
        Object objD2 = scope.d(Reflection.a(BasicInfoContract.class), null, null);
        Object objD3 = scope.d(Reflection.a(UserProfileDetailsProvider.class), null, null);
        return new HandleCustomActionUseCase((StringProvider) objD, (BasicInfoContract) objD2, (UserProfileDetailsProvider) objD3, (CrashlyticsLogger) scope.d(Reflection.a(CrashlyticsLogger.class), null, null), (SystemHelper) scope.d(Reflection.a(SystemHelper.class), null, null));
    }
}
