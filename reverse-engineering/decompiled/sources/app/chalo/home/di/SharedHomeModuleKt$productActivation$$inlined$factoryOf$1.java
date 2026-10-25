package app.chalo.home.di;

import app.chalo.home.contract.ProductReceiptContractImpl;
import app.chalo.instantticket.validation.InstantTicketReceiptManager;
import app.chalo.metro.validation.MetroTicketReceiptManager;
import app.chalo.ncmc.cardreceipt.ChaloCardReceiptManager;
import app.chalo.ondc.validation.OndcTicketReceiptManager;
import app.chalo.ondc.validation.metro.OndcMetroTicketReceiptManager;
import app.chalo.premiumbus.prebookedtickets.validation.PremiumReserveTicketReceiptManager;
import app.chalo.quickpay.validation.manager.QuickPayReceiptManager;
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
public final class SharedHomeModuleKt$productActivation$$inlined$factoryOf$1 implements Function2<Scope, ParametersHolder, ProductReceiptContractImpl> {
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) throws ClosedScopeException {
        Scope scope = (Scope) obj;
        Object objD = scope.d(i71.k(scope, "$this$factory", (ParametersHolder) obj2, "it", InstantTicketReceiptManager.class), null, null);
        Object objD2 = scope.d(Reflection.a(QuickPayReceiptManager.class), null, null);
        Object objD3 = scope.d(Reflection.a(ChaloCardReceiptManager.class), null, null);
        Object objD4 = scope.d(Reflection.a(PremiumReserveTicketReceiptManager.class), null, null);
        Object objD5 = scope.d(Reflection.a(OndcTicketReceiptManager.class), null, null);
        return new ProductReceiptContractImpl((InstantTicketReceiptManager) objD, (QuickPayReceiptManager) objD2, (ChaloCardReceiptManager) objD3, (PremiumReserveTicketReceiptManager) objD4, (OndcTicketReceiptManager) objD5, (OndcMetroTicketReceiptManager) scope.d(Reflection.a(OndcMetroTicketReceiptManager.class), null, null), (MetroTicketReceiptManager) scope.d(Reflection.a(MetroTicketReceiptManager.class), null, null));
    }
}
