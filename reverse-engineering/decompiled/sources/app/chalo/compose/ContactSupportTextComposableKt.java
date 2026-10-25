package app.chalo.compose;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.unit.Dp;
import app.chalo.compose.components.ChaloSpacersKt;
import app.chalo.compose.components.ChaloTextViewKt;
import app.chalo.compose.components.ComposeUtilsKt;
import app.chalo.compose.components.image.CommonImageKt;
import app.chalo.compose.theme.ChaloThemeHelper;
import app.chalo.models.contactsupport.ContactSupportCtaUIState;
import app.chalo.models.contactsupport.ContactSupportUISpecs;
import app.chalo.models.contactsupport.ContactSupportUIState;
import app.chalo.providers.iconassetprovider.IconType;
import app.chalo.uistate.base.ChaloColorToken;
import app.chalo.uistate.base.UiAlignment;
import app.chalo.uistate.base.UiAlignmentKt;
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
import app.chalo.uistate.textwithleftandtrailingrighticon.TextWithLeftAndRightIconUIState;
import defpackage.fk;
import defpackage.fp;
import defpackage.j5;
import defpackage.pk0;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"chalo-base_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class ContactSupportTextComposableKt {
    public static final void a(Modifier modifier, ContactSupportUIState state, Composer composer, int i) {
        int i2;
        Intrinsics.i(state, "state");
        ContactSupportCtaUIState contactSupportCtaUIState = state.d;
        ContactSupportUISpecs contactSupportUISpecs = state.f5614a;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1585721817);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changed(modifier) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= (i & 64) == 0 ? composerStartRestartGroup.changed(state) : composerStartRestartGroup.changedInstance(state) ? 32 : 16;
        }
        if (composerStartRestartGroup.shouldExecute((i2 & 19) != 18, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1585721817, i2, -1, "app.chalo.compose.ContactSupportTextCtaComposable (ContactSupportTextComposable.kt:28)");
            }
            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), UiAlignmentKt.a(contactSupportUISpecs.f5613a), composerStartRestartGroup, 0);
            long currentCompositeKeyHashCode = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
            int i3 = (int) (currentCompositeKeyHashCode ^ (currentCompositeKeyHashCode >>> 32));
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifier);
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
            Updater.m3923setimpl(composerM3915constructorimpl, modifierMaterializeModifier, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion, composerM3915constructorimpl, Integer.valueOf(i3), composerM3915constructorimpl));
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
            if (state.b == null) {
                composerStartRestartGroup.startReplaceGroup(-1409712332);
            } else {
                composerStartRestartGroup.startReplaceGroup(-1409712331);
                CommonImageKt.a(state.b, null, false, composerStartRestartGroup, 0, 6);
                ChaloSpacersKt.b(contactSupportUISpecs.b, composerStartRestartGroup, 0);
            }
            composerStartRestartGroup.endReplaceGroup();
            ChaloTextViewKt.a(null, state.c, null, null, composerStartRestartGroup, 0, 13);
            composerStartRestartGroup = composerStartRestartGroup;
            ChaloSpacersKt.b(contactSupportUISpecs.c, composerStartRestartGroup, 0);
            TextWithLeftAndTrailingRightIconComponentKt.a(ComposeUtilsKt.b(Modifier.INSTANCE, contactSupportCtaUIState.b, composerStartRestartGroup, 6, 6), contactSupportCtaUIState.f5612a, composerStartRestartGroup, 0, 0);
            composerStartRestartGroup.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new fp(modifier, state, i, 20));
        }
    }

    public static final void b(Modifier modifier, IconType iconType, String supportTextString, String ctaTextString, Function0 ctaOnClick, Composer composer, int i, int i2) {
        int i3;
        Composer composer2;
        IconType iconType2;
        Composer composer3;
        Intrinsics.i(supportTextString, "supportTextString");
        Intrinsics.i(ctaTextString, "ctaTextString");
        Intrinsics.i(ctaOnClick, "ctaOnClick");
        Composer composerStartRestartGroup = composer.startRestartGroup(-198907208);
        if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changed(modifier) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i4 = i2 & 2;
        if (i4 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changed(iconType == null ? -1 : iconType.ordinal()) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= composerStartRestartGroup.changed(supportTextString) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i3 |= composerStartRestartGroup.changed(ctaTextString) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(ctaOnClick) ? 16384 : 8192;
        }
        int i5 = i3;
        if (composerStartRestartGroup.shouldExecute((i5 & 9363) != 9362, i5 & 1)) {
            IconType iconType3 = i4 != 0 ? null : iconType;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-198907208, i5, -1, "app.chalo.compose.ContactSupportTextCtaComposable (ContactSupportTextComposable.kt:56)");
            }
            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), UiAlignmentKt.a(UiAlignment.Horizontal.Center.f9884a), composerStartRestartGroup, 0);
            long currentCompositeKeyHashCode = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
            int i6 = (int) (currentCompositeKeyHashCode ^ (currentCompositeKeyHashCode >>> 32));
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
            Updater.m3923setimpl(composerM3915constructorimpl, modifierMaterializeModifier, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion, composerM3915constructorimpl, Integer.valueOf(i6), composerM3915constructorimpl));
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
            if (iconType3 == null) {
                composerStartRestartGroup.startReplaceGroup(-1478134669);
                composerStartRestartGroup.endReplaceGroup();
                composer3 = composerStartRestartGroup;
            } else {
                composerStartRestartGroup.startReplaceGroup(-1478134668);
                CommonImageKt.a(new ImageUIState(iconType3, (String) null, (ChaloColorToken) null, (ImageUISize) null, (UIContentScale) null, 0.0f, (UiEventHandler) null, 254), null, false, composerStartRestartGroup, 0, 6);
                composer3 = composerStartRestartGroup;
                ChaloSpacersKt.b(ChaloThemeHelper.a().g, composer3, 0);
                composer3.endReplaceGroup();
            }
            Composer composer4 = composer3;
            ChaloTextViewKt.a(null, new TextUIState.ChaloTextUIState(supportTextString, UITextStyle.BodySmall, ChaloColorToken.AlmostBlackColor.f9756a, 0, UITextAlign.Center, (UIFontWeight) null, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8152), null, null, composer4, 0, 13);
            ChaloSpacersKt.b(ChaloThemeHelper.a().f, composer4, 0);
            Modifier.Companion companion2 = Modifier.INSTANCE;
            boolean z = (i5 & 57344) == 16384;
            Object objRememberedValue = composer4.rememberedValue();
            if (z || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new fk(ctaOnClick, 14);
                composer4.updateRememberedValue(objRememberedValue);
            }
            composer2 = composer4;
            TextWithLeftAndTrailingRightIconComponentKt.a(ComposeUtilsKt.b(companion2, UiEventHandler.Companion.a((Function0) objRememberedValue), composer4, 6, 6), new TextWithLeftAndRightIconUIState(null, new TextUIState.ChaloTextUIState(ctaTextString, UITextStyle.HeadlineSmall, ChaloColorToken.OrangePrimary.f9835a, 0, (UITextAlign) null, UIFontWeight.Bold, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8120), new ImageUIState(IconType.IC_ORANGE_TINT_ARROW, (String) null, (ChaloColorToken) null, new ImageUISize(ChaloThemeHelper.a().h), (UIContentScale) null, 0.0f, (UiEventHandler) null, 246), 0.0f, Dp.m7276boximpl(ChaloThemeHelper.a().f), 9), composer2, 0, 0);
            composer2.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            iconType2 = iconType3;
        } else {
            composer2 = composerStartRestartGroup;
            composer2.skipToGroupEnd();
            iconType2 = iconType;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new j5(modifier, (Object) iconType2, (Object) supportTextString, (Object) ctaTextString, (Object) ctaOnClick, i, i2, 3));
        }
    }
}
