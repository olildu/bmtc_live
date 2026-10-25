package app.chalo.ncmc.ui.landing.compose;

import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.interaction.InteractionSourceKt;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material3.CardDefaults;
import androidx.compose.material3.CardKt;
import androidx.compose.material3.IconKt;
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
import androidx.compose.ui.draw.ShadowKt;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.unit.Dp;
import androidx.profileinstaller.ProfileVerifier;
import app.chalo.compose.components.ChaloRoundedCardKt;
import app.chalo.compose.components.ChaloSpacersKt;
import app.chalo.compose.components.buttons.ChaloFilledButtonKt;
import app.chalo.compose.resources.PainterResourceHelperKt;
import app.chalo.compose.resources.StringResourcesHelperKt;
import app.chalo.compose.theme.ChaloTheme;
import app.chalo.compose.theme.ChaloTypographyKt;
import app.chalo.providers.iconassetprovider.IconType;
import app.chalo.providers.stringprovider.StringEnum;
import app.chalo.uistate.base.ChaloColorToken;
import app.chalo.uistate.base.UiEventHandler;
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
import defpackage.d0;
import defpackage.f5;
import defpackage.h0;
import defpackage.hf;
import defpackage.li;
import defpackage.mi;
import defpackage.ni;
import defpackage.pk0;
import defpackage.t8;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"home_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class ChaloCardComposeItemsKt {
    public static final void a(Modifier modifier, String title, String description, Function0 function0, Composer composer, int i) {
        int i2;
        Intrinsics.i(title, "title");
        Intrinsics.i(description, "description");
        Composer composerStartRestartGroup = composer.startRestartGroup(23538650);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changed(modifier) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changed(title) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= composerStartRestartGroup.changed(description) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(function0) ? 2048 : 1024;
        }
        int i3 = i2;
        if (composerStartRestartGroup.shouldExecute((i3 & 1171) != 1170, i3 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(23538650, i3, -1, "app.chalo.ncmc.ui.landing.compose.CardUnsyncedRechargeBanner (ChaloCardComposeItems.kt:242)");
            }
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            Composer.Companion companion = Composer.INSTANCE;
            Object empty = companion.getEmpty();
            ChaloColorToken.Orange2 orange2 = ChaloColorToken.Orange2.f9830a;
            if (objRememberedValue == empty) {
                objRememberedValue = new ImageUIState(IconType.IC_ORANGE_ARROW_RIGHT, (String) null, orange2, (ImageUISize) null, (UIContentScale) null, 0.0f, (UiEventHandler) null, 250);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            ImageUIState imageUIState = (ImageUIState) objRememberedValue;
            String strC = StringResourcesHelperKt.c(StringEnum.KNOW_MORE, new Object[0], composerStartRestartGroup, 6);
            boolean zChanged = composerStartRestartGroup.changed(strC);
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (zChanged || objRememberedValue2 == companion.getEmpty()) {
                objRememberedValue2 = new TextUIState.ChaloTextUIState(strC, UITextStyle.BodyMedium, orange2, 0, (UITextAlign) null, UIFontWeight.Bold, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8120);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            TextUIState.ChaloTextUIState chaloTextUIState = (TextUIState.ChaloTextUIState) objRememberedValue2;
            Modifier modifierM785paddingVpY3zN4 = PaddingKt.m785paddingVpY3zN4(SizeKt.fillMaxWidth$default(BackgroundKt.m263backgroundbw27NRU(modifier, ChaloTheme.a(composerStartRestartGroup, 0).A0, ChaloTheme.d(composerStartRestartGroup, 0).c), 0.0f, 1, null), ChaloTheme.b(composerStartRestartGroup, 0).h, ChaloTheme.b(composerStartRestartGroup, 0).g);
            Arrangement arrangement = Arrangement.INSTANCE;
            Arrangement.Vertical top = arrangement.getTop();
            Alignment.Companion companion2 = Alignment.INSTANCE;
            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(top, companion2.getStart(), composerStartRestartGroup, 0);
            long currentCompositeKeyHashCode = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
            int i4 = (int) (currentCompositeKeyHashCode ^ (currentCompositeKeyHashCode >>> 32));
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierM785paddingVpY3zN4);
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
            Modifier.Companion companion4 = Modifier.INSTANCE;
            Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(companion4, 0.0f, 1, null);
            MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(arrangement.getStart(), companion2.getCenterVertically(), composerStartRestartGroup, 48);
            long currentCompositeKeyHashCode2 = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
            int i5 = (int) (currentCompositeKeyHashCode2 ^ (currentCompositeKeyHashCode2 >>> 32));
            CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierFillMaxWidth$default);
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
            IconKt.m2070Iconww6aTOc(PainterResourceHelperKt.a(IconType.IC_CALENDAR_BLACK, composerStartRestartGroup, 6), (String) null, SizeKt.m828size3ABfNKs(companion4, Dp.m7278constructorimpl(24)), ChaloTheme.a(composerStartRestartGroup, 0).e, composerStartRestartGroup, Painter.$stable | 432, 0);
            ChaloSpacersKt.w(composerStartRestartGroup, 0);
            TextKt.m2623TextNvy7gAk(title, null, ChaloTheme.a(composerStartRestartGroup, 0).t0, null, 0L, null, FontWeight.INSTANCE.getBold(), null, 0L, null, null, 0L, 0, false, 0, 0, null, ChaloTypographyKt.h(ChaloTheme.e(composerStartRestartGroup, 0)), composerStartRestartGroup, ((i3 >> 3) & 14) | 1572864, 0, 131002);
            composerStartRestartGroup.endNode();
            ChaloSpacersKt.m(composerStartRestartGroup, 0);
            TextKt.m2623TextNvy7gAk(description, null, ChaloTheme.a(composerStartRestartGroup, 0).t0, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ChaloTypographyKt.c(ChaloTheme.e(composerStartRestartGroup, 0)), composerStartRestartGroup, (i3 >> 6) & 14, 0, 131066);
            ChaloSpacersKt.a(ChaloTheme.b(composerStartRestartGroup, 0).h, composerStartRestartGroup, 0);
            ChaloFilledButtonKt.i(null, chaloTextUIState, imageUIState, function0, composerStartRestartGroup, (i3 & 7168) | 384, 1);
            composerStartRestartGroup = composerStartRestartGroup;
            composerStartRestartGroup.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new li(modifier, title, description, function0, i, 0));
        }
    }

    public static final void b(Modifier modifier, Function2 content, int i, Composer composer, int i2) {
        int i3;
        Composer composer2;
        Modifier modifier2;
        Intrinsics.i(content, "content");
        Composer composerStartRestartGroup = composer.startRestartGroup(-268545300);
        if ((i & 48) == 0) {
            i3 = i | (composerStartRestartGroup.changedInstance(content) ? 32 : 16);
        } else {
            i3 = i;
        }
        if (composerStartRestartGroup.shouldExecute((i3 & 17) != 16, i3 & 1)) {
            Modifier modifier3 = (i2 & 1) != 0 ? Modifier.INSTANCE : modifier;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-268545300, i3, -1, "app.chalo.ncmc.ui.landing.compose.ChaloCardGradientBackgroundLayout (ChaloCardComposeItems.kt:193)");
            }
            Pair[] pairArr = {new Pair(Float.valueOf(0.0f), Color.m4595boximpl(ChaloTheme.a(composerStartRestartGroup, 0).F0)), new Pair(Float.valueOf(0.3f), Color.m4595boximpl(ChaloTheme.a(composerStartRestartGroup, 0).G0)), new Pair(Float.valueOf(1.0f), Color.m4595boximpl(ChaloTheme.a(composerStartRestartGroup, 0).F0))};
            Modifier modifierM4219shadows4CzXII$default = ShadowKt.m4219shadows4CzXII$default(SizeKt.m814height3ABfNKs(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), ChaloTheme.b(composerStartRestartGroup, 0).c0), Dp.m7278constructorimpl(10), ChaloTheme.d(composerStartRestartGroup, 0).i, false, ColorKt.Color(4288834832L), ColorKt.Color(4288834832L), 4, null);
            Shape shape = ChaloTheme.d(composerStartRestartGroup, 0).i;
            CardDefaults cardDefaults = CardDefaults.INSTANCE;
            float f = ChaloTheme.b(composerStartRestartGroup, 0).c;
            int i4 = CardDefaults.$stable;
            composer2 = composerStartRestartGroup;
            CardKt.Card(modifierM4219shadows4CzXII$default, shape, cardDefaults.m1694cardColorsro_MJ88(ChaloTheme.a(composerStartRestartGroup, 0).t, 0L, 0L, 0L, composerStartRestartGroup, i4 << 12, 14), cardDefaults.m1695cardElevationaqJV_2Y(f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, composerStartRestartGroup, i4 << 18, 62), null, ComposableLambdaKt.rememberComposableLambda(-427088418, true, new d0(7, pairArr, content), composer2, 54), composer2, ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE, 16);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            modifier2 = modifier3;
        } else {
            composer2 = composerStartRestartGroup;
            composer2.skipToGroupEnd();
            modifier2 = modifier;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new f5(modifier2, content, i, i2, 1));
        }
    }

    public static final void c(Modifier modifier, String str, String str2, String planType, String str3, Composer composer, int i) {
        Object obj;
        int i2;
        Object obj2;
        Object obj3;
        Intrinsics.i(planType, "planType");
        Composer composerStartRestartGroup = composer.startRestartGroup(-1257340217);
        if ((i & 6) == 0) {
            obj = modifier;
            i2 = (composerStartRestartGroup.changed(obj) ? 4 : 2) | i;
        } else {
            obj = modifier;
            i2 = i;
        }
        if ((i & 48) == 0) {
            obj2 = str;
            i2 |= composerStartRestartGroup.changed(obj2) ? 32 : 16;
        } else {
            obj2 = str;
        }
        if ((i & 384) == 0) {
            obj3 = str2;
            i2 |= composerStartRestartGroup.changed(obj3) ? 256 : 128;
        } else {
            obj3 = str2;
        }
        if ((i & 3072) == 0) {
            i2 |= composerStartRestartGroup.changed(planType) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= composerStartRestartGroup.changed(str3) ? 16384 : 8192;
        }
        if (composerStartRestartGroup.shouldExecute((i2 & 9363) != 9362, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1257340217, i2, -1, "app.chalo.ncmc.ui.landing.compose.ChaloCardPassItem (ChaloCardComposeItems.kt:112)");
            }
            ChaloRoundedCardKt.b(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), null, 0.0f, 0.0f, ComposableLambdaKt.rememberComposableLambda(1407008294, true, new ni(obj, obj2, obj3, planType, str3, 0), composerStartRestartGroup, 54), composerStartRestartGroup, 24582, 14);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new h0(modifier, str, str2, planType, str3, i, 7));
        }
    }

    public static final void d(int i, Composer composer, Modifier modifier, String title, String value) {
        Composer composer2;
        Modifier modifier2;
        Intrinsics.i(title, "title");
        Intrinsics.i(value, "value");
        Composer composerStartRestartGroup = composer.startRestartGroup(-1953831181);
        int i2 = i | 6;
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changed(title) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= composerStartRestartGroup.changed(value) ? 256 : 128;
        }
        if (composerStartRestartGroup.shouldExecute((i2 & 147) != 146, i2 & 1)) {
            Modifier.Companion companion = Modifier.INSTANCE;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1953831181, i2, -1, "app.chalo.ncmc.ui.landing.compose.ChaloCardTitleValueItem (ChaloCardComposeItems.kt:169)");
            }
            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composerStartRestartGroup, 0);
            long currentCompositeKeyHashCode = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
            int i3 = (int) ((currentCompositeKeyHashCode >>> 32) ^ currentCompositeKeyHashCode);
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
            Updater.m3923setimpl(composerM3915constructorimpl, modifierMaterializeModifier, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion2, composerM3915constructorimpl, Integer.valueOf(i3), composerM3915constructorimpl));
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
            TextStyle textStyleD = ChaloTypographyKt.d(ChaloTheme.e(composerStartRestartGroup, 0));
            modifier2 = companion;
            composer2 = composerStartRestartGroup;
            TextKt.m2623TextNvy7gAk(title, null, ChaloTheme.a(composerStartRestartGroup, 0).v0, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, textStyleD, composer2, (i2 >> 3) & 14, 0, 131066);
            ChaloSpacersKt.t(composer2, 0);
            TextKt.m2623TextNvy7gAk(value, null, ChaloTheme.a(composer2, 0).t0, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ChaloTypographyKt.g(ChaloTheme.e(composer2, 0)), composer2, (i2 >> 6) & 14, 0, 131066);
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
            scopeUpdateScopeEndRestartGroup.updateScope(new hf(modifier2, title, value, i, 1));
        }
    }

    /* JADX WARN: Code duplicated, block: B:101:0x017e  */
    /* JADX WARN: Code duplicated, block: B:104:0x018a  */
    /* JADX WARN: Code duplicated, block: B:105:0x018e  */
    /* JADX WARN: Code duplicated, block: B:108:0x01ed  */
    /* JADX WARN: Code duplicated, block: B:111:0x01f7  */
    /* JADX WARN: Code duplicated, block: B:114:0x0205  */
    /* JADX WARN: Code duplicated, block: B:116:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:54:0x009c  */
    /* JADX WARN: Code duplicated, block: B:56:0x00a2  */
    /* JADX WARN: Code duplicated, block: B:57:0x00a5  */
    /* JADX WARN: Code duplicated, block: B:61:0x00b4  */
    /* JADX WARN: Code duplicated, block: B:62:0x00b6  */
    /* JADX WARN: Code duplicated, block: B:65:0x00bf  */
    /* JADX WARN: Code duplicated, block: B:79:0x00e3 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:80:0x00e5  */
    /* JADX WARN: Code duplicated, block: B:81:0x00e8  */
    /* JADX WARN: Code duplicated, block: B:84:0x00ed  */
    /* JADX WARN: Code duplicated, block: B:85:0x00f8  */
    /* JADX WARN: Code duplicated, block: B:88:0x00fd  */
    /* JADX WARN: Code duplicated, block: B:90:0x0107  */
    /* JADX WARN: Code duplicated, block: B:91:0x010e  */
    /* JADX WARN: Code duplicated, block: B:94:0x011b  */
    /* JADX WARN: Code duplicated, block: B:97:0x012d  */
    public static final void e(Modifier modifier, String text, TextStyle textStyle, long j, Function2 function2, Function0 onTextClick, Composer composer, int i, int i2) {
        Modifier modifier2;
        int i3;
        TextStyle textStyle2;
        long j2;
        Function2 function3;
        boolean z;
        Composer composer2;
        Modifier modifier3;
        TextStyle textStyle3;
        long j3;
        Function2 function4;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Modifier modifier4;
        TextStyle textStyleH;
        TextStyle textStyle4;
        int i4;
        Function2 function5;
        Object objRememberedValue;
        int i5;
        Function0<ComposeUiNode> constructor;
        int i6;
        Intrinsics.i(text, "text");
        Intrinsics.i(onTextClick, "onTextClick");
        Composer composerStartRestartGroup = composer.startRestartGroup(-1920310949);
        int i7 = i2 & 1;
        if (i7 != 0) {
            i3 = i | 6;
            modifier2 = modifier;
        } else if ((i & 6) == 0) {
            modifier2 = modifier;
            i3 = (composerStartRestartGroup.changed(modifier2) ? 4 : 2) | i;
        } else {
            modifier2 = modifier;
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changed(text) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            if ((i2 & 4) == 0) {
                textStyle2 = textStyle;
                int i8 = composerStartRestartGroup.changed(textStyle2) ? 256 : 128;
                i3 |= i8;
            } else {
                textStyle2 = textStyle;
            }
            i3 |= i8;
        } else {
            textStyle2 = textStyle;
        }
        if ((i & 3072) == 0) {
            j2 = j;
            i3 |= ((i2 & 8) == 0 && composerStartRestartGroup.changed(j2)) ? 2048 : 1024;
        } else {
            j2 = j;
        }
        int i9 = i2 & 16;
        if (i9 == 0) {
            if ((i & 24576) == 0) {
                function3 = function2;
                i3 |= composerStartRestartGroup.changedInstance(function3) ? 16384 : 8192;
            }
            if ((196608 & i) == 0) {
                if (composerStartRestartGroup.changedInstance(onTextClick)) {
                    i6 = 131072;
                } else {
                    i6 = 65536;
                }
                i3 |= i6;
            }
            if ((74899 & i3) != 74898) {
                z = true;
            } else {
                z = false;
            }
            if (composerStartRestartGroup.shouldExecute(z, i3 & 1)) {
                composerStartRestartGroup.startDefaults();
                if ((i & 1) != 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                    if (i7 != 0) {
                        modifier4 = Modifier.INSTANCE;
                    } else {
                        modifier4 = modifier2;
                    }
                    if ((i2 & 4) != 0) {
                        textStyleH = ChaloTypographyKt.h(ChaloTheme.e(composerStartRestartGroup, 0));
                        i3 &= -897;
                    } else {
                        textStyleH = textStyle2;
                    }
                    if ((i2 & 8) != 0) {
                        j2 = ChaloTheme.a(composerStartRestartGroup, 0).B;
                        i3 &= -7169;
                    }
                    if (i9 != 0) {
                        textStyle4 = textStyleH;
                        i4 = i3;
                        function5 = ComposableSingletons$ChaloCardComposeItemsKt.f6383a;
                    } else {
                        textStyle4 = textStyleH;
                        i4 = i3;
                    }
                    long j4 = j2;
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1920310949, i4, -1, "app.chalo.ncmc.ui.landing.compose.TextWithRightArrow (ChaloCardComposeItems.kt:84)");
                    }
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    i5 = i4;
                    Modifier modifier5 = modifier4;
                    Modifier modifierM295clickableO2vRcR0$default = ClickableKt.m295clickableO2vRcR0$default(modifier5, (MutableInteractionSource) objRememberedValue, null, false, null, null, onTextClick, 28, null);
                    MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), Alignment.INSTANCE.getCenterVertically(), composerStartRestartGroup, 48);
                    long currentCompositeKeyHashCode = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
                    int i10 = (int) (currentCompositeKeyHashCode ^ (currentCompositeKeyHashCode >>> 32));
                    CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierM295clickableO2vRcR0$default);
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
                    pk0.v(companion, composerM3915constructorimpl, measurePolicyRowMeasurePolicy, composerM3915constructorimpl, currentCompositionLocalMap);
                    Updater.m3923setimpl(composerM3915constructorimpl, modifierMaterializeModifier, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion, composerM3915constructorimpl, Integer.valueOf(i10), composerM3915constructorimpl));
                    RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
                    TextKt.m2623TextNvy7gAk(text, null, j4, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, textStyle4, composerStartRestartGroup, (i5 >> 3) & 910, (i5 << 15) & 29360128, 131066);
                    composer2 = composerStartRestartGroup;
                    function3 = function5;
                    if (t8.w(composer2, (i5 >> 12) & 14, function3)) {
                        ComposerKt.traceEventEnd();
                    }
                    j3 = j4;
                    textStyle3 = textStyle4;
                    modifier3 = modifier5;
                } else {
                    composerStartRestartGroup.skipToGroupEnd();
                    if ((i2 & 4) != 0) {
                        i3 &= -897;
                    }
                    if ((i2 & 8) != 0) {
                        i3 &= -7169;
                    }
                    modifier4 = modifier2;
                    i4 = i3;
                    textStyle4 = textStyle2;
                }
                function5 = function3;
                long j5 = j2;
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1920310949, i4, -1, "app.chalo.ncmc.ui.landing.compose.TextWithRightArrow (ChaloCardComposeItems.kt:84)");
                }
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                i5 = i4;
                Modifier modifier6 = modifier4;
                Modifier modifierM295clickableO2vRcR0$default2 = ClickableKt.m295clickableO2vRcR0$default(modifier6, (MutableInteractionSource) objRememberedValue, null, false, null, null, onTextClick, 28, null);
                MeasurePolicy measurePolicyRowMeasurePolicy2 = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), Alignment.INSTANCE.getCenterVertically(), composerStartRestartGroup, 48);
                long currentCompositeKeyHashCode2 = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
                int i11 = (int) (currentCompositeKeyHashCode2 ^ (currentCompositeKeyHashCode2 >>> 32));
                CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierM295clickableO2vRcR0$default2);
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
                pk0.v(companion2, composerM3915constructorimpl2, measurePolicyRowMeasurePolicy2, composerM3915constructorimpl2, currentCompositionLocalMap2);
                Updater.m3923setimpl(composerM3915constructorimpl2, modifierMaterializeModifier2, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion2, composerM3915constructorimpl2, Integer.valueOf(i11), composerM3915constructorimpl2));
                RowScopeInstance rowScopeInstance2 = RowScopeInstance.INSTANCE;
                TextKt.m2623TextNvy7gAk(text, null, j5, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, textStyle4, composerStartRestartGroup, (i5 >> 3) & 910, (i5 << 15) & 29360128, 131066);
                composer2 = composerStartRestartGroup;
                function3 = function5;
                if (t8.w(composer2, (i5 >> 12) & 14, function3)) {
                    ComposerKt.traceEventEnd();
                }
                j3 = j5;
                textStyle3 = textStyle4;
                modifier3 = modifier6;
            } else {
                composer2 = composerStartRestartGroup;
                composer2.skipToGroupEnd();
                modifier3 = modifier2;
                textStyle3 = textStyle2;
                j3 = j2;
            }
            function4 = function3;
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new mi(modifier3, text, textStyle3, j3, function4, onTextClick, i, i2));
            }
        }
        i3 |= 24576;
        function3 = function2;
        if ((196608 & i) == 0) {
            if (composerStartRestartGroup.changedInstance(onTextClick)) {
                i6 = 131072;
            } else {
                i6 = 65536;
            }
            i3 |= i6;
        }
        if ((74899 & i3) != 74898) {
            z = true;
        } else {
            z = false;
        }
        if (composerStartRestartGroup.shouldExecute(z, i3 & 1)) {
            composerStartRestartGroup.startDefaults();
            if ((i & 1) != 0) {
                if (i7 != 0) {
                    modifier4 = Modifier.INSTANCE;
                } else {
                    modifier4 = modifier2;
                }
                if ((i2 & 4) != 0) {
                    textStyleH = ChaloTypographyKt.h(ChaloTheme.e(composerStartRestartGroup, 0));
                    i3 &= -897;
                } else {
                    textStyleH = textStyle2;
                }
                if ((i2 & 8) != 0) {
                    j2 = ChaloTheme.a(composerStartRestartGroup, 0).B;
                    i3 &= -7169;
                }
                if (i9 != 0) {
                    textStyle4 = textStyleH;
                    i4 = i3;
                    function5 = ComposableSingletons$ChaloCardComposeItemsKt.f6383a;
                } else {
                    textStyle4 = textStyleH;
                    i4 = i3;
                    function5 = function3;
                }
            } else {
                if (i7 != 0) {
                    modifier4 = Modifier.INSTANCE;
                } else {
                    modifier4 = modifier2;
                }
                if ((i2 & 4) != 0) {
                    textStyleH = ChaloTypographyKt.h(ChaloTheme.e(composerStartRestartGroup, 0));
                    i3 &= -897;
                } else {
                    textStyleH = textStyle2;
                }
                if ((i2 & 8) != 0) {
                    j2 = ChaloTheme.a(composerStartRestartGroup, 0).B;
                    i3 &= -7169;
                }
                if (i9 != 0) {
                    textStyle4 = textStyleH;
                    i4 = i3;
                    function5 = ComposableSingletons$ChaloCardComposeItemsKt.f6383a;
                } else {
                    textStyle4 = textStyleH;
                    i4 = i3;
                    function5 = function3;
                }
            }
            long j6 = j2;
            composerStartRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1920310949, i4, -1, "app.chalo.ncmc.ui.landing.compose.TextWithRightArrow (ChaloCardComposeItems.kt:84)");
            }
            objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            i5 = i4;
            Modifier modifier7 = modifier4;
            Modifier modifierM295clickableO2vRcR0$default3 = ClickableKt.m295clickableO2vRcR0$default(modifier7, (MutableInteractionSource) objRememberedValue, null, false, null, null, onTextClick, 28, null);
            MeasurePolicy measurePolicyRowMeasurePolicy3 = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), Alignment.INSTANCE.getCenterVertically(), composerStartRestartGroup, 48);
            long currentCompositeKeyHashCode3 = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
            int i12 = (int) (currentCompositeKeyHashCode3 ^ (currentCompositeKeyHashCode3 >>> 32));
            CompositionLocalMap currentCompositionLocalMap3 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier3 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierM295clickableO2vRcR0$default3);
            ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
            constructor = companion3.getConstructor();
            if (composerStartRestartGroup.getApplier() == null) {
                ComposablesKt.invalidApplier();
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.createNode(constructor);
            } else {
                composerStartRestartGroup.useNode();
            }
            Composer composerM3915constructorimpl3 = Updater.m3915constructorimpl(composerStartRestartGroup);
            pk0.v(companion3, composerM3915constructorimpl3, measurePolicyRowMeasurePolicy3, composerM3915constructorimpl3, currentCompositionLocalMap3);
            Updater.m3923setimpl(composerM3915constructorimpl3, modifierMaterializeModifier3, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion3, composerM3915constructorimpl3, Integer.valueOf(i12), composerM3915constructorimpl3));
            RowScopeInstance rowScopeInstance3 = RowScopeInstance.INSTANCE;
            TextKt.m2623TextNvy7gAk(text, null, j6, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, textStyle4, composerStartRestartGroup, (i5 >> 3) & 910, (i5 << 15) & 29360128, 131066);
            composer2 = composerStartRestartGroup;
            function3 = function5;
            if (t8.w(composer2, (i5 >> 12) & 14, function3)) {
                ComposerKt.traceEventEnd();
            }
            j3 = j6;
            textStyle3 = textStyle4;
            modifier3 = modifier7;
        } else {
            composer2 = composerStartRestartGroup;
            composer2.skipToGroupEnd();
            modifier3 = modifier2;
            textStyle3 = textStyle2;
            j3 = j2;
        }
        function4 = function3;
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new mi(modifier3, text, textStyle3, j3, function4, onTextClick, i, i2));
        }
    }
}
