package defpackage;

import androidx.compose.animation.AnimatedVisibilityScope;
import androidx.compose.animation.AnimationModifierKt;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.ScrollKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.BoxWithConstraintsScope;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.WindowInsets;
import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material3.DragHandleKt;
import androidx.compose.material3.DragHandleSizes;
import androidx.compose.material3.TextKt;
import androidx.compose.material3.carousel.CarouselItemScopeImpl;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.MutableIntState;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.ClipKt;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.Path;
import androidx.compose.ui.graphics.Shadow;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.graphics.drawscope.DrawStyle;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.layout.ContentScale;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.OnGloballyPositionedModifierKt;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.PlatformSpanStyle;
import androidx.compose.ui.text.SpanStyle;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontSynthesis;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.intl.LocaleList;
import androidx.compose.ui.text.style.BaselineShift;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.text.style.TextGeometricTransform;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.media3.extractor.metadata.dvbsi.AppInfoTableDecoder;
import androidx.paging.compose.LazyPagingItems;
import app.chalo.compose.ChaloZigzagPathComposableKt;
import app.chalo.compose.VerticalGridLinesWithGradiantBackgroundKt;
import app.chalo.compose.components.ChaloSpacersKt;
import app.chalo.compose.components.ChaloTextViewKt;
import app.chalo.compose.components.PassengerCounterKt;
import app.chalo.compose.components.bottomsheet.UserRatingBottomSheetKt;
import app.chalo.compose.components.buttons.ChaloFilledButtonKt;
import app.chalo.compose.components.image.CommonImageKt;
import app.chalo.compose.components.userprofile.UserProfilePicComposableUIState;
import app.chalo.compose.insets.NavigationBottomInsets_androidKt;
import app.chalo.compose.resources.StringResourcesHelperKt;
import app.chalo.compose.theme.ChaloPadding;
import app.chalo.compose.theme.ChaloTheme;
import app.chalo.compose.theme.ChaloThemeKt;
import app.chalo.compose.theme.ChaloTypographyKt;
import app.chalo.compose.theme.UIShape;
import app.chalo.core.compose.NetworkInspectorScreenKt;
import app.chalo.core.networkinspector.NetworkInspectorComponent;
import app.chalo.core.networkinspector.NetworkInspectorState;
import app.chalo.data.PremiumBusProductModificationAdditionalInfoAppModel;
import app.chalo.data.PremiumBusProductOptionsAppModel;
import app.chalo.data.ProductModificationSubtextColour;
import app.chalo.data.SpannableTextData;
import app.chalo.home.BottomSheetState;
import app.chalo.home.ChaloBottomSheetLayoutType;
import app.chalo.home.CommonBottomSheetData;
import app.chalo.home.contract.HomeScreenInfoHelper;
import app.chalo.home.nearbytrips.data.model.NearbyStopAndTripsUiModel;
import app.chalo.home.ui.base.HomeScreenDrawerChild;
import app.chalo.home.ui.base.HomeScreenFragmentViewState;
import app.chalo.home.ui.base.HomeScreenMainDecomposeKt;
import app.chalo.home.ui.base.RideHailingUserFeedbackData;
import app.chalo.home.ui.chalobus.ChaloBusScreenUIKt;
import app.chalo.home.ui.chalobus.ChaloBusViewState;
import app.chalo.home.ui.chalobus.PremiumBusTutorialConfigUiModel;
import app.chalo.home.ui.common.RideHailingUserFeedbackBottomSheetContentKt;
import app.chalo.home.ui.common.SeatAvailabilityInfoBottomSheetKt;
import app.chalo.home.ui.compose.ChaloTutorialBottomSheetKt;
import app.chalo.home.ui.compose.CommonTemplateBottomSheetKt;
import app.chalo.home.ui.compose.NotificationPermissionBottomSheetKt;
import app.chalo.home.ui.compose.UserProfilingBottomSheetKt;
import app.chalo.home.ui.history.compose.components.EmptyScreenViewKt;
import app.chalo.home.ui.history.uistate.ChaloWidgetCardSpec;
import app.chalo.home.ui.history.uistate.ChaloWidgetCardUiState;
import app.chalo.home.ui.history.uistate.TextWithBackgroundUiState;
import app.chalo.home.ui.home.HomeScreenBottomSheetType;
import app.chalo.home.ui.home.HomeTabScaffoldKt;
import app.chalo.home.ui.nearby.compose.RegularBusStopNearbyTripsCardKt;
import app.chalo.home.ui.profile.ComposableSingletons$ProfileScreenUIKt;
import app.chalo.home.ui.profile.ProfileDrawerCardAvatarKt;
import app.chalo.home.ui.profile.ProfileDrawerCardData;
import app.chalo.home.ui.profile.ProfilePageDisplayItemData;
import app.chalo.home.ui.profile.ProfileScreenUIKt;
import app.chalo.home.ui.regularbus.RegularBusScreenBottomSheetType;
import app.chalo.home.ui.regularbus.RegularBusViewState;
import app.chalo.home.ui.regularbus.SeatOccupancyBottomSheetData;
import app.chalo.livetracking.tripplanner.data.models.app.TripPlannerTabType;
import app.chalo.metro.ui.regular.uistate.PassengerSelectionItemSpec;
import app.chalo.metro.ui.regular.uistate.PassengerSelectionItemUIState;
import app.chalo.multimodalticket.groupticketsummary.ui.compose.GroupTicketSummaryScreenKt;
import app.chalo.multimodalticket.groupticketsummary.ui.uistate.GroupTicketPriceDetailsUiState;
import app.chalo.ncmc.ui.landing.compose.ChaloCardComposeItemsKt;
import app.chalo.ncmc.ui.transactionhistory.CardTransactionHistoryViewState;
import app.chalo.ncmc.ui.transactionhistory.compose.ChaloCardTransactionsScreenKt;
import app.chalo.network.logging.NetworkCallInfo;
import app.chalo.premiumbus.prebookedtickets.newactivation.NewPremiumBusReserveTicketActivationScreenKt;
import app.chalo.premiumbus.prebookedtickets.newactivation.PremiumBusBookingCancellationConfirmationBottomSheetKt;
import app.chalo.premiumbus.prebookedtickets.newactivation.PremiumBusBookingRescheduleConfirmationBottomSheetKt;
import app.chalo.premiumbus.prebookedtickets.newactivation.PremiumBusInAppCommunicationBottomSheetScreenKt;
import app.chalo.premiumbus.prebookedtickets.newactivation.PremiumBusProductOptionActionNotAllowedBottomSheetKt;
import app.chalo.premiumbus.prebookedtickets.newactivation.PremiumBusTicketActivationMoreOptionsListKt;
import app.chalo.premiumbus.prebookedtickets.ui.activation.PremiumBusActivationScreenBottomSheetTypes;
import app.chalo.premiumbus.prebookedtickets.ui.cancellationack.PremiumBusInAppCommunicationBottomSheetData;
import app.chalo.premiumbus.prebookedtickets.ui.newactivation.NewPremiumBusReserveTicketActivationState;
import app.chalo.premiumbus.ui.slotselection.PremiumBusSlotSelectionDateAndTimePickerUIState;
import app.chalo.premiumbus.ui.slotselection.PremiumBusSlotSelectionSpecs;
import app.chalo.premiumbus.ui.slotselection.PremiumBusSlotSelectionUiStateKt;
import app.chalo.premiumbus.ui.stopselection.PBStopSelectionScreenBottomSheetType;
import app.chalo.premiumbus.ui.stopselection.compose.PremiumBusStopSelectionScreenKt;
import app.chalo.productpurchase.passpurchase.ui.confirmation.ConfirmSuperPassScreenKt;
import app.chalo.productpurchase.passpurchase.ui.enteruserdetails.SuperPassBasicUserInfoSectionUIState;
import app.chalo.productpurchase.passpurchase.ui.enteruserdetails.SuperPassEnterUserDetailsUIState;
import app.chalo.productpurchase.passselection.ui.PassCategorySelectionSectionUIState;
import app.chalo.productpurchase.passselection.ui.PassCategorySelectionTabScreen;
import app.chalo.productpurchase.passselection.ui.PassPlanAnnouncementUIState;
import app.chalo.productpurchase.passselection.ui.PassSelectionScreenKt;
import app.chalo.productsummary.ui.compose.PassSummarySuccessMainScreenKt;
import app.chalo.productsummary.ui.compose.TripSummaryMainScreenKt;
import app.chalo.productsummary.ui.compose.components.BookingDetailsComponentKt;
import app.chalo.productsummary.ui.compose.components.FareSplitComponentKt;
import app.chalo.productsummary.ui.compose.components.ProductStatusComponentKt;
import app.chalo.productsummary.ui.data.BookingDetailsUIState;
import app.chalo.productsummary.ui.data.PriceDetailsUIState;
import app.chalo.productsummary.ui.data.ProductSummaryStatusUiData;
import app.chalo.productsummary.ui.data.ProductSummarySuccessScreenUISpec;
import app.chalo.productsummary.ui.pass.ProductDownloadInvoiceOptionUIState;
import app.chalo.productsummary.ui.ticket.TicketInfoUIState;
import app.chalo.productsummary.ui.ticket.TicketSummaryScreenType;
import app.chalo.productsummary.ui.ticket.TicketSummarySuccessScreenUIState;
import app.chalo.productsummary.ui.ticket.TicketSupportUIState;
import app.chalo.productsummary.ui.ticket.TicketSupportUIStateSpec;
import app.chalo.providers.iconassetprovider.IconType;
import app.chalo.providers.stringprovider.StringEnum;
import app.chalo.ridehailing.feedback.RideFeedbackGridBackgroundUIState;
import app.chalo.ridehailing.feedback.RideFeedbackHeaderUIState;
import app.chalo.ridehailing.feedback.RideFeedbackViewState;
import app.chalo.ridehailing.feedback.RideUserFeedbackScreenKt;
import app.chalo.uistate.base.ChaloColorToken;
import app.chalo.uistate.base.ChaloColorTokenKt;
import app.chalo.uistate.base.UiAlignment;
import app.chalo.uistate.base.UiAlignmentKt;
import app.chalo.uistate.button.ButtonUIState;
import app.chalo.uistate.divider.DividerUIState;
import app.chalo.uistate.divider.DividerUIStateKt;
import app.chalo.uistate.image.ImageUISize;
import app.chalo.uistate.image.ImageUIState;
import app.chalo.uistate.image.ImageUIStateKt;
import app.chalo.uistate.image.ImageUrlUIState;
import app.chalo.uistate.text.TextUIState;
import app.chalo.validationsdk.blevalidation.ui.BleValidationScreen_androidKt;
import coil3.compose.AsyncImagePainter;
import coil3.compose.SingletonSubcomposeAsyncImageKt;
import coil3.compose.SubcomposeAsyncImageKt;
import coil3.compose.SubcomposeAsyncImageScope;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class ob implements Function3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f18582a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ ob(int i, Object obj, Object obj2, Object obj3) {
        this.f18582a = i;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
    }

    private final Object a(Object obj, Object obj2, Object obj3) {
        final NewPremiumBusReserveTicketActivationState newPremiumBusReserveTicketActivationState = (NewPremiumBusReserveTicketActivationState) this.b;
        final Function1 function1 = (Function1) this.c;
        final CoroutineScope coroutineScope = (CoroutineScope) this.d;
        ColumnScope BottomDrawer = (ColumnScope) obj;
        Composer composer = (Composer) obj2;
        int iIntValue = ((Integer) obj3).intValue();
        Intrinsics.i(BottomDrawer, "$this$BottomDrawer");
        if (composer.shouldExecute((iIntValue & 17) != 16, iIntValue & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-777596572, iIntValue, -1, "app.chalo.premiumbus.prebookedtickets.newactivation.NewPremiumBusActivationScreenMainScreen.<anonymous> (NewPremiumBusReserveTicketActivationScreen.kt:151)");
            }
            final PremiumBusActivationScreenBottomSheetTypes premiumBusActivationScreenBottomSheetTypes = newPremiumBusReserveTicketActivationState.j;
            if (premiumBusActivationScreenBottomSheetTypes instanceof PremiumBusActivationScreenBottomSheetTypes.BookingAckRequired) {
                composer.startReplaceGroup(1674293324);
                PremiumBusInAppCommunicationBottomSheetData premiumBusInAppCommunicationBottomSheetData = ((PremiumBusActivationScreenBottomSheetTypes.BookingAckRequired) premiumBusActivationScreenBottomSheetTypes).c;
                boolean zChanged = composer.changed(function1);
                Object objRememberedValue = composer.rememberedValue();
                if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = new qm0(function1, 9);
                    composer.updateRememberedValue(objRememberedValue);
                }
                Function0 function0 = (Function0) objRememberedValue;
                boolean zChanged2 = composer.changed(function1);
                Object objRememberedValue2 = composer.rememberedValue();
                if (zChanged2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue2 = new qm0(function1, 10);
                    composer.updateRememberedValue(objRememberedValue2);
                }
                PremiumBusInAppCommunicationBottomSheetScreenKt.a(premiumBusInAppCommunicationBottomSheetData, function0, (Function0) objRememberedValue2, composer, 0);
                composer.endReplaceGroup();
            } else if (premiumBusActivationScreenBottomSheetTypes instanceof PremiumBusActivationScreenBottomSheetTypes.SeeMoreOptions) {
                composer.startReplaceGroup(1675455793);
                List list = ((PremiumBusActivationScreenBottomSheetTypes.SeeMoreOptions) premiumBusActivationScreenBottomSheetTypes).c;
                String str = newPremiumBusReserveTicketActivationState.x;
                boolean zChangedInstance = composer.changedInstance(coroutineScope) | composer.changed(function1) | composer.changed(premiumBusActivationScreenBottomSheetTypes) | composer.changedInstance(newPremiumBusReserveTicketActivationState);
                Object objRememberedValue3 = composer.rememberedValue();
                if (zChangedInstance || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue3 = new Function1() { // from class: app.chalo.premiumbus.prebookedtickets.newactivation.d
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj4) {
                            PremiumBusProductOptionsAppModel it = (PremiumBusProductOptionsAppModel) obj4;
                            Intrinsics.i(it, "it");
                            BuildersKt.d(coroutineScope, null, null, new NewPremiumBusReserveTicketActivationScreenKt$NewPremiumBusActivationScreenMainScreen$1$3$1$1(function1, it, premiumBusActivationScreenBottomSheetTypes, newPremiumBusReserveTicketActivationState, null), 3);
                            return Unit.f17538a;
                        }
                    };
                    composer.updateRememberedValue(objRememberedValue3);
                }
                Function1 function2 = (Function1) objRememberedValue3;
                boolean zChangedInstance2 = composer.changedInstance(coroutineScope) | composer.changed(function1);
                Object objRememberedValue4 = composer.rememberedValue();
                if (zChangedInstance2 || objRememberedValue4 == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue4 = new Function1() { // from class: app.chalo.premiumbus.prebookedtickets.newactivation.e
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj4) {
                            String userCancellationAndReschedulePolicyWebUrl = (String) obj4;
                            Intrinsics.i(userCancellationAndReschedulePolicyWebUrl, "userCancellationAndReschedulePolicyWebUrl");
                            BuildersKt.d(coroutineScope, null, null, new NewPremiumBusReserveTicketActivationScreenKt$NewPremiumBusActivationScreenMainScreen$1$4$1$1(userCancellationAndReschedulePolicyWebUrl, null, function1), 3);
                            return Unit.f17538a;
                        }
                    };
                    composer.updateRememberedValue(objRememberedValue4);
                }
                PremiumBusTicketActivationMoreOptionsListKt.b(list, null, str, function2, (Function1) objRememberedValue4, composer, 0);
                composer.endReplaceGroup();
            } else if (premiumBusActivationScreenBottomSheetTypes instanceof PremiumBusActivationScreenBottomSheetTypes.ActionNotAllowed) {
                composer.startReplaceGroup(1677067731);
                PremiumBusProductOptionsAppModel premiumBusProductOptionsAppModel = ((PremiumBusActivationScreenBottomSheetTypes.ActionNotAllowed) premiumBusActivationScreenBottomSheetTypes).c;
                boolean zChanged3 = composer.changed(function1);
                Object objRememberedValue5 = composer.rememberedValue();
                if (zChanged3 || objRememberedValue5 == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue5 = new qm0(function1, 12);
                    composer.updateRememberedValue(objRememberedValue5);
                }
                PremiumBusProductOptionActionNotAllowedBottomSheetKt.a(premiumBusProductOptionsAppModel, (Function0) objRememberedValue5, composer, 0);
                composer.endReplaceGroup();
            } else if (premiumBusActivationScreenBottomSheetTypes instanceof PremiumBusActivationScreenBottomSheetTypes.Error) {
                composer.startReplaceGroup(1677436445);
                PremiumBusTicketActivationMoreOptionsListKt.a(0, composer, PaddingKt.m786paddingVpY3zN4$default(Modifier.INSTANCE, 0.0f, ChaloTheme.b(composer, 0).f, 1, null), ((PremiumBusActivationScreenBottomSheetTypes.Error) premiumBusActivationScreenBottomSheetTypes).c);
                composer.endReplaceGroup();
            } else if (Intrinsics.d(premiumBusActivationScreenBottomSheetTypes, PremiumBusActivationScreenBottomSheetTypes.BleFeatureNotAvailable.c) || Intrinsics.d(premiumBusActivationScreenBottomSheetTypes, PremiumBusActivationScreenBottomSheetTypes.Confirmation.c) || Intrinsics.d(premiumBusActivationScreenBottomSheetTypes, PremiumBusActivationScreenBottomSheetTypes.Expired.c) || (premiumBusActivationScreenBottomSheetTypes instanceof PremiumBusActivationScreenBottomSheetTypes.TrackingNotAvailable) || Intrinsics.d(premiumBusActivationScreenBottomSheetTypes, PremiumBusActivationScreenBottomSheetTypes.TripNotStarted.c) || Intrinsics.d(premiumBusActivationScreenBottomSheetTypes, PremiumBusActivationScreenBottomSheetTypes.UpdateOptionsLoading.c)) {
                composer.startReplaceGroup(1678181096);
                NewPremiumBusReserveTicketActivationScreenKt.f(null, 0, composer, 0);
                composer.endReplaceGroup();
            } else if (premiumBusActivationScreenBottomSheetTypes == null) {
                composer.startReplaceGroup(1678292634);
                gf.r(Modifier.INSTANCE, ChaloTheme.b(composer, 0).c, composer, 0);
            } else if (premiumBusActivationScreenBottomSheetTypes instanceof PremiumBusActivationScreenBottomSheetTypes.ShowTripCancellationBottomSheet) {
                composer.startReplaceGroup(1678585336);
                PremiumBusActivationScreenBottomSheetTypes.ShowTripCancellationBottomSheet showTripCancellationBottomSheet = (PremiumBusActivationScreenBottomSheetTypes.ShowTripCancellationBottomSheet) premiumBusActivationScreenBottomSheetTypes;
                PremiumBusProductOptionsAppModel premiumBusProductOptionsAppModel2 = showTripCancellationBottomSheet.c;
                String str2 = premiumBusProductOptionsAppModel2.d;
                if (str2 == null) {
                    str2 = "";
                }
                String str3 = str2;
                ProductModificationSubtextColour productModificationSubtextColour = premiumBusProductOptionsAppModel2.h;
                boolean z = showTripCancellationBottomSheet.d;
                PremiumBusProductModificationAdditionalInfoAppModel premiumBusProductModificationAdditionalInfoAppModel = premiumBusProductOptionsAppModel2.i;
                boolean zChangedInstance3 = composer.changedInstance(coroutineScope) | composer.changed(function1) | composer.changed(premiumBusActivationScreenBottomSheetTypes) | composer.changedInstance(newPremiumBusReserveTicketActivationState);
                Object objRememberedValue6 = composer.rememberedValue();
                if (zChangedInstance3 || objRememberedValue6 == Composer.INSTANCE.getEmpty()) {
                    final int i = 1;
                    Function0 function3 = new Function0() { // from class: app.chalo.premiumbus.prebookedtickets.newactivation.b
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            switch (i) {
                                case 0:
                                    BuildersKt.d(coroutineScope, null, null, new NewPremiumBusReserveTicketActivationScreenKt$NewPremiumBusActivationScreenMainScreen$1$11$1$1(function1, premiumBusActivationScreenBottomSheetTypes, newPremiumBusReserveTicketActivationState, null), 3);
                                    break;
                                case 1:
                                    BuildersKt.d(coroutineScope, null, null, new NewPremiumBusReserveTicketActivationScreenKt$NewPremiumBusActivationScreenMainScreen$1$6$1$1(function1, premiumBusActivationScreenBottomSheetTypes, newPremiumBusReserveTicketActivationState, null), 3);
                                    break;
                                default:
                                    BuildersKt.d(coroutineScope, null, null, new NewPremiumBusReserveTicketActivationScreenKt$NewPremiumBusActivationScreenMainScreen$1$7$1$1(function1, premiumBusActivationScreenBottomSheetTypes, newPremiumBusReserveTicketActivationState, null), 3);
                                    break;
                            }
                            return Unit.f17538a;
                        }
                    };
                    composer.updateRememberedValue(function3);
                    objRememberedValue6 = function3;
                }
                Function0 function4 = (Function0) objRememberedValue6;
                boolean zChangedInstance4 = composer.changedInstance(coroutineScope) | composer.changed(function1) | composer.changed(premiumBusActivationScreenBottomSheetTypes) | composer.changedInstance(newPremiumBusReserveTicketActivationState);
                Object objRememberedValue7 = composer.rememberedValue();
                if (zChangedInstance4 || objRememberedValue7 == Composer.INSTANCE.getEmpty()) {
                    final int i2 = 2;
                    Function0 function5 = new Function0() { // from class: app.chalo.premiumbus.prebookedtickets.newactivation.b
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            switch (i2) {
                                case 0:
                                    BuildersKt.d(coroutineScope, null, null, new NewPremiumBusReserveTicketActivationScreenKt$NewPremiumBusActivationScreenMainScreen$1$11$1$1(function1, premiumBusActivationScreenBottomSheetTypes, newPremiumBusReserveTicketActivationState, null), 3);
                                    break;
                                case 1:
                                    BuildersKt.d(coroutineScope, null, null, new NewPremiumBusReserveTicketActivationScreenKt$NewPremiumBusActivationScreenMainScreen$1$6$1$1(function1, premiumBusActivationScreenBottomSheetTypes, newPremiumBusReserveTicketActivationState, null), 3);
                                    break;
                                default:
                                    BuildersKt.d(coroutineScope, null, null, new NewPremiumBusReserveTicketActivationScreenKt$NewPremiumBusActivationScreenMainScreen$1$7$1$1(function1, premiumBusActivationScreenBottomSheetTypes, newPremiumBusReserveTicketActivationState, null), 3);
                                    break;
                            }
                            return Unit.f17538a;
                        }
                    };
                    composer.updateRememberedValue(function5);
                    objRememberedValue7 = function5;
                }
                Function0 function6 = (Function0) objRememberedValue7;
                boolean zChangedInstance5 = composer.changedInstance(coroutineScope) | composer.changed(function1) | composer.changed(premiumBusActivationScreenBottomSheetTypes);
                Object objRememberedValue8 = composer.rememberedValue();
                if (zChangedInstance5 || objRememberedValue8 == Composer.INSTANCE.getEmpty()) {
                    final int i3 = 2;
                    objRememberedValue8 = new Function0() { // from class: app.chalo.premiumbus.prebookedtickets.newactivation.c
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            switch (i3) {
                                case 0:
                                    BuildersKt.d(coroutineScope, null, null, new NewPremiumBusReserveTicketActivationScreenKt$NewPremiumBusActivationScreenMainScreen$1$12$1$1(function1, premiumBusActivationScreenBottomSheetTypes, null), 3);
                                    break;
                                case 1:
                                    BuildersKt.d(coroutineScope, null, null, new NewPremiumBusReserveTicketActivationScreenKt$NewPremiumBusActivationScreenMainScreen$1$13$1$1(function1, premiumBusActivationScreenBottomSheetTypes, null), 3);
                                    break;
                                case 2:
                                    BuildersKt.d(coroutineScope, null, null, new NewPremiumBusReserveTicketActivationScreenKt$NewPremiumBusActivationScreenMainScreen$1$8$1$1(function1, premiumBusActivationScreenBottomSheetTypes, null), 3);
                                    break;
                                default:
                                    BuildersKt.d(coroutineScope, null, null, new NewPremiumBusReserveTicketActivationScreenKt$NewPremiumBusActivationScreenMainScreen$1$9$1$1(function1, premiumBusActivationScreenBottomSheetTypes, null), 3);
                                    break;
                            }
                            return Unit.f17538a;
                        }
                    };
                    composer.updateRememberedValue(objRememberedValue8);
                }
                Function0 function7 = (Function0) objRememberedValue8;
                boolean zChangedInstance6 = composer.changedInstance(coroutineScope) | composer.changed(function1) | composer.changed(premiumBusActivationScreenBottomSheetTypes);
                Object objRememberedValue9 = composer.rememberedValue();
                if (zChangedInstance6 || objRememberedValue9 == Composer.INSTANCE.getEmpty()) {
                    final int i4 = 3;
                    objRememberedValue9 = new Function0() { // from class: app.chalo.premiumbus.prebookedtickets.newactivation.c
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            switch (i4) {
                                case 0:
                                    BuildersKt.d(coroutineScope, null, null, new NewPremiumBusReserveTicketActivationScreenKt$NewPremiumBusActivationScreenMainScreen$1$12$1$1(function1, premiumBusActivationScreenBottomSheetTypes, null), 3);
                                    break;
                                case 1:
                                    BuildersKt.d(coroutineScope, null, null, new NewPremiumBusReserveTicketActivationScreenKt$NewPremiumBusActivationScreenMainScreen$1$13$1$1(function1, premiumBusActivationScreenBottomSheetTypes, null), 3);
                                    break;
                                case 2:
                                    BuildersKt.d(coroutineScope, null, null, new NewPremiumBusReserveTicketActivationScreenKt$NewPremiumBusActivationScreenMainScreen$1$8$1$1(function1, premiumBusActivationScreenBottomSheetTypes, null), 3);
                                    break;
                                default:
                                    BuildersKt.d(coroutineScope, null, null, new NewPremiumBusReserveTicketActivationScreenKt$NewPremiumBusActivationScreenMainScreen$1$9$1$1(function1, premiumBusActivationScreenBottomSheetTypes, null), 3);
                                    break;
                            }
                            return Unit.f17538a;
                        }
                    };
                    composer.updateRememberedValue(objRememberedValue9);
                }
                PremiumBusBookingCancellationConfirmationBottomSheetKt.a(z, productModificationSubtextColour, str3, premiumBusProductModificationAdditionalInfoAppModel, function4, function6, function7, (Function0) objRememberedValue9, composer, 0);
                composer.endReplaceGroup();
            } else if (premiumBusActivationScreenBottomSheetTypes instanceof PremiumBusActivationScreenBottomSheetTypes.ShowAllocatedSeatsBottomSheet) {
                composer.startReplaceGroup(1681083843);
                List list2 = ((PremiumBusActivationScreenBottomSheetTypes.ShowAllocatedSeatsBottomSheet) premiumBusActivationScreenBottomSheetTypes).c;
                boolean zChanged4 = composer.changed(function1);
                Object objRememberedValue10 = composer.rememberedValue();
                if (zChanged4 || objRememberedValue10 == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue10 = new qm0(function1, 13);
                    composer.updateRememberedValue(objRememberedValue10);
                }
                NewPremiumBusReserveTicketActivationScreenKt.e(list2, (Function0) objRememberedValue10, composer, 0);
                composer.endReplaceGroup();
            } else {
                if (!(premiumBusActivationScreenBottomSheetTypes instanceof PremiumBusActivationScreenBottomSheetTypes.ShowRescheduleConfirmationBottomSheet)) {
                    throw pk0.p(composer, 54013418);
                }
                composer.startReplaceGroup(1681574015);
                PremiumBusProductModificationAdditionalInfoAppModel premiumBusProductModificationAdditionalInfoAppModel2 = ((PremiumBusActivationScreenBottomSheetTypes.ShowRescheduleConfirmationBottomSheet) premiumBusActivationScreenBottomSheetTypes).c.i;
                boolean zChangedInstance7 = composer.changedInstance(coroutineScope) | composer.changed(function1) | composer.changed(premiumBusActivationScreenBottomSheetTypes) | composer.changedInstance(newPremiumBusReserveTicketActivationState);
                Object objRememberedValue11 = composer.rememberedValue();
                if (zChangedInstance7 || objRememberedValue11 == Composer.INSTANCE.getEmpty()) {
                    final int i5 = 0;
                    Function0 function8 = new Function0() { // from class: app.chalo.premiumbus.prebookedtickets.newactivation.b
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            switch (i5) {
                                case 0:
                                    BuildersKt.d(coroutineScope, null, null, new NewPremiumBusReserveTicketActivationScreenKt$NewPremiumBusActivationScreenMainScreen$1$11$1$1(function1, premiumBusActivationScreenBottomSheetTypes, newPremiumBusReserveTicketActivationState, null), 3);
                                    break;
                                case 1:
                                    BuildersKt.d(coroutineScope, null, null, new NewPremiumBusReserveTicketActivationScreenKt$NewPremiumBusActivationScreenMainScreen$1$6$1$1(function1, premiumBusActivationScreenBottomSheetTypes, newPremiumBusReserveTicketActivationState, null), 3);
                                    break;
                                default:
                                    BuildersKt.d(coroutineScope, null, null, new NewPremiumBusReserveTicketActivationScreenKt$NewPremiumBusActivationScreenMainScreen$1$7$1$1(function1, premiumBusActivationScreenBottomSheetTypes, newPremiumBusReserveTicketActivationState, null), 3);
                                    break;
                            }
                            return Unit.f17538a;
                        }
                    };
                    composer.updateRememberedValue(function8);
                    objRememberedValue11 = function8;
                }
                Function0 function9 = (Function0) objRememberedValue11;
                boolean zChangedInstance8 = composer.changedInstance(coroutineScope) | composer.changed(function1) | composer.changed(premiumBusActivationScreenBottomSheetTypes);
                Object objRememberedValue12 = composer.rememberedValue();
                if (zChangedInstance8 || objRememberedValue12 == Composer.INSTANCE.getEmpty()) {
                    final int i6 = 0;
                    objRememberedValue12 = new Function0() { // from class: app.chalo.premiumbus.prebookedtickets.newactivation.c
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            switch (i6) {
                                case 0:
                                    BuildersKt.d(coroutineScope, null, null, new NewPremiumBusReserveTicketActivationScreenKt$NewPremiumBusActivationScreenMainScreen$1$12$1$1(function1, premiumBusActivationScreenBottomSheetTypes, null), 3);
                                    break;
                                case 1:
                                    BuildersKt.d(coroutineScope, null, null, new NewPremiumBusReserveTicketActivationScreenKt$NewPremiumBusActivationScreenMainScreen$1$13$1$1(function1, premiumBusActivationScreenBottomSheetTypes, null), 3);
                                    break;
                                case 2:
                                    BuildersKt.d(coroutineScope, null, null, new NewPremiumBusReserveTicketActivationScreenKt$NewPremiumBusActivationScreenMainScreen$1$8$1$1(function1, premiumBusActivationScreenBottomSheetTypes, null), 3);
                                    break;
                                default:
                                    BuildersKt.d(coroutineScope, null, null, new NewPremiumBusReserveTicketActivationScreenKt$NewPremiumBusActivationScreenMainScreen$1$9$1$1(function1, premiumBusActivationScreenBottomSheetTypes, null), 3);
                                    break;
                            }
                            return Unit.f17538a;
                        }
                    };
                    composer.updateRememberedValue(objRememberedValue12);
                }
                Function0 function10 = (Function0) objRememberedValue12;
                boolean zChangedInstance9 = composer.changedInstance(coroutineScope) | composer.changed(function1) | composer.changed(premiumBusActivationScreenBottomSheetTypes);
                Object objRememberedValue13 = composer.rememberedValue();
                if (zChangedInstance9 || objRememberedValue13 == Composer.INSTANCE.getEmpty()) {
                    final int i7 = 1;
                    objRememberedValue13 = new Function0() { // from class: app.chalo.premiumbus.prebookedtickets.newactivation.c
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            switch (i7) {
                                case 0:
                                    BuildersKt.d(coroutineScope, null, null, new NewPremiumBusReserveTicketActivationScreenKt$NewPremiumBusActivationScreenMainScreen$1$12$1$1(function1, premiumBusActivationScreenBottomSheetTypes, null), 3);
                                    break;
                                case 1:
                                    BuildersKt.d(coroutineScope, null, null, new NewPremiumBusReserveTicketActivationScreenKt$NewPremiumBusActivationScreenMainScreen$1$13$1$1(function1, premiumBusActivationScreenBottomSheetTypes, null), 3);
                                    break;
                                case 2:
                                    BuildersKt.d(coroutineScope, null, null, new NewPremiumBusReserveTicketActivationScreenKt$NewPremiumBusActivationScreenMainScreen$1$8$1$1(function1, premiumBusActivationScreenBottomSheetTypes, null), 3);
                                    break;
                                default:
                                    BuildersKt.d(coroutineScope, null, null, new NewPremiumBusReserveTicketActivationScreenKt$NewPremiumBusActivationScreenMainScreen$1$9$1$1(function1, premiumBusActivationScreenBottomSheetTypes, null), 3);
                                    break;
                            }
                            return Unit.f17538a;
                        }
                    };
                    composer.updateRememberedValue(objRememberedValue13);
                }
                PremiumBusBookingRescheduleConfirmationBottomSheetKt.a(premiumBusProductModificationAdditionalInfoAppModel2, function9, function10, (Function0) objRememberedValue13, composer, 0);
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

    private final Object c(Object obj, Object obj2, Object obj3) {
        Modifier modifier = (Modifier) this.b;
        PassengerSelectionItemSpec passengerSelectionItemSpec = (PassengerSelectionItemSpec) this.c;
        PassengerSelectionItemUIState passengerSelectionItemUIState = (PassengerSelectionItemUIState) this.d;
        ColumnScope Card = (ColumnScope) obj;
        Composer composer = (Composer) obj2;
        int iIntValue = ((Integer) obj3).intValue();
        Intrinsics.i(Card, "$this$Card");
        if (composer.shouldExecute((iIntValue & 17) != 16, iIntValue & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-122706206, iIntValue, -1, "app.chalo.metro.ui.regular.compose.PassengerSelectionItem.<anonymous> (PassengerSelection.kt:78)");
            }
            Modifier modifierC = ChaloThemeKt.c(modifier, passengerSelectionItemSpec.f5548a);
            MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getSpaceBetween(), UiAlignmentKt.b(UiAlignment.Vertical.Center.f9888a), composer, 6);
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
            pk0.v(companion, composerM3915constructorimpl, measurePolicyRowMeasurePolicy, composerM3915constructorimpl, currentCompositionLocalMap);
            Updater.m3923setimpl(composerM3915constructorimpl, modifierMaterializeModifier, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion, composerM3915constructorimpl, Integer.valueOf(i), composerM3915constructorimpl));
            RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
            ChaloTextViewKt.a(null, passengerSelectionItemUIState.c, null, null, composer, 0, 13);
            PassengerCounterKt.a(null, passengerSelectionItemUIState.d, composer, 0);
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
        PremiumBusSlotSelectionSpecs premiumBusSlotSelectionSpecs = (PremiumBusSlotSelectionSpecs) this.b;
        ButtonUIState buttonUIState = (ButtonUIState) this.c;
        ButtonUIState buttonUIState2 = (ButtonUIState) this.d;
        ColumnScope Card = (ColumnScope) obj;
        Composer composer = (Composer) obj2;
        int iIntValue = ((Integer) obj3).intValue();
        Intrinsics.i(Card, "$this$Card");
        if (composer.shouldExecute((iIntValue & 17) != 16, iIntValue & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1090423153, iIntValue, -1, "app.chalo.premiumbus.ui.slotselection.compose.PremiumBusSlotsPager.<anonymous>.<anonymous>.<anonymous>.<anonymous> (PremiumBusSlotSelectionScreen.kt:380)");
            }
            Modifier.Companion companion = Modifier.INSTANCE;
            ChaloPadding chaloPadding = premiumBusSlotSelectionSpecs.f;
            float f = premiumBusSlotSelectionSpecs.f7888a;
            Modifier modifierC = ChaloThemeKt.c(companion, chaloPadding);
            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composer, 0);
            long currentCompositeKeyHashCode = ComposablesKt.getCurrentCompositeKeyHashCode(composer, 0);
            int i = (int) (currentCompositeKeyHashCode ^ (currentCompositeKeyHashCode >>> 32));
            CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composer, modifierC);
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
            ChaloFilledButtonKt.a(0, 0, composer, SizeKt.m814height3ABfNKs(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), f), buttonUIState);
            if (buttonUIState2 == null) {
                composer.startReplaceGroup(100958880);
            } else {
                composer.startReplaceGroup(100958881);
                ChaloSpacersKt.n(composer, 0);
                ChaloFilledButtonKt.a(0, 0, composer, SizeKt.m814height3ABfNKs(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), f), buttonUIState2);
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

    private final Object e(Object obj, Object obj2, Object obj3) {
        float f;
        int i;
        String strC;
        Function0 function0 = (Function0) this.b;
        ProfilePageDisplayItemData profilePageDisplayItemData = (ProfilePageDisplayItemData) this.c;
        ProfileDrawerCardData profileDrawerCardData = (ProfileDrawerCardData) this.d;
        ColumnScope ChaloRoundedCard = (ColumnScope) obj;
        Composer composer = (Composer) obj2;
        int iIntValue = ((Integer) obj3).intValue();
        Intrinsics.i(ChaloRoundedCard, "$this$ChaloRoundedCard");
        if (composer.shouldExecute((iIntValue & 17) != 16, iIntValue & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-247976157, iIntValue, -1, "app.chalo.home.ui.profile.ProfileDrawerCardItemUI.<anonymous> (ProfileScreenUI.kt:429)");
            }
            Modifier.Companion companion = Modifier.INSTANCE;
            boolean zChanged = composer.changed(function0);
            Object objRememberedValue = composer.rememberedValue();
            if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new ar0(function0, 24);
                composer.updateRememberedValue(objRememberedValue);
            }
            Modifier modifierM784padding3ABfNKs = PaddingKt.m784padding3ABfNKs(SizeKt.fillMaxWidth$default(ClickableKt.m299clickableoSLSa3U$default(companion, false, null, null, null, (Function0) objRememberedValue, 15, null), 0.0f, 1, null), ChaloTheme.b(composer, 0).h);
            Alignment.Companion companion2 = Alignment.INSTANCE;
            Alignment.Horizontal centerHorizontally = companion2.getCenterHorizontally();
            Arrangement arrangement = Arrangement.INSTANCE;
            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(arrangement.getTop(), centerHorizontally, composer, 48);
            long currentCompositeKeyHashCode = ComposablesKt.getCurrentCompositeKeyHashCode(composer, 0);
            int i2 = (int) (currentCompositeKeyHashCode ^ (currentCompositeKeyHashCode >>> 32));
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
            Updater.m3923setimpl(composerM3915constructorimpl, modifierMaterializeModifier, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion3, composerM3915constructorimpl, Integer.valueOf(i2), composerM3915constructorimpl));
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
            ProfileDrawerCardData profileDrawerCardData2 = profilePageDisplayItemData.h;
            if (!profileDrawerCardData2.f3592a || profileDrawerCardData2.f) {
                composer.startReplaceGroup(1855268413);
                f = ChaloTheme.b(composer, 0).k;
                composer.endReplaceGroup();
            } else {
                composer.startReplaceGroup(1855329948);
                f = ChaloTheme.b(composer, 0).i;
                composer.endReplaceGroup();
            }
            Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null);
            MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(arrangement.getStart(), companion2.getCenterVertically(), composer, 48);
            long currentCompositeKeyHashCode2 = ComposablesKt.getCurrentCompositeKeyHashCode(composer, 0);
            int i3 = (int) (currentCompositeKeyHashCode2 ^ (currentCompositeKeyHashCode2 >>> 32));
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
            Updater.m3923setimpl(composerM3915constructorimpl2, modifierMaterializeModifier2, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion3, composerM3915constructorimpl2, Integer.valueOf(i3), composerM3915constructorimpl2));
            RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
            IconType iconType = profilePageDisplayItemData.c;
            if (iconType == null) {
                iconType = IconType.ICON_PROFILE;
            }
            ProfileDrawerCardAvatarKt.b(profileDrawerCardData, iconType, null, f, 0.0f, 0.0f, 0.0f, composer, 0, AppInfoTableDecoder.APPLICATION_INFORMATION_TABLE_ID);
            Composer composer2 = composer;
            ChaloSpacersKt.x(composer2, 0);
            Modifier modifierA = i41.a(rowScopeInstance, companion, 1.0f, false, 2, null);
            MeasurePolicy measurePolicyColumnMeasurePolicy2 = ColumnKt.columnMeasurePolicy(arrangement.getCenter(), companion2.getStart(), composer2, 6);
            long currentCompositeKeyHashCode3 = ComposablesKt.getCurrentCompositeKeyHashCode(composer2, 0);
            int i4 = (int) (currentCompositeKeyHashCode3 ^ (currentCompositeKeyHashCode3 >>> 32));
            CompositionLocalMap currentCompositionLocalMap3 = composer2.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier3 = ComposedModifierKt.materializeModifier(composer2, modifierA);
            Function0<ComposeUiNode> constructor3 = companion3.getConstructor();
            if (composer2.getApplier() == null) {
                ComposablesKt.invalidApplier();
            }
            composer2.startReusableNode();
            if (composer2.getInserting()) {
                composer2.createNode(constructor3);
            } else {
                composer2.useNode();
            }
            Composer composerM3915constructorimpl3 = Updater.m3915constructorimpl(composer2);
            pk0.v(companion3, composerM3915constructorimpl3, measurePolicyColumnMeasurePolicy2, composerM3915constructorimpl3, currentCompositionLocalMap3);
            Updater.m3923setimpl(composerM3915constructorimpl3, modifierMaterializeModifier3, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion3, composerM3915constructorimpl3, Integer.valueOf(i4), composerM3915constructorimpl3));
            String str = profilePageDisplayItemData.f3593a;
            if (str == null) {
                composer2.startReplaceGroup(-878407728);
                composer2.endReplaceGroup();
                i = 0;
            } else {
                composer2.startReplaceGroup(-878407727);
                i = 0;
                TextKt.m2623TextNvy7gAk(str, null, ChaloTheme.a(composer2, 0).t0, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ChaloTypographyKt.g(ChaloTheme.e(composer2, 0)), composer2, 0, 0, 131066);
                composer2 = composer2;
                composer2.endReplaceGroup();
            }
            ChaloSpacersKt.t(composer2, i);
            String str2 = profilePageDisplayItemData.b;
            if (str2 == null) {
                composer2.startReplaceGroup(-878074540);
            } else {
                composer2.startReplaceGroup(-878074539);
                Composer composer3 = composer2;
                TextKt.m2623TextNvy7gAk(str2, null, ChaloTheme.a(composer2, i).v0, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ChaloTypographyKt.c(ChaloTheme.e(composer2, i)), composer3, 0, 0, 131066);
                composer2 = composer3;
            }
            composer2.endReplaceGroup();
            composer2.endNode();
            if (profileDrawerCardData.f3592a) {
                composer2.startReplaceGroup(996094941);
                ChaloSpacersKt.C(composer2, i);
                if (profileDrawerCardData.f) {
                    composer2.startReplaceGroup(996219034);
                    strC = StringResourcesHelperKt.c(StringEnum.EDIT_PROFILE, new Object[i], composer2, 6);
                    composer2.endReplaceGroup();
                } else {
                    composer2.startReplaceGroup(996319350);
                    strC = StringResourcesHelperKt.c(StringEnum.COMPLETE_PROFILE, new Object[i], composer2, 6);
                    composer2.endReplaceGroup();
                }
                String str3 = strC;
                TextStyle titleLarge = ChaloTheme.e(composer2, i).getTitleLarge();
                long j = ChaloTheme.a(composer2, i).f1915a;
                ComposableLambda composableLambda = ComposableSingletons$ProfileScreenUIKt.f3590a;
                boolean zChanged2 = composer2.changed(function0);
                Object objRememberedValue2 = composer2.rememberedValue();
                if (zChanged2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue2 = new ar0(function0, 25);
                    composer2.updateRememberedValue(objRememberedValue2);
                }
                ChaloCardComposeItemsKt.e(null, str3, titleLarge, j, composableLambda, (Function0) objRememberedValue2, composer2, 24576, 1);
            } else {
                composer2.startReplaceGroup(977815481);
            }
            composer2.endReplaceGroup();
            composer2.endNode();
            if (profileDrawerCardData.g) {
                composer2.startReplaceGroup(1857862214);
                ChaloSpacersKt.n(composer2, i);
                ProfileScreenUIKt.c(composer2, i);
            } else {
                composer2.startReplaceGroup(1838405653);
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

    /* JADX WARN: Multi-variable type inference failed */
    private final Object f(Object obj, Object obj2, Object obj3) {
        Dp dp;
        Dp dp2;
        Modifier modifier = (Modifier) this.b;
        ChaloWidgetCardSpec chaloWidgetCardSpec = (ChaloWidgetCardSpec) this.c;
        ChaloWidgetCardUiState chaloWidgetCardUiState = (ChaloWidgetCardUiState) this.d;
        ColumnScope ChaloRoundedCard = (ColumnScope) obj;
        Composer composer = (Composer) obj2;
        int iIntValue = ((Integer) obj3).intValue();
        Intrinsics.i(ChaloRoundedCard, "$this$ChaloRoundedCard");
        if (composer.shouldExecute((iIntValue & 17) != 16, iIntValue & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1770752183, iIntValue, -1, "app.chalo.home.ui.history.compose.components.ChaloWidgetCard.<anonymous> (PurchaseProductBottomSheetContent.kt:71)");
            }
            Modifier modifierC = ChaloThemeKt.c(BackgroundKt.m264backgroundbw27NRU$default(SizeKt.fillMaxWidth$default(modifier, 0.0f, 1, null), ChaloColorTokenKt.c(chaloWidgetCardSpec.f), null, 2, null), chaloWidgetCardSpec.f3465a);
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
            TextWithBackgroundUiState textWithBackgroundUiState = chaloWidgetCardUiState.d;
            if (textWithBackgroundUiState == null) {
                composer.startReplaceGroup(1035497030);
            } else {
                composer.startReplaceGroup(1035497031);
                UIShape.Rectangle rectangle = UIShape.f1926a;
                EmptyScreenViewKt.a(null, textWithBackgroundUiState, composer, 0);
            }
            composer.endReplaceGroup();
            List<TextWithBackgroundUiState> list = chaloWidgetCardUiState.e;
            if (list == null) {
                composer.startReplaceGroup(1035649147);
            } else {
                composer.startReplaceGroup(1035649148);
                ChaloSpacersKt.a(chaloWidgetCardSpec.b, composer, 0);
                composer.startReplaceGroup(1141789935);
                for (TextWithBackgroundUiState textWithBackgroundUiState2 : list) {
                    UIShape.Rectangle rectangle2 = UIShape.f1926a;
                    EmptyScreenViewKt.a(null, textWithBackgroundUiState2, composer, 0);
                }
                composer.endReplaceGroup();
            }
            composer.endReplaceGroup();
            List<TextWithBackgroundUiState> list2 = chaloWidgetCardUiState.f;
            if (list2 == null) {
                composer.startReplaceGroup(1035927775);
            } else {
                composer.startReplaceGroup(1035927776);
                ChaloSpacersKt.a(chaloWidgetCardSpec.c, composer, 0);
                composer.startReplaceGroup(1141798799);
                for (TextWithBackgroundUiState textWithBackgroundUiState3 : list2) {
                    UIShape.Rectangle rectangle3 = UIShape.f1926a;
                    EmptyScreenViewKt.a(null, textWithBackgroundUiState3, composer, 0);
                }
                composer.endReplaceGroup();
            }
            composer.endReplaceGroup();
            Object objRememberedValue = composer.rememberedValue();
            Composer.Companion companion2 = Composer.INSTANCE;
            if (objRememberedValue == companion2.getEmpty()) {
                objRememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
                composer.updateRememberedValue(objRememberedValue);
            }
            MutableState mutableState = (MutableState) objRememberedValue;
            ImageUrlUIState imageUrlUIState = chaloWidgetCardUiState.b;
            if (imageUrlUIState == null) {
                composer.startReplaceGroup(1036330558);
            } else {
                ImageUISize imageUISize = imageUrlUIState.c;
                composer.startReplaceGroup(1036330559);
                boolean zChanged = composer.changed(imageUISize);
                Object objRememberedValue2 = composer.rememberedValue();
                if (zChanged || objRememberedValue2 == companion2.getEmpty()) {
                    objRememberedValue2 = SizeKt.m833width3ABfNKs(SizeKt.m814height3ABfNKs(Modifier.INSTANCE, (imageUISize == null || (dp2 = imageUISize.f10034a) == null) ? Dp.m7278constructorimpl(61) : dp2.m7292unboximpl()), (imageUISize == null || (dp = imageUISize.b) == null) ? Dp.m7278constructorimpl(105) : dp.m7292unboximpl());
                    composer.updateRememberedValue(objRememberedValue2);
                }
                Modifier modifier2 = (Modifier) objRememberedValue2;
                if (((Boolean) mutableState.getValue()).booleanValue()) {
                    composer.startReplaceGroup(903294130);
                    ChaloSpacersKt.a(chaloWidgetCardSpec.d, composer, 0);
                } else {
                    composer.startReplaceGroup(899516408);
                }
                composer.endReplaceGroup();
                String str = imageUrlUIState.f10037a;
                ContentScale contentScaleC = ImageUIStateKt.c(imageUrlUIState.d);
                ComposableLambda composableLambdaRememberComposableLambda = ComposableLambdaKt.rememberComposableLambda(-209943929, true, new q80(3, chaloWidgetCardUiState, modifier2, mutableState), composer, 54);
                Object objRememberedValue3 = composer.rememberedValue();
                if (objRememberedValue3 == companion2.getEmpty()) {
                    objRememberedValue3 = new xq0(mutableState, 7);
                    composer.updateRememberedValue(objRememberedValue3);
                }
                SingletonSubcomposeAsyncImageKt.a(str, null, modifier2, null, null, composableLambdaRememberComposableLambda, (Function1) objRememberedValue3, null, null, contentScaleC, composer, 102236208, 0, 63160);
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

    private final Object g(Object obj, Object obj2, Object obj3) {
        String str;
        RegularBusScreenBottomSheetType regularBusScreenBottomSheetType = (RegularBusScreenBottomSheetType) this.b;
        RegularBusViewState regularBusViewState = (RegularBusViewState) this.c;
        Function1 function1 = (Function1) this.d;
        ColumnScope ChaloRoundedBottomSheet = (ColumnScope) obj;
        Composer composer = (Composer) obj2;
        int iIntValue = ((Integer) obj3).intValue();
        Intrinsics.i(ChaloRoundedBottomSheet, "$this$ChaloRoundedBottomSheet");
        if (composer.shouldExecute((iIntValue & 17) != 16, iIntValue & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1189631223, iIntValue, -1, "app.chalo.home.ui.regularbus.compose.RegularBusScreenUI.<anonymous>.<anonymous> (RegularBusScreenUI.kt:149)");
            }
            if (!Intrinsics.d(regularBusScreenBottomSheetType, RegularBusScreenBottomSheetType.SeatOccupancyInfoBottomSheet.f3634a)) {
                throw pk0.p(composer, -774302158);
            }
            composer.startReplaceGroup(1766602854);
            SeatOccupancyBottomSheetData seatOccupancyBottomSheetData = regularBusViewState.l;
            if (seatOccupancyBottomSheetData == null) {
                composer.startReplaceGroup(1766602853);
            } else {
                SpannableTextData spannableTextData = seatOccupancyBottomSheetData.e;
                composer.startReplaceGroup(1766602854);
                String string = null;
                boolean zChanged = composer.changed(spannableTextData != null ? spannableTextData.f2399a : null);
                Object objRememberedValue = composer.rememberedValue();
                if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    if (spannableTextData != null && (str = spannableTextData.f2399a) != null) {
                        AnnotatedString.Builder builder = new AnnotatedString.Builder(0, 1, null);
                        builder.append(str);
                        builder.addStyle(new SpanStyle(0L, 0L, FontWeight.INSTANCE.getBold(), (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (PlatformSpanStyle) null, (DrawStyle) null, 65531, (DefaultConstructorMarker) null), 0, 24);
                        string = builder.toAnnotatedString().toString();
                    }
                    composer.updateRememberedValue(string);
                    objRememberedValue = string;
                }
                String str2 = (String) objRememberedValue;
                boolean zChanged2 = composer.changed(function1);
                Object objRememberedValue2 = composer.rememberedValue();
                if (zChanged2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue2 = new t11(function1, 3);
                    composer.updateRememberedValue(objRememberedValue2);
                }
                Function0 function0 = (Function0) objRememberedValue2;
                boolean zChanged3 = composer.changed(function1);
                Object objRememberedValue3 = composer.rememberedValue();
                if (zChanged3 || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue3 = new t11(function1, 4);
                    composer.updateRememberedValue(objRememberedValue3);
                }
                SeatAvailabilityInfoBottomSheetKt.a(function0, (Function0) objRememberedValue3, seatOccupancyBottomSheetData.f3664a, seatOccupancyBottomSheetData.b, seatOccupancyBottomSheetData.c, seatOccupancyBottomSheetData.d, str2, seatOccupancyBottomSheetData.f, composer, 0);
            }
            composer.endReplaceGroup();
            composer.endReplaceGroup();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return Unit.f17538a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final Object h(Object obj, Object obj2, Object obj3) {
        float f;
        int i;
        int i2;
        RideFeedbackViewState rideFeedbackViewState = (RideFeedbackViewState) this.b;
        MutableState mutableState = (MutableState) this.c;
        Density density = (Density) this.d;
        BoxWithConstraintsScope BoxWithConstraints = (BoxWithConstraintsScope) obj;
        Composer composer = (Composer) obj2;
        int iIntValue = ((Integer) obj3).intValue();
        Intrinsics.i(BoxWithConstraints, "$this$BoxWithConstraints");
        if ((iIntValue & 6) == 0) {
            iIntValue |= composer.changed(BoxWithConstraints) ? 4 : 2;
        }
        if (composer.shouldExecute((iIntValue & 19) != 18, iIntValue & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(833552220, iIntValue, -1, "app.chalo.ridehailing.feedback.RideUserFeedbackFormScreen.<anonymous>.<anonymous> (RideUserFeedbackScreen.kt:106)");
            }
            float fM7278constructorimpl = Dp.m7278constructorimpl(Math.max(Dp.m7278constructorimpl(BoxWithConstraints.mo693getMaxHeightD9Ej5fM() - ((Dp) mutableState.getValue()).m7292unboximpl()), Dp.m7278constructorimpl(0)));
            RideFeedbackGridBackgroundUIState rideFeedbackGridBackgroundUIState = rideFeedbackViewState.f9170a.f9169a;
            if (rideFeedbackGridBackgroundUIState == null) {
                composer.startReplaceGroup(-1146590987);
                composer.endReplaceGroup();
                f = fM7278constructorimpl;
                i2 = 1;
                i = 0;
            } else {
                composer.startReplaceGroup(-1146590986);
                f = fM7278constructorimpl;
                i = 0;
                i2 = 1;
                VerticalGridLinesWithGradiantBackgroundKt.a(BoxWithConstraints.matchParentSize(Modifier.INSTANCE), ChaloColorToken.White.f9870a, rideFeedbackGridBackgroundUIState.f9142a, rideFeedbackGridBackgroundUIState.b, 0.0f, 0.0f, composer, 512, 96);
                composer.endReplaceGroup();
            }
            Modifier.Companion companion = Modifier.INSTANCE;
            Modifier modifierVerticalScroll$default = ScrollKt.verticalScroll$default(SizeKt.fillMaxSize$default(companion, 0.0f, i2, null), ScrollKt.rememberScrollState(i, composer, i, i2), false, null, false, 14, null);
            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composer, i);
            long currentCompositeKeyHashCode = ComposablesKt.getCurrentCompositeKeyHashCode(composer, i);
            int i3 = (int) (currentCompositeKeyHashCode ^ (currentCompositeKeyHashCode >>> 32));
            CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composer, modifierVerticalScroll$default);
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
            Updater.m3923setimpl(composerM3915constructorimpl, modifierMaterializeModifier, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion2, composerM3915constructorimpl, Integer.valueOf(i3), composerM3915constructorimpl));
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
            RideFeedbackHeaderUIState rideFeedbackHeaderUIState = rideFeedbackViewState.e;
            if (rideFeedbackHeaderUIState == null) {
                composer.startReplaceGroup(1332809212);
            } else {
                composer.startReplaceGroup(1332809213);
                boolean zChanged = composer.changed(mutableState) | composer.changed(density);
                Object objRememberedValue = composer.rememberedValue();
                if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = new p11(density, mutableState, 4);
                    composer.updateRememberedValue(objRememberedValue);
                }
                RideUserFeedbackScreenKt.f(OnGloballyPositionedModifierKt.onGloballyPositioned(companion, (Function1) objRememberedValue), rideFeedbackHeaderUIState, composer, i);
            }
            composer.endReplaceGroup();
            RideUserFeedbackScreenKt.d(SizeKt.m816heightInVpY3zN4$default(companion, f, 0.0f, 2, null), rideFeedbackViewState.f, composer, i);
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
        Function4 function4 = (Function4) this.b;
        Function4 function5 = (Function4) this.c;
        Function4 function6 = (Function4) this.d;
        SubcomposeAsyncImageScope subcomposeAsyncImageScope = (SubcomposeAsyncImageScope) obj;
        Composer composer = (Composer) obj2;
        int iIntValue = ((Integer) obj3).intValue();
        if ((iIntValue & 6) == 0) {
            iIntValue |= composer.changed(subcomposeAsyncImageScope) ? 4 : 2;
        }
        if (composer.shouldExecute((iIntValue & 19) != 18, iIntValue & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1106738291, iIntValue, -1, "coil3.compose.contentOf.<anonymous> (SubcomposeAsyncImage.kt:299)");
            }
            AsyncImagePainter.State state = (AsyncImagePainter.State) SnapshotStateKt.collectAsState(subcomposeAsyncImageScope.getB().r, null, composer, 0, 1).getValue();
            if (state instanceof AsyncImagePainter.State.Loading) {
                if (function4 != null) {
                    composer.startReplaceGroup(1576397282);
                    function4.invoke(subcomposeAsyncImageScope, state, composer, Integer.valueOf(iIntValue & 14));
                    composer.endReplaceGroup();
                    composer.startReplaceGroup(1611065525);
                } else {
                    composer.startReplaceGroup(1611065525);
                    composer.endReplaceGroup();
                    composer.startReplaceGroup(1576407562);
                    SubcomposeAsyncImageKt.b(subcomposeAsyncImageScope, null, null, null, null, null, 0.0f, null, false, composer, iIntValue & 14);
                }
            } else if (!(state instanceof AsyncImagePainter.State.Success)) {
                if (state instanceof AsyncImagePainter.State.Error) {
                    if (function6 != null) {
                        composer.startReplaceGroup(1576403106);
                        function6.invoke(subcomposeAsyncImageScope, state, composer, Integer.valueOf(iIntValue & 14));
                        composer.endReplaceGroup();
                        composer.startReplaceGroup(1611065525);
                    } else {
                        composer.startReplaceGroup(1611065525);
                        composer.endReplaceGroup();
                    }
                } else if (!(state instanceof AsyncImagePainter.State.Empty)) {
                    throw new NoWhenBranchMatchedException();
                }
                composer.startReplaceGroup(1576407562);
                SubcomposeAsyncImageKt.b(subcomposeAsyncImageScope, null, null, null, null, null, 0.0f, null, false, composer, iIntValue & 14);
            } else if (function5 != null) {
                composer.startReplaceGroup(1576400290);
                function5.invoke(subcomposeAsyncImageScope, state, composer, Integer.valueOf(iIntValue & 14));
                composer.endReplaceGroup();
                composer.startReplaceGroup(1611065525);
            } else {
                composer.startReplaceGroup(1611065525);
                composer.endReplaceGroup();
                composer.startReplaceGroup(1576407562);
                SubcomposeAsyncImageKt.b(subcomposeAsyncImageScope, null, null, null, null, null, 0.0f, null, false, composer, iIntValue & 14);
            }
            composer.endReplaceGroup();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return Unit.f17538a;
    }

    private final Object j(Object obj, Object obj2, Object obj3) {
        TextUIState textUIState = (TextUIState) this.b;
        SuperPassEnterUserDetailsUIState superPassEnterUserDetailsUIState = (SuperPassEnterUserDetailsUIState) this.c;
        SuperPassBasicUserInfoSectionUIState superPassBasicUserInfoSectionUIState = (SuperPassBasicUserInfoSectionUIState) this.d;
        LazyItemScope item = (LazyItemScope) obj;
        Composer composer = (Composer) obj2;
        int iIntValue = ((Integer) obj3).intValue();
        Intrinsics.i(item, "$this$item");
        if (composer.shouldExecute((iIntValue & 17) != 16, iIntValue & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-252351178, iIntValue, -1, "app.chalo.productpurchase.passpurchase.ui.enteruserdetails.SuperPassEnterUserDetailsScreenContent.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (SuperPassEnterUserDetailsScreen.kt:107)");
            }
            app.chalo.compose.components.TextKt.c(textUIState, PaddingKt.m788paddingqDBjuR0$default(ChaloThemeKt.c(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), superPassEnterUserDetailsUIState.d.b), 0.0f, superPassBasicUserInfoSectionUIState.e.f8410a, 0.0f, 0.0f, 13, null), null, null, composer, 0, 12);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return Unit.f17538a;
    }

    private final Object k(Object obj, Object obj2, Object obj3) {
        long jM4640getTransparent0d7_KjU;
        ColumnScope columnScope = (ColumnScope) this.b;
        TripPlannerTabType tripPlannerTabType = (TripPlannerTabType) this.c;
        TripPlannerTabType tripPlannerTabType2 = (TripPlannerTabType) this.d;
        Modifier modifier = (Modifier) obj;
        Composer composer = (Composer) obj2;
        int iIntValue = ((Integer) obj3).intValue();
        Intrinsics.i(modifier, "modifier");
        if ((iIntValue & 6) == 0) {
            iIntValue |= composer.changed(modifier) ? 4 : 2;
        }
        if (composer.shouldExecute((iIntValue & 19) != 18, iIntValue & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-39021325, iIntValue, -1, "app.chalo.livetracking.tripplanner.ui.result.ui.tripPlannerQuickFilterTab.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (TripPlannerResultsScreen.kt:584)");
            }
            Modifier modifierM835widthInVpY3zN4$default = SizeKt.m835widthInVpY3zN4$default(SizeKt.m816heightInVpY3zN4$default(SizeKt.fillMaxWidth$default(dq.a(columnScope, modifier, 1.0f, false, 2, null), 0.0f, 1, null), ChaloTheme.b(composer, 0).m, 0.0f, 2, null), ChaloTheme.b(composer, 0).A, 0.0f, 2, null);
            if (Intrinsics.d(tripPlannerTabType, tripPlannerTabType2)) {
                composer.startReplaceGroup(1155230814);
                composer.endReplaceGroup();
                jM4640getTransparent0d7_KjU = Color.INSTANCE.m4640getTransparent0d7_KjU();
            } else {
                composer.startReplaceGroup(1155230140);
                jM4640getTransparent0d7_KjU = ChaloTheme.a(composer, 0).A;
                composer.endReplaceGroup();
            }
            Modifier modifierM263backgroundbw27NRU = BackgroundKt.m263backgroundbw27NRU(modifierM835widthInVpY3zN4$default, jM4640getTransparent0d7_KjU, RoundedCornerShapeKt.getCircleShape());
            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getCenter(), false);
            long currentCompositeKeyHashCode = ComposablesKt.getCurrentCompositeKeyHashCode(composer, 0);
            int i = (int) (currentCompositeKeyHashCode ^ (currentCompositeKeyHashCode >>> 32));
            CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composer, modifierM263backgroundbw27NRU);
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
            pk0.v(companion, composerM3915constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy, composerM3915constructorimpl, currentCompositionLocalMap);
            Updater.m3923setimpl(composerM3915constructorimpl, modifierMaterializeModifier, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion, composerM3915constructorimpl, Integer.valueOf(i), composerM3915constructorimpl));
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            TextKt.m2623TextNvy7gAk(tripPlannerTabType.f4685a, PaddingKt.m785paddingVpY3zN4(Modifier.INSTANCE, ChaloTheme.b(composer, 0).e, ChaloTheme.b(composer, 0).f), tripPlannerTabType.equals(tripPlannerTabType2) ? Color.INSTANCE.m4642getWhite0d7_KjU() : Color.INSTANCE.m4631getBlack0d7_KjU(), null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ChaloTypographyKt.h(ChaloTheme.e(composer, 0)), composer, 0, 0, 131064);
            composer.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return Unit.f17538a;
    }

    private final Object l(Object obj, Object obj2, Object obj3) {
        int i;
        int i2;
        float f;
        Object obj4;
        ProductSummarySuccessScreenUISpec productSummarySuccessScreenUISpec = (ProductSummarySuccessScreenUISpec) this.b;
        TicketSummarySuccessScreenUIState ticketSummarySuccessScreenUIState = (TicketSummarySuccessScreenUIState) this.c;
        TicketSummaryScreenType.Success.CommonReceipt commonReceipt = (TicketSummaryScreenType.Success.CommonReceipt) this.d;
        PaddingValues innerPadding = (PaddingValues) obj;
        Composer composer = (Composer) obj2;
        int iIntValue = ((Integer) obj3).intValue();
        Intrinsics.i(innerPadding, "innerPadding");
        if ((iIntValue & 6) == 0) {
            iIntValue |= composer.changed(innerPadding) ? 4 : 2;
        }
        boolean zShouldExecute = composer.shouldExecute((iIntValue & 19) != 18, iIntValue & 1);
        Unit unit = Unit.f17538a;
        if (!zShouldExecute) {
            composer.skipToGroupEnd();
            return unit;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1893864439, iIntValue, -1, "app.chalo.productsummary.ui.compose.TicketSummarySuccessMainScreen.<anonymous>.<anonymous> (TripSummaryMainScreen.kt:473)");
        }
        Modifier.Companion companion = Modifier.INSTANCE;
        Modifier modifierFillMaxSize$default = SizeKt.fillMaxSize$default(PaddingKt.m788paddingqDBjuR0$default(companion, 0.0f, innerPadding.getTop(), 0.0f, 0.0f, 13, null), 0.0f, 1, null);
        ChaloColorToken chaloColorToken = productSummarySuccessScreenUISpec.b;
        ChaloPadding chaloPadding = productSummarySuccessScreenUISpec.f8757a;
        Modifier modifierVerticalScroll$default = ScrollKt.verticalScroll$default(BackgroundKt.m264backgroundbw27NRU$default(modifierFillMaxSize$default, ChaloColorTokenKt.c(chaloColorToken), null, 2, null), ScrollKt.rememberScrollState(0, composer, 0, 1), false, null, false, 14, null);
        Arrangement arrangement = Arrangement.INSTANCE;
        Arrangement.Vertical top = arrangement.getTop();
        Alignment.Companion companion2 = Alignment.INSTANCE;
        MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(top, companion2.getStart(), composer, 0);
        long currentCompositeKeyHashCode = ComposablesKt.getCurrentCompositeKeyHashCode(composer, 0);
        int i3 = (int) (currentCompositeKeyHashCode ^ (currentCompositeKeyHashCode >>> 32));
        CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
        Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composer, modifierVerticalScroll$default);
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
        Updater.m3923setimpl(composerM3915constructorimpl, modifierMaterializeModifier, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion3, composerM3915constructorimpl, Integer.valueOf(i3), composerM3915constructorimpl));
        ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
        Modifier modifierM264backgroundbw27NRU$default = BackgroundKt.m264backgroundbw27NRU$default(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), ChaloColorTokenKt.c(productSummarySuccessScreenUISpec.c), null, 2, null);
        MeasurePolicy measurePolicyColumnMeasurePolicy2 = ColumnKt.columnMeasurePolicy(arrangement.getTop(), companion2.getStart(), composer, 0);
        long currentCompositeKeyHashCode2 = ComposablesKt.getCurrentCompositeKeyHashCode(composer, 0);
        int i4 = (int) ((currentCompositeKeyHashCode2 >>> 32) ^ currentCompositeKeyHashCode2);
        CompositionLocalMap currentCompositionLocalMap2 = composer.getCurrentCompositionLocalMap();
        Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(composer, modifierM264backgroundbw27NRU$default);
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
        pk0.v(companion3, composerM3915constructorimpl2, measurePolicyColumnMeasurePolicy2, composerM3915constructorimpl2, currentCompositionLocalMap2);
        Updater.m3923setimpl(composerM3915constructorimpl2, modifierMaterializeModifier2, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion3, composerM3915constructorimpl2, Integer.valueOf(i4), composerM3915constructorimpl2));
        ChaloSpacersKt.o(composer, 0);
        ProductSummaryStatusUiData productSummaryStatusUiData = ticketSummarySuccessScreenUIState.f;
        DividerUIState dividerUIState = ticketSummarySuccessScreenUIState.j;
        if (productSummaryStatusUiData == null) {
            composer.startReplaceGroup(-1240215851);
        } else {
            composer.startReplaceGroup(-1240215850);
            ProductStatusComponentKt.a(ChaloThemeKt.c(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), chaloPadding), productSummaryStatusUiData, composer, 0);
            ChaloSpacersKt.o(composer, 0);
        }
        composer.endReplaceGroup();
        composer.startReplaceGroup(-1148370606);
        Iterator it = ticketSummarySuccessScreenUIState.c.iterator();
        while (it.hasNext()) {
            ProductStatusComponentKt.a(ChaloThemeKt.c(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), chaloPadding), (ProductSummaryStatusUiData) it.next(), composer, 0);
            ChaloSpacersKt.o(composer, 0);
        }
        composer.endReplaceGroup();
        TicketInfoUIState ticketInfoUIState = ticketSummarySuccessScreenUIState.d;
        if (ticketInfoUIState == null) {
            composer.startReplaceGroup(-1239317564);
            composer.endReplaceGroup();
            i = 0;
        } else {
            composer.startReplaceGroup(-1239317563);
            i = 0;
            TripSummaryMainScreenKt.c(ChaloThemeKt.c(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), chaloPadding), ticketInfoUIState, composer, 0);
            composer.endReplaceGroup();
        }
        BookingDetailsUIState bookingDetailsUIState = ticketSummarySuccessScreenUIState.e;
        if (bookingDetailsUIState == null) {
            composer.startReplaceGroup(-1238925941);
        } else {
            composer.startReplaceGroup(-1238925940);
            ChaloSpacersKt.o(composer, i);
            DividerUIStateKt.a(null, dividerUIState, composer, i, 1);
            ChaloSpacersKt.o(composer, i);
            BookingDetailsComponentKt.a(ChaloThemeKt.c(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), chaloPadding), bookingDetailsUIState, composer, i);
        }
        composer.endReplaceGroup();
        GroupTicketPriceDetailsUiState groupTicketPriceDetailsUiState = ticketSummarySuccessScreenUIState.h;
        PriceDetailsUIState priceDetailsUIState = ticketSummarySuccessScreenUIState.g;
        if (groupTicketPriceDetailsUiState == null && (priceDetailsUIState == null || (priceDetailsUIState.c.isEmpty() && priceDetailsUIState.b == null))) {
            composer.startReplaceGroup(-1257546121);
            composer.endReplaceGroup();
            i2 = 0;
            f = 0.0f;
            obj4 = null;
        } else {
            composer.startReplaceGroup(-1238004434);
            ChaloSpacersKt.o(composer, 0);
            Unit unit2 = null;
            DividerUIStateKt.a(null, dividerUIState, composer, 0, 1);
            ChaloSpacersKt.o(composer, 0);
            if (groupTicketPriceDetailsUiState == null) {
                composer.startReplaceGroup(-1237797665);
                composer.endReplaceGroup();
            } else {
                composer.startReplaceGroup(-1237797664);
                GroupTicketSummaryScreenKt.f(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), groupTicketPriceDetailsUiState, composer, 70, 0);
                composer.endReplaceGroup();
                unit2 = unit;
            }
            if (unit2 == null) {
                composer.startReplaceGroup(-1237527499);
                if (priceDetailsUIState == null) {
                    composer.startReplaceGroup(-1237527500);
                    composer.endReplaceGroup();
                    i2 = 0;
                    f = 0.0f;
                    obj4 = null;
                } else {
                    composer.startReplaceGroup(-1237527499);
                    f = 0.0f;
                    obj4 = null;
                    i2 = 0;
                    FareSplitComponentKt.b(ChaloThemeKt.c(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), chaloPadding), priceDetailsUIState, composer, 0);
                    composer.endReplaceGroup();
                }
                composer.endReplaceGroup();
            } else {
                i2 = 0;
                f = 0.0f;
                obj4 = null;
                composer.startReplaceGroup(-1148307827);
                composer.endReplaceGroup();
            }
            composer.endReplaceGroup();
        }
        ChaloSpacersKt.n(composer, i2);
        ProductDownloadInvoiceOptionUIState productDownloadInvoiceOptionUIState = ticketSummarySuccessScreenUIState.k;
        if (productDownloadInvoiceOptionUIState == null) {
            composer.startReplaceGroup(-1237046628);
        } else {
            composer.startReplaceGroup(-1237046627);
            ChaloSpacersKt.n(composer, i2);
            PassSummarySuccessMainScreenKt.a(productDownloadInvoiceOptionUIState, composer, i2);
            ChaloSpacersKt.n(composer, i2);
        }
        composer.endReplaceGroup();
        composer.endNode();
        float f2 = f;
        Object obj5 = obj4;
        ChaloZigzagPathComposableKt.a(null, 0L, 0.0f, 0.0f, 0.0f, composer, 0, 31);
        Composer composer2 = composer;
        TicketSupportUIState ticketSupportUIState = ticketSummarySuccessScreenUIState.l;
        if (ticketSupportUIState == null) {
            composer2.startReplaceGroup(2123826862);
        } else {
            TicketSupportUIStateSpec ticketSupportUIStateSpec = ticketSupportUIState.f8828a;
            composer2.startReplaceGroup(2123826863);
            ChaloSpacersKt.a(ticketSummarySuccessScreenUIState.f8826a.d, composer2, 0);
            Modifier modifierC = ChaloThemeKt.c(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, f2, 1, obj5), ticketSupportUIStateSpec.f8829a);
            MeasurePolicy measurePolicyColumnMeasurePolicy3 = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getCenterHorizontally(), composer2, 48);
            long currentCompositeKeyHashCode3 = ComposablesKt.getCurrentCompositeKeyHashCode(composer2, 0);
            int i5 = (int) ((currentCompositeKeyHashCode3 >>> 32) ^ currentCompositeKeyHashCode3);
            CompositionLocalMap currentCompositionLocalMap3 = composer2.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier3 = ComposedModifierKt.materializeModifier(composer2, modifierC);
            ComposeUiNode.Companion companion4 = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor3 = companion4.getConstructor();
            if (composer2.getApplier() == null) {
                ComposablesKt.invalidApplier();
            }
            composer2.startReusableNode();
            if (composer2.getInserting()) {
                composer2.createNode(constructor3);
            } else {
                composer2.useNode();
            }
            Composer composerM3915constructorimpl3 = Updater.m3915constructorimpl(composer2);
            pk0.v(companion4, composerM3915constructorimpl3, measurePolicyColumnMeasurePolicy3, composerM3915constructorimpl3, currentCompositionLocalMap3);
            Updater.m3923setimpl(composerM3915constructorimpl3, modifierMaterializeModifier3, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion4, composerM3915constructorimpl3, Integer.valueOf(i5), composerM3915constructorimpl3));
            ColumnScopeInstance columnScopeInstance2 = ColumnScopeInstance.INSTANCE;
            ChaloTextViewKt.a(null, ticketSupportUIState.b, null, null, composer2, 0, 13);
            ChaloSpacersKt.a(ticketSupportUIStateSpec.b, composer2, 0);
            ChaloTextViewKt.a(null, ticketSupportUIState.c, null, null, composer2, 0, 13);
            composer2.endNode();
        }
        composer2.endReplaceGroup();
        ImageUrlUIState imageUrlUIState = commonReceipt.d;
        TextUIState.ChaloTextUIState chaloTextUIState = commonReceipt.c;
        if (imageUrlUIState == null || chaloTextUIState == null) {
            composer2.startReplaceGroup(2125032112);
            ImageUIState imageUIState = commonReceipt.e;
            if (imageUIState == null) {
                composer2.startReplaceGroup(2125032111);
            } else {
                composer2.startReplaceGroup(2125032112);
                ChaloSpacersKt.g(composer2, 0);
                Modifier modifierFillMaxSize$default2 = SizeKt.fillMaxSize$default(Modifier.INSTANCE, f2, 1, obj5);
                MeasurePolicy measurePolicyColumnMeasurePolicy4 = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getCenterHorizontally(), composer2, 48);
                long currentCompositeKeyHashCode4 = ComposablesKt.getCurrentCompositeKeyHashCode(composer2, 0);
                int i6 = (int) (currentCompositeKeyHashCode4 ^ (currentCompositeKeyHashCode4 >>> 32));
                CompositionLocalMap currentCompositionLocalMap4 = composer2.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier4 = ComposedModifierKt.materializeModifier(composer2, modifierFillMaxSize$default2);
                ComposeUiNode.Companion companion5 = ComposeUiNode.INSTANCE;
                Function0<ComposeUiNode> constructor4 = companion5.getConstructor();
                if (composer2.getApplier() == null) {
                    ComposablesKt.invalidApplier();
                }
                composer2.startReusableNode();
                if (composer2.getInserting()) {
                    composer2.createNode(constructor4);
                } else {
                    composer2.useNode();
                }
                Composer composerM3915constructorimpl4 = Updater.m3915constructorimpl(composer2);
                pk0.v(companion5, composerM3915constructorimpl4, measurePolicyColumnMeasurePolicy4, composerM3915constructorimpl4, currentCompositionLocalMap4);
                Updater.m3923setimpl(composerM3915constructorimpl4, modifierMaterializeModifier4, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion5, composerM3915constructorimpl4, Integer.valueOf(i6), composerM3915constructorimpl4));
                ColumnScopeInstance columnScopeInstance3 = ColumnScopeInstance.INSTANCE;
                if (chaloTextUIState == null) {
                    composer2.startReplaceGroup(-2037159052);
                } else {
                    composer2.startReplaceGroup(-2037159051);
                    ChaloTextViewKt.a(null, chaloTextUIState, null, null, composer2, 0, 13);
                    ChaloSpacersKt.u(composer2, 0);
                }
                composer2.endReplaceGroup();
                CommonImageKt.a(imageUIState, null, false, composer2, 0, 6);
                composer2 = composer2;
                composer2.endNode();
            }
            composer2.endReplaceGroup();
            composer2.endReplaceGroup();
        } else {
            composer2.startReplaceGroup(2124747594);
            ConfirmSuperPassScreenKt.s(imageUrlUIState, chaloTextUIState, null, composer2, 0, 4);
            composer2 = composer2;
            composer2.endReplaceGroup();
        }
        ChaloSpacersKt.d(composer2, 0);
        composer2.endNode();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return unit;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        Modifier modifier;
        Composer composer;
        int i = this.f18582a;
        Unit unit = Unit.f17538a;
        Object obj4 = this.c;
        Object obj5 = this.b;
        Object obj6 = this.d;
        switch (i) {
            case 0:
                String str = (String) obj5;
                String str2 = (String) obj4;
                String str3 = (String) obj6;
                ColumnScope ChaloRoundedCard = (ColumnScope) obj;
                Composer composer2 = (Composer) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                Intrinsics.i(ChaloRoundedCard, "$this$ChaloRoundedCard");
                if (composer2.shouldExecute((iIntValue & 17) != 16, iIntValue & 1)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-11117936, iIntValue, -1, "app.chalo.validationsdk.blevalidation.ui.TicketDetailsUI.<anonymous> (BleValidationScreen.android.kt:654)");
                    }
                    BleValidationScreen_androidKt.M(str, str2, str3, composer2, 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer2.skipToGroupEnd();
                }
                return unit;
            case 1:
                return CarouselItemScopeImpl.rememberMaskShape$lambda$1$lambda$0((CarouselItemScopeImpl) obj5, (Shape) obj4, (Density) obj6, (Path) obj, (Size) obj2, (LayoutDirection) obj3);
            case 2:
                int iIntValue2 = ((Integer) obj).intValue();
                int iIntValue3 = ((Integer) obj2).intValue();
                String amOrPm = (String) obj3;
                Intrinsics.i(amOrPm, "amOrPm");
                ((MutableIntState) obj5).setIntValue(iIntValue2);
                ((MutableIntState) obj4).setIntValue(iIntValue3);
                ((MutableState) obj6).setValue(amOrPm);
                return unit;
            case 3:
                PBStopSelectionScreenBottomSheetType pBStopSelectionScreenBottomSheetType = (PBStopSelectionScreenBottomSheetType) obj5;
                Function1 function1 = (Function1) obj4;
                ChaloBusViewState chaloBusViewState = (ChaloBusViewState) obj6;
                ColumnScope ChaloRoundedBottomSheet = (ColumnScope) obj;
                Composer composer3 = (Composer) obj2;
                int iIntValue4 = ((Integer) obj3).intValue();
                Intrinsics.i(ChaloRoundedBottomSheet, "$this$ChaloRoundedBottomSheet");
                if (composer3.shouldExecute((iIntValue4 & 17) != 16, iIntValue4 & 1)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1645545562, iIntValue4, -1, "app.chalo.home.ui.chalobus.ChaloBusScreenUI.<anonymous>.<anonymous> (ChaloBusScreenUI.kt:194)");
                    }
                    if (Intrinsics.d(pBStopSelectionScreenBottomSheetType, PBStopSelectionScreenBottomSheetType.NoOriginDestinationPairsAvailable.f7959a)) {
                        composer3.startReplaceGroup(309018473);
                        boolean zChanged = composer3.changed(function1);
                        Object objRememberedValue = composer3.rememberedValue();
                        if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = new fh(function1, 23);
                            composer3.updateRememberedValue(objRememberedValue);
                        }
                        Function0 function0 = (Function0) objRememberedValue;
                        boolean zChanged2 = composer3.changed(function1);
                        Object objRememberedValue2 = composer3.rememberedValue();
                        if (zChanged2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue2 = new fh(function1, 26);
                            composer3.updateRememberedValue(objRememberedValue2);
                        }
                        PremiumBusStopSelectionScreenKt.f(function0, (Function0) objRememberedValue2, composer3, 0);
                        composer3.endReplaceGroup();
                    } else if (pBStopSelectionScreenBottomSheetType instanceof PBStopSelectionScreenBottomSheetType.PremiumBusDateAndTimePickerBottomSheet) {
                        composer3.startReplaceGroup(309645169);
                        PremiumBusSlotSelectionDateAndTimePickerUIState premiumBusSlotSelectionDateAndTimePickerUIState = ((PBStopSelectionScreenBottomSheetType.PremiumBusDateAndTimePickerBottomSheet) pBStopSelectionScreenBottomSheetType).f7961a;
                        ComposableLambda composableLambdaRememberComposableLambda = ComposableLambdaKt.rememberComposableLambda(-2058382340, true, new h3(5, chaloBusViewState, function1), composer3, 54);
                        boolean zChanged3 = composer3.changed(function1);
                        Object objRememberedValue3 = composer3.rememberedValue();
                        if (zChanged3 || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue3 = new ab(function1, 4);
                            composer3.updateRememberedValue(objRememberedValue3);
                        }
                        PremiumBusSlotSelectionUiStateKt.n(premiumBusSlotSelectionDateAndTimePickerUIState, composableLambdaRememberComposableLambda, (Function3) objRememberedValue3, composer3, 48, 0);
                        composer3.endReplaceGroup();
                    } else if ((pBStopSelectionScreenBottomSheetType instanceof PBStopSelectionScreenBottomSheetType.MultipleOriginDestinationSelection) || (pBStopSelectionScreenBottomSheetType instanceof PBStopSelectionScreenBottomSheetType.NewRouteSuggestion) || Intrinsics.d(pBStopSelectionScreenBottomSheetType, PBStopSelectionScreenBottomSheetType.NoProductFoundBottomSheet.f7960a) || (pBStopSelectionScreenBottomSheetType instanceof PBStopSelectionScreenBottomSheetType.NewRouteSuggestionSubmitSuccess)) {
                        composer3.startReplaceGroup(311553560);
                        gf.r(Modifier.INSTANCE, ChaloTheme.b(composer3, 0).b, composer3, 0);
                    } else {
                        if (!(pBStopSelectionScreenBottomSheetType instanceof PBStopSelectionScreenBottomSheetType.PremiumPassSavingsFaqsBottomSheet)) {
                            throw pk0.p(composer3, -821316508);
                        }
                        composer3.startReplaceGroup(311753510);
                        List list = ((PBStopSelectionScreenBottomSheetType.PremiumPassSavingsFaqsBottomSheet) pBStopSelectionScreenBottomSheetType).f7962a;
                        boolean zChanged4 = composer3.changed(function1);
                        Object objRememberedValue4 = composer3.rememberedValue();
                        if (zChanged4 || objRememberedValue4 == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue4 = new fh(function1, 27);
                            composer3.updateRememberedValue(objRememberedValue4);
                        }
                        ChaloBusScreenUIKt.p(list, (Function0) objRememberedValue4, composer3, 0);
                        composer3.endReplaceGroup();
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer3.skipToGroupEnd();
                }
                return unit;
            case 4:
                List list2 = (List) obj5;
                Function0 function2 = (Function0) obj4;
                Object obj7 = (Function1) obj6;
                BoxWithConstraintsScope BoxWithConstraints = (BoxWithConstraintsScope) obj;
                Composer composer4 = (Composer) obj2;
                int iIntValue5 = ((Integer) obj3).intValue();
                Intrinsics.i(BoxWithConstraints, "$this$BoxWithConstraints");
                if ((iIntValue5 & 6) == 0) {
                    iIntValue5 |= composer4.changed(BoxWithConstraints) ? 4 : 2;
                }
                if (composer4.shouldExecute((iIntValue5 & 19) != 18, iIntValue5 & 1)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1704627358, iIntValue5, -1, "app.chalo.home.ui.chalobus.PremiumBusGuideSection.<anonymous>.<anonymous> (ChaloBusScreenUI.kt:589)");
                    }
                    float f = ChaloTheme.b(composer4, 0).h;
                    float f2 = ChaloTheme.b(composer4, 0).h;
                    float fM7292unboximpl = ((Dp) RangesKt.b(Dp.m7276boximpl(Dp.m7278constructorimpl(BoxWithConstraints.mo694getMaxWidthD9Ej5fM() * 0.5f)), Dp.m7276boximpl(ChaloTheme.b(composer4, 0).v))).m7292unboximpl();
                    Modifier modifierM788paddingqDBjuR0$default = PaddingKt.m788paddingqDBjuR0$default(ScrollKt.horizontalScroll$default(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), ScrollKt.rememberScrollState(0, composer4, 0, 1), false, null, false, 14, null), f, 0.0f, f, ChaloTheme.b(composer4, 0).d, 2, null);
                    MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.m672spacedBy0680j_4(f2), Alignment.INSTANCE.getTop(), composer4, 0);
                    long currentCompositeKeyHashCode = ComposablesKt.getCurrentCompositeKeyHashCode(composer4, 0);
                    int i2 = (int) (currentCompositeKeyHashCode ^ (currentCompositeKeyHashCode >>> 32));
                    CompositionLocalMap currentCompositionLocalMap = composer4.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composer4, modifierM788paddingqDBjuR0$default);
                    ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
                    Function0<ComposeUiNode> constructor = companion.getConstructor();
                    if (composer4.getApplier() == null) {
                        ComposablesKt.invalidApplier();
                    }
                    composer4.startReusableNode();
                    if (composer4.getInserting()) {
                        composer4.createNode(constructor);
                    } else {
                        composer4.useNode();
                    }
                    Composer composerM3915constructorimpl = Updater.m3915constructorimpl(composer4);
                    pk0.v(companion, composerM3915constructorimpl, measurePolicyRowMeasurePolicy, composerM3915constructorimpl, currentCompositionLocalMap);
                    Updater.m3923setimpl(composerM3915constructorimpl, modifierMaterializeModifier, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion, composerM3915constructorimpl, Integer.valueOf(i2), composerM3915constructorimpl));
                    RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
                    composer4.startReplaceGroup(-932211207);
                    int i3 = 0;
                    for (Object obj8 : CollectionsKt.x0(list2, 3)) {
                        int i4 = i3 + 1;
                        if (i3 < 0) {
                            CollectionsKt.z0();
                            throw null;
                        }
                        PremiumBusTutorialConfigUiModel premiumBusTutorialConfigUiModel = (PremiumBusTutorialConfigUiModel) obj8;
                        Modifier modifierM833width3ABfNKs = SizeKt.m833width3ABfNKs(Modifier.INSTANCE, fM7292unboximpl);
                        boolean zChanged5 = composer4.changed(obj7) | composer4.changed(premiumBusTutorialConfigUiModel);
                        Object objRememberedValue5 = composer4.rememberedValue();
                        if (zChanged5 || objRememberedValue5 == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue5 = new l3(26, obj7, premiumBusTutorialConfigUiModel);
                            composer4.updateRememberedValue(objRememberedValue5);
                        }
                        ChaloBusScreenUIKt.m(premiumBusTutorialConfigUiModel, (Function0) objRememberedValue5, modifierM833width3ABfNKs, composer4, 0);
                        i3 = i4;
                    }
                    composer4.endReplaceGroup();
                    if (list2.size() > 3) {
                        composer4.startReplaceGroup(1166570826);
                        ChaloBusScreenUIKt.o(6, composer4, Modifier.INSTANCE, function2);
                    } else {
                        composer4.startReplaceGroup(1140757064);
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
            case 5:
                LazyPagingItems lazyPagingItems = (LazyPagingItems) obj5;
                CardTransactionHistoryViewState cardTransactionHistoryViewState = (CardTransactionHistoryViewState) obj4;
                Function1 function3 = (Function1) obj6;
                LazyItemScope item = (LazyItemScope) obj;
                Composer composer5 = (Composer) obj2;
                int iIntValue6 = ((Integer) obj3).intValue();
                Intrinsics.i(item, "$this$item");
                if ((iIntValue6 & 6) == 0) {
                    iIntValue6 |= composer5.changed(item) ? 4 : 2;
                }
                if (composer5.shouldExecute((iIntValue6 & 19) != 18, iIntValue6 & 1)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(294648857, iIntValue6, -1, "app.chalo.ncmc.ui.transactionhistory.compose.ChaloCardTransactionListUI.<anonymous>.<anonymous>.<anonymous> (ChaloCardTransactionsScreen.kt:310)");
                    }
                    ChaloCardTransactionsScreenKt.a(LazyPagingItems.$stable << 3, composer5, de0.e(item, Modifier.INSTANCE, 0.0f, 1, null), lazyPagingItems, cardTransactionHistoryViewState, function3);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer5.skipToGroupEnd();
                }
                return unit;
            case 6:
                CardTransactionHistoryViewState cardTransactionHistoryViewState2 = (CardTransactionHistoryViewState) obj5;
                Function0 function4 = (Function0) obj4;
                Function1 function5 = (Function1) obj6;
                Composer composer6 = (Composer) obj2;
                int iIntValue7 = ((Integer) obj3).intValue();
                Intrinsics.i((LazyItemScope) obj, "$this$item");
                if (composer6.shouldExecute((iIntValue7 & 17) != 16, iIntValue7 & 1)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-423383921, iIntValue7, -1, "app.chalo.ncmc.ui.transactionhistory.compose.ChaloCardTransactionListUI.<anonymous>.<anonymous>.<anonymous> (ChaloCardTransactionsScreen.kt:278)");
                    }
                    Modifier modifierFillMaxSize$default = SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null);
                    String str4 = cardTransactionHistoryViewState2.e;
                    boolean zChanged6 = composer6.changed(function5);
                    Object objRememberedValue6 = composer6.rememberedValue();
                    if (zChanged6 || objRememberedValue6 == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue6 = new ii(function5, 23);
                        composer6.updateRememberedValue(objRememberedValue6);
                    }
                    ChaloCardTransactionsScreenKt.d(modifierFillMaxSize$default, str4, function4, (Function0) objRememberedValue6, composer6, 6);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer6.skipToGroupEnd();
                }
                return unit;
            case 7:
                WindowInsets windowInsets = (WindowInsets) obj5;
                Density density = (Density) obj4;
                Function3 function6 = (Function3) obj6;
                BoxWithConstraintsScope BoxWithConstraints2 = (BoxWithConstraintsScope) obj;
                Composer composer7 = (Composer) obj2;
                int iIntValue8 = ((Integer) obj3).intValue();
                Intrinsics.i(BoxWithConstraints2, "$this$BoxWithConstraints");
                if ((iIntValue8 & 6) == 0) {
                    iIntValue8 |= composer7.changed(BoxWithConstraints2) ? 4 : 2;
                }
                if (composer7.shouldExecute((iIntValue8 & 19) != 18, iIntValue8 & 1)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-285718786, iIntValue8, -1, "app.chalo.compose.components.ChaloRoundedBottomSheet.<anonymous>.<anonymous> (ChaloRoundedBottomSheet.kt:44)");
                    }
                    int iM7242getMaxHeightimpl = Constraints.m7242getMaxHeightimpl(BoxWithConstraints2.mo692getConstraintsmsEJaDk()) - windowInsets.getTop(density);
                    if (iM7242getMaxHeightimpl < 0) {
                        iM7242getMaxHeightimpl = 0;
                    }
                    Modifier modifierM788paddingqDBjuR0$default2 = PaddingKt.m788paddingqDBjuR0$default(SizeKt.m816heightInVpY3zN4$default(Modifier.INSTANCE, 0.0f, density.mo401toDpu2uoSUM(iM7242getMaxHeightimpl), 1, null), 0.0f, 0.0f, 0.0f, NavigationBottomInsets_androidKt.a(), 7, null);
                    MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composer7, 0);
                    long currentCompositeKeyHashCode2 = ComposablesKt.getCurrentCompositeKeyHashCode(composer7, 0);
                    int i5 = (int) (currentCompositeKeyHashCode2 ^ (currentCompositeKeyHashCode2 >>> 32));
                    CompositionLocalMap currentCompositionLocalMap2 = composer7.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(composer7, modifierM788paddingqDBjuR0$default2);
                    ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
                    Function0<ComposeUiNode> constructor2 = companion2.getConstructor();
                    if (composer7.getApplier() == null) {
                        ComposablesKt.invalidApplier();
                    }
                    composer7.startReusableNode();
                    if (composer7.getInserting()) {
                        composer7.createNode(constructor2);
                    } else {
                        composer7.useNode();
                    }
                    Composer composerM3915constructorimpl2 = Updater.m3915constructorimpl(composer7);
                    pk0.v(companion2, composerM3915constructorimpl2, measurePolicyColumnMeasurePolicy, composerM3915constructorimpl2, currentCompositionLocalMap2);
                    Updater.m3923setimpl(composerM3915constructorimpl2, modifierMaterializeModifier2, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion2, composerM3915constructorimpl2, Integer.valueOf(i5), composerM3915constructorimpl2));
                    function6.invoke(ColumnScopeInstance.INSTANCE, composer7, 6);
                    composer7.endNode();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer7.skipToGroupEnd();
                }
                return unit;
            case 8:
                Function0 function7 = (Function0) obj4;
                Painter painter = (Painter) obj6;
                String str5 = (String) obj5;
                ColumnScope ChaloRoundedCard2 = (ColumnScope) obj;
                Composer composer8 = (Composer) obj2;
                int iIntValue9 = ((Integer) obj3).intValue();
                Intrinsics.i(ChaloRoundedCard2, "$this$ChaloRoundedCard");
                if (composer8.shouldExecute((iIntValue9 & 17) != 16, iIntValue9 & 1)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1525774502, iIntValue9, -1, "app.chalo.compose.components.ChaloSearchBar.<anonymous> (ChaloSearchBar.kt:36)");
                    }
                    Modifier modifierM299clickableoSLSa3U$default = Modifier.INSTANCE;
                    Modifier modifierClip = ClipKt.clip(SizeKt.fillMaxWidth$default(modifierM299clickableoSLSa3U$default, 0.0f, 1, null), RoundedCornerShapeKt.m1074RoundedCornerShape0680j_4(ChaloTheme.b(composer8, 6).j));
                    if (function7 != null) {
                        modifierM299clickableoSLSa3U$default = ClickableKt.m299clickableoSLSa3U$default(modifierM299clickableoSLSa3U$default, false, null, null, null, function7, 15, null);
                        modifier = modifierM299clickableoSLSa3U$default;
                    } else {
                        modifier = modifierM299clickableoSLSa3U$default;
                    }
                    Modifier modifierAnimateContentSize$default = AnimationModifierKt.animateContentSize$default(PaddingKt.m784padding3ABfNKs(modifierClip.then(modifierM299clickableoSLSa3U$default), ChaloTheme.b(composer8, 6).e), null, null, 3, null);
                    MeasurePolicy measurePolicyRowMeasurePolicy2 = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), Alignment.INSTANCE.getCenterVertically(), composer8, 48);
                    long currentCompositeKeyHashCode3 = ComposablesKt.getCurrentCompositeKeyHashCode(composer8, 0);
                    int i6 = (int) (currentCompositeKeyHashCode3 ^ (currentCompositeKeyHashCode3 >>> 32));
                    CompositionLocalMap currentCompositionLocalMap3 = composer8.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier3 = ComposedModifierKt.materializeModifier(composer8, modifierAnimateContentSize$default);
                    ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
                    Function0<ComposeUiNode> constructor3 = companion3.getConstructor();
                    if (composer8.getApplier() == null) {
                        ComposablesKt.invalidApplier();
                    }
                    composer8.startReusableNode();
                    if (composer8.getInserting()) {
                        composer8.createNode(constructor3);
                    } else {
                        composer8.useNode();
                    }
                    Composer composerM3915constructorimpl3 = Updater.m3915constructorimpl(composer8);
                    pk0.v(companion3, composerM3915constructorimpl3, measurePolicyRowMeasurePolicy2, composerM3915constructorimpl3, currentCompositionLocalMap3);
                    Updater.m3923setimpl(composerM3915constructorimpl3, modifierMaterializeModifier3, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion3, composerM3915constructorimpl3, Integer.valueOf(i6), composerM3915constructorimpl3));
                    RowScopeInstance rowScopeInstance2 = RowScopeInstance.INSTANCE;
                    if (painter == null) {
                        composer8.startReplaceGroup(-182701124);
                        composer8.endReplaceGroup();
                        composer = composer8;
                    } else {
                        composer8.startReplaceGroup(-182701123);
                        ImageKt.Image(painter, (String) null, SizeKt.m828size3ABfNKs(modifier, ChaloTheme.b(composer8, 6).E), (Alignment) null, ContentScale.INSTANCE.getFit(), 0.0f, (ColorFilter) null, composer8, Painter.$stable | 24624, 104);
                        composer = composer8;
                        ChaloSpacersKt.x(composer, 0);
                        composer.endReplaceGroup();
                    }
                    TextKt.m2623TextNvy7gAk(str5, null, ChaloTheme.a(composer, 6).e, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ChaloTypographyKt.a(ChaloTheme.e(composer, 6).getHeadlineMedium()), composer, 0, 0, 131066);
                    composer.endNode();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer8.skipToGroupEnd();
                }
                return unit;
            case 9:
                return DragHandleKt.VerticalDragHandle$lambda$13$lambda$12((DragHandleSizes) obj5, (State) obj4, (MutableState) obj6, (MeasureScope) obj, (Measurable) obj2, (Constraints) obj3);
            case 10:
                Function1 function8 = (Function1) obj5;
                HomeScreenFragmentViewState homeScreenFragmentViewState = (HomeScreenFragmentViewState) obj4;
                MutableState mutableState = (MutableState) obj6;
                ColumnScope ChaloRoundedBottomSheet2 = (ColumnScope) obj;
                Composer composer9 = (Composer) obj2;
                int iIntValue10 = ((Integer) obj3).intValue();
                Intrinsics.i(ChaloRoundedBottomSheet2, "$this$ChaloRoundedBottomSheet");
                if (composer9.shouldExecute((iIntValue10 & 17) != 16, iIntValue10 & 1)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1369018978, iIntValue10, -1, "app.chalo.home.ui.base.BottomNavigationUI.<anonymous>.<anonymous> (HomeScreenMainDecompose.kt:261)");
                    }
                    CommonBottomSheetData commonBottomSheetData = ((BottomSheetState) mutableState.getValue()).f2843a;
                    if (commonBottomSheetData instanceof CommonBottomSheetData.GenericBottomSheetData) {
                        composer9.startReplaceGroup(-564708562);
                        CommonBottomSheetData.GenericBottomSheetData genericBottomSheetData = (CommonBottomSheetData.GenericBottomSheetData) commonBottomSheetData;
                        ChaloBottomSheetLayoutType chaloBottomSheetLayoutType = genericBottomSheetData.f;
                        if (chaloBottomSheetLayoutType instanceof ChaloBottomSheetLayoutType.Default) {
                            composer9.startReplaceGroup(-564709957);
                            IconType iconType = genericBottomSheetData.f2850a;
                            String str6 = genericBottomSheetData.b;
                            String str7 = genericBottomSheetData.c;
                            String str8 = genericBottomSheetData.d;
                            String str9 = genericBottomSheetData.e;
                            boolean zChanged7 = composer9.changed(function8);
                            Object objRememberedValue7 = composer9.rememberedValue();
                            if (zChanged7 || objRememberedValue7 == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue7 = new ib(function8, mutableState, 1);
                                composer9.updateRememberedValue(objRememberedValue7);
                            }
                            Function0 function9 = (Function0) objRememberedValue7;
                            boolean zChanged8 = composer9.changed(function8);
                            Object objRememberedValue8 = composer9.rememberedValue();
                            if (zChanged8 || objRememberedValue8 == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue8 = new ib(function8, mutableState, 3);
                                composer9.updateRememberedValue(objRememberedValue8);
                            }
                            CommonTemplateBottomSheetKt.a(null, iconType, str6, str7, str8, str9, function9, (Function0) objRememberedValue8, composer9, 0, 1);
                            composer9.endReplaceGroup();
                        } else if (chaloBottomSheetLayoutType instanceof ChaloBottomSheetLayoutType.TutorialBottomSheet) {
                            composer9.startReplaceGroup(-563212223);
                            String str10 = genericBottomSheetData.b;
                            List list3 = ((ChaloBottomSheetLayoutType.TutorialBottomSheet) chaloBottomSheetLayoutType).f2847a;
                            boolean zChanged9 = composer9.changed(function8);
                            Object objRememberedValue9 = composer9.rememberedValue();
                            if (zChanged9 || objRememberedValue9 == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue9 = new ib(function8, mutableState, 4);
                                composer9.updateRememberedValue(objRememberedValue9);
                            }
                            ChaloTutorialBottomSheetKt.a(null, str10, list3, (Function0) objRememberedValue9, composer9, 0);
                            composer9.endReplaceGroup();
                        } else if (Intrinsics.d(chaloBottomSheetLayoutType, ChaloBottomSheetLayoutType.NotificationPermissionBottomSheet.f2846a)) {
                            composer9.startReplaceGroup(-562363629);
                            IconType iconType2 = genericBottomSheetData.f2850a;
                            String str11 = genericBottomSheetData.b;
                            String str12 = genericBottomSheetData.c;
                            String str13 = genericBottomSheetData.d;
                            String str14 = genericBottomSheetData.e;
                            boolean zChanged10 = composer9.changed(function8);
                            Object objRememberedValue10 = composer9.rememberedValue();
                            if (zChanged10 || objRememberedValue10 == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue10 = new ib(function8, mutableState, 5);
                                composer9.updateRememberedValue(objRememberedValue10);
                            }
                            Function0 function10 = (Function0) objRememberedValue10;
                            boolean zChanged11 = composer9.changed(function8);
                            Object objRememberedValue11 = composer9.rememberedValue();
                            if (zChanged11 || objRememberedValue11 == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue11 = new ib(function8, mutableState, 6);
                                composer9.updateRememberedValue(objRememberedValue11);
                            }
                            NotificationPermissionBottomSheetKt.a(0, composer9, null, iconType2, str11, str12, str13, str14, function10, (Function0) objRememberedValue11);
                            composer9.endReplaceGroup();
                        } else {
                            if (!(chaloBottomSheetLayoutType instanceof ChaloBottomSheetLayoutType.UserProfiling)) {
                                throw pk0.p(composer9, 1367256916);
                            }
                            composer9.startReplaceGroup(-560841467);
                            UserProfilePicComposableUIState userProfilePicComposableUIState = ((ChaloBottomSheetLayoutType.UserProfiling) chaloBottomSheetLayoutType).f2848a;
                            String str15 = genericBottomSheetData.b;
                            String str16 = genericBottomSheetData.c;
                            String str17 = genericBottomSheetData.d;
                            String str18 = genericBottomSheetData.e;
                            boolean zChanged12 = composer9.changed(function8);
                            Object objRememberedValue12 = composer9.rememberedValue();
                            if (zChanged12 || objRememberedValue12 == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue12 = new ib(function8, mutableState, 7);
                                composer9.updateRememberedValue(objRememberedValue12);
                            }
                            Function0 function11 = (Function0) objRememberedValue12;
                            boolean zChanged13 = composer9.changed(function8);
                            Object objRememberedValue13 = composer9.rememberedValue();
                            if (zChanged13 || objRememberedValue13 == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue13 = new ib(function8, mutableState, 8);
                                composer9.updateRememberedValue(objRememberedValue13);
                            }
                            UserProfilingBottomSheetKt.a(userProfilePicComposableUIState, str15, str16, str17, str18, function11, (Function0) objRememberedValue13, composer9, 0);
                            composer9.endReplaceGroup();
                        }
                        composer9.endReplaceGroup();
                    } else {
                        if (!Intrinsics.d(commonBottomSheetData, CommonBottomSheetData.RideHailingUserFeedbackBottomSheetData.f2851a)) {
                            throw pk0.p(composer9, 1367253810);
                        }
                        composer9.startReplaceGroup(-559225003);
                        RideHailingUserFeedbackData rideHailingUserFeedbackData = homeScreenFragmentViewState.k;
                        if (rideHailingUserFeedbackData == null) {
                            composer9.endReplaceGroup();
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        } else {
                            boolean zChanged14 = composer9.changed(function8);
                            Object objRememberedValue14 = composer9.rememberedValue();
                            if (zChanged14 || objRememberedValue14 == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue14 = new xd(function8, true ? 1 : 0);
                                composer9.updateRememberedValue(objRememberedValue14);
                            }
                            Function2 function12 = (Function2) objRememberedValue14;
                            boolean zChanged15 = composer9.changed(function8);
                            Object objRememberedValue15 = composer9.rememberedValue();
                            if (zChanged15 || objRememberedValue15 == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue15 = new nu(function8, 9);
                                composer9.updateRememberedValue(objRememberedValue15);
                            }
                            Function1 function13 = (Function1) objRememberedValue15;
                            boolean zChanged16 = composer9.changed(function8);
                            Object objRememberedValue16 = composer9.rememberedValue();
                            if (zChanged16 || objRememberedValue16 == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue16 = new ib(function8, mutableState, 9);
                                composer9.updateRememberedValue(objRememberedValue16);
                            }
                            Function0 function14 = (Function0) objRememberedValue16;
                            boolean zChanged17 = composer9.changed(function8);
                            Object objRememberedValue17 = composer9.rememberedValue();
                            if (zChanged17 || objRememberedValue17 == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue17 = new ib(function8, mutableState, 2);
                                composer9.updateRememberedValue(objRememberedValue17);
                            }
                            RideHailingUserFeedbackBottomSheetContentKt.a(rideHailingUserFeedbackData, function12, function13, function14, (Function0) objRememberedValue17, composer9, 0);
                            composer9.endReplaceGroup();
                        }
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer9.skipToGroupEnd();
                }
                return unit;
            case 11:
                MutableState mutableState2 = (MutableState) obj5;
                HomeScreenInfoHelper homeScreenInfoHelper = (HomeScreenInfoHelper) obj4;
                Function1 function15 = (Function1) obj6;
                AnimatedVisibilityScope AnimatedVisibility = (AnimatedVisibilityScope) obj;
                Composer composer10 = (Composer) obj2;
                int iIntValue11 = ((Integer) obj3).intValue();
                Intrinsics.i(AnimatedVisibility, "$this$AnimatedVisibility");
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(483022266, iIntValue11, -1, "app.chalo.home.ui.base.MainScreenNavigationConfigurations.<anonymous>.<anonymous> (HomeScreenMainDecompose.kt:715)");
                }
                HomeScreenDrawerChild homeScreenDrawerChild = (HomeScreenDrawerChild) mutableState2.getValue();
                if (homeScreenDrawerChild == null) {
                    composer10.startReplaceGroup(1575930067);
                } else {
                    composer10.startReplaceGroup(1575930068);
                    boolean zChanged18 = composer10.changed(function15);
                    Object objRememberedValue18 = composer10.rememberedValue();
                    if (zChanged18 || objRememberedValue18 == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue18 = new q70(function15, 12);
                        composer10.updateRememberedValue(objRememberedValue18);
                    }
                    HomeScreenMainDecomposeKt.d(homeScreenDrawerChild, homeScreenInfoHelper, (Function0) objRememberedValue18, composer10, 0);
                }
                composer10.endReplaceGroup();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                return unit;
            case 12:
                HomeScreenBottomSheetType homeScreenBottomSheetType = (HomeScreenBottomSheetType) obj5;
                PremiumBusInAppCommunicationBottomSheetData premiumBusInAppCommunicationBottomSheetData = (PremiumBusInAppCommunicationBottomSheetData) obj4;
                Function1 function16 = (Function1) obj6;
                ColumnScope ChaloRoundedBottomSheet3 = (ColumnScope) obj;
                Composer composer11 = (Composer) obj2;
                int iIntValue12 = ((Integer) obj3).intValue();
                Intrinsics.i(ChaloRoundedBottomSheet3, "$this$ChaloRoundedBottomSheet");
                if (composer11.shouldExecute((iIntValue12 & 17) != 16, iIntValue12 & 1)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(673935703, iIntValue12, -1, "app.chalo.home.ui.home.HomeTabScaffold.<anonymous> (HomeTabScaffold.kt:159)");
                    }
                    if (!Intrinsics.d(homeScreenBottomSheetType, HomeScreenBottomSheetType.PremiumBusInAppCommunicationBottomSheet.f3534a)) {
                        throw pk0.p(composer11, -887850256);
                    }
                    composer11.startReplaceGroup(-1753408117);
                    if (premiumBusInAppCommunicationBottomSheetData == null) {
                        composer11.startReplaceGroup(-1753408118);
                    } else {
                        composer11.startReplaceGroup(-1753408117);
                        HomeTabScaffoldKt.a(function16, premiumBusInAppCommunicationBottomSheetData, composer11, 0);
                    }
                    composer11.endReplaceGroup();
                    composer11.endReplaceGroup();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer11.skipToGroupEnd();
                }
                return unit;
            case 13:
                NetworkCallInfo networkCallInfo = (NetworkCallInfo) obj5;
                NetworkInspectorComponent networkInspectorComponent = (NetworkInspectorComponent) obj4;
                MutableState mutableState3 = (MutableState) obj6;
                PaddingValues paddingValues = (PaddingValues) obj;
                Composer composer12 = (Composer) obj2;
                int iIntValue13 = ((Integer) obj3).intValue();
                Intrinsics.i(paddingValues, "paddingValues");
                if ((iIntValue13 & 6) == 0) {
                    iIntValue13 |= composer12.changed(paddingValues) ? 4 : 2;
                }
                if (composer12.shouldExecute((iIntValue13 & 19) != 18, iIntValue13 & 1)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-379046530, iIntValue13, -1, "app.chalo.core.compose.NetworkInspectorScreen.<anonymous> (NetworkInspectorScreen.kt:102)");
                    }
                    if (networkCallInfo == null) {
                        composer12.startReplaceGroup(-706085782);
                        List list4 = ((NetworkInspectorState) mutableState3.getValue()).f2305a;
                        boolean z = ((NetworkInspectorState) mutableState3.getValue()).c;
                        String str19 = ((NetworkInspectorState) mutableState3.getValue()).d;
                        boolean zChangedInstance = composer12.changedInstance(networkInspectorComponent);
                        Object objRememberedValue19 = composer12.rememberedValue();
                        if (zChangedInstance || objRememberedValue19 == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue19 = new ym0(networkInspectorComponent, false ? 1 : 0);
                            composer12.updateRememberedValue(objRememberedValue19);
                        }
                        NetworkInspectorScreenKt.d(list4, z, str19, (Function1) objRememberedValue19, PaddingKt.padding(SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null), paddingValues), composer12, 0);
                        composer12.endReplaceGroup();
                    } else {
                        composer12.startReplaceGroup(-705586930);
                        NetworkInspectorScreenKt.c(networkCallInfo, PaddingKt.padding(SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null), paddingValues), composer12, 0);
                        composer12.endReplaceGroup();
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer12.skipToGroupEnd();
                }
                return unit;
            case 14:
                return a(obj, obj2, obj3);
            case 15:
                PassPlanAnnouncementUIState passPlanAnnouncementUIState = (PassPlanAnnouncementUIState) obj5;
                PassCategorySelectionSectionUIState passCategorySelectionSectionUIState = (PassCategorySelectionSectionUIState) obj4;
                PassCategorySelectionTabScreen passCategorySelectionTabScreen = (PassCategorySelectionTabScreen) obj6;
                Composer composer13 = (Composer) obj2;
                int iIntValue14 = ((Integer) obj3).intValue();
                Intrinsics.i((LazyItemScope) obj, "$this$item");
                if (composer13.shouldExecute((iIntValue14 & 17) != 16, iIntValue14 & 1)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(148650428, iIntValue14, -1, "app.chalo.productpurchase.passselection.ui.PassCategorySelectionTabScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (PassSelectionScreen.kt:248)");
                    }
                    PassSelectionScreenKt.e(passPlanAnnouncementUIState, ChaloThemeKt.c(SizeKt.fillMaxWidth$default(ChaloThemeKt.c(Modifier.INSTANCE, passCategorySelectionSectionUIState.g.f8526a), 0.0f, 1, null), passCategorySelectionTabScreen.e), composer13, 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer13.skipToGroupEnd();
                }
                return unit;
            case 16:
                TextUIState textUIState = (TextUIState) obj5;
                PassCategorySelectionSectionUIState passCategorySelectionSectionUIState2 = (PassCategorySelectionSectionUIState) obj4;
                PassCategorySelectionTabScreen passCategorySelectionTabScreen2 = (PassCategorySelectionTabScreen) obj6;
                Composer composer14 = (Composer) obj2;
                int iIntValue15 = ((Integer) obj3).intValue();
                Intrinsics.i((LazyItemScope) obj, "$this$item");
                if (composer14.shouldExecute((iIntValue15 & 17) != 16, iIntValue15 & 1)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-747737657, iIntValue15, -1, "app.chalo.productpurchase.passselection.ui.PassCategorySelectionTabScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (PassSelectionScreen.kt:260)");
                    }
                    app.chalo.compose.components.TextKt.c(textUIState, ChaloThemeKt.c(SizeKt.fillMaxWidth$default(ChaloThemeKt.c(Modifier.INSTANCE, passCategorySelectionSectionUIState2.g.b), 0.0f, 1, null), passCategorySelectionTabScreen2.e), null, null, composer14, 0, 12);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer14.skipToGroupEnd();
                }
                return unit;
            case 17:
                return c(obj, obj2, obj3);
            case 18:
                return d(obj, obj2, obj3);
            case 19:
                return e(obj, obj2, obj3);
            case 20:
                return f(obj, obj2, obj3);
            case 21:
                return g(obj, obj2, obj3);
            case 22:
                NearbyStopAndTripsUiModel nearbyStopAndTripsUiModel = (NearbyStopAndTripsUiModel) obj5;
                Function1 function17 = (Function1) obj4;
                Function2 function18 = (Function2) obj6;
                ColumnScope ChaloRoundedCard3 = (ColumnScope) obj;
                Composer composer15 = (Composer) obj2;
                int iIntValue16 = ((Integer) obj3).intValue();
                Intrinsics.i(ChaloRoundedCard3, "$this$ChaloRoundedCard");
                if (composer15.shouldExecute((iIntValue16 & 17) != 16, iIntValue16 & 1)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1584273258, iIntValue16, -1, "app.chalo.home.ui.nearby.compose.RegularBusStopNearbyTripsCard.<anonymous> (RegularBusStopNearbyTripsCard.kt:70)");
                    }
                    RegularBusStopNearbyTripsCardKt.l(nearbyStopAndTripsUiModel, function17, function18, composer15, 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer15.skipToGroupEnd();
                }
                return unit;
            case 23:
                return h(obj, obj2, obj3);
            case 24:
                return i(obj, obj2, obj3);
            case 25:
                return j(obj, obj2, obj3);
            case 26:
                return k(obj, obj2, obj3);
            case 27:
                return l(obj, obj2, obj3);
            default:
                IconType iconType3 = (IconType) obj6;
                String str20 = (String) obj5;
                String str21 = (String) obj4;
                AnimatedVisibilityScope AnimatedVisibility2 = (AnimatedVisibilityScope) obj;
                Composer composer16 = (Composer) obj2;
                int iIntValue17 = ((Integer) obj3).intValue();
                Intrinsics.i(AnimatedVisibility2, "$this$AnimatedVisibility");
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1123949492, iIntValue17, -1, "app.chalo.compose.components.bottomsheet.UserRatingBottomSheet.<anonymous>.<anonymous> (UserRatingBottomSheet.kt:72)");
                }
                UserRatingBottomSheetKt.b(iconType3, str20, str21, composer16, 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                return unit;
        }
    }

    public /* synthetic */ ob(IconType iconType, String str, String str2) {
        this.f18582a = 28;
        this.d = iconType;
        this.b = str;
        this.c = str2;
    }

    public /* synthetic */ ob(Function0 function0, Painter painter, String str) {
        this.f18582a = 8;
        this.c = function0;
        this.d = painter;
        this.b = str;
    }
}
