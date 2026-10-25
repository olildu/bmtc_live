package app.chalo.compose.theme;

import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.shape.RoundedCornerShape;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material.ripple.RippleAlpha;
import androidx.compose.material3.ColorScheme;
import androidx.compose.material3.ColorSchemeKt;
import androidx.compose.material3.ContentColorKt;
import androidx.compose.material3.MaterialThemeKt;
import androidx.compose.material3.RippleConfiguration;
import androidx.compose.material3.RippleKt;
import androidx.compose.material3.TextKt;
import androidx.compose.material3.Typography;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.runtime.ProvidedValue;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.internal.ComposableLambda;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.TextUnitKt;
import androidx.profileinstaller.ProfileVerifier;
import app.chalo.compose.theme.ChaloThemeKt;
import app.chalo.uistate.text.UITextStyle;
import defpackage.km;
import defpackage.pk0;
import defpackage.ul;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"chalo-base_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class ChaloThemeKt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final ProvidableCompositionLocal f1921a = CompositionLocalKt.staticCompositionLocalOf(new ul(9));
    public static final ProvidableCompositionLocal b = CompositionLocalKt.staticCompositionLocalOf(new ul(10));
    public static final ProvidableCompositionLocal c = CompositionLocalKt.staticCompositionLocalOf(new ul(11));
    public static final ProvidableCompositionLocal d = CompositionLocalKt.staticCompositionLocalOf(new ul(12));
    public static final ProvidableCompositionLocal e = CompositionLocalKt.staticCompositionLocalOf(new ul(13));

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f1922a;

        static {
            int[] iArr = new int[UITextStyle.values().length];
            try {
                iArr[UITextStyle.DisplayLarge.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[UITextStyle.DisplayMedium.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[UITextStyle.DisplaySmall.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[UITextStyle.HeadlineMedium.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[UITextStyle.HeadlineSmall.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[UITextStyle.TitleLarge.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[UITextStyle.BodyLarge.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[UITextStyle.BodyMedium.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[UITextStyle.BodySmall.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[UITextStyle.LabelSmall.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            f1922a = iArr;
        }
    }

    public static final void a(Typography typography, ChaloElevation chaloElevation, ChaloShape chaloShape, ChaloDimens chaloDimens, ChaloColor chaloColor, RippleConfiguration rippleConfiguration, final Function2 content, Composer composer, int i) {
        Typography typography2;
        ChaloElevation chaloElevation2;
        ChaloShape chaloShape2;
        ChaloDimens chaloDimens2;
        RippleConfiguration rippleConfiguration2;
        Composer composer2;
        ChaloColor chaloColor2;
        int i2;
        final ChaloElevation chaloElevation3;
        final ChaloShape chaloShape3;
        final Typography typography3;
        final ChaloColor chaloColor3;
        final RippleConfiguration rippleConfiguration3;
        final ChaloDimens chaloDimens3;
        Intrinsics.i(content, "content");
        Composer composerStartRestartGroup = composer.startRestartGroup(1328265230);
        int i3 = (i & 6) == 0 ? i | 2 : i;
        int i4 = i3 | 28080;
        if ((i & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
            i4 = 93616 | i3;
        }
        if ((i & 1572864) == 0) {
            i4 |= composerStartRestartGroup.changedInstance(content) ? 1048576 : 524288;
        }
        if (composerStartRestartGroup.shouldExecute((599187 & i4) != 599186, i4 & 1)) {
            composerStartRestartGroup.startDefaults();
            if ((i & 1) == 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1100274707, 0, -1, "app.chalo.compose.theme.getTypography (ChaloTypography.kt:27)");
                }
                FontWeight.Companion companion = FontWeight.INSTANCE;
                Typography typography4 = new Typography(ChaloTypographyKt.m(companion.getSemiBold(), TextUnitKt.getSp(40), composerStartRestartGroup), ChaloTypographyKt.m(companion.getSemiBold(), TextUnitKt.getSp(20), composerStartRestartGroup), ChaloTypographyKt.m(companion.getSemiBold(), TextUnitKt.getSp(18), composerStartRestartGroup), null, ChaloTypographyKt.m(companion.getSemiBold(), TextUnitKt.getSp(16), composerStartRestartGroup), ChaloTypographyKt.m(companion.getSemiBold(), TextUnitKt.getSp(14), composerStartRestartGroup), ChaloTypographyKt.m(companion.getSemiBold(), TextUnitKt.getSp(12), composerStartRestartGroup), null, null, ChaloTypographyKt.m(companion.getNormal(), TextUnitKt.getSp(16), composerStartRestartGroup), ChaloTypographyKt.m(companion.getNormal(), TextUnitKt.getSp(14), composerStartRestartGroup), ChaloTypographyKt.m(companion.getNormal(), TextUnitKt.getSp(12), composerStartRestartGroup), ChaloTypographyKt.m(companion.getNormal(), TextUnitKt.getSp(24), composerStartRestartGroup), null, ChaloTypographyKt.m(companion.getNormal(), TextUnitKt.getSp(10), composerStartRestartGroup), 8584, null);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                ChaloElevation chaloElevation4 = new ChaloElevation(0.0f, 0.0f, 63);
                ChaloShape chaloShape4 = new ChaloShape(null, null, 1023);
                ChaloDimens chaloDimens4 = new ChaloDimens();
                ChaloColor chaloColor4 = new ChaloColor(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, -1);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(344095981, 0, -1, "app.chalo.compose.theme.chaloRippleTheme (ChaloTheme.kt:273)");
                }
                RippleConfiguration rippleConfiguration4 = new RippleConfiguration(((Color) composerStartRestartGroup.consume(ContentColorKt.getLocalContentColor())).m4615unboximpl(), new RippleAlpha(0.16f, 0.24f, 0.08f, 0.24f), null);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                i2 = i4 & (-458767);
                chaloElevation3 = chaloElevation4;
                chaloShape3 = chaloShape4;
                typography3 = typography4;
                chaloColor3 = chaloColor4;
                rippleConfiguration3 = rippleConfiguration4;
                chaloDimens3 = chaloDimens4;
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                int i5 = i4 & (-458767);
                chaloElevation3 = chaloElevation;
                chaloShape3 = chaloShape;
                chaloDimens3 = chaloDimens;
                chaloColor3 = chaloColor;
                rippleConfiguration3 = rippleConfiguration;
                i2 = i5;
                typography3 = typography;
            }
            composerStartRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1328265230, i2, -1, "app.chalo.compose.theme.ChaloTheme (ChaloTheme.kt:331)");
            }
            long j = chaloColor3.f1915a;
            long j2 = chaloColor3.t;
            long j3 = chaloColor3.e;
            ColorScheme colorSchemeM1825lightColorScheme_VG5OTI$default = ColorSchemeKt.m1825lightColorScheme_VG5OTI$default(j, 0L, 0L, 0L, 0L, j, 0L, 0L, 0L, 0L, 0L, 0L, 0L, j2, j3, j2, j3, j2, j3, j2, j3, j2, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, j2, j2, j2, j2, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 1069555678, 65532, null);
            ChaloElevation chaloElevation5 = chaloElevation3;
            ChaloShape chaloShape5 = chaloShape3;
            ChaloDimens chaloDimens5 = chaloDimens3;
            ChaloColor chaloColor5 = chaloColor3;
            RippleConfiguration rippleConfiguration5 = rippleConfiguration3;
            ComposableLambda composableLambdaRememberComposableLambda = ComposableLambdaKt.rememberComposableLambda(-1043174470, true, new Function2() { // from class: jm
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Composer composer3 = (Composer) obj;
                    int iIntValue = ((Integer) obj2).intValue();
                    ProvidableCompositionLocal providableCompositionLocal = ChaloThemeKt.f1921a;
                    int i6 = 1;
                    if (composer3.shouldExecute((iIntValue & 3) != 2, iIntValue & 1)) {
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-1043174470, iIntValue, -1, "app.chalo.compose.theme.ChaloTheme.<anonymous> (ChaloTheme.kt:352)");
                        }
                        ProvidableCompositionLocal providableCompositionLocal2 = ChaloThemeKt.f1921a;
                        Typography typography5 = typography3;
                        CompositionLocalKt.CompositionLocalProvider((ProvidedValue<?>[]) new ProvidedValue[]{providableCompositionLocal2.provides(typography5), ChaloThemeKt.c.provides(chaloElevation3), ChaloThemeKt.d.provides(chaloShape3), ChaloThemeKt.e.provides(chaloDimens3), ChaloThemeKt.b.provides(chaloColor3), RippleKt.getLocalRippleConfiguration().provides(rippleConfiguration3), TextKt.getLocalTextStyle().provides(typography5.getBodyLarge())}, ComposableLambdaKt.rememberComposableLambda(1270005882, true, new fc(i6, content), composer3, 54), composer3, ProvidedValue.$stable | 48);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    } else {
                        composer3.skipToGroupEnd();
                    }
                    return Unit.f17538a;
                }
            }, composerStartRestartGroup, 54);
            Typography typography5 = typography3;
            MaterialThemeKt.MaterialTheme(colorSchemeM1825lightColorScheme_VG5OTI$default, null, typography5, composableLambdaRememberComposableLambda, composerStartRestartGroup, 3072, 2);
            typography2 = typography5;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            chaloElevation2 = chaloElevation5;
            composer2 = composerStartRestartGroup;
            chaloShape2 = chaloShape5;
            chaloDimens2 = chaloDimens5;
            rippleConfiguration2 = rippleConfiguration5;
            chaloColor2 = chaloColor5;
        } else {
            composerStartRestartGroup.skipToGroupEnd();
            typography2 = typography;
            chaloElevation2 = chaloElevation;
            chaloShape2 = chaloShape;
            chaloDimens2 = chaloDimens;
            rippleConfiguration2 = rippleConfiguration;
            composer2 = composerStartRestartGroup;
            chaloColor2 = chaloColor;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new km(typography2, chaloElevation2, chaloShape2, chaloDimens2, chaloColor2, rippleConfiguration2, content, i, 0));
        }
    }

    public static ChaloPadding b(ChaloPadding addValues, float f, float f2, int i) {
        if ((i & 1) != 0) {
            f = ChaloThemeHelper.a().f1916a;
        }
        if ((i & 2) != 0) {
            f2 = ChaloThemeHelper.a().f1916a;
        }
        float f3 = ChaloThemeHelper.a().f1916a;
        float f4 = ChaloThemeHelper.a().f1916a;
        Intrinsics.i(addValues, "$this$addValues");
        return new ChaloPadding(Dp.m7278constructorimpl(addValues.f1918a + f), Dp.m7278constructorimpl(addValues.b + f3), Dp.m7278constructorimpl(addValues.c + f4), Dp.m7278constructorimpl(addValues.d + f2));
    }

    public static final Modifier c(Modifier modifier, ChaloPadding padding) {
        Intrinsics.i(modifier, "<this>");
        Intrinsics.i(padding, "padding");
        return PaddingKt.m787paddingqDBjuR0(modifier, padding.b, padding.f1918a, padding.c, padding.d);
    }

    public static final RoundedCornerShape d(UIShape uIShape) {
        Intrinsics.i(uIShape, "<this>");
        if (!(uIShape instanceof UIShape.Rectangle)) {
            if (uIShape.equals(UIShape.Circle.p)) {
                return RoundedCornerShapeKt.getCircleShape();
            }
            throw new NoWhenBranchMatchedException();
        }
        UIShape.Rectangle rectangle = (UIShape.Rectangle) uIShape;
        return RoundedCornerShapeKt.m1075RoundedCornerShapea9UjIt4(rectangle.p, rectangle.q, rectangle.s, rectangle.r);
    }

    public static final PaddingValues e(ChaloPadding chaloPadding) {
        Intrinsics.i(chaloPadding, "<this>");
        return PaddingKt.m780PaddingValuesa9UjIt4(chaloPadding.b, chaloPadding.f1918a, chaloPadding.c, chaloPadding.d);
    }

    public static final TextStyle f(UITextStyle uITextStyle, Composer composer, int i) {
        TextStyle displayLarge;
        Intrinsics.i(uITextStyle, "<this>");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1425409468, i, -1, "app.chalo.compose.theme.toTextStyle (ChaloTheme.kt:453)");
        }
        switch (WhenMappings.f1922a[uITextStyle.ordinal()]) {
            case 1:
                composer.startReplaceGroup(276072688);
                displayLarge = ChaloTheme.e(composer, 6).getDisplayLarge();
                composer.endReplaceGroup();
                break;
            case 2:
                composer.startReplaceGroup(276074993);
                displayLarge = ChaloTheme.e(composer, 6).getDisplayMedium();
                composer.endReplaceGroup();
                break;
            case 3:
                composer.startReplaceGroup(276077296);
                displayLarge = ChaloTheme.e(composer, 6).getDisplaySmall();
                composer.endReplaceGroup();
                break;
            case 4:
                composer.startReplaceGroup(276079634);
                displayLarge = ChaloTheme.e(composer, 6).getHeadlineMedium();
                composer.endReplaceGroup();
                break;
            case 5:
                composer.startReplaceGroup(276082001);
                displayLarge = ChaloTheme.e(composer, 6).getHeadlineSmall();
                composer.endReplaceGroup();
                break;
            case 6:
                composer.startReplaceGroup(276084238);
                displayLarge = ChaloTheme.e(composer, 6).getTitleLarge();
                composer.endReplaceGroup();
                break;
            case 7:
                composer.startReplaceGroup(276086349);
                displayLarge = ChaloTheme.e(composer, 6).getBodyLarge();
                composer.endReplaceGroup();
                break;
            case 8:
                composer.startReplaceGroup(276088462);
                displayLarge = ChaloTheme.e(composer, 6).getBodyMedium();
                composer.endReplaceGroup();
                break;
            case 9:
                composer.startReplaceGroup(276090573);
                displayLarge = ChaloTheme.e(composer, 6).getBodySmall();
                composer.endReplaceGroup();
                break;
            case 10:
                composer.startReplaceGroup(276092686);
                displayLarge = ChaloTheme.e(composer, 6).getLabelSmall();
                composer.endReplaceGroup();
                break;
            default:
                throw pk0.p(composer, 276071116);
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return displayLarge;
    }
}
