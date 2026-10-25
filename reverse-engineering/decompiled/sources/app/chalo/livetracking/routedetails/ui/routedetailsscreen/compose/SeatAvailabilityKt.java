package app.chalo.livetracking.routedetails.ui.routedetailsscreen.compose;

import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.ClipKt;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.layout.ContentScale;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import app.chalo.citydata.data.model.app.SeatAvailabilityLevel;
import app.chalo.compose.components.ChaloSpacersKt;
import app.chalo.compose.components.PlotlineComposeWidgetKt;
import app.chalo.compose.components.TextKt;
import app.chalo.compose.components.image.CommonImageKt;
import app.chalo.compose.components.image.GifUIKt;
import app.chalo.compose.resources.PainterResourceHelperKt;
import app.chalo.compose.resources.StringResourcesHelperKt;
import app.chalo.compose.theme.ChaloTheme;
import app.chalo.compose.theme.ChaloThemeKt;
import app.chalo.livetracking.routedetails.data.model.app.ExtensionsKt;
import app.chalo.livetracking.ui.routedetailsscreen.uistatefactory.BusEtaWithSeatAvailabilityAndBonnet;
import app.chalo.livetracking.ui.routedetailsscreen.uistatefactory.BusEtaWithSeatAvailabilityAndBonnetUISpec;
import app.chalo.livetracking.ui.routedetailsscreen.uistatefactory.BusEtaWithSeatAvailabilityUISpec;
import app.chalo.livetracking.ui.routedetailsscreen.uistatefactory.BusRealtimeIndicatorUIState;
import app.chalo.livetracking.ui.routedetailsscreen.uistatefactory.RouteScreenBusNumberUIState;
import app.chalo.livetracking.ui.routedetailsscreen.uistatefactory.SeatAvailabilityUISpec;
import app.chalo.livetracking.ui.routedetailsscreen.uistatefactory.SeatAvailabilityUIState;
import app.chalo.providers.iconassetprovider.IconType;
import app.chalo.providers.lottieassetprovider.LottieType;
import app.chalo.providers.stringprovider.StringEnum;
import app.chalo.uistate.base.ChaloColorTokenKt;
import app.chalo.uistate.base.UiEventHandler;
import app.chalo.uistate.base.UiEventHandler$Companion$fromLambda$1;
import app.chalo.uistate.image.GifImageUIState;
import app.chalo.uistate.image.ImageUISize;
import app.chalo.uistate.image.ImageUIState;
import app.chalo.uistate.image.ImageUIStateKt;
import app.chalo.uistate.text.TextUIState;
import defpackage.cm0;
import defpackage.ey0;
import defpackage.i41;
import defpackage.k31;
import defpackage.o01;
import defpackage.pk0;
import defpackage.r1;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KFunction;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"livetracking_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class SeatAvailabilityKt {
    public static final void a(BusEtaWithSeatAvailabilityAndBonnet state, Modifier modifier, Composer composer, int i) {
        int i2;
        Modifier modifier2;
        ComposeUiNode.Companion companion;
        int i3;
        Intrinsics.i(state, "state");
        BusEtaWithSeatAvailabilityUISpec busEtaWithSeatAvailabilityUISpec = state.f;
        Composer composerStartRestartGroup = composer.startRestartGroup(-485146523);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changed(state) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        int i4 = i2 | 48;
        if (composerStartRestartGroup.shouldExecute((i4 & 19) != 18, i4 & 1)) {
            Modifier.Companion companion2 = Modifier.INSTANCE;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-485146523, i4, -1, "app.chalo.livetracking.routedetails.ui.routedetailsscreen.compose.BusEtaWithSeatAvailability (SeatAvailability.kt:243)");
            }
            Arrangement arrangement = Arrangement.INSTANCE;
            Arrangement.Vertical top = arrangement.getTop();
            Alignment.Companion companion3 = Alignment.INSTANCE;
            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(top, companion3.getStart(), composerStartRestartGroup, 0);
            long currentCompositeKeyHashCode = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
            int i5 = (int) (currentCompositeKeyHashCode ^ (currentCompositeKeyHashCode >>> 32));
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, companion2);
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
            Updater.m3923setimpl(composerM3915constructorimpl, modifierMaterializeModifier, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion4, composerM3915constructorimpl, Integer.valueOf(i5), composerM3915constructorimpl));
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
            RouteScreenBusNumberUIState routeScreenBusNumberUIState = state.f4905a;
            if (routeScreenBusNumberUIState == null) {
                composerStartRestartGroup.startReplaceGroup(-368244371);
                composerStartRestartGroup.endReplaceGroup();
                companion = companion4;
                i3 = 0;
            } else {
                BusEtaWithSeatAvailabilityAndBonnetUISpec busEtaWithSeatAvailabilityAndBonnetUISpec = routeScreenBusNumberUIState.d;
                composerStartRestartGroup.startReplaceGroup(-368244370);
                ChaloSpacersKt.a(busEtaWithSeatAvailabilityAndBonnetUISpec.d, composerStartRestartGroup, 0);
                Modifier modifierC = ChaloThemeKt.c(BackgroundKt.m263backgroundbw27NRU(companion2, ChaloColorTokenKt.c(busEtaWithSeatAvailabilityAndBonnetUISpec.b), ChaloThemeKt.d(busEtaWithSeatAvailabilityAndBonnetUISpec.c)), busEtaWithSeatAvailabilityAndBonnetUISpec.f4906a);
                MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(arrangement.getStart(), companion3.getCenterVertically(), composerStartRestartGroup, 48);
                long currentCompositeKeyHashCode2 = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
                int i6 = (int) (currentCompositeKeyHashCode2 ^ (currentCompositeKeyHashCode2 >>> 32));
                CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierC);
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
                Updater.m3923setimpl(composerM3915constructorimpl2, modifierMaterializeModifier2, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion4, composerM3915constructorimpl2, Integer.valueOf(i6), composerM3915constructorimpl2));
                RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
                CommonImageKt.a(routeScreenBusNumberUIState.f4936a, null, false, composerStartRestartGroup, 0, 6);
                ChaloSpacersKt.a(busEtaWithSeatAvailabilityAndBonnetUISpec.d, composerStartRestartGroup, 0);
                TextUIState textUIState = routeScreenBusNumberUIState.b;
                if (textUIState == null) {
                    composerStartRestartGroup.startReplaceGroup(-1641475223);
                    composerStartRestartGroup.endReplaceGroup();
                    companion = companion4;
                } else {
                    composerStartRestartGroup.startReplaceGroup(-1641475222);
                    companion = companion4;
                    TextKt.c(textUIState, null, null, null, composerStartRestartGroup, 0, 14);
                    composerStartRestartGroup = composerStartRestartGroup;
                    composerStartRestartGroup.endReplaceGroup();
                }
                composerStartRestartGroup.endNode();
                i3 = 0;
                ChaloSpacersKt.a(busEtaWithSeatAvailabilityUISpec.c, composerStartRestartGroup, 0);
                composerStartRestartGroup.endReplaceGroup();
            }
            MeasurePolicy measurePolicyRowMeasurePolicy2 = RowKt.rowMeasurePolicy(arrangement.getStart(), companion3.getCenterVertically(), composerStartRestartGroup, 48);
            long currentCompositeKeyHashCode3 = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, i3);
            int i7 = (int) ((currentCompositeKeyHashCode3 >>> 32) ^ currentCompositeKeyHashCode3);
            CompositionLocalMap currentCompositionLocalMap3 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier3 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, companion2);
            Function0<ComposeUiNode> constructor3 = companion.getConstructor();
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
            pk0.v(companion, composerM3915constructorimpl3, measurePolicyRowMeasurePolicy2, composerM3915constructorimpl3, currentCompositionLocalMap3);
            Updater.m3923setimpl(composerM3915constructorimpl3, modifierMaterializeModifier3, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion, composerM3915constructorimpl3, Integer.valueOf(i7), composerM3915constructorimpl3));
            RowScopeInstance rowScopeInstance2 = RowScopeInstance.INSTANCE;
            ImageUIState imageUIState = state.b;
            if (imageUIState == null) {
                composerStartRestartGroup.startReplaceGroup(690276744);
            } else {
                composerStartRestartGroup.startReplaceGroup(690276745);
                CommonImageKt.a(imageUIState, ClipKt.clipToBounds(PaddingKt.m788paddingqDBjuR0$default(companion2, 0.0f, 0.0f, ChaloTheme.b(composerStartRestartGroup, 0).e, 0.0f, 11, null)), false, composerStartRestartGroup, 0, 4);
            }
            composerStartRestartGroup.endReplaceGroup();
            BusRealtimeIndicatorUIState busRealtimeIndicatorUIState = state.c;
            if (busRealtimeIndicatorUIState == null) {
                composerStartRestartGroup.startReplaceGroup(690580358);
            } else {
                composerStartRestartGroup.startReplaceGroup(690580359);
                if (busRealtimeIndicatorUIState instanceof BusRealtimeIndicatorUIState.Image) {
                    composerStartRestartGroup.startReplaceGroup(432795850);
                    CommonImageKt.a(((BusRealtimeIndicatorUIState.Image) busRealtimeIndicatorUIState).f4909a, ChaloThemeKt.c(companion2, busEtaWithSeatAvailabilityUISpec.d), false, composerStartRestartGroup, 0, 4);
                    composerStartRestartGroup.endReplaceGroup();
                } else {
                    if (!(busRealtimeIndicatorUIState instanceof BusRealtimeIndicatorUIState.Gif)) {
                        throw pk0.p(composerStartRestartGroup, -401682955);
                    }
                    composerStartRestartGroup.startReplaceGroup(433146119);
                    GifUIKt.a(ChaloThemeKt.c(companion2, busEtaWithSeatAvailabilityUISpec.d), ((BusRealtimeIndicatorUIState.Gif) busRealtimeIndicatorUIState).f4908a, composerStartRestartGroup, 0, 0);
                    composerStartRestartGroup.endReplaceGroup();
                }
            }
            composerStartRestartGroup.endReplaceGroup();
            Composer composer2 = composerStartRestartGroup;
            TextKt.c(state.d, PlotlineComposeWidgetKt.a(ChaloThemeKt.c(companion2, busEtaWithSeatAvailabilityUISpec.e), "PL_Bus_ETA"), null, null, composer2, 0, 12);
            composerStartRestartGroup = composer2;
            Modifier modifierA = i41.a(rowScopeInstance2, companion2, 1.0f, false, 2, null);
            modifier2 = companion2;
            SpacerKt.Spacer(modifierA, composerStartRestartGroup, 0);
            SeatAvailabilityUIState seatAvailabilityUIState = state.e;
            if (seatAvailabilityUIState == null) {
                composerStartRestartGroup.startReplaceGroup(691604009);
            } else {
                composerStartRestartGroup.startReplaceGroup(691604010);
                d(seatAvailabilityUIState, PlotlineComposeWidgetKt.a(ChaloThemeKt.c(modifier2, busEtaWithSeatAvailabilityUISpec.f4907a), "PL_Passenger_Indicator"), composerStartRestartGroup, 0);
            }
            composerStartRestartGroup.endReplaceGroup();
            if (r1.k(composerStartRestartGroup)) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
            modifier2 = modifier;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new k31(state, modifier2, i, 16));
        }
    }

    public static final void b(String eta, SeatAvailabilityLevel seatAvailabilityLevel, boolean z, boolean z2, Function0 onSeatAvailabilityIconClick, Composer composer, int i) {
        int i2;
        Composer composer2;
        Composer composer3;
        int i3;
        Modifier modifier;
        Intrinsics.i(eta, "eta");
        Intrinsics.i(seatAvailabilityLevel, "seatAvailabilityLevel");
        Intrinsics.i(onSeatAvailabilityIconClick, "onSeatAvailabilityIconClick");
        Composer composerStartRestartGroup = composer.startRestartGroup(591880546);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changed(eta) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changed(seatAvailabilityLevel.ordinal()) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= composerStartRestartGroup.changed(z) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= composerStartRestartGroup.changed(true) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= composerStartRestartGroup.changed(true) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= composerStartRestartGroup.changed(z2) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(onSeatAvailabilityIconClick) ? 1048576 : 524288;
        }
        if (composerStartRestartGroup.shouldExecute((599187 & i2) != 599186, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(591880546, i2, -1, "app.chalo.livetracking.routedetails.ui.routedetailsscreen.compose.BusEtaWithSeatAvailability (SeatAvailability.kt:150)");
            }
            Alignment.Vertical centerVertically = Alignment.INSTANCE.getCenterVertically();
            Modifier.Companion companion = Modifier.INSTANCE;
            MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), centerVertically, composerStartRestartGroup, 48);
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
            pk0.v(companion2, composerM3915constructorimpl, measurePolicyRowMeasurePolicy, composerM3915constructorimpl, currentCompositionLocalMap);
            Updater.m3923setimpl(composerM3915constructorimpl, modifierMaterializeModifier, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion2, composerM3915constructorimpl, Integer.valueOf(i4), composerM3915constructorimpl));
            RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
            if (z2) {
                composerStartRestartGroup.startReplaceGroup(2008860432);
                i3 = 1;
                ImageKt.Image(PainterResourceHelperKt.a(IconType.IC_CHALO_BUS, composerStartRestartGroup, 6), (String) null, ClipKt.clipToBounds(PaddingKt.m788paddingqDBjuR0$default(companion, 0.0f, 0.0f, ChaloTheme.b(composerStartRestartGroup, 0).e, 0.0f, 11, null)), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composerStartRestartGroup, Painter.$stable | 48, 120);
                composer3 = composerStartRestartGroup;
            } else {
                composer3 = composerStartRestartGroup;
                i3 = 1;
                composer3.startReplaceGroup(2002727516);
            }
            composer3.endReplaceGroup();
            composer3.startReplaceGroup(2009181840);
            if (z) {
                composer3.startReplaceGroup(2009230603);
                Composer composer4 = composer3;
                ImageKt.Image(PainterResourceHelperKt.a(IconType.REAL_TIME_INDICATOR_PNG, composer3, 6), (String) null, PaddingKt.m788paddingqDBjuR0$default(companion, 0.0f, 0.0f, 0.0f, ChaloTheme.b(composer3, 0).d, 7, null), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composer4, Painter.$stable | 48, 120);
                composer3 = composer4;
                composer3.endReplaceGroup();
                modifier = companion;
            } else {
                composer3.startReplaceGroup(2009509758);
                modifier = companion;
                GifUIKt.a(PaddingKt.m788paddingqDBjuR0$default(modifier, 0.0f, 0.0f, 0.0f, ChaloTheme.b(composer3, r14).d, 7, null), new GifImageUIState(LottieType.REAL_TIME_INDICATOR_LOTTIE, new ImageUISize(ChaloTheme.b(composer3, r14).g), 2), composer3, r14, r14);
                composer3.endReplaceGroup();
            }
            composer3.endReplaceGroup();
            composer3.startReplaceGroup(2009891399);
            long j = ChaloTheme.a(composer3, r14).O;
            composer3.endReplaceGroup();
            Modifier modifier2 = modifier;
            Modifier modifierA = PlotlineComposeWidgetKt.a(PaddingKt.m788paddingqDBjuR0$default(modifier, ChaloTheme.b(composer3, r14).d, 0.0f, 0.0f, 0.0f, 14, null), "PL_Bus_ETA");
            StringEnum stringEnum = StringEnum.ROUTE_DETAILS_ETA_TEXT;
            Object[] objArr = new Object[i3];
            objArr[r14] = eta;
            Composer composer5 = composer3;
            androidx.compose.material3.TextKt.m2623TextNvy7gAk(StringResourcesHelperKt.c(stringEnum, objArr, composer3, 6), modifierA, j, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ChaloTheme.e(composer3, r14).getHeadlineMedium(), composer5, 0, 0, 131064);
            int i5 = i2;
            composer2 = composer5;
            IconType iconTypeB = ExtensionsKt.b(seatAvailabilityLevel);
            if (iconTypeB == null) {
                composer2.startReplaceGroup(2010428287);
            } else {
                composer2.startReplaceGroup(2010428288);
                c(PlotlineComposeWidgetKt.a(i41.a(rowScopeInstance, PaddingKt.m788paddingqDBjuR0$default(modifier2, ChaloTheme.b(composer2, r14).f, 0.0f, 0.0f, 0.0f, 14, null), 1.0f, false, 2, null), "PL_Passenger_Indicator"), iconTypeB, ExtensionsKt.c(seatAvailabilityLevel), onSeatAvailabilityIconClick, composer2, (i5 >> 9) & 7168);
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
            scopeUpdateScopeEndRestartGroup.updateScope(new cm0(eta, seatAvailabilityLevel, z, z2, onSeatAvailabilityIconClick, i));
        }
    }

    public static final void c(Modifier modifier, IconType iconType, StringEnum stringEnum, Function0 onSeatAvailabilityIconClick, Composer composer, int i) {
        int i2;
        IconType iconType2;
        Composer composer2;
        String strC;
        Intrinsics.i(onSeatAvailabilityIconClick, "onSeatAvailabilityIconClick");
        Composer composerStartRestartGroup = composer.startRestartGroup(568700424);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changed(modifier) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changed(iconType.ordinal()) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= composerStartRestartGroup.changed(stringEnum == null ? -1 : stringEnum.ordinal()) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(onSeatAvailabilityIconClick) ? 2048 : 1024;
        }
        if (composerStartRestartGroup.shouldExecute((i2 & 1171) != 1170, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(568700424, i2, -1, "app.chalo.livetracking.routedetails.ui.routedetailsscreen.compose.SeatAvailabilityIconAndText (SeatAvailability.kt:217)");
            }
            MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), Alignment.INSTANCE.getCenterVertically(), composerStartRestartGroup, 48);
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
            pk0.v(companion, composerM3915constructorimpl, measurePolicyRowMeasurePolicy, composerM3915constructorimpl, currentCompositionLocalMap);
            Updater.m3923setimpl(composerM3915constructorimpl, modifierMaterializeModifier, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion, composerM3915constructorimpl, Integer.valueOf(i3), composerM3915constructorimpl));
            RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
            iconType2 = iconType;
            Painter painterA = PainterResourceHelperKt.a(iconType2, composerStartRestartGroup, (i2 >> 3) & 14);
            Modifier.Companion companion2 = Modifier.INSTANCE;
            Modifier modifierM788paddingqDBjuR0$default = PaddingKt.m788paddingqDBjuR0$default(SizeKt.m828size3ABfNKs(companion2, ChaloTheme.b(composerStartRestartGroup, 0).k), ChaloTheme.b(composerStartRestartGroup, 0).f, 0.0f, ChaloTheme.b(composerStartRestartGroup, 0).c, 0.0f, 10, null);
            boolean z = (i2 & 7168) == 2048;
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (z || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new o01(onSeatAvailabilityIconClick, 17);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            ImageKt.Image(painterA, (String) null, ClickableKt.m299clickableoSLSa3U$default(modifierM788paddingqDBjuR0$default, false, null, null, null, (Function0) objRememberedValue, 15, null), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composerStartRestartGroup, Painter.$stable | 48, 120);
            Modifier modifierM788paddingqDBjuR0$default2 = PaddingKt.m788paddingqDBjuR0$default(companion2, ChaloTheme.b(composerStartRestartGroup, 0).c, 0.0f, 0.0f, 0.0f, 14, null);
            if (stringEnum == null) {
                composerStartRestartGroup.startReplaceGroup(1631582435);
                composerStartRestartGroup.endReplaceGroup();
                strC = null;
            } else {
                composerStartRestartGroup.startReplaceGroup(1631582436);
                strC = StringResourcesHelperKt.c(stringEnum, new Object[0], composerStartRestartGroup, 0);
                composerStartRestartGroup.endReplaceGroup();
            }
            if (strC == null) {
                strC = "";
            }
            composer2 = composerStartRestartGroup;
            androidx.compose.material3.TextKt.m2623TextNvy7gAk(strC, modifierM788paddingqDBjuR0$default2, ChaloTheme.a(composerStartRestartGroup, 0).i, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ChaloTheme.e(composerStartRestartGroup, 0).getBodySmall(), composer2, 0, 0, 131064);
            composer2.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            iconType2 = iconType;
            composer2 = composerStartRestartGroup;
            composer2.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new ey0(i, 8, modifier, iconType2, stringEnum, onSeatAvailabilityIconClick));
        }
    }

    public static final void d(SeatAvailabilityUIState state, Modifier modifier, Composer composer, int i) {
        int i2;
        Intrinsics.i(state, "state");
        SeatAvailabilityUISpec seatAvailabilityUISpec = state.d;
        Composer composerStartRestartGroup = composer.startRestartGroup(1198624332);
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
                ComposerKt.traceEventStart(1198624332, i2, -1, "app.chalo.livetracking.routedetails.ui.routedetailsscreen.compose.SeatAvailabilityIconAndText (SeatAvailability.kt:327)");
            }
            MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), Alignment.INSTANCE.getCenterVertically(), composerStartRestartGroup, 48);
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
            pk0.v(companion, composerM3915constructorimpl, measurePolicyRowMeasurePolicy, composerM3915constructorimpl, currentCompositionLocalMap);
            Updater.m3923setimpl(composerM3915constructorimpl, modifierMaterializeModifier, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion, composerM3915constructorimpl, Integer.valueOf(i3), composerM3915constructorimpl));
            RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
            ImageUIState imageUIState = state.f4947a;
            Modifier.Companion companion2 = Modifier.INSTANCE;
            Modifier modifierC = ChaloThemeKt.c(ImageUIStateKt.b(companion2, seatAvailabilityUISpec.c), seatAvailabilityUISpec.f4946a);
            UiEventHandler$Companion$fromLambda$1 uiEventHandler$Companion$fromLambda$1 = state.c;
            boolean zChangedInstance = composerStartRestartGroup.changedInstance(uiEventHandler$Companion$fromLambda$1);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                SeatAvailabilityKt$SeatAvailabilityIconAndText$3$1$1 seatAvailabilityKt$SeatAvailabilityIconAndText$3$1$1 = new SeatAvailabilityKt$SeatAvailabilityIconAndText$3$1$1(0, uiEventHandler$Companion$fromLambda$1, UiEventHandler.class, "onClick", "onClick()V", 0);
                composerStartRestartGroup.updateRememberedValue(seatAvailabilityKt$SeatAvailabilityIconAndText$3$1$1);
                objRememberedValue = seatAvailabilityKt$SeatAvailabilityIconAndText$3$1$1;
            }
            CommonImageKt.a(imageUIState, ClickableKt.m299clickableoSLSa3U$default(modifierC, false, null, null, null, (Function0) ((KFunction) objRememberedValue), 15, null), false, composerStartRestartGroup, 0, 4);
            TextKt.c(state.b, ChaloThemeKt.c(companion2, seatAvailabilityUISpec.b), null, null, composerStartRestartGroup, 0, 12);
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
            scopeUpdateScopeEndRestartGroup.updateScope(new k31(state, modifier, i, 17));
        }
    }
}
