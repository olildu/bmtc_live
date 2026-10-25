package app.chalo.utils;

import defpackage.vo1;
import defpackage.z20;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import kotlin.text.StringsKt;
import org.npci.upi.security.pinactivitycomponent.CLConstants;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/utils/FareUtils;", "", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class FareUtils {
    public static String a(String amount) {
        Intrinsics.i(amount, "amount");
        List listU = StringsKt.U(amount, new String[]{CLConstants.DOT_SALT_DELIMETER}, 6);
        String str = (String) listU.get(0);
        String str2 = listU.size() > 1 ? (String) listU.get(1) : "";
        Intrinsics.i(str, "<this>");
        String strJ = new Regex("(\\d{2})(?=\\d)(?<=\\d{3})").j(new StringBuilder((CharSequence) str).reverse().toString(), new z20(4));
        Intrinsics.i(strJ, "<this>");
        String string = new StringBuilder((CharSequence) strJ).reverse().toString();
        return str2.length() > 0 ? vo1.n(string, CLConstants.DOT_SALT_DELIMETER, str2) : string;
    }
}
