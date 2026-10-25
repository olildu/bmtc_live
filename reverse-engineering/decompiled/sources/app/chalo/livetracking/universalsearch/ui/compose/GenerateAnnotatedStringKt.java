package app.chalo.livetracking.universalsearch.ui.compose;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.graphics.Shadow;
import androidx.compose.ui.graphics.drawscope.DrawStyle;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.PlatformSpanStyle;
import androidx.compose.ui.text.SpanStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontSynthesis;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.intl.LocaleList;
import androidx.compose.ui.text.style.BaselineShift;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.text.style.TextGeometricTransform;
import app.chalo.compose.theme.ChaloTheme;
import app.chalo.compose.theme.ChaloTypographyKt;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"livetracking_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class GenerateAnnotatedStringKt {
    public static final AnnotatedString a(String subStringToChangeStyle, String wholeString, Composer composer, int i) {
        Intrinsics.i(subStringToChangeStyle, "subStringToChangeStyle");
        Intrinsics.i(wholeString, "wholeString");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(905778081, i, -1, "app.chalo.livetracking.universalsearch.ui.compose.generateAnnotatedString (GenerateAnnotatedString.kt:11)");
        }
        int iB = StringsKt.B(wholeString, subStringToChangeStyle, 0, true);
        AnnotatedString.Builder builder = new AnnotatedString.Builder(wholeString);
        if (iB != -1) {
            composer.startReplaceGroup(-1244428773);
            long jM6771getFontSizeXSAIIZE = ChaloTypographyKt.g(ChaloTheme.e(composer, 0)).m6771getFontSizeXSAIIZE();
            long j = ChaloTheme.a(composer, 0).g;
            FontWeight.Companion companion = FontWeight.INSTANCE;
            builder.addStyle(new SpanStyle(j, jM6771getFontSizeXSAIIZE, companion.getSemiBold(), (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (PlatformSpanStyle) null, (DrawStyle) null, 65528, (DefaultConstructorMarker) null), 0, iB);
            builder.addStyle(new SpanStyle(ChaloTheme.a(composer, 0).K, ChaloTypographyKt.g(ChaloTheme.e(composer, 0)).m6771getFontSizeXSAIIZE(), companion.getSemiBold(), (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (PlatformSpanStyle) null, (DrawStyle) null, 65528, (DefaultConstructorMarker) null), iB, subStringToChangeStyle.length() + iB);
            builder.addStyle(new SpanStyle(ChaloTheme.a(composer, 0).g, ChaloTypographyKt.g(ChaloTheme.e(composer, 0)).m6771getFontSizeXSAIIZE(), companion.getSemiBold(), (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (PlatformSpanStyle) null, (DrawStyle) null, 65528, (DefaultConstructorMarker) null), subStringToChangeStyle.length() + iB, wholeString.length());
            composer.endReplaceGroup();
        } else {
            composer.startReplaceGroup(-1243579807);
            builder.addStyle(new SpanStyle(0L, ChaloTypographyKt.g(ChaloTheme.e(composer, 0)).m6771getFontSizeXSAIIZE(), FontWeight.INSTANCE.getSemiBold(), (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (PlatformSpanStyle) null, (DrawStyle) null, 65529, (DefaultConstructorMarker) null), 0, wholeString.length());
            composer.endReplaceGroup();
        }
        AnnotatedString annotatedString = builder.toAnnotatedString();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return annotatedString;
    }

    public static final AnnotatedString b(Composer composer, int i, String stringToAnnotate) {
        Intrinsics.i(stringToAnnotate, "stringToAnnotate");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-666702456, i, -1, "app.chalo.livetracking.universalsearch.ui.compose.generateAnnotatedStringForStringWithDelimiter (GenerateAnnotatedString.kt:54)");
        }
        String strH0 = StringsKt.h0(stringToAnnotate, ",");
        AnnotatedString.Builder builder = new AnnotatedString.Builder(stringToAnnotate);
        if (StringsKt.F(strH0) || strH0.length() == stringToAnnotate.length()) {
            composer.startReplaceGroup(-1803125611);
            builder.addStyle(new SpanStyle(0L, ChaloTypographyKt.g(ChaloTheme.e(composer, 0)).m6771getFontSizeXSAIIZE(), FontWeight.INSTANCE.getSemiBold(), (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (PlatformSpanStyle) null, (DrawStyle) null, 65529, (DefaultConstructorMarker) null), 0, stringToAnnotate.length());
            composer.endReplaceGroup();
        } else {
            composer.startReplaceGroup(-1803703730);
            long jM6771getFontSizeXSAIIZE = ChaloTypographyKt.g(ChaloTheme.e(composer, 0)).m6771getFontSizeXSAIIZE();
            long j = ChaloTheme.a(composer, 0).g;
            FontWeight.Companion companion = FontWeight.INSTANCE;
            builder.addStyle(new SpanStyle(j, jM6771getFontSizeXSAIIZE, companion.getSemiBold(), (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (PlatformSpanStyle) null, (DrawStyle) null, 65528, (DefaultConstructorMarker) null), 0, strH0.length());
            builder.addStyle(new SpanStyle(ChaloTheme.a(composer, 0).h, ChaloTypographyKt.c(ChaloTheme.e(composer, 0)).m6771getFontSizeXSAIIZE(), companion.getNormal(), (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (PlatformSpanStyle) null, (DrawStyle) null, 65528, (DefaultConstructorMarker) null), strH0.length() + 1, stringToAnnotate.length());
            composer.endReplaceGroup();
        }
        AnnotatedString annotatedString = builder.toAnnotatedString();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return annotatedString;
    }
}
