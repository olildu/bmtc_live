package app.chalo.home.ui.nearby.compose;

import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material3.TextKt;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
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
import app.chalo.compose.ChaloEtaComponentKt;
import app.chalo.compose.components.ChaloRoundedCardKt;
import app.chalo.compose.components.ChaloSpacersKt;
import app.chalo.compose.components.SpecialFeatureTagListComposableKt;
import app.chalo.compose.components.shimmer.ShimmerEffectKt;
import app.chalo.compose.resources.PainterResourceHelperKt;
import app.chalo.compose.resources.StringResourcesHelperKt;
import app.chalo.compose.theme.ChaloTheme;
import app.chalo.compose.theme.ChaloTypographyKt;
import app.chalo.home.nearbytrips.data.model.NearbyStopAndTripsUiModel;
import app.chalo.home.ui.nearby.compose.RegularBusStopNearbyTripsCardKt;
import app.chalo.livetracking.routedetails.data.model.app.ExtensionsKt;
import app.chalo.providers.RouteNamingSchemeType;
import app.chalo.providers.iconassetprovider.IconType;
import app.chalo.providers.stringprovider.StringEnum;
import app.chalo.stoptripdetails.data.model.StopETAModel;
import app.chalo.stoptripdetails.data.model.StopTripDetailsUiModel;
import app.chalo.stoptripdetails.data.model.app.EstimatedTime;
import app.chalo.stoptripdetails.data.model.app.EstimatedTimeType;
import defpackage.a21;
import defpackage.b21;
import defpackage.b3;
import defpackage.c21;
import defpackage.d21;
import defpackage.e21;
import defpackage.ey0;
import defpackage.h01;
import defpackage.hf;
import defpackage.i41;
import defpackage.ls;
import defpackage.nb;
import defpackage.o01;
import defpackage.ob;
import defpackage.pk0;
import defpackage.q11;
import defpackage.qh;
import defpackage.r1;
import defpackage.r11;
import defpackage.y11;
import defpackage.zc;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.internal.ws.WebSocketProtocol;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002¨\u0006\u0003²\u0006\u0012\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00008\nX\u008a\u0084\u0002"}, d2 = {"", "Lapp/chalo/stoptripdetails/data/model/StopTripDetailsUiModel;", "listOfItemsToShow", "home_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class RegularBusStopNearbyTripsCardKt {

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f3588a;
        public static final /* synthetic */ int[] b;

        static {
            int[] iArr = new int[RouteNamingSchemeType.values().length];
            try {
                iArr[RouteNamingSchemeType.VIA.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[RouteNamingSchemeType.DEFAULT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f3588a = iArr;
            int[] iArr2 = new int[EstimatedTimeType.values().length];
            try {
                iArr2[EstimatedTimeType.INVALID.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr2[EstimatedTimeType.NO_MORE_TRIPS.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[EstimatedTimeType.VALID.ordinal()] = 3;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[EstimatedTimeType.AFTER_X.ordinal()] = 4;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr2[EstimatedTimeType.EVERY_X_MIN.ordinal()] = 5;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr2[EstimatedTimeType.VALID_WITH_DISCLAIMER.ordinal()] = 6;
            } catch (NoSuchFieldError unused8) {
            }
            b = iArr2;
        }
    }

    public static final void a(EstimatedTime estimatedTime, Composer composer, int i) {
        int i2;
        Composer composer2;
        AnnotatedString annotatedStringAnnotatedString$default;
        Composer composerStartRestartGroup = composer.startRestartGroup(-111795044);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(estimatedTime) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (composerStartRestartGroup.shouldExecute((i2 & 3) != 2, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-111795044, i2, -1, "app.chalo.home.ui.nearby.compose.GetEstimatedTimeText (RegularBusStopNearbyTripsCard.kt:453)");
            }
            EstimatedTimeType estimatedTimeType = estimatedTime.b;
            String str = estimatedTime.f9492a;
            switch (WhenMappings.b[estimatedTimeType.ordinal()]) {
                case 1:
                    composerStartRestartGroup.startReplaceGroup(-60849746);
                    annotatedStringAnnotatedString$default = AnnotatedStringKt.AnnotatedString$default(str, new SpanStyle(ChaloTheme.a(composerStartRestartGroup, 0).T, ChaloTheme.e(composerStartRestartGroup, 0).getBodySmall().m6771getFontSizeXSAIIZE(), ChaloTheme.e(composerStartRestartGroup, 0).getBodySmall().getFontWeight(), (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (PlatformSpanStyle) null, (DrawStyle) null, 65528, (DefaultConstructorMarker) null), null, 4, null);
                    composerStartRestartGroup.endReplaceGroup();
                    break;
                case 2:
                    composerStartRestartGroup.startReplaceGroup(-60839538);
                    annotatedStringAnnotatedString$default = AnnotatedStringKt.AnnotatedString$default(str, new SpanStyle(ChaloTheme.a(composerStartRestartGroup, 0).T, ChaloTheme.e(composerStartRestartGroup, 0).getBodySmall().m6771getFontSizeXSAIIZE(), ChaloTheme.e(composerStartRestartGroup, 0).getBodySmall().getFontWeight(), (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (PlatformSpanStyle) null, (DrawStyle) null, 65528, (DefaultConstructorMarker) null), null, 4, null);
                    composerStartRestartGroup.endReplaceGroup();
                    break;
                case 3:
                    composerStartRestartGroup.startReplaceGroup(-1885697417);
                    AnnotatedString.Builder builder = new AnnotatedString.Builder(str);
                    builder.addStyle(new SpanStyle(ChaloTheme.a(composerStartRestartGroup, 0).g, ChaloTheme.e(composerStartRestartGroup, 0).getBodyLarge().m6771getFontSizeXSAIIZE(), ChaloTheme.e(composerStartRestartGroup, 0).getBodyLarge().getFontWeight(), (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (PlatformSpanStyle) null, (DrawStyle) null, 65528, (DefaultConstructorMarker) null), 0, str.length() - 3);
                    builder.addStyle(new SpanStyle(ChaloTheme.a(composerStartRestartGroup, 0).g, ChaloTheme.e(composerStartRestartGroup, 0).getBodySmall().m6771getFontSizeXSAIIZE(), FontWeight.INSTANCE.getSemiBold(), (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (PlatformSpanStyle) null, (DrawStyle) null, 65528, (DefaultConstructorMarker) null), str.length() - 3, str.length());
                    annotatedStringAnnotatedString$default = builder.toAnnotatedString();
                    composerStartRestartGroup.endReplaceGroup();
                    break;
                case 4:
                    composerStartRestartGroup.startReplaceGroup(-1884744632);
                    AnnotatedString.Builder builder2 = new AnnotatedString.Builder(str);
                    long j = ChaloTheme.a(composerStartRestartGroup, 0).i;
                    long jM6771getFontSizeXSAIIZE = ChaloTheme.e(composerStartRestartGroup, 0).getBodyMedium().m6771getFontSizeXSAIIZE();
                    FontWeight.Companion companion = FontWeight.INSTANCE;
                    builder2.addStyle(new SpanStyle(j, jM6771getFontSizeXSAIIZE, companion.getSemiBold(), (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (PlatformSpanStyle) null, (DrawStyle) null, 65528, (DefaultConstructorMarker) null), 0, 6);
                    builder2.addStyle(new SpanStyle(ChaloTheme.a(composerStartRestartGroup, 0).g, ChaloTheme.e(composerStartRestartGroup, 0).getBodyLarge().m6771getFontSizeXSAIIZE(), ChaloTheme.e(composerStartRestartGroup, 0).getBodyLarge().getFontWeight(), (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (PlatformSpanStyle) null, (DrawStyle) null, 65528, (DefaultConstructorMarker) null), 6, str.length() - 3);
                    builder2.addStyle(new SpanStyle(ChaloTheme.a(composerStartRestartGroup, 0).i, ChaloTheme.e(composerStartRestartGroup, 0).getBodyMedium().m6771getFontSizeXSAIIZE(), companion.getSemiBold(), (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (PlatformSpanStyle) null, (DrawStyle) null, 65528, (DefaultConstructorMarker) null), str.length() - 3, str.length());
                    annotatedStringAnnotatedString$default = builder2.toAnnotatedString();
                    composerStartRestartGroup.endReplaceGroup();
                    break;
                case 5:
                    composerStartRestartGroup.startReplaceGroup(-1883465944);
                    AnnotatedString.Builder builder3 = new AnnotatedString.Builder(str);
                    long j2 = ChaloTheme.a(composerStartRestartGroup, 0).i;
                    long jM6771getFontSizeXSAIIZE2 = ChaloTheme.e(composerStartRestartGroup, 0).getBodyMedium().m6771getFontSizeXSAIIZE();
                    FontWeight.Companion companion2 = FontWeight.INSTANCE;
                    builder3.addStyle(new SpanStyle(j2, jM6771getFontSizeXSAIIZE2, companion2.getSemiBold(), (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (PlatformSpanStyle) null, (DrawStyle) null, 65528, (DefaultConstructorMarker) null), 0, 6);
                    builder3.addStyle(new SpanStyle(ChaloTheme.a(composerStartRestartGroup, 0).g, ChaloTheme.e(composerStartRestartGroup, 0).getBodyLarge().m6771getFontSizeXSAIIZE(), ChaloTheme.e(composerStartRestartGroup, 0).getBodyLarge().getFontWeight(), (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (PlatformSpanStyle) null, (DrawStyle) null, 65528, (DefaultConstructorMarker) null), 6, str.length() - 4);
                    builder3.addStyle(new SpanStyle(ChaloTheme.a(composerStartRestartGroup, 0).i, ChaloTheme.e(composerStartRestartGroup, 0).getBodyMedium().m6771getFontSizeXSAIIZE(), companion2.getSemiBold(), (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (PlatformSpanStyle) null, (DrawStyle) null, 65528, (DefaultConstructorMarker) null), str.length() - 4, str.length());
                    annotatedStringAnnotatedString$default = builder3.toAnnotatedString();
                    composerStartRestartGroup.endReplaceGroup();
                    break;
                case 6:
                    composerStartRestartGroup.startReplaceGroup(-1882195471);
                    AnnotatedString.Builder builder4 = new AnnotatedString.Builder(str);
                    int length = str.length() - 2;
                    if (6 >= length) {
                        composerStartRestartGroup.startReplaceGroup(-1882015702);
                        builder4.addStyle(new SpanStyle(ChaloTheme.a(composerStartRestartGroup, 0).g, ChaloTheme.e(composerStartRestartGroup, 0).getBodyLarge().m6771getFontSizeXSAIIZE(), ChaloTheme.e(composerStartRestartGroup, 0).getBodyLarge().getFontWeight(), (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (PlatformSpanStyle) null, (DrawStyle) null, 65528, (DefaultConstructorMarker) null), 6, length);
                    } else {
                        composerStartRestartGroup.startReplaceGroup(-1901594682);
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    annotatedStringAnnotatedString$default = builder4.toAnnotatedString();
                    composerStartRestartGroup.endReplaceGroup();
                    break;
                default:
                    throw pk0.p(composerStartRestartGroup, -60847200);
            }
            composer2 = composerStartRestartGroup;
            TextKt.m2624TextZ58ophY(annotatedStringAnnotatedString$default, PaddingKt.m786paddingVpY3zN4$default(Modifier.INSTANCE, ChaloTheme.b(composerStartRestartGroup, 0).f, 0.0f, 2, null), ChaloTheme.a(composerStartRestartGroup, 0).f, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, ChaloTheme.e(composerStartRestartGroup, 0).getBodyMedium(), composer2, 0, 0, 262136);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer2 = composerStartRestartGroup;
            composer2.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new d21(estimatedTime, i, 0));
        }
    }

    public static final void b(Modifier modifier, StopTripDetailsUiModel stopTripDetailsUiModel, Composer composer, int i) {
        Modifier modifier2;
        Composer composerStartRestartGroup = composer.startRestartGroup(428632535);
        int i2 = i | 6;
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changed(stopTripDetailsUiModel) ? 32 : 16;
        }
        if (composerStartRestartGroup.shouldExecute((i2 & 19) != 18, i2 & 1)) {
            modifier2 = Modifier.INSTANCE;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(428632535, i2, -1, "app.chalo.home.ui.nearby.compose.RegularBusEstimatedTimeOrLiveEtaWithSeatOccupancyText (RegularBusStopNearbyTripsCard.kt:391)");
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
                composerStartRestartGroup.startReplaceGroup(-2077482949);
                ChaloEtaComponentKt.a(((StopETAModel.LiveEta) stopETAModel).f9465a, null, null, composerStartRestartGroup, 0, 6);
                IconType iconTypeB = ExtensionsKt.b(stopTripDetailsUiModel.h);
                if (iconTypeB == null) {
                    composerStartRestartGroup.startReplaceGroup(-2077283496);
                } else {
                    composerStartRestartGroup.startReplaceGroup(-2077283495);
                    ImageKt.Image(PainterResourceHelperKt.a(iconTypeB, composerStartRestartGroup, 0), (String) null, PaddingKt.m788paddingqDBjuR0$default(modifier2, ChaloTheme.b(composerStartRestartGroup, 0).d, 0.0f, 0.0f, 0.0f, 14, null), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composerStartRestartGroup, Painter.$stable | 48, 120);
                }
                composerStartRestartGroup.endReplaceGroup();
                composerStartRestartGroup.endReplaceGroup();
            } else if (Intrinsics.d(stopETAModel, StopETAModel.Unknown.f9467a)) {
                composerStartRestartGroup.startReplaceGroup(-2076964381);
                o(ClipKt.clip(SizeKt.m814height3ABfNKs(SizeKt.m833width3ABfNKs(modifier2, ChaloTheme.b(composerStartRestartGroup, 0).n), ChaloTheme.b(composerStartRestartGroup, 0).h), RoundedCornerShapeKt.getCircleShape()), composerStartRestartGroup, 0);
                composerStartRestartGroup.endReplaceGroup();
            } else if (stopETAModel instanceof StopETAModel.AfterXTime) {
                composerStartRestartGroup.startReplaceGroup(-2076667618);
                a(((StopETAModel.AfterXTime) stopETAModel).f9461a, composerStartRestartGroup, 0);
                composerStartRestartGroup.endReplaceGroup();
            } else if (stopETAModel instanceof StopETAModel.FixedTime) {
                composerStartRestartGroup.startReplaceGroup(-2076520802);
                a(((StopETAModel.FixedTime) stopETAModel).f9462a, composerStartRestartGroup, 0);
                composerStartRestartGroup.endReplaceGroup();
            } else if (stopETAModel instanceof StopETAModel.FrequencyTrips) {
                composerStartRestartGroup.startReplaceGroup(-2076369026);
                a(((StopETAModel.FrequencyTrips) stopETAModel).f9463a, composerStartRestartGroup, 0);
                composerStartRestartGroup.endReplaceGroup();
            } else if (stopETAModel instanceof StopETAModel.InvalidTrips) {
                composerStartRestartGroup.startReplaceGroup(-2076219234);
                a(((StopETAModel.InvalidTrips) stopETAModel).f9464a, composerStartRestartGroup, 0);
                composerStartRestartGroup.endReplaceGroup();
            } else if (stopETAModel instanceof StopETAModel.NoMoreTrips) {
                composerStartRestartGroup.startReplaceGroup(-2076070434);
                a(((StopETAModel.NoMoreTrips) stopETAModel).f9466a, composerStartRestartGroup, 0);
                composerStartRestartGroup.endReplaceGroup();
            } else {
                if (!(stopETAModel instanceof StopETAModel.ValidTripsWithDisclaimer)) {
                    throw pk0.p(composerStartRestartGroup, -2145226652);
                }
                composerStartRestartGroup.startReplaceGroup(-2075903561);
                ImageKt.Image(PainterResourceHelperKt.a(IconType.ALERT_ICON_ORANGE, composerStartRestartGroup, 6), "", (Modifier) null, (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composerStartRestartGroup, Painter.$stable | 48, 124);
                a(((StopETAModel.ValidTripsWithDisclaimer) stopETAModel).f9468a, composerStartRestartGroup, 0);
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
            scopeUpdateScopeEndRestartGroup.updateScope(new c21(modifier2, stopTripDetailsUiModel, i, 0));
        }
    }

    public static final void c(int i, Composer composer, Modifier modifier, List list, Function1 function1) {
        Function1 function2;
        Composer composerStartRestartGroup = composer.startRestartGroup(452113374);
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
                ComposerKt.traceEventStart(452113374, i2, -1, "app.chalo.home.ui.nearby.compose.RegularBusNearbyTripsCardListColumn (RegularBusStopNearbyTripsCard.kt:131)");
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
            composerStartRestartGroup.startReplaceGroup(1343219919);
            int i4 = 0;
            for (Object obj : list) {
                int i5 = i4 + 1;
                if (i4 < 0) {
                    CollectionsKt.z0();
                    throw null;
                }
                n((StopTripDetailsUiModel) obj, function2, SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), i4 != CollectionsKt.K(list), ChaloTheme.b(composerStartRestartGroup, 0).h, composerStartRestartGroup, (i2 & 112) | 384);
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
            scopeUpdateScopeEndRestartGroup.updateScope(new qh(list, function1, modifier, i, 6));
        }
    }

    public static final void d(int i, Composer composer, Modifier modifier, String str) {
        int i2;
        Composer composer2;
        Modifier modifier2;
        Composer composerStartRestartGroup = composer.startRestartGroup(156755810);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changed(str) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        int i3 = i2 | 48;
        if (composerStartRestartGroup.shouldExecute((i3 & 19) != 18, i3 & 1)) {
            Modifier.Companion companion = Modifier.INSTANCE;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(156755810, i3, -1, "app.chalo.home.ui.nearby.compose.RegularBusNearbyTripsDistanceComponent (RegularBusStopNearbyTripsCard.kt:203)");
            }
            Modifier modifierM787paddingqDBjuR0 = PaddingKt.m787paddingqDBjuR0(BackgroundKt.m263backgroundbw27NRU(companion, ChaloTheme.a(composerStartRestartGroup, 0).m0, ChaloTheme.d(composerStartRestartGroup, 0).f), ChaloTheme.b(composerStartRestartGroup, 0).f, ChaloTheme.b(composerStartRestartGroup, 0).f, ChaloTheme.b(composerStartRestartGroup, 0).g, ChaloTheme.b(composerStartRestartGroup, 0).f);
            MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), Alignment.INSTANCE.getCenterVertically(), composerStartRestartGroup, 48);
            long currentCompositeKeyHashCode = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
            int i4 = (int) (currentCompositeKeyHashCode ^ (currentCompositeKeyHashCode >>> 32));
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
            Updater.m3923setimpl(composerM3915constructorimpl, modifierMaterializeModifier, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion2, composerM3915constructorimpl, Integer.valueOf(i4), composerM3915constructorimpl));
            RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
            ImageKt.Image(PainterResourceHelperKt.a(IconType.WALK_NEARBYCARD_BLACK, composerStartRestartGroup, 6), (String) null, (Modifier) null, (Alignment) null, (ContentScale) null, 0.0f, ColorFilter.Companion.m4646tintxETnrds$default(ColorFilter.INSTANCE, ChaloTheme.a(composerStartRestartGroup, 0).v0, 0, 2, null), composerStartRestartGroup, Painter.$stable | 48, 60);
            ChaloSpacersKt.A(composerStartRestartGroup, 0);
            composer2 = composerStartRestartGroup;
            modifier2 = companion;
            TextKt.m2623TextNvy7gAk(StringResourcesHelperKt.c(StringEnum.AWAY, new Object[]{str}, composerStartRestartGroup, 6), null, ChaloTheme.a(composerStartRestartGroup, 0).v0, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ChaloTheme.e(composerStartRestartGroup, 0).getBodySmall(), composer2, 0, 0, 131066);
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
            scopeUpdateScopeEndRestartGroup.updateScope(new nb(str, modifier2, i, 8));
        }
    }

    public static final void e(int i, Composer composer, Modifier modifier, String str, String str2) {
        String str3;
        int i2;
        Composer composerStartRestartGroup = composer.startRestartGroup(1485863292);
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
                ComposerKt.traceEventStart(1485863292, i3, -1, "app.chalo.home.ui.nearby.compose.RegularBusNearbyTripsStopAndDistanceComponent (RegularBusStopNearbyTripsCard.kt:171)");
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
            ImageKt.Image(PainterResourceHelperKt.a(IconType.IC_BUS_STOP, composerStartRestartGroup, 6), (String) null, (Modifier) null, (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composerStartRestartGroup, Painter.$stable | 48, 124);
            ChaloSpacersKt.w(composerStartRestartGroup, 0);
            TextKt.m2623TextNvy7gAk(str3, i41.a(rowScopeInstance, Modifier.INSTANCE, 1.0f, false, 2, null), ChaloTheme.a(composerStartRestartGroup, 0).e, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 1, 0, null, ChaloTypographyKt.a(ChaloTheme.e(composerStartRestartGroup, 0).getBodyMedium()), composerStartRestartGroup, i3 & 14, 24576, 114680);
            composerStartRestartGroup = composerStartRestartGroup;
            ChaloSpacersKt.w(composerStartRestartGroup, 0);
            d((i3 >> 3) & 14, composerStartRestartGroup, null, str2);
            composerStartRestartGroup.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new hf(str, str2, modifier, i, 4));
        }
    }

    public static final void f(String str, String str2, Function0 function0, Composer composer, int i) {
        int i2;
        Composer composerStartRestartGroup = composer.startRestartGroup(2086300983);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changed(str) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changed(str2) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(function0) ? 256 : 128;
        }
        if (composerStartRestartGroup.shouldExecute((i2 & 147) != 146, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(2086300983, i2, -1, "app.chalo.home.ui.nearby.compose.RegularBusNearbyTripsStopDetailsComponent (RegularBusStopNearbyTripsCard.kt:153)");
            }
            e(i2 & WebSocketProtocol.PAYLOAD_SHORT, composerStartRestartGroup, PaddingKt.m785paddingVpY3zN4(BackgroundKt.m264backgroundbw27NRU$default(SizeKt.fillMaxWidth$default(ClickableKt.m299clickableoSLSa3U$default(Modifier.INSTANCE, false, null, null, null, function0, 15, null), 0.0f, 1, null), ChaloTheme.a(composerStartRestartGroup, 0).r0, null, 2, null), ChaloTheme.b(composerStartRestartGroup, 0).f, ChaloTheme.b(composerStartRestartGroup, 0).h), str, str2);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new h01(i, 7, str, str2, function0));
        }
    }

    public static final void g(StopTripDetailsUiModel stopTripDetailsUiModel, Composer composer, int i) {
        int i2;
        int i3;
        String strC;
        String strC2;
        Composer composerStartRestartGroup = composer.startRestartGroup(454279773);
        if ((i & 6) == 0) {
            i2 = i | (composerStartRestartGroup.changed(stopTripDetailsUiModel) ? 4 : 2);
        } else {
            i2 = i;
        }
        if (composerStartRestartGroup.shouldExecute((i2 & 3) != 2, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(454279773, i2, -1, "app.chalo.home.ui.nearby.compose.RegularBusRouteDetailsWithEtas (RegularBusStopNearbyTripsCard.kt:293)");
            }
            Modifier.Companion companion = Modifier.INSTANCE;
            Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null);
            Alignment.Companion companion2 = Alignment.INSTANCE;
            Alignment.Vertical top = companion2.getTop();
            Arrangement arrangement = Arrangement.INSTANCE;
            MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(arrangement.getStart(), top, composerStartRestartGroup, 48);
            long currentCompositeKeyHashCode = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
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
            pk0.v(companion3, composerM3915constructorimpl, measurePolicyRowMeasurePolicy, composerM3915constructorimpl, currentCompositionLocalMap);
            Updater.m3923setimpl(composerM3915constructorimpl, modifierMaterializeModifier, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion3, composerM3915constructorimpl, Integer.valueOf(i4), composerM3915constructorimpl));
            RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
            Modifier modifierM835widthInVpY3zN4$default = SizeKt.m835widthInVpY3zN4$default(companion, 0.0f, ChaloTheme.b(composerStartRestartGroup, 0).J, 1, null);
            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(arrangement.getTop(), companion2.getStart(), composerStartRestartGroup, 0);
            long currentCompositeKeyHashCode2 = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
            int i5 = (int) (currentCompositeKeyHashCode2 ^ (currentCompositeKeyHashCode2 >>> 32));
            CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierM835widthInVpY3zN4$default);
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
            pk0.v(companion3, composerM3915constructorimpl2, measurePolicyColumnMeasurePolicy, composerM3915constructorimpl2, currentCompositionLocalMap2);
            Updater.m3923setimpl(composerM3915constructorimpl2, modifierMaterializeModifier2, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion3, composerM3915constructorimpl2, Integer.valueOf(i5), composerM3915constructorimpl2));
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
            int i6 = i2 & 14;
            h(stopTripDetailsUiModel, composerStartRestartGroup, i6);
            RouteNamingSchemeType routeNamingSchemeType = stopTripDetailsUiModel.u;
            String str = stopTripDetailsUiModel.g;
            int[] iArr = WhenMappings.f3588a;
            int i7 = iArr[routeNamingSchemeType.ordinal()];
            if (i7 == 1) {
                composerStartRestartGroup.startReplaceGroup(159375475);
                strC = StringResourcesHelperKt.c(StringEnum.TO_, new Object[]{str}, composerStartRestartGroup, 6);
                composerStartRestartGroup.endReplaceGroup();
            } else {
                if (i7 != 2) {
                    throw pk0.p(composerStartRestartGroup, 159372622);
                }
                composerStartRestartGroup.startReplaceGroup(159381536);
                composerStartRestartGroup.endReplaceGroup();
                strC = stopTripDetailsUiModel.d;
            }
            int i8 = iArr[stopTripDetailsUiModel.u.ordinal()];
            if (i8 == 1) {
                composerStartRestartGroup.startReplaceGroup(646039068);
                String str2 = stopTripDetailsUiModel.t;
                if (str2 == null) {
                    composerStartRestartGroup.startReplaceGroup(646039067);
                    composerStartRestartGroup.endReplaceGroup();
                    strC2 = null;
                } else {
                    composerStartRestartGroup.startReplaceGroup(646039068);
                    strC2 = StringResourcesHelperKt.c(StringEnum.VIA_, new Object[]{str2}, composerStartRestartGroup, 6);
                    composerStartRestartGroup.endReplaceGroup();
                }
                composerStartRestartGroup.endReplaceGroup();
            } else {
                if (i8 != 2) {
                    throw pk0.p(composerStartRestartGroup, 159383802);
                }
                composerStartRestartGroup.startReplaceGroup(159391507);
                strC2 = StringResourcesHelperKt.c(StringEnum.TO_, new Object[]{str}, composerStartRestartGroup, 6);
                composerStartRestartGroup.endReplaceGroup();
            }
            String str3 = strC2;
            TextOverflow.Companion companion4 = TextOverflow.INSTANCE;
            int i9 = i2;
            i3 = 0;
            TextKt.m2623TextNvy7gAk(strC, null, ChaloTheme.a(composerStartRestartGroup, 0).t0, null, 0L, null, null, null, 0L, null, null, 0L, companion4.m7226getEllipsisgIe3tQ8(), false, 2, 0, null, ChaloTypographyKt.a(ChaloTheme.e(composerStartRestartGroup, 0).getBodyLarge()), composerStartRestartGroup, 0, 24960, 110586);
            composerStartRestartGroup = composerStartRestartGroup;
            ChaloSpacersKt.t(composerStartRestartGroup, 0);
            if (str3 != null) {
                composerStartRestartGroup.startReplaceGroup(646676955);
                TextKt.m2623TextNvy7gAk(str3, null, ChaloTheme.a(composerStartRestartGroup, 0).v0, null, 0L, null, null, null, 0L, null, null, 0L, companion4.m7226getEllipsisgIe3tQ8(), false, 2, 0, null, ChaloTheme.e(composerStartRestartGroup, 0).getBodyMedium(), composerStartRestartGroup, 0, 24960, 110586);
                composerStartRestartGroup = composerStartRestartGroup;
            } else {
                composerStartRestartGroup.startReplaceGroup(635721803);
            }
            composerStartRestartGroup.endReplaceGroup();
            composerStartRestartGroup.endNode();
            SpacerKt.Spacer(i41.a(rowScopeInstance, companion, 1.0f, false, 2, null), composerStartRestartGroup, 0);
            MeasurePolicy measurePolicyColumnMeasurePolicy2 = ColumnKt.columnMeasurePolicy(arrangement.getTop(), companion2.getEnd(), composerStartRestartGroup, 54);
            long currentCompositeKeyHashCode3 = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
            int i10 = (int) (currentCompositeKeyHashCode3 ^ (currentCompositeKeyHashCode3 >>> 32));
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
            pk0.v(companion3, composerM3915constructorimpl3, measurePolicyColumnMeasurePolicy2, composerM3915constructorimpl3, currentCompositionLocalMap3);
            Updater.m3923setimpl(composerM3915constructorimpl3, modifierMaterializeModifier3, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion3, composerM3915constructorimpl3, Integer.valueOf(i10), composerM3915constructorimpl3));
            i(stopTripDetailsUiModel, composerStartRestartGroup, i6);
            b(null, stopTripDetailsUiModel, composerStartRestartGroup, (i9 << 3) & 112);
            String str4 = stopTripDetailsUiModel.l;
            if (str4 == null || str4.length() == 0) {
                composerStartRestartGroup.startReplaceGroup(-848182124);
            } else {
                composerStartRestartGroup.startReplaceGroup(-836479345);
                Composer composer2 = composerStartRestartGroup;
                TextKt.m2623TextNvy7gAk(stopTripDetailsUiModel.l, PaddingKt.m786paddingVpY3zN4$default(companion, 0.0f, ChaloTheme.b(composerStartRestartGroup, 0).d, 1, null), ChaloTheme.a(composerStartRestartGroup, 0).v0, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ChaloTheme.e(composerStartRestartGroup, 0).getBodySmall(), composer2, 0, 0, 131064);
                composerStartRestartGroup = composer2;
            }
            composerStartRestartGroup.endReplaceGroup();
            if (r1.k(composerStartRestartGroup)) {
                ComposerKt.traceEventEnd();
            }
        } else {
            i3 = 0;
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new b21(stopTripDetailsUiModel, i, i3));
        }
    }

    public static final void h(StopTripDetailsUiModel stopTripDetailsUiModel, Composer composer, int i) {
        int i2;
        Composer composerStartRestartGroup = composer.startRestartGroup(-361211806);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changed(stopTripDetailsUiModel) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (composerStartRestartGroup.shouldExecute((i2 & 3) != 2, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-361211806, i2, -1, "app.chalo.home.ui.nearby.compose.RegularBusRouteSpecialFeatureTags (RegularBusStopNearbyTripsCard.kt:364)");
            }
            Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null);
            MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), Alignment.INSTANCE.getTop(), composerStartRestartGroup, 0);
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
            pk0.v(companion, composerM3915constructorimpl, measurePolicyRowMeasurePolicy, composerM3915constructorimpl, currentCompositionLocalMap);
            Updater.m3923setimpl(composerM3915constructorimpl, modifierMaterializeModifier, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion, composerM3915constructorimpl, Integer.valueOf(i3), composerM3915constructorimpl));
            RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
            if (stopTripDetailsUiModel.j.isEmpty()) {
                composerStartRestartGroup.startReplaceGroup(-1989089596);
            } else {
                composerStartRestartGroup.startReplaceGroup(-1976853493);
                SpecialFeatureTagListComposableKt.a(0, 2, composerStartRestartGroup, null, stopTripDetailsUiModel.j);
                ChaloSpacersKt.s(null, 0, composerStartRestartGroup, 1);
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
            scopeUpdateScopeEndRestartGroup.updateScope(new b21(stopTripDetailsUiModel, i, 2));
        }
    }

    public static final void i(StopTripDetailsUiModel stopTripDetailsUiModel, Composer composer, int i) {
        int i2;
        Modifier modifier;
        int i3;
        int i4;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1906672527);
        if ((i & 6) == 0) {
            i2 = i | (composerStartRestartGroup.changed(stopTripDetailsUiModel) ? 4 : 2);
        } else {
            i2 = i;
        }
        if (composerStartRestartGroup.shouldExecute((i2 & 3) != 2, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1906672527, i2, -1, "app.chalo.home.ui.nearby.compose.RegularBusRouteVehicleNumber (RegularBusStopNearbyTripsCard.kt:374)");
            }
            String str = stopTripDetailsUiModel.m;
            if (str == null || str.length() == 0) {
                modifier = null;
                i3 = 1;
                i4 = 0;
                composerStartRestartGroup.startReplaceGroup(-751175151);
            } else {
                composerStartRestartGroup.startReplaceGroup(-738607751);
                modifier = null;
                i3 = 1;
                i4 = 0;
                TextKt.m2623TextNvy7gAk(stopTripDetailsUiModel.m, PaddingKt.m786paddingVpY3zN4$default(Modifier.INSTANCE, ChaloTheme.b(composerStartRestartGroup, 0).c, 0.0f, 2, null), ChaloTheme.a(composerStartRestartGroup, 0).v0, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ChaloTheme.e(composerStartRestartGroup, 0).getBodySmall(), composerStartRestartGroup, 0, 0, 131064);
                composerStartRestartGroup = composerStartRestartGroup;
            }
            composerStartRestartGroup.endReplaceGroup();
            ChaloSpacersKt.s(modifier, i4, composerStartRestartGroup, i3);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new b21(stopTripDetailsUiModel, i, 1));
        }
    }

    public static final void j(NearbyStopAndTripsUiModel nearbyStopAndTripsUiModel, Function1 onStopClick, Function2 onRouteClick, Modifier modifier, Composer composer, int i) {
        int i2;
        Modifier modifier2;
        Intrinsics.i(onStopClick, "onStopClick");
        Intrinsics.i(onRouteClick, "onRouteClick");
        Composer composerStartRestartGroup = composer.startRestartGroup(26190997);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changed(nearbyStopAndTripsUiModel) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(onStopClick) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(onRouteClick) ? 256 : 128;
        }
        int i3 = i2 | 3072;
        if (composerStartRestartGroup.shouldExecute((i3 & 1171) != 1170, i3 & 1)) {
            Modifier.Companion companion = Modifier.INSTANCE;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(26190997, i3, -1, "app.chalo.home.ui.nearby.compose.RegularBusStopNearbyTripsCard (RegularBusStopNearbyTripsCard.kt:64)");
            }
            modifier2 = companion;
            ChaloRoundedCardKt.b(modifier2, ChaloTheme.d(composerStartRestartGroup, 0).c, ChaloTheme.c(composerStartRestartGroup, 0).c, 0.0f, ComposableLambdaKt.rememberComposableLambda(-1584273258, true, new ob(22, nearbyStopAndTripsUiModel, onStopClick, onRouteClick), composerStartRestartGroup, 54), composerStartRestartGroup, ((i3 >> 9) & 14) | 24576, 8);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
            modifier2 = modifier;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new ey0(i, 5, nearbyStopAndTripsUiModel, onStopClick, onRouteClick, modifier2));
        }
    }

    public static final void k(NearbyStopAndTripsUiModel nearbyStopAndTripsUiModel, Function0 function0, Function1 function1, Modifier modifier, Composer composer, int i) {
        int i2;
        Composer composerStartRestartGroup = composer.startRestartGroup(-527082416);
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
                ComposerKt.traceEventStart(-527082416, i2, -1, "app.chalo.home.ui.nearby.compose.RegularBusStopNearbyTripsCardComponent (RegularBusStopNearbyTripsCard.kt:102)");
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
            f(nearbyStopAndTripsUiModel.c, nearbyStopAndTripsUiModel.g, function0, composerStartRestartGroup, (i2 << 3) & 896);
            boolean zChanged = composerStartRestartGroup.changed(nearbyStopAndTripsUiModel.h);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = SnapshotStateKt.derivedStateOf(new q11(nearbyStopAndTripsUiModel, 1));
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            c(((i2 >> 3) & 112) | 384, composerStartRestartGroup, SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), (List) ((State) objRememberedValue).getValue(), function1);
            composerStartRestartGroup.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new e21(nearbyStopAndTripsUiModel, function0, function1, modifier, i, 0));
        }
    }

    public static final void l(NearbyStopAndTripsUiModel nearbyStopAndTripsUiModel, Function1 function1, Function2 function2, Composer composer, int i) {
        int i2;
        Composer composerStartRestartGroup = composer.startRestartGroup(1883417579);
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
        if (composerStartRestartGroup.shouldExecute((i2 & 147) != 146, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1883417579, i2, -1, "app.chalo.home.ui.nearby.compose.RegularBusStopNearbyTripsCardContent (RegularBusStopNearbyTripsCard.kt:83)");
            }
            int i3 = i2 & 14;
            boolean z = ((i2 & 112) == 32) | (i3 == 4);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (z || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new r11(function1, nearbyStopAndTripsUiModel, 2);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            Function0 function0 = (Function0) objRememberedValue;
            boolean z2 = (i2 & 896) == 256;
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (z2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue2 = new ls(3, function2);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            k(nearbyStopAndTripsUiModel, function0, (Function1) objRememberedValue2, SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), composerStartRestartGroup, i3 | 3072);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new h01(i, 6, nearbyStopAndTripsUiModel, function1, function2));
        }
    }

    public static final void m(StopTripDetailsUiModel stopTripDetailsUiModel, Function0 function0, Composer composer, int i) {
        int i2;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1649155264);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changed(stopTripDetailsUiModel) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(function0) ? 32 : 16;
        }
        int i3 = i2;
        if (composerStartRestartGroup.shouldExecute((i3 & 19) != 18, i3 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1649155264, i3, -1, "app.chalo.home.ui.nearby.compose.RegularBusTripDetailsCard (RegularBusStopNearbyTripsCard.kt:267)");
            }
            Modifier.Companion companion = Modifier.INSTANCE;
            Modifier modifierM264backgroundbw27NRU$default = BackgroundKt.m264backgroundbw27NRU$default(AlphaKt.alpha(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), stopTripDetailsUiModel.n ? 1.0f : 0.4f), Color.INSTANCE.m4642getWhite0d7_KjU(), null, 2, null);
            boolean z = (i3 & 112) == 32;
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (z || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new o01(function0, 1);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            Modifier modifierM785paddingVpY3zN4 = PaddingKt.m785paddingVpY3zN4(ClickableKt.m299clickableoSLSa3U$default(modifierM264backgroundbw27NRU$default, false, null, null, null, (Function0) objRememberedValue, 15, null), ChaloTheme.b(composerStartRestartGroup, 0).h, ChaloTheme.b(composerStartRestartGroup, 0).h);
            MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), Alignment.INSTANCE.getCenterVertically(), composerStartRestartGroup, 48);
            long currentCompositeKeyHashCode = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
            int i4 = (int) ((currentCompositeKeyHashCode >>> 32) ^ currentCompositeKeyHashCode);
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
            Updater.m3923setimpl(composerM3915constructorimpl, modifierMaterializeModifier, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion2, composerM3915constructorimpl, Integer.valueOf(i4), composerM3915constructorimpl));
            RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
            ImageKt.Image(PainterResourceHelperKt.a(IconType.IC_BUS_TINTED, composerStartRestartGroup, 6), (String) null, SizeKt.m828size3ABfNKs(companion, ChaloTheme.b(composerStartRestartGroup, 0).C), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composerStartRestartGroup, Painter.$stable | 48, 120);
            ChaloSpacersKt.C(composerStartRestartGroup, 0);
            g(stopTripDetailsUiModel, composerStartRestartGroup, i3 & 14);
            composerStartRestartGroup.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new a21(stopTripDetailsUiModel, function0, i, 0));
        }
    }

    public static final void n(final StopTripDetailsUiModel stopTripDetailsUiModel, final Function1 function1, final Modifier modifier, final boolean z, final float f, Composer composer, final int i) {
        int i2;
        Composer composerStartRestartGroup = composer.startRestartGroup(302638288);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changed(stopTripDetailsUiModel) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(function1) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= composerStartRestartGroup.changed(modifier) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= composerStartRestartGroup.changed(z) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= composerStartRestartGroup.changed(f) ? 16384 : 8192;
        }
        if (composerStartRestartGroup.shouldExecute((i2 & 9363) != 9362, i2 & 1)) {
            composerStartRestartGroup.startDefaults();
            if ((i & 1) != 0 && !composerStartRestartGroup.getDefaultsInvalid()) {
                composerStartRestartGroup.skipToGroupEnd();
            }
            composerStartRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(302638288, i2, -1, "app.chalo.home.ui.nearby.compose.RegularBusTripDetailsCardWithSpace (RegularBusStopNearbyTripsCard.kt:242)");
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
            int i4 = i2 & 14;
            boolean z2 = (i4 == 4) | ((i2 & 112) == 32);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (z2 || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new y11(function1, stopTripDetailsUiModel, 0);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            m(stopTripDetailsUiModel, (Function0) objRememberedValue, composerStartRestartGroup, i4);
            if (z) {
                composerStartRestartGroup.startReplaceGroup(-1182020503);
                SpacerKt.Spacer(SizeKt.m814height3ABfNKs(BackgroundKt.m264backgroundbw27NRU$default(PaddingKt.m786paddingVpY3zN4$default(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), f, 0.0f, 2, null), ChaloTheme.a(composerStartRestartGroup, 0).Y, null, 2, null), ChaloTheme.b(composerStartRestartGroup, 0).b), composerStartRestartGroup, 0);
            } else {
                composerStartRestartGroup.startReplaceGroup(-1190311236);
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
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: z11
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    RegularBusStopNearbyTripsCardKt.n(stopTripDetailsUiModel, function1, modifier, z, f, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(i | 1));
                    return Unit.f17538a;
                }
            });
        }
    }

    public static final void o(Modifier modifier, Composer composer, int i) {
        int i2;
        Composer composerStartRestartGroup = composer.startRestartGroup(1743607348);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changed(modifier) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (composerStartRestartGroup.shouldExecute((i2 & 3) != 2, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1743607348, i2, -1, "app.chalo.home.ui.nearby.compose.ShimmerBox (RegularBusStopNearbyTripsCard.kt:597)");
            }
            BoxKt.Box(ShimmerEffectKt.b(modifier, Color.m4595boximpl(ChaloTheme.a(composerStartRestartGroup, 0).r0), Color.m4595boximpl(ChaloTheme.a(composerStartRestartGroup, 0).q), 4), composerStartRestartGroup, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new zc(modifier, i, 22));
        }
    }
}
