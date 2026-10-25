package app.chalo.compose.components;

import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
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
import app.chalo.compose.components.buttons.ChaloFilledButtonKt;
import app.chalo.compose.resources.StringResourcesHelperKt;
import app.chalo.compose.theme.ChaloTheme;
import app.chalo.compose.theme.ChaloTypographyKt;
import app.chalo.providers.stringprovider.StringEnum;
import defpackage.b60;
import defpackage.gf;
import defpackage.pk0;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"chalo-base_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class GenericScreenWithCtaKt {
    /* JADX WARN: Code duplicated, block: B:100:0x0126 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:101:0x0128  */
    /* JADX WARN: Code duplicated, block: B:103:0x012d  */
    /* JADX WARN: Code duplicated, block: B:106:0x0132  */
    /* JADX WARN: Code duplicated, block: B:107:0x013d  */
    /* JADX WARN: Code duplicated, block: B:110:0x0143  */
    /* JADX WARN: Code duplicated, block: B:111:0x014e  */
    /* JADX WARN: Code duplicated, block: B:114:0x0157  */
    /* JADX WARN: Code duplicated, block: B:117:0x0162  */
    /* JADX WARN: Code duplicated, block: B:120:0x01ac  */
    /* JADX WARN: Code duplicated, block: B:121:0x01af  */
    /* JADX WARN: Code duplicated, block: B:123:0x01b3  */
    /* JADX WARN: Code duplicated, block: B:126:0x01bf  */
    /* JADX WARN: Code duplicated, block: B:127:0x01c3  */
    /* JADX WARN: Code duplicated, block: B:130:0x01df  */
    /* JADX WARN: Code duplicated, block: B:131:0x0218  */
    /* JADX WARN: Code duplicated, block: B:134:0x0294  */
    /* JADX WARN: Code duplicated, block: B:135:0x0296  */
    /* JADX WARN: Code duplicated, block: B:137:0x0299  */
    /* JADX WARN: Code duplicated, block: B:138:0x02ff  */
    /* JADX WARN: Code duplicated, block: B:140:0x0310  */
    /* JADX WARN: Code duplicated, block: B:142:0x033c  */
    /* JADX WARN: Code duplicated, block: B:145:0x034f  */
    /* JADX WARN: Code duplicated, block: B:147:0x035a  */
    /* JADX WARN: Code duplicated, block: B:150:0x0369  */
    /* JADX WARN: Code duplicated, block: B:152:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:23:0x0046  */
    /* JADX WARN: Code duplicated, block: B:24:0x0049  */
    /* JADX WARN: Code duplicated, block: B:26:0x004d  */
    /* JADX WARN: Code duplicated, block: B:28:0x0051  */
    /* JADX WARN: Code duplicated, block: B:29:0x0056  */
    /* JADX WARN: Code duplicated, block: B:31:0x005c  */
    /* JADX WARN: Code duplicated, block: B:32:0x005f  */
    /* JADX WARN: Code duplicated, block: B:36:0x0066  */
    /* JADX WARN: Code duplicated, block: B:44:0x007b  */
    /* JADX WARN: Code duplicated, block: B:47:0x0081  */
    /* JADX WARN: Code duplicated, block: B:49:0x0089  */
    /* JADX WARN: Code duplicated, block: B:50:0x008c  */
    /* JADX WARN: Code duplicated, block: B:52:0x0090  */
    /* JADX WARN: Code duplicated, block: B:55:0x0097  */
    /* JADX WARN: Code duplicated, block: B:63:0x00ac  */
    /* JADX WARN: Code duplicated, block: B:66:0x00b4  */
    /* JADX WARN: Code duplicated, block: B:67:0x00bb  */
    /* JADX WARN: Code duplicated, block: B:69:0x00c3  */
    /* JADX WARN: Code duplicated, block: B:71:0x00c9  */
    /* JADX WARN: Code duplicated, block: B:72:0x00cc  */
    /* JADX WARN: Code duplicated, block: B:76:0x00d6  */
    /* JADX WARN: Code duplicated, block: B:78:0x00dc  */
    /* JADX WARN: Code duplicated, block: B:79:0x00df  */
    /* JADX WARN: Code duplicated, block: B:83:0x00ef  */
    /* JADX WARN: Code duplicated, block: B:84:0x00f1  */
    /* JADX WARN: Code duplicated, block: B:87:0x00fa  */
    /* JADX WARN: Code duplicated, block: B:99:0x0123 A[PHI: r0 r3 r4 r6 r9
      0x0123: PHI (r0v8 androidx.compose.ui.Modifier) = (r0v3 androidx.compose.ui.Modifier), (r0v9 androidx.compose.ui.Modifier) binds: [B:113:0x0155, B:98:0x011c] A[DONT_GENERATE, DONT_INLINE]
      0x0123: PHI (r3v25 java.lang.String) = (r3v11 java.lang.String), (r3v30 java.lang.String) binds: [B:113:0x0155, B:98:0x011c] A[DONT_GENERATE, DONT_INLINE]
      0x0123: PHI (r4v25 int) = (r4v17 int), (r4v27 int) binds: [B:113:0x0155, B:98:0x011c] A[DONT_GENERATE, DONT_INLINE]
      0x0123: PHI (r6v19 java.lang.String) = (r6v5 java.lang.String), (r6v20 java.lang.String) binds: [B:113:0x0155, B:98:0x011c] A[DONT_GENERATE, DONT_INLINE]
      0x0123: PHI (r9v22 androidx.compose.ui.graphics.painter.Painter) = (r9v5 androidx.compose.ui.graphics.painter.Painter), (r9v23 androidx.compose.ui.graphics.painter.Painter) binds: [B:113:0x0155, B:98:0x011c] A[DONT_GENERATE, DONT_INLINE]] */
    public static final void a(Modifier modifier, Modifier modifier2, Painter painter, String str, String str2, String str3, boolean z, Function0 onRetryClicked, Composer composer, int i, int i2) {
        int i3;
        Modifier modifier3;
        int i4;
        boolean zChangedInstance;
        int i5;
        int i6;
        boolean z2;
        char c;
        int i7;
        boolean z3;
        String str4;
        String str5;
        Painter painter2;
        Modifier modifier4;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        String strC;
        String strC2;
        Painter painter3;
        Modifier modifier5;
        boolean z4;
        String str6;
        Function0<ComposeUiNode> constructor;
        boolean z5;
        int i8;
        int i9;
        Modifier.Companion companion;
        TextAlign.Companion companion2;
        int i10;
        String str7;
        int i11;
        int i12;
        Painter painter4 = painter;
        Intrinsics.i(onRetryClicked, "onRetryClicked");
        Composer composerStartRestartGroup = composer.startRestartGroup(-692191824);
        if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changed(modifier) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i13 = i2 & 2;
        if (i13 == 0) {
            if ((i & 48) == 0) {
                modifier3 = modifier2;
                i3 |= composerStartRestartGroup.changed(modifier3) ? 32 : 16;
            }
            i4 = i2 & 4;
            if (i4 != 0) {
                i3 |= 384;
            } else if ((i & 384) == 0) {
                if ((i & 512) == 0) {
                    zChangedInstance = composerStartRestartGroup.changed(painter4);
                } else {
                    zChangedInstance = composerStartRestartGroup.changedInstance(painter4);
                }
                if (zChangedInstance) {
                    i5 = 256;
                } else {
                    i5 = 128;
                }
                i3 |= i5;
            }
            if ((i & 3072) != 0) {
                i3 |= ((i2 & 8) == 0 || !composerStartRestartGroup.changed(str)) ? 1024 : 2048;
            }
            if ((i & 24576) != 0) {
                if (composerStartRestartGroup.changed(str2)) {
                    i12 = 16384;
                } else {
                    i12 = 8192;
                }
                i3 |= i12;
            }
            if ((196608 & i) != 0) {
                i3 |= ((i2 & 32) == 0 || !composerStartRestartGroup.changed(str3)) ? 65536 : 131072;
            }
            i6 = i2 & 64;
            if (i6 != 0) {
                i3 |= 1572864;
                z2 = z;
                c = ' ';
            } else {
                z2 = z;
                c = ' ';
                if ((i & 1572864) == 0) {
                    if (composerStartRestartGroup.changed(z2)) {
                        i7 = 1048576;
                    } else {
                        i7 = 524288;
                    }
                    i3 |= i7;
                }
            }
            if ((i & 12582912) == 0) {
                if (composerStartRestartGroup.changedInstance(onRetryClicked)) {
                    i11 = 8388608;
                } else {
                    i11 = 4194304;
                }
                i3 |= i11;
            }
            if ((i3 & 4793491) != 4793490) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (composerStartRestartGroup.shouldExecute(z3, i3 & 1)) {
                composerStartRestartGroup.startDefaults();
                if ((i & 1) != 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                    if (i13 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    }
                    if (i4 != 0) {
                        painter4 = null;
                    }
                    if ((i2 & 8) != 0) {
                        strC = StringResourcesHelperKt.c(StringEnum.REFRESH_CALL_FAILURE, new Object[0], composerStartRestartGroup, 6);
                        i3 &= -7169;
                    } else {
                        strC = str;
                    }
                    if ((i2 & 32) != 0) {
                        strC2 = StringResourcesHelperKt.c(StringEnum.TRY_AGAIN_CAPS, new Object[0], composerStartRestartGroup, 6);
                        i3 &= -458753;
                    } else {
                        strC2 = str3;
                    }
                    Modifier modifier6 = modifier3;
                    painter3 = painter4;
                    modifier5 = modifier6;
                    if (i6 != 0) {
                        z4 = true;
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-692191824, i3, -1, "app.chalo.compose.components.GenericScreenWithCta (GenericScreenWithCta.kt:40)");
                    }
                    Modifier modifierM786paddingVpY3zN4$default = PaddingKt.m786paddingVpY3zN4$default(SizeKt.fillMaxWidth$default(modifier, 0.0f, 1, null), ChaloTheme.b(composerStartRestartGroup, 6).h, 0.0f, 2, null);
                    MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getCenter(), Alignment.INSTANCE.getCenterHorizontally(), composerStartRestartGroup, 54);
                    long currentCompositeKeyHashCode = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
                    str6 = strC2;
                    int i14 = (int) (currentCompositeKeyHashCode ^ (currentCompositeKeyHashCode >>> c));
                    CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierM786paddingVpY3zN4$default);
                    ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
                    constructor = companion3.getConstructor();
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
                    pk0.v(companion3, composerM3915constructorimpl, measurePolicyColumnMeasurePolicy, composerM3915constructorimpl, currentCompositionLocalMap);
                    Updater.m3923setimpl(composerM3915constructorimpl, modifierMaterializeModifier, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion3, composerM3915constructorimpl, Integer.valueOf(i14), composerM3915constructorimpl));
                    ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
                    if (painter3 != null) {
                        composerStartRestartGroup.startReplaceGroup(-1716198606);
                        i8 = 0;
                        i9 = 6;
                        ImageKt.Image(painter3, "", (Modifier) null, (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composerStartRestartGroup, Painter.$stable | 48 | ((i3 >> 6) & 14), 124);
                        composerStartRestartGroup = composerStartRestartGroup;
                        gf.r(Modifier.INSTANCE, ChaloTheme.b(composerStartRestartGroup, 6).i, composerStartRestartGroup, 0);
                    } else {
                        i8 = 0;
                        i9 = 6;
                        composerStartRestartGroup.startReplaceGroup(-1718230904);
                        composerStartRestartGroup.endReplaceGroup();
                    }
                    TextStyle textStyleF = ChaloTypographyKt.f(ChaloTheme.e(composerStartRestartGroup, i9));
                    long j = ChaloTheme.a(composerStartRestartGroup, i9).g;
                    companion = Modifier.INSTANCE;
                    Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null);
                    companion2 = TextAlign.INSTANCE;
                    Composer composer2 = composerStartRestartGroup;
                    String str8 = strC;
                    androidx.compose.material3.TextKt.m2623TextNvy7gAk(str8, modifierFillMaxWidth$default, j, null, 0L, null, null, null, 0L, null, TextAlign.m7161boximpl(companion2.m7168getCentere0LSkKk()), 0L, 0, false, 0, 0, null, textStyleF, composer2, ((i3 >> 9) & 14) | 48, 0, 130040);
                    composerStartRestartGroup = composer2;
                    if (str2.length() > 0) {
                        i10 = 1;
                    } else {
                        i10 = i8;
                    }
                    if (i10 != 0) {
                        composerStartRestartGroup.startReplaceGroup(-1715740860);
                        SpacerKt.Spacer(SizeKt.m814height3ABfNKs(companion, ChaloTheme.b(composerStartRestartGroup, i9).g), composerStartRestartGroup, i8);
                        androidx.compose.material3.TextKt.m2623TextNvy7gAk(str2, SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), ChaloTheme.a(composerStartRestartGroup, i9).g, null, 0L, null, null, null, 0L, null, TextAlign.m7161boximpl(companion2.m7168getCentere0LSkKk()), 0L, 0, false, 0, 0, null, ChaloTypographyKt.c(ChaloTheme.e(composerStartRestartGroup, i9)), composerStartRestartGroup, ((i3 >> 12) & 14) | 48, 0, 130040);
                        gf.r(companion, ChaloTheme.b(composerStartRestartGroup, i9).i, composerStartRestartGroup, i8);
                    } else {
                        composerStartRestartGroup.startReplaceGroup(-1715297901);
                        gf.r(companion, ChaloTheme.b(composerStartRestartGroup, i9).i, composerStartRestartGroup, i8);
                    }
                    if (z4) {
                        composerStartRestartGroup = composerStartRestartGroup;
                        composerStartRestartGroup.startReplaceGroup(-1715176629);
                        str7 = str6;
                        modifier4 = modifier5;
                        ChaloFilledButtonKt.g(modifier4, str7, null, 0L, null, false, 0.0f, null, 0L, onRetryClicked, composerStartRestartGroup, ((i3 >> 3) & 14) | ((i3 >> 12) & 112) | ((i3 << i9) & 1879048192), TypedValues.PositionType.TYPE_CURVE_FIT);
                    } else {
                        composerStartRestartGroup = composerStartRestartGroup;
                        str7 = str6;
                        modifier4 = modifier5;
                        composerStartRestartGroup.startReplaceGroup(-1718230904);
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    composerStartRestartGroup.endNode();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    str5 = str7;
                    z2 = z4;
                    painter2 = painter3;
                    str4 = str8;
                } else {
                    composerStartRestartGroup.skipToGroupEnd();
                    if ((i2 & 8) != 0) {
                        i3 &= -7169;
                    }
                    if ((i2 & 32) != 0) {
                        i3 &= -458753;
                    }
                    Modifier modifier7 = modifier3;
                    painter3 = painter4;
                    modifier5 = modifier7;
                    strC = str;
                    strC2 = str3;
                }
                z4 = z2;
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-692191824, i3, -1, "app.chalo.compose.components.GenericScreenWithCta (GenericScreenWithCta.kt:40)");
                }
                Modifier modifierM786paddingVpY3zN4$default2 = PaddingKt.m786paddingVpY3zN4$default(SizeKt.fillMaxWidth$default(modifier, 0.0f, 1, null), ChaloTheme.b(composerStartRestartGroup, 6).h, 0.0f, 2, null);
                MeasurePolicy measurePolicyColumnMeasurePolicy2 = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getCenter(), Alignment.INSTANCE.getCenterHorizontally(), composerStartRestartGroup, 54);
                long currentCompositeKeyHashCode2 = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
                str6 = strC2;
                int i15 = (int) (currentCompositeKeyHashCode2 ^ (currentCompositeKeyHashCode2 >>> c));
                CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierM786paddingVpY3zN4$default2);
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
                Composer composerM3915constructorimpl2 = Updater.m3915constructorimpl(composerStartRestartGroup);
                pk0.v(companion4, composerM3915constructorimpl2, measurePolicyColumnMeasurePolicy2, composerM3915constructorimpl2, currentCompositionLocalMap2);
                Updater.m3923setimpl(composerM3915constructorimpl2, modifierMaterializeModifier2, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion4, composerM3915constructorimpl2, Integer.valueOf(i15), composerM3915constructorimpl2));
                ColumnScopeInstance columnScopeInstance2 = ColumnScopeInstance.INSTANCE;
                if (painter3 != null) {
                    composerStartRestartGroup.startReplaceGroup(-1716198606);
                    i8 = 0;
                    i9 = 6;
                    ImageKt.Image(painter3, "", (Modifier) null, (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composerStartRestartGroup, Painter.$stable | 48 | ((i3 >> 6) & 14), 124);
                    composerStartRestartGroup = composerStartRestartGroup;
                    gf.r(Modifier.INSTANCE, ChaloTheme.b(composerStartRestartGroup, 6).i, composerStartRestartGroup, 0);
                } else {
                    i8 = 0;
                    i9 = 6;
                    composerStartRestartGroup.startReplaceGroup(-1718230904);
                    composerStartRestartGroup.endReplaceGroup();
                }
                TextStyle textStyleF2 = ChaloTypographyKt.f(ChaloTheme.e(composerStartRestartGroup, i9));
                long j2 = ChaloTheme.a(composerStartRestartGroup, i9).g;
                companion = Modifier.INSTANCE;
                Modifier modifierFillMaxWidth$default2 = SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null);
                companion2 = TextAlign.INSTANCE;
                Composer composer3 = composerStartRestartGroup;
                String str9 = strC;
                androidx.compose.material3.TextKt.m2623TextNvy7gAk(str9, modifierFillMaxWidth$default2, j2, null, 0L, null, null, null, 0L, null, TextAlign.m7161boximpl(companion2.m7168getCentere0LSkKk()), 0L, 0, false, 0, 0, null, textStyleF2, composer3, ((i3 >> 9) & 14) | 48, 0, 130040);
                composerStartRestartGroup = composer3;
                if (str2.length() > 0) {
                    i10 = 1;
                } else {
                    i10 = i8;
                }
                if (i10 != 0) {
                    composerStartRestartGroup.startReplaceGroup(-1715740860);
                    SpacerKt.Spacer(SizeKt.m814height3ABfNKs(companion, ChaloTheme.b(composerStartRestartGroup, i9).g), composerStartRestartGroup, i8);
                    androidx.compose.material3.TextKt.m2623TextNvy7gAk(str2, SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), ChaloTheme.a(composerStartRestartGroup, i9).g, null, 0L, null, null, null, 0L, null, TextAlign.m7161boximpl(companion2.m7168getCentere0LSkKk()), 0L, 0, false, 0, 0, null, ChaloTypographyKt.c(ChaloTheme.e(composerStartRestartGroup, i9)), composerStartRestartGroup, ((i3 >> 12) & 14) | 48, 0, 130040);
                    gf.r(companion, ChaloTheme.b(composerStartRestartGroup, i9).i, composerStartRestartGroup, i8);
                } else {
                    composerStartRestartGroup.startReplaceGroup(-1715297901);
                    gf.r(companion, ChaloTheme.b(composerStartRestartGroup, i9).i, composerStartRestartGroup, i8);
                }
                if (z4) {
                    composerStartRestartGroup = composerStartRestartGroup;
                    composerStartRestartGroup.startReplaceGroup(-1715176629);
                    str7 = str6;
                    modifier4 = modifier5;
                    ChaloFilledButtonKt.g(modifier4, str7, null, 0L, null, false, 0.0f, null, 0L, onRetryClicked, composerStartRestartGroup, ((i3 >> 3) & 14) | ((i3 >> 12) & 112) | ((i3 << i9) & 1879048192), TypedValues.PositionType.TYPE_CURVE_FIT);
                } else {
                    composerStartRestartGroup = composerStartRestartGroup;
                    str7 = str6;
                    modifier4 = modifier5;
                    composerStartRestartGroup.startReplaceGroup(-1718230904);
                }
                composerStartRestartGroup.endReplaceGroup();
                composerStartRestartGroup.endNode();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                str5 = str7;
                z2 = z4;
                painter2 = painter3;
                str4 = str9;
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                str4 = str;
                str5 = str3;
                painter2 = painter4;
                modifier4 = modifier3;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new b60(modifier, modifier4, painter2, str4, str2, str5, z2, onRetryClicked, i, i2, 0));
            }
        }
        i3 |= 48;
        modifier3 = modifier2;
        i4 = i2 & 4;
        if (i4 != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            if ((i & 512) == 0) {
                zChangedInstance = composerStartRestartGroup.changed(painter4);
            } else {
                zChangedInstance = composerStartRestartGroup.changedInstance(painter4);
            }
            if (zChangedInstance) {
                i5 = 256;
            } else {
                i5 = 128;
            }
            i3 |= i5;
        }
        if ((i & 3072) != 0) {
            i3 |= ((i2 & 8) == 0 || !composerStartRestartGroup.changed(str)) ? 1024 : 2048;
        }
        if ((i & 24576) != 0) {
            if (composerStartRestartGroup.changed(str2)) {
                i12 = 16384;
            } else {
                i12 = 8192;
            }
            i3 |= i12;
        }
        if ((196608 & i) != 0) {
            i3 |= ((i2 & 32) == 0 || !composerStartRestartGroup.changed(str3)) ? 65536 : 131072;
        }
        i6 = i2 & 64;
        if (i6 != 0) {
            i3 |= 1572864;
            z2 = z;
            c = ' ';
        } else {
            z2 = z;
            c = ' ';
            if ((i & 1572864) == 0) {
                if (composerStartRestartGroup.changed(z2)) {
                    i7 = 1048576;
                } else {
                    i7 = 524288;
                }
                i3 |= i7;
            }
        }
        if ((i & 12582912) == 0) {
            if (composerStartRestartGroup.changedInstance(onRetryClicked)) {
                i11 = 8388608;
            } else {
                i11 = 4194304;
            }
            i3 |= i11;
        }
        if ((i3 & 4793491) != 4793490) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (composerStartRestartGroup.shouldExecute(z3, i3 & 1)) {
            composerStartRestartGroup.startDefaults();
            if ((i & 1) != 0) {
                if (i13 != 0) {
                    modifier3 = Modifier.INSTANCE;
                }
                if (i4 != 0) {
                    painter4 = null;
                }
                if ((i2 & 8) != 0) {
                    strC = StringResourcesHelperKt.c(StringEnum.REFRESH_CALL_FAILURE, new Object[0], composerStartRestartGroup, 6);
                    i3 &= -7169;
                } else {
                    strC = str;
                }
                if ((i2 & 32) != 0) {
                    strC2 = StringResourcesHelperKt.c(StringEnum.TRY_AGAIN_CAPS, new Object[0], composerStartRestartGroup, 6);
                    i3 &= -458753;
                } else {
                    strC2 = str3;
                }
                Modifier modifier8 = modifier3;
                painter3 = painter4;
                modifier5 = modifier8;
                if (i6 != 0) {
                    z4 = true;
                } else {
                    z4 = z2;
                }
            } else {
                if (i13 != 0) {
                    modifier3 = Modifier.INSTANCE;
                }
                if (i4 != 0) {
                    painter4 = null;
                }
                if ((i2 & 8) != 0) {
                    strC = StringResourcesHelperKt.c(StringEnum.REFRESH_CALL_FAILURE, new Object[0], composerStartRestartGroup, 6);
                    i3 &= -7169;
                } else {
                    strC = str;
                }
                if ((i2 & 32) != 0) {
                    strC2 = StringResourcesHelperKt.c(StringEnum.TRY_AGAIN_CAPS, new Object[0], composerStartRestartGroup, 6);
                    i3 &= -458753;
                } else {
                    strC2 = str3;
                }
                Modifier modifier9 = modifier3;
                painter3 = painter4;
                modifier5 = modifier9;
                if (i6 != 0) {
                    z4 = true;
                } else {
                    z4 = z2;
                }
            }
            composerStartRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-692191824, i3, -1, "app.chalo.compose.components.GenericScreenWithCta (GenericScreenWithCta.kt:40)");
            }
            Modifier modifierM786paddingVpY3zN4$default3 = PaddingKt.m786paddingVpY3zN4$default(SizeKt.fillMaxWidth$default(modifier, 0.0f, 1, null), ChaloTheme.b(composerStartRestartGroup, 6).h, 0.0f, 2, null);
            MeasurePolicy measurePolicyColumnMeasurePolicy3 = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getCenter(), Alignment.INSTANCE.getCenterHorizontally(), composerStartRestartGroup, 54);
            long currentCompositeKeyHashCode3 = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
            str6 = strC2;
            int i16 = (int) (currentCompositeKeyHashCode3 ^ (currentCompositeKeyHashCode3 >>> c));
            CompositionLocalMap currentCompositionLocalMap3 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier3 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierM786paddingVpY3zN4$default3);
            ComposeUiNode.Companion companion5 = ComposeUiNode.INSTANCE;
            constructor = companion5.getConstructor();
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
            Composer composerM3915constructorimpl3 = Updater.m3915constructorimpl(composerStartRestartGroup);
            pk0.v(companion5, composerM3915constructorimpl3, measurePolicyColumnMeasurePolicy3, composerM3915constructorimpl3, currentCompositionLocalMap3);
            Updater.m3923setimpl(composerM3915constructorimpl3, modifierMaterializeModifier3, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion5, composerM3915constructorimpl3, Integer.valueOf(i16), composerM3915constructorimpl3));
            ColumnScopeInstance columnScopeInstance3 = ColumnScopeInstance.INSTANCE;
            if (painter3 != null) {
                composerStartRestartGroup.startReplaceGroup(-1716198606);
                i8 = 0;
                i9 = 6;
                ImageKt.Image(painter3, "", (Modifier) null, (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composerStartRestartGroup, Painter.$stable | 48 | ((i3 >> 6) & 14), 124);
                composerStartRestartGroup = composerStartRestartGroup;
                gf.r(Modifier.INSTANCE, ChaloTheme.b(composerStartRestartGroup, 6).i, composerStartRestartGroup, 0);
            } else {
                i8 = 0;
                i9 = 6;
                composerStartRestartGroup.startReplaceGroup(-1718230904);
                composerStartRestartGroup.endReplaceGroup();
            }
            TextStyle textStyleF3 = ChaloTypographyKt.f(ChaloTheme.e(composerStartRestartGroup, i9));
            long j3 = ChaloTheme.a(composerStartRestartGroup, i9).g;
            companion = Modifier.INSTANCE;
            Modifier modifierFillMaxWidth$default3 = SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null);
            companion2 = TextAlign.INSTANCE;
            Composer composer4 = composerStartRestartGroup;
            String str10 = strC;
            androidx.compose.material3.TextKt.m2623TextNvy7gAk(str10, modifierFillMaxWidth$default3, j3, null, 0L, null, null, null, 0L, null, TextAlign.m7161boximpl(companion2.m7168getCentere0LSkKk()), 0L, 0, false, 0, 0, null, textStyleF3, composer4, ((i3 >> 9) & 14) | 48, 0, 130040);
            composerStartRestartGroup = composer4;
            if (str2.length() > 0) {
                i10 = 1;
            } else {
                i10 = i8;
            }
            if (i10 != 0) {
                composerStartRestartGroup.startReplaceGroup(-1715740860);
                SpacerKt.Spacer(SizeKt.m814height3ABfNKs(companion, ChaloTheme.b(composerStartRestartGroup, i9).g), composerStartRestartGroup, i8);
                androidx.compose.material3.TextKt.m2623TextNvy7gAk(str2, SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), ChaloTheme.a(composerStartRestartGroup, i9).g, null, 0L, null, null, null, 0L, null, TextAlign.m7161boximpl(companion2.m7168getCentere0LSkKk()), 0L, 0, false, 0, 0, null, ChaloTypographyKt.c(ChaloTheme.e(composerStartRestartGroup, i9)), composerStartRestartGroup, ((i3 >> 12) & 14) | 48, 0, 130040);
                gf.r(companion, ChaloTheme.b(composerStartRestartGroup, i9).i, composerStartRestartGroup, i8);
            } else {
                composerStartRestartGroup.startReplaceGroup(-1715297901);
                gf.r(companion, ChaloTheme.b(composerStartRestartGroup, i9).i, composerStartRestartGroup, i8);
            }
            if (z4) {
                composerStartRestartGroup = composerStartRestartGroup;
                composerStartRestartGroup.startReplaceGroup(-1715176629);
                str7 = str6;
                modifier4 = modifier5;
                ChaloFilledButtonKt.g(modifier4, str7, null, 0L, null, false, 0.0f, null, 0L, onRetryClicked, composerStartRestartGroup, ((i3 >> 3) & 14) | ((i3 >> 12) & 112) | ((i3 << i9) & 1879048192), TypedValues.PositionType.TYPE_CURVE_FIT);
            } else {
                composerStartRestartGroup = composerStartRestartGroup;
                str7 = str6;
                modifier4 = modifier5;
                composerStartRestartGroup.startReplaceGroup(-1718230904);
            }
            composerStartRestartGroup.endReplaceGroup();
            composerStartRestartGroup.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            str5 = str7;
            z2 = z4;
            painter2 = painter3;
            str4 = str10;
        } else {
            composerStartRestartGroup.skipToGroupEnd();
            str4 = str;
            str5 = str3;
            painter2 = painter4;
            modifier4 = modifier3;
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new b60(modifier, modifier4, painter2, str4, str2, str5, z2, onRetryClicked, i, i2, 0));
        }
    }
}
