package app.chalo.compose;

import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.material3.TextKt;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImplKt;
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
import androidx.compose.ui.unit.TextUnitKt;
import androidx.core.view.accessibility.AccessibilityEventCompat;
import androidx.profileinstaller.ProfileVerifier;
import app.chalo.compose.BottomSheetContentWithIconTitleSubTextKt;
import app.chalo.compose.components.buttons.ChaloFilledButtonKt;
import app.chalo.compose.resources.PainterResourceHelperKt;
import app.chalo.compose.theme.ChaloTheme;
import app.chalo.compose.theme.ChaloTypographyKt;
import app.chalo.providers.iconassetprovider.IconType;
import defpackage.gf;
import defpackage.pk0;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"chalo-base_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class BottomSheetContentWithIconTitleSubTextKt {
    /* JADX WARN: Code duplicated, block: B:100:0x012c  */
    /* JADX WARN: Code duplicated, block: B:102:0x0130  */
    /* JADX WARN: Code duplicated, block: B:104:0x013a  */
    /* JADX WARN: Code duplicated, block: B:105:0x013d  */
    /* JADX WARN: Code duplicated, block: B:107:0x0142  */
    /* JADX WARN: Code duplicated, block: B:110:0x014b  */
    /* JADX WARN: Code duplicated, block: B:111:0x0151  */
    /* JADX WARN: Code duplicated, block: B:113:0x0157  */
    /* JADX WARN: Code duplicated, block: B:115:0x015f  */
    /* JADX WARN: Code duplicated, block: B:117:0x0166  */
    /* JADX WARN: Code duplicated, block: B:124:0x0180  */
    /* JADX WARN: Code duplicated, block: B:127:0x0189  */
    /* JADX WARN: Code duplicated, block: B:131:0x01a2  */
    /* JADX WARN: Code duplicated, block: B:143:0x01d1  */
    /* JADX WARN: Code duplicated, block: B:144:0x01d4  */
    /* JADX WARN: Code duplicated, block: B:147:0x01d9  */
    /* JADX WARN: Code duplicated, block: B:148:0x01e4  */
    /* JADX WARN: Code duplicated, block: B:151:0x01f1  */
    /* JADX WARN: Code duplicated, block: B:154:0x0200  */
    /* JADX WARN: Code duplicated, block: B:155:0x020d  */
    /* JADX WARN: Code duplicated, block: B:157:0x0213  */
    /* JADX WARN: Code duplicated, block: B:158:0x0215  */
    /* JADX WARN: Code duplicated, block: B:160:0x0219  */
    /* JADX WARN: Code duplicated, block: B:162:0x0228  */
    /* JADX WARN: Code duplicated, block: B:165:0x023d  */
    /* JADX WARN: Code duplicated, block: B:169:0x0277  */
    /* JADX WARN: Code duplicated, block: B:172:0x0283  */
    /* JADX WARN: Code duplicated, block: B:173:0x0287  */
    /* JADX WARN: Code duplicated, block: B:176:0x02a0  */
    /* JADX WARN: Code duplicated, block: B:177:0x02b4  */
    /* JADX WARN: Code duplicated, block: B:181:0x0322  */
    /* JADX WARN: Code duplicated, block: B:184:0x032e  */
    /* JADX WARN: Code duplicated, block: B:185:0x0332  */
    /* JADX WARN: Code duplicated, block: B:188:0x03d7  */
    /* JADX WARN: Code duplicated, block: B:190:0x0424  */
    /* JADX WARN: Code duplicated, block: B:196:0x048d  */
    /* JADX WARN: Code duplicated, block: B:201:0x04d8  */
    /* JADX WARN: Code duplicated, block: B:204:0x04e9  */
    /* JADX WARN: Code duplicated, block: B:206:0x04fc  */
    /* JADX WARN: Code duplicated, block: B:209:0x0512  */
    /* JADX WARN: Code duplicated, block: B:211:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:33:0x0075  */
    /* JADX WARN: Code duplicated, block: B:35:0x007b  */
    /* JADX WARN: Code duplicated, block: B:36:0x007e  */
    /* JADX WARN: Code duplicated, block: B:40:0x0085  */
    /* JADX WARN: Code duplicated, block: B:42:0x0089  */
    /* JADX WARN: Code duplicated, block: B:44:0x0091  */
    /* JADX WARN: Code duplicated, block: B:45:0x0094  */
    /* JADX WARN: Code duplicated, block: B:48:0x009b  */
    /* JADX WARN: Code duplicated, block: B:51:0x00a3  */
    /* JADX WARN: Code duplicated, block: B:54:0x00ad  */
    /* JADX WARN: Code duplicated, block: B:56:0x00b3  */
    /* JADX WARN: Code duplicated, block: B:57:0x00b6  */
    /* JADX WARN: Code duplicated, block: B:61:0x00c0  */
    /* JADX WARN: Code duplicated, block: B:63:0x00c4  */
    /* JADX WARN: Code duplicated, block: B:65:0x00cc  */
    /* JADX WARN: Code duplicated, block: B:66:0x00cf  */
    /* JADX WARN: Code duplicated, block: B:69:0x00d6  */
    /* JADX WARN: Code duplicated, block: B:72:0x00de  */
    /* JADX WARN: Code duplicated, block: B:80:0x00f6  */
    /* JADX WARN: Code duplicated, block: B:83:0x0100  */
    /* JADX WARN: Code duplicated, block: B:85:0x0106  */
    /* JADX WARN: Code duplicated, block: B:86:0x0109  */
    /* JADX WARN: Code duplicated, block: B:90:0x0111  */
    /* JADX WARN: Code duplicated, block: B:92:0x0117  */
    /* JADX WARN: Code duplicated, block: B:93:0x011a  */
    /* JADX WARN: Code duplicated, block: B:95:0x011f  */
    /* JADX WARN: Code duplicated, block: B:98:0x0125  */
    public static final void a(final Modifier modifier, final IconType iconType, Modifier modifier2, final String title, TextStyle textStyle, long j, final String subText, TextStyle textStyle2, long j2, final String str, final Function0 function0, String str2, Function0 function1, Composer composer, final int i, final int i2, final int i3) {
        int i4;
        Modifier modifier3;
        TextStyle textStyle3;
        TextStyle textStyleC;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        boolean z;
        final long j3;
        final Modifier modifier4;
        final TextStyle textStyle4;
        final TextStyle textStyle5;
        Composer composer2;
        final long j4;
        final String str3;
        final Function0 function2;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Modifier modifier5;
        TextStyle textStyleE;
        long j5;
        int i12;
        long j6;
        String str4;
        Function0 function3;
        Modifier modifier6;
        TextStyle textStyle6;
        TextStyle textStyle7;
        Function0<ComposeUiNode> constructor;
        Object obj;
        int i13;
        int i14;
        Modifier.Companion companion;
        Function0<ComposeUiNode> constructor2;
        int i15;
        int i16;
        Composer composer3;
        TextStyle textStyle8;
        long j7;
        Modifier.Companion companion2;
        int i17;
        String str5;
        Function0 function4;
        int i18;
        int i19;
        int i20;
        int i21;
        Intrinsics.i(title, "title");
        Intrinsics.i(subText, "subText");
        Composer composerStartRestartGroup = composer.startRestartGroup(-1101492027);
        if ((i & 6) == 0) {
            i4 = (composerStartRestartGroup.changed(modifier) ? 4 : 2) | i;
        } else {
            i4 = i;
        }
        if ((i & 48) == 0) {
            i4 |= composerStartRestartGroup.changed(iconType == null ? -1 : iconType.ordinal()) ? 32 : 16;
        }
        int i22 = i3 & 4;
        if (i22 == 0) {
            if ((i & 384) == 0) {
                modifier3 = modifier2;
                i4 |= composerStartRestartGroup.changed(modifier3) ? 256 : 128;
            }
            if ((i & 3072) == 0) {
                if (composerStartRestartGroup.changed(title)) {
                    i21 = 2048;
                } else {
                    i21 = 1024;
                }
                i4 |= i21;
            }
            if ((i & 24576) == 0) {
                if ((i3 & 16) == 0) {
                    textStyle3 = textStyle;
                    int i23 = composerStartRestartGroup.changed(textStyle3) ? 16384 : 8192;
                    i4 |= i23;
                } else {
                    textStyle3 = textStyle;
                }
                i4 |= i23;
            } else {
                textStyle3 = textStyle;
            }
            if ((i & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
                i4 |= 65536;
            }
            if ((i & 1572864) == 0) {
                if (composerStartRestartGroup.changed(subText)) {
                    i20 = 1048576;
                } else {
                    i20 = 524288;
                }
                i4 |= i20;
            }
            if ((i & 12582912) == 0) {
                if ((i3 & 128) == 0) {
                    textStyleC = textStyle2;
                    int i24 = composerStartRestartGroup.changed(textStyleC) ? 8388608 : 4194304;
                    i4 |= i24;
                } else {
                    textStyleC = textStyle2;
                }
                i4 |= i24;
            } else {
                textStyleC = textStyle2;
            }
            if ((i & 100663296) == 0) {
                i5 = i4 | (((i3 & 256) == 0 || !composerStartRestartGroup.changed(j2)) ? 33554432 : AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL);
            } else {
                i5 = i4;
            }
            if ((i & 805306368) == 0) {
                if (composerStartRestartGroup.changed(str)) {
                    i19 = 536870912;
                } else {
                    i19 = 268435456;
                }
                i5 |= i19;
            }
            if ((i2 & 6) == 0) {
                if (composerStartRestartGroup.changedInstance(function0)) {
                    i18 = 4;
                } else {
                    i18 = 2;
                }
                i6 = i2 | i18;
            } else {
                i6 = i2;
            }
            i7 = i3 & 2048;
            if (i7 != 0) {
                i6 |= 48;
            } else if ((i2 & 48) != 0) {
                if (composerStartRestartGroup.changed(str2)) {
                    i8 = 32;
                } else {
                    i8 = 16;
                }
                i6 |= i8;
            }
            i9 = i6;
            i10 = i3 & 4096;
            if (i10 != 0) {
                i11 = i9 | 384;
            } else if ((i2 & 384) == 0) {
                i11 = i9 | (composerStartRestartGroup.changedInstance(function1) ? 256 : 128);
            } else {
                i11 = i9;
            }
            if ((i5 & 306783379) == 306783378 || (i11 & 147) != 146) {
                z = true;
            } else {
                z = false;
            }
            if (composerStartRestartGroup.shouldExecute(z, i5 & 1)) {
                composerStartRestartGroup.startDefaults();
                if ((i & 1) != 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                    if (i22 != 0) {
                        modifier5 = Modifier.INSTANCE;
                    } else {
                        modifier5 = modifier3;
                    }
                    if ((i3 & 16) != 0) {
                        textStyleE = ChaloTypographyKt.e(ChaloTheme.e(composerStartRestartGroup, 6));
                        i5 &= -57345;
                    } else {
                        textStyleE = textStyle3;
                    }
                    j5 = ChaloTheme.a(composerStartRestartGroup, 6).e;
                    i12 = i5 & (-458753);
                    if ((i3 & 128) != 0) {
                        i12 = i5 & (-29818881);
                        textStyleC = ChaloTypographyKt.c(ChaloTheme.e(composerStartRestartGroup, 6));
                    }
                    if ((i3 & 256) != 0) {
                        j6 = ChaloTheme.a(composerStartRestartGroup, 6).v0;
                        i12 &= -234881025;
                    } else {
                        j6 = j2;
                    }
                    if (i7 != 0) {
                        str4 = null;
                    } else {
                        str4 = str2;
                    }
                    if (i10 != 0) {
                        function3 = null;
                    } else {
                        function3 = function1;
                    }
                    modifier6 = modifier5;
                    textStyle6 = textStyleC;
                } else {
                    composerStartRestartGroup.skipToGroupEnd();
                    if ((i3 & 16) != 0) {
                        i5 &= -57345;
                    }
                    int i25 = i5 & (-458753);
                    if ((i3 & 128) != 0) {
                        i25 = i5 & (-29818881);
                    }
                    if ((i3 & 256) != 0) {
                        i25 &= -234881025;
                    }
                    j5 = j;
                    j6 = j2;
                    str4 = str2;
                    function3 = function1;
                    i12 = i25;
                    textStyleE = textStyle3;
                    textStyle6 = textStyleC;
                    modifier6 = modifier3;
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1101492027, i12, i11, "app.chalo.compose.BottomSheetContentWithIconTitleSubText (BottomSheetContentWithIconTitleSubText.kt:38)");
                }
                Alignment.Companion companion3 = Alignment.INSTANCE;
                Alignment.Horizontal centerHorizontally = companion3.getCenterHorizontally();
                Arrangement arrangement = Arrangement.INSTANCE;
                MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(arrangement.getTop(), centerHorizontally, composerStartRestartGroup, 48);
                long currentCompositeKeyHashCode = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
                int i26 = (int) (currentCompositeKeyHashCode ^ (currentCompositeKeyHashCode >>> 32));
                CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifier);
                ComposeUiNode.Companion companion4 = ComposeUiNode.INSTANCE;
                textStyle7 = textStyle6;
                constructor = companion4.getConstructor();
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
                pk0.v(companion4, composerM3915constructorimpl, measurePolicyColumnMeasurePolicy, composerM3915constructorimpl, currentCompositionLocalMap);
                Updater.m3923setimpl(composerM3915constructorimpl, modifierMaterializeModifier, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion4, composerM3915constructorimpl, Integer.valueOf(i26), composerM3915constructorimpl));
                ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
                if (iconType == null) {
                    composerStartRestartGroup.startReplaceGroup(-837845846);
                    composerStartRestartGroup.endReplaceGroup();
                    obj = null;
                    i13 = 1;
                    i14 = 0;
                } else {
                    composerStartRestartGroup.startReplaceGroup(-837845845);
                    obj = null;
                    i13 = 1;
                    ImageKt.Image(PainterResourceHelperKt.a(iconType, composerStartRestartGroup, 0), "", modifier6, (Alignment) null, ContentScale.INSTANCE.getFit(), 0.0f, (ColorFilter) null, composerStartRestartGroup, Painter.$stable | 24624 | (i12 & 896), 104);
                    composerStartRestartGroup = composerStartRestartGroup;
                    i14 = 0;
                    gf.r(Modifier.INSTANCE, ChaloTheme.b(composerStartRestartGroup, 6).k, composerStartRestartGroup, 0);
                }
                companion = Modifier.INSTANCE;
                Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(companion, 0.0f, i13, obj);
                MeasurePolicy measurePolicyColumnMeasurePolicy2 = ColumnKt.columnMeasurePolicy(arrangement.getTop(), companion3.getStart(), composerStartRestartGroup, i14);
                long currentCompositeKeyHashCode2 = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, i14);
                int i27 = (int) (currentCompositeKeyHashCode2 ^ (currentCompositeKeyHashCode2 >>> 32));
                CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierFillMaxWidth$default);
                constructor2 = companion4.getConstructor();
                if (composerStartRestartGroup.getApplier() == null) {
                    ComposablesKt.invalidApplier();
                }
                composerStartRestartGroup.startReusableNode();
                if (composerStartRestartGroup.getInserting()) {
                    composerStartRestartGroup.createNode(constructor2);
                } else {
                    composerStartRestartGroup.useNode();
                }
                Composer composerM3915constructorimpl2 = Updater.m3915constructorimpl(composerStartRestartGroup);
                pk0.v(companion4, composerM3915constructorimpl2, measurePolicyColumnMeasurePolicy2, composerM3915constructorimpl2, currentCompositionLocalMap2);
                Updater.m3923setimpl(composerM3915constructorimpl2, modifierMaterializeModifier2, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion4, composerM3915constructorimpl2, Integer.valueOf(i27), composerM3915constructorimpl2));
                int i28 = i11;
                i15 = i14;
                Composer composer4 = composerStartRestartGroup;
                i16 = i12;
                TextKt.m2623TextNvy7gAk(title, companion, j5, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, TextStyle.m6753copyp1EtxEg$default(textStyleE, 0L, TextUnitKt.getSp(24), null, null, null, null, null, 0L, null, null, null, 0L, null, null, null, 0, 0, 0L, null, null, null, 0, 0, null, 16777213, null), composer4, ((i12 >> 9) & 14) | 48, 0, 131064);
                long j8 = j5;
                composer3 = composer4;
                if (StringsKt.F(subText)) {
                    textStyle8 = textStyle7;
                    j7 = j6;
                    composer3.startReplaceGroup(-1086809647);
                } else {
                    composer3.startReplaceGroup(-1084575508);
                    SpacerKt.Spacer(SizeKt.m814height3ABfNKs(companion, ChaloTheme.b(composer3, 6).f), composer3, i15);
                    int i29 = i16 >> 18;
                    textStyle8 = textStyle7;
                    long j9 = j6;
                    TextKt.m2623TextNvy7gAk(subText, companion, j9, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, textStyle8, composer3, (i29 & 14) | 48 | (i29 & 896), i16 & 29360128, 131064);
                    j7 = j9;
                    composer3 = composer3;
                }
                composer3.endReplaceGroup();
                composer3.endNode();
                SpacerKt.Spacer(SizeKt.m814height3ABfNKs(companion, ChaloTheme.b(composer3, 6).k), composer3, i15);
                if (str != null || function0 == null) {
                    companion2 = companion;
                    i17 = -839460697;
                    composer3.startReplaceGroup(-839460697);
                } else {
                    composer3.startReplaceGroup(-836776593);
                    i17 = -839460697;
                    companion2 = companion;
                    ChaloFilledButtonKt.g(SizeKt.m814height3ABfNKs(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), ChaloTheme.b(composer3, 6).n), str, null, 0L, null, true, 0.0f, null, 0L, function0, composer3, ((i16 >> 24) & 112) | ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE | ((i28 << 27) & 1879048192), 476);
                }
                composer3.endReplaceGroup();
                if (str4 != null || function3 == null) {
                    str5 = str4;
                    function4 = function3;
                    composer3.startReplaceGroup(i17);
                } else {
                    composer3.startReplaceGroup(-836422759);
                    SpacerKt.Spacer(SizeKt.m814height3ABfNKs(companion2, ChaloTheme.b(composer3, 6).h), composer3, 0);
                    Composer composer5 = composer3;
                    str5 = str4;
                    function4 = function3;
                    ChaloFilledButtonKt.f(str5, false, SizeKt.fillMaxWidth$default(companion2, 0.0f, 1, null), null, null, 0.0f, 0L, function4, composer5, ((i28 >> 3) & 14) | 384 | ((i28 << 15) & 29360128), 122);
                    composer3 = composer5;
                }
                composer3.endReplaceGroup();
                composer3.endNode();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                str3 = str5;
                composer2 = composer3;
                function2 = function4;
                j4 = j7;
                textStyle5 = textStyle8;
                textStyle4 = textStyleE;
                j3 = j8;
                modifier4 = modifier6;
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                j3 = j;
                modifier4 = modifier3;
                textStyle4 = textStyle3;
                textStyle5 = textStyleC;
                composer2 = composerStartRestartGroup;
                j4 = j2;
                str3 = str2;
                function2 = function1;
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: cc
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj2, Object obj3) {
                        ((Integer) obj3).getClass();
                        int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(i | 1);
                        int iUpdateChangedFlags2 = RecomposeScopeImplKt.updateChangedFlags(i2);
                        BottomSheetContentWithIconTitleSubTextKt.a(modifier, iconType, modifier4, title, textStyle4, j3, subText, textStyle5, j4, str, function0, str3, function2, (Composer) obj2, iUpdateChangedFlags, iUpdateChangedFlags2, i3);
                        return Unit.f17538a;
                    }
                });
            }
        }
        i4 |= 384;
        modifier3 = modifier2;
        if ((i & 3072) == 0) {
            if (composerStartRestartGroup.changed(title)) {
                i21 = 2048;
            } else {
                i21 = 1024;
            }
            i4 |= i21;
        }
        if ((i & 24576) == 0) {
            if ((i3 & 16) == 0) {
                textStyle3 = textStyle;
                if (composerStartRestartGroup.changed(textStyle3)) {
                }
                i4 |= i23;
            } else {
                textStyle3 = textStyle;
            }
            i4 |= i23;
        } else {
            textStyle3 = textStyle;
        }
        if ((i & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
            i4 |= 65536;
        }
        if ((i & 1572864) == 0) {
            if (composerStartRestartGroup.changed(subText)) {
                i20 = 1048576;
            } else {
                i20 = 524288;
            }
            i4 |= i20;
        }
        if ((i & 12582912) == 0) {
            if ((i3 & 128) == 0) {
                textStyleC = textStyle2;
                if (composerStartRestartGroup.changed(textStyleC)) {
                }
                i4 |= i24;
            } else {
                textStyleC = textStyle2;
            }
            i4 |= i24;
        } else {
            textStyleC = textStyle2;
        }
        if ((i & 100663296) == 0) {
            i5 = i4 | (((i3 & 256) == 0 || !composerStartRestartGroup.changed(j2)) ? 33554432 : AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL);
        } else {
            i5 = i4;
        }
        if ((i & 805306368) == 0) {
            if (composerStartRestartGroup.changed(str)) {
                i19 = 536870912;
            } else {
                i19 = 268435456;
            }
            i5 |= i19;
        }
        if ((i2 & 6) == 0) {
            if (composerStartRestartGroup.changedInstance(function0)) {
                i18 = 4;
            } else {
                i18 = 2;
            }
            i6 = i2 | i18;
        } else {
            i6 = i2;
        }
        i7 = i3 & 2048;
        if (i7 != 0) {
            i6 |= 48;
        } else if ((i2 & 48) != 0) {
            if (composerStartRestartGroup.changed(str2)) {
                i8 = 32;
            } else {
                i8 = 16;
            }
            i6 |= i8;
        }
        i9 = i6;
        i10 = i3 & 4096;
        if (i10 != 0) {
            i11 = i9 | 384;
        } else if ((i2 & 384) == 0) {
            i11 = i9 | (composerStartRestartGroup.changedInstance(function1) ? 256 : 128);
        } else {
            i11 = i9;
        }
        if ((i5 & 306783379) == 306783378) {
            z = true;
        } else {
            z = true;
        }
        if (composerStartRestartGroup.shouldExecute(z, i5 & 1)) {
            composerStartRestartGroup.startDefaults();
            if ((i & 1) != 0) {
                if (i22 != 0) {
                    modifier5 = Modifier.INSTANCE;
                } else {
                    modifier5 = modifier3;
                }
                if ((i3 & 16) != 0) {
                    textStyleE = ChaloTypographyKt.e(ChaloTheme.e(composerStartRestartGroup, 6));
                    i5 &= -57345;
                } else {
                    textStyleE = textStyle3;
                }
                j5 = ChaloTheme.a(composerStartRestartGroup, 6).e;
                i12 = i5 & (-458753);
                if ((i3 & 128) != 0) {
                    i12 = i5 & (-29818881);
                    textStyleC = ChaloTypographyKt.c(ChaloTheme.e(composerStartRestartGroup, 6));
                }
                if ((i3 & 256) != 0) {
                    j6 = ChaloTheme.a(composerStartRestartGroup, 6).v0;
                    i12 &= -234881025;
                } else {
                    j6 = j2;
                }
                if (i7 != 0) {
                    str4 = null;
                } else {
                    str4 = str2;
                }
                if (i10 != 0) {
                    function3 = null;
                } else {
                    function3 = function1;
                }
                modifier6 = modifier5;
                textStyle6 = textStyleC;
            } else {
                if (i22 != 0) {
                    modifier5 = Modifier.INSTANCE;
                } else {
                    modifier5 = modifier3;
                }
                if ((i3 & 16) != 0) {
                    textStyleE = ChaloTypographyKt.e(ChaloTheme.e(composerStartRestartGroup, 6));
                    i5 &= -57345;
                } else {
                    textStyleE = textStyle3;
                }
                j5 = ChaloTheme.a(composerStartRestartGroup, 6).e;
                i12 = i5 & (-458753);
                if ((i3 & 128) != 0) {
                    i12 = i5 & (-29818881);
                    textStyleC = ChaloTypographyKt.c(ChaloTheme.e(composerStartRestartGroup, 6));
                }
                if ((i3 & 256) != 0) {
                    j6 = ChaloTheme.a(composerStartRestartGroup, 6).v0;
                    i12 &= -234881025;
                } else {
                    j6 = j2;
                }
                if (i7 != 0) {
                    str4 = null;
                } else {
                    str4 = str2;
                }
                if (i10 != 0) {
                    function3 = null;
                } else {
                    function3 = function1;
                }
                modifier6 = modifier5;
                textStyle6 = textStyleC;
            }
            composerStartRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1101492027, i12, i11, "app.chalo.compose.BottomSheetContentWithIconTitleSubText (BottomSheetContentWithIconTitleSubText.kt:38)");
            }
            Alignment.Companion companion5 = Alignment.INSTANCE;
            Alignment.Horizontal centerHorizontally2 = companion5.getCenterHorizontally();
            Arrangement arrangement2 = Arrangement.INSTANCE;
            MeasurePolicy measurePolicyColumnMeasurePolicy3 = ColumnKt.columnMeasurePolicy(arrangement2.getTop(), centerHorizontally2, composerStartRestartGroup, 48);
            long currentCompositeKeyHashCode3 = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
            int i210 = (int) (currentCompositeKeyHashCode3 ^ (currentCompositeKeyHashCode3 >>> 32));
            CompositionLocalMap currentCompositionLocalMap3 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier3 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifier);
            ComposeUiNode.Companion companion6 = ComposeUiNode.INSTANCE;
            textStyle7 = textStyle6;
            constructor = companion6.getConstructor();
            if (composerStartRestartGroup.getApplier() == null) {
                ComposablesKt.invalidApplier();
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.createNode(constructor);
            } else {
                composerStartRestartGroup.useNode();
            }
            Composer composerM3915constructorimpl3 = Updater.m3915constructorimpl(composerStartRestartGroup);
            pk0.v(companion6, composerM3915constructorimpl3, measurePolicyColumnMeasurePolicy3, composerM3915constructorimpl3, currentCompositionLocalMap3);
            Updater.m3923setimpl(composerM3915constructorimpl3, modifierMaterializeModifier3, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion6, composerM3915constructorimpl3, Integer.valueOf(i210), composerM3915constructorimpl3));
            ColumnScopeInstance columnScopeInstance2 = ColumnScopeInstance.INSTANCE;
            if (iconType == null) {
                composerStartRestartGroup.startReplaceGroup(-837845846);
                composerStartRestartGroup.endReplaceGroup();
                obj = null;
                i13 = 1;
                i14 = 0;
            } else {
                composerStartRestartGroup.startReplaceGroup(-837845845);
                obj = null;
                i13 = 1;
                ImageKt.Image(PainterResourceHelperKt.a(iconType, composerStartRestartGroup, 0), "", modifier6, (Alignment) null, ContentScale.INSTANCE.getFit(), 0.0f, (ColorFilter) null, composerStartRestartGroup, Painter.$stable | 24624 | (i12 & 896), 104);
                composerStartRestartGroup = composerStartRestartGroup;
                i14 = 0;
                gf.r(Modifier.INSTANCE, ChaloTheme.b(composerStartRestartGroup, 6).k, composerStartRestartGroup, 0);
            }
            companion = Modifier.INSTANCE;
            Modifier modifierFillMaxWidth$default2 = SizeKt.fillMaxWidth$default(companion, 0.0f, i13, obj);
            MeasurePolicy measurePolicyColumnMeasurePolicy4 = ColumnKt.columnMeasurePolicy(arrangement2.getTop(), companion5.getStart(), composerStartRestartGroup, i14);
            long currentCompositeKeyHashCode4 = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, i14);
            int i211 = (int) (currentCompositeKeyHashCode4 ^ (currentCompositeKeyHashCode4 >>> 32));
            CompositionLocalMap currentCompositionLocalMap4 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier4 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierFillMaxWidth$default2);
            constructor2 = companion6.getConstructor();
            if (composerStartRestartGroup.getApplier() == null) {
                ComposablesKt.invalidApplier();
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.createNode(constructor2);
            } else {
                composerStartRestartGroup.useNode();
            }
            Composer composerM3915constructorimpl4 = Updater.m3915constructorimpl(composerStartRestartGroup);
            pk0.v(companion6, composerM3915constructorimpl4, measurePolicyColumnMeasurePolicy4, composerM3915constructorimpl4, currentCompositionLocalMap4);
            Updater.m3923setimpl(composerM3915constructorimpl4, modifierMaterializeModifier4, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion6, composerM3915constructorimpl4, Integer.valueOf(i211), composerM3915constructorimpl4));
            int i212 = i11;
            i15 = i14;
            Composer composer6 = composerStartRestartGroup;
            i16 = i12;
            TextKt.m2623TextNvy7gAk(title, companion, j5, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, TextStyle.m6753copyp1EtxEg$default(textStyleE, 0L, TextUnitKt.getSp(24), null, null, null, null, null, 0L, null, null, null, 0L, null, null, null, 0, 0, 0L, null, null, null, 0, 0, null, 16777213, null), composer6, ((i12 >> 9) & 14) | 48, 0, 131064);
            long j10 = j5;
            composer3 = composer6;
            if (StringsKt.F(subText)) {
                composer3.startReplaceGroup(-1084575508);
                SpacerKt.Spacer(SizeKt.m814height3ABfNKs(companion, ChaloTheme.b(composer3, 6).f), composer3, i15);
                int i213 = i16 >> 18;
                textStyle8 = textStyle7;
                long j11 = j6;
                TextKt.m2623TextNvy7gAk(subText, companion, j11, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, textStyle8, composer3, (i213 & 14) | 48 | (i213 & 896), i16 & 29360128, 131064);
                j7 = j11;
                composer3 = composer3;
            } else {
                textStyle8 = textStyle7;
                j7 = j6;
                composer3.startReplaceGroup(-1086809647);
            }
            composer3.endReplaceGroup();
            composer3.endNode();
            SpacerKt.Spacer(SizeKt.m814height3ABfNKs(companion, ChaloTheme.b(composer3, 6).k), composer3, i15);
            if (str != null) {
                companion2 = companion;
                i17 = -839460697;
                composer3.startReplaceGroup(-839460697);
            } else {
                companion2 = companion;
                i17 = -839460697;
                composer3.startReplaceGroup(-839460697);
            }
            composer3.endReplaceGroup();
            if (str4 != null) {
                str5 = str4;
                function4 = function3;
                composer3.startReplaceGroup(i17);
            } else {
                str5 = str4;
                function4 = function3;
                composer3.startReplaceGroup(i17);
            }
            composer3.endReplaceGroup();
            composer3.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            str3 = str5;
            composer2 = composer3;
            function2 = function4;
            j4 = j7;
            textStyle5 = textStyle8;
            textStyle4 = textStyleE;
            j3 = j10;
            modifier4 = modifier6;
        } else {
            composerStartRestartGroup.skipToGroupEnd();
            j3 = j;
            modifier4 = modifier3;
            textStyle4 = textStyle3;
            textStyle5 = textStyleC;
            composer2 = composerStartRestartGroup;
            j4 = j2;
            str3 = str2;
            function2 = function1;
        }
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: cc
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj2, Object obj3) {
                    ((Integer) obj3).getClass();
                    int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(i | 1);
                    int iUpdateChangedFlags2 = RecomposeScopeImplKt.updateChangedFlags(i2);
                    BottomSheetContentWithIconTitleSubTextKt.a(modifier, iconType, modifier4, title, textStyle4, j3, subText, textStyle5, j4, str, function0, str3, function2, (Composer) obj2, iUpdateChangedFlags, iUpdateChangedFlags2, i3);
                    return Unit.f17538a;
                }
            });
        }
    }
}
