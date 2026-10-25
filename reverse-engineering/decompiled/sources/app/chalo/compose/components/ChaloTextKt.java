package app.chalo.compose.components;

import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.layout.ContentScale;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.unit.Dp;
import androidx.core.view.accessibility.AccessibilityEventCompat;
import app.chalo.compose.components.ChaloTextKt;
import app.chalo.compose.resources.PainterResourceHelperKt;
import app.chalo.compose.theme.ChaloTheme;
import app.chalo.compose.theme.ChaloTypographyKt;
import app.chalo.data.PaddingAppModel;
import app.chalo.data.TextFormatAppModel;
import app.chalo.data.TextStyleAppModel;
import app.chalo.providers.iconassetprovider.IconType;
import app.chalo.uistate.text.TextWithSpecialFeaturesTagsUIStateKt;
import app.chalo.uistate.text.UITextStyle;
import defpackage.pk0;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"chalo-base_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class ChaloTextKt {
    public static final void a(final Modifier modifier, final TextStyleAppModel textStyle, final PaddingAppModel paddingAppModel, final long j, final IconType iconType, final float f, IconType iconType2, final float f2, final Shape shape, Composer composer, final int i) {
        int i2;
        final IconType iconType3;
        int i3;
        Intrinsics.i(textStyle, "textStyle");
        Composer composerStartRestartGroup = composer.startRestartGroup(-230711579);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changed("") ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changed(modifier) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(textStyle) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= composerStartRestartGroup.changed(paddingAppModel) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= composerStartRestartGroup.changed(j) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= composerStartRestartGroup.changed(iconType == null ? -1 : iconType.ordinal()) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            i2 |= composerStartRestartGroup.changed(f) ? 1048576 : 524288;
        }
        if ((12582912 & i) == 0) {
            i2 |= composerStartRestartGroup.changed(iconType2 == null ? -1 : iconType2.ordinal()) ? 8388608 : 4194304;
        }
        if ((100663296 & i) == 0) {
            i2 |= composerStartRestartGroup.changed(f2) ? AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL : 33554432;
        }
        if ((805306368 & i) == 0) {
            i2 |= composerStartRestartGroup.changed(shape) ? 536870912 : 268435456;
        }
        if (composerStartRestartGroup.shouldExecute((306783379 & i2) != 306783378, i2 & 1)) {
            composerStartRestartGroup.startDefaults();
            if ((i & 1) != 0 && !composerStartRestartGroup.getDefaultsInvalid()) {
                composerStartRestartGroup.skipToGroupEnd();
            }
            composerStartRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-230711579, i2, -1, "app.chalo.compose.components.ChaloTextWithBackground (ChaloText.kt:37)");
            }
            Modifier.Companion companion = Modifier.INSTANCE;
            Modifier modifierM787paddingqDBjuR0 = PaddingKt.m787paddingqDBjuR0(BackgroundKt.m263backgroundbw27NRU(companion, j, shape), Dp.m7278constructorimpl(paddingAppModel.c), Dp.m7278constructorimpl(paddingAppModel.d), Dp.m7278constructorimpl(paddingAppModel.b), Dp.m7278constructorimpl(paddingAppModel.f2363a));
            MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), Alignment.INSTANCE.getTop(), composerStartRestartGroup, 0);
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
            if (iconType != null) {
                composerStartRestartGroup.startReplaceGroup(582362782);
                i3 = 0;
                ImageKt.Image(PainterResourceHelperKt.a(iconType, composerStartRestartGroup, (i2 >> 15) & 14), (String) null, PaddingKt.m788paddingqDBjuR0$default(companion, 0.0f, 0.0f, f, 0.0f, 11, null), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composerStartRestartGroup, Painter.$stable | 48, 120);
                composerStartRestartGroup = composerStartRestartGroup;
            } else {
                i3 = 0;
                composerStartRestartGroup.startReplaceGroup(580460281);
            }
            composerStartRestartGroup.endReplaceGroup();
            TextStyle textStyleB = ChaloTypographyKt.b(ChaloTheme.e(composerStartRestartGroup, 6));
            String str = textStyle.b;
            if (str.length() <= 0) {
                str = null;
            }
            long jD = str != null ? ComposeUtils_androidKt.d(str) : Color.INSTANCE.m4641getUnspecified0d7_KjU();
            TextFormatAppModel textFormatAppModel = textStyle.f2406a;
            if (textFormatAppModel instanceof TextFormatAppModel.HtmlFormatted) {
                composerStartRestartGroup.startReplaceGroup(582912474);
                TextFormatAppModel.HtmlFormatted htmlFormatted = (TextFormatAppModel.HtmlFormatted) textFormatAppModel;
                if (htmlFormatted.b.isEmpty()) {
                    composerStartRestartGroup.startReplaceGroup(583642803);
                    Composer composer2 = composerStartRestartGroup;
                    androidx.compose.material3.TextKt.m2623TextNvy7gAk(htmlFormatted.c, modifier, jD, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, textStyleB, composer2, 0, 0, 131064);
                    composerStartRestartGroup = composer2;
                    composerStartRestartGroup.endReplaceGroup();
                } else {
                    composerStartRestartGroup.startReplaceGroup(582951317);
                    TextWithSpecialFeaturesTagsKt.a(TextWithSpecialFeaturesTagsUIStateKt.b(htmlFormatted.b, UITextStyle.BodySmall, Integer.valueOf(textStyle.c), jD, composerStartRestartGroup, 48), modifier, composerStartRestartGroup, i3, i3);
                    composerStartRestartGroup.endReplaceGroup();
                }
                composerStartRestartGroup.endReplaceGroup();
            } else {
                if (!(textFormatAppModel instanceof TextFormatAppModel.Simple)) {
                    throw pk0.p(composerStartRestartGroup, -119746018);
                }
                composerStartRestartGroup.startReplaceGroup(583996079);
                Composer composer3 = composerStartRestartGroup;
                androidx.compose.material3.TextKt.m2623TextNvy7gAk(((TextFormatAppModel.Simple) textFormatAppModel).b, modifier, jD, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, textStyleB, composer3, 0, 0, 131064);
                composerStartRestartGroup = composer3;
                composerStartRestartGroup.endReplaceGroup();
            }
            iconType3 = iconType2;
            if (iconType3 != null) {
                composerStartRestartGroup.startReplaceGroup(584282240);
                Composer composer4 = composerStartRestartGroup;
                ImageKt.Image(PainterResourceHelperKt.a(iconType3, composerStartRestartGroup, (i2 >> 21) & 14), (String) null, PaddingKt.m788paddingqDBjuR0$default(companion, f2, 0.0f, 0.0f, 0.0f, 14, null), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composer4, Painter.$stable | 48, 120);
                composerStartRestartGroup = composer4;
            } else {
                composerStartRestartGroup.startReplaceGroup(580460281);
            }
            composerStartRestartGroup.endReplaceGroup();
            composerStartRestartGroup.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            iconType3 = iconType2;
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: hm
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    ChaloTextKt.a(modifier, textStyle, paddingAppModel, j, iconType, f, iconType3, f2, shape, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(i | 1));
                    return Unit.f17538a;
                }
            });
        }
    }
}
