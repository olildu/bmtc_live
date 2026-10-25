package app.chalo.instantticket.ui.routeselection.compose;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.material3.TextKt;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import app.chalo.compose.ErrorTextKt;
import app.chalo.compose.components.ChaloLoadingDialogKt;
import app.chalo.compose.components.ChaloSnackbarKt;
import app.chalo.compose.components.ChaloToolBarKt;
import app.chalo.compose.components.buttons.ChaloFilledButtonKt;
import app.chalo.compose.resources.StringResourcesHelperKt;
import app.chalo.compose.theme.ChaloTheme;
import app.chalo.compose.theme.ChaloTypographyKt;
import app.chalo.data.ProductBookingBranding;
import app.chalo.data.ProductBookingBrandingKt;
import app.chalo.instantticket.ui.routeselection.RouteBasedStopSearchForProductPurchaseComponent;
import app.chalo.instantticket.ui.routeselection.RouteSelectionStopType;
import app.chalo.instantticket.ui.routeselection.RouteSelectionViewState;
import app.chalo.providers.stringprovider.StringEnum;
import com.arkivanov.decompose.extensions.compose.SubscribeAsStateKt;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import defpackage.a31;
import defpackage.c41;
import defpackage.h01;
import defpackage.pk0;
import defpackage.qg;
import defpackage.qv0;
import defpackage.t11;
import defpackage.z21;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002¨\u0006\u0002²\u0006\f\u0010\u0001\u001a\u00020\u00008\nX\u008a\u0084\u0002"}, d2 = {"Lapp/chalo/instantticket/ui/routeselection/RouteSelectionViewState;", RemoteConfigConstants.ResponseFieldKey.STATE, "productbooking_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class RouteSelectionComposableKt {
    /* JADX WARN: Multi-variable type inference failed */
    public static final void a(RouteBasedStopSearchForProductPurchaseComponent routeBasedStopSearchForProductPurchaseComponent, Composer composer, int i) {
        int i2;
        Composer composer2;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1384914445);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(routeBasedStopSearchForProductPurchaseComponent) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (composerStartRestartGroup.shouldExecute((i2 & 3) != 2, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1384914445, i2, -1, "app.chalo.instantticket.ui.routeselection.compose.RouteBasedStopSearchForProductPurchaseScreen (RouteSelectionComposable.kt:34)");
            }
            MutableState mutableStateA = SubscribeAsStateKt.a(routeBasedStopSearchForProductPurchaseComponent.t0(), composerStartRestartGroup);
            Modifier.Companion companion = Modifier.INSTANCE;
            Alignment.Companion companion2 = Alignment.INSTANCE;
            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(companion2.getTopStart(), false);
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
            pk0.v(companion3, composerM3915constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy, composerM3915constructorimpl, currentCompositionLocalMap);
            Updater.m3923setimpl(composerM3915constructorimpl, modifierMaterializeModifier, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion3, composerM3915constructorimpl, Integer.valueOf(i3), composerM3915constructorimpl));
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            Arrangement arrangement = Arrangement.INSTANCE;
            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(arrangement.getTop(), companion2.getStart(), composerStartRestartGroup, 0);
            long currentCompositeKeyHashCode2 = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
            int i4 = (int) (currentCompositeKeyHashCode2 ^ (currentCompositeKeyHashCode2 >>> 32));
            CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, companion);
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
            Updater.m3923setimpl(composerM3915constructorimpl2, modifierMaterializeModifier2, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion3, composerM3915constructorimpl2, Integer.valueOf(i4), composerM3915constructorimpl2));
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
            composer2 = composerStartRestartGroup;
            ChaloToolBarKt.a(null, null, 0.0f, 0L, null, null, composer2, 0, 63);
            RouteSelectionViewState routeSelectionViewState = (RouteSelectionViewState) mutableStateA.getValue();
            boolean zChangedInstance = composer2.changedInstance(routeBasedStopSearchForProductPurchaseComponent);
            Object objRememberedValue = composer2.rememberedValue();
            if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new z21(routeBasedStopSearchForProductPurchaseComponent, 15);
                composer2.updateRememberedValue(objRememberedValue);
            }
            c(routeSelectionViewState, (Function1) objRememberedValue, PaddingKt.m786paddingVpY3zN4$default(companion, ChaloTheme.b(composer2, 0).h, 0.0f, 2, null), composer2, 0);
            composer2.endNode();
            if (((RouteSelectionViewState) mutableStateA.getValue()).j) {
                composer2.startReplaceGroup(-1526742487);
                ChaloLoadingDialogKt.b(null, false, null, composer2, 0, 7);
            } else {
                composer2.startReplaceGroup(-1528797291);
            }
            composer2.endReplaceGroup();
            String str = ((RouteSelectionViewState) mutableStateA.getValue()).i;
            if (str == null) {
                composer2.startReplaceGroup(-1526637801);
            } else {
                composer2.startReplaceGroup(-1526637800);
                Arrangement.Vertical bottom = arrangement.getBottom();
                Modifier modifierFillMaxHeight$default = SizeKt.fillMaxHeight$default(companion, 0.0f, 1, null);
                MeasurePolicy measurePolicyColumnMeasurePolicy2 = ColumnKt.columnMeasurePolicy(bottom, companion2.getStart(), composer2, 6);
                long currentCompositeKeyHashCode3 = ComposablesKt.getCurrentCompositeKeyHashCode(composer2, 0);
                int i5 = (int) (currentCompositeKeyHashCode3 ^ (currentCompositeKeyHashCode3 >>> 32));
                CompositionLocalMap currentCompositionLocalMap3 = composer2.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier3 = ComposedModifierKt.materializeModifier(composer2, modifierFillMaxHeight$default);
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
                Updater.m3923setimpl(composerM3915constructorimpl3, modifierMaterializeModifier3, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion3, composerM3915constructorimpl3, Integer.valueOf(i5), composerM3915constructorimpl3));
                String strC = StringResourcesHelperKt.c(StringEnum.RETRY, new Object[0], composer2, 6);
                boolean zChangedInstance2 = composer2.changedInstance(routeBasedStopSearchForProductPurchaseComponent);
                Object objRememberedValue2 = composer2.rememberedValue();
                if (zChangedInstance2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue2 = new qv0(routeBasedStopSearchForProductPurchaseComponent, 22);
                    composer2.updateRememberedValue(objRememberedValue2);
                }
                ChaloSnackbarKt.a(null, str, strC, (Function0) objRememberedValue2, composer2, 0, 1);
                composer2.endNode();
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
            scopeUpdateScopeEndRestartGroup.updateScope(new a31(routeBasedStopSearchForProductPurchaseComponent, i, 10));
        }
    }

    public static final void b(Composer composer, int i, String heading) {
        int i2;
        Composer composer2;
        Intrinsics.i(heading, "heading");
        Composer composerStartRestartGroup = composer.startRestartGroup(1325075564);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changed(heading) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (composerStartRestartGroup.shouldExecute((i2 & 3) != 2, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1325075564, i2, -1, "app.chalo.instantticket.ui.routeselection.compose.RouteSelectionHeading (RouteSelectionComposable.kt:150)");
            }
            composer2 = composerStartRestartGroup;
            TextKt.m2623TextNvy7gAk(heading, null, ChaloTheme.a(composerStartRestartGroup, 0).g, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ChaloTypographyKt.e(ChaloTheme.e(composerStartRestartGroup, 0)), composer2, i2 & 14, 0, 131066);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer2 = composerStartRestartGroup;
            composer2.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new qg(heading, i, 17));
        }
    }

    public static final void c(RouteSelectionViewState viewState, Function1 handleIntent, Modifier modifier, Composer composer, int i) {
        int i2;
        int i3;
        char c;
        int i4;
        boolean z;
        int i5;
        Intrinsics.i(viewState, "viewState");
        ProductBookingBranding productBookingBranding = viewState.d;
        RouteSelectionStopType routeSelectionStopType = viewState.f;
        Intrinsics.i(handleIntent, "handleIntent");
        Composer composerStartRestartGroup = composer.startRestartGroup(1081960035);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(viewState) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(handleIntent) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= composerStartRestartGroup.changed(modifier) ? 256 : 128;
        }
        if (composerStartRestartGroup.shouldExecute((i2 & 147) != 146, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1081960035, i2, -1, "app.chalo.instantticket.ui.routeselection.compose.RouteSelectionMainScreen (RouteSelectionComposable.kt:71)");
            }
            Arrangement.Vertical top = Arrangement.INSTANCE.getTop();
            Alignment.Companion companion = Alignment.INSTANCE;
            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(top, companion.getStart(), composerStartRestartGroup, 0);
            long currentCompositeKeyHashCode = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
            int i6 = (int) (currentCompositeKeyHashCode ^ (currentCompositeKeyHashCode >>> 32));
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
            Updater.m3923setimpl(composerM3915constructorimpl, modifierMaterializeModifier, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion2, composerM3915constructorimpl, Integer.valueOf(i6), composerM3915constructorimpl));
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
            Modifier.Companion companion3 = Modifier.INSTANCE;
            SpacerKt.Spacer(SizeKt.m828size3ABfNKs(companion3, ChaloTheme.b(composerStartRestartGroup, 0).i), composerStartRestartGroup, 0);
            b(composerStartRestartGroup, 0, StringResourcesHelperKt.c(StringEnum.ROUTE_SELECTION_HEADING, new Object[0], composerStartRestartGroup, 6));
            String strC = StringResourcesHelperKt.c(StringEnum.HINT_ROUTE_NUMBER, new Object[0], composerStartRestartGroup, 6);
            String str = viewState.f3969a.b;
            List list = viewState.h;
            int i7 = i2 & 112;
            boolean z2 = i7 == 32;
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (z2 || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new t11(handleIntent, 29);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            RouteSelectionInputKt.b(strC, str, list, (Function0) objRememberedValue, composerStartRestartGroup, 0, 0);
            if (viewState.e) {
                composerStartRestartGroup.startReplaceGroup(108220524);
                SpacerKt.Spacer(SizeKt.m828size3ABfNKs(companion3, ChaloTheme.b(composerStartRestartGroup, 0).c), composerStartRestartGroup, 0);
                i3 = 6;
                ErrorTextKt.a(composerStartRestartGroup, 0, StringResourcesHelperKt.c(StringEnum.ROUTE_SELECTION_ROUTE_NOT_SELECTED_ERROR, new Object[0], composerStartRestartGroup, 6));
            } else {
                i3 = 6;
                composerStartRestartGroup.startReplaceGroup(104805161);
            }
            composerStartRestartGroup.endReplaceGroup();
            String strC2 = StringResourcesHelperKt.c(StringEnum.HINT_START_STOP, new Object[0], composerStartRestartGroup, i3);
            String str2 = viewState.b.b;
            boolean z3 = i7 == 32;
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (z3 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue2 = new c41(handleIntent, 0);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            RouteSelectionInputKt.b(strC2, str2, null, (Function0) objRememberedValue2, composerStartRestartGroup, 0, 4);
            if (routeSelectionStopType == RouteSelectionStopType.FROM) {
                composerStartRestartGroup.startReplaceGroup(108869633);
                SpacerKt.Spacer(SizeKt.m828size3ABfNKs(companion3, ChaloTheme.b(composerStartRestartGroup, 0).c), composerStartRestartGroup, 0);
                i4 = 6;
                ErrorTextKt.a(composerStartRestartGroup, 0, StringResourcesHelperKt.c(StringEnum.STATUS_ERROR_ENTER_STOP, new Object[0], composerStartRestartGroup, 6));
                composerStartRestartGroup.endReplaceGroup();
                c = 13097;
            } else {
                c = 13097;
                i4 = 6;
                composerStartRestartGroup.startReplaceGroup(104805161);
                composerStartRestartGroup.endReplaceGroup();
            }
            String strC3 = StringResourcesHelperKt.c(StringEnum.HINT_END_STOP, new Object[0], composerStartRestartGroup, i4);
            String str3 = viewState.c.b;
            boolean z4 = i7 == 32;
            Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
            if (z4 || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                z = true;
                objRememberedValue3 = new c41(handleIntent, 1);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
            } else {
                z = true;
            }
            RouteSelectionInputKt.b(strC3, str3, null, (Function0) objRememberedValue3, composerStartRestartGroup, 0, 4);
            if (routeSelectionStopType == RouteSelectionStopType.TO) {
                composerStartRestartGroup.startReplaceGroup(109490625);
                SpacerKt.Spacer(SizeKt.m828size3ABfNKs(companion3, ChaloTheme.b(composerStartRestartGroup, 0).c), composerStartRestartGroup, 0);
                i5 = 6;
                ErrorTextKt.a(composerStartRestartGroup, 0, StringResourcesHelperKt.c(StringEnum.STATUS_ERROR_ENTER_STOP, new Object[0], composerStartRestartGroup, 6));
                composerStartRestartGroup.endReplaceGroup();
            } else {
                i5 = 6;
                composerStartRestartGroup.startReplaceGroup(104805161);
                composerStartRestartGroup.endReplaceGroup();
            }
            SpacerKt.Spacer(SizeKt.m828size3ABfNKs(companion3, ChaloTheme.b(composerStartRestartGroup, 0).i), composerStartRestartGroup, 0);
            String strC4 = StringResourcesHelperKt.c(StringEnum.BTN_TXT_MTICKET_NEXT, new Object[0], composerStartRestartGroup, i5);
            Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(companion3, 0.0f, 1, null);
            boolean z5 = i7 == 32;
            Object objRememberedValue4 = composerStartRestartGroup.rememberedValue();
            if (z5 || objRememberedValue4 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue4 = new c41(handleIntent, 2);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
            }
            ChaloFilledButtonKt.g(modifierFillMaxWidth$default, strC4, null, 0L, null, true, 0.0f, null, 0L, (Function0) objRememberedValue4, composerStartRestartGroup, 196614, 476);
            composerStartRestartGroup = composerStartRestartGroup;
            if (Intrinsics.d(productBookingBranding, ProductBookingBranding.None.INSTANCE)) {
                composerStartRestartGroup.startReplaceGroup(104805161);
            } else {
                composerStartRestartGroup.startReplaceGroup(110107277);
                SpacerKt.Spacer(SizeKt.m828size3ABfNKs(companion3, ChaloTheme.b(composerStartRestartGroup, 0).n), composerStartRestartGroup, 0);
                Modifier modifierAlign = columnScopeInstance.align(SizeKt.fillMaxWidth$default(companion3, 0.0f, 1, null), companion.getCenterHorizontally());
                ProductBookingBranding.Companion companion4 = ProductBookingBranding.INSTANCE;
                ProductBookingBrandingKt.a(modifierAlign, productBookingBranding, composerStartRestartGroup, 0);
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
            scopeUpdateScopeEndRestartGroup.updateScope(new h01(i, 13, viewState, handleIntent, modifier));
        }
    }
}
