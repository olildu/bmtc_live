package app.chalo.productpurchase.productselection.ui;

import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.FlowLayoutKt;
import androidx.compose.foundation.layout.IntrinsicKt;
import androidx.compose.foundation.layout.IntrinsicSize;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.lazy.LazyDslKt;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.ClipKt;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import app.chalo.compose.ChaloToolBarKt;
import app.chalo.compose.StandardErrorScreenKt;
import app.chalo.compose.components.ChaloRoundedCardKt;
import app.chalo.compose.components.ChaloSpacersKt;
import app.chalo.compose.components.FromAndToStopDetailViewKt;
import app.chalo.compose.components.TextKt;
import app.chalo.compose.components.TextWithSpecialFeaturesTagsKt;
import app.chalo.compose.components.image.CommonImageKt;
import app.chalo.compose.components.shimmer.ShimmerEffectKt;
import app.chalo.compose.theme.ChaloPadding;
import app.chalo.compose.theme.ChaloTheme;
import app.chalo.compose.theme.ChaloThemeKt;
import app.chalo.compose.theme.UIShape;
import app.chalo.uistate.base.ChaloColorToken;
import app.chalo.uistate.base.ChaloColorTokenKt;
import app.chalo.uistate.base.UiAlignmentKt;
import app.chalo.uistate.base.UiArrangementKt;
import app.chalo.uistate.base.UiEventHandler;
import app.chalo.uistate.base.UiEventHandler$Companion$fromLambda$1;
import app.chalo.uistate.dialog.ConfirmationDialogUiState;
import app.chalo.uistate.dialog.LoadingDialogUIState;
import app.chalo.uistate.error.StandardErrorScreenUIState;
import app.chalo.uistate.image.ImageUISize;
import app.chalo.uistate.image.ImageUIState;
import app.chalo.uistate.image.ImageUIStateKt;
import app.chalo.uistate.image.ImageUrlUIState;
import app.chalo.uistate.text.TextUIState;
import app.chalo.uistate.text.TextWithSpecialFeaturesTagsUIState;
import app.chalo.uistate.toolbar.ToolbarUIState;
import coil3.compose.SingletonAsyncImageKt;
import com.arkivanov.decompose.extensions.compose.SubscribeAsStateKt;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import defpackage.b3;
import defpackage.bu0;
import defpackage.dd;
import defpackage.g2;
import defpackage.h0;
import defpackage.i41;
import defpackage.la0;
import defpackage.ni;
import defpackage.pk0;
import defpackage.r1;
import defpackage.rx0;
import defpackage.sx0;
import defpackage.t8;
import defpackage.vw0;
import defpackage.yu0;
import defpackage.z;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KFunction;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002¨\u0006\u0002²\u0006\f\u0010\u0001\u001a\u00020\u00008\nX\u008a\u0084\u0002"}, d2 = {"Lapp/chalo/productpurchase/productselection/ui/ProductSelectionUIState;", RemoteConfigConstants.ResponseFieldKey.STATE, "home_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class ProductSelectionScreenKt {
    public static final void a(ProductSelectionSectionItemUIState.ProductItemUIState productItemUIState, Modifier modifier, Composer composer, int i) {
        int i2;
        Modifier modifier2;
        Composer composerStartRestartGroup = composer.startRestartGroup(-2021786440);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changed(productItemUIState) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changed(modifier) ? 32 : 16;
        }
        if (composerStartRestartGroup.shouldExecute((i2 & 19) != 18, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-2021786440, i2, -1, "app.chalo.productpurchase.productselection.ui.ProductItem (ProductSelectionScreen.kt:186)");
            }
            modifier2 = modifier;
            ChaloRoundedCardKt.a(productItemUIState.f8694a.f8667a, modifier2, ComposableLambdaKt.rememberComposableLambda(-1951886681, true, new la0(productItemUIState, 28), composerStartRestartGroup, 54), composerStartRestartGroup, (i2 & 112) | 384, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            modifier2 = modifier;
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new bu0(productItemUIState, modifier2, i, 28));
        }
    }

    public static final void b(ImageUrlUIState imageUrlUIState, TextUIState.ChaloTextUIState chaloTextUIState, TextUIState textUIState, TextUIState textUIState2, ProductItemUISpec productItemUISpec, Modifier modifier, Composer composer, int i) {
        int i2;
        int i3;
        int i4;
        Modifier modifierB;
        float f = productItemUISpec.f;
        Composer composerStartRestartGroup = composer.startRestartGroup(505077479);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changed(imageUrlUIState) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= (i & 64) == 0 ? composerStartRestartGroup.changed(chaloTextUIState) : composerStartRestartGroup.changedInstance(chaloTextUIState) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= (i & 512) == 0 ? composerStartRestartGroup.changed(textUIState) : composerStartRestartGroup.changedInstance(textUIState) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= (i & 4096) == 0 ? composerStartRestartGroup.changed(textUIState2) : composerStartRestartGroup.changedInstance(textUIState2) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= composerStartRestartGroup.changed(productItemUISpec) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= composerStartRestartGroup.changed(modifier) ? 131072 : 65536;
        }
        if (composerStartRestartGroup.shouldExecute((74899 & i2) != 74898, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(505077479, i2, -1, "app.chalo.productpurchase.productselection.ui.ProductItemDetails (ProductSelectionScreen.kt:273)");
            }
            Arrangement arrangement = Arrangement.INSTANCE;
            Arrangement.Horizontal start = arrangement.getStart();
            Alignment.Companion companion = Alignment.INSTANCE;
            MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(start, companion.getTop(), composerStartRestartGroup, 0);
            long currentCompositeKeyHashCode = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
            int i5 = (int) (currentCompositeKeyHashCode ^ (currentCompositeKeyHashCode >>> 32));
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifier);
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
            pk0.v(companion2, composerM3915constructorimpl, measurePolicyRowMeasurePolicy, composerM3915constructorimpl, currentCompositionLocalMap);
            Updater.m3923setimpl(composerM3915constructorimpl, modifierMaterializeModifier, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion2, composerM3915constructorimpl, Integer.valueOf(i5), composerM3915constructorimpl));
            RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
            if (imageUrlUIState == null) {
                composerStartRestartGroup.startReplaceGroup(1338718301);
                composerStartRestartGroup.endReplaceGroup();
                i3 = 0;
                i4 = 1;
            } else {
                composerStartRestartGroup.startReplaceGroup(1338718302);
                Modifier modifierC = ChaloThemeKt.c(modifier, productItemUISpec.g);
                MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(companion.getCenter(), false);
                long currentCompositeKeyHashCode2 = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
                int i6 = (int) (currentCompositeKeyHashCode2 ^ (currentCompositeKeyHashCode2 >>> 32));
                CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierC);
                Function0<ComposeUiNode> constructor2 = companion2.getConstructor();
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
                pk0.v(companion2, composerM3915constructorimpl2, measurePolicyMaybeCachedBoxMeasurePolicy, composerM3915constructorimpl2, currentCompositionLocalMap2);
                Updater.m3923setimpl(composerM3915constructorimpl2, modifierMaterializeModifier2, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion2, composerM3915constructorimpl2, Integer.valueOf(i6), composerM3915constructorimpl2));
                BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                String str = imageUrlUIState.f10037a;
                Modifier modifier2 = Modifier.INSTANCE;
                ImageUISize imageUISize = imageUrlUIState.c;
                if (imageUISize != null && (modifierB = ImageUIStateKt.b(modifier2, imageUISize)) != null) {
                    modifier2 = modifierB;
                }
                Modifier modifier3 = modifier2;
                i3 = 0;
                i4 = 1;
                SingletonAsyncImageKt.a(str, null, modifier3, null, composerStartRestartGroup, 48, 2040);
                composerStartRestartGroup.endNode();
                composerStartRestartGroup.endReplaceGroup();
            }
            Modifier modifierAlign = rowScopeInstance.align(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, i4, null), companion.getCenterVertically());
            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(arrangement.getTop(), companion.getStart(), composerStartRestartGroup, i3);
            long currentCompositeKeyHashCode3 = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, i3);
            int i7 = (int) (currentCompositeKeyHashCode3 ^ (currentCompositeKeyHashCode3 >>> 32));
            CompositionLocalMap currentCompositionLocalMap3 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier3 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierAlign);
            Function0<ComposeUiNode> constructor3 = companion2.getConstructor();
            if (composerStartRestartGroup.getApplier() == null) {
                i4 = i3;
            }
            if (i4 == 0) {
                ComposablesKt.invalidApplier();
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.createNode(constructor3);
            } else {
                composerStartRestartGroup.useNode();
            }
            Composer composerM3915constructorimpl3 = Updater.m3915constructorimpl(composerStartRestartGroup);
            pk0.v(companion2, composerM3915constructorimpl3, measurePolicyColumnMeasurePolicy, composerM3915constructorimpl3, currentCompositionLocalMap3);
            Updater.m3923setimpl(composerM3915constructorimpl3, modifierMaterializeModifier3, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion2, composerM3915constructorimpl3, Integer.valueOf(i7), composerM3915constructorimpl3));
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
            int i8 = i3;
            TextKt.c(chaloTextUIState, null, null, null, composerStartRestartGroup, (i2 >> 3) & 14, 14);
            if (textUIState == null) {
                composerStartRestartGroup.startReplaceGroup(1683584638);
            } else {
                composerStartRestartGroup.startReplaceGroup(1683584639);
                ChaloSpacersKt.a(f, composerStartRestartGroup, i8);
                TextKt.c(textUIState, null, null, null, composerStartRestartGroup, 0, 14);
            }
            composerStartRestartGroup.endReplaceGroup();
            if (textUIState2 == null) {
                composerStartRestartGroup.startReplaceGroup(1683710622);
            } else {
                composerStartRestartGroup.startReplaceGroup(1683710623);
                ChaloSpacersKt.a(f, composerStartRestartGroup, i8);
                TextKt.c(textUIState2, null, null, null, composerStartRestartGroup, 0, 14);
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
            scopeUpdateScopeEndRestartGroup.updateScope(new g2((Object) imageUrlUIState, (Object) chaloTextUIState, (Object) textUIState, (Object) textUIState2, (Object) productItemUISpec, modifier, i, 13));
        }
    }

    public static final void c(ImageUIState imageUIState, ChaloPadding chaloPadding, TextUIState textUIState, ChaloPadding chaloPadding2, UIShape uIShape, ChaloColorToken chaloColorToken, Composer composer, int i) {
        int i2;
        Composer composerStartRestartGroup = composer.startRestartGroup(773566450);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changed(imageUIState) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= (i & 64) == 0 ? composerStartRestartGroup.changed(chaloPadding) : composerStartRestartGroup.changedInstance(chaloPadding) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= (i & 512) == 0 ? composerStartRestartGroup.changed(textUIState) : composerStartRestartGroup.changedInstance(textUIState) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= (i & 4096) == 0 ? composerStartRestartGroup.changed(chaloPadding2) : composerStartRestartGroup.changedInstance(chaloPadding2) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= (32768 & i) == 0 ? composerStartRestartGroup.changed(uIShape) : composerStartRestartGroup.changedInstance(uIShape) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= composerStartRestartGroup.changed(chaloColorToken) ? 131072 : 65536;
        }
        if (composerStartRestartGroup.shouldExecute((74899 & i2) != 74898, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(773566450, i2, -1, "app.chalo.productpurchase.productselection.ui.ProductItemLogosAndLabels (ProductSelectionScreen.kt:237)");
            }
            Modifier.Companion companion = Modifier.INSTANCE;
            Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null);
            MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), Alignment.INSTANCE.getTop(), composerStartRestartGroup, 0);
            long currentCompositeKeyHashCode = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
            int i3 = (int) (currentCompositeKeyHashCode ^ (currentCompositeKeyHashCode >>> 32));
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierFillMaxWidth$default);
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
            pk0.v(companion2, composerM3915constructorimpl, measurePolicyRowMeasurePolicy, composerM3915constructorimpl, currentCompositionLocalMap);
            Updater.m3923setimpl(composerM3915constructorimpl, modifierMaterializeModifier, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion2, composerM3915constructorimpl, Integer.valueOf(i3), composerM3915constructorimpl));
            RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
            if (imageUIState == null) {
                composerStartRestartGroup.startReplaceGroup(325981510);
            } else {
                composerStartRestartGroup.startReplaceGroup(325981511);
                CommonImageKt.a(imageUIState, ChaloThemeKt.c(companion, chaloPadding), false, composerStartRestartGroup, 0, 4);
            }
            composerStartRestartGroup.endReplaceGroup();
            SpacerKt.Spacer(i41.a(rowScopeInstance, companion, 1.0f, false, 2, null), composerStartRestartGroup, 0);
            if (textUIState == null) {
                composerStartRestartGroup.startReplaceGroup(326211499);
            } else {
                composerStartRestartGroup.startReplaceGroup(326211500);
                TextKt.c(textUIState, ChaloThemeKt.c(BackgroundKt.m263backgroundbw27NRU(companion, ChaloColorTokenKt.c(chaloColorToken), ChaloThemeKt.d(uIShape)), chaloPadding2), null, null, composerStartRestartGroup, 0, 12);
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
            scopeUpdateScopeEndRestartGroup.updateScope(new g2(imageUIState, chaloPadding, textUIState, chaloPadding2, uIShape, chaloColorToken, i, 14));
        }
    }

    public static final void d(ProductAnnouncementTextUIState productAnnouncementTextUIState, Modifier modifier, Composer composer, int i) {
        int i2;
        Composer composerStartRestartGroup = composer.startRestartGroup(1123719863);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changed(productAnnouncementTextUIState) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changed(modifier) ? 32 : 16;
        }
        int i3 = 0;
        if (composerStartRestartGroup.shouldExecute((i2 & 19) != 18, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1123719863, i2, -1, "app.chalo.productpurchase.productselection.ui.ProductSelectionAnnouncement (ProductSelectionScreen.kt:406)");
            }
            Modifier modifierC = ChaloThemeKt.c(BackgroundKt.m263backgroundbw27NRU(modifier, ChaloColorTokenKt.c(productAnnouncementTextUIState.c), ChaloThemeKt.d(productAnnouncementTextUIState.b)), productAnnouncementTextUIState.d);
            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getCenter(), false);
            long currentCompositeKeyHashCode = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
            int i4 = (int) ((currentCompositeKeyHashCode >>> 32) ^ currentCompositeKeyHashCode);
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierC);
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
            Updater.m3923setimpl(composerM3915constructorimpl, modifierMaterializeModifier, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion, composerM3915constructorimpl, Integer.valueOf(i4), composerM3915constructorimpl));
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            TextKt.c(productAnnouncementTextUIState.f8666a, null, null, null, composerStartRestartGroup, 0, 14);
            composerStartRestartGroup.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new rx0(productAnnouncementTextUIState, modifier, i, i3));
        }
    }

    public static final void e(ProductSelectionSkeletonLoadingUIState productSelectionSkeletonLoadingUIState, Modifier modifier, Composer composer, int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(-2133645903);
        int i2 = (i & 6) == 0 ? (composerStartRestartGroup.changed(productSelectionSkeletonLoadingUIState) ? 4 : 2) | i : i;
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changed(modifier) ? 32 : 16;
        }
        if (composerStartRestartGroup.shouldExecute((i2 & 19) != 18, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-2133645903, i2, -1, "app.chalo.productpurchase.productselection.ui.ProductSelectionLoadingScreen (ProductSelectionScreen.kt:444)");
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
            k(productSelectionSkeletonLoadingUIState.b, Modifier.INSTANCE, composerStartRestartGroup, 48, 0);
            ChaloSpacersKt.a(productSelectionSkeletonLoadingUIState.f.d, composerStartRestartGroup, 0);
            composerStartRestartGroup.startReplaceGroup(-461258009);
            int i4 = productSelectionSkeletonLoadingUIState.f8697a;
            for (int i5 = 0; i5 < i4; i5++) {
                j(productSelectionSkeletonLoadingUIState.c, productSelectionSkeletonLoadingUIState.d, productSelectionSkeletonLoadingUIState.e, productSelectionSkeletonLoadingUIState.f, null, composerStartRestartGroup, 0);
            }
            if (b3.t(composerStartRestartGroup)) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new bu0(productSelectionSkeletonLoadingUIState, modifier, i, 27));
        }
    }

    public static final void f(ProductSelectionProductsListUIState productSelectionProductsListUIState, Modifier modifier, Composer composer, int i) {
        int i2;
        Composer composerStartRestartGroup = composer.startRestartGroup(1812672664);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changed(productSelectionProductsListUIState) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changed(modifier) ? 32 : 16;
        }
        if (composerStartRestartGroup.shouldExecute((i2 & 19) != 18, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1812672664, i2, -1, "app.chalo.productpurchase.productselection.ui.ProductSelectionProductsListScreen (ProductSelectionScreen.kt:117)");
            }
            boolean z = (i2 & 14) == 4;
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (z || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new vw0(productSelectionProductsListUIState, 5);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            LazyDslKt.LazyColumn(modifier, null, null, false, null, null, null, false, null, (Function1) objRememberedValue, composerStartRestartGroup, (i2 >> 3) & 14, TypedValues.PositionType.TYPE_POSITION_TYPE);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new bu0(productSelectionProductsListUIState, modifier, i, 26));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void g(ProductSelectionComponent productSelectionComponent, Composer composer, int i) {
        int i2;
        Composer composerStartRestartGroup = composer.startRestartGroup(1746809075);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(productSelectionComponent) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (composerStartRestartGroup.shouldExecute((i2 & 3) != 2, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1746809075, i2, -1, "app.chalo.productpurchase.productselection.ui.ProductSelectionScreen (ProductSelectionScreen.kt:61)");
            }
            MutableState mutableStateA = SubscribeAsStateKt.a(productSelectionComponent.t0(), composerStartRestartGroup);
            boolean zChangedInstance = composerStartRestartGroup.changedInstance(productSelectionComponent);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new ProductSelectionScreenKt$ProductSelectionScreen$1$1(productSelectionComponent, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            EffectsKt.LaunchedEffect(productSelectionComponent, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue, composerStartRestartGroup, i2 & 14);
            h((ProductSelectionUIState) mutableStateA.getValue(), composerStartRestartGroup, 0);
            ConfirmationDialogUiState confirmationDialogUiState = ((ProductSelectionUIState) mutableStateA.getValue()).f;
            if (confirmationDialogUiState == null) {
                composerStartRestartGroup.startReplaceGroup(1365669557);
                composerStartRestartGroup.endReplaceGroup();
            } else {
                dd.l(composerStartRestartGroup, 1365669558, confirmationDialogUiState, composerStartRestartGroup, 0);
            }
            LoadingDialogUIState loadingDialogUIState = ((ProductSelectionUIState) mutableStateA.getValue()).d;
            if (loadingDialogUIState == null) {
                composerStartRestartGroup.startReplaceGroup(1365752420);
                composerStartRestartGroup.endReplaceGroup();
            } else {
                t8.m(composerStartRestartGroup, 1365752421, loadingDialogUIState, composerStartRestartGroup, 0);
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new yu0(productSelectionComponent, i, 16));
        }
    }

    public static final void h(ProductSelectionUIState productSelectionUIState, Composer composer, int i) {
        int i2;
        Composer composerStartRestartGroup = composer.startRestartGroup(-896632962);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changed(productSelectionUIState) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (composerStartRestartGroup.shouldExecute((i2 & 3) != 2, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-896632962, i2, -1, "app.chalo.productpurchase.productselection.ui.ProductSelectionScreenContent (ProductSelectionScreen.kt:82)");
            }
            Modifier.Companion companion = Modifier.INSTANCE;
            Modifier modifierFillMaxSize$default = SizeKt.fillMaxSize$default(companion, 0.0f, 1, null);
            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composerStartRestartGroup, 0);
            long currentCompositeKeyHashCode = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
            int i3 = (int) (currentCompositeKeyHashCode ^ (currentCompositeKeyHashCode >>> 32));
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
            Updater.m3923setimpl(composerM3915constructorimpl, modifierMaterializeModifier, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion2, composerM3915constructorimpl, Integer.valueOf(i3), composerM3915constructorimpl));
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
            ToolbarUIState toolbarUIState = productSelectionUIState.f8699a;
            ProductSelectionProductsListUIState productSelectionProductsListUIState = productSelectionUIState.e;
            StandardErrorScreenUIState standardErrorScreenUIState = productSelectionUIState.c;
            ProductSelectionSkeletonLoadingUIState productSelectionSkeletonLoadingUIState = productSelectionUIState.b;
            ChaloToolBarKt.b(toolbarUIState, null, null, composerStartRestartGroup, 0, 14);
            if (productSelectionSkeletonLoadingUIState != null) {
                composerStartRestartGroup.startReplaceGroup(1902142237);
                e(productSelectionSkeletonLoadingUIState, ChaloThemeKt.c(SizeKt.fillMaxSize$default(companion, 0.0f, 1, null), productSelectionUIState.g.f8698a), composerStartRestartGroup, 0);
                composerStartRestartGroup.endReplaceGroup();
            } else if (standardErrorScreenUIState != null) {
                composerStartRestartGroup.startReplaceGroup(1902451555);
                StandardErrorScreenKt.c(standardErrorScreenUIState, SizeKt.fillMaxSize$default(companion, 0.0f, 1, null), composerStartRestartGroup, 48, 0);
                composerStartRestartGroup.endReplaceGroup();
            } else {
                if (productSelectionProductsListUIState != null) {
                    composerStartRestartGroup.startReplaceGroup(1902660247);
                    f(productSelectionProductsListUIState, SizeKt.fillMaxSize$default(companion, 0.0f, 1, null), composerStartRestartGroup, 48);
                } else {
                    composerStartRestartGroup.startReplaceGroup(1898790734);
                }
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
            scopeUpdateScopeEndRestartGroup.updateScope(new yu0(productSelectionUIState, i, 17));
        }
    }

    public static final void i(ProductSelectionListHeader productSelectionListHeader, Modifier modifier, Composer composer, int i) {
        int i2;
        Composer composerStartRestartGroup = composer.startRestartGroup(176455966);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changed(productSelectionListHeader) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changed(modifier) ? 32 : 16;
        }
        if (composerStartRestartGroup.shouldExecute((i2 & 19) != 18, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(176455966, i2, -1, "app.chalo.productpurchase.productselection.ui.ProductSelectionSectionHeader (ProductSelectionScreen.kt:424)");
            }
            MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getSpaceBetween(), Alignment.INSTANCE.getCenterVertically(), composerStartRestartGroup, 54);
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
            pk0.v(companion, composerM3915constructorimpl, measurePolicyRowMeasurePolicy, composerM3915constructorimpl, currentCompositionLocalMap);
            Updater.m3923setimpl(composerM3915constructorimpl, modifierMaterializeModifier, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion, composerM3915constructorimpl, Integer.valueOf(i3), composerM3915constructorimpl));
            RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
            TextKt.c(productSelectionListHeader.f8686a, null, null, null, composerStartRestartGroup, 0, 14);
            ChaloSpacersKt.a(ChaloTheme.b(composerStartRestartGroup, 0).f, composerStartRestartGroup, 0);
            TextUIState textUIState = productSelectionListHeader.b;
            if (textUIState == null) {
                composerStartRestartGroup.startReplaceGroup(88063035);
            } else {
                composerStartRestartGroup.startReplaceGroup(88063036);
                TextKt.c(textUIState, null, null, null, composerStartRestartGroup, 0, 14);
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
            scopeUpdateScopeEndRestartGroup.updateScope(new bu0(productSelectionListHeader, modifier, i, 29));
        }
    }

    public static final void j(ProductSelectionLoadingItemUIState productSelectionLoadingItemUIState, ProductSelectionLoadingItemUIState productSelectionLoadingItemUIState2, ProductSelectionLoadingItemUIState productSelectionLoadingItemUIState3, ProductSelectionSkeletonLoadingUISpec productSelectionSkeletonLoadingUISpec, Modifier modifier, Composer composer, int i) {
        int i2;
        Composer composer2;
        Modifier modifier2;
        Composer composerStartRestartGroup = composer.startRestartGroup(225680101);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changed(productSelectionLoadingItemUIState) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changed(productSelectionLoadingItemUIState2) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= composerStartRestartGroup.changed(productSelectionLoadingItemUIState3) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= composerStartRestartGroup.changed(productSelectionSkeletonLoadingUISpec) ? 2048 : 1024;
        }
        int i3 = i2 | 24576;
        if (composerStartRestartGroup.shouldExecute((i3 & 9363) != 9362, i3 & 1)) {
            Modifier.Companion companion = Modifier.INSTANCE;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(225680101, i3, -1, "app.chalo.productpurchase.productselection.ui.ProductSelectionShimmerCard (ProductSelectionScreen.kt:471)");
            }
            composer2 = composerStartRestartGroup;
            ChaloRoundedCardKt.a(productSelectionSkeletonLoadingUISpec.e, ChaloThemeKt.c(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), productSelectionSkeletonLoadingUISpec.c), ComposableLambdaKt.rememberComposableLambda(-2011966892, true, new ni(companion, productSelectionSkeletonLoadingUISpec, productSelectionLoadingItemUIState, productSelectionLoadingItemUIState2, productSelectionLoadingItemUIState3, 3), composerStartRestartGroup, 54), composer2, 384, 0);
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
            scopeUpdateScopeEndRestartGroup.updateScope(new h0((Object) productSelectionLoadingItemUIState, (Object) productSelectionLoadingItemUIState2, (Object) productSelectionLoadingItemUIState3, (Object) productSelectionSkeletonLoadingUISpec, modifier2, i, 26));
        }
    }

    public static final void k(ProductSelectionLoadingItemUIState productSelectionLoadingItemUIState, Modifier modifier, Composer composer, int i, int i2) {
        int i3;
        Composer composerStartRestartGroup = composer.startRestartGroup(237251869);
        if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changed(productSelectionLoadingItemUIState) ? 4 : 2) | i;
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
                ComposerKt.traceEventStart(237251869, i3, -1, "app.chalo.productpurchase.productselection.ui.ProductSelectionShimmerItem (ProductSelectionScreen.kt:503)");
            }
            BoxKt.Box(ShimmerEffectKt.b(ClipKt.clip(SizeKt.m830sizeVpY3zN4(modifier, productSelectionLoadingItemUIState.b, productSelectionLoadingItemUIState.f8687a), ChaloThemeKt.d(productSelectionLoadingItemUIState.c)), Color.m4595boximpl(ChaloTheme.a(composerStartRestartGroup, 0).n), Color.m4595boximpl(ChaloTheme.a(composerStartRestartGroup, 0).q), 4), composerStartRestartGroup, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        Modifier modifier2 = modifier;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new z(productSelectionLoadingItemUIState, modifier2, i, i2, 28));
        }
    }

    public static final void l(final ProductSelectionSectionItemUIState.RecentProductItemUIState recentProductItemUIState, Modifier modifier, Composer composer, int i) {
        int i2;
        Modifier modifier2;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1443294014);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changed(recentProductItemUIState) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changed(modifier) ? 32 : 16;
        }
        if (composerStartRestartGroup.shouldExecute((i2 & 19) != 18, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1443294014, i2, -1, "app.chalo.productpurchase.productselection.ui.RecentProductItem (ProductSelectionScreen.kt:317)");
            }
            modifier2 = modifier;
            ChaloRoundedCardKt.a(recentProductItemUIState.f8695a.f8701a, modifier2, ComposableLambdaKt.rememberComposableLambda(-1371587535, true, new Function3() { // from class: app.chalo.productpurchase.productselection.ui.a
                @Override // kotlin.jvm.functions.Function3
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    ComposeUiNode.Companion companion;
                    Modifier modifier3;
                    ColumnScope Card = (ColumnScope) obj;
                    Composer composer2 = (Composer) obj2;
                    int iIntValue = ((Integer) obj3).intValue();
                    Intrinsics.i(Card, "$this$Card");
                    if (composer2.shouldExecute((iIntValue & 17) != 16, iIntValue & 1)) {
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-1371587535, iIntValue, -1, "app.chalo.productpurchase.productselection.ui.RecentProductItem.<anonymous> (ProductSelectionScreen.kt:322)");
                        }
                        Modifier.Companion companion2 = Modifier.INSTANCE;
                        Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(companion2, 0.0f, 1, null);
                        ProductSelectionSectionItemUIState.RecentProductItemUIState recentProductItemUIState2 = recentProductItemUIState;
                        RecentProductItemUISpec recentProductItemUISpec = recentProductItemUIState2.f8695a;
                        Modifier modifierClip = ClipKt.clip(modifierFillMaxWidth$default, ChaloThemeKt.d(recentProductItemUISpec.f8701a.f9924a));
                        UiEventHandler$Companion$fromLambda$1 uiEventHandler$Companion$fromLambda$1 = recentProductItemUIState2.j;
                        boolean zChangedInstance = composer2.changedInstance(uiEventHandler$Companion$fromLambda$1);
                        Object objRememberedValue = composer2.rememberedValue();
                        if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = new ProductSelectionScreenKt$RecentProductItem$1$1$1(0, uiEventHandler$Companion$fromLambda$1, UiEventHandler.class, "onClick", "onClick()V", 0);
                            composer2.updateRememberedValue(objRememberedValue);
                        }
                        Modifier modifierC = ChaloThemeKt.c(ClickableKt.m299clickableoSLSa3U$default(modifierClip, false, null, null, null, (Function0) ((KFunction) objRememberedValue), 15, null), recentProductItemUISpec.b);
                        Arrangement arrangement = Arrangement.INSTANCE;
                        Arrangement.Horizontal start = arrangement.getStart();
                        Alignment.Companion companion3 = Alignment.INSTANCE;
                        MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(start, companion3.getTop(), composer2, 0);
                        long currentCompositeKeyHashCode = ComposablesKt.getCurrentCompositeKeyHashCode(composer2, 0);
                        int i3 = (int) (currentCompositeKeyHashCode ^ (currentCompositeKeyHashCode >>> 32));
                        CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
                        Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composer2, modifierC);
                        ComposeUiNode.Companion companion4 = ComposeUiNode.INSTANCE;
                        Function0<ComposeUiNode> constructor = companion4.getConstructor();
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
                        pk0.v(companion4, composerM3915constructorimpl, measurePolicyRowMeasurePolicy, composerM3915constructorimpl, currentCompositionLocalMap);
                        Updater.m3923setimpl(composerM3915constructorimpl, modifierMaterializeModifier, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion4, composerM3915constructorimpl, Integer.valueOf(i3), composerM3915constructorimpl));
                        RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
                        Modifier modifierA = i41.a(rowScopeInstance, companion2, 1.0f, false, 2, null);
                        MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(arrangement.getTop(), companion3.getStart(), composer2, 0);
                        long currentCompositeKeyHashCode2 = ComposablesKt.getCurrentCompositeKeyHashCode(composer2, 0);
                        int i4 = (int) (currentCompositeKeyHashCode2 ^ (currentCompositeKeyHashCode2 >>> 32));
                        CompositionLocalMap currentCompositionLocalMap2 = composer2.getCurrentCompositionLocalMap();
                        Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(composer2, modifierA);
                        Function0<ComposeUiNode> constructor2 = companion4.getConstructor();
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
                        pk0.v(companion4, composerM3915constructorimpl2, measurePolicyColumnMeasurePolicy, composerM3915constructorimpl2, currentCompositionLocalMap2);
                        Updater.m3923setimpl(composerM3915constructorimpl2, modifierMaterializeModifier2, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion4, composerM3915constructorimpl2, Integer.valueOf(i4), composerM3915constructorimpl2));
                        ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
                        ImageUIState imageUIState = recentProductItemUIState2.c;
                        if (imageUIState == null) {
                            composer2.startReplaceGroup(-801072613);
                            composer2.endReplaceGroup();
                            companion = companion4;
                        } else {
                            composer2.startReplaceGroup(-801072612);
                            companion = companion4;
                            CommonImageKt.a(imageUIState, null, false, composer2, 0, 6);
                            composer2 = composer2;
                            composer2.endReplaceGroup();
                        }
                        Composer composer3 = composer2;
                        FlowLayoutKt.FlowRow(SizeKt.fillMaxWidth$default(companion2, 0.0f, 1, null), null, arrangement.getCenter(), null, 0, 0, ComposableLambdaKt.rememberComposableLambda(804921584, true, new sx0(recentProductItemUIState2, 0), composer2, 54), composer3, 1573254, 58);
                        Composer composer4 = composer3;
                        composer4.startReplaceGroup(-2104020787);
                        ImageUIState imageUIState2 = recentProductItemUIState2.e;
                        TextWithSpecialFeaturesTagsUIState textWithSpecialFeaturesTagsUIState = recentProductItemUIState2.f;
                        if (imageUIState2 == null || textWithSpecialFeaturesTagsUIState == null) {
                            modifier3 = null;
                        } else {
                            ChaloSpacersKt.b(recentProductItemUISpec.g.f1918a, composer4, 0);
                            modifier3 = null;
                            Modifier modifierFillMaxWidth$default2 = SizeKt.fillMaxWidth$default(companion2, 0.0f, 1, null);
                            MeasurePolicy measurePolicyRowMeasurePolicy2 = RowKt.rowMeasurePolicy(arrangement.getStart(), companion3.getCenterVertically(), composer4, 48);
                            long currentCompositeKeyHashCode3 = ComposablesKt.getCurrentCompositeKeyHashCode(composer4, 0);
                            int i5 = (int) (currentCompositeKeyHashCode3 ^ (currentCompositeKeyHashCode3 >>> 32));
                            CompositionLocalMap currentCompositionLocalMap3 = composer4.getCurrentCompositionLocalMap();
                            Modifier modifierMaterializeModifier3 = ComposedModifierKt.materializeModifier(composer4, modifierFillMaxWidth$default2);
                            Function0<ComposeUiNode> constructor3 = companion.getConstructor();
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
                            pk0.v(companion, composerM3915constructorimpl3, measurePolicyRowMeasurePolicy2, composerM3915constructorimpl3, currentCompositionLocalMap3);
                            Updater.m3923setimpl(composerM3915constructorimpl3, modifierMaterializeModifier3, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion, composerM3915constructorimpl3, Integer.valueOf(i5), composerM3915constructorimpl3));
                            CommonImageKt.a(imageUIState2, null, false, composer4, 0, 6);
                            composer4 = composer4;
                            TextWithSpecialFeaturesTagsKt.a(textWithSpecialFeaturesTagsUIState, ChaloThemeKt.c(i41.a(rowScopeInstance, companion2, 1.0f, false, 2, null), recentProductItemUISpec.f), composer4, 0, 0);
                            composer4.endNode();
                        }
                        composer4.endReplaceGroup();
                        FromToStopViewUIState fromToStopViewUIState = recentProductItemUIState2.g;
                        if (fromToStopViewUIState == null) {
                            composer4.startReplaceGroup(-799350842);
                        } else {
                            composer4.startReplaceGroup(-799350841);
                            Modifier modifierC2 = ChaloThemeKt.c(IntrinsicKt.height(SizeKt.fillMaxWidth$default(companion2, 0.0f, 1, modifier3), IntrinsicSize.Min), recentProductItemUISpec.e);
                            MeasurePolicy measurePolicyRowMeasurePolicy3 = RowKt.rowMeasurePolicy(arrangement.getStart(), UiAlignmentKt.b(recentProductItemUISpec.h), composer4, 0);
                            long currentCompositeKeyHashCode4 = ComposablesKt.getCurrentCompositeKeyHashCode(composer4, 0);
                            int i6 = (int) (currentCompositeKeyHashCode4 ^ (currentCompositeKeyHashCode4 >>> 32));
                            CompositionLocalMap currentCompositionLocalMap4 = composer4.getCurrentCompositionLocalMap();
                            Modifier modifierMaterializeModifier4 = ComposedModifierKt.materializeModifier(composer4, modifierC2);
                            Function0<ComposeUiNode> constructor4 = companion.getConstructor();
                            if (composer4.getApplier() == null) {
                                ComposablesKt.invalidApplier();
                            }
                            composer4.startReusableNode();
                            if (composer4.getInserting()) {
                                composer4.createNode(constructor4);
                            } else {
                                composer4.useNode();
                            }
                            Composer composerM3915constructorimpl4 = Updater.m3915constructorimpl(composer4);
                            pk0.v(companion, composerM3915constructorimpl4, measurePolicyRowMeasurePolicy3, composerM3915constructorimpl4, currentCompositionLocalMap4);
                            Updater.m3923setimpl(composerM3915constructorimpl4, modifierMaterializeModifier4, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion, composerM3915constructorimpl4, Integer.valueOf(i6), composerM3915constructorimpl4));
                            FromAndToStopDetailViewKt.c(modifier3, fromToStopViewUIState.f8665a, composer4, 0, 1);
                            ChaloSpacersKt.v(ChaloTheme.b(composer4, 0).g, composer4, 0);
                            MeasurePolicy measurePolicyColumnMeasurePolicy2 = ColumnKt.columnMeasurePolicy(UiArrangementKt.a(recentProductItemUISpec.i), companion3.getStart(), composer4, 0);
                            long currentCompositeKeyHashCode5 = ComposablesKt.getCurrentCompositeKeyHashCode(composer4, 0);
                            int i7 = (int) (currentCompositeKeyHashCode5 ^ (currentCompositeKeyHashCode5 >>> 32));
                            CompositionLocalMap currentCompositionLocalMap5 = composer4.getCurrentCompositionLocalMap();
                            Modifier modifierMaterializeModifier5 = ComposedModifierKt.materializeModifier(composer4, companion2);
                            Function0<ComposeUiNode> constructor5 = companion.getConstructor();
                            if (composer4.getApplier() == null) {
                                ComposablesKt.invalidApplier();
                            }
                            composer4.startReusableNode();
                            if (composer4.getInserting()) {
                                composer4.createNode(constructor5);
                            } else {
                                composer4.useNode();
                            }
                            Composer composerM3915constructorimpl5 = Updater.m3915constructorimpl(composer4);
                            pk0.v(companion, composerM3915constructorimpl5, measurePolicyColumnMeasurePolicy2, composerM3915constructorimpl5, currentCompositionLocalMap5);
                            Updater.m3923setimpl(composerM3915constructorimpl5, modifierMaterializeModifier5, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion, composerM3915constructorimpl5, Integer.valueOf(i7), composerM3915constructorimpl5));
                            TextKt.c(fromToStopViewUIState.b, null, null, null, composer4, 0, 14);
                            SpacerKt.Spacer(SizeKt.m814height3ABfNKs(companion2, ChaloTheme.b(composer4, 0).g), composer4, 0);
                            TextKt.c(fromToStopViewUIState.c, null, null, null, composer4, 0, 14);
                            composer4.endNode();
                            composer4.endNode();
                        }
                        composer4.endReplaceGroup();
                        ChaloSpacersKt.a(recentProductItemUISpec.c, composer4, 0);
                        TextKt.c(recentProductItemUIState2.i, null, null, null, composer4, 0, 14);
                        composer4.endNode();
                        TextUIState textUIState = recentProductItemUIState2.b;
                        if (textUIState == null) {
                            composer4.startReplaceGroup(1395816477);
                        } else {
                            composer4.startReplaceGroup(1395816478);
                            TextKt.c(textUIState, null, null, null, composer4, 0, 14);
                        }
                        composer4.endReplaceGroup();
                        composer4.endNode();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    } else {
                        composer2.skipToGroupEnd();
                    }
                    return Unit.f17538a;
                }
            }, composerStartRestartGroup, 54), composerStartRestartGroup, (i2 & 112) | 384, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            modifier2 = modifier;
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new rx0(recentProductItemUIState, modifier2, i, 1));
        }
    }
}
