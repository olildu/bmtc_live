package defpackage;

import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material3.IconKt;
import androidx.compose.material3.ModalBottomSheetKt;
import androidx.compose.material3.TextKt;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.ClipKt;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.GraphicsLayerModifierKt;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.layout.ContentScale;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import app.chalo.compose.CardWithSideStepIconAndLineKt;
import app.chalo.compose.ComposableSingletons$CardWithSideStepIconAndLineKt;
import app.chalo.compose.components.ChaloChipKt;
import app.chalo.compose.components.ChaloGridLayoutKt;
import app.chalo.compose.components.ChaloLoadingDialogKt;
import app.chalo.compose.components.ChaloSnackbarKt;
import app.chalo.compose.components.ChaloSpacersKt;
import app.chalo.compose.components.ComposableSingletons$ChaloChipKt;
import app.chalo.compose.components.ComposableSingletons$ChaloGridLayoutKt;
import app.chalo.compose.components.ComposableSingletons$ChaloLoadingDialogKt;
import app.chalo.compose.components.ComposableSingletons$ChaloRoundedBottomSheetKt;
import app.chalo.compose.components.ComposableSingletons$ChaloScrollableTabRowKt;
import app.chalo.compose.components.ComposableSingletons$ChaloSearchBarComposableKt;
import app.chalo.compose.components.ComposableSingletons$ChaloSnackbarKt;
import app.chalo.compose.components.ComposableSingletons$ChaloToolBarKt;
import app.chalo.compose.components.buttons.ChaloFilledButtonKt;
import app.chalo.compose.components.buttons.ComposableSingletons$ChaloCircularBackButtonKt;
import app.chalo.compose.components.buttons.ComposableSingletons$ChaloFilledButtonKt;
import app.chalo.compose.components.dialogs.ChaloConfirmationDialogKt;
import app.chalo.compose.components.dialogs.ComposableSingletons$ChaloConfirmationDialogKt;
import app.chalo.compose.resources.IconAssetHelper_androidKt;
import app.chalo.compose.resources.PainterResourceHelperKt;
import app.chalo.compose.resources.StringResourcesHelperKt;
import app.chalo.compose.theme.ChaloTheme;
import app.chalo.compose.theme.ChaloTypographyKt;
import app.chalo.core.chalomap.ComposableSingletons$ChaloMapMarkerInfoWindowProvider_androidKt;
import app.chalo.instantticket.ui.faredetails.compose.ComposableSingletons$BottomSheetViewsKt;
import app.chalo.ncmc.ui.cardlinking.linking.CardLinkingErrorType;
import app.chalo.ncmc.ui.cardlinking.linking.ChaloCardLinkViewState;
import app.chalo.ncmc.ui.cardlinking.linking.compose.ChaloCardLinkCardScreenKt;
import app.chalo.ncmc.ui.cardlinking.linking.compose.ComposableSingletons$ChaloCardLinkCardScreenKt;
import app.chalo.ncmc.ui.cardrechargeamount.CardRechargeAmountLayoutType;
import app.chalo.ncmc.ui.cardrechargeamount.CardRechargeDataFetchErrorReason;
import app.chalo.ncmc.ui.cardrechargeamount.ChaloCardRechargeAmountViewState;
import app.chalo.ncmc.ui.cardrechargeamount.compose.ChaloCardRechargeAmountScreenKt;
import app.chalo.ncmc.ui.cardrechargeamount.compose.ComposableSingletons$ChaloCardRechargeAmountScreenKt;
import app.chalo.ncmc.ui.common.CardRechargeTncDialogueKt;
import app.chalo.ncmc.ui.common.ComposableSingletons$CardRechargeSuccessScreenKt;
import app.chalo.ncmc.ui.common.ComposableSingletons$CardRechargeTncDialogueKt;
import app.chalo.ncmc.ui.landing.ChaloCardInfoViewState;
import app.chalo.ncmc.ui.landing.ChaloCardOperationType;
import app.chalo.ncmc.ui.landing.ChaloCardOptionUiModel;
import app.chalo.ncmc.ui.landing.FetchCardStatus;
import app.chalo.ncmc.ui.landing.compose.CardInfoLandingScreenKt;
import app.chalo.ncmc.ui.landing.compose.ChaloCardComposeItemsKt;
import app.chalo.ncmc.ui.landing.compose.ComposableSingletons$CardInfoLandingScreenKt;
import app.chalo.ncmc.ui.landing.compose.ComposableSingletons$ChaloCardComposeItemsKt;
import app.chalo.providers.iconassetprovider.IconType;
import app.chalo.providers.stringprovider.StringEnum;
import app.chalo.uistate.components.ProductGridContainerSpec;
import app.chalo.validationsdk.blevalidation.ui.ComposableSingletons$BleValidationScreen_androidKt;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import okhttp3.internal.ws.WebSocketProtocol;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class lr implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f18340a;

    public /* synthetic */ lr(int i) {
        this.f18340a = i;
    }

    private final Object a(Object obj, Object obj2) {
        Composer composer = (Composer) obj;
        int iIntValue = ((Integer) obj2).intValue();
        ComposableLambda composableLambda = ComposableSingletons$ChaloLoadingDialogKt.f1830a;
        if (composer.shouldExecute((iIntValue & 3) != 2, iIntValue & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(713367689, iIntValue, -1, "app.chalo.compose.components.ComposableSingletons$ChaloLoadingDialogKt.lambda$713367689.<anonymous> (ChaloLoadingDialog.kt:116)");
            }
            ChaloLoadingDialogKt.b(null, false, null, composer, 0, 7);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return Unit.f17538a;
    }

    private final Object c(Object obj, Object obj2) {
        Composer composer = (Composer) obj;
        int iIntValue = ((Integer) obj2).intValue();
        ComposableLambda composableLambda = ComposableSingletons$ChaloMapMarkerInfoWindowProvider_androidKt.f2028a;
        if (composer.shouldExecute((iIntValue & 3) != 2, iIntValue & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1855814999, iIntValue, -1, "app.chalo.core.chalomap.ComposableSingletons$ChaloMapMarkerInfoWindowProvider_androidKt.lambda$-1855814999.<anonymous> (ChaloMapMarkerInfoWindowProvider.android.kt:42)");
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return Unit.f17538a;
    }

    private final Object d(Object obj, Object obj2) {
        Composer composer = (Composer) obj;
        int iIntValue = ((Integer) obj2).intValue();
        ComposableLambda composableLambda = ComposableSingletons$ChaloRoundedBottomSheetKt.f1831a;
        if (composer.shouldExecute((iIntValue & 3) != 2, iIntValue & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1373844293, iIntValue, -1, "app.chalo.compose.components.ComposableSingletons$ChaloRoundedBottomSheetKt.lambda$-1373844293.<anonymous> (ChaloRoundedBottomSheet.kt:36)");
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return Unit.f17538a;
    }

    private final Object e(Object obj, Object obj2) {
        Composer composer = (Composer) obj;
        int iIntValue = ((Integer) obj2).intValue();
        ComposableLambda composableLambda = ComposableSingletons$ChaloScrollableTabRowKt.f1832a;
        if (composer.shouldExecute((iIntValue & 3) != 2, iIntValue & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(222514926, iIntValue, -1, "app.chalo.compose.components.ComposableSingletons$ChaloScrollableTabRowKt.lambda$222514926.<anonymous> (ChaloScrollableTabRow.kt:57)");
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return Unit.f17538a;
    }

    private final Object f(Object obj, Object obj2) {
        Composer composer = (Composer) obj;
        int iIntValue = ((Integer) obj2).intValue();
        ComposableLambda composableLambda = ComposableSingletons$ChaloSearchBarComposableKt.f1833a;
        if (composer.shouldExecute((iIntValue & 3) != 2, iIntValue & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(576073174, iIntValue, -1, "app.chalo.compose.components.ComposableSingletons$ChaloSearchBarComposableKt.lambda$576073174.<anonymous> (ChaloSearchBarComposable.kt:141)");
            }
            ImageKt.Image(PainterResourceHelperKt.a(IconType.CLOSE_LOCATION_SEARCH, composer, 6), (String) null, (Modifier) null, (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composer, Painter.$stable | 48, 124);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return Unit.f17538a;
    }

    private final Object g(Object obj, Object obj2) {
        Composer composer = (Composer) obj;
        int iIntValue = ((Integer) obj2).intValue();
        ComposableLambda composableLambda = ComposableSingletons$ChaloSnackbarKt.f1834a;
        if (composer.shouldExecute((iIntValue & 3) != 2, iIntValue & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-135099943, iIntValue, -1, "app.chalo.compose.components.ComposableSingletons$ChaloSnackbarKt.lambda$-135099943.<anonymous> (ChaloSnackbar.kt:129)");
            }
            Modifier modifierFillMaxSize$default = SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null);
            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
            long currentCompositeKeyHashCode = ComposablesKt.getCurrentCompositeKeyHashCode(composer, 0);
            int i = (int) (currentCompositeKeyHashCode ^ (currentCompositeKeyHashCode >>> 32));
            CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composer, modifierFillMaxSize$default);
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
            pk0.v(companion, composerM3915constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy, composerM3915constructorimpl, currentCompositionLocalMap);
            Updater.m3923setimpl(composerM3915constructorimpl, modifierMaterializeModifier, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion, composerM3915constructorimpl, Integer.valueOf(i), composerM3915constructorimpl));
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            Object objRememberedValue = composer.rememberedValue();
            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new ep(23);
                composer.updateRememberedValue(objRememberedValue);
            }
            ChaloSnackbarKt.a(null, "Something went wrong", null, (Function0) objRememberedValue, composer, 3120, 5);
            composer.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return Unit.f17538a;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.f18340a;
        int i2 = 6;
        Unit unit = Unit.f17538a;
        switch (i) {
            case 0:
                Composer composer = (Composer) obj;
                int iIntValue = ((Integer) obj2).intValue();
                ComposableLambda composableLambda = ComposableSingletons$BleValidationScreen_androidKt.f10611a;
                if (composer.shouldExecute((iIntValue & 3) != 2, iIntValue & 1)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1196164545, iIntValue, -1, "app.chalo.validationsdk.blevalidation.ui.ComposableSingletons$BleValidationScreen_androidKt.lambda$1196164545.<anonymous> (BleValidationScreen.android.kt:220)");
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer.skipToGroupEnd();
                }
                return unit;
            case 1:
                Composer composer2 = (Composer) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                ComposableLambda composableLambda2 = ComposableSingletons$BleValidationScreen_androidKt.f10611a;
                if (composer2.shouldExecute((iIntValue2 & 3) != 2, iIntValue2 & 1)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1152453837, iIntValue2, -1, "app.chalo.validationsdk.blevalidation.ui.ComposableSingletons$BleValidationScreen_androidKt.lambda$-1152453837.<anonymous> (BleValidationScreen.android.kt:227)");
                    }
                    IconKt.m2070Iconww6aTOc(PainterResourceHelperKt.a(IconType.ICON_HELP, composer2, 6), (String) null, (Modifier) null, ChaloTheme.a(composer2, 0).g, composer2, Painter.$stable | 48, 4);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer2.skipToGroupEnd();
                }
                return unit;
            case 2:
                Composer composer3 = (Composer) obj;
                int iIntValue3 = ((Integer) obj2).intValue();
                ComposableLambda composableLambda3 = ComposableSingletons$BleValidationScreen_androidKt.f10611a;
                if (composer3.shouldExecute((iIntValue3 & 3) != 2, iIntValue3 & 1)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1587110453, iIntValue3, -1, "app.chalo.validationsdk.blevalidation.ui.ComposableSingletons$BleValidationScreen_androidKt.lambda$-1587110453.<anonymous> (BleValidationScreen.android.kt:245)");
                    }
                    IconKt.m2070Iconww6aTOc(IconAssetHelper_androidKt.a(IconType.ROUTE_SCREEN_MENU, composer3, 6), (String) null, (Modifier) null, ChaloTheme.a(composer3, 0).g, composer3, Painter.$stable | 48, 4);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer3.skipToGroupEnd();
                }
                return unit;
            case 3:
                Composer composer4 = (Composer) obj;
                int iIntValue4 = ((Integer) obj2).intValue();
                ComposableLambda composableLambda4 = ComposableSingletons$BleValidationScreen_androidKt.f10611a;
                if (composer4.shouldExecute((iIntValue4 & 3) != 2, iIntValue4 & 1)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-678277772, iIntValue4, -1, "app.chalo.validationsdk.blevalidation.ui.ComposableSingletons$BleValidationScreen_androidKt.lambda$-678277772.<anonymous> (BleValidationScreen.android.kt:263)");
                    }
                    TextKt.m2623TextNvy7gAk(StringResourcesHelperKt.c(StringEnum.VIEW_RECEIPT, new Object[0], composer4, 6), null, 0L, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ChaloTypographyKt.b(ChaloTheme.e(composer4, 0)), composer4, 0, 0, 131070);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer4.skipToGroupEnd();
                }
                return unit;
            case 4:
                Composer composer5 = (Composer) obj;
                int iIntValue5 = ((Integer) obj2).intValue();
                ComposableLambda composableLambda5 = ComposableSingletons$BottomSheetViewsKt.f3910a;
                if (composer5.shouldExecute((iIntValue5 & 3) != 2, iIntValue5 & 1)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-33926016, iIntValue5, -1, "app.chalo.instantticket.ui.faredetails.compose.ComposableSingletons$BottomSheetViewsKt.lambda$-33926016.<anonymous> (BottomSheetViews.kt:224)");
                    }
                    TextKt.m2623TextNvy7gAk(StringResourcesHelperKt.c(StringEnum.NAME, new Object[0], composer5, 6), null, ChaloTheme.a(composer5, 0).k, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ChaloTypographyKt.d(ChaloTheme.e(composer5, 0)), composer5, 0, 0, 131066);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer5.skipToGroupEnd();
                }
                return unit;
            case 5:
                Composer composer6 = (Composer) obj;
                int iIntValue6 = ((Integer) obj2).intValue();
                ComposableLambda composableLambda6 = ComposableSingletons$BottomSheetViewsKt.f3910a;
                if (composer6.shouldExecute((iIntValue6 & 3) != 2, iIntValue6 & 1)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(768516329, iIntValue6, -1, "app.chalo.instantticket.ui.faredetails.compose.ComposableSingletons$BottomSheetViewsKt.lambda$768516329.<anonymous> (BottomSheetViews.kt:254)");
                    }
                    TextKt.m2623TextNvy7gAk(StringResourcesHelperKt.c(StringEnum.PHONE_NUMBER, new Object[0], composer6, 6), null, ChaloTheme.a(composer6, 0).k, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ChaloTypographyKt.d(ChaloTheme.e(composer6, 0)), composer6, 0, 0, 131066);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer6.skipToGroupEnd();
                }
                return unit;
            case 6:
                Composer composer7 = (Composer) obj;
                int iIntValue7 = ((Integer) obj2).intValue();
                ComposableLambda composableLambda7 = ComposableSingletons$CardInfoLandingScreenKt.f6381a;
                if (composer7.shouldExecute((iIntValue7 & 3) != 2, iIntValue7 & 1)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1199950664, iIntValue7, -1, "app.chalo.ncmc.ui.landing.compose.ComposableSingletons$CardInfoLandingScreenKt.lambda$1199950664.<anonymous> (CardInfoLandingScreen.kt:593)");
                    }
                    Modifier modifierM264backgroundbw27NRU$default = BackgroundKt.m264backgroundbw27NRU$default(Modifier.INSTANCE, ChaloTheme.a(composer7, 0).t, null, 2, null);
                    ChaloCardInfoViewState chaloCardInfoViewState = new ChaloCardInfoViewState(CollectionsKt.S("1234", "3434"), FetchCardStatus.FETCHED_AND_AVAILABLE, CollectionsKt.S(new ChaloCardOptionUiModel(ChaloCardOperationType.AllCardOption.Recharge.f6366a, "Recharge", "Recharge your card"), new ChaloCardOptionUiModel(ChaloCardOperationType.SpecificCardOption.ViewOfflineBalance.f6373a, "View Balance", "View your card balance"), new ChaloCardOptionUiModel(ChaloCardOperationType.AllCardOption.UpdateBalance.f6367a, "Update Balance", "Update your card balance"), new ChaloCardOptionUiModel(ChaloCardOperationType.AllCardOption.BuyNewCard.f6364a, "Buy New Card", "Buy a new card"), new ChaloCardOptionUiModel(ChaloCardOperationType.SpecificCardOption.Block.f6368a, "Block Card", "Block your card")), 7864189);
                    Object objRememberedValue = composer7.rememberedValue();
                    if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue = new cp(i2);
                        composer7.updateRememberedValue(objRememberedValue);
                    }
                    CardInfoLandingScreenKt.b(modifierM264backgroundbw27NRU$default, chaloCardInfoViewState, (Function1) objRememberedValue, composer7, 384);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer7.skipToGroupEnd();
                }
                return unit;
            case 7:
                Composer composer8 = (Composer) obj;
                int iIntValue8 = ((Integer) obj2).intValue();
                ComposableLambda composableLambda8 = ComposableSingletons$CardRechargeSuccessScreenKt.f6317a;
                if (composer8.shouldExecute((iIntValue8 & 3) != 2, iIntValue8 & 1)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-505139544, iIntValue8, -1, "app.chalo.ncmc.ui.common.ComposableSingletons$CardRechargeSuccessScreenKt.lambda$-505139544.<anonymous> (CardRechargeSuccessScreen.kt:269)");
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer8.skipToGroupEnd();
                }
                return unit;
            case 8:
                Composer composer9 = (Composer) obj;
                int iIntValue9 = ((Integer) obj2).intValue();
                ComposableLambda composableLambda9 = ComposableSingletons$CardRechargeTncDialogueKt.f6318a;
                if (composer9.shouldExecute((iIntValue9 & 3) != 2, iIntValue9 & 1)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1134704289, iIntValue9, -1, "app.chalo.ncmc.ui.common.ComposableSingletons$CardRechargeTncDialogueKt.lambda$1134704289.<anonymous> (CardRechargeTncDialogue.kt:160)");
                    }
                    Modifier modifierM788paddingqDBjuR0$default = PaddingKt.m788paddingqDBjuR0$default(BackgroundKt.m264backgroundbw27NRU$default(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), ChaloTheme.a(composer9, 0).t, null, 2, null), 0.0f, ChaloTheme.b(composer9, 0).h, 0.0f, 0.0f, 13, null);
                    List listS = CollectionsKt.S("sdkcs skjdcasj dcljask dclj sdcljd sscd", "sdkcs skjdcasj dcljask dclj sdcljd sscd sdkcs skjdcasj dcljask dclj sdcljd sscd");
                    Object objRememberedValue2 = composer9.rememberedValue();
                    Composer.Companion companion = Composer.INSTANCE;
                    if (objRememberedValue2 == companion.getEmpty()) {
                        objRememberedValue2 = new ep(20);
                        composer9.updateRememberedValue(objRememberedValue2);
                    }
                    Function0 function0 = (Function0) objRememberedValue2;
                    Object objRememberedValue3 = composer9.rememberedValue();
                    if (objRememberedValue3 == companion.getEmpty()) {
                        objRememberedValue3 = new ep(20);
                        composer9.updateRememberedValue(objRememberedValue3);
                    }
                    CardRechargeTncDialogueKt.a(modifierM788paddingqDBjuR0$default, listS, "Terms and Conditions", "ACCEPT", function0, "CANCEL", (Function0) objRememberedValue3, composer9, 1797552);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer9.skipToGroupEnd();
                }
                return unit;
            case 9:
                Composer composer10 = (Composer) obj;
                int iIntValue10 = ((Integer) obj2).intValue();
                ComposableLambda composableLambda10 = ComposableSingletons$CardWithSideStepIconAndLineKt.f1805a;
                if (composer10.shouldExecute((iIntValue10 & 3) != 2, iIntValue10 & 1)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-2056580233, iIntValue10, -1, "app.chalo.compose.ComposableSingletons$CardWithSideStepIconAndLineKt.lambda$-2056580233.<anonymous> (CardWithSideStepIconAndLine.kt:102)");
                    }
                    ImageKt.Image(PainterResourceHelperKt.a(IconType.WALK_NEARBYCARD_BLACK, composer10, 6), (String) null, (Modifier) null, (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composer10, Painter.$stable | 48, 124);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer10.skipToGroupEnd();
                }
                return unit;
            case 10:
                Composer composer11 = (Composer) obj;
                int iIntValue11 = ((Integer) obj2).intValue();
                ComposableLambda composableLambda11 = ComposableSingletons$CardWithSideStepIconAndLineKt.f1805a;
                if (composer11.shouldExecute((iIntValue11 & 3) != 2, iIntValue11 & 1)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1550065173, iIntValue11, -1, "app.chalo.compose.ComposableSingletons$CardWithSideStepIconAndLineKt.lambda$-1550065173.<anonymous> (CardWithSideStepIconAndLine.kt:99)");
                    }
                    Modifier.Companion companion2 = Modifier.INSTANCE;
                    Modifier modifierFillMaxSize$default = SizeKt.fillMaxSize$default(companion2, 0.0f, 1, null);
                    MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
                    long currentCompositeKeyHashCode = ComposablesKt.getCurrentCompositeKeyHashCode(composer11, 0);
                    int i3 = (int) (currentCompositeKeyHashCode ^ (currentCompositeKeyHashCode >>> 32));
                    CompositionLocalMap currentCompositionLocalMap = composer11.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composer11, modifierFillMaxSize$default);
                    ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
                    Function0<ComposeUiNode> constructor = companion3.getConstructor();
                    if (composer11.getApplier() == null) {
                        ComposablesKt.invalidApplier();
                    }
                    composer11.startReusableNode();
                    if (composer11.getInserting()) {
                        composer11.createNode(constructor);
                    } else {
                        composer11.useNode();
                    }
                    Composer composerM3915constructorimpl = Updater.m3915constructorimpl(composer11);
                    pk0.v(companion3, composerM3915constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy, composerM3915constructorimpl, currentCompositionLocalMap);
                    Updater.m3923setimpl(composerM3915constructorimpl, modifierMaterializeModifier, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion3, composerM3915constructorimpl, Integer.valueOf(i3), composerM3915constructorimpl));
                    BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                    CardWithSideStepIconAndLineKt.a(ComposableSingletons$CardWithSideStepIconAndLineKt.f1805a, ComposableSingletons$CardWithSideStepIconAndLineKt.b, SizeKt.fillMaxWidth$default(companion2, 0.0f, 1, null), false, 0L, composer11, 438, 24);
                    composer11.endNode();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer11.skipToGroupEnd();
                }
                return unit;
            case 11:
                Composer composer12 = (Composer) obj;
                int iIntValue12 = ((Integer) obj2).intValue();
                ComposableLambda composableLambda12 = ComposableSingletons$ChaloCardComposeItemsKt.f6383a;
                if (composer12.shouldExecute((iIntValue12 & 3) != 2, iIntValue12 & 1)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-364943119, iIntValue12, -1, "app.chalo.ncmc.ui.landing.compose.ComposableSingletons$ChaloCardComposeItemsKt.lambda$-364943119.<anonymous> (ChaloCardComposeItems.kt:65)");
                    }
                    ChaloSpacersKt.w(composer12, 0);
                    Modifier.Companion companion4 = Modifier.INSTANCE;
                    Modifier modifierM264backgroundbw27NRU$default2 = BackgroundKt.m264backgroundbw27NRU$default(ClipKt.clip(SizeKt.m828size3ABfNKs(companion4, ChaloTheme.b(composer12, 0).h), RoundedCornerShapeKt.getCircleShape()), ChaloTheme.a(composer12, 0).B, null, 2, null);
                    MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy2 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getCenter(), false);
                    long currentCompositeKeyHashCode2 = ComposablesKt.getCurrentCompositeKeyHashCode(composer12, 0);
                    int i4 = (int) (currentCompositeKeyHashCode2 ^ (currentCompositeKeyHashCode2 >>> 32));
                    CompositionLocalMap currentCompositionLocalMap2 = composer12.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(composer12, modifierM264backgroundbw27NRU$default2);
                    ComposeUiNode.Companion companion5 = ComposeUiNode.INSTANCE;
                    Function0<ComposeUiNode> constructor2 = companion5.getConstructor();
                    if (composer12.getApplier() == null) {
                        ComposablesKt.invalidApplier();
                    }
                    composer12.startReusableNode();
                    if (composer12.getInserting()) {
                        composer12.createNode(constructor2);
                    } else {
                        composer12.useNode();
                    }
                    Composer composerM3915constructorimpl2 = Updater.m3915constructorimpl(composer12);
                    pk0.v(companion5, composerM3915constructorimpl2, measurePolicyMaybeCachedBoxMeasurePolicy2, composerM3915constructorimpl2, currentCompositionLocalMap2);
                    Updater.m3923setimpl(composerM3915constructorimpl2, modifierMaterializeModifier2, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion5, composerM3915constructorimpl2, Integer.valueOf(i4), composerM3915constructorimpl2));
                    BoxScopeInstance boxScopeInstance2 = BoxScopeInstance.INSTANCE;
                    IconKt.m2070Iconww6aTOc(PainterResourceHelperKt.a(IconType.IC_ARROW_UP, composer12, 6), (String) null, GraphicsLayerModifierKt.m4770graphicsLayer_6ThJ44$default(SizeKt.m828size3ABfNKs(companion4, ChaloTheme.b(composer12, 0).f), 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 90.0f, 0.0f, 0L, null, false, null, 0L, 0L, 0, 0, null, 524031, null), ChaloTheme.a(composer12, 0).t, composer12, Painter.$stable | 48, 0);
                    composer12.endNode();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer12.skipToGroupEnd();
                }
                return unit;
            case 12:
                Composer composer13 = (Composer) obj;
                int iIntValue13 = ((Integer) obj2).intValue();
                ComposableLambda composableLambda13 = ComposableSingletons$ChaloCardComposeItemsKt.f6383a;
                if (composer13.shouldExecute((iIntValue13 & 3) != 2, iIntValue13 & 1)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1281252817, iIntValue13, -1, "app.chalo.ncmc.ui.landing.compose.ComposableSingletons$ChaloCardComposeItemsKt.lambda$1281252817.<anonymous> (ChaloCardComposeItems.kt:335)");
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer13.skipToGroupEnd();
                }
                return unit;
            case 13:
                Composer composer14 = (Composer) obj;
                int iIntValue14 = ((Integer) obj2).intValue();
                ComposableLambda composableLambda14 = ComposableSingletons$ChaloCardComposeItemsKt.f6383a;
                if (composer14.shouldExecute((iIntValue14 & 3) != 2, iIntValue14 & 1)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(556037296, iIntValue14, -1, "app.chalo.ncmc.ui.landing.compose.ComposableSingletons$ChaloCardComposeItemsKt.lambda$556037296.<anonymous> (ChaloCardComposeItems.kt:318)");
                    }
                    Modifier.Companion companion6 = Modifier.INSTANCE;
                    Modifier modifierM785paddingVpY3zN4 = PaddingKt.m785paddingVpY3zN4(BackgroundKt.m264backgroundbw27NRU$default(SizeKt.fillMaxSize$default(companion6, 0.0f, 1, null), ChaloTheme.a(composer14, 0).t, null, 2, null), ChaloTheme.b(composer14, 0).h, ChaloTheme.b(composer14, 0).k);
                    Arrangement.HorizontalOrVertical center = Arrangement.INSTANCE.getCenter();
                    Alignment.Companion companion7 = Alignment.INSTANCE;
                    MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(center, companion7.getStart(), composer14, 6);
                    long currentCompositeKeyHashCode3 = ComposablesKt.getCurrentCompositeKeyHashCode(composer14, 0);
                    int i5 = (int) (currentCompositeKeyHashCode3 ^ (currentCompositeKeyHashCode3 >>> 32));
                    CompositionLocalMap currentCompositionLocalMap3 = composer14.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier3 = ComposedModifierKt.materializeModifier(composer14, modifierM785paddingVpY3zN4);
                    ComposeUiNode.Companion companion8 = ComposeUiNode.INSTANCE;
                    Function0<ComposeUiNode> constructor3 = companion8.getConstructor();
                    if (composer14.getApplier() == null) {
                        ComposablesKt.invalidApplier();
                    }
                    composer14.startReusableNode();
                    if (composer14.getInserting()) {
                        composer14.createNode(constructor3);
                    } else {
                        composer14.useNode();
                    }
                    Composer composerM3915constructorimpl3 = Updater.m3915constructorimpl(composer14);
                    pk0.v(companion8, composerM3915constructorimpl3, measurePolicyColumnMeasurePolicy, composerM3915constructorimpl3, currentCompositionLocalMap3);
                    Updater.m3923setimpl(composerM3915constructorimpl3, modifierMaterializeModifier3, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion8, composerM3915constructorimpl3, Integer.valueOf(i5), composerM3915constructorimpl3));
                    ChaloCardComposeItemsKt.b(ColumnScopeInstance.INSTANCE.align(companion6, companion7.getCenterHorizontally()), ComposableSingletons$ChaloCardComposeItemsKt.b, 48, composer14, 0);
                    composer14.endNode();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer14.skipToGroupEnd();
                }
                return unit;
            case 14:
                Composer composer15 = (Composer) obj;
                int iIntValue15 = ((Integer) obj2).intValue();
                ComposableLambda composableLambda15 = ComposableSingletons$ChaloCardLinkCardScreenKt.f6280a;
                if (composer15.shouldExecute((iIntValue15 & 3) != 2, iIntValue15 & 1)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-722565995, iIntValue15, -1, "app.chalo.ncmc.ui.cardlinking.linking.compose.ComposableSingletons$ChaloCardLinkCardScreenKt.lambda$-722565995.<anonymous> (ChaloCardLinkCardScreen.kt:174)");
                    }
                    TextKt.m2623TextNvy7gAk(StringResourcesHelperKt.c(StringEnum.HINT_ENTER_LINK_CODE, new Object[0], composer15, 6), null, ChaloTheme.a(composer15, 0).i, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ChaloTypographyKt.l(ChaloTheme.e(composer15, 0)), composer15, 0, 0, 131066);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer15.skipToGroupEnd();
                }
                return unit;
            case 15:
                Composer composer16 = (Composer) obj;
                int iIntValue16 = ((Integer) obj2).intValue();
                ComposableLambda composableLambda16 = ComposableSingletons$ChaloCardLinkCardScreenKt.f6280a;
                if (composer16.shouldExecute((iIntValue16 & 3) != 2, iIntValue16 & 1)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1573178771, iIntValue16, -1, "app.chalo.ncmc.ui.cardlinking.linking.compose.ComposableSingletons$ChaloCardLinkCardScreenKt.lambda$1573178771.<anonymous> (ChaloCardLinkCardScreen.kt:223)");
                    }
                    TextKt.m2623TextNvy7gAk(StringResourcesHelperKt.c(StringEnum.HINT_ENTER_CARD_NUMBER, new Object[0], composer16, 6), null, ChaloTheme.a(composer16, 0).i, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ChaloTypographyKt.l(ChaloTheme.e(composer16, 0)), composer16, 0, 0, 131066);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer16.skipToGroupEnd();
                }
                return unit;
            case 16:
                Composer composer17 = (Composer) obj;
                int iIntValue17 = ((Integer) obj2).intValue();
                ComposableLambda composableLambda17 = ComposableSingletons$ChaloCardLinkCardScreenKt.f6280a;
                if (composer17.shouldExecute((iIntValue17 & 3) != 2, iIntValue17 & 1)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1587789600, iIntValue17, -1, "app.chalo.ncmc.ui.cardlinking.linking.compose.ComposableSingletons$ChaloCardLinkCardScreenKt.lambda$1587789600.<anonymous> (ChaloCardLinkCardScreen.kt:242)");
                    }
                    ChaloCardLinkViewState chaloCardLinkViewState = new ChaloCardLinkViewState("525235662362362523", "435", CardLinkingErrorType.NO_ERROR, null, 0, 0, 0, 0, 8064);
                    Object objRememberedValue4 = composer17.rememberedValue();
                    if (objRememberedValue4 == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue4 = new cp(7);
                        composer17.updateRememberedValue(objRememberedValue4);
                    }
                    ChaloCardLinkCardScreenKt.a(chaloCardLinkViewState, (Function1) objRememberedValue4, null, composer17, 432);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer17.skipToGroupEnd();
                }
                return unit;
            case 17:
                Composer composer18 = (Composer) obj;
                int iIntValue18 = ((Integer) obj2).intValue();
                ComposableLambda composableLambda18 = ComposableSingletons$ChaloCardRechargeAmountScreenKt.f6311a;
                if (composer18.shouldExecute((iIntValue18 & 3) != 2, iIntValue18 & 1)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1961310353, iIntValue18, -1, "app.chalo.ncmc.ui.cardrechargeamount.compose.ComposableSingletons$ChaloCardRechargeAmountScreenKt.lambda$1961310353.<anonymous> (ChaloCardRechargeAmountScreen.kt:402)");
                    }
                    ChaloCardRechargeAmountViewState chaloCardRechargeAmountViewState = new ChaloCardRechargeAmountViewState(CollectionsKt.S("Rs 2", "Rs 50"), new CardRechargeAmountLayoutType.ErrorLayout(CardRechargeDataFetchErrorReason.CARD_BLOCKED), 2088975);
                    Object objRememberedValue5 = composer18.rememberedValue();
                    if (objRememberedValue5 == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue5 = new cp(8);
                        composer18.updateRememberedValue(objRememberedValue5);
                    }
                    ChaloCardRechargeAmountScreenKt.b(chaloCardRechargeAmountViewState, (Function1) objRememberedValue5, null, ModalBottomSheetKt.rememberModalBottomSheetState(false, null, composer18, 0, 3), composer18, 432);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer18.skipToGroupEnd();
                }
                return unit;
            case 18:
                Composer composer19 = (Composer) obj;
                int iIntValue19 = ((Integer) obj2).intValue();
                ComposableLambda composableLambda19 = ComposableSingletons$ChaloChipKt.f1828a;
                if (composer19.shouldExecute((iIntValue19 & 3) != 2, iIntValue19 & 1)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1669481735, iIntValue19, -1, "app.chalo.compose.components.ComposableSingletons$ChaloChipKt.lambda$-1669481735.<anonymous> (ChaloChip.kt:45)");
                    }
                    ChaloChipKt.a(null, true, composer19, 432);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer19.skipToGroupEnd();
                }
                return unit;
            case 19:
                Composer composer20 = (Composer) obj;
                int iIntValue20 = ((Integer) obj2).intValue();
                ComposableLambda composableLambda20 = ComposableSingletons$ChaloCircularBackButtonKt.f1855a;
                if (composer20.shouldExecute((iIntValue20 & 3) != 2, iIntValue20 & 1)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1236590717, iIntValue20, -1, "app.chalo.compose.components.buttons.ComposableSingletons$ChaloCircularBackButtonKt.lambda$1236590717.<anonymous> (ChaloCircularBackButton.kt:36)");
                    }
                    IconKt.m2070Iconww6aTOc(PainterResourceHelperKt.a(IconType.IC_ARROW_BACK_BLACK, composer20, 6), (String) null, (Modifier) null, 0L, composer20, Painter.$stable | 48, 12);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer20.skipToGroupEnd();
                }
                return unit;
            case 20:
                Composer composer21 = (Composer) obj;
                int iIntValue21 = ((Integer) obj2).intValue();
                ComposableLambda composableLambda21 = ComposableSingletons$ChaloConfirmationDialogKt.f1893a;
                if (composer21.shouldExecute((iIntValue21 & 3) != 2, iIntValue21 & 1)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(682712790, iIntValue21, -1, "app.chalo.compose.components.dialogs.ComposableSingletons$ChaloConfirmationDialogKt.lambda$682712790.<anonymous> (ChaloConfirmationDialog.kt:287)");
                    }
                    Object objRememberedValue6 = composer21.rememberedValue();
                    Composer.Companion companion9 = Composer.INSTANCE;
                    if (objRememberedValue6 == companion9.getEmpty()) {
                        objRememberedValue6 = new ep(21);
                        composer21.updateRememberedValue(objRememberedValue6);
                    }
                    Function0 function1 = (Function0) objRememberedValue6;
                    Object objRememberedValue7 = composer21.rememberedValue();
                    if (objRememberedValue7 == companion9.getEmpty()) {
                        objRememberedValue7 = new ep(21);
                        composer21.updateRememberedValue(objRememberedValue7);
                    }
                    Function0 function2 = (Function0) objRememberedValue7;
                    Object objRememberedValue8 = composer21.rememberedValue();
                    if (objRememberedValue8 == companion9.getEmpty()) {
                        objRememberedValue8 = new ep(21);
                        composer21.updateRememberedValue(objRememberedValue8);
                    }
                    ChaloConfirmationDialogKt.b("Are you sure?", "are you sure you want to do this?", "Yes", function1, "No", function2, null, (Function0) objRememberedValue8, composer21, 12807606, 64);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer21.skipToGroupEnd();
                }
                return unit;
            case 21:
                Composer composer22 = (Composer) obj;
                int iIntValue22 = ((Integer) obj2).intValue();
                ComposableLambda composableLambda22 = ComposableSingletons$ChaloFilledButtonKt.f1856a;
                if (composer22.shouldExecute((iIntValue22 & 3) != 2, iIntValue22 & 1)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1692133172, iIntValue22, -1, "app.chalo.compose.components.buttons.ComposableSingletons$ChaloFilledButtonKt.lambda$-1692133172.<anonymous> (ChaloFilledButton.kt:439)");
                    }
                    Arrangement.HorizontalOrVertical center2 = Arrangement.INSTANCE.getCenter();
                    Alignment.Horizontal centerHorizontally = Alignment.INSTANCE.getCenterHorizontally();
                    Modifier.Companion companion10 = Modifier.INSTANCE;
                    MeasurePolicy measurePolicyColumnMeasurePolicy2 = ColumnKt.columnMeasurePolicy(center2, centerHorizontally, composer22, 54);
                    long currentCompositeKeyHashCode4 = ComposablesKt.getCurrentCompositeKeyHashCode(composer22, 0);
                    int i6 = (int) ((currentCompositeKeyHashCode4 >>> 32) ^ currentCompositeKeyHashCode4);
                    CompositionLocalMap currentCompositionLocalMap4 = composer22.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier4 = ComposedModifierKt.materializeModifier(composer22, companion10);
                    ComposeUiNode.Companion companion11 = ComposeUiNode.INSTANCE;
                    Function0<ComposeUiNode> constructor4 = companion11.getConstructor();
                    if (composer22.getApplier() == null) {
                        ComposablesKt.invalidApplier();
                    }
                    composer22.startReusableNode();
                    if (composer22.getInserting()) {
                        composer22.createNode(constructor4);
                    } else {
                        composer22.useNode();
                    }
                    Composer composerM3915constructorimpl4 = Updater.m3915constructorimpl(composer22);
                    pk0.v(companion11, composerM3915constructorimpl4, measurePolicyColumnMeasurePolicy2, composerM3915constructorimpl4, currentCompositionLocalMap4);
                    Updater.m3923setimpl(composerM3915constructorimpl4, modifierMaterializeModifier4, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion11, composerM3915constructorimpl4, Integer.valueOf(i6), composerM3915constructorimpl4));
                    ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
                    Object objRememberedValue9 = composer22.rememberedValue();
                    Composer.Companion companion12 = Composer.INSTANCE;
                    if (objRememberedValue9 == companion12.getEmpty()) {
                        objRememberedValue9 = new ep(22);
                        composer22.updateRememberedValue(objRememberedValue9);
                    }
                    ChaloFilledButtonKt.g(null, "ORANGE BUTTON", null, 0L, null, true, 0.0f, null, 0L, (Function0) objRememberedValue9, composer22, 805503024, 477);
                    SpacerKt.Spacer(SizeKt.m814height3ABfNKs(companion10, ChaloTheme.b(composer22, 6).i), composer22, 0);
                    Object objRememberedValue10 = composer22.rememberedValue();
                    if (objRememberedValue10 == companion12.getEmpty()) {
                        objRememberedValue10 = new ep(22);
                        composer22.updateRememberedValue(objRememberedValue10);
                    }
                    ChaloFilledButtonKt.f("GREY BUTTON", false, null, null, null, 0.0f, 0L, (Function0) objRememberedValue10, composer22, 12582918, WebSocketProtocol.PAYLOAD_SHORT);
                    SpacerKt.Spacer(SizeKt.m814height3ABfNKs(companion10, ChaloTheme.b(composer22, 6).i), composer22, 0);
                    Object objRememberedValue11 = composer22.rememberedValue();
                    if (objRememberedValue11 == companion12.getEmpty()) {
                        objRememberedValue11 = new ep(22);
                        composer22.updateRememberedValue(objRememberedValue11);
                    }
                    ChaloFilledButtonKt.k("WHITE BUTTON", null, 0L, null, null, (Function0) objRememberedValue11, composer22, 196614, 30);
                    composer22.endNode();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer22.skipToGroupEnd();
                }
                return unit;
            case 22:
                Composer composer23 = (Composer) obj;
                int iIntValue23 = ((Integer) obj2).intValue();
                ComposableLambda composableLambda23 = ComposableSingletons$ChaloGridLayoutKt.f1829a;
                if (composer23.shouldExecute((iIntValue23 & 3) != 2, iIntValue23 & 1)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(211137657, iIntValue23, -1, "app.chalo.compose.components.ComposableSingletons$ChaloGridLayoutKt.lambda$211137657.<anonymous> (ChaloGridLayout.kt:117)");
                    }
                    Modifier modifierM784padding3ABfNKs = PaddingKt.m784padding3ABfNKs(BackgroundKt.m264backgroundbw27NRU$default(SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null), ChaloTheme.a(composer23, 6).t, null, 2, null), ChaloTheme.b(composer23, 6).h);
                    MeasurePolicy measurePolicyColumnMeasurePolicy3 = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composer23, 0);
                    long currentCompositeKeyHashCode5 = ComposablesKt.getCurrentCompositeKeyHashCode(composer23, 0);
                    int i7 = (int) (currentCompositeKeyHashCode5 ^ (currentCompositeKeyHashCode5 >>> 32));
                    CompositionLocalMap currentCompositionLocalMap5 = composer23.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier5 = ComposedModifierKt.materializeModifier(composer23, modifierM784padding3ABfNKs);
                    ComposeUiNode.Companion companion13 = ComposeUiNode.INSTANCE;
                    Function0<ComposeUiNode> constructor5 = companion13.getConstructor();
                    if (composer23.getApplier() == null) {
                        ComposablesKt.invalidApplier();
                    }
                    composer23.startReusableNode();
                    if (composer23.getInserting()) {
                        composer23.createNode(constructor5);
                    } else {
                        composer23.useNode();
                    }
                    Composer composerM3915constructorimpl5 = Updater.m3915constructorimpl(composer23);
                    pk0.v(companion13, composerM3915constructorimpl5, measurePolicyColumnMeasurePolicy3, composerM3915constructorimpl5, currentCompositionLocalMap5);
                    Updater.m3923setimpl(composerM3915constructorimpl5, modifierMaterializeModifier5, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion13, composerM3915constructorimpl5, Integer.valueOf(i7), composerM3915constructorimpl5));
                    ColumnScopeInstance columnScopeInstance2 = ColumnScopeInstance.INSTANCE;
                    ChaloGridLayoutKt.a(null, new ProductGridContainerSpec(0.0f, 0, 2, 59), ComposableSingletons$ChaloGridLayoutKt.f1829a, composer23, 384, 1);
                    composer23.endNode();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer23.skipToGroupEnd();
                }
                return unit;
            case 23:
                return a(obj, obj2);
            case 24:
                return c(obj, obj2);
            case 25:
                return d(obj, obj2);
            case 26:
                return e(obj, obj2);
            case 27:
                return f(obj, obj2);
            case 28:
                return g(obj, obj2);
            default:
                Composer composer24 = (Composer) obj;
                int iIntValue24 = ((Integer) obj2).intValue();
                ComposableLambda composableLambda24 = ComposableSingletons$ChaloToolBarKt.f1835a;
                if (composer24.shouldExecute((iIntValue24 & 3) != 2, iIntValue24 & 1)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1309555147, iIntValue24, -1, "app.chalo.compose.components.ComposableSingletons$ChaloToolBarKt.lambda$1309555147.<anonymous> (ChaloToolBar.kt:28)");
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer24.skipToGroupEnd();
                }
                return unit;
        }
    }
}
