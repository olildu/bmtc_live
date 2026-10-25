package app.chalo.home.ui.history.compose;

import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.OverscrollEffect;
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
import androidx.compose.foundation.lazy.LazyDslKt;
import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.foundation.lazy.LazyListStateKt;
import androidx.compose.foundation.shape.RoundedCornerShape;
import androidx.compose.material3.SheetState;
import androidx.compose.material3.TabRowKt;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.ZIndexModifierKt;
import androidx.compose.ui.draw.ClipKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.OnGloballyPositionedModifierKt;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import app.chalo.compose.ContactSupportTextComposableKt;
import app.chalo.compose.HomeOverscrollEffect_androidKt;
import app.chalo.compose.components.ChaloGradientBackgroundKt;
import app.chalo.compose.components.ChaloGridLayoutKt;
import app.chalo.compose.components.ChaloRoundedCardKt;
import app.chalo.compose.components.ChaloSpacersKt;
import app.chalo.compose.components.ChaloTabTitleKt;
import app.chalo.compose.components.ChaloTextViewKt;
import app.chalo.compose.components.ComposeUtils_androidKt;
import app.chalo.compose.components.PlotlineComposeWidgetKt;
import app.chalo.compose.components.TextKt;
import app.chalo.compose.components.image.CommonImageKt;
import app.chalo.compose.theme.ChaloTheme;
import app.chalo.compose.theme.ChaloThemeHelper;
import app.chalo.compose.theme.ChaloThemeKt;
import app.chalo.home.ui.HomeTabScreensRetainedData;
import app.chalo.home.ui.history.compose.MyTicketsScreenUIKt;
import app.chalo.home.ui.history.compose.components.ChaloTextAndImageViewKt;
import app.chalo.home.ui.history.compose.components.NotificationTurnOnExplainerScreenUIKt;
import app.chalo.home.ui.history.uistate.EmptyScreenProductBookingOptionsUiState;
import app.chalo.home.ui.history.uistate.EmptyScreenSpec;
import app.chalo.home.ui.history.uistate.EmptyScreenUiState;
import app.chalo.home.ui.history.uistate.MyTicketFloatingButtonSpec;
import app.chalo.home.ui.history.uistate.MyTicketFloatingButtonUiState;
import app.chalo.home.ui.history.uistate.MyTicketsHeaderUiState;
import app.chalo.home.ui.history.uistate.MyTicketsLoginNudgeUIState;
import app.chalo.home.ui.history.uistate.ProductReclaimUiState;
import app.chalo.home.ui.history.uistate.ProductsTabUiState;
import app.chalo.home.ui.history.uistate.SeeMoreIconUISpec;
import app.chalo.home.ui.history.uistate.SeeMoreIconUiState;
import app.chalo.home.ui.history.uistate.SeeMoreSectionUISpec;
import app.chalo.home.ui.history.uistate.SeeMoreSectionUiState;
import app.chalo.home.ui.history.uistate.TicketsFloatingButtonContainerSpec;
import app.chalo.home.ui.history.uistate.TicketsFloatingButtonContainerUiState;
import app.chalo.home.ui.history.uistate.TicketsHeaderUISpec;
import app.chalo.home.ui.history.uistate.bottomsheet.MyTicketBottomSheetUiState;
import app.chalo.providers.iconassetprovider.IconType;
import app.chalo.uistate.base.ChaloColorToken;
import app.chalo.uistate.base.ChaloColorTokenKt;
import app.chalo.uistate.base.UiEventHandler;
import app.chalo.uistate.base.UiEventHandler$Companion$fromLambda$1;
import app.chalo.uistate.bottomsheet.BottomSheetUiStateKt;
import app.chalo.uistate.dialog.ConfirmationDialogUiState;
import app.chalo.uistate.dialog.LoadingDialogUIState;
import app.chalo.uistate.error.StandardErrorScreenUIState;
import app.chalo.uistate.image.ImageUISize;
import app.chalo.uistate.image.ImageUIState;
import app.chalo.uistate.image.UIContentScale;
import app.chalo.uistate.image.UISize;
import app.chalo.uistate.text.TextUIState;
import app.zophop.homescreen.MyTicketsViewState;
import app.zophop.homescreen.MyTicketsViewStateSpec;
import defpackage.b3;
import defpackage.b9;
import defpackage.dd;
import defpackage.f0;
import defpackage.gd0;
import defpackage.gf;
import defpackage.h3;
import defpackage.la0;
import defpackage.na;
import defpackage.pk0;
import defpackage.r1;
import defpackage.t8;
import defpackage.u3;
import defpackage.u50;
import defpackage.wk0;
import defpackage.wl;
import defpackage.zk0;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KFunction;
import kotlinx.coroutines.CoroutineScope;
import okhttp3.internal.ws.WebSocketProtocol;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002¨\u0006\u0002²\u0006\u000e\u0010\u0001\u001a\u00020\u00008\n@\nX\u008a\u008e\u0002"}, d2 = {"Landroidx/compose/ui/unit/Dp;", "heightInDp", "home_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class MyTicketsScreenUIKt {
    public static final void a(final ProductsTabUiState productsTabUiState, Composer composer, final int i) {
        int i2;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1266175911);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(productsTabUiState) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (composerStartRestartGroup.shouldExecute((i2 & 3) != 2, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1266175911, i2, -1, "app.chalo.home.ui.history.compose.ActiveExpiredTicketPassesFilterTab (MyTicketsScreenUI.kt:637)");
            }
            if (productsTabUiState.b.isEmpty()) {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                    final int i3 = 0;
                    scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: al0
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            int i4 = i3;
                            Composer composer2 = (Composer) obj;
                            ((Integer) obj2).intValue();
                            switch (i4) {
                                case 0:
                                    MyTicketsScreenUIKt.a(productsTabUiState, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1));
                                    break;
                                default:
                                    MyTicketsScreenUIKt.a(productsTabUiState, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1));
                                    break;
                            }
                            return Unit.f17538a;
                        }
                    });
                    return;
                }
                return;
            }
            Modifier.Companion companion = Modifier.INSTANCE;
            ChaloColorToken.White white = ChaloColorToken.White.f9870a;
            Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(BackgroundKt.m264backgroundbw27NRU$default(companion, ChaloColorTokenKt.c(white), null, 2, null), 0.0f, 1, null);
            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composerStartRestartGroup, 0);
            long currentCompositeKeyHashCode = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
            int i4 = (int) (currentCompositeKeyHashCode ^ (currentCompositeKeyHashCode >>> 32));
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierFillMaxWidth$default);
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
            TabRowKt.m2534TabRowpAZo6Ak(productsTabUiState.c, PaddingKt.m784padding3ABfNKs(SizeKt.fillMaxWidth$default(PlotlineComposeWidgetKt.a(companion, "PL_Active_Expired_Tab"), 0.0f, 1, null), ChaloTheme.b(composerStartRestartGroup, 0).h), ChaloColorTokenKt.c(white), 0L, ComposableLambdaKt.rememberComposableLambda(1670380555, true, new la0(productsTabUiState, 9), composerStartRestartGroup, 54), ComposableSingletons$MyTicketsScreenUIKt.b, ComposableLambdaKt.rememberComposableLambda(365038091, true, new h3(24, productsTabUiState, ColumnScopeInstance.INSTANCE), composerStartRestartGroup, 54), composerStartRestartGroup, 1794048, 8);
            SpacerKt.Spacer(SizeKt.m814height3ABfNKs(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), ChaloTheme.b(composerStartRestartGroup, 0).h), composerStartRestartGroup, 0);
            composerStartRestartGroup.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup2 = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup2 != null) {
            final int i5 = 1;
            scopeUpdateScopeEndRestartGroup2.updateScope(new Function2() { // from class: al0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    int i6 = i5;
                    Composer composer2 = (Composer) obj;
                    ((Integer) obj2).intValue();
                    switch (i6) {
                        case 0:
                            MyTicketsScreenUIKt.a(productsTabUiState, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1));
                            break;
                        default:
                            MyTicketsScreenUIKt.a(productsTabUiState, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1));
                            break;
                    }
                    return Unit.f17538a;
                }
            });
        }
    }

    public static final void b(Modifier modifier, EmptyScreenUiState uiState, Composer composer, int i) {
        int i2;
        Intrinsics.i(uiState, "uiState");
        Object obj = uiState.f3470a;
        EmptyScreenProductBookingOptionsUiState emptyScreenProductBookingOptionsUiState = uiState.e;
        Composer composerStartRestartGroup = composer.startRestartGroup(1224086377);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changed(modifier) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= (i & 64) == 0 ? composerStartRestartGroup.changed(uiState) : composerStartRestartGroup.changedInstance(uiState) ? 32 : 16;
        }
        int i3 = 1;
        if (composerStartRestartGroup.shouldExecute((i2 & 19) != 18, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1224086377, i2, -1, "app.chalo.home.ui.history.compose.EmptyStateScreenUI (MyTicketsScreenUI.kt:527)");
            }
            boolean zChanged = composerStartRestartGroup.changed(obj);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                composerStartRestartGroup.updateRememberedValue(obj);
            } else {
                obj = objRememberedValue;
            }
            EmptyScreenSpec emptyScreenSpec = (EmptyScreenSpec) obj;
            Alignment.Companion companion = Alignment.INSTANCE;
            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(companion.getCenter(), false);
            long currentCompositeKeyHashCode = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
            int i4 = (int) (currentCompositeKeyHashCode ^ (currentCompositeKeyHashCode >>> 32));
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifier);
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
            pk0.v(companion2, composerM3915constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy, composerM3915constructorimpl, currentCompositionLocalMap);
            Updater.m3923setimpl(composerM3915constructorimpl, modifierMaterializeModifier, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion2, composerM3915constructorimpl, Integer.valueOf(i4), composerM3915constructorimpl));
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            Modifier.Companion companion3 = Modifier.INSTANCE;
            Modifier modifierC = ChaloThemeKt.c(BackgroundKt.m264backgroundbw27NRU$default(SizeKt.fillMaxWidth$default(companion3, 0.0f, 1, null), ChaloColorTokenKt.c(emptyScreenSpec.b), null, 2, null), emptyScreenSpec.f3469a);
            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getCenter(), companion.getCenterHorizontally(), composerStartRestartGroup, 54);
            long currentCompositeKeyHashCode2 = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
            int i5 = (int) (currentCompositeKeyHashCode2 ^ (currentCompositeKeyHashCode2 >>> 32));
            CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierC);
            Function0<ComposeUiNode> constructor2 = companion2.getConstructor();
            if (!(composerStartRestartGroup.getApplier() != null)) {
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
            ContactSupportTextComposableKt.a(ChaloThemeKt.c(companion3, emptyScreenSpec.d), uiState.c, composerStartRestartGroup, 64);
            ChaloSpacersKt.a(emptyScreenSpec.e, composerStartRestartGroup, 0);
            TextUIState.ChaloTextUIState chaloTextUIState = uiState.d;
            composerStartRestartGroup.startReplaceGroup(-802334149);
            ChaloTabTitleKt.b(null, chaloTextUIState, composerStartRestartGroup, 0, 1);
            composerStartRestartGroup.endReplaceGroup();
            ChaloSpacersKt.a(emptyScreenSpec.f, composerStartRestartGroup, 0);
            if (emptyScreenProductBookingOptionsUiState instanceof EmptyScreenProductBookingOptionsUiState.ProductGridContainer) {
                composerStartRestartGroup.startReplaceGroup(-802034162);
                ChaloGridLayoutKt.a(SizeKt.fillMaxWidth$default(companion3, 0.0f, 1, null), ((EmptyScreenProductBookingOptionsUiState.ProductGridContainer) emptyScreenProductBookingOptionsUiState).f3468a, ComposableLambdaKt.rememberComposableLambda(-867672337, true, new la0(uiState, 8), composerStartRestartGroup, 54), composerStartRestartGroup, 390, 0);
                composerStartRestartGroup.endReplaceGroup();
            } else {
                if (!(emptyScreenProductBookingOptionsUiState instanceof EmptyScreenProductBookingOptionsUiState.ProductCard)) {
                    throw pk0.p(composerStartRestartGroup, 1913786749);
                }
                composerStartRestartGroup.startReplaceGroup(-801511409);
                ChaloTextAndImageViewKt.a(null, ((EmptyScreenProductBookingOptionsUiState.ProductCard) emptyScreenProductBookingOptionsUiState).f3467a, composerStartRestartGroup, 0);
                composerStartRestartGroup.endReplaceGroup();
            }
            if (r1.k(composerStartRestartGroup)) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new zk0(modifier, uiState, i, i3));
        }
    }

    public static final void c(Modifier modifier, MyTicketFloatingButtonUiState uiState, Composer composer, int i) {
        int i2;
        Intrinsics.i(uiState, "uiState");
        Object obj = uiState.f3474a;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1601436822);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changed(modifier) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(uiState) ? 32 : 16;
        }
        if (composerStartRestartGroup.shouldExecute((i2 & 19) != 18, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1601436822, i2, -1, "app.chalo.home.ui.history.compose.MyTicketFloatingButton (MyTicketsScreenUI.kt:496)");
            }
            boolean zChanged = composerStartRestartGroup.changed(obj);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                composerStartRestartGroup.updateRememberedValue(obj);
            } else {
                obj = objRememberedValue;
            }
            MyTicketFloatingButtonSpec myTicketFloatingButtonSpec = (MyTicketFloatingButtonSpec) obj;
            RoundedCornerShape roundedCornerShapeD = ChaloThemeKt.d(myTicketFloatingButtonSpec.c);
            Modifier modifierA = PlotlineComposeWidgetKt.a(modifier, "PL_Buy_Ticket_Pass_Button");
            boolean zChangedInstance = composerStartRestartGroup.changedInstance(uiState);
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue2 = new gd0(uiState, 23);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            ChaloRoundedCardKt.b(ClickableKt.m299clickableoSLSa3U$default(modifierA, false, null, null, null, (Function0) objRememberedValue2, 15, null), roundedCornerShapeD, 0.0f, 0.0f, ComposableLambdaKt.rememberComposableLambda(1009424299, true, new u50(8, myTicketFloatingButtonSpec, uiState), composerStartRestartGroup, 54), composerStartRestartGroup, 24576, 12);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new zk0(modifier, uiState, i, 0));
        }
    }

    public static final void d(Modifier modifier, MyTicketsHeaderUiState uiState, Composer composer, int i) {
        int i2;
        Intrinsics.i(uiState, "uiState");
        Object obj = uiState.f3475a;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1160901552);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changed(modifier) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(uiState) ? 32 : 16;
        }
        if (composerStartRestartGroup.shouldExecute((i2 & 19) != 18, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1160901552, i2, -1, "app.chalo.home.ui.history.compose.MyTicketsHeader (MyTicketsScreenUI.kt:581)");
            }
            boolean zChanged = composerStartRestartGroup.changed(obj);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                composerStartRestartGroup.updateRememberedValue(obj);
            } else {
                obj = objRememberedValue;
            }
            Modifier modifierC = ChaloThemeKt.c(modifier, ((TicketsHeaderUISpec) obj).f3491a);
            Alignment.Companion companion = Alignment.INSTANCE;
            Alignment.Vertical centerVertically = companion.getCenterVertically();
            Arrangement arrangement = Arrangement.INSTANCE;
            MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(arrangement.getSpaceBetween(), centerVertically, composerStartRestartGroup, 54);
            long currentCompositeKeyHashCode = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
            int i3 = (int) (currentCompositeKeyHashCode ^ (currentCompositeKeyHashCode >>> 32));
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierC);
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
            ChaloTextViewKt.a(null, uiState.b, null, null, composerStartRestartGroup, 0, 13);
            SeeMoreSectionUiState seeMoreSectionUiState = uiState.c;
            if (seeMoreSectionUiState == null) {
                composerStartRestartGroup.startReplaceGroup(-879755565);
            } else {
                SeeMoreSectionUISpec seeMoreSectionUISpec = seeMoreSectionUiState.f3484a;
                composerStartRestartGroup.startReplaceGroup(-879755564);
                Modifier.Companion companion3 = Modifier.INSTANCE;
                Modifier modifierC2 = ChaloThemeKt.c(companion3, seeMoreSectionUISpec.f3483a);
                UiEventHandler$Companion$fromLambda$1 uiEventHandler$Companion$fromLambda$1 = seeMoreSectionUiState.d;
                boolean zChangedInstance = composerStartRestartGroup.changedInstance(uiEventHandler$Companion$fromLambda$1);
                Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                if (zChangedInstance || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue2 = new MyTicketsScreenUIKt$MyTicketsHeader$1$1$1$1(0, uiEventHandler$Companion$fromLambda$1, UiEventHandler.class, "onClick", "onClick()V", 0);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                }
                Modifier modifierM299clickableoSLSa3U$default = ClickableKt.m299clickableoSLSa3U$default(modifierC2, false, null, null, null, (Function0) ((KFunction) objRememberedValue2), 15, null);
                MeasurePolicy measurePolicyRowMeasurePolicy2 = RowKt.rowMeasurePolicy(arrangement.getStart(), companion.getCenterVertically(), composerStartRestartGroup, 48);
                long currentCompositeKeyHashCode2 = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
                int i4 = (int) (currentCompositeKeyHashCode2 ^ (currentCompositeKeyHashCode2 >>> 32));
                CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierM299clickableoSLSa3U$default);
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
                pk0.v(companion2, composerM3915constructorimpl2, measurePolicyRowMeasurePolicy2, composerM3915constructorimpl2, currentCompositionLocalMap2);
                Updater.m3923setimpl(composerM3915constructorimpl2, modifierMaterializeModifier2, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion2, composerM3915constructorimpl2, Integer.valueOf(i4), composerM3915constructorimpl2));
                ChaloTextViewKt.a(null, seeMoreSectionUiState.b, null, null, composerStartRestartGroup, 0, 13);
                ChaloSpacersKt.a(seeMoreSectionUISpec.b, composerStartRestartGroup, 0);
                composerStartRestartGroup.startReplaceGroup(134796977);
                SeeMoreIconUiState seeMoreIconUiState = seeMoreSectionUiState.c;
                boolean zChanged2 = composerStartRestartGroup.changed(seeMoreIconUiState.b);
                Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                if (zChanged2 || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue3 = seeMoreIconUiState.b;
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                }
                SeeMoreIconUISpec seeMoreIconUISpec = (SeeMoreIconUISpec) objRememberedValue3;
                UISize uISize = seeMoreIconUISpec.c;
                Modifier modifierM264backgroundbw27NRU$default = BackgroundKt.m264backgroundbw27NRU$default(ClipKt.clip(SizeKt.m830sizeVpY3zN4(companion3, uISize.b, uISize.f10038a), ChaloThemeKt.d(seeMoreIconUISpec.b)), ChaloColorTokenKt.c(seeMoreIconUISpec.f3481a), null, 2, null);
                MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(companion.getCenter(), false);
                long currentCompositeKeyHashCode3 = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
                int i5 = (int) (currentCompositeKeyHashCode3 ^ (currentCompositeKeyHashCode3 >>> 32));
                CompositionLocalMap currentCompositionLocalMap3 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier3 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierM264backgroundbw27NRU$default);
                Function0<ComposeUiNode> constructor3 = companion2.getConstructor();
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
                pk0.v(companion2, composerM3915constructorimpl3, measurePolicyMaybeCachedBoxMeasurePolicy, composerM3915constructorimpl3, currentCompositionLocalMap3);
                Updater.m3923setimpl(composerM3915constructorimpl3, modifierMaterializeModifier3, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion2, composerM3915constructorimpl3, Integer.valueOf(i5), composerM3915constructorimpl3));
                BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                CommonImageKt.a(seeMoreIconUiState.f3482a, null, false, composerStartRestartGroup, 0, 6);
                composerStartRestartGroup = composerStartRestartGroup;
                composerStartRestartGroup.endNode();
                composerStartRestartGroup.endReplaceGroup();
                composerStartRestartGroup.endNode();
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
            scopeUpdateScopeEndRestartGroup.updateScope(new zk0(modifier, uiState, i, 3));
        }
    }

    public static final void e(MyTicketsViewState viewState, Function1 sendIntent, SheetState modalBottomSheetState, boolean z, int i, Composer composer, int i2) {
        int i3;
        boolean z2;
        int i4;
        Object obj;
        SheetState sheetState;
        Intrinsics.i(viewState, "viewState");
        StandardErrorScreenUIState.ErrorWithMsgAndRetry errorWithMsgAndRetry = viewState.c;
        MyTicketBottomSheetUiState myTicketBottomSheetUiState = viewState.k;
        Intrinsics.i(sendIntent, "sendIntent");
        Intrinsics.i(modalBottomSheetState, "modalBottomSheetState");
        Composer composerStartRestartGroup = composer.startRestartGroup(-1311658296);
        if ((i2 & 6) == 0) {
            i3 = (composerStartRestartGroup.changedInstance(viewState) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(sendIntent) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= composerStartRestartGroup.changed(modalBottomSheetState) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            z2 = z;
            i3 |= composerStartRestartGroup.changed(z2) ? 2048 : 1024;
        } else {
            z2 = z;
        }
        if ((i2 & 24576) == 0) {
            i4 = i;
            i3 |= composerStartRestartGroup.changed(i4) ? 16384 : 8192;
        } else {
            i4 = i;
        }
        int i5 = i3;
        if (composerStartRestartGroup.shouldExecute((i5 & 9363) != 9362, i5 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1311658296, i5, -1, "app.chalo.home.ui.history.compose.MyTicketsScreenUI (MyTicketsScreenUI.kt:99)");
            }
            if (errorWithMsgAndRetry != null) {
                composerStartRestartGroup.startReplaceGroup(420577);
                NotificationTurnOnExplainerScreenUIKt.a(null, errorWithMsgAndRetry, composerStartRestartGroup, 0);
                composerStartRestartGroup.endReplaceGroup();
            } else {
                composerStartRestartGroup.startReplaceGroup(553226);
                int i6 = i5 >> 3;
                j(viewState, sendIntent, z2, i4, composerStartRestartGroup, (i5 & WebSocketProtocol.PAYLOAD_SHORT) | (i6 & 896) | (i6 & 7168));
                composerStartRestartGroup.endReplaceGroup();
            }
            if (Intrinsics.d(myTicketBottomSheetUiState, MyTicketBottomSheetUiState.None.b)) {
                sheetState = modalBottomSheetState;
                composerStartRestartGroup.startReplaceGroup(-4654278);
            } else {
                composerStartRestartGroup.startReplaceGroup(893265);
                int i7 = i5 & 896;
                sheetState = modalBottomSheetState;
                BottomSheetUiStateKt.a(null, myTicketBottomSheetUiState.getF3492a(), sheetState, ComposableLambdaKt.rememberComposableLambda(351873806, true, new wk0(obj, 2), composerStartRestartGroup, 54), composerStartRestartGroup, i7 | 27648, 1);
                boolean zChangedInstance = composerStartRestartGroup.changedInstance(obj) | (i7 == 256);
                Object objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = new MyTicketsScreenUIKt$MyTicketsScreenUI$2$1(viewState, sheetState, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                EffectsKt.LaunchedEffect(myTicketBottomSheetUiState, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue, composerStartRestartGroup, 0);
            }
            composerStartRestartGroup.endReplaceGroup();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            obj = viewState;
            sheetState = modalBottomSheetState;
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new na(obj, sendIntent, sheetState, z, i, i2, 7));
        }
    }

    public static final void f(Modifier modifier, ProductReclaimUiState productReclaimUiState, Composer composer, int i) {
        int i2;
        Modifier modifier2;
        Composer composerStartRestartGroup = composer.startRestartGroup(2126994106);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changed(modifier) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= (i & 64) == 0 ? composerStartRestartGroup.changed(productReclaimUiState) : composerStartRestartGroup.changedInstance(productReclaimUiState) ? 32 : 16;
        }
        if (composerStartRestartGroup.shouldExecute((i2 & 19) != 18, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(2126994106, i2, -1, "app.chalo.home.ui.history.compose.ReclaimProductCard (MyTicketsScreenUI.kt:703)");
            }
            modifier2 = modifier;
            ChaloRoundedCardKt.b(modifier2, null, 0.0f, 0.0f, ComposableLambdaKt.rememberComposableLambda(1014597755, true, new u50(10, productReclaimUiState.f3478a, productReclaimUiState), composerStartRestartGroup, 54), composerStartRestartGroup, (i2 & 14) | 24576, 14);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            modifier2 = modifier;
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new zk0(modifier2, productReclaimUiState, i, 4));
        }
    }

    public static final void g(Composer composer, int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(-1414520165);
        if (composerStartRestartGroup.shouldExecute(i != 0, i & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1414520165, i, -1, "app.chalo.home.ui.history.compose.ShimmerCardUI (MyTicketsScreenUI.kt:776)");
            }
            ChaloRoundedCardKt.b(PaddingKt.m784padding3ABfNKs(BackgroundKt.m264backgroundbw27NRU$default(Modifier.INSTANCE, ChaloColorTokenKt.c(ChaloColorToken.White.f9870a), null, 2, null), ChaloTheme.b(composerStartRestartGroup, 0).h), null, 0.0f, 0.0f, ComposableSingletons$MyTicketsScreenUIKt.c, composerStartRestartGroup, 24576, 14);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new wl(i, 9));
        }
    }

    public static final void h(MyTicketsLoginNudgeUIState myTicketsLoginNudgeUIState, Modifier modifier, Composer composer, int i) {
        int i2;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1312167481);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changed(myTicketsLoginNudgeUIState) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changed(modifier) ? 32 : 16;
        }
        if (composerStartRestartGroup.shouldExecute((i2 & 19) != 18, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1312167481, i2, -1, "app.chalo.home.ui.history.compose.TicketsPageLoginNudge (MyTicketsScreenUI.kt:752)");
            }
            Modifier modifierFillMaxSize$default = SizeKt.fillMaxSize$default(modifier, 0.0f, 1, null);
            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getCenter(), Alignment.INSTANCE.getCenterHorizontally(), composerStartRestartGroup, 54);
            long currentCompositeKeyHashCode = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
            int i3 = (int) ((currentCompositeKeyHashCode >>> 32) ^ currentCompositeKeyHashCode);
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
            Updater.m3923setimpl(composerM3915constructorimpl, modifierMaterializeModifier, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion, composerM3915constructorimpl, Integer.valueOf(i3), composerM3915constructorimpl));
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
            float fC = ComposeUtils_androidKt.c(composerStartRestartGroup);
            boolean zChanged = composerStartRestartGroup.changed(myTicketsLoginNudgeUIState.f3476a) | composerStartRestartGroup.changed(fC);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                ImageUIState imageUIState = myTicketsLoginNudgeUIState.f3476a;
                ImageUISize imageUISize = new ImageUISize(null, Dp.m7276boximpl(Dp.m7278constructorimpl(fC / 2)), 1);
                IconType img = imageUIState.f10035a;
                String str = imageUIState.b;
                ChaloColorToken chaloColorToken = imageUIState.c;
                UIContentScale contentScale = imageUIState.e;
                float f = imageUIState.f;
                float f2 = imageUIState.g;
                UiEventHandler uiEventHandler = imageUIState.h;
                Intrinsics.i(img, "img");
                Intrinsics.i(contentScale, "contentScale");
                ImageUIState imageUIState2 = new ImageUIState(img, str, chaloColorToken, imageUISize, contentScale, f, f2, uiEventHandler);
                composerStartRestartGroup.updateRememberedValue(imageUIState2);
                objRememberedValue = imageUIState2;
            }
            CommonImageKt.a((ImageUIState) objRememberedValue, null, false, composerStartRestartGroup, 0, 6);
            TextKt.c(myTicketsLoginNudgeUIState.b, ChaloThemeKt.c(Modifier.INSTANCE, myTicketsLoginNudgeUIState.d), null, null, composerStartRestartGroup, 0, 12);
            composerStartRestartGroup = composerStartRestartGroup;
            if (b3.s(0, 1, composerStartRestartGroup, null, myTicketsLoginNudgeUIState.c)) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new zk0(i, 2, modifier, myTicketsLoginNudgeUIState));
        }
    }

    public static final void i(Composer composer, int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(312565137);
        if (composerStartRestartGroup.shouldExecute(i != 0, i & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(312565137, i, -1, "app.chalo.home.ui.history.compose.TicketsPageShimmerUI (MyTicketsScreenUI.kt:740)");
            }
            Modifier.Companion companion = Modifier.INSTANCE;
            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composerStartRestartGroup, 0);
            long currentCompositeKeyHashCode = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
            int i2 = (int) (currentCompositeKeyHashCode ^ (currentCompositeKeyHashCode >>> 32));
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
            Updater.m3923setimpl(composerM3915constructorimpl, modifierMaterializeModifier, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion2, composerM3915constructorimpl, Integer.valueOf(i2), composerM3915constructorimpl));
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
            ChaloSpacersKt.a(ChaloThemeHelper.a().h, composerStartRestartGroup, 0);
            g(composerStartRestartGroup, 0);
            g(composerStartRestartGroup, 0);
            composerStartRestartGroup.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new wl(i, 8));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r14v10 */
    /* JADX WARN: Type inference failed for: r14v5 */
    /* JADX WARN: Type inference failed for: r14v6, types: [boolean, int] */
    public static final void j(MyTicketsViewState myTicketsViewState, Function1 function1, boolean z, int i, Composer composer, int i2) {
        int i3;
        ?? r14;
        Composer composerStartRestartGroup = composer.startRestartGroup(-923732113);
        if ((i2 & 6) == 0) {
            i3 = (composerStartRestartGroup.changedInstance(myTicketsViewState) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(function1) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= composerStartRestartGroup.changed(z) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i3 |= composerStartRestartGroup.changed(i) ? 2048 : 1024;
        }
        if (composerStartRestartGroup.shouldExecute((i3 & 1171) != 1170, i3 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-923732113, i3, -1, "app.chalo.home.ui.history.compose.TicketsScreenContentUI (MyTicketsScreenUI.kt:170)");
            }
            HomeTabScreensRetainedData.MyTicketsScreen myTicketsScreen = myTicketsViewState.A;
            MyTicketsViewStateSpec myTicketsViewStateSpec = myTicketsViewState.f11133a;
            LazyListState lazyListStateRememberLazyListState = LazyListStateKt.rememberLazyListState(myTicketsScreen != null ? myTicketsScreen.f3173a : 0, myTicketsScreen != null ? myTicketsScreen.b : 0, composerStartRestartGroup, 0, 0);
            HomeTabScreensRetainedData.MyTicketsScreen myTicketsScreen2 = myTicketsViewState.A;
            Integer numValueOf = Integer.valueOf(i);
            Boolean boolValueOf = Boolean.valueOf(z);
            int i4 = i3 & 896;
            boolean zChangedInstance = (i4 == 256) | composerStartRestartGroup.changedInstance(myTicketsViewState) | composerStartRestartGroup.changed(lazyListStateRememberLazyListState);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new MyTicketsScreenUIKt$TicketsScreenContentUI$1$1(z, myTicketsViewState, lazyListStateRememberLazyListState, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            EffectsKt.LaunchedEffect(myTicketsScreen2, numValueOf, boolValueOf, (Function2) objRememberedValue, composerStartRestartGroup, ((i3 >> 6) & 112) | i4);
            Boolean boolValueOf2 = Boolean.valueOf(z);
            boolean zChanged = composerStartRestartGroup.changed(lazyListStateRememberLazyListState) | (i4 == 256) | ((i3 & 112) == 32);
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (zChanged || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue2 = new MyTicketsScreenUIKt$TicketsScreenContentUI$2$1(z, lazyListStateRememberLazyListState, function1, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            EffectsKt.LaunchedEffect(lazyListStateRememberLazyListState, boolValueOf2, (Function2) objRememberedValue2, composerStartRestartGroup, (i3 >> 3) & 112);
            boolean zChanged2 = composerStartRestartGroup.changed(myTicketsViewStateSpec);
            Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
            if (zChanged2 || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                composerStartRestartGroup.updateRememberedValue(myTicketsViewStateSpec);
                objRememberedValue3 = myTicketsViewStateSpec;
            }
            MyTicketsViewStateSpec myTicketsViewStateSpec2 = (MyTicketsViewStateSpec) objRememberedValue3;
            Object objRememberedValue4 = composerStartRestartGroup.rememberedValue();
            Composer.Companion companion = Composer.INSTANCE;
            if (objRememberedValue4 == companion.getEmpty()) {
                r14 = 0;
                objRememberedValue4 = gf.b(0, null, 2, null, composerStartRestartGroup);
            } else {
                r14 = 0;
            }
            MutableState mutableState = (MutableState) objRememberedValue4;
            Density density = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
            LoadingDialogUIState loadingDialogUIState = myTicketsViewState.o;
            if (loadingDialogUIState == null) {
                composerStartRestartGroup.startReplaceGroup(-1046223224);
                composerStartRestartGroup.endReplaceGroup();
            } else {
                t8.m(composerStartRestartGroup, -1046223223, loadingDialogUIState, composerStartRestartGroup, r14);
            }
            ConfirmationDialogUiState confirmationDialogUiState = myTicketsViewState.p;
            if (confirmationDialogUiState == null) {
                composerStartRestartGroup.startReplaceGroup(-1046138749);
                composerStartRestartGroup.endReplaceGroup();
            } else {
                dd.l(composerStartRestartGroup, -1046138748, confirmationDialogUiState, composerStartRestartGroup, r14);
            }
            float fB = ComposeUtils_androidKt.b(composerStartRestartGroup);
            Object objRememberedValue5 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue5 == companion.getEmpty()) {
                objRememberedValue5 = Dp.m7276boximpl(fB);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue5);
            }
            float fM7292unboximpl = ((Dp) objRememberedValue5).m7292unboximpl();
            Modifier.Companion companion2 = Modifier.INSTANCE;
            Modifier modifierM264backgroundbw27NRU$default = BackgroundKt.m264backgroundbw27NRU$default(SizeKt.fillMaxSize$default(companion2, 0.0f, 1, null), ChaloColorTokenKt.c(myTicketsViewStateSpec2.b), null, 2, null);
            boolean zChanged3 = composerStartRestartGroup.changed(density);
            Object objRememberedValue6 = composerStartRestartGroup.rememberedValue();
            if (zChanged3 || objRememberedValue6 == companion.getEmpty()) {
                objRememberedValue6 = new f0(density, mutableState, 19);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue6);
            }
            Modifier modifierOnGloballyPositioned = OnGloballyPositionedModifierKt.onGloballyPositioned(modifierM264backgroundbw27NRU$default, (Function1) objRememberedValue6);
            Alignment.Companion companion3 = Alignment.INSTANCE;
            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(companion3.getTopStart(), r14);
            long currentCompositeKeyHashCode = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, r14);
            int i5 = (int) (currentCompositeKeyHashCode ^ (currentCompositeKeyHashCode >>> 32));
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierOnGloballyPositioned);
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
            pk0.v(companion4, composerM3915constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy, composerM3915constructorimpl, currentCompositionLocalMap);
            Updater.m3923setimpl(composerM3915constructorimpl, modifierMaterializeModifier, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion4, composerM3915constructorimpl, Integer.valueOf(i5), composerM3915constructorimpl));
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            ChaloGradientBackgroundKt.a(boxScopeInstance, myTicketsViewStateSpec2.c, ((Dp) mutableState.getValue()).m7292unboximpl(), null, composerStartRestartGroup, 6, 4);
            Modifier modifierFillMaxSize$default = SizeKt.fillMaxSize$default(companion2, 0.0f, 1, null);
            OverscrollEffect overscrollEffectA = HomeOverscrollEffect_androidKt.a(composerStartRestartGroup);
            boolean zChangedInstance2 = composerStartRestartGroup.changedInstance(myTicketsViewState) | composerStartRestartGroup.changedInstance(myTicketsViewStateSpec2);
            Object objRememberedValue7 = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance2 || objRememberedValue7 == companion.getEmpty()) {
                objRememberedValue7 = new u3(myTicketsViewState, fM7292unboximpl, myTicketsViewStateSpec2, 3);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue7);
            }
            LazyDslKt.LazyColumn(modifierFillMaxSize$default, lazyListStateRememberLazyListState, null, false, null, null, null, false, overscrollEffectA, (Function1) objRememberedValue7, composerStartRestartGroup, 6, 252);
            composerStartRestartGroup = composerStartRestartGroup;
            TicketsFloatingButtonContainerUiState ticketsFloatingButtonContainerUiState = myTicketsViewState.q;
            if (ticketsFloatingButtonContainerUiState == null) {
                composerStartRestartGroup.startReplaceGroup(-2082116550);
            } else {
                Object obj = ticketsFloatingButtonContainerUiState.b;
                composerStartRestartGroup.startReplaceGroup(-2082116549);
                boolean zChanged4 = composerStartRestartGroup.changed(obj);
                Object objRememberedValue8 = composerStartRestartGroup.rememberedValue();
                if (zChanged4 || objRememberedValue8 == companion.getEmpty()) {
                    composerStartRestartGroup.updateRememberedValue(obj);
                } else {
                    obj = objRememberedValue8;
                }
                TicketsFloatingButtonContainerSpec ticketsFloatingButtonContainerSpec = (TicketsFloatingButtonContainerSpec) obj;
                c(ChaloThemeKt.c(boxScopeInstance.align(ZIndexModifierKt.zIndex(PlotlineComposeWidgetKt.a(companion2, "PL_Buy_Ticket_Pass_Button"), ticketsFloatingButtonContainerSpec.b), companion3.getBottomCenter()), ticketsFloatingButtonContainerSpec.f3489a), ticketsFloatingButtonContainerUiState.f3490a, composerStartRestartGroup, 0);
            }
            composerStartRestartGroup.endReplaceGroup();
            composerStartRestartGroup.endNode();
            ConfirmationDialogUiState confirmationDialogUiState2 = myTicketsViewState.m;
            if (confirmationDialogUiState2 == null) {
                composerStartRestartGroup.startReplaceGroup(-1033538365);
                composerStartRestartGroup.endReplaceGroup();
            } else {
                dd.l(composerStartRestartGroup, -1033538364, confirmationDialogUiState2, composerStartRestartGroup, 0);
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new b9(myTicketsViewState, function1, z, i, i2, 4));
        }
    }
}
