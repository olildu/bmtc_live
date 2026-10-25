package app.chalo.premiumbus.bulkbookingridedetails.ui;

import androidx.compose.animation.AnimationModifierKt;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.IntrinsicKt;
import androidx.compose.foundation.layout.IntrinsicSize;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material3.TextKt;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImplKt;
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
import androidx.media3.extractor.metadata.dvbsi.AppInfoTableDecoder;
import app.chalo.compose.ChaloEtaComponentKt;
import app.chalo.compose.components.ChaloRoundedCardKt;
import app.chalo.compose.components.ChaloSpacersKt;
import app.chalo.compose.components.PlotlineComposeWidgetKt;
import app.chalo.compose.components.buttons.ChaloFilledButtonKt;
import app.chalo.compose.resources.PainterResourceHelperKt;
import app.chalo.compose.resources.StringResourcesHelperKt;
import app.chalo.compose.theme.ChaloTheme;
import app.chalo.compose.theme.ChaloTypographyKt;
import app.chalo.premiumbus.bulkbookingridedetails.ui.ChaloBusActiveTicketKt;
import app.chalo.premiumbus.prebookedtickets.ui.activation.PremiumBusTripScheduleTagTextKt;
import app.chalo.premiumbus.prebookedtickets.ui.newactivation.NewPremiumReserveTicketDetailsScreenType;
import app.chalo.premiumbus.prebookedtickets.ui.newactivation.ticketinfohandler.PremiumBusBookingCardData;
import app.chalo.premiumbus.prebookedtickets.ui.newactivation.ticketinfohandler.PremiumBusBookingTripTimeInfoState;
import app.chalo.premiumbus.prebookedtickets.ui.newactivation.ticketinfohandler.PremiumBusBookingVehicleInfoState;
import app.chalo.premiumbus.prebookedtickets.ui.newactivation.ticketinfohandler.PremiumBusPostBookingStopSchedule;
import app.chalo.premiumbus.prebookedtickets.ui.newactivation.ticketinfohandler.PremiumBusTripInfoContractKt;
import app.chalo.premiumbus.prebookedtickets.ui.newactivation.ticketinfohandler.PremiumBusTripScheduleTag;
import app.chalo.premiumbus.prebookedtickets.ui.newactivation.ticketinfohandler.PremiumReserveTicketStopDirectionsInfoState;
import app.chalo.premiumbus.ui.stopselection.compose.FromAndToStopCardKt;
import app.chalo.providers.iconassetprovider.IconType;
import app.chalo.providers.stringprovider.StringEnum;
import defpackage.b3;
import defpackage.i41;
import defpackage.kg;
import defpackage.ma;
import defpackage.og;
import defpackage.pk0;
import defpackage.qg;
import defpackage.rg;
import defpackage.s4;
import defpackage.u6;
import defpackage.v;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.internal.ws.WebSocketProtocol;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"home_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class ChaloBusActiveTicketKt {

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f6904a;

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
            f6904a = iArr;
        }
    }

    public static final void a(Modifier modifier, NewPremiumReserveTicketDetailsScreenType newPremiumReserveTicketDetailsScreenType, Composer composer, int i) {
        Composer composer2;
        int i2;
        Modifier modifier2;
        String strC;
        Composer composerStartRestartGroup = composer.startRestartGroup(1453712992);
        int i3 = i | 6;
        if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changed(newPremiumReserveTicketDetailsScreenType.ordinal()) ? 32 : 16;
        }
        if (composerStartRestartGroup.shouldExecute((i3 & 19) != 18, i3 & 1)) {
            Modifier.Companion companion = Modifier.INSTANCE;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1453712992, i3, -1, "app.chalo.premiumbus.bulkbookingridedetails.ui.BusPassedPickupStopView (ChaloBusActiveTicket.kt:246)");
            }
            int i4 = WhenMappings.f6904a[newPremiumReserveTicketDetailsScreenType.ordinal()];
            if (i4 == 1) {
                composerStartRestartGroup.startReplaceGroup(1153821898);
                strC = StringResourcesHelperKt.c(StringEnum.PB_BUS_PASSED_PICKUP_STOP_INFO_MSG, new Object[0], composerStartRestartGroup, 6);
                composerStartRestartGroup.endReplaceGroup();
            } else {
                if (i4 != 2) {
                    throw pk0.p(composerStartRestartGroup, 1153819348);
                }
                composerStartRestartGroup.startReplaceGroup(1153826472);
                strC = StringResourcesHelperKt.c(StringEnum.PB_BUS_PASSED_DROP_STOP_INFO_MSG, new Object[0], composerStartRestartGroup, 6);
                composerStartRestartGroup.endReplaceGroup();
            }
            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composerStartRestartGroup, 0);
            long currentCompositeKeyHashCode = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
            int i5 = (int) (currentCompositeKeyHashCode ^ (currentCompositeKeyHashCode >>> 32));
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
            Updater.m3923setimpl(composerM3915constructorimpl, modifierMaterializeModifier, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion2, composerM3915constructorimpl, Integer.valueOf(i5), composerM3915constructorimpl));
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
            composer2 = composerStartRestartGroup;
            String str = strC;
            i2 = 0;
            TextKt.m2623TextNvy7gAk(StringResourcesHelperKt.c(StringEnum.BUS_HAS_PASSED_YOUR_STOP, new Object[0], composerStartRestartGroup, 6), null, ChaloTheme.a(composerStartRestartGroup, 0).e, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ChaloTheme.e(composerStartRestartGroup, 0).getHeadlineMedium(), composer2, 0, 0, 131066);
            ChaloSpacersKt.t(composer2, 0);
            TextKt.m2623TextNvy7gAk(str, null, ChaloTheme.a(composer2, 0).v0, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ChaloTheme.e(composer2, 0).getBodySmall(), composer2, 0, 0, 131066);
            composer2.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            modifier2 = companion;
        } else {
            composer2 = composerStartRestartGroup;
            i2 = 0;
            composer2.skipToGroupEnd();
            modifier2 = modifier;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new rg(modifier2, newPremiumReserveTicketDetailsScreenType, i, i2));
        }
    }

    public static final void b(Modifier modifier, PremiumBusBookingTripTimeInfoState tripTimeInfo, PremiumBusPostBookingStopSchedule stopScheduleTime, Composer composer, int i, int i2) {
        int i3;
        Intrinsics.i(tripTimeInfo, "tripTimeInfo");
        Intrinsics.i(stopScheduleTime, "stopScheduleTime");
        Composer composerStartRestartGroup = composer.startRestartGroup(-496502064);
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changed(modifier) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changed(tripTimeInfo) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= composerStartRestartGroup.changed(stopScheduleTime) ? 256 : 128;
        }
        if (composerStartRestartGroup.shouldExecute((i3 & 147) != 146, i3 & 1)) {
            if (i4 != 0) {
                modifier = Modifier.INSTANCE;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-496502064, i3, -1, "app.chalo.premiumbus.bulkbookingridedetails.ui.BusScheduleView (ChaloBusActiveTicket.kt:271)");
            }
            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composerStartRestartGroup, 0);
            long currentCompositeKeyHashCode = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
            int i5 = (int) (currentCompositeKeyHashCode ^ (currentCompositeKeyHashCode >>> 32));
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
            Updater.m3923setimpl(composerM3915constructorimpl, modifierMaterializeModifier, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion, composerM3915constructorimpl, Integer.valueOf(i5), composerM3915constructorimpl));
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
            if (stopScheduleTime.equals(PremiumBusPostBookingStopSchedule.NotApplicable.f7427a)) {
                composerStartRestartGroup.startReplaceGroup(-1770947274);
                Modifier.Companion companion2 = Modifier.INSTANCE;
                PremiumBusBookingCardKt.a(SizeKt.fillMaxWidth(companion2, 0.3f), 0.0f, composerStartRestartGroup, 6, 2);
                ChaloSpacersKt.t(composerStartRestartGroup, 0);
                PremiumBusBookingCardKt.a(SizeKt.fillMaxWidth(companion2, 0.4f), 0.0f, composerStartRestartGroup, 6, 2);
                composerStartRestartGroup.endReplaceGroup();
            } else if (stopScheduleTime instanceof PremiumBusPostBookingStopSchedule.ScheduleAvailable) {
                composerStartRestartGroup.startReplaceGroup(-1770512902);
                if (tripTimeInfo instanceof PremiumBusBookingTripTimeInfoState.ExpectedTime) {
                    composerStartRestartGroup.startReplaceGroup(-1770436425);
                    k(composerStartRestartGroup, 0, ((PremiumBusBookingTripTimeInfoState.ExpectedTime) tripTimeInfo).b);
                    composerStartRestartGroup.endReplaceGroup();
                } else if (tripTimeInfo.equals(PremiumBusBookingTripTimeInfoState.BusPassedPickupStop.b) || tripTimeInfo.equals(PremiumBusBookingTripTimeInfoState.LiveEtaNotAvailable.b) || tripTimeInfo.equals(PremiumBusBookingTripTimeInfoState.NotFetched.b)) {
                    composerStartRestartGroup.startReplaceGroup(-1770103857);
                    k(composerStartRestartGroup, 0, ((PremiumBusPostBookingStopSchedule.ScheduleAvailable) stopScheduleTime).f7428a);
                    composerStartRestartGroup.endReplaceGroup();
                } else {
                    if (!(tripTimeInfo instanceof PremiumBusBookingTripTimeInfoState.LiveEta)) {
                        throw pk0.p(composerStartRestartGroup, -611302648);
                    }
                    composerStartRestartGroup.startReplaceGroup(-1769918074);
                    composerStartRestartGroup.endReplaceGroup();
                }
                composerStartRestartGroup.endReplaceGroup();
            } else {
                if (!stopScheduleTime.equals(PremiumBusPostBookingStopSchedule.Unknown.f7429a)) {
                    throw pk0.p(composerStartRestartGroup, -611318590);
                }
                composerStartRestartGroup.startReplaceGroup(-1769811930);
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
            scopeUpdateScopeEndRestartGroup.updateScope(new v(modifier2, tripTimeInfo, stopScheduleTime, i, i2, 5));
        }
    }

    /* JADX WARN: Code duplicated, block: B:78:0x0111  */
    public static final void c(final PremiumBusBookingCardData premiumBusBookingCardData, final Modifier modifier, final Function0 onDirectionCtaClick, final Function0 onUseNowCtaClicked, final String str, final boolean z, Composer composer, final int i) {
        int i2;
        Composer composer2;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Function2<? super Composer, ? super Integer, Unit> function2;
        final String strC;
        final String str2;
        PremiumBusPostBookingStopSchedule premiumBusPostBookingStopSchedule;
        Intrinsics.i(onDirectionCtaClick, "onDirectionCtaClick");
        Intrinsics.i(onUseNowCtaClicked, "onUseNowCtaClicked");
        Composer composerStartRestartGroup = composer.startRestartGroup(-1510484600);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(premiumBusBookingCardData) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changed(modifier) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(onDirectionCtaClick) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(onUseNowCtaClicked) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= composerStartRestartGroup.changed(str) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= composerStartRestartGroup.changed(z) ? 131072 : 65536;
        }
        int i3 = i2;
        if (composerStartRestartGroup.shouldExecute((74899 & i3) != 74898, i3 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1510484600, i3, -1, "app.chalo.premiumbus.bulkbookingridedetails.ui.ChaloBusActiveTicket (ChaloBusActiveTicket.kt:59)");
            }
            final NewPremiumReserveTicketDetailsScreenType newPremiumReserveTicketDetailsScreenType = premiumBusBookingCardData.o;
            if (newPremiumReserveTicketDetailsScreenType == null) {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                final int i4 = 0;
                function2 = new Function2() { // from class: mg
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        switch (i4) {
                            case 0:
                                ((Integer) obj2).getClass();
                                ChaloBusActiveTicketKt.c(premiumBusBookingCardData, modifier, onDirectionCtaClick, onUseNowCtaClicked, str, z, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(i | 1));
                                break;
                            default:
                                ((Integer) obj2).getClass();
                                ChaloBusActiveTicketKt.c(premiumBusBookingCardData, modifier, onDirectionCtaClick, onUseNowCtaClicked, str, z, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(i | 1));
                                break;
                        }
                        return Unit.f17538a;
                    }
                };
            } else {
                int[] iArr = WhenMappings.f6904a;
                int i5 = iArr[newPremiumReserveTicketDetailsScreenType.ordinal()];
                if (i5 == 1) {
                    composerStartRestartGroup.startReplaceGroup(123260508);
                    strC = StringResourcesHelperKt.c(StringEnum.PICK_UP_FROM, new Object[0], composerStartRestartGroup, 6);
                    composerStartRestartGroup.endReplaceGroup();
                } else {
                    if (i5 != 2) {
                        throw pk0.p(composerStartRestartGroup, 123257934);
                    }
                    composerStartRestartGroup.startReplaceGroup(123264376);
                    strC = StringResourcesHelperKt.c(StringEnum.DROP_OFF, new Object[0], composerStartRestartGroup, 6);
                    composerStartRestartGroup.endReplaceGroup();
                }
                int i6 = iArr[newPremiumReserveTicketDetailsScreenType.ordinal()];
                if (i6 == 1) {
                    str2 = premiumBusBookingCardData.k;
                    if (str2 == null) {
                        str2 = "";
                    }
                } else {
                    if (i6 != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                    str2 = premiumBusBookingCardData.l;
                    if (str2 == null) {
                        str2 = "";
                    }
                }
                int i7 = iArr[newPremiumReserveTicketDetailsScreenType.ordinal()];
                if (i7 == 1) {
                    premiumBusPostBookingStopSchedule = premiumBusBookingCardData.f;
                } else {
                    if (i7 != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                    premiumBusPostBookingStopSchedule = premiumBusBookingCardData.g;
                }
                final PremiumBusPostBookingStopSchedule premiumBusPostBookingStopSchedule2 = premiumBusPostBookingStopSchedule;
                composer2 = composerStartRestartGroup;
                ChaloRoundedCardKt.b(modifier, null, 0.0f, 0.0f, ComposableLambdaKt.rememberComposableLambda(-2007714073, true, new Function3() { // from class: ng
                    @Override // kotlin.jvm.functions.Function3
                    public final Object invoke(Object obj, Object obj2, Object obj3) {
                        Object obj4;
                        ColumnScope ChaloRoundedCard = (ColumnScope) obj;
                        Composer composer3 = (Composer) obj2;
                        int iIntValue = ((Integer) obj3).intValue();
                        Intrinsics.i(ChaloRoundedCard, "$this$ChaloRoundedCard");
                        if (composer3.shouldExecute((iIntValue & 17) != 16, iIntValue & 1)) {
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-2007714073, iIntValue, -1, "app.chalo.premiumbus.bulkbookingridedetails.ui.ChaloBusActiveTicket.<anonymous> (ChaloBusActiveTicket.kt:77)");
                            }
                            Modifier.Companion companion = Modifier.INSTANCE;
                            Modifier modifierM786paddingVpY3zN4$default = PaddingKt.m786paddingVpY3zN4$default(AnimationModifierKt.animateContentSize$default(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), null, null, 3, null), 0.0f, ChaloTheme.b(composer3, 0).h, 1, null);
                            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composer3, 0);
                            long currentCompositeKeyHashCode = ComposablesKt.getCurrentCompositeKeyHashCode(composer3, 0);
                            int i8 = (int) (currentCompositeKeyHashCode ^ (currentCompositeKeyHashCode >>> 32));
                            CompositionLocalMap currentCompositionLocalMap = composer3.getCurrentCompositionLocalMap();
                            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composer3, modifierM786paddingVpY3zN4$default);
                            ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
                            Function0<ComposeUiNode> constructor = companion2.getConstructor();
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
                            pk0.v(companion2, composerM3915constructorimpl, measurePolicyColumnMeasurePolicy, composerM3915constructorimpl, currentCompositionLocalMap);
                            Updater.m3923setimpl(composerM3915constructorimpl, modifierMaterializeModifier, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion2, composerM3915constructorimpl, Integer.valueOf(i8), composerM3915constructorimpl));
                            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
                            PremiumBusBookingCardData premiumBusBookingCardData2 = premiumBusBookingCardData;
                            ChaloBusActiveTicketKt.e(premiumBusBookingCardData2.h, premiumBusPostBookingStopSchedule2, strC, str2, premiumBusBookingCardData2.n instanceof PremiumReserveTicketStopDirectionsInfoState.StopLocationAvailable, onDirectionCtaClick, newPremiumReserveTicketDetailsScreenType, AnimationModifierKt.animateContentSize$default(SizeKt.fillMaxWidth$default(PaddingKt.m786paddingVpY3zN4$default(companion, ChaloTheme.b(composer3, 0).h, 0.0f, 2, null), 0.0f, 1, null), null, null, 3, null), composer3, 0);
                            if (z) {
                                composer3.startReplaceGroup(964859462);
                                ChaloSpacersKt.m(composer3, 0);
                                obj4 = null;
                                ChaloBusActiveTicketKt.j(0, composer3, AnimationModifierKt.animateContentSize$default(SizeKt.fillMaxWidth$default(PaddingKt.m786paddingVpY3zN4$default(companion, ChaloTheme.b(composer3, 0).h, 0.0f, 2, null), 0.0f, 1, null), null, null, 3, null), premiumBusBookingCardData2.e);
                            } else {
                                obj4 = null;
                                composer3.startReplaceGroup(959851877);
                            }
                            composer3.endReplaceGroup();
                            ChaloSpacersKt.m(composer3, 0);
                            Modifier modifierM786paddingVpY3zN4$default2 = PaddingKt.m786paddingVpY3zN4$default(PlotlineComposeWidgetKt.a(companion, "PL_Track_Bus"), ChaloTheme.b(composer3, 0).h, 0.0f, 2, obj4);
                            String strC2 = str;
                            if (strC2 == null) {
                                composer3.startReplaceGroup(1416618220);
                                strC2 = StringResourcesHelperKt.c(StringEnum.SUMMARY, new Object[0], composer3, 6);
                            } else {
                                composer3.startReplaceGroup(1416617879);
                            }
                            composer3.endReplaceGroup();
                            Painter painterA = PainterResourceHelperKt.a(IconType.IC_ARROW_UP, composer3, 6);
                            Function0 function0 = onUseNowCtaClicked;
                            boolean zChanged = composer3.changed(function0);
                            Object objRememberedValue = composer3.rememberedValue();
                            if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue = new hb(function0, 11);
                                composer3.updateRememberedValue(objRememberedValue);
                            }
                            ChaloFilledButtonKt.c(strC2, modifierM786paddingVpY3zN4$default2, null, painterA, 0L, 0L, 0.0f, (Function0) objRememberedValue, composer3, Painter.$stable << 9, AppInfoTableDecoder.APPLICATION_INFORMATION_TABLE_ID);
                            composer3.endNode();
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        } else {
                            composer3.skipToGroupEnd();
                        }
                        return Unit.f17538a;
                    }
                }, composerStartRestartGroup, 54), composer2, ((i3 >> 3) & 14) | 24576, 14);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
            scopeUpdateScopeEndRestartGroup.updateScope(function2);
        }
        composer2 = composerStartRestartGroup;
        composer2.skipToGroupEnd();
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            final int i8 = 1;
            function2 = new Function2() { // from class: mg
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    switch (i8) {
                        case 0:
                            ((Integer) obj2).getClass();
                            ChaloBusActiveTicketKt.c(premiumBusBookingCardData, modifier, onDirectionCtaClick, onUseNowCtaClicked, str, z, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(i | 1));
                            break;
                        default:
                            ((Integer) obj2).getClass();
                            ChaloBusActiveTicketKt.c(premiumBusBookingCardData, modifier, onDirectionCtaClick, onUseNowCtaClicked, str, z, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(i | 1));
                            break;
                    }
                    return Unit.f17538a;
                }
            };
            scopeUpdateScopeEndRestartGroup.updateScope(function2);
        }
    }

    public static final void d(final PremiumBusBookingTripTimeInfoState premiumBusBookingTripTimeInfoState, Modifier modifier, Composer composer, final int i) {
        int i2;
        Composer composer2;
        final Modifier modifier2;
        String str;
        Composer composerStartRestartGroup = composer.startRestartGroup(-763448845);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changed(premiumBusBookingTripTimeInfoState) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        int i3 = i2 | 48;
        if (composerStartRestartGroup.shouldExecute((i3 & 19) != 18, i3 & 1)) {
            final Modifier.Companion companion = Modifier.INSTANCE;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-763448845, i3, -1, "app.chalo.premiumbus.bulkbookingridedetails.ui.ChaloBusBookingTripStatusComponent (ChaloBusActiveTicket.kt:404)");
            }
            if (premiumBusBookingTripTimeInfoState instanceof PremiumBusBookingTripTimeInfoState.LiveEta) {
                str = ((PremiumBusBookingTripTimeInfoState.LiveEta) premiumBusBookingTripTimeInfoState).c;
            } else {
                if (!Intrinsics.d(premiumBusBookingTripTimeInfoState, PremiumBusBookingTripTimeInfoState.BusPassedPickupStop.b) && !(premiumBusBookingTripTimeInfoState instanceof PremiumBusBookingTripTimeInfoState.ExpectedTime) && !Intrinsics.d(premiumBusBookingTripTimeInfoState, PremiumBusBookingTripTimeInfoState.NotFetched.b) && !Intrinsics.d(premiumBusBookingTripTimeInfoState, PremiumBusBookingTripTimeInfoState.LiveEtaNotAvailable.b)) {
                    throw new NoWhenBranchMatchedException();
                }
                str = null;
            }
            if (str == null) {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                    final int i4 = 0;
                    scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: lg
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            int i5 = i4;
                            Composer composer3 = (Composer) obj;
                            ((Integer) obj2).getClass();
                            switch (i5) {
                                case 0:
                                    ChaloBusActiveTicketKt.d(premiumBusBookingTripTimeInfoState, companion, composer3, RecomposeScopeImplKt.updateChangedFlags(i | 1));
                                    break;
                                default:
                                    ChaloBusActiveTicketKt.d(premiumBusBookingTripTimeInfoState, companion, composer3, RecomposeScopeImplKt.updateChangedFlags(i | 1));
                                    break;
                            }
                            return Unit.f17538a;
                        }
                    });
                    return;
                }
                return;
            }
            ChaloSpacersKt.t(composerStartRestartGroup, 0);
            MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), Alignment.INSTANCE.getTop(), composerStartRestartGroup, 48);
            long currentCompositeKeyHashCode = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
            int i5 = (int) (currentCompositeKeyHashCode ^ (currentCompositeKeyHashCode >>> 32));
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
            pk0.v(companion2, composerM3915constructorimpl, measurePolicyRowMeasurePolicy, composerM3915constructorimpl, currentCompositionLocalMap);
            Updater.m3923setimpl(composerM3915constructorimpl, modifierMaterializeModifier, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion2, composerM3915constructorimpl, Integer.valueOf(i5), composerM3915constructorimpl));
            RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
            ImageKt.Image(PainterResourceHelperKt.a(IconType.ALERT_ROUTESCREEN, composerStartRestartGroup, 6), "Alert", PaddingKt.m788paddingqDBjuR0$default(companion, 0.0f, ChaloTheme.b(composerStartRestartGroup, 0).d, 0.0f, 0.0f, 13, null), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composerStartRestartGroup, Painter.$stable | 48, 120);
            SpacerKt.Spacer(SizeKt.m833width3ABfNKs(companion, ChaloTheme.b(composerStartRestartGroup, 0).e), composerStartRestartGroup, 0);
            composer2 = composerStartRestartGroup;
            TextKt.m2623TextNvy7gAk(str, i41.a(rowScopeInstance, companion, 1.0f, false, 2, null), ChaloTheme.a(composerStartRestartGroup, 0).v0, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ChaloTheme.e(composerStartRestartGroup, 0).getBodySmall(), composer2, 0, 0, 131064);
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
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup2 = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup2 != null) {
            final int i6 = 1;
            scopeUpdateScopeEndRestartGroup2.updateScope(new Function2() { // from class: lg
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    int i7 = i6;
                    Composer composer3 = (Composer) obj;
                    ((Integer) obj2).getClass();
                    switch (i7) {
                        case 0:
                            ChaloBusActiveTicketKt.d(premiumBusBookingTripTimeInfoState, modifier2, composer3, RecomposeScopeImplKt.updateChangedFlags(i | 1));
                            break;
                        default:
                            ChaloBusActiveTicketKt.d(premiumBusBookingTripTimeInfoState, modifier2, composer3, RecomposeScopeImplKt.updateChangedFlags(i | 1));
                            break;
                    }
                    return Unit.f17538a;
                }
            });
        }
    }

    public static final void e(PremiumBusBookingTripTimeInfoState premiumBusBookingTripTimeInfoState, PremiumBusPostBookingStopSchedule premiumBusPostBookingStopSchedule, String str, String str2, boolean z, Function0 function0, NewPremiumReserveTicketDetailsScreenType newPremiumReserveTicketDetailsScreenType, Modifier modifier, Composer composer, int i) {
        PremiumBusBookingTripTimeInfoState premiumBusBookingTripTimeInfoState2;
        int i2;
        PremiumBusPostBookingStopSchedule premiumBusPostBookingStopSchedule2;
        Composer composerStartRestartGroup = composer.startRestartGroup(190012983);
        if ((i & 6) == 0) {
            premiumBusBookingTripTimeInfoState2 = premiumBusBookingTripTimeInfoState;
            i2 = (composerStartRestartGroup.changed(premiumBusBookingTripTimeInfoState2) ? 4 : 2) | i;
        } else {
            premiumBusBookingTripTimeInfoState2 = premiumBusBookingTripTimeInfoState;
            i2 = i;
        }
        if ((i & 48) == 0) {
            premiumBusPostBookingStopSchedule2 = premiumBusPostBookingStopSchedule;
            i2 |= composerStartRestartGroup.changed(premiumBusPostBookingStopSchedule2) ? 32 : 16;
        } else {
            premiumBusPostBookingStopSchedule2 = premiumBusPostBookingStopSchedule;
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
            i2 |= composerStartRestartGroup.changedInstance(function0) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            i2 |= composerStartRestartGroup.changed(newPremiumReserveTicketDetailsScreenType.ordinal()) ? 1048576 : 524288;
        }
        if ((12582912 & i) == 0) {
            i2 |= composerStartRestartGroup.changed(modifier) ? 8388608 : 4194304;
        }
        int i3 = i2;
        if (composerStartRestartGroup.shouldExecute((4793491 & i3) != 4793490, i3 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(190012983, i3, -1, "app.chalo.premiumbus.bulkbookingridedetails.ui.ChaloBusScheduleAndStopInfoComponent (ChaloBusActiveTicket.kt:133)");
            }
            Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(modifier, 0.0f, 1, null);
            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composerStartRestartGroup, 0);
            long currentCompositeKeyHashCode = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
            int i4 = (int) (currentCompositeKeyHashCode ^ (currentCompositeKeyHashCode >>> 32));
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierFillMaxWidth$default);
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
            Modifier.Companion companion2 = Modifier.INSTANCE;
            f(premiumBusPostBookingStopSchedule2, premiumBusBookingTripTimeInfoState2, newPremiumReserveTicketDetailsScreenType, BackgroundKt.m263backgroundbw27NRU(SizeKt.fillMaxWidth$default(companion2, 0.0f, 1, null), ChaloTheme.a(composerStartRestartGroup, 0).g0, RoundedCornerShapeKt.m1076RoundedCornerShapea9UjIt4$default(ChaloTheme.b(composerStartRestartGroup, 0).f, ChaloTheme.b(composerStartRestartGroup, 0).f, 0.0f, 0.0f, 12, null)), composerStartRestartGroup, ((i3 >> 3) & 14) | ((i3 << 3) & 112) | ((i3 >> 12) & 896));
            composerStartRestartGroup = composerStartRestartGroup;
            SpacerKt.Spacer(BackgroundKt.m264backgroundbw27NRU$default(PaddingKt.m786paddingVpY3zN4$default(SizeKt.fillMaxWidth$default(SizeKt.m814height3ABfNKs(companion2, ChaloTheme.b(composerStartRestartGroup, 0).b), 0.0f, 1, null), ChaloTheme.b(composerStartRestartGroup, 0).h, 0.0f, 2, null), ChaloTheme.a(composerStartRestartGroup, 0).I0, null, 2, null), composerStartRestartGroup, 0);
            h(str, str2, z, function0, BackgroundKt.m263backgroundbw27NRU(SizeKt.fillMaxWidth$default(companion2, 0.0f, 1, null), ChaloTheme.a(composerStartRestartGroup, 0).g0, RoundedCornerShapeKt.m1076RoundedCornerShapea9UjIt4$default(0.0f, 0.0f, ChaloTheme.b(composerStartRestartGroup, 0).f, ChaloTheme.b(composerStartRestartGroup, 0).f, 3, null)), composerStartRestartGroup, (i3 >> 6) & 8190);
            composerStartRestartGroup.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new og(premiumBusBookingTripTimeInfoState, premiumBusPostBookingStopSchedule, str, str2, z, function0, newPremiumReserveTicketDetailsScreenType, modifier, i));
        }
    }

    public static final void f(PremiumBusPostBookingStopSchedule premiumBusPostBookingStopSchedule, PremiumBusBookingTripTimeInfoState premiumBusBookingTripTimeInfoState, NewPremiumReserveTicketDetailsScreenType newPremiumReserveTicketDetailsScreenType, Modifier modifier, Composer composer, int i) {
        int i2;
        Composer composerStartRestartGroup = composer.startRestartGroup(2043488645);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changed(premiumBusPostBookingStopSchedule) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changed(premiumBusBookingTripTimeInfoState) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= composerStartRestartGroup.changed(newPremiumReserveTicketDetailsScreenType.ordinal()) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= composerStartRestartGroup.changed(modifier) ? 2048 : 1024;
        }
        if (composerStartRestartGroup.shouldExecute((i2 & 1171) != 1170, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(2043488645, i2, -1, "app.chalo.premiumbus.bulkbookingridedetails.ui.ChaloBusScheduledOnSection (ChaloBusActiveTicket.kt:184)");
            }
            g(premiumBusPostBookingStopSchedule, premiumBusBookingTripTimeInfoState, premiumBusBookingTripTimeInfoState.getF7414a(), newPremiumReserveTicketDetailsScreenType, PaddingKt.m784padding3ABfNKs(SizeKt.fillMaxWidth$default(modifier, 0.0f, 1, null), ChaloTheme.b(composerStartRestartGroup, 0).h), composerStartRestartGroup, (i2 & WebSocketProtocol.PAYLOAD_SHORT) | ((i2 << 3) & 7168));
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new u6(i, 4, premiumBusPostBookingStopSchedule, premiumBusBookingTripTimeInfoState, newPremiumReserveTicketDetailsScreenType, modifier));
        }
    }

    public static final void g(final PremiumBusPostBookingStopSchedule premiumBusPostBookingStopSchedule, PremiumBusBookingTripTimeInfoState premiumBusBookingTripTimeInfoState, final PremiumBusTripScheduleTag premiumBusTripScheduleTag, final NewPremiumReserveTicketDetailsScreenType newPremiumReserveTicketDetailsScreenType, final Modifier modifier, Composer composer, final int i) {
        int i2;
        PremiumBusTripScheduleTag premiumBusTripScheduleTag2;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Function2<? super Composer, ? super Integer, Unit> function2;
        final PremiumBusBookingTripTimeInfoState premiumBusBookingTripTimeInfoState2 = premiumBusBookingTripTimeInfoState;
        Composer composerStartRestartGroup = composer.startRestartGroup(1929820736);
        int currentMarker = composerStartRestartGroup.getCurrentMarker();
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changed(premiumBusPostBookingStopSchedule) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changed(premiumBusBookingTripTimeInfoState2) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= composerStartRestartGroup.changed(premiumBusTripScheduleTag == null ? -1 : premiumBusTripScheduleTag.ordinal()) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= composerStartRestartGroup.changed(newPremiumReserveTicketDetailsScreenType.ordinal()) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= composerStartRestartGroup.changed(modifier) ? 16384 : 8192;
        }
        if (composerStartRestartGroup.shouldExecute((i2 & 9363) != 9362, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1929820736, i2, -1, "app.chalo.premiumbus.bulkbookingridedetails.ui.ChaloBusScheduledOnSectionWithTag (ChaloBusActiveTicket.kt:203)");
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
            composerStartRestartGroup.startReplaceGroup(1752734489);
            if (premiumBusBookingTripTimeInfoState2 instanceof PremiumBusBookingTripTimeInfoState.BusPassedPickupStop) {
                composerStartRestartGroup.startReplaceGroup(1752779345);
                a(null, newPremiumReserveTicketDetailsScreenType, composerStartRestartGroup, (i2 >> 6) & 112);
                composerStartRestartGroup.endToMarker(currentMarker);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                final int i4 = 0;
                function2 = new Function2() { // from class: pg
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        switch (i4) {
                            case 0:
                                ((Integer) obj2).getClass();
                                ChaloBusActiveTicketKt.g(premiumBusPostBookingStopSchedule, premiumBusBookingTripTimeInfoState2, premiumBusTripScheduleTag, newPremiumReserveTicketDetailsScreenType, modifier, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(i | 1));
                                break;
                            default:
                                ((Integer) obj2).getClass();
                                ChaloBusActiveTicketKt.g(premiumBusPostBookingStopSchedule, premiumBusBookingTripTimeInfoState2, premiumBusTripScheduleTag, newPremiumReserveTicketDetailsScreenType, modifier, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(i | 1));
                                break;
                        }
                        return Unit.f17538a;
                    }
                };
            } else {
                premiumBusTripScheduleTag2 = premiumBusTripScheduleTag;
                composerStartRestartGroup.startReplaceGroup(1744030060);
                composerStartRestartGroup.endReplaceGroup();
                Modifier.Companion companion3 = Modifier.INSTANCE;
                Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(companion3, 0.0f, 1, null);
                MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(arrangement.getSpaceBetween(), companion.getTop(), composerStartRestartGroup, 6);
                long currentCompositeKeyHashCode2 = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
                int i5 = (int) (currentCompositeKeyHashCode2 ^ (currentCompositeKeyHashCode2 >>> 32));
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
                Updater.m3923setimpl(composerM3915constructorimpl2, modifierMaterializeModifier2, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion2, composerM3915constructorimpl2, Integer.valueOf(i5), composerM3915constructorimpl2));
                RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
                if (premiumBusBookingTripTimeInfoState2 instanceof PremiumBusBookingTripTimeInfoState.LiveEta) {
                    composerStartRestartGroup.startReplaceGroup(-299328906);
                    i(premiumBusBookingTripTimeInfoState2, newPremiumReserveTicketDetailsScreenType, null, composerStartRestartGroup, ((i2 >> 3) & 14) | ((i2 >> 6) & 112));
                    if (premiumBusTripScheduleTag2 == null) {
                        composerStartRestartGroup.startReplaceGroup(-299128492);
                    } else {
                        composerStartRestartGroup.startReplaceGroup(-299128491);
                        PremiumBusTripScheduleTagTextKt.a(premiumBusTripScheduleTag2, null, composerStartRestartGroup, 0);
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    composerStartRestartGroup.endReplaceGroup();
                } else {
                    composerStartRestartGroup.startReplaceGroup(-299599970);
                    b(i41.a(rowScopeInstance, companion3, 1.0f, false, 2, null), premiumBusBookingTripTimeInfoState2, premiumBusPostBookingStopSchedule, composerStartRestartGroup, ((i2 << 6) & 896) | (i2 & 112), 0);
                    premiumBusBookingTripTimeInfoState2 = premiumBusBookingTripTimeInfoState2;
                    ChaloSpacersKt.m(composerStartRestartGroup, 0);
                    composerStartRestartGroup.endReplaceGroup();
                }
                composerStartRestartGroup.endNode();
                d(premiumBusBookingTripTimeInfoState2, null, composerStartRestartGroup, (i2 >> 3) & 14);
                composerStartRestartGroup.endReplaceGroup();
                composerStartRestartGroup.endNode();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
            scopeUpdateScopeEndRestartGroup.updateScope(function2);
        }
        premiumBusTripScheduleTag2 = premiumBusTripScheduleTag;
        composerStartRestartGroup.skipToGroupEnd();
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            final int i6 = 1;
            final PremiumBusTripScheduleTag premiumBusTripScheduleTag3 = premiumBusTripScheduleTag2;
            function2 = new Function2() { // from class: pg
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    switch (i6) {
                        case 0:
                            ((Integer) obj2).getClass();
                            ChaloBusActiveTicketKt.g(premiumBusPostBookingStopSchedule, premiumBusBookingTripTimeInfoState2, premiumBusTripScheduleTag3, newPremiumReserveTicketDetailsScreenType, modifier, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(i | 1));
                            break;
                        default:
                            ((Integer) obj2).getClass();
                            ChaloBusActiveTicketKt.g(premiumBusPostBookingStopSchedule, premiumBusBookingTripTimeInfoState2, premiumBusTripScheduleTag3, newPremiumReserveTicketDetailsScreenType, modifier, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(i | 1));
                            break;
                    }
                    return Unit.f17538a;
                }
            };
            scopeUpdateScopeEndRestartGroup.updateScope(function2);
        }
    }

    public static final void h(String str, String str2, boolean z, Function0 function0, Modifier modifier, Composer composer, int i) {
        int i2;
        String str3;
        Composer composer2;
        Composer composerStartRestartGroup = composer.startRestartGroup(961474320);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changed(str) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            str3 = str2;
            i2 |= composerStartRestartGroup.changed(str3) ? 32 : 16;
        } else {
            str3 = str2;
        }
        if ((i & 384) == 0) {
            i2 |= composerStartRestartGroup.changed(z) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(function0) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= composerStartRestartGroup.changed(modifier) ? 16384 : 8192;
        }
        if (composerStartRestartGroup.shouldExecute((i2 & 9363) != 9362, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(961474320, i2, -1, "app.chalo.premiumbus.bulkbookingridedetails.ui.ChaloBusSingleStopInfoSection (ChaloBusActiveTicket.kt:443)");
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
            Modifier modifierA = i41.a(RowScopeInstance.INSTANCE, companion3, 1.0f, false, 2, null);
            long j = ChaloTheme.a(composerStartRestartGroup, 0).v0;
            TextStyle bodySmall = ChaloTheme.e(composerStartRestartGroup, 0).getBodySmall();
            TextOverflow.Companion companion4 = TextOverflow.INSTANCE;
            TextKt.m2623TextNvy7gAk(str, modifierA, j, null, 0L, null, null, null, 0L, null, null, 0L, companion4.m7226getEllipsisgIe3tQ8(), false, 1, 0, null, bodySmall, composerStartRestartGroup, i2 & 14, 24960, 110584);
            if (z) {
                composerStartRestartGroup.startReplaceGroup(1206039714);
                ChaloSpacersKt.t(composerStartRestartGroup, 0);
                FromAndToStopCardKt.e(IconType.IC_STOP_DIRECTIONS, StringResourcesHelperKt.c(StringEnum.DIRECTIONS, new Object[0], composerStartRestartGroup, 6), ClickableKt.m299clickableoSLSa3U$default(PlotlineComposeWidgetKt.a(companion3, "PL_Directions"), false, null, null, null, function0, 15, null), SizeKt.m828size3ABfNKs(companion3, ChaloTheme.b(composerStartRestartGroup, 0).h), ChaloTheme.a(composerStartRestartGroup, 0).f1915a, companion4.m7226getEllipsisgIe3tQ8(), 1, ChaloTheme.e(composerStartRestartGroup, 0).getTitleLarge(), composerStartRestartGroup, 1769478, 0);
            } else {
                composerStartRestartGroup.startReplaceGroup(1188568920);
            }
            composerStartRestartGroup.endReplaceGroup();
            composerStartRestartGroup.endNode();
            ChaloSpacersKt.t(composerStartRestartGroup, 0);
            composer2 = composerStartRestartGroup;
            TextKt.m2623TextNvy7gAk(str3, modifier, ChaloTheme.a(composerStartRestartGroup, 0).e, null, 0L, null, null, null, 0L, null, null, 0L, companion4.m7226getEllipsisgIe3tQ8(), false, 3, 0, null, ChaloTheme.e(composerStartRestartGroup, 0).getHeadlineMedium(), composer2, ((i2 >> 3) & 14) | ((i2 >> 9) & 112), 24960, 110584);
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
            scopeUpdateScopeEndRestartGroup.updateScope(new ma(str, str2, z, function0, modifier, i, 2));
        }
    }

    public static final void i(PremiumBusBookingTripTimeInfoState premiumBusBookingTripTimeInfoState, NewPremiumReserveTicketDetailsScreenType newPremiumReserveTicketDetailsScreenType, Modifier modifier, Composer composer, int i) {
        int i2;
        Modifier modifier2;
        String strC;
        Composer composerStartRestartGroup = composer.startRestartGroup(9451630);
        if ((i & 6) == 0) {
            i2 = i | (composerStartRestartGroup.changed(premiumBusBookingTripTimeInfoState) ? 4 : 2);
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changed(newPremiumReserveTicketDetailsScreenType.ordinal()) ? 32 : 16;
        }
        int i3 = i2 | 384;
        if (composerStartRestartGroup.shouldExecute((i3 & 147) != 146, i3 & 1)) {
            Modifier.Companion companion = Modifier.INSTANCE;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(9451630, i3, -1, "app.chalo.premiumbus.bulkbookingridedetails.ui.ChaloBusTripTimeInfoComponent (ChaloBusActiveTicket.kt:330)");
            }
            boolean z = premiumBusBookingTripTimeInfoState instanceof PremiumBusBookingTripTimeInfoState.LiveEta;
            PremiumBusBookingTripTimeInfoState.LiveEtaNotAvailable liveEtaNotAvailable = PremiumBusBookingTripTimeInfoState.LiveEtaNotAvailable.b;
            PremiumBusBookingTripTimeInfoState.NotFetched notFetched = PremiumBusBookingTripTimeInfoState.NotFetched.b;
            PremiumBusBookingTripTimeInfoState.BusPassedPickupStop busPassedPickupStop = PremiumBusBookingTripTimeInfoState.BusPassedPickupStop.b;
            if (z) {
                composerStartRestartGroup.startReplaceGroup(-1894029055);
                int i4 = WhenMappings.f6904a[newPremiumReserveTicketDetailsScreenType.ordinal()];
                if (i4 == 1) {
                    composerStartRestartGroup.startReplaceGroup(493094304);
                    strC = StringResourcesHelperKt.c(StringEnum.PICK_UP_IN, new Object[0], composerStartRestartGroup, 6);
                    composerStartRestartGroup.endReplaceGroup();
                } else {
                    if (i4 != 2) {
                        throw pk0.p(composerStartRestartGroup, 493091617);
                    }
                    composerStartRestartGroup.startReplaceGroup(493098241);
                    strC = StringResourcesHelperKt.c(StringEnum.DROP_OFF_IN, new Object[0], composerStartRestartGroup, 6);
                    composerStartRestartGroup.endReplaceGroup();
                }
                composerStartRestartGroup.endReplaceGroup();
            } else {
                if (!Intrinsics.d(premiumBusBookingTripTimeInfoState, busPassedPickupStop) && !(premiumBusBookingTripTimeInfoState instanceof PremiumBusBookingTripTimeInfoState.ExpectedTime) && !Intrinsics.d(premiumBusBookingTripTimeInfoState, notFetched) && !Intrinsics.d(premiumBusBookingTripTimeInfoState, liveEtaNotAvailable) && premiumBusBookingTripTimeInfoState != null) {
                    throw pk0.p(composerStartRestartGroup, 493089334);
                }
                composerStartRestartGroup.startReplaceGroup(493108548);
                strC = StringResourcesHelperKt.c(StringEnum.CURRENT_STATUS, new Object[0], composerStartRestartGroup, 6);
                composerStartRestartGroup.endReplaceGroup();
            }
            boolean z2 = (i3 & 14) == 4;
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (z2 || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = !z ? Alignment.INSTANCE.getEnd() : Alignment.INSTANCE.getStart();
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), (Alignment.Horizontal) objRememberedValue, composerStartRestartGroup, 0);
            long currentCompositeKeyHashCode = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
            String str = strC;
            int i5 = (int) (currentCompositeKeyHashCode ^ (currentCompositeKeyHashCode >>> 32));
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
            Updater.m3923setimpl(composerM3915constructorimpl, modifierMaterializeModifier, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion2, composerM3915constructorimpl, Integer.valueOf(i5), composerM3915constructorimpl));
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
            TextKt.m2623TextNvy7gAk(str, null, ChaloTheme.a(composerStartRestartGroup, 0).v0, null, 0L, null, null, null, 0L, null, null, 0L, TextOverflow.INSTANCE.m7226getEllipsisgIe3tQ8(), false, 1, 0, null, ChaloTheme.e(composerStartRestartGroup, 0).getBodySmall(), composerStartRestartGroup, 0, 24960, 110586);
            composerStartRestartGroup = composerStartRestartGroup;
            ChaloSpacersKt.t(composerStartRestartGroup, 0);
            if (Intrinsics.d(premiumBusBookingTripTimeInfoState, busPassedPickupStop)) {
                composerStartRestartGroup.startReplaceGroup(762810789);
                composerStartRestartGroup.endReplaceGroup();
                modifier2 = companion;
            } else if (premiumBusBookingTripTimeInfoState instanceof PremiumBusBookingTripTimeInfoState.ExpectedTime) {
                composerStartRestartGroup.startReplaceGroup(762972857);
                modifier2 = companion;
                TextKt.m2623TextNvy7gAk(StringResourcesHelperKt.c(StringEnum.NOT_STARTED, new Object[0], composerStartRestartGroup, 6), modifier2, ChaloTheme.a(composerStartRestartGroup, 0).e, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ChaloTheme.e(composerStartRestartGroup, 0).getHeadlineMedium(), composerStartRestartGroup, (i3 >> 3) & 112, 0, 131064);
                composerStartRestartGroup = composerStartRestartGroup;
                composerStartRestartGroup.endReplaceGroup();
            } else if (z) {
                modifier2 = companion;
                composerStartRestartGroup.startReplaceGroup(763321979);
                ChaloEtaComponentKt.a(((PremiumBusBookingTripTimeInfoState.LiveEta) premiumBusBookingTripTimeInfoState).b, modifier2, null, composerStartRestartGroup, (i3 >> 3) & 112, 4);
                composerStartRestartGroup.endReplaceGroup();
            } else if (Intrinsics.d(premiumBusBookingTripTimeInfoState, notFetched) || premiumBusBookingTripTimeInfoState == null) {
                modifier2 = companion;
                composerStartRestartGroup.startReplaceGroup(763583061);
                PremiumBusBookingCardKt.a(SizeKt.fillMaxWidth(PaddingKt.m788paddingqDBjuR0$default(modifier2, 0.0f, ChaloTheme.b(composerStartRestartGroup, 0).d, 0.0f, 0.0f, 13, null), 0.4f), 0.0f, composerStartRestartGroup, 0, 2);
                composerStartRestartGroup.endReplaceGroup();
            } else {
                if (!premiumBusBookingTripTimeInfoState.equals(liveEtaNotAvailable)) {
                    throw pk0.p(composerStartRestartGroup, 1548625448);
                }
                composerStartRestartGroup.startReplaceGroup(763878460);
                composerStartRestartGroup.endReplaceGroup();
            }
            composerStartRestartGroup.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
            modifier2 = modifier;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new s4(i, 7, premiumBusBookingTripTimeInfoState, newPremiumReserveTicketDetailsScreenType, modifier2));
        }
    }

    public static final void j(int i, Composer composer, Modifier modifier, PremiumBusBookingVehicleInfoState premiumBusBookingVehicleInfoState) {
        int i2;
        int i3;
        Composer composer2;
        Composer composerStartRestartGroup = composer.startRestartGroup(838730903);
        if ((i & 6) == 0) {
            i2 = i | (composerStartRestartGroup.changedInstance(premiumBusBookingVehicleInfoState) ? 4 : 2);
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changed(modifier) ? 32 : 16;
        }
        if (composerStartRestartGroup.shouldExecute((i2 & 19) != 18, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(838730903, i2, -1, "app.chalo.premiumbus.bulkbookingridedetails.ui.ChaloBusVehicleInfoComponent (ChaloBusActiveTicket.kt:496)");
            }
            Modifier modifierHeight = IntrinsicKt.height(modifier, IntrinsicSize.Min);
            Alignment.Companion companion = Alignment.INSTANCE;
            Alignment.Vertical centerVertically = companion.getCenterVertically();
            Arrangement arrangement = Arrangement.INSTANCE;
            MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(arrangement.getSpaceBetween(), centerVertically, composerStartRestartGroup, 54);
            long currentCompositeKeyHashCode = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
            int i4 = (int) (currentCompositeKeyHashCode ^ (currentCompositeKeyHashCode >>> 32));
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierHeight);
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
            Updater.m3923setimpl(composerM3915constructorimpl, modifierMaterializeModifier, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion2, composerM3915constructorimpl, Integer.valueOf(i4), composerM3915constructorimpl));
            RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
            PremiumBusTripInfoContractKt.c(premiumBusBookingVehicleInfoState);
            PremiumBusTripInfoContractKt.d(premiumBusBookingVehicleInfoState);
            Modifier.Companion companion3 = Modifier.INSTANCE;
            Modifier modifierA = i41.a(rowScopeInstance, companion3, 1.0f, false, 2, null);
            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(arrangement.getTop(), companion.getStart(), composerStartRestartGroup, 0);
            long currentCompositeKeyHashCode2 = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
            int i5 = (int) ((currentCompositeKeyHashCode2 >>> 32) ^ currentCompositeKeyHashCode2);
            CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierA);
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
            pk0.v(companion2, composerM3915constructorimpl2, measurePolicyColumnMeasurePolicy, composerM3915constructorimpl2, currentCompositionLocalMap2);
            Updater.m3923setimpl(composerM3915constructorimpl2, modifierMaterializeModifier2, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion2, composerM3915constructorimpl2, Integer.valueOf(i5), composerM3915constructorimpl2));
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
            composerStartRestartGroup.startReplaceGroup(-259865549);
            StringEnum stringEnum = StringEnum.VEHICLE_NUMBER;
            String strC = StringResourcesHelperKt.c(stringEnum, new Object[0], composerStartRestartGroup, 6);
            composerStartRestartGroup.endReplaceGroup();
            composer2 = composerStartRestartGroup;
            i3 = 0;
            TextKt.m2623TextNvy7gAk(strC, null, ChaloTheme.a(composerStartRestartGroup, 0).v0, null, 0L, null, null, null, 0L, null, null, 0L, TextOverflow.INSTANCE.m7226getEllipsisgIe3tQ8(), false, 1, 0, null, ChaloTheme.e(composerStartRestartGroup, 0).getBodySmall(), composer2, 0, 24960, 110586);
            ChaloSpacersKt.t(composer2, 0);
            l(i2 & 14, composer2, null, premiumBusBookingVehicleInfoState);
            composer2.endNode();
            composer2.startReplaceGroup(262131819);
            ImageKt.Image(PainterResourceHelperKt.a(IconType.CHALO_BUS_ICON, composer2, 6), StringResourcesHelperKt.c(stringEnum, new Object[0], composer2, 6), SizeKt.fillMaxHeight$default(companion3, 0.0f, 1, null), (Alignment) null, ContentScale.INSTANCE.getFit(), 0.0f, (ColorFilter) null, composer2, Painter.$stable | 24960, 104);
            if (b3.t(composer2)) {
                ComposerKt.traceEventEnd();
            }
        } else {
            i3 = 0;
            composer2 = composerStartRestartGroup;
            composer2.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new kg(premiumBusBookingVehicleInfoState, modifier, i, i3));
        }
    }

    public static final void k(Composer composer, int i, String str) {
        int i2;
        Composer composer2;
        String timeString = str;
        Intrinsics.i(timeString, "timeString");
        Composer composerStartRestartGroup = composer.startRestartGroup(-267201503);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changed(timeString) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (composerStartRestartGroup.shouldExecute((i2 & 3) != 2, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-267201503, i2, -1, "app.chalo.premiumbus.bulkbookingridedetails.ui.PremiumBusActiveTicketTimeInfoComposable (ChaloBusActiveTicket.kt:305)");
            }
            String strC = StringResourcesHelperKt.c(StringEnum.SCHEDULED_ON, new Object[0], composerStartRestartGroup, 6);
            int i3 = i2;
            Modifier.Companion companion = Modifier.INSTANCE;
            TextKt.m2623TextNvy7gAk(strC, companion, ChaloTheme.a(composerStartRestartGroup, 0).i, null, 0L, null, null, null, 0L, null, null, 0L, TextOverflow.INSTANCE.m7226getEllipsisgIe3tQ8(), false, 1, 0, null, ChaloTheme.e(composerStartRestartGroup, 0).getBodyMedium(), composerStartRestartGroup, 48, 24960, 110584);
            SpacerKt.Spacer(SizeKt.m814height3ABfNKs(companion, ChaloTheme.b(composerStartRestartGroup, 0).d), composerStartRestartGroup, 0);
            composer2 = composerStartRestartGroup;
            timeString = str;
            TextKt.m2623TextNvy7gAk(timeString, companion, ChaloTheme.a(composerStartRestartGroup, 0).e, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ChaloTheme.e(composerStartRestartGroup, 0).getHeadlineMedium(), composer2, (i3 & 14) | 48, 0, 131064);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer2 = composerStartRestartGroup;
            composer2.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new qg(timeString, i, 0));
        }
    }

    public static final void l(int i, Composer composer, Modifier modifier, PremiumBusBookingVehicleInfoState vehicleInfo) {
        int i2;
        Modifier modifier2;
        Intrinsics.i(vehicleInfo, "vehicleInfo");
        Composer composerStartRestartGroup = composer.startRestartGroup(1410098186);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(vehicleInfo) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        int i3 = i2 | 48;
        if (composerStartRestartGroup.shouldExecute((i3 & 19) != 18, i3 & 1)) {
            Modifier.Companion companion = Modifier.INSTANCE;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1410098186, i3, -1, "app.chalo.premiumbus.bulkbookingridedetails.ui.PremiumBusBookingVehicleInfoComponent (ChaloBusActiveTicket.kt:544)");
            }
            if (vehicleInfo instanceof PremiumBusBookingVehicleInfoState.NotFetched) {
                composerStartRestartGroup.startReplaceGroup(-839841305);
                PremiumBusBookingCardKt.a(SizeKt.fillMaxWidth(PaddingKt.m788paddingqDBjuR0$default(companion, 0.0f, ChaloTheme.b(composerStartRestartGroup, 0).d, 0.0f, 0.0f, 13, null), 0.5f), 0.0f, composerStartRestartGroup, 0, 2);
                composerStartRestartGroup.endReplaceGroup();
                modifier2 = companion;
            } else if (vehicleInfo instanceof PremiumBusBookingVehicleInfoState.VehicleNotAssigned) {
                composerStartRestartGroup.startReplaceGroup(-839548851);
                modifier2 = companion;
                TextKt.m2623TextNvy7gAk(StringResourcesHelperKt.c(StringEnum.VEHICLE_NOT_ASSIGNED_MSG, new Object[0], composerStartRestartGroup, 6), SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), ChaloTheme.a(composerStartRestartGroup, 0).g, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ChaloTypographyKt.a(ChaloTheme.e(composerStartRestartGroup, 0).getHeadlineSmall()), composerStartRestartGroup, 0, 0, 131064);
                composerStartRestartGroup = composerStartRestartGroup;
                composerStartRestartGroup.endReplaceGroup();
            } else {
                modifier2 = companion;
                if (!(vehicleInfo instanceof PremiumBusBookingVehicleInfoState.VehicleAssigned)) {
                    throw pk0.p(composerStartRestartGroup, -2105303361);
                }
                composerStartRestartGroup.startReplaceGroup(-839163924);
                TextKt.m2623TextNvy7gAk(((PremiumBusBookingVehicleInfoState.VehicleAssigned) vehicleInfo).b, SizeKt.fillMaxWidth$default(modifier2, 0.0f, 1, null), 0L, null, 0L, null, null, null, 0L, null, null, 0L, TextOverflow.INSTANCE.m7226getEllipsisgIe3tQ8(), false, 2, 0, null, ChaloTypographyKt.a(ChaloTheme.e(composerStartRestartGroup, 0).getHeadlineSmall()), composerStartRestartGroup, 0, 24960, 110588);
                composerStartRestartGroup = composerStartRestartGroup;
                composerStartRestartGroup.endReplaceGroup();
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
            modifier2 = modifier;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new kg(vehicleInfo, modifier2, i, 1));
        }
    }
}
