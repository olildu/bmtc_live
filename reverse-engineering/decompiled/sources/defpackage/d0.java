package defpackage;

import androidx.compose.animation.AnimatedVisibilityScope;
import androidx.compose.animation.AnimationModifierKt;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.contextmenu.ContextMenuColors;
import androidx.compose.foundation.contextmenu.ContextMenuUiKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.FlowRowScope;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material3.AndroidMenu_androidKt;
import androidx.compose.material3.DatePickerColors;
import androidx.compose.material3.DatePickerDefaults;
import androidx.compose.material3.DatePickerFormatter;
import androidx.compose.material3.DatePickerKt;
import androidx.compose.material3.DatePickerState;
import androidx.compose.material3.IconKt;
import androidx.compose.material3.TextKt;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.ClipKt;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.GraphicsLayerModifierKt;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.input.TextFieldValue;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.profileinstaller.ProfileVerifier;
import app.chalo.appsupport.uistate.FaqItemSpec;
import app.chalo.appsupport.uistate.FaqItemUiState;
import app.chalo.chalobususerprofile.ui.compose.ChaloBusUserProfileSurveyMainScreenKt;
import app.chalo.chalobususerprofile.ui.compose.OfficeInfoComponentSpecs;
import app.chalo.chalobususerprofile.ui.compose.OfficeInfoUIState;
import app.chalo.checkout.ui.screen.payment.PaymentCardUiSpec;
import app.chalo.compose.components.ChaloSearchBarComposableUIKt;
import app.chalo.compose.components.ChaloSnackbarKt;
import app.chalo.compose.components.ChaloSpacersKt;
import app.chalo.compose.components.ChaloTextViewKt;
import app.chalo.compose.components.TwoTextInRowSpaceSeparatedKt;
import app.chalo.compose.components.buttons.ChaloFilledButtonKt;
import app.chalo.compose.components.dialogs.ChaloDatePickerKt;
import app.chalo.compose.components.dialogs.ChaloMultiSelectDatePickerKt;
import app.chalo.compose.components.image.CommonImageKt;
import app.chalo.compose.components.textfields.BaseChaloTextFieldKt;
import app.chalo.compose.components.textfields.ChaloTextFieldKt;
import app.chalo.compose.resources.IconAssetHelper_androidKt;
import app.chalo.compose.resources.StringResourcesHelperKt;
import app.chalo.compose.theme.ChaloTheme;
import app.chalo.compose.theme.ChaloThemeKt;
import app.chalo.compose.theme.ChaloTypographyKt;
import app.chalo.compose.theme.UIShape;
import app.chalo.compose.utils.SafeFocusRequester;
import app.chalo.compose.utils.SafeFocusRequesterKt;
import app.chalo.home.ui.history.compose.components.ChaloBusTicketViewKt;
import app.chalo.home.ui.history.compose.components.ChaloPassViewKt;
import app.chalo.home.ui.history.uistate.chalobusticket.ProductFooterContainerUiState;
import app.chalo.home.ui.history.uistate.pass.BusPassDetailsContainerUiState;
import app.chalo.home.ui.history.uistate.pass.BusPassSpec;
import app.chalo.home.ui.history.uistate.pass.BusPassUiState;
import app.chalo.home.ui.history.uistate.regularbusticket.ProductBannerUiState;
import app.chalo.instantticket.ui.faredetails.compose.FareDetailsCTAViewKt;
import app.chalo.instantticket.ui.faredetails.contract.FareDetailsViewState;
import app.chalo.ncmc.data.cardtransactions.CardTransactionFareBreakupAppModel;
import app.chalo.ncmc.ui.cardrechargeamount.CardRechargeAmountLayoutType;
import app.chalo.ncmc.ui.cardrechargeamount.ChaloCardRechargeAmountViewState;
import app.chalo.ncmc.ui.cardrechargeamount.compose.ChaloCardRechargeAmountScreenKt;
import app.chalo.ncmc.ui.entercarddetails.EnterCardDetailsViewState;
import app.chalo.ncmc.ui.entercarddetails.compose.EnterCardDetailsScreenKt;
import app.chalo.ncmc.ui.landing.CardInfoLandingScreenBottomSheetType;
import app.chalo.ncmc.ui.landing.ChaloCardInfoViewState;
import app.chalo.ncmc.ui.landing.compose.ChaloCardComposeItemsKt;
import app.chalo.ncmc.ui.landing.compose.ChaloCardInfoScreenKt;
import app.chalo.onboarding.cityselection.ui.CitySelectionSearchPanelUIState;
import app.chalo.premiumbus.ui.stopselection.FromAndToStopCardData;
import app.chalo.premiumbus.ui.stopselection.compose.FromAndToStopCardKt;
import app.chalo.productactivation.ui.ActivationPassComposablesKt;
import app.chalo.productactivation.ui.uistate.ActivationPassFooterUIState;
import app.chalo.productactivation.ui.uistate.BannerDetailsUIState;
import app.chalo.providers.iconassetprovider.IconType;
import app.chalo.providers.stringprovider.StringEnum;
import app.chalo.uistate.base.ChaloColorToken;
import app.chalo.uistate.base.ChaloColorTokenKt;
import app.chalo.uistate.base.UiAlignmentKt;
import app.chalo.uistate.button.ButtonUIState;
import app.chalo.uistate.button.ClickableTextUiState;
import app.chalo.uistate.button.IconButtonUIState;
import app.chalo.uistate.dialog.DatePickerUIState;
import app.chalo.uistate.dialog.DropDownMenuItemUIState;
import app.chalo.uistate.dialog.DropDownMenuUIState;
import app.chalo.uistate.dialog.LegendUIState;
import app.chalo.uistate.dialog.MultiSelectDatePickerSpec;
import app.chalo.uistate.searchbar.SearchBarUiSpecs;
import app.chalo.uistate.searchbar.SearchBarUiState;
import app.chalo.uistate.searchbar.SearchBarWithActionUISpecs;
import app.chalo.uistate.searchbar.SearchBarWithActionUIState;
import app.chalo.uistate.snackbar.SnackbarUIState;
import app.chalo.uistate.text.TextUIState;
import app.chalo.uistate.toolbar.ToolbarBaseActionUIState;
import app.chalo.uistate.toolbar.ToolbarUIState;
import app.chalo.validationsdk.blevalidation.ui.BleValidationLayoutInfo;
import app.chalo.validationsdk.blevalidation.ui.BleValidationScreen_androidKt;
import app.chalo.validationsdk.blevalidation.ui.ComposableSingletons$BleValidationScreen_androidKt;
import com.arkivanov.decompose.router.children.NavState;
import com.arkivanov.essenty.backhandler.BackCallback;
import com.arkivanov.essenty.backhandler.BackCallbackKt$BackCallback$1;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.sequences.SequencesKt;
import kotlin.sequences.TransformingSequence;
import kotlin.text.StringsKt;
import org.bouncycastle.asn1.cmc.BodyPartID;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class d0 implements Function3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15415a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ d0(int i, Object obj, Object obj2) {
        this.f15415a = i;
        this.b = obj;
        this.c = obj2;
    }

    private final Object a(Object obj, Object obj2, Object obj3) {
        BusPassSpec busPassSpec = (BusPassSpec) this.b;
        BusPassUiState busPassUiState = (BusPassUiState) this.c;
        ColumnScope ChaloRoundedCard = (ColumnScope) obj;
        Composer composer = (Composer) obj2;
        int iIntValue = ((Integer) obj3).intValue();
        Intrinsics.i(ChaloRoundedCard, "$this$ChaloRoundedCard");
        if (composer.shouldExecute((iIntValue & 17) != 16, iIntValue & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(387530937, iIntValue, -1, "app.chalo.home.ui.history.compose.components.ChaloBusPassView.<anonymous> (ChaloPassView.kt:63)");
            }
            Modifier modifierAnimateContentSize$default = AnimationModifierKt.animateContentSize$default(SizeKt.fillMaxWidth$default(ChaloThemeKt.c(Modifier.INSTANCE, busPassSpec.f3513a), 0.0f, 1, null), null, null, 3, null);
            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composer, 0);
            long currentCompositeKeyHashCode = ComposablesKt.getCurrentCompositeKeyHashCode(composer, 0);
            int i = (int) (currentCompositeKeyHashCode ^ (currentCompositeKeyHashCode >>> 32));
            CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composer, modifierAnimateContentSize$default);
            ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor = companion.getConstructor();
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
            pk0.v(companion, composerM3915constructorimpl, measurePolicyColumnMeasurePolicy, composerM3915constructorimpl, currentCompositionLocalMap);
            Updater.m3923setimpl(composerM3915constructorimpl, modifierMaterializeModifier, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion, composerM3915constructorimpl, Integer.valueOf(i), composerM3915constructorimpl));
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
            List list = busPassUiState.b;
            if (list == null) {
                composer.startReplaceGroup(2011637847);
            } else {
                composer.startReplaceGroup(2011637848);
                composer.startReplaceGroup(-1459128433);
                int i2 = 0;
                for (Object obj4 : list) {
                    int i3 = i2 + 1;
                    if (i2 < 0) {
                        CollectionsKt.z0();
                        throw null;
                    }
                    UIShape.Rectangle rectangle = UIShape.f1926a;
                    ChaloBusTicketViewKt.f(null, (ProductBannerUiState) obj4, composer, 0);
                    if (i2 < CollectionsKt.K(list)) {
                        composer.startReplaceGroup(1089215957);
                        ChaloSpacersKt.a(busPassSpec.d, composer, 0);
                    } else {
                        composer.startReplaceGroup(1086080121);
                    }
                    composer.endReplaceGroup();
                    i2 = i3;
                }
                composer.endReplaceGroup();
                ChaloSpacersKt.a(busPassSpec.c, composer, 0);
            }
            composer.endReplaceGroup();
            Modifier.Companion companion2 = Modifier.INSTANCE;
            Modifier modifierAnimateContentSize$default2 = AnimationModifierKt.animateContentSize$default(companion2, null, null, 3, null);
            BusPassDetailsContainerUiState busPassDetailsContainerUiState = busPassUiState.c;
            UIShape.Rectangle rectangle2 = UIShape.f1926a;
            ChaloPassViewKt.a(modifierAnimateContentSize$default2, busPassDetailsContainerUiState, composer, 0);
            ProductFooterContainerUiState productFooterContainerUiState = busPassUiState.d;
            if (productFooterContainerUiState == null) {
                composer.startReplaceGroup(2012296783);
            } else {
                composer.startReplaceGroup(2012296784);
                ChaloSpacersKt.a(busPassSpec.e, composer, 0);
                ChaloBusTicketViewKt.g(SizeKt.fillMaxWidth$default(companion2, 0.0f, 1, null), productFooterContainerUiState, composer, 6);
            }
            composer.endReplaceGroup();
            composer.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return Unit.f17538a;
    }

    private final Object c(Object obj, Object obj2, Object obj3) {
        Composer composer;
        SearchBarWithActionUIState searchBarWithActionUIState = (SearchBarWithActionUIState) this.b;
        Modifier modifier = (Modifier) this.c;
        ColumnScope Card = (ColumnScope) obj;
        Composer composer2 = (Composer) obj2;
        int iIntValue = ((Integer) obj3).intValue();
        Intrinsics.i(Card, "$this$Card");
        if (composer2.shouldExecute((iIntValue & 17) != 16, iIntValue & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(661957202, iIntValue, -1, "app.chalo.compose.components.ChaloSearchBarComposable.<anonymous>.<anonymous> (ChaloSearchBarComposableUI.kt:34)");
            }
            Modifier.Companion companion = Modifier.INSTANCE;
            Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null);
            SearchBarWithActionUISpecs searchBarWithActionUISpecs = searchBarWithActionUIState.f10069a;
            IconButtonUIState iconButtonUIState = searchBarWithActionUIState.c;
            MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), UiAlignmentKt.b(searchBarWithActionUISpecs.e), composer2, 0);
            long currentCompositeKeyHashCode = ComposablesKt.getCurrentCompositeKeyHashCode(composer2, 0);
            int i = (int) (currentCompositeKeyHashCode ^ (currentCompositeKeyHashCode >>> 32));
            CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composer2, modifierFillMaxWidth$default);
            ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor = companion2.getConstructor();
            if (composer2.getApplier() == null) {
                ComposablesKt.invalidApplier();
            }
            composer2.startReusableNode();
            if (composer2.getInserting()) {
                composer2.createNode(constructor);
            } else {
                composer2.useNode();
            }
            Composer composerM3915constructorimpl = Updater.m3915constructorimpl(composer2);
            pk0.v(companion2, composerM3915constructorimpl, measurePolicyRowMeasurePolicy, composerM3915constructorimpl, currentCompositionLocalMap);
            Updater.m3923setimpl(composerM3915constructorimpl, modifierMaterializeModifier, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion2, composerM3915constructorimpl, Integer.valueOf(i), composerM3915constructorimpl));
            RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
            if (iconButtonUIState == null) {
                composer2.startReplaceGroup(-524368927);
                composer2.endReplaceGroup();
                composer = composer2;
            } else {
                composer2.startReplaceGroup(-524368926);
                Modifier modifierC = ChaloThemeKt.c(companion, searchBarWithActionUIState.f10069a.g);
                boolean zChanged = composer2.changed(searchBarWithActionUIState);
                Object objRememberedValue = composer2.rememberedValue();
                if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = new fi(searchBarWithActionUIState, 9);
                    composer2.updateRememberedValue(objRememberedValue);
                }
                CommonImageKt.a(iconButtonUIState.f9923a, ClickableKt.m299clickableoSLSa3U$default(modifierC, false, null, null, null, (Function0) objRememberedValue, 15, null), false, composer2, 0, 4);
                composer = composer2;
                composer.endReplaceGroup();
            }
            ChaloSearchBarComposableUIKt.c(i41.a(rowScopeInstance, modifier, 1.0f, false, 2, null), searchBarWithActionUIState.b, ComposableLambdaKt.rememberComposableLambda(-773346767, true, new ol(searchBarWithActionUIState, 0), composer, 54), composer, 384);
            composer.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer2.skipToGroupEnd();
        }
        return Unit.f17538a;
    }

    private final Object d(Object obj, Object obj2, Object obj3) {
        SearchBarUiState searchBarUiState = (SearchBarUiState) this.b;
        TextFieldValue textFieldValue = (TextFieldValue) this.c;
        ColumnScope Card = (ColumnScope) obj;
        Composer composer = (Composer) obj2;
        int iIntValue = ((Integer) obj3).intValue();
        Intrinsics.i(Card, "$this$Card");
        if (composer.shouldExecute((iIntValue & 17) != 16, iIntValue & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1590289341, iIntValue, -1, "app.chalo.compose.ChaloSearchBoxComposable.<anonymous> (ChaloSearchBoxComposable.kt:46)");
            }
            Modifier.Companion companion = Modifier.INSTANCE;
            Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null);
            SearchBarUiSpecs searchBarUiSpecs = searchBarUiState.f10067a;
            Modifier modifierAnimateContentSize$default = AnimationModifierKt.animateContentSize$default(ChaloThemeKt.c(BackgroundKt.m264backgroundbw27NRU$default(ClipKt.clip(modifierFillMaxWidth$default, ChaloThemeKt.d(searchBarUiSpecs.d)), ChaloColorTokenKt.c(searchBarUiSpecs.e), null, 2, null), searchBarUiSpecs.f), null, null, 3, null);
            MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), UiAlignmentKt.b(searchBarUiSpecs.g), composer, 0);
            long currentCompositeKeyHashCode = ComposablesKt.getCurrentCompositeKeyHashCode(composer, 0);
            int i = (int) (currentCompositeKeyHashCode ^ (currentCompositeKeyHashCode >>> 32));
            CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composer, modifierAnimateContentSize$default);
            ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor = companion2.getConstructor();
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
            pk0.v(companion2, composerM3915constructorimpl, measurePolicyRowMeasurePolicy, composerM3915constructorimpl, currentCompositionLocalMap);
            Updater.m3923setimpl(composerM3915constructorimpl, modifierMaterializeModifier, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion2, composerM3915constructorimpl, Integer.valueOf(i), composerM3915constructorimpl));
            RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
            CommonImageKt.a(searchBarUiState.c, null, false, composer, 0, 6);
            SpacerKt.Spacer(SizeKt.m833width3ABfNKs(companion, searchBarUiSpecs.h), composer, 0);
            ChaloTextFieldKt.b(searchBarUiState.b, textFieldValue, SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), null, null, null, null, null, null, composer, 384, TypedValues.PositionType.TYPE_PERCENT_HEIGHT);
            composer.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return Unit.f17538a;
    }

    private final Object e(Object obj, Object obj2, Object obj3) {
        Function0 function0 = (Function0) this.b;
        String str = (String) this.c;
        RowScope let = (RowScope) obj;
        Composer composer = (Composer) obj2;
        int iIntValue = ((Integer) obj3).intValue();
        float f = ChaloSnackbarKt.f1826a;
        Intrinsics.i(let, "$this$let");
        if (composer.shouldExecute((iIntValue & 17) != 16, iIntValue & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(2033940340, iIntValue, -1, "app.chalo.compose.components.ChaloSnackbar.<anonymous>.<anonymous> (ChaloSnackbar.kt:100)");
            }
            Modifier modifierM785paddingVpY3zN4 = PaddingKt.m785paddingVpY3zN4(Modifier.INSTANCE, ChaloTheme.b(composer, 6).d, ChaloTheme.b(composer, 6).c);
            boolean zChanged = composer.changed(function0);
            Object objRememberedValue = composer.rememberedValue();
            if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new fk(function0, 5);
                composer.updateRememberedValue(objRememberedValue);
            }
            TextKt.m2623TextNvy7gAk(str, ClickableKt.m299clickableoSLSa3U$default(modifierM785paddingVpY3zN4, false, null, null, null, (Function0) objRememberedValue, 15, null), ChaloTheme.a(composer, 6).f1915a, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ChaloTheme.e(composer, 6).getHeadlineSmall(), composer, 0, 0, 131064);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return Unit.f17538a;
    }

    private final Object f(Object obj, Object obj2, Object obj3) {
        TextUIState.ChaloTextUIState chaloTextUIState = (TextUIState.ChaloTextUIState) this.b;
        SnackbarUIState snackbarUIState = (SnackbarUIState) this.c;
        RowScope let = (RowScope) obj;
        Composer composer = (Composer) obj2;
        int iIntValue = ((Integer) obj3).intValue();
        float f = ChaloSnackbarKt.f1826a;
        Intrinsics.i(let, "$this$let");
        if (composer.shouldExecute((iIntValue & 17) != 16, iIntValue & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1443823356, iIntValue, -1, "app.chalo.compose.components.ChaloSnackbar.<anonymous>.<anonymous> (ChaloSnackbar.kt:49)");
            }
            String str = chaloTextUIState.b;
            Modifier modifierM785paddingVpY3zN4 = PaddingKt.m785paddingVpY3zN4(Modifier.INSTANCE, ChaloTheme.b(composer, 6).d, ChaloTheme.b(composer, 6).c);
            boolean zChanged = composer.changed(snackbarUIState);
            Object objRememberedValue = composer.rememberedValue();
            if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new fi(snackbarUIState, 10);
                composer.updateRememberedValue(objRememberedValue);
            }
            Modifier modifierM299clickableoSLSa3U$default = ClickableKt.m299clickableoSLSa3U$default(modifierM785paddingVpY3zN4, false, null, null, null, (Function0) objRememberedValue, 15, null);
            TextStyle textStyleF = ChaloThemeKt.f(chaloTextUIState.c, composer, 0);
            ChaloColorToken chaloColorToken = chaloTextUIState.d;
            TextKt.m2623TextNvy7gAk(str, modifierM299clickableoSLSa3U$default, chaloColorToken != null ? ChaloColorTokenKt.c(chaloColorToken) : Color.INSTANCE.m4641getUnspecified0d7_KjU(), null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, textStyleF, composer, 0, 0, 131064);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return Unit.f17538a;
    }

    private final Object g(Object obj, Object obj2, Object obj3) {
        ToolbarBaseActionUIState.DropDownAction dropDownAction = (ToolbarBaseActionUIState.DropDownAction) this.b;
        MutableState mutableState = (MutableState) this.c;
        ColumnScope DropdownMenu = (ColumnScope) obj;
        Composer composer = (Composer) obj2;
        int iIntValue = ((Integer) obj3).intValue();
        Intrinsics.i(DropdownMenu, "$this$DropdownMenu");
        int i = 0;
        boolean z = true;
        if (composer.shouldExecute((iIntValue & 17) != 16, iIntValue & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1486599661, iIntValue, -1, "app.chalo.compose.ToolbarDropDownAction.<anonymous> (ChaloToolBar.kt:357)");
            }
            int i2 = 0;
            for (Object obj4 : dropDownAction.f10117a) {
                int i3 = i2 + 1;
                if (i2 < 0) {
                    CollectionsKt.z0();
                    throw null;
                }
                DropDownMenuItemUIState dropDownMenuItemUIState = (DropDownMenuItemUIState) obj4;
                ComposableLambda composableLambdaRememberComposableLambda = ComposableLambdaKt.rememberComposableLambda(23930838, z, new rm(dropDownMenuItemUIState, 0), composer, 54);
                boolean zChanged = composer.changed(dropDownMenuItemUIState);
                Object objRememberedValue = composer.rememberedValue();
                if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = new ti(10, dropDownMenuItemUIState, mutableState);
                    composer.updateRememberedValue(objRememberedValue);
                }
                Function0 function0 = (Function0) objRememberedValue;
                int i4 = i;
                boolean z2 = z;
                int i5 = i2;
                MutableState mutableState2 = mutableState;
                AndroidMenu_androidKt.DropdownMenuItem(composableLambdaRememberComposableLambda, function0, null, null, null, false, null, null, null, composer, 6, TypedValues.PositionType.TYPE_CURVE_FIT);
                if (i5 != CollectionsKt.K(dropDownAction.f10117a)) {
                    composer.startReplaceGroup(-139304397);
                    ChaloSpacersKt.a(dropDownAction.e, composer, i4);
                } else {
                    composer.startReplaceGroup(-152099492);
                }
                composer.endReplaceGroup();
                i = i4;
                i2 = i3;
                mutableState = mutableState2;
                z = z2;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return Unit.f17538a;
    }

    private final Object h(Object obj, Object obj2, Object obj3) {
        ToolbarUIState toolbarUIState = (ToolbarUIState) this.b;
        Function3 function3 = (Function3) this.c;
        RowScope ChaloToolBar = (RowScope) obj;
        Composer composer = (Composer) obj2;
        int iIntValue = ((Integer) obj3).intValue();
        Intrinsics.i(ChaloToolBar, "$this$ChaloToolBar");
        if (composer.shouldExecute((iIntValue & 17) != 16, iIntValue & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(857661385, iIntValue, -1, "app.chalo.compose.ChaloToolBar.<anonymous> (ChaloToolBar.kt:139)");
            }
            Iterator it = toolbarUIState.e.iterator();
            while (it.hasNext()) {
                function3.invoke((ToolbarBaseActionUIState) it.next(), composer, 0);
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return Unit.f17538a;
    }

    private final Object i(Object obj, Object obj2, Object obj3) {
        ClickableTextUiState clickableTextUiState = (ClickableTextUiState) this.b;
        PaymentCardUiSpec paymentCardUiSpec = (PaymentCardUiSpec) this.c;
        LazyItemScope item = (LazyItemScope) obj;
        Composer composer = (Composer) obj2;
        int iIntValue = ((Integer) obj3).intValue();
        Intrinsics.i(item, "$this$item");
        if (composer.shouldExecute((iIntValue & 17) != 16, iIntValue & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1230937664, iIntValue, -1, "app.chalo.checkout.ui.payment.ScrollablePaymentMethodListView.<anonymous>.<anonymous>.<anonymous> (CheckoutItemList.kt:212)");
            }
            if (clickableTextUiState == null) {
                composer.startReplaceGroup(-433141650);
            } else {
                composer.startReplaceGroup(-433141649);
                if (clickableTextUiState.b == null) {
                    composer.startReplaceGroup(-1588245551);
                } else {
                    composer.startReplaceGroup(-1588245550);
                    ChaloFilledButtonKt.d(ChaloThemeKt.c(Modifier.INSTANCE, paymentCardUiSpec.c), clickableTextUiState, composer, 0, 0);
                }
                composer.endReplaceGroup();
            }
            composer.endReplaceGroup();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return Unit.f17538a;
    }

    private final Object j(Object obj, Object obj2, Object obj3) {
        BackCallbackKt$BackCallback$1 backCallbackKt$BackCallback$1 = (BackCallbackKt$BackCallback$1) this.b;
        NavState newState = (NavState) obj;
        Boolean bool = (Boolean) obj3;
        bool.booleanValue();
        Intrinsics.i(newState, "newState");
        backCallbackKt$BackCallback$1.c.setValue(backCallbackKt$BackCallback$1, BackCallback.d[0], bool);
        ((Function2) this.c).invoke(newState, (NavState) obj2);
        return Unit.f17538a;
    }

    private final Object k(Object obj, Object obj2, Object obj3) {
        CitySelectionSearchPanelUIState citySelectionSearchPanelUIState = (CitySelectionSearchPanelUIState) this.b;
        SafeFocusRequester safeFocusRequester = (SafeFocusRequester) this.c;
        ColumnScope Card = (ColumnScope) obj;
        Composer composer = (Composer) obj2;
        int iIntValue = ((Integer) obj3).intValue();
        Intrinsics.i(Card, "$this$Card");
        if (composer.shouldExecute((iIntValue & 17) != 16, iIntValue & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1327292536, iIntValue, -1, "app.chalo.onboarding.cityselection.ui.CitySelectionSearchPanel.<anonymous> (CitySelectionScreen.kt:450)");
            }
            CitySelectionSearchPanelUIState.SearchBarTextField searchBarTextField = (CitySelectionSearchPanelUIState.SearchBarTextField) citySelectionSearchPanelUIState;
            BaseChaloTextFieldKt.a(searchBarTextField.b, SafeFocusRequesterKt.a(ChaloThemeKt.c(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), searchBarTextField.f6633a.c), safeFocusRequester, composer, 0), null, null, null, null, composer, 0, 124);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return Unit.f17538a;
    }

    private final Object l(Object obj, Object obj2, Object obj3) {
        return ContextMenuUiKt.ContextMenuColumnBuilder$lambda$0((Function1) this.b, (ContextMenuColors) this.c, (ColumnScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
    }

    private final Object m(Object obj, Object obj2, Object obj3) {
        DropDownMenuUIState dropDownMenuUIState = (DropDownMenuUIState) this.b;
        Function0 function0 = (Function0) this.c;
        ColumnScope DropdownMenu = (ColumnScope) obj;
        Composer composer = (Composer) obj2;
        int iIntValue = ((Integer) obj3).intValue();
        Intrinsics.i(DropdownMenu, "$this$DropdownMenu");
        int i = 0;
        boolean z = true;
        if (composer.shouldExecute((iIntValue & 17) != 16, iIntValue & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1251839841, iIntValue, -1, "app.chalo.uistate.dialog.DropDownMenu.<anonymous> (DropDownMenuUIState.kt:66)");
            }
            for (DropDownMenuItemUIState dropDownMenuItemUIState : dropDownMenuUIState.f9995a) {
                ComposableLambda composableLambdaRememberComposableLambda = ComposableLambdaKt.rememberComposableLambda(366420654, z, new rm(dropDownMenuItemUIState, 1), composer, 54);
                boolean zChanged = composer.changed(function0) | composer.changed(dropDownMenuItemUIState);
                Object objRememberedValue = composer.rememberedValue();
                if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = new cy(5, function0, dropDownMenuItemUIState);
                    composer.updateRememberedValue(objRememberedValue);
                }
                int i2 = i;
                AndroidMenu_androidKt.DropdownMenuItem(composableLambdaRememberComposableLambda, (Function0) objRememberedValue, null, null, null, false, null, null, null, composer, 6, TypedValues.PositionType.TYPE_CURVE_FIT);
                ChaloSpacersKt.a(dropDownMenuUIState.c.b, composer, i2);
                i = i2;
                z = z;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return Unit.f17538a;
    }

    private final Object n(Object obj, Object obj2, Object obj3) {
        EnterCardDetailsViewState enterCardDetailsViewState = (EnterCardDetailsViewState) this.b;
        Function1 function1 = (Function1) this.c;
        ColumnScope ChaloRoundedBottomSheet = (ColumnScope) obj;
        Composer composer = (Composer) obj2;
        int iIntValue = ((Integer) obj3).intValue();
        Intrinsics.i(ChaloRoundedBottomSheet, "$this$ChaloRoundedBottomSheet");
        if (composer.shouldExecute((iIntValue & 17) != 16, iIntValue & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1344673728, iIntValue, -1, "app.chalo.ncmc.ui.entercarddetails.compose.EnterCardDetailsScreen.<anonymous> (EnterCardDetailsScreen.kt:70)");
            }
            Modifier modifierM785paddingVpY3zN4 = PaddingKt.m785paddingVpY3zN4(BackgroundKt.m264backgroundbw27NRU$default(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), ChaloTheme.a(composer, 0).t, null, 2, null), ChaloTheme.b(composer, 0).h, ChaloTheme.b(composer, 0).i);
            String str = enterCardDetailsViewState.k;
            boolean zChanged = composer.changed(function1);
            Object objRememberedValue = composer.rememberedValue();
            if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new bp(function1, 23);
                composer.updateRememberedValue(objRememberedValue);
            }
            Function0 function0 = (Function0) objRememberedValue;
            boolean zChanged2 = composer.changed(function1);
            Object objRememberedValue2 = composer.rememberedValue();
            if (zChanged2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue2 = new bp(function1, 24);
                composer.updateRememberedValue(objRememberedValue2);
            }
            EnterCardDetailsScreenKt.e(modifierM785paddingVpY3zN4, str, function0, (Function0) objRememberedValue2, composer, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return Unit.f17538a;
    }

    private final Object o(Object obj, Object obj2, Object obj3) {
        FareDetailsViewState fareDetailsViewState = (FareDetailsViewState) this.b;
        Function1 function1 = (Function1) this.c;
        ColumnScope Card = (ColumnScope) obj;
        Composer composer = (Composer) obj2;
        int iIntValue = ((Integer) obj3).intValue();
        Intrinsics.i(Card, "$this$Card");
        if (composer.shouldExecute((iIntValue & 17) != 16, iIntValue & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1108561238, iIntValue, -1, "app.chalo.instantticket.ui.faredetails.compose.FareDetailsMainScreen.<anonymous>.<anonymous>.<anonymous> (FareDetailsMainScreen.kt:178)");
            }
            Modifier modifierM786paddingVpY3zN4$default = PaddingKt.m786paddingVpY3zN4$default(BackgroundKt.m264backgroundbw27NRU$default(Modifier.INSTANCE, ChaloTheme.a(composer, 0).t, null, 2, null), ChaloTheme.b(composer, 0).h, 0.0f, 2, null);
            boolean z = fareDetailsViewState.j;
            String str = fareDetailsViewState.i;
            String str2 = fareDetailsViewState.r;
            boolean z2 = fareDetailsViewState.y;
            boolean zChanged = composer.changed(function1);
            Object objRememberedValue = composer.rememberedValue();
            if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new d30(function1, 2);
                composer.updateRememberedValue(objRememberedValue);
            }
            Function0 function0 = (Function0) objRememberedValue;
            boolean zChanged2 = composer.changed(function1);
            Object objRememberedValue2 = composer.rememberedValue();
            if (zChanged2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue2 = new d30(function1, 3);
                composer.updateRememberedValue(objRememberedValue2);
            }
            FareDetailsCTAViewKt.a(modifierM786paddingVpY3zN4$default, z, str, str2, z2, function0, (Function0) objRememberedValue2, composer, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return Unit.f17538a;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i = this.f15415a;
        int i2 = 18;
        Unit unit = Unit.f17538a;
        Object obj4 = this.c;
        Object obj5 = this.b;
        int i3 = 0;
        switch (i) {
            case 0:
                BannerDetailsUIState bannerDetailsUIState = (BannerDetailsUIState) obj5;
                ActivationPassFooterUIState activationPassFooterUIState = (ActivationPassFooterUIState) obj4;
                ColumnScope Card = (ColumnScope) obj;
                Composer composer = (Composer) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                Intrinsics.i(Card, "$this$Card");
                if (composer.shouldExecute((iIntValue & 17) != 16, iIntValue & 1)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1717585476, iIntValue, -1, "app.chalo.productactivation.ui.PassCardWithBannerDetailsContainer.<anonymous>.<anonymous> (ActivationPassComposables.kt:233)");
                    }
                    Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null);
                    MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composer, 0);
                    long currentCompositeKeyHashCode = ComposablesKt.getCurrentCompositeKeyHashCode(composer, 0);
                    int i4 = (int) (currentCompositeKeyHashCode ^ (currentCompositeKeyHashCode >>> 32));
                    CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composer, modifierFillMaxWidth$default);
                    ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
                    Function0<ComposeUiNode> constructor = companion.getConstructor();
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
                    pk0.v(companion, composerM3915constructorimpl, measurePolicyColumnMeasurePolicy, composerM3915constructorimpl, currentCompositionLocalMap);
                    Updater.m3923setimpl(composerM3915constructorimpl, modifierMaterializeModifier, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion, composerM3915constructorimpl, Integer.valueOf(i4), composerM3915constructorimpl));
                    ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
                    if (bannerDetailsUIState == null) {
                        composer.startReplaceGroup(1580718014);
                    } else {
                        composer.startReplaceGroup(1580718015);
                        ActivationPassComposablesKt.b(null, bannerDetailsUIState, composer, 0);
                        ChaloSpacersKt.m(composer, 0);
                    }
                    composer.endReplaceGroup();
                    if (activationPassFooterUIState == null) {
                        composer.startReplaceGroup(1580905843);
                    } else {
                        composer.startReplaceGroup(1580905844);
                        ActivationPassComposablesKt.d(activationPassFooterUIState, null, composer, 0, 2);
                    }
                    composer.endReplaceGroup();
                    composer.endNode();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer.skipToGroupEnd();
                }
                return unit;
            case 1:
                BleValidationLayoutInfo bleValidationLayoutInfo = (BleValidationLayoutInfo) obj5;
                Function1 function1 = (Function1) obj4;
                ColumnScope ChaloRoundedCard = (ColumnScope) obj;
                Composer composer2 = (Composer) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                Intrinsics.i(ChaloRoundedCard, "$this$ChaloRoundedCard");
                if (composer2.shouldExecute((iIntValue2 & 17) != 16, iIntValue2 & 1)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(266211786, iIntValue2, -1, "app.chalo.validationsdk.blevalidation.ui.SwitchToQrValidationFooterUI.<anonymous> (BleValidationScreen.android.kt:1098)");
                    }
                    BleValidationScreen_androidKt.I(bleValidationLayoutInfo, function1, composer2, 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer2.skipToGroupEnd();
                }
                return unit;
            case 2:
                Function1 function2 = (Function1) obj5;
                MutableState mutableState = (MutableState) obj4;
                ColumnScope DropdownMenu = (ColumnScope) obj;
                Composer composer3 = (Composer) obj2;
                int iIntValue3 = ((Integer) obj3).intValue();
                Intrinsics.i(DropdownMenu, "$this$DropdownMenu");
                if (composer3.shouldExecute((iIntValue3 & 17) != 16, iIntValue3 & 1)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-675854940, iIntValue3, -1, "app.chalo.validationsdk.blevalidation.ui.BleToolbarDisplayOptions.<anonymous>.<anonymous> (BleValidationScreen.android.kt:257)");
                    }
                    ComposableLambda composableLambda = ComposableSingletons$BleValidationScreen_androidKt.d;
                    boolean zChanged = composer3.changed(function2);
                    Object objRememberedValue = composer3.rememberedValue();
                    if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue = new ib(function2, mutableState, i3);
                        composer3.updateRememberedValue(objRememberedValue);
                    }
                    AndroidMenu_androidKt.DropdownMenuItem(composableLambda, (Function0) objRememberedValue, null, null, null, false, null, null, null, composer3, 6, TypedValues.PositionType.TYPE_CURVE_FIT);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer3.skipToGroupEnd();
                }
                return unit;
            case 3:
                BleValidationLayoutInfo bleValidationLayoutInfo2 = (BleValidationLayoutInfo) obj5;
                String str = (String) obj4;
                ColumnScope ChaloRoundedCard2 = (ColumnScope) obj;
                Composer composer4 = (Composer) obj2;
                int iIntValue4 = ((Integer) obj3).intValue();
                Intrinsics.i(ChaloRoundedCard2, "$this$ChaloRoundedCard");
                if (composer4.shouldExecute((iIntValue4 & 17) != 16, iIntValue4 & 1)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1402289764, iIntValue4, -1, "app.chalo.validationsdk.blevalidation.ui.ProductAndTicketSection.<anonymous> (BleValidationScreen.android.kt:589)");
                    }
                    BleValidationScreen_androidKt.z(bleValidationLayoutInfo2, str, composer4, 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer4.skipToGroupEnd();
                }
                return unit;
            case 4:
                FaqItemSpec faqItemSpec = (FaqItemSpec) obj5;
                FaqItemUiState faqItemUiState = (FaqItemUiState) obj4;
                AnimatedVisibilityScope AnimatedVisibility = (AnimatedVisibilityScope) obj;
                Composer composer5 = (Composer) obj2;
                int iIntValue5 = ((Integer) obj3).intValue();
                Intrinsics.i(AnimatedVisibility, "$this$AnimatedVisibility");
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1484985066, iIntValue5, -1, "app.chalo.appsupport.FaqItem.<anonymous>.<anonymous> (BookingHelpScreenUI.kt:158)");
                }
                Modifier modifierFillMaxWidth$default2 = SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null);
                MeasurePolicy measurePolicyColumnMeasurePolicy2 = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composer5, 0);
                long currentCompositeKeyHashCode2 = ComposablesKt.getCurrentCompositeKeyHashCode(composer5, 0);
                int i5 = (int) (currentCompositeKeyHashCode2 ^ (currentCompositeKeyHashCode2 >>> 32));
                CompositionLocalMap currentCompositionLocalMap2 = composer5.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(composer5, modifierFillMaxWidth$default2);
                ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
                Function0<ComposeUiNode> constructor2 = companion2.getConstructor();
                if (composer5.getApplier() == null) {
                    ComposablesKt.invalidApplier();
                }
                composer5.startReusableNode();
                if (composer5.getInserting()) {
                    composer5.createNode(constructor2);
                } else {
                    composer5.useNode();
                }
                Composer composerM3915constructorimpl2 = Updater.m3915constructorimpl(composer5);
                pk0.v(companion2, composerM3915constructorimpl2, measurePolicyColumnMeasurePolicy2, composerM3915constructorimpl2, currentCompositionLocalMap2);
                Updater.m3923setimpl(composerM3915constructorimpl2, modifierMaterializeModifier2, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion2, composerM3915constructorimpl2, Integer.valueOf(i5), composerM3915constructorimpl2));
                ColumnScopeInstance columnScopeInstance2 = ColumnScopeInstance.INSTANCE;
                ChaloSpacersKt.a(faqItemSpec.b, composer5, 0);
                ChaloTextViewKt.a(null, faqItemUiState.d, null, null, composer5, 0, 13);
                ButtonUIState buttonUIState = faqItemUiState.g;
                if (buttonUIState == null) {
                    composer5.startReplaceGroup(157743305);
                } else {
                    composer5.startReplaceGroup(157743306);
                    ChaloSpacersKt.a(faqItemSpec.c, composer5, 0);
                    ChaloFilledButtonKt.a(0, 1, composer5, null, buttonUIState);
                }
                composer5.endReplaceGroup();
                composer5.endNode();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                return unit;
            case 5:
                String str2 = (String) obj5;
                List<CardTransactionFareBreakupAppModel> list = (List) obj4;
                ColumnScope ChaloRoundedCard3 = (ColumnScope) obj;
                Composer composer6 = (Composer) obj2;
                int iIntValue6 = ((Integer) obj3).intValue();
                Intrinsics.i(ChaloRoundedCard3, "$this$ChaloRoundedCard");
                if (composer6.shouldExecute((iIntValue6 & 17) != 16, iIntValue6 & 1)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(170037469, iIntValue6, -1, "app.chalo.ncmc.ui.cardtransactiondetail.CardTransactionScreenAmountAndFareSplit.<anonymous> (CardTransactionDetailScreen.kt:186)");
                    }
                    Modifier.Companion companion3 = Modifier.INSTANCE;
                    Modifier modifierFillMaxWidth$default3 = SizeKt.fillMaxWidth$default(companion3, 0.0f, 1, null);
                    MeasurePolicy measurePolicyColumnMeasurePolicy3 = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composer6, 0);
                    long currentCompositeKeyHashCode3 = ComposablesKt.getCurrentCompositeKeyHashCode(composer6, 0);
                    int i6 = (int) (currentCompositeKeyHashCode3 ^ (currentCompositeKeyHashCode3 >>> 32));
                    CompositionLocalMap currentCompositionLocalMap3 = composer6.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier3 = ComposedModifierKt.materializeModifier(composer6, modifierFillMaxWidth$default3);
                    ComposeUiNode.Companion companion4 = ComposeUiNode.INSTANCE;
                    Function0<ComposeUiNode> constructor3 = companion4.getConstructor();
                    if (composer6.getApplier() == null) {
                        ComposablesKt.invalidApplier();
                    }
                    composer6.startReusableNode();
                    if (composer6.getInserting()) {
                        composer6.createNode(constructor3);
                    } else {
                        composer6.useNode();
                    }
                    Composer composerM3915constructorimpl3 = Updater.m3915constructorimpl(composer6);
                    pk0.v(companion4, composerM3915constructorimpl3, measurePolicyColumnMeasurePolicy3, composerM3915constructorimpl3, currentCompositionLocalMap3);
                    Updater.m3923setimpl(composerM3915constructorimpl3, modifierMaterializeModifier3, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion4, composerM3915constructorimpl3, Integer.valueOf(i6), composerM3915constructorimpl3));
                    ColumnScopeInstance columnScopeInstance3 = ColumnScopeInstance.INSTANCE;
                    TwoTextInRowSpaceSeparatedKt.a(PaddingKt.m785paddingVpY3zN4(companion3, ChaloTheme.b(composer6, 0).h, ChaloTheme.b(composer6, 0).g), StringResourcesHelperKt.c(StringEnum.TOTAL_AMOUNT_PAID, new Object[0], composer6, 6), str2, ChaloTypographyKt.f(ChaloTheme.e(composer6, 0)), ChaloTheme.a(composer6, 0).g, composer6, 0, 0);
                    SpacerKt.Spacer(BackgroundKt.m264backgroundbw27NRU$default(SizeKt.fillMaxWidth$default(SizeKt.m814height3ABfNKs(companion3, ChaloTheme.b(composer6, 0).c), 0.0f, 1, null), ChaloTheme.a(composer6, 0).n, null, 2, null), composer6, 0);
                    TextKt.m2623TextNvy7gAk(StringResourcesHelperKt.c(StringEnum.VIEW_FARE_SPLIT, new Object[0], composer6, 6), PaddingKt.m788paddingqDBjuR0$default(companion3, ChaloTheme.b(composer6, 0).h, ChaloTheme.b(composer6, 0).g, ChaloTheme.b(composer6, 0).h, 0.0f, 8, null), ChaloTheme.a(composer6, 0).Q, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ChaloTypographyKt.l(ChaloTheme.e(composer6, 0)), composer6, 0, 0, 131064);
                    composer6.startReplaceGroup(1382922113);
                    for (CardTransactionFareBreakupAppModel cardTransactionFareBreakupAppModel : list) {
                        String str3 = cardTransactionFareBreakupAppModel.f6186a;
                        String str4 = cardTransactionFareBreakupAppModel.b;
                        if (str3 == null || str3.length() == 0 || str4 == null || str4.length() == 0) {
                            composer6.startReplaceGroup(331023082);
                        } else {
                            composer6.startReplaceGroup(338614672);
                            TwoTextInRowSpaceSeparatedKt.a(PaddingKt.m785paddingVpY3zN4(Modifier.INSTANCE, ChaloTheme.b(composer6, 0).h, ChaloTheme.b(composer6, 0).g), str3, str4, null, 0L, composer6, 0, 24);
                        }
                        composer6.endReplaceGroup();
                    }
                    if (b3.t(composer6)) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer6.skipToGroupEnd();
                }
                return unit;
            case 6:
                OfficeInfoComponentSpecs officeInfoComponentSpecs = (OfficeInfoComponentSpecs) obj5;
                OfficeInfoUIState officeInfoUIState = (OfficeInfoUIState) obj4;
                ColumnScope Card2 = (ColumnScope) obj;
                Composer composer7 = (Composer) obj2;
                int iIntValue7 = ((Integer) obj3).intValue();
                Intrinsics.i(Card2, "$this$Card");
                if (composer7.shouldExecute((iIntValue7 & 17) != 16, iIntValue7 & 1)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1655155929, iIntValue7, -1, "app.chalo.chalobususerprofile.ui.compose.OfficeInfoCard.<anonymous> (ChaloBusUserProfileSurveyMainScreen.kt:170)");
                    }
                    Modifier.Companion companion5 = Modifier.INSTANCE;
                    Modifier modifierC = ChaloThemeKt.c(companion5, officeInfoComponentSpecs.f1229a);
                    Arrangement arrangement = Arrangement.INSTANCE;
                    Arrangement.Vertical top = arrangement.getTop();
                    Alignment.Companion companion6 = Alignment.INSTANCE;
                    MeasurePolicy measurePolicyColumnMeasurePolicy4 = ColumnKt.columnMeasurePolicy(top, companion6.getStart(), composer7, 0);
                    long currentCompositeKeyHashCode4 = ComposablesKt.getCurrentCompositeKeyHashCode(composer7, 0);
                    int i7 = (int) (currentCompositeKeyHashCode4 ^ (currentCompositeKeyHashCode4 >>> 32));
                    CompositionLocalMap currentCompositionLocalMap4 = composer7.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier4 = ComposedModifierKt.materializeModifier(composer7, modifierC);
                    ComposeUiNode.Companion companion7 = ComposeUiNode.INSTANCE;
                    Function0<ComposeUiNode> constructor4 = companion7.getConstructor();
                    if (composer7.getApplier() == null) {
                        ComposablesKt.invalidApplier();
                    }
                    composer7.startReusableNode();
                    if (composer7.getInserting()) {
                        composer7.createNode(constructor4);
                    } else {
                        composer7.useNode();
                    }
                    Composer composerM3915constructorimpl4 = Updater.m3915constructorimpl(composer7);
                    pk0.v(companion7, composerM3915constructorimpl4, measurePolicyColumnMeasurePolicy4, composerM3915constructorimpl4, currentCompositionLocalMap4);
                    Updater.m3923setimpl(composerM3915constructorimpl4, modifierMaterializeModifier4, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion7, composerM3915constructorimpl4, Integer.valueOf(i7), composerM3915constructorimpl4));
                    ColumnScopeInstance columnScopeInstance4 = ColumnScopeInstance.INSTANCE;
                    MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(arrangement.getStart(), companion6.getCenterVertically(), composer7, 48);
                    long currentCompositeKeyHashCode5 = ComposablesKt.getCurrentCompositeKeyHashCode(composer7, 0);
                    int i8 = (int) (currentCompositeKeyHashCode5 ^ (currentCompositeKeyHashCode5 >>> 32));
                    CompositionLocalMap currentCompositionLocalMap5 = composer7.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier5 = ComposedModifierKt.materializeModifier(composer7, companion5);
                    Function0<ComposeUiNode> constructor5 = companion7.getConstructor();
                    if (composer7.getApplier() == null) {
                        ComposablesKt.invalidApplier();
                    }
                    composer7.startReusableNode();
                    if (composer7.getInserting()) {
                        composer7.createNode(constructor5);
                    } else {
                        composer7.useNode();
                    }
                    Composer composerM3915constructorimpl5 = Updater.m3915constructorimpl(composer7);
                    pk0.v(companion7, composerM3915constructorimpl5, measurePolicyRowMeasurePolicy, composerM3915constructorimpl5, currentCompositionLocalMap5);
                    Updater.m3923setimpl(composerM3915constructorimpl5, modifierMaterializeModifier5, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion7, composerM3915constructorimpl5, Integer.valueOf(i8), composerM3915constructorimpl5));
                    RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
                    CommonImageKt.a(officeInfoUIState.f1230a, null, false, composer7, 0, 6);
                    SpacerKt.Spacer(SizeKt.m833width3ABfNKs(companion5, officeInfoComponentSpecs.c), composer7, 0);
                    ChaloTextViewKt.a(null, officeInfoUIState.b, null, null, composer7, 0, 13);
                    composer7.endNode();
                    SpacerKt.Spacer(SizeKt.m814height3ABfNKs(companion5, officeInfoComponentSpecs.d), composer7, 0);
                    TextUIState textUIState = officeInfoUIState.c;
                    if (textUIState == null) {
                        textUIState = officeInfoUIState.d;
                    }
                    ChaloBusUserProfileSurveyMainScreenKt.k(textUIState, officeInfoUIState.g, composer7, 0);
                    SpacerKt.Spacer(SizeKt.m814height3ABfNKs(companion5, officeInfoComponentSpecs.e), composer7, 0);
                    ChaloTextViewKt.a(null, officeInfoUIState.e, null, null, composer7, 0, 13);
                    SpacerKt.Spacer(SizeKt.m814height3ABfNKs(companion5, officeInfoComponentSpecs.f), composer7, 0);
                    ChaloBusUserProfileSurveyMainScreenKt.l(officeInfoUIState.f, composer7, 0);
                    composer7.endNode();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer7.skipToGroupEnd();
                }
                return unit;
            case 7:
                Pair[] pairArr = (Pair[]) obj5;
                Function2 function3 = (Function2) obj4;
                ColumnScope Card3 = (ColumnScope) obj;
                Composer composer8 = (Composer) obj2;
                int iIntValue8 = ((Integer) obj3).intValue();
                Intrinsics.i(Card3, "$this$Card");
                if (composer8.shouldExecute((iIntValue8 & 17) != 16, iIntValue8 & 1)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-427088418, iIntValue8, -1, "app.chalo.ncmc.ui.landing.compose.ChaloCardGradientBackgroundLayout.<anonymous> (ChaloCardComposeItems.kt:216)");
                    }
                    Modifier modifierBackground$default = BackgroundKt.background$default(SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null), Brush.Companion.m4561linearGradientmHitzGk$default(Brush.INSTANCE, (Pair[]) Arrays.copyOf(pairArr, 3), Offset.m4357constructorimpl((((long) Float.floatToRawIntBits(0.0f)) << 32) | (((long) Float.floatToRawIntBits(Float.POSITIVE_INFINITY)) & BodyPartID.bodyIdMax)), Offset.m4357constructorimpl((((long) Float.floatToRawIntBits(Float.POSITIVE_INFINITY)) << 32) | (((long) Float.floatToRawIntBits(0.0f)) & BodyPartID.bodyIdMax)), 0, 8, (Object) null), null, 0.0f, 6, null);
                    MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
                    long currentCompositeKeyHashCode6 = ComposablesKt.getCurrentCompositeKeyHashCode(composer8, 0);
                    int i9 = (int) (currentCompositeKeyHashCode6 ^ (currentCompositeKeyHashCode6 >>> 32));
                    CompositionLocalMap currentCompositionLocalMap6 = composer8.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier6 = ComposedModifierKt.materializeModifier(composer8, modifierBackground$default);
                    ComposeUiNode.Companion companion8 = ComposeUiNode.INSTANCE;
                    Function0<ComposeUiNode> constructor6 = companion8.getConstructor();
                    if (composer8.getApplier() == null) {
                        ComposablesKt.invalidApplier();
                    }
                    composer8.startReusableNode();
                    if (composer8.getInserting()) {
                        composer8.createNode(constructor6);
                    } else {
                        composer8.useNode();
                    }
                    Composer composerM3915constructorimpl6 = Updater.m3915constructorimpl(composer8);
                    pk0.v(companion8, composerM3915constructorimpl6, measurePolicyMaybeCachedBoxMeasurePolicy, composerM3915constructorimpl6, currentCompositionLocalMap6);
                    Updater.m3923setimpl(composerM3915constructorimpl6, modifierMaterializeModifier6, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion8, composerM3915constructorimpl6, Integer.valueOf(i9), composerM3915constructorimpl6));
                    BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                    if (t8.w(composer8, 0, function3)) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer8.skipToGroupEnd();
                }
                return unit;
            case 8:
                ChaloCardInfoViewState chaloCardInfoViewState = (ChaloCardInfoViewState) obj5;
                Function1 function4 = (Function1) obj4;
                Composer composer9 = (Composer) obj2;
                int iIntValue9 = ((Integer) obj3).intValue();
                Intrinsics.i((ColumnScope) obj, "$this$ChaloRoundedBottomSheet");
                if (composer9.shouldExecute((iIntValue9 & 17) != 16, iIntValue9 & 1)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-664925272, iIntValue9, -1, "app.chalo.ncmc.ui.landing.compose.ChaloCardInfoScreen.<anonymous> (ChaloCardInfoScreen.kt:84)");
                    }
                    CardInfoLandingScreenBottomSheetType cardInfoLandingScreenBottomSheetType = chaloCardInfoViewState.u;
                    if (Intrinsics.d(cardInfoLandingScreenBottomSheetType, CardInfoLandingScreenBottomSheetType.None.f6341a)) {
                        composer9.startReplaceGroup(-399491880);
                        composer9.endReplaceGroup();
                    } else if (cardInfoLandingScreenBottomSheetType instanceof CardInfoLandingScreenBottomSheetType.CardLinking) {
                        composer9.startReplaceGroup(-399377738);
                        Modifier modifierM785paddingVpY3zN4 = PaddingKt.m785paddingVpY3zN4(BackgroundKt.m264backgroundbw27NRU$default(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), ChaloTheme.a(composer9, 0).t, null, 2, null), ChaloTheme.b(composer9, 0).h, ChaloTheme.b(composer9, 0).i);
                        String str5 = ((CardInfoLandingScreenBottomSheetType.CardLinking) chaloCardInfoViewState.u).f6339a;
                        boolean zChanged2 = composer9.changed(function4);
                        Object objRememberedValue2 = composer9.rememberedValue();
                        if (zChanged2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue2 = new ii(function4, 12);
                            composer9.updateRememberedValue(objRememberedValue2);
                        }
                        Function0 function0 = (Function0) objRememberedValue2;
                        boolean zChanged3 = composer9.changed(function4);
                        Object objRememberedValue3 = composer9.rememberedValue();
                        if (zChanged3 || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue3 = new ii(function4, 13);
                            composer9.updateRememberedValue(objRememberedValue3);
                        }
                        EnterCardDetailsScreenKt.e(modifierM785paddingVpY3zN4, str5, function0, (Function0) objRememberedValue3, composer9, 0);
                        composer9.endReplaceGroup();
                    } else {
                        if (!Intrinsics.d(cardInfoLandingScreenBottomSheetType, CardInfoLandingScreenBottomSheetType.NfcTapUnavailable.f6340a)) {
                            throw pk0.p(composer9, 956942879);
                        }
                        composer9.startReplaceGroup(956987687);
                        ChaloCardInfoScreenKt.c(chaloCardInfoViewState, function4, composer9, 0);
                        composer9.endReplaceGroup();
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer9.skipToGroupEnd();
                }
                return unit;
            case 9:
                ChaloCardRechargeAmountViewState chaloCardRechargeAmountViewState = (ChaloCardRechargeAmountViewState) obj5;
                Function1 function5 = (Function1) obj4;
                ColumnScope ChaloRoundedBottomSheet = (ColumnScope) obj;
                Composer composer10 = (Composer) obj2;
                int iIntValue10 = ((Integer) obj3).intValue();
                Intrinsics.i(ChaloRoundedBottomSheet, "$this$ChaloRoundedBottomSheet");
                if ((iIntValue10 & 6) == 0) {
                    iIntValue10 |= composer10.changed(ChaloRoundedBottomSheet) ? 4 : 2;
                }
                if (composer10.shouldExecute((iIntValue10 & 19) != 18, iIntValue10 & 1)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1086661706, iIntValue10, -1, "app.chalo.ncmc.ui.cardrechargeamount.compose.ChaloCardRechargeAmountScreen.<anonymous> (ChaloCardRechargeAmountScreen.kt:75)");
                    }
                    CardRechargeAmountLayoutType cardRechargeAmountLayoutType = chaloCardRechargeAmountViewState.j;
                    Intrinsics.g(cardRechargeAmountLayoutType, "null cannot be cast to non-null type app.chalo.ncmc.ui.cardrechargeamount.CardRechargeAmountLayoutType.ErrorLayout");
                    ChaloCardRechargeAmountScreenKt.d(ChaloRoundedBottomSheet, ((CardRechargeAmountLayoutType.ErrorLayout) cardRechargeAmountLayoutType).f6286a, function5, composer10, iIntValue10 & 14);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer10.skipToGroupEnd();
                }
                return unit;
            case 10:
                String str6 = (String) obj5;
                ii iiVar = (ii) obj4;
                LazyItemScope item = (LazyItemScope) obj;
                Composer composer11 = (Composer) obj2;
                int iIntValue11 = ((Integer) obj3).intValue();
                Intrinsics.i(item, "$this$item");
                if (composer11.shouldExecute((iIntValue11 & 17) != 16, iIntValue11 & 1)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1456893020, iIntValue11, -1, "app.chalo.ncmc.ui.transactionhistory.compose.cardTransactionSuccessItems.<anonymous> (ChaloCardTransactionsScreen.kt:340)");
                    }
                    ChaloCardComposeItemsKt.a(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), str6, StringResourcesHelperKt.c(StringEnum.RECHARGE_PENDING_DESC, new Object[0], composer11, 6), iiVar, composer11, 6);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer11.skipToGroupEnd();
                }
                return unit;
            case 11:
                DatePickerState datePickerState = (DatePickerState) obj5;
                DatePickerFormatter datePickerFormatter = (DatePickerFormatter) obj4;
                ColumnScope DatePickerDialog = (ColumnScope) obj;
                Composer composer12 = (Composer) obj2;
                int iIntValue12 = ((Integer) obj3).intValue();
                PaddingValues paddingValues = ChaloDatePickerKt.f1888a;
                Intrinsics.i(DatePickerDialog, "$this$DatePickerDialog");
                if (composer12.shouldExecute((iIntValue12 & 17) != 16, iIntValue12 & 1)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(927713890, iIntValue12, -1, "app.chalo.compose.components.dialogs.ChaloDatePicker.<anonymous> (ChaloDatePicker.kt:95)");
                    }
                    DatePickerKt.DatePicker(datePickerState, null, datePickerFormatter, DatePickerDefaults.INSTANCE.m1895colorsbSRYm20(ChaloTheme.a(composer12, 6).t, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, null, composer12, 0, 0, ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE, 33554430), null, null, false, null, composer12, 0, 242);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer12.skipToGroupEnd();
                }
                return unit;
            case 12:
                DatePickerUIState datePickerUIState = (DatePickerUIState) obj5;
                DatePickerState datePickerState2 = (DatePickerState) obj4;
                ColumnScope DatePickerDialog2 = (ColumnScope) obj;
                Composer composer13 = (Composer) obj2;
                int iIntValue13 = ((Integer) obj3).intValue();
                PaddingValues paddingValues2 = ChaloDatePickerKt.f1888a;
                Intrinsics.i(DatePickerDialog2, "$this$DatePickerDialog");
                if (composer13.shouldExecute((iIntValue13 & 17) != 16, iIntValue13 & 1)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1019407899, iIntValue13, -1, "app.chalo.compose.components.dialogs.ChaloDatePicker.<anonymous> (ChaloDatePicker.kt:164)");
                    }
                    DatePickerDefaults datePickerDefaults = DatePickerDefaults.INSTANCE;
                    DatePickerColors datePickerColorsM1895colorsbSRYm20 = datePickerDefaults.m1895colorsbSRYm20(ChaloColorTokenKt.c(datePickerUIState.f.f9978a), 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, null, composer13, 0, 0, ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE, 33554430);
                    Object objRememberedValue4 = composer13.rememberedValue();
                    if (objRememberedValue4 == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue4 = DatePickerDefaults.dateFormatter$default(datePickerDefaults, null, null, null, 7, null);
                        composer13.updateRememberedValue(objRememberedValue4);
                    }
                    DatePickerKt.DatePicker(datePickerState2, null, (DatePickerFormatter) objRememberedValue4, datePickerColorsM1895colorsbSRYm20, ComposableLambdaKt.rememberComposableLambda(-818533304, true, new mj(datePickerUIState, datePickerState2, i3), composer13, 54), null, false, null, composer13, 24576, 226);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer13.skipToGroupEnd();
                }
                return unit;
            case 13:
                String str7 = (String) obj5;
                TextStyle textStyle = (TextStyle) obj4;
                FlowRowScope FlowRow = (FlowRowScope) obj;
                Composer composer14 = (Composer) obj2;
                int iIntValue14 = ((Integer) obj3).intValue();
                Intrinsics.i(FlowRow, "$this$FlowRow");
                if ((iIntValue14 & 6) == 0) {
                    iIntValue14 |= composer14.changed(FlowRow) ? 4 : 2;
                }
                if (composer14.shouldExecute((iIntValue14 & 19) != 18, iIntValue14 & 1)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-576819526, iIntValue14, -1, "app.chalo.compose.components.buttons.ChaloButtonWithOrangeArrow.<anonymous> (ChaloFilledButtonAndroid.kt:41)");
                    }
                    TransformingSequence transformingSequenceW = StringsKt.W(str7, new String[]{" "});
                    Object objRememberedValue5 = composer14.rememberedValue();
                    if (objRememberedValue5 == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue5 = new bj(i2);
                        composer14.updateRememberedValue(objRememberedValue5);
                    }
                    List listQ = SequencesKt.q(SequencesKt.e(transformingSequenceW, (Function1) objRememberedValue5));
                    composer14.startReplaceGroup(-272779542);
                    int i10 = 0;
                    for (Object obj6 : listQ) {
                        int i11 = i10 + 1;
                        if (i10 < 0) {
                            CollectionsKt.z0();
                            throw null;
                        }
                        String str8 = (String) obj6;
                        boolean z = i10 < CollectionsKt.K(listQ);
                        TextKt.m2623TextNvy7gAk(str8, FlowRow.align(Modifier.INSTANCE, Alignment.INSTANCE.getCenterVertically()), ChaloTheme.a(composer14, 6).f1915a, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, textStyle, composer14, 0, 0, 131064);
                        if (z) {
                            composer14.startReplaceGroup(-7272039);
                            TextKt.m2623TextNvy7gAk(" ", null, 0L, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, composer14, 6, 0, 262142);
                        } else {
                            composer14.startReplaceGroup(-9320798);
                        }
                        composer14.endReplaceGroup();
                        i10 = i11;
                    }
                    composer14.endReplaceGroup();
                    ChaloSpacersKt.w(composer14, 0);
                    Modifier.Companion companion9 = Modifier.INSTANCE;
                    Alignment.Companion companion10 = Alignment.INSTANCE;
                    Modifier modifierM264backgroundbw27NRU$default = BackgroundKt.m264backgroundbw27NRU$default(ClipKt.clip(SizeKt.m828size3ABfNKs(FlowRow.align(companion9, companion10.getCenterVertically()), ChaloTheme.b(composer14, 6).h), RoundedCornerShapeKt.getCircleShape()), ChaloTheme.a(composer14, 6).B, null, 2, null);
                    MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy2 = BoxKt.maybeCachedBoxMeasurePolicy(companion10.getCenter(), false);
                    long currentCompositeKeyHashCode7 = ComposablesKt.getCurrentCompositeKeyHashCode(composer14, 0);
                    int i12 = (int) (currentCompositeKeyHashCode7 ^ (currentCompositeKeyHashCode7 >>> 32));
                    CompositionLocalMap currentCompositionLocalMap7 = composer14.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier7 = ComposedModifierKt.materializeModifier(composer14, modifierM264backgroundbw27NRU$default);
                    ComposeUiNode.Companion companion11 = ComposeUiNode.INSTANCE;
                    Function0<ComposeUiNode> constructor7 = companion11.getConstructor();
                    if (composer14.getApplier() == null) {
                        ComposablesKt.invalidApplier();
                    }
                    composer14.startReusableNode();
                    if (composer14.getInserting()) {
                        composer14.createNode(constructor7);
                    } else {
                        composer14.useNode();
                    }
                    Composer composerM3915constructorimpl7 = Updater.m3915constructorimpl(composer14);
                    pk0.v(companion11, composerM3915constructorimpl7, measurePolicyMaybeCachedBoxMeasurePolicy2, composerM3915constructorimpl7, currentCompositionLocalMap7);
                    Updater.m3923setimpl(composerM3915constructorimpl7, modifierMaterializeModifier7, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion11, composerM3915constructorimpl7, Integer.valueOf(i12), composerM3915constructorimpl7));
                    BoxScopeInstance boxScopeInstance2 = BoxScopeInstance.INSTANCE;
                    IconKt.m2070Iconww6aTOc(IconAssetHelper_androidKt.a(IconType.IC_ARROW_UP, composer14, 6), (String) null, GraphicsLayerModifierKt.m4770graphicsLayer_6ThJ44$default(SizeKt.m828size3ABfNKs(companion9, ChaloTheme.b(composer14, 6).f), 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 90.0f, 0.0f, 0L, null, false, null, 0L, 0L, 0, 0, null, 524031, null), ChaloTheme.a(composer14, 6).t, composer14, Painter.$stable | 48, 0);
                    composer14.endNode();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer14.skipToGroupEnd();
                }
                return unit;
            case 14:
                List list2 = (List) obj5;
                MultiSelectDatePickerSpec multiSelectDatePickerSpec = (MultiSelectDatePickerSpec) obj4;
                Composer composer15 = (Composer) obj2;
                int iIntValue15 = ((Integer) obj3).intValue();
                Intrinsics.i((FlowRowScope) obj, "$this$FlowRow");
                if (composer15.shouldExecute((iIntValue15 & 17) != 16, iIntValue15 & 1)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-730302275, iIntValue15, -1, "app.chalo.compose.components.dialogs.ChaloMultiSelectDatePicker.<anonymous>.<anonymous>.<anonymous> (ChaloMultiSelectDatePicker.kt:130)");
                    }
                    Iterator it = list2.iterator();
                    while (it.hasNext()) {
                        ChaloMultiSelectDatePickerKt.c((LegendUIState) it.next(), composer15, 0);
                        SpacerKt.Spacer(SizeKt.m833width3ABfNKs(Modifier.INSTANCE, multiSelectDatePickerSpec.e), composer15, 0);
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer15.skipToGroupEnd();
                }
                return unit;
            case 15:
                return a(obj, obj2, obj3);
            case 16:
                return c(obj, obj2, obj3);
            case 17:
                return d(obj, obj2, obj3);
            case 18:
                return e(obj, obj2, obj3);
            case 19:
                return f(obj, obj2, obj3);
            case 20:
                return g(obj, obj2, obj3);
            case 21:
                return h(obj, obj2, obj3);
            case 22:
                return i(obj, obj2, obj3);
            case 23:
                return j(obj, obj2, obj3);
            case 24:
                return k(obj, obj2, obj3);
            case 25:
                return l(obj, obj2, obj3);
            case 26:
                return m(obj, obj2, obj3);
            case 27:
                return n(obj, obj2, obj3);
            case 28:
                return o(obj, obj2, obj3);
            default:
                FromAndToStopCardData fromAndToStopCardData = (FromAndToStopCardData) obj5;
                TextStyle textStyle2 = (TextStyle) obj4;
                ColumnScope Card4 = (ColumnScope) obj;
                Composer composer16 = (Composer) obj2;
                int iIntValue16 = ((Integer) obj3).intValue();
                Intrinsics.i(Card4, "$this$Card");
                if (composer16.shouldExecute((iIntValue16 & 17) != 16, iIntValue16 & 1)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-292330558, iIntValue16, -1, "app.chalo.premiumbus.ui.stopselection.compose.FromAndToStopCard.<anonymous> (FromAndToStopCard.kt:69)");
                    }
                    FromAndToStopCardKt.b(fromAndToStopCardData, PaddingKt.m785paddingVpY3zN4(Modifier.INSTANCE, ChaloTheme.b(composer16, 0).g, ChaloTheme.b(composer16, 0).h), null, null, 0L, textStyle2, null, false, 0, false, 0.0f, 0.0f, composer16, 0, 0, 3932);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer16.skipToGroupEnd();
                }
                return unit;
        }
    }
}
