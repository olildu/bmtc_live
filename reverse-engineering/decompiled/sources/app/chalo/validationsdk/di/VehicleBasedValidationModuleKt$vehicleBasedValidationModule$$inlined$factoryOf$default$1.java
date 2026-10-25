package app.chalo.validationsdk.di;

import app.chalo.contract.ProductBookingHelper;
import app.chalo.validationsdk.vehiclebasedvalidation.data.repository.VehicleBasedValidationRepository;
import app.chalo.validationsdk.vehiclebasedvalidation.domain.ValidateONDCTicketAndFetchReceiptUseCase;
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
public final class VehicleBasedValidationModuleKt$vehicleBasedValidationModule$$inlined$factoryOf$default$1 implements Function2<Scope, ParametersHolder, ValidateONDCTicketAndFetchReceiptUseCase> {
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) throws ClosedScopeException {
        Scope scope = (Scope) obj;
        return new ValidateONDCTicketAndFetchReceiptUseCase((VehicleBasedValidationRepository) scope.d(i71.k(scope, "$this$factory", (ParametersHolder) obj2, "it", VehicleBasedValidationRepository.class), null, null), (ProductBookingHelper) scope.d(Reflection.a(ProductBookingHelper.class), null, null));
    }
}
