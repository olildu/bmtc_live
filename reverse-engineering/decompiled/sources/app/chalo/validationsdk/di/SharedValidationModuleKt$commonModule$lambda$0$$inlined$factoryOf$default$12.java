package app.chalo.validationsdk.di;

import app.chalo.contract.BasicInfoContract;
import app.chalo.features.reportproblem.IReportProblemFeature;
import app.chalo.notification.core.GCMReceiver;
import app.chalo.permissions.handler.PermissionHandlerProvider;
import app.chalo.scenes.ChaloNavigationManager;
import app.chalo.scenes.args.ValidationArgs;
import app.chalo.usecase.IsNotificationPermissionGrantedUseCase;
import app.chalo.validationsdk.blevalidation.config.ProductValidationConfigProvider;
import app.chalo.validationsdk.blevalidation.domain.qrvalidation.QRValidationLifecycleDelegate;
import app.chalo.validationsdk.multiproductvalidation.ui.MultiProductValidationComponent;
import app.chalo.validationsdk.multiproductvalidation.ui.MultiProductValidationUIStateFactory;
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
public final class SharedValidationModuleKt$commonModule$lambda$0$$inlined$factoryOf$default$12 implements Function2<Scope, ParametersHolder, MultiProductValidationComponent> {
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) throws ClosedScopeException {
        Scope scope = (Scope) obj;
        Object objD = scope.d(i71.k(scope, "$this$factory", (ParametersHolder) obj2, "it", ComponentContext.class), null, null);
        Object objD2 = scope.d(Reflection.a(ValidationArgs.MultiProductValidation.class), null, null);
        Object objD3 = scope.d(Reflection.a(BasicInfoContract.class), null, null);
        Object objD4 = scope.d(Reflection.a(ProductValidationConfigProvider.class), null, null);
        Object objD5 = scope.d(Reflection.a(QRValidationLifecycleDelegate.class), null, null);
        Object objD6 = scope.d(Reflection.a(GCMReceiver.class), null, null);
        Object objD7 = scope.d(Reflection.a(IReportProblemFeature.class), null, null);
        Object objD8 = scope.d(Reflection.a(ChaloNavigationManager.class), null, null);
        Object objD9 = scope.d(Reflection.a(IsNotificationPermissionGrantedUseCase.class), null, null);
        return new MultiProductValidationComponent((ComponentContext) objD, (ValidationArgs.MultiProductValidation) objD2, (BasicInfoContract) objD3, (ProductValidationConfigProvider) objD4, (QRValidationLifecycleDelegate) objD5, (GCMReceiver) objD6, (IReportProblemFeature) objD7, (ChaloNavigationManager) objD8, (IsNotificationPermissionGrantedUseCase) objD9, (PermissionHandlerProvider) scope.d(Reflection.a(PermissionHandlerProvider.class), null, null), (MultiProductValidationUIStateFactory) scope.d(Reflection.a(MultiProductValidationUIStateFactory.class), null, null));
    }
}
