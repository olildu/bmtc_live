package defpackage;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.material3.DividerKt;
import androidx.compose.material3.TextKt;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import app.chalo.compose.components.ChaloHorizontalImagesViewKt;
import app.chalo.compose.components.buttons.ChaloFilledButtonKt;
import app.chalo.compose.resources.StringResourcesHelperKt;
import app.chalo.compose.theme.ChaloTheme;
import app.chalo.compose.theme.ChaloTypographyKt;
import app.chalo.location.LatLng;
import app.chalo.premiumbus.ui.stopdetails.PBBusStopImageType;
import app.chalo.providers.stringprovider.StringEnum;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: PBStopDetailsKt, reason: from Kotlin metadata */
/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"productbooking_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class productbooking_release {
    public static final void a(Modifier modifier, String str, String str2, LatLng latLng, PBBusStopImageType stopImageType, Function1 onDirectionClick, Function1 function1, Composer composer, int i) {
        int i2;
        PBBusStopImageType pBBusStopImageType;
        Function1 function2;
        ComposeUiNode.Companion companion;
        int i3;
        Intrinsics.i(stopImageType, "stopImageType");
        Intrinsics.i(onDirectionClick, "onDirectionClick");
        Composer composerStartRestartGroup = composer.startRestartGroup(2006161025);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changed(modifier) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changed(str) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= composerStartRestartGroup.changed(str2) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= (i & 4096) == 0 ? composerStartRestartGroup.changed(latLng) : composerStartRestartGroup.changedInstance(latLng) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= composerStartRestartGroup.changed(stopImageType) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(onDirectionClick) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(function1) ? 1048576 : 524288;
        }
        if (composerStartRestartGroup.shouldExecute((599187 & i2) != 599186, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(2006161025, i2, -1, "PBStopDetailsSection (PBStopDetails.kt:35)");
            }
            Arrangement arrangement = Arrangement.INSTANCE;
            Arrangement.Vertical top = arrangement.getTop();
            Alignment.Companion companion2 = Alignment.INSTANCE;
            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(top, companion2.getStart(), composerStartRestartGroup, 0);
            long currentCompositeKeyHashCode = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
            int i4 = (int) (currentCompositeKeyHashCode ^ (currentCompositeKeyHashCode >>> 32));
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifier);
            ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor = companion3.getConstructor();
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
            pk0.v(companion3, composerM3915constructorimpl, measurePolicyColumnMeasurePolicy, composerM3915constructorimpl, currentCompositionLocalMap);
            Updater.m3923setimpl(composerM3915constructorimpl, modifierMaterializeModifier, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion3, composerM3915constructorimpl, Integer.valueOf(i4), composerM3915constructorimpl));
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
            int i5 = i2;
            TextKt.m2623TextNvy7gAk(str, null, ChaloTheme.a(composerStartRestartGroup, 0).e, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ChaloTypographyKt.f(ChaloTheme.e(composerStartRestartGroup, 0)), composerStartRestartGroup, (i2 >> 3) & 14, 0, 131066);
            Composer composer2 = composerStartRestartGroup;
            if (str2 == null) {
                composer2.startReplaceGroup(1309826321);
                composer2.endReplaceGroup();
                i3 = 0;
                companion = companion3;
            } else {
                composer2.startReplaceGroup(1309826322);
                SpacerKt.Spacer(SizeKt.m814height3ABfNKs(Modifier.INSTANCE, ChaloTheme.b(composer2, 0).h), composer2, 0);
                companion = companion3;
                i3 = 0;
                TextKt.m2623TextNvy7gAk(str2, null, ChaloTheme.a(composer2, 0).e, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ChaloTypographyKt.b(ChaloTheme.e(composer2, 0)), composer2, 0, 0, 131066);
                composer2 = composer2;
                composer2.endReplaceGroup();
            }
            composer2.startReplaceGroup(1310120667);
            Modifier.Companion companion4 = Modifier.INSTANCE;
            SpacerKt.Spacer(SizeKt.m814height3ABfNKs(companion4, ChaloTheme.b(composer2, i3).h), composer2, i3);
            long j = ChaloTheme.a(composer2, i3).f1915a;
            Shape shape = ChaloTheme.d(composer2, i3).b;
            int i6 = (composer2.changedInstance(latLng) ? 1 : 0) | ((i5 & 458752) == 131072 ? 1 : i3);
            Object objRememberedValue = composer2.rememberedValue();
            if (i6 != 0 || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                function2 = onDirectionClick;
                objRememberedValue = new zf0(20, function2, latLng);
                composer2.updateRememberedValue(objRememberedValue);
            } else {
                function2 = onDirectionClick;
            }
            Composer composer3 = composer2;
            ChaloFilledButtonKt.b(null, j, 0L, shape, null, null, (Function0) objRememberedValue, ComposableSingletons$PBStopDetailsKt.f145a, composer3, 12779520, 21);
            composerStartRestartGroup = composer3;
            composerStartRestartGroup.endReplaceGroup();
            pBBusStopImageType = stopImageType;
            if (pBBusStopImageType instanceof PBBusStopImageType.Available) {
                composerStartRestartGroup.startReplaceGroup(1311191593);
                SpacerKt.Spacer(SizeKt.m814height3ABfNKs(companion4, ChaloTheme.b(composerStartRestartGroup, i3).h), composerStartRestartGroup, i3);
                DividerKt.m1949Divider9IZ8Weo(null, ChaloTheme.b(composerStartRestartGroup, i3).b, ChaloTheme.a(composerStartRestartGroup, i3).m, composerStartRestartGroup, 0, 1);
                SpacerKt.Spacer(SizeKt.m814height3ABfNKs(companion4, ChaloTheme.b(composerStartRestartGroup, i3).h), composerStartRestartGroup, i3);
                MeasurePolicy measurePolicyColumnMeasurePolicy2 = ColumnKt.columnMeasurePolicy(arrangement.getTop(), companion2.getStart(), composerStartRestartGroup, i3);
                long currentCompositeKeyHashCode2 = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, i3);
                int i7 = (int) (currentCompositeKeyHashCode2 ^ (currentCompositeKeyHashCode2 >>> 32));
                CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, companion4);
                Function0<ComposeUiNode> constructor2 = companion.getConstructor();
                if ((composerStartRestartGroup.getApplier() != null ? 1 : i3) == 0) {
                    ComposablesKt.invalidApplier();
                }
                composerStartRestartGroup.startReusableNode();
                if (composerStartRestartGroup.getInserting()) {
                    composerStartRestartGroup.createNode(constructor2);
                } else {
                    composerStartRestartGroup.useNode();
                }
                Composer composerM3915constructorimpl2 = Updater.m3915constructorimpl(composerStartRestartGroup);
                ComposeUiNode.Companion companion5 = companion;
                pk0.v(companion5, composerM3915constructorimpl2, measurePolicyColumnMeasurePolicy2, composerM3915constructorimpl2, currentCompositionLocalMap2);
                Updater.m3923setimpl(composerM3915constructorimpl2, modifierMaterializeModifier2, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion5, composerM3915constructorimpl2, Integer.valueOf(i7), composerM3915constructorimpl2));
                TextKt.m2623TextNvy7gAk(StringResourcesHelperKt.c(StringEnum.IMAGES, new Object[i3], composerStartRestartGroup, 6), null, ChaloTheme.a(composerStartRestartGroup, i3).e, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ChaloTypographyKt.c(ChaloTheme.e(composerStartRestartGroup, i3)), composerStartRestartGroup, 0, 0, 131066);
                composerStartRestartGroup = composerStartRestartGroup;
                SpacerKt.Spacer(SizeKt.m814height3ABfNKs(companion4, ChaloTheme.b(composerStartRestartGroup, i3).g), composerStartRestartGroup, i3);
                List list = ((PBBusStopImageType.Available) pBBusStopImageType).f7931a;
                int i8 = (i5 & 3670016) == 1048576 ? 1 : i3;
                Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                if (i8 != 0 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue2 = new sn0(function1, 1);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                }
                ChaloHorizontalImagesViewKt.a(i3, composerStartRestartGroup, null, list, (Function1) objRememberedValue2);
                composerStartRestartGroup.endNode();
                composerStartRestartGroup.endReplaceGroup();
            } else {
                ComposeUiNode.Companion companion6 = companion;
                if (pBBusStopImageType.equals(PBBusStopImageType.NotAvailable.f7932a)) {
                    composerStartRestartGroup.startReplaceGroup(1311979241);
                    composerStartRestartGroup.endReplaceGroup();
                } else {
                    if (!pBBusStopImageType.equals(PBBusStopImageType.ShowError.f7933a)) {
                        throw pk0.p(composerStartRestartGroup, -2035914838);
                    }
                    composerStartRestartGroup.startReplaceGroup(1312046728);
                    SpacerKt.Spacer(SizeKt.m814height3ABfNKs(companion4, ChaloTheme.b(composerStartRestartGroup, i3).h), composerStartRestartGroup, i3);
                    int i9 = 1;
                    DividerKt.m1949Divider9IZ8Weo(null, ChaloTheme.b(composerStartRestartGroup, i3).b, ChaloTheme.a(composerStartRestartGroup, i3).m, composerStartRestartGroup, 0, 1);
                    SpacerKt.Spacer(SizeKt.m814height3ABfNKs(companion4, ChaloTheme.b(composerStartRestartGroup, i3).h), composerStartRestartGroup, i3);
                    MeasurePolicy measurePolicyColumnMeasurePolicy3 = ColumnKt.columnMeasurePolicy(arrangement.getTop(), companion2.getStart(), composerStartRestartGroup, i3);
                    long currentCompositeKeyHashCode3 = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, i3);
                    int i10 = (int) (currentCompositeKeyHashCode3 ^ (currentCompositeKeyHashCode3 >>> 32));
                    CompositionLocalMap currentCompositionLocalMap3 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier3 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, companion4);
                    Function0<ComposeUiNode> constructor3 = companion6.getConstructor();
                    if (composerStartRestartGroup.getApplier() == null) {
                        i9 = i3;
                    }
                    if (i9 == 0) {
                        ComposablesKt.invalidApplier();
                    }
                    composerStartRestartGroup.startReusableNode();
                    if (composerStartRestartGroup.getInserting()) {
                        composerStartRestartGroup.createNode(constructor3);
                    } else {
                        composerStartRestartGroup.useNode();
                    }
                    Composer composerM3915constructorimpl3 = Updater.m3915constructorimpl(composerStartRestartGroup);
                    pk0.v(companion6, composerM3915constructorimpl3, measurePolicyColumnMeasurePolicy3, composerM3915constructorimpl3, currentCompositionLocalMap3);
                    Updater.m3923setimpl(composerM3915constructorimpl3, modifierMaterializeModifier3, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion6, composerM3915constructorimpl3, Integer.valueOf(i10), composerM3915constructorimpl3));
                    TextKt.m2623TextNvy7gAk(StringResourcesHelperKt.c(StringEnum.IMAGES, new Object[i3], composerStartRestartGroup, 6), null, ChaloTheme.a(composerStartRestartGroup, i3).e, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ChaloTypographyKt.c(ChaloTheme.e(composerStartRestartGroup, i3)), composerStartRestartGroup, 0, 0, 131066);
                    composerStartRestartGroup = composerStartRestartGroup;
                    SpacerKt.Spacer(SizeKt.m814height3ABfNKs(companion4, ChaloTheme.b(composerStartRestartGroup, i3).g), composerStartRestartGroup, i3);
                    b(null, composerStartRestartGroup, i3);
                    composerStartRestartGroup.endNode();
                    composerStartRestartGroup.endReplaceGroup();
                }
            }
            composerStartRestartGroup.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            pBBusStopImageType = stopImageType;
            function2 = onDirectionClick;
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new km(modifier, str, str2, latLng, pBBusStopImageType, function2, function1, i, 5));
        }
    }

    public static final void b(Modifier modifier, Composer composer, int i) {
        Composer composer2;
        Modifier modifier2;
        Composer composerStartRestartGroup = composer.startRestartGroup(548890260);
        int i2 = i | 6;
        if (composerStartRestartGroup.shouldExecute((i2 & 3) != 2, i2 & 1)) {
            Modifier.Companion companion = Modifier.INSTANCE;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(548890260, i2, -1, "PBStopImageNotAvailableError (PBStopDetails.kt:122)");
            }
            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composerStartRestartGroup, 0);
            long currentCompositeKeyHashCode = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
            int i3 = (int) (currentCompositeKeyHashCode ^ (currentCompositeKeyHashCode >>> 32));
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
            Updater.m3923setimpl(composerM3915constructorimpl, modifierMaterializeModifier, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion2, composerM3915constructorimpl, Integer.valueOf(i3), composerM3915constructorimpl));
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
            composer2 = composerStartRestartGroup;
            modifier2 = companion;
            TextKt.m2623TextNvy7gAk(StringResourcesHelperKt.c(StringEnum.NO_PHOTOS_FOR_STOP_HEADING, new Object[0], composerStartRestartGroup, 6), null, ChaloTheme.a(composerStartRestartGroup, 0).e, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ChaloTypographyKt.g(ChaloTheme.e(composerStartRestartGroup, 0)), composer2, 0, 0, 131066);
            SpacerKt.Spacer(SizeKt.m814height3ABfNKs(modifier2, ChaloTheme.b(composer2, 0).f), composer2, 0);
            TextKt.m2623TextNvy7gAk(StringResourcesHelperKt.c(StringEnum.NO_PHOTOS_FOR_STOP_MSG, new Object[0], composer2, 6), null, ChaloTheme.a(composer2, 0).e, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ChaloTypographyKt.c(ChaloTheme.e(composer2, 0)), composer2, 0, 0, 131066);
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
            scopeUpdateScopeEndRestartGroup.updateScope(new zc(modifier2, i, 13));
        }
    }
}
