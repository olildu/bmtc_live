package defpackage;

import androidx.compose.animation.AnimatedContentScope;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScope;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.foundation.pager.PagerScope;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.ZIndexModifierKt;
import androidx.compose.ui.draw.ClipKt;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.layout.ContentScale;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.OnGloballyPositionedModifierKt;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.unit.Density;
import androidx.media3.extractor.ts.TsExtractor;
import app.chalo.compose.StandardErrorScreenKt;
import app.chalo.compose.components.HorizontalImageViewerDialogImageType;
import app.chalo.compose.components.image.CommonImageKt;
import app.chalo.compose.components.plotline.PlotlineComposeWidgetKt;
import app.chalo.compose.components.shimmer.ShimmerEffectKt;
import app.chalo.compose.resources.PainterResourceHelperKt;
import app.chalo.compose.theme.ChaloTheme;
import app.chalo.home.ui.history.uistate.ChaloWidgetCardUiState;
import app.chalo.home.ui.regularbus.RegularBusPageDisplayItemData;
import app.chalo.livetracking.routedetails.ui.routedetailsbottomsheet.BottomSheetScaffoldState;
import app.chalo.livetracking.routedetails.ui.routedetailsscreen.compose.RouteDetailsScreenKt;
import app.chalo.livetracking.routedetails.ui.routedetailsscreen.compose.screentype.AllLiveVehicleKt;
import app.chalo.livetracking.routedetails.ui.routedetailsscreen.compose.screentype.RouteDetailsStopAndMapScreenKt;
import app.chalo.livetracking.routedetails.ui.routedetailsscreen.compose.screentype.RouteTimeTableKt;
import app.chalo.livetracking.routedetails.ui.routedetailsscreen.compose.screentype.StopListViewKt;
import app.chalo.livetracking.tripplanner.ui.details.TripPlannerDetailsState;
import app.chalo.livetracking.tripplanner.ui.details.compose.TripPlannerDetailsScreenKt;
import app.chalo.livetracking.ui.routedetailsscreen.RouteDetailsViewState;
import app.chalo.livetracking.ui.routedetailsscreen.RouteDetailsViewTypeUIState;
import app.chalo.livetracking.ui.routedetailsscreen.RouteViewTargetType;
import app.chalo.location.LatLng;
import app.chalo.premiumbus.prebookedtickets.newactivation.PostValidationScreenKt;
import app.chalo.premiumbus.prebookedtickets.ui.newactivation.NewPremiumBusReserveTicketActivationState;
import app.chalo.premiumbus.prebookedtickets.ui.newactivation.PremiumBusPostBoardingDetailsTab;
import app.chalo.premiumbus.ui.stopdetails.PBBusStopImageType;
import app.chalo.premiumbus.ui.stopdetails.PBStopDetailsMainScreenStopSectionType;
import app.chalo.premiumbus.ui.stopdetails.PremiumBusStopDetails;
import app.chalo.premiumbus.ui.stopdetails.PremiumBusStopDetailsViewState;
import app.chalo.premiumbus.ui.stopdetails.compose.PBStopDetailsMainScreenKt;
import app.chalo.providers.iconassetprovider.IconType;
import app.chalo.uistate.image.ImageUIState;
import coil3.compose.AsyncImagePainter;
import coil3.compose.SingletonSubcomposeAsyncImageKt;
import coil3.compose.SubcomposeAsyncImageScope;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class q80 implements Function4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f19099a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ q80(int i, Object obj, Object obj2, Object obj3) {
        this.f19099a = i;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
    }

    @Override // kotlin.jvm.functions.Function4
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        PremiumBusStopDetails premiumBusStopDetails;
        Composer composer;
        int i = this.f19099a;
        Unit unit = Unit.f17538a;
        final int i2 = 0;
        Object obj5 = this.d;
        Object obj6 = this.c;
        Object obj7 = this.b;
        boolean z = true;
        switch (i) {
            case 0:
                List list = (List) obj7;
                final Modifier modifier = (Modifier) obj6;
                BoxScope boxScope = (BoxScope) obj5;
                PagerScope HorizontalPager = (PagerScope) obj;
                int iIntValue = ((Integer) obj2).intValue();
                Composer composer2 = (Composer) obj3;
                int iIntValue2 = ((Integer) obj4).intValue();
                Intrinsics.i(HorizontalPager, "$this$HorizontalPager");
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-314505463, iIntValue2, -1, "app.chalo.compose.components.ImagePager.<anonymous>.<anonymous> (HorizontalImageDialogViewer.kt:169)");
                }
                HorizontalImageViewerDialogImageType horizontalImageViewerDialogImageType = (HorizontalImageViewerDialogImageType) list.get(iIntValue);
                if (horizontalImageViewerDialogImageType instanceof HorizontalImageViewerDialogImageType.Resource) {
                    composer2.startReplaceGroup(-2108420717);
                    PainterResourceHelperKt.a(null, composer2, 0);
                    throw null;
                }
                if (!(horizontalImageViewerDialogImageType instanceof HorizontalImageViewerDialogImageType.Url)) {
                    throw pk0.p(composer2, -1592036789);
                }
                composer2.startReplaceGroup(-2108087963);
                String str = ((HorizontalImageViewerDialogImageType.Url) horizontalImageViewerDialogImageType).f1845a;
                Modifier modifierAlign = boxScope.align(ClipKt.clip(modifier, ChaloTheme.d(composer2, 6).b), Alignment.INSTANCE.getCenter());
                ContentScale fit = ContentScale.INSTANCE.getFit();
                final int i3 = z ? 1 : 0;
                SingletonSubcomposeAsyncImageKt.a(str, null, modifierAlign, ComposableLambdaKt.rememberComposableLambda(1090167409, true, new Function4() { // from class: n80
                    @Override // kotlin.jvm.functions.Function4
                    public final Object invoke(Object obj8, Object obj9, Object obj10, Object obj11) {
                        SubcomposeAsyncImageScope SubcomposeAsyncImage = (SubcomposeAsyncImageScope) obj8;
                        switch (i3) {
                            case 0:
                                AsyncImagePainter.State.Error it = (AsyncImagePainter.State.Error) obj9;
                                Composer composer3 = (Composer) obj10;
                                int iIntValue3 = ((Integer) obj11).intValue();
                                Intrinsics.i(SubcomposeAsyncImage, "$this$SubcomposeAsyncImage");
                                Intrinsics.i(it, "it");
                                if (composer3.shouldExecute((iIntValue3 & TsExtractor.TS_STREAM_TYPE_AC3) != 128, iIntValue3 & 1)) {
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(1686756391, iIntValue3, -1, "app.chalo.compose.components.ImagePager.<anonymous>.<anonymous>.<anonymous> (HorizontalImageDialogViewer.kt:197)");
                                    }
                                    BoxKt.Box(BackgroundKt.m264backgroundbw27NRU$default(ClipKt.clip(modifier, ChaloTheme.d(composer3, 6).b), ChaloTheme.a(composer3, 6).A, null, 2, null), composer3, 0);
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                    }
                                } else {
                                    composer3.skipToGroupEnd();
                                }
                                break;
                            default:
                                AsyncImagePainter.State.Loading it2 = (AsyncImagePainter.State.Loading) obj9;
                                Composer composer4 = (Composer) obj10;
                                int iIntValue4 = ((Integer) obj11).intValue();
                                Intrinsics.i(SubcomposeAsyncImage, "$this$SubcomposeAsyncImage");
                                Intrinsics.i(it2, "it");
                                if (composer4.shouldExecute((iIntValue4 & TsExtractor.TS_STREAM_TYPE_AC3) != 128, iIntValue4 & 1)) {
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(1090167409, iIntValue4, -1, "app.chalo.compose.components.ImagePager.<anonymous>.<anonymous>.<anonymous> (HorizontalImageDialogViewer.kt:187)");
                                    }
                                    BoxKt.Box(ShimmerEffectKt.b(ClipKt.clip(modifier, ChaloTheme.d(composer4, 6).b), Color.m4595boximpl(ChaloTheme.a(composer4, 6).p), Color.m4595boximpl(ChaloTheme.a(composer4, 6).q), 4), composer4, 0);
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                    }
                                } else {
                                    composer4.skipToGroupEnd();
                                }
                                break;
                        }
                        return Unit.f17538a;
                    }
                }, composer2, 54), null, ComposableLambdaKt.rememberComposableLambda(1686756391, true, new Function4() { // from class: n80
                    @Override // kotlin.jvm.functions.Function4
                    public final Object invoke(Object obj8, Object obj9, Object obj10, Object obj11) {
                        SubcomposeAsyncImageScope SubcomposeAsyncImage = (SubcomposeAsyncImageScope) obj8;
                        switch (i2) {
                            case 0:
                                AsyncImagePainter.State.Error it = (AsyncImagePainter.State.Error) obj9;
                                Composer composer3 = (Composer) obj10;
                                int iIntValue3 = ((Integer) obj11).intValue();
                                Intrinsics.i(SubcomposeAsyncImage, "$this$SubcomposeAsyncImage");
                                Intrinsics.i(it, "it");
                                if (composer3.shouldExecute((iIntValue3 & TsExtractor.TS_STREAM_TYPE_AC3) != 128, iIntValue3 & 1)) {
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(1686756391, iIntValue3, -1, "app.chalo.compose.components.ImagePager.<anonymous>.<anonymous>.<anonymous> (HorizontalImageDialogViewer.kt:197)");
                                    }
                                    BoxKt.Box(BackgroundKt.m264backgroundbw27NRU$default(ClipKt.clip(modifier, ChaloTheme.d(composer3, 6).b), ChaloTheme.a(composer3, 6).A, null, 2, null), composer3, 0);
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                    }
                                } else {
                                    composer3.skipToGroupEnd();
                                }
                                break;
                            default:
                                AsyncImagePainter.State.Loading it2 = (AsyncImagePainter.State.Loading) obj9;
                                Composer composer4 = (Composer) obj10;
                                int iIntValue4 = ((Integer) obj11).intValue();
                                Intrinsics.i(SubcomposeAsyncImage, "$this$SubcomposeAsyncImage");
                                Intrinsics.i(it2, "it");
                                if (composer4.shouldExecute((iIntValue4 & TsExtractor.TS_STREAM_TYPE_AC3) != 128, iIntValue4 & 1)) {
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(1090167409, iIntValue4, -1, "app.chalo.compose.components.ImagePager.<anonymous>.<anonymous>.<anonymous> (HorizontalImageDialogViewer.kt:187)");
                                    }
                                    BoxKt.Box(ShimmerEffectKt.b(ClipKt.clip(modifier, ChaloTheme.d(composer4, 6).b), Color.m4595boximpl(ChaloTheme.a(composer4, 6).p), Color.m4595boximpl(ChaloTheme.a(composer4, 6).q), 4), composer4, 0);
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                    }
                                } else {
                                    composer4.skipToGroupEnd();
                                }
                                break;
                        }
                        return Unit.f17538a;
                    }
                }, composer2, 54), null, null, null, fit, composer2, 1597488, 48, 63400);
                composer2.endReplaceGroup();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                return unit;
            case 1:
                List list2 = (List) obj7;
                PremiumBusStopDetailsViewState premiumBusStopDetailsViewState = (PremiumBusStopDetailsViewState) obj6;
                Object obj8 = (Function1) obj5;
                PagerScope HorizontalPager2 = (PagerScope) obj;
                int iIntValue3 = ((Integer) obj2).intValue();
                Composer composer3 = (Composer) obj3;
                int iIntValue4 = ((Integer) obj4).intValue();
                Intrinsics.i(HorizontalPager2, "$this$HorizontalPager");
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1231051685, iIntValue4, -1, "app.chalo.premiumbus.ui.stopdetails.compose.PBStopDetailsBottomSheetContent.<anonymous>.<anonymous> (PBStopDetailsMainScreen.kt:236)");
                }
                PBStopDetailsMainScreenStopSectionType pBStopDetailsMainScreenStopSectionType = (PBStopDetailsMainScreenStopSectionType) list2.get(iIntValue3);
                int i4 = PBStopDetailsMainScreenKt.WhenMappings.f7953a[pBStopDetailsMainScreenStopSectionType.ordinal()];
                if (i4 == 1) {
                    premiumBusStopDetails = premiumBusStopDetailsViewState.c;
                } else {
                    if (i4 != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                    premiumBusStopDetails = premiumBusStopDetailsViewState.d;
                }
                if (premiumBusStopDetails == null) {
                    composer3.startReplaceGroup(465352279);
                    composer3.endReplaceGroup();
                } else {
                    composer3.startReplaceGroup(465352280);
                    Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null);
                    String str2 = premiumBusStopDetails.b;
                    String str3 = premiumBusStopDetails.c;
                    LatLng latLng = premiumBusStopDetails.d;
                    PBBusStopImageType pBBusStopImageType = premiumBusStopDetails.e;
                    boolean zChanged = composer3.changed(obj8) | composer3.changedInstance(premiumBusStopDetails);
                    Object objRememberedValue = composer3.rememberedValue();
                    if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue = new ej0(19, obj8, premiumBusStopDetails);
                        composer3.updateRememberedValue(objRememberedValue);
                    }
                    Function1 function1 = (Function1) objRememberedValue;
                    boolean zChanged2 = composer3.changed(obj8) | composer3.changed(pBStopDetailsMainScreenStopSectionType.ordinal());
                    Object objRememberedValue2 = composer3.rememberedValue();
                    if (zChanged2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue2 = new ej0(20, obj8, pBStopDetailsMainScreenStopSectionType);
                        composer3.updateRememberedValue(objRememberedValue2);
                    }
                    productbooking_release.a(modifierFillMaxWidth$default, str2, str3, latLng, pBBusStopImageType, function1, (Function1) objRememberedValue2, composer3, 4102);
                    composer3.endReplaceGroup();
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                return unit;
            case 2:
                List list3 = (List) obj7;
                NewPremiumBusReserveTicketActivationState newPremiumBusReserveTicketActivationState = (NewPremiumBusReserveTicketActivationState) obj6;
                Function1 function2 = (Function1) obj5;
                PagerScope HorizontalPager3 = (PagerScope) obj;
                int iIntValue5 = ((Integer) obj2).intValue();
                Composer composer4 = (Composer) obj3;
                int iIntValue6 = ((Integer) obj4).intValue();
                Intrinsics.i(HorizontalPager3, "$this$HorizontalPager");
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-439995578, iIntValue6, -1, "app.chalo.premiumbus.prebookedtickets.newactivation.PostValidationScreen.<anonymous>.<anonymous> (PostValidationScreen.kt:143)");
                }
                int i5 = PostValidationScreenKt.WhenMappings.f7326a[((PremiumBusPostBoardingDetailsTab) list3.get(iIntValue5)).ordinal()];
                if (i5 == 1) {
                    composer4.startReplaceGroup(332072926);
                    Modifier modifierM784padding3ABfNKs = PaddingKt.m784padding3ABfNKs(Modifier.INSTANCE, ChaloTheme.b(composer4, 0).h);
                    List list4 = newPremiumBusReserveTicketActivationState.w;
                    boolean zChanged3 = composer4.changed(function2);
                    Object objRememberedValue3 = composer4.rememberedValue();
                    if (zChanged3 || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue3 = new sn0(function2, 14);
                        composer4.updateRememberedValue(objRememberedValue3);
                    }
                    PostValidationScreenKt.a(0, composer4, modifierM784padding3ABfNKs, list4, (Function1) objRememberedValue3);
                    composer4.endReplaceGroup();
                } else {
                    if (i5 != 2) {
                        throw pk0.p(composer4, -1928953683);
                    }
                    composer4.startReplaceGroup(332604111);
                    PostValidationScreenKt.b(newPremiumBusReserveTicketActivationState, function2, composer4, 0);
                    composer4.endReplaceGroup();
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                return unit;
            case 3:
                ChaloWidgetCardUiState chaloWidgetCardUiState = (ChaloWidgetCardUiState) obj7;
                Modifier modifier2 = (Modifier) obj6;
                MutableState mutableState = (MutableState) obj5;
                SubcomposeAsyncImageScope SubcomposeAsyncImage = (SubcomposeAsyncImageScope) obj;
                AsyncImagePainter.State.Error it = (AsyncImagePainter.State.Error) obj2;
                Composer composer5 = (Composer) obj3;
                int iIntValue7 = ((Integer) obj4).intValue();
                Intrinsics.i(SubcomposeAsyncImage, "$this$SubcomposeAsyncImage");
                Intrinsics.i(it, "it");
                if (composer5.shouldExecute((iIntValue7 & TsExtractor.TS_STREAM_TYPE_AC3) != 128, iIntValue7 & 1)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-209943929, iIntValue7, -1, "app.chalo.home.ui.history.compose.components.ChaloWidgetCard.<anonymous>.<anonymous>.<anonymous>.<anonymous> (PurchaseProductBottomSheetContent.kt:128)");
                    }
                    ImageUIState imageUIState = chaloWidgetCardUiState.c;
                    if (imageUIState == null) {
                        composer5.startReplaceGroup(-967138716);
                        composer5.endReplaceGroup();
                    } else {
                        composer5.startReplaceGroup(-967138715);
                        mutableState.setValue(Boolean.TRUE);
                        MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getCenterStart(), false);
                        long currentCompositeKeyHashCode = ComposablesKt.getCurrentCompositeKeyHashCode(composer5, 0);
                        int i6 = (int) (currentCompositeKeyHashCode ^ (currentCompositeKeyHashCode >>> 32));
                        CompositionLocalMap currentCompositionLocalMap = composer5.getCurrentCompositionLocalMap();
                        Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composer5, modifier2);
                        ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
                        Function0<ComposeUiNode> constructor = companion.getConstructor();
                        if (composer5.getApplier() == null) {
                            ComposablesKt.invalidApplier();
                        }
                        composer5.startReusableNode();
                        if (composer5.getInserting()) {
                            composer5.createNode(constructor);
                        } else {
                            composer5.useNode();
                        }
                        Composer composerM3915constructorimpl = Updater.m3915constructorimpl(composer5);
                        pk0.v(companion, composerM3915constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy, composerM3915constructorimpl, currentCompositionLocalMap);
                        Updater.m3923setimpl(composerM3915constructorimpl, modifierMaterializeModifier, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion, composerM3915constructorimpl, Integer.valueOf(i6), composerM3915constructorimpl));
                        BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                        CommonImageKt.a(imageUIState, null, false, composer5, 0, 6);
                        composer5.endNode();
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
                RegularBusPageDisplayItemData regularBusPageDisplayItemData = (RegularBusPageDisplayItemData) obj7;
                Modifier modifier3 = (Modifier) obj6;
                MutableState mutableState2 = (MutableState) obj5;
                SubcomposeAsyncImageScope SubcomposeAsyncImage2 = (SubcomposeAsyncImageScope) obj;
                AsyncImagePainter.State.Error it2 = (AsyncImagePainter.State.Error) obj2;
                Composer composer6 = (Composer) obj3;
                int iIntValue8 = ((Integer) obj4).intValue();
                Intrinsics.i(SubcomposeAsyncImage2, "$this$SubcomposeAsyncImage");
                Intrinsics.i(it2, "it");
                if (composer6.shouldExecute((iIntValue8 & TsExtractor.TS_STREAM_TYPE_AC3) != 128, iIntValue8 & 1)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(406302471, iIntValue8, -1, "app.chalo.home.ui.regularbus.compose.ProductPurchaseSectionsUI.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (RegularBusScreenUI.kt:1213)");
                    }
                    IconType iconType = regularBusPageDisplayItemData.p;
                    if (iconType == null) {
                        composer6.startReplaceGroup(939155646);
                        composer6.endReplaceGroup();
                    } else {
                        composer6.startReplaceGroup(939155647);
                        mutableState2.setValue(Boolean.TRUE);
                        MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy2 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getCenterStart(), false);
                        long currentCompositeKeyHashCode2 = ComposablesKt.getCurrentCompositeKeyHashCode(composer6, 0);
                        int i7 = (int) (currentCompositeKeyHashCode2 ^ (currentCompositeKeyHashCode2 >>> 32));
                        CompositionLocalMap currentCompositionLocalMap2 = composer6.getCurrentCompositionLocalMap();
                        Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(composer6, modifier3);
                        ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
                        Function0<ComposeUiNode> constructor2 = companion2.getConstructor();
                        if (composer6.getApplier() == null) {
                            ComposablesKt.invalidApplier();
                        }
                        composer6.startReusableNode();
                        if (composer6.getInserting()) {
                            composer6.createNode(constructor2);
                        } else {
                            composer6.useNode();
                        }
                        Composer composerM3915constructorimpl2 = Updater.m3915constructorimpl(composer6);
                        pk0.v(companion2, composerM3915constructorimpl2, measurePolicyMaybeCachedBoxMeasurePolicy2, composerM3915constructorimpl2, currentCompositionLocalMap2);
                        Updater.m3923setimpl(composerM3915constructorimpl2, modifierMaterializeModifier2, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion2, composerM3915constructorimpl2, Integer.valueOf(i7), composerM3915constructorimpl2));
                        BoxScopeInstance boxScopeInstance2 = BoxScopeInstance.INSTANCE;
                        ImageKt.Image(PainterResourceHelperKt.a(iconType, composer6, 0), (String) null, (Modifier) null, (Alignment) null, ContentScale.INSTANCE.getFit(), 0.0f, (ColorFilter) null, composer6, Painter.$stable | 24624, 108);
                        composer6.endNode();
                        composer6.endReplaceGroup();
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer6.skipToGroupEnd();
                }
                return unit;
            case 5:
                RouteDetailsViewState routeDetailsViewState = (RouteDetailsViewState) obj7;
                BottomSheetScaffoldState bottomSheetScaffoldState = (BottomSheetScaffoldState) obj6;
                BoxScope boxScope2 = (BoxScope) obj5;
                AnimatedContentScope AnimatedContent = (AnimatedContentScope) obj;
                RouteViewTargetType viewType = (RouteViewTargetType) obj2;
                Composer composer7 = (Composer) obj3;
                int iIntValue9 = ((Integer) obj4).intValue();
                Intrinsics.i(AnimatedContent, "$this$AnimatedContent");
                Intrinsics.i(viewType, "viewType");
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1570782167, iIntValue9, -1, "app.chalo.livetracking.routedetails.ui.routedetailsscreen.compose.RouteDetailsScreen.<anonymous>.<anonymous> (RouteDetailsScreen.kt:59)");
                }
                int i8 = RouteDetailsScreenKt.WhenMappings.f4464a[viewType.ordinal()];
                if (i8 == 1) {
                    composer7.startReplaceGroup(1503063590);
                    RouteDetailsViewTypeUIState routeDetailsViewTypeUIState = routeDetailsViewState.d;
                    RouteDetailsViewTypeUIState.MainScreen mainScreen = routeDetailsViewTypeUIState instanceof RouteDetailsViewTypeUIState.MainScreen ? (RouteDetailsViewTypeUIState.MainScreen) routeDetailsViewTypeUIState : null;
                    if (mainScreen == null) {
                        composer7.startReplaceGroup(1503063589);
                    } else {
                        composer7.startReplaceGroup(1503063590);
                        RouteDetailsStopAndMapScreenKt.b(mainScreen, bottomSheetScaffoldState, null, composer7, 0);
                    }
                    composer7.endReplaceGroup();
                    composer7.endReplaceGroup();
                } else if (i8 == 2) {
                    composer7.startReplaceGroup(1503499853);
                    RouteDetailsViewTypeUIState routeDetailsViewTypeUIState2 = routeDetailsViewState.d;
                    RouteDetailsViewTypeUIState.TimeTable timeTable = routeDetailsViewTypeUIState2 instanceof RouteDetailsViewTypeUIState.TimeTable ? (RouteDetailsViewTypeUIState.TimeTable) routeDetailsViewTypeUIState2 : null;
                    if (timeTable == null) {
                        composer7.startReplaceGroup(1503499852);
                    } else {
                        composer7.startReplaceGroup(1503499853);
                        RouteTimeTableKt.a(timeTable, composer7, 0);
                    }
                    composer7.endReplaceGroup();
                    composer7.endReplaceGroup();
                } else if (i8 == 3) {
                    composer7.startReplaceGroup(1503783720);
                    RouteDetailsViewTypeUIState routeDetailsViewTypeUIState3 = routeDetailsViewState.d;
                    RouteDetailsViewTypeUIState.AllLiveVehicles allLiveVehicles = routeDetailsViewTypeUIState3 instanceof RouteDetailsViewTypeUIState.AllLiveVehicles ? (RouteDetailsViewTypeUIState.AllLiveVehicles) routeDetailsViewTypeUIState3 : null;
                    if (allLiveVehicles == null) {
                        composer7.startReplaceGroup(1503783719);
                    } else {
                        composer7.startReplaceGroup(1503783720);
                        AllLiveVehicleKt.a(allLiveVehicles, null, composer7, 0);
                    }
                    composer7.endReplaceGroup();
                    composer7.endReplaceGroup();
                } else if (i8 == 4) {
                    composer7.startReplaceGroup(1504062255);
                    RouteDetailsViewTypeUIState routeDetailsViewTypeUIState4 = routeDetailsViewState.d;
                    RouteDetailsViewTypeUIState.StopList stopList = routeDetailsViewTypeUIState4 instanceof RouteDetailsViewTypeUIState.StopList ? (RouteDetailsViewTypeUIState.StopList) routeDetailsViewTypeUIState4 : null;
                    if (stopList == null) {
                        composer7.startReplaceGroup(1504062254);
                    } else {
                        composer7.startReplaceGroup(1504062255);
                        StopListViewKt.a(stopList, composer7, 0);
                    }
                    composer7.endReplaceGroup();
                    composer7.endReplaceGroup();
                } else {
                    if (i8 != 5) {
                        throw pk0.p(composer7, 1988144541);
                    }
                    composer7.startReplaceGroup(1504335396);
                    RouteDetailsViewTypeUIState routeDetailsViewTypeUIState5 = routeDetailsViewState.d;
                    RouteDetailsViewTypeUIState.Error error = routeDetailsViewTypeUIState5 instanceof RouteDetailsViewTypeUIState.Error ? (RouteDetailsViewTypeUIState.Error) routeDetailsViewTypeUIState5 : null;
                    if (error == null) {
                        composer7.startReplaceGroup(1504335395);
                    } else {
                        composer7.startReplaceGroup(1504335396);
                        StandardErrorScreenKt.c(error.b, boxScope2.align(SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null), Alignment.INSTANCE.getCenter()), composer7, 0, 0);
                    }
                    composer7.endReplaceGroup();
                    composer7.endReplaceGroup();
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                return unit;
            default:
                TripPlannerDetailsState tripPlannerDetailsState = (TripPlannerDetailsState) obj7;
                Function2 function3 = (Function2) obj6;
                Density density = (Density) obj5;
                LazyItemScope stickyHeader = (LazyItemScope) obj;
                ((Integer) obj2).getClass();
                Composer composer8 = (Composer) obj3;
                int iIntValue10 = ((Integer) obj4).intValue();
                Intrinsics.i(stickyHeader, "$this$stickyHeader");
                if (composer8.shouldExecute((iIntValue10 & TsExtractor.TS_STREAM_TYPE_AC3) != 128, iIntValue10 & 1)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(131938548, iIntValue10, -1, "app.chalo.livetracking.tripplanner.ui.details.compose.TripPlannerDetailsBottomSheetContent.<anonymous>.<anonymous>.<anonymous>.<anonymous> (TripPlannerDetailsScreen.kt:298)");
                    }
                    String str4 = tripPlannerDetailsState.b;
                    Integer num = tripPlannerDetailsState.c;
                    if (str4 == null || tripPlannerDetailsState.f4739a == null || num == null) {
                        composer = composer8;
                        composer.startReplaceGroup(-1689524884);
                    } else {
                        composer8.startReplaceGroup(-1676689830);
                        String str5 = tripPlannerDetailsState.b;
                        int iIntValue11 = num.intValue();
                        String str6 = tripPlannerDetailsState.f4739a;
                        Modifier modifierFillMaxWidth$default2 = SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null);
                        boolean zChanged4 = composer8.changed(function3) | composer8.changed(density);
                        Object objRememberedValue4 = composer8.rememberedValue();
                        if (zChanged4 || objRememberedValue4 == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue4 = new pg1(29, function3, density);
                            composer8.updateRememberedValue(objRememberedValue4);
                        }
                        TripPlannerDetailsScreenKt.d(iIntValue11, 0, composer8, ZIndexModifierKt.zIndex(BackgroundKt.m264backgroundbw27NRU$default(OnGloballyPositionedModifierKt.onGloballyPositioned(modifierFillMaxWidth$default2, (Function1) objRememberedValue4), ChaloTheme.a(composer8, 0).t, null, 2, null), 10.0f), str5, str6);
                        composer = composer8;
                        PlotlineComposeWidgetKt.a(6, 2, composer, null, "tripPlannerDetailsBanner");
                    }
                    composer.endReplaceGroup();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer8.skipToGroupEnd();
                }
                return unit;
        }
    }
}
