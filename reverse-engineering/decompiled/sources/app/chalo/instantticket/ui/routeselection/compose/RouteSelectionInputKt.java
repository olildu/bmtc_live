package app.chalo.instantticket.ui.routeselection.compose;

import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.ClickableKt;
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
import androidx.compose.material3.DividerKt;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.unit.Dp;
import app.chalo.compose.components.ChaloSpacersKt;
import app.chalo.compose.components.ComposeUtilsKt;
import app.chalo.compose.components.TextKt;
import app.chalo.compose.components.TextWithSpecialFeaturesTagsKt;
import app.chalo.compose.theme.ChaloTheme;
import app.chalo.compose.theme.ChaloThemeKt;
import app.chalo.compose.theme.ChaloTypographyKt;
import app.chalo.instantticket.ui.routeselection.uistate.RouteSelectionInputUISpec;
import app.chalo.instantticket.ui.routeselection.uistate.RouteSelectionInputUIState;
import app.chalo.productbooking.common.data.models.app.ProductBookingRouteSpecialFeatureTagType;
import app.chalo.productbooking.common.data.models.app.ProductBookingSpecialFeature;
import app.chalo.uistate.base.ChaloColorToken;
import app.chalo.uistate.base.ChaloColorTokenKt;
import app.chalo.uistate.divider.DividerUIStateKt;
import app.chalo.uistate.text.TextUIState;
import app.chalo.uistate.text.TextWithSpecialFeaturesTagsUIState;
import defpackage.b3;
import defpackage.k31;
import defpackage.pk0;
import defpackage.uc;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.collections.EmptyList;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.internal.ws.WebSocketProtocol;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"productbooking_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class RouteSelectionInputKt {

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f3970a;

        static {
            int[] iArr = new int[ProductBookingRouteSpecialFeatureTagType.values().length];
            try {
                iArr[ProductBookingRouteSpecialFeatureTagType.OLD.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ProductBookingRouteSpecialFeatureTagType.NEW.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f3970a = iArr;
        }
    }

    public static final void a(RouteSelectionInputUIState state, Modifier modifier, Composer composer, int i) {
        int i2;
        int i3;
        Intrinsics.i(state, "state");
        TextWithSpecialFeaturesTagsUIState textWithSpecialFeaturesTagsUIState = state.b;
        RouteSelectionInputUISpec routeSelectionInputUISpec = state.f;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1628501835);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changed(state) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changed(modifier) ? 32 : 16;
        }
        if (composerStartRestartGroup.shouldExecute((i2 & 19) != 18, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1628501835, i2, -1, "app.chalo.instantticket.ui.routeselection.compose.RouteSelectionInput (RouteSelectionInput.kt:113)");
            }
            Modifier modifierB = ComposeUtilsKt.b(SizeKt.fillMaxWidth$default(modifier, 0.0f, 1, null), state.c, composerStartRestartGroup, 0, 6);
            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getBottom(), Alignment.INSTANCE.getStart(), composerStartRestartGroup, 6);
            long currentCompositeKeyHashCode = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
            int i4 = (int) (currentCompositeKeyHashCode ^ (currentCompositeKeyHashCode >>> 32));
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierB);
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
            TextUIState.ChaloTextUIState chaloTextUIState = state.f3972a;
            Modifier.Companion companion2 = Modifier.INSTANCE;
            TextKt.c(chaloTextUIState, ChaloThemeKt.c(companion2, routeSelectionInputUISpec.f3971a), null, null, composerStartRestartGroup, 0, 12);
            if (textWithSpecialFeaturesTagsUIState.f10094a.isEmpty()) {
                i3 = 0;
                composerStartRestartGroup.startReplaceGroup(217080611);
            } else {
                composerStartRestartGroup.startReplaceGroup(221475512);
                Modifier modifierC = ChaloThemeKt.c(SizeKt.fillMaxWidth$default(companion2, 0.0f, 1, null), routeSelectionInputUISpec.b);
                i3 = 0;
                TextWithSpecialFeaturesTagsKt.a(textWithSpecialFeaturesTagsUIState, modifierC, composerStartRestartGroup, 0, 0);
            }
            composerStartRestartGroup.endReplaceGroup();
            ChaloSpacersKt.a(routeSelectionInputUISpec.c, composerStartRestartGroup, i3);
            DividerUIStateKt.a(SizeKt.fillMaxWidth$default(companion2, 0.0f, 1, null), state.d, composerStartRestartGroup, 6, i3);
            TextUIState textUIState = state.e;
            if (textUIState == null) {
                composerStartRestartGroup.startReplaceGroup(221927367);
            } else {
                composerStartRestartGroup.startReplaceGroup(221927368);
                TextKt.c(textUIState, SizeKt.fillMaxWidth$default(companion2, 0.0f, 1, null), null, null, composerStartRestartGroup, 48, 12);
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
            scopeUpdateScopeEndRestartGroup.updateScope(new k31(state, modifier, i, 9));
        }
    }

    /* JADX WARN: Code duplicated, block: B:30:0x005c  */
    /* JADX WARN: Code duplicated, block: B:32:0x0062  */
    /* JADX WARN: Code duplicated, block: B:33:0x0065  */
    /* JADX WARN: Code duplicated, block: B:37:0x0070  */
    /* JADX WARN: Code duplicated, block: B:38:0x0072  */
    /* JADX WARN: Code duplicated, block: B:41:0x007b A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:42:0x007d  */
    /* JADX WARN: Code duplicated, block: B:43:0x0080  */
    /* JADX WARN: Code duplicated, block: B:46:0x0087  */
    /* JADX WARN: Code duplicated, block: B:50:0x00d0  */
    /* JADX WARN: Code duplicated, block: B:53:0x00dc  */
    /* JADX WARN: Code duplicated, block: B:54:0x00e0  */
    /* JADX WARN: Code duplicated, block: B:57:0x015c  */
    /* JADX WARN: Code duplicated, block: B:59:0x0181  */
    /* JADX WARN: Code duplicated, block: B:62:0x01ba  */
    /* JADX WARN: Code duplicated, block: B:64:0x01bf  */
    /* JADX WARN: Code duplicated, block: B:67:0x01cb  */
    /* JADX WARN: Code duplicated, block: B:69:? A[RETURN, SYNTHETIC] */
    public static final void b(String label, String str, List list, Function0 function0, Composer composer, int i, int i2) {
        int i3;
        List list2;
        boolean z;
        Composer composer2;
        List list3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        List list4;
        Modifier.Companion companion;
        Function0<ComposeUiNode> constructor;
        int i4;
        List list5;
        List list6;
        Modifier.Companion companion2;
        int i5;
        int i6;
        String value = str;
        Intrinsics.i(label, "label");
        Intrinsics.i(value, "value");
        Composer composerStartRestartGroup = composer.startRestartGroup(-1877767238);
        if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changed(label) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changed(value) ? 32 : 16;
        }
        int i7 = i2 & 4;
        if (i7 == 0) {
            if ((i & 384) == 0) {
                list2 = list;
                i3 |= composerStartRestartGroup.changedInstance(list2) ? 256 : 128;
            }
            if ((i & 3072) == 0) {
                if (composerStartRestartGroup.changedInstance(function0)) {
                    i6 = 2048;
                } else {
                    i6 = 1024;
                }
                i3 |= i6;
            }
            if ((i3 & 1171) != 1170) {
                z = true;
            } else {
                z = false;
            }
            if (composerStartRestartGroup.shouldExecute(z, i3 & 1)) {
                if (i7 != 0) {
                    list4 = EmptyList.f17557a;
                } else {
                    list4 = list2;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1877767238, i3, -1, "app.chalo.instantticket.ui.routeselection.compose.RouteSelectionInput (RouteSelectionInput.kt:40)");
                }
                companion = Modifier.INSTANCE;
                Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(ClickableKt.m299clickableoSLSa3U$default(companion, false, null, null, null, function0, 15, null), 0.0f, 1, null);
                MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getBottom(), Alignment.INSTANCE.getStart(), composerStartRestartGroup, 6);
                long currentCompositeKeyHashCode = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
                int i8 = (int) (currentCompositeKeyHashCode ^ (currentCompositeKeyHashCode >>> 32));
                CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierFillMaxWidth$default);
                ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
                constructor = companion3.getConstructor();
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
                Updater.m3923setimpl(composerM3915constructorimpl, modifierMaterializeModifier, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion3, composerM3915constructorimpl, Integer.valueOf(i8), composerM3915constructorimpl));
                ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
                SpacerKt.Spacer(SizeKt.m828size3ABfNKs(companion, ChaloTheme.b(composerStartRestartGroup, 0).l), composerStartRestartGroup, 0);
                i4 = i3;
                list5 = list4;
                androidx.compose.material3.TextKt.m2623TextNvy7gAk(label, null, ChaloTheme.a(composerStartRestartGroup, 0).i, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ChaloTypographyKt.k(ChaloTheme.e(composerStartRestartGroup, 0)), composerStartRestartGroup, i3 & 14, 0, 131066);
                if (str.length() > 0) {
                    composerStartRestartGroup.startReplaceGroup(-986220788);
                    i5 = 0;
                    companion2 = companion;
                    SpacerKt.Spacer(SizeKt.m814height3ABfNKs(companion2, ChaloTheme.b(composerStartRestartGroup, 0).d), composerStartRestartGroup, 0);
                    value = str;
                    list6 = list5;
                    c(value, list6, composerStartRestartGroup, (i4 >> 3) & WebSocketProtocol.PAYLOAD_SHORT);
                } else {
                    value = str;
                    list6 = list5;
                    companion2 = companion;
                    i5 = 0;
                    composerStartRestartGroup.startReplaceGroup(-988401390);
                }
                composerStartRestartGroup.endReplaceGroup();
                SpacerKt.Spacer(SizeKt.m828size3ABfNKs(companion2, ChaloTheme.b(composerStartRestartGroup, i5).h), composerStartRestartGroup, i5);
                DividerKt.m1949Divider9IZ8Weo(null, Dp.m7278constructorimpl(1), ChaloTheme.a(composerStartRestartGroup, i5).l, composerStartRestartGroup, 48, 1);
                composer2 = composerStartRestartGroup;
                composer2.endNode();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                list3 = list6;
            } else {
                composer2 = composerStartRestartGroup;
                composer2.skipToGroupEnd();
                list3 = list2;
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new uc(label, value, list3, function0, i, i2, 8));
            }
        }
        i3 |= 384;
        list2 = list;
        if ((i & 3072) == 0) {
            if (composerStartRestartGroup.changedInstance(function0)) {
                i6 = 2048;
            } else {
                i6 = 1024;
            }
            i3 |= i6;
        }
        if ((i3 & 1171) != 1170) {
            z = true;
        } else {
            z = false;
        }
        if (composerStartRestartGroup.shouldExecute(z, i3 & 1)) {
            if (i7 != 0) {
                list4 = EmptyList.f17557a;
            } else {
                list4 = list2;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1877767238, i3, -1, "app.chalo.instantticket.ui.routeselection.compose.RouteSelectionInput (RouteSelectionInput.kt:40)");
            }
            companion = Modifier.INSTANCE;
            Modifier modifierFillMaxWidth$default2 = SizeKt.fillMaxWidth$default(ClickableKt.m299clickableoSLSa3U$default(companion, false, null, null, null, function0, 15, null), 0.0f, 1, null);
            MeasurePolicy measurePolicyColumnMeasurePolicy2 = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getBottom(), Alignment.INSTANCE.getStart(), composerStartRestartGroup, 6);
            long currentCompositeKeyHashCode2 = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
            int i9 = (int) (currentCompositeKeyHashCode2 ^ (currentCompositeKeyHashCode2 >>> 32));
            CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierFillMaxWidth$default2);
            ComposeUiNode.Companion companion4 = ComposeUiNode.INSTANCE;
            constructor = companion4.getConstructor();
            if (composerStartRestartGroup.getApplier() == null) {
                ComposablesKt.invalidApplier();
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.createNode(constructor);
            } else {
                composerStartRestartGroup.useNode();
            }
            Composer composerM3915constructorimpl2 = Updater.m3915constructorimpl(composerStartRestartGroup);
            pk0.v(companion4, composerM3915constructorimpl2, measurePolicyColumnMeasurePolicy2, composerM3915constructorimpl2, currentCompositionLocalMap2);
            Updater.m3923setimpl(composerM3915constructorimpl2, modifierMaterializeModifier2, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion4, composerM3915constructorimpl2, Integer.valueOf(i9), composerM3915constructorimpl2));
            ColumnScopeInstance columnScopeInstance2 = ColumnScopeInstance.INSTANCE;
            SpacerKt.Spacer(SizeKt.m828size3ABfNKs(companion, ChaloTheme.b(composerStartRestartGroup, 0).l), composerStartRestartGroup, 0);
            i4 = i3;
            list5 = list4;
            androidx.compose.material3.TextKt.m2623TextNvy7gAk(label, null, ChaloTheme.a(composerStartRestartGroup, 0).i, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ChaloTypographyKt.k(ChaloTheme.e(composerStartRestartGroup, 0)), composerStartRestartGroup, i3 & 14, 0, 131066);
            if (str.length() > 0) {
                composerStartRestartGroup.startReplaceGroup(-986220788);
                i5 = 0;
                companion2 = companion;
                SpacerKt.Spacer(SizeKt.m814height3ABfNKs(companion2, ChaloTheme.b(composerStartRestartGroup, 0).d), composerStartRestartGroup, 0);
                value = str;
                list6 = list5;
                c(value, list6, composerStartRestartGroup, (i4 >> 3) & WebSocketProtocol.PAYLOAD_SHORT);
            } else {
                value = str;
                list6 = list5;
                companion2 = companion;
                i5 = 0;
                composerStartRestartGroup.startReplaceGroup(-988401390);
            }
            composerStartRestartGroup.endReplaceGroup();
            SpacerKt.Spacer(SizeKt.m828size3ABfNKs(companion2, ChaloTheme.b(composerStartRestartGroup, i5).h), composerStartRestartGroup, i5);
            DividerKt.m1949Divider9IZ8Weo(null, Dp.m7278constructorimpl(1), ChaloTheme.a(composerStartRestartGroup, i5).l, composerStartRestartGroup, 48, 1);
            composer2 = composerStartRestartGroup;
            composer2.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            list3 = list6;
        } else {
            composer2 = composerStartRestartGroup;
            composer2.skipToGroupEnd();
            list3 = list2;
        }
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new uc(label, value, list3, function0, i, i2, 8));
        }
    }

    public static final void c(String value, List list, Composer composer, int i) {
        List<ProductBookingSpecialFeature> list2;
        Composer composer2;
        Intrinsics.i(value, "value");
        Composer composerStartRestartGroup = composer.startRestartGroup(-1390777654);
        int i2 = (i & 6) == 0 ? i | (composerStartRestartGroup.changed(value) ? 4 : 2) : i;
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(list) ? 32 : 16;
        }
        if (composerStartRestartGroup.shouldExecute((i2 & 19) != 18, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1390777654, i2, -1, "app.chalo.instantticket.ui.routeselection.compose.RouteSelectionInputValue (RouteSelectionInput.kt:69)");
            }
            Modifier.Companion companion = Modifier.INSTANCE;
            MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), Alignment.INSTANCE.getTop(), composerStartRestartGroup, 0);
            long currentCompositeKeyHashCode = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
            int i3 = (int) ((currentCompositeKeyHashCode >>> 32) ^ currentCompositeKeyHashCode);
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
            Updater.m3923setimpl(composerM3915constructorimpl, modifierMaterializeModifier, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion2, composerM3915constructorimpl, Integer.valueOf(i3), composerM3915constructorimpl));
            RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
            androidx.compose.material3.TextKt.m2623TextNvy7gAk(value, null, ChaloTheme.a(composerStartRestartGroup, 0).g, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ChaloTypographyKt.g(ChaloTheme.e(composerStartRestartGroup, 0)), composerStartRestartGroup, i2 & 14, 0, 131066);
            composer2 = composerStartRestartGroup;
            composer2.startReplaceGroup(1567476354);
            list2 = list;
            for (ProductBookingSpecialFeature productBookingSpecialFeature : list2) {
                d(productBookingSpecialFeature.f8197a, productBookingSpecialFeature.b, composer2, 0);
            }
            if (b3.t(composer2)) {
                ComposerKt.traceEventEnd();
            }
        } else {
            list2 = list;
            composer2 = composerStartRestartGroup;
            composer2.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new k31(value, list2, i, 10));
        }
    }

    public static final void d(String name, ProductBookingRouteSpecialFeatureTagType type, Composer composer, int i) {
        int i2;
        Composer composer2;
        long jC;
        long j;
        Intrinsics.i(name, "name");
        Intrinsics.i(type, "type");
        Composer composerStartRestartGroup = composer.startRestartGroup(-1218152484);
        if ((i & 6) == 0) {
            i2 = i | (composerStartRestartGroup.changed(name) ? 4 : 2);
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changed(type.ordinal()) ? 32 : 16;
        }
        if (composerStartRestartGroup.shouldExecute((i2 & 19) != 18, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1218152484, i2, -1, "app.chalo.instantticket.ui.routeselection.compose.RouteSelectionSpecialFeatureTag (RouteSelectionInput.kt:84)");
            }
            int[] iArr = WhenMappings.f3970a;
            int i3 = iArr[type.ordinal()];
            if (i3 == 1) {
                jC = ChaloColorTokenKt.c(ChaloColorToken.RealTimeFetchingStringColor.f9845a);
            } else {
                if (i3 != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                jC = ChaloColorTokenKt.c(ChaloColorToken.SpecialFeatureTagBackgroundColor.f9856a);
            }
            long j2 = jC;
            int i4 = iArr[type.ordinal()];
            if (i4 == 1) {
                composerStartRestartGroup.startReplaceGroup(1881549729);
                j = ChaloTheme.a(composerStartRestartGroup, 0).t;
                composerStartRestartGroup.endReplaceGroup();
            } else {
                if (i4 != 2) {
                    throw pk0.p(composerStartRestartGroup, 1881547120);
                }
                composerStartRestartGroup.startReplaceGroup(1881552260);
                j = ChaloTheme.a(composerStartRestartGroup, 0).g;
                composerStartRestartGroup.endReplaceGroup();
            }
            Modifier.Companion companion = Modifier.INSTANCE;
            Modifier modifierM264backgroundbw27NRU$default = BackgroundKt.m264backgroundbw27NRU$default(PaddingKt.m788paddingqDBjuR0$default(companion, ChaloTheme.b(composerStartRestartGroup, 0).f, 0.0f, 0.0f, 0.0f, 14, null), j2, null, 2, null);
            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
            long currentCompositeKeyHashCode = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
            int i5 = (int) (currentCompositeKeyHashCode ^ (currentCompositeKeyHashCode >>> 32));
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierM264backgroundbw27NRU$default);
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
            Updater.m3923setimpl(composerM3915constructorimpl, modifierMaterializeModifier, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion2, composerM3915constructorimpl, Integer.valueOf(i5), composerM3915constructorimpl));
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            composer2 = composerStartRestartGroup;
            androidx.compose.material3.TextKt.m2623TextNvy7gAk(name, PaddingKt.m784padding3ABfNKs(companion, ChaloTheme.b(composerStartRestartGroup, 0).d), j, null, 0L, null, FontWeight.INSTANCE.getSemiBold(), null, 0L, null, null, 0L, 0, false, 0, 0, null, ChaloTypographyKt.d(ChaloTheme.e(composerStartRestartGroup, 0)), composer2, (i2 & 14) | 1572864, 0, 131000);
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
            scopeUpdateScopeEndRestartGroup.updateScope(new k31(name, type, i, 11));
        }
    }
}
