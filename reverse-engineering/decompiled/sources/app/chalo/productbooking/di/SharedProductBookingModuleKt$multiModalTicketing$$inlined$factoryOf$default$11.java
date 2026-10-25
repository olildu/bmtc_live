package app.chalo.productbooking.di;

import app.chalo.multimodalticket.domain.CreateGroupTicketOrderUseCase;
import app.chalo.multimodalticket.domain.GetGroupTicketSummaryUseCase;
import app.chalo.multimodalticket.groupticketsummary.ui.GroupTicketSummaryComponent;
import app.chalo.multimodalticket.groupticketsummary.ui.uistate.GroupTicketSummaryUIStateFactory;
import app.chalo.providers.UserProfileDetailsProvider;
import app.chalo.providers.stringprovider.StringProvider;
import app.chalo.providers.toast.KotlinToastManager;
import app.chalo.scenes.ChaloNavigationManager;
import app.chalo.scenes.args.GroupTicketBookingSummaryArgs;
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
public final class SharedProductBookingModuleKt$multiModalTicketing$$inlined$factoryOf$default$11 implements Function2<Scope, ParametersHolder, GroupTicketSummaryComponent> {
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) throws ClosedScopeException {
        Scope scope = (Scope) obj;
        Object objD = scope.d(i71.k(scope, "$this$factory", (ParametersHolder) obj2, "it", ComponentContext.class), null, null);
        Object objD2 = scope.d(Reflection.a(GroupTicketBookingSummaryArgs.class), null, null);
        Object objD3 = scope.d(Reflection.a(GetGroupTicketSummaryUseCase.class), null, null);
        Object objD4 = scope.d(Reflection.a(CreateGroupTicketOrderUseCase.class), null, null);
        Object objD5 = scope.d(Reflection.a(GroupTicketSummaryUIStateFactory.class), null, null);
        Object objD6 = scope.d(Reflection.a(StringProvider.class), null, null);
        Object objD7 = scope.d(Reflection.a(KotlinToastManager.class), null, null);
        Object objD8 = scope.d(Reflection.a(ChaloNavigationManager.class), null, null);
        return new GroupTicketSummaryComponent((ComponentContext) objD, (GroupTicketBookingSummaryArgs) objD2, (GetGroupTicketSummaryUseCase) objD3, (CreateGroupTicketOrderUseCase) objD4, (GroupTicketSummaryUIStateFactory) objD5, (StringProvider) objD6, (KotlinToastManager) objD7, (ChaloNavigationManager) objD8, (UserProfileDetailsProvider) scope.d(Reflection.a(UserProfileDetailsProvider.class), null, null), (TimeUtilsContract) scope.d(Reflection.a(TimeUtilsContract.class), null, null));
    }
}
