package app.chalo.compose.components;

import app.chalo.uistate.base.ChaloColorToken;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/compose/components/ChaloRouteTagsPalette;", "", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class ChaloRouteTagsPalette {
    public static ChaloColorToken a(String str) {
        String lowerCase = str.toLowerCase(Locale.ROOT);
        Intrinsics.h(lowerCase, "toLowerCase(...)");
        if (lowerCase.equals("ac")) {
            return ChaloColorToken.AcGreen.f9754a;
        }
        return lowerCase.equals("best") ? ChaloColorToken.Gray85.f9798a : ChaloColorToken.SpecialFeatureTagBackgroundColor.f9856a;
    }

    public static ChaloColorToken b(String tag) {
        Intrinsics.i(tag, "tag");
        String lowerCase = tag.toLowerCase(Locale.ROOT);
        Intrinsics.h(lowerCase, "toLowerCase(...)");
        return (!lowerCase.equals("ac") && lowerCase.equals("best")) ? ChaloColorToken.Black_87.f9768a : ChaloColorToken.Black.f9759a;
    }
}
