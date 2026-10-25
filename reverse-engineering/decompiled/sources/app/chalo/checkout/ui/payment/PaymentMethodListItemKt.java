package app.chalo.checkout.ui.payment;

import android.graphics.drawable.Drawable;
import android.util.Base64;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.AlphaKt;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import app.chalo.checkout.data.model.ui.PaymentLogo;
import app.chalo.checkout.data.model.ui.PlatformDrawableAsset;
import app.chalo.checkout.ui.screen.payment.CardIconUIState;
import app.chalo.checkout.ui.screen.payment.CardLabelUiSpec;
import app.chalo.checkout.ui.screen.payment.CardLabelUiState;
import app.chalo.checkout.ui.screen.payment.ModeItemDetailsUiSpec;
import app.chalo.compose.components.ChaloTextViewKt;
import app.chalo.compose.components.PlotlineComposeWidgetKt;
import app.chalo.compose.components.image.CommonImageKt;
import app.chalo.compose.resources.PainterResourceHelperKt;
import app.chalo.compose.theme.ChaloThemeKt;
import app.chalo.providers.iconassetprovider.IconType;
import app.chalo.uistate.base.ChaloColorToken;
import app.chalo.uistate.base.ChaloColorTokenKt;
import app.chalo.uistate.base.UiAlignmentKt;
import app.chalo.uistate.base.UiArrangementKt;
import app.chalo.uistate.image.ImageUIState;
import app.chalo.uistate.image.ImageUIStateKt;
import app.chalo.uistate.image.UIContentScale;
import app.chalo.uistate.text.TextUIState;
import coil3.compose.SingletonAsyncImageKt;
import defpackage.er;
import defpackage.i41;
import defpackage.km;
import defpackage.pk0;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"checkout_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class PaymentMethodListItemKt {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v14, types: [java.lang.CharSequence, java.lang.Object, java.lang.String] */
    /* JADX WARN: Type inference failed for: r0v16 */
    /* JADX WARN: Type inference failed for: r0v18, types: [byte[]] */
    /* JADX WARN: Type inference failed for: r14v6, types: [java.lang.Object] */
    public static final void a(Modifier modifier, ModeItemDetailsUiSpec itemDetailsUiSpec, CardIconUIState cardIconUIState, TextUIState.ChaloTextUIState paymentMethodName, TextUIState.ChaloTextUIState chaloTextUIState, CardLabelUiState cardLabelUiState, TextUIState.ChaloTextUIState chaloTextUIState2, Composer composer, int i) {
        int i2;
        int i3;
        Intrinsics.i(itemDetailsUiSpec, "itemDetailsUiSpec");
        UIContentScale uIContentScale = itemDetailsUiSpec.i;
        Intrinsics.i(paymentMethodName, "paymentMethodName");
        Composer composerStartRestartGroup = composer.startRestartGroup(1016761893);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changed(modifier) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changed(itemDetailsUiSpec) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= composerStartRestartGroup.changed(cardIconUIState) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= composerStartRestartGroup.changed(paymentMethodName) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= composerStartRestartGroup.changed(chaloTextUIState) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= composerStartRestartGroup.changed(cardLabelUiState) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            i2 |= composerStartRestartGroup.changed(chaloTextUIState2) ? 1048576 : 524288;
        }
        if (composerStartRestartGroup.shouldExecute((599187 & i2) != 599186, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1016761893, i2, -1, "app.chalo.checkout.ui.payment.PaymentMethodItemDetail (PaymentMethodListItem.kt:76)");
            }
            Arrangement arrangement = Arrangement.INSTANCE;
            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(arrangement.getTop(), Alignment.INSTANCE.getStart(), composerStartRestartGroup, 0);
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
            pk0.v(companion, composerM3915constructorimpl, measurePolicyColumnMeasurePolicy, composerM3915constructorimpl, currentCompositionLocalMap);
            Updater.m3923setimpl(composerM3915constructorimpl, modifierMaterializeModifier, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion, composerM3915constructorimpl, Integer.valueOf(i4), composerM3915constructorimpl));
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
            Modifier.Companion companion2 = Modifier.INSTANCE;
            Modifier modifierAlpha = AlphaKt.alpha(companion2, itemDetailsUiSpec.c);
            MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(arrangement.getStart(), UiAlignmentKt.b(itemDetailsUiSpec.k), composerStartRestartGroup, 0);
            long currentCompositeKeyHashCode2 = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
            int i5 = (int) (currentCompositeKeyHashCode2 ^ (currentCompositeKeyHashCode2 >>> 32));
            CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierAlpha);
            Function0<ComposeUiNode> constructor2 = companion.getConstructor();
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
            pk0.v(companion, composerM3915constructorimpl2, measurePolicyRowMeasurePolicy, composerM3915constructorimpl2, currentCompositionLocalMap2);
            Updater.m3923setimpl(composerM3915constructorimpl2, modifierMaterializeModifier2, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion, composerM3915constructorimpl2, Integer.valueOf(i5), composerM3915constructorimpl2));
            RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
            Modifier modifierB = ImageUIStateKt.b(companion2, itemDetailsUiSpec.h);
            PaymentLogo paymentLogo = cardIconUIState != null ? cardIconUIState.f1506a : null;
            if (paymentLogo instanceof PaymentLogo.Icon) {
                composerStartRestartGroup.startReplaceGroup(-553426776);
                i3 = 0;
                ImageKt.Image(PainterResourceHelperKt.a(((PaymentLogo.Icon) cardIconUIState.f1506a).f1345a, composerStartRestartGroup, 0), "", modifierB, (Alignment) null, ImageUIStateKt.c(uIContentScale), 0.0f, (ColorFilter) null, composerStartRestartGroup, Painter.$stable | 48, 104);
                composerStartRestartGroup.endReplaceGroup();
            } else {
                i3 = 0;
                if (paymentLogo instanceof PaymentLogo.PlatformDrawable) {
                    composerStartRestartGroup.startReplaceGroup(-553024582);
                    PlatformDrawableAsset platformDrawableAsset = ((PaymentLogo.PlatformDrawable) cardIconUIState.f1506a).f1346a;
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-545665456, 0, -1, "app.chalo.checkout.ui.payment.platformDrawableModel (PaymentLogoModel.android.kt:19)");
                    }
                    Drawable drawable = platformDrawableAsset.f1349a;
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    composerStartRestartGroup.startReplaceGroup(-552878789);
                    SingletonAsyncImageKt.b(drawable, "", modifierB, null, PainterResourceHelperKt.a(IconType.UPI, composerStartRestartGroup, 6), ImageUIStateKt.c(uIContentScale), composerStartRestartGroup, (Painter.$stable << 12) | 48, 31720);
                    composerStartRestartGroup.endReplaceGroup();
                    composerStartRestartGroup.endReplaceGroup();
                } else if (paymentLogo instanceof PaymentLogo.Url) {
                    composerStartRestartGroup.startReplaceGroup(-552444045);
                    ?? url = ((PaymentLogo.Url) cardIconUIState.f1506a).f1347a;
                    Intrinsics.i(url, "url");
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1519992068, 0, -1, "app.chalo.checkout.ui.payment.paymentLogoModelForUrl (PaymentLogoModel.android.kt:6)");
                    }
                    try {
                        if (StringsKt.m(url, "base64,", false)) {
                            url = Base64.decode(StringsKt.e0(url, "base64,", url), 0);
                        }
                    } catch (Exception unused) {
                    }
                    ?? r14 = url;
                    Intrinsics.f(r14);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    SingletonAsyncImageKt.a(r14, "", modifierB, ImageUIStateKt.c(uIContentScale), composerStartRestartGroup, 48, 1976);
                    composerStartRestartGroup.endReplaceGroup();
                } else {
                    if (paymentLogo != null) {
                        throw pk0.p(composerStartRestartGroup, -1403326792);
                    }
                    composerStartRestartGroup.startReplaceGroup(-552096287);
                    composerStartRestartGroup.endReplaceGroup();
                }
            }
            Modifier.Companion companion3 = Modifier.INSTANCE;
            SpacerKt.Spacer(SizeKt.m833width3ABfNKs(companion3, itemDetailsUiSpec.j), composerStartRestartGroup, i3);
            Arrangement arrangement2 = Arrangement.INSTANCE;
            MeasurePolicy measurePolicyColumnMeasurePolicy2 = ColumnKt.columnMeasurePolicy(arrangement2.getTop(), Alignment.INSTANCE.getStart(), composerStartRestartGroup, i3);
            long currentCompositeKeyHashCode3 = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, i3);
            int i6 = (int) (currentCompositeKeyHashCode3 ^ (currentCompositeKeyHashCode3 >>> 32));
            CompositionLocalMap currentCompositionLocalMap3 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier3 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, companion3);
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
            pk0.v(companion4, composerM3915constructorimpl3, measurePolicyColumnMeasurePolicy2, composerM3915constructorimpl3, currentCompositionLocalMap3);
            Updater.m3923setimpl(composerM3915constructorimpl3, modifierMaterializeModifier3, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion4, composerM3915constructorimpl3, Integer.valueOf(i6), composerM3915constructorimpl3));
            ColumnScopeInstance columnScopeInstance2 = ColumnScopeInstance.INSTANCE;
            MeasurePolicy measurePolicyRowMeasurePolicy2 = RowKt.rowMeasurePolicy(arrangement2.getStart(), UiAlignmentKt.b(itemDetailsUiSpec.l), composerStartRestartGroup, i3);
            long currentCompositeKeyHashCode4 = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, i3);
            int i7 = (int) (currentCompositeKeyHashCode4 ^ (currentCompositeKeyHashCode4 >>> 32));
            CompositionLocalMap currentCompositionLocalMap4 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier4 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, companion3);
            Function0<ComposeUiNode> constructor4 = companion4.getConstructor();
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
            pk0.v(companion4, composerM3915constructorimpl4, measurePolicyRowMeasurePolicy2, composerM3915constructorimpl4, currentCompositionLocalMap4);
            Updater.m3923setimpl(composerM3915constructorimpl4, modifierMaterializeModifier4, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion4, composerM3915constructorimpl4, Integer.valueOf(i7), composerM3915constructorimpl4));
            RowScopeInstance rowScopeInstance2 = RowScopeInstance.INSTANCE;
            int i8 = i2;
            ChaloTextViewKt.a(null, paymentMethodName, null, null, composerStartRestartGroup, (i2 >> 6) & 112, 13);
            if (cardLabelUiState == null) {
                composerStartRestartGroup.startReplaceGroup(233606752);
                composerStartRestartGroup.endReplaceGroup();
            } else {
                CardLabelUiSpec cardLabelUiSpec = cardLabelUiState.f1508a;
                composerStartRestartGroup.startReplaceGroup(233606753);
                SpacerKt.Spacer(SizeKt.m833width3ABfNKs(companion3, itemDetailsUiSpec.m), composerStartRestartGroup, i3);
                ChaloTextViewKt.a(ChaloThemeKt.c(BackgroundKt.m263backgroundbw27NRU(companion3, ChaloColorTokenKt.c(ChaloColorToken.LightOrangeSpf.f9817a), ChaloThemeKt.d(cardLabelUiSpec.b)), cardLabelUiSpec.f1507a), cardLabelUiState.b, null, null, composerStartRestartGroup, 0, 12);
                composerStartRestartGroup.endReplaceGroup();
            }
            composerStartRestartGroup.endNode();
            if (chaloTextUIState == null) {
                composerStartRestartGroup.startReplaceGroup(-1736257698);
            } else {
                composerStartRestartGroup.startReplaceGroup(-1736257697);
                SpacerKt.Spacer(SizeKt.m814height3ABfNKs(companion3, itemDetailsUiSpec.n), composerStartRestartGroup, i3);
                ChaloTextViewKt.a(null, chaloTextUIState, null, null, composerStartRestartGroup, (i8 >> 9) & 112, 13);
            }
            composerStartRestartGroup.endReplaceGroup();
            composerStartRestartGroup.endNode();
            composerStartRestartGroup.endNode();
            if (chaloTextUIState2 == null) {
                composerStartRestartGroup.startReplaceGroup(346996669);
            } else {
                composerStartRestartGroup.startReplaceGroup(346996670);
                SpacerKt.Spacer(SizeKt.m814height3ABfNKs(companion3, itemDetailsUiSpec.b), composerStartRestartGroup, i3);
                ChaloTextViewKt.a(null, chaloTextUIState2, null, null, composerStartRestartGroup, 0, 13);
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
            scopeUpdateScopeEndRestartGroup.updateScope(new km(modifier, itemDetailsUiSpec, cardIconUIState, paymentMethodName, chaloTextUIState, cardLabelUiState, chaloTextUIState2, i, 6));
        }
    }

    public static final void b(Modifier modifier, ModeItemDetailsUiSpec itemDetailsUiSpec, TextUIState.ChaloTextUIState paymentMethodName, CardIconUIState cardIconUIState, ImageUIState imageUIState, TextUIState.ChaloTextUIState chaloTextUIState, CardLabelUiState cardLabelUiState, TextUIState.ChaloTextUIState chaloTextUIState2, Composer composer, int i) {
        int i2;
        CardIconUIState cardIconUIState2;
        TextUIState.ChaloTextUIState chaloTextUIState3;
        CardLabelUiState cardLabelUiState2;
        TextUIState.ChaloTextUIState chaloTextUIState4;
        Intrinsics.i(itemDetailsUiSpec, "itemDetailsUiSpec");
        Intrinsics.i(paymentMethodName, "paymentMethodName");
        Composer composerStartRestartGroup = composer.startRestartGroup(-454317362);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changed(modifier) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changed(itemDetailsUiSpec) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= composerStartRestartGroup.changed(paymentMethodName) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            cardIconUIState2 = cardIconUIState;
            i2 |= composerStartRestartGroup.changed(cardIconUIState2) ? 2048 : 1024;
        } else {
            cardIconUIState2 = cardIconUIState;
        }
        if ((i & 24576) == 0) {
            i2 |= composerStartRestartGroup.changed(imageUIState) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            chaloTextUIState3 = chaloTextUIState;
            i2 |= composerStartRestartGroup.changed(chaloTextUIState3) ? 131072 : 65536;
        } else {
            chaloTextUIState3 = chaloTextUIState;
        }
        if ((1572864 & i) == 0) {
            cardLabelUiState2 = cardLabelUiState;
            i2 |= composerStartRestartGroup.changed(cardLabelUiState2) ? 1048576 : 524288;
        } else {
            cardLabelUiState2 = cardLabelUiState;
        }
        if ((12582912 & i) == 0) {
            chaloTextUIState4 = chaloTextUIState2;
            i2 |= composerStartRestartGroup.changed(chaloTextUIState4) ? 8388608 : 4194304;
        } else {
            chaloTextUIState4 = chaloTextUIState2;
        }
        int i3 = i2;
        if (composerStartRestartGroup.shouldExecute((4793491 & i3) != 4793490, i3 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-454317362, i3, -1, "app.chalo.checkout.ui.payment.PaymentMethodListItem (PaymentMethodListItem.kt:42)");
            }
            Alignment.Vertical verticalB = UiAlignmentKt.b(itemDetailsUiSpec.d);
            Arrangement.HorizontalOrVertical horizontalOrVerticalA = UiArrangementKt.a(itemDetailsUiSpec.e);
            Modifier modifierA = PlotlineComposeWidgetKt.a(BackgroundKt.m264backgroundbw27NRU$default(SizeKt.fillMaxWidth$default(modifier, 0.0f, 1, null), ChaloColorTokenKt.c(itemDetailsUiSpec.f1517a), null, 2, null), "PL_" + paymentMethodName);
            MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(horizontalOrVerticalA, verticalB, composerStartRestartGroup, 0);
            long currentCompositeKeyHashCode = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
            int i4 = (int) (currentCompositeKeyHashCode ^ (currentCompositeKeyHashCode >>> 32));
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierA);
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
            int i5 = i3 >> 3;
            int i6 = i3 << 3;
            a(i41.a(RowScopeInstance.INSTANCE, Modifier.INSTANCE, 1.0f, false, 2, null), itemDetailsUiSpec, cardIconUIState2, paymentMethodName, chaloTextUIState4, cardLabelUiState2, chaloTextUIState3, composerStartRestartGroup, (i3 & 112) | (i5 & 896) | (i6 & 7168) | ((i3 >> 9) & 57344) | (i5 & 458752) | (3670016 & i6));
            if (imageUIState != null) {
                composerStartRestartGroup.startReplaceGroup(214074362);
                CommonImageKt.a(imageUIState, null, false, composerStartRestartGroup, (i3 >> 12) & 14, 6);
            } else {
                composerStartRestartGroup.startReplaceGroup(211597400);
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
            scopeUpdateScopeEndRestartGroup.updateScope(new er(modifier, itemDetailsUiSpec, paymentMethodName, cardIconUIState, imageUIState, chaloTextUIState, cardLabelUiState, chaloTextUIState2, i, 3));
        }
    }
}
