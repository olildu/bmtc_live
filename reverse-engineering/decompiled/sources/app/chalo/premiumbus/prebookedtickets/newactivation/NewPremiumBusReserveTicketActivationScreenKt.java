package app.chalo.premiumbus.prebookedtickets.newactivation;

import androidx.compose.animation.core.AnimateAsStateKt;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.ImageKt;
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
import androidx.compose.foundation.shape.CornerSizeKt;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material3.BottomSheetScaffoldKt;
import androidx.compose.material3.BottomSheetScaffoldState;
import androidx.compose.material3.CardDefaults;
import androidx.compose.material3.CardKt;
import androidx.compose.material3.SwitchColors;
import androidx.compose.material3.SwitchDefaults;
import androidx.compose.material3.SwitchKt;
import androidx.compose.material3.TextKt;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableFloatState;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.PrimitiveSnapshotStateKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.ClipKt;
import androidx.compose.ui.draw.RotateKt;
import androidx.compose.ui.draw.ScaleKt;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.layout.ContentScale;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.unit.Dp;
import androidx.constraintlayout.motion.widget.Key;
import androidx.profileinstaller.ProfileVerifier;
import app.chalo.compose.LocalBackHandlerKt;
import app.chalo.compose.components.ChaloSnackbarKt;
import app.chalo.compose.components.ChaloSpacersKt;
import app.chalo.compose.components.ComposeUtils_androidKt;
import app.chalo.compose.components.ShadowElementKt;
import app.chalo.compose.components.buttons.ChaloCircularBackButtonKt;
import app.chalo.compose.components.buttons.ChaloFilledButtonKt;
import app.chalo.compose.components.shimmer.ShimmerEffectKt;
import app.chalo.compose.insets.NavigationBottomInsets_androidKt;
import app.chalo.compose.resources.PainterResourceHelperKt;
import app.chalo.compose.resources.StringResourcesHelperKt;
import app.chalo.compose.theme.ChaloTheme;
import app.chalo.compose.theme.ChaloTypographyKt;
import app.chalo.livetracking.routedetails.ui.routedetailsbottomsheet.BottomDrawerState;
import app.chalo.livetracking.routedetails.ui.routedetailsbottomsheet.BottomDrawerValue;
import app.chalo.livetracking.routedetails.ui.routedetailsbottomsheet.DrawerKt;
import app.chalo.premiumbus.prebookedtickets.ui.activation.PremiumBusActivationScreenBottomSheetTypes;
import app.chalo.premiumbus.prebookedtickets.ui.newactivation.NewPremiumBusReserveTicketActivationState;
import app.chalo.premiumbus.prebookedtickets.ui.newactivation.NewPremiumReserveTicketDetailsScreenType;
import app.chalo.premiumbus.prebookedtickets.ui.newactivation.StopsBetweenPickUpAndDropDialogData;
import app.chalo.premiumbus.ui.stopdetails.PBStopDetailsZoomedImageState;
import app.chalo.premiumbus.ui.stopdetails.compose.PBStopDetailsMainScreenKt;
import app.chalo.providers.iconassetprovider.IconType;
import app.chalo.providers.stringprovider.StringEnum;
import com.google.firebase.messaging.ServiceStarter;
import defpackage.b3;
import defpackage.dq;
import defpackage.fn0;
import defpackage.gn0;
import defpackage.h5;
import defpackage.hn;
import defpackage.hn0;
import defpackage.i41;
import defpackage.im0;
import defpackage.lh;
import defpackage.n20;
import defpackage.nh;
import defpackage.ob;
import defpackage.p80;
import defpackage.pk0;
import defpackage.qm0;
import defpackage.r1;
import defpackage.t3;
import defpackage.wm0;
import defpackage.xc;
import defpackage.xm0;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002¨\u0006\u0006²\u0006\u000e\u0010\u0001\u001a\u00020\u00008\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010\u0002\u001a\u00020\u00008\n@\nX\u008a\u008e\u0002²\u0006\f\u0010\u0003\u001a\u00020\u00008\nX\u008a\u0084\u0002²\u0006\u000e\u0010\u0002\u001a\u00020\u00008\n@\nX\u008a\u008e\u0002²\u0006\f\u0010\u0003\u001a\u00020\u00008\nX\u008a\u0084\u0002²\u0006\u000e\u0010\u0005\u001a\u00020\u00048\n@\nX\u008a\u008e\u0002"}, d2 = {"", "factor", "animatedValue", Key.ROTATION, "", "trafficViewToggleState", "home_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class NewPremiumBusReserveTicketActivationScreenKt {

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f7325a;

        static {
            int[] iArr = new int[NewPremiumReserveTicketDetailsScreenType.values().length];
            try {
                iArr[NewPremiumReserveTicketDetailsScreenType.PRE_VALIDATION.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[NewPremiumReserveTicketDetailsScreenType.POST_VALIDATION.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f7325a = iArr;
        }
    }

    public static final void a(NewPremiumBusReserveTicketActivationState newPremiumBusReserveTicketActivationState, BottomSheetScaffoldState bottomSheetScaffoldState, Function1 function1, Composer composer, int i) {
        int i2;
        Composer composer2;
        boolean z;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1414555840);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(newPremiumBusReserveTicketActivationState) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changed(bottomSheetScaffoldState) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(function1) ? 256 : 128;
        }
        if (composerStartRestartGroup.shouldExecute((i2 & 147) != 146, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1414555840, i2, -1, "app.chalo.premiumbus.prebookedtickets.newactivation.NewPremiumBusActivationMapAndTicketDetailsScreen (NewPremiumBusReserveTicketActivationScreen.kt:360)");
            }
            float fB = ComposeUtils_androidKt.b(composerStartRestartGroup);
            float fM7278constructorimpl = Dp.m7278constructorimpl((ComposeUtils_androidKt.b(composerStartRestartGroup) / 2) - 100);
            float f = ChaloTheme.b(composerStartRestartGroup, 0).o;
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            Composer.Companion companion = Composer.INSTANCE;
            if (objRememberedValue == companion.getEmpty()) {
                objRememberedValue = PrimitiveSnapshotStateKt.mutableFloatStateOf(0.0f);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            MutableFloatState mutableFloatState = (MutableFloatState) objRememberedValue;
            Function0 function0 = (Function0) composerStartRestartGroup.consume(LocalBackHandlerKt.f1812a);
            float fM7278constructorimpl2 = Dp.m7278constructorimpl(ComposeUtils_androidKt.b(composerStartRestartGroup) - NavigationBottomInsets_androidKt.a());
            Modifier.Companion companion2 = Modifier.INSTANCE;
            Modifier modifierFillMaxSize$default = SizeKt.fillMaxSize$default(companion2, 0.0f, 1, null);
            Alignment.Companion companion3 = Alignment.INSTANCE;
            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(companion3.getTopStart(), false);
            long currentCompositeKeyHashCode = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
            int i3 = (int) (currentCompositeKeyHashCode ^ (currentCompositeKeyHashCode >>> 32));
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierFillMaxSize$default);
            ComposeUiNode.Companion companion4 = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor = companion4.getConstructor();
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
            pk0.v(companion4, composerM3915constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy, composerM3915constructorimpl, currentCompositionLocalMap);
            Updater.m3923setimpl(composerM3915constructorimpl, modifierMaterializeModifier, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion4, composerM3915constructorimpl, Integer.valueOf(i3), composerM3915constructorimpl));
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            Arrangement arrangement = Arrangement.INSTANCE;
            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(arrangement.getTop(), companion3.getStart(), composerStartRestartGroup, 0);
            long currentCompositeKeyHashCode2 = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
            int i4 = (int) (currentCompositeKeyHashCode2 ^ (currentCompositeKeyHashCode2 >>> 32));
            CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, companion2);
            Function0<ComposeUiNode> constructor2 = companion4.getConstructor();
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
            pk0.v(companion4, composerM3915constructorimpl2, measurePolicyColumnMeasurePolicy, composerM3915constructorimpl2, currentCompositionLocalMap2);
            Updater.m3923setimpl(composerM3915constructorimpl2, modifierMaterializeModifier2, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion4, composerM3915constructorimpl2, Integer.valueOf(i4), composerM3915constructorimpl2));
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue2 == companion.getEmpty()) {
                objRememberedValue2 = PrimitiveSnapshotStateKt.mutableFloatStateOf(0.0f);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            MutableFloatState mutableFloatState2 = (MutableFloatState) objRememberedValue2;
            if (mutableFloatState2.getFloatValue() != mutableFloatState.getFloatValue()) {
                mutableFloatState2.setFloatValue(mutableFloatState.getFloatValue());
            }
            State<Float> stateAnimateFloatAsState = AnimateAsStateKt.animateFloatAsState(mutableFloatState2.getFloatValue(), AnimationSpecKt.tween$default(ServiceStarter.ERROR_UNKNOWN, 0, null, 6, null), 0.0f, "", null, composerStartRestartGroup, 3120, 20);
            float fM7278constructorimpl3 = Dp.m7278constructorimpl(ComposeUtils_androidKt.b(composerStartRestartGroup) - f);
            Modifier modifierA = dq.a(columnScopeInstance, companion2, 1.0f, false, 2, null);
            MeasurePolicy measurePolicyColumnMeasurePolicy2 = ColumnKt.columnMeasurePolicy(arrangement.getTop(), companion3.getStart(), composerStartRestartGroup, 0);
            long currentCompositeKeyHashCode3 = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
            int i5 = (int) (currentCompositeKeyHashCode3 ^ (currentCompositeKeyHashCode3 >>> 32));
            CompositionLocalMap currentCompositionLocalMap3 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier3 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierA);
            Function0<ComposeUiNode> constructor3 = companion4.getConstructor();
            if (composerStartRestartGroup.getApplier() == null) {
                ComposablesKt.invalidApplier();
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.createNode(constructor3);
            } else {
                composerStartRestartGroup.useNode();
            }
            Composer composerM3915constructorimpl3 = Updater.m3915constructorimpl(composerStartRestartGroup);
            pk0.v(companion4, composerM3915constructorimpl3, measurePolicyColumnMeasurePolicy2, composerM3915constructorimpl3, currentCompositionLocalMap3);
            Updater.m3923setimpl(composerM3915constructorimpl3, modifierMaterializeModifier3, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion4, composerM3915constructorimpl3, Integer.valueOf(i5), composerM3915constructorimpl3));
            Modifier modifierClipToBounds = ClipKt.clipToBounds(SizeKt.m816heightInVpY3zN4$default(SizeKt.fillMaxSize$default(companion2, 0.0f, 1, null), 0.0f, fM7278constructorimpl2, 1, null));
            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy2 = BoxKt.maybeCachedBoxMeasurePolicy(companion3.getTopStart(), false);
            long currentCompositeKeyHashCode4 = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
            int i6 = (int) (currentCompositeKeyHashCode4 ^ (currentCompositeKeyHashCode4 >>> 32));
            CompositionLocalMap currentCompositionLocalMap4 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier4 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierClipToBounds);
            Function0<ComposeUiNode> constructor4 = companion4.getConstructor();
            if (composerStartRestartGroup.getApplier() == null) {
                ComposablesKt.invalidApplier();
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.createNode(constructor4);
            } else {
                composerStartRestartGroup.useNode();
            }
            Composer composerM3915constructorimpl4 = Updater.m3915constructorimpl(composerStartRestartGroup);
            pk0.v(companion4, composerM3915constructorimpl4, measurePolicyMaybeCachedBoxMeasurePolicy2, composerM3915constructorimpl4, currentCompositionLocalMap4);
            Updater.m3923setimpl(composerM3915constructorimpl4, modifierMaterializeModifier4, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion4, composerM3915constructorimpl4, Integer.valueOf(i6), composerM3915constructorimpl4));
            int i7 = i2;
            BottomSheetScaffoldKt.m1663BottomSheetScaffoldsdMYb0k(ComposableLambdaKt.rememberComposableLambda(173008327, true, new hn(newPremiumBusReserveTicketActivationState, function1, fM7278constructorimpl3, fB, f, mutableFloatState, stateAnimateFloatAsState), composerStartRestartGroup, 54), null, bottomSheetScaffoldState, fM7278constructorimpl, 0.0f, ChaloTheme.d(composerStartRestartGroup, 0).j, ChaloTheme.a(composerStartRestartGroup, 0).t, ChaloTheme.a(composerStartRestartGroup, 0).t, 0.0f, ChaloTheme.b(composerStartRestartGroup, 0).f1916a, ComposableLambdaKt.rememberComposableLambda(-1164982752, true, new xm0(mutableFloatState, 1), composerStartRestartGroup, 54), false, null, null, ChaloTheme.a(composerStartRestartGroup, 0).t, ChaloTheme.a(composerStartRestartGroup, 0).t, ComposableLambdaKt.rememberComposableLambda(1548337181, true, new fn0(fB, fM7278constructorimpl, newPremiumBusReserveTicketActivationState, function1), composerStartRestartGroup, 54), composerStartRestartGroup, ((i7 << 3) & 896) | 6, 1572870, 14610);
            composer2 = composerStartRestartGroup;
            composer2.endNode();
            composer2.endNode();
            NewPremiumReserveTicketDetailsScreenType newPremiumReserveTicketDetailsScreenType = newPremiumBusReserveTicketActivationState.l;
            int i8 = newPremiumReserveTicketDetailsScreenType == null ? -1 : WhenMappings.f7325a[newPremiumReserveTicketDetailsScreenType.ordinal()];
            if (i8 == -1) {
                z = false;
            } else if (i8 != 1) {
                if (i8 != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                z = false;
            } else {
                z = true;
            }
            Modifier modifierM264backgroundbw27NRU$default = BackgroundKt.m264backgroundbw27NRU$default(companion2, ChaloTheme.a(composer2, 0).E, null, 2, null);
            int i9 = i7 & 896;
            boolean z2 = i9 == 256;
            Object objRememberedValue3 = composer2.rememberedValue();
            if (z2 || objRememberedValue3 == companion.getEmpty()) {
                objRememberedValue3 = new qm0(function1, 6);
                composer2.updateRememberedValue(objRememberedValue3);
            }
            Function0 function2 = (Function0) objRememberedValue3;
            boolean z3 = i9 == 256;
            Object objRememberedValue4 = composer2.rememberedValue();
            if (z3 || objRememberedValue4 == companion.getEmpty()) {
                objRememberedValue4 = new qm0(function1, 7);
                composer2.updateRememberedValue(objRememberedValue4);
            }
            h(modifierM264backgroundbw27NRU$default, z, function2, (Function0) objRememberedValue4, composer2, 0);
            if (newPremiumBusReserveTicketActivationState.s) {
                composer2.startReplaceGroup(-984377559);
                String strC = StringResourcesHelperKt.c(StringEnum.PREMIUM_BUS_ROUTE_FETCH_ERROR, new Object[0], composer2, 6);
                boolean z4 = i9 == 256;
                Object objRememberedValue5 = composer2.rememberedValue();
                if (z4 || objRememberedValue5 == companion.getEmpty()) {
                    objRememberedValue5 = new qm0(function1, 8);
                    composer2.updateRememberedValue(objRememberedValue5);
                }
                ChaloSnackbarKt.a(null, strC, null, (Function0) objRememberedValue5, composer2, 0, 5);
            } else {
                composer2.startReplaceGroup(-1008164634);
            }
            composer2.endReplaceGroup();
            composer2.endNode();
            composer2.endNode();
            float floatValue = mutableFloatState.getFloatValue();
            boolean zChanged = composer2.changed(function0);
            Object objRememberedValue6 = composer2.rememberedValue();
            if (zChanged || objRememberedValue6 == companion.getEmpty()) {
                objRememberedValue6 = new p80(function0, 15);
                composer2.updateRememberedValue(objRememberedValue6);
            }
            g(floatValue, (Function0) objRememberedValue6, PaddingKt.m788paddingqDBjuR0$default(SizeKt.fillMaxWidth$default(companion2, 0.0f, 1, null), ChaloTheme.b(composer2, 0).f, ChaloTheme.b(composer2, 0).f, ChaloTheme.b(composer2, 0).f, 0.0f, 8, null), composer2, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer2 = composerStartRestartGroup;
            composer2.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new wm0(i, 3, newPremiumBusReserveTicketActivationState, bottomSheetScaffoldState, function1));
        }
    }

    public static final void b(NewPremiumBusReserveTicketActivationState newPremiumBusReserveTicketActivationState, BottomSheetScaffoldState bottomSheetScaffoldState, BottomDrawerState bottomDrawerState, Function1 function1, Composer composer, int i) {
        int i2;
        boolean z;
        BottomDrawerState bottomDrawerState2 = bottomDrawerState;
        Composer composerStartRestartGroup = composer.startRestartGroup(605157661);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(newPremiumBusReserveTicketActivationState) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changed(bottomSheetScaffoldState) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= composerStartRestartGroup.changed(bottomDrawerState2) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(function1) ? 2048 : 1024;
        }
        if (composerStartRestartGroup.shouldExecute((i2 & 1171) != 1170, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(605157661, i2, -1, "app.chalo.premiumbus.prebookedtickets.newactivation.NewPremiumBusActivationScreenMainScreen (NewPremiumBusReserveTicketActivationScreen.kt:132)");
            }
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            Composer.Companion companion = Composer.INSTANCE;
            if (objRememberedValue == companion.getEmpty()) {
                objRememberedValue = EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.f17583a, composerStartRestartGroup);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            CoroutineScope coroutineScope = (CoroutineScope) objRememberedValue;
            if (bottomDrawerState2.c.getValue() == BottomDrawerValue.Expanded) {
                PremiumBusActivationScreenBottomSheetTypes premiumBusActivationScreenBottomSheetTypes = newPremiumBusReserveTicketActivationState.j;
                z = premiumBusActivationScreenBottomSheetTypes != null ? premiumBusActivationScreenBottomSheetTypes.f7356a : true;
            } else {
                z = false;
            }
            int i3 = i2 & 896;
            DrawerKt.a(ComposableLambdaKt.rememberComposableLambda(-777596572, true, new ob(14, newPremiumBusReserveTicketActivationState, function1, coroutineScope), composerStartRestartGroup, 54), SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null), bottomDrawerState2, z, RoundedCornerShapeKt.m1076RoundedCornerShapea9UjIt4$default(ChaloTheme.b(composerStartRestartGroup, 0).e, ChaloTheme.b(composerStartRestartGroup, 0).e, 0.0f, 0.0f, 12, null), ChaloTheme.a(composerStartRestartGroup, 0).t, ChaloTheme.a(composerStartRestartGroup, 0).t, 0L, ComposableLambdaKt.rememberComposableLambda(-788220948, true, new h5(7, newPremiumBusReserveTicketActivationState, bottomSheetScaffoldState, function1), composerStartRestartGroup, 54), composerStartRestartGroup, 100663350 | i3);
            bottomDrawerState2 = bottomDrawerState2;
            PremiumBusActivationScreenBottomSheetTypes premiumBusActivationScreenBottomSheetTypes2 = newPremiumBusReserveTicketActivationState.j;
            boolean zChangedInstance = composerStartRestartGroup.changedInstance(newPremiumBusReserveTicketActivationState) | (i3 == 256);
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance || objRememberedValue2 == companion.getEmpty()) {
                objRememberedValue2 = new NewPremiumBusReserveTicketActivationScreenKt$NewPremiumBusActivationScreenMainScreen$3$1(newPremiumBusReserveTicketActivationState, bottomDrawerState2, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            EffectsKt.LaunchedEffect(premiumBusActivationScreenBottomSheetTypes2, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue2, composerStartRestartGroup, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new gn0(newPremiumBusReserveTicketActivationState, bottomSheetScaffoldState, bottomDrawerState2, function1, i, 1));
        }
    }

    public static final void c(NewPremiumBusReserveTicketActivationState state, BottomSheetScaffoldState ticketDetailsBottomSheetScaffoldState, BottomDrawerState secondaryBottomDrawerState, Function1 sendIntent, Composer composer, int i) {
        int i2;
        int i3;
        Intrinsics.i(state, "state");
        PBStopDetailsZoomedImageState pBStopDetailsZoomedImageState = state.F;
        Intrinsics.i(ticketDetailsBottomSheetScaffoldState, "ticketDetailsBottomSheetScaffoldState");
        Intrinsics.i(secondaryBottomDrawerState, "secondaryBottomDrawerState");
        Intrinsics.i(sendIntent, "sendIntent");
        Composer composerStartRestartGroup = composer.startRestartGroup(241057584);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(state) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changed(ticketDetailsBottomSheetScaffoldState) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= composerStartRestartGroup.changed(secondaryBottomDrawerState) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(sendIntent) ? 2048 : 1024;
        }
        int i4 = i2;
        if (composerStartRestartGroup.shouldExecute((i4 & 1171) != 1170, i4 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(241057584, i4, -1, "app.chalo.premiumbus.prebookedtickets.newactivation.NewPremiumBusReserveTicketActivationScreen (NewPremiumBusReserveTicketActivationScreen.kt:91)");
            }
            if (pBStopDetailsZoomedImageState instanceof PBStopDetailsZoomedImageState.Show) {
                composerStartRestartGroup.startReplaceGroup(161557130);
                Modifier modifierM786paddingVpY3zN4$default = PaddingKt.m786paddingVpY3zN4$default(Modifier.INSTANCE, ChaloTheme.b(composerStartRestartGroup, 0).h, 0.0f, 2, null);
                PBStopDetailsZoomedImageState.Show show = (PBStopDetailsZoomedImageState.Show) pBStopDetailsZoomedImageState;
                List list = show.f7941a;
                int i5 = show.b;
                boolean z = (i4 & 7168) == 2048;
                Object objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (z || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = new qm0(sendIntent, 5);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                Function0 function0 = (Function0) objRememberedValue;
                i3 = 0;
                PBStopDetailsMainScreenKt.b(modifierM786paddingVpY3zN4$default, list, i5, function0, composerStartRestartGroup, 0);
                composerStartRestartGroup.endReplaceGroup();
            } else {
                i3 = 0;
                if (!Intrinsics.d(pBStopDetailsZoomedImageState, PBStopDetailsZoomedImageState.Hide.f7940a)) {
                    throw pk0.p(composerStartRestartGroup, -271885630);
                }
                composerStartRestartGroup.startReplaceGroup(161981520);
                composerStartRestartGroup.endReplaceGroup();
            }
            int i6 = i4 & 7168;
            int i7 = i3;
            b(state, ticketDetailsBottomSheetScaffoldState, secondaryBottomDrawerState, sendIntent, composerStartRestartGroup, i4 & 8190);
            StopsBetweenPickUpAndDropDialogData stopsBetweenPickUpAndDropDialogData = state.k;
            if (stopsBetweenPickUpAndDropDialogData == null) {
                composerStartRestartGroup.startReplaceGroup(162305221);
            } else {
                composerStartRestartGroup.startReplaceGroup(162305222);
                Modifier modifierM784padding3ABfNKs = PaddingKt.m784padding3ABfNKs(Modifier.INSTANCE, ChaloTheme.b(composerStartRestartGroup, i7).i);
                String str = stopsBetweenPickUpAndDropDialogData.f7404a;
                List list2 = stopsBetweenPickUpAndDropDialogData.b;
                int i8 = i6 != 2048 ? i7 : 1;
                Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                if (i8 != 0 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue2 = new qm0(sendIntent, 11);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                }
                PremiumBusRouteListDialogueKt.a(modifierM784padding3ABfNKs, str, list2, (Function0) objRememberedValue2, composerStartRestartGroup, 0);
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
            scopeUpdateScopeEndRestartGroup.updateScope(new gn0(state, ticketDetailsBottomSheetScaffoldState, secondaryBottomDrawerState, sendIntent, i, 0));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void d(Modifier modifier, Function0 function0, boolean z, Function1 function1, Composer composer, int i) {
        int i2;
        boolean z2;
        Composer composerStartRestartGroup = composer.startRestartGroup(1901671706);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changed(modifier) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(function0) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            z2 = z;
            i2 |= composerStartRestartGroup.changed(z2) ? 256 : 128;
        } else {
            z2 = z;
        }
        if ((i & 3072) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(function1) ? 2048 : 1024;
        }
        if (composerStartRestartGroup.shouldExecute((i2 & 1171) != 1170, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1901671706, i2, -1, "app.chalo.premiumbus.prebookedtickets.newactivation.PremiumBusMapHelpActionItems (NewPremiumBusReserveTicketActivationScreen.kt:614)");
            }
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            Composer.Companion companion = Composer.INSTANCE;
            if (objRememberedValue == companion.getEmpty()) {
                objRememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.valueOf(z2), null, 2, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            MutableState mutableState = (MutableState) objRememberedValue;
            Alignment.Companion companion2 = Alignment.INSTANCE;
            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(companion2.getBottomCenter(), false);
            long currentCompositeKeyHashCode = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
            int i3 = (int) (currentCompositeKeyHashCode ^ (currentCompositeKeyHashCode >>> 32));
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifier);
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
            pk0.v(companion3, composerM3915constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy, composerM3915constructorimpl, currentCompositionLocalMap);
            Updater.m3923setimpl(composerM3915constructorimpl, modifierMaterializeModifier, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion3, composerM3915constructorimpl, Integer.valueOf(i3), composerM3915constructorimpl));
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            Modifier.Companion companion4 = Modifier.INSTANCE;
            Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(companion4, 0.0f, 1, null);
            Alignment.Vertical centerVertically = companion2.getCenterVertically();
            Arrangement arrangement = Arrangement.INSTANCE;
            MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(arrangement.getSpaceBetween(), centerVertically, composerStartRestartGroup, 54);
            long currentCompositeKeyHashCode2 = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
            int i4 = (int) (currentCompositeKeyHashCode2 ^ (currentCompositeKeyHashCode2 >>> 32));
            CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierFillMaxWidth$default);
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
            Modifier modifierM263backgroundbw27NRU = BackgroundKt.m263backgroundbw27NRU(SizeKt.m814height3ABfNKs(companion4, ChaloTheme.b(composerStartRestartGroup, 0).k), ChaloTheme.a(composerStartRestartGroup, 0).t, RoundedCornerShapeKt.RoundedCornerShape(CornerSizeKt.m1066CornerSize0680j_4(ChaloTheme.b(composerStartRestartGroup, 0).i)));
            MeasurePolicy measurePolicyRowMeasurePolicy2 = RowKt.rowMeasurePolicy(arrangement.getSpaceBetween(), companion2.getCenterVertically(), composerStartRestartGroup, 54);
            long currentCompositeKeyHashCode3 = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
            int i5 = (int) (currentCompositeKeyHashCode3 ^ (currentCompositeKeyHashCode3 >>> 32));
            CompositionLocalMap currentCompositionLocalMap3 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier3 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierM263backgroundbw27NRU);
            Function0<ComposeUiNode> constructor3 = companion3.getConstructor();
            if (composerStartRestartGroup.getApplier() == null) {
                ComposablesKt.invalidApplier();
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.createNode(constructor3);
            } else {
                composerStartRestartGroup.useNode();
            }
            Composer composerM3915constructorimpl3 = Updater.m3915constructorimpl(composerStartRestartGroup);
            pk0.v(companion3, composerM3915constructorimpl3, measurePolicyRowMeasurePolicy2, composerM3915constructorimpl3, currentCompositionLocalMap3);
            Updater.m3923setimpl(composerM3915constructorimpl3, modifierMaterializeModifier3, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion3, composerM3915constructorimpl3, Integer.valueOf(i5), composerM3915constructorimpl3));
            Modifier modifierScale = ScaleKt.scale(companion4, 0.8f);
            boolean zBooleanValue = ((Boolean) mutableState.getValue()).booleanValue();
            SwitchColors switchColorsM2510colorsV1nXRL4 = SwitchDefaults.INSTANCE.m2510colorsV1nXRL4(ChaloTheme.a(composerStartRestartGroup, 0).t, ChaloTheme.a(composerStartRestartGroup, 0).B, ChaloTheme.a(composerStartRestartGroup, 0).B, 0L, ChaloTheme.a(composerStartRestartGroup, 0).t, ChaloTheme.a(composerStartRestartGroup, 0).v0, ChaloTheme.a(composerStartRestartGroup, 0).v0, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 0, SwitchDefaults.$stable << 18, 65416);
            boolean z3 = (i2 & 7168) == 2048;
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (z3 || objRememberedValue2 == companion.getEmpty()) {
                objRememberedValue2 = new xc(function1, mutableState, 5);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            SwitchKt.Switch(zBooleanValue, (Function1) objRememberedValue2, modifierScale, null, false, switchColorsM2510colorsV1nXRL4, null, composerStartRestartGroup, 3456, 80);
            TextKt.m2623TextNvy7gAk(StringResourcesHelperKt.c(StringEnum.SHOW_TRAFFIC, new Object[0], composerStartRestartGroup, 6), PaddingKt.m788paddingqDBjuR0$default(companion4, ChaloTheme.b(composerStartRestartGroup, 0).d, 0.0f, ChaloTheme.b(composerStartRestartGroup, 0).g, 0.0f, 10, null), ChaloTheme.a(composerStartRestartGroup, 0).g, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ChaloTypographyKt.i(ChaloTheme.e(composerStartRestartGroup, 0)), composerStartRestartGroup, 0, 0, 131064);
            composerStartRestartGroup = composerStartRestartGroup;
            composerStartRestartGroup.endNode();
            Modifier modifierM828size3ABfNKs = SizeKt.m828size3ABfNKs(BackgroundKt.m264backgroundbw27NRU$default(companion4, Color.INSTANCE.m4640getTransparent0d7_KjU(), null, 2, null), ChaloTheme.b(composerStartRestartGroup, 0).l);
            boolean z4 = (i2 & 112) == 32;
            Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
            if (z4 || objRememberedValue3 == companion.getEmpty()) {
                objRememberedValue3 = new p80(function0, 14);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
            }
            ImageKt.Image(PainterResourceHelperKt.a(IconType.MY_LOCATION_HOMESCREEN, composerStartRestartGroup, 6), (String) null, ClickableKt.m299clickableoSLSa3U$default(modifierM828size3ABfNKs, false, null, null, null, (Function0) objRememberedValue3, 15, null), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composerStartRestartGroup, Painter.$stable | 48, 120);
            if (r1.k(composerStartRestartGroup)) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new lh(modifier, function0, z, function1, i));
        }
    }

    public static final void e(List seatNumbers, Function0 onDismiss, Composer composer, int i) {
        int i2;
        Function0 function0;
        Composer composer2;
        Intrinsics.i(seatNumbers, "seatNumbers");
        Intrinsics.i(onDismiss, "onDismiss");
        Composer composerStartRestartGroup = composer.startRestartGroup(-1797256700);
        if ((i & 6) == 0) {
            i2 = i | (composerStartRestartGroup.changedInstance(seatNumbers) ? 4 : 2);
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(onDismiss) ? 32 : 16;
        }
        if (composerStartRestartGroup.shouldExecute((i2 & 19) != 18, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1797256700, i2, -1, "app.chalo.premiumbus.prebookedtickets.newactivation.PremiumBusSeatAllocationBottomSheet (NewPremiumBusReserveTicketActivationScreen.kt:689)");
            }
            Modifier.Companion companion = Modifier.INSTANCE;
            Modifier modifierM784padding3ABfNKs = PaddingKt.m784padding3ABfNKs(BackgroundKt.m264backgroundbw27NRU$default(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), ChaloTheme.a(composerStartRestartGroup, 0).t, null, 2, null), ChaloTheme.b(composerStartRestartGroup, 0).h);
            Arrangement arrangement = Arrangement.INSTANCE;
            Arrangement.Vertical top = arrangement.getTop();
            Alignment.Companion companion2 = Alignment.INSTANCE;
            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(top, companion2.getStart(), composerStartRestartGroup, 0);
            long currentCompositeKeyHashCode = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
            int i3 = (int) (currentCompositeKeyHashCode ^ (currentCompositeKeyHashCode >>> 32));
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierM784padding3ABfNKs);
            int i4 = i2;
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
            Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null);
            MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(arrangement.getStart(), companion2.getCenterVertically(), composerStartRestartGroup, 48);
            long currentCompositeKeyHashCode2 = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
            int i5 = (int) (currentCompositeKeyHashCode2 ^ (currentCompositeKeyHashCode2 >>> 32));
            CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierFillMaxWidth$default);
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
            Updater.m3923setimpl(composerM3915constructorimpl2, modifierMaterializeModifier2, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion3, composerM3915constructorimpl2, Integer.valueOf(i5), composerM3915constructorimpl2));
            RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
            Modifier modifierM786paddingVpY3zN4$default = PaddingKt.m786paddingVpY3zN4$default(BackgroundKt.m263backgroundbw27NRU(companion, ChaloTheme.a(composerStartRestartGroup, 0).A0, ChaloTheme.d(composerStartRestartGroup, 0).g), 0.0f, ChaloTheme.b(composerStartRestartGroup, 0).h, 1, null);
            MeasurePolicy measurePolicyColumnMeasurePolicy2 = ColumnKt.columnMeasurePolicy(arrangement.getTop(), companion2.getCenterHorizontally(), composerStartRestartGroup, 48);
            long currentCompositeKeyHashCode3 = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
            int i6 = (int) (currentCompositeKeyHashCode3 ^ (currentCompositeKeyHashCode3 >>> 32));
            CompositionLocalMap currentCompositionLocalMap3 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier3 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierM786paddingVpY3zN4$default);
            Function0<ComposeUiNode> constructor3 = companion3.getConstructor();
            if (composerStartRestartGroup.getApplier() == null) {
                ComposablesKt.invalidApplier();
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.createNode(constructor3);
            } else {
                composerStartRestartGroup.useNode();
            }
            Composer composerM3915constructorimpl3 = Updater.m3915constructorimpl(composerStartRestartGroup);
            pk0.v(companion3, composerM3915constructorimpl3, measurePolicyColumnMeasurePolicy2, composerM3915constructorimpl3, currentCompositionLocalMap3);
            Updater.m3923setimpl(composerM3915constructorimpl3, modifierMaterializeModifier3, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion3, composerM3915constructorimpl3, Integer.valueOf(i6), composerM3915constructorimpl3));
            TextKt.m2623TextNvy7gAk(String.valueOf(seatNumbers.size()), null, ChaloTheme.a(composerStartRestartGroup, 0).e, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ChaloTheme.e(composerStartRestartGroup, 0).getHeadlineMedium(), composerStartRestartGroup, 0, 0, 131066);
            TextKt.m2623TextNvy7gAk(StringResourcesHelperKt.c(StringEnum.PASSENGERS, new Object[0], composerStartRestartGroup, 6), PaddingKt.m786paddingVpY3zN4$default(companion, ChaloTheme.b(composerStartRestartGroup, 0).f, 0.0f, 2, null), ChaloTheme.a(composerStartRestartGroup, 0).v0, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ChaloTheme.e(composerStartRestartGroup, 0).getBodySmall(), composerStartRestartGroup, 0, 0, 131064);
            composerStartRestartGroup.endNode();
            ChaloSpacersKt.y(composerStartRestartGroup, 0);
            Modifier modifierA = i41.a(rowScopeInstance, companion, 1.0f, false, 2, null);
            MeasurePolicy measurePolicyColumnMeasurePolicy3 = ColumnKt.columnMeasurePolicy(arrangement.getTop(), companion2.getStart(), composerStartRestartGroup, 0);
            long currentCompositeKeyHashCode4 = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
            int i7 = (int) (currentCompositeKeyHashCode4 ^ (currentCompositeKeyHashCode4 >>> 32));
            CompositionLocalMap currentCompositionLocalMap4 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier4 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierA);
            Function0<ComposeUiNode> constructor4 = companion3.getConstructor();
            if (composerStartRestartGroup.getApplier() == null) {
                ComposablesKt.invalidApplier();
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.createNode(constructor4);
            } else {
                composerStartRestartGroup.useNode();
            }
            Composer composerM3915constructorimpl4 = Updater.m3915constructorimpl(composerStartRestartGroup);
            pk0.v(companion3, composerM3915constructorimpl4, measurePolicyColumnMeasurePolicy3, composerM3915constructorimpl4, currentCompositionLocalMap4);
            Updater.m3923setimpl(composerM3915constructorimpl4, modifierMaterializeModifier4, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion3, composerM3915constructorimpl4, Integer.valueOf(i7), composerM3915constructorimpl4));
            TextKt.m2623TextNvy7gAk(StringResourcesHelperKt.c(StringEnum.SEAT_NUMBERS, new Object[0], composerStartRestartGroup, 6), null, ChaloTheme.a(composerStartRestartGroup, 0).e, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ChaloTheme.e(composerStartRestartGroup, 0).getBodyMedium(), composerStartRestartGroup, 0, 0, 131066);
            ChaloSpacersKt.m(composerStartRestartGroup, 0);
            List list = seatNumbers;
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            Composer.Companion companion4 = Composer.INSTANCE;
            if (objRememberedValue == companion4.getEmpty()) {
                objRememberedValue = new im0(24);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            TextKt.m2623TextNvy7gAk(CollectionsKt.O(list, ", ", null, null, (Function1) objRememberedValue, 30), null, ChaloTheme.a(composerStartRestartGroup, 0).e, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ChaloTheme.e(composerStartRestartGroup, 0).getDisplaySmall(), composerStartRestartGroup, 0, 0, 131066);
            composerStartRestartGroup.endNode();
            composerStartRestartGroup.endNode();
            ChaloSpacersKt.j(composerStartRestartGroup, 0);
            String strC = StringResourcesHelperKt.c(StringEnum.GOT_IT_SMALL_CASE, new Object[0], composerStartRestartGroup, 6);
            Modifier modifierFillMaxWidth$default2 = SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null);
            Shape shape = ChaloTheme.d(composerStartRestartGroup, 0).g;
            boolean z = (i4 & 112) == 32;
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (z || objRememberedValue2 == companion4.getEmpty()) {
                function0 = onDismiss;
                objRememberedValue2 = new p80(function0, 13);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            } else {
                function0 = onDismiss;
            }
            ChaloFilledButtonKt.g(modifierFillMaxWidth$default2, strC, null, 0L, shape, false, 0.0f, null, 0L, (Function0) objRememberedValue2, composerStartRestartGroup, 6, 492);
            composer2 = composerStartRestartGroup;
            composer2.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            function0 = onDismiss;
            composer2 = composerStartRestartGroup;
            composer2.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new nh(seatNumbers, function0, i, 1));
        }
    }

    public static final void f(Modifier modifier, int i, Composer composer, int i2) {
        Modifier modifier2;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1063562757);
        int i3 = i2 | 54;
        int i4 = 1;
        if (composerStartRestartGroup.shouldExecute((i3 & 19) != 18, i3 & 1)) {
            modifier2 = Modifier.INSTANCE;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1063562757, i3, -1, "app.chalo.premiumbus.prebookedtickets.newactivation.PremiumBusTicketActivationMoreOptionsShimmer (NewPremiumBusReserveTicketActivationScreen.kt:759)");
            }
            Modifier modifierM786paddingVpY3zN4$default = PaddingKt.m786paddingVpY3zN4$default(SizeKt.fillMaxWidth$default(modifier2, 0.0f, 1, null), 0.0f, ChaloTheme.b(composerStartRestartGroup, 0).i, 1, null);
            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composerStartRestartGroup, 0);
            long currentCompositeKeyHashCode = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
            int i5 = (int) (currentCompositeKeyHashCode ^ (currentCompositeKeyHashCode >>> 32));
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierM786paddingVpY3zN4$default);
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
            composerStartRestartGroup.startReplaceGroup(12156880);
            for (int i6 = 0; i6 < 1; i6++) {
                Modifier.Companion companion2 = Modifier.INSTANCE;
                BoxKt.Box(ShimmerEffectKt.b(BackgroundKt.m264backgroundbw27NRU$default(PaddingKt.m786paddingVpY3zN4$default(SizeKt.m814height3ABfNKs(SizeKt.fillMaxWidth$default(companion2, 0.0f, 1, null), ChaloTheme.b(composerStartRestartGroup, 0).o), ChaloTheme.b(composerStartRestartGroup, 0).h, 0.0f, 2, null), ChaloTheme.a(composerStartRestartGroup, 0).p, null, 2, null), Color.m4595boximpl(ChaloTheme.a(composerStartRestartGroup, 0).p), Color.m4595boximpl(ChaloTheme.a(composerStartRestartGroup, 0).q), 4), composerStartRestartGroup, 0);
                SpacerKt.Spacer(SizeKt.m814height3ABfNKs(companion2, ChaloTheme.b(composerStartRestartGroup, 0).e), composerStartRestartGroup, 0);
            }
            if (b3.t(composerStartRestartGroup)) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
            modifier2 = modifier;
            i4 = i;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new t3(modifier2, i4, i2, 3));
        }
    }

    public static final void g(float f, Function0 function0, Modifier modifier, Composer composer, int i) {
        int i2;
        Composer composerStartRestartGroup = composer.startRestartGroup(-919142144);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changed(f) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(function0) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= composerStartRestartGroup.changed(modifier) ? 256 : 128;
        }
        if (composerStartRestartGroup.shouldExecute((i2 & 147) != 146, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-919142144, i2, -1, "app.chalo.premiumbus.prebookedtickets.newactivation.Toolbar (NewPremiumBusReserveTicketActivationScreen.kt:527)");
            }
            MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), Alignment.INSTANCE.getCenterVertically(), composerStartRestartGroup, 48);
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
            pk0.v(companion, composerM3915constructorimpl, measurePolicyRowMeasurePolicy, composerM3915constructorimpl, currentCompositionLocalMap);
            Updater.m3923setimpl(composerM3915constructorimpl, modifierMaterializeModifier, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion, composerM3915constructorimpl, Integer.valueOf(i3), composerM3915constructorimpl));
            RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = PrimitiveSnapshotStateKt.mutableFloatStateOf(0.0f);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            MutableFloatState mutableFloatState = (MutableFloatState) objRememberedValue;
            if (mutableFloatState.getFloatValue() != f) {
                mutableFloatState.setFloatValue(f);
            }
            State<Float> stateAnimateFloatAsState = AnimateAsStateKt.animateFloatAsState(mutableFloatState.getFloatValue(), AnimationSpecKt.tween$default(300, 0, null, 6, null), 0.0f, "", null, composerStartRestartGroup, 3120, 20);
            Modifier.Companion companion2 = Modifier.INSTANCE;
            ChaloCircularBackButtonKt.a(RotateKt.rotate(companion2, stateAnimateFloatAsState.getValue().floatValue() * (-90)), 0L, ChaloTheme.b(composerStartRestartGroup, 0).f1916a, function0, composerStartRestartGroup, (i2 << 6) & 7168, 2);
            SpacerKt.Spacer(i41.a(rowScopeInstance, companion2, 1.0f, false, 2, null), composerStartRestartGroup, 0);
            composerStartRestartGroup.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new hn0(f, function0, modifier, i, 0));
        }
    }

    public static final void h(Modifier modifier, boolean z, Function0 function0, Function0 function1, Composer composer, int i) {
        int i2;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1698939869);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changed(modifier) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changed(z) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(function0) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(function1) ? 2048 : 1024;
        }
        if (composerStartRestartGroup.shouldExecute((i2 & 1171) != 1170, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1698939869, i2, -1, "app.chalo.premiumbus.prebookedtickets.newactivation.VerifyAndMoreOptionsButtonSection (NewPremiumBusReserveTicketActivationScreen.kt:557)");
            }
            Modifier.Companion companion = Modifier.INSTANCE;
            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composerStartRestartGroup, 0);
            long currentCompositeKeyHashCode = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
            int i3 = (int) ((currentCompositeKeyHashCode >>> 32) ^ currentCompositeKeyHashCode);
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
            pk0.v(companion2, composerM3915constructorimpl, measurePolicyColumnMeasurePolicy, composerM3915constructorimpl, currentCompositionLocalMap);
            Updater.m3923setimpl(composerM3915constructorimpl, modifierMaterializeModifier, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion2, composerM3915constructorimpl, Integer.valueOf(i3), composerM3915constructorimpl));
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
            ShadowElementKt.a(SizeKt.m814height3ABfNKs(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), ChaloTheme.b(composerStartRestartGroup, 0).f), ChaloTheme.a(composerStartRestartGroup, 0).Z, ChaloTheme.a(composerStartRestartGroup, 0).n0, composerStartRestartGroup, 0, 0);
            Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(modifier, 0.0f, 1, null);
            CardDefaults cardDefaults = CardDefaults.INSTANCE;
            float f = ChaloTheme.c(composerStartRestartGroup, 0).f1917a;
            int i4 = CardDefaults.$stable;
            CardKt.Card(modifierFillMaxWidth$default, ChaloTheme.d(composerStartRestartGroup, 0).f1919a, cardDefaults.m1694cardColorsro_MJ88(ChaloTheme.a(composerStartRestartGroup, 0).t, 0L, 0L, 0L, composerStartRestartGroup, i4 << 12, 14), cardDefaults.m1695cardElevationaqJV_2Y(f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, composerStartRestartGroup, i4 << 18, 62), null, ComposableLambdaKt.rememberComposableLambda(365474107, true, new n20(function0, function1, z), composerStartRestartGroup, 54), composerStartRestartGroup, ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE, 16);
            composerStartRestartGroup = composerStartRestartGroup;
            composerStartRestartGroup.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new lh(modifier, z, function0, function1, i));
        }
    }
}
