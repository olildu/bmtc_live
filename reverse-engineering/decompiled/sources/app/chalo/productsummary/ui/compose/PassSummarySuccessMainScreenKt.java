package app.chalo.productsummary.ui.compose;

import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.ScrollKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material3.ScaffoldKt;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.AlphaKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import app.chalo.compose.BackHandlerKt;
import app.chalo.compose.StandardErrorScreenKt;
import app.chalo.compose.components.ChaloCircularLoadingBoxKt;
import app.chalo.compose.components.ChaloRoundedCardKt;
import app.chalo.compose.components.ChaloSpacersKt;
import app.chalo.compose.components.ChaloTextViewKt;
import app.chalo.compose.components.ComposeUtils_androidKt;
import app.chalo.compose.components.SpecialFeatureTagListComposableKt;
import app.chalo.compose.components.image.CommonImageKt;
import app.chalo.compose.components.text.TitleSubtitleViewKt;
import app.chalo.compose.theme.ChaloThemeKt;
import app.chalo.home.ui.history.uistate.ImageWithTextUiState;
import app.chalo.productsummary.ui.compose.components.ComponentSmallDividerKt;
import app.chalo.productsummary.ui.compose.components.FullScreenImageSectionKt;
import app.chalo.productsummary.ui.compose.components.UserProfileComponentKt;
import app.chalo.productsummary.ui.data.DocumentationUIState;
import app.chalo.productsummary.ui.data.FullScreenImageUIState;
import app.chalo.productsummary.ui.data.PassDetailInfoUIState;
import app.chalo.productsummary.ui.data.PassVerificationDocumentationUIState;
import app.chalo.productsummary.ui.data.ProductSummarySuccessScreenUISpec;
import app.chalo.productsummary.ui.data.TripHistoryCardUIState;
import app.chalo.productsummary.ui.data.UserInfoUIState;
import app.chalo.productsummary.ui.pass.PassDetailUIState;
import app.chalo.productsummary.ui.pass.PassSummaryComponent;
import app.chalo.productsummary.ui.pass.PassSummaryScreenType;
import app.chalo.productsummary.ui.pass.PassSummarySuccessScreenUIState;
import app.chalo.productsummary.ui.pass.PassSummaryViewState;
import app.chalo.productsummary.ui.pass.ProductDownloadInvoiceOptionUISpec;
import app.chalo.productsummary.ui.pass.ProductDownloadInvoiceOptionUIState;
import app.chalo.uistate.base.ChaloColorTokenKt;
import app.chalo.uistate.dialog.LoadingDialogUIState;
import app.chalo.uistate.image.ImageUIState;
import app.chalo.uistate.text.SpecialFeaturesTagListUIState;
import app.chalo.uistate.text.TextUIState;
import app.chalo.uistate.text.TitleSubtitleUiState;
import coil3.compose.SingletonSubcomposeAsyncImageKt;
import com.arkivanov.decompose.extensions.compose.SubscribeAsStateKt;
import defpackage.b3;
import defpackage.fk0;
import defpackage.g2;
import defpackage.kn0;
import defpackage.la0;
import defpackage.o4;
import defpackage.pk0;
import defpackage.t8;
import defpackage.u50;
import defpackage.up0;
import defpackage.y5;
import defpackage.zk0;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002¨\u0006\u0002²\u0006\f\u0010\u0001\u001a\u00020\u00008\nX\u008a\u0084\u0002"}, d2 = {"Lapp/chalo/productsummary/ui/pass/PassSummaryViewState;", "viewState", "home_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class PassSummarySuccessMainScreenKt {
    public static final void a(ProductDownloadInvoiceOptionUIState data, Composer composer, int i) {
        int i2;
        Composer composer2;
        Composer composer3;
        Intrinsics.i(data, "data");
        Object obj = data.f8785a;
        Composer composerStartRestartGroup = composer.startRestartGroup(12896309);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(data) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (composerStartRestartGroup.shouldExecute((i2 & 3) != 2, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(12896309, i2, -1, "app.chalo.productsummary.ui.compose.DownloadInvoiceOptionComposable (PassSummarySuccessMainScreen.kt:376)");
            }
            boolean zChanged = composerStartRestartGroup.changed(obj);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                composerStartRestartGroup.updateRememberedValue(obj);
            } else {
                obj = objRememberedValue;
            }
            ProductDownloadInvoiceOptionUISpec productDownloadInvoiceOptionUISpec = (ProductDownloadInvoiceOptionUISpec) obj;
            ImageWithTextUiState imageWithTextUiState = data.c;
            if (imageWithTextUiState == null) {
                composerStartRestartGroup.startReplaceGroup(1942058288);
                composerStartRestartGroup.endReplaceGroup();
                composer2 = composerStartRestartGroup;
            } else {
                composerStartRestartGroup.startReplaceGroup(1942058289);
                Modifier.Companion companion = Modifier.INSTANCE;
                Modifier modifierAlpha = AlphaKt.alpha(ChaloThemeKt.c(BackgroundKt.m264backgroundbw27NRU$default(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), ChaloColorTokenKt.c(productDownloadInvoiceOptionUISpec.c), null, 2, null), data.e), productDownloadInvoiceOptionUISpec.f8784a);
                Alignment.Companion companion2 = Alignment.INSTANCE;
                Alignment.Horizontal centerHorizontally = companion2.getCenterHorizontally();
                Arrangement arrangement = Arrangement.INSTANCE;
                MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(arrangement.getTop(), centerHorizontally, composerStartRestartGroup, 48);
                long currentCompositeKeyHashCode = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
                int i3 = (int) (currentCompositeKeyHashCode ^ (currentCompositeKeyHashCode >>> 32));
                CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierAlpha);
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
                boolean z = productDownloadInvoiceOptionUISpec.b;
                boolean zChangedInstance = composerStartRestartGroup.changedInstance(imageWithTextUiState);
                Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                if (zChangedInstance || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue2 = new kn0(imageWithTextUiState, 9);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                }
                Modifier modifierM299clickableoSLSa3U$default = ClickableKt.m299clickableoSLSa3U$default(companion, z, null, null, null, (Function0) objRememberedValue2, 14, null);
                MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(arrangement.getCenter(), companion2.getCenterVertically(), composerStartRestartGroup, 54);
                long currentCompositeKeyHashCode2 = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
                int i4 = (int) (currentCompositeKeyHashCode2 ^ (currentCompositeKeyHashCode2 >>> 32));
                CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierM299clickableoSLSa3U$default);
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
                ImageUIState imageUIState = imageWithTextUiState.b;
                if (imageUIState == null) {
                    composerStartRestartGroup.startReplaceGroup(-56196370);
                    composerStartRestartGroup.endReplaceGroup();
                    composer3 = composerStartRestartGroup;
                } else {
                    composerStartRestartGroup.startReplaceGroup(-56196369);
                    composer3 = composerStartRestartGroup;
                    CommonImageKt.a(imageUIState, null, false, composer3, 0, 6);
                    ChaloSpacersKt.w(composer3, 0);
                    composer3.endReplaceGroup();
                }
                Composer composer4 = composer3;
                ChaloTextViewKt.a(null, imageWithTextUiState.c, null, null, composer4, 0, 13);
                composer2 = composer4;
                composer2.endNode();
                TextUIState.ChaloTextUIState chaloTextUIState = data.b;
                if (chaloTextUIState == null) {
                    composer2.startReplaceGroup(419715925);
                } else {
                    composer2.startReplaceGroup(419715926);
                    ChaloSpacersKt.a(data.d, composer2, 0);
                    ChaloTextViewKt.a(null, chaloTextUIState, null, null, composer2, 0, 13);
                    composer2 = composer2;
                }
                composer2.endReplaceGroup();
                composer2.endNode();
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
            scopeUpdateScopeEndRestartGroup.updateScope(new fk0(data, i, 15));
        }
    }

    public static final void b(Modifier modifier, TextUIState.ChaloTextUIState chaloTextUIState, TextUIState.ChaloTextUIState chaloTextUIState2, TextUIState.ChaloTextUIState chaloTextUIState3, TextUIState.ChaloTextUIState chaloTextUIState4, SpecialFeaturesTagListUIState specialFeaturesTagListUIState, Composer composer, int i) {
        TextUIState.ChaloTextUIState chaloTextUIState5;
        Modifier modifier2;
        ComposeUiNode.Companion companion;
        int i2;
        Composer composer2;
        int i3;
        List list = specialFeaturesTagListUIState.f10083a;
        Composer composerStartRestartGroup = composer.startRestartGroup(-649366431);
        int i4 = i | 6;
        if ((i & 48) == 0) {
            i4 |= composerStartRestartGroup.changed(chaloTextUIState) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            chaloTextUIState5 = chaloTextUIState2;
            i4 |= composerStartRestartGroup.changed(chaloTextUIState5) ? 256 : 128;
        } else {
            chaloTextUIState5 = chaloTextUIState2;
        }
        if ((i & 3072) == 0) {
            i4 |= composerStartRestartGroup.changed(chaloTextUIState3) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i4 |= composerStartRestartGroup.changed(chaloTextUIState4) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i4 |= composerStartRestartGroup.changed(specialFeaturesTagListUIState) ? 131072 : 65536;
        }
        if (composerStartRestartGroup.shouldExecute((74899 & i4) != 74898, i4 & 1)) {
            Modifier.Companion companion2 = Modifier.INSTANCE;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-649366431, i4, -1, "app.chalo.productsummary.ui.compose.PassInfoDetailComponent (PassSummarySuccessMainScreen.kt:326)");
            }
            Arrangement arrangement = Arrangement.INSTANCE;
            Arrangement.Vertical top = arrangement.getTop();
            Alignment.Companion companion3 = Alignment.INSTANCE;
            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(top, companion3.getStart(), composerStartRestartGroup, 0);
            long currentCompositeKeyHashCode = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
            int i5 = (int) (currentCompositeKeyHashCode ^ (currentCompositeKeyHashCode >>> 32));
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, companion2);
            int i6 = i4;
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
            ChaloTextViewKt.a(null, chaloTextUIState, null, null, composerStartRestartGroup, i6 & 112, 13);
            composerStartRestartGroup.startReplaceGroup(465099822);
            ChaloSpacersKt.t(composerStartRestartGroup, 0);
            ChaloTextViewKt.a(null, chaloTextUIState5, null, null, composerStartRestartGroup, (i6 >> 3) & 112, 13);
            composerStartRestartGroup.endReplaceGroup();
            if (chaloTextUIState3 == null) {
                composerStartRestartGroup.startReplaceGroup(465226673);
                composerStartRestartGroup.endReplaceGroup();
                companion = companion4;
                i2 = 0;
                composer2 = composerStartRestartGroup;
                i3 = 1;
            } else {
                composerStartRestartGroup.startReplaceGroup(465226674);
                ChaloSpacersKt.t(composerStartRestartGroup, 0);
                companion = companion4;
                i2 = 0;
                composer2 = composerStartRestartGroup;
                i3 = 1;
                ChaloTextViewKt.a(null, chaloTextUIState3, null, null, composer2, (i6 >> 6) & 112, 13);
                composer2.endReplaceGroup();
            }
            if (chaloTextUIState4 == null && list.isEmpty()) {
                composer2.startReplaceGroup(452301751);
            } else {
                composer2.startReplaceGroup(15012964);
                ChaloSpacersKt.t(composer2, i2);
            }
            composer2.endReplaceGroup();
            Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(companion2, 0.0f, i3, null);
            MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(arrangement.getStart(), companion3.getCenterVertically(), composer2, 48);
            long currentCompositeKeyHashCode2 = ComposablesKt.getCurrentCompositeKeyHashCode(composer2, i2);
            int i7 = (int) (currentCompositeKeyHashCode2 ^ (currentCompositeKeyHashCode2 >>> 32));
            CompositionLocalMap currentCompositionLocalMap2 = composer2.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(composer2, modifierFillMaxWidth$default);
            Function0<ComposeUiNode> constructor2 = companion.getConstructor();
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
            pk0.v(companion, composerM3915constructorimpl2, measurePolicyRowMeasurePolicy, composerM3915constructorimpl2, currentCompositionLocalMap2);
            Updater.m3923setimpl(composerM3915constructorimpl2, modifierMaterializeModifier2, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion, composerM3915constructorimpl2, Integer.valueOf(i7), composerM3915constructorimpl2));
            RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
            if (chaloTextUIState4 == null) {
                composer2.startReplaceGroup(661872953);
                composer2.endReplaceGroup();
                composerStartRestartGroup = composer2;
            } else {
                composer2.startReplaceGroup(661872954);
                ChaloTextViewKt.a(null, chaloTextUIState4, null, null, composer2, (i6 >> 9) & 112, 13);
                composerStartRestartGroup = composer2;
                if (list.isEmpty()) {
                    composerStartRestartGroup.startReplaceGroup(-1339848803);
                } else {
                    composerStartRestartGroup.startReplaceGroup(-1326450851);
                    ChaloSpacersKt.B(composerStartRestartGroup, i2);
                }
                composerStartRestartGroup.endReplaceGroup();
                composerStartRestartGroup.endReplaceGroup();
            }
            SpecialFeatureTagListComposableKt.b(specialFeaturesTagListUIState, 0, composerStartRestartGroup, (i6 >> 15) & 14, 2);
            composerStartRestartGroup.endNode();
            composerStartRestartGroup.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            modifier2 = companion2;
        } else {
            composerStartRestartGroup.skipToGroupEnd();
            modifier2 = modifier;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new g2(modifier2, (Object) chaloTextUIState, (Object) chaloTextUIState2, (Object) chaloTextUIState3, (Object) chaloTextUIState4, (Object) specialFeaturesTagListUIState, i, 10));
        }
    }

    public static final void c(Modifier modifier, PassDetailUIState passDetailUIState, Composer composer, int i) {
        int i2;
        Composer composerStartRestartGroup = composer.startRestartGroup(-207873741);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changed(modifier) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(passDetailUIState) ? 32 : 16;
        }
        if (composerStartRestartGroup.shouldExecute((i2 & 19) != 18, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-207873741, i2, -1, "app.chalo.productsummary.ui.compose.PassInfoUIStateComponent (PassSummarySuccessMainScreen.kt:230)");
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
            PassDetailInfoUIState passDetailInfoUIState = passDetailUIState.f8766a;
            TripHistoryCardUIState tripHistoryCardUIState = passDetailUIState.d;
            if (passDetailInfoUIState == null) {
                composerStartRestartGroup.startReplaceGroup(314592696);
            } else {
                composerStartRestartGroup.startReplaceGroup(314592697);
                b(null, passDetailInfoUIState.f8753a, passDetailInfoUIState.d, passDetailInfoUIState.b, passDetailInfoUIState.c, passDetailInfoUIState.e, composerStartRestartGroup, 0);
                ComponentSmallDividerKt.a(composerStartRestartGroup, 0);
            }
            composerStartRestartGroup.endReplaceGroup();
            TitleSubtitleUiState titleSubtitleUiState = passDetailUIState.b;
            if (titleSubtitleUiState == null) {
                composerStartRestartGroup.startReplaceGroup(314987202);
            } else {
                composerStartRestartGroup.startReplaceGroup(314987203);
                TitleSubtitleViewKt.a(null, new TitleSubtitleUiState(null, titleSubtitleUiState.b, titleSubtitleUiState.c, null, 9), composerStartRestartGroup, 0, 1);
                ComponentSmallDividerKt.a(composerStartRestartGroup, 0);
            }
            composerStartRestartGroup.endReplaceGroup();
            UserInfoUIState userInfoUIState = passDetailUIState.c;
            if (userInfoUIState == null) {
                composerStartRestartGroup.startReplaceGroup(315273332);
            } else {
                composerStartRestartGroup.startReplaceGroup(315273333);
                if (userInfoUIState.c != null) {
                    composerStartRestartGroup.startReplaceGroup(222713171);
                    UserProfileComponentKt.a(null, userInfoUIState, composerStartRestartGroup, 0);
                } else {
                    composerStartRestartGroup.startReplaceGroup(212367138);
                }
                composerStartRestartGroup.endReplaceGroup();
            }
            composerStartRestartGroup.endReplaceGroup();
            PassVerificationDocumentationUIState passVerificationDocumentationUIState = passDetailUIState.e;
            composerStartRestartGroup.startReplaceGroup(315502175);
            if (passVerificationDocumentationUIState.f8754a.isEmpty()) {
                composerStartRestartGroup.startReplaceGroup(-1229137248);
            } else {
                composerStartRestartGroup.startReplaceGroup(-1218579671);
                ChaloSpacersKt.o(composerStartRestartGroup, 0);
                g(passVerificationDocumentationUIState, composerStartRestartGroup, 0);
            }
            composerStartRestartGroup.endReplaceGroup();
            composerStartRestartGroup.endReplaceGroup();
            if ((tripHistoryCardUIState != null ? tripHistoryCardUIState.d : null) == null) {
                composerStartRestartGroup.startReplaceGroup(315763411);
            } else {
                composerStartRestartGroup.startReplaceGroup(315763412);
                ChaloSpacersKt.o(composerStartRestartGroup, 0);
                h(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), tripHistoryCardUIState, composerStartRestartGroup, 6);
            }
            composerStartRestartGroup.endReplaceGroup();
            ChaloSpacersKt.s(null, 0, composerStartRestartGroup, 1);
            composerStartRestartGroup.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new zk0(modifier, passDetailUIState, i, 25));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void d(PassSummaryComponent passSummaryComponent, Composer composer, int i) {
        int i2;
        Composer composerStartRestartGroup = composer.startRestartGroup(-327873034);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(passSummaryComponent) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (composerStartRestartGroup.shouldExecute((i2 & 3) != 2, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-327873034, i2, -1, "app.chalo.productsummary.ui.compose.PassSummaryMainScreen (PassSummarySuccessMainScreen.kt:77)");
            }
            MutableState mutableStateA = SubscribeAsStateKt.a(passSummaryComponent.t0(), composerStartRestartGroup);
            boolean zChanged = composerStartRestartGroup.changed(mutableStateA);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new y5(mutableStateA, 16);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            BackHandlerKt.a(false, (Function0) objRememberedValue, 0, 0, composerStartRestartGroup, 3);
            ComposeUtils_androidKt.a(composerStartRestartGroup, 0);
            e((PassSummaryViewState) mutableStateA.getValue(), composerStartRestartGroup, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new fk0(passSummaryComponent, i, 12));
        }
    }

    public static final void e(PassSummaryViewState passSummaryViewState, Composer composer, int i) {
        int i2;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1026663996);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(passSummaryViewState) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (composerStartRestartGroup.shouldExecute((i2 & 3) != 2, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1026663996, i2, -1, "app.chalo.productsummary.ui.compose.PassSummaryMainScreenContent (PassSummarySuccessMainScreen.kt:94)");
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
            PassSummaryScreenType passSummaryScreenType = passSummaryViewState.b;
            LoadingDialogUIState loadingDialogUIState = passSummaryViewState.c;
            if (passSummaryScreenType instanceof PassSummaryScreenType.Error) {
                composerStartRestartGroup.startReplaceGroup(-1906078867);
                StandardErrorScreenKt.b(((PassSummaryScreenType.Error) passSummaryScreenType).f8777a, SizeKt.fillMaxSize$default(companion, 0.0f, 1, null), composerStartRestartGroup, 48);
                composerStartRestartGroup.endReplaceGroup();
            } else if (passSummaryScreenType instanceof PassSummaryScreenType.Loading) {
                composerStartRestartGroup.startReplaceGroup(-1906072685);
                ChaloCircularLoadingBoxKt.a(null, composerStartRestartGroup, 0);
                composerStartRestartGroup.endReplaceGroup();
            } else {
                if (!(passSummaryScreenType instanceof PassSummaryScreenType.Success)) {
                    throw pk0.p(composerStartRestartGroup, -1906081514);
                }
                composerStartRestartGroup.startReplaceGroup(-1906070302);
                f((PassSummaryScreenType.Success) passSummaryScreenType, composerStartRestartGroup, 0);
                composerStartRestartGroup.endReplaceGroup();
            }
            if (loadingDialogUIState != null) {
                t8.m(composerStartRestartGroup, 1041465208, loadingDialogUIState, composerStartRestartGroup, 0);
            } else {
                composerStartRestartGroup.startReplaceGroup(1036675336);
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
            scopeUpdateScopeEndRestartGroup.updateScope(new fk0(passSummaryViewState, i, 13));
        }
    }

    public static final void f(PassSummaryScreenType.Success success, Composer composer, int i) {
        int i2;
        Composer composerStartRestartGroup = composer.startRestartGroup(-919305906);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(success) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (composerStartRestartGroup.shouldExecute((i2 & 3) != 2, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-919305906, i2, -1, "app.chalo.productsummary.ui.compose.PassSummarySuccessMainScreen (PassSummarySuccessMainScreen.kt:118)");
            }
            PassSummarySuccessScreenUIState passSummarySuccessScreenUIState = success.f8779a;
            FullScreenImageUIState fullScreenImageUIState = success.b;
            boolean zChanged = composerStartRestartGroup.changed(passSummarySuccessScreenUIState);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = success.f8779a;
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            PassSummarySuccessScreenUIState passSummarySuccessScreenUIState2 = (PassSummarySuccessScreenUIState) objRememberedValue;
            boolean zChanged2 = composerStartRestartGroup.changed(passSummarySuccessScreenUIState2.f8780a);
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (zChanged2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue2 = passSummarySuccessScreenUIState2.f8780a;
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            ProductSummarySuccessScreenUISpec productSummarySuccessScreenUISpec = (ProductSummarySuccessScreenUISpec) objRememberedValue2;
            Modifier.Companion companion = Modifier.INSTANCE;
            Modifier modifierFillMaxSize$default = SizeKt.fillMaxSize$default(companion, 0.0f, 1, null);
            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
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
            pk0.v(companion2, composerM3915constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy, composerM3915constructorimpl, currentCompositionLocalMap);
            Updater.m3923setimpl(composerM3915constructorimpl, modifierMaterializeModifier, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion2, composerM3915constructorimpl, Integer.valueOf(i3), composerM3915constructorimpl));
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            ScaffoldKt.m2316ScaffoldTvnljyQ(SizeKt.fillMaxSize$default(companion, 0.0f, 1, null), ComposableLambdaKt.rememberComposableLambda(1470354372, true, new up0(passSummarySuccessScreenUIState2, 0), composerStartRestartGroup, 54), null, null, null, 0, 0L, 0L, null, ComposableLambdaKt.rememberComposableLambda(-1216792935, true, new u50(19, productSummarySuccessScreenUISpec, passSummarySuccessScreenUIState2), composerStartRestartGroup, 54), composerStartRestartGroup, 805306422, TypedValues.PositionType.TYPE_CURVE_FIT);
            if (fullScreenImageUIState != null) {
                composerStartRestartGroup.startReplaceGroup(1491311234);
                FullScreenImageSectionKt.a(fullScreenImageUIState, composerStartRestartGroup, 0);
            } else {
                composerStartRestartGroup.startReplaceGroup(1482042234);
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
            scopeUpdateScopeEndRestartGroup.updateScope(new fk0(success, i, 14));
        }
    }

    public static final void g(PassVerificationDocumentationUIState passVerificationDocumentationUIState, Composer composer, int i) {
        int i2;
        Composer composerStartRestartGroup = composer.startRestartGroup(2082363670);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(passVerificationDocumentationUIState) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        boolean z = true;
        int i3 = 0;
        if (composerStartRestartGroup.shouldExecute((i2 & 3) != 2, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(2082363670, i2, -1, "app.chalo.productsummary.ui.compose.PassVerificationProofComponent (PassSummarySuccessMainScreen.kt:284)");
            }
            Modifier modifierHorizontalScroll$default = ScrollKt.horizontalScroll$default(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), ScrollKt.rememberScrollState(0, composerStartRestartGroup, 0, 1), false, null, false, 14, null);
            MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), Alignment.INSTANCE.getTop(), composerStartRestartGroup, 0);
            long currentCompositeKeyHashCode = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
            int i4 = (int) (currentCompositeKeyHashCode ^ (currentCompositeKeyHashCode >>> 32));
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierHorizontalScroll$default);
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
            composerStartRestartGroup.startReplaceGroup(305714129);
            ArrayList arrayList = passVerificationDocumentationUIState.f8754a;
            int size = arrayList.size();
            int i5 = 0;
            while (i5 < size) {
                DocumentationUIState documentationUIState = (DocumentationUIState) arrayList.get(i5);
                int i6 = i3;
                SingletonSubcomposeAsyncImageKt.a(documentationUIState.f8750a.f10037a, null, null, null, ComposableLambdaKt.rememberComposableLambda(-992675173, z, new o4(documentationUIState, 10), composerStartRestartGroup, 54), null, null, null, null, null, composerStartRestartGroup, 196656, 0, 65500);
                ChaloSpacersKt.w(composerStartRestartGroup, i6);
                i3 = i6;
                i5++;
                size = size;
                arrayList = arrayList;
                z = z;
            }
            if (b3.t(composerStartRestartGroup)) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new fk0(passVerificationDocumentationUIState, i, 11));
        }
    }

    public static final void h(Modifier modifier, TripHistoryCardUIState tripHistoryCardUIState, Composer composer, int i) {
        int i2;
        Composer composerStartRestartGroup = composer.startRestartGroup(1155267134);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changed(modifier) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(tripHistoryCardUIState) ? 32 : 16;
        }
        if (composerStartRestartGroup.shouldExecute((i2 & 19) != 18, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1155267134, i2, -1, "app.chalo.productsummary.ui.compose.ViewTripHistoryComponent (PassSummarySuccessMainScreen.kt:357)");
            }
            ChaloRoundedCardKt.b(BackgroundKt.m264backgroundbw27NRU$default(modifier, ChaloColorTokenKt.c(tripHistoryCardUIState.b), null, 2, null), ChaloThemeKt.d(tripHistoryCardUIState.c), 0.0f, 0.0f, ComposableLambdaKt.rememberComposableLambda(-1744388737, true, new la0(tripHistoryCardUIState, 13), composerStartRestartGroup, 54), composerStartRestartGroup, 24576, 12);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new zk0(modifier, tripHistoryCardUIState, i, 24));
        }
    }
}
