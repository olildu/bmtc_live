package app.chalo.ads;

import defpackage.vo1;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"chalo-base_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class UnifiedAdSlotSpecKt {
    public static final UnifiedAdSlotSpec a(UnifiedAdSlot unifiedAdSlot) {
        Intrinsics.i(unifiedAdSlot, "<this>");
        Object obj = UnifiedAdSlotSpecs.g.get(unifiedAdSlot);
        if (obj != null) {
            return (UnifiedAdSlotSpec) obj;
        }
        throw new IllegalArgumentException(vo1.m("Missing unified ad slot spec for ", unifiedAdSlot.name()).toString());
    }
}
