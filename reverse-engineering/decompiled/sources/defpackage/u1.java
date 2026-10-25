package defpackage;

import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.text.KeyboardActions;
import androidx.compose.foundation.text.KeyboardOptions;
import androidx.compose.foundation.text.contextmenu.internal.PlatformDefaultTextContextMenuProviders_androidKt;
import androidx.compose.foundation.text.contextmenu.provider.BasicTextContextMenuProvider;
import androidx.compose.material3.NavigationBarDefaults;
import androidx.compose.material3.TextFieldColors;
import androidx.compose.material3.TextFieldDefaults;
import androidx.compose.material3.TextFieldKt;
import androidx.compose.material3.TextKt;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.MutableIntState;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.ClipKt;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.input.TextFieldValue;
import androidx.compose.ui.text.input.VisualTransformation;
import androidx.compose.ui.unit.Dp;
import androidx.profileinstaller.ProfileVerifier;
import app.chalo.compose.components.ChaloTextViewKt;
import app.chalo.compose.components.PlotlineComposeWidgetKt;
import app.chalo.compose.components.buttons.ChaloFilledButtonKt;
import app.chalo.compose.components.image.CommonImageKt;
import app.chalo.compose.components.navigationbar.NavigationBarKt;
import app.chalo.compose.resources.StringResourcesHelperKt;
import app.chalo.compose.theme.ChaloTheme;
import app.chalo.compose.theme.ChaloThemeKt;
import app.chalo.compose.theme.ChaloTypographyKt;
import app.chalo.home.nearbytrips.data.model.NearbyStopAndTripsUiModel;
import app.chalo.home.nearbytrips.ui.StopNearbyTripsCardKt;
import app.chalo.home.ui.chalobusrouteinfo.RouteSuggestionTimePickerUISpec;
import app.chalo.home.ui.chalobusrouteinfo.RouteSuggestionTimePickerUIState;
import app.chalo.homescreen.data.model.app.NavigationTabAppModel;
import app.chalo.livetracking.universalsearch.ui.compose.ComposableSingletons$AddToFavoriteComposeDialogKt;
import app.chalo.premiumbus.ui.slotselection.PremiumBusSlotSelectionUiStateKt;
import app.chalo.providers.stringprovider.StringEnum;
import app.chalo.uistate.base.ChaloColorTokenKt;
import app.chalo.uistate.base.UiEventHandler;
import app.chalo.uistate.button.ButtonUIState;
import java.util.List;
import java.util.Locale;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class u1 implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f19705a = 0;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ u1(MutableState mutableState, MutableState mutableState2, Function0 function0, Function1 function1, MutableState mutableState3) {
        this.b = mutableState;
        this.c = mutableState2;
        this.e = function0;
        this.f = function1;
        this.d = mutableState3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.f19705a;
        Unit unit = Unit.f17538a;
        Object obj3 = this.e;
        Object obj4 = this.f;
        Object obj5 = this.d;
        Object obj6 = this.b;
        Object obj7 = this.c;
        switch (i) {
            case 0:
                MutableState mutableState = (MutableState) obj6;
                MutableState mutableState2 = (MutableState) obj7;
                Function0 function0 = (Function0) obj3;
                Function1 function1 = (Function1) obj4;
                MutableState mutableState3 = (MutableState) obj5;
                Composer composer = (Composer) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (composer.shouldExecute((iIntValue & 3) != 2, iIntValue & 1)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(38393955, iIntValue, -1, "app.chalo.livetracking.universalsearch.ui.compose.AddToFavoriteComposeDialog.<anonymous> (AddToFavoriteComposeDialog.kt:52)");
                    }
                    Modifier.Companion companion = Modifier.INSTANCE;
                    Modifier modifierM833width3ABfNKs = SizeKt.m833width3ABfNKs(companion, ChaloTheme.b(composer, 0).x);
                    Color.Companion companion2 = Color.INSTANCE;
                    Modifier modifierM784padding3ABfNKs = PaddingKt.m784padding3ABfNKs(BackgroundKt.m264backgroundbw27NRU$default(modifierM833width3ABfNKs, companion2.m4642getWhite0d7_KjU(), null, 2, null), ChaloTheme.b(composer, 0).g);
                    Arrangement arrangement = Arrangement.INSTANCE;
                    Arrangement.HorizontalOrVertical center = arrangement.getCenter();
                    Alignment.Companion companion3 = Alignment.INSTANCE;
                    MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(center, companion3.getStart(), composer, 6);
                    long currentCompositeKeyHashCode = ComposablesKt.getCurrentCompositeKeyHashCode(composer, 0);
                    int i2 = (int) (currentCompositeKeyHashCode ^ (currentCompositeKeyHashCode >>> 32));
                    CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composer, modifierM784padding3ABfNKs);
                    ComposeUiNode.Companion companion4 = ComposeUiNode.INSTANCE;
                    Function0<ComposeUiNode> constructor = companion4.getConstructor();
                    if (composer.getApplier() == null) {
                        ComposablesKt.invalidApplier();
                    }
                    composer.startReusableNode();
                    if (composer.getInserting()) {
                        composer.createNode(constructor);
                    } else {
                        composer.useNode();
                    }
                    Composer composerM3915constructorimpl = Updater.m3915constructorimpl(composer);
                    pk0.v(companion4, composerM3915constructorimpl, measurePolicyColumnMeasurePolicy, composerM3915constructorimpl, currentCompositionLocalMap);
                    Updater.m3923setimpl(composerM3915constructorimpl, modifierMaterializeModifier, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion4, composerM3915constructorimpl, Integer.valueOf(i2), composerM3915constructorimpl));
                    ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
                    TextKt.m2623TextNvy7gAk(StringResourcesHelperKt.c(StringEnum.SAVED_DESTINATION_DIALOG_TITLE, new Object[0], composer, 6), null, ChaloTheme.a(composer, 0).g, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ChaloTypographyKt.f(ChaloTheme.e(composer, 0)), composer, 0, 0, 131066);
                    TextFieldValue textFieldValue = (TextFieldValue) mutableState.getValue();
                    TextFieldColors textFieldColorsM2603colors0hiis_0 = TextFieldDefaults.INSTANCE.m2603colors0hiis_0(0L, 0L, 0L, 0L, companion2.m4640getTransparent0d7_KjU(), companion2.m4640getTransparent0d7_KjU(), companion2.m4640getTransparent0d7_KjU(), companion2.m4640getTransparent0d7_KjU(), 0L, 0L, null, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composer, 14376960, 0, 0, 0, 3072, 2147483407, 4095);
                    Composer composer2 = composer;
                    Object objRememberedValue = composer2.rememberedValue();
                    Composer.Companion companion5 = Composer.INSTANCE;
                    if (objRememberedValue == companion5.getEmpty()) {
                        objRememberedValue = new n(mutableState, mutableState2, 1);
                        composer2.updateRememberedValue(objRememberedValue);
                    }
                    TextFieldKt.TextField(textFieldValue, (Function1<? super TextFieldValue, Unit>) objRememberedValue, (Modifier) null, false, false, (TextStyle) null, (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) ComposableSingletons$AddToFavoriteComposeDialogKt.f5091a, (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) null, false, (VisualTransformation) null, (KeyboardOptions) null, (KeyboardActions) null, false, 0, 0, (MutableInteractionSource) null, (Shape) null, textFieldColorsM2603colors0hiis_0, composer2, 12582960, 0, 0, 4194172);
                    SpacerKt.Spacer(SizeKt.m814height3ABfNKs(companion, ChaloTheme.b(composer2, 0).d), composer2, 0);
                    if (((Boolean) mutableState2.getValue()).booleanValue()) {
                        composer2.startReplaceGroup(-566022968);
                        TextKt.m2623TextNvy7gAk(StringResourcesHelperKt.c(StringEnum.ENTER_FAV_TITLE, new Object[0], composer2, 6), null, ChaloTheme.a(composer2, 0).o, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ChaloTypographyKt.d(ChaloTheme.e(composer2, 0)), composer2, 0, 0, 131066);
                        composer2 = composer2;
                    } else {
                        composer2.startReplaceGroup(-569296599);
                    }
                    composer2.endReplaceGroup();
                    SpacerKt.Spacer(SizeKt.m814height3ABfNKs(companion, ChaloTheme.b(composer2, 0).f), composer2, 0);
                    Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null);
                    MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(arrangement.getEnd(), companion3.getTop(), composer2, 6);
                    long currentCompositeKeyHashCode2 = ComposablesKt.getCurrentCompositeKeyHashCode(composer2, 0);
                    int i3 = (int) (currentCompositeKeyHashCode2 ^ (currentCompositeKeyHashCode2 >>> 32));
                    CompositionLocalMap currentCompositionLocalMap2 = composer2.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(composer2, modifierFillMaxWidth$default);
                    Function0<ComposeUiNode> constructor2 = companion4.getConstructor();
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
                    pk0.v(companion4, composerM3915constructorimpl2, measurePolicyRowMeasurePolicy, composerM3915constructorimpl2, currentCompositionLocalMap2);
                    Updater.m3923setimpl(composerM3915constructorimpl2, modifierMaterializeModifier2, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion4, composerM3915constructorimpl2, Integer.valueOf(i3), composerM3915constructorimpl2));
                    RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
                    String strC = StringResourcesHelperKt.c(StringEnum.CANCEL, new Object[0], composer2, 6);
                    Locale locale = Locale.ROOT;
                    String upperCase = strC.toUpperCase(locale);
                    Intrinsics.h(upperCase, "toUpperCase(...)");
                    TextStyle textStyleC = ChaloTypographyKt.c(ChaloTheme.e(composer2, 0));
                    long j = ChaloTheme.a(composer2, 0).f1915a;
                    Modifier modifierM784padding3ABfNKs2 = PaddingKt.m784padding3ABfNKs(companion, ChaloTheme.b(composer2, 0).f);
                    boolean zChanged = composer2.changed(function0);
                    Object objRememberedValue2 = composer2.rememberedValue();
                    if (zChanged || objRememberedValue2 == companion5.getEmpty()) {
                        objRememberedValue2 = new v1(function0, mutableState3, 0);
                        composer2.updateRememberedValue(objRememberedValue2);
                    }
                    TextKt.m2623TextNvy7gAk(upperCase, ClickableKt.m299clickableoSLSa3U$default(modifierM784padding3ABfNKs2, false, null, null, null, (Function0) objRememberedValue2, 15, null), j, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, textStyleC, composer2, 0, 0, 131064);
                    SpacerKt.Spacer(SizeKt.m833width3ABfNKs(companion, ChaloTheme.b(composer2, 0).i), composer2, 0);
                    String upperCase2 = StringResourcesHelperKt.c(StringEnum.SAVE, new Object[0], composer2, 6).toUpperCase(locale);
                    Intrinsics.h(upperCase2, "toUpperCase(...)");
                    TextStyle textStyleC2 = ChaloTypographyKt.c(ChaloTheme.e(composer2, 0));
                    long j2 = ChaloTheme.a(composer2, 0).B;
                    Modifier modifierM784padding3ABfNKs3 = PaddingKt.m784padding3ABfNKs(companion, ChaloTheme.b(composer2, 0).f);
                    boolean zChanged2 = composer2.changed(function1) | composer2.changed(function0);
                    Object objRememberedValue3 = composer2.rememberedValue();
                    if (zChanged2 || objRememberedValue3 == companion5.getEmpty()) {
                        w1 w1Var = new w1(function1, function0, mutableState, mutableState2, mutableState3, 0);
                        composer2.updateRememberedValue(w1Var);
                        objRememberedValue3 = w1Var;
                    }
                    Composer composer3 = composer2;
                    TextKt.m2623TextNvy7gAk(upperCase2, ClickableKt.m299clickableoSLSa3U$default(modifierM784padding3ABfNKs3, false, null, null, null, (Function0) objRememberedValue3, 15, null), j2, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, textStyleC2, composer3, 0, 0, 131064);
                    if (r1.k(composer3)) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer.skipToGroupEnd();
                }
                return unit;
            case 1:
                RouteSuggestionTimePickerUISpec routeSuggestionTimePickerUISpec = (RouteSuggestionTimePickerUISpec) obj7;
                RouteSuggestionTimePickerUIState routeSuggestionTimePickerUIState = (RouteSuggestionTimePickerUIState) obj5;
                MutableIntState mutableIntState = (MutableIntState) obj3;
                MutableIntState mutableIntState2 = (MutableIntState) obj4;
                MutableState mutableState4 = (MutableState) obj6;
                Composer composer4 = (Composer) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                if (composer4.shouldExecute((iIntValue2 & 3) != 2, iIntValue2 & 1)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1293193146, iIntValue2, -1, "app.chalo.home.ui.chalobusrouteinfo.RouteSuggestionTimePickerDialog.<anonymous> (ChaloBusRouteInfoMainScreen.kt:736)");
                    }
                    Modifier.Companion companion6 = Modifier.INSTANCE;
                    Modifier modifierPadding = PaddingKt.padding(BackgroundKt.m264backgroundbw27NRU$default(ClipKt.clip(SizeKt.fillMaxWidth$default(companion6, 0.0f, 1, null), ChaloThemeKt.d(routeSuggestionTimePickerUISpec.b)), ChaloColorTokenKt.c(routeSuggestionTimePickerUISpec.f3372a), null, 2, null), ChaloThemeKt.e(routeSuggestionTimePickerUISpec.c));
                    Arrangement arrangement2 = Arrangement.INSTANCE;
                    Arrangement.Vertical top = arrangement2.getTop();
                    Alignment.Companion companion7 = Alignment.INSTANCE;
                    MeasurePolicy measurePolicyColumnMeasurePolicy2 = ColumnKt.columnMeasurePolicy(top, companion7.getStart(), composer4, 0);
                    long currentCompositeKeyHashCode3 = ComposablesKt.getCurrentCompositeKeyHashCode(composer4, 0);
                    int i4 = (int) (currentCompositeKeyHashCode3 ^ (currentCompositeKeyHashCode3 >>> 32));
                    CompositionLocalMap currentCompositionLocalMap3 = composer4.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier3 = ComposedModifierKt.materializeModifier(composer4, modifierPadding);
                    ComposeUiNode.Companion companion8 = ComposeUiNode.INSTANCE;
                    Function0<ComposeUiNode> constructor3 = companion8.getConstructor();
                    if (composer4.getApplier() == null) {
                        ComposablesKt.invalidApplier();
                    }
                    composer4.startReusableNode();
                    if (composer4.getInserting()) {
                        composer4.createNode(constructor3);
                    } else {
                        composer4.useNode();
                    }
                    Composer composerM3915constructorimpl3 = Updater.m3915constructorimpl(composer4);
                    pk0.v(companion8, composerM3915constructorimpl3, measurePolicyColumnMeasurePolicy2, composerM3915constructorimpl3, currentCompositionLocalMap3);
                    Updater.m3923setimpl(composerM3915constructorimpl3, modifierMaterializeModifier3, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion8, composerM3915constructorimpl3, Integer.valueOf(i4), composerM3915constructorimpl3));
                    ColumnScopeInstance columnScopeInstance2 = ColumnScopeInstance.INSTANCE;
                    Modifier modifierFillMaxWidth$default2 = SizeKt.fillMaxWidth$default(companion6, 0.0f, 1, null);
                    MeasurePolicy measurePolicyRowMeasurePolicy2 = RowKt.rowMeasurePolicy(arrangement2.getStart(), companion7.getCenterVertically(), composer4, 48);
                    long currentCompositeKeyHashCode4 = ComposablesKt.getCurrentCompositeKeyHashCode(composer4, 0);
                    int i5 = (int) (currentCompositeKeyHashCode4 ^ (currentCompositeKeyHashCode4 >>> 32));
                    CompositionLocalMap currentCompositionLocalMap4 = composer4.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier4 = ComposedModifierKt.materializeModifier(composer4, modifierFillMaxWidth$default2);
                    Function0<ComposeUiNode> constructor4 = companion8.getConstructor();
                    if (composer4.getApplier() == null) {
                        ComposablesKt.invalidApplier();
                    }
                    composer4.startReusableNode();
                    if (composer4.getInserting()) {
                        composer4.createNode(constructor4);
                    } else {
                        composer4.useNode();
                    }
                    Composer composerM3915constructorimpl4 = Updater.m3915constructorimpl(composer4);
                    pk0.v(companion8, composerM3915constructorimpl4, measurePolicyRowMeasurePolicy2, composerM3915constructorimpl4, currentCompositionLocalMap4);
                    Updater.m3923setimpl(composerM3915constructorimpl4, modifierMaterializeModifier4, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion8, composerM3915constructorimpl4, Integer.valueOf(i5), composerM3915constructorimpl4));
                    RowScopeInstance rowScopeInstance2 = RowScopeInstance.INSTANCE;
                    ChaloTextViewKt.a(null, routeSuggestionTimePickerUIState.e, null, null, composer4, 0, 13);
                    SpacerKt.Spacer(i41.a(rowScopeInstance2, companion6, 1.0f, false, 2, null), composer4, 0);
                    CommonImageKt.a(routeSuggestionTimePickerUIState.f, null, false, composer4, 0, 6);
                    composer4.endNode();
                    SpacerKt.Spacer(SizeKt.m814height3ABfNKs(companion6, ChaloTheme.b(composer4, 0).h), composer4, 0);
                    int i6 = routeSuggestionTimePickerUIState.b;
                    int i7 = routeSuggestionTimePickerUIState.c;
                    String str = routeSuggestionTimePickerUIState.d;
                    boolean zChanged3 = composer4.changed(mutableIntState) | composer4.changed(mutableIntState2) | composer4.changed(mutableState4);
                    Object objRememberedValue4 = composer4.rememberedValue();
                    if (zChanged3 || objRememberedValue4 == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue4 = new ob(2, mutableIntState, mutableIntState2, mutableState4);
                        composer4.updateRememberedValue(objRememberedValue4);
                    }
                    PremiumBusSlotSelectionUiStateKt.u(i6, i7, str, 0, (Function3) objRememberedValue4, composer4, 0);
                    SpacerKt.Spacer(SizeKt.m814height3ABfNKs(companion6, ChaloTheme.b(composer4, 0).h), composer4, 0);
                    Modifier modifierFillMaxWidth$default3 = SizeKt.fillMaxWidth$default(companion6, 0.0f, 1, null);
                    ButtonUIState buttonUIState = routeSuggestionTimePickerUIState.g;
                    boolean zChangedInstance = composer4.changedInstance(routeSuggestionTimePickerUIState) | composer4.changed(mutableIntState) | composer4.changed(mutableIntState2) | composer4.changed(mutableState4);
                    Object objRememberedValue5 = composer4.rememberedValue();
                    if (zChangedInstance || objRememberedValue5 == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue5 = new ia(routeSuggestionTimePickerUIState, mutableIntState, mutableIntState2, mutableState4, 1);
                        composer4.updateRememberedValue(objRememberedValue5);
                    }
                    ChaloFilledButtonKt.a(6, 0, composer4, modifierFillMaxWidth$default3, ButtonUIState.a(buttonUIState, UiEventHandler.Companion.a((Function0) objRememberedValue5), 0.0f, 223));
                    SpacerKt.Spacer(SizeKt.m814height3ABfNKs(companion6, ChaloTheme.b(composer4, 0).g), composer4, 0);
                    if (b3.s(6, 0, composer4, SizeKt.fillMaxWidth$default(companion6, 0.0f, 1, null), routeSuggestionTimePickerUIState.h)) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer4.skipToGroupEnd();
                }
                return unit;
            case 2:
                List list = (List) obj7;
                NavigationTabAppModel navigationTabAppModel = (NavigationTabAppModel) obj5;
                Function1 function2 = (Function1) obj4;
                MutableIntState mutableIntState3 = (MutableIntState) obj3;
                MutableState mutableState5 = (MutableState) obj6;
                Composer composer5 = (Composer) obj;
                int iIntValue3 = ((Integer) obj2).intValue();
                if (composer5.shouldExecute((iIntValue3 & 3) != 2, iIntValue3 & 1)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(222871356, iIntValue3, -1, "app.chalo.home.ui.base.AppBottomNavigation.<anonymous>.<anonymous> (HomeScreenMainDecompose.kt:510)");
                    }
                    Modifier modifierA = PlotlineComposeWidgetKt.a(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), "PL_Bottom_Navigation_Bar");
                    long j3 = ChaloTheme.a(composer5, 0).t;
                    float f = ChaloTheme.c(composer5, 0).d;
                    Intrinsics.i(NavigationBarDefaults.INSTANCE, "<this>");
                    NavigationBarKt.a(modifierA, j3, 0L, f, null, Dp.m7278constructorimpl(56), null, ComposableLambdaKt.rememberComposableLambda(1832697185, true, new ni(list, navigationTabAppModel, function2, mutableIntState3, mutableState5, 1), composer5, 54), composer5, 14155776);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer5.skipToGroupEnd();
                }
                return unit;
            case 3:
                NearbyStopAndTripsUiModel nearbyStopAndTripsUiModel = (NearbyStopAndTripsUiModel) obj6;
                Function1 function3 = (Function1) obj4;
                Function1 function4 = (Function1) obj7;
                Function2 function5 = (Function2) obj5;
                Modifier modifier = (Modifier) obj3;
                Composer composer6 = (Composer) obj;
                int iIntValue4 = ((Integer) obj2).intValue();
                if (composer6.shouldExecute((iIntValue4 & 3) != 2, iIntValue4 & 1)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1111006183, iIntValue4, -1, "app.chalo.home.nearbytrips.ui.mapscreen.NearbyStopsMapSelectedStopBottomSheetContent.<anonymous> (NearbyStopsMapScreen.kt:215)");
                    }
                    StopNearbyTripsCardKt.f(nearbyStopAndTripsUiModel, function3, function4, function5, SizeKt.fillMaxWidth$default(modifier, 0.0f, 1, null), ComposableLambdaKt.rememberComposableLambda(1895360693, true, new la0(nearbyStopAndTripsUiModel, 10), composer6, 54), composer6, ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer6.skipToGroupEnd();
                }
                return unit;
            default:
                return PlatformDefaultTextContextMenuProviders_androidKt.ProvideBothDefaultProviders$lambda$4((Modifier) obj7, (MutableState) obj6, (Function2) obj5, (BasicTextContextMenuProvider) obj4, (Function0) obj3, (Composer) obj, ((Integer) obj2).intValue());
        }
    }

    public /* synthetic */ u1(Modifier modifier, MutableState mutableState, Function2 function2, BasicTextContextMenuProvider basicTextContextMenuProvider, Function0 function0) {
        this.c = modifier;
        this.b = mutableState;
        this.d = function2;
        this.f = basicTextContextMenuProvider;
        this.e = function0;
    }

    public /* synthetic */ u1(NearbyStopAndTripsUiModel nearbyStopAndTripsUiModel, Function1 function1, Function1 function2, Function2 function3, Modifier modifier) {
        this.b = nearbyStopAndTripsUiModel;
        this.f = function1;
        this.c = function2;
        this.d = function3;
        this.e = modifier;
    }

    public /* synthetic */ u1(RouteSuggestionTimePickerUISpec routeSuggestionTimePickerUISpec, RouteSuggestionTimePickerUIState routeSuggestionTimePickerUIState, MutableIntState mutableIntState, MutableIntState mutableIntState2, MutableState mutableState) {
        this.c = routeSuggestionTimePickerUISpec;
        this.d = routeSuggestionTimePickerUIState;
        this.e = mutableIntState;
        this.f = mutableIntState2;
        this.b = mutableState;
    }

    public /* synthetic */ u1(List list, NavigationTabAppModel navigationTabAppModel, Function1 function1, MutableIntState mutableIntState, MutableState mutableState) {
        this.c = list;
        this.d = navigationTabAppModel;
        this.f = function1;
        this.e = mutableIntState;
        this.b = mutableState;
    }
}
