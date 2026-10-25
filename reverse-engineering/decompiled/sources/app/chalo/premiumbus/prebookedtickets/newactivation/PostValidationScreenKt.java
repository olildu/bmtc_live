package app.chalo.premiumbus.prebookedtickets.newactivation;

import androidx.compose.animation.AnimationModifierKt;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.pager.PagerKt;
import androidx.compose.foundation.pager.PagerState;
import androidx.compose.foundation.pager.PagerStateKt;
import androidx.compose.material3.DividerKt;
import androidx.compose.material3.IconKt;
import androidx.compose.material3.TextKt;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.layout.ContentScale;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.style.TextOverflow;
import androidx.core.view.accessibility.AccessibilityEventCompat;
import androidx.media3.extractor.WavUtil;
import androidx.profileinstaller.ProfileVerifier;
import app.chalo.citydata.data.model.app.SeatAvailabilityLevel;
import app.chalo.compose.BulletListComponentWithLineIconKt;
import app.chalo.compose.ChaloEtaComponentKt;
import app.chalo.compose.components.ChaloRoundedCardKt;
import app.chalo.compose.components.ChaloScrollableTabRowKt;
import app.chalo.compose.components.ChaloSpacersKt;
import app.chalo.compose.components.chalomap.LiveBusDelayedState;
import app.chalo.compose.resources.PainterResourceHelperKt;
import app.chalo.compose.resources.StringResourcesHelperKt;
import app.chalo.compose.theme.ChaloTheme;
import app.chalo.compose.theme.ChaloThemeHelper;
import app.chalo.compose.theme.ChaloThemeKt;
import app.chalo.compose.theme.ChaloTypographyKt;
import app.chalo.home.ui.compose.PBStopImageKt;
import app.chalo.livetracking.provider.tracking.model.EstimatedStopEtaUiModel;
import app.chalo.livetracking.provider.tracking.model.FixedStopEtaUiModel;
import app.chalo.livetracking.provider.tracking.model.StopLiveEtaUiModel;
import app.chalo.livetracking.routedetails.ui.routedetailsscreen.compose.ShimmerViewsKt;
import app.chalo.livetracking.routedetails.ui.routedetailsscreen.compose.StopEtasKt;
import app.chalo.premiumbus.data.models.app.TripCommunicationAppModel;
import app.chalo.premiumbus.prebookedtickets.ui.newactivation.NewPremiumBusReserveTicketActivationContractKt;
import app.chalo.premiumbus.prebookedtickets.ui.newactivation.NewPremiumBusReserveTicketActivationState;
import app.chalo.premiumbus.prebookedtickets.ui.newactivation.NewPremiumReserveTicketDetailsScreenType;
import app.chalo.premiumbus.prebookedtickets.ui.newactivation.PBStopImagesDetails;
import app.chalo.premiumbus.prebookedtickets.ui.newactivation.PremiumBusPostBoardingDetailsTab;
import app.chalo.premiumbus.prebookedtickets.ui.newactivation.ticketinfohandler.PremiumBusBookingTripTimeInfoState;
import app.chalo.premiumbus.prebookedtickets.ui.newactivation.ticketinfohandler.PremiumBusBookingVehicleInfoState;
import app.chalo.premiumbus.prebookedtickets.ui.newactivation.ticketinfohandler.PremiumBusPostBookingStopSchedule;
import app.chalo.premiumbus.prebookedtickets.ui.newactivation.ticketinfohandler.PremiumBusTripInfoContractKt;
import app.chalo.providers.iconassetprovider.IconType;
import app.chalo.providers.stringprovider.StringEnum;
import defpackage.af;
import defpackage.an0;
import defpackage.b9;
import defpackage.bf;
import defpackage.d60;
import defpackage.dt0;
import defpackage.eq0;
import defpackage.fq0;
import defpackage.i41;
import defpackage.nf1;
import defpackage.pk0;
import defpackage.q80;
import defpackage.qg;
import defpackage.qh;
import defpackage.r1;
import defpackage.r80;
import defpackage.si0;
import defpackage.sn0;
import defpackage.ud;
import defpackage.wb;
import defpackage.wo0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.EmptyList;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"home_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class PostValidationScreenKt {

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f7326a;

        static {
            int[] iArr = new int[PremiumBusPostBoardingDetailsTab.values().length];
            try {
                iArr[PremiumBusPostBoardingDetailsTab.ROUTE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[PremiumBusPostBoardingDetailsTab.TRIP_DETAILS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f7326a = iArr;
        }
    }

    public static final void a(int i, Composer composer, Modifier modifier, List stopList, Function1 onStopClick) {
        int i2;
        Intrinsics.i(stopList, "stopList");
        Intrinsics.i(onStopClick, "onStopClick");
        Composer composerStartRestartGroup = composer.startRestartGroup(1644604731);
        int i3 = 4;
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changed(modifier) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(stopList) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(onStopClick) ? 256 : 128;
        }
        if (composerStartRestartGroup.shouldExecute((i2 & 147) != 146, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1644604731, i2, -1, "app.chalo.premiumbus.prebookedtickets.newactivation.PostActivationRouteDetails (PostValidationScreen.kt:488)");
            }
            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composerStartRestartGroup, 0);
            long currentCompositeKeyHashCode = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
            int i4 = (int) ((currentCompositeKeyHashCode >>> 32) ^ currentCompositeKeyHashCode);
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
            Updater.m3923setimpl(composerM3915constructorimpl, modifierMaterializeModifier, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion, composerM3915constructorimpl, Integer.valueOf(i4), composerM3915constructorimpl));
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
            int size = stopList.size();
            Modifier.Companion companion2 = Modifier.INSTANCE;
            float f = ChaloTheme.b(composerStartRestartGroup, 0).f;
            boolean zChangedInstance = composerStartRestartGroup.changedInstance(stopList);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new ud(stopList, 15);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            BulletListComponentWithLineIconKt.c(size, companion2, 0.0f, 0.0f, 0.0f, f, (Function1) objRememberedValue, ComposableLambdaKt.rememberComposableLambda(488930126, true, new si0(stopList, 3), composerStartRestartGroup, 54), 0.0f, ComposableLambdaKt.rememberComposableLambda(-1869296369, true, new bf(i3, stopList, onStopClick), composerStartRestartGroup, 54), composerStartRestartGroup, 817889328);
            composerStartRestartGroup.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new qh(modifier, stopList, onStopClick, i, 4));
        }
    }

    public static final void b(NewPremiumBusReserveTicketActivationState state, Function1 sendIntent, Composer composer, int i) {
        Intrinsics.i(state, "state");
        List<PBStopImagesDetails> list = state.v;
        String str = state.c;
        Intrinsics.i(sendIntent, "sendIntent");
        Composer composerStartRestartGroup = composer.startRestartGroup(827248346);
        int i2 = (i & 6) == 0 ? (composerStartRestartGroup.changedInstance(state) ? 4 : 2) | i : i;
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(sendIntent) ? 32 : 16;
        }
        if (composerStartRestartGroup.shouldExecute((i2 & 19) != 18, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(827248346, i2, -1, "app.chalo.premiumbus.prebookedtickets.newactivation.PostBoardingTripDetails (PostValidationScreen.kt:384)");
            }
            Modifier.Companion companion = Modifier.INSTANCE;
            Arrangement arrangement = Arrangement.INSTANCE;
            Arrangement.Vertical top = arrangement.getTop();
            Alignment.Companion companion2 = Alignment.INSTANCE;
            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(top, companion2.getStart(), composerStartRestartGroup, 0);
            long currentCompositeKeyHashCode = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
            int i3 = (int) (currentCompositeKeyHashCode ^ (currentCompositeKeyHashCode >>> 32));
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, companion);
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
            ChaloSpacersKt.p(composerStartRestartGroup, 0);
            PremiumBusBookingVehicleInfoState notFetched = state.f;
            if (notFetched == null) {
                notFetched = new PremiumBusBookingVehicleInfoState.NotFetched(EmptyList.f17557a);
            }
            boolean z = state.I.g;
            Modifier modifierAnimateContentSize$default = AnimationModifierKt.animateContentSize$default(PaddingKt.m784padding3ABfNKs(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), ChaloTheme.b(composerStartRestartGroup, 0).h), null, null, 3, null);
            int i4 = i2 & 112;
            boolean z2 = i4 == 32;
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (z2 || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new sn0(sendIntent, 11);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            NewPremiumBusActivationBottomSheetContentKt.k(modifierAnimateContentSize$default, notFetched, z, (Function1) objRememberedValue, composerStartRestartGroup, 0);
            DividerKt.m1949Divider9IZ8Weo(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), ChaloTheme.b(composerStartRestartGroup, 0).f, ChaloTheme.a(composerStartRestartGroup, 0).A, composerStartRestartGroup, 6, 0);
            d(composerStartRestartGroup, 0, str == null ? "" : str);
            if (NewPremiumBusReserveTicketActivationContractKt.b(list)) {
                composerStartRestartGroup.startReplaceGroup(858902843);
                Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null);
                MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(arrangement.getStart(), companion2.getTop(), composerStartRestartGroup, 0);
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
                composerStartRestartGroup.startReplaceGroup(399595573);
                for (PBStopImagesDetails pBStopImagesDetails : list) {
                    Modifier modifierM788paddingqDBjuR0$default = PaddingKt.m788paddingqDBjuR0$default(Modifier.INSTANCE, ChaloTheme.b(composerStartRestartGroup, 0).h, 0.0f, ChaloTheme.b(composerStartRestartGroup, 0).h, ChaloTheme.b(composerStartRestartGroup, 0).h, 2, null);
                    boolean z3 = i4 == 32;
                    Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                    if (z3 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue2 = new sn0(sendIntent, 12);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                    }
                    PBStopImageKt.a(modifierM788paddingqDBjuR0$default, pBStopImagesDetails, (Function1) objRememberedValue2, composerStartRestartGroup, 0);
                }
                composerStartRestartGroup.endReplaceGroup();
                composerStartRestartGroup.endNode();
            } else {
                composerStartRestartGroup.startReplaceGroup(841770290);
            }
            composerStartRestartGroup.endReplaceGroup();
            if (state.d == null || state.b == null || str == null) {
                composerStartRestartGroup.startReplaceGroup(841770290);
            } else {
                composerStartRestartGroup.startReplaceGroup(859906623);
                DividerKt.m1949Divider9IZ8Weo(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), ChaloTheme.b(composerStartRestartGroup, 0).f, ChaloTheme.a(composerStartRestartGroup, 0).A, composerStartRestartGroup, 6, 0);
                String str2 = state.d;
                String str3 = state.b;
                String str4 = state.c;
                String str5 = state.i;
                Integer num = state.r;
                boolean z4 = i4 == 32;
                Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                if (z4 || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue3 = new fq0(sendIntent, 17);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                }
                NewPremiumBusActivationBottomSheetContentKt.l(str2, str3, str4, str5, num, (Function0) objRememberedValue3, state.g, composerStartRestartGroup, 0);
                composerStartRestartGroup = composerStartRestartGroup;
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
            scopeUpdateScopeEndRestartGroup.updateScope(new eq0(state, sendIntent, i, 8));
        }
    }

    public static final void c(int i, Composer composer, Modifier modifier, NewPremiumBusReserveTicketActivationState state, Function1 sendIntent) {
        Modifier modifier2;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        an0 an0Var;
        Intrinsics.i(state, "state");
        Intrinsics.i(sendIntent, "sendIntent");
        Composer composerStartRestartGroup = composer.startRestartGroup(-336815857);
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
                ComposerKt.traceEventStart(-336815857, i2, -1, "app.chalo.premiumbus.prebookedtickets.newactivation.PostValidationScreen (PostValidationScreen.kt:75)");
            }
            if (state.J != null) {
                composerStartRestartGroup.startReplaceGroup(-1037331223);
                g(state.J, state.v, state.E, sendIntent, companion, state.d, state.b, state.c, state.i, state.r, state.g, composerStartRestartGroup, ((i2 << 3) & 7168) | ((i2 << 12) & 57344), 0);
                composerStartRestartGroup.endReplaceGroup();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                } else {
                    an0Var = new an0(companion, state, sendIntent, i, 4);
                }
            } else {
                composerStartRestartGroup.startReplaceGroup(-1041766765);
                composerStartRestartGroup.endReplaceGroup();
                Modifier modifierFillMaxSize$default = SizeKt.fillMaxSize$default(companion, 0.0f, 1, null);
                Alignment.Companion companion2 = Alignment.INSTANCE;
                MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), companion2.getCenterHorizontally(), composerStartRestartGroup, 48);
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
                List listS = CollectionsKt.S(PremiumBusPostBoardingDetailsTab.TRIP_DETAILS, PremiumBusPostBoardingDetailsTab.ROUTE);
                Object objRememberedValue = composerStartRestartGroup.rememberedValue();
                Composer.Companion companion4 = Composer.INSTANCE;
                if (objRememberedValue == companion4.getEmpty()) {
                    objRememberedValue = EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.f17583a, composerStartRestartGroup);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                CoroutineScope coroutineScope = (CoroutineScope) objRememberedValue;
                Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue2 == companion4.getEmpty()) {
                    objRememberedValue2 = new af(listS, 12);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                }
                PagerState pagerStateRememberPagerState = PagerStateKt.rememberPagerState(0, 0.0f, (Function0) objRememberedValue2, composerStartRestartGroup, 384, 3);
                PremiumBusBookingTripTimeInfoState premiumBusBookingTripTimeInfoState = state.e;
                if (premiumBusBookingTripTimeInfoState == null) {
                    premiumBusBookingTripTimeInfoState = PremiumBusBookingTripTimeInfoState.NotFetched.b;
                }
                NewPremiumBusActivationBottomSheetContentKt.g(state.C, state.D, premiumBusBookingTripTimeInfoState, state.h, NewPremiumReserveTicketDetailsScreenType.POST_VALIDATION, AnimationModifierKt.animateContentSize$default(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), null, null, 3, null), state.y, state.z, state.A, state.B, state.E, state.n, composerStartRestartGroup, 24576, 0);
                DividerKt.m1950HorizontalDivider9IZ8Weo(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), ChaloTheme.b(composerStartRestartGroup, 0).f, ChaloTheme.a(composerStartRestartGroup, 0).A, composerStartRestartGroup, 6, 0);
                ChaloSpacersKt.o(composerStartRestartGroup, 0);
                f(54, pagerStateRememberPagerState, composerStartRestartGroup, SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), listS, coroutineScope);
                PagerKt.m1020HorizontalPager8jOkeI(pagerStateRememberPagerState, null, null, null, 0, 0.0f, companion2.getTop(), null, false, false, null, null, null, null, ComposableLambdaKt.rememberComposableLambda(-439995578, true, new q80(2, listS, state, sendIntent), composerStartRestartGroup, 54), composerStartRestartGroup, 1572864, 24576, 16318);
                composerStartRestartGroup = composerStartRestartGroup;
                composerStartRestartGroup.endNode();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier2 = companion;
            }
            scopeUpdateScopeEndRestartGroup.updateScope(an0Var);
        }
        composerStartRestartGroup.skipToGroupEnd();
        modifier2 = modifier;
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            an0Var = new an0(modifier2, state, sendIntent, i, 5);
            scopeUpdateScopeEndRestartGroup.updateScope(an0Var);
        }
    }

    public static final void d(Composer composer, int i, String str) {
        int i2;
        Composer composer2;
        String str2 = str;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1810356784);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changed(str2) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (composerStartRestartGroup.shouldExecute((i2 & 3) != 2, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1810356784, i2, -1, "app.chalo.premiumbus.prebookedtickets.newactivation.PremiumBusActivationDropOffDetails (PostValidationScreen.kt:458)");
            }
            Modifier.Companion companion = Modifier.INSTANCE;
            Modifier modifierM784padding3ABfNKs = PaddingKt.m784padding3ABfNKs(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), ChaloTheme.b(composerStartRestartGroup, 0).h);
            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composerStartRestartGroup, 0);
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
            String strC = StringResourcesHelperKt.c(StringEnum.DROP_OFF, new Object[0], composerStartRestartGroup, 6);
            long j = ChaloTheme.a(composerStartRestartGroup, 0).i;
            TextStyle bodySmall = ChaloTheme.e(composerStartRestartGroup, 0).getBodySmall();
            TextOverflow.Companion companion3 = TextOverflow.INSTANCE;
            TextKt.m2623TextNvy7gAk(strC, null, j, null, 0L, null, null, null, 0L, null, null, 0L, companion3.m7226getEllipsisgIe3tQ8(), false, 0, 0, null, bodySmall, composerStartRestartGroup, 0, 384, 126970);
            SpacerKt.Spacer(SizeKt.m814height3ABfNKs(companion, ChaloTheme.b(composerStartRestartGroup, 0).d), composerStartRestartGroup, 0);
            composer2 = composerStartRestartGroup;
            str2 = str;
            TextKt.m2623TextNvy7gAk(str2, null, ChaloTheme.a(composerStartRestartGroup, 0).e, null, 0L, null, null, null, 0L, null, null, 0L, companion3.m7226getEllipsisgIe3tQ8(), false, 3, 0, null, ChaloTypographyKt.a(ChaloTheme.e(composerStartRestartGroup, 0).getHeadlineSmall()), composer2, i2 & 14, 24960, 110586);
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
            scopeUpdateScopeEndRestartGroup.updateScope(new qg(str2, i, 16));
        }
    }

    public static final void e(Modifier modifier, StopLiveEtaUiModel stopLiveEtaUiModel, boolean z, Composer composer, int i, int i2) {
        Modifier modifier2;
        int i3;
        Modifier modifier3;
        Composer composerStartRestartGroup = composer.startRestartGroup(246919651);
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 6;
            modifier2 = modifier;
        } else if ((i & 6) == 0) {
            modifier2 = modifier;
            i3 = (composerStartRestartGroup.changed(modifier2) ? 4 : 2) | i;
        } else {
            modifier2 = modifier;
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= (i & 64) == 0 ? composerStartRestartGroup.changed(stopLiveEtaUiModel) : composerStartRestartGroup.changedInstance(stopLiveEtaUiModel) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= composerStartRestartGroup.changed(z) ? 256 : 128;
        }
        if (composerStartRestartGroup.shouldExecute((i3 & 147) != 146, i3 & 1)) {
            Modifier modifier4 = i4 != 0 ? Modifier.INSTANCE : modifier2;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(246919651, i3, -1, "app.chalo.premiumbus.prebookedtickets.newactivation.PremiumBusActivationStopEta (PostValidationScreen.kt:561)");
            }
            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composerStartRestartGroup, 0);
            long currentCompositeKeyHashCode = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
            int i5 = (int) ((currentCompositeKeyHashCode >>> 32) ^ currentCompositeKeyHashCode);
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifier4);
            ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor = companion.getConstructor();
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
            pk0.v(companion, composerM3915constructorimpl, measurePolicyColumnMeasurePolicy, composerM3915constructorimpl, currentCompositionLocalMap);
            Updater.m3923setimpl(composerM3915constructorimpl, modifierMaterializeModifier, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion, composerM3915constructorimpl, Integer.valueOf(i5), composerM3915constructorimpl));
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
            if (stopLiveEtaUiModel.equals(StopLiveEtaUiModel.AllBusPassedStop.f4375a)) {
                composerStartRestartGroup.startReplaceGroup(678769732);
                modifier3 = modifier4;
                TextKt.m2623TextNvy7gAk(StringResourcesHelperKt.c(StringEnum.ROUTE_DETAILS_BUS_PASSED_STOP, new Object[0], composerStartRestartGroup, 6), null, ChaloTheme.a(composerStartRestartGroup, 0).i, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ChaloTheme.e(composerStartRestartGroup, 0).getBodySmall(), composerStartRestartGroup, 0, 0, 131066);
                composerStartRestartGroup = composerStartRestartGroup;
                composerStartRestartGroup.endReplaceGroup();
            } else {
                modifier3 = modifier4;
                Long lValueOf = null;
                if (stopLiveEtaUiModel.equals(StopLiveEtaUiModel.EtaFetchInProgress.f4376a)) {
                    composerStartRestartGroup.startReplaceGroup(679070742);
                    if (z) {
                        composerStartRestartGroup.startReplaceGroup(679126201);
                        TextKt.m2623TextNvy7gAk(StringResourcesHelperKt.c(StringEnum.FETCHING, new Object[0], composerStartRestartGroup, 6), null, ChaloTheme.a(composerStartRestartGroup, 0).f1915a, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ChaloTheme.e(composerStartRestartGroup, 0).getHeadlineSmall(), composerStartRestartGroup, 0, 0, 131066);
                        composerStartRestartGroup = composerStartRestartGroup;
                        composerStartRestartGroup.endReplaceGroup();
                    } else {
                        composerStartRestartGroup.startReplaceGroup(679382633);
                        ShimmerViewsKt.a(null, composerStartRestartGroup, 0);
                        composerStartRestartGroup.endReplaceGroup();
                    }
                    composerStartRestartGroup.endReplaceGroup();
                } else if (stopLiveEtaUiModel.equals(StopLiveEtaUiModel.NotAvailable.f4377a)) {
                    composerStartRestartGroup.startReplaceGroup(679531960);
                    TextKt.m2623TextNvy7gAk(StringResourcesHelperKt.c(StringEnum.ROUTE_DETAILS_LIVE_TRACKING_NOT_AVAILABLE, new Object[0], composerStartRestartGroup, 6), null, ChaloTheme.a(composerStartRestartGroup, 0).i, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ChaloTheme.e(composerStartRestartGroup, 0).getBodySmall(), composerStartRestartGroup, 0, 0, 131066);
                    composerStartRestartGroup = composerStartRestartGroup;
                    composerStartRestartGroup.endReplaceGroup();
                } else if (stopLiveEtaUiModel instanceof StopLiveEtaUiModel.WithEtaAvailable.EstimatedEta) {
                    composerStartRestartGroup.startReplaceGroup(679854143);
                    EstimatedStopEtaUiModel estimatedStopEtaUiModel = (EstimatedStopEtaUiModel) CollectionsKt.F(((StopLiveEtaUiModel.WithEtaAvailable.EstimatedEta) stopLiveEtaUiModel).f4380a);
                    StopEtasKt.b(estimatedStopEtaUiModel.f4366a, estimatedStopEtaUiModel.b, composerStartRestartGroup, 0);
                    composerStartRestartGroup.endReplaceGroup();
                } else if (stopLiveEtaUiModel instanceof StopLiveEtaUiModel.WithEtaAvailable.FixedEta) {
                    composerStartRestartGroup.startReplaceGroup(680213836);
                    FixedStopEtaUiModel fixedStopEtaUiModel = (FixedStopEtaUiModel) CollectionsKt.F(((StopLiveEtaUiModel.WithEtaAvailable.FixedEta) stopLiveEtaUiModel).f4381a);
                    LiveBusDelayedState liveBusDelayedState = fixedStopEtaUiModel.d;
                    if (liveBusDelayedState instanceof LiveBusDelayedState.Delayed) {
                        lValueOf = Long.valueOf(((LiveBusDelayedState.Delayed) liveBusDelayedState).f1877a);
                    } else if (!Intrinsics.d(liveBusDelayedState, LiveBusDelayedState.NotDelayed.f1878a)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    if (fixedStopEtaUiModel.b) {
                        composerStartRestartGroup.startReplaceGroup(680546745);
                        TextKt.m2623TextNvy7gAk(StringResourcesHelperKt.c(StringEnum.BUS_IS_HALTED_WE_ALL_GET_MOVING_SOON, new Object[0], composerStartRestartGroup, 6), null, 0L, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ChaloTheme.e(composerStartRestartGroup, 0).getBodySmall(), composerStartRestartGroup, 0, 0, 131070);
                        composerStartRestartGroup = composerStartRestartGroup;
                        composerStartRestartGroup.endReplaceGroup();
                    } else {
                        composerStartRestartGroup.startReplaceGroup(680803456);
                        String str = fixedStopEtaUiModel.f4368a;
                        SeatAvailabilityLevel seatAvailabilityLevel = SeatAvailabilityLevel.UNKNOWN;
                        Object objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = new wb(8);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        StopEtasKt.d(str, false, seatAvailabilityLevel, lValueOf, z, false, (Function0) objRememberedValue, composerStartRestartGroup, ((i3 << 9) & 458752) | 114822576, 6);
                        composerStartRestartGroup.endReplaceGroup();
                    }
                    composerStartRestartGroup.endReplaceGroup();
                } else if (stopLiveEtaUiModel instanceof StopLiveEtaUiModel.SpecificScheduledTime) {
                    composerStartRestartGroup.startReplaceGroup(681509264);
                    SpacerKt.Spacer(SizeKt.m814height3ABfNKs(Modifier.INSTANCE, ChaloTheme.b(composerStartRestartGroup, 0).c), composerStartRestartGroup, 0);
                    TextKt.m2623TextNvy7gAk(((StopLiveEtaUiModel.SpecificScheduledTime) stopLiveEtaUiModel).f4378a, null, 0L, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ChaloTheme.e(composerStartRestartGroup, 0).getHeadlineSmall(), composerStartRestartGroup, 0, 0, 131070);
                    composerStartRestartGroup = composerStartRestartGroup;
                    composerStartRestartGroup.endReplaceGroup();
                } else {
                    if (!stopLiveEtaUiModel.equals(StopLiveEtaUiModel.Unknown.f4379a)) {
                        throw pk0.p(composerStartRestartGroup, 298990540);
                    }
                    composerStartRestartGroup.startReplaceGroup(681792263);
                    composerStartRestartGroup.endReplaceGroup();
                }
            }
            composerStartRestartGroup.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
            modifier3 = modifier2;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new b9(modifier3, stopLiveEtaUiModel, z, i, i2, 5));
        }
    }

    public static final void f(int i, PagerState pagerState, Composer composer, Modifier modifier, List tabList, CoroutineScope scope) {
        int i2;
        Intrinsics.i(tabList, "tabList");
        Intrinsics.i(pagerState, "pagerState");
        Intrinsics.i(scope, "scope");
        Composer composerStartRestartGroup = composer.startRestartGroup(740251020);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changed(modifier) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(tabList) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= composerStartRestartGroup.changed(pagerState) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(scope) ? 2048 : 1024;
        }
        if (composerStartRestartGroup.shouldExecute((i2 & 1171) != 1170, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(740251020, i2, -1, "app.chalo.premiumbus.prebookedtickets.newactivation.PremiumBusPostBoardingDetailsTabs (PostValidationScreen.kt:359)");
            }
            composerStartRestartGroup.startReplaceGroup(-1583334052);
            List list = tabList;
            ArrayList arrayList = new ArrayList(CollectionsKt.v(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(StringResourcesHelperKt.c(((PremiumBusPostBoardingDetailsTab) it.next()).getTitleRes(), new Object[0], composerStartRestartGroup, 0));
            }
            composerStartRestartGroup.endReplaceGroup();
            int i3 = i2 >> 3;
            ChaloScrollableTabRowKt.a(arrayList, pagerState, scope, modifier, 0.0f, ComposableLambdaKt.rememberComposableLambda(-1468996572, true, new wo0(pagerState, 2), composerStartRestartGroup, 54), composerStartRestartGroup, (i3 & 896) | (i3 & 112) | ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE | ((i2 << 9) & 7168), 16);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new r80(modifier, tabList, pagerState, scope, i, 2));
        }
    }

    public static final void g(List vehicleBreakDownUpcomingTrips, List dropOffStopImageDetails, List tripCommunicationBanners, Function1 sendIntent, Modifier modifier, String str, String str2, String str3, String str4, Integer num, PremiumBusPostBookingStopSchedule pickupStopScheduleTime, Composer composer, int i, int i2) {
        int i3;
        int i4;
        int i5;
        Intrinsics.i(vehicleBreakDownUpcomingTrips, "vehicleBreakDownUpcomingTrips");
        Intrinsics.i(dropOffStopImageDetails, "dropOffStopImageDetails");
        Intrinsics.i(tripCommunicationBanners, "tripCommunicationBanners");
        Intrinsics.i(sendIntent, "sendIntent");
        Intrinsics.i(pickupStopScheduleTime, "pickupStopScheduleTime");
        Composer composerStartRestartGroup = composer.startRestartGroup(1025493221);
        if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changedInstance(vehicleBreakDownUpcomingTrips) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(dropOffStopImageDetails) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(tripCommunicationBanners) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(sendIntent) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i3 |= composerStartRestartGroup.changed(modifier) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i3 |= composerStartRestartGroup.changed(str) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            i3 |= composerStartRestartGroup.changed(str2) ? 1048576 : 524288;
        }
        if ((12582912 & i) == 0) {
            i3 |= composerStartRestartGroup.changed(str3) ? 8388608 : 4194304;
        }
        if ((100663296 & i) == 0) {
            i3 |= composerStartRestartGroup.changed(str4) ? AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL : 33554432;
        }
        if ((i & 805306368) == 0) {
            i3 |= composerStartRestartGroup.changed(num) ? 536870912 : 268435456;
        }
        if ((i2 & 6) == 0) {
            i4 = i2 | (composerStartRestartGroup.changed(pickupStopScheduleTime) ? 4 : 2);
        } else {
            i4 = i2;
        }
        if (composerStartRestartGroup.shouldExecute(((i3 & 306783379) == 306783378 && (i4 & 3) == 2) ? false : true, i3 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1025493221, i3, i4, "app.chalo.premiumbus.prebookedtickets.newactivation.VehicleBreakdownScreen (PostValidationScreen.kt:181)");
            }
            Modifier modifierFillMaxSize$default = SizeKt.fillMaxSize$default(modifier, 0.0f, 1, null);
            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composerStartRestartGroup, 0);
            long currentCompositeKeyHashCode = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
            int i6 = (int) (currentCompositeKeyHashCode ^ (currentCompositeKeyHashCode >>> 32));
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierFillMaxSize$default);
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
            Updater.m3923setimpl(composerM3915constructorimpl, modifierMaterializeModifier, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion, composerM3915constructorimpl, Integer.valueOf(i6), composerM3915constructorimpl));
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
            ChaloSpacersKt.m(composerStartRestartGroup, 0);
            Throwable th = null;
            int i7 = 2;
            int i8 = i4;
            TextKt.m2623TextNvy7gAk(StringResourcesHelperKt.c(StringEnum.BUS_HAS_BROKEN_DOWN, new Object[0], composerStartRestartGroup, 6), PaddingKt.m786paddingVpY3zN4$default(Modifier.INSTANCE, ChaloThemeHelper.a().h, 0.0f, 2, null), ChaloTheme.a(composerStartRestartGroup, 0).t0, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ChaloTypographyKt.a(ChaloTypographyKt.f(ChaloTheme.e(composerStartRestartGroup, 0))), composerStartRestartGroup, 0, 0, 131064);
            Composer composer2 = composerStartRestartGroup;
            ChaloSpacersKt.p(composer2, 0);
            composer2.startReplaceGroup(-1057596381);
            Iterator it = tripCommunicationBanners.iterator();
            int i9 = 0;
            while (it.hasNext()) {
                Object next = it.next();
                int i10 = i9 + 1;
                if (i9 < 0) {
                    Throwable th2 = th;
                    CollectionsKt.z0();
                    throw th2;
                }
                TripCommunicationAppModel tripCommunicationAppModel = (TripCommunicationAppModel) next;
                Throwable th3 = th;
                Iterator it2 = it;
                Composer composer3 = composer2;
                PremiumBusTrackingStateKt.a(PaddingKt.m786paddingVpY3zN4$default(Modifier.INSTANCE, ChaloThemeHelper.a().h, 0.0f, i7, th), PremiumBusTripInfoContractKt.b(tripCommunicationAppModel.b), tripCommunicationAppModel.f7126a, ChaloTheme.a(composer2, 0).t0, ChaloTheme.a(composer2, 0).t0, composer3, 0, 0);
                composer2 = composer3;
                if (i9 != tripCommunicationBanners.size() - 1) {
                    composer2.startReplaceGroup(1045559143);
                    ChaloSpacersKt.m(composer2, 0);
                } else {
                    composer2.startReplaceGroup(1036184929);
                }
                composer2.endReplaceGroup();
                i9 = i10;
                th = th3;
                it = it2;
                i7 = 2;
            }
            Throwable th4 = th;
            composer2.endReplaceGroup();
            if (tripCommunicationBanners.isEmpty()) {
                composer2.startReplaceGroup(1565383443);
            } else {
                composer2.startReplaceGroup(1574875457);
                ChaloSpacersKt.p(composer2, 0);
            }
            composer2.endReplaceGroup();
            if (vehicleBreakDownUpcomingTrips.isEmpty()) {
                i5 = 0;
                composer2.startReplaceGroup(1565383443);
            } else {
                composer2.startReplaceGroup(1575024536);
                Composer composer4 = composer2;
                ChaloRoundedCardKt.b(PaddingKt.m786paddingVpY3zN4$default(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, th4), ChaloTheme.b(composer2, 0).h, 0.0f, 2, th4), ChaloThemeKt.d(ChaloThemeHelper.d.g), 0.0f, 0.0f, ComposableLambdaKt.rememberComposableLambda(357549214, true, new si0(vehicleBreakDownUpcomingTrips, 2), composer2, 54), composer4, 24576, 12);
                composer2 = composer4;
                i5 = 0;
                ChaloSpacersKt.o(composer2, 0);
            }
            composer2.endReplaceGroup();
            Modifier.Companion companion2 = Modifier.INSTANCE;
            Composer composer5 = composer2;
            DividerKt.m1950HorizontalDivider9IZ8Weo(SizeKt.fillMaxWidth$default(companion2, 0.0f, 1, null), ChaloTheme.b(composer2, i5).f, ChaloTheme.a(composer2, i5).A, composer5, 6, 0);
            composerStartRestartGroup = composer5;
            d(composerStartRestartGroup, i5, str3 == null ? "" : str3);
            if (NewPremiumBusReserveTicketActivationContractKt.b(dropOffStopImageDetails)) {
                composerStartRestartGroup.startReplaceGroup(1576702690);
                Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(companion2, 0.0f, 1, null);
                MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), Alignment.INSTANCE.getTop(), composerStartRestartGroup, i5);
                long currentCompositeKeyHashCode2 = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, i5);
                int i11 = (int) (currentCompositeKeyHashCode2 ^ (currentCompositeKeyHashCode2 >>> 32));
                CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierFillMaxWidth$default);
                ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
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
                Updater.m3923setimpl(composerM3915constructorimpl2, modifierMaterializeModifier2, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion3, composerM3915constructorimpl2, Integer.valueOf(i11), composerM3915constructorimpl2));
                RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
                composerStartRestartGroup.startReplaceGroup(-895638146);
                Iterator it3 = dropOffStopImageDetails.iterator();
                while (it3.hasNext()) {
                    PBStopImagesDetails pBStopImagesDetails = (PBStopImagesDetails) it3.next();
                    Modifier modifierM788paddingqDBjuR0$default = PaddingKt.m788paddingqDBjuR0$default(Modifier.INSTANCE, ChaloTheme.b(composerStartRestartGroup, 0).h, 0.0f, ChaloTheme.b(composerStartRestartGroup, 0).h, ChaloTheme.b(composerStartRestartGroup, 0).h, 2, null);
                    boolean z = (i3 & 7168) == 2048;
                    Object objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (z || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue = new sn0(sendIntent, 13);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    PBStopImageKt.a(modifierM788paddingqDBjuR0$default, pBStopImagesDetails, (Function1) objRememberedValue, composerStartRestartGroup, 0);
                }
                composerStartRestartGroup.endReplaceGroup();
                composerStartRestartGroup.endNode();
            } else {
                composerStartRestartGroup.startReplaceGroup(1565383443);
            }
            composerStartRestartGroup.endReplaceGroup();
            if (str == null || str2 == null || str3 == null) {
                composerStartRestartGroup.startReplaceGroup(1565383443);
            } else {
                composerStartRestartGroup.startReplaceGroup(1577682042);
                boolean z2 = false;
                DividerKt.m1950HorizontalDivider9IZ8Weo(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), ChaloTheme.b(composerStartRestartGroup, 0).f, ChaloTheme.a(composerStartRestartGroup, 0).A, composerStartRestartGroup, 6, 0);
                if ((i3 & 7168) == 2048) {
                    composerStartRestartGroup = composerStartRestartGroup;
                    z2 = true;
                }
                composerStartRestartGroup = composerStartRestartGroup;
                Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                if (z2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue2 = new fq0(sendIntent, 18);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                }
                NewPremiumBusActivationBottomSheetContentKt.l(str, str2, str3, str4, num, (Function0) objRememberedValue2, pickupStopScheduleTime, composerStartRestartGroup, ((i3 >> 15) & WavUtil.TYPE_WAVE_FORMAT_EXTENSIBLE) | ((i8 << 18) & 3670016));
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
            scopeUpdateScopeEndRestartGroup.updateScope(new d60(vehicleBreakDownUpcomingTrips, dropOffStopImageDetails, tripCommunicationBanners, sendIntent, modifier, str, str2, str3, str4, num, pickupStopScheduleTime, i, i2));
        }
    }

    public static final void h(String str, String str2, String str3, IconType iconType, Composer composer, int i) {
        int i2;
        Composer composer2;
        int i3;
        ComposeUiNode.Companion companion;
        Modifier.Companion companion2;
        int i4;
        Composer composerStartRestartGroup = composer.startRestartGroup(-539082521);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changed(str) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changed(str2) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= composerStartRestartGroup.changed(str3) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= composerStartRestartGroup.changed(iconType == null ? -1 : iconType.ordinal()) ? 2048 : 1024;
        }
        if (composerStartRestartGroup.shouldExecute((i2 & 1171) != 1170, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-539082521, i2, -1, "app.chalo.premiumbus.prebookedtickets.newactivation.VehicleBreakdownTripItem (PostValidationScreen.kt:302)");
            }
            Modifier.Companion companion3 = Modifier.INSTANCE;
            Modifier modifierM784padding3ABfNKs = PaddingKt.m784padding3ABfNKs(SizeKt.fillMaxWidth$default(companion3, 0.0f, 1, null), ChaloTheme.b(composerStartRestartGroup, 0).h);
            Alignment.Companion companion4 = Alignment.INSTANCE;
            Alignment.Vertical centerVertically = companion4.getCenterVertically();
            Arrangement arrangement = Arrangement.INSTANCE;
            MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(arrangement.getSpaceBetween(), centerVertically, composerStartRestartGroup, 54);
            long currentCompositeKeyHashCode = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
            int i5 = (int) (currentCompositeKeyHashCode ^ (currentCompositeKeyHashCode >>> 32));
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierM784padding3ABfNKs);
            ComposeUiNode.Companion companion5 = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor = companion5.getConstructor();
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
            pk0.v(companion5, composerM3915constructorimpl, measurePolicyRowMeasurePolicy, composerM3915constructorimpl, currentCompositionLocalMap);
            Updater.m3923setimpl(composerM3915constructorimpl, modifierMaterializeModifier, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion5, composerM3915constructorimpl, Integer.valueOf(i5), composerM3915constructorimpl));
            Modifier modifierA = i41.a(RowScopeInstance.INSTANCE, companion3, 1.0f, false, 2, null);
            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(arrangement.getTop(), companion4.getStart(), composerStartRestartGroup, 0);
            long currentCompositeKeyHashCode2 = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
            int i6 = (int) (currentCompositeKeyHashCode2 ^ (currentCompositeKeyHashCode2 >>> 32));
            CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierA);
            Function0<ComposeUiNode> constructor2 = companion5.getConstructor();
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
            pk0.v(companion5, composerM3915constructorimpl2, measurePolicyColumnMeasurePolicy, composerM3915constructorimpl2, currentCompositionLocalMap2);
            Updater.m3923setimpl(composerM3915constructorimpl2, modifierMaterializeModifier2, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion5, composerM3915constructorimpl2, Integer.valueOf(i6), composerM3915constructorimpl2));
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
            MeasurePolicy measurePolicyRowMeasurePolicy2 = RowKt.rowMeasurePolicy(arrangement.getStart(), companion4.getCenterVertically(), composerStartRestartGroup, 48);
            long currentCompositeKeyHashCode3 = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
            int i7 = (int) (currentCompositeKeyHashCode3 ^ (currentCompositeKeyHashCode3 >>> 32));
            CompositionLocalMap currentCompositionLocalMap3 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier3 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, companion3);
            Function0<ComposeUiNode> constructor3 = companion5.getConstructor();
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
            pk0.v(companion5, composerM3915constructorimpl3, measurePolicyRowMeasurePolicy2, composerM3915constructorimpl3, currentCompositionLocalMap3);
            Updater.m3923setimpl(composerM3915constructorimpl3, modifierMaterializeModifier3, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion5, composerM3915constructorimpl3, Integer.valueOf(i7), composerM3915constructorimpl3));
            Painter painterA = PainterResourceHelperKt.a(IconType.IC_CHALO_BUS, composerStartRestartGroup, 6);
            Modifier modifierM828size3ABfNKs = SizeKt.m828size3ABfNKs(companion3, ChaloTheme.b(composerStartRestartGroup, 0).h);
            long j = ChaloTheme.a(composerStartRestartGroup, 0).e;
            int i8 = Painter.$stable | 48;
            IconKt.m2070Iconww6aTOc(painterA, (String) null, modifierM828size3ABfNKs, j, composerStartRestartGroup, i8, 0);
            SpacerKt.Spacer(SizeKt.m833width3ABfNKs(companion3, ChaloTheme.b(composerStartRestartGroup, 0).d), composerStartRestartGroup, 0);
            TextKt.m2623TextNvy7gAk(str, null, ChaloTheme.a(composerStartRestartGroup, 0).e, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ChaloTypographyKt.a(ChaloTheme.e(composerStartRestartGroup, 0).getHeadlineSmall()), composerStartRestartGroup, i2 & 14, 0, 131066);
            Composer composer3 = composerStartRestartGroup;
            composer3.endNode();
            SpacerKt.Spacer(SizeKt.m814height3ABfNKs(companion3, ChaloTheme.b(composer3, 0).d), composer3, 0);
            if (str2 == null || str2.length() == 0) {
                i3 = i2;
                composer3.startReplaceGroup(-581258885);
                companion = companion5;
                companion2 = companion3;
                i4 = 0;
                TextKt.m2623TextNvy7gAk(StringResourcesHelperKt.c(StringEnum.NO_ETA_AVAILABLE, new Object[0], composer3, 6), null, ChaloTheme.a(composer3, 0).t0, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ChaloTheme.e(composer3, 0).getBodySmall(), composer3, 0, 0, 131066);
                composer3 = composer3;
                composer3.endReplaceGroup();
            } else {
                composer3.startReplaceGroup(-581350955);
                i3 = i2;
                ChaloEtaComponentKt.a(str2, null, null, composer3, (i2 >> 3) & 14, 6);
                composer3.endReplaceGroup();
                i4 = 0;
                companion = companion5;
                companion2 = companion3;
            }
            composer3.endNode();
            MeasurePolicy measurePolicyRowMeasurePolicy3 = RowKt.rowMeasurePolicy(arrangement.getStart(), companion4.getCenterVertically(), composer3, 48);
            long currentCompositeKeyHashCode4 = ComposablesKt.getCurrentCompositeKeyHashCode(composer3, i4);
            int i9 = (int) (currentCompositeKeyHashCode4 ^ (currentCompositeKeyHashCode4 >>> 32));
            CompositionLocalMap currentCompositionLocalMap4 = composer3.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier4 = ComposedModifierKt.materializeModifier(composer3, companion2);
            Function0<ComposeUiNode> constructor4 = companion.getConstructor();
            if (composer3.getApplier() == null) {
                ComposablesKt.invalidApplier();
            }
            composer3.startReusableNode();
            if (composer3.getInserting()) {
                composer3.createNode(constructor4);
            } else {
                composer3.useNode();
            }
            Composer composerM3915constructorimpl4 = Updater.m3915constructorimpl(composer3);
            pk0.v(companion, composerM3915constructorimpl4, measurePolicyRowMeasurePolicy3, composerM3915constructorimpl4, currentCompositionLocalMap4);
            Updater.m3923setimpl(composerM3915constructorimpl4, modifierMaterializeModifier4, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion, composerM3915constructorimpl4, Integer.valueOf(i9), composerM3915constructorimpl4));
            if (iconType == null) {
                composer3.startReplaceGroup(31716760);
                composer3.endReplaceGroup();
            } else {
                composer3.startReplaceGroup(31716761);
                Composer composer4 = composer3;
                ImageKt.Image(PainterResourceHelperKt.a(iconType, composer3, (i3 >> 9) & 14), (String) null, (Modifier) null, (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composer4, i8, 124);
                composer3 = composer4;
                nf1.t(companion2, ChaloTheme.b(composer3, i4).d, composer3, i4);
            }
            composer2 = composer3;
            TextKt.m2623TextNvy7gAk(str3, null, ChaloTheme.a(composer3, i4).t0, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ChaloTheme.e(composer3, i4).getBodySmall(), composer2, (i3 >> 6) & 14, 0, 131066);
            if (r1.k(composer2)) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer2 = composerStartRestartGroup;
            composer2.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new dt0(i, iconType, str, str2, str3));
        }
    }
}
