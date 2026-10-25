package app.chalo.home.ui.chalobus;

import defpackage.vo1;
import java.text.NumberFormat;
import java.util.Arrays;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"home_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class ChaloBusScreenHeaderLayout_androidKt {
    public static final String a(int i, String currencySymbol) {
        Intrinsics.i(currencySymbol, "currencySymbol");
        float f = i;
        double d = f;
        if (d >= 100000.0d) {
            return currencySymbol.concat(String.format(Locale.US, "%.1f lakh", Arrays.copyOf(new Object[]{Float.valueOf(f / 100000.0f)}, 1)));
        }
        return d >= 1000.0d ? currencySymbol.concat(String.format(Locale.US, "%.1fK", Arrays.copyOf(new Object[]{Float.valueOf(f / 1000.0f)}, 1))) : vo1.A(currencySymbol, NumberFormat.getIntegerInstance(Locale.US).format(Integer.valueOf(i)));
    }
}
