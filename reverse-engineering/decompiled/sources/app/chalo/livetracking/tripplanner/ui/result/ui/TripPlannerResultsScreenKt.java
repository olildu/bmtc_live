package app.chalo.livetracking.tripplanner.ui.result.ui;

import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.IntrinsicKt;
import androidx.compose.foundation.layout.IntrinsicSize;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.lazy.LazyDslKt;
import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.foundation.lazy.LazyListStateKt;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material3.CardDefaults;
import androidx.compose.material3.CardKt;
import androidx.compose.material3.DividerKt;
import androidx.compose.material3.TextKt;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableIntState;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotIntStateKt;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.ClipKt;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.layout.ContentScale;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.text.style.TextOverflow;
import androidx.compose.ui.unit.Dp;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.profileinstaller.ProfileVerifier;
import app.chalo.ads.UnifiedAdCapability_androidKt;
import app.chalo.ads.UnifiedAdHostsKt;
import app.chalo.ads.UnifiedAdSlotSpec;
import app.chalo.ads.UnifiedAdSlotSpecs;
import app.chalo.citydata.data.model.app.SeatAvailabilityLevel;
import app.chalo.compose.ChaloEtaComponentKt;
import app.chalo.compose.components.ChaloSpacersKt;
import app.chalo.compose.components.ChaloToolBarKt;
import app.chalo.compose.components.PlotlineComposeWidgetKt;
import app.chalo.compose.components.SpecialFeatureTagListComposableKt;
import app.chalo.compose.components.dialogs.ChaloDatePickerKt;
import app.chalo.compose.components.dialogs.ChaloTimePickerKt;
import app.chalo.compose.components.shimmer.ShimmerEffectKt;
import app.chalo.compose.insets.PlatformInsets_androidKt;
import app.chalo.compose.resources.PainterResourceHelperKt;
import app.chalo.compose.resources.StringResourcesHelperKt;
import app.chalo.compose.theme.ChaloTheme;
import app.chalo.compose.theme.ChaloTypographyKt;
import app.chalo.crashlytics.CrashlyticsLogger;
import app.chalo.crashlytics.CrashlyticsLoggerUtils;
import app.chalo.extensions.StringExtsKt;
import app.chalo.livetracking.routedetails.data.model.app.ExtensionsKt;
import app.chalo.livetracking.tripplanner.ui.result.TripPlannerItineraryUiModel;
import app.chalo.livetracking.tripplanner.ui.result.TripPlannerLegUiModel;
import app.chalo.livetracking.tripplanner.ui.result.TripPlannerResultDialogType;
import app.chalo.livetracking.tripplanner.ui.result.TripPlannerResultSectionType;
import app.chalo.livetracking.tripplanner.ui.result.TripPlannerResultsComponent;
import app.chalo.livetracking.tripplanner.ui.result.TripPlannerResultsState;
import app.chalo.livetracking.tripplanner.ui.result.ui.TripPlannerResultsScreenKt;
import app.chalo.providers.RouteNamingSchemeType;
import app.chalo.providers.iconassetprovider.IconType;
import app.chalo.providers.stringprovider.StringEnum;
import app.chalo.recent.model.app.RecentTripAppModel;
import app.chalo.uistate.base.ChaloColorToken_androidKt;
import com.arkivanov.decompose.extensions.compose.SubscribeAsStateKt;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import defpackage.ab;
import defpackage.ag1;
import defpackage.b3;
import defpackage.cg1;
import defpackage.da1;
import defpackage.dj0;
import defpackage.fl1;
import defpackage.gb;
import defpackage.gf;
import defpackage.h01;
import defpackage.hi;
import defpackage.hq0;
import defpackage.i41;
import defpackage.jl1;
import defpackage.kl1;
import defpackage.lm;
import defpackage.ml1;
import defpackage.nb;
import defpackage.nf1;
import defpackage.ol1;
import defpackage.pk0;
import defpackage.pz0;
import defpackage.qb1;
import defpackage.qh;
import defpackage.r1;
import defpackage.rj1;
import defpackage.s01;
import defpackage.t3;
import defpackage.ti1;
import defpackage.u31;
import defpackage.ul1;
import defpackage.vd;
import defpackage.vh;
import defpackage.w8;
import defpackage.wl;
import defpackage.xa1;
import defpackage.xj;
import defpackage.yi1;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.collections.IntIterator;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntProgressionIterator;
import kotlin.ranges.IntRange;
import kotlin.ranges.RangesKt;
import kotlin.reflect.KFunction;
import okhttp3.internal.ws.WebSocketProtocol;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002¨\u0006\u0004²\u0006\f\u0010\u0001\u001a\u00020\u00008\nX\u008a\u0084\u0002²\u0006\u000e\u0010\u0003\u001a\u00020\u00028\n@\nX\u008a\u008e\u0002"}, d2 = {"Lapp/chalo/livetracking/tripplanner/ui/result/TripPlannerResultsState;", RemoteConfigConstants.ResponseFieldKey.STATE, "", "anchoredAdHeightDp", "livetracking_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class TripPlannerResultsScreenKt {

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f4805a;
        public static final /* synthetic */ int[] b;

        static {
            int[] iArr = new int[TripPlannerResultSectionType.values().length];
            try {
                iArr[TripPlannerResultSectionType.LOADING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[TripPlannerResultSectionType.ERROR.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[TripPlannerResultSectionType.RESULT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[TripPlannerResultSectionType.RECENT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f4805a = iArr;
            int[] iArr2 = new int[RouteNamingSchemeType.values().length];
            try {
                iArr2[RouteNamingSchemeType.VIA.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[RouteNamingSchemeType.DEFAULT.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            b = iArr2;
        }
    }

    public static final void a(IconType iconRes, String str, Composer composer, int i) {
        int i2;
        Composer composer2;
        long jM4615unboximpl;
        Intrinsics.i(iconRes, "iconRes");
        Composer composerStartRestartGroup = composer.startRestartGroup(-653351610);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changed(iconRes.ordinal()) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changed(str) ? 32 : 16;
        }
        if (composerStartRestartGroup.shouldExecute((i2 & 19) != 18, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-653351610, i2, -1, "app.chalo.livetracking.tripplanner.ui.result.ui.MetroLegIcon (TripPlannerResultsScreen.kt:1216)");
            }
            Modifier.Companion companion = Modifier.INSTANCE;
            Modifier modifierM828size3ABfNKs = SizeKt.m828size3ABfNKs(companion, ChaloTheme.b(composerStartRestartGroup, 0).C);
            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getCenterHorizontally(), composerStartRestartGroup, 54);
            long currentCompositeKeyHashCode = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
            int i3 = (int) (currentCompositeKeyHashCode ^ (currentCompositeKeyHashCode >>> 32));
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierM828size3ABfNKs);
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
            ImageKt.Image(PainterResourceHelperKt.a(iconRes, composerStartRestartGroup, i2 & 14), (String) null, SizeKt.m828size3ABfNKs(companion, ChaloTheme.b(composerStartRestartGroup, 0).h), (Alignment) null, ContentScale.INSTANCE.getFit(), 0.0f, (ColorFilter) null, composer2, Painter.$stable | 24624, 104);
            Color colorM4595boximpl = null;
            Modifier modifierClip = ClipKt.clip(SizeKt.fillMaxWidth$default(PaddingKt.m786paddingVpY3zN4$default(companion, ChaloTheme.b(composer2, 0).b, 0.0f, 2, null), 0.0f, 1, null), RoundedCornerShapeKt.getCircleShape());
            float f = ChaloTheme.b(composer2, 0).c;
            if (str == null) {
                composer2.startReplaceGroup(592666664);
                composer2.endReplaceGroup();
            } else {
                composer2.startReplaceGroup(592666665);
                long jA = ChaloColorToken_androidKt.a(Color.INSTANCE, str, ChaloTheme.a(composer2, 0).B);
                composer2.endReplaceGroup();
                colorM4595boximpl = Color.m4595boximpl(jA);
            }
            if (colorM4595boximpl == null) {
                composer2.startReplaceGroup(1681689207);
                jM4615unboximpl = ChaloTheme.a(composer2, 0).B;
                composer2.endReplaceGroup();
            } else {
                composer2.startReplaceGroup(1681685921);
                composer2.endReplaceGroup();
                jM4615unboximpl = colorM4595boximpl.m4615unboximpl();
            }
            DividerKt.m1949Divider9IZ8Weo(modifierClip, f, jM4615unboximpl, composer2, 0, 0);
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
            scopeUpdateScopeEndRestartGroup.updateScope(new cg1(iconRes, str, i, 19));
        }
    }

    public static final void b(int i, Composer composer, Modifier modifier, Function0 onExploreAllRoutesClicked) {
        int i2;
        Composer composer2;
        Intrinsics.i(modifier, "modifier");
        Intrinsics.i(onExploreAllRoutesClicked, "onExploreAllRoutesClicked");
        Composer composerStartRestartGroup = composer.startRestartGroup(-1169905418);
        if ((i & 6) == 0) {
            i2 = i | (composerStartRestartGroup.changed(modifier) ? 4 : 2);
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(onExploreAllRoutesClicked) ? 32 : 16;
        }
        int i3 = i2;
        if (composerStartRestartGroup.shouldExecute((i3 & 19) != 18, i3 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1169905418, i3, -1, "app.chalo.livetracking.tripplanner.ui.result.ui.NoChaloBusRouteAvailableComposable (TripPlannerResultsScreen.kt:1411)");
            }
            Modifier modifierM784padding3ABfNKs = PaddingKt.m784padding3ABfNKs(modifier, ChaloTheme.b(composerStartRestartGroup, 0).h);
            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getCenterHorizontally(), composerStartRestartGroup, 48);
            long currentCompositeKeyHashCode = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
            int i4 = (int) (currentCompositeKeyHashCode ^ (currentCompositeKeyHashCode >>> 32));
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierM784padding3ABfNKs);
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
            SpacerKt.Spacer(SizeKt.m814height3ABfNKs(companion2, ChaloTheme.b(composerStartRestartGroup, 0).l), composerStartRestartGroup, 0);
            ImageKt.Image(PainterResourceHelperKt.a(IconType.IC_NO_OD_PAIR, composerStartRestartGroup, 6), "", SizeKt.m828size3ABfNKs(companion2, ChaloTheme.b(composerStartRestartGroup, 0).s), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composerStartRestartGroup, Painter.$stable | 48, 120);
            ChaloSpacersKt.m(composerStartRestartGroup, 0);
            TextKt.m2623TextNvy7gAk(StringResourcesHelperKt.c(StringEnum.NO_CHALO_BUS_ROUTES_AVAILABLE_FOR_THIS_SEARCH, new Object[0], composerStartRestartGroup, 6), null, 0L, null, 0L, null, null, null, 0L, null, TextAlign.m7161boximpl(TextAlign.INSTANCE.m7168getCentere0LSkKk()), 0L, 0, false, 0, 0, null, ChaloTypographyKt.g(ChaloTheme.e(composerStartRestartGroup, 0)), composerStartRestartGroup, 0, 0, 130046);
            ChaloSpacersKt.f(composerStartRestartGroup, 0);
            String strC = StringResourcesHelperKt.c(StringEnum.EXPLORE_ALL_CHALO_BUS_ROUTES, new Object[0], composerStartRestartGroup, 6);
            long j = ChaloTheme.a(composerStartRestartGroup, 0).f1915a;
            TextStyle textStyleH = ChaloTypographyKt.h(ChaloTheme.e(composerStartRestartGroup, 0));
            boolean z = (i3 & 112) == 32;
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (z || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new ag1(onExploreAllRoutesClicked, 12);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            composer2 = composerStartRestartGroup;
            TextKt.m2623TextNvy7gAk(strC, ClickableKt.m299clickableoSLSa3U$default(companion2, false, null, null, null, (Function0) objRememberedValue, 15, null), j, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, textStyleH, composer2, 0, 0, 131064);
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
            scopeUpdateScopeEndRestartGroup.updateScope(new gb(modifier, onExploreAllRoutesClicked, i, 11));
        }
    }

    public static final void c(Modifier modifier, Composer composer, int i) {
        int i2;
        Composer composer2;
        int i3;
        Composer composerStartRestartGroup = composer.startRestartGroup(-87103665);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changed(modifier) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (composerStartRestartGroup.shouldExecute((i2 & 3) != 2, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-87103665, i2, -1, "app.chalo.livetracking.tripplanner.ui.result.ui.NoResultScreen (TripPlannerResultsScreen.kt:705)");
            }
            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getCenterHorizontally(), composerStartRestartGroup, 48);
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
            pk0.v(companion, composerM3915constructorimpl, measurePolicyColumnMeasurePolicy, composerM3915constructorimpl, currentCompositionLocalMap);
            Updater.m3923setimpl(composerM3915constructorimpl, modifierMaterializeModifier, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion, composerM3915constructorimpl, Integer.valueOf(i4), composerM3915constructorimpl));
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
            Modifier.Companion companion2 = Modifier.INSTANCE;
            SpacerKt.Spacer(SizeKt.m814height3ABfNKs(companion2, ChaloTheme.b(composerStartRestartGroup, 0).l), composerStartRestartGroup, 0);
            ImageKt.Image(PainterResourceHelperKt.a(IconType.ALERT_SCHEDULER, composerStartRestartGroup, 6), (String) null, (Modifier) null, (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composerStartRestartGroup, Painter.$stable | 48, 124);
            SpacerKt.Spacer(SizeKt.m814height3ABfNKs(companion2, ChaloTheme.b(composerStartRestartGroup, 0).h), composerStartRestartGroup, 0);
            composer2 = composerStartRestartGroup;
            i3 = 1;
            TextKt.m2623TextNvy7gAk(StringResourcesHelperKt.c(StringEnum.NO_ROUTE_AVAILABLE, new Object[0], composerStartRestartGroup, 6), PaddingKt.m786paddingVpY3zN4$default(SizeKt.fillMaxWidth$default(companion2, 0.0f, 1, null), ChaloTheme.b(composerStartRestartGroup, 0).i, 0.0f, 2, null), ChaloTheme.a(composerStartRestartGroup, 0).e, null, 0L, null, null, null, 0L, null, TextAlign.m7161boximpl(TextAlign.INSTANCE.m7168getCentere0LSkKk()), 0L, 0, false, 0, 0, null, ChaloTypographyKt.b(ChaloTheme.e(composerStartRestartGroup, 0)), composer2, 0, 0, 130040);
            composer2.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer2 = composerStartRestartGroup;
            i3 = 1;
            composer2.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new ul1(modifier, i, i3));
        }
    }

    public static final void d(IconType iconRes, Composer composer, int i) {
        int i2;
        Intrinsics.i(iconRes, "iconRes");
        Composer composerStartRestartGroup = composer.startRestartGroup(2078795324);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changed(iconRes.ordinal()) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (composerStartRestartGroup.shouldExecute((i2 & 3) != 2, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(2078795324, i2, -1, "app.chalo.livetracking.tripplanner.ui.result.ui.SimpleLegIcon (TripPlannerResultsScreen.kt:1203)");
            }
            ImageKt.Image(PainterResourceHelperKt.a(iconRes, composerStartRestartGroup, i2 & 14), (String) null, SizeKt.m828size3ABfNKs(Modifier.INSTANCE, ChaloTheme.b(composerStartRestartGroup, 0).h), (Alignment) null, ContentScale.INSTANCE.getFit(), 0.0f, (ColorFilter) null, composerStartRestartGroup, Painter.$stable | 24624, 104);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new jl1(iconRes, i));
        }
    }

    public static final void e(Modifier modifier, int i, Composer composer, int i2) {
        int i3;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1479433593);
        if ((i2 & 6) == 0) {
            i3 = (composerStartRestartGroup.changed(i) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= composerStartRestartGroup.changed(modifier) ? 32 : 16;
        }
        if (composerStartRestartGroup.shouldExecute((i3 & 19) != 18, i3 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1479433593, i3, -1, "app.chalo.livetracking.tripplanner.ui.result.ui.TripPlannerChangeCountComponent (TripPlannerResultsScreen.kt:883)");
            }
            if (i == 0) {
                composerStartRestartGroup.startReplaceGroup(1148382978);
                DividerKt.m1949Divider9IZ8Weo(SizeKt.fillMaxWidth$default(modifier, 0.0f, 1, null), ChaloTheme.b(composerStartRestartGroup, 0).c, ChaloTheme.a(composerStartRestartGroup, 0).f0, composerStartRestartGroup, 0, 0);
                composerStartRestartGroup.endReplaceGroup();
            } else {
                composerStartRestartGroup.startReplaceGroup(1148624747);
                Modifier modifierM786paddingVpY3zN4$default = PaddingKt.m786paddingVpY3zN4$default(SizeKt.fillMaxWidth$default(modifier, 0.0f, 1, null), ChaloTheme.b(composerStartRestartGroup, 0).c, 0.0f, 2, null);
                Alignment.Companion companion = Alignment.INSTANCE;
                MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(companion.getCenter(), false);
                long currentCompositeKeyHashCode = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
                int i4 = (int) (currentCompositeKeyHashCode ^ (currentCompositeKeyHashCode >>> 32));
                CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierM786paddingVpY3zN4$default);
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
                DividerKt.m1949Divider9IZ8Weo(SizeKt.fillMaxWidth$default(modifier, 0.0f, 1, null), ChaloTheme.b(composerStartRestartGroup, 0).c, ChaloTheme.a(composerStartRestartGroup, 0).f0, composerStartRestartGroup, 0, 0);
                Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null);
                MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getSpaceAround(), companion.getCenterVertically(), composerStartRestartGroup, 54);
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
                composerStartRestartGroup.startReplaceGroup(1999462316);
                Iterator<Integer> it = RangesKt.o(0, i).iterator();
                while (((IntProgressionIterator) it).c) {
                    ((IntIterator) it).nextInt();
                    BoxKt.Box(BackgroundKt.m263backgroundbw27NRU(PaddingKt.m784padding3ABfNKs(BackgroundKt.m263backgroundbw27NRU(SizeKt.m828size3ABfNKs(Modifier.INSTANCE, ChaloTheme.b(composerStartRestartGroup, 0).e), ChaloTheme.a(composerStartRestartGroup, 0).t, RoundedCornerShapeKt.getCircleShape()), ChaloTheme.b(composerStartRestartGroup, 0).b), ChaloTheme.a(composerStartRestartGroup, 0).e, RoundedCornerShapeKt.getCircleShape()), composerStartRestartGroup, 0);
                }
                composerStartRestartGroup.endReplaceGroup();
                composerStartRestartGroup.endNode();
                composerStartRestartGroup.endNode();
                composerStartRestartGroup.endReplaceGroup();
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new t3(modifier, i, i2));
        }
    }

    public static final void f(int i, Modifier modifier, Integer num, Composer composer, int i2) {
        int i3;
        int i4;
        Modifier modifier2;
        String strC;
        Modifier modifierA;
        Composer composerStartRestartGroup = composer.startRestartGroup(1968566119);
        if ((i2 & 6) == 0) {
            i3 = (composerStartRestartGroup.changed(i) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        int i5 = i3 | 48;
        if ((i2 & 384) == 0) {
            i5 |= composerStartRestartGroup.changed(num) ? 256 : 128;
        }
        if (composerStartRestartGroup.shouldExecute((i5 & 147) != 146, i5 & 1)) {
            Modifier.Companion companion = Modifier.INSTANCE;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1968566119, i5, -1, "app.chalo.livetracking.tripplanner.ui.result.ui.TripPlannerChangeIndicator (TripPlannerResultsScreen.kt:842)");
            }
            if (i == 0) {
                composerStartRestartGroup.startReplaceGroup(2006435816);
                strC = StringResourcesHelperKt.c(StringEnum.DIRECT, new Object[0], composerStartRestartGroup, 6);
                composerStartRestartGroup.endReplaceGroup();
            } else if (i != 1) {
                composerStartRestartGroup.startReplaceGroup(2006439015);
                strC = StringResourcesHelperKt.c(StringEnum.X_CHANGES, new Object[]{String.valueOf(i)}, composerStartRestartGroup, 6);
                composerStartRestartGroup.endReplaceGroup();
            } else {
                composerStartRestartGroup.startReplaceGroup(2006437322);
                strC = StringResourcesHelperKt.c(StringEnum.CHANGE_1, new Object[0], composerStartRestartGroup, 6);
                composerStartRestartGroup.endReplaceGroup();
            }
            if (num != null) {
                modifierA = PlotlineComposeWidgetKt.a(IntrinsicKt.width(companion, IntrinsicSize.Max), "PL_Change_Indicator_" + num);
            } else {
                modifierA = PlotlineComposeWidgetKt.a(IntrinsicKt.width(companion, IntrinsicSize.Max), "PL_Change_Indicator");
            }
            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getCenterHorizontally(), composerStartRestartGroup, 48);
            long currentCompositeKeyHashCode = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
            int i6 = (int) (currentCompositeKeyHashCode ^ (currentCompositeKeyHashCode >>> 32));
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierA);
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
            long j = ChaloTheme.a(composerStartRestartGroup, 0).e;
            TextStyle textStyleD = ChaloTypographyKt.d(ChaloTheme.e(composerStartRestartGroup, 0));
            String str = strC;
            modifier2 = companion;
            TextKt.m2623TextNvy7gAk(str, SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), j, null, 0L, null, null, null, 0L, null, TextAlign.m7161boximpl(TextAlign.INSTANCE.m7168getCentere0LSkKk()), 0L, 0, false, 0, 0, null, textStyleD, composerStartRestartGroup, 48, 0, 130040);
            composerStartRestartGroup = composerStartRestartGroup;
            i4 = i;
            e(PaddingKt.m786paddingVpY3zN4$default(SizeKt.fillMaxWidth$default(modifier2, 0.0f, 1, null), ChaloTheme.b(composerStartRestartGroup, 0).c, 0.0f, 2, null), i4, composerStartRestartGroup, i5 & 14);
            composerStartRestartGroup.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            i4 = i;
            composerStartRestartGroup.skipToGroupEnd();
            modifier2 = modifier;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new xa1(i4, modifier2, num, i2));
        }
    }

    public static final void g(int i, Composer composer, Modifier modifier, String str) {
        int i2;
        Composer composer2;
        Composer composerStartRestartGroup = composer.startRestartGroup(20558887);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changed(str) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changed(modifier) ? 32 : 16;
        }
        int i3 = i2;
        if (composerStartRestartGroup.shouldExecute((i3 & 19) != 18, i3 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(20558887, i3, -1, "app.chalo.livetracking.tripplanner.ui.result.ui.TripPlannerErrorScreen (TripPlannerResultsScreen.kt:1379)");
            }
            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getCenterHorizontally(), composerStartRestartGroup, 48);
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
            pk0.v(companion, composerM3915constructorimpl, measurePolicyColumnMeasurePolicy, composerM3915constructorimpl, currentCompositionLocalMap);
            Updater.m3923setimpl(composerM3915constructorimpl, modifierMaterializeModifier, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion, composerM3915constructorimpl, Integer.valueOf(i4), composerM3915constructorimpl));
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
            Modifier.Companion companion2 = Modifier.INSTANCE;
            SpacerKt.Spacer(SizeKt.m814height3ABfNKs(companion2, ChaloTheme.b(composerStartRestartGroup, 0).l), composerStartRestartGroup, 0);
            ImageKt.Image(PainterResourceHelperKt.a(IconType.NO_INTERNET_ERROR, composerStartRestartGroup, 6), (String) null, (Modifier) null, (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composerStartRestartGroup, Painter.$stable | 48, 124);
            SpacerKt.Spacer(SizeKt.m814height3ABfNKs(companion2, ChaloTheme.b(composerStartRestartGroup, 0).h), composerStartRestartGroup, 0);
            composer2 = composerStartRestartGroup;
            TextKt.m2623TextNvy7gAk(str, PaddingKt.m786paddingVpY3zN4$default(SizeKt.fillMaxWidth$default(companion2, 0.0f, 1, null), ChaloTheme.b(composerStartRestartGroup, 0).i, 0.0f, 2, null), ChaloTheme.a(composerStartRestartGroup, 0).e, null, 0L, null, null, null, 0L, null, TextAlign.m7161boximpl(TextAlign.INSTANCE.m7168getCentere0LSkKk()), 0L, 0, false, 0, 0, null, ChaloTypographyKt.b(ChaloTheme.e(composerStartRestartGroup, 0)), composer2, i3 & 14, 0, 130040);
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
            scopeUpdateScopeEndRestartGroup.updateScope(new nb(str, modifier, i, 11));
        }
    }

    public static final void h(TripPlannerItineraryUiModel tripPlannerItineraryUiModel, Function0 function0, Modifier modifier, int i, Composer composer, int i2) {
        int i3;
        Composer composer2;
        Composer composerStartRestartGroup = composer.startRestartGroup(-206833577);
        if ((i2 & 6) == 0) {
            i3 = (composerStartRestartGroup.changedInstance(tripPlannerItineraryUiModel) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(function0) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= composerStartRestartGroup.changed(modifier) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i3 |= composerStartRestartGroup.changed(i) ? 2048 : 1024;
        }
        if (composerStartRestartGroup.shouldExecute((i3 & 1171) != 1170, i3 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-206833577, i3, -1, "app.chalo.livetracking.tripplanner.ui.result.ui.TripPlannerItineraryCard (TripPlannerResultsScreen.kt:738)");
            }
            CardKt.Card(modifier, ChaloTheme.d(composerStartRestartGroup, 0).b, null, CardDefaults.INSTANCE.m1695cardElevationaqJV_2Y(ChaloTheme.c(composerStartRestartGroup, 0).c, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, composerStartRestartGroup, CardDefaults.$stable << 18, 62), null, ComposableLambdaKt.rememberComposableLambda(-1517643831, true, new pz0(function0, tripPlannerItineraryUiModel, i), composerStartRestartGroup, 54), composerStartRestartGroup, ((i3 >> 6) & 14) | ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE, 20);
            composer2 = composerStartRestartGroup;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer2 = composerStartRestartGroup;
            composer2.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new kl1(tripPlannerItineraryUiModel, function0, modifier, i, i2));
        }
    }

    public static final void i(String str, String str2, String str3, SeatAvailabilityLevel seatAvailabilityLevel, StringEnum stringEnum, Modifier modifier, int i, Composer composer, int i2) {
        int i3;
        SeatAvailabilityLevel seatAvailabilityLevel2;
        int i4;
        ComposeUiNode.Companion companion;
        Modifier.Companion companion2;
        int i5;
        Object obj;
        int i6;
        String strC;
        int i7;
        Modifier modifierC;
        ComposeUiNode.Companion companion3;
        String str4;
        String strC2;
        int i8 = i;
        Composer composerStartRestartGroup = composer.startRestartGroup(1777793998);
        if ((i2 & 6) == 0) {
            i3 = (composerStartRestartGroup.changed(str) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= composerStartRestartGroup.changed(str2) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= composerStartRestartGroup.changed(str3) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i3 |= composerStartRestartGroup.changed(seatAvailabilityLevel == null ? -1 : seatAvailabilityLevel.ordinal()) ? 2048 : 1024;
        }
        if ((i2 & 24576) == 0) {
            i3 |= composerStartRestartGroup.changed(stringEnum == null ? -1 : stringEnum.ordinal()) ? 16384 : 8192;
        }
        if ((196608 & i2) == 0) {
            i3 |= composerStartRestartGroup.changed(modifier) ? 131072 : 65536;
        }
        if ((1572864 & i2) == 0) {
            i3 |= composerStartRestartGroup.changed(i8) ? 1048576 : 524288;
        }
        if (composerStartRestartGroup.shouldExecute((599187 & i3) != 599186, i3 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1777793998, i3, -1, "app.chalo.livetracking.tripplanner.ui.result.ui.TripPlannerItineraryCardBottomRow (TripPlannerResultsScreen.kt:1263)");
            }
            Arrangement arrangement = Arrangement.INSTANCE;
            Arrangement.Horizontal end = arrangement.getEnd();
            Alignment.Companion companion4 = Alignment.INSTANCE;
            MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(end, companion4.getTop(), composerStartRestartGroup, 6);
            long currentCompositeKeyHashCode = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
            int i9 = (int) (currentCompositeKeyHashCode ^ (currentCompositeKeyHashCode >>> 32));
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifier);
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
            Updater.m3923setimpl(composerM3915constructorimpl, modifierMaterializeModifier, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion5, composerM3915constructorimpl, Integer.valueOf(i9), composerM3915constructorimpl));
            RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
            if (str == null) {
                composerStartRestartGroup.startReplaceGroup(397844874);
                composerStartRestartGroup.endReplaceGroup();
                i4 = i3;
                i6 = 0;
                companion = companion5;
            } else {
                composerStartRestartGroup.startReplaceGroup(397844875);
                Modifier.Companion companion6 = Modifier.INSTANCE;
                Modifier modifierA = i41.a(rowScopeInstance, companion6, 1.0f, false, 2, null);
                MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(arrangement.getTop(), companion4.getStart(), composerStartRestartGroup, 0);
                long currentCompositeKeyHashCode2 = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
                int i10 = i3;
                int i11 = (int) (currentCompositeKeyHashCode2 ^ (currentCompositeKeyHashCode2 >>> 32));
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
                Updater.m3923setimpl(composerM3915constructorimpl2, modifierMaterializeModifier2, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion5, composerM3915constructorimpl2, Integer.valueOf(i11), composerM3915constructorimpl2));
                ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
                Object objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    composerStartRestartGroup.updateRememberedValue(stringEnum);
                    objRememberedValue = stringEnum;
                }
                StringEnum stringEnum2 = (StringEnum) objRememberedValue;
                if (stringEnum2 == null) {
                    composerStartRestartGroup.startReplaceGroup(821306621);
                    composerStartRestartGroup.endReplaceGroup();
                    companion2 = companion6;
                    i4 = i10;
                    companion = companion5;
                    i5 = 0;
                    obj = null;
                } else {
                    composerStartRestartGroup.startReplaceGroup(821306622);
                    i4 = i10;
                    companion = companion5;
                    companion2 = companion6;
                    i5 = 0;
                    obj = null;
                    TextKt.m2623TextNvy7gAk(StringResourcesHelperKt.c(stringEnum2, new Object[0], composerStartRestartGroup, 6), hq0.c("PL_Bus_From_Heading_", i8, companion6), ChaloTheme.a(composerStartRestartGroup, 0).i, null, 0L, null, null, null, 0L, null, null, 0L, TextOverflow.INSTANCE.m7226getEllipsisgIe3tQ8(), false, 1, 0, null, ChaloTypographyKt.j(ChaloTheme.e(composerStartRestartGroup, 0)), composerStartRestartGroup, 0, 24960, 110584);
                    composerStartRestartGroup = composerStartRestartGroup;
                    gf.r(companion2, ChaloTheme.b(composerStartRestartGroup, 0).b, composerStartRestartGroup, 0);
                }
                Composer composer2 = composerStartRestartGroup;
                TextKt.m2623TextNvy7gAk(str, pk0.d("PL_Bus_From_Value_", i8, SizeKt.fillMaxWidth$default(companion2, 0.0f, 1, obj)), ChaloTheme.a(composerStartRestartGroup, i5).e, null, 0L, null, null, null, 0L, null, null, 0L, TextOverflow.INSTANCE.m7226getEllipsisgIe3tQ8(), false, 2, 0, null, ChaloTypographyKt.h(ChaloTheme.e(composerStartRestartGroup, i5)), composer2, i4 & 14, 24960, 110584);
                composerStartRestartGroup = composer2;
                composerStartRestartGroup.endNode();
                i6 = 0;
                nf1.t(companion2, ChaloTheme.b(composerStartRestartGroup, 0).h, composerStartRestartGroup, 0);
            }
            if (str2 == null && str3 == null) {
                composerStartRestartGroup.startReplaceGroup(350360408);
                composerStartRestartGroup.endReplaceGroup();
                companion3 = companion;
                str4 = null;
            } else {
                composerStartRestartGroup.startReplaceGroup(399124307);
                Modifier.Companion companion7 = Modifier.INSTANCE;
                Modifier modifierA2 = i41.a(rowScopeInstance, companion7, 1.0f, false, 2, null);
                MeasurePolicy measurePolicyColumnMeasurePolicy2 = ColumnKt.columnMeasurePolicy(arrangement.getTop(), companion4.getStart(), composerStartRestartGroup, i6);
                long currentCompositeKeyHashCode3 = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, i6);
                int i12 = (int) (currentCompositeKeyHashCode3 ^ (currentCompositeKeyHashCode3 >>> 32));
                CompositionLocalMap currentCompositionLocalMap3 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier3 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierA2);
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
                ComposeUiNode.Companion companion8 = companion;
                pk0.v(companion8, composerM3915constructorimpl3, measurePolicyColumnMeasurePolicy2, composerM3915constructorimpl3, currentCompositionLocalMap3);
                Updater.m3923setimpl(composerM3915constructorimpl3, modifierMaterializeModifier3, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion8, composerM3915constructorimpl3, Integer.valueOf(i12), composerM3915constructorimpl3));
                ColumnScopeInstance columnScopeInstance2 = ColumnScopeInstance.INSTANCE;
                if (str2 != null) {
                    composerStartRestartGroup.startReplaceGroup(-460068802);
                    strC = StringResourcesHelperKt.c(StringEnum.ARRIVING, new Object[i6], composerStartRestartGroup, 6);
                    composerStartRestartGroup.endReplaceGroup();
                } else {
                    composerStartRestartGroup.startReplaceGroup(-459988419);
                    strC = StringResourcesHelperKt.c(StringEnum.SCHEDULED, new Object[i6], composerStartRestartGroup, 6);
                    composerStartRestartGroup.endReplaceGroup();
                }
                TextStyle textStyleJ = ChaloTypographyKt.j(ChaloTheme.e(composerStartRestartGroup, i6));
                long j = ChaloTheme.a(composerStartRestartGroup, i6).i;
                TextOverflow.Companion companion9 = TextOverflow.INSTANCE;
                int iM7226getEllipsisgIe3tQ8 = companion9.m7226getEllipsisgIe3tQ8();
                if (str2 == null) {
                    i7 = i;
                    modifierC = hq0.c("PL_Scheduled_Heading_", i7, companion7);
                } else {
                    i7 = i;
                    modifierC = hq0.c("PL_Arriving_Heading_", i7, companion7);
                }
                Composer composer3 = composerStartRestartGroup;
                companion3 = companion8;
                TextKt.m2623TextNvy7gAk(strC, modifierC, j, null, 0L, null, null, null, 0L, null, null, 0L, iM7226getEllipsisgIe3tQ8, false, 1, 0, null, textStyleJ, composer3, 0, 24960, 110584);
                composerStartRestartGroup = composer3;
                SpacerKt.Spacer(SizeKt.m814height3ABfNKs(companion7, ChaloTheme.b(composerStartRestartGroup, i6).b), composerStartRestartGroup, i6);
                if (str2 != null) {
                    composerStartRestartGroup.startReplaceGroup(-459281216);
                    ChaloEtaComponentKt.a(str2, pk0.d("PL_Eta_Component_", i7, SizeKt.fillMaxWidth$default(companion7, 0.0f, 1, null)), null, composerStartRestartGroup, (i4 >> 3) & 14, 4);
                    composerStartRestartGroup.endReplaceGroup();
                    str4 = null;
                    companion3 = companion3;
                } else {
                    int i13 = i7;
                    str4 = null;
                    if (str3 != null) {
                        composerStartRestartGroup.startReplaceGroup(-458964861);
                        TextKt.m2623TextNvy7gAk(str3, hq0.c("PL_Scheduled_Value_", i13, companion7), ChaloTheme.a(composerStartRestartGroup, i6).e, null, 0L, null, null, null, 0L, null, null, 0L, companion9.m7226getEllipsisgIe3tQ8(), false, 1, 0, null, ChaloTypographyKt.h(ChaloTheme.e(composerStartRestartGroup, i6)), composerStartRestartGroup, (i4 >> 6) & 14, 24960, 110584);
                        composerStartRestartGroup = composerStartRestartGroup;
                    } else {
                        composerStartRestartGroup.startReplaceGroup(-508916215);
                    }
                    composerStartRestartGroup.endReplaceGroup();
                }
                composerStartRestartGroup.endNode();
                composerStartRestartGroup.endReplaceGroup();
            }
            Modifier.Companion companion10 = Modifier.INSTANCE;
            SpacerKt.Spacer(SizeKt.m833width3ABfNKs(companion10, ChaloTheme.b(composerStartRestartGroup, 0).h), composerStartRestartGroup, 0);
            seatAvailabilityLevel2 = seatAvailabilityLevel;
            if (seatAvailabilityLevel2 == null || seatAvailabilityLevel2 == SeatAvailabilityLevel.UNKNOWN) {
                i8 = i;
                composerStartRestartGroup.startReplaceGroup(350360408);
            } else {
                composerStartRestartGroup.startReplaceGroup(400903118);
                StringBuilder sb = new StringBuilder("PL_Seat_Availability_Level_");
                i8 = i;
                sb.append(i8);
                Modifier modifierA3 = PlotlineComposeWidgetKt.a(companion10, sb.toString());
                MeasurePolicy measurePolicyColumnMeasurePolicy3 = ColumnKt.columnMeasurePolicy(arrangement.getTop(), companion4.getEnd(), composerStartRestartGroup, 48);
                long currentCompositeKeyHashCode4 = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
                int i14 = (int) (currentCompositeKeyHashCode4 ^ (currentCompositeKeyHashCode4 >>> 32));
                CompositionLocalMap currentCompositionLocalMap4 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier4 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierA3);
                Function0<ComposeUiNode> constructor4 = companion3.getConstructor();
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
                ComposeUiNode.Companion companion11 = companion3;
                pk0.v(companion11, composerM3915constructorimpl4, measurePolicyColumnMeasurePolicy3, composerM3915constructorimpl4, currentCompositionLocalMap4);
                Updater.m3923setimpl(composerM3915constructorimpl4, modifierMaterializeModifier4, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion11, composerM3915constructorimpl4, Integer.valueOf(i14), composerM3915constructorimpl4));
                ColumnScopeInstance columnScopeInstance3 = ColumnScopeInstance.INSTANCE;
                StringEnum stringEnumC = ExtensionsKt.c(seatAvailabilityLevel2);
                if (stringEnumC == null) {
                    composerStartRestartGroup.startReplaceGroup(1577821573);
                    composerStartRestartGroup.endReplaceGroup();
                    strC2 = str4;
                } else {
                    composerStartRestartGroup.startReplaceGroup(1577821574);
                    strC2 = StringResourcesHelperKt.c(stringEnumC, new Object[0], composerStartRestartGroup, 0);
                    composerStartRestartGroup.endReplaceGroup();
                }
                if (strC2 == null) {
                    strC2 = "";
                }
                Composer composer4 = composerStartRestartGroup;
                TextKt.m2623TextNvy7gAk(strC2, null, ChaloTheme.a(composerStartRestartGroup, 0).i, null, 0L, null, null, null, 0L, null, TextAlign.m7161boximpl(TextAlign.INSTANCE.m7169getEnde0LSkKk()), 0L, TextOverflow.INSTANCE.m7226getEllipsisgIe3tQ8(), false, 1, 0, null, ChaloTypographyKt.j(ChaloTheme.e(composerStartRestartGroup, 0)), composer4, 0, 24960, 109562);
                composerStartRestartGroup = composer4;
                SpacerKt.Spacer(SizeKt.m814height3ABfNKs(companion10, ChaloTheme.b(composerStartRestartGroup, 0).b), composerStartRestartGroup, 0);
                IconType iconTypeB = ExtensionsKt.b(seatAvailabilityLevel2);
                if (iconTypeB == null) {
                    composerStartRestartGroup.startReplaceGroup(1578272375);
                } else {
                    composerStartRestartGroup.startReplaceGroup(1578272376);
                    ImageKt.Image(PainterResourceHelperKt.a(iconTypeB, composerStartRestartGroup, 0), (String) null, PaddingKt.m788paddingqDBjuR0$default(SizeKt.m828size3ABfNKs(companion10, ChaloTheme.b(composerStartRestartGroup, 0).k), ChaloTheme.b(composerStartRestartGroup, 0).f, 0.0f, 0.0f, 0.0f, 14, null), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composerStartRestartGroup, Painter.$stable | 48, 120);
                }
                composerStartRestartGroup.endReplaceGroup();
                composerStartRestartGroup.endNode();
            }
            composerStartRestartGroup.endReplaceGroup();
            composerStartRestartGroup.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            seatAvailabilityLevel2 = seatAvailabilityLevel;
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new w8(str, str2, str3, seatAvailabilityLevel2, stringEnum, modifier, i8, i2, 8));
        }
    }

    /* JADX WARN: Code duplicated, block: B:44:0x0081  */
    /* JADX WARN: Code duplicated, block: B:45:0x0083  */
    /* JADX WARN: Code duplicated, block: B:48:0x008c  */
    /* JADX WARN: Code duplicated, block: B:50:0x008f  */
    /* JADX WARN: Code duplicated, block: B:51:0x0091  */
    /* JADX WARN: Code duplicated, block: B:54:0x0098  */
    /* JADX WARN: Code duplicated, block: B:58:0x00cd  */
    /* JADX WARN: Code duplicated, block: B:61:0x00d9  */
    /* JADX WARN: Code duplicated, block: B:62:0x00dd  */
    /* JADX WARN: Code duplicated, block: B:65:0x010c  */
    /* JADX WARN: Code duplicated, block: B:67:0x011f  */
    /* JADX WARN: Code duplicated, block: B:70:0x01f0  */
    /* JADX WARN: Code duplicated, block: B:72:0x01f6  */
    /* JADX WARN: Code duplicated, block: B:75:0x0202  */
    /* JADX WARN: Code duplicated, block: B:77:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Instruction removed from duplicated block: B:65:0x010c, please report this as an issue */
    public static final void j(String travelTime, int i, String fare, Modifier modifier, Integer num, Composer composer, int i2, int i3) {
        int i4;
        Integer num2;
        boolean z;
        Composer composer2;
        Integer num3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Integer num4;
        Function0<ComposeUiNode> constructor;
        String str;
        Intrinsics.i(travelTime, "travelTime");
        Intrinsics.i(fare, "fare");
        Composer composerStartRestartGroup = composer.startRestartGroup(1592820716);
        if ((i2 & 6) == 0) {
            i4 = (composerStartRestartGroup.changed(travelTime) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        if ((i2 & 48) == 0) {
            i4 |= composerStartRestartGroup.changed(i) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i4 |= composerStartRestartGroup.changed(fare) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i4 |= composerStartRestartGroup.changed(modifier) ? 2048 : 1024;
        }
        int i5 = i3 & 16;
        if (i5 == 0) {
            if ((i2 & 24576) == 0) {
                num2 = num;
                i4 |= composerStartRestartGroup.changed(num2) ? 16384 : 8192;
            }
            if ((i4 & 9363) != 9362) {
                z = true;
            } else {
                z = false;
            }
            if (composerStartRestartGroup.shouldExecute(z, i4 & 1)) {
                if (i5 != 0) {
                    num4 = null;
                } else {
                    num4 = num2;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1592820716, i4, -1, "app.chalo.livetracking.tripplanner.ui.result.ui.TripPlannerItineraryCardTopRow (TripPlannerResultsScreen.kt:803)");
                }
                MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), Alignment.INSTANCE.getCenterVertically(), composerStartRestartGroup, 48);
                long currentCompositeKeyHashCode = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
                int i6 = (int) ((currentCompositeKeyHashCode >>> 32) ^ currentCompositeKeyHashCode);
                CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifier);
                ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
                constructor = companion.getConstructor();
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
                Updater.m3923setimpl(composerM3915constructorimpl, modifierMaterializeModifier, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion, composerM3915constructorimpl, Integer.valueOf(i6), composerM3915constructorimpl));
                RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
                long j = ChaloTheme.a(composerStartRestartGroup, 0).e;
                TextStyle textStyleF = ChaloTypographyKt.f(ChaloTheme.e(composerStartRestartGroup, 0));
                TextOverflow.Companion companion2 = TextOverflow.INSTANCE;
                int iM7226getEllipsisgIe3tQ8 = companion2.m7226getEllipsisgIe3tQ8();
                Modifier.Companion companion3 = Modifier.INSTANCE;
                if (num4 != null) {
                    str = "PL_Travel_Time_" + num4;
                } else {
                    str = "PL_Travel_Time";
                }
                Modifier modifierA = PlotlineComposeWidgetKt.a(companion3, str);
                composer2 = composerStartRestartGroup;
                int i7 = i4;
                Integer num5 = num4;
                TextKt.m2623TextNvy7gAk(travelTime, modifierA, j, null, 0L, null, null, null, 0L, null, null, 0L, iM7226getEllipsisgIe3tQ8, false, 2, 0, null, textStyleF, composer2, i4 & 14, 24960, 110584);
                Modifier.Companion companion4 = Modifier.INSTANCE;
                SpacerKt.Spacer(SizeKt.m833width3ABfNKs(companion4, ChaloTheme.b(composer2, 0).h), composer2, 0);
                int i8 = i7 >> 6;
                f(i, null, num5, composer2, ((i7 >> 3) & 14) | (i8 & 896));
                SpacerKt.Spacer(SizeKt.m833width3ABfNKs(companion4, ChaloTheme.b(composer2, 0).f), composer2, 0);
                long j2 = ChaloTheme.a(composer2, 0).e;
                TextStyle textStyleF2 = ChaloTypographyKt.f(ChaloTheme.e(composer2, 0));
                TextKt.m2623TextNvy7gAk(fare, PlotlineComposeWidgetKt.a(i41.a(rowScopeInstance, companion4, 1.0f, false, 2, null), "PL_Fare_" + num5), j2, null, 0L, null, null, null, 0L, null, TextAlign.m7161boximpl(TextAlign.INSTANCE.m7169getEnde0LSkKk()), 0L, companion2.m7226getEllipsisgIe3tQ8(), false, 2, 0, null, textStyleF2, composer2, i8 & 14, 24960, 109560);
                composer2.endNode();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                num3 = num5;
            } else {
                composer2 = composerStartRestartGroup;
                composer2.skipToGroupEnd();
                num3 = num2;
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new lm(travelTime, i, fare, modifier, num3, i2, i3));
            }
        }
        i4 |= 24576;
        num2 = num;
        if ((i4 & 9363) != 9362) {
            z = true;
        } else {
            z = false;
        }
        if (composerStartRestartGroup.shouldExecute(z, i4 & 1)) {
            if (i5 != 0) {
                num4 = null;
            } else {
                num4 = num2;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1592820716, i4, -1, "app.chalo.livetracking.tripplanner.ui.result.ui.TripPlannerItineraryCardTopRow (TripPlannerResultsScreen.kt:803)");
            }
            MeasurePolicy measurePolicyRowMeasurePolicy2 = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), Alignment.INSTANCE.getCenterVertically(), composerStartRestartGroup, 48);
            long currentCompositeKeyHashCode2 = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
            int i9 = (int) ((currentCompositeKeyHashCode2 >>> 32) ^ currentCompositeKeyHashCode2);
            CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifier);
            ComposeUiNode.Companion companion5 = ComposeUiNode.INSTANCE;
            constructor = companion5.getConstructor();
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
            pk0.v(companion5, composerM3915constructorimpl2, measurePolicyRowMeasurePolicy2, composerM3915constructorimpl2, currentCompositionLocalMap2);
            Updater.m3923setimpl(composerM3915constructorimpl2, modifierMaterializeModifier2, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion5, composerM3915constructorimpl2, Integer.valueOf(i9), composerM3915constructorimpl2));
            RowScopeInstance rowScopeInstance2 = RowScopeInstance.INSTANCE;
            long j3 = ChaloTheme.a(composerStartRestartGroup, 0).e;
            TextStyle textStyleF3 = ChaloTypographyKt.f(ChaloTheme.e(composerStartRestartGroup, 0));
            TextOverflow.Companion companion6 = TextOverflow.INSTANCE;
            int iM7226getEllipsisgIe3tQ9 = companion6.m7226getEllipsisgIe3tQ8();
            Modifier.Companion companion7 = Modifier.INSTANCE;
            if (num4 != null) {
                str = "PL_Travel_Time_" + num4;
            } else {
                str = "PL_Travel_Time";
            }
            Modifier modifierA2 = PlotlineComposeWidgetKt.a(companion7, str);
            composer2 = composerStartRestartGroup;
            int i10 = i4;
            Integer num6 = num4;
            TextKt.m2623TextNvy7gAk(travelTime, modifierA2, j3, null, 0L, null, null, null, 0L, null, null, 0L, iM7226getEllipsisgIe3tQ9, false, 2, 0, null, textStyleF3, composer2, i4 & 14, 24960, 110584);
            Modifier.Companion companion8 = Modifier.INSTANCE;
            SpacerKt.Spacer(SizeKt.m833width3ABfNKs(companion8, ChaloTheme.b(composer2, 0).h), composer2, 0);
            int i11 = i10 >> 6;
            f(i, null, num6, composer2, ((i10 >> 3) & 14) | (i11 & 896));
            SpacerKt.Spacer(SizeKt.m833width3ABfNKs(companion8, ChaloTheme.b(composer2, 0).f), composer2, 0);
            long j4 = ChaloTheme.a(composer2, 0).e;
            TextStyle textStyleF4 = ChaloTypographyKt.f(ChaloTheme.e(composer2, 0));
            TextKt.m2623TextNvy7gAk(fare, PlotlineComposeWidgetKt.a(i41.a(rowScopeInstance2, companion8, 1.0f, false, 2, null), "PL_Fare_" + num6), j4, null, 0L, null, null, null, 0L, null, TextAlign.m7161boximpl(TextAlign.INSTANCE.m7169getEnde0LSkKk()), 0L, companion6.m7226getEllipsisgIe3tQ8(), false, 2, 0, null, textStyleF4, composer2, i11 & 14, 24960, 109560);
            composer2.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            num3 = num6;
        } else {
            composer2 = composerStartRestartGroup;
            composer2.skipToGroupEnd();
            num3 = num2;
        }
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new lm(travelTime, i, fare, modifier, num3, i2, i3));
        }
    }

    public static final void k(int i, int i2, Composer composer, Modifier modifier, List list) {
        int i3;
        Composer composerStartRestartGroup = composer.startRestartGroup(468024081);
        if ((i2 & 6) == 0) {
            i3 = (composerStartRestartGroup.changedInstance(list) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= composerStartRestartGroup.changed(modifier) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= composerStartRestartGroup.changed(i) ? 256 : 128;
        }
        if (composerStartRestartGroup.shouldExecute((i3 & 147) != 146, i3 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(468024081, i3, -1, "app.chalo.livetracking.tripplanner.ui.result.ui.TripPlannerItineraryLegsRow (TripPlannerResultsScreen.kt:930)");
            }
            Arrangement.HorizontalOrVertical horizontalOrVerticalM672spacedBy0680j_4 = Arrangement.INSTANCE.m672spacedBy0680j_4(ChaloTheme.b(composerStartRestartGroup, 0).g);
            Alignment.Vertical centerVertically = Alignment.INSTANCE.getCenterVertically();
            PaddingValues paddingValuesM779PaddingValuesYgX7TsA$default = PaddingKt.m779PaddingValuesYgX7TsA$default(ChaloTheme.b(composerStartRestartGroup, 0).h, 0.0f, 2, null);
            boolean zChangedInstance = composerStartRestartGroup.changedInstance(list) | ((i3 & 896) == 256);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new dj0(list, i, 2);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            LazyDslKt.LazyRow(modifier, null, paddingValuesM779PaddingValuesYgX7TsA$default, false, horizontalOrVerticalM672spacedBy0680j_4, centerVertically, null, false, null, (Function1) objRememberedValue, composerStartRestartGroup, ((i3 >> 3) & 14) | ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE, 458);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new vh(list, modifier, i, i2, 3));
        }
    }

    public static final void l(final TripPlannerLegUiModel tripPlannerLegUiModel, Modifier modifier, int i, int i2, Composer composer, int i3) {
        int i4;
        Modifier modifier2;
        final IconType iconType;
        Modifier.Companion companion;
        String strC;
        Composer composerStartRestartGroup = composer.startRestartGroup(1967196389);
        if ((i3 & 6) == 0) {
            i4 = (composerStartRestartGroup.changed(tripPlannerLegUiModel) ? 4 : 2) | i3;
        } else {
            i4 = i3;
        }
        int i5 = i4 | 48;
        if ((i3 & 384) == 0) {
            i5 |= composerStartRestartGroup.changed(i) ? 256 : 128;
        }
        if ((i3 & 3072) == 0) {
            i5 |= composerStartRestartGroup.changed(i2) ? 2048 : 1024;
        }
        final int i6 = 0;
        final int i7 = 1;
        if (composerStartRestartGroup.shouldExecute((i5 & 1171) != 1170, i5 & 1)) {
            Modifier.Companion companion2 = Modifier.INSTANCE;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1967196389, i5, -1, "app.chalo.livetracking.tripplanner.ui.result.ui.TripPlannerLegInfoComponent (TripPlannerResultsScreen.kt:980)");
            }
            Intrinsics.i(tripPlannerLegUiModel, "<this>");
            boolean z = tripPlannerLegUiModel instanceof TripPlannerLegUiModel.Auto;
            TripPlannerLegUiModel.Railway railway = TripPlannerLegUiModel.Railway.f4759a;
            TripPlannerLegUiModel.MonoRail monoRail = TripPlannerLegUiModel.MonoRail.f4758a;
            TripPlannerLegUiModel.Ferry ferry = TripPlannerLegUiModel.Ferry.f4756a;
            if (z) {
                iconType = IconType.AUTO_TRIP_PLANNER;
            } else if (tripPlannerLegUiModel instanceof TripPlannerLegUiModel.Bus) {
                iconType = IconType.BUS_TRIP_PLANNER;
            } else if (tripPlannerLegUiModel.equals(ferry)) {
                iconType = IconType.FERRY_TRIP_PLANNER;
            } else if (tripPlannerLegUiModel instanceof TripPlannerLegUiModel.Metro) {
                iconType = IconType.METRO_TRIP_PLANNER;
            } else if (tripPlannerLegUiModel.equals(monoRail)) {
                iconType = IconType.MONORAIL_TRIP_PLANNER;
            } else if (tripPlannerLegUiModel.equals(railway)) {
                iconType = IconType.TRAIN_TRIP_PLANNER;
            } else if (tripPlannerLegUiModel instanceof TripPlannerLegUiModel.Taxi) {
                iconType = IconType.CAB_TRIP_PLANNER;
            } else {
                if (!(tripPlannerLegUiModel instanceof TripPlannerLegUiModel.Walk)) {
                    throw new NoWhenBranchMatchedException();
                }
                iconType = IconType.WALK_TRIP_PLANNER;
            }
            if (tripPlannerLegUiModel.equals(ferry) || tripPlannerLegUiModel.equals(monoRail) || tripPlannerLegUiModel.equals(railway)) {
                composerStartRestartGroup.startReplaceGroup(-80813980);
                final int i8 = 4;
                int i9 = i5 << 6;
                companion = companion2;
                m(ComposableLambdaKt.rememberComposableLambda(1786252021, true, new Function3() { // from class: sl1
                    @Override // kotlin.jvm.functions.Function3
                    public final Object invoke(Object obj, Object obj2, Object obj3) {
                        int i10 = i8;
                        Modifier it = (Modifier) obj;
                        Composer composer2 = (Composer) obj2;
                        int iIntValue = ((Integer) obj3).intValue();
                        switch (i10) {
                            case 0:
                                Intrinsics.i(it, "it");
                                if (composer2.shouldExecute((iIntValue & 17) != 16, iIntValue & 1)) {
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(2046688876, iIntValue, -1, "app.chalo.livetracking.tripplanner.ui.result.ui.TripPlannerLegInfoComponent.<anonymous> (TripPlannerResultsScreen.kt:1000)");
                                    }
                                    TripPlannerResultsScreenKt.d(iconType, composer2, 0);
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                    }
                                } else {
                                    composer2.skipToGroupEnd();
                                }
                                break;
                            case 1:
                                Intrinsics.i(it, "it");
                                if (composer2.shouldExecute((iIntValue & 17) != 16, iIntValue & 1)) {
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(1342825901, iIntValue, -1, "app.chalo.livetracking.tripplanner.ui.result.ui.TripPlannerLegInfoComponent.<anonymous> (TripPlannerResultsScreen.kt:1029)");
                                    }
                                    TripPlannerResultsScreenKt.d(iconType, composer2, 0);
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                    }
                                } else {
                                    composer2.skipToGroupEnd();
                                }
                                break;
                            case 2:
                                Intrinsics.i(it, "it");
                                if (composer2.shouldExecute((iIntValue & 17) != 16, iIntValue & 1)) {
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(638962926, iIntValue, -1, "app.chalo.livetracking.tripplanner.ui.result.ui.TripPlannerLegInfoComponent.<anonymous> (TripPlannerResultsScreen.kt:1058)");
                                    }
                                    TripPlannerResultsScreenKt.d(iconType, composer2, 0);
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                    }
                                } else {
                                    composer2.skipToGroupEnd();
                                }
                                break;
                            case 3:
                                Intrinsics.i(it, "it");
                                if (composer2.shouldExecute((iIntValue & 17) != 16, iIntValue & 1)) {
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(-64900049, iIntValue, -1, "app.chalo.livetracking.tripplanner.ui.result.ui.TripPlannerLegInfoComponent.<anonymous> (TripPlannerResultsScreen.kt:1090)");
                                    }
                                    TripPlannerResultsScreenKt.d(iconType, composer2, 0);
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                    }
                                } else {
                                    composer2.skipToGroupEnd();
                                }
                                break;
                            default:
                                Intrinsics.i(it, "it");
                                if (composer2.shouldExecute((iIntValue & 17) != 16, iIntValue & 1)) {
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(1786252021, iIntValue, -1, "app.chalo.livetracking.tripplanner.ui.result.ui.TripPlannerLegInfoComponent.<anonymous> (TripPlannerResultsScreen.kt:989)");
                                    }
                                    TripPlannerResultsScreenKt.d(iconType, composer2, 0);
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                    }
                                } else {
                                    composer2.skipToGroupEnd();
                                }
                                break;
                        }
                        return Unit.f17538a;
                    }
                }, composerStartRestartGroup, 54), ComposableSingletons$TripPlannerResultsScreenKt.g, ComposableSingletons$TripPlannerResultsScreenKt.h, companion, i, i2, composerStartRestartGroup, (i9 & 7168) | 438 | (i9 & 57344) | (i9 & 458752));
                composerStartRestartGroup.endReplaceGroup();
            } else if (z) {
                composerStartRestartGroup.startReplaceGroup(-80468826);
                int i10 = i5 << 6;
                companion = companion2;
                m(ComposableLambdaKt.rememberComposableLambda(2046688876, true, new Function3() { // from class: sl1
                    @Override // kotlin.jvm.functions.Function3
                    public final Object invoke(Object obj, Object obj2, Object obj3) {
                        int i11 = i6;
                        Modifier it = (Modifier) obj;
                        Composer composer2 = (Composer) obj2;
                        int iIntValue = ((Integer) obj3).intValue();
                        switch (i11) {
                            case 0:
                                Intrinsics.i(it, "it");
                                if (composer2.shouldExecute((iIntValue & 17) != 16, iIntValue & 1)) {
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(2046688876, iIntValue, -1, "app.chalo.livetracking.tripplanner.ui.result.ui.TripPlannerLegInfoComponent.<anonymous> (TripPlannerResultsScreen.kt:1000)");
                                    }
                                    TripPlannerResultsScreenKt.d(iconType, composer2, 0);
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                    }
                                } else {
                                    composer2.skipToGroupEnd();
                                }
                                break;
                            case 1:
                                Intrinsics.i(it, "it");
                                if (composer2.shouldExecute((iIntValue & 17) != 16, iIntValue & 1)) {
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(1342825901, iIntValue, -1, "app.chalo.livetracking.tripplanner.ui.result.ui.TripPlannerLegInfoComponent.<anonymous> (TripPlannerResultsScreen.kt:1029)");
                                    }
                                    TripPlannerResultsScreenKt.d(iconType, composer2, 0);
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                    }
                                } else {
                                    composer2.skipToGroupEnd();
                                }
                                break;
                            case 2:
                                Intrinsics.i(it, "it");
                                if (composer2.shouldExecute((iIntValue & 17) != 16, iIntValue & 1)) {
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(638962926, iIntValue, -1, "app.chalo.livetracking.tripplanner.ui.result.ui.TripPlannerLegInfoComponent.<anonymous> (TripPlannerResultsScreen.kt:1058)");
                                    }
                                    TripPlannerResultsScreenKt.d(iconType, composer2, 0);
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                    }
                                } else {
                                    composer2.skipToGroupEnd();
                                }
                                break;
                            case 3:
                                Intrinsics.i(it, "it");
                                if (composer2.shouldExecute((iIntValue & 17) != 16, iIntValue & 1)) {
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(-64900049, iIntValue, -1, "app.chalo.livetracking.tripplanner.ui.result.ui.TripPlannerLegInfoComponent.<anonymous> (TripPlannerResultsScreen.kt:1090)");
                                    }
                                    TripPlannerResultsScreenKt.d(iconType, composer2, 0);
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                    }
                                } else {
                                    composer2.skipToGroupEnd();
                                }
                                break;
                            default:
                                Intrinsics.i(it, "it");
                                if (composer2.shouldExecute((iIntValue & 17) != 16, iIntValue & 1)) {
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(1786252021, iIntValue, -1, "app.chalo.livetracking.tripplanner.ui.result.ui.TripPlannerLegInfoComponent.<anonymous> (TripPlannerResultsScreen.kt:989)");
                                    }
                                    TripPlannerResultsScreenKt.d(iconType, composer2, 0);
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                    }
                                } else {
                                    composer2.skipToGroupEnd();
                                }
                                break;
                        }
                        return Unit.f17538a;
                    }
                }, composerStartRestartGroup, 54), ComposableSingletons$TripPlannerResultsScreenKt.i, ComposableLambdaKt.rememberComposableLambda(-2002470546, true, new xj(tripPlannerLegUiModel.a(), 8), composerStartRestartGroup, 54), companion, i, i2, composerStartRestartGroup, (i10 & 7168) | 438 | (i10 & 57344) | (i10 & 458752));
                composerStartRestartGroup.endReplaceGroup();
            } else {
                int i11 = 9;
                if (tripPlannerLegUiModel instanceof TripPlannerLegUiModel.Taxi) {
                    composerStartRestartGroup.startReplaceGroup(-79356794);
                    int i12 = i5 << 6;
                    companion = companion2;
                    m(ComposableLambdaKt.rememberComposableLambda(1342825901, true, new Function3() { // from class: sl1
                        @Override // kotlin.jvm.functions.Function3
                        public final Object invoke(Object obj, Object obj2, Object obj3) {
                            int i13 = i7;
                            Modifier it = (Modifier) obj;
                            Composer composer2 = (Composer) obj2;
                            int iIntValue = ((Integer) obj3).intValue();
                            switch (i13) {
                                case 0:
                                    Intrinsics.i(it, "it");
                                    if (composer2.shouldExecute((iIntValue & 17) != 16, iIntValue & 1)) {
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventStart(2046688876, iIntValue, -1, "app.chalo.livetracking.tripplanner.ui.result.ui.TripPlannerLegInfoComponent.<anonymous> (TripPlannerResultsScreen.kt:1000)");
                                        }
                                        TripPlannerResultsScreenKt.d(iconType, composer2, 0);
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventEnd();
                                        }
                                    } else {
                                        composer2.skipToGroupEnd();
                                    }
                                    break;
                                case 1:
                                    Intrinsics.i(it, "it");
                                    if (composer2.shouldExecute((iIntValue & 17) != 16, iIntValue & 1)) {
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventStart(1342825901, iIntValue, -1, "app.chalo.livetracking.tripplanner.ui.result.ui.TripPlannerLegInfoComponent.<anonymous> (TripPlannerResultsScreen.kt:1029)");
                                        }
                                        TripPlannerResultsScreenKt.d(iconType, composer2, 0);
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventEnd();
                                        }
                                    } else {
                                        composer2.skipToGroupEnd();
                                    }
                                    break;
                                case 2:
                                    Intrinsics.i(it, "it");
                                    if (composer2.shouldExecute((iIntValue & 17) != 16, iIntValue & 1)) {
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventStart(638962926, iIntValue, -1, "app.chalo.livetracking.tripplanner.ui.result.ui.TripPlannerLegInfoComponent.<anonymous> (TripPlannerResultsScreen.kt:1058)");
                                        }
                                        TripPlannerResultsScreenKt.d(iconType, composer2, 0);
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventEnd();
                                        }
                                    } else {
                                        composer2.skipToGroupEnd();
                                    }
                                    break;
                                case 3:
                                    Intrinsics.i(it, "it");
                                    if (composer2.shouldExecute((iIntValue & 17) != 16, iIntValue & 1)) {
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventStart(-64900049, iIntValue, -1, "app.chalo.livetracking.tripplanner.ui.result.ui.TripPlannerLegInfoComponent.<anonymous> (TripPlannerResultsScreen.kt:1090)");
                                        }
                                        TripPlannerResultsScreenKt.d(iconType, composer2, 0);
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventEnd();
                                        }
                                    } else {
                                        composer2.skipToGroupEnd();
                                    }
                                    break;
                                default:
                                    Intrinsics.i(it, "it");
                                    if (composer2.shouldExecute((iIntValue & 17) != 16, iIntValue & 1)) {
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventStart(1786252021, iIntValue, -1, "app.chalo.livetracking.tripplanner.ui.result.ui.TripPlannerLegInfoComponent.<anonymous> (TripPlannerResultsScreen.kt:989)");
                                        }
                                        TripPlannerResultsScreenKt.d(iconType, composer2, 0);
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventEnd();
                                        }
                                    } else {
                                        composer2.skipToGroupEnd();
                                    }
                                    break;
                            }
                            return Unit.f17538a;
                        }
                    }, composerStartRestartGroup, 54), ComposableSingletons$TripPlannerResultsScreenKt.j, ComposableLambdaKt.rememberComposableLambda(1588633775, true, new xj(tripPlannerLegUiModel.a(), 9), composerStartRestartGroup, 54), companion, i, i2, composerStartRestartGroup, (i12 & 7168) | 438 | (i12 & 57344) | (i12 & 458752));
                    composerStartRestartGroup.endReplaceGroup();
                } else if (tripPlannerLegUiModel instanceof TripPlannerLegUiModel.Walk) {
                    composerStartRestartGroup.startReplaceGroup(-78244762);
                    final int i13 = 2;
                    int i14 = i5 << 6;
                    companion = companion2;
                    m(ComposableLambdaKt.rememberComposableLambda(638962926, true, new Function3() { // from class: sl1
                        @Override // kotlin.jvm.functions.Function3
                        public final Object invoke(Object obj, Object obj2, Object obj3) {
                            int i15 = i13;
                            Modifier it = (Modifier) obj;
                            Composer composer2 = (Composer) obj2;
                            int iIntValue = ((Integer) obj3).intValue();
                            switch (i15) {
                                case 0:
                                    Intrinsics.i(it, "it");
                                    if (composer2.shouldExecute((iIntValue & 17) != 16, iIntValue & 1)) {
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventStart(2046688876, iIntValue, -1, "app.chalo.livetracking.tripplanner.ui.result.ui.TripPlannerLegInfoComponent.<anonymous> (TripPlannerResultsScreen.kt:1000)");
                                        }
                                        TripPlannerResultsScreenKt.d(iconType, composer2, 0);
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventEnd();
                                        }
                                    } else {
                                        composer2.skipToGroupEnd();
                                    }
                                    break;
                                case 1:
                                    Intrinsics.i(it, "it");
                                    if (composer2.shouldExecute((iIntValue & 17) != 16, iIntValue & 1)) {
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventStart(1342825901, iIntValue, -1, "app.chalo.livetracking.tripplanner.ui.result.ui.TripPlannerLegInfoComponent.<anonymous> (TripPlannerResultsScreen.kt:1029)");
                                        }
                                        TripPlannerResultsScreenKt.d(iconType, composer2, 0);
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventEnd();
                                        }
                                    } else {
                                        composer2.skipToGroupEnd();
                                    }
                                    break;
                                case 2:
                                    Intrinsics.i(it, "it");
                                    if (composer2.shouldExecute((iIntValue & 17) != 16, iIntValue & 1)) {
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventStart(638962926, iIntValue, -1, "app.chalo.livetracking.tripplanner.ui.result.ui.TripPlannerLegInfoComponent.<anonymous> (TripPlannerResultsScreen.kt:1058)");
                                        }
                                        TripPlannerResultsScreenKt.d(iconType, composer2, 0);
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventEnd();
                                        }
                                    } else {
                                        composer2.skipToGroupEnd();
                                    }
                                    break;
                                case 3:
                                    Intrinsics.i(it, "it");
                                    if (composer2.shouldExecute((iIntValue & 17) != 16, iIntValue & 1)) {
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventStart(-64900049, iIntValue, -1, "app.chalo.livetracking.tripplanner.ui.result.ui.TripPlannerLegInfoComponent.<anonymous> (TripPlannerResultsScreen.kt:1090)");
                                        }
                                        TripPlannerResultsScreenKt.d(iconType, composer2, 0);
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventEnd();
                                        }
                                    } else {
                                        composer2.skipToGroupEnd();
                                    }
                                    break;
                                default:
                                    Intrinsics.i(it, "it");
                                    if (composer2.shouldExecute((iIntValue & 17) != 16, iIntValue & 1)) {
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventStart(1786252021, iIntValue, -1, "app.chalo.livetracking.tripplanner.ui.result.ui.TripPlannerLegInfoComponent.<anonymous> (TripPlannerResultsScreen.kt:989)");
                                        }
                                        TripPlannerResultsScreenKt.d(iconType, composer2, 0);
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventEnd();
                                        }
                                    } else {
                                        composer2.skipToGroupEnd();
                                    }
                                    break;
                            }
                            return Unit.f17538a;
                        }
                    }, composerStartRestartGroup, 54), ComposableSingletons$TripPlannerResultsScreenKt.k, ComposableLambdaKt.rememberComposableLambda(884770800, true, new xj(tripPlannerLegUiModel.a(), 10), composerStartRestartGroup, 54), companion, i, i2, composerStartRestartGroup, (i14 & 7168) | 438 | (i14 & 57344) | (i14 & 458752));
                    composerStartRestartGroup.endReplaceGroup();
                } else if (tripPlannerLegUiModel instanceof TripPlannerLegUiModel.Bus) {
                    composerStartRestartGroup.startReplaceGroup(-77116145);
                    TripPlannerLegUiModel.Bus bus = (TripPlannerLegUiModel.Bus) tripPlannerLegUiModel;
                    int i15 = WhenMappings.b[bus.c.ordinal()];
                    if (i15 == 1) {
                        composerStartRestartGroup.startReplaceGroup(690250620);
                        strC = StringResourcesHelperKt.c(StringEnum.X_BUS, new Object[]{bus.f}, composerStartRestartGroup, 6);
                        composerStartRestartGroup.endReplaceGroup();
                    } else {
                        if (i15 != 2) {
                            throw pk0.p(composerStartRestartGroup, 690248434);
                        }
                        composerStartRestartGroup.startReplaceGroup(690254062);
                        composerStartRestartGroup.endReplaceGroup();
                        strC = bus.b;
                    }
                    final int i16 = 3;
                    int i17 = i5 << 6;
                    companion = companion2;
                    m(ComposableLambdaKt.rememberComposableLambda(-64900049, true, new Function3() { // from class: sl1
                        @Override // kotlin.jvm.functions.Function3
                        public final Object invoke(Object obj, Object obj2, Object obj3) {
                            int i18 = i16;
                            Modifier it = (Modifier) obj;
                            Composer composer2 = (Composer) obj2;
                            int iIntValue = ((Integer) obj3).intValue();
                            switch (i18) {
                                case 0:
                                    Intrinsics.i(it, "it");
                                    if (composer2.shouldExecute((iIntValue & 17) != 16, iIntValue & 1)) {
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventStart(2046688876, iIntValue, -1, "app.chalo.livetracking.tripplanner.ui.result.ui.TripPlannerLegInfoComponent.<anonymous> (TripPlannerResultsScreen.kt:1000)");
                                        }
                                        TripPlannerResultsScreenKt.d(iconType, composer2, 0);
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventEnd();
                                        }
                                    } else {
                                        composer2.skipToGroupEnd();
                                    }
                                    break;
                                case 1:
                                    Intrinsics.i(it, "it");
                                    if (composer2.shouldExecute((iIntValue & 17) != 16, iIntValue & 1)) {
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventStart(1342825901, iIntValue, -1, "app.chalo.livetracking.tripplanner.ui.result.ui.TripPlannerLegInfoComponent.<anonymous> (TripPlannerResultsScreen.kt:1029)");
                                        }
                                        TripPlannerResultsScreenKt.d(iconType, composer2, 0);
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventEnd();
                                        }
                                    } else {
                                        composer2.skipToGroupEnd();
                                    }
                                    break;
                                case 2:
                                    Intrinsics.i(it, "it");
                                    if (composer2.shouldExecute((iIntValue & 17) != 16, iIntValue & 1)) {
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventStart(638962926, iIntValue, -1, "app.chalo.livetracking.tripplanner.ui.result.ui.TripPlannerLegInfoComponent.<anonymous> (TripPlannerResultsScreen.kt:1058)");
                                        }
                                        TripPlannerResultsScreenKt.d(iconType, composer2, 0);
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventEnd();
                                        }
                                    } else {
                                        composer2.skipToGroupEnd();
                                    }
                                    break;
                                case 3:
                                    Intrinsics.i(it, "it");
                                    if (composer2.shouldExecute((iIntValue & 17) != 16, iIntValue & 1)) {
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventStart(-64900049, iIntValue, -1, "app.chalo.livetracking.tripplanner.ui.result.ui.TripPlannerLegInfoComponent.<anonymous> (TripPlannerResultsScreen.kt:1090)");
                                        }
                                        TripPlannerResultsScreenKt.d(iconType, composer2, 0);
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventEnd();
                                        }
                                    } else {
                                        composer2.skipToGroupEnd();
                                    }
                                    break;
                                default:
                                    Intrinsics.i(it, "it");
                                    if (composer2.shouldExecute((iIntValue & 17) != 16, iIntValue & 1)) {
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventStart(1786252021, iIntValue, -1, "app.chalo.livetracking.tripplanner.ui.result.ui.TripPlannerLegInfoComponent.<anonymous> (TripPlannerResultsScreen.kt:989)");
                                        }
                                        TripPlannerResultsScreenKt.d(iconType, composer2, 0);
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventEnd();
                                        }
                                    } else {
                                        composer2.skipToGroupEnd();
                                    }
                                    break;
                            }
                            return Unit.f17538a;
                        }
                    }, composerStartRestartGroup, 54), ComposableLambdaKt.rememberComposableLambda(58003888, true, new Function3() { // from class: tl1
                        @Override // kotlin.jvm.functions.Function3
                        public final Object invoke(Object obj, Object obj2, Object obj3) {
                            int i18 = i6;
                            Unit unit = Unit.f17538a;
                            String strC2 = null;
                            TripPlannerLegUiModel tripPlannerLegUiModel2 = tripPlannerLegUiModel;
                            switch (i18) {
                                case 0:
                                    Modifier it = (Modifier) obj;
                                    Composer composer2 = (Composer) obj2;
                                    int iIntValue = ((Integer) obj3).intValue();
                                    Intrinsics.i(it, "it");
                                    if ((iIntValue & 6) == 0) {
                                        iIntValue |= composer2.changed(it) ? 4 : 2;
                                    }
                                    if (!composer2.shouldExecute((iIntValue & 19) != 18, iIntValue & 1)) {
                                        composer2.skipToGroupEnd();
                                    } else {
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventStart(58003888, iIntValue, -1, "app.chalo.livetracking.tripplanner.ui.result.ui.TripPlannerLegInfoComponent.<anonymous> (TripPlannerResultsScreen.kt:1092)");
                                        }
                                        MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), Alignment.INSTANCE.getCenterVertically(), composer2, 48);
                                        long currentCompositeKeyHashCode = ComposablesKt.getCurrentCompositeKeyHashCode(composer2, 0);
                                        int i19 = (int) (currentCompositeKeyHashCode ^ (currentCompositeKeyHashCode >>> 32));
                                        CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
                                        Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composer2, it);
                                        ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
                                        Function0<ComposeUiNode> constructor = companion3.getConstructor();
                                        if (composer2.getApplier() == null) {
                                            ComposablesKt.invalidApplier();
                                        }
                                        composer2.startReusableNode();
                                        if (composer2.getInserting()) {
                                            composer2.createNode(constructor);
                                        } else {
                                            composer2.useNode();
                                        }
                                        Composer composerM3915constructorimpl = Updater.m3915constructorimpl(composer2);
                                        pk0.v(companion3, composerM3915constructorimpl, measurePolicyRowMeasurePolicy, composerM3915constructorimpl, currentCompositionLocalMap);
                                        Updater.m3923setimpl(composerM3915constructorimpl, modifierMaterializeModifier, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion3, composerM3915constructorimpl, Integer.valueOf(i19), composerM3915constructorimpl));
                                        RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
                                        TextKt.m2623TextNvy7gAk(StringResourcesHelperKt.c(StringEnum.TAKE, new Object[0], composer2, 6), null, ChaloTheme.a(composer2, 0).e, null, 0L, null, null, null, 0L, null, null, 0L, TextOverflow.INSTANCE.m7226getEllipsisgIe3tQ8(), false, 1, 0, null, ChaloTypographyKt.d(ChaloTheme.e(composer2, 0)), composer2, 0, 24960, 110586);
                                        SpacerKt.Spacer(SizeKt.m833width3ABfNKs(Modifier.INSTANCE, ChaloTheme.b(composer2, 0).e), composer2, 0);
                                        SpecialFeatureTagListComposableKt.a(0, 2, composer2, null, ((TripPlannerLegUiModel.Bus) tripPlannerLegUiModel2).g);
                                        composer2.endNode();
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventEnd();
                                        }
                                    }
                                    break;
                                default:
                                    Modifier it2 = (Modifier) obj;
                                    Composer composer3 = (Composer) obj2;
                                    int iIntValue2 = ((Integer) obj3).intValue();
                                    Intrinsics.i(it2, "it");
                                    if ((iIntValue2 & 6) == 0) {
                                        iIntValue2 |= composer3.changed(it2) ? 4 : 2;
                                    }
                                    if (!composer3.shouldExecute((iIntValue2 & 19) != 18, iIntValue2 & 1)) {
                                        composer3.skipToGroupEnd();
                                    } else {
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventStart(-522955150, iIntValue2, -1, "app.chalo.livetracking.tripplanner.ui.result.ui.TripPlannerLegInfoComponent.<anonymous> (TripPlannerResultsScreen.kt:1146)");
                                        }
                                        String str = ((TripPlannerLegUiModel.Metro) tripPlannerLegUiModel2).s;
                                        if (str == null) {
                                            composer3.startReplaceGroup(-1510408411);
                                        } else {
                                            composer3.startReplaceGroup(-1510408410);
                                            strC2 = StringResourcesHelperKt.c(StringEnum._METRO_LINE, new Object[]{StringExtsKt.a(str)}, composer3, 6);
                                        }
                                        composer3.endReplaceGroup();
                                        if (strC2 == null) {
                                            strC2 = "";
                                        }
                                        TextKt.m2623TextNvy7gAk(strC2, it2, ChaloTheme.a(composer3, 0).e, null, 0L, null, null, null, 0L, null, null, 0L, TextOverflow.INSTANCE.m7226getEllipsisgIe3tQ8(), false, 1, 0, null, ChaloTypographyKt.d(ChaloTheme.e(composer3, 0)), composer3, (iIntValue2 << 3) & 112, 24960, 110584);
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventEnd();
                                        }
                                    }
                                    break;
                            }
                            return unit;
                        }
                    }, composerStartRestartGroup, 54), ComposableLambdaKt.rememberComposableLambda(180907825, true, new xj(strC, 11), composerStartRestartGroup, 54), companion, i, i2, composerStartRestartGroup, (i17 & 7168) | 438 | (i17 & 57344) | (i17 & 458752));
                    composerStartRestartGroup.endReplaceGroup();
                } else {
                    if (!(tripPlannerLegUiModel instanceof TripPlannerLegUiModel.Metro)) {
                        throw pk0.p(composerStartRestartGroup, 690132160);
                    }
                    composerStartRestartGroup.startReplaceGroup(-75449399);
                    int i18 = i5 << 6;
                    companion = companion2;
                    m(ComposableLambdaKt.rememberComposableLambda(-768763024, true, new qb1(i11, iconType, tripPlannerLegUiModel), composerStartRestartGroup, 54), ComposableSingletons$TripPlannerResultsScreenKt.l, ComposableLambdaKt.rememberComposableLambda(-522955150, true, new Function3() { // from class: tl1
                        @Override // kotlin.jvm.functions.Function3
                        public final Object invoke(Object obj, Object obj2, Object obj3) {
                            int i19 = i7;
                            Unit unit = Unit.f17538a;
                            String strC2 = null;
                            TripPlannerLegUiModel tripPlannerLegUiModel2 = tripPlannerLegUiModel;
                            switch (i19) {
                                case 0:
                                    Modifier it = (Modifier) obj;
                                    Composer composer2 = (Composer) obj2;
                                    int iIntValue = ((Integer) obj3).intValue();
                                    Intrinsics.i(it, "it");
                                    if ((iIntValue & 6) == 0) {
                                        iIntValue |= composer2.changed(it) ? 4 : 2;
                                    }
                                    if (!composer2.shouldExecute((iIntValue & 19) != 18, iIntValue & 1)) {
                                        composer2.skipToGroupEnd();
                                    } else {
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventStart(58003888, iIntValue, -1, "app.chalo.livetracking.tripplanner.ui.result.ui.TripPlannerLegInfoComponent.<anonymous> (TripPlannerResultsScreen.kt:1092)");
                                        }
                                        MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), Alignment.INSTANCE.getCenterVertically(), composer2, 48);
                                        long currentCompositeKeyHashCode = ComposablesKt.getCurrentCompositeKeyHashCode(composer2, 0);
                                        int i110 = (int) (currentCompositeKeyHashCode ^ (currentCompositeKeyHashCode >>> 32));
                                        CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
                                        Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composer2, it);
                                        ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
                                        Function0<ComposeUiNode> constructor = companion3.getConstructor();
                                        if (composer2.getApplier() == null) {
                                            ComposablesKt.invalidApplier();
                                        }
                                        composer2.startReusableNode();
                                        if (composer2.getInserting()) {
                                            composer2.createNode(constructor);
                                        } else {
                                            composer2.useNode();
                                        }
                                        Composer composerM3915constructorimpl = Updater.m3915constructorimpl(composer2);
                                        pk0.v(companion3, composerM3915constructorimpl, measurePolicyRowMeasurePolicy, composerM3915constructorimpl, currentCompositionLocalMap);
                                        Updater.m3923setimpl(composerM3915constructorimpl, modifierMaterializeModifier, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion3, composerM3915constructorimpl, Integer.valueOf(i110), composerM3915constructorimpl));
                                        RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
                                        TextKt.m2623TextNvy7gAk(StringResourcesHelperKt.c(StringEnum.TAKE, new Object[0], composer2, 6), null, ChaloTheme.a(composer2, 0).e, null, 0L, null, null, null, 0L, null, null, 0L, TextOverflow.INSTANCE.m7226getEllipsisgIe3tQ8(), false, 1, 0, null, ChaloTypographyKt.d(ChaloTheme.e(composer2, 0)), composer2, 0, 24960, 110586);
                                        SpacerKt.Spacer(SizeKt.m833width3ABfNKs(Modifier.INSTANCE, ChaloTheme.b(composer2, 0).e), composer2, 0);
                                        SpecialFeatureTagListComposableKt.a(0, 2, composer2, null, ((TripPlannerLegUiModel.Bus) tripPlannerLegUiModel2).g);
                                        composer2.endNode();
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventEnd();
                                        }
                                    }
                                    break;
                                default:
                                    Modifier it2 = (Modifier) obj;
                                    Composer composer3 = (Composer) obj2;
                                    int iIntValue2 = ((Integer) obj3).intValue();
                                    Intrinsics.i(it2, "it");
                                    if ((iIntValue2 & 6) == 0) {
                                        iIntValue2 |= composer3.changed(it2) ? 4 : 2;
                                    }
                                    if (!composer3.shouldExecute((iIntValue2 & 19) != 18, iIntValue2 & 1)) {
                                        composer3.skipToGroupEnd();
                                    } else {
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventStart(-522955150, iIntValue2, -1, "app.chalo.livetracking.tripplanner.ui.result.ui.TripPlannerLegInfoComponent.<anonymous> (TripPlannerResultsScreen.kt:1146)");
                                        }
                                        String str = ((TripPlannerLegUiModel.Metro) tripPlannerLegUiModel2).s;
                                        if (str == null) {
                                            composer3.startReplaceGroup(-1510408411);
                                        } else {
                                            composer3.startReplaceGroup(-1510408410);
                                            strC2 = StringResourcesHelperKt.c(StringEnum._METRO_LINE, new Object[]{StringExtsKt.a(str)}, composer3, 6);
                                        }
                                        composer3.endReplaceGroup();
                                        if (strC2 == null) {
                                            strC2 = "";
                                        }
                                        TextKt.m2623TextNvy7gAk(strC2, it2, ChaloTheme.a(composer3, 0).e, null, 0L, null, null, null, 0L, null, null, 0L, TextOverflow.INSTANCE.m7226getEllipsisgIe3tQ8(), false, 1, 0, null, ChaloTypographyKt.d(ChaloTheme.e(composer3, 0)), composer3, (iIntValue2 << 3) & 112, 24960, 110584);
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventEnd();
                                        }
                                    }
                                    break;
                            }
                            return unit;
                        }
                    }, composerStartRestartGroup, 54), companion, i, i2, composerStartRestartGroup, (i18 & 7168) | 438 | (i18 & 57344) | (i18 & 458752));
                    composerStartRestartGroup.endReplaceGroup();
                }
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            modifier2 = companion;
        } else {
            composerStartRestartGroup.skipToGroupEnd();
            modifier2 = modifier;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new yi1(tripPlannerLegUiModel, modifier2, i, i2, i3));
        }
    }

    public static final void m(Function3 function3, Function3 function4, Function3 function5, Modifier modifier, int i, int i2, Composer composer, int i3) {
        int i4;
        Composer composerStartRestartGroup = composer.startRestartGroup(-870466033);
        if ((i3 & 6) == 0) {
            i4 = (composerStartRestartGroup.changedInstance(function3) ? 4 : 2) | i3;
        } else {
            i4 = i3;
        }
        if ((i3 & 48) == 0) {
            i4 |= composerStartRestartGroup.changedInstance(function4) ? 32 : 16;
        }
        if ((i3 & 384) == 0) {
            i4 |= composerStartRestartGroup.changedInstance(function5) ? 256 : 128;
        }
        if ((i3 & 3072) == 0) {
            i4 |= composerStartRestartGroup.changed(modifier) ? 2048 : 1024;
        }
        if ((i3 & 24576) == 0) {
            i4 |= composerStartRestartGroup.changed(i) ? 16384 : 8192;
        }
        if ((196608 & i3) == 0) {
            i4 |= composerStartRestartGroup.changed(i2) ? 131072 : 65536;
        }
        if (composerStartRestartGroup.shouldExecute((74899 & i4) != 74898, i4 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-870466033, i4, -1, "app.chalo.livetracking.tripplanner.ui.result.ui.TripPlannerLegInfoComponentSlot (TripPlannerResultsScreen.kt:1173)");
            }
            Modifier modifierM785paddingVpY3zN4 = PaddingKt.m785paddingVpY3zN4(BackgroundKt.m263backgroundbw27NRU(PlotlineComposeWidgetKt.a(modifier, "PL_Leg_Info_Card_" + i + "_Index_" + i2), ChaloTheme.a(composerStartRestartGroup, 0).n, RoundedCornerShapeKt.getCircleShape()), ChaloTheme.b(composerStartRestartGroup, 0).h, ChaloTheme.b(composerStartRestartGroup, 0).f);
            Alignment.Companion companion = Alignment.INSTANCE;
            Alignment.Vertical centerVertically = companion.getCenterVertically();
            Arrangement arrangement = Arrangement.INSTANCE;
            MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(arrangement.getStart(), centerVertically, composerStartRestartGroup, 48);
            long currentCompositeKeyHashCode = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
            int i5 = (int) (currentCompositeKeyHashCode ^ (currentCompositeKeyHashCode >>> 32));
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierM785paddingVpY3zN4);
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
            Modifier.Companion companion3 = Modifier.INSTANCE;
            function3.invoke(companion3, composerStartRestartGroup, Integer.valueOf(((i4 << 3) & 112) | 6));
            SpacerKt.Spacer(SizeKt.m833width3ABfNKs(companion3, ChaloTheme.b(composerStartRestartGroup, 0).e), composerStartRestartGroup, 0);
            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(arrangement.getTop(), companion.getStart(), composerStartRestartGroup, 0);
            long currentCompositeKeyHashCode2 = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
            int i6 = (int) (currentCompositeKeyHashCode2 ^ (currentCompositeKeyHashCode2 >>> 32));
            CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, companion3);
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
            Updater.m3923setimpl(composerM3915constructorimpl2, modifierMaterializeModifier2, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion2, composerM3915constructorimpl2, Integer.valueOf(i6), composerM3915constructorimpl2));
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
            function4.invoke(companion3, composerStartRestartGroup, Integer.valueOf((i4 & 112) | 6));
            function5.invoke(SizeKt.m835widthInVpY3zN4$default(companion3, 0.0f, ChaloTheme.b(composerStartRestartGroup, 0).v, 1, null), composerStartRestartGroup, Integer.valueOf((i4 >> 3) & 112));
            composerStartRestartGroup.endNode();
            composerStartRestartGroup.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new lm(function3, function4, function5, modifier, i, i2, i3));
        }
    }

    public static final void n(Modifier modifier, Composer composer, int i) {
        int i2;
        Composer composerStartRestartGroup = composer.startRestartGroup(-869467490);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changed(modifier) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (composerStartRestartGroup.shouldExecute((i2 & 3) != 2, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-869467490, i2, -1, "app.chalo.livetracking.tripplanner.ui.result.ui.TripPlannerLoadingScreen (TripPlannerResultsScreen.kt:428)");
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
            composerStartRestartGroup.startReplaceGroup(329066732);
            Iterator<Integer> it = new IntRange(0, 5, 1).iterator();
            while (((IntProgressionIterator) it).c) {
                ((IntIterator) it).nextInt();
                v(composerStartRestartGroup, 0);
            }
            if (b3.t(composerStartRestartGroup)) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new ul1(modifier, i, 0));
        }
    }

    public static final void o(Composer composer, int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(537862460);
        if (composerStartRestartGroup.shouldExecute(i != 0, i & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(537862460, i, -1, "app.chalo.livetracking.tripplanner.ui.result.ui.TripPlannerPremiumBusBanner (TripPlannerResultsScreen.kt:957)");
            }
            Modifier.Companion companion = Modifier.INSTANCE;
            Modifier modifierM786paddingVpY3zN4$default = PaddingKt.m786paddingVpY3zN4$default(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), ChaloTheme.b(composerStartRestartGroup, 0).h, 0.0f, 2, null);
            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
            long currentCompositeKeyHashCode = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
            int i2 = (int) (currentCompositeKeyHashCode ^ (currentCompositeKeyHashCode >>> 32));
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierM786paddingVpY3zN4$default);
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
            Updater.m3923setimpl(composerM3915constructorimpl, modifierMaterializeModifier, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion2, composerM3915constructorimpl, Integer.valueOf(i2), composerM3915constructorimpl));
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            ImageKt.Image(PainterResourceHelperKt.a(IconType.PB_TP_BANNER, composerStartRestartGroup, 6), (String) null, ClipKt.clip(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), RoundedCornerShapeKt.m1074RoundedCornerShape0680j_4(ChaloTheme.b(composerStartRestartGroup, 0).f)), (Alignment) null, ContentScale.INSTANCE.getFillWidth(), 0.0f, (ColorFilter) null, composerStartRestartGroup, Painter.$stable | 24624, 104);
            composerStartRestartGroup.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new wl(i, 27));
        }
    }

    public static final void p(RecentTripAppModel recentTripAppModel, Function0 function0, Modifier modifier, Composer composer, int i) {
        int i2;
        Function0 function1;
        Composer composerStartRestartGroup = composer.startRestartGroup(875761758);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(recentTripAppModel) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            function1 = function0;
            i2 |= composerStartRestartGroup.changedInstance(function1) ? 32 : 16;
        } else {
            function1 = function0;
        }
        if ((i & 384) == 0) {
            i2 |= composerStartRestartGroup.changed(modifier) ? 256 : 128;
        }
        if (composerStartRestartGroup.shouldExecute((i2 & 147) != 146, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(875761758, i2, -1, "app.chalo.livetracking.tripplanner.ui.result.ui.TripPlannerRecentTripCard (TripPlannerResultsScreen.kt:479)");
            }
            CardKt.Card(ClickableKt.m299clickableoSLSa3U$default(modifier, false, null, null, null, function1, 15, null), RoundedCornerShapeKt.m1074RoundedCornerShape0680j_4(ChaloTheme.b(composerStartRestartGroup, 0).f), null, CardDefaults.INSTANCE.m1695cardElevationaqJV_2Y(ChaloTheme.c(composerStartRestartGroup, 0).b, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, composerStartRestartGroup, CardDefaults.$stable << 18, 62), null, ComposableLambdaKt.rememberComposableLambda(1325386448, true, new ti1(recentTripAppModel, 7), composerStartRestartGroup, 54), composerStartRestartGroup, ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE, 20);
            composerStartRestartGroup = composerStartRestartGroup;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new h01(i, 27, recentTripAppModel, function0, modifier));
        }
    }

    public static final void q(int i, Composer composer, Modifier modifier, List list, Function1 function1) {
        int i2;
        Composer composerStartRestartGroup = composer.startRestartGroup(1373336792);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(list) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(function1) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= composerStartRestartGroup.changed(modifier) ? 256 : 128;
        }
        if (composerStartRestartGroup.shouldExecute((i2 & 147) != 146, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1373336792, i2, -1, "app.chalo.livetracking.tripplanner.ui.result.ui.TripPlannerRecentTripsScreen (TripPlannerResultsScreen.kt:443)");
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
            Modifier.Companion companion2 = Modifier.INSTANCE;
            SpacerKt.Spacer(SizeKt.m814height3ABfNKs(companion2, ChaloTheme.b(composerStartRestartGroup, 0).f), composerStartRestartGroup, 0);
            int i4 = i2;
            TextKt.m2623TextNvy7gAk(StringResourcesHelperKt.c(StringEnum.RECENT_TRIPS, new Object[0], composerStartRestartGroup, 6), SizeKt.fillMaxWidth$default(companion2, 0.0f, 1, null), ChaloTheme.a(composerStartRestartGroup, 0).e, null, 0L, null, null, null, 0L, null, null, 0L, TextOverflow.INSTANCE.m7226getEllipsisgIe3tQ8(), false, 1, 0, null, ChaloTypographyKt.f(ChaloTheme.e(composerStartRestartGroup, 0)), composerStartRestartGroup, 48, 24960, 110584);
            composerStartRestartGroup = composerStartRestartGroup;
            SpacerKt.Spacer(SizeKt.m814height3ABfNKs(companion2, ChaloTheme.b(composerStartRestartGroup, 0).h), composerStartRestartGroup, 0);
            composerStartRestartGroup.startReplaceGroup(1465544334);
            Iterator it = list.iterator();
            while (it.hasNext()) {
                RecentTripAppModel recentTripAppModel = (RecentTripAppModel) it.next();
                boolean zChangedInstance = composerStartRestartGroup.changedInstance(recentTripAppModel) | ((i4 & 112) == 32);
                Object objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = new da1(26, function1, recentTripAppModel);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                Modifier.Companion companion3 = Modifier.INSTANCE;
                p(recentTripAppModel, (Function0) objRememberedValue, SizeKt.fillMaxWidth$default(companion3, 0.0f, 1, null), composerStartRestartGroup, 384);
                SpacerKt.Spacer(SizeKt.m814height3ABfNKs(companion3, ChaloTheme.b(composerStartRestartGroup, 0).g), composerStartRestartGroup, 0);
            }
            composerStartRestartGroup.endReplaceGroup();
            SpacerKt.Spacer(SizeKt.m814height3ABfNKs(Modifier.INSTANCE, ChaloTheme.b(composerStartRestartGroup, 0).h), composerStartRestartGroup, 0);
            composerStartRestartGroup.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new qh(list, function1, modifier, i, 8));
        }
    }

    public static final void r(TripPlannerResultDialogType tripPlannerResultDialogType, Function1 function1, Composer composer, int i) {
        int i2;
        boolean z;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1214269756);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changed(tripPlannerResultDialogType) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(function1) ? 32 : 16;
        }
        if (composerStartRestartGroup.shouldExecute((i2 & 19) != 18, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1214269756, i2, -1, "app.chalo.livetracking.tripplanner.ui.result.ui.TripPlannerResultsDialogHandler (TripPlannerResultsScreen.kt:382)");
            }
            if (tripPlannerResultDialogType instanceof TripPlannerResultDialogType.DateEditOptionDialog) {
                composerStartRestartGroup.startReplaceGroup(-2095494204);
                TripPlannerResultDialogType.DateEditOptionDialog dateEditOptionDialog = (TripPlannerResultDialogType.DateEditOptionDialog) tripPlannerResultDialogType;
                long j = dateEditOptionDialog.f4762a;
                int i3 = i2 & 112;
                boolean z2 = i3 == 32;
                Object objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (z2 || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = new rj1(function1, 11);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                Function0 function0 = (Function0) objRememberedValue;
                boolean z3 = i3 == 32;
                Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                if (z3 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue2 = new s01(function1, 28);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                }
                Function1 function2 = (Function1) objRememberedValue2;
                z = i3 == 32;
                Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                if (z || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue3 = new rj1(function1, 12);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                }
                ChaloDatePickerKt.a(j, function0, function2, (Function0) objRememberedValue3, dateEditOptionDialog.b, composerStartRestartGroup, 0);
                composerStartRestartGroup.endReplaceGroup();
            } else {
                if (!(tripPlannerResultDialogType instanceof TripPlannerResultDialogType.TimeEditOptionDialog)) {
                    throw pk0.p(composerStartRestartGroup, 1317875063);
                }
                composerStartRestartGroup.startReplaceGroup(-2094796611);
                TripPlannerResultDialogType.TimeEditOptionDialog timeEditOptionDialog = (TripPlannerResultDialogType.TimeEditOptionDialog) tripPlannerResultDialogType;
                int i4 = timeEditOptionDialog.f4763a;
                int i5 = timeEditOptionDialog.b;
                int i6 = i2 & 112;
                boolean z4 = i6 == 32;
                Object objRememberedValue4 = composerStartRestartGroup.rememberedValue();
                if (z4 || objRememberedValue4 == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue4 = new rj1(function1, 13);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
                }
                Function0 function3 = (Function0) objRememberedValue4;
                boolean z5 = i6 == 32;
                Object objRememberedValue5 = composerStartRestartGroup.rememberedValue();
                if (z5 || objRememberedValue5 == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue5 = new ab(function1, 10);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue5);
                }
                Function3 function4 = (Function3) objRememberedValue5;
                z = i6 == 32;
                Object objRememberedValue6 = composerStartRestartGroup.rememberedValue();
                if (z || objRememberedValue6 == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue6 = new rj1(function1, 14);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue6);
                }
                ChaloTimePickerKt.a(null, i4, i5, function3, function4, (Function0) objRememberedValue6, composerStartRestartGroup, 0);
                composerStartRestartGroup.endReplaceGroup();
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new cg1(tripPlannerResultDialogType, function1, i, 21));
        }
    }

    public static final void s(TripPlannerResultsState viewState, Function1 sendIntent, float f, Composer composer, int i) {
        int i2;
        Intrinsics.i(viewState, "viewState");
        List list = viewState.j;
        Intrinsics.i(sendIntent, "sendIntent");
        Composer composerStartRestartGroup = composer.startRestartGroup(1071973751);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(viewState) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(sendIntent) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= composerStartRestartGroup.changed(f) ? 256 : 128;
        }
        if (composerStartRestartGroup.shouldExecute((i2 & 147) != 146, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1071973751, i2, -1, "app.chalo.livetracking.tripplanner.ui.result.ui.TripPlannerResultsMainScreen (TripPlannerResultsScreen.kt:217)");
            }
            LazyListState lazyListStateRememberLazyListState = LazyListStateKt.rememberLazyListState(0, 0, composerStartRestartGroup, 0, 3);
            Integer numValueOf = list != null ? Integer.valueOf(list.size()) : null;
            int i3 = i2 & 112;
            boolean zChanged = composerStartRestartGroup.changed(lazyListStateRememberLazyListState) | (i3 == 32);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new TripPlannerResultsScreenKt$TripPlannerResultsMainScreen$1$1(lazyListStateRememberLazyListState, sendIntent, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            EffectsKt.LaunchedEffect(lazyListStateRememberLazyListState, numValueOf, (Function2) objRememberedValue, composerStartRestartGroup, 0);
            Integer numValueOf2 = list != null ? Integer.valueOf(list.size()) : null;
            boolean zChanged2 = composerStartRestartGroup.changed(lazyListStateRememberLazyListState) | composerStartRestartGroup.changedInstance(viewState) | (i3 == 32);
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (zChanged2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue2 = new TripPlannerResultsScreenKt$TripPlannerResultsMainScreen$2$1(lazyListStateRememberLazyListState, viewState, sendIntent, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            EffectsKt.LaunchedEffect(lazyListStateRememberLazyListState, numValueOf2, (Function2) objRememberedValue2, composerStartRestartGroup, 0);
            TripPlannerResultDialogType tripPlannerResultDialogType = viewState.l;
            if (tripPlannerResultDialogType == null) {
                composerStartRestartGroup.startReplaceGroup(2090226667);
            } else {
                composerStartRestartGroup.startReplaceGroup(2090226668);
                r(tripPlannerResultDialogType, sendIntent, composerStartRestartGroup, i3);
            }
            composerStartRestartGroup.endReplaceGroup();
            Modifier modifierFillMaxSize$default = SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null);
            PaddingValues paddingValuesM781PaddingValuesa9UjIt4$default = PaddingKt.m781PaddingValuesa9UjIt4$default(0.0f, 0.0f, 0.0f, f, 7, null);
            boolean zChangedInstance = composerStartRestartGroup.changedInstance(viewState) | (i3 == 32);
            Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue3 = new ol1(1, viewState, sendIntent);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
            }
            LazyDslKt.LazyColumn(modifierFillMaxSize$default, lazyListStateRememberLazyListState, paddingValuesM781PaddingValuesa9UjIt4$default, false, null, null, null, false, null, (Function1) objRememberedValue3, composerStartRestartGroup, 6, TypedValues.PositionType.TYPE_PERCENT_HEIGHT);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new hi(viewState, sendIntent, f, i, 9));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void t(TripPlannerResultsComponent tripPlannerResultsComponent, Composer composer, int i) {
        int i2;
        Composer composerStartRestartGroup = composer.startRestartGroup(1671684695);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(tripPlannerResultsComponent) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (composerStartRestartGroup.shouldExecute((i2 & 3) != 2, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1671684695, i2, -1, "app.chalo.livetracking.tripplanner.ui.result.ui.TripPlannerResultsScreen (TripPlannerResultsScreen.kt:116)");
            }
            TripPlannerResultsState tripPlannerResultsState = (TripPlannerResultsState) SubscribeAsStateKt.a(tripPlannerResultsComponent.t0(), composerStartRestartGroup).getValue();
            boolean zChangedInstance = composerStartRestartGroup.changedInstance(tripPlannerResultsComponent);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new ml1(tripPlannerResultsComponent, 4);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            u(tripPlannerResultsState, (Function1) objRememberedValue, composerStartRestartGroup, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new fl1(tripPlannerResultsComponent, i, 1));
        }
    }

    public static final void u(TripPlannerResultsState tripPlannerResultsState, Function1 function1, Composer composer, int i) {
        int i2;
        Composer composer2;
        Object obj = tripPlannerResultsState;
        Function1 function2 = function1;
        Composer composerStartRestartGroup = composer.startRestartGroup(1044326763);
        if ((i & 6) == 0) {
            i2 = i | (composerStartRestartGroup.changedInstance(obj) ? 4 : 2);
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(function2) ? 32 : 16;
        }
        int i3 = i2;
        if (composerStartRestartGroup.shouldExecute((i3 & 19) != 18, i3 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1044326763, i3, -1, "app.chalo.livetracking.tripplanner.ui.result.ui.TripPlannerResultsScreenContent (TripPlannerResultsScreen.kt:129)");
            }
            UnifiedAdSlotSpec unifiedAdSlotSpec = UnifiedAdSlotSpecs.e;
            Set set = UnifiedAdCapability_androidKt.f828a;
            Intrinsics.i(unifiedAdSlotSpec, "<this>");
            boolean zChanged = composerStartRestartGroup.changed(true);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = SnapshotIntStateKt.mutableIntStateOf(0);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            MutableIntState mutableIntState = (MutableIntState) objRememberedValue;
            composerStartRestartGroup.startReplaceGroup(-1204074895);
            float fA = PlatformInsets_androidKt.a(6, composerStartRestartGroup, 0);
            composerStartRestartGroup.endReplaceGroup();
            float fM7278constructorimpl = Dp.m7278constructorimpl(1);
            boolean zChanged2 = composerStartRestartGroup.changed(mutableIntState.getIntValue()) | composerStartRestartGroup.changed(true) | composerStartRestartGroup.changed(fA);
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (zChanged2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                int intValue = mutableIntState.getIntValue();
                if (intValue < 0) {
                    intValue = 0;
                }
                float fM7278constructorimpl2 = Dp.m7278constructorimpl(intValue);
                float f = 0;
                objRememberedValue2 = new TripPlannerResultsAnchoredAdLayoutState(Dp.m7277compareTo0680j_4(fM7278constructorimpl2, Dp.m7278constructorimpl(f)) > 0 ? Dp.m7278constructorimpl(Dp.m7278constructorimpl(fM7278constructorimpl2 + fM7278constructorimpl) + fA) : Dp.m7278constructorimpl(f), true);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            TripPlannerResultsAnchoredAdLayoutState tripPlannerResultsAnchoredAdLayoutState = (TripPlannerResultsAnchoredAdLayoutState) objRememberedValue2;
            Modifier.Companion companion = Modifier.INSTANCE;
            Modifier modifierFillMaxSize$default = SizeKt.fillMaxSize$default(companion, 0.0f, 1, null);
            Arrangement arrangement = Arrangement.INSTANCE;
            Arrangement.Vertical top = arrangement.getTop();
            Alignment.Companion companion2 = Alignment.INSTANCE;
            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(top, companion2.getStart(), composerStartRestartGroup, 0);
            long currentCompositeKeyHashCode = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
            int i4 = (int) (currentCompositeKeyHashCode ^ (currentCompositeKeyHashCode >>> 32));
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
            Updater.m3923setimpl(composerM3915constructorimpl, modifierMaterializeModifier, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion3, composerM3915constructorimpl, Integer.valueOf(i4), composerM3915constructorimpl));
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
            ComposableLambda composableLambda = ComposableSingletons$TripPlannerResultsScreenKt.f4795a;
            float f2 = ChaloTheme.b(composerStartRestartGroup, 0).f1916a;
            boolean z = (i3 & 112) == 32;
            Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
            if (z || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue3 = new rj1(function2, 7);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
            }
            Function0 function0 = (Function0) objRememberedValue3;
            composer2 = composerStartRestartGroup;
            ChaloToolBarKt.a(composableLambda, null, f2, 0L, null, function0, composer2, 6, 26);
            Modifier modifierFillMaxSize$default2 = SizeKt.fillMaxSize$default(companion, 0.0f, 1, null);
            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(companion2.getBottomCenter(), false);
            long currentCompositeKeyHashCode2 = ComposablesKt.getCurrentCompositeKeyHashCode(composer2, 0);
            int i5 = (int) (currentCompositeKeyHashCode2 ^ (currentCompositeKeyHashCode2 >>> 32));
            CompositionLocalMap currentCompositionLocalMap2 = composer2.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(composer2, modifierFillMaxSize$default2);
            Function0<ComposeUiNode> constructor2 = companion3.getConstructor();
            if (composer2.getApplier() == null) {
                ComposablesKt.invalidApplier();
            }
            composer2.startReusableNode();
            if (composer2.getInserting()) {
                composer2.createNode(constructor2);
            } else {
                composer2.useNode();
            }
            Composer composerM3915constructorimpl2 = Updater.m3915constructorimpl(composer2);
            pk0.v(companion3, composerM3915constructorimpl2, measurePolicyMaybeCachedBoxMeasurePolicy, composerM3915constructorimpl2, currentCompositionLocalMap2);
            Updater.m3923setimpl(composerM3915constructorimpl2, modifierMaterializeModifier2, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion3, composerM3915constructorimpl2, Integer.valueOf(i5), composerM3915constructorimpl2));
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            BoxKt.Box(BackgroundKt.m263backgroundbw27NRU(SizeKt.fillMaxHeight(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), 0.8f), ChaloTheme.a(composer2, 0).n, RoundedCornerShapeKt.m1076RoundedCornerShapea9UjIt4$default(ChaloTheme.b(composer2, 0).g, ChaloTheme.b(composer2, 0).g, 0.0f, 0.0f, 12, null)), composer2, 0);
            s(tripPlannerResultsState, function1, tripPlannerResultsAnchoredAdLayoutState.b, composer2, i3 & WebSocketProtocol.PAYLOAD_SHORT);
            if (tripPlannerResultsAnchoredAdLayoutState.f4796a) {
                composer2.startReplaceGroup(-322020244);
                Modifier modifierM264backgroundbw27NRU$default = BackgroundKt.m264backgroundbw27NRU$default(boxScopeInstance.align(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), companion2.getBottomCenter()), ChaloTheme.a(composer2, 0).t, null, 2, null);
                MeasurePolicy measurePolicyColumnMeasurePolicy2 = ColumnKt.columnMeasurePolicy(arrangement.getTop(), companion2.getStart(), composer2, 0);
                long currentCompositeKeyHashCode3 = ComposablesKt.getCurrentCompositeKeyHashCode(composer2, 0);
                int i6 = (int) (currentCompositeKeyHashCode3 ^ (currentCompositeKeyHashCode3 >>> 32));
                CompositionLocalMap currentCompositionLocalMap3 = composer2.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier3 = ComposedModifierKt.materializeModifier(composer2, modifierM264backgroundbw27NRU$default);
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
                Updater.m3923setimpl(composerM3915constructorimpl3, modifierMaterializeModifier3, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion3, composerM3915constructorimpl3, Integer.valueOf(i6), composerM3915constructorimpl3));
                Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null);
                boolean zChanged3 = composer2.changed(mutableIntState);
                Object objRememberedValue4 = composer2.rememberedValue();
                if (zChanged3 || objRememberedValue4 == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue4 = new u31(mutableIntState, 1);
                    composer2.updateRememberedValue(objRememberedValue4);
                }
                Function2 function3 = (Function2) objRememberedValue4;
                boolean zChanged4 = composer2.changed(mutableIntState);
                Object objRememberedValue5 = composer2.rememberedValue();
                if (zChanged4 || objRememberedValue5 == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue5 = new vd(mutableIntState, 10);
                    composer2.updateRememberedValue(objRememberedValue5);
                }
                Function1 function4 = (Function1) objRememberedValue5;
                CrashlyticsLogger crashlyticsLoggerA = CrashlyticsLoggerUtils.a();
                boolean zChangedInstance = composer2.changedInstance(crashlyticsLoggerA);
                Object objRememberedValue6 = composer2.rememberedValue();
                if (zChangedInstance || objRememberedValue6 == Composer.INSTANCE.getEmpty()) {
                    TripPlannerResultsScreenKt$TripPlannerResultsScreenContent$1$2$1$3$1 tripPlannerResultsScreenKt$TripPlannerResultsScreenContent$1$2$1$3$1 = new TripPlannerResultsScreenKt$TripPlannerResultsScreenContent$1$2$1$3$1(1, crashlyticsLoggerA, CrashlyticsLogger.class, "addLog", "addLog(Lapp/chalo/crashlytics/CrashlyticsLog;)V", 0);
                    composer2.updateRememberedValue(tripPlannerResultsScreenKt$TripPlannerResultsScreenContent$1$2$1$3$1);
                    objRememberedValue6 = tripPlannerResultsScreenKt$TripPlannerResultsScreenContent$1$2$1$3$1;
                }
                Function1 function5 = (Function1) ((KFunction) objRememberedValue6);
                obj = tripPlannerResultsState;
                function2 = function1;
                UnifiedAdHostsKt.a(unifiedAdSlotSpec, modifierFillMaxWidth$default, true, 0L, 0.0f, function3, function4, function5, composer2, 432, 408);
                composer2 = composer2;
                composer2.endNode();
            } else {
                obj = tripPlannerResultsState;
                function2 = function1;
                composer2.startReplaceGroup(-330358469);
            }
            composer2.endReplaceGroup();
            if (r1.k(composer2)) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer2 = composerStartRestartGroup;
            composer2.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new cg1(obj, function2, i, 20));
        }
    }

    public static final void v(Composer composer, int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(375578782);
        if (composerStartRestartGroup.shouldExecute(i != 0, i & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(375578782, i, -1, "app.chalo.livetracking.tripplanner.ui.result.ui.TripPlannerShimmerCard (TripPlannerResultsScreen.kt:689)");
            }
            Modifier.Companion companion = Modifier.INSTANCE;
            BoxKt.Box(ShimmerEffectKt.b(SizeKt.m814height3ABfNKs(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), ChaloTheme.b(composerStartRestartGroup, 0).v), Color.m4595boximpl(ChaloTheme.a(composerStartRestartGroup, 0).p), Color.m4595boximpl(ChaloTheme.a(composerStartRestartGroup, 0).q), 4), composerStartRestartGroup, 0);
            if (gf.x(companion, ChaloTheme.b(composerStartRestartGroup, 0).h, composerStartRestartGroup, 0)) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new wl(i, 28));
        }
    }
}
