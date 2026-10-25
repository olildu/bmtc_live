package app.chalo.ads;

import in.juspay.hypersdk.analytics.LogConstants;
import in.juspay.hypersdk.core.PaymentConstants;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import org.koin.core.Koin;
import org.koin.core.component.KoinComponent;
import org.koin.core.context.GlobalContext;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/ads/AdsterFixedBannerAnalyticsHelper;", "Lorg/koin/core/component/KoinComponent;", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
final class AdsterFixedBannerAnalyticsHelper implements KoinComponent {
    public static void b(String str, BannerAdSlot bannerAdSlot, Map map) {
        MapsKt.k(new Pair("adUnitId", str), new Pair("placement", LogConstants.DEFAULT_CHANNEL), new Pair(PaymentConstants.Event.SCREEN, BannerAdSlotKt.a(bannerAdSlot)), new Pair("adSdk", "adster"), new Pair("adType", "banner")).putAll(map);
        throw null;
    }

    public static /* synthetic */ void c(AdsterFixedBannerAnalyticsHelper adsterFixedBannerAnalyticsHelper, String str, BannerAdSlot bannerAdSlot) {
        Map mapD = MapsKt.d();
        adsterFixedBannerAnalyticsHelper.getClass();
        b(str, bannerAdSlot, mapD);
        throw null;
    }

    @Override // org.koin.core.component.KoinComponent
    public final Koin L() {
        return GlobalContext.f18817a.a();
    }

    public final void a(String adUnitId, BannerAdSlot slot, int i, String errorMessage) {
        Intrinsics.i(adUnitId, "adUnitId");
        Intrinsics.i(slot, "slot");
        Intrinsics.i(errorMessage, "errorMessage");
        b(adUnitId, slot, MapsKt.i(new Pair("errorCode", Integer.valueOf(i)), new Pair("errorMessage", errorMessage)));
        throw null;
    }
}
