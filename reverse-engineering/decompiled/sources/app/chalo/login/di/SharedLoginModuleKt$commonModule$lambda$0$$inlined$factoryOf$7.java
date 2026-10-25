package app.chalo.login.di;

import app.chalo.userprofile.data.local.UserProfileLocalDataSource;
import app.chalo.userprofile.data.remote.UserProfileRemoteDataSource;
import app.chalo.userprofile.data.repository.UserProfileRepositoryImpl;
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
public final class SharedLoginModuleKt$commonModule$lambda$0$$inlined$factoryOf$7 implements Function2<Scope, ParametersHolder, UserProfileRepositoryImpl> {
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) throws ClosedScopeException {
        Scope scope = (Scope) obj;
        Object objD = scope.d(i71.k(scope, "$this$factory", (ParametersHolder) obj2, "it", UserProfileRemoteDataSource.class), null, null);
        return new UserProfileRepositoryImpl((UserProfileRemoteDataSource) objD, (UserProfileLocalDataSource) scope.d(Reflection.a(UserProfileLocalDataSource.class), null, null), (TimeUtilsContract) scope.d(Reflection.a(TimeUtilsContract.class), null, null));
    }
}
