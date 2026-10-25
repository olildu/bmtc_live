package app.chalo.extensions;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"chalo-base_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class ThrowableExtKt {
    public static final String a(List list) {
        Intrinsics.i(list, "<this>");
        StringBuilder sb = new StringBuilder("");
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Throwable th = (Throwable) it.next();
            sb.append(Reflection.a(th.getClass()).f());
            sb.append(" ");
            sb.append(th.getMessage());
            sb.append(" : ");
        }
        String string = sb.toString();
        Intrinsics.h(string, "toString(...)");
        return string;
    }

    public static final List b(Throwable th) {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        while (th != null && linkedHashSet.add(th)) {
            th = th.getCause();
        }
        return CollectionsKt.D0(linkedHashSet);
    }
}
