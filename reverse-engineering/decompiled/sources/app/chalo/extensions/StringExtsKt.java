package app.chalo.extensions;

import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"chalo-base_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class StringExtsKt {
    public static final String a(String str) {
        Intrinsics.i(str, "<this>");
        if (str.length() <= 1) {
            String upperCase = str.toUpperCase(Locale.ROOT);
            Intrinsics.h(upperCase, "toUpperCase(...)");
            return upperCase;
        }
        String strSubstring = str.substring(0, 1);
        Intrinsics.h(strSubstring, "substring(...)");
        Locale locale = Locale.ROOT;
        String upperCase2 = strSubstring.toUpperCase(locale);
        Intrinsics.h(upperCase2, "toUpperCase(...)");
        String strSubstring2 = str.substring(1);
        Intrinsics.h(strSubstring2, "substring(...)");
        String lowerCase = strSubstring2.toLowerCase(locale);
        Intrinsics.h(lowerCase, "toLowerCase(...)");
        return upperCase2.concat(lowerCase);
    }

    public static final String b(String str, String resultIfNullOrEmpty) {
        Intrinsics.i(resultIfNullOrEmpty, "resultIfNullOrEmpty");
        return (str == null || str.length() == 0) ? resultIfNullOrEmpty : str;
    }
}
