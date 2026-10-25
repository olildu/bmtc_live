package app.chalo.ads;

import androidx.exifinterface.media.ExifInterface;
import defpackage.f1;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.collections.CollectionsKt;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\b\u0007\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u0001*\b\b\u0001\u0010\u0003*\u00020\u00012\u00020\u0001:\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/ads/AdPrefetchStore;", "", "K", ExifInterface.GPS_MEASUREMENT_INTERRUPTED, "EvictionReason", "Entry", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class AdPrefetchStore<K, V> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b f718a;
    public final Function0 b;
    public final LinkedHashMap c;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\b\u0082\b\u0018\u0000*\u0004\b\u0002\u0010\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lapp/chalo/ads/AdPrefetchStore$Entry;", ExifInterface.GPS_MEASUREMENT_INTERRUPTED, "", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Entry<V> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Object f719a;
        public final long b;

        public Entry(Object obj, long j) {
            this.f719a = obj;
            this.b = j;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Entry)) {
                return false;
            }
            Entry entry = (Entry) obj;
            return Intrinsics.d(this.f719a, entry.f719a) && this.b == entry.b;
        }

        public final int hashCode() {
            Object obj = this.f719a;
            int iHashCode = obj == null ? 0 : obj.hashCode();
            long j = this.b;
            return (iHashCode * 31) + ((int) (j ^ (j >>> 32)));
        }

        public final String toString() {
            return "Entry(value=" + this.f719a + ", storedAtMillis=" + this.b + ")";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"Lapp/chalo/ads/AdPrefetchStore$EvictionReason;", "", "<init>", "(Ljava/lang/String;I)V", "Replaced", "Expired", "Capacity", "Clear", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public enum EvictionReason {
        Replaced,
        Expired,
        Capacity,
        Clear;

        private static final /* synthetic */ EnumEntries $ENTRIES = EnumEntriesKt.a(values());

        public static EnumEntries<EvictionReason> getEntries() {
            return $ENTRIES;
        }
    }

    public AdPrefetchStore(b bVar) {
        f1 f1Var = new f1(3);
        this.f718a = bVar;
        this.b = f1Var;
        this.c = new LinkedHashMap();
    }

    public static Object a(AdPrefetchStore adPrefetchStore, Object obj) {
        long jLongValue = ((Number) adPrefetchStore.b.invoke()).longValue();
        adPrefetchStore.getClass();
        adPrefetchStore.b(jLongValue);
        Entry entry = (Entry) adPrefetchStore.c.remove(obj);
        if (entry != null) {
            return entry.f719a;
        }
        return null;
    }

    public final void b(long j) {
        LinkedHashMap linkedHashMap = this.c;
        if (linkedHashMap.isEmpty()) {
            return;
        }
        Iterator<Map.Entry<K, V>> it = linkedHashMap.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry<K, V> next = it.next();
            Intrinsics.h(next, "next(...)");
            Map.Entry<K, V> entry = next;
            if (j - ((Entry) entry.getValue()).b >= 300000) {
                it.remove();
                try {
                    b bVar = this.f718a;
                    K key = entry.getKey();
                    Intrinsics.h(key, "<get-key>(...)");
                    bVar.invoke(key, ((Entry) entry.getValue()).f719a, EvictionReason.Expired);
                } catch (Throwable th) {
                    ResultKt.a(th);
                }
            }
        }
    }

    public final void c(long j, Object key, Object value) {
        Object key2;
        Entry entry;
        Intrinsics.i(key, "key");
        Intrinsics.i(value, "value");
        b(j);
        LinkedHashMap linkedHashMap = this.c;
        Entry entry2 = (Entry) linkedHashMap.remove(key);
        b bVar = this.f718a;
        if (entry2 != null) {
            try {
                bVar.invoke(key, entry2.f719a, EvictionReason.Replaced);
            } catch (Throwable th) {
                ResultKt.a(th);
            }
        }
        linkedHashMap.put(key, new Entry(value, j));
        while (linkedHashMap.size() > 2) {
            Set<Map.Entry<K, V>> setEntrySet = linkedHashMap.entrySet();
            Intrinsics.h(setEntrySet, "<get-entries>(...)");
            Map.Entry entry3 = (Map.Entry) CollectionsKt.G(setEntrySet);
            if (entry3 == null || (key2 = entry3.getKey()) == null || (entry = (Entry) linkedHashMap.remove(key2)) == null) {
                return;
            }
            try {
                bVar.invoke(key2, entry.f719a, EvictionReason.Capacity);
            } catch (Throwable th2) {
                ResultKt.a(th2);
            }
        }
    }
}
