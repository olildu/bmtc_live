package app.chalo.productbooking.di;

import app.chalo.premiumbus.domain.GetAvailableSlotsForODPairsPaginatedUseCase;
import app.chalo.premiumbus.domain.SlotSelectionSectionInfoManager;
import app.chalo.providers.stringprovider.StringProvider;
import app.chalo.usecase.CheckIsTimestampForTodayUseCase;
import app.chalo.usecase.FormatTimeInMillisToGivenFormatUseCase;
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
public final class SharedProductBookingModuleKt$premiumBus$$inlined$factoryOf$default$7 implements Function2<Scope, ParametersHolder, SlotSelectionSectionInfoManager> {
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) throws ClosedScopeException {
        Scope scope = (Scope) obj;
        Object objD = scope.d(i71.k(scope, "$this$factory", (ParametersHolder) obj2, "it", GetAvailableSlotsForODPairsPaginatedUseCase.class), null, null);
        Object objD2 = scope.d(Reflection.a(CheckIsTimestampForTodayUseCase.class), null, null);
        return new SlotSelectionSectionInfoManager((GetAvailableSlotsForODPairsPaginatedUseCase) objD, (CheckIsTimestampForTodayUseCase) objD2, (StringProvider) scope.d(Reflection.a(StringProvider.class), null, null), (FormatTimeInMillisToGivenFormatUseCase) scope.d(Reflection.a(FormatTimeInMillisToGivenFormatUseCase.class), null, null));
    }
}
