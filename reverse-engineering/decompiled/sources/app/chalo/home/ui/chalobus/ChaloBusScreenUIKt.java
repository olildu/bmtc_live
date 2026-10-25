package app.chalo.home.ui.chalobus;

import androidx.compose.animation.AnimatedContentKt;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.BorderKt;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.IndicationNodeFactory;
import androidx.compose.foundation.ScrollKt;
import androidx.compose.foundation.ScrollState;
import androidx.compose.foundation.interaction.InteractionSourceKt;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.BoxWithConstraintsKt;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.FlowLayoutKt;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.lazy.LazyDslKt;
import androidx.compose.foundation.pager.PagerKt;
import androidx.compose.foundation.pager.PagerState;
import androidx.compose.foundation.pager.PagerStateKt;
import androidx.compose.foundation.shape.RoundedCornerShape;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material3.CardDefaults;
import androidx.compose.material3.CardKt;
import androidx.compose.material3.IconKt;
import androidx.compose.material3.SheetState;
import androidx.compose.material3.TextKt;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableIntState;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotIntStateKt;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.snapshots.SnapshotStateMap;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.AlphaKt;
import androidx.compose.ui.draw.ClipKt;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.Shadow;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.graphics.drawscope.DrawStyle;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.layout.ContentScale;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.OnGloballyPositionedModifierKt;
import androidx.compose.ui.layout.SubcomposeLayoutKt;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.PlatformSpanStyle;
import androidx.compose.ui.text.SpanStyle;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontSynthesis;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.intl.LocaleList;
import androidx.compose.ui.text.style.BaselineShift;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.text.style.TextGeometricTransform;
import androidx.compose.ui.text.style.TextOverflow;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.TextUnitKt;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.profileinstaller.ProfileVerifier;
import app.chalo.compose.BackHandlerKt;
import app.chalo.compose.HomeOverscrollEffect_androidKt;
import app.chalo.compose.VerticalGridLinesWithGradiantBackgroundKt;
import app.chalo.compose.components.ChaloDotsIndicatorsKt;
import app.chalo.compose.components.ChaloLoadingDialogKt;
import app.chalo.compose.components.ChaloRoundedBottomSheetKt;
import app.chalo.compose.components.ChaloRoundedCardKt;
import app.chalo.compose.components.ChaloSectionHighlightKt;
import app.chalo.compose.components.ChaloSpacersKt;
import app.chalo.compose.components.ChaloWidgetCardKt;
import app.chalo.compose.components.PlotlineComposeWidgetKt;
import app.chalo.compose.components.RippleEffectKt;
import app.chalo.compose.components.buttons.ChaloFilledButtonAndroidKt;
import app.chalo.compose.components.buttons.ChaloFilledButtonKt;
import app.chalo.compose.components.shimmer.ShimmerEffectKt;
import app.chalo.compose.resources.LottieResourceHelperKt;
import app.chalo.compose.resources.PainterResourceHelperKt;
import app.chalo.compose.resources.StringResourcesHelperKt;
import app.chalo.compose.theme.ChaloPadding;
import app.chalo.compose.theme.ChaloTheme;
import app.chalo.compose.theme.ChaloThemeHelper;
import app.chalo.compose.theme.ChaloThemeKt;
import app.chalo.compose.theme.ChaloTypographyKt;
import app.chalo.compose.theme.UIShape;
import app.chalo.data.GridWidgetCardData;
import app.chalo.data.GridWidgetItemData;
import app.chalo.data.PassSavingFaqs;
import app.chalo.extensions.AnyExtsKt;
import app.chalo.extensions.StringExtsKt;
import app.chalo.home.ui.HomeTabScreensRetainedData;
import app.chalo.home.ui.chalobus.ChaloBusPassHistory;
import app.chalo.home.ui.chalobus.ChaloBusScreenUIKt;
import app.chalo.home.ui.chalobus.ChaloBusViewIntent;
import app.chalo.home.ui.chalobus.ComposableSingletons$ChaloBusScreenUIKt;
import app.chalo.home.ui.chalobus.ProductPurchaseNudgeDisplayInfo;
import app.chalo.home.ui.common.HomeScreenPlotlineTitleKt;
import app.chalo.premiumbus.compose.PricingEngineRuleExpiryBannerKt;
import app.chalo.premiumbus.compose.PricingEngineRuleExpiryBannerUIState;
import app.chalo.premiumbus.compose.ProductOfferBadgeKt;
import app.chalo.premiumbus.domain.PricingEngineRuleExpiryTickerDelegate;
import app.chalo.premiumbus.domain.PricingEngineRuleExpiryTickerDelegate$bannerFlow$$inlined$map$1;
import app.chalo.premiumbus.ui.slotselection.OfferTagUIState;
import app.chalo.premiumbus.ui.stopselection.PBStopSelectionScreenBottomSheetType;
import app.chalo.providers.ChaloCtaDisplayType;
import app.chalo.providers.iconassetprovider.IconType;
import app.chalo.providers.lottieassetprovider.LottieType;
import app.chalo.providers.stringprovider.StringEnum;
import app.chalo.uistate.base.ChaloColorToken;
import app.chalo.uistate.base.ChaloColorTokenKt;
import app.chalo.uistate.base.ChaloColorToken_androidKt;
import app.chalo.uistate.base.UiEventHandler;
import app.chalo.uistate.color.ColorGradiantUiState;
import app.chalo.uistate.image.ImageUISize;
import app.chalo.uistate.image.ImageUIState;
import app.chalo.uistate.image.UIContentScale;
import app.chalo.uistate.text.TextUIState;
import app.chalo.uistate.text.UIFontStyle;
import app.chalo.uistate.text.UIFontWeight;
import app.chalo.uistate.text.UITextAlign;
import app.chalo.uistate.text.UITextDecoration;
import app.chalo.uistate.text.UITextOverflow;
import app.chalo.uistate.text.UITextStyle;
import app.chalo.utils.PlatformFeature;
import coil3.compose.SingletonSubcomposeAsyncImageKt;
import defpackage.af;
import defpackage.ah;
import defpackage.b0;
import defpackage.b3;
import defpackage.bf;
import defpackage.f0;
import defpackage.fh;
import defpackage.g0;
import defpackage.g5;
import defpackage.gb;
import defpackage.gf;
import defpackage.hb;
import defpackage.i41;
import defpackage.kh;
import defpackage.l3;
import defpackage.lh;
import defpackage.n3;
import defpackage.nd;
import defpackage.nh;
import defpackage.o3;
import defpackage.ob;
import defpackage.ph;
import defpackage.pk0;
import defpackage.qg;
import defpackage.qh;
import defpackage.r1;
import defpackage.rh;
import defpackage.s4;
import defpackage.sh;
import defpackage.th;
import defpackage.u6;
import defpackage.uh;
import defpackage.vh;
import defpackage.z;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.EmptyList;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt__TransformKt$filterNotNull$$inlined$unsafeTransform$1;
import okhttp3.internal.ws.WebSocketProtocol;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004¨\u0006\n²\u0006\u000e\u0010\u0001\u001a\u00020\u00008\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010\u0003\u001a\u00020\u00028\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010\u0003\u001a\u00020\u00028\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010\u0005\u001a\u00020\u00048\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010\u0007\u001a\u0004\u0018\u00010\u00068\nX\u008a\u0084\u0002²\u0006\u000e\u0010\u0003\u001a\u00020\u00028\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010\b\u001a\u00020\u00048\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010\t\u001a\u00020\u00008\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010\t\u001a\u00020\u00008\n@\nX\u008a\u008e\u0002"}, d2 = {"Landroidx/compose/ui/unit/Dp;", "gridHeightInDp", "", "isPlotlineWidgetRendered", "", "maxCardHeightPx", "Lapp/chalo/premiumbus/compose/PricingEngineRuleExpiryBannerUIState;", "bannerState", "currentIndex", "passesSectionHtInDp", "home_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class ChaloBusScreenUIKt {

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f3256a;
        public static final /* synthetic */ int[] b;
        public static final /* synthetic */ int[] c;
        public static final /* synthetic */ int[] d;
        public static final /* synthetic */ int[] e;

        static {
            int[] iArr = new int[ProductPurchaseNudgeUiStatus.values().length];
            try {
                iArr[ProductPurchaseNudgeUiStatus.NONE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ProductPurchaseNudgeUiStatus.LOADING.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ProductPurchaseNudgeUiStatus.DEFAULT_NUDGE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[ProductPurchaseNudgeUiStatus.PRODUCT_PURCHASE_NUDGE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f3256a = iArr;
            int[] iArr2 = new int[ProductPurchaseNudgeInfoCtaType.values().length];
            try {
                iArr2[ProductPurchaseNudgeInfoCtaType.VIEW_ALL_PASSES.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[ProductPurchaseNudgeInfoCtaType.EXPLORE_CHALO_BUS_PASSES.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            b = iArr2;
            int[] iArr3 = new int[ChaloBusPageFeature.values().length];
            try {
                iArr3[ChaloBusPageFeature.CUSTOMER_SUPPORT.ordinal()] = 1;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr3[ChaloBusPageFeature.PASS_PURCHASE.ordinal()] = 2;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr3[ChaloBusPageFeature.TICKETS_PASSES.ordinal()] = 3;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr3[ChaloBusPageFeature.NEARBY_ROUTES.ordinal()] = 4;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr3[ChaloBusPageFeature.PLOTLINE_WIDGET.ordinal()] = 5;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr3[ChaloBusPageFeature.PRODUCT_PURCHASE.ordinal()] = 6;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr3[ChaloBusPageFeature.UNKNOWN.ordinal()] = 7;
            } catch (NoSuchFieldError unused13) {
            }
            c = iArr3;
            int[] iArr4 = new int[ChaloBusPageSectionDisplayType.values().length];
            try {
                iArr4[ChaloBusPageSectionDisplayType.PLOTLINE_WIDGET.ordinal()] = 1;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                iArr4[ChaloBusPageSectionDisplayType.DIVIDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                iArr4[ChaloBusPageSectionDisplayType.PRODUCT_PURCHASE.ordinal()] = 3;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                iArr4[ChaloBusPageSectionDisplayType.CARD.ordinal()] = 4;
            } catch (NoSuchFieldError unused17) {
            }
            d = iArr4;
            int[] iArr5 = new int[ChaloCtaDisplayType.values().length];
            try {
                iArr5[ChaloCtaDisplayType.UNKNOWN.ordinal()] = 1;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                iArr5[ChaloCtaDisplayType.ARROW.ordinal()] = 2;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                iArr5[ChaloCtaDisplayType.BUTTON.ordinal()] = 3;
            } catch (NoSuchFieldError unused20) {
            }
            e = iArr5;
        }
    }

    public static final void a(final ChaloBusPassHistory chaloBusPassHistory, Modifier modifier, final Function0 function0, Composer composer, int i) {
        int i2;
        Composer composer2;
        Composer composerStartRestartGroup = composer.startRestartGroup(-454364988);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changed(chaloBusPassHistory) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changed(modifier) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(function0) ? 256 : 128;
        }
        if (composerStartRestartGroup.shouldExecute((i2 & 147) != 146, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-454364988, i2, -1, "app.chalo.home.ui.chalobus.ChaloBusPassCard (ChaloBusScreenUI.kt:1505)");
            }
            final String str = chaloBusPassHistory.h;
            final String str2 = chaloBusPassHistory.i;
            float f = chaloBusPassHistory.k ? 0.5f : 1.0f;
            RoundedCornerShape roundedCornerShapeM1074RoundedCornerShape0680j_4 = RoundedCornerShapeKt.m1074RoundedCornerShape0680j_4(ChaloTheme.b(composerStartRestartGroup, 0).f);
            CardDefaults cardDefaults = CardDefaults.INSTANCE;
            float f2 = ChaloTheme.c(composerStartRestartGroup, 0).b;
            int i3 = CardDefaults.$stable;
            int i4 = i2;
            final float f3 = f;
            CardKt.Card(modifier, roundedCornerShapeM1074RoundedCornerShape0680j_4, cardDefaults.m1694cardColorsro_MJ88(ChaloTheme.a(composerStartRestartGroup, 0).N0, 0L, ChaloTheme.a(composerStartRestartGroup, 0).N0, 0L, composerStartRestartGroup, i3 << 12, 10), cardDefaults.m1695cardElevationaqJV_2Y(f2, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, composerStartRestartGroup, i3 << 18, 62), null, ComposableLambdaKt.rememberComposableLambda(598257426, true, new Function3() { // from class: wh
                /* JADX WARN: Code duplicated, block: B:46:0x020c  */
                @Override // kotlin.jvm.functions.Function3
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    String str3;
                    ColumnScope Card = (ColumnScope) obj;
                    Composer composer3 = (Composer) obj2;
                    int iIntValue = ((Integer) obj3).intValue();
                    Intrinsics.i(Card, "$this$Card");
                    if (composer3.shouldExecute((iIntValue & 17) != 16, iIntValue & 1)) {
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(598257426, iIntValue, -1, "app.chalo.home.ui.chalobus.ChaloBusPassCard.<anonymous> (ChaloBusScreenUI.kt:1519)");
                        }
                        Modifier.Companion companion = Modifier.INSTANCE;
                        Modifier modifierClip = ClipKt.clip(AlphaKt.alpha(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), f3), ChaloTheme.d(composer3, 0).g);
                        ChaloBusPassHistory chaloBusPassHistory2 = chaloBusPassHistory;
                        boolean z = chaloBusPassHistory2.k;
                        LottieType lottieType = chaloBusPassHistory2.o;
                        IconType iconType = chaloBusPassHistory2.m;
                        boolean z2 = !z;
                        Function0 function1 = function0;
                        boolean zChanged = composer3.changed(function1);
                        Object objRememberedValue = composer3.rememberedValue();
                        if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = new hb(function1, 17);
                            composer3.updateRememberedValue(objRememberedValue);
                        }
                        Modifier modifierM299clickableoSLSa3U$default = ClickableKt.m299clickableoSLSa3U$default(modifierClip, z2, null, null, null, (Function0) objRememberedValue, 14, null);
                        Arrangement arrangement = Arrangement.INSTANCE;
                        Arrangement.Vertical top = arrangement.getTop();
                        Alignment.Companion companion2 = Alignment.INSTANCE;
                        MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(top, companion2.getStart(), composer3, 0);
                        long currentCompositeKeyHashCode = ComposablesKt.getCurrentCompositeKeyHashCode(composer3, 0);
                        int i5 = (int) (currentCompositeKeyHashCode ^ (currentCompositeKeyHashCode >>> 32));
                        CompositionLocalMap currentCompositionLocalMap = composer3.getCurrentCompositionLocalMap();
                        Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composer3, modifierM299clickableoSLSa3U$default);
                        ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
                        Function0<ComposeUiNode> constructor = companion3.getConstructor();
                        if (composer3.getApplier() == null) {
                            ComposablesKt.invalidApplier();
                        }
                        composer3.startReusableNode();
                        if (composer3.getInserting()) {
                            composer3.createNode(constructor);
                        } else {
                            composer3.useNode();
                        }
                        Composer composerM3915constructorimpl = Updater.m3915constructorimpl(composer3);
                        pk0.v(companion3, composerM3915constructorimpl, measurePolicyColumnMeasurePolicy, composerM3915constructorimpl, currentCompositionLocalMap);
                        Updater.m3923setimpl(composerM3915constructorimpl, modifierMaterializeModifier, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion3, composerM3915constructorimpl, Integer.valueOf(i5), composerM3915constructorimpl));
                        ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
                        Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null);
                        MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(companion2.getTopStart(), false);
                        long currentCompositeKeyHashCode2 = ComposablesKt.getCurrentCompositeKeyHashCode(composer3, 0);
                        int i6 = (int) (currentCompositeKeyHashCode2 ^ (currentCompositeKeyHashCode2 >>> 32));
                        CompositionLocalMap currentCompositionLocalMap2 = composer3.getCurrentCompositionLocalMap();
                        Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(composer3, modifierFillMaxWidth$default);
                        Function0<ComposeUiNode> constructor2 = companion3.getConstructor();
                        if (composer3.getApplier() == null) {
                            ComposablesKt.invalidApplier();
                        }
                        composer3.startReusableNode();
                        if (composer3.getInserting()) {
                            composer3.createNode(constructor2);
                        } else {
                            composer3.useNode();
                        }
                        Composer composerM3915constructorimpl2 = Updater.m3915constructorimpl(composer3);
                        pk0.v(companion3, composerM3915constructorimpl2, measurePolicyMaybeCachedBoxMeasurePolicy, composerM3915constructorimpl2, currentCompositionLocalMap2);
                        Updater.m3923setimpl(composerM3915constructorimpl2, modifierMaterializeModifier2, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion3, composerM3915constructorimpl2, Integer.valueOf(i6), composerM3915constructorimpl2));
                        BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                        Painter painterA = PainterResourceHelperKt.a(IconType.IC_PASS_BACKGROUND_BRUSH, composer3, 6);
                        Modifier modifierAlign = boxScopeInstance.align(companion, companion2.getBottomEnd());
                        ContentScale fit = ContentScale.INSTANCE.getFit();
                        int i7 = Painter.$stable;
                        ImageKt.Image(painterA, (String) null, modifierAlign, (Alignment) null, fit, 0.0f, (ColorFilter) null, composer3, i7 | 24624, 104);
                        Modifier modifierM784padding3ABfNKs = PaddingKt.m784padding3ABfNKs(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), ChaloTheme.b(composer3, 0).h);
                        MeasurePolicy measurePolicyColumnMeasurePolicy2 = ColumnKt.columnMeasurePolicy(arrangement.getTop(), companion2.getStart(), composer3, 0);
                        long currentCompositeKeyHashCode3 = ComposablesKt.getCurrentCompositeKeyHashCode(composer3, 0);
                        int i8 = (int) (currentCompositeKeyHashCode3 ^ (currentCompositeKeyHashCode3 >>> 32));
                        CompositionLocalMap currentCompositionLocalMap3 = composer3.getCurrentCompositionLocalMap();
                        Modifier modifierMaterializeModifier3 = ComposedModifierKt.materializeModifier(composer3, modifierM784padding3ABfNKs);
                        Function0<ComposeUiNode> constructor3 = companion3.getConstructor();
                        if (composer3.getApplier() == null) {
                            ComposablesKt.invalidApplier();
                        }
                        composer3.startReusableNode();
                        if (composer3.getInserting()) {
                            composer3.createNode(constructor3);
                        } else {
                            composer3.useNode();
                        }
                        Composer composerM3915constructorimpl3 = Updater.m3915constructorimpl(composer3);
                        pk0.v(companion3, composerM3915constructorimpl3, measurePolicyColumnMeasurePolicy2, composerM3915constructorimpl3, currentCompositionLocalMap3);
                        Updater.m3923setimpl(composerM3915constructorimpl3, modifierMaterializeModifier3, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion3, composerM3915constructorimpl3, Integer.valueOf(i8), composerM3915constructorimpl3));
                        FlowLayoutKt.FlowRow(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), null, null, companion2.getCenterVertically(), 0, 0, ComposableLambdaKt.rememberComposableLambda(-1010650021, true, new c6(chaloBusPassHistory2, 6), composer3, 54), composer3, 1575942, 54);
                        ChaloSpacersKt.m(composer3, 0);
                        String str4 = str;
                        if (AnyExtsKt.a(str4)) {
                            String str5 = str2;
                            if (AnyExtsKt.a(str5)) {
                                composer3.startReplaceGroup(-1155757847);
                                ChaloBusScreenUIKt.l(chaloBusPassHistory2, str4, str5, composer3, 0);
                            } else {
                                composer3.startReplaceGroup(-1220804062);
                            }
                        } else {
                            composer3.startReplaceGroup(-1220804062);
                        }
                        composer3.endReplaceGroup();
                        composer3.endNode();
                        composer3.endNode();
                        if (iconType == null || (str3 = chaloBusPassHistory2.l) == null || str3.length() <= 0) {
                            composer3.startReplaceGroup(-1691898042);
                        } else {
                            composer3.startReplaceGroup(-1626430010);
                            Modifier modifierM785paddingVpY3zN4 = PaddingKt.m785paddingVpY3zN4(BackgroundKt.m264backgroundbw27NRU$default(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), ChaloTheme.a(composer3, 0).t, null, 2, null), ChaloTheme.b(composer3, 0).g, ChaloTheme.b(composer3, 0).f);
                            MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(arrangement.getStart(), companion2.getCenterVertically(), composer3, 48);
                            long currentCompositeKeyHashCode4 = ComposablesKt.getCurrentCompositeKeyHashCode(composer3, 0);
                            int i9 = (int) (currentCompositeKeyHashCode4 ^ (currentCompositeKeyHashCode4 >>> 32));
                            CompositionLocalMap currentCompositionLocalMap4 = composer3.getCurrentCompositionLocalMap();
                            Modifier modifierMaterializeModifier4 = ComposedModifierKt.materializeModifier(composer3, modifierM785paddingVpY3zN4);
                            Function0<ComposeUiNode> constructor4 = companion3.getConstructor();
                            if (composer3.getApplier() == null) {
                                ComposablesKt.invalidApplier();
                            }
                            composer3.startReusableNode();
                            if (composer3.getInserting()) {
                                composer3.createNode(constructor4);
                            } else {
                                composer3.useNode();
                            }
                            Composer composerM3915constructorimpl4 = Updater.m3915constructorimpl(composer3);
                            pk0.v(companion3, composerM3915constructorimpl4, measurePolicyRowMeasurePolicy, composerM3915constructorimpl4, currentCompositionLocalMap4);
                            Updater.m3923setimpl(composerM3915constructorimpl4, modifierMaterializeModifier4, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion3, composerM3915constructorimpl4, Integer.valueOf(i9), composerM3915constructorimpl4));
                            RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
                            if (lottieType != null) {
                                composer3.startReplaceGroup(-697239070);
                                ImageKt.Image(LottieResourceHelperKt.c(LottieResourceHelperKt.b(lottieType, composer3, 0), 0, false, composer3, 0, 30), "", SizeKt.m828size3ABfNKs(companion, ChaloTheme.b(composer3, 0).W), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composer3, i7 | 48, 120);
                                composer3.endReplaceGroup();
                            } else {
                                composer3.startReplaceGroup(-696851756);
                                ImageKt.Image(PainterResourceHelperKt.a(iconType, composer3, 0), (String) null, SizeKt.m828size3ABfNKs(companion, ChaloTheme.b(composer3, 0).W), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composer3, i7 | 48, 120);
                                composer3.endReplaceGroup();
                            }
                            ChaloSpacersKt.w(composer3, 0);
                            TextKt.m2623TextNvy7gAk(chaloBusPassHistory2.l, null, ChaloTheme.a(composer3, 0).t0, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ChaloTypographyKt.d(ChaloTheme.e(composer3, 0)), composer3, 0, 0, 131066);
                            composer3 = composer3;
                            composer3.endNode();
                        }
                        composer3.endReplaceGroup();
                        composer3.endNode();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    } else {
                        composer3.skipToGroupEnd();
                    }
                    return Unit.f17538a;
                }
            }, composerStartRestartGroup, 54), composerStartRestartGroup, ((i4 >> 3) & 14) | ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE, 16);
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
            scopeUpdateScopeEndRestartGroup.updateScope(new s4(i, 11, chaloBusPassHistory, modifier, function0));
        }
    }

    public static final void b(int i, Composer composer, Modifier modifier, List list, Function1 function1) {
        int i2;
        Modifier modifier2;
        Composer composerStartRestartGroup = composer.startRestartGroup(562948561);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(list) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        int i3 = i2 | 48;
        if ((i & 384) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(function1) ? 256 : 128;
        }
        if (composerStartRestartGroup.shouldExecute((i3 & 147) != 146, i3 & 1)) {
            Modifier.Companion companion = Modifier.INSTANCE;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(562948561, i3, -1, "app.chalo.home.ui.chalobus.ChaloBusPassesCarousel (ChaloBusScreenUI.kt:1463)");
            }
            boolean zChangedInstance = composerStartRestartGroup.changedInstance(list);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new af(list, 4);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            PagerState pagerStateRememberPagerState = PagerStateKt.rememberPagerState(0, 0.0f, (Function0) objRememberedValue, composerStartRestartGroup, 6, 2);
            boolean zChanged = composerStartRestartGroup.changed(list);
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (zChanged || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue2 = Integer.valueOf(list.size());
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            int iIntValue = ((Number) objRememberedValue2).intValue();
            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getCenterHorizontally(), composerStartRestartGroup, 48);
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
            pk0.v(companion2, composerM3915constructorimpl, measurePolicyColumnMeasurePolicy, composerM3915constructorimpl, currentCompositionLocalMap);
            Updater.m3923setimpl(composerM3915constructorimpl, modifierMaterializeModifier, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion2, composerM3915constructorimpl, Integer.valueOf(i4), composerM3915constructorimpl));
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
            modifier2 = companion;
            PagerKt.m1020HorizontalPager8jOkeI(pagerStateRememberPagerState, null, PaddingKt.m779PaddingValuesYgX7TsA$default(ChaloTheme.b(composerStartRestartGroup, 0).h, 0.0f, 2, null), null, 0, ChaloTheme.b(composerStartRestartGroup, 0).h, null, null, false, false, null, null, null, null, ComposableLambdaKt.rememberComposableLambda(-2032878584, true, new bf(2, list, function1), composerStartRestartGroup, 54), composerStartRestartGroup, 0, 24576, 16346);
            composerStartRestartGroup = composerStartRestartGroup;
            if (iIntValue > 1) {
                composerStartRestartGroup.startReplaceGroup(1459498473);
                ChaloSpacersKt.m(composerStartRestartGroup, 0);
                ChaloDotsIndicatorsKt.a(SizeKt.wrapContentSize$default(modifier2, null, false, 3, null), ChaloTheme.a(composerStartRestartGroup, 0).f1915a, ChaloTheme.a(composerStartRestartGroup, 0).n, iIntValue, pagerStateRememberPagerState.getCurrentPage(), composerStartRestartGroup, 24576);
            } else {
                composerStartRestartGroup.startReplaceGroup(1397375899);
            }
            composerStartRestartGroup.endReplaceGroup();
            composerStartRestartGroup.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
            modifier2 = modifier;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new qh(list, modifier2, function1, i));
        }
    }

    public static final void c(ChaloBusComponent chaloBusComponent, ProductPurchaseNudgeInfo productPurchaseNudgeInfo, Function1 function1, Composer composer, int i) {
        int i2;
        boolean z;
        Composer composerStartRestartGroup = composer.startRestartGroup(-174015370);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(chaloBusComponent) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(productPurchaseNudgeInfo) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(function1) ? 256 : 128;
        }
        if (composerStartRestartGroup.shouldExecute((i2 & 147) != 146, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-174015370, i2, -1, "app.chalo.home.ui.chalobus.ChaloBusProductPurchaseNudgeSection (ChaloBusScreenUI.kt:474)");
            }
            int i3 = WhenMappings.f3256a[productPurchaseNudgeInfo.b.ordinal()];
            if (i3 == 1) {
                composerStartRestartGroup.startReplaceGroup(1134354881);
                composerStartRestartGroup.endReplaceGroup();
            } else if (i3 == 2) {
                composerStartRestartGroup.startReplaceGroup(175141427);
                boolean z2 = (i2 & 896) == 256;
                Object objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (z2 || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = new g0(function1, 15);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                u(productPurchaseNudgeInfo, (Function1) objRememberedValue, composerStartRestartGroup, 0);
                composerStartRestartGroup.endReplaceGroup();
            } else if (i3 == 3) {
                composerStartRestartGroup.startReplaceGroup(175151177);
                z = (i2 & 896) == 256;
                Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                if (z || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue2 = new g0(function1, 16);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                }
                t(productPurchaseNudgeInfo, (Function1) objRememberedValue2, composerStartRestartGroup, (i2 >> 3) & 14);
                composerStartRestartGroup.endReplaceGroup();
            } else {
                if (i3 != 4) {
                    throw pk0.p(composerStartRestartGroup, 175138408);
                }
                composerStartRestartGroup.startReplaceGroup(175162082);
                int i4 = i2 & 896;
                boolean z3 = i4 == 256;
                Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                if (z3 || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue3 = new g0(function1, 17);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                }
                Function1 function2 = (Function1) objRememberedValue3;
                z = i4 == 256;
                Object objRememberedValue4 = composerStartRestartGroup.rememberedValue();
                if (z || objRememberedValue4 == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue4 = new g0(function1, 18);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
                }
                v(chaloBusComponent, productPurchaseNudgeInfo, function2, (Function1) objRememberedValue4, composerStartRestartGroup, i2 & WebSocketProtocol.PAYLOAD_SHORT);
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
            scopeUpdateScopeEndRestartGroup.updateScope(new s4(i, 10, chaloBusComponent, productPurchaseNudgeInfo, function1));
        }
    }

    /* JADX WARN: Code duplicated, block: B:109:0x037c  */
    /* JADX WARN: Code duplicated, block: B:111:0x0382  */
    /* JADX WARN: Code duplicated, block: B:112:0x03b1  */
    /* JADX WARN: Code duplicated, block: B:114:0x03b7  */
    /* JADX WARN: Code duplicated, block: B:116:0x03e6  */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void d(List list, Function1 function1, Composer composer, int i) {
        int i2;
        int i3;
        int i4;
        Density density;
        int i5;
        int i6;
        int i7;
        Composer composer2;
        Object obj;
        boolean z;
        float f;
        Object obj2;
        Density density2;
        boolean z2;
        Composer composerStartRestartGroup = composer.startRestartGroup(991391636);
        int i8 = 2;
        int i9 = (i & 6) == 0 ? (composerStartRestartGroup.changedInstance(list) ? 4 : 2) | i : i;
        if ((i & 48) == 0) {
            i9 |= composerStartRestartGroup.changedInstance(function1) ? 32 : 16;
        }
        int i10 = 1;
        if (composerStartRestartGroup.shouldExecute((i9 & 19) != 18, i9 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(991391636, i9, -1, "app.chalo.home.ui.chalobus.ChaloBusScreenContent (ChaloBusScreenUI.kt:1051)");
            }
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            Composer.Companion companion = Composer.INSTANCE;
            if (objRememberedValue == companion.getEmpty()) {
                objRememberedValue = SnapshotStateKt.mutableStateMapOf();
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            SnapshotStateMap snapshotStateMap = (SnapshotStateMap) objRememberedValue;
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue2 == companion.getEmpty()) {
                objRememberedValue2 = SnapshotStateKt.mutableStateMapOf();
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            SnapshotStateMap snapshotStateMap2 = (SnapshotStateMap) objRememberedValue2;
            Density density3 = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
            Modifier modifierFillMaxSize$default = SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null);
            int i11 = 32;
            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getCenterHorizontally(), composerStartRestartGroup, 48);
            long currentCompositeKeyHashCode = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
            int i12 = (int) (currentCompositeKeyHashCode ^ (currentCompositeKeyHashCode >>> 32));
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierFillMaxSize$default);
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
            Updater.m3923setimpl(composerM3915constructorimpl, modifierMaterializeModifier, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion2, composerM3915constructorimpl, Integer.valueOf(i12), composerM3915constructorimpl));
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
            composerStartRestartGroup.startReplaceGroup(-836322607);
            int i13 = 0;
            for (Object obj3 : list) {
                int i14 = i13 + 1;
                if (i13 < 0) {
                    CollectionsKt.z0();
                    throw null;
                }
                ChaloBusPageDisplayItemData chaloBusPageDisplayItemData = (ChaloBusPageDisplayItemData) obj3;
                ChaloBusPageSectionDisplayType chaloBusPageSectionDisplayType = chaloBusPageDisplayItemData.i;
                String str = chaloBusPageDisplayItemData.b;
                ChaloBusPageFeature chaloBusPageFeature = chaloBusPageDisplayItemData.h;
                int i15 = WhenMappings.d[chaloBusPageSectionDisplayType.ordinal()];
                if (i15 != i10) {
                    if (i15 == i8) {
                        SnapshotStateMap snapshotStateMap3 = snapshotStateMap;
                        i3 = i9;
                        i4 = i8;
                        SnapshotStateMap snapshotStateMap4 = snapshotStateMap2;
                        density = density3;
                        i7 = i10;
                        composer2 = composerStartRestartGroup;
                        composer2.startReplaceGroup(-1788881655);
                        if (i13 > 0) {
                            int i16 = i13 - 1;
                            if (((ChaloBusPageDisplayItemData) list.get(i16)).i == ChaloBusPageSectionDisplayType.PLOTLINE_WIDGET) {
                                composer2.startReplaceGroup(-1788776782);
                                if (Intrinsics.d(snapshotStateMap3.get(((ChaloBusPageDisplayItemData) list.get(i16)).b), Boolean.TRUE)) {
                                    composer2.startReplaceGroup(-1788664066);
                                    SpacerKt.Spacer(SizeKt.m814height3ABfNKs(SizeKt.fillMaxWidth$default(BackgroundKt.m264backgroundbw27NRU$default(Modifier.INSTANCE, ChaloTheme.a(composer2, 0).r0, null, 2, null), 0.0f, i7, null), ChaloTheme.b(composer2, 0).h), composer2, 0);
                                } else {
                                    composer2.startReplaceGroup(-1833156320);
                                }
                                composer2.endReplaceGroup();
                                composer2.endReplaceGroup();
                            } else if (i13 != CollectionsKt.K(list)) {
                                composer2.startReplaceGroup(-1788241350);
                                SpacerKt.Spacer(SizeKt.m814height3ABfNKs(SizeKt.fillMaxWidth$default(BackgroundKt.m264backgroundbw27NRU$default(Modifier.INSTANCE, ChaloTheme.a(composer2, 0).r0, null, 2, null), 0.0f, i7, null), ChaloTheme.b(composer2, 0).h), composer2, 0);
                                composer2.endReplaceGroup();
                            } else {
                                if (i13 == CollectionsKt.K(list)) {
                                    composer2.startReplaceGroup(-1787867397);
                                    SpacerKt.Spacer(SizeKt.m814height3ABfNKs(SizeKt.fillMaxWidth$default(BackgroundKt.m264backgroundbw27NRU$default(Modifier.INSTANCE, ChaloTheme.a(composer2, 0).r0, null, 2, null), 0.0f, i7, null), ChaloTheme.b(composer2, 0).m), composer2, 0);
                                } else {
                                    composer2.startReplaceGroup(-1833156320);
                                }
                                composer2.endReplaceGroup();
                            }
                        } else if (i13 != CollectionsKt.K(list)) {
                            composer2.startReplaceGroup(-1788241350);
                            SpacerKt.Spacer(SizeKt.m814height3ABfNKs(SizeKt.fillMaxWidth$default(BackgroundKt.m264backgroundbw27NRU$default(Modifier.INSTANCE, ChaloTheme.a(composer2, 0).r0, null, 2, null), 0.0f, i7, null), ChaloTheme.b(composer2, 0).h), composer2, 0);
                            composer2.endReplaceGroup();
                        } else {
                            if (i13 == CollectionsKt.K(list)) {
                                composer2.startReplaceGroup(-1787867397);
                                SpacerKt.Spacer(SizeKt.m814height3ABfNKs(SizeKt.fillMaxWidth$default(BackgroundKt.m264backgroundbw27NRU$default(Modifier.INSTANCE, ChaloTheme.a(composer2, 0).r0, null, 2, null), 0.0f, i7, null), ChaloTheme.b(composer2, 0).m), composer2, 0);
                            } else {
                                composer2.startReplaceGroup(-1833156320);
                            }
                            composer2.endReplaceGroup();
                        }
                        composer2.endReplaceGroup();
                        snapshotStateMap2 = snapshotStateMap4;
                        snapshotStateMap = snapshotStateMap3;
                    } else if (i15 == 3) {
                        snapshotStateMap = snapshotStateMap;
                        i3 = i9;
                        snapshotStateMap2 = snapshotStateMap2;
                        Density density4 = density3;
                        composerStartRestartGroup.startReplaceGroup(-1787461452);
                        i7 = i10;
                        composer2 = composerStartRestartGroup;
                        i4 = 2;
                        w(function1, chaloBusPageDisplayItemData.f3248a, chaloBusPageDisplayItemData, density4, composer2, (i3 >> 3) & 14);
                        density = density4;
                        composer2.endReplaceGroup();
                    } else {
                        if (i15 != 4) {
                            throw pk0.p(composerStartRestartGroup, 912075891);
                        }
                        composerStartRestartGroup.startReplaceGroup(-1787054980);
                        IconType iconType = chaloBusPageDisplayItemData.g;
                        if (iconType == null) {
                            composerStartRestartGroup.startReplaceGroup(-1787054981);
                            composerStartRestartGroup.endReplaceGroup();
                            i11 = i11;
                            i3 = i9;
                            density2 = density3;
                            i6 = i10;
                            obj2 = null;
                            z2 = false;
                        } else {
                            composerStartRestartGroup.startReplaceGroup(-1787054980);
                            Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                            Composer.Companion companion3 = Composer.INSTANCE;
                            if (objRememberedValue3 == companion3.getEmpty()) {
                                obj = null;
                                objRememberedValue3 = gf.b(0, null, i8, null, composerStartRestartGroup);
                            } else {
                                obj = null;
                            }
                            MutableState mutableState = (MutableState) objRememberedValue3;
                            Modifier.Companion companion4 = Modifier.INSTANCE;
                            Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(companion4, 0.0f, i10, obj);
                            boolean zChanged = composerStartRestartGroup.changed(density3);
                            Object objRememberedValue4 = composerStartRestartGroup.rememberedValue();
                            if (zChanged || objRememberedValue4 == companion3.getEmpty()) {
                                objRememberedValue4 = new f0(density3, mutableState, 3);
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
                            }
                            Modifier modifierOnGloballyPositioned = OnGloballyPositionedModifierKt.onGloballyPositioned(modifierFillMaxWidth$default, (Function1) objRememberedValue4);
                            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
                            long currentCompositeKeyHashCode2 = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
                            int i17 = (int) (currentCompositeKeyHashCode2 ^ (currentCompositeKeyHashCode2 >>> i11));
                            CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                            Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierOnGloballyPositioned);
                            i3 = i9;
                            ComposeUiNode.Companion companion5 = ComposeUiNode.INSTANCE;
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
                            pk0.v(companion5, composerM3915constructorimpl2, measurePolicyMaybeCachedBoxMeasurePolicy, composerM3915constructorimpl2, currentCompositionLocalMap2);
                            Updater.m3923setimpl(composerM3915constructorimpl2, modifierMaterializeModifier2, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion5, composerM3915constructorimpl2, Integer.valueOf(i17), composerM3915constructorimpl2));
                            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                            if (chaloBusPageDisplayItemData.f3248a) {
                                composerStartRestartGroup.startReplaceGroup(164291975);
                                ChaloSectionHighlightKt.a(boxScopeInstance, ((Dp) mutableState.getValue()).m7292unboximpl(), composerStartRestartGroup, 6);
                            } else {
                                composerStartRestartGroup.startReplaceGroup(117691101);
                            }
                            composerStartRestartGroup.endReplaceGroup();
                            Modifier modifierM785paddingVpY3zN4 = PaddingKt.m785paddingVpY3zN4(SizeKt.fillMaxWidth$default(PlotlineComposeWidgetKt.a(companion4, "PL_Chalo_Bus_Page_Card_Item_" + chaloBusPageFeature.getFeatureType()), 0.0f, 1, null), ChaloTheme.b(composerStartRestartGroup, 0).h, ChaloTheme.b(composerStartRestartGroup, 0).i);
                            switch (WhenMappings.c[chaloBusPageFeature.ordinal()]) {
                                case 1:
                                    z = false;
                                    composerStartRestartGroup.startReplaceGroup(2083535018);
                                    f = ChaloTheme.c(composerStartRestartGroup, 0).b;
                                    composerStartRestartGroup.endReplaceGroup();
                                    break;
                                case 2:
                                case 3:
                                case 4:
                                case 5:
                                case 6:
                                case 7:
                                    composerStartRestartGroup.startReplaceGroup(2083549579);
                                    z = false;
                                    f = ChaloTheme.c(composerStartRestartGroup, 0).c;
                                    composerStartRestartGroup.endReplaceGroup();
                                    break;
                                default:
                                    throw pk0.p(composerStartRestartGroup, 2083531757);
                            }
                            float f2 = f;
                            Density density5 = density3;
                            String str2 = chaloBusPageDisplayItemData.d;
                            String str3 = chaloBusPageDisplayItemData.e;
                            int i18 = i11;
                            boolean zChangedInstance = composerStartRestartGroup.changedInstance(chaloBusPageDisplayItemData) | ((i3 & 112) == i18 ? true : z);
                            Object objRememberedValue5 = composerStartRestartGroup.rememberedValue();
                            if (zChangedInstance || objRememberedValue5 == companion3.getEmpty()) {
                                objRememberedValue5 = new l3(23, chaloBusPageDisplayItemData, function1);
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue5);
                            }
                            Composer composer3 = composerStartRestartGroup;
                            i11 = i18;
                            obj2 = null;
                            density2 = density5;
                            z2 = z;
                            i6 = 1;
                            ChaloWidgetCardKt.d(modifierM785paddingVpY3zN4, str2, null, str3, null, iconType, 0.0f, 0.0f, null, 0.0f, f2, (Function0) objRememberedValue5, composer3, 0, 0, 980);
                            composerStartRestartGroup = composer3;
                            composerStartRestartGroup.endNode();
                            composerStartRestartGroup.endReplaceGroup();
                        }
                        composerStartRestartGroup.endReplaceGroup();
                        density = density2;
                        i4 = 2;
                    }
                    composerStartRestartGroup = composer2;
                    i6 = i7;
                } else {
                    i11 = i11;
                    SnapshotStateMap snapshotStateMap5 = snapshotStateMap;
                    i3 = i9;
                    i4 = i8;
                    int i19 = i10;
                    Composer composer4 = composerStartRestartGroup;
                    snapshotStateMap2 = snapshotStateMap2;
                    density = density3;
                    composer4.startReplaceGroup(-1790456796);
                    if (str == null) {
                        composer4.startReplaceGroup(-1790456797);
                        composer4.endReplaceGroup();
                        snapshotStateMap2 = snapshotStateMap2;
                        snapshotStateMap = snapshotStateMap5;
                        composerStartRestartGroup = composer4;
                        i6 = i19;
                    } else {
                        composer4.startReplaceGroup(-1790456796);
                        Modifier.Companion companion6 = Modifier.INSTANCE;
                        Modifier modifierM264backgroundbw27NRU$default = BackgroundKt.m264backgroundbw27NRU$default(SizeKt.fillMaxWidth$default(companion6, 0.0f, i19, null), ChaloTheme.a(composer4, 0).t, null, 2, null);
                        MeasurePolicy measurePolicyColumnMeasurePolicy2 = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composer4, 0);
                        long currentCompositeKeyHashCode3 = ComposablesKt.getCurrentCompositeKeyHashCode(composer4, 0);
                        int i20 = (int) (currentCompositeKeyHashCode3 ^ (currentCompositeKeyHashCode3 >>> i11));
                        CompositionLocalMap currentCompositionLocalMap3 = composer4.getCurrentCompositionLocalMap();
                        Modifier modifierMaterializeModifier3 = ComposedModifierKt.materializeModifier(composer4, modifierM264backgroundbw27NRU$default);
                        ComposeUiNode.Companion companion7 = ComposeUiNode.INSTANCE;
                        Function0<ComposeUiNode> constructor3 = companion7.getConstructor();
                        if (composer4.getApplier() == null) {
                            ComposablesKt.invalidApplier();
                        }
                        composer4.startReusableNode();
                        if (composer4.getInserting()) {
                            composer4.createNode(constructor3);
                        } else {
                            composer4.useNode();
                        }
                        Composer composerM3915constructorimpl3 = Updater.m3915constructorimpl(composer4);
                        pk0.v(companion7, composerM3915constructorimpl3, measurePolicyColumnMeasurePolicy2, composerM3915constructorimpl3, currentCompositionLocalMap3);
                        Updater.m3923setimpl(composerM3915constructorimpl3, modifierMaterializeModifier3, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion7, composerM3915constructorimpl3, Integer.valueOf(i20), composerM3915constructorimpl3));
                        ColumnScopeInstance columnScopeInstance2 = ColumnScopeInstance.INSTANCE;
                        if (Intrinsics.d(snapshotStateMap2.get(str), Boolean.TRUE) && (AnyExtsKt.a(chaloBusPageDisplayItemData.d) || AnyExtsKt.a(chaloBusPageDisplayItemData.c))) {
                            composer4.startReplaceGroup(-1164039913);
                            ChaloSpacersKt.p(composer4, 0);
                            i5 = 0;
                            composerStartRestartGroup = composer4;
                            i6 = 1;
                            HomeScreenPlotlineTitleKt.a(chaloBusPageDisplayItemData.c, chaloBusPageDisplayItemData.d, chaloBusPageDisplayItemData.e, null, composerStartRestartGroup, 0);
                        } else {
                            composerStartRestartGroup = composer4;
                            i5 = 0;
                            i6 = 1;
                            composerStartRestartGroup.startReplaceGroup(-1207064348);
                        }
                        composerStartRestartGroup.endReplaceGroup();
                        boolean zChanged2 = composerStartRestartGroup.changed(density) | composerStartRestartGroup.changedInstance(chaloBusPageDisplayItemData);
                        Object objRememberedValue6 = composerStartRestartGroup.rememberedValue();
                        if (zChanged2 || objRememberedValue6 == Composer.INSTANCE.getEmpty()) {
                            n3 n3Var = new n3(density, snapshotStateMap2, chaloBusPageDisplayItemData, snapshotStateMap5, 2);
                            snapshotStateMap = snapshotStateMap5;
                            composerStartRestartGroup.updateRememberedValue(n3Var);
                            objRememberedValue6 = n3Var;
                        } else {
                            snapshotStateMap = snapshotStateMap5;
                        }
                        app.chalo.compose.components.plotline.PlotlineComposeWidgetKt.a(i5, i5, composerStartRestartGroup, OnGloballyPositionedModifierKt.onGloballyPositioned(companion6, (Function1) objRememberedValue6), str);
                        composerStartRestartGroup.endNode();
                        composerStartRestartGroup.endReplaceGroup();
                    }
                    composerStartRestartGroup.endReplaceGroup();
                }
                i10 = i6;
                density3 = density;
                i13 = i14;
                i8 = i4;
                snapshotStateMap = snapshotStateMap;
                i11 = i11;
                i9 = i3;
                snapshotStateMap2 = snapshotStateMap2;
            }
            i2 = i10;
            if (b3.t(composerStartRestartGroup)) {
                ComposerKt.traceEventEnd();
            }
        } else {
            i2 = 1;
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new kh(i, i2, list, function1));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void e(ChaloBusComponent chaloBusComponent, ChaloBusViewState chaloBusViewState, ScrollState scrollState, Function1 function1, Composer composer, int i) {
        int i2;
        ScrollState scrollState2;
        ChaloBusViewState chaloBusViewState2 = chaloBusViewState;
        Function1 function2 = function1;
        Composer composerStartRestartGroup = composer.startRestartGroup(-685861953);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(chaloBusComponent) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(chaloBusViewState2) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            scrollState2 = scrollState;
            i2 |= composerStartRestartGroup.changed(scrollState2) ? 256 : 128;
        } else {
            scrollState2 = scrollState;
        }
        if ((i & 3072) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(function2) ? 2048 : 1024;
        }
        if (composerStartRestartGroup.shouldExecute((i2 & 1171) != 1170, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-685861953, i2, -1, "app.chalo.home.ui.chalobus.ChaloBusScreenContentUI (ChaloBusScreenUI.kt:311)");
            }
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            Composer.Companion companion = Composer.INSTANCE;
            if (objRememberedValue == companion.getEmpty()) {
                objRememberedValue = gf.b(0, null, 2, null, composerStartRestartGroup);
            }
            MutableState mutableState = (MutableState) objRememberedValue;
            Modifier.Companion companion2 = Modifier.INSTANCE;
            Modifier modifierVerticalScroll$default = ScrollKt.verticalScroll$default(BackgroundKt.m264backgroundbw27NRU$default(SizeKt.fillMaxSize$default(companion2, 0.0f, 1, null), ChaloTheme.a(composerStartRestartGroup, 0).t, null, 2, null), scrollState2, HomeOverscrollEffect_androidKt.a(composerStartRestartGroup), false, null, false, 28, null);
            Alignment.Companion companion3 = Alignment.INSTANCE;
            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(companion3.getTopStart(), false);
            long currentCompositeKeyHashCode = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
            int i3 = (int) (currentCompositeKeyHashCode ^ (currentCompositeKeyHashCode >>> 32));
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierVerticalScroll$default);
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
            Updater.m3923setimpl(composerM3915constructorimpl, modifierMaterializeModifier, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion4, composerM3915constructorimpl, Integer.valueOf(i3), composerM3915constructorimpl));
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            Modifier modifierM814height3ABfNKs = SizeKt.m814height3ABfNKs(SizeKt.fillMaxWidth$default(companion2, 0.0f, 1, null), ((Dp) mutableState.getValue()).m7292unboximpl());
            ChaloColorToken.LightOrangeSpf lightOrangeSpf = ChaloColorToken.LightOrangeSpf.f9817a;
            int i4 = i2;
            VerticalGridLinesWithGradiantBackgroundKt.a(modifierM814height3ABfNKs, lightOrangeSpf, new ColorGradiantUiState.Linear(CollectionsKt.S(ChaloColorTokenKt.a(0.25f, lightOrangeSpf), ChaloColorToken.White.f9870a)), ChaloThemeHelper.a().b, ChaloTheme.b(composerStartRestartGroup, 0).f, ChaloTheme.b(composerStartRestartGroup, 0).f, composerStartRestartGroup, 25136, 0);
            Modifier modifierFillMaxSize$default = SizeKt.fillMaxSize$default(companion2, 0.0f, 1, null);
            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), companion3.getStart(), composerStartRestartGroup, 0);
            long currentCompositeKeyHashCode2 = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
            int i5 = (int) (currentCompositeKeyHashCode2 ^ (currentCompositeKeyHashCode2 >>> 32));
            CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierFillMaxSize$default);
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
            pk0.v(companion4, composerM3915constructorimpl2, measurePolicyColumnMeasurePolicy, composerM3915constructorimpl2, currentCompositionLocalMap2);
            Updater.m3923setimpl(composerM3915constructorimpl2, modifierMaterializeModifier2, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion4, composerM3915constructorimpl2, Integer.valueOf(i5), composerM3915constructorimpl2));
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue2 == companion.getEmpty()) {
                objRememberedValue2 = new g5(mutableState, 6);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            chaloBusViewState2 = chaloBusViewState;
            function2 = function1;
            f(chaloBusComponent, null, (Function1) objRememberedValue2, chaloBusViewState2, function2, composerStartRestartGroup, (i4 & 14) | 384 | ((i4 << 6) & 7168) | ((i4 << 3) & 57344));
            List list = chaloBusViewState2.f3286a;
            if (list == null) {
                composerStartRestartGroup.startReplaceGroup(784283159);
            } else {
                composerStartRestartGroup.startReplaceGroup(784283160);
                d(list, function2, composerStartRestartGroup, (i4 >> 6) & 112);
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
            scopeUpdateScopeEndRestartGroup.updateScope(new u6(i, 6, chaloBusComponent, chaloBusViewState2, scrollState, function2));
        }
    }

    /* JADX WARN: Failed to calculate best type for var: r12v0 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r12v0 ??, new type: androidx.compose.runtime.Composer
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.calculateFromBounds(FixTypesVisitor.java:159)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.setBestType(FixTypesVisitor.java:136)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:241)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:224)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 6 more
     */
    /* JADX WARN: Failed to calculate best type for var: r12v0 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r12v0 ??, new type: androidx.compose.runtime.Composer
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$1(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1612)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r12v1 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r12v1 ??, new type: androidx.compose.runtime.Composer
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.calculateFromBounds(FixTypesVisitor.java:159)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.setBestType(FixTypesVisitor.java:136)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:241)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:224)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 6 more
     */
    /* JADX WARN: Failed to calculate best type for var: r12v1 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r12v1 ??, new type: androidx.compose.runtime.Composer
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$1(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1612)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r12v2 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r12v2 ??, new type: androidx.compose.runtime.Composer
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$1(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1612)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r31v0 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r31v0 ??, new type: androidx.compose.runtime.Composer
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$1(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1612)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r7v7 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r7v7 ??, new type: boolean
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$1(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1612)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to set immutable type for var: r31v0 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r31v0 ??, new type: androidx.compose.runtime.Composer
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.applyWithWiderIgnSame(TypeUpdate.java:73)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setImmutableType(TypeInferenceVisitor.java:111)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$0(TypeInferenceVisitor.java:102)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1612)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:102)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 6 more
     */
    /*  JADX ERROR: Types fix failed
        jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r10v6 ??, new type: boolean
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
    public static final void f(app.chalo.home.ui.chalobus.ChaloBusComponent r26, androidx.compose.ui.Modifier r27, kotlin.jvm.functions.Function1 r28, app.chalo.home.ui.chalobus.ChaloBusViewState r29, kotlin.jvm.functions.Function1 r30, androidx.compose.runtime.Composer r31, int r32) {
        /*
            Method dump skipped, instruction units count: 985
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: app.chalo.home.ui.chalobus.ChaloBusScreenUIKt.f(app.chalo.home.ui.chalobus.ChaloBusComponent, androidx.compose.ui.Modifier, kotlin.jvm.functions.Function1, app.chalo.home.ui.chalobus.ChaloBusViewState, kotlin.jvm.functions.Function1, androidx.compose.runtime.Composer, int):void");
    }

    public static final void g(ChaloBusComponent chaloBusComponent, ChaloBusViewState viewState, Function1 sendIntent, SheetState sheetState, boolean z, int i, Composer composer, int i2) {
        ChaloBusComponent chaloBusComponent2;
        int i3;
        boolean z2;
        boolean z3;
        int i4;
        Intrinsics.i(viewState, "viewState");
        PBStopSelectionScreenBottomSheetType pBStopSelectionScreenBottomSheetType = viewState.d;
        Intrinsics.i(sendIntent, "sendIntent");
        Composer composerStartRestartGroup = composer.startRestartGroup(2123448635);
        if ((i2 & 6) == 0) {
            chaloBusComponent2 = chaloBusComponent;
            i3 = (composerStartRestartGroup.changedInstance(chaloBusComponent2) ? 4 : 2) | i2;
        } else {
            chaloBusComponent2 = chaloBusComponent;
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(viewState) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(sendIntent) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i3 |= composerStartRestartGroup.changed(sheetState) ? 2048 : 1024;
        }
        if ((i2 & 24576) == 0) {
            i3 |= composerStartRestartGroup.changed(z) ? 16384 : 8192;
        }
        if ((196608 & i2) == 0) {
            i3 |= composerStartRestartGroup.changed(i) ? 131072 : 65536;
        }
        if (composerStartRestartGroup.shouldExecute((74899 & i3) != 74898, i3 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(2123448635, i3, -1, "app.chalo.home.ui.chalobus.ChaloBusScreenUI (ChaloBusScreenUI.kt:162)");
            }
            HomeTabScreensRetainedData.ChaloBusScreen chaloBusScreen = viewState.n;
            ScrollState scrollStateRememberScrollState = ScrollKt.rememberScrollState(chaloBusScreen != null ? chaloBusScreen.f3171a : 0, composerStartRestartGroup, 0, 0);
            if (pBStopSelectionScreenBottomSheetType instanceof PBStopSelectionScreenBottomSheetType.PremiumBusDateAndTimePickerBottomSheet) {
                z3 = false;
            } else {
                if (!(pBStopSelectionScreenBottomSheetType instanceof PBStopSelectionScreenBottomSheetType.MultipleOriginDestinationSelection) && !(pBStopSelectionScreenBottomSheetType instanceof PBStopSelectionScreenBottomSheetType.NewRouteSuggestion) && !Intrinsics.d(pBStopSelectionScreenBottomSheetType, PBStopSelectionScreenBottomSheetType.NewRouteSuggestionSubmitSuccess.f7958a) && !Intrinsics.d(pBStopSelectionScreenBottomSheetType, PBStopSelectionScreenBottomSheetType.NoOriginDestinationPairsAvailable.f7959a) && !Intrinsics.d(pBStopSelectionScreenBottomSheetType, PBStopSelectionScreenBottomSheetType.NoProductFoundBottomSheet.f7960a) && !(pBStopSelectionScreenBottomSheetType instanceof PBStopSelectionScreenBottomSheetType.PremiumPassSavingsFaqsBottomSheet) && pBStopSelectionScreenBottomSheetType != null) {
                    throw new NoWhenBranchMatchedException();
                }
                z3 = true;
            }
            boolean z4 = pBStopSelectionScreenBottomSheetType != null;
            float f = PlatformFeature.f10436a;
            boolean z5 = z && z4;
            int i5 = i3 & 896;
            boolean z6 = i5 == 256;
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (z6 || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new fh(sendIntent, 14);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            BackHandlerKt.a(z5, (Function0) objRememberedValue, 0, 0, composerStartRestartGroup, 2);
            if (pBStopSelectionScreenBottomSheetType == null) {
                composerStartRestartGroup.startReplaceGroup(-913596644);
                composerStartRestartGroup.endReplaceGroup();
                i4 = 256;
            } else {
                composerStartRestartGroup.startReplaceGroup(-913596643);
                boolean z7 = i5 == 256;
                Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                if (z7 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue2 = new fh(sendIntent, 15);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                }
                i4 = 256;
                ChaloRoundedBottomSheetKt.a(sheetState, (Function0) objRememberedValue2, z3, true, true, ComposableLambdaKt.rememberComposableLambda(-1645545562, true, new ob(3, pBStopSelectionScreenBottomSheetType, sendIntent, viewState), composerStartRestartGroup, 54), composerStartRestartGroup, ((i3 >> 9) & 14) | 224256, 0);
                composerStartRestartGroup = composerStartRestartGroup;
                composerStartRestartGroup.endReplaceGroup();
            }
            Modifier modifierFillMaxSize$default = SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null);
            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
            long currentCompositeKeyHashCode = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
            int i6 = (int) (currentCompositeKeyHashCode ^ (currentCompositeKeyHashCode >>> 32));
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
            pk0.v(companion, composerM3915constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy, composerM3915constructorimpl, currentCompositionLocalMap);
            Updater.m3923setimpl(composerM3915constructorimpl, modifierMaterializeModifier, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion, composerM3915constructorimpl, Integer.valueOf(i6), composerM3915constructorimpl));
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            int i7 = i3;
            e(chaloBusComponent2, viewState, scrollStateRememberScrollState, sendIntent, composerStartRestartGroup, (i3 & WebSocketProtocol.PAYLOAD_SHORT) | ((i3 << 3) & 7168));
            composerStartRestartGroup.endNode();
            HomeTabScreensRetainedData.ChaloBusScreen chaloBusScreen2 = viewState.n;
            Integer numValueOf = Integer.valueOf(i);
            Boolean boolValueOf = Boolean.valueOf(z);
            int i8 = i7 & 57344;
            boolean zChangedInstance = composerStartRestartGroup.changedInstance(viewState) | (i8 == 16384) | composerStartRestartGroup.changed(scrollStateRememberScrollState);
            Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                z2 = z;
                objRememberedValue3 = new ChaloBusScreenUIKt$ChaloBusScreenUI$4$1(z2, viewState, scrollStateRememberScrollState, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
            } else {
                z2 = z;
            }
            int i9 = i4;
            EffectsKt.LaunchedEffect(chaloBusScreen2, numValueOf, boolValueOf, (Function2) objRememberedValue3, composerStartRestartGroup, ((i7 >> 6) & 896) | ((i7 >> 12) & 112));
            Boolean boolValueOf2 = Boolean.valueOf(z2);
            boolean zChanged = (i8 == 16384) | (i5 == i9) | composerStartRestartGroup.changed(scrollStateRememberScrollState);
            Object objRememberedValue4 = composerStartRestartGroup.rememberedValue();
            if (zChanged || objRememberedValue4 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue4 = new ChaloBusScreenUIKt$ChaloBusScreenUI$5$1(z2, sendIntent, scrollStateRememberScrollState, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
            }
            EffectsKt.LaunchedEffect(scrollStateRememberScrollState, boolValueOf2, (Function2) objRememberedValue4, composerStartRestartGroup, (i7 >> 9) & 112);
            if (viewState.b) {
                composerStartRestartGroup.startReplaceGroup(-908906653);
                Composer composer2 = composerStartRestartGroup;
                ChaloLoadingDialogKt.b(null, false, null, composer2, 0, 7);
                composerStartRestartGroup = composer2;
            } else {
                composerStartRestartGroup.startReplaceGroup(-922732281);
            }
            composerStartRestartGroup.endReplaceGroup();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            z2 = z;
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new ph(chaloBusComponent, viewState, sendIntent, sheetState, z2, i, i2, 0));
        }
    }

    public static final void h(List list, Function1 function1, Composer composer, int i) {
        int i2;
        Composer composerStartRestartGroup = composer.startRestartGroup(1511056629);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(list) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(function1) ? 32 : 16;
        }
        if (composerStartRestartGroup.shouldExecute((i2 & 19) != 18, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1511056629, i2, -1, "app.chalo.home.ui.chalobus.ChaloBusTutorialsSection (ChaloBusScreenUI.kt:510)");
            }
            List list2 = !list.isEmpty() ? list : null;
            if (list2 == null) {
                composerStartRestartGroup.startReplaceGroup(335993954);
            } else {
                composerStartRestartGroup.startReplaceGroup(335993955);
                int i3 = i2 & 112;
                boolean z = i3 == 32;
                Object objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (z || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = new g0(function1, 19);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                Function1 function2 = (Function1) objRememberedValue;
                boolean z2 = i3 == 32;
                Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                if (z2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue2 = new fh(function1, 22);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                }
                n(0, composerStartRestartGroup, list2, (Function0) objRememberedValue2, function2);
            }
            composerStartRestartGroup.endReplaceGroup();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new kh(i, 2, list, function1));
        }
    }

    public static final void i(int i, int i2, Composer composer, Modifier modifier, List textList) {
        int i3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        vh vhVar;
        Intrinsics.i(textList, "textList");
        Composer composerStartRestartGroup = composer.startRestartGroup(1477742000);
        if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changedInstance(textList) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i4 = i2 & 2;
        if (i4 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changed(modifier) ? 32 : 16;
        }
        if (composerStartRestartGroup.shouldExecute((i3 & 19) != 18, i3 & 1)) {
            if (i4 != 0) {
                modifier = Modifier.INSTANCE;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1477742000, i3, -1, "app.chalo.home.ui.chalobus.ChangingTextAnimation (ChaloBusScreenUI.kt:1001)");
            }
            boolean zChanged = composerStartRestartGroup.changed(textList);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = CollectionsKt.D0(textList);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            List list = (List) objRememberedValue;
            if (list.isEmpty()) {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                } else {
                    vhVar = new vh(textList, modifier, i, i2, 0);
                }
            } else {
                boolean zChanged2 = composerStartRestartGroup.changed(textList);
                Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                if (zChanged2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue2 = SnapshotIntStateKt.mutableIntStateOf(0);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                }
                MutableIntState mutableIntState = (MutableIntState) objRememberedValue2;
                boolean zChangedInstance = composerStartRestartGroup.changedInstance(textList) | composerStartRestartGroup.changed(mutableIntState);
                Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                if (zChangedInstance || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue3 = new ChaloBusScreenUIKt$ChangingTextAnimation$2$1(textList, mutableIntState, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                }
                EffectsKt.LaunchedEffect(textList, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue3, composerStartRestartGroup, i3 & 14);
                int intValue = mutableIntState.getIntValue();
                String str = (String) ((intValue < 0 || intValue >= list.size()) ? (String) CollectionsKt.F(list) : list.get(intValue));
                Modifier modifierM786paddingVpY3zN4$default = PaddingKt.m786paddingVpY3zN4$default(SizeKt.wrapContentSize$default(modifier, Alignment.INSTANCE.getCenterStart(), false, 2, null), ChaloThemeHelper.a().h, 0.0f, 2, null);
                Object objRememberedValue4 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue4 == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue4 = new ah(15);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
                }
                AnimatedContentKt.AnimatedContent(str, modifierM786paddingVpY3zN4$default, (Function1) objRememberedValue4, null, "", null, ComposableSingletons$ChaloBusScreenUIKt.c, composerStartRestartGroup, 1597824, 40);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
            scopeUpdateScopeEndRestartGroup.updateScope(vhVar);
        }
        composerStartRestartGroup.skipToGroupEnd();
        Modifier modifier2 = modifier;
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            vhVar = new vh(textList, modifier2, i, i2, 1);
            scopeUpdateScopeEndRestartGroup.updateScope(vhVar);
        }
    }

    public static final void j(Composer composer, int i, String str) {
        int i2;
        Composer composer2;
        Composer composerStartRestartGroup = composer.startRestartGroup(1653986723);
        if ((i & 6) == 0) {
            i2 = i | (composerStartRestartGroup.changed(str) ? 4 : 2);
        } else {
            i2 = i;
        }
        if (composerStartRestartGroup.shouldExecute((i2 & 3) != 2, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1653986723, i2, -1, "app.chalo.home.ui.chalobus.CouponTagComposable (ChaloBusScreenUI.kt:1744)");
            }
            composer2 = composerStartRestartGroup;
            ProductOfferBadgeKt.a(new OfferTagUIState(new TextUIState.ChaloTextUIState(str, UITextStyle.LabelSmall, ChaloColorToken.DiscountPercentTextGreen.f9792a, 0, (UITextAlign) null, UIFontWeight.SemiBold, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8120), new ImageUIState(IconType.IC_OFFER_GREEN, (String) null, (ChaloColorToken) null, new ImageUISize(ChaloThemeHelper.a().h), (UIContentScale) null, 0.0f, (UiEventHandler) null, 246), 9), PaddingKt.m786paddingVpY3zN4$default(Modifier.INSTANCE, ChaloThemeHelper.a().h, 0.0f, 2, null), composer2, 0, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer2 = composerStartRestartGroup;
            composer2.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new qg(str, i, 2));
        }
    }

    public static final void k(List list, MutableState mutableState, Composer composer, int i) {
        int i2;
        Composer composerStartRestartGroup = composer.startRestartGroup(-410239921);
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
                ComposerKt.traceEventStart(-410239921, i2, -1, "app.chalo.home.ui.chalobus.MeasureItemHeights (ChaloBusScreenUI.kt:1433)");
            }
            boolean zChangedInstance = composerStartRestartGroup.changedInstance(list) | ((i2 & 112) == 32);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new th(list, mutableState, 0);
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
            scopeUpdateScopeEndRestartGroup.updateScope(new uh(list, mutableState, i, 0));
        }
    }

    public static final void l(ChaloBusPassHistory chaloBusPassHistory, String str, String str2, Composer composer, int i) {
        int i2;
        Composer composer2;
        int i3;
        int i4;
        Composer composer3;
        Composer composerStartRestartGroup = composer.startRestartGroup(446029879);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changed(chaloBusPassHistory) ? 4 : 2) | i;
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
                ComposerKt.traceEventStart(446029879, i2, -1, "app.chalo.home.ui.chalobus.PassRemainingRidesUI (ChaloBusScreenUI.kt:1619)");
            }
            Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null);
            MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getSpaceBetween(), Alignment.INSTANCE.getCenterVertically(), composerStartRestartGroup, 54);
            long currentCompositeKeyHashCode = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
            int i5 = (int) ((currentCompositeKeyHashCode >>> 32) ^ currentCompositeKeyHashCode);
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
            pk0.v(companion, composerM3915constructorimpl, measurePolicyRowMeasurePolicy, composerM3915constructorimpl, currentCompositionLocalMap);
            Updater.m3923setimpl(composerM3915constructorimpl, modifierMaterializeModifier, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion, composerM3915constructorimpl, Integer.valueOf(i5), composerM3915constructorimpl));
            RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
            if (chaloBusPassHistory.n) {
                composerStartRestartGroup.startReplaceGroup(-106450097);
                composerStartRestartGroup.startReplaceGroup(1243493424);
                AnnotatedString.Builder builder = new AnnotatedString.Builder(0, 1, null);
                composerStartRestartGroup.startReplaceGroup(1243494336);
                long j = ChaloTheme.a(composerStartRestartGroup, 0).e;
                FontWeight.Companion companion2 = FontWeight.INSTANCE;
                int iPushStyle = builder.pushStyle(new SpanStyle(j, TextUnitKt.getSp(12), companion2.getBold(), (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (PlatformSpanStyle) null, (DrawStyle) null, 65528, (DefaultConstructorMarker) null));
                try {
                    builder.append(StringResourcesHelperKt.c(StringEnum.UNLIMITED, new Object[0], composerStartRestartGroup, 6));
                    builder.pop(iPushStyle);
                    composerStartRestartGroup.endReplaceGroup();
                    composerStartRestartGroup.startReplaceGroup(1243506457);
                    int iPushStyle2 = builder.pushStyle(new SpanStyle(ChaloTheme.a(composerStartRestartGroup, 0).v0, TextUnitKt.getSp(12), companion2.getNormal(), (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (PlatformSpanStyle) null, (DrawStyle) null, 65528, (DefaultConstructorMarker) null));
                    try {
                        String lowerCase = StringResourcesHelperKt.c(StringEnum.RIDES_LEFT, new Object[0], composerStartRestartGroup, 6).toLowerCase(Locale.ROOT);
                        Intrinsics.h(lowerCase, "toLowerCase(...)");
                        builder.append(" ".concat(lowerCase));
                        builder.pop(iPushStyle2);
                        composerStartRestartGroup.endReplaceGroup();
                        AnnotatedString annotatedString = builder.toAnnotatedString();
                        composerStartRestartGroup.endReplaceGroup();
                        TextKt.m2624TextZ58ophY(annotatedString, null, 0L, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, null, composerStartRestartGroup, 0, 0, 524286);
                        composer3 = composerStartRestartGroup;
                        composer3.endReplaceGroup();
                        i3 = 0;
                        i4 = 6;
                    } catch (Throwable th) {
                        builder.pop(iPushStyle2);
                        throw th;
                    }
                } catch (Throwable th2) {
                    builder.pop(iPushStyle);
                    throw th2;
                }
            } else {
                i3 = 0;
                composerStartRestartGroup.startReplaceGroup(-105563869);
                composerStartRestartGroup.startReplaceGroup(1243522012);
                AnnotatedString.Builder builder2 = new AnnotatedString.Builder(0, 1, null);
                long j2 = ChaloTheme.a(composerStartRestartGroup, 0).e;
                FontWeight.Companion companion3 = FontWeight.INSTANCE;
                int iPushStyle3 = builder2.pushStyle(new SpanStyle(j2, TextUnitKt.getSp(20), companion3.getBold(), (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (PlatformSpanStyle) null, (DrawStyle) null, 65528, (DefaultConstructorMarker) null));
                try {
                    builder2.append((CharSequence) str);
                    builder2.pop(iPushStyle3);
                    composerStartRestartGroup.startReplaceGroup(1243534363);
                    int iPushStyle4 = builder2.pushStyle(new SpanStyle(ChaloTheme.a(composerStartRestartGroup, 0).v0, TextUnitKt.getSp(12), companion3.getNormal(), (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (PlatformSpanStyle) null, (DrawStyle) null, 65528, (DefaultConstructorMarker) null));
                    try {
                        builder2.append(" / " + str2 + " " + StringResourcesHelperKt.c(StringEnum.TRIPS_LEFT, new Object[0], composerStartRestartGroup, 6));
                        builder2.pop(iPushStyle4);
                        composerStartRestartGroup.endReplaceGroup();
                        AnnotatedString annotatedString2 = builder2.toAnnotatedString();
                        composerStartRestartGroup.endReplaceGroup();
                        i4 = 6;
                        TextKt.m2624TextZ58ophY(annotatedString2, null, 0L, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, null, composerStartRestartGroup, 0, 0, 524286);
                        composer3 = composerStartRestartGroup;
                        composer3.endReplaceGroup();
                    } catch (Throwable th3) {
                        builder2.pop(iPushStyle4);
                        throw th3;
                    }
                } catch (Throwable th4) {
                    builder2.pop(iPushStyle3);
                    throw th4;
                }
            }
            IconKt.m2070Iconww6aTOc(PainterResourceHelperKt.a(IconType.IC_ORANGE_TINT_ARROW, composer3, i4), "", (Modifier) null, ChaloTheme.a(composer3, i3).f1915a, composer3, Painter.$stable | 48, 4);
            composer2 = composer3;
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
            scopeUpdateScopeEndRestartGroup.updateScope(new s4(i, 13, chaloBusPassHistory, str, str2));
        }
    }

    public static final void m(PremiumBusTutorialConfigUiModel premiumBusTutorialConfigUiModel, Function0 function0, Modifier modifier, Composer composer, int i) {
        int i2;
        Composer composerStartRestartGroup = composer.startRestartGroup(-190957045);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changed(premiumBusTutorialConfigUiModel) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(function0) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= composerStartRestartGroup.changed(modifier) ? 256 : 128;
        }
        if (composerStartRestartGroup.shouldExecute((i2 & 147) != 146, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-190957045, i2, -1, "app.chalo.home.ui.chalobus.PremiumBusGuideCard (ChaloBusScreenUI.kt:648)");
            }
            int i3 = i2 << 6;
            PremiumBusTutorialCardKt.a(premiumBusTutorialConfigUiModel.c, premiumBusTutorialConfigUiModel.d, premiumBusTutorialConfigUiModel.b, function0, modifier, ChaloTheme.b(composerStartRestartGroup, 0).u, ChaloTheme.b(composerStartRestartGroup, 0).f, ChaloTheme.e(composerStartRestartGroup, 0).getBodySmall(), 1, null, ChaloTheme.b(composerStartRestartGroup, 0).m, composerStartRestartGroup, (i3 & 7168) | 100663296 | (i3 & 57344), 0, 512);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new s4(i, 12, premiumBusTutorialConfigUiModel, function0, modifier));
        }
    }

    public static final void n(int i, Composer composer, List list, Function0 function0, Function1 function1) {
        int i2;
        List list2;
        Composer composer2;
        Composer composerStartRestartGroup = composer.startRestartGroup(1741343722);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(list) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(function1) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(function0) ? 256 : 128;
        }
        if (composerStartRestartGroup.shouldExecute((i2 & 147) != 146, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1741343722, i2, -1, "app.chalo.home.ui.chalobus.PremiumBusGuideSection (ChaloBusScreenUI.kt:565)");
            }
            Modifier.Companion companion = Modifier.INSTANCE;
            Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null);
            Arrangement arrangement = Arrangement.INSTANCE;
            Arrangement.Vertical top = arrangement.getTop();
            Alignment.Companion companion2 = Alignment.INSTANCE;
            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(top, companion2.getStart(), composerStartRestartGroup, 0);
            long currentCompositeKeyHashCode = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
            int i3 = i2;
            int i4 = (int) (currentCompositeKeyHashCode ^ (currentCompositeKeyHashCode >>> 32));
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierFillMaxWidth$default);
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
            ChaloSpacersKt.a(ChaloTheme.b(composerStartRestartGroup, 0).l0, composerStartRestartGroup, 0);
            Modifier modifierM786paddingVpY3zN4$default = PaddingKt.m786paddingVpY3zN4$default(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), ChaloTheme.b(composerStartRestartGroup, 0).h, 0.0f, 2, null);
            MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(arrangement.getSpaceBetween(), companion2.getCenterVertically(), composerStartRestartGroup, 54);
            long currentCompositeKeyHashCode2 = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
            int i5 = (int) (currentCompositeKeyHashCode2 ^ (currentCompositeKeyHashCode2 >>> 32));
            CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierM786paddingVpY3zN4$default);
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
            Updater.m3923setimpl(composerM3915constructorimpl2, modifierMaterializeModifier2, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion3, composerM3915constructorimpl2, Integer.valueOf(i5), composerM3915constructorimpl2));
            RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
            composer2 = composerStartRestartGroup;
            TextKt.m2623TextNvy7gAk(StringResourcesHelperKt.c(StringEnum.CHALO_BUS_GUIDE, new Object[0], composerStartRestartGroup, 6), i41.a(rowScopeInstance, companion, 1.0f, false, 2, null), ChaloTheme.a(composerStartRestartGroup, 0).t0, null, 0L, null, null, null, 0L, null, null, 0L, TextOverflow.INSTANCE.m7226getEllipsisgIe3tQ8(), false, 1, 0, null, ChaloTypographyKt.a(ChaloTheme.e(composerStartRestartGroup, 0).getDisplaySmall()), composer2, 0, 24960, 110584);
            ChaloSpacersKt.w(composer2, 0);
            x(null, function0, composer2, (i3 >> 3) & 112, 1);
            composer2.endNode();
            ChaloSpacersKt.o(composer2, 0);
            list2 = list;
            BoxWithConstraintsKt.BoxWithConstraints(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), null, false, ComposableLambdaKt.rememberComposableLambda(1704627358, true, new ob(4, list2, function0, function1), composer2, 54), composer2, 3078, 6);
            composer2.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            list2 = list;
            composer2 = composerStartRestartGroup;
            composer2.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new rh(list2, function1, function0, i));
        }
    }

    public static final void o(int i, Composer composer, Modifier modifier, Function0 function0) {
        int i2;
        Composer composerStartRestartGroup = composer.startRestartGroup(1461323464);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changed(modifier) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(function0) ? 32 : 16;
        }
        if (composerStartRestartGroup.shouldExecute((i2 & 19) != 18, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1461323464, i2, -1, "app.chalo.home.ui.chalobus.PremiumBusGuideViewAllItem (ChaloBusScreenUI.kt:664)");
            }
            Modifier modifierM814height3ABfNKs = SizeKt.m814height3ABfNKs(modifier, ChaloTheme.b(composerStartRestartGroup, 0).V);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            Composer.Companion companion = Composer.INSTANCE;
            if (objRememberedValue == companion.getEmpty()) {
                objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            MutableInteractionSource mutableInteractionSource = (MutableInteractionSource) objRememberedValue;
            boolean z = (i2 & 112) == 32;
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (z || objRememberedValue2 == companion.getEmpty()) {
                objRememberedValue2 = new hb(function0, 18);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            Modifier modifierM295clickableO2vRcR0$default = ClickableKt.m295clickableO2vRcR0$default(modifierM814height3ABfNKs, mutableInteractionSource, null, false, null, null, (Function0) objRememberedValue2, 28, null);
            MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), Alignment.INSTANCE.getCenterVertically(), composerStartRestartGroup, 48);
            long currentCompositeKeyHashCode = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
            int i3 = (int) ((currentCompositeKeyHashCode >>> 32) ^ currentCompositeKeyHashCode);
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierM295clickableO2vRcR0$default);
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
            TextKt.m2623TextNvy7gAk(StringResourcesHelperKt.c(StringEnum.VIEW_ALL, new Object[0], composerStartRestartGroup, 6), null, ChaloTheme.a(composerStartRestartGroup, 0).f1915a, null, 0L, null, FontWeight.INSTANCE.getSemiBold(), null, 0L, null, null, 0L, 0, false, 0, 0, null, ChaloTheme.e(composerStartRestartGroup, 0).getBodySmall(), composerStartRestartGroup, 1572864, 0, 131002);
            composerStartRestartGroup = composerStartRestartGroup;
            ChaloSpacersKt.B(composerStartRestartGroup, 0);
            IconKt.m2070Iconww6aTOc(PainterResourceHelperKt.a(IconType.IC_ORANGE_TINT_ARROW, composerStartRestartGroup, 6), (String) null, (Modifier) null, ChaloTheme.a(composerStartRestartGroup, 0).f1915a, composerStartRestartGroup, Painter.$stable | 48, 4);
            composerStartRestartGroup.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new gb(modifier, function0, i, 3));
        }
    }

    public static final void p(List faqs, Function0 function0, Composer composer, int i) {
        int i2;
        Composer composer2;
        int i3;
        Function0 onDismiss = function0;
        Intrinsics.i(faqs, "faqs");
        Intrinsics.i(onDismiss, "onDismiss");
        Composer composerStartRestartGroup = composer.startRestartGroup(1402094940);
        if ((i & 6) == 0) {
            i2 = i | (composerStartRestartGroup.changedInstance(faqs) ? 4 : 2);
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(onDismiss) ? 32 : 16;
        }
        if (composerStartRestartGroup.shouldExecute((i2 & 19) != 18, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1402094940, i2, -1, "app.chalo.home.ui.chalobus.PremiumPassSavingsFaqsBottomSheetComposable (ChaloBusScreenUI.kt:1685)");
            }
            Modifier.Companion companion = Modifier.INSTANCE;
            Modifier modifierM784padding3ABfNKs = PaddingKt.m784padding3ABfNKs(SizeKt.fillMaxWidth$default(ScrollKt.verticalScroll$default(BackgroundKt.m264backgroundbw27NRU$default(companion, ChaloTheme.a(composerStartRestartGroup, 0).t, null, 2, null), ScrollKt.rememberScrollState(0, composerStartRestartGroup, 0, 1), false, null, false, 14, null), 0.0f, 1, null), ChaloTheme.b(composerStartRestartGroup, 0).h);
            Arrangement.Vertical top = Arrangement.INSTANCE.getTop();
            Alignment.Companion companion2 = Alignment.INSTANCE;
            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(top, companion2.getStart(), composerStartRestartGroup, 0);
            long currentCompositeKeyHashCode = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
            int i4 = (int) (currentCompositeKeyHashCode ^ (currentCompositeKeyHashCode >>> 32));
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierM784padding3ABfNKs);
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
            Painter painterA = PainterResourceHelperKt.a(IconType.IC_CLOSE, composerStartRestartGroup, 6);
            Modifier modifierAlign = columnScopeInstance.align(companion, companion2.getEnd());
            int i5 = i2 & 112;
            boolean z = i5 == 32;
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (z || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new hb(onDismiss, 14);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            IconKt.m2070Iconww6aTOc(painterA, (String) null, ClickableKt.m299clickableoSLSa3U$default(modifierAlign, false, null, null, null, (Function0) objRememberedValue, 15, null), ChaloTheme.a(composerStartRestartGroup, 0).v0, composerStartRestartGroup, Painter.$stable | 48, 0);
            ChaloSpacersKt.o(composerStartRestartGroup, 0);
            float f = 0.0f;
            i3 = 0;
            TextKt.m2623TextNvy7gAk(StringResourcesHelperKt.c(StringEnum.HOW_DOES_SAVINGS_TRACKER_WORK, new Object[0], composerStartRestartGroup, 6), null, 0L, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ChaloTypographyKt.a(TextStyle.m6753copyp1EtxEg$default(ChaloTypographyKt.e(ChaloTheme.e(composerStartRestartGroup, 0)), 0L, TextUnitKt.getSp(24), null, null, null, null, null, 0L, null, null, null, 0L, null, null, null, 0, 0, 0L, null, null, null, 0, 0, null, 16777213, null)), composerStartRestartGroup, 0, 0, 131070);
            Composer composer3 = composerStartRestartGroup;
            ChaloSpacersKt.p(composer3, 0);
            composer3.startReplaceGroup(-1408291394);
            Iterator it = faqs.iterator();
            while (it.hasNext()) {
                PassSavingFaqs passSavingFaqs = (PassSavingFaqs) it.next();
                Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(Modifier.INSTANCE, f, 1, null);
                MeasurePolicy measurePolicyColumnMeasurePolicy2 = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composer3, 0);
                long currentCompositeKeyHashCode2 = ComposablesKt.getCurrentCompositeKeyHashCode(composer3, 0);
                int i6 = (int) (currentCompositeKeyHashCode2 ^ (currentCompositeKeyHashCode2 >>> 32));
                CompositionLocalMap currentCompositionLocalMap2 = composer3.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(composer3, modifierFillMaxWidth$default);
                ComposeUiNode.Companion companion4 = ComposeUiNode.INSTANCE;
                Function0<ComposeUiNode> constructor2 = companion4.getConstructor();
                if (composer3.getApplier() == null) {
                    ComposablesKt.invalidApplier();
                }
                composer3.startReusableNode();
                if (composer3.getInserting()) {
                    composer3.createNode(constructor2);
                } else {
                    composer3.useNode();
                }
                Composer composerM3915constructorimpl2 = Updater.m3915constructorimpl(composer3);
                pk0.v(companion4, composerM3915constructorimpl2, measurePolicyColumnMeasurePolicy2, composerM3915constructorimpl2, currentCompositionLocalMap2);
                Updater.m3923setimpl(composerM3915constructorimpl2, modifierMaterializeModifier2, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion4, composerM3915constructorimpl2, Integer.valueOf(i6), composerM3915constructorimpl2));
                ColumnScopeInstance columnScopeInstance2 = ColumnScopeInstance.INSTANCE;
                Composer composer4 = composer3;
                TextKt.m2623TextNvy7gAk(passSavingFaqs.f2369a, null, ChaloTheme.a(composer3, 0).t0, null, 0L, null, FontWeight.INSTANCE.getSemiBold(), null, 0L, null, null, 0L, 0, false, 0, 0, null, ChaloTypographyKt.d(ChaloTheme.e(composer3, 0)), composer4, 1572864, 0, 131002);
                ChaloSpacersKt.t(composer4, 0);
                TextKt.m2623TextNvy7gAk(passSavingFaqs.b, null, ChaloTheme.a(composer4, 0).v0, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ChaloTypographyKt.d(ChaloTheme.e(composer4, 0)), composer4, 0, 0, 131066);
                composer3 = composer4;
                ChaloSpacersKt.o(composer3, 0);
                composer3.endNode();
                f = 0.0f;
            }
            composer3.endReplaceGroup();
            ChaloSpacersKt.o(composer3, 0);
            String strC = StringResourcesHelperKt.c(StringEnum.GOT_IT, new Object[0], composer3, 6);
            Modifier modifierFillMaxWidth$default2 = SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null);
            Shape shape = ChaloTheme.d(composer3, 0).g;
            boolean z2 = i5 == 32;
            Object objRememberedValue2 = composer3.rememberedValue();
            if (z2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue2 = new hb(function0, 15);
                composer3.updateRememberedValue(objRememberedValue2);
            }
            Composer composer5 = composer3;
            onDismiss = function0;
            ChaloFilledButtonKt.g(modifierFillMaxWidth$default2, strC, null, 0L, shape, false, 0.0f, null, 0L, (Function0) objRememberedValue2, composer5, 6, 492);
            composer2 = composer5;
            composer2.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer2 = composerStartRestartGroup;
            i3 = 0;
            composer2.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new nh(faqs, onDismiss, i, i3));
        }
    }

    public static final void q(final ChaloBusComponent chaloBusComponent, final ProductPurchaseNudgeDisplayInfo productPurchaseNudgeDisplayInfo, final float f, final boolean z, final Function0 function0, final Modifier modifier, Composer composer, final int i) {
        int i2;
        final Function0 function1;
        Composer composer2;
        Composer composerStartRestartGroup = composer.startRestartGroup(2078716048);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(chaloBusComponent) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changed(productPurchaseNudgeDisplayInfo) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= composerStartRestartGroup.changed(f) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= composerStartRestartGroup.changed(z) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            function1 = function0;
            i2 |= composerStartRestartGroup.changedInstance(function1) ? 16384 : 8192;
        } else {
            function1 = function0;
        }
        if ((196608 & i) == 0) {
            i2 |= composerStartRestartGroup.changed(modifier) ? 131072 : 65536;
        }
        if (composerStartRestartGroup.shouldExecute((74899 & i2) != 74898, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(2078716048, i2, -1, "app.chalo.home.ui.chalobus.ProductPurchaseNudgeCard (ChaloBusScreenUI.kt:778)");
            }
            composer2 = composerStartRestartGroup;
            ChaloRoundedCardKt.b(SizeKt.m833width3ABfNKs(modifier, f), ChaloTheme.d(composerStartRestartGroup, 0).d, ChaloTheme.c(composerStartRestartGroup, 0).c, 0.0f, ComposableLambdaKt.rememberComposableLambda(-601035601, true, new Function3() { // from class: xh
                @Override // kotlin.jvm.functions.Function3
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    ColumnScope ChaloRoundedCard = (ColumnScope) obj;
                    Composer composer3 = (Composer) obj2;
                    int iIntValue = ((Integer) obj3).intValue();
                    Intrinsics.i(ChaloRoundedCard, "$this$ChaloRoundedCard");
                    if (composer3.shouldExecute((iIntValue & 17) != 16, iIntValue & 1)) {
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-601035601, iIntValue, -1, "app.chalo.home.ui.chalobus.ProductPurchaseNudgeCard.<anonymous> (ChaloBusScreenUI.kt:785)");
                        }
                        Function0 function2 = function1;
                        boolean zChanged = composer3.changed(function2);
                        Object objRememberedValue = composer3.rememberedValue();
                        if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = new hb(function2, 19);
                            composer3.updateRememberedValue(objRememberedValue);
                        }
                        Modifier modifierM299clickableoSLSa3U$default = ClickableKt.m299clickableoSLSa3U$default(modifier, false, null, null, null, (Function0) objRememberedValue, 15, null);
                        Arrangement arrangement = Arrangement.INSTANCE;
                        Arrangement.HorizontalOrVertical spaceBetween = arrangement.getSpaceBetween();
                        Alignment.Companion companion = Alignment.INSTANCE;
                        MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(spaceBetween, companion.getStart(), composer3, 6);
                        long currentCompositeKeyHashCode = ComposablesKt.getCurrentCompositeKeyHashCode(composer3, 0);
                        int i3 = (int) (currentCompositeKeyHashCode ^ (currentCompositeKeyHashCode >>> 32));
                        CompositionLocalMap currentCompositionLocalMap = composer3.getCurrentCompositionLocalMap();
                        Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composer3, modifierM299clickableoSLSa3U$default);
                        ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
                        Function0<ComposeUiNode> constructor = companion2.getConstructor();
                        if (composer3.getApplier() == null) {
                            ComposablesKt.invalidApplier();
                        }
                        composer3.startReusableNode();
                        if (composer3.getInserting()) {
                            composer3.createNode(constructor);
                        } else {
                            composer3.useNode();
                        }
                        Composer composerM3915constructorimpl = Updater.m3915constructorimpl(composer3);
                        pk0.v(companion2, composerM3915constructorimpl, measurePolicyColumnMeasurePolicy, composerM3915constructorimpl, currentCompositionLocalMap);
                        Updater.m3923setimpl(composerM3915constructorimpl, modifierMaterializeModifier, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion2, composerM3915constructorimpl, Integer.valueOf(i3), composerM3915constructorimpl));
                        ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
                        ProductPurchaseNudgeDisplayInfo productPurchaseNudgeDisplayInfo2 = productPurchaseNudgeDisplayInfo;
                        Long l = productPurchaseNudgeDisplayInfo2.g;
                        PricingEngineRuleExpiryBannerUIState pricingEngineRuleExpiryBannerUIState = productPurchaseNudgeDisplayInfo2.h;
                        if (l == null || pricingEngineRuleExpiryBannerUIState == null) {
                            if (z) {
                                composer3.startReplaceGroup(352726276);
                                ChaloSpacersKt.f(composer3, 0);
                            } else {
                                composer3.startReplaceGroup(320210717);
                            }
                            composer3.endReplaceGroup();
                        } else {
                            composer3.startReplaceGroup(352440673);
                            ChaloBusScreenUIKt.r(chaloBusComponent, productPurchaseNudgeDisplayInfo2.g, pricingEngineRuleExpiryBannerUIState, composer3, 0);
                            composer3.endReplaceGroup();
                        }
                        SingletonSubcomposeAsyncImageKt.a(productPurchaseNudgeDisplayInfo2.e, productPurchaseNudgeDisplayInfo2.f3298a, null, ComposableSingletons$ChaloBusScreenUIKt.f3287a, ComposableSingletons$ChaloBusScreenUIKt.b, ComposableLambdaKt.rememberComposableLambda(-1777050526, true, new o4(productPurchaseNudgeDisplayInfo2, 2), composer3, 54), null, null, companion.getTopCenter(), ContentScale.INSTANCE.getFillWidth(), composer3, 1794048, 54, 62348);
                        ChaloSpacersKt.o(composer3, 0);
                        String str = productPurchaseNudgeDisplayInfo2.c;
                        if (str == null) {
                            composer3.startReplaceGroup(355334212);
                        } else {
                            composer3.startReplaceGroup(355334213);
                            Modifier.Companion companion3 = Modifier.INSTANCE;
                            SpacerKt.Spacer(dq.a(columnScopeInstance, companion3, 1.0f, false, 2, null), composer3, 0);
                            String str2 = productPurchaseNudgeDisplayInfo2.f;
                            if (str2 == null || StringsKt.F(str2)) {
                                str2 = null;
                            }
                            if (str2 == null) {
                                composer3.startReplaceGroup(-1511415857);
                            } else {
                                composer3.startReplaceGroup(-1511415856);
                                ChaloBusScreenUIKt.j(composer3, 0, str2);
                                ChaloSpacersKt.t(composer3, 0);
                            }
                            composer3.endReplaceGroup();
                            Modifier modifierM786paddingVpY3zN4$default = PaddingKt.m786paddingVpY3zN4$default(companion3, ChaloTheme.b(composer3, 0).h, 0.0f, 2, null);
                            MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(arrangement.getStart(), companion.getCenterVertically(), composer3, 48);
                            long currentCompositeKeyHashCode2 = ComposablesKt.getCurrentCompositeKeyHashCode(composer3, 0);
                            int i4 = (int) (currentCompositeKeyHashCode2 ^ (currentCompositeKeyHashCode2 >>> 32));
                            CompositionLocalMap currentCompositionLocalMap2 = composer3.getCurrentCompositionLocalMap();
                            Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(composer3, modifierM786paddingVpY3zN4$default);
                            Function0<ComposeUiNode> constructor2 = companion2.getConstructor();
                            if (composer3.getApplier() == null) {
                                ComposablesKt.invalidApplier();
                            }
                            composer3.startReusableNode();
                            if (composer3.getInserting()) {
                                composer3.createNode(constructor2);
                            } else {
                                composer3.useNode();
                            }
                            Composer composerM3915constructorimpl2 = Updater.m3915constructorimpl(composer3);
                            pk0.v(companion2, composerM3915constructorimpl2, measurePolicyRowMeasurePolicy, composerM3915constructorimpl2, currentCompositionLocalMap2);
                            Updater.m3923setimpl(composerM3915constructorimpl2, modifierMaterializeModifier2, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion2, composerM3915constructorimpl2, Integer.valueOf(i4), composerM3915constructorimpl2));
                            RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
                            TextKt.m2623TextNvy7gAk(str, null, ChaloTheme.a(composer3, 0).f1915a, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, TextStyle.m6753copyp1EtxEg$default(ChaloTheme.e(composer3, 0).getBodyMedium(), 0L, 0L, FontWeight.INSTANCE.getBold(), null, null, null, null, 0L, null, null, null, 0L, null, null, null, 0, 0, 0L, null, null, null, 0, 0, null, 16777211, null), composer3, 0, 0, 131066);
                            composer3 = composer3;
                            ChaloSpacersKt.w(composer3, 0);
                            IconKt.m2070Iconww6aTOc(PainterResourceHelperKt.a(IconType.IC_ORANGE_TINT_ARROW, composer3, 6), (String) null, (Modifier) null, ChaloTheme.a(composer3, 0).f1915a, composer3, Painter.$stable | 48, 4);
                            composer3.endNode();
                            ChaloSpacersKt.o(composer3, 0);
                        }
                        composer3.endReplaceGroup();
                        composer3.endNode();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    } else {
                        composer3.skipToGroupEnd();
                    }
                    return Unit.f17538a;
                }
            }, composerStartRestartGroup, 54), composer2, 24576, 8);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer2 = composerStartRestartGroup;
            composer2.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: yh
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    ChaloBusScreenUIKt.q(chaloBusComponent, productPurchaseNudgeDisplayInfo, f, z, function0, modifier, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(i | 1));
                    return Unit.f17538a;
                }
            });
        }
    }

    public static final void r(final ChaloBusComponent chaloBusComponent, final Long l, final PricingEngineRuleExpiryBannerUIState pricingEngineRuleExpiryBannerUIState, Composer composer, final int i) {
        int i2;
        PricingEngineRuleExpiryBannerUIState pricingEngineRuleExpiryBannerUIState2;
        Composer composer2;
        Composer composerStartRestartGroup = composer.startRestartGroup(1997461791);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(chaloBusComponent) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changed(l) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            pricingEngineRuleExpiryBannerUIState2 = pricingEngineRuleExpiryBannerUIState;
            i2 |= composerStartRestartGroup.changed(pricingEngineRuleExpiryBannerUIState2) ? 256 : 128;
        } else {
            pricingEngineRuleExpiryBannerUIState2 = pricingEngineRuleExpiryBannerUIState;
        }
        if (composerStartRestartGroup.shouldExecute((i2 & 147) != 146, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1997461791, i2, -1, "app.chalo.home.ui.chalobus.ProductPurchaseNudgeExpiryBanner (ChaloBusScreenUI.kt:889)");
            }
            if (l == null) {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                    final int i3 = 0;
                    final PricingEngineRuleExpiryBannerUIState pricingEngineRuleExpiryBannerUIState3 = pricingEngineRuleExpiryBannerUIState2;
                    scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: zh
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            int i4 = i3;
                            Composer composer3 = (Composer) obj;
                            ((Integer) obj2).intValue();
                            switch (i4) {
                                case 0:
                                    ChaloBusScreenUIKt.r(chaloBusComponent, l, pricingEngineRuleExpiryBannerUIState3, composer3, RecomposeScopeImplKt.updateChangedFlags(i | 1));
                                    break;
                                default:
                                    ChaloBusScreenUIKt.r(chaloBusComponent, l, pricingEngineRuleExpiryBannerUIState3, composer3, RecomposeScopeImplKt.updateChangedFlags(i | 1));
                                    break;
                            }
                            return Unit.f17538a;
                        }
                    });
                    return;
                }
                return;
            }
            boolean zChanged = composerStartRestartGroup.changed(chaloBusComponent) | ((i2 & 112) == 32);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                long jLongValue = l.longValue();
                PricingEngineRuleExpiryTickerDelegate pricingEngineRuleExpiryTickerDelegate = chaloBusComponent.T;
                ChaloPadding chaloPadding = new ChaloPadding(ChaloThemeHelper.a().e, ChaloThemeHelper.a().f, ChaloThemeHelper.a().f, ChaloThemeHelper.a().e);
                UIShape backgroundShape = ChaloThemeHelper.d.b;
                pricingEngineRuleExpiryTickerDelegate.getClass();
                Intrinsics.i(backgroundShape, "backgroundShape");
                PricingEngineRuleExpiryTickerDelegate$bannerFlow$$inlined$map$1 pricingEngineRuleExpiryTickerDelegate$bannerFlow$$inlined$map$1 = new PricingEngineRuleExpiryTickerDelegate$bannerFlow$$inlined$map$1(new FlowKt__TransformKt$filterNotNull$$inlined$unsafeTransform$1(pricingEngineRuleExpiryTickerDelegate.d), pricingEngineRuleExpiryTickerDelegate, jLongValue, chaloPadding, backgroundShape);
                composerStartRestartGroup.updateRememberedValue(pricingEngineRuleExpiryTickerDelegate$bannerFlow$$inlined$map$1);
                objRememberedValue = pricingEngineRuleExpiryTickerDelegate$bannerFlow$$inlined$map$1;
            }
            composer2 = composerStartRestartGroup;
            PricingEngineRuleExpiryBannerUIState pricingEngineRuleExpiryBannerUIState4 = (PricingEngineRuleExpiryBannerUIState) SnapshotStateKt.collectAsState((Flow) objRememberedValue, pricingEngineRuleExpiryBannerUIState, null, composer2, (i2 >> 3) & 112, 2).getValue();
            if (pricingEngineRuleExpiryBannerUIState4 == null) {
                composer2.startReplaceGroup(-387240459);
            } else {
                composer2.startReplaceGroup(-387240458);
                PricingEngineRuleExpiryBannerKt.a(pricingEngineRuleExpiryBannerUIState4, SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), composer2, 48);
            }
            composer2.endReplaceGroup();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer2 = composerStartRestartGroup;
            composer2.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup2 = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup2 != null) {
            final int i4 = 1;
            scopeUpdateScopeEndRestartGroup2.updateScope(new Function2() { // from class: zh
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    int i5 = i4;
                    Composer composer3 = (Composer) obj;
                    ((Integer) obj2).intValue();
                    switch (i5) {
                        case 0:
                            ChaloBusScreenUIKt.r(chaloBusComponent, l, pricingEngineRuleExpiryBannerUIState, composer3, RecomposeScopeImplKt.updateChangedFlags(i | 1));
                            break;
                        default:
                            ChaloBusScreenUIKt.r(chaloBusComponent, l, pricingEngineRuleExpiryBannerUIState, composer3, RecomposeScopeImplKt.updateChangedFlags(i | 1));
                            break;
                    }
                    return Unit.f17538a;
                }
            });
        }
    }

    public static final void s(ProductPurchaseNudgeInfoCtaType productPurchaseNudgeInfoCtaType, Function1 function1, Composer composer, int i) {
        int i2;
        Composer composer2;
        String strC;
        Composer composerStartRestartGroup = composer.startRestartGroup(1193842058);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changed(productPurchaseNudgeInfoCtaType == null ? -1 : productPurchaseNudgeInfoCtaType.ordinal()) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(function1) ? 32 : 16;
        }
        if (composerStartRestartGroup.shouldExecute((i2 & 19) != 18, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1193842058, i2, -1, "app.chalo.home.ui.chalobus.ProductPurchaseNudgeInfoCta (ChaloBusScreenUI.kt:977)");
            }
            if (productPurchaseNudgeInfoCtaType == null) {
                composerStartRestartGroup.startReplaceGroup(-875241398);
                composerStartRestartGroup.endReplaceGroup();
                composer2 = composerStartRestartGroup;
            } else {
                composerStartRestartGroup.startReplaceGroup(-875241397);
                ChaloSpacersKt.o(composerStartRestartGroup, 0);
                int i3 = WhenMappings.b[productPurchaseNudgeInfoCtaType.ordinal()];
                if (i3 == 1) {
                    composerStartRestartGroup.startReplaceGroup(-1093278200);
                    strC = StringResourcesHelperKt.c(StringEnum.VIEW_ALL_PASSES, new Object[0], composerStartRestartGroup, 6);
                    composerStartRestartGroup.endReplaceGroup();
                } else {
                    if (i3 != 2) {
                        throw pk0.p(composerStartRestartGroup, -1093280624);
                    }
                    composerStartRestartGroup.startReplaceGroup(-1093274345);
                    strC = StringResourcesHelperKt.c(StringEnum.EXPLORE_CHALO_BUS_PASSES, new Object[0], composerStartRestartGroup, 6);
                    composerStartRestartGroup.endReplaceGroup();
                }
                long jC = ChaloColorTokenKt.c(ChaloColorToken.OrangePrimary.f9835a);
                TextStyle bodyMedium = ChaloTheme.e(composerStartRestartGroup, 0).getBodyMedium();
                FontWeight bold = FontWeight.INSTANCE.getBold();
                Modifier modifierM786paddingVpY3zN4$default = PaddingKt.m786paddingVpY3zN4$default(Modifier.INSTANCE, ChaloTheme.b(composerStartRestartGroup, 0).h, 0.0f, 2, null);
                boolean z = ((i2 & 112) == 32) | ((i2 & 14) == 4);
                Object objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (z || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = new l3(25, function1, productPurchaseNudgeInfoCtaType);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                composer2 = composerStartRestartGroup;
                TextKt.m2623TextNvy7gAk(strC, ClickableKt.m299clickableoSLSa3U$default(modifierM786paddingVpY3zN4$default, false, null, null, null, (Function0) objRememberedValue, 15, null), jC, null, 0L, null, bold, null, 0L, null, null, 0L, 0, false, 0, 0, null, bodyMedium, composer2, 1572864, 0, 131000);
                composer2.endReplaceGroup();
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer2 = composerStartRestartGroup;
            composer2.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new b0(productPurchaseNudgeInfoCtaType, function1, i, 17));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void t(ProductPurchaseNudgeInfo productPurchaseNudgeInfo, Function1 onSectionCtaClick, Composer composer, int i) {
        int i2;
        Intrinsics.i(onSectionCtaClick, "onSectionCtaClick");
        Composer composerStartRestartGroup = composer.startRestartGroup(-411605271);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(productPurchaseNudgeInfo) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(onSectionCtaClick) ? 32 : 16;
        }
        if (composerStartRestartGroup.shouldExecute((i2 & 19) != 18, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-411605271, i2, -1, "app.chalo.home.ui.chalobus.ProductPurchaseNudgeInfoDefaultUI (ChaloBusScreenUI.kt:904)");
            }
            Density density = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            Composer.Companion companion = Composer.INSTANCE;
            if (objRememberedValue == companion.getEmpty()) {
                objRememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            MutableState mutableState = (MutableState) objRememberedValue;
            Modifier.Companion companion2 = Modifier.INSTANCE;
            Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(companion2, 0.0f, 1, null);
            Arrangement arrangement = Arrangement.INSTANCE;
            Arrangement.Vertical top = arrangement.getTop();
            Alignment.Companion companion3 = Alignment.INSTANCE;
            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(top, companion3.getStart(), composerStartRestartGroup, 0);
            long currentCompositeKeyHashCode = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
            int i3 = (int) (currentCompositeKeyHashCode ^ (currentCompositeKeyHashCode >>> 32));
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierFillMaxWidth$default);
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
            Updater.m3923setimpl(composerM3915constructorimpl, modifierMaterializeModifier, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion4, composerM3915constructorimpl, Integer.valueOf(i3), composerM3915constructorimpl));
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
            if (((Boolean) mutableState.getValue()).booleanValue()) {
                composerStartRestartGroup.startReplaceGroup(-378812696);
                ChaloSpacersKt.a(ChaloTheme.b(composerStartRestartGroup, 0).l0, composerStartRestartGroup, 0);
                Modifier modifierFillMaxWidth$default2 = SizeKt.fillMaxWidth$default(companion2, 0.0f, 1, null);
                MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(arrangement.getSpaceBetween(), companion3.getCenterVertically(), composerStartRestartGroup, 54);
                long currentCompositeKeyHashCode2 = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
                int i4 = (int) (currentCompositeKeyHashCode2 ^ (currentCompositeKeyHashCode2 >>> 32));
                CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierFillMaxWidth$default2);
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
                Updater.m3923setimpl(composerM3915constructorimpl2, modifierMaterializeModifier2, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion4, composerM3915constructorimpl2, Integer.valueOf(i4), composerM3915constructorimpl2));
                i(0, 0, composerStartRestartGroup, i41.a(RowScopeInstance.INSTANCE, companion2, 1.0f, false, 2, null), productPurchaseNudgeInfo.f3299a);
                ChaloSpacersKt.w(composerStartRestartGroup, 0);
                Modifier modifierM786paddingVpY3zN4$default = PaddingKt.m786paddingVpY3zN4$default(companion2, ChaloTheme.b(composerStartRestartGroup, 0).h, 0.0f, 2, null);
                boolean z = (i2 & 112) == 32;
                Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                if (z || objRememberedValue2 == companion.getEmpty()) {
                    objRememberedValue2 = new fh(onSectionCtaClick, 24);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                }
                x(modifierM786paddingVpY3zN4$default, (Function0) objRememberedValue2, composerStartRestartGroup, 0, 0);
                composerStartRestartGroup.endNode();
                ChaloSpacersKt.o(composerStartRestartGroup, 0);
            } else {
                composerStartRestartGroup.startReplaceGroup(-416080989);
            }
            composerStartRestartGroup.endReplaceGroup();
            boolean zChanged = composerStartRestartGroup.changed(density);
            Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
            if (zChanged || objRememberedValue3 == companion.getEmpty()) {
                objRememberedValue3 = new f0(density, mutableState, 7);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
            }
            app.chalo.compose.components.plotline.PlotlineComposeWidgetKt.a(6, 0, composerStartRestartGroup, OnGloballyPositionedModifierKt.onGloballyPositioned(companion2, (Function1) objRememberedValue3), "chalo_bus_tab_product_nudge_plotline_widget");
            composerStartRestartGroup.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new sh(productPurchaseNudgeInfo, onSectionCtaClick, i, 0));
        }
    }

    public static final void u(ProductPurchaseNudgeInfo productPurchaseNudgeInfo, Function1 onSectionCtaClick, Composer composer, int i) {
        int i2;
        Intrinsics.i(onSectionCtaClick, "onSectionCtaClick");
        Composer composerStartRestartGroup = composer.startRestartGroup(1593219876);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(productPurchaseNudgeInfo) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(onSectionCtaClick) ? 32 : 16;
        }
        if (composerStartRestartGroup.shouldExecute((i2 & 19) != 18, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1593219876, i2, -1, "app.chalo.home.ui.chalobus.ProductPurchaseNudgeInfoLoadingUI (ChaloBusScreenUI.kt:949)");
            }
            Modifier.Companion companion = Modifier.INSTANCE;
            Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null);
            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composerStartRestartGroup, 0);
            long currentCompositeKeyHashCode = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
            int i3 = (int) (currentCompositeKeyHashCode ^ (currentCompositeKeyHashCode >>> 32));
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
            Updater.m3923setimpl(composerM3915constructorimpl, modifierMaterializeModifier, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion2, composerM3915constructorimpl, Integer.valueOf(i3), composerM3915constructorimpl));
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
            ChaloSpacersKt.a(ChaloTheme.b(composerStartRestartGroup, 0).l0, composerStartRestartGroup, 0);
            composerStartRestartGroup.startReplaceGroup(816830719);
            i(0, 2, composerStartRestartGroup, null, productPurchaseNudgeInfo.f3299a);
            ChaloSpacersKt.o(composerStartRestartGroup, 0);
            composerStartRestartGroup.endReplaceGroup();
            int i4 = i2;
            ShimmerEffectKt.a(PaddingKt.m786paddingVpY3zN4$default(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), ChaloTheme.b(composerStartRestartGroup, 0).h, 0.0f, 2, null), ChaloThemeHelper.a().Y, 0.0f, ChaloThemeKt.d(ChaloThemeHelper.d.g), 0L, 0L, composerStartRestartGroup, 0, 52);
            ProductPurchaseNudgeInfoCtaType productPurchaseNudgeInfoCtaType = productPurchaseNudgeInfo.d;
            boolean z = (i4 & 112) == 32;
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (z || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new g0(onSectionCtaClick, 20);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            s(productPurchaseNudgeInfoCtaType, (Function1) objRememberedValue, composerStartRestartGroup, 0);
            composerStartRestartGroup.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new sh(productPurchaseNudgeInfo, onSectionCtaClick, i, 1));
        }
    }

    public static final void v(ChaloBusComponent chaloBusComponent, ProductPurchaseNudgeInfo productPurchaseNudgeInfo, Function1 onCardClick, Function1 onSectionCtaClick, Composer composer, int i) {
        int i2;
        Composer composer2;
        char c;
        boolean z;
        Dp dpM7276boximpl;
        Intrinsics.i(onCardClick, "onCardClick");
        Intrinsics.i(onSectionCtaClick, "onSectionCtaClick");
        Composer composerStartRestartGroup = composer.startRestartGroup(214922795);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(chaloBusComponent) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(productPurchaseNudgeInfo) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(onCardClick) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(onSectionCtaClick) ? 2048 : 1024;
        }
        if (composerStartRestartGroup.shouldExecute((i2 & 1171) != 1170, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(214922795, i2, -1, "app.chalo.home.ui.chalobus.ProductPurchaseNudgeInfoProductDetailUI (ChaloBusScreenUI.kt:695)");
            }
            List list = productPurchaseNudgeInfo.c;
            List listX0 = list != null ? CollectionsKt.x0(list, 3) : null;
            if (listX0 == null) {
                listX0 = EmptyList.f17557a;
            }
            List list2 = listX0;
            if (!(list2 instanceof Collection) || !list2.isEmpty()) {
                Iterator it = list2.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        c = ' ';
                        z = false;
                        break;
                    } else {
                        c = ' ';
                        if (((ProductPurchaseNudgeDisplayInfo) it.next()).g != null) {
                            z = true;
                            break;
                        }
                    }
                }
            } else {
                z = false;
                c = ' ';
            }
            ArrayList arrayList = new ArrayList(CollectionsKt.v(list2, 10));
            Iterator it2 = list2.iterator();
            while (it2.hasNext()) {
                arrayList.add(((ProductPurchaseNudgeDisplayInfo) it2.next()).b);
            }
            boolean zChanged = composerStartRestartGroup.changed(arrayList);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = SnapshotIntStateKt.mutableIntStateOf(0);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            MutableIntState mutableIntState = (MutableIntState) objRememberedValue;
            if (mutableIntState.getIntValue() > 0) {
                composerStartRestartGroup.startReplaceGroup(-1030670030);
                float fMo401toDpu2uoSUM = ((Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity())).mo401toDpu2uoSUM(mutableIntState.getIntValue());
                composerStartRestartGroup.endReplaceGroup();
                dpM7276boximpl = Dp.m7276boximpl(fMo401toDpu2uoSUM);
            } else {
                composerStartRestartGroup.startReplaceGroup(-1030597149);
                composerStartRestartGroup.endReplaceGroup();
                dpM7276boximpl = null;
            }
            Modifier.Companion companion = Modifier.INSTANCE;
            Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null);
            Arrangement arrangement = Arrangement.INSTANCE;
            Arrangement.Vertical top = arrangement.getTop();
            Alignment.Companion companion2 = Alignment.INSTANCE;
            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(top, companion2.getStart(), composerStartRestartGroup, 0);
            long currentCompositeKeyHashCode = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
            List list3 = listX0;
            int i3 = (int) (currentCompositeKeyHashCode ^ (currentCompositeKeyHashCode >>> c));
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierFillMaxWidth$default);
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
            ChaloSpacersKt.a(ChaloTheme.b(composerStartRestartGroup, 0).l0, composerStartRestartGroup, 0);
            composerStartRestartGroup.startReplaceGroup(1655427898);
            Modifier modifierFillMaxWidth$default2 = SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null);
            MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(arrangement.getStart(), companion2.getCenterVertically(), composerStartRestartGroup, 48);
            long currentCompositeKeyHashCode2 = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
            int i4 = (int) (currentCompositeKeyHashCode2 ^ (currentCompositeKeyHashCode2 >>> c));
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
            i(0, 0, composerStartRestartGroup, i41.a(RowScopeInstance.INSTANCE, companion, 1.0f, false, 2, null), productPurchaseNudgeInfo.f3299a);
            ChaloSpacersKt.w(composerStartRestartGroup, 0);
            Modifier modifierM786paddingVpY3zN4$default = PaddingKt.m786paddingVpY3zN4$default(companion, ChaloTheme.b(composerStartRestartGroup, 0).h, 0.0f, 2, null);
            boolean z2 = (i2 & 7168) == 2048;
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (z2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue2 = new fh(onSectionCtaClick, 25);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            x(modifierM786paddingVpY3zN4$default, (Function0) objRememberedValue2, composerStartRestartGroup, 0, 0);
            composerStartRestartGroup.endNode();
            ChaloSpacersKt.o(composerStartRestartGroup, 0);
            composerStartRestartGroup.endReplaceGroup();
            Modifier modifierFillMaxWidth$default3 = SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null);
            ComposableLambda composableLambdaRememberComposableLambda = ComposableLambdaKt.rememberComposableLambda(175766263, true, new nd(list3, chaloBusComponent, z, onCardClick, dpM7276boximpl, mutableIntState), composerStartRestartGroup, 54);
            composer2 = composerStartRestartGroup;
            BoxWithConstraintsKt.BoxWithConstraints(modifierFillMaxWidth$default3, null, false, composableLambdaRememberComposableLambda, composer2, 3078, 6);
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
            scopeUpdateScopeEndRestartGroup.updateScope(new u6(i, 7, chaloBusComponent, productPurchaseNudgeInfo, onCardClick, onSectionCtaClick));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v21, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r13v29 */
    /* JADX WARN: Type inference failed for: r13v34 */
    /* JADX WARN: Type inference failed for: r13v35 */
    /* JADX WARN: Type inference failed for: r13v36 */
    /* JADX WARN: Type inference failed for: r13v38 */
    /* JADX WARN: Type inference failed for: r13v39 */
    /* JADX WARN: Type inference failed for: r13v40 */
    /* JADX WARN: Type inference failed for: r13v45 */
    /* JADX WARN: Type inference failed for: r7v18 */
    /* JADX WARN: Type inference failed for: r7v19, types: [int] */
    /* JADX WARN: Type inference failed for: r7v2, types: [boolean] */
    /* JADX WARN: Type inference failed for: r7v20 */
    /* JADX WARN: Type inference failed for: r7v27 */
    /* JADX WARN: Type inference failed for: r7v28 */
    /* JADX WARN: Type inference failed for: r7v3 */
    /* JADX WARN: Type inference failed for: r7v5 */
    public static final void w(Function1 function1, boolean z, ChaloBusPageDisplayItemData chaloBusPageDisplayItemData, Density density, Composer composer, int i) {
        Composer composer2;
        Modifier.Companion companion;
        ComposeUiNode.Companion companion2;
        int i2;
        Arrangement arrangement;
        int i3;
        final int i4;
        float f;
        final Function1 function2;
        ?? r7;
        char c;
        int i5;
        boolean z2;
        ?? r8;
        final ChaloBusPageDisplayItemData chaloBusPageDisplayItemData2 = chaloBusPageDisplayItemData;
        Composer composerStartRestartGroup = composer.startRestartGroup(893051676);
        int i6 = (i & 6) == 0 ? (composerStartRestartGroup.changedInstance(function1) ? 4 : 2) | i : i;
        if ((i & 48) == 0) {
            i6 |= composerStartRestartGroup.changed(z) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i6 |= composerStartRestartGroup.changedInstance(chaloBusPageDisplayItemData2) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i6 |= composerStartRestartGroup.changed(density) ? 2048 : 1024;
        }
        if (composerStartRestartGroup.shouldExecute((i6 & 1171) != 1170, i6 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(893051676, i6, -1, "app.chalo.home.ui.chalobus.ProductPurchaseWidgetsUI (ChaloBusScreenUI.kt:1253)");
            }
            List<ChaloBusProductItemData> list = chaloBusPageDisplayItemData2.f;
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            Composer.Companion companion3 = Composer.INSTANCE;
            if (objRememberedValue == companion3.getEmpty()) {
                objRememberedValue = gf.b(0, null, 2, null, composerStartRestartGroup);
            }
            MutableState mutableState = (MutableState) objRememberedValue;
            Modifier.Companion companion4 = Modifier.INSTANCE;
            Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(companion4, 0.0f, 1, null);
            int i7 = i6 & 7168;
            boolean z3 = i7 == 2048;
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (z3 || objRememberedValue2 == companion3.getEmpty()) {
                objRememberedValue2 = new f0(density, mutableState, 5);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            Modifier modifierOnGloballyPositioned = OnGloballyPositionedModifierKt.onGloballyPositioned(modifierFillMaxWidth$default, (Function1) objRememberedValue2);
            Alignment.Companion companion5 = Alignment.INSTANCE;
            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(companion5.getTopStart(), false);
            long currentCompositeKeyHashCode = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
            int i8 = (int) (currentCompositeKeyHashCode ^ (currentCompositeKeyHashCode >>> 32));
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierOnGloballyPositioned);
            ComposeUiNode.Companion companion6 = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor = companion6.getConstructor();
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
            pk0.v(companion6, composerM3915constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy, composerM3915constructorimpl, currentCompositionLocalMap);
            Updater.m3923setimpl(composerM3915constructorimpl, modifierMaterializeModifier, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion6, composerM3915constructorimpl, Integer.valueOf(i8), composerM3915constructorimpl));
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            if (z) {
                composerStartRestartGroup.startReplaceGroup(1828594386);
                ChaloSectionHighlightKt.a(boxScopeInstance, ((Dp) mutableState.getValue()).m7292unboximpl(), composerStartRestartGroup, 6);
            } else {
                composerStartRestartGroup.startReplaceGroup(1777242080);
            }
            composerStartRestartGroup.endReplaceGroup();
            Modifier modifierM786paddingVpY3zN4$default = PaddingKt.m786paddingVpY3zN4$default(companion4, 0.0f, ChaloTheme.b(composerStartRestartGroup, 0).i, 1, null);
            Arrangement arrangement2 = Arrangement.INSTANCE;
            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(arrangement2.getTop(), companion5.getStart(), composerStartRestartGroup, 0);
            long currentCompositeKeyHashCode2 = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
            int i9 = (int) (currentCompositeKeyHashCode2 ^ (currentCompositeKeyHashCode2 >>> 32));
            CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierM786paddingVpY3zN4$default);
            Function0<ComposeUiNode> constructor2 = companion6.getConstructor();
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
            pk0.v(companion6, composerM3915constructorimpl2, measurePolicyColumnMeasurePolicy, composerM3915constructorimpl2, currentCompositionLocalMap2);
            Updater.m3923setimpl(composerM3915constructorimpl2, modifierMaterializeModifier2, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion6, composerM3915constructorimpl2, Integer.valueOf(i9), composerM3915constructorimpl2));
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
            String str = chaloBusPageDisplayItemData2.d;
            if (str == null) {
                composerStartRestartGroup.startReplaceGroup(-1026404422);
                composerStartRestartGroup.endReplaceGroup();
                composer2 = composerStartRestartGroup;
                companion = companion4;
                arrangement = arrangement2;
                companion2 = companion6;
                i2 = 0;
                i3 = 1;
            } else {
                composerStartRestartGroup.startReplaceGroup(-1026404421);
                companion = companion4;
                companion2 = companion6;
                i2 = 0;
                arrangement = arrangement2;
                i3 = 1;
                TextKt.m2623TextNvy7gAk(str, PaddingKt.m786paddingVpY3zN4$default(companion4, ChaloTheme.b(composerStartRestartGroup, 0).h, 0.0f, 2, null), 0L, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ChaloTypographyKt.a(ChaloTypographyKt.f(ChaloTheme.e(composerStartRestartGroup, 0))), composerStartRestartGroup, 0, 0, 131068);
                composer2 = composerStartRestartGroup;
                composer2.endReplaceGroup();
            }
            if (list == null) {
                composer2.startReplaceGroup(-1025924542);
                composer2.endReplaceGroup();
                function2 = function1;
                i4 = i3;
                i6 = i6;
                chaloBusPageDisplayItemData2 = chaloBusPageDisplayItemData2;
                r8 = i2;
                f = 0.0f;
            } else {
                composer2.startReplaceGroup(-1025924541);
                ChaloSpacersKt.p(composer2, i2);
                int size = list.size();
                if (size == i3) {
                    i4 = i3;
                    i6 = i6;
                    chaloBusPageDisplayItemData2 = chaloBusPageDisplayItemData2;
                    ?? r9 = i2;
                    Modifier.Companion companion7 = companion;
                    ComposeUiNode.Companion companion8 = companion2;
                    f = 0.0f;
                    function2 = function1;
                    composer2.startReplaceGroup(-168482030);
                    final ChaloBusProductItemData chaloBusProductItemData = (ChaloBusProductItemData) list.get(r9 == true ? 1 : 0);
                    Modifier modifierM786paddingVpY3zN4$default2 = PaddingKt.m786paddingVpY3zN4$default(SizeKt.fillMaxWidth$default(companion7, 0.0f, i4, null), ChaloTheme.b(composer2, r9 == true ? 1 : 0).h, 0.0f, 2, null);
                    MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy2 = BoxKt.maybeCachedBoxMeasurePolicy(companion5.getTopStart(), r9);
                    long currentCompositeKeyHashCode3 = ComposablesKt.getCurrentCompositeKeyHashCode(composer2, r9 == true ? 1 : 0);
                    int i10 = (int) (currentCompositeKeyHashCode3 ^ (currentCompositeKeyHashCode3 >>> 32));
                    CompositionLocalMap currentCompositionLocalMap3 = composer2.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier3 = ComposedModifierKt.materializeModifier(composer2, modifierM786paddingVpY3zN4$default2);
                    Function0<ComposeUiNode> constructor3 = companion8.getConstructor();
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
                    pk0.v(companion8, composerM3915constructorimpl3, measurePolicyMaybeCachedBoxMeasurePolicy2, composerM3915constructorimpl3, currentCompositionLocalMap3);
                    Updater.m3923setimpl(composerM3915constructorimpl3, modifierMaterializeModifier3, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion8, composerM3915constructorimpl3, Integer.valueOf(i10), composerM3915constructorimpl3));
                    MutableInteractionSource mutableInteractionSourceB = RippleEffectKt.b(composer2);
                    IndicationNodeFactory indicationNodeFactoryA = RippleEffectKt.a(composer2);
                    int i11 = (composer2.changedInstance(chaloBusPageDisplayItemData2) ? 1 : 0) | ((i6 & 14) == 4 ? i4 : r9 == true ? 1 : 0) | (composer2.changedInstance(chaloBusProductItemData) ? 1 : 0);
                    Object objRememberedValue3 = composer2.rememberedValue();
                    if (i11 != 0 || objRememberedValue3 == companion3.getEmpty()) {
                        final int i12 = r9 == true ? 1 : 0;
                        objRememberedValue3 = new Function0() { // from class: oh
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                switch (i12) {
                                    case 0:
                                        function2.invoke(new ChaloBusViewIntent.ChaloBusPageItemClickedIntent(chaloBusPageDisplayItemData2.h, chaloBusProductItemData.b));
                                        break;
                                    default:
                                        function2.invoke(new ChaloBusViewIntent.ChaloBusPageItemClickedIntent(chaloBusPageDisplayItemData2.h, chaloBusProductItemData.b));
                                        break;
                                }
                                return Unit.f17538a;
                            }
                        };
                        composer2.updateRememberedValue(objRememberedValue3);
                    }
                    Modifier modifierM295clickableO2vRcR0$default = ClickableKt.m295clickableO2vRcR0$default(companion7, mutableInteractionSourceB, indicationNodeFactoryA, false, null, null, (Function0) objRememberedValue3, 28, null);
                    GridWidgetCardData gridWidgetCardData = chaloBusProductItemData.f3250a;
                    String str2 = gridWidgetCardData.b;
                    long jA = ChaloColorToken_androidKt.a(Color.INSTANCE, gridWidgetCardData.d, Color.INSTANCE.m4640getTransparent0d7_KjU());
                    GridWidgetCardData gridWidgetCardData2 = chaloBusProductItemData.f3250a;
                    GridWidgetItemData gridWidgetItemData = gridWidgetCardData2.f2348a;
                    Composer composer3 = composer2;
                    ChaloWidgetCardKt.b(modifierM295clickableO2vRcR0$default, Color.m4595boximpl(jA), str2, gridWidgetItemData.c, gridWidgetItemData.f2349a, gridWidgetItemData.b, gridWidgetCardData2.c, composer3, 4096);
                    composer2 = composer3;
                    composer2.endNode();
                    composer2.endReplaceGroup();
                    r7 = r9;
                } else if (size != 2) {
                    composer2.startReplaceGroup(-164051789);
                    Object objRememberedValue4 = composer2.rememberedValue();
                    if (objRememberedValue4 == companion3.getEmpty()) {
                        objRememberedValue4 = SnapshotIntStateKt.mutableIntStateOf(i2);
                        composer2.updateRememberedValue(objRememberedValue4);
                    }
                    MutableIntState mutableIntState = (MutableIntState) objRememberedValue4;
                    k(list, mutableIntState, composer2, 48);
                    Modifier modifierFillMaxWidth$default2 = SizeKt.fillMaxWidth$default(BackgroundKt.m264backgroundbw27NRU$default(companion, ChaloTheme.a(composer2, i2).Z, null, 2, null), 0.0f, i3, null);
                    boolean zChangedInstance = ((i6 & 14) == 4) | composer2.changedInstance(list) | composer2.changedInstance(chaloBusPageDisplayItemData2) | (i7 == 2048);
                    Object objRememberedValue5 = composer2.rememberedValue();
                    if (zChangedInstance || objRememberedValue5 == companion3.getEmpty()) {
                        c = 4;
                        i5 = 1;
                        z2 = false;
                        o3 o3Var = new o3(list, function1, (Object) chaloBusPageDisplayItemData2, density, mutableIntState, 2);
                        function2 = function1;
                        composer2.updateRememberedValue(o3Var);
                        objRememberedValue5 = o3Var;
                    } else {
                        function2 = function1;
                        c = 4;
                        i5 = 1;
                        z2 = false;
                    }
                    Function1 function3 = (Function1) objRememberedValue5;
                    Composer composer4 = composer2;
                    i4 = i5;
                    f = 0.0f;
                    LazyDslKt.LazyRow(modifierFillMaxWidth$default2, null, null, false, null, null, null, false, null, function3, composer4, 0, TypedValues.PositionType.TYPE_POSITION_TYPE);
                    composer2 = composer4;
                    composer2.endReplaceGroup();
                    r7 = z2;
                } else {
                    i4 = i3;
                    i6 = i6;
                    chaloBusPageDisplayItemData2 = chaloBusPageDisplayItemData2;
                    int i13 = i2;
                    Modifier.Companion companion9 = companion;
                    f = 0.0f;
                    function2 = function1;
                    composer2.startReplaceGroup(-166636011);
                    Object objRememberedValue6 = composer2.rememberedValue();
                    if (objRememberedValue6 == companion3.getEmpty()) {
                        objRememberedValue6 = SnapshotIntStateKt.mutableIntStateOf(i13);
                        composer2.updateRememberedValue(objRememberedValue6);
                    }
                    MutableIntState mutableIntState2 = (MutableIntState) objRememberedValue6;
                    k(list, mutableIntState2, composer2, 48);
                    int i14 = i13;
                    Modifier modifierM786paddingVpY3zN4$default3 = PaddingKt.m786paddingVpY3zN4$default(SizeKt.fillMaxWidth$default(companion9, 0.0f, i4, null), ChaloTheme.b(composer2, i14 == true ? 1 : 0).h, 0.0f, 2, null);
                    MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(arrangement.m672spacedBy0680j_4(ChaloTheme.b(composer2, i14 == true ? 1 : 0).h), companion5.getTop(), composer2, i14 == true ? 1 : 0);
                    long currentCompositeKeyHashCode4 = ComposablesKt.getCurrentCompositeKeyHashCode(composer2, i14 == true ? 1 : 0);
                    int i15 = (int) (currentCompositeKeyHashCode4 ^ (currentCompositeKeyHashCode4 >>> 32));
                    CompositionLocalMap currentCompositionLocalMap4 = composer2.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier4 = ComposedModifierKt.materializeModifier(composer2, modifierM786paddingVpY3zN4$default3);
                    Function0<ComposeUiNode> constructor4 = companion2.getConstructor();
                    if (composer2.getApplier() == null) {
                        ComposablesKt.invalidApplier();
                    }
                    composer2.startReusableNode();
                    if (composer2.getInserting()) {
                        composer2.createNode(constructor4);
                    } else {
                        composer2.useNode();
                    }
                    Composer composerM3915constructorimpl4 = Updater.m3915constructorimpl(composer2);
                    ComposeUiNode.Companion companion10 = companion2;
                    pk0.v(companion10, composerM3915constructorimpl4, measurePolicyRowMeasurePolicy, composerM3915constructorimpl4, currentCompositionLocalMap4);
                    Updater.m3923setimpl(composerM3915constructorimpl4, modifierMaterializeModifier4, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion10, composerM3915constructorimpl4, Integer.valueOf(i15), composerM3915constructorimpl4));
                    RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
                    composer2.startReplaceGroup(-599201984);
                    ?? r13 = i14;
                    for (final ChaloBusProductItemData chaloBusProductItemData2 : list) {
                        Modifier.Companion companion11 = Modifier.INSTANCE;
                        Modifier modifierA = i41.a(rowScopeInstance, companion11, 1.0f, false, 2, null);
                        RowScopeInstance rowScopeInstance2 = rowScopeInstance;
                        MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy3 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), r13);
                        long currentCompositeKeyHashCode5 = ComposablesKt.getCurrentCompositeKeyHashCode(composer2, r13);
                        int i16 = (int) (currentCompositeKeyHashCode5 ^ (currentCompositeKeyHashCode5 >>> 32));
                        CompositionLocalMap currentCompositionLocalMap5 = composer2.getCurrentCompositionLocalMap();
                        Modifier modifierMaterializeModifier5 = ComposedModifierKt.materializeModifier(composer2, modifierA);
                        ComposeUiNode.Companion companion12 = ComposeUiNode.INSTANCE;
                        Function0<ComposeUiNode> constructor5 = companion12.getConstructor();
                        if (composer2.getApplier() == null) {
                            ComposablesKt.invalidApplier();
                        }
                        composer2.startReusableNode();
                        if (composer2.getInserting()) {
                            composer2.createNode(constructor5);
                        } else {
                            composer2.useNode();
                        }
                        Composer composerM3915constructorimpl5 = Updater.m3915constructorimpl(composer2);
                        pk0.v(companion12, composerM3915constructorimpl5, measurePolicyMaybeCachedBoxMeasurePolicy3, composerM3915constructorimpl5, currentCompositionLocalMap5);
                        Updater.m3923setimpl(composerM3915constructorimpl5, modifierMaterializeModifier5, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion12, composerM3915constructorimpl5, Integer.valueOf(i16), composerM3915constructorimpl5));
                        BoxScopeInstance boxScopeInstance2 = BoxScopeInstance.INSTANCE;
                        MutableInteractionSource mutableInteractionSourceB2 = RippleEffectKt.b(composer2);
                        IndicationNodeFactory indicationNodeFactoryA2 = RippleEffectKt.a(composer2);
                        int i17 = (composer2.changedInstance(chaloBusPageDisplayItemData2) ? 1 : 0) | ((i6 & 14) == 4 ? i4 : 0) | (composer2.changedInstance(chaloBusProductItemData2) ? 1 : 0);
                        Object objRememberedValue7 = composer2.rememberedValue();
                        if (i17 != 0 || objRememberedValue7 == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue7 = new Function0() { // from class: oh
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    switch (i4) {
                                        case 0:
                                            function2.invoke(new ChaloBusViewIntent.ChaloBusPageItemClickedIntent(chaloBusPageDisplayItemData2.h, chaloBusProductItemData2.b));
                                            break;
                                        default:
                                            function2.invoke(new ChaloBusViewIntent.ChaloBusPageItemClickedIntent(chaloBusPageDisplayItemData2.h, chaloBusProductItemData2.b));
                                            break;
                                    }
                                    return Unit.f17538a;
                                }
                            };
                            composer2.updateRememberedValue(objRememberedValue7);
                        }
                        Modifier modifierM814height3ABfNKs = SizeKt.m814height3ABfNKs(ClickableKt.m295clickableO2vRcR0$default(companion11, mutableInteractionSourceB2, indicationNodeFactoryA2, false, null, null, (Function0) objRememberedValue7, 28, null), Dp.m7276boximpl(density.mo401toDpu2uoSUM(mutableIntState2.getIntValue())).m7292unboximpl());
                        GridWidgetCardData gridWidgetCardData3 = chaloBusProductItemData2.f3250a;
                        String str3 = gridWidgetCardData3.b;
                        long jA2 = ChaloColorToken_androidKt.a(Color.INSTANCE, gridWidgetCardData3.d, Color.INSTANCE.m4640getTransparent0d7_KjU());
                        GridWidgetCardData gridWidgetCardData4 = chaloBusProductItemData2.f3250a;
                        GridWidgetItemData gridWidgetItemData2 = gridWidgetCardData4.f2348a;
                        Composer composer5 = composer2;
                        ChaloWidgetCardKt.c(modifierM814height3ABfNKs, Color.m4595boximpl(jA2), str3, gridWidgetItemData2.c, gridWidgetItemData2.f2349a, gridWidgetItemData2.b, gridWidgetCardData4.c, false, composer5, 4096, 128);
                        composer2 = composer5;
                        composer2.endNode();
                        mutableIntState2 = mutableIntState2;
                        r13 = 0;
                        rowScopeInstance = rowScopeInstance2;
                    }
                    r7 = r13;
                    composer2.endReplaceGroup();
                    composer2.endNode();
                    composer2.endReplaceGroup();
                }
                composer2.endReplaceGroup();
                r8 = r7;
            }
            String str4 = chaloBusPageDisplayItemData2.j;
            if (str4 == null) {
                composer2.startReplaceGroup(-1018957664);
            } else {
                composer2.startReplaceGroup(-1018957663);
                ChaloSpacersKt.q(composer2, r8);
                int i18 = WhenMappings.e[chaloBusPageDisplayItemData2.k.ordinal()];
                if (i18 == i4 || i18 == 2) {
                    composer2.startReplaceGroup(-328337554);
                    Modifier modifierM786paddingVpY3zN4$default4 = PaddingKt.m786paddingVpY3zN4$default(Modifier.INSTANCE, ChaloTheme.b(composer2, r8).h, f, 2, null);
                    ?? r14 = (i6 & 14) == 4 ? i4 : r8;
                    Object objRememberedValue8 = composer2.rememberedValue();
                    if (r14 != 0 || objRememberedValue8 == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue8 = new fh(function2, 21);
                        composer2.updateRememberedValue(objRememberedValue8);
                    }
                    ChaloFilledButtonAndroidKt.a(str4, modifierM786paddingVpY3zN4$default4, null, (Function0) objRememberedValue8, composer2, 0);
                    composer2.endReplaceGroup();
                } else {
                    if (i18 != 3) {
                        throw pk0.p(composer2, -2088806178);
                    }
                    composer2.startReplaceGroup(-327912761);
                    Modifier modifierM786paddingVpY3zN4$default5 = PaddingKt.m786paddingVpY3zN4$default(Modifier.INSTANCE, ChaloTheme.b(composer2, r8).h, f, 2, null);
                    ?? r15 = (i6 & 14) == 4 ? i4 : r8;
                    Object objRememberedValue9 = composer2.rememberedValue();
                    if (r15 != 0 || objRememberedValue9 == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue9 = new fh(function2, 20);
                        composer2.updateRememberedValue(objRememberedValue9);
                    }
                    Composer composer6 = composer2;
                    ChaloFilledButtonKt.g(modifierM786paddingVpY3zN4$default5, str4, null, 0L, null, false, 0.0f, null, 0L, (Function0) objRememberedValue9, composer6, 0, TypedValues.PositionType.TYPE_CURVE_FIT);
                    composer2 = composer6;
                    composer2.endReplaceGroup();
                }
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
            scopeUpdateScopeEndRestartGroup.updateScope(new lh(function1, z, chaloBusPageDisplayItemData, density, i, 1));
        }
    }

    public static final void x(Modifier modifier, Function0 function0, Composer composer, int i, int i2) {
        Modifier modifier2;
        int i3;
        Composer composer2;
        Modifier modifier3;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1448675239);
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 6;
            modifier2 = modifier;
        } else if ((i & 6) == 0) {
            modifier2 = modifier;
            i3 = i | (composerStartRestartGroup.changed(modifier2) ? 4 : 2);
        } else {
            modifier2 = modifier;
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(function0) ? 32 : 16;
        }
        if (composerStartRestartGroup.shouldExecute((i3 & 19) != 18, i3 & 1)) {
            Modifier modifier4 = i4 != 0 ? Modifier.INSTANCE : modifier2;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1448675239, i3, -1, "app.chalo.home.ui.chalobus.ViewAllBtnComposable (ChaloBusScreenUI.kt:623)");
            }
            String lowerCase = StringResourcesHelperKt.c(StringEnum.VIEW_ALL, new Object[0], composerStartRestartGroup, 6).toLowerCase(Locale.ROOT);
            Intrinsics.h(lowerCase, "toLowerCase(...)");
            String strA = StringExtsKt.a(lowerCase);
            TextStyle bodySmall = ChaloTheme.e(composerStartRestartGroup, 0).getBodySmall();
            FontWeight semiBold = FontWeight.INSTANCE.getSemiBold();
            long jC = ChaloColorTokenKt.c(ChaloColorToken.AlmostBlackColor.f9756a);
            float f = ChaloThemeHelper.a().b;
            long jC2 = ChaloColorTokenKt.c(ChaloColorToken.LightGray.f9814a);
            UIShape.Rectangle rectangle = UIShape.c;
            Modifier modifierClip = ClipKt.clip(BorderKt.m275borderxT4_qwU(modifier4, f, jC2, ChaloThemeKt.d(rectangle)), ChaloThemeKt.d(rectangle));
            boolean z = (i3 & 112) == 32;
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (z || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new hb(function0, 16);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            composer2 = composerStartRestartGroup;
            TextKt.m2623TextNvy7gAk(strA, PaddingKt.m784padding3ABfNKs(ClickableKt.m299clickableoSLSa3U$default(modifierClip, false, null, null, null, (Function0) objRememberedValue, 15, null), ChaloThemeHelper.a().f), jC, null, 0L, null, semiBold, null, 0L, null, null, 0L, 0, false, 0, 0, null, bodySmall, composer2, 1572864, 0, 131000);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            modifier3 = modifier4;
        } else {
            composer2 = composerStartRestartGroup;
            composer2.skipToGroupEnd();
            modifier3 = modifier2;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new z(i, i2, 3, modifier3, function0));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void y(Composer composer, int i, String str) {
        int i2;
        Composer composer2;
        MutableState mutableState;
        int i3;
        String str2;
        int i4;
        Modifier.Companion companion;
        Composer composerStartRestartGroup = composer.startRestartGroup(1020169300);
        if ((i & 6) == 0) {
            i2 = i | (composerStartRestartGroup.changed(str) ? 4 : 2);
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changed("pbLandingOffersAndPasses") ? 32 : 16;
        }
        if (composerStartRestartGroup.shouldExecute((i2 & 19) != 18, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1020169300, i2, -1, "app.chalo.home.ui.chalobus.WhatsNewPlotlineSection (ChaloBusScreenUI.kt:532)");
            }
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            Composer.Companion companion2 = Composer.INSTANCE;
            if (objRememberedValue == companion2.getEmpty()) {
                objRememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            MutableState mutableState2 = (MutableState) objRememberedValue;
            Density density = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
            Modifier.Companion companion3 = Modifier.INSTANCE;
            Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(companion3, 0.0f, 1, null);
            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composerStartRestartGroup, 0);
            long currentCompositeKeyHashCode = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
            Density density2 = density;
            int i5 = (int) (currentCompositeKeyHashCode ^ (currentCompositeKeyHashCode >>> 32));
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierFillMaxWidth$default);
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
            if (((Boolean) mutableState2.getValue()).booleanValue()) {
                composerStartRestartGroup.startReplaceGroup(189059990);
                if (str == null) {
                    composerStartRestartGroup.startReplaceGroup(189090183);
                    composerStartRestartGroup.endReplaceGroup();
                    mutableState = mutableState2;
                    composer2 = composerStartRestartGroup;
                    i3 = i2;
                    str2 = "pbLandingOffersAndPasses";
                    i4 = 0;
                    companion = companion3;
                } else {
                    composerStartRestartGroup.startReplaceGroup(189090184);
                    ChaloSpacersKt.a(ChaloTheme.b(composerStartRestartGroup, 0).l0, composerStartRestartGroup, 0);
                    mutableState = mutableState2;
                    i3 = i2;
                    str2 = "pbLandingOffersAndPasses";
                    companion = companion3;
                    i4 = 0;
                    TextKt.m2623TextNvy7gAk(str, PaddingKt.m786paddingVpY3zN4$default(companion3, ChaloTheme.b(composerStartRestartGroup, 0).h, 0.0f, 2, null), ChaloColorTokenKt.c(ChaloColorToken.Black.f9759a), null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ChaloTypographyKt.a(ChaloTheme.e(composerStartRestartGroup, 0).getDisplaySmall()), composerStartRestartGroup, i2 & 14, 0, 131064);
                    composer2 = composerStartRestartGroup;
                    composer2.endReplaceGroup();
                }
                ChaloSpacersKt.o(composer2, i4);
            } else {
                mutableState = mutableState2;
                composer2 = composerStartRestartGroup;
                i3 = i2;
                str2 = "pbLandingOffersAndPasses";
                i4 = 0;
                companion = companion3;
                density2 = density2;
                composer2.startReplaceGroup(166202884);
            }
            composer2.endReplaceGroup();
            Density density3 = density2;
            boolean zChanged = composer2.changed(density3);
            Object objRememberedValue2 = composer2.rememberedValue();
            if (zChanged || objRememberedValue2 == companion2.getEmpty()) {
                objRememberedValue2 = new f0(density3, mutableState, 6);
                composer2.updateRememberedValue(objRememberedValue2);
            }
            app.chalo.compose.components.plotline.PlotlineComposeWidgetKt.a((i3 >> 3) & 14, i4, composer2, OnGloballyPositionedModifierKt.onGloballyPositioned(companion, (Function1) objRememberedValue2), str2);
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
            scopeUpdateScopeEndRestartGroup.updateScope(new qg(str, i, 1));
        }
    }
}
