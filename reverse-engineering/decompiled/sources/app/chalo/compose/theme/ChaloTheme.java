package app.chalo.compose.theme;

import androidx.compose.material3.Typography;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/compose/theme/ChaloTheme;", "", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class ChaloTheme {
    public static ChaloColor a(Composer composer, int i) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-523121794, i, -1, "app.chalo.compose.theme.ChaloTheme.<get-color> (ChaloTheme.kt:45)");
        }
        ChaloColor chaloColor = (ChaloColor) composer.consume(ChaloThemeKt.b);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return chaloColor;
    }

    public static ChaloDimens b(Composer composer, int i) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-907248185, i, -1, "app.chalo.compose.theme.ChaloTheme.<get-dimens> (ChaloTheme.kt:57)");
        }
        ChaloDimens chaloDimens = (ChaloDimens) composer.consume(ChaloThemeKt.e);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return chaloDimens;
    }

    public static ChaloElevation c(Composer composer, int i) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1456439368, i, -1, "app.chalo.compose.theme.ChaloTheme.<get-elevation> (ChaloTheme.kt:49)");
        }
        ChaloElevation chaloElevation = (ChaloElevation) composer.consume(ChaloThemeKt.c);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return chaloElevation;
    }

    public static ChaloShape d(Composer composer, int i) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1287618436, i, -1, "app.chalo.compose.theme.ChaloTheme.<get-shape> (ChaloTheme.kt:53)");
        }
        ChaloShape chaloShape = (ChaloShape) composer.consume(ChaloThemeKt.d);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return chaloShape;
    }

    public static Typography e(Composer composer, int i) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(421564263, i, -1, "app.chalo.compose.theme.ChaloTheme.<get-typography> (ChaloTheme.kt:41)");
        }
        Typography typography = (Typography) composer.consume(ChaloThemeKt.f1921a);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return typography;
    }
}
