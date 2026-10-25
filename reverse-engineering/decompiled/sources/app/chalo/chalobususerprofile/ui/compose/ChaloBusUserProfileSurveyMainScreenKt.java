package app.chalo.chalobususerprofile.ui.compose;

import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.BorderKt;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.ScrollKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.layout.WindowInsetsPadding_androidKt;
import androidx.compose.foundation.shape.RoundedCornerShape;
import androidx.compose.material3.CardDefaults;
import androidx.compose.material3.CardKt;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.ClipKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.window.AndroidDialog_androidKt;
import androidx.profileinstaller.ProfileVerifier;
import app.chalo.chalobususerprofile.ui.compose.ChaloBusUserProfileSurveyMainScreenKt;
import app.chalo.compose.components.ChaloLoadingDialogKt;
import app.chalo.compose.components.ChaloTextViewKt;
import app.chalo.compose.components.TextKt;
import app.chalo.compose.components.buttons.ChaloFilledButtonKt;
import app.chalo.compose.components.image.CommonImageKt;
import app.chalo.compose.components.image.GifUIKt;
import app.chalo.compose.theme.ChaloTheme;
import app.chalo.compose.theme.ChaloThemeHelper;
import app.chalo.compose.theme.ChaloThemeKt;
import app.chalo.premiumbus.ui.slotselection.BorderUIState;
import app.chalo.uistate.base.ChaloColorToken;
import app.chalo.uistate.base.ChaloColorTokenKt;
import app.chalo.uistate.base.UiEventHandler;
import app.chalo.uistate.base.UiEventHandler$Companion$fromLambda$1;
import app.chalo.uistate.button.ButtonUIState;
import app.chalo.uistate.image.GifImageUIState;
import app.chalo.uistate.image.ImageUIState;
import app.chalo.uistate.text.TextUIState;
import app.chalo.uistate.text.UITextAlign;
import com.arkivanov.decompose.extensions.compose.SubscribeAsStateKt;
import defpackage.b0;
import defpackage.b3;
import defpackage.d0;
import defpackage.dq;
import defpackage.e0;
import defpackage.eh;
import defpackage.ei;
import defpackage.fi;
import defpackage.h0;
import defpackage.hi;
import defpackage.i4;
import defpackage.i41;
import defpackage.n4;
import defpackage.pk0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002¨\u0006\u0002²\u0006\f\u0010\u0001\u001a\u00020\u00008\nX\u008a\u0084\u0002"}, d2 = {"Lapp/chalo/chalobususerprofile/ui/compose/ChaloBusUserProfileSurveyViewState;", "viewState", "home_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class ChaloBusUserProfileSurveyMainScreenKt {
    public static final void a(final ChaloBusUserProfileSurveyViewState viewState, Composer composer, final int i) {
        int i2;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Function2<? super Composer, ? super Integer, Unit> function2;
        Intrinsics.i(viewState, "viewState");
        ButtonUIState buttonUIState = viewState.e;
        ButtonUIState buttonUIState2 = viewState.d;
        Composer composerStartRestartGroup = composer.startRestartGroup(2036875506);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? composerStartRestartGroup.changed(viewState) : composerStartRestartGroup.changedInstance(viewState) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (composerStartRestartGroup.shouldExecute((i2 & 3) != 2, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(2036875506, i2, -1, "app.chalo.chalobususerprofile.ui.compose.ChaloBusUserProfileSurveyContent (ChaloBusUserProfileSurveyMainScreen.kt:60)");
            }
            if (viewState.b != null) {
                composerStartRestartGroup.startReplaceGroup(1260375404);
                ChaloLoadingDialogKt.b(null, false, null, composerStartRestartGroup, 0, 7);
            } else {
                composerStartRestartGroup.startReplaceGroup(1257872464);
            }
            composerStartRestartGroup.endReplaceGroup();
            ProfileSurveyUIState profileSurveyUIState = viewState.c;
            if (profileSurveyUIState == null) {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                final int i3 = 0;
                function2 = new Function2() { // from class: gi
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        int i4 = i3;
                        Composer composer2 = (Composer) obj;
                        ((Integer) obj2).intValue();
                        switch (i4) {
                            case 0:
                                ChaloBusUserProfileSurveyMainScreenKt.a(viewState, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1));
                                break;
                            default:
                                ChaloBusUserProfileSurveyMainScreenKt.a(viewState, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1));
                                break;
                        }
                        return Unit.f17538a;
                    }
                };
            } else {
                Modifier.Companion companion = Modifier.INSTANCE;
                Modifier modifierImePadding = WindowInsetsPadding_androidKt.imePadding(BackgroundKt.m264backgroundbw27NRU$default(SizeKt.fillMaxSize$default(ChaloThemeKt.c(companion, viewState.f), 0.0f, 1, null), ChaloTheme.a(composerStartRestartGroup, 0).t, null, 2, null));
                MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composerStartRestartGroup, 0);
                long currentCompositeKeyHashCode = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
                int i4 = (int) (currentCompositeKeyHashCode ^ (currentCompositeKeyHashCode >>> 32));
                CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierImePadding);
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
                Updater.m3923setimpl(composerM3915constructorimpl, modifierMaterializeModifier, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion2, composerM3915constructorimpl, Integer.valueOf(i4), composerM3915constructorimpl));
                ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
                g(viewState.f1227a, viewState.g, viewState.h, composerStartRestartGroup, 0);
                if (profileSurveyUIState instanceof ProfileSurveyUIState.WorkTimingUIState) {
                    composerStartRestartGroup.startReplaceGroup(712378430);
                    j((ProfileSurveyUIState.WorkTimingUIState) profileSurveyUIState, dq.a(columnScopeInstance, companion, 1.0f, false, 2, null), composerStartRestartGroup, 0);
                    composerStartRestartGroup.endReplaceGroup();
                } else if (profileSurveyUIState instanceof ProfileSurveyUIState.FrequencyUIState) {
                    composerStartRestartGroup.startReplaceGroup(712384061);
                    f((ProfileSurveyUIState.FrequencyUIState) profileSurveyUIState, dq.a(columnScopeInstance, companion, 1.0f, false, 2, null), composerStartRestartGroup, 0);
                    composerStartRestartGroup.endReplaceGroup();
                } else {
                    if (!(profileSurveyUIState instanceof ProfileSurveyUIState.SuccessErrorUIState)) {
                        throw pk0.p(composerStartRestartGroup, 712376504);
                    }
                    composerStartRestartGroup.startReplaceGroup(712389762);
                    h((ProfileSurveyUIState.SuccessErrorUIState) profileSurveyUIState, dq.a(columnScopeInstance, companion, 1.0f, false, 2, null), composerStartRestartGroup, 0);
                    composerStartRestartGroup.endReplaceGroup();
                }
                if (buttonUIState2 == null || buttonUIState == null) {
                    composerStartRestartGroup.startReplaceGroup(605790202);
                } else {
                    composerStartRestartGroup.startReplaceGroup(609468383);
                    e(buttonUIState2, buttonUIState, composerStartRestartGroup, 0);
                }
                composerStartRestartGroup.endReplaceGroup();
                composerStartRestartGroup.endNode();
                SurveyTimePickerDialogUIState surveyTimePickerDialogUIState = viewState.i;
                if (surveyTimePickerDialogUIState == null) {
                    composerStartRestartGroup.startReplaceGroup(1261779393);
                } else {
                    composerStartRestartGroup.startReplaceGroup(1261779394);
                    i(surveyTimePickerDialogUIState, composerStartRestartGroup, 0);
                }
                composerStartRestartGroup.endReplaceGroup();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
            scopeUpdateScopeEndRestartGroup.updateScope(function2);
        }
        composerStartRestartGroup.skipToGroupEnd();
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            final int i5 = 1;
            function2 = new Function2() { // from class: gi
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    int i6 = i5;
                    Composer composer2 = (Composer) obj;
                    ((Integer) obj2).intValue();
                    switch (i6) {
                        case 0:
                            ChaloBusUserProfileSurveyMainScreenKt.a(viewState, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1));
                            break;
                        default:
                            ChaloBusUserProfileSurveyMainScreenKt.a(viewState, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1));
                            break;
                    }
                    return Unit.f17538a;
                }
            };
            scopeUpdateScopeEndRestartGroup.updateScope(function2);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void b(ChaloBusUserProfileSurveyComponent chaloBusUserProfileSurveyComponent, Composer composer, int i) {
        int i2;
        Composer composerStartRestartGroup = composer.startRestartGroup(1976162245);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(chaloBusUserProfileSurveyComponent) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (composerStartRestartGroup.shouldExecute((i2 & 3) != 2, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1976162245, i2, -1, "app.chalo.chalobususerprofile.ui.compose.ChaloBusUserProfileSurveyMainScreen (ChaloBusUserProfileSurveyMainScreen.kt:50)");
            }
            a((ChaloBusUserProfileSurveyViewState) SubscribeAsStateKt.a(chaloBusUserProfileSurveyComponent.t0(), composerStartRestartGroup).getValue(), composerStartRestartGroup, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new e0(chaloBusUserProfileSurveyComponent, i, 23));
        }
    }

    public static final void c(Modifier modifier, TextUIState.ChaloTextUIState chaloTextUIState, ChaloColorToken chaloColorToken, ChaloColorToken chaloColorToken2, UiEventHandler$Companion$fromLambda$1 uiEventHandler$Companion$fromLambda$1, Composer composer, int i) {
        int i2;
        ChaloColorToken chaloColorToken3;
        UiEventHandler$Companion$fromLambda$1 uiEventHandler$Companion$fromLambda$2 = uiEventHandler$Companion$fromLambda$1;
        Composer composerStartRestartGroup = composer.startRestartGroup(81031221);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changed(modifier) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changed(chaloTextUIState) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            chaloColorToken3 = chaloColorToken;
            i2 |= composerStartRestartGroup.changed(chaloColorToken3) ? 256 : 128;
        } else {
            chaloColorToken3 = chaloColorToken;
        }
        if ((i & 3072) == 0) {
            i2 |= composerStartRestartGroup.changed(chaloColorToken2) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(uiEventHandler$Companion$fromLambda$2) ? 16384 : 8192;
        }
        if (composerStartRestartGroup.shouldExecute((i2 & 9363) != 9362, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(81031221, i2, -1, "app.chalo.chalobususerprofile.ui.compose.FrequencyOptionComposable (ChaloBusUserProfileSurveyMainScreen.kt:368)");
            }
            Modifier modifierM275borderxT4_qwU = BorderKt.m275borderxT4_qwU(BackgroundKt.m263backgroundbw27NRU(ClipKt.clip(modifier, ChaloTheme.d(composerStartRestartGroup, 0).c), ChaloColorTokenKt.c(chaloColorToken3), ChaloTheme.d(composerStartRestartGroup, 0).g), Dp.m7278constructorimpl(1), ChaloColorTokenKt.c(chaloColorToken2), ChaloTheme.d(composerStartRestartGroup, 0).g);
            uiEventHandler$Companion$fromLambda$2 = uiEventHandler$Companion$fromLambda$1;
            boolean zChangedInstance = composerStartRestartGroup.changedInstance(uiEventHandler$Companion$fromLambda$2);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new i4(uiEventHandler$Companion$fromLambda$2, 29);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            Modifier modifierM784padding3ABfNKs = PaddingKt.m784padding3ABfNKs(ClickableKt.m299clickableoSLSa3U$default(modifierM275borderxT4_qwU, false, null, null, null, (Function0) objRememberedValue, 15, null), ChaloTheme.b(composerStartRestartGroup, 0).g);
            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getCenter(), false);
            long currentCompositeKeyHashCode = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
            int i3 = (int) (currentCompositeKeyHashCode ^ (currentCompositeKeyHashCode >>> 32));
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierM784padding3ABfNKs);
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
            Updater.m3923setimpl(composerM3915constructorimpl, modifierMaterializeModifier, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion, composerM3915constructorimpl, Integer.valueOf(i3), composerM3915constructorimpl));
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            ChaloTextViewKt.a(null, chaloTextUIState, null, null, composerStartRestartGroup, i2 & 112, 13);
            composerStartRestartGroup.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new h0(modifier, chaloTextUIState, chaloColorToken3, chaloColorToken2, uiEventHandler$Companion$fromLambda$2, i));
        }
    }

    public static final void d(OfficeInfoUIState officeInfoUIState, Modifier modifier, Composer composer, int i) {
        int i2;
        Composer composer2;
        Modifier modifier2;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1496612811);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(officeInfoUIState) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        int i3 = i2 | 48;
        if (composerStartRestartGroup.shouldExecute((i3 & 19) != 18, i3 & 1)) {
            Modifier.Companion companion = Modifier.INSTANCE;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1496612811, i3, -1, "app.chalo.chalobususerprofile.ui.compose.OfficeInfoCard (ChaloBusUserProfileSurveyMainScreen.kt:162)");
            }
            OfficeInfoComponentSpecs officeInfoComponentSpecs = officeInfoUIState.h;
            Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null);
            RoundedCornerShape roundedCornerShapeD = ChaloThemeKt.d(officeInfoComponentSpecs.b.f9924a);
            CardDefaults cardDefaults = CardDefaults.INSTANCE;
            float f = officeInfoComponentSpecs.b.b;
            int i4 = CardDefaults.$stable;
            composer2 = composerStartRestartGroup;
            CardKt.Card(modifierFillMaxWidth$default, roundedCornerShapeD, cardDefaults.m1694cardColorsro_MJ88(ChaloColorTokenKt.c(ChaloColorToken.White.f9870a), 0L, 0L, 0L, composerStartRestartGroup, i4 << 12, 14), cardDefaults.m1695cardElevationaqJV_2Y(f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, composerStartRestartGroup, i4 << 18, 62), null, ComposableLambdaKt.rememberComposableLambda(-1655155929, true, new d0(6, officeInfoComponentSpecs, officeInfoUIState), composer2, 54), composer2, ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE, 16);
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
            scopeUpdateScopeEndRestartGroup.updateScope(new b0(officeInfoUIState, modifier2, i, 24));
        }
    }

    public static final void e(ButtonUIState buttonUIState, ButtonUIState buttonUIState2, Composer composer, int i) {
        int i2;
        Composer composerStartRestartGroup = composer.startRestartGroup(2061660565);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changed(buttonUIState) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changed(buttonUIState2) ? 32 : 16;
        }
        if (composerStartRestartGroup.shouldExecute((i2 & 19) != 18, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(2061660565, i2, -1, "app.chalo.chalobususerprofile.ui.compose.SurveyBottomButtons (ChaloBusUserProfileSurveyMainScreen.kt:393)");
            }
            Modifier.Companion companion = Modifier.INSTANCE;
            Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null);
            MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.m672spacedBy0680j_4(ChaloTheme.b(composerStartRestartGroup, 0).g), Alignment.INSTANCE.getTop(), composerStartRestartGroup, 0);
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
            pk0.v(companion2, composerM3915constructorimpl, measurePolicyRowMeasurePolicy, composerM3915constructorimpl, currentCompositionLocalMap);
            Updater.m3923setimpl(composerM3915constructorimpl, modifierMaterializeModifier, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion2, composerM3915constructorimpl, Integer.valueOf(i3), composerM3915constructorimpl));
            RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
            ChaloFilledButtonKt.a((i2 << 3) & 112, 0, composerStartRestartGroup, i41.a(rowScopeInstance, companion, 0.8f, false, 2, null), buttonUIState);
            if (b3.s(i2 & 112, 0, composerStartRestartGroup, i41.a(rowScopeInstance, companion, 1.4f, false, 2, null), buttonUIState2)) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new b0(buttonUIState, buttonUIState2, i, 26));
        }
    }

    public static final void f(ProfileSurveyUIState.FrequencyUIState frequencyUIState, Modifier modifier, Composer composer, int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(1271931775);
        int i2 = (i & 6) == 0 ? (composerStartRestartGroup.changedInstance(frequencyUIState) ? 4 : 2) | i : i;
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changed(modifier) ? 32 : 16;
        }
        if (composerStartRestartGroup.shouldExecute((i2 & 19) != 18, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1271931775, i2, -1, "app.chalo.chalobususerprofile.ui.compose.SurveyFrequencyStep (ChaloBusUserProfileSurveyMainScreen.kt:232)");
            }
            Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(modifier, 0.0f, 1, null);
            Arrangement arrangement = Arrangement.INSTANCE;
            Arrangement.Vertical top = arrangement.getTop();
            Alignment.Companion companion = Alignment.INSTANCE;
            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(top, companion.getStart(), composerStartRestartGroup, 0);
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
            Modifier.Companion companion3 = Modifier.INSTANCE;
            SpacerKt.Spacer(SizeKt.m814height3ABfNKs(companion3, frequencyUIState.f1233a), composerStartRestartGroup, 0);
            MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(arrangement.getStart(), companion.getCenterVertically(), composerStartRestartGroup, 48);
            long currentCompositeKeyHashCode2 = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
            int i4 = (int) (currentCompositeKeyHashCode2 ^ (currentCompositeKeyHashCode2 >>> 32));
            CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, companion3);
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
            Updater.m3923setimpl(composerM3915constructorimpl2, modifierMaterializeModifier2, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion2, composerM3915constructorimpl2, Integer.valueOf(i4), composerM3915constructorimpl2));
            RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
            CommonImageKt.a(frequencyUIState.b, null, false, composerStartRestartGroup, 0, 6);
            SpacerKt.Spacer(SizeKt.m833width3ABfNKs(companion3, ChaloThemeHelper.a().e), composerStartRestartGroup, 0);
            ChaloTextViewKt.a(null, frequencyUIState.c, null, null, composerStartRestartGroup, 0, 13);
            composerStartRestartGroup = composerStartRestartGroup;
            composerStartRestartGroup.endNode();
            SpacerKt.Spacer(SizeKt.m814height3ABfNKs(companion3, ChaloTheme.b(composerStartRestartGroup, 0).i), composerStartRestartGroup, 0);
            List list = frequencyUIState.d;
            MeasurePolicy measurePolicyColumnMeasurePolicy2 = ColumnKt.columnMeasurePolicy(arrangement.m672spacedBy0680j_4(ChaloTheme.b(composerStartRestartGroup, 0).g), companion.getStart(), composerStartRestartGroup, 0);
            long currentCompositeKeyHashCode3 = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
            int i5 = (int) (currentCompositeKeyHashCode3 ^ (currentCompositeKeyHashCode3 >>> 32));
            CompositionLocalMap currentCompositionLocalMap3 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier3 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, companion3);
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
            pk0.v(companion2, composerM3915constructorimpl3, measurePolicyColumnMeasurePolicy2, composerM3915constructorimpl3, currentCompositionLocalMap3);
            Updater.m3923setimpl(composerM3915constructorimpl3, modifierMaterializeModifier3, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion2, composerM3915constructorimpl3, Integer.valueOf(i5), composerM3915constructorimpl3));
            composerStartRestartGroup.startReplaceGroup(1974400712);
            ArrayList arrayListU = CollectionsKt.u(list, 2);
            int size = arrayListU.size();
            int i6 = 0;
            while (i6 < size) {
                int i7 = i6 + 1;
                List<FrequencyChipUIState> list2 = (List) arrayListU.get(i6);
                Modifier modifierFillMaxWidth$default2 = SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null);
                MeasurePolicy measurePolicyRowMeasurePolicy2 = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.m672spacedBy0680j_4(ChaloTheme.b(composerStartRestartGroup, 0).g), Alignment.INSTANCE.getTop(), composerStartRestartGroup, 0);
                long currentCompositeKeyHashCode4 = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
                int i8 = (int) (currentCompositeKeyHashCode4 ^ (currentCompositeKeyHashCode4 >>> 32));
                CompositionLocalMap currentCompositionLocalMap4 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier4 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierFillMaxWidth$default2);
                ComposeUiNode.Companion companion4 = ComposeUiNode.INSTANCE;
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
                Updater.m3923setimpl(composerM3915constructorimpl4, modifierMaterializeModifier4, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion4, composerM3915constructorimpl4, Integer.valueOf(i8), composerM3915constructorimpl4));
                RowScopeInstance rowScopeInstance2 = RowScopeInstance.INSTANCE;
                composerStartRestartGroup.startReplaceGroup(-1518728936);
                for (FrequencyChipUIState frequencyChipUIState : list2) {
                    Composer composer2 = composerStartRestartGroup;
                    c(i41.a(rowScopeInstance2, Modifier.INSTANCE, 1.0f, false, 2, null), frequencyChipUIState.f1228a, frequencyChipUIState.c, frequencyChipUIState.b.b, frequencyChipUIState.d, composer2, 0);
                    composerStartRestartGroup = composer2;
                }
                composerStartRestartGroup.endReplaceGroup();
                if (list2.size() < 2) {
                    composerStartRestartGroup.startReplaceGroup(-1518714145);
                    SpacerKt.Spacer(i41.a(rowScopeInstance2, Modifier.INSTANCE, 1.0f, false, 2, null), composerStartRestartGroup, 0);
                } else {
                    composerStartRestartGroup.startReplaceGroup(154960862);
                }
                composerStartRestartGroup.endReplaceGroup();
                composerStartRestartGroup.endNode();
                i6 = i7;
            }
            composerStartRestartGroup.endReplaceGroup();
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
            scopeUpdateScopeEndRestartGroup.updateScope(new b0(frequencyUIState, modifier, i, 29));
        }
    }

    public static final void g(TextUIState.ChaloTextUIState chaloTextUIState, float f, ImageUIState imageUIState, Composer composer, int i) {
        int i2;
        Composer composerStartRestartGroup = composer.startRestartGroup(-950444621);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changed(chaloTextUIState) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changed(f) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= composerStartRestartGroup.changed(imageUIState) ? 256 : 128;
        }
        int i3 = i2;
        if (composerStartRestartGroup.shouldExecute((i3 & 147) != 146, i3 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-950444621, i3, -1, "app.chalo.chalobususerprofile.ui.compose.SurveyStepHeader (ChaloBusUserProfileSurveyMainScreen.kt:115)");
            }
            if (imageUIState == null) {
                composerStartRestartGroup.startReplaceGroup(2023899720);
            } else {
                composerStartRestartGroup.startReplaceGroup(2023899721);
                CommonImageKt.a(imageUIState, null, false, composerStartRestartGroup, 0, 6);
            }
            composerStartRestartGroup.endReplaceGroup();
            SpacerKt.Spacer(SizeKt.m814height3ABfNKs(Modifier.INSTANCE, f), composerStartRestartGroup, 0);
            if (chaloTextUIState != null) {
                composerStartRestartGroup.startReplaceGroup(2024042011);
                ChaloTextViewKt.a(null, chaloTextUIState, null, null, composerStartRestartGroup, (i3 << 3) & 112, 13);
                composerStartRestartGroup = composerStartRestartGroup;
            } else {
                composerStartRestartGroup.startReplaceGroup(2019672623);
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
            scopeUpdateScopeEndRestartGroup.updateScope(new hi(chaloTextUIState, f, imageUIState, i, 0));
        }
    }

    public static final void h(ProfileSurveyUIState.SuccessErrorUIState successErrorUIState, Modifier modifier, Composer composer, int i) {
        int i2;
        Composer composerStartRestartGroup = composer.startRestartGroup(458127423);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changed(successErrorUIState) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changed(modifier) ? 32 : 16;
        }
        if (composerStartRestartGroup.shouldExecute((i2 & 19) != 18, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(458127423, i2, -1, "app.chalo.chalobususerprofile.ui.compose.SurveySuccessErrorScreen (ChaloBusUserProfileSurveyMainScreen.kt:272)");
            }
            Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(modifier, 0.0f, 1, null);
            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getCenterHorizontally(), composerStartRestartGroup, 48);
            long currentCompositeKeyHashCode = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
            int i3 = (int) ((currentCompositeKeyHashCode >>> 32) ^ currentCompositeKeyHashCode);
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierFillMaxWidth$default);
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
            Modifier.Companion companion2 = Modifier.INSTANCE;
            SpacerKt.Spacer(dq.a(columnScopeInstance, companion2, 1.0f, false, 2, null), composerStartRestartGroup, 0);
            GifImageUIState gifImageUIState = successErrorUIState.f1234a;
            ButtonUIState buttonUIState = successErrorUIState.e;
            GifUIKt.a(null, gifImageUIState, composerStartRestartGroup, 0, 1);
            SpacerKt.Spacer(SizeKt.m814height3ABfNKs(companion2, ChaloTheme.b(composerStartRestartGroup, 0).i), composerStartRestartGroup, 0);
            ChaloTextViewKt.a(null, successErrorUIState.b, null, null, composerStartRestartGroup, 0, 13);
            SpacerKt.Spacer(SizeKt.m814height3ABfNKs(companion2, ChaloTheme.b(composerStartRestartGroup, 0).g), composerStartRestartGroup, 0);
            ChaloTextViewKt.a(null, successErrorUIState.c, null, null, composerStartRestartGroup, 0, 13);
            SpacerKt.Spacer(dq.a(columnScopeInstance, companion2, 1.0f, false, 2, null), composerStartRestartGroup, 0);
            ChaloFilledButtonKt.a(0, 0, composerStartRestartGroup, SizeKt.m814height3ABfNKs(SizeKt.fillMaxWidth$default(companion2, 0.0f, 1, null), ChaloThemeHelper.a().n), successErrorUIState.d);
            SpacerKt.Spacer(SizeKt.m814height3ABfNKs(companion2, ChaloTheme.b(composerStartRestartGroup, 0).h), composerStartRestartGroup, 0);
            if (buttonUIState != null) {
                composerStartRestartGroup.startReplaceGroup(-1860548195);
                ChaloFilledButtonKt.a(0, 0, composerStartRestartGroup, SizeKt.m814height3ABfNKs(SizeKt.fillMaxWidth$default(companion2, 0.0f, 1, null), ChaloThemeHelper.a().n), buttonUIState);
            } else {
                composerStartRestartGroup.startReplaceGroup(-1871137299);
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
            scopeUpdateScopeEndRestartGroup.updateScope(new b0(successErrorUIState, modifier, i, 28));
        }
    }

    public static final void i(SurveyTimePickerDialogUIState surveyTimePickerDialogUIState, Composer composer, int i) {
        int i2;
        Composer composerStartRestartGroup = composer.startRestartGroup(845486600);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changed(surveyTimePickerDialogUIState) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (composerStartRestartGroup.shouldExecute((i2 & 3) != 2, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(845486600, i2, -1, "app.chalo.chalobususerprofile.ui.compose.SurveyTimePickerDialog (ChaloBusUserProfileSurveyMainScreen.kt:198)");
            }
            AndroidDialog_androidKt.Dialog(surveyTimePickerDialogUIState.f, null, ComposableLambdaKt.rememberComposableLambda(104221521, true, new n4(surveyTimePickerDialogUIState, 6), composerStartRestartGroup, 54), composerStartRestartGroup, 384, 2);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new e0(surveyTimePickerDialogUIState, i, 24));
        }
    }

    public static final void j(ProfileSurveyUIState.WorkTimingUIState workTimingUIState, Modifier modifier, Composer composer, int i) {
        int i2;
        Composer composer2;
        Composer composerStartRestartGroup = composer.startRestartGroup(1297432991);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(workTimingUIState) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changed(modifier) ? 32 : 16;
        }
        if (composerStartRestartGroup.shouldExecute((i2 & 19) != 18, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1297432991, i2, -1, "app.chalo.chalobususerprofile.ui.compose.SurveyWorkTimingStep (ChaloBusUserProfileSurveyMainScreen.kt:129)");
            }
            OfficeInfoUIState officeInfoUIState = workTimingUIState.d;
            OfficeInfoUIState officeInfoUIState2 = workTimingUIState.e;
            WorkTimingUISpecs workTimingUISpecs = workTimingUIState.f;
            Modifier modifierVerticalScroll$default = ScrollKt.verticalScroll$default(SizeKt.fillMaxWidth$default(modifier, 0.0f, 1, null), ScrollKt.rememberScrollState(0, composerStartRestartGroup, 0, 1), false, null, false, 14, null);
            Arrangement arrangement = Arrangement.INSTANCE;
            Arrangement.Vertical top = arrangement.getTop();
            Alignment.Companion companion = Alignment.INSTANCE;
            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(top, companion.getStart(), composerStartRestartGroup, 0);
            long currentCompositeKeyHashCode = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
            int i3 = (int) (currentCompositeKeyHashCode ^ (currentCompositeKeyHashCode >>> 32));
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierVerticalScroll$default);
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
            Modifier.Companion companion3 = Modifier.INSTANCE;
            SpacerKt.Spacer(SizeKt.m814height3ABfNKs(companion3, workTimingUISpecs.f1239a), composerStartRestartGroup, 0);
            MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(arrangement.getStart(), companion.getCenterVertically(), composerStartRestartGroup, 48);
            long currentCompositeKeyHashCode2 = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
            int i4 = (int) ((currentCompositeKeyHashCode2 >>> 32) ^ currentCompositeKeyHashCode2);
            CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, companion3);
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
            Updater.m3923setimpl(composerM3915constructorimpl2, modifierMaterializeModifier2, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion2, composerM3915constructorimpl2, Integer.valueOf(i4), composerM3915constructorimpl2));
            RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
            CommonImageKt.a(workTimingUIState.f1235a, null, false, composerStartRestartGroup, 0, 6);
            SpacerKt.Spacer(SizeKt.m833width3ABfNKs(companion3, ChaloThemeHelper.a().e), composerStartRestartGroup, 0);
            ChaloTextViewKt.a(null, workTimingUIState.b, null, null, composerStartRestartGroup, 0, 13);
            composerStartRestartGroup.endNode();
            SpacerKt.Spacer(SizeKt.m814height3ABfNKs(companion3, workTimingUISpecs.b), composerStartRestartGroup, 0);
            ChaloTextViewKt.a(null, workTimingUIState.c, null, null, composerStartRestartGroup, 0, 13);
            composer2 = composerStartRestartGroup;
            SpacerKt.Spacer(SizeKt.m814height3ABfNKs(companion3, workTimingUISpecs.c), composer2, 0);
            d(officeInfoUIState, null, composer2, 0);
            SpacerKt.Spacer(SizeKt.m814height3ABfNKs(companion3, workTimingUISpecs.d), composer2, 0);
            d(officeInfoUIState2, null, composer2, 0);
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
            scopeUpdateScopeEndRestartGroup.updateScope(new b0(workTimingUIState, modifier, i, 27));
        }
    }

    public static final void k(TextUIState textUIState, UiEventHandler uiEventHandler, Composer composer, int i) {
        int i2;
        Composer composerStartRestartGroup = composer.startRestartGroup(1229798081);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? composerStartRestartGroup.changed(textUIState) : composerStartRestartGroup.changedInstance(textUIState) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(uiEventHandler) ? 32 : 16;
        }
        if (composerStartRestartGroup.shouldExecute((i2 & 19) != 18, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1229798081, i2, -1, "app.chalo.chalobususerprofile.ui.compose.TimeFieldComposable (ChaloBusUserProfileSurveyMainScreen.kt:316)");
            }
            Modifier modifierM275borderxT4_qwU = BorderKt.m275borderxT4_qwU(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), Dp.m7278constructorimpl(1), ChaloTheme.a(composerStartRestartGroup, 0).m0, ChaloTheme.d(composerStartRestartGroup, 0).g);
            boolean zChangedInstance = composerStartRestartGroup.changedInstance(uiEventHandler);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new ei(uiEventHandler, 0);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            Modifier modifierM784padding3ABfNKs = PaddingKt.m784padding3ABfNKs(ClickableKt.m299clickableoSLSa3U$default(modifierM275borderxT4_qwU, false, null, null, null, (Function0) objRememberedValue, 15, null), ChaloTheme.b(composerStartRestartGroup, 0).h);
            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
            long currentCompositeKeyHashCode = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
            int i3 = (int) ((currentCompositeKeyHashCode >>> 32) ^ currentCompositeKeyHashCode);
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierM784padding3ABfNKs);
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
            pk0.v(companion, composerM3915constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy, composerM3915constructorimpl, currentCompositionLocalMap);
            Updater.m3923setimpl(composerM3915constructorimpl, modifierMaterializeModifier, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion, composerM3915constructorimpl, Integer.valueOf(i3), composerM3915constructorimpl));
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            TextKt.c(textUIState, null, null, null, composerStartRestartGroup, i2 & 14, 14);
            composerStartRestartGroup.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new b0(textUIState, uiEventHandler, i, 25));
        }
    }

    public static final void l(List list, Composer composer, int i) {
        int i2;
        Composer composerStartRestartGroup = composer.startRestartGroup(1763618558);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(list) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (composerStartRestartGroup.shouldExecute((i2 & 3) != 2, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1763618558, i2, -1, "app.chalo.chalobususerprofile.ui.compose.VariabilityChipsRow (ChaloBusUserProfileSurveyMainScreen.kt:335)");
            }
            Arrangement.HorizontalOrVertical horizontalOrVerticalM672spacedBy0680j_4 = Arrangement.INSTANCE.m672spacedBy0680j_4(ChaloTheme.b(composerStartRestartGroup, 0).e);
            Modifier.Companion companion = Modifier.INSTANCE;
            MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(horizontalOrVerticalM672spacedBy0680j_4, Alignment.INSTANCE.getTop(), composerStartRestartGroup, 0);
            long currentCompositeKeyHashCode = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
            int i3 = (int) (currentCompositeKeyHashCode ^ (currentCompositeKeyHashCode >>> 32));
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
            pk0.v(companion2, composerM3915constructorimpl, measurePolicyRowMeasurePolicy, composerM3915constructorimpl, currentCompositionLocalMap);
            Updater.m3923setimpl(composerM3915constructorimpl, modifierMaterializeModifier, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion2, composerM3915constructorimpl, Integer.valueOf(i3), composerM3915constructorimpl));
            RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
            composerStartRestartGroup.startReplaceGroup(-251008376);
            Iterator it = list.iterator();
            while (it.hasNext()) {
                TimingVariabilityChipUIState timingVariabilityChipUIState = (TimingVariabilityChipUIState) it.next();
                Modifier modifierM263backgroundbw27NRU = BackgroundKt.m263backgroundbw27NRU(ClipKt.clip(Modifier.INSTANCE, ChaloTheme.d(composerStartRestartGroup, 0).c), ChaloColorTokenKt.c(timingVariabilityChipUIState.c), ChaloTheme.d(composerStartRestartGroup, 0).c);
                BorderUIState borderUIState = timingVariabilityChipUIState.b;
                Modifier modifierM275borderxT4_qwU = BorderKt.m275borderxT4_qwU(modifierM263backgroundbw27NRU, borderUIState.f7793a, ChaloColorTokenKt.c(borderUIState.b), ChaloTheme.d(composerStartRestartGroup, 0).c);
                boolean zChangedInstance = composerStartRestartGroup.changedInstance(timingVariabilityChipUIState);
                Object objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = new fi(timingVariabilityChipUIState, 0);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                ChaloTextViewKt.a(PaddingKt.m785paddingVpY3zN4(ClickableKt.m299clickableoSLSa3U$default(modifierM275borderxT4_qwU, false, null, null, null, (Function0) objRememberedValue, 15, null), ChaloTheme.b(composerStartRestartGroup, 0).g, ChaloTheme.b(composerStartRestartGroup, 0).f), TextUIState.ChaloTextUIState.a(timingVariabilityChipUIState.f1238a, null, null, UITextAlign.Center, 8159), null, null, composerStartRestartGroup, 0, 12);
            }
            if (b3.t(composerStartRestartGroup)) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new eh(list, i, 2));
        }
    }
}
