package app.chalo.instantticket.ui.instantticketscreen.compose;

import androidx.compose.animation.core.AnimateAsStateKt;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.IndicationNodeFactory;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.text.ClickableTextKt;
import androidx.compose.material3.TextKt;
import androidx.compose.material3.Typography;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.AlphaKt;
import androidx.compose.ui.graphics.Shadow;
import androidx.compose.ui.graphics.drawscope.DrawStyle;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.platform.UriHandler;
import androidx.compose.ui.text.AnnotatedString;
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
import androidx.compose.ui.unit.TextUnitKt;
import androidx.core.view.accessibility.AccessibilityEventCompat;
import app.chalo.compose.components.ChaloCircularProgressIndicatorKt;
import app.chalo.compose.components.ChaloRoundedCardKt;
import app.chalo.compose.components.RippleEffectKt;
import app.chalo.compose.components.buttons.ChaloFilledButtonKt;
import app.chalo.compose.resources.StringResourcesHelperKt;
import app.chalo.compose.theme.ChaloTheme;
import app.chalo.compose.theme.ChaloTypographyKt;
import app.chalo.instantticket.ui.instantticketscreen.WalletSubTextProperties;
import app.chalo.instantticket.ui.instantticketscreen.compose.PaymentBottomSheetComposableKt;
import app.chalo.providers.stringprovider.StringEnum;
import defpackage.ej0;
import defpackage.gf;
import defpackage.kb;
import defpackage.lh;
import defpackage.n20;
import defpackage.p80;
import defpackage.pk0;
import defpackage.r1;
import defpackage.vo1;
import defpackage.wl;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import okhttp3.internal.ws.WebSocketProtocol;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\b\n\u0002\u0010\u0007\n\u0002\b\u0002¨\u0006\u0002²\u0006\f\u0010\u0001\u001a\u00020\u00008\nX\u008a\u0084\u0002"}, d2 = {"", "alpha", "productbooking_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class PaymentBottomSheetComposableKt {
    public static final void a(WalletSubTextProperties walletSubText, String walletCTAString, boolean z, Function0 chaloWalletPaymentSelected, Composer composer, int i) {
        int i2;
        Intrinsics.i(walletSubText, "walletSubText");
        Intrinsics.i(walletCTAString, "walletCTAString");
        Intrinsics.i(chaloWalletPaymentSelected, "chaloWalletPaymentSelected");
        Composer composerStartRestartGroup = composer.startRestartGroup(-1292363278);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changed(walletSubText) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changed(walletCTAString) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= composerStartRestartGroup.changed(z) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(chaloWalletPaymentSelected) ? 2048 : 1024;
        }
        if (composerStartRestartGroup.shouldExecute((i2 & 1171) != 1170, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1292363278, i2, -1, "app.chalo.instantticket.ui.instantticketscreen.compose.ChaloWalletPaymentOptionCard (PaymentBottomSheetComposable.kt:194)");
            }
            composerStartRestartGroup.startReplaceGroup(-715552423);
            Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null);
            if (z) {
                composerStartRestartGroup.startReplaceGroup(1204739668);
                composerStartRestartGroup.endReplaceGroup();
            } else {
                composerStartRestartGroup.startReplaceGroup(1204460389);
                MutableInteractionSource mutableInteractionSourceB = RippleEffectKt.b(composerStartRestartGroup);
                IndicationNodeFactory indicationNodeFactoryA = RippleEffectKt.a(composerStartRestartGroup);
                boolean z2 = (i2 & 7168) == 2048;
                Object objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (z2 || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = new p80(chaloWalletPaymentSelected, 22);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                modifierFillMaxWidth$default = ClickableKt.m295clickableO2vRcR0$default(modifierFillMaxWidth$default, mutableInteractionSourceB, indicationNodeFactoryA, false, null, null, (Function0) objRememberedValue, 28, null);
                composerStartRestartGroup.endReplaceGroup();
            }
            Modifier modifier = modifierFillMaxWidth$default;
            composerStartRestartGroup.endReplaceGroup();
            ChaloRoundedCardKt.b(modifier, null, 0.0f, 0.0f, ComposableLambdaKt.rememberComposableLambda(-913389517, true, new n20(z, walletCTAString, walletSubText, 2), composerStartRestartGroup, 54), composerStartRestartGroup, 24576, 14);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new lh((Object) walletSubText, (Object) walletCTAString, z, chaloWalletPaymentSelected, i, 9));
        }
    }

    public static final void b(Function0 onlinePaymentSelectedHandler, Composer composer, int i) {
        int i2;
        Intrinsics.i(onlinePaymentSelectedHandler, "onlinePaymentSelectedHandler");
        Composer composerStartRestartGroup = composer.startRestartGroup(-1989390211);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(onlinePaymentSelectedHandler) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (composerStartRestartGroup.shouldExecute((i2 & 3) != 2, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1989390211, i2, -1, "app.chalo.instantticket.ui.instantticketscreen.compose.OnlinePaymentOptionCard (PaymentBottomSheetComposable.kt:274)");
            }
            Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null);
            MutableInteractionSource mutableInteractionSourceB = RippleEffectKt.b(composerStartRestartGroup);
            IndicationNodeFactory indicationNodeFactoryA = RippleEffectKt.a(composerStartRestartGroup);
            boolean z = (i2 & 14) == 4;
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (z || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new p80(onlinePaymentSelectedHandler, 23);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            ChaloRoundedCardKt.b(ClickableKt.m295clickableO2vRcR0$default(modifierFillMaxWidth$default, mutableInteractionSourceB, indicationNodeFactoryA, false, null, null, (Function0) objRememberedValue, 28, null), null, 0.0f, 0.0f, ComposableSingletons$PaymentBottomSheetComposableKt.f3962a, composerStartRestartGroup, 24576, 14);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new kb(i, 10, onlinePaymentSelectedHandler));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void c(final String amountEnteredInRupeeString, final WalletSubTextProperties walletSubText, final String walletCTAString, final boolean z, final Function0 chaloWalletPaymentSelected, Function0 onlinePaymentSelectedHandler, final boolean z2, final String activationDurationText, final boolean z3, final boolean z4, final boolean z5, String str, Composer composer, final int i, final int i2) {
        int i3;
        int i4;
        Function0 function0;
        String str2;
        Composer composer2;
        int i5;
        Intrinsics.i(amountEnteredInRupeeString, "amountEnteredInRupeeString");
        Intrinsics.i(walletSubText, "walletSubText");
        Intrinsics.i(walletCTAString, "walletCTAString");
        Intrinsics.i(chaloWalletPaymentSelected, "chaloWalletPaymentSelected");
        Intrinsics.i(onlinePaymentSelectedHandler, "onlinePaymentSelectedHandler");
        Intrinsics.i(activationDurationText, "activationDurationText");
        Composer composerStartRestartGroup = composer.startRestartGroup(1835221622);
        if ((i & 6) == 0) {
            i3 = i | (composerStartRestartGroup.changed(amountEnteredInRupeeString) ? 4 : 2);
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changed(walletSubText) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= composerStartRestartGroup.changed(walletCTAString) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i3 |= composerStartRestartGroup.changed(z) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(chaloWalletPaymentSelected) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(onlinePaymentSelectedHandler) ? 131072 : 65536;
        }
        if ((i & 1572864) == 0) {
            i3 |= composerStartRestartGroup.changed(z2) ? 1048576 : 524288;
        }
        if ((i & 12582912) == 0) {
            i3 |= composerStartRestartGroup.changed(activationDurationText) ? 8388608 : 4194304;
        }
        if ((i & 100663296) == 0) {
            i3 |= composerStartRestartGroup.changed(z3) ? AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL : 33554432;
        }
        if ((i & 805306368) == 0) {
            i3 |= composerStartRestartGroup.changed(z4) ? 536870912 : 268435456;
        }
        int i6 = i3;
        if ((i2 & 6) == 0) {
            i4 = i2 | (composerStartRestartGroup.changed(z5) ? 4 : 2);
        } else {
            i4 = i2;
        }
        if ((i2 & 48) == 0) {
            i4 |= composerStartRestartGroup.changed(str) ? 32 : 16;
        }
        int i7 = i4;
        if (composerStartRestartGroup.shouldExecute(((i6 & 306783379) == 306783378 && (i7 & 19) == 18) ? false : true, i6 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1835221622, i6, i7, "app.chalo.instantticket.ui.instantticketscreen.compose.PaymentBottomSheet (PaymentBottomSheetComposable.kt:63)");
            }
            State<Float> stateAnimateFloatAsState = AnimateAsStateKt.animateFloatAsState(z5 ? 0.0f : 1.0f, null, 0.0f, null, null, composerStartRestartGroup, 0, 30);
            Modifier.Companion companion = Modifier.INSTANCE;
            Alignment.Companion companion2 = Alignment.INSTANCE;
            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(companion2.getTopStart(), false);
            long currentCompositeKeyHashCode = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
            int i8 = (int) (currentCompositeKeyHashCode ^ (currentCompositeKeyHashCode >>> 32));
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
            pk0.v(companion3, composerM3915constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy, composerM3915constructorimpl, currentCompositionLocalMap);
            Updater.m3923setimpl(composerM3915constructorimpl, modifierMaterializeModifier, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion3, composerM3915constructorimpl, Integer.valueOf(i8), composerM3915constructorimpl));
            ChaloCircularProgressIndicatorKt.b(AlphaKt.alpha(BoxScopeInstance.INSTANCE.align(companion, companion2.getCenter()), 1 - stateAnimateFloatAsState.getValue().floatValue()), 0.0f, composerStartRestartGroup, 0, 2);
            Alignment.Horizontal centerHorizontally = companion2.getCenterHorizontally();
            Modifier modifierAlpha = AlphaKt.alpha(PaddingKt.m785paddingVpY3zN4(companion, ChaloTheme.b(composerStartRestartGroup, 0).h, ChaloTheme.b(composerStartRestartGroup, 0).i), stateAnimateFloatAsState.getValue().floatValue());
            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), centerHorizontally, composerStartRestartGroup, 48);
            long currentCompositeKeyHashCode2 = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
            int i9 = (int) (currentCompositeKeyHashCode2 ^ (currentCompositeKeyHashCode2 >>> 32));
            CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierAlpha);
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
            Updater.m3923setimpl(composerM3915constructorimpl2, modifierMaterializeModifier2, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion3, composerM3915constructorimpl2, Integer.valueOf(i9), composerM3915constructorimpl2));
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
            TextKt.m2623TextNvy7gAk(StringResourcesHelperKt.c(StringEnum.TEXT_PAYING_FOR_TICKET, new Object[0], composerStartRestartGroup, 6), null, ChaloTheme.a(composerStartRestartGroup, 0).g, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ChaloTypographyKt.f(ChaloTheme.e(composerStartRestartGroup, 0)), composerStartRestartGroup, 0, 0, 131066);
            Modifier modifierM788paddingqDBjuR0$default = PaddingKt.m788paddingqDBjuR0$default(companion, 0.0f, ChaloTheme.b(composerStartRestartGroup, 0).f, 0.0f, 0.0f, 13, null);
            Typography typographyE = ChaloTheme.e(composerStartRestartGroup, 0);
            Intrinsics.i(typographyE, "<this>");
            TextKt.m2623TextNvy7gAk(amountEnteredInRupeeString, modifierM788paddingqDBjuR0$default, ChaloTheme.a(composerStartRestartGroup, 0).g, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, typographyE.getDisplayLarge(), composerStartRestartGroup, i6 & 14, 0, 131064);
            SpacerKt.Spacer(SizeKt.m814height3ABfNKs(companion, ChaloTheme.b(composerStartRestartGroup, 0).f), composerStartRestartGroup, 0);
            TextKt.m2623TextNvy7gAk(activationDurationText, null, ChaloTheme.a(composerStartRestartGroup, 0).g, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ChaloTypographyKt.c(ChaloTheme.e(composerStartRestartGroup, 0)), composerStartRestartGroup, (i6 >> 21) & 14, 0, 131066);
            composer2 = composerStartRestartGroup;
            SpacerKt.Spacer(SizeKt.m814height3ABfNKs(companion, ChaloTheme.b(composer2, 0).i), composer2, 0);
            if (z2) {
                composer2.startReplaceGroup(217833065);
                d(composer2, 0);
                SpacerKt.Spacer(SizeKt.m814height3ABfNKs(companion, ChaloTheme.b(composer2, 0).h), composer2, 0);
                d(composer2, 0);
                gf.r(companion, ChaloTheme.b(composer2, 0).i, composer2, 0);
                function0 = onlinePaymentSelectedHandler;
                i5 = 1;
            } else {
                composer2.startReplaceGroup(218094581);
                if (z3 || !z4) {
                    function0 = onlinePaymentSelectedHandler;
                    i5 = 1;
                    composer2.startReplaceGroup(218475664);
                    if (z3) {
                        composer2.startReplaceGroup(218512182);
                        a(walletSubText, walletCTAString, z, chaloWalletPaymentSelected, composer2, (i6 >> 3) & 8190);
                        gf.r(companion, ChaloTheme.b(composer2, 0).h, composer2, 0);
                    } else {
                        composer2.startReplaceGroup(213714064);
                        composer2.endReplaceGroup();
                    }
                    if (z4) {
                        composer2.startReplaceGroup(218922932);
                        b(function0, composer2, (i6 >> 15) & 14);
                        gf.r(companion, ChaloTheme.b(composer2, 0).i, composer2, 0);
                    } else {
                        composer2.startReplaceGroup(213714064);
                        composer2.endReplaceGroup();
                    }
                    composer2.endReplaceGroup();
                } else {
                    composer2.startReplaceGroup(218131750);
                    String strC = StringResourcesHelperKt.c(StringEnum.PAY_NOW, new Object[0], composer2, 6);
                    i5 = 1;
                    Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null);
                    Object[] objArr = (i6 & 458752) == 131072;
                    Object objRememberedValue = composer2.rememberedValue();
                    if (objArr == true || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                        function0 = onlinePaymentSelectedHandler;
                        objRememberedValue = new p80(function0, 21);
                        composer2.updateRememberedValue(objRememberedValue);
                    } else {
                        function0 = onlinePaymentSelectedHandler;
                    }
                    ChaloFilledButtonKt.g(modifierFillMaxWidth$default, strC, null, 0L, null, true, 0.0f, null, 0L, (Function0) objRememberedValue, composer2, 196614, 476);
                    composer2 = composer2;
                    gf.r(companion, ChaloTheme.b(composer2, 0).i, composer2, 0);
                }
                composer2.endReplaceGroup();
            }
            String strA = vo1.A(StringResourcesHelperKt.c(StringEnum.TNC_PREFIX, new Object[0], composer2, 6), " ");
            String strC2 = StringResourcesHelperKt.c(StringEnum.TNC_CLICKABLE_TEXT, new Object[0], composer2, 6);
            long j = ChaloTheme.a(composer2, 0).f1915a;
            long j2 = ChaloTheme.a(composer2, 0).i;
            boolean zF = StringsKt.F(str);
            int i10 = (composer2.changed(strA) ? 1 : 0) | (composer2.changed(strC2) ? 1 : 0) | ((i7 & 112) == 32 ? i5 : 0);
            Object objRememberedValue2 = composer2.rememberedValue();
            if (i10 != 0 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                AnnotatedString.Builder builder = new AnnotatedString.Builder(0, i5, null);
                FontWeight.Companion companion4 = FontWeight.INSTANCE;
                int iPushStyle = builder.pushStyle(new SpanStyle(j2, TextUnitKt.getSp(14), companion4.getNormal(), (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (PlatformSpanStyle) null, (DrawStyle) null, 65528, (DefaultConstructorMarker) null));
                try {
                    builder.append(strA);
                    builder.pop(iPushStyle);
                    FontWeight normal = companion4.getNormal();
                    long sp = TextUnitKt.getSp(14);
                    TextDecoration.Companion companion5 = TextDecoration.INSTANCE;
                    int iPushStyle2 = builder.pushStyle(new SpanStyle(j, sp, normal, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, !zF ? companion5.getUnderline() : companion5.getNone(), (Shadow) null, (PlatformSpanStyle) null, (DrawStyle) null, 61432, (DefaultConstructorMarker) null));
                    try {
                        builder.append(strC2);
                        builder.pop(iPushStyle2);
                        if (zF) {
                            str2 = str;
                        } else {
                            int iD = StringsKt.D(vo1.A(strA, strC2), strC2, 0, false, 6);
                            str2 = str;
                            builder.addStringAnnotation("URL", str2, iD, strC2.length() + iD);
                        }
                        objRememberedValue2 = builder.toAnnotatedString();
                        composer2.updateRememberedValue(objRememberedValue2);
                    } catch (Throwable th) {
                        builder.pop(iPushStyle2);
                        throw th;
                    }
                } catch (Throwable th2) {
                    builder.pop(iPushStyle);
                    throw th2;
                }
            } else {
                str2 = str;
            }
            AnnotatedString annotatedString = (AnnotatedString) objRememberedValue2;
            UriHandler uriHandler = (UriHandler) composer2.consume(CompositionLocalsKt.getLocalUriHandler());
            boolean zChanged = composer2.changed(annotatedString) | composer2.changedInstance(uriHandler);
            Object objRememberedValue3 = composer2.rememberedValue();
            if (zChanged || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue3 = new ej0(23, annotatedString, uriHandler);
                composer2.updateRememberedValue(objRememberedValue3);
            }
            ClickableTextKt.m1101ClickableText4YKlhWE(annotatedString, null, null, false, 0, 0, null, (Function1) objRememberedValue3, composer2, 0, WebSocketProtocol.PAYLOAD_SHORT);
            if (r1.k(composer2)) {
                ComposerKt.traceEventEnd();
            }
        } else {
            function0 = onlinePaymentSelectedHandler;
            str2 = str;
            composer2 = composerStartRestartGroup;
            composer2.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            final Function0 function1 = function0;
            final String str3 = str2;
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: gq0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(i | 1);
                    int iUpdateChangedFlags2 = RecomposeScopeImplKt.updateChangedFlags(i2);
                    PaymentBottomSheetComposableKt.c(amountEnteredInRupeeString, walletSubText, walletCTAString, z, chaloWalletPaymentSelected, function1, z2, activationDurationText, z3, z4, z5, str3, (Composer) obj, iUpdateChangedFlags, iUpdateChangedFlags2);
                    return Unit.f17538a;
                }
            });
        }
    }

    public static final void d(Composer composer, int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(1071298034);
        if (composerStartRestartGroup.shouldExecute(i != 0, i & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1071298034, i, -1, "app.chalo.instantticket.ui.instantticketscreen.compose.ShimmerCard (PaymentBottomSheetComposable.kt:308)");
            }
            ChaloRoundedCardKt.b(null, null, 0.0f, 0.0f, ComposableSingletons$PaymentBottomSheetComposableKt.b, composerStartRestartGroup, 24576, 15);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new wl(i, 10));
        }
    }
}
