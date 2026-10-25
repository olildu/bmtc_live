package app.chalo.extensions;

import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import kotlin.text.StringsKt;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"chalo-base_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class UtilityExtensionsKt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Regex f2619a = new Regex("^#(?:[0-9a-fA-F]{3}|[0-9a-fA-F]{6}|[0-9a-fA-F]{8})$");

    public static final String a(List list) {
        Intrinsics.i(list, "<this>");
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        Iterator it = list.iterator();
        while (it.hasNext()) {
            sb.append(it.next());
            sb.append(", ");
        }
        if (StringsKt.w(sb, ", ")) {
            sb.subSequence(0, sb.length() - 2);
        } else {
            sb.subSequence(0, sb.length());
        }
        sb.append("]");
        String string = sb.toString();
        Intrinsics.h(string, "toString(...)");
        return string;
    }
}
