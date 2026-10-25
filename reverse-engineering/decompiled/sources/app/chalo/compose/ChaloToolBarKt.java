package app.chalo.compose;

import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.BorderKt;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.material3.AndroidMenu_androidKt;
import androidx.compose.material3.AppBarKt;
import androidx.compose.material3.IconButtonKt;
import androidx.compose.material3.IconKt;
import androidx.compose.material3.SurfaceKt;
import androidx.compose.material3.TextKt;
import androidx.compose.material3.TopAppBarDefaults;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.style.TextOverflow;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.TextUnitKt;
import androidx.core.view.accessibility.AccessibilityEventCompat;
import app.chalo.compose.ChaloToolBarKt;
import app.chalo.compose.components.ChaloSpacersKt;
import app.chalo.compose.components.image.CommonImageKt;
import app.chalo.compose.resources.PainterResourceHelperKt;
import app.chalo.compose.resources.StringResourcesHelperKt;
import app.chalo.compose.theme.ChaloTheme;
import app.chalo.compose.theme.ChaloThemeKt;
import app.chalo.compose.theme.ChaloTypographyKt;
import app.chalo.providers.iconassetprovider.IconType;
import app.chalo.providers.stringprovider.StringEnum;
import app.chalo.uistate.base.BorderUISpec;
import app.chalo.uistate.base.BorderUISpecKt;
import app.chalo.uistate.base.ChaloColorToken;
import app.chalo.uistate.base.ChaloColorTokenKt;
import app.chalo.uistate.base.UiAlignmentKt;
import app.chalo.uistate.base.UiEventHandler;
import app.chalo.uistate.divider.DividerUIState;
import app.chalo.uistate.image.ImageUISize;
import app.chalo.uistate.image.ImageUIState;
import app.chalo.uistate.text.TextUIState;
import app.chalo.uistate.toolbar.ToolbarActionSpec;
import app.chalo.uistate.toolbar.ToolbarActionsUIState;
import app.chalo.uistate.toolbar.ToolbarBaseActionUIState;
import app.chalo.uistate.toolbar.ToolbarUIState;
import app.chalo.uistate.toolbar.ToolbarUiSpecs;
import defpackage.d0;
import defpackage.fj;
import defpackage.fk;
import defpackage.gf;
import defpackage.i41;
import defpackage.mk;
import defpackage.nm;
import defpackage.pk0;
import defpackage.pm;
import defpackage.qm;
import defpackage.sm;
import defpackage.t1;
import defpackage.ti;
import defpackage.um;
import defpackage.v;
import defpackage.vm;
import defpackage.z;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KFunction;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\b\n\u0002\u0010\u000b\n\u0002\b\u0002¨\u0006\u0002²\u0006\u000e\u0010\u0001\u001a\u00020\u00008\n@\nX\u008a\u008e\u0002"}, d2 = {"", "expanded", "chalo-base_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class ChaloToolBarKt {
    /* JADX WARN: Code duplicated, block: B:101:0x011a  */
    /* JADX WARN: Code duplicated, block: B:103:0x0121  */
    /* JADX WARN: Code duplicated, block: B:105:0x0125  */
    /* JADX WARN: Code duplicated, block: B:107:0x012f  */
    /* JADX WARN: Code duplicated, block: B:108:0x0132  */
    /* JADX WARN: Code duplicated, block: B:112:0x013a  */
    /* JADX WARN: Code duplicated, block: B:114:0x0141  */
    /* JADX WARN: Code duplicated, block: B:116:0x0145  */
    /* JADX WARN: Code duplicated, block: B:118:0x014f  */
    /* JADX WARN: Code duplicated, block: B:119:0x0152  */
    /* JADX WARN: Code duplicated, block: B:121:0x0157  */
    /* JADX WARN: Code duplicated, block: B:124:0x016b  */
    /* JADX WARN: Code duplicated, block: B:128:0x0173  */
    /* JADX WARN: Code duplicated, block: B:131:0x017c  */
    /* JADX WARN: Code duplicated, block: B:133:0x018a  */
    /* JADX WARN: Code duplicated, block: B:146:0x01b6 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:147:0x01b8  */
    /* JADX WARN: Code duplicated, block: B:148:0x01bb  */
    /* JADX WARN: Code duplicated, block: B:150:0x01be  */
    /* JADX WARN: Code duplicated, block: B:151:0x01c1  */
    /* JADX WARN: Code duplicated, block: B:153:0x01c5  */
    /* JADX WARN: Code duplicated, block: B:154:0x01c8  */
    /* JADX WARN: Code duplicated, block: B:157:0x01ce  */
    /* JADX WARN: Code duplicated, block: B:158:0x01da  */
    /* JADX WARN: Code duplicated, block: B:161:0x01df  */
    /* JADX WARN: Code duplicated, block: B:162:0x01e8  */
    /* JADX WARN: Code duplicated, block: B:165:0x01ed  */
    /* JADX WARN: Code duplicated, block: B:167:0x01f7  */
    /* JADX WARN: Code duplicated, block: B:168:0x01fa  */
    /* JADX WARN: Code duplicated, block: B:170:0x01fe  */
    /* JADX WARN: Code duplicated, block: B:172:0x0201  */
    /* JADX WARN: Code duplicated, block: B:173:0x0203  */
    /* JADX WARN: Code duplicated, block: B:175:0x0207  */
    /* JADX WARN: Code duplicated, block: B:176:0x020c  */
    /* JADX WARN: Code duplicated, block: B:179:0x0219  */
    /* JADX WARN: Code duplicated, block: B:183:0x0254  */
    /* JADX WARN: Code duplicated, block: B:186:0x0260  */
    /* JADX WARN: Code duplicated, block: B:187:0x0264  */
    /* JADX WARN: Code duplicated, block: B:190:0x02d4  */
    /* JADX WARN: Code duplicated, block: B:191:0x02e6  */
    /* JADX WARN: Code duplicated, block: B:194:0x02f8  */
    /* JADX WARN: Code duplicated, block: B:196:0x0308  */
    /* JADX WARN: Code duplicated, block: B:199:0x031e  */
    /* JADX WARN: Code duplicated, block: B:201:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:26:0x004a  */
    /* JADX WARN: Code duplicated, block: B:27:0x004d  */
    /* JADX WARN: Code duplicated, block: B:29:0x0051 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:30:0x0053  */
    /* JADX WARN: Code duplicated, block: B:31:0x0055  */
    /* JADX WARN: Code duplicated, block: B:34:0x005f  */
    /* JADX WARN: Code duplicated, block: B:35:0x0062  */
    /* JADX WARN: Code duplicated, block: B:39:0x0069  */
    /* JADX WARN: Code duplicated, block: B:41:0x006d  */
    /* JADX WARN: Code duplicated, block: B:43:0x0075  */
    /* JADX WARN: Code duplicated, block: B:44:0x0078  */
    /* JADX WARN: Code duplicated, block: B:47:0x007e  */
    /* JADX WARN: Code duplicated, block: B:50:0x0084  */
    /* JADX WARN: Code duplicated, block: B:52:0x0088  */
    /* JADX WARN: Code duplicated, block: B:54:0x0090  */
    /* JADX WARN: Code duplicated, block: B:55:0x0093  */
    /* JADX WARN: Code duplicated, block: B:58:0x0099  */
    /* JADX WARN: Code duplicated, block: B:61:0x00a0  */
    /* JADX WARN: Code duplicated, block: B:66:0x00b1  */
    /* JADX WARN: Code duplicated, block: B:68:0x00b5  */
    /* JADX WARN: Code duplicated, block: B:71:0x00bf  */
    /* JADX WARN: Code duplicated, block: B:72:0x00c4  */
    /* JADX WARN: Code duplicated, block: B:74:0x00ca  */
    /* JADX WARN: Code duplicated, block: B:76:0x00d0  */
    /* JADX WARN: Code duplicated, block: B:77:0x00d3  */
    /* JADX WARN: Code duplicated, block: B:81:0x00dd  */
    /* JADX WARN: Code duplicated, block: B:82:0x00e2  */
    /* JADX WARN: Code duplicated, block: B:84:0x00e8  */
    /* JADX WARN: Code duplicated, block: B:86:0x00ee  */
    /* JADX WARN: Code duplicated, block: B:87:0x00f1  */
    /* JADX WARN: Code duplicated, block: B:91:0x0100  */
    /* JADX WARN: Code duplicated, block: B:92:0x0103  */
    /* JADX WARN: Code duplicated, block: B:94:0x0107  */
    /* JADX WARN: Code duplicated, block: B:96:0x010d  */
    /* JADX WARN: Code duplicated, block: B:97:0x0110  */
    public static final void a(Modifier modifier, Function2 function2, IconType iconType, String str, float f, long j, Function3 function3, Function0 function0, boolean z, ImageUISize imageUISize, Composer composer, final int i, final int i2, final int i3) {
        Modifier modifier2;
        int i4;
        int i5;
        int iOrdinal;
        int i6;
        String str2;
        float f2;
        long j2;
        char c;
        int i7;
        int i8;
        int i9;
        Function0 function1;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        boolean z2;
        final Function2 function4;
        final IconType iconType2;
        final boolean z3;
        final long j3;
        final Function3 function5;
        final Function0 function6;
        final String str3;
        final ImageUISize imageUISize2;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Modifier modifier3;
        Function2 function7;
        IconType iconType3;
        String strC;
        float f3;
        Function3 function8;
        boolean z4;
        ImageUISize imageUISize3;
        float f4;
        Function0<ComposeUiNode> constructor;
        float f5;
        int i18;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1551130458);
        int i19 = i3 & 1;
        if (i19 != 0) {
            i4 = i | 6;
            modifier2 = modifier;
        } else if ((i & 6) == 0) {
            modifier2 = modifier;
            i4 = (composerStartRestartGroup.changed(modifier2) ? 4 : 2) | i;
        } else {
            modifier2 = modifier;
            i4 = i;
        }
        int i20 = i3 & 2;
        if (i20 == 0) {
            if ((i & 48) == 0) {
                i4 |= composerStartRestartGroup.changedInstance(function2) ? 32 : 16;
            }
            i5 = i3 & 4;
            if (i5 != 0) {
                i4 |= 384;
            } else if ((i & 384) == 0) {
                if (iconType == null) {
                    iOrdinal = -1;
                } else {
                    iOrdinal = iconType.ordinal();
                }
                if (composerStartRestartGroup.changed(iOrdinal)) {
                    i6 = 256;
                } else {
                    i6 = 128;
                }
                i4 |= i6;
            }
            if ((i & 3072) == 0) {
                if ((i3 & 8) == 0) {
                    str2 = str;
                    int i21 = composerStartRestartGroup.changed(str2) ? 2048 : 1024;
                    i4 |= i21;
                } else {
                    str2 = str;
                }
                i4 |= i21;
            } else {
                str2 = str;
            }
            if ((i & 24576) == 0) {
                if ((i3 & 16) == 0) {
                    f2 = f;
                    int i22 = composerStartRestartGroup.changed(f2) ? 16384 : 8192;
                    i4 |= i22;
                } else {
                    f2 = f;
                }
                i4 |= i22;
            } else {
                f2 = f;
            }
            if ((196608 & i) == 0) {
                j2 = j;
                c = ' ';
                if ((i3 & 32) == 0 || !composerStartRestartGroup.changed(j2)) {
                    i18 = 65536;
                } else {
                    i18 = 131072;
                }
                i4 |= i18;
            } else {
                j2 = j;
                c = ' ';
            }
            i7 = i3 & 64;
            if (i7 != 0) {
                i4 |= 1572864;
            } else if ((i & 1572864) == 0) {
                if (composerStartRestartGroup.changedInstance(function3)) {
                    i8 = 1048576;
                } else {
                    i8 = 524288;
                }
                i4 |= i8;
            }
            i9 = i3 & 128;
            if (i9 != 0) {
                i4 |= 12582912;
                function1 = function0;
            } else {
                function1 = function0;
                if ((i & 12582912) == 0) {
                    if (composerStartRestartGroup.changedInstance(function1)) {
                        i10 = 8388608;
                    } else {
                        i10 = 4194304;
                    }
                    i4 |= i10;
                }
            }
            if ((i3 & 256) != 0) {
                i4 |= 100663296;
            } else if ((i & 100663296) == 0) {
                if (composerStartRestartGroup.changed((Object) null)) {
                    i11 = AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL;
                } else {
                    i11 = 33554432;
                }
                i4 |= i11;
            }
            i12 = i3 & 512;
            if (i12 != 0) {
                if ((i & 805306368) == 0) {
                    if (composerStartRestartGroup.changed(z)) {
                        i13 = 536870912;
                    } else {
                        i13 = 268435456;
                    }
                    i4 |= i13;
                }
                i14 = i3 & 1024;
                if (i14 != 0) {
                    if ((i2 & 6) == 0) {
                        if (composerStartRestartGroup.changed(imageUISize)) {
                            i16 = 4;
                        } else {
                            i16 = 2;
                        }
                        i17 = i2 | i16;
                    } else {
                        i14 = i14;
                        i15 = i2;
                    }
                    if ((i4 & 306783379) == 306783378 || (i15 & 3) != 2) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    if (composerStartRestartGroup.shouldExecute(z2, i4 & 1)) {
                        composerStartRestartGroup.startDefaults();
                        if ((i & 1) != 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                            if (i19 != 0) {
                                modifier3 = Modifier.INSTANCE;
                            } else {
                                modifier3 = modifier2;
                            }
                            if (i20 != 0) {
                                function7 = ComposableSingletons$ChaloToolBarKt.c;
                            } else {
                                function7 = function2;
                            }
                            if (i5 != 0) {
                                iconType3 = IconType.IC_ARROW_BACK;
                            } else {
                                iconType3 = iconType;
                            }
                            if ((i3 & 8) != 0) {
                                strC = StringResourcesHelperKt.c(StringEnum.BACK_BUTTON, new Object[0], composerStartRestartGroup, 6);
                                i4 &= -7169;
                            } else {
                                strC = str2;
                            }
                            if ((i3 & 16) != 0) {
                                f3 = ChaloTheme.c(composerStartRestartGroup, 6).c;
                                i4 &= -57345;
                            } else {
                                f3 = f2;
                            }
                            if ((i3 & 32) != 0) {
                                j2 = ChaloTheme.a(composerStartRestartGroup, 6).u;
                                i4 &= -458753;
                            }
                            if (i7 != 0) {
                                function8 = ComposableSingletons$ChaloToolBarKt.d;
                            } else {
                                function8 = function3;
                            }
                            if (i9 != 0) {
                                function1 = null;
                            }
                            if (i12 != 0) {
                                z4 = true;
                            } else {
                                z4 = z;
                            }
                            if (i14 != 0) {
                                f4 = f3;
                                imageUISize3 = null;
                            } else {
                                imageUISize3 = imageUISize;
                                f4 = f3;
                            }
                        } else {
                            composerStartRestartGroup.skipToGroupEnd();
                            if ((i3 & 8) != 0) {
                                i4 &= -7169;
                            }
                            if ((i3 & 16) != 0) {
                                i4 &= -57345;
                            }
                            if ((i3 & 32) != 0) {
                                i4 &= -458753;
                            }
                            iconType3 = iconType;
                            z4 = z;
                            imageUISize3 = imageUISize;
                            modifier3 = modifier2;
                            strC = str2;
                            f4 = f2;
                            function7 = function2;
                            function8 = function3;
                        }
                        composerStartRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-1551130458, i4, i15, "app.chalo.compose.ChaloToolBar (ChaloToolBar.kt:172)");
                        }
                        MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composerStartRestartGroup, 0);
                        long currentCompositeKeyHashCode = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
                        int i23 = (int) (currentCompositeKeyHashCode ^ (currentCompositeKeyHashCode >>> c));
                        CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
                        Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifier3);
                        Modifier modifier4 = modifier3;
                        ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
                        constructor = companion.getConstructor();
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
                        Updater.m3923setimpl(composerM3915constructorimpl, modifierMaterializeModifier, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion, composerM3915constructorimpl, Integer.valueOf(i23), composerM3915constructorimpl));
                        ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
                        final Function0 function9 = function1;
                        final Function2 function10 = function7;
                        final IconType iconType4 = iconType3;
                        final long j4 = j2;
                        final String str4 = strC;
                        final Function3 function11 = function8;
                        final boolean z5 = z4;
                        final ImageUISize imageUISize4 = imageUISize3;
                        SurfaceKt.m2480SurfaceT9BRK9s(null, null, Color.INSTANCE.m4640getTransparent0d7_KjU(), 0L, 0.0f, f4, null, ComposableLambdaKt.rememberComposableLambda(-1254464971, true, new Function2() { // from class: wm
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                Composer composer2 = (Composer) obj;
                                int iIntValue = ((Integer) obj2).intValue();
                                if (composer2.shouldExecute((iIntValue & 3) != 2, iIntValue & 1)) {
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(-1254464971, iIntValue, -1, "app.chalo.compose.ChaloToolBar.<anonymous>.<anonymous> (ChaloToolBar.kt:178)");
                                    }
                                    AppBarKt.m1640TopAppBarGHTll3U(function10, null, ComposableLambdaKt.rememberComposableLambda(1682214575, true, new zm(z5, function9, imageUISize4, iconType4, str4), composer2, 54), function11, 0.0f, null, TopAppBarDefaults.INSTANCE.m2838topAppBarColors5tl4gsc(j4, 0L, 0L, 0L, 0L, 0L, composer2, TopAppBarDefaults.$stable << 18, 62), null, composer2, 384, 178);
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                    }
                                } else {
                                    composer2.skipToGroupEnd();
                                }
                                return Unit.f17538a;
                            }
                        }, composerStartRestartGroup, 54), composerStartRestartGroup, ((i4 << 3) & 458752) | 12583296, 91);
                        f5 = f4;
                        if (Dp.m7283equalsimpl0(f5, ChaloTheme.b(composerStartRestartGroup, 6).f1916a)) {
                            composerStartRestartGroup.startReplaceGroup(791292466);
                            composerStartRestartGroup.endReplaceGroup();
                        } else {
                            composerStartRestartGroup.startReplaceGroup(800239996);
                            gf.r(Modifier.INSTANCE, ChaloTheme.c(composerStartRestartGroup, 6).b, composerStartRestartGroup, 0);
                        }
                        composerStartRestartGroup.endNode();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        Function3 function12 = function8;
                        f2 = f5;
                        iconType2 = iconType3;
                        j3 = j2;
                        function5 = function12;
                        imageUISize2 = imageUISize4;
                        function6 = function1;
                        function4 = function7;
                        str3 = strC;
                        modifier2 = modifier4;
                        z3 = z5;
                    } else {
                        composerStartRestartGroup.skipToGroupEnd();
                        function4 = function2;
                        iconType2 = iconType;
                        z3 = z;
                        j3 = j2;
                        function5 = function3;
                        function6 = function1;
                        str3 = str2;
                        imageUISize2 = imageUISize;
                    }
                    scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup != null) {
                        final Modifier modifier5 = modifier2;
                        final float f6 = f2;
                        scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: xm
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                ((Integer) obj2).getClass();
                                int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(i | 1);
                                int iUpdateChangedFlags2 = RecomposeScopeImplKt.updateChangedFlags(i2);
                                ChaloToolBarKt.a(modifier5, function4, iconType2, str3, f6, j3, function5, function6, z3, imageUISize2, (Composer) obj, iUpdateChangedFlags, iUpdateChangedFlags2, i3);
                                return Unit.f17538a;
                            }
                        });
                    }
                }
                i17 = i2 | 6;
                i15 = i17;
                if ((i4 & 306783379) == 306783378) {
                    z2 = true;
                } else {
                    z2 = true;
                }
                if (composerStartRestartGroup.shouldExecute(z2, i4 & 1)) {
                    composerStartRestartGroup.startDefaults();
                    if ((i & 1) != 0) {
                        if (i19 != 0) {
                            modifier3 = Modifier.INSTANCE;
                        } else {
                            modifier3 = modifier2;
                        }
                        if (i20 != 0) {
                            function7 = ComposableSingletons$ChaloToolBarKt.c;
                        } else {
                            function7 = function2;
                        }
                        if (i5 != 0) {
                            iconType3 = IconType.IC_ARROW_BACK;
                        } else {
                            iconType3 = iconType;
                        }
                        if ((i3 & 8) != 0) {
                            strC = StringResourcesHelperKt.c(StringEnum.BACK_BUTTON, new Object[0], composerStartRestartGroup, 6);
                            i4 &= -7169;
                        } else {
                            strC = str2;
                        }
                        if ((i3 & 16) != 0) {
                            f3 = ChaloTheme.c(composerStartRestartGroup, 6).c;
                            i4 &= -57345;
                        } else {
                            f3 = f2;
                        }
                        if ((i3 & 32) != 0) {
                            j2 = ChaloTheme.a(composerStartRestartGroup, 6).u;
                            i4 &= -458753;
                        }
                        if (i7 != 0) {
                            function8 = ComposableSingletons$ChaloToolBarKt.d;
                        } else {
                            function8 = function3;
                        }
                        if (i9 != 0) {
                            function1 = null;
                        }
                        if (i12 != 0) {
                            z4 = true;
                        } else {
                            z4 = z;
                        }
                        if (i14 != 0) {
                            f4 = f3;
                            imageUISize3 = null;
                        } else {
                            imageUISize3 = imageUISize;
                            f4 = f3;
                        }
                    } else {
                        if (i19 != 0) {
                            modifier3 = Modifier.INSTANCE;
                        } else {
                            modifier3 = modifier2;
                        }
                        if (i20 != 0) {
                            function7 = ComposableSingletons$ChaloToolBarKt.c;
                        } else {
                            function7 = function2;
                        }
                        if (i5 != 0) {
                            iconType3 = IconType.IC_ARROW_BACK;
                        } else {
                            iconType3 = iconType;
                        }
                        if ((i3 & 8) != 0) {
                            strC = StringResourcesHelperKt.c(StringEnum.BACK_BUTTON, new Object[0], composerStartRestartGroup, 6);
                            i4 &= -7169;
                        } else {
                            strC = str2;
                        }
                        if ((i3 & 16) != 0) {
                            f3 = ChaloTheme.c(composerStartRestartGroup, 6).c;
                            i4 &= -57345;
                        } else {
                            f3 = f2;
                        }
                        if ((i3 & 32) != 0) {
                            j2 = ChaloTheme.a(composerStartRestartGroup, 6).u;
                            i4 &= -458753;
                        }
                        if (i7 != 0) {
                            function8 = ComposableSingletons$ChaloToolBarKt.d;
                        } else {
                            function8 = function3;
                        }
                        if (i9 != 0) {
                            function1 = null;
                        }
                        if (i12 != 0) {
                            z4 = true;
                        } else {
                            z4 = z;
                        }
                        if (i14 != 0) {
                            f4 = f3;
                            imageUISize3 = null;
                        } else {
                            imageUISize3 = imageUISize;
                            f4 = f3;
                        }
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1551130458, i4, i15, "app.chalo.compose.ChaloToolBar (ChaloToolBar.kt:172)");
                    }
                    MeasurePolicy measurePolicyColumnMeasurePolicy2 = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composerStartRestartGroup, 0);
                    long currentCompositeKeyHashCode2 = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
                    int i24 = (int) (currentCompositeKeyHashCode2 ^ (currentCompositeKeyHashCode2 >>> c));
                    CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifier3);
                    Modifier modifier6 = modifier3;
                    ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
                    constructor = companion2.getConstructor();
                    if (composerStartRestartGroup.getApplier() == null) {
                        ComposablesKt.invalidApplier();
                    }
                    composerStartRestartGroup.startReusableNode();
                    if (composerStartRestartGroup.getInserting()) {
                        composerStartRestartGroup.createNode(constructor);
                    } else {
                        composerStartRestartGroup.useNode();
                    }
                    Composer composerM3915constructorimpl2 = Updater.m3915constructorimpl(composerStartRestartGroup);
                    pk0.v(companion2, composerM3915constructorimpl2, measurePolicyColumnMeasurePolicy2, composerM3915constructorimpl2, currentCompositionLocalMap2);
                    Updater.m3923setimpl(composerM3915constructorimpl2, modifierMaterializeModifier2, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion2, composerM3915constructorimpl2, Integer.valueOf(i24), composerM3915constructorimpl2));
                    ColumnScopeInstance columnScopeInstance2 = ColumnScopeInstance.INSTANCE;
                    final Function0 function13 = function1;
                    final Function2 function14 = function7;
                    final IconType iconType5 = iconType3;
                    final long j5 = j2;
                    final String str5 = strC;
                    final Function3 function15 = function8;
                    final boolean z6 = z4;
                    final ImageUISize imageUISize5 = imageUISize3;
                    SurfaceKt.m2480SurfaceT9BRK9s(null, null, Color.INSTANCE.m4640getTransparent0d7_KjU(), 0L, 0.0f, f4, null, ComposableLambdaKt.rememberComposableLambda(-1254464971, true, new Function2() { // from class: wm
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            Composer composer2 = (Composer) obj;
                            int iIntValue = ((Integer) obj2).intValue();
                            if (composer2.shouldExecute((iIntValue & 3) != 2, iIntValue & 1)) {
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(-1254464971, iIntValue, -1, "app.chalo.compose.ChaloToolBar.<anonymous>.<anonymous> (ChaloToolBar.kt:178)");
                                }
                                AppBarKt.m1640TopAppBarGHTll3U(function14, null, ComposableLambdaKt.rememberComposableLambda(1682214575, true, new zm(z6, function13, imageUISize5, iconType5, str5), composer2, 54), function15, 0.0f, null, TopAppBarDefaults.INSTANCE.m2838topAppBarColors5tl4gsc(j5, 0L, 0L, 0L, 0L, 0L, composer2, TopAppBarDefaults.$stable << 18, 62), null, composer2, 384, 178);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            } else {
                                composer2.skipToGroupEnd();
                            }
                            return Unit.f17538a;
                        }
                    }, composerStartRestartGroup, 54), composerStartRestartGroup, ((i4 << 3) & 458752) | 12583296, 91);
                    f5 = f4;
                    if (Dp.m7283equalsimpl0(f5, ChaloTheme.b(composerStartRestartGroup, 6).f1916a)) {
                        composerStartRestartGroup.startReplaceGroup(800239996);
                        gf.r(Modifier.INSTANCE, ChaloTheme.c(composerStartRestartGroup, 6).b, composerStartRestartGroup, 0);
                    } else {
                        composerStartRestartGroup.startReplaceGroup(791292466);
                        composerStartRestartGroup.endReplaceGroup();
                    }
                    composerStartRestartGroup.endNode();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    Function3 function16 = function8;
                    f2 = f5;
                    iconType2 = iconType3;
                    j3 = j2;
                    function5 = function16;
                    imageUISize2 = imageUISize5;
                    function6 = function1;
                    function4 = function7;
                    str3 = strC;
                    modifier2 = modifier6;
                    z3 = z6;
                } else {
                    composerStartRestartGroup.skipToGroupEnd();
                    function4 = function2;
                    iconType2 = iconType;
                    z3 = z;
                    j3 = j2;
                    function5 = function3;
                    function6 = function1;
                    str3 = str2;
                    imageUISize2 = imageUISize;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                    final Modifier modifier7 = modifier2;
                    final float f7 = f2;
                    scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: xm
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            ((Integer) obj2).getClass();
                            int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(i | 1);
                            int iUpdateChangedFlags2 = RecomposeScopeImplKt.updateChangedFlags(i2);
                            ChaloToolBarKt.a(modifier7, function4, iconType2, str3, f7, j3, function5, function6, z3, imageUISize2, (Composer) obj, iUpdateChangedFlags, iUpdateChangedFlags2, i3);
                            return Unit.f17538a;
                        }
                    });
                }
            }
            i4 |= 805306368;
            i14 = i3 & 1024;
            if (i14 != 0) {
                if ((i2 & 6) == 0) {
                    if (composerStartRestartGroup.changed(imageUISize)) {
                        i16 = 4;
                    } else {
                        i16 = 2;
                    }
                    i17 = i2 | i16;
                } else {
                    i14 = i14;
                    i15 = i2;
                }
                if ((i4 & 306783379) == 306783378) {
                    z2 = true;
                } else {
                    z2 = true;
                }
                if (composerStartRestartGroup.shouldExecute(z2, i4 & 1)) {
                    composerStartRestartGroup.startDefaults();
                    if ((i & 1) != 0) {
                        if (i19 != 0) {
                            modifier3 = Modifier.INSTANCE;
                        } else {
                            modifier3 = modifier2;
                        }
                        if (i20 != 0) {
                            function7 = ComposableSingletons$ChaloToolBarKt.c;
                        } else {
                            function7 = function2;
                        }
                        if (i5 != 0) {
                            iconType3 = IconType.IC_ARROW_BACK;
                        } else {
                            iconType3 = iconType;
                        }
                        if ((i3 & 8) != 0) {
                            strC = StringResourcesHelperKt.c(StringEnum.BACK_BUTTON, new Object[0], composerStartRestartGroup, 6);
                            i4 &= -7169;
                        } else {
                            strC = str2;
                        }
                        if ((i3 & 16) != 0) {
                            f3 = ChaloTheme.c(composerStartRestartGroup, 6).c;
                            i4 &= -57345;
                        } else {
                            f3 = f2;
                        }
                        if ((i3 & 32) != 0) {
                            j2 = ChaloTheme.a(composerStartRestartGroup, 6).u;
                            i4 &= -458753;
                        }
                        if (i7 != 0) {
                            function8 = ComposableSingletons$ChaloToolBarKt.d;
                        } else {
                            function8 = function3;
                        }
                        if (i9 != 0) {
                            function1 = null;
                        }
                        if (i12 != 0) {
                            z4 = true;
                        } else {
                            z4 = z;
                        }
                        if (i14 != 0) {
                            f4 = f3;
                            imageUISize3 = null;
                        } else {
                            imageUISize3 = imageUISize;
                            f4 = f3;
                        }
                    } else {
                        if (i19 != 0) {
                            modifier3 = Modifier.INSTANCE;
                        } else {
                            modifier3 = modifier2;
                        }
                        if (i20 != 0) {
                            function7 = ComposableSingletons$ChaloToolBarKt.c;
                        } else {
                            function7 = function2;
                        }
                        if (i5 != 0) {
                            iconType3 = IconType.IC_ARROW_BACK;
                        } else {
                            iconType3 = iconType;
                        }
                        if ((i3 & 8) != 0) {
                            strC = StringResourcesHelperKt.c(StringEnum.BACK_BUTTON, new Object[0], composerStartRestartGroup, 6);
                            i4 &= -7169;
                        } else {
                            strC = str2;
                        }
                        if ((i3 & 16) != 0) {
                            f3 = ChaloTheme.c(composerStartRestartGroup, 6).c;
                            i4 &= -57345;
                        } else {
                            f3 = f2;
                        }
                        if ((i3 & 32) != 0) {
                            j2 = ChaloTheme.a(composerStartRestartGroup, 6).u;
                            i4 &= -458753;
                        }
                        if (i7 != 0) {
                            function8 = ComposableSingletons$ChaloToolBarKt.d;
                        } else {
                            function8 = function3;
                        }
                        if (i9 != 0) {
                            function1 = null;
                        }
                        if (i12 != 0) {
                            z4 = true;
                        } else {
                            z4 = z;
                        }
                        if (i14 != 0) {
                            f4 = f3;
                            imageUISize3 = null;
                        } else {
                            imageUISize3 = imageUISize;
                            f4 = f3;
                        }
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1551130458, i4, i15, "app.chalo.compose.ChaloToolBar (ChaloToolBar.kt:172)");
                    }
                    MeasurePolicy measurePolicyColumnMeasurePolicy3 = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composerStartRestartGroup, 0);
                    long currentCompositeKeyHashCode3 = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
                    int i25 = (int) (currentCompositeKeyHashCode3 ^ (currentCompositeKeyHashCode3 >>> c));
                    CompositionLocalMap currentCompositionLocalMap3 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier3 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifier3);
                    Modifier modifier8 = modifier3;
                    ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
                    constructor = companion3.getConstructor();
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
                    pk0.v(companion3, composerM3915constructorimpl3, measurePolicyColumnMeasurePolicy3, composerM3915constructorimpl3, currentCompositionLocalMap3);
                    Updater.m3923setimpl(composerM3915constructorimpl3, modifierMaterializeModifier3, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion3, composerM3915constructorimpl3, Integer.valueOf(i25), composerM3915constructorimpl3));
                    ColumnScopeInstance columnScopeInstance3 = ColumnScopeInstance.INSTANCE;
                    final Function0 function17 = function1;
                    final Function2 function18 = function7;
                    final IconType iconType6 = iconType3;
                    final long j6 = j2;
                    final String str6 = strC;
                    final Function3 function19 = function8;
                    final boolean z7 = z4;
                    final ImageUISize imageUISize6 = imageUISize3;
                    SurfaceKt.m2480SurfaceT9BRK9s(null, null, Color.INSTANCE.m4640getTransparent0d7_KjU(), 0L, 0.0f, f4, null, ComposableLambdaKt.rememberComposableLambda(-1254464971, true, new Function2() { // from class: wm
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            Composer composer2 = (Composer) obj;
                            int iIntValue = ((Integer) obj2).intValue();
                            if (composer2.shouldExecute((iIntValue & 3) != 2, iIntValue & 1)) {
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(-1254464971, iIntValue, -1, "app.chalo.compose.ChaloToolBar.<anonymous>.<anonymous> (ChaloToolBar.kt:178)");
                                }
                                AppBarKt.m1640TopAppBarGHTll3U(function18, null, ComposableLambdaKt.rememberComposableLambda(1682214575, true, new zm(z7, function17, imageUISize6, iconType6, str6), composer2, 54), function19, 0.0f, null, TopAppBarDefaults.INSTANCE.m2838topAppBarColors5tl4gsc(j6, 0L, 0L, 0L, 0L, 0L, composer2, TopAppBarDefaults.$stable << 18, 62), null, composer2, 384, 178);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            } else {
                                composer2.skipToGroupEnd();
                            }
                            return Unit.f17538a;
                        }
                    }, composerStartRestartGroup, 54), composerStartRestartGroup, ((i4 << 3) & 458752) | 12583296, 91);
                    f5 = f4;
                    if (Dp.m7283equalsimpl0(f5, ChaloTheme.b(composerStartRestartGroup, 6).f1916a)) {
                        composerStartRestartGroup.startReplaceGroup(800239996);
                        gf.r(Modifier.INSTANCE, ChaloTheme.c(composerStartRestartGroup, 6).b, composerStartRestartGroup, 0);
                    } else {
                        composerStartRestartGroup.startReplaceGroup(791292466);
                        composerStartRestartGroup.endReplaceGroup();
                    }
                    composerStartRestartGroup.endNode();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    Function3 function110 = function8;
                    f2 = f5;
                    iconType2 = iconType3;
                    j3 = j2;
                    function5 = function110;
                    imageUISize2 = imageUISize6;
                    function6 = function1;
                    function4 = function7;
                    str3 = strC;
                    modifier2 = modifier8;
                    z3 = z7;
                } else {
                    composerStartRestartGroup.skipToGroupEnd();
                    function4 = function2;
                    iconType2 = iconType;
                    z3 = z;
                    j3 = j2;
                    function5 = function3;
                    function6 = function1;
                    str3 = str2;
                    imageUISize2 = imageUISize;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                    final Modifier modifier9 = modifier2;
                    final float f8 = f2;
                    scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: xm
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            ((Integer) obj2).getClass();
                            int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(i | 1);
                            int iUpdateChangedFlags2 = RecomposeScopeImplKt.updateChangedFlags(i2);
                            ChaloToolBarKt.a(modifier9, function4, iconType2, str3, f8, j3, function5, function6, z3, imageUISize2, (Composer) obj, iUpdateChangedFlags, iUpdateChangedFlags2, i3);
                            return Unit.f17538a;
                        }
                    });
                }
            }
            i17 = i2 | 6;
            i15 = i17;
            if ((i4 & 306783379) == 306783378) {
                z2 = true;
            } else {
                z2 = true;
            }
            if (composerStartRestartGroup.shouldExecute(z2, i4 & 1)) {
                composerStartRestartGroup.startDefaults();
                if ((i & 1) != 0) {
                    if (i19 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if (i20 != 0) {
                        function7 = ComposableSingletons$ChaloToolBarKt.c;
                    } else {
                        function7 = function2;
                    }
                    if (i5 != 0) {
                        iconType3 = IconType.IC_ARROW_BACK;
                    } else {
                        iconType3 = iconType;
                    }
                    if ((i3 & 8) != 0) {
                        strC = StringResourcesHelperKt.c(StringEnum.BACK_BUTTON, new Object[0], composerStartRestartGroup, 6);
                        i4 &= -7169;
                    } else {
                        strC = str2;
                    }
                    if ((i3 & 16) != 0) {
                        f3 = ChaloTheme.c(composerStartRestartGroup, 6).c;
                        i4 &= -57345;
                    } else {
                        f3 = f2;
                    }
                    if ((i3 & 32) != 0) {
                        j2 = ChaloTheme.a(composerStartRestartGroup, 6).u;
                        i4 &= -458753;
                    }
                    if (i7 != 0) {
                        function8 = ComposableSingletons$ChaloToolBarKt.d;
                    } else {
                        function8 = function3;
                    }
                    if (i9 != 0) {
                        function1 = null;
                    }
                    if (i12 != 0) {
                        z4 = true;
                    } else {
                        z4 = z;
                    }
                    if (i14 != 0) {
                        f4 = f3;
                        imageUISize3 = null;
                    } else {
                        imageUISize3 = imageUISize;
                        f4 = f3;
                    }
                } else {
                    if (i19 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if (i20 != 0) {
                        function7 = ComposableSingletons$ChaloToolBarKt.c;
                    } else {
                        function7 = function2;
                    }
                    if (i5 != 0) {
                        iconType3 = IconType.IC_ARROW_BACK;
                    } else {
                        iconType3 = iconType;
                    }
                    if ((i3 & 8) != 0) {
                        strC = StringResourcesHelperKt.c(StringEnum.BACK_BUTTON, new Object[0], composerStartRestartGroup, 6);
                        i4 &= -7169;
                    } else {
                        strC = str2;
                    }
                    if ((i3 & 16) != 0) {
                        f3 = ChaloTheme.c(composerStartRestartGroup, 6).c;
                        i4 &= -57345;
                    } else {
                        f3 = f2;
                    }
                    if ((i3 & 32) != 0) {
                        j2 = ChaloTheme.a(composerStartRestartGroup, 6).u;
                        i4 &= -458753;
                    }
                    if (i7 != 0) {
                        function8 = ComposableSingletons$ChaloToolBarKt.d;
                    } else {
                        function8 = function3;
                    }
                    if (i9 != 0) {
                        function1 = null;
                    }
                    if (i12 != 0) {
                        z4 = true;
                    } else {
                        z4 = z;
                    }
                    if (i14 != 0) {
                        f4 = f3;
                        imageUISize3 = null;
                    } else {
                        imageUISize3 = imageUISize;
                        f4 = f3;
                    }
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1551130458, i4, i15, "app.chalo.compose.ChaloToolBar (ChaloToolBar.kt:172)");
                }
                MeasurePolicy measurePolicyColumnMeasurePolicy4 = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composerStartRestartGroup, 0);
                long currentCompositeKeyHashCode4 = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
                int i26 = (int) (currentCompositeKeyHashCode4 ^ (currentCompositeKeyHashCode4 >>> c));
                CompositionLocalMap currentCompositionLocalMap4 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier4 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifier3);
                Modifier modifier10 = modifier3;
                ComposeUiNode.Companion companion4 = ComposeUiNode.INSTANCE;
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
                Composer composerM3915constructorimpl4 = Updater.m3915constructorimpl(composerStartRestartGroup);
                pk0.v(companion4, composerM3915constructorimpl4, measurePolicyColumnMeasurePolicy4, composerM3915constructorimpl4, currentCompositionLocalMap4);
                Updater.m3923setimpl(composerM3915constructorimpl4, modifierMaterializeModifier4, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion4, composerM3915constructorimpl4, Integer.valueOf(i26), composerM3915constructorimpl4));
                ColumnScopeInstance columnScopeInstance4 = ColumnScopeInstance.INSTANCE;
                final Function0 function111 = function1;
                final Function2 function112 = function7;
                final IconType iconType7 = iconType3;
                final long j7 = j2;
                final String str7 = strC;
                final Function3 function113 = function8;
                final boolean z8 = z4;
                final ImageUISize imageUISize7 = imageUISize3;
                SurfaceKt.m2480SurfaceT9BRK9s(null, null, Color.INSTANCE.m4640getTransparent0d7_KjU(), 0L, 0.0f, f4, null, ComposableLambdaKt.rememberComposableLambda(-1254464971, true, new Function2() { // from class: wm
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        Composer composer2 = (Composer) obj;
                        int iIntValue = ((Integer) obj2).intValue();
                        if (composer2.shouldExecute((iIntValue & 3) != 2, iIntValue & 1)) {
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-1254464971, iIntValue, -1, "app.chalo.compose.ChaloToolBar.<anonymous>.<anonymous> (ChaloToolBar.kt:178)");
                            }
                            AppBarKt.m1640TopAppBarGHTll3U(function112, null, ComposableLambdaKt.rememberComposableLambda(1682214575, true, new zm(z8, function111, imageUISize7, iconType7, str7), composer2, 54), function113, 0.0f, null, TopAppBarDefaults.INSTANCE.m2838topAppBarColors5tl4gsc(j7, 0L, 0L, 0L, 0L, 0L, composer2, TopAppBarDefaults.$stable << 18, 62), null, composer2, 384, 178);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        } else {
                            composer2.skipToGroupEnd();
                        }
                        return Unit.f17538a;
                    }
                }, composerStartRestartGroup, 54), composerStartRestartGroup, ((i4 << 3) & 458752) | 12583296, 91);
                f5 = f4;
                if (Dp.m7283equalsimpl0(f5, ChaloTheme.b(composerStartRestartGroup, 6).f1916a)) {
                    composerStartRestartGroup.startReplaceGroup(800239996);
                    gf.r(Modifier.INSTANCE, ChaloTheme.c(composerStartRestartGroup, 6).b, composerStartRestartGroup, 0);
                } else {
                    composerStartRestartGroup.startReplaceGroup(791292466);
                    composerStartRestartGroup.endReplaceGroup();
                }
                composerStartRestartGroup.endNode();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                Function3 function114 = function8;
                f2 = f5;
                iconType2 = iconType3;
                j3 = j2;
                function5 = function114;
                imageUISize2 = imageUISize7;
                function6 = function1;
                function4 = function7;
                str3 = strC;
                modifier2 = modifier10;
                z3 = z8;
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                function4 = function2;
                iconType2 = iconType;
                z3 = z;
                j3 = j2;
                function5 = function3;
                function6 = function1;
                str3 = str2;
                imageUISize2 = imageUISize;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
                final Modifier modifier11 = modifier2;
                final float f9 = f2;
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: xm
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(i | 1);
                        int iUpdateChangedFlags2 = RecomposeScopeImplKt.updateChangedFlags(i2);
                        ChaloToolBarKt.a(modifier11, function4, iconType2, str3, f9, j3, function5, function6, z3, imageUISize2, (Composer) obj, iUpdateChangedFlags, iUpdateChangedFlags2, i3);
                        return Unit.f17538a;
                    }
                });
            }
        }
        i4 |= 48;
        i5 = i3 & 4;
        if (i5 != 0) {
            i4 |= 384;
        } else if ((i & 384) == 0) {
            if (iconType == null) {
                iOrdinal = -1;
            } else {
                iOrdinal = iconType.ordinal();
            }
            if (composerStartRestartGroup.changed(iOrdinal)) {
                i6 = 256;
            } else {
                i6 = 128;
            }
            i4 |= i6;
        }
        if ((i & 3072) == 0) {
            if ((i3 & 8) == 0) {
                str2 = str;
                if (composerStartRestartGroup.changed(str2)) {
                }
                i4 |= i21;
            } else {
                str2 = str;
            }
            i4 |= i21;
        } else {
            str2 = str;
        }
        if ((i & 24576) == 0) {
            if ((i3 & 16) == 0) {
                f2 = f;
                if (composerStartRestartGroup.changed(f2)) {
                }
                i4 |= i22;
            } else {
                f2 = f;
            }
            i4 |= i22;
        } else {
            f2 = f;
        }
        if ((196608 & i) == 0) {
            j2 = j;
            c = ' ';
            if ((i3 & 32) == 0) {
                i18 = 65536;
            } else {
                i18 = 65536;
            }
            i4 |= i18;
        } else {
            j2 = j;
            c = ' ';
        }
        i7 = i3 & 64;
        if (i7 != 0) {
            i4 |= 1572864;
        } else if ((i & 1572864) == 0) {
            if (composerStartRestartGroup.changedInstance(function3)) {
                i8 = 1048576;
            } else {
                i8 = 524288;
            }
            i4 |= i8;
        }
        i9 = i3 & 128;
        if (i9 != 0) {
            i4 |= 12582912;
            function1 = function0;
        } else {
            function1 = function0;
            if ((i & 12582912) == 0) {
                if (composerStartRestartGroup.changedInstance(function1)) {
                    i10 = 8388608;
                } else {
                    i10 = 4194304;
                }
                i4 |= i10;
            }
        }
        if ((i3 & 256) != 0) {
            i4 |= 100663296;
        } else if ((i & 100663296) == 0) {
            if (composerStartRestartGroup.changed((Object) null)) {
                i11 = AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL;
            } else {
                i11 = 33554432;
            }
            i4 |= i11;
        }
        i12 = i3 & 512;
        if (i12 != 0) {
            if ((i & 805306368) == 0) {
                if (composerStartRestartGroup.changed(z)) {
                    i13 = 536870912;
                } else {
                    i13 = 268435456;
                }
                i4 |= i13;
            }
            i14 = i3 & 1024;
            if (i14 != 0) {
                if ((i2 & 6) == 0) {
                    if (composerStartRestartGroup.changed(imageUISize)) {
                        i16 = 4;
                    } else {
                        i16 = 2;
                    }
                    i17 = i2 | i16;
                } else {
                    i14 = i14;
                    i15 = i2;
                }
                if ((i4 & 306783379) == 306783378) {
                    z2 = true;
                } else {
                    z2 = true;
                }
                if (composerStartRestartGroup.shouldExecute(z2, i4 & 1)) {
                    composerStartRestartGroup.startDefaults();
                    if ((i & 1) != 0) {
                        if (i19 != 0) {
                            modifier3 = Modifier.INSTANCE;
                        } else {
                            modifier3 = modifier2;
                        }
                        if (i20 != 0) {
                            function7 = ComposableSingletons$ChaloToolBarKt.c;
                        } else {
                            function7 = function2;
                        }
                        if (i5 != 0) {
                            iconType3 = IconType.IC_ARROW_BACK;
                        } else {
                            iconType3 = iconType;
                        }
                        if ((i3 & 8) != 0) {
                            strC = StringResourcesHelperKt.c(StringEnum.BACK_BUTTON, new Object[0], composerStartRestartGroup, 6);
                            i4 &= -7169;
                        } else {
                            strC = str2;
                        }
                        if ((i3 & 16) != 0) {
                            f3 = ChaloTheme.c(composerStartRestartGroup, 6).c;
                            i4 &= -57345;
                        } else {
                            f3 = f2;
                        }
                        if ((i3 & 32) != 0) {
                            j2 = ChaloTheme.a(composerStartRestartGroup, 6).u;
                            i4 &= -458753;
                        }
                        if (i7 != 0) {
                            function8 = ComposableSingletons$ChaloToolBarKt.d;
                        } else {
                            function8 = function3;
                        }
                        if (i9 != 0) {
                            function1 = null;
                        }
                        if (i12 != 0) {
                            z4 = true;
                        } else {
                            z4 = z;
                        }
                        if (i14 != 0) {
                            f4 = f3;
                            imageUISize3 = null;
                        } else {
                            imageUISize3 = imageUISize;
                            f4 = f3;
                        }
                    } else {
                        if (i19 != 0) {
                            modifier3 = Modifier.INSTANCE;
                        } else {
                            modifier3 = modifier2;
                        }
                        if (i20 != 0) {
                            function7 = ComposableSingletons$ChaloToolBarKt.c;
                        } else {
                            function7 = function2;
                        }
                        if (i5 != 0) {
                            iconType3 = IconType.IC_ARROW_BACK;
                        } else {
                            iconType3 = iconType;
                        }
                        if ((i3 & 8) != 0) {
                            strC = StringResourcesHelperKt.c(StringEnum.BACK_BUTTON, new Object[0], composerStartRestartGroup, 6);
                            i4 &= -7169;
                        } else {
                            strC = str2;
                        }
                        if ((i3 & 16) != 0) {
                            f3 = ChaloTheme.c(composerStartRestartGroup, 6).c;
                            i4 &= -57345;
                        } else {
                            f3 = f2;
                        }
                        if ((i3 & 32) != 0) {
                            j2 = ChaloTheme.a(composerStartRestartGroup, 6).u;
                            i4 &= -458753;
                        }
                        if (i7 != 0) {
                            function8 = ComposableSingletons$ChaloToolBarKt.d;
                        } else {
                            function8 = function3;
                        }
                        if (i9 != 0) {
                            function1 = null;
                        }
                        if (i12 != 0) {
                            z4 = true;
                        } else {
                            z4 = z;
                        }
                        if (i14 != 0) {
                            f4 = f3;
                            imageUISize3 = null;
                        } else {
                            imageUISize3 = imageUISize;
                            f4 = f3;
                        }
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1551130458, i4, i15, "app.chalo.compose.ChaloToolBar (ChaloToolBar.kt:172)");
                    }
                    MeasurePolicy measurePolicyColumnMeasurePolicy5 = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composerStartRestartGroup, 0);
                    long currentCompositeKeyHashCode5 = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
                    int i27 = (int) (currentCompositeKeyHashCode5 ^ (currentCompositeKeyHashCode5 >>> c));
                    CompositionLocalMap currentCompositionLocalMap5 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier5 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifier3);
                    Modifier modifier12 = modifier3;
                    ComposeUiNode.Companion companion5 = ComposeUiNode.INSTANCE;
                    constructor = companion5.getConstructor();
                    if (composerStartRestartGroup.getApplier() == null) {
                        ComposablesKt.invalidApplier();
                    }
                    composerStartRestartGroup.startReusableNode();
                    if (composerStartRestartGroup.getInserting()) {
                        composerStartRestartGroup.createNode(constructor);
                    } else {
                        composerStartRestartGroup.useNode();
                    }
                    Composer composerM3915constructorimpl5 = Updater.m3915constructorimpl(composerStartRestartGroup);
                    pk0.v(companion5, composerM3915constructorimpl5, measurePolicyColumnMeasurePolicy5, composerM3915constructorimpl5, currentCompositionLocalMap5);
                    Updater.m3923setimpl(composerM3915constructorimpl5, modifierMaterializeModifier5, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion5, composerM3915constructorimpl5, Integer.valueOf(i27), composerM3915constructorimpl5));
                    ColumnScopeInstance columnScopeInstance5 = ColumnScopeInstance.INSTANCE;
                    final Function0 function115 = function1;
                    final Function2 function116 = function7;
                    final IconType iconType8 = iconType3;
                    final long j8 = j2;
                    final String str8 = strC;
                    final Function3 function117 = function8;
                    final boolean z9 = z4;
                    final ImageUISize imageUISize8 = imageUISize3;
                    SurfaceKt.m2480SurfaceT9BRK9s(null, null, Color.INSTANCE.m4640getTransparent0d7_KjU(), 0L, 0.0f, f4, null, ComposableLambdaKt.rememberComposableLambda(-1254464971, true, new Function2() { // from class: wm
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            Composer composer2 = (Composer) obj;
                            int iIntValue = ((Integer) obj2).intValue();
                            if (composer2.shouldExecute((iIntValue & 3) != 2, iIntValue & 1)) {
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(-1254464971, iIntValue, -1, "app.chalo.compose.ChaloToolBar.<anonymous>.<anonymous> (ChaloToolBar.kt:178)");
                                }
                                AppBarKt.m1640TopAppBarGHTll3U(function116, null, ComposableLambdaKt.rememberComposableLambda(1682214575, true, new zm(z9, function115, imageUISize8, iconType8, str8), composer2, 54), function117, 0.0f, null, TopAppBarDefaults.INSTANCE.m2838topAppBarColors5tl4gsc(j8, 0L, 0L, 0L, 0L, 0L, composer2, TopAppBarDefaults.$stable << 18, 62), null, composer2, 384, 178);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            } else {
                                composer2.skipToGroupEnd();
                            }
                            return Unit.f17538a;
                        }
                    }, composerStartRestartGroup, 54), composerStartRestartGroup, ((i4 << 3) & 458752) | 12583296, 91);
                    f5 = f4;
                    if (Dp.m7283equalsimpl0(f5, ChaloTheme.b(composerStartRestartGroup, 6).f1916a)) {
                        composerStartRestartGroup.startReplaceGroup(800239996);
                        gf.r(Modifier.INSTANCE, ChaloTheme.c(composerStartRestartGroup, 6).b, composerStartRestartGroup, 0);
                    } else {
                        composerStartRestartGroup.startReplaceGroup(791292466);
                        composerStartRestartGroup.endReplaceGroup();
                    }
                    composerStartRestartGroup.endNode();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    Function3 function118 = function8;
                    f2 = f5;
                    iconType2 = iconType3;
                    j3 = j2;
                    function5 = function118;
                    imageUISize2 = imageUISize8;
                    function6 = function1;
                    function4 = function7;
                    str3 = strC;
                    modifier2 = modifier12;
                    z3 = z9;
                } else {
                    composerStartRestartGroup.skipToGroupEnd();
                    function4 = function2;
                    iconType2 = iconType;
                    z3 = z;
                    j3 = j2;
                    function5 = function3;
                    function6 = function1;
                    str3 = str2;
                    imageUISize2 = imageUISize;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                    final Modifier modifier13 = modifier2;
                    final float f10 = f2;
                    scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: xm
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            ((Integer) obj2).getClass();
                            int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(i | 1);
                            int iUpdateChangedFlags2 = RecomposeScopeImplKt.updateChangedFlags(i2);
                            ChaloToolBarKt.a(modifier13, function4, iconType2, str3, f10, j3, function5, function6, z3, imageUISize2, (Composer) obj, iUpdateChangedFlags, iUpdateChangedFlags2, i3);
                            return Unit.f17538a;
                        }
                    });
                }
            }
            i17 = i2 | 6;
            i15 = i17;
            if ((i4 & 306783379) == 306783378) {
                z2 = true;
            } else {
                z2 = true;
            }
            if (composerStartRestartGroup.shouldExecute(z2, i4 & 1)) {
                composerStartRestartGroup.startDefaults();
                if ((i & 1) != 0) {
                    if (i19 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if (i20 != 0) {
                        function7 = ComposableSingletons$ChaloToolBarKt.c;
                    } else {
                        function7 = function2;
                    }
                    if (i5 != 0) {
                        iconType3 = IconType.IC_ARROW_BACK;
                    } else {
                        iconType3 = iconType;
                    }
                    if ((i3 & 8) != 0) {
                        strC = StringResourcesHelperKt.c(StringEnum.BACK_BUTTON, new Object[0], composerStartRestartGroup, 6);
                        i4 &= -7169;
                    } else {
                        strC = str2;
                    }
                    if ((i3 & 16) != 0) {
                        f3 = ChaloTheme.c(composerStartRestartGroup, 6).c;
                        i4 &= -57345;
                    } else {
                        f3 = f2;
                    }
                    if ((i3 & 32) != 0) {
                        j2 = ChaloTheme.a(composerStartRestartGroup, 6).u;
                        i4 &= -458753;
                    }
                    if (i7 != 0) {
                        function8 = ComposableSingletons$ChaloToolBarKt.d;
                    } else {
                        function8 = function3;
                    }
                    if (i9 != 0) {
                        function1 = null;
                    }
                    if (i12 != 0) {
                        z4 = true;
                    } else {
                        z4 = z;
                    }
                    if (i14 != 0) {
                        f4 = f3;
                        imageUISize3 = null;
                    } else {
                        imageUISize3 = imageUISize;
                        f4 = f3;
                    }
                } else {
                    if (i19 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if (i20 != 0) {
                        function7 = ComposableSingletons$ChaloToolBarKt.c;
                    } else {
                        function7 = function2;
                    }
                    if (i5 != 0) {
                        iconType3 = IconType.IC_ARROW_BACK;
                    } else {
                        iconType3 = iconType;
                    }
                    if ((i3 & 8) != 0) {
                        strC = StringResourcesHelperKt.c(StringEnum.BACK_BUTTON, new Object[0], composerStartRestartGroup, 6);
                        i4 &= -7169;
                    } else {
                        strC = str2;
                    }
                    if ((i3 & 16) != 0) {
                        f3 = ChaloTheme.c(composerStartRestartGroup, 6).c;
                        i4 &= -57345;
                    } else {
                        f3 = f2;
                    }
                    if ((i3 & 32) != 0) {
                        j2 = ChaloTheme.a(composerStartRestartGroup, 6).u;
                        i4 &= -458753;
                    }
                    if (i7 != 0) {
                        function8 = ComposableSingletons$ChaloToolBarKt.d;
                    } else {
                        function8 = function3;
                    }
                    if (i9 != 0) {
                        function1 = null;
                    }
                    if (i12 != 0) {
                        z4 = true;
                    } else {
                        z4 = z;
                    }
                    if (i14 != 0) {
                        f4 = f3;
                        imageUISize3 = null;
                    } else {
                        imageUISize3 = imageUISize;
                        f4 = f3;
                    }
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1551130458, i4, i15, "app.chalo.compose.ChaloToolBar (ChaloToolBar.kt:172)");
                }
                MeasurePolicy measurePolicyColumnMeasurePolicy6 = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composerStartRestartGroup, 0);
                long currentCompositeKeyHashCode6 = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
                int i28 = (int) (currentCompositeKeyHashCode6 ^ (currentCompositeKeyHashCode6 >>> c));
                CompositionLocalMap currentCompositionLocalMap6 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier6 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifier3);
                Modifier modifier14 = modifier3;
                ComposeUiNode.Companion companion6 = ComposeUiNode.INSTANCE;
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
                Composer composerM3915constructorimpl6 = Updater.m3915constructorimpl(composerStartRestartGroup);
                pk0.v(companion6, composerM3915constructorimpl6, measurePolicyColumnMeasurePolicy6, composerM3915constructorimpl6, currentCompositionLocalMap6);
                Updater.m3923setimpl(composerM3915constructorimpl6, modifierMaterializeModifier6, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion6, composerM3915constructorimpl6, Integer.valueOf(i28), composerM3915constructorimpl6));
                ColumnScopeInstance columnScopeInstance6 = ColumnScopeInstance.INSTANCE;
                final Function0 function119 = function1;
                final Function2 function1110 = function7;
                final IconType iconType9 = iconType3;
                final long j9 = j2;
                final String str9 = strC;
                final Function3 function1111 = function8;
                final boolean z10 = z4;
                final ImageUISize imageUISize9 = imageUISize3;
                SurfaceKt.m2480SurfaceT9BRK9s(null, null, Color.INSTANCE.m4640getTransparent0d7_KjU(), 0L, 0.0f, f4, null, ComposableLambdaKt.rememberComposableLambda(-1254464971, true, new Function2() { // from class: wm
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        Composer composer2 = (Composer) obj;
                        int iIntValue = ((Integer) obj2).intValue();
                        if (composer2.shouldExecute((iIntValue & 3) != 2, iIntValue & 1)) {
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-1254464971, iIntValue, -1, "app.chalo.compose.ChaloToolBar.<anonymous>.<anonymous> (ChaloToolBar.kt:178)");
                            }
                            AppBarKt.m1640TopAppBarGHTll3U(function1110, null, ComposableLambdaKt.rememberComposableLambda(1682214575, true, new zm(z10, function119, imageUISize9, iconType9, str9), composer2, 54), function1111, 0.0f, null, TopAppBarDefaults.INSTANCE.m2838topAppBarColors5tl4gsc(j9, 0L, 0L, 0L, 0L, 0L, composer2, TopAppBarDefaults.$stable << 18, 62), null, composer2, 384, 178);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        } else {
                            composer2.skipToGroupEnd();
                        }
                        return Unit.f17538a;
                    }
                }, composerStartRestartGroup, 54), composerStartRestartGroup, ((i4 << 3) & 458752) | 12583296, 91);
                f5 = f4;
                if (Dp.m7283equalsimpl0(f5, ChaloTheme.b(composerStartRestartGroup, 6).f1916a)) {
                    composerStartRestartGroup.startReplaceGroup(800239996);
                    gf.r(Modifier.INSTANCE, ChaloTheme.c(composerStartRestartGroup, 6).b, composerStartRestartGroup, 0);
                } else {
                    composerStartRestartGroup.startReplaceGroup(791292466);
                    composerStartRestartGroup.endReplaceGroup();
                }
                composerStartRestartGroup.endNode();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                Function3 function1112 = function8;
                f2 = f5;
                iconType2 = iconType3;
                j3 = j2;
                function5 = function1112;
                imageUISize2 = imageUISize9;
                function6 = function1;
                function4 = function7;
                str3 = strC;
                modifier2 = modifier14;
                z3 = z10;
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                function4 = function2;
                iconType2 = iconType;
                z3 = z;
                j3 = j2;
                function5 = function3;
                function6 = function1;
                str3 = str2;
                imageUISize2 = imageUISize;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
                final Modifier modifier15 = modifier2;
                final float f11 = f2;
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: xm
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(i | 1);
                        int iUpdateChangedFlags2 = RecomposeScopeImplKt.updateChangedFlags(i2);
                        ChaloToolBarKt.a(modifier15, function4, iconType2, str3, f11, j3, function5, function6, z3, imageUISize2, (Composer) obj, iUpdateChangedFlags, iUpdateChangedFlags2, i3);
                        return Unit.f17538a;
                    }
                });
            }
        }
        i4 |= 805306368;
        i14 = i3 & 1024;
        if (i14 != 0) {
            if ((i2 & 6) == 0) {
                if (composerStartRestartGroup.changed(imageUISize)) {
                    i16 = 4;
                } else {
                    i16 = 2;
                }
                i17 = i2 | i16;
            } else {
                i14 = i14;
                i15 = i2;
            }
            if ((i4 & 306783379) == 306783378) {
                z2 = true;
            } else {
                z2 = true;
            }
            if (composerStartRestartGroup.shouldExecute(z2, i4 & 1)) {
                composerStartRestartGroup.startDefaults();
                if ((i & 1) != 0) {
                    if (i19 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if (i20 != 0) {
                        function7 = ComposableSingletons$ChaloToolBarKt.c;
                    } else {
                        function7 = function2;
                    }
                    if (i5 != 0) {
                        iconType3 = IconType.IC_ARROW_BACK;
                    } else {
                        iconType3 = iconType;
                    }
                    if ((i3 & 8) != 0) {
                        strC = StringResourcesHelperKt.c(StringEnum.BACK_BUTTON, new Object[0], composerStartRestartGroup, 6);
                        i4 &= -7169;
                    } else {
                        strC = str2;
                    }
                    if ((i3 & 16) != 0) {
                        f3 = ChaloTheme.c(composerStartRestartGroup, 6).c;
                        i4 &= -57345;
                    } else {
                        f3 = f2;
                    }
                    if ((i3 & 32) != 0) {
                        j2 = ChaloTheme.a(composerStartRestartGroup, 6).u;
                        i4 &= -458753;
                    }
                    if (i7 != 0) {
                        function8 = ComposableSingletons$ChaloToolBarKt.d;
                    } else {
                        function8 = function3;
                    }
                    if (i9 != 0) {
                        function1 = null;
                    }
                    if (i12 != 0) {
                        z4 = true;
                    } else {
                        z4 = z;
                    }
                    if (i14 != 0) {
                        f4 = f3;
                        imageUISize3 = null;
                    } else {
                        imageUISize3 = imageUISize;
                        f4 = f3;
                    }
                } else {
                    if (i19 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if (i20 != 0) {
                        function7 = ComposableSingletons$ChaloToolBarKt.c;
                    } else {
                        function7 = function2;
                    }
                    if (i5 != 0) {
                        iconType3 = IconType.IC_ARROW_BACK;
                    } else {
                        iconType3 = iconType;
                    }
                    if ((i3 & 8) != 0) {
                        strC = StringResourcesHelperKt.c(StringEnum.BACK_BUTTON, new Object[0], composerStartRestartGroup, 6);
                        i4 &= -7169;
                    } else {
                        strC = str2;
                    }
                    if ((i3 & 16) != 0) {
                        f3 = ChaloTheme.c(composerStartRestartGroup, 6).c;
                        i4 &= -57345;
                    } else {
                        f3 = f2;
                    }
                    if ((i3 & 32) != 0) {
                        j2 = ChaloTheme.a(composerStartRestartGroup, 6).u;
                        i4 &= -458753;
                    }
                    if (i7 != 0) {
                        function8 = ComposableSingletons$ChaloToolBarKt.d;
                    } else {
                        function8 = function3;
                    }
                    if (i9 != 0) {
                        function1 = null;
                    }
                    if (i12 != 0) {
                        z4 = true;
                    } else {
                        z4 = z;
                    }
                    if (i14 != 0) {
                        f4 = f3;
                        imageUISize3 = null;
                    } else {
                        imageUISize3 = imageUISize;
                        f4 = f3;
                    }
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1551130458, i4, i15, "app.chalo.compose.ChaloToolBar (ChaloToolBar.kt:172)");
                }
                MeasurePolicy measurePolicyColumnMeasurePolicy7 = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composerStartRestartGroup, 0);
                long currentCompositeKeyHashCode7 = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
                int i29 = (int) (currentCompositeKeyHashCode7 ^ (currentCompositeKeyHashCode7 >>> c));
                CompositionLocalMap currentCompositionLocalMap7 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier7 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifier3);
                Modifier modifier16 = modifier3;
                ComposeUiNode.Companion companion7 = ComposeUiNode.INSTANCE;
                constructor = companion7.getConstructor();
                if (composerStartRestartGroup.getApplier() == null) {
                    ComposablesKt.invalidApplier();
                }
                composerStartRestartGroup.startReusableNode();
                if (composerStartRestartGroup.getInserting()) {
                    composerStartRestartGroup.createNode(constructor);
                } else {
                    composerStartRestartGroup.useNode();
                }
                Composer composerM3915constructorimpl7 = Updater.m3915constructorimpl(composerStartRestartGroup);
                pk0.v(companion7, composerM3915constructorimpl7, measurePolicyColumnMeasurePolicy7, composerM3915constructorimpl7, currentCompositionLocalMap7);
                Updater.m3923setimpl(composerM3915constructorimpl7, modifierMaterializeModifier7, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion7, composerM3915constructorimpl7, Integer.valueOf(i29), composerM3915constructorimpl7));
                ColumnScopeInstance columnScopeInstance7 = ColumnScopeInstance.INSTANCE;
                final Function0 function1113 = function1;
                final Function2 function1114 = function7;
                final IconType iconType10 = iconType3;
                final long j10 = j2;
                final String str10 = strC;
                final Function3 function1115 = function8;
                final boolean z11 = z4;
                final ImageUISize imageUISize10 = imageUISize3;
                SurfaceKt.m2480SurfaceT9BRK9s(null, null, Color.INSTANCE.m4640getTransparent0d7_KjU(), 0L, 0.0f, f4, null, ComposableLambdaKt.rememberComposableLambda(-1254464971, true, new Function2() { // from class: wm
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        Composer composer2 = (Composer) obj;
                        int iIntValue = ((Integer) obj2).intValue();
                        if (composer2.shouldExecute((iIntValue & 3) != 2, iIntValue & 1)) {
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-1254464971, iIntValue, -1, "app.chalo.compose.ChaloToolBar.<anonymous>.<anonymous> (ChaloToolBar.kt:178)");
                            }
                            AppBarKt.m1640TopAppBarGHTll3U(function1114, null, ComposableLambdaKt.rememberComposableLambda(1682214575, true, new zm(z11, function1113, imageUISize10, iconType10, str10), composer2, 54), function1115, 0.0f, null, TopAppBarDefaults.INSTANCE.m2838topAppBarColors5tl4gsc(j10, 0L, 0L, 0L, 0L, 0L, composer2, TopAppBarDefaults.$stable << 18, 62), null, composer2, 384, 178);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        } else {
                            composer2.skipToGroupEnd();
                        }
                        return Unit.f17538a;
                    }
                }, composerStartRestartGroup, 54), composerStartRestartGroup, ((i4 << 3) & 458752) | 12583296, 91);
                f5 = f4;
                if (Dp.m7283equalsimpl0(f5, ChaloTheme.b(composerStartRestartGroup, 6).f1916a)) {
                    composerStartRestartGroup.startReplaceGroup(800239996);
                    gf.r(Modifier.INSTANCE, ChaloTheme.c(composerStartRestartGroup, 6).b, composerStartRestartGroup, 0);
                } else {
                    composerStartRestartGroup.startReplaceGroup(791292466);
                    composerStartRestartGroup.endReplaceGroup();
                }
                composerStartRestartGroup.endNode();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                Function3 function1116 = function8;
                f2 = f5;
                iconType2 = iconType3;
                j3 = j2;
                function5 = function1116;
                imageUISize2 = imageUISize10;
                function6 = function1;
                function4 = function7;
                str3 = strC;
                modifier2 = modifier16;
                z3 = z11;
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                function4 = function2;
                iconType2 = iconType;
                z3 = z;
                j3 = j2;
                function5 = function3;
                function6 = function1;
                str3 = str2;
                imageUISize2 = imageUISize;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
                final Modifier modifier17 = modifier2;
                final float f12 = f2;
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: xm
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(i | 1);
                        int iUpdateChangedFlags2 = RecomposeScopeImplKt.updateChangedFlags(i2);
                        ChaloToolBarKt.a(modifier17, function4, iconType2, str3, f12, j3, function5, function6, z3, imageUISize2, (Composer) obj, iUpdateChangedFlags, iUpdateChangedFlags2, i3);
                        return Unit.f17538a;
                    }
                });
            }
        }
        i17 = i2 | 6;
        i15 = i17;
        if ((i4 & 306783379) == 306783378) {
            z2 = true;
        } else {
            z2 = true;
        }
        if (composerStartRestartGroup.shouldExecute(z2, i4 & 1)) {
            composerStartRestartGroup.startDefaults();
            if ((i & 1) != 0) {
                if (i19 != 0) {
                    modifier3 = Modifier.INSTANCE;
                } else {
                    modifier3 = modifier2;
                }
                if (i20 != 0) {
                    function7 = ComposableSingletons$ChaloToolBarKt.c;
                } else {
                    function7 = function2;
                }
                if (i5 != 0) {
                    iconType3 = IconType.IC_ARROW_BACK;
                } else {
                    iconType3 = iconType;
                }
                if ((i3 & 8) != 0) {
                    strC = StringResourcesHelperKt.c(StringEnum.BACK_BUTTON, new Object[0], composerStartRestartGroup, 6);
                    i4 &= -7169;
                } else {
                    strC = str2;
                }
                if ((i3 & 16) != 0) {
                    f3 = ChaloTheme.c(composerStartRestartGroup, 6).c;
                    i4 &= -57345;
                } else {
                    f3 = f2;
                }
                if ((i3 & 32) != 0) {
                    j2 = ChaloTheme.a(composerStartRestartGroup, 6).u;
                    i4 &= -458753;
                }
                if (i7 != 0) {
                    function8 = ComposableSingletons$ChaloToolBarKt.d;
                } else {
                    function8 = function3;
                }
                if (i9 != 0) {
                    function1 = null;
                }
                if (i12 != 0) {
                    z4 = true;
                } else {
                    z4 = z;
                }
                if (i14 != 0) {
                    f4 = f3;
                    imageUISize3 = null;
                } else {
                    imageUISize3 = imageUISize;
                    f4 = f3;
                }
            } else {
                if (i19 != 0) {
                    modifier3 = Modifier.INSTANCE;
                } else {
                    modifier3 = modifier2;
                }
                if (i20 != 0) {
                    function7 = ComposableSingletons$ChaloToolBarKt.c;
                } else {
                    function7 = function2;
                }
                if (i5 != 0) {
                    iconType3 = IconType.IC_ARROW_BACK;
                } else {
                    iconType3 = iconType;
                }
                if ((i3 & 8) != 0) {
                    strC = StringResourcesHelperKt.c(StringEnum.BACK_BUTTON, new Object[0], composerStartRestartGroup, 6);
                    i4 &= -7169;
                } else {
                    strC = str2;
                }
                if ((i3 & 16) != 0) {
                    f3 = ChaloTheme.c(composerStartRestartGroup, 6).c;
                    i4 &= -57345;
                } else {
                    f3 = f2;
                }
                if ((i3 & 32) != 0) {
                    j2 = ChaloTheme.a(composerStartRestartGroup, 6).u;
                    i4 &= -458753;
                }
                if (i7 != 0) {
                    function8 = ComposableSingletons$ChaloToolBarKt.d;
                } else {
                    function8 = function3;
                }
                if (i9 != 0) {
                    function1 = null;
                }
                if (i12 != 0) {
                    z4 = true;
                } else {
                    z4 = z;
                }
                if (i14 != 0) {
                    f4 = f3;
                    imageUISize3 = null;
                } else {
                    imageUISize3 = imageUISize;
                    f4 = f3;
                }
            }
            composerStartRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1551130458, i4, i15, "app.chalo.compose.ChaloToolBar (ChaloToolBar.kt:172)");
            }
            MeasurePolicy measurePolicyColumnMeasurePolicy8 = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composerStartRestartGroup, 0);
            long currentCompositeKeyHashCode8 = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
            int i210 = (int) (currentCompositeKeyHashCode8 ^ (currentCompositeKeyHashCode8 >>> c));
            CompositionLocalMap currentCompositionLocalMap8 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier8 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifier3);
            Modifier modifier18 = modifier3;
            ComposeUiNode.Companion companion8 = ComposeUiNode.INSTANCE;
            constructor = companion8.getConstructor();
            if (composerStartRestartGroup.getApplier() == null) {
                ComposablesKt.invalidApplier();
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.createNode(constructor);
            } else {
                composerStartRestartGroup.useNode();
            }
            Composer composerM3915constructorimpl8 = Updater.m3915constructorimpl(composerStartRestartGroup);
            pk0.v(companion8, composerM3915constructorimpl8, measurePolicyColumnMeasurePolicy8, composerM3915constructorimpl8, currentCompositionLocalMap8);
            Updater.m3923setimpl(composerM3915constructorimpl8, modifierMaterializeModifier8, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion8, composerM3915constructorimpl8, Integer.valueOf(i210), composerM3915constructorimpl8));
            ColumnScopeInstance columnScopeInstance8 = ColumnScopeInstance.INSTANCE;
            final Function0 function1117 = function1;
            final Function2 function1118 = function7;
            final IconType iconType11 = iconType3;
            final long j11 = j2;
            final String str11 = strC;
            final Function3 function1119 = function8;
            final boolean z12 = z4;
            final ImageUISize imageUISize11 = imageUISize3;
            SurfaceKt.m2480SurfaceT9BRK9s(null, null, Color.INSTANCE.m4640getTransparent0d7_KjU(), 0L, 0.0f, f4, null, ComposableLambdaKt.rememberComposableLambda(-1254464971, true, new Function2() { // from class: wm
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Composer composer2 = (Composer) obj;
                    int iIntValue = ((Integer) obj2).intValue();
                    if (composer2.shouldExecute((iIntValue & 3) != 2, iIntValue & 1)) {
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-1254464971, iIntValue, -1, "app.chalo.compose.ChaloToolBar.<anonymous>.<anonymous> (ChaloToolBar.kt:178)");
                        }
                        AppBarKt.m1640TopAppBarGHTll3U(function1118, null, ComposableLambdaKt.rememberComposableLambda(1682214575, true, new zm(z12, function1117, imageUISize11, iconType11, str11), composer2, 54), function1119, 0.0f, null, TopAppBarDefaults.INSTANCE.m2838topAppBarColors5tl4gsc(j11, 0L, 0L, 0L, 0L, 0L, composer2, TopAppBarDefaults.$stable << 18, 62), null, composer2, 384, 178);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    } else {
                        composer2.skipToGroupEnd();
                    }
                    return Unit.f17538a;
                }
            }, composerStartRestartGroup, 54), composerStartRestartGroup, ((i4 << 3) & 458752) | 12583296, 91);
            f5 = f4;
            if (Dp.m7283equalsimpl0(f5, ChaloTheme.b(composerStartRestartGroup, 6).f1916a)) {
                composerStartRestartGroup.startReplaceGroup(800239996);
                gf.r(Modifier.INSTANCE, ChaloTheme.c(composerStartRestartGroup, 6).b, composerStartRestartGroup, 0);
            } else {
                composerStartRestartGroup.startReplaceGroup(791292466);
                composerStartRestartGroup.endReplaceGroup();
            }
            composerStartRestartGroup.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            Function3 function11110 = function8;
            f2 = f5;
            iconType2 = iconType3;
            j3 = j2;
            function5 = function11110;
            imageUISize2 = imageUISize11;
            function6 = function1;
            function4 = function7;
            str3 = strC;
            modifier2 = modifier18;
            z3 = z12;
        } else {
            composerStartRestartGroup.skipToGroupEnd();
            function4 = function2;
            iconType2 = iconType;
            z3 = z;
            j3 = j2;
            function5 = function3;
            function6 = function1;
            str3 = str2;
            imageUISize2 = imageUISize;
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            final Modifier modifier19 = modifier2;
            final float f13 = f2;
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: xm
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(i | 1);
                    int iUpdateChangedFlags2 = RecomposeScopeImplKt.updateChangedFlags(i2);
                    ChaloToolBarKt.a(modifier19, function4, iconType2, str3, f13, j3, function5, function6, z3, imageUISize2, (Composer) obj, iUpdateChangedFlags, iUpdateChangedFlags2, i3);
                    return Unit.f17538a;
                }
            });
        }
    }

    /* JADX WARN: Code duplicated, block: B:23:0x004c  */
    /* JADX WARN: Code duplicated, block: B:24:0x004e  */
    /* JADX WARN: Code duplicated, block: B:27:0x0057 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:28:0x0059  */
    /* JADX WARN: Code duplicated, block: B:29:0x005c  */
    /* JADX WARN: Code duplicated, block: B:32:0x0065  */
    /* JADX WARN: Code duplicated, block: B:37:0x0079  */
    /* JADX WARN: Code duplicated, block: B:40:0x007e  */
    /* JADX WARN: Code duplicated, block: B:41:0x0081  */
    /* JADX WARN: Code duplicated, block: B:43:0x0084  */
    /* JADX WARN: Code duplicated, block: B:45:0x0098  */
    /* JADX WARN: Code duplicated, block: B:48:0x00ae  */
    /* JADX WARN: Code duplicated, block: B:51:0x00dc  */
    /* JADX WARN: Code duplicated, block: B:52:0x00de  */
    /* JADX WARN: Code duplicated, block: B:57:0x00f2  */
    /* JADX WARN: Code duplicated, block: B:60:0x0122  */
    /* JADX WARN: Code duplicated, block: B:62:0x0129  */
    /* JADX WARN: Code duplicated, block: B:65:0x0135  */
    /* JADX WARN: Code duplicated, block: B:67:? A[RETURN, SYNTHETIC] */
    public static final void b(ToolbarUIState state, Modifier modifier, Function3 function3, Composer composer, int i, int i2) {
        int i3;
        Modifier modifier2;
        int i4;
        boolean z;
        Function3 function4;
        Modifier modifier3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Modifier modifier4;
        Function0 function0;
        IconType iconType;
        String strC;
        ImageUISize imageUISize;
        boolean z2;
        boolean zChanged;
        Object objRememberedValue;
        Intrinsics.i(state, "state");
        ToolbarUiSpecs toolbarUiSpecs = state.f10119a;
        ImageUIState imageUIState = state.c;
        Composer composerStartRestartGroup = composer.startRestartGroup(1386041888);
        if ((i & 6) == 0) {
            i3 = i | (composerStartRestartGroup.changed(state) ? 4 : 2);
        } else {
            i3 = i;
        }
        int i5 = i2 & 2;
        if (i5 == 0) {
            if ((i & 48) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 32 : 16;
            }
            i4 = i3 | 3456;
            if ((i4 & 1171) != 1170) {
                z = true;
            } else {
                z = false;
            }
            if (composerStartRestartGroup.shouldExecute(z, i4 & 1)) {
                if (i5 != 0) {
                    modifier4 = Modifier.INSTANCE;
                } else {
                    modifier4 = modifier2;
                }
                ComposableLambda composableLambda = ComposableSingletons$ChaloToolBarKt.b;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1386041888, i4, -1, "app.chalo.compose.ChaloToolBar (ChaloToolBar.kt:125)");
                }
                function0 = (Function0) composerStartRestartGroup.consume(LocalBackHandlerKt.f1812a);
                if (imageUIState != null || (iconType = imageUIState.f10035a) == null) {
                    iconType = IconType.IC_ARROW_BACK;
                }
                if (imageUIState != null) {
                    strC = imageUIState.b;
                } else {
                    strC = null;
                }
                if (strC == null) {
                    composerStartRestartGroup.startReplaceGroup(546415462);
                    strC = StringResourcesHelperKt.c(StringEnum.BACK_BUTTON, new Object[0], composerStartRestartGroup, 6);
                    composerStartRestartGroup.endReplaceGroup();
                } else {
                    composerStartRestartGroup.startReplaceGroup(546412858);
                    composerStartRestartGroup.endReplaceGroup();
                }
                imageUISize = null;
                float f = state.f;
                long jC = ChaloColorTokenKt.c(toolbarUiSpecs.f10121a);
                boolean z3 = toolbarUiSpecs.e;
                if (imageUIState != null) {
                    imageUISize = imageUIState.d;
                }
                ComposableLambda composableLambdaRememberComposableLambda = ComposableLambdaKt.rememberComposableLambda(1070991190, true, new um(state, 1), composerStartRestartGroup, 54);
                ComposableLambda composableLambdaRememberComposableLambda2 = ComposableLambdaKt.rememberComposableLambda(857661385, true, new d0(21, state, composableLambda), composerStartRestartGroup, 54);
                if ((i4 & 14) == 4) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                zChanged = composerStartRestartGroup.changed(function0) | z2;
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = new pm(state, function0, 2);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                int i6 = ((i4 >> 3) & 14) | 1572912 | ((i4 << 15) & 234881024);
                Modifier modifier5 = modifier4;
                a(modifier5, composableLambdaRememberComposableLambda, iconType, strC, f, jC, composableLambdaRememberComposableLambda2, (Function0) objRememberedValue, z3, imageUISize, composerStartRestartGroup, i6, 0, 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier3 = modifier5;
                function4 = composableLambda;
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                function4 = function3;
                modifier3 = modifier2;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new v(state, modifier3, function4, i, i2, 9));
            }
        }
        i3 |= 48;
        modifier2 = modifier;
        i4 = i3 | 3456;
        if ((i4 & 1171) != 1170) {
            z = true;
        } else {
            z = false;
        }
        if (composerStartRestartGroup.shouldExecute(z, i4 & 1)) {
            if (i5 != 0) {
                modifier4 = Modifier.INSTANCE;
            } else {
                modifier4 = modifier2;
            }
            ComposableLambda composableLambda2 = ComposableSingletons$ChaloToolBarKt.b;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1386041888, i4, -1, "app.chalo.compose.ChaloToolBar (ChaloToolBar.kt:125)");
            }
            function0 = (Function0) composerStartRestartGroup.consume(LocalBackHandlerKt.f1812a);
            if (imageUIState != null) {
                iconType = IconType.IC_ARROW_BACK;
            } else {
                iconType = IconType.IC_ARROW_BACK;
            }
            if (imageUIState != null) {
                strC = imageUIState.b;
            } else {
                strC = null;
            }
            if (strC == null) {
                composerStartRestartGroup.startReplaceGroup(546415462);
                strC = StringResourcesHelperKt.c(StringEnum.BACK_BUTTON, new Object[0], composerStartRestartGroup, 6);
                composerStartRestartGroup.endReplaceGroup();
            } else {
                composerStartRestartGroup.startReplaceGroup(546412858);
                composerStartRestartGroup.endReplaceGroup();
            }
            imageUISize = null;
            float f2 = state.f;
            long jC2 = ChaloColorTokenKt.c(toolbarUiSpecs.f10121a);
            boolean z4 = toolbarUiSpecs.e;
            if (imageUIState != null) {
                imageUISize = imageUIState.d;
            }
            ComposableLambda composableLambdaRememberComposableLambda3 = ComposableLambdaKt.rememberComposableLambda(1070991190, true, new um(state, 1), composerStartRestartGroup, 54);
            ComposableLambda composableLambdaRememberComposableLambda4 = ComposableLambdaKt.rememberComposableLambda(857661385, true, new d0(21, state, composableLambda2), composerStartRestartGroup, 54);
            if ((i4 & 14) == 4) {
                z2 = true;
            } else {
                z2 = false;
            }
            zChanged = composerStartRestartGroup.changed(function0) | z2;
            objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChanged) {
                objRememberedValue = new pm(state, function0, 2);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            } else {
                objRememberedValue = new pm(state, function0, 2);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            int i7 = ((i4 >> 3) & 14) | 1572912 | ((i4 << 15) & 234881024);
            Modifier modifier6 = modifier4;
            a(modifier6, composableLambdaRememberComposableLambda3, iconType, strC, f2, jC2, composableLambdaRememberComposableLambda4, (Function0) objRememberedValue, z4, imageUISize, composerStartRestartGroup, i7, 0, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            modifier3 = modifier6;
            function4 = composableLambda2;
        } else {
            composerStartRestartGroup.skipToGroupEnd();
            function4 = function3;
            modifier3 = modifier2;
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new v(state, modifier3, function4, i, i2, 9));
        }
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0042  */
    /* JADX WARN: Code duplicated, block: B:25:0x0047  */
    /* JADX WARN: Code duplicated, block: B:27:0x004b  */
    /* JADX WARN: Code duplicated, block: B:29:0x0053  */
    /* JADX WARN: Code duplicated, block: B:30:0x0056  */
    /* JADX WARN: Code duplicated, block: B:34:0x005d  */
    /* JADX WARN: Code duplicated, block: B:37:0x0065  */
    /* JADX WARN: Code duplicated, block: B:38:0x0067  */
    /* JADX WARN: Code duplicated, block: B:41:0x0070  */
    /* JADX WARN: Code duplicated, block: B:43:0x0078  */
    /* JADX WARN: Code duplicated, block: B:47:0x008b A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:48:0x008d  */
    /* JADX WARN: Code duplicated, block: B:49:0x0091  */
    /* JADX WARN: Code duplicated, block: B:51:0x0094  */
    /* JADX WARN: Code duplicated, block: B:52:0x009b  */
    /* JADX WARN: Code duplicated, block: B:56:0x00b5  */
    /* JADX WARN: Code duplicated, block: B:59:0x00ef  */
    /* JADX WARN: Code duplicated, block: B:61:0x00f9  */
    /* JADX WARN: Code duplicated, block: B:64:0x0108  */
    /* JADX WARN: Code duplicated, block: B:66:? A[RETURN, SYNTHETIC] */
    public static final void c(String title, int i, int i2, TextStyle textStyle, Composer composer, int i3, int i4) {
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        boolean z;
        Composer composer2;
        TextStyle textStyle2;
        int i10;
        int i11;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        int i12;
        int iM7225getClipgIe3tQ8;
        int i13;
        int i14;
        int i15;
        TextStyle displaySmall;
        Intrinsics.i(title, "title");
        Composer composerStartRestartGroup = composer.startRestartGroup(-1051855047);
        if ((i3 & 6) == 0) {
            i5 = (composerStartRestartGroup.changed(title) ? 4 : 2) | i3;
        } else {
            i5 = i3;
        }
        int i16 = i4 & 2;
        if (i16 == 0) {
            if ((i3 & 48) == 0) {
                i6 = i;
                i5 |= composerStartRestartGroup.changed(i6) ? 32 : 16;
            }
            i7 = i4 & 4;
            if (i7 != 0) {
                if ((i3 & 384) == 0) {
                    i8 = i2;
                    if (composerStartRestartGroup.changed(i8)) {
                        i9 = 256;
                    } else {
                        i9 = 128;
                    }
                    i5 |= i9;
                }
                if ((i3 & 3072) == 0) {
                    i5 |= 1024;
                }
                if ((i5 & 1171) != 1170) {
                    z = true;
                } else {
                    z = false;
                }
                if (composerStartRestartGroup.shouldExecute(z, i5 & 1)) {
                    composerStartRestartGroup.startDefaults();
                    if ((i3 & 1) != 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                        if (i16 != 0) {
                            i12 = Integer.MAX_VALUE;
                        } else {
                            i12 = i6;
                        }
                        if (i7 != 0) {
                            iM7225getClipgIe3tQ8 = TextOverflow.INSTANCE.m7225getClipgIe3tQ8();
                        } else {
                            iM7225getClipgIe3tQ8 = i8;
                        }
                        i13 = i5 & (-7169);
                        i14 = i12;
                        i15 = iM7225getClipgIe3tQ8;
                        displaySmall = ChaloTheme.e(composerStartRestartGroup, 6).getDisplaySmall();
                    } else {
                        composerStartRestartGroup.skipToGroupEnd();
                        i13 = i5 & (-7169);
                        displaySmall = textStyle;
                        i14 = i6;
                        i15 = i8;
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1051855047, i13, -1, "app.chalo.compose.ChaloToolBarDefaultTitleComponent (ChaloToolBar.kt:242)");
                    }
                    composer2 = composerStartRestartGroup;
                    TextKt.m2623TextNvy7gAk(title, null, ChaloTheme.a(composerStartRestartGroup, 6).e, null, 0L, null, null, null, 0L, null, null, 0L, i15, false, i14, 0, null, displaySmall, composer2, i13 & 14, (i13 & 896) | ((i13 << 9) & 57344), 110586);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    i11 = i15;
                    i10 = i14;
                    textStyle2 = displaySmall;
                } else {
                    composer2 = composerStartRestartGroup;
                    composer2.skipToGroupEnd();
                    textStyle2 = textStyle;
                    i10 = i6;
                    i11 = i8;
                }
                scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                    scopeUpdateScopeEndRestartGroup.updateScope(new nm(title, i10, i11, textStyle2, i3, i4));
                }
            }
            i5 |= 384;
            i8 = i2;
            if ((i3 & 3072) == 0) {
                i5 |= 1024;
            }
            if ((i5 & 1171) != 1170) {
                z = true;
            } else {
                z = false;
            }
            if (composerStartRestartGroup.shouldExecute(z, i5 & 1)) {
                composerStartRestartGroup.startDefaults();
                if ((i3 & 1) != 0) {
                    if (i16 != 0) {
                        i12 = Integer.MAX_VALUE;
                    } else {
                        i12 = i6;
                    }
                    if (i7 != 0) {
                        iM7225getClipgIe3tQ8 = TextOverflow.INSTANCE.m7225getClipgIe3tQ8();
                    } else {
                        iM7225getClipgIe3tQ8 = i8;
                    }
                    i13 = i5 & (-7169);
                    i14 = i12;
                    i15 = iM7225getClipgIe3tQ8;
                    displaySmall = ChaloTheme.e(composerStartRestartGroup, 6).getDisplaySmall();
                } else {
                    if (i16 != 0) {
                        i12 = Integer.MAX_VALUE;
                    } else {
                        i12 = i6;
                    }
                    if (i7 != 0) {
                        iM7225getClipgIe3tQ8 = TextOverflow.INSTANCE.m7225getClipgIe3tQ8();
                    } else {
                        iM7225getClipgIe3tQ8 = i8;
                    }
                    i13 = i5 & (-7169);
                    i14 = i12;
                    i15 = iM7225getClipgIe3tQ8;
                    displaySmall = ChaloTheme.e(composerStartRestartGroup, 6).getDisplaySmall();
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1051855047, i13, -1, "app.chalo.compose.ChaloToolBarDefaultTitleComponent (ChaloToolBar.kt:242)");
                }
                composer2 = composerStartRestartGroup;
                TextKt.m2623TextNvy7gAk(title, null, ChaloTheme.a(composerStartRestartGroup, 6).e, null, 0L, null, null, null, 0L, null, null, 0L, i15, false, i14, 0, null, displaySmall, composer2, i13 & 14, (i13 & 896) | ((i13 << 9) & 57344), 110586);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                i11 = i15;
                i10 = i14;
                textStyle2 = displaySmall;
            } else {
                composer2 = composerStartRestartGroup;
                composer2.skipToGroupEnd();
                textStyle2 = textStyle;
                i10 = i6;
                i11 = i8;
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new nm(title, i10, i11, textStyle2, i3, i4));
            }
        }
        i5 |= 48;
        i6 = i;
        i7 = i4 & 4;
        if (i7 != 0) {
            if ((i3 & 384) == 0) {
                i8 = i2;
                if (composerStartRestartGroup.changed(i8)) {
                    i9 = 256;
                } else {
                    i9 = 128;
                }
                i5 |= i9;
            }
            if ((i3 & 3072) == 0) {
                i5 |= 1024;
            }
            if ((i5 & 1171) != 1170) {
                z = true;
            } else {
                z = false;
            }
            if (composerStartRestartGroup.shouldExecute(z, i5 & 1)) {
                composerStartRestartGroup.startDefaults();
                if ((i3 & 1) != 0) {
                    if (i16 != 0) {
                        i12 = Integer.MAX_VALUE;
                    } else {
                        i12 = i6;
                    }
                    if (i7 != 0) {
                        iM7225getClipgIe3tQ8 = TextOverflow.INSTANCE.m7225getClipgIe3tQ8();
                    } else {
                        iM7225getClipgIe3tQ8 = i8;
                    }
                    i13 = i5 & (-7169);
                    i14 = i12;
                    i15 = iM7225getClipgIe3tQ8;
                    displaySmall = ChaloTheme.e(composerStartRestartGroup, 6).getDisplaySmall();
                } else {
                    if (i16 != 0) {
                        i12 = Integer.MAX_VALUE;
                    } else {
                        i12 = i6;
                    }
                    if (i7 != 0) {
                        iM7225getClipgIe3tQ8 = TextOverflow.INSTANCE.m7225getClipgIe3tQ8();
                    } else {
                        iM7225getClipgIe3tQ8 = i8;
                    }
                    i13 = i5 & (-7169);
                    i14 = i12;
                    i15 = iM7225getClipgIe3tQ8;
                    displaySmall = ChaloTheme.e(composerStartRestartGroup, 6).getDisplaySmall();
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1051855047, i13, -1, "app.chalo.compose.ChaloToolBarDefaultTitleComponent (ChaloToolBar.kt:242)");
                }
                composer2 = composerStartRestartGroup;
                TextKt.m2623TextNvy7gAk(title, null, ChaloTheme.a(composerStartRestartGroup, 6).e, null, 0L, null, null, null, 0L, null, null, 0L, i15, false, i14, 0, null, displaySmall, composer2, i13 & 14, (i13 & 896) | ((i13 << 9) & 57344), 110586);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                i11 = i15;
                i10 = i14;
                textStyle2 = displaySmall;
            } else {
                composer2 = composerStartRestartGroup;
                composer2.skipToGroupEnd();
                textStyle2 = textStyle;
                i10 = i6;
                i11 = i8;
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new nm(title, i10, i11, textStyle2, i3, i4));
            }
        }
        i5 |= 384;
        i8 = i2;
        if ((i3 & 3072) == 0) {
            i5 |= 1024;
        }
        if ((i5 & 1171) != 1170) {
            z = true;
        } else {
            z = false;
        }
        if (composerStartRestartGroup.shouldExecute(z, i5 & 1)) {
            composerStartRestartGroup.startDefaults();
            if ((i3 & 1) != 0) {
                if (i16 != 0) {
                    i12 = Integer.MAX_VALUE;
                } else {
                    i12 = i6;
                }
                if (i7 != 0) {
                    iM7225getClipgIe3tQ8 = TextOverflow.INSTANCE.m7225getClipgIe3tQ8();
                } else {
                    iM7225getClipgIe3tQ8 = i8;
                }
                i13 = i5 & (-7169);
                i14 = i12;
                i15 = iM7225getClipgIe3tQ8;
                displaySmall = ChaloTheme.e(composerStartRestartGroup, 6).getDisplaySmall();
            } else {
                if (i16 != 0) {
                    i12 = Integer.MAX_VALUE;
                } else {
                    i12 = i6;
                }
                if (i7 != 0) {
                    iM7225getClipgIe3tQ8 = TextOverflow.INSTANCE.m7225getClipgIe3tQ8();
                } else {
                    iM7225getClipgIe3tQ8 = i8;
                }
                i13 = i5 & (-7169);
                i14 = i12;
                i15 = iM7225getClipgIe3tQ8;
                displaySmall = ChaloTheme.e(composerStartRestartGroup, 6).getDisplaySmall();
            }
            composerStartRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1051855047, i13, -1, "app.chalo.compose.ChaloToolBarDefaultTitleComponent (ChaloToolBar.kt:242)");
            }
            composer2 = composerStartRestartGroup;
            TextKt.m2623TextNvy7gAk(title, null, ChaloTheme.a(composerStartRestartGroup, 6).e, null, 0L, null, null, null, 0L, null, null, 0L, i15, false, i14, 0, null, displaySmall, composer2, i13 & 14, (i13 & 896) | ((i13 << 9) & 57344), 110586);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            i11 = i15;
            i10 = i14;
            textStyle2 = displaySmall;
        } else {
            composer2 = composerStartRestartGroup;
            composer2.skipToGroupEnd();
            textStyle2 = textStyle;
            i10 = i6;
            i11 = i8;
        }
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new nm(title, i10, i11, textStyle2, i3, i4));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r15v1 */
    /* JADX WARN: Type inference failed for: r15v2, types: [int] */
    /* JADX WARN: Type inference failed for: r15v3 */
    public static final void d(ToolbarUIState state, Function3 function3, Composer composer, int i) {
        Function3 function4;
        boolean z;
        Function3 function5;
        Modifier.Companion companion;
        ?? r15;
        Throwable th;
        Intrinsics.i(state, "state");
        List list = state.e;
        ToolbarUiSpecs toolbarUiSpecs = state.f10119a;
        Composer composerStartRestartGroup = composer.startRestartGroup(1451147386);
        int i2 = ((i & 6) == 0 ? (composerStartRestartGroup.changed(state) ? 4 : 2) | i : i) | 48;
        if (composerStartRestartGroup.shouldExecute((i2 & 19) != 18, i2 & 1)) {
            ComposableLambda composableLambda = ComposableSingletons$ChaloToolBarKt.f1806a;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1451147386, i2, -1, "app.chalo.compose.ChaloToolBarNew (ChaloToolBar.kt:69)");
            }
            Function0 function0 = (Function0) composerStartRestartGroup.consume(LocalBackHandlerKt.f1812a);
            Modifier.Companion companion2 = Modifier.INSTANCE;
            Modifier modifierM264backgroundbw27NRU$default = BackgroundKt.m264backgroundbw27NRU$default(SizeKt.fillMaxWidth$default(companion2, 0.0f, 1, null), ChaloColorTokenKt.c(toolbarUiSpecs.f10121a), null, 2, null);
            Arrangement arrangement = Arrangement.INSTANCE;
            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(arrangement.getTop(), Alignment.INSTANCE.getStart(), composerStartRestartGroup, 0);
            long currentCompositeKeyHashCode = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
            int i3 = (int) (currentCompositeKeyHashCode ^ (currentCompositeKeyHashCode >>> 32));
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierM264backgroundbw27NRU$default);
            ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor = companion3.getConstructor();
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
            pk0.v(companion3, composerM3915constructorimpl, measurePolicyColumnMeasurePolicy, composerM3915constructorimpl, currentCompositionLocalMap);
            Updater.m3923setimpl(composerM3915constructorimpl, modifierMaterializeModifier, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion3, composerM3915constructorimpl, Integer.valueOf(i3), composerM3915constructorimpl));
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
            Modifier modifierC = ChaloThemeKt.c(companion2, toolbarUiSpecs.b);
            MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(arrangement.getStart(), UiAlignmentKt.b(toolbarUiSpecs.c), composerStartRestartGroup, 0);
            long currentCompositeKeyHashCode2 = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
            int i4 = (int) ((currentCompositeKeyHashCode2 >>> 32) ^ currentCompositeKeyHashCode2);
            CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierC);
            Function0<ComposeUiNode> constructor2 = companion3.getConstructor();
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
            pk0.v(companion3, composerM3915constructorimpl2, measurePolicyRowMeasurePolicy, composerM3915constructorimpl2, currentCompositionLocalMap2);
            Updater.m3923setimpl(composerM3915constructorimpl2, modifierMaterializeModifier2, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion3, composerM3915constructorimpl2, Integer.valueOf(i4), composerM3915constructorimpl2));
            RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
            ImageUIState imageUIState = state.c;
            if (imageUIState == null) {
                composerStartRestartGroup.startReplaceGroup(-1376036216);
                composerStartRestartGroup.endReplaceGroup();
                function5 = composableLambda;
                companion = companion2;
                th = null;
                r15 = 1;
            } else {
                composerStartRestartGroup.startReplaceGroup(-1376036215);
                boolean zChanged = composerStartRestartGroup.changed(function0) | ((i2 & 14) == 4);
                Object objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    z = true;
                    objRememberedValue = new pm(state, function0, 1);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                } else {
                    z = true;
                }
                function5 = composableLambda;
                companion = companion2;
                r15 = z;
                th = null;
                IconButtonKt.IconButton((Function0) objRememberedValue, null, false, null, null, null, ComposableLambdaKt.rememberComposableLambda(-119648053, z, new sm(imageUIState, 0), composerStartRestartGroup, 54), composerStartRestartGroup, 1572864, 62);
                composerStartRestartGroup.endReplaceGroup();
            }
            TextUIState textUIState = state.b;
            if (textUIState == null) {
                composerStartRestartGroup.startReplaceGroup(-1375703927);
            } else {
                composerStartRestartGroup.startReplaceGroup(-1375703926);
                SpacerKt.Spacer(SizeKt.m833width3ABfNKs(companion, toolbarUiSpecs.d), composerStartRestartGroup, 0);
                app.chalo.compose.components.TextKt.c(textUIState, i41.a(rowScopeInstance, companion, 1.0f, false, 2, null), null, null, composerStartRestartGroup, 0, 12);
            }
            composerStartRestartGroup.endReplaceGroup();
            composerStartRestartGroup.startReplaceGroup(-2122580712);
            int i5 = 0;
            for (Object obj : list) {
                int i6 = i5 + 1;
                if (i5 < 0) {
                    CollectionsKt.z0();
                    throw th;
                }
                Function3 function6 = function5;
                function6.invoke((ToolbarBaseActionUIState) obj, composerStartRestartGroup, Integer.valueOf(i2 & 112));
                if (i5 < CollectionsKt.K(list)) {
                    composerStartRestartGroup.startReplaceGroup(1758851761);
                    ChaloSpacersKt.a(ChaloTheme.b(composerStartRestartGroup, 6).d, composerStartRestartGroup, 0);
                } else {
                    composerStartRestartGroup.startReplaceGroup(1754839710);
                }
                composerStartRestartGroup.endReplaceGroup();
                i5 = i6;
                function5 = function6;
            }
            function4 = function5;
            composerStartRestartGroup.endReplaceGroup();
            composerStartRestartGroup.endNode();
            DividerUIState dividerUIState = state.g;
            if (dividerUIState == null) {
                composerStartRestartGroup.startReplaceGroup(1800936774);
            } else {
                composerStartRestartGroup.startReplaceGroup(1800936775);
                SpacerKt.Spacer(SizeKt.m814height3ABfNKs(SizeKt.fillMaxWidth$default(BackgroundKt.m264backgroundbw27NRU$default(Modifier.INSTANCE, ChaloColorTokenKt.c(dividerUIState.b), null, 2, null), 0.0f, r15, th), dividerUIState.f10017a), composerStartRestartGroup, 0);
            }
            composerStartRestartGroup.endReplaceGroup();
            composerStartRestartGroup.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
            function4 = function3;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new fj(state, function4, i, 19));
        }
    }

    public static final void e(ToolbarUIState state, Composer composer, int i) {
        int i2;
        Intrinsics.i(state, "state");
        Composer composerStartRestartGroup = composer.startRestartGroup(-427207194);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changed(state) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        int i3 = 6;
        if (composerStartRestartGroup.shouldExecute((i2 & 3) != 2, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-427207194, i2, -1, "app.chalo.compose.ChaloToolBarNewUI (ChaloToolBar.kt:408)");
            }
            Function0 function0 = (Function0) composerStartRestartGroup.consume(LocalBackHandlerKt.f1812a);
            Modifier.Companion companion = Modifier.INSTANCE;
            Modifier modifierM785paddingVpY3zN4 = PaddingKt.m785paddingVpY3zN4(companion, ChaloTheme.b(composerStartRestartGroup, 6).h, ChaloTheme.b(composerStartRestartGroup, 6).B);
            MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), Alignment.INSTANCE.getCenterVertically(), composerStartRestartGroup, 48);
            long currentCompositeKeyHashCode = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
            int i4 = (int) (currentCompositeKeyHashCode ^ (currentCompositeKeyHashCode >>> 32));
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierM785paddingVpY3zN4);
            ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor = companion2.getConstructor();
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
            pk0.v(companion2, composerM3915constructorimpl, measurePolicyRowMeasurePolicy, composerM3915constructorimpl, currentCompositionLocalMap);
            Updater.m3923setimpl(composerM3915constructorimpl, modifierMaterializeModifier, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion2, composerM3915constructorimpl, Integer.valueOf(i4), composerM3915constructorimpl));
            RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
            int i5 = i2;
            ImageUIState imageUIState = state.c;
            if (imageUIState == null) {
                composerStartRestartGroup.startReplaceGroup(-1238592542);
            } else {
                composerStartRestartGroup.startReplaceGroup(-1238592541);
                boolean zChanged = composerStartRestartGroup.changed(function0) | ((i5 & 14) == 4);
                Object objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = new pm(state, function0, 0);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                CommonImageKt.a(imageUIState, ClickableKt.m299clickableoSLSa3U$default(companion, false, null, null, null, (Function0) objRememberedValue, 15, null), false, composerStartRestartGroup, 0, 4);
            }
            composerStartRestartGroup.endReplaceGroup();
            TextUIState textUIState = state.b;
            if (textUIState == null) {
                composerStartRestartGroup.startReplaceGroup(-1238201043);
            } else {
                composerStartRestartGroup.startReplaceGroup(-1238201042);
                ChaloSpacersKt.y(composerStartRestartGroup, 0);
                app.chalo.compose.components.TextKt.c(textUIState, null, null, null, composerStartRestartGroup, 0, 14);
                composerStartRestartGroup = composerStartRestartGroup;
            }
            composerStartRestartGroup.endReplaceGroup();
            composerStartRestartGroup.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new mk(state, i, i3));
        }
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0045  */
    /* JADX WARN: Code duplicated, block: B:24:0x0047  */
    /* JADX WARN: Code duplicated, block: B:27:0x0050 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:28:0x0052  */
    /* JADX WARN: Code duplicated, block: B:29:0x0055  */
    /* JADX WARN: Code duplicated, block: B:32:0x005c  */
    /* JADX WARN: Code duplicated, block: B:39:0x006d  */
    /* JADX WARN: Code duplicated, block: B:42:0x0076  */
    /* JADX WARN: Code duplicated, block: B:43:0x0081  */
    /* JADX WARN: Code duplicated, block: B:47:0x0099  */
    /* JADX WARN: Code duplicated, block: B:51:0x00ef  */
    /* JADX WARN: Code duplicated, block: B:53:0x00f4  */
    /* JADX WARN: Code duplicated, block: B:56:0x00ff  */
    /* JADX WARN: Code duplicated, block: B:58:? A[RETURN, SYNTHETIC] */
    public static final void f(ToolbarUIState state, Function2 function2, Composer composer, int i, int i2) {
        int i3;
        Function2 function3;
        boolean z;
        Composer composer2;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Function2 function4;
        ImageUIState imageUIState;
        IconType iconType;
        UiEventHandler uiEventHandler;
        boolean zChangedInstance;
        Object objRememberedValue;
        KFunction kFunction;
        Intrinsics.i(state, "state");
        Composer composerStartRestartGroup = composer.startRestartGroup(-762031062);
        if ((i & 6) == 0) {
            i3 = i | (composerStartRestartGroup.changed(state) ? 4 : 2);
        } else {
            i3 = i;
        }
        int i4 = i2 & 2;
        if (i4 == 0) {
            if ((i & 48) == 0) {
                function3 = function2;
                i3 |= composerStartRestartGroup.changedInstance(function3) ? 32 : 16;
            }
            if ((i3 & 19) != 18) {
                z = true;
            } else {
                z = false;
            }
            if (composerStartRestartGroup.shouldExecute(z, i3 & 1)) {
                if (i4 != 0) {
                    function4 = ComposableSingletons$ChaloToolBarKt.e;
                } else {
                    function4 = function3;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-762031062, i3, -1, "app.chalo.compose.ChaloToolBarUIWithRightComponent (ChaloToolBar.kt:442)");
                }
                imageUIState = state.c;
                if (imageUIState != null || (iconType = imageUIState.f10035a) == null) {
                    iconType = IconType.IC_ARROW_BACK;
                }
                IconType iconType2 = iconType;
                float f = state.f;
                uiEventHandler = state.d;
                if (uiEventHandler == null) {
                    composerStartRestartGroup.startReplaceGroup(1530227428);
                    composerStartRestartGroup.endReplaceGroup();
                    kFunction = null;
                } else {
                    composerStartRestartGroup.startReplaceGroup(1530227429);
                    zChangedInstance = composerStartRestartGroup.changedInstance(uiEventHandler);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                        ChaloToolBarKt$ChaloToolBarUIWithRightComponent$1$1$1 chaloToolBarKt$ChaloToolBarUIWithRightComponent$1$1$1 = new ChaloToolBarKt$ChaloToolBarUIWithRightComponent$1$1$1(0, uiEventHandler, UiEventHandler.class, "onClick", "onClick()V", 0);
                        composerStartRestartGroup.updateRememberedValue(chaloToolBarKt$ChaloToolBarUIWithRightComponent$1$1$1);
                        objRememberedValue = chaloToolBarKt$ChaloToolBarUIWithRightComponent$1$1$1;
                    }
                    kFunction = (KFunction) objRememberedValue;
                    composerStartRestartGroup.endReplaceGroup();
                }
                composer2 = composerStartRestartGroup;
                a(null, ComposableLambdaKt.rememberComposableLambda(-1582665548, true, new um(state, 0), composerStartRestartGroup, 54), iconType2, null, f, ChaloColorTokenKt.c(state.h), ComposableLambdaKt.rememberComposableLambda(-697964511, true, new vm(0, function4), composerStartRestartGroup, 54), (Function0) kFunction, false, null, composer2, 1572912, 0, 1801);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                function3 = function4;
            } else {
                composer2 = composerStartRestartGroup;
                composer2.skipToGroupEnd();
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new z(i, i2, 10, state, function3));
            }
        }
        i3 |= 48;
        function3 = function2;
        if ((i3 & 19) != 18) {
            z = true;
        } else {
            z = false;
        }
        if (composerStartRestartGroup.shouldExecute(z, i3 & 1)) {
            if (i4 != 0) {
                function4 = ComposableSingletons$ChaloToolBarKt.e;
            } else {
                function4 = function3;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-762031062, i3, -1, "app.chalo.compose.ChaloToolBarUIWithRightComponent (ChaloToolBar.kt:442)");
            }
            imageUIState = state.c;
            if (imageUIState != null) {
                iconType = IconType.IC_ARROW_BACK;
            } else {
                iconType = IconType.IC_ARROW_BACK;
            }
            IconType iconType3 = iconType;
            float f2 = state.f;
            uiEventHandler = state.d;
            if (uiEventHandler == null) {
                composerStartRestartGroup.startReplaceGroup(1530227428);
                composerStartRestartGroup.endReplaceGroup();
                kFunction = null;
            } else {
                composerStartRestartGroup.startReplaceGroup(1530227429);
                zChangedInstance = composerStartRestartGroup.changedInstance(uiEventHandler);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (zChangedInstance) {
                    ChaloToolBarKt$ChaloToolBarUIWithRightComponent$1$1$1 chaloToolBarKt$ChaloToolBarUIWithRightComponent$1$1$2 = new ChaloToolBarKt$ChaloToolBarUIWithRightComponent$1$1$1(0, uiEventHandler, UiEventHandler.class, "onClick", "onClick()V", 0);
                    composerStartRestartGroup.updateRememberedValue(chaloToolBarKt$ChaloToolBarUIWithRightComponent$1$1$2);
                    objRememberedValue = chaloToolBarKt$ChaloToolBarUIWithRightComponent$1$1$2;
                } else {
                    ChaloToolBarKt$ChaloToolBarUIWithRightComponent$1$1$1 chaloToolBarKt$ChaloToolBarUIWithRightComponent$1$1$3 = new ChaloToolBarKt$ChaloToolBarUIWithRightComponent$1$1$1(0, uiEventHandler, UiEventHandler.class, "onClick", "onClick()V", 0);
                    composerStartRestartGroup.updateRememberedValue(chaloToolBarKt$ChaloToolBarUIWithRightComponent$1$1$3);
                    objRememberedValue = chaloToolBarKt$ChaloToolBarUIWithRightComponent$1$1$3;
                }
                kFunction = (KFunction) objRememberedValue;
                composerStartRestartGroup.endReplaceGroup();
            }
            composer2 = composerStartRestartGroup;
            a(null, ComposableLambdaKt.rememberComposableLambda(-1582665548, true, new um(state, 0), composerStartRestartGroup, 54), iconType3, null, f2, ChaloColorTokenKt.c(state.h), ComposableLambdaKt.rememberComposableLambda(-697964511, true, new vm(0, function4), composerStartRestartGroup, 54), (Function0) kFunction, false, null, composer2, 1572912, 0, 1801);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            function3 = function4;
        } else {
            composer2 = composerStartRestartGroup;
            composer2.skipToGroupEnd();
        }
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new z(i, i2, 10, state, function3));
        }
    }

    /* JADX WARN: Code duplicated, block: B:30:0x0055  */
    /* JADX WARN: Code duplicated, block: B:33:0x005e  */
    /* JADX WARN: Code duplicated, block: B:34:0x0060  */
    /* JADX WARN: Code duplicated, block: B:37:0x0069  */
    /* JADX WARN: Code duplicated, block: B:44:0x0081 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:45:0x0083  */
    /* JADX WARN: Code duplicated, block: B:49:0x009d  */
    /* JADX WARN: Code duplicated, block: B:53:0x00db  */
    /* JADX WARN: Code duplicated, block: B:56:0x00e7  */
    /* JADX WARN: Code duplicated, block: B:57:0x00eb  */
    /* JADX WARN: Code duplicated, block: B:62:0x011c  */
    /* JADX WARN: Code duplicated, block: B:65:0x0190  */
    /* JADX WARN: Code duplicated, block: B:68:0x0197  */
    /* JADX WARN: Code duplicated, block: B:71:0x01a5  */
    /* JADX WARN: Code duplicated, block: B:73:? A[RETURN, SYNTHETIC] */
    public static final void g(Modifier modifier, String title, long j, String str, Composer composer, int i, int i2) {
        int i3;
        long sp;
        boolean z;
        Composer composer2;
        String str2;
        long j2;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        String strC;
        int i4;
        Function0 function0;
        Function0<ComposeUiNode> constructor;
        boolean zChanged;
        Object objRememberedValue;
        Intrinsics.i(title, "title");
        Composer composerStartRestartGroup = composer.startRestartGroup(653335639);
        if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changed(modifier) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changed(title) ? 32 : 16;
        }
        int i5 = i2 & 4;
        if (i5 == 0) {
            if ((i & 384) == 0) {
                sp = j;
                i3 |= composerStartRestartGroup.changed(sp) ? 256 : 128;
            }
            if ((i & 3072) == 0) {
                i3 |= 1024;
            }
            if ((i3 & 1171) != 1170) {
                z = true;
            } else {
                z = false;
            }
            if (composerStartRestartGroup.shouldExecute(z, i3 & 1)) {
                composerStartRestartGroup.startDefaults();
                if ((i & 1) != 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                    if (i5 != 0) {
                        sp = TextUnitKt.getSp(24);
                    }
                    strC = StringResourcesHelperKt.c(StringEnum.BACK_BUTTON, new Object[0], composerStartRestartGroup, 6);
                    i4 = i3 & (-7169);
                } else {
                    composerStartRestartGroup.skipToGroupEnd();
                    i4 = i3 & (-7169);
                    strC = str;
                }
                long j3 = sp;
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(653335639, i4, -1, "app.chalo.compose.ChaloToolbarComponent (ChaloToolBar.kt:258)");
                }
                function0 = (Function0) composerStartRestartGroup.consume(LocalBackHandlerKt.f1812a);
                MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), Alignment.INSTANCE.getCenterVertically(), composerStartRestartGroup, 48);
                long currentCompositeKeyHashCode = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
                int i6 = (int) (currentCompositeKeyHashCode ^ (currentCompositeKeyHashCode >>> 32));
                CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifier);
                ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
                constructor = companion.getConstructor();
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
                Updater.m3923setimpl(composerM3915constructorimpl, modifierMaterializeModifier, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion, composerM3915constructorimpl, Integer.valueOf(i6), composerM3915constructorimpl));
                RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
                Painter painterA = PainterResourceHelperKt.a(IconType.IC_ARROW_BACK_BLACK, composerStartRestartGroup, 6);
                Modifier.Companion companion2 = Modifier.INSTANCE;
                zChanged = composerStartRestartGroup.changed(function0);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = new fk(function0, 7);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                int i7 = i4;
                IconKt.m2070Iconww6aTOc(painterA, strC, ClickableKt.m299clickableoSLSa3U$default(companion2, false, null, null, null, (Function0) objRememberedValue, 15, null), 0L, composerStartRestartGroup, Painter.$stable, 8);
                String str3 = strC;
                ChaloSpacersKt.y(composerStartRestartGroup, 0);
                composer2 = composerStartRestartGroup;
                sp = j3;
                TextKt.m2623TextNvy7gAk(title, null, 0L, null, sp, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ChaloTypographyKt.a(ChaloTheme.e(composerStartRestartGroup, 6).getDisplaySmall()), composer2, ((i7 >> 3) & 14) | ((i7 << 6) & 57344), 0, 131054);
                composer2.endNode();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                str2 = str3;
            } else {
                composer2 = composerStartRestartGroup;
                composer2.skipToGroupEnd();
                str2 = str;
            }
            j2 = sp;
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new qm(modifier, title, j2, str2, i, i2));
            }
        }
        i3 |= 384;
        sp = j;
        if ((i & 3072) == 0) {
            i3 |= 1024;
        }
        if ((i3 & 1171) != 1170) {
            z = true;
        } else {
            z = false;
        }
        if (composerStartRestartGroup.shouldExecute(z, i3 & 1)) {
            composerStartRestartGroup.startDefaults();
            if ((i & 1) != 0) {
                if (i5 != 0) {
                    sp = TextUnitKt.getSp(24);
                }
                strC = StringResourcesHelperKt.c(StringEnum.BACK_BUTTON, new Object[0], composerStartRestartGroup, 6);
                i4 = i3 & (-7169);
            } else {
                if (i5 != 0) {
                    sp = TextUnitKt.getSp(24);
                }
                strC = StringResourcesHelperKt.c(StringEnum.BACK_BUTTON, new Object[0], composerStartRestartGroup, 6);
                i4 = i3 & (-7169);
            }
            long j4 = sp;
            composerStartRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(653335639, i4, -1, "app.chalo.compose.ChaloToolbarComponent (ChaloToolBar.kt:258)");
            }
            function0 = (Function0) composerStartRestartGroup.consume(LocalBackHandlerKt.f1812a);
            MeasurePolicy measurePolicyRowMeasurePolicy2 = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), Alignment.INSTANCE.getCenterVertically(), composerStartRestartGroup, 48);
            long currentCompositeKeyHashCode2 = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
            int i8 = (int) (currentCompositeKeyHashCode2 ^ (currentCompositeKeyHashCode2 >>> 32));
            CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifier);
            ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
            constructor = companion3.getConstructor();
            if (composerStartRestartGroup.getApplier() == null) {
                ComposablesKt.invalidApplier();
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.createNode(constructor);
            } else {
                composerStartRestartGroup.useNode();
            }
            Composer composerM3915constructorimpl2 = Updater.m3915constructorimpl(composerStartRestartGroup);
            pk0.v(companion3, composerM3915constructorimpl2, measurePolicyRowMeasurePolicy2, composerM3915constructorimpl2, currentCompositionLocalMap2);
            Updater.m3923setimpl(composerM3915constructorimpl2, modifierMaterializeModifier2, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion3, composerM3915constructorimpl2, Integer.valueOf(i8), composerM3915constructorimpl2));
            RowScopeInstance rowScopeInstance2 = RowScopeInstance.INSTANCE;
            Painter painterA2 = PainterResourceHelperKt.a(IconType.IC_ARROW_BACK_BLACK, composerStartRestartGroup, 6);
            Modifier.Companion companion4 = Modifier.INSTANCE;
            zChanged = composerStartRestartGroup.changed(function0);
            objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChanged) {
                objRememberedValue = new fk(function0, 7);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            } else {
                objRememberedValue = new fk(function0, 7);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            int i9 = i4;
            IconKt.m2070Iconww6aTOc(painterA2, strC, ClickableKt.m299clickableoSLSa3U$default(companion4, false, null, null, null, (Function0) objRememberedValue, 15, null), 0L, composerStartRestartGroup, Painter.$stable, 8);
            String str4 = strC;
            ChaloSpacersKt.y(composerStartRestartGroup, 0);
            composer2 = composerStartRestartGroup;
            sp = j4;
            TextKt.m2623TextNvy7gAk(title, null, 0L, null, sp, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ChaloTypographyKt.a(ChaloTheme.e(composerStartRestartGroup, 6).getDisplaySmall()), composer2, ((i9 >> 3) & 14) | ((i9 << 6) & 57344), 0, 131054);
            composer2.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            str2 = str4;
        } else {
            composer2 = composerStartRestartGroup;
            composer2.skipToGroupEnd();
            str2 = str;
        }
        j2 = sp;
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new qm(modifier, title, j2, str2, i, i2));
        }
    }

    public static final void h(ToolbarBaseActionUIState state, Modifier modifier, Composer composer, int i) {
        int i2;
        Intrinsics.i(state, "state");
        Composer composerStartRestartGroup = composer.startRestartGroup(797550220);
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
                ComposerKt.traceEventStart(797550220, i2, -1, "app.chalo.compose.StandardToolbarAction (ChaloToolBar.kt:292)");
            }
            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
            long currentCompositeKeyHashCode = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
            int i3 = (int) ((currentCompositeKeyHashCode >>> 32) ^ currentCompositeKeyHashCode);
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifier);
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
            pk0.v(companion, composerM3915constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy, composerM3915constructorimpl, currentCompositionLocalMap);
            Updater.m3923setimpl(composerM3915constructorimpl, modifierMaterializeModifier, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion, composerM3915constructorimpl, Integer.valueOf(i3), composerM3915constructorimpl));
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            if (state instanceof ToolbarBaseActionUIState.DropDownAction) {
                composerStartRestartGroup.startReplaceGroup(1720581102);
                j((ToolbarBaseActionUIState.DropDownAction) state, null, composerStartRestartGroup, i2 & 14);
                composerStartRestartGroup.endReplaceGroup();
            } else if (state instanceof ToolbarActionsUIState) {
                composerStartRestartGroup.startReplaceGroup(1720583309);
                i((ToolbarActionsUIState) state, null, composerStartRestartGroup, i2 & 14, 2);
                composerStartRestartGroup.endReplaceGroup();
            } else {
                if (!(state instanceof ToolbarBaseActionUIState.IconAndTextUIState)) {
                    throw pk0.p(composerStartRestartGroup, 1720579042);
                }
                composerStartRestartGroup.startReplaceGroup(1720586193);
                k((ToolbarBaseActionUIState.IconAndTextUIState) state, null, composerStartRestartGroup, i2 & 14);
                composerStartRestartGroup.endReplaceGroup();
            }
            composerStartRestartGroup.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new fj(state, modifier, false, i, 18));
        }
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0046  */
    /* JADX WARN: Code duplicated, block: B:24:0x0048  */
    /* JADX WARN: Code duplicated, block: B:27:0x0051 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:28:0x0053  */
    /* JADX WARN: Code duplicated, block: B:29:0x0057  */
    /* JADX WARN: Code duplicated, block: B:32:0x005e  */
    /* JADX WARN: Code duplicated, block: B:35:0x0068  */
    /* JADX WARN: Code duplicated, block: B:39:0x0084  */
    /* JADX WARN: Code duplicated, block: B:41:0x00b3  */
    /* JADX WARN: Code duplicated, block: B:43:0x00b8  */
    /* JADX WARN: Code duplicated, block: B:47:0x00f8  */
    /* JADX WARN: Code duplicated, block: B:50:0x0131  */
    /* JADX WARN: Code duplicated, block: B:53:0x013e  */
    /* JADX WARN: Code duplicated, block: B:54:0x0142  */
    /* JADX WARN: Code duplicated, block: B:57:0x014c  */
    /* JADX WARN: Code duplicated, block: B:59:? A[RETURN, SYNTHETIC] */
    public static final void i(ToolbarActionsUIState state, Modifier modifier, Composer composer, int i, int i2) {
        int i3;
        Modifier modifier2;
        boolean z;
        Modifier modifier3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Modifier modifier4;
        UiEventHandler uiEventHandler;
        boolean zChangedInstance;
        Object objRememberedValue;
        UiEventHandler uiEventHandler2;
        boolean zChangedInstance2;
        Object objRememberedValue2;
        Intrinsics.i(state, "state");
        ToolbarActionSpec toolbarActionSpec = state.d;
        Composer composerStartRestartGroup = composer.startRestartGroup(1963643787);
        if ((i & 6) == 0) {
            i3 = i | (composerStartRestartGroup.changed(state) ? 4 : 2);
        } else {
            i3 = i;
        }
        int i4 = i2 & 2;
        if (i4 == 0) {
            if ((i & 48) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 32 : 16;
            }
            if ((i3 & 19) != 18) {
                z = true;
            } else {
                z = false;
            }
            if (composerStartRestartGroup.shouldExecute(z, i3 & 1)) {
                if (i4 != 0) {
                    modifier4 = Modifier.INSTANCE;
                } else {
                    modifier4 = modifier2;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1963643787, i3, -1, "app.chalo.compose.ToolbarDisplayAction (ChaloToolBar.kt:379)");
                }
                if (state.b != null) {
                    composerStartRestartGroup.startReplaceGroup(1457617075);
                    ImageUIState imageUIState = state.b;
                    uiEventHandler2 = state.f10116a;
                    zChangedInstance2 = composerStartRestartGroup.changedInstance(uiEventHandler2);
                    objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                    if (zChangedInstance2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                        ChaloToolBarKt$ToolbarDisplayAction$1$1 chaloToolBarKt$ToolbarDisplayAction$1$1 = new ChaloToolBarKt$ToolbarDisplayAction$1$1(0, uiEventHandler2, UiEventHandler.class, "onClick", "onClick()V", 0);
                        composerStartRestartGroup.updateRememberedValue(chaloToolBarKt$ToolbarDisplayAction$1$1);
                        objRememberedValue2 = chaloToolBarKt$ToolbarDisplayAction$1$1;
                    }
                    Modifier modifierM299clickableoSLSa3U$default = ClickableKt.m299clickableoSLSa3U$default(modifier4, false, null, null, null, (Function0) ((KFunction) objRememberedValue2), 15, null);
                    modifier3 = modifier4;
                    CommonImageKt.a(imageUIState, modifierM299clickableoSLSa3U$default, false, composerStartRestartGroup, 0, 4);
                    composerStartRestartGroup.endReplaceGroup();
                } else {
                    modifier3 = modifier4;
                    if (state.c != null) {
                        composerStartRestartGroup.startReplaceGroup(1457824403);
                        TextUIState.ChaloTextUIState chaloTextUIState = state.c;
                        ChaloColorToken chaloColorToken = toolbarActionSpec.b;
                        BorderUISpec borderUISpec = toolbarActionSpec.d;
                        Modifier modifierM275borderxT4_qwU = BorderKt.m275borderxT4_qwU(BackgroundKt.m263backgroundbw27NRU(modifier3, ChaloColorTokenKt.c(chaloColorToken), ChaloThemeKt.d(toolbarActionSpec.c)), borderUISpec.f9753a, ChaloColorTokenKt.c(borderUISpec.b), ChaloThemeKt.d(borderUISpec.c));
                        uiEventHandler = state.f10116a;
                        zChangedInstance = composerStartRestartGroup.changedInstance(uiEventHandler);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            ChaloToolBarKt$ToolbarDisplayAction$2$1 chaloToolBarKt$ToolbarDisplayAction$2$1 = new ChaloToolBarKt$ToolbarDisplayAction$2$1(0, uiEventHandler, UiEventHandler.class, "onClick", "onClick()V", 0);
                            composerStartRestartGroup.updateRememberedValue(chaloToolBarKt$ToolbarDisplayAction$2$1);
                            objRememberedValue = chaloToolBarKt$ToolbarDisplayAction$2$1;
                        }
                        app.chalo.compose.components.TextKt.c(chaloTextUIState, ChaloThemeKt.c(ClickableKt.m299clickableoSLSa3U$default(modifierM275borderxT4_qwU, false, null, null, null, (Function0) ((KFunction) objRememberedValue), 15, null), toolbarActionSpec.f10115a), null, null, composerStartRestartGroup, 0, 12);
                        composerStartRestartGroup = composerStartRestartGroup;
                    } else {
                        composerStartRestartGroup.startReplaceGroup(1444590007);
                    }
                    composerStartRestartGroup.endReplaceGroup();
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                modifier3 = modifier2;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new z(state, modifier3, i, i2, 11));
            }
        }
        i3 |= 48;
        modifier2 = modifier;
        if ((i3 & 19) != 18) {
            z = true;
        } else {
            z = false;
        }
        if (composerStartRestartGroup.shouldExecute(z, i3 & 1)) {
            if (i4 != 0) {
                modifier4 = Modifier.INSTANCE;
            } else {
                modifier4 = modifier2;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1963643787, i3, -1, "app.chalo.compose.ToolbarDisplayAction (ChaloToolBar.kt:379)");
            }
            if (state.b != null) {
                composerStartRestartGroup.startReplaceGroup(1457617075);
                ImageUIState imageUIState2 = state.b;
                uiEventHandler2 = state.f10116a;
                zChangedInstance2 = composerStartRestartGroup.changedInstance(uiEventHandler2);
                objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                if (zChangedInstance2) {
                    ChaloToolBarKt$ToolbarDisplayAction$1$1 chaloToolBarKt$ToolbarDisplayAction$1$2 = new ChaloToolBarKt$ToolbarDisplayAction$1$1(0, uiEventHandler2, UiEventHandler.class, "onClick", "onClick()V", 0);
                    composerStartRestartGroup.updateRememberedValue(chaloToolBarKt$ToolbarDisplayAction$1$2);
                    objRememberedValue2 = chaloToolBarKt$ToolbarDisplayAction$1$2;
                } else {
                    ChaloToolBarKt$ToolbarDisplayAction$1$1 chaloToolBarKt$ToolbarDisplayAction$1$3 = new ChaloToolBarKt$ToolbarDisplayAction$1$1(0, uiEventHandler2, UiEventHandler.class, "onClick", "onClick()V", 0);
                    composerStartRestartGroup.updateRememberedValue(chaloToolBarKt$ToolbarDisplayAction$1$3);
                    objRememberedValue2 = chaloToolBarKt$ToolbarDisplayAction$1$3;
                }
                Modifier modifierM299clickableoSLSa3U$default2 = ClickableKt.m299clickableoSLSa3U$default(modifier4, false, null, null, null, (Function0) ((KFunction) objRememberedValue2), 15, null);
                modifier3 = modifier4;
                CommonImageKt.a(imageUIState2, modifierM299clickableoSLSa3U$default2, false, composerStartRestartGroup, 0, 4);
                composerStartRestartGroup.endReplaceGroup();
            } else {
                modifier3 = modifier4;
                if (state.c != null) {
                    composerStartRestartGroup.startReplaceGroup(1457824403);
                    TextUIState.ChaloTextUIState chaloTextUIState2 = state.c;
                    ChaloColorToken chaloColorToken2 = toolbarActionSpec.b;
                    BorderUISpec borderUISpec2 = toolbarActionSpec.d;
                    Modifier modifierM275borderxT4_qwU2 = BorderKt.m275borderxT4_qwU(BackgroundKt.m263backgroundbw27NRU(modifier3, ChaloColorTokenKt.c(chaloColorToken2), ChaloThemeKt.d(toolbarActionSpec.c)), borderUISpec2.f9753a, ChaloColorTokenKt.c(borderUISpec2.b), ChaloThemeKt.d(borderUISpec2.c));
                    uiEventHandler = state.f10116a;
                    zChangedInstance = composerStartRestartGroup.changedInstance(uiEventHandler);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (zChangedInstance) {
                        ChaloToolBarKt$ToolbarDisplayAction$2$1 chaloToolBarKt$ToolbarDisplayAction$2$2 = new ChaloToolBarKt$ToolbarDisplayAction$2$1(0, uiEventHandler, UiEventHandler.class, "onClick", "onClick()V", 0);
                        composerStartRestartGroup.updateRememberedValue(chaloToolBarKt$ToolbarDisplayAction$2$2);
                        objRememberedValue = chaloToolBarKt$ToolbarDisplayAction$2$2;
                    } else {
                        ChaloToolBarKt$ToolbarDisplayAction$2$1 chaloToolBarKt$ToolbarDisplayAction$2$3 = new ChaloToolBarKt$ToolbarDisplayAction$2$1(0, uiEventHandler, UiEventHandler.class, "onClick", "onClick()V", 0);
                        composerStartRestartGroup.updateRememberedValue(chaloToolBarKt$ToolbarDisplayAction$2$3);
                        objRememberedValue = chaloToolBarKt$ToolbarDisplayAction$2$3;
                    }
                    app.chalo.compose.components.TextKt.c(chaloTextUIState2, ChaloThemeKt.c(ClickableKt.m299clickableoSLSa3U$default(modifierM275borderxT4_qwU2, false, null, null, null, (Function0) ((KFunction) objRememberedValue), 15, null), toolbarActionSpec.f10115a), null, null, composerStartRestartGroup, 0, 12);
                    composerStartRestartGroup = composerStartRestartGroup;
                } else {
                    composerStartRestartGroup.startReplaceGroup(1444590007);
                }
                composerStartRestartGroup.endReplaceGroup();
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
            modifier3 = modifier2;
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new z(state, modifier3, i, i2, 11));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void j(ToolbarBaseActionUIState.DropDownAction state, Modifier modifier, Composer composer, int i) {
        int i2;
        Composer composer2;
        Modifier modifier2;
        Intrinsics.i(state, "state");
        Composer composerStartRestartGroup = composer.startRestartGroup(1874554862);
        if ((i & 6) == 0) {
            i2 = i | (composerStartRestartGroup.changed(state) ? 4 : 2);
        } else {
            i2 = i;
        }
        if (composerStartRestartGroup.shouldExecute((i2 & 3) != 2, i2 & 1)) {
            Modifier.Companion companion = Modifier.INSTANCE;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1874554862, i2, -1, "app.chalo.compose.ToolbarDropDownAction (ChaloToolBar.kt:338)");
            }
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            Composer.Companion companion2 = Composer.INSTANCE;
            if (objRememberedValue == companion2.getEmpty()) {
                objRememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            MutableState mutableState = (MutableState) objRememberedValue;
            int i3 = i2;
            ImageUIState imageUIState = state.b;
            boolean z = (i3 & 14) == 4;
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (z || objRememberedValue2 == companion2.getEmpty()) {
                objRememberedValue2 = new ti(9, state, mutableState);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            CommonImageKt.a(imageUIState, ClickableKt.m299clickableoSLSa3U$default(companion, false, null, null, null, (Function0) objRememberedValue2, 15, null), false, composerStartRestartGroup, 0, 4);
            boolean zBooleanValue = ((Boolean) mutableState.getValue()).booleanValue();
            Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue3 == companion2.getEmpty()) {
                objRememberedValue3 = new t1(mutableState, 9);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
            }
            composer2 = composerStartRestartGroup;
            AndroidMenu_androidKt.m1619DropdownMenuIlH_yew(zBooleanValue, (Function0) objRememberedValue3, BackgroundKt.m264backgroundbw27NRU$default(companion, ChaloColorTokenKt.c(state.d), null, 2, null), 0L, null, null, null, 0L, 0.0f, 0.0f, null, ComposableLambdaKt.rememberComposableLambda(-1486599661, true, new d0(20, state, mutableState), composerStartRestartGroup, 54), composer2, 48, 48, 2040);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            modifier2 = companion;
        } else {
            composer2 = composerStartRestartGroup;
            composer2.skipToGroupEnd();
            modifier2 = modifier;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new fj(state, modifier2, false, i, 17));
        }
    }

    public static final void k(ToolbarBaseActionUIState.IconAndTextUIState state, Modifier modifier, Composer composer, int i) {
        int i2;
        Modifier modifier2;
        Modifier modifierM299clickableoSLSa3U$default;
        Intrinsics.i(state, "state");
        float f = state.d;
        ImageUIState imageUIState = state.f10118a;
        boolean z = state.e;
        BorderUISpec borderUISpec = state.f;
        Composer composerStartRestartGroup = composer.startRestartGroup(-323446717);
        if ((i & 6) == 0) {
            i2 = i | (composerStartRestartGroup.changed(state) ? 4 : 2);
        } else {
            i2 = i;
        }
        int i3 = i2 | 48;
        if (composerStartRestartGroup.shouldExecute((i3 & 19) != 18, i3 & 1)) {
            Modifier.Companion companion = Modifier.INSTANCE;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-323446717, i3, -1, "app.chalo.compose.ToolbarIconAndTextAction (ChaloToolBar.kt:306)");
            }
            if (borderUISpec != null) {
                composerStartRestartGroup.startReplaceGroup(2105652389);
                UiEventHandler uiEventHandler = state.c;
                boolean zChangedInstance = composerStartRestartGroup.changedInstance(uiEventHandler);
                Object objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    ChaloToolBarKt$ToolbarIconAndTextAction$updatedModifier$1$1 chaloToolBarKt$ToolbarIconAndTextAction$updatedModifier$1$1 = new ChaloToolBarKt$ToolbarIconAndTextAction$updatedModifier$1$1(0, uiEventHandler, UiEventHandler.class, "onClick", "onClick()V", 0);
                    composerStartRestartGroup.updateRememberedValue(chaloToolBarKt$ToolbarIconAndTextAction$updatedModifier$1$1);
                    objRememberedValue = chaloToolBarKt$ToolbarIconAndTextAction$updatedModifier$1$1;
                }
                modifierM299clickableoSLSa3U$default = ChaloThemeKt.c(BorderUISpecKt.a(ClickableKt.m299clickableoSLSa3U$default(companion, false, null, null, null, (Function0) ((KFunction) objRememberedValue), 15, null), borderUISpec), state.g);
                composerStartRestartGroup.endReplaceGroup();
            } else {
                composerStartRestartGroup.startReplaceGroup(2105839536);
                UiEventHandler uiEventHandler2 = state.c;
                boolean zChangedInstance2 = composerStartRestartGroup.changedInstance(uiEventHandler2);
                Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                if (zChangedInstance2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                    ChaloToolBarKt$ToolbarIconAndTextAction$updatedModifier$2$1 chaloToolBarKt$ToolbarIconAndTextAction$updatedModifier$2$1 = new ChaloToolBarKt$ToolbarIconAndTextAction$updatedModifier$2$1(0, uiEventHandler2, UiEventHandler.class, "onClick", "onClick()V", 0);
                    composerStartRestartGroup.updateRememberedValue(chaloToolBarKt$ToolbarIconAndTextAction$updatedModifier$2$1);
                    objRememberedValue2 = chaloToolBarKt$ToolbarIconAndTextAction$updatedModifier$2$1;
                }
                modifierM299clickableoSLSa3U$default = ClickableKt.m299clickableoSLSa3U$default(companion, false, null, null, null, (Function0) ((KFunction) objRememberedValue2), 15, null);
                composerStartRestartGroup.endReplaceGroup();
            }
            MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), Alignment.INSTANCE.getCenterVertically(), composerStartRestartGroup, 48);
            long currentCompositeKeyHashCode = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
            int i4 = (int) (currentCompositeKeyHashCode ^ (currentCompositeKeyHashCode >>> 32));
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierM299clickableoSLSa3U$default);
            ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor = companion2.getConstructor();
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
            pk0.v(companion2, composerM3915constructorimpl, measurePolicyRowMeasurePolicy, composerM3915constructorimpl, currentCompositionLocalMap);
            Updater.m3923setimpl(composerM3915constructorimpl, modifierMaterializeModifier, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion2, composerM3915constructorimpl, Integer.valueOf(i4), composerM3915constructorimpl));
            RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
            if (!z || imageUIState == null) {
                composerStartRestartGroup.startReplaceGroup(1128676387);
            } else {
                composerStartRestartGroup.startReplaceGroup(1140200978);
                CommonImageKt.a(state.f10118a, null, false, composerStartRestartGroup, 0, 6);
                ChaloSpacersKt.a(f, composerStartRestartGroup, 0);
            }
            composerStartRestartGroup.endReplaceGroup();
            TextUIState textUIState = state.b;
            if (textUIState == null) {
                composerStartRestartGroup.startReplaceGroup(1140331890);
            } else {
                composerStartRestartGroup.startReplaceGroup(1140331891);
                app.chalo.compose.components.TextKt.c(textUIState, null, null, null, composerStartRestartGroup, 0, 14);
                composerStartRestartGroup = composerStartRestartGroup;
            }
            composerStartRestartGroup.endReplaceGroup();
            if (z || imageUIState == null) {
                composerStartRestartGroup.startReplaceGroup(1128676387);
            } else {
                composerStartRestartGroup.startReplaceGroup(1140414258);
                ChaloSpacersKt.a(f, composerStartRestartGroup, 0);
                CommonImageKt.a(state.f10118a, null, false, composerStartRestartGroup, 0, 6);
            }
            composerStartRestartGroup.endReplaceGroup();
            composerStartRestartGroup.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            modifier2 = companion;
        } else {
            composerStartRestartGroup.skipToGroupEnd();
            modifier2 = modifier;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new fj(state, modifier2, false, i, 20));
        }
    }

    public static final Modifier l(Modifier.Companion companion, Composer composer) {
        Intrinsics.i(companion, "<this>");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1814096388, 6, -1, "app.chalo.compose.cardDetailsToolbarPadding (ChaloToolBar.kt:281)");
        }
        Modifier modifierM785paddingVpY3zN4 = PaddingKt.m785paddingVpY3zN4(companion, ChaloTheme.b(composer, 6).h, ChaloTheme.b(composer, 6).B);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return modifierM785paddingVpY3zN4;
    }
}
