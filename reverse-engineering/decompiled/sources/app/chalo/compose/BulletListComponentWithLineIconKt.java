package app.chalo.compose;

import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.IntrinsicKt;
import androidx.compose.foundation.layout.IntrinsicSize;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.material3.DividerKt;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.unit.Dp;
import androidx.core.view.accessibility.AccessibilityEventCompat;
import app.chalo.compose.BulletListComponentWithLineIconKt;
import app.chalo.compose.components.FromAndToStopDetailViewKt;
import app.chalo.compose.theme.ChaloTheme;
import defpackage.b3;
import defpackage.dq;
import defpackage.e0;
import defpackage.hd;
import defpackage.pk0;
import defpackage.r1;
import defpackage.t8;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.IntIterator;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntProgressionIterator;
import kotlin.ranges.RangesKt;
import okhttp3.internal.ws.WebSocketProtocol;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"chalo-base_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class BulletListComponentWithLineIconKt {
    public static final void a(final Function2 function2, final boolean z, final boolean z2, final boolean z3, final float f, final float f2, final float f3, final float f4, final Function2 function3, final Dp dp, Composer composer, final int i) {
        int i2;
        Function2 function4;
        Dp dp2;
        Composer composerStartRestartGroup = composer.startRestartGroup(520155159);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(function2) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changed(z) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= composerStartRestartGroup.changed(z2) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= composerStartRestartGroup.changed(z3) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= composerStartRestartGroup.changed(f) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= composerStartRestartGroup.changed(f2) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            i2 |= composerStartRestartGroup.changed(f3) ? 1048576 : 524288;
        }
        if ((12582912 & i) == 0) {
            i2 |= composerStartRestartGroup.changed(f4) ? 8388608 : 4194304;
        }
        if ((100663296 & i) == 0) {
            function4 = function3;
            i2 |= composerStartRestartGroup.changedInstance(function4) ? AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL : 33554432;
        } else {
            function4 = function3;
        }
        if ((805306368 & i) == 0) {
            dp2 = dp;
            i2 |= composerStartRestartGroup.changed(dp2) ? 536870912 : 268435456;
        } else {
            dp2 = dp;
        }
        if (composerStartRestartGroup.shouldExecute((306783379 & i2) != 306783378, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(520155159, i2, -1, "app.chalo.compose.BulletCardComponent (BulletListComponentWithLineIcon.kt:119)");
            }
            Modifier.Companion companion = Modifier.INSTANCE;
            int i3 = i2;
            Modifier modifierHeight = IntrinsicKt.height(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), IntrinsicSize.Min);
            MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), Alignment.INSTANCE.getTop(), composerStartRestartGroup, 0);
            long currentCompositeKeyHashCode = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
            int i4 = (int) (currentCompositeKeyHashCode ^ (currentCompositeKeyHashCode >>> 32));
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierHeight);
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
            int i5 = i3 >> 3;
            d(z, z2, z3, f, null, f2, f3, function4, dp2, composerStartRestartGroup, (i5 & 8190) | (i3 & 458752) | (i3 & 3670016) | (29360128 & i5) | (i5 & 234881024));
            SpacerKt.Spacer(SizeKt.m828size3ABfNKs(companion, f4), composerStartRestartGroup, 0);
            if (t8.w(composerStartRestartGroup, i3 & 14, function2)) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: jd
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    BulletListComponentWithLineIconKt.a(function2, z, z2, z3, f, f2, f3, f4, function3, dp, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(i | 1));
                    return Unit.f17538a;
                }
            });
        }
    }

    public static final void b(final int i, final Modifier modifier, float f, float f2, float f3, float f4, final Function1 function1, final Function4 itemContent, Composer composer, final int i2, final int i3) {
        int i4;
        int i5;
        float f5;
        float f6;
        float f7;
        float f8;
        Function1 function2;
        final float f9;
        final float f10;
        final float f11;
        final float f12;
        Intrinsics.i(itemContent, "itemContent");
        Composer composerStartRestartGroup = composer.startRestartGroup(-1246488863);
        if ((i2 & 6) == 0) {
            i4 = i;
            i5 = (composerStartRestartGroup.changed(i4) ? 4 : 2) | i2;
        } else {
            i4 = i;
            i5 = i2;
        }
        if ((i2 & 48) == 0) {
            i5 |= composerStartRestartGroup.changed(modifier) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            if ((i3 & 4) == 0) {
                f5 = f;
                int i6 = composerStartRestartGroup.changed(f5) ? 256 : 128;
                i5 |= i6;
            } else {
                f5 = f;
            }
            i5 |= i6;
        } else {
            f5 = f;
        }
        if ((i2 & 3072) == 0) {
            if ((i3 & 8) == 0) {
                f6 = f2;
                int i7 = composerStartRestartGroup.changed(f6) ? 2048 : 1024;
                i5 |= i7;
            } else {
                f6 = f2;
            }
            i5 |= i7;
        } else {
            f6 = f2;
        }
        if ((i2 & 24576) == 0) {
            if ((i3 & 16) == 0) {
                f7 = f3;
                int i8 = composerStartRestartGroup.changed(f7) ? 16384 : 8192;
                i5 |= i8;
            } else {
                f7 = f3;
            }
            i5 |= i8;
        } else {
            f7 = f3;
        }
        if ((196608 & i2) == 0) {
            if ((i3 & 32) == 0) {
                f8 = f4;
                int i9 = composerStartRestartGroup.changed(f8) ? 131072 : 65536;
                i5 |= i9;
            } else {
                f8 = f4;
            }
            i5 |= i9;
        } else {
            f8 = f4;
        }
        if ((1572864 & i2) == 0) {
            function2 = function1;
            i5 |= composerStartRestartGroup.changedInstance(function2) ? 1048576 : 524288;
        } else {
            function2 = function1;
        }
        if ((12582912 & i2) == 0) {
            i5 |= composerStartRestartGroup.changedInstance(itemContent) ? 8388608 : 4194304;
        }
        if (composerStartRestartGroup.shouldExecute((4793491 & i5) != 4793490, i5 & 1)) {
            composerStartRestartGroup.startDefaults();
            if ((i2 & 1) == 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                if ((i3 & 4) != 0) {
                    f5 = ChaloTheme.b(composerStartRestartGroup, 6).f;
                    i5 &= -897;
                }
                if ((i3 & 8) != 0) {
                    f6 = ChaloTheme.b(composerStartRestartGroup, 6).g;
                    i5 &= -7169;
                }
                if ((i3 & 16) != 0) {
                    f7 = ChaloTheme.b(composerStartRestartGroup, 6).c;
                    i5 &= -57345;
                }
                if ((i3 & 32) != 0) {
                    f8 = ChaloTheme.b(composerStartRestartGroup, 6).g;
                    i5 &= -458753;
                }
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                if ((i3 & 4) != 0) {
                    i5 &= -897;
                }
                if ((i3 & 8) != 0) {
                    i5 &= -7169;
                }
                if ((i3 & 16) != 0) {
                    i5 &= -57345;
                }
                if ((i3 & 32) != 0) {
                    i5 &= -458753;
                }
            }
            float f13 = f7;
            int i10 = i5;
            float f14 = f5;
            float f15 = f6;
            float f16 = f8;
            composerStartRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1246488863, i10, -1, "app.chalo.compose.BulletListComponent (BulletListComponentWithLineIcon.kt:59)");
            }
            e(i4, modifier, f14, f15, f13, f16, function2, null, null, itemContent, composerStartRestartGroup, (4194302 & i10) | ((i10 << 6) & 1879048192), 384);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            f12 = f16;
            f11 = f13;
            f10 = f15;
            f9 = f14;
        } else {
            composerStartRestartGroup.skipToGroupEnd();
            f9 = f5;
            f10 = f6;
            f11 = f7;
            f12 = f8;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: gd
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    BulletListComponentWithLineIconKt.b(i, modifier, f9, f10, f11, f12, function1, itemContent, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(i2 | 1), i3);
                    return Unit.f17538a;
                }
            });
        }
    }

    public static final void c(final int i, final Modifier modifier, float f, float f2, float f3, final float f4, final Function1 function1, final Function3 lineIcon, float f5, final Function4 itemContent, Composer composer, final int i2) {
        int i3;
        final float f6;
        final float f7;
        final float f8;
        final float f9;
        float f10;
        int i4;
        float f11;
        float f12;
        float f13;
        Intrinsics.i(lineIcon, "lineIcon");
        Intrinsics.i(itemContent, "itemContent");
        Composer composerStartRestartGroup = composer.startRestartGroup(244871626);
        if ((i2 & 6) == 0) {
            i3 = (composerStartRestartGroup.changed(i) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= composerStartRestartGroup.changed(modifier) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= 128;
        }
        if ((i2 & 3072) == 0) {
            i3 |= 1024;
        }
        if ((i2 & 24576) == 0) {
            i3 |= 8192;
        }
        if ((196608 & i2) == 0) {
            i3 |= composerStartRestartGroup.changed(f4) ? 131072 : 65536;
        }
        if ((1572864 & i2) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(function1) ? 1048576 : 524288;
        }
        if ((12582912 & i2) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(lineIcon) ? 8388608 : 4194304;
        }
        if ((100663296 & i2) == 0) {
            i3 |= 33554432;
        }
        if ((805306368 & i2) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(itemContent) ? 536870912 : 268435456;
        }
        if (composerStartRestartGroup.shouldExecute((306783379 & i3) != 306783378, i3 & 1)) {
            composerStartRestartGroup.startDefaults();
            if ((i2 & 1) == 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                f10 = ChaloTheme.b(composerStartRestartGroup, 6).f;
                float f14 = ChaloTheme.b(composerStartRestartGroup, 6).g;
                float f15 = ChaloTheme.b(composerStartRestartGroup, 6).c;
                i4 = i3 & (-234946433);
                f11 = ChaloTheme.b(composerStartRestartGroup, 6).j;
                f12 = f14;
                f13 = f15;
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                i4 = i3 & (-234946433);
                f10 = f;
                f12 = f2;
                f13 = f3;
                f11 = f5;
            }
            composerStartRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(244871626, i4, -1, "app.chalo.compose.BulletListComponentWithLineIcon (BulletListComponentWithLineIcon.kt:34)");
            }
            float f16 = f10;
            e(i, modifier, f16, f12, f13, f4, function1, lineIcon, Dp.m7276boximpl(f11), itemContent, composerStartRestartGroup, i4 & 2147483646, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            f8 = f13;
            f9 = f11;
            f7 = f12;
            f6 = f16;
        } else {
            composerStartRestartGroup.skipToGroupEnd();
            f6 = f;
            f7 = f2;
            f8 = f3;
            f9 = f5;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: fd
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    BulletListComponentWithLineIconKt.c(i, modifier, f6, f7, f8, f4, function1, lineIcon, f9, itemContent, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(i2 | 1));
                    return Unit.f17538a;
                }
            });
        }
    }

    /* JADX WARN: Code duplicated, block: B:72:0x00d8  */
    public static final void d(final boolean z, final boolean z2, final boolean z3, final float f, Modifier modifier, final float f2, final float f3, final Function2 function2, final Dp dp, Composer composer, final int i) {
        int i2;
        float f4;
        final Modifier modifier2;
        Modifier modifierM833width3ABfNKs;
        long jM4640getTransparent0d7_KjU;
        long jM4640getTransparent0d7_KjU2;
        Composer composerStartRestartGroup = composer.startRestartGroup(18889104);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changed(z) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changed(z2) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= composerStartRestartGroup.changed(z3) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= composerStartRestartGroup.changed(f) ? 2048 : 1024;
        }
        int i3 = i2 | 24576;
        if ((196608 & i) == 0) {
            f4 = f2;
            i3 |= composerStartRestartGroup.changed(f4) ? 131072 : 65536;
        } else {
            f4 = f2;
        }
        if ((1572864 & i) == 0) {
            i3 |= composerStartRestartGroup.changed(f3) ? 1048576 : 524288;
        }
        if ((12582912 & i) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(function2) ? 8388608 : 4194304;
        }
        if ((100663296 & i) == 0) {
            i3 |= composerStartRestartGroup.changed(dp) ? AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL : 33554432;
        }
        if (composerStartRestartGroup.shouldExecute((38347923 & i3) != 38347922, i3 & 1)) {
            Modifier.Companion companion = Modifier.INSTANCE;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(18889104, i3, -1, "app.chalo.compose.BulletWithLine (BulletListComponentWithLineIcon.kt:153)");
            }
            if (dp != null) {
                dp.m7292unboximpl();
                modifierM833width3ABfNKs = SizeKt.m833width3ABfNKs(companion, dp.m7292unboximpl());
                if (modifierM833width3ABfNKs == null) {
                    modifierM833width3ABfNKs = companion;
                }
            } else {
                modifierM833width3ABfNKs = companion;
            }
            Modifier modifierFillMaxHeight$default = SizeKt.fillMaxHeight$default(modifierM833width3ABfNKs, 0.0f, 1, null);
            Alignment.Companion companion2 = Alignment.INSTANCE;
            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), companion2.getCenterHorizontally(), composerStartRestartGroup, 48);
            long currentCompositeKeyHashCode = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
            int i4 = (int) (currentCompositeKeyHashCode ^ (currentCompositeKeyHashCode >>> 32));
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierFillMaxHeight$default);
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
            Updater.m3923setimpl(composerM3915constructorimpl, modifierMaterializeModifier, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion3, composerM3915constructorimpl, Integer.valueOf(i4), composerM3915constructorimpl));
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
            Modifier modifierAlign = columnScopeInstance.align(SizeKt.m833width3ABfNKs(SizeKt.m814height3ABfNKs(companion, f), ChaloTheme.b(composerStartRestartGroup, 6).c), companion2.getCenterHorizontally());
            if (z2) {
                composerStartRestartGroup.startReplaceGroup(-181054171);
                composerStartRestartGroup.endReplaceGroup();
                jM4640getTransparent0d7_KjU = Color.INSTANCE.m4640getTransparent0d7_KjU();
            } else {
                composerStartRestartGroup.startReplaceGroup(-181053089);
                jM4640getTransparent0d7_KjU = ChaloTheme.a(composerStartRestartGroup, 6).e;
                composerStartRestartGroup.endReplaceGroup();
            }
            SpacerKt.Spacer(BackgroundKt.m264backgroundbw27NRU$default(modifierAlign, jM4640getTransparent0d7_KjU, null, 2, null), composerStartRestartGroup, 0);
            if (z) {
                composerStartRestartGroup.startReplaceGroup(-181047547);
                composerStartRestartGroup.endReplaceGroup();
                jM4640getTransparent0d7_KjU2 = Color.INSTANCE.m4640getTransparent0d7_KjU();
            } else {
                composerStartRestartGroup.startReplaceGroup(-181046465);
                jM4640getTransparent0d7_KjU2 = ChaloTheme.a(composerStartRestartGroup, 6).e;
                composerStartRestartGroup.endReplaceGroup();
            }
            FromAndToStopDetailViewKt.a(f4, f3, jM4640getTransparent0d7_KjU2, 0L, composerStartRestartGroup, (i3 >> 15) & WebSocketProtocol.PAYLOAD_SHORT);
            composerStartRestartGroup = composerStartRestartGroup;
            Modifier modifierA = dq.a(columnScopeInstance, companion, 1.0f, false, 2, null);
            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(companion2.getCenter(), false);
            long currentCompositeKeyHashCode2 = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
            int i5 = (int) (currentCompositeKeyHashCode2 ^ (currentCompositeKeyHashCode2 >>> 32));
            CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierA);
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
            pk0.v(companion3, composerM3915constructorimpl2, measurePolicyMaybeCachedBoxMeasurePolicy, composerM3915constructorimpl2, currentCompositionLocalMap2);
            Updater.m3923setimpl(composerM3915constructorimpl2, modifierMaterializeModifier2, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion3, composerM3915constructorimpl2, Integer.valueOf(i5), composerM3915constructorimpl2));
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            if (z3) {
                composerStartRestartGroup.startReplaceGroup(-1765184402);
            } else {
                composerStartRestartGroup.startReplaceGroup(-1758919178);
                DividerKt.m1949Divider9IZ8Weo(SizeKt.fillMaxHeight$default(SizeKt.m833width3ABfNKs(companion, ChaloTheme.b(composerStartRestartGroup, 6).c), 0.0f, 1, null), 0.0f, ChaloTheme.a(composerStartRestartGroup, 6).e, composerStartRestartGroup, 0, 2);
            }
            composerStartRestartGroup.endReplaceGroup();
            if (function2 == null) {
                composerStartRestartGroup.startReplaceGroup(-1758656795);
            } else {
                composerStartRestartGroup.startReplaceGroup(358911132);
                function2.invoke(composerStartRestartGroup, Integer.valueOf((i3 >> 21) & 14));
            }
            composerStartRestartGroup.endReplaceGroup();
            if (r1.k(composerStartRestartGroup)) {
                ComposerKt.traceEventEnd();
            }
            modifier2 = companion;
        } else {
            composerStartRestartGroup.skipToGroupEnd();
            modifier2 = modifier;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: kd
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    BulletListComponentWithLineIconKt.d(z, z2, z3, f, modifier2, f2, f3, function2, dp, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(i | 1));
                    return Unit.f17538a;
                }
            });
        }
    }

    /* JADX WARN: Code duplicated, block: B:100:0x011b  */
    /* JADX WARN: Code duplicated, block: B:103:0x0127  */
    /* JADX WARN: Code duplicated, block: B:107:0x0161  */
    /* JADX WARN: Code duplicated, block: B:110:0x016d  */
    /* JADX WARN: Code duplicated, block: B:111:0x0171  */
    /* JADX WARN: Code duplicated, block: B:115:0x019e  */
    /* JADX WARN: Code duplicated, block: B:117:0x01c6  */
    /* JADX WARN: Code duplicated, block: B:118:0x01c8  */
    /* JADX WARN: Code duplicated, block: B:121:0x01cd  */
    /* JADX WARN: Code duplicated, block: B:122:0x01d0  */
    /* JADX WARN: Code duplicated, block: B:124:0x01d4  */
    /* JADX WARN: Code duplicated, block: B:125:0x01e3  */
    /* JADX WARN: Code duplicated, block: B:129:0x0240  */
    /* JADX WARN: Code duplicated, block: B:131:0x0248  */
    /* JADX WARN: Code duplicated, block: B:134:0x0256  */
    /* JADX WARN: Code duplicated, block: B:139:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:69:0x00bf  */
    /* JADX WARN: Code duplicated, block: B:70:0x00c4  */
    /* JADX WARN: Code duplicated, block: B:72:0x00ca  */
    /* JADX WARN: Code duplicated, block: B:74:0x00d0  */
    /* JADX WARN: Code duplicated, block: B:75:0x00d3  */
    /* JADX WARN: Code duplicated, block: B:79:0x00dd  */
    /* JADX WARN: Code duplicated, block: B:81:0x00e3  */
    /* JADX WARN: Code duplicated, block: B:82:0x00e6  */
    /* JADX WARN: Code duplicated, block: B:86:0x00f6  */
    /* JADX WARN: Code duplicated, block: B:87:0x00f8  */
    /* JADX WARN: Code duplicated, block: B:90:0x0101  */
    /* JADX WARN: Code duplicated, block: B:96:0x0112 A[PHI: r15
      0x0112: PHI (r15v14 kotlin.jvm.functions.Function3) = (r15v4 kotlin.jvm.functions.Function3), (r15v3 kotlin.jvm.functions.Function3) binds: [B:99:0x0119, B:95:0x010f] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:97:0x0116 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:98:0x0118  */
    public static final void e(final int i, final Modifier modifier, final float f, final float f2, final float f3, final float f4, final Function1 function1, Function3 function3, Dp dp, final Function4 function4, Composer composer, final int i2, final int i3) {
        int i4;
        float f5;
        float f6;
        float f7;
        Function3 function5;
        int i5;
        int i6;
        boolean z;
        Composer composer2;
        final Dp dp2;
        final Function3 function6;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Function3 function7;
        Dp dp3;
        int i7;
        Function0<ComposeUiNode> constructor;
        Iterator<Integer> it;
        int iNextInt;
        boolean z2;
        boolean z3;
        ComposableLambda composableLambda;
        int i8;
        int i9 = i;
        Composer composerStartRestartGroup = composer.startRestartGroup(794971862);
        if ((i2 & 6) == 0) {
            i4 = (composerStartRestartGroup.changed(i9) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        if ((i2 & 48) == 0) {
            i4 |= composerStartRestartGroup.changed(modifier) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i4 |= composerStartRestartGroup.changed(f) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            f5 = f2;
            i4 |= composerStartRestartGroup.changed(f5) ? 2048 : 1024;
        } else {
            f5 = f2;
        }
        if ((i2 & 24576) == 0) {
            f6 = f3;
            i4 |= composerStartRestartGroup.changed(f6) ? 16384 : 8192;
        } else {
            f6 = f3;
        }
        if ((196608 & i2) == 0) {
            f7 = f4;
            i4 |= composerStartRestartGroup.changed(f7) ? 131072 : 65536;
        } else {
            f7 = f4;
        }
        if ((1572864 & i2) == 0) {
            i4 |= composerStartRestartGroup.changedInstance(function1) ? 1048576 : 524288;
        }
        int i10 = i3 & 128;
        if (i10 == 0) {
            if ((12582912 & i2) == 0) {
                function5 = function3;
                i4 |= composerStartRestartGroup.changedInstance(function5) ? 8388608 : 4194304;
            }
            i5 = i3 & 256;
            if (i5 != 0) {
                i4 |= 100663296;
            } else if ((i2 & 100663296) == 0) {
                if (composerStartRestartGroup.changed(dp)) {
                    i6 = AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL;
                } else {
                    i6 = 33554432;
                }
                i4 |= i6;
            }
            if ((i2 & 805306368) == 0) {
                if (composerStartRestartGroup.changedInstance(function4)) {
                    i8 = 536870912;
                } else {
                    i8 = 268435456;
                }
                i4 |= i8;
            }
            if ((i4 & 306783379) != 306783378) {
                z = true;
            } else {
                z = false;
            }
            if (composerStartRestartGroup.shouldExecute(z, i4 & 1)) {
                composerStartRestartGroup.startDefaults();
                if ((i2 & 1) != 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                    if (i10 != 0) {
                        function5 = null;
                    }
                    if (i5 != 0) {
                        function7 = function5;
                        dp3 = null;
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(794971862, i4, -1, "app.chalo.compose.MainBulletListComponent (BulletListComponentWithLineIcon.kt:84)");
                    }
                    MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composerStartRestartGroup, 0);
                    long currentCompositeKeyHashCode = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
                    int i11 = (int) (currentCompositeKeyHashCode ^ (currentCompositeKeyHashCode >>> 32));
                    CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifier);
                    ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
                    i7 = i4;
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
                    Updater.m3923setimpl(composerM3915constructorimpl, modifierMaterializeModifier, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion, composerM3915constructorimpl, Integer.valueOf(i11), composerM3915constructorimpl));
                    ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
                    composerStartRestartGroup.startReplaceGroup(1815659574);
                    it = RangesKt.o(0, i9).iterator();
                    while (((IntProgressionIterator) it).c) {
                        iNextInt = ((IntIterator) it).nextInt();
                        ComposableLambda composableLambdaRememberComposableLambda = ComposableLambdaKt.rememberComposableLambda(1640075976, true, new e0(function4, iNextInt, 8), composerStartRestartGroup, 54);
                        boolean zBooleanValue = ((Boolean) function1.invoke(Integer.valueOf(iNextInt))).booleanValue();
                        if (iNextInt == 0) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        if (iNextInt == i9 - 1) {
                            z3 = true;
                        } else {
                            z3 = false;
                        }
                        if (function7 == null) {
                            composerStartRestartGroup.startReplaceGroup(-1797302368);
                            composerStartRestartGroup.endReplaceGroup();
                            composableLambda = null;
                        } else {
                            composerStartRestartGroup.startReplaceGroup(-1797302367);
                            ComposableLambda composableLambdaRememberComposableLambda2 = ComposableLambdaKt.rememberComposableLambda(274065306, true, new hd(iNextInt, 0, function7), composerStartRestartGroup, 54);
                            composerStartRestartGroup.endReplaceGroup();
                            composableLambda = composableLambdaRememberComposableLambda2;
                        }
                        int i12 = i7 << 6;
                        a(composableLambdaRememberComposableLambda, zBooleanValue, z2, z3, f, f5, f6, f7, composableLambda, dp3, composerStartRestartGroup, (i12 & 29360128) | (57344 & i12) | 6 | (458752 & i12) | (3670016 & i12) | ((i7 << 3) & 1879048192));
                        i9 = i;
                        f5 = f2;
                        f6 = f3;
                        f7 = f4;
                        function7 = function7;
                    }
                    Function3 function8 = function7;
                    composer2 = composerStartRestartGroup;
                    if (b3.t(composer2)) {
                        ComposerKt.traceEventEnd();
                    }
                    function6 = function8;
                    dp2 = dp3;
                } else {
                    composerStartRestartGroup.skipToGroupEnd();
                }
                dp3 = dp;
                function7 = function5;
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(794971862, i4, -1, "app.chalo.compose.MainBulletListComponent (BulletListComponentWithLineIcon.kt:84)");
                }
                MeasurePolicy measurePolicyColumnMeasurePolicy2 = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composerStartRestartGroup, 0);
                long currentCompositeKeyHashCode2 = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
                int i13 = (int) (currentCompositeKeyHashCode2 ^ (currentCompositeKeyHashCode2 >>> 32));
                CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifier);
                ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
                i7 = i4;
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
                Updater.m3923setimpl(composerM3915constructorimpl2, modifierMaterializeModifier2, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion2, composerM3915constructorimpl2, Integer.valueOf(i13), composerM3915constructorimpl2));
                ColumnScopeInstance columnScopeInstance2 = ColumnScopeInstance.INSTANCE;
                composerStartRestartGroup.startReplaceGroup(1815659574);
                it = RangesKt.o(0, i9).iterator();
                while (((IntProgressionIterator) it).c) {
                    iNextInt = ((IntIterator) it).nextInt();
                    ComposableLambda composableLambdaRememberComposableLambda3 = ComposableLambdaKt.rememberComposableLambda(1640075976, true, new e0(function4, iNextInt, 8), composerStartRestartGroup, 54);
                    boolean zBooleanValue2 = ((Boolean) function1.invoke(Integer.valueOf(iNextInt))).booleanValue();
                    if (iNextInt == 0) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    if (iNextInt == i9 - 1) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    if (function7 == null) {
                        composerStartRestartGroup.startReplaceGroup(-1797302368);
                        composerStartRestartGroup.endReplaceGroup();
                        composableLambda = null;
                    } else {
                        composerStartRestartGroup.startReplaceGroup(-1797302367);
                        ComposableLambda composableLambdaRememberComposableLambda4 = ComposableLambdaKt.rememberComposableLambda(274065306, true, new hd(iNextInt, 0, function7), composerStartRestartGroup, 54);
                        composerStartRestartGroup.endReplaceGroup();
                        composableLambda = composableLambdaRememberComposableLambda4;
                    }
                    int i14 = i7 << 6;
                    a(composableLambdaRememberComposableLambda3, zBooleanValue2, z2, z3, f, f5, f6, f7, composableLambda, dp3, composerStartRestartGroup, (i14 & 29360128) | (57344 & i14) | 6 | (458752 & i14) | (3670016 & i14) | ((i7 << 3) & 1879048192));
                    i9 = i;
                    f5 = f2;
                    f6 = f3;
                    f7 = f4;
                    function7 = function7;
                }
                Function3 function9 = function7;
                composer2 = composerStartRestartGroup;
                if (b3.t(composer2)) {
                    ComposerKt.traceEventEnd();
                }
                function6 = function9;
                dp2 = dp3;
            } else {
                composer2 = composerStartRestartGroup;
                composer2.skipToGroupEnd();
                dp2 = dp;
                function6 = function5;
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: id
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        BulletListComponentWithLineIconKt.e(i, modifier, f, f2, f3, f4, function1, function6, dp2, function4, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(i2 | 1), i3);
                        return Unit.f17538a;
                    }
                });
            }
        }
        i4 |= 12582912;
        function5 = function3;
        i5 = i3 & 256;
        if (i5 != 0) {
            i4 |= 100663296;
        } else if ((i2 & 100663296) == 0) {
            if (composerStartRestartGroup.changed(dp)) {
                i6 = AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL;
            } else {
                i6 = 33554432;
            }
            i4 |= i6;
        }
        if ((i2 & 805306368) == 0) {
            if (composerStartRestartGroup.changedInstance(function4)) {
                i8 = 536870912;
            } else {
                i8 = 268435456;
            }
            i4 |= i8;
        }
        if ((i4 & 306783379) != 306783378) {
            z = true;
        } else {
            z = false;
        }
        if (composerStartRestartGroup.shouldExecute(z, i4 & 1)) {
            composerStartRestartGroup.startDefaults();
            if ((i2 & 1) != 0) {
                if (i10 != 0) {
                    function5 = null;
                }
                if (i5 != 0) {
                    function7 = function5;
                    dp3 = null;
                } else {
                    dp3 = dp;
                    function7 = function5;
                }
            } else {
                if (i10 != 0) {
                    function5 = null;
                }
                if (i5 != 0) {
                    function7 = function5;
                    dp3 = null;
                } else {
                    dp3 = dp;
                    function7 = function5;
                }
            }
            composerStartRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(794971862, i4, -1, "app.chalo.compose.MainBulletListComponent (BulletListComponentWithLineIcon.kt:84)");
            }
            MeasurePolicy measurePolicyColumnMeasurePolicy3 = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composerStartRestartGroup, 0);
            long currentCompositeKeyHashCode3 = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
            int i15 = (int) (currentCompositeKeyHashCode3 ^ (currentCompositeKeyHashCode3 >>> 32));
            CompositionLocalMap currentCompositionLocalMap3 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier3 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifier);
            ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
            i7 = i4;
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
            Updater.m3923setimpl(composerM3915constructorimpl3, modifierMaterializeModifier3, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion3, composerM3915constructorimpl3, Integer.valueOf(i15), composerM3915constructorimpl3));
            ColumnScopeInstance columnScopeInstance3 = ColumnScopeInstance.INSTANCE;
            composerStartRestartGroup.startReplaceGroup(1815659574);
            it = RangesKt.o(0, i9).iterator();
            while (((IntProgressionIterator) it).c) {
                iNextInt = ((IntIterator) it).nextInt();
                ComposableLambda composableLambdaRememberComposableLambda5 = ComposableLambdaKt.rememberComposableLambda(1640075976, true, new e0(function4, iNextInt, 8), composerStartRestartGroup, 54);
                boolean zBooleanValue3 = ((Boolean) function1.invoke(Integer.valueOf(iNextInt))).booleanValue();
                if (iNextInt == 0) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (iNextInt == i9 - 1) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (function7 == null) {
                    composerStartRestartGroup.startReplaceGroup(-1797302368);
                    composerStartRestartGroup.endReplaceGroup();
                    composableLambda = null;
                } else {
                    composerStartRestartGroup.startReplaceGroup(-1797302367);
                    ComposableLambda composableLambdaRememberComposableLambda6 = ComposableLambdaKt.rememberComposableLambda(274065306, true, new hd(iNextInt, 0, function7), composerStartRestartGroup, 54);
                    composerStartRestartGroup.endReplaceGroup();
                    composableLambda = composableLambdaRememberComposableLambda6;
                }
                int i16 = i7 << 6;
                a(composableLambdaRememberComposableLambda5, zBooleanValue3, z2, z3, f, f5, f6, f7, composableLambda, dp3, composerStartRestartGroup, (i16 & 29360128) | (57344 & i16) | 6 | (458752 & i16) | (3670016 & i16) | ((i7 << 3) & 1879048192));
                i9 = i;
                f5 = f2;
                f6 = f3;
                f7 = f4;
                function7 = function7;
            }
            Function3 function10 = function7;
            composer2 = composerStartRestartGroup;
            if (b3.t(composer2)) {
                ComposerKt.traceEventEnd();
            }
            function6 = function10;
            dp2 = dp3;
        } else {
            composer2 = composerStartRestartGroup;
            composer2.skipToGroupEnd();
            dp2 = dp;
            function6 = function5;
        }
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: id
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    BulletListComponentWithLineIconKt.e(i, modifier, f, f2, f3, f4, function1, function6, dp2, function4, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(i2 | 1), i3);
                    return Unit.f17538a;
                }
            });
        }
    }
}
