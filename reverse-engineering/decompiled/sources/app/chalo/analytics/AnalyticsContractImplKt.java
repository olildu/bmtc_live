package app.chalo.analytics;

import app.chalo.analytics.contract.AnalyticsContract;
import app.chalo.analytics.events.AnalyticsFrequency;
import app.chalo.constants.Source;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"chalo-base_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class AnalyticsContractImplKt {
    public static void a(AnalyticsContract analyticsContract, String str, Source source, Source previousScreenSource, Map map, int i) {
        if ((i & 8) != 0) {
            map = null;
        }
        AnalyticsFrequency analyticsFrequency = (i & 16) != 0 ? AnalyticsFrequency.Always.b : AnalyticsFrequency.Once.b;
        Intrinsics.i(analyticsContract, "<this>");
        Intrinsics.i(source, "source");
        Intrinsics.i(previousScreenSource, "previousScreenSource");
        LinkedHashMap linkedHashMapU = map != null ? MapsKt.u(map) : new LinkedHashMap();
        linkedHashMapU.put("previousScreen", previousScreenSource.getSourceName());
        analyticsContract.e(str, source.getSourceName(), linkedHashMapU, analyticsFrequency, true);
    }

    public static void b(AnalyticsContract analyticsContract, String name, Source source, Map map, boolean z, int i) {
        if ((i & 4) != 0) {
            map = null;
        }
        Map map2 = map;
        AnalyticsFrequency analyticsFrequency = (i & 8) != 0 ? AnalyticsFrequency.Always.b : AnalyticsFrequency.Daily.b;
        if ((i & 16) != 0) {
            z = true;
        }
        Intrinsics.i(analyticsContract, "<this>");
        Intrinsics.i(name, "name");
        Intrinsics.i(source, "source");
        analyticsContract.e(name, source.getSourceName(), map2, analyticsFrequency, z);
    }
}
