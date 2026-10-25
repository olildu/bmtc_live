package app.chalo.premiumbus.navigation;

import app.chalo.constants.Source;
import app.chalo.models.productbooking.SuperPassPurchaseStopsInfo;
import app.chalo.navigation.ProductBookingNavigationManager;
import app.chalo.network.config.ChaloJson;
import app.chalo.premiumbus.data.models.app.PBOriginDestinationAppModel;
import app.chalo.scenes.ChaloNavigationManager;
import app.chalo.scenes.ChaloNavigationManagerKt;
import app.chalo.scenes.args.PassSelectionArgs;
import app.chalo.scenes.args.PostPassPurchaseSuccessFlowType;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.Json;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/premiumbus/navigation/ProductBookingNavigationManagerImpl;", "Lapp/chalo/navigation/ProductBookingNavigationManager;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class ProductBookingNavigationManagerImpl implements ProductBookingNavigationManager {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ChaloNavigationManager f7280a;

    public ProductBookingNavigationManagerImpl(ChaloNavigationManager chaloNavigationManager) {
        this.f7280a = chaloNavigationManager;
    }

    @Override // app.chalo.navigation.ProductBookingNavigationManager
    public final void a(Source source, String productId, PBOriginDestinationAppModel originDestinationInfo, Source previousSource, String str, boolean z) {
        Intrinsics.i(source, "source");
        Intrinsics.i(productId, "productId");
        Intrinsics.i(originDestinationInfo, "originDestinationInfo");
        Intrinsics.i(previousSource, "previousSource");
        PostPassPurchaseSuccessFlowType postPassPurchaseSuccessFlowType = PostPassPurchaseSuccessFlowType.PREMIUM_PASS_BOOKING_CONTINUE;
        Json json = ChaloJson.b;
        SuperPassPurchaseStopsInfo superPassPurchaseStopsInfo = new SuperPassPurchaseStopsInfo(originDestinationInfo.d, originDestinationInfo.c, originDestinationInfo.i, originDestinationInfo.h, str);
        json.getClass();
        ChaloNavigationManagerKt.e(this.f7280a, new PassSelectionArgs(productId, source, previousSource, json.a(SuperPassPurchaseStopsInfo.INSTANCE.serializer(), superPassPurchaseStopsInfo), postPassPurchaseSuccessFlowType, z), null, 6);
    }

    @Override // app.chalo.navigation.ProductBookingNavigationManager
    public final void b(Source source, String productId) {
        Intrinsics.i(productId, "productId");
        Intrinsics.i(source, "source");
        ChaloNavigationManagerKt.e(this.f7280a, new PassSelectionArgs(productId, source, (Source) null, (String) null, PostPassPurchaseSuccessFlowType.ACTIVATION, 36), null, 6);
    }
}
