package app.chalo.home.ui.chalobus;

import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.AnimatableKt;
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
import androidx.compose.foundation.pager.PagerKt;
import androidx.compose.foundation.pager.PagerState;
import androidx.compose.foundation.pager.PagerStateKt;
import androidx.compose.material3.TextKt;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.ClipKt;
import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.layout.ContentScale;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.OnGloballyPositionedModifierKt;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.unit.Density;
import app.chalo.compose.components.ChaloDotsIndicatorsKt;
import app.chalo.compose.components.ChaloSpacersKt;
import app.chalo.compose.components.PlotlineComposeWidgetKt;
import app.chalo.compose.resources.LottieResourceHelperKt;
import app.chalo.compose.resources.PainterResourceHelperKt;
import app.chalo.compose.resources.StringResourcesHelperKt;
import app.chalo.compose.theme.ChaloTheme;
import app.chalo.compose.theme.ChaloThemeHelper;
import app.chalo.compose.theme.ChaloTypographyKt;
import app.chalo.home.data.mappers.BannerStatus;
import app.chalo.home.data.model.PremiumPassSavingsInfo;
import app.chalo.home.data.model.app.response.BannerUiDataAppModel;
import app.chalo.home.ui.chalobus.ChaloBusScreenHeaderLayoutKt;
import app.chalo.homescreen.data.model.app.ChaloBusHeaderAppModel;
import app.chalo.providers.iconassetprovider.IconType;
import app.chalo.providers.lottieassetprovider.LottieType;
import app.chalo.providers.stringprovider.StringEnum;
import app.chalo.uistate.base.ChaloColorToken;
import app.chalo.uistate.base.ChaloColorTokenKt;
import defpackage.af;
import defpackage.bf;
import defpackage.f0;
import defpackage.fh;
import defpackage.gh;
import defpackage.hb;
import defpackage.i41;
import defpackage.jh;
import defpackage.kh;
import defpackage.l3;
import defpackage.lh;
import defpackage.pk0;
import defpackage.vo1;
import io.github.alexzhirkevich.compottie.LottieCompositionResultImpl;
import java.util.List;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002¨\u0006\u0004²\u0006\u000e\u0010\u0001\u001a\u00020\u00008\n@\nX\u008a\u008e\u0002²\u0006\f\u0010\u0003\u001a\u00020\u00028\nX\u008a\u0084\u0002"}, d2 = {"", "isPlotlineWidgetRendered", "", "displayText", "home_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class ChaloBusScreenHeaderLayoutKt {

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f3251a;

        static {
            int[] iArr = new int[BannerStatus.values().length];
            try {
                iArr[BannerStatus.SUCCESS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[BannerStatus.IN_PROCESS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[BannerStatus.UNKNOWN.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[BannerStatus.FAILED.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f3251a = iArr;
        }
    }

    public static final void a(int i, int i2, String str, Modifier modifier, String str2, Composer composer, int i3) {
        int i4;
        Composer composer2;
        Modifier modifier2;
        Composer composerStartRestartGroup = composer.startRestartGroup(342383462);
        if ((i3 & 6) == 0) {
            i4 = (composerStartRestartGroup.changed(i) ? 4 : 2) | i3;
        } else {
            i4 = i3;
        }
        if ((i3 & 48) == 0) {
            i4 |= composerStartRestartGroup.changed(i2) ? 32 : 16;
        }
        if ((i3 & 384) == 0) {
            i4 |= composerStartRestartGroup.changed(str) ? 256 : 128;
        }
        int i5 = i4 | 3072;
        if ((i3 & 24576) == 0) {
            i5 |= composerStartRestartGroup.changed(str2) ? 16384 : 8192;
        }
        if (composerStartRestartGroup.shouldExecute((i5 & 9363) != 9362, i5 & 1)) {
            Modifier.Companion companion = Modifier.INSTANCE;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(342383462, i5, -1, "app.chalo.home.ui.chalobus.AnimatedSavingsAmountText (ChaloBusScreenHeaderLayout.kt:238)");
            }
            float f = i;
            float f2 = i2;
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            Composer.Companion companion2 = Composer.INSTANCE;
            if (objRememberedValue == companion2.getEmpty()) {
                objRememberedValue = AnimatableKt.Animatable$default(f, 0.0f, 2, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            Animatable animatable = (Animatable) objRememberedValue;
            Float fValueOf = Float.valueOf(f2);
            boolean zChangedInstance = composerStartRestartGroup.changedInstance(animatable) | composerStartRestartGroup.changed(f) | composerStartRestartGroup.changed(f2);
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance || objRememberedValue2 == companion2.getEmpty()) {
                objRememberedValue2 = new ChaloBusScreenHeaderLayoutKt$AnimatedSavingsAmountText$1$1(animatable, f, f2, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            EffectsKt.LaunchedEffect(fValueOf, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue2, composerStartRestartGroup, 0);
            Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue3 == companion2.getEmpty()) {
                objRememberedValue3 = SnapshotStateKt.derivedStateOf(new l3(22, animatable, str));
                composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
            }
            composer2 = composerStartRestartGroup;
            TextKt.m2623TextNvy7gAk(vo1.n((String) ((State) objRememberedValue3).getValue(), " ", str2), companion, 0L, null, 0L, null, FontWeight.INSTANCE.getSemiBold(), null, 0L, null, null, 0L, 0, false, 0, 0, null, TextStyle.m6751copyNs73l9s$default(ChaloTypographyKt.d(ChaloTheme.e(composerStartRestartGroup, 0)), Brush.Companion.m4558horizontalGradient8A3gB4$default(Brush.INSTANCE, CollectionsKt.S(Color.m4595boximpl(ChaloColorTokenKt.c(ChaloColorToken.MidGreen.f9826a)), Color.m4595boximpl(ChaloColorTokenKt.c(ChaloColorToken.DarkGreen.f9783a))), 0.0f, 0.0f, 0, 14, (Object) null), 0.0f, 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, null, 0, 0, 0L, null, null, null, 0, 0, null, 33554430, null), composer2, ((i5 >> 6) & 112) | 1572864, 0, 131004);
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
            scopeUpdateScopeEndRestartGroup.updateScope(new gh(i, i2, i3, modifier2, str, str2));
        }
    }

    public static final void b(final Modifier modifier, final BannerUiDataAppModel bannerUiDataAppModel, final Function0 function0, Composer composer, final int i) {
        int i2;
        Composer composer2;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Function2<? super Composer, ? super Integer, Unit> function2;
        ChaloColorToken chaloColorToken;
        Composer composerStartRestartGroup = composer.startRestartGroup(-682175792);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changed(modifier) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changed(bannerUiDataAppModel) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(function0) ? 256 : 128;
        }
        if (composerStartRestartGroup.shouldExecute((i2 & 147) != 146, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-682175792, i2, -1, "app.chalo.home.ui.chalobus.ChaloBusBannerCard (ChaloBusScreenHeaderLayout.kt:317)");
            }
            String str = bannerUiDataAppModel.f2955a;
            String str2 = bannerUiDataAppModel.b;
            int i3 = WhenMappings.f3251a[bannerUiDataAppModel.d.ordinal()];
            if (i3 == 1 || i3 == 2 || i3 == 3) {
                chaloColorToken = ChaloColorToken.LightOrangeSpf.f9817a;
            } else {
                if (i3 != 4) {
                    throw new NoWhenBranchMatchedException();
                }
                chaloColorToken = ChaloColorToken.RedBase.f9846a;
            }
            if (str == null || str.length() == 0) {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                final int i4 = 0;
                function2 = new Function2() { // from class: ih
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        int i5 = i4;
                        Composer composer3 = (Composer) obj;
                        ((Integer) obj2).intValue();
                        switch (i5) {
                            case 0:
                                ChaloBusScreenHeaderLayoutKt.b(modifier, bannerUiDataAppModel, function0, composer3, RecomposeScopeImplKt.updateChangedFlags(i | 1));
                                break;
                            default:
                                ChaloBusScreenHeaderLayoutKt.b(modifier, bannerUiDataAppModel, function0, composer3, RecomposeScopeImplKt.updateChangedFlags(i | 1));
                                break;
                        }
                        return Unit.f17538a;
                    }
                };
            } else {
                Modifier modifierClip = ClipKt.clip(BackgroundKt.m263backgroundbw27NRU(SizeKt.fillMaxWidth$default(modifier, 0.0f, 1, null), ChaloColorTokenKt.c(chaloColorToken), ChaloTheme.d(composerStartRestartGroup, 0).g), ChaloTheme.d(composerStartRestartGroup, 0).g);
                boolean z = (i2 & 896) == 256;
                Object objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (z || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = new hb(function0, 12);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                Modifier modifierM787paddingqDBjuR0 = PaddingKt.m787paddingqDBjuR0(ClickableKt.m299clickableoSLSa3U$default(modifierClip, false, null, null, null, (Function0) objRememberedValue, 15, null), ChaloTheme.b(composerStartRestartGroup, 0).f, ChaloTheme.b(composerStartRestartGroup, 0).g, ChaloTheme.b(composerStartRestartGroup, 0).h, ChaloTheme.b(composerStartRestartGroup, 0).g);
                Alignment.Companion companion = Alignment.INSTANCE;
                Alignment.Vertical centerVertically = companion.getCenterVertically();
                Arrangement arrangement = Arrangement.INSTANCE;
                MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(arrangement.getStart(), centerVertically, composerStartRestartGroup, 48);
                long currentCompositeKeyHashCode = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
                int i5 = (int) (currentCompositeKeyHashCode ^ (currentCompositeKeyHashCode >>> 32));
                CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierM787paddingqDBjuR0);
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
                LottieCompositionResultImpl lottieCompositionResultImplB = LottieResourceHelperKt.b(LottieType.WORRIED, composerStartRestartGroup, 6);
                Modifier.Companion companion3 = Modifier.INSTANCE;
                Modifier modifierM828size3ABfNKs = SizeKt.m828size3ABfNKs(companion3, ChaloTheme.b(composerStartRestartGroup, 0).W);
                Painter painterC = LottieResourceHelperKt.c(lottieCompositionResultImplB, 0, false, composerStartRestartGroup, 0, 30);
                int i6 = Painter.$stable | 48;
                ImageKt.Image(painterC, "", modifierM828size3ABfNKs, (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composerStartRestartGroup, i6, 120);
                ChaloSpacersKt.w(composerStartRestartGroup, 0);
                MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(arrangement.getTop(), companion.getStart(), composerStartRestartGroup, 0);
                long currentCompositeKeyHashCode2 = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
                int i7 = (int) (currentCompositeKeyHashCode2 ^ (currentCompositeKeyHashCode2 >>> 32));
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
                Updater.m3923setimpl(composerM3915constructorimpl2, modifierMaterializeModifier2, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion2, composerM3915constructorimpl2, Integer.valueOf(i7), composerM3915constructorimpl2));
                ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
                TextStyle textStyleD = ChaloTypographyKt.d(ChaloTheme.e(composerStartRestartGroup, 0));
                long j = ChaloTheme.a(composerStartRestartGroup, 0).t0;
                FontWeight.Companion companion4 = FontWeight.INSTANCE;
                TextKt.m2623TextNvy7gAk(str, null, 0L, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, TextStyle.m6753copyp1EtxEg$default(textStyleD, j, 0L, companion4.getSemiBold(), null, null, null, null, 0L, null, null, null, 0L, null, null, null, 0, 0, 0L, null, null, null, 0, 0, null, 16777210, null), composerStartRestartGroup, 0, 0, 131070);
                Composer composer3 = composerStartRestartGroup;
                ChaloSpacersKt.t(composer3, 0);
                if (str2 == null) {
                    composer3.startReplaceGroup(-1798666035);
                } else {
                    composer3.startReplaceGroup(-1798666034);
                    TextKt.m2623TextNvy7gAk(str2, null, 0L, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, TextStyle.m6753copyp1EtxEg$default(ChaloTypographyKt.d(ChaloTheme.e(composer3, 0)), ChaloTheme.a(composer3, 0).t0, 0L, companion4.getNormal(), null, null, null, null, 0L, null, null, null, 0L, null, null, null, 0, 0, 0L, null, null, null, 0, 0, null, 16777210, null), composer3, 0, 0, 131070);
                    composer3 = composer3;
                }
                composer3.endReplaceGroup();
                composer3.endNode();
                SpacerKt.Spacer(i41.a(rowScopeInstance, companion3, 1.0f, false, 2, null), composer3, 0);
                ImageKt.Image(PainterResourceHelperKt.a(IconType.IC_ORANGE_TINT_ARROW, composer3, 6), "", (Modifier) null, (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composer3, i6, 124);
                composer2 = composer3;
                composer2.endNode();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
            scopeUpdateScopeEndRestartGroup.updateScope(function2);
        }
        composer2 = composerStartRestartGroup;
        composer2.skipToGroupEnd();
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            final int i8 = 1;
            function2 = new Function2() { // from class: ih
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    int i9 = i8;
                    Composer composer4 = (Composer) obj;
                    ((Integer) obj2).intValue();
                    switch (i9) {
                        case 0:
                            ChaloBusScreenHeaderLayoutKt.b(modifier, bannerUiDataAppModel, function0, composer4, RecomposeScopeImplKt.updateChangedFlags(i | 1));
                            break;
                        default:
                            ChaloBusScreenHeaderLayoutKt.b(modifier, bannerUiDataAppModel, function0, composer4, RecomposeScopeImplKt.updateChangedFlags(i | 1));
                            break;
                    }
                    return Unit.f17538a;
                }
            };
            scopeUpdateScopeEndRestartGroup.updateScope(function2);
        }
    }

    public static final void c(List list, Function1 function1, Composer composer, int i) {
        int i2;
        int i3;
        Composer composerStartRestartGroup = composer.startRestartGroup(-2015104308);
        if ((i & 6) == 0) {
            i2 = i | (composerStartRestartGroup.changedInstance(list) ? 4 : 2);
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(function1) ? 32 : 16;
        }
        if (composerStartRestartGroup.shouldExecute((i2 & 19) != 18, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-2015104308, i2, -1, "app.chalo.home.ui.chalobus.ChaloBusRollOverBannerSection (ChaloBusScreenHeaderLayout.kt:276)");
            }
            boolean zChangedInstance = composerStartRestartGroup.changedInstance(list);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new af(list, 3);
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
            Modifier.Companion companion = Modifier.INSTANCE;
            Modifier modifierM786paddingVpY3zN4$default = PaddingKt.m786paddingVpY3zN4$default(companion, ChaloTheme.b(composerStartRestartGroup, 0).h, 0.0f, 2, null);
            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getCenterHorizontally(), composerStartRestartGroup, 48);
            long currentCompositeKeyHashCode = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
            int i4 = (int) ((currentCompositeKeyHashCode >>> 32) ^ currentCompositeKeyHashCode);
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
            pk0.v(companion2, composerM3915constructorimpl, measurePolicyColumnMeasurePolicy, composerM3915constructorimpl, currentCompositionLocalMap);
            Updater.m3923setimpl(composerM3915constructorimpl, modifierMaterializeModifier, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion2, composerM3915constructorimpl, Integer.valueOf(i4), composerM3915constructorimpl));
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
            i3 = 0;
            PagerKt.m1020HorizontalPager8jOkeI(pagerStateRememberPagerState, null, null, null, 0, ChaloTheme.b(composerStartRestartGroup, 0).h, null, null, false, false, null, null, null, null, ComposableLambdaKt.rememberComposableLambda(1156357635, true, new bf(1, list, function1), composerStartRestartGroup, 54), composerStartRestartGroup, 0, 24576, 16350);
            composerStartRestartGroup = composerStartRestartGroup;
            if (iIntValue > 1) {
                composerStartRestartGroup.startReplaceGroup(-286370577);
                ChaloSpacersKt.u(composerStartRestartGroup, 0);
                ChaloDotsIndicatorsKt.a(SizeKt.wrapContentSize$default(companion, null, false, 3, null), ChaloTheme.a(composerStartRestartGroup, 0).f1915a, ChaloTheme.a(composerStartRestartGroup, 0).n, iIntValue, pagerStateRememberPagerState.getCurrentPage(), composerStartRestartGroup, 24576);
                composerStartRestartGroup = composerStartRestartGroup;
            } else {
                composerStartRestartGroup.startReplaceGroup(-297472576);
            }
            composerStartRestartGroup.endReplaceGroup();
            composerStartRestartGroup.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            i3 = 0;
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new kh(i, i3, list, function1));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void d(String str, ChaloBusHeaderAppModel chaloBusHeaderAppModel, PremiumPassSavingsInfo premiumPassSavingsInfo, boolean z, List list, boolean z2, Function1 sendIntent, Composer composer, int i) {
        int i2;
        Composer composer2;
        Composer composer3;
        int i3;
        int i4;
        float f;
        Intrinsics.i(chaloBusHeaderAppModel, "chaloBusHeaderAppModel");
        Intrinsics.i(sendIntent, "sendIntent");
        Composer composerStartRestartGroup = composer.startRestartGroup(1614263199);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changed(str) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= (i & 64) == 0 ? composerStartRestartGroup.changed(chaloBusHeaderAppModel) : composerStartRestartGroup.changedInstance(chaloBusHeaderAppModel) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= composerStartRestartGroup.changed(premiumPassSavingsInfo) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= composerStartRestartGroup.changed(z) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(list) ? 16384 : 8192;
        }
        if ((1572864 & i) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(sendIntent) ? 1048576 : 524288;
        }
        if (composerStartRestartGroup.shouldExecute((533651 & i2) != 533650, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1614263199, i2, -1, "app.chalo.home.ui.chalobus.ChaloBusScreenHeaderLayout (ChaloBusScreenHeaderLayout.kt:78)");
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
            int i5 = (int) (currentCompositeKeyHashCode ^ (currentCompositeKeyHashCode >>> 32));
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierFillMaxWidth$default);
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
            pk0.v(companion4, composerM3915constructorimpl, measurePolicyColumnMeasurePolicy, composerM3915constructorimpl, currentCompositionLocalMap);
            Updater.m3923setimpl(composerM3915constructorimpl, modifierMaterializeModifier, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion4, composerM3915constructorimpl, Integer.valueOf(i5), composerM3915constructorimpl));
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
            Modifier modifierM786paddingVpY3zN4$default = PaddingKt.m786paddingVpY3zN4$default(SizeKt.fillMaxWidth$default(companion2, 0.0f, 1, null), ChaloTheme.b(composerStartRestartGroup, 0).h, 0.0f, 2, null);
            MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(arrangement.getStart(), companion3.getCenterVertically(), composerStartRestartGroup, 48);
            long currentCompositeKeyHashCode2 = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
            int i6 = i2;
            int i7 = (int) (currentCompositeKeyHashCode2 ^ (currentCompositeKeyHashCode2 >>> 32));
            CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierM786paddingVpY3zN4$default);
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
            pk0.v(companion4, composerM3915constructorimpl2, measurePolicyRowMeasurePolicy, composerM3915constructorimpl2, currentCompositionLocalMap2);
            Updater.m3923setimpl(composerM3915constructorimpl2, modifierMaterializeModifier2, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion4, composerM3915constructorimpl2, Integer.valueOf(i7), composerM3915constructorimpl2));
            RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
            Modifier modifierM814height3ABfNKs = SizeKt.m814height3ABfNKs(companion2, ChaloTheme.b(composerStartRestartGroup, 0).h);
            IconType iconType = chaloBusHeaderAppModel.f3723a;
            if (iconType == null) {
                iconType = IconType.CHALO_BUS_LOGO;
            }
            Painter painterA = PainterResourceHelperKt.a(iconType, composerStartRestartGroup, 0);
            int i8 = Painter.$stable;
            ImageKt.Image(painterA, (String) null, modifierM814height3ABfNKs, (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composerStartRestartGroup, i8 | 48, 120);
            SpacerKt.Spacer(i41.a(rowScopeInstance, companion2, 1.0f, false, 2, null), composerStartRestartGroup, 0);
            Modifier modifierWrapContentWidth$default = SizeKt.wrapContentWidth$default(companion2, null, false, 3, null);
            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(companion3.getCenterEnd(), false);
            long currentCompositeKeyHashCode3 = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
            int i9 = (int) (currentCompositeKeyHashCode3 ^ (currentCompositeKeyHashCode3 >>> 32));
            CompositionLocalMap currentCompositionLocalMap3 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier3 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierWrapContentWidth$default);
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
            pk0.v(companion4, composerM3915constructorimpl3, measurePolicyMaybeCachedBoxMeasurePolicy, composerM3915constructorimpl3, currentCompositionLocalMap3);
            Updater.m3923setimpl(composerM3915constructorimpl3, modifierMaterializeModifier3, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion4, composerM3915constructorimpl3, Integer.valueOf(i9), composerM3915constructorimpl3));
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            if (premiumPassSavingsInfo == null) {
                composerStartRestartGroup.startReplaceGroup(1458454767);
                composerStartRestartGroup.endReplaceGroup();
                composer3 = composerStartRestartGroup;
                i3 = 0;
                i4 = 2;
                f = 0.0f;
            } else {
                composerStartRestartGroup.startReplaceGroup(1458454768);
                boolean z3 = (i6 & 3670016) == 1048576;
                Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                if (z3 || objRememberedValue2 == companion.getEmpty()) {
                    objRememberedValue2 = new fh(sendIntent, 12);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                }
                composer3 = composerStartRestartGroup;
                i3 = 0;
                i4 = 2;
                f = 0.0f;
                e(premiumPassSavingsInfo, z, (Function0) objRememberedValue2, null, composer3, (i6 >> 6) & 112);
                composer3.endReplaceGroup();
            }
            composer3.endNode();
            ChaloSpacersKt.B(composer3, i3);
            Modifier modifierA = PlotlineComposeWidgetKt.a(companion2, "PL_PB_NOTIFICATION_ICON_".concat(str));
            int i10 = (i6 & 3670016) == 1048576 ? 1 : i3;
            Object objRememberedValue3 = composer3.rememberedValue();
            if (i10 != 0 || objRememberedValue3 == companion.getEmpty()) {
                objRememberedValue3 = new fh(sendIntent, 13);
                composer3.updateRememberedValue(objRememberedValue3);
            }
            Modifier modifierM299clickableoSLSa3U$default = ClickableKt.m299clickableoSLSa3U$default(modifierA, false, null, null, null, (Function0) objRememberedValue3, 15, null);
            Painter painterA2 = PainterResourceHelperKt.a(IconType.IC_NOTIFICATIONS, composer3, 6);
            String strC = StringResourcesHelperKt.c(StringEnum.NOTIFICATION_BELL, new Object[i3], composer3, 6);
            int i11 = i3;
            Composer composer4 = composer3;
            int i12 = i4;
            float f2 = f;
            ImageKt.Image(painterA2, strC, modifierM299clickableoSLSa3U$default, (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composer4, i8, 120);
            composer2 = composer4;
            composer2.endNode();
            List list2 = list;
            if (((list2 == null || list2.isEmpty()) ? 1 : i11) == 0) {
                composer2.startReplaceGroup(1743878759);
                ChaloSpacersKt.p(composer2, i11);
                c(list, sendIntent, composer2, ((i6 >> 12) & 14) | ((i6 >> 15) & 112));
            } else {
                composer2.startReplaceGroup(1738220205);
            }
            composer2.endReplaceGroup();
            if (((Boolean) mutableState.getValue()).booleanValue()) {
                composer2.startReplaceGroup(1744108283);
                ChaloSpacersKt.o(composer2, i11);
            } else {
                composer2.startReplaceGroup(1738220205);
            }
            composer2.endReplaceGroup();
            Modifier modifierM786paddingVpY3zN4$default2 = PaddingKt.m786paddingVpY3zN4$default(companion2, ChaloThemeHelper.a().h, f2, i12, null);
            boolean zChanged = composer2.changed(density);
            Object objRememberedValue4 = composer2.rememberedValue();
            if (zChanged || objRememberedValue4 == companion.getEmpty()) {
                objRememberedValue4 = new f0(density, mutableState, i12);
                composer2.updateRememberedValue(objRememberedValue4);
            }
            app.chalo.compose.components.plotline.PlotlineComposeWidgetKt.a(6, i11, composer2, OnGloballyPositionedModifierKt.onGloballyPositioned(modifierM786paddingVpY3zN4$default2, (Function1) objRememberedValue4), "chalo_bus_landing_plotline_widget");
            ChaloSpacersKt.p(composer2, i11);
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
            scopeUpdateScopeEndRestartGroup.updateScope(new jh(str, chaloBusHeaderAppModel, premiumPassSavingsInfo, z, list, z2, sendIntent, i));
        }
    }

    public static final void e(PremiumPassSavingsInfo passSavingsInfo, boolean z, Function0 onInfoClick, Modifier modifier, Composer composer, int i) {
        int i2;
        Modifier modifier2;
        Intrinsics.i(passSavingsInfo, "passSavingsInfo");
        Integer num = passSavingsInfo.f2874a;
        Integer num2 = passSavingsInfo.b;
        Intrinsics.i(onInfoClick, "onInfoClick");
        Composer composerStartRestartGroup = composer.startRestartGroup(-219547427);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changed(passSavingsInfo) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changed(z) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(onInfoClick) ? 256 : 128;
        }
        int i3 = i2 | 3072;
        if (composerStartRestartGroup.shouldExecute((i3 & 1171) != 1170, i3 & 1)) {
            Modifier.Companion companion = Modifier.INSTANCE;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-219547427, i3, -1, "app.chalo.home.ui.chalobus.ChaloPassInfoSection (ChaloBusScreenHeaderLayout.kt:162)");
            }
            Alignment.Vertical centerVertically = Alignment.INSTANCE.getCenterVertically();
            Modifier modifierM275borderxT4_qwU = BorderKt.m275borderxT4_qwU(companion, ChaloTheme.b(composerStartRestartGroup, 0).c, ChaloTheme.a(composerStartRestartGroup, 0).D, ChaloTheme.d(composerStartRestartGroup, 0).f);
            Brush.Companion companion2 = Brush.INSTANCE;
            Modifier modifierClip = ClipKt.clip(BackgroundKt.background$default(modifierM275borderxT4_qwU, Brush.Companion.m4566verticalGradient8A3gB4$default(companion2, CollectionsKt.S(Color.m4595boximpl(ChaloTheme.a(composerStartRestartGroup, 0).D), Color.m4595boximpl(ChaloTheme.a(composerStartRestartGroup, 0).t)), 0.0f, 0.0f, 0, 14, (Object) null), ChaloTheme.d(composerStartRestartGroup, 0).f, 0.0f, 4, null), ChaloTheme.d(composerStartRestartGroup, 0).f);
            boolean z2 = (i3 & 896) == 256;
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (z2 || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new hb(onInfoClick, 13);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            Modifier modifierM787paddingqDBjuR0 = PaddingKt.m787paddingqDBjuR0(ClickableKt.m299clickableoSLSa3U$default(modifierClip, z, null, null, null, (Function0) objRememberedValue, 14, null), ChaloTheme.b(composerStartRestartGroup, 0).f, ChaloTheme.b(composerStartRestartGroup, 0).f, ChaloTheme.b(composerStartRestartGroup, 0).h, ChaloTheme.b(composerStartRestartGroup, 0).f);
            MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), centerVertically, composerStartRestartGroup, 48);
            long currentCompositeKeyHashCode = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
            int i4 = (int) (currentCompositeKeyHashCode ^ (currentCompositeKeyHashCode >>> 32));
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierM787paddingqDBjuR0);
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
            Updater.m3923setimpl(composerM3915constructorimpl, modifierMaterializeModifier, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion3, composerM3915constructorimpl, Integer.valueOf(i4), composerM3915constructorimpl));
            RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
            modifier2 = companion;
            ImageKt.Image(PainterResourceHelperKt.a(IconType.IC_COIN, composerStartRestartGroup, 6), (String) null, SizeKt.m828size3ABfNKs(companion, ChaloTheme.b(composerStartRestartGroup, 0).W), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composerStartRestartGroup, Painter.$stable | 48, 120);
            composerStartRestartGroup = composerStartRestartGroup;
            ChaloSpacersKt.B(composerStartRestartGroup, 0);
            String lowerCase = StringResourcesHelperKt.c(StringEnum.SAVED, new Object[0], composerStartRestartGroup, 6).toLowerCase(Locale.ROOT);
            Intrinsics.h(lowerCase, "toLowerCase(...)");
            if (!passSavingsInfo.d || num == null || num2 == null) {
                composerStartRestartGroup.startReplaceGroup(1105225015);
                TextKt.m2623TextNvy7gAk(vo1.n(ChaloBusScreenHeaderLayout_androidKt.a(num2 != null ? num2.intValue() : 0, passSavingsInfo.c), " ", lowerCase), null, 0L, null, 0L, null, FontWeight.INSTANCE.getSemiBold(), null, 0L, null, null, 0L, 0, false, 0, 0, null, TextStyle.m6751copyNs73l9s$default(ChaloTypographyKt.d(ChaloTheme.e(composerStartRestartGroup, 0)), Brush.Companion.m4558horizontalGradient8A3gB4$default(companion2, CollectionsKt.S(Color.m4595boximpl(ChaloColorTokenKt.c(ChaloColorToken.MidGreen.f9826a)), Color.m4595boximpl(ChaloColorTokenKt.c(ChaloColorToken.DarkGreen.f9783a))), 0.0f, 0.0f, 0, 14, (Object) null), 0.0f, 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, null, 0, 0, 0L, null, null, null, 0, 0, null, 33554430, null), composerStartRestartGroup, 1572864, 0, 131006);
                composerStartRestartGroup = composerStartRestartGroup;
                composerStartRestartGroup.endReplaceGroup();
            } else {
                composerStartRestartGroup.startReplaceGroup(1104906304);
                a(num.intValue(), num2.intValue(), passSavingsInfo.c, null, lowerCase, composerStartRestartGroup, 0);
                composerStartRestartGroup.endReplaceGroup();
            }
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
            scopeUpdateScopeEndRestartGroup.updateScope(new lh(passSavingsInfo, z, onInfoClick, modifier2, i, 0));
        }
    }
}
