package app.chalo.ads;

import app.chalo.constants.Source;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/ads/UnifiedAdSlotSpecs;", "", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class UnifiedAdSlotSpecs {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final UnifiedAdSlotSpec f853a;
    public static final UnifiedAdSlotSpec b;
    public static final UnifiedAdSlotSpec c;
    public static final UnifiedAdSlotSpec d;
    public static final UnifiedAdSlotSpec e;
    public static final List f;
    public static final LinkedHashMap g;

    static {
        UnifiedAdBannerSize unifiedAdBannerSize = new UnifiedAdBannerSize();
        UnifiedAdHeightBehavior unifiedAdHeightBehavior = UnifiedAdHeightBehavior.FIXED;
        UnifiedAdMediaPolicy unifiedAdMediaPolicy = UnifiedAdMediaPolicy.OPTIONAL;
        UnifiedAdSecondaryContentPolicy unifiedAdSecondaryContentPolicy = UnifiedAdSecondaryContentPolicy.ALLOWED;
        UnifiedAdCtaTreatment unifiedAdCtaTreatment = UnifiedAdCtaTreatment.AFFORDANCE_SUFFIX;
        UnifiedAdLayoutContract unifiedAdLayoutContract = new UnifiedAdLayoutContract(unifiedAdHeightBehavior, unifiedAdMediaPolicy, unifiedAdSecondaryContentPolicy, unifiedAdCtaTreatment);
        UnifiedAdLayoutContract unifiedAdLayoutContract2 = new UnifiedAdLayoutContract(UnifiedAdHeightBehavior.ADAPTIVE, UnifiedAdMediaPolicy.RATIO_DRIVEN, unifiedAdSecondaryContentPolicy, UnifiedAdCtaTreatment.PLAIN);
        UnifiedAdLayoutContract unifiedAdLayoutContract3 = new UnifiedAdLayoutContract(unifiedAdHeightBehavior, UnifiedAdMediaPolicy.REQUIRED, UnifiedAdSecondaryContentPolicy.SUPPRESSED, unifiedAdCtaTreatment);
        UnifiedAdSlot unifiedAdSlot = UnifiedAdSlot.LIVE_TRACKING_ANCHORED;
        UnifiedAdHostMode unifiedAdHostMode = UnifiedAdHostMode.ANCHORED;
        Source source = Source.ROUTE_DETAILS;
        UnifiedAdVisualTreatment unifiedAdVisualTreatment = UnifiedAdVisualTreatment.SHORT_STRIP;
        UnifiedAdSlotSpec unifiedAdSlotSpec = new UnifiedAdSlotSpec(unifiedAdSlot, unifiedAdHostMode, source, "route details", unifiedAdVisualTreatment, unifiedAdLayoutContract, null);
        f853a = unifiedAdSlotSpec;
        UnifiedAdSlot unifiedAdSlot2 = UnifiedAdSlot.HOME_TAB_UNIFIED_INLINE;
        UnifiedAdHostMode unifiedAdHostMode2 = UnifiedAdHostMode.INLINE;
        Source source2 = Source.HOME_SCREEN_TAB;
        UnifiedAdVisualTreatment unifiedAdVisualTreatment2 = UnifiedAdVisualTreatment.ADAPTIVE;
        UnifiedAdSlotSpec unifiedAdSlotSpec2 = new UnifiedAdSlotSpec(unifiedAdSlot2, unifiedAdHostMode2, source2, "home screen", unifiedAdVisualTreatment2, unifiedAdLayoutContract2, unifiedAdBannerSize);
        b = unifiedAdSlotSpec2;
        UnifiedAdSlot unifiedAdSlot3 = UnifiedAdSlot.REGULAR_BUS_TAB_UNIFIED_INLINE;
        Source source3 = Source.REGULAR_BUS_SCREEN_TAB;
        String sourceName = source3.getSourceName();
        UnifiedAdVisualTreatment unifiedAdVisualTreatment3 = UnifiedAdVisualTreatment.MEDIUM_FIXED_HEIGHT;
        UnifiedAdSlotSpec unifiedAdSlotSpec3 = new UnifiedAdSlotSpec(unifiedAdSlot3, unifiedAdHostMode2, source3, sourceName, unifiedAdVisualTreatment3, unifiedAdLayoutContract3, unifiedAdBannerSize);
        UnifiedAdSlotSpec unifiedAdSlotSpec4 = new UnifiedAdSlotSpec(UnifiedAdSlot.REGULAR_BUS_INLINE_ADAPTIVE, unifiedAdHostMode2, source3, source3.getSourceName(), unifiedAdVisualTreatment2, unifiedAdLayoutContract2, unifiedAdBannerSize);
        UnifiedAdSlot unifiedAdSlot4 = UnifiedAdSlot.STOP_TRIP_DETAILS;
        Source source4 = Source.STOP_TRIP_DETAILS_SCREEN;
        UnifiedAdSlotSpec unifiedAdSlotSpec5 = new UnifiedAdSlotSpec(unifiedAdSlot4, unifiedAdHostMode, source4, source4.getSourceName(), unifiedAdVisualTreatment3, unifiedAdLayoutContract3, null);
        c = unifiedAdSlotSpec5;
        UnifiedAdSlotSpec unifiedAdSlotSpec6 = new UnifiedAdSlotSpec(UnifiedAdSlot.BUSES_AROUND_YOU_MEDIUM, unifiedAdHostMode, Source.HOME_SCREEN_MAP_FRAGMENT, "buses around you", unifiedAdVisualTreatment3, unifiedAdLayoutContract3, null);
        d = unifiedAdSlotSpec6;
        UnifiedAdSlot unifiedAdSlot5 = UnifiedAdSlot.TRIP_PLANNER_RESULTS;
        Source source5 = Source.TRIP_PLANNER;
        UnifiedAdSlotSpec unifiedAdSlotSpec7 = new UnifiedAdSlotSpec(unifiedAdSlot5, unifiedAdHostMode, source5, source5.getSourceName(), unifiedAdVisualTreatment, unifiedAdLayoutContract, null);
        e = unifiedAdSlotSpec7;
        List listS = CollectionsKt.S(unifiedAdSlotSpec, unifiedAdSlotSpec2, unifiedAdSlotSpec3, unifiedAdSlotSpec4, unifiedAdSlotSpec5, unifiedAdSlotSpec6, unifiedAdSlotSpec7);
        f = listS;
        List list = listS;
        int iG = MapsKt.g(CollectionsKt.v(list, 10));
        if (iG < 16) {
            iG = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(iG);
        for (Object obj : list) {
            linkedHashMap.put(((UnifiedAdSlotSpec) obj).f852a, obj);
        }
        g = linkedHashMap;
    }
}
