package app.chalo.utils;

import androidx.webkit.ProxyConfig;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/utils/CardNumberMaskingHelper;", "", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class CardNumberMaskingHelper {
    public static String a(String cardNo) {
        Intrinsics.i(cardNo, "cardNo");
        if (cardNo.length() < 5) {
            return cardNo;
        }
        StringBuilder sb = new StringBuilder();
        int i = 2;
        sb.append(cardNo.subSequence(0, 2));
        int length = cardNo.length() - 3;
        if (2 <= length) {
            while (true) {
                sb.append(ProxyConfig.MATCH_ALL_SCHEMES);
                if (i % 4 == 3) {
                    sb.append("  ");
                }
                if (i == length) {
                    break;
                }
                i++;
            }
        }
        sb.append(cardNo.subSequence(cardNo.length() - 4, cardNo.length()));
        String string = sb.toString();
        Intrinsics.h(string, "toString(...)");
        return string;
    }
}
