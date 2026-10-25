package app.chalo.compose.components.buttons;

import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.BorderKt;
import androidx.compose.foundation.BorderStroke;
import androidx.compose.foundation.BorderStrokeKt;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.FlowLayoutKt;
import androidx.compose.foundation.layout.FlowRowScope;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material3.ButtonColors;
import androidx.compose.material3.ButtonDefaults;
import androidx.compose.material3.ButtonElevation;
import androidx.compose.material3.ButtonKt;
import androidx.compose.material3.IconKt;
import androidx.compose.material3.TextKt;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.ClipKt;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.GraphicsLayerModifierKt;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.unit.Dp;
import androidx.core.view.accessibility.AccessibilityEventCompat;
import androidx.profileinstaller.ProfileVerifier;
import app.chalo.compose.components.ChaloRoundedCardKt;
import app.chalo.compose.components.ChaloSpacersKt;
import app.chalo.compose.components.ChaloTextViewKt;
import app.chalo.compose.components.buttons.ChaloFilledButtonKt;
import app.chalo.compose.components.image.CommonImageKt;
import app.chalo.compose.theme.ChaloTheme;
import app.chalo.compose.theme.ChaloThemeKt;
import app.chalo.compose.theme.ChaloTypographyKt;
import app.chalo.uistate.base.ChaloColorToken;
import app.chalo.uistate.base.ChaloColorTokenKt;
import app.chalo.uistate.base.UiEventHandler;
import app.chalo.uistate.button.ButtonBorderUISpec;
import app.chalo.uistate.button.ButtonUIColor;
import app.chalo.uistate.button.ButtonUIElevation;
import app.chalo.uistate.button.ButtonUIState;
import app.chalo.uistate.button.ClickableTextUiState;
import app.chalo.uistate.image.ImageUIState;
import app.chalo.uistate.text.TextUIState;
import defpackage.dk;
import defpackage.ek;
import defpackage.fi;
import defpackage.fk;
import defpackage.hb;
import defpackage.hk;
import defpackage.ik;
import defpackage.k6;
import defpackage.mi;
import defpackage.pk0;
import defpackage.uc;
import defpackage.vc;
import defpackage.xj;
import defpackage.yj;
import defpackage.z;
import defpackage.zj;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KFunction;
import kotlin.sequences.SequencesKt;
import kotlin.sequences.TransformingSequence;
import kotlin.text.StringsKt;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"chalo-base_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class ChaloFilledButtonKt {
    public static final void a(int i, int i2, Composer composer, Modifier modifier, ButtonUIState buttonUIState) {
        Modifier modifier2;
        int i3;
        Modifier modifier3;
        Intrinsics.i(buttonUIState, "buttonUIState");
        Composer composerStartRestartGroup = composer.startRestartGroup(-398483867);
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 6;
            modifier2 = modifier;
        } else if ((i & 6) == 0) {
            modifier2 = modifier;
            i3 = i | (composerStartRestartGroup.changed(modifier2) ? 4 : 2);
        } else {
            modifier2 = modifier;
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changed(buttonUIState) ? 32 : 16;
        }
        if (composerStartRestartGroup.shouldExecute((i3 & 19) != 18, i3 & 1)) {
            Modifier modifier4 = i4 != 0 ? Modifier.INSTANCE : modifier2;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-398483867, i3, -1, "app.chalo.compose.components.buttons.ChaloButton (ChaloFilledButton.kt:67)");
            }
            UiEventHandler uiEventHandler = buttonUIState.f;
            boolean zChangedInstance = composerStartRestartGroup.changedInstance(uiEventHandler);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                ChaloFilledButtonKt$ChaloButton$1$1 chaloFilledButtonKt$ChaloButton$1$1 = new ChaloFilledButtonKt$ChaloButton$1$1(0, uiEventHandler, UiEventHandler.class, "onClick", "onClick()V", 0);
                composerStartRestartGroup.updateRememberedValue(chaloFilledButtonKt$ChaloButton$1$1);
                objRememberedValue = chaloFilledButtonKt$ChaloButton$1$1;
            }
            KFunction kFunction = (KFunction) objRememberedValue;
            boolean z = buttonUIState.b;
            ButtonBorderUISpec buttonBorderUISpec = buttonUIState.h;
            BorderStroke borderStrokeM290BorderStrokecXLIe8U = buttonBorderUISpec != null ? BorderStrokeKt.m290BorderStrokecXLIe8U(buttonBorderUISpec.f9917a, ChaloColorTokenKt.c(buttonBorderUISpec.b)) : null;
            ButtonUIColor buttonUIColor = buttonUIState.e;
            boolean z2 = buttonUIState.b;
            Intrinsics.i(buttonUIColor, "<this>");
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1566411755, 0, -1, "app.chalo.compose.components.buttons.toTextButtonColors (ChaloFilledButton.kt:390)");
            }
            float f = z2 ? 1.0f : 0.4f;
            Modifier modifier5 = modifier4;
            ButtonDefaults buttonDefaults = ButtonDefaults.INSTANCE;
            ChaloColorToken chaloColorToken = buttonUIColor.f9918a;
            long jC = chaloColorToken != null ? ChaloColorTokenKt.c(chaloColorToken) : Color.INSTANCE.m4640getTransparent0d7_KjU();
            ChaloColorToken chaloColorToken2 = buttonUIColor.b;
            long jM4604copywmQWz5c$default = chaloColorToken2 != null ? Color.m4604copywmQWz5c$default(ChaloColorTokenKt.c(chaloColorToken2), f, 0.0f, 0.0f, 0.0f, 14, null) : Color.INSTANCE.m4640getTransparent0d7_KjU();
            int i5 = ButtonDefaults.$stable;
            modifier3 = modifier5;
            ButtonColors buttonColorsM1685textButtonColorsro_MJ88 = buttonDefaults.m1685textButtonColorsro_MJ88(jC, 0L, jM4604copywmQWz5c$default, 0L, composerStartRestartGroup, i5 << 12, 10);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            Modifier modifierM814height3ABfNKs = SizeKt.m814height3ABfNKs(modifier3, buttonUIState.g);
            ButtonUIElevation buttonUIElevation = buttonUIState.d;
            Intrinsics.i(buttonUIElevation, "<this>");
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-2034137704, 0, -1, "app.chalo.compose.components.buttons.toButtonElevation (ChaloFilledButton.kt:399)");
            }
            ButtonElevation buttonElevationM1675buttonElevationR_JCAzs = buttonDefaults.m1675buttonElevationR_JCAzs(buttonUIElevation.f9919a, buttonUIElevation.b, buttonUIElevation.c, buttonUIElevation.d, buttonUIElevation.e, composerStartRestartGroup, i5 << 15, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            ButtonKt.Button((Function0) kFunction, modifierM814height3ABfNKs, z, ChaloThemeKt.d(buttonUIState.c), buttonColorsM1685textButtonColorsro_MJ88, buttonElevationM1675buttonElevationR_JCAzs, borderStrokeM290BorderStrokecXLIe8U, null, null, ComposableLambdaKt.rememberComposableLambda(-2126746507, true, new hk(buttonUIState, 0), composerStartRestartGroup, 54), composerStartRestartGroup, 805306368, 384);
            composerStartRestartGroup = composerStartRestartGroup;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
            modifier3 = modifier2;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new ik(modifier3, buttonUIState, i, i2));
        }
    }

    /* JADX WARN: Code duplicated, block: B:128:0x01bb  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v16, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r0v27 */
    /* JADX WARN: Type inference failed for: r0v29 */
    /* JADX WARN: Type inference failed for: r28v0 */
    /* JADX WARN: Type inference failed for: r28v1 */
    /* JADX WARN: Type inference failed for: r28v2 */
    public static final void b(Modifier modifier, long j, long j2, Shape shape, Dp dp, ButtonElevation buttonElevation, Function0 onClickAction, Function3 content, Composer composer, int i, int i2) {
        Modifier modifier2;
        int i3;
        long j3;
        Dp dp2;
        ButtonElevation buttonElevationM1675buttonElevationR_JCAzs;
        Modifier modifier3;
        long j4;
        Dp dp3;
        ButtonElevation buttonElevation2;
        long j5;
        long j6;
        long j7;
        int i4;
        Dp dpM7276boximpl;
        boolean z;
        long j8;
        long j9;
        Modifier modifier4;
        ?? r0;
        Modifier modifierM814height3ABfNKs;
        Intrinsics.i(onClickAction, "onClickAction");
        Intrinsics.i(content, "content");
        Composer composerStartRestartGroup = composer.startRestartGroup(-796547734);
        int i5 = i2 & 1;
        if (i5 != 0) {
            i3 = i | 6;
            modifier2 = modifier;
        } else if ((i & 6) == 0) {
            modifier2 = modifier;
            i3 = (composerStartRestartGroup.changed(modifier2) ? 4 : 2) | i;
        } else {
            modifier2 = modifier;
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= ((i2 & 2) == 0 && composerStartRestartGroup.changed(j)) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            if ((i2 & 4) == 0) {
                j3 = j2;
                int i6 = composerStartRestartGroup.changed(j3) ? 256 : 128;
                i3 |= i6;
            } else {
                j3 = j2;
            }
            i3 |= i6;
        } else {
            j3 = j2;
        }
        if ((i & 3072) == 0) {
            i3 |= composerStartRestartGroup.changed(shape) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            if ((i2 & 16) == 0) {
                dp2 = dp;
                int i7 = composerStartRestartGroup.changed(dp2) ? 16384 : 8192;
                i3 |= i7;
            } else {
                dp2 = dp;
            }
            i3 |= i7;
        } else {
            dp2 = dp;
        }
        if ((196608 & i) == 0) {
            if ((i2 & 32) == 0) {
                buttonElevationM1675buttonElevationR_JCAzs = buttonElevation;
                int i8 = composerStartRestartGroup.changed(buttonElevationM1675buttonElevationR_JCAzs) ? 131072 : 65536;
                i3 |= i8;
            } else {
                buttonElevationM1675buttonElevationR_JCAzs = buttonElevation;
            }
            i3 |= i8;
        } else {
            buttonElevationM1675buttonElevationR_JCAzs = buttonElevation;
        }
        if ((1572864 & i) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(onClickAction) ? 1048576 : 524288;
        }
        if ((12582912 & i) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(content) ? 8388608 : 4194304;
        }
        if (composerStartRestartGroup.shouldExecute((4793491 & i3) != 4793490, i3 & 1)) {
            composerStartRestartGroup.startDefaults();
            if ((i & 1) == 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                Modifier modifier5 = i5 != 0 ? Modifier.INSTANCE : modifier2;
                if ((i2 & 2) != 0) {
                    i3 &= -113;
                    j6 = ChaloTheme.a(composerStartRestartGroup, 6).Z;
                } else {
                    j6 = j;
                }
                if ((i2 & 4) != 0) {
                    i3 &= -897;
                    j7 = ChaloTheme.a(composerStartRestartGroup, 6).t;
                } else {
                    j7 = j3;
                }
                if ((i2 & 16) != 0) {
                    dpM7276boximpl = Dp.m7276boximpl(ChaloTheme.b(composerStartRestartGroup, 6).n);
                    i4 = i3 & (-57345);
                } else {
                    i4 = i3;
                    dpM7276boximpl = dp2;
                }
                if ((i2 & 32) != 0) {
                    z = true;
                    i4 &= -458753;
                    buttonElevationM1675buttonElevationR_JCAzs = ButtonDefaults.INSTANCE.m1675buttonElevationR_JCAzs(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, composerStartRestartGroup, ButtonDefaults.$stable << 15, 31);
                } else {
                    z = true;
                }
                j8 = j6;
                j9 = j7;
                modifier4 = modifier5;
                r0 = z;
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                if ((i2 & 2) != 0) {
                    i3 &= -113;
                }
                if ((i2 & 4) != 0) {
                    i3 &= -897;
                }
                if ((i2 & 16) != 0) {
                    i3 &= -57345;
                }
                if ((i2 & 32) != 0) {
                    i3 &= -458753;
                }
                modifier4 = modifier2;
                i4 = i3;
                j9 = j3;
                dpM7276boximpl = dp2;
                r0 = 1;
                j8 = j;
            }
            composerStartRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-796547734, i4, -1, "app.chalo.compose.components.buttons.ChaloButtonWithCustomContent (ChaloFilledButton.kt:246)");
            }
            if (dpM7276boximpl != null) {
                modifierM814height3ABfNKs = SizeKt.m814height3ABfNKs(Modifier.INSTANCE, dpM7276boximpl.m7292unboximpl());
                if (modifierM814height3ABfNKs == null) {
                    modifierM814height3ABfNKs = Modifier.INSTANCE;
                }
            } else {
                modifierM814height3ABfNKs = Modifier.INSTANCE;
            }
            ButtonColors buttonColorsM1685textButtonColorsro_MJ88 = ButtonDefaults.INSTANCE.m1685textButtonColorsro_MJ88(j9, 0L, 0L, 0L, composerStartRestartGroup, ((i4 >> 6) & 14) | (ButtonDefaults.$stable << 12), 14);
            Modifier modifierThen = modifier4.then(BorderKt.m275borderxT4_qwU(modifierM814height3ABfNKs, Dp.m7278constructorimpl((float) r0), j8, shape));
            ?? r28 = (3670016 & i4) == 1048576 ? r0 : 0;
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (r28 != 0 || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new hb(onClickAction, 29);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            Modifier modifier6 = modifier4;
            long j10 = j8;
            ButtonElevation buttonElevation3 = buttonElevationM1675buttonElevationR_JCAzs;
            ButtonKt.Button((Function0) objRememberedValue, modifierThen, false, shape, buttonColorsM1685textButtonColorsro_MJ88, buttonElevation3, null, null, null, ComposableLambdaKt.rememberComposableLambda(964372346, r0, new dk(content, 0), composerStartRestartGroup, 54), composerStartRestartGroup, (i4 & 7168) | 805306368 | (458752 & i4), 452);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            buttonElevation2 = buttonElevation3;
            modifier3 = modifier6;
            j4 = j9;
            j5 = j10;
            dp3 = dpM7276boximpl;
        } else {
            composerStartRestartGroup.skipToGroupEnd();
            modifier3 = modifier2;
            j4 = j3;
            dp3 = dp2;
            buttonElevation2 = buttonElevationM1675buttonElevationR_JCAzs;
            j5 = j;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new ek(modifier3, j5, j4, shape, dp3, buttonElevation2, onClickAction, content, i, i2));
        }
    }

    /* JADX WARN: Code duplicated, block: B:102:0x012e  */
    /* JADX WARN: Code duplicated, block: B:103:0x0137  */
    /* JADX WARN: Code duplicated, block: B:106:0x013c  */
    /* JADX WARN: Code duplicated, block: B:107:0x0145  */
    /* JADX WARN: Code duplicated, block: B:110:0x014a  */
    /* JADX WARN: Code duplicated, block: B:112:0x015b  */
    /* JADX WARN: Code duplicated, block: B:115:0x016a  */
    /* JADX WARN: Code duplicated, block: B:118:0x017a  */
    /* JADX WARN: Code duplicated, block: B:123:0x018a  */
    /* JADX WARN: Code duplicated, block: B:126:0x01e3  */
    /* JADX WARN: Code duplicated, block: B:128:0x01ee  */
    /* JADX WARN: Code duplicated, block: B:131:0x01ff  */
    /* JADX WARN: Code duplicated, block: B:133:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:23:0x004c  */
    /* JADX WARN: Code duplicated, block: B:25:0x0050  */
    /* JADX WARN: Code duplicated, block: B:27:0x0058  */
    /* JADX WARN: Code duplicated, block: B:28:0x005b  */
    /* JADX WARN: Code duplicated, block: B:31:0x0061  */
    /* JADX WARN: Code duplicated, block: B:34:0x0067  */
    /* JADX WARN: Code duplicated, block: B:36:0x006b  */
    /* JADX WARN: Code duplicated, block: B:37:0x0070  */
    /* JADX WARN: Code duplicated, block: B:39:0x0076  */
    /* JADX WARN: Code duplicated, block: B:40:0x0079  */
    /* JADX WARN: Code duplicated, block: B:44:0x0080  */
    /* JADX WARN: Code duplicated, block: B:49:0x008f  */
    /* JADX WARN: Code duplicated, block: B:51:0x0093  */
    /* JADX WARN: Code duplicated, block: B:54:0x009a  */
    /* JADX WARN: Code duplicated, block: B:59:0x00a9  */
    /* JADX WARN: Code duplicated, block: B:61:0x00ad  */
    /* JADX WARN: Code duplicated, block: B:64:0x00b4  */
    /* JADX WARN: Code duplicated, block: B:66:0x00ba  */
    /* JADX WARN: Code duplicated, block: B:67:0x00bd  */
    /* JADX WARN: Code duplicated, block: B:71:0x00cc  */
    /* JADX WARN: Code duplicated, block: B:72:0x00ce  */
    /* JADX WARN: Code duplicated, block: B:75:0x00d8  */
    /* JADX WARN: Code duplicated, block: B:93:0x0114 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:94:0x0116  */
    /* JADX WARN: Code duplicated, block: B:95:0x0119  */
    /* JADX WARN: Code duplicated, block: B:98:0x011e  */
    /* JADX WARN: Code duplicated, block: B:99:0x0129  */
    public static final void c(final String text, Modifier modifier, TextStyle textStyle, final Painter painter, long j, long j2, float f, Function0 onClickAction, Composer composer, int i, int i2) {
        int i3;
        Modifier modifier2;
        TextStyle textStyle2;
        long j3;
        long j4;
        boolean z;
        Composer composer2;
        float f2;
        Modifier modifier3;
        TextStyle textStyle3;
        long j5;
        long j6;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Modifier modifier4;
        final TextStyle headlineSmall;
        long j7;
        long j8;
        float f3;
        int i4;
        final long j9;
        final long j10;
        boolean z2;
        Object objRememberedValue;
        int i5;
        int i6;
        int i7;
        boolean zChangedInstance;
        int i8;
        Intrinsics.i(text, "text");
        Intrinsics.i(onClickAction, "onClickAction");
        Composer composerStartRestartGroup = composer.startRestartGroup(-1366023635);
        if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changed(text) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i9 = i2 & 2;
        if (i9 == 0) {
            if ((i & 48) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 32 : 16;
            }
            if ((i & 384) == 0) {
                if ((i2 & 4) == 0) {
                    textStyle2 = textStyle;
                    int i10 = composerStartRestartGroup.changed(textStyle2) ? 256 : 128;
                    i3 |= i10;
                } else {
                    textStyle2 = textStyle;
                }
                i3 |= i10;
            } else {
                textStyle2 = textStyle;
            }
            if ((i & 3072) == 0) {
                if ((i & 4096) == 0) {
                    zChangedInstance = composerStartRestartGroup.changed(painter);
                } else {
                    zChangedInstance = composerStartRestartGroup.changedInstance(painter);
                }
                if (zChangedInstance) {
                    i8 = 2048;
                } else {
                    i8 = 1024;
                }
                i3 |= i8;
            }
            if ((i & 24576) == 0) {
                j3 = j;
                if ((i2 & 16) == 0 || !composerStartRestartGroup.changed(j3)) {
                    i7 = 8192;
                } else {
                    i7 = 16384;
                }
                i3 |= i7;
            } else {
                j3 = j;
            }
            if ((196608 & i) == 0) {
                j4 = j2;
                if ((i2 & 32) == 0 || !composerStartRestartGroup.changed(j4)) {
                    i6 = 65536;
                } else {
                    i6 = 131072;
                }
                i3 |= i6;
            } else {
                j4 = j2;
            }
            if ((12582912 & i) == 0) {
                if (composerStartRestartGroup.changedInstance(onClickAction)) {
                    i5 = 8388608;
                } else {
                    i5 = 4194304;
                }
                i3 |= i5;
            }
            if ((4269203 & i3) != 4269202) {
                z = true;
            } else {
                z = false;
            }
            if (composerStartRestartGroup.shouldExecute(z, i3 & 1)) {
                composerStartRestartGroup.startDefaults();
                if ((i & 1) != 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                    if (i9 != 0) {
                        modifier4 = Modifier.INSTANCE;
                    } else {
                        modifier4 = modifier2;
                    }
                    if ((i2 & 4) != 0) {
                        headlineSmall = ChaloTheme.e(composerStartRestartGroup, 6).getHeadlineSmall();
                        i3 &= -897;
                    } else {
                        headlineSmall = textStyle2;
                    }
                    if ((i2 & 16) != 0) {
                        j7 = ChaloTheme.a(composerStartRestartGroup, 6).B;
                        i3 &= -57345;
                    } else {
                        j7 = j3;
                    }
                    if ((i2 & 32) != 0) {
                        j8 = ChaloTheme.a(composerStartRestartGroup, 6).t;
                        i3 &= -458753;
                    } else {
                        j8 = j4;
                    }
                    if ((i2 & 64) != 0) {
                        i3 &= -3670017;
                        f3 = ChaloTheme.b(composerStartRestartGroup, 6).f;
                    } else {
                        f3 = f;
                    }
                    i4 = i3;
                    j9 = j7;
                    j10 = j8;
                } else {
                    composerStartRestartGroup.skipToGroupEnd();
                    if ((i2 & 4) != 0) {
                        i3 &= -897;
                    }
                    if ((i2 & 16) != 0) {
                        i3 &= -57345;
                    }
                    if ((i2 & 32) != 0) {
                        i3 &= -458753;
                    }
                    if ((i2 & 64) != 0) {
                        i3 &= -3670017;
                    }
                    f3 = f;
                    modifier4 = modifier2;
                    headlineSmall = textStyle2;
                    j10 = j4;
                    i4 = i3;
                    j9 = j3;
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1366023635, i4, -1, "app.chalo.compose.components.buttons.ChaloButtonWithOrangeArrow (ChaloFilledButton.kt:279)");
                }
                z2 = (i4 & 29360128) == 8388608;
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (z2 || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = new fk(onClickAction, 0);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                Modifier modifier5 = modifier4;
                composer2 = composerStartRestartGroup;
                FlowLayoutKt.FlowRow(PaddingKt.m786paddingVpY3zN4$default(ClickableKt.m299clickableoSLSa3U$default(modifier4, false, null, null, null, (Function0) objRememberedValue, 15, null), 0.0f, ChaloTheme.b(composerStartRestartGroup, 6).f, 1, null), null, Arrangement.INSTANCE.getCenter(), null, 0, 0, ComposableLambdaKt.rememberComposableLambda(943195922, true, new Function3() { // from class: gk
                    @Override // kotlin.jvm.functions.Function3
                    public final Object invoke(Object obj, Object obj2, Object obj3) {
                        gk gkVar = this;
                        FlowRowScope FlowRow = (FlowRowScope) obj;
                        Composer composer3 = (Composer) obj2;
                        int iIntValue = ((Integer) obj3).intValue();
                        Intrinsics.i(FlowRow, "$this$FlowRow");
                        if ((iIntValue & 6) == 0) {
                            iIntValue |= composer3.changed(FlowRow) ? 4 : 2;
                        }
                        boolean z3 = false;
                        if (composer3.shouldExecute((iIntValue & 19) != 18, iIntValue & 1)) {
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(943195922, iIntValue, -1, "app.chalo.compose.components.buttons.ChaloButtonWithOrangeArrow.<anonymous> (ChaloFilledButton.kt:286)");
                            }
                            TransformingSequence transformingSequenceW = StringsKt.W(text, new String[]{" "});
                            Object objRememberedValue2 = composer3.rememberedValue();
                            if (objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue2 = new bj(19);
                                composer3.updateRememberedValue(objRememberedValue2);
                            }
                            List listQ = SequencesKt.q(SequencesKt.e(transformingSequenceW, (Function1) objRememberedValue2));
                            composer3.startReplaceGroup(173185430);
                            int i11 = 0;
                            for (Object obj4 : listQ) {
                                int i12 = i11 + 1;
                                if (i11 < 0) {
                                    CollectionsKt.z0();
                                    throw null;
                                }
                                String str = (String) obj4;
                                boolean z4 = i11 < CollectionsKt.K(listQ) ? true : z3;
                                long j11 = ChaloTheme.a(composer3, 6).f1915a;
                                Modifier modifierAlign = FlowRow.align(Modifier.INSTANCE, Alignment.INSTANCE.getCenterVertically());
                                boolean z5 = z3;
                                Composer composer4 = composer3;
                                TextStyle textStyle4 = headlineSmall;
                                TextKt.m2623TextNvy7gAk(str, modifierAlign, j11, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, textStyle4, composer4, 0, 0, 131064);
                                composer3 = composer4;
                                if (z4) {
                                    composer3.startReplaceGroup(490899565);
                                    TextKt.m2623TextNvy7gAk(" ", null, 0L, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, textStyle4, composer3, 6, 0, 131070);
                                    composer3 = composer3;
                                } else {
                                    composer3.startReplaceGroup(480614602);
                                }
                                composer3.endReplaceGroup();
                                z3 = z5;
                                i11 = i12;
                                gkVar = this;
                            }
                            boolean z6 = z3;
                            composer3.endReplaceGroup();
                            ChaloSpacersKt.w(composer3, z6 ? 1 : 0);
                            Modifier.Companion companion = Modifier.INSTANCE;
                            Alignment.Companion companion2 = Alignment.INSTANCE;
                            Modifier modifierM264backgroundbw27NRU$default = BackgroundKt.m264backgroundbw27NRU$default(ClipKt.clip(SizeKt.m828size3ABfNKs(FlowRow.align(companion, companion2.getCenterVertically()), ChaloTheme.b(composer3, 6).h), RoundedCornerShapeKt.getCircleShape()), j9, null, 2, null);
                            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(companion2.getCenter(), z6);
                            long currentCompositeKeyHashCode = ComposablesKt.getCurrentCompositeKeyHashCode(composer3, z6 ? 1 : 0);
                            int i13 = (int) (currentCompositeKeyHashCode ^ (currentCompositeKeyHashCode >>> 32));
                            CompositionLocalMap currentCompositionLocalMap = composer3.getCurrentCompositionLocalMap();
                            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composer3, modifierM264backgroundbw27NRU$default);
                            ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
                            Function0<ComposeUiNode> constructor = companion3.getConstructor();
                            if (composer3.getApplier() == null) {
                                ComposablesKt.invalidApplier();
                            }
                            composer3.startReusableNode();
                            if (composer3.getInserting()) {
                                composer3.createNode(constructor);
                            } else {
                                composer3.useNode();
                            }
                            Composer composerM3915constructorimpl = Updater.m3915constructorimpl(composer3);
                            pk0.v(companion3, composerM3915constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy, composerM3915constructorimpl, currentCompositionLocalMap);
                            Updater.m3923setimpl(composerM3915constructorimpl, modifierMaterializeModifier, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion3, composerM3915constructorimpl, Integer.valueOf(i13), composerM3915constructorimpl));
                            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                            IconKt.m2070Iconww6aTOc(painter, (String) null, GraphicsLayerModifierKt.m4770graphicsLayer_6ThJ44$default(SizeKt.m828size3ABfNKs(companion, ChaloTheme.b(composer3, 6).f), 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 90.0f, 0.0f, 0L, null, false, null, 0L, 0L, 0, 0, null, 524031, null), j10, composer3, Painter.$stable | 48, 0);
                            composer3.endNode();
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        } else {
                            composer3.skipToGroupEnd();
                        }
                        return Unit.f17538a;
                    }
                }, composerStartRestartGroup, 54), composer2, 1573248, 58);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                j6 = j10;
                f2 = f3;
                j5 = j9;
                textStyle3 = headlineSmall;
                modifier3 = modifier5;
            } else {
                composer2 = composerStartRestartGroup;
                composer2.skipToGroupEnd();
                f2 = f;
                modifier3 = modifier2;
                textStyle3 = textStyle2;
                j5 = j3;
                j6 = j4;
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new k6(text, modifier3, textStyle3, painter, j5, j6, f2, onClickAction, i, i2));
            }
        }
        i3 |= 48;
        modifier2 = modifier;
        if ((i & 384) == 0) {
            if ((i2 & 4) == 0) {
                textStyle2 = textStyle;
                if (composerStartRestartGroup.changed(textStyle2)) {
                }
                i3 |= i10;
            } else {
                textStyle2 = textStyle;
            }
            i3 |= i10;
        } else {
            textStyle2 = textStyle;
        }
        if ((i & 3072) == 0) {
            if ((i & 4096) == 0) {
                zChangedInstance = composerStartRestartGroup.changed(painter);
            } else {
                zChangedInstance = composerStartRestartGroup.changedInstance(painter);
            }
            if (zChangedInstance) {
                i8 = 2048;
            } else {
                i8 = 1024;
            }
            i3 |= i8;
        }
        if ((i & 24576) == 0) {
            j3 = j;
            if ((i2 & 16) == 0) {
                i7 = 8192;
            } else {
                i7 = 8192;
            }
            i3 |= i7;
        } else {
            j3 = j;
        }
        if ((196608 & i) == 0) {
            j4 = j2;
            if ((i2 & 32) == 0) {
                i6 = 65536;
            } else {
                i6 = 65536;
            }
            i3 |= i6;
        } else {
            j4 = j2;
        }
        if ((12582912 & i) == 0) {
            if (composerStartRestartGroup.changedInstance(onClickAction)) {
                i5 = 8388608;
            } else {
                i5 = 4194304;
            }
            i3 |= i5;
        }
        if ((4269203 & i3) != 4269202) {
            z = true;
        } else {
            z = false;
        }
        if (composerStartRestartGroup.shouldExecute(z, i3 & 1)) {
            composerStartRestartGroup.startDefaults();
            if ((i & 1) != 0) {
                if (i9 != 0) {
                    modifier4 = Modifier.INSTANCE;
                } else {
                    modifier4 = modifier2;
                }
                if ((i2 & 4) != 0) {
                    headlineSmall = ChaloTheme.e(composerStartRestartGroup, 6).getHeadlineSmall();
                    i3 &= -897;
                } else {
                    headlineSmall = textStyle2;
                }
                if ((i2 & 16) != 0) {
                    j7 = ChaloTheme.a(composerStartRestartGroup, 6).B;
                    i3 &= -57345;
                } else {
                    j7 = j3;
                }
                if ((i2 & 32) != 0) {
                    j8 = ChaloTheme.a(composerStartRestartGroup, 6).t;
                    i3 &= -458753;
                } else {
                    j8 = j4;
                }
                if ((i2 & 64) != 0) {
                    i3 &= -3670017;
                    f3 = ChaloTheme.b(composerStartRestartGroup, 6).f;
                } else {
                    f3 = f;
                }
                i4 = i3;
                j9 = j7;
                j10 = j8;
            } else {
                if (i9 != 0) {
                    modifier4 = Modifier.INSTANCE;
                } else {
                    modifier4 = modifier2;
                }
                if ((i2 & 4) != 0) {
                    headlineSmall = ChaloTheme.e(composerStartRestartGroup, 6).getHeadlineSmall();
                    i3 &= -897;
                } else {
                    headlineSmall = textStyle2;
                }
                if ((i2 & 16) != 0) {
                    j7 = ChaloTheme.a(composerStartRestartGroup, 6).B;
                    i3 &= -57345;
                } else {
                    j7 = j3;
                }
                if ((i2 & 32) != 0) {
                    j8 = ChaloTheme.a(composerStartRestartGroup, 6).t;
                    i3 &= -458753;
                } else {
                    j8 = j4;
                }
                if ((i2 & 64) != 0) {
                    i3 &= -3670017;
                    f3 = ChaloTheme.b(composerStartRestartGroup, 6).f;
                } else {
                    f3 = f;
                }
                i4 = i3;
                j9 = j7;
                j10 = j8;
            }
            composerStartRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1366023635, i4, -1, "app.chalo.compose.components.buttons.ChaloButtonWithOrangeArrow (ChaloFilledButton.kt:279)");
            }
            if ((i4 & 29360128) == 8388608) {
            }
            objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (z2) {
                objRememberedValue = new fk(onClickAction, 0);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            } else {
                objRememberedValue = new fk(onClickAction, 0);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            Modifier modifier6 = modifier4;
            composer2 = composerStartRestartGroup;
            FlowLayoutKt.FlowRow(PaddingKt.m786paddingVpY3zN4$default(ClickableKt.m299clickableoSLSa3U$default(modifier4, false, null, null, null, (Function0) objRememberedValue, 15, null), 0.0f, ChaloTheme.b(composerStartRestartGroup, 6).f, 1, null), null, Arrangement.INSTANCE.getCenter(), null, 0, 0, ComposableLambdaKt.rememberComposableLambda(943195922, true, new Function3() { // from class: gk
                @Override // kotlin.jvm.functions.Function3
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    gk gkVar = this;
                    FlowRowScope FlowRow = (FlowRowScope) obj;
                    Composer composer3 = (Composer) obj2;
                    int iIntValue = ((Integer) obj3).intValue();
                    Intrinsics.i(FlowRow, "$this$FlowRow");
                    if ((iIntValue & 6) == 0) {
                        iIntValue |= composer3.changed(FlowRow) ? 4 : 2;
                    }
                    boolean z3 = false;
                    if (composer3.shouldExecute((iIntValue & 19) != 18, iIntValue & 1)) {
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(943195922, iIntValue, -1, "app.chalo.compose.components.buttons.ChaloButtonWithOrangeArrow.<anonymous> (ChaloFilledButton.kt:286)");
                        }
                        TransformingSequence transformingSequenceW = StringsKt.W(text, new String[]{" "});
                        Object objRememberedValue2 = composer3.rememberedValue();
                        if (objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue2 = new bj(19);
                            composer3.updateRememberedValue(objRememberedValue2);
                        }
                        List listQ = SequencesKt.q(SequencesKt.e(transformingSequenceW, (Function1) objRememberedValue2));
                        composer3.startReplaceGroup(173185430);
                        int i11 = 0;
                        for (Object obj4 : listQ) {
                            int i12 = i11 + 1;
                            if (i11 < 0) {
                                CollectionsKt.z0();
                                throw null;
                            }
                            String str = (String) obj4;
                            boolean z4 = i11 < CollectionsKt.K(listQ) ? true : z3;
                            long j11 = ChaloTheme.a(composer3, 6).f1915a;
                            Modifier modifierAlign = FlowRow.align(Modifier.INSTANCE, Alignment.INSTANCE.getCenterVertically());
                            boolean z5 = z3;
                            Composer composer4 = composer3;
                            TextStyle textStyle4 = headlineSmall;
                            TextKt.m2623TextNvy7gAk(str, modifierAlign, j11, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, textStyle4, composer4, 0, 0, 131064);
                            composer3 = composer4;
                            if (z4) {
                                composer3.startReplaceGroup(490899565);
                                TextKt.m2623TextNvy7gAk(" ", null, 0L, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, textStyle4, composer3, 6, 0, 131070);
                                composer3 = composer3;
                            } else {
                                composer3.startReplaceGroup(480614602);
                            }
                            composer3.endReplaceGroup();
                            z3 = z5;
                            i11 = i12;
                            gkVar = this;
                        }
                        boolean z6 = z3;
                        composer3.endReplaceGroup();
                        ChaloSpacersKt.w(composer3, z6 ? 1 : 0);
                        Modifier.Companion companion = Modifier.INSTANCE;
                        Alignment.Companion companion2 = Alignment.INSTANCE;
                        Modifier modifierM264backgroundbw27NRU$default = BackgroundKt.m264backgroundbw27NRU$default(ClipKt.clip(SizeKt.m828size3ABfNKs(FlowRow.align(companion, companion2.getCenterVertically()), ChaloTheme.b(composer3, 6).h), RoundedCornerShapeKt.getCircleShape()), j9, null, 2, null);
                        MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(companion2.getCenter(), z6);
                        long currentCompositeKeyHashCode = ComposablesKt.getCurrentCompositeKeyHashCode(composer3, z6 ? 1 : 0);
                        int i13 = (int) (currentCompositeKeyHashCode ^ (currentCompositeKeyHashCode >>> 32));
                        CompositionLocalMap currentCompositionLocalMap = composer3.getCurrentCompositionLocalMap();
                        Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composer3, modifierM264backgroundbw27NRU$default);
                        ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
                        Function0<ComposeUiNode> constructor = companion3.getConstructor();
                        if (composer3.getApplier() == null) {
                            ComposablesKt.invalidApplier();
                        }
                        composer3.startReusableNode();
                        if (composer3.getInserting()) {
                            composer3.createNode(constructor);
                        } else {
                            composer3.useNode();
                        }
                        Composer composerM3915constructorimpl = Updater.m3915constructorimpl(composer3);
                        pk0.v(companion3, composerM3915constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy, composerM3915constructorimpl, currentCompositionLocalMap);
                        Updater.m3923setimpl(composerM3915constructorimpl, modifierMaterializeModifier, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion3, composerM3915constructorimpl, Integer.valueOf(i13), composerM3915constructorimpl));
                        BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                        IconKt.m2070Iconww6aTOc(painter, (String) null, GraphicsLayerModifierKt.m4770graphicsLayer_6ThJ44$default(SizeKt.m828size3ABfNKs(companion, ChaloTheme.b(composer3, 6).f), 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 90.0f, 0.0f, 0L, null, false, null, 0L, 0L, 0, 0, null, 524031, null), j10, composer3, Painter.$stable | 48, 0);
                        composer3.endNode();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    } else {
                        composer3.skipToGroupEnd();
                    }
                    return Unit.f17538a;
                }
            }, composerStartRestartGroup, 54), composer2, 1573248, 58);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            j6 = j10;
            f2 = f3;
            j5 = j9;
            textStyle3 = headlineSmall;
            modifier3 = modifier6;
        } else {
            composer2 = composerStartRestartGroup;
            composer2.skipToGroupEnd();
            f2 = f;
            modifier3 = modifier2;
            textStyle3 = textStyle2;
            j5 = j3;
            j6 = j4;
        }
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new k6(text, modifier3, textStyle3, painter, j5, j6, f2, onClickAction, i, i2));
        }
    }

    public static final void d(Modifier modifier, ClickableTextUiState state, Composer composer, int i, int i2) {
        Modifier modifier2;
        int i3;
        Composer composer2;
        Modifier modifier3;
        Intrinsics.i(state, "state");
        Composer composerStartRestartGroup = composer.startRestartGroup(695944066);
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 6;
            modifier2 = modifier;
        } else if ((i & 6) == 0) {
            modifier2 = modifier;
            i3 = i | (composerStartRestartGroup.changed(modifier2) ? 4 : 2);
        } else {
            modifier2 = modifier;
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changed(state) ? 32 : 16;
        }
        if (composerStartRestartGroup.shouldExecute((i3 & 19) != 18, i3 & 1)) {
            Modifier modifier4 = i4 != 0 ? Modifier.INSTANCE : modifier2;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(695944066, i3, -1, "app.chalo.compose.components.buttons.ChaloClickableTextWithIcon (ChaloFilledButton.kt:330)");
            }
            boolean z = (i3 & 112) == 32;
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (z || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new fi(state, 5);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            Modifier modifierM299clickableoSLSa3U$default = ClickableKt.m299clickableoSLSa3U$default(modifier4, false, null, null, null, (Function0) objRememberedValue, 15, null);
            MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), Alignment.INSTANCE.getCenterVertically(), composerStartRestartGroup, 48);
            long currentCompositeKeyHashCode = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
            int i5 = (int) (currentCompositeKeyHashCode ^ (currentCompositeKeyHashCode >>> 32));
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierM299clickableoSLSa3U$default);
            ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor = companion.getConstructor();
            if (composerStartRestartGroup.getApplier() == null) {
                ComposablesKt.invalidApplier();
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.createNode(constructor);
            } else {
                composerStartRestartGroup.useNode();
            }
            Composer composerM3915constructorimpl = Updater.m3915constructorimpl(composerStartRestartGroup);
            pk0.v(companion, composerM3915constructorimpl, measurePolicyRowMeasurePolicy, composerM3915constructorimpl, currentCompositionLocalMap);
            Updater.m3923setimpl(composerM3915constructorimpl, modifierMaterializeModifier, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion, composerM3915constructorimpl, Integer.valueOf(i5), composerM3915constructorimpl));
            RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
            composerStartRestartGroup.startReplaceGroup(-1508344348);
            composerStartRestartGroup.endReplaceGroup();
            composer2 = composerStartRestartGroup;
            ChaloTextViewKt.a(null, state.f9922a, null, null, composer2, 0, 13);
            ImageUIState imageUIState = state.b;
            if (imageUIState == null) {
                composer2.startReplaceGroup(-1508169756);
            } else {
                composer2.startReplaceGroup(-1508169755);
                ChaloSpacersKt.C(composer2, 0);
                CommonImageKt.a(imageUIState, null, false, composer2, 0, 6);
                composer2 = composer2;
            }
            composer2.endReplaceGroup();
            composer2.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            modifier3 = modifier4;
        } else {
            composer2 = composerStartRestartGroup;
            composer2.skipToGroupEnd();
            modifier3 = modifier2;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new z(i, i2, 6, modifier3, state));
        }
    }

    /* JADX WARN: Code duplicated, block: B:101:0x012b  */
    /* JADX WARN: Code duplicated, block: B:102:0x0136  */
    /* JADX WARN: Code duplicated, block: B:105:0x013b  */
    /* JADX WARN: Code duplicated, block: B:106:0x0144  */
    /* JADX WARN: Code duplicated, block: B:109:0x0149  */
    /* JADX WARN: Code duplicated, block: B:111:0x0159  */
    /* JADX WARN: Code duplicated, block: B:114:0x0166  */
    /* JADX WARN: Code duplicated, block: B:117:0x01c7  */
    /* JADX WARN: Code duplicated, block: B:122:0x01d7  */
    /* JADX WARN: Code duplicated, block: B:125:0x021f  */
    /* JADX WARN: Code duplicated, block: B:127:0x0227  */
    /* JADX WARN: Code duplicated, block: B:130:0x0237  */
    /* JADX WARN: Code duplicated, block: B:132:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:30:0x005e  */
    /* JADX WARN: Code duplicated, block: B:32:0x0064  */
    /* JADX WARN: Code duplicated, block: B:33:0x0067  */
    /* JADX WARN: Code duplicated, block: B:37:0x006e  */
    /* JADX WARN: Code duplicated, block: B:39:0x0072  */
    /* JADX WARN: Code duplicated, block: B:41:0x007a  */
    /* JADX WARN: Code duplicated, block: B:42:0x007d  */
    /* JADX WARN: Code duplicated, block: B:45:0x0083  */
    /* JADX WARN: Code duplicated, block: B:48:0x008a  */
    /* JADX WARN: Code duplicated, block: B:50:0x008e  */
    /* JADX WARN: Code duplicated, block: B:52:0x0096  */
    /* JADX WARN: Code duplicated, block: B:53:0x0099  */
    /* JADX WARN: Code duplicated, block: B:56:0x009f  */
    /* JADX WARN: Code duplicated, block: B:59:0x00a6  */
    /* JADX WARN: Code duplicated, block: B:61:0x00aa  */
    /* JADX WARN: Code duplicated, block: B:63:0x00b2  */
    /* JADX WARN: Code duplicated, block: B:64:0x00b5  */
    /* JADX WARN: Code duplicated, block: B:67:0x00bb  */
    /* JADX WARN: Code duplicated, block: B:70:0x00c4  */
    /* JADX WARN: Code duplicated, block: B:72:0x00ca  */
    /* JADX WARN: Code duplicated, block: B:73:0x00cd  */
    /* JADX WARN: Code duplicated, block: B:77:0x00dd  */
    /* JADX WARN: Code duplicated, block: B:78:0x00df  */
    /* JADX WARN: Code duplicated, block: B:81:0x00e9  */
    /* JADX WARN: Code duplicated, block: B:96:0x0121 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:97:0x0123  */
    /* JADX WARN: Code duplicated, block: B:98:0x0125  */
    public static final void e(final Modifier modifier, final String text, boolean z, final long j, TextStyle textStyle, long j2, Shape shape, final Function0 onClickAction, Composer composer, final int i, final int i2) {
        int i3;
        TextStyle textStyle2;
        long j3;
        Shape shape2;
        boolean z2;
        Composer composer2;
        final boolean z3;
        final TextStyle textStyle3;
        final long j4;
        final Shape shape3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        boolean z4;
        TextStyle headlineSmall;
        long j5;
        Shape shape4;
        boolean z5;
        int i4;
        long j6;
        Composer composer3;
        boolean z6;
        Object objRememberedValue;
        int i5;
        int i6;
        Intrinsics.i(text, "text");
        Intrinsics.i(onClickAction, "onClickAction");
        Composer composerStartRestartGroup = composer.startRestartGroup(-749513712);
        if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changed(modifier) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changed(text) ? 32 : 16;
        }
        int i7 = i2 & 4;
        if (i7 == 0) {
            if ((i & 384) == 0) {
                i3 |= composerStartRestartGroup.changed(z) ? 256 : 128;
            }
            if ((i & 3072) == 0) {
                if (composerStartRestartGroup.changed(j)) {
                    i6 = 2048;
                } else {
                    i6 = 1024;
                }
                i3 |= i6;
            }
            if ((i & 24576) == 0) {
                if ((i2 & 16) == 0) {
                    textStyle2 = textStyle;
                    int i8 = composerStartRestartGroup.changed(textStyle2) ? 16384 : 8192;
                    i3 |= i8;
                } else {
                    textStyle2 = textStyle;
                }
                i3 |= i8;
            } else {
                textStyle2 = textStyle;
            }
            if ((196608 & i) == 0) {
                if ((i2 & 32) == 0) {
                    j3 = j2;
                    int i9 = composerStartRestartGroup.changed(j3) ? 131072 : 65536;
                    i3 |= i9;
                } else {
                    j3 = j2;
                }
                i3 |= i9;
            } else {
                j3 = j2;
            }
            if ((1572864 & i) == 0) {
                if ((i2 & 64) == 0) {
                    shape2 = shape;
                    int i10 = composerStartRestartGroup.changed(shape2) ? 1048576 : 524288;
                    i3 |= i10;
                } else {
                    shape2 = shape;
                }
                i3 |= i10;
            } else {
                shape2 = shape;
            }
            if ((12582912 & i) == 0) {
                if (composerStartRestartGroup.changedInstance(onClickAction)) {
                    i5 = 8388608;
                } else {
                    i5 = 4194304;
                }
                i3 |= i5;
            }
            if ((i3 & 4793491) != 4793490) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (composerStartRestartGroup.shouldExecute(z2, i3 & 1)) {
                composerStartRestartGroup.startDefaults();
                if ((i & 1) != 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                    if (i7 != 0) {
                        z4 = true;
                    } else {
                        z4 = z;
                    }
                    if ((i2 & 16) != 0) {
                        headlineSmall = ChaloTheme.e(composerStartRestartGroup, 6).getHeadlineSmall();
                        i3 &= -57345;
                    } else {
                        headlineSmall = textStyle2;
                    }
                    if ((i2 & 32) != 0) {
                        j5 = ChaloTheme.a(composerStartRestartGroup, 6).g;
                        i3 &= -458753;
                    } else {
                        j5 = j3;
                    }
                    if ((i2 & 64) != 0) {
                        shape4 = ChaloTheme.d(composerStartRestartGroup, 6).b;
                        i3 &= -3670017;
                    } else {
                        shape4 = shape2;
                    }
                    long j7 = j5;
                    z5 = z4;
                    i4 = i3;
                    j6 = j7;
                } else {
                    composerStartRestartGroup.skipToGroupEnd();
                    if ((i2 & 16) != 0) {
                        i3 &= -57345;
                    }
                    if ((i2 & 32) != 0) {
                        i3 &= -458753;
                    }
                    if ((i2 & 64) != 0) {
                        i3 &= -3670017;
                    }
                    composerStartRestartGroup = composerStartRestartGroup;
                    headlineSmall = textStyle2;
                    z5 = z;
                    long j8 = j3;
                    i4 = i3;
                    j6 = j8;
                    shape4 = shape2;
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-749513712, i4, -1, "app.chalo.compose.components.buttons.ChaloFilledButton (ChaloFilledButton.kt:166)");
                }
                ButtonDefaults buttonDefaults = ButtonDefaults.INSTANCE;
                int i11 = i4 >> 9;
                int i12 = ButtonDefaults.$stable;
                ButtonColors buttonColorsM1685textButtonColorsro_MJ88 = buttonDefaults.m1685textButtonColorsro_MJ88(j, 0L, 0L, 0L, composerStartRestartGroup, (i11 & 14) | (i12 << 12), 14);
                composer3 = composerStartRestartGroup;
                ButtonElevation buttonElevationM1675buttonElevationR_JCAzs = buttonDefaults.m1675buttonElevationR_JCAzs(ChaloTheme.c(composer3, 6).f1917a, ChaloTheme.c(composer3, 6).f1917a, ChaloTheme.c(composer3, 6).f1917a, ChaloTheme.c(composer3, 6).f1917a, ChaloTheme.c(composer3, 6).f1917a, composer3, i12 << 15, 0);
                z6 = (29360128 & i4) == 8388608;
                objRememberedValue = composer3.rememberedValue();
                if (z6 || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = new hb(onClickAction, 28);
                    composer3.updateRememberedValue(objRememberedValue);
                }
                boolean z7 = z5;
                Shape shape5 = shape4;
                ButtonKt.Button((Function0) objRememberedValue, modifier, z7, shape5, buttonColorsM1685textButtonColorsro_MJ88, buttonElevationM1675buttonElevationR_JCAzs, null, null, null, ComposableLambdaKt.rememberComposableLambda(1866866688, true, new zj(text, j6, headlineSmall, 2), composer3, 54), composer3, ((i4 << 3) & 112) | 805306368 | (i4 & 896) | (i11 & 7168), 448);
                composer2 = composer3;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                j4 = j6;
                textStyle3 = headlineSmall;
                z3 = z7;
                shape3 = shape5;
            } else {
                composer2 = composerStartRestartGroup;
                composer2.skipToGroupEnd();
                z3 = z;
                textStyle3 = textStyle2;
                j4 = j3;
                shape3 = shape2;
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: ck
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        ChaloFilledButtonKt.e(modifier, text, z3, j, textStyle3, j4, shape3, onClickAction, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                        return Unit.f17538a;
                    }
                });
            }
        }
        i3 |= 384;
        if ((i & 3072) == 0) {
            if (composerStartRestartGroup.changed(j)) {
                i6 = 2048;
            } else {
                i6 = 1024;
            }
            i3 |= i6;
        }
        if ((i & 24576) == 0) {
            if ((i2 & 16) == 0) {
                textStyle2 = textStyle;
                if (composerStartRestartGroup.changed(textStyle2)) {
                }
                i3 |= i8;
            } else {
                textStyle2 = textStyle;
            }
            i3 |= i8;
        } else {
            textStyle2 = textStyle;
        }
        if ((196608 & i) == 0) {
            if ((i2 & 32) == 0) {
                j3 = j2;
                if (composerStartRestartGroup.changed(j3)) {
                }
                i3 |= i9;
            } else {
                j3 = j2;
            }
            i3 |= i9;
        } else {
            j3 = j2;
        }
        if ((1572864 & i) == 0) {
            if ((i2 & 64) == 0) {
                shape2 = shape;
                if (composerStartRestartGroup.changed(shape2)) {
                }
                i3 |= i10;
            } else {
                shape2 = shape;
            }
            i3 |= i10;
        } else {
            shape2 = shape;
        }
        if ((12582912 & i) == 0) {
            if (composerStartRestartGroup.changedInstance(onClickAction)) {
                i5 = 8388608;
            } else {
                i5 = 4194304;
            }
            i3 |= i5;
        }
        if ((i3 & 4793491) != 4793490) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (composerStartRestartGroup.shouldExecute(z2, i3 & 1)) {
            composerStartRestartGroup.startDefaults();
            if ((i & 1) != 0) {
                if (i7 != 0) {
                    z4 = true;
                } else {
                    z4 = z;
                }
                if ((i2 & 16) != 0) {
                    headlineSmall = ChaloTheme.e(composerStartRestartGroup, 6).getHeadlineSmall();
                    i3 &= -57345;
                } else {
                    headlineSmall = textStyle2;
                }
                if ((i2 & 32) != 0) {
                    j5 = ChaloTheme.a(composerStartRestartGroup, 6).g;
                    i3 &= -458753;
                } else {
                    j5 = j3;
                }
                if ((i2 & 64) != 0) {
                    shape4 = ChaloTheme.d(composerStartRestartGroup, 6).b;
                    i3 &= -3670017;
                } else {
                    shape4 = shape2;
                }
                long j9 = j5;
                z5 = z4;
                i4 = i3;
                j6 = j9;
            } else {
                if (i7 != 0) {
                    z4 = true;
                } else {
                    z4 = z;
                }
                if ((i2 & 16) != 0) {
                    headlineSmall = ChaloTheme.e(composerStartRestartGroup, 6).getHeadlineSmall();
                    i3 &= -57345;
                } else {
                    headlineSmall = textStyle2;
                }
                if ((i2 & 32) != 0) {
                    j5 = ChaloTheme.a(composerStartRestartGroup, 6).g;
                    i3 &= -458753;
                } else {
                    j5 = j3;
                }
                if ((i2 & 64) != 0) {
                    shape4 = ChaloTheme.d(composerStartRestartGroup, 6).b;
                    i3 &= -3670017;
                } else {
                    shape4 = shape2;
                }
                long j10 = j5;
                z5 = z4;
                i4 = i3;
                j6 = j10;
            }
            composerStartRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-749513712, i4, -1, "app.chalo.compose.components.buttons.ChaloFilledButton (ChaloFilledButton.kt:166)");
            }
            ButtonDefaults buttonDefaults2 = ButtonDefaults.INSTANCE;
            int i13 = i4 >> 9;
            int i14 = ButtonDefaults.$stable;
            ButtonColors buttonColorsM1685textButtonColorsro_MJ89 = buttonDefaults2.m1685textButtonColorsro_MJ88(j, 0L, 0L, 0L, composerStartRestartGroup, (i13 & 14) | (i14 << 12), 14);
            composer3 = composerStartRestartGroup;
            ButtonElevation buttonElevationM1675buttonElevationR_JCAzs2 = buttonDefaults2.m1675buttonElevationR_JCAzs(ChaloTheme.c(composer3, 6).f1917a, ChaloTheme.c(composer3, 6).f1917a, ChaloTheme.c(composer3, 6).f1917a, ChaloTheme.c(composer3, 6).f1917a, ChaloTheme.c(composer3, 6).f1917a, composer3, i14 << 15, 0);
            if ((29360128 & i4) == 8388608) {
            }
            objRememberedValue = composer3.rememberedValue();
            if (z6) {
                objRememberedValue = new hb(onClickAction, 28);
                composer3.updateRememberedValue(objRememberedValue);
            } else {
                objRememberedValue = new hb(onClickAction, 28);
                composer3.updateRememberedValue(objRememberedValue);
            }
            boolean z8 = z5;
            Shape shape6 = shape4;
            ButtonKt.Button((Function0) objRememberedValue, modifier, z8, shape6, buttonColorsM1685textButtonColorsro_MJ89, buttonElevationM1675buttonElevationR_JCAzs2, null, null, null, ComposableLambdaKt.rememberComposableLambda(1866866688, true, new zj(text, j6, headlineSmall, 2), composer3, 54), composer3, ((i4 << 3) & 112) | 805306368 | (i4 & 896) | (i13 & 7168), 448);
            composer2 = composer3;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            j4 = j6;
            textStyle3 = headlineSmall;
            z3 = z8;
            shape3 = shape6;
        } else {
            composer2 = composerStartRestartGroup;
            composer2.skipToGroupEnd();
            z3 = z;
            textStyle3 = textStyle2;
            j4 = j3;
            shape3 = shape2;
        }
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: ck
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    ChaloFilledButtonKt.e(modifier, text, z3, j, textStyle3, j4, shape3, onClickAction, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                    return Unit.f17538a;
                }
            });
        }
    }

    /* JADX WARN: Code duplicated, block: B:106:0x012d A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:107:0x012f  */
    /* JADX WARN: Code duplicated, block: B:109:0x0133  */
    /* JADX WARN: Code duplicated, block: B:112:0x013b  */
    /* JADX WARN: Code duplicated, block: B:115:0x014a  */
    /* JADX WARN: Code duplicated, block: B:118:0x0157  */
    /* JADX WARN: Code duplicated, block: B:121:0x0164  */
    /* JADX WARN: Code duplicated, block: B:124:0x0174  */
    /* JADX WARN: Code duplicated, block: B:127:0x01ae  */
    /* JADX WARN: Code duplicated, block: B:129:0x01ba  */
    /* JADX WARN: Code duplicated, block: B:132:0x01c9  */
    /* JADX WARN: Code duplicated, block: B:134:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:23:0x004a  */
    /* JADX WARN: Code duplicated, block: B:25:0x004f  */
    /* JADX WARN: Code duplicated, block: B:27:0x0053  */
    /* JADX WARN: Code duplicated, block: B:29:0x005b  */
    /* JADX WARN: Code duplicated, block: B:30:0x005e  */
    /* JADX WARN: Code duplicated, block: B:34:0x0065  */
    /* JADX WARN: Code duplicated, block: B:36:0x0069  */
    /* JADX WARN: Code duplicated, block: B:38:0x0071  */
    /* JADX WARN: Code duplicated, block: B:39:0x0074  */
    /* JADX WARN: Code duplicated, block: B:42:0x007a  */
    /* JADX WARN: Code duplicated, block: B:45:0x0080  */
    /* JADX WARN: Code duplicated, block: B:47:0x0084  */
    /* JADX WARN: Code duplicated, block: B:49:0x008c  */
    /* JADX WARN: Code duplicated, block: B:50:0x008f  */
    /* JADX WARN: Code duplicated, block: B:53:0x0095  */
    /* JADX WARN: Code duplicated, block: B:56:0x009c  */
    /* JADX WARN: Code duplicated, block: B:58:0x00a0  */
    /* JADX WARN: Code duplicated, block: B:60:0x00a8  */
    /* JADX WARN: Code duplicated, block: B:61:0x00ab  */
    /* JADX WARN: Code duplicated, block: B:64:0x00b1  */
    /* JADX WARN: Code duplicated, block: B:67:0x00b8  */
    /* JADX WARN: Code duplicated, block: B:69:0x00be  */
    /* JADX WARN: Code duplicated, block: B:72:0x00c7  */
    /* JADX WARN: Code duplicated, block: B:74:0x00cb  */
    /* JADX WARN: Code duplicated, block: B:77:0x00d2  */
    /* JADX WARN: Code duplicated, block: B:79:0x00d8  */
    /* JADX WARN: Code duplicated, block: B:80:0x00db  */
    /* JADX WARN: Code duplicated, block: B:84:0x00e9  */
    /* JADX WARN: Code duplicated, block: B:85:0x00ec  */
    /* JADX WARN: Code duplicated, block: B:88:0x00f5  */
    /* JADX WARN: Code duplicated, block: B:90:0x0105  */
    public static final void f(String text, boolean z, Modifier modifier, TextStyle textStyle, Shape shape, float f, long j, Function0 onClickAction, Composer composer, int i, int i2) {
        int i3;
        boolean z2;
        int i4;
        Modifier modifier2;
        int i5;
        TextStyle headlineSmall;
        Shape shape2;
        float f2;
        long j2;
        boolean z3;
        boolean z4;
        Modifier modifier3;
        TextStyle textStyle2;
        Shape shape3;
        float f3;
        long j3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        int i6;
        int i7;
        int i8;
        Intrinsics.i(text, "text");
        Intrinsics.i(onClickAction, "onClickAction");
        Composer composerStartRestartGroup = composer.startRestartGroup(1109052936);
        if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changed(text) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i9 = i2 & 2;
        if (i9 == 0) {
            if ((i & 48) == 0) {
                z2 = z;
                i3 |= composerStartRestartGroup.changed(z2) ? 32 : 16;
            }
            i4 = i2 & 4;
            if (i4 != 0) {
                if ((i & 384) == 0) {
                    modifier2 = modifier;
                    if (composerStartRestartGroup.changed(modifier2)) {
                        i5 = 256;
                    } else {
                        i5 = 128;
                    }
                    i3 |= i5;
                }
                if ((i & 3072) == 0) {
                    if ((i2 & 8) == 0) {
                        headlineSmall = textStyle;
                        int i10 = composerStartRestartGroup.changed(headlineSmall) ? 2048 : 1024;
                        i3 |= i10;
                    } else {
                        headlineSmall = textStyle;
                    }
                    i3 |= i10;
                } else {
                    headlineSmall = textStyle;
                }
                if ((i & 24576) == 0) {
                    if ((i2 & 16) == 0) {
                        shape2 = shape;
                        int i11 = composerStartRestartGroup.changed(shape2) ? 16384 : 8192;
                        i3 |= i11;
                    } else {
                        shape2 = shape;
                    }
                    i3 |= i11;
                } else {
                    shape2 = shape;
                }
                if ((196608 & i) == 0) {
                    if ((i2 & 32) == 0) {
                        f2 = f;
                        int i12 = composerStartRestartGroup.changed(f2) ? 131072 : 65536;
                        i3 |= i12;
                    } else {
                        f2 = f;
                    }
                    i3 |= i12;
                } else {
                    f2 = f;
                }
                if ((1572864 & i) == 0) {
                    j2 = j;
                    if ((i2 & 64) == 0 || !composerStartRestartGroup.changed(j2)) {
                        i8 = 524288;
                    } else {
                        i8 = 1048576;
                    }
                    i3 |= i8;
                } else {
                    j2 = j;
                }
                if ((12582912 & i) == 0) {
                    if (composerStartRestartGroup.changedInstance(onClickAction)) {
                        i7 = 8388608;
                    } else {
                        i7 = 4194304;
                    }
                    i3 |= i7;
                }
                if ((4793491 & i3) != 4793490) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (composerStartRestartGroup.shouldExecute(z3, i3 & 1)) {
                    composerStartRestartGroup.startDefaults();
                    if ((i & 1) != 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                        if (i9 != 0) {
                            z2 = true;
                        }
                        if (i4 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        }
                        if ((i2 & 8) != 0) {
                            i3 &= -7169;
                            headlineSmall = ChaloTheme.e(composerStartRestartGroup, 6).getHeadlineSmall();
                        }
                        if ((i2 & 16) != 0) {
                            i3 &= -57345;
                            shape2 = ChaloTheme.d(composerStartRestartGroup, 6).b;
                        }
                        if ((i2 & 32) != 0) {
                            i3 &= -458753;
                            f2 = ChaloTheme.b(composerStartRestartGroup, 6).n;
                        }
                        if ((i2 & 64) != 0) {
                            j2 = ChaloTheme.a(composerStartRestartGroup, 6).A;
                            i3 &= -3670017;
                        }
                    } else {
                        composerStartRestartGroup.skipToGroupEnd();
                        if ((i2 & 8) != 0) {
                            i3 &= -7169;
                        }
                        if ((i2 & 16) != 0) {
                            i3 &= -57345;
                        }
                        if ((i2 & 32) != 0) {
                            i3 &= -458753;
                        }
                        if ((i2 & 64) != 0) {
                            i3 &= -3670017;
                        }
                    }
                    i6 = i3;
                    z4 = z2;
                    TextStyle textStyle3 = headlineSmall;
                    long j4 = j2;
                    Modifier modifier4 = modifier2;
                    float f4 = f2;
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1109052936, i6, -1, "app.chalo.compose.components.buttons.ChaloGreyButton (ChaloFilledButton.kt:142)");
                    }
                    int i13 = i6 << 3;
                    e(modifier4.then(SizeKt.m814height3ABfNKs(Modifier.INSTANCE, f4)), text, z4, j4, textStyle3, 0L, shape2, onClickAction, composerStartRestartGroup, (i13 & 57344) | (i13 & 1008) | ((i6 >> 9) & 7168) | ((i6 << 6) & 3670016) | (i6 & 29360128), 32);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    textStyle2 = textStyle3;
                    shape3 = shape2;
                    j3 = j4;
                    modifier3 = modifier4;
                    f3 = f4;
                } else {
                    composerStartRestartGroup.skipToGroupEnd();
                    z4 = z2;
                    modifier3 = modifier2;
                    textStyle2 = headlineSmall;
                    shape3 = shape2;
                    f3 = f2;
                    j3 = j2;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                    scopeUpdateScopeEndRestartGroup.updateScope(new yj(text, z4, modifier3, textStyle2, shape3, f3, j3, onClickAction, i, i2));
                }
            }
            i3 |= 384;
            modifier2 = modifier;
            if ((i & 3072) == 0) {
                if ((i2 & 8) == 0) {
                    headlineSmall = textStyle;
                    if (composerStartRestartGroup.changed(headlineSmall)) {
                    }
                    i3 |= i10;
                } else {
                    headlineSmall = textStyle;
                }
                i3 |= i10;
            } else {
                headlineSmall = textStyle;
            }
            if ((i & 24576) == 0) {
                if ((i2 & 16) == 0) {
                    shape2 = shape;
                    if (composerStartRestartGroup.changed(shape2)) {
                    }
                    i3 |= i11;
                } else {
                    shape2 = shape;
                }
                i3 |= i11;
            } else {
                shape2 = shape;
            }
            if ((196608 & i) == 0) {
                if ((i2 & 32) == 0) {
                    f2 = f;
                    if (composerStartRestartGroup.changed(f2)) {
                    }
                    i3 |= i12;
                } else {
                    f2 = f;
                }
                i3 |= i12;
            } else {
                f2 = f;
            }
            if ((1572864 & i) == 0) {
                j2 = j;
                if ((i2 & 64) == 0) {
                    i8 = 524288;
                } else {
                    i8 = 524288;
                }
                i3 |= i8;
            } else {
                j2 = j;
            }
            if ((12582912 & i) == 0) {
                if (composerStartRestartGroup.changedInstance(onClickAction)) {
                    i7 = 8388608;
                } else {
                    i7 = 4194304;
                }
                i3 |= i7;
            }
            if ((4793491 & i3) != 4793490) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (composerStartRestartGroup.shouldExecute(z3, i3 & 1)) {
                composerStartRestartGroup.startDefaults();
                if ((i & 1) != 0) {
                    if (i9 != 0) {
                        z2 = true;
                    }
                    if (i4 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    }
                    if ((i2 & 8) != 0) {
                        i3 &= -7169;
                        headlineSmall = ChaloTheme.e(composerStartRestartGroup, 6).getHeadlineSmall();
                    }
                    if ((i2 & 16) != 0) {
                        i3 &= -57345;
                        shape2 = ChaloTheme.d(composerStartRestartGroup, 6).b;
                    }
                    if ((i2 & 32) != 0) {
                        i3 &= -458753;
                        f2 = ChaloTheme.b(composerStartRestartGroup, 6).n;
                    }
                    if ((i2 & 64) != 0) {
                        j2 = ChaloTheme.a(composerStartRestartGroup, 6).A;
                        i3 &= -3670017;
                    }
                } else {
                    if (i9 != 0) {
                        z2 = true;
                    }
                    if (i4 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    }
                    if ((i2 & 8) != 0) {
                        i3 &= -7169;
                        headlineSmall = ChaloTheme.e(composerStartRestartGroup, 6).getHeadlineSmall();
                    }
                    if ((i2 & 16) != 0) {
                        i3 &= -57345;
                        shape2 = ChaloTheme.d(composerStartRestartGroup, 6).b;
                    }
                    if ((i2 & 32) != 0) {
                        i3 &= -458753;
                        f2 = ChaloTheme.b(composerStartRestartGroup, 6).n;
                    }
                    if ((i2 & 64) != 0) {
                        j2 = ChaloTheme.a(composerStartRestartGroup, 6).A;
                        i3 &= -3670017;
                    }
                }
                i6 = i3;
                z4 = z2;
                TextStyle textStyle4 = headlineSmall;
                long j5 = j2;
                Modifier modifier5 = modifier2;
                float f5 = f2;
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1109052936, i6, -1, "app.chalo.compose.components.buttons.ChaloGreyButton (ChaloFilledButton.kt:142)");
                }
                int i14 = i6 << 3;
                e(modifier5.then(SizeKt.m814height3ABfNKs(Modifier.INSTANCE, f5)), text, z4, j5, textStyle4, 0L, shape2, onClickAction, composerStartRestartGroup, (i14 & 57344) | (i14 & 1008) | ((i6 >> 9) & 7168) | ((i6 << 6) & 3670016) | (i6 & 29360128), 32);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                textStyle2 = textStyle4;
                shape3 = shape2;
                j3 = j5;
                modifier3 = modifier5;
                f3 = f5;
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                z4 = z2;
                modifier3 = modifier2;
                textStyle2 = headlineSmall;
                shape3 = shape2;
                f3 = f2;
                j3 = j2;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new yj(text, z4, modifier3, textStyle2, shape3, f3, j3, onClickAction, i, i2));
            }
        }
        i3 |= 48;
        z2 = z;
        i4 = i2 & 4;
        if (i4 != 0) {
            if ((i & 384) == 0) {
                modifier2 = modifier;
                if (composerStartRestartGroup.changed(modifier2)) {
                    i5 = 256;
                } else {
                    i5 = 128;
                }
                i3 |= i5;
            }
            if ((i & 3072) == 0) {
                if ((i2 & 8) == 0) {
                    headlineSmall = textStyle;
                    if (composerStartRestartGroup.changed(headlineSmall)) {
                    }
                    i3 |= i10;
                } else {
                    headlineSmall = textStyle;
                }
                i3 |= i10;
            } else {
                headlineSmall = textStyle;
            }
            if ((i & 24576) == 0) {
                if ((i2 & 16) == 0) {
                    shape2 = shape;
                    if (composerStartRestartGroup.changed(shape2)) {
                    }
                    i3 |= i11;
                } else {
                    shape2 = shape;
                }
                i3 |= i11;
            } else {
                shape2 = shape;
            }
            if ((196608 & i) == 0) {
                if ((i2 & 32) == 0) {
                    f2 = f;
                    if (composerStartRestartGroup.changed(f2)) {
                    }
                    i3 |= i12;
                } else {
                    f2 = f;
                }
                i3 |= i12;
            } else {
                f2 = f;
            }
            if ((1572864 & i) == 0) {
                j2 = j;
                if ((i2 & 64) == 0) {
                    i8 = 524288;
                } else {
                    i8 = 524288;
                }
                i3 |= i8;
            } else {
                j2 = j;
            }
            if ((12582912 & i) == 0) {
                if (composerStartRestartGroup.changedInstance(onClickAction)) {
                    i7 = 8388608;
                } else {
                    i7 = 4194304;
                }
                i3 |= i7;
            }
            if ((4793491 & i3) != 4793490) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (composerStartRestartGroup.shouldExecute(z3, i3 & 1)) {
                composerStartRestartGroup.startDefaults();
                if ((i & 1) != 0) {
                    if (i9 != 0) {
                        z2 = true;
                    }
                    if (i4 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    }
                    if ((i2 & 8) != 0) {
                        i3 &= -7169;
                        headlineSmall = ChaloTheme.e(composerStartRestartGroup, 6).getHeadlineSmall();
                    }
                    if ((i2 & 16) != 0) {
                        i3 &= -57345;
                        shape2 = ChaloTheme.d(composerStartRestartGroup, 6).b;
                    }
                    if ((i2 & 32) != 0) {
                        i3 &= -458753;
                        f2 = ChaloTheme.b(composerStartRestartGroup, 6).n;
                    }
                    if ((i2 & 64) != 0) {
                        j2 = ChaloTheme.a(composerStartRestartGroup, 6).A;
                        i3 &= -3670017;
                    }
                } else {
                    if (i9 != 0) {
                        z2 = true;
                    }
                    if (i4 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    }
                    if ((i2 & 8) != 0) {
                        i3 &= -7169;
                        headlineSmall = ChaloTheme.e(composerStartRestartGroup, 6).getHeadlineSmall();
                    }
                    if ((i2 & 16) != 0) {
                        i3 &= -57345;
                        shape2 = ChaloTheme.d(composerStartRestartGroup, 6).b;
                    }
                    if ((i2 & 32) != 0) {
                        i3 &= -458753;
                        f2 = ChaloTheme.b(composerStartRestartGroup, 6).n;
                    }
                    if ((i2 & 64) != 0) {
                        j2 = ChaloTheme.a(composerStartRestartGroup, 6).A;
                        i3 &= -3670017;
                    }
                }
                i6 = i3;
                z4 = z2;
                TextStyle textStyle5 = headlineSmall;
                long j6 = j2;
                Modifier modifier6 = modifier2;
                float f6 = f2;
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1109052936, i6, -1, "app.chalo.compose.components.buttons.ChaloGreyButton (ChaloFilledButton.kt:142)");
                }
                int i15 = i6 << 3;
                e(modifier6.then(SizeKt.m814height3ABfNKs(Modifier.INSTANCE, f6)), text, z4, j6, textStyle5, 0L, shape2, onClickAction, composerStartRestartGroup, (i15 & 57344) | (i15 & 1008) | ((i6 >> 9) & 7168) | ((i6 << 6) & 3670016) | (i6 & 29360128), 32);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                textStyle2 = textStyle5;
                shape3 = shape2;
                j3 = j6;
                modifier3 = modifier6;
                f3 = f6;
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                z4 = z2;
                modifier3 = modifier2;
                textStyle2 = headlineSmall;
                shape3 = shape2;
                f3 = f2;
                j3 = j2;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new yj(text, z4, modifier3, textStyle2, shape3, f3, j3, onClickAction, i, i2));
            }
        }
        i3 |= 384;
        modifier2 = modifier;
        if ((i & 3072) == 0) {
            if ((i2 & 8) == 0) {
                headlineSmall = textStyle;
                if (composerStartRestartGroup.changed(headlineSmall)) {
                }
                i3 |= i10;
            } else {
                headlineSmall = textStyle;
            }
            i3 |= i10;
        } else {
            headlineSmall = textStyle;
        }
        if ((i & 24576) == 0) {
            if ((i2 & 16) == 0) {
                shape2 = shape;
                if (composerStartRestartGroup.changed(shape2)) {
                }
                i3 |= i11;
            } else {
                shape2 = shape;
            }
            i3 |= i11;
        } else {
            shape2 = shape;
        }
        if ((196608 & i) == 0) {
            if ((i2 & 32) == 0) {
                f2 = f;
                if (composerStartRestartGroup.changed(f2)) {
                }
                i3 |= i12;
            } else {
                f2 = f;
            }
            i3 |= i12;
        } else {
            f2 = f;
        }
        if ((1572864 & i) == 0) {
            j2 = j;
            if ((i2 & 64) == 0) {
                i8 = 524288;
            } else {
                i8 = 524288;
            }
            i3 |= i8;
        } else {
            j2 = j;
        }
        if ((12582912 & i) == 0) {
            if (composerStartRestartGroup.changedInstance(onClickAction)) {
                i7 = 8388608;
            } else {
                i7 = 4194304;
            }
            i3 |= i7;
        }
        if ((4793491 & i3) != 4793490) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (composerStartRestartGroup.shouldExecute(z3, i3 & 1)) {
            composerStartRestartGroup.startDefaults();
            if ((i & 1) != 0) {
                if (i9 != 0) {
                    z2 = true;
                }
                if (i4 != 0) {
                    modifier2 = Modifier.INSTANCE;
                }
                if ((i2 & 8) != 0) {
                    i3 &= -7169;
                    headlineSmall = ChaloTheme.e(composerStartRestartGroup, 6).getHeadlineSmall();
                }
                if ((i2 & 16) != 0) {
                    i3 &= -57345;
                    shape2 = ChaloTheme.d(composerStartRestartGroup, 6).b;
                }
                if ((i2 & 32) != 0) {
                    i3 &= -458753;
                    f2 = ChaloTheme.b(composerStartRestartGroup, 6).n;
                }
                if ((i2 & 64) != 0) {
                    j2 = ChaloTheme.a(composerStartRestartGroup, 6).A;
                    i3 &= -3670017;
                }
            } else {
                if (i9 != 0) {
                    z2 = true;
                }
                if (i4 != 0) {
                    modifier2 = Modifier.INSTANCE;
                }
                if ((i2 & 8) != 0) {
                    i3 &= -7169;
                    headlineSmall = ChaloTheme.e(composerStartRestartGroup, 6).getHeadlineSmall();
                }
                if ((i2 & 16) != 0) {
                    i3 &= -57345;
                    shape2 = ChaloTheme.d(composerStartRestartGroup, 6).b;
                }
                if ((i2 & 32) != 0) {
                    i3 &= -458753;
                    f2 = ChaloTheme.b(composerStartRestartGroup, 6).n;
                }
                if ((i2 & 64) != 0) {
                    j2 = ChaloTheme.a(composerStartRestartGroup, 6).A;
                    i3 &= -3670017;
                }
            }
            i6 = i3;
            z4 = z2;
            TextStyle textStyle6 = headlineSmall;
            long j7 = j2;
            Modifier modifier7 = modifier2;
            float f7 = f2;
            composerStartRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1109052936, i6, -1, "app.chalo.compose.components.buttons.ChaloGreyButton (ChaloFilledButton.kt:142)");
            }
            int i16 = i6 << 3;
            e(modifier7.then(SizeKt.m814height3ABfNKs(Modifier.INSTANCE, f7)), text, z4, j7, textStyle6, 0L, shape2, onClickAction, composerStartRestartGroup, (i16 & 57344) | (i16 & 1008) | ((i6 >> 9) & 7168) | ((i6 << 6) & 3670016) | (i6 & 29360128), 32);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            textStyle2 = textStyle6;
            shape3 = shape2;
            j3 = j7;
            modifier3 = modifier7;
            f3 = f7;
        } else {
            composerStartRestartGroup.skipToGroupEnd();
            z4 = z2;
            modifier3 = modifier2;
            textStyle2 = headlineSmall;
            shape3 = shape2;
            f3 = f2;
            j3 = j2;
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new yj(text, z4, modifier3, textStyle2, shape3, f3, j3, onClickAction, i, i2));
        }
    }

    /* JADX WARN: Code duplicated, block: B:108:0x0153 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:109:0x0155  */
    /* JADX WARN: Code duplicated, block: B:110:0x0158  */
    /* JADX WARN: Code duplicated, block: B:113:0x015d  */
    /* JADX WARN: Code duplicated, block: B:114:0x016a  */
    /* JADX WARN: Code duplicated, block: B:117:0x0176  */
    /* JADX WARN: Code duplicated, block: B:118:0x0181  */
    /* JADX WARN: Code duplicated, block: B:120:0x0185  */
    /* JADX WARN: Code duplicated, block: B:121:0x0188  */
    /* JADX WARN: Code duplicated, block: B:124:0x018e  */
    /* JADX WARN: Code duplicated, block: B:126:0x019a  */
    /* JADX WARN: Code duplicated, block: B:129:0x01ce  */
    /* JADX WARN: Code duplicated, block: B:131:0x01e8  */
    /* JADX WARN: Code duplicated, block: B:134:0x01f6  */
    /* JADX WARN: Code duplicated, block: B:136:0x0200  */
    /* JADX WARN: Code duplicated, block: B:137:0x0203  */
    /* JADX WARN: Code duplicated, block: B:140:0x0250  */
    /* JADX WARN: Code duplicated, block: B:145:0x0260  */
    /* JADX WARN: Code duplicated, block: B:148:0x02b0  */
    /* JADX WARN: Code duplicated, block: B:150:0x02c4  */
    /* JADX WARN: Code duplicated, block: B:153:0x02d9  */
    /* JADX WARN: Code duplicated, block: B:155:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:55:0x00a3  */
    /* JADX WARN: Code duplicated, block: B:57:0x00a7  */
    /* JADX WARN: Code duplicated, block: B:59:0x00af  */
    /* JADX WARN: Code duplicated, block: B:60:0x00b2  */
    /* JADX WARN: Code duplicated, block: B:63:0x00b8  */
    /* JADX WARN: Code duplicated, block: B:66:0x00bf  */
    /* JADX WARN: Code duplicated, block: B:69:0x00c7  */
    /* JADX WARN: Code duplicated, block: B:74:0x00d8  */
    /* JADX WARN: Code duplicated, block: B:76:0x00dc  */
    /* JADX WARN: Code duplicated, block: B:79:0x00e8  */
    /* JADX WARN: Code duplicated, block: B:81:0x00ee  */
    /* JADX WARN: Code duplicated, block: B:82:0x00f1  */
    /* JADX WARN: Code duplicated, block: B:86:0x0101  */
    /* JADX WARN: Code duplicated, block: B:87:0x0103  */
    /* JADX WARN: Code duplicated, block: B:90:0x010d  */
    public static final void g(Modifier modifier, final String text, TextStyle textStyle, long j, Shape shape, boolean z, float f, ButtonElevation buttonElevation, long j2, final Function0 onClickAction, Composer composer, final int i, final int i2) {
        Modifier modifier2;
        int i3;
        TextStyle textStyle2;
        final Shape shape2;
        boolean z2;
        float f2;
        boolean z3;
        final Modifier modifier3;
        final TextStyle textStyle3;
        final boolean z4;
        final float f3;
        final long j3;
        final ButtonElevation buttonElevation2;
        final long j4;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Modifier modifier4;
        TextStyle headlineSmall;
        Shape shape3;
        boolean z5;
        float f4;
        int i4;
        ButtonElevation buttonElevationM1675buttonElevationR_JCAzs;
        int i5;
        long j5;
        int i6;
        long j6;
        int i7;
        float f5;
        boolean z6;
        Object objRememberedValue;
        int i8;
        int i9;
        Intrinsics.i(text, "text");
        Intrinsics.i(onClickAction, "onClickAction");
        Composer composerStartRestartGroup = composer.startRestartGroup(-1651123275);
        int i10 = i2 & 1;
        if (i10 != 0) {
            i3 = i | 6;
            modifier2 = modifier;
        } else if ((i & 6) == 0) {
            modifier2 = modifier;
            i3 = (composerStartRestartGroup.changed(modifier2) ? 4 : 2) | i;
        } else {
            modifier2 = modifier;
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changed(text) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            if ((i2 & 4) == 0) {
                textStyle2 = textStyle;
                int i11 = composerStartRestartGroup.changed(textStyle2) ? 256 : 128;
                i3 |= i11;
            } else {
                textStyle2 = textStyle;
            }
            i3 |= i11;
        } else {
            textStyle2 = textStyle;
        }
        int i12 = i3 | 3072;
        if ((i & 24576) == 0) {
            if ((i2 & 16) == 0) {
                shape2 = shape;
                int i13 = composerStartRestartGroup.changed(shape2) ? 16384 : 8192;
                i12 |= i13;
            } else {
                shape2 = shape;
            }
            i12 |= i13;
        } else {
            shape2 = shape;
        }
        int i14 = i2 & 32;
        if (i14 == 0) {
            if ((196608 & i) == 0) {
                z2 = z;
                i12 |= composerStartRestartGroup.changed(z2) ? 131072 : 65536;
            }
            if ((1572864 & i) == 0) {
                if ((i2 & 64) == 0) {
                    f2 = f;
                    int i15 = composerStartRestartGroup.changed(f2) ? 1048576 : 524288;
                    i12 |= i15;
                } else {
                    f2 = f;
                }
                i12 |= i15;
            } else {
                f2 = f;
            }
            if ((12582912 & i) == 0) {
                i12 |= 4194304;
            }
            if ((100663296 & i) != 0) {
                if ((i2 & 256) == 0 || !composerStartRestartGroup.changed(j2)) {
                    i9 = 33554432;
                } else {
                    i9 = AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL;
                }
                i12 |= i9;
            }
            if ((i & 805306368) == 0) {
                if (composerStartRestartGroup.changedInstance(onClickAction)) {
                    i8 = 536870912;
                } else {
                    i8 = 268435456;
                }
                i12 |= i8;
            }
            if ((i12 & 306783379) != 306783378) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (composerStartRestartGroup.shouldExecute(z3, i12 & 1)) {
                composerStartRestartGroup.startDefaults();
                if ((i & 1) != 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                    if (i10 != 0) {
                        modifier4 = Modifier.INSTANCE;
                    } else {
                        modifier4 = modifier2;
                    }
                    if ((i2 & 4) != 0) {
                        i12 &= -897;
                        headlineSmall = ChaloTheme.e(composerStartRestartGroup, 6).getHeadlineSmall();
                    } else {
                        headlineSmall = textStyle2;
                    }
                    long jM4642getWhite0d7_KjU = Color.INSTANCE.m4642getWhite0d7_KjU();
                    if ((i2 & 16) != 0) {
                        i12 &= -57345;
                        shape3 = ChaloTheme.d(composerStartRestartGroup, 6).b;
                    } else {
                        shape3 = shape2;
                    }
                    if (i14 != 0) {
                        z5 = true;
                    } else {
                        z5 = z2;
                    }
                    if ((i2 & 64) != 0) {
                        i12 &= -3670017;
                        f4 = ChaloTheme.b(composerStartRestartGroup, 6).n;
                    } else {
                        f4 = f2;
                    }
                    i4 = i12;
                    buttonElevationM1675buttonElevationR_JCAzs = ButtonDefaults.INSTANCE.m1675buttonElevationR_JCAzs(ChaloTheme.c(composerStartRestartGroup, 6).f1917a, ChaloTheme.c(composerStartRestartGroup, 6).f1917a, ChaloTheme.c(composerStartRestartGroup, 6).f1917a, ChaloTheme.c(composerStartRestartGroup, 6).f1917a, ChaloTheme.c(composerStartRestartGroup, 6).f1917a, composerStartRestartGroup, ButtonDefaults.$stable << 15, 0);
                    i5 = i4 & (-29360129);
                    if ((i2 & 256) != 0) {
                        j5 = ChaloTheme.a(composerStartRestartGroup, 6).f1915a;
                        i6 = i4 & (-264241153);
                    } else {
                        j5 = j2;
                        i6 = i5;
                    }
                    shape2 = shape3;
                    textStyle2 = headlineSmall;
                    j6 = jM4642getWhite0d7_KjU;
                    z2 = z5;
                    f2 = f4;
                    i7 = -1651123275;
                } else {
                    composerStartRestartGroup.skipToGroupEnd();
                    if ((i2 & 4) != 0) {
                        i12 &= -897;
                    }
                    if ((i2 & 16) != 0) {
                        i12 &= -57345;
                    }
                    if ((i2 & 64) != 0) {
                        i12 &= -3670017;
                    }
                    int i16 = i12 & (-29360129);
                    if ((i2 & 256) != 0) {
                        i16 = i12 & (-264241153);
                    }
                    buttonElevationM1675buttonElevationR_JCAzs = buttonElevation;
                    j5 = j2;
                    i6 = i16;
                    modifier4 = modifier2;
                    i7 = -1651123275;
                    j6 = j;
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(i7, i6, -1, "app.chalo.compose.components.buttons.ChaloOrangeButton (ChaloFilledButton.kt:107)");
                }
                if (z2) {
                    f5 = 1.0f;
                } else {
                    f5 = 0.4f;
                }
                long j7 = j6;
                ButtonColors buttonColorsM1685textButtonColorsro_MJ88 = ButtonDefaults.INSTANCE.m1685textButtonColorsro_MJ88(j5, 0L, Color.m4604copywmQWz5c$default(ChaloTheme.a(composerStartRestartGroup, 6).f1915a, f5, 0.0f, 0.0f, 0.0f, 14, null), 0L, composerStartRestartGroup, ((i6 >> 24) & 14) | (ButtonDefaults.$stable << 12), 10);
                long j8 = j5;
                Modifier modifierM814height3ABfNKs = SizeKt.m814height3ABfNKs(modifier4, f2);
                z6 = (1879048192 & i6) == 536870912;
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (z6 || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = new hb(onClickAction, 26);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                Modifier modifier5 = modifier4;
                Shape shape4 = shape2;
                ButtonElevation buttonElevation3 = buttonElevationM1675buttonElevationR_JCAzs;
                boolean z7 = z2;
                ButtonKt.Button((Function0) objRememberedValue, modifierM814height3ABfNKs, z7, shape4, buttonColorsM1685textButtonColorsro_MJ88, buttonElevation3, null, null, null, ComposableLambdaKt.rememberComposableLambda(1159342533, true, new zj(text, j7, textStyle2, 0), composerStartRestartGroup, 54), composerStartRestartGroup, ((i6 >> 9) & 896) | 805306368 | ((i6 >> 3) & 7168), 448);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                textStyle3 = textStyle2;
                f3 = f2;
                z4 = z7;
                shape2 = shape4;
                buttonElevation2 = buttonElevation3;
                modifier3 = modifier5;
                j3 = j7;
                j4 = j8;
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                modifier3 = modifier2;
                textStyle3 = textStyle2;
                z4 = z2;
                f3 = f2;
                j3 = j;
                buttonElevation2 = buttonElevation;
                j4 = j2;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: ak
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(i | 1);
                        ChaloFilledButtonKt.g(modifier3, text, textStyle3, j3, shape2, z4, f3, buttonElevation2, j4, onClickAction, (Composer) obj, iUpdateChangedFlags, i2);
                        return Unit.f17538a;
                    }
                });
            }
        }
        i12 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
        z2 = z;
        if ((1572864 & i) == 0) {
            if ((i2 & 64) == 0) {
                f2 = f;
                if (composerStartRestartGroup.changed(f2)) {
                }
                i12 |= i15;
            } else {
                f2 = f;
            }
            i12 |= i15;
        } else {
            f2 = f;
        }
        if ((12582912 & i) == 0) {
            i12 |= 4194304;
        }
        if ((100663296 & i) != 0) {
            if ((i2 & 256) == 0) {
                i9 = 33554432;
            } else {
                i9 = 33554432;
            }
            i12 |= i9;
        }
        if ((i & 805306368) == 0) {
            if (composerStartRestartGroup.changedInstance(onClickAction)) {
                i8 = 536870912;
            } else {
                i8 = 268435456;
            }
            i12 |= i8;
        }
        if ((i12 & 306783379) != 306783378) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (composerStartRestartGroup.shouldExecute(z3, i12 & 1)) {
            composerStartRestartGroup.startDefaults();
            if ((i & 1) != 0) {
                if (i10 != 0) {
                    modifier4 = Modifier.INSTANCE;
                } else {
                    modifier4 = modifier2;
                }
                if ((i2 & 4) != 0) {
                    i12 &= -897;
                    headlineSmall = ChaloTheme.e(composerStartRestartGroup, 6).getHeadlineSmall();
                } else {
                    headlineSmall = textStyle2;
                }
                long jM4642getWhite0d7_KjU2 = Color.INSTANCE.m4642getWhite0d7_KjU();
                if ((i2 & 16) != 0) {
                    i12 &= -57345;
                    shape3 = ChaloTheme.d(composerStartRestartGroup, 6).b;
                } else {
                    shape3 = shape2;
                }
                if (i14 != 0) {
                    z5 = true;
                } else {
                    z5 = z2;
                }
                if ((i2 & 64) != 0) {
                    i12 &= -3670017;
                    f4 = ChaloTheme.b(composerStartRestartGroup, 6).n;
                } else {
                    f4 = f2;
                }
                i4 = i12;
                buttonElevationM1675buttonElevationR_JCAzs = ButtonDefaults.INSTANCE.m1675buttonElevationR_JCAzs(ChaloTheme.c(composerStartRestartGroup, 6).f1917a, ChaloTheme.c(composerStartRestartGroup, 6).f1917a, ChaloTheme.c(composerStartRestartGroup, 6).f1917a, ChaloTheme.c(composerStartRestartGroup, 6).f1917a, ChaloTheme.c(composerStartRestartGroup, 6).f1917a, composerStartRestartGroup, ButtonDefaults.$stable << 15, 0);
                i5 = i4 & (-29360129);
                if ((i2 & 256) != 0) {
                    j5 = ChaloTheme.a(composerStartRestartGroup, 6).f1915a;
                    i6 = i4 & (-264241153);
                } else {
                    j5 = j2;
                    i6 = i5;
                }
                shape2 = shape3;
                textStyle2 = headlineSmall;
                j6 = jM4642getWhite0d7_KjU2;
                z2 = z5;
                f2 = f4;
                i7 = -1651123275;
            } else {
                if (i10 != 0) {
                    modifier4 = Modifier.INSTANCE;
                } else {
                    modifier4 = modifier2;
                }
                if ((i2 & 4) != 0) {
                    i12 &= -897;
                    headlineSmall = ChaloTheme.e(composerStartRestartGroup, 6).getHeadlineSmall();
                } else {
                    headlineSmall = textStyle2;
                }
                long jM4642getWhite0d7_KjU3 = Color.INSTANCE.m4642getWhite0d7_KjU();
                if ((i2 & 16) != 0) {
                    i12 &= -57345;
                    shape3 = ChaloTheme.d(composerStartRestartGroup, 6).b;
                } else {
                    shape3 = shape2;
                }
                if (i14 != 0) {
                    z5 = true;
                } else {
                    z5 = z2;
                }
                if ((i2 & 64) != 0) {
                    i12 &= -3670017;
                    f4 = ChaloTheme.b(composerStartRestartGroup, 6).n;
                } else {
                    f4 = f2;
                }
                i4 = i12;
                buttonElevationM1675buttonElevationR_JCAzs = ButtonDefaults.INSTANCE.m1675buttonElevationR_JCAzs(ChaloTheme.c(composerStartRestartGroup, 6).f1917a, ChaloTheme.c(composerStartRestartGroup, 6).f1917a, ChaloTheme.c(composerStartRestartGroup, 6).f1917a, ChaloTheme.c(composerStartRestartGroup, 6).f1917a, ChaloTheme.c(composerStartRestartGroup, 6).f1917a, composerStartRestartGroup, ButtonDefaults.$stable << 15, 0);
                i5 = i4 & (-29360129);
                if ((i2 & 256) != 0) {
                    j5 = ChaloTheme.a(composerStartRestartGroup, 6).f1915a;
                    i6 = i4 & (-264241153);
                } else {
                    j5 = j2;
                    i6 = i5;
                }
                shape2 = shape3;
                textStyle2 = headlineSmall;
                j6 = jM4642getWhite0d7_KjU3;
                z2 = z5;
                f2 = f4;
                i7 = -1651123275;
            }
            composerStartRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(i7, i6, -1, "app.chalo.compose.components.buttons.ChaloOrangeButton (ChaloFilledButton.kt:107)");
            }
            if (z2) {
                f5 = 1.0f;
            } else {
                f5 = 0.4f;
            }
            long j9 = j6;
            ButtonColors buttonColorsM1685textButtonColorsro_MJ89 = ButtonDefaults.INSTANCE.m1685textButtonColorsro_MJ88(j5, 0L, Color.m4604copywmQWz5c$default(ChaloTheme.a(composerStartRestartGroup, 6).f1915a, f5, 0.0f, 0.0f, 0.0f, 14, null), 0L, composerStartRestartGroup, ((i6 >> 24) & 14) | (ButtonDefaults.$stable << 12), 10);
            long j10 = j5;
            Modifier modifierM814height3ABfNKs2 = SizeKt.m814height3ABfNKs(modifier4, f2);
            if ((1879048192 & i6) == 536870912) {
            }
            objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (z6) {
                objRememberedValue = new hb(onClickAction, 26);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            } else {
                objRememberedValue = new hb(onClickAction, 26);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            Modifier modifier6 = modifier4;
            Shape shape5 = shape2;
            ButtonElevation buttonElevation4 = buttonElevationM1675buttonElevationR_JCAzs;
            boolean z8 = z2;
            ButtonKt.Button((Function0) objRememberedValue, modifierM814height3ABfNKs2, z8, shape5, buttonColorsM1685textButtonColorsro_MJ89, buttonElevation4, null, null, null, ComposableLambdaKt.rememberComposableLambda(1159342533, true, new zj(text, j9, textStyle2, 0), composerStartRestartGroup, 54), composerStartRestartGroup, ((i6 >> 9) & 896) | 805306368 | ((i6 >> 3) & 7168), 448);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            textStyle3 = textStyle2;
            f3 = f2;
            z4 = z8;
            shape2 = shape5;
            buttonElevation2 = buttonElevation4;
            modifier3 = modifier6;
            j3 = j9;
            j4 = j10;
        } else {
            composerStartRestartGroup.skipToGroupEnd();
            modifier3 = modifier2;
            textStyle3 = textStyle2;
            z4 = z2;
            f3 = f2;
            j3 = j;
            buttonElevation2 = buttonElevation;
            j4 = j2;
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: ak
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(i | 1);
                    ChaloFilledButtonKt.g(modifier3, text, textStyle3, j3, shape2, z4, f3, buttonElevation2, j4, onClickAction, (Composer) obj, iUpdateChangedFlags, i2);
                    return Unit.f17538a;
                }
            });
        }
    }

    public static final void h(int i, Composer composer, Modifier modifier, String text, Function0 onClickAction) {
        int i2;
        Intrinsics.i(text, "text");
        Intrinsics.i(onClickAction, "onClickAction");
        Composer composerStartRestartGroup = composer.startRestartGroup(1267202958);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changed(text) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changed(modifier) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(onClickAction) ? 256 : 128;
        }
        if (composerStartRestartGroup.shouldExecute((i2 & 147) != 146, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1267202958, i2, -1, "app.chalo.compose.components.buttons.ChaloRoundedButton (ChaloFilledButton.kt:518)");
            }
            float f = 50;
            Modifier modifierClip = ClipKt.clip(BorderKt.border(modifier, BorderStrokeKt.m290BorderStrokecXLIe8U(ChaloTheme.b(composerStartRestartGroup, 6).b, ChaloTheme.a(composerStartRestartGroup, 6).s0), RoundedCornerShapeKt.m1074RoundedCornerShape0680j_4(Dp.m7278constructorimpl(f))), RoundedCornerShapeKt.m1074RoundedCornerShape0680j_4(Dp.m7278constructorimpl(f)));
            boolean z = (i2 & 896) == 256;
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (z || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new hb(onClickAction, 25);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            ChaloRoundedCardKt.b(PaddingKt.m785paddingVpY3zN4(ClickableKt.m299clickableoSLSa3U$default(modifierClip, false, null, null, null, (Function0) objRememberedValue, 15, null), ChaloTheme.b(composerStartRestartGroup, 6).h, ChaloTheme.b(composerStartRestartGroup, 6).f), null, ChaloTheme.c(composerStartRestartGroup, 6).f1917a, 0.0f, ComposableLambdaKt.rememberComposableLambda(1136436623, true, new xj(text, 1), composerStartRestartGroup, 54), composerStartRestartGroup, 24576, 10);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new vc(text, modifier, onClickAction, i, 2));
        }
    }

    public static final void i(Modifier modifier, TextUIState.ChaloTextUIState text, ImageUIState imageUIState, Function0 onClickAction, Composer composer, int i, int i2) {
        Modifier modifier2;
        int i3;
        Composer composer2;
        Modifier modifier3;
        Intrinsics.i(text, "text");
        Intrinsics.i(onClickAction, "onClickAction");
        Composer composerStartRestartGroup = composer.startRestartGroup(-102140883);
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 6;
            modifier2 = modifier;
        } else if ((i & 6) == 0) {
            modifier2 = modifier;
            i3 = (composerStartRestartGroup.changed(modifier2) ? 4 : 2) | i;
        } else {
            modifier2 = modifier;
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changed(text) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= composerStartRestartGroup.changed(imageUIState) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(onClickAction) ? 2048 : 1024;
        }
        if (composerStartRestartGroup.shouldExecute((i3 & 1171) != 1170, i3 & 1)) {
            Modifier modifier4 = i4 != 0 ? Modifier.INSTANCE : modifier2;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-102140883, i3, -1, "app.chalo.compose.components.buttons.ChaloTextWithTrailingIcon (ChaloFilledButton.kt:415)");
            }
            Modifier modifierM299clickableoSLSa3U$default = ClickableKt.m299clickableoSLSa3U$default(modifier4, false, null, null, null, onClickAction, 15, null);
            MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), Alignment.INSTANCE.getCenterVertically(), composerStartRestartGroup, 48);
            long currentCompositeKeyHashCode = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
            int i5 = (int) (currentCompositeKeyHashCode ^ (currentCompositeKeyHashCode >>> 32));
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierM299clickableoSLSa3U$default);
            ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor = companion.getConstructor();
            if (composerStartRestartGroup.getApplier() == null) {
                ComposablesKt.invalidApplier();
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.createNode(constructor);
            } else {
                composerStartRestartGroup.useNode();
            }
            Composer composerM3915constructorimpl = Updater.m3915constructorimpl(composerStartRestartGroup);
            pk0.v(companion, composerM3915constructorimpl, measurePolicyRowMeasurePolicy, composerM3915constructorimpl, currentCompositionLocalMap);
            Updater.m3923setimpl(composerM3915constructorimpl, modifierMaterializeModifier, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion, composerM3915constructorimpl, Integer.valueOf(i5), composerM3915constructorimpl));
            RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
            composer2 = composerStartRestartGroup;
            ChaloTextViewKt.a(null, text, null, null, composer2, i3 & 112, 13);
            if (imageUIState == null) {
                composer2.startReplaceGroup(-1876145952);
            } else {
                composer2.startReplaceGroup(-1876145951);
                CommonImageKt.a(imageUIState, null, false, composer2, 0, 6);
                composer2 = composer2;
            }
            composer2.endReplaceGroup();
            composer2.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            modifier3 = modifier4;
        } else {
            composer2 = composerStartRestartGroup;
            composer2.skipToGroupEnd();
            modifier3 = modifier2;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new uc(modifier3, text, imageUIState, onClickAction, i, i2, 1));
        }
    }

    public static final void j(final Modifier modifier, final String text, TextStyle textStyle, long j, long j2, long j3, long j4, Shape shape, float f, final boolean z, ButtonElevation buttonElevation, final Function0 onClickAction, Composer composer, final int i, final int i2, final int i3) {
        int i4;
        Shape shape2;
        Composer composer2;
        final TextStyle textStyle2;
        final long j5;
        final long j6;
        final long j7;
        final float f2;
        final ButtonElevation buttonElevation2;
        final Shape shape3;
        final long j8;
        long j9;
        Composer composer3;
        Composer composer4;
        TextStyle textStyle3;
        ButtonElevation buttonElevationM1677elevatedButtonElevationR_JCAzs;
        float f3;
        int i5;
        int i6;
        long j10;
        Shape shape4;
        long j11;
        long j12;
        Intrinsics.i(text, "text");
        Intrinsics.i(onClickAction, "onClickAction");
        Composer composerStartRestartGroup = composer.startRestartGroup(-871089781);
        if ((i & 6) == 0) {
            i4 = (composerStartRestartGroup.changed(modifier) ? 4 : 2) | i;
        } else {
            i4 = i;
        }
        if ((i & 48) == 0) {
            i4 |= composerStartRestartGroup.changed(text) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i4 |= 128;
        }
        int i7 = i4 | 27648;
        if ((196608 & i) == 0) {
            i7 = 93184 | i4;
        }
        if ((1572864 & i) == 0) {
            i7 |= 524288;
        }
        if ((12582912 & i) == 0) {
            if ((i3 & 128) == 0) {
                shape2 = shape;
                int i8 = composerStartRestartGroup.changed(shape2) ? 8388608 : 4194304;
                i7 |= i8;
            } else {
                shape2 = shape;
            }
            i7 |= i8;
        } else {
            shape2 = shape;
        }
        if ((100663296 & i) == 0) {
            i7 |= 33554432;
        }
        if ((i & 805306368) == 0) {
            i7 |= composerStartRestartGroup.changed(z) ? 536870912 : 268435456;
        }
        int i9 = (i2 & 6) == 0 ? i2 | 2 : i2;
        if ((i2 & 48) == 0) {
            i9 |= composerStartRestartGroup.changedInstance(onClickAction) ? 32 : 16;
        }
        if (composerStartRestartGroup.shouldExecute(((306783379 & i7) == 306783378 && (i9 & 19) == 18) ? false : true, i7 & 1)) {
            composerStartRestartGroup.startDefaults();
            if ((i & 1) == 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                TextStyle textStyleH = ChaloTypographyKt.h(ChaloTheme.e(composerStartRestartGroup, 6));
                Color.Companion companion = Color.INSTANCE;
                long jM4642getWhite0d7_KjU = companion.m4642getWhite0d7_KjU();
                long jM4631getBlack0d7_KjU = companion.m4631getBlack0d7_KjU();
                j9 = ChaloTheme.a(composerStartRestartGroup, 6).f1915a;
                long j13 = ChaloTheme.a(composerStartRestartGroup, 6).A;
                int i10 = i7 & (-4129665);
                if ((i3 & 128) != 0) {
                    composer3 = composerStartRestartGroup;
                    shape2 = ChaloTheme.d(composer3, 6).b;
                    i10 = i7 & (-33489793);
                } else {
                    composer3 = composerStartRestartGroup;
                }
                float f4 = ChaloTheme.b(composer3, 6).m;
                Composer composer5 = composer3;
                composer4 = composer5;
                textStyle3 = textStyleH;
                buttonElevationM1677elevatedButtonElevationR_JCAzs = ButtonDefaults.INSTANCE.m1677elevatedButtonElevationR_JCAzs(ChaloTheme.c(composer3, 6).f1917a, ChaloTheme.c(composer3, 6).f1917a, ChaloTheme.c(composer3, 6).f1917a, ChaloTheme.c(composer3, 6).f1917a, ChaloTheme.c(composer3, 6).f1917a, composer5, ButtonDefaults.$stable << 15, 0);
                f3 = f4;
                i5 = i9 & (-15);
                i6 = i10 & (-234881025);
                j10 = j13;
                shape4 = shape2;
                j11 = jM4642getWhite0d7_KjU;
                j12 = jM4631getBlack0d7_KjU;
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                int i11 = i7 & (-4129665);
                if ((i3 & 128) != 0) {
                    i11 = i7 & (-33489793);
                }
                int i12 = i11 & (-234881025);
                int i13 = i9 & (-15);
                j9 = j3;
                j10 = j4;
                f3 = f;
                buttonElevationM1677elevatedButtonElevationR_JCAzs = buttonElevation;
                composer4 = composerStartRestartGroup;
                i6 = i12;
                i5 = i13;
                j11 = j;
                shape4 = shape2;
                j12 = j2;
                textStyle3 = textStyle;
            }
            composer4.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-871089781, i6, i5, "app.chalo.compose.components.buttons.ChaloToggleButton (ChaloFilledButton.kt:368)");
            }
            long j14 = z ? j9 : j10;
            long j15 = z ? j11 : j12;
            Modifier modifierM814height3ABfNKs = SizeKt.m814height3ABfNKs(modifier, f3);
            float f5 = f3;
            ButtonColors buttonColorsM1685textButtonColorsro_MJ88 = ButtonDefaults.INSTANCE.m1685textButtonColorsro_MJ88(j14, 0L, 0L, 0L, composer4, ButtonDefaults.$stable << 12, 14);
            Composer composer6 = composer4;
            boolean z2 = (i5 & 112) == 32;
            Object objRememberedValue = composer6.rememberedValue();
            if (z2 || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new hb(onClickAction, 27);
                composer6.updateRememberedValue(objRememberedValue);
            }
            TextStyle textStyle4 = textStyle3;
            Shape shape5 = shape4;
            ButtonElevation buttonElevation3 = buttonElevationM1677elevatedButtonElevationR_JCAzs;
            ButtonKt.Button((Function0) objRememberedValue, modifierM814height3ABfNKs, false, shape5, buttonColorsM1685textButtonColorsro_MJ88, buttonElevation3, null, null, null, ComposableLambdaKt.rememberComposableLambda(566488987, true, new zj(text, j15, textStyle3, 1), composer6, 54), composer6, ((i6 >> 12) & 7168) | 805306368, 452);
            composer2 = composer6;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            textStyle2 = textStyle4;
            j8 = j12;
            j6 = j9;
            j7 = j10;
            shape3 = shape5;
            buttonElevation2 = buttonElevation3;
            f2 = f5;
            j5 = j11;
        } else {
            composer2 = composerStartRestartGroup;
            composer2.skipToGroupEnd();
            textStyle2 = textStyle;
            j5 = j;
            j6 = j3;
            j7 = j4;
            f2 = f;
            buttonElevation2 = buttonElevation;
            shape3 = shape2;
            j8 = j2;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: bk
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(i | 1);
                    int iUpdateChangedFlags2 = RecomposeScopeImplKt.updateChangedFlags(i2);
                    ChaloFilledButtonKt.j(modifier, text, textStyle2, j5, j8, j6, j7, shape3, f2, z, buttonElevation2, onClickAction, (Composer) obj, iUpdateChangedFlags, iUpdateChangedFlags2, i3);
                    return Unit.f17538a;
                }
            });
        }
    }

    /* JADX WARN: Code duplicated, block: B:102:0x01ab  */
    /* JADX WARN: Code duplicated, block: B:105:0x01b3  */
    /* JADX WARN: Code duplicated, block: B:107:0x01bb  */
    /* JADX WARN: Code duplicated, block: B:110:0x01fa  */
    /* JADX WARN: Code duplicated, block: B:112:0x0202  */
    /* JADX WARN: Code duplicated, block: B:115:0x020f  */
    /* JADX WARN: Code duplicated, block: B:117:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:23:0x004a  */
    /* JADX WARN: Code duplicated, block: B:25:0x004e  */
    /* JADX WARN: Code duplicated, block: B:27:0x0056  */
    /* JADX WARN: Code duplicated, block: B:28:0x0059  */
    /* JADX WARN: Code duplicated, block: B:31:0x005f  */
    /* JADX WARN: Code duplicated, block: B:34:0x0065  */
    /* JADX WARN: Code duplicated, block: B:36:0x0069  */
    /* JADX WARN: Code duplicated, block: B:38:0x0071  */
    /* JADX WARN: Code duplicated, block: B:39:0x0074  */
    /* JADX WARN: Code duplicated, block: B:42:0x007a  */
    /* JADX WARN: Code duplicated, block: B:45:0x0080  */
    /* JADX WARN: Code duplicated, block: B:47:0x0084  */
    /* JADX WARN: Code duplicated, block: B:49:0x008c  */
    /* JADX WARN: Code duplicated, block: B:50:0x008f  */
    /* JADX WARN: Code duplicated, block: B:53:0x0095  */
    /* JADX WARN: Code duplicated, block: B:56:0x009c  */
    /* JADX WARN: Code duplicated, block: B:58:0x00a2  */
    /* JADX WARN: Code duplicated, block: B:59:0x00a5  */
    /* JADX WARN: Code duplicated, block: B:63:0x00b3  */
    /* JADX WARN: Code duplicated, block: B:64:0x00b5  */
    /* JADX WARN: Code duplicated, block: B:67:0x00bf  */
    /* JADX WARN: Code duplicated, block: B:82:0x00e9 A[PHI: r2 r3 r4 r6
      0x00e9: PHI (r2v20 int) = (r2v13 int), (r2v24 int) binds: [B:95:0x0112, B:81:0x00e6] A[DONT_GENERATE, DONT_INLINE]
      0x00e9: PHI (r3v8 androidx.compose.ui.Modifier) = (r3v4 androidx.compose.ui.Modifier), (r3v12 androidx.compose.ui.Modifier) binds: [B:95:0x0112, B:81:0x00e6] A[DONT_GENERATE, DONT_INLINE]
      0x00e9: PHI (r4v9 long) = (r4v5 long), (r4v10 long) binds: [B:95:0x0112, B:81:0x00e6] A[DONT_GENERATE, DONT_INLINE]
      0x00e9: PHI (r6v9 androidx.compose.ui.graphics.Shape) = (r6v4 androidx.compose.ui.graphics.Shape), (r6v10 androidx.compose.ui.graphics.Shape) binds: [B:95:0x0112, B:81:0x00e6] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:83:0x00ee A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:84:0x00f0  */
    /* JADX WARN: Code duplicated, block: B:85:0x00f3  */
    /* JADX WARN: Code duplicated, block: B:88:0x00f8  */
    /* JADX WARN: Code duplicated, block: B:89:0x0101  */
    /* JADX WARN: Code duplicated, block: B:92:0x0106  */
    /* JADX WARN: Code duplicated, block: B:93:0x010f  */
    /* JADX WARN: Code duplicated, block: B:96:0x0114  */
    /* JADX WARN: Code duplicated, block: B:99:0x0159  */
    public static final void k(String text, Modifier modifier, long j, Shape shape, ButtonElevation buttonElevation, Function0 onClickAction, Composer composer, int i, int i2) {
        int i3;
        Modifier modifier2;
        long j2;
        Shape shape2;
        ButtonElevation buttonElevation2;
        boolean z;
        Modifier modifier3;
        long j3;
        Shape shape3;
        ButtonElevation buttonElevation3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Modifier modifier4;
        long j4;
        Shape shape4;
        int i4;
        ButtonElevation buttonElevationM1675buttonElevationR_JCAzs;
        boolean z2;
        Object objRememberedValue;
        int i5;
        Intrinsics.i(text, "text");
        Intrinsics.i(onClickAction, "onClickAction");
        Composer composerStartRestartGroup = composer.startRestartGroup(951846837);
        if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changed(text) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i6 = i2 & 2;
        if (i6 == 0) {
            if ((i & 48) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 32 : 16;
            }
            if ((i & 384) == 0) {
                if ((i2 & 4) == 0) {
                    j2 = j;
                    int i7 = composerStartRestartGroup.changed(j2) ? 256 : 128;
                    i3 |= i7;
                } else {
                    j2 = j;
                }
                i3 |= i7;
            } else {
                j2 = j;
            }
            if ((i & 3072) == 0) {
                if ((i2 & 8) == 0) {
                    shape2 = shape;
                    int i8 = composerStartRestartGroup.changed(shape2) ? 2048 : 1024;
                    i3 |= i8;
                } else {
                    shape2 = shape;
                }
                i3 |= i8;
            } else {
                shape2 = shape;
            }
            if ((i & 24576) == 0) {
                if ((i2 & 16) == 0) {
                    buttonElevation2 = buttonElevation;
                    int i9 = composerStartRestartGroup.changed(buttonElevation2) ? 16384 : 8192;
                    i3 |= i9;
                } else {
                    buttonElevation2 = buttonElevation;
                }
                i3 |= i9;
            } else {
                buttonElevation2 = buttonElevation;
            }
            if ((196608 & i) == 0) {
                if (composerStartRestartGroup.changedInstance(onClickAction)) {
                    i5 = 131072;
                } else {
                    i5 = 65536;
                }
                i3 |= i5;
            }
            if ((74899 & i3) != 74898) {
                z = true;
            } else {
                z = false;
            }
            if (composerStartRestartGroup.shouldExecute(z, i3 & 1)) {
                composerStartRestartGroup.startDefaults();
                if ((i & 1) != 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                    if (i6 != 0) {
                        modifier4 = Modifier.INSTANCE;
                    } else {
                        modifier4 = modifier2;
                    }
                    if ((i2 & 4) != 0) {
                        j4 = ChaloTheme.a(composerStartRestartGroup, 6).Z;
                        i3 &= -897;
                    } else {
                        j4 = j2;
                    }
                    if ((i2 & 8) != 0) {
                        shape4 = ChaloTheme.d(composerStartRestartGroup, 6).d;
                        i3 &= -7169;
                    } else {
                        shape4 = shape2;
                    }
                    if ((i2 & 16) != 0) {
                        i4 = i3 & (-57345);
                        buttonElevationM1675buttonElevationR_JCAzs = ButtonDefaults.INSTANCE.m1675buttonElevationR_JCAzs(ChaloTheme.c(composerStartRestartGroup, 6).f1917a, ChaloTheme.c(composerStartRestartGroup, 6).f1917a, ChaloTheme.c(composerStartRestartGroup, 6).f1917a, ChaloTheme.c(composerStartRestartGroup, 6).f1917a, ChaloTheme.c(composerStartRestartGroup, 6).f1917a, composerStartRestartGroup, ButtonDefaults.$stable << 15, 0);
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(951846837, i4, -1, "app.chalo.compose.components.buttons.ChaloWhiteButton (ChaloFilledButton.kt:209)");
                    }
                    int i10 = i4;
                    ButtonColors buttonColorsM1685textButtonColorsro_MJ88 = ButtonDefaults.INSTANCE.m1685textButtonColorsro_MJ88(ChaloTheme.a(composerStartRestartGroup, r13).t, 0L, 0L, 0L, composerStartRestartGroup, ButtonDefaults.$stable << 12, 14);
                    Modifier modifierThen = modifier4.then(BorderKt.m275borderxT4_qwU(SizeKt.m814height3ABfNKs(Modifier.INSTANCE, ChaloTheme.b(composerStartRestartGroup, r13).n), ChaloTheme.b(composerStartRestartGroup, 6).b, j4, shape4));
                    z2 = (i10 & 458752) == 131072;
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (z2 || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue = new fk(onClickAction, 1);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    ButtonElevation buttonElevation4 = buttonElevationM1675buttonElevationR_JCAzs;
                    Shape shape5 = shape4;
                    ButtonKt.Button((Function0) objRememberedValue, modifierThen, false, shape5, buttonColorsM1685textButtonColorsro_MJ88, buttonElevation4, null, null, null, ComposableLambdaKt.rememberComposableLambda(1248267717, true, new xj(text, 0), composerStartRestartGroup, 54), composerStartRestartGroup, (i10 & 7168) | 805306368 | ((i10 << 3) & 458752), 452);
                    composerStartRestartGroup = composerStartRestartGroup;
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    modifier3 = modifier4;
                    j3 = j4;
                    shape3 = shape5;
                    buttonElevation3 = buttonElevation4;
                } else {
                    composerStartRestartGroup.skipToGroupEnd();
                    if ((i2 & 4) != 0) {
                        i3 &= -897;
                    }
                    if ((i2 & 8) != 0) {
                        i3 &= -7169;
                    }
                    if ((i2 & 16) != 0) {
                        i3 &= -57345;
                    }
                    modifier4 = modifier2;
                    j4 = j2;
                    shape4 = shape2;
                }
                i4 = i3;
                buttonElevationM1675buttonElevationR_JCAzs = buttonElevation2;
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(951846837, i4, -1, "app.chalo.compose.components.buttons.ChaloWhiteButton (ChaloFilledButton.kt:209)");
                }
                int i11 = i4;
                ButtonColors buttonColorsM1685textButtonColorsro_MJ89 = ButtonDefaults.INSTANCE.m1685textButtonColorsro_MJ88(ChaloTheme.a(composerStartRestartGroup, r13).t, 0L, 0L, 0L, composerStartRestartGroup, ButtonDefaults.$stable << 12, 14);
                Modifier modifierThen2 = modifier4.then(BorderKt.m275borderxT4_qwU(SizeKt.m814height3ABfNKs(Modifier.INSTANCE, ChaloTheme.b(composerStartRestartGroup, r13).n), ChaloTheme.b(composerStartRestartGroup, 6).b, j4, shape4));
                if ((i11 & 458752) == 131072) {
                }
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (z2) {
                    objRememberedValue = new fk(onClickAction, 1);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                } else {
                    objRememberedValue = new fk(onClickAction, 1);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                ButtonElevation buttonElevation5 = buttonElevationM1675buttonElevationR_JCAzs;
                Shape shape6 = shape4;
                ButtonKt.Button((Function0) objRememberedValue, modifierThen2, false, shape6, buttonColorsM1685textButtonColorsro_MJ89, buttonElevation5, null, null, null, ComposableLambdaKt.rememberComposableLambda(1248267717, true, new xj(text, 0), composerStartRestartGroup, 54), composerStartRestartGroup, (i11 & 7168) | 805306368 | ((i11 << 3) & 458752), 452);
                composerStartRestartGroup = composerStartRestartGroup;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier3 = modifier4;
                j3 = j4;
                shape3 = shape6;
                buttonElevation3 = buttonElevation5;
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                modifier3 = modifier2;
                j3 = j2;
                shape3 = shape2;
                buttonElevation3 = buttonElevation2;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new mi(text, modifier3, j3, shape3, buttonElevation3, onClickAction, i, i2));
            }
        }
        i3 |= 48;
        modifier2 = modifier;
        if ((i & 384) == 0) {
            if ((i2 & 4) == 0) {
                j2 = j;
                if (composerStartRestartGroup.changed(j2)) {
                }
                i3 |= i7;
            } else {
                j2 = j;
            }
            i3 |= i7;
        } else {
            j2 = j;
        }
        if ((i & 3072) == 0) {
            if ((i2 & 8) == 0) {
                shape2 = shape;
                if (composerStartRestartGroup.changed(shape2)) {
                }
                i3 |= i8;
            } else {
                shape2 = shape;
            }
            i3 |= i8;
        } else {
            shape2 = shape;
        }
        if ((i & 24576) == 0) {
            if ((i2 & 16) == 0) {
                buttonElevation2 = buttonElevation;
                if (composerStartRestartGroup.changed(buttonElevation2)) {
                }
                i3 |= i9;
            } else {
                buttonElevation2 = buttonElevation;
            }
            i3 |= i9;
        } else {
            buttonElevation2 = buttonElevation;
        }
        if ((196608 & i) == 0) {
            if (composerStartRestartGroup.changedInstance(onClickAction)) {
                i5 = 131072;
            } else {
                i5 = 65536;
            }
            i3 |= i5;
        }
        if ((74899 & i3) != 74898) {
            z = true;
        } else {
            z = false;
        }
        if (composerStartRestartGroup.shouldExecute(z, i3 & 1)) {
            composerStartRestartGroup.startDefaults();
            if ((i & 1) != 0) {
                if (i6 != 0) {
                    modifier4 = Modifier.INSTANCE;
                } else {
                    modifier4 = modifier2;
                }
                if ((i2 & 4) != 0) {
                    j4 = ChaloTheme.a(composerStartRestartGroup, 6).Z;
                    i3 &= -897;
                } else {
                    j4 = j2;
                }
                if ((i2 & 8) != 0) {
                    shape4 = ChaloTheme.d(composerStartRestartGroup, 6).d;
                    i3 &= -7169;
                } else {
                    shape4 = shape2;
                }
                if ((i2 & 16) != 0) {
                    i4 = i3 & (-57345);
                    buttonElevationM1675buttonElevationR_JCAzs = ButtonDefaults.INSTANCE.m1675buttonElevationR_JCAzs(ChaloTheme.c(composerStartRestartGroup, 6).f1917a, ChaloTheme.c(composerStartRestartGroup, 6).f1917a, ChaloTheme.c(composerStartRestartGroup, 6).f1917a, ChaloTheme.c(composerStartRestartGroup, 6).f1917a, ChaloTheme.c(composerStartRestartGroup, 6).f1917a, composerStartRestartGroup, ButtonDefaults.$stable << 15, 0);
                } else {
                    i4 = i3;
                    buttonElevationM1675buttonElevationR_JCAzs = buttonElevation2;
                }
            } else {
                if (i6 != 0) {
                    modifier4 = Modifier.INSTANCE;
                } else {
                    modifier4 = modifier2;
                }
                if ((i2 & 4) != 0) {
                    j4 = ChaloTheme.a(composerStartRestartGroup, 6).Z;
                    i3 &= -897;
                } else {
                    j4 = j2;
                }
                if ((i2 & 8) != 0) {
                    shape4 = ChaloTheme.d(composerStartRestartGroup, 6).d;
                    i3 &= -7169;
                } else {
                    shape4 = shape2;
                }
                if ((i2 & 16) != 0) {
                    i4 = i3 & (-57345);
                    buttonElevationM1675buttonElevationR_JCAzs = ButtonDefaults.INSTANCE.m1675buttonElevationR_JCAzs(ChaloTheme.c(composerStartRestartGroup, 6).f1917a, ChaloTheme.c(composerStartRestartGroup, 6).f1917a, ChaloTheme.c(composerStartRestartGroup, 6).f1917a, ChaloTheme.c(composerStartRestartGroup, 6).f1917a, ChaloTheme.c(composerStartRestartGroup, 6).f1917a, composerStartRestartGroup, ButtonDefaults.$stable << 15, 0);
                } else {
                    i4 = i3;
                    buttonElevationM1675buttonElevationR_JCAzs = buttonElevation2;
                }
            }
            composerStartRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(951846837, i4, -1, "app.chalo.compose.components.buttons.ChaloWhiteButton (ChaloFilledButton.kt:209)");
            }
            int i12 = i4;
            ButtonColors buttonColorsM1685textButtonColorsro_MJ810 = ButtonDefaults.INSTANCE.m1685textButtonColorsro_MJ88(ChaloTheme.a(composerStartRestartGroup, r13).t, 0L, 0L, 0L, composerStartRestartGroup, ButtonDefaults.$stable << 12, 14);
            Modifier modifierThen3 = modifier4.then(BorderKt.m275borderxT4_qwU(SizeKt.m814height3ABfNKs(Modifier.INSTANCE, ChaloTheme.b(composerStartRestartGroup, r13).n), ChaloTheme.b(composerStartRestartGroup, 6).b, j4, shape4));
            if ((i12 & 458752) == 131072) {
            }
            objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (z2) {
                objRememberedValue = new fk(onClickAction, 1);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            } else {
                objRememberedValue = new fk(onClickAction, 1);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            ButtonElevation buttonElevation6 = buttonElevationM1675buttonElevationR_JCAzs;
            Shape shape7 = shape4;
            ButtonKt.Button((Function0) objRememberedValue, modifierThen3, false, shape7, buttonColorsM1685textButtonColorsro_MJ810, buttonElevation6, null, null, null, ComposableLambdaKt.rememberComposableLambda(1248267717, true, new xj(text, 0), composerStartRestartGroup, 54), composerStartRestartGroup, (i12 & 7168) | 805306368 | ((i12 << 3) & 458752), 452);
            composerStartRestartGroup = composerStartRestartGroup;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            modifier3 = modifier4;
            j3 = j4;
            shape3 = shape7;
            buttonElevation3 = buttonElevation6;
        } else {
            composerStartRestartGroup.skipToGroupEnd();
            modifier3 = modifier2;
            j3 = j2;
            shape3 = shape2;
            buttonElevation3 = buttonElevation2;
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new mi(text, modifier3, j3, shape3, buttonElevation3, onClickAction, i, i2));
        }
    }
}
