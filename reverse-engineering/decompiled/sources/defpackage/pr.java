package defpackage;

import androidx.compose.animation.AnimatedVisibilityScope;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material3.MaterialTheme;
import androidx.compose.material3.TextKt;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.ClipKt;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.layout.ContentScale;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.TextUnitKt;
import app.chalo.compose.components.ChaloCircularLoadingBoxKt;
import app.chalo.compose.components.ChaloCircularProgressIndicatorKt;
import app.chalo.compose.components.ChaloSpacersKt;
import app.chalo.compose.components.buttons.ChaloFilledButtonKt;
import app.chalo.compose.components.shimmer.ShimmerEffectKt;
import app.chalo.compose.resources.PainterResourceHelperKt;
import app.chalo.compose.resources.StringResourcesHelperKt;
import app.chalo.compose.theme.ChaloPadding;
import app.chalo.compose.theme.ChaloTheme;
import app.chalo.compose.theme.ChaloThemeHelper;
import app.chalo.compose.theme.ChaloThemeKt;
import app.chalo.compose.theme.ChaloTypographyKt;
import app.chalo.compose.theme.ShimmerDimens;
import app.chalo.compose.theme.UIShape;
import app.chalo.core.compose.ComposableSingletons$NetworkInspectorScreenKt;
import app.chalo.core.compose.ComposableSingletons$PremiumBusParentScreenKt;
import app.chalo.core.navigation.premiumbus.PremiumBusParentComponent;
import app.chalo.home.ui.history.compose.ComposableSingletons$MyTicketsScreenUIKt;
import app.chalo.home.ui.history.compose.MyTicketsScreenUIKt;
import app.chalo.instantticket.ui.instantticketscreen.compose.ComposableSingletons$PaymentBottomSheetComposableKt;
import app.chalo.livetracking.tripplanner.ui.details.compose.component.ComposableSingletons$ItineraryLegInfoCardSectionKt;
import app.chalo.premiumbus.bulkbookingridedetails.ui.ComposableSingletons$PbBulkBookingRideDetailsScreenKt;
import app.chalo.premiumbus.bulkbookingridedetails.ui.PbBulkBookingRideDetailsScreenKt;
import app.chalo.premiumbus.ui.bulkbookingsuccess.compose.PremiumBusBulkBookingSuccessMainScreenKt;
import app.chalo.premiumbus.ui.changestop.ComposableSingletons$PremiumBusChangeStopScreenKt;
import app.chalo.premiumbus.ui.passpurchaselanding.compose.PbPassPurchaseLandingScreenKt;
import app.chalo.premiumbus.ui.productselection.ComposableSingletons$PremiumBusProductSelectionScreenKt;
import app.chalo.premiumbus.ui.productselection.PremiumBusProductSelectionScreenKt;
import app.chalo.premiumbus.ui.seatselection.compose.PremiumBusSeatSelectionMainScreenKt;
import app.chalo.premiumbus.ui.slotselection.ComposableSingletons$PremiumBusSlotSelectionUiStateKt;
import app.chalo.premiumbus.ui.slotselection.compose.ComposableSingletons$PremiumBusSlotSelectionScreenKt;
import app.chalo.premiumbus.ui.slotselection.compose.PremiumBusSlotSelectionScreenKt;
import app.chalo.premiumbus.ui.slotselectionlist.compose.SlotSelectionListMainScreenKt;
import app.chalo.premiumbus.ui.stopdetails.compose.PBStopDetailsMainScreenKt;
import app.chalo.premiumbus.ui.stopselection.ComposableSingletons$PBShimmerViewsKt;
import app.chalo.premiumbus.ui.stopselection.compose.PremiumBusStopSelectionMainScreenKt;
import app.chalo.providers.iconassetprovider.IconType;
import app.chalo.providers.stringprovider.StringEnum;
import app.chalo.quickpay.ui.payforticket.compose.ComposableSingletons$PayForTicketScreenKt;
import app.chalo.titoridedetail.ui.compose.ComposableSingletons$ExoPlayerComposableKt;
import app.chalo.uistate.base.ChaloColorToken;
import app.chalo.uistate.base.ChaloColorTokenKt;
import app.chalo.uistate.base.UiEventHandler;
import app.chalo.uistate.button.ButtonUIState;
import app.chalo.uistate.button.ButtonUIStateFactory;
import app.chalo.uistate.text.TextUIState;
import app.chalo.uistate.text.UIFontStyle;
import app.chalo.uistate.text.UIFontWeight;
import app.chalo.uistate.text.UITextAlign;
import app.chalo.uistate.text.UITextDecoration;
import app.chalo.uistate.text.UITextOverflow;
import app.chalo.uistate.text.UITextStyle;
import app.chalo.validationsdk.blevalidation.ui.common.ComposableSingletons$JourneyDetailsBottomSheetKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class pr implements Function3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f19061a;

    public /* synthetic */ pr(int i) {
        this.f19061a = i;
    }

    private final Object a(Object obj, Object obj2, Object obj3) {
        ColumnScope Card = (ColumnScope) obj;
        Composer composer = (Composer) obj2;
        int iIntValue = ((Integer) obj3).intValue();
        ComposableLambda composableLambda = ComposableSingletons$PbBulkBookingRideDetailsScreenKt.f6905a;
        Intrinsics.i(Card, "$this$Card");
        if (composer.shouldExecute((iIntValue & 17) != 16, iIntValue & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1002096487, iIntValue, -1, "app.chalo.premiumbus.bulkbookingridedetails.ui.ComposableSingletons$PbBulkBookingRideDetailsScreenKt.lambda$1002096487.<anonymous> (PbBulkBookingRideDetailsScreen.kt:1091)");
            }
            Modifier.Companion companion = Modifier.INSTANCE;
            Modifier modifierM784padding3ABfNKs = PaddingKt.m784padding3ABfNKs(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), ChaloTheme.b(composer, 0).h);
            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composer, 0);
            long currentCompositeKeyHashCode = ComposablesKt.getCurrentCompositeKeyHashCode(composer, 0);
            int i = (int) (currentCompositeKeyHashCode ^ (currentCompositeKeyHashCode >>> 32));
            CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composer, modifierM784padding3ABfNKs);
            ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor = companion2.getConstructor();
            if (composer.getApplier() == null) {
                ComposablesKt.invalidApplier();
            }
            composer.startReusableNode();
            if (composer.getInserting()) {
                composer.createNode(constructor);
            } else {
                composer.useNode();
            }
            Composer composerM3915constructorimpl = Updater.m3915constructorimpl(composer);
            pk0.v(companion2, composerM3915constructorimpl, measurePolicyColumnMeasurePolicy, composerM3915constructorimpl, currentCompositionLocalMap);
            Updater.m3923setimpl(composerM3915constructorimpl, modifierMaterializeModifier, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion2, composerM3915constructorimpl, Integer.valueOf(i), composerM3915constructorimpl));
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
            BoxKt.Box(ShimmerEffectKt.b(ClipKt.clip(SizeKt.fillMaxWidth$default(SizeKt.m814height3ABfNKs(companion, ShimmerDimens.d), 0.0f, 1, null), ChaloTheme.d(composer, 0).b), Color.m4595boximpl(ChaloTheme.a(composer, 0).A0), Color.m4595boximpl(ChaloTheme.a(composer, 0).q), 4), composer, 0);
            ChaloSpacersKt.o(composer, 0);
            BoxKt.Box(ShimmerEffectKt.b(ClipKt.clip(SizeKt.fillMaxWidth(SizeKt.m814height3ABfNKs(companion, ChaloTheme.b(composer, 0).i), 0.5f), ChaloTheme.d(composer, 0).b), Color.m4595boximpl(ChaloTheme.a(composer, 0).A0), Color.m4595boximpl(ChaloTheme.a(composer, 0).q), 4), composer, 0);
            composer.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return Unit.f17538a;
    }

    private final Object c(Object obj, Object obj2, Object obj3) {
        LazyItemScope item = (LazyItemScope) obj;
        Composer composer = (Composer) obj2;
        int iIntValue = ((Integer) obj3).intValue();
        ComposableLambda composableLambda = ComposableSingletons$PremiumBusChangeStopScreenKt.f7523a;
        Intrinsics.i(item, "$this$item");
        if (composer.shouldExecute((iIntValue & 17) != 16, iIntValue & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1758830047, iIntValue, -1, "app.chalo.premiumbus.ui.changestop.ComposableSingletons$PremiumBusChangeStopScreenKt.lambda$-1758830047.<anonymous> (PremiumBusChangeStopScreen.kt:220)");
            }
            ChaloSpacersKt.o(composer, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return Unit.f17538a;
    }

    private final Object d(Object obj, Object obj2, Object obj3) {
        PremiumBusParentComponent.PremiumBusChild child = (PremiumBusParentComponent.PremiumBusChild) obj;
        Composer composer = (Composer) obj2;
        int iIntValue = ((Integer) obj3).intValue();
        ComposableLambda composableLambda = ComposableSingletons$PremiumBusParentScreenKt.f2034a;
        Intrinsics.i(child, "child");
        if ((iIntValue & 6) == 0) {
            iIntValue |= composer.changed(child) ? 4 : 2;
        }
        if (composer.shouldExecute((iIntValue & 19) != 18, iIntValue & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1459043052, iIntValue, -1, "app.chalo.core.compose.ComposableSingletons$PremiumBusParentScreenKt.lambda$-1459043052.<anonymous> (PremiumBusParentScreen.kt:20)");
            }
            if (child instanceof PremiumBusParentComponent.PremiumBusChild.PBStopDetails) {
                composer.startReplaceGroup(-1282418234);
                PBStopDetailsMainScreenKt.c(((PremiumBusParentComponent.PremiumBusChild.PBStopDetails) child).f2172a, composer, 8);
                composer.endReplaceGroup();
            } else if (child instanceof PremiumBusParentComponent.PremiumBusChild.PremiumBusPassLanding) {
                composer.startReplaceGroup(-1282264350);
                PbPassPurchaseLandingScreenKt.e(((PremiumBusParentComponent.PremiumBusChild.PremiumBusPassLanding) child).f2174a, composer, 8);
                composer.endReplaceGroup();
            } else if (child instanceof PremiumBusParentComponent.PremiumBusChild.PremiumBusProductSelection) {
                composer.startReplaceGroup(-1282101476);
                PremiumBusProductSelectionScreenKt.d(((PremiumBusParentComponent.PremiumBusChild.PremiumBusProductSelection) child).f2175a, composer, 8);
                composer.endReplaceGroup();
            } else if (child instanceof PremiumBusParentComponent.PremiumBusChild.PremiumBusSeatSelection) {
                composer.startReplaceGroup(-1281935812);
                PremiumBusSeatSelectionMainScreenKt.a(((PremiumBusParentComponent.PremiumBusChild.PremiumBusSeatSelection) child).f2176a, composer, 8);
                composer.endReplaceGroup();
            } else if (child instanceof PremiumBusParentComponent.PremiumBusChild.PremiumBusSlotSelection) {
                composer.startReplaceGroup(-1281770272);
                PremiumBusSlotSelectionScreenKt.g(((PremiumBusParentComponent.PremiumBusChild.PremiumBusSlotSelection) child).f2177a, composer, 8);
                composer.endReplaceGroup();
            } else if (child instanceof PremiumBusParentComponent.PremiumBusChild.PremiumBusStopSelection) {
                composer.startReplaceGroup(-1281608452);
                PremiumBusStopSelectionMainScreenKt.a(((PremiumBusParentComponent.PremiumBusChild.PremiumBusStopSelection) child).f2178a, null, composer, 8);
                composer.endReplaceGroup();
            } else if (child instanceof PremiumBusParentComponent.PremiumBusChild.PremiumBusBulkBookingSuccessScreen) {
                composer.startReplaceGroup(-1281431566);
                PremiumBusBulkBookingSuccessMainScreenKt.c(((PremiumBusParentComponent.PremiumBusChild.PremiumBusBulkBookingSuccessScreen) child).f2173a, composer, 8);
                composer.endReplaceGroup();
            } else {
                if (!(child instanceof PremiumBusParentComponent.PremiumBusChild.SlotSelectionListScreen)) {
                    throw pk0.p(composer, -1981032523);
                }
                composer.startReplaceGroup(-1281256478);
                SlotSelectionListMainScreenKt.b(((PremiumBusParentComponent.PremiumBusChild.SlotSelectionListScreen) child).f2179a, composer, 8);
                composer.endReplaceGroup();
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return Unit.f17538a;
    }

    private final Object e(Object obj, Object obj2, Object obj3) {
        LazyItemScope item = (LazyItemScope) obj;
        Composer composer = (Composer) obj2;
        int iIntValue = ((Integer) obj3).intValue();
        ComposableLambda composableLambda = ComposableSingletons$PremiumBusProductSelectionScreenKt.f7688a;
        Intrinsics.i(item, "$this$item");
        if (composer.shouldExecute((iIntValue & 17) != 16, iIntValue & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(875706311, iIntValue, -1, "app.chalo.premiumbus.ui.productselection.ComposableSingletons$PremiumBusProductSelectionScreenKt.lambda$875706311.<anonymous> (PremiumBusProductSelectionScreen.kt:94)");
            }
            ChaloSpacersKt.m(composer, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return Unit.f17538a;
    }

    private final Object f(Object obj, Object obj2, Object obj3) {
        LazyItemScope item = (LazyItemScope) obj;
        Composer composer = (Composer) obj2;
        int iIntValue = ((Integer) obj3).intValue();
        ComposableLambda composableLambda = ComposableSingletons$PremiumBusSlotSelectionScreenKt.f7907a;
        Intrinsics.i(item, "$this$item");
        if (composer.shouldExecute((iIntValue & 17) != 16, iIntValue & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1538440924, iIntValue, -1, "app.chalo.premiumbus.ui.slotselection.compose.ComposableSingletons$PremiumBusSlotSelectionScreenKt.lambda$1538440924.<anonymous> (PremiumBusSlotSelectionScreen.kt:524)");
            }
            ChaloSpacersKt.n(composer, 0);
            ChaloCircularProgressIndicatorKt.b(SizeKt.m828size3ABfNKs(Modifier.INSTANCE, ChaloTheme.b(composer, 0).i), 0.0f, composer, 0, 2);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return Unit.f17538a;
    }

    private final Object g(Object obj, Object obj2, Object obj3) {
        LazyItemScope item = (LazyItemScope) obj;
        Composer composer = (Composer) obj2;
        int iIntValue = ((Integer) obj3).intValue();
        ComposableLambda composableLambda = ComposableSingletons$PremiumBusSlotSelectionScreenKt.f7907a;
        Intrinsics.i(item, "$this$item");
        if (composer.shouldExecute((iIntValue & 17) != 16, iIntValue & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1959950039, iIntValue, -1, "app.chalo.premiumbus.ui.slotselection.compose.ComposableSingletons$PremiumBusSlotSelectionScreenKt.lambda$1959950039.<anonymous> (PremiumBusSlotSelectionScreen.kt:532)");
            }
            ChaloSpacersKt.d(composer, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return Unit.f17538a;
    }

    private final Object h(Object obj, Object obj2, Object obj3) {
        LazyItemScope item = (LazyItemScope) obj;
        Composer composer = (Composer) obj2;
        int iIntValue = ((Integer) obj3).intValue();
        ComposableLambda composableLambda = ComposableSingletons$PremiumBusSlotSelectionScreenKt.f7907a;
        Intrinsics.i(item, "$this$item");
        if (composer.shouldExecute((iIntValue & 17) != 16, iIntValue & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(84115643, iIntValue, -1, "app.chalo.premiumbus.ui.slotselection.compose.ComposableSingletons$PremiumBusSlotSelectionScreenKt.lambda$84115643.<anonymous> (PremiumBusSlotSelectionScreen.kt:537)");
            }
            ChaloSpacersKt.k(composer, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return Unit.f17538a;
    }

    private final Object i(Object obj, Object obj2, Object obj3) {
        LazyItemScope item = (LazyItemScope) obj;
        Composer composer = (Composer) obj2;
        int iIntValue = ((Integer) obj3).intValue();
        ComposableLambda composableLambda = ComposableSingletons$PremiumBusSlotSelectionScreenKt.f7907a;
        Intrinsics.i(item, "$this$item");
        if (composer.shouldExecute((iIntValue & 17) != 16, iIntValue & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-2008742565, iIntValue, -1, "app.chalo.premiumbus.ui.slotselection.compose.ComposableSingletons$PremiumBusSlotSelectionScreenKt.lambda$-2008742565.<anonymous> (PremiumBusSlotSelectionScreen.kt:584)");
            }
            ChaloSpacersKt.c(composer, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return Unit.f17538a;
    }

    private final Object j(Object obj, Object obj2, Object obj3) {
        ColumnScope Card = (ColumnScope) obj;
        Composer composer = (Composer) obj2;
        int iIntValue = ((Integer) obj3).intValue();
        ComposableLambda composableLambda = ComposableSingletons$PremiumBusSlotSelectionScreenKt.f7907a;
        Intrinsics.i(Card, "$this$Card");
        if (composer.shouldExecute((iIntValue & 17) != 16, iIntValue & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-757424321, iIntValue, -1, "app.chalo.premiumbus.ui.slotselection.compose.ComposableSingletons$PremiumBusSlotSelectionScreenKt.lambda$-757424321.<anonymous> (PremiumBusSlotSelectionScreen.kt:705)");
            }
            Modifier.Companion companion = Modifier.INSTANCE;
            Modifier modifierM784padding3ABfNKs = PaddingKt.m784padding3ABfNKs(companion, ChaloTheme.b(composer, 0).h);
            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composer, 0);
            long currentCompositeKeyHashCode = ComposablesKt.getCurrentCompositeKeyHashCode(composer, 0);
            int i = (int) (currentCompositeKeyHashCode ^ (currentCompositeKeyHashCode >>> 32));
            CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composer, modifierM784padding3ABfNKs);
            ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor = companion2.getConstructor();
            if (composer.getApplier() == null) {
                ComposablesKt.invalidApplier();
            }
            composer.startReusableNode();
            if (composer.getInserting()) {
                composer.createNode(constructor);
            } else {
                composer.useNode();
            }
            Composer composerM3915constructorimpl = Updater.m3915constructorimpl(composer);
            pk0.v(companion2, composerM3915constructorimpl, measurePolicyColumnMeasurePolicy, composerM3915constructorimpl, currentCompositionLocalMap);
            Updater.m3923setimpl(composerM3915constructorimpl, modifierMaterializeModifier, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion2, composerM3915constructorimpl, Integer.valueOf(i), composerM3915constructorimpl));
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
            Modifier modifierClip = ClipKt.clip(SizeKt.m814height3ABfNKs(SizeKt.fillMaxWidth(companion, 0.7f), ChaloThemeHelper.a().h), ChaloTheme.d(composer, 0).c);
            ChaloColorToken.LightGrey lightGrey = ChaloColorToken.LightGrey.f9815a;
            Color colorM4595boximpl = Color.m4595boximpl(ChaloColorTokenKt.c(lightGrey));
            ChaloColorToken.ShimmerColor shimmerColor = ChaloColorToken.ShimmerColor.f9853a;
            BoxKt.Box(ShimmerEffectKt.b(modifierClip, colorM4595boximpl, Color.m4595boximpl(ChaloColorTokenKt.c(shimmerColor)), 4), composer, 0);
            ChaloSpacersKt.t(composer, 0);
            BoxKt.Box(ShimmerEffectKt.b(ClipKt.clip(SizeKt.m814height3ABfNKs(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), ChaloThemeHelper.a().h), ChaloTheme.d(composer, 0).c), Color.m4595boximpl(ChaloColorTokenKt.c(lightGrey)), Color.m4595boximpl(ChaloColorTokenKt.c(shimmerColor)), 4), composer, 0);
            ChaloSpacersKt.n(composer, 0);
            BoxKt.Box(ShimmerEffectKt.b(ClipKt.clip(SizeKt.m814height3ABfNKs(SizeKt.fillMaxWidth(companion, 0.7f), ChaloThemeHelper.a().h), ChaloTheme.d(composer, 0).c), Color.m4595boximpl(ChaloColorTokenKt.c(lightGrey)), Color.m4595boximpl(ChaloColorTokenKt.c(shimmerColor)), 4), composer, 0);
            ChaloSpacersKt.t(composer, 0);
            BoxKt.Box(ShimmerEffectKt.b(ClipKt.clip(SizeKt.m814height3ABfNKs(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), ChaloThemeHelper.a().h), ChaloTheme.d(composer, 0).c), Color.m4595boximpl(ChaloColorTokenKt.c(lightGrey)), Color.m4595boximpl(ChaloColorTokenKt.c(shimmerColor)), 4), composer, 0);
            ChaloSpacersKt.o(composer, 0);
            BoxKt.Box(ShimmerEffectKt.b(ClipKt.clip(SizeKt.m814height3ABfNKs(SizeKt.fillMaxWidth(companion, 0.4f), ChaloThemeHelper.a().k), ChaloTheme.d(composer, 0).c), Color.m4595boximpl(ChaloColorTokenKt.c(lightGrey)), Color.m4595boximpl(ChaloColorTokenKt.c(shimmerColor)), 4), composer, 0);
            ChaloSpacersKt.p(composer, 0);
            BoxKt.Box(ShimmerEffectKt.b(ClipKt.clip(dq.a(columnScopeInstance, SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), 1.0f, false, 2, null), ChaloTheme.d(composer, 0).c), Color.m4595boximpl(ChaloColorTokenKt.c(lightGrey)), Color.m4595boximpl(ChaloColorTokenKt.c(shimmerColor)), 4), composer, 0);
            ChaloSpacersKt.o(composer, 0);
            BoxKt.Box(ShimmerEffectKt.b(SizeKt.m814height3ABfNKs(ClipKt.clip(SizeKt.fillMaxWidth(companion, 0.4f), ChaloTheme.d(composer, 0).c), ChaloThemeHelper.a().k), Color.m4595boximpl(ChaloColorTokenKt.c(lightGrey)), Color.m4595boximpl(ChaloColorTokenKt.c(shimmerColor)), 4), composer, 0);
            composer.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return Unit.f17538a;
    }

    private final Object k(Object obj, Object obj2, Object obj3) {
        LazyItemScope item = (LazyItemScope) obj;
        Composer composer = (Composer) obj2;
        int iIntValue = ((Integer) obj3).intValue();
        ComposableLambda composableLambda = ComposableSingletons$PremiumBusSlotSelectionUiStateKt.f7794a;
        Intrinsics.i(item, "$this$item");
        if (composer.shouldExecute((iIntValue & 17) != 16, iIntValue & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1287223803, iIntValue, -1, "app.chalo.premiumbus.ui.slotselection.ComposableSingletons$PremiumBusSlotSelectionUiStateKt.lambda$-1287223803.<anonymous> (PremiumBusSlotSelectionUiState.kt:1227)");
            }
            Modifier.Companion companion = Modifier.INSTANCE;
            Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null);
            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getCenterHorizontally(), composer, 48);
            long currentCompositeKeyHashCode = ComposablesKt.getCurrentCompositeKeyHashCode(composer, 0);
            int i = (int) (currentCompositeKeyHashCode ^ (currentCompositeKeyHashCode >>> 32));
            CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composer, modifierFillMaxWidth$default);
            ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor = companion2.getConstructor();
            if (composer.getApplier() == null) {
                ComposablesKt.invalidApplier();
            }
            composer.startReusableNode();
            if (composer.getInserting()) {
                composer.createNode(constructor);
            } else {
                composer.useNode();
            }
            Composer composerM3915constructorimpl = Updater.m3915constructorimpl(composer);
            pk0.v(companion2, composerM3915constructorimpl, measurePolicyColumnMeasurePolicy, composerM3915constructorimpl, currentCompositionLocalMap);
            Updater.m3923setimpl(composerM3915constructorimpl, modifierMaterializeModifier, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion2, composerM3915constructorimpl, Integer.valueOf(i), composerM3915constructorimpl));
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
            ChaloSpacersKt.p(composer, 0);
            SpacerKt.Spacer(BackgroundKt.m263backgroundbw27NRU(SizeKt.m833width3ABfNKs(SizeKt.m814height3ABfNKs(companion, ChaloThemeHelper.a().d), ChaloThemeHelper.a().n), ChaloColorTokenKt.c(ChaloColorToken.LightGray.f9814a), ChaloThemeKt.d(ChaloThemeHelper.d.b)), composer, 0);
            ChaloSpacersKt.o(composer, 0);
            composer.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return Unit.f17538a;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i = this.f19061a;
        Unit unit = Unit.f17538a;
        switch (i) {
            case 0:
                AnimatedVisibilityScope AnimatedVisibility = (AnimatedVisibilityScope) obj;
                Composer composer = (Composer) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                ComposableLambda composableLambda = ComposableSingletons$ExoPlayerComposableKt.f9724a;
                Intrinsics.i(AnimatedVisibility, "$this$AnimatedVisibility");
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-942070714, iIntValue, -1, "app.chalo.titoridedetail.ui.compose.ComposableSingletons$ExoPlayerComposableKt.lambda$-942070714.<anonymous> (ExoPlayerComposable.kt:55)");
                }
                Modifier modifierM264backgroundbw27NRU$default = BackgroundKt.m264backgroundbw27NRU$default(SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null), ChaloTheme.a(composer, 0).t, null, 2, null);
                MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getCenter(), Alignment.INSTANCE.getCenterHorizontally(), composer, 54);
                long currentCompositeKeyHashCode = ComposablesKt.getCurrentCompositeKeyHashCode(composer, 0);
                int i2 = (int) (currentCompositeKeyHashCode ^ (currentCompositeKeyHashCode >>> 32));
                CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composer, modifierM264backgroundbw27NRU$default);
                ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
                Function0<ComposeUiNode> constructor = companion.getConstructor();
                if (composer.getApplier() == null) {
                    ComposablesKt.invalidApplier();
                }
                composer.startReusableNode();
                if (composer.getInserting()) {
                    composer.createNode(constructor);
                } else {
                    composer.useNode();
                }
                Composer composerM3915constructorimpl = Updater.m3915constructorimpl(composer);
                pk0.v(companion, composerM3915constructorimpl, measurePolicyColumnMeasurePolicy, composerM3915constructorimpl, currentCompositionLocalMap);
                Updater.m3923setimpl(composerM3915constructorimpl, modifierMaterializeModifier, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion, composerM3915constructorimpl, Integer.valueOf(i2), composerM3915constructorimpl));
                ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
                ChaloCircularLoadingBoxKt.a(null, composer, 0);
                composer.endNode();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                return unit;
            case 1:
                Modifier it = (Modifier) obj;
                Composer composer2 = (Composer) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                ComposableLambda composableLambda2 = ComposableSingletons$ItineraryLegInfoCardSectionKt.f4748a;
                Intrinsics.i(it, "it");
                if (composer2.shouldExecute((iIntValue2 & 17) != 16, iIntValue2 & 1)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-2083480599, iIntValue2, -1, "app.chalo.livetracking.tripplanner.ui.details.compose.component.ComposableSingletons$ItineraryLegInfoCardSectionKt.lambda$-2083480599.<anonymous> (ItineraryLegInfoCardSection.kt:34)");
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer2.skipToGroupEnd();
                }
                return unit;
            case 2:
                LazyItemScope item = (LazyItemScope) obj;
                Composer composer3 = (Composer) obj2;
                int iIntValue3 = ((Integer) obj3).intValue();
                ComposableLambda composableLambda3 = ComposableSingletons$JourneyDetailsBottomSheetKt.f10624a;
                Intrinsics.i(item, "$this$item");
                if (composer3.shouldExecute((iIntValue3 & 17) != 16, iIntValue3 & 1)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1703641612, iIntValue3, -1, "app.chalo.validationsdk.blevalidation.ui.common.ComposableSingletons$JourneyDetailsBottomSheetKt.lambda$-1703641612.<anonymous> (JourneyDetailsBottomSheet.kt:98)");
                    }
                    if (gf.x(Modifier.INSTANCE, ChaloTheme.b(composer3, 0).h, composer3, 0)) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer3.skipToGroupEnd();
                }
                return unit;
            case 3:
                LazyItemScope item2 = (LazyItemScope) obj;
                Composer composer4 = (Composer) obj2;
                int iIntValue4 = ((Integer) obj3).intValue();
                ComposableLambda composableLambda4 = ComposableSingletons$MyTicketsScreenUIKt.f3449a;
                Intrinsics.i(item2, "$this$item");
                if (composer4.shouldExecute((iIntValue4 & 17) != 16, iIntValue4 & 1)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1893507532, iIntValue4, -1, "app.chalo.home.ui.history.compose.ComposableSingletons$MyTicketsScreenUIKt.lambda$1893507532.<anonymous> (MyTicketsScreenUI.kt:283)");
                    }
                    MyTicketsScreenUIKt.i(composer4, 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer4.skipToGroupEnd();
                }
                return unit;
            case 4:
                ColumnScope ChaloRoundedCard = (ColumnScope) obj;
                Composer composer5 = (Composer) obj2;
                int iIntValue5 = ((Integer) obj3).intValue();
                ComposableLambda composableLambda5 = ComposableSingletons$MyTicketsScreenUIKt.f3449a;
                Intrinsics.i(ChaloRoundedCard, "$this$ChaloRoundedCard");
                if (composer5.shouldExecute((iIntValue5 & 17) != 16, iIntValue5 & 1)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1387589754, iIntValue5, -1, "app.chalo.home.ui.history.compose.ComposableSingletons$MyTicketsScreenUIKt.lambda$1387589754.<anonymous> (MyTicketsScreenUI.kt:782)");
                    }
                    Modifier.Companion companion2 = Modifier.INSTANCE;
                    Modifier modifierM784padding3ABfNKs = PaddingKt.m784padding3ABfNKs(SizeKt.fillMaxWidth$default(companion2, 0.0f, 1, null), ChaloTheme.b(composer5, 0).h);
                    Arrangement arrangement = Arrangement.INSTANCE;
                    Arrangement.Vertical top = arrangement.getTop();
                    Alignment.Companion companion3 = Alignment.INSTANCE;
                    MeasurePolicy measurePolicyColumnMeasurePolicy2 = ColumnKt.columnMeasurePolicy(top, companion3.getStart(), composer5, 0);
                    long currentCompositeKeyHashCode2 = ComposablesKt.getCurrentCompositeKeyHashCode(composer5, 0);
                    int i3 = (int) (currentCompositeKeyHashCode2 ^ (currentCompositeKeyHashCode2 >>> 32));
                    CompositionLocalMap currentCompositionLocalMap2 = composer5.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(composer5, modifierM784padding3ABfNKs);
                    ComposeUiNode.Companion companion4 = ComposeUiNode.INSTANCE;
                    Function0<ComposeUiNode> constructor2 = companion4.getConstructor();
                    if (composer5.getApplier() == null) {
                        ComposablesKt.invalidApplier();
                    }
                    composer5.startReusableNode();
                    if (composer5.getInserting()) {
                        composer5.createNode(constructor2);
                    } else {
                        composer5.useNode();
                    }
                    Composer composerM3915constructorimpl2 = Updater.m3915constructorimpl(composer5);
                    pk0.v(companion4, composerM3915constructorimpl2, measurePolicyColumnMeasurePolicy2, composerM3915constructorimpl2, currentCompositionLocalMap2);
                    Updater.m3923setimpl(composerM3915constructorimpl2, modifierMaterializeModifier2, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion4, composerM3915constructorimpl2, Integer.valueOf(i3), composerM3915constructorimpl2));
                    ColumnScopeInstance columnScopeInstance2 = ColumnScopeInstance.INSTANCE;
                    Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(companion2, 0.0f, 1, null);
                    MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(arrangement.getSpaceBetween(), companion3.getCenterVertically(), composer5, 54);
                    long currentCompositeKeyHashCode3 = ComposablesKt.getCurrentCompositeKeyHashCode(composer5, 0);
                    int i4 = (int) (currentCompositeKeyHashCode3 ^ (currentCompositeKeyHashCode3 >>> 32));
                    CompositionLocalMap currentCompositionLocalMap3 = composer5.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier3 = ComposedModifierKt.materializeModifier(composer5, modifierFillMaxWidth$default);
                    Function0<ComposeUiNode> constructor3 = companion4.getConstructor();
                    if (composer5.getApplier() == null) {
                        ComposablesKt.invalidApplier();
                    }
                    composer5.startReusableNode();
                    if (composer5.getInserting()) {
                        composer5.createNode(constructor3);
                    } else {
                        composer5.useNode();
                    }
                    Composer composerM3915constructorimpl3 = Updater.m3915constructorimpl(composer5);
                    pk0.v(companion4, composerM3915constructorimpl3, measurePolicyRowMeasurePolicy, composerM3915constructorimpl3, currentCompositionLocalMap3);
                    Updater.m3923setimpl(composerM3915constructorimpl3, modifierMaterializeModifier3, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion4, composerM3915constructorimpl3, Integer.valueOf(i4), composerM3915constructorimpl3));
                    RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
                    float f = ShimmerDimens.b;
                    Modifier modifierClip = ClipKt.clip(SizeKt.fillMaxWidth(SizeKt.m814height3ABfNKs(companion2, f), 0.5f), ChaloTheme.d(composer5, 0).b);
                    ChaloColorToken.LightGray lightGray = ChaloColorToken.LightGray.f9814a;
                    BoxKt.Box(ShimmerEffectKt.b(modifierClip, Color.m4595boximpl(ChaloColorTokenKt.c(lightGray)), Color.m4595boximpl(ChaloTheme.a(composer5, 0).q), 4), composer5, 0);
                    composer5.endNode();
                    SpacerKt.Spacer(SizeKt.m828size3ABfNKs(companion2, ChaloTheme.b(composer5, 0).h), composer5, 0);
                    BoxKt.Box(ShimmerEffectKt.b(ClipKt.clip(SizeKt.fillMaxWidth$default(SizeKt.m814height3ABfNKs(companion2, ShimmerDimens.c), 0.0f, 1, null), ChaloTheme.d(composer5, 0).b), Color.m4595boximpl(ChaloColorTokenKt.c(lightGray)), Color.m4595boximpl(ChaloTheme.a(composer5, 0).q), 4), composer5, 0);
                    SpacerKt.Spacer(SizeKt.m828size3ABfNKs(companion2, ChaloTheme.b(composer5, 0).h), composer5, 0);
                    Modifier modifierFillMaxWidth$default2 = SizeKt.fillMaxWidth$default(companion2, 0.0f, 1, null);
                    MeasurePolicy measurePolicyRowMeasurePolicy2 = RowKt.rowMeasurePolicy(arrangement.getSpaceBetween(), companion3.getCenterVertically(), composer5, 54);
                    long currentCompositeKeyHashCode4 = ComposablesKt.getCurrentCompositeKeyHashCode(composer5, 0);
                    int i5 = (int) (currentCompositeKeyHashCode4 ^ (currentCompositeKeyHashCode4 >>> 32));
                    CompositionLocalMap currentCompositionLocalMap4 = composer5.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier4 = ComposedModifierKt.materializeModifier(composer5, modifierFillMaxWidth$default2);
                    Function0<ComposeUiNode> constructor4 = companion4.getConstructor();
                    if (composer5.getApplier() == null) {
                        ComposablesKt.invalidApplier();
                    }
                    composer5.startReusableNode();
                    if (composer5.getInserting()) {
                        composer5.createNode(constructor4);
                    } else {
                        composer5.useNode();
                    }
                    Composer composerM3915constructorimpl4 = Updater.m3915constructorimpl(composer5);
                    pk0.v(companion4, composerM3915constructorimpl4, measurePolicyRowMeasurePolicy2, composerM3915constructorimpl4, currentCompositionLocalMap4);
                    Updater.m3923setimpl(composerM3915constructorimpl4, modifierMaterializeModifier4, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion4, composerM3915constructorimpl4, Integer.valueOf(i5), composerM3915constructorimpl4));
                    BoxKt.Box(ShimmerEffectKt.b(ClipKt.clip(SizeKt.fillMaxWidth(SizeKt.m814height3ABfNKs(companion2, f), 0.4f), ChaloTheme.d(composer5, 0).b), Color.m4595boximpl(ChaloColorTokenKt.c(lightGray)), Color.m4595boximpl(ChaloTheme.a(composer5, 0).q), 4), composer5, 0);
                    BoxKt.Box(ShimmerEffectKt.b(ClipKt.clip(SizeKt.fillMaxWidth(SizeKt.m814height3ABfNKs(companion2, ShimmerDimens.f1925a), 0.4f), RoundedCornerShapeKt.m1074RoundedCornerShape0680j_4(Dp.m7278constructorimpl(50))), Color.m4595boximpl(ChaloColorTokenKt.c(lightGray)), Color.m4595boximpl(ChaloTheme.a(composer5, 0).q), 4), composer5, 0);
                    composer5.endNode();
                    composer5.endNode();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer5.skipToGroupEnd();
                }
                return unit;
            case 5:
                RowScope TextButton = (RowScope) obj;
                Composer composer6 = (Composer) obj2;
                int iIntValue6 = ((Integer) obj3).intValue();
                ComposableLambda composableLambda6 = ComposableSingletons$NetworkInspectorScreenKt.f2033a;
                Intrinsics.i(TextButton, "$this$TextButton");
                if (composer6.shouldExecute((iIntValue6 & 17) != 16, iIntValue6 & 1)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1637551376, iIntValue6, -1, "app.chalo.core.compose.ComposableSingletons$NetworkInspectorScreenKt.lambda$1637551376.<anonymous> (NetworkInspectorScreen.kt:71)");
                    }
                    TextKt.m2623TextNvy7gAk("Back", null, 0L, null, TextUnitKt.getSp(16), null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, composer6, 24582, 0, 262126);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer6.skipToGroupEnd();
                }
                return unit;
            case 6:
                RowScope TextButton2 = (RowScope) obj;
                Composer composer7 = (Composer) obj2;
                int iIntValue7 = ((Integer) obj3).intValue();
                ComposableLambda composableLambda7 = ComposableSingletons$NetworkInspectorScreenKt.f2033a;
                Intrinsics.i(TextButton2, "$this$TextButton");
                if (composer7.shouldExecute((iIntValue7 & 17) != 16, iIntValue7 & 1)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1408804420, iIntValue7, -1, "app.chalo.core.compose.ComposableSingletons$NetworkInspectorScreenKt.lambda$-1408804420.<anonymous> (NetworkInspectorScreen.kt:83)");
                    }
                    TextKt.m2623TextNvy7gAk("Refresh", null, 0L, null, TextUnitKt.getSp(16), null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, composer7, 24582, 0, 262126);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer7.skipToGroupEnd();
                }
                return unit;
            case 7:
                RowScope TextButton3 = (RowScope) obj;
                Composer composer8 = (Composer) obj2;
                int iIntValue8 = ((Integer) obj3).intValue();
                ComposableLambda composableLambda8 = ComposableSingletons$NetworkInspectorScreenKt.f2033a;
                Intrinsics.i(TextButton3, "$this$TextButton");
                if (composer8.shouldExecute((iIntValue8 & 17) != 16, iIntValue8 & 1)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(650693061, iIntValue8, -1, "app.chalo.core.compose.ComposableSingletons$NetworkInspectorScreenKt.lambda$650693061.<anonymous> (NetworkInspectorScreen.kt:92)");
                    }
                    TextKt.m2623TextNvy7gAk("Copy cURL", null, 0L, null, TextUnitKt.getSp(16), null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, composer8, 24582, 0, 262126);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer8.skipToGroupEnd();
                }
                return unit;
            case 8:
                LazyItemScope item3 = (LazyItemScope) obj;
                Composer composer9 = (Composer) obj2;
                int iIntValue9 = ((Integer) obj3).intValue();
                ComposableLambda composableLambda9 = ComposableSingletons$NetworkInspectorScreenKt.f2033a;
                Intrinsics.i(item3, "$this$item");
                if (composer9.shouldExecute((iIntValue9 & 17) != 16, iIntValue9 & 1)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1354248276, iIntValue9, -1, "app.chalo.core.compose.ComposableSingletons$NetworkInspectorScreenKt.lambda$-1354248276.<anonymous> (NetworkInspectorScreen.kt:202)");
                    }
                    TextKt.m2623TextNvy7gAk("End of list", SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), 0L, null, 0L, null, null, null, 0L, null, TextAlign.m7161boximpl(TextAlign.INSTANCE.m7168getCentere0LSkKk()), 0L, 0, false, 0, 0, null, MaterialTheme.INSTANCE.getTypography(composer9, MaterialTheme.$stable).getBodySmall(), composer9, 54, 0, 130044);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer9.skipToGroupEnd();
                }
                return unit;
            case 9:
                ColumnScope ChaloRoundedCard2 = (ColumnScope) obj;
                Composer composer10 = (Composer) obj2;
                int iIntValue10 = ((Integer) obj3).intValue();
                ComposableLambda composableLambda10 = ComposableSingletons$PBShimmerViewsKt.f7954a;
                Intrinsics.i(ChaloRoundedCard2, "$this$ChaloRoundedCard");
                if (composer10.shouldExecute((iIntValue10 & 17) != 16, iIntValue10 & 1)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1383735649, iIntValue10, -1, "app.chalo.premiumbus.ui.stopselection.ComposableSingletons$PBShimmerViewsKt.lambda$1383735649.<anonymous> (PBShimmerViews.kt:39)");
                    }
                    Modifier.Companion companion5 = Modifier.INSTANCE;
                    Modifier modifierM784padding3ABfNKs2 = PaddingKt.m784padding3ABfNKs(SizeKt.fillMaxWidth$default(companion5, 0.0f, 1, null), ChaloTheme.b(composer10, 0).h);
                    MeasurePolicy measurePolicyColumnMeasurePolicy3 = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composer10, 0);
                    long currentCompositeKeyHashCode5 = ComposablesKt.getCurrentCompositeKeyHashCode(composer10, 0);
                    int i6 = (int) (currentCompositeKeyHashCode5 ^ (currentCompositeKeyHashCode5 >>> 32));
                    CompositionLocalMap currentCompositionLocalMap5 = composer10.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier5 = ComposedModifierKt.materializeModifier(composer10, modifierM784padding3ABfNKs2);
                    ComposeUiNode.Companion companion6 = ComposeUiNode.INSTANCE;
                    Function0<ComposeUiNode> constructor5 = companion6.getConstructor();
                    if (composer10.getApplier() == null) {
                        ComposablesKt.invalidApplier();
                    }
                    composer10.startReusableNode();
                    if (composer10.getInserting()) {
                        composer10.createNode(constructor5);
                    } else {
                        composer10.useNode();
                    }
                    Composer composerM3915constructorimpl5 = Updater.m3915constructorimpl(composer10);
                    pk0.v(companion6, composerM3915constructorimpl5, measurePolicyColumnMeasurePolicy3, composerM3915constructorimpl5, currentCompositionLocalMap5);
                    Updater.m3923setimpl(composerM3915constructorimpl5, modifierMaterializeModifier5, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion6, composerM3915constructorimpl5, Integer.valueOf(i6), composerM3915constructorimpl5));
                    ColumnScopeInstance columnScopeInstance3 = ColumnScopeInstance.INSTANCE;
                    BoxKt.Box(ShimmerEffectKt.b(ClipKt.clip(SizeKt.m814height3ABfNKs(SizeKt.fillMaxWidth(companion5, 0.35f), ChaloTheme.b(composer10, 0).k), RoundedCornerShapeKt.m1074RoundedCornerShape0680j_4(ChaloTheme.b(composer10, 0).i)), Color.m4595boximpl(ChaloTheme.a(composer10, 0).p), Color.m4595boximpl(ChaloTheme.a(composer10, 0).q), 4), composer10, 0);
                    SpacerKt.Spacer(SizeKt.m814height3ABfNKs(companion5, ChaloTheme.b(composer10, 0).h), composer10, 0);
                    BoxKt.Box(ShimmerEffectKt.b(ClipKt.clip(SizeKt.m814height3ABfNKs(SizeKt.fillMaxWidth(companion5, 0.7f), ChaloTheme.b(composer10, 0).l), ChaloTheme.d(composer10, 0).b), Color.m4595boximpl(ChaloTheme.a(composer10, 0).p), Color.m4595boximpl(ChaloTheme.a(composer10, 0).q), 4), composer10, 0);
                    composer10.endNode();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer10.skipToGroupEnd();
                }
                return unit;
            case 10:
                RowScope ChaloButtonWithCustomContent = (RowScope) obj;
                Composer composer11 = (Composer) obj2;
                int iIntValue11 = ((Integer) obj3).intValue();
                ComposableLambda composableLambda11 = ComposableSingletons$PBStopDetailsKt.f145a;
                Intrinsics.i(ChaloButtonWithCustomContent, "$this$ChaloButtonWithCustomContent");
                if (composer11.shouldExecute((iIntValue11 & 17) != 16, iIntValue11 & 1)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-676071080, iIntValue11, -1, "ComposableSingletons$PBStopDetailsKt.lambda$-676071080.<anonymous> (PBStopDetails.kt:64)");
                    }
                    Painter painterA = PainterResourceHelperKt.a(IconType.IC_STOP_DIRECTIONS, composer11, 6);
                    Modifier.Companion companion7 = Modifier.INSTANCE;
                    ImageKt.Image(painterA, (String) null, SizeKt.m828size3ABfNKs(companion7, ChaloTheme.b(composer11, 0).i), (Alignment) null, ContentScale.INSTANCE.getInside(), 0.0f, (ColorFilter) null, composer11, Painter.$stable | 24624, 104);
                    SpacerKt.Spacer(SizeKt.m833width3ABfNKs(companion7, ChaloTheme.b(composer11, 0).f), composer11, 0);
                    TextKt.m2623TextNvy7gAk(StringResourcesHelperKt.c(StringEnum.DIRECTIONS, new Object[0], composer11, 6), null, ChaloTheme.a(composer11, 0).f1915a, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ChaloTypographyKt.h(ChaloTheme.e(composer11, 0)), composer11, 0, 0, 131066);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer11.skipToGroupEnd();
                }
                return unit;
            case 11:
                ColumnScope ChaloRoundedCard3 = (ColumnScope) obj;
                Composer composer12 = (Composer) obj2;
                int iIntValue12 = ((Integer) obj3).intValue();
                ComposableLambda composableLambda12 = ComposableSingletons$PayForTicketScreenKt.f8891a;
                Intrinsics.i(ChaloRoundedCard3, "$this$ChaloRoundedCard");
                if (composer12.shouldExecute((iIntValue12 & 17) != 16, iIntValue12 & 1)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(566645292, iIntValue12, -1, "app.chalo.quickpay.ui.payforticket.compose.ComposableSingletons$PayForTicketScreenKt.lambda$566645292.<anonymous> (PayForTicketScreen.kt:102)");
                    }
                    Modifier.Companion companion8 = Modifier.INSTANCE;
                    Modifier modifierM784padding3ABfNKs3 = PaddingKt.m784padding3ABfNKs(companion8, ChaloTheme.b(composer12, 0).h);
                    MeasurePolicy measurePolicyColumnMeasurePolicy4 = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composer12, 0);
                    long currentCompositeKeyHashCode6 = ComposablesKt.getCurrentCompositeKeyHashCode(composer12, 0);
                    int i7 = (int) ((currentCompositeKeyHashCode6 >>> 32) ^ currentCompositeKeyHashCode6);
                    CompositionLocalMap currentCompositionLocalMap6 = composer12.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier6 = ComposedModifierKt.materializeModifier(composer12, modifierM784padding3ABfNKs3);
                    ComposeUiNode.Companion companion9 = ComposeUiNode.INSTANCE;
                    Function0<ComposeUiNode> constructor6 = companion9.getConstructor();
                    if (composer12.getApplier() == null) {
                        ComposablesKt.invalidApplier();
                    }
                    composer12.startReusableNode();
                    if (composer12.getInserting()) {
                        composer12.createNode(constructor6);
                    } else {
                        composer12.useNode();
                    }
                    Composer composerM3915constructorimpl6 = Updater.m3915constructorimpl(composer12);
                    pk0.v(companion9, composerM3915constructorimpl6, measurePolicyColumnMeasurePolicy4, composerM3915constructorimpl6, currentCompositionLocalMap6);
                    Updater.m3923setimpl(composerM3915constructorimpl6, modifierMaterializeModifier6, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion9, composerM3915constructorimpl6, Integer.valueOf(i7), composerM3915constructorimpl6));
                    ColumnScopeInstance columnScopeInstance4 = ColumnScopeInstance.INSTANCE;
                    TextKt.m2623TextNvy7gAk(StringResourcesHelperKt.c(StringEnum.PAY_USING_CHALO_PAY, new Object[0], composer12, 6), null, ChaloTheme.a(composer12, 0).g, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ChaloTypographyKt.f(ChaloTheme.e(composer12, 0)), composer12, 0, 0, 131066);
                    SpacerKt.Spacer(SizeKt.m814height3ABfNKs(companion8, ChaloTheme.b(composer12, 0).d), composer12, 0);
                    TextKt.m2623TextNvy7gAk(StringResourcesHelperKt.c(StringEnum.PAY_USING_CHALO_PAY_DESC, new Object[0], composer12, 6), null, ChaloTheme.a(composer12, 0).i, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ChaloTypographyKt.c(ChaloTheme.e(composer12, 0)), composer12, 0, 0, 131066);
                    composer12.endNode();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer12.skipToGroupEnd();
                }
                return unit;
            case 12:
                ColumnScope ChaloRoundedCard4 = (ColumnScope) obj;
                Composer composer13 = (Composer) obj2;
                int iIntValue13 = ((Integer) obj3).intValue();
                ComposableLambda composableLambda13 = ComposableSingletons$PayForTicketScreenKt.f8891a;
                Intrinsics.i(ChaloRoundedCard4, "$this$ChaloRoundedCard");
                if (composer13.shouldExecute((iIntValue13 & 17) != 16, iIntValue13 & 1)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-2023698398, iIntValue13, -1, "app.chalo.quickpay.ui.payforticket.compose.ComposableSingletons$PayForTicketScreenKt.lambda$-2023698398.<anonymous> (PayForTicketScreen.kt:130)");
                    }
                    Modifier.Companion companion10 = Modifier.INSTANCE;
                    Modifier modifierM784padding3ABfNKs4 = PaddingKt.m784padding3ABfNKs(companion10, ChaloTheme.b(composer13, 0).h);
                    MeasurePolicy measurePolicyColumnMeasurePolicy5 = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composer13, 0);
                    long currentCompositeKeyHashCode7 = ComposablesKt.getCurrentCompositeKeyHashCode(composer13, 0);
                    int i8 = (int) ((currentCompositeKeyHashCode7 >>> 32) ^ currentCompositeKeyHashCode7);
                    CompositionLocalMap currentCompositionLocalMap7 = composer13.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier7 = ComposedModifierKt.materializeModifier(composer13, modifierM784padding3ABfNKs4);
                    ComposeUiNode.Companion companion11 = ComposeUiNode.INSTANCE;
                    Function0<ComposeUiNode> constructor7 = companion11.getConstructor();
                    if (composer13.getApplier() == null) {
                        ComposablesKt.invalidApplier();
                    }
                    composer13.startReusableNode();
                    if (composer13.getInserting()) {
                        composer13.createNode(constructor7);
                    } else {
                        composer13.useNode();
                    }
                    Composer composerM3915constructorimpl7 = Updater.m3915constructorimpl(composer13);
                    pk0.v(companion11, composerM3915constructorimpl7, measurePolicyColumnMeasurePolicy5, composerM3915constructorimpl7, currentCompositionLocalMap7);
                    Updater.m3923setimpl(composerM3915constructorimpl7, modifierMaterializeModifier7, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion11, composerM3915constructorimpl7, Integer.valueOf(i8), composerM3915constructorimpl7));
                    ColumnScopeInstance columnScopeInstance5 = ColumnScopeInstance.INSTANCE;
                    TextKt.m2623TextNvy7gAk(StringResourcesHelperKt.c(StringEnum.FIND_FARE, new Object[0], composer13, 6), null, ChaloTheme.a(composer13, 0).g, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ChaloTypographyKt.f(ChaloTheme.e(composer13, 0)), composer13, 0, 0, 131066);
                    SpacerKt.Spacer(SizeKt.m814height3ABfNKs(companion10, ChaloTheme.b(composer13, 0).d), composer13, 0);
                    TextKt.m2623TextNvy7gAk(StringResourcesHelperKt.c(StringEnum.FIND_FARE_DESC, new Object[0], composer13, 6), null, ChaloTheme.a(composer13, 0).i, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ChaloTypographyKt.c(ChaloTheme.e(composer13, 0)), composer13, 0, 0, 131066);
                    composer13.endNode();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer13.skipToGroupEnd();
                }
                return unit;
            case 13:
                ColumnScope ChaloRoundedCard5 = (ColumnScope) obj;
                Composer composer14 = (Composer) obj2;
                int iIntValue14 = ((Integer) obj3).intValue();
                ComposableLambda composableLambda14 = ComposableSingletons$PaymentBottomSheetComposableKt.f3962a;
                Intrinsics.i(ChaloRoundedCard5, "$this$ChaloRoundedCard");
                if (composer14.shouldExecute((iIntValue14 & 17) != 16, iIntValue14 & 1)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1328864318, iIntValue14, -1, "app.chalo.instantticket.ui.instantticketscreen.compose.ComposableSingletons$PaymentBottomSheetComposableKt.lambda$1328864318.<anonymous> (PaymentBottomSheetComposable.kt:285)");
                    }
                    Modifier.Companion companion12 = Modifier.INSTANCE;
                    Modifier modifierM784padding3ABfNKs5 = PaddingKt.m784padding3ABfNKs(companion12, ChaloTheme.b(composer14, 0).h);
                    Arrangement.Horizontal start = Arrangement.INSTANCE.getStart();
                    Alignment.Companion companion13 = Alignment.INSTANCE;
                    MeasurePolicy measurePolicyRowMeasurePolicy3 = RowKt.rowMeasurePolicy(start, companion13.getTop(), composer14, 0);
                    long currentCompositeKeyHashCode8 = ComposablesKt.getCurrentCompositeKeyHashCode(composer14, 0);
                    int i9 = (int) (currentCompositeKeyHashCode8 ^ (currentCompositeKeyHashCode8 >>> 32));
                    CompositionLocalMap currentCompositionLocalMap8 = composer14.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier8 = ComposedModifierKt.materializeModifier(composer14, modifierM784padding3ABfNKs5);
                    ComposeUiNode.Companion companion14 = ComposeUiNode.INSTANCE;
                    Function0<ComposeUiNode> constructor8 = companion14.getConstructor();
                    if (composer14.getApplier() == null) {
                        ComposablesKt.invalidApplier();
                    }
                    composer14.startReusableNode();
                    if (composer14.getInserting()) {
                        composer14.createNode(constructor8);
                    } else {
                        composer14.useNode();
                    }
                    Composer composerM3915constructorimpl8 = Updater.m3915constructorimpl(composer14);
                    pk0.v(companion14, composerM3915constructorimpl8, measurePolicyRowMeasurePolicy3, composerM3915constructorimpl8, currentCompositionLocalMap8);
                    Updater.m3923setimpl(composerM3915constructorimpl8, modifierMaterializeModifier8, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion14, composerM3915constructorimpl8, Integer.valueOf(i9), composerM3915constructorimpl8));
                    RowScopeInstance rowScopeInstance2 = RowScopeInstance.INSTANCE;
                    ImageKt.Image(PainterResourceHelperKt.a(IconType.PAYMENT_OTHER_MODES, composer14, 6), "", SizeKt.m814height3ABfNKs(SizeKt.m833width3ABfNKs(companion12, ChaloTheme.b(composer14, 0).k), ChaloTheme.b(composer14, 0).k), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composer14, Painter.$stable | 48, 120);
                    TextKt.m2623TextNvy7gAk(StringResourcesHelperKt.c(StringEnum.OTHER_MODES, new Object[0], composer14, 6), rowScopeInstance2.align(PaddingKt.m788paddingqDBjuR0$default(companion12, ChaloTheme.b(composer14, 0).g, 0.0f, 0.0f, 0.0f, 14, null), companion13.getCenterVertically()), ChaloTheme.a(composer14, 0).g, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ChaloTypographyKt.g(ChaloTheme.e(composer14, 0)), composer14, 0, 0, 131064);
                    composer14.endNode();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer14.skipToGroupEnd();
                }
                return unit;
            case 14:
                ColumnScope ChaloRoundedCard6 = (ColumnScope) obj;
                Composer composer15 = (Composer) obj2;
                int iIntValue15 = ((Integer) obj3).intValue();
                ComposableLambda composableLambda15 = ComposableSingletons$PaymentBottomSheetComposableKt.f3962a;
                Intrinsics.i(ChaloRoundedCard6, "$this$ChaloRoundedCard");
                if (composer15.shouldExecute((iIntValue15 & 17) != 16, iIntValue15 & 1)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1728131985, iIntValue15, -1, "app.chalo.instantticket.ui.instantticketscreen.compose.ComposableSingletons$PaymentBottomSheetComposableKt.lambda$1728131985.<anonymous> (PaymentBottomSheetComposable.kt:310)");
                    }
                    BoxKt.Box(ShimmerEffectKt.b(SizeKt.fillMaxWidth$default(SizeKt.m814height3ABfNKs(Modifier.INSTANCE, ShimmerDimens.d), 0.0f, 1, null), null, null, 7), composer15, 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer15.skipToGroupEnd();
                }
                return unit;
            case 15:
                LazyItemScope item4 = (LazyItemScope) obj;
                Composer composer16 = (Composer) obj2;
                int iIntValue16 = ((Integer) obj3).intValue();
                ComposableLambda composableLambda16 = ComposableSingletons$PbBulkBookingRideDetailsScreenKt.f6905a;
                Intrinsics.i(item4, "$this$item");
                if (composer16.shouldExecute((iIntValue16 & 17) != 16, iIntValue16 & 1)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1981313787, iIntValue16, -1, "app.chalo.premiumbus.bulkbookingridedetails.ui.ComposableSingletons$PbBulkBookingRideDetailsScreenKt.lambda$1981313787.<anonymous> (PbBulkBookingRideDetailsScreen.kt:396)");
                    }
                    PbBulkBookingRideDetailsScreenKt.j(composer16, 0, StringResourcesHelperKt.c(StringEnum.YOU_HAVE_NO_PLANNED_RIDES, new Object[0], composer16, 6));
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer16.skipToGroupEnd();
                }
                return unit;
            case 16:
                LazyItemScope item5 = (LazyItemScope) obj;
                Composer composer17 = (Composer) obj2;
                int iIntValue17 = ((Integer) obj3).intValue();
                ComposableLambda composableLambda17 = ComposableSingletons$PbBulkBookingRideDetailsScreenKt.f6905a;
                Intrinsics.i(item5, "$this$item");
                if (composer17.shouldExecute((iIntValue17 & 17) != 16, iIntValue17 & 1)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1556167918, iIntValue17, -1, "app.chalo.premiumbus.bulkbookingridedetails.ui.ComposableSingletons$PbBulkBookingRideDetailsScreenKt.lambda$-1556167918.<anonymous> (PbBulkBookingRideDetailsScreen.kt:484)");
                    }
                    ChaloSpacersKt.m(composer17, 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer17.skipToGroupEnd();
                }
                return unit;
            case 17:
                LazyItemScope item6 = (LazyItemScope) obj;
                Composer composer18 = (Composer) obj2;
                int iIntValue18 = ((Integer) obj3).intValue();
                ComposableLambda composableLambda18 = ComposableSingletons$PbBulkBookingRideDetailsScreenKt.f6905a;
                Intrinsics.i(item6, "$this$item");
                if (composer18.shouldExecute((iIntValue18 & 17) != 16, iIntValue18 & 1)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(2049565425, iIntValue18, -1, "app.chalo.premiumbus.bulkbookingridedetails.ui.ComposableSingletons$PbBulkBookingRideDetailsScreenKt.lambda$2049565425.<anonymous> (PbBulkBookingRideDetailsScreen.kt:496)");
                    }
                    PbBulkBookingRideDetailsScreenKt.j(composer18, 0, StringResourcesHelperKt.c(StringEnum.YOU_HAVE_NO_PAST_RIDES, new Object[0], composer18, 6));
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer18.skipToGroupEnd();
                }
                return unit;
            case 18:
                LazyItemScope item7 = (LazyItemScope) obj;
                Composer composer19 = (Composer) obj2;
                int iIntValue19 = ((Integer) obj3).intValue();
                ComposableLambda composableLambda19 = ComposableSingletons$PbBulkBookingRideDetailsScreenKt.f6905a;
                Intrinsics.i(item7, "$this$item");
                if (composer19.shouldExecute((iIntValue19 & 17) != 16, iIntValue19 & 1)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1708009848, iIntValue19, -1, "app.chalo.premiumbus.bulkbookingridedetails.ui.ComposableSingletons$PbBulkBookingRideDetailsScreenKt.lambda$-1708009848.<anonymous> (PbBulkBookingRideDetailsScreen.kt:545)");
                    }
                    ChaloSpacersKt.m(composer19, 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer19.skipToGroupEnd();
                }
                return unit;
            case 19:
                return a(obj, obj2, obj3);
            case 20:
                return c(obj, obj2, obj3);
            case 21:
                return d(obj, obj2, obj3);
            case 22:
                return e(obj, obj2, obj3);
            case 23:
                return f(obj, obj2, obj3);
            case 24:
                return g(obj, obj2, obj3);
            case 25:
                return h(obj, obj2, obj3);
            case 26:
                return i(obj, obj2, obj3);
            case 27:
                return j(obj, obj2, obj3);
            case 28:
                return k(obj, obj2, obj3);
            default:
                ColumnScope Card = (ColumnScope) obj;
                Composer composer20 = (Composer) obj2;
                int iIntValue20 = ((Integer) obj3).intValue();
                ComposableLambda composableLambda20 = ComposableSingletons$PremiumBusSlotSelectionUiStateKt.f7794a;
                Intrinsics.i(Card, "$this$Card");
                if (composer20.shouldExecute((iIntValue20 & 17) != 16, iIntValue20 & 1)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(276201776, iIntValue20, -1, "app.chalo.premiumbus.ui.slotselection.ComposableSingletons$PremiumBusSlotSelectionUiStateKt.lambda$276201776.<anonymous> (PremiumBusSlotSelectionUiState.kt:2455)");
                    }
                    TextUIState.ChaloTextUIState chaloTextUIState = new TextUIState.ChaloTextUIState("Continue", UITextStyle.HeadlineSmall, ChaloColorToken.White.f9870a, 0, (UITextAlign) null, (UIFontWeight) null, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8184);
                    UIShape.Rectangle rectangle = UIShape.d;
                    Object objRememberedValue = composer20.rememberedValue();
                    if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue = new ep(29);
                        composer20.updateRememberedValue(objRememberedValue);
                    }
                    ButtonUIState buttonUIStateF = ButtonUIStateFactory.f(ButtonUIStateFactory.f9921a, chaloTextUIState, (Function0) objRememberedValue, rectangle, false, 0.0f, 52);
                    Modifier.Companion companion15 = Modifier.INSTANCE;
                    float f2 = ChaloThemeHelper.a().h;
                    ChaloFilledButtonKt.a(0, 0, composer20, SizeKt.m814height3ABfNKs(SizeKt.fillMaxWidth$default(ChaloThemeKt.c(companion15, new ChaloPadding(f2, f2, f2, f2)), 0.0f, 1, null), ChaloThemeHelper.a().n), buttonUIStateF);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer20.skipToGroupEnd();
                }
                return unit;
        }
    }
}
