package app.chalo.ondc.di;

import app.chalo.ondc.validation.OndcTicketProductValidationUIManager;
import app.chalo.validationsdk.blevalidation.config.ProductValidationCommonUIManager;
import defpackage.i71;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import org.koin.core.parameter.ParametersHolder;
import org.koin.core.scope.Scope;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
public final class OndcValidationModuleKt$ondcValidationDependencies$$inlined$factoryOf$default$2 implements Function2<Scope, ParametersHolder, OndcTicketProductValidationUIManager> {
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        Scope scope = (Scope) obj;
        return new OndcTicketProductValidationUIManager((ProductValidationCommonUIManager) scope.d(i71.k(scope, "$this$factory", (ParametersHolder) obj2, "it", ProductValidationCommonUIManager.class), null, null));
    }
}
