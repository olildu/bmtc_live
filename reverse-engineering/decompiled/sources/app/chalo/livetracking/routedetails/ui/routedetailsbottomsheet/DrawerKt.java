package app.chalo.livetracking.routedetails.ui.routedetailsbottomsheet;

import androidx.compose.animation.core.AnimateAsStateKt;
import androidx.compose.animation.core.TweenSpec;
import androidx.compose.foundation.CanvasKt;
import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.gestures.TapGestureDetectorKt;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.BoxWithConstraintsKt;
import androidx.compose.foundation.layout.BoxWithConstraintsScope;
import androidx.compose.foundation.layout.OffsetKt;
import androidx.compose.foundation.layout.SizeKt;
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
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.saveable.RememberSaveableKt;
import androidx.compose.runtime.saveable.Saver;
import androidx.compose.runtime.saveable.SaverKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.input.nestedscroll.NestedScrollModifierKt;
import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import androidx.compose.ui.input.pointer.PointerInputScope;
import androidx.compose.ui.input.pointer.SuspendingPointerInputFilterKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.OnGloballyPositionedModifierKt;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import androidx.core.view.accessibility.AccessibilityEventCompat;
import app.chalo.livetracking.routedetails.ui.routedetailsbottomsheet.BottomDrawerState;
import app.chalo.livetracking.routedetails.ui.routedetailsbottomsheet.BottomDrawerValue;
import app.chalo.livetracking.routedetails.ui.routedetailsbottomsheet.DrawerKt;
import app.chalo.livetracking.routedetails.ui.routedetailsbottomsheet.StringsKt;
import app.chalo.livetracking.routedetails.ui.routedetailsbottomsheet.SwipeableKt;
import com.adjust.sdk.Constants;
import defpackage.cy;
import defpackage.g0;
import defpackage.l6;
import defpackage.m3;
import defpackage.nu;
import defpackage.nw;
import defpackage.tr;
import defpackage.wz;
import defpackage.xz;
import defpackage.yz;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\b\n\u0002\u0010\u0007\n\u0002\b\u0003¨\u0006\u0003²\u0006\u000e\u0010\u0001\u001a\u00020\u00008\n@\nX\u008a\u008e\u0002²\u0006\f\u0010\u0002\u001a\u00020\u00008\nX\u008a\u0084\u0002"}, d2 = {"", "drawerHeight", "alpha", "livetracking_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class DrawerKt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final TweenSpec f4449a;

    static {
        Dp.m7278constructorimpl(56);
        Dp.m7278constructorimpl(Constants.MINIMAL_ERROR_STATUS_CODE);
        f4449a = new TweenSpec(256, 0, null, 6, null);
    }

    public static final void a(final Function3 drawerContent, final Modifier modifier, final BottomDrawerState bottomDrawerState, final boolean z, final Shape shape, final long j, final long j2, long j3, final Function2 content, Composer composer, final int i) {
        int i2;
        final BottomDrawerState bottomDrawerState2;
        boolean z2;
        Shape shape2;
        long j4;
        Composer composer2;
        final long j5;
        long jA;
        int i3;
        Intrinsics.i(drawerContent, "drawerContent");
        Intrinsics.i(content, "content");
        Composer composerStartRestartGroup = composer.startRestartGroup(317510503);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(drawerContent) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changed(modifier) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            bottomDrawerState2 = bottomDrawerState;
            i2 |= composerStartRestartGroup.changed(bottomDrawerState2) ? 256 : 128;
        } else {
            bottomDrawerState2 = bottomDrawerState;
        }
        if ((i & 3072) == 0) {
            z2 = z;
            i2 |= composerStartRestartGroup.changed(z2) ? 2048 : 1024;
        } else {
            z2 = z;
        }
        if ((i & 24576) == 0) {
            shape2 = shape;
            i2 |= composerStartRestartGroup.changed(shape2) ? 16384 : 8192;
        } else {
            shape2 = shape;
        }
        if ((196608 & i) == 0) {
            i2 |= composerStartRestartGroup.changed(j) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            j4 = j2;
            i2 |= composerStartRestartGroup.changed(j4) ? 1048576 : 524288;
        } else {
            j4 = j2;
        }
        if ((12582912 & i) == 0) {
            i2 |= 4194304;
        }
        if ((100663296 & i) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(content) ? AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL : 33554432;
        }
        if (composerStartRestartGroup.shouldExecute((38347923 & i2) != 38347922, i2 & 1)) {
            composerStartRestartGroup.startDefaults();
            if ((i & 1) == 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                jA = DrawerDefaults.a(composerStartRestartGroup);
                i3 = i2 & (-29360129);
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                i3 = i2 & (-29360129);
                jA = j3;
            }
            composerStartRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(317510503, i3, -1, "app.chalo.livetracking.routedetails.ui.routedetailsbottomsheet.BottomDrawer (Drawer.kt:497)");
            }
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.f17583a, composerStartRestartGroup);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            final CoroutineScope coroutineScope = (CoroutineScope) objRememberedValue;
            final boolean z3 = z2;
            final Shape shape3 = shape2;
            final long j6 = jA;
            final long j7 = j4;
            composer2 = composerStartRestartGroup;
            BoxWithConstraintsKt.BoxWithConstraints(SizeKt.fillMaxSize$default(modifier, 0.0f, 1, null), null, false, ComposableLambdaKt.rememberComposableLambda(-1125915951, true, new Function3() { // from class: zz
                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Type inference fix 'apply assigned field type' failed
                java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
                	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
                	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
                	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
                	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
                	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
                	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
                	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
                 */
                @Override // kotlin.jvm.functions.Function3
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    BoxWithConstraintsScope BoxWithConstraints = (BoxWithConstraintsScope) obj;
                    Composer composer3 = (Composer) obj2;
                    int iIntValue = ((Integer) obj3).intValue();
                    TweenSpec tweenSpec = DrawerKt.f4449a;
                    Intrinsics.i(BoxWithConstraints, "$this$BoxWithConstraints");
                    if ((iIntValue & 6) == 0) {
                        iIntValue |= composer3.changed(BoxWithConstraints) ? 4 : 2;
                    }
                    int i4 = 1;
                    if (composer3.shouldExecute((iIntValue & 19) != 18, iIntValue & 1)) {
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-1125915951, iIntValue, -1, "app.chalo.livetracking.routedetails.ui.routedetailsbottomsheet.BottomDrawer.<anonymous> (Drawer.kt:501)");
                        }
                        float fM7242getMaxHeightimpl = Constraints.m7242getMaxHeightimpl(BoxWithConstraints.mo692getConstraintsmsEJaDk());
                        boolean zChanged = composer3.changed(fM7242getMaxHeightimpl);
                        Object objRememberedValue2 = composer3.rememberedValue();
                        if (zChanged || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue2 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Float.valueOf(fM7242getMaxHeightimpl), null, 2, null);
                            composer3.updateRememberedValue(objRememberedValue2);
                        }
                        MutableState mutableState = (MutableState) objRememberedValue2;
                        boolean z4 = Constraints.m7243getMaxWidthimpl(BoxWithConstraints.mo692getConstraintsmsEJaDk()) > Constraints.m7242getMaxHeightimpl(BoxWithConstraints.mo692getConstraintsmsEJaDk());
                        float f = 0.5f * fM7242getMaxHeightimpl;
                        float fMax = Math.max(0.0f, fM7242getMaxHeightimpl - ((Number) mutableState.getValue()).floatValue());
                        Map mapI = (((Number) mutableState.getValue()).floatValue() < f || z4) ? MapsKt.i(new Pair(Float.valueOf(fM7242getMaxHeightimpl), BottomDrawerValue.Closed), new Pair(Float.valueOf(fMax), BottomDrawerValue.Expanded)) : MapsKt.i(new Pair(Float.valueOf(fM7242getMaxHeightimpl), BottomDrawerValue.Closed), new Pair(Float.valueOf(f), BottomDrawerValue.Open), new Pair(Float.valueOf(fMax), BottomDrawerValue.Expanded));
                        Density density = (Density) composer3.consume(CompositionLocalsKt.getLocalDensity());
                        Modifier.Companion companion = Modifier.INSTANCE;
                        Modifier modifierM832sizeInqDBjuR0$default = SizeKt.m832sizeInqDBjuR0$default(companion, 0.0f, 0.0f, density.mo401toDpu2uoSUM(Constraints.m7243getMaxWidthimpl(BoxWithConstraints.mo692getConstraintsmsEJaDk())), density.mo401toDpu2uoSUM(Constraints.m7242getMaxHeightimpl(BoxWithConstraints.mo692getConstraintsmsEJaDk())), 3, null);
                        final boolean z5 = z3;
                        final BottomDrawerState bottomDrawerState3 = bottomDrawerState2;
                        Modifier modifierC = SwipeableKt.c(companion.then(z5 ? NestedScrollModifierKt.nestedScroll$default(companion, bottomDrawerState3.q, null, 2, null) : companion), bottomDrawerState3, mapI, Orientation.Vertical, z5, false, null, 0.0f, 368);
                        MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
                        long currentCompositeKeyHashCode = ComposablesKt.getCurrentCompositeKeyHashCode(composer3, 0);
                        int i5 = (int) (currentCompositeKeyHashCode ^ (currentCompositeKeyHashCode >>> 32));
                        CompositionLocalMap currentCompositionLocalMap = composer3.getCurrentCompositionLocalMap();
                        Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composer3, modifierC);
                        ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
                        Function0<ComposeUiNode> constructor = companion2.getConstructor();
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
                        pk0.v(companion2, composerM3915constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy, composerM3915constructorimpl, currentCompositionLocalMap);
                        Updater.m3923setimpl(composerM3915constructorimpl, modifierMaterializeModifier, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion2, composerM3915constructorimpl, Integer.valueOf(i5), composerM3915constructorimpl));
                        BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                        content.invoke(composer3, 0);
                        boolean zChanged2 = composer3.changed(z5) | composer3.changed(bottomDrawerState3);
                        final CoroutineScope coroutineScope2 = coroutineScope;
                        boolean zChangedInstance = zChanged2 | composer3.changedInstance(coroutineScope2);
                        Object objRememberedValue3 = composer3.rememberedValue();
                        if (zChangedInstance || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue3 = new Function0() { // from class: app.chalo.livetracking.routedetails.ui.routedetailsbottomsheet.b
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    TweenSpec tweenSpec2 = DrawerKt.f4449a;
                                    if (z5) {
                                        BottomDrawerState bottomDrawerState4 = bottomDrawerState3;
                                        if (((Boolean) bottomDrawerState4.b.invoke(BottomDrawerValue.Closed)).booleanValue()) {
                                            BuildersKt.d(coroutineScope2, null, null, new DrawerKt$BottomDrawer$1$1$1$1$1(bottomDrawerState4, null), 3);
                                        }
                                    }
                                    return Unit.f17538a;
                                }
                            };
                            composer3.updateRememberedValue(objRememberedValue3);
                        }
                        DrawerKt.b(j6, (Function0) objRememberedValue3, bottomDrawerState3.d() != BottomDrawerValue.Closed, composer3, 0);
                        String strA = StringsKt.a(composer3, 0);
                        boolean zChanged3 = composer3.changed(bottomDrawerState3);
                        Object objRememberedValue4 = composer3.rememberedValue();
                        int i6 = 17;
                        if (zChanged3 || objRememberedValue4 == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue4 = new qp(bottomDrawerState3, 17);
                            composer3.updateRememberedValue(objRememberedValue4);
                        }
                        Modifier modifierOffset = OffsetKt.offset(modifierM832sizeInqDBjuR0$default, (Function1) objRememberedValue4);
                        boolean zChanged4 = composer3.changed(mutableState);
                        Object objRememberedValue5 = composer3.rememberedValue();
                        if (zChanged4 || objRememberedValue5 == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue5 = new g5(mutableState, i6);
                            composer3.updateRememberedValue(objRememberedValue5);
                        }
                        Modifier modifierOnGloballyPositioned = OnGloballyPositionedModifierKt.onGloballyPositioned(modifierOffset, (Function1) objRememberedValue5);
                        boolean zChanged5 = composer3.changed(strA) | composer3.changed(bottomDrawerState3) | composer3.changedInstance(coroutineScope2);
                        Object objRememberedValue6 = composer3.rememberedValue();
                        if (zChanged5 || objRememberedValue6 == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue6 = new u(24, strA, bottomDrawerState3, coroutineScope2);
                            composer3.updateRememberedValue(objRememberedValue6);
                        }
                        SurfaceKt.m2480SurfaceT9BRK9s(SemanticsModifierKt.semantics$default(modifierOnGloballyPositioned, false, (Function1) objRememberedValue6, 1, null), shape3, j, j7, 0.0f, 0.0f, null, ComposableLambdaKt.rememberComposableLambda(792936336, true, new hc(drawerContent, i4), composer3, 54), composer3, 12582912, 112);
                        composer3.endNode();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    } else {
                        composer3.skipToGroupEnd();
                    }
                    return Unit.f17538a;
                }
            }, composerStartRestartGroup, 54), composer2, 3072, 6);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            j5 = jA;
        } else {
            composer2 = composerStartRestartGroup;
            composer2.skipToGroupEnd();
            j5 = j3;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: a00
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Composer composer3 = (Composer) obj;
                    ((Integer) obj2).getClass();
                    TweenSpec tweenSpec = DrawerKt.f4449a;
                    DrawerKt.a(drawerContent, modifier, bottomDrawerState, z, shape, j, j2, j5, content, composer3, RecomposeScopeImplKt.updateChangedFlags(i | 1));
                    return Unit.f17538a;
                }
            });
        }
    }

    public static final void b(long j, final Function0 function0, boolean z, Composer composer, int i) {
        int i2;
        Modifier modifierSemantics;
        Composer composerStartRestartGroup = composer.startRestartGroup(1046371067);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changed(j) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(function0) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= composerStartRestartGroup.changed(z) ? 256 : 128;
        }
        if (composerStartRestartGroup.shouldExecute((i2 & 147) != 146, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1046371067, i2, -1, "app.chalo.livetracking.routedetails.ui.routedetailsbottomsheet.BottomDrawerScrim (Drawer.kt:614)");
            }
            if (j != 16) {
                composerStartRestartGroup.startReplaceGroup(-432033777);
                int i3 = i2;
                State<Float> stateAnimateFloatAsState = AnimateAsStateKt.animateFloatAsState(z ? 1.0f : 0.0f, new TweenSpec(0, 0, null, 7, null), 0.0f, null, null, composerStartRestartGroup, 48, 28);
                String strA = StringsKt.a(composerStartRestartGroup, 1);
                if (z) {
                    composerStartRestartGroup.startReplaceGroup(-431805307);
                    Modifier.Companion companion = Modifier.INSTANCE;
                    int i4 = i3 & 112;
                    boolean z2 = i4 == 32;
                    Object objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (z2 || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue = new PointerInputEventHandler() { // from class: app.chalo.livetracking.routedetails.ui.routedetailsbottomsheet.DrawerKt$BottomDrawerScrim$dismissModifier$1$1
                            @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
                            public final Object invoke(PointerInputScope pointerInputScope, Continuation continuation) {
                                Object objDetectTapGestures$default = TapGestureDetectorKt.detectTapGestures$default(pointerInputScope, null, null, null, new l6(function0, 10), continuation, 7, null);
                                return objDetectTapGestures$default == CoroutineSingletons.COROUTINE_SUSPENDED ? objDetectTapGestures$default : Unit.f17538a;
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    Modifier modifierPointerInput = SuspendingPointerInputFilterKt.pointerInput(companion, function0, (PointerInputEventHandler) objRememberedValue);
                    boolean zChanged = (i4 == 32) | composerStartRestartGroup.changed(strA);
                    Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                    if (zChanged || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue2 = new wz(strA, function0, 0);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                    }
                    modifierSemantics = SemanticsModifierKt.semantics(modifierPointerInput, true, (Function1) objRememberedValue2);
                    composerStartRestartGroup.endReplaceGroup();
                } else {
                    composerStartRestartGroup.startReplaceGroup(-431488921);
                    composerStartRestartGroup.endReplaceGroup();
                    modifierSemantics = Modifier.INSTANCE;
                }
                Modifier modifierThen = SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null).then(modifierSemantics);
                boolean zChanged2 = composerStartRestartGroup.changed(stateAnimateFloatAsState) | ((i3 & 14) == 4);
                Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                if (zChanged2 || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue3 = new xz(j, stateAnimateFloatAsState, 0);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                }
                CanvasKt.Canvas(modifierThen, (Function1) objRememberedValue3, composerStartRestartGroup, 0);
            } else {
                composerStartRestartGroup.startReplaceGroup(-454586649);
            }
            composerStartRestartGroup.endReplaceGroup();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new yz(j, function0, z, i, 0));
        }
    }

    public static final BottomDrawerState c(BottomDrawerValue initialValue, Composer composer) {
        Intrinsics.i(initialValue, "initialValue");
        Object objRememberedValue = composer.rememberedValue();
        Composer.Companion companion = Composer.INSTANCE;
        if (objRememberedValue == companion.getEmpty()) {
            objRememberedValue = new nw(28);
            composer.updateRememberedValue(objRememberedValue);
        }
        Function1 confirmStateChange = (Function1) objRememberedValue;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1970427379, 6, -1, "app.chalo.livetracking.routedetails.ui.routedetailsbottomsheet.rememberBottomDrawerState (Drawer.kt:328)");
        }
        Object[] objArr = new Object[0];
        Intrinsics.i(confirmStateChange, "confirmStateChange");
        Saver Saver = SaverKt.Saver(new m3(15), new g0(confirmStateChange, 7));
        boolean zChanged = composer.changed(confirmStateChange);
        Object objRememberedValue2 = composer.rememberedValue();
        if (zChanged || objRememberedValue2 == companion.getEmpty()) {
            objRememberedValue2 = new cy(4, initialValue, confirmStateChange);
            composer.updateRememberedValue(objRememberedValue2);
        }
        BottomDrawerState bottomDrawerState = (BottomDrawerState) RememberSaveableKt.m4084rememberSaveable(objArr, Saver, (Function0) objRememberedValue2, composer, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return bottomDrawerState;
    }

    public static final DrawerState d(DrawerValue initialValue, Composer composer) {
        Intrinsics.i(initialValue, "initialValue");
        Object objRememberedValue = composer.rememberedValue();
        Composer.Companion companion = Composer.INSTANCE;
        if (objRememberedValue == companion.getEmpty()) {
            objRememberedValue = new nw(27);
            composer.updateRememberedValue(objRememberedValue);
        }
        Function1 confirmStateChange = (Function1) objRememberedValue;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-2056158770, 6, -1, "app.chalo.livetracking.routedetails.ui.routedetailsbottomsheet.rememberDrawerState (Drawer.kt:312)");
        }
        Object[] objArr = new Object[0];
        Intrinsics.i(confirmStateChange, "confirmStateChange");
        Saver Saver = SaverKt.Saver(new tr(13), new nu(confirmStateChange, 1));
        boolean zChanged = composer.changed(confirmStateChange);
        Object objRememberedValue2 = composer.rememberedValue();
        if (zChanged || objRememberedValue2 == companion.getEmpty()) {
            objRememberedValue2 = new cy(3, initialValue, confirmStateChange);
            composer.updateRememberedValue(objRememberedValue2);
        }
        DrawerState drawerState = (DrawerState) RememberSaveableKt.m4084rememberSaveable(objArr, Saver, (Function0) objRememberedValue2, composer, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return drawerState;
    }
}
