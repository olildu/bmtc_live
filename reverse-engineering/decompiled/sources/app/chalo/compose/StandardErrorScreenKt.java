package app.chalo.compose;

import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.material3.TextKt;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.layout.ContentScale;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.style.TextAlign;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import app.chalo.compose.components.ChaloSpacersKt;
import app.chalo.compose.components.ChaloTextViewKt;
import app.chalo.compose.components.buttons.ChaloFilledButtonKt;
import app.chalo.compose.components.image.CommonImageKt;
import app.chalo.compose.resources.StringResourcesHelperKt;
import app.chalo.compose.theme.ChaloTheme;
import app.chalo.compose.theme.ChaloThemeKt;
import app.chalo.providers.stringprovider.StringEnum;
import app.chalo.uistate.base.UiAlignmentKt;
import app.chalo.uistate.base.UiArrangementKt;
import app.chalo.uistate.button.ButtonUIState;
import app.chalo.uistate.error.ErrorWithMsgAndRetryUISpecs;
import app.chalo.uistate.error.StandardErrorScreenUIState;
import app.chalo.uistate.image.ImageUIState;
import app.chalo.uistate.text.TextUIState;
import defpackage.b60;
import defpackage.gf;
import defpackage.pk0;
import defpackage.sa1;
import defpackage.xa1;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.internal.ws.WebSocketProtocol;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"chalo-base_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class StandardErrorScreenKt {
    /* JADX WARN: Code duplicated, block: B:101:0x02f7  */
    /* JADX WARN: Code duplicated, block: B:103:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:39:0x006f  */
    /* JADX WARN: Code duplicated, block: B:42:0x007a  */
    /* JADX WARN: Code duplicated, block: B:44:0x0080  */
    /* JADX WARN: Code duplicated, block: B:45:0x0083  */
    /* JADX WARN: Code duplicated, block: B:49:0x0091  */
    /* JADX WARN: Code duplicated, block: B:50:0x0093  */
    /* JADX WARN: Code duplicated, block: B:53:0x009c  */
    /* JADX WARN: Code duplicated, block: B:59:0x00c0  */
    /* JADX WARN: Code duplicated, block: B:61:0x00c4  */
    /* JADX WARN: Code duplicated, block: B:64:0x00cf  */
    /* JADX WARN: Code duplicated, block: B:68:0x00ec  */
    /* JADX WARN: Code duplicated, block: B:71:0x0134  */
    /* JADX WARN: Code duplicated, block: B:72:0x0137  */
    /* JADX WARN: Code duplicated, block: B:74:0x013b  */
    /* JADX WARN: Code duplicated, block: B:77:0x0147  */
    /* JADX WARN: Code duplicated, block: B:78:0x014b  */
    /* JADX WARN: Code duplicated, block: B:81:0x0164  */
    /* JADX WARN: Code duplicated, block: B:82:0x01a0  */
    /* JADX WARN: Code duplicated, block: B:85:0x021b  */
    /* JADX WARN: Code duplicated, block: B:86:0x021d  */
    /* JADX WARN: Code duplicated, block: B:88:0x0220  */
    /* JADX WARN: Code duplicated, block: B:89:0x028a  */
    /* JADX WARN: Code duplicated, block: B:91:0x029e  */
    /* JADX WARN: Code duplicated, block: B:93:0x02c5  */
    /* JADX WARN: Code duplicated, block: B:96:0x02d7  */
    /* JADX WARN: Code duplicated, block: B:98:0x02e4  */
    public static final void a(Modifier modifier, Modifier modifier2, Painter painter, String str, String str2, String str3, boolean z, Function0 onRetryClicked, Composer composer, int i, int i2) {
        int i3;
        String str4;
        int i4;
        boolean z2;
        Modifier modifier3;
        String str5;
        String str6;
        boolean z3;
        Painter painter2;
        String str7;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        String strC;
        int i5;
        boolean z4;
        String strC2;
        String str8;
        Painter painter3;
        Modifier modifier4;
        Function0<ComposeUiNode> constructor;
        boolean z5;
        int i6;
        Modifier.Companion companion;
        TextAlign.Companion companion2;
        boolean z6;
        String str9;
        String str10;
        int i7;
        Painter painter4 = painter;
        Intrinsics.i(onRetryClicked, "onRetryClicked");
        Composer composerStartRestartGroup = composer.startRestartGroup(-1439621484);
        if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changed(modifier) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i8 = i3 | 48;
        int i9 = i2 & 4;
        if (i9 != 0) {
            i8 = i3 | 432;
        } else if ((i & 384) == 0) {
            i8 |= (i & 512) == 0 ? composerStartRestartGroup.changed(painter4) : composerStartRestartGroup.changedInstance(painter4) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i8 |= 1024;
        }
        int i10 = i2 & 16;
        if (i10 == 0) {
            if ((i & 24576) == 0) {
                str4 = str2;
                i8 |= composerStartRestartGroup.changed(str4) ? 16384 : 8192;
            }
            if ((196608 & i) == 0) {
                i8 |= 65536;
            }
            i4 = i8 | 1572864;
            if ((12582912 & i) == 0) {
                if (composerStartRestartGroup.changedInstance(onRetryClicked)) {
                    i7 = 8388608;
                } else {
                    i7 = 4194304;
                }
                i4 |= i7;
            }
            if ((4793491 & i4) != 4793490) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (composerStartRestartGroup.shouldExecute(z2, i4 & 1)) {
                composerStartRestartGroup.startDefaults();
                if ((i & 1) != 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                    Modifier.Companion companion3 = Modifier.INSTANCE;
                    if (i9 != 0) {
                        painter4 = null;
                    }
                    strC = StringResourcesHelperKt.c(StringEnum.REFRESH_CALL_FAILURE, new Object[0], composerStartRestartGroup, 6);
                    if (i10 != 0) {
                        str4 = "";
                    }
                    i5 = i4 & (-465921);
                    z4 = true;
                    strC2 = StringResourcesHelperKt.c(StringEnum.TRY_AGAIN, new Object[0], composerStartRestartGroup, 6);
                    str8 = str4;
                    painter3 = painter4;
                    modifier4 = companion3;
                } else {
                    composerStartRestartGroup.skipToGroupEnd();
                    int i11 = i4 & (-465921);
                    strC = str;
                    strC2 = str3;
                    z4 = z;
                    i5 = i11;
                    str8 = str4;
                    painter3 = painter4;
                    modifier4 = modifier2;
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1439621484, i5, -1, "app.chalo.compose.GenericErrorScreenWithMsgAndRetry (StandardErrorScreen.kt:123)");
                }
                Modifier modifierM786paddingVpY3zN4$default = PaddingKt.m786paddingVpY3zN4$default(SizeKt.fillMaxWidth$default(modifier, 0.0f, 1, null), ChaloTheme.b(composerStartRestartGroup, 6).h, 0.0f, 2, null);
                MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getCenter(), Alignment.INSTANCE.getCenterHorizontally(), composerStartRestartGroup, 54);
                long currentCompositeKeyHashCode = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
                int i12 = (int) (currentCompositeKeyHashCode ^ (currentCompositeKeyHashCode >>> 32));
                CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierM786paddingVpY3zN4$default);
                ComposeUiNode.Companion companion4 = ComposeUiNode.INSTANCE;
                constructor = companion4.getConstructor();
                if (composerStartRestartGroup.getApplier() != null) {
                    z5 = true;
                } else {
                    z5 = false;
                }
                if (!z5) {
                    ComposablesKt.invalidApplier();
                }
                composerStartRestartGroup.startReusableNode();
                if (composerStartRestartGroup.getInserting()) {
                    composerStartRestartGroup.createNode(constructor);
                } else {
                    composerStartRestartGroup.useNode();
                }
                Composer composerM3915constructorimpl = Updater.m3915constructorimpl(composerStartRestartGroup);
                pk0.v(companion4, composerM3915constructorimpl, measurePolicyColumnMeasurePolicy, composerM3915constructorimpl, currentCompositionLocalMap);
                Updater.m3923setimpl(composerM3915constructorimpl, modifierMaterializeModifier, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion4, composerM3915constructorimpl, Integer.valueOf(i12), composerM3915constructorimpl));
                ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
                if (painter3 != null) {
                    composerStartRestartGroup.startReplaceGroup(-540822366);
                    i6 = 6;
                    ImageKt.Image(painter3, "", (Modifier) null, (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composerStartRestartGroup, Painter.$stable | 48 | ((i5 >> 6) & 14), 124);
                    composerStartRestartGroup = composerStartRestartGroup;
                    gf.r(Modifier.INSTANCE, ChaloTheme.b(composerStartRestartGroup, 6).i, composerStartRestartGroup, 0);
                } else {
                    i6 = 6;
                    composerStartRestartGroup.startReplaceGroup(-545168008);
                    composerStartRestartGroup.endReplaceGroup();
                }
                TextStyle displaySmall = ChaloTheme.e(composerStartRestartGroup, i6).getDisplaySmall();
                long j = ChaloTheme.a(composerStartRestartGroup, i6).g;
                companion = Modifier.INSTANCE;
                Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null);
                companion2 = TextAlign.INSTANCE;
                Composer composer2 = composerStartRestartGroup;
                String str11 = strC;
                TextKt.m2623TextNvy7gAk(str11, modifierFillMaxWidth$default, j, null, 0L, null, null, null, 0L, null, TextAlign.m7161boximpl(companion2.m7168getCentere0LSkKk()), 0L, 0, false, 0, 0, null, displaySmall, composer2, 48, 0, 130040);
                composerStartRestartGroup = composer2;
                if (str8.length() > 0) {
                    z6 = true;
                } else {
                    z6 = false;
                }
                if (z6) {
                    composerStartRestartGroup.startReplaceGroup(-540382166);
                    SpacerKt.Spacer(SizeKt.m814height3ABfNKs(companion, ChaloTheme.b(composerStartRestartGroup, i6).g), composerStartRestartGroup, 0);
                    String str12 = str8;
                    TextKt.m2623TextNvy7gAk(str12, SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), ChaloTheme.a(composerStartRestartGroup, i6).g, null, 0L, null, null, null, 0L, null, TextAlign.m7161boximpl(companion2.m7168getCentere0LSkKk()), 0L, 0, false, 0, 0, null, ChaloTheme.e(composerStartRestartGroup, i6).getBodyMedium(), composerStartRestartGroup, ((i5 >> 12) & 14) | 48, 0, 130040);
                    str9 = str12;
                    gf.r(companion, ChaloTheme.b(composerStartRestartGroup, i6).i, composerStartRestartGroup, 0);
                } else {
                    str9 = str8;
                    composerStartRestartGroup.startReplaceGroup(-539960349);
                    gf.r(companion, ChaloTheme.b(composerStartRestartGroup, i6).i, composerStartRestartGroup, 0);
                }
                if (z4) {
                    composerStartRestartGroup = composerStartRestartGroup;
                    composerStartRestartGroup.startReplaceGroup(-539839077);
                    str10 = strC2;
                    modifier3 = modifier4;
                    ChaloFilledButtonKt.g(modifier3, str10, null, 0L, null, false, 0.0f, null, 0L, onRetryClicked, composerStartRestartGroup, ((i5 >> 3) & 14) | ((i5 << 6) & 1879048192), TypedValues.PositionType.TYPE_CURVE_FIT);
                } else {
                    composerStartRestartGroup = composerStartRestartGroup;
                    modifier3 = modifier4;
                    str10 = strC2;
                    composerStartRestartGroup.startReplaceGroup(-545168008);
                }
                composerStartRestartGroup.endReplaceGroup();
                composerStartRestartGroup.endNode();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                str6 = str10;
                str7 = str9;
                z3 = z4;
                str5 = str11;
                painter2 = painter3;
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                modifier3 = modifier2;
                str5 = str;
                str6 = str3;
                z3 = z;
                painter2 = painter4;
                str7 = str4;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new b60(modifier, modifier3, painter2, str5, str7, str6, z3, onRetryClicked, i, i2, 1));
            }
        }
        i8 |= 24576;
        str4 = str2;
        if ((196608 & i) == 0) {
            i8 |= 65536;
        }
        i4 = i8 | 1572864;
        if ((12582912 & i) == 0) {
            if (composerStartRestartGroup.changedInstance(onRetryClicked)) {
                i7 = 8388608;
            } else {
                i7 = 4194304;
            }
            i4 |= i7;
        }
        if ((4793491 & i4) != 4793490) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (composerStartRestartGroup.shouldExecute(z2, i4 & 1)) {
            composerStartRestartGroup.startDefaults();
            if ((i & 1) != 0) {
                Modifier.Companion companion5 = Modifier.INSTANCE;
                if (i9 != 0) {
                    painter4 = null;
                }
                strC = StringResourcesHelperKt.c(StringEnum.REFRESH_CALL_FAILURE, new Object[0], composerStartRestartGroup, 6);
                if (i10 != 0) {
                    str4 = "";
                }
                i5 = i4 & (-465921);
                z4 = true;
                strC2 = StringResourcesHelperKt.c(StringEnum.TRY_AGAIN, new Object[0], composerStartRestartGroup, 6);
                str8 = str4;
                painter3 = painter4;
                modifier4 = companion5;
            } else {
                Modifier.Companion companion6 = Modifier.INSTANCE;
                if (i9 != 0) {
                    painter4 = null;
                }
                strC = StringResourcesHelperKt.c(StringEnum.REFRESH_CALL_FAILURE, new Object[0], composerStartRestartGroup, 6);
                if (i10 != 0) {
                    str4 = "";
                }
                i5 = i4 & (-465921);
                z4 = true;
                strC2 = StringResourcesHelperKt.c(StringEnum.TRY_AGAIN, new Object[0], composerStartRestartGroup, 6);
                str8 = str4;
                painter3 = painter4;
                modifier4 = companion6;
            }
            composerStartRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1439621484, i5, -1, "app.chalo.compose.GenericErrorScreenWithMsgAndRetry (StandardErrorScreen.kt:123)");
            }
            Modifier modifierM786paddingVpY3zN4$default2 = PaddingKt.m786paddingVpY3zN4$default(SizeKt.fillMaxWidth$default(modifier, 0.0f, 1, null), ChaloTheme.b(composerStartRestartGroup, 6).h, 0.0f, 2, null);
            MeasurePolicy measurePolicyColumnMeasurePolicy2 = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getCenter(), Alignment.INSTANCE.getCenterHorizontally(), composerStartRestartGroup, 54);
            long currentCompositeKeyHashCode2 = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
            int i13 = (int) (currentCompositeKeyHashCode2 ^ (currentCompositeKeyHashCode2 >>> 32));
            CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierM786paddingVpY3zN4$default2);
            ComposeUiNode.Companion companion7 = ComposeUiNode.INSTANCE;
            constructor = companion7.getConstructor();
            if (composerStartRestartGroup.getApplier() != null) {
                z5 = true;
            } else {
                z5 = false;
            }
            if (!z5) {
                ComposablesKt.invalidApplier();
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.createNode(constructor);
            } else {
                composerStartRestartGroup.useNode();
            }
            Composer composerM3915constructorimpl2 = Updater.m3915constructorimpl(composerStartRestartGroup);
            pk0.v(companion7, composerM3915constructorimpl2, measurePolicyColumnMeasurePolicy2, composerM3915constructorimpl2, currentCompositionLocalMap2);
            Updater.m3923setimpl(composerM3915constructorimpl2, modifierMaterializeModifier2, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion7, composerM3915constructorimpl2, Integer.valueOf(i13), composerM3915constructorimpl2));
            ColumnScopeInstance columnScopeInstance2 = ColumnScopeInstance.INSTANCE;
            if (painter3 != null) {
                composerStartRestartGroup.startReplaceGroup(-540822366);
                i6 = 6;
                ImageKt.Image(painter3, "", (Modifier) null, (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composerStartRestartGroup, Painter.$stable | 48 | ((i5 >> 6) & 14), 124);
                composerStartRestartGroup = composerStartRestartGroup;
                gf.r(Modifier.INSTANCE, ChaloTheme.b(composerStartRestartGroup, 6).i, composerStartRestartGroup, 0);
            } else {
                i6 = 6;
                composerStartRestartGroup.startReplaceGroup(-545168008);
                composerStartRestartGroup.endReplaceGroup();
            }
            TextStyle displaySmall2 = ChaloTheme.e(composerStartRestartGroup, i6).getDisplaySmall();
            long j2 = ChaloTheme.a(composerStartRestartGroup, i6).g;
            companion = Modifier.INSTANCE;
            Modifier modifierFillMaxWidth$default2 = SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null);
            companion2 = TextAlign.INSTANCE;
            Composer composer3 = composerStartRestartGroup;
            String str13 = strC;
            TextKt.m2623TextNvy7gAk(str13, modifierFillMaxWidth$default2, j2, null, 0L, null, null, null, 0L, null, TextAlign.m7161boximpl(companion2.m7168getCentere0LSkKk()), 0L, 0, false, 0, 0, null, displaySmall2, composer3, 48, 0, 130040);
            composerStartRestartGroup = composer3;
            if (str8.length() > 0) {
                z6 = true;
            } else {
                z6 = false;
            }
            if (z6) {
                composerStartRestartGroup.startReplaceGroup(-540382166);
                SpacerKt.Spacer(SizeKt.m814height3ABfNKs(companion, ChaloTheme.b(composerStartRestartGroup, i6).g), composerStartRestartGroup, 0);
                String str14 = str8;
                TextKt.m2623TextNvy7gAk(str14, SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), ChaloTheme.a(composerStartRestartGroup, i6).g, null, 0L, null, null, null, 0L, null, TextAlign.m7161boximpl(companion2.m7168getCentere0LSkKk()), 0L, 0, false, 0, 0, null, ChaloTheme.e(composerStartRestartGroup, i6).getBodyMedium(), composerStartRestartGroup, ((i5 >> 12) & 14) | 48, 0, 130040);
                str9 = str14;
                gf.r(companion, ChaloTheme.b(composerStartRestartGroup, i6).i, composerStartRestartGroup, 0);
            } else {
                str9 = str8;
                composerStartRestartGroup.startReplaceGroup(-539960349);
                gf.r(companion, ChaloTheme.b(composerStartRestartGroup, i6).i, composerStartRestartGroup, 0);
            }
            if (z4) {
                composerStartRestartGroup = composerStartRestartGroup;
                composerStartRestartGroup.startReplaceGroup(-539839077);
                str10 = strC2;
                modifier3 = modifier4;
                ChaloFilledButtonKt.g(modifier3, str10, null, 0L, null, false, 0.0f, null, 0L, onRetryClicked, composerStartRestartGroup, ((i5 >> 3) & 14) | ((i5 << 6) & 1879048192), TypedValues.PositionType.TYPE_CURVE_FIT);
            } else {
                composerStartRestartGroup = composerStartRestartGroup;
                modifier3 = modifier4;
                str10 = strC2;
                composerStartRestartGroup.startReplaceGroup(-545168008);
            }
            composerStartRestartGroup.endReplaceGroup();
            composerStartRestartGroup.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            str6 = str10;
            str7 = str9;
            z3 = z4;
            str5 = str13;
            painter2 = painter3;
        } else {
            composerStartRestartGroup.skipToGroupEnd();
            modifier3 = modifier2;
            str5 = str;
            str6 = str3;
            z3 = z;
            painter2 = painter4;
            str7 = str4;
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new b60(modifier, modifier3, painter2, str5, str7, str6, z3, onRetryClicked, i, i2, 1));
        }
    }

    public static final void b(StandardErrorScreenUIState.ErrorWithMsgAndRetry state, Modifier modifier, Composer composer, int i) {
        int i2;
        Composer composer2;
        Composer composer3;
        float f;
        Object obj;
        float f2;
        Intrinsics.i(state, "state");
        ButtonUIState buttonUIState = state.d;
        ErrorWithMsgAndRetryUISpecs errorWithMsgAndRetryUISpecs = state.f;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1961253251);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changed(state) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changed(modifier) ? 32 : 16;
        }
        if (composerStartRestartGroup.shouldExecute((i2 & 19) != 18, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1961253251, i2, -1, "app.chalo.compose.GenericErrorScreenWithMsgAndRetry (StandardErrorScreen.kt:55)");
            }
            boolean z = errorWithMsgAndRetryUISpecs.h;
            float f3 = errorWithMsgAndRetryUISpecs.d;
            boolean zChanged = composerStartRestartGroup.changed(z);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = errorWithMsgAndRetryUISpecs.h ? SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null) : Modifier.INSTANCE;
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            Modifier modifier2 = (Modifier) objRememberedValue;
            Modifier modifierC = ChaloThemeKt.c(SizeKt.fillMaxWidth$default(modifier, 0.0f, 1, null), errorWithMsgAndRetryUISpecs.f10021a);
            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(UiArrangementKt.a(errorWithMsgAndRetryUISpecs.g), UiAlignmentKt.a(errorWithMsgAndRetryUISpecs.f), composerStartRestartGroup, 0);
            long currentCompositeKeyHashCode = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
            int i3 = (int) (currentCompositeKeyHashCode ^ (currentCompositeKeyHashCode >>> 32));
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierC);
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
            pk0.v(companion, composerM3915constructorimpl, measurePolicyColumnMeasurePolicy, composerM3915constructorimpl, currentCompositionLocalMap);
            Updater.m3923setimpl(composerM3915constructorimpl, modifierMaterializeModifier, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion, composerM3915constructorimpl, Integer.valueOf(i3), composerM3915constructorimpl));
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
            ImageUIState imageUIState = state.f10023a;
            if (imageUIState == null) {
                composerStartRestartGroup.startReplaceGroup(837709468);
                composerStartRestartGroup.endReplaceGroup();
                f = 0.0f;
                composer3 = composerStartRestartGroup;
                obj = null;
            } else {
                composerStartRestartGroup.startReplaceGroup(837709469);
                composer3 = composerStartRestartGroup;
                f = 0.0f;
                obj = null;
                CommonImageKt.a(imageUIState, null, false, composer3, 0, 6);
                ChaloSpacersKt.a(errorWithMsgAndRetryUISpecs.b, composer3, 0);
                composer3.endReplaceGroup();
            }
            TextUIState.ChaloTextUIState chaloTextUIState = state.b;
            Modifier.Companion companion2 = Modifier.INSTANCE;
            Composer composer4 = composer3;
            ChaloTextViewKt.a(SizeKt.fillMaxWidth$default(companion2, f, 1, obj), chaloTextUIState, null, null, composer4, 6, 12);
            composer2 = composer4;
            TextUIState.ChaloTextUIState chaloTextUIState2 = state.c;
            if (chaloTextUIState2 == null) {
                composer2.startReplaceGroup(837998202);
            } else {
                composer2.startReplaceGroup(837998203);
                ChaloSpacersKt.a(errorWithMsgAndRetryUISpecs.c, composer2, 0);
                ChaloTextViewKt.a(SizeKt.fillMaxWidth$default(companion2, f, 1, obj), chaloTextUIState2, null, null, composer2, 6, 12);
                composer2 = composer2;
            }
            composer2.endReplaceGroup();
            if (buttonUIState == null) {
                composer2.startReplaceGroup(838248465);
                composer2.endReplaceGroup();
                f2 = f3;
            } else {
                composer2.startReplaceGroup(838248466);
                f2 = f3;
                ChaloSpacersKt.a(f2, composer2, 0);
                ChaloFilledButtonKt.a(0, 0, composer2, modifier2, buttonUIState);
                composer2.endReplaceGroup();
            }
            ButtonUIState buttonUIState2 = state.e;
            if (buttonUIState2 == null) {
                composer2.startReplaceGroup(838481337);
            } else {
                composer2.startReplaceGroup(838481338);
                if (buttonUIState != null) {
                    composer2.startReplaceGroup(1261624199);
                    ChaloSpacersKt.a(errorWithMsgAndRetryUISpecs.e, composer2, 0);
                    composer2.endReplaceGroup();
                } else {
                    composer2.startReplaceGroup(1261712611);
                    ChaloSpacersKt.a(f2, composer2, 0);
                    composer2.endReplaceGroup();
                }
                ChaloFilledButtonKt.a(0, 0, composer2, modifier2, buttonUIState2);
            }
            composer2.endReplaceGroup();
            composer2.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer2 = composerStartRestartGroup;
            composer2.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new sa1(state, modifier, i, 4));
        }
    }

    public static final void c(StandardErrorScreenUIState state, Modifier modifier, Composer composer, int i, int i2) {
        int i3;
        Intrinsics.i(state, "state");
        Composer composerStartRestartGroup = composer.startRestartGroup(1271687991);
        if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changed(state) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i4 = i2 & 2;
        if (i4 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changed(modifier) ? 32 : 16;
        }
        if (composerStartRestartGroup.shouldExecute((i3 & 19) != 18, i3 & 1)) {
            if (i4 != 0) {
                modifier = Modifier.INSTANCE;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1271687991, i3, -1, "app.chalo.compose.StandardErrorScreen (StandardErrorScreen.kt:33)");
            }
            if (state instanceof StandardErrorScreenUIState.ErrorWithMsgAndRetry) {
                composerStartRestartGroup.startReplaceGroup(-1049393280);
                b((StandardErrorScreenUIState.ErrorWithMsgAndRetry) state, modifier, composerStartRestartGroup, i3 & WebSocketProtocol.PAYLOAD_SHORT);
                composerStartRestartGroup.endReplaceGroup();
            } else {
                if (!(state instanceof StandardErrorScreenUIState.NewErrorWithMsgAndRetry)) {
                    throw pk0.p(composerStartRestartGroup, -1973516187);
                }
                composerStartRestartGroup.startReplaceGroup(-1049188835);
                NewGenericErrorScreenWithMsgAndRetryKt.a(modifier, (StandardErrorScreenUIState.NewErrorWithMsgAndRetry) state, composerStartRestartGroup, ((i3 << 3) & 112) | ((i3 >> 3) & 14), 0);
                composerStartRestartGroup.endReplaceGroup();
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        Modifier modifier2 = modifier;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new xa1(state, modifier2, i, i2, 0));
        }
    }
}
