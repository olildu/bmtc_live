package app.chalo.productsummary.ui.compose;

import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.ScrollKt;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material3.IconKt;
import androidx.compose.material3.ScaffoldKt;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.ClipKt;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import app.chalo.compose.BackHandlerKt;
import app.chalo.compose.ChaloToolBarKt;
import app.chalo.compose.StandardErrorScreenKt;
import app.chalo.compose.TextWithLeftAndTrailingRightIconComponentKt;
import app.chalo.compose.components.ChaloCircularLoadingBoxKt;
import app.chalo.compose.components.ChaloRoundedCardKt;
import app.chalo.compose.components.ChaloSpacersKt;
import app.chalo.compose.components.ChaloTextViewKt;
import app.chalo.compose.components.ComposeUtils_androidKt;
import app.chalo.compose.components.RippleEffectKt;
import app.chalo.compose.components.SpecialFeatureTagListComposableKt;
import app.chalo.compose.components.TextKt;
import app.chalo.compose.components.divider.DashedDividerKt;
import app.chalo.compose.components.text.TitleSubtitleViewKt;
import app.chalo.compose.resources.PainterResourceHelperKt;
import app.chalo.compose.theme.ChaloTheme;
import app.chalo.compose.theme.ChaloThemeKt;
import app.chalo.compose.theme.UIShape;
import app.chalo.premiumbus.ui.stopselection.FromAndToStopCardData;
import app.chalo.productsummary.ui.compose.components.FullScreenImageSectionKt;
import app.chalo.productsummary.ui.compose.components.UserProfileComponentKt;
import app.chalo.productsummary.ui.data.FullScreenImageUIState;
import app.chalo.productsummary.ui.data.ProductSummarySuccessScreenUISpec;
import app.chalo.productsummary.ui.data.RouteDetailInfoUIState;
import app.chalo.productsummary.ui.ticket.TicketInfoContentUIState;
import app.chalo.productsummary.ui.ticket.TicketInfoUIState;
import app.chalo.productsummary.ui.ticket.TicketSummaryBusMetaInfoUIState;
import app.chalo.productsummary.ui.ticket.TicketSummaryComponent;
import app.chalo.productsummary.ui.ticket.TicketSummaryReceiptCardUISpec;
import app.chalo.productsummary.ui.ticket.TicketSummaryReceiptCardUIState;
import app.chalo.productsummary.ui.ticket.TicketSummaryReceiptHeaderUIState;
import app.chalo.productsummary.ui.ticket.TicketSummaryReceiptScreenUISpec;
import app.chalo.productsummary.ui.ticket.TicketSummaryReceiptScreenUIState;
import app.chalo.productsummary.ui.ticket.TicketSummaryReceiptStopsInfoUIState;
import app.chalo.productsummary.ui.ticket.TicketSummaryReceiptTotalFareUIState;
import app.chalo.productsummary.ui.ticket.TicketSummaryScreenType;
import app.chalo.productsummary.ui.ticket.TicketSummarySuccessScreenUIState;
import app.chalo.productsummary.ui.ticket.TicketSummaryViewState;
import app.chalo.providers.iconassetprovider.IconType;
import app.chalo.routeselection.ui.compose.FromAndToStopComponentKt;
import app.chalo.uistate.base.ChaloColorTokenKt;
import app.chalo.uistate.components.RegularBusTicketDetailsContainerKt;
import app.chalo.uistate.dialog.LoadingDialogUIState;
import app.chalo.uistate.divider.DividerUIState;
import app.chalo.uistate.divider.DividerUIStateKt;
import app.chalo.uistate.image.ImageUrlUIState;
import app.chalo.uistate.text.SpecialFeaturesTagListUIState;
import app.chalo.uistate.text.TextUIState;
import app.chalo.uistate.toolbar.ToolbarUIState;
import coil3.compose.SingletonSubcomposeAsyncImageKt;
import com.arkivanov.decompose.extensions.compose.SubscribeAsStateKt;
import defpackage.b3;
import defpackage.cg1;
import defpackage.fl1;
import defpackage.gf;
import defpackage.i41;
import defpackage.i61;
import defpackage.l31;
import defpackage.ob;
import defpackage.pk0;
import defpackage.qb1;
import defpackage.t8;
import defpackage.ut0;
import defpackage.y5;
import defpackage.zl1;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002¨\u0006\u0002²\u0006\f\u0010\u0001\u001a\u00020\u00008\nX\u008a\u0084\u0002"}, d2 = {"Lapp/chalo/productsummary/ui/ticket/TicketSummaryViewState;", "viewState", "home_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class TripSummaryMainScreenKt {
    public static final void a(Modifier modifier, RouteDetailInfoUIState routeDetailInfoUIState, Composer composer, int i) {
        Modifier modifier2;
        Composer composerStartRestartGroup = composer.startRestartGroup(650302384);
        int i2 = i | 6;
        if ((i & 48) == 0) {
            i2 |= (i & 64) == 0 ? composerStartRestartGroup.changed(routeDetailInfoUIState) : composerStartRestartGroup.changedInstance(routeDetailInfoUIState) ? 32 : 16;
        }
        if (composerStartRestartGroup.shouldExecute((i2 & 19) != 18, i2 & 1)) {
            modifier2 = Modifier.INSTANCE;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(650302384, i2, -1, "app.chalo.productsummary.ui.compose.RouteDetailComponent (TripSummaryMainScreen.kt:704)");
            }
            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composerStartRestartGroup, 0);
            long currentCompositeKeyHashCode = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
            int i3 = (int) (currentCompositeKeyHashCode ^ (currentCompositeKeyHashCode >>> 32));
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifier2);
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
            Updater.m3923setimpl(composerM3915constructorimpl, modifierMaterializeModifier, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion, composerM3915constructorimpl, Integer.valueOf(i3), composerM3915constructorimpl));
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
            SpecialFeaturesTagListUIState specialFeaturesTagListUIState = routeDetailInfoUIState.e;
            if (specialFeaturesTagListUIState == null) {
                composerStartRestartGroup.startReplaceGroup(-1202617491);
            } else {
                composerStartRestartGroup.startReplaceGroup(-1202617490);
                SpecialFeatureTagListComposableKt.b(specialFeaturesTagListUIState, null, composerStartRestartGroup, 0, 2);
                ChaloSpacersKt.u(composerStartRestartGroup, 0);
            }
            composerStartRestartGroup.endReplaceGroup();
            TextUIState.ChaloTextUIState chaloTextUIState = routeDetailInfoUIState.b;
            if (chaloTextUIState == null) {
                composerStartRestartGroup.startReplaceGroup(-1202462925);
            } else {
                composerStartRestartGroup.startReplaceGroup(-1202462924);
                b(ChaloThemeKt.c(modifier2, routeDetailInfoUIState.f8759a.c), chaloTextUIState, composerStartRestartGroup, 0);
            }
            composerStartRestartGroup.endReplaceGroup();
            ChaloSpacersKt.n(composerStartRestartGroup, 0);
            FromAndToStopComponentKt.b(new FromAndToStopCardData(null, routeDetailInfoUIState.c.b, routeDetailInfoUIState.d.b, null, null, null, null, null, null, 3873), 0, ChaloTheme.b(composerStartRestartGroup, 0).f, ChaloTheme.b(composerStartRestartGroup, 0).c, composerStartRestartGroup, 0);
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
            scopeUpdateScopeEndRestartGroup.updateScope(new cg1(i, 24, modifier2, routeDetailInfoUIState));
        }
    }

    public static final void b(Modifier modifier, TextUIState.ChaloTextUIState routeName, Composer composer, int i) {
        int i2;
        TextUIState.ChaloTextUIState chaloTextUIState;
        Composer composer2;
        Intrinsics.i(routeName, "routeName");
        Composer composerStartRestartGroup = composer.startRestartGroup(593699371);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changed(modifier) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changed(routeName) ? 32 : 16;
        }
        if (composerStartRestartGroup.shouldExecute((i2 & 19) != 18, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(593699371, i2, -1, "app.chalo.productsummary.ui.compose.RouteNameUI (TripSummaryMainScreen.kt:736)");
            }
            Modifier.Companion companion = Modifier.INSTANCE;
            Modifier modifierThen = BackgroundKt.m263backgroundbw27NRU(companion, ChaloTheme.a(composerStartRestartGroup, 0).r0, RoundedCornerShapeKt.m1074RoundedCornerShape0680j_4(ChaloTheme.b(composerStartRestartGroup, 0).h)).then(modifier);
            MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), Alignment.INSTANCE.getCenterVertically(), composerStartRestartGroup, 48);
            long currentCompositeKeyHashCode = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
            int i3 = (int) (currentCompositeKeyHashCode ^ (currentCompositeKeyHashCode >>> 32));
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierThen);
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
            IconKt.m2070Iconww6aTOc(PainterResourceHelperKt.a(IconType.IC_BUS, composerStartRestartGroup, 6), (String) null, SizeKt.m828size3ABfNKs(companion, ChaloTheme.b(composerStartRestartGroup, 0).h), 0L, composerStartRestartGroup, Painter.$stable | 48, 8);
            ChaloSpacersKt.w(composerStartRestartGroup, 0);
            chaloTextUIState = routeName;
            ChaloTextViewKt.a(null, chaloTextUIState, null, null, composerStartRestartGroup, i2 & 112, 13);
            composer2 = composerStartRestartGroup;
            composer2.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            chaloTextUIState = routeName;
            composer2 = composerStartRestartGroup;
            composer2.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new cg1(i, 26, modifier, chaloTextUIState));
        }
    }

    public static final void c(Modifier modifier, TicketInfoUIState ticketInfoUIState, Composer composer, int i) {
        Intrinsics.i(ticketInfoUIState, "ticketInfoUIState");
        List list = ticketInfoUIState.f8800a;
        Composer composerStartRestartGroup = composer.startRestartGroup(1418220245);
        int i2 = (i & 6) == 0 ? (composerStartRestartGroup.changed(modifier) ? 4 : 2) | i : i;
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(ticketInfoUIState) ? 32 : 16;
        }
        if (composerStartRestartGroup.shouldExecute((i2 & 19) != 18, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1418220245, i2, -1, "app.chalo.productsummary.ui.compose.TicketInfoUIStateComponent (TripSummaryMainScreen.kt:622)");
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
            composerStartRestartGroup.startReplaceGroup(1641504857);
            int i4 = 0;
            for (Object obj : list) {
                int i5 = i4 + 1;
                if (i4 < 0) {
                    CollectionsKt.z0();
                    throw null;
                }
                TicketInfoContentUIState ticketInfoContentUIState = (TicketInfoContentUIState) obj;
                if (ticketInfoContentUIState instanceof TicketInfoContentUIState.ExpiredAt) {
                    composerStartRestartGroup.startReplaceGroup(1996981745);
                    TitleSubtitleViewKt.a(null, ((TicketInfoContentUIState.ExpiredAt) ticketInfoContentUIState).f8791a, composerStartRestartGroup, 0, 1);
                    composerStartRestartGroup.endReplaceGroup();
                } else if (ticketInfoContentUIState instanceof TicketInfoContentUIState.NumberOfTickets) {
                    composerStartRestartGroup.startReplaceGroup(1997184671);
                    TextWithLeftAndTrailingRightIconComponentKt.a(null, ((TicketInfoContentUIState.NumberOfTickets) ticketInfoContentUIState).f8793a, composerStartRestartGroup, 0, 1);
                    composerStartRestartGroup.endReplaceGroup();
                } else if (ticketInfoContentUIState instanceof TicketInfoContentUIState.RouteDetailInfo) {
                    composerStartRestartGroup.startReplaceGroup(1997404988);
                    RouteDetailInfoUIState routeDetailInfoUIState = ((TicketInfoContentUIState.RouteDetailInfo) ticketInfoContentUIState).f8794a;
                    UIShape.Rectangle rectangle = UIShape.f1926a;
                    a(null, routeDetailInfoUIState, composerStartRestartGroup, 0);
                    composerStartRestartGroup.endReplaceGroup();
                } else if (ticketInfoContentUIState instanceof TicketInfoContentUIState.MultiModalJourney) {
                    composerStartRestartGroup.startReplaceGroup(1997632094);
                    RegularBusTicketDetailsContainerKt.f(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), ((TicketInfoContentUIState.MultiModalJourney) ticketInfoContentUIState).f8792a, composerStartRestartGroup, 70);
                    composerStartRestartGroup.endReplaceGroup();
                } else if (ticketInfoContentUIState instanceof TicketInfoContentUIState.UserInfo) {
                    composerStartRestartGroup.startReplaceGroup(1997905824);
                    UserProfileComponentKt.a(null, ((TicketInfoContentUIState.UserInfo) ticketInfoContentUIState).f8797a, composerStartRestartGroup, 0);
                    composerStartRestartGroup.endReplaceGroup();
                } else if (ticketInfoContentUIState instanceof TicketInfoContentUIState.ValidatedAt) {
                    composerStartRestartGroup.startReplaceGroup(1998059119);
                    TitleSubtitleViewKt.a(null, ((TicketInfoContentUIState.ValidatedAt) ticketInfoContentUIState).f8798a, composerStartRestartGroup, 0, 1);
                    composerStartRestartGroup.endReplaceGroup();
                } else if (ticketInfoContentUIState instanceof TicketInfoContentUIState.VehicleNumber) {
                    composerStartRestartGroup.startReplaceGroup(1998261549);
                    TitleSubtitleViewKt.a(null, ((TicketInfoContentUIState.VehicleNumber) ticketInfoContentUIState).f8799a, composerStartRestartGroup, 0, 1);
                    composerStartRestartGroup.endReplaceGroup();
                } else if (ticketInfoContentUIState instanceof TicketInfoContentUIState.ConductorId) {
                    composerStartRestartGroup.startReplaceGroup(1998463855);
                    TitleSubtitleViewKt.a(null, ((TicketInfoContentUIState.ConductorId) ticketInfoContentUIState).f8790a, composerStartRestartGroup, 0, 1);
                    composerStartRestartGroup.endReplaceGroup();
                } else if (ticketInfoContentUIState instanceof TicketInfoContentUIState.TicketNumber) {
                    composerStartRestartGroup.startReplaceGroup(1998665262);
                    TitleSubtitleViewKt.a(null, ((TicketInfoContentUIState.TicketNumber) ticketInfoContentUIState).f8796a, composerStartRestartGroup, 0, 1);
                    composerStartRestartGroup.endReplaceGroup();
                } else {
                    if (!(ticketInfoContentUIState instanceof TicketInfoContentUIState.SeatNumbers)) {
                        throw pk0.p(composerStartRestartGroup, -905412845);
                    }
                    composerStartRestartGroup.startReplaceGroup(1998866576);
                    TitleSubtitleViewKt.a(null, ((TicketInfoContentUIState.SeatNumbers) ticketInfoContentUIState).f8795a, composerStartRestartGroup, 0, 1);
                    composerStartRestartGroup.endReplaceGroup();
                }
                if (i4 != CollectionsKt.K(list)) {
                    composerStartRestartGroup.startReplaceGroup(-905342518);
                    DividerUIState dividerUIState = ticketInfoUIState.b;
                    if (dividerUIState == null) {
                        composerStartRestartGroup.startReplaceGroup(1999153015);
                    } else {
                        composerStartRestartGroup.startReplaceGroup(1999153016);
                        DividerUIStateKt.a(ChaloThemeKt.c(Modifier.INSTANCE, ticketInfoUIState.c), dividerUIState, composerStartRestartGroup, 0, 0);
                    }
                    composerStartRestartGroup.endReplaceGroup();
                } else {
                    composerStartRestartGroup.startReplaceGroup(1973726940);
                }
                composerStartRestartGroup.endReplaceGroup();
                i4 = i5;
            }
            if (b3.t(composerStartRestartGroup)) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new cg1(i, 23, modifier, ticketInfoUIState));
        }
    }

    public static final void d(TicketSummaryReceiptScreenUIState uiState, Composer composer, int i) {
        int i2;
        int i3;
        int i4;
        Intrinsics.i(uiState, "uiState");
        Object obj = uiState.c;
        TicketSummaryReceiptScreenUISpec ticketSummaryReceiptScreenUISpec = uiState.f8818a;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1908018335);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(uiState) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (composerStartRestartGroup.shouldExecute((i2 & 3) != 2, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1908018335, i2, -1, "app.chalo.productsummary.ui.compose.TicketSummaryBMTCReceiptMainScreen (TripSummaryMainScreen.kt:137)");
            }
            boolean zChanged = composerStartRestartGroup.changed(ticketSummaryReceiptScreenUISpec);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                composerStartRestartGroup.updateRememberedValue(ticketSummaryReceiptScreenUISpec);
                objRememberedValue = ticketSummaryReceiptScreenUISpec;
            }
            TicketSummaryReceiptScreenUISpec ticketSummaryReceiptScreenUISpec2 = (TicketSummaryReceiptScreenUISpec) objRememberedValue;
            boolean zChanged2 = composerStartRestartGroup.changed(obj);
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (zChanged2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                composerStartRestartGroup.updateRememberedValue(obj);
            } else {
                obj = objRememberedValue2;
            }
            TicketSummaryReceiptCardUIState ticketSummaryReceiptCardUIState = (TicketSummaryReceiptCardUIState) obj;
            Modifier.Companion companion = Modifier.INSTANCE;
            Modifier modifierM264backgroundbw27NRU$default = BackgroundKt.m264backgroundbw27NRU$default(SizeKt.fillMaxSize$default(companion, 0.0f, 1, null), ChaloColorTokenKt.c(ticketSummaryReceiptScreenUISpec2.f8817a), null, 2, null);
            Alignment.Companion companion2 = Alignment.INSTANCE;
            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(companion2.getCenter(), false);
            long currentCompositeKeyHashCode = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
            int i5 = (int) (currentCompositeKeyHashCode ^ (currentCompositeKeyHashCode >>> 32));
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierM264backgroundbw27NRU$default);
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
            pk0.v(companion3, composerM3915constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy, composerM3915constructorimpl, currentCompositionLocalMap);
            Updater.m3923setimpl(composerM3915constructorimpl, modifierMaterializeModifier, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion3, composerM3915constructorimpl, Integer.valueOf(i5), composerM3915constructorimpl));
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            Modifier modifierFillMaxSize$default = SizeKt.fillMaxSize$default(companion, 0.0f, 1, null);
            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), companion2.getStart(), composerStartRestartGroup, 0);
            long currentCompositeKeyHashCode2 = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
            int i6 = (int) ((currentCompositeKeyHashCode2 >>> 32) ^ currentCompositeKeyHashCode2);
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
            pk0.v(companion3, composerM3915constructorimpl2, measurePolicyColumnMeasurePolicy, composerM3915constructorimpl2, currentCompositionLocalMap2);
            Updater.m3923setimpl(composerM3915constructorimpl2, modifierMaterializeModifier2, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion3, composerM3915constructorimpl2, Integer.valueOf(i6), composerM3915constructorimpl2));
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
            ToolbarUIState toolbarUIState = uiState.b;
            if (toolbarUIState == null) {
                composerStartRestartGroup.startReplaceGroup(-323272938);
                composerStartRestartGroup.endReplaceGroup();
                i3 = 2;
                i4 = 0;
            } else {
                composerStartRestartGroup.startReplaceGroup(-323272937);
                i3 = 2;
                i4 = 0;
                ChaloToolBarKt.f(toolbarUIState, null, composerStartRestartGroup, 0, 2);
                composerStartRestartGroup.endReplaceGroup();
            }
            SpacerKt.Spacer(SizeKt.m814height3ABfNKs(companion, ticketSummaryReceiptScreenUISpec2.c), composerStartRestartGroup, i4);
            ChaloRoundedCardKt.a(ticketSummaryReceiptScreenUISpec.d, SizeKt.fillMaxWidth$default(PaddingKt.m786paddingVpY3zN4$default(companion, ChaloTheme.b(composerStartRestartGroup, i4).h, 0.0f, i3, null), 0.0f, 1, null), ComposableLambdaKt.rememberComposableLambda(1694072012, true, new qb1(11, uiState, ticketSummaryReceiptCardUIState), composerStartRestartGroup, 54), composerStartRestartGroup, 384, 0);
            composerStartRestartGroup.endNode();
            FullScreenImageUIState fullScreenImageUIState = uiState.d;
            if (fullScreenImageUIState == null) {
                composerStartRestartGroup.startReplaceGroup(-559567718);
            } else {
                composerStartRestartGroup.startReplaceGroup(-559567717);
                FullScreenImageSectionKt.a(fullScreenImageUIState, composerStartRestartGroup, 0);
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
            scopeUpdateScopeEndRestartGroup.updateScope(new fl1(uiState, i, 2));
        }
    }

    public static final void e(Function2 function2, Function2 function3, Composer composer, int i) {
        int i2;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        i61 i61Var;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1167606557);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(function2) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(function3) ? 32 : 16;
        }
        if (composerStartRestartGroup.shouldExecute((i2 & 19) != 18, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1167606557, i2, -1, "app.chalo.productsummary.ui.compose.TicketSummaryHeaderMeta (TripSummaryMainScreen.kt:292)");
            }
            if (function2 == null && function3 == null) {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                } else {
                    i61Var = new i61(function2, function3, i, 2);
                }
            } else {
                Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null);
                MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getSpaceBetween(), Alignment.INSTANCE.getTop(), composerStartRestartGroup, 6);
                long currentCompositeKeyHashCode = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
                int i3 = (int) ((currentCompositeKeyHashCode >>> 32) ^ currentCompositeKeyHashCode);
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
                pk0.v(companion, composerM3915constructorimpl, measurePolicyRowMeasurePolicy, composerM3915constructorimpl, currentCompositionLocalMap);
                Updater.m3923setimpl(composerM3915constructorimpl, modifierMaterializeModifier, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion, composerM3915constructorimpl, Integer.valueOf(i3), composerM3915constructorimpl));
                RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
                if (function2 == null) {
                    composerStartRestartGroup.startReplaceGroup(629916538);
                } else {
                    composerStartRestartGroup.startReplaceGroup(-1365153433);
                    function2.invoke(composerStartRestartGroup, Integer.valueOf(i2 & 14));
                }
                composerStartRestartGroup.endReplaceGroup();
                ChaloSpacersKt.w(composerStartRestartGroup, 0);
                if (function3 == null) {
                    composerStartRestartGroup.startReplaceGroup(629974074);
                } else {
                    composerStartRestartGroup.startReplaceGroup(-1365151577);
                    function3.invoke(composerStartRestartGroup, Integer.valueOf((i2 >> 3) & 14));
                }
                composerStartRestartGroup.endReplaceGroup();
                composerStartRestartGroup.endNode();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
            scopeUpdateScopeEndRestartGroup.updateScope(i61Var);
        }
        composerStartRestartGroup.skipToGroupEnd();
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            i61Var = new i61(function2, function3, i, 3);
            scopeUpdateScopeEndRestartGroup.updateScope(i61Var);
        }
    }

    public static final void f(TicketSummaryBusMetaInfoUIState ticketSummaryBusMetaInfoUIState, Composer composer, int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(54987072);
        int i2 = (i & 6) == 0 ? (composerStartRestartGroup.changedInstance(ticketSummaryBusMetaInfoUIState) ? 4 : 2) | i : i;
        int i3 = 1;
        if (composerStartRestartGroup.shouldExecute((i2 & 3) != 2, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(54987072, i2, -1, "app.chalo.productsummary.ui.compose.TicketSummaryReceiptBusMetaInfo (TripSummaryMainScreen.kt:415)");
            }
            float f = 0.0f;
            Throwable th = null;
            Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null);
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
            composerStartRestartGroup.startReplaceGroup(-1585428158);
            ArrayList arrayList = ticketSummaryBusMetaInfoUIState.f8801a;
            int size = arrayList.size();
            int i5 = 0;
            int i6 = 0;
            while (i6 < size) {
                Object obj = arrayList.get(i6);
                int i7 = i6 + 1;
                int i8 = i5 + 1;
                if (i5 < 0) {
                    Throwable th2 = th;
                    CollectionsKt.z0();
                    throw th2;
                }
                List list = (List) obj;
                Modifier modifierFillMaxWidth$default2 = SizeKt.fillMaxWidth$default(Modifier.INSTANCE, f, i3, th);
                MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), Alignment.INSTANCE.getCenterVertically(), composerStartRestartGroup, 48);
                long currentCompositeKeyHashCode2 = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
                int i9 = (int) (currentCompositeKeyHashCode2 ^ (currentCompositeKeyHashCode2 >>> 32));
                CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierFillMaxWidth$default2);
                ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
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
                Updater.m3923setimpl(composerM3915constructorimpl2, modifierMaterializeModifier2, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion2, composerM3915constructorimpl2, Integer.valueOf(i9), composerM3915constructorimpl2));
                RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
                composerStartRestartGroup.startReplaceGroup(-367805520);
                int i10 = 0;
                for (Object obj2 : list) {
                    int i11 = i10 + 1;
                    if (i10 < 0) {
                        Throwable th3 = th;
                        CollectionsKt.z0();
                        throw th3;
                    }
                    TextUIState textUIState = (TextUIState) obj2;
                    Modifier modifierA = i41.a(rowScopeInstance, Modifier.INSTANCE, 1.0f, false, 2, null);
                    MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(i10 == 0 ? Alignment.INSTANCE.getCenterStart() : i10 == CollectionsKt.K(list) ? Alignment.INSTANCE.getCenterEnd() : Alignment.INSTANCE.getCenter(), false);
                    long currentCompositeKeyHashCode3 = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
                    int i12 = (int) (currentCompositeKeyHashCode3 ^ (currentCompositeKeyHashCode3 >>> 32));
                    CompositionLocalMap currentCompositionLocalMap3 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier3 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierA);
                    ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
                    Throwable th4 = th;
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
                    pk0.v(companion3, composerM3915constructorimpl3, measurePolicyMaybeCachedBoxMeasurePolicy, composerM3915constructorimpl3, currentCompositionLocalMap3);
                    Updater.m3923setimpl(composerM3915constructorimpl3, modifierMaterializeModifier3, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion3, composerM3915constructorimpl3, Integer.valueOf(i12), composerM3915constructorimpl3));
                    BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                    TextKt.c(textUIState, null, null, null, composerStartRestartGroup, 0, 14);
                    composerStartRestartGroup.endNode();
                    i5 = i5;
                    th = th4;
                    i10 = i11;
                }
                int i13 = i5;
                Throwable th5 = th;
                composerStartRestartGroup.endReplaceGroup();
                composerStartRestartGroup.endNode();
                if (i13 != CollectionsKt.K(ticketSummaryBusMetaInfoUIState.f8801a)) {
                    composerStartRestartGroup.startReplaceGroup(-1951139020);
                    gf.r(Modifier.INSTANCE, ChaloTheme.b(composerStartRestartGroup, 0).f, composerStartRestartGroup, 0);
                } else {
                    composerStartRestartGroup.startReplaceGroup(-1966511951);
                    composerStartRestartGroup.endReplaceGroup();
                }
                i6 = i7;
                i5 = i8;
                th = th5;
                i3 = 1;
                f = 0.0f;
            }
            if (b3.t(composerStartRestartGroup)) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new fl1(ticketSummaryBusMetaInfoUIState, i, 6));
        }
    }

    public static final void g(Modifier modifier, TicketSummaryReceiptCardUIState ticketSummaryReceiptCardUIState, Composer composer, int i) {
        int i2;
        Composer composerStartRestartGroup = composer.startRestartGroup(1252787165);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changed(modifier) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(ticketSummaryReceiptCardUIState) ? 32 : 16;
        }
        if (composerStartRestartGroup.shouldExecute((i2 & 19) != 18, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1252787165, i2, -1, "app.chalo.productsummary.ui.compose.TicketSummaryReceiptCard (TripSummaryMainScreen.kt:186)");
            }
            TicketSummaryReceiptCardUISpec ticketSummaryReceiptCardUISpec = ticketSummaryReceiptCardUIState.f8815a;
            boolean zChanged = composerStartRestartGroup.changed(ticketSummaryReceiptCardUISpec);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                composerStartRestartGroup.updateRememberedValue(ticketSummaryReceiptCardUISpec);
                objRememberedValue = ticketSummaryReceiptCardUISpec;
            }
            TicketSummaryReceiptCardUISpec ticketSummaryReceiptCardUISpec2 = (TicketSummaryReceiptCardUISpec) objRememberedValue;
            Modifier modifierVerticalScroll$default = ScrollKt.verticalScroll$default(ChaloThemeKt.c(BackgroundKt.m264backgroundbw27NRU$default(SizeKt.fillMaxWidth$default(modifier, 0.0f, 1, null), ChaloTheme.a(composerStartRestartGroup, 0).Z, null, 2, null), ticketSummaryReceiptCardUISpec2.b), ScrollKt.rememberScrollState(0, composerStartRestartGroup, 0, 1), false, null, false, 14, null);
            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composerStartRestartGroup, 0);
            long currentCompositeKeyHashCode = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
            int i3 = (int) (currentCompositeKeyHashCode ^ (currentCompositeKeyHashCode >>> 32));
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierVerticalScroll$default);
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
            TicketSummaryReceiptHeaderUIState ticketSummaryReceiptHeaderUIState = ticketSummaryReceiptCardUIState.b;
            if (ticketSummaryReceiptHeaderUIState == null) {
                composerStartRestartGroup.startReplaceGroup(-89996320);
            } else {
                composerStartRestartGroup.startReplaceGroup(-89996319);
                h(ticketSummaryReceiptHeaderUIState, composerStartRestartGroup, 0);
            }
            composerStartRestartGroup.endReplaceGroup();
            TicketSummaryReceiptStopsInfoUIState ticketSummaryReceiptStopsInfoUIState = ticketSummaryReceiptCardUIState.c;
            if (ticketSummaryReceiptStopsInfoUIState == null) {
                composerStartRestartGroup.startReplaceGroup(-89908063);
            } else {
                composerStartRestartGroup.startReplaceGroup(-89908062);
                j(ticketSummaryReceiptCardUISpec2, composerStartRestartGroup, 0);
                k(ticketSummaryReceiptStopsInfoUIState, composerStartRestartGroup, 0);
            }
            composerStartRestartGroup.endReplaceGroup();
            TicketSummaryReceiptTotalFareUIState ticketSummaryReceiptTotalFareUIState = ticketSummaryReceiptCardUIState.d;
            if (ticketSummaryReceiptTotalFareUIState == null) {
                composerStartRestartGroup.startReplaceGroup(-89752133);
            } else {
                composerStartRestartGroup.startReplaceGroup(-89752132);
                j(ticketSummaryReceiptCardUISpec2, composerStartRestartGroup, 0);
                l(ticketSummaryReceiptTotalFareUIState, ticketSummaryReceiptCardUISpec2, composerStartRestartGroup, 0);
            }
            composerStartRestartGroup.endReplaceGroup();
            TicketSummaryBusMetaInfoUIState ticketSummaryBusMetaInfoUIState = ticketSummaryReceiptCardUIState.e;
            if (ticketSummaryBusMetaInfoUIState == null) {
                composerStartRestartGroup.startReplaceGroup(-89591522);
            } else {
                composerStartRestartGroup.startReplaceGroup(-89591521);
                ChaloSpacersKt.a(ticketSummaryReceiptCardUISpec.e, composerStartRestartGroup, 0);
                f(ticketSummaryBusMetaInfoUIState, composerStartRestartGroup, 0);
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
            scopeUpdateScopeEndRestartGroup.updateScope(new cg1(i, 22, modifier, ticketSummaryReceiptCardUIState));
        }
    }

    /* JADX WARN: Failed to calculate best type for var: r11v1 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r11v1 ??, new type: int
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.calculateFromBounds(FixTypesVisitor.java:159)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.setBestType(FixTypesVisitor.java:136)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:241)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:224)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 6 more
     */
    /* JADX WARN: Failed to calculate best type for var: r11v1 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r11v1 ??, new type: int
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$1(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1612)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r11v2 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r11v2 ??, new type: int
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$1(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1612)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r11v3 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r11v3 ??, new type: int
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$1(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1612)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /*  JADX ERROR: Types fix failed
        jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r11v1 ??, new type: char
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryPossibleTypes(FixTypesVisitor.java:186)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:245)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:224)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
        Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
        	... 5 more
        */
    public static final void h(app.chalo.productsummary.ui.ticket.TicketSummaryReceiptHeaderUIState r25, androidx.compose.runtime.Composer r26, int r27) {
        /*
            Method dump skipped, instruction units count: 647
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: app.chalo.productsummary.ui.compose.TripSummaryMainScreenKt.h(app.chalo.productsummary.ui.ticket.TicketSummaryReceiptHeaderUIState, androidx.compose.runtime.Composer, int):void");
    }

    public static final void i(ImageUrlUIState imageUrlUIState, Modifier modifier, Composer composer, int i) {
        int i2;
        Composer composerStartRestartGroup = composer.startRestartGroup(-326557921);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changed(imageUrlUIState) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changed(modifier) ? 32 : 16;
        }
        if (composerStartRestartGroup.shouldExecute((i2 & 19) != 18, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-326557921, i2, -1, "app.chalo.productsummary.ui.compose.TicketSummaryReceiptProfileImage (TripSummaryMainScreen.kt:311)");
            }
            Modifier modifierThen = ClipKt.clip(Modifier.INSTANCE, RoundedCornerShapeKt.getCircleShape()).then(modifier);
            if (imageUrlUIState.f != null) {
                composerStartRestartGroup.startReplaceGroup(-385814830);
                MutableInteractionSource mutableInteractionSourceB = RippleEffectKt.b(composerStartRestartGroup);
                boolean z = (i2 & 14) == 4;
                Object objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (z || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = new l31(imageUrlUIState, 1);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                modifierThen = ClickableKt.m295clickableO2vRcR0$default(modifierThen, mutableInteractionSourceB, null, false, null, null, (Function0) objRememberedValue, 28, null);
                composerStartRestartGroup.endReplaceGroup();
            } else {
                composerStartRestartGroup.startReplaceGroup(-385607161);
                composerStartRestartGroup.endReplaceGroup();
            }
            SingletonSubcomposeAsyncImageKt.a(imageUrlUIState.f10037a, imageUrlUIState.b, modifierThen, ComposableSingletons$TripSummaryMainScreenKt.f8747a, ComposableLambdaKt.rememberComposableLambda(-176527010, true, new ut0(imageUrlUIState, 1), composerStartRestartGroup, 54), ComposableSingletons$TripSummaryMainScreenKt.b, null, null, null, null, composerStartRestartGroup, 1794048, 0, 65416);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new cg1(imageUrlUIState, modifier, i, 27));
        }
    }

    public static final void j(TicketSummaryReceiptCardUISpec ticketSummaryReceiptCardUISpec, Composer composer, int i) {
        int i2;
        Composer composerStartRestartGroup = composer.startRestartGroup(1617342462);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? composerStartRestartGroup.changed(ticketSummaryReceiptCardUISpec) : composerStartRestartGroup.changedInstance(ticketSummaryReceiptCardUISpec) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (composerStartRestartGroup.shouldExecute((i2 & 3) != 2, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1617342462, i2, -1, "app.chalo.productsummary.ui.compose.TicketSummaryReceiptSectionDivider (TripSummaryMainScreen.kt:220)");
            }
            DashedDividerKt.a(ticketSummaryReceiptCardUISpec.d, PaddingKt.m786paddingVpY3zN4$default(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), 0.0f, ticketSummaryReceiptCardUISpec.c, 1, null), composerStartRestartGroup, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new fl1(ticketSummaryReceiptCardUISpec, i, 3));
        }
    }

    public static final void k(TicketSummaryReceiptStopsInfoUIState ticketSummaryReceiptStopsInfoUIState, Composer composer, int i) {
        int i2;
        Composer composerStartRestartGroup = composer.startRestartGroup(28345298);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? composerStartRestartGroup.changed(ticketSummaryReceiptStopsInfoUIState) : composerStartRestartGroup.changedInstance(ticketSummaryReceiptStopsInfoUIState) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (composerStartRestartGroup.shouldExecute((i2 & 3) != 2, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(28345298, i2, -1, "app.chalo.productsummary.ui.compose.TicketSummaryReceiptStopsInfo (TripSummaryMainScreen.kt:375)");
            }
            Modifier.Companion companion = Modifier.INSTANCE;
            Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null);
            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getCenterHorizontally(), composerStartRestartGroup, 48);
            long currentCompositeKeyHashCode = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
            int i3 = (int) (currentCompositeKeyHashCode ^ (currentCompositeKeyHashCode >>> 32));
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierFillMaxWidth$default);
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
            Updater.m3923setimpl(composerM3915constructorimpl, modifierMaterializeModifier, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion2, composerM3915constructorimpl, Integer.valueOf(i3), composerM3915constructorimpl));
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
            TextKt.c(ticketSummaryReceiptStopsInfoUIState.f8819a, null, null, null, composerStartRestartGroup, 0, 14);
            SpacerKt.Spacer(SizeKt.m814height3ABfNKs(companion, ChaloTheme.b(composerStartRestartGroup, 0).e), composerStartRestartGroup, 0);
            TextKt.c(ticketSummaryReceiptStopsInfoUIState.b, null, null, null, composerStartRestartGroup, 0, 14);
            SpacerKt.Spacer(SizeKt.m814height3ABfNKs(companion, ChaloTheme.b(composerStartRestartGroup, 0).e), composerStartRestartGroup, 0);
            TextKt.c(ticketSummaryReceiptStopsInfoUIState.c, null, null, null, composerStartRestartGroup, 0, 14);
            composerStartRestartGroup.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new fl1(ticketSummaryReceiptStopsInfoUIState, i, 5));
        }
    }

    public static final void l(TicketSummaryReceiptTotalFareUIState ticketSummaryReceiptTotalFareUIState, TicketSummaryReceiptCardUISpec ticketSummaryReceiptCardUISpec, Composer composer, int i) {
        int i2;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1226077499);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(ticketSummaryReceiptTotalFareUIState) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= (i & 64) == 0 ? composerStartRestartGroup.changed(ticketSummaryReceiptCardUISpec) : composerStartRestartGroup.changedInstance(ticketSummaryReceiptCardUISpec) ? 32 : 16;
        }
        int i3 = i2;
        if (composerStartRestartGroup.shouldExecute((i3 & 19) != 18, i3 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1226077499, i3, -1, "app.chalo.productsummary.ui.compose.TicketSummaryReceiptTotalFare (TripSummaryMainScreen.kt:392)");
            }
            Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null);
            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getCenterHorizontally(), composerStartRestartGroup, 48);
            long currentCompositeKeyHashCode = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
            int i4 = (int) ((currentCompositeKeyHashCode >>> 32) ^ currentCompositeKeyHashCode);
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierFillMaxWidth$default);
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
            Updater.m3923setimpl(composerM3915constructorimpl, modifierMaterializeModifier, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion, composerM3915constructorimpl, Integer.valueOf(i4), composerM3915constructorimpl));
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
            composerStartRestartGroup.startReplaceGroup(-1372616266);
            ArrayList arrayList = ticketSummaryReceiptTotalFareUIState.f8820a;
            int size = arrayList.size();
            int i5 = 0;
            int i6 = 0;
            while (i5 < size) {
                Object obj = arrayList.get(i5);
                int i7 = i5 + 1;
                int i8 = i6 + 1;
                if (i6 < 0) {
                    CollectionsKt.z0();
                    throw null;
                }
                TextKt.c((TextUIState) obj, null, null, null, composerStartRestartGroup, 0, 14);
                if (i6 != CollectionsKt.K(arrayList)) {
                    composerStartRestartGroup.startReplaceGroup(744715693);
                    gf.r(Modifier.INSTANCE, ChaloTheme.b(composerStartRestartGroup, 0).f, composerStartRestartGroup, 0);
                } else {
                    composerStartRestartGroup.startReplaceGroup(730549034);
                    composerStartRestartGroup.endReplaceGroup();
                }
                i5 = i7;
                i6 = i8;
            }
            composerStartRestartGroup.endReplaceGroup();
            if (arrayList.isEmpty()) {
                composerStartRestartGroup.startReplaceGroup(384524755);
            } else {
                composerStartRestartGroup.startReplaceGroup(398842291);
                j(ticketSummaryReceiptCardUISpec, composerStartRestartGroup, (i3 >> 3) & 14);
            }
            composerStartRestartGroup.endReplaceGroup();
            TextKt.c(ticketSummaryReceiptTotalFareUIState.b, null, null, null, composerStartRestartGroup, 0, 14);
            composerStartRestartGroup.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new cg1(ticketSummaryReceiptTotalFareUIState, ticketSummaryReceiptCardUISpec, i, 25));
        }
    }

    public static final void m(TicketSummaryScreenType.Success.CommonReceipt uiState, Composer composer, int i) {
        int i2;
        Composer composer2;
        Intrinsics.i(uiState, "uiState");
        FullScreenImageUIState fullScreenImageUIState = uiState.b;
        Object obj = uiState.f8825a;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1768939550);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(uiState) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        int i3 = 1;
        if (composerStartRestartGroup.shouldExecute((i2 & 3) != 2, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1768939550, i2, -1, "app.chalo.productsummary.ui.compose.TicketSummarySuccessMainScreen (TripSummaryMainScreen.kt:448)");
            }
            boolean zChanged = composerStartRestartGroup.changed(obj);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                composerStartRestartGroup.updateRememberedValue(obj);
            } else {
                obj = objRememberedValue;
            }
            TicketSummarySuccessScreenUIState ticketSummarySuccessScreenUIState = (TicketSummarySuccessScreenUIState) obj;
            boolean zChanged2 = composerStartRestartGroup.changed(ticketSummarySuccessScreenUIState.f8826a);
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (zChanged2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue2 = ticketSummarySuccessScreenUIState.f8826a;
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            ProductSummarySuccessScreenUISpec productSummarySuccessScreenUISpec = (ProductSummarySuccessScreenUISpec) objRememberedValue2;
            Modifier.Companion companion = Modifier.INSTANCE;
            Modifier modifierFillMaxSize$default = SizeKt.fillMaxSize$default(companion, 0.0f, 1, null);
            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
            long currentCompositeKeyHashCode = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
            int i4 = (int) (currentCompositeKeyHashCode ^ (currentCompositeKeyHashCode >>> 32));
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
            pk0.v(companion2, composerM3915constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy, composerM3915constructorimpl, currentCompositionLocalMap);
            Updater.m3923setimpl(composerM3915constructorimpl, modifierMaterializeModifier, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion2, composerM3915constructorimpl, Integer.valueOf(i4), composerM3915constructorimpl));
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            ScaffoldKt.m2316ScaffoldTvnljyQ(SizeKt.fillMaxSize$default(companion, 0.0f, 1, null), ComposableLambdaKt.rememberComposableLambda(-703914964, true, new zl1(ticketSummarySuccessScreenUIState, i3), composerStartRestartGroup, 54), null, null, null, 0, 0L, 0L, null, ComposableLambdaKt.rememberComposableLambda(1893864439, true, new ob(27, productSummarySuccessScreenUISpec, ticketSummarySuccessScreenUIState, uiState), composerStartRestartGroup, 54), composerStartRestartGroup, 805306422, TypedValues.PositionType.TYPE_CURVE_FIT);
            composer2 = composerStartRestartGroup;
            if (fullScreenImageUIState != null) {
                composer2.startReplaceGroup(-1121745054);
                FullScreenImageSectionKt.a(fullScreenImageUIState, composer2, 0);
            } else {
                composer2.startReplaceGroup(-1144565766);
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
            scopeUpdateScopeEndRestartGroup.updateScope(new fl1(uiState, i, 9));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void n(TicketSummaryComponent ticketSummaryComponent, Composer composer, int i) {
        int i2;
        Composer composerStartRestartGroup = composer.startRestartGroup(48083504);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(ticketSummaryComponent) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (composerStartRestartGroup.shouldExecute((i2 & 3) != 2, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(48083504, i2, -1, "app.chalo.productsummary.ui.compose.TripSummaryMainScreen (TripSummaryMainScreen.kt:94)");
            }
            MutableState mutableStateA = SubscribeAsStateKt.a(ticketSummaryComponent.t0(), composerStartRestartGroup);
            boolean zChanged = composerStartRestartGroup.changed(mutableStateA);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new y5(mutableStateA, 24);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            BackHandlerKt.a(false, (Function0) objRememberedValue, 0, 0, composerStartRestartGroup, 3);
            ComposeUtils_androidKt.a(composerStartRestartGroup, 0);
            o((TicketSummaryViewState) mutableStateA.getValue(), composerStartRestartGroup, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new fl1(ticketSummaryComponent, i, 7));
        }
    }

    public static final void o(TicketSummaryViewState ticketSummaryViewState, Composer composer, int i) {
        int i2;
        Composer composerStartRestartGroup = composer.startRestartGroup(-180226678);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? composerStartRestartGroup.changed(ticketSummaryViewState) : composerStartRestartGroup.changedInstance(ticketSummaryViewState) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (composerStartRestartGroup.shouldExecute((i2 & 3) != 2, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-180226678, i2, -1, "app.chalo.productsummary.ui.compose.TripSummaryMainScreenContent (TripSummaryMainScreen.kt:111)");
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
            Updater.m3923setimpl(composerM3915constructorimpl, modifierMaterializeModifier, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion2, composerM3915constructorimpl, Integer.valueOf(i3), composerM3915constructorimpl));
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
            TicketSummaryScreenType ticketSummaryScreenType = ticketSummaryViewState.b;
            LoadingDialogUIState loadingDialogUIState = ticketSummaryViewState.c;
            if (ticketSummaryScreenType instanceof TicketSummaryScreenType.Error) {
                composerStartRestartGroup.startReplaceGroup(-1863700153);
                StandardErrorScreenKt.b(((TicketSummaryScreenType.Error) ticketSummaryScreenType).f8822a, SizeKt.fillMaxSize$default(companion, 0.0f, 1, null), composerStartRestartGroup, 48);
                composerStartRestartGroup.endReplaceGroup();
            } else if (ticketSummaryScreenType instanceof TicketSummaryScreenType.Loading) {
                composerStartRestartGroup.startReplaceGroup(-1863693907);
                ChaloCircularLoadingBoxKt.a(null, composerStartRestartGroup, 0);
                composerStartRestartGroup.endReplaceGroup();
            } else if (ticketSummaryScreenType instanceof TicketSummaryScreenType.Success.CommonReceipt) {
                composerStartRestartGroup.startReplaceGroup(-1863690978);
                m((TicketSummaryScreenType.Success.CommonReceipt) ticketSummaryScreenType, composerStartRestartGroup, 0);
                composerStartRestartGroup.endReplaceGroup();
            } else {
                if (!(ticketSummaryScreenType instanceof TicketSummaryScreenType.Success.BMTCReceipt)) {
                    throw pk0.p(composerStartRestartGroup, -1863702711);
                }
                composerStartRestartGroup.startReplaceGroup(-1863687593);
                d(((TicketSummaryScreenType.Success.BMTCReceipt) ticketSummaryScreenType).f8824a, composerStartRestartGroup, 0);
                composerStartRestartGroup.endReplaceGroup();
            }
            if (loadingDialogUIState != null) {
                t8.m(composerStartRestartGroup, -1939612162, loadingDialogUIState, composerStartRestartGroup, 0);
            } else {
                composerStartRestartGroup.startReplaceGroup(-1945722386);
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
            scopeUpdateScopeEndRestartGroup.updateScope(new fl1(ticketSummaryViewState, i, 8));
        }
    }
}
