package app.chalo.home.ui;

import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.ScrollKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material3.DividerKt;
import androidx.compose.material3.TextKt;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.snapshots.SnapshotStateMap;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.layout.ContentScale;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.OnGloballyPositionedModifierKt;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.unit.Density;
import app.chalo.compose.ChaloToolBarKt;
import app.chalo.compose.components.ChaloCircularLoadingBoxKt;
import app.chalo.compose.components.ChaloSpacersKt;
import app.chalo.compose.components.plotline.PlotlineComposeWidgetKt;
import app.chalo.compose.resources.PainterResourceHelperKt;
import app.chalo.compose.resources.StringResourcesHelperKt;
import app.chalo.compose.theme.ChaloTheme;
import app.chalo.compose.theme.ChaloTypographyKt;
import app.chalo.providers.iconassetprovider.IconType;
import app.chalo.providers.stringprovider.StringEnum;
import com.arkivanov.decompose.extensions.compose.SubscribeAsStateKt;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import defpackage.pk0;
import defpackage.r1;
import defpackage.za0;
import defpackage.zr0;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.IntIterator;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.ranges.IntProgressionIterator;
import kotlin.ranges.IntRange;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002¨\u0006\u0002²\u0006\f\u0010\u0001\u001a\u00020\u00008\nX\u008a\u0084\u0002"}, d2 = {"Lapp/chalo/home/ui/PremiumBusNotificationViewState;", RemoteConfigConstants.ResponseFieldKey.STATE, "home_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class PremiumBusNotificationScreenKt {
    /* JADX WARN: Multi-variable type inference failed */
    public static final void a(PremiumBusNotificationComponent premiumBusNotificationComponent, Composer composer, int i) {
        int i2;
        Composer composerStartRestartGroup = composer.startRestartGroup(1122177088);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(premiumBusNotificationComponent) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (composerStartRestartGroup.shouldExecute((i2 & 3) != 2, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1122177088, i2, -1, "app.chalo.home.ui.PremiumBusNotificationScreen (PremiumBusNotificationScreen.kt:38)");
            }
            b((PremiumBusNotificationViewState) SubscribeAsStateKt.a(premiumBusNotificationComponent.t0(), composerStartRestartGroup).getValue(), composerStartRestartGroup, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new zr0(premiumBusNotificationComponent, i, 14));
        }
    }

    public static final void b(PremiumBusNotificationViewState premiumBusNotificationViewState, Composer composer, int i) {
        int i2;
        PremiumBusNotificationViewState premiumBusNotificationViewState2;
        Modifier modifierVerticalScroll$default;
        int i3;
        Composer composerStartRestartGroup = composer.startRestartGroup(894530607);
        if ((i & 6) == 0) {
            i2 = i | (composerStartRestartGroup.changed(premiumBusNotificationViewState) ? 4 : 2);
        } else {
            i2 = i;
        }
        if (composerStartRestartGroup.shouldExecute((i2 & 3) != 2, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(894530607, i2, -1, "app.chalo.home.ui.PremiumBusNotificationScreen (PremiumBusNotificationScreen.kt:45)");
            }
            Density density = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = SnapshotStateKt.mutableStateMapOf();
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            SnapshotStateMap snapshotStateMap = (SnapshotStateMap) objRememberedValue;
            Modifier.Companion companion = Modifier.INSTANCE;
            Modifier modifierM264backgroundbw27NRU$default = BackgroundKt.m264backgroundbw27NRU$default(SizeKt.fillMaxSize$default(companion, 0.0f, 1, null), ChaloTheme.a(composerStartRestartGroup, 0).t, null, 2, null);
            Arrangement arrangement = Arrangement.INSTANCE;
            Arrangement.Vertical top = arrangement.getTop();
            Alignment.Companion companion2 = Alignment.INSTANCE;
            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(top, companion2.getStart(), composerStartRestartGroup, 0);
            long currentCompositeKeyHashCode = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
            int i4 = (int) (currentCompositeKeyHashCode ^ (currentCompositeKeyHashCode >>> 32));
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
            pk0.v(companion3, composerM3915constructorimpl, measurePolicyColumnMeasurePolicy, composerM3915constructorimpl, currentCompositionLocalMap);
            Updater.m3923setimpl(composerM3915constructorimpl, modifierMaterializeModifier, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion3, composerM3915constructorimpl, Integer.valueOf(i4), composerM3915constructorimpl));
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
            Density density2 = density;
            ChaloToolBarKt.a(null, ComposableSingletons$PremiumBusNotificationScreenKt.f3168a, null, null, ChaloTheme.b(composerStartRestartGroup, 0).f1916a, 0L, null, null, false, null, composerStartRestartGroup, 48, 0, 2029);
            DividerKt.m1949Divider9IZ8Weo(null, 0.0f, 0L, composerStartRestartGroup, 0, 7);
            Modifier modifierFillMaxSize$default = SizeKt.fillMaxSize$default(companion, 0.0f, 1, null);
            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(companion2.getTopStart(), false);
            long currentCompositeKeyHashCode2 = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
            int i5 = (int) (currentCompositeKeyHashCode2 ^ (currentCompositeKeyHashCode2 >>> 32));
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
            pk0.v(companion3, composerM3915constructorimpl2, measurePolicyMaybeCachedBoxMeasurePolicy, composerM3915constructorimpl2, currentCompositionLocalMap2);
            Updater.m3923setimpl(composerM3915constructorimpl2, modifierMaterializeModifier2, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion3, composerM3915constructorimpl2, Integer.valueOf(i5), composerM3915constructorimpl2));
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            if (snapshotStateMap.containsValue(Boolean.TRUE)) {
                composerStartRestartGroup.startReplaceGroup(-639576775);
                modifierVerticalScroll$default = ScrollKt.verticalScroll$default(SizeKt.fillMaxSize$default(companion, 0.0f, 1, null), ScrollKt.rememberScrollState(0, composerStartRestartGroup, 0, 1), false, null, false, 14, null);
                composerStartRestartGroup.endReplaceGroup();
            } else {
                composerStartRestartGroup.startReplaceGroup(-639646959);
                composerStartRestartGroup.endReplaceGroup();
                modifierVerticalScroll$default = SizeKt.fillMaxSize$default(companion, 0.0f, 1, null);
            }
            MeasurePolicy measurePolicyColumnMeasurePolicy2 = ColumnKt.columnMeasurePolicy(arrangement.getTop(), companion2.getStart(), composerStartRestartGroup, 0);
            long currentCompositeKeyHashCode3 = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
            int i6 = (int) (currentCompositeKeyHashCode3 ^ (currentCompositeKeyHashCode3 >>> 32));
            CompositionLocalMap currentCompositionLocalMap3 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier3 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierVerticalScroll$default);
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
            pk0.v(companion3, composerM3915constructorimpl3, measurePolicyColumnMeasurePolicy2, composerM3915constructorimpl3, currentCompositionLocalMap3);
            Updater.m3923setimpl(composerM3915constructorimpl3, modifierMaterializeModifier3, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion3, composerM3915constructorimpl3, Integer.valueOf(i6), composerM3915constructorimpl3));
            premiumBusNotificationViewState2 = premiumBusNotificationViewState;
            String str = premiumBusNotificationViewState2.f3177a;
            if (str == null) {
                composerStartRestartGroup.startReplaceGroup(1437499701);
            } else {
                composerStartRestartGroup.startReplaceGroup(1437499702);
                composerStartRestartGroup.startReplaceGroup(2124582348);
                Iterator<Integer> it = new IntRange(0, 14, 1).iterator();
                while (((IntProgressionIterator) it).c) {
                    String str2 = "PB_NOTIFICATION_CARD_" + str + "_" + ((IntIterator) it).nextInt();
                    Modifier.Companion companion4 = Modifier.INSTANCE;
                    Density density3 = density2;
                    boolean zChanged = composerStartRestartGroup.changed(density3) | composerStartRestartGroup.changed(str2);
                    Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                    if (zChanged || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue2 = new za0(25, density3, snapshotStateMap, str2);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                    }
                    PlotlineComposeWidgetKt.a(0, 0, composerStartRestartGroup, OnGloballyPositionedModifierKt.onGloballyPositioned(companion4, (Function1) objRememberedValue2), str2);
                    density2 = density3;
                }
                composerStartRestartGroup.endReplaceGroup();
            }
            composerStartRestartGroup.endReplaceGroup();
            if (snapshotStateMap.containsValue(Boolean.TRUE)) {
                i3 = 1;
                composerStartRestartGroup.startReplaceGroup(1434652197);
            } else {
                composerStartRestartGroup.startReplaceGroup(1438199434);
                Modifier.Companion companion5 = Modifier.INSTANCE;
                Modifier modifierFillMaxSize$default2 = SizeKt.fillMaxSize$default(companion5, 0.0f, 1, null);
                Alignment.Companion companion6 = Alignment.INSTANCE;
                MeasurePolicy measurePolicyColumnMeasurePolicy3 = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getCenter(), companion6.getCenterHorizontally(), composerStartRestartGroup, 54);
                long currentCompositeKeyHashCode4 = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
                int i7 = (int) (currentCompositeKeyHashCode4 ^ (currentCompositeKeyHashCode4 >>> 32));
                CompositionLocalMap currentCompositionLocalMap4 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier4 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierFillMaxSize$default2);
                ComposeUiNode.Companion companion7 = ComposeUiNode.INSTANCE;
                Function0<ComposeUiNode> constructor4 = companion7.getConstructor();
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
                pk0.v(companion7, composerM3915constructorimpl4, measurePolicyColumnMeasurePolicy3, composerM3915constructorimpl4, currentCompositionLocalMap4);
                Updater.m3923setimpl(composerM3915constructorimpl4, modifierMaterializeModifier4, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion7, composerM3915constructorimpl4, Integer.valueOf(i7), composerM3915constructorimpl4));
                ColumnScopeInstance columnScopeInstance2 = ColumnScopeInstance.INSTANCE;
                ImageKt.Image(PainterResourceHelperKt.a(IconType.IC_EMPTY_STATE, composerStartRestartGroup, 6), "", (Modifier) null, (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composerStartRestartGroup, Painter.$stable | 48, 124);
                ChaloSpacersKt.n(composerStartRestartGroup, 0);
                i3 = 1;
                TextKt.m2623TextNvy7gAk(StringResourcesHelperKt.c(StringEnum.YOU_HAVE_NO_NEW_NOTIFICATIONS, new Object[0], composerStartRestartGroup, 6), columnScopeInstance2.align(companion5, companion6.getCenterHorizontally()), ChaloTheme.a(composerStartRestartGroup, 0).e, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ChaloTypographyKt.d(ChaloTheme.e(composerStartRestartGroup, 0)), composerStartRestartGroup, 0, 0, 131064);
                composerStartRestartGroup = composerStartRestartGroup;
                composerStartRestartGroup.endNode();
            }
            composerStartRestartGroup.endReplaceGroup();
            composerStartRestartGroup.endNode();
            if (premiumBusNotificationViewState2.b) {
                composerStartRestartGroup.startReplaceGroup(-637757912);
                Modifier modifierM264backgroundbw27NRU$default2 = BackgroundKt.m264backgroundbw27NRU$default(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, i3, null), ChaloTheme.a(composerStartRestartGroup, 0).t, null, 2, null);
                MeasurePolicy measurePolicyColumnMeasurePolicy4 = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composerStartRestartGroup, 0);
                long currentCompositeKeyHashCode5 = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
                int i8 = (int) (currentCompositeKeyHashCode5 ^ (currentCompositeKeyHashCode5 >>> 32));
                CompositionLocalMap currentCompositionLocalMap5 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier5 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierM264backgroundbw27NRU$default2);
                ComposeUiNode.Companion companion8 = ComposeUiNode.INSTANCE;
                Function0<ComposeUiNode> constructor5 = companion8.getConstructor();
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
                pk0.v(companion8, composerM3915constructorimpl5, measurePolicyColumnMeasurePolicy4, composerM3915constructorimpl5, currentCompositionLocalMap5);
                Updater.m3923setimpl(composerM3915constructorimpl5, modifierMaterializeModifier5, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion8, composerM3915constructorimpl5, Integer.valueOf(i8), composerM3915constructorimpl5));
                ColumnScopeInstance columnScopeInstance3 = ColumnScopeInstance.INSTANCE;
                ChaloCircularLoadingBoxKt.a(null, composerStartRestartGroup, 0);
                composerStartRestartGroup.endNode();
            } else {
                composerStartRestartGroup.startReplaceGroup(-642209233);
            }
            composerStartRestartGroup.endReplaceGroup();
            if (r1.k(composerStartRestartGroup)) {
                ComposerKt.traceEventEnd();
            }
        } else {
            premiumBusNotificationViewState2 = premiumBusNotificationViewState;
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new zr0(premiumBusNotificationViewState2, i, 15));
        }
    }
}
