package app.chalo.premiumbus.prebookedtickets.validation;

import app.chalo.contract.NavigationContract;
import app.chalo.contract.ProductTypeForReceipt;
import app.chalo.scenes.ChaloNavigationManager;
import app.chalo.scenes.ChaloNavigationManagerKt;
import app.chalo.scenes.PopUpToConfig;
import app.chalo.scenes.args.SceneArgs;
import app.chalo.validationsdk.blevalidation.config.ProductValidationNavigationManager;
import app.chalo.validationsdk.blevalidation.data.models.ProductValidationData;
import app.chalo.validationsdk.legacy.Product;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lapp/chalo/premiumbus/prebookedtickets/validation/PremiumReserveTicketValidationNavigationManager;", "Lapp/chalo/validationsdk/blevalidation/config/ProductValidationNavigationManager;", "Lapp/chalo/contract/NavigationContract;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class PremiumReserveTicketValidationNavigationManager implements ProductValidationNavigationManager, NavigationContract {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ NavigationContract f7486a;
    public final ChaloNavigationManager b;

    public PremiumReserveTicketValidationNavigationManager(NavigationContract navigationContract, ChaloNavigationManager chaloNavigationManager) {
        this.f7486a = navigationContract;
        this.b = chaloNavigationManager;
    }

    @Override // app.chalo.contract.NavigationContract
    public final SceneArgs a(String source, String productId, String str, ProductTypeForReceipt productTypeForReceipt) {
        Intrinsics.i(source, "source");
        Intrinsics.i(productId, "productId");
        Intrinsics.i(productTypeForReceipt, "productTypeForReceipt");
        return this.f7486a.a(source, productId, str, productTypeForReceipt);
    }

    @Override // app.chalo.contract.NavigationContract
    public final void b(String source, String bookingId, String str, String str2, String str3, PopUpToConfig popUpToConfig) {
        Intrinsics.i(source, "source");
        Intrinsics.i(bookingId, "bookingId");
        this.f7486a.b(source, bookingId, str, str2, str3, popUpToConfig);
    }

    @Override // app.chalo.contract.NavigationContract
    public final void c(SceneArgs sceneArgs) {
        this.f7486a.c(sceneArgs);
    }

    @Override // app.chalo.validationsdk.blevalidation.config.ProductValidationNavigationManager
    public final Object d(ProductValidationData productValidationData, String str, String str2, Long l, boolean z, Continuation continuation) {
        SceneArgs sceneArgsA = NavigationContract.DefaultImpls.a(this, str, productValidationData.getId(), null, ProductTypeForReceipt.PREMIUM_RESERVE_TICKET, 52);
        Unit unit = Unit.f17538a;
        if (sceneArgsA == null) {
            return unit;
        }
        if (z) {
            this.f7486a.c(sceneArgsA);
            return unit;
        }
        ChaloNavigationManagerKt.e(this.b, sceneArgsA, null, 6);
        return unit;
    }

    @Override // app.chalo.validationsdk.blevalidation.config.ProductValidationNavigationManager
    public final Object e(Product product, String str, PopUpToConfig.Finish finish, Continuation continuation) {
        NavigationContract.DefaultImpls.b(this, str, product.f10666a, null, "mobileTicket", "premiumReserveTicket", null, 228);
        return Unit.f17538a;
    }
}
