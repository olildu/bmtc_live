package app.chalo.stoptripdetails.ui;

import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.lazy.LazyDslKt;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material3.IconKt;
import androidx.compose.material3.ScaffoldKt;
import androidx.compose.material3.TextKt;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.MutableIntState;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotIntStateKt;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.AlphaKt;
import androidx.compose.ui.draw.ClipKt;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.Shadow;
import androidx.compose.ui.graphics.drawscope.DrawStyle;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.layout.ContentScale;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.AnnotatedStringKt;
import androidx.compose.ui.text.PlatformSpanStyle;
import androidx.compose.ui.text.SpanStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontSynthesis;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.intl.LocaleList;
import androidx.compose.ui.text.style.BaselineShift;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.text.style.TextGeometricTransform;
import androidx.compose.ui.text.style.TextOverflow;
import androidx.compose.ui.unit.Dp;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.core.view.accessibility.AccessibilityEventCompat;
import app.chalo.ads.UnifiedAdCapability_androidKt;
import app.chalo.ads.UnifiedAdHostsKt;
import app.chalo.ads.UnifiedAdSlotSpec;
import app.chalo.ads.UnifiedAdSlotSpecs;
import app.chalo.compose.ChaloEtaComponentKt;
import app.chalo.compose.components.ChaloSpacersKt;
import app.chalo.compose.components.ChaloToolBarKt;
import app.chalo.compose.components.GenericErrorScreenComponentKt;
import app.chalo.compose.components.SpecialFeatureTagListComposableKt;
import app.chalo.compose.components.shimmer.ShimmerEffectKt;
import app.chalo.compose.resources.PainterResourceHelperKt;
import app.chalo.compose.resources.StringResourcesHelperKt;
import app.chalo.compose.theme.ChaloTheme;
import app.chalo.compose.theme.ChaloTypographyKt;
import app.chalo.crashlytics.CrashlyticsLogger;
import app.chalo.crashlytics.CrashlyticsLoggerUtils;
import app.chalo.livetracking.routedetails.data.model.app.ExtensionsKt;
import app.chalo.providers.RouteNamingSchemeType;
import app.chalo.providers.iconassetprovider.IconType;
import app.chalo.providers.stringprovider.StringEnum;
import app.chalo.stoptripdetails.data.model.StopETAModel;
import app.chalo.stoptripdetails.data.model.StopTripDetailsUiModel;
import app.chalo.stoptripdetails.data.model.app.EstimatedTime;
import app.chalo.stoptripdetails.data.model.app.EstimatedTimeType;
import app.chalo.stoptripdetails.ui.StopTripDetailsScreenKt;
import com.arkivanov.decompose.extensions.compose.SubscribeAsStateKt;
import com.google.android.gms.wallet.WalletConstants;
import defpackage.a21;
import defpackage.b21;
import defpackage.b3;
import defpackage.c21;
import defpackage.d21;
import defpackage.d4;
import defpackage.ey0;
import defpackage.fb1;
import defpackage.h6;
import defpackage.i41;
import defpackage.l6;
import defpackage.o01;
import defpackage.pb1;
import defpackage.pk0;
import defpackage.sx0;
import defpackage.u3;
import defpackage.v31;
import defpackage.vd;
import defpackage.wl;
import defpackage.xd;
import defpackage.xm0;
import defpackage.y11;
import defpackage.zc;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KFunction;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002¨\u0006\u0004²\u0006\f\u0010\u0001\u001a\u00020\u00008\nX\u008a\u0084\u0002²\u0006\u000e\u0010\u0003\u001a\u00020\u00028\n@\nX\u008a\u008e\u0002"}, d2 = {"Lapp/chalo/stoptripdetails/ui/StopTripDetailsViewState;", "viewState", "", "anchoredAdHeightDp", "home_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class StopTripDetailsScreenKt {

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f9519a;
        public static final /* synthetic */ int[] b;
        public static final /* synthetic */ int[] c;

        static {
            int[] iArr = new int[TripScheduleScreenType.values().length];
            try {
                iArr[TripScheduleScreenType.LOADING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[TripScheduleScreenType.ERROR.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[TripScheduleScreenType.SUCCESS.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f9519a = iArr;
            int[] iArr2 = new int[RouteNamingSchemeType.values().length];
            try {
                iArr2[RouteNamingSchemeType.VIA.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[RouteNamingSchemeType.DEFAULT.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            b = iArr2;
            int[] iArr3 = new int[EstimatedTimeType.values().length];
            try {
                iArr3[EstimatedTimeType.INVALID.ordinal()] = 1;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr3[EstimatedTimeType.NO_MORE_TRIPS.ordinal()] = 2;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr3[EstimatedTimeType.VALID.ordinal()] = 3;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr3[EstimatedTimeType.AFTER_X.ordinal()] = 4;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr3[EstimatedTimeType.EVERY_X_MIN.ordinal()] = 5;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr3[EstimatedTimeType.VALID_WITH_DISCLAIMER.ordinal()] = 6;
            } catch (NoSuchFieldError unused11) {
            }
            c = iArr3;
        }
    }

    public static final void a(Modifier modifier, StopTripDetailsUiModel stopTripDetailsUiModel, Composer composer, int i) {
        Modifier modifier2;
        Composer composerStartRestartGroup = composer.startRestartGroup(845920194);
        int i2 = i | 6;
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changed(stopTripDetailsUiModel) ? 32 : 16;
        }
        if (composerStartRestartGroup.shouldExecute((i2 & 19) != 18, i2 & 1)) {
            modifier2 = Modifier.INSTANCE;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(845920194, i2, -1, "app.chalo.stoptripdetails.ui.BusEstimatedTimeOrLiveEtaWithSeatOccupancyText (StopTripDetailsScreen.kt:429)");
            }
            MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), Alignment.INSTANCE.getCenterVertically(), composerStartRestartGroup, 48);
            long currentCompositeKeyHashCode = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
            int i3 = (int) (currentCompositeKeyHashCode ^ (currentCompositeKeyHashCode >>> 32));
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifier2);
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
            StopETAModel stopETAModel = stopTripDetailsUiModel.k;
            if (stopETAModel instanceof StopETAModel.LiveEta) {
                composerStartRestartGroup.startReplaceGroup(-1893492296);
                ChaloEtaComponentKt.a(((StopETAModel.LiveEta) stopETAModel).f9465a, null, null, composerStartRestartGroup, 0, 6);
                IconType iconTypeB = ExtensionsKt.b(stopTripDetailsUiModel.h);
                if (iconTypeB == null) {
                    composerStartRestartGroup.startReplaceGroup(-1893292843);
                } else {
                    composerStartRestartGroup.startReplaceGroup(-1893292842);
                    ImageKt.Image(PainterResourceHelperKt.a(iconTypeB, composerStartRestartGroup, 0), (String) null, PaddingKt.m788paddingqDBjuR0$default(modifier2, ChaloTheme.b(composerStartRestartGroup, 0).d, 0.0f, 0.0f, 0.0f, 14, null), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composerStartRestartGroup, Painter.$stable | 48, 120);
                }
                composerStartRestartGroup.endReplaceGroup();
                composerStartRestartGroup.endReplaceGroup();
            } else if (Intrinsics.d(stopETAModel, StopETAModel.Unknown.f9467a)) {
                composerStartRestartGroup.startReplaceGroup(-1892973821);
                ShimmerEffectKt.a(ClipKt.clip(SizeKt.m833width3ABfNKs(modifier2, ChaloTheme.b(composerStartRestartGroup, 0).n), RoundedCornerShapeKt.getCircleShape()), ChaloTheme.b(composerStartRestartGroup, 0).h, 0.0f, null, 0L, 0L, composerStartRestartGroup, 0, 60);
                composerStartRestartGroup = composerStartRestartGroup;
                composerStartRestartGroup.endReplaceGroup();
            } else if (stopETAModel instanceof StopETAModel.AfterXTime) {
                composerStartRestartGroup.startReplaceGroup(-1892679941);
                b(((StopETAModel.AfterXTime) stopETAModel).f9461a, composerStartRestartGroup, 0);
                composerStartRestartGroup.endReplaceGroup();
            } else if (stopETAModel instanceof StopETAModel.FixedTime) {
                composerStartRestartGroup.startReplaceGroup(-1892533125);
                b(((StopETAModel.FixedTime) stopETAModel).f9462a, composerStartRestartGroup, 0);
                composerStartRestartGroup.endReplaceGroup();
            } else if (stopETAModel instanceof StopETAModel.FrequencyTrips) {
                composerStartRestartGroup.startReplaceGroup(-1892381349);
                b(((StopETAModel.FrequencyTrips) stopETAModel).f9463a, composerStartRestartGroup, 0);
                composerStartRestartGroup.endReplaceGroup();
            } else if (stopETAModel instanceof StopETAModel.InvalidTrips) {
                composerStartRestartGroup.startReplaceGroup(-1892231557);
                b(((StopETAModel.InvalidTrips) stopETAModel).f9464a, composerStartRestartGroup, 0);
                composerStartRestartGroup.endReplaceGroup();
            } else if (stopETAModel instanceof StopETAModel.NoMoreTrips) {
                composerStartRestartGroup.startReplaceGroup(-1892082757);
                b(((StopETAModel.NoMoreTrips) stopETAModel).f9466a, composerStartRestartGroup, 0);
                composerStartRestartGroup.endReplaceGroup();
            } else {
                if (!(stopETAModel instanceof StopETAModel.ValidTripsWithDisclaimer)) {
                    throw pk0.p(composerStartRestartGroup, -1446554812);
                }
                composerStartRestartGroup.startReplaceGroup(-1891915884);
                ImageKt.Image(PainterResourceHelperKt.a(IconType.ALERT_ICON_ORANGE, composerStartRestartGroup, 6), "", (Modifier) null, (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composerStartRestartGroup, Painter.$stable | 48, 124);
                b(((StopETAModel.ValidTripsWithDisclaimer) stopETAModel).f9468a, composerStartRestartGroup, 0);
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
            scopeUpdateScopeEndRestartGroup.updateScope(new c21(modifier2, stopTripDetailsUiModel, i, 1));
        }
    }

    public static final void b(EstimatedTime estimatedTime, Composer composer, int i) {
        int i2;
        Composer composer2;
        AnnotatedString annotatedStringAnnotatedString$default;
        Composer composerStartRestartGroup = composer.startRestartGroup(2099011751);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(estimatedTime) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (composerStartRestartGroup.shouldExecute((i2 & 3) != 2, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(2099011751, i2, -1, "app.chalo.stoptripdetails.ui.GetEstimatedTimeText (StopTripDetailsScreen.kt:576)");
            }
            EstimatedTimeType estimatedTimeType = estimatedTime.b;
            String str = estimatedTime.f9492a;
            switch (WhenMappings.c[estimatedTimeType.ordinal()]) {
                case 1:
                    composerStartRestartGroup.startReplaceGroup(-1484331275);
                    annotatedStringAnnotatedString$default = AnnotatedStringKt.AnnotatedString$default(str, new SpanStyle(ChaloTheme.a(composerStartRestartGroup, 0).T, ChaloTypographyKt.d(ChaloTheme.e(composerStartRestartGroup, 0)).m6771getFontSizeXSAIIZE(), ChaloTypographyKt.d(ChaloTheme.e(composerStartRestartGroup, 0)).getFontWeight(), (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (PlatformSpanStyle) null, (DrawStyle) null, 65528, (DefaultConstructorMarker) null), null, 4, null);
                    composerStartRestartGroup.endReplaceGroup();
                    break;
                case 2:
                    composerStartRestartGroup.startReplaceGroup(-1484321195);
                    annotatedStringAnnotatedString$default = AnnotatedStringKt.AnnotatedString$default(str, new SpanStyle(ChaloTheme.a(composerStartRestartGroup, 0).T, ChaloTypographyKt.d(ChaloTheme.e(composerStartRestartGroup, 0)).m6771getFontSizeXSAIIZE(), ChaloTypographyKt.d(ChaloTheme.e(composerStartRestartGroup, 0)).getFontWeight(), (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (PlatformSpanStyle) null, (DrawStyle) null, 65528, (DefaultConstructorMarker) null), null, 4, null);
                    composerStartRestartGroup.endReplaceGroup();
                    break;
                case 3:
                    composerStartRestartGroup.startReplaceGroup(1231007318);
                    AnnotatedString.Builder builder = new AnnotatedString.Builder(str);
                    builder.addStyle(new SpanStyle(ChaloTheme.a(composerStartRestartGroup, 0).g, ChaloTypographyKt.b(ChaloTheme.e(composerStartRestartGroup, 0)).m6771getFontSizeXSAIIZE(), ChaloTypographyKt.b(ChaloTheme.e(composerStartRestartGroup, 0)).getFontWeight(), (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (PlatformSpanStyle) null, (DrawStyle) null, 65528, (DefaultConstructorMarker) null), 0, str.length() - 3);
                    builder.addStyle(new SpanStyle(ChaloTheme.a(composerStartRestartGroup, 0).g, ChaloTypographyKt.d(ChaloTheme.e(composerStartRestartGroup, 0)).m6771getFontSizeXSAIIZE(), FontWeight.INSTANCE.getSemiBold(), (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (PlatformSpanStyle) null, (DrawStyle) null, 65528, (DefaultConstructorMarker) null), str.length() - 3, str.length());
                    annotatedStringAnnotatedString$default = builder.toAnnotatedString();
                    composerStartRestartGroup.endReplaceGroup();
                    break;
                case 4:
                    composerStartRestartGroup.startReplaceGroup(1231949935);
                    AnnotatedString.Builder builder2 = new AnnotatedString.Builder(str);
                    long j = ChaloTheme.a(composerStartRestartGroup, 0).i;
                    long jM6771getFontSizeXSAIIZE = ChaloTypographyKt.c(ChaloTheme.e(composerStartRestartGroup, 0)).m6771getFontSizeXSAIIZE();
                    FontWeight.Companion companion = FontWeight.INSTANCE;
                    builder2.addStyle(new SpanStyle(j, jM6771getFontSizeXSAIIZE, companion.getSemiBold(), (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (PlatformSpanStyle) null, (DrawStyle) null, 65528, (DefaultConstructorMarker) null), 0, 6);
                    builder2.addStyle(new SpanStyle(ChaloTheme.a(composerStartRestartGroup, 0).g, ChaloTypographyKt.b(ChaloTheme.e(composerStartRestartGroup, 0)).m6771getFontSizeXSAIIZE(), ChaloTypographyKt.b(ChaloTheme.e(composerStartRestartGroup, 0)).getFontWeight(), (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (PlatformSpanStyle) null, (DrawStyle) null, 65528, (DefaultConstructorMarker) null), 6, str.length() - 3);
                    builder2.addStyle(new SpanStyle(ChaloTheme.a(composerStartRestartGroup, 0).i, ChaloTypographyKt.c(ChaloTheme.e(composerStartRestartGroup, 0)).m6771getFontSizeXSAIIZE(), companion.getSemiBold(), (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (PlatformSpanStyle) null, (DrawStyle) null, 65528, (DefaultConstructorMarker) null), str.length() - 3, str.length());
                    annotatedStringAnnotatedString$default = builder2.toAnnotatedString();
                    composerStartRestartGroup.endReplaceGroup();
                    break;
                case 5:
                    composerStartRestartGroup.startReplaceGroup(1233210767);
                    AnnotatedString.Builder builder3 = new AnnotatedString.Builder(str);
                    long j2 = ChaloTheme.a(composerStartRestartGroup, 0).i;
                    long jM6771getFontSizeXSAIIZE2 = ChaloTypographyKt.c(ChaloTheme.e(composerStartRestartGroup, 0)).m6771getFontSizeXSAIIZE();
                    FontWeight.Companion companion2 = FontWeight.INSTANCE;
                    builder3.addStyle(new SpanStyle(j2, jM6771getFontSizeXSAIIZE2, companion2.getSemiBold(), (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (PlatformSpanStyle) null, (DrawStyle) null, 65528, (DefaultConstructorMarker) null), 0, 6);
                    builder3.addStyle(new SpanStyle(ChaloTheme.a(composerStartRestartGroup, 0).g, ChaloTypographyKt.b(ChaloTheme.e(composerStartRestartGroup, 0)).m6771getFontSizeXSAIIZE(), ChaloTypographyKt.b(ChaloTheme.e(composerStartRestartGroup, 0)).getFontWeight(), (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (PlatformSpanStyle) null, (DrawStyle) null, 65528, (DefaultConstructorMarker) null), 6, str.length() - 4);
                    builder3.addStyle(new SpanStyle(ChaloTheme.a(composerStartRestartGroup, 0).i, ChaloTypographyKt.c(ChaloTheme.e(composerStartRestartGroup, 0)).m6771getFontSizeXSAIIZE(), companion2.getSemiBold(), (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (PlatformSpanStyle) null, (DrawStyle) null, 65528, (DefaultConstructorMarker) null), str.length() - 4, str.length());
                    annotatedStringAnnotatedString$default = builder3.toAnnotatedString();
                    composerStartRestartGroup.endReplaceGroup();
                    break;
                case 6:
                    composerStartRestartGroup.startReplaceGroup(1234459447);
                    AnnotatedString.Builder builder4 = new AnnotatedString.Builder(str);
                    builder4.addStyle(new SpanStyle(ChaloTheme.a(composerStartRestartGroup, 0).g, ChaloTypographyKt.b(ChaloTheme.e(composerStartRestartGroup, 0)).m6771getFontSizeXSAIIZE(), ChaloTypographyKt.b(ChaloTheme.e(composerStartRestartGroup, 0)).getFontWeight(), (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (PlatformSpanStyle) null, (DrawStyle) null, 65528, (DefaultConstructorMarker) null), 6, str.length() - 4);
                    annotatedStringAnnotatedString$default = builder4.toAnnotatedString();
                    composerStartRestartGroup.endReplaceGroup();
                    break;
                default:
                    throw pk0.p(composerStartRestartGroup, -1484328924);
            }
            composer2 = composerStartRestartGroup;
            TextKt.m2624TextZ58ophY(annotatedStringAnnotatedString$default, PaddingKt.m786paddingVpY3zN4$default(Modifier.INSTANCE, ChaloTheme.b(composerStartRestartGroup, 0).f, 0.0f, 2, null), ChaloTheme.a(composerStartRestartGroup, 0).f, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, ChaloTypographyKt.l(ChaloTheme.e(composerStartRestartGroup, 0)), composer2, 0, 0, 262136);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer2 = composerStartRestartGroup;
            composer2.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new d21(estimatedTime, i, 1));
        }
    }

    public static final void c(StopTripDetailsUiModel stopTripDetailsUiModel, Composer composer, int i) {
        int i2;
        Composer composer2;
        String strC;
        Composer composerStartRestartGroup = composer.startRestartGroup(807592012);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changed(stopTripDetailsUiModel) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (composerStartRestartGroup.shouldExecute((i2 & 3) != 2, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(807592012, i2, -1, "app.chalo.stoptripdetails.ui.RouteDetailsWithEtas (StopTripDetailsScreen.kt:366)");
            }
            Modifier.Companion companion = Modifier.INSTANCE;
            String strC2 = null;
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
            int i4 = i2 & 14;
            e(stopTripDetailsUiModel, composerStartRestartGroup, i4);
            d(stopTripDetailsUiModel, composerStartRestartGroup, i4);
            ChaloSpacersKt.t(composerStartRestartGroup, 0);
            int i5 = WhenMappings.b[stopTripDetailsUiModel.u.ordinal()];
            if (i5 == 1) {
                composerStartRestartGroup.startReplaceGroup(-1103464103);
                String str = stopTripDetailsUiModel.t;
                if (str == null) {
                    composerStartRestartGroup.startReplaceGroup(-1103464104);
                } else {
                    composerStartRestartGroup.startReplaceGroup(-1103464103);
                    strC2 = StringResourcesHelperKt.c(StringEnum.VIA_, new Object[]{str}, composerStartRestartGroup, 6);
                }
                composerStartRestartGroup.endReplaceGroup();
                composerStartRestartGroup.endReplaceGroup();
                strC = strC2;
            } else {
                if (i5 != 2) {
                    throw pk0.p(composerStartRestartGroup, 1349874309);
                }
                composerStartRestartGroup.startReplaceGroup(1349881522);
                strC = StringResourcesHelperKt.c(StringEnum.TO_, new Object[]{stopTripDetailsUiModel.g}, composerStartRestartGroup, 6);
                composerStartRestartGroup.endReplaceGroup();
            }
            if (strC != null) {
                composerStartRestartGroup.startReplaceGroup(-1103166255);
                TextKt.m2623TextNvy7gAk(strC, SizeKt.fillMaxWidth(companion, 0.7f), ChaloTheme.a(composerStartRestartGroup, 0).g, null, 0L, null, null, null, 0L, null, null, 0L, TextOverflow.INSTANCE.m7226getEllipsisgIe3tQ8(), false, 2, 0, null, ChaloTypographyKt.l(ChaloTheme.e(composerStartRestartGroup, 0)), composerStartRestartGroup, 48, 24960, 110584);
                composer2 = composerStartRestartGroup;
            } else {
                composer2 = composerStartRestartGroup;
                composer2.startReplaceGroup(-1117197568);
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
            scopeUpdateScopeEndRestartGroup.updateScope(new b21(stopTripDetailsUiModel, i, 3));
        }
    }

    public static final void d(StopTripDetailsUiModel stopTripDetailsUiModel, Composer composer, int i) {
        int i2;
        String strC;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1199678185);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changed(stopTripDetailsUiModel) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (composerStartRestartGroup.shouldExecute((i2 & 3) != 2, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1199678185, i2, -1, "app.chalo.stoptripdetails.ui.RouteNameWithTimeData (StopTripDetailsScreen.kt:399)");
            }
            Modifier.Companion companion = Modifier.INSTANCE;
            Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null);
            MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), Alignment.INSTANCE.getCenterVertically(), composerStartRestartGroup, 48);
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
            pk0.v(companion2, composerM3915constructorimpl, measurePolicyRowMeasurePolicy, composerM3915constructorimpl, currentCompositionLocalMap);
            Updater.m3923setimpl(composerM3915constructorimpl, modifierMaterializeModifier, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion2, composerM3915constructorimpl, Integer.valueOf(i3), composerM3915constructorimpl));
            RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
            int i4 = WhenMappings.b[stopTripDetailsUiModel.u.ordinal()];
            if (i4 == 1) {
                composerStartRestartGroup.startReplaceGroup(1913750645);
                strC = StringResourcesHelperKt.c(StringEnum.TO_, new Object[]{stopTripDetailsUiModel.g}, composerStartRestartGroup, 6);
                composerStartRestartGroup.endReplaceGroup();
            } else {
                if (i4 != 2) {
                    throw pk0.p(composerStartRestartGroup, 1913747908);
                }
                composerStartRestartGroup.startReplaceGroup(1913754780);
                composerStartRestartGroup.endReplaceGroup();
                strC = stopTripDetailsUiModel.d;
            }
            TextKt.m2623TextNvy7gAk(strC, SizeKt.fillMaxWidth(companion, 0.5f), ChaloTheme.a(composerStartRestartGroup, 0).e, null, 0L, null, null, null, 0L, null, null, 0L, TextOverflow.INSTANCE.m7226getEllipsisgIe3tQ8(), false, 2, 0, null, ChaloTypographyKt.f(ChaloTheme.e(composerStartRestartGroup, 0)), composerStartRestartGroup, 48, 24960, 110584);
            composerStartRestartGroup = composerStartRestartGroup;
            SpacerKt.Spacer(i41.a(rowScopeInstance, companion, 1.0f, false, 2, null), composerStartRestartGroup, 0);
            a(null, stopTripDetailsUiModel, composerStartRestartGroup, (i2 << 3) & 112);
            composerStartRestartGroup.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new b21(stopTripDetailsUiModel, i, 4));
        }
    }

    public static final void e(StopTripDetailsUiModel stopTripDetailsUiModel, Composer composer, int i) {
        int i2;
        Modifier modifier;
        int i3;
        int i4;
        Composer composerStartRestartGroup = composer.startRestartGroup(1678488747);
        if ((i & 6) == 0) {
            i2 = i | (composerStartRestartGroup.changed(stopTripDetailsUiModel) ? 4 : 2);
        } else {
            i2 = i;
        }
        if (composerStartRestartGroup.shouldExecute((i2 & 3) != 2, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1678488747, i2, -1, "app.chalo.stoptripdetails.ui.RouteSpecialFeatureTagsAndVehicleNumber (StopTripDetailsScreen.kt:491)");
            }
            Modifier.Companion companion = Modifier.INSTANCE;
            Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null);
            MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), Alignment.INSTANCE.getTop(), composerStartRestartGroup, 0);
            long currentCompositeKeyHashCode = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
            int i5 = (int) (currentCompositeKeyHashCode ^ (currentCompositeKeyHashCode >>> 32));
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
            pk0.v(companion2, composerM3915constructorimpl, measurePolicyRowMeasurePolicy, composerM3915constructorimpl, currentCompositionLocalMap);
            Updater.m3923setimpl(composerM3915constructorimpl, modifierMaterializeModifier, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion2, composerM3915constructorimpl, Integer.valueOf(i5), composerM3915constructorimpl));
            RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
            if (stopTripDetailsUiModel.j.isEmpty()) {
                composerStartRestartGroup.startReplaceGroup(789783003);
            } else {
                composerStartRestartGroup.startReplaceGroup(807455266);
                SpecialFeatureTagListComposableKt.a(0, 2, composerStartRestartGroup, null, stopTripDetailsUiModel.j);
                ChaloSpacersKt.s(null, 0, composerStartRestartGroup, 1);
            }
            composerStartRestartGroup.endReplaceGroup();
            SpacerKt.Spacer(i41.a(rowScopeInstance, companion, 1.0f, false, 2, null), composerStartRestartGroup, 0);
            String str = stopTripDetailsUiModel.m;
            if (str == null || str.length() == 0) {
                modifier = null;
                i3 = 1;
                i4 = 0;
                composerStartRestartGroup.startReplaceGroup(789783003);
            } else {
                composerStartRestartGroup.startReplaceGroup(807736498);
                modifier = null;
                i3 = 1;
                i4 = 0;
                TextKt.m2623TextNvy7gAk(stopTripDetailsUiModel.m, PaddingKt.m786paddingVpY3zN4$default(companion, ChaloTheme.b(composerStartRestartGroup, 0).c, 0.0f, 2, null), ChaloTheme.a(composerStartRestartGroup, 0).g, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ChaloTypographyKt.d(ChaloTheme.e(composerStartRestartGroup, 0)), composerStartRestartGroup, 0, 0, 131064);
                composerStartRestartGroup = composerStartRestartGroup;
            }
            composerStartRestartGroup.endReplaceGroup();
            ChaloSpacersKt.s(modifier, i4, composerStartRestartGroup, i3);
            composerStartRestartGroup.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new b21(stopTripDetailsUiModel, i, 5));
        }
    }

    public static final void f(Modifier modifier, Composer composer, int i) {
        int i2;
        Composer composerStartRestartGroup = composer.startRestartGroup(1283405375);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changed(modifier) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (composerStartRestartGroup.shouldExecute((i2 & 3) != 2, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1283405375, i2, -1, "app.chalo.stoptripdetails.ui.ShimmerBox (StopTripDetailsScreen.kt:548)");
            }
            BoxKt.Box(ShimmerEffectKt.b(modifier, Color.m4595boximpl(ChaloTheme.a(composerStartRestartGroup, 0).p), Color.m4595boximpl(ChaloTheme.a(composerStartRestartGroup, 0).q), 4), composerStartRestartGroup, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new zc(modifier, i, 26));
        }
    }

    public static final void g(Modifier modifier, StopTripDetailsViewState stopTripDetailsViewState, Function1 function1, List list, UnifiedAdSlotSpec unifiedAdSlotSpec, float f, int i, Function1 function2, Function0 function0, Composer composer, int i2) {
        int i3;
        List list2;
        Composer composer2;
        Object obj;
        float f2;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1118533189);
        if ((i2 & 6) == 0) {
            i3 = (composerStartRestartGroup.changed(modifier) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(stopTripDetailsViewState) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(function1) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            list2 = list;
            i3 |= composerStartRestartGroup.changedInstance(list2) ? 2048 : 1024;
        } else {
            list2 = list;
        }
        if ((i2 & 24576) == 0) {
            i3 |= (32768 & i2) == 0 ? composerStartRestartGroup.changed(unifiedAdSlotSpec) : composerStartRestartGroup.changedInstance(unifiedAdSlotSpec) ? 16384 : 8192;
        }
        if ((196608 & i2) == 0) {
            i3 |= composerStartRestartGroup.changed(true) ? 131072 : 65536;
        }
        if ((1572864 & i2) == 0) {
            i3 |= composerStartRestartGroup.changed(f) ? 1048576 : 524288;
        }
        if ((12582912 & i2) == 0) {
            i3 |= composerStartRestartGroup.changed(i) ? 8388608 : 4194304;
        }
        if ((100663296 & i2) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(function2) ? AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL : 33554432;
        }
        if ((i2 & 805306368) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(function0) ? 536870912 : 268435456;
        }
        if (composerStartRestartGroup.shouldExecute((i3 & 306783379) != 306783378, i3 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1118533189, i3, -1, "app.chalo.stoptripdetails.ui.StopDetailScreenContent (StopTripDetailsScreen.kt:150)");
            }
            TripScheduleScreenType screenType = stopTripDetailsViewState.e;
            Intrinsics.i(screenType, "screenType");
            boolean z = screenType == TripScheduleScreenType.SUCCESS;
            int i4 = i < 0 ? 0 : i;
            boolean z2 = z && i4 > 0;
            float fM7278constructorimpl = z2 ? Dp.m7278constructorimpl(Dp.m7278constructorimpl(i4) + f) : Dp.m7278constructorimpl(0);
            float fM7278constructorimpl2 = z2 ? f : Dp.m7278constructorimpl(0);
            Modifier modifierFillMaxSize$default = SizeKt.fillMaxSize$default(modifier, 0.0f, 1, null);
            Alignment.Companion companion = Alignment.INSTANCE;
            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(companion.getTopStart(), false);
            long currentCompositeKeyHashCode = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
            int i5 = (int) (currentCompositeKeyHashCode ^ (currentCompositeKeyHashCode >>> 32));
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierFillMaxSize$default);
            ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor = companion2.getConstructor();
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
            pk0.v(companion2, composerM3915constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy, composerM3915constructorimpl, currentCompositionLocalMap);
            Updater.m3923setimpl(composerM3915constructorimpl, modifierMaterializeModifier, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion2, composerM3915constructorimpl, Integer.valueOf(i5), composerM3915constructorimpl));
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            int i6 = WhenMappings.f9519a[stopTripDetailsViewState.e.ordinal()];
            if (i6 == 1) {
                composer2 = composerStartRestartGroup;
                obj = null;
                f2 = 0.0f;
                composer2.startReplaceGroup(593889961);
                l(composer2, 0);
                composer2.endReplaceGroup();
            } else if (i6 == 2) {
                composer2 = composerStartRestartGroup;
                obj = null;
                f2 = 0.0f;
                composer2.startReplaceGroup(593997376);
                Modifier modifierFillMaxHeight = SizeKt.fillMaxHeight(Modifier.INSTANCE, 0.7f);
                boolean z3 = (i3 & 896) == 256;
                Object objRememberedValue = composer2.rememberedValue();
                if (z3 || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = new pb1(function1, 2);
                    composer2.updateRememberedValue(objRememberedValue);
                }
                GenericErrorScreenComponentKt.a(modifierFillMaxHeight, null, false, (Function0) objRememberedValue, composer2, 6, 6);
                composer2.endReplaceGroup();
            } else {
                if (i6 != 3) {
                    throw pk0.p(composerStartRestartGroup, 434798340);
                }
                composerStartRestartGroup.startReplaceGroup(594310507);
                boolean z4 = (i3 & 896) == 256;
                Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                if (z4 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue2 = new xd(function1, 17);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                }
                obj = null;
                f2 = 0.0f;
                m(list2, (Function2) objRememberedValue2, 0.0f, fM7278constructorimpl, composerStartRestartGroup, (i3 >> 9) & 14);
                composer2 = composerStartRestartGroup;
                composer2.endReplaceGroup();
            }
            if (z) {
                composer2.startReplaceGroup(594957570);
                Modifier modifierM788paddingqDBjuR0$default = PaddingKt.m788paddingqDBjuR0$default(boxScopeInstance.align(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, f2, 1, obj), companion.getBottomCenter()), 0.0f, 0.0f, 0.0f, fM7278constructorimpl2, 7, null);
                int i7 = i3 >> 18;
                Composer composer3 = composer2;
                i(modifierM788paddingqDBjuR0$default, unifiedAdSlotSpec, function2, function0, composer3, ((i3 >> 9) & 112) | (i7 & 896) | (i7 & 7168));
                composer2 = composer3;
            } else {
                composer2.startReplaceGroup(587175361);
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
            scopeUpdateScopeEndRestartGroup.updateScope(new h6(modifier, stopTripDetailsViewState, function1, list, unifiedAdSlotSpec, f, i, function2, function0, i2));
        }
    }

    public static final void h(StopTripDetailsViewState stopTripDetailsViewState, Composer composer, int i) {
        int i2;
        Composer composerStartRestartGroup = composer.startRestartGroup(995820515);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(stopTripDetailsViewState) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (composerStartRestartGroup.shouldExecute((i2 & 3) != 2, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(995820515, i2, -1, "app.chalo.stoptripdetails.ui.StopDetailScreenToolBar (StopTripDetailsScreen.kt:299)");
            }
            ChaloToolBarKt.a(ComposableLambdaKt.rememberComposableLambda(-1026833606, true, new xm0(stopTripDetailsViewState, 21), composerStartRestartGroup, 54), null, ChaloTheme.c(composerStartRestartGroup, 0).e, 0L, ComposableLambdaKt.rememberComposableLambda(-1723694066, true, new sx0(stopTripDetailsViewState, 19), composerStartRestartGroup, 54), null, composerStartRestartGroup, 24582, 42);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new fb1(stopTripDetailsViewState, i, 13));
        }
    }

    public static final void i(Modifier modifier, UnifiedAdSlotSpec unifiedAdSlotSpec, Function1 function1, Function0 function0, Composer composer, int i) {
        int i2;
        Composer composerStartRestartGroup = composer.startRestartGroup(790919282);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changed(modifier) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= (i & 64) == 0 ? composerStartRestartGroup.changed(unifiedAdSlotSpec) : composerStartRestartGroup.changedInstance(unifiedAdSlotSpec) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(function1) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(function0) ? 2048 : 1024;
        }
        if (composerStartRestartGroup.shouldExecute((i2 & 1171) != 1170, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(790919282, i2, -1, "app.chalo.stoptripdetails.ui.StopTripDetailsAdOverlay (StopTripDetailsScreen.kt:250)");
            }
            Modifier modifierM264backgroundbw27NRU$default = BackgroundKt.m264backgroundbw27NRU$default(SizeKt.fillMaxWidth$default(modifier, 0.0f, 1, null), ChaloTheme.a(composerStartRestartGroup, 0).t, null, 2, null);
            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composerStartRestartGroup, 0);
            long currentCompositeKeyHashCode = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
            int i3 = i2;
            int i4 = (int) (currentCompositeKeyHashCode ^ (currentCompositeKeyHashCode >>> 32));
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierM264backgroundbw27NRU$default);
            ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor = companion.getConstructor();
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
            pk0.v(companion, composerM3915constructorimpl, measurePolicyColumnMeasurePolicy, composerM3915constructorimpl, currentCompositionLocalMap);
            Updater.m3923setimpl(composerM3915constructorimpl, modifierMaterializeModifier, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion, composerM3915constructorimpl, Integer.valueOf(i4), composerM3915constructorimpl));
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
            Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null);
            boolean z = (i3 & 896) == 256;
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (z || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new xd(function1, 18);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            Function2 function2 = (Function2) objRememberedValue;
            boolean z2 = (i3 & 7168) == 2048;
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (z2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue2 = new l6(function0, 20);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            Function1 function3 = (Function1) objRememberedValue2;
            CrashlyticsLogger crashlyticsLoggerA = CrashlyticsLoggerUtils.a();
            boolean zChangedInstance = composerStartRestartGroup.changedInstance(crashlyticsLoggerA);
            Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                StopTripDetailsScreenKt$StopTripDetailsAdOverlay$1$3$1 stopTripDetailsScreenKt$StopTripDetailsAdOverlay$1$3$1 = new StopTripDetailsScreenKt$StopTripDetailsAdOverlay$1$3$1(1, crashlyticsLoggerA, CrashlyticsLogger.class, "addLog", "addLog(Lapp/chalo/crashlytics/CrashlyticsLog;)V", 0);
                composerStartRestartGroup.updateRememberedValue(stopTripDetailsScreenKt$StopTripDetailsAdOverlay$1$3$1);
                objRememberedValue3 = stopTripDetailsScreenKt$StopTripDetailsAdOverlay$1$3$1;
            }
            UnifiedAdHostsKt.a(unifiedAdSlotSpec, modifierFillMaxWidth$default, false, 0L, 0.0f, function2, function3, (Function1) ((KFunction) objRememberedValue3), composerStartRestartGroup, 48 | ((i3 >> 3) & 14), WalletConstants.ERROR_CODE_UNSUPPORTED_API_VERSION);
            composerStartRestartGroup.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new ey0(i, 9, modifier, unifiedAdSlotSpec, function1, function0));
        }
    }

    public static final void j(Composer composer, int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(490256510);
        if (composerStartRestartGroup.shouldExecute(i != 0, i & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(490256510, i, -1, "app.chalo.stoptripdetails.ui.StopTripDetailsCardLoadingShimmer (StopTripDetailsScreen.kt:515)");
            }
            Modifier.Companion companion = Modifier.INSTANCE;
            Modifier modifierM785paddingVpY3zN4 = PaddingKt.m785paddingVpY3zN4(BackgroundKt.m264backgroundbw27NRU$default(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), ChaloTheme.a(composerStartRestartGroup, 0).t, null, 2, null), ChaloTheme.b(composerStartRestartGroup, 0).h, ChaloTheme.b(composerStartRestartGroup, 0).i);
            MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), Alignment.INSTANCE.getCenterVertically(), composerStartRestartGroup, 48);
            long currentCompositeKeyHashCode = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
            int i2 = (int) (currentCompositeKeyHashCode ^ (currentCompositeKeyHashCode >>> 32));
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
            Updater.m3923setimpl(composerM3915constructorimpl, modifierMaterializeModifier, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion2, composerM3915constructorimpl, Integer.valueOf(i2), composerM3915constructorimpl));
            RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
            f(ClipKt.clip(SizeKt.m828size3ABfNKs(companion, ChaloTheme.b(composerStartRestartGroup, 0).i), ChaloTheme.d(composerStartRestartGroup, 0).c), composerStartRestartGroup, 0);
            ChaloSpacersKt.w(composerStartRestartGroup, 0);
            n(composerStartRestartGroup, 0);
            SpacerKt.Spacer(i41.a(rowScopeInstance, companion, 1.0f, false, 2, null), composerStartRestartGroup, 0);
            f(ClipKt.clip(SizeKt.fillMaxWidth(SizeKt.m814height3ABfNKs(companion, ChaloTheme.b(composerStartRestartGroup, 0).h), 0.3f), ChaloTheme.d(composerStartRestartGroup, 0).c), composerStartRestartGroup, 0);
            composerStartRestartGroup.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new wl(i, 21));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void k(final StopTripDetailsComponent stopTripDetailsComponent, Composer composer, int i) {
        int i2;
        Composer composerStartRestartGroup = composer.startRestartGroup(4675241);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(stopTripDetailsComponent) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (composerStartRestartGroup.shouldExecute((i2 & 3) != 2, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(4675241, i2, -1, "app.chalo.stoptripdetails.ui.StopTripDetailsScreen (StopTripDetailsScreen.kt:109)");
            }
            final MutableState mutableStateA = SubscribeAsStateKt.a(stopTripDetailsComponent.t0(), composerStartRestartGroup);
            final UnifiedAdSlotSpec unifiedAdSlotSpec = UnifiedAdSlotSpecs.c;
            Set set = UnifiedAdCapability_androidKt.f828a;
            Intrinsics.i(unifiedAdSlotSpec, "<this>");
            boolean zChanged = composerStartRestartGroup.changed(((StopTripDetailsViewState) mutableStateA.getValue()).e.ordinal()) | composerStartRestartGroup.changed(true);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = SnapshotIntStateKt.mutableIntStateOf(0);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            final MutableIntState mutableIntState = (MutableIntState) objRememberedValue;
            ScaffoldKt.m2316ScaffoldTvnljyQ(BackgroundKt.m264backgroundbw27NRU$default(SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null), ChaloTheme.a(composerStartRestartGroup, 0).Y, null, 2, null), ComposableLambdaKt.rememberComposableLambda(-1480436635, true, new d4(mutableStateA, 2), composerStartRestartGroup, 54), null, null, null, 0, 0L, 0L, null, ComposableLambdaKt.rememberComposableLambda(-1393637766, true, new Function3() { // from class: app.chalo.stoptripdetails.ui.a
                /* JADX WARN: Multi-variable type inference failed */
                @Override // kotlin.jvm.functions.Function3
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    PaddingValues innerPadding = (PaddingValues) obj;
                    Composer composer2 = (Composer) obj2;
                    int iIntValue = ((Integer) obj3).intValue();
                    Intrinsics.i(innerPadding, "innerPadding");
                    if ((iIntValue & 6) == 0) {
                        iIntValue |= composer2.changed(innerPadding) ? 4 : 2;
                    }
                    if (composer2.shouldExecute((iIntValue & 19) != 18, iIntValue & 1)) {
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-1393637766, iIntValue, -1, "app.chalo.stoptripdetails.ui.StopTripDetailsScreen.<anonymous> (StopTripDetailsScreen.kt:123)");
                        }
                        Modifier modifierM788paddingqDBjuR0$default = PaddingKt.m788paddingqDBjuR0$default(Modifier.INSTANCE, 0.0f, innerPadding.getTop(), 0.0f, 0.0f, 13, null);
                        MutableState mutableState = mutableStateA;
                        StopTripDetailsViewState stopTripDetailsViewState = (StopTripDetailsViewState) mutableState.getValue();
                        StopTripDetailsComponent stopTripDetailsComponent2 = stopTripDetailsComponent;
                        boolean zChangedInstance = composer2.changedInstance(stopTripDetailsComponent2);
                        Object objRememberedValue2 = composer2.rememberedValue();
                        if (zChangedInstance || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue2 = new StopTripDetailsScreenKt$StopTripDetailsScreen$2$1$1(1, stopTripDetailsComponent2, StopTripDetailsComponent.class, "processIntent", "processIntent(Lapp/chalo/stoptripdetails/ui/StopTripDetailsIntent;)V", 0);
                            composer2.updateRememberedValue(objRememberedValue2);
                        }
                        Function1 function1 = (Function1) ((KFunction) objRememberedValue2);
                        List list = ((StopTripDetailsViewState) mutableState.getValue()).f;
                        float bottom = innerPadding.getBottom();
                        MutableIntState mutableIntState2 = mutableIntState;
                        int intValue = mutableIntState2.getIntValue();
                        boolean zChanged2 = composer2.changed(mutableIntState2);
                        Object objRememberedValue3 = composer2.rememberedValue();
                        if (zChanged2 || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue3 = new vd(mutableIntState2, 9);
                            composer2.updateRememberedValue(objRememberedValue3);
                        }
                        Function1 function2 = (Function1) objRememberedValue3;
                        boolean zChanged3 = composer2.changed(mutableIntState2);
                        Object objRememberedValue4 = composer2.rememberedValue();
                        if (zChanged3 || objRememberedValue4 == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue4 = new v31(mutableIntState2, 1);
                            composer2.updateRememberedValue(objRememberedValue4);
                        }
                        StopTripDetailsScreenKt.g(modifierM788paddingqDBjuR0$default, stopTripDetailsViewState, function1, list, unifiedAdSlotSpec, bottom, intValue, function2, (Function0) objRememberedValue4, composer2, 0);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    } else {
                        composer2.skipToGroupEnd();
                    }
                    return Unit.f17538a;
                }
            }, composerStartRestartGroup, 54), composerStartRestartGroup, 805306416, TypedValues.PositionType.TYPE_CURVE_FIT);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new fb1(stopTripDetailsComponent, i, 12));
        }
    }

    public static final void l(Composer composer, int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(700375756);
        if (composerStartRestartGroup.shouldExecute(i != 0, i & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(700375756, i, -1, "app.chalo.stoptripdetails.ui.StopTripDetailsShimmer (StopTripDetailsScreen.kt:205)");
            }
            Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null);
            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composerStartRestartGroup, 0);
            long currentCompositeKeyHashCode = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
            int i2 = (int) (currentCompositeKeyHashCode ^ (currentCompositeKeyHashCode >>> 32));
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
            Updater.m3923setimpl(composerM3915constructorimpl, modifierMaterializeModifier, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion, composerM3915constructorimpl, Integer.valueOf(i2), composerM3915constructorimpl));
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
            composerStartRestartGroup.startReplaceGroup(-1234102869);
            for (int i3 = 0; i3 < 10; i3++) {
                j(composerStartRestartGroup, 0);
                SpacerKt.Spacer(BackgroundKt.m264backgroundbw27NRU$default(SizeKt.m814height3ABfNKs(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), ChaloTheme.b(composerStartRestartGroup, 0).b), ChaloTheme.a(composerStartRestartGroup, 0).x, null, 2, null), composerStartRestartGroup, 0);
            }
            if (b3.t(composerStartRestartGroup)) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new wl(i, 20));
        }
    }

    public static final void m(final List list, final Function2 function2, float f, final float f2, Composer composer, final int i) {
        int i2;
        Composer composer2;
        final float f3;
        int i3;
        float f4;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1041781356);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(list) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(function2) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= 128;
        }
        if ((i & 3072) == 0) {
            i2 |= composerStartRestartGroup.changed(f2) ? 2048 : 1024;
        }
        if (composerStartRestartGroup.shouldExecute((i2 & 1171) != 1170, i2 & 1)) {
            composerStartRestartGroup.startDefaults();
            if ((i & 1) == 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                i3 = i2 & (-897);
                f4 = ChaloTheme.b(composerStartRestartGroup, 0).f1916a;
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                i3 = i2 & (-897);
                f4 = f;
            }
            composerStartRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1041781356, i3, -1, "app.chalo.stoptripdetails.ui.StopTripDetailsUiContent (StopTripDetailsScreen.kt:225)");
            }
            Modifier modifierFillMaxSize$default = SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null);
            PaddingValues paddingValuesM781PaddingValuesa9UjIt4$default = PaddingKt.m781PaddingValuesa9UjIt4$default(0.0f, 0.0f, 0.0f, f2, 7, null);
            boolean zChangedInstance = composerStartRestartGroup.changedInstance(list) | ((i3 & 112) == 32) | composerStartRestartGroup.changed(f4);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new u3(list, function2, f4, 7);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            composer2 = composerStartRestartGroup;
            LazyDslKt.LazyColumn(modifierFillMaxSize$default, null, paddingValuesM781PaddingValuesa9UjIt4$default, false, null, null, null, false, null, (Function1) objRememberedValue, composer2, 6, TypedValues.PositionType.TYPE_PERCENT_X);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            f3 = f4;
        } else {
            composer2 = composerStartRestartGroup;
            composer2.skipToGroupEnd();
            f3 = f;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: ub1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    StopTripDetailsScreenKt.m(list, function2, f3, f2, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(i | 1));
                    return Unit.f17538a;
                }
            });
        }
    }

    public static final void n(Composer composer, int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(6285946);
        if (composerStartRestartGroup.shouldExecute(i != 0, i & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(6285946, i, -1, "app.chalo.stoptripdetails.ui.TitleAndSubtitleShimmerLayout (StopTripDetailsScreen.kt:558)");
            }
            Modifier.Companion companion = Modifier.INSTANCE;
            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composerStartRestartGroup, 0);
            long currentCompositeKeyHashCode = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
            int i2 = (int) (currentCompositeKeyHashCode ^ (currentCompositeKeyHashCode >>> 32));
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
            Updater.m3923setimpl(composerM3915constructorimpl, modifierMaterializeModifier, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion2, composerM3915constructorimpl, Integer.valueOf(i2), composerM3915constructorimpl));
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
            f(ClipKt.clip(SizeKt.fillMaxWidth(SizeKt.m814height3ABfNKs(companion, Dp.m7278constructorimpl(20)), 0.5f), ChaloTheme.d(composerStartRestartGroup, 0).c), composerStartRestartGroup, 0);
            ChaloSpacersKt.m(composerStartRestartGroup, 0);
            f(ClipKt.clip(SizeKt.fillMaxWidth(SizeKt.m814height3ABfNKs(companion, ChaloTheme.b(composerStartRestartGroup, 0).h), 0.6f), ChaloTheme.d(composerStartRestartGroup, 0).c), composerStartRestartGroup, 0);
            composerStartRestartGroup.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new wl(i, 22));
        }
    }

    public static final void o(StopTripDetailsUiModel stopTripDetailsUiModel, Function0 function0, Composer composer, int i) {
        int i2;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1350661273);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changed(stopTripDetailsUiModel) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(function0) ? 32 : 16;
        }
        int i3 = i2;
        int i4 = 1;
        if (composerStartRestartGroup.shouldExecute((i3 & 19) != 18, i3 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1350661273, i3, -1, "app.chalo.stoptripdetails.ui.TripDetailsCard (StopTripDetailsScreen.kt:332)");
            }
            Modifier.Companion companion = Modifier.INSTANCE;
            Modifier modifierM264backgroundbw27NRU$default = BackgroundKt.m264backgroundbw27NRU$default(AlphaKt.alpha(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), stopTripDetailsUiModel.n ? 1.0f : 0.4f), Color.INSTANCE.m4642getWhite0d7_KjU(), null, 2, null);
            boolean z = (i3 & 112) == 32;
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (z || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new o01(function0, 25);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            Modifier modifierM785paddingVpY3zN4 = PaddingKt.m785paddingVpY3zN4(ClickableKt.m299clickableoSLSa3U$default(modifierM264backgroundbw27NRU$default, false, null, null, null, (Function0) objRememberedValue, 15, null), ChaloTheme.b(composerStartRestartGroup, 0).g, ChaloTheme.b(composerStartRestartGroup, 0).h);
            MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), Alignment.INSTANCE.getCenterVertically(), composerStartRestartGroup, 48);
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
            IconKt.m2070Iconww6aTOc(PainterResourceHelperKt.a(IconType.BUS_NEARBY_CARD_ITEM_ICON, composerStartRestartGroup, 6), "", (Modifier) null, 0L, composerStartRestartGroup, Painter.$stable | 48, 12);
            ChaloSpacersKt.y(composerStartRestartGroup, 0);
            c(stopTripDetailsUiModel, composerStartRestartGroup, i3 & 14);
            String str = stopTripDetailsUiModel.l;
            if (str == null || str.length() == 0) {
                composerStartRestartGroup.startReplaceGroup(-1847483841);
            } else {
                composerStartRestartGroup.startReplaceGroup(-1834470289);
                TextKt.m2623TextNvy7gAk(stopTripDetailsUiModel.l, PaddingKt.m786paddingVpY3zN4$default(companion, 0.0f, ChaloTheme.b(composerStartRestartGroup, 0).d, 1, null), ChaloTheme.a(composerStartRestartGroup, 0).g, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ChaloTypographyKt.l(ChaloTheme.e(composerStartRestartGroup, 0)), composerStartRestartGroup, 0, 0, 131064);
                composerStartRestartGroup = composerStartRestartGroup;
            }
            composerStartRestartGroup.endReplaceGroup();
            composerStartRestartGroup.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            i4 = 1;
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new a21(stopTripDetailsUiModel, function0, i, i4));
        }
    }

    /* JADX WARN: Code duplicated, block: B:37:0x006e  */
    /* JADX WARN: Code duplicated, block: B:39:0x0074  */
    /* JADX WARN: Code duplicated, block: B:40:0x0077  */
    /* JADX WARN: Code duplicated, block: B:44:0x0081  */
    /* JADX WARN: Code duplicated, block: B:45:0x0083  */
    /* JADX WARN: Code duplicated, block: B:48:0x008c  */
    /* JADX WARN: Code duplicated, block: B:54:0x009e A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:55:0x00a0  */
    /* JADX WARN: Code duplicated, block: B:58:0x00aa  */
    /* JADX WARN: Code duplicated, block: B:62:0x00de  */
    /* JADX WARN: Code duplicated, block: B:65:0x00ea  */
    /* JADX WARN: Code duplicated, block: B:66:0x00ee  */
    /* JADX WARN: Code duplicated, block: B:69:0x0109  */
    /* JADX WARN: Code duplicated, block: B:70:0x010b  */
    /* JADX WARN: Code duplicated, block: B:73:0x0110  */
    /* JADX WARN: Code duplicated, block: B:74:0x0112  */
    /* JADX WARN: Code duplicated, block: B:81:0x0125  */
    /* JADX WARN: Code duplicated, block: B:84:0x0135  */
    /* JADX WARN: Code duplicated, block: B:86:0x016c  */
    /* JADX WARN: Code duplicated, block: B:89:0x017c  */
    /* JADX WARN: Code duplicated, block: B:90:0x0180  */
    /* JADX WARN: Code duplicated, block: B:93:0x0189  */
    /* JADX WARN: Code duplicated, block: B:95:? A[RETURN, SYNTHETIC] */
    public static final void p(final StopTripDetailsUiModel content, final Function1 onItemClick, final Modifier modifier, boolean z, final float f, Composer composer, final int i, final int i2) {
        int i3;
        boolean z2;
        boolean z3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Function0<ComposeUiNode> constructor;
        boolean z4;
        int i4;
        boolean z5;
        boolean z6;
        Object objRememberedValue;
        int i5;
        int i6;
        Intrinsics.i(content, "content");
        Intrinsics.i(onItemClick, "onItemClick");
        Composer composerStartRestartGroup = composer.startRestartGroup(-1864122817);
        if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changed(content) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(onItemClick) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= composerStartRestartGroup.changed(modifier) ? 256 : 128;
        }
        int i7 = i2 & 8;
        if (i7 == 0) {
            if ((i & 3072) == 0) {
                z2 = z;
                i3 |= composerStartRestartGroup.changed(z2) ? 2048 : 1024;
            }
            if ((i & 24576) == 0) {
                if (composerStartRestartGroup.changed(f)) {
                    i6 = 16384;
                } else {
                    i6 = 8192;
                }
                i3 |= i6;
            }
            if ((i3 & 9363) != 9362) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (composerStartRestartGroup.shouldExecute(z3, i3 & 1)) {
                composerStartRestartGroup.startDefaults();
                if ((i & 1) == 0 && !composerStartRestartGroup.getDefaultsInvalid()) {
                    composerStartRestartGroup.skipToGroupEnd();
                } else if (i7 != 0) {
                    z2 = true;
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1864122817, i3, -1, "app.chalo.stoptripdetails.ui.TripDetailsCardWithSpace (StopTripDetailsScreen.kt:277)");
                }
                MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composerStartRestartGroup, 0);
                long currentCompositeKeyHashCode = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
                int i8 = (int) (currentCompositeKeyHashCode ^ (currentCompositeKeyHashCode >>> 32));
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
                pk0.v(companion, composerM3915constructorimpl, measurePolicyColumnMeasurePolicy, composerM3915constructorimpl, currentCompositionLocalMap);
                Updater.m3923setimpl(composerM3915constructorimpl, modifierMaterializeModifier, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion, composerM3915constructorimpl, Integer.valueOf(i8), composerM3915constructorimpl));
                ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
                if ((i3 & 112) == 32) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                i4 = i3 & 14;
                if (i4 == 4) {
                    z5 = true;
                } else {
                    z5 = false;
                }
                z6 = z4 | z5;
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (!z6 || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    i5 = 1;
                    objRememberedValue = new y11(onItemClick, content, 1);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                } else {
                    i5 = 1;
                }
                o(content, (Function0) objRememberedValue, composerStartRestartGroup, i4);
                if (z2) {
                    composerStartRestartGroup.startReplaceGroup(-1309149862);
                    SpacerKt.Spacer(SizeKt.m814height3ABfNKs(BackgroundKt.m264backgroundbw27NRU$default(PaddingKt.m786paddingVpY3zN4$default(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, i5, null), f, 0.0f, 2, null), ChaloTheme.a(composerStartRestartGroup, 0).Y, null, 2, null), ChaloTheme.b(composerStartRestartGroup, 0).b), composerStartRestartGroup, 0);
                } else {
                    composerStartRestartGroup.startReplaceGroup(-1319922579);
                }
                composerStartRestartGroup.endReplaceGroup();
                composerStartRestartGroup.endNode();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            } else {
                composerStartRestartGroup.skipToGroupEnd();
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
                final boolean z7 = z2;
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: tb1
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        StopTripDetailsScreenKt.p(content, onItemClick, modifier, z7, f, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                        return Unit.f17538a;
                    }
                });
            }
        }
        i3 |= 3072;
        z2 = z;
        if ((i & 24576) == 0) {
            if (composerStartRestartGroup.changed(f)) {
                i6 = 16384;
            } else {
                i6 = 8192;
            }
            i3 |= i6;
        }
        if ((i3 & 9363) != 9362) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (composerStartRestartGroup.shouldExecute(z3, i3 & 1)) {
            composerStartRestartGroup.startDefaults();
            if ((i & 1) == 0) {
                if (i7 != 0) {
                    z2 = true;
                }
            } else if (i7 != 0) {
                z2 = true;
            }
            composerStartRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1864122817, i3, -1, "app.chalo.stoptripdetails.ui.TripDetailsCardWithSpace (StopTripDetailsScreen.kt:277)");
            }
            MeasurePolicy measurePolicyColumnMeasurePolicy2 = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composerStartRestartGroup, 0);
            long currentCompositeKeyHashCode2 = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
            int i9 = (int) (currentCompositeKeyHashCode2 ^ (currentCompositeKeyHashCode2 >>> 32));
            CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifier);
            ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
            constructor = companion2.getConstructor();
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
            pk0.v(companion2, composerM3915constructorimpl2, measurePolicyColumnMeasurePolicy2, composerM3915constructorimpl2, currentCompositionLocalMap2);
            Updater.m3923setimpl(composerM3915constructorimpl2, modifierMaterializeModifier2, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion2, composerM3915constructorimpl2, Integer.valueOf(i9), composerM3915constructorimpl2));
            ColumnScopeInstance columnScopeInstance2 = ColumnScopeInstance.INSTANCE;
            if ((i3 & 112) == 32) {
                z4 = true;
            } else {
                z4 = false;
            }
            i4 = i3 & 14;
            if (i4 == 4) {
                z5 = true;
            } else {
                z5 = false;
            }
            z6 = z4 | z5;
            objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (z6) {
                i5 = 1;
                objRememberedValue = new y11(onItemClick, content, 1);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            } else {
                i5 = 1;
                objRememberedValue = new y11(onItemClick, content, 1);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            o(content, (Function0) objRememberedValue, composerStartRestartGroup, i4);
            if (z2) {
                composerStartRestartGroup.startReplaceGroup(-1309149862);
                SpacerKt.Spacer(SizeKt.m814height3ABfNKs(BackgroundKt.m264backgroundbw27NRU$default(PaddingKt.m786paddingVpY3zN4$default(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, i5, null), f, 0.0f, 2, null), ChaloTheme.a(composerStartRestartGroup, 0).Y, null, 2, null), ChaloTheme.b(composerStartRestartGroup, 0).b), composerStartRestartGroup, 0);
            } else {
                composerStartRestartGroup.startReplaceGroup(-1319922579);
            }
            composerStartRestartGroup.endReplaceGroup();
            composerStartRestartGroup.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            final boolean z8 = z2;
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: tb1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    StopTripDetailsScreenKt.p(content, onItemClick, modifier, z8, f, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                    return Unit.f17538a;
                }
            });
        }
    }
}
