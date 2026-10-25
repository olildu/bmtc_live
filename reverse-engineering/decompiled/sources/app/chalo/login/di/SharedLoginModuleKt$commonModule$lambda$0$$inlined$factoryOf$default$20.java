package app.chalo.login.di;

import app.chalo.analytics.contract.AnalyticsContract;
import app.chalo.contract.BasicInfoContract;
import app.chalo.fileupload.domain.UploadFileToServerUseCase;
import app.chalo.fileupload.picker.ImagePickerProvider;
import app.chalo.helper.ChaloAppFeatureHelper;
import app.chalo.login.userprofiling.ruleengine.UserProfilingHooksRuleEngineDataStore;
import app.chalo.permissions.handler.PermissionHandlerProvider;
import app.chalo.providers.UserProfileDetailsProvider;
import app.chalo.providers.stringprovider.StringProvider;
import app.chalo.providers.toast.KotlinToastManager;
import app.chalo.resultstatemanager.minprofileupdate.MinProfileUpdateResultStateManager;
import app.chalo.scenes.ChaloNavigationManager;
import app.chalo.scenes.args.MinProfileUpdateArgs;
import app.chalo.userprofile.domain.UpdateUserProfileUseCase;
import app.chalo.userprofile.domain.validation.ProfileInputValidator;
import app.chalo.userprofile.ui.minprofileupdate.MinProfileUpdateComponent;
import app.chalo.utils.SystemHelper;
import app.chalo.utils.timeutil.TimeUtilsContract;
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
public final class SharedLoginModuleKt$commonModule$lambda$0$$inlined$factoryOf$default$20 implements Function2<Scope, ParametersHolder, MinProfileUpdateComponent> {
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) throws ClosedScopeException {
        Scope scope = (Scope) obj;
        Object objD = scope.d(i71.k(scope, "$this$factory", (ParametersHolder) obj2, "it", ComponentContext.class), null, null);
        Object objD2 = scope.d(Reflection.a(MinProfileUpdateArgs.class), null, null);
        Object objD3 = scope.d(Reflection.a(UserProfileDetailsProvider.class), null, null);
        Object objD4 = scope.d(Reflection.a(ChaloNavigationManager.class), null, null);
        Object objD5 = scope.d(Reflection.a(PermissionHandlerProvider.class), null, null);
        Object objD6 = scope.d(Reflection.a(ImagePickerProvider.class), null, null);
        Object objD7 = scope.d(Reflection.a(UpdateUserProfileUseCase.class), null, null);
        Object objD8 = scope.d(Reflection.a(UploadFileToServerUseCase.class), null, null);
        Object objD9 = scope.d(Reflection.a(StringProvider.class), null, null);
        Object objD10 = scope.d(Reflection.a(KotlinToastManager.class), null, null);
        Object objD11 = scope.d(Reflection.a(TimeUtilsContract.class), null, null);
        Object objD12 = scope.d(Reflection.a(SystemHelper.class), null, null);
        Object objD13 = scope.d(Reflection.a(ChaloAppFeatureHelper.class), null, null);
        Object objD14 = scope.d(Reflection.a(ProfileInputValidator.class), null, null);
        Object objD15 = scope.d(Reflection.a(MinProfileUpdateResultStateManager.class), null, null);
        Object objD16 = scope.d(Reflection.a(AnalyticsContract.class), null, null);
        return new MinProfileUpdateComponent((ComponentContext) objD, (MinProfileUpdateArgs) objD2, (UserProfileDetailsProvider) objD3, (ChaloNavigationManager) objD4, (PermissionHandlerProvider) objD5, (ImagePickerProvider) objD6, (UpdateUserProfileUseCase) objD7, (UploadFileToServerUseCase) objD8, (StringProvider) objD9, (KotlinToastManager) objD10, (TimeUtilsContract) objD11, (SystemHelper) objD12, (ChaloAppFeatureHelper) objD13, (ProfileInputValidator) objD14, (MinProfileUpdateResultStateManager) objD15, (AnalyticsContract) objD16, (UserProfilingHooksRuleEngineDataStore) scope.d(Reflection.a(UserProfilingHooksRuleEngineDataStore.class), null, null), (BasicInfoContract) scope.d(Reflection.a(BasicInfoContract.class), null, null));
    }
}
