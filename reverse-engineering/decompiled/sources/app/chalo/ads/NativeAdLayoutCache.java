package app.chalo.ads;

import defpackage.pk0;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"Lapp/chalo/ads/NativeAdLayoutCache;", "", "CachedSize", "Key", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class NativeAdLayoutCache {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final NativeAdLayoutCache f798a = new NativeAdLayoutCache();
    public static final LinkedHashMap b = new LinkedHashMap();

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/ads/NativeAdLayoutCache$CachedSize;", "", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class CachedSize {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f799a;
        public int b;

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof CachedSize)) {
                return false;
            }
            CachedSize cachedSize = (CachedSize) obj;
            return this.f799a == cachedSize.f799a && this.b == cachedSize.b;
        }

        public final int hashCode() {
            return (this.f799a * 31) + this.b;
        }

        public final String toString() {
            return pk0.f(this.f799a, this.b, "CachedSize(lastWidth=", ", lastHeight=", ")");
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/ads/NativeAdLayoutCache$Key;", "", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Key {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f800a;
        public final Map b;
        public final NativeMediaAspectRatioCategory c;
        public final List d;

        public Key(String adUnitId, Map targeting, NativeMediaAspectRatioCategory nativeMediaAspectRatioCategory) {
            Intrinsics.i(adUnitId, "adUnitId");
            Intrinsics.i(targeting, "targeting");
            this.f800a = adUnitId;
            this.b = targeting;
            this.c = nativeMediaAspectRatioCategory;
            Set<Map.Entry> setEntrySet = targeting.entrySet();
            ArrayList arrayList = new ArrayList(CollectionsKt.v(setEntrySet, 10));
            for (Map.Entry entry : setEntrySet) {
                String lowerCase = StringsKt.u0((String) entry.getKey()).toString().toLowerCase(Locale.ROOT);
                Intrinsics.h(lowerCase, "toLowerCase(...)");
                arrayList.add(new Pair(lowerCase, entry.getValue()));
            }
            this.d = CollectionsKt.v0(new NativeAdLayoutCache$Key$special$$inlined$sortedBy$1(), arrayList);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Key)) {
                return false;
            }
            Key key = (Key) obj;
            return Intrinsics.d(this.f800a, key.f800a) && Intrinsics.d(this.d, key.d) && this.c == key.c;
        }

        public final int hashCode() {
            return this.d.hashCode() + (this.f800a.hashCode() * 31);
        }

        public final String toString() {
            return "Key(adUnitId=" + this.f800a + ", targeting=" + this.b + ", aspectRatioCategory=" + this.c + ")";
        }
    }

    public final synchronized CachedSize a(Key key) {
        return (CachedSize) b.get(key);
    }

    public final synchronized void b(Key key, int i, int i2) {
        if (i <= 0 || i2 <= 0) {
            return;
        }
        CachedSize cachedSize = (CachedSize) b.get(key);
        if (cachedSize != null) {
            cachedSize.f799a = i;
            cachedSize.b = i2;
        }
    }
}
