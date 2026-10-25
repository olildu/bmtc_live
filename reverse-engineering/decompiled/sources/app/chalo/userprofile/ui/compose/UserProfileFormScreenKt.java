package app.chalo.userprofile.ui.compose;

import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.ScrollKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.OffsetKt;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
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
import androidx.compose.ui.draw.ClipKt;
import androidx.compose.ui.draw.ShadowKt;
import androidx.compose.ui.focus.FocusChangedModifierKt;
import androidx.compose.ui.focus.FocusManager;
import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.layout.ContentScale;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.CompositionLocalsKt;
import app.chalo.compose.BackHandlerKt;
import app.chalo.compose.ChaloToolBarKt;
import app.chalo.compose.components.ChaloLoadingDialogKt;
import app.chalo.compose.components.ChaloSpacersKt;
import app.chalo.compose.components.ChaloTextViewKt;
import app.chalo.compose.components.buttons.ChaloFilledButtonKt;
import app.chalo.compose.components.dialogs.ChaloDatePickerKt;
import app.chalo.compose.components.image.CommonImageKt;
import app.chalo.compose.components.text.TextFieldWithErrorKt;
import app.chalo.compose.components.userprofile.GenderCardSelectionKt;
import app.chalo.compose.resources.PainterResourceHelperKt;
import app.chalo.compose.theme.ChaloPadding;
import app.chalo.compose.theme.ChaloThemeKt;
import app.chalo.compose.theme.UIShape;
import app.chalo.providers.iconassetprovider.IconType;
import app.chalo.uistate.base.BorderUISpec;
import app.chalo.uistate.base.BorderUISpecKt;
import app.chalo.uistate.base.ChaloColorToken;
import app.chalo.uistate.base.ChaloColorTokenKt;
import app.chalo.uistate.base.UiAlignmentKt;
import app.chalo.uistate.base.UiEventHandler;
import app.chalo.uistate.base.UiEventHandler$Companion$fromLambda$1;
import app.chalo.uistate.dialog.ConfirmationDialogUiState;
import app.chalo.uistate.image.ImageUIState;
import app.chalo.uistate.text.TextUIState;
import app.chalo.uistate.userprofile.GenderCardSelectionSpec;
import app.chalo.uistate.userprofile.GenderCardSelectionUIState;
import app.chalo.uistate.userprofile.GenderCardSpec;
import app.chalo.uistate.userprofile.GenderCardUIState;
import app.chalo.userprofile.ui.ProfileFieldsSectionUIState;
import app.chalo.userprofile.ui.ProfileIconWithEditBtnUISpecs;
import app.chalo.userprofile.ui.ProfileIconWithEditBtnUIState;
import app.chalo.userprofile.ui.ProfileImageUIState;
import app.chalo.userprofile.ui.TextFieldSectionUISpecs;
import app.chalo.userprofile.ui.ToolbarAndProfilePicSectionUISpecs;
import app.chalo.userprofile.ui.ToolbarAndProfilePicSectionUIState;
import app.chalo.userprofile.ui.UserProfileFormComponent;
import app.chalo.userprofile.ui.UserProfileFormDialogType;
import app.chalo.userprofile.ui.UserProfileFormUIState;
import app.chalo.userprofile.ui.UserProfileTextField;
import coil3.compose.SingletonAsyncImageKt;
import coil3.compose.SingletonSubcomposeAsyncImageKt;
import com.arkivanov.decompose.extensions.compose.SubscribeAsStateKt;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import defpackage.cm1;
import defpackage.dd;
import defpackage.dq;
import defpackage.fl1;
import defpackage.o4;
import defpackage.pk0;
import defpackage.pn1;
import defpackage.sh1;
import defpackage.xa1;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KFunction;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002¨\u0006\u0002²\u0006\f\u0010\u0001\u001a\u00020\u00008\nX\u008a\u0084\u0002"}, d2 = {"Lapp/chalo/userprofile/ui/UserProfileFormUIState;", RemoteConfigConstants.ResponseFieldKey.STATE, "login_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class UserProfileFormScreenKt {
    public static final void a(UserProfileTextField uiState, Composer composer, int i) {
        int i2;
        Intrinsics.i(uiState, "uiState");
        Composer composerStartRestartGroup = composer.startRestartGroup(-387719525);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? composerStartRestartGroup.changed(uiState) : composerStartRestartGroup.changedInstance(uiState) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        boolean z = true;
        if (composerStartRestartGroup.shouldExecute((i2 & 3) != 2, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-387719525, i2, -1, "app.chalo.userprofile.ui.compose.LabelWithTextFieldComposable (UserProfileFormScreen.kt:221)");
            }
            Modifier.Companion companion = Modifier.INSTANCE;
            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composerStartRestartGroup, 0);
            long currentCompositeKeyHashCode = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
            int i3 = (int) (currentCompositeKeyHashCode ^ (currentCompositeKeyHashCode >>> 32));
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, companion);
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
            pk0.v(companion2, composerM3915constructorimpl, measurePolicyColumnMeasurePolicy, composerM3915constructorimpl, currentCompositionLocalMap);
            Updater.m3923setimpl(composerM3915constructorimpl, modifierMaterializeModifier, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion2, composerM3915constructorimpl, Integer.valueOf(i3), composerM3915constructorimpl));
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
            ChaloTextViewKt.a(null, uiState.b, null, null, composerStartRestartGroup, 0, 13);
            Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(ChaloThemeKt.c(companion, uiState.f10373a.f10374a), 0.0f, 1, null);
            if ((i2 & 14) != 4 && ((i2 & 8) == 0 || !composerStartRestartGroup.changedInstance(uiState))) {
                z = false;
            }
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (z || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new sh1(uiState, 26);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            TextFieldWithErrorKt.a(FocusChangedModifierKt.onFocusChanged(modifierFillMaxWidth$default, (Function1) objRememberedValue), uiState.c, composerStartRestartGroup, 0);
            composerStartRestartGroup.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new fl1(uiState, i, 18));
        }
    }

    public static final void b(ToolbarAndProfilePicSectionUIState uiState, Composer composer, int i) {
        int i2;
        Intrinsics.i(uiState, "uiState");
        ToolbarAndProfilePicSectionUISpecs toolbarAndProfilePicSectionUISpecs = uiState.f10342a;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1134069048);
        if ((i & 6) == 0) {
            i2 = i | (composerStartRestartGroup.changedInstance(uiState) ? 4 : 2);
        } else {
            i2 = i;
        }
        if (composerStartRestartGroup.shouldExecute((i2 & 3) != 2, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1134069048, i2, -1, "app.chalo.userprofile.ui.compose.ToolBarAndProfilePicSectionComposable (UserProfileFormScreen.kt:173)");
            }
            Modifier.Companion companion = Modifier.INSTANCE;
            Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null);
            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
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
            pk0.v(companion2, composerM3915constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy, composerM3915constructorimpl, currentCompositionLocalMap);
            Updater.m3923setimpl(composerM3915constructorimpl, modifierMaterializeModifier, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion2, composerM3915constructorimpl, Integer.valueOf(i3), composerM3915constructorimpl));
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            Modifier modifierMatchParentSize = boxScopeInstance.matchParentSize(companion);
            Brush.Companion companion3 = Brush.INSTANCE;
            List list = toolbarAndProfilePicSectionUISpecs.b;
            ArrayList arrayList = new ArrayList(CollectionsKt.v(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(Color.m4595boximpl(ChaloColorTokenKt.c((ChaloColorToken) it.next())));
            }
            BoxKt.Box(BackgroundKt.background$default(modifierMatchParentSize, Brush.Companion.m4560linearGradientmHitzGk$default(companion3, arrayList, 0L, 0L, 0, 14, (Object) null), null, 0.0f, 6, null), composerStartRestartGroup, 0);
            Painter painterA = PainterResourceHelperKt.a(IconType.USER_PROFILE_CONFETTI, composerStartRestartGroup, 6);
            Modifier.Companion companion4 = Modifier.INSTANCE;
            Modifier modifierMatchParentSize2 = boxScopeInstance.matchParentSize(companion4);
            ContentScale fillWidth = ContentScale.INSTANCE.getFillWidth();
            Alignment.Companion companion5 = Alignment.INSTANCE;
            ImageKt.Image(painterA, (String) null, modifierMatchParentSize2, companion5.getTopCenter(), fillWidth, 0.0f, (ColorFilter) null, composerStartRestartGroup, Painter.$stable | 27696, 96);
            Modifier modifierFillMaxWidth$default2 = SizeKt.fillMaxWidth$default(companion4, 0.0f, 1, null);
            Alignment.Horizontal centerHorizontally = companion5.getCenterHorizontally();
            Arrangement arrangement = Arrangement.INSTANCE;
            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(arrangement.getTop(), centerHorizontally, composerStartRestartGroup, 48);
            long currentCompositeKeyHashCode2 = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
            int i4 = (int) (currentCompositeKeyHashCode2 ^ (currentCompositeKeyHashCode2 >>> 32));
            CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierFillMaxWidth$default2);
            ComposeUiNode.Companion companion6 = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor2 = companion6.getConstructor();
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
            pk0.v(companion6, composerM3915constructorimpl2, measurePolicyColumnMeasurePolicy, composerM3915constructorimpl2, currentCompositionLocalMap2);
            Updater.m3923setimpl(composerM3915constructorimpl2, modifierMaterializeModifier2, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion6, composerM3915constructorimpl2, Integer.valueOf(i4), composerM3915constructorimpl2));
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
            ChaloToolBarKt.b(uiState.b, null, null, composerStartRestartGroup, 0, 14);
            composerStartRestartGroup = composerStartRestartGroup;
            Modifier modifierC = ChaloThemeKt.c(companion4, toolbarAndProfilePicSectionUISpecs.f10341a);
            MeasurePolicy measurePolicyColumnMeasurePolicy2 = ColumnKt.columnMeasurePolicy(arrangement.getTop(), companion5.getCenterHorizontally(), composerStartRestartGroup, 48);
            long currentCompositeKeyHashCode3 = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
            int i5 = (int) (currentCompositeKeyHashCode3 ^ (currentCompositeKeyHashCode3 >>> 32));
            CompositionLocalMap currentCompositionLocalMap3 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier3 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierC);
            Function0<ComposeUiNode> constructor3 = companion6.getConstructor();
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
            pk0.v(companion6, composerM3915constructorimpl3, measurePolicyColumnMeasurePolicy2, composerM3915constructorimpl3, currentCompositionLocalMap3);
            Updater.m3923setimpl(composerM3915constructorimpl3, modifierMaterializeModifier3, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion6, composerM3915constructorimpl3, Integer.valueOf(i5), composerM3915constructorimpl3));
            e(ChaloThemeKt.c(companion4, toolbarAndProfilePicSectionUISpecs.c), uiState.c, composerStartRestartGroup, 0, 0);
            ChaloTextViewKt.a(null, uiState.d, null, null, composerStartRestartGroup, 0, 13);
            ChaloSpacersKt.b(toolbarAndProfilePicSectionUISpecs.d, composerStartRestartGroup, 0);
            ChaloTextViewKt.a(null, uiState.e, null, null, composerStartRestartGroup, 0, 13);
            ChaloSpacersKt.b(toolbarAndProfilePicSectionUISpecs.e, composerStartRestartGroup, 0);
            ChaloSpacersKt.b(toolbarAndProfilePicSectionUISpecs.f, composerStartRestartGroup, 0);
            composerStartRestartGroup.endNode();
            composerStartRestartGroup.endNode();
            composerStartRestartGroup.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new fl1(uiState, i, 19));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void c(UserProfileFormComponent userProfileFormComponent, Composer composer, int i) {
        int i2;
        Composer composer2;
        Composer composerStartRestartGroup = composer.startRestartGroup(1072463228);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(userProfileFormComponent) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (composerStartRestartGroup.shouldExecute((i2 & 3) != 2, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1072463228, i2, -1, "app.chalo.userprofile.ui.compose.UserProfileFormMainScreen (UserProfileFormScreen.kt:63)");
            }
            MutableState mutableStateA = SubscribeAsStateKt.a(userProfileFormComponent.t0(), composerStartRestartGroup);
            boolean zChangedInstance = composerStartRestartGroup.changedInstance(userProfileFormComponent);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new pn1(userProfileFormComponent, 2);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            composer2 = composerStartRestartGroup;
            BackHandlerKt.a(false, (Function0) objRememberedValue, 0, 0, composer2, 3);
            if (((UserProfileFormUIState) mutableStateA.getValue()).e) {
                composer2.startReplaceGroup(-509438494);
                ChaloLoadingDialogKt.b(null, false, null, composer2, 0, 7);
                composer2 = composer2;
            } else {
                composer2.startReplaceGroup(-512569370);
            }
            composer2.endReplaceGroup();
            ConfirmationDialogUiState confirmationDialogUiState = ((UserProfileFormUIState) mutableStateA.getValue()).d;
            if (confirmationDialogUiState == null) {
                composer2.startReplaceGroup(-509363444);
                composer2.endReplaceGroup();
            } else {
                dd.l(composer2, -509363443, confirmationDialogUiState, composer2, 0);
            }
            UserProfileFormDialogType.DobPicker dobPicker = ((UserProfileFormUIState) mutableStateA.getValue()).f;
            if (dobPicker == null) {
                composer2.startReplaceGroup(-509261051);
            } else {
                composer2.startReplaceGroup(-509261050);
                long j = dobPicker.f10351a;
                boolean zChangedInstance2 = composer2.changedInstance(userProfileFormComponent);
                Object objRememberedValue2 = composer2.rememberedValue();
                if (zChangedInstance2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue2 = new pn1(userProfileFormComponent, 3);
                    composer2.updateRememberedValue(objRememberedValue2);
                }
                Function0 function0 = (Function0) objRememberedValue2;
                boolean zChangedInstance3 = composer2.changedInstance(userProfileFormComponent);
                Object objRememberedValue3 = composer2.rememberedValue();
                if (zChangedInstance3 || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue3 = new sh1(userProfileFormComponent, 25);
                    composer2.updateRememberedValue(objRememberedValue3);
                }
                Function1 function1 = (Function1) objRememberedValue3;
                boolean zChangedInstance4 = composer2.changedInstance(userProfileFormComponent);
                Object objRememberedValue4 = composer2.rememberedValue();
                if (zChangedInstance4 || objRememberedValue4 == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue4 = new pn1(userProfileFormComponent, 4);
                    composer2.updateRememberedValue(objRememberedValue4);
                }
                Composer composer3 = composer2;
                ChaloDatePickerKt.a(j, function0, function1, (Function0) objRememberedValue4, dobPicker.b, composer3, 0);
                composer2 = composer3;
            }
            composer2.endReplaceGroup();
            d((UserProfileFormUIState) mutableStateA.getValue(), composer2, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer2 = composerStartRestartGroup;
            composer2.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new fl1(userProfileFormComponent, i, 16));
        }
    }

    public static final void d(UserProfileFormUIState uiState, Composer composer, int i) {
        Intrinsics.i(uiState, "uiState");
        Composer composerStartRestartGroup = composer.startRestartGroup(1447191157);
        int i2 = (i & 6) == 0 ? (composerStartRestartGroup.changedInstance(uiState) ? 4 : 2) | i : i;
        if (composerStartRestartGroup.shouldExecute((i2 & 3) != 2, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1447191157, i2, -1, "app.chalo.userprofile.ui.compose.UserProfileFormScreen (UserProfileFormScreen.kt:100)");
            }
            ProfileFieldsSectionUIState profileFieldsSectionUIState = uiState.c;
            TextFieldSectionUISpecs textFieldSectionUISpecs = profileFieldsSectionUIState.f10334a;
            GenderCardSelectionUIState genderCardSelectionUIState = profileFieldsSectionUIState.e;
            FocusManager focusManager = (FocusManager) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalFocusManager());
            boolean zChanged = composerStartRestartGroup.changed(genderCardSelectionUIState) | composerStartRestartGroup.changed(focusManager);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                List<GenderCardUIState> list = genderCardSelectionUIState.c;
                ArrayList arrayList = new ArrayList(CollectionsKt.v(list, 10));
                for (GenderCardUIState genderCardUIState : list) {
                    UiEventHandler$Companion$fromLambda$1 uiEventHandler$Companion$fromLambda$1A = UiEventHandler.Companion.a(new cm1(7, focusManager, genderCardUIState));
                    GenderCardSpec spec = genderCardUIState.f10127a;
                    TextUIState textUIState = genderCardUIState.b;
                    ImageUIState imageUIState = genderCardUIState.c;
                    boolean z = genderCardUIState.d;
                    Intrinsics.i(spec, "spec");
                    arrayList.add(new GenderCardUIState(spec, textUIState, imageUIState, z, uiEventHandler$Companion$fromLambda$1A));
                }
                GenderCardSelectionSpec genderCardSelectionSpec = genderCardSelectionUIState.f10123a;
                TextUIState title = genderCardSelectionUIState.b;
                Intrinsics.i(title, "title");
                GenderCardSelectionUIState genderCardSelectionUIState2 = new GenderCardSelectionUIState(genderCardSelectionSpec, title, arrayList);
                composerStartRestartGroup.updateRememberedValue(genderCardSelectionUIState2);
                objRememberedValue = genderCardSelectionUIState2;
            }
            GenderCardSelectionUIState genderCardSelectionUIState3 = (GenderCardSelectionUIState) objRememberedValue;
            Modifier.Companion companion = Modifier.INSTANCE;
            Modifier modifierFillMaxSize$default = SizeKt.fillMaxSize$default(companion, 0.0f, 1, null);
            Alignment.Horizontal horizontalA = UiAlignmentKt.a(uiState.f10370a.f10369a);
            Arrangement arrangement = Arrangement.INSTANCE;
            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(arrangement.getTop(), horizontalA, composerStartRestartGroup, 0);
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
            Modifier modifierVerticalScroll$default = ScrollKt.verticalScroll$default(dq.a(ColumnScopeInstance.INSTANCE, SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), 1.0f, false, 2, null), ScrollKt.rememberScrollState(0, composerStartRestartGroup, 0, 1), false, null, false, 14, null);
            Arrangement.Vertical top = arrangement.getTop();
            Alignment.Companion companion3 = Alignment.INSTANCE;
            MeasurePolicy measurePolicyColumnMeasurePolicy2 = ColumnKt.columnMeasurePolicy(top, companion3.getStart(), composerStartRestartGroup, 0);
            long currentCompositeKeyHashCode2 = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
            int i4 = (int) (currentCompositeKeyHashCode2 ^ (currentCompositeKeyHashCode2 >>> 32));
            CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierVerticalScroll$default);
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
            pk0.v(companion2, composerM3915constructorimpl2, measurePolicyColumnMeasurePolicy2, composerM3915constructorimpl2, currentCompositionLocalMap2);
            Updater.m3923setimpl(composerM3915constructorimpl2, modifierMaterializeModifier2, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion2, composerM3915constructorimpl2, Integer.valueOf(i4), composerM3915constructorimpl2));
            b(uiState.b, composerStartRestartGroup, 0);
            Modifier modifierC = ChaloThemeKt.c(BackgroundKt.m263backgroundbw27NRU(OffsetKt.m744offsetVpY3zN4$default(companion, 0.0f, textFieldSectionUISpecs.f10340a, 1, null), ChaloColorTokenKt.c(textFieldSectionUISpecs.b), ChaloThemeKt.d(textFieldSectionUISpecs.c)), textFieldSectionUISpecs.d);
            MeasurePolicy measurePolicyColumnMeasurePolicy3 = ColumnKt.columnMeasurePolicy(arrangement.getTop(), companion3.getStart(), composerStartRestartGroup, 0);
            long currentCompositeKeyHashCode3 = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
            int i5 = (int) (currentCompositeKeyHashCode3 ^ (currentCompositeKeyHashCode3 >>> 32));
            CompositionLocalMap currentCompositionLocalMap3 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier3 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierC);
            Function0<ComposeUiNode> constructor3 = companion2.getConstructor();
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
            pk0.v(companion2, composerM3915constructorimpl3, measurePolicyColumnMeasurePolicy3, composerM3915constructorimpl3, currentCompositionLocalMap3);
            Updater.m3923setimpl(composerM3915constructorimpl3, modifierMaterializeModifier3, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion2, composerM3915constructorimpl3, Integer.valueOf(i5), composerM3915constructorimpl3));
            ChaloSpacersKt.p(composerStartRestartGroup, 0);
            a(profileFieldsSectionUIState.b, composerStartRestartGroup, 0);
            ChaloSpacersKt.h(composerStartRestartGroup, 0);
            a(profileFieldsSectionUIState.c, composerStartRestartGroup, 0);
            ChaloSpacersKt.h(composerStartRestartGroup, 0);
            a(profileFieldsSectionUIState.d, composerStartRestartGroup, 0);
            ChaloSpacersKt.h(composerStartRestartGroup, 0);
            GenderCardSelectionKt.a(null, genderCardSelectionUIState3, composerStartRestartGroup, 0);
            composerStartRestartGroup.endNode();
            composerStartRestartGroup.endNode();
            Modifier modifierM264backgroundbw27NRU$default = BackgroundKt.m264backgroundbw27NRU$default(ShadowKt.m4219shadows4CzXII$default(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), textFieldSectionUISpecs.f, null, false, 0L, 0L, 30, null), ChaloColorTokenKt.c(textFieldSectionUISpecs.g), null, 2, null);
            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(companion3.getTopStart(), false);
            long currentCompositeKeyHashCode4 = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
            int i6 = (int) (currentCompositeKeyHashCode4 ^ (currentCompositeKeyHashCode4 >>> 32));
            CompositionLocalMap currentCompositionLocalMap4 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier4 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierM264backgroundbw27NRU$default);
            Function0<ComposeUiNode> constructor4 = companion2.getConstructor();
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
            pk0.v(companion2, composerM3915constructorimpl4, measurePolicyMaybeCachedBoxMeasurePolicy, composerM3915constructorimpl4, currentCompositionLocalMap4);
            Updater.m3923setimpl(composerM3915constructorimpl4, modifierMaterializeModifier4, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion2, composerM3915constructorimpl4, Integer.valueOf(i6), composerM3915constructorimpl4));
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            ChaloFilledButtonKt.a(0, 0, composerStartRestartGroup, SizeKt.fillMaxWidth$default(ChaloThemeKt.c(companion, textFieldSectionUISpecs.e), 0.0f, 1, null), profileFieldsSectionUIState.f);
            composerStartRestartGroup.endNode();
            composerStartRestartGroup.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new fl1(uiState, i, 17));
        }
    }

    public static final void e(Modifier modifier, ProfileIconWithEditBtnUIState uiState, Composer composer, int i, int i2) {
        Modifier modifier2;
        int i3;
        Composer composer2;
        Modifier modifier3;
        Modifier modifierC;
        Intrinsics.i(uiState, "uiState");
        UiEventHandler$Companion$fromLambda$1 uiEventHandler$Companion$fromLambda$1 = uiState.d;
        Composer composerStartRestartGroup = composer.startRestartGroup(634230193);
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 6;
            modifier2 = modifier;
        } else if ((i & 6) == 0) {
            modifier2 = modifier;
            i3 = i | (composerStartRestartGroup.changed(modifier2) ? 4 : 2);
        } else {
            modifier2 = modifier;
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(uiState) ? 32 : 16;
        }
        if (composerStartRestartGroup.shouldExecute((i3 & 19) != 18, i3 & 1)) {
            modifier3 = i4 != 0 ? Modifier.INSTANCE : modifier2;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(634230193, i3, -1, "app.chalo.userprofile.ui.compose.UserProfilePicComposable (UserProfileFormScreen.kt:242)");
            }
            ProfileIconWithEditBtnUISpecs profileIconWithEditBtnUISpecs = uiState.f10336a;
            BorderUISpec borderUISpec = profileIconWithEditBtnUISpecs.f10335a;
            UIShape uIShape = profileIconWithEditBtnUISpecs.d;
            float f = profileIconWithEditBtnUISpecs.e;
            Alignment.Companion companion = Alignment.INSTANCE;
            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(companion.getBottomEnd(), false);
            long currentCompositeKeyHashCode = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
            int i5 = (int) (currentCompositeKeyHashCode ^ (currentCompositeKeyHashCode >>> 32));
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifier3);
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
            Updater.m3923setimpl(composerM3915constructorimpl, modifierMaterializeModifier, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion2, composerM3915constructorimpl, Integer.valueOf(i5), composerM3915constructorimpl));
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            ProfileImageUIState profileImageUIState = uiState.b;
            if (profileImageUIState instanceof ProfileImageUIState.DefaultProfileImage) {
                composerStartRestartGroup.startReplaceGroup(620478069);
                Modifier modifier4 = Modifier.INSTANCE;
                Modifier modifierM264backgroundbw27NRU$default = BackgroundKt.m264backgroundbw27NRU$default(BorderUISpecKt.a(ClipKt.clip(SizeKt.m828size3ABfNKs(modifier4, f), ChaloThemeKt.d(uIShape)), borderUISpec), ChaloColorTokenKt.c(profileIconWithEditBtnUISpecs.c), null, 2, null);
                boolean zChangedInstance = composerStartRestartGroup.changedInstance(uiEventHandler$Companion$fromLambda$1);
                Object objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    UserProfileFormScreenKt$UserProfilePicComposable$1$1$1 userProfileFormScreenKt$UserProfilePicComposable$1$1$1 = new UserProfileFormScreenKt$UserProfilePicComposable$1$1$1(0, uiEventHandler$Companion$fromLambda$1, UiEventHandler.class, "onClick", "onClick()V", 0);
                    composerStartRestartGroup.updateRememberedValue(userProfileFormScreenKt$UserProfilePicComposable$1$1$1);
                    objRememberedValue = userProfileFormScreenKt$UserProfilePicComposable$1$1$1;
                }
                Modifier modifierM299clickableoSLSa3U$default = ClickableKt.m299clickableoSLSa3U$default(modifierM264backgroundbw27NRU$default, false, null, null, null, (Function0) ((KFunction) objRememberedValue), 15, null);
                MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy2 = BoxKt.maybeCachedBoxMeasurePolicy(companion.getTopStart(), false);
                long currentCompositeKeyHashCode2 = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
                int i6 = (int) (currentCompositeKeyHashCode2 ^ (currentCompositeKeyHashCode2 >>> 32));
                CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierM299clickableoSLSa3U$default);
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
                pk0.v(companion2, composerM3915constructorimpl2, measurePolicyMaybeCachedBoxMeasurePolicy2, composerM3915constructorimpl2, currentCompositionLocalMap2);
                Updater.m3923setimpl(composerM3915constructorimpl2, modifierMaterializeModifier2, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion2, composerM3915constructorimpl2, Integer.valueOf(i6), composerM3915constructorimpl2));
                Modifier modifierFillMaxSize$default = SizeKt.fillMaxSize$default(modifier4, 0.0f, 1, null);
                ChaloPadding chaloPadding = profileIconWithEditBtnUISpecs.b;
                if (chaloPadding != null && (modifierC = ChaloThemeKt.c(modifier4, chaloPadding)) != null) {
                    modifier4 = modifierC;
                }
                composer2 = composerStartRestartGroup;
                CommonImageKt.a(((ProfileImageUIState.DefaultProfileImage) profileImageUIState).f10337a, modifierFillMaxSize$default.then(modifier4), false, composer2, 0, 4);
                composer2.endNode();
                composer2.endReplaceGroup();
            } else if (profileImageUIState instanceof ProfileImageUIState.ExistingImage) {
                composerStartRestartGroup.startReplaceGroup(621428901);
                byte[] bArr = ((ProfileImageUIState.ExistingImage) profileImageUIState).f10338a.f2782a;
                Modifier modifierA = BorderUISpecKt.a(ClipKt.clip(SizeKt.m828size3ABfNKs(Modifier.INSTANCE, f), ChaloThemeKt.d(uIShape)), borderUISpec);
                boolean zChangedInstance2 = composerStartRestartGroup.changedInstance(uiEventHandler$Companion$fromLambda$1);
                Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                if (zChangedInstance2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                    UserProfileFormScreenKt$UserProfilePicComposable$1$3$1 userProfileFormScreenKt$UserProfilePicComposable$1$3$1 = new UserProfileFormScreenKt$UserProfilePicComposable$1$3$1(0, uiEventHandler$Companion$fromLambda$1, UiEventHandler.class, "onClick", "onClick()V", 0);
                    composerStartRestartGroup.updateRememberedValue(userProfileFormScreenKt$UserProfilePicComposable$1$3$1);
                    objRememberedValue2 = userProfileFormScreenKt$UserProfilePicComposable$1$3$1;
                }
                SingletonAsyncImageKt.a(bArr, null, ClickableKt.m299clickableoSLSa3U$default(modifierA, false, null, null, null, (Function0) ((KFunction) objRememberedValue2), 15, null), ContentScale.INSTANCE.getCrop(), composerStartRestartGroup, 1572912, 1976);
                composerStartRestartGroup.endReplaceGroup();
                composer2 = composerStartRestartGroup;
            } else {
                if (!(profileImageUIState instanceof ProfileImageUIState.ProfilePhotoUrl)) {
                    throw pk0.p(composerStartRestartGroup, -534175501);
                }
                composerStartRestartGroup.startReplaceGroup(622030146);
                String str = ((ProfileImageUIState.ProfilePhotoUrl) profileImageUIState).f10339a;
                ContentScale crop = ContentScale.INSTANCE.getCrop();
                Modifier modifierA2 = BorderUISpecKt.a(ClipKt.clip(SizeKt.m828size3ABfNKs(Modifier.INSTANCE, f), ChaloThemeKt.d(uIShape)), borderUISpec);
                boolean zChangedInstance3 = composerStartRestartGroup.changedInstance(uiEventHandler$Companion$fromLambda$1);
                Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                if (zChangedInstance3 || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                    UserProfileFormScreenKt$UserProfilePicComposable$1$4$1 userProfileFormScreenKt$UserProfilePicComposable$1$4$1 = new UserProfileFormScreenKt$UserProfilePicComposable$1$4$1(0, uiEventHandler$Companion$fromLambda$1, UiEventHandler.class, "onClick", "onClick()V", 0);
                    composerStartRestartGroup.updateRememberedValue(userProfileFormScreenKt$UserProfilePicComposable$1$4$1);
                    objRememberedValue3 = userProfileFormScreenKt$UserProfilePicComposable$1$4$1;
                }
                SingletonSubcomposeAsyncImageKt.a(str, "Profile photo", ClickableKt.m299clickableoSLSa3U$default(modifierA2, false, null, null, null, (Function0) ((KFunction) objRememberedValue3), 15, null), ComposableLambdaKt.rememberComposableLambda(654609534, true, new o4(profileIconWithEditBtnUISpecs, 15), composerStartRestartGroup, 54), null, ComposableSingletons$UserProfileFormScreenKt.f10375a, null, null, null, crop, composerStartRestartGroup, 1597488, 48, 63400);
                composer2 = composerStartRestartGroup;
                composer2.endReplaceGroup();
            }
            CommonImageKt.a(uiState.c, PaddingKt.m784padding3ABfNKs(BackgroundKt.m263backgroundbw27NRU(PaddingKt.m784padding3ABfNKs(Modifier.INSTANCE, profileIconWithEditBtnUISpecs.g), ChaloColorTokenKt.c(profileIconWithEditBtnUISpecs.i), ChaloThemeKt.d(profileIconWithEditBtnUISpecs.h)), profileIconWithEditBtnUISpecs.f), false, composer2, 0, 4);
            composer2.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer2 = composerStartRestartGroup;
            composer2.skipToGroupEnd();
            modifier3 = modifier2;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new xa1(modifier3, uiState, i, i2, 9));
        }
    }
}
