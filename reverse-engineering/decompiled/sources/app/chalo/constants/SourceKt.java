package app.chalo.constants;

import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"chalo-base_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class SourceKt {
    public static final Source a(String str) {
        Source next;
        Intrinsics.i(str, "<this>");
        Iterator<Source> it = Source.getEntries().iterator();
        while (it.hasNext()) {
            next = it.next();
            if (Intrinsics.d(next.getSourceName(), str)) {
                return next;
            }
        }
        next = null;
        return next;
    }
}
