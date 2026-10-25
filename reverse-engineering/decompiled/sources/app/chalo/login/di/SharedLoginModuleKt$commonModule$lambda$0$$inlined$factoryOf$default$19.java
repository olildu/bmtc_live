package app.chalo.login.di;

import app.chalo.analytics.contract.AnalyticsContract;
import app.chalo.domain.MinProfileAnalyticsHelper;
import app.chalo.features.adjust.AdjustManager;
import app.chalo.helper.MandatoryFirstHistoryCallGuard;
import app.chalo.login.domain.ExtractOtpFromSmsContentUseCase;
import app.chalo.login.domain.ResolvePostLoginNavigationTargetUseCase;
import app.chalo.login.domain.SendOtpForLoginUseCase;
import app.chalo.login.domain.SyncAndUpdateAnalyticsPropertiesAfterLoginUseCase;
import app.chalo.login.domain.VerifyLoginSuccessOnServerAndHandleTokensUseCase;
import app.chalo.login.manager.DpdpaConsentManager;
import app.chalo.login.smsautoread.SmsAutoReader;
import app.chalo.login.ui.otp.LoginOtpEnterComponent;
import app.chalo.permissions.handler.PermissionHandlerProvider;
import app.chalo.providers.cityprovider.CityProvider;
import app.chalo.providers.stringprovider.StringProvider;
import app.chalo.providers.toast.KotlinToastManager;
import app.chalo.resultstatemanager.minprofileupdate.MinProfileUpdateResultStateManager;
import app.chalo.resultstatemanager.userconsent.UserConsentResultStateManager;
import app.chalo.scenes.ChaloNavigationManager;
import app.chalo.scenes.args.LoginOtpSceneArgs;
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
public final class SharedLoginModuleKt$commonModule$lambda$0$$inlined$factoryOf$default$19 implements Function2<Scope, ParametersHolder, LoginOtpEnterComponent> {
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) throws ClosedScopeException {
        Scope scope = (Scope) obj;
        Object objD = scope.d(i71.k(scope, "$this$factory", (ParametersHolder) obj2, "it", LoginOtpSceneArgs.class), null, null);
        Object objD2 = scope.d(Reflection.a(SendOtpForLoginUseCase.class), null, null);
        Object objD3 = scope.d(Reflection.a(VerifyLoginSuccessOnServerAndHandleTokensUseCase.class), null, null);
        Object objD4 = scope.d(Reflection.a(StringProvider.class), null, null);
        Object objD5 = scope.d(Reflection.a(AnalyticsContract.class), null, null);
        Object objD6 = scope.d(Reflection.a(SyncAndUpdateAnalyticsPropertiesAfterLoginUseCase.class), null, null);
        Object objD7 = scope.d(Reflection.a(ExtractOtpFromSmsContentUseCase.class), null, null);
        Object objD8 = scope.d(Reflection.a(CityProvider.class), null, null);
        Object objD9 = scope.d(Reflection.a(ChaloNavigationManager.class), null, null);
        Object objD10 = scope.d(Reflection.a(SmsAutoReader.class), null, null);
        Object objD11 = scope.d(Reflection.a(DpdpaConsentManager.class), null, null);
        Object objD12 = scope.d(Reflection.a(UserConsentResultStateManager.class), null, null);
        Object objD13 = scope.d(Reflection.a(MinProfileUpdateResultStateManager.class), null, null);
        Object objD14 = scope.d(Reflection.a(AdjustManager.class), null, null);
        Object objD15 = scope.d(Reflection.a(KotlinToastManager.class), null, null);
        Object objD16 = scope.d(Reflection.a(ComponentContext.class), null, null);
        Object objD17 = scope.d(Reflection.a(MandatoryFirstHistoryCallGuard.class), null, null);
        Object objD18 = scope.d(Reflection.a(PermissionHandlerProvider.class), null, null);
        return new LoginOtpEnterComponent((LoginOtpSceneArgs) objD, (SendOtpForLoginUseCase) objD2, (VerifyLoginSuccessOnServerAndHandleTokensUseCase) objD3, (StringProvider) objD4, (AnalyticsContract) objD5, (SyncAndUpdateAnalyticsPropertiesAfterLoginUseCase) objD6, (ExtractOtpFromSmsContentUseCase) objD7, (CityProvider) objD8, (ChaloNavigationManager) objD9, (SmsAutoReader) objD10, (DpdpaConsentManager) objD11, (UserConsentResultStateManager) objD12, (MinProfileUpdateResultStateManager) objD13, (AdjustManager) objD14, (KotlinToastManager) objD15, (ComponentContext) objD16, (MandatoryFirstHistoryCallGuard) objD17, (PermissionHandlerProvider) objD18, (ResolvePostLoginNavigationTargetUseCase) scope.d(Reflection.a(ResolvePostLoginNavigationTargetUseCase.class), null, null), (MinProfileAnalyticsHelper) scope.d(Reflection.a(MinProfileAnalyticsHelper.class), null, null));
    }
}
