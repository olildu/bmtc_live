package app.chalo.compose.theme;

import androidx.compose.material3.Typography;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.graphics.Shadow;
import androidx.compose.ui.graphics.drawscope.DrawStyle;
import androidx.compose.ui.text.PlatformTextStyle;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.Font;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontFamilyKt;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontSynthesis;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.intl.LocaleList;
import androidx.compose.ui.text.style.BaselineShift;
import androidx.compose.ui.text.style.LineHeightStyle;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.text.style.TextGeometricTransform;
import androidx.compose.ui.text.style.TextIndent;
import androidx.compose.ui.text.style.TextMotion;
import chalo_app_kmm.shared.chalo_base.generated.resources.Font0_commonMainKt;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.compose.resources.FontResource;
import org.jetbrains.compose.resources.FontResources_androidKt;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"chalo-base_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class ChaloTypographyKt {
    public static final TextStyle a(TextStyle textStyle) {
        Intrinsics.i(textStyle, "<this>");
        return TextStyle.m6753copyp1EtxEg$default(textStyle, 0L, 0L, FontWeight.INSTANCE.getBold(), null, null, null, null, 0L, null, null, null, 0L, null, null, null, 0, 0, 0L, null, null, null, 0, 0, null, 16777211, null);
    }

    public static final TextStyle b(Typography typography) {
        Intrinsics.i(typography, "<this>");
        return typography.getBodyLarge();
    }

    public static final TextStyle c(Typography typography) {
        Intrinsics.i(typography, "<this>");
        return typography.getBodyMedium();
    }

    public static final TextStyle d(Typography typography) {
        Intrinsics.i(typography, "<this>");
        return typography.getBodySmall();
    }

    public static final TextStyle e(Typography typography) {
        Intrinsics.i(typography, "<this>");
        return typography.getDisplayMedium();
    }

    public static final TextStyle f(Typography typography) {
        Intrinsics.i(typography, "<this>");
        return typography.getDisplaySmall();
    }

    public static final TextStyle g(Typography typography) {
        Intrinsics.i(typography, "<this>");
        return typography.getHeadlineMedium();
    }

    public static final TextStyle h(Typography typography) {
        Intrinsics.i(typography, "<this>");
        return typography.getHeadlineSmall();
    }

    public static final TextStyle i(Typography typography) {
        Intrinsics.i(typography, "<this>");
        return typography.getTitleLarge();
    }

    public static final TextStyle j(Typography typography) {
        Intrinsics.i(typography, "<this>");
        return typography.getLabelSmall();
    }

    public static final TextStyle k(Typography typography) {
        Intrinsics.i(typography, "<this>");
        return typography.getBodyLarge();
    }

    public static final TextStyle l(Typography typography) {
        Intrinsics.i(typography, "<this>");
        return typography.getBodyMedium();
    }

    public static final TextStyle m(FontWeight fontWeight, long j, Composer composer) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1230338063, 54, -1, "app.chalo.compose.theme.getTextStyle (ChaloTypography.kt:61)");
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1539055397, 0, -1, "app.chalo.compose.theme.getFontFamily (ChaloTypography.kt:18)");
        }
        Font fontA = FontResources_androidKt.a((FontResource) Font0_commonMainKt.b.getValue(), null, composer, 0, 14);
        FontResource fontResource = (FontResource) Font0_commonMainKt.c.getValue();
        FontWeight.Companion companion = FontWeight.INSTANCE;
        FontFamily FontFamily = FontFamilyKt.FontFamily(fontA, FontResources_androidKt.a(fontResource, companion.getSemiBold(), composer, 48, 12), FontResources_androidKt.a((FontResource) Font0_commonMainKt.f11293a.getValue(), companion.getBold(), composer, 48, 12));
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        TextStyle textStyle = new TextStyle(ChaloTheme.a(composer, 6).e, j, fontWeight, (FontStyle) null, (FontSynthesis) null, FontFamily, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawStyle) null, 0, 0, 0L, (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, 0, 0, (TextMotion) null, 16777176, (DefaultConstructorMarker) null);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return textStyle;
    }
}
