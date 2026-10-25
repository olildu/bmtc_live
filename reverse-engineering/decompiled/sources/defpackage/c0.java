package defpackage;

import androidx.compose.animation.AnimatedVisibilityKt;
import androidx.compose.animation.AnimationModifierKt;
import androidx.compose.animation.EnterExitTransitionKt;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.FlowRowScope;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.lazy.layout.LazyLayoutKt;
import androidx.compose.foundation.lazy.layout.LazyLayoutMeasurePolicy;
import androidx.compose.foundation.lazy.layout.LazyLayoutPrefetchState;
import androidx.compose.foundation.text.LegacyTextFieldState;
import androidx.compose.foundation.text.TextFieldCursorKt;
import androidx.compose.material3.IconKt;
import androidx.compose.material3.TextKt;
import androidx.compose.material3.TimePickerDefaults;
import androidx.compose.material3.TimePickerKt;
import androidx.compose.material3.TimePickerState;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.saveable.SaveableStateHolder;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.geometry.CornerRadius;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.geometry.RectKt;
import androidx.compose.ui.geometry.RoundRectKt;
import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.Path;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.layout.ContentScale;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.OnGloballyPositionedModifierKt;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.input.OffsetMapping;
import androidx.compose.ui.text.input.TextFieldValue;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.text.style.TextOverflow;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.profileinstaller.ProfileVerifier;
import app.chalo.compose.components.ChaloSpacersKt;
import app.chalo.compose.components.ChaloTextViewKt;
import app.chalo.compose.components.PlotlineComposeWidgetKt;
import app.chalo.compose.components.SpecialFeatureTagListComposableKt;
import app.chalo.compose.components.TwoTextInRowSpaceSeparatedKt;
import app.chalo.compose.components.buttons.ChaloFilledButtonKt;
import app.chalo.compose.components.divider.TicketPunchDividerKt;
import app.chalo.compose.components.image.CommonImageKt;
import app.chalo.compose.components.text.TitleSubtitleViewKt;
import app.chalo.compose.components.textfields.ChaloExpandingTextKt;
import app.chalo.compose.resources.PainterResourceHelperKt;
import app.chalo.compose.resources.StringResourcesHelperKt;
import app.chalo.compose.theme.ChaloPadding;
import app.chalo.compose.theme.ChaloTheme;
import app.chalo.compose.theme.ChaloThemeKt;
import app.chalo.compose.theme.ChaloTypographyKt;
import app.chalo.compose.theme.UIShape;
import app.chalo.home.ui.common.PremiumBusUpcomingBottomSheetLayoutKt;
import app.chalo.home.ui.common.TitoRideDetailsBottomSheetLayoutKt;
import app.chalo.home.ui.history.compose.components.ChaloBusTicketViewKt;
import app.chalo.home.ui.history.compose.components.RegularBusActiveTicketViewKt;
import app.chalo.home.ui.history.uistate.chalobusticket.BusTicketStatusSpec;
import app.chalo.home.ui.history.uistate.chalobusticket.BusTicketStatusUiState;
import app.chalo.home.ui.history.uistate.chalobusticket.ChaloBusTicketContainerUiState;
import app.chalo.home.ui.history.uistate.chalobusticket.ChaloBusTicketSpec;
import app.chalo.home.ui.history.uistate.chalobusticket.ChaloBusTicketUiState;
import app.chalo.home.ui.history.uistate.chalobusticket.ProductFooterContainerUiState;
import app.chalo.home.ui.history.uistate.regularbusticket.ProductBannerUiState;
import app.chalo.home.ui.history.uistate.regularbusticket.RegularBusTicketFooterContainerUiState;
import app.chalo.home.ui.history.uistate.regularbusticket.RegularBusTicketSpec;
import app.chalo.home.ui.history.uistate.regularbusticket.RegularBusTicketUiState;
import app.chalo.instantticket.ui.faredetails.contract.FareDetailsViewState;
import app.chalo.instantticket.ui.instantticketscreen.InstantTicketWalletAccessState;
import app.chalo.instantticket.ui.instantticketscreen.WalletSubTextProperties;
import app.chalo.instantticket.ui.instantticketscreen.compose.PaymentBottomSheetComposableKt;
import app.chalo.livetracking.routedetails.ui.routedetailsscreen.compose.RouteDetailsAnchoredAdLayout;
import app.chalo.livetracking.routedetails.ui.routedetailsscreen.compose.RouteDetailsStopListKt;
import app.chalo.livetracking.ui.routedetailsscreen.RouteDetailsViewTypeUIState;
import app.chalo.livetracking.ui.routedetailsscreen.uistatefactory.RouteDetailsBottomSheetContentUIState;
import app.chalo.models.validation.ValidationProduct;
import app.chalo.ncmc.ui.landing.compose.ChaloCardComposablesKt;
import app.chalo.ncmc.ui.transactionhistory.CardTransactionTypeUiModel;
import app.chalo.premiumbus.bulkbookingridedetails.ui.PbBulkBookingRideDetailsScreenKt;
import app.chalo.premiumbus.bulkbookingridedetails.ui.PremiumBusBulkBookingUpcomingRidesCardData;
import app.chalo.premiumbus.data.models.app.PBStopPlaceSelectedAppModel;
import app.chalo.premiumbus.prebookedtickets.ui.newactivation.NewPremiumReserveTicketDetailsScreenType;
import app.chalo.premiumbus.prebookedtickets.ui.newactivation.ticketinfohandler.PremiumBusBookingCardData;
import app.chalo.premiumbus.prebookedtickets.ui.newactivation.ticketinfohandler.PremiumBusPostBookingStopSchedule;
import app.chalo.premiumbus.ui.productselection.compose.uistate.PBProductCardComposableKt;
import app.chalo.premiumbus.ui.productselection.compose.uistate.PBProductCardUiState;
import app.chalo.premiumbus.ui.productselection.compose.uistate.PbProductCardUISpecs;
import app.chalo.premiumbus.ui.productselection.compose.uistate.PbProductItemCardPlanHighlightUIState;
import app.chalo.premiumbus.ui.productselection.compose.uistate.PremiumBusProductSelectionSpecs;
import app.chalo.premiumbus.ui.productselection.compose.uistate.ProductLabelUiState;
import app.chalo.premiumbus.ui.seatselection.compose.uistate.BookingInfoBannerUIState;
import app.chalo.premiumbus.ui.seatselection.compose.uistate.PremiumBusSeatSelectionUISpecs;
import app.chalo.premiumbus.ui.seatselection.compose.uistate.PremiumBusSeatSelectionViewState;
import app.chalo.premiumbus.ui.slotselection.OfferTagUIState;
import app.chalo.premiumbus.ui.slotselection.PremiumBusSlotSelectionDateAndTimePickerUIState;
import app.chalo.premiumbus.ui.slotselection.PremiumBusSlotSelectionUiStateKt;
import app.chalo.premiumbus.ui.stopselection.PBStopSelectionScreenBottomSheetType;
import app.chalo.premiumbus.ui.stopselection.PremiumBusStopSelectionViewState;
import app.chalo.premiumbus.ui.stopselection.compose.PremiumBusStopSelectionScreenKt;
import app.chalo.productactivation.ui.ActivationPassComposablesKt;
import app.chalo.productactivation.ui.ActivationTicketComposablesKt;
import app.chalo.productactivation.ui.uistate.ActivationPassContainerUIState;
import app.chalo.productactivation.ui.uistate.ActivationPassFooterUIState;
import app.chalo.productactivation.ui.uistate.ActivationPassUIState;
import app.chalo.productactivation.ui.uistate.ActivationTicketFooterUIState;
import app.chalo.productactivation.ui.uistate.ActivationTicketUIState;
import app.chalo.providers.iconassetprovider.IconType;
import app.chalo.providers.stringprovider.StringEnum;
import app.chalo.titoridedetail.data.app.TitoRideDataAppModel;
import app.chalo.uistate.base.BorderUISpec;
import app.chalo.uistate.base.ChaloColorTokenKt;
import app.chalo.uistate.button.ButtonUIState;
import app.chalo.uistate.components.RegularBusTicketContainerUiState;
import app.chalo.uistate.components.RegularBusTicketDetailsContainerKt;
import app.chalo.uistate.divider.DividerUIState;
import app.chalo.uistate.divider.DividerUIStateKt;
import app.chalo.uistate.image.ImageUIState;
import app.chalo.uistate.image.ImageUIStateKt;
import app.chalo.uistate.image.ImageUrlUIState;
import app.chalo.uistate.text.TextUIState;
import app.chalo.utils.timeutil.TimeUtilsContract;
import app.chalo.validationsdk.vehiclebasedvalidation.ui.RegularBusTicketCtaUiState;
import app.chalo.validationsdk.vehiclebasedvalidation.ui.TicketCardContentSpec;
import app.chalo.validationsdk.vehiclebasedvalidation.ui.TicketCardUIState;
import coil3.compose.SingletonSubcomposeAsyncImageKt;
import coil3.size.Dimension;
import coil3.size.Size;
import java.util.List;
import java.util.Locale;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import org.bouncycastle.asn1.cmc.BodyPartID;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class c0 implements Function3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f11240a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ c0(RouteDetailsViewTypeUIState.MainScreen mainScreen, State state, MutableState mutableState, State state2) {
        this.f11240a = 17;
        this.d = mainScreen;
        this.e = state;
        this.c = mutableState;
        this.b = state2;
    }

    private final Object a(Object obj, Object obj2, Object obj3) {
        TicketCardContentSpec ticketCardContentSpec = (TicketCardContentSpec) this.d;
        TicketCardUIState ticketCardUIState = (TicketCardUIState) this.e;
        Density density = (Density) this.b;
        MutableState mutableState = (MutableState) this.c;
        ColumnScope ChaloRoundedCard = (ColumnScope) obj;
        Composer composer = (Composer) obj2;
        int iIntValue = ((Integer) obj3).intValue();
        Intrinsics.i(ChaloRoundedCard, "$this$ChaloRoundedCard");
        if (composer.shouldExecute((iIntValue & 17) != 16, iIntValue & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1707017973, iIntValue, -1, "app.chalo.validationsdk.vehiclebasedvalidation.ui.compose.TicketCardUi.<anonymous> (DirectValidationMainScreenUI.kt:299)");
            }
            Modifier.Companion companion = Modifier.INSTANCE;
            ChaloPadding chaloPadding = ticketCardContentSpec.f10737a;
            float f = ticketCardContentSpec.b;
            Modifier modifierAnimateContentSize$default = AnimationModifierKt.animateContentSize$default(SizeKt.fillMaxWidth$default(ChaloThemeKt.c(companion, chaloPadding), 0.0f, 1, null), null, null, 3, null);
            Arrangement arrangement = Arrangement.INSTANCE;
            Arrangement.Vertical top = arrangement.getTop();
            Alignment.Companion companion2 = Alignment.INSTANCE;
            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(top, companion2.getStart(), composer, 0);
            long currentCompositeKeyHashCode = ComposablesKt.getCurrentCompositeKeyHashCode(composer, 0);
            int i = (int) (currentCompositeKeyHashCode ^ (currentCompositeKeyHashCode >>> 32));
            CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composer, modifierAnimateContentSize$default);
            ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor = companion3.getConstructor();
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
            pk0.v(companion3, composerM3915constructorimpl, measurePolicyColumnMeasurePolicy, composerM3915constructorimpl, currentCompositionLocalMap);
            Updater.m3923setimpl(composerM3915constructorimpl, modifierMaterializeModifier, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion3, composerM3915constructorimpl, Integer.valueOf(i), composerM3915constructorimpl));
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
            RegularBusTicketContainerUiState regularBusTicketContainerUiState = ticketCardUIState.c;
            if (regularBusTicketContainerUiState == null) {
                composer.startReplaceGroup(705251985);
            } else {
                composer.startReplaceGroup(705251986);
                RegularBusTicketDetailsContainerKt.b(AnimationModifierKt.animateContentSize$default(companion, null, null, 3, null), regularBusTicketContainerUiState, composer, 64);
            }
            composer.endReplaceGroup();
            RegularBusTicketCtaUiState regularBusTicketCtaUiState = ticketCardUIState.d;
            composer.startReplaceGroup(705616484);
            ChaloSpacersKt.b(f, composer, 0);
            TicketPunchDividerKt.a(PaddingKt.m786paddingVpY3zN4$default(companion, 0.0f, f, 1, null), null, 0.0f, 0.0f, composer, 0, 14);
            ChaloSpacersKt.b(f, composer, 0);
            Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null);
            boolean zChanged = composer.changed(density);
            Object objRememberedValue = composer.rememberedValue();
            if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new f0(mutableState, density, 11);
                composer.updateRememberedValue(objRememberedValue);
            }
            Modifier modifierOnGloballyPositioned = OnGloballyPositionedModifierKt.onGloballyPositioned(modifierFillMaxWidth$default, (Function1) objRememberedValue);
            MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(arrangement.getStart(), companion2.getCenterVertically(), composer, 48);
            long currentCompositeKeyHashCode2 = ComposablesKt.getCurrentCompositeKeyHashCode(composer, 0);
            int i2 = (int) (currentCompositeKeyHashCode2 ^ (currentCompositeKeyHashCode2 >>> 32));
            CompositionLocalMap currentCompositionLocalMap2 = composer.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(composer, modifierOnGloballyPositioned);
            Function0<ComposeUiNode> constructor2 = companion3.getConstructor();
            if (composer.getApplier() == null) {
                ComposablesKt.invalidApplier();
            }
            composer.startReusableNode();
            if (composer.getInserting()) {
                composer.createNode(constructor2);
            } else {
                composer.useNode();
            }
            Composer composerM3915constructorimpl2 = Updater.m3915constructorimpl(composer);
            pk0.v(companion3, composerM3915constructorimpl2, measurePolicyRowMeasurePolicy, composerM3915constructorimpl2, currentCompositionLocalMap2);
            Updater.m3923setimpl(composerM3915constructorimpl2, modifierMaterializeModifier2, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion3, composerM3915constructorimpl2, Integer.valueOf(i2), composerM3915constructorimpl2));
            RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
            TextUIState.ChaloTextUIState chaloTextUIState = regularBusTicketCtaUiState.b;
            ImageUIState imageUIState = regularBusTicketCtaUiState.c;
            boolean zChangedInstance = composer.changedInstance(regularBusTicketCtaUiState);
            Object objRememberedValue2 = composer.rememberedValue();
            if (zChangedInstance || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue2 = new xx(regularBusTicketCtaUiState, 4);
                composer.updateRememberedValue(objRememberedValue2);
            }
            ChaloFilledButtonKt.i(companion, chaloTextUIState, imageUIState, (Function0) objRememberedValue2, composer, 6, 0);
            composer.endNode();
            composer.endReplaceGroup();
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
        float f;
        ImageUrlUIState imageUrlUIState;
        PbProductItemCardPlanHighlightUIState pbProductItemCardPlanHighlightUIState;
        Modifier modifier;
        PbProductCardUISpecs pbProductCardUISpecs;
        int i;
        int i2;
        PBProductCardUiState pBProductCardUiState = (PBProductCardUiState) this.d;
        Size size = (Size) this.e;
        PremiumBusProductSelectionSpecs premiumBusProductSelectionSpecs = (PremiumBusProductSelectionSpecs) this.b;
        Function2 function2 = (Function2) this.c;
        ColumnScope ChaloRoundedCard = (ColumnScope) obj;
        Composer composer = (Composer) obj2;
        int iIntValue = ((Integer) obj3).intValue();
        Intrinsics.i(ChaloRoundedCard, "$this$ChaloRoundedCard");
        if (composer.shouldExecute((iIntValue & 17) != 16, iIntValue & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1245042741, iIntValue, -1, "app.chalo.premiumbus.ui.productselection.compose.uistate.PBProductCardComposable.<anonymous> (PBProductCardComposable.kt:105)");
            }
            Modifier.Companion companion = Modifier.INSTANCE;
            Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null);
            Alignment.Companion companion2 = Alignment.INSTANCE;
            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(companion2.getTopEnd(), false);
            long currentCompositeKeyHashCode = ComposablesKt.getCurrentCompositeKeyHashCode(composer, 0);
            int i3 = (int) (currentCompositeKeyHashCode ^ (currentCompositeKeyHashCode >>> 32));
            CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composer, modifierFillMaxWidth$default);
            ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor = companion3.getConstructor();
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
            pk0.v(companion3, composerM3915constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy, composerM3915constructorimpl, currentCompositionLocalMap);
            Updater.m3923setimpl(composerM3915constructorimpl, modifierMaterializeModifier, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion3, composerM3915constructorimpl, Integer.valueOf(i3), composerM3915constructorimpl));
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            Modifier modifierFillMaxWidth$default2 = SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null);
            Arrangement arrangement = Arrangement.INSTANCE;
            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(arrangement.getTop(), companion2.getStart(), composer, 0);
            long currentCompositeKeyHashCode2 = ComposablesKt.getCurrentCompositeKeyHashCode(composer, 0);
            int i4 = (int) (currentCompositeKeyHashCode2 ^ (currentCompositeKeyHashCode2 >>> 32));
            CompositionLocalMap currentCompositionLocalMap2 = composer.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(composer, modifierFillMaxWidth$default2);
            Function0<ComposeUiNode> constructor2 = companion3.getConstructor();
            if (composer.getApplier() == null) {
                ComposablesKt.invalidApplier();
            }
            composer.startReusableNode();
            if (composer.getInserting()) {
                composer.createNode(constructor2);
            } else {
                composer.useNode();
            }
            Composer composerM3915constructorimpl2 = Updater.m3915constructorimpl(composer);
            pk0.v(companion3, composerM3915constructorimpl2, measurePolicyColumnMeasurePolicy, composerM3915constructorimpl2, currentCompositionLocalMap2);
            Updater.m3923setimpl(composerM3915constructorimpl2, modifierMaterializeModifier2, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion3, composerM3915constructorimpl2, Integer.valueOf(i4), composerM3915constructorimpl2));
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
            ImageUrlUIState imageUrlUIState2 = pBProductCardUiState.b;
            PbProductItemCardPlanHighlightUIState pbProductItemCardPlanHighlightUIState2 = pBProductCardUiState.g;
            DividerUIState dividerUIState = pBProductCardUiState.e;
            PbProductCardUISpecs pbProductCardUISpecs2 = pBProductCardUiState.f7703a;
            if (imageUrlUIState2 != null) {
                composer.startReplaceGroup(1504818292);
                Density density = (Density) composer.consume(CompositionLocalsKt.getLocalDensity());
                String str = imageUrlUIState2.f10037a;
                Modifier modifierFillMaxWidth$default3 = SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null);
                if (size != null) {
                    Dimension dimension = size.f11604a;
                    int i5 = dimension instanceof Dimension.Pixels ? ((Dimension.Pixels) dimension).f11600a : -1;
                    Dimension dimension2 = size.b;
                    int i6 = dimension2 instanceof Dimension.Pixels ? ((Dimension.Pixels) dimension2).f11600a : -1;
                    if (i5 != -1 && i6 != -1) {
                        modifierFillMaxWidth$default3 = SizeKt.m830sizeVpY3zN4(modifierFillMaxWidth$default3, density.mo401toDpu2uoSUM(i5), density.mo401toDpu2uoSUM(i6));
                    }
                }
                imageUrlUIState = imageUrlUIState2;
                pbProductCardUISpecs = pbProductCardUISpecs2;
                i = 1;
                modifier = null;
                pbProductItemCardPlanHighlightUIState = pbProductItemCardPlanHighlightUIState2;
                f = 0.0f;
                SingletonSubcomposeAsyncImageKt.a(str, null, modifierFillMaxWidth$default3, ComposableLambdaKt.rememberComposableLambda(1434478761, true, new rb(5, premiumBusProductSelectionSpecs, pBProductCardUiState), composer, 54), ComposableLambdaKt.rememberComposableLambda(1317137411, true, new rb(6, pBProductCardUiState, function2), composer, 54), ComposableLambdaKt.rememberComposableLambda(1581758815, true, new o4(pBProductCardUiState, 7), composer, 54), null, null, null, ImageUIStateKt.c(imageUrlUIState2.d), composer, 1794096, 0, 63368);
                composer = composer;
                composer.endReplaceGroup();
                i2 = 0;
            } else {
                f = 0.0f;
                imageUrlUIState = imageUrlUIState2;
                pbProductItemCardPlanHighlightUIState = pbProductItemCardPlanHighlightUIState2;
                modifier = null;
                pbProductCardUISpecs = pbProductCardUISpecs2;
                i = 1;
                composer.startReplaceGroup(1508377774);
                i2 = 0;
                TitleSubtitleViewKt.a(PaddingKt.m784padding3ABfNKs(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), pbProductCardUISpecs.h), pBProductCardUiState.d, composer, 0, 0);
                composer.endReplaceGroup();
            }
            if (dividerUIState != 0) {
                composer.startReplaceGroup(1508797886);
                if (imageUrlUIState != null) {
                    composer.startReplaceGroup(1508868721);
                    ChaloSpacersKt.o(composer, i2);
                } else {
                    composer.startReplaceGroup(1499964219);
                }
                composer.endReplaceGroup();
                DividerUIStateKt.a(PaddingKt.m786paddingVpY3zN4$default(companion, pbProductCardUISpecs.h, f, 2, modifier), dividerUIState, composer, i2, i2);
                ChaloSpacersKt.o(composer, i2);
            } else {
                composer.startReplaceGroup(1499964219);
            }
            composer.endReplaceGroup();
            PbProductItemCardPlanHighlightUIState pbProductItemCardPlanHighlightUIState3 = pbProductItemCardPlanHighlightUIState;
            if (pbProductItemCardPlanHighlightUIState3.f7705a == null && pbProductItemCardPlanHighlightUIState3.c == null) {
                composer.startReplaceGroup(1499964219);
            } else {
                composer.startReplaceGroup(1509484288);
                Modifier modifierM786paddingVpY3zN4$default = PaddingKt.m786paddingVpY3zN4$default(SizeKt.fillMaxWidth$default(companion, f, i, modifier), pbProductCardUISpecs.h, f, 2, modifier);
                MeasurePolicy measurePolicyColumnMeasurePolicy2 = ColumnKt.columnMeasurePolicy(arrangement.getTop(), companion2.getStart(), composer, i2);
                long currentCompositeKeyHashCode3 = ComposablesKt.getCurrentCompositeKeyHashCode(composer, i2);
                int i7 = (int) (currentCompositeKeyHashCode3 ^ (currentCompositeKeyHashCode3 >>> 32));
                CompositionLocalMap currentCompositionLocalMap3 = composer.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier3 = ComposedModifierKt.materializeModifier(composer, modifierM786paddingVpY3zN4$default);
                Function0<ComposeUiNode> constructor3 = companion3.getConstructor();
                if (composer.getApplier() == null) {
                    ComposablesKt.invalidApplier();
                }
                composer.startReusableNode();
                if (composer.getInserting()) {
                    composer.createNode(constructor3);
                } else {
                    composer.useNode();
                }
                Composer composerM3915constructorimpl3 = Updater.m3915constructorimpl(composer);
                pk0.v(companion3, composerM3915constructorimpl3, measurePolicyColumnMeasurePolicy2, composerM3915constructorimpl3, currentCompositionLocalMap3);
                Updater.m3923setimpl(composerM3915constructorimpl3, modifierMaterializeModifier3, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion3, composerM3915constructorimpl3, Integer.valueOf(i7), composerM3915constructorimpl3));
                TextUIState.ChaloTextUIState chaloTextUIState = pbProductItemCardPlanHighlightUIState3.b;
                TextUIState.StyledTextUIState styledTextUIState = pbProductItemCardPlanHighlightUIState3.c;
                ButtonUIState buttonUIState = pbProductItemCardPlanHighlightUIState3.f7705a;
                TextUIState.ChaloTextUIState chaloTextUIState2 = pbProductItemCardPlanHighlightUIState3.d;
                BorderUISpec borderUISpec = pbProductItemCardPlanHighlightUIState3.e;
                OfferTagUIState offerTagUIState = pBProductCardUiState.h;
                UIShape.Rectangle rectangle = UIShape.f1926a;
                PBProductCardComposableKt.e(buttonUIState, chaloTextUIState, styledTextUIState, chaloTextUIState2, borderUISpec, offerTagUIState, composer, 0);
                ChaloSpacersKt.o(composer, i2);
                composer.endNode();
            }
            composer.endReplaceGroup();
            composer.endNode();
            ProductLabelUiState productLabelUiState = pBProductCardUiState.c;
            if (productLabelUiState == null) {
                composer.startReplaceGroup(1489357093);
            } else {
                composer.startReplaceGroup(1489357094);
                PBProductCardComposableKt.a(modifier, productLabelUiState, composer, i2);
            }
            composer.endReplaceGroup();
            composer.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return Unit.f17538a;
    }

    private final Object d(Object obj, Object obj2, Object obj3) {
        PremiumBusBulkBookingUpcomingRidesCardData premiumBusBulkBookingUpcomingRidesCardData = (PremiumBusBulkBookingUpcomingRidesCardData) this.d;
        IconType iconType = (IconType) this.e;
        String str = (String) this.b;
        String str2 = (String) this.c;
        ColumnScope Card = (ColumnScope) obj;
        Composer composer = (Composer) obj2;
        int iIntValue = ((Integer) obj3).intValue();
        Intrinsics.i(Card, "$this$Card");
        if (composer.shouldExecute((iIntValue & 17) != 16, iIntValue & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(556881213, iIntValue, -1, "app.chalo.premiumbus.bulkbookingridedetails.ui.PremiumBusBookingUnderProgressOrFailedCard.<anonymous> (PbBulkBookingRideDetailsScreen.kt:943)");
            }
            Modifier.Companion companion = Modifier.INSTANCE;
            Modifier modifierM784padding3ABfNKs = PaddingKt.m784padding3ABfNKs(AnimationModifierKt.animateContentSize$default(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), null, null, 3, null), ChaloTheme.b(composer, 0).h);
            Arrangement arrangement = Arrangement.INSTANCE;
            Arrangement.Vertical top = arrangement.getTop();
            Alignment.Companion companion2 = Alignment.INSTANCE;
            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(top, companion2.getStart(), composer, 0);
            long currentCompositeKeyHashCode = ComposablesKt.getCurrentCompositeKeyHashCode(composer, 0);
            int i = (int) (currentCompositeKeyHashCode ^ (currentCompositeKeyHashCode >>> 32));
            CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composer, modifierM784padding3ABfNKs);
            ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor = companion3.getConstructor();
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
            pk0.v(companion3, composerM3915constructorimpl, measurePolicyColumnMeasurePolicy, composerM3915constructorimpl, currentCompositionLocalMap);
            Updater.m3923setimpl(composerM3915constructorimpl, modifierMaterializeModifier, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion3, composerM3915constructorimpl, Integer.valueOf(i), composerM3915constructorimpl));
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
            Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null);
            MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(arrangement.getStart(), companion2.getCenterVertically(), composer, 48);
            long currentCompositeKeyHashCode2 = ComposablesKt.getCurrentCompositeKeyHashCode(composer, 0);
            int i2 = (int) (currentCompositeKeyHashCode2 ^ (currentCompositeKeyHashCode2 >>> 32));
            CompositionLocalMap currentCompositionLocalMap2 = composer.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(composer, modifierFillMaxWidth$default);
            Function0<ComposeUiNode> constructor2 = companion3.getConstructor();
            if (composer.getApplier() == null) {
                ComposablesKt.invalidApplier();
            }
            composer.startReusableNode();
            if (composer.getInserting()) {
                composer.createNode(constructor2);
            } else {
                composer.useNode();
            }
            Composer composerM3915constructorimpl2 = Updater.m3915constructorimpl(composer);
            pk0.v(companion3, composerM3915constructorimpl2, measurePolicyRowMeasurePolicy, composerM3915constructorimpl2, currentCompositionLocalMap2);
            Updater.m3923setimpl(composerM3915constructorimpl2, modifierMaterializeModifier2, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion3, composerM3915constructorimpl2, Integer.valueOf(i2), composerM3915constructorimpl2));
            RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
            ImageKt.Image(PainterResourceHelperKt.a(iconType, composer, 0), "", SizeKt.m828size3ABfNKs(companion, ChaloTheme.b(composer, 0).h), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composer, Painter.$stable | 48, 120);
            ChaloSpacersKt.w(composer, 0);
            MeasurePolicy measurePolicyColumnMeasurePolicy2 = ColumnKt.columnMeasurePolicy(arrangement.getTop(), companion2.getStart(), composer, 0);
            long currentCompositeKeyHashCode3 = ComposablesKt.getCurrentCompositeKeyHashCode(composer, 0);
            int i3 = (int) (currentCompositeKeyHashCode3 ^ (currentCompositeKeyHashCode3 >>> 32));
            CompositionLocalMap currentCompositionLocalMap3 = composer.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier3 = ComposedModifierKt.materializeModifier(composer, companion);
            Function0<ComposeUiNode> constructor3 = companion3.getConstructor();
            if (composer.getApplier() == null) {
                ComposablesKt.invalidApplier();
            }
            composer.startReusableNode();
            if (composer.getInserting()) {
                composer.createNode(constructor3);
            } else {
                composer.useNode();
            }
            Composer composerM3915constructorimpl3 = Updater.m3915constructorimpl(composer);
            pk0.v(companion3, composerM3915constructorimpl3, measurePolicyColumnMeasurePolicy2, composerM3915constructorimpl3, currentCompositionLocalMap3);
            Updater.m3923setimpl(composerM3915constructorimpl3, modifierMaterializeModifier3, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion3, composerM3915constructorimpl3, Integer.valueOf(i3), composerM3915constructorimpl3));
            TextKt.m2623TextNvy7gAk(str, null, 0L, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ChaloTypographyKt.a(ChaloTheme.e(composer, 0).getHeadlineSmall()), composer, 0, 0, 131070);
            TextKt.m2623TextNvy7gAk(str2, null, 0L, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ChaloTheme.e(composer, 0).getBodySmall(), composer, 0, 0, 131070);
            composer.endNode();
            composer.endNode();
            ChaloSpacersKt.o(composer, 0);
            PbBulkBookingRideDetailsScreenKt.l(premiumBusBulkBookingUpcomingRidesCardData, composer, 0);
            composer.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return Unit.f17538a;
    }

    private final Object e(Object obj, Object obj2, Object obj3) {
        Modifier.Companion companion;
        PremiumBusSeatSelectionViewState premiumBusSeatSelectionViewState = (PremiumBusSeatSelectionViewState) this.d;
        PremiumBusSeatSelectionUISpecs premiumBusSeatSelectionUISpecs = (PremiumBusSeatSelectionUISpecs) this.e;
        BookingInfoBannerUIState bookingInfoBannerUIState = (BookingInfoBannerUIState) this.b;
        ButtonUIState buttonUIState = (ButtonUIState) this.c;
        ColumnScope Card = (ColumnScope) obj;
        Composer composer = (Composer) obj2;
        int iIntValue = ((Integer) obj3).intValue();
        Intrinsics.i(Card, "$this$Card");
        if (composer.shouldExecute((iIntValue & 17) != 16, iIntValue & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1963722794, iIntValue, -1, "app.chalo.premiumbus.ui.seatselection.compose.SeatSelectionMainScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (PremiumBusSeatSelectionMainScreen.kt:242)");
            }
            Modifier.Companion companion2 = Modifier.INSTANCE;
            Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(companion2, 0.0f, 1, null);
            Arrangement arrangement = Arrangement.INSTANCE;
            Arrangement.Vertical top = arrangement.getTop();
            Alignment.Companion companion3 = Alignment.INSTANCE;
            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(top, companion3.getStart(), composer, 0);
            long currentCompositeKeyHashCode = ComposablesKt.getCurrentCompositeKeyHashCode(composer, 0);
            int i = (int) (currentCompositeKeyHashCode ^ (currentCompositeKeyHashCode >>> 32));
            CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composer, modifierFillMaxWidth$default);
            ComposeUiNode.Companion companion4 = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor = companion4.getConstructor();
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
            pk0.v(companion4, composerM3915constructorimpl, measurePolicyColumnMeasurePolicy, composerM3915constructorimpl, currentCompositionLocalMap);
            Updater.m3923setimpl(composerM3915constructorimpl, modifierMaterializeModifier, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion4, composerM3915constructorimpl, Integer.valueOf(i), composerM3915constructorimpl));
            AnimatedVisibilityKt.AnimatedVisibility(ColumnScopeInstance.INSTANCE, premiumBusSeatSelectionViewState.g != null, (Modifier) null, EnterExitTransitionKt.fadeIn$default(AnimationSpecKt.tween$default(280, 0, null, 6, null), 0.0f, 2, null).plus(EnterExitTransitionKt.expandVertically$default(AnimationSpecKt.tween$default(280, 0, null, 6, null), null, false, null, 14, null)), EnterExitTransitionKt.fadeOut$default(AnimationSpecKt.tween$default(280, 0, null, 6, null), 0.0f, 2, null).plus(EnterExitTransitionKt.shrinkVertically$default(AnimationSpecKt.tween$default(280, 0, null, 6, null), null, false, null, 14, null)), (String) null, ComposableLambdaKt.rememberComposableLambda(-1141138788, true, new la0(bookingInfoBannerUIState, 21), composer, 54), composer, 1600518, 18);
            Modifier modifierC = ChaloThemeKt.c(SizeKt.fillMaxWidth$default(companion2, 0.0f, 1, null), premiumBusSeatSelectionUISpecs.f);
            MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(arrangement.getStart(), companion3.getCenterVertically(), composer, 48);
            long currentCompositeKeyHashCode2 = ComposablesKt.getCurrentCompositeKeyHashCode(composer, 0);
            int i2 = (int) (currentCompositeKeyHashCode2 ^ (currentCompositeKeyHashCode2 >>> 32));
            CompositionLocalMap currentCompositionLocalMap2 = composer.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(composer, modifierC);
            Function0<ComposeUiNode> constructor2 = companion4.getConstructor();
            if (composer.getApplier() == null) {
                ComposablesKt.invalidApplier();
            }
            composer.startReusableNode();
            if (composer.getInserting()) {
                composer.createNode(constructor2);
            } else {
                composer.useNode();
            }
            Composer composerM3915constructorimpl2 = Updater.m3915constructorimpl(composer);
            pk0.v(companion4, composerM3915constructorimpl2, measurePolicyRowMeasurePolicy, composerM3915constructorimpl2, currentCompositionLocalMap2);
            Updater.m3923setimpl(composerM3915constructorimpl2, modifierMaterializeModifier2, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion4, composerM3915constructorimpl2, Integer.valueOf(i2), composerM3915constructorimpl2));
            RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
            TextUIState.ChaloTextUIState chaloTextUIState = premiumBusSeatSelectionViewState.e;
            if (chaloTextUIState == null) {
                composer.startReplaceGroup(-442368678);
                composer.endReplaceGroup();
                companion = companion2;
            } else {
                composer.startReplaceGroup(-442368677);
                companion = companion2;
                ChaloTextViewKt.a(i41.a(rowScopeInstance, companion, 1.0f, false, 2, null), chaloTextUIState, null, null, composer, 0, 12);
                composer.endReplaceGroup();
            }
            ChaloSpacersKt.z(composer, 0);
            ChaloFilledButtonKt.a(0, 0, composer, SizeKt.m814height3ABfNKs(i41.a(rowScopeInstance, companion, 3.0f, false, 2, null), premiumBusSeatSelectionUISpecs.b), buttonUIState);
            composer.endNode();
            composer.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return Unit.f17538a;
    }

    private final Object f(Object obj, Object obj2, Object obj3) {
        PBStopSelectionScreenBottomSheetType pBStopSelectionScreenBottomSheetType = (PBStopSelectionScreenBottomSheetType) this.d;
        Function1 function1 = (Function1) this.e;
        PremiumBusStopSelectionViewState premiumBusStopSelectionViewState = (PremiumBusStopSelectionViewState) this.b;
        TimeUtilsContract timeUtilsContract = (TimeUtilsContract) this.c;
        ColumnScope ChaloRoundedBottomSheet = (ColumnScope) obj;
        Composer composer = (Composer) obj2;
        int iIntValue = ((Integer) obj3).intValue();
        Intrinsics.i(ChaloRoundedBottomSheet, "$this$ChaloRoundedBottomSheet");
        if (composer.shouldExecute((iIntValue & 17) != 16, iIntValue & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(400393326, iIntValue, -1, "app.chalo.premiumbus.ui.stopselection.compose.PremiumBusStopSelectionScreenBottomSheetHandler.<anonymous> (PremiumBusStopSelectionScreen.kt:134)");
            }
            if (Intrinsics.d(pBStopSelectionScreenBottomSheetType, PBStopSelectionScreenBottomSheetType.NoOriginDestinationPairsAvailable.f7959a)) {
                composer.startReplaceGroup(993549558);
                boolean zChanged = composer.changed(function1);
                Object objRememberedValue = composer.rememberedValue();
                if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = new ju0(function1, 28);
                    composer.updateRememberedValue(objRememberedValue);
                }
                Function0 function0 = (Function0) objRememberedValue;
                boolean zChanged2 = composer.changed(function1);
                Object objRememberedValue2 = composer.rememberedValue();
                if (zChanged2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue2 = new iw0(function1, 0);
                    composer.updateRememberedValue(objRememberedValue2);
                }
                PremiumBusStopSelectionScreenKt.f(function0, (Function0) objRememberedValue2, composer, 0);
                composer.endReplaceGroup();
            } else if (pBStopSelectionScreenBottomSheetType instanceof PBStopSelectionScreenBottomSheetType.NewRouteSuggestion) {
                composer.startReplaceGroup(994306950);
                PBStopSelectionScreenBottomSheetType.NewRouteSuggestion newRouteSuggestion = (PBStopSelectionScreenBottomSheetType.NewRouteSuggestion) pBStopSelectionScreenBottomSheetType;
                PBStopPlaceSelectedAppModel pBStopPlaceSelectedAppModel = newRouteSuggestion.f7957a;
                String str = pBStopPlaceSelectedAppModel != null ? pBStopPlaceSelectedAppModel.c : null;
                PBStopPlaceSelectedAppModel pBStopPlaceSelectedAppModel2 = newRouteSuggestion.b;
                String str2 = pBStopPlaceSelectedAppModel2 != null ? pBStopPlaceSelectedAppModel2.c : null;
                boolean zChanged3 = composer.changed(function1);
                Object objRememberedValue3 = composer.rememberedValue();
                if (zChanged3 || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue3 = new sn0(function1, 23);
                    composer.updateRememberedValue(objRememberedValue3);
                }
                Function1 function2 = (Function1) objRememberedValue3;
                boolean zChanged4 = composer.changed(function1) | composer.changed(pBStopSelectionScreenBottomSheetType);
                Object objRememberedValue4 = composer.rememberedValue();
                if (zChanged4 || objRememberedValue4 == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue4 = new fr0(13, function1, pBStopSelectionScreenBottomSheetType);
                    composer.updateRememberedValue(objRememberedValue4);
                }
                Function0 function3 = (Function0) objRememberedValue4;
                boolean zChanged5 = composer.changed(function1);
                Object objRememberedValue5 = composer.rememberedValue();
                if (zChanged5 || objRememberedValue5 == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue5 = new ju0(function1, 19);
                    composer.updateRememberedValue(objRememberedValue5);
                }
                Function0 function4 = (Function0) objRememberedValue5;
                boolean zChanged6 = composer.changed(function1);
                Object objRememberedValue6 = composer.rememberedValue();
                if (zChanged6 || objRememberedValue6 == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue6 = new ju0(function1, 20);
                    composer.updateRememberedValue(objRememberedValue6);
                }
                PremiumBusStopSelectionScreenKt.d(str, str2, function2, function3, function4, (Function0) objRememberedValue6, composer, 0);
                composer.endReplaceGroup();
            } else if (pBStopSelectionScreenBottomSheetType instanceof PBStopSelectionScreenBottomSheetType.NewRouteSuggestionSubmitSuccess) {
                composer.startReplaceGroup(996301645);
                boolean zChanged7 = composer.changed(function1);
                Object objRememberedValue7 = composer.rememberedValue();
                if (zChanged7 || objRememberedValue7 == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue7 = new ju0(function1, 21);
                    composer.updateRememberedValue(objRememberedValue7);
                }
                PremiumBusStopSelectionScreenKt.a((Function0) objRememberedValue7, composer, 0);
                composer.endReplaceGroup();
            } else if (pBStopSelectionScreenBottomSheetType instanceof PBStopSelectionScreenBottomSheetType.MultipleOriginDestinationSelection) {
                composer.startReplaceGroup(996759701);
                String str3 = premiumBusStopSelectionViewState.d;
                String str4 = premiumBusStopSelectionViewState.e;
                List list = ((PBStopSelectionScreenBottomSheetType.MultipleOriginDestinationSelection) premiumBusStopSelectionViewState.f).f7956a;
                boolean zChanged8 = composer.changed(function1);
                Object objRememberedValue8 = composer.rememberedValue();
                if (zChanged8 || objRememberedValue8 == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue8 = new sn0(function1, 19);
                    composer.updateRememberedValue(objRememberedValue8);
                }
                Function1 function5 = (Function1) objRememberedValue8;
                boolean zChanged9 = composer.changed(function1);
                Object objRememberedValue9 = composer.rememberedValue();
                if (zChanged9 || objRememberedValue9 == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue9 = new sn0(function1, 20);
                    composer.updateRememberedValue(objRememberedValue9);
                }
                Function1 function6 = (Function1) objRememberedValue9;
                boolean zChanged10 = composer.changed(function1);
                Object objRememberedValue10 = composer.rememberedValue();
                if (zChanged10 || objRememberedValue10 == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue10 = new sn0(function1, 21);
                    composer.updateRememberedValue(objRememberedValue10);
                }
                Function1 function7 = (Function1) objRememberedValue10;
                boolean zChanged11 = composer.changed(function1);
                Object objRememberedValue11 = composer.rememberedValue();
                if (zChanged11 || objRememberedValue11 == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue11 = new ju0(function1, 29);
                    composer.updateRememberedValue(objRememberedValue11);
                }
                PremiumBusStopSelectionScreenKt.m(str3, str4, timeUtilsContract, list, function5, function6, function7, (Function0) objRememberedValue11, composer, 0);
                composer.endReplaceGroup();
            } else if (Intrinsics.d(pBStopSelectionScreenBottomSheetType, PBStopSelectionScreenBottomSheetType.NoProductFoundBottomSheet.f7960a) || (pBStopSelectionScreenBottomSheetType instanceof PBStopSelectionScreenBottomSheetType.PremiumPassSavingsFaqsBottomSheet)) {
                composer.startReplaceGroup(998503048);
                gf.r(Modifier.INSTANCE, ChaloTheme.b(composer, 0).b, composer, 0);
            } else {
                if (!(pBStopSelectionScreenBottomSheetType instanceof PBStopSelectionScreenBottomSheetType.PremiumBusDateAndTimePickerBottomSheet)) {
                    throw pk0.p(composer, -1769063706);
                }
                composer.startReplaceGroup(998756411);
                PremiumBusSlotSelectionDateAndTimePickerUIState premiumBusSlotSelectionDateAndTimePickerUIState = ((PBStopSelectionScreenBottomSheetType.PremiumBusDateAndTimePickerBottomSheet) pBStopSelectionScreenBottomSheetType).f7961a;
                boolean zChanged12 = composer.changed(function1);
                Object objRememberedValue12 = composer.rememberedValue();
                if (zChanged12 || objRememberedValue12 == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue12 = new ab(function1, 8);
                    composer.updateRememberedValue(objRememberedValue12);
                }
                PremiumBusSlotSelectionUiStateKt.n(premiumBusSlotSelectionDateAndTimePickerUIState, null, (Function3) objRememberedValue12, composer, 48, 0);
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

    private final Object g(Object obj, Object obj2, Object obj3) {
        PremiumBusBookingCardData premiumBusBookingCardData = (PremiumBusBookingCardData) this.d;
        PremiumBusPostBookingStopSchedule premiumBusPostBookingStopSchedule = (PremiumBusPostBookingStopSchedule) this.e;
        NewPremiumReserveTicketDetailsScreenType newPremiumReserveTicketDetailsScreenType = (NewPremiumReserveTicketDetailsScreenType) this.b;
        Function1 function1 = (Function1) this.c;
        ColumnScope ChaloRoundedCard = (ColumnScope) obj;
        Composer composer = (Composer) obj2;
        int iIntValue = ((Integer) obj3).intValue();
        Intrinsics.i(ChaloRoundedCard, "$this$ChaloRoundedCard");
        if (composer.shouldExecute((iIntValue & 17) != 16, iIntValue & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(339917762, iIntValue, -1, "app.chalo.home.ui.common.PremiumBusBookingCardInfoComponent.<anonymous> (PremiumBusUpcomingBottomSheetLayout.kt:79)");
            }
            Modifier.Companion companion = Modifier.INSTANCE;
            Modifier modifierM784padding3ABfNKs = PaddingKt.m784padding3ABfNKs(SizeKt.fillMaxWidth$default(BackgroundKt.m264backgroundbw27NRU$default(companion, ChaloTheme.a(composer, 0).t, null, 2, null), 0.0f, 1, null), ChaloTheme.b(composer, 0).h);
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
            PremiumBusUpcomingBottomSheetLayoutKt.c(premiumBusBookingCardData, composer, 0);
            ChaloSpacersKt.o(composer, 0);
            PremiumBusUpcomingBottomSheetLayoutKt.d(premiumBusPostBookingStopSchedule, newPremiumReserveTicketDetailsScreenType, AnimationModifierKt.animateContentSize$default(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), null, null, 3, null), function1, premiumBusBookingCardData, composer, 0);
            composer.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return Unit.f17538a;
    }

    private final Object h(Object obj, Object obj2, Object obj3) {
        RegularBusTicketSpec regularBusTicketSpec = (RegularBusTicketSpec) this.d;
        RegularBusTicketUiState regularBusTicketUiState = (RegularBusTicketUiState) this.e;
        Density density = (Density) this.b;
        MutableState mutableState = (MutableState) this.c;
        ColumnScope ChaloRoundedCard = (ColumnScope) obj;
        Composer composer = (Composer) obj2;
        int iIntValue = ((Integer) obj3).intValue();
        Intrinsics.i(ChaloRoundedCard, "$this$ChaloRoundedCard");
        if (composer.shouldExecute((iIntValue & 17) != 16, iIntValue & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1701685655, iIntValue, -1, "app.chalo.home.ui.history.compose.components.RegularBusActiveTicket.<anonymous> (RegularBusActiveTicketView.kt:101)");
            }
            Modifier.Companion companion = Modifier.INSTANCE;
            ChaloPadding chaloPadding = regularBusTicketSpec.f3522a;
            float f = regularBusTicketSpec.e;
            Modifier modifierAnimateContentSize$default = AnimationModifierKt.animateContentSize$default(SizeKt.fillMaxWidth$default(PaddingKt.m787paddingqDBjuR0(companion, chaloPadding.b, chaloPadding.f1918a, chaloPadding.c, chaloPadding.d), 0.0f, 1, null), null, null, 3, null);
            Arrangement arrangement = Arrangement.INSTANCE;
            Arrangement.Vertical top = arrangement.getTop();
            Alignment.Companion companion2 = Alignment.INSTANCE;
            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(top, companion2.getStart(), composer, 0);
            long currentCompositeKeyHashCode = ComposablesKt.getCurrentCompositeKeyHashCode(composer, 0);
            int i = (int) (currentCompositeKeyHashCode ^ (currentCompositeKeyHashCode >>> 32));
            CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composer, modifierAnimateContentSize$default);
            ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor = companion3.getConstructor();
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
            pk0.v(companion3, composerM3915constructorimpl, measurePolicyColumnMeasurePolicy, composerM3915constructorimpl, currentCompositionLocalMap);
            Updater.m3923setimpl(composerM3915constructorimpl, modifierMaterializeModifier, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion3, composerM3915constructorimpl, Integer.valueOf(i), composerM3915constructorimpl));
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
            Alignment.Vertical centerVertically = companion2.getCenterVertically();
            Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null);
            MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(arrangement.getSpaceBetween(), centerVertically, composer, 54);
            long currentCompositeKeyHashCode2 = ComposablesKt.getCurrentCompositeKeyHashCode(composer, 0);
            int i2 = (int) (currentCompositeKeyHashCode2 ^ (currentCompositeKeyHashCode2 >>> 32));
            CompositionLocalMap currentCompositionLocalMap2 = composer.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(composer, modifierFillMaxWidth$default);
            Function0<ComposeUiNode> constructor2 = companion3.getConstructor();
            if (composer.getApplier() == null) {
                ComposablesKt.invalidApplier();
            }
            composer.startReusableNode();
            if (composer.getInserting()) {
                composer.createNode(constructor2);
            } else {
                composer.useNode();
            }
            Composer composerM3915constructorimpl2 = Updater.m3915constructorimpl(composer);
            pk0.v(companion3, composerM3915constructorimpl2, measurePolicyRowMeasurePolicy, composerM3915constructorimpl2, currentCompositionLocalMap2);
            Updater.m3923setimpl(composerM3915constructorimpl2, modifierMaterializeModifier2, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion3, composerM3915constructorimpl2, Integer.valueOf(i2), composerM3915constructorimpl2));
            Modifier modifierA = i41.a(RowScopeInstance.INSTANCE, companion, 1.0f, false, 2, null);
            TextUIState.ChaloTextUIState chaloTextUIState = regularBusTicketUiState.b;
            BusTicketStatusUiState busTicketStatusUiState = regularBusTicketUiState.c;
            ChaloTextViewKt.a(modifierA, chaloTextUIState, null, null, composer, 0, 12);
            if (busTicketStatusUiState == null) {
                composer.startReplaceGroup(-677084297);
            } else {
                Object obj4 = busTicketStatusUiState.f3495a;
                composer.startReplaceGroup(-677084296);
                boolean zChanged = composer.changed(obj4);
                Object objRememberedValue = composer.rememberedValue();
                if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    composer.updateRememberedValue(obj4);
                } else {
                    obj4 = objRememberedValue;
                }
                BusTicketStatusSpec busTicketStatusSpec = (BusTicketStatusSpec) obj4;
                Modifier modifierC = ChaloThemeKt.c(BackgroundKt.m263backgroundbw27NRU(companion, ChaloColorTokenKt.c(busTicketStatusSpec.c), ChaloThemeKt.d(busTicketStatusSpec.d)), busTicketStatusSpec.f3494a);
                MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(companion2.getCenter(), false);
                long currentCompositeKeyHashCode3 = ComposablesKt.getCurrentCompositeKeyHashCode(composer, 0);
                int i3 = (int) (currentCompositeKeyHashCode3 ^ (currentCompositeKeyHashCode3 >>> 32));
                CompositionLocalMap currentCompositionLocalMap3 = composer.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier3 = ComposedModifierKt.materializeModifier(composer, modifierC);
                Function0<ComposeUiNode> constructor3 = companion3.getConstructor();
                if (composer.getApplier() == null) {
                    ComposablesKt.invalidApplier();
                }
                composer.startReusableNode();
                if (composer.getInserting()) {
                    composer.createNode(constructor3);
                } else {
                    composer.useNode();
                }
                Composer composerM3915constructorimpl3 = Updater.m3915constructorimpl(composer);
                pk0.v(companion3, composerM3915constructorimpl3, measurePolicyMaybeCachedBoxMeasurePolicy, composerM3915constructorimpl3, currentCompositionLocalMap3);
                Updater.m3923setimpl(composerM3915constructorimpl3, modifierMaterializeModifier3, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion3, composerM3915constructorimpl3, Integer.valueOf(i3), composerM3915constructorimpl3));
                BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                MeasurePolicy measurePolicyRowMeasurePolicy2 = RowKt.rowMeasurePolicy(arrangement.getStart(), companion2.getCenterVertically(), composer, 48);
                long currentCompositeKeyHashCode4 = ComposablesKt.getCurrentCompositeKeyHashCode(composer, 0);
                int i4 = (int) (currentCompositeKeyHashCode4 ^ (currentCompositeKeyHashCode4 >>> 32));
                CompositionLocalMap currentCompositionLocalMap4 = composer.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier4 = ComposedModifierKt.materializeModifier(composer, companion);
                Function0<ComposeUiNode> constructor4 = companion3.getConstructor();
                if (composer.getApplier() == null) {
                    ComposablesKt.invalidApplier();
                }
                composer.startReusableNode();
                if (composer.getInserting()) {
                    composer.createNode(constructor4);
                } else {
                    composer.useNode();
                }
                Composer composerM3915constructorimpl4 = Updater.m3915constructorimpl(composer);
                pk0.v(companion3, composerM3915constructorimpl4, measurePolicyRowMeasurePolicy2, composerM3915constructorimpl4, currentCompositionLocalMap4);
                Updater.m3923setimpl(composerM3915constructorimpl4, modifierMaterializeModifier4, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion3, composerM3915constructorimpl4, Integer.valueOf(i4), composerM3915constructorimpl4));
                ImageUIState imageUIState = busTicketStatusUiState.c;
                if (imageUIState == null) {
                    composer.startReplaceGroup(-915195109);
                } else {
                    composer.startReplaceGroup(-915195108);
                    CommonImageKt.a(imageUIState, null, false, composer, 0, 6);
                    composer = composer;
                    ChaloSpacersKt.a(busTicketStatusSpec.b, composer, 0);
                }
                composer.endReplaceGroup();
                ChaloTextViewKt.a(null, busTicketStatusUiState.b, null, null, composer, 0, 13);
                composer.endNode();
                composer.endNode();
            }
            composer.endReplaceGroup();
            composer.endNode();
            List list = regularBusTicketUiState.d;
            if (list == null) {
                composer.startReplaceGroup(-231052373);
            } else {
                composer.startReplaceGroup(-231052372);
                ChaloSpacersKt.a(regularBusTicketSpec.b, composer, 0);
                composer.startReplaceGroup(408191873);
                int i5 = 0;
                for (Object obj5 : list) {
                    int i6 = i5 + 1;
                    if (i5 < 0) {
                        CollectionsKt.z0();
                        throw null;
                    }
                    UIShape.Rectangle rectangle = UIShape.f1926a;
                    ChaloBusTicketViewKt.f(null, (ProductBannerUiState) obj5, composer, 0);
                    if (i5 < CollectionsKt.K(list)) {
                        composer.startReplaceGroup(-1819172253);
                        ChaloSpacersKt.a(regularBusTicketSpec.f, composer, 0);
                    } else {
                        composer.startReplaceGroup(-1825979543);
                    }
                    composer.endReplaceGroup();
                    i5 = i6;
                }
                composer.endReplaceGroup();
            }
            composer.endReplaceGroup();
            ChaloSpacersKt.a(regularBusTicketSpec.d, composer, 0);
            Modifier.Companion companion4 = Modifier.INSTANCE;
            RegularBusTicketDetailsContainerKt.b(AnimationModifierKt.animateContentSize$default(companion4, null, null, 3, null), regularBusTicketUiState.e, composer, 64);
            RegularBusTicketFooterContainerUiState regularBusTicketFooterContainerUiState = regularBusTicketUiState.f;
            if (regularBusTicketFooterContainerUiState == null) {
                composer.startReplaceGroup(-230279357);
            } else {
                composer.startReplaceGroup(-230279356);
                ChaloSpacersKt.a(f, composer, 0);
                TicketPunchDividerKt.a(PaddingKt.m786paddingVpY3zN4$default(companion4, 0.0f, f, 1, null), null, 0.0f, 0.0f, composer, 0, 14);
                ChaloSpacersKt.a(f, composer, 0);
                Modifier modifierFillMaxWidth$default2 = SizeKt.fillMaxWidth$default(companion4, 0.0f, 1, null);
                boolean zChanged2 = composer.changed(density);
                Object objRememberedValue2 = composer.rememberedValue();
                if (zChanged2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue2 = new f0(mutableState, density, 26);
                    composer.updateRememberedValue(objRememberedValue2);
                }
                Modifier modifierOnGloballyPositioned = OnGloballyPositionedModifierKt.onGloballyPositioned(modifierFillMaxWidth$default2, (Function1) objRememberedValue2);
                UIShape.Rectangle rectangle2 = UIShape.f1926a;
                RegularBusActiveTicketViewKt.b(modifierOnGloballyPositioned, regularBusTicketFooterContainerUiState, composer, 0);
            }
            composer.endReplaceGroup();
            composer.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return Unit.f17538a;
    }

    private final Object i(Object obj, Object obj2, Object obj3) {
        RouteDetailsViewTypeUIState.MainScreen mainScreen = (RouteDetailsViewTypeUIState.MainScreen) this.d;
        State state = (State) this.e;
        MutableState mutableState = (MutableState) this.c;
        State state2 = (State) this.b;
        ColumnScope RouteDetailsStopListBottomSheet = (ColumnScope) obj;
        Composer composer = (Composer) obj2;
        int iIntValue = ((Integer) obj3).intValue();
        Intrinsics.i(RouteDetailsStopListBottomSheet, "$this$RouteDetailsStopListBottomSheet");
        if (composer.shouldExecute((iIntValue & 17) != 16, iIntValue & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1474325647, iIntValue, -1, "app.chalo.livetracking.routedetails.ui.routedetailsscreen.compose.screentype.RouteDetailsStopAndMapScreen.<anonymous>.<anonymous>.<anonymous> (RouteDetailsStopAndMapScreen.kt:160)");
            }
            RouteDetailsBottomSheetContentUIState routeDetailsBottomSheetContentUIState = mainScreen.b;
            float fM7292unboximpl = ((Dp) state.getValue()).m7292unboximpl();
            Object objRememberedValue = composer.rememberedValue();
            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new xq0(mutableState, 9);
                composer.updateRememberedValue(objRememberedValue);
            }
            RouteDetailsStopListKt.a(routeDetailsBottomSheetContentUIState, fM7292unboximpl, null, (Function1) objRememberedValue, Dp.m7278constructorimpl(((RouteDetailsAnchoredAdLayout) state2.getValue()).b), composer, 3072);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return Unit.f17538a;
    }

    private final Object j(Object obj, Object obj2, Object obj3) {
        Painter painter = (Painter) this.d;
        List list = (List) this.e;
        String str = (String) this.b;
        String str2 = (String) this.c;
        ColumnScope Card = (ColumnScope) obj;
        Composer composer = (Composer) obj2;
        int iIntValue = ((Integer) obj3).intValue();
        Intrinsics.i(Card, "$this$Card");
        if (composer.shouldExecute((iIntValue & 17) != 16, iIntValue & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-495805744, iIntValue, -1, "app.chalo.routeselection.ui.compose.RouteDetailCardCompose.<anonymous> (RouteSelectionBottomSheet.kt:245)");
            }
            Modifier.Companion companion = Modifier.INSTANCE;
            Modifier modifierM784padding3ABfNKs = PaddingKt.m784padding3ABfNKs(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), ChaloTheme.b(composer, 0).h);
            Alignment.Companion companion2 = Alignment.INSTANCE;
            Alignment.Vertical centerVertically = companion2.getCenterVertically();
            Arrangement arrangement = Arrangement.INSTANCE;
            MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(arrangement.getStart(), centerVertically, composer, 48);
            long currentCompositeKeyHashCode = ComposablesKt.getCurrentCompositeKeyHashCode(composer, 0);
            int i = (int) (currentCompositeKeyHashCode ^ (currentCompositeKeyHashCode >>> 32));
            CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composer, modifierM784padding3ABfNKs);
            ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor = companion3.getConstructor();
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
            pk0.v(companion3, composerM3915constructorimpl, measurePolicyRowMeasurePolicy, composerM3915constructorimpl, currentCompositionLocalMap);
            Updater.m3923setimpl(composerM3915constructorimpl, modifierMaterializeModifier, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion3, composerM3915constructorimpl, Integer.valueOf(i), composerM3915constructorimpl));
            RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
            IconKt.m2070Iconww6aTOc(painter, "", (Modifier) null, 0L, composer, Painter.$stable | 48, 12);
            SpacerKt.Spacer(SizeKt.m833width3ABfNKs(companion, ChaloTheme.b(composer, 0).g), composer, 0);
            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(arrangement.getTop(), companion2.getStart(), composer, 0);
            long currentCompositeKeyHashCode2 = ComposablesKt.getCurrentCompositeKeyHashCode(composer, 0);
            int i2 = (int) (currentCompositeKeyHashCode2 ^ (currentCompositeKeyHashCode2 >>> 32));
            CompositionLocalMap currentCompositionLocalMap2 = composer.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(composer, companion);
            Function0<ComposeUiNode> constructor2 = companion3.getConstructor();
            if (composer.getApplier() == null) {
                ComposablesKt.invalidApplier();
            }
            composer.startReusableNode();
            if (composer.getInserting()) {
                composer.createNode(constructor2);
            } else {
                composer.useNode();
            }
            Composer composerM3915constructorimpl2 = Updater.m3915constructorimpl(composer);
            pk0.v(companion3, composerM3915constructorimpl2, measurePolicyColumnMeasurePolicy, composerM3915constructorimpl2, currentCompositionLocalMap2);
            Updater.m3923setimpl(composerM3915constructorimpl2, modifierMaterializeModifier2, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion3, composerM3915constructorimpl2, Integer.valueOf(i2), composerM3915constructorimpl2));
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
            SpecialFeatureTagListComposableKt.a(48, 0, composer, SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), list);
            TextKt.m2623TextNvy7gAk(str, PlotlineComposeWidgetKt.a(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), "PL_Route_Name"), ChaloTheme.a(composer, 0).e, null, 0L, null, null, null, 0L, null, null, 0L, TextOverflow.INSTANCE.m7226getEllipsisgIe3tQ8(), false, 2, 0, null, ChaloTypographyKt.g(ChaloTheme.e(composer, 0)), composer, 0, 24960, 110584);
            if (str2 != null) {
                composer.startReplaceGroup(243467463);
                ChaloSpacersKt.s(companion, 6, composer, 0);
                ChaloExpandingTextKt.a(str2, PlotlineComposeWidgetKt.a(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), "PL_Via"), null, 0L, null, 0L, composer, 48);
            } else {
                composer.startReplaceGroup(233305880);
            }
            composer.endReplaceGroup();
            if (r1.k(composer)) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return Unit.f17538a;
    }

    /* JADX WARN: Type inference failed for: r8v27 */
    /* JADX WARN: Type inference failed for: r8v32, types: [androidx.compose.animation.core.FiniteAnimationSpec, java.lang.Object, kotlin.jvm.functions.Function2] */
    /* JADX WARN: Type inference failed for: r8v34 */
    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        Composer composer;
        int i;
        ?? r8;
        int i2 = this.f11240a;
        Unit unit = Unit.f17538a;
        Object obj4 = this.c;
        Object obj5 = this.b;
        Object obj6 = this.e;
        Object obj7 = this.d;
        switch (i2) {
            case 0:
                ActivationPassUIState activationPassUIState = (ActivationPassUIState) obj7;
                ActivationPassFooterUIState activationPassFooterUIState = (ActivationPassFooterUIState) obj6;
                Density density = (Density) obj5;
                MutableState mutableState = (MutableState) obj4;
                ColumnScope ChaloRoundedCard = (ColumnScope) obj;
                Composer composer2 = (Composer) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                Intrinsics.i(ChaloRoundedCard, "$this$ChaloRoundedCard");
                if (composer2.shouldExecute((iIntValue & 17) != 16, iIntValue & 1)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(744739643, iIntValue, -1, "app.chalo.productactivation.ui.PassCardUi.<anonymous> (ActivationPassComposables.kt:79)");
                    }
                    Modifier modifierAnimateContentSize$default = AnimationModifierKt.animateContentSize$default(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), null, null, 3, null);
                    MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composer2, 0);
                    long currentCompositeKeyHashCode = ComposablesKt.getCurrentCompositeKeyHashCode(composer2, 0);
                    int i3 = (int) (currentCompositeKeyHashCode ^ (currentCompositeKeyHashCode >>> 32));
                    CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composer2, modifierAnimateContentSize$default);
                    ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
                    Function0<ComposeUiNode> constructor = companion.getConstructor();
                    if (composer2.getApplier() == null) {
                        ComposablesKt.invalidApplier();
                    }
                    composer2.startReusableNode();
                    if (composer2.getInserting()) {
                        composer2.createNode(constructor);
                    } else {
                        composer2.useNode();
                    }
                    Composer composerM3915constructorimpl = Updater.m3915constructorimpl(composer2);
                    pk0.v(companion, composerM3915constructorimpl, measurePolicyColumnMeasurePolicy, composerM3915constructorimpl, currentCompositionLocalMap);
                    Updater.m3923setimpl(composerM3915constructorimpl, modifierMaterializeModifier, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion, composerM3915constructorimpl, Integer.valueOf(i3), composerM3915constructorimpl));
                    ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
                    ActivationPassContainerUIState activationPassContainerUIState = activationPassUIState.c;
                    UIShape.Rectangle rectangle = UIShape.f1926a;
                    ActivationPassComposablesKt.c(null, activationPassContainerUIState, composer2, 0, 1);
                    if (activationPassFooterUIState == null) {
                        composer2.startReplaceGroup(-1476400737);
                        composer2.endReplaceGroup();
                        composer = composer2;
                    } else {
                        composer2.startReplaceGroup(-1476400736);
                        TicketPunchDividerKt.a(null, null, 0.0f, 0.0f, composer2, 0, 15);
                        composer = composer2;
                        boolean zChanged = composer.changed(density);
                        Object objRememberedValue = composer.rememberedValue();
                        if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            i = 0;
                            objRememberedValue = new f0(mutableState, density, 0);
                            composer.updateRememberedValue(objRememberedValue);
                        } else {
                            i = 0;
                        }
                        ActivationPassComposablesKt.d(activationPassFooterUIState, (Function1) objRememberedValue, composer, i, i);
                        composer.endReplaceGroup();
                    }
                    composer.endNode();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer2.skipToGroupEnd();
                }
                return unit;
            case 1:
                TicketCardContentSpec ticketCardContentSpec = (TicketCardContentSpec) obj7;
                ActivationTicketUIState activationTicketUIState = (ActivationTicketUIState) obj6;
                Density density2 = (Density) obj5;
                MutableState mutableState2 = (MutableState) obj4;
                ColumnScope ChaloRoundedCard2 = (ColumnScope) obj;
                Composer composer3 = (Composer) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                Intrinsics.i(ChaloRoundedCard2, "$this$ChaloRoundedCard");
                if (composer3.shouldExecute((iIntValue2 & 17) != 16, iIntValue2 & 1)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1393506176, iIntValue2, -1, "app.chalo.productactivation.ui.TicketCardUi.<anonymous> (ActivationTicketComposables.kt:77)");
                    }
                    Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(ChaloThemeKt.c(Modifier.INSTANCE, ticketCardContentSpec.f10737a), 0.0f, 1, null);
                    MeasurePolicy measurePolicyColumnMeasurePolicy2 = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composer3, 0);
                    long currentCompositeKeyHashCode2 = ComposablesKt.getCurrentCompositeKeyHashCode(composer3, 0);
                    int i4 = (int) (currentCompositeKeyHashCode2 ^ (currentCompositeKeyHashCode2 >>> 32));
                    CompositionLocalMap currentCompositionLocalMap2 = composer3.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(composer3, modifierFillMaxWidth$default);
                    ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
                    Function0<ComposeUiNode> constructor2 = companion2.getConstructor();
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
                    pk0.v(companion2, composerM3915constructorimpl2, measurePolicyColumnMeasurePolicy2, composerM3915constructorimpl2, currentCompositionLocalMap2);
                    Updater.m3923setimpl(composerM3915constructorimpl2, modifierMaterializeModifier2, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion2, composerM3915constructorimpl2, Integer.valueOf(i4), composerM3915constructorimpl2));
                    ColumnScopeInstance columnScopeInstance2 = ColumnScopeInstance.INSTANCE;
                    ActivationTicketComposablesKt.a(activationTicketUIState.c, composer3, 0);
                    ActivationTicketFooterUIState activationTicketFooterUIState = activationTicketUIState.d;
                    boolean zChanged2 = composer3.changed(density2);
                    Object objRememberedValue2 = composer3.rememberedValue();
                    if (zChanged2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue2 = new f0(mutableState2, density2, 1);
                        composer3.updateRememberedValue(objRememberedValue2);
                    }
                    ActivationTicketComposablesKt.b(activationTicketFooterUIState, (Function1) objRememberedValue2, composer3, 0);
                    composer3.endNode();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer3.skipToGroupEnd();
                }
                return unit;
            case 2:
                String str = (String) obj7;
                String str2 = (String) obj6;
                CardTransactionTypeUiModel cardTransactionTypeUiModel = (CardTransactionTypeUiModel) obj5;
                String str3 = (String) obj4;
                ColumnScope ChaloRoundedCard3 = (ColumnScope) obj;
                Composer composer4 = (Composer) obj2;
                int iIntValue3 = ((Integer) obj3).intValue();
                Intrinsics.i(ChaloRoundedCard3, "$this$ChaloRoundedCard");
                if (composer4.shouldExecute((iIntValue3 & 17) != 16, iIntValue3 & 1)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1338572507, iIntValue3, -1, "app.chalo.ncmc.ui.cardtransactiondetail.CardTransactionScreenBookingDetailAndPaymentMode.<anonymous> (CardTransactionDetailScreen.kt:246)");
                    }
                    Modifier modifierM784padding3ABfNKs = PaddingKt.m784padding3ABfNKs(Modifier.INSTANCE, ChaloTheme.b(composer4, 0).h);
                    MeasurePolicy measurePolicyColumnMeasurePolicy3 = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composer4, 0);
                    long currentCompositeKeyHashCode3 = ComposablesKt.getCurrentCompositeKeyHashCode(composer4, 0);
                    int i5 = (int) ((currentCompositeKeyHashCode3 >>> 32) ^ currentCompositeKeyHashCode3);
                    CompositionLocalMap currentCompositionLocalMap3 = composer4.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier3 = ComposedModifierKt.materializeModifier(composer4, modifierM784padding3ABfNKs);
                    ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
                    Function0<ComposeUiNode> constructor3 = companion3.getConstructor();
                    if (composer4.getApplier() == null) {
                        ComposablesKt.invalidApplier();
                    }
                    composer4.startReusableNode();
                    if (composer4.getInserting()) {
                        composer4.createNode(constructor3);
                    } else {
                        composer4.useNode();
                    }
                    Composer composerM3915constructorimpl3 = Updater.m3915constructorimpl(composer4);
                    pk0.v(companion3, composerM3915constructorimpl3, measurePolicyColumnMeasurePolicy3, composerM3915constructorimpl3, currentCompositionLocalMap3);
                    Updater.m3923setimpl(composerM3915constructorimpl3, modifierMaterializeModifier3, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion3, composerM3915constructorimpl3, Integer.valueOf(i5), composerM3915constructorimpl3));
                    ColumnScopeInstance columnScopeInstance3 = ColumnScopeInstance.INSTANCE;
                    if (str == null || str.length() == 0) {
                        composer4.startReplaceGroup(-558641517);
                    } else {
                        composer4.startReplaceGroup(-550177742);
                        TwoTextInRowSpaceSeparatedKt.a(null, StringResourcesHelperKt.c(StringEnum.NCMC_RECHARGE_DETAILS_RECHARGE_ID_TITLE, new Object[0], composer4, 6), str, null, 0L, composer4, 0, 25);
                    }
                    composer4.endReplaceGroup();
                    if (str2 == null || str2.length() == 0 || cardTransactionTypeUiModel != CardTransactionTypeUiModel.PASS_PURCHASE) {
                        composer4.startReplaceGroup(-558641517);
                    } else {
                        composer4.startReplaceGroup(-549844306);
                        ChaloSpacersKt.a(ChaloTheme.b(composer4, 0).h, composer4, 0);
                        TwoTextInRowSpaceSeparatedKt.a(null, StringResourcesHelperKt.c(StringEnum.BOOKING_DATE, new Object[0], composer4, 6), str2, null, 0L, composer4, 0, 25);
                    }
                    composer4.endReplaceGroup();
                    if (str3 == null || str3.length() == 0 || cardTransactionTypeUiModel != CardTransactionTypeUiModel.RECHARGE) {
                        composer4.startReplaceGroup(-558641517);
                    } else {
                        composer4.startReplaceGroup(-549479095);
                        ChaloSpacersKt.a(ChaloTheme.b(composer4, 0).h, composer4, 0);
                        TwoTextInRowSpaceSeparatedKt.a(null, StringResourcesHelperKt.c(StringEnum.MODE_OF_PAYMENT, new Object[0], composer4, 6), str3, null, 0L, composer4, 0, 25);
                    }
                    composer4.endReplaceGroup();
                    composer4.endNode();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer4.skipToGroupEnd();
                }
                return unit;
            case 3:
                Ref.FloatRef floatRef = (Ref.FloatRef) obj7;
                Ref.FloatRef floatRef2 = (Ref.FloatRef) obj5;
                Ref.FloatRef floatRef3 = (Ref.FloatRef) obj4;
                Path GenericShape = (Path) obj;
                androidx.compose.ui.geometry.Size size = (androidx.compose.ui.geometry.Size) obj2;
                LayoutDirection layoutDirection = (LayoutDirection) obj3;
                Intrinsics.i(GenericShape, "$this$GenericShape");
                Intrinsics.i(layoutDirection, "layoutDirection");
                Rect rectM4405Recttz77jQw = RectKt.m4405Recttz77jQw(Offset.m4357constructorimpl((((long) Float.floatToRawIntBits(floatRef.element)) & BodyPartID.bodyIdMax) | (((long) Float.floatToRawIntBits(0.0f)) << 32)), androidx.compose.ui.geometry.Size.m4425constructorimpl((((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (size.m4439unboximpl() & BodyPartID.bodyIdMax)) - floatRef.element)) & BodyPartID.bodyIdMax) | (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (size.m4439unboximpl() >> 32)))) << 32)));
                float f = ((Ref.FloatRef) obj6).element;
                aq0.B(GenericShape, RoundRectKt.m4420RoundRectsniSvfs(rectM4405Recttz77jQw, CornerRadius.m4319constructorimpl((((long) Float.floatToRawIntBits(f)) << 32) | (((long) Float.floatToRawIntBits(f)) & BodyPartID.bodyIdMax))), null, 2, null);
                GenericShape.moveTo(floatRef2.element, floatRef.element);
                GenericShape.lineTo((floatRef3.element / 2) + floatRef2.element, 0.0f);
                GenericShape.lineTo(floatRef2.element + floatRef3.element, floatRef.element);
                return unit;
            case 4:
                ChaloBusTicketSpec chaloBusTicketSpec = (ChaloBusTicketSpec) obj7;
                ChaloBusTicketUiState chaloBusTicketUiState = (ChaloBusTicketUiState) obj6;
                Density density3 = (Density) obj5;
                MutableState mutableState3 = (MutableState) obj4;
                ColumnScope ChaloRoundedCard4 = (ColumnScope) obj;
                Composer composer5 = (Composer) obj2;
                int iIntValue4 = ((Integer) obj3).intValue();
                Intrinsics.i(ChaloRoundedCard4, "$this$ChaloRoundedCard");
                if (!composer5.shouldExecute((iIntValue4 & 17) != 16, iIntValue4 & 1)) {
                    composer5.skipToGroupEnd();
                    return unit;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(22455839, iIntValue4, -1, "app.chalo.home.ui.history.compose.components.ChaloBusActiveTicketWithUiState.<anonymous> (ChaloBusTicketView.kt:108)");
                }
                Modifier.Companion companion4 = Modifier.INSTANCE;
                ChaloPadding chaloPadding = chaloBusTicketSpec.f3504a;
                float f2 = chaloBusTicketSpec.e;
                Modifier modifierAnimateContentSize$default2 = AnimationModifierKt.animateContentSize$default(SizeKt.fillMaxWidth$default(PaddingKt.m787paddingqDBjuR0(companion4, chaloPadding.b, chaloPadding.f1918a, chaloPadding.c, chaloPadding.d), 0.0f, 1, null), null, null, 3, null);
                Arrangement arrangement = Arrangement.INSTANCE;
                Arrangement.Vertical top = arrangement.getTop();
                Alignment.Companion companion5 = Alignment.INSTANCE;
                MeasurePolicy measurePolicyColumnMeasurePolicy4 = ColumnKt.columnMeasurePolicy(top, companion5.getStart(), composer5, 0);
                long currentCompositeKeyHashCode4 = ComposablesKt.getCurrentCompositeKeyHashCode(composer5, 0);
                int i6 = (int) (currentCompositeKeyHashCode4 ^ (currentCompositeKeyHashCode4 >>> 32));
                CompositionLocalMap currentCompositionLocalMap4 = composer5.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier4 = ComposedModifierKt.materializeModifier(composer5, modifierAnimateContentSize$default2);
                ComposeUiNode.Companion companion6 = ComposeUiNode.INSTANCE;
                Function0<ComposeUiNode> constructor4 = companion6.getConstructor();
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
                pk0.v(companion6, composerM3915constructorimpl4, measurePolicyColumnMeasurePolicy4, composerM3915constructorimpl4, currentCompositionLocalMap4);
                Updater.m3923setimpl(composerM3915constructorimpl4, modifierMaterializeModifier4, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion6, composerM3915constructorimpl4, Integer.valueOf(i6), composerM3915constructorimpl4));
                ColumnScopeInstance columnScopeInstance4 = ColumnScopeInstance.INSTANCE;
                Alignment.Vertical centerVertically = companion5.getCenterVertically();
                Modifier modifierFillMaxWidth$default2 = SizeKt.fillMaxWidth$default(companion4, 0.0f, 1, null);
                MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(arrangement.getSpaceBetween(), centerVertically, composer5, 54);
                long currentCompositeKeyHashCode5 = ComposablesKt.getCurrentCompositeKeyHashCode(composer5, 0);
                int i7 = (int) (currentCompositeKeyHashCode5 ^ (currentCompositeKeyHashCode5 >>> 32));
                CompositionLocalMap currentCompositionLocalMap5 = composer5.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier5 = ComposedModifierKt.materializeModifier(composer5, modifierFillMaxWidth$default2);
                Function0<ComposeUiNode> constructor5 = companion6.getConstructor();
                if (composer5.getApplier() == null) {
                    ComposablesKt.invalidApplier();
                }
                composer5.startReusableNode();
                if (composer5.getInserting()) {
                    composer5.createNode(constructor5);
                } else {
                    composer5.useNode();
                }
                Composer composerM3915constructorimpl5 = Updater.m3915constructorimpl(composer5);
                pk0.v(companion6, composerM3915constructorimpl5, measurePolicyRowMeasurePolicy, composerM3915constructorimpl5, currentCompositionLocalMap5);
                Updater.m3923setimpl(composerM3915constructorimpl5, modifierMaterializeModifier5, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion6, composerM3915constructorimpl5, Integer.valueOf(i7), composerM3915constructorimpl5));
                RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
                TextUIState.ChaloTextUIState chaloTextUIState = chaloBusTicketUiState.b;
                BusTicketStatusUiState busTicketStatusUiState = chaloBusTicketUiState.d;
                ChaloTextViewKt.a(null, chaloTextUIState, null, null, composer5, 0, 13);
                if (busTicketStatusUiState == null) {
                    composer5.startReplaceGroup(1069271899);
                    composer5.endReplaceGroup();
                } else {
                    Object obj8 = busTicketStatusUiState.f3495a;
                    composer5.startReplaceGroup(1069271900);
                    boolean zChanged3 = composer5.changed(obj8);
                    Object objRememberedValue3 = composer5.rememberedValue();
                    if (zChanged3 || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                        composer5.updateRememberedValue(obj8);
                    } else {
                        obj8 = objRememberedValue3;
                    }
                    BusTicketStatusSpec busTicketStatusSpec = (BusTicketStatusSpec) obj8;
                    Modifier modifierM263backgroundbw27NRU = BackgroundKt.m263backgroundbw27NRU(companion4, ChaloColorTokenKt.c(busTicketStatusSpec.c), ChaloThemeKt.d(busTicketStatusSpec.d));
                    ChaloPadding chaloPadding2 = busTicketStatusSpec.f3494a;
                    Modifier modifierM787paddingqDBjuR0 = PaddingKt.m787paddingqDBjuR0(modifierM263backgroundbw27NRU, chaloPadding2.b, chaloPadding2.f1918a, chaloPadding2.c, chaloPadding2.d);
                    MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(companion5.getCenter(), false);
                    long currentCompositeKeyHashCode6 = ComposablesKt.getCurrentCompositeKeyHashCode(composer5, 0);
                    int i8 = (int) (currentCompositeKeyHashCode6 ^ (currentCompositeKeyHashCode6 >>> 32));
                    CompositionLocalMap currentCompositionLocalMap6 = composer5.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier6 = ComposedModifierKt.materializeModifier(composer5, modifierM787paddingqDBjuR0);
                    Function0<ComposeUiNode> constructor6 = companion6.getConstructor();
                    if (composer5.getApplier() == null) {
                        ComposablesKt.invalidApplier();
                    }
                    composer5.startReusableNode();
                    if (composer5.getInserting()) {
                        composer5.createNode(constructor6);
                    } else {
                        composer5.useNode();
                    }
                    Composer composerM3915constructorimpl6 = Updater.m3915constructorimpl(composer5);
                    pk0.v(companion6, composerM3915constructorimpl6, measurePolicyMaybeCachedBoxMeasurePolicy, composerM3915constructorimpl6, currentCompositionLocalMap6);
                    Updater.m3923setimpl(composerM3915constructorimpl6, modifierMaterializeModifier6, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion6, composerM3915constructorimpl6, Integer.valueOf(i8), composerM3915constructorimpl6));
                    BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                    MeasurePolicy measurePolicyRowMeasurePolicy2 = RowKt.rowMeasurePolicy(arrangement.getStart(), companion5.getCenterVertically(), composer5, 48);
                    long currentCompositeKeyHashCode7 = ComposablesKt.getCurrentCompositeKeyHashCode(composer5, 0);
                    int i9 = (int) (currentCompositeKeyHashCode7 ^ (currentCompositeKeyHashCode7 >>> 32));
                    CompositionLocalMap currentCompositionLocalMap7 = composer5.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier7 = ComposedModifierKt.materializeModifier(composer5, companion4);
                    Function0<ComposeUiNode> constructor7 = companion6.getConstructor();
                    if (composer5.getApplier() == null) {
                        ComposablesKt.invalidApplier();
                    }
                    composer5.startReusableNode();
                    if (composer5.getInserting()) {
                        composer5.createNode(constructor7);
                    } else {
                        composer5.useNode();
                    }
                    Composer composerM3915constructorimpl7 = Updater.m3915constructorimpl(composer5);
                    pk0.v(companion6, composerM3915constructorimpl7, measurePolicyRowMeasurePolicy2, composerM3915constructorimpl7, currentCompositionLocalMap7);
                    Updater.m3923setimpl(composerM3915constructorimpl7, modifierMaterializeModifier7, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion6, composerM3915constructorimpl7, Integer.valueOf(i9), composerM3915constructorimpl7));
                    ImageUIState imageUIState = busTicketStatusUiState.c;
                    if (imageUIState == null) {
                        composer5.startReplaceGroup(-1155266075);
                    } else {
                        composer5.startReplaceGroup(-1155266074);
                        CommonImageKt.a(imageUIState, null, false, composer5, 0, 6);
                        ChaloSpacersKt.a(busTicketStatusSpec.b, composer5, 0);
                    }
                    composer5.endReplaceGroup();
                    ChaloTextViewKt.a(null, busTicketStatusUiState.b, null, null, composer5, 0, 13);
                    composer5.endNode();
                    composer5.endNode();
                    composer5.endReplaceGroup();
                }
                composer5.endNode();
                List list = chaloBusTicketUiState.c;
                if (list == null) {
                    composer5.startReplaceGroup(-1685606814);
                    composer5.endReplaceGroup();
                    r8 = 0;
                } else {
                    composer5.startReplaceGroup(-1685606813);
                    ChaloSpacersKt.a(chaloBusTicketSpec.b, composer5, 0);
                    composer5.startReplaceGroup(361270979);
                    int i10 = 0;
                    for (Object obj9 : list) {
                        int i11 = i10 + 1;
                        if (i10 < 0) {
                            CollectionsKt.z0();
                            throw null;
                        }
                        UIShape.Rectangle rectangle2 = UIShape.f1926a;
                        ChaloBusTicketViewKt.f(null, (ProductBannerUiState) obj9, composer5, 0);
                        if (i10 < CollectionsKt.K(list)) {
                            composer5.startReplaceGroup(1032445197);
                            ChaloSpacersKt.a(chaloBusTicketSpec.f, composer5, 0);
                        } else {
                            composer5.startReplaceGroup(1024942515);
                        }
                        composer5.endReplaceGroup();
                        i10 = i11;
                    }
                    r8 = 0;
                    composer5.endReplaceGroup();
                    composer5.endReplaceGroup();
                }
                ChaloSpacersKt.a(chaloBusTicketSpec.d, composer5, 0);
                Modifier.Companion companion7 = Modifier.INSTANCE;
                Modifier modifierAnimateContentSize$default3 = AnimationModifierKt.animateContentSize$default(companion7, r8, r8, 3, r8);
                ChaloBusTicketContainerUiState chaloBusTicketContainerUiState = chaloBusTicketUiState.e;
                UIShape.Rectangle rectangle3 = UIShape.f1926a;
                ChaloBusTicketViewKt.b(modifierAnimateContentSize$default3, chaloBusTicketContainerUiState, composer5, 0);
                ProductFooterContainerUiState productFooterContainerUiState = chaloBusTicketUiState.f;
                if (productFooterContainerUiState == null) {
                    composer5.startReplaceGroup(-1684822545);
                } else {
                    composer5.startReplaceGroup(-1684822544);
                    ChaloSpacersKt.a(f2, composer5, 0);
                    TicketPunchDividerKt.a(PaddingKt.m786paddingVpY3zN4$default(companion7, 0.0f, f2, 1, null), null, 0.0f, 0.0f, composer5, 0, 14);
                    ChaloSpacersKt.a(f2, composer5, 0);
                    Modifier modifierFillMaxWidth$default3 = SizeKt.fillMaxWidth$default(companion7, 0.0f, 1, null);
                    boolean zChanged4 = composer5.changed(density3);
                    Object objRememberedValue4 = composer5.rememberedValue();
                    if (zChanged4 || objRememberedValue4 == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue4 = new f0(mutableState3, density3, 8);
                        composer5.updateRememberedValue(objRememberedValue4);
                    }
                    ChaloBusTicketViewKt.g(OnGloballyPositionedModifierKt.onGloballyPositioned(modifierFillMaxWidth$default3, (Function1) objRememberedValue4), productFooterContainerUiState, composer5, 0);
                }
                composer5.endReplaceGroup();
                composer5.endNode();
                if (!ComposerKt.isTraceInProgress()) {
                    return unit;
                }
                ComposerKt.traceEventEnd();
                return unit;
            case 5:
                String str4 = (String) obj7;
                String str5 = (String) obj6;
                String str6 = (String) obj5;
                Function0 function0 = (Function0) obj4;
                ColumnScope ChaloRoundedCard5 = (ColumnScope) obj;
                Composer composer6 = (Composer) obj2;
                int iIntValue5 = ((Integer) obj3).intValue();
                Intrinsics.i(ChaloRoundedCard5, "$this$ChaloRoundedCard");
                if (composer6.shouldExecute((iIntValue5 & 17) != 16, iIntValue5 & 1)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1464297048, iIntValue5, -1, "app.chalo.ncmc.ui.landing.compose.ChaloCardLinkTutorialSampleUI.<anonymous> (ChaloCardComposables.kt:130)");
                    }
                    Modifier.Companion companion8 = Modifier.INSTANCE;
                    Modifier modifierM787paddingqDBjuR1 = PaddingKt.m787paddingqDBjuR0(companion8, ChaloTheme.b(composer6, 0).h, ChaloTheme.b(composer6, 0).i, ChaloTheme.b(composer6, 0).h, ChaloTheme.b(composer6, 0).h);
                    MeasurePolicy measurePolicyColumnMeasurePolicy5 = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getCenterHorizontally(), composer6, 48);
                    long currentCompositeKeyHashCode8 = ComposablesKt.getCurrentCompositeKeyHashCode(composer6, 0);
                    int i12 = (int) (currentCompositeKeyHashCode8 ^ (currentCompositeKeyHashCode8 >>> 32));
                    CompositionLocalMap currentCompositionLocalMap8 = composer6.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier8 = ComposedModifierKt.materializeModifier(composer6, modifierM787paddingqDBjuR1);
                    ComposeUiNode.Companion companion9 = ComposeUiNode.INSTANCE;
                    Function0<ComposeUiNode> constructor8 = companion9.getConstructor();
                    if (composer6.getApplier() == null) {
                        ComposablesKt.invalidApplier();
                    }
                    composer6.startReusableNode();
                    if (composer6.getInserting()) {
                        composer6.createNode(constructor8);
                    } else {
                        composer6.useNode();
                    }
                    Composer composerM3915constructorimpl8 = Updater.m3915constructorimpl(composer6);
                    pk0.v(companion9, composerM3915constructorimpl8, measurePolicyColumnMeasurePolicy5, composerM3915constructorimpl8, currentCompositionLocalMap8);
                    Updater.m3923setimpl(composerM3915constructorimpl8, modifierMaterializeModifier8, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion9, composerM3915constructorimpl8, Integer.valueOf(i12), composerM3915constructorimpl8));
                    ColumnScopeInstance columnScopeInstance5 = ColumnScopeInstance.INSTANCE;
                    TextStyle textStyleE = ChaloTypographyKt.e(ChaloTheme.e(composer6, 0));
                    long j = ChaloTheme.a(composer6, 0).g;
                    TextAlign.Companion companion10 = TextAlign.INSTANCE;
                    TextKt.m2623TextNvy7gAk(str4, null, j, null, 0L, null, null, null, 0L, null, TextAlign.m7161boximpl(companion10.m7168getCentere0LSkKk()), 0L, 0, false, 0, 0, null, textStyleE, composer6, 0, 0, 130042);
                    ChaloSpacersKt.m(composer6, 0);
                    TextKt.m2623TextNvy7gAk(str5, null, ChaloTheme.a(composer6, 0).h, null, 0L, null, null, null, 0L, null, TextAlign.m7161boximpl(companion10.m7168getCentere0LSkKk()), 0L, 0, false, 0, 0, null, ChaloTypographyKt.c(ChaloTheme.e(composer6, 0)), composer6, 0, 0, 130042);
                    ChaloSpacersKt.o(composer6, 0);
                    ChaloCardComposablesKt.c(0, composer6, PaddingKt.m786paddingVpY3zN4$default(companion8, ChaloTheme.b(composer6, 0).k, 0.0f, 2, null), str6);
                    ChaloSpacersKt.o(composer6, 0);
                    String upperCase = StringResourcesHelperKt.c(StringEnum.LINK_MY_CARD, new Object[0], composer6, 6).toUpperCase(Locale.ROOT);
                    Intrinsics.h(upperCase, "toUpperCase(...)");
                    Modifier modifierA = PlotlineComposeWidgetKt.a(SizeKt.fillMaxWidth$default(companion8, 0.0f, 1, null), "PL_Link_Card_Now");
                    boolean zChanged5 = composer6.changed(function0);
                    Object objRememberedValue5 = composer6.rememberedValue();
                    if (zChanged5 || objRememberedValue5 == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue5 = new hb(function0, 21);
                        composer6.updateRememberedValue(objRememberedValue5);
                    }
                    ChaloFilledButtonKt.g(modifierA, upperCase, null, 0L, null, true, 0.0f, null, 0L, (Function0) objRememberedValue5, composer6, ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE, 476);
                    composer6.endNode();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer6.skipToGroupEnd();
                }
                return unit;
            case 6:
                TimePickerState timePickerState = (TimePickerState) obj7;
                Modifier modifier = (Modifier) obj6;
                Function0 function1 = (Function0) obj5;
                Function3 function3 = (Function3) obj4;
                ColumnScope Card = (ColumnScope) obj;
                Composer composer7 = (Composer) obj2;
                int iIntValue6 = ((Integer) obj3).intValue();
                Intrinsics.i(Card, "$this$Card");
                if (composer7.shouldExecute((iIntValue6 & 17) != 16, iIntValue6 & 1)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(961252736, iIntValue6, -1, "app.chalo.compose.components.dialogs.ChaloTimePicker.<anonymous>.<anonymous> (ChaloTimePicker.kt:42)");
                    }
                    Modifier.Companion companion11 = Modifier.INSTANCE;
                    Modifier modifierM784padding3ABfNKs2 = PaddingKt.m784padding3ABfNKs(companion11, ChaloTheme.b(composer7, 6).h);
                    Arrangement arrangement2 = Arrangement.INSTANCE;
                    Arrangement.Vertical top2 = arrangement2.getTop();
                    Alignment.Companion companion12 = Alignment.INSTANCE;
                    MeasurePolicy measurePolicyColumnMeasurePolicy6 = ColumnKt.columnMeasurePolicy(top2, companion12.getStart(), composer7, 0);
                    long currentCompositeKeyHashCode9 = ComposablesKt.getCurrentCompositeKeyHashCode(composer7, 0);
                    int i13 = (int) (currentCompositeKeyHashCode9 ^ (currentCompositeKeyHashCode9 >>> 32));
                    CompositionLocalMap currentCompositionLocalMap9 = composer7.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier9 = ComposedModifierKt.materializeModifier(composer7, modifierM784padding3ABfNKs2);
                    ComposeUiNode.Companion companion13 = ComposeUiNode.INSTANCE;
                    Function0<ComposeUiNode> constructor9 = companion13.getConstructor();
                    if (composer7.getApplier() == null) {
                        ComposablesKt.invalidApplier();
                    }
                    composer7.startReusableNode();
                    if (composer7.getInserting()) {
                        composer7.createNode(constructor9);
                    } else {
                        composer7.useNode();
                    }
                    Composer composerM3915constructorimpl9 = Updater.m3915constructorimpl(composer7);
                    pk0.v(companion13, composerM3915constructorimpl9, measurePolicyColumnMeasurePolicy6, composerM3915constructorimpl9, currentCompositionLocalMap9);
                    Updater.m3923setimpl(composerM3915constructorimpl9, modifierMaterializeModifier9, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion13, composerM3915constructorimpl9, Integer.valueOf(i13), composerM3915constructorimpl9));
                    ColumnScopeInstance columnScopeInstance6 = ColumnScopeInstance.INSTANCE;
                    TimePickerKt.m2663TimePickermT9BvqQ(timePickerState, modifier, TimePickerDefaults.INSTANCE.m2647colorsu3YEpmA(ChaloTheme.a(composer7, 6).C0, 0L, 0L, 0L, 0L, ChaloTheme.a(composer7, 6).Z, ChaloTheme.a(composer7, 6).b, ChaloTheme.a(composer7, 6).C0, ChaloTheme.a(composer7, 6).t, ChaloTheme.a(composer7, 6).d0, ChaloTheme.a(composer7, 6).Z, ChaloTheme.a(composer7, 6).Z, ChaloTheme.a(composer7, 6).e, ChaloTheme.a(composer7, 6).d0, composer7, 0, 24576, 30), 0, composer7, 0, 8);
                    Modifier modifierFillMaxWidth$default4 = SizeKt.fillMaxWidth$default(companion11, 0.0f, 1, null);
                    MeasurePolicy measurePolicyRowMeasurePolicy3 = RowKt.rowMeasurePolicy(arrangement2.getEnd(), companion12.getTop(), composer7, 6);
                    long currentCompositeKeyHashCode10 = ComposablesKt.getCurrentCompositeKeyHashCode(composer7, 0);
                    int i14 = (int) (currentCompositeKeyHashCode10 ^ (currentCompositeKeyHashCode10 >>> 32));
                    CompositionLocalMap currentCompositionLocalMap10 = composer7.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier10 = ComposedModifierKt.materializeModifier(composer7, modifierFillMaxWidth$default4);
                    Function0<ComposeUiNode> constructor10 = companion13.getConstructor();
                    if (composer7.getApplier() == null) {
                        ComposablesKt.invalidApplier();
                    }
                    composer7.startReusableNode();
                    if (composer7.getInserting()) {
                        composer7.createNode(constructor10);
                    } else {
                        composer7.useNode();
                    }
                    Composer composerM3915constructorimpl10 = Updater.m3915constructorimpl(composer7);
                    pk0.v(companion13, composerM3915constructorimpl10, measurePolicyRowMeasurePolicy3, composerM3915constructorimpl10, currentCompositionLocalMap10);
                    Updater.m3923setimpl(composerM3915constructorimpl10, modifierMaterializeModifier10, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion13, composerM3915constructorimpl10, Integer.valueOf(i14), composerM3915constructorimpl10));
                    RowScopeInstance rowScopeInstance2 = RowScopeInstance.INSTANCE;
                    boolean zChanged6 = composer7.changed(function1);
                    Object objRememberedValue6 = composer7.rememberedValue();
                    if (zChanged6 || objRememberedValue6 == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue6 = new fk(function1, 6);
                        composer7.updateRememberedValue(objRememberedValue6);
                    }
                    TextKt.m2623TextNvy7gAk(StringResourcesHelperKt.c(StringEnum.CANCEL_CAPS, new Object[0], composer7, 6), ClickableKt.m299clickableoSLSa3U$default(companion11, false, null, null, null, (Function0) objRememberedValue6, 15, null), ChaloTheme.a(composer7, 6).f1915a, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ChaloTheme.e(composer7, 6).getBodyMedium(), composer7, 0, 0, 131064);
                    SpacerKt.Spacer(SizeKt.m833width3ABfNKs(companion11, ChaloTheme.b(composer7, 6).i), composer7, 0);
                    boolean zChanged7 = composer7.changed(function3) | composer7.changedInstance(timePickerState);
                    Object objRememberedValue7 = composer7.rememberedValue();
                    if (zChanged7 || objRememberedValue7 == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue7 = new ti(7, function3, timePickerState);
                        composer7.updateRememberedValue(objRememberedValue7);
                    }
                    TextKt.m2623TextNvy7gAk(StringResourcesHelperKt.c(StringEnum.OKAY, new Object[0], composer7, 6), ClickableKt.m299clickableoSLSa3U$default(companion11, false, null, null, null, (Function0) objRememberedValue7, 15, null), ChaloTheme.a(composer7, 6).f1915a, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ChaloTheme.e(composer7, 6).getBodyMedium(), composer7, 0, 0, 131064);
                    if (r1.k(composer7)) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer7.skipToGroupEnd();
                }
                return unit;
            case 7:
                TextUIState textUIState = (TextUIState) obj7;
                ImageUIState imageUIState2 = (ImageUIState) obj6;
                TextUIState textUIState2 = (TextUIState) obj5;
                TextUIState textUIState3 = (TextUIState) obj4;
                FlowRowScope FlowRow = (FlowRowScope) obj;
                Composer composer8 = (Composer) obj2;
                int iIntValue7 = ((Integer) obj3).intValue();
                Intrinsics.i(FlowRow, "$this$FlowRow");
                if (composer8.shouldExecute((iIntValue7 & 17) != 16, iIntValue7 & 1)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-512554356, iIntValue7, -1, "app.chalo.productpurchase.passpurchase.ui.confirmation.ConfirmSuperPassStartDateSection.<anonymous>.<anonymous> (ConfirmSuperPassScreen.kt:734)");
                    }
                    app.chalo.compose.components.TextKt.c(textUIState, null, null, null, composer8, 0, 14);
                    ChaloSpacersKt.w(composer8, 0);
                    CommonImageKt.a(imageUIState2, null, false, composer8, 0, 6);
                    ChaloSpacersKt.w(composer8, 0);
                    app.chalo.compose.components.TextKt.c(textUIState2, null, null, null, composer8, 0, 14);
                    ChaloSpacersKt.y(composer8, 0);
                    if (textUIState3 == null) {
                        composer8.startReplaceGroup(-897811561);
                    } else {
                        composer8.startReplaceGroup(-897811560);
                        app.chalo.compose.components.TextKt.c(textUIState3, null, null, null, composer8, 0, 14);
                        ChaloSpacersKt.y(composer8, 0);
                    }
                    composer8.endReplaceGroup();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer8.skipToGroupEnd();
                }
                return unit;
            case 8:
                return a(obj, obj2, obj3);
            case 9:
                FareDetailsViewState fareDetailsViewState = (FareDetailsViewState) obj7;
                InstantTicketWalletAccessState instantTicketWalletAccessState = (InstantTicketWalletAccessState) obj6;
                Function1 function2 = (Function1) obj5;
                Function1 function4 = (Function1) obj4;
                ColumnScope ChaloRoundedBottomSheet = (ColumnScope) obj;
                Composer composer9 = (Composer) obj2;
                int iIntValue8 = ((Integer) obj3).intValue();
                Intrinsics.i(ChaloRoundedBottomSheet, "$this$ChaloRoundedBottomSheet");
                if (composer9.shouldExecute((iIntValue8 & 17) != 16, iIntValue8 & 1)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-2005708933, iIntValue8, -1, "app.chalo.instantticket.ui.faredetails.compose.InstantTicketFareDetailsMainScreen.<anonymous>.<anonymous> (InstantTicketFareDetailsMainScreen.kt:27)");
                    }
                    String str7 = fareDetailsViewState.i;
                    WalletSubTextProperties walletSubTextProperties = instantTicketWalletAccessState.d;
                    String str8 = instantTicketWalletAccessState.e;
                    boolean z = instantTicketWalletAccessState.f;
                    boolean zChanged8 = composer9.changed(function2) | composer9.changedInstance(fareDetailsViewState);
                    Object objRememberedValue8 = composer9.rememberedValue();
                    if (zChanged8 || objRememberedValue8 == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue8 = new cy(18, function2, fareDetailsViewState);
                        composer9.updateRememberedValue(objRememberedValue8);
                    }
                    Function0 function5 = (Function0) objRememberedValue8;
                    boolean zChanged9 = composer9.changed(function4);
                    Object objRememberedValue9 = composer9.rememberedValue();
                    if (zChanged9 || objRememberedValue9 == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue9 = new q70(function4, 21);
                        composer9.updateRememberedValue(objRememberedValue9);
                    }
                    PaymentBottomSheetComposableKt.c(str7, walletSubTextProperties, str8, z, function5, (Function0) objRememberedValue9, instantTicketWalletAccessState.j, instantTicketWalletAccessState.k, instantTicketWalletAccessState.l, instantTicketWalletAccessState.m, fareDetailsViewState.k, fareDetailsViewState.K, composer9, 0, 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer9.skipToGroupEnd();
                }
                return unit;
            case 10:
                return LazyLayoutKt.LazyLayout$lambda$1((LazyLayoutPrefetchState) obj7, (Modifier) obj6, (LazyLayoutMeasurePolicy) obj5, (State) obj4, (SaveableStateHolder) obj, (Composer) obj2, ((Integer) obj3).intValue());
            case 11:
                return c(obj, obj2, obj3);
            case 12:
                return d(obj, obj2, obj3);
            case 13:
                return e(obj, obj2, obj3);
            case 14:
                return f(obj, obj2, obj3);
            case 15:
                return g(obj, obj2, obj3);
            case 16:
                return h(obj, obj2, obj3);
            case 17:
                return i(obj, obj2, obj3);
            case 18:
                return j(obj, obj2, obj3);
            case 19:
                return TextFieldCursorKt.cursor$lambda$0((Brush) obj7, (LegacyTextFieldState) obj6, (TextFieldValue) obj5, (OffsetMapping) obj4, (Modifier) obj, (Composer) obj2, ((Integer) obj3).intValue());
            default:
                TitoRideDataAppModel titoRideDataAppModel = (TitoRideDataAppModel) obj7;
                String str9 = (String) obj6;
                String str10 = (String) obj5;
                Function1 function6 = (Function1) obj4;
                ColumnScope ChaloRoundedCard6 = (ColumnScope) obj;
                Composer composer10 = (Composer) obj2;
                int iIntValue9 = ((Integer) obj3).intValue();
                Intrinsics.i(ChaloRoundedCard6, "$this$ChaloRoundedCard");
                if (composer10.shouldExecute((iIntValue9 & 17) != 16, iIntValue9 & 1)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(61942907, iIntValue9, -1, "app.chalo.home.ui.common.TitoRideDetailsBottomSheetLayout.<anonymous> (TitoRideDetailsBottomSheetLayout.kt:47)");
                    }
                    Modifier.Companion companion14 = Modifier.INSTANCE;
                    Modifier modifierM784padding3ABfNKs3 = PaddingKt.m784padding3ABfNKs(SizeKt.fillMaxWidth$default(BackgroundKt.m264backgroundbw27NRU$default(companion14, ChaloTheme.a(composer10, 0).t, null, 2, null), 0.0f, 1, null), ChaloTheme.b(composer10, 0).h);
                    MeasurePolicy measurePolicyColumnMeasurePolicy7 = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composer10, 0);
                    long currentCompositeKeyHashCode11 = ComposablesKt.getCurrentCompositeKeyHashCode(composer10, 0);
                    int i15 = (int) (currentCompositeKeyHashCode11 ^ (currentCompositeKeyHashCode11 >>> 32));
                    CompositionLocalMap currentCompositionLocalMap11 = composer10.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier11 = ComposedModifierKt.materializeModifier(composer10, modifierM784padding3ABfNKs3);
                    ComposeUiNode.Companion companion15 = ComposeUiNode.INSTANCE;
                    Function0<ComposeUiNode> constructor11 = companion15.getConstructor();
                    if (composer10.getApplier() == null) {
                        ComposablesKt.invalidApplier();
                    }
                    composer10.startReusableNode();
                    if (composer10.getInserting()) {
                        composer10.createNode(constructor11);
                    } else {
                        composer10.useNode();
                    }
                    Composer composerM3915constructorimpl11 = Updater.m3915constructorimpl(composer10);
                    pk0.v(companion15, composerM3915constructorimpl11, measurePolicyColumnMeasurePolicy7, composerM3915constructorimpl11, currentCompositionLocalMap11);
                    Updater.m3923setimpl(composerM3915constructorimpl11, modifierMaterializeModifier11, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion15, composerM3915constructorimpl11, Integer.valueOf(i15), composerM3915constructorimpl11));
                    ColumnScopeInstance columnScopeInstance7 = ColumnScopeInstance.INSTANCE;
                    TitoRideDetailsBottomSheetLayoutKt.b(composer10, 0);
                    ChaloSpacersKt.o(composer10, 0);
                    Modifier modifierAnimateContentSize$default4 = AnimationModifierKt.animateContentSize$default(SizeKt.fillMaxWidth$default(companion14, 0.0f, 1, null), null, null, 3, null);
                    ValidationProduct.Companion companion16 = ValidationProduct.INSTANCE;
                    TitoRideDetailsBottomSheetLayoutKt.c(titoRideDataAppModel, str9, str10, modifierAnimateContentSize$default4, function6, composer10, 0);
                    composer10.endNode();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer10.skipToGroupEnd();
                }
                return unit;
        }
    }

    public /* synthetic */ c0(Object obj, Object obj2, Object obj3, Object obj4, int i) {
        this.f11240a = i;
        this.d = obj;
        this.e = obj2;
        this.b = obj3;
        this.c = obj4;
    }
}
