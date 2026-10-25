package app.chalo.mticket.ui.tripinfo;

import app.chalo.compose.theme.ChaloPadding;
import app.chalo.compose.theme.ChaloThemeHelper;
import app.chalo.data.ProductBookingBranding;
import app.chalo.instantticket.ui.routeselection.uistate.RouteSelectionInputUISpec;
import app.chalo.instantticket.ui.routeselection.uistate.RouteSelectionInputUIState;
import app.chalo.productbooking.common.data.models.app.ProductBookingRouteDetails;
import app.chalo.productbooking.common.data.models.app.ProductBookingSpecialFeature;
import app.chalo.productbooking.common.data.models.app.ProductBookingStopDetails;
import app.chalo.providers.stringprovider.StringEnum;
import app.chalo.providers.stringprovider.StringProvider;
import app.chalo.uistate.base.ChaloColorToken;
import app.chalo.uistate.base.UiEventHandler;
import app.chalo.uistate.button.ButtonUIState;
import app.chalo.uistate.button.ButtonUIStateFactory;
import app.chalo.uistate.dialog.DialogUIStateFactory;
import app.chalo.uistate.dialog.LoadingDialogUIState;
import app.chalo.uistate.snackbar.SnackbarUIState;
import app.chalo.uistate.snackbar.SnackbarUIStateFactory;
import app.chalo.uistate.text.TextUIState;
import app.chalo.uistate.text.TextWithSpecialFeatureBuilder;
import app.chalo.uistate.text.TextWithSpecialFeaturesTagsUIStateKt;
import app.chalo.uistate.text.UIFontStyle;
import app.chalo.uistate.text.UIFontWeight;
import app.chalo.uistate.text.UITextAlign;
import app.chalo.uistate.text.UITextDecoration;
import app.chalo.uistate.text.UITextOverflow;
import app.chalo.uistate.text.UITextStyle;
import app.chalo.uistate.toolbar.ToolbarUIState;
import app.chalo.uistate.toolbar.ToolbarUIStateFactory;
import defpackage.wg0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.EmptyList;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/mticket/ui/tripinfo/MTicketTripInfoUIStateFactory;", "", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class MTicketTripInfoUIStateFactory {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final StringProvider f5786a;

    public MTicketTripInfoUIStateFactory(StringProvider stringProvider) {
        this.f5786a = stringProvider;
    }

    public static RouteSelectionInputUIState c(String str, final String str2, final List list, String str3, Function0 function0) {
        return new RouteSelectionInputUIState(new TextUIState.ChaloTextUIState(str, UITextStyle.HeadlineMedium, ChaloColorToken.Black_40.f9764a, 1, (UITextAlign) null, UIFontWeight.Normal, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, UITextOverflow.Ellipsis, (UIFontStyle) null, (String) null, 7088), TextWithSpecialFeaturesTagsUIStateKt.c(0.0f, new Function1<TextWithSpecialFeatureBuilder, Unit>() { // from class: app.chalo.mticket.ui.tripinfo.MTicketTripInfoUIStateFactory$routeStopSelection$1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                ArrayList arrayList = ((TextWithSpecialFeatureBuilder) obj).f10091a;
                if (str2.length() > 0) {
                    TextWithSpecialFeatureBuilder.b(arrayList, str2, UITextStyle.DisplaySmall, ChaloColorToken.Black_87.f9768a, UIFontWeight.SemiBold, 104);
                }
                List list2 = list;
                List list3 = list2;
                if (list3 != null && !list3.isEmpty()) {
                    List list4 = list2;
                    ArrayList arrayList2 = new ArrayList(CollectionsKt.v(list4, 10));
                    Iterator it = list4.iterator();
                    while (it.hasNext()) {
                        arrayList2.add(((ProductBookingSpecialFeature) it.next()).f8197a);
                    }
                    TextWithSpecialFeaturesTagsUIStateKt.a(arrayList, arrayList2);
                }
                return Unit.f17538a;
            }
        }, 2), UiEventHandler.Companion.a(function0), str3 != null ? new TextUIState.ChaloTextUIState(str3, UITextStyle.BodySmall, ChaloColorToken.ErrorColor.f9794a, 1, (UITextAlign) null, (UIFontWeight) null, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8176) : null, new RouteSelectionInputUISpec(new ChaloPadding(str2.length() == 0 ? ChaloThemeHelper.a().l : ChaloThemeHelper.a().f, 0.0f, 0.0f, 0.0f, 14), 14));
    }

    /* JADX WARN: Code duplicated, block: B:101:0x0533  */
    /* JADX WARN: Code duplicated, block: B:105:0x053b  */
    /* JADX WARN: Code duplicated, block: B:108:0x0548  */
    /* JADX WARN: Code duplicated, block: B:111:0x0578  */
    /* JADX WARN: Code duplicated, block: B:113:0x0599  */
    /* JADX WARN: Code duplicated, block: B:119:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:29:0x02aa  */
    /* JADX WARN: Code duplicated, block: B:32:0x02d2  */
    /* JADX WARN: Code duplicated, block: B:35:0x02e8  */
    /* JADX WARN: Code duplicated, block: B:38:0x031d  */
    /* JADX WARN: Code duplicated, block: B:41:0x0324  */
    /* JADX WARN: Code duplicated, block: B:44:0x0342  */
    /* JADX WARN: Code duplicated, block: B:46:0x0355  */
    /* JADX WARN: Code duplicated, block: B:49:0x0361  */
    /* JADX WARN: Code duplicated, block: B:52:0x037a  */
    /* JADX WARN: Code duplicated, block: B:54:0x0387  */
    /* JADX WARN: Code duplicated, block: B:58:0x03b0  */
    /* JADX WARN: Code duplicated, block: B:61:0x03c3  */
    /* JADX WARN: Code duplicated, block: B:63:0x03c7  */
    /* JADX WARN: Code duplicated, block: B:65:0x03cb  */
    /* JADX WARN: Code duplicated, block: B:67:0x03cf  */
    /* JADX WARN: Code duplicated, block: B:70:0x03d9  */
    /* JADX WARN: Code duplicated, block: B:73:0x0407  */
    /* JADX WARN: Code duplicated, block: B:76:0x041b  */
    /* JADX WARN: Code duplicated, block: B:79:0x045b  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Code duplicated, block: B:80:0x045e  */
    /* JADX WARN: Code duplicated, block: B:83:0x046f  */
    /* JADX WARN: Code duplicated, block: B:85:0x0473  */
    /* JADX WARN: Code duplicated, block: B:88:0x0481  */
    /* JADX WARN: Code duplicated, block: B:90:0x04b5  */
    /* JADX WARN: Code duplicated, block: B:91:0x04b8  */
    /* JADX WARN: Code duplicated, block: B:94:0x04d1  */
    /* JADX WARN: Code duplicated, block: B:97:0x0525  */
    /* JADX WARN: Code duplicated, block: B:98:0x0527  */
    public final Object a(MTicketTripInfoDataState mTicketTripInfoDataState, Function1 function1, ContinuationImpl continuationImpl) {
        MTicketTripInfoUIStateFactory$convertToUIState$1 mTicketTripInfoUIStateFactory$convertToUIState$1;
        MTicketTripInfoDataState mTicketTripInfoDataState2;
        Function1 function2;
        ToolbarUIStateFactory toolbarUIStateFactory;
        Object objB;
        ToolbarUIState toolbarUIState;
        ButtonUIStateFactory buttonUIStateFactory;
        Object objB2;
        ToolbarUIState toolbarUIState2;
        Object obj;
        Function1 function3;
        ButtonUIStateFactory buttonUIStateFactory2;
        MTicketTripInfoDataState mTicketTripInfoDataState3;
        MTicketTripInfoDataState mTicketTripInfoDataState4;
        ButtonUIState buttonUIStateG;
        Boolean bool;
        MTicketTripInfoDataState mTicketTripInfoDataState5;
        TextUIState.ChaloTextUIState chaloTextUIState;
        Object objB3;
        MTicketTripInfoDataState mTicketTripInfoDataState6;
        Object obj2;
        Function1 function4;
        ButtonUIState buttonUIState;
        ToolbarUIState toolbarUIState3;
        MTicketTripInfoDataState mTicketTripInfoDataState7;
        Function1 function5;
        ToolbarUIState toolbarUIState4;
        ButtonUIState buttonUIState2;
        TextUIState.ChaloTextUIState chaloTextUIState2;
        LoadingDialogUIState loadingDialogUIStateA;
        DialogUIStateFactory dialogUIStateFactory;
        Object objB4;
        Object obj3;
        TextUIState.ChaloTextUIState chaloTextUIState3;
        DialogUIStateFactory dialogUIStateFactory2;
        ProductBookingBranding productBookingBranding;
        MTicketTripInfoSnackBarType mTicketTripInfoSnackBarType;
        MTicketTripInfoDataState mTicketTripInfoDataState8;
        Function1 function6;
        ToolbarUIState toolbarUIState5;
        ButtonUIState buttonUIState3;
        TextUIState.ChaloTextUIState chaloTextUIState4;
        LoadingDialogUIState loadingDialogUIState;
        SnackbarUIState snackbarUIState;
        Object objD;
        Object obj4;
        Object objB5;
        SnackbarUIState snackbarUIState2;
        Object obj5;
        ButtonUIState buttonUIState4;
        ToolbarUIState toolbarUIState6;
        Function1 function7;
        ProductBookingBranding productBookingBranding2;
        LoadingDialogUIState loadingDialogUIState2;
        TextUIState.ChaloTextUIState chaloTextUIState5;
        MTicketTripInfoUIStateFactory mTicketTripInfoUIStateFactory;
        String str;
        ProductBookingRouteDetails productBookingRouteDetails;
        String str2;
        String str3;
        List list;
        List list2;
        String str4;
        Object objB6;
        Object obj6;
        TextUIState.ChaloTextUIState chaloTextUIState6;
        String str5;
        RouteSelectionInputUIState routeSelectionInputUIStateC;
        Object objB7;
        CoroutineSingletons coroutineSingletons;
        RouteSelectionInputUIState routeSelectionInputUIState;
        LoadingDialogUIState loadingDialogUIState3;
        ProductBookingBranding productBookingBranding3;
        SnackbarUIState snackbarUIState3;
        ButtonUIState buttonUIState5;
        Function1 function8;
        ToolbarUIState toolbarUIState7;
        MTicketTripInfoUIStateFactory mTicketTripInfoUIStateFactory2;
        String str6;
        ProductBookingStopDetails productBookingStopDetails;
        String str7;
        List list3;
        CoroutineSingletons coroutineSingletons2;
        LoadingDialogUIState loadingDialogUIState4;
        StringProvider stringProvider;
        RouteSelectionInputUIState routeSelectionInputUIState2;
        ToolbarUIState toolbarUIState8;
        ButtonUIState buttonUIState6;
        Function1 function9;
        ProductBookingBranding productBookingBranding4;
        SnackbarUIState snackbarUIState4;
        TextUIState.ChaloTextUIState chaloTextUIState7;
        MTicketTripInfoUIStateFactory mTicketTripInfoUIStateFactory3;
        String str8;
        String str9;
        Object objB8;
        CoroutineSingletons coroutineSingletons3;
        Object obj7;
        LoadingDialogUIState loadingDialogUIState5;
        RouteSelectionInputUIState routeSelectionInputUIStateC2;
        StringProvider stringProvider2;
        Object objB9;
        CoroutineSingletons coroutineSingletons4;
        LoadingDialogUIState loadingDialogUIState6;
        Object obj8;
        ToolbarUIState toolbarUIState9;
        RouteSelectionInputUIState routeSelectionInputUIState3;
        MTicketTripInfoUIStateFactory mTicketTripInfoUIStateFactory4;
        String str10;
        ProductBookingStopDetails productBookingStopDetails2;
        String str11;
        CoroutineSingletons coroutineSingletons5;
        List list4;
        StringProvider stringProvider3;
        LoadingDialogUIState loadingDialogUIState7;
        ToolbarUIState toolbarUIState10;
        RouteSelectionInputUIState routeSelectionInputUIState4;
        TextUIState.ChaloTextUIState chaloTextUIState8;
        RouteSelectionInputUIState routeSelectionInputUIState5;
        ProductBookingBranding productBookingBranding5;
        MTicketTripInfoUIStateFactory mTicketTripInfoUIStateFactory5;
        String str12;
        MTicketTripInfoUIStateFactory mTicketTripInfoUIStateFactory6;
        Object objB10;
        TextUIState.ChaloTextUIState chaloTextUIState9;
        RouteSelectionInputUIState routeSelectionInputUIState6;
        ProductBookingBranding productBookingBranding6;
        Function1 function10;
        ButtonUIState buttonUIState7;
        String str13;
        ToolbarUIState toolbarUIState11;
        RouteSelectionInputUIState routeSelectionInputUIState7;
        SnackbarUIState snackbarUIState5;
        LoadingDialogUIState loadingDialogUIState8;
        List list5;
        MTicketTripInfoUIStateFactory mTicketTripInfoUIStateFactory7;
        if (continuationImpl instanceof MTicketTripInfoUIStateFactory$convertToUIState$1) {
            mTicketTripInfoUIStateFactory$convertToUIState$1 = (MTicketTripInfoUIStateFactory$convertToUIState$1) continuationImpl;
            int i = mTicketTripInfoUIStateFactory$convertToUIState$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                mTicketTripInfoUIStateFactory$convertToUIState$1.label = i - Integer.MIN_VALUE;
            } else {
                mTicketTripInfoUIStateFactory$convertToUIState$1 = new MTicketTripInfoUIStateFactory$convertToUIState$1(this, continuationImpl);
            }
        } else {
            mTicketTripInfoUIStateFactory$convertToUIState$1 = new MTicketTripInfoUIStateFactory$convertToUIState$1(this, continuationImpl);
        }
        Object obj9 = mTicketTripInfoUIStateFactory$convertToUIState$1.result;
        CoroutineSingletons coroutineSingletons6 = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = mTicketTripInfoUIStateFactory$convertToUIState$1.label;
        StringProvider stringProvider4 = this.f5786a;
        switch (i2) {
            case 0:
                ResultKt.b(obj9);
                mTicketTripInfoDataState2 = mTicketTripInfoDataState;
                mTicketTripInfoUIStateFactory$convertToUIState$1.L$0 = mTicketTripInfoDataState2;
                function2 = function1;
                mTicketTripInfoUIStateFactory$convertToUIState$1.L$1 = function2;
                toolbarUIStateFactory = ToolbarUIStateFactory.f10120a;
                mTicketTripInfoUIStateFactory$convertToUIState$1.L$2 = toolbarUIStateFactory;
                mTicketTripInfoUIStateFactory$convertToUIState$1.label = 1;
                objB = stringProvider4.b(StringEnum.TITLE_ACTIVITY_LANDING, new Object[0], mTicketTripInfoUIStateFactory$convertToUIState$1);
                if (objB != coroutineSingletons6) {
                    toolbarUIState = new ToolbarUIState(null, ToolbarUIStateFactory.a(toolbarUIStateFactory, (String) objB, 12), null, null, null, 0.0f, null, null, 253);
                    mTicketTripInfoUIStateFactory$convertToUIState$1.L$0 = mTicketTripInfoDataState2;
                    mTicketTripInfoUIStateFactory$convertToUIState$1.L$1 = function2;
                    mTicketTripInfoUIStateFactory$convertToUIState$1.L$2 = toolbarUIState;
                    buttonUIStateFactory = ButtonUIStateFactory.f9921a;
                    mTicketTripInfoUIStateFactory$convertToUIState$1.L$3 = buttonUIStateFactory;
                    mTicketTripInfoUIStateFactory$convertToUIState$1.label = 2;
                    objB2 = stringProvider4.b(StringEnum.BTN_TXT_MTICKET_NEXT, new Object[0], mTicketTripInfoUIStateFactory$convertToUIState$1);
                    if (objB2 != coroutineSingletons6) {
                        MTicketTripInfoDataState mTicketTripInfoDataState9 = mTicketTripInfoDataState2;
                        toolbarUIState2 = toolbarUIState;
                        obj = objB2;
                        function3 = function2;
                        buttonUIStateFactory2 = buttonUIStateFactory;
                        mTicketTripInfoDataState3 = mTicketTripInfoDataState9;
                        mTicketTripInfoDataState4 = mTicketTripInfoDataState3;
                        buttonUIStateG = ButtonUIStateFactory.g(buttonUIStateFactory2, (String) obj, new wg0(function3, 2), null, null, false, ChaloThemeHelper.a().p, 28);
                        bool = mTicketTripInfoDataState4.h;
                        if (bool != null) {
                            boolean zBooleanValue = bool.booleanValue();
                            mTicketTripInfoUIStateFactory$convertToUIState$1.L$0 = mTicketTripInfoDataState4;
                            mTicketTripInfoUIStateFactory$convertToUIState$1.L$1 = function3;
                            mTicketTripInfoUIStateFactory$convertToUIState$1.L$2 = toolbarUIState2;
                            mTicketTripInfoUIStateFactory$convertToUIState$1.L$3 = buttonUIStateG;
                            mTicketTripInfoUIStateFactory$convertToUIState$1.label = 3;
                            objB3 = b(zBooleanValue, mTicketTripInfoUIStateFactory$convertToUIState$1);
                            if (objB3 != coroutineSingletons6) {
                                mTicketTripInfoDataState6 = mTicketTripInfoDataState4;
                                obj2 = objB3;
                                mTicketTripInfoDataState5 = mTicketTripInfoDataState6;
                                chaloTextUIState = new TextUIState.ChaloTextUIState((String) obj2, UITextStyle.BodyMedium, ChaloColorToken.Black_60.f9766a, 0, UITextAlign.Center, (UIFontWeight) null, (Integer) null, UiEventHandler.Companion.a(new wg0(function3, 3)), (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 7896);
                                function4 = function3;
                                buttonUIState = buttonUIStateG;
                                toolbarUIState3 = toolbarUIState2;
                                if (mTicketTripInfoDataState5.f) {
                                    mTicketTripInfoUIStateFactory$convertToUIState$1.L$0 = mTicketTripInfoDataState5;
                                    mTicketTripInfoUIStateFactory$convertToUIState$1.L$1 = function4;
                                    mTicketTripInfoUIStateFactory$convertToUIState$1.L$2 = toolbarUIState3;
                                    mTicketTripInfoUIStateFactory$convertToUIState$1.L$3 = buttonUIState;
                                    mTicketTripInfoUIStateFactory$convertToUIState$1.L$4 = chaloTextUIState;
                                    dialogUIStateFactory = DialogUIStateFactory.f9989a;
                                    mTicketTripInfoUIStateFactory$convertToUIState$1.L$5 = dialogUIStateFactory;
                                    mTicketTripInfoUIStateFactory$convertToUIState$1.label = 4;
                                    objB4 = stringProvider4.b(StringEnum.LOADING, new Object[0], mTicketTripInfoUIStateFactory$convertToUIState$1);
                                    if (objB4 != coroutineSingletons6) {
                                        obj3 = objB4;
                                        chaloTextUIState3 = chaloTextUIState;
                                        dialogUIStateFactory2 = dialogUIStateFactory;
                                        dialogUIStateFactory2.getClass();
                                        loadingDialogUIStateA = DialogUIStateFactory.a((String) obj3);
                                        mTicketTripInfoDataState7 = mTicketTripInfoDataState5;
                                        function5 = function4;
                                        toolbarUIState4 = toolbarUIState3;
                                        buttonUIState2 = buttonUIState;
                                        chaloTextUIState2 = chaloTextUIState3;
                                        productBookingBranding = mTicketTripInfoDataState7.g;
                                        mTicketTripInfoSnackBarType = mTicketTripInfoDataState7.e;
                                        if (mTicketTripInfoSnackBarType != null) {
                                            mTicketTripInfoUIStateFactory$convertToUIState$1.L$0 = mTicketTripInfoDataState7;
                                            mTicketTripInfoUIStateFactory$convertToUIState$1.L$1 = function5;
                                            mTicketTripInfoUIStateFactory$convertToUIState$1.L$2 = toolbarUIState4;
                                            mTicketTripInfoUIStateFactory$convertToUIState$1.L$3 = buttonUIState2;
                                            mTicketTripInfoUIStateFactory$convertToUIState$1.L$4 = chaloTextUIState2;
                                            mTicketTripInfoUIStateFactory$convertToUIState$1.L$5 = loadingDialogUIStateA;
                                            mTicketTripInfoUIStateFactory$convertToUIState$1.L$6 = productBookingBranding;
                                            mTicketTripInfoUIStateFactory$convertToUIState$1.label = 5;
                                            objD = d(mTicketTripInfoSnackBarType, function5, mTicketTripInfoUIStateFactory$convertToUIState$1);
                                            if (objD != coroutineSingletons6) {
                                                TextUIState.ChaloTextUIState chaloTextUIState10 = chaloTextUIState2;
                                                loadingDialogUIState = loadingDialogUIStateA;
                                                obj4 = objD;
                                                mTicketTripInfoDataState8 = mTicketTripInfoDataState7;
                                                function6 = function5;
                                                toolbarUIState5 = toolbarUIState4;
                                                buttonUIState3 = buttonUIState2;
                                                chaloTextUIState4 = chaloTextUIState10;
                                                snackbarUIState = (SnackbarUIState) obj4;
                                                mTicketTripInfoUIStateFactory$convertToUIState$1.L$0 = mTicketTripInfoDataState8;
                                                mTicketTripInfoUIStateFactory$convertToUIState$1.L$1 = function6;
                                                mTicketTripInfoUIStateFactory$convertToUIState$1.L$2 = toolbarUIState5;
                                                mTicketTripInfoUIStateFactory$convertToUIState$1.L$3 = buttonUIState3;
                                                mTicketTripInfoUIStateFactory$convertToUIState$1.L$4 = chaloTextUIState4;
                                                mTicketTripInfoUIStateFactory$convertToUIState$1.L$5 = loadingDialogUIState;
                                                mTicketTripInfoUIStateFactory$convertToUIState$1.L$6 = productBookingBranding;
                                                mTicketTripInfoUIStateFactory$convertToUIState$1.L$7 = snackbarUIState;
                                                mTicketTripInfoUIStateFactory$convertToUIState$1.L$8 = this;
                                                mTicketTripInfoUIStateFactory$convertToUIState$1.label = 6;
                                                objB5 = stringProvider4.b(StringEnum.HINT_ROUTE_NUMBER, new Object[0], mTicketTripInfoUIStateFactory$convertToUIState$1);
                                                if (objB5 != coroutineSingletons6) {
                                                    ButtonUIState buttonUIState8 = buttonUIState3;
                                                    snackbarUIState2 = snackbarUIState;
                                                    obj5 = objB5;
                                                    buttonUIState4 = buttonUIState8;
                                                    toolbarUIState6 = toolbarUIState5;
                                                    function7 = function6;
                                                    productBookingBranding2 = productBookingBranding;
                                                    loadingDialogUIState2 = loadingDialogUIState;
                                                    chaloTextUIState5 = chaloTextUIState4;
                                                    mTicketTripInfoUIStateFactory = this;
                                                    str = (String) obj5;
                                                    productBookingRouteDetails = mTicketTripInfoDataState8.b;
                                                    str2 = "";
                                                    if (productBookingRouteDetails != null || (str3 = productBookingRouteDetails.b) == null) {
                                                        str3 = str2;
                                                    }
                                                    if (productBookingRouteDetails != null || (list = productBookingRouteDetails.d) == null) {
                                                        list = EmptyList.f17557a;
                                                    }
                                                    if (mTicketTripInfoDataState8.i == MTicketTripInfoMissingFieldError.ROUTE) {
                                                        mTicketTripInfoUIStateFactory$convertToUIState$1.L$0 = mTicketTripInfoDataState8;
                                                        mTicketTripInfoUIStateFactory$convertToUIState$1.L$1 = function7;
                                                        mTicketTripInfoUIStateFactory$convertToUIState$1.L$2 = toolbarUIState6;
                                                        mTicketTripInfoUIStateFactory$convertToUIState$1.L$3 = buttonUIState4;
                                                        mTicketTripInfoUIStateFactory$convertToUIState$1.L$4 = chaloTextUIState5;
                                                        mTicketTripInfoUIStateFactory$convertToUIState$1.L$5 = loadingDialogUIState2;
                                                        mTicketTripInfoUIStateFactory$convertToUIState$1.L$6 = productBookingBranding2;
                                                        mTicketTripInfoUIStateFactory$convertToUIState$1.L$7 = snackbarUIState2;
                                                        mTicketTripInfoUIStateFactory$convertToUIState$1.L$8 = mTicketTripInfoUIStateFactory;
                                                        mTicketTripInfoUIStateFactory$convertToUIState$1.L$9 = str;
                                                        mTicketTripInfoUIStateFactory$convertToUIState$1.L$10 = str3;
                                                        mTicketTripInfoUIStateFactory$convertToUIState$1.L$11 = list;
                                                        mTicketTripInfoUIStateFactory$convertToUIState$1.label = 7;
                                                        objB6 = stringProvider4.b(StringEnum.STATUS_ERROR_ROUTE_NUMBER, new Object[0], mTicketTripInfoUIStateFactory$convertToUIState$1);
                                                        if (objB6 != coroutineSingletons6) {
                                                            coroutineSingletons6 = coroutineSingletons6;
                                                            List list6 = list;
                                                            obj6 = objB6;
                                                            list2 = list6;
                                                            String str14 = str3;
                                                            chaloTextUIState6 = chaloTextUIState5;
                                                            str5 = str14;
                                                            str4 = (String) obj6;
                                                            TextUIState.ChaloTextUIState chaloTextUIState11 = chaloTextUIState6;
                                                            str3 = str5;
                                                            chaloTextUIState5 = chaloTextUIState11;
                                                        }
                                                    } else {
                                                        coroutineSingletons6 = coroutineSingletons6;
                                                        list2 = list;
                                                        str4 = null;
                                                    }
                                                    MTicketTripInfoUIStateFactory mTicketTripInfoUIStateFactory8 = mTicketTripInfoUIStateFactory;
                                                    wg0 wg0Var = new wg0(function7, 4);
                                                    mTicketTripInfoUIStateFactory8.getClass();
                                                    routeSelectionInputUIStateC = c(str, str3, list2, str4, wg0Var);
                                                    mTicketTripInfoUIStateFactory$convertToUIState$1.L$0 = mTicketTripInfoDataState8;
                                                    mTicketTripInfoUIStateFactory$convertToUIState$1.L$1 = function7;
                                                    mTicketTripInfoUIStateFactory$convertToUIState$1.L$2 = toolbarUIState6;
                                                    mTicketTripInfoUIStateFactory$convertToUIState$1.L$3 = buttonUIState4;
                                                    mTicketTripInfoUIStateFactory$convertToUIState$1.L$4 = chaloTextUIState5;
                                                    mTicketTripInfoUIStateFactory$convertToUIState$1.L$5 = loadingDialogUIState2;
                                                    mTicketTripInfoUIStateFactory$convertToUIState$1.L$6 = productBookingBranding2;
                                                    mTicketTripInfoUIStateFactory$convertToUIState$1.L$7 = snackbarUIState2;
                                                    mTicketTripInfoUIStateFactory$convertToUIState$1.L$8 = routeSelectionInputUIStateC;
                                                    mTicketTripInfoUIStateFactory$convertToUIState$1.L$9 = this;
                                                    mTicketTripInfoUIStateFactory$convertToUIState$1.L$10 = null;
                                                    mTicketTripInfoUIStateFactory$convertToUIState$1.L$11 = null;
                                                    mTicketTripInfoUIStateFactory$convertToUIState$1.label = 8;
                                                    objB7 = stringProvider4.b(StringEnum.HINT_START_STOP, new Object[0], mTicketTripInfoUIStateFactory$convertToUIState$1);
                                                    coroutineSingletons = coroutineSingletons6;
                                                    if (objB7 == coroutineSingletons) {
                                                        return coroutineSingletons;
                                                    }
                                                    SnackbarUIState snackbarUIState6 = snackbarUIState2;
                                                    routeSelectionInputUIState = routeSelectionInputUIStateC;
                                                    loadingDialogUIState3 = loadingDialogUIState2;
                                                    productBookingBranding3 = productBookingBranding2;
                                                    snackbarUIState3 = snackbarUIState6;
                                                    ToolbarUIState toolbarUIState12 = toolbarUIState6;
                                                    buttonUIState5 = buttonUIState4;
                                                    function8 = function7;
                                                    toolbarUIState7 = toolbarUIState12;
                                                    mTicketTripInfoUIStateFactory2 = this;
                                                    str6 = (String) objB7;
                                                    productBookingStopDetails = mTicketTripInfoDataState8.c;
                                                    if (productBookingStopDetails != null || (str7 = productBookingStopDetails.b) == null) {
                                                        str7 = str2;
                                                    }
                                                    list3 = EmptyList.f17557a;
                                                    coroutineSingletons2 = coroutineSingletons;
                                                    if (mTicketTripInfoDataState8.i == MTicketTripInfoMissingFieldError.FROM_STOP) {
                                                        mTicketTripInfoUIStateFactory$convertToUIState$1.L$0 = mTicketTripInfoDataState8;
                                                        mTicketTripInfoUIStateFactory$convertToUIState$1.L$1 = function8;
                                                        mTicketTripInfoUIStateFactory$convertToUIState$1.L$2 = toolbarUIState7;
                                                        mTicketTripInfoUIStateFactory$convertToUIState$1.L$3 = buttonUIState5;
                                                        mTicketTripInfoUIStateFactory$convertToUIState$1.L$4 = chaloTextUIState5;
                                                        mTicketTripInfoUIStateFactory$convertToUIState$1.L$5 = loadingDialogUIState3;
                                                        mTicketTripInfoUIStateFactory$convertToUIState$1.L$6 = productBookingBranding3;
                                                        mTicketTripInfoUIStateFactory$convertToUIState$1.L$7 = snackbarUIState3;
                                                        mTicketTripInfoUIStateFactory$convertToUIState$1.L$8 = routeSelectionInputUIState;
                                                        mTicketTripInfoUIStateFactory$convertToUIState$1.L$9 = mTicketTripInfoUIStateFactory2;
                                                        mTicketTripInfoUIStateFactory$convertToUIState$1.L$10 = str6;
                                                        mTicketTripInfoUIStateFactory$convertToUIState$1.L$11 = str7;
                                                        mTicketTripInfoUIStateFactory$convertToUIState$1.L$12 = list3;
                                                        mTicketTripInfoUIStateFactory$convertToUIState$1.label = 9;
                                                        loadingDialogUIState4 = loadingDialogUIState3;
                                                        stringProvider = stringProvider4;
                                                        objB8 = stringProvider.b(StringEnum.STATUS_ERROR_ENTER_STOP, new Object[0], mTicketTripInfoUIStateFactory$convertToUIState$1);
                                                        coroutineSingletons3 = coroutineSingletons2;
                                                        if (objB8 == coroutineSingletons3) {
                                                            return coroutineSingletons3;
                                                        }
                                                        TextUIState.ChaloTextUIState chaloTextUIState12 = chaloTextUIState5;
                                                        str9 = str7;
                                                        obj7 = objB8;
                                                        chaloTextUIState7 = chaloTextUIState12;
                                                        SnackbarUIState snackbarUIState7 = snackbarUIState3;
                                                        routeSelectionInputUIState2 = routeSelectionInputUIState;
                                                        toolbarUIState8 = toolbarUIState7;
                                                        buttonUIState6 = buttonUIState5;
                                                        function9 = function8;
                                                        productBookingBranding4 = productBookingBranding3;
                                                        snackbarUIState4 = snackbarUIState7;
                                                        coroutineSingletons2 = coroutineSingletons3;
                                                        mTicketTripInfoUIStateFactory3 = mTicketTripInfoUIStateFactory2;
                                                        str8 = (String) obj7;
                                                    } else {
                                                        loadingDialogUIState4 = loadingDialogUIState3;
                                                        stringProvider = stringProvider4;
                                                        SnackbarUIState snackbarUIState8 = snackbarUIState3;
                                                        routeSelectionInputUIState2 = routeSelectionInputUIState;
                                                        toolbarUIState8 = toolbarUIState7;
                                                        buttonUIState6 = buttonUIState5;
                                                        function9 = function8;
                                                        productBookingBranding4 = productBookingBranding3;
                                                        snackbarUIState4 = snackbarUIState8;
                                                        chaloTextUIState7 = chaloTextUIState5;
                                                        mTicketTripInfoUIStateFactory3 = mTicketTripInfoUIStateFactory2;
                                                        str8 = null;
                                                        str9 = str7;
                                                    }
                                                    loadingDialogUIState5 = loadingDialogUIState4;
                                                    StringProvider stringProvider5 = stringProvider;
                                                    wg0 wg0Var2 = new wg0(function9, 5);
                                                    mTicketTripInfoUIStateFactory3.getClass();
                                                    routeSelectionInputUIStateC2 = c(str6, str9, list3, str8, wg0Var2);
                                                    mTicketTripInfoUIStateFactory$convertToUIState$1.L$0 = mTicketTripInfoDataState8;
                                                    mTicketTripInfoUIStateFactory$convertToUIState$1.L$1 = function9;
                                                    mTicketTripInfoUIStateFactory$convertToUIState$1.L$2 = toolbarUIState8;
                                                    mTicketTripInfoUIStateFactory$convertToUIState$1.L$3 = buttonUIState6;
                                                    mTicketTripInfoUIStateFactory$convertToUIState$1.L$4 = chaloTextUIState7;
                                                    mTicketTripInfoUIStateFactory$convertToUIState$1.L$5 = loadingDialogUIState5;
                                                    mTicketTripInfoUIStateFactory$convertToUIState$1.L$6 = productBookingBranding4;
                                                    mTicketTripInfoUIStateFactory$convertToUIState$1.L$7 = snackbarUIState4;
                                                    mTicketTripInfoUIStateFactory$convertToUIState$1.L$8 = routeSelectionInputUIState2;
                                                    mTicketTripInfoUIStateFactory$convertToUIState$1.L$9 = routeSelectionInputUIStateC2;
                                                    mTicketTripInfoUIStateFactory$convertToUIState$1.L$10 = this;
                                                    mTicketTripInfoUIStateFactory$convertToUIState$1.L$11 = null;
                                                    mTicketTripInfoUIStateFactory$convertToUIState$1.L$12 = null;
                                                    mTicketTripInfoUIStateFactory$convertToUIState$1.label = 10;
                                                    stringProvider2 = stringProvider5;
                                                    objB9 = stringProvider2.b(StringEnum.HINT_END_STOP, new Object[0], mTicketTripInfoUIStateFactory$convertToUIState$1);
                                                    coroutineSingletons4 = coroutineSingletons2;
                                                    if (objB9 == coroutineSingletons4) {
                                                        return coroutineSingletons4;
                                                    }
                                                    loadingDialogUIState6 = loadingDialogUIState5;
                                                    obj8 = objB9;
                                                    toolbarUIState9 = toolbarUIState8;
                                                    routeSelectionInputUIState3 = routeSelectionInputUIStateC2;
                                                    mTicketTripInfoUIStateFactory4 = this;
                                                    str10 = (String) obj8;
                                                    productBookingStopDetails2 = mTicketTripInfoDataState8.d;
                                                    if (productBookingStopDetails2 != null || (str11 = productBookingStopDetails2.b) == null) {
                                                        str11 = str2;
                                                    }
                                                    coroutineSingletons5 = coroutineSingletons4;
                                                    list4 = EmptyList.f17557a;
                                                    stringProvider3 = stringProvider2;
                                                    if (mTicketTripInfoDataState8.i == MTicketTripInfoMissingFieldError.TO_STOP) {
                                                        mTicketTripInfoUIStateFactory$convertToUIState$1.L$0 = function9;
                                                        mTicketTripInfoUIStateFactory$convertToUIState$1.L$1 = toolbarUIState9;
                                                        mTicketTripInfoUIStateFactory$convertToUIState$1.L$2 = buttonUIState6;
                                                        mTicketTripInfoUIStateFactory$convertToUIState$1.L$3 = chaloTextUIState7;
                                                        mTicketTripInfoUIStateFactory$convertToUIState$1.L$4 = loadingDialogUIState6;
                                                        mTicketTripInfoUIStateFactory$convertToUIState$1.L$5 = productBookingBranding4;
                                                        mTicketTripInfoUIStateFactory$convertToUIState$1.L$6 = snackbarUIState4;
                                                        mTicketTripInfoUIStateFactory$convertToUIState$1.L$7 = routeSelectionInputUIState2;
                                                        mTicketTripInfoUIStateFactory$convertToUIState$1.L$8 = routeSelectionInputUIState3;
                                                        mTicketTripInfoUIStateFactory$convertToUIState$1.L$9 = mTicketTripInfoUIStateFactory4;
                                                        mTicketTripInfoUIStateFactory$convertToUIState$1.L$10 = str10;
                                                        mTicketTripInfoUIStateFactory$convertToUIState$1.L$11 = str11;
                                                        mTicketTripInfoUIStateFactory$convertToUIState$1.L$12 = list4;
                                                        mTicketTripInfoUIStateFactory6 = mTicketTripInfoUIStateFactory4;
                                                        mTicketTripInfoUIStateFactory$convertToUIState$1.label = 11;
                                                        objB10 = stringProvider3.b(StringEnum.STATUS_ERROR_ENTER_STOP, new Object[0], mTicketTripInfoUIStateFactory$convertToUIState$1);
                                                        if (objB10 == coroutineSingletons5) {
                                                            return coroutineSingletons5;
                                                        }
                                                        chaloTextUIState9 = chaloTextUIState7;
                                                        routeSelectionInputUIState6 = routeSelectionInputUIState2;
                                                        productBookingBranding6 = productBookingBranding4;
                                                        function10 = function9;
                                                        buttonUIState7 = buttonUIState6;
                                                        str13 = str10;
                                                        toolbarUIState11 = toolbarUIState9;
                                                        routeSelectionInputUIState7 = routeSelectionInputUIState3;
                                                        snackbarUIState5 = snackbarUIState4;
                                                        obj9 = objB10;
                                                        loadingDialogUIState8 = loadingDialogUIState6;
                                                        list5 = list4;
                                                        mTicketTripInfoUIStateFactory7 = mTicketTripInfoUIStateFactory6;
                                                        String str15 = (String) obj9;
                                                        Function1 function11 = function10;
                                                        str12 = str15;
                                                        mTicketTripInfoUIStateFactory5 = mTicketTripInfoUIStateFactory7;
                                                        list4 = list5;
                                                        toolbarUIState10 = toolbarUIState11;
                                                        function9 = function11;
                                                        LoadingDialogUIState loadingDialogUIState9 = loadingDialogUIState8;
                                                        snackbarUIState4 = snackbarUIState5;
                                                        productBookingBranding5 = productBookingBranding6;
                                                        loadingDialogUIState7 = loadingDialogUIState9;
                                                        str10 = str13;
                                                        routeSelectionInputUIState5 = routeSelectionInputUIState7;
                                                        routeSelectionInputUIState4 = routeSelectionInputUIState6;
                                                        chaloTextUIState8 = chaloTextUIState9;
                                                        buttonUIState6 = buttonUIState7;
                                                    } else {
                                                        MTicketTripInfoUIStateFactory mTicketTripInfoUIStateFactory9 = mTicketTripInfoUIStateFactory4;
                                                        RouteSelectionInputUIState routeSelectionInputUIState8 = routeSelectionInputUIState2;
                                                        loadingDialogUIState7 = loadingDialogUIState6;
                                                        toolbarUIState10 = toolbarUIState9;
                                                        routeSelectionInputUIState4 = routeSelectionInputUIState8;
                                                        chaloTextUIState8 = chaloTextUIState7;
                                                        routeSelectionInputUIState5 = routeSelectionInputUIState3;
                                                        productBookingBranding5 = productBookingBranding4;
                                                        mTicketTripInfoUIStateFactory5 = mTicketTripInfoUIStateFactory9;
                                                        str12 = null;
                                                    }
                                                    wg0 wg0Var3 = new wg0(function9, 6);
                                                    mTicketTripInfoUIStateFactory5.getClass();
                                                    return new MTicketTripInfoUIState(toolbarUIState10, routeSelectionInputUIState4, routeSelectionInputUIState5, c(str10, str11, list4, str12, wg0Var3), buttonUIState6, chaloTextUIState8, productBookingBranding5, loadingDialogUIState7, snackbarUIState4);
                                                }
                                            }
                                        } else {
                                            mTicketTripInfoDataState8 = mTicketTripInfoDataState7;
                                            function6 = function5;
                                            toolbarUIState5 = toolbarUIState4;
                                            buttonUIState3 = buttonUIState2;
                                            chaloTextUIState4 = chaloTextUIState2;
                                            loadingDialogUIState = loadingDialogUIStateA;
                                            snackbarUIState = null;
                                            mTicketTripInfoUIStateFactory$convertToUIState$1.L$0 = mTicketTripInfoDataState8;
                                            mTicketTripInfoUIStateFactory$convertToUIState$1.L$1 = function6;
                                            mTicketTripInfoUIStateFactory$convertToUIState$1.L$2 = toolbarUIState5;
                                            mTicketTripInfoUIStateFactory$convertToUIState$1.L$3 = buttonUIState3;
                                            mTicketTripInfoUIStateFactory$convertToUIState$1.L$4 = chaloTextUIState4;
                                            mTicketTripInfoUIStateFactory$convertToUIState$1.L$5 = loadingDialogUIState;
                                            mTicketTripInfoUIStateFactory$convertToUIState$1.L$6 = productBookingBranding;
                                            mTicketTripInfoUIStateFactory$convertToUIState$1.L$7 = snackbarUIState;
                                            mTicketTripInfoUIStateFactory$convertToUIState$1.L$8 = this;
                                            mTicketTripInfoUIStateFactory$convertToUIState$1.label = 6;
                                            objB5 = stringProvider4.b(StringEnum.HINT_ROUTE_NUMBER, new Object[0], mTicketTripInfoUIStateFactory$convertToUIState$1);
                                            if (objB5 != coroutineSingletons6) {
                                                ButtonUIState buttonUIState9 = buttonUIState3;
                                                snackbarUIState2 = snackbarUIState;
                                                obj5 = objB5;
                                                buttonUIState4 = buttonUIState9;
                                                toolbarUIState6 = toolbarUIState5;
                                                function7 = function6;
                                                productBookingBranding2 = productBookingBranding;
                                                loadingDialogUIState2 = loadingDialogUIState;
                                                chaloTextUIState5 = chaloTextUIState4;
                                                mTicketTripInfoUIStateFactory = this;
                                                str = (String) obj5;
                                                productBookingRouteDetails = mTicketTripInfoDataState8.b;
                                                str2 = "";
                                                if (productBookingRouteDetails != null) {
                                                    str3 = str2;
                                                } else {
                                                    str3 = str2;
                                                }
                                                if (productBookingRouteDetails != null) {
                                                    list = EmptyList.f17557a;
                                                } else {
                                                    list = EmptyList.f17557a;
                                                }
                                                if (mTicketTripInfoDataState8.i == MTicketTripInfoMissingFieldError.ROUTE) {
                                                    mTicketTripInfoUIStateFactory$convertToUIState$1.L$0 = mTicketTripInfoDataState8;
                                                    mTicketTripInfoUIStateFactory$convertToUIState$1.L$1 = function7;
                                                    mTicketTripInfoUIStateFactory$convertToUIState$1.L$2 = toolbarUIState6;
                                                    mTicketTripInfoUIStateFactory$convertToUIState$1.L$3 = buttonUIState4;
                                                    mTicketTripInfoUIStateFactory$convertToUIState$1.L$4 = chaloTextUIState5;
                                                    mTicketTripInfoUIStateFactory$convertToUIState$1.L$5 = loadingDialogUIState2;
                                                    mTicketTripInfoUIStateFactory$convertToUIState$1.L$6 = productBookingBranding2;
                                                    mTicketTripInfoUIStateFactory$convertToUIState$1.L$7 = snackbarUIState2;
                                                    mTicketTripInfoUIStateFactory$convertToUIState$1.L$8 = mTicketTripInfoUIStateFactory;
                                                    mTicketTripInfoUIStateFactory$convertToUIState$1.L$9 = str;
                                                    mTicketTripInfoUIStateFactory$convertToUIState$1.L$10 = str3;
                                                    mTicketTripInfoUIStateFactory$convertToUIState$1.L$11 = list;
                                                    mTicketTripInfoUIStateFactory$convertToUIState$1.label = 7;
                                                    objB6 = stringProvider4.b(StringEnum.STATUS_ERROR_ROUTE_NUMBER, new Object[0], mTicketTripInfoUIStateFactory$convertToUIState$1);
                                                    if (objB6 != coroutineSingletons6) {
                                                        coroutineSingletons6 = coroutineSingletons6;
                                                        List list7 = list;
                                                        obj6 = objB6;
                                                        list2 = list7;
                                                        String str16 = str3;
                                                        chaloTextUIState6 = chaloTextUIState5;
                                                        str5 = str16;
                                                        str4 = (String) obj6;
                                                        TextUIState.ChaloTextUIState chaloTextUIState13 = chaloTextUIState6;
                                                        str3 = str5;
                                                        chaloTextUIState5 = chaloTextUIState13;
                                                    }
                                                } else {
                                                    coroutineSingletons6 = coroutineSingletons6;
                                                    list2 = list;
                                                    str4 = null;
                                                }
                                                MTicketTripInfoUIStateFactory mTicketTripInfoUIStateFactory10 = mTicketTripInfoUIStateFactory;
                                                wg0 wg0Var4 = new wg0(function7, 4);
                                                mTicketTripInfoUIStateFactory10.getClass();
                                                routeSelectionInputUIStateC = c(str, str3, list2, str4, wg0Var4);
                                                mTicketTripInfoUIStateFactory$convertToUIState$1.L$0 = mTicketTripInfoDataState8;
                                                mTicketTripInfoUIStateFactory$convertToUIState$1.L$1 = function7;
                                                mTicketTripInfoUIStateFactory$convertToUIState$1.L$2 = toolbarUIState6;
                                                mTicketTripInfoUIStateFactory$convertToUIState$1.L$3 = buttonUIState4;
                                                mTicketTripInfoUIStateFactory$convertToUIState$1.L$4 = chaloTextUIState5;
                                                mTicketTripInfoUIStateFactory$convertToUIState$1.L$5 = loadingDialogUIState2;
                                                mTicketTripInfoUIStateFactory$convertToUIState$1.L$6 = productBookingBranding2;
                                                mTicketTripInfoUIStateFactory$convertToUIState$1.L$7 = snackbarUIState2;
                                                mTicketTripInfoUIStateFactory$convertToUIState$1.L$8 = routeSelectionInputUIStateC;
                                                mTicketTripInfoUIStateFactory$convertToUIState$1.L$9 = this;
                                                mTicketTripInfoUIStateFactory$convertToUIState$1.L$10 = null;
                                                mTicketTripInfoUIStateFactory$convertToUIState$1.L$11 = null;
                                                mTicketTripInfoUIStateFactory$convertToUIState$1.label = 8;
                                                objB7 = stringProvider4.b(StringEnum.HINT_START_STOP, new Object[0], mTicketTripInfoUIStateFactory$convertToUIState$1);
                                                coroutineSingletons = coroutineSingletons6;
                                                if (objB7 == coroutineSingletons) {
                                                    return coroutineSingletons;
                                                }
                                                SnackbarUIState snackbarUIState9 = snackbarUIState2;
                                                routeSelectionInputUIState = routeSelectionInputUIStateC;
                                                loadingDialogUIState3 = loadingDialogUIState2;
                                                productBookingBranding3 = productBookingBranding2;
                                                snackbarUIState3 = snackbarUIState9;
                                                ToolbarUIState toolbarUIState13 = toolbarUIState6;
                                                buttonUIState5 = buttonUIState4;
                                                function8 = function7;
                                                toolbarUIState7 = toolbarUIState13;
                                                mTicketTripInfoUIStateFactory2 = this;
                                                str6 = (String) objB7;
                                                productBookingStopDetails = mTicketTripInfoDataState8.c;
                                                if (productBookingStopDetails != null) {
                                                    str7 = str2;
                                                } else {
                                                    str7 = str2;
                                                }
                                                list3 = EmptyList.f17557a;
                                                coroutineSingletons2 = coroutineSingletons;
                                                if (mTicketTripInfoDataState8.i == MTicketTripInfoMissingFieldError.FROM_STOP) {
                                                    mTicketTripInfoUIStateFactory$convertToUIState$1.L$0 = mTicketTripInfoDataState8;
                                                    mTicketTripInfoUIStateFactory$convertToUIState$1.L$1 = function8;
                                                    mTicketTripInfoUIStateFactory$convertToUIState$1.L$2 = toolbarUIState7;
                                                    mTicketTripInfoUIStateFactory$convertToUIState$1.L$3 = buttonUIState5;
                                                    mTicketTripInfoUIStateFactory$convertToUIState$1.L$4 = chaloTextUIState5;
                                                    mTicketTripInfoUIStateFactory$convertToUIState$1.L$5 = loadingDialogUIState3;
                                                    mTicketTripInfoUIStateFactory$convertToUIState$1.L$6 = productBookingBranding3;
                                                    mTicketTripInfoUIStateFactory$convertToUIState$1.L$7 = snackbarUIState3;
                                                    mTicketTripInfoUIStateFactory$convertToUIState$1.L$8 = routeSelectionInputUIState;
                                                    mTicketTripInfoUIStateFactory$convertToUIState$1.L$9 = mTicketTripInfoUIStateFactory2;
                                                    mTicketTripInfoUIStateFactory$convertToUIState$1.L$10 = str6;
                                                    mTicketTripInfoUIStateFactory$convertToUIState$1.L$11 = str7;
                                                    mTicketTripInfoUIStateFactory$convertToUIState$1.L$12 = list3;
                                                    mTicketTripInfoUIStateFactory$convertToUIState$1.label = 9;
                                                    loadingDialogUIState4 = loadingDialogUIState3;
                                                    stringProvider = stringProvider4;
                                                    objB8 = stringProvider.b(StringEnum.STATUS_ERROR_ENTER_STOP, new Object[0], mTicketTripInfoUIStateFactory$convertToUIState$1);
                                                    coroutineSingletons3 = coroutineSingletons2;
                                                    if (objB8 == coroutineSingletons3) {
                                                        return coroutineSingletons3;
                                                    }
                                                    TextUIState.ChaloTextUIState chaloTextUIState14 = chaloTextUIState5;
                                                    str9 = str7;
                                                    obj7 = objB8;
                                                    chaloTextUIState7 = chaloTextUIState14;
                                                    SnackbarUIState snackbarUIState10 = snackbarUIState3;
                                                    routeSelectionInputUIState2 = routeSelectionInputUIState;
                                                    toolbarUIState8 = toolbarUIState7;
                                                    buttonUIState6 = buttonUIState5;
                                                    function9 = function8;
                                                    productBookingBranding4 = productBookingBranding3;
                                                    snackbarUIState4 = snackbarUIState10;
                                                    coroutineSingletons2 = coroutineSingletons3;
                                                    mTicketTripInfoUIStateFactory3 = mTicketTripInfoUIStateFactory2;
                                                    str8 = (String) obj7;
                                                } else {
                                                    loadingDialogUIState4 = loadingDialogUIState3;
                                                    stringProvider = stringProvider4;
                                                    SnackbarUIState snackbarUIState11 = snackbarUIState3;
                                                    routeSelectionInputUIState2 = routeSelectionInputUIState;
                                                    toolbarUIState8 = toolbarUIState7;
                                                    buttonUIState6 = buttonUIState5;
                                                    function9 = function8;
                                                    productBookingBranding4 = productBookingBranding3;
                                                    snackbarUIState4 = snackbarUIState11;
                                                    chaloTextUIState7 = chaloTextUIState5;
                                                    mTicketTripInfoUIStateFactory3 = mTicketTripInfoUIStateFactory2;
                                                    str8 = null;
                                                    str9 = str7;
                                                }
                                                loadingDialogUIState5 = loadingDialogUIState4;
                                                StringProvider stringProvider6 = stringProvider;
                                                wg0 wg0Var5 = new wg0(function9, 5);
                                                mTicketTripInfoUIStateFactory3.getClass();
                                                routeSelectionInputUIStateC2 = c(str6, str9, list3, str8, wg0Var5);
                                                mTicketTripInfoUIStateFactory$convertToUIState$1.L$0 = mTicketTripInfoDataState8;
                                                mTicketTripInfoUIStateFactory$convertToUIState$1.L$1 = function9;
                                                mTicketTripInfoUIStateFactory$convertToUIState$1.L$2 = toolbarUIState8;
                                                mTicketTripInfoUIStateFactory$convertToUIState$1.L$3 = buttonUIState6;
                                                mTicketTripInfoUIStateFactory$convertToUIState$1.L$4 = chaloTextUIState7;
                                                mTicketTripInfoUIStateFactory$convertToUIState$1.L$5 = loadingDialogUIState5;
                                                mTicketTripInfoUIStateFactory$convertToUIState$1.L$6 = productBookingBranding4;
                                                mTicketTripInfoUIStateFactory$convertToUIState$1.L$7 = snackbarUIState4;
                                                mTicketTripInfoUIStateFactory$convertToUIState$1.L$8 = routeSelectionInputUIState2;
                                                mTicketTripInfoUIStateFactory$convertToUIState$1.L$9 = routeSelectionInputUIStateC2;
                                                mTicketTripInfoUIStateFactory$convertToUIState$1.L$10 = this;
                                                mTicketTripInfoUIStateFactory$convertToUIState$1.L$11 = null;
                                                mTicketTripInfoUIStateFactory$convertToUIState$1.L$12 = null;
                                                mTicketTripInfoUIStateFactory$convertToUIState$1.label = 10;
                                                stringProvider2 = stringProvider6;
                                                objB9 = stringProvider2.b(StringEnum.HINT_END_STOP, new Object[0], mTicketTripInfoUIStateFactory$convertToUIState$1);
                                                coroutineSingletons4 = coroutineSingletons2;
                                                if (objB9 == coroutineSingletons4) {
                                                    return coroutineSingletons4;
                                                }
                                                loadingDialogUIState6 = loadingDialogUIState5;
                                                obj8 = objB9;
                                                toolbarUIState9 = toolbarUIState8;
                                                routeSelectionInputUIState3 = routeSelectionInputUIStateC2;
                                                mTicketTripInfoUIStateFactory4 = this;
                                                str10 = (String) obj8;
                                                productBookingStopDetails2 = mTicketTripInfoDataState8.d;
                                                if (productBookingStopDetails2 != null) {
                                                    str11 = str2;
                                                } else {
                                                    str11 = str2;
                                                }
                                                coroutineSingletons5 = coroutineSingletons4;
                                                list4 = EmptyList.f17557a;
                                                stringProvider3 = stringProvider2;
                                                if (mTicketTripInfoDataState8.i == MTicketTripInfoMissingFieldError.TO_STOP) {
                                                    mTicketTripInfoUIStateFactory$convertToUIState$1.L$0 = function9;
                                                    mTicketTripInfoUIStateFactory$convertToUIState$1.L$1 = toolbarUIState9;
                                                    mTicketTripInfoUIStateFactory$convertToUIState$1.L$2 = buttonUIState6;
                                                    mTicketTripInfoUIStateFactory$convertToUIState$1.L$3 = chaloTextUIState7;
                                                    mTicketTripInfoUIStateFactory$convertToUIState$1.L$4 = loadingDialogUIState6;
                                                    mTicketTripInfoUIStateFactory$convertToUIState$1.L$5 = productBookingBranding4;
                                                    mTicketTripInfoUIStateFactory$convertToUIState$1.L$6 = snackbarUIState4;
                                                    mTicketTripInfoUIStateFactory$convertToUIState$1.L$7 = routeSelectionInputUIState2;
                                                    mTicketTripInfoUIStateFactory$convertToUIState$1.L$8 = routeSelectionInputUIState3;
                                                    mTicketTripInfoUIStateFactory$convertToUIState$1.L$9 = mTicketTripInfoUIStateFactory4;
                                                    mTicketTripInfoUIStateFactory$convertToUIState$1.L$10 = str10;
                                                    mTicketTripInfoUIStateFactory$convertToUIState$1.L$11 = str11;
                                                    mTicketTripInfoUIStateFactory$convertToUIState$1.L$12 = list4;
                                                    mTicketTripInfoUIStateFactory6 = mTicketTripInfoUIStateFactory4;
                                                    mTicketTripInfoUIStateFactory$convertToUIState$1.label = 11;
                                                    objB10 = stringProvider3.b(StringEnum.STATUS_ERROR_ENTER_STOP, new Object[0], mTicketTripInfoUIStateFactory$convertToUIState$1);
                                                    if (objB10 == coroutineSingletons5) {
                                                        return coroutineSingletons5;
                                                    }
                                                    chaloTextUIState9 = chaloTextUIState7;
                                                    routeSelectionInputUIState6 = routeSelectionInputUIState2;
                                                    productBookingBranding6 = productBookingBranding4;
                                                    function10 = function9;
                                                    buttonUIState7 = buttonUIState6;
                                                    str13 = str10;
                                                    toolbarUIState11 = toolbarUIState9;
                                                    routeSelectionInputUIState7 = routeSelectionInputUIState3;
                                                    snackbarUIState5 = snackbarUIState4;
                                                    obj9 = objB10;
                                                    loadingDialogUIState8 = loadingDialogUIState6;
                                                    list5 = list4;
                                                    mTicketTripInfoUIStateFactory7 = mTicketTripInfoUIStateFactory6;
                                                    String str17 = (String) obj9;
                                                    Function1 function12 = function10;
                                                    str12 = str17;
                                                    mTicketTripInfoUIStateFactory5 = mTicketTripInfoUIStateFactory7;
                                                    list4 = list5;
                                                    toolbarUIState10 = toolbarUIState11;
                                                    function9 = function12;
                                                    LoadingDialogUIState loadingDialogUIState10 = loadingDialogUIState8;
                                                    snackbarUIState4 = snackbarUIState5;
                                                    productBookingBranding5 = productBookingBranding6;
                                                    loadingDialogUIState7 = loadingDialogUIState10;
                                                    str10 = str13;
                                                    routeSelectionInputUIState5 = routeSelectionInputUIState7;
                                                    routeSelectionInputUIState4 = routeSelectionInputUIState6;
                                                    chaloTextUIState8 = chaloTextUIState9;
                                                    buttonUIState6 = buttonUIState7;
                                                } else {
                                                    MTicketTripInfoUIStateFactory mTicketTripInfoUIStateFactory11 = mTicketTripInfoUIStateFactory4;
                                                    RouteSelectionInputUIState routeSelectionInputUIState9 = routeSelectionInputUIState2;
                                                    loadingDialogUIState7 = loadingDialogUIState6;
                                                    toolbarUIState10 = toolbarUIState9;
                                                    routeSelectionInputUIState4 = routeSelectionInputUIState9;
                                                    chaloTextUIState8 = chaloTextUIState7;
                                                    routeSelectionInputUIState5 = routeSelectionInputUIState3;
                                                    productBookingBranding5 = productBookingBranding4;
                                                    mTicketTripInfoUIStateFactory5 = mTicketTripInfoUIStateFactory11;
                                                    str12 = null;
                                                }
                                                wg0 wg0Var6 = new wg0(function9, 6);
                                                mTicketTripInfoUIStateFactory5.getClass();
                                                return new MTicketTripInfoUIState(toolbarUIState10, routeSelectionInputUIState4, routeSelectionInputUIState5, c(str10, str11, list4, str12, wg0Var6), buttonUIState6, chaloTextUIState8, productBookingBranding5, loadingDialogUIState7, snackbarUIState4);
                                            }
                                        }
                                    }
                                } else {
                                    mTicketTripInfoDataState7 = mTicketTripInfoDataState5;
                                    function5 = function4;
                                    toolbarUIState4 = toolbarUIState3;
                                    buttonUIState2 = buttonUIState;
                                    chaloTextUIState2 = chaloTextUIState;
                                    loadingDialogUIStateA = null;
                                    productBookingBranding = mTicketTripInfoDataState7.g;
                                    mTicketTripInfoSnackBarType = mTicketTripInfoDataState7.e;
                                    if (mTicketTripInfoSnackBarType != null) {
                                        mTicketTripInfoUIStateFactory$convertToUIState$1.L$0 = mTicketTripInfoDataState7;
                                        mTicketTripInfoUIStateFactory$convertToUIState$1.L$1 = function5;
                                        mTicketTripInfoUIStateFactory$convertToUIState$1.L$2 = toolbarUIState4;
                                        mTicketTripInfoUIStateFactory$convertToUIState$1.L$3 = buttonUIState2;
                                        mTicketTripInfoUIStateFactory$convertToUIState$1.L$4 = chaloTextUIState2;
                                        mTicketTripInfoUIStateFactory$convertToUIState$1.L$5 = loadingDialogUIStateA;
                                        mTicketTripInfoUIStateFactory$convertToUIState$1.L$6 = productBookingBranding;
                                        mTicketTripInfoUIStateFactory$convertToUIState$1.label = 5;
                                        objD = d(mTicketTripInfoSnackBarType, function5, mTicketTripInfoUIStateFactory$convertToUIState$1);
                                        if (objD != coroutineSingletons6) {
                                            TextUIState.ChaloTextUIState chaloTextUIState15 = chaloTextUIState2;
                                            loadingDialogUIState = loadingDialogUIStateA;
                                            obj4 = objD;
                                            mTicketTripInfoDataState8 = mTicketTripInfoDataState7;
                                            function6 = function5;
                                            toolbarUIState5 = toolbarUIState4;
                                            buttonUIState3 = buttonUIState2;
                                            chaloTextUIState4 = chaloTextUIState15;
                                            snackbarUIState = (SnackbarUIState) obj4;
                                            mTicketTripInfoUIStateFactory$convertToUIState$1.L$0 = mTicketTripInfoDataState8;
                                            mTicketTripInfoUIStateFactory$convertToUIState$1.L$1 = function6;
                                            mTicketTripInfoUIStateFactory$convertToUIState$1.L$2 = toolbarUIState5;
                                            mTicketTripInfoUIStateFactory$convertToUIState$1.L$3 = buttonUIState3;
                                            mTicketTripInfoUIStateFactory$convertToUIState$1.L$4 = chaloTextUIState4;
                                            mTicketTripInfoUIStateFactory$convertToUIState$1.L$5 = loadingDialogUIState;
                                            mTicketTripInfoUIStateFactory$convertToUIState$1.L$6 = productBookingBranding;
                                            mTicketTripInfoUIStateFactory$convertToUIState$1.L$7 = snackbarUIState;
                                            mTicketTripInfoUIStateFactory$convertToUIState$1.L$8 = this;
                                            mTicketTripInfoUIStateFactory$convertToUIState$1.label = 6;
                                            objB5 = stringProvider4.b(StringEnum.HINT_ROUTE_NUMBER, new Object[0], mTicketTripInfoUIStateFactory$convertToUIState$1);
                                            if (objB5 != coroutineSingletons6) {
                                                ButtonUIState buttonUIState10 = buttonUIState3;
                                                snackbarUIState2 = snackbarUIState;
                                                obj5 = objB5;
                                                buttonUIState4 = buttonUIState10;
                                                toolbarUIState6 = toolbarUIState5;
                                                function7 = function6;
                                                productBookingBranding2 = productBookingBranding;
                                                loadingDialogUIState2 = loadingDialogUIState;
                                                chaloTextUIState5 = chaloTextUIState4;
                                                mTicketTripInfoUIStateFactory = this;
                                                str = (String) obj5;
                                                productBookingRouteDetails = mTicketTripInfoDataState8.b;
                                                str2 = "";
                                                if (productBookingRouteDetails != null) {
                                                    str3 = str2;
                                                } else {
                                                    str3 = str2;
                                                }
                                                if (productBookingRouteDetails != null) {
                                                    list = EmptyList.f17557a;
                                                } else {
                                                    list = EmptyList.f17557a;
                                                }
                                                if (mTicketTripInfoDataState8.i == MTicketTripInfoMissingFieldError.ROUTE) {
                                                    mTicketTripInfoUIStateFactory$convertToUIState$1.L$0 = mTicketTripInfoDataState8;
                                                    mTicketTripInfoUIStateFactory$convertToUIState$1.L$1 = function7;
                                                    mTicketTripInfoUIStateFactory$convertToUIState$1.L$2 = toolbarUIState6;
                                                    mTicketTripInfoUIStateFactory$convertToUIState$1.L$3 = buttonUIState4;
                                                    mTicketTripInfoUIStateFactory$convertToUIState$1.L$4 = chaloTextUIState5;
                                                    mTicketTripInfoUIStateFactory$convertToUIState$1.L$5 = loadingDialogUIState2;
                                                    mTicketTripInfoUIStateFactory$convertToUIState$1.L$6 = productBookingBranding2;
                                                    mTicketTripInfoUIStateFactory$convertToUIState$1.L$7 = snackbarUIState2;
                                                    mTicketTripInfoUIStateFactory$convertToUIState$1.L$8 = mTicketTripInfoUIStateFactory;
                                                    mTicketTripInfoUIStateFactory$convertToUIState$1.L$9 = str;
                                                    mTicketTripInfoUIStateFactory$convertToUIState$1.L$10 = str3;
                                                    mTicketTripInfoUIStateFactory$convertToUIState$1.L$11 = list;
                                                    mTicketTripInfoUIStateFactory$convertToUIState$1.label = 7;
                                                    objB6 = stringProvider4.b(StringEnum.STATUS_ERROR_ROUTE_NUMBER, new Object[0], mTicketTripInfoUIStateFactory$convertToUIState$1);
                                                    if (objB6 != coroutineSingletons6) {
                                                        coroutineSingletons6 = coroutineSingletons6;
                                                        List list8 = list;
                                                        obj6 = objB6;
                                                        list2 = list8;
                                                        String str18 = str3;
                                                        chaloTextUIState6 = chaloTextUIState5;
                                                        str5 = str18;
                                                        str4 = (String) obj6;
                                                        TextUIState.ChaloTextUIState chaloTextUIState16 = chaloTextUIState6;
                                                        str3 = str5;
                                                        chaloTextUIState5 = chaloTextUIState16;
                                                    }
                                                } else {
                                                    coroutineSingletons6 = coroutineSingletons6;
                                                    list2 = list;
                                                    str4 = null;
                                                }
                                                MTicketTripInfoUIStateFactory mTicketTripInfoUIStateFactory12 = mTicketTripInfoUIStateFactory;
                                                wg0 wg0Var7 = new wg0(function7, 4);
                                                mTicketTripInfoUIStateFactory12.getClass();
                                                routeSelectionInputUIStateC = c(str, str3, list2, str4, wg0Var7);
                                                mTicketTripInfoUIStateFactory$convertToUIState$1.L$0 = mTicketTripInfoDataState8;
                                                mTicketTripInfoUIStateFactory$convertToUIState$1.L$1 = function7;
                                                mTicketTripInfoUIStateFactory$convertToUIState$1.L$2 = toolbarUIState6;
                                                mTicketTripInfoUIStateFactory$convertToUIState$1.L$3 = buttonUIState4;
                                                mTicketTripInfoUIStateFactory$convertToUIState$1.L$4 = chaloTextUIState5;
                                                mTicketTripInfoUIStateFactory$convertToUIState$1.L$5 = loadingDialogUIState2;
                                                mTicketTripInfoUIStateFactory$convertToUIState$1.L$6 = productBookingBranding2;
                                                mTicketTripInfoUIStateFactory$convertToUIState$1.L$7 = snackbarUIState2;
                                                mTicketTripInfoUIStateFactory$convertToUIState$1.L$8 = routeSelectionInputUIStateC;
                                                mTicketTripInfoUIStateFactory$convertToUIState$1.L$9 = this;
                                                mTicketTripInfoUIStateFactory$convertToUIState$1.L$10 = null;
                                                mTicketTripInfoUIStateFactory$convertToUIState$1.L$11 = null;
                                                mTicketTripInfoUIStateFactory$convertToUIState$1.label = 8;
                                                objB7 = stringProvider4.b(StringEnum.HINT_START_STOP, new Object[0], mTicketTripInfoUIStateFactory$convertToUIState$1);
                                                coroutineSingletons = coroutineSingletons6;
                                                if (objB7 == coroutineSingletons) {
                                                    return coroutineSingletons;
                                                }
                                                SnackbarUIState snackbarUIState12 = snackbarUIState2;
                                                routeSelectionInputUIState = routeSelectionInputUIStateC;
                                                loadingDialogUIState3 = loadingDialogUIState2;
                                                productBookingBranding3 = productBookingBranding2;
                                                snackbarUIState3 = snackbarUIState12;
                                                ToolbarUIState toolbarUIState14 = toolbarUIState6;
                                                buttonUIState5 = buttonUIState4;
                                                function8 = function7;
                                                toolbarUIState7 = toolbarUIState14;
                                                mTicketTripInfoUIStateFactory2 = this;
                                                str6 = (String) objB7;
                                                productBookingStopDetails = mTicketTripInfoDataState8.c;
                                                if (productBookingStopDetails != null) {
                                                    str7 = str2;
                                                } else {
                                                    str7 = str2;
                                                }
                                                list3 = EmptyList.f17557a;
                                                coroutineSingletons2 = coroutineSingletons;
                                                if (mTicketTripInfoDataState8.i == MTicketTripInfoMissingFieldError.FROM_STOP) {
                                                    mTicketTripInfoUIStateFactory$convertToUIState$1.L$0 = mTicketTripInfoDataState8;
                                                    mTicketTripInfoUIStateFactory$convertToUIState$1.L$1 = function8;
                                                    mTicketTripInfoUIStateFactory$convertToUIState$1.L$2 = toolbarUIState7;
                                                    mTicketTripInfoUIStateFactory$convertToUIState$1.L$3 = buttonUIState5;
                                                    mTicketTripInfoUIStateFactory$convertToUIState$1.L$4 = chaloTextUIState5;
                                                    mTicketTripInfoUIStateFactory$convertToUIState$1.L$5 = loadingDialogUIState3;
                                                    mTicketTripInfoUIStateFactory$convertToUIState$1.L$6 = productBookingBranding3;
                                                    mTicketTripInfoUIStateFactory$convertToUIState$1.L$7 = snackbarUIState3;
                                                    mTicketTripInfoUIStateFactory$convertToUIState$1.L$8 = routeSelectionInputUIState;
                                                    mTicketTripInfoUIStateFactory$convertToUIState$1.L$9 = mTicketTripInfoUIStateFactory2;
                                                    mTicketTripInfoUIStateFactory$convertToUIState$1.L$10 = str6;
                                                    mTicketTripInfoUIStateFactory$convertToUIState$1.L$11 = str7;
                                                    mTicketTripInfoUIStateFactory$convertToUIState$1.L$12 = list3;
                                                    mTicketTripInfoUIStateFactory$convertToUIState$1.label = 9;
                                                    loadingDialogUIState4 = loadingDialogUIState3;
                                                    stringProvider = stringProvider4;
                                                    objB8 = stringProvider.b(StringEnum.STATUS_ERROR_ENTER_STOP, new Object[0], mTicketTripInfoUIStateFactory$convertToUIState$1);
                                                    coroutineSingletons3 = coroutineSingletons2;
                                                    if (objB8 == coroutineSingletons3) {
                                                        return coroutineSingletons3;
                                                    }
                                                    TextUIState.ChaloTextUIState chaloTextUIState17 = chaloTextUIState5;
                                                    str9 = str7;
                                                    obj7 = objB8;
                                                    chaloTextUIState7 = chaloTextUIState17;
                                                    SnackbarUIState snackbarUIState13 = snackbarUIState3;
                                                    routeSelectionInputUIState2 = routeSelectionInputUIState;
                                                    toolbarUIState8 = toolbarUIState7;
                                                    buttonUIState6 = buttonUIState5;
                                                    function9 = function8;
                                                    productBookingBranding4 = productBookingBranding3;
                                                    snackbarUIState4 = snackbarUIState13;
                                                    coroutineSingletons2 = coroutineSingletons3;
                                                    mTicketTripInfoUIStateFactory3 = mTicketTripInfoUIStateFactory2;
                                                    str8 = (String) obj7;
                                                } else {
                                                    loadingDialogUIState4 = loadingDialogUIState3;
                                                    stringProvider = stringProvider4;
                                                    SnackbarUIState snackbarUIState14 = snackbarUIState3;
                                                    routeSelectionInputUIState2 = routeSelectionInputUIState;
                                                    toolbarUIState8 = toolbarUIState7;
                                                    buttonUIState6 = buttonUIState5;
                                                    function9 = function8;
                                                    productBookingBranding4 = productBookingBranding3;
                                                    snackbarUIState4 = snackbarUIState14;
                                                    chaloTextUIState7 = chaloTextUIState5;
                                                    mTicketTripInfoUIStateFactory3 = mTicketTripInfoUIStateFactory2;
                                                    str8 = null;
                                                    str9 = str7;
                                                }
                                                loadingDialogUIState5 = loadingDialogUIState4;
                                                StringProvider stringProvider7 = stringProvider;
                                                wg0 wg0Var8 = new wg0(function9, 5);
                                                mTicketTripInfoUIStateFactory3.getClass();
                                                routeSelectionInputUIStateC2 = c(str6, str9, list3, str8, wg0Var8);
                                                mTicketTripInfoUIStateFactory$convertToUIState$1.L$0 = mTicketTripInfoDataState8;
                                                mTicketTripInfoUIStateFactory$convertToUIState$1.L$1 = function9;
                                                mTicketTripInfoUIStateFactory$convertToUIState$1.L$2 = toolbarUIState8;
                                                mTicketTripInfoUIStateFactory$convertToUIState$1.L$3 = buttonUIState6;
                                                mTicketTripInfoUIStateFactory$convertToUIState$1.L$4 = chaloTextUIState7;
                                                mTicketTripInfoUIStateFactory$convertToUIState$1.L$5 = loadingDialogUIState5;
                                                mTicketTripInfoUIStateFactory$convertToUIState$1.L$6 = productBookingBranding4;
                                                mTicketTripInfoUIStateFactory$convertToUIState$1.L$7 = snackbarUIState4;
                                                mTicketTripInfoUIStateFactory$convertToUIState$1.L$8 = routeSelectionInputUIState2;
                                                mTicketTripInfoUIStateFactory$convertToUIState$1.L$9 = routeSelectionInputUIStateC2;
                                                mTicketTripInfoUIStateFactory$convertToUIState$1.L$10 = this;
                                                mTicketTripInfoUIStateFactory$convertToUIState$1.L$11 = null;
                                                mTicketTripInfoUIStateFactory$convertToUIState$1.L$12 = null;
                                                mTicketTripInfoUIStateFactory$convertToUIState$1.label = 10;
                                                stringProvider2 = stringProvider7;
                                                objB9 = stringProvider2.b(StringEnum.HINT_END_STOP, new Object[0], mTicketTripInfoUIStateFactory$convertToUIState$1);
                                                coroutineSingletons4 = coroutineSingletons2;
                                                if (objB9 == coroutineSingletons4) {
                                                    return coroutineSingletons4;
                                                }
                                                loadingDialogUIState6 = loadingDialogUIState5;
                                                obj8 = objB9;
                                                toolbarUIState9 = toolbarUIState8;
                                                routeSelectionInputUIState3 = routeSelectionInputUIStateC2;
                                                mTicketTripInfoUIStateFactory4 = this;
                                                str10 = (String) obj8;
                                                productBookingStopDetails2 = mTicketTripInfoDataState8.d;
                                                if (productBookingStopDetails2 != null) {
                                                    str11 = str2;
                                                } else {
                                                    str11 = str2;
                                                }
                                                coroutineSingletons5 = coroutineSingletons4;
                                                list4 = EmptyList.f17557a;
                                                stringProvider3 = stringProvider2;
                                                if (mTicketTripInfoDataState8.i == MTicketTripInfoMissingFieldError.TO_STOP) {
                                                    mTicketTripInfoUIStateFactory$convertToUIState$1.L$0 = function9;
                                                    mTicketTripInfoUIStateFactory$convertToUIState$1.L$1 = toolbarUIState9;
                                                    mTicketTripInfoUIStateFactory$convertToUIState$1.L$2 = buttonUIState6;
                                                    mTicketTripInfoUIStateFactory$convertToUIState$1.L$3 = chaloTextUIState7;
                                                    mTicketTripInfoUIStateFactory$convertToUIState$1.L$4 = loadingDialogUIState6;
                                                    mTicketTripInfoUIStateFactory$convertToUIState$1.L$5 = productBookingBranding4;
                                                    mTicketTripInfoUIStateFactory$convertToUIState$1.L$6 = snackbarUIState4;
                                                    mTicketTripInfoUIStateFactory$convertToUIState$1.L$7 = routeSelectionInputUIState2;
                                                    mTicketTripInfoUIStateFactory$convertToUIState$1.L$8 = routeSelectionInputUIState3;
                                                    mTicketTripInfoUIStateFactory$convertToUIState$1.L$9 = mTicketTripInfoUIStateFactory4;
                                                    mTicketTripInfoUIStateFactory$convertToUIState$1.L$10 = str10;
                                                    mTicketTripInfoUIStateFactory$convertToUIState$1.L$11 = str11;
                                                    mTicketTripInfoUIStateFactory$convertToUIState$1.L$12 = list4;
                                                    mTicketTripInfoUIStateFactory6 = mTicketTripInfoUIStateFactory4;
                                                    mTicketTripInfoUIStateFactory$convertToUIState$1.label = 11;
                                                    objB10 = stringProvider3.b(StringEnum.STATUS_ERROR_ENTER_STOP, new Object[0], mTicketTripInfoUIStateFactory$convertToUIState$1);
                                                    if (objB10 == coroutineSingletons5) {
                                                        return coroutineSingletons5;
                                                    }
                                                    chaloTextUIState9 = chaloTextUIState7;
                                                    routeSelectionInputUIState6 = routeSelectionInputUIState2;
                                                    productBookingBranding6 = productBookingBranding4;
                                                    function10 = function9;
                                                    buttonUIState7 = buttonUIState6;
                                                    str13 = str10;
                                                    toolbarUIState11 = toolbarUIState9;
                                                    routeSelectionInputUIState7 = routeSelectionInputUIState3;
                                                    snackbarUIState5 = snackbarUIState4;
                                                    obj9 = objB10;
                                                    loadingDialogUIState8 = loadingDialogUIState6;
                                                    list5 = list4;
                                                    mTicketTripInfoUIStateFactory7 = mTicketTripInfoUIStateFactory6;
                                                    String str19 = (String) obj9;
                                                    Function1 function13 = function10;
                                                    str12 = str19;
                                                    mTicketTripInfoUIStateFactory5 = mTicketTripInfoUIStateFactory7;
                                                    list4 = list5;
                                                    toolbarUIState10 = toolbarUIState11;
                                                    function9 = function13;
                                                    LoadingDialogUIState loadingDialogUIState11 = loadingDialogUIState8;
                                                    snackbarUIState4 = snackbarUIState5;
                                                    productBookingBranding5 = productBookingBranding6;
                                                    loadingDialogUIState7 = loadingDialogUIState11;
                                                    str10 = str13;
                                                    routeSelectionInputUIState5 = routeSelectionInputUIState7;
                                                    routeSelectionInputUIState4 = routeSelectionInputUIState6;
                                                    chaloTextUIState8 = chaloTextUIState9;
                                                    buttonUIState6 = buttonUIState7;
                                                } else {
                                                    MTicketTripInfoUIStateFactory mTicketTripInfoUIStateFactory13 = mTicketTripInfoUIStateFactory4;
                                                    RouteSelectionInputUIState routeSelectionInputUIState10 = routeSelectionInputUIState2;
                                                    loadingDialogUIState7 = loadingDialogUIState6;
                                                    toolbarUIState10 = toolbarUIState9;
                                                    routeSelectionInputUIState4 = routeSelectionInputUIState10;
                                                    chaloTextUIState8 = chaloTextUIState7;
                                                    routeSelectionInputUIState5 = routeSelectionInputUIState3;
                                                    productBookingBranding5 = productBookingBranding4;
                                                    mTicketTripInfoUIStateFactory5 = mTicketTripInfoUIStateFactory13;
                                                    str12 = null;
                                                }
                                                wg0 wg0Var9 = new wg0(function9, 6);
                                                mTicketTripInfoUIStateFactory5.getClass();
                                                return new MTicketTripInfoUIState(toolbarUIState10, routeSelectionInputUIState4, routeSelectionInputUIState5, c(str10, str11, list4, str12, wg0Var9), buttonUIState6, chaloTextUIState8, productBookingBranding5, loadingDialogUIState7, snackbarUIState4);
                                            }
                                        }
                                    } else {
                                        mTicketTripInfoDataState8 = mTicketTripInfoDataState7;
                                        function6 = function5;
                                        toolbarUIState5 = toolbarUIState4;
                                        buttonUIState3 = buttonUIState2;
                                        chaloTextUIState4 = chaloTextUIState2;
                                        loadingDialogUIState = loadingDialogUIStateA;
                                        snackbarUIState = null;
                                        mTicketTripInfoUIStateFactory$convertToUIState$1.L$0 = mTicketTripInfoDataState8;
                                        mTicketTripInfoUIStateFactory$convertToUIState$1.L$1 = function6;
                                        mTicketTripInfoUIStateFactory$convertToUIState$1.L$2 = toolbarUIState5;
                                        mTicketTripInfoUIStateFactory$convertToUIState$1.L$3 = buttonUIState3;
                                        mTicketTripInfoUIStateFactory$convertToUIState$1.L$4 = chaloTextUIState4;
                                        mTicketTripInfoUIStateFactory$convertToUIState$1.L$5 = loadingDialogUIState;
                                        mTicketTripInfoUIStateFactory$convertToUIState$1.L$6 = productBookingBranding;
                                        mTicketTripInfoUIStateFactory$convertToUIState$1.L$7 = snackbarUIState;
                                        mTicketTripInfoUIStateFactory$convertToUIState$1.L$8 = this;
                                        mTicketTripInfoUIStateFactory$convertToUIState$1.label = 6;
                                        objB5 = stringProvider4.b(StringEnum.HINT_ROUTE_NUMBER, new Object[0], mTicketTripInfoUIStateFactory$convertToUIState$1);
                                        if (objB5 != coroutineSingletons6) {
                                            ButtonUIState buttonUIState11 = buttonUIState3;
                                            snackbarUIState2 = snackbarUIState;
                                            obj5 = objB5;
                                            buttonUIState4 = buttonUIState11;
                                            toolbarUIState6 = toolbarUIState5;
                                            function7 = function6;
                                            productBookingBranding2 = productBookingBranding;
                                            loadingDialogUIState2 = loadingDialogUIState;
                                            chaloTextUIState5 = chaloTextUIState4;
                                            mTicketTripInfoUIStateFactory = this;
                                            str = (String) obj5;
                                            productBookingRouteDetails = mTicketTripInfoDataState8.b;
                                            str2 = "";
                                            if (productBookingRouteDetails != null) {
                                                str3 = str2;
                                            } else {
                                                str3 = str2;
                                            }
                                            if (productBookingRouteDetails != null) {
                                                list = EmptyList.f17557a;
                                            } else {
                                                list = EmptyList.f17557a;
                                            }
                                            if (mTicketTripInfoDataState8.i == MTicketTripInfoMissingFieldError.ROUTE) {
                                                mTicketTripInfoUIStateFactory$convertToUIState$1.L$0 = mTicketTripInfoDataState8;
                                                mTicketTripInfoUIStateFactory$convertToUIState$1.L$1 = function7;
                                                mTicketTripInfoUIStateFactory$convertToUIState$1.L$2 = toolbarUIState6;
                                                mTicketTripInfoUIStateFactory$convertToUIState$1.L$3 = buttonUIState4;
                                                mTicketTripInfoUIStateFactory$convertToUIState$1.L$4 = chaloTextUIState5;
                                                mTicketTripInfoUIStateFactory$convertToUIState$1.L$5 = loadingDialogUIState2;
                                                mTicketTripInfoUIStateFactory$convertToUIState$1.L$6 = productBookingBranding2;
                                                mTicketTripInfoUIStateFactory$convertToUIState$1.L$7 = snackbarUIState2;
                                                mTicketTripInfoUIStateFactory$convertToUIState$1.L$8 = mTicketTripInfoUIStateFactory;
                                                mTicketTripInfoUIStateFactory$convertToUIState$1.L$9 = str;
                                                mTicketTripInfoUIStateFactory$convertToUIState$1.L$10 = str3;
                                                mTicketTripInfoUIStateFactory$convertToUIState$1.L$11 = list;
                                                mTicketTripInfoUIStateFactory$convertToUIState$1.label = 7;
                                                objB6 = stringProvider4.b(StringEnum.STATUS_ERROR_ROUTE_NUMBER, new Object[0], mTicketTripInfoUIStateFactory$convertToUIState$1);
                                                if (objB6 != coroutineSingletons6) {
                                                    coroutineSingletons6 = coroutineSingletons6;
                                                    List list9 = list;
                                                    obj6 = objB6;
                                                    list2 = list9;
                                                    String str110 = str3;
                                                    chaloTextUIState6 = chaloTextUIState5;
                                                    str5 = str110;
                                                    str4 = (String) obj6;
                                                    TextUIState.ChaloTextUIState chaloTextUIState18 = chaloTextUIState6;
                                                    str3 = str5;
                                                    chaloTextUIState5 = chaloTextUIState18;
                                                }
                                            } else {
                                                coroutineSingletons6 = coroutineSingletons6;
                                                list2 = list;
                                                str4 = null;
                                            }
                                            MTicketTripInfoUIStateFactory mTicketTripInfoUIStateFactory14 = mTicketTripInfoUIStateFactory;
                                            wg0 wg0Var10 = new wg0(function7, 4);
                                            mTicketTripInfoUIStateFactory14.getClass();
                                            routeSelectionInputUIStateC = c(str, str3, list2, str4, wg0Var10);
                                            mTicketTripInfoUIStateFactory$convertToUIState$1.L$0 = mTicketTripInfoDataState8;
                                            mTicketTripInfoUIStateFactory$convertToUIState$1.L$1 = function7;
                                            mTicketTripInfoUIStateFactory$convertToUIState$1.L$2 = toolbarUIState6;
                                            mTicketTripInfoUIStateFactory$convertToUIState$1.L$3 = buttonUIState4;
                                            mTicketTripInfoUIStateFactory$convertToUIState$1.L$4 = chaloTextUIState5;
                                            mTicketTripInfoUIStateFactory$convertToUIState$1.L$5 = loadingDialogUIState2;
                                            mTicketTripInfoUIStateFactory$convertToUIState$1.L$6 = productBookingBranding2;
                                            mTicketTripInfoUIStateFactory$convertToUIState$1.L$7 = snackbarUIState2;
                                            mTicketTripInfoUIStateFactory$convertToUIState$1.L$8 = routeSelectionInputUIStateC;
                                            mTicketTripInfoUIStateFactory$convertToUIState$1.L$9 = this;
                                            mTicketTripInfoUIStateFactory$convertToUIState$1.L$10 = null;
                                            mTicketTripInfoUIStateFactory$convertToUIState$1.L$11 = null;
                                            mTicketTripInfoUIStateFactory$convertToUIState$1.label = 8;
                                            objB7 = stringProvider4.b(StringEnum.HINT_START_STOP, new Object[0], mTicketTripInfoUIStateFactory$convertToUIState$1);
                                            coroutineSingletons = coroutineSingletons6;
                                            if (objB7 == coroutineSingletons) {
                                                return coroutineSingletons;
                                            }
                                            SnackbarUIState snackbarUIState15 = snackbarUIState2;
                                            routeSelectionInputUIState = routeSelectionInputUIStateC;
                                            loadingDialogUIState3 = loadingDialogUIState2;
                                            productBookingBranding3 = productBookingBranding2;
                                            snackbarUIState3 = snackbarUIState15;
                                            ToolbarUIState toolbarUIState15 = toolbarUIState6;
                                            buttonUIState5 = buttonUIState4;
                                            function8 = function7;
                                            toolbarUIState7 = toolbarUIState15;
                                            mTicketTripInfoUIStateFactory2 = this;
                                            str6 = (String) objB7;
                                            productBookingStopDetails = mTicketTripInfoDataState8.c;
                                            if (productBookingStopDetails != null) {
                                                str7 = str2;
                                            } else {
                                                str7 = str2;
                                            }
                                            list3 = EmptyList.f17557a;
                                            coroutineSingletons2 = coroutineSingletons;
                                            if (mTicketTripInfoDataState8.i == MTicketTripInfoMissingFieldError.FROM_STOP) {
                                                mTicketTripInfoUIStateFactory$convertToUIState$1.L$0 = mTicketTripInfoDataState8;
                                                mTicketTripInfoUIStateFactory$convertToUIState$1.L$1 = function8;
                                                mTicketTripInfoUIStateFactory$convertToUIState$1.L$2 = toolbarUIState7;
                                                mTicketTripInfoUIStateFactory$convertToUIState$1.L$3 = buttonUIState5;
                                                mTicketTripInfoUIStateFactory$convertToUIState$1.L$4 = chaloTextUIState5;
                                                mTicketTripInfoUIStateFactory$convertToUIState$1.L$5 = loadingDialogUIState3;
                                                mTicketTripInfoUIStateFactory$convertToUIState$1.L$6 = productBookingBranding3;
                                                mTicketTripInfoUIStateFactory$convertToUIState$1.L$7 = snackbarUIState3;
                                                mTicketTripInfoUIStateFactory$convertToUIState$1.L$8 = routeSelectionInputUIState;
                                                mTicketTripInfoUIStateFactory$convertToUIState$1.L$9 = mTicketTripInfoUIStateFactory2;
                                                mTicketTripInfoUIStateFactory$convertToUIState$1.L$10 = str6;
                                                mTicketTripInfoUIStateFactory$convertToUIState$1.L$11 = str7;
                                                mTicketTripInfoUIStateFactory$convertToUIState$1.L$12 = list3;
                                                mTicketTripInfoUIStateFactory$convertToUIState$1.label = 9;
                                                loadingDialogUIState4 = loadingDialogUIState3;
                                                stringProvider = stringProvider4;
                                                objB8 = stringProvider.b(StringEnum.STATUS_ERROR_ENTER_STOP, new Object[0], mTicketTripInfoUIStateFactory$convertToUIState$1);
                                                coroutineSingletons3 = coroutineSingletons2;
                                                if (objB8 == coroutineSingletons3) {
                                                    return coroutineSingletons3;
                                                }
                                                TextUIState.ChaloTextUIState chaloTextUIState19 = chaloTextUIState5;
                                                str9 = str7;
                                                obj7 = objB8;
                                                chaloTextUIState7 = chaloTextUIState19;
                                                SnackbarUIState snackbarUIState16 = snackbarUIState3;
                                                routeSelectionInputUIState2 = routeSelectionInputUIState;
                                                toolbarUIState8 = toolbarUIState7;
                                                buttonUIState6 = buttonUIState5;
                                                function9 = function8;
                                                productBookingBranding4 = productBookingBranding3;
                                                snackbarUIState4 = snackbarUIState16;
                                                coroutineSingletons2 = coroutineSingletons3;
                                                mTicketTripInfoUIStateFactory3 = mTicketTripInfoUIStateFactory2;
                                                str8 = (String) obj7;
                                            } else {
                                                loadingDialogUIState4 = loadingDialogUIState3;
                                                stringProvider = stringProvider4;
                                                SnackbarUIState snackbarUIState17 = snackbarUIState3;
                                                routeSelectionInputUIState2 = routeSelectionInputUIState;
                                                toolbarUIState8 = toolbarUIState7;
                                                buttonUIState6 = buttonUIState5;
                                                function9 = function8;
                                                productBookingBranding4 = productBookingBranding3;
                                                snackbarUIState4 = snackbarUIState17;
                                                chaloTextUIState7 = chaloTextUIState5;
                                                mTicketTripInfoUIStateFactory3 = mTicketTripInfoUIStateFactory2;
                                                str8 = null;
                                                str9 = str7;
                                            }
                                            loadingDialogUIState5 = loadingDialogUIState4;
                                            StringProvider stringProvider8 = stringProvider;
                                            wg0 wg0Var11 = new wg0(function9, 5);
                                            mTicketTripInfoUIStateFactory3.getClass();
                                            routeSelectionInputUIStateC2 = c(str6, str9, list3, str8, wg0Var11);
                                            mTicketTripInfoUIStateFactory$convertToUIState$1.L$0 = mTicketTripInfoDataState8;
                                            mTicketTripInfoUIStateFactory$convertToUIState$1.L$1 = function9;
                                            mTicketTripInfoUIStateFactory$convertToUIState$1.L$2 = toolbarUIState8;
                                            mTicketTripInfoUIStateFactory$convertToUIState$1.L$3 = buttonUIState6;
                                            mTicketTripInfoUIStateFactory$convertToUIState$1.L$4 = chaloTextUIState7;
                                            mTicketTripInfoUIStateFactory$convertToUIState$1.L$5 = loadingDialogUIState5;
                                            mTicketTripInfoUIStateFactory$convertToUIState$1.L$6 = productBookingBranding4;
                                            mTicketTripInfoUIStateFactory$convertToUIState$1.L$7 = snackbarUIState4;
                                            mTicketTripInfoUIStateFactory$convertToUIState$1.L$8 = routeSelectionInputUIState2;
                                            mTicketTripInfoUIStateFactory$convertToUIState$1.L$9 = routeSelectionInputUIStateC2;
                                            mTicketTripInfoUIStateFactory$convertToUIState$1.L$10 = this;
                                            mTicketTripInfoUIStateFactory$convertToUIState$1.L$11 = null;
                                            mTicketTripInfoUIStateFactory$convertToUIState$1.L$12 = null;
                                            mTicketTripInfoUIStateFactory$convertToUIState$1.label = 10;
                                            stringProvider2 = stringProvider8;
                                            objB9 = stringProvider2.b(StringEnum.HINT_END_STOP, new Object[0], mTicketTripInfoUIStateFactory$convertToUIState$1);
                                            coroutineSingletons4 = coroutineSingletons2;
                                            if (objB9 == coroutineSingletons4) {
                                                return coroutineSingletons4;
                                            }
                                            loadingDialogUIState6 = loadingDialogUIState5;
                                            obj8 = objB9;
                                            toolbarUIState9 = toolbarUIState8;
                                            routeSelectionInputUIState3 = routeSelectionInputUIStateC2;
                                            mTicketTripInfoUIStateFactory4 = this;
                                            str10 = (String) obj8;
                                            productBookingStopDetails2 = mTicketTripInfoDataState8.d;
                                            if (productBookingStopDetails2 != null) {
                                                str11 = str2;
                                            } else {
                                                str11 = str2;
                                            }
                                            coroutineSingletons5 = coroutineSingletons4;
                                            list4 = EmptyList.f17557a;
                                            stringProvider3 = stringProvider2;
                                            if (mTicketTripInfoDataState8.i == MTicketTripInfoMissingFieldError.TO_STOP) {
                                                mTicketTripInfoUIStateFactory$convertToUIState$1.L$0 = function9;
                                                mTicketTripInfoUIStateFactory$convertToUIState$1.L$1 = toolbarUIState9;
                                                mTicketTripInfoUIStateFactory$convertToUIState$1.L$2 = buttonUIState6;
                                                mTicketTripInfoUIStateFactory$convertToUIState$1.L$3 = chaloTextUIState7;
                                                mTicketTripInfoUIStateFactory$convertToUIState$1.L$4 = loadingDialogUIState6;
                                                mTicketTripInfoUIStateFactory$convertToUIState$1.L$5 = productBookingBranding4;
                                                mTicketTripInfoUIStateFactory$convertToUIState$1.L$6 = snackbarUIState4;
                                                mTicketTripInfoUIStateFactory$convertToUIState$1.L$7 = routeSelectionInputUIState2;
                                                mTicketTripInfoUIStateFactory$convertToUIState$1.L$8 = routeSelectionInputUIState3;
                                                mTicketTripInfoUIStateFactory$convertToUIState$1.L$9 = mTicketTripInfoUIStateFactory4;
                                                mTicketTripInfoUIStateFactory$convertToUIState$1.L$10 = str10;
                                                mTicketTripInfoUIStateFactory$convertToUIState$1.L$11 = str11;
                                                mTicketTripInfoUIStateFactory$convertToUIState$1.L$12 = list4;
                                                mTicketTripInfoUIStateFactory6 = mTicketTripInfoUIStateFactory4;
                                                mTicketTripInfoUIStateFactory$convertToUIState$1.label = 11;
                                                objB10 = stringProvider3.b(StringEnum.STATUS_ERROR_ENTER_STOP, new Object[0], mTicketTripInfoUIStateFactory$convertToUIState$1);
                                                if (objB10 == coroutineSingletons5) {
                                                    return coroutineSingletons5;
                                                }
                                                chaloTextUIState9 = chaloTextUIState7;
                                                routeSelectionInputUIState6 = routeSelectionInputUIState2;
                                                productBookingBranding6 = productBookingBranding4;
                                                function10 = function9;
                                                buttonUIState7 = buttonUIState6;
                                                str13 = str10;
                                                toolbarUIState11 = toolbarUIState9;
                                                routeSelectionInputUIState7 = routeSelectionInputUIState3;
                                                snackbarUIState5 = snackbarUIState4;
                                                obj9 = objB10;
                                                loadingDialogUIState8 = loadingDialogUIState6;
                                                list5 = list4;
                                                mTicketTripInfoUIStateFactory7 = mTicketTripInfoUIStateFactory6;
                                                String str111 = (String) obj9;
                                                Function1 function14 = function10;
                                                str12 = str111;
                                                mTicketTripInfoUIStateFactory5 = mTicketTripInfoUIStateFactory7;
                                                list4 = list5;
                                                toolbarUIState10 = toolbarUIState11;
                                                function9 = function14;
                                                LoadingDialogUIState loadingDialogUIState12 = loadingDialogUIState8;
                                                snackbarUIState4 = snackbarUIState5;
                                                productBookingBranding5 = productBookingBranding6;
                                                loadingDialogUIState7 = loadingDialogUIState12;
                                                str10 = str13;
                                                routeSelectionInputUIState5 = routeSelectionInputUIState7;
                                                routeSelectionInputUIState4 = routeSelectionInputUIState6;
                                                chaloTextUIState8 = chaloTextUIState9;
                                                buttonUIState6 = buttonUIState7;
                                            } else {
                                                MTicketTripInfoUIStateFactory mTicketTripInfoUIStateFactory15 = mTicketTripInfoUIStateFactory4;
                                                RouteSelectionInputUIState routeSelectionInputUIState11 = routeSelectionInputUIState2;
                                                loadingDialogUIState7 = loadingDialogUIState6;
                                                toolbarUIState10 = toolbarUIState9;
                                                routeSelectionInputUIState4 = routeSelectionInputUIState11;
                                                chaloTextUIState8 = chaloTextUIState7;
                                                routeSelectionInputUIState5 = routeSelectionInputUIState3;
                                                productBookingBranding5 = productBookingBranding4;
                                                mTicketTripInfoUIStateFactory5 = mTicketTripInfoUIStateFactory15;
                                                str12 = null;
                                            }
                                            wg0 wg0Var12 = new wg0(function9, 6);
                                            mTicketTripInfoUIStateFactory5.getClass();
                                            return new MTicketTripInfoUIState(toolbarUIState10, routeSelectionInputUIState4, routeSelectionInputUIState5, c(str10, str11, list4, str12, wg0Var12), buttonUIState6, chaloTextUIState8, productBookingBranding5, loadingDialogUIState7, snackbarUIState4);
                                        }
                                    }
                                }
                            }
                        } else {
                            mTicketTripInfoDataState5 = mTicketTripInfoDataState4;
                            chaloTextUIState = null;
                            function4 = function3;
                            buttonUIState = buttonUIStateG;
                            toolbarUIState3 = toolbarUIState2;
                            if (mTicketTripInfoDataState5.f) {
                                mTicketTripInfoUIStateFactory$convertToUIState$1.L$0 = mTicketTripInfoDataState5;
                                mTicketTripInfoUIStateFactory$convertToUIState$1.L$1 = function4;
                                mTicketTripInfoUIStateFactory$convertToUIState$1.L$2 = toolbarUIState3;
                                mTicketTripInfoUIStateFactory$convertToUIState$1.L$3 = buttonUIState;
                                mTicketTripInfoUIStateFactory$convertToUIState$1.L$4 = chaloTextUIState;
                                dialogUIStateFactory = DialogUIStateFactory.f9989a;
                                mTicketTripInfoUIStateFactory$convertToUIState$1.L$5 = dialogUIStateFactory;
                                mTicketTripInfoUIStateFactory$convertToUIState$1.label = 4;
                                objB4 = stringProvider4.b(StringEnum.LOADING, new Object[0], mTicketTripInfoUIStateFactory$convertToUIState$1);
                                if (objB4 != coroutineSingletons6) {
                                    obj3 = objB4;
                                    chaloTextUIState3 = chaloTextUIState;
                                    dialogUIStateFactory2 = dialogUIStateFactory;
                                    dialogUIStateFactory2.getClass();
                                    loadingDialogUIStateA = DialogUIStateFactory.a((String) obj3);
                                    mTicketTripInfoDataState7 = mTicketTripInfoDataState5;
                                    function5 = function4;
                                    toolbarUIState4 = toolbarUIState3;
                                    buttonUIState2 = buttonUIState;
                                    chaloTextUIState2 = chaloTextUIState3;
                                    productBookingBranding = mTicketTripInfoDataState7.g;
                                    mTicketTripInfoSnackBarType = mTicketTripInfoDataState7.e;
                                    if (mTicketTripInfoSnackBarType != null) {
                                        mTicketTripInfoUIStateFactory$convertToUIState$1.L$0 = mTicketTripInfoDataState7;
                                        mTicketTripInfoUIStateFactory$convertToUIState$1.L$1 = function5;
                                        mTicketTripInfoUIStateFactory$convertToUIState$1.L$2 = toolbarUIState4;
                                        mTicketTripInfoUIStateFactory$convertToUIState$1.L$3 = buttonUIState2;
                                        mTicketTripInfoUIStateFactory$convertToUIState$1.L$4 = chaloTextUIState2;
                                        mTicketTripInfoUIStateFactory$convertToUIState$1.L$5 = loadingDialogUIStateA;
                                        mTicketTripInfoUIStateFactory$convertToUIState$1.L$6 = productBookingBranding;
                                        mTicketTripInfoUIStateFactory$convertToUIState$1.label = 5;
                                        objD = d(mTicketTripInfoSnackBarType, function5, mTicketTripInfoUIStateFactory$convertToUIState$1);
                                        if (objD != coroutineSingletons6) {
                                            TextUIState.ChaloTextUIState chaloTextUIState110 = chaloTextUIState2;
                                            loadingDialogUIState = loadingDialogUIStateA;
                                            obj4 = objD;
                                            mTicketTripInfoDataState8 = mTicketTripInfoDataState7;
                                            function6 = function5;
                                            toolbarUIState5 = toolbarUIState4;
                                            buttonUIState3 = buttonUIState2;
                                            chaloTextUIState4 = chaloTextUIState110;
                                            snackbarUIState = (SnackbarUIState) obj4;
                                            mTicketTripInfoUIStateFactory$convertToUIState$1.L$0 = mTicketTripInfoDataState8;
                                            mTicketTripInfoUIStateFactory$convertToUIState$1.L$1 = function6;
                                            mTicketTripInfoUIStateFactory$convertToUIState$1.L$2 = toolbarUIState5;
                                            mTicketTripInfoUIStateFactory$convertToUIState$1.L$3 = buttonUIState3;
                                            mTicketTripInfoUIStateFactory$convertToUIState$1.L$4 = chaloTextUIState4;
                                            mTicketTripInfoUIStateFactory$convertToUIState$1.L$5 = loadingDialogUIState;
                                            mTicketTripInfoUIStateFactory$convertToUIState$1.L$6 = productBookingBranding;
                                            mTicketTripInfoUIStateFactory$convertToUIState$1.L$7 = snackbarUIState;
                                            mTicketTripInfoUIStateFactory$convertToUIState$1.L$8 = this;
                                            mTicketTripInfoUIStateFactory$convertToUIState$1.label = 6;
                                            objB5 = stringProvider4.b(StringEnum.HINT_ROUTE_NUMBER, new Object[0], mTicketTripInfoUIStateFactory$convertToUIState$1);
                                            if (objB5 != coroutineSingletons6) {
                                                ButtonUIState buttonUIState12 = buttonUIState3;
                                                snackbarUIState2 = snackbarUIState;
                                                obj5 = objB5;
                                                buttonUIState4 = buttonUIState12;
                                                toolbarUIState6 = toolbarUIState5;
                                                function7 = function6;
                                                productBookingBranding2 = productBookingBranding;
                                                loadingDialogUIState2 = loadingDialogUIState;
                                                chaloTextUIState5 = chaloTextUIState4;
                                                mTicketTripInfoUIStateFactory = this;
                                                str = (String) obj5;
                                                productBookingRouteDetails = mTicketTripInfoDataState8.b;
                                                str2 = "";
                                                if (productBookingRouteDetails != null) {
                                                    str3 = str2;
                                                } else {
                                                    str3 = str2;
                                                }
                                                if (productBookingRouteDetails != null) {
                                                    list = EmptyList.f17557a;
                                                } else {
                                                    list = EmptyList.f17557a;
                                                }
                                                if (mTicketTripInfoDataState8.i == MTicketTripInfoMissingFieldError.ROUTE) {
                                                    mTicketTripInfoUIStateFactory$convertToUIState$1.L$0 = mTicketTripInfoDataState8;
                                                    mTicketTripInfoUIStateFactory$convertToUIState$1.L$1 = function7;
                                                    mTicketTripInfoUIStateFactory$convertToUIState$1.L$2 = toolbarUIState6;
                                                    mTicketTripInfoUIStateFactory$convertToUIState$1.L$3 = buttonUIState4;
                                                    mTicketTripInfoUIStateFactory$convertToUIState$1.L$4 = chaloTextUIState5;
                                                    mTicketTripInfoUIStateFactory$convertToUIState$1.L$5 = loadingDialogUIState2;
                                                    mTicketTripInfoUIStateFactory$convertToUIState$1.L$6 = productBookingBranding2;
                                                    mTicketTripInfoUIStateFactory$convertToUIState$1.L$7 = snackbarUIState2;
                                                    mTicketTripInfoUIStateFactory$convertToUIState$1.L$8 = mTicketTripInfoUIStateFactory;
                                                    mTicketTripInfoUIStateFactory$convertToUIState$1.L$9 = str;
                                                    mTicketTripInfoUIStateFactory$convertToUIState$1.L$10 = str3;
                                                    mTicketTripInfoUIStateFactory$convertToUIState$1.L$11 = list;
                                                    mTicketTripInfoUIStateFactory$convertToUIState$1.label = 7;
                                                    objB6 = stringProvider4.b(StringEnum.STATUS_ERROR_ROUTE_NUMBER, new Object[0], mTicketTripInfoUIStateFactory$convertToUIState$1);
                                                    if (objB6 != coroutineSingletons6) {
                                                        coroutineSingletons6 = coroutineSingletons6;
                                                        List list10 = list;
                                                        obj6 = objB6;
                                                        list2 = list10;
                                                        String str112 = str3;
                                                        chaloTextUIState6 = chaloTextUIState5;
                                                        str5 = str112;
                                                        str4 = (String) obj6;
                                                        TextUIState.ChaloTextUIState chaloTextUIState111 = chaloTextUIState6;
                                                        str3 = str5;
                                                        chaloTextUIState5 = chaloTextUIState111;
                                                    }
                                                } else {
                                                    coroutineSingletons6 = coroutineSingletons6;
                                                    list2 = list;
                                                    str4 = null;
                                                }
                                                MTicketTripInfoUIStateFactory mTicketTripInfoUIStateFactory16 = mTicketTripInfoUIStateFactory;
                                                wg0 wg0Var13 = new wg0(function7, 4);
                                                mTicketTripInfoUIStateFactory16.getClass();
                                                routeSelectionInputUIStateC = c(str, str3, list2, str4, wg0Var13);
                                                mTicketTripInfoUIStateFactory$convertToUIState$1.L$0 = mTicketTripInfoDataState8;
                                                mTicketTripInfoUIStateFactory$convertToUIState$1.L$1 = function7;
                                                mTicketTripInfoUIStateFactory$convertToUIState$1.L$2 = toolbarUIState6;
                                                mTicketTripInfoUIStateFactory$convertToUIState$1.L$3 = buttonUIState4;
                                                mTicketTripInfoUIStateFactory$convertToUIState$1.L$4 = chaloTextUIState5;
                                                mTicketTripInfoUIStateFactory$convertToUIState$1.L$5 = loadingDialogUIState2;
                                                mTicketTripInfoUIStateFactory$convertToUIState$1.L$6 = productBookingBranding2;
                                                mTicketTripInfoUIStateFactory$convertToUIState$1.L$7 = snackbarUIState2;
                                                mTicketTripInfoUIStateFactory$convertToUIState$1.L$8 = routeSelectionInputUIStateC;
                                                mTicketTripInfoUIStateFactory$convertToUIState$1.L$9 = this;
                                                mTicketTripInfoUIStateFactory$convertToUIState$1.L$10 = null;
                                                mTicketTripInfoUIStateFactory$convertToUIState$1.L$11 = null;
                                                mTicketTripInfoUIStateFactory$convertToUIState$1.label = 8;
                                                objB7 = stringProvider4.b(StringEnum.HINT_START_STOP, new Object[0], mTicketTripInfoUIStateFactory$convertToUIState$1);
                                                coroutineSingletons = coroutineSingletons6;
                                                if (objB7 == coroutineSingletons) {
                                                    return coroutineSingletons;
                                                }
                                                SnackbarUIState snackbarUIState18 = snackbarUIState2;
                                                routeSelectionInputUIState = routeSelectionInputUIStateC;
                                                loadingDialogUIState3 = loadingDialogUIState2;
                                                productBookingBranding3 = productBookingBranding2;
                                                snackbarUIState3 = snackbarUIState18;
                                                ToolbarUIState toolbarUIState16 = toolbarUIState6;
                                                buttonUIState5 = buttonUIState4;
                                                function8 = function7;
                                                toolbarUIState7 = toolbarUIState16;
                                                mTicketTripInfoUIStateFactory2 = this;
                                                str6 = (String) objB7;
                                                productBookingStopDetails = mTicketTripInfoDataState8.c;
                                                if (productBookingStopDetails != null) {
                                                    str7 = str2;
                                                } else {
                                                    str7 = str2;
                                                }
                                                list3 = EmptyList.f17557a;
                                                coroutineSingletons2 = coroutineSingletons;
                                                if (mTicketTripInfoDataState8.i == MTicketTripInfoMissingFieldError.FROM_STOP) {
                                                    mTicketTripInfoUIStateFactory$convertToUIState$1.L$0 = mTicketTripInfoDataState8;
                                                    mTicketTripInfoUIStateFactory$convertToUIState$1.L$1 = function8;
                                                    mTicketTripInfoUIStateFactory$convertToUIState$1.L$2 = toolbarUIState7;
                                                    mTicketTripInfoUIStateFactory$convertToUIState$1.L$3 = buttonUIState5;
                                                    mTicketTripInfoUIStateFactory$convertToUIState$1.L$4 = chaloTextUIState5;
                                                    mTicketTripInfoUIStateFactory$convertToUIState$1.L$5 = loadingDialogUIState3;
                                                    mTicketTripInfoUIStateFactory$convertToUIState$1.L$6 = productBookingBranding3;
                                                    mTicketTripInfoUIStateFactory$convertToUIState$1.L$7 = snackbarUIState3;
                                                    mTicketTripInfoUIStateFactory$convertToUIState$1.L$8 = routeSelectionInputUIState;
                                                    mTicketTripInfoUIStateFactory$convertToUIState$1.L$9 = mTicketTripInfoUIStateFactory2;
                                                    mTicketTripInfoUIStateFactory$convertToUIState$1.L$10 = str6;
                                                    mTicketTripInfoUIStateFactory$convertToUIState$1.L$11 = str7;
                                                    mTicketTripInfoUIStateFactory$convertToUIState$1.L$12 = list3;
                                                    mTicketTripInfoUIStateFactory$convertToUIState$1.label = 9;
                                                    loadingDialogUIState4 = loadingDialogUIState3;
                                                    stringProvider = stringProvider4;
                                                    objB8 = stringProvider.b(StringEnum.STATUS_ERROR_ENTER_STOP, new Object[0], mTicketTripInfoUIStateFactory$convertToUIState$1);
                                                    coroutineSingletons3 = coroutineSingletons2;
                                                    if (objB8 == coroutineSingletons3) {
                                                        return coroutineSingletons3;
                                                    }
                                                    TextUIState.ChaloTextUIState chaloTextUIState112 = chaloTextUIState5;
                                                    str9 = str7;
                                                    obj7 = objB8;
                                                    chaloTextUIState7 = chaloTextUIState112;
                                                    SnackbarUIState snackbarUIState19 = snackbarUIState3;
                                                    routeSelectionInputUIState2 = routeSelectionInputUIState;
                                                    toolbarUIState8 = toolbarUIState7;
                                                    buttonUIState6 = buttonUIState5;
                                                    function9 = function8;
                                                    productBookingBranding4 = productBookingBranding3;
                                                    snackbarUIState4 = snackbarUIState19;
                                                    coroutineSingletons2 = coroutineSingletons3;
                                                    mTicketTripInfoUIStateFactory3 = mTicketTripInfoUIStateFactory2;
                                                    str8 = (String) obj7;
                                                } else {
                                                    loadingDialogUIState4 = loadingDialogUIState3;
                                                    stringProvider = stringProvider4;
                                                    SnackbarUIState snackbarUIState110 = snackbarUIState3;
                                                    routeSelectionInputUIState2 = routeSelectionInputUIState;
                                                    toolbarUIState8 = toolbarUIState7;
                                                    buttonUIState6 = buttonUIState5;
                                                    function9 = function8;
                                                    productBookingBranding4 = productBookingBranding3;
                                                    snackbarUIState4 = snackbarUIState110;
                                                    chaloTextUIState7 = chaloTextUIState5;
                                                    mTicketTripInfoUIStateFactory3 = mTicketTripInfoUIStateFactory2;
                                                    str8 = null;
                                                    str9 = str7;
                                                }
                                                loadingDialogUIState5 = loadingDialogUIState4;
                                                StringProvider stringProvider9 = stringProvider;
                                                wg0 wg0Var14 = new wg0(function9, 5);
                                                mTicketTripInfoUIStateFactory3.getClass();
                                                routeSelectionInputUIStateC2 = c(str6, str9, list3, str8, wg0Var14);
                                                mTicketTripInfoUIStateFactory$convertToUIState$1.L$0 = mTicketTripInfoDataState8;
                                                mTicketTripInfoUIStateFactory$convertToUIState$1.L$1 = function9;
                                                mTicketTripInfoUIStateFactory$convertToUIState$1.L$2 = toolbarUIState8;
                                                mTicketTripInfoUIStateFactory$convertToUIState$1.L$3 = buttonUIState6;
                                                mTicketTripInfoUIStateFactory$convertToUIState$1.L$4 = chaloTextUIState7;
                                                mTicketTripInfoUIStateFactory$convertToUIState$1.L$5 = loadingDialogUIState5;
                                                mTicketTripInfoUIStateFactory$convertToUIState$1.L$6 = productBookingBranding4;
                                                mTicketTripInfoUIStateFactory$convertToUIState$1.L$7 = snackbarUIState4;
                                                mTicketTripInfoUIStateFactory$convertToUIState$1.L$8 = routeSelectionInputUIState2;
                                                mTicketTripInfoUIStateFactory$convertToUIState$1.L$9 = routeSelectionInputUIStateC2;
                                                mTicketTripInfoUIStateFactory$convertToUIState$1.L$10 = this;
                                                mTicketTripInfoUIStateFactory$convertToUIState$1.L$11 = null;
                                                mTicketTripInfoUIStateFactory$convertToUIState$1.L$12 = null;
                                                mTicketTripInfoUIStateFactory$convertToUIState$1.label = 10;
                                                stringProvider2 = stringProvider9;
                                                objB9 = stringProvider2.b(StringEnum.HINT_END_STOP, new Object[0], mTicketTripInfoUIStateFactory$convertToUIState$1);
                                                coroutineSingletons4 = coroutineSingletons2;
                                                if (objB9 == coroutineSingletons4) {
                                                    return coroutineSingletons4;
                                                }
                                                loadingDialogUIState6 = loadingDialogUIState5;
                                                obj8 = objB9;
                                                toolbarUIState9 = toolbarUIState8;
                                                routeSelectionInputUIState3 = routeSelectionInputUIStateC2;
                                                mTicketTripInfoUIStateFactory4 = this;
                                                str10 = (String) obj8;
                                                productBookingStopDetails2 = mTicketTripInfoDataState8.d;
                                                if (productBookingStopDetails2 != null) {
                                                    str11 = str2;
                                                } else {
                                                    str11 = str2;
                                                }
                                                coroutineSingletons5 = coroutineSingletons4;
                                                list4 = EmptyList.f17557a;
                                                stringProvider3 = stringProvider2;
                                                if (mTicketTripInfoDataState8.i == MTicketTripInfoMissingFieldError.TO_STOP) {
                                                    mTicketTripInfoUIStateFactory$convertToUIState$1.L$0 = function9;
                                                    mTicketTripInfoUIStateFactory$convertToUIState$1.L$1 = toolbarUIState9;
                                                    mTicketTripInfoUIStateFactory$convertToUIState$1.L$2 = buttonUIState6;
                                                    mTicketTripInfoUIStateFactory$convertToUIState$1.L$3 = chaloTextUIState7;
                                                    mTicketTripInfoUIStateFactory$convertToUIState$1.L$4 = loadingDialogUIState6;
                                                    mTicketTripInfoUIStateFactory$convertToUIState$1.L$5 = productBookingBranding4;
                                                    mTicketTripInfoUIStateFactory$convertToUIState$1.L$6 = snackbarUIState4;
                                                    mTicketTripInfoUIStateFactory$convertToUIState$1.L$7 = routeSelectionInputUIState2;
                                                    mTicketTripInfoUIStateFactory$convertToUIState$1.L$8 = routeSelectionInputUIState3;
                                                    mTicketTripInfoUIStateFactory$convertToUIState$1.L$9 = mTicketTripInfoUIStateFactory4;
                                                    mTicketTripInfoUIStateFactory$convertToUIState$1.L$10 = str10;
                                                    mTicketTripInfoUIStateFactory$convertToUIState$1.L$11 = str11;
                                                    mTicketTripInfoUIStateFactory$convertToUIState$1.L$12 = list4;
                                                    mTicketTripInfoUIStateFactory6 = mTicketTripInfoUIStateFactory4;
                                                    mTicketTripInfoUIStateFactory$convertToUIState$1.label = 11;
                                                    objB10 = stringProvider3.b(StringEnum.STATUS_ERROR_ENTER_STOP, new Object[0], mTicketTripInfoUIStateFactory$convertToUIState$1);
                                                    if (objB10 == coroutineSingletons5) {
                                                        return coroutineSingletons5;
                                                    }
                                                    chaloTextUIState9 = chaloTextUIState7;
                                                    routeSelectionInputUIState6 = routeSelectionInputUIState2;
                                                    productBookingBranding6 = productBookingBranding4;
                                                    function10 = function9;
                                                    buttonUIState7 = buttonUIState6;
                                                    str13 = str10;
                                                    toolbarUIState11 = toolbarUIState9;
                                                    routeSelectionInputUIState7 = routeSelectionInputUIState3;
                                                    snackbarUIState5 = snackbarUIState4;
                                                    obj9 = objB10;
                                                    loadingDialogUIState8 = loadingDialogUIState6;
                                                    list5 = list4;
                                                    mTicketTripInfoUIStateFactory7 = mTicketTripInfoUIStateFactory6;
                                                    String str113 = (String) obj9;
                                                    Function1 function15 = function10;
                                                    str12 = str113;
                                                    mTicketTripInfoUIStateFactory5 = mTicketTripInfoUIStateFactory7;
                                                    list4 = list5;
                                                    toolbarUIState10 = toolbarUIState11;
                                                    function9 = function15;
                                                    LoadingDialogUIState loadingDialogUIState13 = loadingDialogUIState8;
                                                    snackbarUIState4 = snackbarUIState5;
                                                    productBookingBranding5 = productBookingBranding6;
                                                    loadingDialogUIState7 = loadingDialogUIState13;
                                                    str10 = str13;
                                                    routeSelectionInputUIState5 = routeSelectionInputUIState7;
                                                    routeSelectionInputUIState4 = routeSelectionInputUIState6;
                                                    chaloTextUIState8 = chaloTextUIState9;
                                                    buttonUIState6 = buttonUIState7;
                                                } else {
                                                    MTicketTripInfoUIStateFactory mTicketTripInfoUIStateFactory17 = mTicketTripInfoUIStateFactory4;
                                                    RouteSelectionInputUIState routeSelectionInputUIState12 = routeSelectionInputUIState2;
                                                    loadingDialogUIState7 = loadingDialogUIState6;
                                                    toolbarUIState10 = toolbarUIState9;
                                                    routeSelectionInputUIState4 = routeSelectionInputUIState12;
                                                    chaloTextUIState8 = chaloTextUIState7;
                                                    routeSelectionInputUIState5 = routeSelectionInputUIState3;
                                                    productBookingBranding5 = productBookingBranding4;
                                                    mTicketTripInfoUIStateFactory5 = mTicketTripInfoUIStateFactory17;
                                                    str12 = null;
                                                }
                                                wg0 wg0Var15 = new wg0(function9, 6);
                                                mTicketTripInfoUIStateFactory5.getClass();
                                                return new MTicketTripInfoUIState(toolbarUIState10, routeSelectionInputUIState4, routeSelectionInputUIState5, c(str10, str11, list4, str12, wg0Var15), buttonUIState6, chaloTextUIState8, productBookingBranding5, loadingDialogUIState7, snackbarUIState4);
                                            }
                                        }
                                    } else {
                                        mTicketTripInfoDataState8 = mTicketTripInfoDataState7;
                                        function6 = function5;
                                        toolbarUIState5 = toolbarUIState4;
                                        buttonUIState3 = buttonUIState2;
                                        chaloTextUIState4 = chaloTextUIState2;
                                        loadingDialogUIState = loadingDialogUIStateA;
                                        snackbarUIState = null;
                                        mTicketTripInfoUIStateFactory$convertToUIState$1.L$0 = mTicketTripInfoDataState8;
                                        mTicketTripInfoUIStateFactory$convertToUIState$1.L$1 = function6;
                                        mTicketTripInfoUIStateFactory$convertToUIState$1.L$2 = toolbarUIState5;
                                        mTicketTripInfoUIStateFactory$convertToUIState$1.L$3 = buttonUIState3;
                                        mTicketTripInfoUIStateFactory$convertToUIState$1.L$4 = chaloTextUIState4;
                                        mTicketTripInfoUIStateFactory$convertToUIState$1.L$5 = loadingDialogUIState;
                                        mTicketTripInfoUIStateFactory$convertToUIState$1.L$6 = productBookingBranding;
                                        mTicketTripInfoUIStateFactory$convertToUIState$1.L$7 = snackbarUIState;
                                        mTicketTripInfoUIStateFactory$convertToUIState$1.L$8 = this;
                                        mTicketTripInfoUIStateFactory$convertToUIState$1.label = 6;
                                        objB5 = stringProvider4.b(StringEnum.HINT_ROUTE_NUMBER, new Object[0], mTicketTripInfoUIStateFactory$convertToUIState$1);
                                        if (objB5 != coroutineSingletons6) {
                                            ButtonUIState buttonUIState13 = buttonUIState3;
                                            snackbarUIState2 = snackbarUIState;
                                            obj5 = objB5;
                                            buttonUIState4 = buttonUIState13;
                                            toolbarUIState6 = toolbarUIState5;
                                            function7 = function6;
                                            productBookingBranding2 = productBookingBranding;
                                            loadingDialogUIState2 = loadingDialogUIState;
                                            chaloTextUIState5 = chaloTextUIState4;
                                            mTicketTripInfoUIStateFactory = this;
                                            str = (String) obj5;
                                            productBookingRouteDetails = mTicketTripInfoDataState8.b;
                                            str2 = "";
                                            if (productBookingRouteDetails != null) {
                                                str3 = str2;
                                            } else {
                                                str3 = str2;
                                            }
                                            if (productBookingRouteDetails != null) {
                                                list = EmptyList.f17557a;
                                            } else {
                                                list = EmptyList.f17557a;
                                            }
                                            if (mTicketTripInfoDataState8.i == MTicketTripInfoMissingFieldError.ROUTE) {
                                                mTicketTripInfoUIStateFactory$convertToUIState$1.L$0 = mTicketTripInfoDataState8;
                                                mTicketTripInfoUIStateFactory$convertToUIState$1.L$1 = function7;
                                                mTicketTripInfoUIStateFactory$convertToUIState$1.L$2 = toolbarUIState6;
                                                mTicketTripInfoUIStateFactory$convertToUIState$1.L$3 = buttonUIState4;
                                                mTicketTripInfoUIStateFactory$convertToUIState$1.L$4 = chaloTextUIState5;
                                                mTicketTripInfoUIStateFactory$convertToUIState$1.L$5 = loadingDialogUIState2;
                                                mTicketTripInfoUIStateFactory$convertToUIState$1.L$6 = productBookingBranding2;
                                                mTicketTripInfoUIStateFactory$convertToUIState$1.L$7 = snackbarUIState2;
                                                mTicketTripInfoUIStateFactory$convertToUIState$1.L$8 = mTicketTripInfoUIStateFactory;
                                                mTicketTripInfoUIStateFactory$convertToUIState$1.L$9 = str;
                                                mTicketTripInfoUIStateFactory$convertToUIState$1.L$10 = str3;
                                                mTicketTripInfoUIStateFactory$convertToUIState$1.L$11 = list;
                                                mTicketTripInfoUIStateFactory$convertToUIState$1.label = 7;
                                                objB6 = stringProvider4.b(StringEnum.STATUS_ERROR_ROUTE_NUMBER, new Object[0], mTicketTripInfoUIStateFactory$convertToUIState$1);
                                                if (objB6 != coroutineSingletons6) {
                                                    coroutineSingletons6 = coroutineSingletons6;
                                                    List list11 = list;
                                                    obj6 = objB6;
                                                    list2 = list11;
                                                    String str114 = str3;
                                                    chaloTextUIState6 = chaloTextUIState5;
                                                    str5 = str114;
                                                    str4 = (String) obj6;
                                                    TextUIState.ChaloTextUIState chaloTextUIState113 = chaloTextUIState6;
                                                    str3 = str5;
                                                    chaloTextUIState5 = chaloTextUIState113;
                                                }
                                            } else {
                                                coroutineSingletons6 = coroutineSingletons6;
                                                list2 = list;
                                                str4 = null;
                                            }
                                            MTicketTripInfoUIStateFactory mTicketTripInfoUIStateFactory18 = mTicketTripInfoUIStateFactory;
                                            wg0 wg0Var16 = new wg0(function7, 4);
                                            mTicketTripInfoUIStateFactory18.getClass();
                                            routeSelectionInputUIStateC = c(str, str3, list2, str4, wg0Var16);
                                            mTicketTripInfoUIStateFactory$convertToUIState$1.L$0 = mTicketTripInfoDataState8;
                                            mTicketTripInfoUIStateFactory$convertToUIState$1.L$1 = function7;
                                            mTicketTripInfoUIStateFactory$convertToUIState$1.L$2 = toolbarUIState6;
                                            mTicketTripInfoUIStateFactory$convertToUIState$1.L$3 = buttonUIState4;
                                            mTicketTripInfoUIStateFactory$convertToUIState$1.L$4 = chaloTextUIState5;
                                            mTicketTripInfoUIStateFactory$convertToUIState$1.L$5 = loadingDialogUIState2;
                                            mTicketTripInfoUIStateFactory$convertToUIState$1.L$6 = productBookingBranding2;
                                            mTicketTripInfoUIStateFactory$convertToUIState$1.L$7 = snackbarUIState2;
                                            mTicketTripInfoUIStateFactory$convertToUIState$1.L$8 = routeSelectionInputUIStateC;
                                            mTicketTripInfoUIStateFactory$convertToUIState$1.L$9 = this;
                                            mTicketTripInfoUIStateFactory$convertToUIState$1.L$10 = null;
                                            mTicketTripInfoUIStateFactory$convertToUIState$1.L$11 = null;
                                            mTicketTripInfoUIStateFactory$convertToUIState$1.label = 8;
                                            objB7 = stringProvider4.b(StringEnum.HINT_START_STOP, new Object[0], mTicketTripInfoUIStateFactory$convertToUIState$1);
                                            coroutineSingletons = coroutineSingletons6;
                                            if (objB7 == coroutineSingletons) {
                                                return coroutineSingletons;
                                            }
                                            SnackbarUIState snackbarUIState111 = snackbarUIState2;
                                            routeSelectionInputUIState = routeSelectionInputUIStateC;
                                            loadingDialogUIState3 = loadingDialogUIState2;
                                            productBookingBranding3 = productBookingBranding2;
                                            snackbarUIState3 = snackbarUIState111;
                                            ToolbarUIState toolbarUIState17 = toolbarUIState6;
                                            buttonUIState5 = buttonUIState4;
                                            function8 = function7;
                                            toolbarUIState7 = toolbarUIState17;
                                            mTicketTripInfoUIStateFactory2 = this;
                                            str6 = (String) objB7;
                                            productBookingStopDetails = mTicketTripInfoDataState8.c;
                                            if (productBookingStopDetails != null) {
                                                str7 = str2;
                                            } else {
                                                str7 = str2;
                                            }
                                            list3 = EmptyList.f17557a;
                                            coroutineSingletons2 = coroutineSingletons;
                                            if (mTicketTripInfoDataState8.i == MTicketTripInfoMissingFieldError.FROM_STOP) {
                                                mTicketTripInfoUIStateFactory$convertToUIState$1.L$0 = mTicketTripInfoDataState8;
                                                mTicketTripInfoUIStateFactory$convertToUIState$1.L$1 = function8;
                                                mTicketTripInfoUIStateFactory$convertToUIState$1.L$2 = toolbarUIState7;
                                                mTicketTripInfoUIStateFactory$convertToUIState$1.L$3 = buttonUIState5;
                                                mTicketTripInfoUIStateFactory$convertToUIState$1.L$4 = chaloTextUIState5;
                                                mTicketTripInfoUIStateFactory$convertToUIState$1.L$5 = loadingDialogUIState3;
                                                mTicketTripInfoUIStateFactory$convertToUIState$1.L$6 = productBookingBranding3;
                                                mTicketTripInfoUIStateFactory$convertToUIState$1.L$7 = snackbarUIState3;
                                                mTicketTripInfoUIStateFactory$convertToUIState$1.L$8 = routeSelectionInputUIState;
                                                mTicketTripInfoUIStateFactory$convertToUIState$1.L$9 = mTicketTripInfoUIStateFactory2;
                                                mTicketTripInfoUIStateFactory$convertToUIState$1.L$10 = str6;
                                                mTicketTripInfoUIStateFactory$convertToUIState$1.L$11 = str7;
                                                mTicketTripInfoUIStateFactory$convertToUIState$1.L$12 = list3;
                                                mTicketTripInfoUIStateFactory$convertToUIState$1.label = 9;
                                                loadingDialogUIState4 = loadingDialogUIState3;
                                                stringProvider = stringProvider4;
                                                objB8 = stringProvider.b(StringEnum.STATUS_ERROR_ENTER_STOP, new Object[0], mTicketTripInfoUIStateFactory$convertToUIState$1);
                                                coroutineSingletons3 = coroutineSingletons2;
                                                if (objB8 == coroutineSingletons3) {
                                                    return coroutineSingletons3;
                                                }
                                                TextUIState.ChaloTextUIState chaloTextUIState114 = chaloTextUIState5;
                                                str9 = str7;
                                                obj7 = objB8;
                                                chaloTextUIState7 = chaloTextUIState114;
                                                SnackbarUIState snackbarUIState112 = snackbarUIState3;
                                                routeSelectionInputUIState2 = routeSelectionInputUIState;
                                                toolbarUIState8 = toolbarUIState7;
                                                buttonUIState6 = buttonUIState5;
                                                function9 = function8;
                                                productBookingBranding4 = productBookingBranding3;
                                                snackbarUIState4 = snackbarUIState112;
                                                coroutineSingletons2 = coroutineSingletons3;
                                                mTicketTripInfoUIStateFactory3 = mTicketTripInfoUIStateFactory2;
                                                str8 = (String) obj7;
                                            } else {
                                                loadingDialogUIState4 = loadingDialogUIState3;
                                                stringProvider = stringProvider4;
                                                SnackbarUIState snackbarUIState113 = snackbarUIState3;
                                                routeSelectionInputUIState2 = routeSelectionInputUIState;
                                                toolbarUIState8 = toolbarUIState7;
                                                buttonUIState6 = buttonUIState5;
                                                function9 = function8;
                                                productBookingBranding4 = productBookingBranding3;
                                                snackbarUIState4 = snackbarUIState113;
                                                chaloTextUIState7 = chaloTextUIState5;
                                                mTicketTripInfoUIStateFactory3 = mTicketTripInfoUIStateFactory2;
                                                str8 = null;
                                                str9 = str7;
                                            }
                                            loadingDialogUIState5 = loadingDialogUIState4;
                                            StringProvider stringProvider10 = stringProvider;
                                            wg0 wg0Var17 = new wg0(function9, 5);
                                            mTicketTripInfoUIStateFactory3.getClass();
                                            routeSelectionInputUIStateC2 = c(str6, str9, list3, str8, wg0Var17);
                                            mTicketTripInfoUIStateFactory$convertToUIState$1.L$0 = mTicketTripInfoDataState8;
                                            mTicketTripInfoUIStateFactory$convertToUIState$1.L$1 = function9;
                                            mTicketTripInfoUIStateFactory$convertToUIState$1.L$2 = toolbarUIState8;
                                            mTicketTripInfoUIStateFactory$convertToUIState$1.L$3 = buttonUIState6;
                                            mTicketTripInfoUIStateFactory$convertToUIState$1.L$4 = chaloTextUIState7;
                                            mTicketTripInfoUIStateFactory$convertToUIState$1.L$5 = loadingDialogUIState5;
                                            mTicketTripInfoUIStateFactory$convertToUIState$1.L$6 = productBookingBranding4;
                                            mTicketTripInfoUIStateFactory$convertToUIState$1.L$7 = snackbarUIState4;
                                            mTicketTripInfoUIStateFactory$convertToUIState$1.L$8 = routeSelectionInputUIState2;
                                            mTicketTripInfoUIStateFactory$convertToUIState$1.L$9 = routeSelectionInputUIStateC2;
                                            mTicketTripInfoUIStateFactory$convertToUIState$1.L$10 = this;
                                            mTicketTripInfoUIStateFactory$convertToUIState$1.L$11 = null;
                                            mTicketTripInfoUIStateFactory$convertToUIState$1.L$12 = null;
                                            mTicketTripInfoUIStateFactory$convertToUIState$1.label = 10;
                                            stringProvider2 = stringProvider10;
                                            objB9 = stringProvider2.b(StringEnum.HINT_END_STOP, new Object[0], mTicketTripInfoUIStateFactory$convertToUIState$1);
                                            coroutineSingletons4 = coroutineSingletons2;
                                            if (objB9 == coroutineSingletons4) {
                                                return coroutineSingletons4;
                                            }
                                            loadingDialogUIState6 = loadingDialogUIState5;
                                            obj8 = objB9;
                                            toolbarUIState9 = toolbarUIState8;
                                            routeSelectionInputUIState3 = routeSelectionInputUIStateC2;
                                            mTicketTripInfoUIStateFactory4 = this;
                                            str10 = (String) obj8;
                                            productBookingStopDetails2 = mTicketTripInfoDataState8.d;
                                            if (productBookingStopDetails2 != null) {
                                                str11 = str2;
                                            } else {
                                                str11 = str2;
                                            }
                                            coroutineSingletons5 = coroutineSingletons4;
                                            list4 = EmptyList.f17557a;
                                            stringProvider3 = stringProvider2;
                                            if (mTicketTripInfoDataState8.i == MTicketTripInfoMissingFieldError.TO_STOP) {
                                                mTicketTripInfoUIStateFactory$convertToUIState$1.L$0 = function9;
                                                mTicketTripInfoUIStateFactory$convertToUIState$1.L$1 = toolbarUIState9;
                                                mTicketTripInfoUIStateFactory$convertToUIState$1.L$2 = buttonUIState6;
                                                mTicketTripInfoUIStateFactory$convertToUIState$1.L$3 = chaloTextUIState7;
                                                mTicketTripInfoUIStateFactory$convertToUIState$1.L$4 = loadingDialogUIState6;
                                                mTicketTripInfoUIStateFactory$convertToUIState$1.L$5 = productBookingBranding4;
                                                mTicketTripInfoUIStateFactory$convertToUIState$1.L$6 = snackbarUIState4;
                                                mTicketTripInfoUIStateFactory$convertToUIState$1.L$7 = routeSelectionInputUIState2;
                                                mTicketTripInfoUIStateFactory$convertToUIState$1.L$8 = routeSelectionInputUIState3;
                                                mTicketTripInfoUIStateFactory$convertToUIState$1.L$9 = mTicketTripInfoUIStateFactory4;
                                                mTicketTripInfoUIStateFactory$convertToUIState$1.L$10 = str10;
                                                mTicketTripInfoUIStateFactory$convertToUIState$1.L$11 = str11;
                                                mTicketTripInfoUIStateFactory$convertToUIState$1.L$12 = list4;
                                                mTicketTripInfoUIStateFactory6 = mTicketTripInfoUIStateFactory4;
                                                mTicketTripInfoUIStateFactory$convertToUIState$1.label = 11;
                                                objB10 = stringProvider3.b(StringEnum.STATUS_ERROR_ENTER_STOP, new Object[0], mTicketTripInfoUIStateFactory$convertToUIState$1);
                                                if (objB10 == coroutineSingletons5) {
                                                    return coroutineSingletons5;
                                                }
                                                chaloTextUIState9 = chaloTextUIState7;
                                                routeSelectionInputUIState6 = routeSelectionInputUIState2;
                                                productBookingBranding6 = productBookingBranding4;
                                                function10 = function9;
                                                buttonUIState7 = buttonUIState6;
                                                str13 = str10;
                                                toolbarUIState11 = toolbarUIState9;
                                                routeSelectionInputUIState7 = routeSelectionInputUIState3;
                                                snackbarUIState5 = snackbarUIState4;
                                                obj9 = objB10;
                                                loadingDialogUIState8 = loadingDialogUIState6;
                                                list5 = list4;
                                                mTicketTripInfoUIStateFactory7 = mTicketTripInfoUIStateFactory6;
                                                String str115 = (String) obj9;
                                                Function1 function16 = function10;
                                                str12 = str115;
                                                mTicketTripInfoUIStateFactory5 = mTicketTripInfoUIStateFactory7;
                                                list4 = list5;
                                                toolbarUIState10 = toolbarUIState11;
                                                function9 = function16;
                                                LoadingDialogUIState loadingDialogUIState14 = loadingDialogUIState8;
                                                snackbarUIState4 = snackbarUIState5;
                                                productBookingBranding5 = productBookingBranding6;
                                                loadingDialogUIState7 = loadingDialogUIState14;
                                                str10 = str13;
                                                routeSelectionInputUIState5 = routeSelectionInputUIState7;
                                                routeSelectionInputUIState4 = routeSelectionInputUIState6;
                                                chaloTextUIState8 = chaloTextUIState9;
                                                buttonUIState6 = buttonUIState7;
                                            } else {
                                                MTicketTripInfoUIStateFactory mTicketTripInfoUIStateFactory19 = mTicketTripInfoUIStateFactory4;
                                                RouteSelectionInputUIState routeSelectionInputUIState13 = routeSelectionInputUIState2;
                                                loadingDialogUIState7 = loadingDialogUIState6;
                                                toolbarUIState10 = toolbarUIState9;
                                                routeSelectionInputUIState4 = routeSelectionInputUIState13;
                                                chaloTextUIState8 = chaloTextUIState7;
                                                routeSelectionInputUIState5 = routeSelectionInputUIState3;
                                                productBookingBranding5 = productBookingBranding4;
                                                mTicketTripInfoUIStateFactory5 = mTicketTripInfoUIStateFactory19;
                                                str12 = null;
                                            }
                                            wg0 wg0Var18 = new wg0(function9, 6);
                                            mTicketTripInfoUIStateFactory5.getClass();
                                            return new MTicketTripInfoUIState(toolbarUIState10, routeSelectionInputUIState4, routeSelectionInputUIState5, c(str10, str11, list4, str12, wg0Var18), buttonUIState6, chaloTextUIState8, productBookingBranding5, loadingDialogUIState7, snackbarUIState4);
                                        }
                                    }
                                }
                            } else {
                                mTicketTripInfoDataState7 = mTicketTripInfoDataState5;
                                function5 = function4;
                                toolbarUIState4 = toolbarUIState3;
                                buttonUIState2 = buttonUIState;
                                chaloTextUIState2 = chaloTextUIState;
                                loadingDialogUIStateA = null;
                                productBookingBranding = mTicketTripInfoDataState7.g;
                                mTicketTripInfoSnackBarType = mTicketTripInfoDataState7.e;
                                if (mTicketTripInfoSnackBarType != null) {
                                    mTicketTripInfoUIStateFactory$convertToUIState$1.L$0 = mTicketTripInfoDataState7;
                                    mTicketTripInfoUIStateFactory$convertToUIState$1.L$1 = function5;
                                    mTicketTripInfoUIStateFactory$convertToUIState$1.L$2 = toolbarUIState4;
                                    mTicketTripInfoUIStateFactory$convertToUIState$1.L$3 = buttonUIState2;
                                    mTicketTripInfoUIStateFactory$convertToUIState$1.L$4 = chaloTextUIState2;
                                    mTicketTripInfoUIStateFactory$convertToUIState$1.L$5 = loadingDialogUIStateA;
                                    mTicketTripInfoUIStateFactory$convertToUIState$1.L$6 = productBookingBranding;
                                    mTicketTripInfoUIStateFactory$convertToUIState$1.label = 5;
                                    objD = d(mTicketTripInfoSnackBarType, function5, mTicketTripInfoUIStateFactory$convertToUIState$1);
                                    if (objD != coroutineSingletons6) {
                                        TextUIState.ChaloTextUIState chaloTextUIState115 = chaloTextUIState2;
                                        loadingDialogUIState = loadingDialogUIStateA;
                                        obj4 = objD;
                                        mTicketTripInfoDataState8 = mTicketTripInfoDataState7;
                                        function6 = function5;
                                        toolbarUIState5 = toolbarUIState4;
                                        buttonUIState3 = buttonUIState2;
                                        chaloTextUIState4 = chaloTextUIState115;
                                        snackbarUIState = (SnackbarUIState) obj4;
                                        mTicketTripInfoUIStateFactory$convertToUIState$1.L$0 = mTicketTripInfoDataState8;
                                        mTicketTripInfoUIStateFactory$convertToUIState$1.L$1 = function6;
                                        mTicketTripInfoUIStateFactory$convertToUIState$1.L$2 = toolbarUIState5;
                                        mTicketTripInfoUIStateFactory$convertToUIState$1.L$3 = buttonUIState3;
                                        mTicketTripInfoUIStateFactory$convertToUIState$1.L$4 = chaloTextUIState4;
                                        mTicketTripInfoUIStateFactory$convertToUIState$1.L$5 = loadingDialogUIState;
                                        mTicketTripInfoUIStateFactory$convertToUIState$1.L$6 = productBookingBranding;
                                        mTicketTripInfoUIStateFactory$convertToUIState$1.L$7 = snackbarUIState;
                                        mTicketTripInfoUIStateFactory$convertToUIState$1.L$8 = this;
                                        mTicketTripInfoUIStateFactory$convertToUIState$1.label = 6;
                                        objB5 = stringProvider4.b(StringEnum.HINT_ROUTE_NUMBER, new Object[0], mTicketTripInfoUIStateFactory$convertToUIState$1);
                                        if (objB5 != coroutineSingletons6) {
                                            ButtonUIState buttonUIState14 = buttonUIState3;
                                            snackbarUIState2 = snackbarUIState;
                                            obj5 = objB5;
                                            buttonUIState4 = buttonUIState14;
                                            toolbarUIState6 = toolbarUIState5;
                                            function7 = function6;
                                            productBookingBranding2 = productBookingBranding;
                                            loadingDialogUIState2 = loadingDialogUIState;
                                            chaloTextUIState5 = chaloTextUIState4;
                                            mTicketTripInfoUIStateFactory = this;
                                            str = (String) obj5;
                                            productBookingRouteDetails = mTicketTripInfoDataState8.b;
                                            str2 = "";
                                            if (productBookingRouteDetails != null) {
                                                str3 = str2;
                                            } else {
                                                str3 = str2;
                                            }
                                            if (productBookingRouteDetails != null) {
                                                list = EmptyList.f17557a;
                                            } else {
                                                list = EmptyList.f17557a;
                                            }
                                            if (mTicketTripInfoDataState8.i == MTicketTripInfoMissingFieldError.ROUTE) {
                                                mTicketTripInfoUIStateFactory$convertToUIState$1.L$0 = mTicketTripInfoDataState8;
                                                mTicketTripInfoUIStateFactory$convertToUIState$1.L$1 = function7;
                                                mTicketTripInfoUIStateFactory$convertToUIState$1.L$2 = toolbarUIState6;
                                                mTicketTripInfoUIStateFactory$convertToUIState$1.L$3 = buttonUIState4;
                                                mTicketTripInfoUIStateFactory$convertToUIState$1.L$4 = chaloTextUIState5;
                                                mTicketTripInfoUIStateFactory$convertToUIState$1.L$5 = loadingDialogUIState2;
                                                mTicketTripInfoUIStateFactory$convertToUIState$1.L$6 = productBookingBranding2;
                                                mTicketTripInfoUIStateFactory$convertToUIState$1.L$7 = snackbarUIState2;
                                                mTicketTripInfoUIStateFactory$convertToUIState$1.L$8 = mTicketTripInfoUIStateFactory;
                                                mTicketTripInfoUIStateFactory$convertToUIState$1.L$9 = str;
                                                mTicketTripInfoUIStateFactory$convertToUIState$1.L$10 = str3;
                                                mTicketTripInfoUIStateFactory$convertToUIState$1.L$11 = list;
                                                mTicketTripInfoUIStateFactory$convertToUIState$1.label = 7;
                                                objB6 = stringProvider4.b(StringEnum.STATUS_ERROR_ROUTE_NUMBER, new Object[0], mTicketTripInfoUIStateFactory$convertToUIState$1);
                                                if (objB6 != coroutineSingletons6) {
                                                    coroutineSingletons6 = coroutineSingletons6;
                                                    List list12 = list;
                                                    obj6 = objB6;
                                                    list2 = list12;
                                                    String str116 = str3;
                                                    chaloTextUIState6 = chaloTextUIState5;
                                                    str5 = str116;
                                                    str4 = (String) obj6;
                                                    TextUIState.ChaloTextUIState chaloTextUIState116 = chaloTextUIState6;
                                                    str3 = str5;
                                                    chaloTextUIState5 = chaloTextUIState116;
                                                }
                                            } else {
                                                coroutineSingletons6 = coroutineSingletons6;
                                                list2 = list;
                                                str4 = null;
                                            }
                                            MTicketTripInfoUIStateFactory mTicketTripInfoUIStateFactory110 = mTicketTripInfoUIStateFactory;
                                            wg0 wg0Var19 = new wg0(function7, 4);
                                            mTicketTripInfoUIStateFactory110.getClass();
                                            routeSelectionInputUIStateC = c(str, str3, list2, str4, wg0Var19);
                                            mTicketTripInfoUIStateFactory$convertToUIState$1.L$0 = mTicketTripInfoDataState8;
                                            mTicketTripInfoUIStateFactory$convertToUIState$1.L$1 = function7;
                                            mTicketTripInfoUIStateFactory$convertToUIState$1.L$2 = toolbarUIState6;
                                            mTicketTripInfoUIStateFactory$convertToUIState$1.L$3 = buttonUIState4;
                                            mTicketTripInfoUIStateFactory$convertToUIState$1.L$4 = chaloTextUIState5;
                                            mTicketTripInfoUIStateFactory$convertToUIState$1.L$5 = loadingDialogUIState2;
                                            mTicketTripInfoUIStateFactory$convertToUIState$1.L$6 = productBookingBranding2;
                                            mTicketTripInfoUIStateFactory$convertToUIState$1.L$7 = snackbarUIState2;
                                            mTicketTripInfoUIStateFactory$convertToUIState$1.L$8 = routeSelectionInputUIStateC;
                                            mTicketTripInfoUIStateFactory$convertToUIState$1.L$9 = this;
                                            mTicketTripInfoUIStateFactory$convertToUIState$1.L$10 = null;
                                            mTicketTripInfoUIStateFactory$convertToUIState$1.L$11 = null;
                                            mTicketTripInfoUIStateFactory$convertToUIState$1.label = 8;
                                            objB7 = stringProvider4.b(StringEnum.HINT_START_STOP, new Object[0], mTicketTripInfoUIStateFactory$convertToUIState$1);
                                            coroutineSingletons = coroutineSingletons6;
                                            if (objB7 == coroutineSingletons) {
                                                return coroutineSingletons;
                                            }
                                            SnackbarUIState snackbarUIState114 = snackbarUIState2;
                                            routeSelectionInputUIState = routeSelectionInputUIStateC;
                                            loadingDialogUIState3 = loadingDialogUIState2;
                                            productBookingBranding3 = productBookingBranding2;
                                            snackbarUIState3 = snackbarUIState114;
                                            ToolbarUIState toolbarUIState18 = toolbarUIState6;
                                            buttonUIState5 = buttonUIState4;
                                            function8 = function7;
                                            toolbarUIState7 = toolbarUIState18;
                                            mTicketTripInfoUIStateFactory2 = this;
                                            str6 = (String) objB7;
                                            productBookingStopDetails = mTicketTripInfoDataState8.c;
                                            if (productBookingStopDetails != null) {
                                                str7 = str2;
                                            } else {
                                                str7 = str2;
                                            }
                                            list3 = EmptyList.f17557a;
                                            coroutineSingletons2 = coroutineSingletons;
                                            if (mTicketTripInfoDataState8.i == MTicketTripInfoMissingFieldError.FROM_STOP) {
                                                mTicketTripInfoUIStateFactory$convertToUIState$1.L$0 = mTicketTripInfoDataState8;
                                                mTicketTripInfoUIStateFactory$convertToUIState$1.L$1 = function8;
                                                mTicketTripInfoUIStateFactory$convertToUIState$1.L$2 = toolbarUIState7;
                                                mTicketTripInfoUIStateFactory$convertToUIState$1.L$3 = buttonUIState5;
                                                mTicketTripInfoUIStateFactory$convertToUIState$1.L$4 = chaloTextUIState5;
                                                mTicketTripInfoUIStateFactory$convertToUIState$1.L$5 = loadingDialogUIState3;
                                                mTicketTripInfoUIStateFactory$convertToUIState$1.L$6 = productBookingBranding3;
                                                mTicketTripInfoUIStateFactory$convertToUIState$1.L$7 = snackbarUIState3;
                                                mTicketTripInfoUIStateFactory$convertToUIState$1.L$8 = routeSelectionInputUIState;
                                                mTicketTripInfoUIStateFactory$convertToUIState$1.L$9 = mTicketTripInfoUIStateFactory2;
                                                mTicketTripInfoUIStateFactory$convertToUIState$1.L$10 = str6;
                                                mTicketTripInfoUIStateFactory$convertToUIState$1.L$11 = str7;
                                                mTicketTripInfoUIStateFactory$convertToUIState$1.L$12 = list3;
                                                mTicketTripInfoUIStateFactory$convertToUIState$1.label = 9;
                                                loadingDialogUIState4 = loadingDialogUIState3;
                                                stringProvider = stringProvider4;
                                                objB8 = stringProvider.b(StringEnum.STATUS_ERROR_ENTER_STOP, new Object[0], mTicketTripInfoUIStateFactory$convertToUIState$1);
                                                coroutineSingletons3 = coroutineSingletons2;
                                                if (objB8 == coroutineSingletons3) {
                                                    return coroutineSingletons3;
                                                }
                                                TextUIState.ChaloTextUIState chaloTextUIState117 = chaloTextUIState5;
                                                str9 = str7;
                                                obj7 = objB8;
                                                chaloTextUIState7 = chaloTextUIState117;
                                                SnackbarUIState snackbarUIState115 = snackbarUIState3;
                                                routeSelectionInputUIState2 = routeSelectionInputUIState;
                                                toolbarUIState8 = toolbarUIState7;
                                                buttonUIState6 = buttonUIState5;
                                                function9 = function8;
                                                productBookingBranding4 = productBookingBranding3;
                                                snackbarUIState4 = snackbarUIState115;
                                                coroutineSingletons2 = coroutineSingletons3;
                                                mTicketTripInfoUIStateFactory3 = mTicketTripInfoUIStateFactory2;
                                                str8 = (String) obj7;
                                            } else {
                                                loadingDialogUIState4 = loadingDialogUIState3;
                                                stringProvider = stringProvider4;
                                                SnackbarUIState snackbarUIState116 = snackbarUIState3;
                                                routeSelectionInputUIState2 = routeSelectionInputUIState;
                                                toolbarUIState8 = toolbarUIState7;
                                                buttonUIState6 = buttonUIState5;
                                                function9 = function8;
                                                productBookingBranding4 = productBookingBranding3;
                                                snackbarUIState4 = snackbarUIState116;
                                                chaloTextUIState7 = chaloTextUIState5;
                                                mTicketTripInfoUIStateFactory3 = mTicketTripInfoUIStateFactory2;
                                                str8 = null;
                                                str9 = str7;
                                            }
                                            loadingDialogUIState5 = loadingDialogUIState4;
                                            StringProvider stringProvider11 = stringProvider;
                                            wg0 wg0Var110 = new wg0(function9, 5);
                                            mTicketTripInfoUIStateFactory3.getClass();
                                            routeSelectionInputUIStateC2 = c(str6, str9, list3, str8, wg0Var110);
                                            mTicketTripInfoUIStateFactory$convertToUIState$1.L$0 = mTicketTripInfoDataState8;
                                            mTicketTripInfoUIStateFactory$convertToUIState$1.L$1 = function9;
                                            mTicketTripInfoUIStateFactory$convertToUIState$1.L$2 = toolbarUIState8;
                                            mTicketTripInfoUIStateFactory$convertToUIState$1.L$3 = buttonUIState6;
                                            mTicketTripInfoUIStateFactory$convertToUIState$1.L$4 = chaloTextUIState7;
                                            mTicketTripInfoUIStateFactory$convertToUIState$1.L$5 = loadingDialogUIState5;
                                            mTicketTripInfoUIStateFactory$convertToUIState$1.L$6 = productBookingBranding4;
                                            mTicketTripInfoUIStateFactory$convertToUIState$1.L$7 = snackbarUIState4;
                                            mTicketTripInfoUIStateFactory$convertToUIState$1.L$8 = routeSelectionInputUIState2;
                                            mTicketTripInfoUIStateFactory$convertToUIState$1.L$9 = routeSelectionInputUIStateC2;
                                            mTicketTripInfoUIStateFactory$convertToUIState$1.L$10 = this;
                                            mTicketTripInfoUIStateFactory$convertToUIState$1.L$11 = null;
                                            mTicketTripInfoUIStateFactory$convertToUIState$1.L$12 = null;
                                            mTicketTripInfoUIStateFactory$convertToUIState$1.label = 10;
                                            stringProvider2 = stringProvider11;
                                            objB9 = stringProvider2.b(StringEnum.HINT_END_STOP, new Object[0], mTicketTripInfoUIStateFactory$convertToUIState$1);
                                            coroutineSingletons4 = coroutineSingletons2;
                                            if (objB9 == coroutineSingletons4) {
                                                return coroutineSingletons4;
                                            }
                                            loadingDialogUIState6 = loadingDialogUIState5;
                                            obj8 = objB9;
                                            toolbarUIState9 = toolbarUIState8;
                                            routeSelectionInputUIState3 = routeSelectionInputUIStateC2;
                                            mTicketTripInfoUIStateFactory4 = this;
                                            str10 = (String) obj8;
                                            productBookingStopDetails2 = mTicketTripInfoDataState8.d;
                                            if (productBookingStopDetails2 != null) {
                                                str11 = str2;
                                            } else {
                                                str11 = str2;
                                            }
                                            coroutineSingletons5 = coroutineSingletons4;
                                            list4 = EmptyList.f17557a;
                                            stringProvider3 = stringProvider2;
                                            if (mTicketTripInfoDataState8.i == MTicketTripInfoMissingFieldError.TO_STOP) {
                                                mTicketTripInfoUIStateFactory$convertToUIState$1.L$0 = function9;
                                                mTicketTripInfoUIStateFactory$convertToUIState$1.L$1 = toolbarUIState9;
                                                mTicketTripInfoUIStateFactory$convertToUIState$1.L$2 = buttonUIState6;
                                                mTicketTripInfoUIStateFactory$convertToUIState$1.L$3 = chaloTextUIState7;
                                                mTicketTripInfoUIStateFactory$convertToUIState$1.L$4 = loadingDialogUIState6;
                                                mTicketTripInfoUIStateFactory$convertToUIState$1.L$5 = productBookingBranding4;
                                                mTicketTripInfoUIStateFactory$convertToUIState$1.L$6 = snackbarUIState4;
                                                mTicketTripInfoUIStateFactory$convertToUIState$1.L$7 = routeSelectionInputUIState2;
                                                mTicketTripInfoUIStateFactory$convertToUIState$1.L$8 = routeSelectionInputUIState3;
                                                mTicketTripInfoUIStateFactory$convertToUIState$1.L$9 = mTicketTripInfoUIStateFactory4;
                                                mTicketTripInfoUIStateFactory$convertToUIState$1.L$10 = str10;
                                                mTicketTripInfoUIStateFactory$convertToUIState$1.L$11 = str11;
                                                mTicketTripInfoUIStateFactory$convertToUIState$1.L$12 = list4;
                                                mTicketTripInfoUIStateFactory6 = mTicketTripInfoUIStateFactory4;
                                                mTicketTripInfoUIStateFactory$convertToUIState$1.label = 11;
                                                objB10 = stringProvider3.b(StringEnum.STATUS_ERROR_ENTER_STOP, new Object[0], mTicketTripInfoUIStateFactory$convertToUIState$1);
                                                if (objB10 == coroutineSingletons5) {
                                                    return coroutineSingletons5;
                                                }
                                                chaloTextUIState9 = chaloTextUIState7;
                                                routeSelectionInputUIState6 = routeSelectionInputUIState2;
                                                productBookingBranding6 = productBookingBranding4;
                                                function10 = function9;
                                                buttonUIState7 = buttonUIState6;
                                                str13 = str10;
                                                toolbarUIState11 = toolbarUIState9;
                                                routeSelectionInputUIState7 = routeSelectionInputUIState3;
                                                snackbarUIState5 = snackbarUIState4;
                                                obj9 = objB10;
                                                loadingDialogUIState8 = loadingDialogUIState6;
                                                list5 = list4;
                                                mTicketTripInfoUIStateFactory7 = mTicketTripInfoUIStateFactory6;
                                                String str117 = (String) obj9;
                                                Function1 function17 = function10;
                                                str12 = str117;
                                                mTicketTripInfoUIStateFactory5 = mTicketTripInfoUIStateFactory7;
                                                list4 = list5;
                                                toolbarUIState10 = toolbarUIState11;
                                                function9 = function17;
                                                LoadingDialogUIState loadingDialogUIState15 = loadingDialogUIState8;
                                                snackbarUIState4 = snackbarUIState5;
                                                productBookingBranding5 = productBookingBranding6;
                                                loadingDialogUIState7 = loadingDialogUIState15;
                                                str10 = str13;
                                                routeSelectionInputUIState5 = routeSelectionInputUIState7;
                                                routeSelectionInputUIState4 = routeSelectionInputUIState6;
                                                chaloTextUIState8 = chaloTextUIState9;
                                                buttonUIState6 = buttonUIState7;
                                            } else {
                                                MTicketTripInfoUIStateFactory mTicketTripInfoUIStateFactory111 = mTicketTripInfoUIStateFactory4;
                                                RouteSelectionInputUIState routeSelectionInputUIState14 = routeSelectionInputUIState2;
                                                loadingDialogUIState7 = loadingDialogUIState6;
                                                toolbarUIState10 = toolbarUIState9;
                                                routeSelectionInputUIState4 = routeSelectionInputUIState14;
                                                chaloTextUIState8 = chaloTextUIState7;
                                                routeSelectionInputUIState5 = routeSelectionInputUIState3;
                                                productBookingBranding5 = productBookingBranding4;
                                                mTicketTripInfoUIStateFactory5 = mTicketTripInfoUIStateFactory111;
                                                str12 = null;
                                            }
                                            wg0 wg0Var111 = new wg0(function9, 6);
                                            mTicketTripInfoUIStateFactory5.getClass();
                                            return new MTicketTripInfoUIState(toolbarUIState10, routeSelectionInputUIState4, routeSelectionInputUIState5, c(str10, str11, list4, str12, wg0Var111), buttonUIState6, chaloTextUIState8, productBookingBranding5, loadingDialogUIState7, snackbarUIState4);
                                        }
                                    }
                                } else {
                                    mTicketTripInfoDataState8 = mTicketTripInfoDataState7;
                                    function6 = function5;
                                    toolbarUIState5 = toolbarUIState4;
                                    buttonUIState3 = buttonUIState2;
                                    chaloTextUIState4 = chaloTextUIState2;
                                    loadingDialogUIState = loadingDialogUIStateA;
                                    snackbarUIState = null;
                                    mTicketTripInfoUIStateFactory$convertToUIState$1.L$0 = mTicketTripInfoDataState8;
                                    mTicketTripInfoUIStateFactory$convertToUIState$1.L$1 = function6;
                                    mTicketTripInfoUIStateFactory$convertToUIState$1.L$2 = toolbarUIState5;
                                    mTicketTripInfoUIStateFactory$convertToUIState$1.L$3 = buttonUIState3;
                                    mTicketTripInfoUIStateFactory$convertToUIState$1.L$4 = chaloTextUIState4;
                                    mTicketTripInfoUIStateFactory$convertToUIState$1.L$5 = loadingDialogUIState;
                                    mTicketTripInfoUIStateFactory$convertToUIState$1.L$6 = productBookingBranding;
                                    mTicketTripInfoUIStateFactory$convertToUIState$1.L$7 = snackbarUIState;
                                    mTicketTripInfoUIStateFactory$convertToUIState$1.L$8 = this;
                                    mTicketTripInfoUIStateFactory$convertToUIState$1.label = 6;
                                    objB5 = stringProvider4.b(StringEnum.HINT_ROUTE_NUMBER, new Object[0], mTicketTripInfoUIStateFactory$convertToUIState$1);
                                    if (objB5 != coroutineSingletons6) {
                                        ButtonUIState buttonUIState15 = buttonUIState3;
                                        snackbarUIState2 = snackbarUIState;
                                        obj5 = objB5;
                                        buttonUIState4 = buttonUIState15;
                                        toolbarUIState6 = toolbarUIState5;
                                        function7 = function6;
                                        productBookingBranding2 = productBookingBranding;
                                        loadingDialogUIState2 = loadingDialogUIState;
                                        chaloTextUIState5 = chaloTextUIState4;
                                        mTicketTripInfoUIStateFactory = this;
                                        str = (String) obj5;
                                        productBookingRouteDetails = mTicketTripInfoDataState8.b;
                                        str2 = "";
                                        if (productBookingRouteDetails != null) {
                                            str3 = str2;
                                        } else {
                                            str3 = str2;
                                        }
                                        if (productBookingRouteDetails != null) {
                                            list = EmptyList.f17557a;
                                        } else {
                                            list = EmptyList.f17557a;
                                        }
                                        if (mTicketTripInfoDataState8.i == MTicketTripInfoMissingFieldError.ROUTE) {
                                            mTicketTripInfoUIStateFactory$convertToUIState$1.L$0 = mTicketTripInfoDataState8;
                                            mTicketTripInfoUIStateFactory$convertToUIState$1.L$1 = function7;
                                            mTicketTripInfoUIStateFactory$convertToUIState$1.L$2 = toolbarUIState6;
                                            mTicketTripInfoUIStateFactory$convertToUIState$1.L$3 = buttonUIState4;
                                            mTicketTripInfoUIStateFactory$convertToUIState$1.L$4 = chaloTextUIState5;
                                            mTicketTripInfoUIStateFactory$convertToUIState$1.L$5 = loadingDialogUIState2;
                                            mTicketTripInfoUIStateFactory$convertToUIState$1.L$6 = productBookingBranding2;
                                            mTicketTripInfoUIStateFactory$convertToUIState$1.L$7 = snackbarUIState2;
                                            mTicketTripInfoUIStateFactory$convertToUIState$1.L$8 = mTicketTripInfoUIStateFactory;
                                            mTicketTripInfoUIStateFactory$convertToUIState$1.L$9 = str;
                                            mTicketTripInfoUIStateFactory$convertToUIState$1.L$10 = str3;
                                            mTicketTripInfoUIStateFactory$convertToUIState$1.L$11 = list;
                                            mTicketTripInfoUIStateFactory$convertToUIState$1.label = 7;
                                            objB6 = stringProvider4.b(StringEnum.STATUS_ERROR_ROUTE_NUMBER, new Object[0], mTicketTripInfoUIStateFactory$convertToUIState$1);
                                            if (objB6 != coroutineSingletons6) {
                                                coroutineSingletons6 = coroutineSingletons6;
                                                List list13 = list;
                                                obj6 = objB6;
                                                list2 = list13;
                                                String str118 = str3;
                                                chaloTextUIState6 = chaloTextUIState5;
                                                str5 = str118;
                                                str4 = (String) obj6;
                                                TextUIState.ChaloTextUIState chaloTextUIState118 = chaloTextUIState6;
                                                str3 = str5;
                                                chaloTextUIState5 = chaloTextUIState118;
                                            }
                                        } else {
                                            coroutineSingletons6 = coroutineSingletons6;
                                            list2 = list;
                                            str4 = null;
                                        }
                                        MTicketTripInfoUIStateFactory mTicketTripInfoUIStateFactory112 = mTicketTripInfoUIStateFactory;
                                        wg0 wg0Var112 = new wg0(function7, 4);
                                        mTicketTripInfoUIStateFactory112.getClass();
                                        routeSelectionInputUIStateC = c(str, str3, list2, str4, wg0Var112);
                                        mTicketTripInfoUIStateFactory$convertToUIState$1.L$0 = mTicketTripInfoDataState8;
                                        mTicketTripInfoUIStateFactory$convertToUIState$1.L$1 = function7;
                                        mTicketTripInfoUIStateFactory$convertToUIState$1.L$2 = toolbarUIState6;
                                        mTicketTripInfoUIStateFactory$convertToUIState$1.L$3 = buttonUIState4;
                                        mTicketTripInfoUIStateFactory$convertToUIState$1.L$4 = chaloTextUIState5;
                                        mTicketTripInfoUIStateFactory$convertToUIState$1.L$5 = loadingDialogUIState2;
                                        mTicketTripInfoUIStateFactory$convertToUIState$1.L$6 = productBookingBranding2;
                                        mTicketTripInfoUIStateFactory$convertToUIState$1.L$7 = snackbarUIState2;
                                        mTicketTripInfoUIStateFactory$convertToUIState$1.L$8 = routeSelectionInputUIStateC;
                                        mTicketTripInfoUIStateFactory$convertToUIState$1.L$9 = this;
                                        mTicketTripInfoUIStateFactory$convertToUIState$1.L$10 = null;
                                        mTicketTripInfoUIStateFactory$convertToUIState$1.L$11 = null;
                                        mTicketTripInfoUIStateFactory$convertToUIState$1.label = 8;
                                        objB7 = stringProvider4.b(StringEnum.HINT_START_STOP, new Object[0], mTicketTripInfoUIStateFactory$convertToUIState$1);
                                        coroutineSingletons = coroutineSingletons6;
                                        if (objB7 == coroutineSingletons) {
                                            return coroutineSingletons;
                                        }
                                        SnackbarUIState snackbarUIState117 = snackbarUIState2;
                                        routeSelectionInputUIState = routeSelectionInputUIStateC;
                                        loadingDialogUIState3 = loadingDialogUIState2;
                                        productBookingBranding3 = productBookingBranding2;
                                        snackbarUIState3 = snackbarUIState117;
                                        ToolbarUIState toolbarUIState19 = toolbarUIState6;
                                        buttonUIState5 = buttonUIState4;
                                        function8 = function7;
                                        toolbarUIState7 = toolbarUIState19;
                                        mTicketTripInfoUIStateFactory2 = this;
                                        str6 = (String) objB7;
                                        productBookingStopDetails = mTicketTripInfoDataState8.c;
                                        if (productBookingStopDetails != null) {
                                            str7 = str2;
                                        } else {
                                            str7 = str2;
                                        }
                                        list3 = EmptyList.f17557a;
                                        coroutineSingletons2 = coroutineSingletons;
                                        if (mTicketTripInfoDataState8.i == MTicketTripInfoMissingFieldError.FROM_STOP) {
                                            mTicketTripInfoUIStateFactory$convertToUIState$1.L$0 = mTicketTripInfoDataState8;
                                            mTicketTripInfoUIStateFactory$convertToUIState$1.L$1 = function8;
                                            mTicketTripInfoUIStateFactory$convertToUIState$1.L$2 = toolbarUIState7;
                                            mTicketTripInfoUIStateFactory$convertToUIState$1.L$3 = buttonUIState5;
                                            mTicketTripInfoUIStateFactory$convertToUIState$1.L$4 = chaloTextUIState5;
                                            mTicketTripInfoUIStateFactory$convertToUIState$1.L$5 = loadingDialogUIState3;
                                            mTicketTripInfoUIStateFactory$convertToUIState$1.L$6 = productBookingBranding3;
                                            mTicketTripInfoUIStateFactory$convertToUIState$1.L$7 = snackbarUIState3;
                                            mTicketTripInfoUIStateFactory$convertToUIState$1.L$8 = routeSelectionInputUIState;
                                            mTicketTripInfoUIStateFactory$convertToUIState$1.L$9 = mTicketTripInfoUIStateFactory2;
                                            mTicketTripInfoUIStateFactory$convertToUIState$1.L$10 = str6;
                                            mTicketTripInfoUIStateFactory$convertToUIState$1.L$11 = str7;
                                            mTicketTripInfoUIStateFactory$convertToUIState$1.L$12 = list3;
                                            mTicketTripInfoUIStateFactory$convertToUIState$1.label = 9;
                                            loadingDialogUIState4 = loadingDialogUIState3;
                                            stringProvider = stringProvider4;
                                            objB8 = stringProvider.b(StringEnum.STATUS_ERROR_ENTER_STOP, new Object[0], mTicketTripInfoUIStateFactory$convertToUIState$1);
                                            coroutineSingletons3 = coroutineSingletons2;
                                            if (objB8 == coroutineSingletons3) {
                                                return coroutineSingletons3;
                                            }
                                            TextUIState.ChaloTextUIState chaloTextUIState119 = chaloTextUIState5;
                                            str9 = str7;
                                            obj7 = objB8;
                                            chaloTextUIState7 = chaloTextUIState119;
                                            SnackbarUIState snackbarUIState118 = snackbarUIState3;
                                            routeSelectionInputUIState2 = routeSelectionInputUIState;
                                            toolbarUIState8 = toolbarUIState7;
                                            buttonUIState6 = buttonUIState5;
                                            function9 = function8;
                                            productBookingBranding4 = productBookingBranding3;
                                            snackbarUIState4 = snackbarUIState118;
                                            coroutineSingletons2 = coroutineSingletons3;
                                            mTicketTripInfoUIStateFactory3 = mTicketTripInfoUIStateFactory2;
                                            str8 = (String) obj7;
                                        } else {
                                            loadingDialogUIState4 = loadingDialogUIState3;
                                            stringProvider = stringProvider4;
                                            SnackbarUIState snackbarUIState119 = snackbarUIState3;
                                            routeSelectionInputUIState2 = routeSelectionInputUIState;
                                            toolbarUIState8 = toolbarUIState7;
                                            buttonUIState6 = buttonUIState5;
                                            function9 = function8;
                                            productBookingBranding4 = productBookingBranding3;
                                            snackbarUIState4 = snackbarUIState119;
                                            chaloTextUIState7 = chaloTextUIState5;
                                            mTicketTripInfoUIStateFactory3 = mTicketTripInfoUIStateFactory2;
                                            str8 = null;
                                            str9 = str7;
                                        }
                                        loadingDialogUIState5 = loadingDialogUIState4;
                                        StringProvider stringProvider12 = stringProvider;
                                        wg0 wg0Var113 = new wg0(function9, 5);
                                        mTicketTripInfoUIStateFactory3.getClass();
                                        routeSelectionInputUIStateC2 = c(str6, str9, list3, str8, wg0Var113);
                                        mTicketTripInfoUIStateFactory$convertToUIState$1.L$0 = mTicketTripInfoDataState8;
                                        mTicketTripInfoUIStateFactory$convertToUIState$1.L$1 = function9;
                                        mTicketTripInfoUIStateFactory$convertToUIState$1.L$2 = toolbarUIState8;
                                        mTicketTripInfoUIStateFactory$convertToUIState$1.L$3 = buttonUIState6;
                                        mTicketTripInfoUIStateFactory$convertToUIState$1.L$4 = chaloTextUIState7;
                                        mTicketTripInfoUIStateFactory$convertToUIState$1.L$5 = loadingDialogUIState5;
                                        mTicketTripInfoUIStateFactory$convertToUIState$1.L$6 = productBookingBranding4;
                                        mTicketTripInfoUIStateFactory$convertToUIState$1.L$7 = snackbarUIState4;
                                        mTicketTripInfoUIStateFactory$convertToUIState$1.L$8 = routeSelectionInputUIState2;
                                        mTicketTripInfoUIStateFactory$convertToUIState$1.L$9 = routeSelectionInputUIStateC2;
                                        mTicketTripInfoUIStateFactory$convertToUIState$1.L$10 = this;
                                        mTicketTripInfoUIStateFactory$convertToUIState$1.L$11 = null;
                                        mTicketTripInfoUIStateFactory$convertToUIState$1.L$12 = null;
                                        mTicketTripInfoUIStateFactory$convertToUIState$1.label = 10;
                                        stringProvider2 = stringProvider12;
                                        objB9 = stringProvider2.b(StringEnum.HINT_END_STOP, new Object[0], mTicketTripInfoUIStateFactory$convertToUIState$1);
                                        coroutineSingletons4 = coroutineSingletons2;
                                        if (objB9 == coroutineSingletons4) {
                                            return coroutineSingletons4;
                                        }
                                        loadingDialogUIState6 = loadingDialogUIState5;
                                        obj8 = objB9;
                                        toolbarUIState9 = toolbarUIState8;
                                        routeSelectionInputUIState3 = routeSelectionInputUIStateC2;
                                        mTicketTripInfoUIStateFactory4 = this;
                                        str10 = (String) obj8;
                                        productBookingStopDetails2 = mTicketTripInfoDataState8.d;
                                        if (productBookingStopDetails2 != null) {
                                            str11 = str2;
                                        } else {
                                            str11 = str2;
                                        }
                                        coroutineSingletons5 = coroutineSingletons4;
                                        list4 = EmptyList.f17557a;
                                        stringProvider3 = stringProvider2;
                                        if (mTicketTripInfoDataState8.i == MTicketTripInfoMissingFieldError.TO_STOP) {
                                            mTicketTripInfoUIStateFactory$convertToUIState$1.L$0 = function9;
                                            mTicketTripInfoUIStateFactory$convertToUIState$1.L$1 = toolbarUIState9;
                                            mTicketTripInfoUIStateFactory$convertToUIState$1.L$2 = buttonUIState6;
                                            mTicketTripInfoUIStateFactory$convertToUIState$1.L$3 = chaloTextUIState7;
                                            mTicketTripInfoUIStateFactory$convertToUIState$1.L$4 = loadingDialogUIState6;
                                            mTicketTripInfoUIStateFactory$convertToUIState$1.L$5 = productBookingBranding4;
                                            mTicketTripInfoUIStateFactory$convertToUIState$1.L$6 = snackbarUIState4;
                                            mTicketTripInfoUIStateFactory$convertToUIState$1.L$7 = routeSelectionInputUIState2;
                                            mTicketTripInfoUIStateFactory$convertToUIState$1.L$8 = routeSelectionInputUIState3;
                                            mTicketTripInfoUIStateFactory$convertToUIState$1.L$9 = mTicketTripInfoUIStateFactory4;
                                            mTicketTripInfoUIStateFactory$convertToUIState$1.L$10 = str10;
                                            mTicketTripInfoUIStateFactory$convertToUIState$1.L$11 = str11;
                                            mTicketTripInfoUIStateFactory$convertToUIState$1.L$12 = list4;
                                            mTicketTripInfoUIStateFactory6 = mTicketTripInfoUIStateFactory4;
                                            mTicketTripInfoUIStateFactory$convertToUIState$1.label = 11;
                                            objB10 = stringProvider3.b(StringEnum.STATUS_ERROR_ENTER_STOP, new Object[0], mTicketTripInfoUIStateFactory$convertToUIState$1);
                                            if (objB10 == coroutineSingletons5) {
                                                return coroutineSingletons5;
                                            }
                                            chaloTextUIState9 = chaloTextUIState7;
                                            routeSelectionInputUIState6 = routeSelectionInputUIState2;
                                            productBookingBranding6 = productBookingBranding4;
                                            function10 = function9;
                                            buttonUIState7 = buttonUIState6;
                                            str13 = str10;
                                            toolbarUIState11 = toolbarUIState9;
                                            routeSelectionInputUIState7 = routeSelectionInputUIState3;
                                            snackbarUIState5 = snackbarUIState4;
                                            obj9 = objB10;
                                            loadingDialogUIState8 = loadingDialogUIState6;
                                            list5 = list4;
                                            mTicketTripInfoUIStateFactory7 = mTicketTripInfoUIStateFactory6;
                                            String str119 = (String) obj9;
                                            Function1 function18 = function10;
                                            str12 = str119;
                                            mTicketTripInfoUIStateFactory5 = mTicketTripInfoUIStateFactory7;
                                            list4 = list5;
                                            toolbarUIState10 = toolbarUIState11;
                                            function9 = function18;
                                            LoadingDialogUIState loadingDialogUIState16 = loadingDialogUIState8;
                                            snackbarUIState4 = snackbarUIState5;
                                            productBookingBranding5 = productBookingBranding6;
                                            loadingDialogUIState7 = loadingDialogUIState16;
                                            str10 = str13;
                                            routeSelectionInputUIState5 = routeSelectionInputUIState7;
                                            routeSelectionInputUIState4 = routeSelectionInputUIState6;
                                            chaloTextUIState8 = chaloTextUIState9;
                                            buttonUIState6 = buttonUIState7;
                                        } else {
                                            MTicketTripInfoUIStateFactory mTicketTripInfoUIStateFactory113 = mTicketTripInfoUIStateFactory4;
                                            RouteSelectionInputUIState routeSelectionInputUIState15 = routeSelectionInputUIState2;
                                            loadingDialogUIState7 = loadingDialogUIState6;
                                            toolbarUIState10 = toolbarUIState9;
                                            routeSelectionInputUIState4 = routeSelectionInputUIState15;
                                            chaloTextUIState8 = chaloTextUIState7;
                                            routeSelectionInputUIState5 = routeSelectionInputUIState3;
                                            productBookingBranding5 = productBookingBranding4;
                                            mTicketTripInfoUIStateFactory5 = mTicketTripInfoUIStateFactory113;
                                            str12 = null;
                                        }
                                        wg0 wg0Var114 = new wg0(function9, 6);
                                        mTicketTripInfoUIStateFactory5.getClass();
                                        return new MTicketTripInfoUIState(toolbarUIState10, routeSelectionInputUIState4, routeSelectionInputUIState5, c(str10, str11, list4, str12, wg0Var114), buttonUIState6, chaloTextUIState8, productBookingBranding5, loadingDialogUIState7, snackbarUIState4);
                                    }
                                }
                            }
                        }
                    }
                }
                coroutineSingletons6 = coroutineSingletons6;
                return coroutineSingletons6;
            case 1:
                ToolbarUIStateFactory toolbarUIStateFactory2 = (ToolbarUIStateFactory) mTicketTripInfoUIStateFactory$convertToUIState$1.L$2;
                Function1 function19 = (Function1) mTicketTripInfoUIStateFactory$convertToUIState$1.L$1;
                MTicketTripInfoDataState mTicketTripInfoDataState10 = (MTicketTripInfoDataState) mTicketTripInfoUIStateFactory$convertToUIState$1.L$0;
                ResultKt.b(obj9);
                toolbarUIStateFactory = toolbarUIStateFactory2;
                function2 = function19;
                mTicketTripInfoDataState2 = mTicketTripInfoDataState10;
                objB = obj9;
                toolbarUIState = new ToolbarUIState(null, ToolbarUIStateFactory.a(toolbarUIStateFactory, (String) objB, 12), null, null, null, 0.0f, null, null, 253);
                mTicketTripInfoUIStateFactory$convertToUIState$1.L$0 = mTicketTripInfoDataState2;
                mTicketTripInfoUIStateFactory$convertToUIState$1.L$1 = function2;
                mTicketTripInfoUIStateFactory$convertToUIState$1.L$2 = toolbarUIState;
                buttonUIStateFactory = ButtonUIStateFactory.f9921a;
                mTicketTripInfoUIStateFactory$convertToUIState$1.L$3 = buttonUIStateFactory;
                mTicketTripInfoUIStateFactory$convertToUIState$1.label = 2;
                objB2 = stringProvider4.b(StringEnum.BTN_TXT_MTICKET_NEXT, new Object[0], mTicketTripInfoUIStateFactory$convertToUIState$1);
                if (objB2 != coroutineSingletons6) {
                    MTicketTripInfoDataState mTicketTripInfoDataState11 = mTicketTripInfoDataState2;
                    toolbarUIState2 = toolbarUIState;
                    obj = objB2;
                    function3 = function2;
                    buttonUIStateFactory2 = buttonUIStateFactory;
                    mTicketTripInfoDataState3 = mTicketTripInfoDataState11;
                    mTicketTripInfoDataState4 = mTicketTripInfoDataState3;
                    buttonUIStateG = ButtonUIStateFactory.g(buttonUIStateFactory2, (String) obj, new wg0(function3, 2), null, null, false, ChaloThemeHelper.a().p, 28);
                    bool = mTicketTripInfoDataState4.h;
                    if (bool != null) {
                        boolean zBooleanValue2 = bool.booleanValue();
                        mTicketTripInfoUIStateFactory$convertToUIState$1.L$0 = mTicketTripInfoDataState4;
                        mTicketTripInfoUIStateFactory$convertToUIState$1.L$1 = function3;
                        mTicketTripInfoUIStateFactory$convertToUIState$1.L$2 = toolbarUIState2;
                        mTicketTripInfoUIStateFactory$convertToUIState$1.L$3 = buttonUIStateG;
                        mTicketTripInfoUIStateFactory$convertToUIState$1.label = 3;
                        objB3 = b(zBooleanValue2, mTicketTripInfoUIStateFactory$convertToUIState$1);
                        if (objB3 != coroutineSingletons6) {
                            mTicketTripInfoDataState6 = mTicketTripInfoDataState4;
                            obj2 = objB3;
                            mTicketTripInfoDataState5 = mTicketTripInfoDataState6;
                            chaloTextUIState = new TextUIState.ChaloTextUIState((String) obj2, UITextStyle.BodyMedium, ChaloColorToken.Black_60.f9766a, 0, UITextAlign.Center, (UIFontWeight) null, (Integer) null, UiEventHandler.Companion.a(new wg0(function3, 3)), (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 7896);
                            function4 = function3;
                            buttonUIState = buttonUIStateG;
                            toolbarUIState3 = toolbarUIState2;
                            if (mTicketTripInfoDataState5.f) {
                                mTicketTripInfoUIStateFactory$convertToUIState$1.L$0 = mTicketTripInfoDataState5;
                                mTicketTripInfoUIStateFactory$convertToUIState$1.L$1 = function4;
                                mTicketTripInfoUIStateFactory$convertToUIState$1.L$2 = toolbarUIState3;
                                mTicketTripInfoUIStateFactory$convertToUIState$1.L$3 = buttonUIState;
                                mTicketTripInfoUIStateFactory$convertToUIState$1.L$4 = chaloTextUIState;
                                dialogUIStateFactory = DialogUIStateFactory.f9989a;
                                mTicketTripInfoUIStateFactory$convertToUIState$1.L$5 = dialogUIStateFactory;
                                mTicketTripInfoUIStateFactory$convertToUIState$1.label = 4;
                                objB4 = stringProvider4.b(StringEnum.LOADING, new Object[0], mTicketTripInfoUIStateFactory$convertToUIState$1);
                                if (objB4 != coroutineSingletons6) {
                                    obj3 = objB4;
                                    chaloTextUIState3 = chaloTextUIState;
                                    dialogUIStateFactory2 = dialogUIStateFactory;
                                    dialogUIStateFactory2.getClass();
                                    loadingDialogUIStateA = DialogUIStateFactory.a((String) obj3);
                                    mTicketTripInfoDataState7 = mTicketTripInfoDataState5;
                                    function5 = function4;
                                    toolbarUIState4 = toolbarUIState3;
                                    buttonUIState2 = buttonUIState;
                                    chaloTextUIState2 = chaloTextUIState3;
                                    productBookingBranding = mTicketTripInfoDataState7.g;
                                    mTicketTripInfoSnackBarType = mTicketTripInfoDataState7.e;
                                    if (mTicketTripInfoSnackBarType != null) {
                                        mTicketTripInfoUIStateFactory$convertToUIState$1.L$0 = mTicketTripInfoDataState7;
                                        mTicketTripInfoUIStateFactory$convertToUIState$1.L$1 = function5;
                                        mTicketTripInfoUIStateFactory$convertToUIState$1.L$2 = toolbarUIState4;
                                        mTicketTripInfoUIStateFactory$convertToUIState$1.L$3 = buttonUIState2;
                                        mTicketTripInfoUIStateFactory$convertToUIState$1.L$4 = chaloTextUIState2;
                                        mTicketTripInfoUIStateFactory$convertToUIState$1.L$5 = loadingDialogUIStateA;
                                        mTicketTripInfoUIStateFactory$convertToUIState$1.L$6 = productBookingBranding;
                                        mTicketTripInfoUIStateFactory$convertToUIState$1.label = 5;
                                        objD = d(mTicketTripInfoSnackBarType, function5, mTicketTripInfoUIStateFactory$convertToUIState$1);
                                        if (objD != coroutineSingletons6) {
                                            TextUIState.ChaloTextUIState chaloTextUIState1110 = chaloTextUIState2;
                                            loadingDialogUIState = loadingDialogUIStateA;
                                            obj4 = objD;
                                            mTicketTripInfoDataState8 = mTicketTripInfoDataState7;
                                            function6 = function5;
                                            toolbarUIState5 = toolbarUIState4;
                                            buttonUIState3 = buttonUIState2;
                                            chaloTextUIState4 = chaloTextUIState1110;
                                            snackbarUIState = (SnackbarUIState) obj4;
                                            mTicketTripInfoUIStateFactory$convertToUIState$1.L$0 = mTicketTripInfoDataState8;
                                            mTicketTripInfoUIStateFactory$convertToUIState$1.L$1 = function6;
                                            mTicketTripInfoUIStateFactory$convertToUIState$1.L$2 = toolbarUIState5;
                                            mTicketTripInfoUIStateFactory$convertToUIState$1.L$3 = buttonUIState3;
                                            mTicketTripInfoUIStateFactory$convertToUIState$1.L$4 = chaloTextUIState4;
                                            mTicketTripInfoUIStateFactory$convertToUIState$1.L$5 = loadingDialogUIState;
                                            mTicketTripInfoUIStateFactory$convertToUIState$1.L$6 = productBookingBranding;
                                            mTicketTripInfoUIStateFactory$convertToUIState$1.L$7 = snackbarUIState;
                                            mTicketTripInfoUIStateFactory$convertToUIState$1.L$8 = this;
                                            mTicketTripInfoUIStateFactory$convertToUIState$1.label = 6;
                                            objB5 = stringProvider4.b(StringEnum.HINT_ROUTE_NUMBER, new Object[0], mTicketTripInfoUIStateFactory$convertToUIState$1);
                                            if (objB5 != coroutineSingletons6) {
                                                ButtonUIState buttonUIState16 = buttonUIState3;
                                                snackbarUIState2 = snackbarUIState;
                                                obj5 = objB5;
                                                buttonUIState4 = buttonUIState16;
                                                toolbarUIState6 = toolbarUIState5;
                                                function7 = function6;
                                                productBookingBranding2 = productBookingBranding;
                                                loadingDialogUIState2 = loadingDialogUIState;
                                                chaloTextUIState5 = chaloTextUIState4;
                                                mTicketTripInfoUIStateFactory = this;
                                                str = (String) obj5;
                                                productBookingRouteDetails = mTicketTripInfoDataState8.b;
                                                str2 = "";
                                                if (productBookingRouteDetails != null) {
                                                    str3 = str2;
                                                } else {
                                                    str3 = str2;
                                                }
                                                if (productBookingRouteDetails != null) {
                                                    list = EmptyList.f17557a;
                                                } else {
                                                    list = EmptyList.f17557a;
                                                }
                                                if (mTicketTripInfoDataState8.i == MTicketTripInfoMissingFieldError.ROUTE) {
                                                    mTicketTripInfoUIStateFactory$convertToUIState$1.L$0 = mTicketTripInfoDataState8;
                                                    mTicketTripInfoUIStateFactory$convertToUIState$1.L$1 = function7;
                                                    mTicketTripInfoUIStateFactory$convertToUIState$1.L$2 = toolbarUIState6;
                                                    mTicketTripInfoUIStateFactory$convertToUIState$1.L$3 = buttonUIState4;
                                                    mTicketTripInfoUIStateFactory$convertToUIState$1.L$4 = chaloTextUIState5;
                                                    mTicketTripInfoUIStateFactory$convertToUIState$1.L$5 = loadingDialogUIState2;
                                                    mTicketTripInfoUIStateFactory$convertToUIState$1.L$6 = productBookingBranding2;
                                                    mTicketTripInfoUIStateFactory$convertToUIState$1.L$7 = snackbarUIState2;
                                                    mTicketTripInfoUIStateFactory$convertToUIState$1.L$8 = mTicketTripInfoUIStateFactory;
                                                    mTicketTripInfoUIStateFactory$convertToUIState$1.L$9 = str;
                                                    mTicketTripInfoUIStateFactory$convertToUIState$1.L$10 = str3;
                                                    mTicketTripInfoUIStateFactory$convertToUIState$1.L$11 = list;
                                                    mTicketTripInfoUIStateFactory$convertToUIState$1.label = 7;
                                                    objB6 = stringProvider4.b(StringEnum.STATUS_ERROR_ROUTE_NUMBER, new Object[0], mTicketTripInfoUIStateFactory$convertToUIState$1);
                                                    if (objB6 != coroutineSingletons6) {
                                                        coroutineSingletons6 = coroutineSingletons6;
                                                        List list14 = list;
                                                        obj6 = objB6;
                                                        list2 = list14;
                                                        String str1110 = str3;
                                                        chaloTextUIState6 = chaloTextUIState5;
                                                        str5 = str1110;
                                                        str4 = (String) obj6;
                                                        TextUIState.ChaloTextUIState chaloTextUIState1111 = chaloTextUIState6;
                                                        str3 = str5;
                                                        chaloTextUIState5 = chaloTextUIState1111;
                                                    }
                                                } else {
                                                    coroutineSingletons6 = coroutineSingletons6;
                                                    list2 = list;
                                                    str4 = null;
                                                }
                                                MTicketTripInfoUIStateFactory mTicketTripInfoUIStateFactory114 = mTicketTripInfoUIStateFactory;
                                                wg0 wg0Var115 = new wg0(function7, 4);
                                                mTicketTripInfoUIStateFactory114.getClass();
                                                routeSelectionInputUIStateC = c(str, str3, list2, str4, wg0Var115);
                                                mTicketTripInfoUIStateFactory$convertToUIState$1.L$0 = mTicketTripInfoDataState8;
                                                mTicketTripInfoUIStateFactory$convertToUIState$1.L$1 = function7;
                                                mTicketTripInfoUIStateFactory$convertToUIState$1.L$2 = toolbarUIState6;
                                                mTicketTripInfoUIStateFactory$convertToUIState$1.L$3 = buttonUIState4;
                                                mTicketTripInfoUIStateFactory$convertToUIState$1.L$4 = chaloTextUIState5;
                                                mTicketTripInfoUIStateFactory$convertToUIState$1.L$5 = loadingDialogUIState2;
                                                mTicketTripInfoUIStateFactory$convertToUIState$1.L$6 = productBookingBranding2;
                                                mTicketTripInfoUIStateFactory$convertToUIState$1.L$7 = snackbarUIState2;
                                                mTicketTripInfoUIStateFactory$convertToUIState$1.L$8 = routeSelectionInputUIStateC;
                                                mTicketTripInfoUIStateFactory$convertToUIState$1.L$9 = this;
                                                mTicketTripInfoUIStateFactory$convertToUIState$1.L$10 = null;
                                                mTicketTripInfoUIStateFactory$convertToUIState$1.L$11 = null;
                                                mTicketTripInfoUIStateFactory$convertToUIState$1.label = 8;
                                                objB7 = stringProvider4.b(StringEnum.HINT_START_STOP, new Object[0], mTicketTripInfoUIStateFactory$convertToUIState$1);
                                                coroutineSingletons = coroutineSingletons6;
                                                if (objB7 == coroutineSingletons) {
                                                    return coroutineSingletons;
                                                }
                                                SnackbarUIState snackbarUIState1110 = snackbarUIState2;
                                                routeSelectionInputUIState = routeSelectionInputUIStateC;
                                                loadingDialogUIState3 = loadingDialogUIState2;
                                                productBookingBranding3 = productBookingBranding2;
                                                snackbarUIState3 = snackbarUIState1110;
                                                ToolbarUIState toolbarUIState110 = toolbarUIState6;
                                                buttonUIState5 = buttonUIState4;
                                                function8 = function7;
                                                toolbarUIState7 = toolbarUIState110;
                                                mTicketTripInfoUIStateFactory2 = this;
                                                str6 = (String) objB7;
                                                productBookingStopDetails = mTicketTripInfoDataState8.c;
                                                if (productBookingStopDetails != null) {
                                                    str7 = str2;
                                                } else {
                                                    str7 = str2;
                                                }
                                                list3 = EmptyList.f17557a;
                                                coroutineSingletons2 = coroutineSingletons;
                                                if (mTicketTripInfoDataState8.i == MTicketTripInfoMissingFieldError.FROM_STOP) {
                                                    mTicketTripInfoUIStateFactory$convertToUIState$1.L$0 = mTicketTripInfoDataState8;
                                                    mTicketTripInfoUIStateFactory$convertToUIState$1.L$1 = function8;
                                                    mTicketTripInfoUIStateFactory$convertToUIState$1.L$2 = toolbarUIState7;
                                                    mTicketTripInfoUIStateFactory$convertToUIState$1.L$3 = buttonUIState5;
                                                    mTicketTripInfoUIStateFactory$convertToUIState$1.L$4 = chaloTextUIState5;
                                                    mTicketTripInfoUIStateFactory$convertToUIState$1.L$5 = loadingDialogUIState3;
                                                    mTicketTripInfoUIStateFactory$convertToUIState$1.L$6 = productBookingBranding3;
                                                    mTicketTripInfoUIStateFactory$convertToUIState$1.L$7 = snackbarUIState3;
                                                    mTicketTripInfoUIStateFactory$convertToUIState$1.L$8 = routeSelectionInputUIState;
                                                    mTicketTripInfoUIStateFactory$convertToUIState$1.L$9 = mTicketTripInfoUIStateFactory2;
                                                    mTicketTripInfoUIStateFactory$convertToUIState$1.L$10 = str6;
                                                    mTicketTripInfoUIStateFactory$convertToUIState$1.L$11 = str7;
                                                    mTicketTripInfoUIStateFactory$convertToUIState$1.L$12 = list3;
                                                    mTicketTripInfoUIStateFactory$convertToUIState$1.label = 9;
                                                    loadingDialogUIState4 = loadingDialogUIState3;
                                                    stringProvider = stringProvider4;
                                                    objB8 = stringProvider.b(StringEnum.STATUS_ERROR_ENTER_STOP, new Object[0], mTicketTripInfoUIStateFactory$convertToUIState$1);
                                                    coroutineSingletons3 = coroutineSingletons2;
                                                    if (objB8 == coroutineSingletons3) {
                                                        return coroutineSingletons3;
                                                    }
                                                    TextUIState.ChaloTextUIState chaloTextUIState1112 = chaloTextUIState5;
                                                    str9 = str7;
                                                    obj7 = objB8;
                                                    chaloTextUIState7 = chaloTextUIState1112;
                                                    SnackbarUIState snackbarUIState1111 = snackbarUIState3;
                                                    routeSelectionInputUIState2 = routeSelectionInputUIState;
                                                    toolbarUIState8 = toolbarUIState7;
                                                    buttonUIState6 = buttonUIState5;
                                                    function9 = function8;
                                                    productBookingBranding4 = productBookingBranding3;
                                                    snackbarUIState4 = snackbarUIState1111;
                                                    coroutineSingletons2 = coroutineSingletons3;
                                                    mTicketTripInfoUIStateFactory3 = mTicketTripInfoUIStateFactory2;
                                                    str8 = (String) obj7;
                                                } else {
                                                    loadingDialogUIState4 = loadingDialogUIState3;
                                                    stringProvider = stringProvider4;
                                                    SnackbarUIState snackbarUIState1112 = snackbarUIState3;
                                                    routeSelectionInputUIState2 = routeSelectionInputUIState;
                                                    toolbarUIState8 = toolbarUIState7;
                                                    buttonUIState6 = buttonUIState5;
                                                    function9 = function8;
                                                    productBookingBranding4 = productBookingBranding3;
                                                    snackbarUIState4 = snackbarUIState1112;
                                                    chaloTextUIState7 = chaloTextUIState5;
                                                    mTicketTripInfoUIStateFactory3 = mTicketTripInfoUIStateFactory2;
                                                    str8 = null;
                                                    str9 = str7;
                                                }
                                                loadingDialogUIState5 = loadingDialogUIState4;
                                                StringProvider stringProvider13 = stringProvider;
                                                wg0 wg0Var116 = new wg0(function9, 5);
                                                mTicketTripInfoUIStateFactory3.getClass();
                                                routeSelectionInputUIStateC2 = c(str6, str9, list3, str8, wg0Var116);
                                                mTicketTripInfoUIStateFactory$convertToUIState$1.L$0 = mTicketTripInfoDataState8;
                                                mTicketTripInfoUIStateFactory$convertToUIState$1.L$1 = function9;
                                                mTicketTripInfoUIStateFactory$convertToUIState$1.L$2 = toolbarUIState8;
                                                mTicketTripInfoUIStateFactory$convertToUIState$1.L$3 = buttonUIState6;
                                                mTicketTripInfoUIStateFactory$convertToUIState$1.L$4 = chaloTextUIState7;
                                                mTicketTripInfoUIStateFactory$convertToUIState$1.L$5 = loadingDialogUIState5;
                                                mTicketTripInfoUIStateFactory$convertToUIState$1.L$6 = productBookingBranding4;
                                                mTicketTripInfoUIStateFactory$convertToUIState$1.L$7 = snackbarUIState4;
                                                mTicketTripInfoUIStateFactory$convertToUIState$1.L$8 = routeSelectionInputUIState2;
                                                mTicketTripInfoUIStateFactory$convertToUIState$1.L$9 = routeSelectionInputUIStateC2;
                                                mTicketTripInfoUIStateFactory$convertToUIState$1.L$10 = this;
                                                mTicketTripInfoUIStateFactory$convertToUIState$1.L$11 = null;
                                                mTicketTripInfoUIStateFactory$convertToUIState$1.L$12 = null;
                                                mTicketTripInfoUIStateFactory$convertToUIState$1.label = 10;
                                                stringProvider2 = stringProvider13;
                                                objB9 = stringProvider2.b(StringEnum.HINT_END_STOP, new Object[0], mTicketTripInfoUIStateFactory$convertToUIState$1);
                                                coroutineSingletons4 = coroutineSingletons2;
                                                if (objB9 == coroutineSingletons4) {
                                                    return coroutineSingletons4;
                                                }
                                                loadingDialogUIState6 = loadingDialogUIState5;
                                                obj8 = objB9;
                                                toolbarUIState9 = toolbarUIState8;
                                                routeSelectionInputUIState3 = routeSelectionInputUIStateC2;
                                                mTicketTripInfoUIStateFactory4 = this;
                                                str10 = (String) obj8;
                                                productBookingStopDetails2 = mTicketTripInfoDataState8.d;
                                                if (productBookingStopDetails2 != null) {
                                                    str11 = str2;
                                                } else {
                                                    str11 = str2;
                                                }
                                                coroutineSingletons5 = coroutineSingletons4;
                                                list4 = EmptyList.f17557a;
                                                stringProvider3 = stringProvider2;
                                                if (mTicketTripInfoDataState8.i == MTicketTripInfoMissingFieldError.TO_STOP) {
                                                    mTicketTripInfoUIStateFactory$convertToUIState$1.L$0 = function9;
                                                    mTicketTripInfoUIStateFactory$convertToUIState$1.L$1 = toolbarUIState9;
                                                    mTicketTripInfoUIStateFactory$convertToUIState$1.L$2 = buttonUIState6;
                                                    mTicketTripInfoUIStateFactory$convertToUIState$1.L$3 = chaloTextUIState7;
                                                    mTicketTripInfoUIStateFactory$convertToUIState$1.L$4 = loadingDialogUIState6;
                                                    mTicketTripInfoUIStateFactory$convertToUIState$1.L$5 = productBookingBranding4;
                                                    mTicketTripInfoUIStateFactory$convertToUIState$1.L$6 = snackbarUIState4;
                                                    mTicketTripInfoUIStateFactory$convertToUIState$1.L$7 = routeSelectionInputUIState2;
                                                    mTicketTripInfoUIStateFactory$convertToUIState$1.L$8 = routeSelectionInputUIState3;
                                                    mTicketTripInfoUIStateFactory$convertToUIState$1.L$9 = mTicketTripInfoUIStateFactory4;
                                                    mTicketTripInfoUIStateFactory$convertToUIState$1.L$10 = str10;
                                                    mTicketTripInfoUIStateFactory$convertToUIState$1.L$11 = str11;
                                                    mTicketTripInfoUIStateFactory$convertToUIState$1.L$12 = list4;
                                                    mTicketTripInfoUIStateFactory6 = mTicketTripInfoUIStateFactory4;
                                                    mTicketTripInfoUIStateFactory$convertToUIState$1.label = 11;
                                                    objB10 = stringProvider3.b(StringEnum.STATUS_ERROR_ENTER_STOP, new Object[0], mTicketTripInfoUIStateFactory$convertToUIState$1);
                                                    if (objB10 == coroutineSingletons5) {
                                                        return coroutineSingletons5;
                                                    }
                                                    chaloTextUIState9 = chaloTextUIState7;
                                                    routeSelectionInputUIState6 = routeSelectionInputUIState2;
                                                    productBookingBranding6 = productBookingBranding4;
                                                    function10 = function9;
                                                    buttonUIState7 = buttonUIState6;
                                                    str13 = str10;
                                                    toolbarUIState11 = toolbarUIState9;
                                                    routeSelectionInputUIState7 = routeSelectionInputUIState3;
                                                    snackbarUIState5 = snackbarUIState4;
                                                    obj9 = objB10;
                                                    loadingDialogUIState8 = loadingDialogUIState6;
                                                    list5 = list4;
                                                    mTicketTripInfoUIStateFactory7 = mTicketTripInfoUIStateFactory6;
                                                    String str1111 = (String) obj9;
                                                    Function1 function110 = function10;
                                                    str12 = str1111;
                                                    mTicketTripInfoUIStateFactory5 = mTicketTripInfoUIStateFactory7;
                                                    list4 = list5;
                                                    toolbarUIState10 = toolbarUIState11;
                                                    function9 = function110;
                                                    LoadingDialogUIState loadingDialogUIState17 = loadingDialogUIState8;
                                                    snackbarUIState4 = snackbarUIState5;
                                                    productBookingBranding5 = productBookingBranding6;
                                                    loadingDialogUIState7 = loadingDialogUIState17;
                                                    str10 = str13;
                                                    routeSelectionInputUIState5 = routeSelectionInputUIState7;
                                                    routeSelectionInputUIState4 = routeSelectionInputUIState6;
                                                    chaloTextUIState8 = chaloTextUIState9;
                                                    buttonUIState6 = buttonUIState7;
                                                } else {
                                                    MTicketTripInfoUIStateFactory mTicketTripInfoUIStateFactory115 = mTicketTripInfoUIStateFactory4;
                                                    RouteSelectionInputUIState routeSelectionInputUIState16 = routeSelectionInputUIState2;
                                                    loadingDialogUIState7 = loadingDialogUIState6;
                                                    toolbarUIState10 = toolbarUIState9;
                                                    routeSelectionInputUIState4 = routeSelectionInputUIState16;
                                                    chaloTextUIState8 = chaloTextUIState7;
                                                    routeSelectionInputUIState5 = routeSelectionInputUIState3;
                                                    productBookingBranding5 = productBookingBranding4;
                                                    mTicketTripInfoUIStateFactory5 = mTicketTripInfoUIStateFactory115;
                                                    str12 = null;
                                                }
                                                wg0 wg0Var117 = new wg0(function9, 6);
                                                mTicketTripInfoUIStateFactory5.getClass();
                                                return new MTicketTripInfoUIState(toolbarUIState10, routeSelectionInputUIState4, routeSelectionInputUIState5, c(str10, str11, list4, str12, wg0Var117), buttonUIState6, chaloTextUIState8, productBookingBranding5, loadingDialogUIState7, snackbarUIState4);
                                            }
                                        }
                                    } else {
                                        mTicketTripInfoDataState8 = mTicketTripInfoDataState7;
                                        function6 = function5;
                                        toolbarUIState5 = toolbarUIState4;
                                        buttonUIState3 = buttonUIState2;
                                        chaloTextUIState4 = chaloTextUIState2;
                                        loadingDialogUIState = loadingDialogUIStateA;
                                        snackbarUIState = null;
                                        mTicketTripInfoUIStateFactory$convertToUIState$1.L$0 = mTicketTripInfoDataState8;
                                        mTicketTripInfoUIStateFactory$convertToUIState$1.L$1 = function6;
                                        mTicketTripInfoUIStateFactory$convertToUIState$1.L$2 = toolbarUIState5;
                                        mTicketTripInfoUIStateFactory$convertToUIState$1.L$3 = buttonUIState3;
                                        mTicketTripInfoUIStateFactory$convertToUIState$1.L$4 = chaloTextUIState4;
                                        mTicketTripInfoUIStateFactory$convertToUIState$1.L$5 = loadingDialogUIState;
                                        mTicketTripInfoUIStateFactory$convertToUIState$1.L$6 = productBookingBranding;
                                        mTicketTripInfoUIStateFactory$convertToUIState$1.L$7 = snackbarUIState;
                                        mTicketTripInfoUIStateFactory$convertToUIState$1.L$8 = this;
                                        mTicketTripInfoUIStateFactory$convertToUIState$1.label = 6;
                                        objB5 = stringProvider4.b(StringEnum.HINT_ROUTE_NUMBER, new Object[0], mTicketTripInfoUIStateFactory$convertToUIState$1);
                                        if (objB5 != coroutineSingletons6) {
                                            ButtonUIState buttonUIState17 = buttonUIState3;
                                            snackbarUIState2 = snackbarUIState;
                                            obj5 = objB5;
                                            buttonUIState4 = buttonUIState17;
                                            toolbarUIState6 = toolbarUIState5;
                                            function7 = function6;
                                            productBookingBranding2 = productBookingBranding;
                                            loadingDialogUIState2 = loadingDialogUIState;
                                            chaloTextUIState5 = chaloTextUIState4;
                                            mTicketTripInfoUIStateFactory = this;
                                            str = (String) obj5;
                                            productBookingRouteDetails = mTicketTripInfoDataState8.b;
                                            str2 = "";
                                            if (productBookingRouteDetails != null) {
                                                str3 = str2;
                                            } else {
                                                str3 = str2;
                                            }
                                            if (productBookingRouteDetails != null) {
                                                list = EmptyList.f17557a;
                                            } else {
                                                list = EmptyList.f17557a;
                                            }
                                            if (mTicketTripInfoDataState8.i == MTicketTripInfoMissingFieldError.ROUTE) {
                                                mTicketTripInfoUIStateFactory$convertToUIState$1.L$0 = mTicketTripInfoDataState8;
                                                mTicketTripInfoUIStateFactory$convertToUIState$1.L$1 = function7;
                                                mTicketTripInfoUIStateFactory$convertToUIState$1.L$2 = toolbarUIState6;
                                                mTicketTripInfoUIStateFactory$convertToUIState$1.L$3 = buttonUIState4;
                                                mTicketTripInfoUIStateFactory$convertToUIState$1.L$4 = chaloTextUIState5;
                                                mTicketTripInfoUIStateFactory$convertToUIState$1.L$5 = loadingDialogUIState2;
                                                mTicketTripInfoUIStateFactory$convertToUIState$1.L$6 = productBookingBranding2;
                                                mTicketTripInfoUIStateFactory$convertToUIState$1.L$7 = snackbarUIState2;
                                                mTicketTripInfoUIStateFactory$convertToUIState$1.L$8 = mTicketTripInfoUIStateFactory;
                                                mTicketTripInfoUIStateFactory$convertToUIState$1.L$9 = str;
                                                mTicketTripInfoUIStateFactory$convertToUIState$1.L$10 = str3;
                                                mTicketTripInfoUIStateFactory$convertToUIState$1.L$11 = list;
                                                mTicketTripInfoUIStateFactory$convertToUIState$1.label = 7;
                                                objB6 = stringProvider4.b(StringEnum.STATUS_ERROR_ROUTE_NUMBER, new Object[0], mTicketTripInfoUIStateFactory$convertToUIState$1);
                                                if (objB6 != coroutineSingletons6) {
                                                    coroutineSingletons6 = coroutineSingletons6;
                                                    List list15 = list;
                                                    obj6 = objB6;
                                                    list2 = list15;
                                                    String str1112 = str3;
                                                    chaloTextUIState6 = chaloTextUIState5;
                                                    str5 = str1112;
                                                    str4 = (String) obj6;
                                                    TextUIState.ChaloTextUIState chaloTextUIState1113 = chaloTextUIState6;
                                                    str3 = str5;
                                                    chaloTextUIState5 = chaloTextUIState1113;
                                                }
                                            } else {
                                                coroutineSingletons6 = coroutineSingletons6;
                                                list2 = list;
                                                str4 = null;
                                            }
                                            MTicketTripInfoUIStateFactory mTicketTripInfoUIStateFactory116 = mTicketTripInfoUIStateFactory;
                                            wg0 wg0Var118 = new wg0(function7, 4);
                                            mTicketTripInfoUIStateFactory116.getClass();
                                            routeSelectionInputUIStateC = c(str, str3, list2, str4, wg0Var118);
                                            mTicketTripInfoUIStateFactory$convertToUIState$1.L$0 = mTicketTripInfoDataState8;
                                            mTicketTripInfoUIStateFactory$convertToUIState$1.L$1 = function7;
                                            mTicketTripInfoUIStateFactory$convertToUIState$1.L$2 = toolbarUIState6;
                                            mTicketTripInfoUIStateFactory$convertToUIState$1.L$3 = buttonUIState4;
                                            mTicketTripInfoUIStateFactory$convertToUIState$1.L$4 = chaloTextUIState5;
                                            mTicketTripInfoUIStateFactory$convertToUIState$1.L$5 = loadingDialogUIState2;
                                            mTicketTripInfoUIStateFactory$convertToUIState$1.L$6 = productBookingBranding2;
                                            mTicketTripInfoUIStateFactory$convertToUIState$1.L$7 = snackbarUIState2;
                                            mTicketTripInfoUIStateFactory$convertToUIState$1.L$8 = routeSelectionInputUIStateC;
                                            mTicketTripInfoUIStateFactory$convertToUIState$1.L$9 = this;
                                            mTicketTripInfoUIStateFactory$convertToUIState$1.L$10 = null;
                                            mTicketTripInfoUIStateFactory$convertToUIState$1.L$11 = null;
                                            mTicketTripInfoUIStateFactory$convertToUIState$1.label = 8;
                                            objB7 = stringProvider4.b(StringEnum.HINT_START_STOP, new Object[0], mTicketTripInfoUIStateFactory$convertToUIState$1);
                                            coroutineSingletons = coroutineSingletons6;
                                            if (objB7 == coroutineSingletons) {
                                                return coroutineSingletons;
                                            }
                                            SnackbarUIState snackbarUIState1113 = snackbarUIState2;
                                            routeSelectionInputUIState = routeSelectionInputUIStateC;
                                            loadingDialogUIState3 = loadingDialogUIState2;
                                            productBookingBranding3 = productBookingBranding2;
                                            snackbarUIState3 = snackbarUIState1113;
                                            ToolbarUIState toolbarUIState111 = toolbarUIState6;
                                            buttonUIState5 = buttonUIState4;
                                            function8 = function7;
                                            toolbarUIState7 = toolbarUIState111;
                                            mTicketTripInfoUIStateFactory2 = this;
                                            str6 = (String) objB7;
                                            productBookingStopDetails = mTicketTripInfoDataState8.c;
                                            if (productBookingStopDetails != null) {
                                                str7 = str2;
                                            } else {
                                                str7 = str2;
                                            }
                                            list3 = EmptyList.f17557a;
                                            coroutineSingletons2 = coroutineSingletons;
                                            if (mTicketTripInfoDataState8.i == MTicketTripInfoMissingFieldError.FROM_STOP) {
                                                mTicketTripInfoUIStateFactory$convertToUIState$1.L$0 = mTicketTripInfoDataState8;
                                                mTicketTripInfoUIStateFactory$convertToUIState$1.L$1 = function8;
                                                mTicketTripInfoUIStateFactory$convertToUIState$1.L$2 = toolbarUIState7;
                                                mTicketTripInfoUIStateFactory$convertToUIState$1.L$3 = buttonUIState5;
                                                mTicketTripInfoUIStateFactory$convertToUIState$1.L$4 = chaloTextUIState5;
                                                mTicketTripInfoUIStateFactory$convertToUIState$1.L$5 = loadingDialogUIState3;
                                                mTicketTripInfoUIStateFactory$convertToUIState$1.L$6 = productBookingBranding3;
                                                mTicketTripInfoUIStateFactory$convertToUIState$1.L$7 = snackbarUIState3;
                                                mTicketTripInfoUIStateFactory$convertToUIState$1.L$8 = routeSelectionInputUIState;
                                                mTicketTripInfoUIStateFactory$convertToUIState$1.L$9 = mTicketTripInfoUIStateFactory2;
                                                mTicketTripInfoUIStateFactory$convertToUIState$1.L$10 = str6;
                                                mTicketTripInfoUIStateFactory$convertToUIState$1.L$11 = str7;
                                                mTicketTripInfoUIStateFactory$convertToUIState$1.L$12 = list3;
                                                mTicketTripInfoUIStateFactory$convertToUIState$1.label = 9;
                                                loadingDialogUIState4 = loadingDialogUIState3;
                                                stringProvider = stringProvider4;
                                                objB8 = stringProvider.b(StringEnum.STATUS_ERROR_ENTER_STOP, new Object[0], mTicketTripInfoUIStateFactory$convertToUIState$1);
                                                coroutineSingletons3 = coroutineSingletons2;
                                                if (objB8 == coroutineSingletons3) {
                                                    return coroutineSingletons3;
                                                }
                                                TextUIState.ChaloTextUIState chaloTextUIState1114 = chaloTextUIState5;
                                                str9 = str7;
                                                obj7 = objB8;
                                                chaloTextUIState7 = chaloTextUIState1114;
                                                SnackbarUIState snackbarUIState1114 = snackbarUIState3;
                                                routeSelectionInputUIState2 = routeSelectionInputUIState;
                                                toolbarUIState8 = toolbarUIState7;
                                                buttonUIState6 = buttonUIState5;
                                                function9 = function8;
                                                productBookingBranding4 = productBookingBranding3;
                                                snackbarUIState4 = snackbarUIState1114;
                                                coroutineSingletons2 = coroutineSingletons3;
                                                mTicketTripInfoUIStateFactory3 = mTicketTripInfoUIStateFactory2;
                                                str8 = (String) obj7;
                                            } else {
                                                loadingDialogUIState4 = loadingDialogUIState3;
                                                stringProvider = stringProvider4;
                                                SnackbarUIState snackbarUIState1115 = snackbarUIState3;
                                                routeSelectionInputUIState2 = routeSelectionInputUIState;
                                                toolbarUIState8 = toolbarUIState7;
                                                buttonUIState6 = buttonUIState5;
                                                function9 = function8;
                                                productBookingBranding4 = productBookingBranding3;
                                                snackbarUIState4 = snackbarUIState1115;
                                                chaloTextUIState7 = chaloTextUIState5;
                                                mTicketTripInfoUIStateFactory3 = mTicketTripInfoUIStateFactory2;
                                                str8 = null;
                                                str9 = str7;
                                            }
                                            loadingDialogUIState5 = loadingDialogUIState4;
                                            StringProvider stringProvider14 = stringProvider;
                                            wg0 wg0Var119 = new wg0(function9, 5);
                                            mTicketTripInfoUIStateFactory3.getClass();
                                            routeSelectionInputUIStateC2 = c(str6, str9, list3, str8, wg0Var119);
                                            mTicketTripInfoUIStateFactory$convertToUIState$1.L$0 = mTicketTripInfoDataState8;
                                            mTicketTripInfoUIStateFactory$convertToUIState$1.L$1 = function9;
                                            mTicketTripInfoUIStateFactory$convertToUIState$1.L$2 = toolbarUIState8;
                                            mTicketTripInfoUIStateFactory$convertToUIState$1.L$3 = buttonUIState6;
                                            mTicketTripInfoUIStateFactory$convertToUIState$1.L$4 = chaloTextUIState7;
                                            mTicketTripInfoUIStateFactory$convertToUIState$1.L$5 = loadingDialogUIState5;
                                            mTicketTripInfoUIStateFactory$convertToUIState$1.L$6 = productBookingBranding4;
                                            mTicketTripInfoUIStateFactory$convertToUIState$1.L$7 = snackbarUIState4;
                                            mTicketTripInfoUIStateFactory$convertToUIState$1.L$8 = routeSelectionInputUIState2;
                                            mTicketTripInfoUIStateFactory$convertToUIState$1.L$9 = routeSelectionInputUIStateC2;
                                            mTicketTripInfoUIStateFactory$convertToUIState$1.L$10 = this;
                                            mTicketTripInfoUIStateFactory$convertToUIState$1.L$11 = null;
                                            mTicketTripInfoUIStateFactory$convertToUIState$1.L$12 = null;
                                            mTicketTripInfoUIStateFactory$convertToUIState$1.label = 10;
                                            stringProvider2 = stringProvider14;
                                            objB9 = stringProvider2.b(StringEnum.HINT_END_STOP, new Object[0], mTicketTripInfoUIStateFactory$convertToUIState$1);
                                            coroutineSingletons4 = coroutineSingletons2;
                                            if (objB9 == coroutineSingletons4) {
                                                return coroutineSingletons4;
                                            }
                                            loadingDialogUIState6 = loadingDialogUIState5;
                                            obj8 = objB9;
                                            toolbarUIState9 = toolbarUIState8;
                                            routeSelectionInputUIState3 = routeSelectionInputUIStateC2;
                                            mTicketTripInfoUIStateFactory4 = this;
                                            str10 = (String) obj8;
                                            productBookingStopDetails2 = mTicketTripInfoDataState8.d;
                                            if (productBookingStopDetails2 != null) {
                                                str11 = str2;
                                            } else {
                                                str11 = str2;
                                            }
                                            coroutineSingletons5 = coroutineSingletons4;
                                            list4 = EmptyList.f17557a;
                                            stringProvider3 = stringProvider2;
                                            if (mTicketTripInfoDataState8.i == MTicketTripInfoMissingFieldError.TO_STOP) {
                                                mTicketTripInfoUIStateFactory$convertToUIState$1.L$0 = function9;
                                                mTicketTripInfoUIStateFactory$convertToUIState$1.L$1 = toolbarUIState9;
                                                mTicketTripInfoUIStateFactory$convertToUIState$1.L$2 = buttonUIState6;
                                                mTicketTripInfoUIStateFactory$convertToUIState$1.L$3 = chaloTextUIState7;
                                                mTicketTripInfoUIStateFactory$convertToUIState$1.L$4 = loadingDialogUIState6;
                                                mTicketTripInfoUIStateFactory$convertToUIState$1.L$5 = productBookingBranding4;
                                                mTicketTripInfoUIStateFactory$convertToUIState$1.L$6 = snackbarUIState4;
                                                mTicketTripInfoUIStateFactory$convertToUIState$1.L$7 = routeSelectionInputUIState2;
                                                mTicketTripInfoUIStateFactory$convertToUIState$1.L$8 = routeSelectionInputUIState3;
                                                mTicketTripInfoUIStateFactory$convertToUIState$1.L$9 = mTicketTripInfoUIStateFactory4;
                                                mTicketTripInfoUIStateFactory$convertToUIState$1.L$10 = str10;
                                                mTicketTripInfoUIStateFactory$convertToUIState$1.L$11 = str11;
                                                mTicketTripInfoUIStateFactory$convertToUIState$1.L$12 = list4;
                                                mTicketTripInfoUIStateFactory6 = mTicketTripInfoUIStateFactory4;
                                                mTicketTripInfoUIStateFactory$convertToUIState$1.label = 11;
                                                objB10 = stringProvider3.b(StringEnum.STATUS_ERROR_ENTER_STOP, new Object[0], mTicketTripInfoUIStateFactory$convertToUIState$1);
                                                if (objB10 == coroutineSingletons5) {
                                                    return coroutineSingletons5;
                                                }
                                                chaloTextUIState9 = chaloTextUIState7;
                                                routeSelectionInputUIState6 = routeSelectionInputUIState2;
                                                productBookingBranding6 = productBookingBranding4;
                                                function10 = function9;
                                                buttonUIState7 = buttonUIState6;
                                                str13 = str10;
                                                toolbarUIState11 = toolbarUIState9;
                                                routeSelectionInputUIState7 = routeSelectionInputUIState3;
                                                snackbarUIState5 = snackbarUIState4;
                                                obj9 = objB10;
                                                loadingDialogUIState8 = loadingDialogUIState6;
                                                list5 = list4;
                                                mTicketTripInfoUIStateFactory7 = mTicketTripInfoUIStateFactory6;
                                                String str1113 = (String) obj9;
                                                Function1 function111 = function10;
                                                str12 = str1113;
                                                mTicketTripInfoUIStateFactory5 = mTicketTripInfoUIStateFactory7;
                                                list4 = list5;
                                                toolbarUIState10 = toolbarUIState11;
                                                function9 = function111;
                                                LoadingDialogUIState loadingDialogUIState18 = loadingDialogUIState8;
                                                snackbarUIState4 = snackbarUIState5;
                                                productBookingBranding5 = productBookingBranding6;
                                                loadingDialogUIState7 = loadingDialogUIState18;
                                                str10 = str13;
                                                routeSelectionInputUIState5 = routeSelectionInputUIState7;
                                                routeSelectionInputUIState4 = routeSelectionInputUIState6;
                                                chaloTextUIState8 = chaloTextUIState9;
                                                buttonUIState6 = buttonUIState7;
                                            } else {
                                                MTicketTripInfoUIStateFactory mTicketTripInfoUIStateFactory117 = mTicketTripInfoUIStateFactory4;
                                                RouteSelectionInputUIState routeSelectionInputUIState17 = routeSelectionInputUIState2;
                                                loadingDialogUIState7 = loadingDialogUIState6;
                                                toolbarUIState10 = toolbarUIState9;
                                                routeSelectionInputUIState4 = routeSelectionInputUIState17;
                                                chaloTextUIState8 = chaloTextUIState7;
                                                routeSelectionInputUIState5 = routeSelectionInputUIState3;
                                                productBookingBranding5 = productBookingBranding4;
                                                mTicketTripInfoUIStateFactory5 = mTicketTripInfoUIStateFactory117;
                                                str12 = null;
                                            }
                                            wg0 wg0Var1110 = new wg0(function9, 6);
                                            mTicketTripInfoUIStateFactory5.getClass();
                                            return new MTicketTripInfoUIState(toolbarUIState10, routeSelectionInputUIState4, routeSelectionInputUIState5, c(str10, str11, list4, str12, wg0Var1110), buttonUIState6, chaloTextUIState8, productBookingBranding5, loadingDialogUIState7, snackbarUIState4);
                                        }
                                    }
                                }
                            } else {
                                mTicketTripInfoDataState7 = mTicketTripInfoDataState5;
                                function5 = function4;
                                toolbarUIState4 = toolbarUIState3;
                                buttonUIState2 = buttonUIState;
                                chaloTextUIState2 = chaloTextUIState;
                                loadingDialogUIStateA = null;
                                productBookingBranding = mTicketTripInfoDataState7.g;
                                mTicketTripInfoSnackBarType = mTicketTripInfoDataState7.e;
                                if (mTicketTripInfoSnackBarType != null) {
                                    mTicketTripInfoUIStateFactory$convertToUIState$1.L$0 = mTicketTripInfoDataState7;
                                    mTicketTripInfoUIStateFactory$convertToUIState$1.L$1 = function5;
                                    mTicketTripInfoUIStateFactory$convertToUIState$1.L$2 = toolbarUIState4;
                                    mTicketTripInfoUIStateFactory$convertToUIState$1.L$3 = buttonUIState2;
                                    mTicketTripInfoUIStateFactory$convertToUIState$1.L$4 = chaloTextUIState2;
                                    mTicketTripInfoUIStateFactory$convertToUIState$1.L$5 = loadingDialogUIStateA;
                                    mTicketTripInfoUIStateFactory$convertToUIState$1.L$6 = productBookingBranding;
                                    mTicketTripInfoUIStateFactory$convertToUIState$1.label = 5;
                                    objD = d(mTicketTripInfoSnackBarType, function5, mTicketTripInfoUIStateFactory$convertToUIState$1);
                                    if (objD != coroutineSingletons6) {
                                        TextUIState.ChaloTextUIState chaloTextUIState1115 = chaloTextUIState2;
                                        loadingDialogUIState = loadingDialogUIStateA;
                                        obj4 = objD;
                                        mTicketTripInfoDataState8 = mTicketTripInfoDataState7;
                                        function6 = function5;
                                        toolbarUIState5 = toolbarUIState4;
                                        buttonUIState3 = buttonUIState2;
                                        chaloTextUIState4 = chaloTextUIState1115;
                                        snackbarUIState = (SnackbarUIState) obj4;
                                        mTicketTripInfoUIStateFactory$convertToUIState$1.L$0 = mTicketTripInfoDataState8;
                                        mTicketTripInfoUIStateFactory$convertToUIState$1.L$1 = function6;
                                        mTicketTripInfoUIStateFactory$convertToUIState$1.L$2 = toolbarUIState5;
                                        mTicketTripInfoUIStateFactory$convertToUIState$1.L$3 = buttonUIState3;
                                        mTicketTripInfoUIStateFactory$convertToUIState$1.L$4 = chaloTextUIState4;
                                        mTicketTripInfoUIStateFactory$convertToUIState$1.L$5 = loadingDialogUIState;
                                        mTicketTripInfoUIStateFactory$convertToUIState$1.L$6 = productBookingBranding;
                                        mTicketTripInfoUIStateFactory$convertToUIState$1.L$7 = snackbarUIState;
                                        mTicketTripInfoUIStateFactory$convertToUIState$1.L$8 = this;
                                        mTicketTripInfoUIStateFactory$convertToUIState$1.label = 6;
                                        objB5 = stringProvider4.b(StringEnum.HINT_ROUTE_NUMBER, new Object[0], mTicketTripInfoUIStateFactory$convertToUIState$1);
                                        if (objB5 != coroutineSingletons6) {
                                            ButtonUIState buttonUIState18 = buttonUIState3;
                                            snackbarUIState2 = snackbarUIState;
                                            obj5 = objB5;
                                            buttonUIState4 = buttonUIState18;
                                            toolbarUIState6 = toolbarUIState5;
                                            function7 = function6;
                                            productBookingBranding2 = productBookingBranding;
                                            loadingDialogUIState2 = loadingDialogUIState;
                                            chaloTextUIState5 = chaloTextUIState4;
                                            mTicketTripInfoUIStateFactory = this;
                                            str = (String) obj5;
                                            productBookingRouteDetails = mTicketTripInfoDataState8.b;
                                            str2 = "";
                                            if (productBookingRouteDetails != null) {
                                                str3 = str2;
                                            } else {
                                                str3 = str2;
                                            }
                                            if (productBookingRouteDetails != null) {
                                                list = EmptyList.f17557a;
                                            } else {
                                                list = EmptyList.f17557a;
                                            }
                                            if (mTicketTripInfoDataState8.i == MTicketTripInfoMissingFieldError.ROUTE) {
                                                mTicketTripInfoUIStateFactory$convertToUIState$1.L$0 = mTicketTripInfoDataState8;
                                                mTicketTripInfoUIStateFactory$convertToUIState$1.L$1 = function7;
                                                mTicketTripInfoUIStateFactory$convertToUIState$1.L$2 = toolbarUIState6;
                                                mTicketTripInfoUIStateFactory$convertToUIState$1.L$3 = buttonUIState4;
                                                mTicketTripInfoUIStateFactory$convertToUIState$1.L$4 = chaloTextUIState5;
                                                mTicketTripInfoUIStateFactory$convertToUIState$1.L$5 = loadingDialogUIState2;
                                                mTicketTripInfoUIStateFactory$convertToUIState$1.L$6 = productBookingBranding2;
                                                mTicketTripInfoUIStateFactory$convertToUIState$1.L$7 = snackbarUIState2;
                                                mTicketTripInfoUIStateFactory$convertToUIState$1.L$8 = mTicketTripInfoUIStateFactory;
                                                mTicketTripInfoUIStateFactory$convertToUIState$1.L$9 = str;
                                                mTicketTripInfoUIStateFactory$convertToUIState$1.L$10 = str3;
                                                mTicketTripInfoUIStateFactory$convertToUIState$1.L$11 = list;
                                                mTicketTripInfoUIStateFactory$convertToUIState$1.label = 7;
                                                objB6 = stringProvider4.b(StringEnum.STATUS_ERROR_ROUTE_NUMBER, new Object[0], mTicketTripInfoUIStateFactory$convertToUIState$1);
                                                if (objB6 != coroutineSingletons6) {
                                                    coroutineSingletons6 = coroutineSingletons6;
                                                    List list16 = list;
                                                    obj6 = objB6;
                                                    list2 = list16;
                                                    String str1114 = str3;
                                                    chaloTextUIState6 = chaloTextUIState5;
                                                    str5 = str1114;
                                                    str4 = (String) obj6;
                                                    TextUIState.ChaloTextUIState chaloTextUIState1116 = chaloTextUIState6;
                                                    str3 = str5;
                                                    chaloTextUIState5 = chaloTextUIState1116;
                                                }
                                            } else {
                                                coroutineSingletons6 = coroutineSingletons6;
                                                list2 = list;
                                                str4 = null;
                                            }
                                            MTicketTripInfoUIStateFactory mTicketTripInfoUIStateFactory118 = mTicketTripInfoUIStateFactory;
                                            wg0 wg0Var1111 = new wg0(function7, 4);
                                            mTicketTripInfoUIStateFactory118.getClass();
                                            routeSelectionInputUIStateC = c(str, str3, list2, str4, wg0Var1111);
                                            mTicketTripInfoUIStateFactory$convertToUIState$1.L$0 = mTicketTripInfoDataState8;
                                            mTicketTripInfoUIStateFactory$convertToUIState$1.L$1 = function7;
                                            mTicketTripInfoUIStateFactory$convertToUIState$1.L$2 = toolbarUIState6;
                                            mTicketTripInfoUIStateFactory$convertToUIState$1.L$3 = buttonUIState4;
                                            mTicketTripInfoUIStateFactory$convertToUIState$1.L$4 = chaloTextUIState5;
                                            mTicketTripInfoUIStateFactory$convertToUIState$1.L$5 = loadingDialogUIState2;
                                            mTicketTripInfoUIStateFactory$convertToUIState$1.L$6 = productBookingBranding2;
                                            mTicketTripInfoUIStateFactory$convertToUIState$1.L$7 = snackbarUIState2;
                                            mTicketTripInfoUIStateFactory$convertToUIState$1.L$8 = routeSelectionInputUIStateC;
                                            mTicketTripInfoUIStateFactory$convertToUIState$1.L$9 = this;
                                            mTicketTripInfoUIStateFactory$convertToUIState$1.L$10 = null;
                                            mTicketTripInfoUIStateFactory$convertToUIState$1.L$11 = null;
                                            mTicketTripInfoUIStateFactory$convertToUIState$1.label = 8;
                                            objB7 = stringProvider4.b(StringEnum.HINT_START_STOP, new Object[0], mTicketTripInfoUIStateFactory$convertToUIState$1);
                                            coroutineSingletons = coroutineSingletons6;
                                            if (objB7 == coroutineSingletons) {
                                                return coroutineSingletons;
                                            }
                                            SnackbarUIState snackbarUIState1116 = snackbarUIState2;
                                            routeSelectionInputUIState = routeSelectionInputUIStateC;
                                            loadingDialogUIState3 = loadingDialogUIState2;
                                            productBookingBranding3 = productBookingBranding2;
                                            snackbarUIState3 = snackbarUIState1116;
                                            ToolbarUIState toolbarUIState112 = toolbarUIState6;
                                            buttonUIState5 = buttonUIState4;
                                            function8 = function7;
                                            toolbarUIState7 = toolbarUIState112;
                                            mTicketTripInfoUIStateFactory2 = this;
                                            str6 = (String) objB7;
                                            productBookingStopDetails = mTicketTripInfoDataState8.c;
                                            if (productBookingStopDetails != null) {
                                                str7 = str2;
                                            } else {
                                                str7 = str2;
                                            }
                                            list3 = EmptyList.f17557a;
                                            coroutineSingletons2 = coroutineSingletons;
                                            if (mTicketTripInfoDataState8.i == MTicketTripInfoMissingFieldError.FROM_STOP) {
                                                mTicketTripInfoUIStateFactory$convertToUIState$1.L$0 = mTicketTripInfoDataState8;
                                                mTicketTripInfoUIStateFactory$convertToUIState$1.L$1 = function8;
                                                mTicketTripInfoUIStateFactory$convertToUIState$1.L$2 = toolbarUIState7;
                                                mTicketTripInfoUIStateFactory$convertToUIState$1.L$3 = buttonUIState5;
                                                mTicketTripInfoUIStateFactory$convertToUIState$1.L$4 = chaloTextUIState5;
                                                mTicketTripInfoUIStateFactory$convertToUIState$1.L$5 = loadingDialogUIState3;
                                                mTicketTripInfoUIStateFactory$convertToUIState$1.L$6 = productBookingBranding3;
                                                mTicketTripInfoUIStateFactory$convertToUIState$1.L$7 = snackbarUIState3;
                                                mTicketTripInfoUIStateFactory$convertToUIState$1.L$8 = routeSelectionInputUIState;
                                                mTicketTripInfoUIStateFactory$convertToUIState$1.L$9 = mTicketTripInfoUIStateFactory2;
                                                mTicketTripInfoUIStateFactory$convertToUIState$1.L$10 = str6;
                                                mTicketTripInfoUIStateFactory$convertToUIState$1.L$11 = str7;
                                                mTicketTripInfoUIStateFactory$convertToUIState$1.L$12 = list3;
                                                mTicketTripInfoUIStateFactory$convertToUIState$1.label = 9;
                                                loadingDialogUIState4 = loadingDialogUIState3;
                                                stringProvider = stringProvider4;
                                                objB8 = stringProvider.b(StringEnum.STATUS_ERROR_ENTER_STOP, new Object[0], mTicketTripInfoUIStateFactory$convertToUIState$1);
                                                coroutineSingletons3 = coroutineSingletons2;
                                                if (objB8 == coroutineSingletons3) {
                                                    return coroutineSingletons3;
                                                }
                                                TextUIState.ChaloTextUIState chaloTextUIState1117 = chaloTextUIState5;
                                                str9 = str7;
                                                obj7 = objB8;
                                                chaloTextUIState7 = chaloTextUIState1117;
                                                SnackbarUIState snackbarUIState1117 = snackbarUIState3;
                                                routeSelectionInputUIState2 = routeSelectionInputUIState;
                                                toolbarUIState8 = toolbarUIState7;
                                                buttonUIState6 = buttonUIState5;
                                                function9 = function8;
                                                productBookingBranding4 = productBookingBranding3;
                                                snackbarUIState4 = snackbarUIState1117;
                                                coroutineSingletons2 = coroutineSingletons3;
                                                mTicketTripInfoUIStateFactory3 = mTicketTripInfoUIStateFactory2;
                                                str8 = (String) obj7;
                                            } else {
                                                loadingDialogUIState4 = loadingDialogUIState3;
                                                stringProvider = stringProvider4;
                                                SnackbarUIState snackbarUIState1118 = snackbarUIState3;
                                                routeSelectionInputUIState2 = routeSelectionInputUIState;
                                                toolbarUIState8 = toolbarUIState7;
                                                buttonUIState6 = buttonUIState5;
                                                function9 = function8;
                                                productBookingBranding4 = productBookingBranding3;
                                                snackbarUIState4 = snackbarUIState1118;
                                                chaloTextUIState7 = chaloTextUIState5;
                                                mTicketTripInfoUIStateFactory3 = mTicketTripInfoUIStateFactory2;
                                                str8 = null;
                                                str9 = str7;
                                            }
                                            loadingDialogUIState5 = loadingDialogUIState4;
                                            StringProvider stringProvider15 = stringProvider;
                                            wg0 wg0Var1112 = new wg0(function9, 5);
                                            mTicketTripInfoUIStateFactory3.getClass();
                                            routeSelectionInputUIStateC2 = c(str6, str9, list3, str8, wg0Var1112);
                                            mTicketTripInfoUIStateFactory$convertToUIState$1.L$0 = mTicketTripInfoDataState8;
                                            mTicketTripInfoUIStateFactory$convertToUIState$1.L$1 = function9;
                                            mTicketTripInfoUIStateFactory$convertToUIState$1.L$2 = toolbarUIState8;
                                            mTicketTripInfoUIStateFactory$convertToUIState$1.L$3 = buttonUIState6;
                                            mTicketTripInfoUIStateFactory$convertToUIState$1.L$4 = chaloTextUIState7;
                                            mTicketTripInfoUIStateFactory$convertToUIState$1.L$5 = loadingDialogUIState5;
                                            mTicketTripInfoUIStateFactory$convertToUIState$1.L$6 = productBookingBranding4;
                                            mTicketTripInfoUIStateFactory$convertToUIState$1.L$7 = snackbarUIState4;
                                            mTicketTripInfoUIStateFactory$convertToUIState$1.L$8 = routeSelectionInputUIState2;
                                            mTicketTripInfoUIStateFactory$convertToUIState$1.L$9 = routeSelectionInputUIStateC2;
                                            mTicketTripInfoUIStateFactory$convertToUIState$1.L$10 = this;
                                            mTicketTripInfoUIStateFactory$convertToUIState$1.L$11 = null;
                                            mTicketTripInfoUIStateFactory$convertToUIState$1.L$12 = null;
                                            mTicketTripInfoUIStateFactory$convertToUIState$1.label = 10;
                                            stringProvider2 = stringProvider15;
                                            objB9 = stringProvider2.b(StringEnum.HINT_END_STOP, new Object[0], mTicketTripInfoUIStateFactory$convertToUIState$1);
                                            coroutineSingletons4 = coroutineSingletons2;
                                            if (objB9 == coroutineSingletons4) {
                                                return coroutineSingletons4;
                                            }
                                            loadingDialogUIState6 = loadingDialogUIState5;
                                            obj8 = objB9;
                                            toolbarUIState9 = toolbarUIState8;
                                            routeSelectionInputUIState3 = routeSelectionInputUIStateC2;
                                            mTicketTripInfoUIStateFactory4 = this;
                                            str10 = (String) obj8;
                                            productBookingStopDetails2 = mTicketTripInfoDataState8.d;
                                            if (productBookingStopDetails2 != null) {
                                                str11 = str2;
                                            } else {
                                                str11 = str2;
                                            }
                                            coroutineSingletons5 = coroutineSingletons4;
                                            list4 = EmptyList.f17557a;
                                            stringProvider3 = stringProvider2;
                                            if (mTicketTripInfoDataState8.i == MTicketTripInfoMissingFieldError.TO_STOP) {
                                                mTicketTripInfoUIStateFactory$convertToUIState$1.L$0 = function9;
                                                mTicketTripInfoUIStateFactory$convertToUIState$1.L$1 = toolbarUIState9;
                                                mTicketTripInfoUIStateFactory$convertToUIState$1.L$2 = buttonUIState6;
                                                mTicketTripInfoUIStateFactory$convertToUIState$1.L$3 = chaloTextUIState7;
                                                mTicketTripInfoUIStateFactory$convertToUIState$1.L$4 = loadingDialogUIState6;
                                                mTicketTripInfoUIStateFactory$convertToUIState$1.L$5 = productBookingBranding4;
                                                mTicketTripInfoUIStateFactory$convertToUIState$1.L$6 = snackbarUIState4;
                                                mTicketTripInfoUIStateFactory$convertToUIState$1.L$7 = routeSelectionInputUIState2;
                                                mTicketTripInfoUIStateFactory$convertToUIState$1.L$8 = routeSelectionInputUIState3;
                                                mTicketTripInfoUIStateFactory$convertToUIState$1.L$9 = mTicketTripInfoUIStateFactory4;
                                                mTicketTripInfoUIStateFactory$convertToUIState$1.L$10 = str10;
                                                mTicketTripInfoUIStateFactory$convertToUIState$1.L$11 = str11;
                                                mTicketTripInfoUIStateFactory$convertToUIState$1.L$12 = list4;
                                                mTicketTripInfoUIStateFactory6 = mTicketTripInfoUIStateFactory4;
                                                mTicketTripInfoUIStateFactory$convertToUIState$1.label = 11;
                                                objB10 = stringProvider3.b(StringEnum.STATUS_ERROR_ENTER_STOP, new Object[0], mTicketTripInfoUIStateFactory$convertToUIState$1);
                                                if (objB10 == coroutineSingletons5) {
                                                    return coroutineSingletons5;
                                                }
                                                chaloTextUIState9 = chaloTextUIState7;
                                                routeSelectionInputUIState6 = routeSelectionInputUIState2;
                                                productBookingBranding6 = productBookingBranding4;
                                                function10 = function9;
                                                buttonUIState7 = buttonUIState6;
                                                str13 = str10;
                                                toolbarUIState11 = toolbarUIState9;
                                                routeSelectionInputUIState7 = routeSelectionInputUIState3;
                                                snackbarUIState5 = snackbarUIState4;
                                                obj9 = objB10;
                                                loadingDialogUIState8 = loadingDialogUIState6;
                                                list5 = list4;
                                                mTicketTripInfoUIStateFactory7 = mTicketTripInfoUIStateFactory6;
                                                String str1115 = (String) obj9;
                                                Function1 function112 = function10;
                                                str12 = str1115;
                                                mTicketTripInfoUIStateFactory5 = mTicketTripInfoUIStateFactory7;
                                                list4 = list5;
                                                toolbarUIState10 = toolbarUIState11;
                                                function9 = function112;
                                                LoadingDialogUIState loadingDialogUIState19 = loadingDialogUIState8;
                                                snackbarUIState4 = snackbarUIState5;
                                                productBookingBranding5 = productBookingBranding6;
                                                loadingDialogUIState7 = loadingDialogUIState19;
                                                str10 = str13;
                                                routeSelectionInputUIState5 = routeSelectionInputUIState7;
                                                routeSelectionInputUIState4 = routeSelectionInputUIState6;
                                                chaloTextUIState8 = chaloTextUIState9;
                                                buttonUIState6 = buttonUIState7;
                                            } else {
                                                MTicketTripInfoUIStateFactory mTicketTripInfoUIStateFactory119 = mTicketTripInfoUIStateFactory4;
                                                RouteSelectionInputUIState routeSelectionInputUIState18 = routeSelectionInputUIState2;
                                                loadingDialogUIState7 = loadingDialogUIState6;
                                                toolbarUIState10 = toolbarUIState9;
                                                routeSelectionInputUIState4 = routeSelectionInputUIState18;
                                                chaloTextUIState8 = chaloTextUIState7;
                                                routeSelectionInputUIState5 = routeSelectionInputUIState3;
                                                productBookingBranding5 = productBookingBranding4;
                                                mTicketTripInfoUIStateFactory5 = mTicketTripInfoUIStateFactory119;
                                                str12 = null;
                                            }
                                            wg0 wg0Var1113 = new wg0(function9, 6);
                                            mTicketTripInfoUIStateFactory5.getClass();
                                            return new MTicketTripInfoUIState(toolbarUIState10, routeSelectionInputUIState4, routeSelectionInputUIState5, c(str10, str11, list4, str12, wg0Var1113), buttonUIState6, chaloTextUIState8, productBookingBranding5, loadingDialogUIState7, snackbarUIState4);
                                        }
                                    }
                                } else {
                                    mTicketTripInfoDataState8 = mTicketTripInfoDataState7;
                                    function6 = function5;
                                    toolbarUIState5 = toolbarUIState4;
                                    buttonUIState3 = buttonUIState2;
                                    chaloTextUIState4 = chaloTextUIState2;
                                    loadingDialogUIState = loadingDialogUIStateA;
                                    snackbarUIState = null;
                                    mTicketTripInfoUIStateFactory$convertToUIState$1.L$0 = mTicketTripInfoDataState8;
                                    mTicketTripInfoUIStateFactory$convertToUIState$1.L$1 = function6;
                                    mTicketTripInfoUIStateFactory$convertToUIState$1.L$2 = toolbarUIState5;
                                    mTicketTripInfoUIStateFactory$convertToUIState$1.L$3 = buttonUIState3;
                                    mTicketTripInfoUIStateFactory$convertToUIState$1.L$4 = chaloTextUIState4;
                                    mTicketTripInfoUIStateFactory$convertToUIState$1.L$5 = loadingDialogUIState;
                                    mTicketTripInfoUIStateFactory$convertToUIState$1.L$6 = productBookingBranding;
                                    mTicketTripInfoUIStateFactory$convertToUIState$1.L$7 = snackbarUIState;
                                    mTicketTripInfoUIStateFactory$convertToUIState$1.L$8 = this;
                                    mTicketTripInfoUIStateFactory$convertToUIState$1.label = 6;
                                    objB5 = stringProvider4.b(StringEnum.HINT_ROUTE_NUMBER, new Object[0], mTicketTripInfoUIStateFactory$convertToUIState$1);
                                    if (objB5 != coroutineSingletons6) {
                                        ButtonUIState buttonUIState19 = buttonUIState3;
                                        snackbarUIState2 = snackbarUIState;
                                        obj5 = objB5;
                                        buttonUIState4 = buttonUIState19;
                                        toolbarUIState6 = toolbarUIState5;
                                        function7 = function6;
                                        productBookingBranding2 = productBookingBranding;
                                        loadingDialogUIState2 = loadingDialogUIState;
                                        chaloTextUIState5 = chaloTextUIState4;
                                        mTicketTripInfoUIStateFactory = this;
                                        str = (String) obj5;
                                        productBookingRouteDetails = mTicketTripInfoDataState8.b;
                                        str2 = "";
                                        if (productBookingRouteDetails != null) {
                                            str3 = str2;
                                        } else {
                                            str3 = str2;
                                        }
                                        if (productBookingRouteDetails != null) {
                                            list = EmptyList.f17557a;
                                        } else {
                                            list = EmptyList.f17557a;
                                        }
                                        if (mTicketTripInfoDataState8.i == MTicketTripInfoMissingFieldError.ROUTE) {
                                            mTicketTripInfoUIStateFactory$convertToUIState$1.L$0 = mTicketTripInfoDataState8;
                                            mTicketTripInfoUIStateFactory$convertToUIState$1.L$1 = function7;
                                            mTicketTripInfoUIStateFactory$convertToUIState$1.L$2 = toolbarUIState6;
                                            mTicketTripInfoUIStateFactory$convertToUIState$1.L$3 = buttonUIState4;
                                            mTicketTripInfoUIStateFactory$convertToUIState$1.L$4 = chaloTextUIState5;
                                            mTicketTripInfoUIStateFactory$convertToUIState$1.L$5 = loadingDialogUIState2;
                                            mTicketTripInfoUIStateFactory$convertToUIState$1.L$6 = productBookingBranding2;
                                            mTicketTripInfoUIStateFactory$convertToUIState$1.L$7 = snackbarUIState2;
                                            mTicketTripInfoUIStateFactory$convertToUIState$1.L$8 = mTicketTripInfoUIStateFactory;
                                            mTicketTripInfoUIStateFactory$convertToUIState$1.L$9 = str;
                                            mTicketTripInfoUIStateFactory$convertToUIState$1.L$10 = str3;
                                            mTicketTripInfoUIStateFactory$convertToUIState$1.L$11 = list;
                                            mTicketTripInfoUIStateFactory$convertToUIState$1.label = 7;
                                            objB6 = stringProvider4.b(StringEnum.STATUS_ERROR_ROUTE_NUMBER, new Object[0], mTicketTripInfoUIStateFactory$convertToUIState$1);
                                            if (objB6 != coroutineSingletons6) {
                                                coroutineSingletons6 = coroutineSingletons6;
                                                List list17 = list;
                                                obj6 = objB6;
                                                list2 = list17;
                                                String str1116 = str3;
                                                chaloTextUIState6 = chaloTextUIState5;
                                                str5 = str1116;
                                                str4 = (String) obj6;
                                                TextUIState.ChaloTextUIState chaloTextUIState1118 = chaloTextUIState6;
                                                str3 = str5;
                                                chaloTextUIState5 = chaloTextUIState1118;
                                            }
                                        } else {
                                            coroutineSingletons6 = coroutineSingletons6;
                                            list2 = list;
                                            str4 = null;
                                        }
                                        MTicketTripInfoUIStateFactory mTicketTripInfoUIStateFactory1110 = mTicketTripInfoUIStateFactory;
                                        wg0 wg0Var1114 = new wg0(function7, 4);
                                        mTicketTripInfoUIStateFactory1110.getClass();
                                        routeSelectionInputUIStateC = c(str, str3, list2, str4, wg0Var1114);
                                        mTicketTripInfoUIStateFactory$convertToUIState$1.L$0 = mTicketTripInfoDataState8;
                                        mTicketTripInfoUIStateFactory$convertToUIState$1.L$1 = function7;
                                        mTicketTripInfoUIStateFactory$convertToUIState$1.L$2 = toolbarUIState6;
                                        mTicketTripInfoUIStateFactory$convertToUIState$1.L$3 = buttonUIState4;
                                        mTicketTripInfoUIStateFactory$convertToUIState$1.L$4 = chaloTextUIState5;
                                        mTicketTripInfoUIStateFactory$convertToUIState$1.L$5 = loadingDialogUIState2;
                                        mTicketTripInfoUIStateFactory$convertToUIState$1.L$6 = productBookingBranding2;
                                        mTicketTripInfoUIStateFactory$convertToUIState$1.L$7 = snackbarUIState2;
                                        mTicketTripInfoUIStateFactory$convertToUIState$1.L$8 = routeSelectionInputUIStateC;
                                        mTicketTripInfoUIStateFactory$convertToUIState$1.L$9 = this;
                                        mTicketTripInfoUIStateFactory$convertToUIState$1.L$10 = null;
                                        mTicketTripInfoUIStateFactory$convertToUIState$1.L$11 = null;
                                        mTicketTripInfoUIStateFactory$convertToUIState$1.label = 8;
                                        objB7 = stringProvider4.b(StringEnum.HINT_START_STOP, new Object[0], mTicketTripInfoUIStateFactory$convertToUIState$1);
                                        coroutineSingletons = coroutineSingletons6;
                                        if (objB7 == coroutineSingletons) {
                                            return coroutineSingletons;
                                        }
                                        SnackbarUIState snackbarUIState1119 = snackbarUIState2;
                                        routeSelectionInputUIState = routeSelectionInputUIStateC;
                                        loadingDialogUIState3 = loadingDialogUIState2;
                                        productBookingBranding3 = productBookingBranding2;
                                        snackbarUIState3 = snackbarUIState1119;
                                        ToolbarUIState toolbarUIState113 = toolbarUIState6;
                                        buttonUIState5 = buttonUIState4;
                                        function8 = function7;
                                        toolbarUIState7 = toolbarUIState113;
                                        mTicketTripInfoUIStateFactory2 = this;
                                        str6 = (String) objB7;
                                        productBookingStopDetails = mTicketTripInfoDataState8.c;
                                        if (productBookingStopDetails != null) {
                                            str7 = str2;
                                        } else {
                                            str7 = str2;
                                        }
                                        list3 = EmptyList.f17557a;
                                        coroutineSingletons2 = coroutineSingletons;
                                        if (mTicketTripInfoDataState8.i == MTicketTripInfoMissingFieldError.FROM_STOP) {
                                            mTicketTripInfoUIStateFactory$convertToUIState$1.L$0 = mTicketTripInfoDataState8;
                                            mTicketTripInfoUIStateFactory$convertToUIState$1.L$1 = function8;
                                            mTicketTripInfoUIStateFactory$convertToUIState$1.L$2 = toolbarUIState7;
                                            mTicketTripInfoUIStateFactory$convertToUIState$1.L$3 = buttonUIState5;
                                            mTicketTripInfoUIStateFactory$convertToUIState$1.L$4 = chaloTextUIState5;
                                            mTicketTripInfoUIStateFactory$convertToUIState$1.L$5 = loadingDialogUIState3;
                                            mTicketTripInfoUIStateFactory$convertToUIState$1.L$6 = productBookingBranding3;
                                            mTicketTripInfoUIStateFactory$convertToUIState$1.L$7 = snackbarUIState3;
                                            mTicketTripInfoUIStateFactory$convertToUIState$1.L$8 = routeSelectionInputUIState;
                                            mTicketTripInfoUIStateFactory$convertToUIState$1.L$9 = mTicketTripInfoUIStateFactory2;
                                            mTicketTripInfoUIStateFactory$convertToUIState$1.L$10 = str6;
                                            mTicketTripInfoUIStateFactory$convertToUIState$1.L$11 = str7;
                                            mTicketTripInfoUIStateFactory$convertToUIState$1.L$12 = list3;
                                            mTicketTripInfoUIStateFactory$convertToUIState$1.label = 9;
                                            loadingDialogUIState4 = loadingDialogUIState3;
                                            stringProvider = stringProvider4;
                                            objB8 = stringProvider.b(StringEnum.STATUS_ERROR_ENTER_STOP, new Object[0], mTicketTripInfoUIStateFactory$convertToUIState$1);
                                            coroutineSingletons3 = coroutineSingletons2;
                                            if (objB8 == coroutineSingletons3) {
                                                return coroutineSingletons3;
                                            }
                                            TextUIState.ChaloTextUIState chaloTextUIState1119 = chaloTextUIState5;
                                            str9 = str7;
                                            obj7 = objB8;
                                            chaloTextUIState7 = chaloTextUIState1119;
                                            SnackbarUIState snackbarUIState11110 = snackbarUIState3;
                                            routeSelectionInputUIState2 = routeSelectionInputUIState;
                                            toolbarUIState8 = toolbarUIState7;
                                            buttonUIState6 = buttonUIState5;
                                            function9 = function8;
                                            productBookingBranding4 = productBookingBranding3;
                                            snackbarUIState4 = snackbarUIState11110;
                                            coroutineSingletons2 = coroutineSingletons3;
                                            mTicketTripInfoUIStateFactory3 = mTicketTripInfoUIStateFactory2;
                                            str8 = (String) obj7;
                                        } else {
                                            loadingDialogUIState4 = loadingDialogUIState3;
                                            stringProvider = stringProvider4;
                                            SnackbarUIState snackbarUIState11111 = snackbarUIState3;
                                            routeSelectionInputUIState2 = routeSelectionInputUIState;
                                            toolbarUIState8 = toolbarUIState7;
                                            buttonUIState6 = buttonUIState5;
                                            function9 = function8;
                                            productBookingBranding4 = productBookingBranding3;
                                            snackbarUIState4 = snackbarUIState11111;
                                            chaloTextUIState7 = chaloTextUIState5;
                                            mTicketTripInfoUIStateFactory3 = mTicketTripInfoUIStateFactory2;
                                            str8 = null;
                                            str9 = str7;
                                        }
                                        loadingDialogUIState5 = loadingDialogUIState4;
                                        StringProvider stringProvider16 = stringProvider;
                                        wg0 wg0Var1115 = new wg0(function9, 5);
                                        mTicketTripInfoUIStateFactory3.getClass();
                                        routeSelectionInputUIStateC2 = c(str6, str9, list3, str8, wg0Var1115);
                                        mTicketTripInfoUIStateFactory$convertToUIState$1.L$0 = mTicketTripInfoDataState8;
                                        mTicketTripInfoUIStateFactory$convertToUIState$1.L$1 = function9;
                                        mTicketTripInfoUIStateFactory$convertToUIState$1.L$2 = toolbarUIState8;
                                        mTicketTripInfoUIStateFactory$convertToUIState$1.L$3 = buttonUIState6;
                                        mTicketTripInfoUIStateFactory$convertToUIState$1.L$4 = chaloTextUIState7;
                                        mTicketTripInfoUIStateFactory$convertToUIState$1.L$5 = loadingDialogUIState5;
                                        mTicketTripInfoUIStateFactory$convertToUIState$1.L$6 = productBookingBranding4;
                                        mTicketTripInfoUIStateFactory$convertToUIState$1.L$7 = snackbarUIState4;
                                        mTicketTripInfoUIStateFactory$convertToUIState$1.L$8 = routeSelectionInputUIState2;
                                        mTicketTripInfoUIStateFactory$convertToUIState$1.L$9 = routeSelectionInputUIStateC2;
                                        mTicketTripInfoUIStateFactory$convertToUIState$1.L$10 = this;
                                        mTicketTripInfoUIStateFactory$convertToUIState$1.L$11 = null;
                                        mTicketTripInfoUIStateFactory$convertToUIState$1.L$12 = null;
                                        mTicketTripInfoUIStateFactory$convertToUIState$1.label = 10;
                                        stringProvider2 = stringProvider16;
                                        objB9 = stringProvider2.b(StringEnum.HINT_END_STOP, new Object[0], mTicketTripInfoUIStateFactory$convertToUIState$1);
                                        coroutineSingletons4 = coroutineSingletons2;
                                        if (objB9 == coroutineSingletons4) {
                                            return coroutineSingletons4;
                                        }
                                        loadingDialogUIState6 = loadingDialogUIState5;
                                        obj8 = objB9;
                                        toolbarUIState9 = toolbarUIState8;
                                        routeSelectionInputUIState3 = routeSelectionInputUIStateC2;
                                        mTicketTripInfoUIStateFactory4 = this;
                                        str10 = (String) obj8;
                                        productBookingStopDetails2 = mTicketTripInfoDataState8.d;
                                        if (productBookingStopDetails2 != null) {
                                            str11 = str2;
                                        } else {
                                            str11 = str2;
                                        }
                                        coroutineSingletons5 = coroutineSingletons4;
                                        list4 = EmptyList.f17557a;
                                        stringProvider3 = stringProvider2;
                                        if (mTicketTripInfoDataState8.i == MTicketTripInfoMissingFieldError.TO_STOP) {
                                            mTicketTripInfoUIStateFactory$convertToUIState$1.L$0 = function9;
                                            mTicketTripInfoUIStateFactory$convertToUIState$1.L$1 = toolbarUIState9;
                                            mTicketTripInfoUIStateFactory$convertToUIState$1.L$2 = buttonUIState6;
                                            mTicketTripInfoUIStateFactory$convertToUIState$1.L$3 = chaloTextUIState7;
                                            mTicketTripInfoUIStateFactory$convertToUIState$1.L$4 = loadingDialogUIState6;
                                            mTicketTripInfoUIStateFactory$convertToUIState$1.L$5 = productBookingBranding4;
                                            mTicketTripInfoUIStateFactory$convertToUIState$1.L$6 = snackbarUIState4;
                                            mTicketTripInfoUIStateFactory$convertToUIState$1.L$7 = routeSelectionInputUIState2;
                                            mTicketTripInfoUIStateFactory$convertToUIState$1.L$8 = routeSelectionInputUIState3;
                                            mTicketTripInfoUIStateFactory$convertToUIState$1.L$9 = mTicketTripInfoUIStateFactory4;
                                            mTicketTripInfoUIStateFactory$convertToUIState$1.L$10 = str10;
                                            mTicketTripInfoUIStateFactory$convertToUIState$1.L$11 = str11;
                                            mTicketTripInfoUIStateFactory$convertToUIState$1.L$12 = list4;
                                            mTicketTripInfoUIStateFactory6 = mTicketTripInfoUIStateFactory4;
                                            mTicketTripInfoUIStateFactory$convertToUIState$1.label = 11;
                                            objB10 = stringProvider3.b(StringEnum.STATUS_ERROR_ENTER_STOP, new Object[0], mTicketTripInfoUIStateFactory$convertToUIState$1);
                                            if (objB10 == coroutineSingletons5) {
                                                return coroutineSingletons5;
                                            }
                                            chaloTextUIState9 = chaloTextUIState7;
                                            routeSelectionInputUIState6 = routeSelectionInputUIState2;
                                            productBookingBranding6 = productBookingBranding4;
                                            function10 = function9;
                                            buttonUIState7 = buttonUIState6;
                                            str13 = str10;
                                            toolbarUIState11 = toolbarUIState9;
                                            routeSelectionInputUIState7 = routeSelectionInputUIState3;
                                            snackbarUIState5 = snackbarUIState4;
                                            obj9 = objB10;
                                            loadingDialogUIState8 = loadingDialogUIState6;
                                            list5 = list4;
                                            mTicketTripInfoUIStateFactory7 = mTicketTripInfoUIStateFactory6;
                                            String str1117 = (String) obj9;
                                            Function1 function113 = function10;
                                            str12 = str1117;
                                            mTicketTripInfoUIStateFactory5 = mTicketTripInfoUIStateFactory7;
                                            list4 = list5;
                                            toolbarUIState10 = toolbarUIState11;
                                            function9 = function113;
                                            LoadingDialogUIState loadingDialogUIState110 = loadingDialogUIState8;
                                            snackbarUIState4 = snackbarUIState5;
                                            productBookingBranding5 = productBookingBranding6;
                                            loadingDialogUIState7 = loadingDialogUIState110;
                                            str10 = str13;
                                            routeSelectionInputUIState5 = routeSelectionInputUIState7;
                                            routeSelectionInputUIState4 = routeSelectionInputUIState6;
                                            chaloTextUIState8 = chaloTextUIState9;
                                            buttonUIState6 = buttonUIState7;
                                        } else {
                                            MTicketTripInfoUIStateFactory mTicketTripInfoUIStateFactory1111 = mTicketTripInfoUIStateFactory4;
                                            RouteSelectionInputUIState routeSelectionInputUIState19 = routeSelectionInputUIState2;
                                            loadingDialogUIState7 = loadingDialogUIState6;
                                            toolbarUIState10 = toolbarUIState9;
                                            routeSelectionInputUIState4 = routeSelectionInputUIState19;
                                            chaloTextUIState8 = chaloTextUIState7;
                                            routeSelectionInputUIState5 = routeSelectionInputUIState3;
                                            productBookingBranding5 = productBookingBranding4;
                                            mTicketTripInfoUIStateFactory5 = mTicketTripInfoUIStateFactory1111;
                                            str12 = null;
                                        }
                                        wg0 wg0Var1116 = new wg0(function9, 6);
                                        mTicketTripInfoUIStateFactory5.getClass();
                                        return new MTicketTripInfoUIState(toolbarUIState10, routeSelectionInputUIState4, routeSelectionInputUIState5, c(str10, str11, list4, str12, wg0Var1116), buttonUIState6, chaloTextUIState8, productBookingBranding5, loadingDialogUIState7, snackbarUIState4);
                                    }
                                }
                            }
                        }
                    } else {
                        mTicketTripInfoDataState5 = mTicketTripInfoDataState4;
                        chaloTextUIState = null;
                        function4 = function3;
                        buttonUIState = buttonUIStateG;
                        toolbarUIState3 = toolbarUIState2;
                        if (mTicketTripInfoDataState5.f) {
                            mTicketTripInfoUIStateFactory$convertToUIState$1.L$0 = mTicketTripInfoDataState5;
                            mTicketTripInfoUIStateFactory$convertToUIState$1.L$1 = function4;
                            mTicketTripInfoUIStateFactory$convertToUIState$1.L$2 = toolbarUIState3;
                            mTicketTripInfoUIStateFactory$convertToUIState$1.L$3 = buttonUIState;
                            mTicketTripInfoUIStateFactory$convertToUIState$1.L$4 = chaloTextUIState;
                            dialogUIStateFactory = DialogUIStateFactory.f9989a;
                            mTicketTripInfoUIStateFactory$convertToUIState$1.L$5 = dialogUIStateFactory;
                            mTicketTripInfoUIStateFactory$convertToUIState$1.label = 4;
                            objB4 = stringProvider4.b(StringEnum.LOADING, new Object[0], mTicketTripInfoUIStateFactory$convertToUIState$1);
                            if (objB4 != coroutineSingletons6) {
                                obj3 = objB4;
                                chaloTextUIState3 = chaloTextUIState;
                                dialogUIStateFactory2 = dialogUIStateFactory;
                                dialogUIStateFactory2.getClass();
                                loadingDialogUIStateA = DialogUIStateFactory.a((String) obj3);
                                mTicketTripInfoDataState7 = mTicketTripInfoDataState5;
                                function5 = function4;
                                toolbarUIState4 = toolbarUIState3;
                                buttonUIState2 = buttonUIState;
                                chaloTextUIState2 = chaloTextUIState3;
                                productBookingBranding = mTicketTripInfoDataState7.g;
                                mTicketTripInfoSnackBarType = mTicketTripInfoDataState7.e;
                                if (mTicketTripInfoSnackBarType != null) {
                                    mTicketTripInfoUIStateFactory$convertToUIState$1.L$0 = mTicketTripInfoDataState7;
                                    mTicketTripInfoUIStateFactory$convertToUIState$1.L$1 = function5;
                                    mTicketTripInfoUIStateFactory$convertToUIState$1.L$2 = toolbarUIState4;
                                    mTicketTripInfoUIStateFactory$convertToUIState$1.L$3 = buttonUIState2;
                                    mTicketTripInfoUIStateFactory$convertToUIState$1.L$4 = chaloTextUIState2;
                                    mTicketTripInfoUIStateFactory$convertToUIState$1.L$5 = loadingDialogUIStateA;
                                    mTicketTripInfoUIStateFactory$convertToUIState$1.L$6 = productBookingBranding;
                                    mTicketTripInfoUIStateFactory$convertToUIState$1.label = 5;
                                    objD = d(mTicketTripInfoSnackBarType, function5, mTicketTripInfoUIStateFactory$convertToUIState$1);
                                    if (objD != coroutineSingletons6) {
                                        TextUIState.ChaloTextUIState chaloTextUIState11110 = chaloTextUIState2;
                                        loadingDialogUIState = loadingDialogUIStateA;
                                        obj4 = objD;
                                        mTicketTripInfoDataState8 = mTicketTripInfoDataState7;
                                        function6 = function5;
                                        toolbarUIState5 = toolbarUIState4;
                                        buttonUIState3 = buttonUIState2;
                                        chaloTextUIState4 = chaloTextUIState11110;
                                        snackbarUIState = (SnackbarUIState) obj4;
                                        mTicketTripInfoUIStateFactory$convertToUIState$1.L$0 = mTicketTripInfoDataState8;
                                        mTicketTripInfoUIStateFactory$convertToUIState$1.L$1 = function6;
                                        mTicketTripInfoUIStateFactory$convertToUIState$1.L$2 = toolbarUIState5;
                                        mTicketTripInfoUIStateFactory$convertToUIState$1.L$3 = buttonUIState3;
                                        mTicketTripInfoUIStateFactory$convertToUIState$1.L$4 = chaloTextUIState4;
                                        mTicketTripInfoUIStateFactory$convertToUIState$1.L$5 = loadingDialogUIState;
                                        mTicketTripInfoUIStateFactory$convertToUIState$1.L$6 = productBookingBranding;
                                        mTicketTripInfoUIStateFactory$convertToUIState$1.L$7 = snackbarUIState;
                                        mTicketTripInfoUIStateFactory$convertToUIState$1.L$8 = this;
                                        mTicketTripInfoUIStateFactory$convertToUIState$1.label = 6;
                                        objB5 = stringProvider4.b(StringEnum.HINT_ROUTE_NUMBER, new Object[0], mTicketTripInfoUIStateFactory$convertToUIState$1);
                                        if (objB5 != coroutineSingletons6) {
                                            ButtonUIState buttonUIState110 = buttonUIState3;
                                            snackbarUIState2 = snackbarUIState;
                                            obj5 = objB5;
                                            buttonUIState4 = buttonUIState110;
                                            toolbarUIState6 = toolbarUIState5;
                                            function7 = function6;
                                            productBookingBranding2 = productBookingBranding;
                                            loadingDialogUIState2 = loadingDialogUIState;
                                            chaloTextUIState5 = chaloTextUIState4;
                                            mTicketTripInfoUIStateFactory = this;
                                            str = (String) obj5;
                                            productBookingRouteDetails = mTicketTripInfoDataState8.b;
                                            str2 = "";
                                            if (productBookingRouteDetails != null) {
                                                str3 = str2;
                                            } else {
                                                str3 = str2;
                                            }
                                            if (productBookingRouteDetails != null) {
                                                list = EmptyList.f17557a;
                                            } else {
                                                list = EmptyList.f17557a;
                                            }
                                            if (mTicketTripInfoDataState8.i == MTicketTripInfoMissingFieldError.ROUTE) {
                                                mTicketTripInfoUIStateFactory$convertToUIState$1.L$0 = mTicketTripInfoDataState8;
                                                mTicketTripInfoUIStateFactory$convertToUIState$1.L$1 = function7;
                                                mTicketTripInfoUIStateFactory$convertToUIState$1.L$2 = toolbarUIState6;
                                                mTicketTripInfoUIStateFactory$convertToUIState$1.L$3 = buttonUIState4;
                                                mTicketTripInfoUIStateFactory$convertToUIState$1.L$4 = chaloTextUIState5;
                                                mTicketTripInfoUIStateFactory$convertToUIState$1.L$5 = loadingDialogUIState2;
                                                mTicketTripInfoUIStateFactory$convertToUIState$1.L$6 = productBookingBranding2;
                                                mTicketTripInfoUIStateFactory$convertToUIState$1.L$7 = snackbarUIState2;
                                                mTicketTripInfoUIStateFactory$convertToUIState$1.L$8 = mTicketTripInfoUIStateFactory;
                                                mTicketTripInfoUIStateFactory$convertToUIState$1.L$9 = str;
                                                mTicketTripInfoUIStateFactory$convertToUIState$1.L$10 = str3;
                                                mTicketTripInfoUIStateFactory$convertToUIState$1.L$11 = list;
                                                mTicketTripInfoUIStateFactory$convertToUIState$1.label = 7;
                                                objB6 = stringProvider4.b(StringEnum.STATUS_ERROR_ROUTE_NUMBER, new Object[0], mTicketTripInfoUIStateFactory$convertToUIState$1);
                                                if (objB6 != coroutineSingletons6) {
                                                    coroutineSingletons6 = coroutineSingletons6;
                                                    List list18 = list;
                                                    obj6 = objB6;
                                                    list2 = list18;
                                                    String str1118 = str3;
                                                    chaloTextUIState6 = chaloTextUIState5;
                                                    str5 = str1118;
                                                    str4 = (String) obj6;
                                                    TextUIState.ChaloTextUIState chaloTextUIState11111 = chaloTextUIState6;
                                                    str3 = str5;
                                                    chaloTextUIState5 = chaloTextUIState11111;
                                                }
                                            } else {
                                                coroutineSingletons6 = coroutineSingletons6;
                                                list2 = list;
                                                str4 = null;
                                            }
                                            MTicketTripInfoUIStateFactory mTicketTripInfoUIStateFactory1112 = mTicketTripInfoUIStateFactory;
                                            wg0 wg0Var1117 = new wg0(function7, 4);
                                            mTicketTripInfoUIStateFactory1112.getClass();
                                            routeSelectionInputUIStateC = c(str, str3, list2, str4, wg0Var1117);
                                            mTicketTripInfoUIStateFactory$convertToUIState$1.L$0 = mTicketTripInfoDataState8;
                                            mTicketTripInfoUIStateFactory$convertToUIState$1.L$1 = function7;
                                            mTicketTripInfoUIStateFactory$convertToUIState$1.L$2 = toolbarUIState6;
                                            mTicketTripInfoUIStateFactory$convertToUIState$1.L$3 = buttonUIState4;
                                            mTicketTripInfoUIStateFactory$convertToUIState$1.L$4 = chaloTextUIState5;
                                            mTicketTripInfoUIStateFactory$convertToUIState$1.L$5 = loadingDialogUIState2;
                                            mTicketTripInfoUIStateFactory$convertToUIState$1.L$6 = productBookingBranding2;
                                            mTicketTripInfoUIStateFactory$convertToUIState$1.L$7 = snackbarUIState2;
                                            mTicketTripInfoUIStateFactory$convertToUIState$1.L$8 = routeSelectionInputUIStateC;
                                            mTicketTripInfoUIStateFactory$convertToUIState$1.L$9 = this;
                                            mTicketTripInfoUIStateFactory$convertToUIState$1.L$10 = null;
                                            mTicketTripInfoUIStateFactory$convertToUIState$1.L$11 = null;
                                            mTicketTripInfoUIStateFactory$convertToUIState$1.label = 8;
                                            objB7 = stringProvider4.b(StringEnum.HINT_START_STOP, new Object[0], mTicketTripInfoUIStateFactory$convertToUIState$1);
                                            coroutineSingletons = coroutineSingletons6;
                                            if (objB7 == coroutineSingletons) {
                                                return coroutineSingletons;
                                            }
                                            SnackbarUIState snackbarUIState11112 = snackbarUIState2;
                                            routeSelectionInputUIState = routeSelectionInputUIStateC;
                                            loadingDialogUIState3 = loadingDialogUIState2;
                                            productBookingBranding3 = productBookingBranding2;
                                            snackbarUIState3 = snackbarUIState11112;
                                            ToolbarUIState toolbarUIState114 = toolbarUIState6;
                                            buttonUIState5 = buttonUIState4;
                                            function8 = function7;
                                            toolbarUIState7 = toolbarUIState114;
                                            mTicketTripInfoUIStateFactory2 = this;
                                            str6 = (String) objB7;
                                            productBookingStopDetails = mTicketTripInfoDataState8.c;
                                            if (productBookingStopDetails != null) {
                                                str7 = str2;
                                            } else {
                                                str7 = str2;
                                            }
                                            list3 = EmptyList.f17557a;
                                            coroutineSingletons2 = coroutineSingletons;
                                            if (mTicketTripInfoDataState8.i == MTicketTripInfoMissingFieldError.FROM_STOP) {
                                                mTicketTripInfoUIStateFactory$convertToUIState$1.L$0 = mTicketTripInfoDataState8;
                                                mTicketTripInfoUIStateFactory$convertToUIState$1.L$1 = function8;
                                                mTicketTripInfoUIStateFactory$convertToUIState$1.L$2 = toolbarUIState7;
                                                mTicketTripInfoUIStateFactory$convertToUIState$1.L$3 = buttonUIState5;
                                                mTicketTripInfoUIStateFactory$convertToUIState$1.L$4 = chaloTextUIState5;
                                                mTicketTripInfoUIStateFactory$convertToUIState$1.L$5 = loadingDialogUIState3;
                                                mTicketTripInfoUIStateFactory$convertToUIState$1.L$6 = productBookingBranding3;
                                                mTicketTripInfoUIStateFactory$convertToUIState$1.L$7 = snackbarUIState3;
                                                mTicketTripInfoUIStateFactory$convertToUIState$1.L$8 = routeSelectionInputUIState;
                                                mTicketTripInfoUIStateFactory$convertToUIState$1.L$9 = mTicketTripInfoUIStateFactory2;
                                                mTicketTripInfoUIStateFactory$convertToUIState$1.L$10 = str6;
                                                mTicketTripInfoUIStateFactory$convertToUIState$1.L$11 = str7;
                                                mTicketTripInfoUIStateFactory$convertToUIState$1.L$12 = list3;
                                                mTicketTripInfoUIStateFactory$convertToUIState$1.label = 9;
                                                loadingDialogUIState4 = loadingDialogUIState3;
                                                stringProvider = stringProvider4;
                                                objB8 = stringProvider.b(StringEnum.STATUS_ERROR_ENTER_STOP, new Object[0], mTicketTripInfoUIStateFactory$convertToUIState$1);
                                                coroutineSingletons3 = coroutineSingletons2;
                                                if (objB8 == coroutineSingletons3) {
                                                    return coroutineSingletons3;
                                                }
                                                TextUIState.ChaloTextUIState chaloTextUIState11112 = chaloTextUIState5;
                                                str9 = str7;
                                                obj7 = objB8;
                                                chaloTextUIState7 = chaloTextUIState11112;
                                                SnackbarUIState snackbarUIState11113 = snackbarUIState3;
                                                routeSelectionInputUIState2 = routeSelectionInputUIState;
                                                toolbarUIState8 = toolbarUIState7;
                                                buttonUIState6 = buttonUIState5;
                                                function9 = function8;
                                                productBookingBranding4 = productBookingBranding3;
                                                snackbarUIState4 = snackbarUIState11113;
                                                coroutineSingletons2 = coroutineSingletons3;
                                                mTicketTripInfoUIStateFactory3 = mTicketTripInfoUIStateFactory2;
                                                str8 = (String) obj7;
                                            } else {
                                                loadingDialogUIState4 = loadingDialogUIState3;
                                                stringProvider = stringProvider4;
                                                SnackbarUIState snackbarUIState11114 = snackbarUIState3;
                                                routeSelectionInputUIState2 = routeSelectionInputUIState;
                                                toolbarUIState8 = toolbarUIState7;
                                                buttonUIState6 = buttonUIState5;
                                                function9 = function8;
                                                productBookingBranding4 = productBookingBranding3;
                                                snackbarUIState4 = snackbarUIState11114;
                                                chaloTextUIState7 = chaloTextUIState5;
                                                mTicketTripInfoUIStateFactory3 = mTicketTripInfoUIStateFactory2;
                                                str8 = null;
                                                str9 = str7;
                                            }
                                            loadingDialogUIState5 = loadingDialogUIState4;
                                            StringProvider stringProvider17 = stringProvider;
                                            wg0 wg0Var1118 = new wg0(function9, 5);
                                            mTicketTripInfoUIStateFactory3.getClass();
                                            routeSelectionInputUIStateC2 = c(str6, str9, list3, str8, wg0Var1118);
                                            mTicketTripInfoUIStateFactory$convertToUIState$1.L$0 = mTicketTripInfoDataState8;
                                            mTicketTripInfoUIStateFactory$convertToUIState$1.L$1 = function9;
                                            mTicketTripInfoUIStateFactory$convertToUIState$1.L$2 = toolbarUIState8;
                                            mTicketTripInfoUIStateFactory$convertToUIState$1.L$3 = buttonUIState6;
                                            mTicketTripInfoUIStateFactory$convertToUIState$1.L$4 = chaloTextUIState7;
                                            mTicketTripInfoUIStateFactory$convertToUIState$1.L$5 = loadingDialogUIState5;
                                            mTicketTripInfoUIStateFactory$convertToUIState$1.L$6 = productBookingBranding4;
                                            mTicketTripInfoUIStateFactory$convertToUIState$1.L$7 = snackbarUIState4;
                                            mTicketTripInfoUIStateFactory$convertToUIState$1.L$8 = routeSelectionInputUIState2;
                                            mTicketTripInfoUIStateFactory$convertToUIState$1.L$9 = routeSelectionInputUIStateC2;
                                            mTicketTripInfoUIStateFactory$convertToUIState$1.L$10 = this;
                                            mTicketTripInfoUIStateFactory$convertToUIState$1.L$11 = null;
                                            mTicketTripInfoUIStateFactory$convertToUIState$1.L$12 = null;
                                            mTicketTripInfoUIStateFactory$convertToUIState$1.label = 10;
                                            stringProvider2 = stringProvider17;
                                            objB9 = stringProvider2.b(StringEnum.HINT_END_STOP, new Object[0], mTicketTripInfoUIStateFactory$convertToUIState$1);
                                            coroutineSingletons4 = coroutineSingletons2;
                                            if (objB9 == coroutineSingletons4) {
                                                return coroutineSingletons4;
                                            }
                                            loadingDialogUIState6 = loadingDialogUIState5;
                                            obj8 = objB9;
                                            toolbarUIState9 = toolbarUIState8;
                                            routeSelectionInputUIState3 = routeSelectionInputUIStateC2;
                                            mTicketTripInfoUIStateFactory4 = this;
                                            str10 = (String) obj8;
                                            productBookingStopDetails2 = mTicketTripInfoDataState8.d;
                                            if (productBookingStopDetails2 != null) {
                                                str11 = str2;
                                            } else {
                                                str11 = str2;
                                            }
                                            coroutineSingletons5 = coroutineSingletons4;
                                            list4 = EmptyList.f17557a;
                                            stringProvider3 = stringProvider2;
                                            if (mTicketTripInfoDataState8.i == MTicketTripInfoMissingFieldError.TO_STOP) {
                                                mTicketTripInfoUIStateFactory$convertToUIState$1.L$0 = function9;
                                                mTicketTripInfoUIStateFactory$convertToUIState$1.L$1 = toolbarUIState9;
                                                mTicketTripInfoUIStateFactory$convertToUIState$1.L$2 = buttonUIState6;
                                                mTicketTripInfoUIStateFactory$convertToUIState$1.L$3 = chaloTextUIState7;
                                                mTicketTripInfoUIStateFactory$convertToUIState$1.L$4 = loadingDialogUIState6;
                                                mTicketTripInfoUIStateFactory$convertToUIState$1.L$5 = productBookingBranding4;
                                                mTicketTripInfoUIStateFactory$convertToUIState$1.L$6 = snackbarUIState4;
                                                mTicketTripInfoUIStateFactory$convertToUIState$1.L$7 = routeSelectionInputUIState2;
                                                mTicketTripInfoUIStateFactory$convertToUIState$1.L$8 = routeSelectionInputUIState3;
                                                mTicketTripInfoUIStateFactory$convertToUIState$1.L$9 = mTicketTripInfoUIStateFactory4;
                                                mTicketTripInfoUIStateFactory$convertToUIState$1.L$10 = str10;
                                                mTicketTripInfoUIStateFactory$convertToUIState$1.L$11 = str11;
                                                mTicketTripInfoUIStateFactory$convertToUIState$1.L$12 = list4;
                                                mTicketTripInfoUIStateFactory6 = mTicketTripInfoUIStateFactory4;
                                                mTicketTripInfoUIStateFactory$convertToUIState$1.label = 11;
                                                objB10 = stringProvider3.b(StringEnum.STATUS_ERROR_ENTER_STOP, new Object[0], mTicketTripInfoUIStateFactory$convertToUIState$1);
                                                if (objB10 == coroutineSingletons5) {
                                                    return coroutineSingletons5;
                                                }
                                                chaloTextUIState9 = chaloTextUIState7;
                                                routeSelectionInputUIState6 = routeSelectionInputUIState2;
                                                productBookingBranding6 = productBookingBranding4;
                                                function10 = function9;
                                                buttonUIState7 = buttonUIState6;
                                                str13 = str10;
                                                toolbarUIState11 = toolbarUIState9;
                                                routeSelectionInputUIState7 = routeSelectionInputUIState3;
                                                snackbarUIState5 = snackbarUIState4;
                                                obj9 = objB10;
                                                loadingDialogUIState8 = loadingDialogUIState6;
                                                list5 = list4;
                                                mTicketTripInfoUIStateFactory7 = mTicketTripInfoUIStateFactory6;
                                                String str1119 = (String) obj9;
                                                Function1 function114 = function10;
                                                str12 = str1119;
                                                mTicketTripInfoUIStateFactory5 = mTicketTripInfoUIStateFactory7;
                                                list4 = list5;
                                                toolbarUIState10 = toolbarUIState11;
                                                function9 = function114;
                                                LoadingDialogUIState loadingDialogUIState111 = loadingDialogUIState8;
                                                snackbarUIState4 = snackbarUIState5;
                                                productBookingBranding5 = productBookingBranding6;
                                                loadingDialogUIState7 = loadingDialogUIState111;
                                                str10 = str13;
                                                routeSelectionInputUIState5 = routeSelectionInputUIState7;
                                                routeSelectionInputUIState4 = routeSelectionInputUIState6;
                                                chaloTextUIState8 = chaloTextUIState9;
                                                buttonUIState6 = buttonUIState7;
                                            } else {
                                                MTicketTripInfoUIStateFactory mTicketTripInfoUIStateFactory1113 = mTicketTripInfoUIStateFactory4;
                                                RouteSelectionInputUIState routeSelectionInputUIState110 = routeSelectionInputUIState2;
                                                loadingDialogUIState7 = loadingDialogUIState6;
                                                toolbarUIState10 = toolbarUIState9;
                                                routeSelectionInputUIState4 = routeSelectionInputUIState110;
                                                chaloTextUIState8 = chaloTextUIState7;
                                                routeSelectionInputUIState5 = routeSelectionInputUIState3;
                                                productBookingBranding5 = productBookingBranding4;
                                                mTicketTripInfoUIStateFactory5 = mTicketTripInfoUIStateFactory1113;
                                                str12 = null;
                                            }
                                            wg0 wg0Var1119 = new wg0(function9, 6);
                                            mTicketTripInfoUIStateFactory5.getClass();
                                            return new MTicketTripInfoUIState(toolbarUIState10, routeSelectionInputUIState4, routeSelectionInputUIState5, c(str10, str11, list4, str12, wg0Var1119), buttonUIState6, chaloTextUIState8, productBookingBranding5, loadingDialogUIState7, snackbarUIState4);
                                        }
                                    }
                                } else {
                                    mTicketTripInfoDataState8 = mTicketTripInfoDataState7;
                                    function6 = function5;
                                    toolbarUIState5 = toolbarUIState4;
                                    buttonUIState3 = buttonUIState2;
                                    chaloTextUIState4 = chaloTextUIState2;
                                    loadingDialogUIState = loadingDialogUIStateA;
                                    snackbarUIState = null;
                                    mTicketTripInfoUIStateFactory$convertToUIState$1.L$0 = mTicketTripInfoDataState8;
                                    mTicketTripInfoUIStateFactory$convertToUIState$1.L$1 = function6;
                                    mTicketTripInfoUIStateFactory$convertToUIState$1.L$2 = toolbarUIState5;
                                    mTicketTripInfoUIStateFactory$convertToUIState$1.L$3 = buttonUIState3;
                                    mTicketTripInfoUIStateFactory$convertToUIState$1.L$4 = chaloTextUIState4;
                                    mTicketTripInfoUIStateFactory$convertToUIState$1.L$5 = loadingDialogUIState;
                                    mTicketTripInfoUIStateFactory$convertToUIState$1.L$6 = productBookingBranding;
                                    mTicketTripInfoUIStateFactory$convertToUIState$1.L$7 = snackbarUIState;
                                    mTicketTripInfoUIStateFactory$convertToUIState$1.L$8 = this;
                                    mTicketTripInfoUIStateFactory$convertToUIState$1.label = 6;
                                    objB5 = stringProvider4.b(StringEnum.HINT_ROUTE_NUMBER, new Object[0], mTicketTripInfoUIStateFactory$convertToUIState$1);
                                    if (objB5 != coroutineSingletons6) {
                                        ButtonUIState buttonUIState111 = buttonUIState3;
                                        snackbarUIState2 = snackbarUIState;
                                        obj5 = objB5;
                                        buttonUIState4 = buttonUIState111;
                                        toolbarUIState6 = toolbarUIState5;
                                        function7 = function6;
                                        productBookingBranding2 = productBookingBranding;
                                        loadingDialogUIState2 = loadingDialogUIState;
                                        chaloTextUIState5 = chaloTextUIState4;
                                        mTicketTripInfoUIStateFactory = this;
                                        str = (String) obj5;
                                        productBookingRouteDetails = mTicketTripInfoDataState8.b;
                                        str2 = "";
                                        if (productBookingRouteDetails != null) {
                                            str3 = str2;
                                        } else {
                                            str3 = str2;
                                        }
                                        if (productBookingRouteDetails != null) {
                                            list = EmptyList.f17557a;
                                        } else {
                                            list = EmptyList.f17557a;
                                        }
                                        if (mTicketTripInfoDataState8.i == MTicketTripInfoMissingFieldError.ROUTE) {
                                            mTicketTripInfoUIStateFactory$convertToUIState$1.L$0 = mTicketTripInfoDataState8;
                                            mTicketTripInfoUIStateFactory$convertToUIState$1.L$1 = function7;
                                            mTicketTripInfoUIStateFactory$convertToUIState$1.L$2 = toolbarUIState6;
                                            mTicketTripInfoUIStateFactory$convertToUIState$1.L$3 = buttonUIState4;
                                            mTicketTripInfoUIStateFactory$convertToUIState$1.L$4 = chaloTextUIState5;
                                            mTicketTripInfoUIStateFactory$convertToUIState$1.L$5 = loadingDialogUIState2;
                                            mTicketTripInfoUIStateFactory$convertToUIState$1.L$6 = productBookingBranding2;
                                            mTicketTripInfoUIStateFactory$convertToUIState$1.L$7 = snackbarUIState2;
                                            mTicketTripInfoUIStateFactory$convertToUIState$1.L$8 = mTicketTripInfoUIStateFactory;
                                            mTicketTripInfoUIStateFactory$convertToUIState$1.L$9 = str;
                                            mTicketTripInfoUIStateFactory$convertToUIState$1.L$10 = str3;
                                            mTicketTripInfoUIStateFactory$convertToUIState$1.L$11 = list;
                                            mTicketTripInfoUIStateFactory$convertToUIState$1.label = 7;
                                            objB6 = stringProvider4.b(StringEnum.STATUS_ERROR_ROUTE_NUMBER, new Object[0], mTicketTripInfoUIStateFactory$convertToUIState$1);
                                            if (objB6 != coroutineSingletons6) {
                                                coroutineSingletons6 = coroutineSingletons6;
                                                List list19 = list;
                                                obj6 = objB6;
                                                list2 = list19;
                                                String str11110 = str3;
                                                chaloTextUIState6 = chaloTextUIState5;
                                                str5 = str11110;
                                                str4 = (String) obj6;
                                                TextUIState.ChaloTextUIState chaloTextUIState11113 = chaloTextUIState6;
                                                str3 = str5;
                                                chaloTextUIState5 = chaloTextUIState11113;
                                            }
                                        } else {
                                            coroutineSingletons6 = coroutineSingletons6;
                                            list2 = list;
                                            str4 = null;
                                        }
                                        MTicketTripInfoUIStateFactory mTicketTripInfoUIStateFactory1114 = mTicketTripInfoUIStateFactory;
                                        wg0 wg0Var11110 = new wg0(function7, 4);
                                        mTicketTripInfoUIStateFactory1114.getClass();
                                        routeSelectionInputUIStateC = c(str, str3, list2, str4, wg0Var11110);
                                        mTicketTripInfoUIStateFactory$convertToUIState$1.L$0 = mTicketTripInfoDataState8;
                                        mTicketTripInfoUIStateFactory$convertToUIState$1.L$1 = function7;
                                        mTicketTripInfoUIStateFactory$convertToUIState$1.L$2 = toolbarUIState6;
                                        mTicketTripInfoUIStateFactory$convertToUIState$1.L$3 = buttonUIState4;
                                        mTicketTripInfoUIStateFactory$convertToUIState$1.L$4 = chaloTextUIState5;
                                        mTicketTripInfoUIStateFactory$convertToUIState$1.L$5 = loadingDialogUIState2;
                                        mTicketTripInfoUIStateFactory$convertToUIState$1.L$6 = productBookingBranding2;
                                        mTicketTripInfoUIStateFactory$convertToUIState$1.L$7 = snackbarUIState2;
                                        mTicketTripInfoUIStateFactory$convertToUIState$1.L$8 = routeSelectionInputUIStateC;
                                        mTicketTripInfoUIStateFactory$convertToUIState$1.L$9 = this;
                                        mTicketTripInfoUIStateFactory$convertToUIState$1.L$10 = null;
                                        mTicketTripInfoUIStateFactory$convertToUIState$1.L$11 = null;
                                        mTicketTripInfoUIStateFactory$convertToUIState$1.label = 8;
                                        objB7 = stringProvider4.b(StringEnum.HINT_START_STOP, new Object[0], mTicketTripInfoUIStateFactory$convertToUIState$1);
                                        coroutineSingletons = coroutineSingletons6;
                                        if (objB7 == coroutineSingletons) {
                                            return coroutineSingletons;
                                        }
                                        SnackbarUIState snackbarUIState11115 = snackbarUIState2;
                                        routeSelectionInputUIState = routeSelectionInputUIStateC;
                                        loadingDialogUIState3 = loadingDialogUIState2;
                                        productBookingBranding3 = productBookingBranding2;
                                        snackbarUIState3 = snackbarUIState11115;
                                        ToolbarUIState toolbarUIState115 = toolbarUIState6;
                                        buttonUIState5 = buttonUIState4;
                                        function8 = function7;
                                        toolbarUIState7 = toolbarUIState115;
                                        mTicketTripInfoUIStateFactory2 = this;
                                        str6 = (String) objB7;
                                        productBookingStopDetails = mTicketTripInfoDataState8.c;
                                        if (productBookingStopDetails != null) {
                                            str7 = str2;
                                        } else {
                                            str7 = str2;
                                        }
                                        list3 = EmptyList.f17557a;
                                        coroutineSingletons2 = coroutineSingletons;
                                        if (mTicketTripInfoDataState8.i == MTicketTripInfoMissingFieldError.FROM_STOP) {
                                            mTicketTripInfoUIStateFactory$convertToUIState$1.L$0 = mTicketTripInfoDataState8;
                                            mTicketTripInfoUIStateFactory$convertToUIState$1.L$1 = function8;
                                            mTicketTripInfoUIStateFactory$convertToUIState$1.L$2 = toolbarUIState7;
                                            mTicketTripInfoUIStateFactory$convertToUIState$1.L$3 = buttonUIState5;
                                            mTicketTripInfoUIStateFactory$convertToUIState$1.L$4 = chaloTextUIState5;
                                            mTicketTripInfoUIStateFactory$convertToUIState$1.L$5 = loadingDialogUIState3;
                                            mTicketTripInfoUIStateFactory$convertToUIState$1.L$6 = productBookingBranding3;
                                            mTicketTripInfoUIStateFactory$convertToUIState$1.L$7 = snackbarUIState3;
                                            mTicketTripInfoUIStateFactory$convertToUIState$1.L$8 = routeSelectionInputUIState;
                                            mTicketTripInfoUIStateFactory$convertToUIState$1.L$9 = mTicketTripInfoUIStateFactory2;
                                            mTicketTripInfoUIStateFactory$convertToUIState$1.L$10 = str6;
                                            mTicketTripInfoUIStateFactory$convertToUIState$1.L$11 = str7;
                                            mTicketTripInfoUIStateFactory$convertToUIState$1.L$12 = list3;
                                            mTicketTripInfoUIStateFactory$convertToUIState$1.label = 9;
                                            loadingDialogUIState4 = loadingDialogUIState3;
                                            stringProvider = stringProvider4;
                                            objB8 = stringProvider.b(StringEnum.STATUS_ERROR_ENTER_STOP, new Object[0], mTicketTripInfoUIStateFactory$convertToUIState$1);
                                            coroutineSingletons3 = coroutineSingletons2;
                                            if (objB8 == coroutineSingletons3) {
                                                return coroutineSingletons3;
                                            }
                                            TextUIState.ChaloTextUIState chaloTextUIState11114 = chaloTextUIState5;
                                            str9 = str7;
                                            obj7 = objB8;
                                            chaloTextUIState7 = chaloTextUIState11114;
                                            SnackbarUIState snackbarUIState11116 = snackbarUIState3;
                                            routeSelectionInputUIState2 = routeSelectionInputUIState;
                                            toolbarUIState8 = toolbarUIState7;
                                            buttonUIState6 = buttonUIState5;
                                            function9 = function8;
                                            productBookingBranding4 = productBookingBranding3;
                                            snackbarUIState4 = snackbarUIState11116;
                                            coroutineSingletons2 = coroutineSingletons3;
                                            mTicketTripInfoUIStateFactory3 = mTicketTripInfoUIStateFactory2;
                                            str8 = (String) obj7;
                                        } else {
                                            loadingDialogUIState4 = loadingDialogUIState3;
                                            stringProvider = stringProvider4;
                                            SnackbarUIState snackbarUIState11117 = snackbarUIState3;
                                            routeSelectionInputUIState2 = routeSelectionInputUIState;
                                            toolbarUIState8 = toolbarUIState7;
                                            buttonUIState6 = buttonUIState5;
                                            function9 = function8;
                                            productBookingBranding4 = productBookingBranding3;
                                            snackbarUIState4 = snackbarUIState11117;
                                            chaloTextUIState7 = chaloTextUIState5;
                                            mTicketTripInfoUIStateFactory3 = mTicketTripInfoUIStateFactory2;
                                            str8 = null;
                                            str9 = str7;
                                        }
                                        loadingDialogUIState5 = loadingDialogUIState4;
                                        StringProvider stringProvider18 = stringProvider;
                                        wg0 wg0Var11111 = new wg0(function9, 5);
                                        mTicketTripInfoUIStateFactory3.getClass();
                                        routeSelectionInputUIStateC2 = c(str6, str9, list3, str8, wg0Var11111);
                                        mTicketTripInfoUIStateFactory$convertToUIState$1.L$0 = mTicketTripInfoDataState8;
                                        mTicketTripInfoUIStateFactory$convertToUIState$1.L$1 = function9;
                                        mTicketTripInfoUIStateFactory$convertToUIState$1.L$2 = toolbarUIState8;
                                        mTicketTripInfoUIStateFactory$convertToUIState$1.L$3 = buttonUIState6;
                                        mTicketTripInfoUIStateFactory$convertToUIState$1.L$4 = chaloTextUIState7;
                                        mTicketTripInfoUIStateFactory$convertToUIState$1.L$5 = loadingDialogUIState5;
                                        mTicketTripInfoUIStateFactory$convertToUIState$1.L$6 = productBookingBranding4;
                                        mTicketTripInfoUIStateFactory$convertToUIState$1.L$7 = snackbarUIState4;
                                        mTicketTripInfoUIStateFactory$convertToUIState$1.L$8 = routeSelectionInputUIState2;
                                        mTicketTripInfoUIStateFactory$convertToUIState$1.L$9 = routeSelectionInputUIStateC2;
                                        mTicketTripInfoUIStateFactory$convertToUIState$1.L$10 = this;
                                        mTicketTripInfoUIStateFactory$convertToUIState$1.L$11 = null;
                                        mTicketTripInfoUIStateFactory$convertToUIState$1.L$12 = null;
                                        mTicketTripInfoUIStateFactory$convertToUIState$1.label = 10;
                                        stringProvider2 = stringProvider18;
                                        objB9 = stringProvider2.b(StringEnum.HINT_END_STOP, new Object[0], mTicketTripInfoUIStateFactory$convertToUIState$1);
                                        coroutineSingletons4 = coroutineSingletons2;
                                        if (objB9 == coroutineSingletons4) {
                                            return coroutineSingletons4;
                                        }
                                        loadingDialogUIState6 = loadingDialogUIState5;
                                        obj8 = objB9;
                                        toolbarUIState9 = toolbarUIState8;
                                        routeSelectionInputUIState3 = routeSelectionInputUIStateC2;
                                        mTicketTripInfoUIStateFactory4 = this;
                                        str10 = (String) obj8;
                                        productBookingStopDetails2 = mTicketTripInfoDataState8.d;
                                        if (productBookingStopDetails2 != null) {
                                            str11 = str2;
                                        } else {
                                            str11 = str2;
                                        }
                                        coroutineSingletons5 = coroutineSingletons4;
                                        list4 = EmptyList.f17557a;
                                        stringProvider3 = stringProvider2;
                                        if (mTicketTripInfoDataState8.i == MTicketTripInfoMissingFieldError.TO_STOP) {
                                            mTicketTripInfoUIStateFactory$convertToUIState$1.L$0 = function9;
                                            mTicketTripInfoUIStateFactory$convertToUIState$1.L$1 = toolbarUIState9;
                                            mTicketTripInfoUIStateFactory$convertToUIState$1.L$2 = buttonUIState6;
                                            mTicketTripInfoUIStateFactory$convertToUIState$1.L$3 = chaloTextUIState7;
                                            mTicketTripInfoUIStateFactory$convertToUIState$1.L$4 = loadingDialogUIState6;
                                            mTicketTripInfoUIStateFactory$convertToUIState$1.L$5 = productBookingBranding4;
                                            mTicketTripInfoUIStateFactory$convertToUIState$1.L$6 = snackbarUIState4;
                                            mTicketTripInfoUIStateFactory$convertToUIState$1.L$7 = routeSelectionInputUIState2;
                                            mTicketTripInfoUIStateFactory$convertToUIState$1.L$8 = routeSelectionInputUIState3;
                                            mTicketTripInfoUIStateFactory$convertToUIState$1.L$9 = mTicketTripInfoUIStateFactory4;
                                            mTicketTripInfoUIStateFactory$convertToUIState$1.L$10 = str10;
                                            mTicketTripInfoUIStateFactory$convertToUIState$1.L$11 = str11;
                                            mTicketTripInfoUIStateFactory$convertToUIState$1.L$12 = list4;
                                            mTicketTripInfoUIStateFactory6 = mTicketTripInfoUIStateFactory4;
                                            mTicketTripInfoUIStateFactory$convertToUIState$1.label = 11;
                                            objB10 = stringProvider3.b(StringEnum.STATUS_ERROR_ENTER_STOP, new Object[0], mTicketTripInfoUIStateFactory$convertToUIState$1);
                                            if (objB10 == coroutineSingletons5) {
                                                return coroutineSingletons5;
                                            }
                                            chaloTextUIState9 = chaloTextUIState7;
                                            routeSelectionInputUIState6 = routeSelectionInputUIState2;
                                            productBookingBranding6 = productBookingBranding4;
                                            function10 = function9;
                                            buttonUIState7 = buttonUIState6;
                                            str13 = str10;
                                            toolbarUIState11 = toolbarUIState9;
                                            routeSelectionInputUIState7 = routeSelectionInputUIState3;
                                            snackbarUIState5 = snackbarUIState4;
                                            obj9 = objB10;
                                            loadingDialogUIState8 = loadingDialogUIState6;
                                            list5 = list4;
                                            mTicketTripInfoUIStateFactory7 = mTicketTripInfoUIStateFactory6;
                                            String str11111 = (String) obj9;
                                            Function1 function115 = function10;
                                            str12 = str11111;
                                            mTicketTripInfoUIStateFactory5 = mTicketTripInfoUIStateFactory7;
                                            list4 = list5;
                                            toolbarUIState10 = toolbarUIState11;
                                            function9 = function115;
                                            LoadingDialogUIState loadingDialogUIState112 = loadingDialogUIState8;
                                            snackbarUIState4 = snackbarUIState5;
                                            productBookingBranding5 = productBookingBranding6;
                                            loadingDialogUIState7 = loadingDialogUIState112;
                                            str10 = str13;
                                            routeSelectionInputUIState5 = routeSelectionInputUIState7;
                                            routeSelectionInputUIState4 = routeSelectionInputUIState6;
                                            chaloTextUIState8 = chaloTextUIState9;
                                            buttonUIState6 = buttonUIState7;
                                        } else {
                                            MTicketTripInfoUIStateFactory mTicketTripInfoUIStateFactory1115 = mTicketTripInfoUIStateFactory4;
                                            RouteSelectionInputUIState routeSelectionInputUIState111 = routeSelectionInputUIState2;
                                            loadingDialogUIState7 = loadingDialogUIState6;
                                            toolbarUIState10 = toolbarUIState9;
                                            routeSelectionInputUIState4 = routeSelectionInputUIState111;
                                            chaloTextUIState8 = chaloTextUIState7;
                                            routeSelectionInputUIState5 = routeSelectionInputUIState3;
                                            productBookingBranding5 = productBookingBranding4;
                                            mTicketTripInfoUIStateFactory5 = mTicketTripInfoUIStateFactory1115;
                                            str12 = null;
                                        }
                                        wg0 wg0Var11112 = new wg0(function9, 6);
                                        mTicketTripInfoUIStateFactory5.getClass();
                                        return new MTicketTripInfoUIState(toolbarUIState10, routeSelectionInputUIState4, routeSelectionInputUIState5, c(str10, str11, list4, str12, wg0Var11112), buttonUIState6, chaloTextUIState8, productBookingBranding5, loadingDialogUIState7, snackbarUIState4);
                                    }
                                }
                            }
                        } else {
                            mTicketTripInfoDataState7 = mTicketTripInfoDataState5;
                            function5 = function4;
                            toolbarUIState4 = toolbarUIState3;
                            buttonUIState2 = buttonUIState;
                            chaloTextUIState2 = chaloTextUIState;
                            loadingDialogUIStateA = null;
                            productBookingBranding = mTicketTripInfoDataState7.g;
                            mTicketTripInfoSnackBarType = mTicketTripInfoDataState7.e;
                            if (mTicketTripInfoSnackBarType != null) {
                                mTicketTripInfoUIStateFactory$convertToUIState$1.L$0 = mTicketTripInfoDataState7;
                                mTicketTripInfoUIStateFactory$convertToUIState$1.L$1 = function5;
                                mTicketTripInfoUIStateFactory$convertToUIState$1.L$2 = toolbarUIState4;
                                mTicketTripInfoUIStateFactory$convertToUIState$1.L$3 = buttonUIState2;
                                mTicketTripInfoUIStateFactory$convertToUIState$1.L$4 = chaloTextUIState2;
                                mTicketTripInfoUIStateFactory$convertToUIState$1.L$5 = loadingDialogUIStateA;
                                mTicketTripInfoUIStateFactory$convertToUIState$1.L$6 = productBookingBranding;
                                mTicketTripInfoUIStateFactory$convertToUIState$1.label = 5;
                                objD = d(mTicketTripInfoSnackBarType, function5, mTicketTripInfoUIStateFactory$convertToUIState$1);
                                if (objD != coroutineSingletons6) {
                                    TextUIState.ChaloTextUIState chaloTextUIState11115 = chaloTextUIState2;
                                    loadingDialogUIState = loadingDialogUIStateA;
                                    obj4 = objD;
                                    mTicketTripInfoDataState8 = mTicketTripInfoDataState7;
                                    function6 = function5;
                                    toolbarUIState5 = toolbarUIState4;
                                    buttonUIState3 = buttonUIState2;
                                    chaloTextUIState4 = chaloTextUIState11115;
                                    snackbarUIState = (SnackbarUIState) obj4;
                                    mTicketTripInfoUIStateFactory$convertToUIState$1.L$0 = mTicketTripInfoDataState8;
                                    mTicketTripInfoUIStateFactory$convertToUIState$1.L$1 = function6;
                                    mTicketTripInfoUIStateFactory$convertToUIState$1.L$2 = toolbarUIState5;
                                    mTicketTripInfoUIStateFactory$convertToUIState$1.L$3 = buttonUIState3;
                                    mTicketTripInfoUIStateFactory$convertToUIState$1.L$4 = chaloTextUIState4;
                                    mTicketTripInfoUIStateFactory$convertToUIState$1.L$5 = loadingDialogUIState;
                                    mTicketTripInfoUIStateFactory$convertToUIState$1.L$6 = productBookingBranding;
                                    mTicketTripInfoUIStateFactory$convertToUIState$1.L$7 = snackbarUIState;
                                    mTicketTripInfoUIStateFactory$convertToUIState$1.L$8 = this;
                                    mTicketTripInfoUIStateFactory$convertToUIState$1.label = 6;
                                    objB5 = stringProvider4.b(StringEnum.HINT_ROUTE_NUMBER, new Object[0], mTicketTripInfoUIStateFactory$convertToUIState$1);
                                    if (objB5 != coroutineSingletons6) {
                                        ButtonUIState buttonUIState112 = buttonUIState3;
                                        snackbarUIState2 = snackbarUIState;
                                        obj5 = objB5;
                                        buttonUIState4 = buttonUIState112;
                                        toolbarUIState6 = toolbarUIState5;
                                        function7 = function6;
                                        productBookingBranding2 = productBookingBranding;
                                        loadingDialogUIState2 = loadingDialogUIState;
                                        chaloTextUIState5 = chaloTextUIState4;
                                        mTicketTripInfoUIStateFactory = this;
                                        str = (String) obj5;
                                        productBookingRouteDetails = mTicketTripInfoDataState8.b;
                                        str2 = "";
                                        if (productBookingRouteDetails != null) {
                                            str3 = str2;
                                        } else {
                                            str3 = str2;
                                        }
                                        if (productBookingRouteDetails != null) {
                                            list = EmptyList.f17557a;
                                        } else {
                                            list = EmptyList.f17557a;
                                        }
                                        if (mTicketTripInfoDataState8.i == MTicketTripInfoMissingFieldError.ROUTE) {
                                            mTicketTripInfoUIStateFactory$convertToUIState$1.L$0 = mTicketTripInfoDataState8;
                                            mTicketTripInfoUIStateFactory$convertToUIState$1.L$1 = function7;
                                            mTicketTripInfoUIStateFactory$convertToUIState$1.L$2 = toolbarUIState6;
                                            mTicketTripInfoUIStateFactory$convertToUIState$1.L$3 = buttonUIState4;
                                            mTicketTripInfoUIStateFactory$convertToUIState$1.L$4 = chaloTextUIState5;
                                            mTicketTripInfoUIStateFactory$convertToUIState$1.L$5 = loadingDialogUIState2;
                                            mTicketTripInfoUIStateFactory$convertToUIState$1.L$6 = productBookingBranding2;
                                            mTicketTripInfoUIStateFactory$convertToUIState$1.L$7 = snackbarUIState2;
                                            mTicketTripInfoUIStateFactory$convertToUIState$1.L$8 = mTicketTripInfoUIStateFactory;
                                            mTicketTripInfoUIStateFactory$convertToUIState$1.L$9 = str;
                                            mTicketTripInfoUIStateFactory$convertToUIState$1.L$10 = str3;
                                            mTicketTripInfoUIStateFactory$convertToUIState$1.L$11 = list;
                                            mTicketTripInfoUIStateFactory$convertToUIState$1.label = 7;
                                            objB6 = stringProvider4.b(StringEnum.STATUS_ERROR_ROUTE_NUMBER, new Object[0], mTicketTripInfoUIStateFactory$convertToUIState$1);
                                            if (objB6 != coroutineSingletons6) {
                                                coroutineSingletons6 = coroutineSingletons6;
                                                List list110 = list;
                                                obj6 = objB6;
                                                list2 = list110;
                                                String str11112 = str3;
                                                chaloTextUIState6 = chaloTextUIState5;
                                                str5 = str11112;
                                                str4 = (String) obj6;
                                                TextUIState.ChaloTextUIState chaloTextUIState11116 = chaloTextUIState6;
                                                str3 = str5;
                                                chaloTextUIState5 = chaloTextUIState11116;
                                            }
                                        } else {
                                            coroutineSingletons6 = coroutineSingletons6;
                                            list2 = list;
                                            str4 = null;
                                        }
                                        MTicketTripInfoUIStateFactory mTicketTripInfoUIStateFactory1116 = mTicketTripInfoUIStateFactory;
                                        wg0 wg0Var11113 = new wg0(function7, 4);
                                        mTicketTripInfoUIStateFactory1116.getClass();
                                        routeSelectionInputUIStateC = c(str, str3, list2, str4, wg0Var11113);
                                        mTicketTripInfoUIStateFactory$convertToUIState$1.L$0 = mTicketTripInfoDataState8;
                                        mTicketTripInfoUIStateFactory$convertToUIState$1.L$1 = function7;
                                        mTicketTripInfoUIStateFactory$convertToUIState$1.L$2 = toolbarUIState6;
                                        mTicketTripInfoUIStateFactory$convertToUIState$1.L$3 = buttonUIState4;
                                        mTicketTripInfoUIStateFactory$convertToUIState$1.L$4 = chaloTextUIState5;
                                        mTicketTripInfoUIStateFactory$convertToUIState$1.L$5 = loadingDialogUIState2;
                                        mTicketTripInfoUIStateFactory$convertToUIState$1.L$6 = productBookingBranding2;
                                        mTicketTripInfoUIStateFactory$convertToUIState$1.L$7 = snackbarUIState2;
                                        mTicketTripInfoUIStateFactory$convertToUIState$1.L$8 = routeSelectionInputUIStateC;
                                        mTicketTripInfoUIStateFactory$convertToUIState$1.L$9 = this;
                                        mTicketTripInfoUIStateFactory$convertToUIState$1.L$10 = null;
                                        mTicketTripInfoUIStateFactory$convertToUIState$1.L$11 = null;
                                        mTicketTripInfoUIStateFactory$convertToUIState$1.label = 8;
                                        objB7 = stringProvider4.b(StringEnum.HINT_START_STOP, new Object[0], mTicketTripInfoUIStateFactory$convertToUIState$1);
                                        coroutineSingletons = coroutineSingletons6;
                                        if (objB7 == coroutineSingletons) {
                                            return coroutineSingletons;
                                        }
                                        SnackbarUIState snackbarUIState11118 = snackbarUIState2;
                                        routeSelectionInputUIState = routeSelectionInputUIStateC;
                                        loadingDialogUIState3 = loadingDialogUIState2;
                                        productBookingBranding3 = productBookingBranding2;
                                        snackbarUIState3 = snackbarUIState11118;
                                        ToolbarUIState toolbarUIState116 = toolbarUIState6;
                                        buttonUIState5 = buttonUIState4;
                                        function8 = function7;
                                        toolbarUIState7 = toolbarUIState116;
                                        mTicketTripInfoUIStateFactory2 = this;
                                        str6 = (String) objB7;
                                        productBookingStopDetails = mTicketTripInfoDataState8.c;
                                        if (productBookingStopDetails != null) {
                                            str7 = str2;
                                        } else {
                                            str7 = str2;
                                        }
                                        list3 = EmptyList.f17557a;
                                        coroutineSingletons2 = coroutineSingletons;
                                        if (mTicketTripInfoDataState8.i == MTicketTripInfoMissingFieldError.FROM_STOP) {
                                            mTicketTripInfoUIStateFactory$convertToUIState$1.L$0 = mTicketTripInfoDataState8;
                                            mTicketTripInfoUIStateFactory$convertToUIState$1.L$1 = function8;
                                            mTicketTripInfoUIStateFactory$convertToUIState$1.L$2 = toolbarUIState7;
                                            mTicketTripInfoUIStateFactory$convertToUIState$1.L$3 = buttonUIState5;
                                            mTicketTripInfoUIStateFactory$convertToUIState$1.L$4 = chaloTextUIState5;
                                            mTicketTripInfoUIStateFactory$convertToUIState$1.L$5 = loadingDialogUIState3;
                                            mTicketTripInfoUIStateFactory$convertToUIState$1.L$6 = productBookingBranding3;
                                            mTicketTripInfoUIStateFactory$convertToUIState$1.L$7 = snackbarUIState3;
                                            mTicketTripInfoUIStateFactory$convertToUIState$1.L$8 = routeSelectionInputUIState;
                                            mTicketTripInfoUIStateFactory$convertToUIState$1.L$9 = mTicketTripInfoUIStateFactory2;
                                            mTicketTripInfoUIStateFactory$convertToUIState$1.L$10 = str6;
                                            mTicketTripInfoUIStateFactory$convertToUIState$1.L$11 = str7;
                                            mTicketTripInfoUIStateFactory$convertToUIState$1.L$12 = list3;
                                            mTicketTripInfoUIStateFactory$convertToUIState$1.label = 9;
                                            loadingDialogUIState4 = loadingDialogUIState3;
                                            stringProvider = stringProvider4;
                                            objB8 = stringProvider.b(StringEnum.STATUS_ERROR_ENTER_STOP, new Object[0], mTicketTripInfoUIStateFactory$convertToUIState$1);
                                            coroutineSingletons3 = coroutineSingletons2;
                                            if (objB8 == coroutineSingletons3) {
                                                return coroutineSingletons3;
                                            }
                                            TextUIState.ChaloTextUIState chaloTextUIState11117 = chaloTextUIState5;
                                            str9 = str7;
                                            obj7 = objB8;
                                            chaloTextUIState7 = chaloTextUIState11117;
                                            SnackbarUIState snackbarUIState11119 = snackbarUIState3;
                                            routeSelectionInputUIState2 = routeSelectionInputUIState;
                                            toolbarUIState8 = toolbarUIState7;
                                            buttonUIState6 = buttonUIState5;
                                            function9 = function8;
                                            productBookingBranding4 = productBookingBranding3;
                                            snackbarUIState4 = snackbarUIState11119;
                                            coroutineSingletons2 = coroutineSingletons3;
                                            mTicketTripInfoUIStateFactory3 = mTicketTripInfoUIStateFactory2;
                                            str8 = (String) obj7;
                                        } else {
                                            loadingDialogUIState4 = loadingDialogUIState3;
                                            stringProvider = stringProvider4;
                                            SnackbarUIState snackbarUIState111110 = snackbarUIState3;
                                            routeSelectionInputUIState2 = routeSelectionInputUIState;
                                            toolbarUIState8 = toolbarUIState7;
                                            buttonUIState6 = buttonUIState5;
                                            function9 = function8;
                                            productBookingBranding4 = productBookingBranding3;
                                            snackbarUIState4 = snackbarUIState111110;
                                            chaloTextUIState7 = chaloTextUIState5;
                                            mTicketTripInfoUIStateFactory3 = mTicketTripInfoUIStateFactory2;
                                            str8 = null;
                                            str9 = str7;
                                        }
                                        loadingDialogUIState5 = loadingDialogUIState4;
                                        StringProvider stringProvider19 = stringProvider;
                                        wg0 wg0Var11114 = new wg0(function9, 5);
                                        mTicketTripInfoUIStateFactory3.getClass();
                                        routeSelectionInputUIStateC2 = c(str6, str9, list3, str8, wg0Var11114);
                                        mTicketTripInfoUIStateFactory$convertToUIState$1.L$0 = mTicketTripInfoDataState8;
                                        mTicketTripInfoUIStateFactory$convertToUIState$1.L$1 = function9;
                                        mTicketTripInfoUIStateFactory$convertToUIState$1.L$2 = toolbarUIState8;
                                        mTicketTripInfoUIStateFactory$convertToUIState$1.L$3 = buttonUIState6;
                                        mTicketTripInfoUIStateFactory$convertToUIState$1.L$4 = chaloTextUIState7;
                                        mTicketTripInfoUIStateFactory$convertToUIState$1.L$5 = loadingDialogUIState5;
                                        mTicketTripInfoUIStateFactory$convertToUIState$1.L$6 = productBookingBranding4;
                                        mTicketTripInfoUIStateFactory$convertToUIState$1.L$7 = snackbarUIState4;
                                        mTicketTripInfoUIStateFactory$convertToUIState$1.L$8 = routeSelectionInputUIState2;
                                        mTicketTripInfoUIStateFactory$convertToUIState$1.L$9 = routeSelectionInputUIStateC2;
                                        mTicketTripInfoUIStateFactory$convertToUIState$1.L$10 = this;
                                        mTicketTripInfoUIStateFactory$convertToUIState$1.L$11 = null;
                                        mTicketTripInfoUIStateFactory$convertToUIState$1.L$12 = null;
                                        mTicketTripInfoUIStateFactory$convertToUIState$1.label = 10;
                                        stringProvider2 = stringProvider19;
                                        objB9 = stringProvider2.b(StringEnum.HINT_END_STOP, new Object[0], mTicketTripInfoUIStateFactory$convertToUIState$1);
                                        coroutineSingletons4 = coroutineSingletons2;
                                        if (objB9 == coroutineSingletons4) {
                                            return coroutineSingletons4;
                                        }
                                        loadingDialogUIState6 = loadingDialogUIState5;
                                        obj8 = objB9;
                                        toolbarUIState9 = toolbarUIState8;
                                        routeSelectionInputUIState3 = routeSelectionInputUIStateC2;
                                        mTicketTripInfoUIStateFactory4 = this;
                                        str10 = (String) obj8;
                                        productBookingStopDetails2 = mTicketTripInfoDataState8.d;
                                        if (productBookingStopDetails2 != null) {
                                            str11 = str2;
                                        } else {
                                            str11 = str2;
                                        }
                                        coroutineSingletons5 = coroutineSingletons4;
                                        list4 = EmptyList.f17557a;
                                        stringProvider3 = stringProvider2;
                                        if (mTicketTripInfoDataState8.i == MTicketTripInfoMissingFieldError.TO_STOP) {
                                            mTicketTripInfoUIStateFactory$convertToUIState$1.L$0 = function9;
                                            mTicketTripInfoUIStateFactory$convertToUIState$1.L$1 = toolbarUIState9;
                                            mTicketTripInfoUIStateFactory$convertToUIState$1.L$2 = buttonUIState6;
                                            mTicketTripInfoUIStateFactory$convertToUIState$1.L$3 = chaloTextUIState7;
                                            mTicketTripInfoUIStateFactory$convertToUIState$1.L$4 = loadingDialogUIState6;
                                            mTicketTripInfoUIStateFactory$convertToUIState$1.L$5 = productBookingBranding4;
                                            mTicketTripInfoUIStateFactory$convertToUIState$1.L$6 = snackbarUIState4;
                                            mTicketTripInfoUIStateFactory$convertToUIState$1.L$7 = routeSelectionInputUIState2;
                                            mTicketTripInfoUIStateFactory$convertToUIState$1.L$8 = routeSelectionInputUIState3;
                                            mTicketTripInfoUIStateFactory$convertToUIState$1.L$9 = mTicketTripInfoUIStateFactory4;
                                            mTicketTripInfoUIStateFactory$convertToUIState$1.L$10 = str10;
                                            mTicketTripInfoUIStateFactory$convertToUIState$1.L$11 = str11;
                                            mTicketTripInfoUIStateFactory$convertToUIState$1.L$12 = list4;
                                            mTicketTripInfoUIStateFactory6 = mTicketTripInfoUIStateFactory4;
                                            mTicketTripInfoUIStateFactory$convertToUIState$1.label = 11;
                                            objB10 = stringProvider3.b(StringEnum.STATUS_ERROR_ENTER_STOP, new Object[0], mTicketTripInfoUIStateFactory$convertToUIState$1);
                                            if (objB10 == coroutineSingletons5) {
                                                return coroutineSingletons5;
                                            }
                                            chaloTextUIState9 = chaloTextUIState7;
                                            routeSelectionInputUIState6 = routeSelectionInputUIState2;
                                            productBookingBranding6 = productBookingBranding4;
                                            function10 = function9;
                                            buttonUIState7 = buttonUIState6;
                                            str13 = str10;
                                            toolbarUIState11 = toolbarUIState9;
                                            routeSelectionInputUIState7 = routeSelectionInputUIState3;
                                            snackbarUIState5 = snackbarUIState4;
                                            obj9 = objB10;
                                            loadingDialogUIState8 = loadingDialogUIState6;
                                            list5 = list4;
                                            mTicketTripInfoUIStateFactory7 = mTicketTripInfoUIStateFactory6;
                                            String str11113 = (String) obj9;
                                            Function1 function116 = function10;
                                            str12 = str11113;
                                            mTicketTripInfoUIStateFactory5 = mTicketTripInfoUIStateFactory7;
                                            list4 = list5;
                                            toolbarUIState10 = toolbarUIState11;
                                            function9 = function116;
                                            LoadingDialogUIState loadingDialogUIState113 = loadingDialogUIState8;
                                            snackbarUIState4 = snackbarUIState5;
                                            productBookingBranding5 = productBookingBranding6;
                                            loadingDialogUIState7 = loadingDialogUIState113;
                                            str10 = str13;
                                            routeSelectionInputUIState5 = routeSelectionInputUIState7;
                                            routeSelectionInputUIState4 = routeSelectionInputUIState6;
                                            chaloTextUIState8 = chaloTextUIState9;
                                            buttonUIState6 = buttonUIState7;
                                        } else {
                                            MTicketTripInfoUIStateFactory mTicketTripInfoUIStateFactory1117 = mTicketTripInfoUIStateFactory4;
                                            RouteSelectionInputUIState routeSelectionInputUIState112 = routeSelectionInputUIState2;
                                            loadingDialogUIState7 = loadingDialogUIState6;
                                            toolbarUIState10 = toolbarUIState9;
                                            routeSelectionInputUIState4 = routeSelectionInputUIState112;
                                            chaloTextUIState8 = chaloTextUIState7;
                                            routeSelectionInputUIState5 = routeSelectionInputUIState3;
                                            productBookingBranding5 = productBookingBranding4;
                                            mTicketTripInfoUIStateFactory5 = mTicketTripInfoUIStateFactory1117;
                                            str12 = null;
                                        }
                                        wg0 wg0Var11115 = new wg0(function9, 6);
                                        mTicketTripInfoUIStateFactory5.getClass();
                                        return new MTicketTripInfoUIState(toolbarUIState10, routeSelectionInputUIState4, routeSelectionInputUIState5, c(str10, str11, list4, str12, wg0Var11115), buttonUIState6, chaloTextUIState8, productBookingBranding5, loadingDialogUIState7, snackbarUIState4);
                                    }
                                }
                            } else {
                                mTicketTripInfoDataState8 = mTicketTripInfoDataState7;
                                function6 = function5;
                                toolbarUIState5 = toolbarUIState4;
                                buttonUIState3 = buttonUIState2;
                                chaloTextUIState4 = chaloTextUIState2;
                                loadingDialogUIState = loadingDialogUIStateA;
                                snackbarUIState = null;
                                mTicketTripInfoUIStateFactory$convertToUIState$1.L$0 = mTicketTripInfoDataState8;
                                mTicketTripInfoUIStateFactory$convertToUIState$1.L$1 = function6;
                                mTicketTripInfoUIStateFactory$convertToUIState$1.L$2 = toolbarUIState5;
                                mTicketTripInfoUIStateFactory$convertToUIState$1.L$3 = buttonUIState3;
                                mTicketTripInfoUIStateFactory$convertToUIState$1.L$4 = chaloTextUIState4;
                                mTicketTripInfoUIStateFactory$convertToUIState$1.L$5 = loadingDialogUIState;
                                mTicketTripInfoUIStateFactory$convertToUIState$1.L$6 = productBookingBranding;
                                mTicketTripInfoUIStateFactory$convertToUIState$1.L$7 = snackbarUIState;
                                mTicketTripInfoUIStateFactory$convertToUIState$1.L$8 = this;
                                mTicketTripInfoUIStateFactory$convertToUIState$1.label = 6;
                                objB5 = stringProvider4.b(StringEnum.HINT_ROUTE_NUMBER, new Object[0], mTicketTripInfoUIStateFactory$convertToUIState$1);
                                if (objB5 != coroutineSingletons6) {
                                    ButtonUIState buttonUIState113 = buttonUIState3;
                                    snackbarUIState2 = snackbarUIState;
                                    obj5 = objB5;
                                    buttonUIState4 = buttonUIState113;
                                    toolbarUIState6 = toolbarUIState5;
                                    function7 = function6;
                                    productBookingBranding2 = productBookingBranding;
                                    loadingDialogUIState2 = loadingDialogUIState;
                                    chaloTextUIState5 = chaloTextUIState4;
                                    mTicketTripInfoUIStateFactory = this;
                                    str = (String) obj5;
                                    productBookingRouteDetails = mTicketTripInfoDataState8.b;
                                    str2 = "";
                                    if (productBookingRouteDetails != null) {
                                        str3 = str2;
                                    } else {
                                        str3 = str2;
                                    }
                                    if (productBookingRouteDetails != null) {
                                        list = EmptyList.f17557a;
                                    } else {
                                        list = EmptyList.f17557a;
                                    }
                                    if (mTicketTripInfoDataState8.i == MTicketTripInfoMissingFieldError.ROUTE) {
                                        mTicketTripInfoUIStateFactory$convertToUIState$1.L$0 = mTicketTripInfoDataState8;
                                        mTicketTripInfoUIStateFactory$convertToUIState$1.L$1 = function7;
                                        mTicketTripInfoUIStateFactory$convertToUIState$1.L$2 = toolbarUIState6;
                                        mTicketTripInfoUIStateFactory$convertToUIState$1.L$3 = buttonUIState4;
                                        mTicketTripInfoUIStateFactory$convertToUIState$1.L$4 = chaloTextUIState5;
                                        mTicketTripInfoUIStateFactory$convertToUIState$1.L$5 = loadingDialogUIState2;
                                        mTicketTripInfoUIStateFactory$convertToUIState$1.L$6 = productBookingBranding2;
                                        mTicketTripInfoUIStateFactory$convertToUIState$1.L$7 = snackbarUIState2;
                                        mTicketTripInfoUIStateFactory$convertToUIState$1.L$8 = mTicketTripInfoUIStateFactory;
                                        mTicketTripInfoUIStateFactory$convertToUIState$1.L$9 = str;
                                        mTicketTripInfoUIStateFactory$convertToUIState$1.L$10 = str3;
                                        mTicketTripInfoUIStateFactory$convertToUIState$1.L$11 = list;
                                        mTicketTripInfoUIStateFactory$convertToUIState$1.label = 7;
                                        objB6 = stringProvider4.b(StringEnum.STATUS_ERROR_ROUTE_NUMBER, new Object[0], mTicketTripInfoUIStateFactory$convertToUIState$1);
                                        if (objB6 != coroutineSingletons6) {
                                            coroutineSingletons6 = coroutineSingletons6;
                                            List list111 = list;
                                            obj6 = objB6;
                                            list2 = list111;
                                            String str11114 = str3;
                                            chaloTextUIState6 = chaloTextUIState5;
                                            str5 = str11114;
                                            str4 = (String) obj6;
                                            TextUIState.ChaloTextUIState chaloTextUIState11118 = chaloTextUIState6;
                                            str3 = str5;
                                            chaloTextUIState5 = chaloTextUIState11118;
                                        }
                                    } else {
                                        coroutineSingletons6 = coroutineSingletons6;
                                        list2 = list;
                                        str4 = null;
                                    }
                                    MTicketTripInfoUIStateFactory mTicketTripInfoUIStateFactory1118 = mTicketTripInfoUIStateFactory;
                                    wg0 wg0Var11116 = new wg0(function7, 4);
                                    mTicketTripInfoUIStateFactory1118.getClass();
                                    routeSelectionInputUIStateC = c(str, str3, list2, str4, wg0Var11116);
                                    mTicketTripInfoUIStateFactory$convertToUIState$1.L$0 = mTicketTripInfoDataState8;
                                    mTicketTripInfoUIStateFactory$convertToUIState$1.L$1 = function7;
                                    mTicketTripInfoUIStateFactory$convertToUIState$1.L$2 = toolbarUIState6;
                                    mTicketTripInfoUIStateFactory$convertToUIState$1.L$3 = buttonUIState4;
                                    mTicketTripInfoUIStateFactory$convertToUIState$1.L$4 = chaloTextUIState5;
                                    mTicketTripInfoUIStateFactory$convertToUIState$1.L$5 = loadingDialogUIState2;
                                    mTicketTripInfoUIStateFactory$convertToUIState$1.L$6 = productBookingBranding2;
                                    mTicketTripInfoUIStateFactory$convertToUIState$1.L$7 = snackbarUIState2;
                                    mTicketTripInfoUIStateFactory$convertToUIState$1.L$8 = routeSelectionInputUIStateC;
                                    mTicketTripInfoUIStateFactory$convertToUIState$1.L$9 = this;
                                    mTicketTripInfoUIStateFactory$convertToUIState$1.L$10 = null;
                                    mTicketTripInfoUIStateFactory$convertToUIState$1.L$11 = null;
                                    mTicketTripInfoUIStateFactory$convertToUIState$1.label = 8;
                                    objB7 = stringProvider4.b(StringEnum.HINT_START_STOP, new Object[0], mTicketTripInfoUIStateFactory$convertToUIState$1);
                                    coroutineSingletons = coroutineSingletons6;
                                    if (objB7 == coroutineSingletons) {
                                        return coroutineSingletons;
                                    }
                                    SnackbarUIState snackbarUIState111111 = snackbarUIState2;
                                    routeSelectionInputUIState = routeSelectionInputUIStateC;
                                    loadingDialogUIState3 = loadingDialogUIState2;
                                    productBookingBranding3 = productBookingBranding2;
                                    snackbarUIState3 = snackbarUIState111111;
                                    ToolbarUIState toolbarUIState117 = toolbarUIState6;
                                    buttonUIState5 = buttonUIState4;
                                    function8 = function7;
                                    toolbarUIState7 = toolbarUIState117;
                                    mTicketTripInfoUIStateFactory2 = this;
                                    str6 = (String) objB7;
                                    productBookingStopDetails = mTicketTripInfoDataState8.c;
                                    if (productBookingStopDetails != null) {
                                        str7 = str2;
                                    } else {
                                        str7 = str2;
                                    }
                                    list3 = EmptyList.f17557a;
                                    coroutineSingletons2 = coroutineSingletons;
                                    if (mTicketTripInfoDataState8.i == MTicketTripInfoMissingFieldError.FROM_STOP) {
                                        mTicketTripInfoUIStateFactory$convertToUIState$1.L$0 = mTicketTripInfoDataState8;
                                        mTicketTripInfoUIStateFactory$convertToUIState$1.L$1 = function8;
                                        mTicketTripInfoUIStateFactory$convertToUIState$1.L$2 = toolbarUIState7;
                                        mTicketTripInfoUIStateFactory$convertToUIState$1.L$3 = buttonUIState5;
                                        mTicketTripInfoUIStateFactory$convertToUIState$1.L$4 = chaloTextUIState5;
                                        mTicketTripInfoUIStateFactory$convertToUIState$1.L$5 = loadingDialogUIState3;
                                        mTicketTripInfoUIStateFactory$convertToUIState$1.L$6 = productBookingBranding3;
                                        mTicketTripInfoUIStateFactory$convertToUIState$1.L$7 = snackbarUIState3;
                                        mTicketTripInfoUIStateFactory$convertToUIState$1.L$8 = routeSelectionInputUIState;
                                        mTicketTripInfoUIStateFactory$convertToUIState$1.L$9 = mTicketTripInfoUIStateFactory2;
                                        mTicketTripInfoUIStateFactory$convertToUIState$1.L$10 = str6;
                                        mTicketTripInfoUIStateFactory$convertToUIState$1.L$11 = str7;
                                        mTicketTripInfoUIStateFactory$convertToUIState$1.L$12 = list3;
                                        mTicketTripInfoUIStateFactory$convertToUIState$1.label = 9;
                                        loadingDialogUIState4 = loadingDialogUIState3;
                                        stringProvider = stringProvider4;
                                        objB8 = stringProvider.b(StringEnum.STATUS_ERROR_ENTER_STOP, new Object[0], mTicketTripInfoUIStateFactory$convertToUIState$1);
                                        coroutineSingletons3 = coroutineSingletons2;
                                        if (objB8 == coroutineSingletons3) {
                                            return coroutineSingletons3;
                                        }
                                        TextUIState.ChaloTextUIState chaloTextUIState11119 = chaloTextUIState5;
                                        str9 = str7;
                                        obj7 = objB8;
                                        chaloTextUIState7 = chaloTextUIState11119;
                                        SnackbarUIState snackbarUIState111112 = snackbarUIState3;
                                        routeSelectionInputUIState2 = routeSelectionInputUIState;
                                        toolbarUIState8 = toolbarUIState7;
                                        buttonUIState6 = buttonUIState5;
                                        function9 = function8;
                                        productBookingBranding4 = productBookingBranding3;
                                        snackbarUIState4 = snackbarUIState111112;
                                        coroutineSingletons2 = coroutineSingletons3;
                                        mTicketTripInfoUIStateFactory3 = mTicketTripInfoUIStateFactory2;
                                        str8 = (String) obj7;
                                    } else {
                                        loadingDialogUIState4 = loadingDialogUIState3;
                                        stringProvider = stringProvider4;
                                        SnackbarUIState snackbarUIState111113 = snackbarUIState3;
                                        routeSelectionInputUIState2 = routeSelectionInputUIState;
                                        toolbarUIState8 = toolbarUIState7;
                                        buttonUIState6 = buttonUIState5;
                                        function9 = function8;
                                        productBookingBranding4 = productBookingBranding3;
                                        snackbarUIState4 = snackbarUIState111113;
                                        chaloTextUIState7 = chaloTextUIState5;
                                        mTicketTripInfoUIStateFactory3 = mTicketTripInfoUIStateFactory2;
                                        str8 = null;
                                        str9 = str7;
                                    }
                                    loadingDialogUIState5 = loadingDialogUIState4;
                                    StringProvider stringProvider110 = stringProvider;
                                    wg0 wg0Var11117 = new wg0(function9, 5);
                                    mTicketTripInfoUIStateFactory3.getClass();
                                    routeSelectionInputUIStateC2 = c(str6, str9, list3, str8, wg0Var11117);
                                    mTicketTripInfoUIStateFactory$convertToUIState$1.L$0 = mTicketTripInfoDataState8;
                                    mTicketTripInfoUIStateFactory$convertToUIState$1.L$1 = function9;
                                    mTicketTripInfoUIStateFactory$convertToUIState$1.L$2 = toolbarUIState8;
                                    mTicketTripInfoUIStateFactory$convertToUIState$1.L$3 = buttonUIState6;
                                    mTicketTripInfoUIStateFactory$convertToUIState$1.L$4 = chaloTextUIState7;
                                    mTicketTripInfoUIStateFactory$convertToUIState$1.L$5 = loadingDialogUIState5;
                                    mTicketTripInfoUIStateFactory$convertToUIState$1.L$6 = productBookingBranding4;
                                    mTicketTripInfoUIStateFactory$convertToUIState$1.L$7 = snackbarUIState4;
                                    mTicketTripInfoUIStateFactory$convertToUIState$1.L$8 = routeSelectionInputUIState2;
                                    mTicketTripInfoUIStateFactory$convertToUIState$1.L$9 = routeSelectionInputUIStateC2;
                                    mTicketTripInfoUIStateFactory$convertToUIState$1.L$10 = this;
                                    mTicketTripInfoUIStateFactory$convertToUIState$1.L$11 = null;
                                    mTicketTripInfoUIStateFactory$convertToUIState$1.L$12 = null;
                                    mTicketTripInfoUIStateFactory$convertToUIState$1.label = 10;
                                    stringProvider2 = stringProvider110;
                                    objB9 = stringProvider2.b(StringEnum.HINT_END_STOP, new Object[0], mTicketTripInfoUIStateFactory$convertToUIState$1);
                                    coroutineSingletons4 = coroutineSingletons2;
                                    if (objB9 == coroutineSingletons4) {
                                        return coroutineSingletons4;
                                    }
                                    loadingDialogUIState6 = loadingDialogUIState5;
                                    obj8 = objB9;
                                    toolbarUIState9 = toolbarUIState8;
                                    routeSelectionInputUIState3 = routeSelectionInputUIStateC2;
                                    mTicketTripInfoUIStateFactory4 = this;
                                    str10 = (String) obj8;
                                    productBookingStopDetails2 = mTicketTripInfoDataState8.d;
                                    if (productBookingStopDetails2 != null) {
                                        str11 = str2;
                                    } else {
                                        str11 = str2;
                                    }
                                    coroutineSingletons5 = coroutineSingletons4;
                                    list4 = EmptyList.f17557a;
                                    stringProvider3 = stringProvider2;
                                    if (mTicketTripInfoDataState8.i == MTicketTripInfoMissingFieldError.TO_STOP) {
                                        mTicketTripInfoUIStateFactory$convertToUIState$1.L$0 = function9;
                                        mTicketTripInfoUIStateFactory$convertToUIState$1.L$1 = toolbarUIState9;
                                        mTicketTripInfoUIStateFactory$convertToUIState$1.L$2 = buttonUIState6;
                                        mTicketTripInfoUIStateFactory$convertToUIState$1.L$3 = chaloTextUIState7;
                                        mTicketTripInfoUIStateFactory$convertToUIState$1.L$4 = loadingDialogUIState6;
                                        mTicketTripInfoUIStateFactory$convertToUIState$1.L$5 = productBookingBranding4;
                                        mTicketTripInfoUIStateFactory$convertToUIState$1.L$6 = snackbarUIState4;
                                        mTicketTripInfoUIStateFactory$convertToUIState$1.L$7 = routeSelectionInputUIState2;
                                        mTicketTripInfoUIStateFactory$convertToUIState$1.L$8 = routeSelectionInputUIState3;
                                        mTicketTripInfoUIStateFactory$convertToUIState$1.L$9 = mTicketTripInfoUIStateFactory4;
                                        mTicketTripInfoUIStateFactory$convertToUIState$1.L$10 = str10;
                                        mTicketTripInfoUIStateFactory$convertToUIState$1.L$11 = str11;
                                        mTicketTripInfoUIStateFactory$convertToUIState$1.L$12 = list4;
                                        mTicketTripInfoUIStateFactory6 = mTicketTripInfoUIStateFactory4;
                                        mTicketTripInfoUIStateFactory$convertToUIState$1.label = 11;
                                        objB10 = stringProvider3.b(StringEnum.STATUS_ERROR_ENTER_STOP, new Object[0], mTicketTripInfoUIStateFactory$convertToUIState$1);
                                        if (objB10 == coroutineSingletons5) {
                                            return coroutineSingletons5;
                                        }
                                        chaloTextUIState9 = chaloTextUIState7;
                                        routeSelectionInputUIState6 = routeSelectionInputUIState2;
                                        productBookingBranding6 = productBookingBranding4;
                                        function10 = function9;
                                        buttonUIState7 = buttonUIState6;
                                        str13 = str10;
                                        toolbarUIState11 = toolbarUIState9;
                                        routeSelectionInputUIState7 = routeSelectionInputUIState3;
                                        snackbarUIState5 = snackbarUIState4;
                                        obj9 = objB10;
                                        loadingDialogUIState8 = loadingDialogUIState6;
                                        list5 = list4;
                                        mTicketTripInfoUIStateFactory7 = mTicketTripInfoUIStateFactory6;
                                        String str11115 = (String) obj9;
                                        Function1 function117 = function10;
                                        str12 = str11115;
                                        mTicketTripInfoUIStateFactory5 = mTicketTripInfoUIStateFactory7;
                                        list4 = list5;
                                        toolbarUIState10 = toolbarUIState11;
                                        function9 = function117;
                                        LoadingDialogUIState loadingDialogUIState114 = loadingDialogUIState8;
                                        snackbarUIState4 = snackbarUIState5;
                                        productBookingBranding5 = productBookingBranding6;
                                        loadingDialogUIState7 = loadingDialogUIState114;
                                        str10 = str13;
                                        routeSelectionInputUIState5 = routeSelectionInputUIState7;
                                        routeSelectionInputUIState4 = routeSelectionInputUIState6;
                                        chaloTextUIState8 = chaloTextUIState9;
                                        buttonUIState6 = buttonUIState7;
                                    } else {
                                        MTicketTripInfoUIStateFactory mTicketTripInfoUIStateFactory1119 = mTicketTripInfoUIStateFactory4;
                                        RouteSelectionInputUIState routeSelectionInputUIState113 = routeSelectionInputUIState2;
                                        loadingDialogUIState7 = loadingDialogUIState6;
                                        toolbarUIState10 = toolbarUIState9;
                                        routeSelectionInputUIState4 = routeSelectionInputUIState113;
                                        chaloTextUIState8 = chaloTextUIState7;
                                        routeSelectionInputUIState5 = routeSelectionInputUIState3;
                                        productBookingBranding5 = productBookingBranding4;
                                        mTicketTripInfoUIStateFactory5 = mTicketTripInfoUIStateFactory1119;
                                        str12 = null;
                                    }
                                    wg0 wg0Var11118 = new wg0(function9, 6);
                                    mTicketTripInfoUIStateFactory5.getClass();
                                    return new MTicketTripInfoUIState(toolbarUIState10, routeSelectionInputUIState4, routeSelectionInputUIState5, c(str10, str11, list4, str12, wg0Var11118), buttonUIState6, chaloTextUIState8, productBookingBranding5, loadingDialogUIState7, snackbarUIState4);
                                }
                            }
                        }
                    }
                }
                coroutineSingletons6 = coroutineSingletons6;
                return coroutineSingletons6;
            case 2:
                ButtonUIStateFactory buttonUIStateFactory3 = (ButtonUIStateFactory) mTicketTripInfoUIStateFactory$convertToUIState$1.L$3;
                toolbarUIState2 = (ToolbarUIState) mTicketTripInfoUIStateFactory$convertToUIState$1.L$2;
                function3 = (Function1) mTicketTripInfoUIStateFactory$convertToUIState$1.L$1;
                MTicketTripInfoDataState mTicketTripInfoDataState12 = (MTicketTripInfoDataState) mTicketTripInfoUIStateFactory$convertToUIState$1.L$0;
                ResultKt.b(obj9);
                mTicketTripInfoDataState3 = mTicketTripInfoDataState12;
                buttonUIStateFactory2 = buttonUIStateFactory3;
                obj = obj9;
                mTicketTripInfoDataState4 = mTicketTripInfoDataState3;
                buttonUIStateG = ButtonUIStateFactory.g(buttonUIStateFactory2, (String) obj, new wg0(function3, 2), null, null, false, ChaloThemeHelper.a().p, 28);
                bool = mTicketTripInfoDataState4.h;
                if (bool != null) {
                    boolean zBooleanValue3 = bool.booleanValue();
                    mTicketTripInfoUIStateFactory$convertToUIState$1.L$0 = mTicketTripInfoDataState4;
                    mTicketTripInfoUIStateFactory$convertToUIState$1.L$1 = function3;
                    mTicketTripInfoUIStateFactory$convertToUIState$1.L$2 = toolbarUIState2;
                    mTicketTripInfoUIStateFactory$convertToUIState$1.L$3 = buttonUIStateG;
                    mTicketTripInfoUIStateFactory$convertToUIState$1.label = 3;
                    objB3 = b(zBooleanValue3, mTicketTripInfoUIStateFactory$convertToUIState$1);
                    if (objB3 != coroutineSingletons6) {
                        mTicketTripInfoDataState6 = mTicketTripInfoDataState4;
                        obj2 = objB3;
                        mTicketTripInfoDataState5 = mTicketTripInfoDataState6;
                        chaloTextUIState = new TextUIState.ChaloTextUIState((String) obj2, UITextStyle.BodyMedium, ChaloColorToken.Black_60.f9766a, 0, UITextAlign.Center, (UIFontWeight) null, (Integer) null, UiEventHandler.Companion.a(new wg0(function3, 3)), (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 7896);
                        function4 = function3;
                        buttonUIState = buttonUIStateG;
                        toolbarUIState3 = toolbarUIState2;
                        if (mTicketTripInfoDataState5.f) {
                            mTicketTripInfoUIStateFactory$convertToUIState$1.L$0 = mTicketTripInfoDataState5;
                            mTicketTripInfoUIStateFactory$convertToUIState$1.L$1 = function4;
                            mTicketTripInfoUIStateFactory$convertToUIState$1.L$2 = toolbarUIState3;
                            mTicketTripInfoUIStateFactory$convertToUIState$1.L$3 = buttonUIState;
                            mTicketTripInfoUIStateFactory$convertToUIState$1.L$4 = chaloTextUIState;
                            dialogUIStateFactory = DialogUIStateFactory.f9989a;
                            mTicketTripInfoUIStateFactory$convertToUIState$1.L$5 = dialogUIStateFactory;
                            mTicketTripInfoUIStateFactory$convertToUIState$1.label = 4;
                            objB4 = stringProvider4.b(StringEnum.LOADING, new Object[0], mTicketTripInfoUIStateFactory$convertToUIState$1);
                            if (objB4 != coroutineSingletons6) {
                                obj3 = objB4;
                                chaloTextUIState3 = chaloTextUIState;
                                dialogUIStateFactory2 = dialogUIStateFactory;
                                dialogUIStateFactory2.getClass();
                                loadingDialogUIStateA = DialogUIStateFactory.a((String) obj3);
                                mTicketTripInfoDataState7 = mTicketTripInfoDataState5;
                                function5 = function4;
                                toolbarUIState4 = toolbarUIState3;
                                buttonUIState2 = buttonUIState;
                                chaloTextUIState2 = chaloTextUIState3;
                                productBookingBranding = mTicketTripInfoDataState7.g;
                                mTicketTripInfoSnackBarType = mTicketTripInfoDataState7.e;
                                if (mTicketTripInfoSnackBarType != null) {
                                    mTicketTripInfoUIStateFactory$convertToUIState$1.L$0 = mTicketTripInfoDataState7;
                                    mTicketTripInfoUIStateFactory$convertToUIState$1.L$1 = function5;
                                    mTicketTripInfoUIStateFactory$convertToUIState$1.L$2 = toolbarUIState4;
                                    mTicketTripInfoUIStateFactory$convertToUIState$1.L$3 = buttonUIState2;
                                    mTicketTripInfoUIStateFactory$convertToUIState$1.L$4 = chaloTextUIState2;
                                    mTicketTripInfoUIStateFactory$convertToUIState$1.L$5 = loadingDialogUIStateA;
                                    mTicketTripInfoUIStateFactory$convertToUIState$1.L$6 = productBookingBranding;
                                    mTicketTripInfoUIStateFactory$convertToUIState$1.label = 5;
                                    objD = d(mTicketTripInfoSnackBarType, function5, mTicketTripInfoUIStateFactory$convertToUIState$1);
                                    if (objD != coroutineSingletons6) {
                                        TextUIState.ChaloTextUIState chaloTextUIState111110 = chaloTextUIState2;
                                        loadingDialogUIState = loadingDialogUIStateA;
                                        obj4 = objD;
                                        mTicketTripInfoDataState8 = mTicketTripInfoDataState7;
                                        function6 = function5;
                                        toolbarUIState5 = toolbarUIState4;
                                        buttonUIState3 = buttonUIState2;
                                        chaloTextUIState4 = chaloTextUIState111110;
                                        snackbarUIState = (SnackbarUIState) obj4;
                                        mTicketTripInfoUIStateFactory$convertToUIState$1.L$0 = mTicketTripInfoDataState8;
                                        mTicketTripInfoUIStateFactory$convertToUIState$1.L$1 = function6;
                                        mTicketTripInfoUIStateFactory$convertToUIState$1.L$2 = toolbarUIState5;
                                        mTicketTripInfoUIStateFactory$convertToUIState$1.L$3 = buttonUIState3;
                                        mTicketTripInfoUIStateFactory$convertToUIState$1.L$4 = chaloTextUIState4;
                                        mTicketTripInfoUIStateFactory$convertToUIState$1.L$5 = loadingDialogUIState;
                                        mTicketTripInfoUIStateFactory$convertToUIState$1.L$6 = productBookingBranding;
                                        mTicketTripInfoUIStateFactory$convertToUIState$1.L$7 = snackbarUIState;
                                        mTicketTripInfoUIStateFactory$convertToUIState$1.L$8 = this;
                                        mTicketTripInfoUIStateFactory$convertToUIState$1.label = 6;
                                        objB5 = stringProvider4.b(StringEnum.HINT_ROUTE_NUMBER, new Object[0], mTicketTripInfoUIStateFactory$convertToUIState$1);
                                        if (objB5 != coroutineSingletons6) {
                                            ButtonUIState buttonUIState114 = buttonUIState3;
                                            snackbarUIState2 = snackbarUIState;
                                            obj5 = objB5;
                                            buttonUIState4 = buttonUIState114;
                                            toolbarUIState6 = toolbarUIState5;
                                            function7 = function6;
                                            productBookingBranding2 = productBookingBranding;
                                            loadingDialogUIState2 = loadingDialogUIState;
                                            chaloTextUIState5 = chaloTextUIState4;
                                            mTicketTripInfoUIStateFactory = this;
                                            str = (String) obj5;
                                            productBookingRouteDetails = mTicketTripInfoDataState8.b;
                                            str2 = "";
                                            if (productBookingRouteDetails != null) {
                                                str3 = str2;
                                            } else {
                                                str3 = str2;
                                            }
                                            if (productBookingRouteDetails != null) {
                                                list = EmptyList.f17557a;
                                            } else {
                                                list = EmptyList.f17557a;
                                            }
                                            if (mTicketTripInfoDataState8.i == MTicketTripInfoMissingFieldError.ROUTE) {
                                                mTicketTripInfoUIStateFactory$convertToUIState$1.L$0 = mTicketTripInfoDataState8;
                                                mTicketTripInfoUIStateFactory$convertToUIState$1.L$1 = function7;
                                                mTicketTripInfoUIStateFactory$convertToUIState$1.L$2 = toolbarUIState6;
                                                mTicketTripInfoUIStateFactory$convertToUIState$1.L$3 = buttonUIState4;
                                                mTicketTripInfoUIStateFactory$convertToUIState$1.L$4 = chaloTextUIState5;
                                                mTicketTripInfoUIStateFactory$convertToUIState$1.L$5 = loadingDialogUIState2;
                                                mTicketTripInfoUIStateFactory$convertToUIState$1.L$6 = productBookingBranding2;
                                                mTicketTripInfoUIStateFactory$convertToUIState$1.L$7 = snackbarUIState2;
                                                mTicketTripInfoUIStateFactory$convertToUIState$1.L$8 = mTicketTripInfoUIStateFactory;
                                                mTicketTripInfoUIStateFactory$convertToUIState$1.L$9 = str;
                                                mTicketTripInfoUIStateFactory$convertToUIState$1.L$10 = str3;
                                                mTicketTripInfoUIStateFactory$convertToUIState$1.L$11 = list;
                                                mTicketTripInfoUIStateFactory$convertToUIState$1.label = 7;
                                                objB6 = stringProvider4.b(StringEnum.STATUS_ERROR_ROUTE_NUMBER, new Object[0], mTicketTripInfoUIStateFactory$convertToUIState$1);
                                                if (objB6 != coroutineSingletons6) {
                                                    coroutineSingletons6 = coroutineSingletons6;
                                                    List list112 = list;
                                                    obj6 = objB6;
                                                    list2 = list112;
                                                    String str11116 = str3;
                                                    chaloTextUIState6 = chaloTextUIState5;
                                                    str5 = str11116;
                                                    str4 = (String) obj6;
                                                    TextUIState.ChaloTextUIState chaloTextUIState111111 = chaloTextUIState6;
                                                    str3 = str5;
                                                    chaloTextUIState5 = chaloTextUIState111111;
                                                }
                                            } else {
                                                coroutineSingletons6 = coroutineSingletons6;
                                                list2 = list;
                                                str4 = null;
                                            }
                                            MTicketTripInfoUIStateFactory mTicketTripInfoUIStateFactory11110 = mTicketTripInfoUIStateFactory;
                                            wg0 wg0Var11119 = new wg0(function7, 4);
                                            mTicketTripInfoUIStateFactory11110.getClass();
                                            routeSelectionInputUIStateC = c(str, str3, list2, str4, wg0Var11119);
                                            mTicketTripInfoUIStateFactory$convertToUIState$1.L$0 = mTicketTripInfoDataState8;
                                            mTicketTripInfoUIStateFactory$convertToUIState$1.L$1 = function7;
                                            mTicketTripInfoUIStateFactory$convertToUIState$1.L$2 = toolbarUIState6;
                                            mTicketTripInfoUIStateFactory$convertToUIState$1.L$3 = buttonUIState4;
                                            mTicketTripInfoUIStateFactory$convertToUIState$1.L$4 = chaloTextUIState5;
                                            mTicketTripInfoUIStateFactory$convertToUIState$1.L$5 = loadingDialogUIState2;
                                            mTicketTripInfoUIStateFactory$convertToUIState$1.L$6 = productBookingBranding2;
                                            mTicketTripInfoUIStateFactory$convertToUIState$1.L$7 = snackbarUIState2;
                                            mTicketTripInfoUIStateFactory$convertToUIState$1.L$8 = routeSelectionInputUIStateC;
                                            mTicketTripInfoUIStateFactory$convertToUIState$1.L$9 = this;
                                            mTicketTripInfoUIStateFactory$convertToUIState$1.L$10 = null;
                                            mTicketTripInfoUIStateFactory$convertToUIState$1.L$11 = null;
                                            mTicketTripInfoUIStateFactory$convertToUIState$1.label = 8;
                                            objB7 = stringProvider4.b(StringEnum.HINT_START_STOP, new Object[0], mTicketTripInfoUIStateFactory$convertToUIState$1);
                                            coroutineSingletons = coroutineSingletons6;
                                            if (objB7 == coroutineSingletons) {
                                                return coroutineSingletons;
                                            }
                                            SnackbarUIState snackbarUIState111114 = snackbarUIState2;
                                            routeSelectionInputUIState = routeSelectionInputUIStateC;
                                            loadingDialogUIState3 = loadingDialogUIState2;
                                            productBookingBranding3 = productBookingBranding2;
                                            snackbarUIState3 = snackbarUIState111114;
                                            ToolbarUIState toolbarUIState118 = toolbarUIState6;
                                            buttonUIState5 = buttonUIState4;
                                            function8 = function7;
                                            toolbarUIState7 = toolbarUIState118;
                                            mTicketTripInfoUIStateFactory2 = this;
                                            str6 = (String) objB7;
                                            productBookingStopDetails = mTicketTripInfoDataState8.c;
                                            if (productBookingStopDetails != null) {
                                                str7 = str2;
                                            } else {
                                                str7 = str2;
                                            }
                                            list3 = EmptyList.f17557a;
                                            coroutineSingletons2 = coroutineSingletons;
                                            if (mTicketTripInfoDataState8.i == MTicketTripInfoMissingFieldError.FROM_STOP) {
                                                mTicketTripInfoUIStateFactory$convertToUIState$1.L$0 = mTicketTripInfoDataState8;
                                                mTicketTripInfoUIStateFactory$convertToUIState$1.L$1 = function8;
                                                mTicketTripInfoUIStateFactory$convertToUIState$1.L$2 = toolbarUIState7;
                                                mTicketTripInfoUIStateFactory$convertToUIState$1.L$3 = buttonUIState5;
                                                mTicketTripInfoUIStateFactory$convertToUIState$1.L$4 = chaloTextUIState5;
                                                mTicketTripInfoUIStateFactory$convertToUIState$1.L$5 = loadingDialogUIState3;
                                                mTicketTripInfoUIStateFactory$convertToUIState$1.L$6 = productBookingBranding3;
                                                mTicketTripInfoUIStateFactory$convertToUIState$1.L$7 = snackbarUIState3;
                                                mTicketTripInfoUIStateFactory$convertToUIState$1.L$8 = routeSelectionInputUIState;
                                                mTicketTripInfoUIStateFactory$convertToUIState$1.L$9 = mTicketTripInfoUIStateFactory2;
                                                mTicketTripInfoUIStateFactory$convertToUIState$1.L$10 = str6;
                                                mTicketTripInfoUIStateFactory$convertToUIState$1.L$11 = str7;
                                                mTicketTripInfoUIStateFactory$convertToUIState$1.L$12 = list3;
                                                mTicketTripInfoUIStateFactory$convertToUIState$1.label = 9;
                                                loadingDialogUIState4 = loadingDialogUIState3;
                                                stringProvider = stringProvider4;
                                                objB8 = stringProvider.b(StringEnum.STATUS_ERROR_ENTER_STOP, new Object[0], mTicketTripInfoUIStateFactory$convertToUIState$1);
                                                coroutineSingletons3 = coroutineSingletons2;
                                                if (objB8 == coroutineSingletons3) {
                                                    return coroutineSingletons3;
                                                }
                                                TextUIState.ChaloTextUIState chaloTextUIState111112 = chaloTextUIState5;
                                                str9 = str7;
                                                obj7 = objB8;
                                                chaloTextUIState7 = chaloTextUIState111112;
                                                SnackbarUIState snackbarUIState111115 = snackbarUIState3;
                                                routeSelectionInputUIState2 = routeSelectionInputUIState;
                                                toolbarUIState8 = toolbarUIState7;
                                                buttonUIState6 = buttonUIState5;
                                                function9 = function8;
                                                productBookingBranding4 = productBookingBranding3;
                                                snackbarUIState4 = snackbarUIState111115;
                                                coroutineSingletons2 = coroutineSingletons3;
                                                mTicketTripInfoUIStateFactory3 = mTicketTripInfoUIStateFactory2;
                                                str8 = (String) obj7;
                                            } else {
                                                loadingDialogUIState4 = loadingDialogUIState3;
                                                stringProvider = stringProvider4;
                                                SnackbarUIState snackbarUIState111116 = snackbarUIState3;
                                                routeSelectionInputUIState2 = routeSelectionInputUIState;
                                                toolbarUIState8 = toolbarUIState7;
                                                buttonUIState6 = buttonUIState5;
                                                function9 = function8;
                                                productBookingBranding4 = productBookingBranding3;
                                                snackbarUIState4 = snackbarUIState111116;
                                                chaloTextUIState7 = chaloTextUIState5;
                                                mTicketTripInfoUIStateFactory3 = mTicketTripInfoUIStateFactory2;
                                                str8 = null;
                                                str9 = str7;
                                            }
                                            loadingDialogUIState5 = loadingDialogUIState4;
                                            StringProvider stringProvider111 = stringProvider;
                                            wg0 wg0Var111110 = new wg0(function9, 5);
                                            mTicketTripInfoUIStateFactory3.getClass();
                                            routeSelectionInputUIStateC2 = c(str6, str9, list3, str8, wg0Var111110);
                                            mTicketTripInfoUIStateFactory$convertToUIState$1.L$0 = mTicketTripInfoDataState8;
                                            mTicketTripInfoUIStateFactory$convertToUIState$1.L$1 = function9;
                                            mTicketTripInfoUIStateFactory$convertToUIState$1.L$2 = toolbarUIState8;
                                            mTicketTripInfoUIStateFactory$convertToUIState$1.L$3 = buttonUIState6;
                                            mTicketTripInfoUIStateFactory$convertToUIState$1.L$4 = chaloTextUIState7;
                                            mTicketTripInfoUIStateFactory$convertToUIState$1.L$5 = loadingDialogUIState5;
                                            mTicketTripInfoUIStateFactory$convertToUIState$1.L$6 = productBookingBranding4;
                                            mTicketTripInfoUIStateFactory$convertToUIState$1.L$7 = snackbarUIState4;
                                            mTicketTripInfoUIStateFactory$convertToUIState$1.L$8 = routeSelectionInputUIState2;
                                            mTicketTripInfoUIStateFactory$convertToUIState$1.L$9 = routeSelectionInputUIStateC2;
                                            mTicketTripInfoUIStateFactory$convertToUIState$1.L$10 = this;
                                            mTicketTripInfoUIStateFactory$convertToUIState$1.L$11 = null;
                                            mTicketTripInfoUIStateFactory$convertToUIState$1.L$12 = null;
                                            mTicketTripInfoUIStateFactory$convertToUIState$1.label = 10;
                                            stringProvider2 = stringProvider111;
                                            objB9 = stringProvider2.b(StringEnum.HINT_END_STOP, new Object[0], mTicketTripInfoUIStateFactory$convertToUIState$1);
                                            coroutineSingletons4 = coroutineSingletons2;
                                            if (objB9 == coroutineSingletons4) {
                                                return coroutineSingletons4;
                                            }
                                            loadingDialogUIState6 = loadingDialogUIState5;
                                            obj8 = objB9;
                                            toolbarUIState9 = toolbarUIState8;
                                            routeSelectionInputUIState3 = routeSelectionInputUIStateC2;
                                            mTicketTripInfoUIStateFactory4 = this;
                                            str10 = (String) obj8;
                                            productBookingStopDetails2 = mTicketTripInfoDataState8.d;
                                            if (productBookingStopDetails2 != null) {
                                                str11 = str2;
                                            } else {
                                                str11 = str2;
                                            }
                                            coroutineSingletons5 = coroutineSingletons4;
                                            list4 = EmptyList.f17557a;
                                            stringProvider3 = stringProvider2;
                                            if (mTicketTripInfoDataState8.i == MTicketTripInfoMissingFieldError.TO_STOP) {
                                                mTicketTripInfoUIStateFactory$convertToUIState$1.L$0 = function9;
                                                mTicketTripInfoUIStateFactory$convertToUIState$1.L$1 = toolbarUIState9;
                                                mTicketTripInfoUIStateFactory$convertToUIState$1.L$2 = buttonUIState6;
                                                mTicketTripInfoUIStateFactory$convertToUIState$1.L$3 = chaloTextUIState7;
                                                mTicketTripInfoUIStateFactory$convertToUIState$1.L$4 = loadingDialogUIState6;
                                                mTicketTripInfoUIStateFactory$convertToUIState$1.L$5 = productBookingBranding4;
                                                mTicketTripInfoUIStateFactory$convertToUIState$1.L$6 = snackbarUIState4;
                                                mTicketTripInfoUIStateFactory$convertToUIState$1.L$7 = routeSelectionInputUIState2;
                                                mTicketTripInfoUIStateFactory$convertToUIState$1.L$8 = routeSelectionInputUIState3;
                                                mTicketTripInfoUIStateFactory$convertToUIState$1.L$9 = mTicketTripInfoUIStateFactory4;
                                                mTicketTripInfoUIStateFactory$convertToUIState$1.L$10 = str10;
                                                mTicketTripInfoUIStateFactory$convertToUIState$1.L$11 = str11;
                                                mTicketTripInfoUIStateFactory$convertToUIState$1.L$12 = list4;
                                                mTicketTripInfoUIStateFactory6 = mTicketTripInfoUIStateFactory4;
                                                mTicketTripInfoUIStateFactory$convertToUIState$1.label = 11;
                                                objB10 = stringProvider3.b(StringEnum.STATUS_ERROR_ENTER_STOP, new Object[0], mTicketTripInfoUIStateFactory$convertToUIState$1);
                                                if (objB10 == coroutineSingletons5) {
                                                    return coroutineSingletons5;
                                                }
                                                chaloTextUIState9 = chaloTextUIState7;
                                                routeSelectionInputUIState6 = routeSelectionInputUIState2;
                                                productBookingBranding6 = productBookingBranding4;
                                                function10 = function9;
                                                buttonUIState7 = buttonUIState6;
                                                str13 = str10;
                                                toolbarUIState11 = toolbarUIState9;
                                                routeSelectionInputUIState7 = routeSelectionInputUIState3;
                                                snackbarUIState5 = snackbarUIState4;
                                                obj9 = objB10;
                                                loadingDialogUIState8 = loadingDialogUIState6;
                                                list5 = list4;
                                                mTicketTripInfoUIStateFactory7 = mTicketTripInfoUIStateFactory6;
                                                String str11117 = (String) obj9;
                                                Function1 function118 = function10;
                                                str12 = str11117;
                                                mTicketTripInfoUIStateFactory5 = mTicketTripInfoUIStateFactory7;
                                                list4 = list5;
                                                toolbarUIState10 = toolbarUIState11;
                                                function9 = function118;
                                                LoadingDialogUIState loadingDialogUIState115 = loadingDialogUIState8;
                                                snackbarUIState4 = snackbarUIState5;
                                                productBookingBranding5 = productBookingBranding6;
                                                loadingDialogUIState7 = loadingDialogUIState115;
                                                str10 = str13;
                                                routeSelectionInputUIState5 = routeSelectionInputUIState7;
                                                routeSelectionInputUIState4 = routeSelectionInputUIState6;
                                                chaloTextUIState8 = chaloTextUIState9;
                                                buttonUIState6 = buttonUIState7;
                                            } else {
                                                MTicketTripInfoUIStateFactory mTicketTripInfoUIStateFactory11111 = mTicketTripInfoUIStateFactory4;
                                                RouteSelectionInputUIState routeSelectionInputUIState114 = routeSelectionInputUIState2;
                                                loadingDialogUIState7 = loadingDialogUIState6;
                                                toolbarUIState10 = toolbarUIState9;
                                                routeSelectionInputUIState4 = routeSelectionInputUIState114;
                                                chaloTextUIState8 = chaloTextUIState7;
                                                routeSelectionInputUIState5 = routeSelectionInputUIState3;
                                                productBookingBranding5 = productBookingBranding4;
                                                mTicketTripInfoUIStateFactory5 = mTicketTripInfoUIStateFactory11111;
                                                str12 = null;
                                            }
                                            wg0 wg0Var111111 = new wg0(function9, 6);
                                            mTicketTripInfoUIStateFactory5.getClass();
                                            return new MTicketTripInfoUIState(toolbarUIState10, routeSelectionInputUIState4, routeSelectionInputUIState5, c(str10, str11, list4, str12, wg0Var111111), buttonUIState6, chaloTextUIState8, productBookingBranding5, loadingDialogUIState7, snackbarUIState4);
                                        }
                                    }
                                } else {
                                    mTicketTripInfoDataState8 = mTicketTripInfoDataState7;
                                    function6 = function5;
                                    toolbarUIState5 = toolbarUIState4;
                                    buttonUIState3 = buttonUIState2;
                                    chaloTextUIState4 = chaloTextUIState2;
                                    loadingDialogUIState = loadingDialogUIStateA;
                                    snackbarUIState = null;
                                    mTicketTripInfoUIStateFactory$convertToUIState$1.L$0 = mTicketTripInfoDataState8;
                                    mTicketTripInfoUIStateFactory$convertToUIState$1.L$1 = function6;
                                    mTicketTripInfoUIStateFactory$convertToUIState$1.L$2 = toolbarUIState5;
                                    mTicketTripInfoUIStateFactory$convertToUIState$1.L$3 = buttonUIState3;
                                    mTicketTripInfoUIStateFactory$convertToUIState$1.L$4 = chaloTextUIState4;
                                    mTicketTripInfoUIStateFactory$convertToUIState$1.L$5 = loadingDialogUIState;
                                    mTicketTripInfoUIStateFactory$convertToUIState$1.L$6 = productBookingBranding;
                                    mTicketTripInfoUIStateFactory$convertToUIState$1.L$7 = snackbarUIState;
                                    mTicketTripInfoUIStateFactory$convertToUIState$1.L$8 = this;
                                    mTicketTripInfoUIStateFactory$convertToUIState$1.label = 6;
                                    objB5 = stringProvider4.b(StringEnum.HINT_ROUTE_NUMBER, new Object[0], mTicketTripInfoUIStateFactory$convertToUIState$1);
                                    if (objB5 != coroutineSingletons6) {
                                        ButtonUIState buttonUIState115 = buttonUIState3;
                                        snackbarUIState2 = snackbarUIState;
                                        obj5 = objB5;
                                        buttonUIState4 = buttonUIState115;
                                        toolbarUIState6 = toolbarUIState5;
                                        function7 = function6;
                                        productBookingBranding2 = productBookingBranding;
                                        loadingDialogUIState2 = loadingDialogUIState;
                                        chaloTextUIState5 = chaloTextUIState4;
                                        mTicketTripInfoUIStateFactory = this;
                                        str = (String) obj5;
                                        productBookingRouteDetails = mTicketTripInfoDataState8.b;
                                        str2 = "";
                                        if (productBookingRouteDetails != null) {
                                            str3 = str2;
                                        } else {
                                            str3 = str2;
                                        }
                                        if (productBookingRouteDetails != null) {
                                            list = EmptyList.f17557a;
                                        } else {
                                            list = EmptyList.f17557a;
                                        }
                                        if (mTicketTripInfoDataState8.i == MTicketTripInfoMissingFieldError.ROUTE) {
                                            mTicketTripInfoUIStateFactory$convertToUIState$1.L$0 = mTicketTripInfoDataState8;
                                            mTicketTripInfoUIStateFactory$convertToUIState$1.L$1 = function7;
                                            mTicketTripInfoUIStateFactory$convertToUIState$1.L$2 = toolbarUIState6;
                                            mTicketTripInfoUIStateFactory$convertToUIState$1.L$3 = buttonUIState4;
                                            mTicketTripInfoUIStateFactory$convertToUIState$1.L$4 = chaloTextUIState5;
                                            mTicketTripInfoUIStateFactory$convertToUIState$1.L$5 = loadingDialogUIState2;
                                            mTicketTripInfoUIStateFactory$convertToUIState$1.L$6 = productBookingBranding2;
                                            mTicketTripInfoUIStateFactory$convertToUIState$1.L$7 = snackbarUIState2;
                                            mTicketTripInfoUIStateFactory$convertToUIState$1.L$8 = mTicketTripInfoUIStateFactory;
                                            mTicketTripInfoUIStateFactory$convertToUIState$1.L$9 = str;
                                            mTicketTripInfoUIStateFactory$convertToUIState$1.L$10 = str3;
                                            mTicketTripInfoUIStateFactory$convertToUIState$1.L$11 = list;
                                            mTicketTripInfoUIStateFactory$convertToUIState$1.label = 7;
                                            objB6 = stringProvider4.b(StringEnum.STATUS_ERROR_ROUTE_NUMBER, new Object[0], mTicketTripInfoUIStateFactory$convertToUIState$1);
                                            if (objB6 != coroutineSingletons6) {
                                                coroutineSingletons6 = coroutineSingletons6;
                                                List list113 = list;
                                                obj6 = objB6;
                                                list2 = list113;
                                                String str11118 = str3;
                                                chaloTextUIState6 = chaloTextUIState5;
                                                str5 = str11118;
                                                str4 = (String) obj6;
                                                TextUIState.ChaloTextUIState chaloTextUIState111113 = chaloTextUIState6;
                                                str3 = str5;
                                                chaloTextUIState5 = chaloTextUIState111113;
                                            }
                                        } else {
                                            coroutineSingletons6 = coroutineSingletons6;
                                            list2 = list;
                                            str4 = null;
                                        }
                                        MTicketTripInfoUIStateFactory mTicketTripInfoUIStateFactory11112 = mTicketTripInfoUIStateFactory;
                                        wg0 wg0Var111112 = new wg0(function7, 4);
                                        mTicketTripInfoUIStateFactory11112.getClass();
                                        routeSelectionInputUIStateC = c(str, str3, list2, str4, wg0Var111112);
                                        mTicketTripInfoUIStateFactory$convertToUIState$1.L$0 = mTicketTripInfoDataState8;
                                        mTicketTripInfoUIStateFactory$convertToUIState$1.L$1 = function7;
                                        mTicketTripInfoUIStateFactory$convertToUIState$1.L$2 = toolbarUIState6;
                                        mTicketTripInfoUIStateFactory$convertToUIState$1.L$3 = buttonUIState4;
                                        mTicketTripInfoUIStateFactory$convertToUIState$1.L$4 = chaloTextUIState5;
                                        mTicketTripInfoUIStateFactory$convertToUIState$1.L$5 = loadingDialogUIState2;
                                        mTicketTripInfoUIStateFactory$convertToUIState$1.L$6 = productBookingBranding2;
                                        mTicketTripInfoUIStateFactory$convertToUIState$1.L$7 = snackbarUIState2;
                                        mTicketTripInfoUIStateFactory$convertToUIState$1.L$8 = routeSelectionInputUIStateC;
                                        mTicketTripInfoUIStateFactory$convertToUIState$1.L$9 = this;
                                        mTicketTripInfoUIStateFactory$convertToUIState$1.L$10 = null;
                                        mTicketTripInfoUIStateFactory$convertToUIState$1.L$11 = null;
                                        mTicketTripInfoUIStateFactory$convertToUIState$1.label = 8;
                                        objB7 = stringProvider4.b(StringEnum.HINT_START_STOP, new Object[0], mTicketTripInfoUIStateFactory$convertToUIState$1);
                                        coroutineSingletons = coroutineSingletons6;
                                        if (objB7 == coroutineSingletons) {
                                            return coroutineSingletons;
                                        }
                                        SnackbarUIState snackbarUIState111117 = snackbarUIState2;
                                        routeSelectionInputUIState = routeSelectionInputUIStateC;
                                        loadingDialogUIState3 = loadingDialogUIState2;
                                        productBookingBranding3 = productBookingBranding2;
                                        snackbarUIState3 = snackbarUIState111117;
                                        ToolbarUIState toolbarUIState119 = toolbarUIState6;
                                        buttonUIState5 = buttonUIState4;
                                        function8 = function7;
                                        toolbarUIState7 = toolbarUIState119;
                                        mTicketTripInfoUIStateFactory2 = this;
                                        str6 = (String) objB7;
                                        productBookingStopDetails = mTicketTripInfoDataState8.c;
                                        if (productBookingStopDetails != null) {
                                            str7 = str2;
                                        } else {
                                            str7 = str2;
                                        }
                                        list3 = EmptyList.f17557a;
                                        coroutineSingletons2 = coroutineSingletons;
                                        if (mTicketTripInfoDataState8.i == MTicketTripInfoMissingFieldError.FROM_STOP) {
                                            mTicketTripInfoUIStateFactory$convertToUIState$1.L$0 = mTicketTripInfoDataState8;
                                            mTicketTripInfoUIStateFactory$convertToUIState$1.L$1 = function8;
                                            mTicketTripInfoUIStateFactory$convertToUIState$1.L$2 = toolbarUIState7;
                                            mTicketTripInfoUIStateFactory$convertToUIState$1.L$3 = buttonUIState5;
                                            mTicketTripInfoUIStateFactory$convertToUIState$1.L$4 = chaloTextUIState5;
                                            mTicketTripInfoUIStateFactory$convertToUIState$1.L$5 = loadingDialogUIState3;
                                            mTicketTripInfoUIStateFactory$convertToUIState$1.L$6 = productBookingBranding3;
                                            mTicketTripInfoUIStateFactory$convertToUIState$1.L$7 = snackbarUIState3;
                                            mTicketTripInfoUIStateFactory$convertToUIState$1.L$8 = routeSelectionInputUIState;
                                            mTicketTripInfoUIStateFactory$convertToUIState$1.L$9 = mTicketTripInfoUIStateFactory2;
                                            mTicketTripInfoUIStateFactory$convertToUIState$1.L$10 = str6;
                                            mTicketTripInfoUIStateFactory$convertToUIState$1.L$11 = str7;
                                            mTicketTripInfoUIStateFactory$convertToUIState$1.L$12 = list3;
                                            mTicketTripInfoUIStateFactory$convertToUIState$1.label = 9;
                                            loadingDialogUIState4 = loadingDialogUIState3;
                                            stringProvider = stringProvider4;
                                            objB8 = stringProvider.b(StringEnum.STATUS_ERROR_ENTER_STOP, new Object[0], mTicketTripInfoUIStateFactory$convertToUIState$1);
                                            coroutineSingletons3 = coroutineSingletons2;
                                            if (objB8 == coroutineSingletons3) {
                                                return coroutineSingletons3;
                                            }
                                            TextUIState.ChaloTextUIState chaloTextUIState111114 = chaloTextUIState5;
                                            str9 = str7;
                                            obj7 = objB8;
                                            chaloTextUIState7 = chaloTextUIState111114;
                                            SnackbarUIState snackbarUIState111118 = snackbarUIState3;
                                            routeSelectionInputUIState2 = routeSelectionInputUIState;
                                            toolbarUIState8 = toolbarUIState7;
                                            buttonUIState6 = buttonUIState5;
                                            function9 = function8;
                                            productBookingBranding4 = productBookingBranding3;
                                            snackbarUIState4 = snackbarUIState111118;
                                            coroutineSingletons2 = coroutineSingletons3;
                                            mTicketTripInfoUIStateFactory3 = mTicketTripInfoUIStateFactory2;
                                            str8 = (String) obj7;
                                        } else {
                                            loadingDialogUIState4 = loadingDialogUIState3;
                                            stringProvider = stringProvider4;
                                            SnackbarUIState snackbarUIState111119 = snackbarUIState3;
                                            routeSelectionInputUIState2 = routeSelectionInputUIState;
                                            toolbarUIState8 = toolbarUIState7;
                                            buttonUIState6 = buttonUIState5;
                                            function9 = function8;
                                            productBookingBranding4 = productBookingBranding3;
                                            snackbarUIState4 = snackbarUIState111119;
                                            chaloTextUIState7 = chaloTextUIState5;
                                            mTicketTripInfoUIStateFactory3 = mTicketTripInfoUIStateFactory2;
                                            str8 = null;
                                            str9 = str7;
                                        }
                                        loadingDialogUIState5 = loadingDialogUIState4;
                                        StringProvider stringProvider112 = stringProvider;
                                        wg0 wg0Var111113 = new wg0(function9, 5);
                                        mTicketTripInfoUIStateFactory3.getClass();
                                        routeSelectionInputUIStateC2 = c(str6, str9, list3, str8, wg0Var111113);
                                        mTicketTripInfoUIStateFactory$convertToUIState$1.L$0 = mTicketTripInfoDataState8;
                                        mTicketTripInfoUIStateFactory$convertToUIState$1.L$1 = function9;
                                        mTicketTripInfoUIStateFactory$convertToUIState$1.L$2 = toolbarUIState8;
                                        mTicketTripInfoUIStateFactory$convertToUIState$1.L$3 = buttonUIState6;
                                        mTicketTripInfoUIStateFactory$convertToUIState$1.L$4 = chaloTextUIState7;
                                        mTicketTripInfoUIStateFactory$convertToUIState$1.L$5 = loadingDialogUIState5;
                                        mTicketTripInfoUIStateFactory$convertToUIState$1.L$6 = productBookingBranding4;
                                        mTicketTripInfoUIStateFactory$convertToUIState$1.L$7 = snackbarUIState4;
                                        mTicketTripInfoUIStateFactory$convertToUIState$1.L$8 = routeSelectionInputUIState2;
                                        mTicketTripInfoUIStateFactory$convertToUIState$1.L$9 = routeSelectionInputUIStateC2;
                                        mTicketTripInfoUIStateFactory$convertToUIState$1.L$10 = this;
                                        mTicketTripInfoUIStateFactory$convertToUIState$1.L$11 = null;
                                        mTicketTripInfoUIStateFactory$convertToUIState$1.L$12 = null;
                                        mTicketTripInfoUIStateFactory$convertToUIState$1.label = 10;
                                        stringProvider2 = stringProvider112;
                                        objB9 = stringProvider2.b(StringEnum.HINT_END_STOP, new Object[0], mTicketTripInfoUIStateFactory$convertToUIState$1);
                                        coroutineSingletons4 = coroutineSingletons2;
                                        if (objB9 == coroutineSingletons4) {
                                            return coroutineSingletons4;
                                        }
                                        loadingDialogUIState6 = loadingDialogUIState5;
                                        obj8 = objB9;
                                        toolbarUIState9 = toolbarUIState8;
                                        routeSelectionInputUIState3 = routeSelectionInputUIStateC2;
                                        mTicketTripInfoUIStateFactory4 = this;
                                        str10 = (String) obj8;
                                        productBookingStopDetails2 = mTicketTripInfoDataState8.d;
                                        if (productBookingStopDetails2 != null) {
                                            str11 = str2;
                                        } else {
                                            str11 = str2;
                                        }
                                        coroutineSingletons5 = coroutineSingletons4;
                                        list4 = EmptyList.f17557a;
                                        stringProvider3 = stringProvider2;
                                        if (mTicketTripInfoDataState8.i == MTicketTripInfoMissingFieldError.TO_STOP) {
                                            mTicketTripInfoUIStateFactory$convertToUIState$1.L$0 = function9;
                                            mTicketTripInfoUIStateFactory$convertToUIState$1.L$1 = toolbarUIState9;
                                            mTicketTripInfoUIStateFactory$convertToUIState$1.L$2 = buttonUIState6;
                                            mTicketTripInfoUIStateFactory$convertToUIState$1.L$3 = chaloTextUIState7;
                                            mTicketTripInfoUIStateFactory$convertToUIState$1.L$4 = loadingDialogUIState6;
                                            mTicketTripInfoUIStateFactory$convertToUIState$1.L$5 = productBookingBranding4;
                                            mTicketTripInfoUIStateFactory$convertToUIState$1.L$6 = snackbarUIState4;
                                            mTicketTripInfoUIStateFactory$convertToUIState$1.L$7 = routeSelectionInputUIState2;
                                            mTicketTripInfoUIStateFactory$convertToUIState$1.L$8 = routeSelectionInputUIState3;
                                            mTicketTripInfoUIStateFactory$convertToUIState$1.L$9 = mTicketTripInfoUIStateFactory4;
                                            mTicketTripInfoUIStateFactory$convertToUIState$1.L$10 = str10;
                                            mTicketTripInfoUIStateFactory$convertToUIState$1.L$11 = str11;
                                            mTicketTripInfoUIStateFactory$convertToUIState$1.L$12 = list4;
                                            mTicketTripInfoUIStateFactory6 = mTicketTripInfoUIStateFactory4;
                                            mTicketTripInfoUIStateFactory$convertToUIState$1.label = 11;
                                            objB10 = stringProvider3.b(StringEnum.STATUS_ERROR_ENTER_STOP, new Object[0], mTicketTripInfoUIStateFactory$convertToUIState$1);
                                            if (objB10 == coroutineSingletons5) {
                                                return coroutineSingletons5;
                                            }
                                            chaloTextUIState9 = chaloTextUIState7;
                                            routeSelectionInputUIState6 = routeSelectionInputUIState2;
                                            productBookingBranding6 = productBookingBranding4;
                                            function10 = function9;
                                            buttonUIState7 = buttonUIState6;
                                            str13 = str10;
                                            toolbarUIState11 = toolbarUIState9;
                                            routeSelectionInputUIState7 = routeSelectionInputUIState3;
                                            snackbarUIState5 = snackbarUIState4;
                                            obj9 = objB10;
                                            loadingDialogUIState8 = loadingDialogUIState6;
                                            list5 = list4;
                                            mTicketTripInfoUIStateFactory7 = mTicketTripInfoUIStateFactory6;
                                            String str11119 = (String) obj9;
                                            Function1 function119 = function10;
                                            str12 = str11119;
                                            mTicketTripInfoUIStateFactory5 = mTicketTripInfoUIStateFactory7;
                                            list4 = list5;
                                            toolbarUIState10 = toolbarUIState11;
                                            function9 = function119;
                                            LoadingDialogUIState loadingDialogUIState116 = loadingDialogUIState8;
                                            snackbarUIState4 = snackbarUIState5;
                                            productBookingBranding5 = productBookingBranding6;
                                            loadingDialogUIState7 = loadingDialogUIState116;
                                            str10 = str13;
                                            routeSelectionInputUIState5 = routeSelectionInputUIState7;
                                            routeSelectionInputUIState4 = routeSelectionInputUIState6;
                                            chaloTextUIState8 = chaloTextUIState9;
                                            buttonUIState6 = buttonUIState7;
                                        } else {
                                            MTicketTripInfoUIStateFactory mTicketTripInfoUIStateFactory11113 = mTicketTripInfoUIStateFactory4;
                                            RouteSelectionInputUIState routeSelectionInputUIState115 = routeSelectionInputUIState2;
                                            loadingDialogUIState7 = loadingDialogUIState6;
                                            toolbarUIState10 = toolbarUIState9;
                                            routeSelectionInputUIState4 = routeSelectionInputUIState115;
                                            chaloTextUIState8 = chaloTextUIState7;
                                            routeSelectionInputUIState5 = routeSelectionInputUIState3;
                                            productBookingBranding5 = productBookingBranding4;
                                            mTicketTripInfoUIStateFactory5 = mTicketTripInfoUIStateFactory11113;
                                            str12 = null;
                                        }
                                        wg0 wg0Var111114 = new wg0(function9, 6);
                                        mTicketTripInfoUIStateFactory5.getClass();
                                        return new MTicketTripInfoUIState(toolbarUIState10, routeSelectionInputUIState4, routeSelectionInputUIState5, c(str10, str11, list4, str12, wg0Var111114), buttonUIState6, chaloTextUIState8, productBookingBranding5, loadingDialogUIState7, snackbarUIState4);
                                    }
                                }
                            }
                        } else {
                            mTicketTripInfoDataState7 = mTicketTripInfoDataState5;
                            function5 = function4;
                            toolbarUIState4 = toolbarUIState3;
                            buttonUIState2 = buttonUIState;
                            chaloTextUIState2 = chaloTextUIState;
                            loadingDialogUIStateA = null;
                            productBookingBranding = mTicketTripInfoDataState7.g;
                            mTicketTripInfoSnackBarType = mTicketTripInfoDataState7.e;
                            if (mTicketTripInfoSnackBarType != null) {
                                mTicketTripInfoUIStateFactory$convertToUIState$1.L$0 = mTicketTripInfoDataState7;
                                mTicketTripInfoUIStateFactory$convertToUIState$1.L$1 = function5;
                                mTicketTripInfoUIStateFactory$convertToUIState$1.L$2 = toolbarUIState4;
                                mTicketTripInfoUIStateFactory$convertToUIState$1.L$3 = buttonUIState2;
                                mTicketTripInfoUIStateFactory$convertToUIState$1.L$4 = chaloTextUIState2;
                                mTicketTripInfoUIStateFactory$convertToUIState$1.L$5 = loadingDialogUIStateA;
                                mTicketTripInfoUIStateFactory$convertToUIState$1.L$6 = productBookingBranding;
                                mTicketTripInfoUIStateFactory$convertToUIState$1.label = 5;
                                objD = d(mTicketTripInfoSnackBarType, function5, mTicketTripInfoUIStateFactory$convertToUIState$1);
                                if (objD != coroutineSingletons6) {
                                    TextUIState.ChaloTextUIState chaloTextUIState111115 = chaloTextUIState2;
                                    loadingDialogUIState = loadingDialogUIStateA;
                                    obj4 = objD;
                                    mTicketTripInfoDataState8 = mTicketTripInfoDataState7;
                                    function6 = function5;
                                    toolbarUIState5 = toolbarUIState4;
                                    buttonUIState3 = buttonUIState2;
                                    chaloTextUIState4 = chaloTextUIState111115;
                                    snackbarUIState = (SnackbarUIState) obj4;
                                    mTicketTripInfoUIStateFactory$convertToUIState$1.L$0 = mTicketTripInfoDataState8;
                                    mTicketTripInfoUIStateFactory$convertToUIState$1.L$1 = function6;
                                    mTicketTripInfoUIStateFactory$convertToUIState$1.L$2 = toolbarUIState5;
                                    mTicketTripInfoUIStateFactory$convertToUIState$1.L$3 = buttonUIState3;
                                    mTicketTripInfoUIStateFactory$convertToUIState$1.L$4 = chaloTextUIState4;
                                    mTicketTripInfoUIStateFactory$convertToUIState$1.L$5 = loadingDialogUIState;
                                    mTicketTripInfoUIStateFactory$convertToUIState$1.L$6 = productBookingBranding;
                                    mTicketTripInfoUIStateFactory$convertToUIState$1.L$7 = snackbarUIState;
                                    mTicketTripInfoUIStateFactory$convertToUIState$1.L$8 = this;
                                    mTicketTripInfoUIStateFactory$convertToUIState$1.label = 6;
                                    objB5 = stringProvider4.b(StringEnum.HINT_ROUTE_NUMBER, new Object[0], mTicketTripInfoUIStateFactory$convertToUIState$1);
                                    if (objB5 != coroutineSingletons6) {
                                        ButtonUIState buttonUIState116 = buttonUIState3;
                                        snackbarUIState2 = snackbarUIState;
                                        obj5 = objB5;
                                        buttonUIState4 = buttonUIState116;
                                        toolbarUIState6 = toolbarUIState5;
                                        function7 = function6;
                                        productBookingBranding2 = productBookingBranding;
                                        loadingDialogUIState2 = loadingDialogUIState;
                                        chaloTextUIState5 = chaloTextUIState4;
                                        mTicketTripInfoUIStateFactory = this;
                                        str = (String) obj5;
                                        productBookingRouteDetails = mTicketTripInfoDataState8.b;
                                        str2 = "";
                                        if (productBookingRouteDetails != null) {
                                            str3 = str2;
                                        } else {
                                            str3 = str2;
                                        }
                                        if (productBookingRouteDetails != null) {
                                            list = EmptyList.f17557a;
                                        } else {
                                            list = EmptyList.f17557a;
                                        }
                                        if (mTicketTripInfoDataState8.i == MTicketTripInfoMissingFieldError.ROUTE) {
                                            mTicketTripInfoUIStateFactory$convertToUIState$1.L$0 = mTicketTripInfoDataState8;
                                            mTicketTripInfoUIStateFactory$convertToUIState$1.L$1 = function7;
                                            mTicketTripInfoUIStateFactory$convertToUIState$1.L$2 = toolbarUIState6;
                                            mTicketTripInfoUIStateFactory$convertToUIState$1.L$3 = buttonUIState4;
                                            mTicketTripInfoUIStateFactory$convertToUIState$1.L$4 = chaloTextUIState5;
                                            mTicketTripInfoUIStateFactory$convertToUIState$1.L$5 = loadingDialogUIState2;
                                            mTicketTripInfoUIStateFactory$convertToUIState$1.L$6 = productBookingBranding2;
                                            mTicketTripInfoUIStateFactory$convertToUIState$1.L$7 = snackbarUIState2;
                                            mTicketTripInfoUIStateFactory$convertToUIState$1.L$8 = mTicketTripInfoUIStateFactory;
                                            mTicketTripInfoUIStateFactory$convertToUIState$1.L$9 = str;
                                            mTicketTripInfoUIStateFactory$convertToUIState$1.L$10 = str3;
                                            mTicketTripInfoUIStateFactory$convertToUIState$1.L$11 = list;
                                            mTicketTripInfoUIStateFactory$convertToUIState$1.label = 7;
                                            objB6 = stringProvider4.b(StringEnum.STATUS_ERROR_ROUTE_NUMBER, new Object[0], mTicketTripInfoUIStateFactory$convertToUIState$1);
                                            if (objB6 != coroutineSingletons6) {
                                                coroutineSingletons6 = coroutineSingletons6;
                                                List list114 = list;
                                                obj6 = objB6;
                                                list2 = list114;
                                                String str111110 = str3;
                                                chaloTextUIState6 = chaloTextUIState5;
                                                str5 = str111110;
                                                str4 = (String) obj6;
                                                TextUIState.ChaloTextUIState chaloTextUIState111116 = chaloTextUIState6;
                                                str3 = str5;
                                                chaloTextUIState5 = chaloTextUIState111116;
                                            }
                                        } else {
                                            coroutineSingletons6 = coroutineSingletons6;
                                            list2 = list;
                                            str4 = null;
                                        }
                                        MTicketTripInfoUIStateFactory mTicketTripInfoUIStateFactory11114 = mTicketTripInfoUIStateFactory;
                                        wg0 wg0Var111115 = new wg0(function7, 4);
                                        mTicketTripInfoUIStateFactory11114.getClass();
                                        routeSelectionInputUIStateC = c(str, str3, list2, str4, wg0Var111115);
                                        mTicketTripInfoUIStateFactory$convertToUIState$1.L$0 = mTicketTripInfoDataState8;
                                        mTicketTripInfoUIStateFactory$convertToUIState$1.L$1 = function7;
                                        mTicketTripInfoUIStateFactory$convertToUIState$1.L$2 = toolbarUIState6;
                                        mTicketTripInfoUIStateFactory$convertToUIState$1.L$3 = buttonUIState4;
                                        mTicketTripInfoUIStateFactory$convertToUIState$1.L$4 = chaloTextUIState5;
                                        mTicketTripInfoUIStateFactory$convertToUIState$1.L$5 = loadingDialogUIState2;
                                        mTicketTripInfoUIStateFactory$convertToUIState$1.L$6 = productBookingBranding2;
                                        mTicketTripInfoUIStateFactory$convertToUIState$1.L$7 = snackbarUIState2;
                                        mTicketTripInfoUIStateFactory$convertToUIState$1.L$8 = routeSelectionInputUIStateC;
                                        mTicketTripInfoUIStateFactory$convertToUIState$1.L$9 = this;
                                        mTicketTripInfoUIStateFactory$convertToUIState$1.L$10 = null;
                                        mTicketTripInfoUIStateFactory$convertToUIState$1.L$11 = null;
                                        mTicketTripInfoUIStateFactory$convertToUIState$1.label = 8;
                                        objB7 = stringProvider4.b(StringEnum.HINT_START_STOP, new Object[0], mTicketTripInfoUIStateFactory$convertToUIState$1);
                                        coroutineSingletons = coroutineSingletons6;
                                        if (objB7 == coroutineSingletons) {
                                            return coroutineSingletons;
                                        }
                                        SnackbarUIState snackbarUIState1111110 = snackbarUIState2;
                                        routeSelectionInputUIState = routeSelectionInputUIStateC;
                                        loadingDialogUIState3 = loadingDialogUIState2;
                                        productBookingBranding3 = productBookingBranding2;
                                        snackbarUIState3 = snackbarUIState1111110;
                                        ToolbarUIState toolbarUIState1110 = toolbarUIState6;
                                        buttonUIState5 = buttonUIState4;
                                        function8 = function7;
                                        toolbarUIState7 = toolbarUIState1110;
                                        mTicketTripInfoUIStateFactory2 = this;
                                        str6 = (String) objB7;
                                        productBookingStopDetails = mTicketTripInfoDataState8.c;
                                        if (productBookingStopDetails != null) {
                                            str7 = str2;
                                        } else {
                                            str7 = str2;
                                        }
                                        list3 = EmptyList.f17557a;
                                        coroutineSingletons2 = coroutineSingletons;
                                        if (mTicketTripInfoDataState8.i == MTicketTripInfoMissingFieldError.FROM_STOP) {
                                            mTicketTripInfoUIStateFactory$convertToUIState$1.L$0 = mTicketTripInfoDataState8;
                                            mTicketTripInfoUIStateFactory$convertToUIState$1.L$1 = function8;
                                            mTicketTripInfoUIStateFactory$convertToUIState$1.L$2 = toolbarUIState7;
                                            mTicketTripInfoUIStateFactory$convertToUIState$1.L$3 = buttonUIState5;
                                            mTicketTripInfoUIStateFactory$convertToUIState$1.L$4 = chaloTextUIState5;
                                            mTicketTripInfoUIStateFactory$convertToUIState$1.L$5 = loadingDialogUIState3;
                                            mTicketTripInfoUIStateFactory$convertToUIState$1.L$6 = productBookingBranding3;
                                            mTicketTripInfoUIStateFactory$convertToUIState$1.L$7 = snackbarUIState3;
                                            mTicketTripInfoUIStateFactory$convertToUIState$1.L$8 = routeSelectionInputUIState;
                                            mTicketTripInfoUIStateFactory$convertToUIState$1.L$9 = mTicketTripInfoUIStateFactory2;
                                            mTicketTripInfoUIStateFactory$convertToUIState$1.L$10 = str6;
                                            mTicketTripInfoUIStateFactory$convertToUIState$1.L$11 = str7;
                                            mTicketTripInfoUIStateFactory$convertToUIState$1.L$12 = list3;
                                            mTicketTripInfoUIStateFactory$convertToUIState$1.label = 9;
                                            loadingDialogUIState4 = loadingDialogUIState3;
                                            stringProvider = stringProvider4;
                                            objB8 = stringProvider.b(StringEnum.STATUS_ERROR_ENTER_STOP, new Object[0], mTicketTripInfoUIStateFactory$convertToUIState$1);
                                            coroutineSingletons3 = coroutineSingletons2;
                                            if (objB8 == coroutineSingletons3) {
                                                return coroutineSingletons3;
                                            }
                                            TextUIState.ChaloTextUIState chaloTextUIState111117 = chaloTextUIState5;
                                            str9 = str7;
                                            obj7 = objB8;
                                            chaloTextUIState7 = chaloTextUIState111117;
                                            SnackbarUIState snackbarUIState1111111 = snackbarUIState3;
                                            routeSelectionInputUIState2 = routeSelectionInputUIState;
                                            toolbarUIState8 = toolbarUIState7;
                                            buttonUIState6 = buttonUIState5;
                                            function9 = function8;
                                            productBookingBranding4 = productBookingBranding3;
                                            snackbarUIState4 = snackbarUIState1111111;
                                            coroutineSingletons2 = coroutineSingletons3;
                                            mTicketTripInfoUIStateFactory3 = mTicketTripInfoUIStateFactory2;
                                            str8 = (String) obj7;
                                        } else {
                                            loadingDialogUIState4 = loadingDialogUIState3;
                                            stringProvider = stringProvider4;
                                            SnackbarUIState snackbarUIState1111112 = snackbarUIState3;
                                            routeSelectionInputUIState2 = routeSelectionInputUIState;
                                            toolbarUIState8 = toolbarUIState7;
                                            buttonUIState6 = buttonUIState5;
                                            function9 = function8;
                                            productBookingBranding4 = productBookingBranding3;
                                            snackbarUIState4 = snackbarUIState1111112;
                                            chaloTextUIState7 = chaloTextUIState5;
                                            mTicketTripInfoUIStateFactory3 = mTicketTripInfoUIStateFactory2;
                                            str8 = null;
                                            str9 = str7;
                                        }
                                        loadingDialogUIState5 = loadingDialogUIState4;
                                        StringProvider stringProvider113 = stringProvider;
                                        wg0 wg0Var111116 = new wg0(function9, 5);
                                        mTicketTripInfoUIStateFactory3.getClass();
                                        routeSelectionInputUIStateC2 = c(str6, str9, list3, str8, wg0Var111116);
                                        mTicketTripInfoUIStateFactory$convertToUIState$1.L$0 = mTicketTripInfoDataState8;
                                        mTicketTripInfoUIStateFactory$convertToUIState$1.L$1 = function9;
                                        mTicketTripInfoUIStateFactory$convertToUIState$1.L$2 = toolbarUIState8;
                                        mTicketTripInfoUIStateFactory$convertToUIState$1.L$3 = buttonUIState6;
                                        mTicketTripInfoUIStateFactory$convertToUIState$1.L$4 = chaloTextUIState7;
                                        mTicketTripInfoUIStateFactory$convertToUIState$1.L$5 = loadingDialogUIState5;
                                        mTicketTripInfoUIStateFactory$convertToUIState$1.L$6 = productBookingBranding4;
                                        mTicketTripInfoUIStateFactory$convertToUIState$1.L$7 = snackbarUIState4;
                                        mTicketTripInfoUIStateFactory$convertToUIState$1.L$8 = routeSelectionInputUIState2;
                                        mTicketTripInfoUIStateFactory$convertToUIState$1.L$9 = routeSelectionInputUIStateC2;
                                        mTicketTripInfoUIStateFactory$convertToUIState$1.L$10 = this;
                                        mTicketTripInfoUIStateFactory$convertToUIState$1.L$11 = null;
                                        mTicketTripInfoUIStateFactory$convertToUIState$1.L$12 = null;
                                        mTicketTripInfoUIStateFactory$convertToUIState$1.label = 10;
                                        stringProvider2 = stringProvider113;
                                        objB9 = stringProvider2.b(StringEnum.HINT_END_STOP, new Object[0], mTicketTripInfoUIStateFactory$convertToUIState$1);
                                        coroutineSingletons4 = coroutineSingletons2;
                                        if (objB9 == coroutineSingletons4) {
                                            return coroutineSingletons4;
                                        }
                                        loadingDialogUIState6 = loadingDialogUIState5;
                                        obj8 = objB9;
                                        toolbarUIState9 = toolbarUIState8;
                                        routeSelectionInputUIState3 = routeSelectionInputUIStateC2;
                                        mTicketTripInfoUIStateFactory4 = this;
                                        str10 = (String) obj8;
                                        productBookingStopDetails2 = mTicketTripInfoDataState8.d;
                                        if (productBookingStopDetails2 != null) {
                                            str11 = str2;
                                        } else {
                                            str11 = str2;
                                        }
                                        coroutineSingletons5 = coroutineSingletons4;
                                        list4 = EmptyList.f17557a;
                                        stringProvider3 = stringProvider2;
                                        if (mTicketTripInfoDataState8.i == MTicketTripInfoMissingFieldError.TO_STOP) {
                                            mTicketTripInfoUIStateFactory$convertToUIState$1.L$0 = function9;
                                            mTicketTripInfoUIStateFactory$convertToUIState$1.L$1 = toolbarUIState9;
                                            mTicketTripInfoUIStateFactory$convertToUIState$1.L$2 = buttonUIState6;
                                            mTicketTripInfoUIStateFactory$convertToUIState$1.L$3 = chaloTextUIState7;
                                            mTicketTripInfoUIStateFactory$convertToUIState$1.L$4 = loadingDialogUIState6;
                                            mTicketTripInfoUIStateFactory$convertToUIState$1.L$5 = productBookingBranding4;
                                            mTicketTripInfoUIStateFactory$convertToUIState$1.L$6 = snackbarUIState4;
                                            mTicketTripInfoUIStateFactory$convertToUIState$1.L$7 = routeSelectionInputUIState2;
                                            mTicketTripInfoUIStateFactory$convertToUIState$1.L$8 = routeSelectionInputUIState3;
                                            mTicketTripInfoUIStateFactory$convertToUIState$1.L$9 = mTicketTripInfoUIStateFactory4;
                                            mTicketTripInfoUIStateFactory$convertToUIState$1.L$10 = str10;
                                            mTicketTripInfoUIStateFactory$convertToUIState$1.L$11 = str11;
                                            mTicketTripInfoUIStateFactory$convertToUIState$1.L$12 = list4;
                                            mTicketTripInfoUIStateFactory6 = mTicketTripInfoUIStateFactory4;
                                            mTicketTripInfoUIStateFactory$convertToUIState$1.label = 11;
                                            objB10 = stringProvider3.b(StringEnum.STATUS_ERROR_ENTER_STOP, new Object[0], mTicketTripInfoUIStateFactory$convertToUIState$1);
                                            if (objB10 == coroutineSingletons5) {
                                                return coroutineSingletons5;
                                            }
                                            chaloTextUIState9 = chaloTextUIState7;
                                            routeSelectionInputUIState6 = routeSelectionInputUIState2;
                                            productBookingBranding6 = productBookingBranding4;
                                            function10 = function9;
                                            buttonUIState7 = buttonUIState6;
                                            str13 = str10;
                                            toolbarUIState11 = toolbarUIState9;
                                            routeSelectionInputUIState7 = routeSelectionInputUIState3;
                                            snackbarUIState5 = snackbarUIState4;
                                            obj9 = objB10;
                                            loadingDialogUIState8 = loadingDialogUIState6;
                                            list5 = list4;
                                            mTicketTripInfoUIStateFactory7 = mTicketTripInfoUIStateFactory6;
                                            String str111111 = (String) obj9;
                                            Function1 function1110 = function10;
                                            str12 = str111111;
                                            mTicketTripInfoUIStateFactory5 = mTicketTripInfoUIStateFactory7;
                                            list4 = list5;
                                            toolbarUIState10 = toolbarUIState11;
                                            function9 = function1110;
                                            LoadingDialogUIState loadingDialogUIState117 = loadingDialogUIState8;
                                            snackbarUIState4 = snackbarUIState5;
                                            productBookingBranding5 = productBookingBranding6;
                                            loadingDialogUIState7 = loadingDialogUIState117;
                                            str10 = str13;
                                            routeSelectionInputUIState5 = routeSelectionInputUIState7;
                                            routeSelectionInputUIState4 = routeSelectionInputUIState6;
                                            chaloTextUIState8 = chaloTextUIState9;
                                            buttonUIState6 = buttonUIState7;
                                        } else {
                                            MTicketTripInfoUIStateFactory mTicketTripInfoUIStateFactory11115 = mTicketTripInfoUIStateFactory4;
                                            RouteSelectionInputUIState routeSelectionInputUIState116 = routeSelectionInputUIState2;
                                            loadingDialogUIState7 = loadingDialogUIState6;
                                            toolbarUIState10 = toolbarUIState9;
                                            routeSelectionInputUIState4 = routeSelectionInputUIState116;
                                            chaloTextUIState8 = chaloTextUIState7;
                                            routeSelectionInputUIState5 = routeSelectionInputUIState3;
                                            productBookingBranding5 = productBookingBranding4;
                                            mTicketTripInfoUIStateFactory5 = mTicketTripInfoUIStateFactory11115;
                                            str12 = null;
                                        }
                                        wg0 wg0Var111117 = new wg0(function9, 6);
                                        mTicketTripInfoUIStateFactory5.getClass();
                                        return new MTicketTripInfoUIState(toolbarUIState10, routeSelectionInputUIState4, routeSelectionInputUIState5, c(str10, str11, list4, str12, wg0Var111117), buttonUIState6, chaloTextUIState8, productBookingBranding5, loadingDialogUIState7, snackbarUIState4);
                                    }
                                }
                            } else {
                                mTicketTripInfoDataState8 = mTicketTripInfoDataState7;
                                function6 = function5;
                                toolbarUIState5 = toolbarUIState4;
                                buttonUIState3 = buttonUIState2;
                                chaloTextUIState4 = chaloTextUIState2;
                                loadingDialogUIState = loadingDialogUIStateA;
                                snackbarUIState = null;
                                mTicketTripInfoUIStateFactory$convertToUIState$1.L$0 = mTicketTripInfoDataState8;
                                mTicketTripInfoUIStateFactory$convertToUIState$1.L$1 = function6;
                                mTicketTripInfoUIStateFactory$convertToUIState$1.L$2 = toolbarUIState5;
                                mTicketTripInfoUIStateFactory$convertToUIState$1.L$3 = buttonUIState3;
                                mTicketTripInfoUIStateFactory$convertToUIState$1.L$4 = chaloTextUIState4;
                                mTicketTripInfoUIStateFactory$convertToUIState$1.L$5 = loadingDialogUIState;
                                mTicketTripInfoUIStateFactory$convertToUIState$1.L$6 = productBookingBranding;
                                mTicketTripInfoUIStateFactory$convertToUIState$1.L$7 = snackbarUIState;
                                mTicketTripInfoUIStateFactory$convertToUIState$1.L$8 = this;
                                mTicketTripInfoUIStateFactory$convertToUIState$1.label = 6;
                                objB5 = stringProvider4.b(StringEnum.HINT_ROUTE_NUMBER, new Object[0], mTicketTripInfoUIStateFactory$convertToUIState$1);
                                if (objB5 != coroutineSingletons6) {
                                    ButtonUIState buttonUIState117 = buttonUIState3;
                                    snackbarUIState2 = snackbarUIState;
                                    obj5 = objB5;
                                    buttonUIState4 = buttonUIState117;
                                    toolbarUIState6 = toolbarUIState5;
                                    function7 = function6;
                                    productBookingBranding2 = productBookingBranding;
                                    loadingDialogUIState2 = loadingDialogUIState;
                                    chaloTextUIState5 = chaloTextUIState4;
                                    mTicketTripInfoUIStateFactory = this;
                                    str = (String) obj5;
                                    productBookingRouteDetails = mTicketTripInfoDataState8.b;
                                    str2 = "";
                                    if (productBookingRouteDetails != null) {
                                        str3 = str2;
                                    } else {
                                        str3 = str2;
                                    }
                                    if (productBookingRouteDetails != null) {
                                        list = EmptyList.f17557a;
                                    } else {
                                        list = EmptyList.f17557a;
                                    }
                                    if (mTicketTripInfoDataState8.i == MTicketTripInfoMissingFieldError.ROUTE) {
                                        mTicketTripInfoUIStateFactory$convertToUIState$1.L$0 = mTicketTripInfoDataState8;
                                        mTicketTripInfoUIStateFactory$convertToUIState$1.L$1 = function7;
                                        mTicketTripInfoUIStateFactory$convertToUIState$1.L$2 = toolbarUIState6;
                                        mTicketTripInfoUIStateFactory$convertToUIState$1.L$3 = buttonUIState4;
                                        mTicketTripInfoUIStateFactory$convertToUIState$1.L$4 = chaloTextUIState5;
                                        mTicketTripInfoUIStateFactory$convertToUIState$1.L$5 = loadingDialogUIState2;
                                        mTicketTripInfoUIStateFactory$convertToUIState$1.L$6 = productBookingBranding2;
                                        mTicketTripInfoUIStateFactory$convertToUIState$1.L$7 = snackbarUIState2;
                                        mTicketTripInfoUIStateFactory$convertToUIState$1.L$8 = mTicketTripInfoUIStateFactory;
                                        mTicketTripInfoUIStateFactory$convertToUIState$1.L$9 = str;
                                        mTicketTripInfoUIStateFactory$convertToUIState$1.L$10 = str3;
                                        mTicketTripInfoUIStateFactory$convertToUIState$1.L$11 = list;
                                        mTicketTripInfoUIStateFactory$convertToUIState$1.label = 7;
                                        objB6 = stringProvider4.b(StringEnum.STATUS_ERROR_ROUTE_NUMBER, new Object[0], mTicketTripInfoUIStateFactory$convertToUIState$1);
                                        if (objB6 != coroutineSingletons6) {
                                            coroutineSingletons6 = coroutineSingletons6;
                                            List list115 = list;
                                            obj6 = objB6;
                                            list2 = list115;
                                            String str111112 = str3;
                                            chaloTextUIState6 = chaloTextUIState5;
                                            str5 = str111112;
                                            str4 = (String) obj6;
                                            TextUIState.ChaloTextUIState chaloTextUIState111118 = chaloTextUIState6;
                                            str3 = str5;
                                            chaloTextUIState5 = chaloTextUIState111118;
                                        }
                                    } else {
                                        coroutineSingletons6 = coroutineSingletons6;
                                        list2 = list;
                                        str4 = null;
                                    }
                                    MTicketTripInfoUIStateFactory mTicketTripInfoUIStateFactory11116 = mTicketTripInfoUIStateFactory;
                                    wg0 wg0Var111118 = new wg0(function7, 4);
                                    mTicketTripInfoUIStateFactory11116.getClass();
                                    routeSelectionInputUIStateC = c(str, str3, list2, str4, wg0Var111118);
                                    mTicketTripInfoUIStateFactory$convertToUIState$1.L$0 = mTicketTripInfoDataState8;
                                    mTicketTripInfoUIStateFactory$convertToUIState$1.L$1 = function7;
                                    mTicketTripInfoUIStateFactory$convertToUIState$1.L$2 = toolbarUIState6;
                                    mTicketTripInfoUIStateFactory$convertToUIState$1.L$3 = buttonUIState4;
                                    mTicketTripInfoUIStateFactory$convertToUIState$1.L$4 = chaloTextUIState5;
                                    mTicketTripInfoUIStateFactory$convertToUIState$1.L$5 = loadingDialogUIState2;
                                    mTicketTripInfoUIStateFactory$convertToUIState$1.L$6 = productBookingBranding2;
                                    mTicketTripInfoUIStateFactory$convertToUIState$1.L$7 = snackbarUIState2;
                                    mTicketTripInfoUIStateFactory$convertToUIState$1.L$8 = routeSelectionInputUIStateC;
                                    mTicketTripInfoUIStateFactory$convertToUIState$1.L$9 = this;
                                    mTicketTripInfoUIStateFactory$convertToUIState$1.L$10 = null;
                                    mTicketTripInfoUIStateFactory$convertToUIState$1.L$11 = null;
                                    mTicketTripInfoUIStateFactory$convertToUIState$1.label = 8;
                                    objB7 = stringProvider4.b(StringEnum.HINT_START_STOP, new Object[0], mTicketTripInfoUIStateFactory$convertToUIState$1);
                                    coroutineSingletons = coroutineSingletons6;
                                    if (objB7 == coroutineSingletons) {
                                        return coroutineSingletons;
                                    }
                                    SnackbarUIState snackbarUIState1111113 = snackbarUIState2;
                                    routeSelectionInputUIState = routeSelectionInputUIStateC;
                                    loadingDialogUIState3 = loadingDialogUIState2;
                                    productBookingBranding3 = productBookingBranding2;
                                    snackbarUIState3 = snackbarUIState1111113;
                                    ToolbarUIState toolbarUIState1111 = toolbarUIState6;
                                    buttonUIState5 = buttonUIState4;
                                    function8 = function7;
                                    toolbarUIState7 = toolbarUIState1111;
                                    mTicketTripInfoUIStateFactory2 = this;
                                    str6 = (String) objB7;
                                    productBookingStopDetails = mTicketTripInfoDataState8.c;
                                    if (productBookingStopDetails != null) {
                                        str7 = str2;
                                    } else {
                                        str7 = str2;
                                    }
                                    list3 = EmptyList.f17557a;
                                    coroutineSingletons2 = coroutineSingletons;
                                    if (mTicketTripInfoDataState8.i == MTicketTripInfoMissingFieldError.FROM_STOP) {
                                        mTicketTripInfoUIStateFactory$convertToUIState$1.L$0 = mTicketTripInfoDataState8;
                                        mTicketTripInfoUIStateFactory$convertToUIState$1.L$1 = function8;
                                        mTicketTripInfoUIStateFactory$convertToUIState$1.L$2 = toolbarUIState7;
                                        mTicketTripInfoUIStateFactory$convertToUIState$1.L$3 = buttonUIState5;
                                        mTicketTripInfoUIStateFactory$convertToUIState$1.L$4 = chaloTextUIState5;
                                        mTicketTripInfoUIStateFactory$convertToUIState$1.L$5 = loadingDialogUIState3;
                                        mTicketTripInfoUIStateFactory$convertToUIState$1.L$6 = productBookingBranding3;
                                        mTicketTripInfoUIStateFactory$convertToUIState$1.L$7 = snackbarUIState3;
                                        mTicketTripInfoUIStateFactory$convertToUIState$1.L$8 = routeSelectionInputUIState;
                                        mTicketTripInfoUIStateFactory$convertToUIState$1.L$9 = mTicketTripInfoUIStateFactory2;
                                        mTicketTripInfoUIStateFactory$convertToUIState$1.L$10 = str6;
                                        mTicketTripInfoUIStateFactory$convertToUIState$1.L$11 = str7;
                                        mTicketTripInfoUIStateFactory$convertToUIState$1.L$12 = list3;
                                        mTicketTripInfoUIStateFactory$convertToUIState$1.label = 9;
                                        loadingDialogUIState4 = loadingDialogUIState3;
                                        stringProvider = stringProvider4;
                                        objB8 = stringProvider.b(StringEnum.STATUS_ERROR_ENTER_STOP, new Object[0], mTicketTripInfoUIStateFactory$convertToUIState$1);
                                        coroutineSingletons3 = coroutineSingletons2;
                                        if (objB8 == coroutineSingletons3) {
                                            return coroutineSingletons3;
                                        }
                                        TextUIState.ChaloTextUIState chaloTextUIState111119 = chaloTextUIState5;
                                        str9 = str7;
                                        obj7 = objB8;
                                        chaloTextUIState7 = chaloTextUIState111119;
                                        SnackbarUIState snackbarUIState1111114 = snackbarUIState3;
                                        routeSelectionInputUIState2 = routeSelectionInputUIState;
                                        toolbarUIState8 = toolbarUIState7;
                                        buttonUIState6 = buttonUIState5;
                                        function9 = function8;
                                        productBookingBranding4 = productBookingBranding3;
                                        snackbarUIState4 = snackbarUIState1111114;
                                        coroutineSingletons2 = coroutineSingletons3;
                                        mTicketTripInfoUIStateFactory3 = mTicketTripInfoUIStateFactory2;
                                        str8 = (String) obj7;
                                    } else {
                                        loadingDialogUIState4 = loadingDialogUIState3;
                                        stringProvider = stringProvider4;
                                        SnackbarUIState snackbarUIState1111115 = snackbarUIState3;
                                        routeSelectionInputUIState2 = routeSelectionInputUIState;
                                        toolbarUIState8 = toolbarUIState7;
                                        buttonUIState6 = buttonUIState5;
                                        function9 = function8;
                                        productBookingBranding4 = productBookingBranding3;
                                        snackbarUIState4 = snackbarUIState1111115;
                                        chaloTextUIState7 = chaloTextUIState5;
                                        mTicketTripInfoUIStateFactory3 = mTicketTripInfoUIStateFactory2;
                                        str8 = null;
                                        str9 = str7;
                                    }
                                    loadingDialogUIState5 = loadingDialogUIState4;
                                    StringProvider stringProvider114 = stringProvider;
                                    wg0 wg0Var111119 = new wg0(function9, 5);
                                    mTicketTripInfoUIStateFactory3.getClass();
                                    routeSelectionInputUIStateC2 = c(str6, str9, list3, str8, wg0Var111119);
                                    mTicketTripInfoUIStateFactory$convertToUIState$1.L$0 = mTicketTripInfoDataState8;
                                    mTicketTripInfoUIStateFactory$convertToUIState$1.L$1 = function9;
                                    mTicketTripInfoUIStateFactory$convertToUIState$1.L$2 = toolbarUIState8;
                                    mTicketTripInfoUIStateFactory$convertToUIState$1.L$3 = buttonUIState6;
                                    mTicketTripInfoUIStateFactory$convertToUIState$1.L$4 = chaloTextUIState7;
                                    mTicketTripInfoUIStateFactory$convertToUIState$1.L$5 = loadingDialogUIState5;
                                    mTicketTripInfoUIStateFactory$convertToUIState$1.L$6 = productBookingBranding4;
                                    mTicketTripInfoUIStateFactory$convertToUIState$1.L$7 = snackbarUIState4;
                                    mTicketTripInfoUIStateFactory$convertToUIState$1.L$8 = routeSelectionInputUIState2;
                                    mTicketTripInfoUIStateFactory$convertToUIState$1.L$9 = routeSelectionInputUIStateC2;
                                    mTicketTripInfoUIStateFactory$convertToUIState$1.L$10 = this;
                                    mTicketTripInfoUIStateFactory$convertToUIState$1.L$11 = null;
                                    mTicketTripInfoUIStateFactory$convertToUIState$1.L$12 = null;
                                    mTicketTripInfoUIStateFactory$convertToUIState$1.label = 10;
                                    stringProvider2 = stringProvider114;
                                    objB9 = stringProvider2.b(StringEnum.HINT_END_STOP, new Object[0], mTicketTripInfoUIStateFactory$convertToUIState$1);
                                    coroutineSingletons4 = coroutineSingletons2;
                                    if (objB9 == coroutineSingletons4) {
                                        return coroutineSingletons4;
                                    }
                                    loadingDialogUIState6 = loadingDialogUIState5;
                                    obj8 = objB9;
                                    toolbarUIState9 = toolbarUIState8;
                                    routeSelectionInputUIState3 = routeSelectionInputUIStateC2;
                                    mTicketTripInfoUIStateFactory4 = this;
                                    str10 = (String) obj8;
                                    productBookingStopDetails2 = mTicketTripInfoDataState8.d;
                                    if (productBookingStopDetails2 != null) {
                                        str11 = str2;
                                    } else {
                                        str11 = str2;
                                    }
                                    coroutineSingletons5 = coroutineSingletons4;
                                    list4 = EmptyList.f17557a;
                                    stringProvider3 = stringProvider2;
                                    if (mTicketTripInfoDataState8.i == MTicketTripInfoMissingFieldError.TO_STOP) {
                                        mTicketTripInfoUIStateFactory$convertToUIState$1.L$0 = function9;
                                        mTicketTripInfoUIStateFactory$convertToUIState$1.L$1 = toolbarUIState9;
                                        mTicketTripInfoUIStateFactory$convertToUIState$1.L$2 = buttonUIState6;
                                        mTicketTripInfoUIStateFactory$convertToUIState$1.L$3 = chaloTextUIState7;
                                        mTicketTripInfoUIStateFactory$convertToUIState$1.L$4 = loadingDialogUIState6;
                                        mTicketTripInfoUIStateFactory$convertToUIState$1.L$5 = productBookingBranding4;
                                        mTicketTripInfoUIStateFactory$convertToUIState$1.L$6 = snackbarUIState4;
                                        mTicketTripInfoUIStateFactory$convertToUIState$1.L$7 = routeSelectionInputUIState2;
                                        mTicketTripInfoUIStateFactory$convertToUIState$1.L$8 = routeSelectionInputUIState3;
                                        mTicketTripInfoUIStateFactory$convertToUIState$1.L$9 = mTicketTripInfoUIStateFactory4;
                                        mTicketTripInfoUIStateFactory$convertToUIState$1.L$10 = str10;
                                        mTicketTripInfoUIStateFactory$convertToUIState$1.L$11 = str11;
                                        mTicketTripInfoUIStateFactory$convertToUIState$1.L$12 = list4;
                                        mTicketTripInfoUIStateFactory6 = mTicketTripInfoUIStateFactory4;
                                        mTicketTripInfoUIStateFactory$convertToUIState$1.label = 11;
                                        objB10 = stringProvider3.b(StringEnum.STATUS_ERROR_ENTER_STOP, new Object[0], mTicketTripInfoUIStateFactory$convertToUIState$1);
                                        if (objB10 == coroutineSingletons5) {
                                            return coroutineSingletons5;
                                        }
                                        chaloTextUIState9 = chaloTextUIState7;
                                        routeSelectionInputUIState6 = routeSelectionInputUIState2;
                                        productBookingBranding6 = productBookingBranding4;
                                        function10 = function9;
                                        buttonUIState7 = buttonUIState6;
                                        str13 = str10;
                                        toolbarUIState11 = toolbarUIState9;
                                        routeSelectionInputUIState7 = routeSelectionInputUIState3;
                                        snackbarUIState5 = snackbarUIState4;
                                        obj9 = objB10;
                                        loadingDialogUIState8 = loadingDialogUIState6;
                                        list5 = list4;
                                        mTicketTripInfoUIStateFactory7 = mTicketTripInfoUIStateFactory6;
                                        String str111113 = (String) obj9;
                                        Function1 function1111 = function10;
                                        str12 = str111113;
                                        mTicketTripInfoUIStateFactory5 = mTicketTripInfoUIStateFactory7;
                                        list4 = list5;
                                        toolbarUIState10 = toolbarUIState11;
                                        function9 = function1111;
                                        LoadingDialogUIState loadingDialogUIState118 = loadingDialogUIState8;
                                        snackbarUIState4 = snackbarUIState5;
                                        productBookingBranding5 = productBookingBranding6;
                                        loadingDialogUIState7 = loadingDialogUIState118;
                                        str10 = str13;
                                        routeSelectionInputUIState5 = routeSelectionInputUIState7;
                                        routeSelectionInputUIState4 = routeSelectionInputUIState6;
                                        chaloTextUIState8 = chaloTextUIState9;
                                        buttonUIState6 = buttonUIState7;
                                    } else {
                                        MTicketTripInfoUIStateFactory mTicketTripInfoUIStateFactory11117 = mTicketTripInfoUIStateFactory4;
                                        RouteSelectionInputUIState routeSelectionInputUIState117 = routeSelectionInputUIState2;
                                        loadingDialogUIState7 = loadingDialogUIState6;
                                        toolbarUIState10 = toolbarUIState9;
                                        routeSelectionInputUIState4 = routeSelectionInputUIState117;
                                        chaloTextUIState8 = chaloTextUIState7;
                                        routeSelectionInputUIState5 = routeSelectionInputUIState3;
                                        productBookingBranding5 = productBookingBranding4;
                                        mTicketTripInfoUIStateFactory5 = mTicketTripInfoUIStateFactory11117;
                                        str12 = null;
                                    }
                                    wg0 wg0Var1111110 = new wg0(function9, 6);
                                    mTicketTripInfoUIStateFactory5.getClass();
                                    return new MTicketTripInfoUIState(toolbarUIState10, routeSelectionInputUIState4, routeSelectionInputUIState5, c(str10, str11, list4, str12, wg0Var1111110), buttonUIState6, chaloTextUIState8, productBookingBranding5, loadingDialogUIState7, snackbarUIState4);
                                }
                            }
                        }
                    }
                } else {
                    mTicketTripInfoDataState5 = mTicketTripInfoDataState4;
                    chaloTextUIState = null;
                    function4 = function3;
                    buttonUIState = buttonUIStateG;
                    toolbarUIState3 = toolbarUIState2;
                    if (mTicketTripInfoDataState5.f) {
                        mTicketTripInfoUIStateFactory$convertToUIState$1.L$0 = mTicketTripInfoDataState5;
                        mTicketTripInfoUIStateFactory$convertToUIState$1.L$1 = function4;
                        mTicketTripInfoUIStateFactory$convertToUIState$1.L$2 = toolbarUIState3;
                        mTicketTripInfoUIStateFactory$convertToUIState$1.L$3 = buttonUIState;
                        mTicketTripInfoUIStateFactory$convertToUIState$1.L$4 = chaloTextUIState;
                        dialogUIStateFactory = DialogUIStateFactory.f9989a;
                        mTicketTripInfoUIStateFactory$convertToUIState$1.L$5 = dialogUIStateFactory;
                        mTicketTripInfoUIStateFactory$convertToUIState$1.label = 4;
                        objB4 = stringProvider4.b(StringEnum.LOADING, new Object[0], mTicketTripInfoUIStateFactory$convertToUIState$1);
                        if (objB4 != coroutineSingletons6) {
                            obj3 = objB4;
                            chaloTextUIState3 = chaloTextUIState;
                            dialogUIStateFactory2 = dialogUIStateFactory;
                            dialogUIStateFactory2.getClass();
                            loadingDialogUIStateA = DialogUIStateFactory.a((String) obj3);
                            mTicketTripInfoDataState7 = mTicketTripInfoDataState5;
                            function5 = function4;
                            toolbarUIState4 = toolbarUIState3;
                            buttonUIState2 = buttonUIState;
                            chaloTextUIState2 = chaloTextUIState3;
                            productBookingBranding = mTicketTripInfoDataState7.g;
                            mTicketTripInfoSnackBarType = mTicketTripInfoDataState7.e;
                            if (mTicketTripInfoSnackBarType != null) {
                                mTicketTripInfoUIStateFactory$convertToUIState$1.L$0 = mTicketTripInfoDataState7;
                                mTicketTripInfoUIStateFactory$convertToUIState$1.L$1 = function5;
                                mTicketTripInfoUIStateFactory$convertToUIState$1.L$2 = toolbarUIState4;
                                mTicketTripInfoUIStateFactory$convertToUIState$1.L$3 = buttonUIState2;
                                mTicketTripInfoUIStateFactory$convertToUIState$1.L$4 = chaloTextUIState2;
                                mTicketTripInfoUIStateFactory$convertToUIState$1.L$5 = loadingDialogUIStateA;
                                mTicketTripInfoUIStateFactory$convertToUIState$1.L$6 = productBookingBranding;
                                mTicketTripInfoUIStateFactory$convertToUIState$1.label = 5;
                                objD = d(mTicketTripInfoSnackBarType, function5, mTicketTripInfoUIStateFactory$convertToUIState$1);
                                if (objD != coroutineSingletons6) {
                                    TextUIState.ChaloTextUIState chaloTextUIState1111110 = chaloTextUIState2;
                                    loadingDialogUIState = loadingDialogUIStateA;
                                    obj4 = objD;
                                    mTicketTripInfoDataState8 = mTicketTripInfoDataState7;
                                    function6 = function5;
                                    toolbarUIState5 = toolbarUIState4;
                                    buttonUIState3 = buttonUIState2;
                                    chaloTextUIState4 = chaloTextUIState1111110;
                                    snackbarUIState = (SnackbarUIState) obj4;
                                    mTicketTripInfoUIStateFactory$convertToUIState$1.L$0 = mTicketTripInfoDataState8;
                                    mTicketTripInfoUIStateFactory$convertToUIState$1.L$1 = function6;
                                    mTicketTripInfoUIStateFactory$convertToUIState$1.L$2 = toolbarUIState5;
                                    mTicketTripInfoUIStateFactory$convertToUIState$1.L$3 = buttonUIState3;
                                    mTicketTripInfoUIStateFactory$convertToUIState$1.L$4 = chaloTextUIState4;
                                    mTicketTripInfoUIStateFactory$convertToUIState$1.L$5 = loadingDialogUIState;
                                    mTicketTripInfoUIStateFactory$convertToUIState$1.L$6 = productBookingBranding;
                                    mTicketTripInfoUIStateFactory$convertToUIState$1.L$7 = snackbarUIState;
                                    mTicketTripInfoUIStateFactory$convertToUIState$1.L$8 = this;
                                    mTicketTripInfoUIStateFactory$convertToUIState$1.label = 6;
                                    objB5 = stringProvider4.b(StringEnum.HINT_ROUTE_NUMBER, new Object[0], mTicketTripInfoUIStateFactory$convertToUIState$1);
                                    if (objB5 != coroutineSingletons6) {
                                        ButtonUIState buttonUIState118 = buttonUIState3;
                                        snackbarUIState2 = snackbarUIState;
                                        obj5 = objB5;
                                        buttonUIState4 = buttonUIState118;
                                        toolbarUIState6 = toolbarUIState5;
                                        function7 = function6;
                                        productBookingBranding2 = productBookingBranding;
                                        loadingDialogUIState2 = loadingDialogUIState;
                                        chaloTextUIState5 = chaloTextUIState4;
                                        mTicketTripInfoUIStateFactory = this;
                                        str = (String) obj5;
                                        productBookingRouteDetails = mTicketTripInfoDataState8.b;
                                        str2 = "";
                                        if (productBookingRouteDetails != null) {
                                            str3 = str2;
                                        } else {
                                            str3 = str2;
                                        }
                                        if (productBookingRouteDetails != null) {
                                            list = EmptyList.f17557a;
                                        } else {
                                            list = EmptyList.f17557a;
                                        }
                                        if (mTicketTripInfoDataState8.i == MTicketTripInfoMissingFieldError.ROUTE) {
                                            mTicketTripInfoUIStateFactory$convertToUIState$1.L$0 = mTicketTripInfoDataState8;
                                            mTicketTripInfoUIStateFactory$convertToUIState$1.L$1 = function7;
                                            mTicketTripInfoUIStateFactory$convertToUIState$1.L$2 = toolbarUIState6;
                                            mTicketTripInfoUIStateFactory$convertToUIState$1.L$3 = buttonUIState4;
                                            mTicketTripInfoUIStateFactory$convertToUIState$1.L$4 = chaloTextUIState5;
                                            mTicketTripInfoUIStateFactory$convertToUIState$1.L$5 = loadingDialogUIState2;
                                            mTicketTripInfoUIStateFactory$convertToUIState$1.L$6 = productBookingBranding2;
                                            mTicketTripInfoUIStateFactory$convertToUIState$1.L$7 = snackbarUIState2;
                                            mTicketTripInfoUIStateFactory$convertToUIState$1.L$8 = mTicketTripInfoUIStateFactory;
                                            mTicketTripInfoUIStateFactory$convertToUIState$1.L$9 = str;
                                            mTicketTripInfoUIStateFactory$convertToUIState$1.L$10 = str3;
                                            mTicketTripInfoUIStateFactory$convertToUIState$1.L$11 = list;
                                            mTicketTripInfoUIStateFactory$convertToUIState$1.label = 7;
                                            objB6 = stringProvider4.b(StringEnum.STATUS_ERROR_ROUTE_NUMBER, new Object[0], mTicketTripInfoUIStateFactory$convertToUIState$1);
                                            if (objB6 != coroutineSingletons6) {
                                                coroutineSingletons6 = coroutineSingletons6;
                                                List list116 = list;
                                                obj6 = objB6;
                                                list2 = list116;
                                                String str111114 = str3;
                                                chaloTextUIState6 = chaloTextUIState5;
                                                str5 = str111114;
                                                str4 = (String) obj6;
                                                TextUIState.ChaloTextUIState chaloTextUIState1111111 = chaloTextUIState6;
                                                str3 = str5;
                                                chaloTextUIState5 = chaloTextUIState1111111;
                                            }
                                        } else {
                                            coroutineSingletons6 = coroutineSingletons6;
                                            list2 = list;
                                            str4 = null;
                                        }
                                        MTicketTripInfoUIStateFactory mTicketTripInfoUIStateFactory11118 = mTicketTripInfoUIStateFactory;
                                        wg0 wg0Var1111111 = new wg0(function7, 4);
                                        mTicketTripInfoUIStateFactory11118.getClass();
                                        routeSelectionInputUIStateC = c(str, str3, list2, str4, wg0Var1111111);
                                        mTicketTripInfoUIStateFactory$convertToUIState$1.L$0 = mTicketTripInfoDataState8;
                                        mTicketTripInfoUIStateFactory$convertToUIState$1.L$1 = function7;
                                        mTicketTripInfoUIStateFactory$convertToUIState$1.L$2 = toolbarUIState6;
                                        mTicketTripInfoUIStateFactory$convertToUIState$1.L$3 = buttonUIState4;
                                        mTicketTripInfoUIStateFactory$convertToUIState$1.L$4 = chaloTextUIState5;
                                        mTicketTripInfoUIStateFactory$convertToUIState$1.L$5 = loadingDialogUIState2;
                                        mTicketTripInfoUIStateFactory$convertToUIState$1.L$6 = productBookingBranding2;
                                        mTicketTripInfoUIStateFactory$convertToUIState$1.L$7 = snackbarUIState2;
                                        mTicketTripInfoUIStateFactory$convertToUIState$1.L$8 = routeSelectionInputUIStateC;
                                        mTicketTripInfoUIStateFactory$convertToUIState$1.L$9 = this;
                                        mTicketTripInfoUIStateFactory$convertToUIState$1.L$10 = null;
                                        mTicketTripInfoUIStateFactory$convertToUIState$1.L$11 = null;
                                        mTicketTripInfoUIStateFactory$convertToUIState$1.label = 8;
                                        objB7 = stringProvider4.b(StringEnum.HINT_START_STOP, new Object[0], mTicketTripInfoUIStateFactory$convertToUIState$1);
                                        coroutineSingletons = coroutineSingletons6;
                                        if (objB7 == coroutineSingletons) {
                                            return coroutineSingletons;
                                        }
                                        SnackbarUIState snackbarUIState1111116 = snackbarUIState2;
                                        routeSelectionInputUIState = routeSelectionInputUIStateC;
                                        loadingDialogUIState3 = loadingDialogUIState2;
                                        productBookingBranding3 = productBookingBranding2;
                                        snackbarUIState3 = snackbarUIState1111116;
                                        ToolbarUIState toolbarUIState1112 = toolbarUIState6;
                                        buttonUIState5 = buttonUIState4;
                                        function8 = function7;
                                        toolbarUIState7 = toolbarUIState1112;
                                        mTicketTripInfoUIStateFactory2 = this;
                                        str6 = (String) objB7;
                                        productBookingStopDetails = mTicketTripInfoDataState8.c;
                                        if (productBookingStopDetails != null) {
                                            str7 = str2;
                                        } else {
                                            str7 = str2;
                                        }
                                        list3 = EmptyList.f17557a;
                                        coroutineSingletons2 = coroutineSingletons;
                                        if (mTicketTripInfoDataState8.i == MTicketTripInfoMissingFieldError.FROM_STOP) {
                                            mTicketTripInfoUIStateFactory$convertToUIState$1.L$0 = mTicketTripInfoDataState8;
                                            mTicketTripInfoUIStateFactory$convertToUIState$1.L$1 = function8;
                                            mTicketTripInfoUIStateFactory$convertToUIState$1.L$2 = toolbarUIState7;
                                            mTicketTripInfoUIStateFactory$convertToUIState$1.L$3 = buttonUIState5;
                                            mTicketTripInfoUIStateFactory$convertToUIState$1.L$4 = chaloTextUIState5;
                                            mTicketTripInfoUIStateFactory$convertToUIState$1.L$5 = loadingDialogUIState3;
                                            mTicketTripInfoUIStateFactory$convertToUIState$1.L$6 = productBookingBranding3;
                                            mTicketTripInfoUIStateFactory$convertToUIState$1.L$7 = snackbarUIState3;
                                            mTicketTripInfoUIStateFactory$convertToUIState$1.L$8 = routeSelectionInputUIState;
                                            mTicketTripInfoUIStateFactory$convertToUIState$1.L$9 = mTicketTripInfoUIStateFactory2;
                                            mTicketTripInfoUIStateFactory$convertToUIState$1.L$10 = str6;
                                            mTicketTripInfoUIStateFactory$convertToUIState$1.L$11 = str7;
                                            mTicketTripInfoUIStateFactory$convertToUIState$1.L$12 = list3;
                                            mTicketTripInfoUIStateFactory$convertToUIState$1.label = 9;
                                            loadingDialogUIState4 = loadingDialogUIState3;
                                            stringProvider = stringProvider4;
                                            objB8 = stringProvider.b(StringEnum.STATUS_ERROR_ENTER_STOP, new Object[0], mTicketTripInfoUIStateFactory$convertToUIState$1);
                                            coroutineSingletons3 = coroutineSingletons2;
                                            if (objB8 == coroutineSingletons3) {
                                                return coroutineSingletons3;
                                            }
                                            TextUIState.ChaloTextUIState chaloTextUIState1111112 = chaloTextUIState5;
                                            str9 = str7;
                                            obj7 = objB8;
                                            chaloTextUIState7 = chaloTextUIState1111112;
                                            SnackbarUIState snackbarUIState1111117 = snackbarUIState3;
                                            routeSelectionInputUIState2 = routeSelectionInputUIState;
                                            toolbarUIState8 = toolbarUIState7;
                                            buttonUIState6 = buttonUIState5;
                                            function9 = function8;
                                            productBookingBranding4 = productBookingBranding3;
                                            snackbarUIState4 = snackbarUIState1111117;
                                            coroutineSingletons2 = coroutineSingletons3;
                                            mTicketTripInfoUIStateFactory3 = mTicketTripInfoUIStateFactory2;
                                            str8 = (String) obj7;
                                        } else {
                                            loadingDialogUIState4 = loadingDialogUIState3;
                                            stringProvider = stringProvider4;
                                            SnackbarUIState snackbarUIState1111118 = snackbarUIState3;
                                            routeSelectionInputUIState2 = routeSelectionInputUIState;
                                            toolbarUIState8 = toolbarUIState7;
                                            buttonUIState6 = buttonUIState5;
                                            function9 = function8;
                                            productBookingBranding4 = productBookingBranding3;
                                            snackbarUIState4 = snackbarUIState1111118;
                                            chaloTextUIState7 = chaloTextUIState5;
                                            mTicketTripInfoUIStateFactory3 = mTicketTripInfoUIStateFactory2;
                                            str8 = null;
                                            str9 = str7;
                                        }
                                        loadingDialogUIState5 = loadingDialogUIState4;
                                        StringProvider stringProvider115 = stringProvider;
                                        wg0 wg0Var1111112 = new wg0(function9, 5);
                                        mTicketTripInfoUIStateFactory3.getClass();
                                        routeSelectionInputUIStateC2 = c(str6, str9, list3, str8, wg0Var1111112);
                                        mTicketTripInfoUIStateFactory$convertToUIState$1.L$0 = mTicketTripInfoDataState8;
                                        mTicketTripInfoUIStateFactory$convertToUIState$1.L$1 = function9;
                                        mTicketTripInfoUIStateFactory$convertToUIState$1.L$2 = toolbarUIState8;
                                        mTicketTripInfoUIStateFactory$convertToUIState$1.L$3 = buttonUIState6;
                                        mTicketTripInfoUIStateFactory$convertToUIState$1.L$4 = chaloTextUIState7;
                                        mTicketTripInfoUIStateFactory$convertToUIState$1.L$5 = loadingDialogUIState5;
                                        mTicketTripInfoUIStateFactory$convertToUIState$1.L$6 = productBookingBranding4;
                                        mTicketTripInfoUIStateFactory$convertToUIState$1.L$7 = snackbarUIState4;
                                        mTicketTripInfoUIStateFactory$convertToUIState$1.L$8 = routeSelectionInputUIState2;
                                        mTicketTripInfoUIStateFactory$convertToUIState$1.L$9 = routeSelectionInputUIStateC2;
                                        mTicketTripInfoUIStateFactory$convertToUIState$1.L$10 = this;
                                        mTicketTripInfoUIStateFactory$convertToUIState$1.L$11 = null;
                                        mTicketTripInfoUIStateFactory$convertToUIState$1.L$12 = null;
                                        mTicketTripInfoUIStateFactory$convertToUIState$1.label = 10;
                                        stringProvider2 = stringProvider115;
                                        objB9 = stringProvider2.b(StringEnum.HINT_END_STOP, new Object[0], mTicketTripInfoUIStateFactory$convertToUIState$1);
                                        coroutineSingletons4 = coroutineSingletons2;
                                        if (objB9 == coroutineSingletons4) {
                                            return coroutineSingletons4;
                                        }
                                        loadingDialogUIState6 = loadingDialogUIState5;
                                        obj8 = objB9;
                                        toolbarUIState9 = toolbarUIState8;
                                        routeSelectionInputUIState3 = routeSelectionInputUIStateC2;
                                        mTicketTripInfoUIStateFactory4 = this;
                                        str10 = (String) obj8;
                                        productBookingStopDetails2 = mTicketTripInfoDataState8.d;
                                        if (productBookingStopDetails2 != null) {
                                            str11 = str2;
                                        } else {
                                            str11 = str2;
                                        }
                                        coroutineSingletons5 = coroutineSingletons4;
                                        list4 = EmptyList.f17557a;
                                        stringProvider3 = stringProvider2;
                                        if (mTicketTripInfoDataState8.i == MTicketTripInfoMissingFieldError.TO_STOP) {
                                            mTicketTripInfoUIStateFactory$convertToUIState$1.L$0 = function9;
                                            mTicketTripInfoUIStateFactory$convertToUIState$1.L$1 = toolbarUIState9;
                                            mTicketTripInfoUIStateFactory$convertToUIState$1.L$2 = buttonUIState6;
                                            mTicketTripInfoUIStateFactory$convertToUIState$1.L$3 = chaloTextUIState7;
                                            mTicketTripInfoUIStateFactory$convertToUIState$1.L$4 = loadingDialogUIState6;
                                            mTicketTripInfoUIStateFactory$convertToUIState$1.L$5 = productBookingBranding4;
                                            mTicketTripInfoUIStateFactory$convertToUIState$1.L$6 = snackbarUIState4;
                                            mTicketTripInfoUIStateFactory$convertToUIState$1.L$7 = routeSelectionInputUIState2;
                                            mTicketTripInfoUIStateFactory$convertToUIState$1.L$8 = routeSelectionInputUIState3;
                                            mTicketTripInfoUIStateFactory$convertToUIState$1.L$9 = mTicketTripInfoUIStateFactory4;
                                            mTicketTripInfoUIStateFactory$convertToUIState$1.L$10 = str10;
                                            mTicketTripInfoUIStateFactory$convertToUIState$1.L$11 = str11;
                                            mTicketTripInfoUIStateFactory$convertToUIState$1.L$12 = list4;
                                            mTicketTripInfoUIStateFactory6 = mTicketTripInfoUIStateFactory4;
                                            mTicketTripInfoUIStateFactory$convertToUIState$1.label = 11;
                                            objB10 = stringProvider3.b(StringEnum.STATUS_ERROR_ENTER_STOP, new Object[0], mTicketTripInfoUIStateFactory$convertToUIState$1);
                                            if (objB10 == coroutineSingletons5) {
                                                return coroutineSingletons5;
                                            }
                                            chaloTextUIState9 = chaloTextUIState7;
                                            routeSelectionInputUIState6 = routeSelectionInputUIState2;
                                            productBookingBranding6 = productBookingBranding4;
                                            function10 = function9;
                                            buttonUIState7 = buttonUIState6;
                                            str13 = str10;
                                            toolbarUIState11 = toolbarUIState9;
                                            routeSelectionInputUIState7 = routeSelectionInputUIState3;
                                            snackbarUIState5 = snackbarUIState4;
                                            obj9 = objB10;
                                            loadingDialogUIState8 = loadingDialogUIState6;
                                            list5 = list4;
                                            mTicketTripInfoUIStateFactory7 = mTicketTripInfoUIStateFactory6;
                                            String str111115 = (String) obj9;
                                            Function1 function1112 = function10;
                                            str12 = str111115;
                                            mTicketTripInfoUIStateFactory5 = mTicketTripInfoUIStateFactory7;
                                            list4 = list5;
                                            toolbarUIState10 = toolbarUIState11;
                                            function9 = function1112;
                                            LoadingDialogUIState loadingDialogUIState119 = loadingDialogUIState8;
                                            snackbarUIState4 = snackbarUIState5;
                                            productBookingBranding5 = productBookingBranding6;
                                            loadingDialogUIState7 = loadingDialogUIState119;
                                            str10 = str13;
                                            routeSelectionInputUIState5 = routeSelectionInputUIState7;
                                            routeSelectionInputUIState4 = routeSelectionInputUIState6;
                                            chaloTextUIState8 = chaloTextUIState9;
                                            buttonUIState6 = buttonUIState7;
                                        } else {
                                            MTicketTripInfoUIStateFactory mTicketTripInfoUIStateFactory11119 = mTicketTripInfoUIStateFactory4;
                                            RouteSelectionInputUIState routeSelectionInputUIState118 = routeSelectionInputUIState2;
                                            loadingDialogUIState7 = loadingDialogUIState6;
                                            toolbarUIState10 = toolbarUIState9;
                                            routeSelectionInputUIState4 = routeSelectionInputUIState118;
                                            chaloTextUIState8 = chaloTextUIState7;
                                            routeSelectionInputUIState5 = routeSelectionInputUIState3;
                                            productBookingBranding5 = productBookingBranding4;
                                            mTicketTripInfoUIStateFactory5 = mTicketTripInfoUIStateFactory11119;
                                            str12 = null;
                                        }
                                        wg0 wg0Var1111113 = new wg0(function9, 6);
                                        mTicketTripInfoUIStateFactory5.getClass();
                                        return new MTicketTripInfoUIState(toolbarUIState10, routeSelectionInputUIState4, routeSelectionInputUIState5, c(str10, str11, list4, str12, wg0Var1111113), buttonUIState6, chaloTextUIState8, productBookingBranding5, loadingDialogUIState7, snackbarUIState4);
                                    }
                                }
                            } else {
                                mTicketTripInfoDataState8 = mTicketTripInfoDataState7;
                                function6 = function5;
                                toolbarUIState5 = toolbarUIState4;
                                buttonUIState3 = buttonUIState2;
                                chaloTextUIState4 = chaloTextUIState2;
                                loadingDialogUIState = loadingDialogUIStateA;
                                snackbarUIState = null;
                                mTicketTripInfoUIStateFactory$convertToUIState$1.L$0 = mTicketTripInfoDataState8;
                                mTicketTripInfoUIStateFactory$convertToUIState$1.L$1 = function6;
                                mTicketTripInfoUIStateFactory$convertToUIState$1.L$2 = toolbarUIState5;
                                mTicketTripInfoUIStateFactory$convertToUIState$1.L$3 = buttonUIState3;
                                mTicketTripInfoUIStateFactory$convertToUIState$1.L$4 = chaloTextUIState4;
                                mTicketTripInfoUIStateFactory$convertToUIState$1.L$5 = loadingDialogUIState;
                                mTicketTripInfoUIStateFactory$convertToUIState$1.L$6 = productBookingBranding;
                                mTicketTripInfoUIStateFactory$convertToUIState$1.L$7 = snackbarUIState;
                                mTicketTripInfoUIStateFactory$convertToUIState$1.L$8 = this;
                                mTicketTripInfoUIStateFactory$convertToUIState$1.label = 6;
                                objB5 = stringProvider4.b(StringEnum.HINT_ROUTE_NUMBER, new Object[0], mTicketTripInfoUIStateFactory$convertToUIState$1);
                                if (objB5 != coroutineSingletons6) {
                                    ButtonUIState buttonUIState119 = buttonUIState3;
                                    snackbarUIState2 = snackbarUIState;
                                    obj5 = objB5;
                                    buttonUIState4 = buttonUIState119;
                                    toolbarUIState6 = toolbarUIState5;
                                    function7 = function6;
                                    productBookingBranding2 = productBookingBranding;
                                    loadingDialogUIState2 = loadingDialogUIState;
                                    chaloTextUIState5 = chaloTextUIState4;
                                    mTicketTripInfoUIStateFactory = this;
                                    str = (String) obj5;
                                    productBookingRouteDetails = mTicketTripInfoDataState8.b;
                                    str2 = "";
                                    if (productBookingRouteDetails != null) {
                                        str3 = str2;
                                    } else {
                                        str3 = str2;
                                    }
                                    if (productBookingRouteDetails != null) {
                                        list = EmptyList.f17557a;
                                    } else {
                                        list = EmptyList.f17557a;
                                    }
                                    if (mTicketTripInfoDataState8.i == MTicketTripInfoMissingFieldError.ROUTE) {
                                        mTicketTripInfoUIStateFactory$convertToUIState$1.L$0 = mTicketTripInfoDataState8;
                                        mTicketTripInfoUIStateFactory$convertToUIState$1.L$1 = function7;
                                        mTicketTripInfoUIStateFactory$convertToUIState$1.L$2 = toolbarUIState6;
                                        mTicketTripInfoUIStateFactory$convertToUIState$1.L$3 = buttonUIState4;
                                        mTicketTripInfoUIStateFactory$convertToUIState$1.L$4 = chaloTextUIState5;
                                        mTicketTripInfoUIStateFactory$convertToUIState$1.L$5 = loadingDialogUIState2;
                                        mTicketTripInfoUIStateFactory$convertToUIState$1.L$6 = productBookingBranding2;
                                        mTicketTripInfoUIStateFactory$convertToUIState$1.L$7 = snackbarUIState2;
                                        mTicketTripInfoUIStateFactory$convertToUIState$1.L$8 = mTicketTripInfoUIStateFactory;
                                        mTicketTripInfoUIStateFactory$convertToUIState$1.L$9 = str;
                                        mTicketTripInfoUIStateFactory$convertToUIState$1.L$10 = str3;
                                        mTicketTripInfoUIStateFactory$convertToUIState$1.L$11 = list;
                                        mTicketTripInfoUIStateFactory$convertToUIState$1.label = 7;
                                        objB6 = stringProvider4.b(StringEnum.STATUS_ERROR_ROUTE_NUMBER, new Object[0], mTicketTripInfoUIStateFactory$convertToUIState$1);
                                        if (objB6 != coroutineSingletons6) {
                                            coroutineSingletons6 = coroutineSingletons6;
                                            List list117 = list;
                                            obj6 = objB6;
                                            list2 = list117;
                                            String str111116 = str3;
                                            chaloTextUIState6 = chaloTextUIState5;
                                            str5 = str111116;
                                            str4 = (String) obj6;
                                            TextUIState.ChaloTextUIState chaloTextUIState1111113 = chaloTextUIState6;
                                            str3 = str5;
                                            chaloTextUIState5 = chaloTextUIState1111113;
                                        }
                                    } else {
                                        coroutineSingletons6 = coroutineSingletons6;
                                        list2 = list;
                                        str4 = null;
                                    }
                                    MTicketTripInfoUIStateFactory mTicketTripInfoUIStateFactory111110 = mTicketTripInfoUIStateFactory;
                                    wg0 wg0Var1111114 = new wg0(function7, 4);
                                    mTicketTripInfoUIStateFactory111110.getClass();
                                    routeSelectionInputUIStateC = c(str, str3, list2, str4, wg0Var1111114);
                                    mTicketTripInfoUIStateFactory$convertToUIState$1.L$0 = mTicketTripInfoDataState8;
                                    mTicketTripInfoUIStateFactory$convertToUIState$1.L$1 = function7;
                                    mTicketTripInfoUIStateFactory$convertToUIState$1.L$2 = toolbarUIState6;
                                    mTicketTripInfoUIStateFactory$convertToUIState$1.L$3 = buttonUIState4;
                                    mTicketTripInfoUIStateFactory$convertToUIState$1.L$4 = chaloTextUIState5;
                                    mTicketTripInfoUIStateFactory$convertToUIState$1.L$5 = loadingDialogUIState2;
                                    mTicketTripInfoUIStateFactory$convertToUIState$1.L$6 = productBookingBranding2;
                                    mTicketTripInfoUIStateFactory$convertToUIState$1.L$7 = snackbarUIState2;
                                    mTicketTripInfoUIStateFactory$convertToUIState$1.L$8 = routeSelectionInputUIStateC;
                                    mTicketTripInfoUIStateFactory$convertToUIState$1.L$9 = this;
                                    mTicketTripInfoUIStateFactory$convertToUIState$1.L$10 = null;
                                    mTicketTripInfoUIStateFactory$convertToUIState$1.L$11 = null;
                                    mTicketTripInfoUIStateFactory$convertToUIState$1.label = 8;
                                    objB7 = stringProvider4.b(StringEnum.HINT_START_STOP, new Object[0], mTicketTripInfoUIStateFactory$convertToUIState$1);
                                    coroutineSingletons = coroutineSingletons6;
                                    if (objB7 == coroutineSingletons) {
                                        return coroutineSingletons;
                                    }
                                    SnackbarUIState snackbarUIState1111119 = snackbarUIState2;
                                    routeSelectionInputUIState = routeSelectionInputUIStateC;
                                    loadingDialogUIState3 = loadingDialogUIState2;
                                    productBookingBranding3 = productBookingBranding2;
                                    snackbarUIState3 = snackbarUIState1111119;
                                    ToolbarUIState toolbarUIState1113 = toolbarUIState6;
                                    buttonUIState5 = buttonUIState4;
                                    function8 = function7;
                                    toolbarUIState7 = toolbarUIState1113;
                                    mTicketTripInfoUIStateFactory2 = this;
                                    str6 = (String) objB7;
                                    productBookingStopDetails = mTicketTripInfoDataState8.c;
                                    if (productBookingStopDetails != null) {
                                        str7 = str2;
                                    } else {
                                        str7 = str2;
                                    }
                                    list3 = EmptyList.f17557a;
                                    coroutineSingletons2 = coroutineSingletons;
                                    if (mTicketTripInfoDataState8.i == MTicketTripInfoMissingFieldError.FROM_STOP) {
                                        mTicketTripInfoUIStateFactory$convertToUIState$1.L$0 = mTicketTripInfoDataState8;
                                        mTicketTripInfoUIStateFactory$convertToUIState$1.L$1 = function8;
                                        mTicketTripInfoUIStateFactory$convertToUIState$1.L$2 = toolbarUIState7;
                                        mTicketTripInfoUIStateFactory$convertToUIState$1.L$3 = buttonUIState5;
                                        mTicketTripInfoUIStateFactory$convertToUIState$1.L$4 = chaloTextUIState5;
                                        mTicketTripInfoUIStateFactory$convertToUIState$1.L$5 = loadingDialogUIState3;
                                        mTicketTripInfoUIStateFactory$convertToUIState$1.L$6 = productBookingBranding3;
                                        mTicketTripInfoUIStateFactory$convertToUIState$1.L$7 = snackbarUIState3;
                                        mTicketTripInfoUIStateFactory$convertToUIState$1.L$8 = routeSelectionInputUIState;
                                        mTicketTripInfoUIStateFactory$convertToUIState$1.L$9 = mTicketTripInfoUIStateFactory2;
                                        mTicketTripInfoUIStateFactory$convertToUIState$1.L$10 = str6;
                                        mTicketTripInfoUIStateFactory$convertToUIState$1.L$11 = str7;
                                        mTicketTripInfoUIStateFactory$convertToUIState$1.L$12 = list3;
                                        mTicketTripInfoUIStateFactory$convertToUIState$1.label = 9;
                                        loadingDialogUIState4 = loadingDialogUIState3;
                                        stringProvider = stringProvider4;
                                        objB8 = stringProvider.b(StringEnum.STATUS_ERROR_ENTER_STOP, new Object[0], mTicketTripInfoUIStateFactory$convertToUIState$1);
                                        coroutineSingletons3 = coroutineSingletons2;
                                        if (objB8 == coroutineSingletons3) {
                                            return coroutineSingletons3;
                                        }
                                        TextUIState.ChaloTextUIState chaloTextUIState1111114 = chaloTextUIState5;
                                        str9 = str7;
                                        obj7 = objB8;
                                        chaloTextUIState7 = chaloTextUIState1111114;
                                        SnackbarUIState snackbarUIState11111110 = snackbarUIState3;
                                        routeSelectionInputUIState2 = routeSelectionInputUIState;
                                        toolbarUIState8 = toolbarUIState7;
                                        buttonUIState6 = buttonUIState5;
                                        function9 = function8;
                                        productBookingBranding4 = productBookingBranding3;
                                        snackbarUIState4 = snackbarUIState11111110;
                                        coroutineSingletons2 = coroutineSingletons3;
                                        mTicketTripInfoUIStateFactory3 = mTicketTripInfoUIStateFactory2;
                                        str8 = (String) obj7;
                                    } else {
                                        loadingDialogUIState4 = loadingDialogUIState3;
                                        stringProvider = stringProvider4;
                                        SnackbarUIState snackbarUIState11111111 = snackbarUIState3;
                                        routeSelectionInputUIState2 = routeSelectionInputUIState;
                                        toolbarUIState8 = toolbarUIState7;
                                        buttonUIState6 = buttonUIState5;
                                        function9 = function8;
                                        productBookingBranding4 = productBookingBranding3;
                                        snackbarUIState4 = snackbarUIState11111111;
                                        chaloTextUIState7 = chaloTextUIState5;
                                        mTicketTripInfoUIStateFactory3 = mTicketTripInfoUIStateFactory2;
                                        str8 = null;
                                        str9 = str7;
                                    }
                                    loadingDialogUIState5 = loadingDialogUIState4;
                                    StringProvider stringProvider116 = stringProvider;
                                    wg0 wg0Var1111115 = new wg0(function9, 5);
                                    mTicketTripInfoUIStateFactory3.getClass();
                                    routeSelectionInputUIStateC2 = c(str6, str9, list3, str8, wg0Var1111115);
                                    mTicketTripInfoUIStateFactory$convertToUIState$1.L$0 = mTicketTripInfoDataState8;
                                    mTicketTripInfoUIStateFactory$convertToUIState$1.L$1 = function9;
                                    mTicketTripInfoUIStateFactory$convertToUIState$1.L$2 = toolbarUIState8;
                                    mTicketTripInfoUIStateFactory$convertToUIState$1.L$3 = buttonUIState6;
                                    mTicketTripInfoUIStateFactory$convertToUIState$1.L$4 = chaloTextUIState7;
                                    mTicketTripInfoUIStateFactory$convertToUIState$1.L$5 = loadingDialogUIState5;
                                    mTicketTripInfoUIStateFactory$convertToUIState$1.L$6 = productBookingBranding4;
                                    mTicketTripInfoUIStateFactory$convertToUIState$1.L$7 = snackbarUIState4;
                                    mTicketTripInfoUIStateFactory$convertToUIState$1.L$8 = routeSelectionInputUIState2;
                                    mTicketTripInfoUIStateFactory$convertToUIState$1.L$9 = routeSelectionInputUIStateC2;
                                    mTicketTripInfoUIStateFactory$convertToUIState$1.L$10 = this;
                                    mTicketTripInfoUIStateFactory$convertToUIState$1.L$11 = null;
                                    mTicketTripInfoUIStateFactory$convertToUIState$1.L$12 = null;
                                    mTicketTripInfoUIStateFactory$convertToUIState$1.label = 10;
                                    stringProvider2 = stringProvider116;
                                    objB9 = stringProvider2.b(StringEnum.HINT_END_STOP, new Object[0], mTicketTripInfoUIStateFactory$convertToUIState$1);
                                    coroutineSingletons4 = coroutineSingletons2;
                                    if (objB9 == coroutineSingletons4) {
                                        return coroutineSingletons4;
                                    }
                                    loadingDialogUIState6 = loadingDialogUIState5;
                                    obj8 = objB9;
                                    toolbarUIState9 = toolbarUIState8;
                                    routeSelectionInputUIState3 = routeSelectionInputUIStateC2;
                                    mTicketTripInfoUIStateFactory4 = this;
                                    str10 = (String) obj8;
                                    productBookingStopDetails2 = mTicketTripInfoDataState8.d;
                                    if (productBookingStopDetails2 != null) {
                                        str11 = str2;
                                    } else {
                                        str11 = str2;
                                    }
                                    coroutineSingletons5 = coroutineSingletons4;
                                    list4 = EmptyList.f17557a;
                                    stringProvider3 = stringProvider2;
                                    if (mTicketTripInfoDataState8.i == MTicketTripInfoMissingFieldError.TO_STOP) {
                                        mTicketTripInfoUIStateFactory$convertToUIState$1.L$0 = function9;
                                        mTicketTripInfoUIStateFactory$convertToUIState$1.L$1 = toolbarUIState9;
                                        mTicketTripInfoUIStateFactory$convertToUIState$1.L$2 = buttonUIState6;
                                        mTicketTripInfoUIStateFactory$convertToUIState$1.L$3 = chaloTextUIState7;
                                        mTicketTripInfoUIStateFactory$convertToUIState$1.L$4 = loadingDialogUIState6;
                                        mTicketTripInfoUIStateFactory$convertToUIState$1.L$5 = productBookingBranding4;
                                        mTicketTripInfoUIStateFactory$convertToUIState$1.L$6 = snackbarUIState4;
                                        mTicketTripInfoUIStateFactory$convertToUIState$1.L$7 = routeSelectionInputUIState2;
                                        mTicketTripInfoUIStateFactory$convertToUIState$1.L$8 = routeSelectionInputUIState3;
                                        mTicketTripInfoUIStateFactory$convertToUIState$1.L$9 = mTicketTripInfoUIStateFactory4;
                                        mTicketTripInfoUIStateFactory$convertToUIState$1.L$10 = str10;
                                        mTicketTripInfoUIStateFactory$convertToUIState$1.L$11 = str11;
                                        mTicketTripInfoUIStateFactory$convertToUIState$1.L$12 = list4;
                                        mTicketTripInfoUIStateFactory6 = mTicketTripInfoUIStateFactory4;
                                        mTicketTripInfoUIStateFactory$convertToUIState$1.label = 11;
                                        objB10 = stringProvider3.b(StringEnum.STATUS_ERROR_ENTER_STOP, new Object[0], mTicketTripInfoUIStateFactory$convertToUIState$1);
                                        if (objB10 == coroutineSingletons5) {
                                            return coroutineSingletons5;
                                        }
                                        chaloTextUIState9 = chaloTextUIState7;
                                        routeSelectionInputUIState6 = routeSelectionInputUIState2;
                                        productBookingBranding6 = productBookingBranding4;
                                        function10 = function9;
                                        buttonUIState7 = buttonUIState6;
                                        str13 = str10;
                                        toolbarUIState11 = toolbarUIState9;
                                        routeSelectionInputUIState7 = routeSelectionInputUIState3;
                                        snackbarUIState5 = snackbarUIState4;
                                        obj9 = objB10;
                                        loadingDialogUIState8 = loadingDialogUIState6;
                                        list5 = list4;
                                        mTicketTripInfoUIStateFactory7 = mTicketTripInfoUIStateFactory6;
                                        String str111117 = (String) obj9;
                                        Function1 function1113 = function10;
                                        str12 = str111117;
                                        mTicketTripInfoUIStateFactory5 = mTicketTripInfoUIStateFactory7;
                                        list4 = list5;
                                        toolbarUIState10 = toolbarUIState11;
                                        function9 = function1113;
                                        LoadingDialogUIState loadingDialogUIState1110 = loadingDialogUIState8;
                                        snackbarUIState4 = snackbarUIState5;
                                        productBookingBranding5 = productBookingBranding6;
                                        loadingDialogUIState7 = loadingDialogUIState1110;
                                        str10 = str13;
                                        routeSelectionInputUIState5 = routeSelectionInputUIState7;
                                        routeSelectionInputUIState4 = routeSelectionInputUIState6;
                                        chaloTextUIState8 = chaloTextUIState9;
                                        buttonUIState6 = buttonUIState7;
                                    } else {
                                        MTicketTripInfoUIStateFactory mTicketTripInfoUIStateFactory111111 = mTicketTripInfoUIStateFactory4;
                                        RouteSelectionInputUIState routeSelectionInputUIState119 = routeSelectionInputUIState2;
                                        loadingDialogUIState7 = loadingDialogUIState6;
                                        toolbarUIState10 = toolbarUIState9;
                                        routeSelectionInputUIState4 = routeSelectionInputUIState119;
                                        chaloTextUIState8 = chaloTextUIState7;
                                        routeSelectionInputUIState5 = routeSelectionInputUIState3;
                                        productBookingBranding5 = productBookingBranding4;
                                        mTicketTripInfoUIStateFactory5 = mTicketTripInfoUIStateFactory111111;
                                        str12 = null;
                                    }
                                    wg0 wg0Var1111116 = new wg0(function9, 6);
                                    mTicketTripInfoUIStateFactory5.getClass();
                                    return new MTicketTripInfoUIState(toolbarUIState10, routeSelectionInputUIState4, routeSelectionInputUIState5, c(str10, str11, list4, str12, wg0Var1111116), buttonUIState6, chaloTextUIState8, productBookingBranding5, loadingDialogUIState7, snackbarUIState4);
                                }
                            }
                        }
                    } else {
                        mTicketTripInfoDataState7 = mTicketTripInfoDataState5;
                        function5 = function4;
                        toolbarUIState4 = toolbarUIState3;
                        buttonUIState2 = buttonUIState;
                        chaloTextUIState2 = chaloTextUIState;
                        loadingDialogUIStateA = null;
                        productBookingBranding = mTicketTripInfoDataState7.g;
                        mTicketTripInfoSnackBarType = mTicketTripInfoDataState7.e;
                        if (mTicketTripInfoSnackBarType != null) {
                            mTicketTripInfoUIStateFactory$convertToUIState$1.L$0 = mTicketTripInfoDataState7;
                            mTicketTripInfoUIStateFactory$convertToUIState$1.L$1 = function5;
                            mTicketTripInfoUIStateFactory$convertToUIState$1.L$2 = toolbarUIState4;
                            mTicketTripInfoUIStateFactory$convertToUIState$1.L$3 = buttonUIState2;
                            mTicketTripInfoUIStateFactory$convertToUIState$1.L$4 = chaloTextUIState2;
                            mTicketTripInfoUIStateFactory$convertToUIState$1.L$5 = loadingDialogUIStateA;
                            mTicketTripInfoUIStateFactory$convertToUIState$1.L$6 = productBookingBranding;
                            mTicketTripInfoUIStateFactory$convertToUIState$1.label = 5;
                            objD = d(mTicketTripInfoSnackBarType, function5, mTicketTripInfoUIStateFactory$convertToUIState$1);
                            if (objD != coroutineSingletons6) {
                                TextUIState.ChaloTextUIState chaloTextUIState1111115 = chaloTextUIState2;
                                loadingDialogUIState = loadingDialogUIStateA;
                                obj4 = objD;
                                mTicketTripInfoDataState8 = mTicketTripInfoDataState7;
                                function6 = function5;
                                toolbarUIState5 = toolbarUIState4;
                                buttonUIState3 = buttonUIState2;
                                chaloTextUIState4 = chaloTextUIState1111115;
                                snackbarUIState = (SnackbarUIState) obj4;
                                mTicketTripInfoUIStateFactory$convertToUIState$1.L$0 = mTicketTripInfoDataState8;
                                mTicketTripInfoUIStateFactory$convertToUIState$1.L$1 = function6;
                                mTicketTripInfoUIStateFactory$convertToUIState$1.L$2 = toolbarUIState5;
                                mTicketTripInfoUIStateFactory$convertToUIState$1.L$3 = buttonUIState3;
                                mTicketTripInfoUIStateFactory$convertToUIState$1.L$4 = chaloTextUIState4;
                                mTicketTripInfoUIStateFactory$convertToUIState$1.L$5 = loadingDialogUIState;
                                mTicketTripInfoUIStateFactory$convertToUIState$1.L$6 = productBookingBranding;
                                mTicketTripInfoUIStateFactory$convertToUIState$1.L$7 = snackbarUIState;
                                mTicketTripInfoUIStateFactory$convertToUIState$1.L$8 = this;
                                mTicketTripInfoUIStateFactory$convertToUIState$1.label = 6;
                                objB5 = stringProvider4.b(StringEnum.HINT_ROUTE_NUMBER, new Object[0], mTicketTripInfoUIStateFactory$convertToUIState$1);
                                if (objB5 != coroutineSingletons6) {
                                    ButtonUIState buttonUIState1110 = buttonUIState3;
                                    snackbarUIState2 = snackbarUIState;
                                    obj5 = objB5;
                                    buttonUIState4 = buttonUIState1110;
                                    toolbarUIState6 = toolbarUIState5;
                                    function7 = function6;
                                    productBookingBranding2 = productBookingBranding;
                                    loadingDialogUIState2 = loadingDialogUIState;
                                    chaloTextUIState5 = chaloTextUIState4;
                                    mTicketTripInfoUIStateFactory = this;
                                    str = (String) obj5;
                                    productBookingRouteDetails = mTicketTripInfoDataState8.b;
                                    str2 = "";
                                    if (productBookingRouteDetails != null) {
                                        str3 = str2;
                                    } else {
                                        str3 = str2;
                                    }
                                    if (productBookingRouteDetails != null) {
                                        list = EmptyList.f17557a;
                                    } else {
                                        list = EmptyList.f17557a;
                                    }
                                    if (mTicketTripInfoDataState8.i == MTicketTripInfoMissingFieldError.ROUTE) {
                                        mTicketTripInfoUIStateFactory$convertToUIState$1.L$0 = mTicketTripInfoDataState8;
                                        mTicketTripInfoUIStateFactory$convertToUIState$1.L$1 = function7;
                                        mTicketTripInfoUIStateFactory$convertToUIState$1.L$2 = toolbarUIState6;
                                        mTicketTripInfoUIStateFactory$convertToUIState$1.L$3 = buttonUIState4;
                                        mTicketTripInfoUIStateFactory$convertToUIState$1.L$4 = chaloTextUIState5;
                                        mTicketTripInfoUIStateFactory$convertToUIState$1.L$5 = loadingDialogUIState2;
                                        mTicketTripInfoUIStateFactory$convertToUIState$1.L$6 = productBookingBranding2;
                                        mTicketTripInfoUIStateFactory$convertToUIState$1.L$7 = snackbarUIState2;
                                        mTicketTripInfoUIStateFactory$convertToUIState$1.L$8 = mTicketTripInfoUIStateFactory;
                                        mTicketTripInfoUIStateFactory$convertToUIState$1.L$9 = str;
                                        mTicketTripInfoUIStateFactory$convertToUIState$1.L$10 = str3;
                                        mTicketTripInfoUIStateFactory$convertToUIState$1.L$11 = list;
                                        mTicketTripInfoUIStateFactory$convertToUIState$1.label = 7;
                                        objB6 = stringProvider4.b(StringEnum.STATUS_ERROR_ROUTE_NUMBER, new Object[0], mTicketTripInfoUIStateFactory$convertToUIState$1);
                                        if (objB6 != coroutineSingletons6) {
                                            coroutineSingletons6 = coroutineSingletons6;
                                            List list118 = list;
                                            obj6 = objB6;
                                            list2 = list118;
                                            String str111118 = str3;
                                            chaloTextUIState6 = chaloTextUIState5;
                                            str5 = str111118;
                                            str4 = (String) obj6;
                                            TextUIState.ChaloTextUIState chaloTextUIState1111116 = chaloTextUIState6;
                                            str3 = str5;
                                            chaloTextUIState5 = chaloTextUIState1111116;
                                        }
                                    } else {
                                        coroutineSingletons6 = coroutineSingletons6;
                                        list2 = list;
                                        str4 = null;
                                    }
                                    MTicketTripInfoUIStateFactory mTicketTripInfoUIStateFactory111112 = mTicketTripInfoUIStateFactory;
                                    wg0 wg0Var1111117 = new wg0(function7, 4);
                                    mTicketTripInfoUIStateFactory111112.getClass();
                                    routeSelectionInputUIStateC = c(str, str3, list2, str4, wg0Var1111117);
                                    mTicketTripInfoUIStateFactory$convertToUIState$1.L$0 = mTicketTripInfoDataState8;
                                    mTicketTripInfoUIStateFactory$convertToUIState$1.L$1 = function7;
                                    mTicketTripInfoUIStateFactory$convertToUIState$1.L$2 = toolbarUIState6;
                                    mTicketTripInfoUIStateFactory$convertToUIState$1.L$3 = buttonUIState4;
                                    mTicketTripInfoUIStateFactory$convertToUIState$1.L$4 = chaloTextUIState5;
                                    mTicketTripInfoUIStateFactory$convertToUIState$1.L$5 = loadingDialogUIState2;
                                    mTicketTripInfoUIStateFactory$convertToUIState$1.L$6 = productBookingBranding2;
                                    mTicketTripInfoUIStateFactory$convertToUIState$1.L$7 = snackbarUIState2;
                                    mTicketTripInfoUIStateFactory$convertToUIState$1.L$8 = routeSelectionInputUIStateC;
                                    mTicketTripInfoUIStateFactory$convertToUIState$1.L$9 = this;
                                    mTicketTripInfoUIStateFactory$convertToUIState$1.L$10 = null;
                                    mTicketTripInfoUIStateFactory$convertToUIState$1.L$11 = null;
                                    mTicketTripInfoUIStateFactory$convertToUIState$1.label = 8;
                                    objB7 = stringProvider4.b(StringEnum.HINT_START_STOP, new Object[0], mTicketTripInfoUIStateFactory$convertToUIState$1);
                                    coroutineSingletons = coroutineSingletons6;
                                    if (objB7 == coroutineSingletons) {
                                        return coroutineSingletons;
                                    }
                                    SnackbarUIState snackbarUIState11111112 = snackbarUIState2;
                                    routeSelectionInputUIState = routeSelectionInputUIStateC;
                                    loadingDialogUIState3 = loadingDialogUIState2;
                                    productBookingBranding3 = productBookingBranding2;
                                    snackbarUIState3 = snackbarUIState11111112;
                                    ToolbarUIState toolbarUIState1114 = toolbarUIState6;
                                    buttonUIState5 = buttonUIState4;
                                    function8 = function7;
                                    toolbarUIState7 = toolbarUIState1114;
                                    mTicketTripInfoUIStateFactory2 = this;
                                    str6 = (String) objB7;
                                    productBookingStopDetails = mTicketTripInfoDataState8.c;
                                    if (productBookingStopDetails != null) {
                                        str7 = str2;
                                    } else {
                                        str7 = str2;
                                    }
                                    list3 = EmptyList.f17557a;
                                    coroutineSingletons2 = coroutineSingletons;
                                    if (mTicketTripInfoDataState8.i == MTicketTripInfoMissingFieldError.FROM_STOP) {
                                        mTicketTripInfoUIStateFactory$convertToUIState$1.L$0 = mTicketTripInfoDataState8;
                                        mTicketTripInfoUIStateFactory$convertToUIState$1.L$1 = function8;
                                        mTicketTripInfoUIStateFactory$convertToUIState$1.L$2 = toolbarUIState7;
                                        mTicketTripInfoUIStateFactory$convertToUIState$1.L$3 = buttonUIState5;
                                        mTicketTripInfoUIStateFactory$convertToUIState$1.L$4 = chaloTextUIState5;
                                        mTicketTripInfoUIStateFactory$convertToUIState$1.L$5 = loadingDialogUIState3;
                                        mTicketTripInfoUIStateFactory$convertToUIState$1.L$6 = productBookingBranding3;
                                        mTicketTripInfoUIStateFactory$convertToUIState$1.L$7 = snackbarUIState3;
                                        mTicketTripInfoUIStateFactory$convertToUIState$1.L$8 = routeSelectionInputUIState;
                                        mTicketTripInfoUIStateFactory$convertToUIState$1.L$9 = mTicketTripInfoUIStateFactory2;
                                        mTicketTripInfoUIStateFactory$convertToUIState$1.L$10 = str6;
                                        mTicketTripInfoUIStateFactory$convertToUIState$1.L$11 = str7;
                                        mTicketTripInfoUIStateFactory$convertToUIState$1.L$12 = list3;
                                        mTicketTripInfoUIStateFactory$convertToUIState$1.label = 9;
                                        loadingDialogUIState4 = loadingDialogUIState3;
                                        stringProvider = stringProvider4;
                                        objB8 = stringProvider.b(StringEnum.STATUS_ERROR_ENTER_STOP, new Object[0], mTicketTripInfoUIStateFactory$convertToUIState$1);
                                        coroutineSingletons3 = coroutineSingletons2;
                                        if (objB8 == coroutineSingletons3) {
                                            return coroutineSingletons3;
                                        }
                                        TextUIState.ChaloTextUIState chaloTextUIState1111117 = chaloTextUIState5;
                                        str9 = str7;
                                        obj7 = objB8;
                                        chaloTextUIState7 = chaloTextUIState1111117;
                                        SnackbarUIState snackbarUIState11111113 = snackbarUIState3;
                                        routeSelectionInputUIState2 = routeSelectionInputUIState;
                                        toolbarUIState8 = toolbarUIState7;
                                        buttonUIState6 = buttonUIState5;
                                        function9 = function8;
                                        productBookingBranding4 = productBookingBranding3;
                                        snackbarUIState4 = snackbarUIState11111113;
                                        coroutineSingletons2 = coroutineSingletons3;
                                        mTicketTripInfoUIStateFactory3 = mTicketTripInfoUIStateFactory2;
                                        str8 = (String) obj7;
                                    } else {
                                        loadingDialogUIState4 = loadingDialogUIState3;
                                        stringProvider = stringProvider4;
                                        SnackbarUIState snackbarUIState11111114 = snackbarUIState3;
                                        routeSelectionInputUIState2 = routeSelectionInputUIState;
                                        toolbarUIState8 = toolbarUIState7;
                                        buttonUIState6 = buttonUIState5;
                                        function9 = function8;
                                        productBookingBranding4 = productBookingBranding3;
                                        snackbarUIState4 = snackbarUIState11111114;
                                        chaloTextUIState7 = chaloTextUIState5;
                                        mTicketTripInfoUIStateFactory3 = mTicketTripInfoUIStateFactory2;
                                        str8 = null;
                                        str9 = str7;
                                    }
                                    loadingDialogUIState5 = loadingDialogUIState4;
                                    StringProvider stringProvider117 = stringProvider;
                                    wg0 wg0Var1111118 = new wg0(function9, 5);
                                    mTicketTripInfoUIStateFactory3.getClass();
                                    routeSelectionInputUIStateC2 = c(str6, str9, list3, str8, wg0Var1111118);
                                    mTicketTripInfoUIStateFactory$convertToUIState$1.L$0 = mTicketTripInfoDataState8;
                                    mTicketTripInfoUIStateFactory$convertToUIState$1.L$1 = function9;
                                    mTicketTripInfoUIStateFactory$convertToUIState$1.L$2 = toolbarUIState8;
                                    mTicketTripInfoUIStateFactory$convertToUIState$1.L$3 = buttonUIState6;
                                    mTicketTripInfoUIStateFactory$convertToUIState$1.L$4 = chaloTextUIState7;
                                    mTicketTripInfoUIStateFactory$convertToUIState$1.L$5 = loadingDialogUIState5;
                                    mTicketTripInfoUIStateFactory$convertToUIState$1.L$6 = productBookingBranding4;
                                    mTicketTripInfoUIStateFactory$convertToUIState$1.L$7 = snackbarUIState4;
                                    mTicketTripInfoUIStateFactory$convertToUIState$1.L$8 = routeSelectionInputUIState2;
                                    mTicketTripInfoUIStateFactory$convertToUIState$1.L$9 = routeSelectionInputUIStateC2;
                                    mTicketTripInfoUIStateFactory$convertToUIState$1.L$10 = this;
                                    mTicketTripInfoUIStateFactory$convertToUIState$1.L$11 = null;
                                    mTicketTripInfoUIStateFactory$convertToUIState$1.L$12 = null;
                                    mTicketTripInfoUIStateFactory$convertToUIState$1.label = 10;
                                    stringProvider2 = stringProvider117;
                                    objB9 = stringProvider2.b(StringEnum.HINT_END_STOP, new Object[0], mTicketTripInfoUIStateFactory$convertToUIState$1);
                                    coroutineSingletons4 = coroutineSingletons2;
                                    if (objB9 == coroutineSingletons4) {
                                        return coroutineSingletons4;
                                    }
                                    loadingDialogUIState6 = loadingDialogUIState5;
                                    obj8 = objB9;
                                    toolbarUIState9 = toolbarUIState8;
                                    routeSelectionInputUIState3 = routeSelectionInputUIStateC2;
                                    mTicketTripInfoUIStateFactory4 = this;
                                    str10 = (String) obj8;
                                    productBookingStopDetails2 = mTicketTripInfoDataState8.d;
                                    if (productBookingStopDetails2 != null) {
                                        str11 = str2;
                                    } else {
                                        str11 = str2;
                                    }
                                    coroutineSingletons5 = coroutineSingletons4;
                                    list4 = EmptyList.f17557a;
                                    stringProvider3 = stringProvider2;
                                    if (mTicketTripInfoDataState8.i == MTicketTripInfoMissingFieldError.TO_STOP) {
                                        mTicketTripInfoUIStateFactory$convertToUIState$1.L$0 = function9;
                                        mTicketTripInfoUIStateFactory$convertToUIState$1.L$1 = toolbarUIState9;
                                        mTicketTripInfoUIStateFactory$convertToUIState$1.L$2 = buttonUIState6;
                                        mTicketTripInfoUIStateFactory$convertToUIState$1.L$3 = chaloTextUIState7;
                                        mTicketTripInfoUIStateFactory$convertToUIState$1.L$4 = loadingDialogUIState6;
                                        mTicketTripInfoUIStateFactory$convertToUIState$1.L$5 = productBookingBranding4;
                                        mTicketTripInfoUIStateFactory$convertToUIState$1.L$6 = snackbarUIState4;
                                        mTicketTripInfoUIStateFactory$convertToUIState$1.L$7 = routeSelectionInputUIState2;
                                        mTicketTripInfoUIStateFactory$convertToUIState$1.L$8 = routeSelectionInputUIState3;
                                        mTicketTripInfoUIStateFactory$convertToUIState$1.L$9 = mTicketTripInfoUIStateFactory4;
                                        mTicketTripInfoUIStateFactory$convertToUIState$1.L$10 = str10;
                                        mTicketTripInfoUIStateFactory$convertToUIState$1.L$11 = str11;
                                        mTicketTripInfoUIStateFactory$convertToUIState$1.L$12 = list4;
                                        mTicketTripInfoUIStateFactory6 = mTicketTripInfoUIStateFactory4;
                                        mTicketTripInfoUIStateFactory$convertToUIState$1.label = 11;
                                        objB10 = stringProvider3.b(StringEnum.STATUS_ERROR_ENTER_STOP, new Object[0], mTicketTripInfoUIStateFactory$convertToUIState$1);
                                        if (objB10 == coroutineSingletons5) {
                                            return coroutineSingletons5;
                                        }
                                        chaloTextUIState9 = chaloTextUIState7;
                                        routeSelectionInputUIState6 = routeSelectionInputUIState2;
                                        productBookingBranding6 = productBookingBranding4;
                                        function10 = function9;
                                        buttonUIState7 = buttonUIState6;
                                        str13 = str10;
                                        toolbarUIState11 = toolbarUIState9;
                                        routeSelectionInputUIState7 = routeSelectionInputUIState3;
                                        snackbarUIState5 = snackbarUIState4;
                                        obj9 = objB10;
                                        loadingDialogUIState8 = loadingDialogUIState6;
                                        list5 = list4;
                                        mTicketTripInfoUIStateFactory7 = mTicketTripInfoUIStateFactory6;
                                        String str111119 = (String) obj9;
                                        Function1 function1114 = function10;
                                        str12 = str111119;
                                        mTicketTripInfoUIStateFactory5 = mTicketTripInfoUIStateFactory7;
                                        list4 = list5;
                                        toolbarUIState10 = toolbarUIState11;
                                        function9 = function1114;
                                        LoadingDialogUIState loadingDialogUIState1111 = loadingDialogUIState8;
                                        snackbarUIState4 = snackbarUIState5;
                                        productBookingBranding5 = productBookingBranding6;
                                        loadingDialogUIState7 = loadingDialogUIState1111;
                                        str10 = str13;
                                        routeSelectionInputUIState5 = routeSelectionInputUIState7;
                                        routeSelectionInputUIState4 = routeSelectionInputUIState6;
                                        chaloTextUIState8 = chaloTextUIState9;
                                        buttonUIState6 = buttonUIState7;
                                    } else {
                                        MTicketTripInfoUIStateFactory mTicketTripInfoUIStateFactory111113 = mTicketTripInfoUIStateFactory4;
                                        RouteSelectionInputUIState routeSelectionInputUIState1110 = routeSelectionInputUIState2;
                                        loadingDialogUIState7 = loadingDialogUIState6;
                                        toolbarUIState10 = toolbarUIState9;
                                        routeSelectionInputUIState4 = routeSelectionInputUIState1110;
                                        chaloTextUIState8 = chaloTextUIState7;
                                        routeSelectionInputUIState5 = routeSelectionInputUIState3;
                                        productBookingBranding5 = productBookingBranding4;
                                        mTicketTripInfoUIStateFactory5 = mTicketTripInfoUIStateFactory111113;
                                        str12 = null;
                                    }
                                    wg0 wg0Var1111119 = new wg0(function9, 6);
                                    mTicketTripInfoUIStateFactory5.getClass();
                                    return new MTicketTripInfoUIState(toolbarUIState10, routeSelectionInputUIState4, routeSelectionInputUIState5, c(str10, str11, list4, str12, wg0Var1111119), buttonUIState6, chaloTextUIState8, productBookingBranding5, loadingDialogUIState7, snackbarUIState4);
                                }
                            }
                        } else {
                            mTicketTripInfoDataState8 = mTicketTripInfoDataState7;
                            function6 = function5;
                            toolbarUIState5 = toolbarUIState4;
                            buttonUIState3 = buttonUIState2;
                            chaloTextUIState4 = chaloTextUIState2;
                            loadingDialogUIState = loadingDialogUIStateA;
                            snackbarUIState = null;
                            mTicketTripInfoUIStateFactory$convertToUIState$1.L$0 = mTicketTripInfoDataState8;
                            mTicketTripInfoUIStateFactory$convertToUIState$1.L$1 = function6;
                            mTicketTripInfoUIStateFactory$convertToUIState$1.L$2 = toolbarUIState5;
                            mTicketTripInfoUIStateFactory$convertToUIState$1.L$3 = buttonUIState3;
                            mTicketTripInfoUIStateFactory$convertToUIState$1.L$4 = chaloTextUIState4;
                            mTicketTripInfoUIStateFactory$convertToUIState$1.L$5 = loadingDialogUIState;
                            mTicketTripInfoUIStateFactory$convertToUIState$1.L$6 = productBookingBranding;
                            mTicketTripInfoUIStateFactory$convertToUIState$1.L$7 = snackbarUIState;
                            mTicketTripInfoUIStateFactory$convertToUIState$1.L$8 = this;
                            mTicketTripInfoUIStateFactory$convertToUIState$1.label = 6;
                            objB5 = stringProvider4.b(StringEnum.HINT_ROUTE_NUMBER, new Object[0], mTicketTripInfoUIStateFactory$convertToUIState$1);
                            if (objB5 != coroutineSingletons6) {
                                ButtonUIState buttonUIState1111 = buttonUIState3;
                                snackbarUIState2 = snackbarUIState;
                                obj5 = objB5;
                                buttonUIState4 = buttonUIState1111;
                                toolbarUIState6 = toolbarUIState5;
                                function7 = function6;
                                productBookingBranding2 = productBookingBranding;
                                loadingDialogUIState2 = loadingDialogUIState;
                                chaloTextUIState5 = chaloTextUIState4;
                                mTicketTripInfoUIStateFactory = this;
                                str = (String) obj5;
                                productBookingRouteDetails = mTicketTripInfoDataState8.b;
                                str2 = "";
                                if (productBookingRouteDetails != null) {
                                    str3 = str2;
                                } else {
                                    str3 = str2;
                                }
                                if (productBookingRouteDetails != null) {
                                    list = EmptyList.f17557a;
                                } else {
                                    list = EmptyList.f17557a;
                                }
                                if (mTicketTripInfoDataState8.i == MTicketTripInfoMissingFieldError.ROUTE) {
                                    mTicketTripInfoUIStateFactory$convertToUIState$1.L$0 = mTicketTripInfoDataState8;
                                    mTicketTripInfoUIStateFactory$convertToUIState$1.L$1 = function7;
                                    mTicketTripInfoUIStateFactory$convertToUIState$1.L$2 = toolbarUIState6;
                                    mTicketTripInfoUIStateFactory$convertToUIState$1.L$3 = buttonUIState4;
                                    mTicketTripInfoUIStateFactory$convertToUIState$1.L$4 = chaloTextUIState5;
                                    mTicketTripInfoUIStateFactory$convertToUIState$1.L$5 = loadingDialogUIState2;
                                    mTicketTripInfoUIStateFactory$convertToUIState$1.L$6 = productBookingBranding2;
                                    mTicketTripInfoUIStateFactory$convertToUIState$1.L$7 = snackbarUIState2;
                                    mTicketTripInfoUIStateFactory$convertToUIState$1.L$8 = mTicketTripInfoUIStateFactory;
                                    mTicketTripInfoUIStateFactory$convertToUIState$1.L$9 = str;
                                    mTicketTripInfoUIStateFactory$convertToUIState$1.L$10 = str3;
                                    mTicketTripInfoUIStateFactory$convertToUIState$1.L$11 = list;
                                    mTicketTripInfoUIStateFactory$convertToUIState$1.label = 7;
                                    objB6 = stringProvider4.b(StringEnum.STATUS_ERROR_ROUTE_NUMBER, new Object[0], mTicketTripInfoUIStateFactory$convertToUIState$1);
                                    if (objB6 != coroutineSingletons6) {
                                        coroutineSingletons6 = coroutineSingletons6;
                                        List list119 = list;
                                        obj6 = objB6;
                                        list2 = list119;
                                        String str1111110 = str3;
                                        chaloTextUIState6 = chaloTextUIState5;
                                        str5 = str1111110;
                                        str4 = (String) obj6;
                                        TextUIState.ChaloTextUIState chaloTextUIState1111118 = chaloTextUIState6;
                                        str3 = str5;
                                        chaloTextUIState5 = chaloTextUIState1111118;
                                    }
                                } else {
                                    coroutineSingletons6 = coroutineSingletons6;
                                    list2 = list;
                                    str4 = null;
                                }
                                MTicketTripInfoUIStateFactory mTicketTripInfoUIStateFactory111114 = mTicketTripInfoUIStateFactory;
                                wg0 wg0Var11111110 = new wg0(function7, 4);
                                mTicketTripInfoUIStateFactory111114.getClass();
                                routeSelectionInputUIStateC = c(str, str3, list2, str4, wg0Var11111110);
                                mTicketTripInfoUIStateFactory$convertToUIState$1.L$0 = mTicketTripInfoDataState8;
                                mTicketTripInfoUIStateFactory$convertToUIState$1.L$1 = function7;
                                mTicketTripInfoUIStateFactory$convertToUIState$1.L$2 = toolbarUIState6;
                                mTicketTripInfoUIStateFactory$convertToUIState$1.L$3 = buttonUIState4;
                                mTicketTripInfoUIStateFactory$convertToUIState$1.L$4 = chaloTextUIState5;
                                mTicketTripInfoUIStateFactory$convertToUIState$1.L$5 = loadingDialogUIState2;
                                mTicketTripInfoUIStateFactory$convertToUIState$1.L$6 = productBookingBranding2;
                                mTicketTripInfoUIStateFactory$convertToUIState$1.L$7 = snackbarUIState2;
                                mTicketTripInfoUIStateFactory$convertToUIState$1.L$8 = routeSelectionInputUIStateC;
                                mTicketTripInfoUIStateFactory$convertToUIState$1.L$9 = this;
                                mTicketTripInfoUIStateFactory$convertToUIState$1.L$10 = null;
                                mTicketTripInfoUIStateFactory$convertToUIState$1.L$11 = null;
                                mTicketTripInfoUIStateFactory$convertToUIState$1.label = 8;
                                objB7 = stringProvider4.b(StringEnum.HINT_START_STOP, new Object[0], mTicketTripInfoUIStateFactory$convertToUIState$1);
                                coroutineSingletons = coroutineSingletons6;
                                if (objB7 == coroutineSingletons) {
                                    return coroutineSingletons;
                                }
                                SnackbarUIState snackbarUIState11111115 = snackbarUIState2;
                                routeSelectionInputUIState = routeSelectionInputUIStateC;
                                loadingDialogUIState3 = loadingDialogUIState2;
                                productBookingBranding3 = productBookingBranding2;
                                snackbarUIState3 = snackbarUIState11111115;
                                ToolbarUIState toolbarUIState1115 = toolbarUIState6;
                                buttonUIState5 = buttonUIState4;
                                function8 = function7;
                                toolbarUIState7 = toolbarUIState1115;
                                mTicketTripInfoUIStateFactory2 = this;
                                str6 = (String) objB7;
                                productBookingStopDetails = mTicketTripInfoDataState8.c;
                                if (productBookingStopDetails != null) {
                                    str7 = str2;
                                } else {
                                    str7 = str2;
                                }
                                list3 = EmptyList.f17557a;
                                coroutineSingletons2 = coroutineSingletons;
                                if (mTicketTripInfoDataState8.i == MTicketTripInfoMissingFieldError.FROM_STOP) {
                                    mTicketTripInfoUIStateFactory$convertToUIState$1.L$0 = mTicketTripInfoDataState8;
                                    mTicketTripInfoUIStateFactory$convertToUIState$1.L$1 = function8;
                                    mTicketTripInfoUIStateFactory$convertToUIState$1.L$2 = toolbarUIState7;
                                    mTicketTripInfoUIStateFactory$convertToUIState$1.L$3 = buttonUIState5;
                                    mTicketTripInfoUIStateFactory$convertToUIState$1.L$4 = chaloTextUIState5;
                                    mTicketTripInfoUIStateFactory$convertToUIState$1.L$5 = loadingDialogUIState3;
                                    mTicketTripInfoUIStateFactory$convertToUIState$1.L$6 = productBookingBranding3;
                                    mTicketTripInfoUIStateFactory$convertToUIState$1.L$7 = snackbarUIState3;
                                    mTicketTripInfoUIStateFactory$convertToUIState$1.L$8 = routeSelectionInputUIState;
                                    mTicketTripInfoUIStateFactory$convertToUIState$1.L$9 = mTicketTripInfoUIStateFactory2;
                                    mTicketTripInfoUIStateFactory$convertToUIState$1.L$10 = str6;
                                    mTicketTripInfoUIStateFactory$convertToUIState$1.L$11 = str7;
                                    mTicketTripInfoUIStateFactory$convertToUIState$1.L$12 = list3;
                                    mTicketTripInfoUIStateFactory$convertToUIState$1.label = 9;
                                    loadingDialogUIState4 = loadingDialogUIState3;
                                    stringProvider = stringProvider4;
                                    objB8 = stringProvider.b(StringEnum.STATUS_ERROR_ENTER_STOP, new Object[0], mTicketTripInfoUIStateFactory$convertToUIState$1);
                                    coroutineSingletons3 = coroutineSingletons2;
                                    if (objB8 == coroutineSingletons3) {
                                        return coroutineSingletons3;
                                    }
                                    TextUIState.ChaloTextUIState chaloTextUIState1111119 = chaloTextUIState5;
                                    str9 = str7;
                                    obj7 = objB8;
                                    chaloTextUIState7 = chaloTextUIState1111119;
                                    SnackbarUIState snackbarUIState11111116 = snackbarUIState3;
                                    routeSelectionInputUIState2 = routeSelectionInputUIState;
                                    toolbarUIState8 = toolbarUIState7;
                                    buttonUIState6 = buttonUIState5;
                                    function9 = function8;
                                    productBookingBranding4 = productBookingBranding3;
                                    snackbarUIState4 = snackbarUIState11111116;
                                    coroutineSingletons2 = coroutineSingletons3;
                                    mTicketTripInfoUIStateFactory3 = mTicketTripInfoUIStateFactory2;
                                    str8 = (String) obj7;
                                } else {
                                    loadingDialogUIState4 = loadingDialogUIState3;
                                    stringProvider = stringProvider4;
                                    SnackbarUIState snackbarUIState11111117 = snackbarUIState3;
                                    routeSelectionInputUIState2 = routeSelectionInputUIState;
                                    toolbarUIState8 = toolbarUIState7;
                                    buttonUIState6 = buttonUIState5;
                                    function9 = function8;
                                    productBookingBranding4 = productBookingBranding3;
                                    snackbarUIState4 = snackbarUIState11111117;
                                    chaloTextUIState7 = chaloTextUIState5;
                                    mTicketTripInfoUIStateFactory3 = mTicketTripInfoUIStateFactory2;
                                    str8 = null;
                                    str9 = str7;
                                }
                                loadingDialogUIState5 = loadingDialogUIState4;
                                StringProvider stringProvider118 = stringProvider;
                                wg0 wg0Var11111111 = new wg0(function9, 5);
                                mTicketTripInfoUIStateFactory3.getClass();
                                routeSelectionInputUIStateC2 = c(str6, str9, list3, str8, wg0Var11111111);
                                mTicketTripInfoUIStateFactory$convertToUIState$1.L$0 = mTicketTripInfoDataState8;
                                mTicketTripInfoUIStateFactory$convertToUIState$1.L$1 = function9;
                                mTicketTripInfoUIStateFactory$convertToUIState$1.L$2 = toolbarUIState8;
                                mTicketTripInfoUIStateFactory$convertToUIState$1.L$3 = buttonUIState6;
                                mTicketTripInfoUIStateFactory$convertToUIState$1.L$4 = chaloTextUIState7;
                                mTicketTripInfoUIStateFactory$convertToUIState$1.L$5 = loadingDialogUIState5;
                                mTicketTripInfoUIStateFactory$convertToUIState$1.L$6 = productBookingBranding4;
                                mTicketTripInfoUIStateFactory$convertToUIState$1.L$7 = snackbarUIState4;
                                mTicketTripInfoUIStateFactory$convertToUIState$1.L$8 = routeSelectionInputUIState2;
                                mTicketTripInfoUIStateFactory$convertToUIState$1.L$9 = routeSelectionInputUIStateC2;
                                mTicketTripInfoUIStateFactory$convertToUIState$1.L$10 = this;
                                mTicketTripInfoUIStateFactory$convertToUIState$1.L$11 = null;
                                mTicketTripInfoUIStateFactory$convertToUIState$1.L$12 = null;
                                mTicketTripInfoUIStateFactory$convertToUIState$1.label = 10;
                                stringProvider2 = stringProvider118;
                                objB9 = stringProvider2.b(StringEnum.HINT_END_STOP, new Object[0], mTicketTripInfoUIStateFactory$convertToUIState$1);
                                coroutineSingletons4 = coroutineSingletons2;
                                if (objB9 == coroutineSingletons4) {
                                    return coroutineSingletons4;
                                }
                                loadingDialogUIState6 = loadingDialogUIState5;
                                obj8 = objB9;
                                toolbarUIState9 = toolbarUIState8;
                                routeSelectionInputUIState3 = routeSelectionInputUIStateC2;
                                mTicketTripInfoUIStateFactory4 = this;
                                str10 = (String) obj8;
                                productBookingStopDetails2 = mTicketTripInfoDataState8.d;
                                if (productBookingStopDetails2 != null) {
                                    str11 = str2;
                                } else {
                                    str11 = str2;
                                }
                                coroutineSingletons5 = coroutineSingletons4;
                                list4 = EmptyList.f17557a;
                                stringProvider3 = stringProvider2;
                                if (mTicketTripInfoDataState8.i == MTicketTripInfoMissingFieldError.TO_STOP) {
                                    mTicketTripInfoUIStateFactory$convertToUIState$1.L$0 = function9;
                                    mTicketTripInfoUIStateFactory$convertToUIState$1.L$1 = toolbarUIState9;
                                    mTicketTripInfoUIStateFactory$convertToUIState$1.L$2 = buttonUIState6;
                                    mTicketTripInfoUIStateFactory$convertToUIState$1.L$3 = chaloTextUIState7;
                                    mTicketTripInfoUIStateFactory$convertToUIState$1.L$4 = loadingDialogUIState6;
                                    mTicketTripInfoUIStateFactory$convertToUIState$1.L$5 = productBookingBranding4;
                                    mTicketTripInfoUIStateFactory$convertToUIState$1.L$6 = snackbarUIState4;
                                    mTicketTripInfoUIStateFactory$convertToUIState$1.L$7 = routeSelectionInputUIState2;
                                    mTicketTripInfoUIStateFactory$convertToUIState$1.L$8 = routeSelectionInputUIState3;
                                    mTicketTripInfoUIStateFactory$convertToUIState$1.L$9 = mTicketTripInfoUIStateFactory4;
                                    mTicketTripInfoUIStateFactory$convertToUIState$1.L$10 = str10;
                                    mTicketTripInfoUIStateFactory$convertToUIState$1.L$11 = str11;
                                    mTicketTripInfoUIStateFactory$convertToUIState$1.L$12 = list4;
                                    mTicketTripInfoUIStateFactory6 = mTicketTripInfoUIStateFactory4;
                                    mTicketTripInfoUIStateFactory$convertToUIState$1.label = 11;
                                    objB10 = stringProvider3.b(StringEnum.STATUS_ERROR_ENTER_STOP, new Object[0], mTicketTripInfoUIStateFactory$convertToUIState$1);
                                    if (objB10 == coroutineSingletons5) {
                                        return coroutineSingletons5;
                                    }
                                    chaloTextUIState9 = chaloTextUIState7;
                                    routeSelectionInputUIState6 = routeSelectionInputUIState2;
                                    productBookingBranding6 = productBookingBranding4;
                                    function10 = function9;
                                    buttonUIState7 = buttonUIState6;
                                    str13 = str10;
                                    toolbarUIState11 = toolbarUIState9;
                                    routeSelectionInputUIState7 = routeSelectionInputUIState3;
                                    snackbarUIState5 = snackbarUIState4;
                                    obj9 = objB10;
                                    loadingDialogUIState8 = loadingDialogUIState6;
                                    list5 = list4;
                                    mTicketTripInfoUIStateFactory7 = mTicketTripInfoUIStateFactory6;
                                    String str1111111 = (String) obj9;
                                    Function1 function1115 = function10;
                                    str12 = str1111111;
                                    mTicketTripInfoUIStateFactory5 = mTicketTripInfoUIStateFactory7;
                                    list4 = list5;
                                    toolbarUIState10 = toolbarUIState11;
                                    function9 = function1115;
                                    LoadingDialogUIState loadingDialogUIState1112 = loadingDialogUIState8;
                                    snackbarUIState4 = snackbarUIState5;
                                    productBookingBranding5 = productBookingBranding6;
                                    loadingDialogUIState7 = loadingDialogUIState1112;
                                    str10 = str13;
                                    routeSelectionInputUIState5 = routeSelectionInputUIState7;
                                    routeSelectionInputUIState4 = routeSelectionInputUIState6;
                                    chaloTextUIState8 = chaloTextUIState9;
                                    buttonUIState6 = buttonUIState7;
                                } else {
                                    MTicketTripInfoUIStateFactory mTicketTripInfoUIStateFactory111115 = mTicketTripInfoUIStateFactory4;
                                    RouteSelectionInputUIState routeSelectionInputUIState1111 = routeSelectionInputUIState2;
                                    loadingDialogUIState7 = loadingDialogUIState6;
                                    toolbarUIState10 = toolbarUIState9;
                                    routeSelectionInputUIState4 = routeSelectionInputUIState1111;
                                    chaloTextUIState8 = chaloTextUIState7;
                                    routeSelectionInputUIState5 = routeSelectionInputUIState3;
                                    productBookingBranding5 = productBookingBranding4;
                                    mTicketTripInfoUIStateFactory5 = mTicketTripInfoUIStateFactory111115;
                                    str12 = null;
                                }
                                wg0 wg0Var11111112 = new wg0(function9, 6);
                                mTicketTripInfoUIStateFactory5.getClass();
                                return new MTicketTripInfoUIState(toolbarUIState10, routeSelectionInputUIState4, routeSelectionInputUIState5, c(str10, str11, list4, str12, wg0Var11111112), buttonUIState6, chaloTextUIState8, productBookingBranding5, loadingDialogUIState7, snackbarUIState4);
                            }
                        }
                    }
                }
                coroutineSingletons6 = coroutineSingletons6;
                return coroutineSingletons6;
            case 3:
                ButtonUIState buttonUIState20 = (ButtonUIState) mTicketTripInfoUIStateFactory$convertToUIState$1.L$3;
                toolbarUIState2 = (ToolbarUIState) mTicketTripInfoUIStateFactory$convertToUIState$1.L$2;
                function3 = (Function1) mTicketTripInfoUIStateFactory$convertToUIState$1.L$1;
                MTicketTripInfoDataState mTicketTripInfoDataState13 = (MTicketTripInfoDataState) mTicketTripInfoUIStateFactory$convertToUIState$1.L$0;
                ResultKt.b(obj9);
                mTicketTripInfoDataState6 = mTicketTripInfoDataState13;
                buttonUIStateG = buttonUIState20;
                obj2 = obj9;
                mTicketTripInfoDataState5 = mTicketTripInfoDataState6;
                chaloTextUIState = new TextUIState.ChaloTextUIState((String) obj2, UITextStyle.BodyMedium, ChaloColorToken.Black_60.f9766a, 0, UITextAlign.Center, (UIFontWeight) null, (Integer) null, UiEventHandler.Companion.a(new wg0(function3, 3)), (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 7896);
                function4 = function3;
                buttonUIState = buttonUIStateG;
                toolbarUIState3 = toolbarUIState2;
                if (mTicketTripInfoDataState5.f) {
                    mTicketTripInfoUIStateFactory$convertToUIState$1.L$0 = mTicketTripInfoDataState5;
                    mTicketTripInfoUIStateFactory$convertToUIState$1.L$1 = function4;
                    mTicketTripInfoUIStateFactory$convertToUIState$1.L$2 = toolbarUIState3;
                    mTicketTripInfoUIStateFactory$convertToUIState$1.L$3 = buttonUIState;
                    mTicketTripInfoUIStateFactory$convertToUIState$1.L$4 = chaloTextUIState;
                    dialogUIStateFactory = DialogUIStateFactory.f9989a;
                    mTicketTripInfoUIStateFactory$convertToUIState$1.L$5 = dialogUIStateFactory;
                    mTicketTripInfoUIStateFactory$convertToUIState$1.label = 4;
                    objB4 = stringProvider4.b(StringEnum.LOADING, new Object[0], mTicketTripInfoUIStateFactory$convertToUIState$1);
                    if (objB4 != coroutineSingletons6) {
                        obj3 = objB4;
                        chaloTextUIState3 = chaloTextUIState;
                        dialogUIStateFactory2 = dialogUIStateFactory;
                        dialogUIStateFactory2.getClass();
                        loadingDialogUIStateA = DialogUIStateFactory.a((String) obj3);
                        mTicketTripInfoDataState7 = mTicketTripInfoDataState5;
                        function5 = function4;
                        toolbarUIState4 = toolbarUIState3;
                        buttonUIState2 = buttonUIState;
                        chaloTextUIState2 = chaloTextUIState3;
                        productBookingBranding = mTicketTripInfoDataState7.g;
                        mTicketTripInfoSnackBarType = mTicketTripInfoDataState7.e;
                        if (mTicketTripInfoSnackBarType != null) {
                            mTicketTripInfoUIStateFactory$convertToUIState$1.L$0 = mTicketTripInfoDataState7;
                            mTicketTripInfoUIStateFactory$convertToUIState$1.L$1 = function5;
                            mTicketTripInfoUIStateFactory$convertToUIState$1.L$2 = toolbarUIState4;
                            mTicketTripInfoUIStateFactory$convertToUIState$1.L$3 = buttonUIState2;
                            mTicketTripInfoUIStateFactory$convertToUIState$1.L$4 = chaloTextUIState2;
                            mTicketTripInfoUIStateFactory$convertToUIState$1.L$5 = loadingDialogUIStateA;
                            mTicketTripInfoUIStateFactory$convertToUIState$1.L$6 = productBookingBranding;
                            mTicketTripInfoUIStateFactory$convertToUIState$1.label = 5;
                            objD = d(mTicketTripInfoSnackBarType, function5, mTicketTripInfoUIStateFactory$convertToUIState$1);
                            if (objD != coroutineSingletons6) {
                                TextUIState.ChaloTextUIState chaloTextUIState11111110 = chaloTextUIState2;
                                loadingDialogUIState = loadingDialogUIStateA;
                                obj4 = objD;
                                mTicketTripInfoDataState8 = mTicketTripInfoDataState7;
                                function6 = function5;
                                toolbarUIState5 = toolbarUIState4;
                                buttonUIState3 = buttonUIState2;
                                chaloTextUIState4 = chaloTextUIState11111110;
                                snackbarUIState = (SnackbarUIState) obj4;
                                mTicketTripInfoUIStateFactory$convertToUIState$1.L$0 = mTicketTripInfoDataState8;
                                mTicketTripInfoUIStateFactory$convertToUIState$1.L$1 = function6;
                                mTicketTripInfoUIStateFactory$convertToUIState$1.L$2 = toolbarUIState5;
                                mTicketTripInfoUIStateFactory$convertToUIState$1.L$3 = buttonUIState3;
                                mTicketTripInfoUIStateFactory$convertToUIState$1.L$4 = chaloTextUIState4;
                                mTicketTripInfoUIStateFactory$convertToUIState$1.L$5 = loadingDialogUIState;
                                mTicketTripInfoUIStateFactory$convertToUIState$1.L$6 = productBookingBranding;
                                mTicketTripInfoUIStateFactory$convertToUIState$1.L$7 = snackbarUIState;
                                mTicketTripInfoUIStateFactory$convertToUIState$1.L$8 = this;
                                mTicketTripInfoUIStateFactory$convertToUIState$1.label = 6;
                                objB5 = stringProvider4.b(StringEnum.HINT_ROUTE_NUMBER, new Object[0], mTicketTripInfoUIStateFactory$convertToUIState$1);
                                if (objB5 != coroutineSingletons6) {
                                    ButtonUIState buttonUIState1112 = buttonUIState3;
                                    snackbarUIState2 = snackbarUIState;
                                    obj5 = objB5;
                                    buttonUIState4 = buttonUIState1112;
                                    toolbarUIState6 = toolbarUIState5;
                                    function7 = function6;
                                    productBookingBranding2 = productBookingBranding;
                                    loadingDialogUIState2 = loadingDialogUIState;
                                    chaloTextUIState5 = chaloTextUIState4;
                                    mTicketTripInfoUIStateFactory = this;
                                    str = (String) obj5;
                                    productBookingRouteDetails = mTicketTripInfoDataState8.b;
                                    str2 = "";
                                    if (productBookingRouteDetails != null) {
                                        str3 = str2;
                                    } else {
                                        str3 = str2;
                                    }
                                    if (productBookingRouteDetails != null) {
                                        list = EmptyList.f17557a;
                                    } else {
                                        list = EmptyList.f17557a;
                                    }
                                    if (mTicketTripInfoDataState8.i == MTicketTripInfoMissingFieldError.ROUTE) {
                                        mTicketTripInfoUIStateFactory$convertToUIState$1.L$0 = mTicketTripInfoDataState8;
                                        mTicketTripInfoUIStateFactory$convertToUIState$1.L$1 = function7;
                                        mTicketTripInfoUIStateFactory$convertToUIState$1.L$2 = toolbarUIState6;
                                        mTicketTripInfoUIStateFactory$convertToUIState$1.L$3 = buttonUIState4;
                                        mTicketTripInfoUIStateFactory$convertToUIState$1.L$4 = chaloTextUIState5;
                                        mTicketTripInfoUIStateFactory$convertToUIState$1.L$5 = loadingDialogUIState2;
                                        mTicketTripInfoUIStateFactory$convertToUIState$1.L$6 = productBookingBranding2;
                                        mTicketTripInfoUIStateFactory$convertToUIState$1.L$7 = snackbarUIState2;
                                        mTicketTripInfoUIStateFactory$convertToUIState$1.L$8 = mTicketTripInfoUIStateFactory;
                                        mTicketTripInfoUIStateFactory$convertToUIState$1.L$9 = str;
                                        mTicketTripInfoUIStateFactory$convertToUIState$1.L$10 = str3;
                                        mTicketTripInfoUIStateFactory$convertToUIState$1.L$11 = list;
                                        mTicketTripInfoUIStateFactory$convertToUIState$1.label = 7;
                                        objB6 = stringProvider4.b(StringEnum.STATUS_ERROR_ROUTE_NUMBER, new Object[0], mTicketTripInfoUIStateFactory$convertToUIState$1);
                                        if (objB6 != coroutineSingletons6) {
                                            coroutineSingletons6 = coroutineSingletons6;
                                            List list1110 = list;
                                            obj6 = objB6;
                                            list2 = list1110;
                                            String str1111112 = str3;
                                            chaloTextUIState6 = chaloTextUIState5;
                                            str5 = str1111112;
                                            str4 = (String) obj6;
                                            TextUIState.ChaloTextUIState chaloTextUIState11111111 = chaloTextUIState6;
                                            str3 = str5;
                                            chaloTextUIState5 = chaloTextUIState11111111;
                                        }
                                    } else {
                                        coroutineSingletons6 = coroutineSingletons6;
                                        list2 = list;
                                        str4 = null;
                                    }
                                    MTicketTripInfoUIStateFactory mTicketTripInfoUIStateFactory111116 = mTicketTripInfoUIStateFactory;
                                    wg0 wg0Var11111113 = new wg0(function7, 4);
                                    mTicketTripInfoUIStateFactory111116.getClass();
                                    routeSelectionInputUIStateC = c(str, str3, list2, str4, wg0Var11111113);
                                    mTicketTripInfoUIStateFactory$convertToUIState$1.L$0 = mTicketTripInfoDataState8;
                                    mTicketTripInfoUIStateFactory$convertToUIState$1.L$1 = function7;
                                    mTicketTripInfoUIStateFactory$convertToUIState$1.L$2 = toolbarUIState6;
                                    mTicketTripInfoUIStateFactory$convertToUIState$1.L$3 = buttonUIState4;
                                    mTicketTripInfoUIStateFactory$convertToUIState$1.L$4 = chaloTextUIState5;
                                    mTicketTripInfoUIStateFactory$convertToUIState$1.L$5 = loadingDialogUIState2;
                                    mTicketTripInfoUIStateFactory$convertToUIState$1.L$6 = productBookingBranding2;
                                    mTicketTripInfoUIStateFactory$convertToUIState$1.L$7 = snackbarUIState2;
                                    mTicketTripInfoUIStateFactory$convertToUIState$1.L$8 = routeSelectionInputUIStateC;
                                    mTicketTripInfoUIStateFactory$convertToUIState$1.L$9 = this;
                                    mTicketTripInfoUIStateFactory$convertToUIState$1.L$10 = null;
                                    mTicketTripInfoUIStateFactory$convertToUIState$1.L$11 = null;
                                    mTicketTripInfoUIStateFactory$convertToUIState$1.label = 8;
                                    objB7 = stringProvider4.b(StringEnum.HINT_START_STOP, new Object[0], mTicketTripInfoUIStateFactory$convertToUIState$1);
                                    coroutineSingletons = coroutineSingletons6;
                                    if (objB7 == coroutineSingletons) {
                                        return coroutineSingletons;
                                    }
                                    SnackbarUIState snackbarUIState11111118 = snackbarUIState2;
                                    routeSelectionInputUIState = routeSelectionInputUIStateC;
                                    loadingDialogUIState3 = loadingDialogUIState2;
                                    productBookingBranding3 = productBookingBranding2;
                                    snackbarUIState3 = snackbarUIState11111118;
                                    ToolbarUIState toolbarUIState1116 = toolbarUIState6;
                                    buttonUIState5 = buttonUIState4;
                                    function8 = function7;
                                    toolbarUIState7 = toolbarUIState1116;
                                    mTicketTripInfoUIStateFactory2 = this;
                                    str6 = (String) objB7;
                                    productBookingStopDetails = mTicketTripInfoDataState8.c;
                                    if (productBookingStopDetails != null) {
                                        str7 = str2;
                                    } else {
                                        str7 = str2;
                                    }
                                    list3 = EmptyList.f17557a;
                                    coroutineSingletons2 = coroutineSingletons;
                                    if (mTicketTripInfoDataState8.i == MTicketTripInfoMissingFieldError.FROM_STOP) {
                                        mTicketTripInfoUIStateFactory$convertToUIState$1.L$0 = mTicketTripInfoDataState8;
                                        mTicketTripInfoUIStateFactory$convertToUIState$1.L$1 = function8;
                                        mTicketTripInfoUIStateFactory$convertToUIState$1.L$2 = toolbarUIState7;
                                        mTicketTripInfoUIStateFactory$convertToUIState$1.L$3 = buttonUIState5;
                                        mTicketTripInfoUIStateFactory$convertToUIState$1.L$4 = chaloTextUIState5;
                                        mTicketTripInfoUIStateFactory$convertToUIState$1.L$5 = loadingDialogUIState3;
                                        mTicketTripInfoUIStateFactory$convertToUIState$1.L$6 = productBookingBranding3;
                                        mTicketTripInfoUIStateFactory$convertToUIState$1.L$7 = snackbarUIState3;
                                        mTicketTripInfoUIStateFactory$convertToUIState$1.L$8 = routeSelectionInputUIState;
                                        mTicketTripInfoUIStateFactory$convertToUIState$1.L$9 = mTicketTripInfoUIStateFactory2;
                                        mTicketTripInfoUIStateFactory$convertToUIState$1.L$10 = str6;
                                        mTicketTripInfoUIStateFactory$convertToUIState$1.L$11 = str7;
                                        mTicketTripInfoUIStateFactory$convertToUIState$1.L$12 = list3;
                                        mTicketTripInfoUIStateFactory$convertToUIState$1.label = 9;
                                        loadingDialogUIState4 = loadingDialogUIState3;
                                        stringProvider = stringProvider4;
                                        objB8 = stringProvider.b(StringEnum.STATUS_ERROR_ENTER_STOP, new Object[0], mTicketTripInfoUIStateFactory$convertToUIState$1);
                                        coroutineSingletons3 = coroutineSingletons2;
                                        if (objB8 == coroutineSingletons3) {
                                            return coroutineSingletons3;
                                        }
                                        TextUIState.ChaloTextUIState chaloTextUIState11111112 = chaloTextUIState5;
                                        str9 = str7;
                                        obj7 = objB8;
                                        chaloTextUIState7 = chaloTextUIState11111112;
                                        SnackbarUIState snackbarUIState11111119 = snackbarUIState3;
                                        routeSelectionInputUIState2 = routeSelectionInputUIState;
                                        toolbarUIState8 = toolbarUIState7;
                                        buttonUIState6 = buttonUIState5;
                                        function9 = function8;
                                        productBookingBranding4 = productBookingBranding3;
                                        snackbarUIState4 = snackbarUIState11111119;
                                        coroutineSingletons2 = coroutineSingletons3;
                                        mTicketTripInfoUIStateFactory3 = mTicketTripInfoUIStateFactory2;
                                        str8 = (String) obj7;
                                    } else {
                                        loadingDialogUIState4 = loadingDialogUIState3;
                                        stringProvider = stringProvider4;
                                        SnackbarUIState snackbarUIState111111110 = snackbarUIState3;
                                        routeSelectionInputUIState2 = routeSelectionInputUIState;
                                        toolbarUIState8 = toolbarUIState7;
                                        buttonUIState6 = buttonUIState5;
                                        function9 = function8;
                                        productBookingBranding4 = productBookingBranding3;
                                        snackbarUIState4 = snackbarUIState111111110;
                                        chaloTextUIState7 = chaloTextUIState5;
                                        mTicketTripInfoUIStateFactory3 = mTicketTripInfoUIStateFactory2;
                                        str8 = null;
                                        str9 = str7;
                                    }
                                    loadingDialogUIState5 = loadingDialogUIState4;
                                    StringProvider stringProvider119 = stringProvider;
                                    wg0 wg0Var11111114 = new wg0(function9, 5);
                                    mTicketTripInfoUIStateFactory3.getClass();
                                    routeSelectionInputUIStateC2 = c(str6, str9, list3, str8, wg0Var11111114);
                                    mTicketTripInfoUIStateFactory$convertToUIState$1.L$0 = mTicketTripInfoDataState8;
                                    mTicketTripInfoUIStateFactory$convertToUIState$1.L$1 = function9;
                                    mTicketTripInfoUIStateFactory$convertToUIState$1.L$2 = toolbarUIState8;
                                    mTicketTripInfoUIStateFactory$convertToUIState$1.L$3 = buttonUIState6;
                                    mTicketTripInfoUIStateFactory$convertToUIState$1.L$4 = chaloTextUIState7;
                                    mTicketTripInfoUIStateFactory$convertToUIState$1.L$5 = loadingDialogUIState5;
                                    mTicketTripInfoUIStateFactory$convertToUIState$1.L$6 = productBookingBranding4;
                                    mTicketTripInfoUIStateFactory$convertToUIState$1.L$7 = snackbarUIState4;
                                    mTicketTripInfoUIStateFactory$convertToUIState$1.L$8 = routeSelectionInputUIState2;
                                    mTicketTripInfoUIStateFactory$convertToUIState$1.L$9 = routeSelectionInputUIStateC2;
                                    mTicketTripInfoUIStateFactory$convertToUIState$1.L$10 = this;
                                    mTicketTripInfoUIStateFactory$convertToUIState$1.L$11 = null;
                                    mTicketTripInfoUIStateFactory$convertToUIState$1.L$12 = null;
                                    mTicketTripInfoUIStateFactory$convertToUIState$1.label = 10;
                                    stringProvider2 = stringProvider119;
                                    objB9 = stringProvider2.b(StringEnum.HINT_END_STOP, new Object[0], mTicketTripInfoUIStateFactory$convertToUIState$1);
                                    coroutineSingletons4 = coroutineSingletons2;
                                    if (objB9 == coroutineSingletons4) {
                                        return coroutineSingletons4;
                                    }
                                    loadingDialogUIState6 = loadingDialogUIState5;
                                    obj8 = objB9;
                                    toolbarUIState9 = toolbarUIState8;
                                    routeSelectionInputUIState3 = routeSelectionInputUIStateC2;
                                    mTicketTripInfoUIStateFactory4 = this;
                                    str10 = (String) obj8;
                                    productBookingStopDetails2 = mTicketTripInfoDataState8.d;
                                    if (productBookingStopDetails2 != null) {
                                        str11 = str2;
                                    } else {
                                        str11 = str2;
                                    }
                                    coroutineSingletons5 = coroutineSingletons4;
                                    list4 = EmptyList.f17557a;
                                    stringProvider3 = stringProvider2;
                                    if (mTicketTripInfoDataState8.i == MTicketTripInfoMissingFieldError.TO_STOP) {
                                        mTicketTripInfoUIStateFactory$convertToUIState$1.L$0 = function9;
                                        mTicketTripInfoUIStateFactory$convertToUIState$1.L$1 = toolbarUIState9;
                                        mTicketTripInfoUIStateFactory$convertToUIState$1.L$2 = buttonUIState6;
                                        mTicketTripInfoUIStateFactory$convertToUIState$1.L$3 = chaloTextUIState7;
                                        mTicketTripInfoUIStateFactory$convertToUIState$1.L$4 = loadingDialogUIState6;
                                        mTicketTripInfoUIStateFactory$convertToUIState$1.L$5 = productBookingBranding4;
                                        mTicketTripInfoUIStateFactory$convertToUIState$1.L$6 = snackbarUIState4;
                                        mTicketTripInfoUIStateFactory$convertToUIState$1.L$7 = routeSelectionInputUIState2;
                                        mTicketTripInfoUIStateFactory$convertToUIState$1.L$8 = routeSelectionInputUIState3;
                                        mTicketTripInfoUIStateFactory$convertToUIState$1.L$9 = mTicketTripInfoUIStateFactory4;
                                        mTicketTripInfoUIStateFactory$convertToUIState$1.L$10 = str10;
                                        mTicketTripInfoUIStateFactory$convertToUIState$1.L$11 = str11;
                                        mTicketTripInfoUIStateFactory$convertToUIState$1.L$12 = list4;
                                        mTicketTripInfoUIStateFactory6 = mTicketTripInfoUIStateFactory4;
                                        mTicketTripInfoUIStateFactory$convertToUIState$1.label = 11;
                                        objB10 = stringProvider3.b(StringEnum.STATUS_ERROR_ENTER_STOP, new Object[0], mTicketTripInfoUIStateFactory$convertToUIState$1);
                                        if (objB10 == coroutineSingletons5) {
                                            return coroutineSingletons5;
                                        }
                                        chaloTextUIState9 = chaloTextUIState7;
                                        routeSelectionInputUIState6 = routeSelectionInputUIState2;
                                        productBookingBranding6 = productBookingBranding4;
                                        function10 = function9;
                                        buttonUIState7 = buttonUIState6;
                                        str13 = str10;
                                        toolbarUIState11 = toolbarUIState9;
                                        routeSelectionInputUIState7 = routeSelectionInputUIState3;
                                        snackbarUIState5 = snackbarUIState4;
                                        obj9 = objB10;
                                        loadingDialogUIState8 = loadingDialogUIState6;
                                        list5 = list4;
                                        mTicketTripInfoUIStateFactory7 = mTicketTripInfoUIStateFactory6;
                                        String str1111113 = (String) obj9;
                                        Function1 function1116 = function10;
                                        str12 = str1111113;
                                        mTicketTripInfoUIStateFactory5 = mTicketTripInfoUIStateFactory7;
                                        list4 = list5;
                                        toolbarUIState10 = toolbarUIState11;
                                        function9 = function1116;
                                        LoadingDialogUIState loadingDialogUIState1113 = loadingDialogUIState8;
                                        snackbarUIState4 = snackbarUIState5;
                                        productBookingBranding5 = productBookingBranding6;
                                        loadingDialogUIState7 = loadingDialogUIState1113;
                                        str10 = str13;
                                        routeSelectionInputUIState5 = routeSelectionInputUIState7;
                                        routeSelectionInputUIState4 = routeSelectionInputUIState6;
                                        chaloTextUIState8 = chaloTextUIState9;
                                        buttonUIState6 = buttonUIState7;
                                    } else {
                                        MTicketTripInfoUIStateFactory mTicketTripInfoUIStateFactory111117 = mTicketTripInfoUIStateFactory4;
                                        RouteSelectionInputUIState routeSelectionInputUIState1112 = routeSelectionInputUIState2;
                                        loadingDialogUIState7 = loadingDialogUIState6;
                                        toolbarUIState10 = toolbarUIState9;
                                        routeSelectionInputUIState4 = routeSelectionInputUIState1112;
                                        chaloTextUIState8 = chaloTextUIState7;
                                        routeSelectionInputUIState5 = routeSelectionInputUIState3;
                                        productBookingBranding5 = productBookingBranding4;
                                        mTicketTripInfoUIStateFactory5 = mTicketTripInfoUIStateFactory111117;
                                        str12 = null;
                                    }
                                    wg0 wg0Var11111115 = new wg0(function9, 6);
                                    mTicketTripInfoUIStateFactory5.getClass();
                                    return new MTicketTripInfoUIState(toolbarUIState10, routeSelectionInputUIState4, routeSelectionInputUIState5, c(str10, str11, list4, str12, wg0Var11111115), buttonUIState6, chaloTextUIState8, productBookingBranding5, loadingDialogUIState7, snackbarUIState4);
                                }
                            }
                        } else {
                            mTicketTripInfoDataState8 = mTicketTripInfoDataState7;
                            function6 = function5;
                            toolbarUIState5 = toolbarUIState4;
                            buttonUIState3 = buttonUIState2;
                            chaloTextUIState4 = chaloTextUIState2;
                            loadingDialogUIState = loadingDialogUIStateA;
                            snackbarUIState = null;
                            mTicketTripInfoUIStateFactory$convertToUIState$1.L$0 = mTicketTripInfoDataState8;
                            mTicketTripInfoUIStateFactory$convertToUIState$1.L$1 = function6;
                            mTicketTripInfoUIStateFactory$convertToUIState$1.L$2 = toolbarUIState5;
                            mTicketTripInfoUIStateFactory$convertToUIState$1.L$3 = buttonUIState3;
                            mTicketTripInfoUIStateFactory$convertToUIState$1.L$4 = chaloTextUIState4;
                            mTicketTripInfoUIStateFactory$convertToUIState$1.L$5 = loadingDialogUIState;
                            mTicketTripInfoUIStateFactory$convertToUIState$1.L$6 = productBookingBranding;
                            mTicketTripInfoUIStateFactory$convertToUIState$1.L$7 = snackbarUIState;
                            mTicketTripInfoUIStateFactory$convertToUIState$1.L$8 = this;
                            mTicketTripInfoUIStateFactory$convertToUIState$1.label = 6;
                            objB5 = stringProvider4.b(StringEnum.HINT_ROUTE_NUMBER, new Object[0], mTicketTripInfoUIStateFactory$convertToUIState$1);
                            if (objB5 != coroutineSingletons6) {
                                ButtonUIState buttonUIState1113 = buttonUIState3;
                                snackbarUIState2 = snackbarUIState;
                                obj5 = objB5;
                                buttonUIState4 = buttonUIState1113;
                                toolbarUIState6 = toolbarUIState5;
                                function7 = function6;
                                productBookingBranding2 = productBookingBranding;
                                loadingDialogUIState2 = loadingDialogUIState;
                                chaloTextUIState5 = chaloTextUIState4;
                                mTicketTripInfoUIStateFactory = this;
                                str = (String) obj5;
                                productBookingRouteDetails = mTicketTripInfoDataState8.b;
                                str2 = "";
                                if (productBookingRouteDetails != null) {
                                    str3 = str2;
                                } else {
                                    str3 = str2;
                                }
                                if (productBookingRouteDetails != null) {
                                    list = EmptyList.f17557a;
                                } else {
                                    list = EmptyList.f17557a;
                                }
                                if (mTicketTripInfoDataState8.i == MTicketTripInfoMissingFieldError.ROUTE) {
                                    mTicketTripInfoUIStateFactory$convertToUIState$1.L$0 = mTicketTripInfoDataState8;
                                    mTicketTripInfoUIStateFactory$convertToUIState$1.L$1 = function7;
                                    mTicketTripInfoUIStateFactory$convertToUIState$1.L$2 = toolbarUIState6;
                                    mTicketTripInfoUIStateFactory$convertToUIState$1.L$3 = buttonUIState4;
                                    mTicketTripInfoUIStateFactory$convertToUIState$1.L$4 = chaloTextUIState5;
                                    mTicketTripInfoUIStateFactory$convertToUIState$1.L$5 = loadingDialogUIState2;
                                    mTicketTripInfoUIStateFactory$convertToUIState$1.L$6 = productBookingBranding2;
                                    mTicketTripInfoUIStateFactory$convertToUIState$1.L$7 = snackbarUIState2;
                                    mTicketTripInfoUIStateFactory$convertToUIState$1.L$8 = mTicketTripInfoUIStateFactory;
                                    mTicketTripInfoUIStateFactory$convertToUIState$1.L$9 = str;
                                    mTicketTripInfoUIStateFactory$convertToUIState$1.L$10 = str3;
                                    mTicketTripInfoUIStateFactory$convertToUIState$1.L$11 = list;
                                    mTicketTripInfoUIStateFactory$convertToUIState$1.label = 7;
                                    objB6 = stringProvider4.b(StringEnum.STATUS_ERROR_ROUTE_NUMBER, new Object[0], mTicketTripInfoUIStateFactory$convertToUIState$1);
                                    if (objB6 != coroutineSingletons6) {
                                        coroutineSingletons6 = coroutineSingletons6;
                                        List list1111 = list;
                                        obj6 = objB6;
                                        list2 = list1111;
                                        String str1111114 = str3;
                                        chaloTextUIState6 = chaloTextUIState5;
                                        str5 = str1111114;
                                        str4 = (String) obj6;
                                        TextUIState.ChaloTextUIState chaloTextUIState11111113 = chaloTextUIState6;
                                        str3 = str5;
                                        chaloTextUIState5 = chaloTextUIState11111113;
                                    }
                                } else {
                                    coroutineSingletons6 = coroutineSingletons6;
                                    list2 = list;
                                    str4 = null;
                                }
                                MTicketTripInfoUIStateFactory mTicketTripInfoUIStateFactory111118 = mTicketTripInfoUIStateFactory;
                                wg0 wg0Var11111116 = new wg0(function7, 4);
                                mTicketTripInfoUIStateFactory111118.getClass();
                                routeSelectionInputUIStateC = c(str, str3, list2, str4, wg0Var11111116);
                                mTicketTripInfoUIStateFactory$convertToUIState$1.L$0 = mTicketTripInfoDataState8;
                                mTicketTripInfoUIStateFactory$convertToUIState$1.L$1 = function7;
                                mTicketTripInfoUIStateFactory$convertToUIState$1.L$2 = toolbarUIState6;
                                mTicketTripInfoUIStateFactory$convertToUIState$1.L$3 = buttonUIState4;
                                mTicketTripInfoUIStateFactory$convertToUIState$1.L$4 = chaloTextUIState5;
                                mTicketTripInfoUIStateFactory$convertToUIState$1.L$5 = loadingDialogUIState2;
                                mTicketTripInfoUIStateFactory$convertToUIState$1.L$6 = productBookingBranding2;
                                mTicketTripInfoUIStateFactory$convertToUIState$1.L$7 = snackbarUIState2;
                                mTicketTripInfoUIStateFactory$convertToUIState$1.L$8 = routeSelectionInputUIStateC;
                                mTicketTripInfoUIStateFactory$convertToUIState$1.L$9 = this;
                                mTicketTripInfoUIStateFactory$convertToUIState$1.L$10 = null;
                                mTicketTripInfoUIStateFactory$convertToUIState$1.L$11 = null;
                                mTicketTripInfoUIStateFactory$convertToUIState$1.label = 8;
                                objB7 = stringProvider4.b(StringEnum.HINT_START_STOP, new Object[0], mTicketTripInfoUIStateFactory$convertToUIState$1);
                                coroutineSingletons = coroutineSingletons6;
                                if (objB7 == coroutineSingletons) {
                                    return coroutineSingletons;
                                }
                                SnackbarUIState snackbarUIState111111111 = snackbarUIState2;
                                routeSelectionInputUIState = routeSelectionInputUIStateC;
                                loadingDialogUIState3 = loadingDialogUIState2;
                                productBookingBranding3 = productBookingBranding2;
                                snackbarUIState3 = snackbarUIState111111111;
                                ToolbarUIState toolbarUIState1117 = toolbarUIState6;
                                buttonUIState5 = buttonUIState4;
                                function8 = function7;
                                toolbarUIState7 = toolbarUIState1117;
                                mTicketTripInfoUIStateFactory2 = this;
                                str6 = (String) objB7;
                                productBookingStopDetails = mTicketTripInfoDataState8.c;
                                if (productBookingStopDetails != null) {
                                    str7 = str2;
                                } else {
                                    str7 = str2;
                                }
                                list3 = EmptyList.f17557a;
                                coroutineSingletons2 = coroutineSingletons;
                                if (mTicketTripInfoDataState8.i == MTicketTripInfoMissingFieldError.FROM_STOP) {
                                    mTicketTripInfoUIStateFactory$convertToUIState$1.L$0 = mTicketTripInfoDataState8;
                                    mTicketTripInfoUIStateFactory$convertToUIState$1.L$1 = function8;
                                    mTicketTripInfoUIStateFactory$convertToUIState$1.L$2 = toolbarUIState7;
                                    mTicketTripInfoUIStateFactory$convertToUIState$1.L$3 = buttonUIState5;
                                    mTicketTripInfoUIStateFactory$convertToUIState$1.L$4 = chaloTextUIState5;
                                    mTicketTripInfoUIStateFactory$convertToUIState$1.L$5 = loadingDialogUIState3;
                                    mTicketTripInfoUIStateFactory$convertToUIState$1.L$6 = productBookingBranding3;
                                    mTicketTripInfoUIStateFactory$convertToUIState$1.L$7 = snackbarUIState3;
                                    mTicketTripInfoUIStateFactory$convertToUIState$1.L$8 = routeSelectionInputUIState;
                                    mTicketTripInfoUIStateFactory$convertToUIState$1.L$9 = mTicketTripInfoUIStateFactory2;
                                    mTicketTripInfoUIStateFactory$convertToUIState$1.L$10 = str6;
                                    mTicketTripInfoUIStateFactory$convertToUIState$1.L$11 = str7;
                                    mTicketTripInfoUIStateFactory$convertToUIState$1.L$12 = list3;
                                    mTicketTripInfoUIStateFactory$convertToUIState$1.label = 9;
                                    loadingDialogUIState4 = loadingDialogUIState3;
                                    stringProvider = stringProvider4;
                                    objB8 = stringProvider.b(StringEnum.STATUS_ERROR_ENTER_STOP, new Object[0], mTicketTripInfoUIStateFactory$convertToUIState$1);
                                    coroutineSingletons3 = coroutineSingletons2;
                                    if (objB8 == coroutineSingletons3) {
                                        return coroutineSingletons3;
                                    }
                                    TextUIState.ChaloTextUIState chaloTextUIState11111114 = chaloTextUIState5;
                                    str9 = str7;
                                    obj7 = objB8;
                                    chaloTextUIState7 = chaloTextUIState11111114;
                                    SnackbarUIState snackbarUIState111111112 = snackbarUIState3;
                                    routeSelectionInputUIState2 = routeSelectionInputUIState;
                                    toolbarUIState8 = toolbarUIState7;
                                    buttonUIState6 = buttonUIState5;
                                    function9 = function8;
                                    productBookingBranding4 = productBookingBranding3;
                                    snackbarUIState4 = snackbarUIState111111112;
                                    coroutineSingletons2 = coroutineSingletons3;
                                    mTicketTripInfoUIStateFactory3 = mTicketTripInfoUIStateFactory2;
                                    str8 = (String) obj7;
                                } else {
                                    loadingDialogUIState4 = loadingDialogUIState3;
                                    stringProvider = stringProvider4;
                                    SnackbarUIState snackbarUIState111111113 = snackbarUIState3;
                                    routeSelectionInputUIState2 = routeSelectionInputUIState;
                                    toolbarUIState8 = toolbarUIState7;
                                    buttonUIState6 = buttonUIState5;
                                    function9 = function8;
                                    productBookingBranding4 = productBookingBranding3;
                                    snackbarUIState4 = snackbarUIState111111113;
                                    chaloTextUIState7 = chaloTextUIState5;
                                    mTicketTripInfoUIStateFactory3 = mTicketTripInfoUIStateFactory2;
                                    str8 = null;
                                    str9 = str7;
                                }
                                loadingDialogUIState5 = loadingDialogUIState4;
                                StringProvider stringProvider1110 = stringProvider;
                                wg0 wg0Var11111117 = new wg0(function9, 5);
                                mTicketTripInfoUIStateFactory3.getClass();
                                routeSelectionInputUIStateC2 = c(str6, str9, list3, str8, wg0Var11111117);
                                mTicketTripInfoUIStateFactory$convertToUIState$1.L$0 = mTicketTripInfoDataState8;
                                mTicketTripInfoUIStateFactory$convertToUIState$1.L$1 = function9;
                                mTicketTripInfoUIStateFactory$convertToUIState$1.L$2 = toolbarUIState8;
                                mTicketTripInfoUIStateFactory$convertToUIState$1.L$3 = buttonUIState6;
                                mTicketTripInfoUIStateFactory$convertToUIState$1.L$4 = chaloTextUIState7;
                                mTicketTripInfoUIStateFactory$convertToUIState$1.L$5 = loadingDialogUIState5;
                                mTicketTripInfoUIStateFactory$convertToUIState$1.L$6 = productBookingBranding4;
                                mTicketTripInfoUIStateFactory$convertToUIState$1.L$7 = snackbarUIState4;
                                mTicketTripInfoUIStateFactory$convertToUIState$1.L$8 = routeSelectionInputUIState2;
                                mTicketTripInfoUIStateFactory$convertToUIState$1.L$9 = routeSelectionInputUIStateC2;
                                mTicketTripInfoUIStateFactory$convertToUIState$1.L$10 = this;
                                mTicketTripInfoUIStateFactory$convertToUIState$1.L$11 = null;
                                mTicketTripInfoUIStateFactory$convertToUIState$1.L$12 = null;
                                mTicketTripInfoUIStateFactory$convertToUIState$1.label = 10;
                                stringProvider2 = stringProvider1110;
                                objB9 = stringProvider2.b(StringEnum.HINT_END_STOP, new Object[0], mTicketTripInfoUIStateFactory$convertToUIState$1);
                                coroutineSingletons4 = coroutineSingletons2;
                                if (objB9 == coroutineSingletons4) {
                                    return coroutineSingletons4;
                                }
                                loadingDialogUIState6 = loadingDialogUIState5;
                                obj8 = objB9;
                                toolbarUIState9 = toolbarUIState8;
                                routeSelectionInputUIState3 = routeSelectionInputUIStateC2;
                                mTicketTripInfoUIStateFactory4 = this;
                                str10 = (String) obj8;
                                productBookingStopDetails2 = mTicketTripInfoDataState8.d;
                                if (productBookingStopDetails2 != null) {
                                    str11 = str2;
                                } else {
                                    str11 = str2;
                                }
                                coroutineSingletons5 = coroutineSingletons4;
                                list4 = EmptyList.f17557a;
                                stringProvider3 = stringProvider2;
                                if (mTicketTripInfoDataState8.i == MTicketTripInfoMissingFieldError.TO_STOP) {
                                    mTicketTripInfoUIStateFactory$convertToUIState$1.L$0 = function9;
                                    mTicketTripInfoUIStateFactory$convertToUIState$1.L$1 = toolbarUIState9;
                                    mTicketTripInfoUIStateFactory$convertToUIState$1.L$2 = buttonUIState6;
                                    mTicketTripInfoUIStateFactory$convertToUIState$1.L$3 = chaloTextUIState7;
                                    mTicketTripInfoUIStateFactory$convertToUIState$1.L$4 = loadingDialogUIState6;
                                    mTicketTripInfoUIStateFactory$convertToUIState$1.L$5 = productBookingBranding4;
                                    mTicketTripInfoUIStateFactory$convertToUIState$1.L$6 = snackbarUIState4;
                                    mTicketTripInfoUIStateFactory$convertToUIState$1.L$7 = routeSelectionInputUIState2;
                                    mTicketTripInfoUIStateFactory$convertToUIState$1.L$8 = routeSelectionInputUIState3;
                                    mTicketTripInfoUIStateFactory$convertToUIState$1.L$9 = mTicketTripInfoUIStateFactory4;
                                    mTicketTripInfoUIStateFactory$convertToUIState$1.L$10 = str10;
                                    mTicketTripInfoUIStateFactory$convertToUIState$1.L$11 = str11;
                                    mTicketTripInfoUIStateFactory$convertToUIState$1.L$12 = list4;
                                    mTicketTripInfoUIStateFactory6 = mTicketTripInfoUIStateFactory4;
                                    mTicketTripInfoUIStateFactory$convertToUIState$1.label = 11;
                                    objB10 = stringProvider3.b(StringEnum.STATUS_ERROR_ENTER_STOP, new Object[0], mTicketTripInfoUIStateFactory$convertToUIState$1);
                                    if (objB10 == coroutineSingletons5) {
                                        return coroutineSingletons5;
                                    }
                                    chaloTextUIState9 = chaloTextUIState7;
                                    routeSelectionInputUIState6 = routeSelectionInputUIState2;
                                    productBookingBranding6 = productBookingBranding4;
                                    function10 = function9;
                                    buttonUIState7 = buttonUIState6;
                                    str13 = str10;
                                    toolbarUIState11 = toolbarUIState9;
                                    routeSelectionInputUIState7 = routeSelectionInputUIState3;
                                    snackbarUIState5 = snackbarUIState4;
                                    obj9 = objB10;
                                    loadingDialogUIState8 = loadingDialogUIState6;
                                    list5 = list4;
                                    mTicketTripInfoUIStateFactory7 = mTicketTripInfoUIStateFactory6;
                                    String str1111115 = (String) obj9;
                                    Function1 function1117 = function10;
                                    str12 = str1111115;
                                    mTicketTripInfoUIStateFactory5 = mTicketTripInfoUIStateFactory7;
                                    list4 = list5;
                                    toolbarUIState10 = toolbarUIState11;
                                    function9 = function1117;
                                    LoadingDialogUIState loadingDialogUIState1114 = loadingDialogUIState8;
                                    snackbarUIState4 = snackbarUIState5;
                                    productBookingBranding5 = productBookingBranding6;
                                    loadingDialogUIState7 = loadingDialogUIState1114;
                                    str10 = str13;
                                    routeSelectionInputUIState5 = routeSelectionInputUIState7;
                                    routeSelectionInputUIState4 = routeSelectionInputUIState6;
                                    chaloTextUIState8 = chaloTextUIState9;
                                    buttonUIState6 = buttonUIState7;
                                } else {
                                    MTicketTripInfoUIStateFactory mTicketTripInfoUIStateFactory111119 = mTicketTripInfoUIStateFactory4;
                                    RouteSelectionInputUIState routeSelectionInputUIState1113 = routeSelectionInputUIState2;
                                    loadingDialogUIState7 = loadingDialogUIState6;
                                    toolbarUIState10 = toolbarUIState9;
                                    routeSelectionInputUIState4 = routeSelectionInputUIState1113;
                                    chaloTextUIState8 = chaloTextUIState7;
                                    routeSelectionInputUIState5 = routeSelectionInputUIState3;
                                    productBookingBranding5 = productBookingBranding4;
                                    mTicketTripInfoUIStateFactory5 = mTicketTripInfoUIStateFactory111119;
                                    str12 = null;
                                }
                                wg0 wg0Var11111118 = new wg0(function9, 6);
                                mTicketTripInfoUIStateFactory5.getClass();
                                return new MTicketTripInfoUIState(toolbarUIState10, routeSelectionInputUIState4, routeSelectionInputUIState5, c(str10, str11, list4, str12, wg0Var11111118), buttonUIState6, chaloTextUIState8, productBookingBranding5, loadingDialogUIState7, snackbarUIState4);
                            }
                        }
                    }
                } else {
                    mTicketTripInfoDataState7 = mTicketTripInfoDataState5;
                    function5 = function4;
                    toolbarUIState4 = toolbarUIState3;
                    buttonUIState2 = buttonUIState;
                    chaloTextUIState2 = chaloTextUIState;
                    loadingDialogUIStateA = null;
                    productBookingBranding = mTicketTripInfoDataState7.g;
                    mTicketTripInfoSnackBarType = mTicketTripInfoDataState7.e;
                    if (mTicketTripInfoSnackBarType != null) {
                        mTicketTripInfoUIStateFactory$convertToUIState$1.L$0 = mTicketTripInfoDataState7;
                        mTicketTripInfoUIStateFactory$convertToUIState$1.L$1 = function5;
                        mTicketTripInfoUIStateFactory$convertToUIState$1.L$2 = toolbarUIState4;
                        mTicketTripInfoUIStateFactory$convertToUIState$1.L$3 = buttonUIState2;
                        mTicketTripInfoUIStateFactory$convertToUIState$1.L$4 = chaloTextUIState2;
                        mTicketTripInfoUIStateFactory$convertToUIState$1.L$5 = loadingDialogUIStateA;
                        mTicketTripInfoUIStateFactory$convertToUIState$1.L$6 = productBookingBranding;
                        mTicketTripInfoUIStateFactory$convertToUIState$1.label = 5;
                        objD = d(mTicketTripInfoSnackBarType, function5, mTicketTripInfoUIStateFactory$convertToUIState$1);
                        if (objD != coroutineSingletons6) {
                            TextUIState.ChaloTextUIState chaloTextUIState11111115 = chaloTextUIState2;
                            loadingDialogUIState = loadingDialogUIStateA;
                            obj4 = objD;
                            mTicketTripInfoDataState8 = mTicketTripInfoDataState7;
                            function6 = function5;
                            toolbarUIState5 = toolbarUIState4;
                            buttonUIState3 = buttonUIState2;
                            chaloTextUIState4 = chaloTextUIState11111115;
                            snackbarUIState = (SnackbarUIState) obj4;
                            mTicketTripInfoUIStateFactory$convertToUIState$1.L$0 = mTicketTripInfoDataState8;
                            mTicketTripInfoUIStateFactory$convertToUIState$1.L$1 = function6;
                            mTicketTripInfoUIStateFactory$convertToUIState$1.L$2 = toolbarUIState5;
                            mTicketTripInfoUIStateFactory$convertToUIState$1.L$3 = buttonUIState3;
                            mTicketTripInfoUIStateFactory$convertToUIState$1.L$4 = chaloTextUIState4;
                            mTicketTripInfoUIStateFactory$convertToUIState$1.L$5 = loadingDialogUIState;
                            mTicketTripInfoUIStateFactory$convertToUIState$1.L$6 = productBookingBranding;
                            mTicketTripInfoUIStateFactory$convertToUIState$1.L$7 = snackbarUIState;
                            mTicketTripInfoUIStateFactory$convertToUIState$1.L$8 = this;
                            mTicketTripInfoUIStateFactory$convertToUIState$1.label = 6;
                            objB5 = stringProvider4.b(StringEnum.HINT_ROUTE_NUMBER, new Object[0], mTicketTripInfoUIStateFactory$convertToUIState$1);
                            if (objB5 != coroutineSingletons6) {
                                ButtonUIState buttonUIState1114 = buttonUIState3;
                                snackbarUIState2 = snackbarUIState;
                                obj5 = objB5;
                                buttonUIState4 = buttonUIState1114;
                                toolbarUIState6 = toolbarUIState5;
                                function7 = function6;
                                productBookingBranding2 = productBookingBranding;
                                loadingDialogUIState2 = loadingDialogUIState;
                                chaloTextUIState5 = chaloTextUIState4;
                                mTicketTripInfoUIStateFactory = this;
                                str = (String) obj5;
                                productBookingRouteDetails = mTicketTripInfoDataState8.b;
                                str2 = "";
                                if (productBookingRouteDetails != null) {
                                    str3 = str2;
                                } else {
                                    str3 = str2;
                                }
                                if (productBookingRouteDetails != null) {
                                    list = EmptyList.f17557a;
                                } else {
                                    list = EmptyList.f17557a;
                                }
                                if (mTicketTripInfoDataState8.i == MTicketTripInfoMissingFieldError.ROUTE) {
                                    mTicketTripInfoUIStateFactory$convertToUIState$1.L$0 = mTicketTripInfoDataState8;
                                    mTicketTripInfoUIStateFactory$convertToUIState$1.L$1 = function7;
                                    mTicketTripInfoUIStateFactory$convertToUIState$1.L$2 = toolbarUIState6;
                                    mTicketTripInfoUIStateFactory$convertToUIState$1.L$3 = buttonUIState4;
                                    mTicketTripInfoUIStateFactory$convertToUIState$1.L$4 = chaloTextUIState5;
                                    mTicketTripInfoUIStateFactory$convertToUIState$1.L$5 = loadingDialogUIState2;
                                    mTicketTripInfoUIStateFactory$convertToUIState$1.L$6 = productBookingBranding2;
                                    mTicketTripInfoUIStateFactory$convertToUIState$1.L$7 = snackbarUIState2;
                                    mTicketTripInfoUIStateFactory$convertToUIState$1.L$8 = mTicketTripInfoUIStateFactory;
                                    mTicketTripInfoUIStateFactory$convertToUIState$1.L$9 = str;
                                    mTicketTripInfoUIStateFactory$convertToUIState$1.L$10 = str3;
                                    mTicketTripInfoUIStateFactory$convertToUIState$1.L$11 = list;
                                    mTicketTripInfoUIStateFactory$convertToUIState$1.label = 7;
                                    objB6 = stringProvider4.b(StringEnum.STATUS_ERROR_ROUTE_NUMBER, new Object[0], mTicketTripInfoUIStateFactory$convertToUIState$1);
                                    if (objB6 != coroutineSingletons6) {
                                        coroutineSingletons6 = coroutineSingletons6;
                                        List list1112 = list;
                                        obj6 = objB6;
                                        list2 = list1112;
                                        String str1111116 = str3;
                                        chaloTextUIState6 = chaloTextUIState5;
                                        str5 = str1111116;
                                        str4 = (String) obj6;
                                        TextUIState.ChaloTextUIState chaloTextUIState11111116 = chaloTextUIState6;
                                        str3 = str5;
                                        chaloTextUIState5 = chaloTextUIState11111116;
                                    }
                                } else {
                                    coroutineSingletons6 = coroutineSingletons6;
                                    list2 = list;
                                    str4 = null;
                                }
                                MTicketTripInfoUIStateFactory mTicketTripInfoUIStateFactory1111110 = mTicketTripInfoUIStateFactory;
                                wg0 wg0Var11111119 = new wg0(function7, 4);
                                mTicketTripInfoUIStateFactory1111110.getClass();
                                routeSelectionInputUIStateC = c(str, str3, list2, str4, wg0Var11111119);
                                mTicketTripInfoUIStateFactory$convertToUIState$1.L$0 = mTicketTripInfoDataState8;
                                mTicketTripInfoUIStateFactory$convertToUIState$1.L$1 = function7;
                                mTicketTripInfoUIStateFactory$convertToUIState$1.L$2 = toolbarUIState6;
                                mTicketTripInfoUIStateFactory$convertToUIState$1.L$3 = buttonUIState4;
                                mTicketTripInfoUIStateFactory$convertToUIState$1.L$4 = chaloTextUIState5;
                                mTicketTripInfoUIStateFactory$convertToUIState$1.L$5 = loadingDialogUIState2;
                                mTicketTripInfoUIStateFactory$convertToUIState$1.L$6 = productBookingBranding2;
                                mTicketTripInfoUIStateFactory$convertToUIState$1.L$7 = snackbarUIState2;
                                mTicketTripInfoUIStateFactory$convertToUIState$1.L$8 = routeSelectionInputUIStateC;
                                mTicketTripInfoUIStateFactory$convertToUIState$1.L$9 = this;
                                mTicketTripInfoUIStateFactory$convertToUIState$1.L$10 = null;
                                mTicketTripInfoUIStateFactory$convertToUIState$1.L$11 = null;
                                mTicketTripInfoUIStateFactory$convertToUIState$1.label = 8;
                                objB7 = stringProvider4.b(StringEnum.HINT_START_STOP, new Object[0], mTicketTripInfoUIStateFactory$convertToUIState$1);
                                coroutineSingletons = coroutineSingletons6;
                                if (objB7 == coroutineSingletons) {
                                    return coroutineSingletons;
                                }
                                SnackbarUIState snackbarUIState111111114 = snackbarUIState2;
                                routeSelectionInputUIState = routeSelectionInputUIStateC;
                                loadingDialogUIState3 = loadingDialogUIState2;
                                productBookingBranding3 = productBookingBranding2;
                                snackbarUIState3 = snackbarUIState111111114;
                                ToolbarUIState toolbarUIState1118 = toolbarUIState6;
                                buttonUIState5 = buttonUIState4;
                                function8 = function7;
                                toolbarUIState7 = toolbarUIState1118;
                                mTicketTripInfoUIStateFactory2 = this;
                                str6 = (String) objB7;
                                productBookingStopDetails = mTicketTripInfoDataState8.c;
                                if (productBookingStopDetails != null) {
                                    str7 = str2;
                                } else {
                                    str7 = str2;
                                }
                                list3 = EmptyList.f17557a;
                                coroutineSingletons2 = coroutineSingletons;
                                if (mTicketTripInfoDataState8.i == MTicketTripInfoMissingFieldError.FROM_STOP) {
                                    mTicketTripInfoUIStateFactory$convertToUIState$1.L$0 = mTicketTripInfoDataState8;
                                    mTicketTripInfoUIStateFactory$convertToUIState$1.L$1 = function8;
                                    mTicketTripInfoUIStateFactory$convertToUIState$1.L$2 = toolbarUIState7;
                                    mTicketTripInfoUIStateFactory$convertToUIState$1.L$3 = buttonUIState5;
                                    mTicketTripInfoUIStateFactory$convertToUIState$1.L$4 = chaloTextUIState5;
                                    mTicketTripInfoUIStateFactory$convertToUIState$1.L$5 = loadingDialogUIState3;
                                    mTicketTripInfoUIStateFactory$convertToUIState$1.L$6 = productBookingBranding3;
                                    mTicketTripInfoUIStateFactory$convertToUIState$1.L$7 = snackbarUIState3;
                                    mTicketTripInfoUIStateFactory$convertToUIState$1.L$8 = routeSelectionInputUIState;
                                    mTicketTripInfoUIStateFactory$convertToUIState$1.L$9 = mTicketTripInfoUIStateFactory2;
                                    mTicketTripInfoUIStateFactory$convertToUIState$1.L$10 = str6;
                                    mTicketTripInfoUIStateFactory$convertToUIState$1.L$11 = str7;
                                    mTicketTripInfoUIStateFactory$convertToUIState$1.L$12 = list3;
                                    mTicketTripInfoUIStateFactory$convertToUIState$1.label = 9;
                                    loadingDialogUIState4 = loadingDialogUIState3;
                                    stringProvider = stringProvider4;
                                    objB8 = stringProvider.b(StringEnum.STATUS_ERROR_ENTER_STOP, new Object[0], mTicketTripInfoUIStateFactory$convertToUIState$1);
                                    coroutineSingletons3 = coroutineSingletons2;
                                    if (objB8 == coroutineSingletons3) {
                                        return coroutineSingletons3;
                                    }
                                    TextUIState.ChaloTextUIState chaloTextUIState11111117 = chaloTextUIState5;
                                    str9 = str7;
                                    obj7 = objB8;
                                    chaloTextUIState7 = chaloTextUIState11111117;
                                    SnackbarUIState snackbarUIState111111115 = snackbarUIState3;
                                    routeSelectionInputUIState2 = routeSelectionInputUIState;
                                    toolbarUIState8 = toolbarUIState7;
                                    buttonUIState6 = buttonUIState5;
                                    function9 = function8;
                                    productBookingBranding4 = productBookingBranding3;
                                    snackbarUIState4 = snackbarUIState111111115;
                                    coroutineSingletons2 = coroutineSingletons3;
                                    mTicketTripInfoUIStateFactory3 = mTicketTripInfoUIStateFactory2;
                                    str8 = (String) obj7;
                                } else {
                                    loadingDialogUIState4 = loadingDialogUIState3;
                                    stringProvider = stringProvider4;
                                    SnackbarUIState snackbarUIState111111116 = snackbarUIState3;
                                    routeSelectionInputUIState2 = routeSelectionInputUIState;
                                    toolbarUIState8 = toolbarUIState7;
                                    buttonUIState6 = buttonUIState5;
                                    function9 = function8;
                                    productBookingBranding4 = productBookingBranding3;
                                    snackbarUIState4 = snackbarUIState111111116;
                                    chaloTextUIState7 = chaloTextUIState5;
                                    mTicketTripInfoUIStateFactory3 = mTicketTripInfoUIStateFactory2;
                                    str8 = null;
                                    str9 = str7;
                                }
                                loadingDialogUIState5 = loadingDialogUIState4;
                                StringProvider stringProvider1111 = stringProvider;
                                wg0 wg0Var111111110 = new wg0(function9, 5);
                                mTicketTripInfoUIStateFactory3.getClass();
                                routeSelectionInputUIStateC2 = c(str6, str9, list3, str8, wg0Var111111110);
                                mTicketTripInfoUIStateFactory$convertToUIState$1.L$0 = mTicketTripInfoDataState8;
                                mTicketTripInfoUIStateFactory$convertToUIState$1.L$1 = function9;
                                mTicketTripInfoUIStateFactory$convertToUIState$1.L$2 = toolbarUIState8;
                                mTicketTripInfoUIStateFactory$convertToUIState$1.L$3 = buttonUIState6;
                                mTicketTripInfoUIStateFactory$convertToUIState$1.L$4 = chaloTextUIState7;
                                mTicketTripInfoUIStateFactory$convertToUIState$1.L$5 = loadingDialogUIState5;
                                mTicketTripInfoUIStateFactory$convertToUIState$1.L$6 = productBookingBranding4;
                                mTicketTripInfoUIStateFactory$convertToUIState$1.L$7 = snackbarUIState4;
                                mTicketTripInfoUIStateFactory$convertToUIState$1.L$8 = routeSelectionInputUIState2;
                                mTicketTripInfoUIStateFactory$convertToUIState$1.L$9 = routeSelectionInputUIStateC2;
                                mTicketTripInfoUIStateFactory$convertToUIState$1.L$10 = this;
                                mTicketTripInfoUIStateFactory$convertToUIState$1.L$11 = null;
                                mTicketTripInfoUIStateFactory$convertToUIState$1.L$12 = null;
                                mTicketTripInfoUIStateFactory$convertToUIState$1.label = 10;
                                stringProvider2 = stringProvider1111;
                                objB9 = stringProvider2.b(StringEnum.HINT_END_STOP, new Object[0], mTicketTripInfoUIStateFactory$convertToUIState$1);
                                coroutineSingletons4 = coroutineSingletons2;
                                if (objB9 == coroutineSingletons4) {
                                    return coroutineSingletons4;
                                }
                                loadingDialogUIState6 = loadingDialogUIState5;
                                obj8 = objB9;
                                toolbarUIState9 = toolbarUIState8;
                                routeSelectionInputUIState3 = routeSelectionInputUIStateC2;
                                mTicketTripInfoUIStateFactory4 = this;
                                str10 = (String) obj8;
                                productBookingStopDetails2 = mTicketTripInfoDataState8.d;
                                if (productBookingStopDetails2 != null) {
                                    str11 = str2;
                                } else {
                                    str11 = str2;
                                }
                                coroutineSingletons5 = coroutineSingletons4;
                                list4 = EmptyList.f17557a;
                                stringProvider3 = stringProvider2;
                                if (mTicketTripInfoDataState8.i == MTicketTripInfoMissingFieldError.TO_STOP) {
                                    mTicketTripInfoUIStateFactory$convertToUIState$1.L$0 = function9;
                                    mTicketTripInfoUIStateFactory$convertToUIState$1.L$1 = toolbarUIState9;
                                    mTicketTripInfoUIStateFactory$convertToUIState$1.L$2 = buttonUIState6;
                                    mTicketTripInfoUIStateFactory$convertToUIState$1.L$3 = chaloTextUIState7;
                                    mTicketTripInfoUIStateFactory$convertToUIState$1.L$4 = loadingDialogUIState6;
                                    mTicketTripInfoUIStateFactory$convertToUIState$1.L$5 = productBookingBranding4;
                                    mTicketTripInfoUIStateFactory$convertToUIState$1.L$6 = snackbarUIState4;
                                    mTicketTripInfoUIStateFactory$convertToUIState$1.L$7 = routeSelectionInputUIState2;
                                    mTicketTripInfoUIStateFactory$convertToUIState$1.L$8 = routeSelectionInputUIState3;
                                    mTicketTripInfoUIStateFactory$convertToUIState$1.L$9 = mTicketTripInfoUIStateFactory4;
                                    mTicketTripInfoUIStateFactory$convertToUIState$1.L$10 = str10;
                                    mTicketTripInfoUIStateFactory$convertToUIState$1.L$11 = str11;
                                    mTicketTripInfoUIStateFactory$convertToUIState$1.L$12 = list4;
                                    mTicketTripInfoUIStateFactory6 = mTicketTripInfoUIStateFactory4;
                                    mTicketTripInfoUIStateFactory$convertToUIState$1.label = 11;
                                    objB10 = stringProvider3.b(StringEnum.STATUS_ERROR_ENTER_STOP, new Object[0], mTicketTripInfoUIStateFactory$convertToUIState$1);
                                    if (objB10 == coroutineSingletons5) {
                                        return coroutineSingletons5;
                                    }
                                    chaloTextUIState9 = chaloTextUIState7;
                                    routeSelectionInputUIState6 = routeSelectionInputUIState2;
                                    productBookingBranding6 = productBookingBranding4;
                                    function10 = function9;
                                    buttonUIState7 = buttonUIState6;
                                    str13 = str10;
                                    toolbarUIState11 = toolbarUIState9;
                                    routeSelectionInputUIState7 = routeSelectionInputUIState3;
                                    snackbarUIState5 = snackbarUIState4;
                                    obj9 = objB10;
                                    loadingDialogUIState8 = loadingDialogUIState6;
                                    list5 = list4;
                                    mTicketTripInfoUIStateFactory7 = mTicketTripInfoUIStateFactory6;
                                    String str1111117 = (String) obj9;
                                    Function1 function1118 = function10;
                                    str12 = str1111117;
                                    mTicketTripInfoUIStateFactory5 = mTicketTripInfoUIStateFactory7;
                                    list4 = list5;
                                    toolbarUIState10 = toolbarUIState11;
                                    function9 = function1118;
                                    LoadingDialogUIState loadingDialogUIState1115 = loadingDialogUIState8;
                                    snackbarUIState4 = snackbarUIState5;
                                    productBookingBranding5 = productBookingBranding6;
                                    loadingDialogUIState7 = loadingDialogUIState1115;
                                    str10 = str13;
                                    routeSelectionInputUIState5 = routeSelectionInputUIState7;
                                    routeSelectionInputUIState4 = routeSelectionInputUIState6;
                                    chaloTextUIState8 = chaloTextUIState9;
                                    buttonUIState6 = buttonUIState7;
                                } else {
                                    MTicketTripInfoUIStateFactory mTicketTripInfoUIStateFactory1111111 = mTicketTripInfoUIStateFactory4;
                                    RouteSelectionInputUIState routeSelectionInputUIState1114 = routeSelectionInputUIState2;
                                    loadingDialogUIState7 = loadingDialogUIState6;
                                    toolbarUIState10 = toolbarUIState9;
                                    routeSelectionInputUIState4 = routeSelectionInputUIState1114;
                                    chaloTextUIState8 = chaloTextUIState7;
                                    routeSelectionInputUIState5 = routeSelectionInputUIState3;
                                    productBookingBranding5 = productBookingBranding4;
                                    mTicketTripInfoUIStateFactory5 = mTicketTripInfoUIStateFactory1111111;
                                    str12 = null;
                                }
                                wg0 wg0Var111111111 = new wg0(function9, 6);
                                mTicketTripInfoUIStateFactory5.getClass();
                                return new MTicketTripInfoUIState(toolbarUIState10, routeSelectionInputUIState4, routeSelectionInputUIState5, c(str10, str11, list4, str12, wg0Var111111111), buttonUIState6, chaloTextUIState8, productBookingBranding5, loadingDialogUIState7, snackbarUIState4);
                            }
                        }
                    } else {
                        mTicketTripInfoDataState8 = mTicketTripInfoDataState7;
                        function6 = function5;
                        toolbarUIState5 = toolbarUIState4;
                        buttonUIState3 = buttonUIState2;
                        chaloTextUIState4 = chaloTextUIState2;
                        loadingDialogUIState = loadingDialogUIStateA;
                        snackbarUIState = null;
                        mTicketTripInfoUIStateFactory$convertToUIState$1.L$0 = mTicketTripInfoDataState8;
                        mTicketTripInfoUIStateFactory$convertToUIState$1.L$1 = function6;
                        mTicketTripInfoUIStateFactory$convertToUIState$1.L$2 = toolbarUIState5;
                        mTicketTripInfoUIStateFactory$convertToUIState$1.L$3 = buttonUIState3;
                        mTicketTripInfoUIStateFactory$convertToUIState$1.L$4 = chaloTextUIState4;
                        mTicketTripInfoUIStateFactory$convertToUIState$1.L$5 = loadingDialogUIState;
                        mTicketTripInfoUIStateFactory$convertToUIState$1.L$6 = productBookingBranding;
                        mTicketTripInfoUIStateFactory$convertToUIState$1.L$7 = snackbarUIState;
                        mTicketTripInfoUIStateFactory$convertToUIState$1.L$8 = this;
                        mTicketTripInfoUIStateFactory$convertToUIState$1.label = 6;
                        objB5 = stringProvider4.b(StringEnum.HINT_ROUTE_NUMBER, new Object[0], mTicketTripInfoUIStateFactory$convertToUIState$1);
                        if (objB5 != coroutineSingletons6) {
                            ButtonUIState buttonUIState1115 = buttonUIState3;
                            snackbarUIState2 = snackbarUIState;
                            obj5 = objB5;
                            buttonUIState4 = buttonUIState1115;
                            toolbarUIState6 = toolbarUIState5;
                            function7 = function6;
                            productBookingBranding2 = productBookingBranding;
                            loadingDialogUIState2 = loadingDialogUIState;
                            chaloTextUIState5 = chaloTextUIState4;
                            mTicketTripInfoUIStateFactory = this;
                            str = (String) obj5;
                            productBookingRouteDetails = mTicketTripInfoDataState8.b;
                            str2 = "";
                            if (productBookingRouteDetails != null) {
                                str3 = str2;
                            } else {
                                str3 = str2;
                            }
                            if (productBookingRouteDetails != null) {
                                list = EmptyList.f17557a;
                            } else {
                                list = EmptyList.f17557a;
                            }
                            if (mTicketTripInfoDataState8.i == MTicketTripInfoMissingFieldError.ROUTE) {
                                mTicketTripInfoUIStateFactory$convertToUIState$1.L$0 = mTicketTripInfoDataState8;
                                mTicketTripInfoUIStateFactory$convertToUIState$1.L$1 = function7;
                                mTicketTripInfoUIStateFactory$convertToUIState$1.L$2 = toolbarUIState6;
                                mTicketTripInfoUIStateFactory$convertToUIState$1.L$3 = buttonUIState4;
                                mTicketTripInfoUIStateFactory$convertToUIState$1.L$4 = chaloTextUIState5;
                                mTicketTripInfoUIStateFactory$convertToUIState$1.L$5 = loadingDialogUIState2;
                                mTicketTripInfoUIStateFactory$convertToUIState$1.L$6 = productBookingBranding2;
                                mTicketTripInfoUIStateFactory$convertToUIState$1.L$7 = snackbarUIState2;
                                mTicketTripInfoUIStateFactory$convertToUIState$1.L$8 = mTicketTripInfoUIStateFactory;
                                mTicketTripInfoUIStateFactory$convertToUIState$1.L$9 = str;
                                mTicketTripInfoUIStateFactory$convertToUIState$1.L$10 = str3;
                                mTicketTripInfoUIStateFactory$convertToUIState$1.L$11 = list;
                                mTicketTripInfoUIStateFactory$convertToUIState$1.label = 7;
                                objB6 = stringProvider4.b(StringEnum.STATUS_ERROR_ROUTE_NUMBER, new Object[0], mTicketTripInfoUIStateFactory$convertToUIState$1);
                                if (objB6 != coroutineSingletons6) {
                                    coroutineSingletons6 = coroutineSingletons6;
                                    List list1113 = list;
                                    obj6 = objB6;
                                    list2 = list1113;
                                    String str1111118 = str3;
                                    chaloTextUIState6 = chaloTextUIState5;
                                    str5 = str1111118;
                                    str4 = (String) obj6;
                                    TextUIState.ChaloTextUIState chaloTextUIState11111118 = chaloTextUIState6;
                                    str3 = str5;
                                    chaloTextUIState5 = chaloTextUIState11111118;
                                }
                            } else {
                                coroutineSingletons6 = coroutineSingletons6;
                                list2 = list;
                                str4 = null;
                            }
                            MTicketTripInfoUIStateFactory mTicketTripInfoUIStateFactory1111112 = mTicketTripInfoUIStateFactory;
                            wg0 wg0Var111111112 = new wg0(function7, 4);
                            mTicketTripInfoUIStateFactory1111112.getClass();
                            routeSelectionInputUIStateC = c(str, str3, list2, str4, wg0Var111111112);
                            mTicketTripInfoUIStateFactory$convertToUIState$1.L$0 = mTicketTripInfoDataState8;
                            mTicketTripInfoUIStateFactory$convertToUIState$1.L$1 = function7;
                            mTicketTripInfoUIStateFactory$convertToUIState$1.L$2 = toolbarUIState6;
                            mTicketTripInfoUIStateFactory$convertToUIState$1.L$3 = buttonUIState4;
                            mTicketTripInfoUIStateFactory$convertToUIState$1.L$4 = chaloTextUIState5;
                            mTicketTripInfoUIStateFactory$convertToUIState$1.L$5 = loadingDialogUIState2;
                            mTicketTripInfoUIStateFactory$convertToUIState$1.L$6 = productBookingBranding2;
                            mTicketTripInfoUIStateFactory$convertToUIState$1.L$7 = snackbarUIState2;
                            mTicketTripInfoUIStateFactory$convertToUIState$1.L$8 = routeSelectionInputUIStateC;
                            mTicketTripInfoUIStateFactory$convertToUIState$1.L$9 = this;
                            mTicketTripInfoUIStateFactory$convertToUIState$1.L$10 = null;
                            mTicketTripInfoUIStateFactory$convertToUIState$1.L$11 = null;
                            mTicketTripInfoUIStateFactory$convertToUIState$1.label = 8;
                            objB7 = stringProvider4.b(StringEnum.HINT_START_STOP, new Object[0], mTicketTripInfoUIStateFactory$convertToUIState$1);
                            coroutineSingletons = coroutineSingletons6;
                            if (objB7 == coroutineSingletons) {
                                return coroutineSingletons;
                            }
                            SnackbarUIState snackbarUIState111111117 = snackbarUIState2;
                            routeSelectionInputUIState = routeSelectionInputUIStateC;
                            loadingDialogUIState3 = loadingDialogUIState2;
                            productBookingBranding3 = productBookingBranding2;
                            snackbarUIState3 = snackbarUIState111111117;
                            ToolbarUIState toolbarUIState1119 = toolbarUIState6;
                            buttonUIState5 = buttonUIState4;
                            function8 = function7;
                            toolbarUIState7 = toolbarUIState1119;
                            mTicketTripInfoUIStateFactory2 = this;
                            str6 = (String) objB7;
                            productBookingStopDetails = mTicketTripInfoDataState8.c;
                            if (productBookingStopDetails != null) {
                                str7 = str2;
                            } else {
                                str7 = str2;
                            }
                            list3 = EmptyList.f17557a;
                            coroutineSingletons2 = coroutineSingletons;
                            if (mTicketTripInfoDataState8.i == MTicketTripInfoMissingFieldError.FROM_STOP) {
                                mTicketTripInfoUIStateFactory$convertToUIState$1.L$0 = mTicketTripInfoDataState8;
                                mTicketTripInfoUIStateFactory$convertToUIState$1.L$1 = function8;
                                mTicketTripInfoUIStateFactory$convertToUIState$1.L$2 = toolbarUIState7;
                                mTicketTripInfoUIStateFactory$convertToUIState$1.L$3 = buttonUIState5;
                                mTicketTripInfoUIStateFactory$convertToUIState$1.L$4 = chaloTextUIState5;
                                mTicketTripInfoUIStateFactory$convertToUIState$1.L$5 = loadingDialogUIState3;
                                mTicketTripInfoUIStateFactory$convertToUIState$1.L$6 = productBookingBranding3;
                                mTicketTripInfoUIStateFactory$convertToUIState$1.L$7 = snackbarUIState3;
                                mTicketTripInfoUIStateFactory$convertToUIState$1.L$8 = routeSelectionInputUIState;
                                mTicketTripInfoUIStateFactory$convertToUIState$1.L$9 = mTicketTripInfoUIStateFactory2;
                                mTicketTripInfoUIStateFactory$convertToUIState$1.L$10 = str6;
                                mTicketTripInfoUIStateFactory$convertToUIState$1.L$11 = str7;
                                mTicketTripInfoUIStateFactory$convertToUIState$1.L$12 = list3;
                                mTicketTripInfoUIStateFactory$convertToUIState$1.label = 9;
                                loadingDialogUIState4 = loadingDialogUIState3;
                                stringProvider = stringProvider4;
                                objB8 = stringProvider.b(StringEnum.STATUS_ERROR_ENTER_STOP, new Object[0], mTicketTripInfoUIStateFactory$convertToUIState$1);
                                coroutineSingletons3 = coroutineSingletons2;
                                if (objB8 == coroutineSingletons3) {
                                    return coroutineSingletons3;
                                }
                                TextUIState.ChaloTextUIState chaloTextUIState11111119 = chaloTextUIState5;
                                str9 = str7;
                                obj7 = objB8;
                                chaloTextUIState7 = chaloTextUIState11111119;
                                SnackbarUIState snackbarUIState111111118 = snackbarUIState3;
                                routeSelectionInputUIState2 = routeSelectionInputUIState;
                                toolbarUIState8 = toolbarUIState7;
                                buttonUIState6 = buttonUIState5;
                                function9 = function8;
                                productBookingBranding4 = productBookingBranding3;
                                snackbarUIState4 = snackbarUIState111111118;
                                coroutineSingletons2 = coroutineSingletons3;
                                mTicketTripInfoUIStateFactory3 = mTicketTripInfoUIStateFactory2;
                                str8 = (String) obj7;
                            } else {
                                loadingDialogUIState4 = loadingDialogUIState3;
                                stringProvider = stringProvider4;
                                SnackbarUIState snackbarUIState111111119 = snackbarUIState3;
                                routeSelectionInputUIState2 = routeSelectionInputUIState;
                                toolbarUIState8 = toolbarUIState7;
                                buttonUIState6 = buttonUIState5;
                                function9 = function8;
                                productBookingBranding4 = productBookingBranding3;
                                snackbarUIState4 = snackbarUIState111111119;
                                chaloTextUIState7 = chaloTextUIState5;
                                mTicketTripInfoUIStateFactory3 = mTicketTripInfoUIStateFactory2;
                                str8 = null;
                                str9 = str7;
                            }
                            loadingDialogUIState5 = loadingDialogUIState4;
                            StringProvider stringProvider1112 = stringProvider;
                            wg0 wg0Var111111113 = new wg0(function9, 5);
                            mTicketTripInfoUIStateFactory3.getClass();
                            routeSelectionInputUIStateC2 = c(str6, str9, list3, str8, wg0Var111111113);
                            mTicketTripInfoUIStateFactory$convertToUIState$1.L$0 = mTicketTripInfoDataState8;
                            mTicketTripInfoUIStateFactory$convertToUIState$1.L$1 = function9;
                            mTicketTripInfoUIStateFactory$convertToUIState$1.L$2 = toolbarUIState8;
                            mTicketTripInfoUIStateFactory$convertToUIState$1.L$3 = buttonUIState6;
                            mTicketTripInfoUIStateFactory$convertToUIState$1.L$4 = chaloTextUIState7;
                            mTicketTripInfoUIStateFactory$convertToUIState$1.L$5 = loadingDialogUIState5;
                            mTicketTripInfoUIStateFactory$convertToUIState$1.L$6 = productBookingBranding4;
                            mTicketTripInfoUIStateFactory$convertToUIState$1.L$7 = snackbarUIState4;
                            mTicketTripInfoUIStateFactory$convertToUIState$1.L$8 = routeSelectionInputUIState2;
                            mTicketTripInfoUIStateFactory$convertToUIState$1.L$9 = routeSelectionInputUIStateC2;
                            mTicketTripInfoUIStateFactory$convertToUIState$1.L$10 = this;
                            mTicketTripInfoUIStateFactory$convertToUIState$1.L$11 = null;
                            mTicketTripInfoUIStateFactory$convertToUIState$1.L$12 = null;
                            mTicketTripInfoUIStateFactory$convertToUIState$1.label = 10;
                            stringProvider2 = stringProvider1112;
                            objB9 = stringProvider2.b(StringEnum.HINT_END_STOP, new Object[0], mTicketTripInfoUIStateFactory$convertToUIState$1);
                            coroutineSingletons4 = coroutineSingletons2;
                            if (objB9 == coroutineSingletons4) {
                                return coroutineSingletons4;
                            }
                            loadingDialogUIState6 = loadingDialogUIState5;
                            obj8 = objB9;
                            toolbarUIState9 = toolbarUIState8;
                            routeSelectionInputUIState3 = routeSelectionInputUIStateC2;
                            mTicketTripInfoUIStateFactory4 = this;
                            str10 = (String) obj8;
                            productBookingStopDetails2 = mTicketTripInfoDataState8.d;
                            if (productBookingStopDetails2 != null) {
                                str11 = str2;
                            } else {
                                str11 = str2;
                            }
                            coroutineSingletons5 = coroutineSingletons4;
                            list4 = EmptyList.f17557a;
                            stringProvider3 = stringProvider2;
                            if (mTicketTripInfoDataState8.i == MTicketTripInfoMissingFieldError.TO_STOP) {
                                mTicketTripInfoUIStateFactory$convertToUIState$1.L$0 = function9;
                                mTicketTripInfoUIStateFactory$convertToUIState$1.L$1 = toolbarUIState9;
                                mTicketTripInfoUIStateFactory$convertToUIState$1.L$2 = buttonUIState6;
                                mTicketTripInfoUIStateFactory$convertToUIState$1.L$3 = chaloTextUIState7;
                                mTicketTripInfoUIStateFactory$convertToUIState$1.L$4 = loadingDialogUIState6;
                                mTicketTripInfoUIStateFactory$convertToUIState$1.L$5 = productBookingBranding4;
                                mTicketTripInfoUIStateFactory$convertToUIState$1.L$6 = snackbarUIState4;
                                mTicketTripInfoUIStateFactory$convertToUIState$1.L$7 = routeSelectionInputUIState2;
                                mTicketTripInfoUIStateFactory$convertToUIState$1.L$8 = routeSelectionInputUIState3;
                                mTicketTripInfoUIStateFactory$convertToUIState$1.L$9 = mTicketTripInfoUIStateFactory4;
                                mTicketTripInfoUIStateFactory$convertToUIState$1.L$10 = str10;
                                mTicketTripInfoUIStateFactory$convertToUIState$1.L$11 = str11;
                                mTicketTripInfoUIStateFactory$convertToUIState$1.L$12 = list4;
                                mTicketTripInfoUIStateFactory6 = mTicketTripInfoUIStateFactory4;
                                mTicketTripInfoUIStateFactory$convertToUIState$1.label = 11;
                                objB10 = stringProvider3.b(StringEnum.STATUS_ERROR_ENTER_STOP, new Object[0], mTicketTripInfoUIStateFactory$convertToUIState$1);
                                if (objB10 == coroutineSingletons5) {
                                    return coroutineSingletons5;
                                }
                                chaloTextUIState9 = chaloTextUIState7;
                                routeSelectionInputUIState6 = routeSelectionInputUIState2;
                                productBookingBranding6 = productBookingBranding4;
                                function10 = function9;
                                buttonUIState7 = buttonUIState6;
                                str13 = str10;
                                toolbarUIState11 = toolbarUIState9;
                                routeSelectionInputUIState7 = routeSelectionInputUIState3;
                                snackbarUIState5 = snackbarUIState4;
                                obj9 = objB10;
                                loadingDialogUIState8 = loadingDialogUIState6;
                                list5 = list4;
                                mTicketTripInfoUIStateFactory7 = mTicketTripInfoUIStateFactory6;
                                String str1111119 = (String) obj9;
                                Function1 function1119 = function10;
                                str12 = str1111119;
                                mTicketTripInfoUIStateFactory5 = mTicketTripInfoUIStateFactory7;
                                list4 = list5;
                                toolbarUIState10 = toolbarUIState11;
                                function9 = function1119;
                                LoadingDialogUIState loadingDialogUIState1116 = loadingDialogUIState8;
                                snackbarUIState4 = snackbarUIState5;
                                productBookingBranding5 = productBookingBranding6;
                                loadingDialogUIState7 = loadingDialogUIState1116;
                                str10 = str13;
                                routeSelectionInputUIState5 = routeSelectionInputUIState7;
                                routeSelectionInputUIState4 = routeSelectionInputUIState6;
                                chaloTextUIState8 = chaloTextUIState9;
                                buttonUIState6 = buttonUIState7;
                            } else {
                                MTicketTripInfoUIStateFactory mTicketTripInfoUIStateFactory1111113 = mTicketTripInfoUIStateFactory4;
                                RouteSelectionInputUIState routeSelectionInputUIState1115 = routeSelectionInputUIState2;
                                loadingDialogUIState7 = loadingDialogUIState6;
                                toolbarUIState10 = toolbarUIState9;
                                routeSelectionInputUIState4 = routeSelectionInputUIState1115;
                                chaloTextUIState8 = chaloTextUIState7;
                                routeSelectionInputUIState5 = routeSelectionInputUIState3;
                                productBookingBranding5 = productBookingBranding4;
                                mTicketTripInfoUIStateFactory5 = mTicketTripInfoUIStateFactory1111113;
                                str12 = null;
                            }
                            wg0 wg0Var111111114 = new wg0(function9, 6);
                            mTicketTripInfoUIStateFactory5.getClass();
                            return new MTicketTripInfoUIState(toolbarUIState10, routeSelectionInputUIState4, routeSelectionInputUIState5, c(str10, str11, list4, str12, wg0Var111111114), buttonUIState6, chaloTextUIState8, productBookingBranding5, loadingDialogUIState7, snackbarUIState4);
                        }
                    }
                }
                coroutineSingletons6 = coroutineSingletons6;
                return coroutineSingletons6;
            case 4:
                obj3 = obj9;
                dialogUIStateFactory2 = (DialogUIStateFactory) mTicketTripInfoUIStateFactory$convertToUIState$1.L$5;
                chaloTextUIState3 = (TextUIState.ChaloTextUIState) mTicketTripInfoUIStateFactory$convertToUIState$1.L$4;
                buttonUIState = (ButtonUIState) mTicketTripInfoUIStateFactory$convertToUIState$1.L$3;
                toolbarUIState3 = (ToolbarUIState) mTicketTripInfoUIStateFactory$convertToUIState$1.L$2;
                function4 = (Function1) mTicketTripInfoUIStateFactory$convertToUIState$1.L$1;
                mTicketTripInfoDataState5 = (MTicketTripInfoDataState) mTicketTripInfoUIStateFactory$convertToUIState$1.L$0;
                ResultKt.b(obj3);
                dialogUIStateFactory2.getClass();
                loadingDialogUIStateA = DialogUIStateFactory.a((String) obj3);
                mTicketTripInfoDataState7 = mTicketTripInfoDataState5;
                function5 = function4;
                toolbarUIState4 = toolbarUIState3;
                buttonUIState2 = buttonUIState;
                chaloTextUIState2 = chaloTextUIState3;
                productBookingBranding = mTicketTripInfoDataState7.g;
                mTicketTripInfoSnackBarType = mTicketTripInfoDataState7.e;
                if (mTicketTripInfoSnackBarType != null) {
                    mTicketTripInfoUIStateFactory$convertToUIState$1.L$0 = mTicketTripInfoDataState7;
                    mTicketTripInfoUIStateFactory$convertToUIState$1.L$1 = function5;
                    mTicketTripInfoUIStateFactory$convertToUIState$1.L$2 = toolbarUIState4;
                    mTicketTripInfoUIStateFactory$convertToUIState$1.L$3 = buttonUIState2;
                    mTicketTripInfoUIStateFactory$convertToUIState$1.L$4 = chaloTextUIState2;
                    mTicketTripInfoUIStateFactory$convertToUIState$1.L$5 = loadingDialogUIStateA;
                    mTicketTripInfoUIStateFactory$convertToUIState$1.L$6 = productBookingBranding;
                    mTicketTripInfoUIStateFactory$convertToUIState$1.label = 5;
                    objD = d(mTicketTripInfoSnackBarType, function5, mTicketTripInfoUIStateFactory$convertToUIState$1);
                    if (objD != coroutineSingletons6) {
                        TextUIState.ChaloTextUIState chaloTextUIState111111110 = chaloTextUIState2;
                        loadingDialogUIState = loadingDialogUIStateA;
                        obj4 = objD;
                        mTicketTripInfoDataState8 = mTicketTripInfoDataState7;
                        function6 = function5;
                        toolbarUIState5 = toolbarUIState4;
                        buttonUIState3 = buttonUIState2;
                        chaloTextUIState4 = chaloTextUIState111111110;
                        snackbarUIState = (SnackbarUIState) obj4;
                        mTicketTripInfoUIStateFactory$convertToUIState$1.L$0 = mTicketTripInfoDataState8;
                        mTicketTripInfoUIStateFactory$convertToUIState$1.L$1 = function6;
                        mTicketTripInfoUIStateFactory$convertToUIState$1.L$2 = toolbarUIState5;
                        mTicketTripInfoUIStateFactory$convertToUIState$1.L$3 = buttonUIState3;
                        mTicketTripInfoUIStateFactory$convertToUIState$1.L$4 = chaloTextUIState4;
                        mTicketTripInfoUIStateFactory$convertToUIState$1.L$5 = loadingDialogUIState;
                        mTicketTripInfoUIStateFactory$convertToUIState$1.L$6 = productBookingBranding;
                        mTicketTripInfoUIStateFactory$convertToUIState$1.L$7 = snackbarUIState;
                        mTicketTripInfoUIStateFactory$convertToUIState$1.L$8 = this;
                        mTicketTripInfoUIStateFactory$convertToUIState$1.label = 6;
                        objB5 = stringProvider4.b(StringEnum.HINT_ROUTE_NUMBER, new Object[0], mTicketTripInfoUIStateFactory$convertToUIState$1);
                        if (objB5 != coroutineSingletons6) {
                            ButtonUIState buttonUIState1116 = buttonUIState3;
                            snackbarUIState2 = snackbarUIState;
                            obj5 = objB5;
                            buttonUIState4 = buttonUIState1116;
                            toolbarUIState6 = toolbarUIState5;
                            function7 = function6;
                            productBookingBranding2 = productBookingBranding;
                            loadingDialogUIState2 = loadingDialogUIState;
                            chaloTextUIState5 = chaloTextUIState4;
                            mTicketTripInfoUIStateFactory = this;
                            str = (String) obj5;
                            productBookingRouteDetails = mTicketTripInfoDataState8.b;
                            str2 = "";
                            if (productBookingRouteDetails != null) {
                                str3 = str2;
                            } else {
                                str3 = str2;
                            }
                            if (productBookingRouteDetails != null) {
                                list = EmptyList.f17557a;
                            } else {
                                list = EmptyList.f17557a;
                            }
                            if (mTicketTripInfoDataState8.i == MTicketTripInfoMissingFieldError.ROUTE) {
                                mTicketTripInfoUIStateFactory$convertToUIState$1.L$0 = mTicketTripInfoDataState8;
                                mTicketTripInfoUIStateFactory$convertToUIState$1.L$1 = function7;
                                mTicketTripInfoUIStateFactory$convertToUIState$1.L$2 = toolbarUIState6;
                                mTicketTripInfoUIStateFactory$convertToUIState$1.L$3 = buttonUIState4;
                                mTicketTripInfoUIStateFactory$convertToUIState$1.L$4 = chaloTextUIState5;
                                mTicketTripInfoUIStateFactory$convertToUIState$1.L$5 = loadingDialogUIState2;
                                mTicketTripInfoUIStateFactory$convertToUIState$1.L$6 = productBookingBranding2;
                                mTicketTripInfoUIStateFactory$convertToUIState$1.L$7 = snackbarUIState2;
                                mTicketTripInfoUIStateFactory$convertToUIState$1.L$8 = mTicketTripInfoUIStateFactory;
                                mTicketTripInfoUIStateFactory$convertToUIState$1.L$9 = str;
                                mTicketTripInfoUIStateFactory$convertToUIState$1.L$10 = str3;
                                mTicketTripInfoUIStateFactory$convertToUIState$1.L$11 = list;
                                mTicketTripInfoUIStateFactory$convertToUIState$1.label = 7;
                                objB6 = stringProvider4.b(StringEnum.STATUS_ERROR_ROUTE_NUMBER, new Object[0], mTicketTripInfoUIStateFactory$convertToUIState$1);
                                if (objB6 != coroutineSingletons6) {
                                    coroutineSingletons6 = coroutineSingletons6;
                                    List list1114 = list;
                                    obj6 = objB6;
                                    list2 = list1114;
                                    String str11111110 = str3;
                                    chaloTextUIState6 = chaloTextUIState5;
                                    str5 = str11111110;
                                    str4 = (String) obj6;
                                    TextUIState.ChaloTextUIState chaloTextUIState111111111 = chaloTextUIState6;
                                    str3 = str5;
                                    chaloTextUIState5 = chaloTextUIState111111111;
                                }
                            } else {
                                coroutineSingletons6 = coroutineSingletons6;
                                list2 = list;
                                str4 = null;
                            }
                            MTicketTripInfoUIStateFactory mTicketTripInfoUIStateFactory1111114 = mTicketTripInfoUIStateFactory;
                            wg0 wg0Var111111115 = new wg0(function7, 4);
                            mTicketTripInfoUIStateFactory1111114.getClass();
                            routeSelectionInputUIStateC = c(str, str3, list2, str4, wg0Var111111115);
                            mTicketTripInfoUIStateFactory$convertToUIState$1.L$0 = mTicketTripInfoDataState8;
                            mTicketTripInfoUIStateFactory$convertToUIState$1.L$1 = function7;
                            mTicketTripInfoUIStateFactory$convertToUIState$1.L$2 = toolbarUIState6;
                            mTicketTripInfoUIStateFactory$convertToUIState$1.L$3 = buttonUIState4;
                            mTicketTripInfoUIStateFactory$convertToUIState$1.L$4 = chaloTextUIState5;
                            mTicketTripInfoUIStateFactory$convertToUIState$1.L$5 = loadingDialogUIState2;
                            mTicketTripInfoUIStateFactory$convertToUIState$1.L$6 = productBookingBranding2;
                            mTicketTripInfoUIStateFactory$convertToUIState$1.L$7 = snackbarUIState2;
                            mTicketTripInfoUIStateFactory$convertToUIState$1.L$8 = routeSelectionInputUIStateC;
                            mTicketTripInfoUIStateFactory$convertToUIState$1.L$9 = this;
                            mTicketTripInfoUIStateFactory$convertToUIState$1.L$10 = null;
                            mTicketTripInfoUIStateFactory$convertToUIState$1.L$11 = null;
                            mTicketTripInfoUIStateFactory$convertToUIState$1.label = 8;
                            objB7 = stringProvider4.b(StringEnum.HINT_START_STOP, new Object[0], mTicketTripInfoUIStateFactory$convertToUIState$1);
                            coroutineSingletons = coroutineSingletons6;
                            if (objB7 == coroutineSingletons) {
                                return coroutineSingletons;
                            }
                            SnackbarUIState snackbarUIState1111111110 = snackbarUIState2;
                            routeSelectionInputUIState = routeSelectionInputUIStateC;
                            loadingDialogUIState3 = loadingDialogUIState2;
                            productBookingBranding3 = productBookingBranding2;
                            snackbarUIState3 = snackbarUIState1111111110;
                            ToolbarUIState toolbarUIState11110 = toolbarUIState6;
                            buttonUIState5 = buttonUIState4;
                            function8 = function7;
                            toolbarUIState7 = toolbarUIState11110;
                            mTicketTripInfoUIStateFactory2 = this;
                            str6 = (String) objB7;
                            productBookingStopDetails = mTicketTripInfoDataState8.c;
                            if (productBookingStopDetails != null) {
                                str7 = str2;
                            } else {
                                str7 = str2;
                            }
                            list3 = EmptyList.f17557a;
                            coroutineSingletons2 = coroutineSingletons;
                            if (mTicketTripInfoDataState8.i == MTicketTripInfoMissingFieldError.FROM_STOP) {
                                mTicketTripInfoUIStateFactory$convertToUIState$1.L$0 = mTicketTripInfoDataState8;
                                mTicketTripInfoUIStateFactory$convertToUIState$1.L$1 = function8;
                                mTicketTripInfoUIStateFactory$convertToUIState$1.L$2 = toolbarUIState7;
                                mTicketTripInfoUIStateFactory$convertToUIState$1.L$3 = buttonUIState5;
                                mTicketTripInfoUIStateFactory$convertToUIState$1.L$4 = chaloTextUIState5;
                                mTicketTripInfoUIStateFactory$convertToUIState$1.L$5 = loadingDialogUIState3;
                                mTicketTripInfoUIStateFactory$convertToUIState$1.L$6 = productBookingBranding3;
                                mTicketTripInfoUIStateFactory$convertToUIState$1.L$7 = snackbarUIState3;
                                mTicketTripInfoUIStateFactory$convertToUIState$1.L$8 = routeSelectionInputUIState;
                                mTicketTripInfoUIStateFactory$convertToUIState$1.L$9 = mTicketTripInfoUIStateFactory2;
                                mTicketTripInfoUIStateFactory$convertToUIState$1.L$10 = str6;
                                mTicketTripInfoUIStateFactory$convertToUIState$1.L$11 = str7;
                                mTicketTripInfoUIStateFactory$convertToUIState$1.L$12 = list3;
                                mTicketTripInfoUIStateFactory$convertToUIState$1.label = 9;
                                loadingDialogUIState4 = loadingDialogUIState3;
                                stringProvider = stringProvider4;
                                objB8 = stringProvider.b(StringEnum.STATUS_ERROR_ENTER_STOP, new Object[0], mTicketTripInfoUIStateFactory$convertToUIState$1);
                                coroutineSingletons3 = coroutineSingletons2;
                                if (objB8 == coroutineSingletons3) {
                                    return coroutineSingletons3;
                                }
                                TextUIState.ChaloTextUIState chaloTextUIState111111112 = chaloTextUIState5;
                                str9 = str7;
                                obj7 = objB8;
                                chaloTextUIState7 = chaloTextUIState111111112;
                                SnackbarUIState snackbarUIState1111111111 = snackbarUIState3;
                                routeSelectionInputUIState2 = routeSelectionInputUIState;
                                toolbarUIState8 = toolbarUIState7;
                                buttonUIState6 = buttonUIState5;
                                function9 = function8;
                                productBookingBranding4 = productBookingBranding3;
                                snackbarUIState4 = snackbarUIState1111111111;
                                coroutineSingletons2 = coroutineSingletons3;
                                mTicketTripInfoUIStateFactory3 = mTicketTripInfoUIStateFactory2;
                                str8 = (String) obj7;
                            } else {
                                loadingDialogUIState4 = loadingDialogUIState3;
                                stringProvider = stringProvider4;
                                SnackbarUIState snackbarUIState1111111112 = snackbarUIState3;
                                routeSelectionInputUIState2 = routeSelectionInputUIState;
                                toolbarUIState8 = toolbarUIState7;
                                buttonUIState6 = buttonUIState5;
                                function9 = function8;
                                productBookingBranding4 = productBookingBranding3;
                                snackbarUIState4 = snackbarUIState1111111112;
                                chaloTextUIState7 = chaloTextUIState5;
                                mTicketTripInfoUIStateFactory3 = mTicketTripInfoUIStateFactory2;
                                str8 = null;
                                str9 = str7;
                            }
                            loadingDialogUIState5 = loadingDialogUIState4;
                            StringProvider stringProvider1113 = stringProvider;
                            wg0 wg0Var111111116 = new wg0(function9, 5);
                            mTicketTripInfoUIStateFactory3.getClass();
                            routeSelectionInputUIStateC2 = c(str6, str9, list3, str8, wg0Var111111116);
                            mTicketTripInfoUIStateFactory$convertToUIState$1.L$0 = mTicketTripInfoDataState8;
                            mTicketTripInfoUIStateFactory$convertToUIState$1.L$1 = function9;
                            mTicketTripInfoUIStateFactory$convertToUIState$1.L$2 = toolbarUIState8;
                            mTicketTripInfoUIStateFactory$convertToUIState$1.L$3 = buttonUIState6;
                            mTicketTripInfoUIStateFactory$convertToUIState$1.L$4 = chaloTextUIState7;
                            mTicketTripInfoUIStateFactory$convertToUIState$1.L$5 = loadingDialogUIState5;
                            mTicketTripInfoUIStateFactory$convertToUIState$1.L$6 = productBookingBranding4;
                            mTicketTripInfoUIStateFactory$convertToUIState$1.L$7 = snackbarUIState4;
                            mTicketTripInfoUIStateFactory$convertToUIState$1.L$8 = routeSelectionInputUIState2;
                            mTicketTripInfoUIStateFactory$convertToUIState$1.L$9 = routeSelectionInputUIStateC2;
                            mTicketTripInfoUIStateFactory$convertToUIState$1.L$10 = this;
                            mTicketTripInfoUIStateFactory$convertToUIState$1.L$11 = null;
                            mTicketTripInfoUIStateFactory$convertToUIState$1.L$12 = null;
                            mTicketTripInfoUIStateFactory$convertToUIState$1.label = 10;
                            stringProvider2 = stringProvider1113;
                            objB9 = stringProvider2.b(StringEnum.HINT_END_STOP, new Object[0], mTicketTripInfoUIStateFactory$convertToUIState$1);
                            coroutineSingletons4 = coroutineSingletons2;
                            if (objB9 == coroutineSingletons4) {
                                return coroutineSingletons4;
                            }
                            loadingDialogUIState6 = loadingDialogUIState5;
                            obj8 = objB9;
                            toolbarUIState9 = toolbarUIState8;
                            routeSelectionInputUIState3 = routeSelectionInputUIStateC2;
                            mTicketTripInfoUIStateFactory4 = this;
                            str10 = (String) obj8;
                            productBookingStopDetails2 = mTicketTripInfoDataState8.d;
                            if (productBookingStopDetails2 != null) {
                                str11 = str2;
                            } else {
                                str11 = str2;
                            }
                            coroutineSingletons5 = coroutineSingletons4;
                            list4 = EmptyList.f17557a;
                            stringProvider3 = stringProvider2;
                            if (mTicketTripInfoDataState8.i == MTicketTripInfoMissingFieldError.TO_STOP) {
                                mTicketTripInfoUIStateFactory$convertToUIState$1.L$0 = function9;
                                mTicketTripInfoUIStateFactory$convertToUIState$1.L$1 = toolbarUIState9;
                                mTicketTripInfoUIStateFactory$convertToUIState$1.L$2 = buttonUIState6;
                                mTicketTripInfoUIStateFactory$convertToUIState$1.L$3 = chaloTextUIState7;
                                mTicketTripInfoUIStateFactory$convertToUIState$1.L$4 = loadingDialogUIState6;
                                mTicketTripInfoUIStateFactory$convertToUIState$1.L$5 = productBookingBranding4;
                                mTicketTripInfoUIStateFactory$convertToUIState$1.L$6 = snackbarUIState4;
                                mTicketTripInfoUIStateFactory$convertToUIState$1.L$7 = routeSelectionInputUIState2;
                                mTicketTripInfoUIStateFactory$convertToUIState$1.L$8 = routeSelectionInputUIState3;
                                mTicketTripInfoUIStateFactory$convertToUIState$1.L$9 = mTicketTripInfoUIStateFactory4;
                                mTicketTripInfoUIStateFactory$convertToUIState$1.L$10 = str10;
                                mTicketTripInfoUIStateFactory$convertToUIState$1.L$11 = str11;
                                mTicketTripInfoUIStateFactory$convertToUIState$1.L$12 = list4;
                                mTicketTripInfoUIStateFactory6 = mTicketTripInfoUIStateFactory4;
                                mTicketTripInfoUIStateFactory$convertToUIState$1.label = 11;
                                objB10 = stringProvider3.b(StringEnum.STATUS_ERROR_ENTER_STOP, new Object[0], mTicketTripInfoUIStateFactory$convertToUIState$1);
                                if (objB10 == coroutineSingletons5) {
                                    return coroutineSingletons5;
                                }
                                chaloTextUIState9 = chaloTextUIState7;
                                routeSelectionInputUIState6 = routeSelectionInputUIState2;
                                productBookingBranding6 = productBookingBranding4;
                                function10 = function9;
                                buttonUIState7 = buttonUIState6;
                                str13 = str10;
                                toolbarUIState11 = toolbarUIState9;
                                routeSelectionInputUIState7 = routeSelectionInputUIState3;
                                snackbarUIState5 = snackbarUIState4;
                                obj9 = objB10;
                                loadingDialogUIState8 = loadingDialogUIState6;
                                list5 = list4;
                                mTicketTripInfoUIStateFactory7 = mTicketTripInfoUIStateFactory6;
                                String str11111111 = (String) obj9;
                                Function1 function11110 = function10;
                                str12 = str11111111;
                                mTicketTripInfoUIStateFactory5 = mTicketTripInfoUIStateFactory7;
                                list4 = list5;
                                toolbarUIState10 = toolbarUIState11;
                                function9 = function11110;
                                LoadingDialogUIState loadingDialogUIState1117 = loadingDialogUIState8;
                                snackbarUIState4 = snackbarUIState5;
                                productBookingBranding5 = productBookingBranding6;
                                loadingDialogUIState7 = loadingDialogUIState1117;
                                str10 = str13;
                                routeSelectionInputUIState5 = routeSelectionInputUIState7;
                                routeSelectionInputUIState4 = routeSelectionInputUIState6;
                                chaloTextUIState8 = chaloTextUIState9;
                                buttonUIState6 = buttonUIState7;
                            } else {
                                MTicketTripInfoUIStateFactory mTicketTripInfoUIStateFactory1111115 = mTicketTripInfoUIStateFactory4;
                                RouteSelectionInputUIState routeSelectionInputUIState1116 = routeSelectionInputUIState2;
                                loadingDialogUIState7 = loadingDialogUIState6;
                                toolbarUIState10 = toolbarUIState9;
                                routeSelectionInputUIState4 = routeSelectionInputUIState1116;
                                chaloTextUIState8 = chaloTextUIState7;
                                routeSelectionInputUIState5 = routeSelectionInputUIState3;
                                productBookingBranding5 = productBookingBranding4;
                                mTicketTripInfoUIStateFactory5 = mTicketTripInfoUIStateFactory1111115;
                                str12 = null;
                            }
                            wg0 wg0Var111111117 = new wg0(function9, 6);
                            mTicketTripInfoUIStateFactory5.getClass();
                            return new MTicketTripInfoUIState(toolbarUIState10, routeSelectionInputUIState4, routeSelectionInputUIState5, c(str10, str11, list4, str12, wg0Var111111117), buttonUIState6, chaloTextUIState8, productBookingBranding5, loadingDialogUIState7, snackbarUIState4);
                        }
                    }
                } else {
                    mTicketTripInfoDataState8 = mTicketTripInfoDataState7;
                    function6 = function5;
                    toolbarUIState5 = toolbarUIState4;
                    buttonUIState3 = buttonUIState2;
                    chaloTextUIState4 = chaloTextUIState2;
                    loadingDialogUIState = loadingDialogUIStateA;
                    snackbarUIState = null;
                    mTicketTripInfoUIStateFactory$convertToUIState$1.L$0 = mTicketTripInfoDataState8;
                    mTicketTripInfoUIStateFactory$convertToUIState$1.L$1 = function6;
                    mTicketTripInfoUIStateFactory$convertToUIState$1.L$2 = toolbarUIState5;
                    mTicketTripInfoUIStateFactory$convertToUIState$1.L$3 = buttonUIState3;
                    mTicketTripInfoUIStateFactory$convertToUIState$1.L$4 = chaloTextUIState4;
                    mTicketTripInfoUIStateFactory$convertToUIState$1.L$5 = loadingDialogUIState;
                    mTicketTripInfoUIStateFactory$convertToUIState$1.L$6 = productBookingBranding;
                    mTicketTripInfoUIStateFactory$convertToUIState$1.L$7 = snackbarUIState;
                    mTicketTripInfoUIStateFactory$convertToUIState$1.L$8 = this;
                    mTicketTripInfoUIStateFactory$convertToUIState$1.label = 6;
                    objB5 = stringProvider4.b(StringEnum.HINT_ROUTE_NUMBER, new Object[0], mTicketTripInfoUIStateFactory$convertToUIState$1);
                    if (objB5 != coroutineSingletons6) {
                        ButtonUIState buttonUIState1117 = buttonUIState3;
                        snackbarUIState2 = snackbarUIState;
                        obj5 = objB5;
                        buttonUIState4 = buttonUIState1117;
                        toolbarUIState6 = toolbarUIState5;
                        function7 = function6;
                        productBookingBranding2 = productBookingBranding;
                        loadingDialogUIState2 = loadingDialogUIState;
                        chaloTextUIState5 = chaloTextUIState4;
                        mTicketTripInfoUIStateFactory = this;
                        str = (String) obj5;
                        productBookingRouteDetails = mTicketTripInfoDataState8.b;
                        str2 = "";
                        if (productBookingRouteDetails != null) {
                            str3 = str2;
                        } else {
                            str3 = str2;
                        }
                        if (productBookingRouteDetails != null) {
                            list = EmptyList.f17557a;
                        } else {
                            list = EmptyList.f17557a;
                        }
                        if (mTicketTripInfoDataState8.i == MTicketTripInfoMissingFieldError.ROUTE) {
                            mTicketTripInfoUIStateFactory$convertToUIState$1.L$0 = mTicketTripInfoDataState8;
                            mTicketTripInfoUIStateFactory$convertToUIState$1.L$1 = function7;
                            mTicketTripInfoUIStateFactory$convertToUIState$1.L$2 = toolbarUIState6;
                            mTicketTripInfoUIStateFactory$convertToUIState$1.L$3 = buttonUIState4;
                            mTicketTripInfoUIStateFactory$convertToUIState$1.L$4 = chaloTextUIState5;
                            mTicketTripInfoUIStateFactory$convertToUIState$1.L$5 = loadingDialogUIState2;
                            mTicketTripInfoUIStateFactory$convertToUIState$1.L$6 = productBookingBranding2;
                            mTicketTripInfoUIStateFactory$convertToUIState$1.L$7 = snackbarUIState2;
                            mTicketTripInfoUIStateFactory$convertToUIState$1.L$8 = mTicketTripInfoUIStateFactory;
                            mTicketTripInfoUIStateFactory$convertToUIState$1.L$9 = str;
                            mTicketTripInfoUIStateFactory$convertToUIState$1.L$10 = str3;
                            mTicketTripInfoUIStateFactory$convertToUIState$1.L$11 = list;
                            mTicketTripInfoUIStateFactory$convertToUIState$1.label = 7;
                            objB6 = stringProvider4.b(StringEnum.STATUS_ERROR_ROUTE_NUMBER, new Object[0], mTicketTripInfoUIStateFactory$convertToUIState$1);
                            if (objB6 != coroutineSingletons6) {
                                coroutineSingletons6 = coroutineSingletons6;
                                List list1115 = list;
                                obj6 = objB6;
                                list2 = list1115;
                                String str11111112 = str3;
                                chaloTextUIState6 = chaloTextUIState5;
                                str5 = str11111112;
                                str4 = (String) obj6;
                                TextUIState.ChaloTextUIState chaloTextUIState111111113 = chaloTextUIState6;
                                str3 = str5;
                                chaloTextUIState5 = chaloTextUIState111111113;
                            }
                        } else {
                            coroutineSingletons6 = coroutineSingletons6;
                            list2 = list;
                            str4 = null;
                        }
                        MTicketTripInfoUIStateFactory mTicketTripInfoUIStateFactory1111116 = mTicketTripInfoUIStateFactory;
                        wg0 wg0Var111111118 = new wg0(function7, 4);
                        mTicketTripInfoUIStateFactory1111116.getClass();
                        routeSelectionInputUIStateC = c(str, str3, list2, str4, wg0Var111111118);
                        mTicketTripInfoUIStateFactory$convertToUIState$1.L$0 = mTicketTripInfoDataState8;
                        mTicketTripInfoUIStateFactory$convertToUIState$1.L$1 = function7;
                        mTicketTripInfoUIStateFactory$convertToUIState$1.L$2 = toolbarUIState6;
                        mTicketTripInfoUIStateFactory$convertToUIState$1.L$3 = buttonUIState4;
                        mTicketTripInfoUIStateFactory$convertToUIState$1.L$4 = chaloTextUIState5;
                        mTicketTripInfoUIStateFactory$convertToUIState$1.L$5 = loadingDialogUIState2;
                        mTicketTripInfoUIStateFactory$convertToUIState$1.L$6 = productBookingBranding2;
                        mTicketTripInfoUIStateFactory$convertToUIState$1.L$7 = snackbarUIState2;
                        mTicketTripInfoUIStateFactory$convertToUIState$1.L$8 = routeSelectionInputUIStateC;
                        mTicketTripInfoUIStateFactory$convertToUIState$1.L$9 = this;
                        mTicketTripInfoUIStateFactory$convertToUIState$1.L$10 = null;
                        mTicketTripInfoUIStateFactory$convertToUIState$1.L$11 = null;
                        mTicketTripInfoUIStateFactory$convertToUIState$1.label = 8;
                        objB7 = stringProvider4.b(StringEnum.HINT_START_STOP, new Object[0], mTicketTripInfoUIStateFactory$convertToUIState$1);
                        coroutineSingletons = coroutineSingletons6;
                        if (objB7 == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                        SnackbarUIState snackbarUIState1111111113 = snackbarUIState2;
                        routeSelectionInputUIState = routeSelectionInputUIStateC;
                        loadingDialogUIState3 = loadingDialogUIState2;
                        productBookingBranding3 = productBookingBranding2;
                        snackbarUIState3 = snackbarUIState1111111113;
                        ToolbarUIState toolbarUIState11111 = toolbarUIState6;
                        buttonUIState5 = buttonUIState4;
                        function8 = function7;
                        toolbarUIState7 = toolbarUIState11111;
                        mTicketTripInfoUIStateFactory2 = this;
                        str6 = (String) objB7;
                        productBookingStopDetails = mTicketTripInfoDataState8.c;
                        if (productBookingStopDetails != null) {
                            str7 = str2;
                        } else {
                            str7 = str2;
                        }
                        list3 = EmptyList.f17557a;
                        coroutineSingletons2 = coroutineSingletons;
                        if (mTicketTripInfoDataState8.i == MTicketTripInfoMissingFieldError.FROM_STOP) {
                            mTicketTripInfoUIStateFactory$convertToUIState$1.L$0 = mTicketTripInfoDataState8;
                            mTicketTripInfoUIStateFactory$convertToUIState$1.L$1 = function8;
                            mTicketTripInfoUIStateFactory$convertToUIState$1.L$2 = toolbarUIState7;
                            mTicketTripInfoUIStateFactory$convertToUIState$1.L$3 = buttonUIState5;
                            mTicketTripInfoUIStateFactory$convertToUIState$1.L$4 = chaloTextUIState5;
                            mTicketTripInfoUIStateFactory$convertToUIState$1.L$5 = loadingDialogUIState3;
                            mTicketTripInfoUIStateFactory$convertToUIState$1.L$6 = productBookingBranding3;
                            mTicketTripInfoUIStateFactory$convertToUIState$1.L$7 = snackbarUIState3;
                            mTicketTripInfoUIStateFactory$convertToUIState$1.L$8 = routeSelectionInputUIState;
                            mTicketTripInfoUIStateFactory$convertToUIState$1.L$9 = mTicketTripInfoUIStateFactory2;
                            mTicketTripInfoUIStateFactory$convertToUIState$1.L$10 = str6;
                            mTicketTripInfoUIStateFactory$convertToUIState$1.L$11 = str7;
                            mTicketTripInfoUIStateFactory$convertToUIState$1.L$12 = list3;
                            mTicketTripInfoUIStateFactory$convertToUIState$1.label = 9;
                            loadingDialogUIState4 = loadingDialogUIState3;
                            stringProvider = stringProvider4;
                            objB8 = stringProvider.b(StringEnum.STATUS_ERROR_ENTER_STOP, new Object[0], mTicketTripInfoUIStateFactory$convertToUIState$1);
                            coroutineSingletons3 = coroutineSingletons2;
                            if (objB8 == coroutineSingletons3) {
                                return coroutineSingletons3;
                            }
                            TextUIState.ChaloTextUIState chaloTextUIState111111114 = chaloTextUIState5;
                            str9 = str7;
                            obj7 = objB8;
                            chaloTextUIState7 = chaloTextUIState111111114;
                            SnackbarUIState snackbarUIState1111111114 = snackbarUIState3;
                            routeSelectionInputUIState2 = routeSelectionInputUIState;
                            toolbarUIState8 = toolbarUIState7;
                            buttonUIState6 = buttonUIState5;
                            function9 = function8;
                            productBookingBranding4 = productBookingBranding3;
                            snackbarUIState4 = snackbarUIState1111111114;
                            coroutineSingletons2 = coroutineSingletons3;
                            mTicketTripInfoUIStateFactory3 = mTicketTripInfoUIStateFactory2;
                            str8 = (String) obj7;
                        } else {
                            loadingDialogUIState4 = loadingDialogUIState3;
                            stringProvider = stringProvider4;
                            SnackbarUIState snackbarUIState1111111115 = snackbarUIState3;
                            routeSelectionInputUIState2 = routeSelectionInputUIState;
                            toolbarUIState8 = toolbarUIState7;
                            buttonUIState6 = buttonUIState5;
                            function9 = function8;
                            productBookingBranding4 = productBookingBranding3;
                            snackbarUIState4 = snackbarUIState1111111115;
                            chaloTextUIState7 = chaloTextUIState5;
                            mTicketTripInfoUIStateFactory3 = mTicketTripInfoUIStateFactory2;
                            str8 = null;
                            str9 = str7;
                        }
                        loadingDialogUIState5 = loadingDialogUIState4;
                        StringProvider stringProvider1114 = stringProvider;
                        wg0 wg0Var111111119 = new wg0(function9, 5);
                        mTicketTripInfoUIStateFactory3.getClass();
                        routeSelectionInputUIStateC2 = c(str6, str9, list3, str8, wg0Var111111119);
                        mTicketTripInfoUIStateFactory$convertToUIState$1.L$0 = mTicketTripInfoDataState8;
                        mTicketTripInfoUIStateFactory$convertToUIState$1.L$1 = function9;
                        mTicketTripInfoUIStateFactory$convertToUIState$1.L$2 = toolbarUIState8;
                        mTicketTripInfoUIStateFactory$convertToUIState$1.L$3 = buttonUIState6;
                        mTicketTripInfoUIStateFactory$convertToUIState$1.L$4 = chaloTextUIState7;
                        mTicketTripInfoUIStateFactory$convertToUIState$1.L$5 = loadingDialogUIState5;
                        mTicketTripInfoUIStateFactory$convertToUIState$1.L$6 = productBookingBranding4;
                        mTicketTripInfoUIStateFactory$convertToUIState$1.L$7 = snackbarUIState4;
                        mTicketTripInfoUIStateFactory$convertToUIState$1.L$8 = routeSelectionInputUIState2;
                        mTicketTripInfoUIStateFactory$convertToUIState$1.L$9 = routeSelectionInputUIStateC2;
                        mTicketTripInfoUIStateFactory$convertToUIState$1.L$10 = this;
                        mTicketTripInfoUIStateFactory$convertToUIState$1.L$11 = null;
                        mTicketTripInfoUIStateFactory$convertToUIState$1.L$12 = null;
                        mTicketTripInfoUIStateFactory$convertToUIState$1.label = 10;
                        stringProvider2 = stringProvider1114;
                        objB9 = stringProvider2.b(StringEnum.HINT_END_STOP, new Object[0], mTicketTripInfoUIStateFactory$convertToUIState$1);
                        coroutineSingletons4 = coroutineSingletons2;
                        if (objB9 == coroutineSingletons4) {
                            return coroutineSingletons4;
                        }
                        loadingDialogUIState6 = loadingDialogUIState5;
                        obj8 = objB9;
                        toolbarUIState9 = toolbarUIState8;
                        routeSelectionInputUIState3 = routeSelectionInputUIStateC2;
                        mTicketTripInfoUIStateFactory4 = this;
                        str10 = (String) obj8;
                        productBookingStopDetails2 = mTicketTripInfoDataState8.d;
                        if (productBookingStopDetails2 != null) {
                            str11 = str2;
                        } else {
                            str11 = str2;
                        }
                        coroutineSingletons5 = coroutineSingletons4;
                        list4 = EmptyList.f17557a;
                        stringProvider3 = stringProvider2;
                        if (mTicketTripInfoDataState8.i == MTicketTripInfoMissingFieldError.TO_STOP) {
                            mTicketTripInfoUIStateFactory$convertToUIState$1.L$0 = function9;
                            mTicketTripInfoUIStateFactory$convertToUIState$1.L$1 = toolbarUIState9;
                            mTicketTripInfoUIStateFactory$convertToUIState$1.L$2 = buttonUIState6;
                            mTicketTripInfoUIStateFactory$convertToUIState$1.L$3 = chaloTextUIState7;
                            mTicketTripInfoUIStateFactory$convertToUIState$1.L$4 = loadingDialogUIState6;
                            mTicketTripInfoUIStateFactory$convertToUIState$1.L$5 = productBookingBranding4;
                            mTicketTripInfoUIStateFactory$convertToUIState$1.L$6 = snackbarUIState4;
                            mTicketTripInfoUIStateFactory$convertToUIState$1.L$7 = routeSelectionInputUIState2;
                            mTicketTripInfoUIStateFactory$convertToUIState$1.L$8 = routeSelectionInputUIState3;
                            mTicketTripInfoUIStateFactory$convertToUIState$1.L$9 = mTicketTripInfoUIStateFactory4;
                            mTicketTripInfoUIStateFactory$convertToUIState$1.L$10 = str10;
                            mTicketTripInfoUIStateFactory$convertToUIState$1.L$11 = str11;
                            mTicketTripInfoUIStateFactory$convertToUIState$1.L$12 = list4;
                            mTicketTripInfoUIStateFactory6 = mTicketTripInfoUIStateFactory4;
                            mTicketTripInfoUIStateFactory$convertToUIState$1.label = 11;
                            objB10 = stringProvider3.b(StringEnum.STATUS_ERROR_ENTER_STOP, new Object[0], mTicketTripInfoUIStateFactory$convertToUIState$1);
                            if (objB10 == coroutineSingletons5) {
                                return coroutineSingletons5;
                            }
                            chaloTextUIState9 = chaloTextUIState7;
                            routeSelectionInputUIState6 = routeSelectionInputUIState2;
                            productBookingBranding6 = productBookingBranding4;
                            function10 = function9;
                            buttonUIState7 = buttonUIState6;
                            str13 = str10;
                            toolbarUIState11 = toolbarUIState9;
                            routeSelectionInputUIState7 = routeSelectionInputUIState3;
                            snackbarUIState5 = snackbarUIState4;
                            obj9 = objB10;
                            loadingDialogUIState8 = loadingDialogUIState6;
                            list5 = list4;
                            mTicketTripInfoUIStateFactory7 = mTicketTripInfoUIStateFactory6;
                            String str11111113 = (String) obj9;
                            Function1 function11111 = function10;
                            str12 = str11111113;
                            mTicketTripInfoUIStateFactory5 = mTicketTripInfoUIStateFactory7;
                            list4 = list5;
                            toolbarUIState10 = toolbarUIState11;
                            function9 = function11111;
                            LoadingDialogUIState loadingDialogUIState1118 = loadingDialogUIState8;
                            snackbarUIState4 = snackbarUIState5;
                            productBookingBranding5 = productBookingBranding6;
                            loadingDialogUIState7 = loadingDialogUIState1118;
                            str10 = str13;
                            routeSelectionInputUIState5 = routeSelectionInputUIState7;
                            routeSelectionInputUIState4 = routeSelectionInputUIState6;
                            chaloTextUIState8 = chaloTextUIState9;
                            buttonUIState6 = buttonUIState7;
                        } else {
                            MTicketTripInfoUIStateFactory mTicketTripInfoUIStateFactory1111117 = mTicketTripInfoUIStateFactory4;
                            RouteSelectionInputUIState routeSelectionInputUIState1117 = routeSelectionInputUIState2;
                            loadingDialogUIState7 = loadingDialogUIState6;
                            toolbarUIState10 = toolbarUIState9;
                            routeSelectionInputUIState4 = routeSelectionInputUIState1117;
                            chaloTextUIState8 = chaloTextUIState7;
                            routeSelectionInputUIState5 = routeSelectionInputUIState3;
                            productBookingBranding5 = productBookingBranding4;
                            mTicketTripInfoUIStateFactory5 = mTicketTripInfoUIStateFactory1111117;
                            str12 = null;
                        }
                        wg0 wg0Var1111111110 = new wg0(function9, 6);
                        mTicketTripInfoUIStateFactory5.getClass();
                        return new MTicketTripInfoUIState(toolbarUIState10, routeSelectionInputUIState4, routeSelectionInputUIState5, c(str10, str11, list4, str12, wg0Var1111111110), buttonUIState6, chaloTextUIState8, productBookingBranding5, loadingDialogUIState7, snackbarUIState4);
                    }
                }
                coroutineSingletons6 = coroutineSingletons6;
                return coroutineSingletons6;
            case 5:
                ProductBookingBranding productBookingBranding7 = (ProductBookingBranding) mTicketTripInfoUIStateFactory$convertToUIState$1.L$6;
                LoadingDialogUIState loadingDialogUIState20 = (LoadingDialogUIState) mTicketTripInfoUIStateFactory$convertToUIState$1.L$5;
                TextUIState.ChaloTextUIState chaloTextUIState20 = (TextUIState.ChaloTextUIState) mTicketTripInfoUIStateFactory$convertToUIState$1.L$4;
                ButtonUIState buttonUIState21 = (ButtonUIState) mTicketTripInfoUIStateFactory$convertToUIState$1.L$3;
                ToolbarUIState toolbarUIState20 = (ToolbarUIState) mTicketTripInfoUIStateFactory$convertToUIState$1.L$2;
                Function1 function20 = (Function1) mTicketTripInfoUIStateFactory$convertToUIState$1.L$1;
                MTicketTripInfoDataState mTicketTripInfoDataState14 = (MTicketTripInfoDataState) mTicketTripInfoUIStateFactory$convertToUIState$1.L$0;
                ResultKt.b(obj9);
                mTicketTripInfoDataState8 = mTicketTripInfoDataState14;
                function6 = function20;
                toolbarUIState5 = toolbarUIState20;
                buttonUIState3 = buttonUIState21;
                chaloTextUIState4 = chaloTextUIState20;
                loadingDialogUIState = loadingDialogUIState20;
                productBookingBranding = productBookingBranding7;
                obj4 = obj9;
                snackbarUIState = (SnackbarUIState) obj4;
                mTicketTripInfoUIStateFactory$convertToUIState$1.L$0 = mTicketTripInfoDataState8;
                mTicketTripInfoUIStateFactory$convertToUIState$1.L$1 = function6;
                mTicketTripInfoUIStateFactory$convertToUIState$1.L$2 = toolbarUIState5;
                mTicketTripInfoUIStateFactory$convertToUIState$1.L$3 = buttonUIState3;
                mTicketTripInfoUIStateFactory$convertToUIState$1.L$4 = chaloTextUIState4;
                mTicketTripInfoUIStateFactory$convertToUIState$1.L$5 = loadingDialogUIState;
                mTicketTripInfoUIStateFactory$convertToUIState$1.L$6 = productBookingBranding;
                mTicketTripInfoUIStateFactory$convertToUIState$1.L$7 = snackbarUIState;
                mTicketTripInfoUIStateFactory$convertToUIState$1.L$8 = this;
                mTicketTripInfoUIStateFactory$convertToUIState$1.label = 6;
                objB5 = stringProvider4.b(StringEnum.HINT_ROUTE_NUMBER, new Object[0], mTicketTripInfoUIStateFactory$convertToUIState$1);
                if (objB5 != coroutineSingletons6) {
                    ButtonUIState buttonUIState1118 = buttonUIState3;
                    snackbarUIState2 = snackbarUIState;
                    obj5 = objB5;
                    buttonUIState4 = buttonUIState1118;
                    toolbarUIState6 = toolbarUIState5;
                    function7 = function6;
                    productBookingBranding2 = productBookingBranding;
                    loadingDialogUIState2 = loadingDialogUIState;
                    chaloTextUIState5 = chaloTextUIState4;
                    mTicketTripInfoUIStateFactory = this;
                    str = (String) obj5;
                    productBookingRouteDetails = mTicketTripInfoDataState8.b;
                    str2 = "";
                    if (productBookingRouteDetails != null) {
                        str3 = str2;
                    } else {
                        str3 = str2;
                    }
                    if (productBookingRouteDetails != null) {
                        list = EmptyList.f17557a;
                    } else {
                        list = EmptyList.f17557a;
                    }
                    if (mTicketTripInfoDataState8.i == MTicketTripInfoMissingFieldError.ROUTE) {
                        mTicketTripInfoUIStateFactory$convertToUIState$1.L$0 = mTicketTripInfoDataState8;
                        mTicketTripInfoUIStateFactory$convertToUIState$1.L$1 = function7;
                        mTicketTripInfoUIStateFactory$convertToUIState$1.L$2 = toolbarUIState6;
                        mTicketTripInfoUIStateFactory$convertToUIState$1.L$3 = buttonUIState4;
                        mTicketTripInfoUIStateFactory$convertToUIState$1.L$4 = chaloTextUIState5;
                        mTicketTripInfoUIStateFactory$convertToUIState$1.L$5 = loadingDialogUIState2;
                        mTicketTripInfoUIStateFactory$convertToUIState$1.L$6 = productBookingBranding2;
                        mTicketTripInfoUIStateFactory$convertToUIState$1.L$7 = snackbarUIState2;
                        mTicketTripInfoUIStateFactory$convertToUIState$1.L$8 = mTicketTripInfoUIStateFactory;
                        mTicketTripInfoUIStateFactory$convertToUIState$1.L$9 = str;
                        mTicketTripInfoUIStateFactory$convertToUIState$1.L$10 = str3;
                        mTicketTripInfoUIStateFactory$convertToUIState$1.L$11 = list;
                        mTicketTripInfoUIStateFactory$convertToUIState$1.label = 7;
                        objB6 = stringProvider4.b(StringEnum.STATUS_ERROR_ROUTE_NUMBER, new Object[0], mTicketTripInfoUIStateFactory$convertToUIState$1);
                        if (objB6 != coroutineSingletons6) {
                            coroutineSingletons6 = coroutineSingletons6;
                            List list1116 = list;
                            obj6 = objB6;
                            list2 = list1116;
                            String str11111114 = str3;
                            chaloTextUIState6 = chaloTextUIState5;
                            str5 = str11111114;
                            str4 = (String) obj6;
                            TextUIState.ChaloTextUIState chaloTextUIState111111115 = chaloTextUIState6;
                            str3 = str5;
                            chaloTextUIState5 = chaloTextUIState111111115;
                        }
                    } else {
                        coroutineSingletons6 = coroutineSingletons6;
                        list2 = list;
                        str4 = null;
                    }
                    MTicketTripInfoUIStateFactory mTicketTripInfoUIStateFactory1111118 = mTicketTripInfoUIStateFactory;
                    wg0 wg0Var1111111111 = new wg0(function7, 4);
                    mTicketTripInfoUIStateFactory1111118.getClass();
                    routeSelectionInputUIStateC = c(str, str3, list2, str4, wg0Var1111111111);
                    mTicketTripInfoUIStateFactory$convertToUIState$1.L$0 = mTicketTripInfoDataState8;
                    mTicketTripInfoUIStateFactory$convertToUIState$1.L$1 = function7;
                    mTicketTripInfoUIStateFactory$convertToUIState$1.L$2 = toolbarUIState6;
                    mTicketTripInfoUIStateFactory$convertToUIState$1.L$3 = buttonUIState4;
                    mTicketTripInfoUIStateFactory$convertToUIState$1.L$4 = chaloTextUIState5;
                    mTicketTripInfoUIStateFactory$convertToUIState$1.L$5 = loadingDialogUIState2;
                    mTicketTripInfoUIStateFactory$convertToUIState$1.L$6 = productBookingBranding2;
                    mTicketTripInfoUIStateFactory$convertToUIState$1.L$7 = snackbarUIState2;
                    mTicketTripInfoUIStateFactory$convertToUIState$1.L$8 = routeSelectionInputUIStateC;
                    mTicketTripInfoUIStateFactory$convertToUIState$1.L$9 = this;
                    mTicketTripInfoUIStateFactory$convertToUIState$1.L$10 = null;
                    mTicketTripInfoUIStateFactory$convertToUIState$1.L$11 = null;
                    mTicketTripInfoUIStateFactory$convertToUIState$1.label = 8;
                    objB7 = stringProvider4.b(StringEnum.HINT_START_STOP, new Object[0], mTicketTripInfoUIStateFactory$convertToUIState$1);
                    coroutineSingletons = coroutineSingletons6;
                    if (objB7 == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    SnackbarUIState snackbarUIState1111111116 = snackbarUIState2;
                    routeSelectionInputUIState = routeSelectionInputUIStateC;
                    loadingDialogUIState3 = loadingDialogUIState2;
                    productBookingBranding3 = productBookingBranding2;
                    snackbarUIState3 = snackbarUIState1111111116;
                    ToolbarUIState toolbarUIState11112 = toolbarUIState6;
                    buttonUIState5 = buttonUIState4;
                    function8 = function7;
                    toolbarUIState7 = toolbarUIState11112;
                    mTicketTripInfoUIStateFactory2 = this;
                    str6 = (String) objB7;
                    productBookingStopDetails = mTicketTripInfoDataState8.c;
                    if (productBookingStopDetails != null) {
                        str7 = str2;
                    } else {
                        str7 = str2;
                    }
                    list3 = EmptyList.f17557a;
                    coroutineSingletons2 = coroutineSingletons;
                    if (mTicketTripInfoDataState8.i == MTicketTripInfoMissingFieldError.FROM_STOP) {
                        mTicketTripInfoUIStateFactory$convertToUIState$1.L$0 = mTicketTripInfoDataState8;
                        mTicketTripInfoUIStateFactory$convertToUIState$1.L$1 = function8;
                        mTicketTripInfoUIStateFactory$convertToUIState$1.L$2 = toolbarUIState7;
                        mTicketTripInfoUIStateFactory$convertToUIState$1.L$3 = buttonUIState5;
                        mTicketTripInfoUIStateFactory$convertToUIState$1.L$4 = chaloTextUIState5;
                        mTicketTripInfoUIStateFactory$convertToUIState$1.L$5 = loadingDialogUIState3;
                        mTicketTripInfoUIStateFactory$convertToUIState$1.L$6 = productBookingBranding3;
                        mTicketTripInfoUIStateFactory$convertToUIState$1.L$7 = snackbarUIState3;
                        mTicketTripInfoUIStateFactory$convertToUIState$1.L$8 = routeSelectionInputUIState;
                        mTicketTripInfoUIStateFactory$convertToUIState$1.L$9 = mTicketTripInfoUIStateFactory2;
                        mTicketTripInfoUIStateFactory$convertToUIState$1.L$10 = str6;
                        mTicketTripInfoUIStateFactory$convertToUIState$1.L$11 = str7;
                        mTicketTripInfoUIStateFactory$convertToUIState$1.L$12 = list3;
                        mTicketTripInfoUIStateFactory$convertToUIState$1.label = 9;
                        loadingDialogUIState4 = loadingDialogUIState3;
                        stringProvider = stringProvider4;
                        objB8 = stringProvider.b(StringEnum.STATUS_ERROR_ENTER_STOP, new Object[0], mTicketTripInfoUIStateFactory$convertToUIState$1);
                        coroutineSingletons3 = coroutineSingletons2;
                        if (objB8 == coroutineSingletons3) {
                            return coroutineSingletons3;
                        }
                        TextUIState.ChaloTextUIState chaloTextUIState111111116 = chaloTextUIState5;
                        str9 = str7;
                        obj7 = objB8;
                        chaloTextUIState7 = chaloTextUIState111111116;
                        SnackbarUIState snackbarUIState1111111117 = snackbarUIState3;
                        routeSelectionInputUIState2 = routeSelectionInputUIState;
                        toolbarUIState8 = toolbarUIState7;
                        buttonUIState6 = buttonUIState5;
                        function9 = function8;
                        productBookingBranding4 = productBookingBranding3;
                        snackbarUIState4 = snackbarUIState1111111117;
                        coroutineSingletons2 = coroutineSingletons3;
                        mTicketTripInfoUIStateFactory3 = mTicketTripInfoUIStateFactory2;
                        str8 = (String) obj7;
                    } else {
                        loadingDialogUIState4 = loadingDialogUIState3;
                        stringProvider = stringProvider4;
                        SnackbarUIState snackbarUIState1111111118 = snackbarUIState3;
                        routeSelectionInputUIState2 = routeSelectionInputUIState;
                        toolbarUIState8 = toolbarUIState7;
                        buttonUIState6 = buttonUIState5;
                        function9 = function8;
                        productBookingBranding4 = productBookingBranding3;
                        snackbarUIState4 = snackbarUIState1111111118;
                        chaloTextUIState7 = chaloTextUIState5;
                        mTicketTripInfoUIStateFactory3 = mTicketTripInfoUIStateFactory2;
                        str8 = null;
                        str9 = str7;
                    }
                    loadingDialogUIState5 = loadingDialogUIState4;
                    StringProvider stringProvider1115 = stringProvider;
                    wg0 wg0Var1111111112 = new wg0(function9, 5);
                    mTicketTripInfoUIStateFactory3.getClass();
                    routeSelectionInputUIStateC2 = c(str6, str9, list3, str8, wg0Var1111111112);
                    mTicketTripInfoUIStateFactory$convertToUIState$1.L$0 = mTicketTripInfoDataState8;
                    mTicketTripInfoUIStateFactory$convertToUIState$1.L$1 = function9;
                    mTicketTripInfoUIStateFactory$convertToUIState$1.L$2 = toolbarUIState8;
                    mTicketTripInfoUIStateFactory$convertToUIState$1.L$3 = buttonUIState6;
                    mTicketTripInfoUIStateFactory$convertToUIState$1.L$4 = chaloTextUIState7;
                    mTicketTripInfoUIStateFactory$convertToUIState$1.L$5 = loadingDialogUIState5;
                    mTicketTripInfoUIStateFactory$convertToUIState$1.L$6 = productBookingBranding4;
                    mTicketTripInfoUIStateFactory$convertToUIState$1.L$7 = snackbarUIState4;
                    mTicketTripInfoUIStateFactory$convertToUIState$1.L$8 = routeSelectionInputUIState2;
                    mTicketTripInfoUIStateFactory$convertToUIState$1.L$9 = routeSelectionInputUIStateC2;
                    mTicketTripInfoUIStateFactory$convertToUIState$1.L$10 = this;
                    mTicketTripInfoUIStateFactory$convertToUIState$1.L$11 = null;
                    mTicketTripInfoUIStateFactory$convertToUIState$1.L$12 = null;
                    mTicketTripInfoUIStateFactory$convertToUIState$1.label = 10;
                    stringProvider2 = stringProvider1115;
                    objB9 = stringProvider2.b(StringEnum.HINT_END_STOP, new Object[0], mTicketTripInfoUIStateFactory$convertToUIState$1);
                    coroutineSingletons4 = coroutineSingletons2;
                    if (objB9 == coroutineSingletons4) {
                        return coroutineSingletons4;
                    }
                    loadingDialogUIState6 = loadingDialogUIState5;
                    obj8 = objB9;
                    toolbarUIState9 = toolbarUIState8;
                    routeSelectionInputUIState3 = routeSelectionInputUIStateC2;
                    mTicketTripInfoUIStateFactory4 = this;
                    str10 = (String) obj8;
                    productBookingStopDetails2 = mTicketTripInfoDataState8.d;
                    if (productBookingStopDetails2 != null) {
                        str11 = str2;
                    } else {
                        str11 = str2;
                    }
                    coroutineSingletons5 = coroutineSingletons4;
                    list4 = EmptyList.f17557a;
                    stringProvider3 = stringProvider2;
                    if (mTicketTripInfoDataState8.i == MTicketTripInfoMissingFieldError.TO_STOP) {
                        mTicketTripInfoUIStateFactory$convertToUIState$1.L$0 = function9;
                        mTicketTripInfoUIStateFactory$convertToUIState$1.L$1 = toolbarUIState9;
                        mTicketTripInfoUIStateFactory$convertToUIState$1.L$2 = buttonUIState6;
                        mTicketTripInfoUIStateFactory$convertToUIState$1.L$3 = chaloTextUIState7;
                        mTicketTripInfoUIStateFactory$convertToUIState$1.L$4 = loadingDialogUIState6;
                        mTicketTripInfoUIStateFactory$convertToUIState$1.L$5 = productBookingBranding4;
                        mTicketTripInfoUIStateFactory$convertToUIState$1.L$6 = snackbarUIState4;
                        mTicketTripInfoUIStateFactory$convertToUIState$1.L$7 = routeSelectionInputUIState2;
                        mTicketTripInfoUIStateFactory$convertToUIState$1.L$8 = routeSelectionInputUIState3;
                        mTicketTripInfoUIStateFactory$convertToUIState$1.L$9 = mTicketTripInfoUIStateFactory4;
                        mTicketTripInfoUIStateFactory$convertToUIState$1.L$10 = str10;
                        mTicketTripInfoUIStateFactory$convertToUIState$1.L$11 = str11;
                        mTicketTripInfoUIStateFactory$convertToUIState$1.L$12 = list4;
                        mTicketTripInfoUIStateFactory6 = mTicketTripInfoUIStateFactory4;
                        mTicketTripInfoUIStateFactory$convertToUIState$1.label = 11;
                        objB10 = stringProvider3.b(StringEnum.STATUS_ERROR_ENTER_STOP, new Object[0], mTicketTripInfoUIStateFactory$convertToUIState$1);
                        if (objB10 == coroutineSingletons5) {
                            return coroutineSingletons5;
                        }
                        chaloTextUIState9 = chaloTextUIState7;
                        routeSelectionInputUIState6 = routeSelectionInputUIState2;
                        productBookingBranding6 = productBookingBranding4;
                        function10 = function9;
                        buttonUIState7 = buttonUIState6;
                        str13 = str10;
                        toolbarUIState11 = toolbarUIState9;
                        routeSelectionInputUIState7 = routeSelectionInputUIState3;
                        snackbarUIState5 = snackbarUIState4;
                        obj9 = objB10;
                        loadingDialogUIState8 = loadingDialogUIState6;
                        list5 = list4;
                        mTicketTripInfoUIStateFactory7 = mTicketTripInfoUIStateFactory6;
                        String str11111115 = (String) obj9;
                        Function1 function11112 = function10;
                        str12 = str11111115;
                        mTicketTripInfoUIStateFactory5 = mTicketTripInfoUIStateFactory7;
                        list4 = list5;
                        toolbarUIState10 = toolbarUIState11;
                        function9 = function11112;
                        LoadingDialogUIState loadingDialogUIState1119 = loadingDialogUIState8;
                        snackbarUIState4 = snackbarUIState5;
                        productBookingBranding5 = productBookingBranding6;
                        loadingDialogUIState7 = loadingDialogUIState1119;
                        str10 = str13;
                        routeSelectionInputUIState5 = routeSelectionInputUIState7;
                        routeSelectionInputUIState4 = routeSelectionInputUIState6;
                        chaloTextUIState8 = chaloTextUIState9;
                        buttonUIState6 = buttonUIState7;
                    } else {
                        MTicketTripInfoUIStateFactory mTicketTripInfoUIStateFactory1111119 = mTicketTripInfoUIStateFactory4;
                        RouteSelectionInputUIState routeSelectionInputUIState1118 = routeSelectionInputUIState2;
                        loadingDialogUIState7 = loadingDialogUIState6;
                        toolbarUIState10 = toolbarUIState9;
                        routeSelectionInputUIState4 = routeSelectionInputUIState1118;
                        chaloTextUIState8 = chaloTextUIState7;
                        routeSelectionInputUIState5 = routeSelectionInputUIState3;
                        productBookingBranding5 = productBookingBranding4;
                        mTicketTripInfoUIStateFactory5 = mTicketTripInfoUIStateFactory1111119;
                        str12 = null;
                    }
                    wg0 wg0Var1111111113 = new wg0(function9, 6);
                    mTicketTripInfoUIStateFactory5.getClass();
                    return new MTicketTripInfoUIState(toolbarUIState10, routeSelectionInputUIState4, routeSelectionInputUIState5, c(str10, str11, list4, str12, wg0Var1111111113), buttonUIState6, chaloTextUIState8, productBookingBranding5, loadingDialogUIState7, snackbarUIState4);
                }
                coroutineSingletons6 = coroutineSingletons6;
                return coroutineSingletons6;
            case 6:
                MTicketTripInfoUIStateFactory mTicketTripInfoUIStateFactory20 = (MTicketTripInfoUIStateFactory) mTicketTripInfoUIStateFactory$convertToUIState$1.L$8;
                SnackbarUIState snackbarUIState20 = (SnackbarUIState) mTicketTripInfoUIStateFactory$convertToUIState$1.L$7;
                ProductBookingBranding productBookingBranding8 = (ProductBookingBranding) mTicketTripInfoUIStateFactory$convertToUIState$1.L$6;
                LoadingDialogUIState loadingDialogUIState21 = (LoadingDialogUIState) mTicketTripInfoUIStateFactory$convertToUIState$1.L$5;
                TextUIState.ChaloTextUIState chaloTextUIState21 = (TextUIState.ChaloTextUIState) mTicketTripInfoUIStateFactory$convertToUIState$1.L$4;
                ButtonUIState buttonUIState22 = (ButtonUIState) mTicketTripInfoUIStateFactory$convertToUIState$1.L$3;
                ToolbarUIState toolbarUIState21 = (ToolbarUIState) mTicketTripInfoUIStateFactory$convertToUIState$1.L$2;
                Function1 function21 = (Function1) mTicketTripInfoUIStateFactory$convertToUIState$1.L$1;
                MTicketTripInfoDataState mTicketTripInfoDataState15 = (MTicketTripInfoDataState) mTicketTripInfoUIStateFactory$convertToUIState$1.L$0;
                ResultKt.b(obj9);
                snackbarUIState2 = snackbarUIState20;
                chaloTextUIState5 = chaloTextUIState21;
                toolbarUIState6 = toolbarUIState21;
                function7 = function21;
                mTicketTripInfoDataState8 = mTicketTripInfoDataState15;
                loadingDialogUIState2 = loadingDialogUIState21;
                buttonUIState4 = buttonUIState22;
                mTicketTripInfoUIStateFactory = mTicketTripInfoUIStateFactory20;
                productBookingBranding2 = productBookingBranding8;
                obj5 = obj9;
                str = (String) obj5;
                productBookingRouteDetails = mTicketTripInfoDataState8.b;
                str2 = "";
                if (productBookingRouteDetails != null) {
                    str3 = str2;
                } else {
                    str3 = str2;
                }
                if (productBookingRouteDetails != null) {
                    list = EmptyList.f17557a;
                } else {
                    list = EmptyList.f17557a;
                }
                if (mTicketTripInfoDataState8.i == MTicketTripInfoMissingFieldError.ROUTE) {
                    mTicketTripInfoUIStateFactory$convertToUIState$1.L$0 = mTicketTripInfoDataState8;
                    mTicketTripInfoUIStateFactory$convertToUIState$1.L$1 = function7;
                    mTicketTripInfoUIStateFactory$convertToUIState$1.L$2 = toolbarUIState6;
                    mTicketTripInfoUIStateFactory$convertToUIState$1.L$3 = buttonUIState4;
                    mTicketTripInfoUIStateFactory$convertToUIState$1.L$4 = chaloTextUIState5;
                    mTicketTripInfoUIStateFactory$convertToUIState$1.L$5 = loadingDialogUIState2;
                    mTicketTripInfoUIStateFactory$convertToUIState$1.L$6 = productBookingBranding2;
                    mTicketTripInfoUIStateFactory$convertToUIState$1.L$7 = snackbarUIState2;
                    mTicketTripInfoUIStateFactory$convertToUIState$1.L$8 = mTicketTripInfoUIStateFactory;
                    mTicketTripInfoUIStateFactory$convertToUIState$1.L$9 = str;
                    mTicketTripInfoUIStateFactory$convertToUIState$1.L$10 = str3;
                    mTicketTripInfoUIStateFactory$convertToUIState$1.L$11 = list;
                    mTicketTripInfoUIStateFactory$convertToUIState$1.label = 7;
                    objB6 = stringProvider4.b(StringEnum.STATUS_ERROR_ROUTE_NUMBER, new Object[0], mTicketTripInfoUIStateFactory$convertToUIState$1);
                    if (objB6 != coroutineSingletons6) {
                        coroutineSingletons6 = coroutineSingletons6;
                        List list1117 = list;
                        obj6 = objB6;
                        list2 = list1117;
                        String str11111116 = str3;
                        chaloTextUIState6 = chaloTextUIState5;
                        str5 = str11111116;
                        str4 = (String) obj6;
                        TextUIState.ChaloTextUIState chaloTextUIState111111117 = chaloTextUIState6;
                        str3 = str5;
                        chaloTextUIState5 = chaloTextUIState111111117;
                    }
                    coroutineSingletons6 = coroutineSingletons6;
                    return coroutineSingletons6;
                }
                coroutineSingletons6 = coroutineSingletons6;
                list2 = list;
                str4 = null;
                MTicketTripInfoUIStateFactory mTicketTripInfoUIStateFactory11111110 = mTicketTripInfoUIStateFactory;
                wg0 wg0Var1111111114 = new wg0(function7, 4);
                mTicketTripInfoUIStateFactory11111110.getClass();
                routeSelectionInputUIStateC = c(str, str3, list2, str4, wg0Var1111111114);
                mTicketTripInfoUIStateFactory$convertToUIState$1.L$0 = mTicketTripInfoDataState8;
                mTicketTripInfoUIStateFactory$convertToUIState$1.L$1 = function7;
                mTicketTripInfoUIStateFactory$convertToUIState$1.L$2 = toolbarUIState6;
                mTicketTripInfoUIStateFactory$convertToUIState$1.L$3 = buttonUIState4;
                mTicketTripInfoUIStateFactory$convertToUIState$1.L$4 = chaloTextUIState5;
                mTicketTripInfoUIStateFactory$convertToUIState$1.L$5 = loadingDialogUIState2;
                mTicketTripInfoUIStateFactory$convertToUIState$1.L$6 = productBookingBranding2;
                mTicketTripInfoUIStateFactory$convertToUIState$1.L$7 = snackbarUIState2;
                mTicketTripInfoUIStateFactory$convertToUIState$1.L$8 = routeSelectionInputUIStateC;
                mTicketTripInfoUIStateFactory$convertToUIState$1.L$9 = this;
                mTicketTripInfoUIStateFactory$convertToUIState$1.L$10 = null;
                mTicketTripInfoUIStateFactory$convertToUIState$1.L$11 = null;
                mTicketTripInfoUIStateFactory$convertToUIState$1.label = 8;
                objB7 = stringProvider4.b(StringEnum.HINT_START_STOP, new Object[0], mTicketTripInfoUIStateFactory$convertToUIState$1);
                coroutineSingletons = coroutineSingletons6;
                if (objB7 == coroutineSingletons) {
                    return coroutineSingletons;
                }
                SnackbarUIState snackbarUIState1111111119 = snackbarUIState2;
                routeSelectionInputUIState = routeSelectionInputUIStateC;
                loadingDialogUIState3 = loadingDialogUIState2;
                productBookingBranding3 = productBookingBranding2;
                snackbarUIState3 = snackbarUIState1111111119;
                ToolbarUIState toolbarUIState11113 = toolbarUIState6;
                buttonUIState5 = buttonUIState4;
                function8 = function7;
                toolbarUIState7 = toolbarUIState11113;
                mTicketTripInfoUIStateFactory2 = this;
                str6 = (String) objB7;
                productBookingStopDetails = mTicketTripInfoDataState8.c;
                if (productBookingStopDetails != null) {
                    str7 = str2;
                } else {
                    str7 = str2;
                }
                list3 = EmptyList.f17557a;
                coroutineSingletons2 = coroutineSingletons;
                if (mTicketTripInfoDataState8.i == MTicketTripInfoMissingFieldError.FROM_STOP) {
                    mTicketTripInfoUIStateFactory$convertToUIState$1.L$0 = mTicketTripInfoDataState8;
                    mTicketTripInfoUIStateFactory$convertToUIState$1.L$1 = function8;
                    mTicketTripInfoUIStateFactory$convertToUIState$1.L$2 = toolbarUIState7;
                    mTicketTripInfoUIStateFactory$convertToUIState$1.L$3 = buttonUIState5;
                    mTicketTripInfoUIStateFactory$convertToUIState$1.L$4 = chaloTextUIState5;
                    mTicketTripInfoUIStateFactory$convertToUIState$1.L$5 = loadingDialogUIState3;
                    mTicketTripInfoUIStateFactory$convertToUIState$1.L$6 = productBookingBranding3;
                    mTicketTripInfoUIStateFactory$convertToUIState$1.L$7 = snackbarUIState3;
                    mTicketTripInfoUIStateFactory$convertToUIState$1.L$8 = routeSelectionInputUIState;
                    mTicketTripInfoUIStateFactory$convertToUIState$1.L$9 = mTicketTripInfoUIStateFactory2;
                    mTicketTripInfoUIStateFactory$convertToUIState$1.L$10 = str6;
                    mTicketTripInfoUIStateFactory$convertToUIState$1.L$11 = str7;
                    mTicketTripInfoUIStateFactory$convertToUIState$1.L$12 = list3;
                    mTicketTripInfoUIStateFactory$convertToUIState$1.label = 9;
                    loadingDialogUIState4 = loadingDialogUIState3;
                    stringProvider = stringProvider4;
                    objB8 = stringProvider.b(StringEnum.STATUS_ERROR_ENTER_STOP, new Object[0], mTicketTripInfoUIStateFactory$convertToUIState$1);
                    coroutineSingletons3 = coroutineSingletons2;
                    if (objB8 == coroutineSingletons3) {
                        return coroutineSingletons3;
                    }
                    TextUIState.ChaloTextUIState chaloTextUIState111111118 = chaloTextUIState5;
                    str9 = str7;
                    obj7 = objB8;
                    chaloTextUIState7 = chaloTextUIState111111118;
                    SnackbarUIState snackbarUIState11111111110 = snackbarUIState3;
                    routeSelectionInputUIState2 = routeSelectionInputUIState;
                    toolbarUIState8 = toolbarUIState7;
                    buttonUIState6 = buttonUIState5;
                    function9 = function8;
                    productBookingBranding4 = productBookingBranding3;
                    snackbarUIState4 = snackbarUIState11111111110;
                    coroutineSingletons2 = coroutineSingletons3;
                    mTicketTripInfoUIStateFactory3 = mTicketTripInfoUIStateFactory2;
                    str8 = (String) obj7;
                } else {
                    loadingDialogUIState4 = loadingDialogUIState3;
                    stringProvider = stringProvider4;
                    SnackbarUIState snackbarUIState11111111111 = snackbarUIState3;
                    routeSelectionInputUIState2 = routeSelectionInputUIState;
                    toolbarUIState8 = toolbarUIState7;
                    buttonUIState6 = buttonUIState5;
                    function9 = function8;
                    productBookingBranding4 = productBookingBranding3;
                    snackbarUIState4 = snackbarUIState11111111111;
                    chaloTextUIState7 = chaloTextUIState5;
                    mTicketTripInfoUIStateFactory3 = mTicketTripInfoUIStateFactory2;
                    str8 = null;
                    str9 = str7;
                }
                loadingDialogUIState5 = loadingDialogUIState4;
                StringProvider stringProvider1116 = stringProvider;
                wg0 wg0Var1111111115 = new wg0(function9, 5);
                mTicketTripInfoUIStateFactory3.getClass();
                routeSelectionInputUIStateC2 = c(str6, str9, list3, str8, wg0Var1111111115);
                mTicketTripInfoUIStateFactory$convertToUIState$1.L$0 = mTicketTripInfoDataState8;
                mTicketTripInfoUIStateFactory$convertToUIState$1.L$1 = function9;
                mTicketTripInfoUIStateFactory$convertToUIState$1.L$2 = toolbarUIState8;
                mTicketTripInfoUIStateFactory$convertToUIState$1.L$3 = buttonUIState6;
                mTicketTripInfoUIStateFactory$convertToUIState$1.L$4 = chaloTextUIState7;
                mTicketTripInfoUIStateFactory$convertToUIState$1.L$5 = loadingDialogUIState5;
                mTicketTripInfoUIStateFactory$convertToUIState$1.L$6 = productBookingBranding4;
                mTicketTripInfoUIStateFactory$convertToUIState$1.L$7 = snackbarUIState4;
                mTicketTripInfoUIStateFactory$convertToUIState$1.L$8 = routeSelectionInputUIState2;
                mTicketTripInfoUIStateFactory$convertToUIState$1.L$9 = routeSelectionInputUIStateC2;
                mTicketTripInfoUIStateFactory$convertToUIState$1.L$10 = this;
                mTicketTripInfoUIStateFactory$convertToUIState$1.L$11 = null;
                mTicketTripInfoUIStateFactory$convertToUIState$1.L$12 = null;
                mTicketTripInfoUIStateFactory$convertToUIState$1.label = 10;
                stringProvider2 = stringProvider1116;
                objB9 = stringProvider2.b(StringEnum.HINT_END_STOP, new Object[0], mTicketTripInfoUIStateFactory$convertToUIState$1);
                coroutineSingletons4 = coroutineSingletons2;
                if (objB9 == coroutineSingletons4) {
                    return coroutineSingletons4;
                }
                loadingDialogUIState6 = loadingDialogUIState5;
                obj8 = objB9;
                toolbarUIState9 = toolbarUIState8;
                routeSelectionInputUIState3 = routeSelectionInputUIStateC2;
                mTicketTripInfoUIStateFactory4 = this;
                str10 = (String) obj8;
                productBookingStopDetails2 = mTicketTripInfoDataState8.d;
                if (productBookingStopDetails2 != null) {
                    str11 = str2;
                } else {
                    str11 = str2;
                }
                coroutineSingletons5 = coroutineSingletons4;
                list4 = EmptyList.f17557a;
                stringProvider3 = stringProvider2;
                if (mTicketTripInfoDataState8.i == MTicketTripInfoMissingFieldError.TO_STOP) {
                    mTicketTripInfoUIStateFactory$convertToUIState$1.L$0 = function9;
                    mTicketTripInfoUIStateFactory$convertToUIState$1.L$1 = toolbarUIState9;
                    mTicketTripInfoUIStateFactory$convertToUIState$1.L$2 = buttonUIState6;
                    mTicketTripInfoUIStateFactory$convertToUIState$1.L$3 = chaloTextUIState7;
                    mTicketTripInfoUIStateFactory$convertToUIState$1.L$4 = loadingDialogUIState6;
                    mTicketTripInfoUIStateFactory$convertToUIState$1.L$5 = productBookingBranding4;
                    mTicketTripInfoUIStateFactory$convertToUIState$1.L$6 = snackbarUIState4;
                    mTicketTripInfoUIStateFactory$convertToUIState$1.L$7 = routeSelectionInputUIState2;
                    mTicketTripInfoUIStateFactory$convertToUIState$1.L$8 = routeSelectionInputUIState3;
                    mTicketTripInfoUIStateFactory$convertToUIState$1.L$9 = mTicketTripInfoUIStateFactory4;
                    mTicketTripInfoUIStateFactory$convertToUIState$1.L$10 = str10;
                    mTicketTripInfoUIStateFactory$convertToUIState$1.L$11 = str11;
                    mTicketTripInfoUIStateFactory$convertToUIState$1.L$12 = list4;
                    mTicketTripInfoUIStateFactory6 = mTicketTripInfoUIStateFactory4;
                    mTicketTripInfoUIStateFactory$convertToUIState$1.label = 11;
                    objB10 = stringProvider3.b(StringEnum.STATUS_ERROR_ENTER_STOP, new Object[0], mTicketTripInfoUIStateFactory$convertToUIState$1);
                    if (objB10 == coroutineSingletons5) {
                        return coroutineSingletons5;
                    }
                    chaloTextUIState9 = chaloTextUIState7;
                    routeSelectionInputUIState6 = routeSelectionInputUIState2;
                    productBookingBranding6 = productBookingBranding4;
                    function10 = function9;
                    buttonUIState7 = buttonUIState6;
                    str13 = str10;
                    toolbarUIState11 = toolbarUIState9;
                    routeSelectionInputUIState7 = routeSelectionInputUIState3;
                    snackbarUIState5 = snackbarUIState4;
                    obj9 = objB10;
                    loadingDialogUIState8 = loadingDialogUIState6;
                    list5 = list4;
                    mTicketTripInfoUIStateFactory7 = mTicketTripInfoUIStateFactory6;
                    String str11111117 = (String) obj9;
                    Function1 function11113 = function10;
                    str12 = str11111117;
                    mTicketTripInfoUIStateFactory5 = mTicketTripInfoUIStateFactory7;
                    list4 = list5;
                    toolbarUIState10 = toolbarUIState11;
                    function9 = function11113;
                    LoadingDialogUIState loadingDialogUIState11110 = loadingDialogUIState8;
                    snackbarUIState4 = snackbarUIState5;
                    productBookingBranding5 = productBookingBranding6;
                    loadingDialogUIState7 = loadingDialogUIState11110;
                    str10 = str13;
                    routeSelectionInputUIState5 = routeSelectionInputUIState7;
                    routeSelectionInputUIState4 = routeSelectionInputUIState6;
                    chaloTextUIState8 = chaloTextUIState9;
                    buttonUIState6 = buttonUIState7;
                } else {
                    MTicketTripInfoUIStateFactory mTicketTripInfoUIStateFactory11111111 = mTicketTripInfoUIStateFactory4;
                    RouteSelectionInputUIState routeSelectionInputUIState1119 = routeSelectionInputUIState2;
                    loadingDialogUIState7 = loadingDialogUIState6;
                    toolbarUIState10 = toolbarUIState9;
                    routeSelectionInputUIState4 = routeSelectionInputUIState1119;
                    chaloTextUIState8 = chaloTextUIState7;
                    routeSelectionInputUIState5 = routeSelectionInputUIState3;
                    productBookingBranding5 = productBookingBranding4;
                    mTicketTripInfoUIStateFactory5 = mTicketTripInfoUIStateFactory11111111;
                    str12 = null;
                }
                wg0 wg0Var1111111116 = new wg0(function9, 6);
                mTicketTripInfoUIStateFactory5.getClass();
                return new MTicketTripInfoUIState(toolbarUIState10, routeSelectionInputUIState4, routeSelectionInputUIState5, c(str10, str11, list4, str12, wg0Var1111111116), buttonUIState6, chaloTextUIState8, productBookingBranding5, loadingDialogUIState7, snackbarUIState4);
            case 7:
                List list20 = (List) mTicketTripInfoUIStateFactory$convertToUIState$1.L$11;
                str5 = (String) mTicketTripInfoUIStateFactory$convertToUIState$1.L$10;
                str = (String) mTicketTripInfoUIStateFactory$convertToUIState$1.L$9;
                mTicketTripInfoUIStateFactory = (MTicketTripInfoUIStateFactory) mTicketTripInfoUIStateFactory$convertToUIState$1.L$8;
                snackbarUIState2 = (SnackbarUIState) mTicketTripInfoUIStateFactory$convertToUIState$1.L$7;
                productBookingBranding2 = (ProductBookingBranding) mTicketTripInfoUIStateFactory$convertToUIState$1.L$6;
                loadingDialogUIState2 = (LoadingDialogUIState) mTicketTripInfoUIStateFactory$convertToUIState$1.L$5;
                TextUIState.ChaloTextUIState chaloTextUIState22 = (TextUIState.ChaloTextUIState) mTicketTripInfoUIStateFactory$convertToUIState$1.L$4;
                buttonUIState4 = (ButtonUIState) mTicketTripInfoUIStateFactory$convertToUIState$1.L$3;
                toolbarUIState6 = (ToolbarUIState) mTicketTripInfoUIStateFactory$convertToUIState$1.L$2;
                function7 = (Function1) mTicketTripInfoUIStateFactory$convertToUIState$1.L$1;
                MTicketTripInfoDataState mTicketTripInfoDataState16 = (MTicketTripInfoDataState) mTicketTripInfoUIStateFactory$convertToUIState$1.L$0;
                ResultKt.b(obj9);
                mTicketTripInfoDataState8 = mTicketTripInfoDataState16;
                obj6 = obj9;
                str2 = "";
                chaloTextUIState6 = chaloTextUIState22;
                list2 = list20;
                str4 = (String) obj6;
                TextUIState.ChaloTextUIState chaloTextUIState111111119 = chaloTextUIState6;
                str3 = str5;
                chaloTextUIState5 = chaloTextUIState111111119;
                MTicketTripInfoUIStateFactory mTicketTripInfoUIStateFactory11111112 = mTicketTripInfoUIStateFactory;
                wg0 wg0Var1111111117 = new wg0(function7, 4);
                mTicketTripInfoUIStateFactory11111112.getClass();
                routeSelectionInputUIStateC = c(str, str3, list2, str4, wg0Var1111111117);
                mTicketTripInfoUIStateFactory$convertToUIState$1.L$0 = mTicketTripInfoDataState8;
                mTicketTripInfoUIStateFactory$convertToUIState$1.L$1 = function7;
                mTicketTripInfoUIStateFactory$convertToUIState$1.L$2 = toolbarUIState6;
                mTicketTripInfoUIStateFactory$convertToUIState$1.L$3 = buttonUIState4;
                mTicketTripInfoUIStateFactory$convertToUIState$1.L$4 = chaloTextUIState5;
                mTicketTripInfoUIStateFactory$convertToUIState$1.L$5 = loadingDialogUIState2;
                mTicketTripInfoUIStateFactory$convertToUIState$1.L$6 = productBookingBranding2;
                mTicketTripInfoUIStateFactory$convertToUIState$1.L$7 = snackbarUIState2;
                mTicketTripInfoUIStateFactory$convertToUIState$1.L$8 = routeSelectionInputUIStateC;
                mTicketTripInfoUIStateFactory$convertToUIState$1.L$9 = this;
                mTicketTripInfoUIStateFactory$convertToUIState$1.L$10 = null;
                mTicketTripInfoUIStateFactory$convertToUIState$1.L$11 = null;
                mTicketTripInfoUIStateFactory$convertToUIState$1.label = 8;
                objB7 = stringProvider4.b(StringEnum.HINT_START_STOP, new Object[0], mTicketTripInfoUIStateFactory$convertToUIState$1);
                coroutineSingletons = coroutineSingletons6;
                if (objB7 == coroutineSingletons) {
                    return coroutineSingletons;
                }
                SnackbarUIState snackbarUIState11111111112 = snackbarUIState2;
                routeSelectionInputUIState = routeSelectionInputUIStateC;
                loadingDialogUIState3 = loadingDialogUIState2;
                productBookingBranding3 = productBookingBranding2;
                snackbarUIState3 = snackbarUIState11111111112;
                ToolbarUIState toolbarUIState11114 = toolbarUIState6;
                buttonUIState5 = buttonUIState4;
                function8 = function7;
                toolbarUIState7 = toolbarUIState11114;
                mTicketTripInfoUIStateFactory2 = this;
                str6 = (String) objB7;
                productBookingStopDetails = mTicketTripInfoDataState8.c;
                if (productBookingStopDetails != null) {
                    str7 = str2;
                } else {
                    str7 = str2;
                }
                list3 = EmptyList.f17557a;
                coroutineSingletons2 = coroutineSingletons;
                if (mTicketTripInfoDataState8.i == MTicketTripInfoMissingFieldError.FROM_STOP) {
                    mTicketTripInfoUIStateFactory$convertToUIState$1.L$0 = mTicketTripInfoDataState8;
                    mTicketTripInfoUIStateFactory$convertToUIState$1.L$1 = function8;
                    mTicketTripInfoUIStateFactory$convertToUIState$1.L$2 = toolbarUIState7;
                    mTicketTripInfoUIStateFactory$convertToUIState$1.L$3 = buttonUIState5;
                    mTicketTripInfoUIStateFactory$convertToUIState$1.L$4 = chaloTextUIState5;
                    mTicketTripInfoUIStateFactory$convertToUIState$1.L$5 = loadingDialogUIState3;
                    mTicketTripInfoUIStateFactory$convertToUIState$1.L$6 = productBookingBranding3;
                    mTicketTripInfoUIStateFactory$convertToUIState$1.L$7 = snackbarUIState3;
                    mTicketTripInfoUIStateFactory$convertToUIState$1.L$8 = routeSelectionInputUIState;
                    mTicketTripInfoUIStateFactory$convertToUIState$1.L$9 = mTicketTripInfoUIStateFactory2;
                    mTicketTripInfoUIStateFactory$convertToUIState$1.L$10 = str6;
                    mTicketTripInfoUIStateFactory$convertToUIState$1.L$11 = str7;
                    mTicketTripInfoUIStateFactory$convertToUIState$1.L$12 = list3;
                    mTicketTripInfoUIStateFactory$convertToUIState$1.label = 9;
                    loadingDialogUIState4 = loadingDialogUIState3;
                    stringProvider = stringProvider4;
                    objB8 = stringProvider.b(StringEnum.STATUS_ERROR_ENTER_STOP, new Object[0], mTicketTripInfoUIStateFactory$convertToUIState$1);
                    coroutineSingletons3 = coroutineSingletons2;
                    if (objB8 == coroutineSingletons3) {
                        return coroutineSingletons3;
                    }
                    TextUIState.ChaloTextUIState chaloTextUIState1111111110 = chaloTextUIState5;
                    str9 = str7;
                    obj7 = objB8;
                    chaloTextUIState7 = chaloTextUIState1111111110;
                    SnackbarUIState snackbarUIState11111111113 = snackbarUIState3;
                    routeSelectionInputUIState2 = routeSelectionInputUIState;
                    toolbarUIState8 = toolbarUIState7;
                    buttonUIState6 = buttonUIState5;
                    function9 = function8;
                    productBookingBranding4 = productBookingBranding3;
                    snackbarUIState4 = snackbarUIState11111111113;
                    coroutineSingletons2 = coroutineSingletons3;
                    mTicketTripInfoUIStateFactory3 = mTicketTripInfoUIStateFactory2;
                    str8 = (String) obj7;
                } else {
                    loadingDialogUIState4 = loadingDialogUIState3;
                    stringProvider = stringProvider4;
                    SnackbarUIState snackbarUIState11111111114 = snackbarUIState3;
                    routeSelectionInputUIState2 = routeSelectionInputUIState;
                    toolbarUIState8 = toolbarUIState7;
                    buttonUIState6 = buttonUIState5;
                    function9 = function8;
                    productBookingBranding4 = productBookingBranding3;
                    snackbarUIState4 = snackbarUIState11111111114;
                    chaloTextUIState7 = chaloTextUIState5;
                    mTicketTripInfoUIStateFactory3 = mTicketTripInfoUIStateFactory2;
                    str8 = null;
                    str9 = str7;
                }
                loadingDialogUIState5 = loadingDialogUIState4;
                StringProvider stringProvider1117 = stringProvider;
                wg0 wg0Var1111111118 = new wg0(function9, 5);
                mTicketTripInfoUIStateFactory3.getClass();
                routeSelectionInputUIStateC2 = c(str6, str9, list3, str8, wg0Var1111111118);
                mTicketTripInfoUIStateFactory$convertToUIState$1.L$0 = mTicketTripInfoDataState8;
                mTicketTripInfoUIStateFactory$convertToUIState$1.L$1 = function9;
                mTicketTripInfoUIStateFactory$convertToUIState$1.L$2 = toolbarUIState8;
                mTicketTripInfoUIStateFactory$convertToUIState$1.L$3 = buttonUIState6;
                mTicketTripInfoUIStateFactory$convertToUIState$1.L$4 = chaloTextUIState7;
                mTicketTripInfoUIStateFactory$convertToUIState$1.L$5 = loadingDialogUIState5;
                mTicketTripInfoUIStateFactory$convertToUIState$1.L$6 = productBookingBranding4;
                mTicketTripInfoUIStateFactory$convertToUIState$1.L$7 = snackbarUIState4;
                mTicketTripInfoUIStateFactory$convertToUIState$1.L$8 = routeSelectionInputUIState2;
                mTicketTripInfoUIStateFactory$convertToUIState$1.L$9 = routeSelectionInputUIStateC2;
                mTicketTripInfoUIStateFactory$convertToUIState$1.L$10 = this;
                mTicketTripInfoUIStateFactory$convertToUIState$1.L$11 = null;
                mTicketTripInfoUIStateFactory$convertToUIState$1.L$12 = null;
                mTicketTripInfoUIStateFactory$convertToUIState$1.label = 10;
                stringProvider2 = stringProvider1117;
                objB9 = stringProvider2.b(StringEnum.HINT_END_STOP, new Object[0], mTicketTripInfoUIStateFactory$convertToUIState$1);
                coroutineSingletons4 = coroutineSingletons2;
                if (objB9 == coroutineSingletons4) {
                    return coroutineSingletons4;
                }
                loadingDialogUIState6 = loadingDialogUIState5;
                obj8 = objB9;
                toolbarUIState9 = toolbarUIState8;
                routeSelectionInputUIState3 = routeSelectionInputUIStateC2;
                mTicketTripInfoUIStateFactory4 = this;
                str10 = (String) obj8;
                productBookingStopDetails2 = mTicketTripInfoDataState8.d;
                if (productBookingStopDetails2 != null) {
                    str11 = str2;
                } else {
                    str11 = str2;
                }
                coroutineSingletons5 = coroutineSingletons4;
                list4 = EmptyList.f17557a;
                stringProvider3 = stringProvider2;
                if (mTicketTripInfoDataState8.i == MTicketTripInfoMissingFieldError.TO_STOP) {
                    mTicketTripInfoUIStateFactory$convertToUIState$1.L$0 = function9;
                    mTicketTripInfoUIStateFactory$convertToUIState$1.L$1 = toolbarUIState9;
                    mTicketTripInfoUIStateFactory$convertToUIState$1.L$2 = buttonUIState6;
                    mTicketTripInfoUIStateFactory$convertToUIState$1.L$3 = chaloTextUIState7;
                    mTicketTripInfoUIStateFactory$convertToUIState$1.L$4 = loadingDialogUIState6;
                    mTicketTripInfoUIStateFactory$convertToUIState$1.L$5 = productBookingBranding4;
                    mTicketTripInfoUIStateFactory$convertToUIState$1.L$6 = snackbarUIState4;
                    mTicketTripInfoUIStateFactory$convertToUIState$1.L$7 = routeSelectionInputUIState2;
                    mTicketTripInfoUIStateFactory$convertToUIState$1.L$8 = routeSelectionInputUIState3;
                    mTicketTripInfoUIStateFactory$convertToUIState$1.L$9 = mTicketTripInfoUIStateFactory4;
                    mTicketTripInfoUIStateFactory$convertToUIState$1.L$10 = str10;
                    mTicketTripInfoUIStateFactory$convertToUIState$1.L$11 = str11;
                    mTicketTripInfoUIStateFactory$convertToUIState$1.L$12 = list4;
                    mTicketTripInfoUIStateFactory6 = mTicketTripInfoUIStateFactory4;
                    mTicketTripInfoUIStateFactory$convertToUIState$1.label = 11;
                    objB10 = stringProvider3.b(StringEnum.STATUS_ERROR_ENTER_STOP, new Object[0], mTicketTripInfoUIStateFactory$convertToUIState$1);
                    if (objB10 == coroutineSingletons5) {
                        return coroutineSingletons5;
                    }
                    chaloTextUIState9 = chaloTextUIState7;
                    routeSelectionInputUIState6 = routeSelectionInputUIState2;
                    productBookingBranding6 = productBookingBranding4;
                    function10 = function9;
                    buttonUIState7 = buttonUIState6;
                    str13 = str10;
                    toolbarUIState11 = toolbarUIState9;
                    routeSelectionInputUIState7 = routeSelectionInputUIState3;
                    snackbarUIState5 = snackbarUIState4;
                    obj9 = objB10;
                    loadingDialogUIState8 = loadingDialogUIState6;
                    list5 = list4;
                    mTicketTripInfoUIStateFactory7 = mTicketTripInfoUIStateFactory6;
                    String str11111118 = (String) obj9;
                    Function1 function11114 = function10;
                    str12 = str11111118;
                    mTicketTripInfoUIStateFactory5 = mTicketTripInfoUIStateFactory7;
                    list4 = list5;
                    toolbarUIState10 = toolbarUIState11;
                    function9 = function11114;
                    LoadingDialogUIState loadingDialogUIState11111 = loadingDialogUIState8;
                    snackbarUIState4 = snackbarUIState5;
                    productBookingBranding5 = productBookingBranding6;
                    loadingDialogUIState7 = loadingDialogUIState11111;
                    str10 = str13;
                    routeSelectionInputUIState5 = routeSelectionInputUIState7;
                    routeSelectionInputUIState4 = routeSelectionInputUIState6;
                    chaloTextUIState8 = chaloTextUIState9;
                    buttonUIState6 = buttonUIState7;
                } else {
                    MTicketTripInfoUIStateFactory mTicketTripInfoUIStateFactory11111113 = mTicketTripInfoUIStateFactory4;
                    RouteSelectionInputUIState routeSelectionInputUIState11110 = routeSelectionInputUIState2;
                    loadingDialogUIState7 = loadingDialogUIState6;
                    toolbarUIState10 = toolbarUIState9;
                    routeSelectionInputUIState4 = routeSelectionInputUIState11110;
                    chaloTextUIState8 = chaloTextUIState7;
                    routeSelectionInputUIState5 = routeSelectionInputUIState3;
                    productBookingBranding5 = productBookingBranding4;
                    mTicketTripInfoUIStateFactory5 = mTicketTripInfoUIStateFactory11111113;
                    str12 = null;
                }
                wg0 wg0Var1111111119 = new wg0(function9, 6);
                mTicketTripInfoUIStateFactory5.getClass();
                return new MTicketTripInfoUIState(toolbarUIState10, routeSelectionInputUIState4, routeSelectionInputUIState5, c(str10, str11, list4, str12, wg0Var1111111119), buttonUIState6, chaloTextUIState8, productBookingBranding5, loadingDialogUIState7, snackbarUIState4);
            case 8:
                MTicketTripInfoUIStateFactory mTicketTripInfoUIStateFactory21 = (MTicketTripInfoUIStateFactory) mTicketTripInfoUIStateFactory$convertToUIState$1.L$9;
                RouteSelectionInputUIState routeSelectionInputUIState20 = (RouteSelectionInputUIState) mTicketTripInfoUIStateFactory$convertToUIState$1.L$8;
                SnackbarUIState snackbarUIState21 = (SnackbarUIState) mTicketTripInfoUIStateFactory$convertToUIState$1.L$7;
                ProductBookingBranding productBookingBranding9 = (ProductBookingBranding) mTicketTripInfoUIStateFactory$convertToUIState$1.L$6;
                LoadingDialogUIState loadingDialogUIState22 = (LoadingDialogUIState) mTicketTripInfoUIStateFactory$convertToUIState$1.L$5;
                TextUIState.ChaloTextUIState chaloTextUIState23 = (TextUIState.ChaloTextUIState) mTicketTripInfoUIStateFactory$convertToUIState$1.L$4;
                ButtonUIState buttonUIState23 = (ButtonUIState) mTicketTripInfoUIStateFactory$convertToUIState$1.L$3;
                ToolbarUIState toolbarUIState22 = (ToolbarUIState) mTicketTripInfoUIStateFactory$convertToUIState$1.L$2;
                function8 = (Function1) mTicketTripInfoUIStateFactory$convertToUIState$1.L$1;
                MTicketTripInfoDataState mTicketTripInfoDataState17 = (MTicketTripInfoDataState) mTicketTripInfoUIStateFactory$convertToUIState$1.L$0;
                ResultKt.b(obj9);
                toolbarUIState7 = toolbarUIState22;
                mTicketTripInfoDataState8 = mTicketTripInfoDataState17;
                buttonUIState5 = buttonUIState23;
                productBookingBranding3 = productBookingBranding9;
                mTicketTripInfoUIStateFactory2 = mTicketTripInfoUIStateFactory21;
                objB7 = obj9;
                str2 = "";
                coroutineSingletons = coroutineSingletons6;
                loadingDialogUIState3 = loadingDialogUIState22;
                routeSelectionInputUIState = routeSelectionInputUIState20;
                chaloTextUIState5 = chaloTextUIState23;
                snackbarUIState3 = snackbarUIState21;
                str6 = (String) objB7;
                productBookingStopDetails = mTicketTripInfoDataState8.c;
                if (productBookingStopDetails != null) {
                    str7 = str2;
                } else {
                    str7 = str2;
                }
                list3 = EmptyList.f17557a;
                coroutineSingletons2 = coroutineSingletons;
                if (mTicketTripInfoDataState8.i == MTicketTripInfoMissingFieldError.FROM_STOP) {
                    mTicketTripInfoUIStateFactory$convertToUIState$1.L$0 = mTicketTripInfoDataState8;
                    mTicketTripInfoUIStateFactory$convertToUIState$1.L$1 = function8;
                    mTicketTripInfoUIStateFactory$convertToUIState$1.L$2 = toolbarUIState7;
                    mTicketTripInfoUIStateFactory$convertToUIState$1.L$3 = buttonUIState5;
                    mTicketTripInfoUIStateFactory$convertToUIState$1.L$4 = chaloTextUIState5;
                    mTicketTripInfoUIStateFactory$convertToUIState$1.L$5 = loadingDialogUIState3;
                    mTicketTripInfoUIStateFactory$convertToUIState$1.L$6 = productBookingBranding3;
                    mTicketTripInfoUIStateFactory$convertToUIState$1.L$7 = snackbarUIState3;
                    mTicketTripInfoUIStateFactory$convertToUIState$1.L$8 = routeSelectionInputUIState;
                    mTicketTripInfoUIStateFactory$convertToUIState$1.L$9 = mTicketTripInfoUIStateFactory2;
                    mTicketTripInfoUIStateFactory$convertToUIState$1.L$10 = str6;
                    mTicketTripInfoUIStateFactory$convertToUIState$1.L$11 = str7;
                    mTicketTripInfoUIStateFactory$convertToUIState$1.L$12 = list3;
                    mTicketTripInfoUIStateFactory$convertToUIState$1.label = 9;
                    loadingDialogUIState4 = loadingDialogUIState3;
                    stringProvider = stringProvider4;
                    objB8 = stringProvider.b(StringEnum.STATUS_ERROR_ENTER_STOP, new Object[0], mTicketTripInfoUIStateFactory$convertToUIState$1);
                    coroutineSingletons3 = coroutineSingletons2;
                    if (objB8 == coroutineSingletons3) {
                        return coroutineSingletons3;
                    }
                    TextUIState.ChaloTextUIState chaloTextUIState1111111111 = chaloTextUIState5;
                    str9 = str7;
                    obj7 = objB8;
                    chaloTextUIState7 = chaloTextUIState1111111111;
                    SnackbarUIState snackbarUIState11111111115 = snackbarUIState3;
                    routeSelectionInputUIState2 = routeSelectionInputUIState;
                    toolbarUIState8 = toolbarUIState7;
                    buttonUIState6 = buttonUIState5;
                    function9 = function8;
                    productBookingBranding4 = productBookingBranding3;
                    snackbarUIState4 = snackbarUIState11111111115;
                    coroutineSingletons2 = coroutineSingletons3;
                    mTicketTripInfoUIStateFactory3 = mTicketTripInfoUIStateFactory2;
                    str8 = (String) obj7;
                } else {
                    loadingDialogUIState4 = loadingDialogUIState3;
                    stringProvider = stringProvider4;
                    SnackbarUIState snackbarUIState11111111116 = snackbarUIState3;
                    routeSelectionInputUIState2 = routeSelectionInputUIState;
                    toolbarUIState8 = toolbarUIState7;
                    buttonUIState6 = buttonUIState5;
                    function9 = function8;
                    productBookingBranding4 = productBookingBranding3;
                    snackbarUIState4 = snackbarUIState11111111116;
                    chaloTextUIState7 = chaloTextUIState5;
                    mTicketTripInfoUIStateFactory3 = mTicketTripInfoUIStateFactory2;
                    str8 = null;
                    str9 = str7;
                }
                loadingDialogUIState5 = loadingDialogUIState4;
                StringProvider stringProvider1118 = stringProvider;
                wg0 wg0Var11111111110 = new wg0(function9, 5);
                mTicketTripInfoUIStateFactory3.getClass();
                routeSelectionInputUIStateC2 = c(str6, str9, list3, str8, wg0Var11111111110);
                mTicketTripInfoUIStateFactory$convertToUIState$1.L$0 = mTicketTripInfoDataState8;
                mTicketTripInfoUIStateFactory$convertToUIState$1.L$1 = function9;
                mTicketTripInfoUIStateFactory$convertToUIState$1.L$2 = toolbarUIState8;
                mTicketTripInfoUIStateFactory$convertToUIState$1.L$3 = buttonUIState6;
                mTicketTripInfoUIStateFactory$convertToUIState$1.L$4 = chaloTextUIState7;
                mTicketTripInfoUIStateFactory$convertToUIState$1.L$5 = loadingDialogUIState5;
                mTicketTripInfoUIStateFactory$convertToUIState$1.L$6 = productBookingBranding4;
                mTicketTripInfoUIStateFactory$convertToUIState$1.L$7 = snackbarUIState4;
                mTicketTripInfoUIStateFactory$convertToUIState$1.L$8 = routeSelectionInputUIState2;
                mTicketTripInfoUIStateFactory$convertToUIState$1.L$9 = routeSelectionInputUIStateC2;
                mTicketTripInfoUIStateFactory$convertToUIState$1.L$10 = this;
                mTicketTripInfoUIStateFactory$convertToUIState$1.L$11 = null;
                mTicketTripInfoUIStateFactory$convertToUIState$1.L$12 = null;
                mTicketTripInfoUIStateFactory$convertToUIState$1.label = 10;
                stringProvider2 = stringProvider1118;
                objB9 = stringProvider2.b(StringEnum.HINT_END_STOP, new Object[0], mTicketTripInfoUIStateFactory$convertToUIState$1);
                coroutineSingletons4 = coroutineSingletons2;
                if (objB9 == coroutineSingletons4) {
                    return coroutineSingletons4;
                }
                loadingDialogUIState6 = loadingDialogUIState5;
                obj8 = objB9;
                toolbarUIState9 = toolbarUIState8;
                routeSelectionInputUIState3 = routeSelectionInputUIStateC2;
                mTicketTripInfoUIStateFactory4 = this;
                str10 = (String) obj8;
                productBookingStopDetails2 = mTicketTripInfoDataState8.d;
                if (productBookingStopDetails2 != null) {
                    str11 = str2;
                } else {
                    str11 = str2;
                }
                coroutineSingletons5 = coroutineSingletons4;
                list4 = EmptyList.f17557a;
                stringProvider3 = stringProvider2;
                if (mTicketTripInfoDataState8.i == MTicketTripInfoMissingFieldError.TO_STOP) {
                    mTicketTripInfoUIStateFactory$convertToUIState$1.L$0 = function9;
                    mTicketTripInfoUIStateFactory$convertToUIState$1.L$1 = toolbarUIState9;
                    mTicketTripInfoUIStateFactory$convertToUIState$1.L$2 = buttonUIState6;
                    mTicketTripInfoUIStateFactory$convertToUIState$1.L$3 = chaloTextUIState7;
                    mTicketTripInfoUIStateFactory$convertToUIState$1.L$4 = loadingDialogUIState6;
                    mTicketTripInfoUIStateFactory$convertToUIState$1.L$5 = productBookingBranding4;
                    mTicketTripInfoUIStateFactory$convertToUIState$1.L$6 = snackbarUIState4;
                    mTicketTripInfoUIStateFactory$convertToUIState$1.L$7 = routeSelectionInputUIState2;
                    mTicketTripInfoUIStateFactory$convertToUIState$1.L$8 = routeSelectionInputUIState3;
                    mTicketTripInfoUIStateFactory$convertToUIState$1.L$9 = mTicketTripInfoUIStateFactory4;
                    mTicketTripInfoUIStateFactory$convertToUIState$1.L$10 = str10;
                    mTicketTripInfoUIStateFactory$convertToUIState$1.L$11 = str11;
                    mTicketTripInfoUIStateFactory$convertToUIState$1.L$12 = list4;
                    mTicketTripInfoUIStateFactory6 = mTicketTripInfoUIStateFactory4;
                    mTicketTripInfoUIStateFactory$convertToUIState$1.label = 11;
                    objB10 = stringProvider3.b(StringEnum.STATUS_ERROR_ENTER_STOP, new Object[0], mTicketTripInfoUIStateFactory$convertToUIState$1);
                    if (objB10 == coroutineSingletons5) {
                        return coroutineSingletons5;
                    }
                    chaloTextUIState9 = chaloTextUIState7;
                    routeSelectionInputUIState6 = routeSelectionInputUIState2;
                    productBookingBranding6 = productBookingBranding4;
                    function10 = function9;
                    buttonUIState7 = buttonUIState6;
                    str13 = str10;
                    toolbarUIState11 = toolbarUIState9;
                    routeSelectionInputUIState7 = routeSelectionInputUIState3;
                    snackbarUIState5 = snackbarUIState4;
                    obj9 = objB10;
                    loadingDialogUIState8 = loadingDialogUIState6;
                    list5 = list4;
                    mTicketTripInfoUIStateFactory7 = mTicketTripInfoUIStateFactory6;
                    String str11111119 = (String) obj9;
                    Function1 function11115 = function10;
                    str12 = str11111119;
                    mTicketTripInfoUIStateFactory5 = mTicketTripInfoUIStateFactory7;
                    list4 = list5;
                    toolbarUIState10 = toolbarUIState11;
                    function9 = function11115;
                    LoadingDialogUIState loadingDialogUIState11112 = loadingDialogUIState8;
                    snackbarUIState4 = snackbarUIState5;
                    productBookingBranding5 = productBookingBranding6;
                    loadingDialogUIState7 = loadingDialogUIState11112;
                    str10 = str13;
                    routeSelectionInputUIState5 = routeSelectionInputUIState7;
                    routeSelectionInputUIState4 = routeSelectionInputUIState6;
                    chaloTextUIState8 = chaloTextUIState9;
                    buttonUIState6 = buttonUIState7;
                } else {
                    MTicketTripInfoUIStateFactory mTicketTripInfoUIStateFactory11111114 = mTicketTripInfoUIStateFactory4;
                    RouteSelectionInputUIState routeSelectionInputUIState11111 = routeSelectionInputUIState2;
                    loadingDialogUIState7 = loadingDialogUIState6;
                    toolbarUIState10 = toolbarUIState9;
                    routeSelectionInputUIState4 = routeSelectionInputUIState11111;
                    chaloTextUIState8 = chaloTextUIState7;
                    routeSelectionInputUIState5 = routeSelectionInputUIState3;
                    productBookingBranding5 = productBookingBranding4;
                    mTicketTripInfoUIStateFactory5 = mTicketTripInfoUIStateFactory11111114;
                    str12 = null;
                }
                wg0 wg0Var11111111111 = new wg0(function9, 6);
                mTicketTripInfoUIStateFactory5.getClass();
                return new MTicketTripInfoUIState(toolbarUIState10, routeSelectionInputUIState4, routeSelectionInputUIState5, c(str10, str11, list4, str12, wg0Var11111111111), buttonUIState6, chaloTextUIState8, productBookingBranding5, loadingDialogUIState7, snackbarUIState4);
            case 9:
                List list21 = (List) mTicketTripInfoUIStateFactory$convertToUIState$1.L$12;
                str9 = (String) mTicketTripInfoUIStateFactory$convertToUIState$1.L$11;
                str6 = (String) mTicketTripInfoUIStateFactory$convertToUIState$1.L$10;
                mTicketTripInfoUIStateFactory2 = (MTicketTripInfoUIStateFactory) mTicketTripInfoUIStateFactory$convertToUIState$1.L$9;
                routeSelectionInputUIState = (RouteSelectionInputUIState) mTicketTripInfoUIStateFactory$convertToUIState$1.L$8;
                snackbarUIState3 = (SnackbarUIState) mTicketTripInfoUIStateFactory$convertToUIState$1.L$7;
                productBookingBranding3 = (ProductBookingBranding) mTicketTripInfoUIStateFactory$convertToUIState$1.L$6;
                LoadingDialogUIState loadingDialogUIState23 = (LoadingDialogUIState) mTicketTripInfoUIStateFactory$convertToUIState$1.L$5;
                TextUIState.ChaloTextUIState chaloTextUIState24 = (TextUIState.ChaloTextUIState) mTicketTripInfoUIStateFactory$convertToUIState$1.L$4;
                buttonUIState5 = (ButtonUIState) mTicketTripInfoUIStateFactory$convertToUIState$1.L$3;
                toolbarUIState7 = (ToolbarUIState) mTicketTripInfoUIStateFactory$convertToUIState$1.L$2;
                Function1 function22 = (Function1) mTicketTripInfoUIStateFactory$convertToUIState$1.L$1;
                MTicketTripInfoDataState mTicketTripInfoDataState18 = (MTicketTripInfoDataState) mTicketTripInfoUIStateFactory$convertToUIState$1.L$0;
                ResultKt.b(obj9);
                stringProvider = stringProvider4;
                loadingDialogUIState4 = loadingDialogUIState23;
                mTicketTripInfoDataState8 = mTicketTripInfoDataState18;
                coroutineSingletons3 = coroutineSingletons6;
                obj7 = obj9;
                list3 = list21;
                str2 = "";
                chaloTextUIState7 = chaloTextUIState24;
                function8 = function22;
                SnackbarUIState snackbarUIState11111111117 = snackbarUIState3;
                routeSelectionInputUIState2 = routeSelectionInputUIState;
                toolbarUIState8 = toolbarUIState7;
                buttonUIState6 = buttonUIState5;
                function9 = function8;
                productBookingBranding4 = productBookingBranding3;
                snackbarUIState4 = snackbarUIState11111111117;
                coroutineSingletons2 = coroutineSingletons3;
                mTicketTripInfoUIStateFactory3 = mTicketTripInfoUIStateFactory2;
                str8 = (String) obj7;
                loadingDialogUIState5 = loadingDialogUIState4;
                StringProvider stringProvider1119 = stringProvider;
                wg0 wg0Var11111111112 = new wg0(function9, 5);
                mTicketTripInfoUIStateFactory3.getClass();
                routeSelectionInputUIStateC2 = c(str6, str9, list3, str8, wg0Var11111111112);
                mTicketTripInfoUIStateFactory$convertToUIState$1.L$0 = mTicketTripInfoDataState8;
                mTicketTripInfoUIStateFactory$convertToUIState$1.L$1 = function9;
                mTicketTripInfoUIStateFactory$convertToUIState$1.L$2 = toolbarUIState8;
                mTicketTripInfoUIStateFactory$convertToUIState$1.L$3 = buttonUIState6;
                mTicketTripInfoUIStateFactory$convertToUIState$1.L$4 = chaloTextUIState7;
                mTicketTripInfoUIStateFactory$convertToUIState$1.L$5 = loadingDialogUIState5;
                mTicketTripInfoUIStateFactory$convertToUIState$1.L$6 = productBookingBranding4;
                mTicketTripInfoUIStateFactory$convertToUIState$1.L$7 = snackbarUIState4;
                mTicketTripInfoUIStateFactory$convertToUIState$1.L$8 = routeSelectionInputUIState2;
                mTicketTripInfoUIStateFactory$convertToUIState$1.L$9 = routeSelectionInputUIStateC2;
                mTicketTripInfoUIStateFactory$convertToUIState$1.L$10 = this;
                mTicketTripInfoUIStateFactory$convertToUIState$1.L$11 = null;
                mTicketTripInfoUIStateFactory$convertToUIState$1.L$12 = null;
                mTicketTripInfoUIStateFactory$convertToUIState$1.label = 10;
                stringProvider2 = stringProvider1119;
                objB9 = stringProvider2.b(StringEnum.HINT_END_STOP, new Object[0], mTicketTripInfoUIStateFactory$convertToUIState$1);
                coroutineSingletons4 = coroutineSingletons2;
                if (objB9 == coroutineSingletons4) {
                    return coroutineSingletons4;
                }
                loadingDialogUIState6 = loadingDialogUIState5;
                obj8 = objB9;
                toolbarUIState9 = toolbarUIState8;
                routeSelectionInputUIState3 = routeSelectionInputUIStateC2;
                mTicketTripInfoUIStateFactory4 = this;
                str10 = (String) obj8;
                productBookingStopDetails2 = mTicketTripInfoDataState8.d;
                if (productBookingStopDetails2 != null) {
                    str11 = str2;
                } else {
                    str11 = str2;
                }
                coroutineSingletons5 = coroutineSingletons4;
                list4 = EmptyList.f17557a;
                stringProvider3 = stringProvider2;
                if (mTicketTripInfoDataState8.i == MTicketTripInfoMissingFieldError.TO_STOP) {
                    mTicketTripInfoUIStateFactory$convertToUIState$1.L$0 = function9;
                    mTicketTripInfoUIStateFactory$convertToUIState$1.L$1 = toolbarUIState9;
                    mTicketTripInfoUIStateFactory$convertToUIState$1.L$2 = buttonUIState6;
                    mTicketTripInfoUIStateFactory$convertToUIState$1.L$3 = chaloTextUIState7;
                    mTicketTripInfoUIStateFactory$convertToUIState$1.L$4 = loadingDialogUIState6;
                    mTicketTripInfoUIStateFactory$convertToUIState$1.L$5 = productBookingBranding4;
                    mTicketTripInfoUIStateFactory$convertToUIState$1.L$6 = snackbarUIState4;
                    mTicketTripInfoUIStateFactory$convertToUIState$1.L$7 = routeSelectionInputUIState2;
                    mTicketTripInfoUIStateFactory$convertToUIState$1.L$8 = routeSelectionInputUIState3;
                    mTicketTripInfoUIStateFactory$convertToUIState$1.L$9 = mTicketTripInfoUIStateFactory4;
                    mTicketTripInfoUIStateFactory$convertToUIState$1.L$10 = str10;
                    mTicketTripInfoUIStateFactory$convertToUIState$1.L$11 = str11;
                    mTicketTripInfoUIStateFactory$convertToUIState$1.L$12 = list4;
                    mTicketTripInfoUIStateFactory6 = mTicketTripInfoUIStateFactory4;
                    mTicketTripInfoUIStateFactory$convertToUIState$1.label = 11;
                    objB10 = stringProvider3.b(StringEnum.STATUS_ERROR_ENTER_STOP, new Object[0], mTicketTripInfoUIStateFactory$convertToUIState$1);
                    if (objB10 == coroutineSingletons5) {
                        return coroutineSingletons5;
                    }
                    chaloTextUIState9 = chaloTextUIState7;
                    routeSelectionInputUIState6 = routeSelectionInputUIState2;
                    productBookingBranding6 = productBookingBranding4;
                    function10 = function9;
                    buttonUIState7 = buttonUIState6;
                    str13 = str10;
                    toolbarUIState11 = toolbarUIState9;
                    routeSelectionInputUIState7 = routeSelectionInputUIState3;
                    snackbarUIState5 = snackbarUIState4;
                    obj9 = objB10;
                    loadingDialogUIState8 = loadingDialogUIState6;
                    list5 = list4;
                    mTicketTripInfoUIStateFactory7 = mTicketTripInfoUIStateFactory6;
                    String str111111110 = (String) obj9;
                    Function1 function11116 = function10;
                    str12 = str111111110;
                    mTicketTripInfoUIStateFactory5 = mTicketTripInfoUIStateFactory7;
                    list4 = list5;
                    toolbarUIState10 = toolbarUIState11;
                    function9 = function11116;
                    LoadingDialogUIState loadingDialogUIState11113 = loadingDialogUIState8;
                    snackbarUIState4 = snackbarUIState5;
                    productBookingBranding5 = productBookingBranding6;
                    loadingDialogUIState7 = loadingDialogUIState11113;
                    str10 = str13;
                    routeSelectionInputUIState5 = routeSelectionInputUIState7;
                    routeSelectionInputUIState4 = routeSelectionInputUIState6;
                    chaloTextUIState8 = chaloTextUIState9;
                    buttonUIState6 = buttonUIState7;
                } else {
                    MTicketTripInfoUIStateFactory mTicketTripInfoUIStateFactory11111115 = mTicketTripInfoUIStateFactory4;
                    RouteSelectionInputUIState routeSelectionInputUIState11112 = routeSelectionInputUIState2;
                    loadingDialogUIState7 = loadingDialogUIState6;
                    toolbarUIState10 = toolbarUIState9;
                    routeSelectionInputUIState4 = routeSelectionInputUIState11112;
                    chaloTextUIState8 = chaloTextUIState7;
                    routeSelectionInputUIState5 = routeSelectionInputUIState3;
                    productBookingBranding5 = productBookingBranding4;
                    mTicketTripInfoUIStateFactory5 = mTicketTripInfoUIStateFactory11111115;
                    str12 = null;
                }
                wg0 wg0Var11111111113 = new wg0(function9, 6);
                mTicketTripInfoUIStateFactory5.getClass();
                return new MTicketTripInfoUIState(toolbarUIState10, routeSelectionInputUIState4, routeSelectionInputUIState5, c(str10, str11, list4, str12, wg0Var11111111113), buttonUIState6, chaloTextUIState8, productBookingBranding5, loadingDialogUIState7, snackbarUIState4);
            case 10:
                MTicketTripInfoUIStateFactory mTicketTripInfoUIStateFactory22 = (MTicketTripInfoUIStateFactory) mTicketTripInfoUIStateFactory$convertToUIState$1.L$10;
                routeSelectionInputUIState3 = (RouteSelectionInputUIState) mTicketTripInfoUIStateFactory$convertToUIState$1.L$9;
                routeSelectionInputUIState2 = (RouteSelectionInputUIState) mTicketTripInfoUIStateFactory$convertToUIState$1.L$8;
                snackbarUIState4 = (SnackbarUIState) mTicketTripInfoUIStateFactory$convertToUIState$1.L$7;
                ProductBookingBranding productBookingBranding10 = (ProductBookingBranding) mTicketTripInfoUIStateFactory$convertToUIState$1.L$6;
                LoadingDialogUIState loadingDialogUIState24 = (LoadingDialogUIState) mTicketTripInfoUIStateFactory$convertToUIState$1.L$5;
                TextUIState.ChaloTextUIState chaloTextUIState25 = (TextUIState.ChaloTextUIState) mTicketTripInfoUIStateFactory$convertToUIState$1.L$4;
                buttonUIState6 = (ButtonUIState) mTicketTripInfoUIStateFactory$convertToUIState$1.L$3;
                ToolbarUIState toolbarUIState23 = (ToolbarUIState) mTicketTripInfoUIStateFactory$convertToUIState$1.L$2;
                Function1 function23 = (Function1) mTicketTripInfoUIStateFactory$convertToUIState$1.L$1;
                MTicketTripInfoDataState mTicketTripInfoDataState19 = (MTicketTripInfoDataState) mTicketTripInfoUIStateFactory$convertToUIState$1.L$0;
                ResultKt.b(obj9);
                mTicketTripInfoUIStateFactory4 = mTicketTripInfoUIStateFactory22;
                mTicketTripInfoDataState8 = mTicketTripInfoDataState19;
                obj8 = obj9;
                str2 = "";
                chaloTextUIState7 = chaloTextUIState25;
                function9 = function23;
                coroutineSingletons4 = coroutineSingletons6;
                loadingDialogUIState6 = loadingDialogUIState24;
                productBookingBranding4 = productBookingBranding10;
                stringProvider2 = stringProvider4;
                toolbarUIState9 = toolbarUIState23;
                str10 = (String) obj8;
                productBookingStopDetails2 = mTicketTripInfoDataState8.d;
                if (productBookingStopDetails2 != null) {
                    str11 = str2;
                } else {
                    str11 = str2;
                }
                coroutineSingletons5 = coroutineSingletons4;
                list4 = EmptyList.f17557a;
                stringProvider3 = stringProvider2;
                if (mTicketTripInfoDataState8.i == MTicketTripInfoMissingFieldError.TO_STOP) {
                    mTicketTripInfoUIStateFactory$convertToUIState$1.L$0 = function9;
                    mTicketTripInfoUIStateFactory$convertToUIState$1.L$1 = toolbarUIState9;
                    mTicketTripInfoUIStateFactory$convertToUIState$1.L$2 = buttonUIState6;
                    mTicketTripInfoUIStateFactory$convertToUIState$1.L$3 = chaloTextUIState7;
                    mTicketTripInfoUIStateFactory$convertToUIState$1.L$4 = loadingDialogUIState6;
                    mTicketTripInfoUIStateFactory$convertToUIState$1.L$5 = productBookingBranding4;
                    mTicketTripInfoUIStateFactory$convertToUIState$1.L$6 = snackbarUIState4;
                    mTicketTripInfoUIStateFactory$convertToUIState$1.L$7 = routeSelectionInputUIState2;
                    mTicketTripInfoUIStateFactory$convertToUIState$1.L$8 = routeSelectionInputUIState3;
                    mTicketTripInfoUIStateFactory$convertToUIState$1.L$9 = mTicketTripInfoUIStateFactory4;
                    mTicketTripInfoUIStateFactory$convertToUIState$1.L$10 = str10;
                    mTicketTripInfoUIStateFactory$convertToUIState$1.L$11 = str11;
                    mTicketTripInfoUIStateFactory$convertToUIState$1.L$12 = list4;
                    mTicketTripInfoUIStateFactory6 = mTicketTripInfoUIStateFactory4;
                    mTicketTripInfoUIStateFactory$convertToUIState$1.label = 11;
                    objB10 = stringProvider3.b(StringEnum.STATUS_ERROR_ENTER_STOP, new Object[0], mTicketTripInfoUIStateFactory$convertToUIState$1);
                    if (objB10 == coroutineSingletons5) {
                        return coroutineSingletons5;
                    }
                    chaloTextUIState9 = chaloTextUIState7;
                    routeSelectionInputUIState6 = routeSelectionInputUIState2;
                    productBookingBranding6 = productBookingBranding4;
                    function10 = function9;
                    buttonUIState7 = buttonUIState6;
                    str13 = str10;
                    toolbarUIState11 = toolbarUIState9;
                    routeSelectionInputUIState7 = routeSelectionInputUIState3;
                    snackbarUIState5 = snackbarUIState4;
                    obj9 = objB10;
                    loadingDialogUIState8 = loadingDialogUIState6;
                    list5 = list4;
                    mTicketTripInfoUIStateFactory7 = mTicketTripInfoUIStateFactory6;
                    String str111111111 = (String) obj9;
                    Function1 function11117 = function10;
                    str12 = str111111111;
                    mTicketTripInfoUIStateFactory5 = mTicketTripInfoUIStateFactory7;
                    list4 = list5;
                    toolbarUIState10 = toolbarUIState11;
                    function9 = function11117;
                    LoadingDialogUIState loadingDialogUIState11114 = loadingDialogUIState8;
                    snackbarUIState4 = snackbarUIState5;
                    productBookingBranding5 = productBookingBranding6;
                    loadingDialogUIState7 = loadingDialogUIState11114;
                    str10 = str13;
                    routeSelectionInputUIState5 = routeSelectionInputUIState7;
                    routeSelectionInputUIState4 = routeSelectionInputUIState6;
                    chaloTextUIState8 = chaloTextUIState9;
                    buttonUIState6 = buttonUIState7;
                } else {
                    MTicketTripInfoUIStateFactory mTicketTripInfoUIStateFactory11111116 = mTicketTripInfoUIStateFactory4;
                    RouteSelectionInputUIState routeSelectionInputUIState11113 = routeSelectionInputUIState2;
                    loadingDialogUIState7 = loadingDialogUIState6;
                    toolbarUIState10 = toolbarUIState9;
                    routeSelectionInputUIState4 = routeSelectionInputUIState11113;
                    chaloTextUIState8 = chaloTextUIState7;
                    routeSelectionInputUIState5 = routeSelectionInputUIState3;
                    productBookingBranding5 = productBookingBranding4;
                    mTicketTripInfoUIStateFactory5 = mTicketTripInfoUIStateFactory11111116;
                    str12 = null;
                }
                wg0 wg0Var11111111114 = new wg0(function9, 6);
                mTicketTripInfoUIStateFactory5.getClass();
                return new MTicketTripInfoUIState(toolbarUIState10, routeSelectionInputUIState4, routeSelectionInputUIState5, c(str10, str11, list4, str12, wg0Var11111111114), buttonUIState6, chaloTextUIState8, productBookingBranding5, loadingDialogUIState7, snackbarUIState4);
            case 11:
                list5 = (List) mTicketTripInfoUIStateFactory$convertToUIState$1.L$12;
                str11 = (String) mTicketTripInfoUIStateFactory$convertToUIState$1.L$11;
                str13 = (String) mTicketTripInfoUIStateFactory$convertToUIState$1.L$10;
                mTicketTripInfoUIStateFactory7 = (MTicketTripInfoUIStateFactory) mTicketTripInfoUIStateFactory$convertToUIState$1.L$9;
                routeSelectionInputUIState7 = (RouteSelectionInputUIState) mTicketTripInfoUIStateFactory$convertToUIState$1.L$8;
                routeSelectionInputUIState6 = (RouteSelectionInputUIState) mTicketTripInfoUIStateFactory$convertToUIState$1.L$7;
                snackbarUIState5 = (SnackbarUIState) mTicketTripInfoUIStateFactory$convertToUIState$1.L$6;
                productBookingBranding6 = (ProductBookingBranding) mTicketTripInfoUIStateFactory$convertToUIState$1.L$5;
                loadingDialogUIState8 = (LoadingDialogUIState) mTicketTripInfoUIStateFactory$convertToUIState$1.L$4;
                chaloTextUIState9 = (TextUIState.ChaloTextUIState) mTicketTripInfoUIStateFactory$convertToUIState$1.L$3;
                buttonUIState7 = (ButtonUIState) mTicketTripInfoUIStateFactory$convertToUIState$1.L$2;
                toolbarUIState11 = (ToolbarUIState) mTicketTripInfoUIStateFactory$convertToUIState$1.L$1;
                function10 = (Function1) mTicketTripInfoUIStateFactory$convertToUIState$1.L$0;
                ResultKt.b(obj9);
                String str111111112 = (String) obj9;
                Function1 function11118 = function10;
                str12 = str111111112;
                mTicketTripInfoUIStateFactory5 = mTicketTripInfoUIStateFactory7;
                list4 = list5;
                toolbarUIState10 = toolbarUIState11;
                function9 = function11118;
                LoadingDialogUIState loadingDialogUIState11115 = loadingDialogUIState8;
                snackbarUIState4 = snackbarUIState5;
                productBookingBranding5 = productBookingBranding6;
                loadingDialogUIState7 = loadingDialogUIState11115;
                str10 = str13;
                routeSelectionInputUIState5 = routeSelectionInputUIState7;
                routeSelectionInputUIState4 = routeSelectionInputUIState6;
                chaloTextUIState8 = chaloTextUIState9;
                buttonUIState6 = buttonUIState7;
                wg0 wg0Var11111111115 = new wg0(function9, 6);
                mTicketTripInfoUIStateFactory5.getClass();
                return new MTicketTripInfoUIState(toolbarUIState10, routeSelectionInputUIState4, routeSelectionInputUIState5, c(str10, str11, list4, str12, wg0Var11111111115), buttonUIState6, chaloTextUIState8, productBookingBranding5, loadingDialogUIState7, snackbarUIState4);
            default:
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX WARN: Code duplicated, block: B:30:0x007b  */
    /* JADX WARN: Code duplicated, block: B:39:0x00ad  */
    /* JADX WARN: Code duplicated, block: B:43:0x00c1  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object b(boolean z, ContinuationImpl continuationImpl) {
        MTicketTripInfoUIStateFactory$freeRideBannerText$1 mTicketTripInfoUIStateFactory$freeRideBannerText$1;
        Object objB;
        Object obj;
        Object objB2;
        Object obj2;
        Object objB3;
        Object obj3;
        Object obj4;
        if (continuationImpl instanceof MTicketTripInfoUIStateFactory$freeRideBannerText$1) {
            mTicketTripInfoUIStateFactory$freeRideBannerText$1 = (MTicketTripInfoUIStateFactory$freeRideBannerText$1) continuationImpl;
            int i = mTicketTripInfoUIStateFactory$freeRideBannerText$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                mTicketTripInfoUIStateFactory$freeRideBannerText$1.label = i - Integer.MIN_VALUE;
            } else {
                mTicketTripInfoUIStateFactory$freeRideBannerText$1 = new MTicketTripInfoUIStateFactory$freeRideBannerText$1(this, continuationImpl);
            }
        } else {
            mTicketTripInfoUIStateFactory$freeRideBannerText$1 = new MTicketTripInfoUIStateFactory$freeRideBannerText$1(this, continuationImpl);
        }
        Object objB4 = mTicketTripInfoUIStateFactory$freeRideBannerText$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = mTicketTripInfoUIStateFactory$freeRideBannerText$1.label;
        StringProvider stringProvider = this.f5786a;
        if (i2 == 0) {
            ResultKt.b(objB4);
            if (z) {
                mTicketTripInfoUIStateFactory$freeRideBannerText$1.label = 1;
                objB4 = stringProvider.b(StringEnum.TV_BANNER_FREE_RIDE_INFO, new Object[0], mTicketTripInfoUIStateFactory$freeRideBannerText$1);
                if (objB4 != coroutineSingletons) {
                    mTicketTripInfoUIStateFactory$freeRideBannerText$1.L$0 = objB4;
                    mTicketTripInfoUIStateFactory$freeRideBannerText$1.label = 2;
                    objB = stringProvider.b(StringEnum.FREE_RIDE_HOW_IT_WORKS, new Object[0], mTicketTripInfoUIStateFactory$freeRideBannerText$1);
                    if (objB != coroutineSingletons) {
                        Object obj5 = objB4;
                        objB4 = objB;
                        obj = obj5;
                        return obj + " " + objB4;
                    }
                }
            } else {
                mTicketTripInfoUIStateFactory$freeRideBannerText$1.label = 3;
                objB4 = stringProvider.b(StringEnum.TV_BANNER_FREE_RIDE_REDEEMED_INFO, new Object[0], mTicketTripInfoUIStateFactory$freeRideBannerText$1);
                if (objB4 != coroutineSingletons) {
                    mTicketTripInfoUIStateFactory$freeRideBannerText$1.L$0 = objB4;
                    mTicketTripInfoUIStateFactory$freeRideBannerText$1.label = 4;
                    objB2 = stringProvider.b(StringEnum.TV_BANNER_FREE_RIDE_SHARE_NOW_INFO, new Object[0], mTicketTripInfoUIStateFactory$freeRideBannerText$1);
                    if (objB2 != coroutineSingletons) {
                        Object obj6 = objB4;
                        objB4 = objB2;
                        obj2 = obj6;
                        mTicketTripInfoUIStateFactory$freeRideBannerText$1.L$0 = obj2;
                        mTicketTripInfoUIStateFactory$freeRideBannerText$1.L$1 = objB4;
                        mTicketTripInfoUIStateFactory$freeRideBannerText$1.label = 5;
                        objB3 = stringProvider.b(StringEnum.TV_BANNER_FREE_RIDE_SHARE_NOW_BTN, new Object[0], mTicketTripInfoUIStateFactory$freeRideBannerText$1);
                        if (objB3 != coroutineSingletons) {
                            obj3 = obj2;
                            obj4 = objB4;
                            objB4 = objB3;
                            return obj3 + "\n\n" + obj4 + " " + objB4;
                        }
                    }
                }
            }
            return coroutineSingletons;
        }
        if (i2 == 1) {
            ResultKt.b(objB4);
            mTicketTripInfoUIStateFactory$freeRideBannerText$1.L$0 = objB4;
            mTicketTripInfoUIStateFactory$freeRideBannerText$1.label = 2;
            objB = stringProvider.b(StringEnum.FREE_RIDE_HOW_IT_WORKS, new Object[0], mTicketTripInfoUIStateFactory$freeRideBannerText$1);
            if (objB != coroutineSingletons) {
                Object obj7 = objB4;
                objB4 = objB;
                obj = obj7;
            }
            return coroutineSingletons;
        }
        if (i2 != 2) {
            if (i2 == 3) {
                ResultKt.b(objB4);
                mTicketTripInfoUIStateFactory$freeRideBannerText$1.L$0 = objB4;
                mTicketTripInfoUIStateFactory$freeRideBannerText$1.label = 4;
                objB2 = stringProvider.b(StringEnum.TV_BANNER_FREE_RIDE_SHARE_NOW_INFO, new Object[0], mTicketTripInfoUIStateFactory$freeRideBannerText$1);
                if (objB2 != coroutineSingletons) {
                    Object obj8 = objB4;
                    objB4 = objB2;
                    obj2 = obj8;
                    mTicketTripInfoUIStateFactory$freeRideBannerText$1.L$0 = obj2;
                    mTicketTripInfoUIStateFactory$freeRideBannerText$1.L$1 = objB4;
                    mTicketTripInfoUIStateFactory$freeRideBannerText$1.label = 5;
                    objB3 = stringProvider.b(StringEnum.TV_BANNER_FREE_RIDE_SHARE_NOW_BTN, new Object[0], mTicketTripInfoUIStateFactory$freeRideBannerText$1);
                    if (objB3 != coroutineSingletons) {
                        obj3 = obj2;
                        obj4 = objB4;
                        objB4 = objB3;
                    }
                }
                return coroutineSingletons;
            }
            if (i2 == 4) {
                obj2 = mTicketTripInfoUIStateFactory$freeRideBannerText$1.L$0;
                ResultKt.b(objB4);
                mTicketTripInfoUIStateFactory$freeRideBannerText$1.L$0 = obj2;
                mTicketTripInfoUIStateFactory$freeRideBannerText$1.L$1 = objB4;
                mTicketTripInfoUIStateFactory$freeRideBannerText$1.label = 5;
                objB3 = stringProvider.b(StringEnum.TV_BANNER_FREE_RIDE_SHARE_NOW_BTN, new Object[0], mTicketTripInfoUIStateFactory$freeRideBannerText$1);
                if (objB3 != coroutineSingletons) {
                    obj3 = obj2;
                    obj4 = objB4;
                    objB4 = objB3;
                }
                return coroutineSingletons;
            }
            if (i2 != 5) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            obj4 = mTicketTripInfoUIStateFactory$freeRideBannerText$1.L$1;
            obj3 = mTicketTripInfoUIStateFactory$freeRideBannerText$1.L$0;
            ResultKt.b(objB4);
            return obj3 + "\n\n" + obj4 + " " + objB4;
        }
        obj = mTicketTripInfoUIStateFactory$freeRideBannerText$1.L$0;
        ResultKt.b(objB4);
        return obj + " " + objB4;
    }

    /* JADX WARN: Code duplicated, block: B:43:0x00fa  */
    /* JADX WARN: Code duplicated, block: B:55:0x0140  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object d(MTicketTripInfoSnackBarType mTicketTripInfoSnackBarType, Function1 function1, ContinuationImpl continuationImpl) {
        MTicketTripInfoUIStateFactory$snackBarUIState$1 mTicketTripInfoUIStateFactory$snackBarUIState$1;
        Function1 function2;
        SnackbarUIStateFactory snackbarUIStateFactory;
        Function1 function3;
        SnackbarUIStateFactory snackbarUIStateFactory2;
        SnackbarUIStateFactory snackbarUIStateFactory3;
        SnackbarUIStateFactory snackbarUIStateFactory4;
        String str;
        Object objB;
        Function1 function4;
        String str2;
        String str3;
        Object objB2;
        Function1 function5;
        String str4;
        if (continuationImpl instanceof MTicketTripInfoUIStateFactory$snackBarUIState$1) {
            mTicketTripInfoUIStateFactory$snackBarUIState$1 = (MTicketTripInfoUIStateFactory$snackBarUIState$1) continuationImpl;
            int i = mTicketTripInfoUIStateFactory$snackBarUIState$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                mTicketTripInfoUIStateFactory$snackBarUIState$1.label = i - Integer.MIN_VALUE;
            } else {
                mTicketTripInfoUIStateFactory$snackBarUIState$1 = new MTicketTripInfoUIStateFactory$snackBarUIState$1(this, continuationImpl);
            }
        } else {
            mTicketTripInfoUIStateFactory$snackBarUIState$1 = new MTicketTripInfoUIStateFactory$snackBarUIState$1(this, continuationImpl);
        }
        Object objB3 = mTicketTripInfoUIStateFactory$snackBarUIState$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = mTicketTripInfoUIStateFactory$snackBarUIState$1.label;
        StringProvider stringProvider = this.f5786a;
        switch (i2) {
            case 0:
                ResultKt.b(objB3);
                boolean zD = Intrinsics.d(mTicketTripInfoSnackBarType, MTicketTripInfoSnackBarType.FetchingRouteDetails.f5780a);
                SnackbarUIStateFactory snackbarUIStateFactory5 = SnackbarUIStateFactory.f10071a;
                if (zD) {
                    mTicketTripInfoUIStateFactory$snackBarUIState$1.L$0 = snackbarUIStateFactory5;
                    mTicketTripInfoUIStateFactory$snackBarUIState$1.label = 1;
                    objB3 = stringProvider.b(StringEnum.FETCHING_ROUTE_DETAILS, new Object[0], mTicketTripInfoUIStateFactory$snackBarUIState$1);
                    if (objB3 != coroutineSingletons) {
                        snackbarUIStateFactory4 = snackbarUIStateFactory5;
                        snackbarUIStateFactory4.getClass();
                        return SnackbarUIStateFactory.a((String) objB3, null, null);
                    }
                } else if (Intrinsics.d(mTicketTripInfoSnackBarType, MTicketTripInfoSnackBarType.FetchingUserFreeRideCount.f5781a)) {
                    mTicketTripInfoUIStateFactory$snackBarUIState$1.L$0 = snackbarUIStateFactory5;
                    mTicketTripInfoUIStateFactory$snackBarUIState$1.label = 2;
                    objB3 = stringProvider.b(StringEnum.FETCHING_MTICKET_DATA, new Object[0], mTicketTripInfoUIStateFactory$snackBarUIState$1);
                    if (objB3 != coroutineSingletons) {
                        snackbarUIStateFactory3 = snackbarUIStateFactory5;
                        snackbarUIStateFactory3.getClass();
                        return SnackbarUIStateFactory.a((String) objB3, null, null);
                    }
                } else if (mTicketTripInfoSnackBarType instanceof MTicketTripInfoSnackBarType.ProductFetchFailed) {
                    mTicketTripInfoUIStateFactory$snackBarUIState$1.L$0 = function1;
                    mTicketTripInfoUIStateFactory$snackBarUIState$1.L$1 = snackbarUIStateFactory5;
                    mTicketTripInfoUIStateFactory$snackBarUIState$1.label = 3;
                    objB3 = stringProvider.b(StringEnum.SOMETHING_WENT_WRONG, new Object[0], mTicketTripInfoUIStateFactory$snackBarUIState$1);
                    if (objB3 != coroutineSingletons) {
                        function3 = function1;
                        snackbarUIStateFactory2 = snackbarUIStateFactory5;
                        str = (String) objB3;
                        mTicketTripInfoUIStateFactory$snackBarUIState$1.L$0 = function3;
                        mTicketTripInfoUIStateFactory$snackBarUIState$1.L$1 = snackbarUIStateFactory2;
                        mTicketTripInfoUIStateFactory$snackBarUIState$1.L$2 = str;
                        mTicketTripInfoUIStateFactory$snackBarUIState$1.label = 4;
                        objB = stringProvider.b(StringEnum.RETRY, new Object[0], mTicketTripInfoUIStateFactory$snackBarUIState$1);
                        if (objB != coroutineSingletons) {
                            function4 = function3;
                            str2 = str;
                            objB3 = objB;
                            wg0 wg0Var = new wg0(function4, 7);
                            snackbarUIStateFactory2.getClass();
                            return SnackbarUIStateFactory.a(str2, (String) objB3, wg0Var);
                        }
                    }
                } else {
                    if (!Intrinsics.d(mTicketTripInfoSnackBarType, MTicketTripInfoSnackBarType.UserFreeRideCountFailed.f5783a)) {
                        if (Intrinsics.d(mTicketTripInfoSnackBarType, MTicketTripInfoSnackBarType.FareFetchFailed.f5778a) || Intrinsics.d(mTicketTripInfoSnackBarType, MTicketTripInfoSnackBarType.FetchingFareDetails.f5779a)) {
                            return null;
                        }
                        throw new NoWhenBranchMatchedException();
                    }
                    mTicketTripInfoUIStateFactory$snackBarUIState$1.L$0 = function1;
                    mTicketTripInfoUIStateFactory$snackBarUIState$1.L$1 = snackbarUIStateFactory5;
                    mTicketTripInfoUIStateFactory$snackBarUIState$1.label = 5;
                    objB3 = stringProvider.b(StringEnum.FETCHING_MTICKET_DATA_FAILED, new Object[0], mTicketTripInfoUIStateFactory$snackBarUIState$1);
                    if (objB3 != coroutineSingletons) {
                        function2 = function1;
                        snackbarUIStateFactory = snackbarUIStateFactory5;
                        str3 = (String) objB3;
                        mTicketTripInfoUIStateFactory$snackBarUIState$1.L$0 = function2;
                        mTicketTripInfoUIStateFactory$snackBarUIState$1.L$1 = snackbarUIStateFactory;
                        mTicketTripInfoUIStateFactory$snackBarUIState$1.L$2 = str3;
                        mTicketTripInfoUIStateFactory$snackBarUIState$1.label = 6;
                        objB2 = stringProvider.b(StringEnum.RETRY, new Object[0], mTicketTripInfoUIStateFactory$snackBarUIState$1);
                        if (objB2 != coroutineSingletons) {
                            function5 = function2;
                            str4 = str3;
                            objB3 = objB2;
                            wg0 wg0Var2 = new wg0(function5, 8);
                            snackbarUIStateFactory.getClass();
                            return SnackbarUIStateFactory.a(str4, (String) objB3, wg0Var2);
                        }
                    }
                }
                return coroutineSingletons;
            case 1:
                snackbarUIStateFactory4 = (SnackbarUIStateFactory) mTicketTripInfoUIStateFactory$snackBarUIState$1.L$0;
                ResultKt.b(objB3);
                snackbarUIStateFactory4.getClass();
                return SnackbarUIStateFactory.a((String) objB3, null, null);
            case 2:
                snackbarUIStateFactory3 = (SnackbarUIStateFactory) mTicketTripInfoUIStateFactory$snackBarUIState$1.L$0;
                ResultKt.b(objB3);
                snackbarUIStateFactory3.getClass();
                return SnackbarUIStateFactory.a((String) objB3, null, null);
            case 3:
                SnackbarUIStateFactory snackbarUIStateFactory6 = (SnackbarUIStateFactory) mTicketTripInfoUIStateFactory$snackBarUIState$1.L$1;
                Function1 function6 = (Function1) mTicketTripInfoUIStateFactory$snackBarUIState$1.L$0;
                ResultKt.b(objB3);
                snackbarUIStateFactory2 = snackbarUIStateFactory6;
                function3 = function6;
                str = (String) objB3;
                mTicketTripInfoUIStateFactory$snackBarUIState$1.L$0 = function3;
                mTicketTripInfoUIStateFactory$snackBarUIState$1.L$1 = snackbarUIStateFactory2;
                mTicketTripInfoUIStateFactory$snackBarUIState$1.L$2 = str;
                mTicketTripInfoUIStateFactory$snackBarUIState$1.label = 4;
                objB = stringProvider.b(StringEnum.RETRY, new Object[0], mTicketTripInfoUIStateFactory$snackBarUIState$1);
                if (objB != coroutineSingletons) {
                    function4 = function3;
                    str2 = str;
                    objB3 = objB;
                    wg0 wg0Var3 = new wg0(function4, 7);
                    snackbarUIStateFactory2.getClass();
                    return SnackbarUIStateFactory.a(str2, (String) objB3, wg0Var3);
                }
                return coroutineSingletons;
            case 4:
                str2 = (String) mTicketTripInfoUIStateFactory$snackBarUIState$1.L$2;
                snackbarUIStateFactory2 = (SnackbarUIStateFactory) mTicketTripInfoUIStateFactory$snackBarUIState$1.L$1;
                function4 = (Function1) mTicketTripInfoUIStateFactory$snackBarUIState$1.L$0;
                ResultKt.b(objB3);
                wg0 wg0Var4 = new wg0(function4, 7);
                snackbarUIStateFactory2.getClass();
                return SnackbarUIStateFactory.a(str2, (String) objB3, wg0Var4);
            case 5:
                SnackbarUIStateFactory snackbarUIStateFactory7 = (SnackbarUIStateFactory) mTicketTripInfoUIStateFactory$snackBarUIState$1.L$1;
                Function1 function7 = (Function1) mTicketTripInfoUIStateFactory$snackBarUIState$1.L$0;
                ResultKt.b(objB3);
                snackbarUIStateFactory = snackbarUIStateFactory7;
                function2 = function7;
                str3 = (String) objB3;
                mTicketTripInfoUIStateFactory$snackBarUIState$1.L$0 = function2;
                mTicketTripInfoUIStateFactory$snackBarUIState$1.L$1 = snackbarUIStateFactory;
                mTicketTripInfoUIStateFactory$snackBarUIState$1.L$2 = str3;
                mTicketTripInfoUIStateFactory$snackBarUIState$1.label = 6;
                objB2 = stringProvider.b(StringEnum.RETRY, new Object[0], mTicketTripInfoUIStateFactory$snackBarUIState$1);
                if (objB2 != coroutineSingletons) {
                    function5 = function2;
                    str4 = str3;
                    objB3 = objB2;
                    wg0 wg0Var5 = new wg0(function5, 8);
                    snackbarUIStateFactory.getClass();
                    return SnackbarUIStateFactory.a(str4, (String) objB3, wg0Var5);
                }
                return coroutineSingletons;
            case 6:
                str4 = (String) mTicketTripInfoUIStateFactory$snackBarUIState$1.L$2;
                snackbarUIStateFactory = (SnackbarUIStateFactory) mTicketTripInfoUIStateFactory$snackBarUIState$1.L$1;
                function5 = (Function1) mTicketTripInfoUIStateFactory$snackBarUIState$1.L$0;
                ResultKt.b(objB3);
                wg0 wg0Var6 = new wg0(function5, 8);
                snackbarUIStateFactory.getClass();
                return SnackbarUIStateFactory.a(str4, (String) objB3, wg0Var6);
            default:
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }
}
