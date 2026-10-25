package app.chalo.userprofile.ui.minprofileupdate.compose;

import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.ScrollKt;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.AspectRatioKt;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
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
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import app.chalo.compose.BackHandlerKt;
import app.chalo.compose.ChaloToolBarKt;
import app.chalo.compose.components.RippleEffectKt;
import app.chalo.compose.components.ShadowElementKt;
import app.chalo.compose.components.TextKt;
import app.chalo.compose.components.buttons.ChaloFilledButtonKt;
import app.chalo.compose.components.dialogs.ChaloDatePickerKt;
import app.chalo.compose.components.image.CommonImageKt;
import app.chalo.compose.components.textfields.BaseChaloTextFieldKt;
import app.chalo.compose.theme.ChaloTheme;
import app.chalo.compose.theme.ChaloThemeHelper;
import app.chalo.compose.theme.ChaloThemeKt;
import app.chalo.compose.theme.UIShape;
import app.chalo.uistate.base.BorderUISpec;
import app.chalo.uistate.base.BorderUISpecKt;
import app.chalo.uistate.base.ChaloColorToken;
import app.chalo.uistate.base.ChaloColorTokenKt;
import app.chalo.uistate.base.UiEventHandler;
import app.chalo.uistate.base.UiEventHandler$Companion$fromLambda$1;
import app.chalo.uistate.button.ButtonUIState;
import app.chalo.uistate.dialog.ConfirmationDialogUiState;
import app.chalo.uistate.dialog.LoadingDialogUIState;
import app.chalo.uistate.image.ImageUIState;
import app.chalo.uistate.text.TextUIState;
import app.chalo.uistate.textField.BaseTextFieldUIState;
import app.chalo.userprofile.ui.compose.UserProfileFormScreenKt;
import app.chalo.userprofile.ui.minprofileupdate.AgeInputFieldUISpec;
import app.chalo.userprofile.ui.minprofileupdate.AgeInputFieldUIState;
import app.chalo.userprofile.ui.minprofileupdate.AgeStepUISpec;
import app.chalo.userprofile.ui.minprofileupdate.GenderOptionCardUISpec;
import app.chalo.userprofile.ui.minprofileupdate.GenderOptionCardUIState;
import app.chalo.userprofile.ui.minprofileupdate.GenderStepUISpec;
import app.chalo.userprofile.ui.minprofileupdate.MinProfileUpdateComponent;
import app.chalo.userprofile.ui.minprofileupdate.MinProfileUpdateDialogType;
import app.chalo.userprofile.ui.minprofileupdate.MinProfileUpdateScreenSpecs;
import app.chalo.userprofile.ui.minprofileupdate.MinProfileUpdateStepUIState;
import app.chalo.userprofile.ui.minprofileupdate.MinProfileUpdateViewState;
import com.arkivanov.decompose.extensions.compose.SubscribeAsStateKt;
import defpackage.b3;
import defpackage.bj0;
import defpackage.dd;
import defpackage.dq;
import defpackage.fc0;
import defpackage.gf;
import defpackage.i41;
import defpackage.pk0;
import defpackage.r1;
import defpackage.sm;
import defpackage.t8;
import defpackage.ug0;
import defpackage.zi0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.reflect.KFunction;
import okhttp3.internal.ws.WebSocketProtocol;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002¨\u0006\u0002²\u0006\f\u0010\u0001\u001a\u00020\u00008\nX\u008a\u0084\u0002"}, d2 = {"Lapp/chalo/userprofile/ui/minprofileupdate/MinProfileUpdateViewState;", "viewState", "login_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class MinProfileUpdateScreenKt {
    public static final void a(AgeInputFieldUIState ageInputFieldUIState, Composer composer, int i) {
        int i2;
        Composer composer2;
        Composer composerStartRestartGroup = composer.startRestartGroup(147458287);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changed(ageInputFieldUIState) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (composerStartRestartGroup.shouldExecute((i2 & 3) != 2, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(147458287, i2, -1, "app.chalo.userprofile.ui.minprofileupdate.compose.AgeInputField (MinProfileUpdateScreen.kt:319)");
            }
            Modifier.Companion companion = Modifier.INSTANCE;
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
            ComposableLambda composableLambdaRememberComposableLambda = null;
            BaseTextFieldUIState baseTextFieldUIState = ageInputFieldUIState.f10377a;
            AgeInputFieldUISpec ageInputFieldUISpec = ageInputFieldUIState.d;
            Modifier modifierC = ChaloThemeKt.c(BorderUISpecKt.a(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), new BorderUISpec(ChaloThemeHelper.a().b, baseTextFieldUIState.getH() ? ChaloColorToken.OrangePrimary.f9835a : ChaloColorToken.Orange2.f9830a, UIShape.d)), ageInputFieldUISpec.f10376a);
            ImageUIState f = baseTextFieldUIState.getF();
            if (f == null) {
                composerStartRestartGroup.startReplaceGroup(-836417692);
            } else {
                composerStartRestartGroup.startReplaceGroup(-836417691);
                composableLambdaRememberComposableLambda = ComposableLambdaKt.rememberComposableLambda(510345750, true, new sm(f, 1), composerStartRestartGroup, 54);
            }
            composerStartRestartGroup.endReplaceGroup();
            composer2 = composerStartRestartGroup;
            BaseChaloTextFieldKt.a(baseTextFieldUIState, modifierC, null, composableLambdaRememberComposableLambda, null, null, composer2, 0, 108);
            TextUIState textUIState = ageInputFieldUIState.b;
            if (textUIState == null) {
                composer2.startReplaceGroup(-836244960);
            } else {
                composer2.startReplaceGroup(-836244959);
                SpacerKt.Spacer(SizeKt.m814height3ABfNKs(companion, ageInputFieldUISpec.b), composer2, 0);
                TextKt.c(textUIState, null, null, null, composer2, 0, 14);
                composer2 = composer2;
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
            scopeUpdateScopeEndRestartGroup.updateScope(new fc0(ageInputFieldUIState, i, 24));
        }
    }

    public static final void b(MinProfileUpdateStepUIState.AgeStepUIState ageStepUIState, Modifier modifier, Composer composer, int i) {
        int i2;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1422726080);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changed(ageStepUIState) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        int i3 = 16;
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changed(modifier) ? 32 : 16;
        }
        if (composerStartRestartGroup.shouldExecute((i2 & 19) != 18, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1422726080, i2, -1, "app.chalo.userprofile.ui.minprofileupdate.compose.AgeStep (MinProfileUpdateScreen.kt:271)");
            }
            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composerStartRestartGroup, 0);
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
            TextUIState textUIState = ageStepUIState.f10407a;
            AgeStepUISpec ageStepUISpec = ageStepUIState.f;
            i(textUIState, ageStepUIState.c, composerStartRestartGroup, 0);
            Modifier.Companion companion2 = Modifier.INSTANCE;
            float f = ageStepUISpec.f10378a;
            float f2 = ageStepUISpec.f10378a;
            SpacerKt.Spacer(SizeKt.m814height3ABfNKs(companion2, f), composerStartRestartGroup, 0);
            AgeInputFieldUIState ageInputFieldUIState = ageStepUIState.d;
            if (ageInputFieldUIState == null) {
                composerStartRestartGroup.startReplaceGroup(-1055002324);
                composerStartRestartGroup.endReplaceGroup();
            } else {
                composerStartRestartGroup.startReplaceGroup(-1055002323);
                a(ageInputFieldUIState, composerStartRestartGroup, 0);
                SpacerKt.Spacer(SizeKt.m814height3ABfNKs(companion2, f2), composerStartRestartGroup, 0);
                i(ageStepUIState.b, null, composerStartRestartGroup, 48);
                gf.r(companion2, f2, composerStartRestartGroup, 0);
            }
            a(ageStepUIState.e, composerStartRestartGroup, 0);
            composerStartRestartGroup.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new ug0(ageStepUIState, modifier, i, i3));
        }
    }

    public static final void c(GenderOptionCardUIState genderOptionCardUIState, Modifier modifier, Composer composer, int i) {
        int i2;
        Composer composer2;
        Composer composerStartRestartGroup = composer.startRestartGroup(1050633146);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changed(genderOptionCardUIState) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changed(modifier) ? 32 : 16;
        }
        if (composerStartRestartGroup.shouldExecute((i2 & 19) != 18, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1050633146, i2, -1, "app.chalo.userprofile.ui.minprofileupdate.compose.GenderOptionCard (MinProfileUpdateScreen.kt:232)");
            }
            BorderUISpec borderUISpec = genderOptionCardUIState.e;
            GenderOptionCardUISpec genderOptionCardUISpec = genderOptionCardUIState.g;
            Modifier modifierM263backgroundbw27NRU = BackgroundKt.m263backgroundbw27NRU(BorderUISpecKt.a(modifier, borderUISpec), ChaloColorTokenKt.c(genderOptionCardUIState.d), ChaloThemeKt.d(genderOptionCardUIState.e.c));
            MutableInteractionSource mutableInteractionSourceB = RippleEffectKt.b(composerStartRestartGroup);
            UiEventHandler$Companion$fromLambda$1 uiEventHandler$Companion$fromLambda$1 = genderOptionCardUIState.f;
            boolean zChangedInstance = composerStartRestartGroup.changedInstance(uiEventHandler$Companion$fromLambda$1);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new MinProfileUpdateScreenKt$GenderOptionCard$1$1(0, uiEventHandler$Companion$fromLambda$1, UiEventHandler.class, "onClick", "onClick()V", 0);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            Modifier modifierC = ChaloThemeKt.c(AspectRatioKt.aspectRatio$default(ClickableKt.m295clickableO2vRcR0$default(modifierM263backgroundbw27NRU, mutableInteractionSourceB, null, false, null, null, (Function0) ((KFunction) objRememberedValue), 28, null), 1.05f, false, 2, null), genderOptionCardUISpec.f10379a);
            Alignment.Companion companion = Alignment.INSTANCE;
            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), companion.getCenterHorizontally(), composerStartRestartGroup, 48);
            long currentCompositeKeyHashCode = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
            int i3 = (int) (currentCompositeKeyHashCode ^ (currentCompositeKeyHashCode >>> 32));
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierC);
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
            TextKt.c(genderOptionCardUIState.f10380a, null, null, null, composerStartRestartGroup, 0, 14);
            Modifier.Companion companion3 = Modifier.INSTANCE;
            SpacerKt.Spacer(SizeKt.m814height3ABfNKs(companion3, genderOptionCardUISpec.b), composerStartRestartGroup, 0);
            Modifier modifierA = dq.a(columnScopeInstance, companion3, 1.0f, false, 2, null);
            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(companion.getCenter(), false);
            long currentCompositeKeyHashCode2 = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
            int i4 = (int) (currentCompositeKeyHashCode2 ^ (currentCompositeKeyHashCode2 >>> 32));
            CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierA);
            Function0<ComposeUiNode> constructor2 = companion2.getConstructor();
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
            pk0.v(companion2, composerM3915constructorimpl2, measurePolicyMaybeCachedBoxMeasurePolicy, composerM3915constructorimpl2, currentCompositionLocalMap2);
            Updater.m3923setimpl(composerM3915constructorimpl2, modifierMaterializeModifier2, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion2, composerM3915constructorimpl2, Integer.valueOf(i4), composerM3915constructorimpl2));
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            CommonImageKt.a(genderOptionCardUIState.b, AspectRatioKt.aspectRatio$default(SizeKt.m816heightInVpY3zN4$default(companion3, 0.0f, genderOptionCardUISpec.c, 1, null), 1.0f, false, 2, null), false, composerStartRestartGroup, 0, 4);
            composer2 = composerStartRestartGroup;
            if (r1.k(composer2)) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer2 = composerStartRestartGroup;
            composer2.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new ug0(genderOptionCardUIState, modifier, i, 12));
        }
    }

    public static final void d(MinProfileUpdateStepUIState.GenderStepUIState genderStepUIState, Modifier modifier, Composer composer, int i) {
        int i2;
        Composer composerStartRestartGroup = composer.startRestartGroup(-145921574);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changed(genderStepUIState) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        char c = ' ';
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changed(modifier) ? 32 : 16;
        }
        int i3 = 1;
        if (composerStartRestartGroup.shouldExecute((i2 & 19) != 18, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-145921574, i2, -1, "app.chalo.userprofile.ui.minprofileupdate.compose.GenderStep (MinProfileUpdateScreen.kt:193)");
            }
            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composerStartRestartGroup, 0);
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
            TextUIState textUIState = genderStepUIState.f10408a;
            GenderStepUISpec genderStepUISpec = genderStepUIState.d;
            i(textUIState, genderStepUIState.b, composerStartRestartGroup, 0);
            SpacerKt.Spacer(SizeKt.m814height3ABfNKs(Modifier.INSTANCE, genderStepUISpec.f10381a), composerStartRestartGroup, 0);
            composerStartRestartGroup.startReplaceGroup(-13095432);
            ArrayList arrayListU = CollectionsKt.u(genderStepUIState.c, 2);
            int size = arrayListU.size();
            int i5 = 0;
            int i6 = 0;
            while (i6 < size) {
                Object obj = arrayListU.get(i6);
                int i7 = i6 + 1;
                int i8 = i5 + 1;
                if (i5 < 0) {
                    CollectionsKt.z0();
                    throw null;
                }
                List list = (List) obj;
                if (i5 > 0) {
                    composerStartRestartGroup.startReplaceGroup(209037140);
                    gf.r(Modifier.INSTANCE, genderStepUISpec.c, composerStartRestartGroup, 0);
                } else {
                    composerStartRestartGroup.startReplaceGroup(201851929);
                    composerStartRestartGroup.endReplaceGroup();
                }
                Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, i3, null);
                MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.m672spacedBy0680j_4(genderStepUISpec.b), Alignment.INSTANCE.getTop(), composerStartRestartGroup, 0);
                long currentCompositeKeyHashCode2 = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
                int i9 = (int) (currentCompositeKeyHashCode2 ^ (currentCompositeKeyHashCode2 >>> c));
                CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierFillMaxWidth$default);
                ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
                Function0<ComposeUiNode> constructor2 = companion2.getConstructor();
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
                pk0.v(companion2, composerM3915constructorimpl2, measurePolicyRowMeasurePolicy, composerM3915constructorimpl2, currentCompositionLocalMap2);
                Updater.m3923setimpl(composerM3915constructorimpl2, modifierMaterializeModifier2, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion2, composerM3915constructorimpl2, Integer.valueOf(i9), composerM3915constructorimpl2));
                RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
                composerStartRestartGroup.startReplaceGroup(-1327169591);
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    c((GenderOptionCardUIState) it.next(), i41.a(rowScopeInstance, Modifier.INSTANCE, 1.0f, false, 2, null), composerStartRestartGroup, 0);
                }
                composerStartRestartGroup.endReplaceGroup();
                if (list.size() == 1) {
                    composerStartRestartGroup.startReplaceGroup(1807640391);
                    SpacerKt.Spacer(i41.a(rowScopeInstance, Modifier.INSTANCE, 1.0f, false, 2, null), composerStartRestartGroup, 0);
                } else {
                    composerStartRestartGroup.startReplaceGroup(1799919221);
                }
                composerStartRestartGroup.endReplaceGroup();
                composerStartRestartGroup.endNode();
                i3 = 1;
                i5 = i8;
                i6 = i7;
                c = ' ';
            }
            if (b3.t(composerStartRestartGroup)) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new ug0(genderStepUIState, modifier, i, 15));
        }
    }

    public static final void e(MinProfileUpdateViewState minProfileUpdateViewState, Composer composer, int i) {
        int i2;
        Composer composer2;
        int i3;
        float f;
        MinProfileUpdateViewState minProfileUpdateViewState2 = minProfileUpdateViewState;
        Composer composerStartRestartGroup = composer.startRestartGroup(2031353833);
        if ((i & 6) == 0) {
            i2 = i | (composerStartRestartGroup.changed(minProfileUpdateViewState2) ? 4 : 2);
        } else {
            i2 = i;
        }
        if (composerStartRestartGroup.shouldExecute((i2 & 3) != 2, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(2031353833, i2, -1, "app.chalo.userprofile.ui.minprofileupdate.compose.MinProfileUpdateContent (MinProfileUpdateScreen.kt:87)");
            }
            Modifier.Companion companion = Modifier.INSTANCE;
            Modifier modifierFillMaxSize$default = SizeKt.fillMaxSize$default(companion, 0.0f, 1, null);
            MinProfileUpdateScreenSpecs minProfileUpdateScreenSpecs = minProfileUpdateViewState2.f10410a;
            ButtonUIState buttonUIState = minProfileUpdateViewState2.f;
            Modifier modifierM264backgroundbw27NRU$default = BackgroundKt.m264backgroundbw27NRU$default(modifierFillMaxSize$default, ChaloColorTokenKt.c(minProfileUpdateScreenSpecs.f10406a), null, 2, null);
            Arrangement arrangement = Arrangement.INSTANCE;
            Arrangement.Vertical top = arrangement.getTop();
            Alignment.Companion companion2 = Alignment.INSTANCE;
            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(top, companion2.getStart(), composerStartRestartGroup, 0);
            long currentCompositeKeyHashCode = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
            int i4 = (int) (currentCompositeKeyHashCode ^ (currentCompositeKeyHashCode >>> 32));
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierM264backgroundbw27NRU$default);
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
            ChaloToolBarKt.b(minProfileUpdateViewState2.b, null, null, composerStartRestartGroup, 0, 14);
            Modifier modifierC = ChaloThemeKt.c(ScrollKt.verticalScroll$default(SizeKt.fillMaxWidth$default(dq.a(columnScopeInstance, companion, 1.0f, false, 2, null), 0.0f, 1, null), ScrollKt.rememberScrollState(0, composerStartRestartGroup, 0, 1), false, null, false, 14, null), minProfileUpdateScreenSpecs.b);
            MeasurePolicy measurePolicyColumnMeasurePolicy2 = ColumnKt.columnMeasurePolicy(arrangement.getTop(), companion2.getStart(), composerStartRestartGroup, 0);
            long currentCompositeKeyHashCode2 = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
            int i5 = (int) (currentCompositeKeyHashCode2 ^ (currentCompositeKeyHashCode2 >>> 32));
            CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierC);
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
            pk0.v(companion3, composerM3915constructorimpl2, measurePolicyColumnMeasurePolicy2, composerM3915constructorimpl2, currentCompositionLocalMap2);
            Updater.m3923setimpl(composerM3915constructorimpl2, modifierMaterializeModifier2, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion3, composerM3915constructorimpl2, Integer.valueOf(i5), composerM3915constructorimpl2));
            TextKt.c(minProfileUpdateViewState2.c, null, null, null, composerStartRestartGroup, 0, 14);
            SpacerKt.Spacer(SizeKt.m814height3ABfNKs(companion, minProfileUpdateScreenSpecs.c), composerStartRestartGroup, 0);
            TextKt.c(minProfileUpdateViewState2.d, null, null, null, composerStartRestartGroup, 0, 14);
            MinProfileUpdateStepUIState minProfileUpdateStepUIState = minProfileUpdateViewState2.e;
            if (minProfileUpdateStepUIState == null) {
                composerStartRestartGroup.startReplaceGroup(-868134091);
                composerStartRestartGroup.endReplaceGroup();
                f = 0.0f;
                i3 = 0;
            } else {
                composerStartRestartGroup.startReplaceGroup(-868134090);
                i3 = 0;
                SpacerKt.Spacer(SizeKt.m814height3ABfNKs(companion, minProfileUpdateScreenSpecs.d), composerStartRestartGroup, 0);
                f = 0.0f;
                g(minProfileUpdateStepUIState, SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), composerStartRestartGroup, 48);
                composerStartRestartGroup.endReplaceGroup();
            }
            SpacerKt.Spacer(SizeKt.m814height3ABfNKs(companion, ChaloTheme.b(composerStartRestartGroup, i3).i), composerStartRestartGroup, i3);
            composerStartRestartGroup.endNode();
            ShadowElementKt.a(SizeKt.m814height3ABfNKs(SizeKt.fillMaxWidth$default(companion, f, 1, null), minProfileUpdateScreenSpecs.h), 0L, ChaloColorTokenKt.c(minProfileUpdateScreenSpecs.i), composerStartRestartGroup, 0, 2);
            composer2 = composerStartRestartGroup;
            Modifier modifierC2 = ChaloThemeKt.c(BackgroundKt.m264backgroundbw27NRU$default(SizeKt.fillMaxWidth$default(companion, f, 1, null), ChaloColorTokenKt.c(minProfileUpdateScreenSpecs.e), null, 2, null), minProfileUpdateScreenSpecs.g);
            MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(arrangement.m672spacedBy0680j_4(minProfileUpdateScreenSpecs.f), companion2.getTop(), composer2, 0);
            long currentCompositeKeyHashCode3 = ComposablesKt.getCurrentCompositeKeyHashCode(composer2, 0);
            int i6 = (int) (currentCompositeKeyHashCode3 ^ (currentCompositeKeyHashCode3 >>> 32));
            CompositionLocalMap currentCompositionLocalMap3 = composer2.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier3 = ComposedModifierKt.materializeModifier(composer2, modifierC2);
            Function0<ComposeUiNode> constructor3 = companion3.getConstructor();
            if (composer2.getApplier() == null) {
                ComposablesKt.invalidApplier();
            }
            composer2.startReusableNode();
            if (composer2.getInserting()) {
                composer2.createNode(constructor3);
            } else {
                composer2.useNode();
            }
            Composer composerM3915constructorimpl3 = Updater.m3915constructorimpl(composer2);
            pk0.v(companion3, composerM3915constructorimpl3, measurePolicyRowMeasurePolicy, composerM3915constructorimpl3, currentCompositionLocalMap3);
            Updater.m3923setimpl(composerM3915constructorimpl3, modifierMaterializeModifier3, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion3, composerM3915constructorimpl3, Integer.valueOf(i6), composerM3915constructorimpl3));
            RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
            if (buttonUIState == null) {
                composer2.startReplaceGroup(979686985);
            } else {
                composer2.startReplaceGroup(979686986);
                ChaloFilledButtonKt.a(0, 0, composer2, i41.a(rowScopeInstance, companion, 0.9f, false, 2, null), buttonUIState);
            }
            composer2.endReplaceGroup();
            minProfileUpdateViewState2 = minProfileUpdateViewState;
            ChaloFilledButtonKt.a(0, 0, composer2, i41.a(rowScopeInstance, companion, buttonUIState != null ? 1.6f : 1.0f, false, 2, null), minProfileUpdateViewState2.g);
            composer2.endNode();
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
            scopeUpdateScopeEndRestartGroup.updateScope(new fc0(minProfileUpdateViewState2, i, 26));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void f(MinProfileUpdateComponent minProfileUpdateComponent, Composer composer, int i) {
        int i2;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1390070967);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(minProfileUpdateComponent) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (composerStartRestartGroup.shouldExecute((i2 & 3) != 2, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1390070967, i2, -1, "app.chalo.userprofile.ui.minprofileupdate.compose.MinProfileUpdateScreen (MinProfileUpdateScreen.kt:50)");
            }
            MutableState mutableStateA = SubscribeAsStateKt.a(minProfileUpdateComponent.t0(), composerStartRestartGroup);
            e((MinProfileUpdateViewState) mutableStateA.getValue(), composerStartRestartGroup, 0);
            LoadingDialogUIState loadingDialogUIState = ((MinProfileUpdateViewState) mutableStateA.getValue()).h;
            if (loadingDialogUIState == null) {
                composerStartRestartGroup.startReplaceGroup(470704966);
                composerStartRestartGroup.endReplaceGroup();
            } else {
                t8.m(composerStartRestartGroup, 470704967, loadingDialogUIState, composerStartRestartGroup, 0);
            }
            ConfirmationDialogUiState confirmationDialogUiState = ((MinProfileUpdateViewState) mutableStateA.getValue()).i;
            if (confirmationDialogUiState == null) {
                composerStartRestartGroup.startReplaceGroup(470790495);
                composerStartRestartGroup.endReplaceGroup();
            } else {
                dd.l(composerStartRestartGroup, 470790496, confirmationDialogUiState, composerStartRestartGroup, 0);
            }
            MinProfileUpdateDialogType.DobPicker dobPicker = ((MinProfileUpdateViewState) mutableStateA.getValue()).j;
            if (dobPicker == null) {
                composerStartRestartGroup.startReplaceGroup(470896949);
            } else {
                composerStartRestartGroup.startReplaceGroup(470896950);
                long j = dobPicker.f10391a;
                boolean zChangedInstance = composerStartRestartGroup.changedInstance(minProfileUpdateComponent);
                Object objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = new bj0(minProfileUpdateComponent, 10);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                Function0 function0 = (Function0) objRememberedValue;
                boolean zChangedInstance2 = composerStartRestartGroup.changedInstance(minProfileUpdateComponent);
                Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                if (zChangedInstance2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue2 = new zi0(minProfileUpdateComponent, 2);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                }
                Function1 function1 = (Function1) objRememberedValue2;
                boolean zChangedInstance3 = composerStartRestartGroup.changedInstance(minProfileUpdateComponent);
                Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                if (zChangedInstance3 || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue3 = new bj0(minProfileUpdateComponent, 11);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                }
                ChaloDatePickerKt.a(j, function0, function1, (Function0) objRememberedValue3, dobPicker.b, composerStartRestartGroup, 0);
                composerStartRestartGroup = composerStartRestartGroup;
            }
            composerStartRestartGroup.endReplaceGroup();
            boolean zChangedInstance4 = composerStartRestartGroup.changedInstance(minProfileUpdateComponent);
            Object objRememberedValue4 = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance4 || objRememberedValue4 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue4 = new bj0(minProfileUpdateComponent, 12);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
            }
            BackHandlerKt.a(false, (Function0) objRememberedValue4, 0, 0, composerStartRestartGroup, 3);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new fc0(minProfileUpdateComponent, i, 25));
        }
    }

    public static final void g(MinProfileUpdateStepUIState minProfileUpdateStepUIState, Modifier modifier, Composer composer, int i) {
        int i2;
        Composer composerStartRestartGroup = composer.startRestartGroup(1578657914);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changed(minProfileUpdateStepUIState) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changed(modifier) ? 32 : 16;
        }
        if (composerStartRestartGroup.shouldExecute((i2 & 19) != 18, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1578657914, i2, -1, "app.chalo.userprofile.ui.minprofileupdate.compose.MinProfileUpdateStep (MinProfileUpdateScreen.kt:152)");
            }
            if (minProfileUpdateStepUIState instanceof MinProfileUpdateStepUIState.ProfilePhotoStepUIState) {
                composerStartRestartGroup.startReplaceGroup(966806357);
                h((MinProfileUpdateStepUIState.ProfilePhotoStepUIState) minProfileUpdateStepUIState, modifier, composerStartRestartGroup, i2 & WebSocketProtocol.PAYLOAD_SHORT);
                composerStartRestartGroup.endReplaceGroup();
            } else if (minProfileUpdateStepUIState instanceof MinProfileUpdateStepUIState.GenderStepUIState) {
                composerStartRestartGroup.startReplaceGroup(966811215);
                d((MinProfileUpdateStepUIState.GenderStepUIState) minProfileUpdateStepUIState, modifier, composerStartRestartGroup, i2 & WebSocketProtocol.PAYLOAD_SHORT);
                composerStartRestartGroup.endReplaceGroup();
            } else {
                if (!(minProfileUpdateStepUIState instanceof MinProfileUpdateStepUIState.AgeStepUIState)) {
                    throw pk0.p(composerStartRestartGroup, 966803983);
                }
                composerStartRestartGroup.startReplaceGroup(966815788);
                b((MinProfileUpdateStepUIState.AgeStepUIState) minProfileUpdateStepUIState, modifier, composerStartRestartGroup, i2 & WebSocketProtocol.PAYLOAD_SHORT);
                composerStartRestartGroup.endReplaceGroup();
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new ug0(minProfileUpdateStepUIState, modifier, i, 14));
        }
    }

    public static final void h(MinProfileUpdateStepUIState.ProfilePhotoStepUIState profilePhotoStepUIState, Modifier modifier, Composer composer, int i) {
        int i2;
        Composer composerStartRestartGroup = composer.startRestartGroup(1361231770);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changed(profilePhotoStepUIState) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changed(modifier) ? 32 : 16;
        }
        if (composerStartRestartGroup.shouldExecute((i2 & 19) != 18, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1361231770, i2, -1, "app.chalo.userprofile.ui.minprofileupdate.compose.ProfilePhotoStep (MinProfileUpdateScreen.kt:173)");
            }
            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getCenterHorizontally(), composerStartRestartGroup, 48);
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
            i(profilePhotoStepUIState.f10409a, profilePhotoStepUIState.b, composerStartRestartGroup, 0);
            SpacerKt.Spacer(SizeKt.m814height3ABfNKs(Modifier.INSTANCE, profilePhotoStepUIState.d.f10411a), composerStartRestartGroup, 0);
            UserProfileFormScreenKt.e(null, profilePhotoStepUIState.c, composerStartRestartGroup, 0, 1);
            composerStartRestartGroup.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new ug0(profilePhotoStepUIState, modifier, i, 17));
        }
    }

    public static final void i(TextUIState textUIState, TextUIState textUIState2, Composer composer, int i) {
        int i2;
        TextUIState textUIState3;
        Composer composerStartRestartGroup = composer.startRestartGroup(-774262477);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? composerStartRestartGroup.changed(textUIState) : composerStartRestartGroup.changedInstance(textUIState) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= (i & 64) == 0 ? composerStartRestartGroup.changed(textUIState2) : composerStartRestartGroup.changedInstance(textUIState2) ? 32 : 16;
        }
        if (composerStartRestartGroup.shouldExecute((i2 & 19) != 18, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-774262477, i2, -1, "app.chalo.userprofile.ui.minprofileupdate.compose.StepQuestionHeader (MinProfileUpdateScreen.kt:303)");
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
            TextKt.c(textUIState, null, null, null, composerStartRestartGroup, i2 & 14, 14);
            if (textUIState2 == null) {
                composerStartRestartGroup.startReplaceGroup(1949598622);
                composerStartRestartGroup.endReplaceGroup();
                textUIState3 = textUIState2;
            } else {
                composerStartRestartGroup.startReplaceGroup(1949598623);
                SpacerKt.Spacer(SizeKt.m833width3ABfNKs(companion, ChaloTheme.b(composerStartRestartGroup, 0).d), composerStartRestartGroup, 0);
                textUIState3 = textUIState2;
                TextKt.c(textUIState3, null, null, null, composerStartRestartGroup, 0, 14);
                composerStartRestartGroup.endReplaceGroup();
            }
            composerStartRestartGroup.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            textUIState3 = textUIState2;
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new ug0(textUIState, textUIState3, i, 13));
        }
    }
}
