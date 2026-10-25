package app.chalo.productpurchase.passpurchase.ui.enteruserdetails;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
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
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import app.chalo.compose.ChaloToolBarKt;
import app.chalo.compose.components.ChaloRoundedCardKt;
import app.chalo.compose.components.ShadowElementKt;
import app.chalo.compose.components.dialogs.ChaloDatePickerKt;
import app.chalo.compose.components.dialogs.GenderSelectionDialogKt;
import app.chalo.compose.theme.ChaloThemeKt;
import app.chalo.compose.utils.SafeFocusRequester;
import app.chalo.uistate.dialog.DatePickerUIState;
import app.chalo.uistate.dialog.GenderSelectionDialogUIState;
import app.chalo.uistate.toolbar.ToolbarUIState;
import com.arkivanov.decompose.extensions.compose.SubscribeAsStateKt;
import com.arkivanov.decompose.value.MutableValue;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import defpackage.dq;
import defpackage.fb1;
import defpackage.pk0;
import defpackage.r1;
import defpackage.rw0;
import defpackage.sx0;
import defpackage.uf1;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.CoroutineScope;
import okhttp3.internal.ws.WebSocketProtocol;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002¨\u0006\u0002²\u0006\f\u0010\u0001\u001a\u00020\u00008\nX\u008a\u0084\u0002"}, d2 = {"Lapp/chalo/productpurchase/passpurchase/ui/enteruserdetails/SuperPassEnterUserDetailsUIState;", RemoteConfigConstants.ResponseFieldKey.STATE, "home_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class SuperPassEnterUserDetailsScreenKt {
    /* JADX WARN: Multi-variable type inference failed */
    public static final void a(SuperPassEnterUserDetailsViewModel superPassEnterUserDetailsViewModel, Composer composer, int i) {
        int i2;
        Composer composerStartRestartGroup = composer.startRestartGroup(508721364);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(superPassEnterUserDetailsViewModel) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (composerStartRestartGroup.shouldExecute((i2 & 3) != 2, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(508721364, i2, -1, "app.chalo.productpurchase.passpurchase.ui.enteruserdetails.SuperPassEnterUserDetailsScreen (SuperPassEnterUserDetailsScreen.kt:37)");
            }
            MutableState mutableStateA = SubscribeAsStateKt.a((MutableValue) superPassEnterUserDetailsViewModel.g.getValue(), composerStartRestartGroup);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            Composer.Companion companion = Composer.INSTANCE;
            if (objRememberedValue == companion.getEmpty()) {
                objRememberedValue = new SafeFocusRequester();
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            SafeFocusRequester safeFocusRequester = (SafeFocusRequester) objRememberedValue;
            boolean zChangedInstance = composerStartRestartGroup.changedInstance(superPassEnterUserDetailsViewModel);
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance || objRememberedValue2 == companion.getEmpty()) {
                objRememberedValue2 = new SuperPassEnterUserDetailsScreenKt$SuperPassEnterUserDetailsScreen$1$1(superPassEnterUserDetailsViewModel, safeFocusRequester, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            EffectsKt.LaunchedEffect(superPassEnterUserDetailsViewModel, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue2, composerStartRestartGroup, i2 & 14);
            c((SuperPassEnterUserDetailsUIState) mutableStateA.getValue(), safeFocusRequester, composerStartRestartGroup, 48);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new fb1(superPassEnterUserDetailsViewModel, i, 16));
        }
    }

    public static final void b(SuperPassEnterUserDetailsUIState superPassEnterUserDetailsUIState, SafeFocusRequester safeFocusRequester, Composer composer, int i) {
        int i2;
        SuperPassEnterUserDetailsUIState superPassEnterUserDetailsUIState2;
        Composer composerStartRestartGroup = composer.startRestartGroup(401497327);
        if ((i & 6) == 0) {
            i2 = i | (composerStartRestartGroup.changed(superPassEnterUserDetailsUIState) ? 4 : 2);
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changed(safeFocusRequester) ? 32 : 16;
        }
        if (composerStartRestartGroup.shouldExecute((i2 & 19) != 18, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(401497327, i2, -1, "app.chalo.productpurchase.passpurchase.ui.enteruserdetails.SuperPassEnterUserDetailsScreenContent (SuperPassEnterUserDetailsScreen.kt:78)");
            }
            Modifier.Companion companion = Modifier.INSTANCE;
            Modifier modifierFillMaxSize$default = SizeKt.fillMaxSize$default(companion, 0.0f, 1, null);
            Arrangement arrangement = Arrangement.INSTANCE;
            Arrangement.Vertical top = arrangement.getTop();
            Alignment.Companion companion2 = Alignment.INSTANCE;
            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(top, companion2.getStart(), composerStartRestartGroup, 0);
            long currentCompositeKeyHashCode = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
            int i3 = (int) (currentCompositeKeyHashCode ^ (currentCompositeKeyHashCode >>> 32));
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierFillMaxSize$default);
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
            ToolbarUIState toolbarUIState = superPassEnterUserDetailsUIState.f8427a;
            SuperPassEnterUserDetailsUISpecs superPassEnterUserDetailsUISpecs = superPassEnterUserDetailsUIState.d;
            ChaloToolBarKt.b(toolbarUIState, null, null, composerStartRestartGroup, 0, 14);
            LazyDslKt.LazyColumn(dq.a(columnScopeInstance, ChaloThemeKt.c(SizeKt.fillMaxSize$default(companion, 0.0f, 1, null), superPassEnterUserDetailsUISpecs.f8426a), 1.0f, false, 2, null), null, null, false, null, null, null, false, null, new rw0(16, superPassEnterUserDetailsUIState, new Ref.BooleanRef(), safeFocusRequester), composerStartRestartGroup, 0, TypedValues.PositionType.TYPE_POSITION_TYPE);
            MeasurePolicy measurePolicyColumnMeasurePolicy2 = ColumnKt.columnMeasurePolicy(arrangement.getTop(), companion2.getStart(), composerStartRestartGroup, 0);
            long currentCompositeKeyHashCode2 = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
            int i4 = (int) (currentCompositeKeyHashCode2 ^ (currentCompositeKeyHashCode2 >>> 32));
            CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, companion);
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
            Updater.m3923setimpl(composerM3915constructorimpl2, modifierMaterializeModifier2, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion3, composerM3915constructorimpl2, Integer.valueOf(i4), composerM3915constructorimpl2));
            ShadowElementKt.a(SizeKt.m814height3ABfNKs(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), superPassEnterUserDetailsUISpecs.c.c), 0L, 0L, composerStartRestartGroup, 0, 6);
            composerStartRestartGroup = composerStartRestartGroup;
            superPassEnterUserDetailsUIState2 = superPassEnterUserDetailsUIState;
            ChaloRoundedCardKt.a(superPassEnterUserDetailsUISpecs.c, SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), ComposableLambdaKt.rememberComposableLambda(2112680052, true, new sx0(superPassEnterUserDetailsUIState2, 21), composerStartRestartGroup, 54), composerStartRestartGroup, 432, 0);
            if (r1.k(composerStartRestartGroup)) {
                ComposerKt.traceEventEnd();
            }
        } else {
            superPassEnterUserDetailsUIState2 = superPassEnterUserDetailsUIState;
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new uf1(superPassEnterUserDetailsUIState2, safeFocusRequester, i, 1));
        }
    }

    public static final void c(SuperPassEnterUserDetailsUIState superPassEnterUserDetailsUIState, SafeFocusRequester safeFocusRequester, Composer composer, int i) {
        int i2;
        Composer composerStartRestartGroup = composer.startRestartGroup(1189793142);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changed(superPassEnterUserDetailsUIState) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changed(safeFocusRequester) ? 32 : 16;
        }
        if (composerStartRestartGroup.shouldExecute((i2 & 19) != 18, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1189793142, i2, -1, "app.chalo.productpurchase.passpurchase.ui.enteruserdetails.SuperPassEnterUserDetailsScreenMainContent (SuperPassEnterUserDetailsScreen.kt:59)");
            }
            b(superPassEnterUserDetailsUIState, safeFocusRequester, composerStartRestartGroup, i2 & WebSocketProtocol.PAYLOAD_SHORT);
            GenderSelectionDialogUIState genderSelectionDialogUIState = superPassEnterUserDetailsUIState.e;
            if (genderSelectionDialogUIState == null) {
                composerStartRestartGroup.startReplaceGroup(-1237318434);
            } else {
                composerStartRestartGroup.startReplaceGroup(-1237318433);
                GenderSelectionDialogKt.b(genderSelectionDialogUIState, composerStartRestartGroup, 0);
            }
            composerStartRestartGroup.endReplaceGroup();
            DatePickerUIState datePickerUIState = superPassEnterUserDetailsUIState.f;
            if (datePickerUIState == null) {
                composerStartRestartGroup.startReplaceGroup(-1237244220);
            } else {
                composerStartRestartGroup.startReplaceGroup(-1237244219);
                ChaloDatePickerKt.b(datePickerUIState, composerStartRestartGroup, 0);
            }
            composerStartRestartGroup.endReplaceGroup();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new uf1(superPassEnterUserDetailsUIState, safeFocusRequester, i, 0));
        }
    }
}
