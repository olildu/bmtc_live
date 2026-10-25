package app.chalo.di;

import app.chalo.contract.BasicInfoContract;
import app.chalo.crashlytics.CrashlyticsLogger;
import app.chalo.features.encryption.EncryptionFeature;
import app.chalo.features.wallet.CurrencyFeature;
import app.chalo.providers.cityprovider.CityProvider;
import app.chalo.providers.stringprovider.StringProvider;
import app.chalo.quickpay.validation.manager.QuickPayValidationData;
import app.chalo.utils.timeutil.TimeUtilsContract;
import app.chalo.walletframework.quickpay.data.model.appmodel.QPUserDetailsForProducts;
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
public final class SharedWalletModuleKt$quickpayValidation$$inlined$factoryOf$default$5 implements Function2<Scope, ParametersHolder, QuickPayValidationData> {
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) throws ClosedScopeException {
        Scope scope = (Scope) obj;
        Object objD = scope.d(i71.k(scope, "$this$factory", (ParametersHolder) obj2, "it", CrashlyticsLogger.class), null, null);
        Object objD2 = scope.d(Reflection.a(BasicInfoContract.class), null, null);
        Object objD3 = scope.d(Reflection.a(EncryptionFeature.class), null, null);
        Object objD4 = scope.d(Reflection.a(QPUserDetailsForProducts.class), null, null);
        Object objD5 = scope.d(Reflection.a(CurrencyFeature.class), null, null);
        Object objD6 = scope.d(Reflection.a(StringProvider.class), null, null);
        return new QuickPayValidationData((CrashlyticsLogger) objD, (BasicInfoContract) objD2, (EncryptionFeature) objD3, (QPUserDetailsForProducts) objD4, (CurrencyFeature) objD5, (StringProvider) objD6, (TimeUtilsContract) scope.d(Reflection.a(TimeUtilsContract.class), null, null), (CityProvider) scope.d(Reflection.a(CityProvider.class), null, null));
    }
}
