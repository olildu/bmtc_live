package defpackage;

import androidx.compose.animation.AnimatedContentScope;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.focus.FocusRequester;
import androidx.compose.ui.platform.SoftwareKeyboardController;
import app.chalo.compose.components.ChaloCircularLoadingBoxKt;
import app.chalo.compose.resources.StringResourcesHelperKt;
import app.chalo.ncmc.data.NcmcCardRechargeConfigAppModel;
import app.chalo.ncmc.data.appmodel.ChaloCardRechargeConfigAppModel;
import app.chalo.ncmc.ui.cardrechargeamount.CardRechargeAmountErrorType;
import app.chalo.ncmc.ui.cardrechargeamount.CardRechargeAmountLayoutType;
import app.chalo.ncmc.ui.cardrechargeamount.ChaloCardRechargeAmountViewState;
import app.chalo.ncmc.ui.cardrechargeamount.compose.ChaloCardRechargeAmountScreenKt;
import app.chalo.ncmc.ui.common.CardRechargeSuccessScreenKt;
import app.chalo.ncmc.ui.common.CardRechargeSuccessScreenUiData;
import app.chalo.ncmc.ui.ncmcofflinerecharge.OfflineCardRechargeViewState;
import app.chalo.ncmc.ui.ncmcofflinerecharge.OfflineRechargeScreenType;
import app.chalo.ncmc.ui.ncmcofflinerecharge.compose.OfflineCardRechargeScreenKt;
import app.chalo.ncmc.ui.ncmconlinerecharge.compose.NcmcOnlineRechargeScreenKt;
import app.chalo.providers.stringprovider.StringEnum;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class ej implements Function4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15558a;
    public final /* synthetic */ FocusRequester b;
    public final /* synthetic */ SoftwareKeyboardController c;
    public final /* synthetic */ Function1 d;
    public final /* synthetic */ Object e;

    public /* synthetic */ ej(Object obj, FocusRequester focusRequester, SoftwareKeyboardController softwareKeyboardController, Function1 function1, int i) {
        this.f15558a = i;
        this.e = obj;
        this.b = focusRequester;
        this.c = softwareKeyboardController;
        this.d = function1;
    }

    @Override // kotlin.jvm.functions.Function4
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        List listS;
        String strC;
        NcmcCardRechargeConfigAppModel ncmcCardRechargeConfigAppModel;
        int i = this.f15558a;
        Unit unit = Unit.f17538a;
        String strC2 = null;
        Object obj5 = this.e;
        switch (i) {
            case 0:
                ChaloCardRechargeAmountViewState chaloCardRechargeAmountViewState = (ChaloCardRechargeAmountViewState) obj5;
                AnimatedContentScope AnimatedContent = (AnimatedContentScope) obj;
                CardRechargeAmountLayoutType screenType = (CardRechargeAmountLayoutType) obj2;
                Composer composer = (Composer) obj3;
                int iIntValue = ((Integer) obj4).intValue();
                Intrinsics.i(AnimatedContent, "$this$AnimatedContent");
                Intrinsics.i(screenType, "screenType");
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(2018826949, iIntValue, -1, "app.chalo.ncmc.ui.cardrechargeamount.compose.ChaloCardRechargeAmountScreen.<anonymous>.<anonymous> (ChaloCardRechargeAmountScreen.kt:121)");
                }
                String message = "Rendering screen for type " + screenType;
                Intrinsics.i(message, "message");
                if (screenType.equals(CardRechargeAmountLayoutType.FullScreenLoadingLayout.f6287a)) {
                    composer.startReplaceGroup(-1232513474);
                    ChaloCircularLoadingBoxKt.a(null, composer, 0);
                    composer.endReplaceGroup();
                } else {
                    boolean zEquals = screenType.equals(CardRechargeAmountLayoutType.EnterAmountLayout.f6285a);
                    Function1 function1 = this.d;
                    if (zEquals) {
                        composer.startReplaceGroup(446936059);
                        String str = chaloCardRechargeAmountViewState.h;
                        CardRechargeAmountErrorType cardRechargeAmountErrorType = chaloCardRechargeAmountViewState.k;
                        boolean z = chaloCardRechargeAmountViewState.n != null;
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(425676321, 0, -1, "app.chalo.ncmc.ui.cardrechargeamount.compose.getErrorMsg (ChaloCardRechargeAmountScreen.kt:424)");
                        }
                        if (cardRechargeAmountErrorType instanceof CardRechargeAmountErrorType.ErrorAmountBelowMinimumRequiredAmount) {
                            composer.startReplaceGroup(-1714948178);
                            if (z) {
                                composer.startReplaceGroup(-1714912932);
                                composer.endReplaceGroup();
                            } else {
                                composer.startReplaceGroup(1053059722);
                                strC2 = StringResourcesHelperKt.c(StringEnum.ERROR_AMOUNT_BELOW_MIN, new Object[]{((CardRechargeAmountErrorType.ErrorAmountBelowMinimumRequiredAmount) cardRechargeAmountErrorType).f6281a}, composer, 6);
                                composer.endReplaceGroup();
                            }
                            composer.endReplaceGroup();
                        } else if (cardRechargeAmountErrorType instanceof CardRechargeAmountErrorType.ErrorAmountNotInRequiredMultiples) {
                            composer.startReplaceGroup(-1714662978);
                            strC2 = StringResourcesHelperKt.c(StringEnum.ERROR_AMOUNT_MULTIPLE_ISSUE, new Object[]{((CardRechargeAmountErrorType.ErrorAmountNotInRequiredMultiples) cardRechargeAmountErrorType).f6282a}, composer, 6);
                            composer.endReplaceGroup();
                        } else if (cardRechargeAmountErrorType instanceof CardRechargeAmountErrorType.ErrorRechargeLimitExceeded) {
                            composer.startReplaceGroup(-1714430881);
                            strC2 = StringResourcesHelperKt.c(StringEnum.ERROR_AMOUNT_MAX_LIMIT_EXCEEDED, new Object[]{((CardRechargeAmountErrorType.ErrorRechargeLimitExceeded) cardRechargeAmountErrorType).f6283a}, composer, 6);
                            composer.endReplaceGroup();
                        } else {
                            if (!Intrinsics.d(cardRechargeAmountErrorType, CardRechargeAmountErrorType.NoError.f6284a)) {
                                throw pk0.p(composer, 1053055391);
                            }
                            composer.startReplaceGroup(-1714225723);
                            composer.endReplaceGroup();
                        }
                        String str2 = strC2;
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        boolean z2 = chaloCardRechargeAmountViewState.l;
                        String str3 = chaloCardRechargeAmountViewState.n;
                        String strC3 = StringResourcesHelperKt.c(StringEnum.PROCEED, new Object[0], composer, 6);
                        StringEnum stringEnum = StringEnum.ADD_AMOUNT;
                        boolean zChanged = composer.changed(function1);
                        Object objRememberedValue = composer.rememberedValue();
                        if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = new g0(function1, 23);
                            composer.updateRememberedValue(objRememberedValue);
                        }
                        Function1 function2 = (Function1) objRememberedValue;
                        boolean zChanged2 = composer.changed(function1);
                        Object objRememberedValue2 = composer.rememberedValue();
                        if (zChanged2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue2 = new ii(function1, 21);
                            composer.updateRememberedValue(objRememberedValue2);
                        }
                        NcmcOnlineRechargeScreenKt.a(null, stringEnum, str, str2, str3, z2, strC3, this.b, this.c, function2, (Function0) objRememberedValue2, composer, 12582960, 0);
                        composer.endReplaceGroup();
                    } else if (screenType instanceof CardRechargeAmountLayoutType.ErrorLayout) {
                        composer.startReplaceGroup(448162760);
                        ChaloCardRechargeAmountScreenKt.a(chaloCardRechargeAmountViewState.e, chaloCardRechargeAmountViewState.o, chaloCardRechargeAmountViewState.p, chaloCardRechargeAmountViewState.q, ((CardRechargeAmountLayoutType.ErrorLayout) screenType).f6286a, function1, composer, 0);
                        composer.endReplaceGroup();
                    } else {
                        if (!screenType.equals(CardRechargeAmountLayoutType.RechargeSuccess.f6288a)) {
                            throw pk0.p(composer, -1232514100);
                        }
                        composer.startReplaceGroup(448676678);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(1342330534, 0, -1, "app.chalo.ncmc.ui.cardrechargeamount.compose.getSuccessScreenData (ChaloCardRechargeAmountScreen.kt:458)");
                        }
                        List listS2 = CollectionsKt.S(StringResourcesHelperKt.c(StringEnum.ONLINE_RECHARGE_FIRST_STEP_DESC, new Object[0], composer, 6), StringResourcesHelperKt.c(StringEnum.ONLINE_RECHARGE_SECOND_STEP_DESC, new Object[0], composer, 6));
                        String strC4 = StringResourcesHelperKt.c(StringEnum.RECHARGE_SUCCESSFULL, new Object[0], composer, 6);
                        ChaloCardRechargeConfigAppModel chaloCardRechargeConfigAppModel = chaloCardRechargeAmountViewState.b;
                        String str4 = chaloCardRechargeConfigAppModel != null ? chaloCardRechargeConfigAppModel.m : null;
                        String strC5 = StringResourcesHelperKt.c(StringEnum.OKAY, new Object[0], composer, 6);
                        boolean zChanged3 = composer.changed(function1);
                        Object objRememberedValue3 = composer.rememberedValue();
                        if (zChanged3 || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue3 = new ii(function1, 17);
                            composer.updateRememberedValue(objRememberedValue3);
                        }
                        Function0 function0 = (Function0) objRememberedValue3;
                        String strC6 = StringResourcesHelperKt.c(StringEnum.RECHARGE_DETAILS_CAPS, new Object[0], composer, 6);
                        boolean zChanged4 = composer.changed(function1);
                        Object objRememberedValue4 = composer.rememberedValue();
                        if (zChanged4 || objRememberedValue4 == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue4 = new ii(function1, 18);
                            composer.updateRememberedValue(objRememberedValue4);
                        }
                        CardRechargeSuccessScreenUiData cardRechargeSuccessScreenUiData = new CardRechargeSuccessScreenUiData(strC4, str4, listS2, strC5, function0, strC6, (Function0) objRememberedValue4);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        CardRechargeSuccessScreenKt.a(null, cardRechargeSuccessScreenUiData, false, composer, 384, 1);
                        composer.endReplaceGroup();
                    }
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                return unit;
            default:
                OfflineCardRechargeViewState offlineCardRechargeViewState = (OfflineCardRechargeViewState) obj5;
                AnimatedContentScope AnimatedContent2 = (AnimatedContentScope) obj;
                OfflineRechargeScreenType screenType2 = (OfflineRechargeScreenType) obj2;
                Composer composer2 = (Composer) obj3;
                int iIntValue2 = ((Integer) obj4).intValue();
                Intrinsics.i(AnimatedContent2, "$this$AnimatedContent");
                Intrinsics.i(screenType2, "screenType");
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(896752668, iIntValue2, -1, "app.chalo.ncmc.ui.ncmcofflinerecharge.compose.OfflineCardRechargeScreen.<anonymous>.<anonymous> (OfflineCardRechargeScreen.kt:127)");
                }
                int i2 = OfflineCardRechargeScreenKt.WhenMappings.f6402a[screenType2.ordinal()];
                Function1 function3 = this.d;
                if (i2 == 1) {
                    composer2.startReplaceGroup(462266094);
                    OfflineCardRechargeScreenKt.b(offlineCardRechargeViewState, this.b, this.c, function3, composer2, 0);
                    composer2.endReplaceGroup();
                } else {
                    if (i2 != 2) {
                        throw pk0.p(composer2, -1509110888);
                    }
                    composer2.startReplaceGroup(462629941);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1573406295, 0, -1, "app.chalo.ncmc.ui.ncmcofflinerecharge.compose.getOfflineSuccessScreenData (OfflineCardRechargeScreen.kt:170)");
                    }
                    boolean z3 = offlineCardRechargeViewState.p;
                    String str5 = (z3 || (ncmcCardRechargeConfigAppModel = offlineCardRechargeViewState.b) == null) ? null : ncmcCardRechargeConfigAppModel.o;
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1757721366, 0, -1, "app.chalo.ncmc.ui.ncmcofflinerecharge.compose.getInstructionList (OfflineCardRechargeScreen.kt:556)");
                    }
                    if (z3) {
                        composer2.startReplaceGroup(36064033);
                        listS = CollectionsKt.S(StringResourcesHelperKt.c(StringEnum.UVIK_BALANCE_UPDATE_STEP1_DESCRIPTION, new Object[0], composer2, 6), StringResourcesHelperKt.c(StringEnum.UVIK_BALANCE_UPDATE_STEP2_DESCRIPTION, new Object[0], composer2, 6));
                        composer2.endReplaceGroup();
                    } else {
                        composer2.startReplaceGroup(36317861);
                        listS = CollectionsKt.S(StringResourcesHelperKt.c(StringEnum.NCMC_OFFLINE_RECHARGE_SUCCESS_STEP_1, new Object[0], composer2, 6), StringResourcesHelperKt.c(StringEnum.NCMC_OFFLINE_RECHARGE_SUCCESS_STEP_2, new Object[0], composer2, 6), StringResourcesHelperKt.c(StringEnum.NCMC_OFFLINE_RECHARGE_SUCCESS_STEP_3, new Object[0], composer2, 6));
                        composer2.endReplaceGroup();
                    }
                    List list = listS;
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    String strC7 = StringResourcesHelperKt.c(StringEnum.NCMC_RECHARGE_SUCCESS_TITLE, new Object[0], composer2, 6);
                    if (z3) {
                        composer2.startReplaceGroup(1926758603);
                        strC = StringResourcesHelperKt.c(StringEnum.UPDATE_BALANCE, new Object[0], composer2, 6);
                        composer2.endReplaceGroup();
                    } else {
                        composer2.startReplaceGroup(1926841621);
                        strC = StringResourcesHelperKt.c(StringEnum.OKAY, new Object[0], composer2, 6);
                        composer2.endReplaceGroup();
                    }
                    String str6 = strC;
                    boolean zChanged5 = composer2.changed(function3);
                    Object objRememberedValue5 = composer2.rememberedValue();
                    if (zChanged5 || objRememberedValue5 == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue5 = new qm0(function3, 18);
                        composer2.updateRememberedValue(objRememberedValue5);
                    }
                    Function0 function4 = (Function0) objRememberedValue5;
                    if (z3) {
                        composer2.startReplaceGroup(1927111569);
                        strC2 = StringResourcesHelperKt.c(StringEnum.DO_LATER, new Object[0], composer2, 6);
                        composer2.endReplaceGroup();
                    } else {
                        composer2.startReplaceGroup(1927187581);
                        composer2.endReplaceGroup();
                    }
                    String str7 = strC2;
                    boolean zChanged6 = composer2.changed(function3);
                    Object objRememberedValue6 = composer2.rememberedValue();
                    if (zChanged6 || objRememberedValue6 == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue6 = new qm0(function3, 19);
                        composer2.updateRememberedValue(objRememberedValue6);
                    }
                    CardRechargeSuccessScreenUiData cardRechargeSuccessScreenUiData2 = new CardRechargeSuccessScreenUiData(strC7, str5, list, str6, function4, str7, (Function0) objRememberedValue6);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    CardRechargeSuccessScreenKt.a(null, cardRechargeSuccessScreenUiData2, false, composer2, 0, 5);
                    composer2.endReplaceGroup();
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                return unit;
        }
    }
}
