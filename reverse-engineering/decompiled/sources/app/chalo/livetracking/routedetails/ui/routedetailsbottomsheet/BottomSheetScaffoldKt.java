package app.chalo.livetracking.routedetails.ui.routedetailsbottomsheet;

import androidx.compose.animation.core.SpringSpec;
import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.layout.BoxWithConstraintsKt;
import androidx.compose.foundation.layout.BoxWithConstraintsScope;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.shape.CornerBasedShape;
import androidx.compose.material3.ColorSchemeKt;
import androidx.compose.material3.FabPosition;
import androidx.compose.material3.MaterialTheme;
import androidx.compose.material3.SnackbarHostState;
import androidx.compose.material3.SurfaceKt;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.saveable.RememberSaveableKt;
import androidx.compose.runtime.saveable.Saver;
import androidx.compose.runtime.saveable.SaverKt;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.input.nestedscroll.NestedScrollModifierKt;
import androidx.compose.ui.layout.IntrinsicMeasureScope;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.OnGloballyPositionedModifierKt;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import app.chalo.livetracking.routedetails.ui.routedetailsbottomsheet.BottomSheetScaffoldKt;
import app.chalo.livetracking.routedetails.ui.routedetailsbottomsheet.BottomSheetScaffoldState;
import app.chalo.livetracking.routedetails.ui.routedetailsbottomsheet.BottomSheetValue;
import app.chalo.livetracking.routedetails.ui.routedetailsbottomsheet.SwipeableKt;
import defpackage.f;
import defpackage.ic;
import defpackage.m;
import defpackage.m3;
import defpackage.pk0;
import defpackage.qh0;
import defpackage.t8;
import defpackage.wa;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.math.MathKt;
import kotlin.ranges.RangesKt;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\b\n\u0002\u0010\u0007\n\u0002\b\u0002¨\u0006\u0002²\u0006\u000e\u0010\u0001\u001a\u00020\u00008\n@\nX\u008a\u008e\u0002"}, d2 = {"", "bottomSheetHeight", "livetracking_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class BottomSheetScaffoldKt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final float f4445a = Dp.m7278constructorimpl(16);

    public static final void a(Function2 function2, Function2 function3, Function2 function4, Function2 function5, final State state, final int i, final int i2, Composer composer, int i3) {
        int i4;
        Composer composerStartRestartGroup = composer.startRestartGroup(-423015247);
        if ((i3 & 6) == 0) {
            i4 = (composerStartRestartGroup.changedInstance(function2) ? 4 : 2) | i3;
        } else {
            i4 = i3;
        }
        if ((i3 & 48) == 0) {
            i4 |= composerStartRestartGroup.changedInstance(function3) ? 32 : 16;
        }
        if ((i3 & 384) == 0) {
            i4 |= composerStartRestartGroup.changedInstance(function4) ? 256 : 128;
        }
        if ((i3 & 3072) == 0) {
            i4 |= composerStartRestartGroup.changedInstance(function5) ? 2048 : 1024;
        }
        if ((i3 & 24576) == 0) {
            i4 |= composerStartRestartGroup.changed(state) ? 16384 : 8192;
        }
        if ((196608 & i3) == 0) {
            i4 |= composerStartRestartGroup.changed(i) ? 131072 : 65536;
        }
        if ((1572864 & i3) == 0) {
            i4 |= composerStartRestartGroup.changed(i2) ? 1048576 : 524288;
        }
        if (composerStartRestartGroup.shouldExecute((599187 & i4) != 599186, i4 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-423015247, i4, -1, "app.chalo.livetracking.routedetails.ui.routedetailsbottomsheet.BottomSheetScaffoldStack (BottomSheetScaffold.kt:451)");
            }
            boolean z = ((57344 & i4) == 16384) | ((458752 & i4) == 131072) | ((3670016 & i4) == 1048576);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (z || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new MeasurePolicy() { // from class: app.chalo.livetracking.routedetails.ui.routedetailsbottomsheet.BottomSheetScaffoldKt$BottomSheetScaffoldStack$2$1
                    @Override // androidx.compose.ui.layout.MeasurePolicy
                    public final /* bridge */ int maxIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, List list, int i5) {
                        return qh0.a(this, intrinsicMeasureScope, list, i5);
                    }

                    @Override // androidx.compose.ui.layout.MeasurePolicy
                    public final /* bridge */ int maxIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, List list, int i5) {
                        return qh0.b(this, intrinsicMeasureScope, list, i5);
                    }

                    @Override // androidx.compose.ui.layout.MeasurePolicy
                    /* JADX INFO: renamed from: measure-3p2s80s */
                    public final MeasureResult mo43measure3p2s80s(MeasureScope Layout, final List measurables, final long j) {
                        Intrinsics.i(Layout, "$this$Layout");
                        Intrinsics.i(measurables, "measurables");
                        final Placeable placeableMo5939measureBRTryo0 = ((Measurable) CollectionsKt.F(measurables)).mo5939measureBRTryo0(j);
                        int width = placeableMo5939measureBRTryo0.getWidth();
                        int height = placeableMo5939measureBRTryo0.getHeight();
                        final State state2 = state;
                        final int i5 = i;
                        final int i6 = i2;
                        return MeasureScope.CC.s(Layout, width, height, null, new Function1() { // from class: tc
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                Placeable.PlacementScope layout = (Placeable.PlacementScope) obj;
                                Intrinsics.i(layout, "$this$layout");
                                Placeable placeable = placeableMo5939measureBRTryo0;
                                Placeable.PlacementScope.placeRelative$default(layout, placeable, 0, 0, 0.0f, 4, null);
                                List listA = CollectionsKt.A(measurables, 1);
                                ArrayList arrayList = new ArrayList(CollectionsKt.v(listA, 10));
                                Iterator it = listA.iterator();
                                while (it.hasNext()) {
                                    arrayList.add(((Measurable) it.next()).mo5939measureBRTryo0(Constraints.m7233copyZbe2FdA$default(j, 0, 0, 0, 0, 10, null)));
                                }
                                Placeable placeable2 = (Placeable) arrayList.get(0);
                                Placeable placeable3 = (Placeable) arrayList.get(1);
                                Placeable placeable4 = (Placeable) arrayList.get(2);
                                int iF = MathKt.f(((Number) state2.getValue()).floatValue());
                                Placeable.PlacementScope.placeRelative$default(layout, placeable2, 0, iF, 0.0f, 4, null);
                                Placeable.PlacementScope.placeRelative$default(layout, placeable3, FabPosition.m1999equalsimpl0(i5, FabPosition.INSTANCE.m2003getCenterERTFSPs()) ? pk0.A(placeable.getWidth(), 2, placeable3) : (placeable.getWidth() - placeable3.getWidth()) - my.b(layout, BottomSheetScaffoldKt.f4445a), iF - (placeable3.getHeight() / 2), 0.0f, 4, null);
                                int iA = pk0.A(placeable.getWidth(), 2, placeable4);
                                int height2 = (placeable.getHeight() - placeable4.getHeight()) - i6;
                                Placeable.PlacementScope.placeRelative$default(layout, placeable4, iA, height2 < 0 ? 0 : height2, 0.0f, 4, null);
                                return Unit.f17538a;
                            }
                        }, 4, null);
                    }

                    @Override // androidx.compose.ui.layout.MeasurePolicy
                    public final /* bridge */ int minIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, List list, int i5) {
                        return qh0.c(this, intrinsicMeasureScope, list, i5);
                    }

                    @Override // androidx.compose.ui.layout.MeasurePolicy
                    public final /* bridge */ int minIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, List list, int i5) {
                        return qh0.d(this, intrinsicMeasureScope, list, i5);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            MeasurePolicy measurePolicy = (MeasurePolicy) objRememberedValue;
            Modifier.Companion companion = Modifier.INSTANCE;
            long currentCompositeKeyHashCode = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
            int i5 = (int) (currentCompositeKeyHashCode ^ (currentCompositeKeyHashCode >>> 32));
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, companion);
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
            pk0.v(companion2, composerM3915constructorimpl, measurePolicy, composerM3915constructorimpl, currentCompositionLocalMap);
            Updater.m3923setimpl(composerM3915constructorimpl, modifierMaterializeModifier, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion2, composerM3915constructorimpl, Integer.valueOf(i5), composerM3915constructorimpl));
            function2.invoke(composerStartRestartGroup, Integer.valueOf(i4 & 14));
            function3.invoke(composerStartRestartGroup, Integer.valueOf((i4 >> 3) & 14));
            function4.invoke(composerStartRestartGroup, Integer.valueOf((i4 >> 6) & 14));
            if (t8.w(composerStartRestartGroup, (i4 >> 9) & 14, function5)) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new ic(function2, function3, function4, function5, state, i, i2, i3));
        }
    }

    /* JADX WARN: Code duplicated, block: B:101:0x0134  */
    /* JADX WARN: Code duplicated, block: B:104:0x013a  */
    /* JADX WARN: Code duplicated, block: B:105:0x013d  */
    /* JADX WARN: Code duplicated, block: B:108:0x0142  */
    /* JADX WARN: Code duplicated, block: B:111:0x0148  */
    /* JADX WARN: Code duplicated, block: B:114:0x014f  */
    /* JADX WARN: Code duplicated, block: B:118:0x015f  */
    /* JADX WARN: Code duplicated, block: B:124:0x016c  */
    /* JADX WARN: Code duplicated, block: B:127:0x0175  */
    /* JADX WARN: Code duplicated, block: B:129:0x0182  */
    /* JADX WARN: Code duplicated, block: B:136:0x01b9 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:137:0x01bb  */
    /* JADX WARN: Code duplicated, block: B:138:0x01be  */
    /* JADX WARN: Code duplicated, block: B:141:0x01c3  */
    /* JADX WARN: Code duplicated, block: B:143:0x01cb  */
    /* JADX WARN: Code duplicated, block: B:146:0x01d7  */
    /* JADX WARN: Code duplicated, block: B:147:0x01ec  */
    /* JADX WARN: Code duplicated, block: B:151:0x0251  */
    /* JADX WARN: Code duplicated, block: B:154:0x0265  */
    /* JADX WARN: Code duplicated, block: B:157:0x02bc  */
    /* JADX WARN: Code duplicated, block: B:159:0x02e1  */
    /* JADX WARN: Code duplicated, block: B:162:0x0307  */
    /* JADX WARN: Code duplicated, block: B:164:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:23:0x0053  */
    /* JADX WARN: Code duplicated, block: B:25:0x005b  */
    /* JADX WARN: Code duplicated, block: B:26:0x005e  */
    /* JADX WARN: Code duplicated, block: B:28:0x0063  */
    /* JADX WARN: Code duplicated, block: B:31:0x006b  */
    /* JADX WARN: Code duplicated, block: B:33:0x0072  */
    /* JADX WARN: Code duplicated, block: B:35:0x0077  */
    /* JADX WARN: Code duplicated, block: B:37:0x007f  */
    /* JADX WARN: Code duplicated, block: B:38:0x0082  */
    /* JADX WARN: Code duplicated, block: B:42:0x008c  */
    /* JADX WARN: Code duplicated, block: B:43:0x0091  */
    /* JADX WARN: Code duplicated, block: B:45:0x0097  */
    /* JADX WARN: Code duplicated, block: B:47:0x009d  */
    /* JADX WARN: Code duplicated, block: B:48:0x00a0  */
    /* JADX WARN: Code duplicated, block: B:52:0x00ac  */
    /* JADX WARN: Code duplicated, block: B:55:0x00bc  */
    /* JADX WARN: Code duplicated, block: B:57:0x00c2  */
    /* JADX WARN: Code duplicated, block: B:58:0x00c5  */
    /* JADX WARN: Code duplicated, block: B:62:0x00cf  */
    /* JADX WARN: Code duplicated, block: B:64:0x00d5  */
    /* JADX WARN: Code duplicated, block: B:65:0x00d8  */
    /* JADX WARN: Code duplicated, block: B:67:0x00dd  */
    /* JADX WARN: Code duplicated, block: B:70:0x00e3  */
    /* JADX WARN: Code duplicated, block: B:72:0x00e9  */
    /* JADX WARN: Code duplicated, block: B:75:0x00f2  */
    /* JADX WARN: Code duplicated, block: B:78:0x00f9  */
    /* JADX WARN: Code duplicated, block: B:81:0x0100  */
    /* JADX WARN: Code duplicated, block: B:84:0x0106  */
    /* JADX WARN: Code duplicated, block: B:86:0x010e  */
    /* JADX WARN: Code duplicated, block: B:87:0x0111  */
    /* JADX WARN: Code duplicated, block: B:89:0x0115  */
    /* JADX WARN: Code duplicated, block: B:92:0x011f  */
    /* JADX WARN: Code duplicated, block: B:95:0x0127  */
    /* JADX WARN: Code duplicated, block: B:98:0x012d  */
    public static final void b(final Function3 sheetContent, Modifier modifier, final BottomSheetScaffoldState bottomSheetScaffoldState, Function3 function3, float f, Function2 function2, int i, boolean z, final Shape shape, final float f2, long j, long j2, final float f3, boolean z2, Shape shape2, long j3, long j4, long j5, long j6, long j7, final Function3 content, Composer composer, final int i2, final int i3, final int i4, final int i5) {
        int i6;
        Modifier modifier2;
        int i7;
        int i8;
        float fM7278constructorimpl;
        int i9;
        int i10;
        Function2 function4;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        boolean z3;
        Composer composer2;
        final Function3 function5;
        final int i18;
        final long j8;
        final boolean z4;
        final Shape shape3;
        final long j9;
        final long j10;
        final long j11;
        final long j12;
        final long j13;
        final float f4;
        final Function2 function6;
        final Modifier modifier3;
        final boolean z5;
        final long j14;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Modifier modifier4;
        final int iM2004getEndERTFSPs;
        long surface;
        int i19;
        final float f5;
        final Function3 function7;
        int i20;
        final Shape shape4;
        final long j15;
        final long j16;
        final boolean z6;
        final long j17;
        final long j18;
        final long jM1813contentColorForek8zF_U;
        final boolean z7;
        Modifier modifier5;
        long j19;
        final Function2 function8;
        final long j20;
        Object objRememberedValue;
        int i21;
        int i22;
        int i23;
        int i24;
        int i25;
        Intrinsics.i(sheetContent, "sheetContent");
        Intrinsics.i(content, "content");
        Composer composerStartRestartGroup = composer.startRestartGroup(1003869831);
        if ((i2 & 6) == 0) {
            i6 = (composerStartRestartGroup.changedInstance(sheetContent) ? 4 : 2) | i2;
        } else {
            i6 = i2;
        }
        int i26 = i5 & 2;
        if (i26 == 0) {
            if ((i2 & 48) == 0) {
                modifier2 = modifier;
                i6 |= composerStartRestartGroup.changed(modifier2) ? 32 : 16;
            }
            if ((i2 & 384) != 0) {
                if (composerStartRestartGroup.changed(bottomSheetScaffoldState)) {
                    i25 = 256;
                } else {
                    i25 = 128;
                }
                i6 |= i25;
            }
            i7 = i6 | 27648;
            i8 = i5 & 32;
            if (i8 != 0) {
                if ((196608 & i2) == 0) {
                    fM7278constructorimpl = f;
                    if (composerStartRestartGroup.changed(fM7278constructorimpl)) {
                        i9 = 131072;
                    } else {
                        i9 = 65536;
                    }
                    i7 |= i9;
                }
                i10 = i5 & 64;
                if (i10 != 0) {
                    i7 |= 1572864;
                    function4 = function2;
                } else {
                    function4 = function2;
                    if ((i2 & 1572864) == 0) {
                        if (composerStartRestartGroup.changedInstance(function4)) {
                            i11 = 1048576;
                        } else {
                            i11 = 524288;
                        }
                        i7 |= i11;
                    }
                }
                if ((i2 & 12582912) == 0) {
                    i7 |= 4194304;
                }
                i12 = i7 | 100663296;
                if ((i2 & 805306368) == 0) {
                    if (composerStartRestartGroup.changed(shape)) {
                        i24 = 536870912;
                    } else {
                        i24 = 268435456;
                    }
                    i12 |= i24;
                }
                if ((i3 & 6) == 0) {
                    if (composerStartRestartGroup.changed(f2)) {
                        i23 = 4;
                    } else {
                        i23 = 2;
                    }
                    i13 = i3 | i23;
                } else {
                    i13 = i3;
                }
                if ((i3 & 48) != 0) {
                    if ((i5 & 2048) == 0 || !composerStartRestartGroup.changed(j)) {
                        i22 = 16;
                    } else {
                        i22 = 32;
                    }
                    i13 |= i22;
                }
                i14 = i13;
                if ((i3 & 384) == 0) {
                    i14 |= 128;
                }
                if ((i3 & 3072) != 0) {
                    if (composerStartRestartGroup.changed(f3)) {
                        i21 = 2048;
                    } else {
                        i21 = 1024;
                    }
                    i14 |= i21;
                }
                i15 = 221184 | i14;
                if ((i3 & 1572864) == 0) {
                    i15 = 745472 | i14;
                }
                if ((i3 & 12582912) == 0) {
                    i15 |= 4194304;
                }
                if ((i3 & 100663296) == 0) {
                    i15 |= 33554432;
                }
                if ((i3 & 805306368) == 0) {
                    i15 |= 268435456;
                }
                if ((i4 & 6) == 0) {
                    i16 = i4 | 2;
                } else {
                    i16 = i4;
                }
                if ((i4 & 48) == 0) {
                    i16 |= 16;
                }
                if ((i4 & 384) == 0) {
                    i16 |= composerStartRestartGroup.changedInstance(content) ? 256 : 128;
                }
                i17 = i15;
                if ((i12 & 306783379) != 306783378 && (i17 & 306783379) == 306783378 && (i16 & 147) == 146) {
                    z3 = false;
                } else {
                    z3 = true;
                }
                if (composerStartRestartGroup.shouldExecute(z3, i12 & 1)) {
                    composerStartRestartGroup.startDefaults();
                    if ((i2 & 1) != 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                        if (i26 != 0) {
                            modifier4 = Modifier.INSTANCE;
                        } else {
                            modifier4 = modifier2;
                        }
                        ComposableLambda composableLambda = ComposableSingletons$BottomSheetScaffoldKt.f4448a;
                        if (i8 != 0) {
                            fM7278constructorimpl = Dp.m7278constructorimpl(0);
                        }
                        if (i10 != 0) {
                            function4 = null;
                        }
                        iM2004getEndERTFSPs = FabPosition.INSTANCE.m2004getEndERTFSPs();
                        int i27 = (-29360129) & i12;
                        if ((i5 & 2048) != 0) {
                            i17 &= -113;
                            surface = MaterialTheme.INSTANCE.getColorScheme(composerStartRestartGroup, MaterialTheme.$stable).getSurface();
                        } else {
                            surface = j;
                        }
                        long jM1813contentColorForek8zF_U2 = ColorSchemeKt.m1813contentColorForek8zF_U(surface, composerStartRestartGroup, (i17 >> 3) & 14);
                        MaterialTheme materialTheme = MaterialTheme.INSTANCE;
                        int i28 = MaterialTheme.$stable;
                        CornerBasedShape large = materialTheme.getShapes(composerStartRestartGroup, i28).getLarge();
                        long j21 = surface;
                        long surface2 = materialTheme.getColorScheme(composerStartRestartGroup, i28).getSurface();
                        long jM1813contentColorForek8zF_U3 = ColorSchemeKt.m1813contentColorForek8zF_U(surface2, composerStartRestartGroup, 0);
                        long jA = DrawerDefaults.a(composerStartRestartGroup);
                        long background = materialTheme.getColorScheme(composerStartRestartGroup, i28).getBackground();
                        i19 = i27;
                        f5 = fM7278constructorimpl;
                        function7 = composableLambda;
                        i20 = i17 & (-2146960257);
                        shape4 = large;
                        j15 = j21;
                        j16 = jM1813contentColorForek8zF_U3;
                        z6 = true;
                        j17 = background;
                        j18 = jM1813contentColorForek8zF_U2;
                        jM1813contentColorForek8zF_U = ColorSchemeKt.m1813contentColorForek8zF_U(background, composerStartRestartGroup, 0);
                        z7 = true;
                        modifier5 = modifier4;
                        j19 = surface2;
                        function8 = function4;
                        j20 = jA;
                    } else {
                        composerStartRestartGroup.skipToGroupEnd();
                        int i29 = i12 & (-29360129);
                        if ((i5 & 2048) != 0) {
                            i17 &= -113;
                        }
                        function7 = function3;
                        z7 = z;
                        j15 = j;
                        j18 = j2;
                        z6 = z2;
                        shape4 = shape2;
                        j17 = j6;
                        jM1813contentColorForek8zF_U = j7;
                        i19 = i29;
                        i20 = i17 & (-2146960257);
                        f5 = fM7278constructorimpl;
                        function8 = function4;
                        modifier5 = modifier2;
                        iM2004getEndERTFSPs = i;
                        j19 = j3;
                        j16 = j4;
                        j20 = j5;
                    }
                    composerStartRestartGroup.endDefaults();
                    final long j22 = j19;
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1003869831, i19, i20, "app.chalo.livetracking.routedetails.ui.routedetailsbottomsheet.SlidingUpPanelBottomSheetScaffold (BottomSheetScaffold.kt:286)");
                    }
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue = EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.f17583a, composerStartRestartGroup);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    final CoroutineScope coroutineScope = (CoroutineScope) objRememberedValue;
                    boolean z8 = z7;
                    Modifier modifier6 = modifier5;
                    BoxWithConstraintsKt.BoxWithConstraints(modifier6, null, false, ComposableLambdaKt.rememberComposableLambda(-1590672143, true, new Function3(z7, coroutineScope, z6, shape4, j22, j16, j20, f3, f5, iM2004getEndERTFSPs, j17, jM1813contentColorForek8zF_U, content, shape, j15, j18, f2, sheetContent, function8, function7) { // from class: kc
                        public final /* synthetic */ boolean b;
                        public final /* synthetic */ CoroutineScope c;
                        public final /* synthetic */ Shape d;
                        public final /* synthetic */ float e;
                        public final /* synthetic */ float f;
                        public final /* synthetic */ int g;
                        public final /* synthetic */ long h;
                        public final /* synthetic */ long i;
                        public final /* synthetic */ Function3 j;
                        public final /* synthetic */ Shape k;
                        public final /* synthetic */ long l;
                        public final /* synthetic */ long m;
                        public final /* synthetic */ float n;
                        public final /* synthetic */ Function3 o;
                        public final /* synthetic */ Function2 p;
                        public final /* synthetic */ Function3 q;

                        {
                            this.d = shape4;
                            this.e = f3;
                            this.f = f5;
                            this.g = iM2004getEndERTFSPs;
                            this.h = j17;
                            this.i = jM1813contentColorForek8zF_U;
                            this.j = content;
                            this.k = shape;
                            this.l = j15;
                            this.m = j18;
                            this.n = f2;
                            this.o = sheetContent;
                            this.p = function8;
                            this.q = function7;
                        }

                        /* JADX WARN: Multi-variable type inference failed */
                        @Override // kotlin.jvm.functions.Function3
                        public final Object invoke(Object obj, Object obj2, Object obj3) {
                            BoxWithConstraintsScope BoxWithConstraints = (BoxWithConstraintsScope) obj;
                            Composer composer3 = (Composer) obj2;
                            int iIntValue = ((Integer) obj3).intValue();
                            float f6 = BottomSheetScaffoldKt.f4445a;
                            Intrinsics.i(BoxWithConstraints, "$this$BoxWithConstraints");
                            if ((iIntValue & 6) == 0) {
                                iIntValue |= composer3.changed(BoxWithConstraints) ? 4 : 2;
                            }
                            if (composer3.shouldExecute((iIntValue & 19) != 18, iIntValue & 1)) {
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(-1590672143, iIntValue, -1, "app.chalo.livetracking.routedetails.ui.routedetailsbottomsheet.SlidingUpPanelBottomSheetScaffold.<anonymous> (BottomSheetScaffold.kt:289)");
                                }
                                Density density = (Density) composer3.consume(CompositionLocalsKt.getLocalDensity());
                                float fM7242getMaxHeightimpl = Constraints.m7242getMaxHeightimpl(BoxWithConstraints.mo692getConstraintsmsEJaDk());
                                final float f7 = this.e;
                                float fMo404toPx0680j_4 = density.mo404toPx0680j_4(f7);
                                final int iF = MathKt.f(density.mo404toPx0680j_4(this.f));
                                Object objRememberedValue2 = composer3.rememberedValue();
                                Composer.Companion companion = Composer.INSTANCE;
                                if (objRememberedValue2 == companion.getEmpty()) {
                                    objRememberedValue2 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Float.valueOf(fM7242getMaxHeightimpl), null, 2, null);
                                    composer3.updateRememberedValue(objRememberedValue2);
                                }
                                final MutableState mutableState = (MutableState) objRememberedValue2;
                                float fFloatValue = fM7242getMaxHeightimpl - ((Number) mutableState.getValue()).floatValue();
                                if (fFloatValue < 0.0f) {
                                    fFloatValue = 0.0f;
                                }
                                float f8 = fFloatValue + 0.5f;
                                float fMin = Math.min(fM7242getMaxHeightimpl - 0.5f, Math.max(f8, fFloatValue));
                                float f9 = fM7242getMaxHeightimpl - fMo404toPx0680j_4;
                                if (f9 > fM7242getMaxHeightimpl) {
                                    f9 = fM7242getMaxHeightimpl;
                                }
                                float fMax = Math.max(f9, fMin + 0.5f);
                                if (fMax > fM7242getMaxHeightimpl) {
                                    fMax = fM7242getMaxHeightimpl;
                                }
                                float f10 = fMax - 0.5f;
                                if (f10 < fMin) {
                                    f10 = fMin;
                                }
                                float fD = RangesKt.d(fM7242getMaxHeightimpl / 2.0f, fMin, f10);
                                if (fD <= fFloatValue) {
                                    fD = fMin;
                                }
                                float fMax2 = Math.max(fMax, fD + 0.5f);
                                if (fMax2 > fM7242getMaxHeightimpl) {
                                    fMax2 = fM7242getMaxHeightimpl;
                                }
                                if (fMax2 - fD < 0.5f) {
                                    float f11 = fMax2 - 0.5f;
                                    if (f11 >= fMin) {
                                        fMin = f11;
                                    }
                                    fD = fMin;
                                }
                                float fMax3 = Math.max(fMax2, fD + 0.5f);
                                if (fMax3 <= fM7242getMaxHeightimpl) {
                                    fM7242getMaxHeightimpl = fMax3;
                                }
                                if (fD <= fFloatValue) {
                                    float fMin2 = Math.min(f8, fM7242getMaxHeightimpl - 0.5f);
                                    fD = fMin2 < fFloatValue ? fFloatValue : fMin2;
                                }
                                Map mapI = MapsKt.i(new Pair(Float.valueOf(fM7242getMaxHeightimpl), BottomSheetValue.Collapsed), new Pair(Float.valueOf(fD), BottomSheetValue.Expanded), new Pair(Float.valueOf(fFloatValue), BottomSheetValue.ExpandedFull));
                                Modifier.Companion companion2 = Modifier.INSTANCE;
                                final BottomSheetScaffoldState bottomSheetScaffoldState2 = this.f17485a;
                                Modifier modifierC = SwipeableKt.c(NestedScrollModifierKt.nestedScroll$default(companion2, bottomSheetScaffoldState2.f4447a.q, null, 2, null), bottomSheetScaffoldState2.f4447a, mapI, Orientation.Vertical, this.b, false, null, 0.0f, 368);
                                boolean zChanged = composer3.changed(fMo404toPx0680j_4) | composer3.changed(bottomSheetScaffoldState2);
                                CoroutineScope coroutineScope2 = this.c;
                                boolean zChangedInstance = zChanged | composer3.changedInstance(coroutineScope2);
                                Object objRememberedValue3 = composer3.rememberedValue();
                                if (zChangedInstance || objRememberedValue3 == companion.getEmpty()) {
                                    la1 la1Var = new la1(fMo404toPx0680j_4, 2, bottomSheetScaffoldState2, mutableState, coroutineScope2);
                                    composer3.updateRememberedValue(la1Var);
                                    objRememberedValue3 = la1Var;
                                }
                                final Modifier modifierSemantics$default = SemanticsModifierKt.semantics$default(modifierC, false, (Function1) objRememberedValue3, 1, null);
                                final int i30 = this.g;
                                final long j23 = this.h;
                                final long j24 = this.i;
                                final Function3 function9 = this.j;
                                final Shape shape5 = this.k;
                                final long j25 = this.l;
                                final long j26 = this.m;
                                final float f12 = this.n;
                                final Function3 function10 = this.o;
                                final Function2 function11 = this.p;
                                final Function3 function12 = this.q;
                                ComposableLambda composableLambdaRememberComposableLambda = ComposableLambdaKt.rememberComposableLambda(-746703539, true, new Function2() { // from class: oc
                                    @Override // kotlin.jvm.functions.Function2
                                    public final Object invoke(Object obj4, Object obj5) {
                                        Composer composer4 = (Composer) obj4;
                                        int iIntValue2 = ((Integer) obj5).intValue();
                                        float f13 = BottomSheetScaffoldKt.f4445a;
                                        int i31 = 0;
                                        if (composer4.shouldExecute((iIntValue2 & 3) != 2, iIntValue2 & 1)) {
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventStart(-746703539, iIntValue2, -1, "app.chalo.livetracking.routedetails.ui.routedetailsbottomsheet.SlidingUpPanelBottomSheetScaffold.<anonymous>.<anonymous> (BottomSheetScaffold.kt:331)");
                                            }
                                            final long j27 = j23;
                                            final long j28 = j24;
                                            final Function3 function13 = function9;
                                            final float f14 = f7;
                                            ComposableLambda composableLambdaRememberComposableLambda2 = ComposableLambdaKt.rememberComposableLambda(773192258, true, new Function2() { // from class: qc
                                                @Override // kotlin.jvm.functions.Function2
                                                public final Object invoke(Object obj6, Object obj7) {
                                                    Composer composer5 = (Composer) obj6;
                                                    int iIntValue3 = ((Integer) obj7).intValue();
                                                    float f15 = BottomSheetScaffoldKt.f4445a;
                                                    if (composer5.shouldExecute((iIntValue3 & 3) != 2, iIntValue3 & 1)) {
                                                        if (ComposerKt.isTraceInProgress()) {
                                                            ComposerKt.traceEventStart(773192258, iIntValue3, -1, "app.chalo.livetracking.routedetails.ui.routedetailsbottomsheet.SlidingUpPanelBottomSheetScaffold.<anonymous>.<anonymous>.<anonymous> (BottomSheetScaffold.kt:333)");
                                                        }
                                                        SurfaceKt.m2480SurfaceT9BRK9s(null, null, j27, j28, 0.0f, 0.0f, null, ComposableLambdaKt.rememberComposableLambda(115370567, true, new gc(function13, f14), composer5, 54), composer5, 12582912, 115);
                                                        if (ComposerKt.isTraceInProgress()) {
                                                            ComposerKt.traceEventEnd();
                                                        }
                                                    } else {
                                                        composer5.skipToGroupEnd();
                                                    }
                                                    return Unit.f17538a;
                                                }
                                            }, composer4, 54);
                                            final Modifier modifier7 = modifierSemantics$default;
                                            final Shape shape6 = shape5;
                                            final long j29 = j25;
                                            final long j30 = j26;
                                            final float f15 = f12;
                                            final MutableState mutableState2 = mutableState;
                                            final Function3 function14 = function10;
                                            ComposableLambda composableLambdaRememberComposableLambda3 = ComposableLambdaKt.rememberComposableLambda(1285270369, true, new Function2() { // from class: sc
                                                @Override // kotlin.jvm.functions.Function2
                                                public final Object invoke(Object obj6, Object obj7) {
                                                    Composer composer5 = (Composer) obj6;
                                                    int iIntValue3 = ((Integer) obj7).intValue();
                                                    float f16 = BottomSheetScaffoldKt.f4445a;
                                                    int i32 = 0;
                                                    if (composer5.shouldExecute((iIntValue3 & 3) != 2, iIntValue3 & 1)) {
                                                        if (ComposerKt.isTraceInProgress()) {
                                                            ComposerKt.traceEventStart(1285270369, iIntValue3, -1, "app.chalo.livetracking.routedetails.ui.routedetailsbottomsheet.SlidingUpPanelBottomSheetScaffold.<anonymous>.<anonymous>.<anonymous> (BottomSheetScaffold.kt:344)");
                                                        }
                                                        Modifier modifierM819requiredHeightInVpY3zN4$default = SizeKt.m819requiredHeightInVpY3zN4$default(SizeKt.fillMaxWidth$default(modifier7, 0.0f, 1, null), f14, 0.0f, 2, null);
                                                        Object objRememberedValue4 = composer5.rememberedValue();
                                                        if (objRememberedValue4 == Composer.INSTANCE.getEmpty()) {
                                                            objRememberedValue4 = new g5(mutableState2, 5);
                                                            composer5.updateRememberedValue(objRememberedValue4);
                                                        }
                                                        SurfaceKt.m2480SurfaceT9BRK9s(OnGloballyPositionedModifierKt.onGloballyPositioned(modifierM819requiredHeightInVpY3zN4$default, (Function1) objRememberedValue4), shape6, j29, j30, 0.0f, f15, null, ComposableLambdaKt.rememberComposableLambda(627448678, true, new hc(function14, i32), composer5, 54), composer5, 12582912, 80);
                                                        if (ComposerKt.isTraceInProgress()) {
                                                            ComposerKt.traceEventEnd();
                                                        }
                                                    } else {
                                                        composer5.skipToGroupEnd();
                                                    }
                                                    return Unit.f17538a;
                                                }
                                            }, composer4, 54);
                                            ComposableLambda composableLambdaRememberComposableLambda4 = ComposableLambdaKt.rememberComposableLambda(1797348480, true, new fc(i31, function11), composer4, 54);
                                            Function3 function15 = function12;
                                            BottomSheetScaffoldState bottomSheetScaffoldState3 = bottomSheetScaffoldState2;
                                            BottomSheetScaffoldKt.a(composableLambdaRememberComposableLambda2, composableLambdaRememberComposableLambda3, composableLambdaRememberComposableLambda4, ComposableLambdaKt.rememberComposableLambda(-1985540705, true, new h3(2, function15, bottomSheetScaffoldState3), composer4, 54), bottomSheetScaffoldState3.f4447a.e, i30, iF, composer4, 3510);
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventEnd();
                                            }
                                        } else {
                                            composer4.skipToGroupEnd();
                                        }
                                        return Unit.f17538a;
                                    }
                                }, composer3, 54);
                                composer3.startReplaceGroup(-1335879662);
                                composableLambdaRememberComposableLambda.invoke(composer3, 6);
                                composer3.endReplaceGroup();
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            } else {
                                composer3.skipToGroupEnd();
                            }
                            return Unit.f17538a;
                        }
                    }, composerStartRestartGroup, 54), composerStartRestartGroup, ((i19 >> 3) & 14) | 3072, 6);
                    composer2 = composerStartRestartGroup;
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    function6 = function8;
                    j13 = jM1813contentColorForek8zF_U;
                    j9 = j22;
                    modifier3 = modifier6;
                    shape3 = shape4;
                    f4 = f5;
                    i18 = iM2004getEndERTFSPs;
                    j14 = j18;
                    j12 = j17;
                    z4 = z6;
                    function5 = function7;
                    long j23 = j16;
                    z5 = z8;
                    j10 = j23;
                    j11 = j20;
                    j8 = j15;
                } else {
                    composer2 = composerStartRestartGroup;
                    composer2.skipToGroupEnd();
                    function5 = function3;
                    i18 = i;
                    j8 = j;
                    z4 = z2;
                    shape3 = shape2;
                    j9 = j3;
                    j10 = j4;
                    j11 = j5;
                    j12 = j6;
                    j13 = j7;
                    f4 = fM7278constructorimpl;
                    function6 = function4;
                    modifier3 = modifier2;
                    z5 = z;
                    j14 = j2;
                }
                scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                    scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: lc
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            ((Integer) obj2).getClass();
                            float f6 = BottomSheetScaffoldKt.f4445a;
                            int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(i2 | 1);
                            int iUpdateChangedFlags2 = RecomposeScopeImplKt.updateChangedFlags(i3);
                            int iUpdateChangedFlags3 = RecomposeScopeImplKt.updateChangedFlags(i4);
                            BottomSheetScaffoldKt.b(sheetContent, modifier3, bottomSheetScaffoldState, function5, f4, function6, i18, z5, shape, f2, j8, j14, f3, z4, shape3, j9, j10, j11, j12, j13, content, (Composer) obj, iUpdateChangedFlags, iUpdateChangedFlags2, iUpdateChangedFlags3, i5);
                            return Unit.f17538a;
                        }
                    });
                }
            }
            i7 = 224256 | i6;
            fM7278constructorimpl = f;
            i10 = i5 & 64;
            if (i10 != 0) {
                i7 |= 1572864;
                function4 = function2;
            } else {
                function4 = function2;
                if ((i2 & 1572864) == 0) {
                    if (composerStartRestartGroup.changedInstance(function4)) {
                        i11 = 1048576;
                    } else {
                        i11 = 524288;
                    }
                    i7 |= i11;
                }
            }
            if ((i2 & 12582912) == 0) {
                i7 |= 4194304;
            }
            i12 = i7 | 100663296;
            if ((i2 & 805306368) == 0) {
                if (composerStartRestartGroup.changed(shape)) {
                    i24 = 536870912;
                } else {
                    i24 = 268435456;
                }
                i12 |= i24;
            }
            if ((i3 & 6) == 0) {
                if (composerStartRestartGroup.changed(f2)) {
                    i23 = 4;
                } else {
                    i23 = 2;
                }
                i13 = i3 | i23;
            } else {
                i13 = i3;
            }
            if ((i3 & 48) != 0) {
                if ((i5 & 2048) == 0) {
                    i22 = 16;
                } else {
                    i22 = 16;
                }
                i13 |= i22;
            }
            i14 = i13;
            if ((i3 & 384) == 0) {
                i14 |= 128;
            }
            if ((i3 & 3072) != 0) {
                if (composerStartRestartGroup.changed(f3)) {
                    i21 = 2048;
                } else {
                    i21 = 1024;
                }
                i14 |= i21;
            }
            i15 = 221184 | i14;
            if ((i3 & 1572864) == 0) {
                i15 = 745472 | i14;
            }
            if ((i3 & 12582912) == 0) {
                i15 |= 4194304;
            }
            if ((i3 & 100663296) == 0) {
                i15 |= 33554432;
            }
            if ((i3 & 805306368) == 0) {
                i15 |= 268435456;
            }
            if ((i4 & 6) == 0) {
                i16 = i4 | 2;
            } else {
                i16 = i4;
            }
            if ((i4 & 48) == 0) {
                i16 |= 16;
            }
            if ((i4 & 384) == 0) {
                i16 |= composerStartRestartGroup.changedInstance(content) ? 256 : 128;
            }
            i17 = i15;
            if ((i12 & 306783379) != 306783378) {
                z3 = true;
            } else {
                z3 = true;
            }
            if (composerStartRestartGroup.shouldExecute(z3, i12 & 1)) {
                composerStartRestartGroup.startDefaults();
                if ((i2 & 1) != 0) {
                    if (i26 != 0) {
                        modifier4 = Modifier.INSTANCE;
                    } else {
                        modifier4 = modifier2;
                    }
                    ComposableLambda composableLambda2 = ComposableSingletons$BottomSheetScaffoldKt.f4448a;
                    if (i8 != 0) {
                        fM7278constructorimpl = Dp.m7278constructorimpl(0);
                    }
                    if (i10 != 0) {
                        function4 = null;
                    }
                    iM2004getEndERTFSPs = FabPosition.INSTANCE.m2004getEndERTFSPs();
                    int i210 = (-29360129) & i12;
                    if ((i5 & 2048) != 0) {
                        i17 &= -113;
                        surface = MaterialTheme.INSTANCE.getColorScheme(composerStartRestartGroup, MaterialTheme.$stable).getSurface();
                    } else {
                        surface = j;
                    }
                    long jM1813contentColorForek8zF_U4 = ColorSchemeKt.m1813contentColorForek8zF_U(surface, composerStartRestartGroup, (i17 >> 3) & 14);
                    MaterialTheme materialTheme2 = MaterialTheme.INSTANCE;
                    int i211 = MaterialTheme.$stable;
                    CornerBasedShape large2 = materialTheme2.getShapes(composerStartRestartGroup, i211).getLarge();
                    long j24 = surface;
                    long surface3 = materialTheme2.getColorScheme(composerStartRestartGroup, i211).getSurface();
                    long jM1813contentColorForek8zF_U5 = ColorSchemeKt.m1813contentColorForek8zF_U(surface3, composerStartRestartGroup, 0);
                    long jA2 = DrawerDefaults.a(composerStartRestartGroup);
                    long background2 = materialTheme2.getColorScheme(composerStartRestartGroup, i211).getBackground();
                    i19 = i210;
                    f5 = fM7278constructorimpl;
                    function7 = composableLambda2;
                    i20 = i17 & (-2146960257);
                    shape4 = large2;
                    j15 = j24;
                    j16 = jM1813contentColorForek8zF_U5;
                    z6 = true;
                    j17 = background2;
                    j18 = jM1813contentColorForek8zF_U4;
                    jM1813contentColorForek8zF_U = ColorSchemeKt.m1813contentColorForek8zF_U(background2, composerStartRestartGroup, 0);
                    z7 = true;
                    modifier5 = modifier4;
                    j19 = surface3;
                    function8 = function4;
                    j20 = jA2;
                } else {
                    if (i26 != 0) {
                        modifier4 = Modifier.INSTANCE;
                    } else {
                        modifier4 = modifier2;
                    }
                    ComposableLambda composableLambda3 = ComposableSingletons$BottomSheetScaffoldKt.f4448a;
                    if (i8 != 0) {
                        fM7278constructorimpl = Dp.m7278constructorimpl(0);
                    }
                    if (i10 != 0) {
                        function4 = null;
                    }
                    iM2004getEndERTFSPs = FabPosition.INSTANCE.m2004getEndERTFSPs();
                    int i212 = (-29360129) & i12;
                    if ((i5 & 2048) != 0) {
                        i17 &= -113;
                        surface = MaterialTheme.INSTANCE.getColorScheme(composerStartRestartGroup, MaterialTheme.$stable).getSurface();
                    } else {
                        surface = j;
                    }
                    long jM1813contentColorForek8zF_U6 = ColorSchemeKt.m1813contentColorForek8zF_U(surface, composerStartRestartGroup, (i17 >> 3) & 14);
                    MaterialTheme materialTheme3 = MaterialTheme.INSTANCE;
                    int i213 = MaterialTheme.$stable;
                    CornerBasedShape large3 = materialTheme3.getShapes(composerStartRestartGroup, i213).getLarge();
                    long j25 = surface;
                    long surface4 = materialTheme3.getColorScheme(composerStartRestartGroup, i213).getSurface();
                    long jM1813contentColorForek8zF_U7 = ColorSchemeKt.m1813contentColorForek8zF_U(surface4, composerStartRestartGroup, 0);
                    long jA3 = DrawerDefaults.a(composerStartRestartGroup);
                    long background3 = materialTheme3.getColorScheme(composerStartRestartGroup, i213).getBackground();
                    i19 = i212;
                    f5 = fM7278constructorimpl;
                    function7 = composableLambda3;
                    i20 = i17 & (-2146960257);
                    shape4 = large3;
                    j15 = j25;
                    j16 = jM1813contentColorForek8zF_U7;
                    z6 = true;
                    j17 = background3;
                    j18 = jM1813contentColorForek8zF_U6;
                    jM1813contentColorForek8zF_U = ColorSchemeKt.m1813contentColorForek8zF_U(background3, composerStartRestartGroup, 0);
                    z7 = true;
                    modifier5 = modifier4;
                    j19 = surface4;
                    function8 = function4;
                    j20 = jA3;
                }
                composerStartRestartGroup.endDefaults();
                final long j26 = j19;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1003869831, i19, i20, "app.chalo.livetracking.routedetails.ui.routedetailsbottomsheet.SlidingUpPanelBottomSheetScaffold (BottomSheetScaffold.kt:286)");
                }
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.f17583a, composerStartRestartGroup);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                final CoroutineScope coroutineScope2 = (CoroutineScope) objRememberedValue;
                boolean z9 = z7;
                Modifier modifier7 = modifier5;
                BoxWithConstraintsKt.BoxWithConstraints(modifier7, null, false, ComposableLambdaKt.rememberComposableLambda(-1590672143, true, new Function3(z7, coroutineScope2, z6, shape4, j26, j16, j20, f3, f5, iM2004getEndERTFSPs, j17, jM1813contentColorForek8zF_U, content, shape, j15, j18, f2, sheetContent, function8, function7) { // from class: kc
                    public final /* synthetic */ boolean b;
                    public final /* synthetic */ CoroutineScope c;
                    public final /* synthetic */ Shape d;
                    public final /* synthetic */ float e;
                    public final /* synthetic */ float f;
                    public final /* synthetic */ int g;
                    public final /* synthetic */ long h;
                    public final /* synthetic */ long i;
                    public final /* synthetic */ Function3 j;
                    public final /* synthetic */ Shape k;
                    public final /* synthetic */ long l;
                    public final /* synthetic */ long m;
                    public final /* synthetic */ float n;
                    public final /* synthetic */ Function3 o;
                    public final /* synthetic */ Function2 p;
                    public final /* synthetic */ Function3 q;

                    {
                        this.d = shape4;
                        this.e = f3;
                        this.f = f5;
                        this.g = iM2004getEndERTFSPs;
                        this.h = j17;
                        this.i = jM1813contentColorForek8zF_U;
                        this.j = content;
                        this.k = shape;
                        this.l = j15;
                        this.m = j18;
                        this.n = f2;
                        this.o = sheetContent;
                        this.p = function8;
                        this.q = function7;
                    }

                    /* JADX WARN: Multi-variable type inference failed */
                    @Override // kotlin.jvm.functions.Function3
                    public final Object invoke(Object obj, Object obj2, Object obj3) {
                        BoxWithConstraintsScope BoxWithConstraints = (BoxWithConstraintsScope) obj;
                        Composer composer3 = (Composer) obj2;
                        int iIntValue = ((Integer) obj3).intValue();
                        float f6 = BottomSheetScaffoldKt.f4445a;
                        Intrinsics.i(BoxWithConstraints, "$this$BoxWithConstraints");
                        if ((iIntValue & 6) == 0) {
                            iIntValue |= composer3.changed(BoxWithConstraints) ? 4 : 2;
                        }
                        if (composer3.shouldExecute((iIntValue & 19) != 18, iIntValue & 1)) {
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-1590672143, iIntValue, -1, "app.chalo.livetracking.routedetails.ui.routedetailsbottomsheet.SlidingUpPanelBottomSheetScaffold.<anonymous> (BottomSheetScaffold.kt:289)");
                            }
                            Density density = (Density) composer3.consume(CompositionLocalsKt.getLocalDensity());
                            float fM7242getMaxHeightimpl = Constraints.m7242getMaxHeightimpl(BoxWithConstraints.mo692getConstraintsmsEJaDk());
                            final float f7 = this.e;
                            float fMo404toPx0680j_4 = density.mo404toPx0680j_4(f7);
                            final int iF = MathKt.f(density.mo404toPx0680j_4(this.f));
                            Object objRememberedValue2 = composer3.rememberedValue();
                            Composer.Companion companion = Composer.INSTANCE;
                            if (objRememberedValue2 == companion.getEmpty()) {
                                objRememberedValue2 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Float.valueOf(fM7242getMaxHeightimpl), null, 2, null);
                                composer3.updateRememberedValue(objRememberedValue2);
                            }
                            final MutableState mutableState = (MutableState) objRememberedValue2;
                            float fFloatValue = fM7242getMaxHeightimpl - ((Number) mutableState.getValue()).floatValue();
                            if (fFloatValue < 0.0f) {
                                fFloatValue = 0.0f;
                            }
                            float f8 = fFloatValue + 0.5f;
                            float fMin = Math.min(fM7242getMaxHeightimpl - 0.5f, Math.max(f8, fFloatValue));
                            float f9 = fM7242getMaxHeightimpl - fMo404toPx0680j_4;
                            if (f9 > fM7242getMaxHeightimpl) {
                                f9 = fM7242getMaxHeightimpl;
                            }
                            float fMax = Math.max(f9, fMin + 0.5f);
                            if (fMax > fM7242getMaxHeightimpl) {
                                fMax = fM7242getMaxHeightimpl;
                            }
                            float f10 = fMax - 0.5f;
                            if (f10 < fMin) {
                                f10 = fMin;
                            }
                            float fD = RangesKt.d(fM7242getMaxHeightimpl / 2.0f, fMin, f10);
                            if (fD <= fFloatValue) {
                                fD = fMin;
                            }
                            float fMax2 = Math.max(fMax, fD + 0.5f);
                            if (fMax2 > fM7242getMaxHeightimpl) {
                                fMax2 = fM7242getMaxHeightimpl;
                            }
                            if (fMax2 - fD < 0.5f) {
                                float f11 = fMax2 - 0.5f;
                                if (f11 >= fMin) {
                                    fMin = f11;
                                }
                                fD = fMin;
                            }
                            float fMax3 = Math.max(fMax2, fD + 0.5f);
                            if (fMax3 <= fM7242getMaxHeightimpl) {
                                fM7242getMaxHeightimpl = fMax3;
                            }
                            if (fD <= fFloatValue) {
                                float fMin2 = Math.min(f8, fM7242getMaxHeightimpl - 0.5f);
                                fD = fMin2 < fFloatValue ? fFloatValue : fMin2;
                            }
                            Map mapI = MapsKt.i(new Pair(Float.valueOf(fM7242getMaxHeightimpl), BottomSheetValue.Collapsed), new Pair(Float.valueOf(fD), BottomSheetValue.Expanded), new Pair(Float.valueOf(fFloatValue), BottomSheetValue.ExpandedFull));
                            Modifier.Companion companion2 = Modifier.INSTANCE;
                            final BottomSheetScaffoldState bottomSheetScaffoldState2 = this.f17485a;
                            Modifier modifierC = SwipeableKt.c(NestedScrollModifierKt.nestedScroll$default(companion2, bottomSheetScaffoldState2.f4447a.q, null, 2, null), bottomSheetScaffoldState2.f4447a, mapI, Orientation.Vertical, this.b, false, null, 0.0f, 368);
                            boolean zChanged = composer3.changed(fMo404toPx0680j_4) | composer3.changed(bottomSheetScaffoldState2);
                            CoroutineScope coroutineScope3 = this.c;
                            boolean zChangedInstance = zChanged | composer3.changedInstance(coroutineScope3);
                            Object objRememberedValue3 = composer3.rememberedValue();
                            if (zChangedInstance || objRememberedValue3 == companion.getEmpty()) {
                                la1 la1Var = new la1(fMo404toPx0680j_4, 2, bottomSheetScaffoldState2, mutableState, coroutineScope3);
                                composer3.updateRememberedValue(la1Var);
                                objRememberedValue3 = la1Var;
                            }
                            final Modifier modifierSemantics$default = SemanticsModifierKt.semantics$default(modifierC, false, (Function1) objRememberedValue3, 1, null);
                            final int i30 = this.g;
                            final long j27 = this.h;
                            final long j28 = this.i;
                            final Function3 function9 = this.j;
                            final Shape shape5 = this.k;
                            final long j29 = this.l;
                            final long j210 = this.m;
                            final float f12 = this.n;
                            final Function3 function10 = this.o;
                            final Function2 function11 = this.p;
                            final Function3 function12 = this.q;
                            ComposableLambda composableLambdaRememberComposableLambda = ComposableLambdaKt.rememberComposableLambda(-746703539, true, new Function2() { // from class: oc
                                @Override // kotlin.jvm.functions.Function2
                                public final Object invoke(Object obj4, Object obj5) {
                                    Composer composer4 = (Composer) obj4;
                                    int iIntValue2 = ((Integer) obj5).intValue();
                                    float f13 = BottomSheetScaffoldKt.f4445a;
                                    int i31 = 0;
                                    if (composer4.shouldExecute((iIntValue2 & 3) != 2, iIntValue2 & 1)) {
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventStart(-746703539, iIntValue2, -1, "app.chalo.livetracking.routedetails.ui.routedetailsbottomsheet.SlidingUpPanelBottomSheetScaffold.<anonymous>.<anonymous> (BottomSheetScaffold.kt:331)");
                                        }
                                        final long j211 = j27;
                                        final long j212 = j28;
                                        final Function3 function13 = function9;
                                        final float f14 = f7;
                                        ComposableLambda composableLambdaRememberComposableLambda2 = ComposableLambdaKt.rememberComposableLambda(773192258, true, new Function2() { // from class: qc
                                            @Override // kotlin.jvm.functions.Function2
                                            public final Object invoke(Object obj6, Object obj7) {
                                                Composer composer5 = (Composer) obj6;
                                                int iIntValue3 = ((Integer) obj7).intValue();
                                                float f15 = BottomSheetScaffoldKt.f4445a;
                                                if (composer5.shouldExecute((iIntValue3 & 3) != 2, iIntValue3 & 1)) {
                                                    if (ComposerKt.isTraceInProgress()) {
                                                        ComposerKt.traceEventStart(773192258, iIntValue3, -1, "app.chalo.livetracking.routedetails.ui.routedetailsbottomsheet.SlidingUpPanelBottomSheetScaffold.<anonymous>.<anonymous>.<anonymous> (BottomSheetScaffold.kt:333)");
                                                    }
                                                    SurfaceKt.m2480SurfaceT9BRK9s(null, null, j211, j212, 0.0f, 0.0f, null, ComposableLambdaKt.rememberComposableLambda(115370567, true, new gc(function13, f14), composer5, 54), composer5, 12582912, 115);
                                                    if (ComposerKt.isTraceInProgress()) {
                                                        ComposerKt.traceEventEnd();
                                                    }
                                                } else {
                                                    composer5.skipToGroupEnd();
                                                }
                                                return Unit.f17538a;
                                            }
                                        }, composer4, 54);
                                        final Modifier modifier8 = modifierSemantics$default;
                                        final Shape shape6 = shape5;
                                        final long j213 = j29;
                                        final long j30 = j210;
                                        final float f15 = f12;
                                        final MutableState mutableState2 = mutableState;
                                        final Function3 function14 = function10;
                                        ComposableLambda composableLambdaRememberComposableLambda3 = ComposableLambdaKt.rememberComposableLambda(1285270369, true, new Function2() { // from class: sc
                                            @Override // kotlin.jvm.functions.Function2
                                            public final Object invoke(Object obj6, Object obj7) {
                                                Composer composer5 = (Composer) obj6;
                                                int iIntValue3 = ((Integer) obj7).intValue();
                                                float f16 = BottomSheetScaffoldKt.f4445a;
                                                int i32 = 0;
                                                if (composer5.shouldExecute((iIntValue3 & 3) != 2, iIntValue3 & 1)) {
                                                    if (ComposerKt.isTraceInProgress()) {
                                                        ComposerKt.traceEventStart(1285270369, iIntValue3, -1, "app.chalo.livetracking.routedetails.ui.routedetailsbottomsheet.SlidingUpPanelBottomSheetScaffold.<anonymous>.<anonymous>.<anonymous> (BottomSheetScaffold.kt:344)");
                                                    }
                                                    Modifier modifierM819requiredHeightInVpY3zN4$default = SizeKt.m819requiredHeightInVpY3zN4$default(SizeKt.fillMaxWidth$default(modifier8, 0.0f, 1, null), f14, 0.0f, 2, null);
                                                    Object objRememberedValue4 = composer5.rememberedValue();
                                                    if (objRememberedValue4 == Composer.INSTANCE.getEmpty()) {
                                                        objRememberedValue4 = new g5(mutableState2, 5);
                                                        composer5.updateRememberedValue(objRememberedValue4);
                                                    }
                                                    SurfaceKt.m2480SurfaceT9BRK9s(OnGloballyPositionedModifierKt.onGloballyPositioned(modifierM819requiredHeightInVpY3zN4$default, (Function1) objRememberedValue4), shape6, j213, j30, 0.0f, f15, null, ComposableLambdaKt.rememberComposableLambda(627448678, true, new hc(function14, i32), composer5, 54), composer5, 12582912, 80);
                                                    if (ComposerKt.isTraceInProgress()) {
                                                        ComposerKt.traceEventEnd();
                                                    }
                                                } else {
                                                    composer5.skipToGroupEnd();
                                                }
                                                return Unit.f17538a;
                                            }
                                        }, composer4, 54);
                                        ComposableLambda composableLambdaRememberComposableLambda4 = ComposableLambdaKt.rememberComposableLambda(1797348480, true, new fc(i31, function11), composer4, 54);
                                        Function3 function15 = function12;
                                        BottomSheetScaffoldState bottomSheetScaffoldState3 = bottomSheetScaffoldState2;
                                        BottomSheetScaffoldKt.a(composableLambdaRememberComposableLambda2, composableLambdaRememberComposableLambda3, composableLambdaRememberComposableLambda4, ComposableLambdaKt.rememberComposableLambda(-1985540705, true, new h3(2, function15, bottomSheetScaffoldState3), composer4, 54), bottomSheetScaffoldState3.f4447a.e, i30, iF, composer4, 3510);
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventEnd();
                                        }
                                    } else {
                                        composer4.skipToGroupEnd();
                                    }
                                    return Unit.f17538a;
                                }
                            }, composer3, 54);
                            composer3.startReplaceGroup(-1335879662);
                            composableLambdaRememberComposableLambda.invoke(composer3, 6);
                            composer3.endReplaceGroup();
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        } else {
                            composer3.skipToGroupEnd();
                        }
                        return Unit.f17538a;
                    }
                }, composerStartRestartGroup, 54), composerStartRestartGroup, ((i19 >> 3) & 14) | 3072, 6);
                composer2 = composerStartRestartGroup;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                function6 = function8;
                j13 = jM1813contentColorForek8zF_U;
                j9 = j26;
                modifier3 = modifier7;
                shape3 = shape4;
                f4 = f5;
                i18 = iM2004getEndERTFSPs;
                j14 = j18;
                j12 = j17;
                z4 = z6;
                function5 = function7;
                long j27 = j16;
                z5 = z9;
                j10 = j27;
                j11 = j20;
                j8 = j15;
            } else {
                composer2 = composerStartRestartGroup;
                composer2.skipToGroupEnd();
                function5 = function3;
                i18 = i;
                j8 = j;
                z4 = z2;
                shape3 = shape2;
                j9 = j3;
                j10 = j4;
                j11 = j5;
                j12 = j6;
                j13 = j7;
                f4 = fM7278constructorimpl;
                function6 = function4;
                modifier3 = modifier2;
                z5 = z;
                j14 = j2;
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: lc
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        float f6 = BottomSheetScaffoldKt.f4445a;
                        int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(i2 | 1);
                        int iUpdateChangedFlags2 = RecomposeScopeImplKt.updateChangedFlags(i3);
                        int iUpdateChangedFlags3 = RecomposeScopeImplKt.updateChangedFlags(i4);
                        BottomSheetScaffoldKt.b(sheetContent, modifier3, bottomSheetScaffoldState, function5, f4, function6, i18, z5, shape, f2, j8, j14, f3, z4, shape3, j9, j10, j11, j12, j13, content, (Composer) obj, iUpdateChangedFlags, iUpdateChangedFlags2, iUpdateChangedFlags3, i5);
                        return Unit.f17538a;
                    }
                });
            }
        }
        i6 |= 48;
        modifier2 = modifier;
        if ((i2 & 384) != 0) {
            if (composerStartRestartGroup.changed(bottomSheetScaffoldState)) {
                i25 = 256;
            } else {
                i25 = 128;
            }
            i6 |= i25;
        }
        i7 = i6 | 27648;
        i8 = i5 & 32;
        if (i8 != 0) {
            if ((196608 & i2) == 0) {
                fM7278constructorimpl = f;
                if (composerStartRestartGroup.changed(fM7278constructorimpl)) {
                    i9 = 131072;
                } else {
                    i9 = 65536;
                }
                i7 |= i9;
            }
            i10 = i5 & 64;
            if (i10 != 0) {
                i7 |= 1572864;
                function4 = function2;
            } else {
                function4 = function2;
                if ((i2 & 1572864) == 0) {
                    if (composerStartRestartGroup.changedInstance(function4)) {
                        i11 = 1048576;
                    } else {
                        i11 = 524288;
                    }
                    i7 |= i11;
                }
            }
            if ((i2 & 12582912) == 0) {
                i7 |= 4194304;
            }
            i12 = i7 | 100663296;
            if ((i2 & 805306368) == 0) {
                if (composerStartRestartGroup.changed(shape)) {
                    i24 = 536870912;
                } else {
                    i24 = 268435456;
                }
                i12 |= i24;
            }
            if ((i3 & 6) == 0) {
                if (composerStartRestartGroup.changed(f2)) {
                    i23 = 4;
                } else {
                    i23 = 2;
                }
                i13 = i3 | i23;
            } else {
                i13 = i3;
            }
            if ((i3 & 48) != 0) {
                if ((i5 & 2048) == 0) {
                    i22 = 16;
                } else {
                    i22 = 16;
                }
                i13 |= i22;
            }
            i14 = i13;
            if ((i3 & 384) == 0) {
                i14 |= 128;
            }
            if ((i3 & 3072) != 0) {
                if (composerStartRestartGroup.changed(f3)) {
                    i21 = 2048;
                } else {
                    i21 = 1024;
                }
                i14 |= i21;
            }
            i15 = 221184 | i14;
            if ((i3 & 1572864) == 0) {
                i15 = 745472 | i14;
            }
            if ((i3 & 12582912) == 0) {
                i15 |= 4194304;
            }
            if ((i3 & 100663296) == 0) {
                i15 |= 33554432;
            }
            if ((i3 & 805306368) == 0) {
                i15 |= 268435456;
            }
            if ((i4 & 6) == 0) {
                i16 = i4 | 2;
            } else {
                i16 = i4;
            }
            if ((i4 & 48) == 0) {
                i16 |= 16;
            }
            if ((i4 & 384) == 0) {
                i16 |= composerStartRestartGroup.changedInstance(content) ? 256 : 128;
            }
            i17 = i15;
            if ((i12 & 306783379) != 306783378) {
                z3 = true;
            } else {
                z3 = true;
            }
            if (composerStartRestartGroup.shouldExecute(z3, i12 & 1)) {
                composerStartRestartGroup.startDefaults();
                if ((i2 & 1) != 0) {
                    if (i26 != 0) {
                        modifier4 = Modifier.INSTANCE;
                    } else {
                        modifier4 = modifier2;
                    }
                    ComposableLambda composableLambda4 = ComposableSingletons$BottomSheetScaffoldKt.f4448a;
                    if (i8 != 0) {
                        fM7278constructorimpl = Dp.m7278constructorimpl(0);
                    }
                    if (i10 != 0) {
                        function4 = null;
                    }
                    iM2004getEndERTFSPs = FabPosition.INSTANCE.m2004getEndERTFSPs();
                    int i214 = (-29360129) & i12;
                    if ((i5 & 2048) != 0) {
                        i17 &= -113;
                        surface = MaterialTheme.INSTANCE.getColorScheme(composerStartRestartGroup, MaterialTheme.$stable).getSurface();
                    } else {
                        surface = j;
                    }
                    long jM1813contentColorForek8zF_U8 = ColorSchemeKt.m1813contentColorForek8zF_U(surface, composerStartRestartGroup, (i17 >> 3) & 14);
                    MaterialTheme materialTheme4 = MaterialTheme.INSTANCE;
                    int i215 = MaterialTheme.$stable;
                    CornerBasedShape large4 = materialTheme4.getShapes(composerStartRestartGroup, i215).getLarge();
                    long j28 = surface;
                    long surface5 = materialTheme4.getColorScheme(composerStartRestartGroup, i215).getSurface();
                    long jM1813contentColorForek8zF_U9 = ColorSchemeKt.m1813contentColorForek8zF_U(surface5, composerStartRestartGroup, 0);
                    long jA4 = DrawerDefaults.a(composerStartRestartGroup);
                    long background4 = materialTheme4.getColorScheme(composerStartRestartGroup, i215).getBackground();
                    i19 = i214;
                    f5 = fM7278constructorimpl;
                    function7 = composableLambda4;
                    i20 = i17 & (-2146960257);
                    shape4 = large4;
                    j15 = j28;
                    j16 = jM1813contentColorForek8zF_U9;
                    z6 = true;
                    j17 = background4;
                    j18 = jM1813contentColorForek8zF_U8;
                    jM1813contentColorForek8zF_U = ColorSchemeKt.m1813contentColorForek8zF_U(background4, composerStartRestartGroup, 0);
                    z7 = true;
                    modifier5 = modifier4;
                    j19 = surface5;
                    function8 = function4;
                    j20 = jA4;
                } else {
                    if (i26 != 0) {
                        modifier4 = Modifier.INSTANCE;
                    } else {
                        modifier4 = modifier2;
                    }
                    ComposableLambda composableLambda5 = ComposableSingletons$BottomSheetScaffoldKt.f4448a;
                    if (i8 != 0) {
                        fM7278constructorimpl = Dp.m7278constructorimpl(0);
                    }
                    if (i10 != 0) {
                        function4 = null;
                    }
                    iM2004getEndERTFSPs = FabPosition.INSTANCE.m2004getEndERTFSPs();
                    int i216 = (-29360129) & i12;
                    if ((i5 & 2048) != 0) {
                        i17 &= -113;
                        surface = MaterialTheme.INSTANCE.getColorScheme(composerStartRestartGroup, MaterialTheme.$stable).getSurface();
                    } else {
                        surface = j;
                    }
                    long jM1813contentColorForek8zF_U10 = ColorSchemeKt.m1813contentColorForek8zF_U(surface, composerStartRestartGroup, (i17 >> 3) & 14);
                    MaterialTheme materialTheme5 = MaterialTheme.INSTANCE;
                    int i217 = MaterialTheme.$stable;
                    CornerBasedShape large5 = materialTheme5.getShapes(composerStartRestartGroup, i217).getLarge();
                    long j29 = surface;
                    long surface6 = materialTheme5.getColorScheme(composerStartRestartGroup, i217).getSurface();
                    long jM1813contentColorForek8zF_U11 = ColorSchemeKt.m1813contentColorForek8zF_U(surface6, composerStartRestartGroup, 0);
                    long jA5 = DrawerDefaults.a(composerStartRestartGroup);
                    long background5 = materialTheme5.getColorScheme(composerStartRestartGroup, i217).getBackground();
                    i19 = i216;
                    f5 = fM7278constructorimpl;
                    function7 = composableLambda5;
                    i20 = i17 & (-2146960257);
                    shape4 = large5;
                    j15 = j29;
                    j16 = jM1813contentColorForek8zF_U11;
                    z6 = true;
                    j17 = background5;
                    j18 = jM1813contentColorForek8zF_U10;
                    jM1813contentColorForek8zF_U = ColorSchemeKt.m1813contentColorForek8zF_U(background5, composerStartRestartGroup, 0);
                    z7 = true;
                    modifier5 = modifier4;
                    j19 = surface6;
                    function8 = function4;
                    j20 = jA5;
                }
                composerStartRestartGroup.endDefaults();
                final long j210 = j19;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1003869831, i19, i20, "app.chalo.livetracking.routedetails.ui.routedetailsbottomsheet.SlidingUpPanelBottomSheetScaffold (BottomSheetScaffold.kt:286)");
                }
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.f17583a, composerStartRestartGroup);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                final CoroutineScope coroutineScope3 = (CoroutineScope) objRememberedValue;
                boolean z10 = z7;
                Modifier modifier8 = modifier5;
                BoxWithConstraintsKt.BoxWithConstraints(modifier8, null, false, ComposableLambdaKt.rememberComposableLambda(-1590672143, true, new Function3(z7, coroutineScope3, z6, shape4, j210, j16, j20, f3, f5, iM2004getEndERTFSPs, j17, jM1813contentColorForek8zF_U, content, shape, j15, j18, f2, sheetContent, function8, function7) { // from class: kc
                    public final /* synthetic */ boolean b;
                    public final /* synthetic */ CoroutineScope c;
                    public final /* synthetic */ Shape d;
                    public final /* synthetic */ float e;
                    public final /* synthetic */ float f;
                    public final /* synthetic */ int g;
                    public final /* synthetic */ long h;
                    public final /* synthetic */ long i;
                    public final /* synthetic */ Function3 j;
                    public final /* synthetic */ Shape k;
                    public final /* synthetic */ long l;
                    public final /* synthetic */ long m;
                    public final /* synthetic */ float n;
                    public final /* synthetic */ Function3 o;
                    public final /* synthetic */ Function2 p;
                    public final /* synthetic */ Function3 q;

                    {
                        this.d = shape4;
                        this.e = f3;
                        this.f = f5;
                        this.g = iM2004getEndERTFSPs;
                        this.h = j17;
                        this.i = jM1813contentColorForek8zF_U;
                        this.j = content;
                        this.k = shape;
                        this.l = j15;
                        this.m = j18;
                        this.n = f2;
                        this.o = sheetContent;
                        this.p = function8;
                        this.q = function7;
                    }

                    /* JADX WARN: Multi-variable type inference failed */
                    @Override // kotlin.jvm.functions.Function3
                    public final Object invoke(Object obj, Object obj2, Object obj3) {
                        BoxWithConstraintsScope BoxWithConstraints = (BoxWithConstraintsScope) obj;
                        Composer composer3 = (Composer) obj2;
                        int iIntValue = ((Integer) obj3).intValue();
                        float f6 = BottomSheetScaffoldKt.f4445a;
                        Intrinsics.i(BoxWithConstraints, "$this$BoxWithConstraints");
                        if ((iIntValue & 6) == 0) {
                            iIntValue |= composer3.changed(BoxWithConstraints) ? 4 : 2;
                        }
                        if (composer3.shouldExecute((iIntValue & 19) != 18, iIntValue & 1)) {
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-1590672143, iIntValue, -1, "app.chalo.livetracking.routedetails.ui.routedetailsbottomsheet.SlidingUpPanelBottomSheetScaffold.<anonymous> (BottomSheetScaffold.kt:289)");
                            }
                            Density density = (Density) composer3.consume(CompositionLocalsKt.getLocalDensity());
                            float fM7242getMaxHeightimpl = Constraints.m7242getMaxHeightimpl(BoxWithConstraints.mo692getConstraintsmsEJaDk());
                            final float f7 = this.e;
                            float fMo404toPx0680j_4 = density.mo404toPx0680j_4(f7);
                            final int iF = MathKt.f(density.mo404toPx0680j_4(this.f));
                            Object objRememberedValue2 = composer3.rememberedValue();
                            Composer.Companion companion = Composer.INSTANCE;
                            if (objRememberedValue2 == companion.getEmpty()) {
                                objRememberedValue2 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Float.valueOf(fM7242getMaxHeightimpl), null, 2, null);
                                composer3.updateRememberedValue(objRememberedValue2);
                            }
                            final MutableState mutableState = (MutableState) objRememberedValue2;
                            float fFloatValue = fM7242getMaxHeightimpl - ((Number) mutableState.getValue()).floatValue();
                            if (fFloatValue < 0.0f) {
                                fFloatValue = 0.0f;
                            }
                            float f8 = fFloatValue + 0.5f;
                            float fMin = Math.min(fM7242getMaxHeightimpl - 0.5f, Math.max(f8, fFloatValue));
                            float f9 = fM7242getMaxHeightimpl - fMo404toPx0680j_4;
                            if (f9 > fM7242getMaxHeightimpl) {
                                f9 = fM7242getMaxHeightimpl;
                            }
                            float fMax = Math.max(f9, fMin + 0.5f);
                            if (fMax > fM7242getMaxHeightimpl) {
                                fMax = fM7242getMaxHeightimpl;
                            }
                            float f10 = fMax - 0.5f;
                            if (f10 < fMin) {
                                f10 = fMin;
                            }
                            float fD = RangesKt.d(fM7242getMaxHeightimpl / 2.0f, fMin, f10);
                            if (fD <= fFloatValue) {
                                fD = fMin;
                            }
                            float fMax2 = Math.max(fMax, fD + 0.5f);
                            if (fMax2 > fM7242getMaxHeightimpl) {
                                fMax2 = fM7242getMaxHeightimpl;
                            }
                            if (fMax2 - fD < 0.5f) {
                                float f11 = fMax2 - 0.5f;
                                if (f11 >= fMin) {
                                    fMin = f11;
                                }
                                fD = fMin;
                            }
                            float fMax3 = Math.max(fMax2, fD + 0.5f);
                            if (fMax3 <= fM7242getMaxHeightimpl) {
                                fM7242getMaxHeightimpl = fMax3;
                            }
                            if (fD <= fFloatValue) {
                                float fMin2 = Math.min(f8, fM7242getMaxHeightimpl - 0.5f);
                                fD = fMin2 < fFloatValue ? fFloatValue : fMin2;
                            }
                            Map mapI = MapsKt.i(new Pair(Float.valueOf(fM7242getMaxHeightimpl), BottomSheetValue.Collapsed), new Pair(Float.valueOf(fD), BottomSheetValue.Expanded), new Pair(Float.valueOf(fFloatValue), BottomSheetValue.ExpandedFull));
                            Modifier.Companion companion2 = Modifier.INSTANCE;
                            final BottomSheetScaffoldState bottomSheetScaffoldState2 = this.f17485a;
                            Modifier modifierC = SwipeableKt.c(NestedScrollModifierKt.nestedScroll$default(companion2, bottomSheetScaffoldState2.f4447a.q, null, 2, null), bottomSheetScaffoldState2.f4447a, mapI, Orientation.Vertical, this.b, false, null, 0.0f, 368);
                            boolean zChanged = composer3.changed(fMo404toPx0680j_4) | composer3.changed(bottomSheetScaffoldState2);
                            CoroutineScope coroutineScope4 = this.c;
                            boolean zChangedInstance = zChanged | composer3.changedInstance(coroutineScope4);
                            Object objRememberedValue3 = composer3.rememberedValue();
                            if (zChangedInstance || objRememberedValue3 == companion.getEmpty()) {
                                la1 la1Var = new la1(fMo404toPx0680j_4, 2, bottomSheetScaffoldState2, mutableState, coroutineScope4);
                                composer3.updateRememberedValue(la1Var);
                                objRememberedValue3 = la1Var;
                            }
                            final Modifier modifierSemantics$default = SemanticsModifierKt.semantics$default(modifierC, false, (Function1) objRememberedValue3, 1, null);
                            final int i30 = this.g;
                            final long j211 = this.h;
                            final long j212 = this.i;
                            final Function3 function9 = this.j;
                            final Shape shape5 = this.k;
                            final long j213 = this.l;
                            final long j214 = this.m;
                            final float f12 = this.n;
                            final Function3 function10 = this.o;
                            final Function2 function11 = this.p;
                            final Function3 function12 = this.q;
                            ComposableLambda composableLambdaRememberComposableLambda = ComposableLambdaKt.rememberComposableLambda(-746703539, true, new Function2() { // from class: oc
                                @Override // kotlin.jvm.functions.Function2
                                public final Object invoke(Object obj4, Object obj5) {
                                    Composer composer4 = (Composer) obj4;
                                    int iIntValue2 = ((Integer) obj5).intValue();
                                    float f13 = BottomSheetScaffoldKt.f4445a;
                                    int i31 = 0;
                                    if (composer4.shouldExecute((iIntValue2 & 3) != 2, iIntValue2 & 1)) {
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventStart(-746703539, iIntValue2, -1, "app.chalo.livetracking.routedetails.ui.routedetailsbottomsheet.SlidingUpPanelBottomSheetScaffold.<anonymous>.<anonymous> (BottomSheetScaffold.kt:331)");
                                        }
                                        final long j215 = j211;
                                        final long j216 = j212;
                                        final Function3 function13 = function9;
                                        final float f14 = f7;
                                        ComposableLambda composableLambdaRememberComposableLambda2 = ComposableLambdaKt.rememberComposableLambda(773192258, true, new Function2() { // from class: qc
                                            @Override // kotlin.jvm.functions.Function2
                                            public final Object invoke(Object obj6, Object obj7) {
                                                Composer composer5 = (Composer) obj6;
                                                int iIntValue3 = ((Integer) obj7).intValue();
                                                float f15 = BottomSheetScaffoldKt.f4445a;
                                                if (composer5.shouldExecute((iIntValue3 & 3) != 2, iIntValue3 & 1)) {
                                                    if (ComposerKt.isTraceInProgress()) {
                                                        ComposerKt.traceEventStart(773192258, iIntValue3, -1, "app.chalo.livetracking.routedetails.ui.routedetailsbottomsheet.SlidingUpPanelBottomSheetScaffold.<anonymous>.<anonymous>.<anonymous> (BottomSheetScaffold.kt:333)");
                                                    }
                                                    SurfaceKt.m2480SurfaceT9BRK9s(null, null, j215, j216, 0.0f, 0.0f, null, ComposableLambdaKt.rememberComposableLambda(115370567, true, new gc(function13, f14), composer5, 54), composer5, 12582912, 115);
                                                    if (ComposerKt.isTraceInProgress()) {
                                                        ComposerKt.traceEventEnd();
                                                    }
                                                } else {
                                                    composer5.skipToGroupEnd();
                                                }
                                                return Unit.f17538a;
                                            }
                                        }, composer4, 54);
                                        final Modifier modifier9 = modifierSemantics$default;
                                        final Shape shape6 = shape5;
                                        final long j217 = j213;
                                        final long j30 = j214;
                                        final float f15 = f12;
                                        final MutableState mutableState2 = mutableState;
                                        final Function3 function14 = function10;
                                        ComposableLambda composableLambdaRememberComposableLambda3 = ComposableLambdaKt.rememberComposableLambda(1285270369, true, new Function2() { // from class: sc
                                            @Override // kotlin.jvm.functions.Function2
                                            public final Object invoke(Object obj6, Object obj7) {
                                                Composer composer5 = (Composer) obj6;
                                                int iIntValue3 = ((Integer) obj7).intValue();
                                                float f16 = BottomSheetScaffoldKt.f4445a;
                                                int i32 = 0;
                                                if (composer5.shouldExecute((iIntValue3 & 3) != 2, iIntValue3 & 1)) {
                                                    if (ComposerKt.isTraceInProgress()) {
                                                        ComposerKt.traceEventStart(1285270369, iIntValue3, -1, "app.chalo.livetracking.routedetails.ui.routedetailsbottomsheet.SlidingUpPanelBottomSheetScaffold.<anonymous>.<anonymous>.<anonymous> (BottomSheetScaffold.kt:344)");
                                                    }
                                                    Modifier modifierM819requiredHeightInVpY3zN4$default = SizeKt.m819requiredHeightInVpY3zN4$default(SizeKt.fillMaxWidth$default(modifier9, 0.0f, 1, null), f14, 0.0f, 2, null);
                                                    Object objRememberedValue4 = composer5.rememberedValue();
                                                    if (objRememberedValue4 == Composer.INSTANCE.getEmpty()) {
                                                        objRememberedValue4 = new g5(mutableState2, 5);
                                                        composer5.updateRememberedValue(objRememberedValue4);
                                                    }
                                                    SurfaceKt.m2480SurfaceT9BRK9s(OnGloballyPositionedModifierKt.onGloballyPositioned(modifierM819requiredHeightInVpY3zN4$default, (Function1) objRememberedValue4), shape6, j217, j30, 0.0f, f15, null, ComposableLambdaKt.rememberComposableLambda(627448678, true, new hc(function14, i32), composer5, 54), composer5, 12582912, 80);
                                                    if (ComposerKt.isTraceInProgress()) {
                                                        ComposerKt.traceEventEnd();
                                                    }
                                                } else {
                                                    composer5.skipToGroupEnd();
                                                }
                                                return Unit.f17538a;
                                            }
                                        }, composer4, 54);
                                        ComposableLambda composableLambdaRememberComposableLambda4 = ComposableLambdaKt.rememberComposableLambda(1797348480, true, new fc(i31, function11), composer4, 54);
                                        Function3 function15 = function12;
                                        BottomSheetScaffoldState bottomSheetScaffoldState3 = bottomSheetScaffoldState2;
                                        BottomSheetScaffoldKt.a(composableLambdaRememberComposableLambda2, composableLambdaRememberComposableLambda3, composableLambdaRememberComposableLambda4, ComposableLambdaKt.rememberComposableLambda(-1985540705, true, new h3(2, function15, bottomSheetScaffoldState3), composer4, 54), bottomSheetScaffoldState3.f4447a.e, i30, iF, composer4, 3510);
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventEnd();
                                        }
                                    } else {
                                        composer4.skipToGroupEnd();
                                    }
                                    return Unit.f17538a;
                                }
                            }, composer3, 54);
                            composer3.startReplaceGroup(-1335879662);
                            composableLambdaRememberComposableLambda.invoke(composer3, 6);
                            composer3.endReplaceGroup();
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        } else {
                            composer3.skipToGroupEnd();
                        }
                        return Unit.f17538a;
                    }
                }, composerStartRestartGroup, 54), composerStartRestartGroup, ((i19 >> 3) & 14) | 3072, 6);
                composer2 = composerStartRestartGroup;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                function6 = function8;
                j13 = jM1813contentColorForek8zF_U;
                j9 = j210;
                modifier3 = modifier8;
                shape3 = shape4;
                f4 = f5;
                i18 = iM2004getEndERTFSPs;
                j14 = j18;
                j12 = j17;
                z4 = z6;
                function5 = function7;
                long j211 = j16;
                z5 = z10;
                j10 = j211;
                j11 = j20;
                j8 = j15;
            } else {
                composer2 = composerStartRestartGroup;
                composer2.skipToGroupEnd();
                function5 = function3;
                i18 = i;
                j8 = j;
                z4 = z2;
                shape3 = shape2;
                j9 = j3;
                j10 = j4;
                j11 = j5;
                j12 = j6;
                j13 = j7;
                f4 = fM7278constructorimpl;
                function6 = function4;
                modifier3 = modifier2;
                z5 = z;
                j14 = j2;
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: lc
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        float f6 = BottomSheetScaffoldKt.f4445a;
                        int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(i2 | 1);
                        int iUpdateChangedFlags2 = RecomposeScopeImplKt.updateChangedFlags(i3);
                        int iUpdateChangedFlags3 = RecomposeScopeImplKt.updateChangedFlags(i4);
                        BottomSheetScaffoldKt.b(sheetContent, modifier3, bottomSheetScaffoldState, function5, f4, function6, i18, z5, shape, f2, j8, j14, f3, z4, shape3, j9, j10, j11, j12, j13, content, (Composer) obj, iUpdateChangedFlags, iUpdateChangedFlags2, iUpdateChangedFlags3, i5);
                        return Unit.f17538a;
                    }
                });
            }
        }
        i7 = 224256 | i6;
        fM7278constructorimpl = f;
        i10 = i5 & 64;
        if (i10 != 0) {
            i7 |= 1572864;
            function4 = function2;
        } else {
            function4 = function2;
            if ((i2 & 1572864) == 0) {
                if (composerStartRestartGroup.changedInstance(function4)) {
                    i11 = 1048576;
                } else {
                    i11 = 524288;
                }
                i7 |= i11;
            }
        }
        if ((i2 & 12582912) == 0) {
            i7 |= 4194304;
        }
        i12 = i7 | 100663296;
        if ((i2 & 805306368) == 0) {
            if (composerStartRestartGroup.changed(shape)) {
                i24 = 536870912;
            } else {
                i24 = 268435456;
            }
            i12 |= i24;
        }
        if ((i3 & 6) == 0) {
            if (composerStartRestartGroup.changed(f2)) {
                i23 = 4;
            } else {
                i23 = 2;
            }
            i13 = i3 | i23;
        } else {
            i13 = i3;
        }
        if ((i3 & 48) != 0) {
            if ((i5 & 2048) == 0) {
                i22 = 16;
            } else {
                i22 = 16;
            }
            i13 |= i22;
        }
        i14 = i13;
        if ((i3 & 384) == 0) {
            i14 |= 128;
        }
        if ((i3 & 3072) != 0) {
            if (composerStartRestartGroup.changed(f3)) {
                i21 = 2048;
            } else {
                i21 = 1024;
            }
            i14 |= i21;
        }
        i15 = 221184 | i14;
        if ((i3 & 1572864) == 0) {
            i15 = 745472 | i14;
        }
        if ((i3 & 12582912) == 0) {
            i15 |= 4194304;
        }
        if ((i3 & 100663296) == 0) {
            i15 |= 33554432;
        }
        if ((i3 & 805306368) == 0) {
            i15 |= 268435456;
        }
        if ((i4 & 6) == 0) {
            i16 = i4 | 2;
        } else {
            i16 = i4;
        }
        if ((i4 & 48) == 0) {
            i16 |= 16;
        }
        if ((i4 & 384) == 0) {
            i16 |= composerStartRestartGroup.changedInstance(content) ? 256 : 128;
        }
        i17 = i15;
        if ((i12 & 306783379) != 306783378) {
            z3 = true;
        } else {
            z3 = true;
        }
        if (composerStartRestartGroup.shouldExecute(z3, i12 & 1)) {
            composerStartRestartGroup.startDefaults();
            if ((i2 & 1) != 0) {
                if (i26 != 0) {
                    modifier4 = Modifier.INSTANCE;
                } else {
                    modifier4 = modifier2;
                }
                ComposableLambda composableLambda6 = ComposableSingletons$BottomSheetScaffoldKt.f4448a;
                if (i8 != 0) {
                    fM7278constructorimpl = Dp.m7278constructorimpl(0);
                }
                if (i10 != 0) {
                    function4 = null;
                }
                iM2004getEndERTFSPs = FabPosition.INSTANCE.m2004getEndERTFSPs();
                int i218 = (-29360129) & i12;
                if ((i5 & 2048) != 0) {
                    i17 &= -113;
                    surface = MaterialTheme.INSTANCE.getColorScheme(composerStartRestartGroup, MaterialTheme.$stable).getSurface();
                } else {
                    surface = j;
                }
                long jM1813contentColorForek8zF_U12 = ColorSchemeKt.m1813contentColorForek8zF_U(surface, composerStartRestartGroup, (i17 >> 3) & 14);
                MaterialTheme materialTheme6 = MaterialTheme.INSTANCE;
                int i219 = MaterialTheme.$stable;
                CornerBasedShape large6 = materialTheme6.getShapes(composerStartRestartGroup, i219).getLarge();
                long j212 = surface;
                long surface7 = materialTheme6.getColorScheme(composerStartRestartGroup, i219).getSurface();
                long jM1813contentColorForek8zF_U13 = ColorSchemeKt.m1813contentColorForek8zF_U(surface7, composerStartRestartGroup, 0);
                long jA6 = DrawerDefaults.a(composerStartRestartGroup);
                long background6 = materialTheme6.getColorScheme(composerStartRestartGroup, i219).getBackground();
                i19 = i218;
                f5 = fM7278constructorimpl;
                function7 = composableLambda6;
                i20 = i17 & (-2146960257);
                shape4 = large6;
                j15 = j212;
                j16 = jM1813contentColorForek8zF_U13;
                z6 = true;
                j17 = background6;
                j18 = jM1813contentColorForek8zF_U12;
                jM1813contentColorForek8zF_U = ColorSchemeKt.m1813contentColorForek8zF_U(background6, composerStartRestartGroup, 0);
                z7 = true;
                modifier5 = modifier4;
                j19 = surface7;
                function8 = function4;
                j20 = jA6;
            } else {
                if (i26 != 0) {
                    modifier4 = Modifier.INSTANCE;
                } else {
                    modifier4 = modifier2;
                }
                ComposableLambda composableLambda7 = ComposableSingletons$BottomSheetScaffoldKt.f4448a;
                if (i8 != 0) {
                    fM7278constructorimpl = Dp.m7278constructorimpl(0);
                }
                if (i10 != 0) {
                    function4 = null;
                }
                iM2004getEndERTFSPs = FabPosition.INSTANCE.m2004getEndERTFSPs();
                int i2110 = (-29360129) & i12;
                if ((i5 & 2048) != 0) {
                    i17 &= -113;
                    surface = MaterialTheme.INSTANCE.getColorScheme(composerStartRestartGroup, MaterialTheme.$stable).getSurface();
                } else {
                    surface = j;
                }
                long jM1813contentColorForek8zF_U14 = ColorSchemeKt.m1813contentColorForek8zF_U(surface, composerStartRestartGroup, (i17 >> 3) & 14);
                MaterialTheme materialTheme7 = MaterialTheme.INSTANCE;
                int i2111 = MaterialTheme.$stable;
                CornerBasedShape large7 = materialTheme7.getShapes(composerStartRestartGroup, i2111).getLarge();
                long j213 = surface;
                long surface8 = materialTheme7.getColorScheme(composerStartRestartGroup, i2111).getSurface();
                long jM1813contentColorForek8zF_U15 = ColorSchemeKt.m1813contentColorForek8zF_U(surface8, composerStartRestartGroup, 0);
                long jA7 = DrawerDefaults.a(composerStartRestartGroup);
                long background7 = materialTheme7.getColorScheme(composerStartRestartGroup, i2111).getBackground();
                i19 = i2110;
                f5 = fM7278constructorimpl;
                function7 = composableLambda7;
                i20 = i17 & (-2146960257);
                shape4 = large7;
                j15 = j213;
                j16 = jM1813contentColorForek8zF_U15;
                z6 = true;
                j17 = background7;
                j18 = jM1813contentColorForek8zF_U14;
                jM1813contentColorForek8zF_U = ColorSchemeKt.m1813contentColorForek8zF_U(background7, composerStartRestartGroup, 0);
                z7 = true;
                modifier5 = modifier4;
                j19 = surface8;
                function8 = function4;
                j20 = jA7;
            }
            composerStartRestartGroup.endDefaults();
            final long j214 = j19;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1003869831, i19, i20, "app.chalo.livetracking.routedetails.ui.routedetailsbottomsheet.SlidingUpPanelBottomSheetScaffold (BottomSheetScaffold.kt:286)");
            }
            objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.f17583a, composerStartRestartGroup);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            final CoroutineScope coroutineScope4 = (CoroutineScope) objRememberedValue;
            boolean z11 = z7;
            Modifier modifier9 = modifier5;
            BoxWithConstraintsKt.BoxWithConstraints(modifier9, null, false, ComposableLambdaKt.rememberComposableLambda(-1590672143, true, new Function3(z7, coroutineScope4, z6, shape4, j214, j16, j20, f3, f5, iM2004getEndERTFSPs, j17, jM1813contentColorForek8zF_U, content, shape, j15, j18, f2, sheetContent, function8, function7) { // from class: kc
                public final /* synthetic */ boolean b;
                public final /* synthetic */ CoroutineScope c;
                public final /* synthetic */ Shape d;
                public final /* synthetic */ float e;
                public final /* synthetic */ float f;
                public final /* synthetic */ int g;
                public final /* synthetic */ long h;
                public final /* synthetic */ long i;
                public final /* synthetic */ Function3 j;
                public final /* synthetic */ Shape k;
                public final /* synthetic */ long l;
                public final /* synthetic */ long m;
                public final /* synthetic */ float n;
                public final /* synthetic */ Function3 o;
                public final /* synthetic */ Function2 p;
                public final /* synthetic */ Function3 q;

                {
                    this.d = shape4;
                    this.e = f3;
                    this.f = f5;
                    this.g = iM2004getEndERTFSPs;
                    this.h = j17;
                    this.i = jM1813contentColorForek8zF_U;
                    this.j = content;
                    this.k = shape;
                    this.l = j15;
                    this.m = j18;
                    this.n = f2;
                    this.o = sheetContent;
                    this.p = function8;
                    this.q = function7;
                }

                /* JADX WARN: Multi-variable type inference failed */
                @Override // kotlin.jvm.functions.Function3
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    BoxWithConstraintsScope BoxWithConstraints = (BoxWithConstraintsScope) obj;
                    Composer composer3 = (Composer) obj2;
                    int iIntValue = ((Integer) obj3).intValue();
                    float f6 = BottomSheetScaffoldKt.f4445a;
                    Intrinsics.i(BoxWithConstraints, "$this$BoxWithConstraints");
                    if ((iIntValue & 6) == 0) {
                        iIntValue |= composer3.changed(BoxWithConstraints) ? 4 : 2;
                    }
                    if (composer3.shouldExecute((iIntValue & 19) != 18, iIntValue & 1)) {
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-1590672143, iIntValue, -1, "app.chalo.livetracking.routedetails.ui.routedetailsbottomsheet.SlidingUpPanelBottomSheetScaffold.<anonymous> (BottomSheetScaffold.kt:289)");
                        }
                        Density density = (Density) composer3.consume(CompositionLocalsKt.getLocalDensity());
                        float fM7242getMaxHeightimpl = Constraints.m7242getMaxHeightimpl(BoxWithConstraints.mo692getConstraintsmsEJaDk());
                        final float f7 = this.e;
                        float fMo404toPx0680j_4 = density.mo404toPx0680j_4(f7);
                        final int iF = MathKt.f(density.mo404toPx0680j_4(this.f));
                        Object objRememberedValue2 = composer3.rememberedValue();
                        Composer.Companion companion = Composer.INSTANCE;
                        if (objRememberedValue2 == companion.getEmpty()) {
                            objRememberedValue2 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Float.valueOf(fM7242getMaxHeightimpl), null, 2, null);
                            composer3.updateRememberedValue(objRememberedValue2);
                        }
                        final MutableState mutableState = (MutableState) objRememberedValue2;
                        float fFloatValue = fM7242getMaxHeightimpl - ((Number) mutableState.getValue()).floatValue();
                        if (fFloatValue < 0.0f) {
                            fFloatValue = 0.0f;
                        }
                        float f8 = fFloatValue + 0.5f;
                        float fMin = Math.min(fM7242getMaxHeightimpl - 0.5f, Math.max(f8, fFloatValue));
                        float f9 = fM7242getMaxHeightimpl - fMo404toPx0680j_4;
                        if (f9 > fM7242getMaxHeightimpl) {
                            f9 = fM7242getMaxHeightimpl;
                        }
                        float fMax = Math.max(f9, fMin + 0.5f);
                        if (fMax > fM7242getMaxHeightimpl) {
                            fMax = fM7242getMaxHeightimpl;
                        }
                        float f10 = fMax - 0.5f;
                        if (f10 < fMin) {
                            f10 = fMin;
                        }
                        float fD = RangesKt.d(fM7242getMaxHeightimpl / 2.0f, fMin, f10);
                        if (fD <= fFloatValue) {
                            fD = fMin;
                        }
                        float fMax2 = Math.max(fMax, fD + 0.5f);
                        if (fMax2 > fM7242getMaxHeightimpl) {
                            fMax2 = fM7242getMaxHeightimpl;
                        }
                        if (fMax2 - fD < 0.5f) {
                            float f11 = fMax2 - 0.5f;
                            if (f11 >= fMin) {
                                fMin = f11;
                            }
                            fD = fMin;
                        }
                        float fMax3 = Math.max(fMax2, fD + 0.5f);
                        if (fMax3 <= fM7242getMaxHeightimpl) {
                            fM7242getMaxHeightimpl = fMax3;
                        }
                        if (fD <= fFloatValue) {
                            float fMin2 = Math.min(f8, fM7242getMaxHeightimpl - 0.5f);
                            fD = fMin2 < fFloatValue ? fFloatValue : fMin2;
                        }
                        Map mapI = MapsKt.i(new Pair(Float.valueOf(fM7242getMaxHeightimpl), BottomSheetValue.Collapsed), new Pair(Float.valueOf(fD), BottomSheetValue.Expanded), new Pair(Float.valueOf(fFloatValue), BottomSheetValue.ExpandedFull));
                        Modifier.Companion companion2 = Modifier.INSTANCE;
                        final BottomSheetScaffoldState bottomSheetScaffoldState2 = this.f17485a;
                        Modifier modifierC = SwipeableKt.c(NestedScrollModifierKt.nestedScroll$default(companion2, bottomSheetScaffoldState2.f4447a.q, null, 2, null), bottomSheetScaffoldState2.f4447a, mapI, Orientation.Vertical, this.b, false, null, 0.0f, 368);
                        boolean zChanged = composer3.changed(fMo404toPx0680j_4) | composer3.changed(bottomSheetScaffoldState2);
                        CoroutineScope coroutineScope5 = this.c;
                        boolean zChangedInstance = zChanged | composer3.changedInstance(coroutineScope5);
                        Object objRememberedValue3 = composer3.rememberedValue();
                        if (zChangedInstance || objRememberedValue3 == companion.getEmpty()) {
                            la1 la1Var = new la1(fMo404toPx0680j_4, 2, bottomSheetScaffoldState2, mutableState, coroutineScope5);
                            composer3.updateRememberedValue(la1Var);
                            objRememberedValue3 = la1Var;
                        }
                        final Modifier modifierSemantics$default = SemanticsModifierKt.semantics$default(modifierC, false, (Function1) objRememberedValue3, 1, null);
                        final int i30 = this.g;
                        final long j215 = this.h;
                        final long j216 = this.i;
                        final Function3 function9 = this.j;
                        final Shape shape5 = this.k;
                        final long j217 = this.l;
                        final long j218 = this.m;
                        final float f12 = this.n;
                        final Function3 function10 = this.o;
                        final Function2 function11 = this.p;
                        final Function3 function12 = this.q;
                        ComposableLambda composableLambdaRememberComposableLambda = ComposableLambdaKt.rememberComposableLambda(-746703539, true, new Function2() { // from class: oc
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj4, Object obj5) {
                                Composer composer4 = (Composer) obj4;
                                int iIntValue2 = ((Integer) obj5).intValue();
                                float f13 = BottomSheetScaffoldKt.f4445a;
                                int i31 = 0;
                                if (composer4.shouldExecute((iIntValue2 & 3) != 2, iIntValue2 & 1)) {
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(-746703539, iIntValue2, -1, "app.chalo.livetracking.routedetails.ui.routedetailsbottomsheet.SlidingUpPanelBottomSheetScaffold.<anonymous>.<anonymous> (BottomSheetScaffold.kt:331)");
                                    }
                                    final long j219 = j215;
                                    final long j2110 = j216;
                                    final Function3 function13 = function9;
                                    final float f14 = f7;
                                    ComposableLambda composableLambdaRememberComposableLambda2 = ComposableLambdaKt.rememberComposableLambda(773192258, true, new Function2() { // from class: qc
                                        @Override // kotlin.jvm.functions.Function2
                                        public final Object invoke(Object obj6, Object obj7) {
                                            Composer composer5 = (Composer) obj6;
                                            int iIntValue3 = ((Integer) obj7).intValue();
                                            float f15 = BottomSheetScaffoldKt.f4445a;
                                            if (composer5.shouldExecute((iIntValue3 & 3) != 2, iIntValue3 & 1)) {
                                                if (ComposerKt.isTraceInProgress()) {
                                                    ComposerKt.traceEventStart(773192258, iIntValue3, -1, "app.chalo.livetracking.routedetails.ui.routedetailsbottomsheet.SlidingUpPanelBottomSheetScaffold.<anonymous>.<anonymous>.<anonymous> (BottomSheetScaffold.kt:333)");
                                                }
                                                SurfaceKt.m2480SurfaceT9BRK9s(null, null, j219, j2110, 0.0f, 0.0f, null, ComposableLambdaKt.rememberComposableLambda(115370567, true, new gc(function13, f14), composer5, 54), composer5, 12582912, 115);
                                                if (ComposerKt.isTraceInProgress()) {
                                                    ComposerKt.traceEventEnd();
                                                }
                                            } else {
                                                composer5.skipToGroupEnd();
                                            }
                                            return Unit.f17538a;
                                        }
                                    }, composer4, 54);
                                    final Modifier modifier10 = modifierSemantics$default;
                                    final Shape shape6 = shape5;
                                    final long j2111 = j217;
                                    final long j30 = j218;
                                    final float f15 = f12;
                                    final MutableState mutableState2 = mutableState;
                                    final Function3 function14 = function10;
                                    ComposableLambda composableLambdaRememberComposableLambda3 = ComposableLambdaKt.rememberComposableLambda(1285270369, true, new Function2() { // from class: sc
                                        @Override // kotlin.jvm.functions.Function2
                                        public final Object invoke(Object obj6, Object obj7) {
                                            Composer composer5 = (Composer) obj6;
                                            int iIntValue3 = ((Integer) obj7).intValue();
                                            float f16 = BottomSheetScaffoldKt.f4445a;
                                            int i32 = 0;
                                            if (composer5.shouldExecute((iIntValue3 & 3) != 2, iIntValue3 & 1)) {
                                                if (ComposerKt.isTraceInProgress()) {
                                                    ComposerKt.traceEventStart(1285270369, iIntValue3, -1, "app.chalo.livetracking.routedetails.ui.routedetailsbottomsheet.SlidingUpPanelBottomSheetScaffold.<anonymous>.<anonymous>.<anonymous> (BottomSheetScaffold.kt:344)");
                                                }
                                                Modifier modifierM819requiredHeightInVpY3zN4$default = SizeKt.m819requiredHeightInVpY3zN4$default(SizeKt.fillMaxWidth$default(modifier10, 0.0f, 1, null), f14, 0.0f, 2, null);
                                                Object objRememberedValue4 = composer5.rememberedValue();
                                                if (objRememberedValue4 == Composer.INSTANCE.getEmpty()) {
                                                    objRememberedValue4 = new g5(mutableState2, 5);
                                                    composer5.updateRememberedValue(objRememberedValue4);
                                                }
                                                SurfaceKt.m2480SurfaceT9BRK9s(OnGloballyPositionedModifierKt.onGloballyPositioned(modifierM819requiredHeightInVpY3zN4$default, (Function1) objRememberedValue4), shape6, j2111, j30, 0.0f, f15, null, ComposableLambdaKt.rememberComposableLambda(627448678, true, new hc(function14, i32), composer5, 54), composer5, 12582912, 80);
                                                if (ComposerKt.isTraceInProgress()) {
                                                    ComposerKt.traceEventEnd();
                                                }
                                            } else {
                                                composer5.skipToGroupEnd();
                                            }
                                            return Unit.f17538a;
                                        }
                                    }, composer4, 54);
                                    ComposableLambda composableLambdaRememberComposableLambda4 = ComposableLambdaKt.rememberComposableLambda(1797348480, true, new fc(i31, function11), composer4, 54);
                                    Function3 function15 = function12;
                                    BottomSheetScaffoldState bottomSheetScaffoldState3 = bottomSheetScaffoldState2;
                                    BottomSheetScaffoldKt.a(composableLambdaRememberComposableLambda2, composableLambdaRememberComposableLambda3, composableLambdaRememberComposableLambda4, ComposableLambdaKt.rememberComposableLambda(-1985540705, true, new h3(2, function15, bottomSheetScaffoldState3), composer4, 54), bottomSheetScaffoldState3.f4447a.e, i30, iF, composer4, 3510);
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                    }
                                } else {
                                    composer4.skipToGroupEnd();
                                }
                                return Unit.f17538a;
                            }
                        }, composer3, 54);
                        composer3.startReplaceGroup(-1335879662);
                        composableLambdaRememberComposableLambda.invoke(composer3, 6);
                        composer3.endReplaceGroup();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    } else {
                        composer3.skipToGroupEnd();
                    }
                    return Unit.f17538a;
                }
            }, composerStartRestartGroup, 54), composerStartRestartGroup, ((i19 >> 3) & 14) | 3072, 6);
            composer2 = composerStartRestartGroup;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            function6 = function8;
            j13 = jM1813contentColorForek8zF_U;
            j9 = j214;
            modifier3 = modifier9;
            shape3 = shape4;
            f4 = f5;
            i18 = iM2004getEndERTFSPs;
            j14 = j18;
            j12 = j17;
            z4 = z6;
            function5 = function7;
            long j215 = j16;
            z5 = z11;
            j10 = j215;
            j11 = j20;
            j8 = j15;
        } else {
            composer2 = composerStartRestartGroup;
            composer2.skipToGroupEnd();
            function5 = function3;
            i18 = i;
            j8 = j;
            z4 = z2;
            shape3 = shape2;
            j9 = j3;
            j10 = j4;
            j11 = j5;
            j12 = j6;
            j13 = j7;
            f4 = fM7278constructorimpl;
            function6 = function4;
            modifier3 = modifier2;
            z5 = z;
            j14 = j2;
        }
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: lc
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    float f6 = BottomSheetScaffoldKt.f4445a;
                    int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(i2 | 1);
                    int iUpdateChangedFlags2 = RecomposeScopeImplKt.updateChangedFlags(i3);
                    int iUpdateChangedFlags3 = RecomposeScopeImplKt.updateChangedFlags(i4);
                    BottomSheetScaffoldKt.b(sheetContent, modifier3, bottomSheetScaffoldState, function5, f4, function6, i18, z5, shape, f2, j8, j14, f3, z4, shape3, j9, j10, j11, j12, j13, content, (Composer) obj, iUpdateChangedFlags, iUpdateChangedFlags2, iUpdateChangedFlags3, i5);
                    return Unit.f17538a;
                }
            });
        }
    }

    public static final BottomSheetScaffoldState c(BottomSheetState bottomSheetState, Composer composer, int i) {
        DrawerState drawerStateD = DrawerKt.d(DrawerValue.Closed, composer);
        if ((i & 2) != 0) {
            bottomSheetState = d(BottomSheetValue.Collapsed, composer);
        }
        Object objRememberedValue = composer.rememberedValue();
        Composer.Companion companion = Composer.INSTANCE;
        if (objRememberedValue == companion.getEmpty()) {
            objRememberedValue = new SnackbarHostState();
            composer.updateRememberedValue(objRememberedValue);
        }
        SnackbarHostState snackbarHostState = (SnackbarHostState) objRememberedValue;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1007575390, 0, -1, "app.chalo.livetracking.routedetails.ui.routedetailsbottomsheet.rememberSlidingUpPanelBottomSheetScaffoldState (BottomSheetScaffold.kt:204)");
        }
        boolean zChanged = composer.changed(drawerStateD) | composer.changed(bottomSheetState) | composer.changed(snackbarHostState);
        Object objRememberedValue2 = composer.rememberedValue();
        if (zChanged || objRememberedValue2 == companion.getEmpty()) {
            objRememberedValue2 = new BottomSheetScaffoldState(drawerStateD, bottomSheetState, snackbarHostState);
            composer.updateRememberedValue(objRememberedValue2);
        }
        BottomSheetScaffoldState bottomSheetScaffoldState = (BottomSheetScaffoldState) objRememberedValue2;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return bottomSheetScaffoldState;
    }

    public static final BottomSheetState d(BottomSheetValue initialValue, Composer composer) {
        Intrinsics.i(initialValue, "initialValue");
        SpringSpec animationSpec = SwipeableDefaults.f4453a;
        Object objRememberedValue = composer.rememberedValue();
        Composer.Companion companion = Composer.INSTANCE;
        if (objRememberedValue == companion.getEmpty()) {
            objRememberedValue = new wa(17);
            composer.updateRememberedValue(objRememberedValue);
        }
        Function1 confirmStateChange = (Function1) objRememberedValue;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1732578030, 6, -1, "app.chalo.livetracking.routedetails.ui.routedetailsbottomsheet.rememberSlidingUpPanelBottomSheetState (BottomSheetScaffold.kt:162)");
        }
        Object[] objArr = {animationSpec};
        Intrinsics.i(animationSpec, "animationSpec");
        Intrinsics.i(confirmStateChange, "confirmStateChange");
        Saver Saver = SaverKt.Saver(new m3(16), new f(14, animationSpec, confirmStateChange));
        boolean zChangedInstance = composer.changedInstance(animationSpec) | composer.changed(confirmStateChange);
        Object objRememberedValue2 = composer.rememberedValue();
        if (zChangedInstance || objRememberedValue2 == companion.getEmpty()) {
            objRememberedValue2 = new m(3, initialValue, animationSpec, confirmStateChange);
            composer.updateRememberedValue(objRememberedValue2);
        }
        BottomSheetState bottomSheetState = (BottomSheetState) RememberSaveableKt.m4084rememberSaveable(objArr, Saver, (Function0) objRememberedValue2, composer, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return bottomSheetState;
    }
}
