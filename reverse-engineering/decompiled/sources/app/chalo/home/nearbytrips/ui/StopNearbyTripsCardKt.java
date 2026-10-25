package app.chalo.home.nearbytrips.ui;

import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.IndicationNodeFactory;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material3.CardColors;
import androidx.compose.material3.CardDefaults;
import androidx.compose.material3.CardElevation;
import androidx.compose.material3.CardKt;
import androidx.compose.material3.TextKt;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.layout.ContentScale;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.text.style.TextOverflow;
import androidx.profileinstaller.ProfileVerifier;
import app.chalo.compose.components.ChaloSpacersKt;
import app.chalo.compose.components.RippleEffectKt;
import app.chalo.compose.resources.PainterResourceHelperKt;
import app.chalo.compose.resources.StringResourcesHelperKt;
import app.chalo.compose.theme.ChaloTheme;
import app.chalo.compose.theme.ChaloTypographyKt;
import app.chalo.home.nearbytrips.data.model.NearbyStopAndTripsUiModel;
import app.chalo.providers.iconassetprovider.IconType;
import app.chalo.providers.stringprovider.StringEnum;
import app.chalo.stoptripdetails.data.model.StopTripDetailsUiModel;
import app.chalo.stoptripdetails.ui.StopTripDetailsScreenKt;
import defpackage.b3;
import defpackage.e21;
import defpackage.hf;
import defpackage.i41;
import defpackage.ls;
import defpackage.nb;
import defpackage.ni;
import defpackage.pk0;
import defpackage.q11;
import defpackage.qh;
import defpackage.r11;
import defpackage.sb1;
import defpackage.zc;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.internal.ws.WebSocketProtocol;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002¨\u0006\u0005²\u0006\f\u0010\u0001\u001a\u00020\u00008\nX\u008a\u0084\u0002²\u0006\u0012\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\nX\u008a\u0084\u0002"}, d2 = {"", "shouldShowMoreBusesOption", "", "Lapp/chalo/stoptripdetails/data/model/StopTripDetailsUiModel;", "listOfItemsToShow", "home_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class StopNearbyTripsCardKt {
    public static final void a(int i, Composer composer, Modifier modifier, List list, Function1 function1) {
        Function1 function2;
        Composer composerStartRestartGroup = composer.startRestartGroup(1741882122);
        int i2 = (i & 6) == 0 ? (composerStartRestartGroup.changedInstance(list) ? 4 : 2) | i : i;
        if ((i & 48) == 0) {
            function2 = function1;
            i2 |= composerStartRestartGroup.changedInstance(function2) ? 32 : 16;
        } else {
            function2 = function1;
        }
        if ((i & 384) == 0) {
            i2 |= composerStartRestartGroup.changed(modifier) ? 256 : 128;
        }
        if (composerStartRestartGroup.shouldExecute((i2 & 147) != 146, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1741882122, i2, -1, "app.chalo.home.nearbytrips.ui.NearbyTripsCardListColumn (StopNearbyTripsCard.kt:162)");
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
            composerStartRestartGroup.startReplaceGroup(-160798009);
            int i4 = 0;
            for (Object obj : list) {
                int i5 = i4 + 1;
                if (i4 < 0) {
                    CollectionsKt.z0();
                    throw null;
                }
                StopTripDetailsScreenKt.p((StopTripDetailsUiModel) obj, function2, SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), i4 != CollectionsKt.K(list), ChaloTheme.b(composerStartRestartGroup, 0).h, composerStartRestartGroup, (i2 & 112) | 384, 0);
                function2 = function1;
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
            scopeUpdateScopeEndRestartGroup.updateScope(new qh(list, function1, modifier, i, 7));
        }
    }

    public static final void b(int i, Composer composer, Modifier modifier, String str) {
        int i2;
        Composer composer2;
        Modifier modifier2;
        Composer composerStartRestartGroup = composer.startRestartGroup(600365902);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changed(str) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        int i3 = i2 | 48;
        if (composerStartRestartGroup.shouldExecute((i3 & 19) != 18, i3 & 1)) {
            Modifier.Companion companion = Modifier.INSTANCE;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(600365902, i3, -1, "app.chalo.home.nearbytrips.ui.NearbyTripsDistanceComponent (StopNearbyTripsCard.kt:262)");
            }
            MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), Alignment.INSTANCE.getCenterVertically(), composerStartRestartGroup, 48);
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
            ImageKt.Image(PainterResourceHelperKt.a(IconType.WALK_NEARBYCARD_BLACK, composerStartRestartGroup, 6), (String) null, (Modifier) null, (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composerStartRestartGroup, Painter.$stable | 48, 124);
            ChaloSpacersKt.A(composerStartRestartGroup, 0);
            composer2 = composerStartRestartGroup;
            TextKt.m2623TextNvy7gAk(str, null, ChaloTheme.a(composerStartRestartGroup, 0).i, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ChaloTypographyKt.c(ChaloTheme.e(composerStartRestartGroup, 0)), composer2, i3 & 14, 0, 131066);
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
            scopeUpdateScopeEndRestartGroup.updateScope(new nb(str, modifier2, i, 9));
        }
    }

    public static final void c(int i, Composer composer, Modifier modifier, String str, String str2) {
        String str3;
        int i2;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1391302668);
        if ((i & 6) == 0) {
            str3 = str;
            i2 = (composerStartRestartGroup.changed(str3) ? 4 : 2) | i;
        } else {
            str3 = str;
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changed(str2) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= composerStartRestartGroup.changed(modifier) ? 256 : 128;
        }
        int i3 = i2;
        if (composerStartRestartGroup.shouldExecute((i3 & 147) != 146, i3 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1391302668, i3, -1, "app.chalo.home.nearbytrips.ui.NearbyTripsStopAndDistanceComponent (StopNearbyTripsCard.kt:215)");
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
            ImageKt.Image(PainterResourceHelperKt.a(IconType.BUS_NEARBY_SELECTED, composerStartRestartGroup, 6), (String) null, (Modifier) null, (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composerStartRestartGroup, Painter.$stable | 48, 124);
            ChaloSpacersKt.y(composerStartRestartGroup, 0);
            TextKt.m2623TextNvy7gAk(str3, i41.a(rowScopeInstance, Modifier.INSTANCE, 1.0f, false, 2, null), ChaloTheme.a(composerStartRestartGroup, 0).g, null, 0L, null, null, null, 0L, null, null, 0L, TextOverflow.INSTANCE.m7226getEllipsisgIe3tQ8(), false, 1, 0, null, ChaloTypographyKt.f(ChaloTheme.e(composerStartRestartGroup, 0)), composerStartRestartGroup, i3 & 14, 24960, 110584);
            composerStartRestartGroup = composerStartRestartGroup;
            ChaloSpacersKt.w(composerStartRestartGroup, 0);
            b((i3 >> 3) & 14, composerStartRestartGroup, null, str2);
            composerStartRestartGroup.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new hf(str, str2, modifier, i, 6));
        }
    }

    public static final void d(int i, Composer composer, Modifier modifier, String str, String str2) {
        int i2;
        Composer composer2;
        Composer composerStartRestartGroup = composer.startRestartGroup(-246795682);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changed(str) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changed(str2) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= composerStartRestartGroup.changed(modifier) ? 256 : 128;
        }
        if (composerStartRestartGroup.shouldExecute((i2 & 147) != 146, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-246795682, i2, -1, "app.chalo.home.nearbytrips.ui.NearbyTripsStopDetailsComponent (StopNearbyTripsCard.kt:183)");
            }
            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composerStartRestartGroup, 0);
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
            pk0.v(companion, composerM3915constructorimpl, measurePolicyColumnMeasurePolicy, composerM3915constructorimpl, currentCompositionLocalMap);
            Updater.m3923setimpl(composerM3915constructorimpl, modifierMaterializeModifier, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion, composerM3915constructorimpl, Integer.valueOf(i3), composerM3915constructorimpl));
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
            Modifier.Companion companion2 = Modifier.INSTANCE;
            c(i2 & WebSocketProtocol.PAYLOAD_SHORT, composerStartRestartGroup, PaddingKt.m786paddingVpY3zN4$default(SizeKt.fillMaxWidth$default(companion2, 0.0f, 1, null), 0.0f, ChaloTheme.b(composerStartRestartGroup, 0).h, 1, null), str, str2);
            composer2 = composerStartRestartGroup;
            TextKt.m2623TextNvy7gAk(StringResourcesHelperKt.c(StringEnum.NEXT_BUSES, new Object[0], composerStartRestartGroup, 6), PaddingKt.m785paddingVpY3zN4(BackgroundKt.m264backgroundbw27NRU$default(companion2, ChaloTheme.a(composerStartRestartGroup, 0).n, null, 2, null), ChaloTheme.b(composerStartRestartGroup, 0).f, ChaloTheme.b(composerStartRestartGroup, 0).c), ChaloTheme.a(composerStartRestartGroup, 0).i, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ChaloTypographyKt.h(ChaloTheme.e(composerStartRestartGroup, 0)), composer2, 0, 0, 131064);
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
            scopeUpdateScopeEndRestartGroup.updateScope(new hf(str, str2, modifier, i, 5));
        }
    }

    public static final void e(Modifier modifier, Composer composer, int i) {
        int i2;
        Composer composer2;
        Composer composerStartRestartGroup = composer.startRestartGroup(-344546005);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changed(modifier) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (composerStartRestartGroup.shouldExecute((i2 & 3) != 2, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-344546005, i2, -1, "app.chalo.home.nearbytrips.ui.SeeAllBusesComponent (StopNearbyTripsCard.kt:246)");
            }
            composer2 = composerStartRestartGroup;
            TextKt.m2623TextNvy7gAk(StringResourcesHelperKt.c(StringEnum.SEE_ALL_BUSES, new Object[0], composerStartRestartGroup, 6), PaddingKt.m786paddingVpY3zN4$default(SizeKt.fillMaxWidth$default(modifier, 0.0f, 1, null), 0.0f, ChaloTheme.b(composerStartRestartGroup, 0).f, 1, null), ChaloTheme.a(composerStartRestartGroup, 0).B, null, 0L, null, null, null, 0L, null, TextAlign.m7161boximpl(TextAlign.INSTANCE.m7168getCentere0LSkKk()), 0L, 0, false, 0, 0, null, ChaloTypographyKt.h(ChaloTheme.e(composerStartRestartGroup, 0)), composer2, 0, 0, 130040);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer2 = composerStartRestartGroup;
            composer2.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new zc(modifier, i, 25));
        }
    }

    public static final void f(NearbyStopAndTripsUiModel data, Function1 onStopClick, Function1 onSeeAllClick, Function2 onSummaryClick, Modifier modifier, Function3 function3, Composer composer, int i) {
        int i2;
        Intrinsics.i(data, "data");
        Intrinsics.i(onStopClick, "onStopClick");
        Intrinsics.i(onSeeAllClick, "onSeeAllClick");
        Intrinsics.i(onSummaryClick, "onSummaryClick");
        Composer composerStartRestartGroup = composer.startRestartGroup(1075412040);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changed(data) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(onStopClick) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(onSeeAllClick) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(onSummaryClick) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= composerStartRestartGroup.changed(modifier) ? 16384 : 8192;
        }
        if ((i & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(function3) ? 131072 : 65536;
        }
        if (composerStartRestartGroup.shouldExecute((74899 & i2) != 74898, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1075412040, i2, -1, "app.chalo.home.nearbytrips.ui.StopNearbyTripsCard (StopNearbyTripsCard.kt:48)");
            }
            Shape shape = ChaloTheme.d(composerStartRestartGroup, 0).c;
            CardDefaults cardDefaults = CardDefaults.INSTANCE;
            long j = ChaloTheme.a(composerStartRestartGroup, 0).t;
            int i3 = CardDefaults.$stable;
            CardColors cardColorsM1694cardColorsro_MJ88 = cardDefaults.m1694cardColorsro_MJ88(j, 0L, 0L, 0L, composerStartRestartGroup, i3 << 12, 14);
            CardElevation cardElevationM1695cardElevationaqJV_2Y = cardDefaults.m1695cardElevationaqJV_2Y(ChaloTheme.c(composerStartRestartGroup, 0).c, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, composerStartRestartGroup, i3 << 18, 62);
            composerStartRestartGroup = composerStartRestartGroup;
            CardKt.Card(modifier, shape, cardColorsM1694cardColorsro_MJ88, cardElevationM1695cardElevationaqJV_2Y, null, ComposableLambdaKt.rememberComposableLambda(550190650, true, new ni(data, onStopClick, onSeeAllClick, onSummaryClick, function3, 5), composerStartRestartGroup, 54), composerStartRestartGroup, ((i2 >> 12) & 14) | ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE, 16);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new sb1(data, onStopClick, onSeeAllClick, onSummaryClick, modifier, function3, i, 1));
        }
    }

    public static final void g(NearbyStopAndTripsUiModel nearbyStopAndTripsUiModel, Function0 function0, Function1 function1, Modifier modifier, Composer composer, int i) {
        int i2;
        Composer composerStartRestartGroup = composer.startRestartGroup(471663192);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changed(nearbyStopAndTripsUiModel) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(function0) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(function1) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= composerStartRestartGroup.changed(modifier) ? 2048 : 1024;
        }
        if (composerStartRestartGroup.shouldExecute((i2 & 1171) != 1170, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(471663192, i2, -1, "app.chalo.home.nearbytrips.ui.StopNearbyTripsCardComponent (StopNearbyTripsCard.kt:130)");
            }
            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composerStartRestartGroup, 0);
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
            pk0.v(companion, composerM3915constructorimpl, measurePolicyColumnMeasurePolicy, composerM3915constructorimpl, currentCompositionLocalMap);
            Updater.m3923setimpl(composerM3915constructorimpl, modifierMaterializeModifier, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion, composerM3915constructorimpl, Integer.valueOf(i3), composerM3915constructorimpl));
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
            String str = nearbyStopAndTripsUiModel.c;
            String str2 = nearbyStopAndTripsUiModel.g;
            Modifier.Companion companion2 = Modifier.INSTANCE;
            d(0, composerStartRestartGroup, PaddingKt.m786paddingVpY3zN4$default(ClickableKt.m299clickableoSLSa3U$default(SizeKt.fillMaxWidth$default(companion2, 0.0f, 1, null), false, null, null, null, function0, 15, null), ChaloTheme.b(composerStartRestartGroup, 0).h, 0.0f, 2, null), str, str2);
            boolean zChanged = composerStartRestartGroup.changed(nearbyStopAndTripsUiModel.h);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = SnapshotStateKt.derivedStateOf(new q11(nearbyStopAndTripsUiModel, 2));
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            a(((i2 >> 3) & 112) | 384, composerStartRestartGroup, SizeKt.fillMaxWidth$default(companion2, 0.0f, 1, null), (List) ((State) objRememberedValue).getValue(), function1);
            composerStartRestartGroup.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new e21(nearbyStopAndTripsUiModel, function0, function1, modifier, i, 1));
        }
    }

    public static final void h(NearbyStopAndTripsUiModel nearbyStopAndTripsUiModel, Function1 function1, Function1 function2, Function2 function3, Modifier modifier, Function3 function4, Composer composer, int i) {
        int i2;
        Composer composerStartRestartGroup = composer.startRestartGroup(1265523107);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changed(nearbyStopAndTripsUiModel) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(function1) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(function2) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(function3) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= composerStartRestartGroup.changed(modifier) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(function4) ? 131072 : 65536;
        }
        int i3 = i2;
        if (composerStartRestartGroup.shouldExecute((74899 & i3) != 74898, i3 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1265523107, i3, -1, "app.chalo.home.nearbytrips.ui.StopNearbyTripsCardContent (StopNearbyTripsCard.kt:76)");
            }
            int i4 = i3 >> 12;
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
            int i6 = i3 & 14;
            boolean z = i6 == 4;
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (z || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = SnapshotStateKt.derivedStateOf(new q11(nearbyStopAndTripsUiModel, 3));
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            State state = (State) objRememberedValue;
            boolean z2 = ((i3 & 112) == 32) | (i6 == 4);
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (z2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue2 = new r11(function1, nearbyStopAndTripsUiModel, 3);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            Function0 function0 = (Function0) objRememberedValue2;
            boolean z3 = (i3 & 7168) == 2048;
            Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
            if (z3 || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue3 = new ls(6, function3);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
            }
            Function1 function5 = (Function1) objRememberedValue3;
            Modifier.Companion companion2 = Modifier.INSTANCE;
            g(nearbyStopAndTripsUiModel, function0, function5, SizeKt.fillMaxWidth$default(companion2, 0.0f, 1, null), composerStartRestartGroup, i6 | 3072);
            if (((Boolean) state.getValue()).booleanValue()) {
                composerStartRestartGroup.startReplaceGroup(1926059347);
                ChaloSpacersKt.r(BackgroundKt.m264backgroundbw27NRU$default(SizeKt.fillMaxWidth$default(companion2, 0.0f, 1, null), ChaloTheme.a(composerStartRestartGroup, 0).Y, null, 2, null), composerStartRestartGroup, 0);
                if (function4 != null) {
                    composerStartRestartGroup.startReplaceGroup(1926279478);
                    MutableInteractionSource mutableInteractionSourceB = RippleEffectKt.b(composerStartRestartGroup);
                    IndicationNodeFactory indicationNodeFactoryA = RippleEffectKt.a(composerStartRestartGroup);
                    boolean z4 = ((i3 & 896) == 256) | (i6 == 4);
                    Object objRememberedValue4 = composerStartRestartGroup.rememberedValue();
                    if (z4 || objRememberedValue4 == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue4 = new r11(function2, nearbyStopAndTripsUiModel, 4);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
                    }
                    function4.invoke(ClickableKt.m295clickableO2vRcR0$default(companion2, mutableInteractionSourceB, indicationNodeFactoryA, false, null, null, (Function0) objRememberedValue4, 28, null), composerStartRestartGroup, Integer.valueOf(i4 & 112));
                    composerStartRestartGroup.endReplaceGroup();
                } else {
                    composerStartRestartGroup.startReplaceGroup(1926665428);
                    MutableInteractionSource mutableInteractionSourceB2 = RippleEffectKt.b(composerStartRestartGroup);
                    IndicationNodeFactory indicationNodeFactoryA2 = RippleEffectKt.a(composerStartRestartGroup);
                    boolean z5 = ((i3 & 896) == 256) | (i6 == 4);
                    Object objRememberedValue5 = composerStartRestartGroup.rememberedValue();
                    if (z5 || objRememberedValue5 == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue5 = new r11(function2, nearbyStopAndTripsUiModel, 5);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue5);
                    }
                    e(ClickableKt.m295clickableO2vRcR0$default(companion2, mutableInteractionSourceB2, indicationNodeFactoryA2, false, null, null, (Function0) objRememberedValue5, 28, null), composerStartRestartGroup, 0);
                    composerStartRestartGroup.endReplaceGroup();
                }
            } else {
                composerStartRestartGroup.startReplaceGroup(1922221237);
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
            scopeUpdateScopeEndRestartGroup.updateScope(new sb1(nearbyStopAndTripsUiModel, function1, function2, function3, modifier, function4, i, 0));
        }
    }
}
