package app.chalo.ncmc.ui.landing.compose;

import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.ScrollKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.AspectRatioKt;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material3.TextKt;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.layout.ContentScale;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.style.TextAlign;
import app.chalo.compose.components.ChaloRoundedCardKt;
import app.chalo.compose.components.ChaloSpacersKt;
import app.chalo.compose.components.PlotlineComposeWidgetKt;
import app.chalo.compose.resources.PainterResourceHelperKt;
import app.chalo.compose.resources.StringResourcesHelperKt;
import app.chalo.compose.theme.ChaloTheme;
import app.chalo.compose.theme.ChaloTypographyKt;
import app.chalo.providers.iconassetprovider.IconType;
import app.chalo.providers.stringprovider.StringEnum;
import coil3.compose.SingletonSubcomposeAsyncImageKt;
import defpackage.c0;
import defpackage.ki;
import defpackage.nb;
import defpackage.pk0;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.bouncycastle.asn1.cmc.BodyPartID;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"home_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class ChaloCardComposablesKt {
    public static final void a(String title, String subtitle, String sampleImageUrl, Function0 useCodeClicked, Composer composer, int i) {
        int i2;
        Intrinsics.i(title, "title");
        Intrinsics.i(subtitle, "subtitle");
        Intrinsics.i(sampleImageUrl, "sampleImageUrl");
        Intrinsics.i(useCodeClicked, "useCodeClicked");
        Composer composerStartRestartGroup = composer.startRestartGroup(2054033831);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changed(title) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changed(subtitle) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= composerStartRestartGroup.changed(sampleImageUrl) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(useCodeClicked) ? 2048 : 1024;
        }
        if (composerStartRestartGroup.shouldExecute((i2 & 1171) != 1170, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(2054033831, i2, -1, "app.chalo.ncmc.ui.landing.compose.ChaloCardLinkTutorialSampleUI (ChaloCardComposables.kt:125)");
            }
            ChaloRoundedCardKt.b(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), null, 0.0f, 0.0f, ComposableLambdaKt.rememberComposableLambda(-1464297048, true, new c0(title, subtitle, sampleImageUrl, useCodeClicked, 5), composerStartRestartGroup, 54), composerStartRestartGroup, 24582, 14);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new ki(title, subtitle, sampleImageUrl, useCodeClicked, i, 1));
        }
    }

    public static final void b(String sampleTitle, String sampleSubtitle, String sampleReceiptUrl, Function0 useCodeClicked, Composer composer, int i) {
        int i2;
        Composer composer2;
        Intrinsics.i(sampleTitle, "sampleTitle");
        Intrinsics.i(sampleSubtitle, "sampleSubtitle");
        Intrinsics.i(sampleReceiptUrl, "sampleReceiptUrl");
        Intrinsics.i(useCodeClicked, "useCodeClicked");
        Composer composerStartRestartGroup = composer.startRestartGroup(213178733);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changed(sampleTitle) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changed(sampleSubtitle) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= composerStartRestartGroup.changed(sampleReceiptUrl) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(useCodeClicked) ? 2048 : 1024;
        }
        if (composerStartRestartGroup.shouldExecute((i2 & 1171) != 1170, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(213178733, i2, -1, "app.chalo.ncmc.ui.landing.compose.ChaloCardLinkingTutorialScreen (ChaloCardComposables.kt:75)");
            }
            Modifier.Companion companion = Modifier.INSTANCE;
            Modifier modifierM264backgroundbw27NRU$default = BackgroundKt.m264backgroundbw27NRU$default(ScrollKt.verticalScroll$default(PaddingKt.m784padding3ABfNKs(SizeKt.fillMaxSize$default(companion, 0.0f, 1, null), ChaloTheme.b(composerStartRestartGroup, 0).h), ScrollKt.rememberScrollState(0, composerStartRestartGroup, 0, 1), false, null, false, 14, null), ChaloTheme.a(composerStartRestartGroup, 0).t, null, 2, null);
            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getCenterHorizontally(), composerStartRestartGroup, 48);
            long currentCompositeKeyHashCode = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
            int i3 = (int) (currentCompositeKeyHashCode ^ (currentCompositeKeyHashCode >>> 32));
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierM264backgroundbw27NRU$default);
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
            ChaloSpacersKt.m(composerStartRestartGroup, 0);
            Painter painterA = PainterResourceHelperKt.a(IconType.IC_NO_CARDS_LINKED, composerStartRestartGroup, 6);
            ImageKt.Image(painterA, "No cards linked to your number", AspectRatioKt.aspectRatio$default(SizeKt.m833width3ABfNKs(companion, ChaloTheme.b(composerStartRestartGroup, 0).u), Float.intBitsToFloat((int) (painterA.getJ() >> 32)) / Float.intBitsToFloat((int) (painterA.getJ() & BodyPartID.bodyIdMax)), false, 2, null), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composerStartRestartGroup, Painter.$stable | 48, 120);
            ChaloSpacersKt.p(composerStartRestartGroup, 0);
            String strC = StringResourcesHelperKt.c(StringEnum.LINK_CARD_TUT_TITLE, new Object[0], composerStartRestartGroup, 6);
            TextStyle textStyleE = ChaloTypographyKt.e(ChaloTheme.e(composerStartRestartGroup, 0));
            long j = ChaloTheme.a(composerStartRestartGroup, 0).g;
            TextAlign.Companion companion3 = TextAlign.INSTANCE;
            TextKt.m2623TextNvy7gAk(strC, PlotlineComposeWidgetKt.a(companion, "PL_Link_Your_Card"), j, null, 0L, null, null, null, 0L, null, TextAlign.m7161boximpl(companion3.m7168getCentere0LSkKk()), 0L, 0, false, 0, 0, null, textStyleE, composerStartRestartGroup, 0, 0, 130040);
            ChaloSpacersKt.m(composerStartRestartGroup, 0);
            TextKt.m2623TextNvy7gAk(StringResourcesHelperKt.c(StringEnum.LINK_CARD_TUT_SUBTITLE, new Object[0], composerStartRestartGroup, 6), null, ChaloTheme.a(composerStartRestartGroup, 0).h, null, 0L, null, null, null, 0L, null, TextAlign.m7161boximpl(companion3.m7168getCentere0LSkKk()), 0L, 0, false, 0, 0, null, ChaloTypographyKt.c(ChaloTheme.e(composerStartRestartGroup, 0)), composerStartRestartGroup, 0, 0, 130042);
            ChaloSpacersKt.h(composerStartRestartGroup, 0);
            a(sampleTitle, sampleSubtitle, sampleReceiptUrl, useCodeClicked, composerStartRestartGroup, i2 & 8190);
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
            scopeUpdateScopeEndRestartGroup.updateScope(new ki(sampleTitle, sampleSubtitle, sampleReceiptUrl, useCodeClicked, i, 0));
        }
    }

    public static final void c(int i, Composer composer, Modifier modifier, String imageUrl) {
        int i2;
        Intrinsics.i(imageUrl, "imageUrl");
        Composer composerStartRestartGroup = composer.startRestartGroup(1093171205);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changed(modifier) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changed(imageUrl) ? 32 : 16;
        }
        if (composerStartRestartGroup.shouldExecute((i2 & 19) != 18, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1093171205, i2, -1, "app.chalo.ncmc.ui.landing.compose.ChaloCardSampleReceiptImage (ChaloCardComposables.kt:38)");
            }
            SingletonSubcomposeAsyncImageKt.a(imageUrl, "Sample receipt for card linking", modifier, ComposableSingletons$ChaloCardComposablesKt.f6382a, ComposableSingletons$ChaloCardComposablesKt.b, ComposableSingletons$ChaloCardComposablesKt.c, null, null, null, null, composerStartRestartGroup, ((i2 >> 3) & 14) | 1794096 | ((i2 << 6) & 896), 0, 65416);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new nb(modifier, imageUrl, i, 2));
        }
    }
}
