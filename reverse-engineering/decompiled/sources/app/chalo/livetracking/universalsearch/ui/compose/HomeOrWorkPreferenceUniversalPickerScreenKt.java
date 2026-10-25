package app.chalo.livetracking.universalsearch.ui.compose;

import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.lazy.LazyDslKt;
import androidx.compose.material3.IconKt;
import androidx.compose.material3.TextFieldColors;
import androidx.compose.material3.TextFieldDefaults;
import androidx.compose.material3.TextKt;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.focus.FocusRequester;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.text.TextRange;
import androidx.compose.ui.text.input.TextFieldValue;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import app.chalo.compose.ChaloToolBarKt;
import app.chalo.compose.components.ChaloDividerComposableKt;
import app.chalo.compose.components.textfields.ChaloTextFieldKt;
import app.chalo.compose.resources.PainterResourceHelperKt;
import app.chalo.compose.theme.ChaloTheme;
import app.chalo.compose.theme.ChaloThemeHelper;
import app.chalo.compose.theme.ChaloThemeKt;
import app.chalo.livetracking.universalsearch.ui.SearchScreenLayoutType;
import app.chalo.livetracking.universalsearch.ui.UniversalPickerViewState;
import app.chalo.livetracking.universalsearch.ui.compose.HomeOrWorkPreferenceUniversalPickerScreenKt;
import app.chalo.providers.iconassetprovider.IconType;
import app.chalo.scenes.args.UniversalPickerHeaderIcon;
import app.chalo.uistate.base.ChaloColorToken;
import app.chalo.uistate.base.ChaloColorTokenKt;
import defpackage.gf;
import defpackage.ip;
import defpackage.jp;
import defpackage.kp;
import defpackage.nf1;
import defpackage.pk0;
import defpackage.pp;
import defpackage.q70;
import defpackage.r1;
import defpackage.xc;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002¨\u0006\u0002²\u0006\u000e\u0010\u0001\u001a\u00020\u00008\n@\nX\u008a\u008e\u0002"}, d2 = {"Landroidx/compose/ui/text/input/TextFieldValue;", "textFieldState", "livetracking_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class HomeOrWorkPreferenceUniversalPickerScreenKt {

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f5096a;
        public static final /* synthetic */ int[] b;

        static {
            int[] iArr = new int[UniversalPickerHeaderIcon.values().length];
            try {
                iArr[UniversalPickerHeaderIcon.HOME.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[UniversalPickerHeaderIcon.WORK.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f5096a = iArr;
            int[] iArr2 = new int[SearchScreenLayoutType.values().length];
            try {
                iArr2[SearchScreenLayoutType.REMOTE_SEARCHED_ITEM_SCREEN.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr2[SearchScreenLayoutType.RECENT_AND_FAVORITE_SCREEN.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[SearchScreenLayoutType.RECENT_RESULT_SCREEN.ordinal()] = 3;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[SearchScreenLayoutType.ERROR_SCREEN.ordinal()] = 4;
            } catch (NoSuchFieldError unused6) {
            }
            b = iArr2;
        }
    }

    public static final void a(Modifier modifier, UniversalPickerViewState universalPickerViewState, Function1 function1, Composer composer, int i) {
        Modifier modifier2;
        int i2;
        Composer composerStartRestartGroup = composer.startRestartGroup(-328717489);
        if ((i & 6) == 0) {
            modifier2 = modifier;
            i2 = (composerStartRestartGroup.changed(modifier2) ? 4 : 2) | i;
        } else {
            modifier2 = modifier;
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(universalPickerViewState) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(function1) ? 256 : 128;
        }
        if (composerStartRestartGroup.shouldExecute((i2 & 147) != 146, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-328717489, i2, -1, "app.chalo.livetracking.universalsearch.ui.compose.HomeOrWorkPreferenceRecentSearchedResultsComposable (HomeOrWorkPreferenceUniversalPickerScreen.kt:203)");
            }
            boolean zChangedInstance = composerStartRestartGroup.changedInstance(universalPickerViewState) | ((i2 & 896) == 256);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new jp(universalPickerViewState, function1, 1);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            LazyDslKt.LazyColumn(modifier2, null, null, false, null, null, null, false, null, (Function1) objRememberedValue, composerStartRestartGroup, i2 & 14, TypedValues.PositionType.TYPE_POSITION_TYPE);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new kp(modifier, universalPickerViewState, function1, i, 1));
        }
    }

    public static final void b(Modifier modifier, UniversalPickerViewState viewState, TextFieldValue textFieldState, Function1 sendIntent, Composer composer, int i) {
        int i2;
        Intrinsics.i(viewState, "viewState");
        Intrinsics.i(textFieldState, "textFieldState");
        Intrinsics.i(sendIntent, "sendIntent");
        Composer composerStartRestartGroup = composer.startRestartGroup(-2143850830);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changed(modifier) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(viewState) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= composerStartRestartGroup.changed(textFieldState) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(sendIntent) ? 2048 : 1024;
        }
        if (composerStartRestartGroup.shouldExecute((i2 & 1171) != 1170, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-2143850830, i2, -1, "app.chalo.livetracking.universalsearch.ui.compose.HomeOrWorkPreferenceSearchLayout (HomeOrWorkPreferenceUniversalPickerScreen.kt:167)");
            }
            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composerStartRestartGroup, 0);
            long currentCompositeKeyHashCode = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
            int i3 = (int) ((currentCompositeKeyHashCode >>> 32) ^ currentCompositeKeyHashCode);
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
            int i4 = WhenMappings.b[viewState.f.ordinal()];
            if (i4 == 1) {
                composerStartRestartGroup.startReplaceGroup(-294535432);
                int i5 = i2 << 3;
                UniversalSearchListComposableKt.c(viewState.b, false, false, textFieldState, sendIntent, composerStartRestartGroup, (i5 & 7168) | 432 | (i5 & 57344));
                composerStartRestartGroup.endReplaceGroup();
            } else if (i4 == 2) {
                composerStartRestartGroup.startReplaceGroup(-540293596);
                composerStartRestartGroup.endReplaceGroup();
            } else if (i4 == 3) {
                composerStartRestartGroup.startReplaceGroup(-294520751);
                a(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), viewState, sendIntent, composerStartRestartGroup, ((i2 >> 3) & 896) | (i2 & 112) | 6);
                composerStartRestartGroup.endReplaceGroup();
            } else {
                if (i4 != 4) {
                    throw pk0.p(composerStartRestartGroup, -294538280);
                }
                composerStartRestartGroup.startReplaceGroup(-294511754);
                UniversalPickerComposableKt.e(viewState, sendIntent, textFieldState, composerStartRestartGroup, ((i2 >> 3) & 14) | ((i2 >> 6) & 112) | (i2 & 896));
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
            scopeUpdateScopeEndRestartGroup.updateScope(new ip(modifier, viewState, textFieldState, sendIntent, i, 1));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void c(UniversalPickerViewState viewState, FocusRequester focusRequester, Function1 sendIntent, Composer composer, int i) {
        int i2;
        Composer composer2;
        Intrinsics.i(viewState, "viewState");
        Intrinsics.i(focusRequester, "focusRequester");
        Intrinsics.i(sendIntent, "sendIntent");
        Composer composerStartRestartGroup = composer.startRestartGroup(-1427872074);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(viewState) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changed(focusRequester) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(sendIntent) ? 256 : 128;
        }
        if (composerStartRestartGroup.shouldExecute((i2 & 147) != 146, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1427872074, i2, -1, "app.chalo.livetracking.universalsearch.ui.compose.HomeOrWorkPreferenceUniversalPickerScreen (HomeOrWorkPreferenceUniversalPickerScreen.kt:46)");
            }
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            Composer.Companion companion = Composer.INSTANCE;
            if (objRememberedValue == companion.getEmpty()) {
                objRememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(new TextFieldValue(viewState.k, 0L, (TextRange) null, 6, (DefaultConstructorMarker) null), null, 2, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            MutableState mutableState = (MutableState) objRememberedValue;
            if (viewState.j) {
                mutableState.setValue(new TextFieldValue("", 0L, (TextRange) null, 6, (DefaultConstructorMarker) null));
            }
            Modifier.Companion companion2 = Modifier.INSTANCE;
            Modifier modifierM264backgroundbw27NRU$default = BackgroundKt.m264backgroundbw27NRU$default(SizeKt.fillMaxSize$default(companion2, 0.0f, 1, null), ChaloTheme.a(composerStartRestartGroup, 0).t, null, 2, null);
            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composerStartRestartGroup, 0);
            long currentCompositeKeyHashCode = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
            int i3 = (int) (currentCompositeKeyHashCode ^ (currentCompositeKeyHashCode >>> 32));
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
            Updater.m3923setimpl(composerM3915constructorimpl, modifierMaterializeModifier, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion3, composerM3915constructorimpl, Integer.valueOf(i3), composerM3915constructorimpl));
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
            ChaloToolBarKt.g(PaddingKt.m784padding3ABfNKs(companion2, ChaloThemeHelper.a().h), "", 0L, null, composerStartRestartGroup, 48, 12);
            d(viewState.u, viewState.v, viewState.w, composerStartRestartGroup, 0);
            Modifier modifierM814height3ABfNKs = SizeKt.m814height3ABfNKs(SizeKt.fillMaxWidth$default(PaddingKt.m784padding3ABfNKs(companion2, ChaloThemeHelper.a().h), 0.0f, 1, null), ChaloThemeHelper.a().n);
            ChaloColorToken.LightGrey lightGrey = ChaloColorToken.LightGrey.f9815a;
            Modifier modifierM788paddingqDBjuR0$default = PaddingKt.m788paddingqDBjuR0$default(BackgroundKt.m263backgroundbw27NRU(modifierM814height3ABfNKs, ChaloColorTokenKt.c(lightGrey), ChaloThemeKt.d(ChaloThemeHelper.d.f)), ChaloThemeHelper.a().h, 0.0f, 0.0f, 0.0f, 14, null);
            TextFieldValue textFieldValue = (TextFieldValue) mutableState.getValue();
            TextFieldDefaults textFieldDefaults = TextFieldDefaults.INSTANCE;
            long jC = ChaloColorTokenKt.c(lightGrey);
            ChaloColorToken.Transparent transparent = ChaloColorToken.Transparent.f9864a;
            TextFieldColors textFieldColorsC = ChaloTextFieldKt.c(textFieldDefaults, jC, 0L, 0L, 0L, ChaloColorTokenKt.c(transparent), 0L, 0L, 0L, 0L, 0L, ChaloColorTokenKt.c(transparent), ChaloColorTokenKt.c(transparent), ChaloColorTokenKt.c(transparent), 0L, ChaloColorTokenKt.c(ChaloColorToken.OrangePrimary.f9835a), 0L, 0L, 0L, 0L, 0L, null, composerStartRestartGroup, 6, 2073582);
            int i4 = i2 & 896;
            boolean z = i4 == 256;
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (z || objRememberedValue2 == companion.getEmpty()) {
                objRememberedValue2 = new xc(sendIntent, mutableState, 3);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            Function1 function1 = (Function1) objRememberedValue2;
            boolean z2 = i4 == 256;
            Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
            if (z2 || objRememberedValue3 == companion.getEmpty()) {
                objRememberedValue3 = new q70(sendIntent, 3);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
            }
            CitySelectionUniversalPickerScreenKt.i(modifierM788paddingqDBjuR0$default, focusRequester, textFieldValue, viewState, textFieldColorsC, function1, (Function0) objRememberedValue3, composerStartRestartGroup, (i2 & 112) | ((i2 << 9) & 7168), 0);
            composer2 = composerStartRestartGroup;
            ChaloDividerComposableKt.b(BackgroundKt.m264backgroundbw27NRU$default(SizeKt.m814height3ABfNKs(SizeKt.fillMaxWidth$default(companion2, 0.0f, 1, null), ChaloThemeHelper.a().f), ChaloColorTokenKt.c(lightGrey), null, 2, null), 0L, composer2, 0, 2);
            int i5 = i2 << 3;
            b(SizeKt.fillMaxWidth$default(companion2, 0.0f, 1, null), viewState, (TextFieldValue) mutableState.getValue(), sendIntent, composer2, (i5 & 112) | 6 | (i5 & 7168));
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
            scopeUpdateScopeEndRestartGroup.updateScope(new pp(viewState, focusRequester, sendIntent, i, 1));
        }
    }

    public static final void d(final String str, final String str2, final UniversalPickerHeaderIcon universalPickerHeaderIcon, Composer composer, final int i) {
        int i2;
        Composer composer2;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Function2<? super Composer, ? super Integer, Unit> function2;
        Modifier.Companion companion;
        int i3;
        IconType iconType;
        int i4;
        ComposeUiNode.Companion companion2;
        IconType iconType2;
        Composer composerStartRestartGroup = composer.startRestartGroup(-576152123);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changed(str) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changed(str2) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= composerStartRestartGroup.changed(universalPickerHeaderIcon == null ? -1 : universalPickerHeaderIcon.ordinal()) ? 256 : 128;
        }
        if (composerStartRestartGroup.shouldExecute((i2 & 147) != 146, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-576152123, i2, -1, "app.chalo.livetracking.universalsearch.ui.compose.SurveyHomeWorkHeader (HomeOrWorkPreferenceUniversalPickerScreen.kt:118)");
            }
            if (str == null || str.length() == 0) {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                final int i5 = 0;
                function2 = new Function2() { // from class: z70
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        int i6 = i5;
                        Composer composer3 = (Composer) obj;
                        ((Integer) obj2).intValue();
                        switch (i6) {
                            case 0:
                                HomeOrWorkPreferenceUniversalPickerScreenKt.d(str, str2, universalPickerHeaderIcon, composer3, RecomposeScopeImplKt.updateChangedFlags(i | 1));
                                break;
                            default:
                                HomeOrWorkPreferenceUniversalPickerScreenKt.d(str, str2, universalPickerHeaderIcon, composer3, RecomposeScopeImplKt.updateChangedFlags(i | 1));
                                break;
                        }
                        return Unit.f17538a;
                    }
                };
            } else {
                Modifier.Companion companion3 = Modifier.INSTANCE;
                Modifier modifierM786paddingVpY3zN4$default = PaddingKt.m786paddingVpY3zN4$default(BackgroundKt.m264backgroundbw27NRU$default(SizeKt.fillMaxWidth$default(companion3, 0.0f, 1, null), ChaloTheme.a(composerStartRestartGroup, 0).t, null, 2, null), ChaloTheme.b(composerStartRestartGroup, 0).h, 0.0f, 2, null);
                Arrangement arrangement = Arrangement.INSTANCE;
                Arrangement.Vertical top = arrangement.getTop();
                Alignment.Companion companion4 = Alignment.INSTANCE;
                MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(top, companion4.getStart(), composerStartRestartGroup, 0);
                long currentCompositeKeyHashCode = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
                int i6 = (int) (currentCompositeKeyHashCode ^ (currentCompositeKeyHashCode >>> 32));
                CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierM786paddingVpY3zN4$default);
                ComposeUiNode.Companion companion5 = ComposeUiNode.INSTANCE;
                Function0<ComposeUiNode> constructor = companion5.getConstructor();
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
                pk0.v(companion5, composerM3915constructorimpl, measurePolicyColumnMeasurePolicy, composerM3915constructorimpl, currentCompositionLocalMap);
                Updater.m3923setimpl(composerM3915constructorimpl, modifierMaterializeModifier, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion5, composerM3915constructorimpl, Integer.valueOf(i6), composerM3915constructorimpl));
                ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
                if (str2 == null || str2.length() == 0) {
                    companion = companion3;
                    i3 = i2;
                    iconType = null;
                    i4 = 0;
                    companion2 = companion5;
                    composerStartRestartGroup.startReplaceGroup(-462394425);
                    composerStartRestartGroup.endReplaceGroup();
                } else {
                    composerStartRestartGroup.startReplaceGroup(-457335597);
                    i3 = i2;
                    iconType = null;
                    companion2 = companion5;
                    i4 = 0;
                    companion = companion3;
                    TextKt.m2623TextNvy7gAk(str2, null, ChaloTheme.a(composerStartRestartGroup, 0).t0, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ChaloTheme.e(composerStartRestartGroup, 0).getBodySmall(), composerStartRestartGroup, (i2 >> 3) & 14, 0, 131066);
                    composerStartRestartGroup = composerStartRestartGroup;
                    gf.r(companion, ChaloTheme.b(composerStartRestartGroup, 0).d, composerStartRestartGroup, 0);
                }
                MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(arrangement.getStart(), companion4.getCenterVertically(), composerStartRestartGroup, 48);
                long currentCompositeKeyHashCode2 = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, i4);
                int i7 = (int) (currentCompositeKeyHashCode2 ^ (currentCompositeKeyHashCode2 >>> 32));
                CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, companion);
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
                ComposeUiNode.Companion companion6 = companion2;
                pk0.v(companion6, composerM3915constructorimpl2, measurePolicyRowMeasurePolicy, composerM3915constructorimpl2, currentCompositionLocalMap2);
                Updater.m3923setimpl(composerM3915constructorimpl2, modifierMaterializeModifier2, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion6, composerM3915constructorimpl2, Integer.valueOf(i7), composerM3915constructorimpl2));
                RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
                int i8 = universalPickerHeaderIcon == null ? -1 : WhenMappings.f5096a[universalPickerHeaderIcon.ordinal()];
                if (i8 == -1) {
                    iconType2 = iconType;
                } else if (i8 == 1) {
                    iconType2 = IconType.FAVORITE_HOME;
                } else {
                    if (i8 != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                    iconType2 = IconType.FAVORITE_WORK;
                }
                if (iconType2 != null) {
                    composerStartRestartGroup.startReplaceGroup(1988677352);
                    IconKt.m2070Iconww6aTOc(PainterResourceHelperKt.a(iconType2, composerStartRestartGroup, i4), (String) null, SizeKt.m828size3ABfNKs(companion, ChaloThemeHelper.a().W), ChaloColorTokenKt.c(ChaloColorToken.Black.f9759a), composerStartRestartGroup, Painter.$stable | 48, 0);
                    nf1.t(companion, ChaloTheme.b(composerStartRestartGroup, i4).e, composerStartRestartGroup, i4);
                } else {
                    composerStartRestartGroup.startReplaceGroup(1983010211);
                    composerStartRestartGroup.endReplaceGroup();
                }
                composer2 = composerStartRestartGroup;
                TextKt.m2623TextNvy7gAk(str, null, ChaloTheme.a(composerStartRestartGroup, i4).e, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ChaloTheme.e(composerStartRestartGroup, i4).getDisplaySmall(), composer2, i3 & 14, 0, 131066);
                if (r1.k(composer2)) {
                    ComposerKt.traceEventEnd();
                }
            }
            scopeUpdateScopeEndRestartGroup.updateScope(function2);
        }
        composer2 = composerStartRestartGroup;
        composer2.skipToGroupEnd();
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            final int i9 = 1;
            function2 = new Function2() { // from class: z70
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    int i10 = i9;
                    Composer composer3 = (Composer) obj;
                    ((Integer) obj2).intValue();
                    switch (i10) {
                        case 0:
                            HomeOrWorkPreferenceUniversalPickerScreenKt.d(str, str2, universalPickerHeaderIcon, composer3, RecomposeScopeImplKt.updateChangedFlags(i | 1));
                            break;
                        default:
                            HomeOrWorkPreferenceUniversalPickerScreenKt.d(str, str2, universalPickerHeaderIcon, composer3, RecomposeScopeImplKt.updateChangedFlags(i | 1));
                            break;
                    }
                    return Unit.f17538a;
                }
            };
            scopeUpdateScopeEndRestartGroup.updateScope(function2);
        }
    }
}
