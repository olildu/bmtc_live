package defpackage;

import android.text.Spannable;
import androidx.compose.animation.AnimatedVisibilityScope;
import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.animation.core.InfiniteRepeatableSpec;
import androidx.compose.animation.core.InfiniteTransition;
import androidx.compose.animation.core.InfiniteTransitionKt;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.BorderKt;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScope;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.FlowRowScope;
import androidx.compose.foundation.layout.IntrinsicKt;
import androidx.compose.foundation.layout.IntrinsicSize;
import androidx.compose.foundation.layout.OffsetKt;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.lazy.LazyDslKt;
import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.foundation.pager.PagerState;
import androidx.compose.foundation.text.selection.SelectionMagnifierKt;
import androidx.compose.material3.SearchBarKt;
import androidx.compose.material3.TextKt;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.MutableIntState;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.ClipKt;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.Path;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.OnGloballyPositionedModifierKt;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.text.SpanStyle;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.platform.extensions.SpannableExtensions_androidKt;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.IntSize;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import app.chalo.ads.BindNativeAdResult;
import app.chalo.compose.components.ChaloSpacersKt;
import app.chalo.compose.components.ChaloTextViewKt;
import app.chalo.compose.components.OriginDestinationSideIndicatorKt;
import app.chalo.compose.components.PlotlineComposeWidgetKt;
import app.chalo.compose.components.RippleEffectKt;
import app.chalo.compose.components.TextWithFilledLeadingIconKt;
import app.chalo.compose.components.buttons.ChaloFilledButtonKt;
import app.chalo.compose.components.chalomap.ChaloMap_androidKt;
import app.chalo.compose.components.chalomap.MapCameraViewState;
import app.chalo.compose.components.image.CommonImageKt;
import app.chalo.compose.components.noneditablesearch.NonEditableSearchFieldKt;
import app.chalo.compose.components.shimmer.ShimmerEffectKt;
import app.chalo.compose.resources.StringResourcesHelperKt;
import app.chalo.compose.theme.ChaloPadding;
import app.chalo.compose.theme.ChaloTheme;
import app.chalo.compose.theme.ChaloThemeKt;
import app.chalo.compose.theme.UIShape;
import app.chalo.home.ui.compose.CommonTemplateBottomSheetKt;
import app.chalo.home.ui.profile.ProfileScreenBottomSheetType;
import app.chalo.home.ui.profile.ProfileScreenUIKt;
import app.chalo.home.ui.regularbus.NearbyBusDataHolder;
import app.chalo.home.ui.regularbus.NearbyBusesMapData;
import app.chalo.home.ui.regularbus.RegularBusViewState;
import app.chalo.home.ui.savedplacesandrides.SavedPlaceUISpecs;
import app.chalo.home.ui.savedplacesandrides.SavedPlaceUIState;
import app.chalo.home.ui.savedplacesandrides.SavedRideUISpecs;
import app.chalo.home.ui.savedplacesandrides.SavedRideUIState;
import app.chalo.livetracking.routedetails.data.model.ui.RouteDetailsStopUiModel;
import app.chalo.livetracking.routedetails.ui.routedetailsscreen.compose.SingleStopItemKt;
import app.chalo.livetracking.search.uistate.NearestStopsBottomSheetUISpec;
import app.chalo.livetracking.stoptripplannerresult.uistate.StopTripPlannerResultLoadingCardUiSpec;
import app.chalo.livetracking.ui.routedetailsscreen.RouteDetailsIntent;
import app.chalo.livetracking.ui.routedetailsscreen.uistatefactory.FromStopAndBusIconUIState;
import app.chalo.livetracking.ui.routedetailsscreen.uistatefactory.RouteDetailsStopsListUIStateFactory;
import app.chalo.livetracking.ui.routedetailsscreen.uistatefactory.RouteNativeAdUIState;
import app.chalo.livetracking.ui.routedetailsscreen.uistatefactory.StopsListBusIconUIState;
import app.chalo.premiumbus.prebookedtickets.productmodification.PremiumBusProductModificationReasonsScreenKt;
import app.chalo.premiumbus.ui.seatselection.compose.PremiumBusSeatSelectionComposablesKt;
import app.chalo.premiumbus.ui.seatselection.compose.uistate.PassengerCountSelectionBottomSheetUISpecs;
import app.chalo.premiumbus.ui.seatselection.compose.uistate.PassengerCountSelectionBottomSheetUIState;
import app.chalo.premiumbus.ui.seatselection.compose.uistate.PremiumBusSeatSelectionBottomSheetUIState;
import app.chalo.premiumbus.ui.seatselection.compose.uistate.SeatChangeDialogTypeUISpecs;
import app.chalo.premiumbus.ui.seatselection.compose.uistate.SeatSelectionDialogTypeUIState;
import app.chalo.premiumbus.ui.slotselection.NearBySlotsAvailableSelectionBottomSheetUISpecs;
import app.chalo.premiumbus.ui.slotselection.NearBySlotsAvailableSelectionBottomSheetUIState;
import app.chalo.premiumbus.ui.slotselection.NearBySlotsCardUISpecs;
import app.chalo.premiumbus.ui.slotselection.NearBySlotsCardUIState;
import app.chalo.premiumbus.ui.slotselection.PassOptionAdditionalInfo;
import app.chalo.premiumbus.ui.slotselection.PassPurchaseNudgeCardUISpecs;
import app.chalo.premiumbus.ui.slotselection.PassPurchaseNudgeCardUIState;
import app.chalo.premiumbus.ui.slotselection.PremiumBusBottomSheetTypeUIState;
import app.chalo.premiumbus.ui.slotselection.PremiumBusDefaultOptionUISpecs;
import app.chalo.premiumbus.ui.slotselection.PremiumBusDefaultOptionUIState;
import app.chalo.premiumbus.ui.slotselection.PremiumBusPassOptionUISpecs;
import app.chalo.premiumbus.ui.slotselection.PremiumBusPassOptionUIState;
import app.chalo.premiumbus.ui.slotselection.PremiumBusSlotSelectionDateAndTimePickerUIState;
import app.chalo.premiumbus.ui.slotselection.PremiumBusSlotSelectionUiStateKt;
import app.chalo.premiumbus.ui.slotselection.ViewAllSlotsBottomSheetUISpec;
import app.chalo.premiumbus.ui.slotselection.ViewAllSlotsBottomSheetUIState;
import app.chalo.productpurchase.productselection.ui.ProductAnnouncementTextUIState;
import app.chalo.productpurchase.productselection.ui.ProductSelectionProductsListSectionUIState;
import app.chalo.productpurchase.productselection.ui.ProductSelectionScreenKt;
import app.chalo.providers.iconassetprovider.IconType;
import app.chalo.providers.stringprovider.StringEnum;
import app.chalo.ridehailing.feedback.UserFeedbackRatingData;
import app.chalo.ridehailing.feedback.UserFeedbackReasonData;
import app.chalo.routeselection.ui.StopBasedRouteSearchViewState;
import app.chalo.routeselection.ui.compose.RouteSelectionBottomSheetKt;
import app.chalo.uistate.base.BorderUISpecKt;
import app.chalo.uistate.base.ChaloColorToken;
import app.chalo.uistate.base.ChaloColorTokenKt;
import app.chalo.uistate.image.ImageUIState;
import app.chalo.uistate.noneditablesearch.NonEditableSearchFieldUiState;
import app.chalo.uistate.text.TextUIState;
import app.chalo.validationsdk.blevalidation.ui.qrvalidation.QRValidationScreenKt;
import app.chalo.validationsdk.blevalidation.ui.qrvalidation.QRValidationScreenUIState;
import app.chalo.validationsdk.blevalidation.ui.qrvalidation.QRValidationUIState;
import app.chalo.wallet.ui.promotionscardcontainer.PromotionsCardContainerKt;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.EmptyList;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import org.bouncycastle.asn1.cmc.BodyPartID;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class fu0 implements Function3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15677a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ fu0(int i, Object obj, Object obj2) {
        this.f15677a = i;
        this.b = obj;
        this.c = obj2;
    }

    private final Object a(Object obj, Object obj2, Object obj3) {
        QRValidationUIState qRValidationUIState = (QRValidationUIState) this.b;
        MutableIntState mutableIntState = (MutableIntState) this.c;
        AnimatedVisibilityScope AnimatedVisibility = (AnimatedVisibilityScope) obj;
        Composer composer = (Composer) obj2;
        int iIntValue = ((Integer) obj3).intValue();
        Intrinsics.i(AnimatedVisibility, "$this$AnimatedVisibility");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1137295394, iIntValue, -1, "app.chalo.validationsdk.blevalidation.ui.qrvalidation.QRValidationMainContent.<anonymous>.<anonymous> (QRValidationScreen.kt:167)");
        }
        if (qRValidationUIState.b instanceof QRValidationScreenUIState.QRWithProductAndUserDetails) {
            composer.startReplaceGroup(-1829793255);
            QRValidationScreenUIState.QRWithProductAndUserDetails qRWithProductAndUserDetails = (QRValidationScreenUIState.QRWithProductAndUserDetails) qRValidationUIState.b;
            Modifier.Companion companion = Modifier.INSTANCE;
            int intValue = mutableIntState.getIntValue();
            Object objRememberedValue = composer.rememberedValue();
            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new vd(mutableIntState, 7);
                composer.updateRememberedValue(objRememberedValue);
            }
            QRValidationScreenKt.e(qRWithProductAndUserDetails, companion, intValue, (Function1) objRememberedValue, composer, 3120);
            composer.endReplaceGroup();
        } else {
            composer.startReplaceGroup(2019196326);
            composer.endReplaceGroup();
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return Unit.f17538a;
    }

    private final Object c(Object obj, Object obj2, Object obj3) {
        int i;
        RegularBusViewState regularBusViewState = (RegularBusViewState) this.b;
        Function1 function1 = (Function1) this.c;
        ColumnScope ChaloRoundedCard = (ColumnScope) obj;
        Composer composer = (Composer) obj2;
        int iIntValue = ((Integer) obj3).intValue();
        Intrinsics.i(ChaloRoundedCard, "$this$ChaloRoundedCard");
        if (composer.shouldExecute((iIntValue & 17) != 16, iIntValue & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(328875169, iIntValue, -1, "app.chalo.home.ui.regularbus.compose.RegularBusMap.<anonymous>.<anonymous>.<anonymous> (RegularBusScreenUI.kt:1632)");
            }
            Modifier.Companion companion = Modifier.INSTANCE;
            Modifier modifierM784padding3ABfNKs = PaddingKt.m784padding3ABfNKs(SizeKt.fillMaxWidth$default(SizeKt.m814height3ABfNKs(PlotlineComposeWidgetKt.a(companion, "PL_Nearby_Bus_Map"), ChaloTheme.b(composer, 0).v), 0.0f, 1, null), ChaloTheme.b(composer, 0).f);
            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
            long currentCompositeKeyHashCode = ComposablesKt.getCurrentCompositeKeyHashCode(composer, 0);
            int i2 = (int) (currentCompositeKeyHashCode ^ (currentCompositeKeyHashCode >>> 32));
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
            pk0.v(companion2, composerM3915constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy, composerM3915constructorimpl, currentCompositionLocalMap);
            Updater.m3923setimpl(composerM3915constructorimpl, modifierMaterializeModifier, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion2, composerM3915constructorimpl, Integer.valueOf(i2), composerM3915constructorimpl));
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            Modifier modifierFillMaxSize$default = SizeKt.fillMaxSize$default(companion, 0.0f, 1, null);
            NearbyBusesMapData nearbyBusesMapData = regularBusViewState.f;
            MapCameraViewState mapCameraViewState = nearbyBusesMapData.c;
            List list = nearbyBusesMapData.f3616a;
            int i3 = 10;
            ArrayList arrayList = new ArrayList(CollectionsKt.v(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(((NearbyBusDataHolder) it.next()).b);
            }
            EmptyList emptyList = EmptyList.f17557a;
            Object objRememberedValue = composer.rememberedValue();
            Composer.Companion companion3 = Composer.INSTANCE;
            if (objRememberedValue == companion3.getEmpty()) {
                objRememberedValue = new g11(i3);
                composer.updateRememberedValue(objRememberedValue);
            }
            ChaloMap_androidKt.b(modifierFillMaxSize$default, emptyList, false, mapCameraViewState, arrayList, null, null, true, null, null, null, (Function1) objRememberedValue, composer, 12582966, 48, 1892);
            Modifier modifierFillMaxSize$default2 = SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null);
            boolean zChanged = composer.changed(function1);
            Object objRememberedValue2 = composer.rememberedValue();
            if (zChanged || objRememberedValue2 == companion3.getEmpty()) {
                i = 0;
                objRememberedValue2 = new t11(function1, i);
                composer.updateRememberedValue(objRememberedValue2);
            } else {
                i = 0;
            }
            BoxKt.Box(ClickableKt.m299clickableoSLSa3U$default(modifierFillMaxSize$default2, false, null, null, null, (Function0) objRememberedValue2, 15, null), composer, i);
            composer.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return Unit.f17538a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v0 */
    /* JADX WARN: Type inference failed for: r7v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r7v2 */
    /* JADX WARN: Type inference failed for: r9v18 */
    /* JADX WARN: Type inference failed for: r9v23 */
    private final Object d(Object obj, Object obj2, Object obj3) {
        long j;
        long j2;
        TextStyle bodySmall;
        UserFeedbackRatingData userFeedbackRatingData = (UserFeedbackRatingData) this.b;
        Function2 function2 = (Function2) this.c;
        FlowRowScope FlowRow = (FlowRowScope) obj;
        Composer composer = (Composer) obj2;
        int iIntValue = ((Integer) obj3).intValue();
        Intrinsics.i(FlowRow, "$this$FlowRow");
        ?? r7 = 0;
        if (composer.shouldExecute((iIntValue & 17) != 16, iIntValue & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-319919466, iIntValue, -1, "app.chalo.home.ui.common.RideHailingUserFeedbackBottomSheetContent.<anonymous>.<anonymous>.<anonymous>.<anonymous> (RideHailingUserFeedbackBottomSheetContent.kt:151)");
            }
            for (UserFeedbackReasonData userFeedbackReasonData : userFeedbackRatingData.d) {
                Modifier.Companion companion = Modifier.INSTANCE;
                boolean z = userFeedbackReasonData.c;
                if (z) {
                    composer.startReplaceGroup(1561916684);
                    j = ChaloTheme.a(composer, r7).N0;
                } else {
                    composer.startReplaceGroup(1561951497);
                    j = ChaloTheme.a(composer, r7).Z;
                }
                composer.endReplaceGroup();
                Modifier modifierM263backgroundbw27NRU = BackgroundKt.m263backgroundbw27NRU(companion, j, ChaloTheme.d(composer, r7).b);
                float f = ChaloTheme.b(composer, r7).b;
                if (z) {
                    composer.startReplaceGroup(1020227750);
                    j2 = ChaloTheme.a(composer, r7).f1915a;
                } else {
                    composer.startReplaceGroup(1020228898);
                    j2 = ChaloTheme.a(composer, r7).m0;
                }
                composer.endReplaceGroup();
                Modifier modifierM785paddingVpY3zN4 = PaddingKt.m785paddingVpY3zN4(BorderKt.m275borderxT4_qwU(modifierM263backgroundbw27NRU, f, j2, ChaloTheme.d(composer, r7).b), ChaloTheme.b(composer, r7).h, ChaloTheme.b(composer, r7).f);
                MutableInteractionSource mutableInteractionSourceB = RippleEffectKt.b(composer);
                boolean zChanged = composer.changed(function2) | composer.changedInstance(userFeedbackRatingData) | composer.changedInstance(userFeedbackReasonData);
                Object objRememberedValue = composer.rememberedValue();
                if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = new m(29, function2, userFeedbackRatingData, userFeedbackReasonData);
                    composer.updateRememberedValue(objRememberedValue);
                }
                Modifier modifierM295clickableO2vRcR0$default = ClickableKt.m295clickableO2vRcR0$default(modifierM785paddingVpY3zN4, mutableInteractionSourceB, null, false, null, null, (Function0) objRememberedValue, 28, null);
                MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getCenter(), r7);
                long currentCompositeKeyHashCode = ComposablesKt.getCurrentCompositeKeyHashCode(composer, r7);
                int i = (int) (currentCompositeKeyHashCode ^ (currentCompositeKeyHashCode >>> 32));
                CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composer, modifierM295clickableO2vRcR0$default);
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
                pk0.v(companion2, composerM3915constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy, composerM3915constructorimpl, currentCompositionLocalMap);
                Updater.m3923setimpl(composerM3915constructorimpl, modifierMaterializeModifier, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion2, composerM3915constructorimpl, Integer.valueOf(i), composerM3915constructorimpl));
                BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                String str = userFeedbackReasonData.b;
                if (z) {
                    composer.startReplaceGroup(1068359423);
                    bodySmall = ChaloTheme.e(composer, r7).getTitleLarge();
                } else {
                    composer.startReplaceGroup(1068401056);
                    bodySmall = ChaloTheme.e(composer, r7).getBodySmall();
                }
                composer.endReplaceGroup();
                Composer composer2 = composer;
                TextKt.m2623TextNvy7gAk(str, null, ChaloTheme.a(composer, r7).t0, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, bodySmall, composer2, 0, 0, 131066);
                composer2.endNode();
                composer = composer2;
                r7 = r7 == true ? 1 : 0;
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
        SavedPlaceUISpecs savedPlaceUISpecs = (SavedPlaceUISpecs) this.b;
        SavedPlaceUIState savedPlaceUIState = (SavedPlaceUIState) this.c;
        ColumnScope ChaloRoundedCard = (ColumnScope) obj;
        Composer composer = (Composer) obj2;
        int iIntValue = ((Integer) obj3).intValue();
        Intrinsics.i(ChaloRoundedCard, "$this$ChaloRoundedCard");
        if (composer.shouldExecute((iIntValue & 17) != 16, iIntValue & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1543216603, iIntValue, -1, "app.chalo.home.ui.savedplacesandrides.SavedPlaceCardUi.<anonymous> (SavedPlacesAndRidesScreen.kt:191)");
            }
            Modifier.Companion companion = Modifier.INSTANCE;
            Modifier modifierC = ChaloThemeKt.c(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), savedPlaceUISpecs.f3676a);
            Alignment.Companion companion2 = Alignment.INSTANCE;
            Alignment.Vertical centerVertically = companion2.getCenterVertically();
            Arrangement arrangement = Arrangement.INSTANCE;
            MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(arrangement.getStart(), centerVertically, composer, 48);
            long currentCompositeKeyHashCode = ComposablesKt.getCurrentCompositeKeyHashCode(composer, 0);
            int i = (int) (currentCompositeKeyHashCode ^ (currentCompositeKeyHashCode >>> 32));
            CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composer, modifierC);
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
            CommonImageKt.a(savedPlaceUIState.b, null, false, composer, 0, 6);
            SpacerKt.Spacer(SizeKt.m833width3ABfNKs(companion, savedPlaceUISpecs.d), composer, 0);
            Modifier modifierA = i41.a(rowScopeInstance, companion, 1.0f, false, 2, null);
            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(arrangement.getTop(), companion2.getStart(), composer, 0);
            long currentCompositeKeyHashCode2 = ComposablesKt.getCurrentCompositeKeyHashCode(composer, 0);
            int i2 = (int) (currentCompositeKeyHashCode2 ^ (currentCompositeKeyHashCode2 >>> 32));
            CompositionLocalMap currentCompositionLocalMap2 = composer.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(composer, modifierA);
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
            ChaloTextViewKt.a(null, savedPlaceUIState.c, null, null, composer, 0, 13);
            Composer composer2 = composer;
            if (savedPlaceUIState.d != null) {
                composer2.startReplaceGroup(-899321288);
                SpacerKt.Spacer(SizeKt.m814height3ABfNKs(companion, savedPlaceUISpecs.e), composer2, 0);
                ChaloTextViewKt.a(null, savedPlaceUIState.d, null, null, composer2, 0, 13);
                composer2 = composer2;
            } else {
                composer2.startReplaceGroup(-906970259);
            }
            composer2.endReplaceGroup();
            composer2.endNode();
            if (savedPlaceUIState.f != null) {
                composer2.startReplaceGroup(-867768250);
                ChaloSpacersKt.w(composer2, 0);
                CommonImageKt.a(savedPlaceUIState.f, null, false, composer2, 0, 6);
            } else {
                composer2.startReplaceGroup(-875690269);
            }
            composer2.endReplaceGroup();
            if (savedPlaceUIState.e != null) {
                composer2.startReplaceGroup(-867596696);
                ChaloSpacersKt.w(composer2, 0);
                CommonImageKt.a(savedPlaceUIState.e, null, false, composer2, 0, 6);
            } else {
                composer2.startReplaceGroup(-875690269);
            }
            composer2.endReplaceGroup();
            composer2.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return Unit.f17538a;
    }

    private final Object f(Object obj, Object obj2, Object obj3) {
        SavedRideUISpecs savedRideUISpecs = (SavedRideUISpecs) this.b;
        SavedRideUIState savedRideUIState = (SavedRideUIState) this.c;
        ColumnScope ChaloRoundedCard = (ColumnScope) obj;
        Composer composer = (Composer) obj2;
        int iIntValue = ((Integer) obj3).intValue();
        Intrinsics.i(ChaloRoundedCard, "$this$ChaloRoundedCard");
        if (composer.shouldExecute((iIntValue & 17) != 16, iIntValue & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1458169361, iIntValue, -1, "app.chalo.home.ui.savedplacesandrides.SavedRideCardUi.<anonymous> (SavedPlacesAndRidesScreen.kt:233)");
            }
            Modifier.Companion companion = Modifier.INSTANCE;
            Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null);
            ChaloPadding chaloPadding = savedRideUISpecs.f3694a;
            float f = savedRideUISpecs.d;
            Modifier modifierC = ChaloThemeKt.c(modifierFillMaxWidth$default, chaloPadding);
            Arrangement arrangement = Arrangement.INSTANCE;
            Arrangement.Vertical top = arrangement.getTop();
            Alignment.Companion companion2 = Alignment.INSTANCE;
            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(top, companion2.getStart(), composer, 0);
            long currentCompositeKeyHashCode = ComposablesKt.getCurrentCompositeKeyHashCode(composer, 0);
            int i = (int) (currentCompositeKeyHashCode ^ (currentCompositeKeyHashCode >>> 32));
            CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composer, modifierC);
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
            IntrinsicSize intrinsicSize = IntrinsicSize.Min;
            Modifier modifierHeight = IntrinsicKt.height(companion, intrinsicSize);
            MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(arrangement.getStart(), companion2.getCenterVertically(), composer, 48);
            long currentCompositeKeyHashCode2 = ComposablesKt.getCurrentCompositeKeyHashCode(composer, 0);
            int i2 = (int) (currentCompositeKeyHashCode2 ^ (currentCompositeKeyHashCode2 >>> 32));
            CompositionLocalMap currentCompositionLocalMap2 = composer.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(composer, modifierHeight);
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
            OriginDestinationSideIndicatorKt.a(SizeKt.fillMaxHeight(companion, 0.8f), ChaloTheme.b(composer, 0).f, ChaloTheme.b(composer, 0).c, composer, 6, 0);
            SpacerKt.Spacer(SizeKt.m833width3ABfNKs(companion, f), composer, 0);
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
            ChaloTextViewKt.a(null, savedRideUIState.b, null, null, composer, 0, 13);
            SpacerKt.Spacer(SizeKt.m814height3ABfNKs(companion, savedRideUISpecs.e), composer, 0);
            ChaloTextViewKt.a(null, savedRideUIState.c, null, null, composer, 0, 13);
            composer.endNode();
            composer.endNode();
            ChaloSpacersKt.m(composer, 0);
            Modifier modifierHeight2 = IntrinsicKt.height(companion, intrinsicSize);
            MeasurePolicy measurePolicyRowMeasurePolicy2 = RowKt.rowMeasurePolicy(arrangement.getStart(), companion2.getCenterVertically(), composer, 48);
            long currentCompositeKeyHashCode4 = ComposablesKt.getCurrentCompositeKeyHashCode(composer, 0);
            int i4 = (int) (currentCompositeKeyHashCode4 ^ (currentCompositeKeyHashCode4 >>> 32));
            CompositionLocalMap currentCompositionLocalMap4 = composer.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier4 = ComposedModifierKt.materializeModifier(composer, modifierHeight2);
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
            CommonImageKt.a(savedRideUIState.e, null, false, composer, 0, 6);
            SpacerKt.Spacer(SizeKt.m833width3ABfNKs(companion, f), composer, 0);
            ChaloTextViewKt.a(null, savedRideUIState.d, null, null, composer, 0, 13);
            SpacerKt.Spacer(i41.a(rowScopeInstance, companion, 1.0f, false, 2, null), composer, 0);
            CommonImageKt.a(savedRideUIState.g, null, false, composer, 0, 6);
            SpacerKt.Spacer(SizeKt.m833width3ABfNKs(companion, savedRideUISpecs.g), composer, 0);
            CommonImageKt.a(savedRideUIState.f, null, false, composer, 0, 6);
            if (r1.k(composer)) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return Unit.f17538a;
    }

    private final Object g(Object obj, Object obj2, Object obj3) {
        return SearchBarKt.SearchBarImpl_j1jLAyQ$lambda$35$lambda$34((Density) this.b, (Animatable) this.c, (Path) obj, (Size) obj2, (LayoutDirection) obj3);
    }

    private final Object h(Object obj, Object obj2, Object obj3) {
        PremiumBusSlotSelectionDateAndTimePickerUIState premiumBusSlotSelectionDateAndTimePickerUIState = (PremiumBusSlotSelectionDateAndTimePickerUIState) this.b;
        Function1 function1 = (Function1) this.c;
        ColumnScope ModalBottomSheet = (ColumnScope) obj;
        Composer composer = (Composer) obj2;
        int iIntValue = ((Integer) obj3).intValue();
        Intrinsics.i(ModalBottomSheet, "$this$ModalBottomSheet");
        if (composer.shouldExecute((iIntValue & 17) != 16, iIntValue & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-236794473, iIntValue, -1, "app.chalo.home.ui.selectridescreen.SelectRideScreen.<anonymous> (SelectRideMainScreen.kt:83)");
            }
            boolean zChanged = composer.changed(function1);
            Object objRememberedValue = composer.rememberedValue();
            if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new ab(function1, 9);
                composer.updateRememberedValue(objRememberedValue);
            }
            PremiumBusSlotSelectionUiStateKt.n(premiumBusSlotSelectionDateAndTimePickerUIState, null, (Function3) objRememberedValue, composer, 0, 2);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return Unit.f17538a;
    }

    private final Object i(Object obj, Object obj2, Object obj3) {
        return SelectionMagnifierKt.animatedSelectionMagnifier$lambda$0((Function0) this.b, (Function1) this.c, (Modifier) obj, (Composer) obj2, ((Integer) obj3).intValue());
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final Object j(Object obj, Object obj2, Object obj3) {
        long jM4615unboximpl;
        long jM4615unboximpl2;
        long jM4615unboximpl3;
        Color color = (Color) this.b;
        Color color2 = (Color) this.c;
        Modifier composed = (Modifier) obj;
        Composer composer = (Composer) obj2;
        int iIntValue = ((Integer) obj3).intValue();
        Intrinsics.i(composed, "$this$composed");
        composer.startReplaceGroup(2007755038);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(2007755038, iIntValue, -1, "app.chalo.compose.components.shimmer.shimmerEffect.<anonymous> (ShimmerEffect.kt:32)");
        }
        Object objRememberedValue = composer.rememberedValue();
        Composer.Companion companion = Composer.INSTANCE;
        if (objRememberedValue == companion.getEmpty()) {
            objRememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(IntSize.m7437boximpl(IntSize.INSTANCE.m7450getZeroYbymL2g()), null, 2, null);
            composer.updateRememberedValue(objRememberedValue);
        }
        MutableState mutableState = (MutableState) objRememberedValue;
        State<Float> stateAnimateFloat = InfiniteTransitionKt.animateFloat(InfiniteTransitionKt.rememberInfiniteTransition(null, composer, 0, 1), (-2) * ((int) (((IntSize) mutableState.getValue()).m7449unboximpl() >> 32)), 2 * ((int) (((IntSize) mutableState.getValue()).m7449unboximpl() >> 32)), AnimationSpecKt.m174infiniteRepeatable9IiC70o$default(AnimationSpecKt.tween$default(1000, 0, null, 6, null), null, 0L, 6, null), null, composer, InfiniteTransition.$stable | (InfiniteRepeatableSpec.$stable << 9), 8);
        Brush.Companion companion2 = Brush.INSTANCE;
        if (color == null) {
            composer.startReplaceGroup(1012292131);
            jM4615unboximpl = ChaloTheme.a(composer, 6).t;
            composer.endReplaceGroup();
        } else {
            composer.startReplaceGroup(1012290953);
            composer.endReplaceGroup();
            jM4615unboximpl = color.m4615unboximpl();
        }
        Color colorM4595boximpl = Color.m4595boximpl(jM4615unboximpl);
        if (color2 == null) {
            composer.startReplaceGroup(1012293930);
            jM4615unboximpl2 = ChaloTheme.a(composer, 6).q;
            composer.endReplaceGroup();
        } else {
            composer.startReplaceGroup(1012292907);
            composer.endReplaceGroup();
            jM4615unboximpl2 = color2.m4615unboximpl();
        }
        Color colorM4595boximpl2 = Color.m4595boximpl(jM4615unboximpl2);
        if (color == null) {
            composer.startReplaceGroup(1012296099);
            jM4615unboximpl3 = ChaloTheme.a(composer, 6).t;
            composer.endReplaceGroup();
        } else {
            composer.startReplaceGroup(1012294921);
            composer.endReplaceGroup();
            jM4615unboximpl3 = color.m4615unboximpl();
        }
        Modifier modifierBackground$default = BackgroundKt.background$default(composed, Brush.Companion.m4560linearGradientmHitzGk$default(companion2, CollectionsKt.S(colorM4595boximpl, colorM4595boximpl2, Color.m4595boximpl(jM4615unboximpl3)), Offset.m4357constructorimpl((((long) Float.floatToRawIntBits(stateAnimateFloat.getValue().floatValue())) << 32) | (((long) Float.floatToRawIntBits(0.0f)) & BodyPartID.bodyIdMax)), Offset.m4357constructorimpl((((long) Float.floatToRawIntBits((int) (((IntSize) mutableState.getValue()).m7449unboximpl() & BodyPartID.bodyIdMax))) & BodyPartID.bodyIdMax) | (((long) Float.floatToRawIntBits(stateAnimateFloat.getValue().floatValue() + ((int) (((IntSize) mutableState.getValue()).m7449unboximpl() >> 32)))) << 32)), 0, 8, (Object) null), null, 0.0f, 6, null);
        Object objRememberedValue2 = composer.rememberedValue();
        if (objRememberedValue2 == companion.getEmpty()) {
            objRememberedValue2 = new xq0(mutableState, 12);
            composer.updateRememberedValue(objRememberedValue2);
        }
        Modifier modifierOnGloballyPositioned = OnGloballyPositionedModifierKt.onGloballyPositioned(modifierBackground$default, (Function1) objRememberedValue2);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        return modifierOnGloballyPositioned;
    }

    private final Object k(Object obj, Object obj2, Object obj3) {
        RouteNativeAdUIState routeNativeAdUIState = (RouteNativeAdUIState) this.b;
        MutableState mutableState = (MutableState) this.c;
        String adUnitId = (String) obj;
        BindNativeAdResult.Success successResult = (BindNativeAdResult.Success) obj2;
        Long l = (Long) obj3;
        l.getClass();
        Intrinsics.i(adUnitId, "adUnitId");
        Intrinsics.i(successResult, "successResult");
        mutableState.setValue(Boolean.TRUE);
        routeNativeAdUIState.d.invoke(adUnitId, successResult, l);
        return Unit.f17538a;
    }

    private final Object l(Object obj, Object obj2, Object obj3) {
        FromStopAndBusIconUIState fromStopAndBusIconUIState = (FromStopAndBusIconUIState) this.b;
        BoxScope boxScope = (BoxScope) this.c;
        AnimatedVisibilityScope AnimatedVisibility = (AnimatedVisibilityScope) obj;
        Composer composer = (Composer) obj2;
        int iIntValue = ((Integer) obj3).intValue();
        Intrinsics.i(AnimatedVisibility, "$this$AnimatedVisibility");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1813500631, iIntValue, -1, "app.chalo.livetracking.routedetails.ui.routedetailsscreen.compose.FromStopAndBusIconView.<anonymous>.<anonymous> (SingleStopItem.kt:132)");
        }
        StopsListBusIconUIState stopsListBusIconUIState = fromStopAndBusIconUIState.d;
        if (stopsListBusIconUIState instanceof StopsListBusIconUIState.IconWithBusNumber) {
            composer.startReplaceGroup(-396208707);
            SingleStopItemKt.b((StopsListBusIconUIState.IconWithBusNumber) stopsListBusIconUIState, OffsetKt.m744offsetVpY3zN4$default(boxScope.align(Modifier.INSTANCE, Alignment.INSTANCE.getBottomCenter()), Dp.m7278constructorimpl(-ChaloTheme.b(composer, 0).g), 0.0f, 2, null), composer, 0);
            composer.endReplaceGroup();
        } else if (stopsListBusIconUIState instanceof StopsListBusIconUIState.OnlyIcon) {
            composer.startReplaceGroup(-395852610);
            CommonImageKt.a(((StopsListBusIconUIState.OnlyIcon) stopsListBusIconUIState).f4959a, OffsetKt.m744offsetVpY3zN4$default(boxScope.align(Modifier.INSTANCE, Alignment.INSTANCE.getBottomCenter()), 0.0f, ChaloTheme.b(composer, 0).e, 1, null), false, composer, 0, 4);
            composer.endReplaceGroup();
        } else {
            if (stopsListBusIconUIState != null) {
                throw pk0.p(composer, -982614532);
            }
            composer.startReplaceGroup(-395537960);
            composer.endReplaceGroup();
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return Unit.f17538a;
    }

    private final Object m(Object obj, Object obj2, Object obj3) {
        return SpannableExtensions_androidKt.setFontAttributes$lambda$2((Spannable) this.b, (Function4) this.c, (SpanStyle) obj, ((Integer) obj2).intValue(), ((Integer) obj3).intValue());
    }

    private final Object n(Object obj, Object obj2, Object obj3) {
        StopBasedRouteSearchViewState stopBasedRouteSearchViewState = (StopBasedRouteSearchViewState) this.b;
        Function1 function1 = (Function1) this.c;
        ColumnScope ChaloRoundedBottomSheet = (ColumnScope) obj;
        Composer composer = (Composer) obj2;
        int iIntValue = ((Integer) obj3).intValue();
        Intrinsics.i(ChaloRoundedBottomSheet, "$this$ChaloRoundedBottomSheet");
        if (composer.shouldExecute((iIntValue & 17) != 16, iIntValue & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1447553576, iIntValue, -1, "app.chalo.routeselection.ui.compose.StopBasedRouteSearchScreen.<anonymous>.<anonymous> (StopBasedRouteSearchForProductPurchaseScreen.kt:78)");
            }
            RouteSelectionBottomSheetKt.d(stopBasedRouteSearchViewState.f, stopBasedRouteSearchViewState.n, function1, composer, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return Unit.f17538a;
    }

    private final Object o(Object obj, Object obj2, Object obj3) {
        Modifier modifier = (Modifier) this.b;
        StopTripPlannerResultLoadingCardUiSpec stopTripPlannerResultLoadingCardUiSpec = (StopTripPlannerResultLoadingCardUiSpec) this.c;
        ColumnScope Card = (ColumnScope) obj;
        Composer composer = (Composer) obj2;
        int iIntValue = ((Integer) obj3).intValue();
        Intrinsics.i(Card, "$this$Card");
        if (composer.shouldExecute((iIntValue & 17) != 16, iIntValue & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1512755016, iIntValue, -1, "app.chalo.livetracking.stoptripplannerresult.compose.ResultLoadingShimmerItem.<anonymous> (StopBasedTripPlannerResultScreen.kt:388)");
            }
            ChaloPadding chaloPadding = stopTripPlannerResultLoadingCardUiSpec.d;
            float f = stopTripPlannerResultLoadingCardUiSpec.e;
            ChaloColorToken chaloColorToken = stopTripPlannerResultLoadingCardUiSpec.j;
            ChaloColorToken chaloColorToken2 = stopTripPlannerResultLoadingCardUiSpec.k;
            UIShape uIShape = stopTripPlannerResultLoadingCardUiSpec.c;
            Modifier modifierC = ChaloThemeKt.c(modifier, chaloPadding);
            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composer, 0);
            long currentCompositeKeyHashCode = ComposablesKt.getCurrentCompositeKeyHashCode(composer, 0);
            int i = (int) (currentCompositeKeyHashCode ^ (currentCompositeKeyHashCode >>> 32));
            CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composer, modifierC);
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
            Updater.m3923setimpl(composerM3915constructorimpl, modifierMaterializeModifier, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion, composerM3915constructorimpl, Integer.valueOf(i), composerM3915constructorimpl));
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
            Modifier.Companion companion2 = Modifier.INSTANCE;
            BoxKt.Box(ShimmerEffectKt.b(ClipKt.clip(SizeKt.m814height3ABfNKs(SizeKt.fillMaxWidth(companion2, 0.4f), stopTripPlannerResultLoadingCardUiSpec.f), ChaloThemeKt.d(uIShape)), Color.m4595boximpl(ChaloColorTokenKt.c(chaloColorToken2)), Color.m4595boximpl(ChaloColorTokenKt.c(chaloColorToken)), 4), composer, 0);
            ChaloSpacersKt.a(f, composer, 0);
            BoxKt.Box(ShimmerEffectKt.b(ClipKt.clip(SizeKt.m814height3ABfNKs(SizeKt.fillMaxWidth(companion2, 0.5f), stopTripPlannerResultLoadingCardUiSpec.g), ChaloThemeKt.d(uIShape)), Color.m4595boximpl(ChaloColorTokenKt.c(chaloColorToken2)), Color.m4595boximpl(ChaloColorTokenKt.c(chaloColorToken)), 4), composer, 0);
            ChaloSpacersKt.a(f, composer, 0);
            BoxKt.Box(ShimmerEffectKt.b(ClipKt.clip(SizeKt.m814height3ABfNKs(SizeKt.fillMaxWidth(companion2, 1.0f), stopTripPlannerResultLoadingCardUiSpec.h), ChaloThemeKt.d(uIShape)), Color.m4595boximpl(ChaloColorTokenKt.c(chaloColorToken2)), Color.m4595boximpl(ChaloColorTokenKt.c(chaloColorToken)), 4), composer, 0);
            ChaloSpacersKt.a(f, composer, 0);
            BoxKt.Box(ShimmerEffectKt.b(ClipKt.clip(SizeKt.m814height3ABfNKs(SizeKt.fillMaxWidth(companion2, 0.3f), stopTripPlannerResultLoadingCardUiSpec.i), ChaloThemeKt.d(uIShape)), Color.m4595boximpl(ChaloColorTokenKt.c(chaloColorToken2)), Color.m4595boximpl(ChaloColorTokenKt.c(chaloColorToken)), 4), composer, 0);
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
        Composer composer;
        int i = this.f15677a;
        int i2 = 8;
        Unit unit = Unit.f17538a;
        Object obj4 = this.c;
        Object obj5 = this.b;
        switch (i) {
            case 0:
                PremiumBusBottomSheetTypeUIState premiumBusBottomSheetTypeUIState = (PremiumBusBottomSheetTypeUIState) obj5;
                Function1 function1 = (Function1) obj4;
                ColumnScope ChaloRoundedBottomSheet = (ColumnScope) obj;
                Composer composer2 = (Composer) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                Intrinsics.i(ChaloRoundedBottomSheet, "$this$ChaloRoundedBottomSheet");
                if (composer2.shouldExecute((iIntValue & 17) != 16, iIntValue & 1)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-882180789, iIntValue, -1, "app.chalo.premiumbus.prebookedtickets.productmodification.PremiumBusProductModificationReasonsScreen.<anonymous> (PremiumBusProductModificationReasonsScreen.kt:146)");
                    }
                    if (premiumBusBottomSheetTypeUIState instanceof PremiumBusBottomSheetTypeUIState.ViewAllSlots) {
                        composer2.startReplaceGroup(-142883569);
                        PremiumBusSlotSelectionUiStateKt.w(((PremiumBusBottomSheetTypeUIState.ViewAllSlots) premiumBusBottomSheetTypeUIState).f7841a, composer2, 8);
                        composer2.endReplaceGroup();
                    } else if (Intrinsics.d(premiumBusBottomSheetTypeUIState, PremiumBusBottomSheetTypeUIState.NoSlotAvailableBottomSheet.f7840a)) {
                        composer2.startReplaceGroup(-142696949);
                        PremiumBusProductModificationReasonsScreenKt.b(null, composer2, 0);
                        composer2.endReplaceGroup();
                    } else if (premiumBusBottomSheetTypeUIState instanceof PremiumBusBottomSheetTypeUIState.AvailablePurchaseOptions) {
                        composer2.startReplaceGroup(-142538539);
                        composer2.endReplaceGroup();
                    } else if (Intrinsics.d(premiumBusBottomSheetTypeUIState, PremiumBusBottomSheetTypeUIState.NoODPairAvailableBottomSheet.f7839a)) {
                        composer2.startReplaceGroup(-142430163);
                        boolean zChanged = composer2.changed(function1);
                        Object objRememberedValue = composer2.rememberedValue();
                        if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = new yt0(function1, 23);
                            composer2.updateRememberedValue(objRememberedValue);
                        }
                        Function0 function0 = (Function0) objRememberedValue;
                        boolean zChanged2 = composer2.changed(function1);
                        Object objRememberedValue2 = composer2.rememberedValue();
                        if (zChanged2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue2 = new yt0(function1, 24);
                            composer2.updateRememberedValue(objRememberedValue2);
                        }
                        PremiumBusProductModificationReasonsScreenKt.a(function0, (Function0) objRememberedValue2, composer2, 0);
                        composer2.endReplaceGroup();
                    } else {
                        if (!(premiumBusBottomSheetTypeUIState instanceof PremiumBusBottomSheetTypeUIState.MultipleSlotSelectionCalendar) && !(premiumBusBottomSheetTypeUIState instanceof PremiumBusBottomSheetTypeUIState.NearBySlotsAvailableSelectionBottomSheet)) {
                            throw pk0.p(composer2, -1667178943);
                        }
                        composer2.startReplaceGroup(-141617902);
                        composer2.endReplaceGroup();
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer2.skipToGroupEnd();
                }
                return unit;
            case 1:
                PassengerCountSelectionBottomSheetUISpecs passengerCountSelectionBottomSheetUISpecs = (PassengerCountSelectionBottomSheetUISpecs) obj5;
                PassengerCountSelectionBottomSheetUIState passengerCountSelectionBottomSheetUIState = (PassengerCountSelectionBottomSheetUIState) obj4;
                ColumnScope ChaloRoundedCard = (ColumnScope) obj;
                Composer composer3 = (Composer) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                Intrinsics.i(ChaloRoundedCard, "$this$ChaloRoundedCard");
                if (composer3.shouldExecute((iIntValue2 & 17) != 16, iIntValue2 & 1)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(554302961, iIntValue2, -1, "app.chalo.premiumbus.ui.seatselection.compose.PassengerCountSelectionBottomSheetComposable.<anonymous>.<anonymous> (PremiumBusSeatSelectionComposables.kt:567)");
                    }
                    Modifier.Companion companion = Modifier.INSTANCE;
                    Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null);
                    ChaloPadding chaloPadding = passengerCountSelectionBottomSheetUISpecs.e;
                    float f = passengerCountSelectionBottomSheetUISpecs.d;
                    Modifier modifierC = ChaloThemeKt.c(modifierFillMaxWidth$default, chaloPadding);
                    Alignment.Companion companion2 = Alignment.INSTANCE;
                    Alignment.Vertical centerVertically = companion2.getCenterVertically();
                    Arrangement arrangement = Arrangement.INSTANCE;
                    MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(arrangement.getSpaceBetween(), centerVertically, composer3, 54);
                    long currentCompositeKeyHashCode = ComposablesKt.getCurrentCompositeKeyHashCode(composer3, 0);
                    int i3 = (int) (currentCompositeKeyHashCode ^ (currentCompositeKeyHashCode >>> 32));
                    CompositionLocalMap currentCompositionLocalMap = composer3.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composer3, modifierC);
                    ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
                    Function0<ComposeUiNode> constructor = companion3.getConstructor();
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
                    pk0.v(companion3, composerM3915constructorimpl, measurePolicyRowMeasurePolicy, composerM3915constructorimpl, currentCompositionLocalMap);
                    Updater.m3923setimpl(composerM3915constructorimpl, modifierMaterializeModifier, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion3, composerM3915constructorimpl, Integer.valueOf(i3), composerM3915constructorimpl));
                    RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
                    ChaloTextViewKt.a(i41.a(rowScopeInstance, companion, 1.0f, false, 2, null), passengerCountSelectionBottomSheetUIState.f7776a, null, null, composer3, 0, 12);
                    Alignment.Vertical centerVertically2 = companion2.getCenterVertically();
                    Modifier modifierC2 = ChaloThemeKt.c(BorderUISpecKt.a(SizeKt.wrapContentWidth$default(rowScopeInstance.weight(companion, 1.0f, false), companion2.getEnd(), false, 2, null), passengerCountSelectionBottomSheetUISpecs.f7775a), passengerCountSelectionBottomSheetUISpecs.b);
                    MeasurePolicy measurePolicyRowMeasurePolicy2 = RowKt.rowMeasurePolicy(arrangement.getStart(), centerVertically2, composer3, 48);
                    long currentCompositeKeyHashCode2 = ComposablesKt.getCurrentCompositeKeyHashCode(composer3, 0);
                    int i4 = (int) (currentCompositeKeyHashCode2 ^ (currentCompositeKeyHashCode2 >>> 32));
                    CompositionLocalMap currentCompositionLocalMap2 = composer3.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(composer3, modifierC2);
                    Function0<ComposeUiNode> constructor2 = companion3.getConstructor();
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
                    pk0.v(companion3, composerM3915constructorimpl2, measurePolicyRowMeasurePolicy2, composerM3915constructorimpl2, currentCompositionLocalMap2);
                    Updater.m3923setimpl(composerM3915constructorimpl2, modifierMaterializeModifier2, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion3, composerM3915constructorimpl2, Integer.valueOf(i4), composerM3915constructorimpl2));
                    CommonImageKt.a(passengerCountSelectionBottomSheetUIState.c, null, false, composer3, 0, 6);
                    SpacerKt.Spacer(SizeKt.m833width3ABfNKs(companion, f), composer3, 0);
                    ChaloTextViewKt.a(null, passengerCountSelectionBottomSheetUIState.b, null, null, composer3, 0, 13);
                    SpacerKt.Spacer(SizeKt.m833width3ABfNKs(companion, f), composer3, 0);
                    CommonImageKt.a(passengerCountSelectionBottomSheetUIState.d, null, false, composer3, 0, 6);
                    if (r1.k(composer3)) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer3.skipToGroupEnd();
                }
                return unit;
            case 2:
                SeatSelectionDialogTypeUIState.SeatChangeDialogTypeUIState seatChangeDialogTypeUIState = (SeatSelectionDialogTypeUIState.SeatChangeDialogTypeUIState) obj5;
                SeatChangeDialogTypeUISpecs seatChangeDialogTypeUISpecs = (SeatChangeDialogTypeUISpecs) obj4;
                ColumnScope ChaloRoundedCard2 = (ColumnScope) obj;
                Composer composer4 = (Composer) obj2;
                int iIntValue3 = ((Integer) obj3).intValue();
                Intrinsics.i(ChaloRoundedCard2, "$this$ChaloRoundedCard");
                if (composer4.shouldExecute((iIntValue3 & 17) != 16, iIntValue3 & 1)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-2119910686, iIntValue3, -1, "app.chalo.premiumbus.ui.seatselection.compose.ChangeSeatConfirmationDialogComposable.<anonymous> (PremiumBusSeatSelectionComposables.kt:260)");
                    }
                    Modifier.Companion companion4 = Modifier.INSTANCE;
                    ChaloPadding chaloPadding2 = seatChangeDialogTypeUIState.f;
                    float f2 = seatChangeDialogTypeUIState.g;
                    Modifier modifierC3 = ChaloThemeKt.c(companion4, chaloPadding2);
                    Arrangement arrangement2 = Arrangement.INSTANCE;
                    Arrangement.Vertical top = arrangement2.getTop();
                    Alignment.Companion companion5 = Alignment.INSTANCE;
                    MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(top, companion5.getStart(), composer4, 0);
                    long currentCompositeKeyHashCode3 = ComposablesKt.getCurrentCompositeKeyHashCode(composer4, 0);
                    int i5 = (int) (currentCompositeKeyHashCode3 ^ (currentCompositeKeyHashCode3 >>> 32));
                    CompositionLocalMap currentCompositionLocalMap3 = composer4.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier3 = ComposedModifierKt.materializeModifier(composer4, modifierC3);
                    ComposeUiNode.Companion companion6 = ComposeUiNode.INSTANCE;
                    Function0<ComposeUiNode> constructor3 = companion6.getConstructor();
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
                    pk0.v(companion6, composerM3915constructorimpl3, measurePolicyColumnMeasurePolicy, composerM3915constructorimpl3, currentCompositionLocalMap3);
                    Updater.m3923setimpl(composerM3915constructorimpl3, modifierMaterializeModifier3, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion6, composerM3915constructorimpl3, Integer.valueOf(i5), composerM3915constructorimpl3));
                    ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
                    Modifier modifierFillMaxWidth$default2 = SizeKt.fillMaxWidth$default(companion4, 0.0f, 1, null);
                    MeasurePolicy measurePolicyRowMeasurePolicy3 = RowKt.rowMeasurePolicy(arrangement2.getStart(), companion5.getTop(), composer4, 48);
                    long currentCompositeKeyHashCode4 = ComposablesKt.getCurrentCompositeKeyHashCode(composer4, 0);
                    int i6 = (int) (currentCompositeKeyHashCode4 ^ (currentCompositeKeyHashCode4 >>> 32));
                    CompositionLocalMap currentCompositionLocalMap4 = composer4.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier4 = ComposedModifierKt.materializeModifier(composer4, modifierFillMaxWidth$default2);
                    Function0<ComposeUiNode> constructor4 = companion6.getConstructor();
                    if (composer4.getApplier() == null) {
                        ComposablesKt.invalidApplier();
                    }
                    composer4.startReusableNode();
                    if (composer4.getInserting()) {
                        composer4.createNode(constructor4);
                    } else {
                        composer4.useNode();
                    }
                    Composer composerM3915constructorimpl4 = Updater.m3915constructorimpl(composer4);
                    pk0.v(companion6, composerM3915constructorimpl4, measurePolicyRowMeasurePolicy3, composerM3915constructorimpl4, currentCompositionLocalMap4);
                    Updater.m3923setimpl(composerM3915constructorimpl4, modifierMaterializeModifier4, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion6, composerM3915constructorimpl4, Integer.valueOf(i6), composerM3915constructorimpl4));
                    ChaloTextViewKt.a(i41.a(RowScopeInstance.INSTANCE, companion4, 1.0f, false, 2, null), seatChangeDialogTypeUIState.b, null, null, composer4, 0, 12);
                    ChaloSpacersKt.y(composer4, 0);
                    CommonImageKt.a(seatChangeDialogTypeUIState.e, null, false, composer4, 0, 6);
                    composer4.endNode();
                    SpacerKt.Spacer(SizeKt.m814height3ABfNKs(companion4, seatChangeDialogTypeUISpecs.c), composer4, 0);
                    ChaloFilledButtonKt.a(0, 0, composer4, SizeKt.m814height3ABfNKs(SizeKt.fillMaxWidth$default(companion4, 0.0f, 1, null), f2), seatChangeDialogTypeUIState.c);
                    SpacerKt.Spacer(SizeKt.m814height3ABfNKs(companion4, seatChangeDialogTypeUISpecs.d), composer4, 0);
                    if (b3.s(0, 0, composer4, SizeKt.m814height3ABfNKs(SizeKt.fillMaxWidth$default(companion4, 0.0f, 1, null), f2), seatChangeDialogTypeUIState.d)) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer4.skipToGroupEnd();
                }
                return unit;
            case 3:
                PremiumBusSeatSelectionBottomSheetUIState premiumBusSeatSelectionBottomSheetUIState = (PremiumBusSeatSelectionBottomSheetUIState) obj5;
                Function0 function2 = (Function0) obj4;
                ColumnScope ChaloRoundedBottomSheet2 = (ColumnScope) obj;
                Composer composer5 = (Composer) obj2;
                int iIntValue4 = ((Integer) obj3).intValue();
                Intrinsics.i(ChaloRoundedBottomSheet2, "$this$ChaloRoundedBottomSheet");
                if (composer5.shouldExecute((iIntValue4 & 17) != 16, iIntValue4 & 1)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1242418954, iIntValue4, -1, "app.chalo.premiumbus.ui.seatselection.compose.SeatSelectionMainScreen.<anonymous>.<anonymous>.<anonymous> (PremiumBusSeatSelectionMainScreen.kt:333)");
                    }
                    if (premiumBusSeatSelectionBottomSheetUIState instanceof PremiumBusSeatSelectionBottomSheetUIState.GenderConfirmationBottomSheet) {
                        composer5.startReplaceGroup(1125272040);
                        PremiumBusSeatSelectionComposablesKt.b(((PremiumBusSeatSelectionBottomSheetUIState.GenderConfirmationBottomSheet) premiumBusSeatSelectionBottomSheetUIState).f7777a, function2, composer5, 0);
                        composer5.endReplaceGroup();
                    } else if (premiumBusSeatSelectionBottomSheetUIState instanceof PremiumBusSeatSelectionBottomSheetUIState.WomenReservedSeatsChoiceBottomSheet) {
                        composer5.startReplaceGroup(1125730375);
                        PremiumBusSeatSelectionComposablesKt.m(((PremiumBusSeatSelectionBottomSheetUIState.WomenReservedSeatsChoiceBottomSheet) premiumBusSeatSelectionBottomSheetUIState).f7779a, composer5, 0);
                        composer5.endReplaceGroup();
                    } else {
                        if (premiumBusSeatSelectionBottomSheetUIState instanceof PremiumBusSeatSelectionBottomSheetUIState.WomenReservedSeatsUnavailableBottomSheet) {
                            composer5.startReplaceGroup(1126069670);
                            PremiumBusSeatSelectionComposablesKt.n(composer5, 0);
                            throw null;
                        }
                        if (!(premiumBusSeatSelectionBottomSheetUIState instanceof PremiumBusSeatSelectionBottomSheetUIState.PassengerCountSelectionBottomSheet)) {
                            throw pk0.p(composer5, 36295674);
                        }
                        composer5.startReplaceGroup(1126344361);
                        PassengerCountSelectionBottomSheetUIState passengerCountSelectionBottomSheetUIState2 = ((PremiumBusSeatSelectionBottomSheetUIState.PassengerCountSelectionBottomSheet) premiumBusSeatSelectionBottomSheetUIState).f7778a;
                        UIShape.Rectangle rectangle = UIShape.f1926a;
                        PremiumBusSeatSelectionComposablesKt.h(passengerCountSelectionBottomSheetUIState2, composer5, 0);
                        composer5.endReplaceGroup();
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer5.skipToGroupEnd();
                }
                return unit;
            case 4:
                NearBySlotsCardUISpecs nearBySlotsCardUISpecs = (NearBySlotsCardUISpecs) obj5;
                NearBySlotsCardUIState nearBySlotsCardUIState = (NearBySlotsCardUIState) obj4;
                ColumnScope Card = (ColumnScope) obj;
                Composer composer6 = (Composer) obj2;
                int iIntValue5 = ((Integer) obj3).intValue();
                Intrinsics.i(Card, "$this$Card");
                if (composer6.shouldExecute((iIntValue5 & 17) != 16, iIntValue5 & 1)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1280992964, iIntValue5, -1, "app.chalo.premiumbus.ui.slotselection.compose.NearByCardListUI.<anonymous> (PremiumBusSlotSelectionScreen.kt:618)");
                    }
                    Modifier.Companion companion7 = Modifier.INSTANCE;
                    Modifier modifierFillMaxWidth$default3 = SizeKt.fillMaxWidth$default(companion7, 0.0f, 1, null);
                    Arrangement arrangement3 = Arrangement.INSTANCE;
                    Arrangement.Vertical top2 = arrangement3.getTop();
                    Alignment.Companion companion8 = Alignment.INSTANCE;
                    MeasurePolicy measurePolicyColumnMeasurePolicy2 = ColumnKt.columnMeasurePolicy(top2, companion8.getStart(), composer6, 0);
                    long currentCompositeKeyHashCode5 = ComposablesKt.getCurrentCompositeKeyHashCode(composer6, 0);
                    int i7 = (int) ((currentCompositeKeyHashCode5 >>> 32) ^ currentCompositeKeyHashCode5);
                    CompositionLocalMap currentCompositionLocalMap5 = composer6.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier5 = ComposedModifierKt.materializeModifier(composer6, modifierFillMaxWidth$default3);
                    ComposeUiNode.Companion companion9 = ComposeUiNode.INSTANCE;
                    Function0<ComposeUiNode> constructor5 = companion9.getConstructor();
                    if (composer6.getApplier() == null) {
                        ComposablesKt.invalidApplier();
                    }
                    composer6.startReusableNode();
                    if (composer6.getInserting()) {
                        composer6.createNode(constructor5);
                    } else {
                        composer6.useNode();
                    }
                    Composer composerM3915constructorimpl5 = Updater.m3915constructorimpl(composer6);
                    pk0.v(companion9, composerM3915constructorimpl5, measurePolicyColumnMeasurePolicy2, composerM3915constructorimpl5, currentCompositionLocalMap5);
                    Updater.m3923setimpl(composerM3915constructorimpl5, modifierMaterializeModifier5, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion9, composerM3915constructorimpl5, Integer.valueOf(i7), composerM3915constructorimpl5));
                    ColumnScopeInstance columnScopeInstance2 = ColumnScopeInstance.INSTANCE;
                    Modifier modifierC4 = ChaloThemeKt.c(SizeKt.fillMaxWidth$default(companion7, 0.0f, 1, null), nearBySlotsCardUISpecs.f7808a);
                    MeasurePolicy measurePolicyRowMeasurePolicy4 = RowKt.rowMeasurePolicy(arrangement3.getStart(), companion8.getTop(), composer6, 0);
                    long currentCompositeKeyHashCode6 = ComposablesKt.getCurrentCompositeKeyHashCode(composer6, 0);
                    int i8 = (int) (currentCompositeKeyHashCode6 ^ (currentCompositeKeyHashCode6 >>> 32));
                    CompositionLocalMap currentCompositionLocalMap6 = composer6.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier6 = ComposedModifierKt.materializeModifier(composer6, modifierC4);
                    Function0<ComposeUiNode> constructor6 = companion9.getConstructor();
                    if (composer6.getApplier() == null) {
                        ComposablesKt.invalidApplier();
                    }
                    composer6.startReusableNode();
                    if (composer6.getInserting()) {
                        composer6.createNode(constructor6);
                    } else {
                        composer6.useNode();
                    }
                    Composer composerM3915constructorimpl6 = Updater.m3915constructorimpl(composer6);
                    pk0.v(companion9, composerM3915constructorimpl6, measurePolicyRowMeasurePolicy4, composerM3915constructorimpl6, currentCompositionLocalMap6);
                    Updater.m3923setimpl(composerM3915constructorimpl6, modifierMaterializeModifier6, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion9, composerM3915constructorimpl6, Integer.valueOf(i8), composerM3915constructorimpl6));
                    RowScopeInstance rowScopeInstance2 = RowScopeInstance.INSTANCE;
                    ChaloTextViewKt.a(null, nearBySlotsCardUIState.b, null, null, composer6, 0, 13);
                    SpacerKt.Spacer(i41.a(rowScopeInstance2, companion7, 1.0f, false, 2, null), composer6, 0);
                    CommonImageKt.a(nearBySlotsCardUIState.d, null, false, composer6, 0, 6);
                    composer6.endNode();
                    if (nearBySlotsCardUIState.c == null) {
                        composer6.startReplaceGroup(-1892907875);
                    } else {
                        composer6.startReplaceGroup(-1892907874);
                        Modifier modifierFillMaxWidth$default4 = SizeKt.fillMaxWidth$default(companion7, 0.0f, 1, null);
                        PaddingValues paddingValuesM779PaddingValuesYgX7TsA$default = PaddingKt.m779PaddingValuesYgX7TsA$default(ChaloTheme.b(composer6, 0).h, 0.0f, 2, null);
                        boolean zChangedInstance = composer6.changedInstance(nearBySlotsCardUIState);
                        Object objRememberedValue3 = composer6.rememberedValue();
                        if (zChangedInstance || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue3 = new et0(nearBySlotsCardUIState, 25);
                            composer6.updateRememberedValue(objRememberedValue3);
                        }
                        LazyDslKt.LazyRow(modifierFillMaxWidth$default4, null, paddingValuesM779PaddingValuesYgX7TsA$default, false, null, null, null, false, null, (Function1) objRememberedValue3, composer6, 6, TypedValues.PositionType.TYPE_PERCENT_X);
                    }
                    composer6.endReplaceGroup();
                    ChaloSpacersKt.o(composer6, 0);
                    composer6.endNode();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer6.skipToGroupEnd();
                }
                return unit;
            case 5:
                NearBySlotsAvailableSelectionBottomSheetUISpecs nearBySlotsAvailableSelectionBottomSheetUISpecs = (NearBySlotsAvailableSelectionBottomSheetUISpecs) obj5;
                NearBySlotsAvailableSelectionBottomSheetUIState nearBySlotsAvailableSelectionBottomSheetUIState = (NearBySlotsAvailableSelectionBottomSheetUIState) obj4;
                LazyItemScope item = (LazyItemScope) obj;
                Composer composer7 = (Composer) obj2;
                int iIntValue6 = ((Integer) obj3).intValue();
                Intrinsics.i(item, "$this$item");
                if (composer7.shouldExecute((iIntValue6 & 17) != 16, iIntValue6 & 1)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1362656078, iIntValue6, -1, "app.chalo.premiumbus.ui.slotselection.compose.NearBySlotsAvailableSelectionUI.<anonymous>.<anonymous>.<anonymous>.<anonymous> (PremiumBusSlotSelectionScreen.kt:557)");
                    }
                    Modifier.Companion companion10 = Modifier.INSTANCE;
                    Modifier modifierFillMaxWidth$default5 = SizeKt.fillMaxWidth$default(companion10, 0.0f, 1, null);
                    Arrangement arrangement4 = Arrangement.INSTANCE;
                    Arrangement.Vertical top3 = arrangement4.getTop();
                    Alignment.Companion companion11 = Alignment.INSTANCE;
                    MeasurePolicy measurePolicyColumnMeasurePolicy3 = ColumnKt.columnMeasurePolicy(top3, companion11.getStart(), composer7, 0);
                    long currentCompositeKeyHashCode7 = ComposablesKt.getCurrentCompositeKeyHashCode(composer7, 0);
                    int i9 = (int) (currentCompositeKeyHashCode7 ^ (currentCompositeKeyHashCode7 >>> 32));
                    CompositionLocalMap currentCompositionLocalMap7 = composer7.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier7 = ComposedModifierKt.materializeModifier(composer7, modifierFillMaxWidth$default5);
                    ComposeUiNode.Companion companion12 = ComposeUiNode.INSTANCE;
                    Function0<ComposeUiNode> constructor7 = companion12.getConstructor();
                    if (composer7.getApplier() == null) {
                        ComposablesKt.invalidApplier();
                    }
                    composer7.startReusableNode();
                    if (composer7.getInserting()) {
                        composer7.createNode(constructor7);
                    } else {
                        composer7.useNode();
                    }
                    Composer composerM3915constructorimpl7 = Updater.m3915constructorimpl(composer7);
                    pk0.v(companion12, composerM3915constructorimpl7, measurePolicyColumnMeasurePolicy3, composerM3915constructorimpl7, currentCompositionLocalMap7);
                    Updater.m3923setimpl(composerM3915constructorimpl7, modifierMaterializeModifier7, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion12, composerM3915constructorimpl7, Integer.valueOf(i9), composerM3915constructorimpl7));
                    ColumnScopeInstance columnScopeInstance3 = ColumnScopeInstance.INSTANCE;
                    Modifier modifierFillMaxWidth$default6 = SizeKt.fillMaxWidth$default(companion10, 0.0f, 1, null);
                    MeasurePolicy measurePolicyRowMeasurePolicy5 = RowKt.rowMeasurePolicy(arrangement4.getStart(), companion11.getTop(), composer7, 48);
                    long currentCompositeKeyHashCode8 = ComposablesKt.getCurrentCompositeKeyHashCode(composer7, 0);
                    int i10 = (int) (currentCompositeKeyHashCode8 ^ (currentCompositeKeyHashCode8 >>> 32));
                    CompositionLocalMap currentCompositionLocalMap8 = composer7.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier8 = ComposedModifierKt.materializeModifier(composer7, modifierFillMaxWidth$default6);
                    Function0<ComposeUiNode> constructor8 = companion12.getConstructor();
                    if (composer7.getApplier() == null) {
                        ComposablesKt.invalidApplier();
                    }
                    composer7.startReusableNode();
                    if (composer7.getInserting()) {
                        composer7.createNode(constructor8);
                    } else {
                        composer7.useNode();
                    }
                    Composer composerM3915constructorimpl8 = Updater.m3915constructorimpl(composer7);
                    pk0.v(companion12, composerM3915constructorimpl8, measurePolicyRowMeasurePolicy5, composerM3915constructorimpl8, currentCompositionLocalMap8);
                    Updater.m3923setimpl(composerM3915constructorimpl8, modifierMaterializeModifier8, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion12, composerM3915constructorimpl8, Integer.valueOf(i10), composerM3915constructorimpl8));
                    ChaloTextViewKt.a(i41.a(RowScopeInstance.INSTANCE, companion10, 1.0f, false, 2, null), nearBySlotsAvailableSelectionBottomSheetUIState.b, null, null, composer7, 0, 12);
                    ChaloSpacersKt.w(composer7, 0);
                    CommonImageKt.a(nearBySlotsAvailableSelectionBottomSheetUIState.g, null, false, composer7, 0, 6);
                    composer7.endNode();
                    SpacerKt.Spacer(SizeKt.m814height3ABfNKs(companion10, nearBySlotsAvailableSelectionBottomSheetUISpecs.b), composer7, 0);
                    ChaloTextViewKt.a(null, nearBySlotsAvailableSelectionBottomSheetUIState.c, null, null, composer7, 0, 13);
                    SpacerKt.Spacer(SizeKt.m814height3ABfNKs(companion10, nearBySlotsAvailableSelectionBottomSheetUISpecs.c), composer7, 0);
                    composer7.endNode();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer7.skipToGroupEnd();
                }
                return unit;
            case 6:
                PremiumBusDefaultOptionUIState premiumBusDefaultOptionUIState = (PremiumBusDefaultOptionUIState) obj5;
                PremiumBusDefaultOptionUISpecs premiumBusDefaultOptionUISpecs = (PremiumBusDefaultOptionUISpecs) obj4;
                ColumnScope Card2 = (ColumnScope) obj;
                Composer composer8 = (Composer) obj2;
                int iIntValue7 = ((Integer) obj3).intValue();
                Intrinsics.i(Card2, "$this$Card");
                if (composer8.shouldExecute((iIntValue7 & 17) != 16, iIntValue7 & 1)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(449329622, iIntValue7, -1, "app.chalo.premiumbus.ui.slotselection.PremiumBusDefaultOptionUI.<anonymous> (PremiumBusSlotSelectionUiState.kt:1156)");
                    }
                    ChaloTextViewKt.a(SizeKt.fillMaxWidth$default(ChaloThemeKt.c(Modifier.INSTANCE, premiumBusDefaultOptionUISpecs.f7842a), 0.0f, 1, null), premiumBusDefaultOptionUIState.b, null, null, composer8, 0, 12);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer8.skipToGroupEnd();
                }
                return unit;
            case 7:
                ViewAllSlotsBottomSheetUIState viewAllSlotsBottomSheetUIState = (ViewAllSlotsBottomSheetUIState) obj5;
                ViewAllSlotsBottomSheetUISpec viewAllSlotsBottomSheetUISpec = (ViewAllSlotsBottomSheetUISpec) obj4;
                LazyItemScope item2 = (LazyItemScope) obj;
                Composer composer9 = (Composer) obj2;
                int iIntValue8 = ((Integer) obj3).intValue();
                Intrinsics.i(item2, "$this$item");
                if (composer9.shouldExecute((iIntValue8 & 17) != 16, iIntValue8 & 1)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1005120174, iIntValue8, -1, "app.chalo.premiumbus.ui.slotselection.ViewAllSlotsBottomSheet.<anonymous>.<anonymous>.<anonymous>.<anonymous> (PremiumBusSlotSelectionUiState.kt:1248)");
                    }
                    TextUIState.ChaloTextUIState chaloTextUIState = viewAllSlotsBottomSheetUIState.b;
                    Modifier.Companion companion13 = Modifier.INSTANCE;
                    ChaloTextViewKt.a(ChaloThemeKt.c(companion13, viewAllSlotsBottomSheetUISpec.f7904a), chaloTextUIState, null, null, composer9, 0, 12);
                    if (gf.x(companion13, viewAllSlotsBottomSheetUISpec.c, composer9, 0)) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer9.skipToGroupEnd();
                }
                return unit;
            case 8:
                PassPurchaseNudgeCardUISpecs passPurchaseNudgeCardUISpecs = (PassPurchaseNudgeCardUISpecs) obj5;
                PassPurchaseNudgeCardUIState passPurchaseNudgeCardUIState = (PassPurchaseNudgeCardUIState) obj4;
                ColumnScope Card3 = (ColumnScope) obj;
                Composer composer10 = (Composer) obj2;
                int iIntValue9 = ((Integer) obj3).intValue();
                Intrinsics.i(Card3, "$this$Card");
                if (composer10.shouldExecute((iIntValue9 & 17) != 16, iIntValue9 & 1)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(2014924428, iIntValue9, -1, "app.chalo.premiumbus.ui.slotselection.PbPrebookingBuyPassNudgeCard.<anonymous> (PremiumBusSlotSelectionUiState.kt:1459)");
                    }
                    Modifier.Companion companion14 = Modifier.INSTANCE;
                    Modifier modifierBackground$default = BackgroundKt.background$default(SizeKt.fillMaxWidth$default(companion14, 0.0f, 1, null), Brush.Companion.m4558horizontalGradient8A3gB4$default(Brush.INSTANCE, CollectionsKt.S(Color.m4595boximpl(ChaloColorTokenKt.c(passPurchaseNudgeCardUISpecs.e)), Color.m4595boximpl(ChaloColorTokenKt.c(passPurchaseNudgeCardUISpecs.f))), 0.0f, 0.0f, 0, 14, (Object) null), null, 0.0f, 6, null);
                    Arrangement arrangement5 = Arrangement.INSTANCE;
                    Arrangement.Horizontal start = arrangement5.getStart();
                    Alignment.Companion companion15 = Alignment.INSTANCE;
                    MeasurePolicy measurePolicyRowMeasurePolicy6 = RowKt.rowMeasurePolicy(start, companion15.getTop(), composer10, 0);
                    long currentCompositeKeyHashCode9 = ComposablesKt.getCurrentCompositeKeyHashCode(composer10, 0);
                    int i11 = (int) (currentCompositeKeyHashCode9 ^ (currentCompositeKeyHashCode9 >>> 32));
                    CompositionLocalMap currentCompositionLocalMap9 = composer10.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier9 = ComposedModifierKt.materializeModifier(composer10, modifierBackground$default);
                    ComposeUiNode.Companion companion16 = ComposeUiNode.INSTANCE;
                    Function0<ComposeUiNode> constructor9 = companion16.getConstructor();
                    if (composer10.getApplier() == null) {
                        ComposablesKt.invalidApplier();
                    }
                    composer10.startReusableNode();
                    if (composer10.getInserting()) {
                        composer10.createNode(constructor9);
                    } else {
                        composer10.useNode();
                    }
                    Composer composerM3915constructorimpl9 = Updater.m3915constructorimpl(composer10);
                    pk0.v(companion16, composerM3915constructorimpl9, measurePolicyRowMeasurePolicy6, composerM3915constructorimpl9, currentCompositionLocalMap9);
                    Updater.m3923setimpl(composerM3915constructorimpl9, modifierMaterializeModifier9, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion16, composerM3915constructorimpl9, Integer.valueOf(i11), composerM3915constructorimpl9));
                    RowScopeInstance rowScopeInstance3 = RowScopeInstance.INSTANCE;
                    Modifier modifierFillMaxWidth = SizeKt.fillMaxWidth(ChaloThemeKt.c(companion14, passPurchaseNudgeCardUISpecs.f7830a), 0.8f);
                    MeasurePolicy measurePolicyColumnMeasurePolicy4 = ColumnKt.columnMeasurePolicy(arrangement5.getTop(), companion15.getStart(), composer10, 0);
                    long currentCompositeKeyHashCode10 = ComposablesKt.getCurrentCompositeKeyHashCode(composer10, 0);
                    int i12 = (int) (currentCompositeKeyHashCode10 ^ (currentCompositeKeyHashCode10 >>> 32));
                    CompositionLocalMap currentCompositionLocalMap10 = composer10.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier10 = ComposedModifierKt.materializeModifier(composer10, modifierFillMaxWidth);
                    Function0<ComposeUiNode> constructor10 = companion16.getConstructor();
                    if (composer10.getApplier() == null) {
                        ComposablesKt.invalidApplier();
                    }
                    composer10.startReusableNode();
                    if (composer10.getInserting()) {
                        composer10.createNode(constructor10);
                    } else {
                        composer10.useNode();
                    }
                    Composer composerM3915constructorimpl10 = Updater.m3915constructorimpl(composer10);
                    pk0.v(companion16, composerM3915constructorimpl10, measurePolicyColumnMeasurePolicy4, composerM3915constructorimpl10, currentCompositionLocalMap10);
                    Updater.m3923setimpl(composerM3915constructorimpl10, modifierMaterializeModifier10, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion16, composerM3915constructorimpl10, Integer.valueOf(i12), composerM3915constructorimpl10));
                    ColumnScopeInstance columnScopeInstance4 = ColumnScopeInstance.INSTANCE;
                    ChaloSpacersKt.o(composer10, 0);
                    ChaloTextViewKt.a(null, passPurchaseNudgeCardUIState.b, null, null, composer10, 0, 13);
                    ChaloSpacersKt.m(composer10, 0);
                    TextWithFilledLeadingIconKt.a(null, passPurchaseNudgeCardUIState.d, composer10, 64);
                    ChaloSpacersKt.o(composer10, 0);
                    composer10.endNode();
                    ImageUIState imageUIState = passPurchaseNudgeCardUIState.c;
                    if (imageUIState == null) {
                        composer10.startReplaceGroup(-320612594);
                    } else {
                        composer10.startReplaceGroup(-320612593);
                        CommonImageKt.a(imageUIState, ChaloThemeKt.c(companion14, passPurchaseNudgeCardUISpecs.c), false, composer10, 0, 4);
                    }
                    composer10.endReplaceGroup();
                    composer10.endNode();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer10.skipToGroupEnd();
                }
                return unit;
            case 9:
                PremiumBusPassOptionUISpecs premiumBusPassOptionUISpecs = (PremiumBusPassOptionUISpecs) obj5;
                PremiumBusPassOptionUIState premiumBusPassOptionUIState = (PremiumBusPassOptionUIState) obj4;
                ColumnScope ChaloRoundedCard3 = (ColumnScope) obj;
                Composer composer11 = (Composer) obj2;
                int iIntValue10 = ((Integer) obj3).intValue();
                Intrinsics.i(ChaloRoundedCard3, "$this$ChaloRoundedCard");
                if (composer11.shouldExecute((iIntValue10 & 17) != 16, iIntValue10 & 1)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(567336795, iIntValue10, -1, "app.chalo.premiumbus.ui.slotselection.PremiumBusPassOptionUI.<anonymous> (PremiumBusSlotSelectionUiState.kt:1184)");
                    }
                    Modifier.Companion companion17 = Modifier.INSTANCE;
                    Modifier modifierC5 = ChaloThemeKt.c(SizeKt.fillMaxWidth$default(companion17, 0.0f, 1, null), premiumBusPassOptionUISpecs.f7847a);
                    MeasurePolicy measurePolicyColumnMeasurePolicy5 = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composer11, 0);
                    long currentCompositeKeyHashCode11 = ComposablesKt.getCurrentCompositeKeyHashCode(composer11, 0);
                    int i13 = (int) (currentCompositeKeyHashCode11 ^ (currentCompositeKeyHashCode11 >>> 32));
                    CompositionLocalMap currentCompositionLocalMap11 = composer11.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier11 = ComposedModifierKt.materializeModifier(composer11, modifierC5);
                    ComposeUiNode.Companion companion18 = ComposeUiNode.INSTANCE;
                    Function0<ComposeUiNode> constructor11 = companion18.getConstructor();
                    if (composer11.getApplier() == null) {
                        ComposablesKt.invalidApplier();
                    }
                    composer11.startReusableNode();
                    if (composer11.getInserting()) {
                        composer11.createNode(constructor11);
                    } else {
                        composer11.useNode();
                    }
                    Composer composerM3915constructorimpl11 = Updater.m3915constructorimpl(composer11);
                    pk0.v(companion18, composerM3915constructorimpl11, measurePolicyColumnMeasurePolicy5, composerM3915constructorimpl11, currentCompositionLocalMap11);
                    Updater.m3923setimpl(composerM3915constructorimpl11, modifierMaterializeModifier11, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion18, composerM3915constructorimpl11, Integer.valueOf(i13), composerM3915constructorimpl11));
                    ColumnScopeInstance columnScopeInstance5 = ColumnScopeInstance.INSTANCE;
                    ChaloTextViewKt.a(null, premiumBusPassOptionUIState.b, null, null, composer11, 0, 13);
                    SpacerKt.Spacer(SizeKt.m814height3ABfNKs(companion17, premiumBusPassOptionUISpecs.d), composer11, 0);
                    ChaloTextViewKt.a(null, premiumBusPassOptionUIState.c, null, null, composer11, 0, 13);
                    PassOptionAdditionalInfo passOptionAdditionalInfo = premiumBusPassOptionUIState.d;
                    if (passOptionAdditionalInfo == null) {
                        composer11.startReplaceGroup(1889919372);
                        composer11.endReplaceGroup();
                        composer = composer11;
                    } else {
                        composer11.startReplaceGroup(1889919373);
                        SpacerKt.Spacer(SizeKt.m814height3ABfNKs(companion17, premiumBusPassOptionUISpecs.e), composer11, 0);
                        composer = composer11;
                        ChaloTextViewKt.a(ChaloThemeKt.c(BackgroundKt.m263backgroundbw27NRU(SizeKt.fillMaxWidth$default(companion17, 0.0f, 1, null), ChaloColorTokenKt.c(passOptionAdditionalInfo.b), ChaloThemeKt.d(passOptionAdditionalInfo.c)), passOptionAdditionalInfo.d), passOptionAdditionalInfo.f7829a, null, null, composer, 0, 12);
                        composer.endReplaceGroup();
                    }
                    composer.endNode();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer11.skipToGroupEnd();
                }
                return unit;
            case 10:
                ProductSelectionProductsListSectionUIState productSelectionProductsListSectionUIState = (ProductSelectionProductsListSectionUIState) obj5;
                Modifier modifier = (Modifier) obj4;
                LazyItemScope item3 = (LazyItemScope) obj;
                Composer composer12 = (Composer) obj2;
                int iIntValue11 = ((Integer) obj3).intValue();
                Intrinsics.i(item3, "$this$item");
                if (composer12.shouldExecute((iIntValue11 & 17) != 16, iIntValue11 & 1)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-2081336969, iIntValue11, -1, "app.chalo.productpurchase.productselection.ui.productSelectionSection.<anonymous> (ProductSelectionScreen.kt:131)");
                    }
                    ProductSelectionScreenKt.i(productSelectionProductsListSectionUIState.f8689a, ChaloThemeKt.c(SizeKt.fillMaxWidth$default(modifier, 0.0f, 1, null), productSelectionProductsListSectionUIState.e.b), composer12, 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer12.skipToGroupEnd();
                }
                return unit;
            case 11:
                ProductAnnouncementTextUIState productAnnouncementTextUIState = (ProductAnnouncementTextUIState) obj5;
                ProductSelectionProductsListSectionUIState productSelectionProductsListSectionUIState2 = (ProductSelectionProductsListSectionUIState) obj4;
                LazyItemScope item4 = (LazyItemScope) obj;
                Composer composer13 = (Composer) obj2;
                int iIntValue12 = ((Integer) obj3).intValue();
                Intrinsics.i(item4, "$this$item");
                if (composer13.shouldExecute((iIntValue12 & 17) != 16, iIntValue12 & 1)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(48742487, iIntValue12, -1, "app.chalo.productpurchase.productselection.ui.productSelectionSection.<anonymous>.<anonymous> (ProductSelectionScreen.kt:147)");
                    }
                    ProductSelectionScreenKt.d(productAnnouncementTextUIState, ChaloThemeKt.c(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), productSelectionProductsListSectionUIState2.e.f8688a), composer13, 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer13.skipToGroupEnd();
                }
                return unit;
            case 12:
                ProfileScreenBottomSheetType profileScreenBottomSheetType = (ProfileScreenBottomSheetType) obj5;
                Function1 function3 = (Function1) obj4;
                ColumnScope ChaloRoundedBottomSheet3 = (ColumnScope) obj;
                Composer composer14 = (Composer) obj2;
                int iIntValue13 = ((Integer) obj3).intValue();
                Intrinsics.i(ChaloRoundedBottomSheet3, "$this$ChaloRoundedBottomSheet");
                if (composer14.shouldExecute((iIntValue13 & 17) != 16, iIntValue13 & 1)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(594649482, iIntValue13, -1, "app.chalo.home.ui.profile.ProfileScreenUI.<anonymous>.<anonymous> (ProfileScreenUI.kt:89)");
                    }
                    if (Intrinsics.d(profileScreenBottomSheetType, ProfileScreenBottomSheetType.ChaloWalletIntroBottomSheet.f3595a)) {
                        composer14.startReplaceGroup(-1537258572);
                        IconType iconType = IconType.WALLET_INTRODUCTION;
                        String strC = StringResourcesHelperKt.c(StringEnum.WALLET_INTRODUCTION, new Object[0], composer14, 6);
                        String strC2 = StringResourcesHelperKt.c(StringEnum.WALLET_INTRODUCTION_MSG, new Object[0], composer14, 6);
                        String strC3 = StringResourcesHelperKt.c(StringEnum.OKAY, new Object[0], composer14, 6);
                        boolean zChanged3 = composer14.changed(function3);
                        Object objRememberedValue4 = composer14.rememberedValue();
                        if (zChanged3 || objRememberedValue4 == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue4 = new lx0(function3, i2);
                            composer14.updateRememberedValue(objRememberedValue4);
                        }
                        Function0 function4 = (Function0) objRememberedValue4;
                        Object objRememberedValue5 = composer14.rememberedValue();
                        if (objRememberedValue5 == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue5 = new wb(i2);
                            composer14.updateRememberedValue(objRememberedValue5);
                        }
                        CommonTemplateBottomSheetKt.a(null, iconType, strC, strC2, strC3, null, function4, (Function0) objRememberedValue5, composer14, 12582960, 33);
                        composer14.endReplaceGroup();
                    } else {
                        if (!(profileScreenBottomSheetType instanceof ProfileScreenBottomSheetType.AccountSettingsBottomSheet)) {
                            throw pk0.p(composer14, 227503571);
                        }
                        composer14.startReplaceGroup(-1536576665);
                        List list = ((ProfileScreenBottomSheetType.AccountSettingsBottomSheet) profileScreenBottomSheetType).f3594a;
                        boolean zChanged4 = composer14.changed(function3);
                        Object objRememberedValue6 = composer14.rememberedValue();
                        if (zChanged4 || objRememberedValue6 == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue6 = new lx0(function3, 9);
                            composer14.updateRememberedValue(objRememberedValue6);
                        }
                        Function0 function5 = (Function0) objRememberedValue6;
                        boolean zChanged5 = composer14.changed(function3);
                        Object objRememberedValue7 = composer14.rememberedValue();
                        if (zChanged5 || objRememberedValue7 == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue7 = new sn0(function3, 24);
                            composer14.updateRememberedValue(objRememberedValue7);
                        }
                        ProfileScreenUIKt.a(0, composer14, list, function5, (Function1) objRememberedValue7);
                        composer14.endReplaceGroup();
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer14.skipToGroupEnd();
                }
                return unit;
            case 13:
                List list2 = (List) obj5;
                PagerState pagerState = (PagerState) obj4;
                ColumnScope ChaloRoundedCard4 = (ColumnScope) obj;
                Composer composer15 = (Composer) obj2;
                int iIntValue14 = ((Integer) obj3).intValue();
                Intrinsics.i(ChaloRoundedCard4, "$this$ChaloRoundedCard");
                if (composer15.shouldExecute((iIntValue14 & 17) != 16, iIntValue14 & 1)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1276621415, iIntValue14, -1, "app.chalo.wallet.ui.promotionscardcontainer.PromotionsSection.<anonymous>.<anonymous> (PromotionsCardContainer.kt:60)");
                    }
                    PromotionsCardContainerKt.a(pagerState, list2.size(), composer15, 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer15.skipToGroupEnd();
                }
                return unit;
            case 14:
                return a(obj, obj2, obj3);
            case 15:
                return c(obj, obj2, obj3);
            case 16:
                return d(obj, obj2, obj3);
            case 17:
                String adUnitId = (String) obj;
                BindNativeAdResult.Success successResult = (BindNativeAdResult.Success) obj2;
                Long l = (Long) obj3;
                l.getClass();
                float f3 = RouteDetailsStopsListUIStateFactory.c;
                Intrinsics.i(adUnitId, "adUnitId");
                Intrinsics.i(successResult, "successResult");
                ((Function1) obj4).invoke(new RouteDetailsIntent.NativeAdLoaded(((RouteDetailsStopUiModel) obj5).f4410a, adUnitId, successResult, l));
                return unit;
            case 18:
                return e(obj, obj2, obj3);
            case 19:
                return f(obj, obj2, obj3);
            case 20:
                return g(obj, obj2, obj3);
            case 21:
                return h(obj, obj2, obj3);
            case 22:
                return i(obj, obj2, obj3);
            case 23:
                return j(obj, obj2, obj3);
            case 24:
                return k(obj, obj2, obj3);
            case 25:
                return l(obj, obj2, obj3);
            case 26:
                return m(obj, obj2, obj3);
            case 27:
                return n(obj, obj2, obj3);
            case 28:
                return o(obj, obj2, obj3);
            default:
                NearestStopsBottomSheetUISpec nearestStopsBottomSheetUISpec = (NearestStopsBottomSheetUISpec) obj5;
                NonEditableSearchFieldUiState nonEditableSearchFieldUiState = (NonEditableSearchFieldUiState) obj4;
                LazyItemScope item5 = (LazyItemScope) obj;
                Composer composer16 = (Composer) obj2;
                int iIntValue15 = ((Integer) obj3).intValue();
                Intrinsics.i(item5, "$this$item");
                if (composer16.shouldExecute((iIntValue15 & 17) != 16, iIntValue15 & 1)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1702018927, iIntValue15, -1, "app.chalo.livetracking.search.compose.NearestStopsBottomSheetContent.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (StopBasedTripPlannerSearchScreen.kt:374)");
                    }
                    NonEditableSearchFieldKt.a(ChaloThemeKt.c(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), nearestStopsBottomSheetUISpec.e), nonEditableSearchFieldUiState, composer16, 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer16.skipToGroupEnd();
                }
                return unit;
        }
    }

    public /* synthetic */ fu0(Function1 function1, RouteDetailsStopUiModel routeDetailsStopUiModel) {
        this.f15677a = 17;
        this.c = function1;
        this.b = routeDetailsStopUiModel;
    }
}
