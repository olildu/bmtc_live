package defpackage;

import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.gestures.DragGestureDetectorKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScope;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
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
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.input.pointer.PointerInputChange;
import androidx.compose.ui.layout.ContentScale;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.text.style.TextOverflow;
import androidx.compose.ui.unit.Dp;
import androidx.exifinterface.media.ExifInterface;
import app.chalo.compose.ChaloHeaderTextComposableKt;
import app.chalo.compose.components.ChaloSpacersKt;
import app.chalo.compose.components.ComposableSingletons$ProfileCompletionTrackerKt;
import app.chalo.compose.components.ComposableSingletons$TooltipPopupComposableKt;
import app.chalo.compose.components.bottomsheet.ComposableSingletons$UserRatingBottomSheetKt;
import app.chalo.compose.components.plotline.PlotlineComposeWidgetKt;
import app.chalo.compose.resources.IconAssetHelper_androidKt;
import app.chalo.compose.resources.PainterResourceHelperKt;
import app.chalo.compose.resources.StringResourcesHelperKt;
import app.chalo.compose.theme.ChaloTheme;
import app.chalo.compose.theme.ChaloTypographyKt;
import app.chalo.core.compose.ComposableSingletons$SuperPassParentScreenKt;
import app.chalo.core.compose.ComposableSingletons$ValidationParentScreenKt;
import app.chalo.core.compose.ComposableSingletons$WalletParentScreenKt;
import app.chalo.core.navigation.superpass.SuperPassParentComponent;
import app.chalo.core.navigation.validation.ValidationParentComponent;
import app.chalo.core.navigation.wallet.WalletParentComponent;
import app.chalo.livetracking.tripplanner.ui.details.compose.ComposableSingletons$TripPlannerDetailsScreenKt;
import app.chalo.livetracking.tripplanner.ui.details.compose.TripPlannerDetailsScreenKt;
import app.chalo.livetracking.tripplanner.ui.result.ui.ComposableSingletons$TripPlannerResultsScreenKt;
import app.chalo.livetracking.tripplanner.ui.result.ui.TripPlannerResultsScreenKt;
import app.chalo.livetracking.universalsearch.ui.compose.ComposableSingletons$UniversalPickerComposableKt;
import app.chalo.premiumbus.ui.slotselection.ComposableSingletons$PremiumBusSlotSelectionUiStateKt;
import app.chalo.productpurchase.passpurchase.ui.confirmation.ConfirmSuperPassScreenKt;
import app.chalo.productpurchase.passpurchase.ui.enteruserdetails.SuperPassEnterUserDetailsScreenKt;
import app.chalo.productpurchase.passpurchase.ui.passengerselection.SuperPassPassengerSelectionUIKt;
import app.chalo.productpurchase.passpurchase.ui.proofoverview.SuperPassProofOverviewScreenKt;
import app.chalo.productpurchase.passpurchase.ui.proofupload.SuperPassUserProofUploadScreenKt;
import app.chalo.providers.iconassetprovider.IconType;
import app.chalo.providers.stringprovider.StringEnum;
import app.chalo.routeselection.ui.compose.ComposableSingletons$RouteSelectionBottomSheetKt;
import app.chalo.routeselection.ui.compose.RouteSelectionBottomSheetKt;
import app.chalo.titoridedetail.ui.compose.ComposableSingletons$TitoRideDataScreenKt;
import app.chalo.validationsdk.blevalidation.ui.BleValidationScreen_androidKt;
import app.chalo.validationsdk.blevalidation.ui.qrvalidation.QRValidationScreenKt;
import app.chalo.validationsdk.multiproductvalidation.ui.MultiProductValidationScreenKt;
import app.chalo.validationsdk.vehiclebasedvalidation.ui.compose.DirectValidationMainScreenKt;
import app.chalo.wallet.ui.alltransactions.WalletAllTransactionsMainScreenKt;
import app.chalo.wallet.ui.alltransactions.compose.ComposableSingletons$WalletAllTransactionsComposableKt;
import app.chalo.wallet.ui.loadbalance.WalletLoadBalanceEnterAmountMainScreenKt;
import app.chalo.wallet.ui.loadbalancesuccess.WalletLoadBalanceSuccessScreenKt;
import app.chalo.wallet.ui.mainbalance.WalletBalanceMainScreenKt;
import app.chalo.wallet.ui.transactionsContent.WalletTransactionsContentKt;
import app.chalo.wallet.ui.transactionsummary.WalletTransactionSummaryMainScreenKt;
import coil3.compose.ComposableSingletons$SubcomposeAsyncImageKt;
import coil3.compose.SubcomposeAsyncImageKt;
import coil3.compose.SubcomposeAsyncImageScope;
import io.ktor.client.network.sockets.ConnectTimeoutException;
import io.ktor.client.plugins.HttpRequestRetryKt;
import io.ktor.client.plugins.HttpRequestTimeoutException;
import io.ktor.client.plugins.HttpRetryShouldRetryContext;
import io.ktor.client.request.HttpRequestBuilder;
import io.ktor.client.utils.ExceptionUtilsJvmKt;
import java.net.SocketTimeoutException;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import org.slf4j.Logger;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class rr implements Function3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f19236a;

    public /* synthetic */ rr(int i) {
        this.f19236a = i;
    }

    private final Object a(Object obj, Object obj2, Object obj3) {
        WalletParentComponent.WalletChild it = (WalletParentComponent.WalletChild) obj;
        Composer composer = (Composer) obj2;
        int iIntValue = ((Integer) obj3).intValue();
        ComposableLambda composableLambda = ComposableSingletons$WalletParentScreenKt.f2037a;
        Intrinsics.i(it, "it");
        if ((iIntValue & 6) == 0) {
            iIntValue |= composer.changed(it) ? 4 : 2;
        }
        if (composer.shouldExecute((iIntValue & 19) != 18, iIntValue & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1164291420, iIntValue, -1, "app.chalo.core.compose.ComposableSingletons$WalletParentScreenKt.lambda$-1164291420.<anonymous> (WalletParentScreen.kt:19)");
            }
            if (it instanceof WalletParentComponent.WalletChild.WalletBalance) {
                composer.startReplaceGroup(750277721);
                WalletBalanceMainScreenKt.a(((WalletParentComponent.WalletChild.WalletBalance) it).f2294a, composer, 8);
                composer.endReplaceGroup();
            } else if (it instanceof WalletParentComponent.WalletChild.WalletAllTransactions) {
                composer.startReplaceGroup(750420817);
                WalletAllTransactionsMainScreenKt.a(((WalletParentComponent.WalletChild.WalletAllTransactions) it).f2293a, composer, 8);
                composer.endReplaceGroup();
            } else if (it instanceof WalletParentComponent.WalletChild.WalletTransactionSummary) {
                composer.startReplaceGroup(750574670);
                WalletTransactionSummaryMainScreenKt.a(((WalletParentComponent.WalletChild.WalletTransactionSummary) it).f2297a, composer, 8);
                composer.endReplaceGroup();
            } else if (it instanceof WalletParentComponent.WalletChild.WalletLoadMoney) {
                composer.startReplaceGroup(750722602);
                WalletLoadBalanceEnterAmountMainScreenKt.a(((WalletParentComponent.WalletChild.WalletLoadMoney) it).f2296a, composer, 8);
                composer.endReplaceGroup();
            } else {
                if (!(it instanceof WalletParentComponent.WalletChild.WalletLoadBalanceSuccess)) {
                    throw pk0.p(composer, 2102410729);
                }
                composer.startReplaceGroup(750883058);
                WalletLoadBalanceSuccessScreenKt.b(((WalletParentComponent.WalletChild.WalletLoadBalanceSuccess) it).f2295a, composer, 8);
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

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i = this.f19236a;
        Unit unit = Unit.f17538a;
        int i2 = 0;
        switch (i) {
            case 0:
                ((Integer) obj).intValue();
                ((Integer) obj2).intValue();
                ComposableLambda composableLambda = ComposableSingletons$PremiumBusSlotSelectionUiStateKt.f7794a;
                Intrinsics.i((String) obj3, "<unused var>");
                return unit;
            case 1:
                BoxScope ProfileCompletionTracker = (BoxScope) obj;
                Composer composer = (Composer) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                ComposableLambda composableLambda2 = ComposableSingletons$ProfileCompletionTrackerKt.f1838a;
                Intrinsics.i(ProfileCompletionTracker, "$this$ProfileCompletionTracker");
                if (composer.shouldExecute((iIntValue & 17) != 16, iIntValue & 1)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1079562099, iIntValue, -1, "app.chalo.compose.components.ComposableSingletons$ProfileCompletionTrackerKt.lambda$1079562099.<anonymous> (ProfileCompletionTracker.kt:155)");
                    }
                    Modifier modifierM263backgroundbw27NRU = BackgroundKt.m263backgroundbw27NRU(SizeKt.m828size3ABfNKs(Modifier.INSTANCE, Dp.m7278constructorimpl(62)), ChaloTheme.a(composer, 6).g, RoundedCornerShapeKt.getCircleShape());
                    MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getCenter(), false);
                    long currentCompositeKeyHashCode = ComposablesKt.getCurrentCompositeKeyHashCode(composer, 0);
                    int i3 = (int) (currentCompositeKeyHashCode ^ (currentCompositeKeyHashCode >>> 32));
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
                    Updater.m3923setimpl(composerM3915constructorimpl, modifierMaterializeModifier, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion, composerM3915constructorimpl, Integer.valueOf(i3), composerM3915constructorimpl));
                    BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                    TextKt.m2623TextNvy7gAk(ExifInterface.GPS_MEASUREMENT_IN_PROGRESS, null, ChaloTheme.a(composer, 6).t, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ChaloTypographyKt.f(ChaloTheme.e(composer, 6)), composer, 6, 0, 131066);
                    composer.endNode();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer.skipToGroupEnd();
                }
                return unit;
            case 2:
                LazyItemScope item = (LazyItemScope) obj;
                Composer composer2 = (Composer) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                ComposableLambda composableLambda3 = ComposableSingletons$RouteSelectionBottomSheetKt.f9206a;
                Intrinsics.i(item, "$this$item");
                if (composer2.shouldExecute((iIntValue2 & 17) != 16, iIntValue2 & 1)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1899734803, iIntValue2, -1, "app.chalo.routeselection.ui.compose.ComposableSingletons$RouteSelectionBottomSheetKt.lambda$-1899734803.<anonymous> (RouteSelectionBottomSheet.kt:180)");
                    }
                    ChaloSpacersKt.a(ChaloTheme.b(composer2, 0).i, composer2, 0);
                    String strC = StringResourcesHelperKt.c(StringEnum.UNIVERSAL_CITY_SEARCH_NO_RESULT_FOUND_DESCRIPTION, new Object[0], composer2, 6);
                    Object objRememberedValue = composer2.rememberedValue();
                    if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue = new sr(i2);
                        composer2.updateRememberedValue(objRememberedValue);
                    }
                    RouteSelectionBottomSheetKt.b(strC, false, (Function0) objRememberedValue, composer2, 432, 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer2.skipToGroupEnd();
                }
                return unit;
            case 3:
                boolean z = true;
                SubcomposeAsyncImageScope subcomposeAsyncImageScope = (SubcomposeAsyncImageScope) obj;
                Composer composer3 = (Composer) obj2;
                int iIntValue3 = ((Integer) obj3).intValue();
                ComposableLambda composableLambda4 = ComposableSingletons$SubcomposeAsyncImageKt.f11485a;
                if ((iIntValue3 & 6) == 0) {
                    iIntValue3 |= composer3.changed(subcomposeAsyncImageScope) ? 4 : 2;
                }
                if ((iIntValue3 & 19) == 18) {
                    z = false;
                }
                if (composer3.shouldExecute(z, iIntValue3 & 1)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1938077476, iIntValue3, -1, "coil3.compose.ComposableSingletons$SubcomposeAsyncImageKt.lambda$1938077476.<anonymous> (SubcomposeAsyncImage.kt:309)");
                    }
                    SubcomposeAsyncImageKt.b(subcomposeAsyncImageScope, null, null, null, null, null, 0.0f, null, false, composer3, iIntValue3 & 14);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer3.skipToGroupEnd();
                }
                return unit;
            case 4:
                SuperPassParentComponent.Child child = (SuperPassParentComponent.Child) obj;
                Composer composer4 = (Composer) obj2;
                int iIntValue4 = ((Integer) obj3).intValue();
                ComposableLambda composableLambda5 = ComposableSingletons$SuperPassParentScreenKt.f2035a;
                Intrinsics.i(child, "child");
                if ((iIntValue4 & 6) == 0) {
                    iIntValue4 |= composer4.changed(child) ? 4 : 2;
                }
                if (composer4.shouldExecute((iIntValue4 & 19) != 18, iIntValue4 & 1)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-727088071, iIntValue4, -1, "app.chalo.core.compose.ComposableSingletons$SuperPassParentScreenKt.lambda$-727088071.<anonymous> (SuperPassParentScreen.kt:17)");
                    }
                    if (child instanceof SuperPassParentComponent.Child.ConfirmPurchase) {
                        composer4.startReplaceGroup(-1160550014);
                        ConfirmSuperPassScreenKt.h(((SuperPassParentComponent.Child.ConfirmPurchase) child).f2283a, composer4, 8);
                        composer4.endReplaceGroup();
                    } else if (child instanceof SuperPassParentComponent.Child.PassengerSelection) {
                        composer4.startReplaceGroup(-1160410979);
                        SuperPassPassengerSelectionUIKt.b(((SuperPassParentComponent.Child.PassengerSelection) child).f2284a, composer4, 8);
                        composer4.endReplaceGroup();
                    } else if (child instanceof SuperPassParentComponent.Child.ProofUpload) {
                        composer4.startReplaceGroup(-1160273990);
                        SuperPassUserProofUploadScreenKt.b(((SuperPassParentComponent.Child.ProofUpload) child).f2285a, composer4, 8);
                        composer4.endReplaceGroup();
                    } else if (child instanceof SuperPassParentComponent.Child.UserDetails) {
                        composer4.startReplaceGroup(-1160134087);
                        SuperPassEnterUserDetailsScreenKt.a(((SuperPassParentComponent.Child.UserDetails) child).f2286a, composer4, 8);
                        composer4.endReplaceGroup();
                    } else {
                        if (!(child instanceof SuperPassParentComponent.Child.UserProofOverview)) {
                            throw pk0.p(composer4, 1348034358);
                        }
                        composer4.startReplaceGroup(-1159987364);
                        SuperPassProofOverviewScreenKt.i(((SuperPassParentComponent.Child.UserProofOverview) child).f2287a, composer4, 8);
                        composer4.endReplaceGroup();
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer4.skipToGroupEnd();
                }
                return unit;
            case 5:
                RowScope ChaloButtonWithCustomContent = (RowScope) obj;
                Composer composer5 = (Composer) obj2;
                int iIntValue5 = ((Integer) obj3).intValue();
                ComposableLambda composableLambda6 = ComposableSingletons$TitoRideDataScreenKt.f9725a;
                Intrinsics.i(ChaloButtonWithCustomContent, "$this$ChaloButtonWithCustomContent");
                if (composer5.shouldExecute((iIntValue5 & 17) != 16, iIntValue5 & 1)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1615781108, iIntValue5, -1, "app.chalo.titoridedetail.ui.compose.ComposableSingletons$TitoRideDataScreenKt.lambda$1615781108.<anonymous> (TitoRideDataScreen.kt:1052)");
                    }
                    Alignment.Vertical centerVertically = Alignment.INSTANCE.getCenterVertically();
                    Modifier.Companion companion2 = Modifier.INSTANCE;
                    MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), centerVertically, composer5, 48);
                    long currentCompositeKeyHashCode2 = ComposablesKt.getCurrentCompositeKeyHashCode(composer5, 0);
                    int i4 = (int) (currentCompositeKeyHashCode2 ^ (currentCompositeKeyHashCode2 >>> 32));
                    CompositionLocalMap currentCompositionLocalMap2 = composer5.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(composer5, companion2);
                    ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
                    Function0<ComposeUiNode> constructor2 = companion3.getConstructor();
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
                    pk0.v(companion3, composerM3915constructorimpl2, measurePolicyRowMeasurePolicy, composerM3915constructorimpl2, currentCompositionLocalMap2);
                    Updater.m3923setimpl(composerM3915constructorimpl2, modifierMaterializeModifier2, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion3, composerM3915constructorimpl2, Integer.valueOf(i4), composerM3915constructorimpl2));
                    RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
                    ImageKt.Image(IconAssetHelper_androidKt.a(IconType.REPLAY, composer5, 6), "", SizeKt.m828size3ABfNKs(companion2, ChaloTheme.b(composer5, 0).h), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composer5, Painter.$stable | 48, 120);
                    ChaloSpacersKt.w(composer5, 0);
                    TextKt.m2623TextNvy7gAk(StringResourcesHelperKt.c(StringEnum.REPLAY_TUTORIAL, new Object[0], composer5, 6), null, ChaloTheme.a(composer5, 0).e, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ChaloTypographyKt.h(ChaloTheme.e(composer5, 0)), composer5, 0, 0, 131066);
                    composer5.endNode();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer5.skipToGroupEnd();
                }
                return unit;
            case 6:
                Modifier it = (Modifier) obj;
                Composer composer6 = (Composer) obj2;
                int iIntValue6 = ((Integer) obj3).intValue();
                ComposableLambda composableLambda7 = ComposableSingletons$TooltipPopupComposableKt.f1839a;
                Intrinsics.i(it, "it");
                if ((iIntValue6 & 6) == 0) {
                    iIntValue6 |= composer6.changed(it) ? 4 : 2;
                }
                if (composer6.shouldExecute((iIntValue6 & 19) != 18, iIntValue6 & 1)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(139728353, iIntValue6, -1, "app.chalo.compose.components.ComposableSingletons$TooltipPopupComposableKt.lambda$139728353.<anonymous> (TooltipPopupComposable.kt:450)");
                    }
                    TextKt.m2623TextNvy7gAk("test 2", it, 0L, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, composer6, ((iIntValue6 << 3) & 112) | 6, 0, 262140);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer6.skipToGroupEnd();
                }
                return unit;
            case 7:
                LazyItemScope item2 = (LazyItemScope) obj;
                Composer composer7 = (Composer) obj2;
                int iIntValue7 = ((Integer) obj3).intValue();
                ComposableLambda composableLambda8 = ComposableSingletons$TripPlannerDetailsScreenKt.f4745a;
                Intrinsics.i(item2, "$this$item");
                if (composer7.shouldExecute((iIntValue7 & 17) != 16, iIntValue7 & 1)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-370086784, iIntValue7, -1, "app.chalo.livetracking.tripplanner.ui.details.compose.ComposableSingletons$TripPlannerDetailsScreenKt.lambda$-370086784.<anonymous> (TripPlannerDetailsScreen.kt:321)");
                    }
                    if (gf.x(Modifier.INSTANCE, ChaloTheme.b(composer7, 0).h, composer7, 0)) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer7.skipToGroupEnd();
                }
                return unit;
            case 8:
                LazyItemScope item3 = (LazyItemScope) obj;
                Composer composer8 = (Composer) obj2;
                int iIntValue8 = ((Integer) obj3).intValue();
                ComposableLambda composableLambda9 = ComposableSingletons$TripPlannerDetailsScreenKt.f4745a;
                Intrinsics.i(item3, "$this$item");
                if (composer8.shouldExecute((iIntValue8 & 17) != 16, iIntValue8 & 1)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1764033257, iIntValue8, -1, "app.chalo.livetracking.tripplanner.ui.details.compose.ComposableSingletons$TripPlannerDetailsScreenKt.lambda$1764033257.<anonymous> (TripPlannerDetailsScreen.kt:405)");
                    }
                    TripPlannerDetailsScreenKt.g(PaddingKt.m788paddingqDBjuR0$default(Modifier.INSTANCE, ChaloTheme.b(composer8, 0).f, 0.0f, 0.0f, 0.0f, 14, null), composer8, 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer8.skipToGroupEnd();
                }
                return unit;
            case 9:
                Composer composer9 = (Composer) obj2;
                int iIntValue9 = ((Integer) obj3).intValue();
                ComposableLambda composableLambda10 = ComposableSingletons$TripPlannerResultsScreenKt.f4795a;
                Intrinsics.i((Modifier) obj, "it");
                if (composer9.shouldExecute((iIntValue9 & 17) != 16, iIntValue9 & 1)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1916116599, iIntValue9, -1, "app.chalo.livetracking.tripplanner.ui.result.ui.ComposableSingletons$TripPlannerResultsScreenKt.lambda$1916116599.<anonymous> (TripPlannerResultsScreen.kt:991)");
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer9.skipToGroupEnd();
                }
                return unit;
            case 10:
                Modifier it2 = (Modifier) obj;
                Composer composer10 = (Composer) obj2;
                int iIntValue10 = ((Integer) obj3).intValue();
                ComposableLambda composableLambda11 = ComposableSingletons$TripPlannerResultsScreenKt.f4795a;
                Intrinsics.i(it2, "it");
                if ((iIntValue10 & 6) == 0) {
                    iIntValue10 |= composer10.changed(it2) ? 4 : 2;
                }
                if (composer10.shouldExecute((iIntValue10 & 19) != 18, iIntValue10 & 1)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-2125374483, iIntValue10, -1, "app.chalo.livetracking.tripplanner.ui.result.ui.ComposableSingletons$TripPlannerResultsScreenKt.lambda$-2125374483.<anonymous> (TripPlannerResultsScreen.kt:1002)");
                    }
                    TextKt.m2623TextNvy7gAk(StringResourcesHelperKt.c(StringEnum.AUTO_TO, new Object[0], composer10, 6), it2, ChaloTheme.a(composer10, 0).e, null, 0L, null, null, null, 0L, null, null, 0L, TextOverflow.INSTANCE.m7226getEllipsisgIe3tQ8(), false, 1, 0, null, ChaloTypographyKt.d(ChaloTheme.e(composer10, 0)), composer10, (iIntValue10 << 3) & 112, 24960, 110584);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer10.skipToGroupEnd();
                }
                return unit;
            case 11:
                Modifier it3 = (Modifier) obj;
                Composer composer11 = (Composer) obj2;
                int iIntValue11 = ((Integer) obj3).intValue();
                ComposableLambda composableLambda12 = ComposableSingletons$TripPlannerResultsScreenKt.f4795a;
                Intrinsics.i(it3, "it");
                if ((iIntValue11 & 6) == 0) {
                    iIntValue11 |= composer11.changed(it3) ? 4 : 2;
                }
                if (composer11.shouldExecute((iIntValue11 & 19) != 18, iIntValue11 & 1)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1465729838, iIntValue11, -1, "app.chalo.livetracking.tripplanner.ui.result.ui.ComposableSingletons$TripPlannerResultsScreenKt.lambda$1465729838.<anonymous> (TripPlannerResultsScreen.kt:1031)");
                    }
                    TextKt.m2623TextNvy7gAk(StringResourcesHelperKt.c(StringEnum.TAXI_TO, new Object[0], composer11, 6), it3, ChaloTheme.a(composer11, 0).e, null, 0L, null, null, null, 0L, null, null, 0L, TextOverflow.INSTANCE.m7226getEllipsisgIe3tQ8(), false, 1, 0, null, ChaloTypographyKt.d(ChaloTheme.e(composer11, 0)), composer11, (iIntValue11 << 3) & 112, 24960, 110584);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer11.skipToGroupEnd();
                }
                return unit;
            case 12:
                Modifier it4 = (Modifier) obj;
                Composer composer12 = (Composer) obj2;
                int iIntValue12 = ((Integer) obj3).intValue();
                ComposableLambda composableLambda13 = ComposableSingletons$TripPlannerResultsScreenKt.f4795a;
                Intrinsics.i(it4, "it");
                if ((iIntValue12 & 6) == 0) {
                    iIntValue12 |= composer12.changed(it4) ? 4 : 2;
                }
                if (composer12.shouldExecute((iIntValue12 & 19) != 18, iIntValue12 & 1)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(761866863, iIntValue12, -1, "app.chalo.livetracking.tripplanner.ui.result.ui.ComposableSingletons$TripPlannerResultsScreenKt.lambda$761866863.<anonymous> (TripPlannerResultsScreen.kt:1060)");
                    }
                    TextKt.m2623TextNvy7gAk(StringResourcesHelperKt.c(StringEnum.WALK_TO, new Object[0], composer12, 6), it4, ChaloTheme.a(composer12, 0).e, null, 0L, null, null, null, 0L, null, null, 0L, TextOverflow.INSTANCE.m7226getEllipsisgIe3tQ8(), false, 1, 0, null, ChaloTypographyKt.d(ChaloTheme.e(composer12, 0)), composer12, (iIntValue12 << 3) & 112, 24960, 110584);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer12.skipToGroupEnd();
                }
                return unit;
            case 13:
                Modifier it5 = (Modifier) obj;
                Composer composer13 = (Composer) obj2;
                int iIntValue13 = ((Integer) obj3).intValue();
                ComposableLambda composableLambda14 = ComposableSingletons$TripPlannerResultsScreenKt.f4795a;
                Intrinsics.i(it5, "it");
                if ((iIntValue13 & 6) == 0) {
                    iIntValue13 |= composer13.changed(it5) ? 4 : 2;
                }
                if (composer13.shouldExecute((iIntValue13 & 19) != 18, iIntValue13 & 1)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-645859087, iIntValue13, -1, "app.chalo.livetracking.tripplanner.ui.result.ui.ComposableSingletons$TripPlannerResultsScreenKt.lambda$-645859087.<anonymous> (TripPlannerResultsScreen.kt:1136)");
                    }
                    TextKt.m2623TextNvy7gAk(StringResourcesHelperKt.c(StringEnum.TAKE_METRO, new Object[0], composer13, 6), it5, ChaloTheme.a(composer13, 0).e, null, 0L, null, null, null, 0L, null, null, 0L, TextOverflow.INSTANCE.m7226getEllipsisgIe3tQ8(), false, 1, 0, null, ChaloTypographyKt.d(ChaloTheme.e(composer13, 0)), composer13, (iIntValue13 << 3) & 112, 24960, 110584);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer13.skipToGroupEnd();
                }
                return unit;
            case 14:
                LazyItemScope item4 = (LazyItemScope) obj;
                Composer composer14 = (Composer) obj2;
                int iIntValue14 = ((Integer) obj3).intValue();
                ComposableLambda composableLambda15 = ComposableSingletons$TripPlannerResultsScreenKt.f4795a;
                Intrinsics.i(item4, "$this$item");
                if (composer14.shouldExecute((iIntValue14 & 17) != 16, iIntValue14 & 1)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-435301628, iIntValue14, -1, "app.chalo.livetracking.tripplanner.ui.result.ui.ComposableSingletons$TripPlannerResultsScreenKt.lambda$-435301628.<anonymous> (TripPlannerResultsScreen.kt:308)");
                    }
                    TripPlannerResultsScreenKt.n(PaddingKt.m788paddingqDBjuR0$default(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), 0.0f, ChaloTheme.b(composer14, 0).d, 0.0f, 0.0f, 13, null), composer14, 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer14.skipToGroupEnd();
                }
                return unit;
            case 15:
                LazyItemScope item5 = (LazyItemScope) obj;
                Composer composer15 = (Composer) obj2;
                int iIntValue15 = ((Integer) obj3).intValue();
                ComposableLambda composableLambda16 = ComposableSingletons$TripPlannerResultsScreenKt.f4795a;
                Intrinsics.i(item5, "$this$item");
                if (composer15.shouldExecute((iIntValue15 & 17) != 16, iIntValue15 & 1)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(89334028, iIntValue15, -1, "app.chalo.livetracking.tripplanner.ui.result.ui.ComposableSingletons$TripPlannerResultsScreenKt.lambda$89334028.<anonymous> (TripPlannerResultsScreen.kt:328)");
                    }
                    PlotlineComposeWidgetKt.a(6, 2, composer15, null, "tripPlannerResultsBanner");
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer15.skipToGroupEnd();
                }
                return unit;
            case 16:
                LazyItemScope item6 = (LazyItemScope) obj;
                Composer composer16 = (Composer) obj2;
                int iIntValue16 = ((Integer) obj3).intValue();
                ComposableLambda composableLambda17 = ComposableSingletons$TripPlannerResultsScreenKt.f4795a;
                Intrinsics.i(item6, "$this$item");
                if (composer16.shouldExecute((iIntValue16 & 17) != 16, iIntValue16 & 1)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-906178986, iIntValue16, -1, "app.chalo.livetracking.tripplanner.ui.result.ui.ComposableSingletons$TripPlannerResultsScreenKt.lambda$-906178986.<anonymous> (TripPlannerResultsScreen.kt:671)");
                    }
                    TripPlannerResultsScreenKt.v(composer16, 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer16.skipToGroupEnd();
                }
                return unit;
            case 17:
                LazyItemScope item7 = (LazyItemScope) obj;
                Composer composer17 = (Composer) obj2;
                int iIntValue17 = ((Integer) obj3).intValue();
                ComposableLambda composableLambda18 = ComposableSingletons$TripPlannerResultsScreenKt.f4795a;
                Intrinsics.i(item7, "$this$item");
                if (composer17.shouldExecute((iIntValue17 & 17) != 16, iIntValue17 & 1)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(946474513, iIntValue17, -1, "app.chalo.livetracking.tripplanner.ui.result.ui.ComposableSingletons$TripPlannerResultsScreenKt.lambda$946474513.<anonymous> (TripPlannerResultsScreen.kt:684)");
                    }
                    if (gf.x(Modifier.INSTANCE, ChaloTheme.b(composer17, 0).h, composer17, 0)) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer17.skipToGroupEnd();
                }
                return unit;
            case 18:
                Composer composer18 = (Composer) obj2;
                int iIntValue18 = ((Integer) obj3).intValue();
                ComposableLambda composableLambda19 = ComposableSingletons$TripPlannerResultsScreenKt.f4795a;
                Intrinsics.i((Modifier) obj, "it");
                if (composer18.shouldExecute((iIntValue18 & 17) != 16, iIntValue18 & 1)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-296299338, iIntValue18, -1, "app.chalo.livetracking.tripplanner.ui.result.ui.ComposableSingletons$TripPlannerResultsScreenKt.lambda$-296299338.<anonymous> (TripPlannerResultsScreen.kt:990)");
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer18.skipToGroupEnd();
                }
                return unit;
            case 19:
                LazyItemScope item8 = (LazyItemScope) obj;
                Composer composer19 = (Composer) obj2;
                int iIntValue19 = ((Integer) obj3).intValue();
                ComposableLambda composableLambda20 = ComposableSingletons$UniversalPickerComposableKt.f5093a;
                Intrinsics.i(item8, "$this$item");
                if (composer19.shouldExecute((iIntValue19 & 17) != 16, iIntValue19 & 1)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-894960123, iIntValue19, -1, "app.chalo.livetracking.universalsearch.ui.compose.ComposableSingletons$UniversalPickerComposableKt.lambda$-894960123.<anonymous> (UniversalPickerComposable.kt:273)");
                    }
                    ChaloHeaderTextComposableKt.c(StringResourcesHelperKt.c(StringEnum.RECENT_SEARCHES, new Object[0], composer19, 6), composer19, 0, 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer19.skipToGroupEnd();
                }
                return unit;
            case 20:
                LazyItemScope item9 = (LazyItemScope) obj;
                Composer composer20 = (Composer) obj2;
                int iIntValue20 = ((Integer) obj3).intValue();
                ComposableLambda composableLambda21 = ComposableSingletons$UniversalPickerComposableKt.f5093a;
                Intrinsics.i(item9, "$this$item");
                if (composer20.shouldExecute((iIntValue20 & 17) != 16, iIntValue20 & 1)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1102611395, iIntValue20, -1, "app.chalo.livetracking.universalsearch.ui.compose.ComposableSingletons$UniversalPickerComposableKt.lambda$1102611395.<anonymous> (UniversalPickerComposable.kt:309)");
                    }
                    ChaloHeaderTextComposableKt.c(StringResourcesHelperKt.c(StringEnum.FAVORITE, new Object[0], composer20, 6), composer20, 0, 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer20.skipToGroupEnd();
                }
                return unit;
            case 21:
                LazyItemScope item10 = (LazyItemScope) obj;
                Composer composer21 = (Composer) obj2;
                int iIntValue21 = ((Integer) obj3).intValue();
                ComposableLambda composableLambda22 = ComposableSingletons$UniversalPickerComposableKt.f5093a;
                Intrinsics.i(item10, "$this$item");
                if (composer21.shouldExecute((iIntValue21 & 17) != 16, iIntValue21 & 1)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1571584762, iIntValue21, -1, "app.chalo.livetracking.universalsearch.ui.compose.ComposableSingletons$UniversalPickerComposableKt.lambda$1571584762.<anonymous> (UniversalPickerComposable.kt:321)");
                    }
                    ChaloHeaderTextComposableKt.c(StringResourcesHelperKt.c(StringEnum.RECENT_SEARCHES, new Object[0], composer21, 6), composer21, 0, 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer21.skipToGroupEnd();
                }
                return unit;
            case 22:
                ColumnScope Card = (ColumnScope) obj;
                Composer composer22 = (Composer) obj2;
                int iIntValue22 = ((Integer) obj3).intValue();
                ComposableLambda composableLambda23 = ComposableSingletons$UniversalPickerComposableKt.f5093a;
                Intrinsics.i(Card, "$this$Card");
                if (composer22.shouldExecute((iIntValue22 & 17) != 16, iIntValue22 & 1)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1196039249, iIntValue22, -1, "app.chalo.livetracking.universalsearch.ui.compose.ComposableSingletons$UniversalPickerComposableKt.lambda$1196039249.<anonymous> (UniversalPickerComposable.kt:431)");
                    }
                    ImageKt.Image(PainterResourceHelperKt.a(IconType.CHALO_BUS_PLACEHOLDER, composer22, 6), (String) null, (Modifier) null, (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composer22, Painter.$stable | 48, 124);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer22.skipToGroupEnd();
                }
                return unit;
            case 23:
                ((Integer) obj).intValue();
                List b = (List) obj2;
                ComposableLambda composableLambda24 = ComposableSingletons$UserRatingBottomSheetKt.f1853a;
                Intrinsics.i(b, "b");
                return unit;
            case 24:
                ValidationParentComponent.ValidationChild child2 = (ValidationParentComponent.ValidationChild) obj;
                Composer composer23 = (Composer) obj2;
                int iIntValue23 = ((Integer) obj3).intValue();
                ComposableLambda composableLambda25 = ComposableSingletons$ValidationParentScreenKt.f2036a;
                Intrinsics.i(child2, "child");
                if ((iIntValue23 & 6) == 0) {
                    iIntValue23 |= composer23.changed(child2) ? 4 : 2;
                }
                if (composer23.shouldExecute((iIntValue23 & 19) != 18, iIntValue23 & 1)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1825243044, iIntValue23, -1, "app.chalo.core.compose.ComposableSingletons$ValidationParentScreenKt.lambda$1825243044.<anonymous> (ValidationParentScreen.kt:16)");
                    }
                    if (child2 instanceof ValidationParentComponent.ValidationChild.BLEValidation) {
                        composer23.startReplaceGroup(1529664698);
                        BleValidationScreen_androidKt.m(((ValidationParentComponent.ValidationChild.BLEValidation) child2).f2289a, composer23, 8);
                        composer23.endReplaceGroup();
                    } else if (child2 instanceof ValidationParentComponent.ValidationChild.QRValidation) {
                        composer23.startReplaceGroup(1529805531);
                        QRValidationScreenKt.d(((ValidationParentComponent.ValidationChild.QRValidation) child2).f2292a, composer23, 8);
                        composer23.endReplaceGroup();
                    } else if (child2 instanceof ValidationParentComponent.ValidationChild.QRScanner) {
                        composer23.startReplaceGroup(1529942675);
                        DirectValidationMainScreenKt.a(((ValidationParentComponent.ValidationChild.QRScanner) child2).f2291a, composer23, 8);
                        composer23.endReplaceGroup();
                    } else {
                        if (!(child2 instanceof ValidationParentComponent.ValidationChild.MultiProductValidation)) {
                            throw pk0.p(composer23, 1711909738);
                        }
                        composer23.startReplaceGroup(1530100465);
                        MultiProductValidationScreenKt.e(((ValidationParentComponent.ValidationChild.MultiProductValidation) child2).f2290a, composer23, 8);
                        composer23.endReplaceGroup();
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer23.skipToGroupEnd();
                }
                return unit;
            case 25:
                LazyItemScope item11 = (LazyItemScope) obj;
                Composer composer24 = (Composer) obj2;
                int iIntValue24 = ((Integer) obj3).intValue();
                ComposableLambda composableLambda26 = ComposableSingletons$WalletAllTransactionsComposableKt.f10823a;
                Intrinsics.i(item11, "$this$item");
                if (composer24.shouldExecute((iIntValue24 & 17) != 16, iIntValue24 & 1)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1120349119, iIntValue24, -1, "app.chalo.wallet.ui.alltransactions.compose.ComposableSingletons$WalletAllTransactionsComposableKt.lambda$1120349119.<anonymous> (WalletAllTransactionsComposable.kt:103)");
                    }
                    PlotlineComposeWidgetKt.a(6, 2, composer24, null, "loadBalanceEnterAmountScreenWithTransactionBanner");
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer24.skipToGroupEnd();
                }
                return unit;
            case 26:
                LazyItemScope item12 = (LazyItemScope) obj;
                Composer composer25 = (Composer) obj2;
                int iIntValue25 = ((Integer) obj3).intValue();
                ComposableLambda composableLambda27 = ComposableSingletons$WalletAllTransactionsComposableKt.f10823a;
                Intrinsics.i(item12, "$this$item");
                if (composer25.shouldExecute((iIntValue25 & 17) != 16, iIntValue25 & 1)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(417899463, iIntValue25, -1, "app.chalo.wallet.ui.alltransactions.compose.ComposableSingletons$WalletAllTransactionsComposableKt.lambda$417899463.<anonymous> (WalletAllTransactionsComposable.kt:123)");
                    }
                    WalletTransactionsContentKt.c(composer25, 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer25.skipToGroupEnd();
                }
                return unit;
            case 27:
                return a(obj, obj2, obj3);
            case 28:
                return DragGestureDetectorKt.detectDragGestures$lambda$6((PointerInputChange) obj, (PointerInputChange) obj2, (Offset) obj3);
            default:
                HttpRetryShouldRetryContext retryOnExceptionIf = (HttpRetryShouldRetryContext) obj;
                Throwable cause = (Throwable) obj3;
                Intrinsics.i(retryOnExceptionIf, "$this$retryOnExceptionIf");
                Intrinsics.i((HttpRequestBuilder) obj2, "<unused var>");
                Intrinsics.i(cause, "cause");
                Logger logger = HttpRequestRetryKt.f16663a;
                Throwable thA = ExceptionUtilsJvmKt.a(cause);
                return Boolean.valueOf(((thA instanceof HttpRequestTimeoutException) || (thA instanceof ConnectTimeoutException) || (thA instanceof SocketTimeoutException) || (cause instanceof CancellationException)) ? false : true);
        }
    }
}
