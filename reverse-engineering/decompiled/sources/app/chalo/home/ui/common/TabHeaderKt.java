package app.chalo.home.ui.common;

import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.BorderKt;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.ImageKt;
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
import androidx.compose.foundation.shape.GenericShape;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
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
import androidx.compose.ui.draw.ClipKt;
import androidx.compose.ui.draw.ShadowKt;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.layout.ContentScale;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.TextUnitKt;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.core.view.accessibility.AccessibilityEventCompat;
import androidx.profileinstaller.ProfileVerifier;
import app.chalo.compose.ChaloLocationHeaderItemKt;
import app.chalo.compose.components.ChaloSearchBarKt;
import app.chalo.compose.components.ChaloSpacersKt;
import app.chalo.compose.components.ComposeUtils_androidKt;
import app.chalo.compose.components.PlotlineComposeWidgetKt;
import app.chalo.compose.components.buttons.ChaloFilledButtonKt;
import app.chalo.compose.resources.PainterResourceHelperKt;
import app.chalo.compose.resources.StringResourcesHelperKt;
import app.chalo.compose.theme.ChaloTheme;
import app.chalo.compose.theme.ChaloTypographyKt;
import app.chalo.home.ui.profile.ProfileDrawerCardAvatarKt;
import app.chalo.home.ui.profile.ProfileDrawerCardData;
import app.chalo.home.ui.regularbus.RegularBusPageDisplayItemData;
import app.chalo.home.ui.regularbus.compose.PayForTicketComposableKt;
import app.chalo.homescreen.data.model.app.HeaderItemType;
import app.chalo.homescreen.data.model.app.ImageResourceSectionAppModel;
import app.chalo.homescreen.data.model.app.SearchCardAppModel;
import app.chalo.homescreen.data.model.app.TabMetaDataAppModel;
import app.chalo.providers.iconassetprovider.IconType;
import app.chalo.providers.stringprovider.StringEnum;
import app.chalo.userprofile.Gender;
import app.chalo.userprofile.GenderKt;
import defpackage.ag1;
import defpackage.c0;
import defpackage.cg1;
import defpackage.i81;
import defpackage.kb;
import defpackage.ma;
import defpackage.od;
import defpackage.pg1;
import defpackage.pk0;
import defpackage.r1;
import defpackage.t20;
import defpackage.t51;
import defpackage.u10;
import defpackage.wb;
import java.util.Collection;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.EmptyList;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.text.StringsKt;
import okhttp3.internal.ws.WebSocketProtocol;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"home_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class TabHeaderKt {
    public static final void a(Function0 function0, Composer composer, int i) {
        int i2;
        Composer composer2;
        Composer composerStartRestartGroup = composer.startRestartGroup(467649354);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(function0) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (composerStartRestartGroup.shouldExecute((i2 & 3) != 2, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(467649354, i2, -1, "app.chalo.home.ui.common.HeaderSosButton (TabHeader.kt:390)");
            }
            Modifier.Companion companion = Modifier.INSTANCE;
            Modifier modifierM784padding3ABfNKs = PaddingKt.m784padding3ABfNKs(ClickableKt.m299clickableoSLSa3U$default(BorderKt.m275borderxT4_qwU(ClipKt.clip(BackgroundKt.m263backgroundbw27NRU(PlotlineComposeWidgetKt.a(companion, "PL_SOS_Button"), ChaloTheme.a(composerStartRestartGroup, 0).t, ChaloTheme.d(composerStartRestartGroup, 0).b), ChaloTheme.d(composerStartRestartGroup, 0).b), ChaloTheme.b(composerStartRestartGroup, 0).b, ChaloTheme.a(composerStartRestartGroup, 0).S, ChaloTheme.d(composerStartRestartGroup, 0).b), false, null, null, null, function0, 15, null), ChaloTheme.b(composerStartRestartGroup, 0).f);
            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getCenter(), false);
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
            pk0.v(companion2, composerM3915constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy, composerM3915constructorimpl, currentCompositionLocalMap);
            Updater.m3923setimpl(composerM3915constructorimpl, modifierMaterializeModifier, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion2, composerM3915constructorimpl, Integer.valueOf(i3), composerM3915constructorimpl));
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            composer2 = composerStartRestartGroup;
            TextKt.m2623TextNvy7gAk(StringResourcesHelperKt.c(StringEnum.SOS, new Object[0], composerStartRestartGroup, 6), companion, ChaloTheme.a(composerStartRestartGroup, 0).X, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ChaloTheme.e(composerStartRestartGroup, 0).getTitleLarge(), composer2, 48, 0, 131064);
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
            scopeUpdateScopeEndRestartGroup.updateScope(new kb(i, 15, function0));
        }
    }

    public static final void b(String str, IconType iconType, Function0 function0, boolean z, Function0 function1, Composer composer, int i) {
        String str2;
        int i2;
        Composer composerStartRestartGroup = composer.startRestartGroup(1954572988);
        if ((i & 6) == 0) {
            str2 = str;
            i2 = (composerStartRestartGroup.changed(str2) ? 4 : 2) | i;
        } else {
            str2 = str;
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changed(iconType == null ? -1 : iconType.ordinal()) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(function0) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= composerStartRestartGroup.changed(z) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(function1) ? 16384 : 8192;
        }
        if (composerStartRestartGroup.shouldExecute((i2 & 9363) != 9362, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1954572988, i2, -1, "app.chalo.home.ui.common.HeadingAndIconTemplate (TabHeader.kt:343)");
            }
            Modifier.Companion companion = Modifier.INSTANCE;
            Modifier modifierM786paddingVpY3zN4$default = PaddingKt.m786paddingVpY3zN4$default(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), ChaloTheme.b(composerStartRestartGroup, 0).h, 0.0f, 2, null);
            Alignment.Companion companion2 = Alignment.INSTANCE;
            Alignment.Vertical top = companion2.getTop();
            Arrangement arrangement = Arrangement.INSTANCE;
            MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(arrangement.getSpaceBetween(), top, composerStartRestartGroup, 54);
            long currentCompositeKeyHashCode = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
            int i3 = (int) (currentCompositeKeyHashCode ^ (currentCompositeKeyHashCode >>> 32));
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierM786paddingVpY3zN4$default);
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
            pk0.v(companion3, composerM3915constructorimpl, measurePolicyRowMeasurePolicy, composerM3915constructorimpl, currentCompositionLocalMap);
            Updater.m3923setimpl(composerM3915constructorimpl, modifierMaterializeModifier, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion3, composerM3915constructorimpl, Integer.valueOf(i3), composerM3915constructorimpl));
            RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
            Modifier modifierAlign = rowScopeInstance.align(SizeKt.m835widthInVpY3zN4$default(companion, 0.0f, ChaloTheme.b(composerStartRestartGroup, 0).I, 1, null), companion2.getCenterVertically());
            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(companion2.getTopStart(), false);
            long currentCompositeKeyHashCode2 = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
            int i4 = (int) (currentCompositeKeyHashCode2 ^ (currentCompositeKeyHashCode2 >>> 32));
            CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierAlign);
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
            Updater.m3923setimpl(composerM3915constructorimpl2, modifierMaterializeModifier2, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion3, composerM3915constructorimpl2, Integer.valueOf(i4), composerM3915constructorimpl2));
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            int i5 = i2;
            TextKt.m2623TextNvy7gAk(str2, null, 0L, null, TextUnitKt.getSp(24), null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ChaloTypographyKt.a(ChaloTheme.e(composerStartRestartGroup, 0).getDisplayMedium()), composerStartRestartGroup, (i2 & 14) | 24576, 0, 131054);
            composerStartRestartGroup = composerStartRestartGroup;
            composerStartRestartGroup.endNode();
            MeasurePolicy measurePolicyRowMeasurePolicy2 = RowKt.rowMeasurePolicy(arrangement.getStart(), companion2.getCenterVertically(), composerStartRestartGroup, 48);
            long currentCompositeKeyHashCode3 = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
            int i6 = (int) (currentCompositeKeyHashCode3 ^ (currentCompositeKeyHashCode3 >>> 32));
            CompositionLocalMap currentCompositionLocalMap3 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier3 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, companion);
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
            pk0.v(companion3, composerM3915constructorimpl3, measurePolicyRowMeasurePolicy2, composerM3915constructorimpl3, currentCompositionLocalMap3);
            Updater.m3923setimpl(composerM3915constructorimpl3, modifierMaterializeModifier3, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion3, composerM3915constructorimpl3, Integer.valueOf(i6), composerM3915constructorimpl3));
            if (iconType == null) {
                composerStartRestartGroup.startReplaceGroup(1251157040);
            } else {
                composerStartRestartGroup.startReplaceGroup(1251157041);
                ImageKt.Image(PainterResourceHelperKt.a(iconType, composerStartRestartGroup, 0), (String) null, ClickableKt.m299clickableoSLSa3U$default(ClipKt.clip(PlotlineComposeWidgetKt.a(companion, "PL_Page_Help_Icon"), RoundedCornerShapeKt.m1074RoundedCornerShape0680j_4(Dp.m7278constructorimpl(50))), false, null, null, null, function0, 15, null), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composerStartRestartGroup, Painter.$stable | 48, 120);
            }
            composerStartRestartGroup.endReplaceGroup();
            if (z) {
                composerStartRestartGroup.startReplaceGroup(1251615779);
                SpacerKt.Spacer(rowScopeInstance.weight(companion, 1.0f, true), composerStartRestartGroup, 0);
                a(function1, composerStartRestartGroup, (i5 >> 12) & 14);
            } else {
                composerStartRestartGroup.startReplaceGroup(1236679886);
            }
            composerStartRestartGroup.endReplaceGroup();
            if (r1.k(composerStartRestartGroup)) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new ma(str, iconType, function0, z, function1, i, 8));
        }
    }

    public static final void c(Function0 function0, Function0 function1, Composer composer, int i) {
        int i2;
        int i3;
        Composer composerStartRestartGroup = composer.startRestartGroup(-810566730);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(function0) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(function1) ? 32 : 16;
        }
        if (composerStartRestartGroup.shouldExecute((i2 & 19) != 18, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-810566730, i2, -1, "app.chalo.home.ui.common.LocationDisclaimerCard (TabHeader.kt:272)");
            }
            Density density = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
            float f = ChaloTheme.b(composerStartRestartGroup, 0).g;
            float fM7278constructorimpl = Dp.m7278constructorimpl(ChaloTheme.b(composerStartRestartGroup, 0).h + ChaloTheme.b(composerStartRestartGroup, 0).d);
            float fM7278constructorimpl2 = Dp.m7278constructorimpl(ComposeUtils_androidKt.c(composerStartRestartGroup) * 0.83f);
            float fM7278constructorimpl3 = Dp.m7278constructorimpl(ChaloTheme.b(composerStartRestartGroup, 0).f + ChaloTheme.b(composerStartRestartGroup, 0).c);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            Composer.Companion companion = Composer.INSTANCE;
            if (objRememberedValue == companion.getEmpty()) {
                Intrinsics.i(density, "density");
                Ref.FloatRef floatRef = new Ref.FloatRef();
                Ref.FloatRef floatRef2 = new Ref.FloatRef();
                i3 = 32;
                Ref.FloatRef floatRef3 = new Ref.FloatRef();
                Ref.FloatRef floatRef4 = new Ref.FloatRef();
                floatRef.element = density.mo404toPx0680j_4(fM7278constructorimpl3);
                floatRef2.element = density.mo404toPx0680j_4(fM7278constructorimpl);
                floatRef3.element = density.mo404toPx0680j_4(f);
                floatRef4.element = density.mo404toPx0680j_4(fM7278constructorimpl2);
                GenericShape genericShape = new GenericShape(new c0(floatRef3, floatRef, floatRef4, floatRef2, 3));
                composerStartRestartGroup.updateRememberedValue(genericShape);
                objRememberedValue = genericShape;
            } else {
                i3 = 32;
            }
            Modifier.Companion companion2 = Modifier.INSTANCE;
            Modifier modifierM264backgroundbw27NRU$default = BackgroundKt.m264backgroundbw27NRU$default(ShadowKt.m4219shadows4CzXII$default(PaddingKt.m786paddingVpY3zN4$default(SizeKt.fillMaxWidth$default(PlotlineComposeWidgetKt.a(companion2, "PL_Location_Nudge"), 0.0f, 1, null), ChaloTheme.b(composerStartRestartGroup, 0).h, 0.0f, 2, null), ChaloTheme.c(composerStartRestartGroup, 0).e, (GenericShape) objRememberedValue, false, 0L, 0L, 28, null), ChaloTheme.a(composerStartRestartGroup, 0).t0, null, 2, null);
            Arrangement arrangement = Arrangement.INSTANCE;
            Arrangement.Vertical top = arrangement.getTop();
            Alignment.Companion companion3 = Alignment.INSTANCE;
            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(top, companion3.getStart(), composerStartRestartGroup, 0);
            long currentCompositeKeyHashCode = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
            int i4 = (int) (currentCompositeKeyHashCode ^ (currentCompositeKeyHashCode >>> i3));
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierM264backgroundbw27NRU$default);
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
            Updater.m3923setimpl(composerM3915constructorimpl, modifierMaterializeModifier, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion4, composerM3915constructorimpl, Integer.valueOf(i4), composerM3915constructorimpl));
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
            SpacerKt.Spacer(SizeKt.m814height3ABfNKs(companion2, f), composerStartRestartGroup, 0);
            ChaloSpacersKt.o(composerStartRestartGroup, 0);
            TextKt.m2623TextNvy7gAk(StringResourcesHelperKt.c(StringEnum.HOME_SCREEN_LOCATION_DISCLAIMER_TEXT, new Object[0], composerStartRestartGroup, 6), PaddingKt.m786paddingVpY3zN4$default(SizeKt.fillMaxWidth$default(companion2, 0.0f, 1, null), ChaloTheme.b(composerStartRestartGroup, 0).h, 0.0f, 2, null), ChaloTheme.a(composerStartRestartGroup, 0).t, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ChaloTheme.e(composerStartRestartGroup, 0).getBodySmall(), composerStartRestartGroup, 0, 0, 131064);
            Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(companion2, 0.0f, 1, null);
            MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(arrangement.getEnd(), companion3.getCenterVertically(), composerStartRestartGroup, 54);
            long currentCompositeKeyHashCode2 = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
            int i5 = (int) (currentCompositeKeyHashCode2 ^ (currentCompositeKeyHashCode2 >>> i3));
            CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierFillMaxWidth$default);
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
            Updater.m3923setimpl(composerM3915constructorimpl2, modifierMaterializeModifier2, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion4, composerM3915constructorimpl2, Integer.valueOf(i5), composerM3915constructorimpl2));
            RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
            boolean z = (i2 & 112) == i3;
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (z || objRememberedValue2 == companion.getEmpty()) {
                objRememberedValue2 = new ag1(function1, 2);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            TextKt.m2623TextNvy7gAk(StringResourcesHelperKt.c(StringEnum.CANCEL, new Object[0], composerStartRestartGroup, 6), PaddingKt.m785paddingVpY3zN4(ClickableKt.m299clickableoSLSa3U$default(companion2, false, null, null, null, (Function0) objRememberedValue2, 15, null), ChaloTheme.b(composerStartRestartGroup, 0).h, ChaloTheme.b(composerStartRestartGroup, 0).f), ChaloTheme.a(composerStartRestartGroup, 0).m0, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ChaloTypographyKt.a(ChaloTheme.e(composerStartRestartGroup, 0).getBodySmall()), composerStartRestartGroup, 0, 0, 131064);
            ChaloSpacersKt.w(composerStartRestartGroup, 0);
            ChaloFilledButtonKt.c(StringResourcesHelperKt.c(StringEnum.TURN_ON, new Object[0], composerStartRestartGroup, 6), PaddingKt.m788paddingqDBjuR0$default(companion2, 0.0f, 0.0f, ChaloTheme.b(composerStartRestartGroup, 0).h, 0.0f, 11, null), ChaloTypographyKt.a(ChaloTheme.e(composerStartRestartGroup, 0).getBodySmall()), PainterResourceHelperKt.a(IconType.IC_ARROW_UP, composerStartRestartGroup, 6), 0L, 0L, 0.0f, function0, composerStartRestartGroup, (Painter.$stable << 9) | ((i2 << 21) & 29360128), 112);
            composerStartRestartGroup.endNode();
            ChaloSpacersKt.m(composerStartRestartGroup, 0);
            composerStartRestartGroup.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new t20(function0, function1, i, 5));
        }
    }

    public static final void d(IconType iconType, Function0 function0, Function0 function1, String str, Function0 function2, ProfileDrawerCardData profileDrawerCardData, boolean z, boolean z2, Composer composer, int i) {
        int i2;
        int i3;
        float fM7278constructorimpl;
        int i4;
        int i5;
        Composer composerStartRestartGroup = composer.startRestartGroup(-89754932);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changed(iconType == null ? -1 : iconType.ordinal()) ? 4 : 2) | i;
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
            i2 |= composerStartRestartGroup.changed(str) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(function2) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= composerStartRestartGroup.changed(profileDrawerCardData) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            i2 |= composerStartRestartGroup.changed(z) ? 1048576 : 524288;
        }
        if ((12582912 & i) == 0) {
            i2 |= composerStartRestartGroup.changed(z2) ? 8388608 : 4194304;
        }
        if (composerStartRestartGroup.shouldExecute((4793491 & i2) != 4793490, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-89754932, i2, -1, "app.chalo.home.ui.common.ProfileLocationAndSosTemplate (TabHeader.kt:203)");
            }
            ProfileDrawerCardData profileDrawerCardData2 = profileDrawerCardData == null ? new ProfileDrawerCardData(false, (String) null, (String) null, (String) null, (Gender) null, false, 0, 0, TypedValues.PositionType.TYPE_POSITION_TYPE) : profileDrawerCardData;
            IconType iconTypeB = GenderKt.b(profileDrawerCardData2.e, IconType.IC_PROFILE);
            Modifier.Companion companion = Modifier.INSTANCE;
            Modifier modifierM786paddingVpY3zN4$default = PaddingKt.m786paddingVpY3zN4$default(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), ChaloTheme.b(composerStartRestartGroup, 0).h, 0.0f, 2, null);
            Alignment.Companion companion2 = Alignment.INSTANCE;
            Alignment.Vertical centerVertically = companion2.getCenterVertically();
            Arrangement arrangement = Arrangement.INSTANCE;
            MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(arrangement.getSpaceBetween(), centerVertically, composerStartRestartGroup, 54);
            long currentCompositeKeyHashCode = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
            int i6 = (int) (currentCompositeKeyHashCode ^ (currentCompositeKeyHashCode >>> 32));
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierM786paddingVpY3zN4$default);
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
            pk0.v(companion3, composerM3915constructorimpl, measurePolicyRowMeasurePolicy, composerM3915constructorimpl, currentCompositionLocalMap);
            Updater.m3923setimpl(composerM3915constructorimpl, modifierMaterializeModifier, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion3, composerM3915constructorimpl, Integer.valueOf(i6), composerM3915constructorimpl));
            RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
            MeasurePolicy measurePolicyRowMeasurePolicy2 = RowKt.rowMeasurePolicy(arrangement.getStart(), companion2.getCenterVertically(), composerStartRestartGroup, 48);
            long currentCompositeKeyHashCode2 = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
            int i7 = (int) (currentCompositeKeyHashCode2 ^ (currentCompositeKeyHashCode2 >>> 32));
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
            pk0.v(companion3, composerM3915constructorimpl2, measurePolicyRowMeasurePolicy2, composerM3915constructorimpl2, currentCompositionLocalMap2);
            Updater.m3923setimpl(composerM3915constructorimpl2, modifierMaterializeModifier2, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion3, composerM3915constructorimpl2, Integer.valueOf(i7), composerM3915constructorimpl2));
            if (!profileDrawerCardData2.f3592a || profileDrawerCardData2.f) {
                i3 = 0;
                composerStartRestartGroup.startReplaceGroup(-1183976714);
                fM7278constructorimpl = ChaloTheme.b(composerStartRestartGroup, 0).l;
                composerStartRestartGroup.endReplaceGroup();
            } else {
                composerStartRestartGroup.startReplaceGroup(-1183914373);
                i3 = 0;
                fM7278constructorimpl = Dp.m7278constructorimpl(ChaloTheme.b(composerStartRestartGroup, 0).k - ChaloTheme.b(composerStartRestartGroup, 0).c);
                composerStartRestartGroup.endReplaceGroup();
            }
            ProfileDrawerCardAvatarKt.b(profileDrawerCardData2, iconTypeB, ClickableKt.m299clickableoSLSa3U$default(ClipKt.clip(PlotlineComposeWidgetKt.a(companion, "PL_Profile_Icon"), RoundedCornerShapeKt.getCircleShape()), false, null, null, null, function0, 15, null), fM7278constructorimpl, ChaloTheme.b(composerStartRestartGroup, i3).c, ChaloTheme.b(composerStartRestartGroup, i3).c, Dp.m7278constructorimpl(ChaloTheme.b(composerStartRestartGroup, i3).c + ChaloTheme.b(composerStartRestartGroup, i3).b), composerStartRestartGroup, 0, 0);
            ChaloSpacersKt.w(composerStartRestartGroup, 0);
            if (iconType == null) {
                composerStartRestartGroup.startReplaceGroup(-1183198460);
            } else {
                composerStartRestartGroup.startReplaceGroup(-1183198459);
                ImageKt.Image(PainterResourceHelperKt.a(iconType, composerStartRestartGroup, 0), StringResourcesHelperKt.c(StringEnum.FAQS, new Object[0], composerStartRestartGroup, 6), (Modifier) null, (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composerStartRestartGroup, Painter.$stable, 124);
            }
            composerStartRestartGroup.endReplaceGroup();
            composerStartRestartGroup.endNode();
            if ((!z || str == null) && !z2) {
                i4 = 0;
                composerStartRestartGroup.startReplaceGroup(-665365710);
            } else {
                composerStartRestartGroup.startReplaceGroup(-654923391);
                i4 = 0;
                ChaloSpacersKt.x(composerStartRestartGroup, 0);
            }
            composerStartRestartGroup.endReplaceGroup();
            MeasurePolicy measurePolicyRowMeasurePolicy3 = RowKt.rowMeasurePolicy(arrangement.getEnd(), companion2.getCenterVertically(), composerStartRestartGroup, 54);
            long currentCompositeKeyHashCode3 = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, i4);
            int i8 = (int) (currentCompositeKeyHashCode3 ^ (currentCompositeKeyHashCode3 >>> 32));
            CompositionLocalMap currentCompositionLocalMap3 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier3 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, companion);
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
            pk0.v(companion3, composerM3915constructorimpl3, measurePolicyRowMeasurePolicy3, composerM3915constructorimpl3, currentCompositionLocalMap3);
            Updater.m3923setimpl(composerM3915constructorimpl3, modifierMaterializeModifier3, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion3, composerM3915constructorimpl3, Integer.valueOf(i8), composerM3915constructorimpl3));
            if (!z || str == null) {
                i5 = i2;
                composerStartRestartGroup.startReplaceGroup(1833656567);
            } else {
                composerStartRestartGroup.startReplaceGroup(1844363068);
                i5 = i2;
                ChaloLocationHeaderItemKt.a(((i2 >> 6) & 112) | (i2 & 896), 1, composerStartRestartGroup, null, str, function1);
            }
            composerStartRestartGroup.endReplaceGroup();
            if (z2) {
                composerStartRestartGroup.startReplaceGroup(1844556198);
                ChaloSpacersKt.w(composerStartRestartGroup, i4);
                a(function2, composerStartRestartGroup, (i5 >> 12) & 14);
            } else {
                composerStartRestartGroup.startReplaceGroup(1833656567);
            }
            composerStartRestartGroup.endReplaceGroup();
            if (r1.k(composerStartRestartGroup)) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new od(iconType, function0, function1, str, function2, profileDrawerCardData, z, z2, i));
        }
    }

    public static final void e(List list, Function2 function2, Composer composer, int i) {
        int i2;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1202309847);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(list) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(function2) ? 32 : 16;
        }
        if (composerStartRestartGroup.shouldExecute((i2 & 19) != 18, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1202309847, i2, -1, "app.chalo.home.ui.common.RegularBusRecentSearchesRow (TabHeader.kt:421)");
            }
            Modifier modifierM264backgroundbw27NRU$default = BackgroundKt.m264backgroundbw27NRU$default(SizeKt.fillMaxWidth$default(PlotlineComposeWidgetKt.a(Modifier.INSTANCE, "PL_Recent_Searches"), 0.0f, 1, null), ChaloTheme.a(composerStartRestartGroup, 0).Z, null, 2, null);
            boolean zChangedInstance = composerStartRestartGroup.changedInstance(list) | ((i2 & 112) == 32);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new pg1(4, list, function2);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            LazyDslKt.LazyRow(modifierM264backgroundbw27NRU$default, null, null, false, null, null, null, false, null, (Function1) objRememberedValue, composerStartRestartGroup, 0, TypedValues.PositionType.TYPE_POSITION_TYPE);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new cg1(list, function2, i, 5));
        }
    }

    /* JADX WARN: Code duplicated, block: B:118:0x0192  */
    /* JADX WARN: Code duplicated, block: B:119:0x0197  */
    /* JADX WARN: Code duplicated, block: B:121:0x019d  */
    /* JADX WARN: Code duplicated, block: B:123:0x01a3  */
    /* JADX WARN: Code duplicated, block: B:127:0x01ad  */
    /* JADX WARN: Code duplicated, block: B:129:0x01b3  */
    /* JADX WARN: Code duplicated, block: B:133:0x01bb  */
    /* JADX WARN: Code duplicated, block: B:135:0x01c1  */
    /* JADX WARN: Code duplicated, block: B:143:0x01df  */
    /* JADX WARN: Code duplicated, block: B:146:0x01e8  */
    /* JADX WARN: Code duplicated, block: B:148:0x01ec  */
    /* JADX WARN: Code duplicated, block: B:150:0x01f8  */
    /* JADX WARN: Code duplicated, block: B:152:0x0205  */
    /* JADX WARN: Code duplicated, block: B:154:0x0209  */
    /* JADX WARN: Code duplicated, block: B:156:0x020e  */
    /* JADX WARN: Code duplicated, block: B:158:0x0213  */
    /* JADX WARN: Code duplicated, block: B:159:0x0216  */
    /* JADX WARN: Code duplicated, block: B:161:0x021a  */
    /* JADX WARN: Code duplicated, block: B:163:0x0226  */
    /* JADX WARN: Code duplicated, block: B:165:0x0233  */
    /* JADX WARN: Code duplicated, block: B:168:0x0241  */
    /* JADX WARN: Code duplicated, block: B:171:0x0255  */
    /* JADX WARN: Code duplicated, block: B:174:0x02a8  */
    /* JADX WARN: Code duplicated, block: B:175:0x02ab  */
    /* JADX WARN: Code duplicated, block: B:177:0x02af  */
    /* JADX WARN: Code duplicated, block: B:180:0x02bb  */
    /* JADX WARN: Code duplicated, block: B:181:0x02bf  */
    /* JADX WARN: Code duplicated, block: B:187:0x02ef  */
    /* JADX WARN: Code duplicated, block: B:196:0x0360  */
    /* JADX WARN: Code duplicated, block: B:197:0x0362  */
    /* JADX WARN: Code duplicated, block: B:199:0x0365  */
    /* JADX WARN: Code duplicated, block: B:201:0x0386  */
    /* JADX WARN: Code duplicated, block: B:210:0x03bc  */
    /* JADX WARN: Code duplicated, block: B:214:0x03d5  */
    /* JADX WARN: Code duplicated, block: B:216:0x03dd  */
    /* JADX WARN: Code duplicated, block: B:218:0x03f3  */
    /* JADX WARN: Code duplicated, block: B:219:0x03f5  */
    /* JADX WARN: Code duplicated, block: B:224:0x0410  */
    /* JADX WARN: Code duplicated, block: B:230:0x0448  */
    /* JADX WARN: Code duplicated, block: B:232:0x0452  */
    /* JADX WARN: Code duplicated, block: B:234:0x0464  */
    /* JADX WARN: Code duplicated, block: B:235:0x0466  */
    /* JADX WARN: Code duplicated, block: B:244:0x047a  */
    /* JADX WARN: Code duplicated, block: B:251:0x048d  */
    /* JADX WARN: Code duplicated, block: B:253:0x04a7  */
    /* JADX WARN: Code duplicated, block: B:255:0x04cf  */
    /* JADX WARN: Code duplicated, block: B:256:0x04d1  */
    /* JADX WARN: Code duplicated, block: B:265:0x04e5  */
    /* JADX WARN: Code duplicated, block: B:270:0x04f5  */
    /* JADX WARN: Code duplicated, block: B:273:0x0511  */
    /* JADX WARN: Code duplicated, block: B:276:0x0520  */
    /* JADX WARN: Code duplicated, block: B:278:0x0524  */
    /* JADX WARN: Code duplicated, block: B:280:0x0534  */
    /* JADX WARN: Code duplicated, block: B:281:0x0536  */
    /* JADX WARN: Code duplicated, block: B:286:0x0545  */
    /* JADX WARN: Code duplicated, block: B:290:0x055f  */
    /* JADX WARN: Code duplicated, block: B:294:0x056e  */
    /* JADX WARN: Code duplicated, block: B:298:0x0596  */
    /* JADX WARN: Code duplicated, block: B:301:0x05a9  */
    /* JADX WARN: Code duplicated, block: B:305:0x05c6  */
    /* JADX WARN: Code duplicated, block: B:308:0x05d6  */
    /* JADX WARN: Code duplicated, block: B:310:0x05e3  */
    /* JADX WARN: Code duplicated, block: B:313:0x05f9  */
    /* JADX WARN: Code duplicated, block: B:316:0x0436 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:319:? A[RETURN, SYNTHETIC] */
    public static final void f(Modifier modifier, final TabMetaDataAppModel tabMetaDataAppModel, Function0 function0, Function0 function1, Function0 function2, final Function1 function3, Function0 function4, Function0 function5, String str, boolean z, ProfileDrawerCardData profileDrawerCardData, boolean z2, Function2 function6, List list, RegularBusPageDisplayItemData regularBusPageDisplayItemData, Function0 function7, Function0 function8, List aboveSearchImages, Function2 onAboveSearchImageClicked, Composer composer, int i, int i2, int i3) {
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        boolean z3;
        Composer composer2;
        Modifier modifier2;
        Function2 function9;
        List list2;
        RegularBusPageDisplayItemData regularBusPageDisplayItemData2;
        Function0 function10;
        Function0 function11;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Modifier.Companion companion;
        Function2 function12;
        List list3;
        Function2 function13;
        RegularBusPageDisplayItemData regularBusPageDisplayItemData3;
        Function0 function14;
        Object objRememberedValue;
        Function0 function15;
        List list4;
        String str2;
        IconType iconType;
        boolean zContains;
        Function0<ComposeUiNode> constructor;
        boolean z4;
        int i10;
        int i11;
        boolean z5;
        Function0 function16;
        int i12;
        RegularBusPageDisplayItemData regularBusPageDisplayItemData4;
        List list5;
        Function2 function17;
        Collection collection;
        boolean z6;
        Object objRememberedValue2;
        SearchCardAppModel searchCardAppModel;
        boolean z7;
        boolean z8;
        boolean z9;
        Object objRememberedValue3;
        boolean z10;
        boolean z11;
        boolean z12;
        Object objRememberedValue4;
        int i13;
        ImageResourceSectionAppModel imageResourceSectionAppModel;
        boolean z13;
        boolean zChanged;
        Object objRememberedValue5;
        int i14;
        float fM7278constructorimpl;
        Object objRememberedValue6;
        Object objRememberedValue7;
        Integer num = tabMetaDataAppModel.j;
        Intrinsics.i(aboveSearchImages, "aboveSearchImages");
        Intrinsics.i(onAboveSearchImageClicked, "onAboveSearchImageClicked");
        Composer composerStartRestartGroup = composer.startRestartGroup(-329814631);
        int i15 = i | 6;
        if ((i & 48) == 0) {
            i15 |= (i & 64) == 0 ? composerStartRestartGroup.changed(tabMetaDataAppModel) : composerStartRestartGroup.changedInstance(tabMetaDataAppModel) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i15 |= composerStartRestartGroup.changedInstance(function0) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i15 |= composerStartRestartGroup.changedInstance(function1) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i15 |= composerStartRestartGroup.changedInstance(function2) ? 16384 : 8192;
        }
        if ((i & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
            i15 |= composerStartRestartGroup.changedInstance(function3) ? 131072 : 65536;
        }
        if ((i & 1572864) == 0) {
            i15 |= composerStartRestartGroup.changedInstance(function4) ? 1048576 : 524288;
        }
        if ((i & 12582912) == 0) {
            i15 |= composerStartRestartGroup.changedInstance(function5) ? 8388608 : 4194304;
        }
        if ((i & 100663296) == 0) {
            i15 |= composerStartRestartGroup.changed(str) ? AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL : 33554432;
        }
        if ((i & 805306368) == 0) {
            i15 |= composerStartRestartGroup.changed(z) ? 536870912 : 268435456;
        }
        int i16 = (i2 & 6) == 0 ? i2 | (composerStartRestartGroup.changed(profileDrawerCardData) ? 4 : 2) : i2;
        if ((i2 & 48) == 0) {
            i16 |= composerStartRestartGroup.changed(z2) ? 32 : 16;
        }
        int i17 = i16;
        int i18 = i3 & 4096;
        if (i18 != 0) {
            i4 = i17 | 384;
        } else if ((i2 & 384) == 0) {
            i4 = i17 | (composerStartRestartGroup.changedInstance(function6) ? 256 : 128);
        } else {
            i4 = i17;
        }
        int i19 = i3 & 8192;
        if (i19 != 0) {
            i5 = i4 | 3072;
        } else {
            int i20 = i4;
            if ((i2 & 3072) == 0) {
                i20 |= composerStartRestartGroup.changedInstance(list) ? 2048 : 1024;
            }
            i5 = i20;
        }
        int i21 = i3 & 16384;
        if (i21 == 0) {
            i6 = i5;
            if ((i2 & 24576) == 0) {
                i6 |= composerStartRestartGroup.changedInstance(regularBusPageDisplayItemData) ? 16384 : 8192;
            }
            i7 = i3 & 32768;
            if (i7 != 0) {
                i6 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
            } else if ((i2 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
                i6 |= composerStartRestartGroup.changedInstance(function7) ? 131072 : 65536;
            }
            i8 = i6 | 1572864;
            if ((i2 & 12582912) == 0) {
                i8 |= composerStartRestartGroup.changedInstance(aboveSearchImages) ? 8388608 : 4194304;
            }
            if ((i2 & 100663296) == 0) {
                i8 |= composerStartRestartGroup.changedInstance(onAboveSearchImageClicked) ? AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL : 33554432;
            }
            i9 = i8;
            if ((i15 & 306783379) == 306783378 || (38347923 & i9) != 38347922) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (composerStartRestartGroup.shouldExecute(z3, i15 & 1)) {
                companion = Modifier.INSTANCE;
                if (i18 != 0) {
                    objRememberedValue7 = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue7 == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue7 = new i81(12);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue7);
                    }
                    function12 = (Function2) objRememberedValue7;
                } else {
                    function12 = function6;
                }
                if (i19 != 0) {
                    list3 = EmptyList.f17557a;
                } else {
                    list3 = list;
                }
                function13 = function12;
                if (i21 != 0) {
                    regularBusPageDisplayItemData3 = null;
                } else {
                    regularBusPageDisplayItemData3 = regularBusPageDisplayItemData;
                }
                if (i7 != 0) {
                    objRememberedValue6 = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue6 == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue6 = new wb(8);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue6);
                    }
                    function14 = (Function0) objRememberedValue6;
                } else {
                    function14 = function7;
                }
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = new wb(8);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                function15 = (Function0) objRememberedValue;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-329814631, i15, i9, "app.chalo.home.ui.common.TabHeader (TabHeader.kt:90)");
                }
                list4 = tabMetaDataAppModel.d;
                str2 = tabMetaDataAppModel.e;
                iconType = tabMetaDataAppModel.c;
                zContains = list4.contains(HeaderItemType.SOS);
                Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null);
                MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getCenterHorizontally(), composerStartRestartGroup, 48);
                long currentCompositeKeyHashCode = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
                int i22 = (int) (currentCompositeKeyHashCode ^ (currentCompositeKeyHashCode >>> 32));
                CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierFillMaxWidth$default);
                ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
                constructor = companion2.getConstructor();
                if (composerStartRestartGroup.getApplier() != null) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                if (!z4) {
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
                Updater.m3923setimpl(composerM3915constructorimpl, modifierMaterializeModifier, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion2, composerM3915constructorimpl, Integer.valueOf(i22), composerM3915constructorimpl));
                ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
                ChaloSpacersKt.q(composerStartRestartGroup, 0);
                if (list4.contains(HeaderItemType.PROFILE_LOCATION) || (str == null && z)) {
                    i10 = 757644147;
                    composer2 = composerStartRestartGroup;
                    i11 = i15;
                    if (str2.length() > 0) {
                        z5 = true;
                    } else {
                        z5 = false;
                    }
                    if (z5) {
                        composer2.startReplaceGroup(763321053);
                        b(str2, iconType, function15, zContains, function2, composer2, ((i9 >> 12) & 896) | (i11 & 57344));
                        function16 = function15;
                    } else {
                        function16 = function15;
                        composer2.startReplaceGroup(757644147);
                    }
                    composer2.endReplaceGroup();
                } else {
                    composerStartRestartGroup.startReplaceGroup(762548285);
                    i10 = 757644147;
                    i11 = i15;
                    d(iconType, function0, function1, str, function2, profileDrawerCardData, z, zContains, composerStartRestartGroup, ((i15 >> 3) & 1008) | ((i15 >> 15) & 7168) | (57344 & i15) | ((i9 << 15) & 458752) | ((i15 >> 9) & 3670016));
                    composer2 = composerStartRestartGroup;
                    if (z2) {
                        composer2.startReplaceGroup(763008294);
                        ChaloSpacersKt.m(composer2, 0);
                        c(function4, function5, composer2, (i11 >> 18) & WebSocketProtocol.PAYLOAD_SHORT);
                    } else {
                        composer2.startReplaceGroup(757644147);
                    }
                    composer2.endReplaceGroup();
                    composer2.endReplaceGroup();
                    function16 = function15;
                }
                if (r20 != 0 || z2) {
                    composer2.startReplaceGroup(i10);
                } else {
                    composer2.startReplaceGroup(763687659);
                    Modifier modifierFillMaxWidth$default2 = SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null);
                    if (r20 != 0) {
                        fM7278constructorimpl = Dp.m7278constructorimpl(num.intValue());
                        i14 = 0;
                    } else {
                        i14 = 0;
                        fM7278constructorimpl = Dp.m7278constructorimpl(0);
                    }
                    SpacerKt.Spacer(SizeKt.m814height3ABfNKs(modifierFillMaxWidth$default2, fM7278constructorimpl), composer2, i14);
                }
                composer2.endReplaceGroup();
                composer2.startReplaceGroup(1410115804);
                i12 = 0;
                for (Object obj : aboveSearchImages) {
                    i13 = i12 + 1;
                    if (i12 >= 0) {
                        CollectionsKt.z0();
                        throw null;
                    }
                    imageResourceSectionAppModel = (ImageResourceSectionAppModel) obj;
                    boolean z14 = imageResourceSectionAppModel.e;
                    float f = ChaloTheme.b(composer2, 0).h;
                    Modifier.Companion companion3 = companion;
                    if ((i9 & 234881024) == 67108864) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    zChanged = z13 | composer2.changed(i12) | composer2.changedInstance(imageResourceSectionAppModel);
                    objRememberedValue5 = composer2.rememberedValue();
                    if (zChanged || objRememberedValue5 == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue5 = new u10(onAboveSearchImageClicked, i12, imageResourceSectionAppModel, 7);
                        composer2.updateRememberedValue(objRememberedValue5);
                    }
                    Function0 function18 = (Function0) objRememberedValue5;
                    ImageResourceSectionAppModel.Companion companion4 = ImageResourceSectionAppModel.INSTANCE;
                    ImageResourceSectionUIKt.a(imageResourceSectionAppModel, z14, f, function18, null, null, composer2, 0, 48);
                    i12 = i13;
                    companion = companion3;
                }
                Modifier.Companion companion5 = companion;
                composer2.endReplaceGroup();
                if (list4.contains(HeaderItemType.SEARCH_BAR)) {
                    composer2.startReplaceGroup(764296561);
                    searchCardAppModel = tabMetaDataAppModel.p;
                    if (searchCardAppModel != null) {
                        composer2.startReplaceGroup(764366993);
                        ChaloSpacersKt.o(composer2, 0);
                        String str3 = tabMetaDataAppModel.f;
                        if ((i11 & 458752) == 131072) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        if ((i11 & 112) != 32 || ((i11 & 64) != 0 && composer2.changedInstance(tabMetaDataAppModel))) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        z12 = z10 | z11;
                        objRememberedValue4 = composer2.rememberedValue();
                        if (z12 || objRememberedValue4 == Composer.INSTANCE.getEmpty()) {
                            final int i23 = 0;
                            objRememberedValue4 = new Function0() { // from class: zg1
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    switch (i23) {
                                        case 0:
                                            function3.invoke(tabMetaDataAppModel.f);
                                            break;
                                        default:
                                            function3.invoke(tabMetaDataAppModel.f);
                                            break;
                                    }
                                    return Unit.f17538a;
                                }
                            };
                            composer2.updateRememberedValue(objRememberedValue4);
                        }
                        SearchCardUIKt.a(searchCardAppModel, str3, (Function0) objRememberedValue4, null, composer2, 0);
                        composer2.endReplaceGroup();
                    } else {
                        composer2.startReplaceGroup(764667197);
                        ChaloSpacersKt.q(composer2, 0);
                        String str4 = tabMetaDataAppModel.f;
                        Painter painterA = PainterResourceHelperKt.a(IconType.IC_HOME_SEARCH, composer2, 6);
                        Modifier modifierM786paddingVpY3zN4$default = PaddingKt.m786paddingVpY3zN4$default(Modifier.INSTANCE, ChaloTheme.b(composer2, 0).h, 0.0f, 2, null);
                        if ((i11 & 458752) == 131072) {
                            z7 = true;
                        } else {
                            z7 = false;
                        }
                        if ((i11 & 112) != 32 || ((i11 & 64) != 0 && composer2.changedInstance(tabMetaDataAppModel))) {
                            z8 = true;
                        } else {
                            z8 = false;
                        }
                        z9 = z7 | z8;
                        objRememberedValue3 = composer2.rememberedValue();
                        if (z9 || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                            final int i24 = 1;
                            objRememberedValue3 = new Function0() { // from class: zg1
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    switch (i24) {
                                        case 0:
                                            function3.invoke(tabMetaDataAppModel.f);
                                            break;
                                        default:
                                            function3.invoke(tabMetaDataAppModel.f);
                                            break;
                                    }
                                    return Unit.f17538a;
                                }
                            };
                            composer2.updateRememberedValue(objRememberedValue3);
                        }
                        ChaloSearchBarKt.a((Function0) objRememberedValue3, str4, painterA, modifierM786paddingVpY3zN4$default, composer2, Painter.$stable << 6);
                        composer2.endReplaceGroup();
                    }
                } else {
                    composer2.startReplaceGroup(757644147);
                }
                composer2.endReplaceGroup();
                if (list4.contains(HeaderItemType.PAY_FOR_TICKET)) {
                    regularBusPageDisplayItemData4 = regularBusPageDisplayItemData3;
                    if (regularBusPageDisplayItemData4 != null) {
                        composer2.startReplaceGroup(765260630);
                        ChaloSpacersKt.q(composer2, 0);
                        if ((i9 & 458752) == 131072) {
                            z6 = true;
                        } else {
                            z6 = false;
                        }
                        objRememberedValue2 = composer2.rememberedValue();
                        if (z6 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue2 = new ag1(function14, 1);
                            composer2.updateRememberedValue(objRememberedValue2);
                        }
                        PayForTicketComposableKt.a(regularBusPageDisplayItemData4, (Function0) objRememberedValue2, composer2, (i9 >> 12) & 14);
                    }
                    composer2.endReplaceGroup();
                    if (list4.contains(HeaderItemType.RECENT_SEARCHES) || collection.isEmpty()) {
                        collection = list3;
                        list5 = list3;
                        function17 = function13;
                        composer2.startReplaceGroup(757644147);
                    } else {
                        collection = list3;
                        composer2.startReplaceGroup(765587246);
                        ChaloSpacersKt.o(composer2, 0);
                        list5 = list3;
                        function17 = function13;
                        e(list5, function17, composer2, ((i9 >> 9) & 14) | ((i9 >> 3) & 112));
                    }
                    composer2.endReplaceGroup();
                    if (list4.contains(HeaderItemType.STORIES) || StringsKt.F(tabMetaDataAppModel.g)) {
                        composer2.startReplaceGroup(757644147);
                    } else {
                        composer2.startReplaceGroup(765922325);
                        ChaloSpacersKt.o(composer2, 0);
                        app.chalo.compose.components.plotline.PlotlineComposeWidgetKt.a(0, 2, composer2, null, tabMetaDataAppModel.g);
                    }
                    composer2.endReplaceGroup();
                    composer2.endNode();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    regularBusPageDisplayItemData2 = regularBusPageDisplayItemData4;
                    function10 = function14;
                    function11 = function16;
                    function9 = function17;
                    list2 = list5;
                    modifier2 = companion5;
                } else {
                    regularBusPageDisplayItemData4 = regularBusPageDisplayItemData3;
                }
                composer2.startReplaceGroup(757644147);
                composer2.endReplaceGroup();
                if (list4.contains(HeaderItemType.RECENT_SEARCHES)) {
                    collection = list3;
                    list5 = list3;
                    function17 = function13;
                    composer2.startReplaceGroup(757644147);
                } else {
                    collection = list3;
                    list5 = list3;
                    function17 = function13;
                    composer2.startReplaceGroup(757644147);
                }
                composer2.endReplaceGroup();
                if (list4.contains(HeaderItemType.STORIES)) {
                    composer2.startReplaceGroup(757644147);
                } else {
                    composer2.startReplaceGroup(757644147);
                }
                composer2.endReplaceGroup();
                composer2.endNode();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                regularBusPageDisplayItemData2 = regularBusPageDisplayItemData4;
                function10 = function14;
                function11 = function16;
                function9 = function17;
                list2 = list5;
                modifier2 = companion5;
            } else {
                composer2 = composerStartRestartGroup;
                composer2.skipToGroupEnd();
                modifier2 = modifier;
                function9 = function6;
                list2 = list;
                regularBusPageDisplayItemData2 = regularBusPageDisplayItemData;
                function10 = function7;
                function11 = function8;
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new t51(modifier2, tabMetaDataAppModel, function0, function1, function2, function3, function4, function5, str, z, profileDrawerCardData, z2, function9, list2, regularBusPageDisplayItemData2, function10, function11, aboveSearchImages, onAboveSearchImageClicked, i, i2, i3));
            }
        }
        i6 = i5 | 24576;
        i7 = i3 & 32768;
        if (i7 != 0) {
            i6 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
        } else if ((i2 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
            i6 |= composerStartRestartGroup.changedInstance(function7) ? 131072 : 65536;
        }
        i8 = i6 | 1572864;
        if ((i2 & 12582912) == 0) {
            i8 |= composerStartRestartGroup.changedInstance(aboveSearchImages) ? 8388608 : 4194304;
        }
        if ((i2 & 100663296) == 0) {
            i8 |= composerStartRestartGroup.changedInstance(onAboveSearchImageClicked) ? AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL : 33554432;
        }
        i9 = i8;
        if ((i15 & 306783379) == 306783378) {
            z3 = true;
        } else {
            z3 = true;
        }
        if (composerStartRestartGroup.shouldExecute(z3, i15 & 1)) {
            companion = Modifier.INSTANCE;
            if (i18 != 0) {
                objRememberedValue7 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue7 == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue7 = new i81(12);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue7);
                }
                function12 = (Function2) objRememberedValue7;
            } else {
                function12 = function6;
            }
            if (i19 != 0) {
                list3 = EmptyList.f17557a;
            } else {
                list3 = list;
            }
            function13 = function12;
            if (i21 != 0) {
                regularBusPageDisplayItemData3 = null;
            } else {
                regularBusPageDisplayItemData3 = regularBusPageDisplayItemData;
            }
            if (i7 != 0) {
                objRememberedValue6 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue6 == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue6 = new wb(8);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue6);
                }
                function14 = (Function0) objRememberedValue6;
            } else {
                function14 = function7;
            }
            objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new wb(8);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            function15 = (Function0) objRememberedValue;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-329814631, i15, i9, "app.chalo.home.ui.common.TabHeader (TabHeader.kt:90)");
            }
            list4 = tabMetaDataAppModel.d;
            str2 = tabMetaDataAppModel.e;
            iconType = tabMetaDataAppModel.c;
            zContains = list4.contains(HeaderItemType.SOS);
            Modifier modifierFillMaxWidth$default3 = SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null);
            MeasurePolicy measurePolicyColumnMeasurePolicy2 = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getCenterHorizontally(), composerStartRestartGroup, 48);
            long currentCompositeKeyHashCode2 = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
            int i25 = (int) (currentCompositeKeyHashCode2 ^ (currentCompositeKeyHashCode2 >>> 32));
            CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierFillMaxWidth$default3);
            ComposeUiNode.Companion companion6 = ComposeUiNode.INSTANCE;
            constructor = companion6.getConstructor();
            if (composerStartRestartGroup.getApplier() != null) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (!z4) {
                ComposablesKt.invalidApplier();
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.createNode(constructor);
            } else {
                composerStartRestartGroup.useNode();
            }
            Composer composerM3915constructorimpl2 = Updater.m3915constructorimpl(composerStartRestartGroup);
            pk0.v(companion6, composerM3915constructorimpl2, measurePolicyColumnMeasurePolicy2, composerM3915constructorimpl2, currentCompositionLocalMap2);
            Updater.m3923setimpl(composerM3915constructorimpl2, modifierMaterializeModifier2, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion6, composerM3915constructorimpl2, Integer.valueOf(i25), composerM3915constructorimpl2));
            ColumnScopeInstance columnScopeInstance2 = ColumnScopeInstance.INSTANCE;
            ChaloSpacersKt.q(composerStartRestartGroup, 0);
            if (list4.contains(HeaderItemType.PROFILE_LOCATION)) {
                i10 = 757644147;
                composer2 = composerStartRestartGroup;
                i11 = i15;
                if (str2.length() > 0) {
                    z5 = true;
                } else {
                    z5 = false;
                }
                if (z5) {
                    composer2.startReplaceGroup(763321053);
                    b(str2, iconType, function15, zContains, function2, composer2, ((i9 >> 12) & 896) | (i11 & 57344));
                    function16 = function15;
                } else {
                    function16 = function15;
                    composer2.startReplaceGroup(757644147);
                }
                composer2.endReplaceGroup();
            } else {
                i10 = 757644147;
                composer2 = composerStartRestartGroup;
                i11 = i15;
                if (str2.length() > 0) {
                    z5 = true;
                } else {
                    z5 = false;
                }
                if (z5) {
                    composer2.startReplaceGroup(763321053);
                    b(str2, iconType, function15, zContains, function2, composer2, ((i9 >> 12) & 896) | (i11 & 57344));
                    function16 = function15;
                } else {
                    function16 = function15;
                    composer2.startReplaceGroup(757644147);
                }
                composer2.endReplaceGroup();
            }
            if (r20 != 0) {
                composer2.startReplaceGroup(i10);
            } else {
                composer2.startReplaceGroup(i10);
            }
            composer2.endReplaceGroup();
            composer2.startReplaceGroup(1410115804);
            i12 = 0;
            while (r11.hasNext()) {
                i13 = i12 + 1;
                if (i12 >= 0) {
                    CollectionsKt.z0();
                    throw null;
                }
                imageResourceSectionAppModel = (ImageResourceSectionAppModel) obj;
                boolean z15 = imageResourceSectionAppModel.e;
                float f2 = ChaloTheme.b(composer2, 0).h;
                Modifier.Companion companion7 = companion;
                if ((i9 & 234881024) == 67108864) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                zChanged = z13 | composer2.changed(i12) | composer2.changedInstance(imageResourceSectionAppModel);
                objRememberedValue5 = composer2.rememberedValue();
                if (zChanged) {
                    objRememberedValue5 = new u10(onAboveSearchImageClicked, i12, imageResourceSectionAppModel, 7);
                    composer2.updateRememberedValue(objRememberedValue5);
                } else {
                    objRememberedValue5 = new u10(onAboveSearchImageClicked, i12, imageResourceSectionAppModel, 7);
                    composer2.updateRememberedValue(objRememberedValue5);
                }
                Function0 function19 = (Function0) objRememberedValue5;
                ImageResourceSectionAppModel.Companion companion8 = ImageResourceSectionAppModel.INSTANCE;
                ImageResourceSectionUIKt.a(imageResourceSectionAppModel, z15, f2, function19, null, null, composer2, 0, 48);
                i12 = i13;
                companion = companion7;
            }
            Modifier.Companion companion9 = companion;
            composer2.endReplaceGroup();
            if (list4.contains(HeaderItemType.SEARCH_BAR)) {
                composer2.startReplaceGroup(764296561);
                searchCardAppModel = tabMetaDataAppModel.p;
                if (searchCardAppModel != null) {
                    composer2.startReplaceGroup(764366993);
                    ChaloSpacersKt.o(composer2, 0);
                    String str5 = tabMetaDataAppModel.f;
                    if ((i11 & 458752) == 131072) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if ((i11 & 112) != 32) {
                        z11 = true;
                    } else {
                        z11 = true;
                    }
                    z12 = z10 | z11;
                    objRememberedValue4 = composer2.rememberedValue();
                    if (z12) {
                        final int i26 = 0;
                        objRememberedValue4 = new Function0() { // from class: zg1
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                switch (i26) {
                                    case 0:
                                        function3.invoke(tabMetaDataAppModel.f);
                                        break;
                                    default:
                                        function3.invoke(tabMetaDataAppModel.f);
                                        break;
                                }
                                return Unit.f17538a;
                            }
                        };
                        composer2.updateRememberedValue(objRememberedValue4);
                    } else {
                        final int i27 = 0;
                        objRememberedValue4 = new Function0() { // from class: zg1
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                switch (i27) {
                                    case 0:
                                        function3.invoke(tabMetaDataAppModel.f);
                                        break;
                                    default:
                                        function3.invoke(tabMetaDataAppModel.f);
                                        break;
                                }
                                return Unit.f17538a;
                            }
                        };
                        composer2.updateRememberedValue(objRememberedValue4);
                    }
                    SearchCardUIKt.a(searchCardAppModel, str5, (Function0) objRememberedValue4, null, composer2, 0);
                    composer2.endReplaceGroup();
                } else {
                    composer2.startReplaceGroup(764667197);
                    ChaloSpacersKt.q(composer2, 0);
                    String str6 = tabMetaDataAppModel.f;
                    Painter painterA2 = PainterResourceHelperKt.a(IconType.IC_HOME_SEARCH, composer2, 6);
                    Modifier modifierM786paddingVpY3zN4$default2 = PaddingKt.m786paddingVpY3zN4$default(Modifier.INSTANCE, ChaloTheme.b(composer2, 0).h, 0.0f, 2, null);
                    if ((i11 & 458752) == 131072) {
                        z7 = true;
                    } else {
                        z7 = false;
                    }
                    if ((i11 & 112) != 32) {
                        z8 = true;
                    } else {
                        z8 = true;
                    }
                    z9 = z7 | z8;
                    objRememberedValue3 = composer2.rememberedValue();
                    if (z9) {
                        final int i28 = 1;
                        objRememberedValue3 = new Function0() { // from class: zg1
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                switch (i28) {
                                    case 0:
                                        function3.invoke(tabMetaDataAppModel.f);
                                        break;
                                    default:
                                        function3.invoke(tabMetaDataAppModel.f);
                                        break;
                                }
                                return Unit.f17538a;
                            }
                        };
                        composer2.updateRememberedValue(objRememberedValue3);
                    } else {
                        final int i29 = 1;
                        objRememberedValue3 = new Function0() { // from class: zg1
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                switch (i29) {
                                    case 0:
                                        function3.invoke(tabMetaDataAppModel.f);
                                        break;
                                    default:
                                        function3.invoke(tabMetaDataAppModel.f);
                                        break;
                                }
                                return Unit.f17538a;
                            }
                        };
                        composer2.updateRememberedValue(objRememberedValue3);
                    }
                    ChaloSearchBarKt.a((Function0) objRememberedValue3, str6, painterA2, modifierM786paddingVpY3zN4$default2, composer2, Painter.$stable << 6);
                    composer2.endReplaceGroup();
                }
            } else {
                composer2.startReplaceGroup(757644147);
            }
            composer2.endReplaceGroup();
            if (list4.contains(HeaderItemType.PAY_FOR_TICKET)) {
                regularBusPageDisplayItemData4 = regularBusPageDisplayItemData3;
                if (regularBusPageDisplayItemData4 != null) {
                    composer2.startReplaceGroup(765260630);
                    ChaloSpacersKt.q(composer2, 0);
                    if ((i9 & 458752) == 131072) {
                        z6 = true;
                    } else {
                        z6 = false;
                    }
                    objRememberedValue2 = composer2.rememberedValue();
                    if (z6) {
                        objRememberedValue2 = new ag1(function14, 1);
                        composer2.updateRememberedValue(objRememberedValue2);
                    } else {
                        objRememberedValue2 = new ag1(function14, 1);
                        composer2.updateRememberedValue(objRememberedValue2);
                    }
                    PayForTicketComposableKt.a(regularBusPageDisplayItemData4, (Function0) objRememberedValue2, composer2, (i9 >> 12) & 14);
                }
                composer2.endReplaceGroup();
                if (list4.contains(HeaderItemType.RECENT_SEARCHES)) {
                    collection = list3;
                    list5 = list3;
                    function17 = function13;
                    composer2.startReplaceGroup(757644147);
                } else {
                    collection = list3;
                    list5 = list3;
                    function17 = function13;
                    composer2.startReplaceGroup(757644147);
                }
                composer2.endReplaceGroup();
                if (list4.contains(HeaderItemType.STORIES)) {
                    composer2.startReplaceGroup(757644147);
                } else {
                    composer2.startReplaceGroup(757644147);
                }
                composer2.endReplaceGroup();
                composer2.endNode();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                regularBusPageDisplayItemData2 = regularBusPageDisplayItemData4;
                function10 = function14;
                function11 = function16;
                function9 = function17;
                list2 = list5;
                modifier2 = companion9;
            } else {
                regularBusPageDisplayItemData4 = regularBusPageDisplayItemData3;
            }
            composer2.startReplaceGroup(757644147);
            composer2.endReplaceGroup();
            if (list4.contains(HeaderItemType.RECENT_SEARCHES)) {
                collection = list3;
                list5 = list3;
                function17 = function13;
                composer2.startReplaceGroup(757644147);
            } else {
                collection = list3;
                list5 = list3;
                function17 = function13;
                composer2.startReplaceGroup(757644147);
            }
            composer2.endReplaceGroup();
            if (list4.contains(HeaderItemType.STORIES)) {
                composer2.startReplaceGroup(757644147);
            } else {
                composer2.startReplaceGroup(757644147);
            }
            composer2.endReplaceGroup();
            composer2.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            regularBusPageDisplayItemData2 = regularBusPageDisplayItemData4;
            function10 = function14;
            function11 = function16;
            function9 = function17;
            list2 = list5;
            modifier2 = companion9;
        } else {
            composer2 = composerStartRestartGroup;
            composer2.skipToGroupEnd();
            modifier2 = modifier;
            function9 = function6;
            list2 = list;
            regularBusPageDisplayItemData2 = regularBusPageDisplayItemData;
            function10 = function7;
            function11 = function8;
        }
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new t51(modifier2, tabMetaDataAppModel, function0, function1, function2, function3, function4, function5, str, z, profileDrawerCardData, z2, function9, list2, regularBusPageDisplayItemData2, function10, function11, aboveSearchImages, onAboveSearchImageClicked, i, i2, i3));
        }
    }
}
