package app.chalo.home.di;

import app.chalo.features.chalotime.ChaloTimeProvider;
import app.chalo.providers.UserProfileDetailsProvider;
import app.chalo.sos.data.repository.RaiseSOSRepository;
import app.chalo.usecase.RaiseSOSUseCase;
import app.chalo.utils.timeutil.TimeUtilsContract;
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
public final class SharedHomeModuleKt$sosFeature$$inlined$factoryOf$default$5 implements Function2<Scope, ParametersHolder, RaiseSOSUseCase> {
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) throws ClosedScopeException {
        Scope scope = (Scope) obj;
        Object objD = scope.d(i71.k(scope, "$this$factory", (ParametersHolder) obj2, "it", RaiseSOSRepository.class), null, null);
        Object objD2 = scope.d(Reflection.a(UserProfileDetailsProvider.class), null, null);
        return new RaiseSOSUseCase((RaiseSOSRepository) objD, (UserProfileDetailsProvider) objD2, (ChaloTimeProvider) scope.d(Reflection.a(ChaloTimeProvider.class), null, null), (TimeUtilsContract) scope.d(Reflection.a(TimeUtilsContract.class), null, null));
    }
}
