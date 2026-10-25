package app.chalo.validationsdk.blevalidation.ui.common;

import androidx.compose.animation.AnimationModifierKt;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.IntrinsicKt;
import androidx.compose.foundation.layout.IntrinsicSize;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.lazy.LazyDslKt;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material3.DividerKt;
import androidx.compose.material3.TextKt;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.ClipKt;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.style.TextOverflow;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.core.view.accessibility.AccessibilityEventCompat;
import androidx.profileinstaller.ProfileVerifier;
import app.chalo.compose.BulletListComponentWithLineIconKt;
import app.chalo.compose.components.ChaloSpacersKt;
import app.chalo.compose.components.PlotlineComposeWidgetKt;
import app.chalo.compose.components.image.CommonImageKt;
import app.chalo.compose.resources.StringResourcesHelperKt;
import app.chalo.compose.theme.ChaloTheme;
import app.chalo.compose.theme.ChaloTypographyKt;
import app.chalo.livetracking.tripplanner.ui.result.TripPlannerLegUiModel;
import app.chalo.providers.iconassetprovider.IconType;
import app.chalo.providers.stringprovider.StringEnum;
import app.chalo.uistate.base.ChaloColorToken;
import app.chalo.uistate.base.ChaloColorToken_androidKt;
import app.chalo.uistate.base.UiEventHandler;
import app.chalo.uistate.image.ImageUISize;
import app.chalo.uistate.image.ImageUIState;
import app.chalo.uistate.image.UIContentScale;
import app.chalo.validationsdk.blevalidation.ui.common.JourneyDetailsBottomSheetKt;
import defpackage.bc0;
import defpackage.dc0;
import defpackage.ec0;
import defpackage.fo;
import defpackage.hf;
import defpackage.hq0;
import defpackage.lm;
import defpackage.nb;
import defpackage.nj;
import defpackage.p80;
import defpackage.pc0;
import defpackage.pf;
import defpackage.pk0;
import defpackage.r1;
import defpackage.sn;
import defpackage.v;
import defpackage.v60;
import defpackage.ym;
import defpackage.yx;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.internal.ws.WebSocketProtocol;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0002¨\u0006\u0005²\u0006\u000e\u0010\u0001\u001a\u00020\u00008\n@\nX\u008a\u008e\u0002²\u0006\u0012\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\nX\u008a\u0084\u0002"}, d2 = {"", "isStopsListExpanded", "", "", "stopsListToShow", "validationsdk_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class JourneyDetailsBottomSheetKt {
    public static final void a(Function2 stepIconContent, Function2 function2, Function3 cardContent, long j, Modifier modifier, Composer composer, int i) {
        int i2;
        Function2 function3;
        Intrinsics.i(stepIconContent, "stepIconContent");
        Intrinsics.i(cardContent, "cardContent");
        Composer composerStartRestartGroup = composer.startRestartGroup(-1638590189);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(stepIconContent) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            function3 = function2;
            i2 |= composerStartRestartGroup.changedInstance(function3) ? 32 : 16;
        } else {
            function3 = function2;
        }
        if ((i & 384) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(cardContent) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= composerStartRestartGroup.changed(j) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= composerStartRestartGroup.changed(modifier) ? 16384 : 8192;
        }
        if (composerStartRestartGroup.shouldExecute((i2 & 9363) != 9362, i2 & 1)) {
            composerStartRestartGroup.startDefaults();
            if ((i & 1) != 0 && !composerStartRestartGroup.getDefaultsInvalid()) {
                composerStartRestartGroup.skipToGroupEnd();
            }
            composerStartRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1638590189, i2, -1, "app.chalo.validationsdk.blevalidation.ui.common.CardWithSideIconAndLine (JourneyDetailsBottomSheet.kt:265)");
            }
            Modifier modifierHeight = IntrinsicKt.height(BackgroundKt.m264backgroundbw27NRU$default(SizeKt.fillMaxWidth$default(modifier, 0.0f, 1, null), ChaloTheme.a(composerStartRestartGroup, 0).t, null, 2, null), IntrinsicSize.Min);
            MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), Alignment.INSTANCE.getTop(), composerStartRestartGroup, 0);
            long currentCompositeKeyHashCode = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
            int i3 = (int) (currentCompositeKeyHashCode ^ (currentCompositeKeyHashCode >>> 32));
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierHeight);
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
            Modifier.Companion companion2 = Modifier.INSTANCE;
            int i4 = i2 >> 3;
            k(stepIconContent, function3, j, PaddingKt.m788paddingqDBjuR0$default(SizeKt.wrapContentHeight$default(companion2, null, false, 3, null), 0.0f, 0.0f, 0.0f, ChaloTheme.b(composerStartRestartGroup, 0).e, 7, null), composerStartRestartGroup, (i2 & WebSocketProtocol.PAYLOAD_SHORT) | (i4 & 896));
            SpacerKt.Spacer(SizeKt.m833width3ABfNKs(companion2, ChaloTheme.b(composerStartRestartGroup, 0).f), composerStartRestartGroup, 0);
            cardContent.invoke(SizeKt.fillMaxWidth$default(companion2, 0.0f, 1, null), composerStartRestartGroup, Integer.valueOf((i4 & 112) | 6));
            composerStartRestartGroup.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new nj(stepIconContent, function2, cardContent, j, modifier, i));
        }
    }

    public static final void b(int i, String str, String str2, boolean z, Function0 function0, Modifier modifier, int i2, Composer composer, int i3) {
        int i4;
        int i5;
        String strC;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1144676487);
        if ((i3 & 6) == 0) {
            i4 = (composerStartRestartGroup.changed(i) ? 4 : 2) | i3;
        } else {
            i4 = i3;
        }
        if ((i3 & 3072) == 0) {
            i4 |= composerStartRestartGroup.changed(z) ? 2048 : 1024;
        }
        if ((i3 & 24576) == 0) {
            i4 |= composerStartRestartGroup.changedInstance(function0) ? 16384 : 8192;
        }
        if ((196608 & i3) == 0) {
            i4 |= composerStartRestartGroup.changed(modifier) ? 131072 : 65536;
        }
        if ((1572864 & i3) == 0) {
            i4 |= composerStartRestartGroup.changed(i2) ? 1048576 : 524288;
        }
        if (composerStartRestartGroup.shouldExecute((599043 & i4) != 599042, i4 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1144676487, i4, -1, "app.chalo.validationsdk.blevalidation.ui.common.IntermediateStopsDropdownSection (JourneyDetailsBottomSheet.kt:551)");
            }
            Arrangement arrangement = Arrangement.INSTANCE;
            Arrangement.HorizontalOrVertical spaceBetween = arrangement.getSpaceBetween();
            Alignment.Companion companion = Alignment.INSTANCE;
            MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(spaceBetween, companion.getCenterVertically(), composerStartRestartGroup, 54);
            long currentCompositeKeyHashCode = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
            int i6 = (int) (currentCompositeKeyHashCode ^ (currentCompositeKeyHashCode >>> 32));
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifier);
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
            Updater.m3923setimpl(composerM3915constructorimpl, modifierMaterializeModifier, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion2, composerM3915constructorimpl, Integer.valueOf(i6), composerM3915constructorimpl));
            RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
            Modifier modifierC = hq0.c("PL_Bus_Leg_Drop_Down_", i2, Modifier.INSTANCE);
            boolean z2 = (i4 & 57344) == 16384;
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (z2 || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new p80(function0, 5);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            Modifier modifierM786paddingVpY3zN4$default = PaddingKt.m786paddingVpY3zN4$default(ClickableKt.m299clickableoSLSa3U$default(modifierC, false, null, null, null, (Function0) objRememberedValue, 15, null), 0.0f, ChaloTheme.b(composerStartRestartGroup, 0).d, 1, null);
            MeasurePolicy measurePolicyRowMeasurePolicy2 = RowKt.rowMeasurePolicy(arrangement.getStart(), companion.getCenterVertically(), composerStartRestartGroup, 48);
            long currentCompositeKeyHashCode2 = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
            int i7 = (int) (currentCompositeKeyHashCode2 ^ (currentCompositeKeyHashCode2 >>> 32));
            CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierM786paddingVpY3zN4$default);
            Function0<ComposeUiNode> constructor2 = companion2.getConstructor();
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
            pk0.v(companion2, composerM3915constructorimpl2, measurePolicyRowMeasurePolicy2, composerM3915constructorimpl2, currentCompositionLocalMap2);
            Updater.m3923setimpl(composerM3915constructorimpl2, modifierMaterializeModifier2, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion2, composerM3915constructorimpl2, Integer.valueOf(i7), composerM3915constructorimpl2));
            if (i > 0) {
                composerStartRestartGroup.startReplaceGroup(440051891);
                if (i == 1) {
                    composerStartRestartGroup.startReplaceGroup(440094888);
                    i5 = 0;
                    strC = StringResourcesHelperKt.c(StringEnum.STOP_1, new Object[0], composerStartRestartGroup, 6);
                    composerStartRestartGroup.endReplaceGroup();
                } else {
                    i5 = 0;
                    composerStartRestartGroup.startReplaceGroup(440174000);
                    strC = StringResourcesHelperKt.c(StringEnum.X_STOPS, new Object[]{Integer.valueOf(i)}, composerStartRestartGroup, 6);
                    composerStartRestartGroup.endReplaceGroup();
                }
                TextKt.m2623TextNvy7gAk(strC, null, ChaloTheme.a(composerStartRestartGroup, i5).B, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ChaloTypographyKt.i(ChaloTheme.e(composerStartRestartGroup, i5)), composerStartRestartGroup, 0, 0, 131066);
                composerStartRestartGroup = composerStartRestartGroup;
                CommonImageKt.a(new ImageUIState(z ? IconType.ARROW_PICK_ROUTE_SEARCH_LESS : IconType.ARROW_PICK_ROUTE_SEARCH_MORE, (String) null, (ChaloColorToken) null, (ImageUISize) null, (UIContentScale) null, 0.0f, (UiEventHandler) null, 254), null, false, composerStartRestartGroup, 0, 6);
            } else {
                composerStartRestartGroup.startReplaceGroup(421174193);
            }
            composerStartRestartGroup.endReplaceGroup();
            if (r1.k(composerStartRestartGroup)) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new ec0(i, str, str2, z, function0, modifier, i2, i3, 1));
        }
    }

    public static final void c(String str, List legs, Modifier modifier, Composer composer, int i) {
        int i2;
        Intrinsics.i(legs, "legs");
        Intrinsics.i(modifier, "modifier");
        Composer composerStartRestartGroup = composer.startRestartGroup(-2087729559);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changed(str) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(legs) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= composerStartRestartGroup.changed(modifier) ? 256 : 128;
        }
        if (composerStartRestartGroup.shouldExecute((i2 & 147) != 146, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-2087729559, i2, -1, "app.chalo.validationsdk.blevalidation.ui.common.JourneyDetailsBottomSheetContent (JourneyDetailsBottomSheet.kt:71)");
            }
            float f = ChaloTheme.b(composerStartRestartGroup, 0).h;
            Modifier modifierFillMaxSize$default = SizeKt.fillMaxSize$default(modifier, 0.0f, 1, null);
            PaddingValues paddingValuesM781PaddingValuesa9UjIt4$default = PaddingKt.m781PaddingValuesa9UjIt4$default(0.0f, 0.0f, 0.0f, f, 7, null);
            boolean zChangedInstance = composerStartRestartGroup.changedInstance(legs) | ((i2 & 14) == 4);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new fo(legs, str);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            LazyDslKt.LazyColumn(modifierFillMaxSize$default, null, paddingValuesM781PaddingValuesa9UjIt4$default, false, null, null, null, false, null, (Function1) objRememberedValue, composerStartRestartGroup, 0, TypedValues.PositionType.TYPE_PERCENT_X);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new pf(str, legs, modifier, i, 2));
        }
    }

    public static final void d(IconType iconType, final String str, final long j, final String str2, final String str3, final boolean z, final Function2 function2, final Modifier modifier, Composer composer, final int i) {
        int i2;
        IconType iconType2;
        Composer composer2;
        Composer composerStartRestartGroup = composer.startRestartGroup(-925843020);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changed(iconType.ordinal()) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changed(str) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= composerStartRestartGroup.changed(j) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= composerStartRestartGroup.changed(str2) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= composerStartRestartGroup.changed(str3) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= composerStartRestartGroup.changed(z) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(function2) ? 1048576 : 524288;
        }
        if ((12582912 & i) == 0) {
            i2 |= composerStartRestartGroup.changed(modifier) ? 8388608 : 4194304;
        }
        if (composerStartRestartGroup.shouldExecute((4793491 & i2) != 4793490, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-925843020, i2, -1, "app.chalo.validationsdk.blevalidation.ui.common.JourneyTripPlannerDefaultLegSection (JourneyDetailsBottomSheet.kt:183)");
            }
            iconType2 = iconType;
            composer2 = composerStartRestartGroup;
            a(ComposableLambdaKt.rememberComposableLambda(-1827361138, true, new ym(iconType2, 1), composerStartRestartGroup, 54), !z ? null : ComposableSingletons$JourneyDetailsBottomSheetKt.b, ComposableLambdaKt.rememberComposableLambda(-1692270781, true, new pc0(j, str, str2, str3, function2, 0), composerStartRestartGroup, 54), j, SizeKt.fillMaxWidth$default(modifier, 0.0f, 1, null), composer2, ((i2 << 3) & 7168) | 390);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            iconType2 = iconType;
            composer2 = composerStartRestartGroup;
            composer2.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            final IconType iconType3 = iconType2;
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: qc0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    JourneyDetailsBottomSheetKt.d(iconType3, str, j, str2, str3, z, function2, modifier, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(i | 1));
                    return Unit.f17538a;
                }
            });
        }
    }

    public static final void e(int i, Composer composer, Modifier modifier, String str) {
        int i2;
        Composer composerStartRestartGroup = composer.startRestartGroup(-503154206);
        if ((i & 6) == 0) {
            i2 = i | (composerStartRestartGroup.changed(str) ? 4 : 2);
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changed(modifier) ? 32 : 16;
        }
        if (composerStartRestartGroup.shouldExecute((i2 & 19) != 18, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-503154206, i2, -1, "app.chalo.validationsdk.blevalidation.ui.common.JourneyTripPlannerDetailsBottomSheetHeader (JourneyDetailsBottomSheet.kt:663)");
            }
            Arrangement arrangement = Arrangement.INSTANCE;
            Arrangement.Vertical top = arrangement.getTop();
            Alignment.Companion companion = Alignment.INSTANCE;
            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(top, companion.getStart(), composerStartRestartGroup, 0);
            long currentCompositeKeyHashCode = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
            int i3 = (int) (currentCompositeKeyHashCode ^ (currentCompositeKeyHashCode >>> 32));
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifier);
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
            Modifier.Companion companion3 = Modifier.INSTANCE;
            SpacerKt.Spacer(SizeKt.m814height3ABfNKs(companion3, ChaloTheme.b(composerStartRestartGroup, 0).g), composerStartRestartGroup, 0);
            DividerKt.m1950HorizontalDivider9IZ8Weo(ClipKt.clip(columnScopeInstance.align(SizeKt.m833width3ABfNKs(companion3, ChaloTheme.b(composerStartRestartGroup, 0).n), companion.getCenterHorizontally()), ChaloTheme.d(composerStartRestartGroup, 0).b), ChaloTheme.b(composerStartRestartGroup, 0).d, ChaloTheme.a(composerStartRestartGroup, 0).S, composerStartRestartGroup, 0, 0);
            Modifier modifierM787paddingqDBjuR0 = PaddingKt.m787paddingqDBjuR0(SizeKt.fillMaxWidth$default(companion3, 0.0f, 1, null), ChaloTheme.b(composerStartRestartGroup, 0).h, ChaloTheme.b(composerStartRestartGroup, 0).i, ChaloTheme.b(composerStartRestartGroup, 0).h, ChaloTheme.b(composerStartRestartGroup, 0).h);
            MeasurePolicy measurePolicyColumnMeasurePolicy2 = ColumnKt.columnMeasurePolicy(arrangement.getTop(), companion.getStart(), composerStartRestartGroup, 0);
            long currentCompositeKeyHashCode2 = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
            int i4 = (int) (currentCompositeKeyHashCode2 ^ (currentCompositeKeyHashCode2 >>> 32));
            CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierM787paddingqDBjuR0);
            Function0<ComposeUiNode> constructor2 = companion2.getConstructor();
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
            pk0.v(companion2, composerM3915constructorimpl2, measurePolicyColumnMeasurePolicy2, composerM3915constructorimpl2, currentCompositionLocalMap2);
            Updater.m3923setimpl(composerM3915constructorimpl2, modifierMaterializeModifier2, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion2, composerM3915constructorimpl2, Integer.valueOf(i4), composerM3915constructorimpl2));
            TextKt.m2623TextNvy7gAk(StringResourcesHelperKt.c(StringEnum.YOUR_JOURNEY, new Object[0], composerStartRestartGroup, 6), null, ChaloTheme.a(composerStartRestartGroup, 0).e, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, TextStyle.m6753copyp1EtxEg$default(ChaloTypographyKt.f(ChaloTheme.e(composerStartRestartGroup, 0)), 0L, 0L, FontWeight.INSTANCE.getBold(), null, null, null, null, 0L, null, null, null, 0L, null, null, null, 0, 0, 0L, null, null, null, 0, 0, null, 16777211, null), composerStartRestartGroup, 0, 0, 131066);
            composerStartRestartGroup = composerStartRestartGroup;
            if (str == null) {
                composerStartRestartGroup.startReplaceGroup(117549053);
            } else {
                composerStartRestartGroup.startReplaceGroup(117549054);
                ChaloSpacersKt.s(null, 0, composerStartRestartGroup, 1);
                TextKt.m2623TextNvy7gAk(StringResourcesHelperKt.c(StringEnum.TOTAL_JOURNEY, new Object[]{str}, composerStartRestartGroup, 6), null, ChaloTheme.a(composerStartRestartGroup, 0).v0, null, 0L, null, null, null, 0L, null, null, 0L, TextOverflow.INSTANCE.m7226getEllipsisgIe3tQ8(), false, 2, 0, null, ChaloTypographyKt.c(ChaloTheme.e(composerStartRestartGroup, 0)), composerStartRestartGroup, 0, 24960, 110586);
                composerStartRestartGroup = composerStartRestartGroup;
            }
            composerStartRestartGroup.endReplaceGroup();
            composerStartRestartGroup.endNode();
            DividerKt.m1950HorizontalDivider9IZ8Weo(SizeKt.fillMaxWidth$default(companion3, 0.0f, 1, null), ChaloTheme.b(composerStartRestartGroup, 0).f, ChaloTheme.a(composerStartRestartGroup, 0).A, composerStartRestartGroup, 6, 0);
            composerStartRestartGroup.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new nb(str, modifier, i, 3));
        }
    }

    public static final void f(TripPlannerLegUiModel.Metro metro, String str, int i, Modifier modifier, Composer composer, int i2) {
        int i3;
        Composer composerStartRestartGroup = composer.startRestartGroup(1982214566);
        if ((i2 & 6) == 0) {
            i3 = ((i2 & 8) == 0 ? composerStartRestartGroup.changed(metro) : composerStartRestartGroup.changedInstance(metro) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 384) == 0) {
            i3 |= composerStartRestartGroup.changed(i) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i3 |= composerStartRestartGroup.changed(modifier) ? 2048 : 1024;
        }
        if (composerStartRestartGroup.shouldExecute((i3 & 1155) != 1154, i3 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1982214566, i3, -1, "app.chalo.validationsdk.blevalidation.ui.common.JourneyTripPlannerDetailsMetroLegCard (JourneyDetailsBottomSheet.kt:331)");
            }
            Modifier modifierM263backgroundbw27NRU = BackgroundKt.m263backgroundbw27NRU(SizeKt.fillMaxWidth$default(modifier, 0.0f, 1, null), ChaloTheme.a(composerStartRestartGroup, 0).r0, RoundedCornerShapeKt.m1074RoundedCornerShape0680j_4(ChaloTheme.b(composerStartRestartGroup, 0).h));
            Arrangement arrangement = Arrangement.INSTANCE;
            Arrangement.Vertical top = arrangement.getTop();
            Alignment.Companion companion = Alignment.INSTANCE;
            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(top, companion.getStart(), composerStartRestartGroup, 0);
            long currentCompositeKeyHashCode = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
            int i4 = (int) (currentCompositeKeyHashCode ^ (currentCompositeKeyHashCode >>> 32));
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierM263backgroundbw27NRU);
            ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor = companion2.getConstructor();
            if (!(composerStartRestartGroup.getApplier() != null)) {
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
            Updater.m3923setimpl(composerM3915constructorimpl, modifierMaterializeModifier, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion2, composerM3915constructorimpl, Integer.valueOf(i4), composerM3915constructorimpl));
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
            Modifier.Companion companion3 = Modifier.INSTANCE;
            Modifier modifierM786paddingVpY3zN4$default = PaddingKt.m786paddingVpY3zN4$default(SizeKt.fillMaxWidth$default(companion3, 0.0f, 1, null), 0.0f, ChaloTheme.b(composerStartRestartGroup, 0).h, 1, null);
            MeasurePolicy measurePolicyColumnMeasurePolicy2 = ColumnKt.columnMeasurePolicy(arrangement.getTop(), companion.getStart(), composerStartRestartGroup, 0);
            long currentCompositeKeyHashCode2 = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
            int i5 = (int) (currentCompositeKeyHashCode2 ^ (currentCompositeKeyHashCode2 >>> 32));
            CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierM786paddingVpY3zN4$default);
            Function0<ComposeUiNode> constructor2 = companion2.getConstructor();
            if (!(composerStartRestartGroup.getApplier() != null)) {
                ComposablesKt.invalidApplier();
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.createNode(constructor2);
            } else {
                composerStartRestartGroup.useNode();
            }
            Composer composerM3915constructorimpl2 = Updater.m3915constructorimpl(composerStartRestartGroup);
            pk0.v(companion2, composerM3915constructorimpl2, measurePolicyColumnMeasurePolicy2, composerM3915constructorimpl2, currentCompositionLocalMap2);
            Updater.m3923setimpl(composerM3915constructorimpl2, modifierMaterializeModifier2, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion2, composerM3915constructorimpl2, Integer.valueOf(i5), composerM3915constructorimpl2));
            i(metro.l, metro.m, metro.p, metro.k, PaddingKt.m786paddingVpY3zN4$default(SizeKt.fillMaxWidth$default(companion3, 0.0f, 1, null), ChaloTheme.b(composerStartRestartGroup, 0).h, 0.0f, 2, null), i, composerStartRestartGroup, (i3 << 9) & 458752);
            if (r1.k(composerStartRestartGroup)) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new v(metro, str, i, modifier, i2, 15));
        }
    }

    public static final void g(IconType iconType, TripPlannerLegUiModel.Metro metro, String str, int i, boolean z, String str2, Modifier modifier, Composer composer, int i2) {
        int i3;
        Composer composer2;
        Color colorM4595boximpl;
        long jM4615unboximpl;
        Composer composerStartRestartGroup = composer.startRestartGroup(935682307);
        if ((i2 & 6) == 0) {
            i3 = (composerStartRestartGroup.changed(iconType.ordinal()) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= (i2 & 64) == 0 ? composerStartRestartGroup.changed(metro) : composerStartRestartGroup.changedInstance(metro) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= composerStartRestartGroup.changed(str) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i3 |= composerStartRestartGroup.changed(i) ? 2048 : 1024;
        }
        if ((i2 & 24576) == 0) {
            i3 |= composerStartRestartGroup.changed(z) ? 16384 : 8192;
        }
        if ((196608 & i2) == 0) {
            i3 |= composerStartRestartGroup.changed(str2) ? 131072 : 65536;
        }
        if ((i2 & 1572864) == 0) {
            i3 |= composerStartRestartGroup.changed(modifier) ? 1048576 : 524288;
        }
        if (composerStartRestartGroup.shouldExecute((599187 & i3) != 599186, i3 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(935682307, i3, -1, "app.chalo.validationsdk.blevalidation.ui.common.JourneyTripPlannerDetailsMetroLegSection (JourneyDetailsBottomSheet.kt:148)");
            }
            String str3 = str2 == null ? "" : str2;
            String str4 = metro.t;
            if (str4 == null) {
                composerStartRestartGroup.startReplaceGroup(574269687);
                composerStartRestartGroup.endReplaceGroup();
                colorM4595boximpl = null;
            } else {
                composerStartRestartGroup.startReplaceGroup(574269688);
                long jA = ChaloColorToken_androidKt.a(Color.INSTANCE, str4, ChaloTheme.a(composerStartRestartGroup, 0).e);
                composerStartRestartGroup.endReplaceGroup();
                colorM4595boximpl = Color.m4595boximpl(jA);
            }
            if (colorM4595boximpl == null) {
                composerStartRestartGroup.startReplaceGroup(1542548744);
                jM4615unboximpl = ChaloTheme.a(composerStartRestartGroup, 0).e;
                composerStartRestartGroup.endReplaceGroup();
            } else {
                composerStartRestartGroup.startReplaceGroup(1542544745);
                composerStartRestartGroup.endReplaceGroup();
                jM4615unboximpl = colorM4595boximpl.m4615unboximpl();
            }
            composer2 = composerStartRestartGroup;
            d(iconType, str3, jM4615unboximpl, metro.f, metro.i, z, ComposableLambdaKt.rememberComposableLambda(1001390493, true, new v60(metro, str, i, 10), composerStartRestartGroup, 54), AnimationModifierKt.animateContentSize$default(SizeKt.fillMaxWidth$default(modifier, 0.0f, 1, null), null, null, 3, null), composer2, (i3 & 14) | 1572864 | ((i3 << 3) & 458752));
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer2 = composerStartRestartGroup;
            composer2.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new sn(iconType, metro, str, i, z, str2, modifier, i2));
        }
    }

    public static final void h(String str, int i, String str2, String str3, boolean z, boolean z2, Function0 function0, Modifier modifier, TextStyle textStyle, int i2, String str4, Composer composer, int i3, int i4) {
        int i5;
        String str5;
        String str6;
        char c;
        int i6;
        Composer composer2;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1283592273);
        if ((i3 & 6) == 0) {
            i5 = (composerStartRestartGroup.changed(str) ? 4 : 2) | i3;
        } else {
            i5 = i3;
        }
        if ((i3 & 48) == 0) {
            i5 |= composerStartRestartGroup.changed(i) ? 32 : 16;
        }
        if ((i3 & 384) == 0) {
            str5 = str2;
            i5 |= composerStartRestartGroup.changed(str5) ? 256 : 128;
        } else {
            str5 = str2;
        }
        if ((i3 & 3072) == 0) {
            str6 = str3;
            i5 |= composerStartRestartGroup.changed(str6) ? 2048 : 1024;
        } else {
            str6 = str3;
        }
        if ((i3 & 24576) == 0) {
            i5 |= composerStartRestartGroup.changed(z) ? 16384 : 8192;
        }
        if ((i3 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
            i5 |= composerStartRestartGroup.changed(z2) ? 131072 : 65536;
        }
        if ((1572864 & i3) == 0) {
            i5 |= composerStartRestartGroup.changedInstance(function0) ? 1048576 : 524288;
        }
        if ((i3 & 12582912) == 0) {
            i5 |= composerStartRestartGroup.changed(modifier) ? 8388608 : 4194304;
        }
        if ((i3 & 100663296) == 0) {
            i5 |= composerStartRestartGroup.changed(textStyle) ? AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL : 33554432;
        }
        if ((i3 & 805306368) == 0) {
            c = ' ';
            i5 |= composerStartRestartGroup.changed(i2) ? 536870912 : 268435456;
        } else {
            c = ' ';
        }
        if ((i4 & 6) == 0) {
            i6 = i4 | (composerStartRestartGroup.changed(str4) ? 4 : 2);
        } else {
            i6 = i4;
        }
        if (composerStartRestartGroup.shouldExecute(((i5 & 306783379) == 306783378 && (i6 & 3) == 2) ? false : true, i5 & 1)) {
            composerStartRestartGroup.startDefaults();
            if ((i3 & 1) != 0 && !composerStartRestartGroup.getDefaultsInvalid()) {
                composerStartRestartGroup.skipToGroupEnd();
            }
            composerStartRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1283592273, i5, i6, "app.chalo.validationsdk.blevalidation.ui.common.MetroLegIntermediateStopLayout (JourneyDetailsBottomSheet.kt:509)");
            }
            Modifier modifierWrapContentSize$default = SizeKt.wrapContentSize$default(modifier, null, false, 3, null);
            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composerStartRestartGroup, 0);
            long currentCompositeKeyHashCode = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
            int i7 = (int) (currentCompositeKeyHashCode ^ (currentCompositeKeyHashCode >>> c));
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierWrapContentSize$default);
            ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
            int i8 = i5;
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
            Updater.m3923setimpl(composerM3915constructorimpl, modifierMaterializeModifier, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion, composerM3915constructorimpl, Integer.valueOf(i7), composerM3915constructorimpl));
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
            int i9 = i8 >> 3;
            TextKt.m2623TextNvy7gAk(str, PaddingKt.m786paddingVpY3zN4$default(SizeKt.fillMaxWidth$default(str4 != null ? PlotlineComposeWidgetKt.a(Modifier.INSTANCE, str4) : Modifier.INSTANCE, 0.0f, 1, null), 0.0f, ChaloTheme.b(composerStartRestartGroup, 0).c, 1, null), ChaloTheme.a(composerStartRestartGroup, 0).e, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, textStyle, composerStartRestartGroup, i8 & 14, i9 & 29360128, 131064);
            composer2 = composerStartRestartGroup;
            if (z) {
                composer2.startReplaceGroup(-1130245739);
                Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null);
                int i10 = (i9 & 14) | ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE | (i9 & 112) | (i9 & 896);
                int i11 = i8 >> 6;
                b(i, str5, str6, z2, function0, modifierFillMaxWidth$default, i2, composer2, i10 | (i11 & 7168) | (i11 & 57344) | ((i8 >> 9) & 3670016));
            } else {
                composer2.startReplaceGroup(-1147947607);
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
            scopeUpdateScopeEndRestartGroup.updateScope(new dc0(str, i, str2, str3, z, z2, function0, modifier, textStyle, i2, str4, i3, i4, 1));
        }
    }

    public static final void i(final String str, final String str2, final int i, List list, Modifier modifier, final int i2, Composer composer, int i3) {
        int i4;
        Composer composer2;
        Composer composerStartRestartGroup = composer.startRestartGroup(872101121);
        if ((i3 & 6) == 0) {
            i4 = (composerStartRestartGroup.changed(str) ? 4 : 2) | i3;
        } else {
            i4 = i3;
        }
        if ((i3 & 48) == 0) {
            i4 |= composerStartRestartGroup.changed(str2) ? 32 : 16;
        }
        if ((i3 & 384) == 0) {
            i4 |= composerStartRestartGroup.changed(i) ? 256 : 128;
        }
        if ((i3 & 3072) == 0) {
            i4 |= composerStartRestartGroup.changedInstance(list) ? 2048 : 1024;
        }
        if ((i3 & 24576) == 0) {
            i4 |= composerStartRestartGroup.changed(modifier) ? 16384 : 8192;
        }
        if ((196608 & i3) == 0) {
            i4 |= composerStartRestartGroup.changed(i2) ? 131072 : 65536;
        }
        if (composerStartRestartGroup.shouldExecute((74899 & i4) != 74898, i4 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(872101121, i4, -1, "app.chalo.validationsdk.blevalidation.ui.common.MetroLegStopListSection (JourneyDetailsBottomSheet.kt:369)");
            }
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            Composer.Companion companion = Composer.INSTANCE;
            if (objRememberedValue == companion.getEmpty()) {
                objRememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            final MutableState mutableState = (MutableState) objRememberedValue;
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue2 == companion.getEmpty()) {
                objRememberedValue2 = SnapshotStateKt.derivedStateOf(SnapshotStateKt.structuralEqualityPolicy(), new bc0(list, mutableState, 1));
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            final State state = (State) objRememberedValue2;
            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composerStartRestartGroup, 0);
            long currentCompositeKeyHashCode = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
            int i5 = (int) (currentCompositeKeyHashCode ^ (currentCompositeKeyHashCode >>> 32));
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifier);
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
            Updater.m3923setimpl(composerM3915constructorimpl, modifierMaterializeModifier, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion2, composerM3915constructorimpl, Integer.valueOf(i5), composerM3915constructorimpl));
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
            int size = ((List) state.getValue()).size();
            float f = ChaloTheme.b(composerStartRestartGroup, 0).g;
            Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null);
            float f2 = ChaloTheme.b(composerStartRestartGroup, 0).f;
            float f3 = ChaloTheme.b(composerStartRestartGroup, 0).b;
            Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue3 == companion.getEmpty()) {
                objRememberedValue3 = new yx(state, 4);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
            }
            composer2 = composerStartRestartGroup;
            BulletListComponentWithLineIconKt.b(size, modifierFillMaxWidth$default, f, f2, f3, 0.0f, (Function1) objRememberedValue3, ComposableLambdaKt.rememberComposableLambda(-1686252346, true, new Function4() { // from class: oc0
                /* JADX WARN: Code duplicated, block: B:79:0x01e1  */
                /* JADX WARN: Code duplicated, block: B:82:0x0207  */
                /* JADX WARN: Multi-variable type inference failed */
                @Override // kotlin.jvm.functions.Function4
                public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
                    int i6;
                    TextStyle textStyleG;
                    String str3;
                    Object objRememberedValue4;
                    Modifier modifier2 = (Modifier) obj;
                    int iIntValue = ((Integer) obj2).intValue();
                    Composer composer3 = (Composer) obj3;
                    int iIntValue2 = ((Integer) obj4).intValue();
                    Intrinsics.i(modifier2, "modifier");
                    if ((iIntValue2 & 6) == 0) {
                        i6 = (composer3.changed(modifier2) ? 4 : 2) | iIntValue2;
                    } else {
                        i6 = iIntValue2;
                    }
                    if ((iIntValue2 & 48) == 0) {
                        i6 |= composer3.changed(iIntValue) ? 32 : 16;
                    }
                    if (composer3.shouldExecute((i6 & 147) != 146, i6 & 1)) {
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-1686252346, i6, -1, "app.chalo.validationsdk.blevalidation.ui.common.MetroLegStopListSection.<anonymous>.<anonymous> (JourneyDetailsBottomSheet.kt:402)");
                        }
                        State state2 = state;
                        if (iIntValue == 0 || iIntValue == CollectionsKt.K((List) state2.getValue())) {
                            composer3.startReplaceGroup(-1206037540);
                            textStyleG = ChaloTypographyKt.g(ChaloTheme.e(composer3, 0));
                            composer3.endReplaceGroup();
                        } else {
                            composer3.startReplaceGroup(-1205968007);
                            textStyleG = ChaloTypographyKt.c(ChaloTheme.e(composer3, 0));
                            composer3.endReplaceGroup();
                        }
                        TextStyle textStyle = textStyleG;
                        String strC = "";
                        if (iIntValue == 0) {
                            composer3.startReplaceGroup(-1205824880);
                            StringEnum stringEnum = StringEnum.FROM_;
                            String str4 = (String) CollectionsKt.L(iIntValue, (List) state2.getValue());
                            strC = StringResourcesHelperKt.c(stringEnum, new Object[]{str4 != null ? str4 : ""}, composer3, 6);
                            composer3.endReplaceGroup();
                        } else if (iIntValue == CollectionsKt.K((List) state2.getValue())) {
                            composer3.startReplaceGroup(-1205574524);
                            StringEnum stringEnum2 = StringEnum.TO_;
                            String str5 = (String) CollectionsKt.L(iIntValue, (List) state2.getValue());
                            strC = StringResourcesHelperKt.c(stringEnum2, new Object[]{str5 != null ? str5 : ""}, composer3, 6);
                            composer3.endReplaceGroup();
                        } else {
                            composer3.startReplaceGroup(-1205428266);
                            composer3.endReplaceGroup();
                            String str6 = (String) CollectionsKt.L(iIntValue, (List) state2.getValue());
                            if (str6 != null) {
                                strC = str6;
                            }
                        }
                        Modifier.Companion companion3 = Modifier.INSTANCE;
                        MeasurePolicy measurePolicyColumnMeasurePolicy2 = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composer3, 0);
                        long currentCompositeKeyHashCode2 = ComposablesKt.getCurrentCompositeKeyHashCode(composer3, 0);
                        int i7 = (int) (currentCompositeKeyHashCode2 ^ (currentCompositeKeyHashCode2 >>> 32));
                        CompositionLocalMap currentCompositionLocalMap2 = composer3.getCurrentCompositionLocalMap();
                        Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(composer3, companion3);
                        ComposeUiNode.Companion companion4 = ComposeUiNode.INSTANCE;
                        Function0<ComposeUiNode> constructor2 = companion4.getConstructor();
                        if (composer3.getApplier() == null) {
                            ComposablesKt.invalidApplier();
                        }
                        composer3.startReusableNode();
                        if (composer3.getInserting()) {
                            composer3.createNode(constructor2);
                        } else {
                            composer3.useNode();
                        }
                        Composer composerM3915constructorimpl2 = Updater.m3915constructorimpl(composer3);
                        pk0.v(companion4, composerM3915constructorimpl2, measurePolicyColumnMeasurePolicy2, composerM3915constructorimpl2, currentCompositionLocalMap2);
                        Updater.m3923setimpl(composerM3915constructorimpl2, modifierMaterializeModifier2, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion4, composerM3915constructorimpl2, Integer.valueOf(i7), composerM3915constructorimpl2));
                        ColumnScopeInstance columnScopeInstance2 = ColumnScopeInstance.INSTANCE;
                        String str7 = str2;
                        String strJ = null;
                        if (iIntValue == 0) {
                            composer3.startReplaceGroup(-1167518791);
                            JourneyDetailsBottomSheetKt.j(0, composer3, null, StringResourcesHelperKt.c(StringEnum.BOARD_AT_TEXT, new Object[0], composer3, 6), str7);
                            composer3.endReplaceGroup();
                        } else if (iIntValue == CollectionsKt.K((List) state2.getValue())) {
                            composer3.startReplaceGroup(-1833100553);
                            JourneyDetailsBottomSheetKt.j(384, composer3, null, StringResourcesHelperKt.c(StringEnum.EXIT_AT, new Object[0], composer3, 6), null);
                            composer3.endReplaceGroup();
                        } else {
                            composer3.startReplaceGroup(-1832837084);
                            composer3.endReplaceGroup();
                        }
                        boolean z = iIntValue == 0;
                        MutableState mutableState2 = mutableState;
                        boolean zBooleanValue = ((Boolean) mutableState2.getValue()).booleanValue();
                        Modifier modifierFillMaxWidth$default2 = SizeKt.fillMaxWidth$default(modifier2, 0.0f, 1, null);
                        int i8 = i2;
                        if (iIntValue == 0) {
                            str3 = "PL_Bus_Leg_From_Stop_";
                        } else if (iIntValue == CollectionsKt.K((List) state2.getValue())) {
                            str3 = "PL_Bus_Leg_To_Stop_";
                        } else {
                            String str8 = strJ;
                            objRememberedValue4 = composer3.rememberedValue();
                            if (objRememberedValue4 == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue4 = new t1(mutableState2, 19);
                                composer3.updateRememberedValue(objRememberedValue4);
                            }
                            JourneyDetailsBottomSheetKt.h(strC, i, str, str7, z, zBooleanValue, (Function0) objRememberedValue4, modifierFillMaxWidth$default2, textStyle, i8, str8, composer3, 1572864, 0);
                            composer3.endNode();
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }
                        strJ = vo1.j(i8, str3);
                        String str9 = strJ;
                        objRememberedValue4 = composer3.rememberedValue();
                        if (objRememberedValue4 == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue4 = new t1(mutableState2, 19);
                            composer3.updateRememberedValue(objRememberedValue4);
                        }
                        JourneyDetailsBottomSheetKt.h(strC, i, str, str7, z, zBooleanValue, (Function0) objRememberedValue4, modifierFillMaxWidth$default2, textStyle, i8, str9, composer3, 1572864, 0);
                        composer3.endNode();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    } else {
                        composer3.skipToGroupEnd();
                    }
                    return Unit.f17538a;
                }
            }, composerStartRestartGroup, 54), composer2, 14155824, 32);
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
            scopeUpdateScopeEndRestartGroup.updateScope(new lm(str, str2, i, list, modifier, i2, i3));
        }
    }

    public static final void j(int i, Composer composer, Modifier modifier, String label, String str) {
        Composer composer2;
        Modifier modifier2;
        Intrinsics.i(label, "label");
        Composer composerStartRestartGroup = composer.startRestartGroup(195661986);
        int i2 = i | 6;
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changed(label) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= composerStartRestartGroup.changed(str) ? 256 : 128;
        }
        if (composerStartRestartGroup.shouldExecute((i2 & 147) != 146, i2 & 1)) {
            Modifier.Companion companion = Modifier.INSTANCE;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(195661986, i2, -1, "app.chalo.validationsdk.blevalidation.ui.common.StationLabelWithTravelTime (JourneyDetailsBottomSheet.kt:472)");
            }
            Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null);
            MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getSpaceBetween(), Alignment.INSTANCE.getTop(), composerStartRestartGroup, 6);
            long currentCompositeKeyHashCode = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
            int i3 = (int) (currentCompositeKeyHashCode ^ (currentCompositeKeyHashCode >>> 32));
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierFillMaxWidth$default);
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
            Updater.m3923setimpl(composerM3915constructorimpl, modifierMaterializeModifier, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion2, composerM3915constructorimpl, Integer.valueOf(i3), composerM3915constructorimpl));
            RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
            TextKt.m2623TextNvy7gAk(label, PaddingKt.m786paddingVpY3zN4$default(companion, 0.0f, ChaloTheme.b(composerStartRestartGroup, 0).c, 1, null), ChaloTheme.a(composerStartRestartGroup, 0).v0, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ChaloTypographyKt.d(ChaloTheme.e(composerStartRestartGroup, 0)), composerStartRestartGroup, (i2 >> 3) & 14, 0, 131064);
            if (str == null) {
                composerStartRestartGroup.startReplaceGroup(431878703);
                composerStartRestartGroup.endReplaceGroup();
                composer2 = composerStartRestartGroup;
            } else {
                composerStartRestartGroup.startReplaceGroup(431878704);
                composer2 = composerStartRestartGroup;
                TextKt.m2623TextNvy7gAk(str, null, ChaloTheme.a(composerStartRestartGroup, 0).g, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ChaloTypographyKt.d(ChaloTheme.e(composerStartRestartGroup, 0)), composer2, 0, 0, 131066);
                composer2.endReplaceGroup();
            }
            composer2.endNode();
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
            scopeUpdateScopeEndRestartGroup.updateScope(new hf(modifier2, label, str, i, 2));
        }
    }

    public static final void k(final Function2 function2, final Function2 function3, final long j, final Modifier modifier, Composer composer, final int i) {
        int i2;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1295994495);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(function2) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(function3) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= composerStartRestartGroup.changed(j) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= composerStartRestartGroup.changed(modifier) ? 2048 : 1024;
        }
        if (composerStartRestartGroup.shouldExecute((i2 & 1171) != 1170, i2 & 1)) {
            composerStartRestartGroup.startDefaults();
            if ((i & 1) != 0 && !composerStartRestartGroup.getDefaultsInvalid()) {
                composerStartRestartGroup.skipToGroupEnd();
            }
            composerStartRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1295994495, i2, -1, "app.chalo.validationsdk.blevalidation.ui.common.StepIconAndLineComponent (JourneyDetailsBottomSheet.kt:296)");
            }
            float f = function3 != null ? 0.8f : 1.0f;
            Modifier modifierWrapContentSize$default = SizeKt.wrapContentSize$default(modifier, null, false, 3, null);
            Arrangement.Vertical top = Arrangement.INSTANCE.getTop();
            Alignment.Companion companion = Alignment.INSTANCE;
            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(top, companion.getStart(), composerStartRestartGroup, 0);
            long currentCompositeKeyHashCode = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
            int i3 = (int) (currentCompositeKeyHashCode ^ (currentCompositeKeyHashCode >>> 32));
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierWrapContentSize$default);
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
            function2.invoke(composerStartRestartGroup, Integer.valueOf(i2 & 14));
            Modifier.Companion companion3 = Modifier.INSTANCE;
            SpacerKt.Spacer(SizeKt.m828size3ABfNKs(companion3, ChaloTheme.b(composerStartRestartGroup, 0).e), composerStartRestartGroup, 0);
            DividerKt.m1950HorizontalDivider9IZ8Weo(columnScopeInstance.align(SizeKt.m833width3ABfNKs(SizeKt.fillMaxHeight(BackgroundKt.m263backgroundbw27NRU(PaddingKt.m786paddingVpY3zN4$default(companion3, 0.0f, ChaloTheme.b(composerStartRestartGroup, 0).d, 1, null), j, ChaloTheme.d(composerStartRestartGroup, 0).c), f), ChaloTheme.b(composerStartRestartGroup, 0).e), companion.getCenterHorizontally()), 0.0f, 0L, composerStartRestartGroup, 0, 6);
            if (function3 == null) {
                composerStartRestartGroup.startReplaceGroup(-538412464);
            } else {
                composerStartRestartGroup.startReplaceGroup(-538412463);
                ChaloSpacersKt.t(composerStartRestartGroup, 0);
                function3.invoke(composerStartRestartGroup, 0);
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
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: rc0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    JourneyDetailsBottomSheetKt.k(function2, function3, j, modifier, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(i | 1));
                    return Unit.f17538a;
                }
            });
        }
    }
}
