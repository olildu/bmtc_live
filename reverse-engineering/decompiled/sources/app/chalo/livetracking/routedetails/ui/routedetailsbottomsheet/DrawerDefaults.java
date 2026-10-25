package app.chalo.livetracking.routedetails.ui.routedetailsbottomsheet;

import androidx.compose.material3.MaterialTheme;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.unit.Dp;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/livetracking/routedetails/ui/routedetailsbottomsheet/DrawerDefaults;", "", "livetracking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class DrawerDefaults {
    static {
        Dp.m7278constructorimpl(16);
    }

    public static long a(Composer composer) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(646359307, 6, -1, "app.chalo.livetracking.routedetails.ui.routedetailsbottomsheet.DrawerDefaults.<get-scrimColor> (Drawer.kt:598)");
        }
        long jM4604copywmQWz5c$default = Color.m4604copywmQWz5c$default(MaterialTheme.INSTANCE.getColorScheme(composer, MaterialTheme.$stable).getOnSurface(), 0.32f, 0.0f, 0.0f, 0.0f, 14, null);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return jM4604copywmQWz5c$default;
    }
}
