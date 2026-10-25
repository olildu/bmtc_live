package app.chalo.ncmc.di;

import app.chalo.features.wallet.CurrencyFeature;
import app.chalo.ncmc.domain.GenerateUvikIntentHashUseCase;
import app.chalo.ncmc.domain.GetMaskedCardNoFromCardNoUseCase;
import app.chalo.ncmc.domain.ProcessUvikResultUseCase;
import app.chalo.ncmc.ui.pendingrecharge.PendingRechargeComponent;
import app.chalo.ncmc.uvik.UvikSdkHelper;
import app.chalo.providers.stringprovider.StringProvider;
import app.chalo.providers.toast.KotlinToastManager;
import app.chalo.scenes.args.CardPendingRechargesScreenArgs;
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
public final class NcmcModuleKt$viewModels$$inlined$factoryOf$default$8 implements Function2<Scope, ParametersHolder, PendingRechargeComponent> {
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) throws ClosedScopeException {
        Scope scope = (Scope) obj;
        Object objD = scope.d(i71.k(scope, "$this$factory", (ParametersHolder) obj2, "it", ComponentContext.class), null, null);
        Object objD2 = scope.d(Reflection.a(CardPendingRechargesScreenArgs.class), null, null);
        Object objD3 = scope.d(Reflection.a(StringProvider.class), null, null);
        Object objD4 = scope.d(Reflection.a(GetMaskedCardNoFromCardNoUseCase.class), null, null);
        Object objD5 = scope.d(Reflection.a(CurrencyFeature.class), null, null);
        Object objD6 = scope.d(Reflection.a(UvikSdkHelper.class), null, null);
        Object objD7 = scope.d(Reflection.a(GenerateUvikIntentHashUseCase.class), null, null);
        return new PendingRechargeComponent((ComponentContext) objD, (CardPendingRechargesScreenArgs) objD2, (StringProvider) objD3, (GetMaskedCardNoFromCardNoUseCase) objD4, (CurrencyFeature) objD5, (UvikSdkHelper) objD6, (GenerateUvikIntentHashUseCase) objD7, (ProcessUvikResultUseCase) scope.d(Reflection.a(ProcessUvikResultUseCase.class), null, null), (KotlinToastManager) scope.d(Reflection.a(KotlinToastManager.class), null, null));
    }
}
