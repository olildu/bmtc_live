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
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/ads/NativeInlineAdAnalyticsHelper;", "Lorg/koin/core/component/KoinComponent;", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
final class NativeInlineAdAnalyticsHelper implements KoinComponent {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f804a = LazyKt.a(LazyThreadSafetyMode.SYNCHRONIZED, new Function0<AnalyticsContract>() { // from class: app.chalo.ads.NativeInlineAdAnalyticsHelper$special$$inlined$inject$default$1
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            KoinComponent koinComponent = this;
            return (koinComponent instanceof KoinScopeComponent ? ((KoinScopeComponent) koinComponent).getF18811a() : GlobalContext.f18817a.a().c.d).d(Reflection.a(AnalyticsContract.class), null, null);
        }
    });

    @Override // org.koin.core.component.KoinComponent
    public final Koin L() {
        return GlobalContext.f18817a.a();
    }

    /* JADX WARN: Type inference failed for: r4v6, types: [java.lang.Object, kotlin.Lazy] */
    public final void a(String str, NativeInlineAdAnalyticsMetadata nativeInlineAdAnalyticsMetadata, Map map) {
        Source source;
        Pair pair = new Pair("adUnitId", nativeInlineAdAnalyticsMetadata.f806a);
        Pair pair2 = new Pair("placement", LogConstants.DEFAULT_CHANNEL);
        Pair pair3 = new Pair("hasVideo", Boolean.valueOf(nativeInlineAdAnalyticsMetadata.c));
        Pair pair4 = new Pair("nativeAdLoadSource", nativeInlineAdAnalyticsMetadata.d);
        Pair pair5 = new Pair("nativeAdAspectRatio", Float.valueOf(nativeInlineAdAnalyticsMetadata.f));
        NativeInlineAdSlot nativeInlineAdSlot = nativeInlineAdAnalyticsMetadata.b;
        LinkedHashMap linkedHashMapK = MapsKt.k(pair, pair2, pair3, pair4, pair5, new Pair(PaymentConstants.Event.SCREEN, NativeInlineAdSlotKt.a(nativeInlineAdSlot)), new Pair("adSdk", "gam"), new Pair("adType", "native"));
        linkedHashMapK.putAll(map);
        AnalyticsContract analyticsContract = (AnalyticsContract) this.f804a.getValue();
        int i = NativeInlineAdKt.WhenMappings.b[nativeInlineAdSlot.ordinal()];
        if (i == 1) {
            source = Source.ROUTE_DETAILS;
        } else {
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            source = Source.CHECKOUT_PAYMENT_ACTIVITY;
        }
        AnalyticsContractImplKt.b(analyticsContract, str, source, linkedHashMapK, false, 8);
    }
}
