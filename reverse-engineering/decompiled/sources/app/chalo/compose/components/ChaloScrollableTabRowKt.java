package app.chalo.compose.components;

import androidx.compose.animation.core.AnimationVector1D;
import androidx.compose.animation.core.FiniteAnimationSpec;
import androidx.compose.animation.core.Transition;
import androidx.compose.animation.core.TransitionKt;
import androidx.compose.animation.core.TwoWayConverter;
import androidx.compose.animation.core.VectorConvertersKt;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.BorderKt;
import androidx.compose.foundation.BorderStrokeKt;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.OffsetKt;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.pager.PagerState;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material3.TabPosition;
import androidx.compose.material3.TabRowKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.snapshots.Snapshot;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.ZIndexModifierKt;
import androidx.compose.ui.draw.ClipKt;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.unit.Dp;
import androidx.profileinstaller.ProfileVerifier;
import app.chalo.compose.components.ChaloScrollableTabRowKt;
import app.chalo.compose.theme.ChaloTheme;
import defpackage.gl;
import defpackage.hl;
import defpackage.l9;
import defpackage.x;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function5;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003¨\u0006\u0003²\u0006\f\u0010\u0001\u001a\u00020\u00008\nX\u008a\u0084\u0002²\u0006\f\u0010\u0002\u001a\u00020\u00008\nX\u008a\u0084\u0002²\u0006\f\u0010\u0001\u001a\u00020\u00008\nX\u008a\u0084\u0002²\u0006\f\u0010\u0002\u001a\u00020\u00008\nX\u008a\u0084\u0002"}, d2 = {"Landroidx/compose/ui/unit/Dp;", "indicatorStart", "indicatorEnd", "chalo-base_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class ChaloScrollableTabRowKt {
    public static final void a(final List tabs, final PagerState pagerState, final CoroutineScope scope, final Modifier modifier, float f, final Function5 tabContent, Composer composer, final int i, final int i2) {
        int i3;
        float f2;
        Composer composer2;
        final float f3;
        Intrinsics.i(tabs, "tabs");
        Intrinsics.i(pagerState, "pagerState");
        Intrinsics.i(scope, "scope");
        Intrinsics.i(tabContent, "tabContent");
        Composer composerStartRestartGroup = composer.startRestartGroup(-149693395);
        if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changedInstance(tabs) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changed(pagerState) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(scope) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i3 |= composerStartRestartGroup.changed(modifier) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            if ((i2 & 16) == 0) {
                f2 = f;
                int i4 = composerStartRestartGroup.changed(f2) ? 16384 : 8192;
                i3 |= i4;
            } else {
                f2 = f;
            }
            i3 |= i4;
        } else {
            f2 = f;
        }
        if ((196608 & i) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(tabContent) ? 131072 : 65536;
        }
        if (composerStartRestartGroup.shouldExecute((74899 & i3) != 74898, i3 & 1)) {
            composerStartRestartGroup.startDefaults();
            if ((i & 1) != 0 && !composerStartRestartGroup.getDefaultsInvalid()) {
                composerStartRestartGroup.skipToGroupEnd();
                if ((i2 & 16) != 0) {
                    i3 &= -57345;
                }
            } else if ((i2 & 16) != 0) {
                f2 = ChaloTheme.b(composerStartRestartGroup, 6).h;
                i3 &= -57345;
            }
            float f4 = f2;
            int i5 = i3;
            composerStartRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-149693395, i5, -1, "app.chalo.compose.components.ChaloScrollableTabRow (ChaloScrollableTabRow.kt:45)");
            }
            composer2 = composerStartRestartGroup;
            TabRowKt.m2528ScrollableTabRowsKfQg0A(pagerState.getCurrentPage(), SizeKt.m814height3ABfNKs(modifier, ChaloTheme.b(composerStartRestartGroup, 6).m), Color.INSTANCE.m4640getTransparent0d7_KjU(), 0L, f4, ComposableLambdaKt.rememberComposableLambda(-922752179, true, new gl(pagerState, 0), composerStartRestartGroup, 54), ComposableSingletons$ChaloScrollableTabRowKt.f1832a, ComposableLambdaKt.rememberComposableLambda(458684749, true, new l9(tabs, pagerState, scope, tabContent, 1), composerStartRestartGroup, 54), composer2, (i5 & 57344) | 14352768, 8);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            f3 = f4;
        } else {
            composer2 = composerStartRestartGroup;
            composer2.skipToGroupEnd();
            f3 = f2;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: il
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    ChaloScrollableTabRowKt.a(tabs, pagerState, scope, modifier, f3, tabContent, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                    return Unit.f17538a;
                }
            });
        }
    }

    public static final void b(List tabPositions, int i, Composer composer, int i2) {
        int i3;
        Object currentState;
        Object currentState2;
        Intrinsics.i(tabPositions, "tabPositions");
        Composer composerStartRestartGroup = composer.startRestartGroup(-1228773891);
        if ((i2 & 6) == 0) {
            i3 = (composerStartRestartGroup.changedInstance(tabPositions) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= composerStartRestartGroup.changed(i) ? 32 : 16;
        }
        if (composerStartRestartGroup.shouldExecute((i3 & 19) != 18, i3 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1228773891, i3, -1, "app.chalo.compose.components.ChaloTabIndicator (ChaloScrollableTabRow.kt:95)");
            }
            final Transition transitionUpdateTransition = TransitionKt.updateTransition(Integer.valueOf(i), "", composerStartRestartGroup, ((i3 >> 3) & 14) | 48, 0);
            x xVar = new x(4);
            Dp.Companion companion = Dp.INSTANCE;
            TwoWayConverter<Dp, AnimationVector1D> vectorConverter = VectorConvertersKt.getVectorConverter(companion);
            if (transitionUpdateTransition.isSeeking()) {
                composerStartRestartGroup.startReplaceGroup(1666827533);
                composerStartRestartGroup.endReplaceGroup();
                currentState = transitionUpdateTransition.getCurrentState();
            } else {
                composerStartRestartGroup.startReplaceGroup(1666573488);
                boolean zChanged = composerStartRestartGroup.changed(transitionUpdateTransition);
                currentState = composerStartRestartGroup.rememberedValue();
                if (zChanged || currentState == Composer.INSTANCE.getEmpty()) {
                    Snapshot.Companion companion2 = Snapshot.INSTANCE;
                    Snapshot currentThreadSnapshot = companion2.getCurrentThreadSnapshot();
                    Function1<Object, Unit> readObserver = currentThreadSnapshot != null ? currentThreadSnapshot.getReadObserver() : null;
                    Snapshot snapshotMakeCurrentNonObservable = companion2.makeCurrentNonObservable(currentThreadSnapshot);
                    try {
                        Object currentState3 = transitionUpdateTransition.getCurrentState();
                        companion2.restoreNonObservable(currentThreadSnapshot, snapshotMakeCurrentNonObservable, readObserver);
                        composerStartRestartGroup.updateRememberedValue(currentState3);
                        currentState = currentState3;
                    } catch (Throwable th) {
                        companion2.restoreNonObservable(currentThreadSnapshot, snapshotMakeCurrentNonObservable, readObserver);
                        throw th;
                    }
                }
                composerStartRestartGroup.endReplaceGroup();
            }
            int iIntValue = ((Number) currentState).intValue();
            composerStartRestartGroup.startReplaceGroup(1895416849);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1895416849, 0, -1, "app.chalo.compose.components.ChaloTabIndicator.<anonymous> (ChaloScrollableTabRow.kt:107)");
            }
            float left = ((TabPosition) tabPositions.get(iIntValue)).getLeft();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            composerStartRestartGroup.endReplaceGroup();
            Dp dpM7276boximpl = Dp.m7276boximpl(left);
            boolean zChanged2 = composerStartRestartGroup.changed(transitionUpdateTransition);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChanged2 || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = SnapshotStateKt.derivedStateOf(new Function0<Integer>() { // from class: app.chalo.compose.components.ChaloScrollableTabRowKt$ChaloTabIndicator$$inlined$animateDp$1
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return transitionUpdateTransition.getTargetState();
                    }
                });
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            int iIntValue2 = ((Number) ((State) objRememberedValue).getValue()).intValue();
            composerStartRestartGroup.startReplaceGroup(1895416849);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1895416849, 0, -1, "app.chalo.compose.components.ChaloTabIndicator.<anonymous> (ChaloScrollableTabRow.kt:107)");
            }
            float left2 = ((TabPosition) tabPositions.get(iIntValue2)).getLeft();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            composerStartRestartGroup.endReplaceGroup();
            Dp dpM7276boximpl2 = Dp.m7276boximpl(left2);
            boolean zChanged3 = composerStartRestartGroup.changed(transitionUpdateTransition);
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (zChanged3 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue2 = SnapshotStateKt.derivedStateOf(new Function0<Transition.Segment<Integer>>() { // from class: app.chalo.compose.components.ChaloScrollableTabRowKt$ChaloTabIndicator$$inlined$animateDp$2
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return transitionUpdateTransition.getSegment();
                    }
                });
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            State stateCreateTransitionAnimation = TransitionKt.createTransitionAnimation(transitionUpdateTransition, dpM7276boximpl, dpM7276boximpl2, (FiniteAnimationSpec) xVar.invoke(((State) objRememberedValue2).getValue(), composerStartRestartGroup, 0), vectorConverter, "", composerStartRestartGroup, ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE);
            x xVar2 = new x(5);
            TwoWayConverter<Dp, AnimationVector1D> vectorConverter2 = VectorConvertersKt.getVectorConverter(companion);
            if (transitionUpdateTransition.isSeeking()) {
                composerStartRestartGroup.startReplaceGroup(1666827533);
                composerStartRestartGroup.endReplaceGroup();
                currentState2 = transitionUpdateTransition.getCurrentState();
            } else {
                composerStartRestartGroup.startReplaceGroup(1666573488);
                boolean zChanged4 = composerStartRestartGroup.changed(transitionUpdateTransition);
                currentState2 = composerStartRestartGroup.rememberedValue();
                if (zChanged4 || currentState2 == Composer.INSTANCE.getEmpty()) {
                    Snapshot.Companion companion3 = Snapshot.INSTANCE;
                    Snapshot currentThreadSnapshot2 = companion3.getCurrentThreadSnapshot();
                    Function1<Object, Unit> readObserver2 = currentThreadSnapshot2 != null ? currentThreadSnapshot2.getReadObserver() : null;
                    Snapshot snapshotMakeCurrentNonObservable2 = companion3.makeCurrentNonObservable(currentThreadSnapshot2);
                    try {
                        Object currentState4 = transitionUpdateTransition.getCurrentState();
                        companion3.restoreNonObservable(currentThreadSnapshot2, snapshotMakeCurrentNonObservable2, readObserver2);
                        composerStartRestartGroup.updateRememberedValue(currentState4);
                        currentState2 = currentState4;
                    } catch (Throwable th2) {
                        companion3.restoreNonObservable(currentThreadSnapshot2, snapshotMakeCurrentNonObservable2, readObserver2);
                        throw th2;
                    }
                }
                composerStartRestartGroup.endReplaceGroup();
            }
            int iIntValue3 = ((Number) currentState2).intValue();
            composerStartRestartGroup.startReplaceGroup(-1694670326);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1694670326, 0, -1, "app.chalo.compose.components.ChaloTabIndicator.<anonymous> (ChaloScrollableTabRow.kt:120)");
            }
            float fM2518getRightD9Ej5fM = ((TabPosition) tabPositions.get(iIntValue3)).m2518getRightD9Ej5fM();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            composerStartRestartGroup.endReplaceGroup();
            Dp dpM7276boximpl3 = Dp.m7276boximpl(fM2518getRightD9Ej5fM);
            boolean zChanged5 = composerStartRestartGroup.changed(transitionUpdateTransition);
            Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
            if (zChanged5 || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue3 = SnapshotStateKt.derivedStateOf(new Function0<Integer>() { // from class: app.chalo.compose.components.ChaloScrollableTabRowKt$ChaloTabIndicator$$inlined$animateDp$3
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return transitionUpdateTransition.getTargetState();
                    }
                });
                composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
            }
            int iIntValue4 = ((Number) ((State) objRememberedValue3).getValue()).intValue();
            composerStartRestartGroup.startReplaceGroup(-1694670326);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1694670326, 0, -1, "app.chalo.compose.components.ChaloTabIndicator.<anonymous> (ChaloScrollableTabRow.kt:120)");
            }
            float fM2518getRightD9Ej5fM2 = ((TabPosition) tabPositions.get(iIntValue4)).m2518getRightD9Ej5fM();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            composerStartRestartGroup.endReplaceGroup();
            Dp dpM7276boximpl4 = Dp.m7276boximpl(fM2518getRightD9Ej5fM2);
            boolean zChanged6 = composerStartRestartGroup.changed(transitionUpdateTransition);
            Object objRememberedValue4 = composerStartRestartGroup.rememberedValue();
            if (zChanged6 || objRememberedValue4 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue4 = SnapshotStateKt.derivedStateOf(new Function0<Transition.Segment<Integer>>() { // from class: app.chalo.compose.components.ChaloScrollableTabRowKt$ChaloTabIndicator$$inlined$animateDp$4
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return transitionUpdateTransition.getSegment();
                    }
                });
                composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
            }
            BoxKt.Box(ZIndexModifierKt.zIndex(BackgroundKt.m263backgroundbw27NRU(PaddingKt.m786paddingVpY3zN4$default(SizeKt.fillMaxSize$default(SizeKt.m833width3ABfNKs(SizeKt.wrapContentSize$default(OffsetKt.m744offsetVpY3zN4$default(Modifier.INSTANCE, ((Dp) stateCreateTransitionAnimation.getValue()).m7292unboximpl(), 0.0f, 2, null), Alignment.INSTANCE.getBottomStart(), false, 2, null), Dp.m7278constructorimpl(((Dp) TransitionKt.createTransitionAnimation(transitionUpdateTransition, dpM7276boximpl3, dpM7276boximpl4, (FiniteAnimationSpec) xVar2.invoke(((State) objRememberedValue4).getValue(), composerStartRestartGroup, 0), vectorConverter2, "", composerStartRestartGroup, ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE).getValue()).m7292unboximpl() - ((Dp) stateCreateTransitionAnimation.getValue()).m7292unboximpl())), 0.0f, 1, null), ChaloTheme.b(composerStartRestartGroup, 6).d, 0.0f, 2, null), ChaloTheme.a(composerStartRestartGroup, 6).B, RoundedCornerShapeKt.getCircleShape()), 1.0f), composerStartRestartGroup, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new hl(tabPositions, i, i2, 1));
        }
    }

    public static final void c(List tabPositions, int i, Composer composer, int i2) {
        int i3;
        Object currentState;
        Object currentState2;
        Intrinsics.i(tabPositions, "tabPositions");
        Composer composerStartRestartGroup = composer.startRestartGroup(-1816522677);
        if ((i2 & 6) == 0) {
            i3 = (composerStartRestartGroup.changedInstance(tabPositions) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= composerStartRestartGroup.changed(i) ? 32 : 16;
        }
        if (composerStartRestartGroup.shouldExecute((i3 & 19) != 18, i3 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1816522677, i3, -1, "app.chalo.compose.components.ChaloTabIndicatorWithBorder (ChaloScrollableTabRow.kt:142)");
            }
            final Transition transitionUpdateTransition = TransitionKt.updateTransition(Integer.valueOf(i), "", composerStartRestartGroup, ((i3 >> 3) & 14) | 48, 0);
            x xVar = new x(6);
            Dp.Companion companion = Dp.INSTANCE;
            TwoWayConverter<Dp, AnimationVector1D> vectorConverter = VectorConvertersKt.getVectorConverter(companion);
            if (transitionUpdateTransition.isSeeking()) {
                composerStartRestartGroup.startReplaceGroup(1666827533);
                composerStartRestartGroup.endReplaceGroup();
                currentState = transitionUpdateTransition.getCurrentState();
            } else {
                composerStartRestartGroup.startReplaceGroup(1666573488);
                boolean zChanged = composerStartRestartGroup.changed(transitionUpdateTransition);
                currentState = composerStartRestartGroup.rememberedValue();
                if (zChanged || currentState == Composer.INSTANCE.getEmpty()) {
                    Snapshot.Companion companion2 = Snapshot.INSTANCE;
                    Snapshot currentThreadSnapshot = companion2.getCurrentThreadSnapshot();
                    Function1<Object, Unit> readObserver = currentThreadSnapshot != null ? currentThreadSnapshot.getReadObserver() : null;
                    Snapshot snapshotMakeCurrentNonObservable = companion2.makeCurrentNonObservable(currentThreadSnapshot);
                    try {
                        Object currentState3 = transitionUpdateTransition.getCurrentState();
                        companion2.restoreNonObservable(currentThreadSnapshot, snapshotMakeCurrentNonObservable, readObserver);
                        composerStartRestartGroup.updateRememberedValue(currentState3);
                        currentState = currentState3;
                    } catch (Throwable th) {
                        companion2.restoreNonObservable(currentThreadSnapshot, snapshotMakeCurrentNonObservable, readObserver);
                        throw th;
                    }
                }
                composerStartRestartGroup.endReplaceGroup();
            }
            int iIntValue = ((Number) currentState).intValue();
            composerStartRestartGroup.startReplaceGroup(-793647777);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-793647777, 0, -1, "app.chalo.compose.components.ChaloTabIndicatorWithBorder.<anonymous> (ChaloScrollableTabRow.kt:154)");
            }
            float left = ((TabPosition) tabPositions.get(iIntValue)).getLeft();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            composerStartRestartGroup.endReplaceGroup();
            Dp dpM7276boximpl = Dp.m7276boximpl(left);
            boolean zChanged2 = composerStartRestartGroup.changed(transitionUpdateTransition);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChanged2 || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = SnapshotStateKt.derivedStateOf(new Function0<Integer>() { // from class: app.chalo.compose.components.ChaloScrollableTabRowKt$ChaloTabIndicatorWithBorder$$inlined$animateDp$1
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return transitionUpdateTransition.getTargetState();
                    }
                });
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            int iIntValue2 = ((Number) ((State) objRememberedValue).getValue()).intValue();
            composerStartRestartGroup.startReplaceGroup(-793647777);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-793647777, 0, -1, "app.chalo.compose.components.ChaloTabIndicatorWithBorder.<anonymous> (ChaloScrollableTabRow.kt:154)");
            }
            float left2 = ((TabPosition) tabPositions.get(iIntValue2)).getLeft();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            composerStartRestartGroup.endReplaceGroup();
            Dp dpM7276boximpl2 = Dp.m7276boximpl(left2);
            boolean zChanged3 = composerStartRestartGroup.changed(transitionUpdateTransition);
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (zChanged3 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue2 = SnapshotStateKt.derivedStateOf(new Function0<Transition.Segment<Integer>>() { // from class: app.chalo.compose.components.ChaloScrollableTabRowKt$ChaloTabIndicatorWithBorder$$inlined$animateDp$2
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return transitionUpdateTransition.getSegment();
                    }
                });
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            State stateCreateTransitionAnimation = TransitionKt.createTransitionAnimation(transitionUpdateTransition, dpM7276boximpl, dpM7276boximpl2, (FiniteAnimationSpec) xVar.invoke(((State) objRememberedValue2).getValue(), composerStartRestartGroup, 0), vectorConverter, "", composerStartRestartGroup, ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE);
            x xVar2 = new x(7);
            TwoWayConverter<Dp, AnimationVector1D> vectorConverter2 = VectorConvertersKt.getVectorConverter(companion);
            if (transitionUpdateTransition.isSeeking()) {
                composerStartRestartGroup.startReplaceGroup(1666827533);
                composerStartRestartGroup.endReplaceGroup();
                currentState2 = transitionUpdateTransition.getCurrentState();
            } else {
                composerStartRestartGroup.startReplaceGroup(1666573488);
                boolean zChanged4 = composerStartRestartGroup.changed(transitionUpdateTransition);
                currentState2 = composerStartRestartGroup.rememberedValue();
                if (zChanged4 || currentState2 == Composer.INSTANCE.getEmpty()) {
                    Snapshot.Companion companion3 = Snapshot.INSTANCE;
                    Snapshot currentThreadSnapshot2 = companion3.getCurrentThreadSnapshot();
                    Function1<Object, Unit> readObserver2 = currentThreadSnapshot2 != null ? currentThreadSnapshot2.getReadObserver() : null;
                    Snapshot snapshotMakeCurrentNonObservable2 = companion3.makeCurrentNonObservable(currentThreadSnapshot2);
                    try {
                        Object currentState4 = transitionUpdateTransition.getCurrentState();
                        companion3.restoreNonObservable(currentThreadSnapshot2, snapshotMakeCurrentNonObservable2, readObserver2);
                        composerStartRestartGroup.updateRememberedValue(currentState4);
                        currentState2 = currentState4;
                    } catch (Throwable th2) {
                        companion3.restoreNonObservable(currentThreadSnapshot2, snapshotMakeCurrentNonObservable2, readObserver2);
                        throw th2;
                    }
                }
                composerStartRestartGroup.endReplaceGroup();
            }
            int iIntValue3 = ((Number) currentState2).intValue();
            composerStartRestartGroup.startReplaceGroup(-1492705256);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1492705256, 0, -1, "app.chalo.compose.components.ChaloTabIndicatorWithBorder.<anonymous> (ChaloScrollableTabRow.kt:167)");
            }
            float fM2518getRightD9Ej5fM = ((TabPosition) tabPositions.get(iIntValue3)).m2518getRightD9Ej5fM();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            composerStartRestartGroup.endReplaceGroup();
            Dp dpM7276boximpl3 = Dp.m7276boximpl(fM2518getRightD9Ej5fM);
            boolean zChanged5 = composerStartRestartGroup.changed(transitionUpdateTransition);
            Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
            if (zChanged5 || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue3 = SnapshotStateKt.derivedStateOf(new Function0<Integer>() { // from class: app.chalo.compose.components.ChaloScrollableTabRowKt$ChaloTabIndicatorWithBorder$$inlined$animateDp$3
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return transitionUpdateTransition.getTargetState();
                    }
                });
                composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
            }
            int iIntValue4 = ((Number) ((State) objRememberedValue3).getValue()).intValue();
            composerStartRestartGroup.startReplaceGroup(-1492705256);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1492705256, 0, -1, "app.chalo.compose.components.ChaloTabIndicatorWithBorder.<anonymous> (ChaloScrollableTabRow.kt:167)");
            }
            float fM2518getRightD9Ej5fM2 = ((TabPosition) tabPositions.get(iIntValue4)).m2518getRightD9Ej5fM();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            composerStartRestartGroup.endReplaceGroup();
            Dp dpM7276boximpl4 = Dp.m7276boximpl(fM2518getRightD9Ej5fM2);
            boolean zChanged6 = composerStartRestartGroup.changed(transitionUpdateTransition);
            Object objRememberedValue4 = composerStartRestartGroup.rememberedValue();
            if (zChanged6 || objRememberedValue4 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue4 = SnapshotStateKt.derivedStateOf(new Function0<Transition.Segment<Integer>>() { // from class: app.chalo.compose.components.ChaloScrollableTabRowKt$ChaloTabIndicatorWithBorder$$inlined$animateDp$4
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return transitionUpdateTransition.getSegment();
                    }
                });
                composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
            }
            BoxKt.Box(ZIndexModifierKt.zIndex(BorderKt.border(BackgroundKt.m263backgroundbw27NRU(ClipKt.clip(PaddingKt.m786paddingVpY3zN4$default(SizeKt.fillMaxSize$default(SizeKt.m833width3ABfNKs(SizeKt.wrapContentSize$default(OffsetKt.m744offsetVpY3zN4$default(Modifier.INSTANCE, ((Dp) stateCreateTransitionAnimation.getValue()).m7292unboximpl(), 0.0f, 2, null), Alignment.INSTANCE.getBottomStart(), false, 2, null), Dp.m7278constructorimpl(((Dp) TransitionKt.createTransitionAnimation(transitionUpdateTransition, dpM7276boximpl3, dpM7276boximpl4, (FiniteAnimationSpec) xVar2.invoke(((State) objRememberedValue4).getValue(), composerStartRestartGroup, 0), vectorConverter2, "", composerStartRestartGroup, ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE).getValue()).m7292unboximpl() - ((Dp) stateCreateTransitionAnimation.getValue()).m7292unboximpl())), 0.0f, 1, null), ChaloTheme.b(composerStartRestartGroup, 6).d, 0.0f, 2, null), RoundedCornerShapeKt.getCircleShape()), ChaloTheme.a(composerStartRestartGroup, 6).y0, ChaloTheme.d(composerStartRestartGroup, 6).f), BorderStrokeKt.m290BorderStrokecXLIe8U(ChaloTheme.b(composerStartRestartGroup, 6).b, ChaloTheme.a(composerStartRestartGroup, 6).B), ChaloTheme.d(composerStartRestartGroup, 6).f), 1.0f), composerStartRestartGroup, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new hl(tabPositions, i, i2, 0));
        }
    }
}
