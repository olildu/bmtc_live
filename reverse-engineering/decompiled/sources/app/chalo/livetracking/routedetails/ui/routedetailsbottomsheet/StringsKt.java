package app.chalo.livetracking.routedetails.ui.routedetailsbottomsheet;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import app.chalo.compose.resources.StringResourcesHelperKt;
import app.chalo.providers.stringprovider.StringEnum;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"livetracking_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class StringsKt {
    public static final String a(Composer composer, int i) {
        String strC;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1173347655, 6, -1, "app.chalo.livetracking.routedetails.ui.routedetailsbottomsheet.getString (Strings.kt:38)");
        }
        if (i == 0) {
            composer.startReplaceGroup(-1989299087);
            strC = StringResourcesHelperKt.c(StringEnum.NAVIGATION_MENU, new Object[0], composer, 6);
            composer.endReplaceGroup();
        } else if (i == 1) {
            composer.startReplaceGroup(-1989296722);
            strC = StringResourcesHelperKt.c(StringEnum.CLOSE_DRAWER, new Object[0], composer, 6);
            composer.endReplaceGroup();
        } else if (i == 2) {
            composer.startReplaceGroup(-1989294483);
            strC = StringResourcesHelperKt.c(StringEnum.CLOSE_SHEET, new Object[0], composer, 6);
            composer.endReplaceGroup();
        } else if (i == 3) {
            composer.startReplaceGroup(-1989291977);
            strC = StringResourcesHelperKt.c(StringEnum.DEFAULT_ERROR_MESSAGE, new Object[0], composer, 6);
            composer.endReplaceGroup();
        } else if (i == 4) {
            composer.startReplaceGroup(-1989289169);
            strC = StringResourcesHelperKt.c(StringEnum.DROPDOWN_MENU, new Object[0], composer, 6);
            composer.endReplaceGroup();
        } else if (i == 5) {
            composer.startReplaceGroup(-1989286707);
            strC = StringResourcesHelperKt.c(StringEnum.RANGE_START, new Object[0], composer, 6);
            composer.endReplaceGroup();
        } else if (i == 6) {
            composer.startReplaceGroup(-1989284373);
            strC = StringResourcesHelperKt.c(StringEnum.RANGE_END, new Object[0], composer, 6);
            composer.endReplaceGroup();
        } else {
            composer.startReplaceGroup(-1538221897);
            composer.endReplaceGroup();
            strC = "";
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return strC;
    }
}
