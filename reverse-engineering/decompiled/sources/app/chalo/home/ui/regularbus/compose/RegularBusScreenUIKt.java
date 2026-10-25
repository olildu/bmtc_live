package app.chalo.home.ui.regularbus.compose;

import androidx.compose.animation.AnimatedVisibilityKt;
import androidx.compose.animation.EnterTransition;
import androidx.compose.animation.ExitTransition;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.IndicationNodeFactory;
import androidx.compose.foundation.ScrollKt;
import androidx.compose.foundation.ScrollState;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.IntrinsicKt;
import androidx.compose.foundation.layout.IntrinsicSize;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.lazy.LazyDslKt;
import androidx.compose.material3.IconKt;
import androidx.compose.material3.TextKt;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.MutableIntState;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotIntStateKt;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.GraphicsLayerModifierKt;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.layout.ContentScale;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.OnGloballyPositionedModifierKt;
import androidx.compose.ui.layout.SubcomposeLayoutKt;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.media3.extractor.metadata.dvbsi.AppInfoTableDecoder;
import app.chalo.compose.HomeOverscrollEffect_androidKt;
import app.chalo.compose.PermissionsRationaleDialogKt;
import app.chalo.compose.components.ChaloGradientBackgroundKt;
import app.chalo.compose.components.ChaloRoundedCardKt;
import app.chalo.compose.components.ChaloSectionHighlightKt;
import app.chalo.compose.components.ChaloSpacersKt;
import app.chalo.compose.components.ChaloTabTitleKt;
import app.chalo.compose.components.ChaloWidgetCardKt;
import app.chalo.compose.components.PlotlineComposeWidgetKt;
import app.chalo.compose.components.RippleEffectKt;
import app.chalo.compose.components.buttons.ChaloFilledButtonAndroidKt;
import app.chalo.compose.components.buttons.ChaloFilledButtonKt;
import app.chalo.compose.resources.PainterResourceHelperKt;
import app.chalo.compose.resources.StringResourcesHelperKt;
import app.chalo.compose.theme.ChaloTheme;
import app.chalo.compose.theme.ChaloTypographyKt;
import app.chalo.data.ChaloTextDataKt;
import app.chalo.data.GridWidgetCardData;
import app.chalo.data.GridWidgetItemData;
import app.chalo.data.TextFormatAppModel;
import app.chalo.extensions.AnyExtsKt;
import app.chalo.home.data.model.app.LocationTooltipData;
import app.chalo.home.nearbytrips.data.model.NearbyStopAndTripsUiModel;
import app.chalo.home.ui.common.ImageResourceSectionUIKt;
import app.chalo.home.ui.common.ImageResourceSurface;
import app.chalo.home.ui.common.TabHeaderKt;
import app.chalo.home.ui.compose.PlotlineWidgetToResolveWhiteBackgroundIssueForiOSInHomeScreenTabsKt;
import app.chalo.home.ui.nearby.compose.RegularBusStopNearbyTripsCardKt;
import app.chalo.home.ui.profile.ProfileDrawerCardData;
import app.chalo.home.ui.regularbus.RegularBusDialogType;
import app.chalo.home.ui.regularbus.RegularBusPageDisplayItemData;
import app.chalo.home.ui.regularbus.RegularBusPageSectionDisplayType;
import app.chalo.home.ui.regularbus.RegularBusProductItemData;
import app.chalo.home.ui.regularbus.RegularBusViewIntent;
import app.chalo.home.ui.regularbus.RegularBusViewState;
import app.chalo.homescreen.data.model.app.BgHighlightType;
import app.chalo.homescreen.data.model.app.FAQAppModel;
import app.chalo.homescreen.data.model.app.ImageResourceSectionAppModel;
import app.chalo.homescreen.data.model.app.RegularBusPageFeature;
import app.chalo.homescreen.data.model.app.TabMetaDataAppModel;
import app.chalo.providers.ChaloCtaDisplayType;
import app.chalo.providers.iconassetprovider.IconType;
import app.chalo.providers.stringprovider.StringEnum;
import app.chalo.uistate.base.ChaloColorToken;
import app.chalo.uistate.base.ChaloColorToken_androidKt;
import coil3.compose.SingletonSubcomposeAsyncImageKt;
import defpackage.b3;
import defpackage.f0;
import defpackage.fu0;
import defpackage.gf;
import defpackage.h01;
import defpackage.hf;
import defpackage.hq0;
import defpackage.i41;
import defpackage.iu0;
import defpackage.kh;
import defpackage.lh;
import defpackage.lx0;
import defpackage.m11;
import defpackage.ma;
import defpackage.n11;
import defpackage.o11;
import defpackage.o3;
import defpackage.og;
import defpackage.p11;
import defpackage.pk0;
import defpackage.pz0;
import defpackage.q11;
import defpackage.r1;
import defpackage.r11;
import defpackage.rb;
import defpackage.rx0;
import defpackage.s01;
import defpackage.t1;
import defpackage.t11;
import defpackage.th;
import defpackage.uh;
import defpackage.v11;
import defpackage.w11;
import defpackage.xd;
import defpackage.xj;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.EmptyList;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import okhttp3.internal.ws.WebSocketProtocol;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005¨\u0006\f²\u0006\u000e\u0010\u0001\u001a\u00020\u00008\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010\u0003\u001a\u00020\u00028\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010\u0004\u001a\u00020\u00028\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010\u0005\u001a\u00020\u00008\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010\u0006\u001a\u00020\u00028\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010\b\u001a\u00020\u00078\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010\u0005\u001a\u00020\u00008\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010\t\u001a\u00020\u00028\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010\n\u001a\u00020\u00028\n@\nX\u008a\u008e\u0002²\u0006\f\u0010\u000b\u001a\u00020\u00028\nX\u008a\u0084\u0002²\u0006\u000e\u0010\u0005\u001a\u00020\u00008\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010\u0005\u001a\u00020\u00008\n@\nX\u008a\u008e\u0002"}, d2 = {"Landroidx/compose/ui/unit/Dp;", "heightInDp", "", "shouldShowNearbyStopsDivider", "isFooterRendered", "passesSectionHtInDp", "bannerAdLoaded", "Lapp/chalo/home/ui/regularbus/RegularBusUnifiedAdUiState;", "adUiState", "expanded", "shouldRenderSpacer", "shouldShowMoreBusesOption", "home_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class RegularBusScreenUIKt {

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f3669a;
        public static final /* synthetic */ int[] b;
        public static final /* synthetic */ int[] c;

        static {
            int[] iArr = new int[RegularBusPageFeature.values().length];
            try {
                iArr[RegularBusPageFeature.TICKETS_PASSES.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[RegularBusPageFeature.NEARBY_BUS_STOPS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[RegularBusPageFeature.NEARBY_BUSES.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[RegularBusPageFeature.PLOTLINE_WIDGET.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[RegularBusPageFeature.FAQ.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[RegularBusPageFeature.PAY_FOR_TICKET.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[RegularBusPageFeature.CHALO_CARD.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[RegularBusPageFeature.PASSES.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[RegularBusPageFeature.IMAGE_RESOURCE.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[RegularBusPageFeature.METRO.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr[RegularBusPageFeature.FOOTER.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr[RegularBusPageFeature.UNKNOWN.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            f3669a = iArr;
            int[] iArr2 = new int[RegularBusPageSectionDisplayType.values().length];
            try {
                iArr2[RegularBusPageSectionDisplayType.PRODUCT_PURCHASE.ordinal()] = 1;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr2[RegularBusPageSectionDisplayType.CARD.ordinal()] = 2;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                iArr2[RegularBusPageSectionDisplayType.NEARBY_BUS_STOPS.ordinal()] = 3;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                iArr2[RegularBusPageSectionDisplayType.NEARBY_BUSES.ordinal()] = 4;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                iArr2[RegularBusPageSectionDisplayType.IMAGE_RESOURCE.ordinal()] = 5;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                iArr2[RegularBusPageSectionDisplayType.PLOTLINE_WIDGET.ordinal()] = 6;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                iArr2[RegularBusPageSectionDisplayType.FAQ.ordinal()] = 7;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                iArr2[RegularBusPageSectionDisplayType.FOOTER.ordinal()] = 8;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                iArr2[RegularBusPageSectionDisplayType.GAM_BANNER_AD.ordinal()] = 9;
            } catch (NoSuchFieldError unused21) {
            }
            try {
                iArr2[RegularBusPageSectionDisplayType.REGULAR_BUS_UNIFIED_AD.ordinal()] = 10;
            } catch (NoSuchFieldError unused22) {
            }
            try {
                iArr2[RegularBusPageSectionDisplayType.DIVIDER.ordinal()] = 11;
            } catch (NoSuchFieldError unused23) {
            }
            b = iArr2;
            int[] iArr3 = new int[ChaloCtaDisplayType.values().length];
            try {
                iArr3[ChaloCtaDisplayType.UNKNOWN.ordinal()] = 1;
            } catch (NoSuchFieldError unused24) {
            }
            try {
                iArr3[ChaloCtaDisplayType.ARROW.ordinal()] = 2;
            } catch (NoSuchFieldError unused25) {
            }
            try {
                iArr3[ChaloCtaDisplayType.BUTTON.ordinal()] = 3;
            } catch (NoSuchFieldError unused26) {
            }
            c = iArr3;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void a(int i, Composer composer, Modifier modifier, String str, String str2) {
        int i2;
        Composer composer2;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1536326215);
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
        if (composerStartRestartGroup.shouldExecute((i2 & 147) != 146, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1536326215, i2, -1, "app.chalo.home.ui.regularbus.compose.ChaloFAQUI (RegularBusScreenUI.kt:798)");
            }
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            Composer.Companion companion = Composer.INSTANCE;
            if (objRememberedValue == companion.getEmpty()) {
                objRememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            MutableState mutableState = (MutableState) objRememberedValue;
            Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(modifier, 0.0f, 1, null);
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue2 == companion.getEmpty()) {
                objRememberedValue2 = new t1(mutableState, 25);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            Modifier modifierM299clickableoSLSa3U$default = ClickableKt.m299clickableoSLSa3U$default(modifierFillMaxWidth$default, false, null, null, null, (Function0) objRememberedValue2, 15, null);
            Arrangement arrangement = Arrangement.INSTANCE;
            Arrangement.Vertical top = arrangement.getTop();
            Alignment.Companion companion2 = Alignment.INSTANCE;
            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(top, companion2.getStart(), composerStartRestartGroup, 0);
            long currentCompositeKeyHashCode = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
            int i3 = (int) (currentCompositeKeyHashCode ^ (currentCompositeKeyHashCode >>> 32));
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierM299clickableoSLSa3U$default);
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
            Updater.m3923setimpl(composerM3915constructorimpl, modifierMaterializeModifier, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion3, composerM3915constructorimpl, Integer.valueOf(i3), composerM3915constructorimpl));
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
            ChaloSpacersKt.o(composerStartRestartGroup, 0);
            Modifier.Companion companion4 = Modifier.INSTANCE;
            Modifier modifierFillMaxWidth$default2 = SizeKt.fillMaxWidth$default(companion4, 0.0f, 1, null);
            MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(arrangement.getSpaceBetween(), companion2.getCenterVertically(), composerStartRestartGroup, 54);
            long currentCompositeKeyHashCode2 = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
            int i4 = (int) (currentCompositeKeyHashCode2 ^ (currentCompositeKeyHashCode2 >>> 32));
            CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierFillMaxWidth$default2);
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
            pk0.v(companion3, composerM3915constructorimpl2, measurePolicyRowMeasurePolicy, composerM3915constructorimpl2, currentCompositionLocalMap2);
            Updater.m3923setimpl(composerM3915constructorimpl2, modifierMaterializeModifier2, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion3, composerM3915constructorimpl2, Integer.valueOf(i4), composerM3915constructorimpl2));
            RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
            TextKt.m2623TextNvy7gAk(str, i41.a(rowScopeInstance, companion4, 1.0f, false, 2, null), ChaloTheme.a(composerStartRestartGroup, 0).t0, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ChaloTheme.e(composerStartRestartGroup, 0).getBodySmall(), composerStartRestartGroup, (i2 >> 3) & 14, 0, 131064);
            IconKt.m2070Iconww6aTOc(PainterResourceHelperKt.a(IconType.IC_ARROW_UP, composerStartRestartGroup, 6), (String) null, GraphicsLayerModifierKt.m4770graphicsLayer_6ThJ44$default(companion4, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, ((Boolean) mutableState.getValue()).booleanValue() ? 0.0f : 180.0f, 0.0f, 0L, null, false, null, 0L, 0L, 0, 0, null, 524031, null), ChaloTheme.a(composerStartRestartGroup, 0).v0, composerStartRestartGroup, Painter.$stable | 48, 0);
            composerStartRestartGroup.endNode();
            ChaloSpacersKt.o(composerStartRestartGroup, 0);
            AnimatedVisibilityKt.AnimatedVisibility(columnScopeInstance, ((Boolean) mutableState.getValue()).booleanValue(), (Modifier) null, (EnterTransition) null, (ExitTransition) null, (String) null, ComposableLambdaKt.rememberComposableLambda(-139954133, true, new xj(str2, 7), composerStartRestartGroup, 54), composerStartRestartGroup, 1572870, 30);
            composer2 = composerStartRestartGroup;
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
            scopeUpdateScopeEndRestartGroup.updateScope(new hf(modifier, str, str2, i, 3));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void b(TextFormatAppModel textFormatAppModel, List list, boolean z, Density density, Composer composer, int i) {
        int i2;
        Composer composerStartRestartGroup = composer.startRestartGroup(-2118388064);
        int i3 = 2;
        int i4 = (i & 6) == 0 ? ((i & 8) == 0 ? composerStartRestartGroup.changed(textFormatAppModel) : composerStartRestartGroup.changedInstance(textFormatAppModel) ? 4 : 2) | i : i;
        if ((i & 48) == 0) {
            i4 |= composerStartRestartGroup.changedInstance(list) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i4 |= composerStartRestartGroup.changed(z) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i4 |= composerStartRestartGroup.changed(density) ? 2048 : 1024;
        }
        if (composerStartRestartGroup.shouldExecute((i4 & 1171) != 1170, i4 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-2118388064, i4, -1, "app.chalo.home.ui.regularbus.compose.FAQSectionUI (RegularBusScreenUI.kt:730)");
            }
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            Composer.Companion companion = Composer.INSTANCE;
            if (objRememberedValue == companion.getEmpty()) {
                objRememberedValue = gf.b(0, null, 2, null, composerStartRestartGroup);
            }
            MutableState mutableState = (MutableState) objRememberedValue;
            Modifier.Companion companion2 = Modifier.INSTANCE;
            Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(companion2, 0.0f, 1, null);
            boolean z2 = (i4 & 7168) == 2048;
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (z2 || objRememberedValue2 == companion.getEmpty()) {
                objRememberedValue2 = new p11(density, mutableState, i3);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            Modifier modifierOnGloballyPositioned = OnGloballyPositionedModifierKt.onGloballyPositioned(modifierFillMaxWidth$default, (Function1) objRememberedValue2);
            Alignment.Companion companion3 = Alignment.INSTANCE;
            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(companion3.getTopStart(), false);
            long currentCompositeKeyHashCode = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
            int i5 = (int) (currentCompositeKeyHashCode ^ (currentCompositeKeyHashCode >>> 32));
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierOnGloballyPositioned);
            ComposeUiNode.Companion companion4 = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor = companion4.getConstructor();
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
            pk0.v(companion4, composerM3915constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy, composerM3915constructorimpl, currentCompositionLocalMap);
            Updater.m3923setimpl(composerM3915constructorimpl, modifierMaterializeModifier, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion4, composerM3915constructorimpl, Integer.valueOf(i5), composerM3915constructorimpl));
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            if (z) {
                composerStartRestartGroup.startReplaceGroup(-262053330);
                ChaloSectionHighlightKt.a(boxScopeInstance, ((Dp) mutableState.getValue()).m7292unboximpl(), composerStartRestartGroup, 6);
            } else {
                composerStartRestartGroup.startReplaceGroup(-298348068);
            }
            composerStartRestartGroup.endReplaceGroup();
            Modifier modifierM785paddingVpY3zN4 = PaddingKt.m785paddingVpY3zN4(SizeKt.fillMaxWidth$default(PlotlineComposeWidgetKt.a(companion2, "PL_FAQ_Section"), 0.0f, 1, null), ChaloTheme.b(composerStartRestartGroup, 0).h, ChaloTheme.b(composerStartRestartGroup, 0).i);
            Arrangement arrangement = Arrangement.INSTANCE;
            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(arrangement.getTop(), companion3.getStart(), composerStartRestartGroup, 0);
            long currentCompositeKeyHashCode2 = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
            int i6 = (int) (currentCompositeKeyHashCode2 ^ (currentCompositeKeyHashCode2 >>> 32));
            CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierM785paddingVpY3zN4);
            Function0<ComposeUiNode> constructor2 = companion4.getConstructor();
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
            pk0.v(companion4, composerM3915constructorimpl2, measurePolicyColumnMeasurePolicy, composerM3915constructorimpl2, currentCompositionLocalMap2);
            Updater.m3923setimpl(composerM3915constructorimpl2, modifierMaterializeModifier2, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion4, composerM3915constructorimpl2, Integer.valueOf(i6), composerM3915constructorimpl2));
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
            if (textFormatAppModel == null) {
                composerStartRestartGroup.startReplaceGroup(-195215468);
                composerStartRestartGroup.endReplaceGroup();
                i2 = 0;
            } else {
                composerStartRestartGroup.startReplaceGroup(-195215467);
                Modifier modifierA = PlotlineComposeWidgetKt.a(companion2, "PL_FAQ_Section_Title");
                MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(arrangement.getStart(), companion3.getCenterVertically(), composerStartRestartGroup, 48);
                long currentCompositeKeyHashCode3 = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
                int i7 = (int) (currentCompositeKeyHashCode3 ^ (currentCompositeKeyHashCode3 >>> 32));
                CompositionLocalMap currentCompositionLocalMap3 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier3 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierA);
                Function0<ComposeUiNode> constructor3 = companion4.getConstructor();
                if (!(composerStartRestartGroup.getApplier() != null)) {
                    ComposablesKt.invalidApplier();
                }
                composerStartRestartGroup.startReusableNode();
                if (composerStartRestartGroup.getInserting()) {
                    composerStartRestartGroup.createNode(constructor3);
                } else {
                    composerStartRestartGroup.useNode();
                }
                Composer composerM3915constructorimpl3 = Updater.m3915constructorimpl(composerStartRestartGroup);
                pk0.v(companion4, composerM3915constructorimpl3, measurePolicyRowMeasurePolicy, composerM3915constructorimpl3, currentCompositionLocalMap3);
                Updater.m3923setimpl(composerM3915constructorimpl3, modifierMaterializeModifier3, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion4, composerM3915constructorimpl3, Integer.valueOf(i7), composerM3915constructorimpl3));
                RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
                int i8 = i4;
                i2 = 0;
                ImageKt.Image(PainterResourceHelperKt.a(IconType.HAVE_A_DOUBT_EMOJI, composerStartRestartGroup, 6), "", SizeKt.m828size3ABfNKs(companion2, ChaloTheme.b(composerStartRestartGroup, 0).k), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composerStartRestartGroup, Painter.$stable | 48, 120);
                ChaloSpacersKt.w(composerStartRestartGroup, 0);
                TextStyle textStyleA = ChaloTypographyKt.a(ChaloTypographyKt.f(ChaloTheme.e(composerStartRestartGroup, 0)));
                TextFormatAppModel.Companion companion5 = TextFormatAppModel.INSTANCE;
                ChaloWidgetCardKt.f(textFormatAppModel, null, textStyleA, 0L, 0L, 0L, composerStartRestartGroup, i8 & 14, 58);
                composerStartRestartGroup.endNode();
                ChaloSpacersKt.t(composerStartRestartGroup, 0);
                composerStartRestartGroup.endReplaceGroup();
            }
            composerStartRestartGroup.startReplaceGroup(-1945935310);
            int i9 = i2;
            for (Object obj : list) {
                int i10 = i9 + 1;
                if (i9 < 0) {
                    CollectionsKt.z0();
                    throw null;
                }
                FAQAppModel fAQAppModel = (FAQAppModel) obj;
                Modifier.Companion companion6 = Modifier.INSTANCE;
                a(i2, composerStartRestartGroup, hq0.c("PL_FAQ_Section_Item_", i9, companion6), fAQAppModel.b, fAQAppModel.f3731a);
                if (i9 != CollectionsKt.K(list)) {
                    composerStartRestartGroup.startReplaceGroup(163917431);
                    SpacerKt.Spacer(BackgroundKt.m264backgroundbw27NRU$default(SizeKt.fillMaxWidth$default(SizeKt.m814height3ABfNKs(companion6, ChaloTheme.b(composerStartRestartGroup, i2).b), 0.0f, 1, null), ChaloTheme.a(composerStartRestartGroup, i2).s0, null, 2, null), composerStartRestartGroup, i2);
                } else {
                    composerStartRestartGroup.startReplaceGroup(126163709);
                }
                composerStartRestartGroup.endReplaceGroup();
                i9 = i10;
            }
            composerStartRestartGroup.endReplaceGroup();
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
            scopeUpdateScopeEndRestartGroup.updateScope(new lh(textFormatAppModel, list, z, density, i, 12));
        }
    }

    public static final void c(List list, MutableState mutableState, Composer composer, int i) {
        int i2;
        Composer composerStartRestartGroup = composer.startRestartGroup(948073573);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(list) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changed(mutableState) ? 32 : 16;
        }
        if (composerStartRestartGroup.shouldExecute((i2 & 19) != 18, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(948073573, i2, -1, "app.chalo.home.ui.regularbus.compose.MeasureItemHeights (RegularBusScreenUI.kt:1455)");
            }
            boolean zChangedInstance = composerStartRestartGroup.changedInstance(list) | ((i2 & 112) == 32);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new th(list, mutableState, 1);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            SubcomposeLayoutKt.SubcomposeLayout(null, (Function2) objRememberedValue, composerStartRestartGroup, 0, 1);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new uh(list, mutableState, i, 1));
        }
    }

    public static final void d(List list, Density density, final Function1 function1, Composer composer, int i) {
        Function1 function2;
        Function1 function3;
        int i2;
        byte b;
        int i3;
        int i4;
        Arrangement arrangement;
        RegularBusPageDisplayItemData regularBusPageDisplayItemData;
        int i5;
        int i6;
        Object obj;
        final RegularBusPageDisplayItemData regularBusPageDisplayItemData2;
        int i7;
        int i8;
        RegularBusPageDisplayItemData regularBusPageDisplayItemData3;
        int i9;
        char c;
        Function1 function4 = function1;
        Composer composerStartRestartGroup = composer.startRestartGroup(-166831628);
        int i10 = (i & 6) == 0 ? (composerStartRestartGroup.changedInstance(list) ? 4 : 2) | i : i;
        if ((i & 48) == 0) {
            i10 |= composerStartRestartGroup.changed(density) ? 32 : 16;
        }
        int i11 = 256;
        if ((i & 384) == 0) {
            i10 |= composerStartRestartGroup.changedInstance(function4) ? 256 : 128;
        }
        int i12 = 0;
        if (composerStartRestartGroup.shouldExecute((i10 & 147) != 146, i10 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-166831628, i10, -1, "app.chalo.home.ui.regularbus.compose.ProductPurchaseSectionsUI (RegularBusScreenUI.kt:1151)");
            }
            if (list == null) {
                composerStartRestartGroup.startReplaceGroup(-803167520);
                composerStartRestartGroup.endReplaceGroup();
                function2 = function4;
            } else {
                composerStartRestartGroup.startReplaceGroup(-803167519);
                Iterator it = list.iterator();
                int i13 = 0;
                while (it.hasNext()) {
                    Object next = it.next();
                    int i14 = i13 + 1;
                    if (i13 < 0) {
                        CollectionsKt.z0();
                        throw null;
                    }
                    RegularBusPageDisplayItemData regularBusPageDisplayItemData4 = (RegularBusPageDisplayItemData) next;
                    RegularBusPageFeature regularBusPageFeature = regularBusPageDisplayItemData4.g;
                    String str = regularBusPageDisplayItemData4.b;
                    switch (regularBusPageFeature == null ? -1 : WhenMappings.f3669a[regularBusPageFeature.ordinal()]) {
                        case 4:
                            function3 = function4;
                            i2 = i11;
                            b = -1;
                            composerStartRestartGroup.startReplaceGroup(1548463016);
                            if (str == null) {
                                composerStartRestartGroup.startReplaceGroup(1548463015);
                            } else {
                                composerStartRestartGroup.startReplaceGroup(1548463016);
                                PlotlineWidgetToResolveWhiteBackgroundIssueForiOSInHomeScreenTabsKt.a(6, composerStartRestartGroup, Modifier.INSTANCE, str);
                            }
                            composerStartRestartGroup.endReplaceGroup();
                            composerStartRestartGroup.endReplaceGroup();
                            i3 = 0;
                            ChaloSpacersKt.p(composerStartRestartGroup, i3);
                            function4 = function3;
                            i12 = i3;
                            i11 = i2;
                            i13 = i14;
                            it = it;
                            break;
                        case 5:
                        default:
                            composerStartRestartGroup.startReplaceGroup(1548976624);
                            composerStartRestartGroup.endReplaceGroup();
                            it = it;
                            function3 = function4;
                            i2 = i11;
                            i3 = i12;
                            b = -1;
                            ChaloSpacersKt.p(composerStartRestartGroup, i3);
                            function4 = function3;
                            i12 = i3;
                            i11 = i2;
                            i13 = i14;
                            it = it;
                            break;
                        case 6:
                            function3 = function4;
                            int i15 = i13;
                            b = -1;
                            composerStartRestartGroup.startReplaceGroup(1532483198);
                            i2 = 256;
                            boolean zChangedInstance = ((i10 & 896) == 256) | composerStartRestartGroup.changedInstance(regularBusPageDisplayItemData4) | composerStartRestartGroup.changed(i15);
                            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
                            if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue = new n11(function3, regularBusPageDisplayItemData4, i15, 1);
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            }
                            PayForTicketComposableKt.a(regularBusPageDisplayItemData4, (Function0) objRememberedValue, composerStartRestartGroup, 0);
                            composerStartRestartGroup.endReplaceGroup();
                            i3 = 0;
                            ChaloSpacersKt.p(composerStartRestartGroup, i3);
                            function4 = function3;
                            i12 = i3;
                            i11 = i2;
                            i13 = i14;
                            it = it;
                            break;
                        case 7:
                            it = it;
                            function3 = function4;
                            b = -1;
                            composerStartRestartGroup.startReplaceGroup(1533153604);
                            ChaloRoundedCardKt.b(PaddingKt.m786paddingVpY3zN4$default(PlotlineComposeWidgetKt.a(Modifier.INSTANCE, "PL_Chalo_Card"), ChaloTheme.b(composerStartRestartGroup, 0).h, 0.0f, 2, null), null, 0.0f, 0.0f, ComposableLambdaKt.rememberComposableLambda(-302980752, true, new pz0(i13, regularBusPageDisplayItemData4, function3), composerStartRestartGroup, 54), composerStartRestartGroup, 24576, 14);
                            composerStartRestartGroup.endReplaceGroup();
                            i3 = 0;
                            i2 = 256;
                            ChaloSpacersKt.p(composerStartRestartGroup, i3);
                            function4 = function3;
                            i12 = i3;
                            i11 = i2;
                            i13 = i14;
                            it = it;
                            break;
                        case 8:
                            it = it;
                            int i16 = i12;
                            b = -1;
                            composerStartRestartGroup.startReplaceGroup(1536955754);
                            Modifier.Companion companion = Modifier.INSTANCE;
                            Arrangement arrangement2 = Arrangement.INSTANCE;
                            Arrangement.Vertical top = arrangement2.getTop();
                            Alignment.Companion companion2 = Alignment.INSTANCE;
                            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(top, companion2.getStart(), composerStartRestartGroup, i16);
                            long currentCompositeKeyHashCode = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, i16);
                            int i17 = (int) (currentCompositeKeyHashCode ^ (currentCompositeKeyHashCode >>> 32));
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
                            pk0.v(companion3, composerM3915constructorimpl, measurePolicyColumnMeasurePolicy, composerM3915constructorimpl, currentCompositionLocalMap);
                            Updater.m3923setimpl(composerM3915constructorimpl, modifierMaterializeModifier, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion3, composerM3915constructorimpl, Integer.valueOf(i17), composerM3915constructorimpl));
                            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
                            final int i18 = i13;
                            TextFormatAppModel textFormatAppModel = regularBusPageDisplayItemData4.c;
                            if (textFormatAppModel == null) {
                                composerStartRestartGroup.startReplaceGroup(1421748545);
                                composerStartRestartGroup.endReplaceGroup();
                                i5 = i16;
                                arrangement = arrangement2;
                                regularBusPageDisplayItemData = regularBusPageDisplayItemData4;
                                i4 = 2;
                            } else {
                                composerStartRestartGroup.startReplaceGroup(1421748546);
                                TextStyle textStyleA = ChaloTypographyKt.a(ChaloTheme.e(composerStartRestartGroup, i16).getDisplaySmall());
                                float f = ChaloTheme.b(composerStartRestartGroup, i16).h;
                                i4 = 2;
                                Modifier modifierM786paddingVpY3zN4$default = PaddingKt.m786paddingVpY3zN4$default(companion, f, 0.0f, 2, null);
                                TextFormatAppModel.Companion companion4 = TextFormatAppModel.INSTANCE;
                                Composer composer2 = composerStartRestartGroup;
                                arrangement = arrangement2;
                                regularBusPageDisplayItemData = regularBusPageDisplayItemData4;
                                ChaloWidgetCardKt.f(textFormatAppModel, modifierM786paddingVpY3zN4$default, textStyleA, 0L, 0L, 0L, composer2, 0, 56);
                                composerStartRestartGroup = composer2;
                                composerStartRestartGroup.endReplaceGroup();
                                i5 = 0;
                            }
                            ChaloSpacersKt.p(composerStartRestartGroup, i5);
                            composerStartRestartGroup.startReplaceGroup(-231210464);
                            List<RegularBusProductItemData> list2 = regularBusPageDisplayItemData.n;
                            int size = list2.size();
                            if (size == 1) {
                                RegularBusPageDisplayItemData regularBusPageDisplayItemData5 = regularBusPageDisplayItemData;
                                i6 = 1;
                                obj = null;
                                composerStartRestartGroup.startReplaceGroup(-1697689868);
                                final RegularBusProductItemData regularBusProductItemData = (RegularBusProductItemData) list2.get(0);
                                Modifier modifierM786paddingVpY3zN4$default2 = PaddingKt.m786paddingVpY3zN4$default(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), ChaloTheme.b(composerStartRestartGroup, 0).h, 0.0f, 2, null);
                                MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(companion2.getTopStart(), false);
                                long currentCompositeKeyHashCode2 = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
                                int i19 = (int) ((currentCompositeKeyHashCode2 >>> 32) ^ currentCompositeKeyHashCode2);
                                CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                                Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierM786paddingVpY3zN4$default2);
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
                                Updater.m3923setimpl(composerM3915constructorimpl2, modifierMaterializeModifier2, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion3, composerM3915constructorimpl2, Integer.valueOf(i19), composerM3915constructorimpl2));
                                BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                                Modifier modifierC = hq0.c("PL_Pass_Product_", i18, companion);
                                MutableInteractionSource mutableInteractionSourceB = RippleEffectKt.b(composerStartRestartGroup);
                                IndicationNodeFactory indicationNodeFactoryA = RippleEffectKt.a(composerStartRestartGroup);
                                regularBusPageDisplayItemData2 = regularBusPageDisplayItemData5;
                                boolean zChangedInstance2 = composerStartRestartGroup.changedInstance(regularBusPageDisplayItemData2) | ((i10 & 896) == 256) | composerStartRestartGroup.changedInstance(regularBusProductItemData) | composerStartRestartGroup.changed(i18);
                                Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                                if (zChangedInstance2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                                    final int i20 = 0;
                                    objRememberedValue2 = new Function0() { // from class: u11
                                        @Override // kotlin.jvm.functions.Function0
                                        public final Object invoke() {
                                            switch (i20) {
                                                case 0:
                                                    function1.invoke(new RegularBusViewIntent.RegularBusPageItemClickedIntent(regularBusPageDisplayItemData2.g, regularBusProductItemData, null, i18, null, null, null, AppInfoTableDecoder.APPLICATION_INFORMATION_TABLE_ID));
                                                    break;
                                                default:
                                                    function1.invoke(new RegularBusViewIntent.RegularBusPageItemClickedIntent(regularBusPageDisplayItemData2.g, regularBusProductItemData, null, i18, null, null, null, AppInfoTableDecoder.APPLICATION_INFORMATION_TABLE_ID));
                                                    break;
                                            }
                                            return Unit.f17538a;
                                        }
                                    };
                                    function3 = function1;
                                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                                } else {
                                    function3 = function1;
                                }
                                Modifier modifierM295clickableO2vRcR0$default = ClickableKt.m295clickableO2vRcR0$default(modifierC, mutableInteractionSourceB, indicationNodeFactoryA, false, null, null, (Function0) objRememberedValue2, 28, null);
                                GridWidgetCardData gridWidgetCardData = regularBusProductItemData.f3633a;
                                String str2 = gridWidgetCardData.b;
                                long jA = ChaloColorToken_androidKt.a(Color.INSTANCE, gridWidgetCardData.d, Color.INSTANCE.m4640getTransparent0d7_KjU());
                                GridWidgetCardData gridWidgetCardData2 = regularBusProductItemData.f3633a;
                                GridWidgetItemData gridWidgetItemData = gridWidgetCardData2.f2348a;
                                Composer composer3 = composerStartRestartGroup;
                                ChaloWidgetCardKt.b(modifierM295clickableO2vRcR0$default, Color.m4595boximpl(jA), str2, gridWidgetItemData.c, gridWidgetItemData.f2349a, gridWidgetItemData.b, gridWidgetCardData2.c, composer3, 4096);
                                composerStartRestartGroup = composer3;
                                composerStartRestartGroup.endNode();
                                composerStartRestartGroup.endReplaceGroup();
                            } else if (size != i4) {
                                composerStartRestartGroup.startReplaceGroup(-1692414164);
                                Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                                Composer.Companion companion5 = Composer.INSTANCE;
                                if (objRememberedValue3 == companion5.getEmpty()) {
                                    i8 = 0;
                                    objRememberedValue3 = SnapshotIntStateKt.mutableIntStateOf(0);
                                    composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                                } else {
                                    i8 = 0;
                                }
                                MutableIntState mutableIntState = (MutableIntState) objRememberedValue3;
                                c(list2, mutableIntState, composerStartRestartGroup, 48);
                                Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(BackgroundKt.m264backgroundbw27NRU$default(companion, ChaloTheme.a(composerStartRestartGroup, i8).Z, null, 2, null), 0.0f, 1, null);
                                boolean zChangedInstance3 = composerStartRestartGroup.changedInstance(list2) | ((i10 & 896) == 256) | composerStartRestartGroup.changedInstance(regularBusPageDisplayItemData) | ((i10 & 112) == 32);
                                Object objRememberedValue4 = composerStartRestartGroup.rememberedValue();
                                if (zChangedInstance3 || objRememberedValue4 == companion5.getEmpty()) {
                                    RegularBusPageDisplayItemData regularBusPageDisplayItemData6 = regularBusPageDisplayItemData;
                                    o3 o3Var = new o3(list2, function1, (Object) regularBusPageDisplayItemData6, density, mutableIntState, 11);
                                    regularBusPageDisplayItemData3 = regularBusPageDisplayItemData6;
                                    composerStartRestartGroup.updateRememberedValue(o3Var);
                                    objRememberedValue4 = o3Var;
                                } else {
                                    regularBusPageDisplayItemData3 = regularBusPageDisplayItemData;
                                }
                                Composer composer4 = composerStartRestartGroup;
                                i6 = 1;
                                obj = null;
                                LazyDslKt.LazyRow(modifierFillMaxWidth$default, null, null, false, null, null, null, false, null, (Function1) objRememberedValue4, composer4, 0, TypedValues.PositionType.TYPE_POSITION_TYPE);
                                composerStartRestartGroup = composer4;
                                composerStartRestartGroup.endReplaceGroup();
                                regularBusPageDisplayItemData2 = regularBusPageDisplayItemData3;
                                function3 = function1;
                            } else {
                                final RegularBusPageDisplayItemData regularBusPageDisplayItemData7 = regularBusPageDisplayItemData;
                                i6 = 1;
                                obj = null;
                                composerStartRestartGroup.startReplaceGroup(-1695467850);
                                Object objRememberedValue5 = composerStartRestartGroup.rememberedValue();
                                if (objRememberedValue5 == Composer.INSTANCE.getEmpty()) {
                                    i7 = 0;
                                    objRememberedValue5 = SnapshotIntStateKt.mutableIntStateOf(0);
                                    composerStartRestartGroup.updateRememberedValue(objRememberedValue5);
                                } else {
                                    i7 = 0;
                                }
                                MutableIntState mutableIntState2 = (MutableIntState) objRememberedValue5;
                                c(list2, mutableIntState2, composerStartRestartGroup, 48);
                                Modifier modifierM786paddingVpY3zN4$default3 = PaddingKt.m786paddingVpY3zN4$default(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), ChaloTheme.b(composerStartRestartGroup, i7).h, 0.0f, 2, null);
                                MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(arrangement.m672spacedBy0680j_4(ChaloTheme.b(composerStartRestartGroup, i7).h), companion2.getTop(), composerStartRestartGroup, i7);
                                long currentCompositeKeyHashCode3 = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, i7);
                                int i21 = (int) (currentCompositeKeyHashCode3 ^ (currentCompositeKeyHashCode3 >>> 32));
                                CompositionLocalMap currentCompositionLocalMap3 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                                Modifier modifierMaterializeModifier3 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierM786paddingVpY3zN4$default3);
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
                                pk0.v(companion3, composerM3915constructorimpl3, measurePolicyRowMeasurePolicy, composerM3915constructorimpl3, currentCompositionLocalMap3);
                                Updater.m3923setimpl(composerM3915constructorimpl3, modifierMaterializeModifier3, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion3, composerM3915constructorimpl3, Integer.valueOf(i21), composerM3915constructorimpl3));
                                RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
                                composerStartRestartGroup.startReplaceGroup(743514393);
                                for (final RegularBusProductItemData regularBusProductItemData2 : list2) {
                                    Modifier.Companion companion6 = Modifier.INSTANCE;
                                    Modifier modifierA = i41.a(rowScopeInstance, companion6, 1.0f, false, 2, null);
                                    MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy2 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
                                    long currentCompositeKeyHashCode4 = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
                                    int i22 = (int) (currentCompositeKeyHashCode4 ^ (currentCompositeKeyHashCode4 >>> 32));
                                    CompositionLocalMap currentCompositionLocalMap4 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                                    Modifier modifierMaterializeModifier4 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierA);
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
                                    pk0.v(companion7, composerM3915constructorimpl4, measurePolicyMaybeCachedBoxMeasurePolicy2, composerM3915constructorimpl4, currentCompositionLocalMap4);
                                    Updater.m3923setimpl(composerM3915constructorimpl4, modifierMaterializeModifier4, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion7, composerM3915constructorimpl4, Integer.valueOf(i22), composerM3915constructorimpl4));
                                    BoxScopeInstance boxScopeInstance2 = BoxScopeInstance.INSTANCE;
                                    final int i23 = i18;
                                    Modifier modifierC2 = hq0.c("PL_Pass_Product_", i23, companion6);
                                    MutableInteractionSource mutableInteractionSourceB2 = RippleEffectKt.b(composerStartRestartGroup);
                                    IndicationNodeFactory indicationNodeFactoryA2 = RippleEffectKt.a(composerStartRestartGroup);
                                    boolean zChangedInstance4 = ((i10 & 896) == 256) | composerStartRestartGroup.changedInstance(regularBusPageDisplayItemData7) | composerStartRestartGroup.changedInstance(regularBusProductItemData2) | composerStartRestartGroup.changed(i23);
                                    Object objRememberedValue6 = composerStartRestartGroup.rememberedValue();
                                    if (zChangedInstance4 || objRememberedValue6 == Composer.INSTANCE.getEmpty()) {
                                        final int i24 = 1;
                                        Function0 function0 = new Function0() { // from class: u11
                                            @Override // kotlin.jvm.functions.Function0
                                            public final Object invoke() {
                                                switch (i24) {
                                                    case 0:
                                                        function1.invoke(new RegularBusViewIntent.RegularBusPageItemClickedIntent(regularBusPageDisplayItemData7.g, regularBusProductItemData2, null, i23, null, null, null, AppInfoTableDecoder.APPLICATION_INFORMATION_TABLE_ID));
                                                        break;
                                                    default:
                                                        function1.invoke(new RegularBusViewIntent.RegularBusPageItemClickedIntent(regularBusPageDisplayItemData7.g, regularBusProductItemData2, null, i23, null, null, null, AppInfoTableDecoder.APPLICATION_INFORMATION_TABLE_ID));
                                                        break;
                                                }
                                                return Unit.f17538a;
                                            }
                                        };
                                        composerStartRestartGroup.updateRememberedValue(function0);
                                        objRememberedValue6 = function0;
                                    }
                                    Modifier modifierM814height3ABfNKs = SizeKt.m814height3ABfNKs(ClickableKt.m295clickableO2vRcR0$default(modifierC2, mutableInteractionSourceB2, indicationNodeFactoryA2, false, null, null, (Function0) objRememberedValue6, 28, null), Dp.m7276boximpl(density.mo401toDpu2uoSUM(mutableIntState2.getIntValue())).m7292unboximpl());
                                    GridWidgetCardData gridWidgetCardData3 = regularBusProductItemData2.f3633a;
                                    RegularBusPageDisplayItemData regularBusPageDisplayItemData8 = regularBusPageDisplayItemData7;
                                    String str3 = gridWidgetCardData3.b;
                                    long jA2 = ChaloColorToken_androidKt.a(Color.INSTANCE, gridWidgetCardData3.d, Color.INSTANCE.m4640getTransparent0d7_KjU());
                                    GridWidgetCardData gridWidgetCardData4 = regularBusProductItemData2.f3633a;
                                    GridWidgetItemData gridWidgetItemData2 = gridWidgetCardData4.f2348a;
                                    i18 = i23;
                                    ChaloWidgetCardKt.c(modifierM814height3ABfNKs, Color.m4595boximpl(jA2), str3, gridWidgetItemData2.c, gridWidgetItemData2.f2349a, gridWidgetItemData2.b, gridWidgetCardData4.c, false, composerStartRestartGroup, 4096, 128);
                                    composerStartRestartGroup.endNode();
                                    mutableIntState2 = mutableIntState2;
                                    regularBusPageDisplayItemData7 = regularBusPageDisplayItemData8;
                                }
                                composerStartRestartGroup.endReplaceGroup();
                                composerStartRestartGroup.endNode();
                                composerStartRestartGroup.endReplaceGroup();
                                function3 = function1;
                                regularBusPageDisplayItemData2 = regularBusPageDisplayItemData7;
                            }
                            composerStartRestartGroup.endReplaceGroup();
                            ChaloSpacersKt.p(composerStartRestartGroup, 0);
                            String str4 = regularBusPageDisplayItemData2.i;
                            if (str4 == null) {
                                composerStartRestartGroup.startReplaceGroup(1430699826);
                            } else {
                                composerStartRestartGroup.startReplaceGroup(1430699827);
                                int i25 = WhenMappings.c[regularBusPageDisplayItemData2.k.ordinal()];
                                if (i25 == i6 || i25 == 2) {
                                    composerStartRestartGroup.startReplaceGroup(-1855039767);
                                    Painter painterA = PainterResourceHelperKt.a(IconType.IC_ARROW_UP, composerStartRestartGroup, 6);
                                    Modifier modifierM786paddingVpY3zN4$default4 = PaddingKt.m786paddingVpY3zN4$default(PlotlineComposeWidgetKt.a(Modifier.INSTANCE, "PL_Passes_Section_Cta"), ChaloTheme.b(composerStartRestartGroup, 0).h, 0.0f, 2, obj);
                                    int i26 = (i10 & 896) == 256 ? i6 : 0;
                                    Object objRememberedValue7 = composerStartRestartGroup.rememberedValue();
                                    if (i26 != 0 || objRememberedValue7 == Composer.INSTANCE.getEmpty()) {
                                        objRememberedValue7 = new t11(function3, 2);
                                        composerStartRestartGroup.updateRememberedValue(objRememberedValue7);
                                    }
                                    Composer composer5 = composerStartRestartGroup;
                                    ChaloFilledButtonKt.c(str4, modifierM786paddingVpY3zN4$default4, null, painterA, 0L, 0L, 0.0f, (Function0) objRememberedValue7, composer5, Painter.$stable << 9, AppInfoTableDecoder.APPLICATION_INFORMATION_TABLE_ID);
                                    composerStartRestartGroup = composer5;
                                    composerStartRestartGroup.endReplaceGroup();
                                } else {
                                    if (i25 != 3) {
                                        throw pk0.p(composerStartRestartGroup, 1602722978);
                                    }
                                    composerStartRestartGroup.startReplaceGroup(-1854262876);
                                    Modifier modifierM786paddingVpY3zN4$default5 = PaddingKt.m786paddingVpY3zN4$default(PlotlineComposeWidgetKt.a(Modifier.INSTANCE, "PL_Passes_Section_Cta"), ChaloTheme.b(composerStartRestartGroup, 0).h, 0.0f, 2, obj);
                                    int i27 = (i10 & 896) == 256 ? i6 : 0;
                                    Object objRememberedValue8 = composerStartRestartGroup.rememberedValue();
                                    if (i27 != 0 || objRememberedValue8 == Composer.INSTANCE.getEmpty()) {
                                        objRememberedValue8 = new t11(function3, i6);
                                        composerStartRestartGroup.updateRememberedValue(objRememberedValue8);
                                    }
                                    Composer composer6 = composerStartRestartGroup;
                                    ChaloFilledButtonKt.g(modifierM786paddingVpY3zN4$default5, str4, null, 0L, null, false, 0.0f, null, 0L, (Function0) objRememberedValue8, composer6, 0, TypedValues.PositionType.TYPE_CURVE_FIT);
                                    composerStartRestartGroup = composer6;
                                    composerStartRestartGroup.endReplaceGroup();
                                }
                            }
                            composerStartRestartGroup.endReplaceGroup();
                            composerStartRestartGroup.endNode();
                            composerStartRestartGroup.endReplaceGroup();
                            i3 = 0;
                            i2 = 256;
                            ChaloSpacersKt.p(composerStartRestartGroup, i3);
                            function4 = function3;
                            i12 = i3;
                            i11 = i2;
                            i13 = i14;
                            it = it;
                            break;
                        case 9:
                            composerStartRestartGroup.startReplaceGroup(1547327052);
                            ImageResourceSectionAppModel imageResourceSectionAppModel = regularBusPageDisplayItemData4.q;
                            if (imageResourceSectionAppModel == null) {
                                composerStartRestartGroup.startReplaceGroup(1547327051);
                                composerStartRestartGroup.endReplaceGroup();
                                i9 = i12;
                                c = ' ';
                                b = -1;
                            } else {
                                composerStartRestartGroup.startReplaceGroup(1547327052);
                                float fM7278constructorimpl = Dp.m7278constructorimpl(i12);
                                ImageResourceSurface imageResourceSurface = ImageResourceSurface.CARD;
                                Modifier modifierA2 = PlotlineComposeWidgetKt.a(Modifier.INSTANCE, "PL_Regular_Page_Quick_Payment_Image_Resource");
                                boolean zChangedInstance5 = ((i10 & 896) == i11) | composerStartRestartGroup.changedInstance(regularBusPageDisplayItemData4) | composerStartRestartGroup.changedInstance(imageResourceSectionAppModel) | composerStartRestartGroup.changed(i13);
                                Object objRememberedValue9 = composerStartRestartGroup.rememberedValue();
                                if (zChangedInstance5 || objRememberedValue9 == Composer.INSTANCE.getEmpty()) {
                                    objRememberedValue9 = new o11(function4, regularBusPageDisplayItemData4, imageResourceSectionAppModel, i13);
                                    composerStartRestartGroup.updateRememberedValue(objRememberedValue9);
                                }
                                ImageResourceSectionAppModel.Companion companion8 = ImageResourceSectionAppModel.INSTANCE;
                                i9 = 0;
                                c = ' ';
                                b = -1;
                                ImageResourceSectionUIKt.a(imageResourceSectionAppModel, false, fM7278constructorimpl, (Function0) objRememberedValue9, imageResourceSurface, modifierA2, composerStartRestartGroup, 25008, 0);
                                composerStartRestartGroup.endReplaceGroup();
                            }
                            composerStartRestartGroup.endReplaceGroup();
                            i3 = i9;
                            function3 = function4;
                            i2 = 256;
                            ChaloSpacersKt.p(composerStartRestartGroup, i3);
                            function4 = function3;
                            i12 = i3;
                            i11 = i2;
                            i13 = i14;
                            it = it;
                            break;
                    }
                }
                function2 = function4;
                composerStartRestartGroup.endReplaceGroup();
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            function2 = function4;
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new h01(i, 5, list, density, function2));
        }
    }

    public static final void e(List list, Function1 function1, Composer composer, int i) {
        int i2;
        String str;
        final int i3;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1327515253);
        int i4 = (i & 6) == 0 ? (composerStartRestartGroup.changedInstance(list) ? 4 : 2) | i : i;
        char c = ' ';
        if ((i & 48) == 0) {
            i4 |= composerStartRestartGroup.changedInstance(function1) ? 32 : 16;
        }
        if (composerStartRestartGroup.shouldExecute((i4 & 19) != 18, i4 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1327515253, i4, -1, "app.chalo.home.ui.regularbus.compose.ProductPurchaseSectionsUpdatedUI (RegularBusScreenUI.kt:895)");
            }
            float f = ChaloTheme.b(composerStartRestartGroup, 0).h;
            float f2 = ChaloTheme.b(composerStartRestartGroup, 0).h;
            ArrayList arrayList = new ArrayList();
            for (Object obj : list) {
                RegularBusPageFeature regularBusPageFeature = ((RegularBusPageDisplayItemData) obj).g;
                if (regularBusPageFeature == RegularBusPageFeature.PAY_FOR_TICKET || regularBusPageFeature == RegularBusPageFeature.CHALO_CARD || regularBusPageFeature == RegularBusPageFeature.METRO || regularBusPageFeature == RegularBusPageFeature.PASSES) {
                    arrayList.add(obj);
                }
            }
            ArrayList arrayList2 = new ArrayList();
            ArrayList arrayList3 = new ArrayList();
            int size = arrayList.size();
            int i5 = 0;
            while (i5 < size) {
                Object obj2 = arrayList.get(i5);
                i5++;
                RegularBusPageDisplayItemData regularBusPageDisplayItemData = (RegularBusPageDisplayItemData) obj2;
                if (regularBusPageDisplayItemData.u) {
                    if (!arrayList3.isEmpty()) {
                        arrayList2.add(arrayList3);
                    }
                    arrayList3 = new ArrayList();
                    arrayList2.add(CollectionsKt.R(regularBusPageDisplayItemData));
                } else {
                    arrayList3.add(regularBusPageDisplayItemData);
                    if (arrayList3.size() == 2) {
                        arrayList2.add(arrayList3);
                        arrayList3 = new ArrayList();
                    }
                }
            }
            if (!arrayList3.isEmpty()) {
                arrayList2.add(arrayList3);
            }
            boolean zChangedInstance = ((i4 & 112) == 32) | composerStartRestartGroup.changedInstance(list);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                i2 = 1;
                objRememberedValue = new iu0(i2, list, function1);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            } else {
                i2 = 1;
            }
            final Function1 function2 = (Function1) objRememberedValue;
            float f3 = 0.0f;
            String str2 = null;
            Modifier modifierM788paddingqDBjuR0$default = PaddingKt.m788paddingqDBjuR0$default(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, i2, null), ChaloTheme.b(composerStartRestartGroup, 0).h, 0.0f, ChaloTheme.b(composerStartRestartGroup, 0).h, ChaloTheme.b(composerStartRestartGroup, 0).h, 2, null);
            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.m672spacedBy0680j_4(f), Alignment.INSTANCE.getStart(), composerStartRestartGroup, 0);
            long currentCompositeKeyHashCode = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
            int i6 = (int) (currentCompositeKeyHashCode ^ (currentCompositeKeyHashCode >>> 32));
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierM788paddingqDBjuR0$default);
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
            Updater.m3923setimpl(composerM3915constructorimpl, modifierMaterializeModifier, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion, composerM3915constructorimpl, Integer.valueOf(i6), composerM3915constructorimpl));
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
            composerStartRestartGroup.startReplaceGroup(-2098211070);
            int size2 = arrayList2.size();
            int i7 = 0;
            while (i7 < size2) {
                int i8 = i7 + 1;
                List<RegularBusPageDisplayItemData> list2 = (List) arrayList2.get(i7);
                Modifier modifierHeight = IntrinsicKt.height(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, f3, 1, str2), IntrinsicSize.Max);
                MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.m672spacedBy0680j_4(f2), Alignment.INSTANCE.getTop(), composerStartRestartGroup, 0);
                long currentCompositeKeyHashCode2 = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
                int i9 = (int) (currentCompositeKeyHashCode2 ^ (currentCompositeKeyHashCode2 >>> c));
                CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierHeight);
                ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
                char c2 = c;
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
                composerStartRestartGroup.startReplaceGroup(1868865653);
                for (final RegularBusPageDisplayItemData regularBusPageDisplayItemData2 : list2) {
                    if (list2.size() == 1) {
                        composerStartRestartGroup.startReplaceGroup(-777243347);
                        TextFormatAppModel textFormatAppModel = regularBusPageDisplayItemData2.c;
                        String strA = textFormatAppModel != null ? ChaloTextDataKt.a(textFormatAppModel) : str2;
                        String str3 = regularBusPageDisplayItemData2.d;
                        String str4 = regularBusPageDisplayItemData2.o;
                        IconType iconType = regularBusPageDisplayItemData2.p;
                        if (iconType == null) {
                            iconType = regularBusPageDisplayItemData2.f;
                        }
                        String str5 = strA;
                        Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(Modifier.INSTANCE, f3, 1, str2);
                        MutableInteractionSource mutableInteractionSourceB = RippleEffectKt.b(composerStartRestartGroup);
                        IndicationNodeFactory indicationNodeFactoryA = RippleEffectKt.a(composerStartRestartGroup);
                        boolean zChanged = composerStartRestartGroup.changed(function2) | composerStartRestartGroup.changedInstance(regularBusPageDisplayItemData2);
                        Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                        if (zChanged || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                            final int i10 = 0;
                            objRememberedValue2 = new Function0() { // from class: s11
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    switch (i10) {
                                        case 0:
                                            function2.invoke(regularBusPageDisplayItemData2);
                                            break;
                                        default:
                                            function2.invoke(regularBusPageDisplayItemData2);
                                            break;
                                    }
                                    return Unit.f17538a;
                                }
                            };
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                        }
                        str = str2;
                        m(str5, str3, str4, iconType, ClickableKt.m295clickableO2vRcR0$default(modifierFillMaxWidth$default, mutableInteractionSourceB, indicationNodeFactoryA, false, null, null, (Function0) objRememberedValue2, 28, null), composerStartRestartGroup, 0);
                        composerStartRestartGroup.endReplaceGroup();
                    } else {
                        str = str2;
                        composerStartRestartGroup.startReplaceGroup(-776403774);
                        Modifier.Companion companion3 = Modifier.INSTANCE;
                        Modifier modifierA = i41.a(rowScopeInstance, SizeKt.fillMaxHeight$default(companion3, f3, 1, str), 1.0f, false, 2, null);
                        MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
                        long currentCompositeKeyHashCode3 = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
                        int i11 = (int) (currentCompositeKeyHashCode3 ^ (currentCompositeKeyHashCode3 >>> c2));
                        CompositionLocalMap currentCompositionLocalMap3 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                        Modifier modifierMaterializeModifier3 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierA);
                        ComposeUiNode.Companion companion4 = ComposeUiNode.INSTANCE;
                        Function0<ComposeUiNode> constructor3 = companion4.getConstructor();
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
                        pk0.v(companion4, composerM3915constructorimpl3, measurePolicyMaybeCachedBoxMeasurePolicy, composerM3915constructorimpl3, currentCompositionLocalMap3);
                        Updater.m3923setimpl(composerM3915constructorimpl3, modifierMaterializeModifier3, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion4, composerM3915constructorimpl3, Integer.valueOf(i11), composerM3915constructorimpl3));
                        BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                        TextFormatAppModel textFormatAppModel2 = regularBusPageDisplayItemData2.c;
                        String strA2 = textFormatAppModel2 != null ? ChaloTextDataKt.a(textFormatAppModel2) : str;
                        String str6 = regularBusPageDisplayItemData2.d;
                        String str7 = strA2;
                        String str8 = regularBusPageDisplayItemData2.o;
                        IconType iconType2 = regularBusPageDisplayItemData2.p;
                        if (iconType2 == null) {
                            iconType2 = regularBusPageDisplayItemData2.f;
                        }
                        f3 = 0.0f;
                        Modifier modifierFillMaxHeight$default = SizeKt.fillMaxHeight$default(companion3, 0.0f, 1, str);
                        MutableInteractionSource mutableInteractionSourceB2 = RippleEffectKt.b(composerStartRestartGroup);
                        IndicationNodeFactory indicationNodeFactoryA2 = RippleEffectKt.a(composerStartRestartGroup);
                        boolean zChanged2 = composerStartRestartGroup.changed(function2) | composerStartRestartGroup.changedInstance(regularBusPageDisplayItemData2);
                        Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                        if (zChanged2 || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                            i3 = 1;
                            objRememberedValue3 = new Function0() { // from class: s11
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    switch (i3) {
                                        case 0:
                                            function2.invoke(regularBusPageDisplayItemData2);
                                            break;
                                        default:
                                            function2.invoke(regularBusPageDisplayItemData2);
                                            break;
                                    }
                                    return Unit.f17538a;
                                }
                            };
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                        } else {
                            i3 = 1;
                        }
                        n(str7, str6, str8, iconType2, ClickableKt.m295clickableO2vRcR0$default(modifierFillMaxHeight$default, mutableInteractionSourceB2, indicationNodeFactoryA2, false, null, null, (Function0) objRememberedValue3, 28, null), composerStartRestartGroup, 0);
                        composerStartRestartGroup.endNode();
                        composerStartRestartGroup.endReplaceGroup();
                    }
                    str2 = str;
                    f2 = f2;
                    size2 = size2;
                }
                composerStartRestartGroup.endReplaceGroup();
                composerStartRestartGroup.endNode();
                i7 = i8;
                c = c2;
                size2 = size2;
            }
            if (b3.t(composerStartRestartGroup)) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new kh(i, 3, list, function1));
        }
    }

    public static final void f(Function1 function1, String str, List list, Density density, boolean z, Composer composer, int i) {
        int i2;
        Composer composerStartRestartGroup = composer.startRestartGroup(-2114626765);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(function1) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changed(str) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(list) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= composerStartRestartGroup.changed(density) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= composerStartRestartGroup.changed(z) ? 16384 : 8192;
        }
        if (composerStartRestartGroup.shouldExecute((i2 & 9363) != 9362, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-2114626765, i2, -1, "app.chalo.home.ui.regularbus.compose.ProductPurchaseUI (RegularBusScreenUI.kt:844)");
            }
            Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(BackgroundKt.m264backgroundbw27NRU$default(Modifier.INSTANCE, ChaloTheme.a(composerStartRestartGroup, 0).Z, null, 2, null), 0.0f, 1, null);
            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composerStartRestartGroup, 0);
            long currentCompositeKeyHashCode = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
            int i3 = (int) (currentCompositeKeyHashCode ^ (currentCompositeKeyHashCode >>> 32));
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
            Updater.m3923setimpl(composerM3915constructorimpl, modifierMaterializeModifier, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion, composerM3915constructorimpl, Integer.valueOf(i3), composerM3915constructorimpl));
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
            if (str == null) {
                composerStartRestartGroup.startReplaceGroup(475288355);
            } else {
                composerStartRestartGroup.startReplaceGroup(475288356);
                ChaloTabTitleKt.a(composerStartRestartGroup, 0, str);
            }
            composerStartRestartGroup.endReplaceGroup();
            ChaloSpacersKt.p(composerStartRestartGroup, 0);
            if (z) {
                composerStartRestartGroup.startReplaceGroup(475391679);
                e(list == null ? EmptyList.f17557a : list, function1, composerStartRestartGroup, (i2 << 3) & 112);
                composerStartRestartGroup.endReplaceGroup();
            } else {
                composerStartRestartGroup.startReplaceGroup(475563109);
                d(list, density, function1, composerStartRestartGroup, ((i2 >> 6) & WebSocketProtocol.PAYLOAD_SHORT) | ((i2 << 6) & 896));
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
            scopeUpdateScopeEndRestartGroup.updateScope(new ma(function1, str, list, density, z, i));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v16 */
    /* JADX WARN: Type inference failed for: r8v17, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r8v21 */
    public static final void g(Function1 function1, RegularBusViewState regularBusViewState, TextFormatAppModel textFormatAppModel, boolean z, Density density, Composer composer, int i) {
        int i2;
        ?? r8;
        int i3;
        Composer composerStartRestartGroup = composer.startRestartGroup(987153670);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(function1) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(regularBusViewState) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= (i & 512) == 0 ? composerStartRestartGroup.changed(textFormatAppModel) : composerStartRestartGroup.changedInstance(textFormatAppModel) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= composerStartRestartGroup.changed(z) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= composerStartRestartGroup.changed(density) ? 16384 : 8192;
        }
        int i4 = 1;
        if (composerStartRestartGroup.shouldExecute((i2 & 9363) != 9362, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(987153670, i2, -1, "app.chalo.home.ui.regularbus.compose.RegularBusMap (RegularBusScreenUI.kt:1583)");
            }
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            Composer.Companion companion = Composer.INSTANCE;
            int i5 = i2;
            if (objRememberedValue == companion.getEmpty()) {
                objRememberedValue = gf.b(0, null, 2, null, composerStartRestartGroup);
            }
            MutableState mutableState = (MutableState) objRememberedValue;
            Modifier.Companion companion2 = Modifier.INSTANCE;
            Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(companion2, 0.0f, 1, null);
            boolean z2 = (i5 & 57344) == 16384;
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (z2 || objRememberedValue2 == companion.getEmpty()) {
                objRememberedValue2 = new p11(density, mutableState, i4);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            Modifier modifierOnGloballyPositioned = OnGloballyPositionedModifierKt.onGloballyPositioned(modifierFillMaxWidth$default, (Function1) objRememberedValue2);
            Alignment.Companion companion3 = Alignment.INSTANCE;
            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(companion3.getTopStart(), false);
            long currentCompositeKeyHashCode = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
            int i6 = (int) (currentCompositeKeyHashCode ^ (currentCompositeKeyHashCode >>> 32));
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierOnGloballyPositioned);
            ComposeUiNode.Companion companion4 = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor = companion4.getConstructor();
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
            pk0.v(companion4, composerM3915constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy, composerM3915constructorimpl, currentCompositionLocalMap);
            Updater.m3923setimpl(composerM3915constructorimpl, modifierMaterializeModifier, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion4, composerM3915constructorimpl, Integer.valueOf(i6), composerM3915constructorimpl));
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            if (z) {
                composerStartRestartGroup.startReplaceGroup(-204718712);
                ChaloSectionHighlightKt.a(boxScopeInstance, ((Dp) mutableState.getValue()).m7292unboximpl(), composerStartRestartGroup, 6);
            } else {
                composerStartRestartGroup.startReplaceGroup(-277277994);
            }
            composerStartRestartGroup.endReplaceGroup();
            Modifier modifierM785paddingVpY3zN4 = PaddingKt.m785paddingVpY3zN4(SizeKt.fillMaxWidth$default(PlotlineComposeWidgetKt.a(companion2, "PL_Nearby_Bus_Map_Section"), 0.0f, 1, null), ChaloTheme.b(composerStartRestartGroup, 0).h, ChaloTheme.b(composerStartRestartGroup, 0).i);
            Alignment.Horizontal centerHorizontally = companion3.getCenterHorizontally();
            Arrangement arrangement = Arrangement.INSTANCE;
            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(arrangement.getTop(), centerHorizontally, composerStartRestartGroup, 48);
            long currentCompositeKeyHashCode2 = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
            int i7 = (int) (currentCompositeKeyHashCode2 ^ (currentCompositeKeyHashCode2 >>> 32));
            CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierM785paddingVpY3zN4);
            Function0<ComposeUiNode> constructor2 = companion4.getConstructor();
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
            pk0.v(companion4, composerM3915constructorimpl2, measurePolicyColumnMeasurePolicy, composerM3915constructorimpl2, currentCompositionLocalMap2);
            Updater.m3923setimpl(composerM3915constructorimpl2, modifierMaterializeModifier2, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion4, composerM3915constructorimpl2, Integer.valueOf(i7), composerM3915constructorimpl2));
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
            Modifier modifierFillMaxWidth$default2 = SizeKt.fillMaxWidth$default(companion2, 0.0f, 1, null);
            MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(arrangement.getStart(), companion3.getCenterVertically(), composerStartRestartGroup, 48);
            long currentCompositeKeyHashCode3 = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
            int i8 = (int) (currentCompositeKeyHashCode3 ^ (currentCompositeKeyHashCode3 >>> 32));
            CompositionLocalMap currentCompositionLocalMap3 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier3 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierFillMaxWidth$default2);
            Function0<ComposeUiNode> constructor3 = companion4.getConstructor();
            if (!(composerStartRestartGroup.getApplier() != null)) {
                ComposablesKt.invalidApplier();
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.createNode(constructor3);
            } else {
                composerStartRestartGroup.useNode();
            }
            Composer composerM3915constructorimpl3 = Updater.m3915constructorimpl(composerStartRestartGroup);
            pk0.v(companion4, composerM3915constructorimpl3, measurePolicyRowMeasurePolicy, composerM3915constructorimpl3, currentCompositionLocalMap3);
            Updater.m3923setimpl(composerM3915constructorimpl3, modifierMaterializeModifier3, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion4, composerM3915constructorimpl3, Integer.valueOf(i8), composerM3915constructorimpl3));
            RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
            if (textFormatAppModel != null) {
                composerStartRestartGroup.startReplaceGroup(1978287698);
                Modifier modifierA = PlotlineComposeWidgetKt.a(companion2, "PL_Nearby_Bus_Map_Section_Title");
                TextStyle textStyleA = ChaloTypographyKt.a(ChaloTheme.e(composerStartRestartGroup, 0).getDisplaySmall());
                TextFormatAppModel.Companion companion5 = TextFormatAppModel.INSTANCE;
                i3 = 0;
                ChaloWidgetCardKt.f(textFormatAppModel, modifierA, textStyleA, 0L, 0L, 0L, composerStartRestartGroup, (i5 >> 6) & 14, 56);
                composerStartRestartGroup = composerStartRestartGroup;
                composerStartRestartGroup.endReplaceGroup();
                r8 = 1;
            } else {
                r8 = 1;
                i3 = 0;
                composerStartRestartGroup.startReplaceGroup(1978566419);
                TextKt.m2623TextNvy7gAk(StringResourcesHelperKt.c(StringEnum.BUSES_AROUND_YOU, new Object[0], composerStartRestartGroup, 6), PlotlineComposeWidgetKt.a(companion2, "PL_Nearby_Bus_Map_Section_Title"), 0L, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ChaloTypographyKt.a(ChaloTheme.e(composerStartRestartGroup, 0).getDisplaySmall()), composerStartRestartGroup, 0, 0, 131068);
                composerStartRestartGroup.endReplaceGroup();
            }
            ChaloSpacersKt.x(composerStartRestartGroup, i3);
            ChaloTabTitleKt.e(null, i3, composerStartRestartGroup, r8);
            composerStartRestartGroup.endNode();
            ChaloSpacersKt.q(composerStartRestartGroup, i3);
            ChaloRoundedCardKt.b(null, null, 0.0f, 0.0f, ComposableLambdaKt.rememberComposableLambda(328875169, r8, new fu0(15, regularBusViewState, function1), composerStartRestartGroup, 54), composerStartRestartGroup, 24576, 15);
            if (r1.k(composerStartRestartGroup)) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new ma(function1, regularBusViewState, textFormatAppModel, z, density, i, 6));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void h(Modifier modifier, NearbyStopAndTripsUiModel nearbyStopAndTripsUiModel, String str, String str2, TextFormatAppModel textFormatAppModel, Function1 function1, boolean z, Density density, Composer composer, int i) {
        int i2;
        TextFormatAppModel textFormatAppModel2;
        String str3;
        int i3;
        int i4;
        String strC;
        Composer composerStartRestartGroup = composer.startRestartGroup(1922001349);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changed(modifier) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changed(nearbyStopAndTripsUiModel) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= composerStartRestartGroup.changed(str) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= composerStartRestartGroup.changed(str2) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= (32768 & i) == 0 ? composerStartRestartGroup.changed(textFormatAppModel) : composerStartRestartGroup.changedInstance(textFormatAppModel) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(function1) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            i2 |= composerStartRestartGroup.changed(z) ? 1048576 : 524288;
        }
        if ((12582912 & i) == 0) {
            i2 |= composerStartRestartGroup.changed(density) ? 8388608 : 4194304;
        }
        if (composerStartRestartGroup.shouldExecute((4793491 & i2) != 4793490, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1922001349, i2, -1, "app.chalo.home.ui.regularbus.compose.RegularBusNearbyTripsCard (RegularBusScreenUI.kt:1489)");
            }
            int i5 = i2 & 112;
            boolean z2 = i5 == 32;
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (z2 || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = SnapshotStateKt.derivedStateOf(new q11(nearbyStopAndTripsUiModel, 0));
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            State state = (State) objRememberedValue;
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            Composer.Companion companion = Composer.INSTANCE;
            if (objRememberedValue2 == companion.getEmpty()) {
                objRememberedValue2 = gf.b(0, null, 2, null, composerStartRestartGroup);
            }
            MutableState mutableState = (MutableState) objRememberedValue2;
            Modifier.Companion companion2 = Modifier.INSTANCE;
            int i6 = i2;
            Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(PlotlineComposeWidgetKt.a(companion2, "PL_Nearby_Trips_Section"), 0.0f, 1, null);
            boolean z3 = (i6 & 29360128) == 8388608;
            Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
            int i7 = 3;
            if (z3 || objRememberedValue3 == companion.getEmpty()) {
                objRememberedValue3 = new p11(density, mutableState, i7);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
            }
            Modifier modifierOnGloballyPositioned = OnGloballyPositionedModifierKt.onGloballyPositioned(modifierFillMaxWidth$default, (Function1) objRememberedValue3);
            Alignment.Companion companion3 = Alignment.INSTANCE;
            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(companion3.getTopStart(), false);
            long currentCompositeKeyHashCode = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
            int i8 = (int) (currentCompositeKeyHashCode ^ (currentCompositeKeyHashCode >>> 32));
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierOnGloballyPositioned);
            ComposeUiNode.Companion companion4 = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor = companion4.getConstructor();
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
            pk0.v(companion4, composerM3915constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy, composerM3915constructorimpl, currentCompositionLocalMap);
            Updater.m3923setimpl(composerM3915constructorimpl, modifierMaterializeModifier, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion4, composerM3915constructorimpl, Integer.valueOf(i8), composerM3915constructorimpl));
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            if (z) {
                composerStartRestartGroup.startReplaceGroup(-558401483);
                ChaloSectionHighlightKt.a(boxScopeInstance, ((Dp) mutableState.getValue()).m7292unboximpl(), composerStartRestartGroup, 6);
            } else {
                composerStartRestartGroup.startReplaceGroup(-627762557);
            }
            composerStartRestartGroup.endReplaceGroup();
            Modifier modifierM785paddingVpY3zN4 = PaddingKt.m785paddingVpY3zN4(SizeKt.fillMaxWidth$default(modifier, 0.0f, 1, null), ChaloTheme.b(composerStartRestartGroup, 0).h, ChaloTheme.b(composerStartRestartGroup, 0).i);
            Arrangement arrangement = Arrangement.INSTANCE;
            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(arrangement.getTop(), companion3.getStart(), composerStartRestartGroup, 0);
            long currentCompositeKeyHashCode2 = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
            int i9 = (int) (currentCompositeKeyHashCode2 ^ (currentCompositeKeyHashCode2 >>> 32));
            CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierM785paddingVpY3zN4);
            Function0<ComposeUiNode> constructor2 = companion4.getConstructor();
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
            pk0.v(companion4, composerM3915constructorimpl2, measurePolicyColumnMeasurePolicy, composerM3915constructorimpl2, currentCompositionLocalMap2);
            Updater.m3923setimpl(composerM3915constructorimpl2, modifierMaterializeModifier2, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion4, composerM3915constructorimpl2, Integer.valueOf(i9), composerM3915constructorimpl2));
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
            Modifier modifierFillMaxWidth$default2 = SizeKt.fillMaxWidth$default(companion2, 0.0f, 1, null);
            MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(arrangement.getSpaceBetween(), companion3.getCenterVertically(), composerStartRestartGroup, 54);
            long currentCompositeKeyHashCode3 = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
            int i10 = (int) (currentCompositeKeyHashCode3 ^ (currentCompositeKeyHashCode3 >>> 32));
            CompositionLocalMap currentCompositionLocalMap3 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier3 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierFillMaxWidth$default2);
            Function0<ComposeUiNode> constructor3 = companion4.getConstructor();
            if (!(composerStartRestartGroup.getApplier() != null)) {
                ComposablesKt.invalidApplier();
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.createNode(constructor3);
            } else {
                composerStartRestartGroup.useNode();
            }
            Composer composerM3915constructorimpl3 = Updater.m3915constructorimpl(composerStartRestartGroup);
            pk0.v(companion4, composerM3915constructorimpl3, measurePolicyRowMeasurePolicy, composerM3915constructorimpl3, currentCompositionLocalMap3);
            Updater.m3923setimpl(composerM3915constructorimpl3, modifierMaterializeModifier3, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion4, composerM3915constructorimpl3, Integer.valueOf(i10), composerM3915constructorimpl3));
            RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
            TextStyle textStyleA = ChaloTypographyKt.a(ChaloTypographyKt.f(ChaloTheme.e(composerStartRestartGroup, 0)));
            Modifier modifierFillMaxWidth = SizeKt.fillMaxWidth(PlotlineComposeWidgetKt.a(companion2, "PL_Nearby_Trips_Section_Title"), 0.6f);
            if (textFormatAppModel == null) {
                composerStartRestartGroup.startReplaceGroup(-541984232);
                TextFormatAppModel.Simple simple = new TextFormatAppModel.Simple(StringResourcesHelperKt.c(StringEnum.NEAREST_BUS_STOP, new Object[0], composerStartRestartGroup, 6));
                composerStartRestartGroup.endReplaceGroup();
                textFormatAppModel2 = simple;
            } else {
                composerStartRestartGroup.startReplaceGroup(-541985317);
                composerStartRestartGroup.endReplaceGroup();
                textFormatAppModel2 = textFormatAppModel;
            }
            TextFormatAppModel.Companion companion5 = TextFormatAppModel.INSTANCE;
            ChaloWidgetCardKt.f(textFormatAppModel2, modifierFillMaxWidth, textStyleA, 0L, 0L, 0L, composerStartRestartGroup, 0, 56);
            ChaloSpacersKt.y(composerStartRestartGroup, 0);
            Modifier modifierWrapContentWidth$default = SizeKt.wrapContentWidth$default(PlotlineComposeWidgetKt.a(companion2, "PL_Nearby_Trips_Section_Title_Cta"), companion3.getEnd(), false, 2, null);
            if (str2 == null) {
                composerStartRestartGroup.startReplaceGroup(-541972371);
                String strC2 = StringResourcesHelperKt.c(StringEnum.SEE_ALL_STOPS, new Object[0], composerStartRestartGroup, 6);
                composerStartRestartGroup.endReplaceGroup();
                str3 = strC2;
            } else {
                composerStartRestartGroup.startReplaceGroup(-541972960);
                composerStartRestartGroup.endReplaceGroup();
                str3 = str2;
            }
            int i11 = i6 & 458752;
            boolean z4 = (i11 == 131072) | (i5 == 32);
            Object objRememberedValue4 = composerStartRestartGroup.rememberedValue();
            if (z4 || objRememberedValue4 == companion.getEmpty()) {
                i3 = 0;
                objRememberedValue4 = new r11(function1, nearbyStopAndTripsUiModel, 0);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
            } else {
                i3 = 0;
            }
            ChaloFilledButtonAndroidKt.a(str3, modifierWrapContentWidth$default, null, (Function0) objRememberedValue4, composerStartRestartGroup, 0);
            composerStartRestartGroup.endNode();
            ChaloSpacersKt.q(composerStartRestartGroup, i3);
            int i12 = i11 == 131072 ? 1 : i3;
            Object objRememberedValue5 = composerStartRestartGroup.rememberedValue();
            if (i12 != 0 || objRememberedValue5 == companion.getEmpty()) {
                i4 = 6;
                objRememberedValue5 = new s01(function1, i4);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue5);
            } else {
                i4 = 6;
            }
            Function1 function2 = (Function1) objRememberedValue5;
            int i13 = i11 == 131072 ? 1 : i3;
            Object objRememberedValue6 = composerStartRestartGroup.rememberedValue();
            int i14 = 14;
            if (i13 != 0 || objRememberedValue6 == companion.getEmpty()) {
                objRememberedValue6 = new xd(function1, i14);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue6);
            }
            int i15 = i4;
            RegularBusStopNearbyTripsCardKt.j(nearbyStopAndTripsUiModel, function2, (Function2) objRememberedValue6, null, composerStartRestartGroup, 14 & (i6 >> 3));
            ChaloSpacersKt.p(composerStartRestartGroup, 0);
            if (((Boolean) state.getValue()).booleanValue()) {
                composerStartRestartGroup.startReplaceGroup(-2069936188);
                Modifier modifierA = PlotlineComposeWidgetKt.a(companion2, "PL_Nearby_Trips_Section_Cta");
                if (str == null) {
                    composerStartRestartGroup.startReplaceGroup(1180158168);
                    strC = StringResourcesHelperKt.c(StringEnum.SEE_ALL_BUSES_NEARBY, new Object[0], composerStartRestartGroup, i15);
                    composerStartRestartGroup.endReplaceGroup();
                } else {
                    composerStartRestartGroup.startReplaceGroup(1180157734);
                    composerStartRestartGroup.endReplaceGroup();
                    strC = str;
                }
                Painter painterA = PainterResourceHelperKt.a(IconType.IC_ARROW_UP, composerStartRestartGroup, i15);
                boolean z5 = (i11 == 131072) | (i5 == 32);
                Object objRememberedValue7 = composerStartRestartGroup.rememberedValue();
                if (z5 || objRememberedValue7 == companion.getEmpty()) {
                    objRememberedValue7 = new r11(function1, nearbyStopAndTripsUiModel, 1);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue7);
                }
                ChaloFilledButtonKt.c(strC, modifierA, null, painterA, 0L, 0L, 0.0f, (Function0) objRememberedValue7, composerStartRestartGroup, Painter.$stable << 9, AppInfoTableDecoder.APPLICATION_INFORMATION_TABLE_ID);
            } else {
                composerStartRestartGroup.startReplaceGroup(-2141478887);
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
            scopeUpdateScopeEndRestartGroup.updateScope(new og(modifier, nearbyStopAndTripsUiModel, str, str2, textFormatAppModel, function1, z, density, i));
        }
    }

    /*  JADX ERROR: Type inference failed
        jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached with updateSeq = 41061. Try increasing type updates limit count.
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:79)
        */
    public static final void i(app.chalo.home.ui.regularbus.RegularBusViewState r56, kotlin.jvm.functions.Function1 r57, java.util.List r58, androidx.compose.runtime.Composer r59, int r60) {
        /*
            Method dump skipped, instruction units count: 4106
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: app.chalo.home.ui.regularbus.compose.RegularBusScreenUIKt.i(app.chalo.home.ui.regularbus.RegularBusViewState, kotlin.jvm.functions.Function1, java.util.List, androidx.compose.runtime.Composer, int):void");
    }

    /* JADX WARN: Code duplicated, block: B:60:0x01b0  */
    /* JADX WARN: Code duplicated, block: B:78:0x0231  */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void j(RegularBusViewState regularBusViewState, ScrollState scrollState, Function1 function1, Composer composer, int i) {
        int i2;
        Modifier.Companion companion;
        int i3;
        float f;
        Unit unit;
        TabMetaDataAppModel tabMetaDataAppModel;
        ChaloColorToken.Custom custom;
        boolean z;
        Unit unit2;
        Composer composerStartRestartGroup = composer.startRestartGroup(877598891);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(regularBusViewState) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changed(scrollState) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(function1) ? 256 : 128;
        }
        if (composerStartRestartGroup.shouldExecute((i2 & 147) != 146, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(877598891, i2, -1, "app.chalo.home.ui.regularbus.compose.RegularBusScreenContentUI (RegularBusScreenUI.kt:219)");
            }
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            Composer.Companion companion2 = Composer.INSTANCE;
            if (objRememberedValue == companion2.getEmpty()) {
                objRememberedValue = gf.b(0, null, 2, null, composerStartRestartGroup);
            }
            MutableState mutableState = (MutableState) objRememberedValue;
            Density density = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
            Modifier.Companion companion3 = Modifier.INSTANCE;
            Modifier modifierVerticalScroll$default = ScrollKt.verticalScroll$default(BackgroundKt.m264backgroundbw27NRU$default(SizeKt.fillMaxSize$default(companion3, 0.0f, 1, null), ChaloTheme.a(composerStartRestartGroup, 0).t, null, 2, null), scrollState, HomeOverscrollEffect_androidKt.a(composerStartRestartGroup), false, null, false, 28, null);
            boolean zChanged = composerStartRestartGroup.changed(density);
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (zChanged || objRememberedValue2 == companion2.getEmpty()) {
                objRememberedValue2 = new f0(density, mutableState, 27);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            Modifier modifierOnGloballyPositioned = OnGloballyPositionedModifierKt.onGloballyPositioned(modifierVerticalScroll$default, (Function1) objRememberedValue2);
            Alignment.Companion companion4 = Alignment.INSTANCE;
            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(companion4.getTopStart(), false);
            long currentCompositeKeyHashCode = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
            int i4 = (int) (currentCompositeKeyHashCode ^ (currentCompositeKeyHashCode >>> 32));
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierOnGloballyPositioned);
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
            pk0.v(companion5, composerM3915constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy, composerM3915constructorimpl, currentCompositionLocalMap);
            Updater.m3923setimpl(composerM3915constructorimpl, modifierMaterializeModifier, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion5, composerM3915constructorimpl, Integer.valueOf(i4), composerM3915constructorimpl));
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            TabMetaDataAppModel tabMetaDataAppModel2 = regularBusViewState.h;
            if (AnyExtsKt.a(tabMetaDataAppModel2.i)) {
                composerStartRestartGroup.startReplaceGroup(-358327027);
                String str = tabMetaDataAppModel2.i;
                ContentScale fit = ContentScale.INSTANCE.getFit();
                Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(companion3, 0.0f, 1, null);
                ComposableLambda composableLambdaRememberComposableLambda = ComposableLambdaKt.rememberComposableLambda(857607501, true, new rb(11, regularBusViewState, mutableState), composerStartRestartGroup, 54);
                tabMetaDataAppModel = tabMetaDataAppModel2;
                f = 0.0f;
                SingletonSubcomposeAsyncImageKt.a(str, null, modifierFillMaxWidth$default, null, null, composableLambdaRememberComposableLambda, null, null, null, fit, composerStartRestartGroup, 1573296, 48, 63416);
                composerStartRestartGroup = composerStartRestartGroup;
                composerStartRestartGroup.endReplaceGroup();
                companion = companion3;
                unit = null;
                i3 = 1;
            } else {
                companion = companion3;
                i3 = 1;
                f = 0.0f;
                unit = null;
                tabMetaDataAppModel = tabMetaDataAppModel2;
                composerStartRestartGroup.startReplaceGroup(-357639044);
                BgHighlightType bgHighlightType = tabMetaDataAppModel.f3814a;
                float fM7292unboximpl = ((Dp) mutableState.getValue()).m7292unboximpl();
                String str2 = tabMetaDataAppModel.b;
                if (str2 == null) {
                    custom = null;
                } else {
                    if (StringsKt.F(str2)) {
                        str2 = null;
                    }
                    if (str2 != null) {
                        custom = new ChaloColorToken.Custom(ChaloColorToken_androidKt.a(Color.INSTANCE, str2, Color.INSTANCE.m4640getTransparent0d7_KjU()));
                    } else {
                        custom = null;
                    }
                }
                ChaloGradientBackgroundKt.a(boxScopeInstance, bgHighlightType, fM7292unboximpl, custom, composerStartRestartGroup, 6, 0);
                composerStartRestartGroup.endReplaceGroup();
            }
            Modifier modifierFillMaxWidth$default2 = SizeKt.fillMaxWidth$default(companion, f, i3, unit);
            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), companion4.getStart(), composerStartRestartGroup, 0);
            long currentCompositeKeyHashCode2 = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
            int i5 = (int) (currentCompositeKeyHashCode2 ^ (currentCompositeKeyHashCode2 >>> 32));
            CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierFillMaxWidth$default2);
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
            Updater.m3923setimpl(composerM3915constructorimpl2, modifierMaterializeModifier2, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion5, composerM3915constructorimpl2, Integer.valueOf(i5), composerM3915constructorimpl2));
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
            TabMetaDataAppModel tabMetaDataAppModel3 = regularBusViewState.h;
            List list = regularBusViewState.c;
            Unit unit3 = unit;
            String str3 = regularBusViewState.i;
            boolean z2 = regularBusViewState.r;
            int i6 = i3;
            boolean z3 = !z2;
            if (z2) {
                z = 0;
            } else {
                LocationTooltipData locationTooltipData = regularBusViewState.m;
                if (locationTooltipData != null ? locationTooltipData.f2944a : false) {
                    z = i6;
                } else {
                    z = 0;
                }
            }
            ProfileDrawerCardData profileDrawerCardData = regularBusViewState.j;
            List list2 = regularBusViewState.g;
            RegularBusPageDisplayItemData regularBusPageDisplayItemData = regularBusViewState.q;
            int i7 = i2 & 896;
            int i8 = i7 == 256 ? i6 : 0;
            Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
            if (i8 != 0 || objRememberedValue3 == companion2.getEmpty()) {
                objRememberedValue3 = new lx0(function1, 23);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
            }
            Function0 function0 = (Function0) objRememberedValue3;
            int i9 = i7 == 256 ? i6 : 0;
            Object objRememberedValue4 = composerStartRestartGroup.rememberedValue();
            if (i9 != 0 || objRememberedValue4 == companion2.getEmpty()) {
                objRememberedValue4 = new lx0(function1, 24);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
            }
            Function0 function2 = (Function0) objRememberedValue4;
            int i10 = i7 == 256 ? i6 : 0;
            Object objRememberedValue5 = composerStartRestartGroup.rememberedValue();
            if (i10 != 0 || objRememberedValue5 == companion2.getEmpty()) {
                objRememberedValue5 = new lx0(function1, 25);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue5);
            }
            Function0 function3 = (Function0) objRememberedValue5;
            int i11 = i7 == 256 ? i6 : 0;
            Object objRememberedValue6 = composerStartRestartGroup.rememberedValue();
            int i12 = 3;
            if (i11 != 0 || objRememberedValue6 == companion2.getEmpty()) {
                objRememberedValue6 = new s01(function1, i12);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue6);
            }
            Function1 function4 = (Function1) objRememberedValue6;
            int i13 = (i7 == 256 ? i6 : 0) | (composerStartRestartGroup.changedInstance(regularBusViewState) ? 1 : 0);
            Object objRememberedValue7 = composerStartRestartGroup.rememberedValue();
            if (i13 != 0 || objRememberedValue7 == companion2.getEmpty()) {
                objRememberedValue7 = new m11(function1, regularBusViewState);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue7);
            }
            Function0 function5 = (Function0) objRememberedValue7;
            int i14 = i7 == 256 ? i6 : 0;
            Object objRememberedValue8 = composerStartRestartGroup.rememberedValue();
            int i15 = i2;
            if (i14 != 0 || objRememberedValue8 == companion2.getEmpty()) {
                objRememberedValue8 = new lx0(function1, 26);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue8);
            }
            Function0 function6 = (Function0) objRememberedValue8;
            int i16 = i7 == 256 ? i6 : 0;
            Object objRememberedValue9 = composerStartRestartGroup.rememberedValue();
            if (i16 != 0 || objRememberedValue9 == companion2.getEmpty()) {
                objRememberedValue9 = new xd(function1, 12);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue9);
            }
            Function2 function7 = (Function2) objRememberedValue9;
            int i17 = (i7 == 256 ? i6 : 0) | (composerStartRestartGroup.changedInstance(regularBusViewState) ? 1 : 0);
            Object objRememberedValue10 = composerStartRestartGroup.rememberedValue();
            if (i17 != 0 || objRememberedValue10 == companion2.getEmpty()) {
                objRememberedValue10 = new m11(regularBusViewState, function1);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue10);
            }
            Function0 function8 = (Function0) objRememberedValue10;
            int i18 = i7 == 256 ? i6 : 0;
            Object objRememberedValue11 = composerStartRestartGroup.rememberedValue();
            if (i18 != 0 || objRememberedValue11 == companion2.getEmpty()) {
                objRememberedValue11 = new xd(function1, 13);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue11);
            }
            TabMetaDataAppModel.Companion companion6 = TabMetaDataAppModel.INSTANCE;
            Composer composer2 = composerStartRestartGroup;
            Modifier.Companion companion7 = companion;
            TabHeaderKt.f(null, tabMetaDataAppModel3, function0, function2, function3, function4, function5, function6, str3, z3, profileDrawerCardData, z, function7, list2, regularBusPageDisplayItemData, function8, null, list, (Function2) objRememberedValue11, composer2, 64, 0, 65537);
            composerStartRestartGroup = composer2;
            Integer num = tabMetaDataAppModel.m;
            if (num == null) {
                composerStartRestartGroup.startReplaceGroup(1333501125);
                composerStartRestartGroup.endReplaceGroup();
                unit2 = unit3;
            } else {
                composerStartRestartGroup.startReplaceGroup(1333501126);
                SpacerKt.Spacer(SizeKt.m814height3ABfNKs(companion7, Dp.m7278constructorimpl(num.intValue())), composerStartRestartGroup, 0);
                composerStartRestartGroup.endReplaceGroup();
                unit2 = Unit.f17538a;
            }
            if (unit2 == null) {
                composerStartRestartGroup.startReplaceGroup(-1342454615);
                ChaloSpacersKt.o(composerStartRestartGroup, 0);
                composerStartRestartGroup.endReplaceGroup();
            } else {
                composerStartRestartGroup.startReplaceGroup(-1342458366);
                composerStartRestartGroup.endReplaceGroup();
            }
            List list3 = regularBusViewState.b;
            if (list3 == null) {
                composerStartRestartGroup.startReplaceGroup(1333659132);
            } else {
                composerStartRestartGroup.startReplaceGroup(1333659133);
                i(regularBusViewState, function1, list3, composerStartRestartGroup, (i15 & 14) | ((i15 >> 3) & 112));
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
            scopeUpdateScopeEndRestartGroup.updateScope(new h01(i, 2, regularBusViewState, scrollState, function1));
        }
    }

    public static final void k(RegularBusDialogType regularBusDialogType, Function1 function1, Composer composer, int i) {
        int i2;
        boolean z;
        Composer composerStartRestartGroup = composer.startRestartGroup(-603947608);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changed(regularBusDialogType) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(function1) ? 32 : 16;
        }
        if (composerStartRestartGroup.shouldExecute((i2 & 19) != 18, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-603947608, i2, -1, "app.chalo.home.ui.regularbus.compose.RegularBusScreenDialogHandler (RegularBusScreenUI.kt:1664)");
            }
            if (Intrinsics.d(regularBusDialogType, RegularBusDialogType.LocationPermissionRationale.f3631a)) {
                composerStartRestartGroup.startReplaceGroup(-584967068);
                String strC = StringResourcesHelperKt.c(StringEnum.LOCATION_PERMISSION_PROMPT, new Object[0], composerStartRestartGroup, 6);
                int i3 = i2 & 112;
                boolean z2 = i3 == 32;
                Object objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (z2 || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = new t11(function1, 5);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                Function0 function0 = (Function0) objRememberedValue;
                z = i3 == 32;
                Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                if (z || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue2 = new lx0(function1, 20);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                }
                PermissionsRationaleDialogKt.a(strC, function0, (Function0) objRememberedValue2, composerStartRestartGroup, 0);
                composerStartRestartGroup.endReplaceGroup();
            } else {
                if (!Intrinsics.d(regularBusDialogType, RegularBusDialogType.JuspayPermissionRationale.f3630a)) {
                    throw pk0.p(composerStartRestartGroup, -573061135);
                }
                composerStartRestartGroup.startReplaceGroup(-584441897);
                String strC2 = StringResourcesHelperKt.c(StringEnum.PHONE_SMS_PERMISSION_PROMPT, new Object[0], composerStartRestartGroup, 6);
                int i4 = i2 & 112;
                boolean z3 = i4 == 32;
                Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                if (z3 || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue3 = new lx0(function1, 21);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                }
                Function0 function2 = (Function0) objRememberedValue3;
                z = i4 == 32;
                Object objRememberedValue4 = composerStartRestartGroup.rememberedValue();
                if (z || objRememberedValue4 == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue4 = new lx0(function1, 22);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
                }
                PermissionsRationaleDialogKt.a(strC2, function2, (Function0) objRememberedValue4, composerStartRestartGroup, 0);
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
            scopeUpdateScopeEndRestartGroup.updateScope(new rx0(regularBusDialogType, function1, i, 15));
        }
    }

    /*  JADX ERROR: Types fix failed
        jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r16v0 ??, new type: boolean
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
    public static final void l(app.chalo.home.ui.regularbus.RegularBusViewState r17, kotlin.jvm.functions.Function1 r18, androidx.compose.material3.SheetState r19, androidx.compose.foundation.ScrollState r20, androidx.compose.runtime.Composer r21, int r22) {
        /*
            Method dump skipped, instruction units count: 414
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: app.chalo.home.ui.regularbus.compose.RegularBusScreenUIKt.l(app.chalo.home.ui.regularbus.RegularBusViewState, kotlin.jvm.functions.Function1, androidx.compose.material3.SheetState, androidx.compose.foundation.ScrollState, androidx.compose.runtime.Composer, int):void");
    }

    public static final void m(String str, String str2, String str3, IconType iconType, Modifier modifier, Composer composer, int i) {
        String str4;
        int i2;
        String str5;
        Composer composerStartRestartGroup = composer.startRestartGroup(1068389880);
        if ((i & 6) == 0) {
            str4 = str;
            i2 = (composerStartRestartGroup.changed(str4) ? 4 : 2) | i;
        } else {
            str4 = str;
            i2 = i;
        }
        if ((i & 48) == 0) {
            str5 = str2;
            i2 |= composerStartRestartGroup.changed(str5) ? 32 : 16;
        } else {
            str5 = str2;
        }
        if ((i & 384) == 0) {
            i2 |= composerStartRestartGroup.changed(str3) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= composerStartRestartGroup.changed(iconType == null ? -1 : iconType.ordinal()) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= composerStartRestartGroup.changed(modifier) ? 16384 : 8192;
        }
        if (composerStartRestartGroup.shouldExecute((i2 & 9363) != 9362, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1068389880, i2, -1, "app.chalo.home.ui.regularbus.compose.UpdatedProductHorizontalCard (RegularBusScreenUI.kt:1070)");
            }
            ChaloRoundedCardKt.b(Modifier.INSTANCE, ChaloTheme.d(composerStartRestartGroup, 0).g, 0.0f, 0.0f, ComposableLambdaKt.rememberComposableLambda(1932872953, true, new v11(modifier, str3, iconType, str4, str5), composerStartRestartGroup, 54), composerStartRestartGroup, 24582, 12);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new w11(str, str2, str3, iconType, modifier, i, 0));
        }
    }

    public static final void n(String str, String str2, String str3, IconType iconType, Modifier modifier, Composer composer, int i) {
        int i2;
        String str4;
        String str5;
        Composer composerStartRestartGroup = composer.startRestartGroup(-807750454);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changed(str) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            str4 = str2;
            i2 |= composerStartRestartGroup.changed(str4) ? 32 : 16;
        } else {
            str4 = str2;
        }
        if ((i & 384) == 0) {
            str5 = str3;
            i2 |= composerStartRestartGroup.changed(str5) ? 256 : 128;
        } else {
            str5 = str3;
        }
        if ((i & 3072) == 0) {
            i2 |= composerStartRestartGroup.changed(iconType == null ? -1 : iconType.ordinal()) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= composerStartRestartGroup.changed(modifier) ? 16384 : 8192;
        }
        if (composerStartRestartGroup.shouldExecute((i2 & 9363) != 9362, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-807750454, i2, -1, "app.chalo.home.ui.regularbus.compose.UpdatedProductVerticalCard (RegularBusScreenUI.kt:988)");
            }
            ChaloRoundedCardKt.b(Modifier.INSTANCE, ChaloTheme.d(composerStartRestartGroup, 0).g, 0.0f, 0.0f, ComposableLambdaKt.rememberComposableLambda(587560971, true, new v11(modifier, str, str4, str5, iconType), composerStartRestartGroup, 54), composerStartRestartGroup, 24582, 12);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new w11(str, str2, str3, iconType, modifier, i, 1));
        }
    }
}
