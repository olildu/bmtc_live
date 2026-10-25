package app.chalo.security.di;

import app.chalo.analytics.contract.AnalyticsContract;
import app.chalo.contract.BasicInfoContract;
import app.chalo.crashlytics.CrashlyticsLogger;
import app.chalo.security.EncryptionFeatureImpl;
import app.chalo.security.FetchEncryptionKeysUseCase;
import app.chalo.security.encryption.storage.KeyStorageContract;
import app.chalo.security.encryption.utils.AESCryptoUtils;
import app.chalo.worker.ApplicationBackgroundWorkersManager;
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
public final class SharedSecurityModuleKt$commonModule$lambda$0$$inlined$singleOf$2 implements Function2<Scope, ParametersHolder, EncryptionFeatureImpl> {
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) throws ClosedScopeException {
        Scope scope = (Scope) obj;
        Object objD = scope.d(i71.k(scope, "$this$single", (ParametersHolder) obj2, "it", KeyStorageContract.class), null, null);
        Object objD2 = scope.d(Reflection.a(BasicInfoContract.class), null, null);
        Object objD3 = scope.d(Reflection.a(CrashlyticsLogger.class), null, null);
        Object objD4 = scope.d(Reflection.a(AnalyticsContract.class), null, null);
        Object objD5 = scope.d(Reflection.a(AESCryptoUtils.class), null, null);
        return new EncryptionFeatureImpl((KeyStorageContract) objD, (BasicInfoContract) objD2, (CrashlyticsLogger) objD3, (AnalyticsContract) objD4, (AESCryptoUtils) objD5, (ApplicationBackgroundWorkersManager) scope.d(Reflection.a(ApplicationBackgroundWorkersManager.class), null, null), (FetchEncryptionKeysUseCase) scope.d(Reflection.a(FetchEncryptionKeysUseCase.class), null, null));
    }
}
