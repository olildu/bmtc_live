package app.chalo.home.di;

import app.chalo.ondc.domain.FetchOndcMetroTicketUseCase;
import app.chalo.ondc.domain.GetOndcMetroTicketAppModelFromApiUseCase;
import app.chalo.ondc.validation.metro.OndcMetroTicketReceiptManager;
import app.chalo.ondc.validation.metro.OndcMetroTicketUserDetailsForProducts;
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
public final class SharedHomeModuleKt$productActivation$$inlined$factoryOf$default$7 implements Function2<Scope, ParametersHolder, OndcMetroTicketReceiptManager> {
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) throws ClosedScopeException {
        Scope scope = (Scope) obj;
        Object objD = scope.d(i71.k(scope, "$this$factory", (ParametersHolder) obj2, "it", FetchOndcMetroTicketUseCase.class), null, null);
        return new OndcMetroTicketReceiptManager((FetchOndcMetroTicketUseCase) objD, (GetOndcMetroTicketAppModelFromApiUseCase) scope.d(Reflection.a(GetOndcMetroTicketAppModelFromApiUseCase.class), null, null), (OndcMetroTicketUserDetailsForProducts) scope.d(Reflection.a(OndcMetroTicketUserDetailsForProducts.class), null, null));
    }
}
