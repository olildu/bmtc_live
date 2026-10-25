package app.chalo.compose.components;

import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.BorderKt;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.IntrinsicKt;
import androidx.compose.foundation.layout.IntrinsicSize;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material3.DividerKt;
import androidx.compose.material3.IconKt;
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
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.window.AndroidPopup_androidKt;
import app.chalo.compose.VerticalDashedLineKt;
import app.chalo.compose.components.FromAndToStopDetailViewKt;
import app.chalo.compose.components.image.CommonImageKt;
import app.chalo.compose.resources.PainterResourceHelperKt;
import app.chalo.compose.theme.ChaloTheme;
import app.chalo.compose.theme.ChaloTypographyKt;
import app.chalo.compose.theme.ShapedContentUIState;
import app.chalo.providers.iconassetprovider.IconType;
import app.chalo.uistate.VerticalDashedLineUIState;
import app.chalo.uistate.components.FromToStopIconUISpec;
import app.chalo.uistate.components.FromToStopIconUIState;
import app.chalo.uistate.image.ImageUIState;
import defpackage.fk;
import defpackage.h3;
import defpackage.i41;
import defpackage.ir;
import defpackage.ns;
import defpackage.ph;
import defpackage.pk0;
import defpackage.s50;
import defpackage.t1;
import defpackage.t8;
import defpackage.vc;
import defpackage.wb;
import defpackage.yo;
import defpackage.z;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"chalo-base_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class FromAndToStopDetailViewKt {
    public static final void a(float f, float f2, long j, long j2, Composer composer, int i) {
        int i2;
        long jM4631getBlack0d7_KjU;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1650809072);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changed(f) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changed(f2) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= composerStartRestartGroup.changed(j) ? 256 : 128;
        }
        int i3 = i2 | 3072;
        if (composerStartRestartGroup.shouldExecute((i3 & 1171) != 1170, i3 & 1)) {
            jM4631getBlack0d7_KjU = Color.INSTANCE.m4631getBlack0d7_KjU();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1650809072, i3, -1, "app.chalo.compose.components.CircularShape (FromAndToStopDetailView.kt:204)");
            }
            BoxKt.Box(BorderKt.m275borderxT4_qwU(BackgroundKt.m263backgroundbw27NRU(SizeKt.m828size3ABfNKs(Modifier.INSTANCE, f), j, RoundedCornerShapeKt.getCircleShape()), f2, jM4631getBlack0d7_KjU, RoundedCornerShapeKt.getCircleShape()), composerStartRestartGroup, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
            jM4631getBlack0d7_KjU = j2;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new yo(f, f2, j, jM4631getBlack0d7_KjU, i, 1));
        }
    }

    /* JADX WARN: Code duplicated, block: B:101:0x023d  */
    /* JADX WARN: Code duplicated, block: B:104:0x0249  */
    /* JADX WARN: Code duplicated, block: B:106:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:40:0x0078  */
    /* JADX WARN: Code duplicated, block: B:42:0x007d  */
    /* JADX WARN: Code duplicated, block: B:44:0x0081  */
    /* JADX WARN: Code duplicated, block: B:46:0x0089  */
    /* JADX WARN: Code duplicated, block: B:47:0x008c  */
    /* JADX WARN: Code duplicated, block: B:51:0x009a  */
    /* JADX WARN: Code duplicated, block: B:52:0x009c  */
    /* JADX WARN: Code duplicated, block: B:55:0x00a5 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:56:0x00a7  */
    /* JADX WARN: Code duplicated, block: B:57:0x00aa  */
    /* JADX WARN: Code duplicated, block: B:59:0x00ad  */
    /* JADX WARN: Code duplicated, block: B:60:0x00af  */
    /* JADX WARN: Code duplicated, block: B:62:0x00b2  */
    /* JADX WARN: Code duplicated, block: B:64:0x00be  */
    /* JADX WARN: Code duplicated, block: B:66:0x00cc  */
    /* JADX WARN: Code duplicated, block: B:69:0x00d3  */
    /* JADX WARN: Code duplicated, block: B:72:0x00e5  */
    /* JADX WARN: Code duplicated, block: B:76:0x0129  */
    /* JADX WARN: Code duplicated, block: B:79:0x0135  */
    /* JADX WARN: Code duplicated, block: B:80:0x0139  */
    /* JADX WARN: Code duplicated, block: B:83:0x0176  */
    /* JADX WARN: Code duplicated, block: B:85:0x0199  */
    /* JADX WARN: Code duplicated, block: B:88:0x01d0  */
    /* JADX WARN: Code duplicated, block: B:91:0x01e1  */
    /* JADX WARN: Code duplicated, block: B:93:0x01f5  */
    /* JADX WARN: Code duplicated, block: B:96:0x0229  */
    /* JADX WARN: Code duplicated, block: B:99:0x0237  */
    public static final void b(Modifier modifier, Function2 startStopText, Function2 endStopText, boolean z, Function0 function0, Composer composer, int i, int i2) {
        Modifier modifier2;
        int i3;
        boolean z2;
        int i4;
        Function0 function1;
        int i5;
        boolean z3;
        Modifier modifier3;
        boolean z4;
        Function0 function2;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        boolean z5;
        Function0 function3;
        Object objRememberedValue;
        Composer.Companion companion;
        MutableState mutableState;
        Alignment.Companion companion2;
        Function0<ComposeUiNode> constructor;
        Modifier.Companion companion3;
        int i6;
        Function0 function4;
        Object objRememberedValue2;
        Object objRememberedValue3;
        Object objRememberedValue4;
        Intrinsics.i(startStopText, "startStopText");
        Intrinsics.i(endStopText, "endStopText");
        Composer composerStartRestartGroup = composer.startRestartGroup(733519485);
        int i7 = i2 & 1;
        if (i7 != 0) {
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
            i3 |= composerStartRestartGroup.changedInstance(startStopText) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(endStopText) ? 256 : 128;
        }
        int i8 = i2 & 8;
        if (i8 == 0) {
            if ((i & 3072) == 0) {
                z2 = z;
                i3 |= composerStartRestartGroup.changed(z2) ? 2048 : 1024;
            }
            i4 = i2 & 16;
            if (i4 != 0) {
                if ((i & 24576) == 0) {
                    function1 = function0;
                    if (composerStartRestartGroup.changedInstance(function1)) {
                        i5 = 16384;
                    } else {
                        i5 = 8192;
                    }
                    i3 |= i5;
                }
                if ((i3 & 9363) != 9362) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (composerStartRestartGroup.shouldExecute(z3, i3 & 1)) {
                    if (i7 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if (i8 != 0) {
                        z5 = false;
                    } else {
                        z5 = z2;
                    }
                    if (i4 != 0) {
                        objRememberedValue4 = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue4 == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue4 = new wb(8);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
                        }
                        function3 = (Function0) objRememberedValue4;
                    } else {
                        function3 = function1;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(733519485, i3, -1, "app.chalo.compose.components.FromAndToStopDetailView (FromAndToStopDetailView.kt:51)");
                    }
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    companion = Composer.INSTANCE;
                    if (objRememberedValue == companion.getEmpty()) {
                        objRememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    mutableState = (MutableState) objRememberedValue;
                    Modifier modifierHeight = IntrinsicKt.height(modifier3, IntrinsicSize.Min);
                    companion2 = Alignment.INSTANCE;
                    MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), companion2.getCenterVertically(), composerStartRestartGroup, 48);
                    long currentCompositeKeyHashCode = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
                    int i9 = (int) (currentCompositeKeyHashCode ^ (currentCompositeKeyHashCode >>> 32));
                    CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierHeight);
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
                    Composer composerM3915constructorimpl = Updater.m3915constructorimpl(composerStartRestartGroup);
                    pk0.v(companion4, composerM3915constructorimpl, measurePolicyRowMeasurePolicy, composerM3915constructorimpl, currentCompositionLocalMap);
                    Updater.m3923setimpl(composerM3915constructorimpl, modifierMaterializeModifier, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion4, composerM3915constructorimpl, Integer.valueOf(i9), composerM3915constructorimpl));
                    RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
                    e(0.0f, ChaloTheme.b(composerStartRestartGroup, 6).f, composerStartRestartGroup, 0, 1);
                    companion3 = Modifier.INSTANCE;
                    g(i41.a(rowScopeInstance, companion3, 1.0f, false, 2, null), startStopText, endStopText, composerStartRestartGroup, i3 & 1008);
                    if (z5) {
                        composerStartRestartGroup.startReplaceGroup(-1103361052);
                        SpacerKt.Spacer(SizeKt.m833width3ABfNKs(companion3, ChaloTheme.b(composerStartRestartGroup, 6).f), composerStartRestartGroup, 0);
                        Painter painterA = PainterResourceHelperKt.a(IconType.FAVORITE_OVERFLOW, composerStartRestartGroup, 6);
                        objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue3 == companion.getEmpty()) {
                            objRememberedValue3 = new t1(mutableState, 15);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                        }
                        i6 = -1105952311;
                        IconKt.m2070Iconww6aTOc(painterA, (String) null, ClickableKt.m299clickableoSLSa3U$default(companion3, false, null, null, null, (Function0) objRememberedValue3, 15, null), 0L, composerStartRestartGroup, Painter.$stable | 48, 8);
                    } else {
                        i6 = -1105952311;
                        composerStartRestartGroup.startReplaceGroup(-1105952311);
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    if (((Boolean) mutableState.getValue()).booleanValue()) {
                        composerStartRestartGroup.startReplaceGroup(-1102964438);
                        Alignment bottomEnd = companion2.getBottomEnd();
                        objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue2 == companion.getEmpty()) {
                            objRememberedValue2 = new t1(mutableState, 16);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                        }
                        ComposableLambda composableLambdaRememberComposableLambda = ComposableLambdaKt.rememberComposableLambda(1904416618, true, new h3(16, function3, mutableState), composerStartRestartGroup, 54);
                        function4 = function3;
                        AndroidPopup_androidKt.m7536PopupK5zGePQ(bottomEnd, 0L, (Function0) objRememberedValue2, null, composableLambdaRememberComposableLambda, composerStartRestartGroup, 24966, 10);
                        composerStartRestartGroup = composerStartRestartGroup;
                    } else {
                        function4 = function3;
                        composerStartRestartGroup.startReplaceGroup(i6);
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    composerStartRestartGroup.endNode();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    z4 = z5;
                    function2 = function4;
                } else {
                    composerStartRestartGroup.skipToGroupEnd();
                    modifier3 = modifier2;
                    z4 = z2;
                    function2 = function1;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                    scopeUpdateScopeEndRestartGroup.updateScope(new ph(modifier3, startStopText, endStopText, z4, function2, i, i2, 3));
                }
            }
            i3 |= 24576;
            function1 = function0;
            if ((i3 & 9363) != 9362) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (composerStartRestartGroup.shouldExecute(z3, i3 & 1)) {
                if (i7 != 0) {
                    modifier3 = Modifier.INSTANCE;
                } else {
                    modifier3 = modifier2;
                }
                if (i8 != 0) {
                    z5 = false;
                } else {
                    z5 = z2;
                }
                if (i4 != 0) {
                    objRememberedValue4 = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue4 == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue4 = new wb(8);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
                    }
                    function3 = (Function0) objRememberedValue4;
                } else {
                    function3 = function1;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(733519485, i3, -1, "app.chalo.compose.components.FromAndToStopDetailView (FromAndToStopDetailView.kt:51)");
                }
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                companion = Composer.INSTANCE;
                if (objRememberedValue == companion.getEmpty()) {
                    objRememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                mutableState = (MutableState) objRememberedValue;
                Modifier modifierHeight2 = IntrinsicKt.height(modifier3, IntrinsicSize.Min);
                companion2 = Alignment.INSTANCE;
                MeasurePolicy measurePolicyRowMeasurePolicy2 = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), companion2.getCenterVertically(), composerStartRestartGroup, 48);
                long currentCompositeKeyHashCode2 = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
                int i10 = (int) (currentCompositeKeyHashCode2 ^ (currentCompositeKeyHashCode2 >>> 32));
                CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierHeight2);
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
                Composer composerM3915constructorimpl2 = Updater.m3915constructorimpl(composerStartRestartGroup);
                pk0.v(companion5, composerM3915constructorimpl2, measurePolicyRowMeasurePolicy2, composerM3915constructorimpl2, currentCompositionLocalMap2);
                Updater.m3923setimpl(composerM3915constructorimpl2, modifierMaterializeModifier2, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion5, composerM3915constructorimpl2, Integer.valueOf(i10), composerM3915constructorimpl2));
                RowScopeInstance rowScopeInstance2 = RowScopeInstance.INSTANCE;
                e(0.0f, ChaloTheme.b(composerStartRestartGroup, 6).f, composerStartRestartGroup, 0, 1);
                companion3 = Modifier.INSTANCE;
                g(i41.a(rowScopeInstance2, companion3, 1.0f, false, 2, null), startStopText, endStopText, composerStartRestartGroup, i3 & 1008);
                if (z5) {
                    composerStartRestartGroup.startReplaceGroup(-1103361052);
                    SpacerKt.Spacer(SizeKt.m833width3ABfNKs(companion3, ChaloTheme.b(composerStartRestartGroup, 6).f), composerStartRestartGroup, 0);
                    Painter painterA2 = PainterResourceHelperKt.a(IconType.FAVORITE_OVERFLOW, composerStartRestartGroup, 6);
                    objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue3 == companion.getEmpty()) {
                        objRememberedValue3 = new t1(mutableState, 15);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                    }
                    i6 = -1105952311;
                    IconKt.m2070Iconww6aTOc(painterA2, (String) null, ClickableKt.m299clickableoSLSa3U$default(companion3, false, null, null, null, (Function0) objRememberedValue3, 15, null), 0L, composerStartRestartGroup, Painter.$stable | 48, 8);
                } else {
                    i6 = -1105952311;
                    composerStartRestartGroup.startReplaceGroup(-1105952311);
                }
                composerStartRestartGroup.endReplaceGroup();
                if (((Boolean) mutableState.getValue()).booleanValue()) {
                    composerStartRestartGroup.startReplaceGroup(-1102964438);
                    Alignment bottomEnd2 = companion2.getBottomEnd();
                    objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue2 == companion.getEmpty()) {
                        objRememberedValue2 = new t1(mutableState, 16);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                    }
                    ComposableLambda composableLambdaRememberComposableLambda2 = ComposableLambdaKt.rememberComposableLambda(1904416618, true, new h3(16, function3, mutableState), composerStartRestartGroup, 54);
                    function4 = function3;
                    AndroidPopup_androidKt.m7536PopupK5zGePQ(bottomEnd2, 0L, (Function0) objRememberedValue2, null, composableLambdaRememberComposableLambda2, composerStartRestartGroup, 24966, 10);
                    composerStartRestartGroup = composerStartRestartGroup;
                } else {
                    function4 = function3;
                    composerStartRestartGroup.startReplaceGroup(i6);
                }
                composerStartRestartGroup.endReplaceGroup();
                composerStartRestartGroup.endNode();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                z4 = z5;
                function2 = function4;
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                modifier3 = modifier2;
                z4 = z2;
                function2 = function1;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new ph(modifier3, startStopText, endStopText, z4, function2, i, i2, 3));
            }
        }
        i3 |= 3072;
        z2 = z;
        i4 = i2 & 16;
        if (i4 != 0) {
            if ((i & 24576) == 0) {
                function1 = function0;
                if (composerStartRestartGroup.changedInstance(function1)) {
                    i5 = 16384;
                } else {
                    i5 = 8192;
                }
                i3 |= i5;
            }
            if ((i3 & 9363) != 9362) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (composerStartRestartGroup.shouldExecute(z3, i3 & 1)) {
                if (i7 != 0) {
                    modifier3 = Modifier.INSTANCE;
                } else {
                    modifier3 = modifier2;
                }
                if (i8 != 0) {
                    z5 = false;
                } else {
                    z5 = z2;
                }
                if (i4 != 0) {
                    objRememberedValue4 = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue4 == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue4 = new wb(8);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
                    }
                    function3 = (Function0) objRememberedValue4;
                } else {
                    function3 = function1;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(733519485, i3, -1, "app.chalo.compose.components.FromAndToStopDetailView (FromAndToStopDetailView.kt:51)");
                }
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                companion = Composer.INSTANCE;
                if (objRememberedValue == companion.getEmpty()) {
                    objRememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                mutableState = (MutableState) objRememberedValue;
                Modifier modifierHeight3 = IntrinsicKt.height(modifier3, IntrinsicSize.Min);
                companion2 = Alignment.INSTANCE;
                MeasurePolicy measurePolicyRowMeasurePolicy3 = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), companion2.getCenterVertically(), composerStartRestartGroup, 48);
                long currentCompositeKeyHashCode3 = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
                int i11 = (int) (currentCompositeKeyHashCode3 ^ (currentCompositeKeyHashCode3 >>> 32));
                CompositionLocalMap currentCompositionLocalMap3 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier3 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierHeight3);
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
                Composer composerM3915constructorimpl3 = Updater.m3915constructorimpl(composerStartRestartGroup);
                pk0.v(companion6, composerM3915constructorimpl3, measurePolicyRowMeasurePolicy3, composerM3915constructorimpl3, currentCompositionLocalMap3);
                Updater.m3923setimpl(composerM3915constructorimpl3, modifierMaterializeModifier3, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion6, composerM3915constructorimpl3, Integer.valueOf(i11), composerM3915constructorimpl3));
                RowScopeInstance rowScopeInstance3 = RowScopeInstance.INSTANCE;
                e(0.0f, ChaloTheme.b(composerStartRestartGroup, 6).f, composerStartRestartGroup, 0, 1);
                companion3 = Modifier.INSTANCE;
                g(i41.a(rowScopeInstance3, companion3, 1.0f, false, 2, null), startStopText, endStopText, composerStartRestartGroup, i3 & 1008);
                if (z5) {
                    composerStartRestartGroup.startReplaceGroup(-1103361052);
                    SpacerKt.Spacer(SizeKt.m833width3ABfNKs(companion3, ChaloTheme.b(composerStartRestartGroup, 6).f), composerStartRestartGroup, 0);
                    Painter painterA3 = PainterResourceHelperKt.a(IconType.FAVORITE_OVERFLOW, composerStartRestartGroup, 6);
                    objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue3 == companion.getEmpty()) {
                        objRememberedValue3 = new t1(mutableState, 15);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                    }
                    i6 = -1105952311;
                    IconKt.m2070Iconww6aTOc(painterA3, (String) null, ClickableKt.m299clickableoSLSa3U$default(companion3, false, null, null, null, (Function0) objRememberedValue3, 15, null), 0L, composerStartRestartGroup, Painter.$stable | 48, 8);
                } else {
                    i6 = -1105952311;
                    composerStartRestartGroup.startReplaceGroup(-1105952311);
                }
                composerStartRestartGroup.endReplaceGroup();
                if (((Boolean) mutableState.getValue()).booleanValue()) {
                    composerStartRestartGroup.startReplaceGroup(-1102964438);
                    Alignment bottomEnd3 = companion2.getBottomEnd();
                    objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue2 == companion.getEmpty()) {
                        objRememberedValue2 = new t1(mutableState, 16);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                    }
                    ComposableLambda composableLambdaRememberComposableLambda3 = ComposableLambdaKt.rememberComposableLambda(1904416618, true, new h3(16, function3, mutableState), composerStartRestartGroup, 54);
                    function4 = function3;
                    AndroidPopup_androidKt.m7536PopupK5zGePQ(bottomEnd3, 0L, (Function0) objRememberedValue2, null, composableLambdaRememberComposableLambda3, composerStartRestartGroup, 24966, 10);
                    composerStartRestartGroup = composerStartRestartGroup;
                } else {
                    function4 = function3;
                    composerStartRestartGroup.startReplaceGroup(i6);
                }
                composerStartRestartGroup.endReplaceGroup();
                composerStartRestartGroup.endNode();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                z4 = z5;
                function2 = function4;
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                modifier3 = modifier2;
                z4 = z2;
                function2 = function1;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new ph(modifier3, startStopText, endStopText, z4, function2, i, i2, 3));
            }
        }
        i3 |= 24576;
        function1 = function0;
        if ((i3 & 9363) != 9362) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (composerStartRestartGroup.shouldExecute(z3, i3 & 1)) {
            if (i7 != 0) {
                modifier3 = Modifier.INSTANCE;
            } else {
                modifier3 = modifier2;
            }
            if (i8 != 0) {
                z5 = false;
            } else {
                z5 = z2;
            }
            if (i4 != 0) {
                objRememberedValue4 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue4 == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue4 = new wb(8);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
                }
                function3 = (Function0) objRememberedValue4;
            } else {
                function3 = function1;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(733519485, i3, -1, "app.chalo.compose.components.FromAndToStopDetailView (FromAndToStopDetailView.kt:51)");
            }
            objRememberedValue = composerStartRestartGroup.rememberedValue();
            companion = Composer.INSTANCE;
            if (objRememberedValue == companion.getEmpty()) {
                objRememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            mutableState = (MutableState) objRememberedValue;
            Modifier modifierHeight4 = IntrinsicKt.height(modifier3, IntrinsicSize.Min);
            companion2 = Alignment.INSTANCE;
            MeasurePolicy measurePolicyRowMeasurePolicy4 = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), companion2.getCenterVertically(), composerStartRestartGroup, 48);
            long currentCompositeKeyHashCode4 = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
            int i12 = (int) (currentCompositeKeyHashCode4 ^ (currentCompositeKeyHashCode4 >>> 32));
            CompositionLocalMap currentCompositionLocalMap4 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier4 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierHeight4);
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
            Composer composerM3915constructorimpl4 = Updater.m3915constructorimpl(composerStartRestartGroup);
            pk0.v(companion7, composerM3915constructorimpl4, measurePolicyRowMeasurePolicy4, composerM3915constructorimpl4, currentCompositionLocalMap4);
            Updater.m3923setimpl(composerM3915constructorimpl4, modifierMaterializeModifier4, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion7, composerM3915constructorimpl4, Integer.valueOf(i12), composerM3915constructorimpl4));
            RowScopeInstance rowScopeInstance4 = RowScopeInstance.INSTANCE;
            e(0.0f, ChaloTheme.b(composerStartRestartGroup, 6).f, composerStartRestartGroup, 0, 1);
            companion3 = Modifier.INSTANCE;
            g(i41.a(rowScopeInstance4, companion3, 1.0f, false, 2, null), startStopText, endStopText, composerStartRestartGroup, i3 & 1008);
            if (z5) {
                composerStartRestartGroup.startReplaceGroup(-1103361052);
                SpacerKt.Spacer(SizeKt.m833width3ABfNKs(companion3, ChaloTheme.b(composerStartRestartGroup, 6).f), composerStartRestartGroup, 0);
                Painter painterA4 = PainterResourceHelperKt.a(IconType.FAVORITE_OVERFLOW, composerStartRestartGroup, 6);
                objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue3 == companion.getEmpty()) {
                    objRememberedValue3 = new t1(mutableState, 15);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                }
                i6 = -1105952311;
                IconKt.m2070Iconww6aTOc(painterA4, (String) null, ClickableKt.m299clickableoSLSa3U$default(companion3, false, null, null, null, (Function0) objRememberedValue3, 15, null), 0L, composerStartRestartGroup, Painter.$stable | 48, 8);
            } else {
                i6 = -1105952311;
                composerStartRestartGroup.startReplaceGroup(-1105952311);
            }
            composerStartRestartGroup.endReplaceGroup();
            if (((Boolean) mutableState.getValue()).booleanValue()) {
                composerStartRestartGroup.startReplaceGroup(-1102964438);
                Alignment bottomEnd4 = companion2.getBottomEnd();
                objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue2 == companion.getEmpty()) {
                    objRememberedValue2 = new t1(mutableState, 16);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                }
                ComposableLambda composableLambdaRememberComposableLambda4 = ComposableLambdaKt.rememberComposableLambda(1904416618, true, new h3(16, function3, mutableState), composerStartRestartGroup, 54);
                function4 = function3;
                AndroidPopup_androidKt.m7536PopupK5zGePQ(bottomEnd4, 0L, (Function0) objRememberedValue2, null, composableLambdaRememberComposableLambda4, composerStartRestartGroup, 24966, 10);
                composerStartRestartGroup = composerStartRestartGroup;
            } else {
                function4 = function3;
                composerStartRestartGroup.startReplaceGroup(i6);
            }
            composerStartRestartGroup.endReplaceGroup();
            composerStartRestartGroup.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            z4 = z5;
            function2 = function4;
        } else {
            composerStartRestartGroup.skipToGroupEnd();
            modifier3 = modifier2;
            z4 = z2;
            function2 = function1;
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new ph(modifier3, startStopText, endStopText, z4, function2, i, i2, 3));
        }
    }

    public static final void c(Modifier modifier, FromToStopIconUIState uiState, Composer composer, int i, int i2) {
        int i3;
        Intrinsics.i(uiState, "uiState");
        FromToStopIconUISpec fromToStopIconUISpec = uiState.f9938a;
        Composer composerStartRestartGroup = composer.startRestartGroup(1584167);
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = i | (composerStartRestartGroup.changed(modifier) ? 4 : 2);
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changed(uiState) ? 32 : 16;
        }
        if (composerStartRestartGroup.shouldExecute((i3 & 19) != 18, i3 & 1)) {
            if (i4 != 0) {
                modifier = Modifier.INSTANCE;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1584167, i3, -1, "app.chalo.compose.components.FromToStopIconView (FromAndToStopDetailView.kt:170)");
            }
            Modifier modifierFillMaxHeight = SizeKt.fillMaxHeight(modifier, fromToStopIconUISpec.f9937a);
            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getSpaceBetween(), Alignment.INSTANCE.getCenterHorizontally(), composerStartRestartGroup, 54);
            long currentCompositeKeyHashCode = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
            int i5 = (int) (currentCompositeKeyHashCode ^ (currentCompositeKeyHashCode >>> 32));
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierFillMaxHeight);
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
            Updater.m3923setimpl(composerM3915constructorimpl, modifierMaterializeModifier, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion, composerM3915constructorimpl, Integer.valueOf(i5), composerM3915constructorimpl));
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
            float f = fromToStopIconUISpec.b;
            float f2 = ChaloTheme.b(composerStartRestartGroup, 6).b;
            Color.Companion companion2 = Color.INSTANCE;
            a(f, f2, companion2.m4640getTransparent0d7_KjU(), 0L, composerStartRestartGroup, 384);
            DividerKt.m1949Divider9IZ8Weo(columnScopeInstance.weight(SizeKt.m833width3ABfNKs(BackgroundKt.m264backgroundbw27NRU$default(Modifier.INSTANCE, companion2.m4631getBlack0d7_KjU(), null, 2, null), ChaloTheme.b(composerStartRestartGroup, 6).c), 1.0f, true), 0.0f, ChaloTheme.a(composerStartRestartGroup, 6).e, composerStartRestartGroup, 0, 2);
            composerStartRestartGroup = composerStartRestartGroup;
            a(fromToStopIconUISpec.b, ChaloTheme.b(composerStartRestartGroup, 6).c, companion2.m4631getBlack0d7_KjU(), 0L, composerStartRestartGroup, 384);
            composerStartRestartGroup.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        Modifier modifier2 = modifier;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new z(i, i2, 14, modifier2, uiState));
        }
    }

    public static final void d(Modifier modifier, ImageUIState fromStopImageUIState, ImageUIState toStopImageUIState, VerticalDashedLineUIState verticalDashedLineUIState, Composer composer, int i) {
        int i2;
        Intrinsics.i(fromStopImageUIState, "fromStopImageUIState");
        Intrinsics.i(toStopImageUIState, "toStopImageUIState");
        Intrinsics.i(verticalDashedLineUIState, "verticalDashedLineUIState");
        Composer composerStartRestartGroup = composer.startRestartGroup(1154107116);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changed(modifier) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changed(fromStopImageUIState) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= composerStartRestartGroup.changed(toStopImageUIState) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= composerStartRestartGroup.changed(verticalDashedLineUIState) ? 2048 : 1024;
        }
        int i3 = i2;
        if (composerStartRestartGroup.shouldExecute((i3 & 1171) != 1170, i3 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1154107116, i3, -1, "app.chalo.compose.components.FromToStopIconView (FromAndToStopDetailView.kt:238)");
            }
            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getSpaceBetween(), Alignment.INSTANCE.getCenterHorizontally(), composerStartRestartGroup, 54);
            long currentCompositeKeyHashCode = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
            int i4 = (int) ((currentCompositeKeyHashCode >>> 32) ^ currentCompositeKeyHashCode);
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
            pk0.v(companion, composerM3915constructorimpl, measurePolicyColumnMeasurePolicy, composerM3915constructorimpl, currentCompositionLocalMap);
            Updater.m3923setimpl(composerM3915constructorimpl, modifierMaterializeModifier, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion, composerM3915constructorimpl, Integer.valueOf(i4), composerM3915constructorimpl));
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
            CommonImageKt.a(fromStopImageUIState, null, false, composerStartRestartGroup, (i3 >> 3) & 14, 6);
            int i5 = i3 >> 6;
            VerticalDashedLineKt.a(columnScopeInstance.weight(Modifier.INSTANCE, 1.0f, true), verticalDashedLineUIState, composerStartRestartGroup, i5 & 112);
            CommonImageKt.a(toStopImageUIState, null, false, composerStartRestartGroup, i5 & 14, 6);
            composerStartRestartGroup.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new ns(modifier, fromStopImageUIState, toStopImageUIState, verticalDashedLineUIState, i, 1));
        }
    }

    /* JADX WARN: Code duplicated, block: B:26:0x004f  */
    /* JADX WARN: Code duplicated, block: B:27:0x0051  */
    /* JADX WARN: Code duplicated, block: B:30:0x005a A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:31:0x005c  */
    /* JADX WARN: Code duplicated, block: B:32:0x0061  */
    /* JADX WARN: Code duplicated, block: B:34:0x0064  */
    /* JADX WARN: Code duplicated, block: B:35:0x006c  */
    /* JADX WARN: Code duplicated, block: B:38:0x0073  */
    /* JADX WARN: Code duplicated, block: B:42:0x00ae  */
    /* JADX WARN: Code duplicated, block: B:45:0x00ba  */
    /* JADX WARN: Code duplicated, block: B:46:0x00be  */
    /* JADX WARN: Code duplicated, block: B:49:0x0138  */
    /* JADX WARN: Code duplicated, block: B:50:0x013c  */
    /* JADX WARN: Code duplicated, block: B:53:0x0147  */
    /* JADX WARN: Code duplicated, block: B:55:? A[RETURN, SYNTHETIC] */
    public static final void e(float f, float f2, Composer composer, final int i, final int i2) {
        float f3;
        int i3;
        float f4;
        boolean z;
        final float f5;
        final float f6;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        float fM7278constructorimpl;
        Function0<ComposeUiNode> constructor;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1223256517);
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 6;
            f3 = f;
        } else if ((i & 6) == 0) {
            f3 = f;
            i3 = (composerStartRestartGroup.changed(f3) ? 4 : 2) | i;
        } else {
            f3 = f;
            i3 = i;
        }
        int i5 = i2 & 2;
        if (i5 == 0) {
            if ((i & 48) == 0) {
                f4 = f2;
                i3 |= composerStartRestartGroup.changed(f4) ? 32 : 16;
            }
            if ((i3 & 19) != 18) {
                z = true;
            } else {
                z = false;
            }
            if (composerStartRestartGroup.shouldExecute(z, i3 & 1)) {
                if (i4 != 0) {
                    f5 = 0.8f;
                } else {
                    f5 = f3;
                }
                if (i5 != 0) {
                    fM7278constructorimpl = Dp.m7278constructorimpl(10);
                } else {
                    fM7278constructorimpl = f4;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1223256517, i3, -1, "app.chalo.compose.components.FromToStopIconView (FromAndToStopDetailView.kt:112)");
                }
                Modifier.Companion companion = Modifier.INSTANCE;
                Modifier modifierFillMaxHeight = SizeKt.fillMaxHeight(companion, f5);
                MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getSpaceBetween(), Alignment.INSTANCE.getCenterHorizontally(), composerStartRestartGroup, 54);
                long currentCompositeKeyHashCode = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
                int i6 = (int) ((currentCompositeKeyHashCode >>> 32) ^ currentCompositeKeyHashCode);
                CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierFillMaxHeight);
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
                Composer composerM3915constructorimpl = Updater.m3915constructorimpl(composerStartRestartGroup);
                pk0.v(companion2, composerM3915constructorimpl, measurePolicyColumnMeasurePolicy, composerM3915constructorimpl, currentCompositionLocalMap);
                Updater.m3923setimpl(composerM3915constructorimpl, modifierMaterializeModifier, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion2, composerM3915constructorimpl, Integer.valueOf(i6), composerM3915constructorimpl));
                ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
                float f7 = ChaloTheme.b(composerStartRestartGroup, 6).b;
                Color.Companion companion3 = Color.INSTANCE;
                int i7 = ((i3 >> 3) & 14) | 384;
                a(fM7278constructorimpl, f7, companion3.m4640getTransparent0d7_KjU(), 0L, composerStartRestartGroup, i7);
                DividerKt.m1949Divider9IZ8Weo(columnScopeInstance.weight(SizeKt.m833width3ABfNKs(BackgroundKt.m264backgroundbw27NRU$default(companion, companion3.m4631getBlack0d7_KjU(), null, 2, null), ChaloTheme.b(composerStartRestartGroup, 6).c), 1.0f, true), 0.0f, ChaloTheme.a(composerStartRestartGroup, 6).e, composerStartRestartGroup, 0, 2);
                composerStartRestartGroup = composerStartRestartGroup;
                f6 = fM7278constructorimpl;
                a(f6, ChaloTheme.b(composerStartRestartGroup, 6).c, companion3.m4631getBlack0d7_KjU(), 0L, composerStartRestartGroup, i7);
                composerStartRestartGroup.endNode();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                f5 = f3;
                f6 = f4;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: t50
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(i | 1);
                        FromAndToStopDetailViewKt.e(f5, f6, (Composer) obj, iUpdateChangedFlags, i2);
                        return Unit.f17538a;
                    }
                });
            }
        }
        i3 |= 48;
        f4 = f2;
        if ((i3 & 19) != 18) {
            z = true;
        } else {
            z = false;
        }
        if (composerStartRestartGroup.shouldExecute(z, i3 & 1)) {
            if (i4 != 0) {
                f5 = 0.8f;
            } else {
                f5 = f3;
            }
            if (i5 != 0) {
                fM7278constructorimpl = Dp.m7278constructorimpl(10);
            } else {
                fM7278constructorimpl = f4;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1223256517, i3, -1, "app.chalo.compose.components.FromToStopIconView (FromAndToStopDetailView.kt:112)");
            }
            Modifier.Companion companion4 = Modifier.INSTANCE;
            Modifier modifierFillMaxHeight2 = SizeKt.fillMaxHeight(companion4, f5);
            MeasurePolicy measurePolicyColumnMeasurePolicy2 = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getSpaceBetween(), Alignment.INSTANCE.getCenterHorizontally(), composerStartRestartGroup, 54);
            long currentCompositeKeyHashCode2 = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
            int i8 = (int) ((currentCompositeKeyHashCode2 >>> 32) ^ currentCompositeKeyHashCode2);
            CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierFillMaxHeight2);
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
            Composer composerM3915constructorimpl2 = Updater.m3915constructorimpl(composerStartRestartGroup);
            pk0.v(companion5, composerM3915constructorimpl2, measurePolicyColumnMeasurePolicy2, composerM3915constructorimpl2, currentCompositionLocalMap2);
            Updater.m3923setimpl(composerM3915constructorimpl2, modifierMaterializeModifier2, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion5, composerM3915constructorimpl2, Integer.valueOf(i8), composerM3915constructorimpl2));
            ColumnScopeInstance columnScopeInstance2 = ColumnScopeInstance.INSTANCE;
            float f8 = ChaloTheme.b(composerStartRestartGroup, 6).b;
            Color.Companion companion6 = Color.INSTANCE;
            int i9 = ((i3 >> 3) & 14) | 384;
            a(fM7278constructorimpl, f8, companion6.m4640getTransparent0d7_KjU(), 0L, composerStartRestartGroup, i9);
            DividerKt.m1949Divider9IZ8Weo(columnScopeInstance2.weight(SizeKt.m833width3ABfNKs(BackgroundKt.m264backgroundbw27NRU$default(companion4, companion6.m4631getBlack0d7_KjU(), null, 2, null), ChaloTheme.b(composerStartRestartGroup, 6).c), 1.0f, true), 0.0f, ChaloTheme.a(composerStartRestartGroup, 6).e, composerStartRestartGroup, 0, 2);
            composerStartRestartGroup = composerStartRestartGroup;
            f6 = fM7278constructorimpl;
            a(f6, ChaloTheme.b(composerStartRestartGroup, 6).c, companion6.m4631getBlack0d7_KjU(), 0L, composerStartRestartGroup, i9);
            composerStartRestartGroup.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
            f5 = f3;
            f6 = f4;
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: t50
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(i | 1);
                    FromAndToStopDetailViewKt.e(f5, f6, (Composer) obj, iUpdateChangedFlags, i2);
                    return Unit.f17538a;
                }
            });
        }
    }

    public static final void f(float f, ShapedContentUIState topIndicator, ShapedContentUIState bottomIndicator, float f2, long j, Composer composer, int i) {
        float f3;
        float f4;
        Intrinsics.i(topIndicator, "topIndicator");
        Intrinsics.i(bottomIndicator, "bottomIndicator");
        Composer composerStartRestartGroup = composer.startRestartGroup(1128998322);
        int i2 = i | 6;
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changed(topIndicator) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= composerStartRestartGroup.changed(bottomIndicator) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= composerStartRestartGroup.changed(f2) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= composerStartRestartGroup.changed(j) ? 16384 : 8192;
        }
        if (composerStartRestartGroup.shouldExecute((i2 & 9363) != 9362, i2 & 1)) {
            composerStartRestartGroup.startDefaults();
            if ((i & 1) == 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                f4 = 0.8f;
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                f4 = f;
            }
            composerStartRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1128998322, i2, -1, "app.chalo.compose.components.FromToStopIconView (FromAndToStopDetailView.kt:147)");
            }
            Modifier.Companion companion = Modifier.INSTANCE;
            Modifier modifierFillMaxHeight = SizeKt.fillMaxHeight(companion, f4);
            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getSpaceBetween(), Alignment.INSTANCE.getCenterHorizontally(), composerStartRestartGroup, 54);
            long currentCompositeKeyHashCode = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
            int i3 = (int) (currentCompositeKeyHashCode ^ (currentCompositeKeyHashCode >>> 32));
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierFillMaxHeight);
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
            pk0.v(companion2, composerM3915constructorimpl, measurePolicyColumnMeasurePolicy, composerM3915constructorimpl, currentCompositionLocalMap);
            Updater.m3923setimpl(composerM3915constructorimpl, modifierMaterializeModifier, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion2, composerM3915constructorimpl, Integer.valueOf(i3), composerM3915constructorimpl));
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
            CircularShapeKt.b(topIndicator, null, composerStartRestartGroup, (i2 >> 3) & 14);
            DividerKt.m1949Divider9IZ8Weo(columnScopeInstance.weight(SizeKt.m833width3ABfNKs(BackgroundKt.m264backgroundbw27NRU$default(companion, j, null, 2, null), f2), 1.0f, true), 0.0f, 0L, composerStartRestartGroup, 0, 6);
            CircularShapeKt.b(bottomIndicator, null, composerStartRestartGroup, (i2 >> 6) & 14);
            composerStartRestartGroup.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            f3 = f4;
        } else {
            composerStartRestartGroup.skipToGroupEnd();
            f3 = f;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new s50(f3, topIndicator, bottomIndicator, f2, j, i));
        }
    }

    public static final void g(Modifier modifier, Function2 startStopText, Function2 endStopText, Composer composer, int i) {
        Modifier modifier2;
        int i2;
        Intrinsics.i(startStopText, "startStopText");
        Intrinsics.i(endStopText, "endStopText");
        Composer composerStartRestartGroup = composer.startRestartGroup(-1500130430);
        if ((i & 6) == 0) {
            modifier2 = modifier;
            i2 = (composerStartRestartGroup.changed(modifier2) ? 4 : 2) | i;
        } else {
            modifier2 = modifier;
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(startStopText) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(endStopText) ? 256 : 128;
        }
        int i3 = i2;
        if (composerStartRestartGroup.shouldExecute((i3 & 147) != 146, i3 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1500130430, i3, -1, "app.chalo.compose.components.FromToStopNameView (FromAndToStopDetailView.kt:218)");
            }
            Modifier modifierM788paddingqDBjuR0$default = PaddingKt.m788paddingqDBjuR0$default(modifier2, ChaloTheme.b(composerStartRestartGroup, 6).h, 0.0f, 0.0f, 0.0f, 14, null);
            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getSpaceBetween(), Alignment.INSTANCE.getStart(), composerStartRestartGroup, 54);
            long currentCompositeKeyHashCode = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
            int i4 = (int) (currentCompositeKeyHashCode ^ (currentCompositeKeyHashCode >>> 32));
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierM788paddingqDBjuR0$default);
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
            Updater.m3923setimpl(composerM3915constructorimpl, modifierMaterializeModifier, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion, composerM3915constructorimpl, Integer.valueOf(i4), composerM3915constructorimpl));
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
            startStopText.invoke(composerStartRestartGroup, Integer.valueOf((i3 >> 3) & 14));
            SpacerKt.Spacer(SizeKt.m828size3ABfNKs(Modifier.INSTANCE, ChaloTheme.b(composerStartRestartGroup, 6).f), composerStartRestartGroup, 0);
            if (t8.w(composerStartRestartGroup, (i3 >> 6) & 14, endStopText)) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new ir(i, 8, modifier, startStopText, endStopText));
        }
    }

    public static final void h(int i, Composer composer, Modifier modifier, String text, Function0 onClick) {
        int i2;
        Composer composer2;
        Intrinsics.i(modifier, "modifier");
        Intrinsics.i(text, "text");
        Intrinsics.i(onClick, "onClick");
        Composer composerStartRestartGroup = composer.startRestartGroup(248511941);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changed(modifier) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changed(text) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(onClick) ? 256 : 128;
        }
        int i3 = i2;
        if (composerStartRestartGroup.shouldExecute((i3 & 147) != 146, i3 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(248511941, i3, -1, "app.chalo.compose.components.PopUpItem (FromAndToStopDetailView.kt:96)");
            }
            long j = ChaloTheme.a(composerStartRestartGroup, 6).v;
            TextStyle textStyleB = ChaloTypographyKt.b(ChaloTheme.e(composerStartRestartGroup, 6));
            Modifier modifierM264backgroundbw27NRU$default = BackgroundKt.m264backgroundbw27NRU$default(modifier, ChaloTheme.a(composerStartRestartGroup, 6).x, null, 2, null);
            boolean z = (i3 & 896) == 256;
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (z || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new fk(onClick, 28);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            composer2 = composerStartRestartGroup;
            androidx.compose.material3.TextKt.m2623TextNvy7gAk(text, PaddingKt.m785paddingVpY3zN4(ClickableKt.m299clickableoSLSa3U$default(modifierM264backgroundbw27NRU$default, false, null, null, null, (Function0) objRememberedValue, 15, null), ChaloTheme.b(composerStartRestartGroup, 6).m, ChaloTheme.b(composerStartRestartGroup, 6).g), j, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, textStyleB, composer2, (i3 >> 3) & 14, 0, 131064);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer2 = composerStartRestartGroup;
            composer2.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new vc(modifier, text, onClick, i, 3));
        }
    }
}
