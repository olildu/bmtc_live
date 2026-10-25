package app.chalo.premiumbus.prebookedtickets.newactivation;

import androidx.compose.animation.AnimationModifierKt;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.OverscrollEffect;
import androidx.compose.foundation.OverscrollKt;
import androidx.compose.foundation.ScrollKt;
import androidx.compose.foundation.ScrollState;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.material3.DividerKt;
import androidx.compose.material3.IconKt;
import androidx.compose.material3.TextKt;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.GraphicsLayerModifierKt;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.layout.ContentScale;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.SpanStyle;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.style.TextOverflow;
import androidx.core.view.accessibility.AccessibilityEventCompat;
import androidx.media3.exoplayer.analytics.AnalyticsListener;
import app.chalo.compose.components.ChaloSpacersKt;
import app.chalo.compose.resources.LottieResourceHelperKt;
import app.chalo.compose.resources.PainterResourceHelperKt;
import app.chalo.compose.resources.StringResourcesHelperKt;
import app.chalo.compose.theme.ChaloTheme;
import app.chalo.compose.theme.ChaloTypographyKt;
import app.chalo.extensions.AnyExtsKt;
import app.chalo.home.ui.compose.PBStopImageKt;
import app.chalo.premiumbus.bulkbookingridedetails.ui.ChaloBusActiveTicketKt;
import app.chalo.premiumbus.bulkbookingridedetails.ui.PremiumBusBookingCardKt;
import app.chalo.premiumbus.data.models.app.ReservationType;
import app.chalo.premiumbus.data.models.app.SeatInfoAppModel;
import app.chalo.premiumbus.data.models.app.TripCommunicationAppModel;
import app.chalo.premiumbus.prebookedtickets.newactivation.NewPremiumBusActivationBottomSheetContentKt;
import app.chalo.premiumbus.prebookedtickets.ui.activation.PremiumBusTripScheduleTagTextKt;
import app.chalo.premiumbus.prebookedtickets.ui.newactivation.NewPremiumBusReserveTicketActivationContractKt;
import app.chalo.premiumbus.prebookedtickets.ui.newactivation.NewPremiumBusReserveTicketActivationState;
import app.chalo.premiumbus.prebookedtickets.ui.newactivation.NewPremiumReserveTicketDetailsScreenType;
import app.chalo.premiumbus.prebookedtickets.ui.newactivation.PBStopImagesDetails;
import app.chalo.premiumbus.prebookedtickets.ui.newactivation.ticketinfohandler.PremiumBusBookingTripTimeInfoState;
import app.chalo.premiumbus.prebookedtickets.ui.newactivation.ticketinfohandler.PremiumBusBookingVehicleInfoState;
import app.chalo.premiumbus.prebookedtickets.ui.newactivation.ticketinfohandler.PremiumBusPostBookingStopSchedule;
import app.chalo.premiumbus.prebookedtickets.ui.newactivation.ticketinfohandler.PremiumBusTripInfoContractKt;
import app.chalo.premiumbus.prebookedtickets.ui.newactivation.ticketinfohandler.PremiumBusTripScheduleTag;
import app.chalo.premiumbus.prebookedtickets.ui.newactivation.ticketinfohandler.PremiumReserveTicketStopDirectionsInfoState;
import app.chalo.premiumbus.prebookedtickets.ui.newactivation.ticketinfohandler.PremiumReserveTicketTrackingState;
import app.chalo.premiumbus.ui.stopselection.FromAndToStopCardData;
import app.chalo.premiumbus.ui.stopselection.compose.FromAndToStopCardKt;
import app.chalo.providers.iconassetprovider.IconType;
import app.chalo.providers.lottieassetprovider.LottieType;
import app.chalo.providers.stringprovider.StringEnum;
import defpackage.am;
import defpackage.an0;
import defpackage.b3;
import defpackage.fk0;
import defpackage.gf;
import defpackage.i41;
import defpackage.kg;
import defpackage.km;
import defpackage.lh;
import defpackage.nu;
import defpackage.pk0;
import defpackage.qm0;
import defpackage.r1;
import defpackage.rg;
import defpackage.wc;
import defpackage.wm0;
import defpackage.zf0;
import io.github.alexzhirkevich.compottie.LottieCompositionResultImpl;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.EmptyList;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"home_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class NewPremiumBusActivationBottomSheetContentKt {

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f7323a;

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
            f7323a = iArr;
        }
    }

    public static final void a(Modifier modifier, NewPremiumReserveTicketDetailsScreenType screenType, Composer composer, int i) {
        Composer composer2;
        Modifier modifier2;
        String strC;
        Intrinsics.i(screenType, "screenType");
        Composer composerStartRestartGroup = composer.startRestartGroup(816007830);
        int i2 = i | 6;
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changed(screenType.ordinal()) ? 32 : 16;
        }
        if (composerStartRestartGroup.shouldExecute((i2 & 19) != 18, i2 & 1)) {
            Modifier.Companion companion = Modifier.INSTANCE;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(816007830, i2, -1, "app.chalo.premiumbus.prebookedtickets.newactivation.BusPassedPickupStopView (NewPremiumBusActivationBottomSheetContent.kt:597)");
            }
            int i3 = WhenMappings.f7323a[screenType.ordinal()];
            if (i3 == 1) {
                composerStartRestartGroup.startReplaceGroup(-1795482784);
                strC = StringResourcesHelperKt.c(StringEnum.PB_BUS_PASSED_PICKUP_STOP_INFO_MSG, new Object[0], composerStartRestartGroup, 6);
                composerStartRestartGroup.endReplaceGroup();
            } else {
                if (i3 != 2) {
                    throw pk0.p(composerStartRestartGroup, -1795485334);
                }
                composerStartRestartGroup.startReplaceGroup(-1795478210);
                strC = StringResourcesHelperKt.c(StringEnum.PB_BUS_PASSED_DROP_STOP_INFO_MSG, new Object[0], composerStartRestartGroup, 6);
                composerStartRestartGroup.endReplaceGroup();
            }
            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composerStartRestartGroup, 0);
            long currentCompositeKeyHashCode = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
            int i4 = (int) (currentCompositeKeyHashCode ^ (currentCompositeKeyHashCode >>> 32));
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
            Updater.m3923setimpl(composerM3915constructorimpl, modifierMaterializeModifier, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion2, composerM3915constructorimpl, Integer.valueOf(i4), composerM3915constructorimpl));
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
            composer2 = composerStartRestartGroup;
            String str = strC;
            modifier2 = companion;
            TextKt.m2623TextNvy7gAk(StringResourcesHelperKt.c(StringEnum.BUS_HAS_PASSED_YOUR_STOP, new Object[0], composerStartRestartGroup, 6), null, ChaloTheme.a(composerStartRestartGroup, 0).e, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ChaloTheme.e(composerStartRestartGroup, 0).getDisplaySmall(), composer2, 0, 0, 131066);
            SpacerKt.Spacer(SizeKt.m814height3ABfNKs(modifier2, ChaloTheme.b(composer2, 0).d), composer2, 0);
            TextKt.m2623TextNvy7gAk(str, null, ChaloTheme.a(composer2, 0).e, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ChaloTheme.e(composer2, 0).getBodySmall(), composer2, 0, 0, 131066);
            composer2.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer2 = composerStartRestartGroup;
            composer2.skipToGroupEnd();
            modifier2 = modifier;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new rg(modifier2, screenType, i, 1));
        }
    }

    public static final void b(Modifier modifier, PremiumBusBookingTripTimeInfoState tripTimeInfo, PremiumBusPostBookingStopSchedule stopScheduleTime, Composer composer, int i) {
        Intrinsics.i(tripTimeInfo, "tripTimeInfo");
        Intrinsics.i(stopScheduleTime, "stopScheduleTime");
        Composer composerStartRestartGroup = composer.startRestartGroup(380351238);
        int i2 = i | 6;
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changed(tripTimeInfo) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= composerStartRestartGroup.changed(stopScheduleTime) ? 256 : 128;
        }
        if (composerStartRestartGroup.shouldExecute((i2 & 147) != 146, i2 & 1)) {
            modifier = Modifier.INSTANCE;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(380351238, i2, -1, "app.chalo.premiumbus.prebookedtickets.newactivation.BusScheduleView (NewPremiumBusActivationBottomSheetContent.kt:622)");
            }
            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composerStartRestartGroup, 0);
            long currentCompositeKeyHashCode = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
            int i3 = (int) (currentCompositeKeyHashCode ^ (currentCompositeKeyHashCode >>> 32));
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
            pk0.v(companion, composerM3915constructorimpl, measurePolicyColumnMeasurePolicy, composerM3915constructorimpl, currentCompositionLocalMap);
            Updater.m3923setimpl(composerM3915constructorimpl, modifierMaterializeModifier, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion, composerM3915constructorimpl, Integer.valueOf(i3), composerM3915constructorimpl));
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
            if (stopScheduleTime.equals(PremiumBusPostBookingStopSchedule.NotApplicable.f7427a)) {
                composerStartRestartGroup.startReplaceGroup(1176098020);
                PremiumBusBookingCardKt.a(SizeKt.fillMaxWidth(modifier, 0.3f), 0.0f, composerStartRestartGroup, 6, 2);
                SpacerKt.Spacer(SizeKt.m814height3ABfNKs(modifier, ChaloTheme.b(composerStartRestartGroup, 0).d), composerStartRestartGroup, 0);
                PremiumBusBookingCardKt.a(SizeKt.fillMaxWidth(modifier, 0.4f), 0.0f, composerStartRestartGroup, 6, 2);
                composerStartRestartGroup.endReplaceGroup();
            } else if (stopScheduleTime instanceof PremiumBusPostBookingStopSchedule.ScheduleAvailable) {
                composerStartRestartGroup.startReplaceGroup(1176590176);
                if (tripTimeInfo instanceof PremiumBusBookingTripTimeInfoState.ExpectedTime) {
                    composerStartRestartGroup.startReplaceGroup(1176668513);
                    ChaloBusActiveTicketKt.k(composerStartRestartGroup, 0, ((PremiumBusBookingTripTimeInfoState.ExpectedTime) tripTimeInfo).b);
                    composerStartRestartGroup.endReplaceGroup();
                } else if (tripTimeInfo.equals(PremiumBusBookingTripTimeInfoState.BusPassedPickupStop.b) || tripTimeInfo.equals(PremiumBusBookingTripTimeInfoState.LiveEtaNotAvailable.b) || tripTimeInfo.equals(PremiumBusBookingTripTimeInfoState.NotFetched.b)) {
                    composerStartRestartGroup.startReplaceGroup(1177002073);
                    ChaloBusActiveTicketKt.k(composerStartRestartGroup, 0, ((PremiumBusPostBookingStopSchedule.ScheduleAvailable) stopScheduleTime).f7428a);
                    composerStartRestartGroup.endReplaceGroup();
                } else {
                    if (!(tripTimeInfo instanceof PremiumBusBookingTripTimeInfoState.LiveEta)) {
                        throw pk0.p(composerStartRestartGroup, 315049186);
                    }
                    composerStartRestartGroup.startReplaceGroup(1177188848);
                    composerStartRestartGroup.endReplaceGroup();
                }
                composerStartRestartGroup.endReplaceGroup();
            } else {
                if (!stopScheduleTime.equals(PremiumBusPostBookingStopSchedule.Unknown.f7429a)) {
                    throw pk0.p(composerStartRestartGroup, 315031384);
                }
                composerStartRestartGroup.startReplaceGroup(1177294992);
                composerStartRestartGroup.endReplaceGroup();
            }
            composerStartRestartGroup.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        Modifier modifier2 = modifier;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new wm0(modifier2, tripTimeInfo, stopScheduleTime, i, 1));
        }
    }

    public static final void c(int i, Composer composer, Modifier modifier, NewPremiumBusReserveTicketActivationState state, Function1 sendIntent) {
        int i2;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        an0 an0Var;
        Intrinsics.i(state, "state");
        Intrinsics.i(sendIntent, "sendIntent");
        Composer composerStartRestartGroup = composer.startRestartGroup(-1734249389);
        int currentMarker = composerStartRestartGroup.getCurrentMarker();
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(state) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(sendIntent) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= composerStartRestartGroup.changed(modifier) ? 256 : 128;
        }
        if (composerStartRestartGroup.shouldExecute((i2 & 147) != 146, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1734249389, i2, -1, "app.chalo.premiumbus.prebookedtickets.newactivation.NewPremiumBusActivationBottomSheetContent (NewPremiumBusActivationBottomSheetContent.kt:85)");
            }
            Modifier modifierFillMaxSize$default = SizeKt.fillMaxSize$default(modifier, 0.0f, 1, null);
            ScrollState scrollStateRememberScrollState = ScrollKt.rememberScrollState(0, composerStartRestartGroup, 0, 1);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(646753323, 0, -1, "app.chalo.premiumbus.prebookedtickets.newactivation.premiumActivationBottomSheetOverscrollEffect (NewPremiumBusActivationBottomSheetContent.android.kt:7)");
            }
            OverscrollEffect overscrollEffectRememberOverscrollEffect = OverscrollKt.rememberOverscrollEffect(composerStartRestartGroup, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            Modifier modifierM788paddingqDBjuR0$default = PaddingKt.m788paddingqDBjuR0$default(ScrollKt.verticalScroll$default(modifierFillMaxSize$default, scrollStateRememberScrollState, overscrollEffectRememberOverscrollEffect, false, null, false, 28, null), 0.0f, ChaloTheme.b(composerStartRestartGroup, 0).g, 0.0f, 0.0f, 13, null);
            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composerStartRestartGroup, 0);
            long currentCompositeKeyHashCode = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
            int i3 = (int) (currentCompositeKeyHashCode ^ (currentCompositeKeyHashCode >>> 32));
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierM788paddingqDBjuR0$default);
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
            Updater.m3923setimpl(composerM3915constructorimpl, modifierMaterializeModifier, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion, composerM3915constructorimpl, Integer.valueOf(i3), composerM3915constructorimpl));
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
            composerStartRestartGroup.startReplaceGroup(-2078714267);
            if (state.f7396a) {
                if (state.I.h) {
                    composerStartRestartGroup.startReplaceGroup(-2078553688);
                    Modifier modifierM786paddingVpY3zN4$default = PaddingKt.m786paddingVpY3zN4$default(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), ChaloTheme.b(composerStartRestartGroup, 0).h, 0.0f, 2, null);
                    boolean z = (i2 & 112) == 32;
                    Object objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (z || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue = new qm0(sendIntent, 3);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    PremiumBusTrackingStateKt.c(0, composerStartRestartGroup, modifierM786paddingVpY3zN4$default, (Function0) objRememberedValue);
                } else {
                    composerStartRestartGroup.startReplaceGroup(-2083921927);
                }
                composerStartRestartGroup.endReplaceGroup();
                NewPremiumReserveTicketDetailsScreenType newPremiumReserveTicketDetailsScreenType = state.l;
                int i4 = newPremiumReserveTicketDetailsScreenType == null ? -1 : WhenMappings.f7323a[newPremiumReserveTicketDetailsScreenType.ordinal()];
                if (i4 == -1) {
                    composerStartRestartGroup.startReplaceGroup(-2077685347);
                    gf.r(Modifier.INSTANCE, ChaloTheme.b(composerStartRestartGroup, 0).b, composerStartRestartGroup, 0);
                } else if (i4 == 1) {
                    composerStartRestartGroup.startReplaceGroup(-2078075420);
                    e((i2 << 3) & 1008, composerStartRestartGroup, null, state, sendIntent);
                    composerStartRestartGroup.endReplaceGroup();
                } else {
                    if (i4 != 2) {
                        throw pk0.p(composerStartRestartGroup, 1041340904);
                    }
                    composerStartRestartGroup.startReplaceGroup(-2077854173);
                    PostValidationScreenKt.c((i2 << 3) & 1008, composerStartRestartGroup, null, state, sendIntent);
                    composerStartRestartGroup.endReplaceGroup();
                }
                if (b3.t(composerStartRestartGroup)) {
                    ComposerKt.traceEventEnd();
                }
            } else {
                composerStartRestartGroup.endToMarker(currentMarker);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                } else {
                    an0Var = new an0(state, sendIntent, modifier, i, 0);
                }
            }
            scopeUpdateScopeEndRestartGroup.updateScope(an0Var);
        }
        composerStartRestartGroup.skipToGroupEnd();
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            an0Var = new an0(state, sendIntent, modifier, i, 1);
            scopeUpdateScopeEndRestartGroup.updateScope(an0Var);
        }
    }

    public static final void d(Modifier modifier, String eta, boolean z, TextStyle textStyle, Composer composer, int i) {
        int i2;
        long j;
        Intrinsics.i(eta, "eta");
        Composer composerStartRestartGroup = composer.startRestartGroup(-1869147360);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changed(modifier) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changed(eta) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= composerStartRestartGroup.changed(z) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= composerStartRestartGroup.changed(textStyle) ? 2048 : 1024;
        }
        int i3 = i2;
        if (composerStartRestartGroup.shouldExecute((i3 & 1171) != 1170, i3 & 1)) {
            composerStartRestartGroup.startDefaults();
            if ((i & 1) != 0 && !composerStartRestartGroup.getDefaultsInvalid()) {
                composerStartRestartGroup.skipToGroupEnd();
            }
            composerStartRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1869147360, i3, -1, "app.chalo.premiumbus.prebookedtickets.newactivation.PbActivationScreenEtaComponent (NewPremiumBusActivationBottomSheetContent.kt:516)");
            }
            MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), Alignment.INSTANCE.getCenterVertically(), composerStartRestartGroup, 48);
            long currentCompositeKeyHashCode = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
            int i4 = (int) (currentCompositeKeyHashCode ^ (currentCompositeKeyHashCode >>> 32));
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
            Updater.m3923setimpl(composerM3915constructorimpl, modifierMaterializeModifier, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion, composerM3915constructorimpl, Integer.valueOf(i4), composerM3915constructorimpl));
            RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
            LottieCompositionResultImpl lottieCompositionResultImplB = LottieResourceHelperKt.b(LottieType.REAL_TIME_INDICATOR_LOTTIE, composerStartRestartGroup, 6);
            Modifier.Companion companion2 = Modifier.INSTANCE;
            ImageKt.Image(LottieResourceHelperKt.c(lottieCompositionResultImplB, 0, false, composerStartRestartGroup, 0, 30), "", PaddingKt.m788paddingqDBjuR0$default(companion2, 0.0f, 0.0f, 0.0f, ChaloTheme.b(composerStartRestartGroup, 0).d, 7, null), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composerStartRestartGroup, Painter.$stable | 48, 120);
            SpacerKt.Spacer(SizeKt.m833width3ABfNKs(companion2, ChaloTheme.b(composerStartRestartGroup, 0).d), composerStartRestartGroup, 0);
            if (z) {
                composerStartRestartGroup.startReplaceGroup(1565341805);
                j = ChaloTheme.a(composerStartRestartGroup, 0).v0;
            } else {
                composerStartRestartGroup.startReplaceGroup(1565342824);
                j = ChaloTheme.a(composerStartRestartGroup, 0).N;
            }
            composerStartRestartGroup.endReplaceGroup();
            TextKt.m2623TextNvy7gAk(eta, companion2, j, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, textStyle, composerStartRestartGroup, ((i3 >> 3) & 14) | 48, (i3 << 12) & 29360128, 131064);
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
            scopeUpdateScopeEndRestartGroup.updateScope(new lh(modifier, (Object) eta, z, (Object) textStyle, i, 5));
        }
    }

    public static final void e(int i, Composer composer, Modifier modifier, NewPremiumBusReserveTicketActivationState state, Function1 sendIntent) {
        Modifier modifier2;
        Intrinsics.i(state, "state");
        List<PBStopImagesDetails> list = state.u;
        Intrinsics.i(sendIntent, "sendIntent");
        Composer composerStartRestartGroup = composer.startRestartGroup(451215709);
        int i2 = i | 6;
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(state) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(sendIntent) ? 256 : 128;
        }
        if (composerStartRestartGroup.shouldExecute((i2 & 147) != 146, i2 & 1)) {
            Modifier.Companion companion = Modifier.INSTANCE;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(451215709, i2, -1, "app.chalo.premiumbus.prebookedtickets.newactivation.PreValidationScreen (NewPremiumBusActivationBottomSheetContent.kt:140)");
            }
            Modifier modifierFillMaxSize$default = SizeKt.fillMaxSize$default(companion, 0.0f, 1, null);
            Alignment.Companion companion2 = Alignment.INSTANCE;
            Alignment.Horizontal centerHorizontally = companion2.getCenterHorizontally();
            Arrangement arrangement = Arrangement.INSTANCE;
            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(arrangement.getTop(), centerHorizontally, composerStartRestartGroup, 48);
            long currentCompositeKeyHashCode = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
            int i3 = (int) (currentCompositeKeyHashCode ^ (currentCompositeKeyHashCode >>> 32));
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierFillMaxSize$default);
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
            int i4 = i2;
            boolean z = state.C;
            String str = state.D;
            boolean z2 = state.A;
            Integer num = state.B;
            PremiumBusBookingTripTimeInfoState premiumBusBookingTripTimeInfoState = state.e;
            if (premiumBusBookingTripTimeInfoState == null) {
                premiumBusBookingTripTimeInfoState = PremiumBusBookingTripTimeInfoState.NotFetched.b;
            }
            g(z, str, premiumBusBookingTripTimeInfoState, state.g, NewPremiumReserveTicketDetailsScreenType.PRE_VALIDATION, AnimationModifierKt.animateContentSize$default(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), null, null, 3, null), state.y, state.z, z2, num, state.E, state.n, composerStartRestartGroup, 24576, 0);
            composerStartRestartGroup = composerStartRestartGroup;
            DividerKt.m1950HorizontalDivider9IZ8Weo(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), ChaloTheme.b(composerStartRestartGroup, 0).f, ChaloTheme.a(composerStartRestartGroup, 0).A, composerStartRestartGroup, 6, 0);
            boolean z3 = state.I.g;
            PremiumBusBookingVehicleInfoState notFetched = state.f;
            if (notFetched == null) {
                notFetched = new PremiumBusBookingVehicleInfoState.NotFetched(EmptyList.f17557a);
            }
            PremiumBusBookingVehicleInfoState premiumBusBookingVehicleInfoState = notFetched;
            Modifier modifierAnimateContentSize$default = AnimationModifierKt.animateContentSize$default(PaddingKt.m784padding3ABfNKs(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), ChaloTheme.b(composerStartRestartGroup, 0).h), null, null, 3, null);
            int i5 = i4 & 896;
            boolean z4 = i5 == 256;
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (z4 || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new nu(sendIntent, 25);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            k(modifierAnimateContentSize$default, premiumBusBookingVehicleInfoState, z3, (Function1) objRememberedValue, composerStartRestartGroup, 0);
            DividerKt.m1950HorizontalDivider9IZ8Weo(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), ChaloTheme.b(composerStartRestartGroup, 0).f, ChaloTheme.a(composerStartRestartGroup, 0).A, composerStartRestartGroup, 6, 0);
            f(i4 & AnalyticsListener.EVENT_DRM_SESSION_ACQUIRED, composerStartRestartGroup, companion, state, sendIntent);
            if (NewPremiumBusReserveTicketActivationContractKt.b(list)) {
                composerStartRestartGroup.startReplaceGroup(-717547782);
                Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null);
                MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(arrangement.getStart(), companion2.getTop(), composerStartRestartGroup, 0);
                long currentCompositeKeyHashCode2 = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
                int i6 = (int) (currentCompositeKeyHashCode2 ^ (currentCompositeKeyHashCode2 >>> 32));
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
                Updater.m3923setimpl(composerM3915constructorimpl2, modifierMaterializeModifier2, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion3, composerM3915constructorimpl2, Integer.valueOf(i6), composerM3915constructorimpl2));
                RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
                composerStartRestartGroup.startReplaceGroup(-432767593);
                for (PBStopImagesDetails pBStopImagesDetails : list) {
                    Modifier modifierM788paddingqDBjuR0$default = PaddingKt.m788paddingqDBjuR0$default(Modifier.INSTANCE, ChaloTheme.b(composerStartRestartGroup, 0).h, 0.0f, ChaloTheme.b(composerStartRestartGroup, 0).h, ChaloTheme.b(composerStartRestartGroup, 0).h, 2, null);
                    boolean z5 = i5 == 256;
                    Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                    if (z5 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue2 = new nu(sendIntent, 26);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                    }
                    PBStopImageKt.a(modifierM788paddingqDBjuR0$default, pBStopImagesDetails, (Function1) objRememberedValue2, composerStartRestartGroup, 0);
                }
                composerStartRestartGroup.endReplaceGroup();
                composerStartRestartGroup.endNode();
            } else {
                composerStartRestartGroup.startReplaceGroup(-726423857);
            }
            composerStartRestartGroup.endReplaceGroup();
            if (state.d == null || state.b == null || state.c == null) {
                composerStartRestartGroup.startReplaceGroup(-726423857);
            } else {
                composerStartRestartGroup.startReplaceGroup(-716545614);
                DividerKt.m1950HorizontalDivider9IZ8Weo(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), ChaloTheme.b(composerStartRestartGroup, 0).f, ChaloTheme.a(composerStartRestartGroup, 0).A, composerStartRestartGroup, 6, 0);
                String str2 = state.d;
                String str3 = state.b;
                String str4 = state.c;
                String str5 = state.i;
                Integer num2 = state.r;
                PremiumBusPostBookingStopSchedule premiumBusPostBookingStopSchedule = state.g;
                boolean z6 = i5 == 256;
                Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                if (z6 || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue3 = new qm0(sendIntent, 4);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                }
                l(str2, str3, str4, str5, num2, (Function0) objRememberedValue3, premiumBusPostBookingStopSchedule, composerStartRestartGroup, 0);
                composerStartRestartGroup = composerStartRestartGroup;
            }
            composerStartRestartGroup.endReplaceGroup();
            composerStartRestartGroup.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            modifier2 = companion;
        } else {
            composerStartRestartGroup.skipToGroupEnd();
            modifier2 = modifier;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new an0(modifier2, state, sendIntent, i, 3));
        }
    }

    public static final void f(int i, Composer composer, Modifier modifier, NewPremiumBusReserveTicketActivationState newPremiumBusReserveTicketActivationState, Function1 function1) {
        int i2;
        Composer composer2;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1303948292);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changed(modifier) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(newPremiumBusReserveTicketActivationState) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(function1) ? 256 : 128;
        }
        if (composerStartRestartGroup.shouldExecute((i2 & 147) != 146, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1303948292, i2, -1, "app.chalo.premiumbus.prebookedtickets.newactivation.PremiumBusActivationPickUpDetails (NewPremiumBusActivationBottomSheetContent.kt:248)");
            }
            Modifier modifierM784padding3ABfNKs = PaddingKt.m784padding3ABfNKs(SizeKt.fillMaxWidth$default(modifier, 0.0f, 1, null), ChaloTheme.b(composerStartRestartGroup, 0).h);
            Arrangement arrangement = Arrangement.INSTANCE;
            Arrangement.Vertical top = arrangement.getTop();
            Alignment.Companion companion = Alignment.INSTANCE;
            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(top, companion.getStart(), composerStartRestartGroup, 0);
            long currentCompositeKeyHashCode = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
            int i3 = (int) (currentCompositeKeyHashCode ^ (currentCompositeKeyHashCode >>> 32));
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierM784padding3ABfNKs);
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
            Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(companion3, 0.0f, 1, null);
            MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(arrangement.getSpaceBetween(), companion.getCenterVertically(), composerStartRestartGroup, 54);
            long currentCompositeKeyHashCode2 = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
            int i4 = (int) (currentCompositeKeyHashCode2 ^ (currentCompositeKeyHashCode2 >>> 32));
            CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierFillMaxWidth$default);
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
            pk0.v(companion2, composerM3915constructorimpl2, measurePolicyRowMeasurePolicy, composerM3915constructorimpl2, currentCompositionLocalMap2);
            Updater.m3923setimpl(composerM3915constructorimpl2, modifierMaterializeModifier2, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion2, composerM3915constructorimpl2, Integer.valueOf(i4), composerM3915constructorimpl2));
            RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
            String strC = StringResourcesHelperKt.c(StringEnum.PICK_UP_FROM, new Object[0], composerStartRestartGroup, 6);
            Modifier modifierA = i41.a(rowScopeInstance, companion3, 1.0f, false, 2, null);
            long j = ChaloTheme.a(composerStartRestartGroup, 0).i;
            TextStyle bodySmall = ChaloTheme.e(composerStartRestartGroup, 0).getBodySmall();
            TextOverflow.Companion companion4 = TextOverflow.INSTANCE;
            boolean z = true;
            int i5 = i2;
            TextKt.m2623TextNvy7gAk(strC, modifierA, j, null, 0L, null, null, null, 0L, null, null, 0L, companion4.m7226getEllipsisgIe3tQ8(), false, 1, 0, null, bodySmall, composerStartRestartGroup, 0, 24960, 110584);
            PremiumReserveTicketStopDirectionsInfoState premiumReserveTicketStopDirectionsInfoState = newPremiumBusReserveTicketActivationState.m;
            Intrinsics.i(premiumReserveTicketStopDirectionsInfoState, "<this>");
            if (premiumReserveTicketStopDirectionsInfoState instanceof PremiumReserveTicketStopDirectionsInfoState.StopLocationAvailable) {
                composerStartRestartGroup.startReplaceGroup(-136786662);
                SpacerKt.Spacer(SizeKt.m833width3ABfNKs(companion3, ChaloTheme.b(composerStartRestartGroup, 0).d), composerStartRestartGroup, 0);
                IconType iconType = IconType.IC_STOP_DIRECTIONS;
                String strC2 = StringResourcesHelperKt.c(StringEnum.DIRECTIONS, new Object[0], composerStartRestartGroup, 6);
                Modifier modifierM828size3ABfNKs = SizeKt.m828size3ABfNKs(companion3, ChaloTheme.b(composerStartRestartGroup, 0).h);
                long j2 = ChaloTheme.a(composerStartRestartGroup, 0).f1915a;
                TextStyle titleLarge = ChaloTheme.e(composerStartRestartGroup, 0).getTitleLarge();
                int iM7226getEllipsisgIe3tQ8 = companion4.m7226getEllipsisgIe3tQ8();
                if ((i5 & 896) != 256) {
                    z = false;
                }
                Object objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (z || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = new qm0(function1, 2);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                FromAndToStopCardKt.e(iconType, strC2, ClickableKt.m299clickableoSLSa3U$default(companion3, false, null, null, null, (Function0) objRememberedValue, 15, null), modifierM828size3ABfNKs, j2, iM7226getEllipsisgIe3tQ8, 1, titleLarge, composerStartRestartGroup, 1769478, 0);
            } else {
                composerStartRestartGroup.startReplaceGroup(-148403540);
            }
            composerStartRestartGroup.endReplaceGroup();
            composerStartRestartGroup.endNode();
            SpacerKt.Spacer(SizeKt.m814height3ABfNKs(companion3, ChaloTheme.b(composerStartRestartGroup, 0).d), composerStartRestartGroup, 0);
            String str = newPremiumBusReserveTicketActivationState.b;
            if (str == null) {
                str = "";
            }
            composer2 = composerStartRestartGroup;
            TextKt.m2623TextNvy7gAk(str, modifier, ChaloTheme.a(composerStartRestartGroup, 0).e, null, 0L, null, null, null, 0L, null, null, 0L, companion4.m7226getEllipsisgIe3tQ8(), false, 3, 0, null, ChaloTypographyKt.a(ChaloTheme.e(composerStartRestartGroup, 0).getHeadlineSmall()), composer2, (i5 << 3) & 112, 24960, 110584);
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
            scopeUpdateScopeEndRestartGroup.updateScope(new an0(modifier, newPremiumBusReserveTicketActivationState, function1, i, 2));
        }
    }

    /* JADX WARN: Code duplicated, block: B:180:0x05ed  */
    /* JADX WARN: Code duplicated, block: B:182:0x05f0  */
    /* JADX WARN: Code duplicated, block: B:183:0x05fd  */
    /* JADX WARN: Code duplicated, block: B:185:0x0605  */
    /* JADX WARN: Code duplicated, block: B:189:0x062c  */
    /* JADX WARN: Code duplicated, block: B:191:0x0634  */
    /* JADX WARN: Code duplicated, block: B:193:0x063b  */
    /* JADX WARN: Code duplicated, block: B:197:0x0651  */
    /* JADX WARN: Code duplicated, block: B:217:0x06b1  */
    /* JADX WARN: Code duplicated, block: B:220:0x06f2  */
    /* JADX WARN: Code duplicated, block: B:222:0x06ff  */
    /* JADX WARN: Code duplicated, block: B:228:0x0718  */
    /* JADX WARN: Code duplicated, block: B:237:0x070c A[SYNTHETIC] */
    public static final void g(final boolean z, final String str, final PremiumBusBookingTripTimeInfoState premiumBusBookingTripTimeInfoState, PremiumBusPostBookingStopSchedule stopScheduleTime, final NewPremiumReserveTicketDetailsScreenType screenType, final Modifier modifier, final String str2, final String str3, final boolean z2, final Integer num, final List tripCommunicationBanners, PremiumReserveTicketTrackingState premiumReserveTicketTrackingState, Composer composer, final int i, final int i2) throws Throwable {
        String str4;
        PremiumBusPostBookingStopSchedule premiumBusPostBookingStopSchedule;
        int i3;
        RowScopeInstance rowScopeInstance;
        Modifier.Companion companion;
        RowScopeInstance rowScopeInstance2;
        int i4;
        int i5;
        int i6;
        int i7;
        Throwable th;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        PremiumReserveTicketTrackingState trackingState = premiumReserveTicketTrackingState;
        Intrinsics.i(stopScheduleTime, "stopScheduleTime");
        Intrinsics.i(screenType, "screenType");
        Intrinsics.i(tripCommunicationBanners, "tripCommunicationBanners");
        Intrinsics.i(trackingState, "trackingState");
        Composer composerStartRestartGroup = composer.startRestartGroup(1136924926);
        int i13 = (i & 6) == 0 ? (composerStartRestartGroup.changed(z) ? 4 : 2) | i : i;
        if ((i & 48) == 0) {
            i13 |= composerStartRestartGroup.changed(str) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i13 |= composerStartRestartGroup.changed(premiumBusBookingTripTimeInfoState) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i13 |= composerStartRestartGroup.changed(stopScheduleTime) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i13 |= composerStartRestartGroup.changed(screenType.ordinal()) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i13 |= composerStartRestartGroup.changed(modifier) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            str4 = str2;
            i13 |= composerStartRestartGroup.changed(str4) ? 1048576 : 524288;
        } else {
            str4 = str2;
        }
        if ((i & 12582912) == 0) {
            i13 |= composerStartRestartGroup.changed(str3) ? 8388608 : 4194304;
        }
        if ((i & 100663296) == 0) {
            i13 |= composerStartRestartGroup.changed(z2) ? AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL : 33554432;
        }
        if ((i & 805306368) == 0) {
            i13 |= composerStartRestartGroup.changed(num) ? 536870912 : 268435456;
        }
        int i14 = (i2 & 6) == 0 ? i2 | (composerStartRestartGroup.changedInstance(tripCommunicationBanners) ? 4 : 2) : i2;
        if ((i2 & 48) == 0) {
            i14 |= composerStartRestartGroup.changed(trackingState) ? 32 : 16;
        }
        int i15 = i14;
        if (composerStartRestartGroup.shouldExecute(((i13 & 306783379) == 306783378 && (i15 & 19) == 18) ? false : true, i13 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1136924926, i13, i15, "app.chalo.premiumbus.prebookedtickets.newactivation.PremiumBusActivationScheduleAndStopInfoComponent (NewPremiumBusActivationBottomSheetContent.kt:314)");
            }
            int i16 = i13;
            Modifier modifierM784padding3ABfNKs = PaddingKt.m784padding3ABfNKs(SizeKt.fillMaxWidth$default(modifier, 0.0f, 1, null), ChaloTheme.b(composerStartRestartGroup, 0).h);
            Arrangement arrangement = Arrangement.INSTANCE;
            Arrangement.Vertical top = arrangement.getTop();
            Alignment.Companion companion2 = Alignment.INSTANCE;
            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(top, companion2.getStart(), composerStartRestartGroup, 0);
            long currentCompositeKeyHashCode = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
            int i17 = (int) (currentCompositeKeyHashCode ^ (currentCompositeKeyHashCode >>> 32));
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierM784padding3ABfNKs);
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
            Updater.m3923setimpl(composerM3915constructorimpl, modifierMaterializeModifier, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion3, composerM3915constructorimpl, Integer.valueOf(i17), composerM3915constructorimpl));
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
            if (premiumBusBookingTripTimeInfoState.equals(PremiumBusBookingTripTimeInfoState.BusPassedPickupStop.b)) {
                composerStartRestartGroup.startReplaceGroup(-114332124);
                a(null, screenType, composerStartRestartGroup, (i16 >> 9) & 112);
                composerStartRestartGroup.endReplaceGroup();
            } else {
                if (premiumBusBookingTripTimeInfoState instanceof PremiumBusBookingTripTimeInfoState.ExpectedTime) {
                    composerStartRestartGroup.startReplaceGroup(-114125199);
                    Modifier.Companion companion4 = Modifier.INSTANCE;
                    Modifier modifierFillMaxSize$default = SizeKt.fillMaxSize$default(companion4, 0.0f, 1, null);
                    MeasurePolicy measurePolicyColumnMeasurePolicy2 = ColumnKt.columnMeasurePolicy(arrangement.getTop(), companion2.getStart(), composerStartRestartGroup, 0);
                    long currentCompositeKeyHashCode2 = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
                    int i18 = (int) (currentCompositeKeyHashCode2 ^ (currentCompositeKeyHashCode2 >>> 32));
                    CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierFillMaxSize$default);
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
                    pk0.v(companion3, composerM3915constructorimpl2, measurePolicyColumnMeasurePolicy2, composerM3915constructorimpl2, currentCompositionLocalMap2);
                    Updater.m3923setimpl(composerM3915constructorimpl2, modifierMaterializeModifier2, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion3, composerM3915constructorimpl2, Integer.valueOf(i18), composerM3915constructorimpl2));
                    TextKt.m2623TextNvy7gAk(StringResourcesHelperKt.c(StringEnum.PICK_UP_SCHEDULED_AT, new Object[0], composerStartRestartGroup, 6), companion4, ChaloTheme.a(composerStartRestartGroup, 0).i, null, 0L, null, null, null, 0L, null, null, 0L, TextOverflow.INSTANCE.m7226getEllipsisgIe3tQ8(), false, 1, 0, null, ChaloTypographyKt.d(ChaloTheme.e(composerStartRestartGroup, 0)), composerStartRestartGroup, 48, 24960, 110584);
                    SpacerKt.Spacer(SizeKt.m814height3ABfNKs(companion4, ChaloTheme.b(composerStartRestartGroup, 0).d), composerStartRestartGroup, 0);
                    TextKt.m2623TextNvy7gAk(((PremiumBusBookingTripTimeInfoState.ExpectedTime) premiumBusBookingTripTimeInfoState).b, companion4, ChaloTheme.a(composerStartRestartGroup, 0).e, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ChaloTypographyKt.f(ChaloTheme.e(composerStartRestartGroup, 0)), composerStartRestartGroup, 48, 0, 131064);
                    composerStartRestartGroup.endNode();
                    composerStartRestartGroup.endReplaceGroup();
                } else if (premiumBusBookingTripTimeInfoState.equals(PremiumBusBookingTripTimeInfoState.LiveEtaNotAvailable.b) || premiumBusBookingTripTimeInfoState.equals(PremiumBusBookingTripTimeInfoState.NotFetched.b)) {
                    i3 = i15;
                    composerStartRestartGroup.startReplaceGroup(-113184194);
                    premiumBusPostBookingStopSchedule = stopScheduleTime;
                    h(premiumBusPostBookingStopSchedule, composerStartRestartGroup, (i16 >> 9) & 14);
                    composerStartRestartGroup.endReplaceGroup();
                } else {
                    if (!(premiumBusBookingTripTimeInfoState instanceof PremiumBusBookingTripTimeInfoState.LiveEta)) {
                        throw pk0.p(composerStartRestartGroup, -973517788);
                    }
                    composerStartRestartGroup.startReplaceGroup(-112930459);
                    Modifier.Companion companion5 = Modifier.INSTANCE;
                    Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(companion5, 0.0f, 1, null);
                    MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(arrangement.getStart(), companion2.getTop(), composerStartRestartGroup, 48);
                    long currentCompositeKeyHashCode3 = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
                    int i19 = (int) (currentCompositeKeyHashCode3 ^ (currentCompositeKeyHashCode3 >>> 32));
                    CompositionLocalMap currentCompositionLocalMap3 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier3 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierFillMaxWidth$default);
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
                    pk0.v(companion3, composerM3915constructorimpl3, measurePolicyRowMeasurePolicy, composerM3915constructorimpl3, currentCompositionLocalMap3);
                    Updater.m3923setimpl(composerM3915constructorimpl3, modifierMaterializeModifier3, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion3, composerM3915constructorimpl3, Integer.valueOf(i19), composerM3915constructorimpl3));
                    RowScopeInstance rowScopeInstance3 = RowScopeInstance.INSTANCE;
                    if (!z2 || num == null || num.intValue() <= 0) {
                        composerStartRestartGroup.startReplaceGroup(1467251191);
                        rowScopeInstance = rowScopeInstance3;
                        companion = companion5;
                        int i20 = i16 >> 12;
                        j(premiumBusBookingTripTimeInfoState, screenType, str4, str3, z, i41.a(rowScopeInstance, companion5, 1.0f, false, 2, null), composerStartRestartGroup, ((i16 >> 6) & 14) | ((i16 >> 9) & 112) | (i20 & 896) | (i20 & 7168) | (57344 & (i16 << 12)));
                        composerStartRestartGroup.endReplaceGroup();
                    } else {
                        composerStartRestartGroup.startReplaceGroup(1465733896);
                        Modifier modifierA = i41.a(rowScopeInstance3, companion5, 1.0f, false, 2, null);
                        MeasurePolicy measurePolicyColumnMeasurePolicy3 = ColumnKt.columnMeasurePolicy(arrangement.getTop(), companion2.getStart(), composerStartRestartGroup, 0);
                        long currentCompositeKeyHashCode4 = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
                        int i21 = (int) (currentCompositeKeyHashCode4 ^ (currentCompositeKeyHashCode4 >>> 32));
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
                        Updater.m3923setimpl(composerM3915constructorimpl4, modifierMaterializeModifier4, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion3, composerM3915constructorimpl4, Integer.valueOf(i21), composerM3915constructorimpl4));
                        Modifier modifierFillMaxWidth$default2 = SizeKt.fillMaxWidth$default(companion5, 0.0f, 1, null);
                        MeasurePolicy measurePolicyRowMeasurePolicy2 = RowKt.rowMeasurePolicy(arrangement.getStart(), companion2.getCenterVertically(), composerStartRestartGroup, 48);
                        long currentCompositeKeyHashCode5 = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
                        int i22 = (int) (currentCompositeKeyHashCode5 ^ (currentCompositeKeyHashCode5 >>> 32));
                        CompositionLocalMap currentCompositionLocalMap5 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                        Modifier modifierMaterializeModifier5 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierFillMaxWidth$default2);
                        Function0<ComposeUiNode> constructor5 = companion3.getConstructor();
                        if (composerStartRestartGroup.getApplier() == null) {
                            ComposablesKt.invalidApplier();
                        }
                        composerStartRestartGroup.startReusableNode();
                        if (composerStartRestartGroup.getInserting()) {
                            composerStartRestartGroup.createNode(constructor5);
                        } else {
                            composerStartRestartGroup.useNode();
                        }
                        Composer composerM3915constructorimpl5 = Updater.m3915constructorimpl(composerStartRestartGroup);
                        pk0.v(companion3, composerM3915constructorimpl5, measurePolicyRowMeasurePolicy2, composerM3915constructorimpl5, currentCompositionLocalMap5);
                        Updater.m3923setimpl(composerM3915constructorimpl5, modifierMaterializeModifier5, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion3, composerM3915constructorimpl5, Integer.valueOf(i22), composerM3915constructorimpl5));
                        TextKt.m2623TextNvy7gAk(StringResourcesHelperKt.c(StringEnum.GET_READY_TO_BOARD, new Object[0], composerStartRestartGroup, 6), null, ChaloTheme.a(composerStartRestartGroup, 0).e, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ChaloTypographyKt.f(ChaloTheme.e(composerStartRestartGroup, 0)), composerStartRestartGroup, 0, 0, 131066);
                        if (z) {
                            rowScopeInstance2 = rowScopeInstance3;
                            i4 = 0;
                            composerStartRestartGroup.startReplaceGroup(-2120459086);
                        } else {
                            composerStartRestartGroup.startReplaceGroup(-2104678970);
                            rowScopeInstance2 = rowScopeInstance3;
                            i4 = 0;
                            SpacerKt.Spacer(i41.a(rowScopeInstance3, companion5, 1.0f, false, 2, null), composerStartRestartGroup, 0);
                            PremiumBusTripScheduleTag premiumBusTripScheduleTag = ((PremiumBusBookingTripTimeInfoState.LiveEta) premiumBusBookingTripTimeInfoState).d;
                            if (premiumBusTripScheduleTag == null) {
                                composerStartRestartGroup.startReplaceGroup(-2104542602);
                                composerStartRestartGroup.endReplaceGroup();
                            } else {
                                composerStartRestartGroup.startReplaceGroup(-2104542601);
                                PremiumBusTripScheduleTagTextKt.a(premiumBusTripScheduleTag, null, composerStartRestartGroup, 0);
                                composerStartRestartGroup.endReplaceGroup();
                            }
                        }
                        composerStartRestartGroup.endReplaceGroup();
                        composerStartRestartGroup.endNode();
                        SpacerKt.Spacer(SizeKt.m814height3ABfNKs(companion5, ChaloTheme.b(composerStartRestartGroup, i4).d), composerStartRestartGroup, i4);
                        StringEnum stringEnum = StringEnum.BUS_IS_X_M_AWAY;
                        Object[] objArr = new Object[1];
                        objArr[i4] = num;
                        TextKt.m2623TextNvy7gAk(StringResourcesHelperKt.c(stringEnum, objArr, composerStartRestartGroup, 6), null, ChaloTheme.a(composerStartRestartGroup, i4).t0, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ChaloTypographyKt.d(ChaloTheme.e(composerStartRestartGroup, i4)), composerStartRestartGroup, 0, 0, 131066);
                        composerStartRestartGroup.endNode();
                        composerStartRestartGroup.endReplaceGroup();
                        companion = companion5;
                        rowScopeInstance = rowScopeInstance2;
                    }
                    if (!z || str == null) {
                        i3 = i15;
                        composerStartRestartGroup.startReplaceGroup(1450562589);
                    } else {
                        composerStartRestartGroup.startReplaceGroup(1467827140);
                        ChaloSpacersKt.w(composerStartRestartGroup, 0);
                        i3 = i15;
                        TextKt.m2623TextNvy7gAk(str, PaddingKt.m785paddingVpY3zN4(i41.a(rowScopeInstance, BackgroundKt.m263backgroundbw27NRU(companion, ChaloTheme.a(composerStartRestartGroup, 0).r0, ChaloTheme.d(composerStartRestartGroup, 0).b), 0.35f, false, 2, null), ChaloTheme.b(composerStartRestartGroup, 0).f, ChaloTheme.b(composerStartRestartGroup, 0).c), ChaloTheme.a(composerStartRestartGroup, 0).t0, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ChaloTypographyKt.d(ChaloTheme.e(composerStartRestartGroup, 0)), composerStartRestartGroup, (i16 >> 3) & 14, 0, 131064);
                        composerStartRestartGroup = composerStartRestartGroup;
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    composerStartRestartGroup.endNode();
                    composerStartRestartGroup.endReplaceGroup();
                    premiumBusPostBookingStopSchedule = stopScheduleTime;
                }
                i5 = WhenMappings.f7323a[screenType.ordinal()];
                i6 = 1;
                if (i5 != 1) {
                    i7 = 2;
                    if (i5 == 2) {
                        throw pk0.p(composerStartRestartGroup, -973370513);
                    }
                    composerStartRestartGroup.startReplaceGroup(-109473928);
                    composerStartRestartGroup.endReplaceGroup();
                    trackingState = premiumReserveTicketTrackingState;
                    th = null;
                } else {
                    i7 = 2;
                    composerStartRestartGroup.startReplaceGroup(-109630044);
                    trackingState = premiumReserveTicketTrackingState;
                    th = null;
                    PremiumBusTrackingStateKt.b(null, trackingState, composerStartRestartGroup, i3 & 112);
                    composerStartRestartGroup.endReplaceGroup();
                }
                composerStartRestartGroup.startReplaceGroup(-973359731);
                i8 = 0;
                for (Object obj : tripCommunicationBanners) {
                    i9 = i8 + 1;
                    if (i8 >= 0) {
                        Throwable th2 = th;
                        CollectionsKt.z0();
                        throw th2;
                    }
                    TripCommunicationAppModel tripCommunicationAppModel = (TripCommunicationAppModel) obj;
                    if (i8 == 0) {
                        composerStartRestartGroup.startReplaceGroup(1776179290);
                        if (!trackingState.equals(PremiumReserveTicketTrackingState.EtaFetchStarted.f7476a) || trackingState.equals(PremiumReserveTicketTrackingState.Unknown.f7480a)) {
                            i10 = 0;
                            composerStartRestartGroup.startReplaceGroup(1776310110);
                            ChaloSpacersKt.p(composerStartRestartGroup, 0);
                            composerStartRestartGroup.endReplaceGroup();
                        } else {
                            if (!(trackingState instanceof PremiumReserveTicketTrackingState.GpsTrackingNotAvailable) && !(trackingState instanceof PremiumReserveTicketTrackingState.GpsTrackingStarted) && !(trackingState instanceof PremiumReserveTicketTrackingState.TrackingNotStarted)) {
                                throw pk0.p(composerStartRestartGroup, 2135506088);
                            }
                            composerStartRestartGroup.startReplaceGroup(1776657589);
                            int i23 = WhenMappings.f7323a[screenType.ordinal()];
                            if (i23 == i6) {
                                i10 = 0;
                                composerStartRestartGroup.startReplaceGroup(1776754030);
                                ChaloSpacersKt.m(composerStartRestartGroup, 0);
                                composerStartRestartGroup.endReplaceGroup();
                            } else {
                                if (i23 != i7) {
                                    throw pk0.p(composerStartRestartGroup, 2135521517);
                                }
                                composerStartRestartGroup.startReplaceGroup(1776932590);
                                i10 = 0;
                                ChaloSpacersKt.p(composerStartRestartGroup, 0);
                                composerStartRestartGroup.endReplaceGroup();
                            }
                            composerStartRestartGroup.endReplaceGroup();
                        }
                    } else {
                        i10 = 0;
                        composerStartRestartGroup.startReplaceGroup(1757585800);
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    i11 = i10;
                    Composer composer2 = composerStartRestartGroup;
                    i12 = i8;
                    int i24 = i6;
                    Throwable th3 = th;
                    PremiumBusTrackingStateKt.a(null, PremiumBusTripInfoContractKt.b(tripCommunicationAppModel.b), tripCommunicationAppModel.f7126a, ChaloTheme.a(composerStartRestartGroup, i10).t0, ChaloTheme.a(composerStartRestartGroup, i10).t0, composer2, 0, 1);
                    composerStartRestartGroup = composer2;
                    if (i12 != tripCommunicationBanners.size() - 1) {
                        composerStartRestartGroup.startReplaceGroup(1777483150);
                        ChaloSpacersKt.m(composerStartRestartGroup, i11);
                    } else {
                        composerStartRestartGroup.startReplaceGroup(1757585800);
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    i8 = i9;
                    i6 = i24;
                    th = th3;
                    i7 = 2;
                }
                if (b3.t(composerStartRestartGroup)) {
                    ComposerKt.traceEventEnd();
                }
            }
            premiumBusPostBookingStopSchedule = stopScheduleTime;
            i3 = i15;
            i5 = WhenMappings.f7323a[screenType.ordinal()];
            i6 = 1;
            if (i5 != 1) {
                i7 = 2;
                if (i5 == 2) {
                    throw pk0.p(composerStartRestartGroup, -973370513);
                }
                composerStartRestartGroup.startReplaceGroup(-109473928);
                composerStartRestartGroup.endReplaceGroup();
                trackingState = premiumReserveTicketTrackingState;
                th = null;
            } else {
                i7 = 2;
                composerStartRestartGroup.startReplaceGroup(-109630044);
                trackingState = premiumReserveTicketTrackingState;
                th = null;
                PremiumBusTrackingStateKt.b(null, trackingState, composerStartRestartGroup, i3 & 112);
                composerStartRestartGroup.endReplaceGroup();
            }
            composerStartRestartGroup.startReplaceGroup(-973359731);
            i8 = 0;
            while (r0.hasNext()) {
                i9 = i8 + 1;
                if (i8 >= 0) {
                    Throwable th4 = th;
                    CollectionsKt.z0();
                    throw th4;
                }
                TripCommunicationAppModel tripCommunicationAppModel2 = (TripCommunicationAppModel) obj;
                if (i8 == 0) {
                    composerStartRestartGroup.startReplaceGroup(1776179290);
                    if (trackingState.equals(PremiumReserveTicketTrackingState.EtaFetchStarted.f7476a)) {
                        i10 = 0;
                        composerStartRestartGroup.startReplaceGroup(1776310110);
                        ChaloSpacersKt.p(composerStartRestartGroup, 0);
                        composerStartRestartGroup.endReplaceGroup();
                    } else {
                        i10 = 0;
                        composerStartRestartGroup.startReplaceGroup(1776310110);
                        ChaloSpacersKt.p(composerStartRestartGroup, 0);
                        composerStartRestartGroup.endReplaceGroup();
                    }
                } else {
                    i10 = 0;
                    composerStartRestartGroup.startReplaceGroup(1757585800);
                }
                composerStartRestartGroup.endReplaceGroup();
                i11 = i10;
                Composer composer3 = composerStartRestartGroup;
                i12 = i8;
                int i25 = i6;
                Throwable th5 = th;
                PremiumBusTrackingStateKt.a(null, PremiumBusTripInfoContractKt.b(tripCommunicationAppModel2.b), tripCommunicationAppModel2.f7126a, ChaloTheme.a(composerStartRestartGroup, i10).t0, ChaloTheme.a(composerStartRestartGroup, i10).t0, composer3, 0, 1);
                composerStartRestartGroup = composer3;
                if (i12 != tripCommunicationBanners.size() - 1) {
                    composerStartRestartGroup.startReplaceGroup(1777483150);
                    ChaloSpacersKt.m(composerStartRestartGroup, i11);
                } else {
                    composerStartRestartGroup.startReplaceGroup(1757585800);
                }
                composerStartRestartGroup.endReplaceGroup();
                i8 = i9;
                i6 = i25;
                th = th5;
                i7 = 2;
            }
            if (b3.t(composerStartRestartGroup)) {
                ComposerKt.traceEventEnd();
            }
        } else {
            premiumBusPostBookingStopSchedule = stopScheduleTime;
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            final PremiumBusPostBookingStopSchedule premiumBusPostBookingStopSchedule2 = premiumBusPostBookingStopSchedule;
            final PremiumReserveTicketTrackingState premiumReserveTicketTrackingState2 = trackingState;
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: bn0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj2, Object obj3) throws Throwable {
                    ((Integer) obj3).getClass();
                    int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(i | 1);
                    int iUpdateChangedFlags2 = RecomposeScopeImplKt.updateChangedFlags(i2);
                    NewPremiumBusActivationBottomSheetContentKt.g(z, str, premiumBusBookingTripTimeInfoState, premiumBusPostBookingStopSchedule2, screenType, modifier, str2, str3, z2, num, tripCommunicationBanners, premiumReserveTicketTrackingState2, (Composer) obj2, iUpdateChangedFlags, iUpdateChangedFlags2);
                    return Unit.f17538a;
                }
            });
        }
    }

    public static final void h(PremiumBusPostBookingStopSchedule premiumBusPostBookingStopSchedule, Composer composer, int i) {
        int i2;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1873415744);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changed(premiumBusPostBookingStopSchedule) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (composerStartRestartGroup.shouldExecute((i2 & 3) != 2, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1873415744, i2, -1, "app.chalo.premiumbus.prebookedtickets.newactivation.PremiumBusActivationScheduleTimeComposable (NewPremiumBusActivationBottomSheetContent.kt:469)");
            }
            Modifier.Companion companion = Modifier.INSTANCE;
            Modifier modifierFillMaxSize$default = SizeKt.fillMaxSize$default(companion, 0.0f, 1, null);
            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composerStartRestartGroup, 0);
            long currentCompositeKeyHashCode = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
            int i3 = (int) (currentCompositeKeyHashCode ^ (currentCompositeKeyHashCode >>> 32));
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierFillMaxSize$default);
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
            if (Intrinsics.d(premiumBusPostBookingStopSchedule, PremiumBusPostBookingStopSchedule.NotApplicable.f7427a)) {
                composerStartRestartGroup.startReplaceGroup(-1300680666);
                PremiumBusBookingCardKt.a(SizeKt.fillMaxWidth(companion, 0.4f), ChaloTheme.b(composerStartRestartGroup, 0).i, composerStartRestartGroup, 6, 0);
                SpacerKt.Spacer(SizeKt.m814height3ABfNKs(companion, ChaloTheme.b(composerStartRestartGroup, 0).d), composerStartRestartGroup, 0);
                PremiumBusBookingCardKt.a(SizeKt.fillMaxWidth(companion, 0.3f), 0.0f, composerStartRestartGroup, 6, 2);
                composerStartRestartGroup.endReplaceGroup();
            } else if (premiumBusPostBookingStopSchedule instanceof PremiumBusPostBookingStopSchedule.ScheduleAvailable) {
                composerStartRestartGroup.startReplaceGroup(-1300150535);
                TextKt.m2623TextNvy7gAk(StringResourcesHelperKt.c(StringEnum.PICK_UP_SCHEDULED_AT, new Object[0], composerStartRestartGroup, 6), companion, ChaloTheme.a(composerStartRestartGroup, 0).i, null, 0L, null, null, null, 0L, null, null, 0L, TextOverflow.INSTANCE.m7226getEllipsisgIe3tQ8(), false, 1, 0, null, ChaloTheme.e(composerStartRestartGroup, 0).getBodySmall(), composerStartRestartGroup, 48, 24960, 110584);
                SpacerKt.Spacer(SizeKt.m814height3ABfNKs(companion, ChaloTheme.b(composerStartRestartGroup, 0).d), composerStartRestartGroup, 0);
                TextKt.m2623TextNvy7gAk(((PremiumBusPostBookingStopSchedule.ScheduleAvailable) premiumBusPostBookingStopSchedule).f7428a, companion, ChaloTheme.a(composerStartRestartGroup, 0).e, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ChaloTheme.e(composerStartRestartGroup, 0).getDisplaySmall(), composerStartRestartGroup, 48, 0, 131064);
                composerStartRestartGroup = composerStartRestartGroup;
                composerStartRestartGroup.endReplaceGroup();
            } else {
                if (!Intrinsics.d(premiumBusPostBookingStopSchedule, PremiumBusPostBookingStopSchedule.Unknown.f7429a)) {
                    throw pk0.p(composerStartRestartGroup, 927871991);
                }
                composerStartRestartGroup.startReplaceGroup(-1299397142);
                composerStartRestartGroup.endReplaceGroup();
            }
            composerStartRestartGroup.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new fk0(premiumBusPostBookingStopSchedule, i, 4));
        }
    }

    public static final void i(int i, Composer composer, Modifier modifier, PremiumBusBookingVehicleInfoState premiumBusBookingVehicleInfoState) {
        Composer composer2;
        Modifier modifier2;
        Composer composerStartRestartGroup = composer.startRestartGroup(-667958399);
        int i2 = i | 6;
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(premiumBusBookingVehicleInfoState) ? 32 : 16;
        }
        if (composerStartRestartGroup.shouldExecute((i2 & 19) != 18, i2 & 1)) {
            Modifier.Companion companion = Modifier.INSTANCE;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-667958399, i2, -1, "app.chalo.premiumbus.prebookedtickets.newactivation.PremiumBusActivationScreenVehicleInfoComponent (NewPremiumBusActivationBottomSheetContent.kt:809)");
            }
            if (premiumBusBookingVehicleInfoState instanceof PremiumBusBookingVehicleInfoState.NotFetched) {
                composerStartRestartGroup.startReplaceGroup(-564951568);
                PremiumBusBookingCardKt.a(SizeKt.fillMaxWidth(PaddingKt.m788paddingqDBjuR0$default(companion, 0.0f, ChaloTheme.b(composerStartRestartGroup, 0).d, 0.0f, 0.0f, 13, null), 0.8f), 0.0f, composerStartRestartGroup, 0, 2);
                composerStartRestartGroup.endReplaceGroup();
                composer2 = composerStartRestartGroup;
                modifier2 = companion;
            } else if (premiumBusBookingVehicleInfoState instanceof PremiumBusBookingVehicleInfoState.VehicleNotAssigned) {
                composerStartRestartGroup.startReplaceGroup(-564659796);
                int i3 = (i2 << 3) & 112;
                modifier2 = companion;
                TextKt.m2623TextNvy7gAk(StringResourcesHelperKt.c(StringEnum.BUS_NOT_ASSIGNED_YET, new Object[0], composerStartRestartGroup, 6), modifier2, ChaloTheme.a(composerStartRestartGroup, 0).v0, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 3, 0, null, ChaloTypographyKt.d(ChaloTheme.e(composerStartRestartGroup, 0)), composerStartRestartGroup, i3, 24576, 114680);
                composer2 = composerStartRestartGroup;
                composer2.endReplaceGroup();
            } else {
                composer2 = composerStartRestartGroup;
                if (!(premiumBusBookingVehicleInfoState instanceof PremiumBusBookingVehicleInfoState.VehicleAssigned)) {
                    throw pk0.p(composer2, -1957888592);
                }
                composer2.startReplaceGroup(-564294523);
                int i4 = (i2 << 3) & 112;
                modifier2 = companion;
                TextKt.m2623TextNvy7gAk(StringsKt.k0(4, ((PremiumBusBookingVehicleInfoState.VehicleAssigned) premiumBusBookingVehicleInfoState).b), modifier2, ChaloTheme.a(composer2, 0).g, null, 0L, null, null, null, 0L, null, null, 0L, TextOverflow.INSTANCE.m7226getEllipsisgIe3tQ8(), false, 2, 0, null, ChaloTypographyKt.a(ChaloTheme.e(composer2, 0).getHeadlineSmall()), composer2, i4, 24960, 110584);
                composer2.endReplaceGroup();
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer2 = composerStartRestartGroup;
            composer2.skipToGroupEnd();
            modifier2 = modifier;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new kg(modifier2, premiumBusBookingVehicleInfoState, i));
        }
    }

    public static final void j(PremiumBusBookingTripTimeInfoState premiumBusBookingTripTimeInfoState, NewPremiumReserveTicketDetailsScreenType newPremiumReserveTicketDetailsScreenType, String str, String str2, boolean z, Modifier modifier, Composer composer, int i) {
        PremiumBusBookingTripTimeInfoState premiumBusBookingTripTimeInfoState2;
        int i2;
        Composer composerStartRestartGroup = composer.startRestartGroup(-592940268);
        if ((i & 6) == 0) {
            premiumBusBookingTripTimeInfoState2 = premiumBusBookingTripTimeInfoState;
            i2 = (composerStartRestartGroup.changed(premiumBusBookingTripTimeInfoState2) ? 4 : 2) | i;
        } else {
            premiumBusBookingTripTimeInfoState2 = premiumBusBookingTripTimeInfoState;
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changed(newPremiumReserveTicketDetailsScreenType.ordinal()) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= composerStartRestartGroup.changed(str) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= composerStartRestartGroup.changed(str2) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= composerStartRestartGroup.changed(z) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= composerStartRestartGroup.changed(modifier) ? 131072 : 65536;
        }
        if (composerStartRestartGroup.shouldExecute((74899 & i2) != 74898, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-592940268, i2, -1, "app.chalo.premiumbus.prebookedtickets.newactivation.PremiumBusActivationTripLiveEtaInfo (NewPremiumBusActivationBottomSheetContent.kt:549)");
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
            Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(companion3, 0.0f, 1, null);
            MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(arrangement.getStart(), companion.getTop(), composerStartRestartGroup, 0);
            long currentCompositeKeyHashCode2 = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
            int i4 = (int) (currentCompositeKeyHashCode2 ^ (currentCompositeKeyHashCode2 >>> 32));
            CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierFillMaxWidth$default);
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
            pk0.v(companion2, composerM3915constructorimpl2, measurePolicyRowMeasurePolicy, composerM3915constructorimpl2, currentCompositionLocalMap2);
            Updater.m3923setimpl(composerM3915constructorimpl2, modifierMaterializeModifier2, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion2, composerM3915constructorimpl2, Integer.valueOf(i4), composerM3915constructorimpl2));
            RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
            m(premiumBusBookingTripTimeInfoState2, z, newPremiumReserveTicketDetailsScreenType, null, composerStartRestartGroup, (i2 & 14) | ((i2 >> 9) & 112) | ((i2 << 3) & 896));
            SpacerKt.Spacer(i41.a(rowScopeInstance, companion3, 1.0f, false, 2, null), composerStartRestartGroup, 0);
            if (z) {
                composerStartRestartGroup.startReplaceGroup(-1018330892);
            } else {
                composerStartRestartGroup.startReplaceGroup(1769013633);
                PremiumBusTripScheduleTag f7414a = premiumBusBookingTripTimeInfoState.getF7414a();
                if (f7414a == null) {
                    composerStartRestartGroup.startReplaceGroup(-995152224);
                } else {
                    composerStartRestartGroup.startReplaceGroup(-995152223);
                    PremiumBusTripScheduleTagTextKt.a(f7414a, null, composerStartRestartGroup, 0);
                }
                composerStartRestartGroup.endReplaceGroup();
            }
            composerStartRestartGroup.endReplaceGroup();
            composerStartRestartGroup.endNode();
            if (AnyExtsKt.a(str) && AnyExtsKt.a(str2)) {
                composerStartRestartGroup.startReplaceGroup(1898604070);
                ChaloSpacersKt.t(composerStartRestartGroup, 0);
                composerStartRestartGroup.startReplaceGroup(-492941734);
                AnnotatedString.Builder builder = new AnnotatedString.Builder(0, 1, null);
                composerStartRestartGroup.startReplaceGroup(-492940875);
                SpanStyle spanStyle = ChaloTheme.e(composerStartRestartGroup, 0).getTitleLarge().toSpanStyle();
                long j = ChaloTheme.a(composerStartRestartGroup, 0).e;
                FontWeight.Companion companion4 = FontWeight.INSTANCE;
                int iPushStyle = builder.pushStyle(SpanStyle.m6672copyGSF8kmg$default(spanStyle, j, 0L, companion4.getNormal(), null, null, null, null, 0L, null, null, null, 0L, null, null, null, null, 65530, null));
                try {
                    builder.append(StringResourcesHelperKt.c(StringEnum.LAST_CROSSED_STOP_IS, new Object[0], composerStartRestartGroup, 6));
                    builder.pop(iPushStyle);
                    composerStartRestartGroup.endReplaceGroup();
                    int iPushStyle2 = builder.pushStyle(SpanStyle.m6672copyGSF8kmg$default(ChaloTheme.e(composerStartRestartGroup, 0).getTitleLarge().toSpanStyle(), ChaloTheme.a(composerStartRestartGroup, 0).e, 0L, companion4.getSemiBold(), null, null, null, null, 0L, null, null, null, 0L, null, null, null, null, 65530, null));
                    try {
                        builder.append(" " + str + " at " + str2);
                        builder.pop(iPushStyle2);
                        AnnotatedString annotatedString = builder.toAnnotatedString();
                        composerStartRestartGroup.endReplaceGroup();
                        TextKt.m2624TextZ58ophY(annotatedString, null, 0L, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, null, composerStartRestartGroup, 0, 0, 524286);
                        composerStartRestartGroup = composerStartRestartGroup;
                    } catch (Throwable th) {
                        builder.pop(iPushStyle2);
                        throw th;
                    }
                } catch (Throwable th2) {
                    builder.pop(iPushStyle);
                    throw th2;
                }
            } else {
                composerStartRestartGroup.startReplaceGroup(1875201240);
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
            scopeUpdateScopeEndRestartGroup.updateScope(new wc(premiumBusBookingTripTimeInfoState, newPremiumReserveTicketDetailsScreenType, str, str2, z, modifier, i));
        }
    }

    public static final void k(Modifier modifier, PremiumBusBookingVehicleInfoState premiumBusBookingVehicleInfoState, boolean z, Function1 openPassengerListDialog, Composer composer, int i) {
        int i2;
        boolean z2;
        Modifier.Companion companion;
        Modifier.Companion companion2;
        Intrinsics.i(openPassengerListDialog, "openPassengerListDialog");
        Composer composerStartRestartGroup = composer.startRestartGroup(-1762466516);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changed(modifier) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(premiumBusBookingVehicleInfoState) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= composerStartRestartGroup.changed(z) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(openPassengerListDialog) ? 2048 : 1024;
        }
        if (composerStartRestartGroup.shouldExecute((i2 & 1171) != 1170, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1762466516, i2, -1, "app.chalo.premiumbus.prebookedtickets.newactivation.PremiumBusActivationVehicleInfoComponent (NewPremiumBusActivationBottomSheetContent.kt:848)");
            }
            Arrangement arrangement = Arrangement.INSTANCE;
            Arrangement.Vertical top = arrangement.getTop();
            Alignment.Companion companion3 = Alignment.INSTANCE;
            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(top, companion3.getStart(), composerStartRestartGroup, 0);
            long currentCompositeKeyHashCode = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
            int i3 = (int) (currentCompositeKeyHashCode ^ (currentCompositeKeyHashCode >>> 32));
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifier);
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
            pk0.v(companion4, composerM3915constructorimpl, measurePolicyColumnMeasurePolicy, composerM3915constructorimpl, currentCompositionLocalMap);
            Updater.m3923setimpl(composerM3915constructorimpl, modifierMaterializeModifier, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion4, composerM3915constructorimpl, Integer.valueOf(i3), composerM3915constructorimpl));
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
            Modifier.Companion companion5 = Modifier.INSTANCE;
            Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(companion5, 0.0f, 1, null);
            MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(arrangement.getStart(), companion3.getCenterVertically(), composerStartRestartGroup, 48);
            long currentCompositeKeyHashCode2 = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
            int i4 = (int) (currentCompositeKeyHashCode2 ^ (currentCompositeKeyHashCode2 >>> 32));
            CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierFillMaxWidth$default);
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
            pk0.v(companion4, composerM3915constructorimpl2, measurePolicyRowMeasurePolicy, composerM3915constructorimpl2, currentCompositionLocalMap2);
            Updater.m3923setimpl(composerM3915constructorimpl2, modifierMaterializeModifier2, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion4, composerM3915constructorimpl2, Integer.valueOf(i4), composerM3915constructorimpl2));
            RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
            PremiumBusTripInfoContractKt.c(premiumBusBookingVehicleInfoState);
            PremiumBusTripInfoContractKt.d(premiumBusBookingVehicleInfoState);
            composerStartRestartGroup.startReplaceGroup(1741031477);
            Painter painterA = PainterResourceHelperKt.a(IconType.IC_CHALO_BUS_IMAGE_WITH_SHADOW_WITHOUT_PADDING, composerStartRestartGroup, 6);
            StringEnum stringEnum = StringEnum.VEHICLE;
            int i5 = i2;
            ImageKt.Image(painterA, StringResourcesHelperKt.c(stringEnum, new Object[0], composerStartRestartGroup, 6), GraphicsLayerModifierKt.m4770graphicsLayer_6ThJ44$default(SizeKt.m833width3ABfNKs(companion5, ChaloTheme.b(composerStartRestartGroup, 0).t), -1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0L, null, false, null, 0L, 0L, 0, 0, null, 524286, null), (Alignment) null, ContentScale.INSTANCE.getFit(), 0.0f, (ColorFilter) null, composerStartRestartGroup, Painter.$stable | 24576, 104);
            composerStartRestartGroup.endReplaceGroup();
            ChaloSpacersKt.y(composerStartRestartGroup, 0);
            Modifier modifierA = i41.a(rowScopeInstance, companion5, 1.0f, false, 2, null);
            MeasurePolicy measurePolicyColumnMeasurePolicy2 = ColumnKt.columnMeasurePolicy(arrangement.getCenter(), companion3.getStart(), composerStartRestartGroup, 6);
            long currentCompositeKeyHashCode3 = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
            int i6 = (int) (currentCompositeKeyHashCode3 ^ (currentCompositeKeyHashCode3 >>> 32));
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
            Updater.m3923setimpl(composerM3915constructorimpl3, modifierMaterializeModifier3, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion4, composerM3915constructorimpl3, Integer.valueOf(i6), composerM3915constructorimpl3));
            boolean z3 = premiumBusBookingVehicleInfoState instanceof PremiumBusBookingVehicleInfoState.NotFetched;
            if (z3 || (premiumBusBookingVehicleInfoState instanceof PremiumBusBookingVehicleInfoState.VehicleNotAssigned)) {
                z2 = z3;
                companion = companion5;
                composerStartRestartGroup.startReplaceGroup(-1319032559);
                i(i5 & 112, composerStartRestartGroup, null, premiumBusBookingVehicleInfoState);
                composerStartRestartGroup.endReplaceGroup();
            } else {
                if (!(premiumBusBookingVehicleInfoState instanceof PremiumBusBookingVehicleInfoState.VehicleAssigned)) {
                    throw pk0.p(composerStartRestartGroup, -1705122120);
                }
                composerStartRestartGroup.startReplaceGroup(-1318762611);
                composerStartRestartGroup.startReplaceGroup(-1705106645);
                String strC = StringResourcesHelperKt.c(stringEnum, new Object[0], composerStartRestartGroup, 6);
                composerStartRestartGroup.endReplaceGroup();
                companion = companion5;
                z2 = z3;
                TextKt.m2623TextNvy7gAk(strC, null, ChaloTheme.a(composerStartRestartGroup, 0).i, null, 0L, null, null, null, 0L, null, null, 0L, TextOverflow.INSTANCE.m7226getEllipsisgIe3tQ8(), false, 1, 0, null, ChaloTypographyKt.d(ChaloTheme.e(composerStartRestartGroup, 0)), composerStartRestartGroup, 0, 24960, 110586);
                composerStartRestartGroup = composerStartRestartGroup;
                SpacerKt.Spacer(SizeKt.m814height3ABfNKs(companion, ChaloTheme.b(composerStartRestartGroup, 0).c), composerStartRestartGroup, 0);
                i(i5 & 112, composerStartRestartGroup, null, premiumBusBookingVehicleInfoState);
                composerStartRestartGroup.endReplaceGroup();
            }
            composerStartRestartGroup.endNode();
            if (premiumBusBookingVehicleInfoState.f7415a.isEmpty()) {
                companion2 = companion;
                composerStartRestartGroup.startReplaceGroup(1706001136);
            } else {
                composerStartRestartGroup.startReplaceGroup(1742777273);
                ChaloSpacersKt.w(composerStartRestartGroup, 0);
                SpacerKt.Spacer(BackgroundKt.m264backgroundbw27NRU$default(SizeKt.m833width3ABfNKs(SizeKt.m814height3ABfNKs(companion, ChaloTheme.b(composerStartRestartGroup, 0).m), ChaloTheme.b(composerStartRestartGroup, 0).c), ChaloTheme.a(composerStartRestartGroup, 0).m0, null, 2, null), composerStartRestartGroup, 0);
                ChaloSpacersKt.w(composerStartRestartGroup, 0);
                companion2 = companion;
                o(i41.a(rowScopeInstance, companion2, 1.0f, false, 2, null), premiumBusBookingVehicleInfoState, openPassengerListDialog, composerStartRestartGroup, (i5 & 112) | ((i5 >> 3) & 896));
            }
            composerStartRestartGroup.endReplaceGroup();
            composerStartRestartGroup.endNode();
            composerStartRestartGroup.endNode();
            if (z) {
                composerStartRestartGroup.startReplaceGroup(339360208);
                Modifier.Companion companion6 = companion2;
                companion2 = companion6;
                PremiumBusTrackingStateKt.a(PaddingKt.m788paddingqDBjuR0$default(companion6, ChaloTheme.b(composerStartRestartGroup, 0).h, 0.0f, ChaloTheme.b(composerStartRestartGroup, 0).h, ChaloTheme.b(composerStartRestartGroup, 0).h, 2, null), null, StringResourcesHelperKt.c(StringEnum.WOMEN_ADJACENCY_PROMISE_FAILED_ERROR, new Object[0], composerStartRestartGroup, 6), 0L, 0L, composerStartRestartGroup, 0, 26);
            } else {
                composerStartRestartGroup.startReplaceGroup(301933846);
            }
            composerStartRestartGroup.endReplaceGroup();
            if (z2 || (premiumBusBookingVehicleInfoState instanceof PremiumBusBookingVehicleInfoState.VehicleNotAssigned)) {
                composerStartRestartGroup.startReplaceGroup(339859339);
                composerStartRestartGroup.endReplaceGroup();
            } else {
                if (!(premiumBusBookingVehicleInfoState instanceof PremiumBusBookingVehicleInfoState.VehicleAssigned)) {
                    throw pk0.p(composerStartRestartGroup, -1513061530);
                }
                composerStartRestartGroup.startReplaceGroup(339950789);
                if (((PremiumBusBookingVehicleInfoState.VehicleAssigned) premiumBusBookingVehicleInfoState).e.isEmpty()) {
                    composerStartRestartGroup.startReplaceGroup(301933846);
                } else {
                    composerStartRestartGroup.startReplaceGroup(340003334);
                    PremiumBusTrackingStateKt.a(PaddingKt.m788paddingqDBjuR0$default(companion2, ChaloTheme.b(composerStartRestartGroup, 0).h, 0.0f, ChaloTheme.b(composerStartRestartGroup, 0).h, ChaloTheme.b(composerStartRestartGroup, 0).h, 2, null), null, StringResourcesHelperKt.c(StringEnum.KINDLY_SIT_ONLY_ON_YOUR_ALLOCATED_SEAT, new Object[0], composerStartRestartGroup, 6), 0L, 0L, composerStartRestartGroup, 0, 26);
                }
                composerStartRestartGroup.endReplaceGroup();
                composerStartRestartGroup.endReplaceGroup();
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new lh(modifier, (Object) premiumBusBookingVehicleInfoState, z, (Object) openPassengerListDialog, i, 6));
        }
    }

    public static final void l(String routeName, String fromStopName, String toStopName, String str, Integer num, Function0 onStopsCountClick, PremiumBusPostBookingStopSchedule pickupStopScheduledTime, Composer composer, int i) {
        int i2;
        Composer composer2;
        int i3;
        Modifier.Companion companion;
        Composer composer3;
        Object obj;
        Intrinsics.i(routeName, "routeName");
        Intrinsics.i(fromStopName, "fromStopName");
        Intrinsics.i(toStopName, "toStopName");
        Intrinsics.i(onStopsCountClick, "onStopsCountClick");
        Intrinsics.i(pickupStopScheduledTime, "pickupStopScheduledTime");
        Composer composerStartRestartGroup = composer.startRestartGroup(-1012508046);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changed(routeName) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changed(fromStopName) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= composerStartRestartGroup.changed(toStopName) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= composerStartRestartGroup.changed(str) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= composerStartRestartGroup.changed(num) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(onStopsCountClick) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            i2 |= composerStartRestartGroup.changed(pickupStopScheduledTime) ? 1048576 : 524288;
        }
        if (composerStartRestartGroup.shouldExecute((599187 & i2) != 599186, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1012508046, i2, -1, "app.chalo.premiumbus.prebookedtickets.newactivation.PremiumBusBookingDetailsComponent (NewPremiumBusActivationBottomSheetContent.kt:980)");
            }
            Modifier.Companion companion2 = Modifier.INSTANCE;
            Modifier modifierM784padding3ABfNKs = PaddingKt.m784padding3ABfNKs(BackgroundKt.m264backgroundbw27NRU$default(SizeKt.fillMaxWidth$default(companion2, 0.0f, 1, null), ChaloTheme.a(composerStartRestartGroup, 0).t, null, 2, null), ChaloTheme.b(composerStartRestartGroup, 0).h);
            Arrangement arrangement = Arrangement.INSTANCE;
            Arrangement.Vertical top = arrangement.getTop();
            Alignment.Companion companion3 = Alignment.INSTANCE;
            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(top, companion3.getStart(), composerStartRestartGroup, 0);
            long currentCompositeKeyHashCode = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
            int i4 = (int) (currentCompositeKeyHashCode ^ (currentCompositeKeyHashCode >>> 32));
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierM784padding3ABfNKs);
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
            pk0.v(companion4, composerM3915constructorimpl, measurePolicyColumnMeasurePolicy, composerM3915constructorimpl, currentCompositionLocalMap);
            Updater.m3923setimpl(composerM3915constructorimpl, modifierMaterializeModifier, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion4, composerM3915constructorimpl, Integer.valueOf(i4), composerM3915constructorimpl));
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
            TextKt.m2623TextNvy7gAk(StringResourcesHelperKt.c(StringEnum.BOOKING_DETAILS, new Object[0], composerStartRestartGroup, 6), null, ChaloTheme.a(composerStartRestartGroup, 0).t0, null, 0L, null, null, null, 0L, null, null, 0L, TextOverflow.INSTANCE.m7226getEllipsisgIe3tQ8(), false, 1, 0, null, ChaloTypographyKt.a(ChaloTheme.e(composerStartRestartGroup, 0).getHeadlineSmall()), composerStartRestartGroup, 0, 24960, 110586);
            ChaloSpacersKt.o(composerStartRestartGroup, 0);
            Modifier modifierM784padding3ABfNKs2 = PaddingKt.m784padding3ABfNKs(BackgroundKt.m263backgroundbw27NRU(companion2, ChaloTheme.a(composerStartRestartGroup, 0).A0, ChaloTheme.d(composerStartRestartGroup, 0).g), ChaloTheme.b(composerStartRestartGroup, 0).h);
            MeasurePolicy measurePolicyColumnMeasurePolicy2 = ColumnKt.columnMeasurePolicy(arrangement.getTop(), companion3.getStart(), composerStartRestartGroup, 0);
            long currentCompositeKeyHashCode2 = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
            int i5 = (int) (currentCompositeKeyHashCode2 ^ (currentCompositeKeyHashCode2 >>> 32));
            CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierM784padding3ABfNKs2);
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
            pk0.v(companion4, composerM3915constructorimpl2, measurePolicyColumnMeasurePolicy2, composerM3915constructorimpl2, currentCompositionLocalMap2);
            Updater.m3923setimpl(composerM3915constructorimpl2, modifierMaterializeModifier2, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion4, composerM3915constructorimpl2, Integer.valueOf(i5), composerM3915constructorimpl2));
            Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(companion2, 0.0f, 1, null);
            MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(arrangement.getStart(), companion3.getCenterVertically(), composerStartRestartGroup, 48);
            long currentCompositeKeyHashCode3 = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
            int i6 = (int) (currentCompositeKeyHashCode3 ^ (currentCompositeKeyHashCode3 >>> 32));
            CompositionLocalMap currentCompositionLocalMap3 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier3 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierFillMaxWidth$default);
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
            pk0.v(companion4, composerM3915constructorimpl3, measurePolicyRowMeasurePolicy, composerM3915constructorimpl3, currentCompositionLocalMap3);
            Updater.m3923setimpl(composerM3915constructorimpl3, modifierMaterializeModifier3, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion4, composerM3915constructorimpl3, Integer.valueOf(i6), composerM3915constructorimpl3));
            int i7 = i2;
            n(i41.a(RowScopeInstance.INSTANCE, companion2, 1.0f, false, 2, null), ChaloTheme.b(composerStartRestartGroup, 0).i, ChaloTheme.e(composerStartRestartGroup, 0).getHeadlineSmall(), routeName, composerStartRestartGroup, (i2 << 9) & 7168);
            if (num == null) {
                composerStartRestartGroup.startReplaceGroup(-1573559099);
                composerStartRestartGroup.endReplaceGroup();
                companion = companion2;
                i3 = 0;
                composer3 = composerStartRestartGroup;
            } else {
                composerStartRestartGroup.startReplaceGroup(-1573559098);
                i3 = 0;
                companion = companion2;
                FromAndToStopCardKt.e(IconType.IC_LOCATION_ORANGE, StringResourcesHelperKt.c(StringEnum.X_STOPS, new Object[]{num}, composerStartRestartGroup, 6), ClickableKt.m299clickableoSLSa3U$default(companion2, false, null, null, null, onStopsCountClick, 15, null), SizeKt.m828size3ABfNKs(companion2, ChaloTheme.b(composerStartRestartGroup, 0).h), ChaloTheme.a(composerStartRestartGroup, 0).f1915a, 0, 0, ChaloTheme.e(composerStartRestartGroup, 0).getTitleLarge(), composerStartRestartGroup, 6, 96);
                composer3 = composerStartRestartGroup;
                composer3.endReplaceGroup();
            }
            composer3.endNode();
            SpacerKt.Spacer(SizeKt.m814height3ABfNKs(companion, ChaloTheme.b(composer3, i3).f), composer3, i3);
            Modifier.Companion companion5 = companion;
            int i8 = i3;
            Composer composer4 = composer3;
            FromAndToStopCardKt.b(new FromAndToStopCardData(null, fromStopName, toStopName, null, null, null, null, null, null, 801), SizeKt.fillMaxWidth$default(companion5, 0.0f, 1, null), null, null, ChaloTheme.a(composer3, i8).v0, ChaloTheme.e(composer3, i8).getBodySmall(), ChaloTheme.e(composer3, i8).getTitleLarge(), false, 2, false, 0.0f, 0.0f, composer4, 100663344, 0, 7820);
            composer2 = composer4;
            if (pickupStopScheduledTime.equals(PremiumBusPostBookingStopSchedule.NotApplicable.f7427a) || pickupStopScheduledTime.equals(PremiumBusPostBookingStopSchedule.Unknown.f7429a)) {
                obj = null;
                composer2.startReplaceGroup(1559830825);
                composer2.endReplaceGroup();
            } else {
                if (!(pickupStopScheduledTime instanceof PremiumBusPostBookingStopSchedule.ScheduleAvailable)) {
                    throw pk0.p(composer2, 1851428541);
                }
                composer2.startReplaceGroup(1559953585);
                ChaloSpacersKt.o(composer2, i8);
                Modifier modifierFillMaxWidth$default2 = SizeKt.fillMaxWidth$default(companion5, 0.0f, 1, null);
                MeasurePolicy measurePolicyRowMeasurePolicy2 = RowKt.rowMeasurePolicy(arrangement.getStart(), companion3.getCenterVertically(), composer2, 48);
                long currentCompositeKeyHashCode4 = ComposablesKt.getCurrentCompositeKeyHashCode(composer2, i8);
                int i9 = (int) (currentCompositeKeyHashCode4 ^ (currentCompositeKeyHashCode4 >>> 32));
                CompositionLocalMap currentCompositionLocalMap4 = composer2.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier4 = ComposedModifierKt.materializeModifier(composer2, modifierFillMaxWidth$default2);
                Function0<ComposeUiNode> constructor4 = companion4.getConstructor();
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
                pk0.v(companion4, composerM3915constructorimpl4, measurePolicyRowMeasurePolicy2, composerM3915constructorimpl4, currentCompositionLocalMap4);
                Updater.m3923setimpl(composerM3915constructorimpl4, modifierMaterializeModifier4, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion4, composerM3915constructorimpl4, Integer.valueOf(i9), composerM3915constructorimpl4));
                IconKt.m2070Iconww6aTOc(PainterResourceHelperKt.a(IconType.IC_TIME, composer2, 6), "", SizeKt.m828size3ABfNKs(companion5, ChaloTheme.b(composer2, i8).h), ChaloTheme.a(composer2, i8).t0, composer2, Painter.$stable | 48, 0);
                ChaloSpacersKt.w(composer2, i8);
                obj = null;
                TextKt.m2623TextNvy7gAk(((PremiumBusPostBookingStopSchedule.ScheduleAvailable) pickupStopScheduledTime).f7428a, null, ChaloTheme.a(composer2, i8).t0, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ChaloTheme.e(composer2, i8).getTitleLarge(), composer2, 0, 0, 131066);
                composer2 = composer2;
                composer2.endNode();
                composer2.endReplaceGroup();
            }
            if (str == null) {
                composer2.startReplaceGroup(1560923791);
            } else {
                composer2.startReplaceGroup(1560923792);
                SpacerKt.Spacer(BackgroundKt.m264backgroundbw27NRU$default(SizeKt.fillMaxWidth$default(SizeKt.m814height3ABfNKs(PaddingKt.m786paddingVpY3zN4$default(companion5, 0.0f, ChaloTheme.b(composer2, i8).h, 1, obj), ChaloTheme.b(composer2, i8).b), 0.0f, 1, obj), ChaloTheme.a(composer2, i8).m, null, 2, null), composer2, i8);
                FromAndToStopCardKt.e(IconType.IC_ICON_TICKET_BLACK, str, SizeKt.fillMaxWidth$default(companion5, 0.0f, 1, obj), SizeKt.m828size3ABfNKs(companion5, ChaloTheme.b(composer2, i8).i), ChaloTheme.a(composer2, i8).t0, 0, 0, ChaloTheme.e(composer2, i8).getBodyMedium(), composer2, ((i7 >> 6) & 112) | 390, 96);
            }
            composer2.endReplaceGroup();
            if (r1.k(composer2)) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer2 = composerStartRestartGroup;
            composer2.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new km(routeName, fromStopName, toStopName, str, num, onStopsCountClick, pickupStopScheduledTime, i, 4));
        }
    }

    public static final void m(PremiumBusBookingTripTimeInfoState premiumBusBookingTripTimeInfoState, boolean z, NewPremiumReserveTicketDetailsScreenType screenType, Modifier modifier, Composer composer, int i) {
        int i2;
        Composer composer2;
        Modifier modifier2;
        char c;
        String strC;
        int i3;
        long j;
        Modifier.Companion companion;
        Intrinsics.i(screenType, "screenType");
        Composer composerStartRestartGroup = composer.startRestartGroup(503804188);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changed(premiumBusBookingTripTimeInfoState) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changed(z) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= composerStartRestartGroup.changed(screenType.ordinal()) ? 256 : 128;
        }
        int i4 = i2 | 3072;
        if (composerStartRestartGroup.shouldExecute((i4 & 1171) != 1170, i4 & 1)) {
            Modifier.Companion companion2 = Modifier.INSTANCE;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(503804188, i4, -1, "app.chalo.premiumbus.prebookedtickets.newactivation.PremiumBusTripTimeInfoComponentV2 (NewPremiumBusActivationBottomSheetContent.kt:666)");
            }
            boolean z2 = premiumBusBookingTripTimeInfoState instanceof PremiumBusBookingTripTimeInfoState.LiveEta;
            PremiumBusBookingTripTimeInfoState.LiveEtaNotAvailable liveEtaNotAvailable = PremiumBusBookingTripTimeInfoState.LiveEtaNotAvailable.b;
            PremiumBusBookingTripTimeInfoState.NotFetched notFetched = PremiumBusBookingTripTimeInfoState.NotFetched.b;
            PremiumBusBookingTripTimeInfoState.BusPassedPickupStop busPassedPickupStop = PremiumBusBookingTripTimeInfoState.BusPassedPickupStop.b;
            if (z2) {
                c = ' ';
                composerStartRestartGroup.startReplaceGroup(-2079796910);
                int i5 = WhenMappings.f7323a[screenType.ordinal()];
                if (i5 == 1) {
                    composerStartRestartGroup.startReplaceGroup(-1175466193);
                    strC = StringResourcesHelperKt.c(StringEnum.ARRIVING_IN, new Object[0], composerStartRestartGroup, 6);
                    composerStartRestartGroup.endReplaceGroup();
                } else {
                    if (i5 != 2) {
                        throw pk0.p(composerStartRestartGroup, -1175468880);
                    }
                    composerStartRestartGroup.startReplaceGroup(-1175462225);
                    strC = StringResourcesHelperKt.c(StringEnum.DROP_OFF_IN, new Object[0], composerStartRestartGroup, 6);
                    composerStartRestartGroup.endReplaceGroup();
                }
                composerStartRestartGroup.endReplaceGroup();
            } else {
                c = ' ';
                if (!premiumBusBookingTripTimeInfoState.equals(busPassedPickupStop) && !(premiumBusBookingTripTimeInfoState instanceof PremiumBusBookingTripTimeInfoState.ExpectedTime) && !premiumBusBookingTripTimeInfoState.equals(notFetched) && !premiumBusBookingTripTimeInfoState.equals(liveEtaNotAvailable)) {
                    throw pk0.p(composerStartRestartGroup, -1175471163);
                }
                composerStartRestartGroup.startReplaceGroup(-1175451918);
                strC = StringResourcesHelperKt.c(StringEnum.CURRENT_STATUS, new Object[0], composerStartRestartGroup, 6);
                composerStartRestartGroup.endReplaceGroup();
            }
            int i6 = (i4 >> 9) & 14;
            MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), Alignment.INSTANCE.getCenterVertically(), composerStartRestartGroup, 48);
            long currentCompositeKeyHashCode = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
            int i7 = (int) (currentCompositeKeyHashCode ^ (currentCompositeKeyHashCode >>> c));
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, companion2);
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
            pk0.v(companion3, composerM3915constructorimpl, measurePolicyRowMeasurePolicy, composerM3915constructorimpl, currentCompositionLocalMap);
            Updater.m3923setimpl(composerM3915constructorimpl, modifierMaterializeModifier, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion3, composerM3915constructorimpl, Integer.valueOf(i7), composerM3915constructorimpl));
            RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
            if (z) {
                composerStartRestartGroup.startReplaceGroup(1130363625);
                i3 = 0;
                j = ChaloTheme.a(composerStartRestartGroup, 0).v0;
            } else {
                i3 = 0;
                composerStartRestartGroup.startReplaceGroup(1130364656);
                j = ChaloTheme.a(composerStartRestartGroup, 0).t0;
            }
            composerStartRestartGroup.endReplaceGroup();
            TextStyle textStyleA = ChaloTypographyKt.a(ChaloTypographyKt.f(ChaloTheme.e(composerStartRestartGroup, i3)));
            int i8 = i3;
            TextKt.m2623TextNvy7gAk(strC, null, j, null, 0L, null, null, null, 0L, null, null, 0L, TextOverflow.INSTANCE.m7226getEllipsisgIe3tQ8(), false, 1, 0, null, textStyleA, composerStartRestartGroup, 0, 24960, 110586);
            composer2 = composerStartRestartGroup;
            SpacerKt.Spacer(SizeKt.m833width3ABfNKs(companion2, ChaloTheme.b(composer2, i8).f), composer2, i8);
            if (premiumBusBookingTripTimeInfoState.equals(busPassedPickupStop)) {
                composer2.startReplaceGroup(681893609);
                composer2.endReplaceGroup();
                companion = companion2;
            } else if (premiumBusBookingTripTimeInfoState instanceof PremiumBusBookingTripTimeInfoState.ExpectedTime) {
                composer2.startReplaceGroup(682055677);
                companion = companion2;
                TextKt.m2623TextNvy7gAk(StringResourcesHelperKt.c(StringEnum.NOT_STARTED, new Object[i8], composer2, 6), companion, ChaloTheme.a(composer2, i8).e, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ChaloTheme.e(composer2, i8).getHeadlineMedium(), composer2, (i4 >> 6) & 112, 0, 131064);
                composer2 = composer2;
                composer2.endReplaceGroup();
            } else {
                companion = companion2;
                if (z2) {
                    composer2.startReplaceGroup(682426003);
                    d(companion, ((PremiumBusBookingTripTimeInfoState.LiveEta) premiumBusBookingTripTimeInfoState).b, z, ChaloTheme.e(composer2, i8).getDisplaySmall(), composer2, i6 | ((i4 << 3) & 896));
                    composer2.endReplaceGroup();
                } else if (premiumBusBookingTripTimeInfoState.equals(notFetched)) {
                    composer2.startReplaceGroup(682787897);
                    PremiumBusBookingCardKt.a(SizeKt.fillMaxWidth(PaddingKt.m788paddingqDBjuR0$default(companion, 0.0f, ChaloTheme.b(composer2, i8).d, 0.0f, 0.0f, 13, null), 0.4f), 0.0f, composer2, i8, 2);
                    composer2.endReplaceGroup();
                } else {
                    if (!premiumBusBookingTripTimeInfoState.equals(liveEtaNotAvailable)) {
                        throw pk0.p(composer2, 1130373343);
                    }
                    composer2.startReplaceGroup(683083296);
                    composer2.endReplaceGroup();
                }
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
            scopeUpdateScopeEndRestartGroup.updateScope(new lh(premiumBusBookingTripTimeInfoState, z, screenType, modifier2, i, 4));
        }
    }

    public static final void n(Modifier modifier, float f, TextStyle textStyle, String routeName, Composer composer, int i) {
        int i2;
        Intrinsics.i(routeName, "routeName");
        Composer composerStartRestartGroup = composer.startRestartGroup(-1399399084);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changed(modifier) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changed(f) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= composerStartRestartGroup.changed(textStyle) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= composerStartRestartGroup.changed(routeName) ? 2048 : 1024;
        }
        if (composerStartRestartGroup.shouldExecute((i2 & 1171) != 1170, i2 & 1)) {
            composerStartRestartGroup.startDefaults();
            if ((i & 1) != 0 && !composerStartRestartGroup.getDefaultsInvalid()) {
                composerStartRestartGroup.skipToGroupEnd();
            }
            composerStartRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1399399084, i2, -1, "app.chalo.premiumbus.prebookedtickets.newactivation.RouteNameDisplayComponent (NewPremiumBusActivationBottomSheetContent.kt:1112)");
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
            Painter painterA = PainterResourceHelperKt.a(IconType.IC_CHALO_BUS, composerStartRestartGroup, 6);
            Modifier.Companion companion2 = Modifier.INSTANCE;
            int i4 = i2;
            ImageKt.Image(painterA, (String) null, PaddingKt.m784padding3ABfNKs(SizeKt.m828size3ABfNKs(companion2, f), ChaloTheme.b(composerStartRestartGroup, 0).c), (Alignment) null, ContentScale.INSTANCE.getFit(), 0.0f, (ColorFilter) null, composerStartRestartGroup, Painter.$stable | 24624, 104);
            SpacerKt.Spacer(SizeKt.m833width3ABfNKs(companion2, ChaloTheme.b(composerStartRestartGroup, 0).e), composerStartRestartGroup, 0);
            TextKt.m2623TextNvy7gAk(routeName, null, ChaloTheme.a(composerStartRestartGroup, 0).g, null, 0L, null, null, null, 0L, null, null, 0L, TextOverflow.INSTANCE.m7226getEllipsisgIe3tQ8(), false, 1, 0, null, textStyle, composerStartRestartGroup, (i4 >> 9) & 14, ((i4 << 15) & 29360128) | 24960, 110586);
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
            scopeUpdateScopeEndRestartGroup.updateScope(new am(modifier, f, textStyle, routeName, i, 1));
        }
    }

    public static final void o(Modifier modifier, PremiumBusBookingVehicleInfoState premiumBusBookingVehicleInfoState, Function1 function1, Composer composer, int i) {
        int i2;
        IconType iconType;
        String strC;
        Composer composerStartRestartGroup = composer.startRestartGroup(-81752151);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changed(modifier) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(premiumBusBookingVehicleInfoState) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(function1) ? 256 : 128;
        }
        if (composerStartRestartGroup.shouldExecute((i2 & 147) != 146, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-81752151, i2, -1, "app.chalo.premiumbus.prebookedtickets.newactivation.SelectSeatsComposable (NewPremiumBusActivationBottomSheetContent.kt:1142)");
            }
            ChaloSpacersKt.y(composerStartRestartGroup, 0);
            List list = premiumBusBookingVehicleInfoState.f7415a;
            boolean zChanged = composerStartRestartGroup.changed(list);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                List list2 = list;
                if (!(list2 instanceof Collection) || !list2.isEmpty()) {
                    Iterator it = list2.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            iconType = IconType.IC_SEAT_BLACK;
                            break;
                        } else if (((SeatInfoAppModel) it.next()).e == ReservationType.WOMEN) {
                            iconType = IconType.WOMEN_SELECTED_SEAT;
                            break;
                        }
                    }
                } else {
                    iconType = IconType.IC_SEAT_BLACK;
                    break;
                }
                objRememberedValue = iconType;
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            Painter painterA = PainterResourceHelperKt.a((IconType) objRememberedValue, composerStartRestartGroup, 0);
            Modifier.Companion companion = Modifier.INSTANCE;
            int i3 = i2;
            ImageKt.Image(painterA, (String) null, SizeKt.m828size3ABfNKs(companion, ChaloTheme.b(composerStartRestartGroup, 0).k), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composerStartRestartGroup, Painter.$stable | 48, 120);
            ChaloSpacersKt.w(composerStartRestartGroup, 0);
            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composerStartRestartGroup, 0);
            long currentCompositeKeyHashCode = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
            int i4 = (int) (currentCompositeKeyHashCode ^ (currentCompositeKeyHashCode >>> 32));
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
            Updater.m3923setimpl(composerM3915constructorimpl, modifierMaterializeModifier, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion2, composerM3915constructorimpl, Integer.valueOf(i4), composerM3915constructorimpl));
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
            TextKt.m2623TextNvy7gAk(StringResourcesHelperKt.c(StringEnum.SEAT, new Object[0], composerStartRestartGroup, 6), null, ChaloTheme.a(composerStartRestartGroup, 0).i, null, 0L, null, null, null, 0L, null, null, 0L, TextOverflow.INSTANCE.m7226getEllipsisgIe3tQ8(), false, 1, 0, null, ChaloTypographyKt.d(ChaloTheme.e(composerStartRestartGroup, 0)), composerStartRestartGroup, 0, 24960, 110586);
            SpacerKt.Spacer(SizeKt.m814height3ABfNKs(companion, ChaloTheme.b(composerStartRestartGroup, 0).c), composerStartRestartGroup, 0);
            List list3 = list;
            ArrayList arrayList = new ArrayList(CollectionsKt.v(list3, 10));
            Iterator it2 = list3.iterator();
            while (it2.hasNext()) {
                arrayList.add(((SeatInfoAppModel) it2.next()).c);
            }
            String strO = CollectionsKt.O(CollectionsKt.x0(arrayList, 3), ", ", null, null, null, 62);
            int size = list.size() - 3;
            TextStyle textStyleA = ChaloTypographyKt.a(ChaloTypographyKt.h(ChaloTheme.e(composerStartRestartGroup, 0)));
            TextOverflow.Companion companion3 = TextOverflow.INSTANCE;
            TextKt.m2623TextNvy7gAk(strO, null, 0L, null, 0L, null, null, null, 0L, null, null, 0L, companion3.m7226getEllipsisgIe3tQ8(), false, 1, 0, null, textStyleA, composerStartRestartGroup, 0, 24960, 110590);
            composerStartRestartGroup = composerStartRestartGroup;
            if (size > 0) {
                composerStartRestartGroup.startReplaceGroup(1208861884);
                Modifier.Companion companion4 = Modifier.INSTANCE;
                SpacerKt.Spacer(SizeKt.m814height3ABfNKs(companion4, ChaloTheme.b(composerStartRestartGroup, 0).c), composerStartRestartGroup, 0);
                if (size == 1) {
                    composerStartRestartGroup.startReplaceGroup(1208981389);
                    strC = StringResourcesHelperKt.c(StringEnum.PLUS_X_PASSENGER, new Object[]{Integer.valueOf(size)}, composerStartRestartGroup, 6);
                    composerStartRestartGroup.endReplaceGroup();
                } else {
                    composerStartRestartGroup.startReplaceGroup(1209167916);
                    strC = StringResourcesHelperKt.c(StringEnum.PLUS_X_PASSENGERS, new Object[]{Integer.valueOf(size)}, composerStartRestartGroup, 6);
                    composerStartRestartGroup.endReplaceGroup();
                }
                long j = ChaloTheme.a(composerStartRestartGroup, 0).f1915a;
                TextStyle textStyleD = ChaloTypographyKt.d(ChaloTheme.e(composerStartRestartGroup, 0));
                int iM7226getEllipsisgIe3tQ8 = companion3.m7226getEllipsisgIe3tQ8();
                boolean zChangedInstance = composerStartRestartGroup.changedInstance(premiumBusBookingVehicleInfoState) | ((i3 & 896) == 256);
                Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                if (zChangedInstance || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue2 = new zf0(15, function1, premiumBusBookingVehicleInfoState);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                }
                TextKt.m2623TextNvy7gAk(strC, ClickableKt.m299clickableoSLSa3U$default(companion4, false, null, null, null, (Function0) objRememberedValue2, 15, null), j, null, 0L, null, null, null, 0L, null, null, 0L, iM7226getEllipsisgIe3tQ8, false, 1, 0, null, textStyleD, composerStartRestartGroup, 0, 24960, 110584);
                composerStartRestartGroup = composerStartRestartGroup;
            } else {
                composerStartRestartGroup.startReplaceGroup(1162850723);
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
            scopeUpdateScopeEndRestartGroup.updateScope(new wm0(modifier, premiumBusBookingVehicleInfoState, function1, i, 2));
        }
    }
}
