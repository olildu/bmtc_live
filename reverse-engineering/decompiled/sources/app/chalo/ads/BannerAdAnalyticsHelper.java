package app.chalo.ads;

import app.chalo.analytics.AnalyticsContractImplKt;
import app.chalo.analytics.contract.AnalyticsContract;
import app.chalo.constants.Source;
import in.juspay.hypersdk.analytics.LogConstants;
import in.juspay.hypersdk.core.PaymentConstants;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Reflection;
import org.koin.core.Koin;
import org.koin.core.component.KoinComponent;
import org.koin.core.component.KoinScopeComponent;
import org.koin.core.context.GlobalContext;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/ads/BannerAdAnalyticsHelper;", "Lorg/koin/core/component/KoinComponent;", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
final class BannerAdAnalyticsHelper implements KoinComponent {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f747a = LazyKt.a(LazyThreadSafetyMode.SYNCHRONIZED, new Function0<AnalyticsContract>() { // from class: app.chalo.ads.BannerAdAnalyticsHelper$special$$inlined$inject$default$1
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            KoinComponent koinComponent = this;
            return (koinComponent instanceof KoinScopeComponent ? ((KoinScopeComponent) koinComponent).getF18836a() : GlobalContext.f18817a.a().c.d).d(Reflection.a(AnalyticsContract.class), null, null);
        }
    });

    @Override // org.koin.core.component.KoinComponent
    public final Koin L() {
        return GlobalContext.f18817a.a();
    }

    /* JADX WARN: Type inference failed for: r15v1, types: [java.lang.Object, kotlin.Lazy] */
    public final void a(String str, BannerAdAnalyticsMetadata bannerAdAnalyticsMetadata, Map map) {
        Source source;
        Pair pair = new Pair("adUnitId", bannerAdAnalyticsMetadata.f749a);
        Pair pair2 = new Pair("placement", LogConstants.DEFAULT_CHANNEL);
        BannerAdSlot bannerAdSlot = bannerAdAnalyticsMetadata.b;
        LinkedHashMap linkedHashMapK = MapsKt.k(pair, pair2, new Pair(PaymentConstants.Event.SCREEN, BannerAdSlotKt.a(bannerAdSlot)), new Pair("adSdk", "gam"), new Pair("adType", "banner"));
        linkedHashMapK.putAll(map);
        AnalyticsContract analyticsContract = (AnalyticsContract) this.f747a.getValue();
        int i = BannerAdSlotKt.WhenMappings.f750a[bannerAdSlot.ordinal()];
        if (i == 1) {
            source = Source.HOME_SCREEN_TAB;
        } else {
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            source = Source.REGULAR_BUS_SCREEN_TAB;
        }
        AnalyticsContractImplKt.b(analyticsContract, str, source, linkedHashMapK, false, 8);
    }
}
