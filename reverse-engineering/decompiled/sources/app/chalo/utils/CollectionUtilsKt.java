package app.chalo.utils;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.collections.EmptyList;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"chalo-base_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class CollectionUtilsKt {
    public static final Map a(Map map) {
        Intrinsics.i(map, "<this>");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry entry : map.entrySet()) {
            Object key = entry.getKey();
            Object value = entry.getValue();
            if (key != null && value != null) {
                linkedHashMap.put(key, value);
            }
        }
        return MapsKt.r(linkedHashMap);
    }

    public static final List b(int i, List list) {
        Intrinsics.i(list, "<this>");
        if (i < 0) {
            return EmptyList.f17557a;
        }
        return list.size() > i ? list.subList(0, i) : list;
    }

    public static final LinkedHashMap c(Map map) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry entry : CollectionsKt.v0(new CollectionUtilsKt$toSortedMap$$inlined$sortedBy$1(), map.entrySet())) {
            linkedHashMap.put(entry.getKey(), entry.getValue());
        }
        return linkedHashMap;
    }
}
