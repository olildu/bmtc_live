package app.chalo.metro.ui.confirmbooking.uistate;

import androidx.compose.ui.unit.Dp;
import app.chalo.citydata.data.model.app.StopAppModel;
import app.chalo.compose.theme.ChaloThemeHelper;
import app.chalo.compose.theme.UIShape;
import app.chalo.constants.CurrencyRoundOffLogic;
import app.chalo.features.wallet.CurrencyFeature;
import app.chalo.instantticket.data.model.app.response.FareBreakupAppModel;
import app.chalo.instantticket.data.model.app.response.FareBreakupOperationType;
import app.chalo.metro.ui.confirmbooking.ConfirmBookingPassengerDetails;
import app.chalo.metro.ui.confirmbooking.ConfirmBookingScreenDataState;
import app.chalo.metro.ui.confirmbooking.ConfirmBookingScreenViewIntent;
import app.chalo.metro.ui.confirmbooking.ConfirmationScreenTripDetails;
import app.chalo.metro.ui.uistate.ProductBannerSpec;
import app.chalo.metro.ui.uistate.ProductBannerUIState;
import app.chalo.productbooking.common.ui.FareBreakupOperationUIProperties;
import app.chalo.productbooking.common.ui.FareBreakupOperationUIPropertiesKt;
import app.chalo.productbooking.common.uistate.FareLineUiState;
import app.chalo.productbooking.common.uistate.TermsAndConditionsUiState;
import app.chalo.providers.cityprovider.impl.data.models.app.ChaloTransitMode;
import app.chalo.providers.cityprovider.impl.data.models.app.CityAppModelKt;
import app.chalo.providers.iconassetprovider.IconType;
import app.chalo.providers.stringprovider.StringEnum;
import app.chalo.providers.stringprovider.StringProvider;
import app.chalo.uistate.base.ChaloColorToken;
import app.chalo.uistate.base.UiEventHandler;
import app.chalo.uistate.button.ButtonUIState;
import app.chalo.uistate.button.ButtonUIStateFactory;
import app.chalo.uistate.dialog.ButtonContainerUISpecs;
import app.chalo.uistate.dialog.ButtonContainerUIState;
import app.chalo.uistate.dialog.DialogUIEventHandler;
import app.chalo.uistate.dialog.LoadingDialogUIState;
import app.chalo.uistate.dialog.TermTextUIState;
import app.chalo.uistate.dialog.TnCDialogUIState;
import app.chalo.uistate.divider.DividerUIState;
import app.chalo.uistate.image.ImageUISize;
import app.chalo.uistate.image.ImageUIState;
import app.chalo.uistate.image.UIContentScale;
import app.chalo.uistate.snackbar.SnackbarUIState;
import app.chalo.uistate.text.ChaloTextStyleHelper;
import app.chalo.uistate.text.StyledTextClickHandler;
import app.chalo.uistate.text.StyledTextDataUIState;
import app.chalo.uistate.text.TextUIState;
import app.chalo.uistate.text.TitleSubtitleUiState;
import app.chalo.uistate.text.UIFontStyle;
import app.chalo.uistate.text.UIFontWeight;
import app.chalo.uistate.text.UITextAlign;
import app.chalo.uistate.text.UITextDecoration;
import app.chalo.uistate.text.UITextOverflow;
import app.chalo.uistate.text.UITextStyle;
import app.chalo.uistate.toolbar.ToolbarUIState;
import com.google.ads.mediation.facebook.FacebookMediationAdapter;
import defpackage.bp;
import defpackage.cb0;
import defpackage.vo1;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.EmptyList;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.internal.ws.WebSocketProtocol;
import org.npci.upi.security.pinactivitycomponent.CLConstants;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lapp/chalo/metro/ui/confirmbooking/uistate/ConfirmBookingUIStateFactory;", "", "Companion", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class ConfirmBookingUIStateFactory {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final StringProvider f5476a;
    public final CurrencyFeature b;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lapp/chalo/metro/ui/confirmbooking/uistate/ConfirmBookingUIStateFactory$Companion;", "", "", "TNC_CLICKABLE_TEXT", "Ljava/lang/String;", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
    }

    public ConfirmBookingUIStateFactory(StringProvider stringProvider, CurrencyFeature currencyFeature) {
        this.f5476a = stringProvider;
        this.b = currencyFeature;
    }

    /* JADX WARN: Code duplicated, block: B:100:0x0619 A[LOOP:3: B:99:0x0617->B:100:0x0619, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:104:0x063b  */
    /* JADX WARN: Code duplicated, block: B:106:0x063e  */
    /* JADX WARN: Code duplicated, block: B:107:0x0649  */
    /* JADX WARN: Code duplicated, block: B:110:0x064f  */
    /* JADX WARN: Code duplicated, block: B:113:0x067a  */
    /* JADX WARN: Code duplicated, block: B:115:0x06a8  */
    /* JADX WARN: Code duplicated, block: B:118:0x06b2  */
    /* JADX WARN: Code duplicated, block: B:121:0x06c9 A[LOOP:1: B:119:0x06c3->B:121:0x06c9, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:123:0x0721  */
    /* JADX WARN: Code duplicated, block: B:127:0x0747  */
    /* JADX WARN: Code duplicated, block: B:131:0x079e  */
    /* JADX WARN: Code duplicated, block: B:134:0x07b8  */
    /* JADX WARN: Code duplicated, block: B:137:0x07c3  */
    /* JADX WARN: Code duplicated, block: B:140:0x07cd  */
    /* JADX WARN: Code duplicated, block: B:142:0x07d0  */
    /* JADX WARN: Code duplicated, block: B:145:0x07ef  */
    /* JADX WARN: Code duplicated, block: B:147:0x07f7 A[LOOP:0: B:143:0x07e9->B:147:0x07f7, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:153:0x0854  */
    /* JADX WARN: Code duplicated, block: B:157:0x0897  */
    /* JADX WARN: Code duplicated, block: B:161:0x08f2  */
    /* JADX WARN: Code duplicated, block: B:166:0x0957  */
    /* JADX WARN: Code duplicated, block: B:180:0x09d6  */
    /* JADX WARN: Code duplicated, block: B:183:0x0a12  */
    /* JADX WARN: Code duplicated, block: B:186:0x0a3e  */
    /* JADX WARN: Code duplicated, block: B:190:0x0a83  */
    /* JADX WARN: Code duplicated, block: B:193:0x0ac5  */
    /* JADX WARN: Code duplicated, block: B:196:0x0ade  */
    /* JADX WARN: Code duplicated, block: B:198:0x0ae3  */
    /* JADX WARN: Code duplicated, block: B:202:0x0827 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:204:0x0607 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:207:0x05f2 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:212:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:213:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:214:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:215:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:216:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:217:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:218:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:219:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:33:0x039f  */
    /* JADX WARN: Code duplicated, block: B:35:0x03a5  */
    /* JADX WARN: Code duplicated, block: B:36:0x03a8  */
    /* JADX WARN: Code duplicated, block: B:37:0x03ab  */
    /* JADX WARN: Code duplicated, block: B:38:0x03ae  */
    /* JADX WARN: Code duplicated, block: B:39:0x03b1  */
    /* JADX WARN: Code duplicated, block: B:40:0x03b4  */
    /* JADX WARN: Code duplicated, block: B:41:0x03b7  */
    /* JADX WARN: Code duplicated, block: B:42:0x03ba  */
    /* JADX WARN: Code duplicated, block: B:46:0x03d5  */
    /* JADX WARN: Code duplicated, block: B:49:0x0412  */
    /* JADX WARN: Code duplicated, block: B:52:0x042d A[LOOP:4: B:50:0x0427->B:52:0x042d, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:55:0x048b  */
    /* JADX WARN: Code duplicated, block: B:59:0x04af  */
    /* JADX WARN: Code duplicated, block: B:62:0x04cd  */
    /* JADX WARN: Code duplicated, block: B:68:0x04d9  */
    /* JADX WARN: Code duplicated, block: B:72:0x0540  */
    /* JADX WARN: Code duplicated, block: B:75:0x0564  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Code duplicated, block: B:81:0x0570  */
    /* JADX WARN: Code duplicated, block: B:84:0x05c0  */
    /* JADX WARN: Code duplicated, block: B:85:0x05c3  */
    /* JADX WARN: Code duplicated, block: B:88:0x05d6  */
    /* JADX WARN: Code duplicated, block: B:89:0x05db  */
    /* JADX WARN: Code duplicated, block: B:92:0x05e7  */
    /* JADX WARN: Code duplicated, block: B:95:0x05f8  */
    /* JADX WARN: Instruction removed from duplicated block: B:147:0x07f7, please report this as an issue */
    public final Object a(ConfirmBookingScreenDataState confirmBookingScreenDataState, Function1 function1, ContinuationImpl continuationImpl) {
        ConfirmBookingUIStateFactory$create$1 confirmBookingUIStateFactory$create$1;
        ConfirmBookingScreenDataState confirmBookingScreenDataState2;
        Function1 function2;
        Object objB;
        ChaloTextStyleHelper chaloTextStyleHelper;
        LoadingDialogUIState loadingDialogUIState;
        ChaloTransitMode chaloTransitMode;
        IconType iconType;
        Object objB2;
        IconType iconType2;
        Object obj;
        LoadingDialogUIState loadingDialogUIState2;
        ConfirmBookingScreenDataState confirmBookingScreenDataState3;
        Function1 function3;
        ChaloTextStyleHelper chaloTextStyleHelper2;
        ToolbarUIState toolbarUIState;
        List list;
        ArrayList arrayList;
        StringProvider stringProvider;
        ChaloTextStyleHelper chaloTextStyleHelper3;
        Object objB3;
        Function1 function4;
        List list2;
        ConfirmBookingScreenDataState confirmBookingScreenDataState4;
        ToolbarUIState toolbarUIState2;
        Object obj2;
        ChaloTextStyleHelper chaloTextStyleHelper4;
        ArrayList arrayList2;
        Iterator it;
        ConfirmBookingScreenDataState confirmBookingScreenDataState5;
        ConfirmationScreenTripDetails confirmationScreenTripDetails;
        String str;
        ChaloTextStyleHelper chaloTextStyleHelper5;
        IconType iconType3;
        StopDetailUiState stopDetailUiState;
        Object objB4;
        List list3;
        StopDetailUiState stopDetailUiState2;
        ToolbarUIState toolbarUIState3;
        ConfirmBookingScreenDataState confirmBookingScreenDataState6;
        Object obj3;
        Function1 function5;
        LoadingDialogUIState loadingDialogUIState3;
        IconType iconType4;
        ChaloTextStyleHelper chaloTextStyleHelper6;
        StopAppModel stopAppModel;
        String str2;
        ConfirmBookingScreenDataState confirmBookingScreenDataState7;
        ConfirmationScreenTripDetails confirmationScreenTripDetails2;
        String str3;
        List list4;
        ChaloTextStyleHelper chaloTextStyleHelper7;
        List list5;
        JourneyDetailsUiState journeyDetailsUiState;
        Long l;
        long jLongValue;
        String strA;
        List list6;
        Object obj4;
        String str4;
        String strA2;
        Object obj5;
        LoadingDialogUIState loadingDialogUIState4;
        Function1 function6;
        JourneyDetailsUiState journeyDetailsUiState2;
        ProductBannerUIState productBannerUIState;
        ProductBannerSpec productBannerSpec;
        Object objB5;
        ConfirmBookingScreenDataState confirmBookingScreenDataState8;
        Object obj6;
        ChaloTextStyleHelper chaloTextStyleHelper8;
        ArrayList arrayList3;
        int size;
        int i;
        long j;
        Long l2;
        StopAppModel stopAppModel2;
        String str5;
        List list7;
        ArrayList arrayList4;
        Object objB6;
        Object obj7;
        List list8;
        String str6;
        ProductBannerUIState productBannerUIState2;
        ChaloTextStyleHelper chaloTextStyleHelper9;
        ConfirmBookingScreenDataState confirmBookingScreenDataState9;
        Object obj8;
        Iterator it2;
        String str7;
        FareLineUiState fareLineUiState;
        Object objB7;
        FareLineUiState fareLineUiState2;
        ChaloTextStyleHelper chaloTextStyleHelper10;
        ConfirmBookingScreenDataState confirmBookingScreenDataState10;
        Function1 function7;
        LoadingDialogUIState loadingDialogUIState5;
        JourneyDetailsUiState journeyDetailsUiState3;
        String str8;
        PriceDetailsUiState priceDetailsUiState;
        List list9;
        Object obj9;
        ChaloTextStyleHelper chaloTextStyleHelper11;
        TnCDialogUIState tnCDialogUIState;
        TermsAndConditionsUiState termsAndConditionsUiState;
        JourneyDetailsUiState journeyDetailsUiState4;
        String str9;
        ToolbarUIState toolbarUIState4;
        PriceDetailsUiState priceDetailsUiState2;
        LoadingDialogUIState loadingDialogUIState6;
        ConfirmBookingScreenDataState confirmBookingScreenDataState11;
        ArrayList arrayList5;
        Iterator it3;
        int i2;
        ChaloTextStyleHelper chaloTextStyleHelper12;
        Object objB8;
        ChaloTextStyleHelper chaloTextStyleHelper13;
        String str10;
        JourneyDetailsUiState journeyDetailsUiState5;
        Object next;
        int i3;
        List list10;
        TextUIState.ChaloTextUIState chaloTextUIStateA;
        StyledTextDataUIState[] styledTextDataUIStateArr;
        Object objB9;
        StyledTextDataUIState[] styledTextDataUIStateArr2;
        ToolbarUIState toolbarUIState5;
        PriceDetailsUiState priceDetailsUiState3;
        LoadingDialogUIState loadingDialogUIState7;
        int i4;
        JourneyDetailsUiState journeyDetailsUiState6;
        String str11;
        TextUIState.ChaloTextUIState chaloTextUIState;
        Object obj10;
        List list11;
        Object objB10;
        StyledTextDataUIState[] styledTextDataUIStateArr3;
        String str12;
        LoadingDialogUIState loadingDialogUIState8;
        ConfirmBookingScreenDataState confirmBookingScreenDataState12;
        ToolbarUIState toolbarUIState6;
        int i5;
        TextUIState.ChaloTextUIState chaloTextUIState2;
        final Function1 function8;
        List list12;
        StyledTextDataUIState[] styledTextDataUIStateArr4;
        PriceDetailsUiState priceDetailsUiState4;
        JourneyDetailsUiState journeyDetailsUiState7;
        boolean z;
        Object obj11;
        PriceDetailsUiState priceDetailsUiState5;
        LoadingDialogUIState loadingDialogUIState9;
        ToolbarUIState toolbarUIState7;
        JourneyDetailsUiState journeyDetailsUiState8;
        ConfirmBookingScreenDataState confirmBookingScreenDataState13;
        Function1 function9;
        TnCDialogUIState tnCDialogUIState2;
        List list13;
        Object obj12;
        ButtonUIStateFactory buttonUIStateFactory;
        Object objB11;
        PriceDetailsUiState priceDetailsUiState6;
        TermsAndConditionsUiState termsAndConditionsUiState2;
        ConfirmBookingScreenDataState confirmBookingScreenDataState14;
        LoadingDialogUIState loadingDialogUIState10;
        ButtonUIStateFactory buttonUIStateFactory2;
        TnCDialogUIState tnCDialogUIState3;
        Function1 function10;
        ConfirmBookingScreenDataState confirmBookingScreenDataState15;
        JourneyDetailsUiState journeyDetailsUiState9;
        TnCDialogUIState tnCDialogUIState4;
        LoadingDialogUIState loadingDialogUIState11;
        StringProvider stringProvider2;
        Object obj13;
        ToolbarUIState toolbarUIState8;
        ButtonUIState buttonUIStateG;
        ConfirmBookingScreenDataState confirmBookingScreenDataState16;
        JourneyDetailsUiState journeyDetailsUiState10;
        TnCDialogUIState tnCDialogUIState5;
        LoadingDialogUIState loadingDialogUIState12;
        ToolbarUIState toolbarUIState9;
        TermsAndConditionsUiState termsAndConditionsUiState3;
        PriceDetailsUiState priceDetailsUiState7;
        SnackbarUIState snackbarUIState;
        ChaloTextStyleHelper chaloTextStyleHelper14;
        StringProvider stringProvider3;
        Object objB12;
        Object obj14;
        JourneyDetailsUiState journeyDetailsUiState11;
        PriceDetailsUiState priceDetailsUiState8;
        Function1 function11;
        ConfirmBookingScreenDataState confirmBookingScreenDataState17;
        Object obj15;
        TnCDialogUIState tnCDialogUIState6;
        ChaloTextStyleHelper chaloTextStyleHelper15;
        TextUIState.ChaloTextUIState chaloTextUIStateB;
        ConfirmBookingScreenDataState confirmBookingScreenDataState18;
        Object objB13;
        ToolbarUIState toolbarUIState10;
        TermsAndConditionsUiState termsAndConditionsUiState4;
        ConfirmBookingScreenDataState confirmBookingScreenDataState19;
        Function1 function12;
        TextUIState.ChaloTextUIState chaloTextUIState3;
        PriceDetailsUiState priceDetailsUiState9;
        ChaloTextStyleHelper chaloTextStyleHelper16;
        LoadingDialogUIState loadingDialogUIState13;
        JourneyDetailsUiState journeyDetailsUiState12;
        LoadingDialogUIState loadingDialogUIState14;
        if (continuationImpl instanceof ConfirmBookingUIStateFactory$create$1) {
            confirmBookingUIStateFactory$create$1 = (ConfirmBookingUIStateFactory$create$1) continuationImpl;
            int i6 = confirmBookingUIStateFactory$create$1.label;
            if ((i6 & Integer.MIN_VALUE) != 0) {
                confirmBookingUIStateFactory$create$1.label = i6 - Integer.MIN_VALUE;
            } else {
                confirmBookingUIStateFactory$create$1 = new ConfirmBookingUIStateFactory$create$1(this, continuationImpl);
            }
        } else {
            confirmBookingUIStateFactory$create$1 = new ConfirmBookingUIStateFactory$create$1(this, continuationImpl);
        }
        Object obj16 = confirmBookingUIStateFactory$create$1.result;
        Object obj17 = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i7 = confirmBookingUIStateFactory$create$1.label;
        CurrencyFeature currencyFeature = this.b;
        ChaloColorToken.OrangePrimary orangePrimary = ChaloColorToken.OrangePrimary.f9835a;
        String str13 = "";
        ChaloColorToken.ShadyGray shadyGray = ChaloColorToken.ShadyGray.f9851a;
        StringProvider stringProvider4 = this.f5476a;
        ChaloTextStyleHelper chaloTextStyleHelper17 = ChaloTextStyleHelper.f10078a;
        switch (i7) {
            case 0:
                ResultKt.b(obj16);
                confirmBookingScreenDataState2 = confirmBookingScreenDataState;
                confirmBookingUIStateFactory$create$1.L$0 = confirmBookingScreenDataState2;
                function2 = function1;
                confirmBookingUIStateFactory$create$1.L$1 = function2;
                confirmBookingUIStateFactory$create$1.L$2 = chaloTextStyleHelper17;
                confirmBookingUIStateFactory$create$1.label = 1;
                objB = stringProvider4.b(StringEnum.LOADING, new Object[0], confirmBookingUIStateFactory$create$1);
                if (objB != obj17) {
                    chaloTextStyleHelper = chaloTextStyleHelper17;
                    loadingDialogUIState = new LoadingDialogUIState(ChaloTextStyleHelper.b(chaloTextStyleHelper, (String) objB, null, 0, null, null, null, null, WebSocketProtocol.PAYLOAD_SHORT));
                    chaloTransitMode = confirmBookingScreenDataState2.f5463a;
                    Intrinsics.i(chaloTransitMode, "<this>");
                    switch (CityAppModelKt.WhenMappings.f8855a[chaloTransitMode.ordinal()]) {
                        case 1:
                            iconType = IconType.BUS_SEARCH;
                            break;
                        case 2:
                            iconType = IconType.TRAIN_SEARCH;
                            break;
                        case 3:
                            iconType = IconType.METRO_SEARCH;
                            break;
                        case 4:
                            iconType = IconType.MONORAIL_SEARCH;
                            break;
                        case 5:
                            iconType = IconType.FERRY_SEARCH;
                            break;
                        case 6:
                            iconType = IconType.CAB_NEARBY;
                            break;
                        case 7:
                            iconType = IconType.BUS_SEARCH;
                            break;
                        case 8:
                            iconType = IconType.BUS_SEARCH;
                            break;
                        default:
                            throw new NoWhenBranchMatchedException();
                    }
                    confirmBookingUIStateFactory$create$1.L$0 = confirmBookingScreenDataState2;
                    confirmBookingUIStateFactory$create$1.L$1 = function2;
                    confirmBookingUIStateFactory$create$1.L$2 = loadingDialogUIState;
                    confirmBookingUIStateFactory$create$1.L$3 = iconType;
                    confirmBookingUIStateFactory$create$1.L$4 = chaloTextStyleHelper17;
                    confirmBookingUIStateFactory$create$1.label = 2;
                    objB2 = stringProvider4.b(StringEnum.CONFIRM_DETAILS, new Object[0], confirmBookingUIStateFactory$create$1);
                    if (objB2 != obj17) {
                        Function1 function13 = function2;
                        iconType2 = iconType;
                        obj = objB2;
                        loadingDialogUIState2 = loadingDialogUIState;
                        confirmBookingScreenDataState3 = confirmBookingScreenDataState2;
                        function3 = function13;
                        chaloTextStyleHelper2 = chaloTextStyleHelper17;
                        toolbarUIState = new ToolbarUIState(null, ChaloTextStyleHelper.e(chaloTextStyleHelper2, (String) obj, ChaloColorToken.AlmostBlackColor.f9756a, null, UIFontWeight.Bold, null, 108), null, null, null, ChaloThemeHelper.a().f1916a, null, null, 221);
                        list = confirmBookingScreenDataState3.g;
                        if (list != null) {
                            List list14 = list;
                            arrayList2 = new ArrayList(CollectionsKt.v(list14, 10));
                            for (it = list14.iterator(); it.hasNext(); it = it) {
                                ConfirmBookingPassengerDetails confirmBookingPassengerDetails = (ConfirmBookingPassengerDetails) it.next();
                                ArrayList arrayList6 = arrayList2;
                                String str14 = confirmBookingPassengerDetails.b;
                                ChaloTextStyleHelper chaloTextStyleHelper18 = chaloTextStyleHelper17;
                                chaloTextStyleHelper17 = chaloTextStyleHelper18;
                                arrayList6.add(new TitleSubtitleUiState(null, ChaloTextStyleHelper.c(chaloTextStyleHelper18, str14, shadyGray, null, null, null, null, 124), ChaloTextStyleHelper.b(chaloTextStyleHelper17, String.valueOf(confirmBookingPassengerDetails.c), null, 0, null, null, null, null, WebSocketProtocol.PAYLOAD_SHORT), null, 9));
                                stringProvider4 = stringProvider4;
                                arrayList2 = arrayList6;
                            }
                            arrayList = arrayList2;
                        } else {
                            arrayList = null;
                        }
                        stringProvider = stringProvider4;
                        chaloTextStyleHelper3 = chaloTextStyleHelper17;
                        confirmBookingUIStateFactory$create$1.L$0 = confirmBookingScreenDataState3;
                        confirmBookingUIStateFactory$create$1.L$1 = function3;
                        confirmBookingUIStateFactory$create$1.L$2 = loadingDialogUIState2;
                        confirmBookingUIStateFactory$create$1.L$3 = iconType2;
                        confirmBookingUIStateFactory$create$1.L$4 = toolbarUIState;
                        confirmBookingUIStateFactory$create$1.L$5 = arrayList;
                        confirmBookingUIStateFactory$create$1.L$6 = chaloTextStyleHelper3;
                        confirmBookingUIStateFactory$create$1.label = 3;
                        objB3 = stringProvider.b(StringEnum.START_STOP, new Object[0], confirmBookingUIStateFactory$create$1);
                        if (objB3 != obj17) {
                            ArrayList arrayList7 = arrayList;
                            function4 = function3;
                            list2 = arrayList7;
                            confirmBookingScreenDataState4 = confirmBookingScreenDataState3;
                            toolbarUIState2 = toolbarUIState;
                            obj2 = objB3;
                            chaloTextStyleHelper4 = chaloTextStyleHelper3;
                            confirmBookingScreenDataState5 = confirmBookingScreenDataState4;
                            TextUIState.ChaloTextUIState chaloTextUIStateC = ChaloTextStyleHelper.c(chaloTextStyleHelper4, (String) obj2, shadyGray, null, null, null, null, 124);
                            confirmationScreenTripDetails = confirmBookingScreenDataState5.f;
                            if (confirmationScreenTripDetails != null || (stopAppModel = confirmationScreenTripDetails.f5472a) == null || (str2 = stopAppModel.b) == null) {
                                str = str13;
                            } else {
                                str = str2;
                            }
                            ChaloTextStyleHelper chaloTextStyleHelper19 = chaloTextStyleHelper3;
                            chaloTextStyleHelper5 = chaloTextStyleHelper19;
                            iconType3 = iconType2;
                            stopDetailUiState = new StopDetailUiState(new ImageUIState(iconType3, (String) null, (ChaloColorToken) null, new ImageUISize(Dp.m7276boximpl(ChaloThemeHelper.a().i), Dp.m7276boximpl(ChaloThemeHelper.a().i)), (UIContentScale) null, 0.0f, (UiEventHandler) null, 246), chaloTextUIStateC, ChaloTextStyleHelper.b(chaloTextStyleHelper19, str, null, 0, null, null, null, null, WebSocketProtocol.PAYLOAD_SHORT));
                            confirmBookingUIStateFactory$create$1.L$0 = confirmBookingScreenDataState5;
                            confirmBookingUIStateFactory$create$1.L$1 = function4;
                            confirmBookingUIStateFactory$create$1.L$2 = loadingDialogUIState2;
                            confirmBookingUIStateFactory$create$1.L$3 = iconType3;
                            confirmBookingUIStateFactory$create$1.L$4 = toolbarUIState2;
                            confirmBookingUIStateFactory$create$1.L$5 = list2;
                            confirmBookingUIStateFactory$create$1.L$6 = stopDetailUiState;
                            confirmBookingUIStateFactory$create$1.L$7 = chaloTextStyleHelper5;
                            confirmBookingUIStateFactory$create$1.label = 4;
                            objB4 = stringProvider.b(StringEnum.EXIT_STOP, new Object[0], confirmBookingUIStateFactory$create$1);
                            if (objB4 != obj17) {
                                ToolbarUIState toolbarUIState11 = toolbarUIState2;
                                list3 = list2;
                                stopDetailUiState2 = stopDetailUiState;
                                toolbarUIState3 = toolbarUIState11;
                                confirmBookingScreenDataState6 = confirmBookingScreenDataState5;
                                obj3 = objB4;
                                function5 = function4;
                                loadingDialogUIState3 = loadingDialogUIState2;
                                iconType4 = iconType3;
                                chaloTextStyleHelper6 = chaloTextStyleHelper5;
                                String str15 = (String) obj3;
                                ChaloTextStyleHelper chaloTextStyleHelper20 = chaloTextStyleHelper5;
                                confirmBookingScreenDataState7 = confirmBookingScreenDataState6;
                                TextUIState.ChaloTextUIState chaloTextUIStateC2 = ChaloTextStyleHelper.c(chaloTextStyleHelper6, str15, shadyGray, null, null, null, null, 124);
                                confirmationScreenTripDetails2 = confirmBookingScreenDataState7.f;
                                if (confirmationScreenTripDetails2 != null || (stopAppModel2 = confirmationScreenTripDetails2.b) == null || (str5 = stopAppModel2.b) == null) {
                                    str3 = str13;
                                } else {
                                    str3 = str5;
                                }
                                list4 = list3;
                                chaloTextStyleHelper7 = chaloTextStyleHelper20;
                                StopDetailUiState stopDetailUiState3 = new StopDetailUiState(new ImageUIState(iconType4, (String) null, (ChaloColorToken) null, new ImageUISize(Dp.m7276boximpl(ChaloThemeHelper.a().i), Dp.m7276boximpl(ChaloThemeHelper.a().i)), (UIContentScale) null, 0.0f, (UiEventHandler) null, 246), chaloTextUIStateC2, ChaloTextStyleHelper.b(chaloTextStyleHelper20, str3, null, 0, null, null, null, null, WebSocketProtocol.PAYLOAD_SHORT));
                                if (list4 == null) {
                                    list5 = EmptyList.f17557a;
                                } else {
                                    list5 = list4;
                                }
                                journeyDetailsUiState = new JourneyDetailsUiState(stopDetailUiState2, stopDetailUiState3, list5, new DividerUIState(0.0f, null, null, 7));
                                l = confirmBookingScreenDataState7.h;
                                if (l != null) {
                                    jLongValue = l.longValue();
                                } else {
                                    jLongValue = 0;
                                }
                                strA = currencyFeature.a(jLongValue, CurrencyRoundOffLogic.ROUND_OFF_LOGIC_NO_ROUNDING);
                                list6 = confirmBookingScreenDataState7.i;
                                if (list6 != null) {
                                    arrayList3 = new ArrayList();
                                    for (Object obj18 : list6) {
                                        if (((FareBreakupAppModel) obj18).b == FareBreakupOperationType.SUBTRACTION) {
                                            arrayList3.add(obj18);
                                        }
                                    }
                                    size = arrayList3.size();
                                    obj4 = obj17;
                                    str4 = strA;
                                    j = 0;
                                    for (i = 0; i < size; i++) {
                                        j += ((FareBreakupAppModel) arrayList3.get(i)).c;
                                        size = size;
                                    }
                                    l2 = new Long(j);
                                    if (l2.longValue() <= 0) {
                                        l2 = null;
                                    }
                                    strA2 = l2 != null ? currencyFeature.a(l2.longValue(), CurrencyRoundOffLogic.ROUND_OFF_LOGIC_NO_ROUNDING) : null;
                                    if (strA2 != null) {
                                        productBannerSpec = new ProductBannerSpec();
                                        confirmBookingUIStateFactory$create$1.L$0 = confirmBookingScreenDataState7;
                                        confirmBookingUIStateFactory$create$1.L$1 = function5;
                                        confirmBookingUIStateFactory$create$1.L$2 = loadingDialogUIState3;
                                        confirmBookingUIStateFactory$create$1.L$3 = toolbarUIState3;
                                        confirmBookingUIStateFactory$create$1.L$4 = journeyDetailsUiState;
                                        confirmBookingUIStateFactory$create$1.L$5 = str4;
                                        confirmBookingUIStateFactory$create$1.L$6 = chaloTextStyleHelper7;
                                        confirmBookingUIStateFactory$create$1.L$7 = productBannerSpec;
                                        confirmBookingUIStateFactory$create$1.label = 5;
                                        objB5 = stringProvider.b(StringEnum.DISCOUNT_TEXT_COPY, new Object[]{strA2}, confirmBookingUIStateFactory$create$1);
                                        obj5 = obj4;
                                        if (objB5 == obj5) {
                                            return obj5;
                                        }
                                        function6 = function5;
                                        confirmBookingScreenDataState8 = confirmBookingScreenDataState7;
                                        obj6 = objB5;
                                        loadingDialogUIState4 = loadingDialogUIState3;
                                        journeyDetailsUiState2 = journeyDetailsUiState;
                                        chaloTextStyleHelper8 = chaloTextStyleHelper7;
                                        productBannerUIState = new ProductBannerUIState(productBannerSpec, ChaloTextStyleHelper.c(chaloTextStyleHelper8, (String) obj6, null, null, UIFontWeight.SemiBold, null, null, FacebookMediationAdapter.ERROR_FAILED_TO_PRESENT_AD), new ImageUIState(IconType.DISCOUNT_GREEN, (String) null, (ChaloColorToken) null, (ImageUISize) null, (UIContentScale) null, 0.0f, (UiEventHandler) null, 254));
                                        confirmBookingScreenDataState7 = confirmBookingScreenDataState8;
                                    } else {
                                        obj5 = obj4;
                                        loadingDialogUIState4 = loadingDialogUIState3;
                                        function6 = function5;
                                        journeyDetailsUiState2 = journeyDetailsUiState;
                                        productBannerUIState = null;
                                    }
                                    list7 = confirmBookingScreenDataState7.i;
                                    if (list7 != null) {
                                        List list15 = list7;
                                        arrayList4 = new ArrayList(CollectionsKt.v(list15, 10));
                                        it2 = list15.iterator();
                                        while (it2.hasNext()) {
                                            FareBreakupAppModel fareBreakupAppModel = (FareBreakupAppModel) it2.next();
                                            FareBreakupOperationUIProperties fareBreakupOperationUIPropertiesA = FareBreakupOperationUIPropertiesKt.a(fareBreakupAppModel.b, (3 & 1) != 0 ? ChaloColorToken.Black.f9759a : ChaloColorToken.AlmostBlackColor.f9756a, (3 & 2) != 0);
                                            ChaloTextStyleHelper chaloTextStyleHelper21 = chaloTextStyleHelper7;
                                            arrayList4.add(new FareLineUiState(ChaloTextStyleHelper.c(chaloTextStyleHelper21, fareBreakupAppModel.f3890a, null, null, null, null, null, WebSocketProtocol.PAYLOAD_SHORT), ChaloTextStyleHelper.c(chaloTextStyleHelper21, vo1.A(fareBreakupOperationUIPropertiesA.f8267a, currencyFeature.a(fareBreakupAppModel.c, CurrencyRoundOffLogic.ROUND_OFF_LOGIC_NO_ROUNDING)), fareBreakupOperationUIPropertiesA.b, null, UIFontWeight.Bold, null, null, 108)));
                                            it2 = it2;
                                            chaloTextStyleHelper7 = chaloTextStyleHelper21;
                                            obj5 = obj5;
                                        }
                                    } else {
                                        arrayList4 = null;
                                    }
                                    chaloTextStyleHelper17 = chaloTextStyleHelper7;
                                    Object obj19 = obj5;
                                    confirmBookingUIStateFactory$create$1.L$0 = confirmBookingScreenDataState7;
                                    confirmBookingUIStateFactory$create$1.L$1 = function6;
                                    confirmBookingUIStateFactory$create$1.L$2 = loadingDialogUIState4;
                                    confirmBookingUIStateFactory$create$1.L$3 = toolbarUIState3;
                                    confirmBookingUIStateFactory$create$1.L$4 = journeyDetailsUiState2;
                                    confirmBookingUIStateFactory$create$1.L$5 = str4;
                                    confirmBookingUIStateFactory$create$1.L$6 = productBannerUIState;
                                    confirmBookingUIStateFactory$create$1.L$7 = arrayList4;
                                    confirmBookingUIStateFactory$create$1.L$8 = chaloTextStyleHelper17;
                                    confirmBookingUIStateFactory$create$1.label = 6;
                                    objB6 = stringProvider.b(StringEnum.TOTAL, new Object[0], confirmBookingUIStateFactory$create$1);
                                    obj7 = obj19;
                                    if (objB6 == obj7) {
                                        return obj7;
                                    }
                                    list8 = arrayList4;
                                    str6 = str4;
                                    productBannerUIState2 = productBannerUIState;
                                    chaloTextStyleHelper9 = chaloTextStyleHelper17;
                                    confirmBookingScreenDataState9 = confirmBookingScreenDataState7;
                                    obj8 = objB6;
                                    str7 = str6;
                                    fareLineUiState = new FareLineUiState(ChaloTextStyleHelper.c(chaloTextStyleHelper9, (String) obj8, null, null, null, null, null, WebSocketProtocol.PAYLOAD_SHORT), ChaloTextStyleHelper.c(chaloTextStyleHelper17, str6, null, null, UIFontWeight.Bold, null, null, FacebookMediationAdapter.ERROR_FAILED_TO_PRESENT_AD));
                                    confirmBookingUIStateFactory$create$1.L$0 = confirmBookingScreenDataState9;
                                    confirmBookingUIStateFactory$create$1.L$1 = function6;
                                    confirmBookingUIStateFactory$create$1.L$2 = loadingDialogUIState4;
                                    confirmBookingUIStateFactory$create$1.L$3 = toolbarUIState3;
                                    confirmBookingUIStateFactory$create$1.L$4 = journeyDetailsUiState2;
                                    confirmBookingUIStateFactory$create$1.L$5 = str7;
                                    confirmBookingUIStateFactory$create$1.L$6 = productBannerUIState2;
                                    confirmBookingUIStateFactory$create$1.L$7 = list8;
                                    confirmBookingUIStateFactory$create$1.L$8 = fareLineUiState;
                                    confirmBookingUIStateFactory$create$1.L$9 = chaloTextStyleHelper17;
                                    confirmBookingUIStateFactory$create$1.label = 7;
                                    objB7 = stringProvider.b(StringEnum.PRICE_DETAILS, new Object[0], confirmBookingUIStateFactory$create$1);
                                    if (objB7 == obj7) {
                                        return obj7;
                                    }
                                    fareLineUiState2 = fareLineUiState;
                                    chaloTextStyleHelper10 = chaloTextStyleHelper17;
                                    confirmBookingScreenDataState10 = confirmBookingScreenDataState9;
                                    function7 = function6;
                                    loadingDialogUIState5 = loadingDialogUIState4;
                                    journeyDetailsUiState3 = journeyDetailsUiState2;
                                    str8 = str7;
                                    TextUIState.ChaloTextUIState chaloTextUIStateA2 = ChaloTextStyleHelper.a(chaloTextStyleHelper10, (String) objB7, null, UIFontWeight.Bold, null, FacebookMediationAdapter.ERROR_FAILED_TO_PRESENT_AD);
                                    if (list8 == null) {
                                        list8 = EmptyList.f17557a;
                                    }
                                    priceDetailsUiState = new PriceDetailsUiState(chaloTextUIStateA2, list8, fareLineUiState2, productBannerUIState2);
                                    list9 = confirmBookingScreenDataState10.j;
                                    if (list9 != null) {
                                        if (list9.isEmpty()) {
                                            list9 = null;
                                        }
                                        if (list9 != null) {
                                            List listX0 = CollectionsKt.x0(list9, 3);
                                            arrayList5 = new ArrayList(CollectionsKt.v(listX0, 10));
                                            it3 = listX0.iterator();
                                            i2 = 0;
                                            while (it3.hasNext()) {
                                                next = it3.next();
                                                i3 = i2 + 1;
                                                if (i2 < 0) {
                                                    CollectionsKt.z0();
                                                    throw null;
                                                }
                                                arrayList5.add(ChaloTextStyleHelper.c(chaloTextStyleHelper17, i3 + ". " + ((String) next), null, null, null, null, null, WebSocketProtocol.PAYLOAD_SHORT));
                                                it3 = it3;
                                                i2 = i3;
                                            }
                                            chaloTextStyleHelper12 = chaloTextStyleHelper17;
                                            confirmBookingUIStateFactory$create$1.L$0 = confirmBookingScreenDataState10;
                                            confirmBookingUIStateFactory$create$1.L$1 = function7;
                                            confirmBookingUIStateFactory$create$1.L$2 = loadingDialogUIState5;
                                            confirmBookingUIStateFactory$create$1.L$3 = toolbarUIState3;
                                            confirmBookingUIStateFactory$create$1.L$4 = journeyDetailsUiState3;
                                            confirmBookingUIStateFactory$create$1.L$5 = str8;
                                            confirmBookingUIStateFactory$create$1.L$6 = priceDetailsUiState;
                                            confirmBookingUIStateFactory$create$1.L$7 = arrayList5;
                                            confirmBookingUIStateFactory$create$1.L$8 = chaloTextStyleHelper12;
                                            confirmBookingUIStateFactory$create$1.L$9 = null;
                                            confirmBookingUIStateFactory$create$1.label = 8;
                                            objB8 = stringProvider.b(StringEnum.TERMS_AND_CONDITIONS, new Object[0], confirmBookingUIStateFactory$create$1);
                                            if (objB8 == obj7) {
                                                return obj7;
                                            }
                                            chaloTextStyleHelper13 = chaloTextStyleHelper12;
                                            str10 = str8;
                                            journeyDetailsUiState5 = journeyDetailsUiState3;
                                            list10 = arrayList5;
                                            chaloTextUIStateA = ChaloTextStyleHelper.a(chaloTextStyleHelper13, (String) objB8, null, UIFontWeight.Bold, null, FacebookMediationAdapter.ERROR_FAILED_TO_PRESENT_AD);
                                            styledTextDataUIStateArr = new StyledTextDataUIState[2];
                                            chaloTextStyleHelper11 = chaloTextStyleHelper12;
                                            confirmBookingUIStateFactory$create$1.L$0 = confirmBookingScreenDataState10;
                                            confirmBookingUIStateFactory$create$1.L$1 = function7;
                                            confirmBookingUIStateFactory$create$1.L$2 = loadingDialogUIState5;
                                            confirmBookingUIStateFactory$create$1.L$3 = toolbarUIState3;
                                            confirmBookingUIStateFactory$create$1.L$4 = journeyDetailsUiState5;
                                            confirmBookingUIStateFactory$create$1.L$5 = str10;
                                            confirmBookingUIStateFactory$create$1.L$6 = priceDetailsUiState;
                                            confirmBookingUIStateFactory$create$1.L$7 = styledTextDataUIStateArr;
                                            confirmBookingUIStateFactory$create$1.L$8 = chaloTextUIStateA;
                                            confirmBookingUIStateFactory$create$1.L$9 = list10;
                                            confirmBookingUIStateFactory$create$1.L$10 = styledTextDataUIStateArr;
                                            confirmBookingUIStateFactory$create$1.I$0 = 0;
                                            confirmBookingUIStateFactory$create$1.label = 9;
                                            objB9 = stringProvider.b(StringEnum.ALL_TNC_PREFIX, new Object[0], confirmBookingUIStateFactory$create$1);
                                            if (objB9 == obj7) {
                                                return obj7;
                                            }
                                            styledTextDataUIStateArr2 = styledTextDataUIStateArr;
                                            toolbarUIState5 = toolbarUIState3;
                                            priceDetailsUiState3 = priceDetailsUiState;
                                            loadingDialogUIState7 = loadingDialogUIState5;
                                            i4 = 0;
                                            journeyDetailsUiState6 = journeyDetailsUiState5;
                                            str11 = str10;
                                            chaloTextUIState = chaloTextUIStateA;
                                            obj10 = objB9;
                                            list11 = list10;
                                            styledTextDataUIStateArr2[i4] = new StyledTextDataUIState(obj10 + " ", null, null, UITextStyle.BodySmall, null, null, null, 1014);
                                            confirmBookingUIStateFactory$create$1.L$0 = confirmBookingScreenDataState10;
                                            confirmBookingUIStateFactory$create$1.L$1 = function7;
                                            confirmBookingUIStateFactory$create$1.L$2 = loadingDialogUIState7;
                                            confirmBookingUIStateFactory$create$1.L$3 = toolbarUIState5;
                                            confirmBookingUIStateFactory$create$1.L$4 = journeyDetailsUiState6;
                                            confirmBookingUIStateFactory$create$1.L$5 = str11;
                                            confirmBookingUIStateFactory$create$1.L$6 = priceDetailsUiState3;
                                            confirmBookingUIStateFactory$create$1.L$7 = styledTextDataUIStateArr;
                                            confirmBookingUIStateFactory$create$1.L$8 = chaloTextUIState;
                                            confirmBookingUIStateFactory$create$1.L$9 = list11;
                                            confirmBookingUIStateFactory$create$1.L$10 = styledTextDataUIStateArr;
                                            confirmBookingUIStateFactory$create$1.I$0 = 1;
                                            confirmBookingUIStateFactory$create$1.label = 10;
                                            objB10 = stringProvider.b(StringEnum.TNC_CLICKABLE_TEXT, new Object[0], confirmBookingUIStateFactory$create$1);
                                            if (objB10 == obj7) {
                                                return obj7;
                                            }
                                            styledTextDataUIStateArr3 = styledTextDataUIStateArr;
                                            str12 = str11;
                                            loadingDialogUIState8 = loadingDialogUIState7;
                                            confirmBookingScreenDataState12 = confirmBookingScreenDataState10;
                                            toolbarUIState6 = toolbarUIState5;
                                            i5 = 1;
                                            chaloTextUIState2 = chaloTextUIState;
                                            function8 = function7;
                                            list12 = list11;
                                            styledTextDataUIStateArr4 = styledTextDataUIStateArr3;
                                            priceDetailsUiState4 = priceDetailsUiState3;
                                            journeyDetailsUiState7 = journeyDetailsUiState6;
                                            String str16 = (String) objB10;
                                            obj9 = obj7;
                                            tnCDialogUIState = null;
                                            styledTextDataUIStateArr4[i5] = new StyledTextDataUIState(str16, orangePrimary, UIFontWeight.Bold, UITextStyle.BodySmall, null, null, new StyledTextClickHandler() { // from class: app.chalo.metro.ui.confirmbooking.uistate.ConfirmBookingUIStateFactory$create$termsAndConditionsUiState$2$1
                                                @Override // app.chalo.uistate.text.StyledTextClickHandler
                                                public final void a() {
                                                    function8.invoke(ConfirmBookingScreenViewIntent.OnTermsAndConditionsClicked.f5468a);
                                                }

                                                @Override // app.chalo.uistate.text.StyledTextClickHandler
                                                /* JADX INFO: renamed from: b */
                                                public final String getB() {
                                                    return "TNC_CLICKABLE_TEXT";
                                                }

                                                @Override // app.chalo.uistate.text.StyledTextClickHandler
                                                /* JADX INFO: renamed from: getTag */
                                                public final String getF10085a() {
                                                    return "TNC_CLICKABLE_TEXT";
                                                }
                                            }, 496);
                                            termsAndConditionsUiState = new TermsAndConditionsUiState(chaloTextUIState2, list12, new TextUIState.StyledTextUIState(CollectionsKt.S(styledTextDataUIStateArr3), null, null, 30));
                                            function7 = function8;
                                            confirmBookingScreenDataState11 = confirmBookingScreenDataState12;
                                            priceDetailsUiState2 = priceDetailsUiState4;
                                            str9 = str12;
                                            journeyDetailsUiState4 = journeyDetailsUiState7;
                                            loadingDialogUIState6 = loadingDialogUIState8;
                                            toolbarUIState4 = toolbarUIState6;
                                        }
                                        z = confirmBookingScreenDataState11.m;
                                        List list16 = confirmBookingScreenDataState11.j;
                                        if (z || (list13 = list16) == null || list13.isEmpty()) {
                                            obj11 = obj9;
                                            JourneyDetailsUiState journeyDetailsUiState13 = journeyDetailsUiState4;
                                            priceDetailsUiState5 = priceDetailsUiState2;
                                            loadingDialogUIState9 = loadingDialogUIState6;
                                            toolbarUIState7 = toolbarUIState4;
                                            journeyDetailsUiState8 = journeyDetailsUiState13;
                                            Function1 function14 = function7;
                                            confirmBookingScreenDataState13 = confirmBookingScreenDataState11;
                                            function9 = function14;
                                            tnCDialogUIState2 = tnCDialogUIState;
                                            StringEnum stringEnum = StringEnum.FARE_DETAILS_PAY;
                                            Object[] objArr = {str9};
                                            confirmBookingUIStateFactory$create$1.L$0 = confirmBookingScreenDataState13;
                                            confirmBookingUIStateFactory$create$1.L$1 = function9;
                                            confirmBookingUIStateFactory$create$1.L$2 = loadingDialogUIState9;
                                            confirmBookingUIStateFactory$create$1.L$3 = toolbarUIState7;
                                            confirmBookingUIStateFactory$create$1.L$4 = journeyDetailsUiState8;
                                            confirmBookingUIStateFactory$create$1.L$5 = priceDetailsUiState5;
                                            confirmBookingUIStateFactory$create$1.L$6 = termsAndConditionsUiState;
                                            confirmBookingUIStateFactory$create$1.L$7 = tnCDialogUIState2;
                                            buttonUIStateFactory = ButtonUIStateFactory.f9921a;
                                            confirmBookingUIStateFactory$create$1.L$8 = buttonUIStateFactory;
                                            confirmBookingUIStateFactory$create$1.L$9 = tnCDialogUIState;
                                            confirmBookingUIStateFactory$create$1.L$10 = tnCDialogUIState;
                                            confirmBookingUIStateFactory$create$1.label = 12;
                                            objB11 = stringProvider.b(stringEnum, objArr, confirmBookingUIStateFactory$create$1);
                                            if (objB11 != obj11) {
                                                priceDetailsUiState6 = priceDetailsUiState5;
                                                termsAndConditionsUiState2 = termsAndConditionsUiState;
                                                confirmBookingScreenDataState14 = confirmBookingScreenDataState13;
                                                loadingDialogUIState10 = loadingDialogUIState9;
                                                buttonUIStateFactory2 = buttonUIStateFactory;
                                                tnCDialogUIState3 = tnCDialogUIState2;
                                                function10 = function9;
                                                confirmBookingScreenDataState15 = confirmBookingScreenDataState14;
                                                journeyDetailsUiState9 = journeyDetailsUiState8;
                                                tnCDialogUIState4 = tnCDialogUIState3;
                                                loadingDialogUIState11 = loadingDialogUIState10;
                                                stringProvider2 = stringProvider;
                                                obj13 = obj11;
                                                toolbarUIState8 = toolbarUIState7;
                                                buttonUIStateG = ButtonUIStateFactory.g(buttonUIStateFactory2, (String) objB11, new bp(function10, 15), null, UIShape.d, true, 0.0f, 36);
                                                if (confirmBookingScreenDataState15.l) {
                                                    confirmBookingUIStateFactory$create$1.L$0 = confirmBookingScreenDataState15;
                                                    confirmBookingUIStateFactory$create$1.L$1 = function10;
                                                    confirmBookingUIStateFactory$create$1.L$2 = loadingDialogUIState11;
                                                    confirmBookingUIStateFactory$create$1.L$3 = toolbarUIState8;
                                                    confirmBookingUIStateFactory$create$1.L$4 = journeyDetailsUiState9;
                                                    confirmBookingUIStateFactory$create$1.L$5 = priceDetailsUiState6;
                                                    confirmBookingUIStateFactory$create$1.L$6 = termsAndConditionsUiState2;
                                                    confirmBookingUIStateFactory$create$1.L$7 = tnCDialogUIState4;
                                                    confirmBookingUIStateFactory$create$1.L$8 = buttonUIStateG;
                                                    chaloTextStyleHelper14 = chaloTextStyleHelper11;
                                                    confirmBookingUIStateFactory$create$1.L$9 = chaloTextStyleHelper14;
                                                    confirmBookingUIStateFactory$create$1.label = 13;
                                                    stringProvider3 = stringProvider2;
                                                    objB12 = stringProvider3.b(StringEnum.SOMETHING_WENT_WRONG, new Object[0], confirmBookingUIStateFactory$create$1);
                                                    obj14 = obj13;
                                                    if (objB12 == obj14) {
                                                        return obj14;
                                                    }
                                                    journeyDetailsUiState11 = journeyDetailsUiState9;
                                                    priceDetailsUiState8 = priceDetailsUiState6;
                                                    function11 = function10;
                                                    confirmBookingScreenDataState17 = confirmBookingScreenDataState15;
                                                    obj15 = objB12;
                                                    tnCDialogUIState6 = tnCDialogUIState4;
                                                    chaloTextStyleHelper15 = chaloTextStyleHelper14;
                                                    chaloTextUIStateB = ChaloTextStyleHelper.b(chaloTextStyleHelper15, (String) obj15, ChaloColorToken.White.f9870a, 0, null, null, null, null, 124);
                                                    confirmBookingUIStateFactory$create$1.L$0 = confirmBookingScreenDataState17;
                                                    confirmBookingUIStateFactory$create$1.L$1 = function11;
                                                    confirmBookingUIStateFactory$create$1.L$2 = loadingDialogUIState11;
                                                    confirmBookingUIStateFactory$create$1.L$3 = toolbarUIState8;
                                                    confirmBookingUIStateFactory$create$1.L$4 = journeyDetailsUiState11;
                                                    confirmBookingUIStateFactory$create$1.L$5 = priceDetailsUiState8;
                                                    confirmBookingUIStateFactory$create$1.L$6 = termsAndConditionsUiState2;
                                                    confirmBookingUIStateFactory$create$1.L$7 = tnCDialogUIState6;
                                                    confirmBookingUIStateFactory$create$1.L$8 = buttonUIStateG;
                                                    confirmBookingUIStateFactory$create$1.L$9 = chaloTextUIStateB;
                                                    confirmBookingUIStateFactory$create$1.L$10 = chaloTextStyleHelper14;
                                                    confirmBookingScreenDataState18 = confirmBookingScreenDataState17;
                                                    confirmBookingUIStateFactory$create$1.label = 14;
                                                    objB13 = stringProvider3.b(StringEnum.RETRY, new Object[0], confirmBookingUIStateFactory$create$1);
                                                    if (objB13 == obj14) {
                                                        return obj14;
                                                    }
                                                    toolbarUIState10 = toolbarUIState8;
                                                    termsAndConditionsUiState4 = termsAndConditionsUiState2;
                                                    confirmBookingScreenDataState19 = confirmBookingScreenDataState18;
                                                    function12 = function11;
                                                    chaloTextUIState3 = chaloTextUIStateB;
                                                    obj16 = objB13;
                                                    priceDetailsUiState9 = priceDetailsUiState8;
                                                    chaloTextStyleHelper16 = chaloTextStyleHelper14;
                                                    loadingDialogUIState13 = loadingDialogUIState11;
                                                    journeyDetailsUiState12 = journeyDetailsUiState11;
                                                    ChaloColorToken.OrangePrimary orangePrimary2 = orangePrimary;
                                                    priceDetailsUiState7 = priceDetailsUiState9;
                                                    tnCDialogUIState5 = tnCDialogUIState6;
                                                    termsAndConditionsUiState3 = termsAndConditionsUiState4;
                                                    snackbarUIState = new SnackbarUIState(chaloTextUIState3, ChaloTextStyleHelper.b(chaloTextStyleHelper16, (String) obj16, orangePrimary2, 0, null, UIFontWeight.SemiBold, null, null, 108), UiEventHandler.Companion.a(new bp(function12, 16)));
                                                    journeyDetailsUiState10 = journeyDetailsUiState12;
                                                    toolbarUIState9 = toolbarUIState10;
                                                    loadingDialogUIState12 = loadingDialogUIState13;
                                                    confirmBookingScreenDataState16 = confirmBookingScreenDataState19;
                                                } else {
                                                    confirmBookingScreenDataState16 = confirmBookingScreenDataState15;
                                                    journeyDetailsUiState10 = journeyDetailsUiState9;
                                                    tnCDialogUIState5 = tnCDialogUIState4;
                                                    loadingDialogUIState12 = loadingDialogUIState11;
                                                    toolbarUIState9 = toolbarUIState8;
                                                    termsAndConditionsUiState3 = termsAndConditionsUiState2;
                                                    priceDetailsUiState7 = priceDetailsUiState6;
                                                    snackbarUIState = null;
                                                }
                                                ButtonUIState buttonUIState = buttonUIStateG;
                                                boolean z2 = confirmBookingScreenDataState16.k;
                                                if (confirmBookingScreenDataState16.c) {
                                                    loadingDialogUIState14 = loadingDialogUIState12;
                                                } else {
                                                    loadingDialogUIState14 = null;
                                                }
                                                return new ConfirmBookingScreenViewState(toolbarUIState9, journeyDetailsUiState10, priceDetailsUiState7, termsAndConditionsUiState3, tnCDialogUIState5, buttonUIState, snackbarUIState, z2, loadingDialogUIState14);
                                            }
                                        } else {
                                            confirmBookingUIStateFactory$create$1.L$0 = confirmBookingScreenDataState11;
                                            confirmBookingUIStateFactory$create$1.L$1 = function7;
                                            confirmBookingUIStateFactory$create$1.L$2 = loadingDialogUIState6;
                                            confirmBookingUIStateFactory$create$1.L$3 = toolbarUIState4;
                                            confirmBookingUIStateFactory$create$1.L$4 = journeyDetailsUiState4;
                                            confirmBookingUIStateFactory$create$1.L$5 = str9;
                                            confirmBookingUIStateFactory$create$1.L$6 = priceDetailsUiState2;
                                            confirmBookingUIStateFactory$create$1.L$7 = termsAndConditionsUiState;
                                            confirmBookingUIStateFactory$create$1.L$8 = tnCDialogUIState;
                                            confirmBookingUIStateFactory$create$1.L$9 = tnCDialogUIState;
                                            confirmBookingUIStateFactory$create$1.L$10 = tnCDialogUIState;
                                            confirmBookingUIStateFactory$create$1.label = 11;
                                            Object objB14 = b(list16, function7, confirmBookingUIStateFactory$create$1);
                                            obj11 = obj9;
                                            if (objB14 != obj11) {
                                                obj12 = objB14;
                                                tnCDialogUIState2 = (TnCDialogUIState) obj12;
                                                JourneyDetailsUiState journeyDetailsUiState14 = journeyDetailsUiState4;
                                                priceDetailsUiState5 = priceDetailsUiState2;
                                                loadingDialogUIState9 = loadingDialogUIState6;
                                                toolbarUIState7 = toolbarUIState4;
                                                journeyDetailsUiState8 = journeyDetailsUiState14;
                                                Function1 function15 = function7;
                                                confirmBookingScreenDataState13 = confirmBookingScreenDataState11;
                                                function9 = function15;
                                                StringEnum stringEnum2 = StringEnum.FARE_DETAILS_PAY;
                                                Object[] objArr2 = {str9};
                                                confirmBookingUIStateFactory$create$1.L$0 = confirmBookingScreenDataState13;
                                                confirmBookingUIStateFactory$create$1.L$1 = function9;
                                                confirmBookingUIStateFactory$create$1.L$2 = loadingDialogUIState9;
                                                confirmBookingUIStateFactory$create$1.L$3 = toolbarUIState7;
                                                confirmBookingUIStateFactory$create$1.L$4 = journeyDetailsUiState8;
                                                confirmBookingUIStateFactory$create$1.L$5 = priceDetailsUiState5;
                                                confirmBookingUIStateFactory$create$1.L$6 = termsAndConditionsUiState;
                                                confirmBookingUIStateFactory$create$1.L$7 = tnCDialogUIState2;
                                                buttonUIStateFactory = ButtonUIStateFactory.f9921a;
                                                confirmBookingUIStateFactory$create$1.L$8 = buttonUIStateFactory;
                                                confirmBookingUIStateFactory$create$1.L$9 = tnCDialogUIState;
                                                confirmBookingUIStateFactory$create$1.L$10 = tnCDialogUIState;
                                                confirmBookingUIStateFactory$create$1.label = 12;
                                                objB11 = stringProvider.b(stringEnum2, objArr2, confirmBookingUIStateFactory$create$1);
                                                if (objB11 != obj11) {
                                                    priceDetailsUiState6 = priceDetailsUiState5;
                                                    termsAndConditionsUiState2 = termsAndConditionsUiState;
                                                    confirmBookingScreenDataState14 = confirmBookingScreenDataState13;
                                                    loadingDialogUIState10 = loadingDialogUIState9;
                                                    buttonUIStateFactory2 = buttonUIStateFactory;
                                                    tnCDialogUIState3 = tnCDialogUIState2;
                                                    function10 = function9;
                                                    confirmBookingScreenDataState15 = confirmBookingScreenDataState14;
                                                    journeyDetailsUiState9 = journeyDetailsUiState8;
                                                    tnCDialogUIState4 = tnCDialogUIState3;
                                                    loadingDialogUIState11 = loadingDialogUIState10;
                                                    stringProvider2 = stringProvider;
                                                    obj13 = obj11;
                                                    toolbarUIState8 = toolbarUIState7;
                                                    buttonUIStateG = ButtonUIStateFactory.g(buttonUIStateFactory2, (String) objB11, new bp(function10, 15), null, UIShape.d, true, 0.0f, 36);
                                                    if (confirmBookingScreenDataState15.l) {
                                                        confirmBookingUIStateFactory$create$1.L$0 = confirmBookingScreenDataState15;
                                                        confirmBookingUIStateFactory$create$1.L$1 = function10;
                                                        confirmBookingUIStateFactory$create$1.L$2 = loadingDialogUIState11;
                                                        confirmBookingUIStateFactory$create$1.L$3 = toolbarUIState8;
                                                        confirmBookingUIStateFactory$create$1.L$4 = journeyDetailsUiState9;
                                                        confirmBookingUIStateFactory$create$1.L$5 = priceDetailsUiState6;
                                                        confirmBookingUIStateFactory$create$1.L$6 = termsAndConditionsUiState2;
                                                        confirmBookingUIStateFactory$create$1.L$7 = tnCDialogUIState4;
                                                        confirmBookingUIStateFactory$create$1.L$8 = buttonUIStateG;
                                                        chaloTextStyleHelper14 = chaloTextStyleHelper11;
                                                        confirmBookingUIStateFactory$create$1.L$9 = chaloTextStyleHelper14;
                                                        confirmBookingUIStateFactory$create$1.label = 13;
                                                        stringProvider3 = stringProvider2;
                                                        objB12 = stringProvider3.b(StringEnum.SOMETHING_WENT_WRONG, new Object[0], confirmBookingUIStateFactory$create$1);
                                                        obj14 = obj13;
                                                        if (objB12 == obj14) {
                                                            return obj14;
                                                        }
                                                        journeyDetailsUiState11 = journeyDetailsUiState9;
                                                        priceDetailsUiState8 = priceDetailsUiState6;
                                                        function11 = function10;
                                                        confirmBookingScreenDataState17 = confirmBookingScreenDataState15;
                                                        obj15 = objB12;
                                                        tnCDialogUIState6 = tnCDialogUIState4;
                                                        chaloTextStyleHelper15 = chaloTextStyleHelper14;
                                                        chaloTextUIStateB = ChaloTextStyleHelper.b(chaloTextStyleHelper15, (String) obj15, ChaloColorToken.White.f9870a, 0, null, null, null, null, 124);
                                                        confirmBookingUIStateFactory$create$1.L$0 = confirmBookingScreenDataState17;
                                                        confirmBookingUIStateFactory$create$1.L$1 = function11;
                                                        confirmBookingUIStateFactory$create$1.L$2 = loadingDialogUIState11;
                                                        confirmBookingUIStateFactory$create$1.L$3 = toolbarUIState8;
                                                        confirmBookingUIStateFactory$create$1.L$4 = journeyDetailsUiState11;
                                                        confirmBookingUIStateFactory$create$1.L$5 = priceDetailsUiState8;
                                                        confirmBookingUIStateFactory$create$1.L$6 = termsAndConditionsUiState2;
                                                        confirmBookingUIStateFactory$create$1.L$7 = tnCDialogUIState6;
                                                        confirmBookingUIStateFactory$create$1.L$8 = buttonUIStateG;
                                                        confirmBookingUIStateFactory$create$1.L$9 = chaloTextUIStateB;
                                                        confirmBookingUIStateFactory$create$1.L$10 = chaloTextStyleHelper14;
                                                        confirmBookingScreenDataState18 = confirmBookingScreenDataState17;
                                                        confirmBookingUIStateFactory$create$1.label = 14;
                                                        objB13 = stringProvider3.b(StringEnum.RETRY, new Object[0], confirmBookingUIStateFactory$create$1);
                                                        if (objB13 == obj14) {
                                                            return obj14;
                                                        }
                                                        toolbarUIState10 = toolbarUIState8;
                                                        termsAndConditionsUiState4 = termsAndConditionsUiState2;
                                                        confirmBookingScreenDataState19 = confirmBookingScreenDataState18;
                                                        function12 = function11;
                                                        chaloTextUIState3 = chaloTextUIStateB;
                                                        obj16 = objB13;
                                                        priceDetailsUiState9 = priceDetailsUiState8;
                                                        chaloTextStyleHelper16 = chaloTextStyleHelper14;
                                                        loadingDialogUIState13 = loadingDialogUIState11;
                                                        journeyDetailsUiState12 = journeyDetailsUiState11;
                                                        ChaloColorToken.OrangePrimary orangePrimary3 = orangePrimary;
                                                        priceDetailsUiState7 = priceDetailsUiState9;
                                                        tnCDialogUIState5 = tnCDialogUIState6;
                                                        termsAndConditionsUiState3 = termsAndConditionsUiState4;
                                                        snackbarUIState = new SnackbarUIState(chaloTextUIState3, ChaloTextStyleHelper.b(chaloTextStyleHelper16, (String) obj16, orangePrimary3, 0, null, UIFontWeight.SemiBold, null, null, 108), UiEventHandler.Companion.a(new bp(function12, 16)));
                                                        journeyDetailsUiState10 = journeyDetailsUiState12;
                                                        toolbarUIState9 = toolbarUIState10;
                                                        loadingDialogUIState12 = loadingDialogUIState13;
                                                        confirmBookingScreenDataState16 = confirmBookingScreenDataState19;
                                                    } else {
                                                        confirmBookingScreenDataState16 = confirmBookingScreenDataState15;
                                                        journeyDetailsUiState10 = journeyDetailsUiState9;
                                                        tnCDialogUIState5 = tnCDialogUIState4;
                                                        loadingDialogUIState12 = loadingDialogUIState11;
                                                        toolbarUIState9 = toolbarUIState8;
                                                        termsAndConditionsUiState3 = termsAndConditionsUiState2;
                                                        priceDetailsUiState7 = priceDetailsUiState6;
                                                        snackbarUIState = null;
                                                    }
                                                    ButtonUIState buttonUIState2 = buttonUIStateG;
                                                    boolean z3 = confirmBookingScreenDataState16.k;
                                                    if (confirmBookingScreenDataState16.c) {
                                                        loadingDialogUIState14 = loadingDialogUIState12;
                                                    } else {
                                                        loadingDialogUIState14 = null;
                                                    }
                                                    return new ConfirmBookingScreenViewState(toolbarUIState9, journeyDetailsUiState10, priceDetailsUiState7, termsAndConditionsUiState3, tnCDialogUIState5, buttonUIState2, snackbarUIState, z3, loadingDialogUIState14);
                                                }
                                            }
                                        }
                                        return obj11;
                                    }
                                    obj9 = obj7;
                                    chaloTextStyleHelper11 = chaloTextStyleHelper17;
                                    tnCDialogUIState = null;
                                    termsAndConditionsUiState = null;
                                    journeyDetailsUiState4 = journeyDetailsUiState3;
                                    str9 = str8;
                                    toolbarUIState4 = toolbarUIState3;
                                    priceDetailsUiState2 = priceDetailsUiState;
                                    loadingDialogUIState6 = loadingDialogUIState5;
                                    confirmBookingScreenDataState11 = confirmBookingScreenDataState10;
                                    z = confirmBookingScreenDataState11.m;
                                    List list17 = confirmBookingScreenDataState11.j;
                                    if (z) {
                                    }
                                    obj11 = obj9;
                                    JourneyDetailsUiState journeyDetailsUiState15 = journeyDetailsUiState4;
                                    priceDetailsUiState5 = priceDetailsUiState2;
                                    loadingDialogUIState9 = loadingDialogUIState6;
                                    toolbarUIState7 = toolbarUIState4;
                                    journeyDetailsUiState8 = journeyDetailsUiState15;
                                    Function1 function16 = function7;
                                    confirmBookingScreenDataState13 = confirmBookingScreenDataState11;
                                    function9 = function16;
                                    tnCDialogUIState2 = tnCDialogUIState;
                                    StringEnum stringEnum3 = StringEnum.FARE_DETAILS_PAY;
                                    Object[] objArr3 = {str9};
                                    confirmBookingUIStateFactory$create$1.L$0 = confirmBookingScreenDataState13;
                                    confirmBookingUIStateFactory$create$1.L$1 = function9;
                                    confirmBookingUIStateFactory$create$1.L$2 = loadingDialogUIState9;
                                    confirmBookingUIStateFactory$create$1.L$3 = toolbarUIState7;
                                    confirmBookingUIStateFactory$create$1.L$4 = journeyDetailsUiState8;
                                    confirmBookingUIStateFactory$create$1.L$5 = priceDetailsUiState5;
                                    confirmBookingUIStateFactory$create$1.L$6 = termsAndConditionsUiState;
                                    confirmBookingUIStateFactory$create$1.L$7 = tnCDialogUIState2;
                                    buttonUIStateFactory = ButtonUIStateFactory.f9921a;
                                    confirmBookingUIStateFactory$create$1.L$8 = buttonUIStateFactory;
                                    confirmBookingUIStateFactory$create$1.L$9 = tnCDialogUIState;
                                    confirmBookingUIStateFactory$create$1.L$10 = tnCDialogUIState;
                                    confirmBookingUIStateFactory$create$1.label = 12;
                                    objB11 = stringProvider.b(stringEnum3, objArr3, confirmBookingUIStateFactory$create$1);
                                    if (objB11 != obj11) {
                                        priceDetailsUiState6 = priceDetailsUiState5;
                                        termsAndConditionsUiState2 = termsAndConditionsUiState;
                                        confirmBookingScreenDataState14 = confirmBookingScreenDataState13;
                                        loadingDialogUIState10 = loadingDialogUIState9;
                                        buttonUIStateFactory2 = buttonUIStateFactory;
                                        tnCDialogUIState3 = tnCDialogUIState2;
                                        function10 = function9;
                                        confirmBookingScreenDataState15 = confirmBookingScreenDataState14;
                                        journeyDetailsUiState9 = journeyDetailsUiState8;
                                        tnCDialogUIState4 = tnCDialogUIState3;
                                        loadingDialogUIState11 = loadingDialogUIState10;
                                        stringProvider2 = stringProvider;
                                        obj13 = obj11;
                                        toolbarUIState8 = toolbarUIState7;
                                        buttonUIStateG = ButtonUIStateFactory.g(buttonUIStateFactory2, (String) objB11, new bp(function10, 15), null, UIShape.d, true, 0.0f, 36);
                                        if (confirmBookingScreenDataState15.l) {
                                            confirmBookingUIStateFactory$create$1.L$0 = confirmBookingScreenDataState15;
                                            confirmBookingUIStateFactory$create$1.L$1 = function10;
                                            confirmBookingUIStateFactory$create$1.L$2 = loadingDialogUIState11;
                                            confirmBookingUIStateFactory$create$1.L$3 = toolbarUIState8;
                                            confirmBookingUIStateFactory$create$1.L$4 = journeyDetailsUiState9;
                                            confirmBookingUIStateFactory$create$1.L$5 = priceDetailsUiState6;
                                            confirmBookingUIStateFactory$create$1.L$6 = termsAndConditionsUiState2;
                                            confirmBookingUIStateFactory$create$1.L$7 = tnCDialogUIState4;
                                            confirmBookingUIStateFactory$create$1.L$8 = buttonUIStateG;
                                            chaloTextStyleHelper14 = chaloTextStyleHelper11;
                                            confirmBookingUIStateFactory$create$1.L$9 = chaloTextStyleHelper14;
                                            confirmBookingUIStateFactory$create$1.label = 13;
                                            stringProvider3 = stringProvider2;
                                            objB12 = stringProvider3.b(StringEnum.SOMETHING_WENT_WRONG, new Object[0], confirmBookingUIStateFactory$create$1);
                                            obj14 = obj13;
                                            if (objB12 == obj14) {
                                                return obj14;
                                            }
                                            journeyDetailsUiState11 = journeyDetailsUiState9;
                                            priceDetailsUiState8 = priceDetailsUiState6;
                                            function11 = function10;
                                            confirmBookingScreenDataState17 = confirmBookingScreenDataState15;
                                            obj15 = objB12;
                                            tnCDialogUIState6 = tnCDialogUIState4;
                                            chaloTextStyleHelper15 = chaloTextStyleHelper14;
                                            chaloTextUIStateB = ChaloTextStyleHelper.b(chaloTextStyleHelper15, (String) obj15, ChaloColorToken.White.f9870a, 0, null, null, null, null, 124);
                                            confirmBookingUIStateFactory$create$1.L$0 = confirmBookingScreenDataState17;
                                            confirmBookingUIStateFactory$create$1.L$1 = function11;
                                            confirmBookingUIStateFactory$create$1.L$2 = loadingDialogUIState11;
                                            confirmBookingUIStateFactory$create$1.L$3 = toolbarUIState8;
                                            confirmBookingUIStateFactory$create$1.L$4 = journeyDetailsUiState11;
                                            confirmBookingUIStateFactory$create$1.L$5 = priceDetailsUiState8;
                                            confirmBookingUIStateFactory$create$1.L$6 = termsAndConditionsUiState2;
                                            confirmBookingUIStateFactory$create$1.L$7 = tnCDialogUIState6;
                                            confirmBookingUIStateFactory$create$1.L$8 = buttonUIStateG;
                                            confirmBookingUIStateFactory$create$1.L$9 = chaloTextUIStateB;
                                            confirmBookingUIStateFactory$create$1.L$10 = chaloTextStyleHelper14;
                                            confirmBookingScreenDataState18 = confirmBookingScreenDataState17;
                                            confirmBookingUIStateFactory$create$1.label = 14;
                                            objB13 = stringProvider3.b(StringEnum.RETRY, new Object[0], confirmBookingUIStateFactory$create$1);
                                            if (objB13 == obj14) {
                                                return obj14;
                                            }
                                            toolbarUIState10 = toolbarUIState8;
                                            termsAndConditionsUiState4 = termsAndConditionsUiState2;
                                            confirmBookingScreenDataState19 = confirmBookingScreenDataState18;
                                            function12 = function11;
                                            chaloTextUIState3 = chaloTextUIStateB;
                                            obj16 = objB13;
                                            priceDetailsUiState9 = priceDetailsUiState8;
                                            chaloTextStyleHelper16 = chaloTextStyleHelper14;
                                            loadingDialogUIState13 = loadingDialogUIState11;
                                            journeyDetailsUiState12 = journeyDetailsUiState11;
                                            ChaloColorToken.OrangePrimary orangePrimary4 = orangePrimary;
                                            priceDetailsUiState7 = priceDetailsUiState9;
                                            tnCDialogUIState5 = tnCDialogUIState6;
                                            termsAndConditionsUiState3 = termsAndConditionsUiState4;
                                            snackbarUIState = new SnackbarUIState(chaloTextUIState3, ChaloTextStyleHelper.b(chaloTextStyleHelper16, (String) obj16, orangePrimary4, 0, null, UIFontWeight.SemiBold, null, null, 108), UiEventHandler.Companion.a(new bp(function12, 16)));
                                            journeyDetailsUiState10 = journeyDetailsUiState12;
                                            toolbarUIState9 = toolbarUIState10;
                                            loadingDialogUIState12 = loadingDialogUIState13;
                                            confirmBookingScreenDataState16 = confirmBookingScreenDataState19;
                                        } else {
                                            confirmBookingScreenDataState16 = confirmBookingScreenDataState15;
                                            journeyDetailsUiState10 = journeyDetailsUiState9;
                                            tnCDialogUIState5 = tnCDialogUIState4;
                                            loadingDialogUIState12 = loadingDialogUIState11;
                                            toolbarUIState9 = toolbarUIState8;
                                            termsAndConditionsUiState3 = termsAndConditionsUiState2;
                                            priceDetailsUiState7 = priceDetailsUiState6;
                                            snackbarUIState = null;
                                        }
                                        ButtonUIState buttonUIState3 = buttonUIStateG;
                                        boolean z4 = confirmBookingScreenDataState16.k;
                                        if (confirmBookingScreenDataState16.c) {
                                            loadingDialogUIState14 = loadingDialogUIState12;
                                        } else {
                                            loadingDialogUIState14 = null;
                                        }
                                        return new ConfirmBookingScreenViewState(toolbarUIState9, journeyDetailsUiState10, priceDetailsUiState7, termsAndConditionsUiState3, tnCDialogUIState5, buttonUIState3, snackbarUIState, z4, loadingDialogUIState14);
                                    }
                                    return obj11;
                                }
                                obj4 = obj17;
                                str4 = strA;
                                if (strA2 != null) {
                                    productBannerSpec = new ProductBannerSpec();
                                    confirmBookingUIStateFactory$create$1.L$0 = confirmBookingScreenDataState7;
                                    confirmBookingUIStateFactory$create$1.L$1 = function5;
                                    confirmBookingUIStateFactory$create$1.L$2 = loadingDialogUIState3;
                                    confirmBookingUIStateFactory$create$1.L$3 = toolbarUIState3;
                                    confirmBookingUIStateFactory$create$1.L$4 = journeyDetailsUiState;
                                    confirmBookingUIStateFactory$create$1.L$5 = str4;
                                    confirmBookingUIStateFactory$create$1.L$6 = chaloTextStyleHelper7;
                                    confirmBookingUIStateFactory$create$1.L$7 = productBannerSpec;
                                    confirmBookingUIStateFactory$create$1.label = 5;
                                    objB5 = stringProvider.b(StringEnum.DISCOUNT_TEXT_COPY, new Object[]{strA2}, confirmBookingUIStateFactory$create$1);
                                    obj5 = obj4;
                                    if (objB5 == obj5) {
                                        return obj5;
                                    }
                                    function6 = function5;
                                    confirmBookingScreenDataState8 = confirmBookingScreenDataState7;
                                    obj6 = objB5;
                                    loadingDialogUIState4 = loadingDialogUIState3;
                                    journeyDetailsUiState2 = journeyDetailsUiState;
                                    chaloTextStyleHelper8 = chaloTextStyleHelper7;
                                    productBannerUIState = new ProductBannerUIState(productBannerSpec, ChaloTextStyleHelper.c(chaloTextStyleHelper8, (String) obj6, null, null, UIFontWeight.SemiBold, null, null, FacebookMediationAdapter.ERROR_FAILED_TO_PRESENT_AD), new ImageUIState(IconType.DISCOUNT_GREEN, (String) null, (ChaloColorToken) null, (ImageUISize) null, (UIContentScale) null, 0.0f, (UiEventHandler) null, 254));
                                    confirmBookingScreenDataState7 = confirmBookingScreenDataState8;
                                } else {
                                    obj5 = obj4;
                                    loadingDialogUIState4 = loadingDialogUIState3;
                                    function6 = function5;
                                    journeyDetailsUiState2 = journeyDetailsUiState;
                                    productBannerUIState = null;
                                }
                                list7 = confirmBookingScreenDataState7.i;
                                if (list7 != null) {
                                    List list18 = list7;
                                    arrayList4 = new ArrayList(CollectionsKt.v(list18, 10));
                                    it2 = list18.iterator();
                                    while (it2.hasNext()) {
                                        FareBreakupAppModel fareBreakupAppModel2 = (FareBreakupAppModel) it2.next();
                                        FareBreakupOperationUIProperties fareBreakupOperationUIPropertiesA2 = FareBreakupOperationUIPropertiesKt.a(fareBreakupAppModel2.b, (3 & 1) != 0 ? ChaloColorToken.Black.f9759a : ChaloColorToken.AlmostBlackColor.f9756a, (3 & 2) != 0);
                                        ChaloTextStyleHelper chaloTextStyleHelper22 = chaloTextStyleHelper7;
                                        arrayList4.add(new FareLineUiState(ChaloTextStyleHelper.c(chaloTextStyleHelper22, fareBreakupAppModel2.f3890a, null, null, null, null, null, WebSocketProtocol.PAYLOAD_SHORT), ChaloTextStyleHelper.c(chaloTextStyleHelper22, vo1.A(fareBreakupOperationUIPropertiesA2.f8267a, currencyFeature.a(fareBreakupAppModel2.c, CurrencyRoundOffLogic.ROUND_OFF_LOGIC_NO_ROUNDING)), fareBreakupOperationUIPropertiesA2.b, null, UIFontWeight.Bold, null, null, 108)));
                                        it2 = it2;
                                        chaloTextStyleHelper7 = chaloTextStyleHelper22;
                                        obj5 = obj5;
                                    }
                                } else {
                                    arrayList4 = null;
                                }
                                chaloTextStyleHelper17 = chaloTextStyleHelper7;
                                Object obj110 = obj5;
                                confirmBookingUIStateFactory$create$1.L$0 = confirmBookingScreenDataState7;
                                confirmBookingUIStateFactory$create$1.L$1 = function6;
                                confirmBookingUIStateFactory$create$1.L$2 = loadingDialogUIState4;
                                confirmBookingUIStateFactory$create$1.L$3 = toolbarUIState3;
                                confirmBookingUIStateFactory$create$1.L$4 = journeyDetailsUiState2;
                                confirmBookingUIStateFactory$create$1.L$5 = str4;
                                confirmBookingUIStateFactory$create$1.L$6 = productBannerUIState;
                                confirmBookingUIStateFactory$create$1.L$7 = arrayList4;
                                confirmBookingUIStateFactory$create$1.L$8 = chaloTextStyleHelper17;
                                confirmBookingUIStateFactory$create$1.label = 6;
                                objB6 = stringProvider.b(StringEnum.TOTAL, new Object[0], confirmBookingUIStateFactory$create$1);
                                obj7 = obj110;
                                if (objB6 == obj7) {
                                    return obj7;
                                }
                                list8 = arrayList4;
                                str6 = str4;
                                productBannerUIState2 = productBannerUIState;
                                chaloTextStyleHelper9 = chaloTextStyleHelper17;
                                confirmBookingScreenDataState9 = confirmBookingScreenDataState7;
                                obj8 = objB6;
                                str7 = str6;
                                fareLineUiState = new FareLineUiState(ChaloTextStyleHelper.c(chaloTextStyleHelper9, (String) obj8, null, null, null, null, null, WebSocketProtocol.PAYLOAD_SHORT), ChaloTextStyleHelper.c(chaloTextStyleHelper17, str6, null, null, UIFontWeight.Bold, null, null, FacebookMediationAdapter.ERROR_FAILED_TO_PRESENT_AD));
                                confirmBookingUIStateFactory$create$1.L$0 = confirmBookingScreenDataState9;
                                confirmBookingUIStateFactory$create$1.L$1 = function6;
                                confirmBookingUIStateFactory$create$1.L$2 = loadingDialogUIState4;
                                confirmBookingUIStateFactory$create$1.L$3 = toolbarUIState3;
                                confirmBookingUIStateFactory$create$1.L$4 = journeyDetailsUiState2;
                                confirmBookingUIStateFactory$create$1.L$5 = str7;
                                confirmBookingUIStateFactory$create$1.L$6 = productBannerUIState2;
                                confirmBookingUIStateFactory$create$1.L$7 = list8;
                                confirmBookingUIStateFactory$create$1.L$8 = fareLineUiState;
                                confirmBookingUIStateFactory$create$1.L$9 = chaloTextStyleHelper17;
                                confirmBookingUIStateFactory$create$1.label = 7;
                                objB7 = stringProvider.b(StringEnum.PRICE_DETAILS, new Object[0], confirmBookingUIStateFactory$create$1);
                                if (objB7 == obj7) {
                                    return obj7;
                                }
                                fareLineUiState2 = fareLineUiState;
                                chaloTextStyleHelper10 = chaloTextStyleHelper17;
                                confirmBookingScreenDataState10 = confirmBookingScreenDataState9;
                                function7 = function6;
                                loadingDialogUIState5 = loadingDialogUIState4;
                                journeyDetailsUiState3 = journeyDetailsUiState2;
                                str8 = str7;
                                TextUIState.ChaloTextUIState chaloTextUIStateA3 = ChaloTextStyleHelper.a(chaloTextStyleHelper10, (String) objB7, null, UIFontWeight.Bold, null, FacebookMediationAdapter.ERROR_FAILED_TO_PRESENT_AD);
                                if (list8 == null) {
                                    list8 = EmptyList.f17557a;
                                }
                                priceDetailsUiState = new PriceDetailsUiState(chaloTextUIStateA3, list8, fareLineUiState2, productBannerUIState2);
                                list9 = confirmBookingScreenDataState10.j;
                                if (list9 != null) {
                                    if (list9.isEmpty()) {
                                        list9 = null;
                                    }
                                    if (list9 != null) {
                                        List listX1 = CollectionsKt.x0(list9, 3);
                                        arrayList5 = new ArrayList(CollectionsKt.v(listX1, 10));
                                        it3 = listX1.iterator();
                                        i2 = 0;
                                        while (it3.hasNext()) {
                                            next = it3.next();
                                            i3 = i2 + 1;
                                            if (i2 < 0) {
                                                CollectionsKt.z0();
                                                throw null;
                                            }
                                            arrayList5.add(ChaloTextStyleHelper.c(chaloTextStyleHelper17, i3 + ". " + ((String) next), null, null, null, null, null, WebSocketProtocol.PAYLOAD_SHORT));
                                            it3 = it3;
                                            i2 = i3;
                                        }
                                        chaloTextStyleHelper12 = chaloTextStyleHelper17;
                                        confirmBookingUIStateFactory$create$1.L$0 = confirmBookingScreenDataState10;
                                        confirmBookingUIStateFactory$create$1.L$1 = function7;
                                        confirmBookingUIStateFactory$create$1.L$2 = loadingDialogUIState5;
                                        confirmBookingUIStateFactory$create$1.L$3 = toolbarUIState3;
                                        confirmBookingUIStateFactory$create$1.L$4 = journeyDetailsUiState3;
                                        confirmBookingUIStateFactory$create$1.L$5 = str8;
                                        confirmBookingUIStateFactory$create$1.L$6 = priceDetailsUiState;
                                        confirmBookingUIStateFactory$create$1.L$7 = arrayList5;
                                        confirmBookingUIStateFactory$create$1.L$8 = chaloTextStyleHelper12;
                                        confirmBookingUIStateFactory$create$1.L$9 = null;
                                        confirmBookingUIStateFactory$create$1.label = 8;
                                        objB8 = stringProvider.b(StringEnum.TERMS_AND_CONDITIONS, new Object[0], confirmBookingUIStateFactory$create$1);
                                        if (objB8 == obj7) {
                                            return obj7;
                                        }
                                        chaloTextStyleHelper13 = chaloTextStyleHelper12;
                                        str10 = str8;
                                        journeyDetailsUiState5 = journeyDetailsUiState3;
                                        list10 = arrayList5;
                                        chaloTextUIStateA = ChaloTextStyleHelper.a(chaloTextStyleHelper13, (String) objB8, null, UIFontWeight.Bold, null, FacebookMediationAdapter.ERROR_FAILED_TO_PRESENT_AD);
                                        styledTextDataUIStateArr = new StyledTextDataUIState[2];
                                        chaloTextStyleHelper11 = chaloTextStyleHelper12;
                                        confirmBookingUIStateFactory$create$1.L$0 = confirmBookingScreenDataState10;
                                        confirmBookingUIStateFactory$create$1.L$1 = function7;
                                        confirmBookingUIStateFactory$create$1.L$2 = loadingDialogUIState5;
                                        confirmBookingUIStateFactory$create$1.L$3 = toolbarUIState3;
                                        confirmBookingUIStateFactory$create$1.L$4 = journeyDetailsUiState5;
                                        confirmBookingUIStateFactory$create$1.L$5 = str10;
                                        confirmBookingUIStateFactory$create$1.L$6 = priceDetailsUiState;
                                        confirmBookingUIStateFactory$create$1.L$7 = styledTextDataUIStateArr;
                                        confirmBookingUIStateFactory$create$1.L$8 = chaloTextUIStateA;
                                        confirmBookingUIStateFactory$create$1.L$9 = list10;
                                        confirmBookingUIStateFactory$create$1.L$10 = styledTextDataUIStateArr;
                                        confirmBookingUIStateFactory$create$1.I$0 = 0;
                                        confirmBookingUIStateFactory$create$1.label = 9;
                                        objB9 = stringProvider.b(StringEnum.ALL_TNC_PREFIX, new Object[0], confirmBookingUIStateFactory$create$1);
                                        if (objB9 == obj7) {
                                            return obj7;
                                        }
                                        styledTextDataUIStateArr2 = styledTextDataUIStateArr;
                                        toolbarUIState5 = toolbarUIState3;
                                        priceDetailsUiState3 = priceDetailsUiState;
                                        loadingDialogUIState7 = loadingDialogUIState5;
                                        i4 = 0;
                                        journeyDetailsUiState6 = journeyDetailsUiState5;
                                        str11 = str10;
                                        chaloTextUIState = chaloTextUIStateA;
                                        obj10 = objB9;
                                        list11 = list10;
                                        styledTextDataUIStateArr2[i4] = new StyledTextDataUIState(obj10 + " ", null, null, UITextStyle.BodySmall, null, null, null, 1014);
                                        confirmBookingUIStateFactory$create$1.L$0 = confirmBookingScreenDataState10;
                                        confirmBookingUIStateFactory$create$1.L$1 = function7;
                                        confirmBookingUIStateFactory$create$1.L$2 = loadingDialogUIState7;
                                        confirmBookingUIStateFactory$create$1.L$3 = toolbarUIState5;
                                        confirmBookingUIStateFactory$create$1.L$4 = journeyDetailsUiState6;
                                        confirmBookingUIStateFactory$create$1.L$5 = str11;
                                        confirmBookingUIStateFactory$create$1.L$6 = priceDetailsUiState3;
                                        confirmBookingUIStateFactory$create$1.L$7 = styledTextDataUIStateArr;
                                        confirmBookingUIStateFactory$create$1.L$8 = chaloTextUIState;
                                        confirmBookingUIStateFactory$create$1.L$9 = list11;
                                        confirmBookingUIStateFactory$create$1.L$10 = styledTextDataUIStateArr;
                                        confirmBookingUIStateFactory$create$1.I$0 = 1;
                                        confirmBookingUIStateFactory$create$1.label = 10;
                                        objB10 = stringProvider.b(StringEnum.TNC_CLICKABLE_TEXT, new Object[0], confirmBookingUIStateFactory$create$1);
                                        if (objB10 == obj7) {
                                            return obj7;
                                        }
                                        styledTextDataUIStateArr3 = styledTextDataUIStateArr;
                                        str12 = str11;
                                        loadingDialogUIState8 = loadingDialogUIState7;
                                        confirmBookingScreenDataState12 = confirmBookingScreenDataState10;
                                        toolbarUIState6 = toolbarUIState5;
                                        i5 = 1;
                                        chaloTextUIState2 = chaloTextUIState;
                                        function8 = function7;
                                        list12 = list11;
                                        styledTextDataUIStateArr4 = styledTextDataUIStateArr3;
                                        priceDetailsUiState4 = priceDetailsUiState3;
                                        journeyDetailsUiState7 = journeyDetailsUiState6;
                                        String str17 = (String) objB10;
                                        obj9 = obj7;
                                        tnCDialogUIState = null;
                                        styledTextDataUIStateArr4[i5] = new StyledTextDataUIState(str17, orangePrimary, UIFontWeight.Bold, UITextStyle.BodySmall, null, null, new StyledTextClickHandler() { // from class: app.chalo.metro.ui.confirmbooking.uistate.ConfirmBookingUIStateFactory$create$termsAndConditionsUiState$2$1
                                            @Override // app.chalo.uistate.text.StyledTextClickHandler
                                            public final void a() {
                                                function8.invoke(ConfirmBookingScreenViewIntent.OnTermsAndConditionsClicked.f5468a);
                                            }

                                            @Override // app.chalo.uistate.text.StyledTextClickHandler
                                            /* JADX INFO: renamed from: b */
                                            public final String getB() {
                                                return "TNC_CLICKABLE_TEXT";
                                            }

                                            @Override // app.chalo.uistate.text.StyledTextClickHandler
                                            /* JADX INFO: renamed from: getTag */
                                            public final String getF10085a() {
                                                return "TNC_CLICKABLE_TEXT";
                                            }
                                        }, 496);
                                        termsAndConditionsUiState = new TermsAndConditionsUiState(chaloTextUIState2, list12, new TextUIState.StyledTextUIState(CollectionsKt.S(styledTextDataUIStateArr3), null, null, 30));
                                        function7 = function8;
                                        confirmBookingScreenDataState11 = confirmBookingScreenDataState12;
                                        priceDetailsUiState2 = priceDetailsUiState4;
                                        str9 = str12;
                                        journeyDetailsUiState4 = journeyDetailsUiState7;
                                        loadingDialogUIState6 = loadingDialogUIState8;
                                        toolbarUIState4 = toolbarUIState6;
                                    }
                                    z = confirmBookingScreenDataState11.m;
                                    List list19 = confirmBookingScreenDataState11.j;
                                    if (z) {
                                    }
                                    obj11 = obj9;
                                    JourneyDetailsUiState journeyDetailsUiState16 = journeyDetailsUiState4;
                                    priceDetailsUiState5 = priceDetailsUiState2;
                                    loadingDialogUIState9 = loadingDialogUIState6;
                                    toolbarUIState7 = toolbarUIState4;
                                    journeyDetailsUiState8 = journeyDetailsUiState16;
                                    Function1 function17 = function7;
                                    confirmBookingScreenDataState13 = confirmBookingScreenDataState11;
                                    function9 = function17;
                                    tnCDialogUIState2 = tnCDialogUIState;
                                    StringEnum stringEnum4 = StringEnum.FARE_DETAILS_PAY;
                                    Object[] objArr4 = {str9};
                                    confirmBookingUIStateFactory$create$1.L$0 = confirmBookingScreenDataState13;
                                    confirmBookingUIStateFactory$create$1.L$1 = function9;
                                    confirmBookingUIStateFactory$create$1.L$2 = loadingDialogUIState9;
                                    confirmBookingUIStateFactory$create$1.L$3 = toolbarUIState7;
                                    confirmBookingUIStateFactory$create$1.L$4 = journeyDetailsUiState8;
                                    confirmBookingUIStateFactory$create$1.L$5 = priceDetailsUiState5;
                                    confirmBookingUIStateFactory$create$1.L$6 = termsAndConditionsUiState;
                                    confirmBookingUIStateFactory$create$1.L$7 = tnCDialogUIState2;
                                    buttonUIStateFactory = ButtonUIStateFactory.f9921a;
                                    confirmBookingUIStateFactory$create$1.L$8 = buttonUIStateFactory;
                                    confirmBookingUIStateFactory$create$1.L$9 = tnCDialogUIState;
                                    confirmBookingUIStateFactory$create$1.L$10 = tnCDialogUIState;
                                    confirmBookingUIStateFactory$create$1.label = 12;
                                    objB11 = stringProvider.b(stringEnum4, objArr4, confirmBookingUIStateFactory$create$1);
                                    if (objB11 != obj11) {
                                        priceDetailsUiState6 = priceDetailsUiState5;
                                        termsAndConditionsUiState2 = termsAndConditionsUiState;
                                        confirmBookingScreenDataState14 = confirmBookingScreenDataState13;
                                        loadingDialogUIState10 = loadingDialogUIState9;
                                        buttonUIStateFactory2 = buttonUIStateFactory;
                                        tnCDialogUIState3 = tnCDialogUIState2;
                                        function10 = function9;
                                        confirmBookingScreenDataState15 = confirmBookingScreenDataState14;
                                        journeyDetailsUiState9 = journeyDetailsUiState8;
                                        tnCDialogUIState4 = tnCDialogUIState3;
                                        loadingDialogUIState11 = loadingDialogUIState10;
                                        stringProvider2 = stringProvider;
                                        obj13 = obj11;
                                        toolbarUIState8 = toolbarUIState7;
                                        buttonUIStateG = ButtonUIStateFactory.g(buttonUIStateFactory2, (String) objB11, new bp(function10, 15), null, UIShape.d, true, 0.0f, 36);
                                        if (confirmBookingScreenDataState15.l) {
                                            confirmBookingUIStateFactory$create$1.L$0 = confirmBookingScreenDataState15;
                                            confirmBookingUIStateFactory$create$1.L$1 = function10;
                                            confirmBookingUIStateFactory$create$1.L$2 = loadingDialogUIState11;
                                            confirmBookingUIStateFactory$create$1.L$3 = toolbarUIState8;
                                            confirmBookingUIStateFactory$create$1.L$4 = journeyDetailsUiState9;
                                            confirmBookingUIStateFactory$create$1.L$5 = priceDetailsUiState6;
                                            confirmBookingUIStateFactory$create$1.L$6 = termsAndConditionsUiState2;
                                            confirmBookingUIStateFactory$create$1.L$7 = tnCDialogUIState4;
                                            confirmBookingUIStateFactory$create$1.L$8 = buttonUIStateG;
                                            chaloTextStyleHelper14 = chaloTextStyleHelper11;
                                            confirmBookingUIStateFactory$create$1.L$9 = chaloTextStyleHelper14;
                                            confirmBookingUIStateFactory$create$1.label = 13;
                                            stringProvider3 = stringProvider2;
                                            objB12 = stringProvider3.b(StringEnum.SOMETHING_WENT_WRONG, new Object[0], confirmBookingUIStateFactory$create$1);
                                            obj14 = obj13;
                                            if (objB12 == obj14) {
                                                return obj14;
                                            }
                                            journeyDetailsUiState11 = journeyDetailsUiState9;
                                            priceDetailsUiState8 = priceDetailsUiState6;
                                            function11 = function10;
                                            confirmBookingScreenDataState17 = confirmBookingScreenDataState15;
                                            obj15 = objB12;
                                            tnCDialogUIState6 = tnCDialogUIState4;
                                            chaloTextStyleHelper15 = chaloTextStyleHelper14;
                                            chaloTextUIStateB = ChaloTextStyleHelper.b(chaloTextStyleHelper15, (String) obj15, ChaloColorToken.White.f9870a, 0, null, null, null, null, 124);
                                            confirmBookingUIStateFactory$create$1.L$0 = confirmBookingScreenDataState17;
                                            confirmBookingUIStateFactory$create$1.L$1 = function11;
                                            confirmBookingUIStateFactory$create$1.L$2 = loadingDialogUIState11;
                                            confirmBookingUIStateFactory$create$1.L$3 = toolbarUIState8;
                                            confirmBookingUIStateFactory$create$1.L$4 = journeyDetailsUiState11;
                                            confirmBookingUIStateFactory$create$1.L$5 = priceDetailsUiState8;
                                            confirmBookingUIStateFactory$create$1.L$6 = termsAndConditionsUiState2;
                                            confirmBookingUIStateFactory$create$1.L$7 = tnCDialogUIState6;
                                            confirmBookingUIStateFactory$create$1.L$8 = buttonUIStateG;
                                            confirmBookingUIStateFactory$create$1.L$9 = chaloTextUIStateB;
                                            confirmBookingUIStateFactory$create$1.L$10 = chaloTextStyleHelper14;
                                            confirmBookingScreenDataState18 = confirmBookingScreenDataState17;
                                            confirmBookingUIStateFactory$create$1.label = 14;
                                            objB13 = stringProvider3.b(StringEnum.RETRY, new Object[0], confirmBookingUIStateFactory$create$1);
                                            if (objB13 == obj14) {
                                                return obj14;
                                            }
                                            toolbarUIState10 = toolbarUIState8;
                                            termsAndConditionsUiState4 = termsAndConditionsUiState2;
                                            confirmBookingScreenDataState19 = confirmBookingScreenDataState18;
                                            function12 = function11;
                                            chaloTextUIState3 = chaloTextUIStateB;
                                            obj16 = objB13;
                                            priceDetailsUiState9 = priceDetailsUiState8;
                                            chaloTextStyleHelper16 = chaloTextStyleHelper14;
                                            loadingDialogUIState13 = loadingDialogUIState11;
                                            journeyDetailsUiState12 = journeyDetailsUiState11;
                                            ChaloColorToken.OrangePrimary orangePrimary5 = orangePrimary;
                                            priceDetailsUiState7 = priceDetailsUiState9;
                                            tnCDialogUIState5 = tnCDialogUIState6;
                                            termsAndConditionsUiState3 = termsAndConditionsUiState4;
                                            snackbarUIState = new SnackbarUIState(chaloTextUIState3, ChaloTextStyleHelper.b(chaloTextStyleHelper16, (String) obj16, orangePrimary5, 0, null, UIFontWeight.SemiBold, null, null, 108), UiEventHandler.Companion.a(new bp(function12, 16)));
                                            journeyDetailsUiState10 = journeyDetailsUiState12;
                                            toolbarUIState9 = toolbarUIState10;
                                            loadingDialogUIState12 = loadingDialogUIState13;
                                            confirmBookingScreenDataState16 = confirmBookingScreenDataState19;
                                        } else {
                                            confirmBookingScreenDataState16 = confirmBookingScreenDataState15;
                                            journeyDetailsUiState10 = journeyDetailsUiState9;
                                            tnCDialogUIState5 = tnCDialogUIState4;
                                            loadingDialogUIState12 = loadingDialogUIState11;
                                            toolbarUIState9 = toolbarUIState8;
                                            termsAndConditionsUiState3 = termsAndConditionsUiState2;
                                            priceDetailsUiState7 = priceDetailsUiState6;
                                            snackbarUIState = null;
                                        }
                                        ButtonUIState buttonUIState4 = buttonUIStateG;
                                        boolean z5 = confirmBookingScreenDataState16.k;
                                        if (confirmBookingScreenDataState16.c) {
                                            loadingDialogUIState14 = loadingDialogUIState12;
                                        } else {
                                            loadingDialogUIState14 = null;
                                        }
                                        return new ConfirmBookingScreenViewState(toolbarUIState9, journeyDetailsUiState10, priceDetailsUiState7, termsAndConditionsUiState3, tnCDialogUIState5, buttonUIState4, snackbarUIState, z5, loadingDialogUIState14);
                                    }
                                    return obj11;
                                }
                                obj9 = obj7;
                                chaloTextStyleHelper11 = chaloTextStyleHelper17;
                                tnCDialogUIState = null;
                                termsAndConditionsUiState = null;
                                journeyDetailsUiState4 = journeyDetailsUiState3;
                                str9 = str8;
                                toolbarUIState4 = toolbarUIState3;
                                priceDetailsUiState2 = priceDetailsUiState;
                                loadingDialogUIState6 = loadingDialogUIState5;
                                confirmBookingScreenDataState11 = confirmBookingScreenDataState10;
                                z = confirmBookingScreenDataState11.m;
                                List list110 = confirmBookingScreenDataState11.j;
                                if (z) {
                                }
                                obj11 = obj9;
                                JourneyDetailsUiState journeyDetailsUiState17 = journeyDetailsUiState4;
                                priceDetailsUiState5 = priceDetailsUiState2;
                                loadingDialogUIState9 = loadingDialogUIState6;
                                toolbarUIState7 = toolbarUIState4;
                                journeyDetailsUiState8 = journeyDetailsUiState17;
                                Function1 function18 = function7;
                                confirmBookingScreenDataState13 = confirmBookingScreenDataState11;
                                function9 = function18;
                                tnCDialogUIState2 = tnCDialogUIState;
                                StringEnum stringEnum5 = StringEnum.FARE_DETAILS_PAY;
                                Object[] objArr5 = {str9};
                                confirmBookingUIStateFactory$create$1.L$0 = confirmBookingScreenDataState13;
                                confirmBookingUIStateFactory$create$1.L$1 = function9;
                                confirmBookingUIStateFactory$create$1.L$2 = loadingDialogUIState9;
                                confirmBookingUIStateFactory$create$1.L$3 = toolbarUIState7;
                                confirmBookingUIStateFactory$create$1.L$4 = journeyDetailsUiState8;
                                confirmBookingUIStateFactory$create$1.L$5 = priceDetailsUiState5;
                                confirmBookingUIStateFactory$create$1.L$6 = termsAndConditionsUiState;
                                confirmBookingUIStateFactory$create$1.L$7 = tnCDialogUIState2;
                                buttonUIStateFactory = ButtonUIStateFactory.f9921a;
                                confirmBookingUIStateFactory$create$1.L$8 = buttonUIStateFactory;
                                confirmBookingUIStateFactory$create$1.L$9 = tnCDialogUIState;
                                confirmBookingUIStateFactory$create$1.L$10 = tnCDialogUIState;
                                confirmBookingUIStateFactory$create$1.label = 12;
                                objB11 = stringProvider.b(stringEnum5, objArr5, confirmBookingUIStateFactory$create$1);
                                if (objB11 != obj11) {
                                    priceDetailsUiState6 = priceDetailsUiState5;
                                    termsAndConditionsUiState2 = termsAndConditionsUiState;
                                    confirmBookingScreenDataState14 = confirmBookingScreenDataState13;
                                    loadingDialogUIState10 = loadingDialogUIState9;
                                    buttonUIStateFactory2 = buttonUIStateFactory;
                                    tnCDialogUIState3 = tnCDialogUIState2;
                                    function10 = function9;
                                    confirmBookingScreenDataState15 = confirmBookingScreenDataState14;
                                    journeyDetailsUiState9 = journeyDetailsUiState8;
                                    tnCDialogUIState4 = tnCDialogUIState3;
                                    loadingDialogUIState11 = loadingDialogUIState10;
                                    stringProvider2 = stringProvider;
                                    obj13 = obj11;
                                    toolbarUIState8 = toolbarUIState7;
                                    buttonUIStateG = ButtonUIStateFactory.g(buttonUIStateFactory2, (String) objB11, new bp(function10, 15), null, UIShape.d, true, 0.0f, 36);
                                    if (confirmBookingScreenDataState15.l) {
                                        confirmBookingUIStateFactory$create$1.L$0 = confirmBookingScreenDataState15;
                                        confirmBookingUIStateFactory$create$1.L$1 = function10;
                                        confirmBookingUIStateFactory$create$1.L$2 = loadingDialogUIState11;
                                        confirmBookingUIStateFactory$create$1.L$3 = toolbarUIState8;
                                        confirmBookingUIStateFactory$create$1.L$4 = journeyDetailsUiState9;
                                        confirmBookingUIStateFactory$create$1.L$5 = priceDetailsUiState6;
                                        confirmBookingUIStateFactory$create$1.L$6 = termsAndConditionsUiState2;
                                        confirmBookingUIStateFactory$create$1.L$7 = tnCDialogUIState4;
                                        confirmBookingUIStateFactory$create$1.L$8 = buttonUIStateG;
                                        chaloTextStyleHelper14 = chaloTextStyleHelper11;
                                        confirmBookingUIStateFactory$create$1.L$9 = chaloTextStyleHelper14;
                                        confirmBookingUIStateFactory$create$1.label = 13;
                                        stringProvider3 = stringProvider2;
                                        objB12 = stringProvider3.b(StringEnum.SOMETHING_WENT_WRONG, new Object[0], confirmBookingUIStateFactory$create$1);
                                        obj14 = obj13;
                                        if (objB12 == obj14) {
                                            return obj14;
                                        }
                                        journeyDetailsUiState11 = journeyDetailsUiState9;
                                        priceDetailsUiState8 = priceDetailsUiState6;
                                        function11 = function10;
                                        confirmBookingScreenDataState17 = confirmBookingScreenDataState15;
                                        obj15 = objB12;
                                        tnCDialogUIState6 = tnCDialogUIState4;
                                        chaloTextStyleHelper15 = chaloTextStyleHelper14;
                                        chaloTextUIStateB = ChaloTextStyleHelper.b(chaloTextStyleHelper15, (String) obj15, ChaloColorToken.White.f9870a, 0, null, null, null, null, 124);
                                        confirmBookingUIStateFactory$create$1.L$0 = confirmBookingScreenDataState17;
                                        confirmBookingUIStateFactory$create$1.L$1 = function11;
                                        confirmBookingUIStateFactory$create$1.L$2 = loadingDialogUIState11;
                                        confirmBookingUIStateFactory$create$1.L$3 = toolbarUIState8;
                                        confirmBookingUIStateFactory$create$1.L$4 = journeyDetailsUiState11;
                                        confirmBookingUIStateFactory$create$1.L$5 = priceDetailsUiState8;
                                        confirmBookingUIStateFactory$create$1.L$6 = termsAndConditionsUiState2;
                                        confirmBookingUIStateFactory$create$1.L$7 = tnCDialogUIState6;
                                        confirmBookingUIStateFactory$create$1.L$8 = buttonUIStateG;
                                        confirmBookingUIStateFactory$create$1.L$9 = chaloTextUIStateB;
                                        confirmBookingUIStateFactory$create$1.L$10 = chaloTextStyleHelper14;
                                        confirmBookingScreenDataState18 = confirmBookingScreenDataState17;
                                        confirmBookingUIStateFactory$create$1.label = 14;
                                        objB13 = stringProvider3.b(StringEnum.RETRY, new Object[0], confirmBookingUIStateFactory$create$1);
                                        if (objB13 == obj14) {
                                            return obj14;
                                        }
                                        toolbarUIState10 = toolbarUIState8;
                                        termsAndConditionsUiState4 = termsAndConditionsUiState2;
                                        confirmBookingScreenDataState19 = confirmBookingScreenDataState18;
                                        function12 = function11;
                                        chaloTextUIState3 = chaloTextUIStateB;
                                        obj16 = objB13;
                                        priceDetailsUiState9 = priceDetailsUiState8;
                                        chaloTextStyleHelper16 = chaloTextStyleHelper14;
                                        loadingDialogUIState13 = loadingDialogUIState11;
                                        journeyDetailsUiState12 = journeyDetailsUiState11;
                                        ChaloColorToken.OrangePrimary orangePrimary6 = orangePrimary;
                                        priceDetailsUiState7 = priceDetailsUiState9;
                                        tnCDialogUIState5 = tnCDialogUIState6;
                                        termsAndConditionsUiState3 = termsAndConditionsUiState4;
                                        snackbarUIState = new SnackbarUIState(chaloTextUIState3, ChaloTextStyleHelper.b(chaloTextStyleHelper16, (String) obj16, orangePrimary6, 0, null, UIFontWeight.SemiBold, null, null, 108), UiEventHandler.Companion.a(new bp(function12, 16)));
                                        journeyDetailsUiState10 = journeyDetailsUiState12;
                                        toolbarUIState9 = toolbarUIState10;
                                        loadingDialogUIState12 = loadingDialogUIState13;
                                        confirmBookingScreenDataState16 = confirmBookingScreenDataState19;
                                    } else {
                                        confirmBookingScreenDataState16 = confirmBookingScreenDataState15;
                                        journeyDetailsUiState10 = journeyDetailsUiState9;
                                        tnCDialogUIState5 = tnCDialogUIState4;
                                        loadingDialogUIState12 = loadingDialogUIState11;
                                        toolbarUIState9 = toolbarUIState8;
                                        termsAndConditionsUiState3 = termsAndConditionsUiState2;
                                        priceDetailsUiState7 = priceDetailsUiState6;
                                        snackbarUIState = null;
                                    }
                                    ButtonUIState buttonUIState5 = buttonUIStateG;
                                    boolean z6 = confirmBookingScreenDataState16.k;
                                    if (confirmBookingScreenDataState16.c) {
                                        loadingDialogUIState14 = loadingDialogUIState12;
                                    } else {
                                        loadingDialogUIState14 = null;
                                    }
                                    return new ConfirmBookingScreenViewState(toolbarUIState9, journeyDetailsUiState10, priceDetailsUiState7, termsAndConditionsUiState3, tnCDialogUIState5, buttonUIState5, snackbarUIState, z6, loadingDialogUIState14);
                                }
                                return obj11;
                            }
                        }
                    }
                }
                return obj17;
            case 1:
                ChaloTextStyleHelper chaloTextStyleHelper23 = (ChaloTextStyleHelper) confirmBookingUIStateFactory$create$1.L$2;
                Function1 function19 = (Function1) confirmBookingUIStateFactory$create$1.L$1;
                ConfirmBookingScreenDataState confirmBookingScreenDataState20 = (ConfirmBookingScreenDataState) confirmBookingUIStateFactory$create$1.L$0;
                ResultKt.b(obj16);
                chaloTextStyleHelper = chaloTextStyleHelper23;
                function2 = function19;
                confirmBookingScreenDataState2 = confirmBookingScreenDataState20;
                objB = obj16;
                loadingDialogUIState = new LoadingDialogUIState(ChaloTextStyleHelper.b(chaloTextStyleHelper, (String) objB, null, 0, null, null, null, null, WebSocketProtocol.PAYLOAD_SHORT));
                chaloTransitMode = confirmBookingScreenDataState2.f5463a;
                Intrinsics.i(chaloTransitMode, "<this>");
                switch (CityAppModelKt.WhenMappings.f8855a[chaloTransitMode.ordinal()]) {
                    case 1:
                        iconType = IconType.BUS_SEARCH;
                        break;
                    case 2:
                        iconType = IconType.TRAIN_SEARCH;
                        break;
                    case 3:
                        iconType = IconType.METRO_SEARCH;
                        break;
                    case 4:
                        iconType = IconType.MONORAIL_SEARCH;
                        break;
                    case 5:
                        iconType = IconType.FERRY_SEARCH;
                        break;
                    case 6:
                        iconType = IconType.CAB_NEARBY;
                        break;
                    case 7:
                        iconType = IconType.BUS_SEARCH;
                        break;
                    case 8:
                        iconType = IconType.BUS_SEARCH;
                        break;
                    default:
                        throw new NoWhenBranchMatchedException();
                }
                confirmBookingUIStateFactory$create$1.L$0 = confirmBookingScreenDataState2;
                confirmBookingUIStateFactory$create$1.L$1 = function2;
                confirmBookingUIStateFactory$create$1.L$2 = loadingDialogUIState;
                confirmBookingUIStateFactory$create$1.L$3 = iconType;
                confirmBookingUIStateFactory$create$1.L$4 = chaloTextStyleHelper17;
                confirmBookingUIStateFactory$create$1.label = 2;
                objB2 = stringProvider4.b(StringEnum.CONFIRM_DETAILS, new Object[0], confirmBookingUIStateFactory$create$1);
                if (objB2 != obj17) {
                    Function1 function110 = function2;
                    iconType2 = iconType;
                    obj = objB2;
                    loadingDialogUIState2 = loadingDialogUIState;
                    confirmBookingScreenDataState3 = confirmBookingScreenDataState2;
                    function3 = function110;
                    chaloTextStyleHelper2 = chaloTextStyleHelper17;
                    toolbarUIState = new ToolbarUIState(null, ChaloTextStyleHelper.e(chaloTextStyleHelper2, (String) obj, ChaloColorToken.AlmostBlackColor.f9756a, null, UIFontWeight.Bold, null, 108), null, null, null, ChaloThemeHelper.a().f1916a, null, null, 221);
                    list = confirmBookingScreenDataState3.g;
                    if (list != null) {
                        List list111 = list;
                        arrayList2 = new ArrayList(CollectionsKt.v(list111, 10));
                        while (it.hasNext()) {
                            ConfirmBookingPassengerDetails confirmBookingPassengerDetails2 = (ConfirmBookingPassengerDetails) it.next();
                            ArrayList arrayList8 = arrayList2;
                            String str18 = confirmBookingPassengerDetails2.b;
                            ChaloTextStyleHelper chaloTextStyleHelper110 = chaloTextStyleHelper17;
                            chaloTextStyleHelper17 = chaloTextStyleHelper110;
                            arrayList8.add(new TitleSubtitleUiState(null, ChaloTextStyleHelper.c(chaloTextStyleHelper110, str18, shadyGray, null, null, null, null, 124), ChaloTextStyleHelper.b(chaloTextStyleHelper17, String.valueOf(confirmBookingPassengerDetails2.c), null, 0, null, null, null, null, WebSocketProtocol.PAYLOAD_SHORT), null, 9));
                            stringProvider4 = stringProvider4;
                            arrayList2 = arrayList8;
                        }
                        arrayList = arrayList2;
                    } else {
                        arrayList = null;
                    }
                    stringProvider = stringProvider4;
                    chaloTextStyleHelper3 = chaloTextStyleHelper17;
                    confirmBookingUIStateFactory$create$1.L$0 = confirmBookingScreenDataState3;
                    confirmBookingUIStateFactory$create$1.L$1 = function3;
                    confirmBookingUIStateFactory$create$1.L$2 = loadingDialogUIState2;
                    confirmBookingUIStateFactory$create$1.L$3 = iconType2;
                    confirmBookingUIStateFactory$create$1.L$4 = toolbarUIState;
                    confirmBookingUIStateFactory$create$1.L$5 = arrayList;
                    confirmBookingUIStateFactory$create$1.L$6 = chaloTextStyleHelper3;
                    confirmBookingUIStateFactory$create$1.label = 3;
                    objB3 = stringProvider.b(StringEnum.START_STOP, new Object[0], confirmBookingUIStateFactory$create$1);
                    if (objB3 != obj17) {
                        ArrayList arrayList9 = arrayList;
                        function4 = function3;
                        list2 = arrayList9;
                        confirmBookingScreenDataState4 = confirmBookingScreenDataState3;
                        toolbarUIState2 = toolbarUIState;
                        obj2 = objB3;
                        chaloTextStyleHelper4 = chaloTextStyleHelper3;
                        confirmBookingScreenDataState5 = confirmBookingScreenDataState4;
                        TextUIState.ChaloTextUIState chaloTextUIStateC3 = ChaloTextStyleHelper.c(chaloTextStyleHelper4, (String) obj2, shadyGray, null, null, null, null, 124);
                        confirmationScreenTripDetails = confirmBookingScreenDataState5.f;
                        if (confirmationScreenTripDetails != null) {
                            str = str13;
                        } else {
                            str = str13;
                        }
                        ChaloTextStyleHelper chaloTextStyleHelper111 = chaloTextStyleHelper3;
                        chaloTextStyleHelper5 = chaloTextStyleHelper111;
                        iconType3 = iconType2;
                        stopDetailUiState = new StopDetailUiState(new ImageUIState(iconType3, (String) null, (ChaloColorToken) null, new ImageUISize(Dp.m7276boximpl(ChaloThemeHelper.a().i), Dp.m7276boximpl(ChaloThemeHelper.a().i)), (UIContentScale) null, 0.0f, (UiEventHandler) null, 246), chaloTextUIStateC3, ChaloTextStyleHelper.b(chaloTextStyleHelper111, str, null, 0, null, null, null, null, WebSocketProtocol.PAYLOAD_SHORT));
                        confirmBookingUIStateFactory$create$1.L$0 = confirmBookingScreenDataState5;
                        confirmBookingUIStateFactory$create$1.L$1 = function4;
                        confirmBookingUIStateFactory$create$1.L$2 = loadingDialogUIState2;
                        confirmBookingUIStateFactory$create$1.L$3 = iconType3;
                        confirmBookingUIStateFactory$create$1.L$4 = toolbarUIState2;
                        confirmBookingUIStateFactory$create$1.L$5 = list2;
                        confirmBookingUIStateFactory$create$1.L$6 = stopDetailUiState;
                        confirmBookingUIStateFactory$create$1.L$7 = chaloTextStyleHelper5;
                        confirmBookingUIStateFactory$create$1.label = 4;
                        objB4 = stringProvider.b(StringEnum.EXIT_STOP, new Object[0], confirmBookingUIStateFactory$create$1);
                        if (objB4 != obj17) {
                            ToolbarUIState toolbarUIState12 = toolbarUIState2;
                            list3 = list2;
                            stopDetailUiState2 = stopDetailUiState;
                            toolbarUIState3 = toolbarUIState12;
                            confirmBookingScreenDataState6 = confirmBookingScreenDataState5;
                            obj3 = objB4;
                            function5 = function4;
                            loadingDialogUIState3 = loadingDialogUIState2;
                            iconType4 = iconType3;
                            chaloTextStyleHelper6 = chaloTextStyleHelper5;
                            String str19 = (String) obj3;
                            ChaloTextStyleHelper chaloTextStyleHelper24 = chaloTextStyleHelper5;
                            confirmBookingScreenDataState7 = confirmBookingScreenDataState6;
                            TextUIState.ChaloTextUIState chaloTextUIStateC4 = ChaloTextStyleHelper.c(chaloTextStyleHelper6, str19, shadyGray, null, null, null, null, 124);
                            confirmationScreenTripDetails2 = confirmBookingScreenDataState7.f;
                            if (confirmationScreenTripDetails2 != null) {
                                str3 = str13;
                            } else {
                                str3 = str13;
                            }
                            list4 = list3;
                            chaloTextStyleHelper7 = chaloTextStyleHelper24;
                            StopDetailUiState stopDetailUiState4 = new StopDetailUiState(new ImageUIState(iconType4, (String) null, (ChaloColorToken) null, new ImageUISize(Dp.m7276boximpl(ChaloThemeHelper.a().i), Dp.m7276boximpl(ChaloThemeHelper.a().i)), (UIContentScale) null, 0.0f, (UiEventHandler) null, 246), chaloTextUIStateC4, ChaloTextStyleHelper.b(chaloTextStyleHelper24, str3, null, 0, null, null, null, null, WebSocketProtocol.PAYLOAD_SHORT));
                            if (list4 == null) {
                                list5 = EmptyList.f17557a;
                            } else {
                                list5 = list4;
                            }
                            journeyDetailsUiState = new JourneyDetailsUiState(stopDetailUiState2, stopDetailUiState4, list5, new DividerUIState(0.0f, null, null, 7));
                            l = confirmBookingScreenDataState7.h;
                            if (l != null) {
                                jLongValue = l.longValue();
                            } else {
                                jLongValue = 0;
                            }
                            strA = currencyFeature.a(jLongValue, CurrencyRoundOffLogic.ROUND_OFF_LOGIC_NO_ROUNDING);
                            list6 = confirmBookingScreenDataState7.i;
                            if (list6 != null) {
                                arrayList3 = new ArrayList();
                                while (r12.hasNext()) {
                                    if (((FareBreakupAppModel) obj18).b == FareBreakupOperationType.SUBTRACTION) {
                                        arrayList3.add(obj18);
                                    }
                                }
                                size = arrayList3.size();
                                obj4 = obj17;
                                str4 = strA;
                                j = 0;
                                while (i < size) {
                                    j += ((FareBreakupAppModel) arrayList3.get(i)).c;
                                    size = size;
                                }
                                l2 = new Long(j);
                                if (l2.longValue() <= 0) {
                                    l2 = null;
                                }
                                if (l2 != null) {
                                }
                                if (strA2 != null) {
                                    productBannerSpec = new ProductBannerSpec();
                                    confirmBookingUIStateFactory$create$1.L$0 = confirmBookingScreenDataState7;
                                    confirmBookingUIStateFactory$create$1.L$1 = function5;
                                    confirmBookingUIStateFactory$create$1.L$2 = loadingDialogUIState3;
                                    confirmBookingUIStateFactory$create$1.L$3 = toolbarUIState3;
                                    confirmBookingUIStateFactory$create$1.L$4 = journeyDetailsUiState;
                                    confirmBookingUIStateFactory$create$1.L$5 = str4;
                                    confirmBookingUIStateFactory$create$1.L$6 = chaloTextStyleHelper7;
                                    confirmBookingUIStateFactory$create$1.L$7 = productBannerSpec;
                                    confirmBookingUIStateFactory$create$1.label = 5;
                                    objB5 = stringProvider.b(StringEnum.DISCOUNT_TEXT_COPY, new Object[]{strA2}, confirmBookingUIStateFactory$create$1);
                                    obj5 = obj4;
                                    if (objB5 == obj5) {
                                        return obj5;
                                    }
                                    function6 = function5;
                                    confirmBookingScreenDataState8 = confirmBookingScreenDataState7;
                                    obj6 = objB5;
                                    loadingDialogUIState4 = loadingDialogUIState3;
                                    journeyDetailsUiState2 = journeyDetailsUiState;
                                    chaloTextStyleHelper8 = chaloTextStyleHelper7;
                                    productBannerUIState = new ProductBannerUIState(productBannerSpec, ChaloTextStyleHelper.c(chaloTextStyleHelper8, (String) obj6, null, null, UIFontWeight.SemiBold, null, null, FacebookMediationAdapter.ERROR_FAILED_TO_PRESENT_AD), new ImageUIState(IconType.DISCOUNT_GREEN, (String) null, (ChaloColorToken) null, (ImageUISize) null, (UIContentScale) null, 0.0f, (UiEventHandler) null, 254));
                                    confirmBookingScreenDataState7 = confirmBookingScreenDataState8;
                                } else {
                                    obj5 = obj4;
                                    loadingDialogUIState4 = loadingDialogUIState3;
                                    function6 = function5;
                                    journeyDetailsUiState2 = journeyDetailsUiState;
                                    productBannerUIState = null;
                                }
                                list7 = confirmBookingScreenDataState7.i;
                                if (list7 != null) {
                                    List list112 = list7;
                                    arrayList4 = new ArrayList(CollectionsKt.v(list112, 10));
                                    it2 = list112.iterator();
                                    while (it2.hasNext()) {
                                        FareBreakupAppModel fareBreakupAppModel3 = (FareBreakupAppModel) it2.next();
                                        FareBreakupOperationUIProperties fareBreakupOperationUIPropertiesA3 = FareBreakupOperationUIPropertiesKt.a(fareBreakupAppModel3.b, (3 & 1) != 0 ? ChaloColorToken.Black.f9759a : ChaloColorToken.AlmostBlackColor.f9756a, (3 & 2) != 0);
                                        ChaloTextStyleHelper chaloTextStyleHelper25 = chaloTextStyleHelper7;
                                        arrayList4.add(new FareLineUiState(ChaloTextStyleHelper.c(chaloTextStyleHelper25, fareBreakupAppModel3.f3890a, null, null, null, null, null, WebSocketProtocol.PAYLOAD_SHORT), ChaloTextStyleHelper.c(chaloTextStyleHelper25, vo1.A(fareBreakupOperationUIPropertiesA3.f8267a, currencyFeature.a(fareBreakupAppModel3.c, CurrencyRoundOffLogic.ROUND_OFF_LOGIC_NO_ROUNDING)), fareBreakupOperationUIPropertiesA3.b, null, UIFontWeight.Bold, null, null, 108)));
                                        it2 = it2;
                                        chaloTextStyleHelper7 = chaloTextStyleHelper25;
                                        obj5 = obj5;
                                    }
                                } else {
                                    arrayList4 = null;
                                }
                                chaloTextStyleHelper17 = chaloTextStyleHelper7;
                                Object obj111 = obj5;
                                confirmBookingUIStateFactory$create$1.L$0 = confirmBookingScreenDataState7;
                                confirmBookingUIStateFactory$create$1.L$1 = function6;
                                confirmBookingUIStateFactory$create$1.L$2 = loadingDialogUIState4;
                                confirmBookingUIStateFactory$create$1.L$3 = toolbarUIState3;
                                confirmBookingUIStateFactory$create$1.L$4 = journeyDetailsUiState2;
                                confirmBookingUIStateFactory$create$1.L$5 = str4;
                                confirmBookingUIStateFactory$create$1.L$6 = productBannerUIState;
                                confirmBookingUIStateFactory$create$1.L$7 = arrayList4;
                                confirmBookingUIStateFactory$create$1.L$8 = chaloTextStyleHelper17;
                                confirmBookingUIStateFactory$create$1.label = 6;
                                objB6 = stringProvider.b(StringEnum.TOTAL, new Object[0], confirmBookingUIStateFactory$create$1);
                                obj7 = obj111;
                                if (objB6 == obj7) {
                                    return obj7;
                                }
                                list8 = arrayList4;
                                str6 = str4;
                                productBannerUIState2 = productBannerUIState;
                                chaloTextStyleHelper9 = chaloTextStyleHelper17;
                                confirmBookingScreenDataState9 = confirmBookingScreenDataState7;
                                obj8 = objB6;
                                str7 = str6;
                                fareLineUiState = new FareLineUiState(ChaloTextStyleHelper.c(chaloTextStyleHelper9, (String) obj8, null, null, null, null, null, WebSocketProtocol.PAYLOAD_SHORT), ChaloTextStyleHelper.c(chaloTextStyleHelper17, str6, null, null, UIFontWeight.Bold, null, null, FacebookMediationAdapter.ERROR_FAILED_TO_PRESENT_AD));
                                confirmBookingUIStateFactory$create$1.L$0 = confirmBookingScreenDataState9;
                                confirmBookingUIStateFactory$create$1.L$1 = function6;
                                confirmBookingUIStateFactory$create$1.L$2 = loadingDialogUIState4;
                                confirmBookingUIStateFactory$create$1.L$3 = toolbarUIState3;
                                confirmBookingUIStateFactory$create$1.L$4 = journeyDetailsUiState2;
                                confirmBookingUIStateFactory$create$1.L$5 = str7;
                                confirmBookingUIStateFactory$create$1.L$6 = productBannerUIState2;
                                confirmBookingUIStateFactory$create$1.L$7 = list8;
                                confirmBookingUIStateFactory$create$1.L$8 = fareLineUiState;
                                confirmBookingUIStateFactory$create$1.L$9 = chaloTextStyleHelper17;
                                confirmBookingUIStateFactory$create$1.label = 7;
                                objB7 = stringProvider.b(StringEnum.PRICE_DETAILS, new Object[0], confirmBookingUIStateFactory$create$1);
                                if (objB7 == obj7) {
                                    return obj7;
                                }
                                fareLineUiState2 = fareLineUiState;
                                chaloTextStyleHelper10 = chaloTextStyleHelper17;
                                confirmBookingScreenDataState10 = confirmBookingScreenDataState9;
                                function7 = function6;
                                loadingDialogUIState5 = loadingDialogUIState4;
                                journeyDetailsUiState3 = journeyDetailsUiState2;
                                str8 = str7;
                                TextUIState.ChaloTextUIState chaloTextUIStateA4 = ChaloTextStyleHelper.a(chaloTextStyleHelper10, (String) objB7, null, UIFontWeight.Bold, null, FacebookMediationAdapter.ERROR_FAILED_TO_PRESENT_AD);
                                if (list8 == null) {
                                    list8 = EmptyList.f17557a;
                                }
                                priceDetailsUiState = new PriceDetailsUiState(chaloTextUIStateA4, list8, fareLineUiState2, productBannerUIState2);
                                list9 = confirmBookingScreenDataState10.j;
                                if (list9 != null) {
                                    if (list9.isEmpty()) {
                                        list9 = null;
                                    }
                                    if (list9 != null) {
                                        List listX2 = CollectionsKt.x0(list9, 3);
                                        arrayList5 = new ArrayList(CollectionsKt.v(listX2, 10));
                                        it3 = listX2.iterator();
                                        i2 = 0;
                                        while (it3.hasNext()) {
                                            next = it3.next();
                                            i3 = i2 + 1;
                                            if (i2 < 0) {
                                                CollectionsKt.z0();
                                                throw null;
                                            }
                                            arrayList5.add(ChaloTextStyleHelper.c(chaloTextStyleHelper17, i3 + ". " + ((String) next), null, null, null, null, null, WebSocketProtocol.PAYLOAD_SHORT));
                                            it3 = it3;
                                            i2 = i3;
                                        }
                                        chaloTextStyleHelper12 = chaloTextStyleHelper17;
                                        confirmBookingUIStateFactory$create$1.L$0 = confirmBookingScreenDataState10;
                                        confirmBookingUIStateFactory$create$1.L$1 = function7;
                                        confirmBookingUIStateFactory$create$1.L$2 = loadingDialogUIState5;
                                        confirmBookingUIStateFactory$create$1.L$3 = toolbarUIState3;
                                        confirmBookingUIStateFactory$create$1.L$4 = journeyDetailsUiState3;
                                        confirmBookingUIStateFactory$create$1.L$5 = str8;
                                        confirmBookingUIStateFactory$create$1.L$6 = priceDetailsUiState;
                                        confirmBookingUIStateFactory$create$1.L$7 = arrayList5;
                                        confirmBookingUIStateFactory$create$1.L$8 = chaloTextStyleHelper12;
                                        confirmBookingUIStateFactory$create$1.L$9 = null;
                                        confirmBookingUIStateFactory$create$1.label = 8;
                                        objB8 = stringProvider.b(StringEnum.TERMS_AND_CONDITIONS, new Object[0], confirmBookingUIStateFactory$create$1);
                                        if (objB8 == obj7) {
                                            return obj7;
                                        }
                                        chaloTextStyleHelper13 = chaloTextStyleHelper12;
                                        str10 = str8;
                                        journeyDetailsUiState5 = journeyDetailsUiState3;
                                        list10 = arrayList5;
                                        chaloTextUIStateA = ChaloTextStyleHelper.a(chaloTextStyleHelper13, (String) objB8, null, UIFontWeight.Bold, null, FacebookMediationAdapter.ERROR_FAILED_TO_PRESENT_AD);
                                        styledTextDataUIStateArr = new StyledTextDataUIState[2];
                                        chaloTextStyleHelper11 = chaloTextStyleHelper12;
                                        confirmBookingUIStateFactory$create$1.L$0 = confirmBookingScreenDataState10;
                                        confirmBookingUIStateFactory$create$1.L$1 = function7;
                                        confirmBookingUIStateFactory$create$1.L$2 = loadingDialogUIState5;
                                        confirmBookingUIStateFactory$create$1.L$3 = toolbarUIState3;
                                        confirmBookingUIStateFactory$create$1.L$4 = journeyDetailsUiState5;
                                        confirmBookingUIStateFactory$create$1.L$5 = str10;
                                        confirmBookingUIStateFactory$create$1.L$6 = priceDetailsUiState;
                                        confirmBookingUIStateFactory$create$1.L$7 = styledTextDataUIStateArr;
                                        confirmBookingUIStateFactory$create$1.L$8 = chaloTextUIStateA;
                                        confirmBookingUIStateFactory$create$1.L$9 = list10;
                                        confirmBookingUIStateFactory$create$1.L$10 = styledTextDataUIStateArr;
                                        confirmBookingUIStateFactory$create$1.I$0 = 0;
                                        confirmBookingUIStateFactory$create$1.label = 9;
                                        objB9 = stringProvider.b(StringEnum.ALL_TNC_PREFIX, new Object[0], confirmBookingUIStateFactory$create$1);
                                        if (objB9 == obj7) {
                                            return obj7;
                                        }
                                        styledTextDataUIStateArr2 = styledTextDataUIStateArr;
                                        toolbarUIState5 = toolbarUIState3;
                                        priceDetailsUiState3 = priceDetailsUiState;
                                        loadingDialogUIState7 = loadingDialogUIState5;
                                        i4 = 0;
                                        journeyDetailsUiState6 = journeyDetailsUiState5;
                                        str11 = str10;
                                        chaloTextUIState = chaloTextUIStateA;
                                        obj10 = objB9;
                                        list11 = list10;
                                        styledTextDataUIStateArr2[i4] = new StyledTextDataUIState(obj10 + " ", null, null, UITextStyle.BodySmall, null, null, null, 1014);
                                        confirmBookingUIStateFactory$create$1.L$0 = confirmBookingScreenDataState10;
                                        confirmBookingUIStateFactory$create$1.L$1 = function7;
                                        confirmBookingUIStateFactory$create$1.L$2 = loadingDialogUIState7;
                                        confirmBookingUIStateFactory$create$1.L$3 = toolbarUIState5;
                                        confirmBookingUIStateFactory$create$1.L$4 = journeyDetailsUiState6;
                                        confirmBookingUIStateFactory$create$1.L$5 = str11;
                                        confirmBookingUIStateFactory$create$1.L$6 = priceDetailsUiState3;
                                        confirmBookingUIStateFactory$create$1.L$7 = styledTextDataUIStateArr;
                                        confirmBookingUIStateFactory$create$1.L$8 = chaloTextUIState;
                                        confirmBookingUIStateFactory$create$1.L$9 = list11;
                                        confirmBookingUIStateFactory$create$1.L$10 = styledTextDataUIStateArr;
                                        confirmBookingUIStateFactory$create$1.I$0 = 1;
                                        confirmBookingUIStateFactory$create$1.label = 10;
                                        objB10 = stringProvider.b(StringEnum.TNC_CLICKABLE_TEXT, new Object[0], confirmBookingUIStateFactory$create$1);
                                        if (objB10 == obj7) {
                                            return obj7;
                                        }
                                        styledTextDataUIStateArr3 = styledTextDataUIStateArr;
                                        str12 = str11;
                                        loadingDialogUIState8 = loadingDialogUIState7;
                                        confirmBookingScreenDataState12 = confirmBookingScreenDataState10;
                                        toolbarUIState6 = toolbarUIState5;
                                        i5 = 1;
                                        chaloTextUIState2 = chaloTextUIState;
                                        function8 = function7;
                                        list12 = list11;
                                        styledTextDataUIStateArr4 = styledTextDataUIStateArr3;
                                        priceDetailsUiState4 = priceDetailsUiState3;
                                        journeyDetailsUiState7 = journeyDetailsUiState6;
                                        String str110 = (String) objB10;
                                        obj9 = obj7;
                                        tnCDialogUIState = null;
                                        styledTextDataUIStateArr4[i5] = new StyledTextDataUIState(str110, orangePrimary, UIFontWeight.Bold, UITextStyle.BodySmall, null, null, new StyledTextClickHandler() { // from class: app.chalo.metro.ui.confirmbooking.uistate.ConfirmBookingUIStateFactory$create$termsAndConditionsUiState$2$1
                                            @Override // app.chalo.uistate.text.StyledTextClickHandler
                                            public final void a() {
                                                function8.invoke(ConfirmBookingScreenViewIntent.OnTermsAndConditionsClicked.f5468a);
                                            }

                                            @Override // app.chalo.uistate.text.StyledTextClickHandler
                                            /* JADX INFO: renamed from: b */
                                            public final String getB() {
                                                return "TNC_CLICKABLE_TEXT";
                                            }

                                            @Override // app.chalo.uistate.text.StyledTextClickHandler
                                            /* JADX INFO: renamed from: getTag */
                                            public final String getF10085a() {
                                                return "TNC_CLICKABLE_TEXT";
                                            }
                                        }, 496);
                                        termsAndConditionsUiState = new TermsAndConditionsUiState(chaloTextUIState2, list12, new TextUIState.StyledTextUIState(CollectionsKt.S(styledTextDataUIStateArr3), null, null, 30));
                                        function7 = function8;
                                        confirmBookingScreenDataState11 = confirmBookingScreenDataState12;
                                        priceDetailsUiState2 = priceDetailsUiState4;
                                        str9 = str12;
                                        journeyDetailsUiState4 = journeyDetailsUiState7;
                                        loadingDialogUIState6 = loadingDialogUIState8;
                                        toolbarUIState4 = toolbarUIState6;
                                    }
                                    z = confirmBookingScreenDataState11.m;
                                    List list113 = confirmBookingScreenDataState11.j;
                                    if (z) {
                                        break;
                                    }
                                    obj11 = obj9;
                                    JourneyDetailsUiState journeyDetailsUiState18 = journeyDetailsUiState4;
                                    priceDetailsUiState5 = priceDetailsUiState2;
                                    loadingDialogUIState9 = loadingDialogUIState6;
                                    toolbarUIState7 = toolbarUIState4;
                                    journeyDetailsUiState8 = journeyDetailsUiState18;
                                    Function1 function111 = function7;
                                    confirmBookingScreenDataState13 = confirmBookingScreenDataState11;
                                    function9 = function111;
                                    tnCDialogUIState2 = tnCDialogUIState;
                                    StringEnum stringEnum6 = StringEnum.FARE_DETAILS_PAY;
                                    Object[] objArr6 = {str9};
                                    confirmBookingUIStateFactory$create$1.L$0 = confirmBookingScreenDataState13;
                                    confirmBookingUIStateFactory$create$1.L$1 = function9;
                                    confirmBookingUIStateFactory$create$1.L$2 = loadingDialogUIState9;
                                    confirmBookingUIStateFactory$create$1.L$3 = toolbarUIState7;
                                    confirmBookingUIStateFactory$create$1.L$4 = journeyDetailsUiState8;
                                    confirmBookingUIStateFactory$create$1.L$5 = priceDetailsUiState5;
                                    confirmBookingUIStateFactory$create$1.L$6 = termsAndConditionsUiState;
                                    confirmBookingUIStateFactory$create$1.L$7 = tnCDialogUIState2;
                                    buttonUIStateFactory = ButtonUIStateFactory.f9921a;
                                    confirmBookingUIStateFactory$create$1.L$8 = buttonUIStateFactory;
                                    confirmBookingUIStateFactory$create$1.L$9 = tnCDialogUIState;
                                    confirmBookingUIStateFactory$create$1.L$10 = tnCDialogUIState;
                                    confirmBookingUIStateFactory$create$1.label = 12;
                                    objB11 = stringProvider.b(stringEnum6, objArr6, confirmBookingUIStateFactory$create$1);
                                    if (objB11 != obj11) {
                                        priceDetailsUiState6 = priceDetailsUiState5;
                                        termsAndConditionsUiState2 = termsAndConditionsUiState;
                                        confirmBookingScreenDataState14 = confirmBookingScreenDataState13;
                                        loadingDialogUIState10 = loadingDialogUIState9;
                                        buttonUIStateFactory2 = buttonUIStateFactory;
                                        tnCDialogUIState3 = tnCDialogUIState2;
                                        function10 = function9;
                                        confirmBookingScreenDataState15 = confirmBookingScreenDataState14;
                                        journeyDetailsUiState9 = journeyDetailsUiState8;
                                        tnCDialogUIState4 = tnCDialogUIState3;
                                        loadingDialogUIState11 = loadingDialogUIState10;
                                        stringProvider2 = stringProvider;
                                        obj13 = obj11;
                                        toolbarUIState8 = toolbarUIState7;
                                        buttonUIStateG = ButtonUIStateFactory.g(buttonUIStateFactory2, (String) objB11, new bp(function10, 15), null, UIShape.d, true, 0.0f, 36);
                                        if (confirmBookingScreenDataState15.l) {
                                            confirmBookingUIStateFactory$create$1.L$0 = confirmBookingScreenDataState15;
                                            confirmBookingUIStateFactory$create$1.L$1 = function10;
                                            confirmBookingUIStateFactory$create$1.L$2 = loadingDialogUIState11;
                                            confirmBookingUIStateFactory$create$1.L$3 = toolbarUIState8;
                                            confirmBookingUIStateFactory$create$1.L$4 = journeyDetailsUiState9;
                                            confirmBookingUIStateFactory$create$1.L$5 = priceDetailsUiState6;
                                            confirmBookingUIStateFactory$create$1.L$6 = termsAndConditionsUiState2;
                                            confirmBookingUIStateFactory$create$1.L$7 = tnCDialogUIState4;
                                            confirmBookingUIStateFactory$create$1.L$8 = buttonUIStateG;
                                            chaloTextStyleHelper14 = chaloTextStyleHelper11;
                                            confirmBookingUIStateFactory$create$1.L$9 = chaloTextStyleHelper14;
                                            confirmBookingUIStateFactory$create$1.label = 13;
                                            stringProvider3 = stringProvider2;
                                            objB12 = stringProvider3.b(StringEnum.SOMETHING_WENT_WRONG, new Object[0], confirmBookingUIStateFactory$create$1);
                                            obj14 = obj13;
                                            if (objB12 == obj14) {
                                                return obj14;
                                            }
                                            journeyDetailsUiState11 = journeyDetailsUiState9;
                                            priceDetailsUiState8 = priceDetailsUiState6;
                                            function11 = function10;
                                            confirmBookingScreenDataState17 = confirmBookingScreenDataState15;
                                            obj15 = objB12;
                                            tnCDialogUIState6 = tnCDialogUIState4;
                                            chaloTextStyleHelper15 = chaloTextStyleHelper14;
                                            chaloTextUIStateB = ChaloTextStyleHelper.b(chaloTextStyleHelper15, (String) obj15, ChaloColorToken.White.f9870a, 0, null, null, null, null, 124);
                                            confirmBookingUIStateFactory$create$1.L$0 = confirmBookingScreenDataState17;
                                            confirmBookingUIStateFactory$create$1.L$1 = function11;
                                            confirmBookingUIStateFactory$create$1.L$2 = loadingDialogUIState11;
                                            confirmBookingUIStateFactory$create$1.L$3 = toolbarUIState8;
                                            confirmBookingUIStateFactory$create$1.L$4 = journeyDetailsUiState11;
                                            confirmBookingUIStateFactory$create$1.L$5 = priceDetailsUiState8;
                                            confirmBookingUIStateFactory$create$1.L$6 = termsAndConditionsUiState2;
                                            confirmBookingUIStateFactory$create$1.L$7 = tnCDialogUIState6;
                                            confirmBookingUIStateFactory$create$1.L$8 = buttonUIStateG;
                                            confirmBookingUIStateFactory$create$1.L$9 = chaloTextUIStateB;
                                            confirmBookingUIStateFactory$create$1.L$10 = chaloTextStyleHelper14;
                                            confirmBookingScreenDataState18 = confirmBookingScreenDataState17;
                                            confirmBookingUIStateFactory$create$1.label = 14;
                                            objB13 = stringProvider3.b(StringEnum.RETRY, new Object[0], confirmBookingUIStateFactory$create$1);
                                            if (objB13 == obj14) {
                                                return obj14;
                                            }
                                            toolbarUIState10 = toolbarUIState8;
                                            termsAndConditionsUiState4 = termsAndConditionsUiState2;
                                            confirmBookingScreenDataState19 = confirmBookingScreenDataState18;
                                            function12 = function11;
                                            chaloTextUIState3 = chaloTextUIStateB;
                                            obj16 = objB13;
                                            priceDetailsUiState9 = priceDetailsUiState8;
                                            chaloTextStyleHelper16 = chaloTextStyleHelper14;
                                            loadingDialogUIState13 = loadingDialogUIState11;
                                            journeyDetailsUiState12 = journeyDetailsUiState11;
                                            ChaloColorToken.OrangePrimary orangePrimary7 = orangePrimary;
                                            priceDetailsUiState7 = priceDetailsUiState9;
                                            tnCDialogUIState5 = tnCDialogUIState6;
                                            termsAndConditionsUiState3 = termsAndConditionsUiState4;
                                            snackbarUIState = new SnackbarUIState(chaloTextUIState3, ChaloTextStyleHelper.b(chaloTextStyleHelper16, (String) obj16, orangePrimary7, 0, null, UIFontWeight.SemiBold, null, null, 108), UiEventHandler.Companion.a(new bp(function12, 16)));
                                            journeyDetailsUiState10 = journeyDetailsUiState12;
                                            toolbarUIState9 = toolbarUIState10;
                                            loadingDialogUIState12 = loadingDialogUIState13;
                                            confirmBookingScreenDataState16 = confirmBookingScreenDataState19;
                                        } else {
                                            confirmBookingScreenDataState16 = confirmBookingScreenDataState15;
                                            journeyDetailsUiState10 = journeyDetailsUiState9;
                                            tnCDialogUIState5 = tnCDialogUIState4;
                                            loadingDialogUIState12 = loadingDialogUIState11;
                                            toolbarUIState9 = toolbarUIState8;
                                            termsAndConditionsUiState3 = termsAndConditionsUiState2;
                                            priceDetailsUiState7 = priceDetailsUiState6;
                                            snackbarUIState = null;
                                        }
                                        ButtonUIState buttonUIState6 = buttonUIStateG;
                                        boolean z7 = confirmBookingScreenDataState16.k;
                                        if (confirmBookingScreenDataState16.c) {
                                            loadingDialogUIState14 = loadingDialogUIState12;
                                        } else {
                                            loadingDialogUIState14 = null;
                                        }
                                        return new ConfirmBookingScreenViewState(toolbarUIState9, journeyDetailsUiState10, priceDetailsUiState7, termsAndConditionsUiState3, tnCDialogUIState5, buttonUIState6, snackbarUIState, z7, loadingDialogUIState14);
                                    }
                                    return obj11;
                                }
                                obj9 = obj7;
                                chaloTextStyleHelper11 = chaloTextStyleHelper17;
                                tnCDialogUIState = null;
                                termsAndConditionsUiState = null;
                                journeyDetailsUiState4 = journeyDetailsUiState3;
                                str9 = str8;
                                toolbarUIState4 = toolbarUIState3;
                                priceDetailsUiState2 = priceDetailsUiState;
                                loadingDialogUIState6 = loadingDialogUIState5;
                                confirmBookingScreenDataState11 = confirmBookingScreenDataState10;
                                z = confirmBookingScreenDataState11.m;
                                List list114 = confirmBookingScreenDataState11.j;
                                if (z) {
                                    break;
                                }
                                obj11 = obj9;
                                JourneyDetailsUiState journeyDetailsUiState19 = journeyDetailsUiState4;
                                priceDetailsUiState5 = priceDetailsUiState2;
                                loadingDialogUIState9 = loadingDialogUIState6;
                                toolbarUIState7 = toolbarUIState4;
                                journeyDetailsUiState8 = journeyDetailsUiState19;
                                Function1 function112 = function7;
                                confirmBookingScreenDataState13 = confirmBookingScreenDataState11;
                                function9 = function112;
                                tnCDialogUIState2 = tnCDialogUIState;
                                StringEnum stringEnum7 = StringEnum.FARE_DETAILS_PAY;
                                Object[] objArr7 = {str9};
                                confirmBookingUIStateFactory$create$1.L$0 = confirmBookingScreenDataState13;
                                confirmBookingUIStateFactory$create$1.L$1 = function9;
                                confirmBookingUIStateFactory$create$1.L$2 = loadingDialogUIState9;
                                confirmBookingUIStateFactory$create$1.L$3 = toolbarUIState7;
                                confirmBookingUIStateFactory$create$1.L$4 = journeyDetailsUiState8;
                                confirmBookingUIStateFactory$create$1.L$5 = priceDetailsUiState5;
                                confirmBookingUIStateFactory$create$1.L$6 = termsAndConditionsUiState;
                                confirmBookingUIStateFactory$create$1.L$7 = tnCDialogUIState2;
                                buttonUIStateFactory = ButtonUIStateFactory.f9921a;
                                confirmBookingUIStateFactory$create$1.L$8 = buttonUIStateFactory;
                                confirmBookingUIStateFactory$create$1.L$9 = tnCDialogUIState;
                                confirmBookingUIStateFactory$create$1.L$10 = tnCDialogUIState;
                                confirmBookingUIStateFactory$create$1.label = 12;
                                objB11 = stringProvider.b(stringEnum7, objArr7, confirmBookingUIStateFactory$create$1);
                                if (objB11 != obj11) {
                                    priceDetailsUiState6 = priceDetailsUiState5;
                                    termsAndConditionsUiState2 = termsAndConditionsUiState;
                                    confirmBookingScreenDataState14 = confirmBookingScreenDataState13;
                                    loadingDialogUIState10 = loadingDialogUIState9;
                                    buttonUIStateFactory2 = buttonUIStateFactory;
                                    tnCDialogUIState3 = tnCDialogUIState2;
                                    function10 = function9;
                                    confirmBookingScreenDataState15 = confirmBookingScreenDataState14;
                                    journeyDetailsUiState9 = journeyDetailsUiState8;
                                    tnCDialogUIState4 = tnCDialogUIState3;
                                    loadingDialogUIState11 = loadingDialogUIState10;
                                    stringProvider2 = stringProvider;
                                    obj13 = obj11;
                                    toolbarUIState8 = toolbarUIState7;
                                    buttonUIStateG = ButtonUIStateFactory.g(buttonUIStateFactory2, (String) objB11, new bp(function10, 15), null, UIShape.d, true, 0.0f, 36);
                                    if (confirmBookingScreenDataState15.l) {
                                        confirmBookingUIStateFactory$create$1.L$0 = confirmBookingScreenDataState15;
                                        confirmBookingUIStateFactory$create$1.L$1 = function10;
                                        confirmBookingUIStateFactory$create$1.L$2 = loadingDialogUIState11;
                                        confirmBookingUIStateFactory$create$1.L$3 = toolbarUIState8;
                                        confirmBookingUIStateFactory$create$1.L$4 = journeyDetailsUiState9;
                                        confirmBookingUIStateFactory$create$1.L$5 = priceDetailsUiState6;
                                        confirmBookingUIStateFactory$create$1.L$6 = termsAndConditionsUiState2;
                                        confirmBookingUIStateFactory$create$1.L$7 = tnCDialogUIState4;
                                        confirmBookingUIStateFactory$create$1.L$8 = buttonUIStateG;
                                        chaloTextStyleHelper14 = chaloTextStyleHelper11;
                                        confirmBookingUIStateFactory$create$1.L$9 = chaloTextStyleHelper14;
                                        confirmBookingUIStateFactory$create$1.label = 13;
                                        stringProvider3 = stringProvider2;
                                        objB12 = stringProvider3.b(StringEnum.SOMETHING_WENT_WRONG, new Object[0], confirmBookingUIStateFactory$create$1);
                                        obj14 = obj13;
                                        if (objB12 == obj14) {
                                            return obj14;
                                        }
                                        journeyDetailsUiState11 = journeyDetailsUiState9;
                                        priceDetailsUiState8 = priceDetailsUiState6;
                                        function11 = function10;
                                        confirmBookingScreenDataState17 = confirmBookingScreenDataState15;
                                        obj15 = objB12;
                                        tnCDialogUIState6 = tnCDialogUIState4;
                                        chaloTextStyleHelper15 = chaloTextStyleHelper14;
                                        chaloTextUIStateB = ChaloTextStyleHelper.b(chaloTextStyleHelper15, (String) obj15, ChaloColorToken.White.f9870a, 0, null, null, null, null, 124);
                                        confirmBookingUIStateFactory$create$1.L$0 = confirmBookingScreenDataState17;
                                        confirmBookingUIStateFactory$create$1.L$1 = function11;
                                        confirmBookingUIStateFactory$create$1.L$2 = loadingDialogUIState11;
                                        confirmBookingUIStateFactory$create$1.L$3 = toolbarUIState8;
                                        confirmBookingUIStateFactory$create$1.L$4 = journeyDetailsUiState11;
                                        confirmBookingUIStateFactory$create$1.L$5 = priceDetailsUiState8;
                                        confirmBookingUIStateFactory$create$1.L$6 = termsAndConditionsUiState2;
                                        confirmBookingUIStateFactory$create$1.L$7 = tnCDialogUIState6;
                                        confirmBookingUIStateFactory$create$1.L$8 = buttonUIStateG;
                                        confirmBookingUIStateFactory$create$1.L$9 = chaloTextUIStateB;
                                        confirmBookingUIStateFactory$create$1.L$10 = chaloTextStyleHelper14;
                                        confirmBookingScreenDataState18 = confirmBookingScreenDataState17;
                                        confirmBookingUIStateFactory$create$1.label = 14;
                                        objB13 = stringProvider3.b(StringEnum.RETRY, new Object[0], confirmBookingUIStateFactory$create$1);
                                        if (objB13 == obj14) {
                                            return obj14;
                                        }
                                        toolbarUIState10 = toolbarUIState8;
                                        termsAndConditionsUiState4 = termsAndConditionsUiState2;
                                        confirmBookingScreenDataState19 = confirmBookingScreenDataState18;
                                        function12 = function11;
                                        chaloTextUIState3 = chaloTextUIStateB;
                                        obj16 = objB13;
                                        priceDetailsUiState9 = priceDetailsUiState8;
                                        chaloTextStyleHelper16 = chaloTextStyleHelper14;
                                        loadingDialogUIState13 = loadingDialogUIState11;
                                        journeyDetailsUiState12 = journeyDetailsUiState11;
                                        ChaloColorToken.OrangePrimary orangePrimary8 = orangePrimary;
                                        priceDetailsUiState7 = priceDetailsUiState9;
                                        tnCDialogUIState5 = tnCDialogUIState6;
                                        termsAndConditionsUiState3 = termsAndConditionsUiState4;
                                        snackbarUIState = new SnackbarUIState(chaloTextUIState3, ChaloTextStyleHelper.b(chaloTextStyleHelper16, (String) obj16, orangePrimary8, 0, null, UIFontWeight.SemiBold, null, null, 108), UiEventHandler.Companion.a(new bp(function12, 16)));
                                        journeyDetailsUiState10 = journeyDetailsUiState12;
                                        toolbarUIState9 = toolbarUIState10;
                                        loadingDialogUIState12 = loadingDialogUIState13;
                                        confirmBookingScreenDataState16 = confirmBookingScreenDataState19;
                                    } else {
                                        confirmBookingScreenDataState16 = confirmBookingScreenDataState15;
                                        journeyDetailsUiState10 = journeyDetailsUiState9;
                                        tnCDialogUIState5 = tnCDialogUIState4;
                                        loadingDialogUIState12 = loadingDialogUIState11;
                                        toolbarUIState9 = toolbarUIState8;
                                        termsAndConditionsUiState3 = termsAndConditionsUiState2;
                                        priceDetailsUiState7 = priceDetailsUiState6;
                                        snackbarUIState = null;
                                    }
                                    ButtonUIState buttonUIState7 = buttonUIStateG;
                                    boolean z8 = confirmBookingScreenDataState16.k;
                                    if (confirmBookingScreenDataState16.c) {
                                        loadingDialogUIState14 = loadingDialogUIState12;
                                    } else {
                                        loadingDialogUIState14 = null;
                                    }
                                    return new ConfirmBookingScreenViewState(toolbarUIState9, journeyDetailsUiState10, priceDetailsUiState7, termsAndConditionsUiState3, tnCDialogUIState5, buttonUIState7, snackbarUIState, z8, loadingDialogUIState14);
                                }
                                return obj11;
                            }
                            obj4 = obj17;
                            str4 = strA;
                            if (strA2 != null) {
                                productBannerSpec = new ProductBannerSpec();
                                confirmBookingUIStateFactory$create$1.L$0 = confirmBookingScreenDataState7;
                                confirmBookingUIStateFactory$create$1.L$1 = function5;
                                confirmBookingUIStateFactory$create$1.L$2 = loadingDialogUIState3;
                                confirmBookingUIStateFactory$create$1.L$3 = toolbarUIState3;
                                confirmBookingUIStateFactory$create$1.L$4 = journeyDetailsUiState;
                                confirmBookingUIStateFactory$create$1.L$5 = str4;
                                confirmBookingUIStateFactory$create$1.L$6 = chaloTextStyleHelper7;
                                confirmBookingUIStateFactory$create$1.L$7 = productBannerSpec;
                                confirmBookingUIStateFactory$create$1.label = 5;
                                objB5 = stringProvider.b(StringEnum.DISCOUNT_TEXT_COPY, new Object[]{strA2}, confirmBookingUIStateFactory$create$1);
                                obj5 = obj4;
                                if (objB5 == obj5) {
                                    return obj5;
                                }
                                function6 = function5;
                                confirmBookingScreenDataState8 = confirmBookingScreenDataState7;
                                obj6 = objB5;
                                loadingDialogUIState4 = loadingDialogUIState3;
                                journeyDetailsUiState2 = journeyDetailsUiState;
                                chaloTextStyleHelper8 = chaloTextStyleHelper7;
                                productBannerUIState = new ProductBannerUIState(productBannerSpec, ChaloTextStyleHelper.c(chaloTextStyleHelper8, (String) obj6, null, null, UIFontWeight.SemiBold, null, null, FacebookMediationAdapter.ERROR_FAILED_TO_PRESENT_AD), new ImageUIState(IconType.DISCOUNT_GREEN, (String) null, (ChaloColorToken) null, (ImageUISize) null, (UIContentScale) null, 0.0f, (UiEventHandler) null, 254));
                                confirmBookingScreenDataState7 = confirmBookingScreenDataState8;
                            } else {
                                obj5 = obj4;
                                loadingDialogUIState4 = loadingDialogUIState3;
                                function6 = function5;
                                journeyDetailsUiState2 = journeyDetailsUiState;
                                productBannerUIState = null;
                            }
                            list7 = confirmBookingScreenDataState7.i;
                            if (list7 != null) {
                                List list115 = list7;
                                arrayList4 = new ArrayList(CollectionsKt.v(list115, 10));
                                it2 = list115.iterator();
                                while (it2.hasNext()) {
                                    FareBreakupAppModel fareBreakupAppModel4 = (FareBreakupAppModel) it2.next();
                                    FareBreakupOperationUIProperties fareBreakupOperationUIPropertiesA4 = FareBreakupOperationUIPropertiesKt.a(fareBreakupAppModel4.b, (3 & 1) != 0 ? ChaloColorToken.Black.f9759a : ChaloColorToken.AlmostBlackColor.f9756a, (3 & 2) != 0);
                                    ChaloTextStyleHelper chaloTextStyleHelper26 = chaloTextStyleHelper7;
                                    arrayList4.add(new FareLineUiState(ChaloTextStyleHelper.c(chaloTextStyleHelper26, fareBreakupAppModel4.f3890a, null, null, null, null, null, WebSocketProtocol.PAYLOAD_SHORT), ChaloTextStyleHelper.c(chaloTextStyleHelper26, vo1.A(fareBreakupOperationUIPropertiesA4.f8267a, currencyFeature.a(fareBreakupAppModel4.c, CurrencyRoundOffLogic.ROUND_OFF_LOGIC_NO_ROUNDING)), fareBreakupOperationUIPropertiesA4.b, null, UIFontWeight.Bold, null, null, 108)));
                                    it2 = it2;
                                    chaloTextStyleHelper7 = chaloTextStyleHelper26;
                                    obj5 = obj5;
                                }
                            } else {
                                arrayList4 = null;
                            }
                            chaloTextStyleHelper17 = chaloTextStyleHelper7;
                            Object obj112 = obj5;
                            confirmBookingUIStateFactory$create$1.L$0 = confirmBookingScreenDataState7;
                            confirmBookingUIStateFactory$create$1.L$1 = function6;
                            confirmBookingUIStateFactory$create$1.L$2 = loadingDialogUIState4;
                            confirmBookingUIStateFactory$create$1.L$3 = toolbarUIState3;
                            confirmBookingUIStateFactory$create$1.L$4 = journeyDetailsUiState2;
                            confirmBookingUIStateFactory$create$1.L$5 = str4;
                            confirmBookingUIStateFactory$create$1.L$6 = productBannerUIState;
                            confirmBookingUIStateFactory$create$1.L$7 = arrayList4;
                            confirmBookingUIStateFactory$create$1.L$8 = chaloTextStyleHelper17;
                            confirmBookingUIStateFactory$create$1.label = 6;
                            objB6 = stringProvider.b(StringEnum.TOTAL, new Object[0], confirmBookingUIStateFactory$create$1);
                            obj7 = obj112;
                            if (objB6 == obj7) {
                                return obj7;
                            }
                            list8 = arrayList4;
                            str6 = str4;
                            productBannerUIState2 = productBannerUIState;
                            chaloTextStyleHelper9 = chaloTextStyleHelper17;
                            confirmBookingScreenDataState9 = confirmBookingScreenDataState7;
                            obj8 = objB6;
                            str7 = str6;
                            fareLineUiState = new FareLineUiState(ChaloTextStyleHelper.c(chaloTextStyleHelper9, (String) obj8, null, null, null, null, null, WebSocketProtocol.PAYLOAD_SHORT), ChaloTextStyleHelper.c(chaloTextStyleHelper17, str6, null, null, UIFontWeight.Bold, null, null, FacebookMediationAdapter.ERROR_FAILED_TO_PRESENT_AD));
                            confirmBookingUIStateFactory$create$1.L$0 = confirmBookingScreenDataState9;
                            confirmBookingUIStateFactory$create$1.L$1 = function6;
                            confirmBookingUIStateFactory$create$1.L$2 = loadingDialogUIState4;
                            confirmBookingUIStateFactory$create$1.L$3 = toolbarUIState3;
                            confirmBookingUIStateFactory$create$1.L$4 = journeyDetailsUiState2;
                            confirmBookingUIStateFactory$create$1.L$5 = str7;
                            confirmBookingUIStateFactory$create$1.L$6 = productBannerUIState2;
                            confirmBookingUIStateFactory$create$1.L$7 = list8;
                            confirmBookingUIStateFactory$create$1.L$8 = fareLineUiState;
                            confirmBookingUIStateFactory$create$1.L$9 = chaloTextStyleHelper17;
                            confirmBookingUIStateFactory$create$1.label = 7;
                            objB7 = stringProvider.b(StringEnum.PRICE_DETAILS, new Object[0], confirmBookingUIStateFactory$create$1);
                            if (objB7 == obj7) {
                                return obj7;
                            }
                            fareLineUiState2 = fareLineUiState;
                            chaloTextStyleHelper10 = chaloTextStyleHelper17;
                            confirmBookingScreenDataState10 = confirmBookingScreenDataState9;
                            function7 = function6;
                            loadingDialogUIState5 = loadingDialogUIState4;
                            journeyDetailsUiState3 = journeyDetailsUiState2;
                            str8 = str7;
                            TextUIState.ChaloTextUIState chaloTextUIStateA5 = ChaloTextStyleHelper.a(chaloTextStyleHelper10, (String) objB7, null, UIFontWeight.Bold, null, FacebookMediationAdapter.ERROR_FAILED_TO_PRESENT_AD);
                            if (list8 == null) {
                                list8 = EmptyList.f17557a;
                            }
                            priceDetailsUiState = new PriceDetailsUiState(chaloTextUIStateA5, list8, fareLineUiState2, productBannerUIState2);
                            list9 = confirmBookingScreenDataState10.j;
                            if (list9 != null) {
                                if (list9.isEmpty()) {
                                    list9 = null;
                                }
                                if (list9 != null) {
                                    List listX3 = CollectionsKt.x0(list9, 3);
                                    arrayList5 = new ArrayList(CollectionsKt.v(listX3, 10));
                                    it3 = listX3.iterator();
                                    i2 = 0;
                                    while (it3.hasNext()) {
                                        next = it3.next();
                                        i3 = i2 + 1;
                                        if (i2 < 0) {
                                            CollectionsKt.z0();
                                            throw null;
                                        }
                                        arrayList5.add(ChaloTextStyleHelper.c(chaloTextStyleHelper17, i3 + ". " + ((String) next), null, null, null, null, null, WebSocketProtocol.PAYLOAD_SHORT));
                                        it3 = it3;
                                        i2 = i3;
                                    }
                                    chaloTextStyleHelper12 = chaloTextStyleHelper17;
                                    confirmBookingUIStateFactory$create$1.L$0 = confirmBookingScreenDataState10;
                                    confirmBookingUIStateFactory$create$1.L$1 = function7;
                                    confirmBookingUIStateFactory$create$1.L$2 = loadingDialogUIState5;
                                    confirmBookingUIStateFactory$create$1.L$3 = toolbarUIState3;
                                    confirmBookingUIStateFactory$create$1.L$4 = journeyDetailsUiState3;
                                    confirmBookingUIStateFactory$create$1.L$5 = str8;
                                    confirmBookingUIStateFactory$create$1.L$6 = priceDetailsUiState;
                                    confirmBookingUIStateFactory$create$1.L$7 = arrayList5;
                                    confirmBookingUIStateFactory$create$1.L$8 = chaloTextStyleHelper12;
                                    confirmBookingUIStateFactory$create$1.L$9 = null;
                                    confirmBookingUIStateFactory$create$1.label = 8;
                                    objB8 = stringProvider.b(StringEnum.TERMS_AND_CONDITIONS, new Object[0], confirmBookingUIStateFactory$create$1);
                                    if (objB8 == obj7) {
                                        return obj7;
                                    }
                                    chaloTextStyleHelper13 = chaloTextStyleHelper12;
                                    str10 = str8;
                                    journeyDetailsUiState5 = journeyDetailsUiState3;
                                    list10 = arrayList5;
                                    chaloTextUIStateA = ChaloTextStyleHelper.a(chaloTextStyleHelper13, (String) objB8, null, UIFontWeight.Bold, null, FacebookMediationAdapter.ERROR_FAILED_TO_PRESENT_AD);
                                    styledTextDataUIStateArr = new StyledTextDataUIState[2];
                                    chaloTextStyleHelper11 = chaloTextStyleHelper12;
                                    confirmBookingUIStateFactory$create$1.L$0 = confirmBookingScreenDataState10;
                                    confirmBookingUIStateFactory$create$1.L$1 = function7;
                                    confirmBookingUIStateFactory$create$1.L$2 = loadingDialogUIState5;
                                    confirmBookingUIStateFactory$create$1.L$3 = toolbarUIState3;
                                    confirmBookingUIStateFactory$create$1.L$4 = journeyDetailsUiState5;
                                    confirmBookingUIStateFactory$create$1.L$5 = str10;
                                    confirmBookingUIStateFactory$create$1.L$6 = priceDetailsUiState;
                                    confirmBookingUIStateFactory$create$1.L$7 = styledTextDataUIStateArr;
                                    confirmBookingUIStateFactory$create$1.L$8 = chaloTextUIStateA;
                                    confirmBookingUIStateFactory$create$1.L$9 = list10;
                                    confirmBookingUIStateFactory$create$1.L$10 = styledTextDataUIStateArr;
                                    confirmBookingUIStateFactory$create$1.I$0 = 0;
                                    confirmBookingUIStateFactory$create$1.label = 9;
                                    objB9 = stringProvider.b(StringEnum.ALL_TNC_PREFIX, new Object[0], confirmBookingUIStateFactory$create$1);
                                    if (objB9 == obj7) {
                                        return obj7;
                                    }
                                    styledTextDataUIStateArr2 = styledTextDataUIStateArr;
                                    toolbarUIState5 = toolbarUIState3;
                                    priceDetailsUiState3 = priceDetailsUiState;
                                    loadingDialogUIState7 = loadingDialogUIState5;
                                    i4 = 0;
                                    journeyDetailsUiState6 = journeyDetailsUiState5;
                                    str11 = str10;
                                    chaloTextUIState = chaloTextUIStateA;
                                    obj10 = objB9;
                                    list11 = list10;
                                    styledTextDataUIStateArr2[i4] = new StyledTextDataUIState(obj10 + " ", null, null, UITextStyle.BodySmall, null, null, null, 1014);
                                    confirmBookingUIStateFactory$create$1.L$0 = confirmBookingScreenDataState10;
                                    confirmBookingUIStateFactory$create$1.L$1 = function7;
                                    confirmBookingUIStateFactory$create$1.L$2 = loadingDialogUIState7;
                                    confirmBookingUIStateFactory$create$1.L$3 = toolbarUIState5;
                                    confirmBookingUIStateFactory$create$1.L$4 = journeyDetailsUiState6;
                                    confirmBookingUIStateFactory$create$1.L$5 = str11;
                                    confirmBookingUIStateFactory$create$1.L$6 = priceDetailsUiState3;
                                    confirmBookingUIStateFactory$create$1.L$7 = styledTextDataUIStateArr;
                                    confirmBookingUIStateFactory$create$1.L$8 = chaloTextUIState;
                                    confirmBookingUIStateFactory$create$1.L$9 = list11;
                                    confirmBookingUIStateFactory$create$1.L$10 = styledTextDataUIStateArr;
                                    confirmBookingUIStateFactory$create$1.I$0 = 1;
                                    confirmBookingUIStateFactory$create$1.label = 10;
                                    objB10 = stringProvider.b(StringEnum.TNC_CLICKABLE_TEXT, new Object[0], confirmBookingUIStateFactory$create$1);
                                    if (objB10 == obj7) {
                                        return obj7;
                                    }
                                    styledTextDataUIStateArr3 = styledTextDataUIStateArr;
                                    str12 = str11;
                                    loadingDialogUIState8 = loadingDialogUIState7;
                                    confirmBookingScreenDataState12 = confirmBookingScreenDataState10;
                                    toolbarUIState6 = toolbarUIState5;
                                    i5 = 1;
                                    chaloTextUIState2 = chaloTextUIState;
                                    function8 = function7;
                                    list12 = list11;
                                    styledTextDataUIStateArr4 = styledTextDataUIStateArr3;
                                    priceDetailsUiState4 = priceDetailsUiState3;
                                    journeyDetailsUiState7 = journeyDetailsUiState6;
                                    String str111 = (String) objB10;
                                    obj9 = obj7;
                                    tnCDialogUIState = null;
                                    styledTextDataUIStateArr4[i5] = new StyledTextDataUIState(str111, orangePrimary, UIFontWeight.Bold, UITextStyle.BodySmall, null, null, new StyledTextClickHandler() { // from class: app.chalo.metro.ui.confirmbooking.uistate.ConfirmBookingUIStateFactory$create$termsAndConditionsUiState$2$1
                                        @Override // app.chalo.uistate.text.StyledTextClickHandler
                                        public final void a() {
                                            function8.invoke(ConfirmBookingScreenViewIntent.OnTermsAndConditionsClicked.f5468a);
                                        }

                                        @Override // app.chalo.uistate.text.StyledTextClickHandler
                                        /* JADX INFO: renamed from: b */
                                        public final String getB() {
                                            return "TNC_CLICKABLE_TEXT";
                                        }

                                        @Override // app.chalo.uistate.text.StyledTextClickHandler
                                        /* JADX INFO: renamed from: getTag */
                                        public final String getF10085a() {
                                            return "TNC_CLICKABLE_TEXT";
                                        }
                                    }, 496);
                                    termsAndConditionsUiState = new TermsAndConditionsUiState(chaloTextUIState2, list12, new TextUIState.StyledTextUIState(CollectionsKt.S(styledTextDataUIStateArr3), null, null, 30));
                                    function7 = function8;
                                    confirmBookingScreenDataState11 = confirmBookingScreenDataState12;
                                    priceDetailsUiState2 = priceDetailsUiState4;
                                    str9 = str12;
                                    journeyDetailsUiState4 = journeyDetailsUiState7;
                                    loadingDialogUIState6 = loadingDialogUIState8;
                                    toolbarUIState4 = toolbarUIState6;
                                }
                                z = confirmBookingScreenDataState11.m;
                                List list116 = confirmBookingScreenDataState11.j;
                                if (z) {
                                    break;
                                }
                                obj11 = obj9;
                                JourneyDetailsUiState journeyDetailsUiState110 = journeyDetailsUiState4;
                                priceDetailsUiState5 = priceDetailsUiState2;
                                loadingDialogUIState9 = loadingDialogUIState6;
                                toolbarUIState7 = toolbarUIState4;
                                journeyDetailsUiState8 = journeyDetailsUiState110;
                                Function1 function113 = function7;
                                confirmBookingScreenDataState13 = confirmBookingScreenDataState11;
                                function9 = function113;
                                tnCDialogUIState2 = tnCDialogUIState;
                                StringEnum stringEnum8 = StringEnum.FARE_DETAILS_PAY;
                                Object[] objArr8 = {str9};
                                confirmBookingUIStateFactory$create$1.L$0 = confirmBookingScreenDataState13;
                                confirmBookingUIStateFactory$create$1.L$1 = function9;
                                confirmBookingUIStateFactory$create$1.L$2 = loadingDialogUIState9;
                                confirmBookingUIStateFactory$create$1.L$3 = toolbarUIState7;
                                confirmBookingUIStateFactory$create$1.L$4 = journeyDetailsUiState8;
                                confirmBookingUIStateFactory$create$1.L$5 = priceDetailsUiState5;
                                confirmBookingUIStateFactory$create$1.L$6 = termsAndConditionsUiState;
                                confirmBookingUIStateFactory$create$1.L$7 = tnCDialogUIState2;
                                buttonUIStateFactory = ButtonUIStateFactory.f9921a;
                                confirmBookingUIStateFactory$create$1.L$8 = buttonUIStateFactory;
                                confirmBookingUIStateFactory$create$1.L$9 = tnCDialogUIState;
                                confirmBookingUIStateFactory$create$1.L$10 = tnCDialogUIState;
                                confirmBookingUIStateFactory$create$1.label = 12;
                                objB11 = stringProvider.b(stringEnum8, objArr8, confirmBookingUIStateFactory$create$1);
                                if (objB11 != obj11) {
                                    priceDetailsUiState6 = priceDetailsUiState5;
                                    termsAndConditionsUiState2 = termsAndConditionsUiState;
                                    confirmBookingScreenDataState14 = confirmBookingScreenDataState13;
                                    loadingDialogUIState10 = loadingDialogUIState9;
                                    buttonUIStateFactory2 = buttonUIStateFactory;
                                    tnCDialogUIState3 = tnCDialogUIState2;
                                    function10 = function9;
                                    confirmBookingScreenDataState15 = confirmBookingScreenDataState14;
                                    journeyDetailsUiState9 = journeyDetailsUiState8;
                                    tnCDialogUIState4 = tnCDialogUIState3;
                                    loadingDialogUIState11 = loadingDialogUIState10;
                                    stringProvider2 = stringProvider;
                                    obj13 = obj11;
                                    toolbarUIState8 = toolbarUIState7;
                                    buttonUIStateG = ButtonUIStateFactory.g(buttonUIStateFactory2, (String) objB11, new bp(function10, 15), null, UIShape.d, true, 0.0f, 36);
                                    if (confirmBookingScreenDataState15.l) {
                                        confirmBookingUIStateFactory$create$1.L$0 = confirmBookingScreenDataState15;
                                        confirmBookingUIStateFactory$create$1.L$1 = function10;
                                        confirmBookingUIStateFactory$create$1.L$2 = loadingDialogUIState11;
                                        confirmBookingUIStateFactory$create$1.L$3 = toolbarUIState8;
                                        confirmBookingUIStateFactory$create$1.L$4 = journeyDetailsUiState9;
                                        confirmBookingUIStateFactory$create$1.L$5 = priceDetailsUiState6;
                                        confirmBookingUIStateFactory$create$1.L$6 = termsAndConditionsUiState2;
                                        confirmBookingUIStateFactory$create$1.L$7 = tnCDialogUIState4;
                                        confirmBookingUIStateFactory$create$1.L$8 = buttonUIStateG;
                                        chaloTextStyleHelper14 = chaloTextStyleHelper11;
                                        confirmBookingUIStateFactory$create$1.L$9 = chaloTextStyleHelper14;
                                        confirmBookingUIStateFactory$create$1.label = 13;
                                        stringProvider3 = stringProvider2;
                                        objB12 = stringProvider3.b(StringEnum.SOMETHING_WENT_WRONG, new Object[0], confirmBookingUIStateFactory$create$1);
                                        obj14 = obj13;
                                        if (objB12 == obj14) {
                                            return obj14;
                                        }
                                        journeyDetailsUiState11 = journeyDetailsUiState9;
                                        priceDetailsUiState8 = priceDetailsUiState6;
                                        function11 = function10;
                                        confirmBookingScreenDataState17 = confirmBookingScreenDataState15;
                                        obj15 = objB12;
                                        tnCDialogUIState6 = tnCDialogUIState4;
                                        chaloTextStyleHelper15 = chaloTextStyleHelper14;
                                        chaloTextUIStateB = ChaloTextStyleHelper.b(chaloTextStyleHelper15, (String) obj15, ChaloColorToken.White.f9870a, 0, null, null, null, null, 124);
                                        confirmBookingUIStateFactory$create$1.L$0 = confirmBookingScreenDataState17;
                                        confirmBookingUIStateFactory$create$1.L$1 = function11;
                                        confirmBookingUIStateFactory$create$1.L$2 = loadingDialogUIState11;
                                        confirmBookingUIStateFactory$create$1.L$3 = toolbarUIState8;
                                        confirmBookingUIStateFactory$create$1.L$4 = journeyDetailsUiState11;
                                        confirmBookingUIStateFactory$create$1.L$5 = priceDetailsUiState8;
                                        confirmBookingUIStateFactory$create$1.L$6 = termsAndConditionsUiState2;
                                        confirmBookingUIStateFactory$create$1.L$7 = tnCDialogUIState6;
                                        confirmBookingUIStateFactory$create$1.L$8 = buttonUIStateG;
                                        confirmBookingUIStateFactory$create$1.L$9 = chaloTextUIStateB;
                                        confirmBookingUIStateFactory$create$1.L$10 = chaloTextStyleHelper14;
                                        confirmBookingScreenDataState18 = confirmBookingScreenDataState17;
                                        confirmBookingUIStateFactory$create$1.label = 14;
                                        objB13 = stringProvider3.b(StringEnum.RETRY, new Object[0], confirmBookingUIStateFactory$create$1);
                                        if (objB13 == obj14) {
                                            return obj14;
                                        }
                                        toolbarUIState10 = toolbarUIState8;
                                        termsAndConditionsUiState4 = termsAndConditionsUiState2;
                                        confirmBookingScreenDataState19 = confirmBookingScreenDataState18;
                                        function12 = function11;
                                        chaloTextUIState3 = chaloTextUIStateB;
                                        obj16 = objB13;
                                        priceDetailsUiState9 = priceDetailsUiState8;
                                        chaloTextStyleHelper16 = chaloTextStyleHelper14;
                                        loadingDialogUIState13 = loadingDialogUIState11;
                                        journeyDetailsUiState12 = journeyDetailsUiState11;
                                        ChaloColorToken.OrangePrimary orangePrimary9 = orangePrimary;
                                        priceDetailsUiState7 = priceDetailsUiState9;
                                        tnCDialogUIState5 = tnCDialogUIState6;
                                        termsAndConditionsUiState3 = termsAndConditionsUiState4;
                                        snackbarUIState = new SnackbarUIState(chaloTextUIState3, ChaloTextStyleHelper.b(chaloTextStyleHelper16, (String) obj16, orangePrimary9, 0, null, UIFontWeight.SemiBold, null, null, 108), UiEventHandler.Companion.a(new bp(function12, 16)));
                                        journeyDetailsUiState10 = journeyDetailsUiState12;
                                        toolbarUIState9 = toolbarUIState10;
                                        loadingDialogUIState12 = loadingDialogUIState13;
                                        confirmBookingScreenDataState16 = confirmBookingScreenDataState19;
                                    } else {
                                        confirmBookingScreenDataState16 = confirmBookingScreenDataState15;
                                        journeyDetailsUiState10 = journeyDetailsUiState9;
                                        tnCDialogUIState5 = tnCDialogUIState4;
                                        loadingDialogUIState12 = loadingDialogUIState11;
                                        toolbarUIState9 = toolbarUIState8;
                                        termsAndConditionsUiState3 = termsAndConditionsUiState2;
                                        priceDetailsUiState7 = priceDetailsUiState6;
                                        snackbarUIState = null;
                                    }
                                    ButtonUIState buttonUIState8 = buttonUIStateG;
                                    boolean z9 = confirmBookingScreenDataState16.k;
                                    if (confirmBookingScreenDataState16.c) {
                                        loadingDialogUIState14 = loadingDialogUIState12;
                                    } else {
                                        loadingDialogUIState14 = null;
                                    }
                                    return new ConfirmBookingScreenViewState(toolbarUIState9, journeyDetailsUiState10, priceDetailsUiState7, termsAndConditionsUiState3, tnCDialogUIState5, buttonUIState8, snackbarUIState, z9, loadingDialogUIState14);
                                }
                                return obj11;
                            }
                            obj9 = obj7;
                            chaloTextStyleHelper11 = chaloTextStyleHelper17;
                            tnCDialogUIState = null;
                            termsAndConditionsUiState = null;
                            journeyDetailsUiState4 = journeyDetailsUiState3;
                            str9 = str8;
                            toolbarUIState4 = toolbarUIState3;
                            priceDetailsUiState2 = priceDetailsUiState;
                            loadingDialogUIState6 = loadingDialogUIState5;
                            confirmBookingScreenDataState11 = confirmBookingScreenDataState10;
                            z = confirmBookingScreenDataState11.m;
                            List list117 = confirmBookingScreenDataState11.j;
                            if (z) {
                                break;
                            }
                            obj11 = obj9;
                            JourneyDetailsUiState journeyDetailsUiState111 = journeyDetailsUiState4;
                            priceDetailsUiState5 = priceDetailsUiState2;
                            loadingDialogUIState9 = loadingDialogUIState6;
                            toolbarUIState7 = toolbarUIState4;
                            journeyDetailsUiState8 = journeyDetailsUiState111;
                            Function1 function114 = function7;
                            confirmBookingScreenDataState13 = confirmBookingScreenDataState11;
                            function9 = function114;
                            tnCDialogUIState2 = tnCDialogUIState;
                            StringEnum stringEnum9 = StringEnum.FARE_DETAILS_PAY;
                            Object[] objArr9 = {str9};
                            confirmBookingUIStateFactory$create$1.L$0 = confirmBookingScreenDataState13;
                            confirmBookingUIStateFactory$create$1.L$1 = function9;
                            confirmBookingUIStateFactory$create$1.L$2 = loadingDialogUIState9;
                            confirmBookingUIStateFactory$create$1.L$3 = toolbarUIState7;
                            confirmBookingUIStateFactory$create$1.L$4 = journeyDetailsUiState8;
                            confirmBookingUIStateFactory$create$1.L$5 = priceDetailsUiState5;
                            confirmBookingUIStateFactory$create$1.L$6 = termsAndConditionsUiState;
                            confirmBookingUIStateFactory$create$1.L$7 = tnCDialogUIState2;
                            buttonUIStateFactory = ButtonUIStateFactory.f9921a;
                            confirmBookingUIStateFactory$create$1.L$8 = buttonUIStateFactory;
                            confirmBookingUIStateFactory$create$1.L$9 = tnCDialogUIState;
                            confirmBookingUIStateFactory$create$1.L$10 = tnCDialogUIState;
                            confirmBookingUIStateFactory$create$1.label = 12;
                            objB11 = stringProvider.b(stringEnum9, objArr9, confirmBookingUIStateFactory$create$1);
                            if (objB11 != obj11) {
                                priceDetailsUiState6 = priceDetailsUiState5;
                                termsAndConditionsUiState2 = termsAndConditionsUiState;
                                confirmBookingScreenDataState14 = confirmBookingScreenDataState13;
                                loadingDialogUIState10 = loadingDialogUIState9;
                                buttonUIStateFactory2 = buttonUIStateFactory;
                                tnCDialogUIState3 = tnCDialogUIState2;
                                function10 = function9;
                                confirmBookingScreenDataState15 = confirmBookingScreenDataState14;
                                journeyDetailsUiState9 = journeyDetailsUiState8;
                                tnCDialogUIState4 = tnCDialogUIState3;
                                loadingDialogUIState11 = loadingDialogUIState10;
                                stringProvider2 = stringProvider;
                                obj13 = obj11;
                                toolbarUIState8 = toolbarUIState7;
                                buttonUIStateG = ButtonUIStateFactory.g(buttonUIStateFactory2, (String) objB11, new bp(function10, 15), null, UIShape.d, true, 0.0f, 36);
                                if (confirmBookingScreenDataState15.l) {
                                    confirmBookingUIStateFactory$create$1.L$0 = confirmBookingScreenDataState15;
                                    confirmBookingUIStateFactory$create$1.L$1 = function10;
                                    confirmBookingUIStateFactory$create$1.L$2 = loadingDialogUIState11;
                                    confirmBookingUIStateFactory$create$1.L$3 = toolbarUIState8;
                                    confirmBookingUIStateFactory$create$1.L$4 = journeyDetailsUiState9;
                                    confirmBookingUIStateFactory$create$1.L$5 = priceDetailsUiState6;
                                    confirmBookingUIStateFactory$create$1.L$6 = termsAndConditionsUiState2;
                                    confirmBookingUIStateFactory$create$1.L$7 = tnCDialogUIState4;
                                    confirmBookingUIStateFactory$create$1.L$8 = buttonUIStateG;
                                    chaloTextStyleHelper14 = chaloTextStyleHelper11;
                                    confirmBookingUIStateFactory$create$1.L$9 = chaloTextStyleHelper14;
                                    confirmBookingUIStateFactory$create$1.label = 13;
                                    stringProvider3 = stringProvider2;
                                    objB12 = stringProvider3.b(StringEnum.SOMETHING_WENT_WRONG, new Object[0], confirmBookingUIStateFactory$create$1);
                                    obj14 = obj13;
                                    if (objB12 == obj14) {
                                        return obj14;
                                    }
                                    journeyDetailsUiState11 = journeyDetailsUiState9;
                                    priceDetailsUiState8 = priceDetailsUiState6;
                                    function11 = function10;
                                    confirmBookingScreenDataState17 = confirmBookingScreenDataState15;
                                    obj15 = objB12;
                                    tnCDialogUIState6 = tnCDialogUIState4;
                                    chaloTextStyleHelper15 = chaloTextStyleHelper14;
                                    chaloTextUIStateB = ChaloTextStyleHelper.b(chaloTextStyleHelper15, (String) obj15, ChaloColorToken.White.f9870a, 0, null, null, null, null, 124);
                                    confirmBookingUIStateFactory$create$1.L$0 = confirmBookingScreenDataState17;
                                    confirmBookingUIStateFactory$create$1.L$1 = function11;
                                    confirmBookingUIStateFactory$create$1.L$2 = loadingDialogUIState11;
                                    confirmBookingUIStateFactory$create$1.L$3 = toolbarUIState8;
                                    confirmBookingUIStateFactory$create$1.L$4 = journeyDetailsUiState11;
                                    confirmBookingUIStateFactory$create$1.L$5 = priceDetailsUiState8;
                                    confirmBookingUIStateFactory$create$1.L$6 = termsAndConditionsUiState2;
                                    confirmBookingUIStateFactory$create$1.L$7 = tnCDialogUIState6;
                                    confirmBookingUIStateFactory$create$1.L$8 = buttonUIStateG;
                                    confirmBookingUIStateFactory$create$1.L$9 = chaloTextUIStateB;
                                    confirmBookingUIStateFactory$create$1.L$10 = chaloTextStyleHelper14;
                                    confirmBookingScreenDataState18 = confirmBookingScreenDataState17;
                                    confirmBookingUIStateFactory$create$1.label = 14;
                                    objB13 = stringProvider3.b(StringEnum.RETRY, new Object[0], confirmBookingUIStateFactory$create$1);
                                    if (objB13 == obj14) {
                                        return obj14;
                                    }
                                    toolbarUIState10 = toolbarUIState8;
                                    termsAndConditionsUiState4 = termsAndConditionsUiState2;
                                    confirmBookingScreenDataState19 = confirmBookingScreenDataState18;
                                    function12 = function11;
                                    chaloTextUIState3 = chaloTextUIStateB;
                                    obj16 = objB13;
                                    priceDetailsUiState9 = priceDetailsUiState8;
                                    chaloTextStyleHelper16 = chaloTextStyleHelper14;
                                    loadingDialogUIState13 = loadingDialogUIState11;
                                    journeyDetailsUiState12 = journeyDetailsUiState11;
                                    ChaloColorToken.OrangePrimary orangePrimary10 = orangePrimary;
                                    priceDetailsUiState7 = priceDetailsUiState9;
                                    tnCDialogUIState5 = tnCDialogUIState6;
                                    termsAndConditionsUiState3 = termsAndConditionsUiState4;
                                    snackbarUIState = new SnackbarUIState(chaloTextUIState3, ChaloTextStyleHelper.b(chaloTextStyleHelper16, (String) obj16, orangePrimary10, 0, null, UIFontWeight.SemiBold, null, null, 108), UiEventHandler.Companion.a(new bp(function12, 16)));
                                    journeyDetailsUiState10 = journeyDetailsUiState12;
                                    toolbarUIState9 = toolbarUIState10;
                                    loadingDialogUIState12 = loadingDialogUIState13;
                                    confirmBookingScreenDataState16 = confirmBookingScreenDataState19;
                                } else {
                                    confirmBookingScreenDataState16 = confirmBookingScreenDataState15;
                                    journeyDetailsUiState10 = journeyDetailsUiState9;
                                    tnCDialogUIState5 = tnCDialogUIState4;
                                    loadingDialogUIState12 = loadingDialogUIState11;
                                    toolbarUIState9 = toolbarUIState8;
                                    termsAndConditionsUiState3 = termsAndConditionsUiState2;
                                    priceDetailsUiState7 = priceDetailsUiState6;
                                    snackbarUIState = null;
                                }
                                ButtonUIState buttonUIState9 = buttonUIStateG;
                                boolean z10 = confirmBookingScreenDataState16.k;
                                if (confirmBookingScreenDataState16.c) {
                                    loadingDialogUIState14 = loadingDialogUIState12;
                                } else {
                                    loadingDialogUIState14 = null;
                                }
                                return new ConfirmBookingScreenViewState(toolbarUIState9, journeyDetailsUiState10, priceDetailsUiState7, termsAndConditionsUiState3, tnCDialogUIState5, buttonUIState9, snackbarUIState, z10, loadingDialogUIState14);
                            }
                            return obj11;
                        }
                    }
                }
                return obj17;
            case 2:
                ChaloTextStyleHelper chaloTextStyleHelper27 = (ChaloTextStyleHelper) confirmBookingUIStateFactory$create$1.L$4;
                IconType iconType5 = (IconType) confirmBookingUIStateFactory$create$1.L$3;
                LoadingDialogUIState loadingDialogUIState15 = (LoadingDialogUIState) confirmBookingUIStateFactory$create$1.L$2;
                Function1 function20 = (Function1) confirmBookingUIStateFactory$create$1.L$1;
                ConfirmBookingScreenDataState confirmBookingScreenDataState21 = (ConfirmBookingScreenDataState) confirmBookingUIStateFactory$create$1.L$0;
                ResultKt.b(obj16);
                iconType2 = iconType5;
                function3 = function20;
                loadingDialogUIState2 = loadingDialogUIState15;
                confirmBookingScreenDataState3 = confirmBookingScreenDataState21;
                chaloTextStyleHelper2 = chaloTextStyleHelper27;
                obj = obj16;
                toolbarUIState = new ToolbarUIState(null, ChaloTextStyleHelper.e(chaloTextStyleHelper2, (String) obj, ChaloColorToken.AlmostBlackColor.f9756a, null, UIFontWeight.Bold, null, 108), null, null, null, ChaloThemeHelper.a().f1916a, null, null, 221);
                list = confirmBookingScreenDataState3.g;
                if (list != null) {
                    List list118 = list;
                    arrayList2 = new ArrayList(CollectionsKt.v(list118, 10));
                    while (it.hasNext()) {
                        ConfirmBookingPassengerDetails confirmBookingPassengerDetails3 = (ConfirmBookingPassengerDetails) it.next();
                        ArrayList arrayList10 = arrayList2;
                        String str112 = confirmBookingPassengerDetails3.b;
                        ChaloTextStyleHelper chaloTextStyleHelper112 = chaloTextStyleHelper17;
                        chaloTextStyleHelper17 = chaloTextStyleHelper112;
                        arrayList10.add(new TitleSubtitleUiState(null, ChaloTextStyleHelper.c(chaloTextStyleHelper112, str112, shadyGray, null, null, null, null, 124), ChaloTextStyleHelper.b(chaloTextStyleHelper17, String.valueOf(confirmBookingPassengerDetails3.c), null, 0, null, null, null, null, WebSocketProtocol.PAYLOAD_SHORT), null, 9));
                        stringProvider4 = stringProvider4;
                        arrayList2 = arrayList10;
                    }
                    arrayList = arrayList2;
                } else {
                    arrayList = null;
                }
                stringProvider = stringProvider4;
                chaloTextStyleHelper3 = chaloTextStyleHelper17;
                confirmBookingUIStateFactory$create$1.L$0 = confirmBookingScreenDataState3;
                confirmBookingUIStateFactory$create$1.L$1 = function3;
                confirmBookingUIStateFactory$create$1.L$2 = loadingDialogUIState2;
                confirmBookingUIStateFactory$create$1.L$3 = iconType2;
                confirmBookingUIStateFactory$create$1.L$4 = toolbarUIState;
                confirmBookingUIStateFactory$create$1.L$5 = arrayList;
                confirmBookingUIStateFactory$create$1.L$6 = chaloTextStyleHelper3;
                confirmBookingUIStateFactory$create$1.label = 3;
                objB3 = stringProvider.b(StringEnum.START_STOP, new Object[0], confirmBookingUIStateFactory$create$1);
                if (objB3 != obj17) {
                    ArrayList arrayList11 = arrayList;
                    function4 = function3;
                    list2 = arrayList11;
                    confirmBookingScreenDataState4 = confirmBookingScreenDataState3;
                    toolbarUIState2 = toolbarUIState;
                    obj2 = objB3;
                    chaloTextStyleHelper4 = chaloTextStyleHelper3;
                    confirmBookingScreenDataState5 = confirmBookingScreenDataState4;
                    TextUIState.ChaloTextUIState chaloTextUIStateC5 = ChaloTextStyleHelper.c(chaloTextStyleHelper4, (String) obj2, shadyGray, null, null, null, null, 124);
                    confirmationScreenTripDetails = confirmBookingScreenDataState5.f;
                    if (confirmationScreenTripDetails != null) {
                        str = str13;
                    } else {
                        str = str13;
                    }
                    ChaloTextStyleHelper chaloTextStyleHelper113 = chaloTextStyleHelper3;
                    chaloTextStyleHelper5 = chaloTextStyleHelper113;
                    iconType3 = iconType2;
                    stopDetailUiState = new StopDetailUiState(new ImageUIState(iconType3, (String) null, (ChaloColorToken) null, new ImageUISize(Dp.m7276boximpl(ChaloThemeHelper.a().i), Dp.m7276boximpl(ChaloThemeHelper.a().i)), (UIContentScale) null, 0.0f, (UiEventHandler) null, 246), chaloTextUIStateC5, ChaloTextStyleHelper.b(chaloTextStyleHelper113, str, null, 0, null, null, null, null, WebSocketProtocol.PAYLOAD_SHORT));
                    confirmBookingUIStateFactory$create$1.L$0 = confirmBookingScreenDataState5;
                    confirmBookingUIStateFactory$create$1.L$1 = function4;
                    confirmBookingUIStateFactory$create$1.L$2 = loadingDialogUIState2;
                    confirmBookingUIStateFactory$create$1.L$3 = iconType3;
                    confirmBookingUIStateFactory$create$1.L$4 = toolbarUIState2;
                    confirmBookingUIStateFactory$create$1.L$5 = list2;
                    confirmBookingUIStateFactory$create$1.L$6 = stopDetailUiState;
                    confirmBookingUIStateFactory$create$1.L$7 = chaloTextStyleHelper5;
                    confirmBookingUIStateFactory$create$1.label = 4;
                    objB4 = stringProvider.b(StringEnum.EXIT_STOP, new Object[0], confirmBookingUIStateFactory$create$1);
                    if (objB4 != obj17) {
                        ToolbarUIState toolbarUIState13 = toolbarUIState2;
                        list3 = list2;
                        stopDetailUiState2 = stopDetailUiState;
                        toolbarUIState3 = toolbarUIState13;
                        confirmBookingScreenDataState6 = confirmBookingScreenDataState5;
                        obj3 = objB4;
                        function5 = function4;
                        loadingDialogUIState3 = loadingDialogUIState2;
                        iconType4 = iconType3;
                        chaloTextStyleHelper6 = chaloTextStyleHelper5;
                        String str113 = (String) obj3;
                        ChaloTextStyleHelper chaloTextStyleHelper28 = chaloTextStyleHelper5;
                        confirmBookingScreenDataState7 = confirmBookingScreenDataState6;
                        TextUIState.ChaloTextUIState chaloTextUIStateC6 = ChaloTextStyleHelper.c(chaloTextStyleHelper6, str113, shadyGray, null, null, null, null, 124);
                        confirmationScreenTripDetails2 = confirmBookingScreenDataState7.f;
                        if (confirmationScreenTripDetails2 != null) {
                            str3 = str13;
                        } else {
                            str3 = str13;
                        }
                        list4 = list3;
                        chaloTextStyleHelper7 = chaloTextStyleHelper28;
                        StopDetailUiState stopDetailUiState5 = new StopDetailUiState(new ImageUIState(iconType4, (String) null, (ChaloColorToken) null, new ImageUISize(Dp.m7276boximpl(ChaloThemeHelper.a().i), Dp.m7276boximpl(ChaloThemeHelper.a().i)), (UIContentScale) null, 0.0f, (UiEventHandler) null, 246), chaloTextUIStateC6, ChaloTextStyleHelper.b(chaloTextStyleHelper28, str3, null, 0, null, null, null, null, WebSocketProtocol.PAYLOAD_SHORT));
                        if (list4 == null) {
                            list5 = EmptyList.f17557a;
                        } else {
                            list5 = list4;
                        }
                        journeyDetailsUiState = new JourneyDetailsUiState(stopDetailUiState2, stopDetailUiState5, list5, new DividerUIState(0.0f, null, null, 7));
                        l = confirmBookingScreenDataState7.h;
                        if (l != null) {
                            jLongValue = l.longValue();
                        } else {
                            jLongValue = 0;
                        }
                        strA = currencyFeature.a(jLongValue, CurrencyRoundOffLogic.ROUND_OFF_LOGIC_NO_ROUNDING);
                        list6 = confirmBookingScreenDataState7.i;
                        if (list6 != null) {
                            arrayList3 = new ArrayList();
                            while (r12.hasNext()) {
                                if (((FareBreakupAppModel) obj18).b == FareBreakupOperationType.SUBTRACTION) {
                                    arrayList3.add(obj18);
                                }
                            }
                            size = arrayList3.size();
                            obj4 = obj17;
                            str4 = strA;
                            j = 0;
                            while (i < size) {
                                j += ((FareBreakupAppModel) arrayList3.get(i)).c;
                                size = size;
                            }
                            l2 = new Long(j);
                            if (l2.longValue() <= 0) {
                                l2 = null;
                            }
                            if (l2 != null) {
                            }
                            if (strA2 != null) {
                                productBannerSpec = new ProductBannerSpec();
                                confirmBookingUIStateFactory$create$1.L$0 = confirmBookingScreenDataState7;
                                confirmBookingUIStateFactory$create$1.L$1 = function5;
                                confirmBookingUIStateFactory$create$1.L$2 = loadingDialogUIState3;
                                confirmBookingUIStateFactory$create$1.L$3 = toolbarUIState3;
                                confirmBookingUIStateFactory$create$1.L$4 = journeyDetailsUiState;
                                confirmBookingUIStateFactory$create$1.L$5 = str4;
                                confirmBookingUIStateFactory$create$1.L$6 = chaloTextStyleHelper7;
                                confirmBookingUIStateFactory$create$1.L$7 = productBannerSpec;
                                confirmBookingUIStateFactory$create$1.label = 5;
                                objB5 = stringProvider.b(StringEnum.DISCOUNT_TEXT_COPY, new Object[]{strA2}, confirmBookingUIStateFactory$create$1);
                                obj5 = obj4;
                                if (objB5 == obj5) {
                                    return obj5;
                                }
                                function6 = function5;
                                confirmBookingScreenDataState8 = confirmBookingScreenDataState7;
                                obj6 = objB5;
                                loadingDialogUIState4 = loadingDialogUIState3;
                                journeyDetailsUiState2 = journeyDetailsUiState;
                                chaloTextStyleHelper8 = chaloTextStyleHelper7;
                                productBannerUIState = new ProductBannerUIState(productBannerSpec, ChaloTextStyleHelper.c(chaloTextStyleHelper8, (String) obj6, null, null, UIFontWeight.SemiBold, null, null, FacebookMediationAdapter.ERROR_FAILED_TO_PRESENT_AD), new ImageUIState(IconType.DISCOUNT_GREEN, (String) null, (ChaloColorToken) null, (ImageUISize) null, (UIContentScale) null, 0.0f, (UiEventHandler) null, 254));
                                confirmBookingScreenDataState7 = confirmBookingScreenDataState8;
                            } else {
                                obj5 = obj4;
                                loadingDialogUIState4 = loadingDialogUIState3;
                                function6 = function5;
                                journeyDetailsUiState2 = journeyDetailsUiState;
                                productBannerUIState = null;
                            }
                            list7 = confirmBookingScreenDataState7.i;
                            if (list7 != null) {
                                List list119 = list7;
                                arrayList4 = new ArrayList(CollectionsKt.v(list119, 10));
                                it2 = list119.iterator();
                                while (it2.hasNext()) {
                                    FareBreakupAppModel fareBreakupAppModel5 = (FareBreakupAppModel) it2.next();
                                    FareBreakupOperationUIProperties fareBreakupOperationUIPropertiesA5 = FareBreakupOperationUIPropertiesKt.a(fareBreakupAppModel5.b, (3 & 1) != 0 ? ChaloColorToken.Black.f9759a : ChaloColorToken.AlmostBlackColor.f9756a, (3 & 2) != 0);
                                    ChaloTextStyleHelper chaloTextStyleHelper29 = chaloTextStyleHelper7;
                                    arrayList4.add(new FareLineUiState(ChaloTextStyleHelper.c(chaloTextStyleHelper29, fareBreakupAppModel5.f3890a, null, null, null, null, null, WebSocketProtocol.PAYLOAD_SHORT), ChaloTextStyleHelper.c(chaloTextStyleHelper29, vo1.A(fareBreakupOperationUIPropertiesA5.f8267a, currencyFeature.a(fareBreakupAppModel5.c, CurrencyRoundOffLogic.ROUND_OFF_LOGIC_NO_ROUNDING)), fareBreakupOperationUIPropertiesA5.b, null, UIFontWeight.Bold, null, null, 108)));
                                    it2 = it2;
                                    chaloTextStyleHelper7 = chaloTextStyleHelper29;
                                    obj5 = obj5;
                                }
                            } else {
                                arrayList4 = null;
                            }
                            chaloTextStyleHelper17 = chaloTextStyleHelper7;
                            Object obj113 = obj5;
                            confirmBookingUIStateFactory$create$1.L$0 = confirmBookingScreenDataState7;
                            confirmBookingUIStateFactory$create$1.L$1 = function6;
                            confirmBookingUIStateFactory$create$1.L$2 = loadingDialogUIState4;
                            confirmBookingUIStateFactory$create$1.L$3 = toolbarUIState3;
                            confirmBookingUIStateFactory$create$1.L$4 = journeyDetailsUiState2;
                            confirmBookingUIStateFactory$create$1.L$5 = str4;
                            confirmBookingUIStateFactory$create$1.L$6 = productBannerUIState;
                            confirmBookingUIStateFactory$create$1.L$7 = arrayList4;
                            confirmBookingUIStateFactory$create$1.L$8 = chaloTextStyleHelper17;
                            confirmBookingUIStateFactory$create$1.label = 6;
                            objB6 = stringProvider.b(StringEnum.TOTAL, new Object[0], confirmBookingUIStateFactory$create$1);
                            obj7 = obj113;
                            if (objB6 == obj7) {
                                return obj7;
                            }
                            list8 = arrayList4;
                            str6 = str4;
                            productBannerUIState2 = productBannerUIState;
                            chaloTextStyleHelper9 = chaloTextStyleHelper17;
                            confirmBookingScreenDataState9 = confirmBookingScreenDataState7;
                            obj8 = objB6;
                            str7 = str6;
                            fareLineUiState = new FareLineUiState(ChaloTextStyleHelper.c(chaloTextStyleHelper9, (String) obj8, null, null, null, null, null, WebSocketProtocol.PAYLOAD_SHORT), ChaloTextStyleHelper.c(chaloTextStyleHelper17, str6, null, null, UIFontWeight.Bold, null, null, FacebookMediationAdapter.ERROR_FAILED_TO_PRESENT_AD));
                            confirmBookingUIStateFactory$create$1.L$0 = confirmBookingScreenDataState9;
                            confirmBookingUIStateFactory$create$1.L$1 = function6;
                            confirmBookingUIStateFactory$create$1.L$2 = loadingDialogUIState4;
                            confirmBookingUIStateFactory$create$1.L$3 = toolbarUIState3;
                            confirmBookingUIStateFactory$create$1.L$4 = journeyDetailsUiState2;
                            confirmBookingUIStateFactory$create$1.L$5 = str7;
                            confirmBookingUIStateFactory$create$1.L$6 = productBannerUIState2;
                            confirmBookingUIStateFactory$create$1.L$7 = list8;
                            confirmBookingUIStateFactory$create$1.L$8 = fareLineUiState;
                            confirmBookingUIStateFactory$create$1.L$9 = chaloTextStyleHelper17;
                            confirmBookingUIStateFactory$create$1.label = 7;
                            objB7 = stringProvider.b(StringEnum.PRICE_DETAILS, new Object[0], confirmBookingUIStateFactory$create$1);
                            if (objB7 == obj7) {
                                return obj7;
                            }
                            fareLineUiState2 = fareLineUiState;
                            chaloTextStyleHelper10 = chaloTextStyleHelper17;
                            confirmBookingScreenDataState10 = confirmBookingScreenDataState9;
                            function7 = function6;
                            loadingDialogUIState5 = loadingDialogUIState4;
                            journeyDetailsUiState3 = journeyDetailsUiState2;
                            str8 = str7;
                            TextUIState.ChaloTextUIState chaloTextUIStateA6 = ChaloTextStyleHelper.a(chaloTextStyleHelper10, (String) objB7, null, UIFontWeight.Bold, null, FacebookMediationAdapter.ERROR_FAILED_TO_PRESENT_AD);
                            if (list8 == null) {
                                list8 = EmptyList.f17557a;
                            }
                            priceDetailsUiState = new PriceDetailsUiState(chaloTextUIStateA6, list8, fareLineUiState2, productBannerUIState2);
                            list9 = confirmBookingScreenDataState10.j;
                            if (list9 != null) {
                                if (list9.isEmpty()) {
                                    list9 = null;
                                }
                                if (list9 != null) {
                                    List listX4 = CollectionsKt.x0(list9, 3);
                                    arrayList5 = new ArrayList(CollectionsKt.v(listX4, 10));
                                    it3 = listX4.iterator();
                                    i2 = 0;
                                    while (it3.hasNext()) {
                                        next = it3.next();
                                        i3 = i2 + 1;
                                        if (i2 < 0) {
                                            CollectionsKt.z0();
                                            throw null;
                                        }
                                        arrayList5.add(ChaloTextStyleHelper.c(chaloTextStyleHelper17, i3 + ". " + ((String) next), null, null, null, null, null, WebSocketProtocol.PAYLOAD_SHORT));
                                        it3 = it3;
                                        i2 = i3;
                                    }
                                    chaloTextStyleHelper12 = chaloTextStyleHelper17;
                                    confirmBookingUIStateFactory$create$1.L$0 = confirmBookingScreenDataState10;
                                    confirmBookingUIStateFactory$create$1.L$1 = function7;
                                    confirmBookingUIStateFactory$create$1.L$2 = loadingDialogUIState5;
                                    confirmBookingUIStateFactory$create$1.L$3 = toolbarUIState3;
                                    confirmBookingUIStateFactory$create$1.L$4 = journeyDetailsUiState3;
                                    confirmBookingUIStateFactory$create$1.L$5 = str8;
                                    confirmBookingUIStateFactory$create$1.L$6 = priceDetailsUiState;
                                    confirmBookingUIStateFactory$create$1.L$7 = arrayList5;
                                    confirmBookingUIStateFactory$create$1.L$8 = chaloTextStyleHelper12;
                                    confirmBookingUIStateFactory$create$1.L$9 = null;
                                    confirmBookingUIStateFactory$create$1.label = 8;
                                    objB8 = stringProvider.b(StringEnum.TERMS_AND_CONDITIONS, new Object[0], confirmBookingUIStateFactory$create$1);
                                    if (objB8 == obj7) {
                                        return obj7;
                                    }
                                    chaloTextStyleHelper13 = chaloTextStyleHelper12;
                                    str10 = str8;
                                    journeyDetailsUiState5 = journeyDetailsUiState3;
                                    list10 = arrayList5;
                                    chaloTextUIStateA = ChaloTextStyleHelper.a(chaloTextStyleHelper13, (String) objB8, null, UIFontWeight.Bold, null, FacebookMediationAdapter.ERROR_FAILED_TO_PRESENT_AD);
                                    styledTextDataUIStateArr = new StyledTextDataUIState[2];
                                    chaloTextStyleHelper11 = chaloTextStyleHelper12;
                                    confirmBookingUIStateFactory$create$1.L$0 = confirmBookingScreenDataState10;
                                    confirmBookingUIStateFactory$create$1.L$1 = function7;
                                    confirmBookingUIStateFactory$create$1.L$2 = loadingDialogUIState5;
                                    confirmBookingUIStateFactory$create$1.L$3 = toolbarUIState3;
                                    confirmBookingUIStateFactory$create$1.L$4 = journeyDetailsUiState5;
                                    confirmBookingUIStateFactory$create$1.L$5 = str10;
                                    confirmBookingUIStateFactory$create$1.L$6 = priceDetailsUiState;
                                    confirmBookingUIStateFactory$create$1.L$7 = styledTextDataUIStateArr;
                                    confirmBookingUIStateFactory$create$1.L$8 = chaloTextUIStateA;
                                    confirmBookingUIStateFactory$create$1.L$9 = list10;
                                    confirmBookingUIStateFactory$create$1.L$10 = styledTextDataUIStateArr;
                                    confirmBookingUIStateFactory$create$1.I$0 = 0;
                                    confirmBookingUIStateFactory$create$1.label = 9;
                                    objB9 = stringProvider.b(StringEnum.ALL_TNC_PREFIX, new Object[0], confirmBookingUIStateFactory$create$1);
                                    if (objB9 == obj7) {
                                        return obj7;
                                    }
                                    styledTextDataUIStateArr2 = styledTextDataUIStateArr;
                                    toolbarUIState5 = toolbarUIState3;
                                    priceDetailsUiState3 = priceDetailsUiState;
                                    loadingDialogUIState7 = loadingDialogUIState5;
                                    i4 = 0;
                                    journeyDetailsUiState6 = journeyDetailsUiState5;
                                    str11 = str10;
                                    chaloTextUIState = chaloTextUIStateA;
                                    obj10 = objB9;
                                    list11 = list10;
                                    styledTextDataUIStateArr2[i4] = new StyledTextDataUIState(obj10 + " ", null, null, UITextStyle.BodySmall, null, null, null, 1014);
                                    confirmBookingUIStateFactory$create$1.L$0 = confirmBookingScreenDataState10;
                                    confirmBookingUIStateFactory$create$1.L$1 = function7;
                                    confirmBookingUIStateFactory$create$1.L$2 = loadingDialogUIState7;
                                    confirmBookingUIStateFactory$create$1.L$3 = toolbarUIState5;
                                    confirmBookingUIStateFactory$create$1.L$4 = journeyDetailsUiState6;
                                    confirmBookingUIStateFactory$create$1.L$5 = str11;
                                    confirmBookingUIStateFactory$create$1.L$6 = priceDetailsUiState3;
                                    confirmBookingUIStateFactory$create$1.L$7 = styledTextDataUIStateArr;
                                    confirmBookingUIStateFactory$create$1.L$8 = chaloTextUIState;
                                    confirmBookingUIStateFactory$create$1.L$9 = list11;
                                    confirmBookingUIStateFactory$create$1.L$10 = styledTextDataUIStateArr;
                                    confirmBookingUIStateFactory$create$1.I$0 = 1;
                                    confirmBookingUIStateFactory$create$1.label = 10;
                                    objB10 = stringProvider.b(StringEnum.TNC_CLICKABLE_TEXT, new Object[0], confirmBookingUIStateFactory$create$1);
                                    if (objB10 == obj7) {
                                        return obj7;
                                    }
                                    styledTextDataUIStateArr3 = styledTextDataUIStateArr;
                                    str12 = str11;
                                    loadingDialogUIState8 = loadingDialogUIState7;
                                    confirmBookingScreenDataState12 = confirmBookingScreenDataState10;
                                    toolbarUIState6 = toolbarUIState5;
                                    i5 = 1;
                                    chaloTextUIState2 = chaloTextUIState;
                                    function8 = function7;
                                    list12 = list11;
                                    styledTextDataUIStateArr4 = styledTextDataUIStateArr3;
                                    priceDetailsUiState4 = priceDetailsUiState3;
                                    journeyDetailsUiState7 = journeyDetailsUiState6;
                                    String str114 = (String) objB10;
                                    obj9 = obj7;
                                    tnCDialogUIState = null;
                                    styledTextDataUIStateArr4[i5] = new StyledTextDataUIState(str114, orangePrimary, UIFontWeight.Bold, UITextStyle.BodySmall, null, null, new StyledTextClickHandler() { // from class: app.chalo.metro.ui.confirmbooking.uistate.ConfirmBookingUIStateFactory$create$termsAndConditionsUiState$2$1
                                        @Override // app.chalo.uistate.text.StyledTextClickHandler
                                        public final void a() {
                                            function8.invoke(ConfirmBookingScreenViewIntent.OnTermsAndConditionsClicked.f5468a);
                                        }

                                        @Override // app.chalo.uistate.text.StyledTextClickHandler
                                        /* JADX INFO: renamed from: b */
                                        public final String getB() {
                                            return "TNC_CLICKABLE_TEXT";
                                        }

                                        @Override // app.chalo.uistate.text.StyledTextClickHandler
                                        /* JADX INFO: renamed from: getTag */
                                        public final String getF10085a() {
                                            return "TNC_CLICKABLE_TEXT";
                                        }
                                    }, 496);
                                    termsAndConditionsUiState = new TermsAndConditionsUiState(chaloTextUIState2, list12, new TextUIState.StyledTextUIState(CollectionsKt.S(styledTextDataUIStateArr3), null, null, 30));
                                    function7 = function8;
                                    confirmBookingScreenDataState11 = confirmBookingScreenDataState12;
                                    priceDetailsUiState2 = priceDetailsUiState4;
                                    str9 = str12;
                                    journeyDetailsUiState4 = journeyDetailsUiState7;
                                    loadingDialogUIState6 = loadingDialogUIState8;
                                    toolbarUIState4 = toolbarUIState6;
                                }
                                z = confirmBookingScreenDataState11.m;
                                List list1110 = confirmBookingScreenDataState11.j;
                                if (z) {
                                    break;
                                }
                                obj11 = obj9;
                                JourneyDetailsUiState journeyDetailsUiState112 = journeyDetailsUiState4;
                                priceDetailsUiState5 = priceDetailsUiState2;
                                loadingDialogUIState9 = loadingDialogUIState6;
                                toolbarUIState7 = toolbarUIState4;
                                journeyDetailsUiState8 = journeyDetailsUiState112;
                                Function1 function115 = function7;
                                confirmBookingScreenDataState13 = confirmBookingScreenDataState11;
                                function9 = function115;
                                tnCDialogUIState2 = tnCDialogUIState;
                                StringEnum stringEnum10 = StringEnum.FARE_DETAILS_PAY;
                                Object[] objArr10 = {str9};
                                confirmBookingUIStateFactory$create$1.L$0 = confirmBookingScreenDataState13;
                                confirmBookingUIStateFactory$create$1.L$1 = function9;
                                confirmBookingUIStateFactory$create$1.L$2 = loadingDialogUIState9;
                                confirmBookingUIStateFactory$create$1.L$3 = toolbarUIState7;
                                confirmBookingUIStateFactory$create$1.L$4 = journeyDetailsUiState8;
                                confirmBookingUIStateFactory$create$1.L$5 = priceDetailsUiState5;
                                confirmBookingUIStateFactory$create$1.L$6 = termsAndConditionsUiState;
                                confirmBookingUIStateFactory$create$1.L$7 = tnCDialogUIState2;
                                buttonUIStateFactory = ButtonUIStateFactory.f9921a;
                                confirmBookingUIStateFactory$create$1.L$8 = buttonUIStateFactory;
                                confirmBookingUIStateFactory$create$1.L$9 = tnCDialogUIState;
                                confirmBookingUIStateFactory$create$1.L$10 = tnCDialogUIState;
                                confirmBookingUIStateFactory$create$1.label = 12;
                                objB11 = stringProvider.b(stringEnum10, objArr10, confirmBookingUIStateFactory$create$1);
                                if (objB11 != obj11) {
                                    priceDetailsUiState6 = priceDetailsUiState5;
                                    termsAndConditionsUiState2 = termsAndConditionsUiState;
                                    confirmBookingScreenDataState14 = confirmBookingScreenDataState13;
                                    loadingDialogUIState10 = loadingDialogUIState9;
                                    buttonUIStateFactory2 = buttonUIStateFactory;
                                    tnCDialogUIState3 = tnCDialogUIState2;
                                    function10 = function9;
                                    confirmBookingScreenDataState15 = confirmBookingScreenDataState14;
                                    journeyDetailsUiState9 = journeyDetailsUiState8;
                                    tnCDialogUIState4 = tnCDialogUIState3;
                                    loadingDialogUIState11 = loadingDialogUIState10;
                                    stringProvider2 = stringProvider;
                                    obj13 = obj11;
                                    toolbarUIState8 = toolbarUIState7;
                                    buttonUIStateG = ButtonUIStateFactory.g(buttonUIStateFactory2, (String) objB11, new bp(function10, 15), null, UIShape.d, true, 0.0f, 36);
                                    if (confirmBookingScreenDataState15.l) {
                                        confirmBookingUIStateFactory$create$1.L$0 = confirmBookingScreenDataState15;
                                        confirmBookingUIStateFactory$create$1.L$1 = function10;
                                        confirmBookingUIStateFactory$create$1.L$2 = loadingDialogUIState11;
                                        confirmBookingUIStateFactory$create$1.L$3 = toolbarUIState8;
                                        confirmBookingUIStateFactory$create$1.L$4 = journeyDetailsUiState9;
                                        confirmBookingUIStateFactory$create$1.L$5 = priceDetailsUiState6;
                                        confirmBookingUIStateFactory$create$1.L$6 = termsAndConditionsUiState2;
                                        confirmBookingUIStateFactory$create$1.L$7 = tnCDialogUIState4;
                                        confirmBookingUIStateFactory$create$1.L$8 = buttonUIStateG;
                                        chaloTextStyleHelper14 = chaloTextStyleHelper11;
                                        confirmBookingUIStateFactory$create$1.L$9 = chaloTextStyleHelper14;
                                        confirmBookingUIStateFactory$create$1.label = 13;
                                        stringProvider3 = stringProvider2;
                                        objB12 = stringProvider3.b(StringEnum.SOMETHING_WENT_WRONG, new Object[0], confirmBookingUIStateFactory$create$1);
                                        obj14 = obj13;
                                        if (objB12 == obj14) {
                                            return obj14;
                                        }
                                        journeyDetailsUiState11 = journeyDetailsUiState9;
                                        priceDetailsUiState8 = priceDetailsUiState6;
                                        function11 = function10;
                                        confirmBookingScreenDataState17 = confirmBookingScreenDataState15;
                                        obj15 = objB12;
                                        tnCDialogUIState6 = tnCDialogUIState4;
                                        chaloTextStyleHelper15 = chaloTextStyleHelper14;
                                        chaloTextUIStateB = ChaloTextStyleHelper.b(chaloTextStyleHelper15, (String) obj15, ChaloColorToken.White.f9870a, 0, null, null, null, null, 124);
                                        confirmBookingUIStateFactory$create$1.L$0 = confirmBookingScreenDataState17;
                                        confirmBookingUIStateFactory$create$1.L$1 = function11;
                                        confirmBookingUIStateFactory$create$1.L$2 = loadingDialogUIState11;
                                        confirmBookingUIStateFactory$create$1.L$3 = toolbarUIState8;
                                        confirmBookingUIStateFactory$create$1.L$4 = journeyDetailsUiState11;
                                        confirmBookingUIStateFactory$create$1.L$5 = priceDetailsUiState8;
                                        confirmBookingUIStateFactory$create$1.L$6 = termsAndConditionsUiState2;
                                        confirmBookingUIStateFactory$create$1.L$7 = tnCDialogUIState6;
                                        confirmBookingUIStateFactory$create$1.L$8 = buttonUIStateG;
                                        confirmBookingUIStateFactory$create$1.L$9 = chaloTextUIStateB;
                                        confirmBookingUIStateFactory$create$1.L$10 = chaloTextStyleHelper14;
                                        confirmBookingScreenDataState18 = confirmBookingScreenDataState17;
                                        confirmBookingUIStateFactory$create$1.label = 14;
                                        objB13 = stringProvider3.b(StringEnum.RETRY, new Object[0], confirmBookingUIStateFactory$create$1);
                                        if (objB13 == obj14) {
                                            return obj14;
                                        }
                                        toolbarUIState10 = toolbarUIState8;
                                        termsAndConditionsUiState4 = termsAndConditionsUiState2;
                                        confirmBookingScreenDataState19 = confirmBookingScreenDataState18;
                                        function12 = function11;
                                        chaloTextUIState3 = chaloTextUIStateB;
                                        obj16 = objB13;
                                        priceDetailsUiState9 = priceDetailsUiState8;
                                        chaloTextStyleHelper16 = chaloTextStyleHelper14;
                                        loadingDialogUIState13 = loadingDialogUIState11;
                                        journeyDetailsUiState12 = journeyDetailsUiState11;
                                        ChaloColorToken.OrangePrimary orangePrimary11 = orangePrimary;
                                        priceDetailsUiState7 = priceDetailsUiState9;
                                        tnCDialogUIState5 = tnCDialogUIState6;
                                        termsAndConditionsUiState3 = termsAndConditionsUiState4;
                                        snackbarUIState = new SnackbarUIState(chaloTextUIState3, ChaloTextStyleHelper.b(chaloTextStyleHelper16, (String) obj16, orangePrimary11, 0, null, UIFontWeight.SemiBold, null, null, 108), UiEventHandler.Companion.a(new bp(function12, 16)));
                                        journeyDetailsUiState10 = journeyDetailsUiState12;
                                        toolbarUIState9 = toolbarUIState10;
                                        loadingDialogUIState12 = loadingDialogUIState13;
                                        confirmBookingScreenDataState16 = confirmBookingScreenDataState19;
                                    } else {
                                        confirmBookingScreenDataState16 = confirmBookingScreenDataState15;
                                        journeyDetailsUiState10 = journeyDetailsUiState9;
                                        tnCDialogUIState5 = tnCDialogUIState4;
                                        loadingDialogUIState12 = loadingDialogUIState11;
                                        toolbarUIState9 = toolbarUIState8;
                                        termsAndConditionsUiState3 = termsAndConditionsUiState2;
                                        priceDetailsUiState7 = priceDetailsUiState6;
                                        snackbarUIState = null;
                                    }
                                    ButtonUIState buttonUIState10 = buttonUIStateG;
                                    boolean z11 = confirmBookingScreenDataState16.k;
                                    if (confirmBookingScreenDataState16.c) {
                                        loadingDialogUIState14 = loadingDialogUIState12;
                                    } else {
                                        loadingDialogUIState14 = null;
                                    }
                                    return new ConfirmBookingScreenViewState(toolbarUIState9, journeyDetailsUiState10, priceDetailsUiState7, termsAndConditionsUiState3, tnCDialogUIState5, buttonUIState10, snackbarUIState, z11, loadingDialogUIState14);
                                }
                                return obj11;
                            }
                            obj9 = obj7;
                            chaloTextStyleHelper11 = chaloTextStyleHelper17;
                            tnCDialogUIState = null;
                            termsAndConditionsUiState = null;
                            journeyDetailsUiState4 = journeyDetailsUiState3;
                            str9 = str8;
                            toolbarUIState4 = toolbarUIState3;
                            priceDetailsUiState2 = priceDetailsUiState;
                            loadingDialogUIState6 = loadingDialogUIState5;
                            confirmBookingScreenDataState11 = confirmBookingScreenDataState10;
                            z = confirmBookingScreenDataState11.m;
                            List list1111 = confirmBookingScreenDataState11.j;
                            if (z) {
                                break;
                            }
                            obj11 = obj9;
                            JourneyDetailsUiState journeyDetailsUiState113 = journeyDetailsUiState4;
                            priceDetailsUiState5 = priceDetailsUiState2;
                            loadingDialogUIState9 = loadingDialogUIState6;
                            toolbarUIState7 = toolbarUIState4;
                            journeyDetailsUiState8 = journeyDetailsUiState113;
                            Function1 function116 = function7;
                            confirmBookingScreenDataState13 = confirmBookingScreenDataState11;
                            function9 = function116;
                            tnCDialogUIState2 = tnCDialogUIState;
                            StringEnum stringEnum11 = StringEnum.FARE_DETAILS_PAY;
                            Object[] objArr11 = {str9};
                            confirmBookingUIStateFactory$create$1.L$0 = confirmBookingScreenDataState13;
                            confirmBookingUIStateFactory$create$1.L$1 = function9;
                            confirmBookingUIStateFactory$create$1.L$2 = loadingDialogUIState9;
                            confirmBookingUIStateFactory$create$1.L$3 = toolbarUIState7;
                            confirmBookingUIStateFactory$create$1.L$4 = journeyDetailsUiState8;
                            confirmBookingUIStateFactory$create$1.L$5 = priceDetailsUiState5;
                            confirmBookingUIStateFactory$create$1.L$6 = termsAndConditionsUiState;
                            confirmBookingUIStateFactory$create$1.L$7 = tnCDialogUIState2;
                            buttonUIStateFactory = ButtonUIStateFactory.f9921a;
                            confirmBookingUIStateFactory$create$1.L$8 = buttonUIStateFactory;
                            confirmBookingUIStateFactory$create$1.L$9 = tnCDialogUIState;
                            confirmBookingUIStateFactory$create$1.L$10 = tnCDialogUIState;
                            confirmBookingUIStateFactory$create$1.label = 12;
                            objB11 = stringProvider.b(stringEnum11, objArr11, confirmBookingUIStateFactory$create$1);
                            if (objB11 != obj11) {
                                priceDetailsUiState6 = priceDetailsUiState5;
                                termsAndConditionsUiState2 = termsAndConditionsUiState;
                                confirmBookingScreenDataState14 = confirmBookingScreenDataState13;
                                loadingDialogUIState10 = loadingDialogUIState9;
                                buttonUIStateFactory2 = buttonUIStateFactory;
                                tnCDialogUIState3 = tnCDialogUIState2;
                                function10 = function9;
                                confirmBookingScreenDataState15 = confirmBookingScreenDataState14;
                                journeyDetailsUiState9 = journeyDetailsUiState8;
                                tnCDialogUIState4 = tnCDialogUIState3;
                                loadingDialogUIState11 = loadingDialogUIState10;
                                stringProvider2 = stringProvider;
                                obj13 = obj11;
                                toolbarUIState8 = toolbarUIState7;
                                buttonUIStateG = ButtonUIStateFactory.g(buttonUIStateFactory2, (String) objB11, new bp(function10, 15), null, UIShape.d, true, 0.0f, 36);
                                if (confirmBookingScreenDataState15.l) {
                                    confirmBookingUIStateFactory$create$1.L$0 = confirmBookingScreenDataState15;
                                    confirmBookingUIStateFactory$create$1.L$1 = function10;
                                    confirmBookingUIStateFactory$create$1.L$2 = loadingDialogUIState11;
                                    confirmBookingUIStateFactory$create$1.L$3 = toolbarUIState8;
                                    confirmBookingUIStateFactory$create$1.L$4 = journeyDetailsUiState9;
                                    confirmBookingUIStateFactory$create$1.L$5 = priceDetailsUiState6;
                                    confirmBookingUIStateFactory$create$1.L$6 = termsAndConditionsUiState2;
                                    confirmBookingUIStateFactory$create$1.L$7 = tnCDialogUIState4;
                                    confirmBookingUIStateFactory$create$1.L$8 = buttonUIStateG;
                                    chaloTextStyleHelper14 = chaloTextStyleHelper11;
                                    confirmBookingUIStateFactory$create$1.L$9 = chaloTextStyleHelper14;
                                    confirmBookingUIStateFactory$create$1.label = 13;
                                    stringProvider3 = stringProvider2;
                                    objB12 = stringProvider3.b(StringEnum.SOMETHING_WENT_WRONG, new Object[0], confirmBookingUIStateFactory$create$1);
                                    obj14 = obj13;
                                    if (objB12 == obj14) {
                                        return obj14;
                                    }
                                    journeyDetailsUiState11 = journeyDetailsUiState9;
                                    priceDetailsUiState8 = priceDetailsUiState6;
                                    function11 = function10;
                                    confirmBookingScreenDataState17 = confirmBookingScreenDataState15;
                                    obj15 = objB12;
                                    tnCDialogUIState6 = tnCDialogUIState4;
                                    chaloTextStyleHelper15 = chaloTextStyleHelper14;
                                    chaloTextUIStateB = ChaloTextStyleHelper.b(chaloTextStyleHelper15, (String) obj15, ChaloColorToken.White.f9870a, 0, null, null, null, null, 124);
                                    confirmBookingUIStateFactory$create$1.L$0 = confirmBookingScreenDataState17;
                                    confirmBookingUIStateFactory$create$1.L$1 = function11;
                                    confirmBookingUIStateFactory$create$1.L$2 = loadingDialogUIState11;
                                    confirmBookingUIStateFactory$create$1.L$3 = toolbarUIState8;
                                    confirmBookingUIStateFactory$create$1.L$4 = journeyDetailsUiState11;
                                    confirmBookingUIStateFactory$create$1.L$5 = priceDetailsUiState8;
                                    confirmBookingUIStateFactory$create$1.L$6 = termsAndConditionsUiState2;
                                    confirmBookingUIStateFactory$create$1.L$7 = tnCDialogUIState6;
                                    confirmBookingUIStateFactory$create$1.L$8 = buttonUIStateG;
                                    confirmBookingUIStateFactory$create$1.L$9 = chaloTextUIStateB;
                                    confirmBookingUIStateFactory$create$1.L$10 = chaloTextStyleHelper14;
                                    confirmBookingScreenDataState18 = confirmBookingScreenDataState17;
                                    confirmBookingUIStateFactory$create$1.label = 14;
                                    objB13 = stringProvider3.b(StringEnum.RETRY, new Object[0], confirmBookingUIStateFactory$create$1);
                                    if (objB13 == obj14) {
                                        return obj14;
                                    }
                                    toolbarUIState10 = toolbarUIState8;
                                    termsAndConditionsUiState4 = termsAndConditionsUiState2;
                                    confirmBookingScreenDataState19 = confirmBookingScreenDataState18;
                                    function12 = function11;
                                    chaloTextUIState3 = chaloTextUIStateB;
                                    obj16 = objB13;
                                    priceDetailsUiState9 = priceDetailsUiState8;
                                    chaloTextStyleHelper16 = chaloTextStyleHelper14;
                                    loadingDialogUIState13 = loadingDialogUIState11;
                                    journeyDetailsUiState12 = journeyDetailsUiState11;
                                    ChaloColorToken.OrangePrimary orangePrimary12 = orangePrimary;
                                    priceDetailsUiState7 = priceDetailsUiState9;
                                    tnCDialogUIState5 = tnCDialogUIState6;
                                    termsAndConditionsUiState3 = termsAndConditionsUiState4;
                                    snackbarUIState = new SnackbarUIState(chaloTextUIState3, ChaloTextStyleHelper.b(chaloTextStyleHelper16, (String) obj16, orangePrimary12, 0, null, UIFontWeight.SemiBold, null, null, 108), UiEventHandler.Companion.a(new bp(function12, 16)));
                                    journeyDetailsUiState10 = journeyDetailsUiState12;
                                    toolbarUIState9 = toolbarUIState10;
                                    loadingDialogUIState12 = loadingDialogUIState13;
                                    confirmBookingScreenDataState16 = confirmBookingScreenDataState19;
                                } else {
                                    confirmBookingScreenDataState16 = confirmBookingScreenDataState15;
                                    journeyDetailsUiState10 = journeyDetailsUiState9;
                                    tnCDialogUIState5 = tnCDialogUIState4;
                                    loadingDialogUIState12 = loadingDialogUIState11;
                                    toolbarUIState9 = toolbarUIState8;
                                    termsAndConditionsUiState3 = termsAndConditionsUiState2;
                                    priceDetailsUiState7 = priceDetailsUiState6;
                                    snackbarUIState = null;
                                }
                                ButtonUIState buttonUIState11 = buttonUIStateG;
                                boolean z12 = confirmBookingScreenDataState16.k;
                                if (confirmBookingScreenDataState16.c) {
                                    loadingDialogUIState14 = loadingDialogUIState12;
                                } else {
                                    loadingDialogUIState14 = null;
                                }
                                return new ConfirmBookingScreenViewState(toolbarUIState9, journeyDetailsUiState10, priceDetailsUiState7, termsAndConditionsUiState3, tnCDialogUIState5, buttonUIState11, snackbarUIState, z12, loadingDialogUIState14);
                            }
                            return obj11;
                        }
                        obj4 = obj17;
                        str4 = strA;
                        if (strA2 != null) {
                            productBannerSpec = new ProductBannerSpec();
                            confirmBookingUIStateFactory$create$1.L$0 = confirmBookingScreenDataState7;
                            confirmBookingUIStateFactory$create$1.L$1 = function5;
                            confirmBookingUIStateFactory$create$1.L$2 = loadingDialogUIState3;
                            confirmBookingUIStateFactory$create$1.L$3 = toolbarUIState3;
                            confirmBookingUIStateFactory$create$1.L$4 = journeyDetailsUiState;
                            confirmBookingUIStateFactory$create$1.L$5 = str4;
                            confirmBookingUIStateFactory$create$1.L$6 = chaloTextStyleHelper7;
                            confirmBookingUIStateFactory$create$1.L$7 = productBannerSpec;
                            confirmBookingUIStateFactory$create$1.label = 5;
                            objB5 = stringProvider.b(StringEnum.DISCOUNT_TEXT_COPY, new Object[]{strA2}, confirmBookingUIStateFactory$create$1);
                            obj5 = obj4;
                            if (objB5 == obj5) {
                                return obj5;
                            }
                            function6 = function5;
                            confirmBookingScreenDataState8 = confirmBookingScreenDataState7;
                            obj6 = objB5;
                            loadingDialogUIState4 = loadingDialogUIState3;
                            journeyDetailsUiState2 = journeyDetailsUiState;
                            chaloTextStyleHelper8 = chaloTextStyleHelper7;
                            productBannerUIState = new ProductBannerUIState(productBannerSpec, ChaloTextStyleHelper.c(chaloTextStyleHelper8, (String) obj6, null, null, UIFontWeight.SemiBold, null, null, FacebookMediationAdapter.ERROR_FAILED_TO_PRESENT_AD), new ImageUIState(IconType.DISCOUNT_GREEN, (String) null, (ChaloColorToken) null, (ImageUISize) null, (UIContentScale) null, 0.0f, (UiEventHandler) null, 254));
                            confirmBookingScreenDataState7 = confirmBookingScreenDataState8;
                        } else {
                            obj5 = obj4;
                            loadingDialogUIState4 = loadingDialogUIState3;
                            function6 = function5;
                            journeyDetailsUiState2 = journeyDetailsUiState;
                            productBannerUIState = null;
                        }
                        list7 = confirmBookingScreenDataState7.i;
                        if (list7 != null) {
                            List list1112 = list7;
                            arrayList4 = new ArrayList(CollectionsKt.v(list1112, 10));
                            it2 = list1112.iterator();
                            while (it2.hasNext()) {
                                FareBreakupAppModel fareBreakupAppModel6 = (FareBreakupAppModel) it2.next();
                                FareBreakupOperationUIProperties fareBreakupOperationUIPropertiesA6 = FareBreakupOperationUIPropertiesKt.a(fareBreakupAppModel6.b, (3 & 1) != 0 ? ChaloColorToken.Black.f9759a : ChaloColorToken.AlmostBlackColor.f9756a, (3 & 2) != 0);
                                ChaloTextStyleHelper chaloTextStyleHelper210 = chaloTextStyleHelper7;
                                arrayList4.add(new FareLineUiState(ChaloTextStyleHelper.c(chaloTextStyleHelper210, fareBreakupAppModel6.f3890a, null, null, null, null, null, WebSocketProtocol.PAYLOAD_SHORT), ChaloTextStyleHelper.c(chaloTextStyleHelper210, vo1.A(fareBreakupOperationUIPropertiesA6.f8267a, currencyFeature.a(fareBreakupAppModel6.c, CurrencyRoundOffLogic.ROUND_OFF_LOGIC_NO_ROUNDING)), fareBreakupOperationUIPropertiesA6.b, null, UIFontWeight.Bold, null, null, 108)));
                                it2 = it2;
                                chaloTextStyleHelper7 = chaloTextStyleHelper210;
                                obj5 = obj5;
                            }
                        } else {
                            arrayList4 = null;
                        }
                        chaloTextStyleHelper17 = chaloTextStyleHelper7;
                        Object obj114 = obj5;
                        confirmBookingUIStateFactory$create$1.L$0 = confirmBookingScreenDataState7;
                        confirmBookingUIStateFactory$create$1.L$1 = function6;
                        confirmBookingUIStateFactory$create$1.L$2 = loadingDialogUIState4;
                        confirmBookingUIStateFactory$create$1.L$3 = toolbarUIState3;
                        confirmBookingUIStateFactory$create$1.L$4 = journeyDetailsUiState2;
                        confirmBookingUIStateFactory$create$1.L$5 = str4;
                        confirmBookingUIStateFactory$create$1.L$6 = productBannerUIState;
                        confirmBookingUIStateFactory$create$1.L$7 = arrayList4;
                        confirmBookingUIStateFactory$create$1.L$8 = chaloTextStyleHelper17;
                        confirmBookingUIStateFactory$create$1.label = 6;
                        objB6 = stringProvider.b(StringEnum.TOTAL, new Object[0], confirmBookingUIStateFactory$create$1);
                        obj7 = obj114;
                        if (objB6 == obj7) {
                            return obj7;
                        }
                        list8 = arrayList4;
                        str6 = str4;
                        productBannerUIState2 = productBannerUIState;
                        chaloTextStyleHelper9 = chaloTextStyleHelper17;
                        confirmBookingScreenDataState9 = confirmBookingScreenDataState7;
                        obj8 = objB6;
                        str7 = str6;
                        fareLineUiState = new FareLineUiState(ChaloTextStyleHelper.c(chaloTextStyleHelper9, (String) obj8, null, null, null, null, null, WebSocketProtocol.PAYLOAD_SHORT), ChaloTextStyleHelper.c(chaloTextStyleHelper17, str6, null, null, UIFontWeight.Bold, null, null, FacebookMediationAdapter.ERROR_FAILED_TO_PRESENT_AD));
                        confirmBookingUIStateFactory$create$1.L$0 = confirmBookingScreenDataState9;
                        confirmBookingUIStateFactory$create$1.L$1 = function6;
                        confirmBookingUIStateFactory$create$1.L$2 = loadingDialogUIState4;
                        confirmBookingUIStateFactory$create$1.L$3 = toolbarUIState3;
                        confirmBookingUIStateFactory$create$1.L$4 = journeyDetailsUiState2;
                        confirmBookingUIStateFactory$create$1.L$5 = str7;
                        confirmBookingUIStateFactory$create$1.L$6 = productBannerUIState2;
                        confirmBookingUIStateFactory$create$1.L$7 = list8;
                        confirmBookingUIStateFactory$create$1.L$8 = fareLineUiState;
                        confirmBookingUIStateFactory$create$1.L$9 = chaloTextStyleHelper17;
                        confirmBookingUIStateFactory$create$1.label = 7;
                        objB7 = stringProvider.b(StringEnum.PRICE_DETAILS, new Object[0], confirmBookingUIStateFactory$create$1);
                        if (objB7 == obj7) {
                            return obj7;
                        }
                        fareLineUiState2 = fareLineUiState;
                        chaloTextStyleHelper10 = chaloTextStyleHelper17;
                        confirmBookingScreenDataState10 = confirmBookingScreenDataState9;
                        function7 = function6;
                        loadingDialogUIState5 = loadingDialogUIState4;
                        journeyDetailsUiState3 = journeyDetailsUiState2;
                        str8 = str7;
                        TextUIState.ChaloTextUIState chaloTextUIStateA7 = ChaloTextStyleHelper.a(chaloTextStyleHelper10, (String) objB7, null, UIFontWeight.Bold, null, FacebookMediationAdapter.ERROR_FAILED_TO_PRESENT_AD);
                        if (list8 == null) {
                            list8 = EmptyList.f17557a;
                        }
                        priceDetailsUiState = new PriceDetailsUiState(chaloTextUIStateA7, list8, fareLineUiState2, productBannerUIState2);
                        list9 = confirmBookingScreenDataState10.j;
                        if (list9 != null) {
                            if (list9.isEmpty()) {
                                list9 = null;
                            }
                            if (list9 != null) {
                                List listX5 = CollectionsKt.x0(list9, 3);
                                arrayList5 = new ArrayList(CollectionsKt.v(listX5, 10));
                                it3 = listX5.iterator();
                                i2 = 0;
                                while (it3.hasNext()) {
                                    next = it3.next();
                                    i3 = i2 + 1;
                                    if (i2 < 0) {
                                        CollectionsKt.z0();
                                        throw null;
                                    }
                                    arrayList5.add(ChaloTextStyleHelper.c(chaloTextStyleHelper17, i3 + ". " + ((String) next), null, null, null, null, null, WebSocketProtocol.PAYLOAD_SHORT));
                                    it3 = it3;
                                    i2 = i3;
                                }
                                chaloTextStyleHelper12 = chaloTextStyleHelper17;
                                confirmBookingUIStateFactory$create$1.L$0 = confirmBookingScreenDataState10;
                                confirmBookingUIStateFactory$create$1.L$1 = function7;
                                confirmBookingUIStateFactory$create$1.L$2 = loadingDialogUIState5;
                                confirmBookingUIStateFactory$create$1.L$3 = toolbarUIState3;
                                confirmBookingUIStateFactory$create$1.L$4 = journeyDetailsUiState3;
                                confirmBookingUIStateFactory$create$1.L$5 = str8;
                                confirmBookingUIStateFactory$create$1.L$6 = priceDetailsUiState;
                                confirmBookingUIStateFactory$create$1.L$7 = arrayList5;
                                confirmBookingUIStateFactory$create$1.L$8 = chaloTextStyleHelper12;
                                confirmBookingUIStateFactory$create$1.L$9 = null;
                                confirmBookingUIStateFactory$create$1.label = 8;
                                objB8 = stringProvider.b(StringEnum.TERMS_AND_CONDITIONS, new Object[0], confirmBookingUIStateFactory$create$1);
                                if (objB8 == obj7) {
                                    return obj7;
                                }
                                chaloTextStyleHelper13 = chaloTextStyleHelper12;
                                str10 = str8;
                                journeyDetailsUiState5 = journeyDetailsUiState3;
                                list10 = arrayList5;
                                chaloTextUIStateA = ChaloTextStyleHelper.a(chaloTextStyleHelper13, (String) objB8, null, UIFontWeight.Bold, null, FacebookMediationAdapter.ERROR_FAILED_TO_PRESENT_AD);
                                styledTextDataUIStateArr = new StyledTextDataUIState[2];
                                chaloTextStyleHelper11 = chaloTextStyleHelper12;
                                confirmBookingUIStateFactory$create$1.L$0 = confirmBookingScreenDataState10;
                                confirmBookingUIStateFactory$create$1.L$1 = function7;
                                confirmBookingUIStateFactory$create$1.L$2 = loadingDialogUIState5;
                                confirmBookingUIStateFactory$create$1.L$3 = toolbarUIState3;
                                confirmBookingUIStateFactory$create$1.L$4 = journeyDetailsUiState5;
                                confirmBookingUIStateFactory$create$1.L$5 = str10;
                                confirmBookingUIStateFactory$create$1.L$6 = priceDetailsUiState;
                                confirmBookingUIStateFactory$create$1.L$7 = styledTextDataUIStateArr;
                                confirmBookingUIStateFactory$create$1.L$8 = chaloTextUIStateA;
                                confirmBookingUIStateFactory$create$1.L$9 = list10;
                                confirmBookingUIStateFactory$create$1.L$10 = styledTextDataUIStateArr;
                                confirmBookingUIStateFactory$create$1.I$0 = 0;
                                confirmBookingUIStateFactory$create$1.label = 9;
                                objB9 = stringProvider.b(StringEnum.ALL_TNC_PREFIX, new Object[0], confirmBookingUIStateFactory$create$1);
                                if (objB9 == obj7) {
                                    return obj7;
                                }
                                styledTextDataUIStateArr2 = styledTextDataUIStateArr;
                                toolbarUIState5 = toolbarUIState3;
                                priceDetailsUiState3 = priceDetailsUiState;
                                loadingDialogUIState7 = loadingDialogUIState5;
                                i4 = 0;
                                journeyDetailsUiState6 = journeyDetailsUiState5;
                                str11 = str10;
                                chaloTextUIState = chaloTextUIStateA;
                                obj10 = objB9;
                                list11 = list10;
                                styledTextDataUIStateArr2[i4] = new StyledTextDataUIState(obj10 + " ", null, null, UITextStyle.BodySmall, null, null, null, 1014);
                                confirmBookingUIStateFactory$create$1.L$0 = confirmBookingScreenDataState10;
                                confirmBookingUIStateFactory$create$1.L$1 = function7;
                                confirmBookingUIStateFactory$create$1.L$2 = loadingDialogUIState7;
                                confirmBookingUIStateFactory$create$1.L$3 = toolbarUIState5;
                                confirmBookingUIStateFactory$create$1.L$4 = journeyDetailsUiState6;
                                confirmBookingUIStateFactory$create$1.L$5 = str11;
                                confirmBookingUIStateFactory$create$1.L$6 = priceDetailsUiState3;
                                confirmBookingUIStateFactory$create$1.L$7 = styledTextDataUIStateArr;
                                confirmBookingUIStateFactory$create$1.L$8 = chaloTextUIState;
                                confirmBookingUIStateFactory$create$1.L$9 = list11;
                                confirmBookingUIStateFactory$create$1.L$10 = styledTextDataUIStateArr;
                                confirmBookingUIStateFactory$create$1.I$0 = 1;
                                confirmBookingUIStateFactory$create$1.label = 10;
                                objB10 = stringProvider.b(StringEnum.TNC_CLICKABLE_TEXT, new Object[0], confirmBookingUIStateFactory$create$1);
                                if (objB10 == obj7) {
                                    return obj7;
                                }
                                styledTextDataUIStateArr3 = styledTextDataUIStateArr;
                                str12 = str11;
                                loadingDialogUIState8 = loadingDialogUIState7;
                                confirmBookingScreenDataState12 = confirmBookingScreenDataState10;
                                toolbarUIState6 = toolbarUIState5;
                                i5 = 1;
                                chaloTextUIState2 = chaloTextUIState;
                                function8 = function7;
                                list12 = list11;
                                styledTextDataUIStateArr4 = styledTextDataUIStateArr3;
                                priceDetailsUiState4 = priceDetailsUiState3;
                                journeyDetailsUiState7 = journeyDetailsUiState6;
                                String str115 = (String) objB10;
                                obj9 = obj7;
                                tnCDialogUIState = null;
                                styledTextDataUIStateArr4[i5] = new StyledTextDataUIState(str115, orangePrimary, UIFontWeight.Bold, UITextStyle.BodySmall, null, null, new StyledTextClickHandler() { // from class: app.chalo.metro.ui.confirmbooking.uistate.ConfirmBookingUIStateFactory$create$termsAndConditionsUiState$2$1
                                    @Override // app.chalo.uistate.text.StyledTextClickHandler
                                    public final void a() {
                                        function8.invoke(ConfirmBookingScreenViewIntent.OnTermsAndConditionsClicked.f5468a);
                                    }

                                    @Override // app.chalo.uistate.text.StyledTextClickHandler
                                    /* JADX INFO: renamed from: b */
                                    public final String getB() {
                                        return "TNC_CLICKABLE_TEXT";
                                    }

                                    @Override // app.chalo.uistate.text.StyledTextClickHandler
                                    /* JADX INFO: renamed from: getTag */
                                    public final String getF10085a() {
                                        return "TNC_CLICKABLE_TEXT";
                                    }
                                }, 496);
                                termsAndConditionsUiState = new TermsAndConditionsUiState(chaloTextUIState2, list12, new TextUIState.StyledTextUIState(CollectionsKt.S(styledTextDataUIStateArr3), null, null, 30));
                                function7 = function8;
                                confirmBookingScreenDataState11 = confirmBookingScreenDataState12;
                                priceDetailsUiState2 = priceDetailsUiState4;
                                str9 = str12;
                                journeyDetailsUiState4 = journeyDetailsUiState7;
                                loadingDialogUIState6 = loadingDialogUIState8;
                                toolbarUIState4 = toolbarUIState6;
                            }
                            z = confirmBookingScreenDataState11.m;
                            List list1113 = confirmBookingScreenDataState11.j;
                            if (z) {
                                break;
                            }
                            obj11 = obj9;
                            JourneyDetailsUiState journeyDetailsUiState114 = journeyDetailsUiState4;
                            priceDetailsUiState5 = priceDetailsUiState2;
                            loadingDialogUIState9 = loadingDialogUIState6;
                            toolbarUIState7 = toolbarUIState4;
                            journeyDetailsUiState8 = journeyDetailsUiState114;
                            Function1 function117 = function7;
                            confirmBookingScreenDataState13 = confirmBookingScreenDataState11;
                            function9 = function117;
                            tnCDialogUIState2 = tnCDialogUIState;
                            StringEnum stringEnum12 = StringEnum.FARE_DETAILS_PAY;
                            Object[] objArr12 = {str9};
                            confirmBookingUIStateFactory$create$1.L$0 = confirmBookingScreenDataState13;
                            confirmBookingUIStateFactory$create$1.L$1 = function9;
                            confirmBookingUIStateFactory$create$1.L$2 = loadingDialogUIState9;
                            confirmBookingUIStateFactory$create$1.L$3 = toolbarUIState7;
                            confirmBookingUIStateFactory$create$1.L$4 = journeyDetailsUiState8;
                            confirmBookingUIStateFactory$create$1.L$5 = priceDetailsUiState5;
                            confirmBookingUIStateFactory$create$1.L$6 = termsAndConditionsUiState;
                            confirmBookingUIStateFactory$create$1.L$7 = tnCDialogUIState2;
                            buttonUIStateFactory = ButtonUIStateFactory.f9921a;
                            confirmBookingUIStateFactory$create$1.L$8 = buttonUIStateFactory;
                            confirmBookingUIStateFactory$create$1.L$9 = tnCDialogUIState;
                            confirmBookingUIStateFactory$create$1.L$10 = tnCDialogUIState;
                            confirmBookingUIStateFactory$create$1.label = 12;
                            objB11 = stringProvider.b(stringEnum12, objArr12, confirmBookingUIStateFactory$create$1);
                            if (objB11 != obj11) {
                                priceDetailsUiState6 = priceDetailsUiState5;
                                termsAndConditionsUiState2 = termsAndConditionsUiState;
                                confirmBookingScreenDataState14 = confirmBookingScreenDataState13;
                                loadingDialogUIState10 = loadingDialogUIState9;
                                buttonUIStateFactory2 = buttonUIStateFactory;
                                tnCDialogUIState3 = tnCDialogUIState2;
                                function10 = function9;
                                confirmBookingScreenDataState15 = confirmBookingScreenDataState14;
                                journeyDetailsUiState9 = journeyDetailsUiState8;
                                tnCDialogUIState4 = tnCDialogUIState3;
                                loadingDialogUIState11 = loadingDialogUIState10;
                                stringProvider2 = stringProvider;
                                obj13 = obj11;
                                toolbarUIState8 = toolbarUIState7;
                                buttonUIStateG = ButtonUIStateFactory.g(buttonUIStateFactory2, (String) objB11, new bp(function10, 15), null, UIShape.d, true, 0.0f, 36);
                                if (confirmBookingScreenDataState15.l) {
                                    confirmBookingUIStateFactory$create$1.L$0 = confirmBookingScreenDataState15;
                                    confirmBookingUIStateFactory$create$1.L$1 = function10;
                                    confirmBookingUIStateFactory$create$1.L$2 = loadingDialogUIState11;
                                    confirmBookingUIStateFactory$create$1.L$3 = toolbarUIState8;
                                    confirmBookingUIStateFactory$create$1.L$4 = journeyDetailsUiState9;
                                    confirmBookingUIStateFactory$create$1.L$5 = priceDetailsUiState6;
                                    confirmBookingUIStateFactory$create$1.L$6 = termsAndConditionsUiState2;
                                    confirmBookingUIStateFactory$create$1.L$7 = tnCDialogUIState4;
                                    confirmBookingUIStateFactory$create$1.L$8 = buttonUIStateG;
                                    chaloTextStyleHelper14 = chaloTextStyleHelper11;
                                    confirmBookingUIStateFactory$create$1.L$9 = chaloTextStyleHelper14;
                                    confirmBookingUIStateFactory$create$1.label = 13;
                                    stringProvider3 = stringProvider2;
                                    objB12 = stringProvider3.b(StringEnum.SOMETHING_WENT_WRONG, new Object[0], confirmBookingUIStateFactory$create$1);
                                    obj14 = obj13;
                                    if (objB12 == obj14) {
                                        return obj14;
                                    }
                                    journeyDetailsUiState11 = journeyDetailsUiState9;
                                    priceDetailsUiState8 = priceDetailsUiState6;
                                    function11 = function10;
                                    confirmBookingScreenDataState17 = confirmBookingScreenDataState15;
                                    obj15 = objB12;
                                    tnCDialogUIState6 = tnCDialogUIState4;
                                    chaloTextStyleHelper15 = chaloTextStyleHelper14;
                                    chaloTextUIStateB = ChaloTextStyleHelper.b(chaloTextStyleHelper15, (String) obj15, ChaloColorToken.White.f9870a, 0, null, null, null, null, 124);
                                    confirmBookingUIStateFactory$create$1.L$0 = confirmBookingScreenDataState17;
                                    confirmBookingUIStateFactory$create$1.L$1 = function11;
                                    confirmBookingUIStateFactory$create$1.L$2 = loadingDialogUIState11;
                                    confirmBookingUIStateFactory$create$1.L$3 = toolbarUIState8;
                                    confirmBookingUIStateFactory$create$1.L$4 = journeyDetailsUiState11;
                                    confirmBookingUIStateFactory$create$1.L$5 = priceDetailsUiState8;
                                    confirmBookingUIStateFactory$create$1.L$6 = termsAndConditionsUiState2;
                                    confirmBookingUIStateFactory$create$1.L$7 = tnCDialogUIState6;
                                    confirmBookingUIStateFactory$create$1.L$8 = buttonUIStateG;
                                    confirmBookingUIStateFactory$create$1.L$9 = chaloTextUIStateB;
                                    confirmBookingUIStateFactory$create$1.L$10 = chaloTextStyleHelper14;
                                    confirmBookingScreenDataState18 = confirmBookingScreenDataState17;
                                    confirmBookingUIStateFactory$create$1.label = 14;
                                    objB13 = stringProvider3.b(StringEnum.RETRY, new Object[0], confirmBookingUIStateFactory$create$1);
                                    if (objB13 == obj14) {
                                        return obj14;
                                    }
                                    toolbarUIState10 = toolbarUIState8;
                                    termsAndConditionsUiState4 = termsAndConditionsUiState2;
                                    confirmBookingScreenDataState19 = confirmBookingScreenDataState18;
                                    function12 = function11;
                                    chaloTextUIState3 = chaloTextUIStateB;
                                    obj16 = objB13;
                                    priceDetailsUiState9 = priceDetailsUiState8;
                                    chaloTextStyleHelper16 = chaloTextStyleHelper14;
                                    loadingDialogUIState13 = loadingDialogUIState11;
                                    journeyDetailsUiState12 = journeyDetailsUiState11;
                                    ChaloColorToken.OrangePrimary orangePrimary13 = orangePrimary;
                                    priceDetailsUiState7 = priceDetailsUiState9;
                                    tnCDialogUIState5 = tnCDialogUIState6;
                                    termsAndConditionsUiState3 = termsAndConditionsUiState4;
                                    snackbarUIState = new SnackbarUIState(chaloTextUIState3, ChaloTextStyleHelper.b(chaloTextStyleHelper16, (String) obj16, orangePrimary13, 0, null, UIFontWeight.SemiBold, null, null, 108), UiEventHandler.Companion.a(new bp(function12, 16)));
                                    journeyDetailsUiState10 = journeyDetailsUiState12;
                                    toolbarUIState9 = toolbarUIState10;
                                    loadingDialogUIState12 = loadingDialogUIState13;
                                    confirmBookingScreenDataState16 = confirmBookingScreenDataState19;
                                } else {
                                    confirmBookingScreenDataState16 = confirmBookingScreenDataState15;
                                    journeyDetailsUiState10 = journeyDetailsUiState9;
                                    tnCDialogUIState5 = tnCDialogUIState4;
                                    loadingDialogUIState12 = loadingDialogUIState11;
                                    toolbarUIState9 = toolbarUIState8;
                                    termsAndConditionsUiState3 = termsAndConditionsUiState2;
                                    priceDetailsUiState7 = priceDetailsUiState6;
                                    snackbarUIState = null;
                                }
                                ButtonUIState buttonUIState12 = buttonUIStateG;
                                boolean z13 = confirmBookingScreenDataState16.k;
                                if (confirmBookingScreenDataState16.c) {
                                    loadingDialogUIState14 = loadingDialogUIState12;
                                } else {
                                    loadingDialogUIState14 = null;
                                }
                                return new ConfirmBookingScreenViewState(toolbarUIState9, journeyDetailsUiState10, priceDetailsUiState7, termsAndConditionsUiState3, tnCDialogUIState5, buttonUIState12, snackbarUIState, z13, loadingDialogUIState14);
                            }
                            return obj11;
                        }
                        obj9 = obj7;
                        chaloTextStyleHelper11 = chaloTextStyleHelper17;
                        tnCDialogUIState = null;
                        termsAndConditionsUiState = null;
                        journeyDetailsUiState4 = journeyDetailsUiState3;
                        str9 = str8;
                        toolbarUIState4 = toolbarUIState3;
                        priceDetailsUiState2 = priceDetailsUiState;
                        loadingDialogUIState6 = loadingDialogUIState5;
                        confirmBookingScreenDataState11 = confirmBookingScreenDataState10;
                        z = confirmBookingScreenDataState11.m;
                        List list1114 = confirmBookingScreenDataState11.j;
                        if (z) {
                            break;
                        }
                        obj11 = obj9;
                        JourneyDetailsUiState journeyDetailsUiState115 = journeyDetailsUiState4;
                        priceDetailsUiState5 = priceDetailsUiState2;
                        loadingDialogUIState9 = loadingDialogUIState6;
                        toolbarUIState7 = toolbarUIState4;
                        journeyDetailsUiState8 = journeyDetailsUiState115;
                        Function1 function118 = function7;
                        confirmBookingScreenDataState13 = confirmBookingScreenDataState11;
                        function9 = function118;
                        tnCDialogUIState2 = tnCDialogUIState;
                        StringEnum stringEnum13 = StringEnum.FARE_DETAILS_PAY;
                        Object[] objArr13 = {str9};
                        confirmBookingUIStateFactory$create$1.L$0 = confirmBookingScreenDataState13;
                        confirmBookingUIStateFactory$create$1.L$1 = function9;
                        confirmBookingUIStateFactory$create$1.L$2 = loadingDialogUIState9;
                        confirmBookingUIStateFactory$create$1.L$3 = toolbarUIState7;
                        confirmBookingUIStateFactory$create$1.L$4 = journeyDetailsUiState8;
                        confirmBookingUIStateFactory$create$1.L$5 = priceDetailsUiState5;
                        confirmBookingUIStateFactory$create$1.L$6 = termsAndConditionsUiState;
                        confirmBookingUIStateFactory$create$1.L$7 = tnCDialogUIState2;
                        buttonUIStateFactory = ButtonUIStateFactory.f9921a;
                        confirmBookingUIStateFactory$create$1.L$8 = buttonUIStateFactory;
                        confirmBookingUIStateFactory$create$1.L$9 = tnCDialogUIState;
                        confirmBookingUIStateFactory$create$1.L$10 = tnCDialogUIState;
                        confirmBookingUIStateFactory$create$1.label = 12;
                        objB11 = stringProvider.b(stringEnum13, objArr13, confirmBookingUIStateFactory$create$1);
                        if (objB11 != obj11) {
                            priceDetailsUiState6 = priceDetailsUiState5;
                            termsAndConditionsUiState2 = termsAndConditionsUiState;
                            confirmBookingScreenDataState14 = confirmBookingScreenDataState13;
                            loadingDialogUIState10 = loadingDialogUIState9;
                            buttonUIStateFactory2 = buttonUIStateFactory;
                            tnCDialogUIState3 = tnCDialogUIState2;
                            function10 = function9;
                            confirmBookingScreenDataState15 = confirmBookingScreenDataState14;
                            journeyDetailsUiState9 = journeyDetailsUiState8;
                            tnCDialogUIState4 = tnCDialogUIState3;
                            loadingDialogUIState11 = loadingDialogUIState10;
                            stringProvider2 = stringProvider;
                            obj13 = obj11;
                            toolbarUIState8 = toolbarUIState7;
                            buttonUIStateG = ButtonUIStateFactory.g(buttonUIStateFactory2, (String) objB11, new bp(function10, 15), null, UIShape.d, true, 0.0f, 36);
                            if (confirmBookingScreenDataState15.l) {
                                confirmBookingUIStateFactory$create$1.L$0 = confirmBookingScreenDataState15;
                                confirmBookingUIStateFactory$create$1.L$1 = function10;
                                confirmBookingUIStateFactory$create$1.L$2 = loadingDialogUIState11;
                                confirmBookingUIStateFactory$create$1.L$3 = toolbarUIState8;
                                confirmBookingUIStateFactory$create$1.L$4 = journeyDetailsUiState9;
                                confirmBookingUIStateFactory$create$1.L$5 = priceDetailsUiState6;
                                confirmBookingUIStateFactory$create$1.L$6 = termsAndConditionsUiState2;
                                confirmBookingUIStateFactory$create$1.L$7 = tnCDialogUIState4;
                                confirmBookingUIStateFactory$create$1.L$8 = buttonUIStateG;
                                chaloTextStyleHelper14 = chaloTextStyleHelper11;
                                confirmBookingUIStateFactory$create$1.L$9 = chaloTextStyleHelper14;
                                confirmBookingUIStateFactory$create$1.label = 13;
                                stringProvider3 = stringProvider2;
                                objB12 = stringProvider3.b(StringEnum.SOMETHING_WENT_WRONG, new Object[0], confirmBookingUIStateFactory$create$1);
                                obj14 = obj13;
                                if (objB12 == obj14) {
                                    return obj14;
                                }
                                journeyDetailsUiState11 = journeyDetailsUiState9;
                                priceDetailsUiState8 = priceDetailsUiState6;
                                function11 = function10;
                                confirmBookingScreenDataState17 = confirmBookingScreenDataState15;
                                obj15 = objB12;
                                tnCDialogUIState6 = tnCDialogUIState4;
                                chaloTextStyleHelper15 = chaloTextStyleHelper14;
                                chaloTextUIStateB = ChaloTextStyleHelper.b(chaloTextStyleHelper15, (String) obj15, ChaloColorToken.White.f9870a, 0, null, null, null, null, 124);
                                confirmBookingUIStateFactory$create$1.L$0 = confirmBookingScreenDataState17;
                                confirmBookingUIStateFactory$create$1.L$1 = function11;
                                confirmBookingUIStateFactory$create$1.L$2 = loadingDialogUIState11;
                                confirmBookingUIStateFactory$create$1.L$3 = toolbarUIState8;
                                confirmBookingUIStateFactory$create$1.L$4 = journeyDetailsUiState11;
                                confirmBookingUIStateFactory$create$1.L$5 = priceDetailsUiState8;
                                confirmBookingUIStateFactory$create$1.L$6 = termsAndConditionsUiState2;
                                confirmBookingUIStateFactory$create$1.L$7 = tnCDialogUIState6;
                                confirmBookingUIStateFactory$create$1.L$8 = buttonUIStateG;
                                confirmBookingUIStateFactory$create$1.L$9 = chaloTextUIStateB;
                                confirmBookingUIStateFactory$create$1.L$10 = chaloTextStyleHelper14;
                                confirmBookingScreenDataState18 = confirmBookingScreenDataState17;
                                confirmBookingUIStateFactory$create$1.label = 14;
                                objB13 = stringProvider3.b(StringEnum.RETRY, new Object[0], confirmBookingUIStateFactory$create$1);
                                if (objB13 == obj14) {
                                    return obj14;
                                }
                                toolbarUIState10 = toolbarUIState8;
                                termsAndConditionsUiState4 = termsAndConditionsUiState2;
                                confirmBookingScreenDataState19 = confirmBookingScreenDataState18;
                                function12 = function11;
                                chaloTextUIState3 = chaloTextUIStateB;
                                obj16 = objB13;
                                priceDetailsUiState9 = priceDetailsUiState8;
                                chaloTextStyleHelper16 = chaloTextStyleHelper14;
                                loadingDialogUIState13 = loadingDialogUIState11;
                                journeyDetailsUiState12 = journeyDetailsUiState11;
                                ChaloColorToken.OrangePrimary orangePrimary14 = orangePrimary;
                                priceDetailsUiState7 = priceDetailsUiState9;
                                tnCDialogUIState5 = tnCDialogUIState6;
                                termsAndConditionsUiState3 = termsAndConditionsUiState4;
                                snackbarUIState = new SnackbarUIState(chaloTextUIState3, ChaloTextStyleHelper.b(chaloTextStyleHelper16, (String) obj16, orangePrimary14, 0, null, UIFontWeight.SemiBold, null, null, 108), UiEventHandler.Companion.a(new bp(function12, 16)));
                                journeyDetailsUiState10 = journeyDetailsUiState12;
                                toolbarUIState9 = toolbarUIState10;
                                loadingDialogUIState12 = loadingDialogUIState13;
                                confirmBookingScreenDataState16 = confirmBookingScreenDataState19;
                            } else {
                                confirmBookingScreenDataState16 = confirmBookingScreenDataState15;
                                journeyDetailsUiState10 = journeyDetailsUiState9;
                                tnCDialogUIState5 = tnCDialogUIState4;
                                loadingDialogUIState12 = loadingDialogUIState11;
                                toolbarUIState9 = toolbarUIState8;
                                termsAndConditionsUiState3 = termsAndConditionsUiState2;
                                priceDetailsUiState7 = priceDetailsUiState6;
                                snackbarUIState = null;
                            }
                            ButtonUIState buttonUIState13 = buttonUIStateG;
                            boolean z14 = confirmBookingScreenDataState16.k;
                            if (confirmBookingScreenDataState16.c) {
                                loadingDialogUIState14 = loadingDialogUIState12;
                            } else {
                                loadingDialogUIState14 = null;
                            }
                            return new ConfirmBookingScreenViewState(toolbarUIState9, journeyDetailsUiState10, priceDetailsUiState7, termsAndConditionsUiState3, tnCDialogUIState5, buttonUIState13, snackbarUIState, z14, loadingDialogUIState14);
                        }
                        return obj11;
                    }
                }
                return obj17;
            case 3:
                ChaloTextStyleHelper chaloTextStyleHelper30 = (ChaloTextStyleHelper) confirmBookingUIStateFactory$create$1.L$6;
                list2 = (List) confirmBookingUIStateFactory$create$1.L$5;
                toolbarUIState2 = (ToolbarUIState) confirmBookingUIStateFactory$create$1.L$4;
                iconType2 = (IconType) confirmBookingUIStateFactory$create$1.L$3;
                loadingDialogUIState2 = (LoadingDialogUIState) confirmBookingUIStateFactory$create$1.L$2;
                Function1 function21 = (Function1) confirmBookingUIStateFactory$create$1.L$1;
                confirmBookingScreenDataState4 = (ConfirmBookingScreenDataState) confirmBookingUIStateFactory$create$1.L$0;
                ResultKt.b(obj16);
                str13 = "";
                orangePrimary = orangePrimary;
                function4 = function21;
                stringProvider = stringProvider4;
                chaloTextStyleHelper3 = chaloTextStyleHelper17;
                chaloTextStyleHelper4 = chaloTextStyleHelper30;
                obj2 = obj16;
                confirmBookingScreenDataState5 = confirmBookingScreenDataState4;
                TextUIState.ChaloTextUIState chaloTextUIStateC7 = ChaloTextStyleHelper.c(chaloTextStyleHelper4, (String) obj2, shadyGray, null, null, null, null, 124);
                confirmationScreenTripDetails = confirmBookingScreenDataState5.f;
                if (confirmationScreenTripDetails != null) {
                    str = str13;
                } else {
                    str = str13;
                }
                ChaloTextStyleHelper chaloTextStyleHelper114 = chaloTextStyleHelper3;
                chaloTextStyleHelper5 = chaloTextStyleHelper114;
                iconType3 = iconType2;
                stopDetailUiState = new StopDetailUiState(new ImageUIState(iconType3, (String) null, (ChaloColorToken) null, new ImageUISize(Dp.m7276boximpl(ChaloThemeHelper.a().i), Dp.m7276boximpl(ChaloThemeHelper.a().i)), (UIContentScale) null, 0.0f, (UiEventHandler) null, 246), chaloTextUIStateC7, ChaloTextStyleHelper.b(chaloTextStyleHelper114, str, null, 0, null, null, null, null, WebSocketProtocol.PAYLOAD_SHORT));
                confirmBookingUIStateFactory$create$1.L$0 = confirmBookingScreenDataState5;
                confirmBookingUIStateFactory$create$1.L$1 = function4;
                confirmBookingUIStateFactory$create$1.L$2 = loadingDialogUIState2;
                confirmBookingUIStateFactory$create$1.L$3 = iconType3;
                confirmBookingUIStateFactory$create$1.L$4 = toolbarUIState2;
                confirmBookingUIStateFactory$create$1.L$5 = list2;
                confirmBookingUIStateFactory$create$1.L$6 = stopDetailUiState;
                confirmBookingUIStateFactory$create$1.L$7 = chaloTextStyleHelper5;
                confirmBookingUIStateFactory$create$1.label = 4;
                objB4 = stringProvider.b(StringEnum.EXIT_STOP, new Object[0], confirmBookingUIStateFactory$create$1);
                if (objB4 != obj17) {
                    ToolbarUIState toolbarUIState14 = toolbarUIState2;
                    list3 = list2;
                    stopDetailUiState2 = stopDetailUiState;
                    toolbarUIState3 = toolbarUIState14;
                    confirmBookingScreenDataState6 = confirmBookingScreenDataState5;
                    obj3 = objB4;
                    function5 = function4;
                    loadingDialogUIState3 = loadingDialogUIState2;
                    iconType4 = iconType3;
                    chaloTextStyleHelper6 = chaloTextStyleHelper5;
                    String str116 = (String) obj3;
                    ChaloTextStyleHelper chaloTextStyleHelper211 = chaloTextStyleHelper5;
                    confirmBookingScreenDataState7 = confirmBookingScreenDataState6;
                    TextUIState.ChaloTextUIState chaloTextUIStateC8 = ChaloTextStyleHelper.c(chaloTextStyleHelper6, str116, shadyGray, null, null, null, null, 124);
                    confirmationScreenTripDetails2 = confirmBookingScreenDataState7.f;
                    if (confirmationScreenTripDetails2 != null) {
                        str3 = str13;
                    } else {
                        str3 = str13;
                    }
                    list4 = list3;
                    chaloTextStyleHelper7 = chaloTextStyleHelper211;
                    StopDetailUiState stopDetailUiState6 = new StopDetailUiState(new ImageUIState(iconType4, (String) null, (ChaloColorToken) null, new ImageUISize(Dp.m7276boximpl(ChaloThemeHelper.a().i), Dp.m7276boximpl(ChaloThemeHelper.a().i)), (UIContentScale) null, 0.0f, (UiEventHandler) null, 246), chaloTextUIStateC8, ChaloTextStyleHelper.b(chaloTextStyleHelper211, str3, null, 0, null, null, null, null, WebSocketProtocol.PAYLOAD_SHORT));
                    if (list4 == null) {
                        list5 = EmptyList.f17557a;
                    } else {
                        list5 = list4;
                    }
                    journeyDetailsUiState = new JourneyDetailsUiState(stopDetailUiState2, stopDetailUiState6, list5, new DividerUIState(0.0f, null, null, 7));
                    l = confirmBookingScreenDataState7.h;
                    if (l != null) {
                        jLongValue = l.longValue();
                    } else {
                        jLongValue = 0;
                    }
                    strA = currencyFeature.a(jLongValue, CurrencyRoundOffLogic.ROUND_OFF_LOGIC_NO_ROUNDING);
                    list6 = confirmBookingScreenDataState7.i;
                    if (list6 != null) {
                        arrayList3 = new ArrayList();
                        while (r12.hasNext()) {
                            if (((FareBreakupAppModel) obj18).b == FareBreakupOperationType.SUBTRACTION) {
                                arrayList3.add(obj18);
                            }
                        }
                        size = arrayList3.size();
                        obj4 = obj17;
                        str4 = strA;
                        j = 0;
                        while (i < size) {
                            j += ((FareBreakupAppModel) arrayList3.get(i)).c;
                            size = size;
                        }
                        l2 = new Long(j);
                        if (l2.longValue() <= 0) {
                            l2 = null;
                        }
                        if (l2 != null) {
                        }
                        if (strA2 != null) {
                            productBannerSpec = new ProductBannerSpec();
                            confirmBookingUIStateFactory$create$1.L$0 = confirmBookingScreenDataState7;
                            confirmBookingUIStateFactory$create$1.L$1 = function5;
                            confirmBookingUIStateFactory$create$1.L$2 = loadingDialogUIState3;
                            confirmBookingUIStateFactory$create$1.L$3 = toolbarUIState3;
                            confirmBookingUIStateFactory$create$1.L$4 = journeyDetailsUiState;
                            confirmBookingUIStateFactory$create$1.L$5 = str4;
                            confirmBookingUIStateFactory$create$1.L$6 = chaloTextStyleHelper7;
                            confirmBookingUIStateFactory$create$1.L$7 = productBannerSpec;
                            confirmBookingUIStateFactory$create$1.label = 5;
                            objB5 = stringProvider.b(StringEnum.DISCOUNT_TEXT_COPY, new Object[]{strA2}, confirmBookingUIStateFactory$create$1);
                            obj5 = obj4;
                            if (objB5 == obj5) {
                                return obj5;
                            }
                            function6 = function5;
                            confirmBookingScreenDataState8 = confirmBookingScreenDataState7;
                            obj6 = objB5;
                            loadingDialogUIState4 = loadingDialogUIState3;
                            journeyDetailsUiState2 = journeyDetailsUiState;
                            chaloTextStyleHelper8 = chaloTextStyleHelper7;
                            productBannerUIState = new ProductBannerUIState(productBannerSpec, ChaloTextStyleHelper.c(chaloTextStyleHelper8, (String) obj6, null, null, UIFontWeight.SemiBold, null, null, FacebookMediationAdapter.ERROR_FAILED_TO_PRESENT_AD), new ImageUIState(IconType.DISCOUNT_GREEN, (String) null, (ChaloColorToken) null, (ImageUISize) null, (UIContentScale) null, 0.0f, (UiEventHandler) null, 254));
                            confirmBookingScreenDataState7 = confirmBookingScreenDataState8;
                        } else {
                            obj5 = obj4;
                            loadingDialogUIState4 = loadingDialogUIState3;
                            function6 = function5;
                            journeyDetailsUiState2 = journeyDetailsUiState;
                            productBannerUIState = null;
                        }
                        list7 = confirmBookingScreenDataState7.i;
                        if (list7 != null) {
                            List list1115 = list7;
                            arrayList4 = new ArrayList(CollectionsKt.v(list1115, 10));
                            it2 = list1115.iterator();
                            while (it2.hasNext()) {
                                FareBreakupAppModel fareBreakupAppModel7 = (FareBreakupAppModel) it2.next();
                                FareBreakupOperationUIProperties fareBreakupOperationUIPropertiesA7 = FareBreakupOperationUIPropertiesKt.a(fareBreakupAppModel7.b, (3 & 1) != 0 ? ChaloColorToken.Black.f9759a : ChaloColorToken.AlmostBlackColor.f9756a, (3 & 2) != 0);
                                ChaloTextStyleHelper chaloTextStyleHelper212 = chaloTextStyleHelper7;
                                arrayList4.add(new FareLineUiState(ChaloTextStyleHelper.c(chaloTextStyleHelper212, fareBreakupAppModel7.f3890a, null, null, null, null, null, WebSocketProtocol.PAYLOAD_SHORT), ChaloTextStyleHelper.c(chaloTextStyleHelper212, vo1.A(fareBreakupOperationUIPropertiesA7.f8267a, currencyFeature.a(fareBreakupAppModel7.c, CurrencyRoundOffLogic.ROUND_OFF_LOGIC_NO_ROUNDING)), fareBreakupOperationUIPropertiesA7.b, null, UIFontWeight.Bold, null, null, 108)));
                                it2 = it2;
                                chaloTextStyleHelper7 = chaloTextStyleHelper212;
                                obj5 = obj5;
                            }
                        } else {
                            arrayList4 = null;
                        }
                        chaloTextStyleHelper17 = chaloTextStyleHelper7;
                        Object obj115 = obj5;
                        confirmBookingUIStateFactory$create$1.L$0 = confirmBookingScreenDataState7;
                        confirmBookingUIStateFactory$create$1.L$1 = function6;
                        confirmBookingUIStateFactory$create$1.L$2 = loadingDialogUIState4;
                        confirmBookingUIStateFactory$create$1.L$3 = toolbarUIState3;
                        confirmBookingUIStateFactory$create$1.L$4 = journeyDetailsUiState2;
                        confirmBookingUIStateFactory$create$1.L$5 = str4;
                        confirmBookingUIStateFactory$create$1.L$6 = productBannerUIState;
                        confirmBookingUIStateFactory$create$1.L$7 = arrayList4;
                        confirmBookingUIStateFactory$create$1.L$8 = chaloTextStyleHelper17;
                        confirmBookingUIStateFactory$create$1.label = 6;
                        objB6 = stringProvider.b(StringEnum.TOTAL, new Object[0], confirmBookingUIStateFactory$create$1);
                        obj7 = obj115;
                        if (objB6 == obj7) {
                            return obj7;
                        }
                        list8 = arrayList4;
                        str6 = str4;
                        productBannerUIState2 = productBannerUIState;
                        chaloTextStyleHelper9 = chaloTextStyleHelper17;
                        confirmBookingScreenDataState9 = confirmBookingScreenDataState7;
                        obj8 = objB6;
                        str7 = str6;
                        fareLineUiState = new FareLineUiState(ChaloTextStyleHelper.c(chaloTextStyleHelper9, (String) obj8, null, null, null, null, null, WebSocketProtocol.PAYLOAD_SHORT), ChaloTextStyleHelper.c(chaloTextStyleHelper17, str6, null, null, UIFontWeight.Bold, null, null, FacebookMediationAdapter.ERROR_FAILED_TO_PRESENT_AD));
                        confirmBookingUIStateFactory$create$1.L$0 = confirmBookingScreenDataState9;
                        confirmBookingUIStateFactory$create$1.L$1 = function6;
                        confirmBookingUIStateFactory$create$1.L$2 = loadingDialogUIState4;
                        confirmBookingUIStateFactory$create$1.L$3 = toolbarUIState3;
                        confirmBookingUIStateFactory$create$1.L$4 = journeyDetailsUiState2;
                        confirmBookingUIStateFactory$create$1.L$5 = str7;
                        confirmBookingUIStateFactory$create$1.L$6 = productBannerUIState2;
                        confirmBookingUIStateFactory$create$1.L$7 = list8;
                        confirmBookingUIStateFactory$create$1.L$8 = fareLineUiState;
                        confirmBookingUIStateFactory$create$1.L$9 = chaloTextStyleHelper17;
                        confirmBookingUIStateFactory$create$1.label = 7;
                        objB7 = stringProvider.b(StringEnum.PRICE_DETAILS, new Object[0], confirmBookingUIStateFactory$create$1);
                        if (objB7 == obj7) {
                            return obj7;
                        }
                        fareLineUiState2 = fareLineUiState;
                        chaloTextStyleHelper10 = chaloTextStyleHelper17;
                        confirmBookingScreenDataState10 = confirmBookingScreenDataState9;
                        function7 = function6;
                        loadingDialogUIState5 = loadingDialogUIState4;
                        journeyDetailsUiState3 = journeyDetailsUiState2;
                        str8 = str7;
                        TextUIState.ChaloTextUIState chaloTextUIStateA8 = ChaloTextStyleHelper.a(chaloTextStyleHelper10, (String) objB7, null, UIFontWeight.Bold, null, FacebookMediationAdapter.ERROR_FAILED_TO_PRESENT_AD);
                        if (list8 == null) {
                            list8 = EmptyList.f17557a;
                        }
                        priceDetailsUiState = new PriceDetailsUiState(chaloTextUIStateA8, list8, fareLineUiState2, productBannerUIState2);
                        list9 = confirmBookingScreenDataState10.j;
                        if (list9 != null) {
                            if (list9.isEmpty()) {
                                list9 = null;
                            }
                            if (list9 != null) {
                                List listX6 = CollectionsKt.x0(list9, 3);
                                arrayList5 = new ArrayList(CollectionsKt.v(listX6, 10));
                                it3 = listX6.iterator();
                                i2 = 0;
                                while (it3.hasNext()) {
                                    next = it3.next();
                                    i3 = i2 + 1;
                                    if (i2 < 0) {
                                        CollectionsKt.z0();
                                        throw null;
                                    }
                                    arrayList5.add(ChaloTextStyleHelper.c(chaloTextStyleHelper17, i3 + ". " + ((String) next), null, null, null, null, null, WebSocketProtocol.PAYLOAD_SHORT));
                                    it3 = it3;
                                    i2 = i3;
                                }
                                chaloTextStyleHelper12 = chaloTextStyleHelper17;
                                confirmBookingUIStateFactory$create$1.L$0 = confirmBookingScreenDataState10;
                                confirmBookingUIStateFactory$create$1.L$1 = function7;
                                confirmBookingUIStateFactory$create$1.L$2 = loadingDialogUIState5;
                                confirmBookingUIStateFactory$create$1.L$3 = toolbarUIState3;
                                confirmBookingUIStateFactory$create$1.L$4 = journeyDetailsUiState3;
                                confirmBookingUIStateFactory$create$1.L$5 = str8;
                                confirmBookingUIStateFactory$create$1.L$6 = priceDetailsUiState;
                                confirmBookingUIStateFactory$create$1.L$7 = arrayList5;
                                confirmBookingUIStateFactory$create$1.L$8 = chaloTextStyleHelper12;
                                confirmBookingUIStateFactory$create$1.L$9 = null;
                                confirmBookingUIStateFactory$create$1.label = 8;
                                objB8 = stringProvider.b(StringEnum.TERMS_AND_CONDITIONS, new Object[0], confirmBookingUIStateFactory$create$1);
                                if (objB8 == obj7) {
                                    return obj7;
                                }
                                chaloTextStyleHelper13 = chaloTextStyleHelper12;
                                str10 = str8;
                                journeyDetailsUiState5 = journeyDetailsUiState3;
                                list10 = arrayList5;
                                chaloTextUIStateA = ChaloTextStyleHelper.a(chaloTextStyleHelper13, (String) objB8, null, UIFontWeight.Bold, null, FacebookMediationAdapter.ERROR_FAILED_TO_PRESENT_AD);
                                styledTextDataUIStateArr = new StyledTextDataUIState[2];
                                chaloTextStyleHelper11 = chaloTextStyleHelper12;
                                confirmBookingUIStateFactory$create$1.L$0 = confirmBookingScreenDataState10;
                                confirmBookingUIStateFactory$create$1.L$1 = function7;
                                confirmBookingUIStateFactory$create$1.L$2 = loadingDialogUIState5;
                                confirmBookingUIStateFactory$create$1.L$3 = toolbarUIState3;
                                confirmBookingUIStateFactory$create$1.L$4 = journeyDetailsUiState5;
                                confirmBookingUIStateFactory$create$1.L$5 = str10;
                                confirmBookingUIStateFactory$create$1.L$6 = priceDetailsUiState;
                                confirmBookingUIStateFactory$create$1.L$7 = styledTextDataUIStateArr;
                                confirmBookingUIStateFactory$create$1.L$8 = chaloTextUIStateA;
                                confirmBookingUIStateFactory$create$1.L$9 = list10;
                                confirmBookingUIStateFactory$create$1.L$10 = styledTextDataUIStateArr;
                                confirmBookingUIStateFactory$create$1.I$0 = 0;
                                confirmBookingUIStateFactory$create$1.label = 9;
                                objB9 = stringProvider.b(StringEnum.ALL_TNC_PREFIX, new Object[0], confirmBookingUIStateFactory$create$1);
                                if (objB9 == obj7) {
                                    return obj7;
                                }
                                styledTextDataUIStateArr2 = styledTextDataUIStateArr;
                                toolbarUIState5 = toolbarUIState3;
                                priceDetailsUiState3 = priceDetailsUiState;
                                loadingDialogUIState7 = loadingDialogUIState5;
                                i4 = 0;
                                journeyDetailsUiState6 = journeyDetailsUiState5;
                                str11 = str10;
                                chaloTextUIState = chaloTextUIStateA;
                                obj10 = objB9;
                                list11 = list10;
                                styledTextDataUIStateArr2[i4] = new StyledTextDataUIState(obj10 + " ", null, null, UITextStyle.BodySmall, null, null, null, 1014);
                                confirmBookingUIStateFactory$create$1.L$0 = confirmBookingScreenDataState10;
                                confirmBookingUIStateFactory$create$1.L$1 = function7;
                                confirmBookingUIStateFactory$create$1.L$2 = loadingDialogUIState7;
                                confirmBookingUIStateFactory$create$1.L$3 = toolbarUIState5;
                                confirmBookingUIStateFactory$create$1.L$4 = journeyDetailsUiState6;
                                confirmBookingUIStateFactory$create$1.L$5 = str11;
                                confirmBookingUIStateFactory$create$1.L$6 = priceDetailsUiState3;
                                confirmBookingUIStateFactory$create$1.L$7 = styledTextDataUIStateArr;
                                confirmBookingUIStateFactory$create$1.L$8 = chaloTextUIState;
                                confirmBookingUIStateFactory$create$1.L$9 = list11;
                                confirmBookingUIStateFactory$create$1.L$10 = styledTextDataUIStateArr;
                                confirmBookingUIStateFactory$create$1.I$0 = 1;
                                confirmBookingUIStateFactory$create$1.label = 10;
                                objB10 = stringProvider.b(StringEnum.TNC_CLICKABLE_TEXT, new Object[0], confirmBookingUIStateFactory$create$1);
                                if (objB10 == obj7) {
                                    return obj7;
                                }
                                styledTextDataUIStateArr3 = styledTextDataUIStateArr;
                                str12 = str11;
                                loadingDialogUIState8 = loadingDialogUIState7;
                                confirmBookingScreenDataState12 = confirmBookingScreenDataState10;
                                toolbarUIState6 = toolbarUIState5;
                                i5 = 1;
                                chaloTextUIState2 = chaloTextUIState;
                                function8 = function7;
                                list12 = list11;
                                styledTextDataUIStateArr4 = styledTextDataUIStateArr3;
                                priceDetailsUiState4 = priceDetailsUiState3;
                                journeyDetailsUiState7 = journeyDetailsUiState6;
                                String str117 = (String) objB10;
                                obj9 = obj7;
                                tnCDialogUIState = null;
                                styledTextDataUIStateArr4[i5] = new StyledTextDataUIState(str117, orangePrimary, UIFontWeight.Bold, UITextStyle.BodySmall, null, null, new StyledTextClickHandler() { // from class: app.chalo.metro.ui.confirmbooking.uistate.ConfirmBookingUIStateFactory$create$termsAndConditionsUiState$2$1
                                    @Override // app.chalo.uistate.text.StyledTextClickHandler
                                    public final void a() {
                                        function8.invoke(ConfirmBookingScreenViewIntent.OnTermsAndConditionsClicked.f5468a);
                                    }

                                    @Override // app.chalo.uistate.text.StyledTextClickHandler
                                    /* JADX INFO: renamed from: b */
                                    public final String getB() {
                                        return "TNC_CLICKABLE_TEXT";
                                    }

                                    @Override // app.chalo.uistate.text.StyledTextClickHandler
                                    /* JADX INFO: renamed from: getTag */
                                    public final String getF10085a() {
                                        return "TNC_CLICKABLE_TEXT";
                                    }
                                }, 496);
                                termsAndConditionsUiState = new TermsAndConditionsUiState(chaloTextUIState2, list12, new TextUIState.StyledTextUIState(CollectionsKt.S(styledTextDataUIStateArr3), null, null, 30));
                                function7 = function8;
                                confirmBookingScreenDataState11 = confirmBookingScreenDataState12;
                                priceDetailsUiState2 = priceDetailsUiState4;
                                str9 = str12;
                                journeyDetailsUiState4 = journeyDetailsUiState7;
                                loadingDialogUIState6 = loadingDialogUIState8;
                                toolbarUIState4 = toolbarUIState6;
                            }
                            z = confirmBookingScreenDataState11.m;
                            List list1116 = confirmBookingScreenDataState11.j;
                            if (z) {
                                break;
                            }
                            obj11 = obj9;
                            JourneyDetailsUiState journeyDetailsUiState116 = journeyDetailsUiState4;
                            priceDetailsUiState5 = priceDetailsUiState2;
                            loadingDialogUIState9 = loadingDialogUIState6;
                            toolbarUIState7 = toolbarUIState4;
                            journeyDetailsUiState8 = journeyDetailsUiState116;
                            Function1 function119 = function7;
                            confirmBookingScreenDataState13 = confirmBookingScreenDataState11;
                            function9 = function119;
                            tnCDialogUIState2 = tnCDialogUIState;
                            StringEnum stringEnum14 = StringEnum.FARE_DETAILS_PAY;
                            Object[] objArr14 = {str9};
                            confirmBookingUIStateFactory$create$1.L$0 = confirmBookingScreenDataState13;
                            confirmBookingUIStateFactory$create$1.L$1 = function9;
                            confirmBookingUIStateFactory$create$1.L$2 = loadingDialogUIState9;
                            confirmBookingUIStateFactory$create$1.L$3 = toolbarUIState7;
                            confirmBookingUIStateFactory$create$1.L$4 = journeyDetailsUiState8;
                            confirmBookingUIStateFactory$create$1.L$5 = priceDetailsUiState5;
                            confirmBookingUIStateFactory$create$1.L$6 = termsAndConditionsUiState;
                            confirmBookingUIStateFactory$create$1.L$7 = tnCDialogUIState2;
                            buttonUIStateFactory = ButtonUIStateFactory.f9921a;
                            confirmBookingUIStateFactory$create$1.L$8 = buttonUIStateFactory;
                            confirmBookingUIStateFactory$create$1.L$9 = tnCDialogUIState;
                            confirmBookingUIStateFactory$create$1.L$10 = tnCDialogUIState;
                            confirmBookingUIStateFactory$create$1.label = 12;
                            objB11 = stringProvider.b(stringEnum14, objArr14, confirmBookingUIStateFactory$create$1);
                            if (objB11 != obj11) {
                                priceDetailsUiState6 = priceDetailsUiState5;
                                termsAndConditionsUiState2 = termsAndConditionsUiState;
                                confirmBookingScreenDataState14 = confirmBookingScreenDataState13;
                                loadingDialogUIState10 = loadingDialogUIState9;
                                buttonUIStateFactory2 = buttonUIStateFactory;
                                tnCDialogUIState3 = tnCDialogUIState2;
                                function10 = function9;
                                confirmBookingScreenDataState15 = confirmBookingScreenDataState14;
                                journeyDetailsUiState9 = journeyDetailsUiState8;
                                tnCDialogUIState4 = tnCDialogUIState3;
                                loadingDialogUIState11 = loadingDialogUIState10;
                                stringProvider2 = stringProvider;
                                obj13 = obj11;
                                toolbarUIState8 = toolbarUIState7;
                                buttonUIStateG = ButtonUIStateFactory.g(buttonUIStateFactory2, (String) objB11, new bp(function10, 15), null, UIShape.d, true, 0.0f, 36);
                                if (confirmBookingScreenDataState15.l) {
                                    confirmBookingUIStateFactory$create$1.L$0 = confirmBookingScreenDataState15;
                                    confirmBookingUIStateFactory$create$1.L$1 = function10;
                                    confirmBookingUIStateFactory$create$1.L$2 = loadingDialogUIState11;
                                    confirmBookingUIStateFactory$create$1.L$3 = toolbarUIState8;
                                    confirmBookingUIStateFactory$create$1.L$4 = journeyDetailsUiState9;
                                    confirmBookingUIStateFactory$create$1.L$5 = priceDetailsUiState6;
                                    confirmBookingUIStateFactory$create$1.L$6 = termsAndConditionsUiState2;
                                    confirmBookingUIStateFactory$create$1.L$7 = tnCDialogUIState4;
                                    confirmBookingUIStateFactory$create$1.L$8 = buttonUIStateG;
                                    chaloTextStyleHelper14 = chaloTextStyleHelper11;
                                    confirmBookingUIStateFactory$create$1.L$9 = chaloTextStyleHelper14;
                                    confirmBookingUIStateFactory$create$1.label = 13;
                                    stringProvider3 = stringProvider2;
                                    objB12 = stringProvider3.b(StringEnum.SOMETHING_WENT_WRONG, new Object[0], confirmBookingUIStateFactory$create$1);
                                    obj14 = obj13;
                                    if (objB12 == obj14) {
                                        return obj14;
                                    }
                                    journeyDetailsUiState11 = journeyDetailsUiState9;
                                    priceDetailsUiState8 = priceDetailsUiState6;
                                    function11 = function10;
                                    confirmBookingScreenDataState17 = confirmBookingScreenDataState15;
                                    obj15 = objB12;
                                    tnCDialogUIState6 = tnCDialogUIState4;
                                    chaloTextStyleHelper15 = chaloTextStyleHelper14;
                                    chaloTextUIStateB = ChaloTextStyleHelper.b(chaloTextStyleHelper15, (String) obj15, ChaloColorToken.White.f9870a, 0, null, null, null, null, 124);
                                    confirmBookingUIStateFactory$create$1.L$0 = confirmBookingScreenDataState17;
                                    confirmBookingUIStateFactory$create$1.L$1 = function11;
                                    confirmBookingUIStateFactory$create$1.L$2 = loadingDialogUIState11;
                                    confirmBookingUIStateFactory$create$1.L$3 = toolbarUIState8;
                                    confirmBookingUIStateFactory$create$1.L$4 = journeyDetailsUiState11;
                                    confirmBookingUIStateFactory$create$1.L$5 = priceDetailsUiState8;
                                    confirmBookingUIStateFactory$create$1.L$6 = termsAndConditionsUiState2;
                                    confirmBookingUIStateFactory$create$1.L$7 = tnCDialogUIState6;
                                    confirmBookingUIStateFactory$create$1.L$8 = buttonUIStateG;
                                    confirmBookingUIStateFactory$create$1.L$9 = chaloTextUIStateB;
                                    confirmBookingUIStateFactory$create$1.L$10 = chaloTextStyleHelper14;
                                    confirmBookingScreenDataState18 = confirmBookingScreenDataState17;
                                    confirmBookingUIStateFactory$create$1.label = 14;
                                    objB13 = stringProvider3.b(StringEnum.RETRY, new Object[0], confirmBookingUIStateFactory$create$1);
                                    if (objB13 == obj14) {
                                        return obj14;
                                    }
                                    toolbarUIState10 = toolbarUIState8;
                                    termsAndConditionsUiState4 = termsAndConditionsUiState2;
                                    confirmBookingScreenDataState19 = confirmBookingScreenDataState18;
                                    function12 = function11;
                                    chaloTextUIState3 = chaloTextUIStateB;
                                    obj16 = objB13;
                                    priceDetailsUiState9 = priceDetailsUiState8;
                                    chaloTextStyleHelper16 = chaloTextStyleHelper14;
                                    loadingDialogUIState13 = loadingDialogUIState11;
                                    journeyDetailsUiState12 = journeyDetailsUiState11;
                                    ChaloColorToken.OrangePrimary orangePrimary15 = orangePrimary;
                                    priceDetailsUiState7 = priceDetailsUiState9;
                                    tnCDialogUIState5 = tnCDialogUIState6;
                                    termsAndConditionsUiState3 = termsAndConditionsUiState4;
                                    snackbarUIState = new SnackbarUIState(chaloTextUIState3, ChaloTextStyleHelper.b(chaloTextStyleHelper16, (String) obj16, orangePrimary15, 0, null, UIFontWeight.SemiBold, null, null, 108), UiEventHandler.Companion.a(new bp(function12, 16)));
                                    journeyDetailsUiState10 = journeyDetailsUiState12;
                                    toolbarUIState9 = toolbarUIState10;
                                    loadingDialogUIState12 = loadingDialogUIState13;
                                    confirmBookingScreenDataState16 = confirmBookingScreenDataState19;
                                } else {
                                    confirmBookingScreenDataState16 = confirmBookingScreenDataState15;
                                    journeyDetailsUiState10 = journeyDetailsUiState9;
                                    tnCDialogUIState5 = tnCDialogUIState4;
                                    loadingDialogUIState12 = loadingDialogUIState11;
                                    toolbarUIState9 = toolbarUIState8;
                                    termsAndConditionsUiState3 = termsAndConditionsUiState2;
                                    priceDetailsUiState7 = priceDetailsUiState6;
                                    snackbarUIState = null;
                                }
                                ButtonUIState buttonUIState14 = buttonUIStateG;
                                boolean z15 = confirmBookingScreenDataState16.k;
                                if (confirmBookingScreenDataState16.c) {
                                    loadingDialogUIState14 = loadingDialogUIState12;
                                } else {
                                    loadingDialogUIState14 = null;
                                }
                                return new ConfirmBookingScreenViewState(toolbarUIState9, journeyDetailsUiState10, priceDetailsUiState7, termsAndConditionsUiState3, tnCDialogUIState5, buttonUIState14, snackbarUIState, z15, loadingDialogUIState14);
                            }
                            return obj11;
                        }
                        obj9 = obj7;
                        chaloTextStyleHelper11 = chaloTextStyleHelper17;
                        tnCDialogUIState = null;
                        termsAndConditionsUiState = null;
                        journeyDetailsUiState4 = journeyDetailsUiState3;
                        str9 = str8;
                        toolbarUIState4 = toolbarUIState3;
                        priceDetailsUiState2 = priceDetailsUiState;
                        loadingDialogUIState6 = loadingDialogUIState5;
                        confirmBookingScreenDataState11 = confirmBookingScreenDataState10;
                        z = confirmBookingScreenDataState11.m;
                        List list1117 = confirmBookingScreenDataState11.j;
                        if (z) {
                            break;
                        }
                        obj11 = obj9;
                        JourneyDetailsUiState journeyDetailsUiState117 = journeyDetailsUiState4;
                        priceDetailsUiState5 = priceDetailsUiState2;
                        loadingDialogUIState9 = loadingDialogUIState6;
                        toolbarUIState7 = toolbarUIState4;
                        journeyDetailsUiState8 = journeyDetailsUiState117;
                        Function1 function1110 = function7;
                        confirmBookingScreenDataState13 = confirmBookingScreenDataState11;
                        function9 = function1110;
                        tnCDialogUIState2 = tnCDialogUIState;
                        StringEnum stringEnum15 = StringEnum.FARE_DETAILS_PAY;
                        Object[] objArr15 = {str9};
                        confirmBookingUIStateFactory$create$1.L$0 = confirmBookingScreenDataState13;
                        confirmBookingUIStateFactory$create$1.L$1 = function9;
                        confirmBookingUIStateFactory$create$1.L$2 = loadingDialogUIState9;
                        confirmBookingUIStateFactory$create$1.L$3 = toolbarUIState7;
                        confirmBookingUIStateFactory$create$1.L$4 = journeyDetailsUiState8;
                        confirmBookingUIStateFactory$create$1.L$5 = priceDetailsUiState5;
                        confirmBookingUIStateFactory$create$1.L$6 = termsAndConditionsUiState;
                        confirmBookingUIStateFactory$create$1.L$7 = tnCDialogUIState2;
                        buttonUIStateFactory = ButtonUIStateFactory.f9921a;
                        confirmBookingUIStateFactory$create$1.L$8 = buttonUIStateFactory;
                        confirmBookingUIStateFactory$create$1.L$9 = tnCDialogUIState;
                        confirmBookingUIStateFactory$create$1.L$10 = tnCDialogUIState;
                        confirmBookingUIStateFactory$create$1.label = 12;
                        objB11 = stringProvider.b(stringEnum15, objArr15, confirmBookingUIStateFactory$create$1);
                        if (objB11 != obj11) {
                            priceDetailsUiState6 = priceDetailsUiState5;
                            termsAndConditionsUiState2 = termsAndConditionsUiState;
                            confirmBookingScreenDataState14 = confirmBookingScreenDataState13;
                            loadingDialogUIState10 = loadingDialogUIState9;
                            buttonUIStateFactory2 = buttonUIStateFactory;
                            tnCDialogUIState3 = tnCDialogUIState2;
                            function10 = function9;
                            confirmBookingScreenDataState15 = confirmBookingScreenDataState14;
                            journeyDetailsUiState9 = journeyDetailsUiState8;
                            tnCDialogUIState4 = tnCDialogUIState3;
                            loadingDialogUIState11 = loadingDialogUIState10;
                            stringProvider2 = stringProvider;
                            obj13 = obj11;
                            toolbarUIState8 = toolbarUIState7;
                            buttonUIStateG = ButtonUIStateFactory.g(buttonUIStateFactory2, (String) objB11, new bp(function10, 15), null, UIShape.d, true, 0.0f, 36);
                            if (confirmBookingScreenDataState15.l) {
                                confirmBookingUIStateFactory$create$1.L$0 = confirmBookingScreenDataState15;
                                confirmBookingUIStateFactory$create$1.L$1 = function10;
                                confirmBookingUIStateFactory$create$1.L$2 = loadingDialogUIState11;
                                confirmBookingUIStateFactory$create$1.L$3 = toolbarUIState8;
                                confirmBookingUIStateFactory$create$1.L$4 = journeyDetailsUiState9;
                                confirmBookingUIStateFactory$create$1.L$5 = priceDetailsUiState6;
                                confirmBookingUIStateFactory$create$1.L$6 = termsAndConditionsUiState2;
                                confirmBookingUIStateFactory$create$1.L$7 = tnCDialogUIState4;
                                confirmBookingUIStateFactory$create$1.L$8 = buttonUIStateG;
                                chaloTextStyleHelper14 = chaloTextStyleHelper11;
                                confirmBookingUIStateFactory$create$1.L$9 = chaloTextStyleHelper14;
                                confirmBookingUIStateFactory$create$1.label = 13;
                                stringProvider3 = stringProvider2;
                                objB12 = stringProvider3.b(StringEnum.SOMETHING_WENT_WRONG, new Object[0], confirmBookingUIStateFactory$create$1);
                                obj14 = obj13;
                                if (objB12 == obj14) {
                                    return obj14;
                                }
                                journeyDetailsUiState11 = journeyDetailsUiState9;
                                priceDetailsUiState8 = priceDetailsUiState6;
                                function11 = function10;
                                confirmBookingScreenDataState17 = confirmBookingScreenDataState15;
                                obj15 = objB12;
                                tnCDialogUIState6 = tnCDialogUIState4;
                                chaloTextStyleHelper15 = chaloTextStyleHelper14;
                                chaloTextUIStateB = ChaloTextStyleHelper.b(chaloTextStyleHelper15, (String) obj15, ChaloColorToken.White.f9870a, 0, null, null, null, null, 124);
                                confirmBookingUIStateFactory$create$1.L$0 = confirmBookingScreenDataState17;
                                confirmBookingUIStateFactory$create$1.L$1 = function11;
                                confirmBookingUIStateFactory$create$1.L$2 = loadingDialogUIState11;
                                confirmBookingUIStateFactory$create$1.L$3 = toolbarUIState8;
                                confirmBookingUIStateFactory$create$1.L$4 = journeyDetailsUiState11;
                                confirmBookingUIStateFactory$create$1.L$5 = priceDetailsUiState8;
                                confirmBookingUIStateFactory$create$1.L$6 = termsAndConditionsUiState2;
                                confirmBookingUIStateFactory$create$1.L$7 = tnCDialogUIState6;
                                confirmBookingUIStateFactory$create$1.L$8 = buttonUIStateG;
                                confirmBookingUIStateFactory$create$1.L$9 = chaloTextUIStateB;
                                confirmBookingUIStateFactory$create$1.L$10 = chaloTextStyleHelper14;
                                confirmBookingScreenDataState18 = confirmBookingScreenDataState17;
                                confirmBookingUIStateFactory$create$1.label = 14;
                                objB13 = stringProvider3.b(StringEnum.RETRY, new Object[0], confirmBookingUIStateFactory$create$1);
                                if (objB13 == obj14) {
                                    return obj14;
                                }
                                toolbarUIState10 = toolbarUIState8;
                                termsAndConditionsUiState4 = termsAndConditionsUiState2;
                                confirmBookingScreenDataState19 = confirmBookingScreenDataState18;
                                function12 = function11;
                                chaloTextUIState3 = chaloTextUIStateB;
                                obj16 = objB13;
                                priceDetailsUiState9 = priceDetailsUiState8;
                                chaloTextStyleHelper16 = chaloTextStyleHelper14;
                                loadingDialogUIState13 = loadingDialogUIState11;
                                journeyDetailsUiState12 = journeyDetailsUiState11;
                                ChaloColorToken.OrangePrimary orangePrimary16 = orangePrimary;
                                priceDetailsUiState7 = priceDetailsUiState9;
                                tnCDialogUIState5 = tnCDialogUIState6;
                                termsAndConditionsUiState3 = termsAndConditionsUiState4;
                                snackbarUIState = new SnackbarUIState(chaloTextUIState3, ChaloTextStyleHelper.b(chaloTextStyleHelper16, (String) obj16, orangePrimary16, 0, null, UIFontWeight.SemiBold, null, null, 108), UiEventHandler.Companion.a(new bp(function12, 16)));
                                journeyDetailsUiState10 = journeyDetailsUiState12;
                                toolbarUIState9 = toolbarUIState10;
                                loadingDialogUIState12 = loadingDialogUIState13;
                                confirmBookingScreenDataState16 = confirmBookingScreenDataState19;
                            } else {
                                confirmBookingScreenDataState16 = confirmBookingScreenDataState15;
                                journeyDetailsUiState10 = journeyDetailsUiState9;
                                tnCDialogUIState5 = tnCDialogUIState4;
                                loadingDialogUIState12 = loadingDialogUIState11;
                                toolbarUIState9 = toolbarUIState8;
                                termsAndConditionsUiState3 = termsAndConditionsUiState2;
                                priceDetailsUiState7 = priceDetailsUiState6;
                                snackbarUIState = null;
                            }
                            ButtonUIState buttonUIState15 = buttonUIStateG;
                            boolean z16 = confirmBookingScreenDataState16.k;
                            if (confirmBookingScreenDataState16.c) {
                                loadingDialogUIState14 = loadingDialogUIState12;
                            } else {
                                loadingDialogUIState14 = null;
                            }
                            return new ConfirmBookingScreenViewState(toolbarUIState9, journeyDetailsUiState10, priceDetailsUiState7, termsAndConditionsUiState3, tnCDialogUIState5, buttonUIState15, snackbarUIState, z16, loadingDialogUIState14);
                        }
                        return obj11;
                    }
                    obj4 = obj17;
                    str4 = strA;
                    if (strA2 != null) {
                        productBannerSpec = new ProductBannerSpec();
                        confirmBookingUIStateFactory$create$1.L$0 = confirmBookingScreenDataState7;
                        confirmBookingUIStateFactory$create$1.L$1 = function5;
                        confirmBookingUIStateFactory$create$1.L$2 = loadingDialogUIState3;
                        confirmBookingUIStateFactory$create$1.L$3 = toolbarUIState3;
                        confirmBookingUIStateFactory$create$1.L$4 = journeyDetailsUiState;
                        confirmBookingUIStateFactory$create$1.L$5 = str4;
                        confirmBookingUIStateFactory$create$1.L$6 = chaloTextStyleHelper7;
                        confirmBookingUIStateFactory$create$1.L$7 = productBannerSpec;
                        confirmBookingUIStateFactory$create$1.label = 5;
                        objB5 = stringProvider.b(StringEnum.DISCOUNT_TEXT_COPY, new Object[]{strA2}, confirmBookingUIStateFactory$create$1);
                        obj5 = obj4;
                        if (objB5 == obj5) {
                            return obj5;
                        }
                        function6 = function5;
                        confirmBookingScreenDataState8 = confirmBookingScreenDataState7;
                        obj6 = objB5;
                        loadingDialogUIState4 = loadingDialogUIState3;
                        journeyDetailsUiState2 = journeyDetailsUiState;
                        chaloTextStyleHelper8 = chaloTextStyleHelper7;
                        productBannerUIState = new ProductBannerUIState(productBannerSpec, ChaloTextStyleHelper.c(chaloTextStyleHelper8, (String) obj6, null, null, UIFontWeight.SemiBold, null, null, FacebookMediationAdapter.ERROR_FAILED_TO_PRESENT_AD), new ImageUIState(IconType.DISCOUNT_GREEN, (String) null, (ChaloColorToken) null, (ImageUISize) null, (UIContentScale) null, 0.0f, (UiEventHandler) null, 254));
                        confirmBookingScreenDataState7 = confirmBookingScreenDataState8;
                    } else {
                        obj5 = obj4;
                        loadingDialogUIState4 = loadingDialogUIState3;
                        function6 = function5;
                        journeyDetailsUiState2 = journeyDetailsUiState;
                        productBannerUIState = null;
                    }
                    list7 = confirmBookingScreenDataState7.i;
                    if (list7 != null) {
                        List list1118 = list7;
                        arrayList4 = new ArrayList(CollectionsKt.v(list1118, 10));
                        it2 = list1118.iterator();
                        while (it2.hasNext()) {
                            FareBreakupAppModel fareBreakupAppModel8 = (FareBreakupAppModel) it2.next();
                            FareBreakupOperationUIProperties fareBreakupOperationUIPropertiesA8 = FareBreakupOperationUIPropertiesKt.a(fareBreakupAppModel8.b, (3 & 1) != 0 ? ChaloColorToken.Black.f9759a : ChaloColorToken.AlmostBlackColor.f9756a, (3 & 2) != 0);
                            ChaloTextStyleHelper chaloTextStyleHelper213 = chaloTextStyleHelper7;
                            arrayList4.add(new FareLineUiState(ChaloTextStyleHelper.c(chaloTextStyleHelper213, fareBreakupAppModel8.f3890a, null, null, null, null, null, WebSocketProtocol.PAYLOAD_SHORT), ChaloTextStyleHelper.c(chaloTextStyleHelper213, vo1.A(fareBreakupOperationUIPropertiesA8.f8267a, currencyFeature.a(fareBreakupAppModel8.c, CurrencyRoundOffLogic.ROUND_OFF_LOGIC_NO_ROUNDING)), fareBreakupOperationUIPropertiesA8.b, null, UIFontWeight.Bold, null, null, 108)));
                            it2 = it2;
                            chaloTextStyleHelper7 = chaloTextStyleHelper213;
                            obj5 = obj5;
                        }
                    } else {
                        arrayList4 = null;
                    }
                    chaloTextStyleHelper17 = chaloTextStyleHelper7;
                    Object obj116 = obj5;
                    confirmBookingUIStateFactory$create$1.L$0 = confirmBookingScreenDataState7;
                    confirmBookingUIStateFactory$create$1.L$1 = function6;
                    confirmBookingUIStateFactory$create$1.L$2 = loadingDialogUIState4;
                    confirmBookingUIStateFactory$create$1.L$3 = toolbarUIState3;
                    confirmBookingUIStateFactory$create$1.L$4 = journeyDetailsUiState2;
                    confirmBookingUIStateFactory$create$1.L$5 = str4;
                    confirmBookingUIStateFactory$create$1.L$6 = productBannerUIState;
                    confirmBookingUIStateFactory$create$1.L$7 = arrayList4;
                    confirmBookingUIStateFactory$create$1.L$8 = chaloTextStyleHelper17;
                    confirmBookingUIStateFactory$create$1.label = 6;
                    objB6 = stringProvider.b(StringEnum.TOTAL, new Object[0], confirmBookingUIStateFactory$create$1);
                    obj7 = obj116;
                    if (objB6 == obj7) {
                        return obj7;
                    }
                    list8 = arrayList4;
                    str6 = str4;
                    productBannerUIState2 = productBannerUIState;
                    chaloTextStyleHelper9 = chaloTextStyleHelper17;
                    confirmBookingScreenDataState9 = confirmBookingScreenDataState7;
                    obj8 = objB6;
                    str7 = str6;
                    fareLineUiState = new FareLineUiState(ChaloTextStyleHelper.c(chaloTextStyleHelper9, (String) obj8, null, null, null, null, null, WebSocketProtocol.PAYLOAD_SHORT), ChaloTextStyleHelper.c(chaloTextStyleHelper17, str6, null, null, UIFontWeight.Bold, null, null, FacebookMediationAdapter.ERROR_FAILED_TO_PRESENT_AD));
                    confirmBookingUIStateFactory$create$1.L$0 = confirmBookingScreenDataState9;
                    confirmBookingUIStateFactory$create$1.L$1 = function6;
                    confirmBookingUIStateFactory$create$1.L$2 = loadingDialogUIState4;
                    confirmBookingUIStateFactory$create$1.L$3 = toolbarUIState3;
                    confirmBookingUIStateFactory$create$1.L$4 = journeyDetailsUiState2;
                    confirmBookingUIStateFactory$create$1.L$5 = str7;
                    confirmBookingUIStateFactory$create$1.L$6 = productBannerUIState2;
                    confirmBookingUIStateFactory$create$1.L$7 = list8;
                    confirmBookingUIStateFactory$create$1.L$8 = fareLineUiState;
                    confirmBookingUIStateFactory$create$1.L$9 = chaloTextStyleHelper17;
                    confirmBookingUIStateFactory$create$1.label = 7;
                    objB7 = stringProvider.b(StringEnum.PRICE_DETAILS, new Object[0], confirmBookingUIStateFactory$create$1);
                    if (objB7 == obj7) {
                        return obj7;
                    }
                    fareLineUiState2 = fareLineUiState;
                    chaloTextStyleHelper10 = chaloTextStyleHelper17;
                    confirmBookingScreenDataState10 = confirmBookingScreenDataState9;
                    function7 = function6;
                    loadingDialogUIState5 = loadingDialogUIState4;
                    journeyDetailsUiState3 = journeyDetailsUiState2;
                    str8 = str7;
                    TextUIState.ChaloTextUIState chaloTextUIStateA9 = ChaloTextStyleHelper.a(chaloTextStyleHelper10, (String) objB7, null, UIFontWeight.Bold, null, FacebookMediationAdapter.ERROR_FAILED_TO_PRESENT_AD);
                    if (list8 == null) {
                        list8 = EmptyList.f17557a;
                    }
                    priceDetailsUiState = new PriceDetailsUiState(chaloTextUIStateA9, list8, fareLineUiState2, productBannerUIState2);
                    list9 = confirmBookingScreenDataState10.j;
                    if (list9 != null) {
                        if (list9.isEmpty()) {
                            list9 = null;
                        }
                        if (list9 != null) {
                            List listX7 = CollectionsKt.x0(list9, 3);
                            arrayList5 = new ArrayList(CollectionsKt.v(listX7, 10));
                            it3 = listX7.iterator();
                            i2 = 0;
                            while (it3.hasNext()) {
                                next = it3.next();
                                i3 = i2 + 1;
                                if (i2 < 0) {
                                    CollectionsKt.z0();
                                    throw null;
                                }
                                arrayList5.add(ChaloTextStyleHelper.c(chaloTextStyleHelper17, i3 + ". " + ((String) next), null, null, null, null, null, WebSocketProtocol.PAYLOAD_SHORT));
                                it3 = it3;
                                i2 = i3;
                            }
                            chaloTextStyleHelper12 = chaloTextStyleHelper17;
                            confirmBookingUIStateFactory$create$1.L$0 = confirmBookingScreenDataState10;
                            confirmBookingUIStateFactory$create$1.L$1 = function7;
                            confirmBookingUIStateFactory$create$1.L$2 = loadingDialogUIState5;
                            confirmBookingUIStateFactory$create$1.L$3 = toolbarUIState3;
                            confirmBookingUIStateFactory$create$1.L$4 = journeyDetailsUiState3;
                            confirmBookingUIStateFactory$create$1.L$5 = str8;
                            confirmBookingUIStateFactory$create$1.L$6 = priceDetailsUiState;
                            confirmBookingUIStateFactory$create$1.L$7 = arrayList5;
                            confirmBookingUIStateFactory$create$1.L$8 = chaloTextStyleHelper12;
                            confirmBookingUIStateFactory$create$1.L$9 = null;
                            confirmBookingUIStateFactory$create$1.label = 8;
                            objB8 = stringProvider.b(StringEnum.TERMS_AND_CONDITIONS, new Object[0], confirmBookingUIStateFactory$create$1);
                            if (objB8 == obj7) {
                                return obj7;
                            }
                            chaloTextStyleHelper13 = chaloTextStyleHelper12;
                            str10 = str8;
                            journeyDetailsUiState5 = journeyDetailsUiState3;
                            list10 = arrayList5;
                            chaloTextUIStateA = ChaloTextStyleHelper.a(chaloTextStyleHelper13, (String) objB8, null, UIFontWeight.Bold, null, FacebookMediationAdapter.ERROR_FAILED_TO_PRESENT_AD);
                            styledTextDataUIStateArr = new StyledTextDataUIState[2];
                            chaloTextStyleHelper11 = chaloTextStyleHelper12;
                            confirmBookingUIStateFactory$create$1.L$0 = confirmBookingScreenDataState10;
                            confirmBookingUIStateFactory$create$1.L$1 = function7;
                            confirmBookingUIStateFactory$create$1.L$2 = loadingDialogUIState5;
                            confirmBookingUIStateFactory$create$1.L$3 = toolbarUIState3;
                            confirmBookingUIStateFactory$create$1.L$4 = journeyDetailsUiState5;
                            confirmBookingUIStateFactory$create$1.L$5 = str10;
                            confirmBookingUIStateFactory$create$1.L$6 = priceDetailsUiState;
                            confirmBookingUIStateFactory$create$1.L$7 = styledTextDataUIStateArr;
                            confirmBookingUIStateFactory$create$1.L$8 = chaloTextUIStateA;
                            confirmBookingUIStateFactory$create$1.L$9 = list10;
                            confirmBookingUIStateFactory$create$1.L$10 = styledTextDataUIStateArr;
                            confirmBookingUIStateFactory$create$1.I$0 = 0;
                            confirmBookingUIStateFactory$create$1.label = 9;
                            objB9 = stringProvider.b(StringEnum.ALL_TNC_PREFIX, new Object[0], confirmBookingUIStateFactory$create$1);
                            if (objB9 == obj7) {
                                return obj7;
                            }
                            styledTextDataUIStateArr2 = styledTextDataUIStateArr;
                            toolbarUIState5 = toolbarUIState3;
                            priceDetailsUiState3 = priceDetailsUiState;
                            loadingDialogUIState7 = loadingDialogUIState5;
                            i4 = 0;
                            journeyDetailsUiState6 = journeyDetailsUiState5;
                            str11 = str10;
                            chaloTextUIState = chaloTextUIStateA;
                            obj10 = objB9;
                            list11 = list10;
                            styledTextDataUIStateArr2[i4] = new StyledTextDataUIState(obj10 + " ", null, null, UITextStyle.BodySmall, null, null, null, 1014);
                            confirmBookingUIStateFactory$create$1.L$0 = confirmBookingScreenDataState10;
                            confirmBookingUIStateFactory$create$1.L$1 = function7;
                            confirmBookingUIStateFactory$create$1.L$2 = loadingDialogUIState7;
                            confirmBookingUIStateFactory$create$1.L$3 = toolbarUIState5;
                            confirmBookingUIStateFactory$create$1.L$4 = journeyDetailsUiState6;
                            confirmBookingUIStateFactory$create$1.L$5 = str11;
                            confirmBookingUIStateFactory$create$1.L$6 = priceDetailsUiState3;
                            confirmBookingUIStateFactory$create$1.L$7 = styledTextDataUIStateArr;
                            confirmBookingUIStateFactory$create$1.L$8 = chaloTextUIState;
                            confirmBookingUIStateFactory$create$1.L$9 = list11;
                            confirmBookingUIStateFactory$create$1.L$10 = styledTextDataUIStateArr;
                            confirmBookingUIStateFactory$create$1.I$0 = 1;
                            confirmBookingUIStateFactory$create$1.label = 10;
                            objB10 = stringProvider.b(StringEnum.TNC_CLICKABLE_TEXT, new Object[0], confirmBookingUIStateFactory$create$1);
                            if (objB10 == obj7) {
                                return obj7;
                            }
                            styledTextDataUIStateArr3 = styledTextDataUIStateArr;
                            str12 = str11;
                            loadingDialogUIState8 = loadingDialogUIState7;
                            confirmBookingScreenDataState12 = confirmBookingScreenDataState10;
                            toolbarUIState6 = toolbarUIState5;
                            i5 = 1;
                            chaloTextUIState2 = chaloTextUIState;
                            function8 = function7;
                            list12 = list11;
                            styledTextDataUIStateArr4 = styledTextDataUIStateArr3;
                            priceDetailsUiState4 = priceDetailsUiState3;
                            journeyDetailsUiState7 = journeyDetailsUiState6;
                            String str118 = (String) objB10;
                            obj9 = obj7;
                            tnCDialogUIState = null;
                            styledTextDataUIStateArr4[i5] = new StyledTextDataUIState(str118, orangePrimary, UIFontWeight.Bold, UITextStyle.BodySmall, null, null, new StyledTextClickHandler() { // from class: app.chalo.metro.ui.confirmbooking.uistate.ConfirmBookingUIStateFactory$create$termsAndConditionsUiState$2$1
                                @Override // app.chalo.uistate.text.StyledTextClickHandler
                                public final void a() {
                                    function8.invoke(ConfirmBookingScreenViewIntent.OnTermsAndConditionsClicked.f5468a);
                                }

                                @Override // app.chalo.uistate.text.StyledTextClickHandler
                                /* JADX INFO: renamed from: b */
                                public final String getB() {
                                    return "TNC_CLICKABLE_TEXT";
                                }

                                @Override // app.chalo.uistate.text.StyledTextClickHandler
                                /* JADX INFO: renamed from: getTag */
                                public final String getF10085a() {
                                    return "TNC_CLICKABLE_TEXT";
                                }
                            }, 496);
                            termsAndConditionsUiState = new TermsAndConditionsUiState(chaloTextUIState2, list12, new TextUIState.StyledTextUIState(CollectionsKt.S(styledTextDataUIStateArr3), null, null, 30));
                            function7 = function8;
                            confirmBookingScreenDataState11 = confirmBookingScreenDataState12;
                            priceDetailsUiState2 = priceDetailsUiState4;
                            str9 = str12;
                            journeyDetailsUiState4 = journeyDetailsUiState7;
                            loadingDialogUIState6 = loadingDialogUIState8;
                            toolbarUIState4 = toolbarUIState6;
                        }
                        z = confirmBookingScreenDataState11.m;
                        List list1119 = confirmBookingScreenDataState11.j;
                        if (z) {
                            break;
                        }
                        obj11 = obj9;
                        JourneyDetailsUiState journeyDetailsUiState118 = journeyDetailsUiState4;
                        priceDetailsUiState5 = priceDetailsUiState2;
                        loadingDialogUIState9 = loadingDialogUIState6;
                        toolbarUIState7 = toolbarUIState4;
                        journeyDetailsUiState8 = journeyDetailsUiState118;
                        Function1 function1111 = function7;
                        confirmBookingScreenDataState13 = confirmBookingScreenDataState11;
                        function9 = function1111;
                        tnCDialogUIState2 = tnCDialogUIState;
                        StringEnum stringEnum16 = StringEnum.FARE_DETAILS_PAY;
                        Object[] objArr16 = {str9};
                        confirmBookingUIStateFactory$create$1.L$0 = confirmBookingScreenDataState13;
                        confirmBookingUIStateFactory$create$1.L$1 = function9;
                        confirmBookingUIStateFactory$create$1.L$2 = loadingDialogUIState9;
                        confirmBookingUIStateFactory$create$1.L$3 = toolbarUIState7;
                        confirmBookingUIStateFactory$create$1.L$4 = journeyDetailsUiState8;
                        confirmBookingUIStateFactory$create$1.L$5 = priceDetailsUiState5;
                        confirmBookingUIStateFactory$create$1.L$6 = termsAndConditionsUiState;
                        confirmBookingUIStateFactory$create$1.L$7 = tnCDialogUIState2;
                        buttonUIStateFactory = ButtonUIStateFactory.f9921a;
                        confirmBookingUIStateFactory$create$1.L$8 = buttonUIStateFactory;
                        confirmBookingUIStateFactory$create$1.L$9 = tnCDialogUIState;
                        confirmBookingUIStateFactory$create$1.L$10 = tnCDialogUIState;
                        confirmBookingUIStateFactory$create$1.label = 12;
                        objB11 = stringProvider.b(stringEnum16, objArr16, confirmBookingUIStateFactory$create$1);
                        if (objB11 != obj11) {
                            priceDetailsUiState6 = priceDetailsUiState5;
                            termsAndConditionsUiState2 = termsAndConditionsUiState;
                            confirmBookingScreenDataState14 = confirmBookingScreenDataState13;
                            loadingDialogUIState10 = loadingDialogUIState9;
                            buttonUIStateFactory2 = buttonUIStateFactory;
                            tnCDialogUIState3 = tnCDialogUIState2;
                            function10 = function9;
                            confirmBookingScreenDataState15 = confirmBookingScreenDataState14;
                            journeyDetailsUiState9 = journeyDetailsUiState8;
                            tnCDialogUIState4 = tnCDialogUIState3;
                            loadingDialogUIState11 = loadingDialogUIState10;
                            stringProvider2 = stringProvider;
                            obj13 = obj11;
                            toolbarUIState8 = toolbarUIState7;
                            buttonUIStateG = ButtonUIStateFactory.g(buttonUIStateFactory2, (String) objB11, new bp(function10, 15), null, UIShape.d, true, 0.0f, 36);
                            if (confirmBookingScreenDataState15.l) {
                                confirmBookingUIStateFactory$create$1.L$0 = confirmBookingScreenDataState15;
                                confirmBookingUIStateFactory$create$1.L$1 = function10;
                                confirmBookingUIStateFactory$create$1.L$2 = loadingDialogUIState11;
                                confirmBookingUIStateFactory$create$1.L$3 = toolbarUIState8;
                                confirmBookingUIStateFactory$create$1.L$4 = journeyDetailsUiState9;
                                confirmBookingUIStateFactory$create$1.L$5 = priceDetailsUiState6;
                                confirmBookingUIStateFactory$create$1.L$6 = termsAndConditionsUiState2;
                                confirmBookingUIStateFactory$create$1.L$7 = tnCDialogUIState4;
                                confirmBookingUIStateFactory$create$1.L$8 = buttonUIStateG;
                                chaloTextStyleHelper14 = chaloTextStyleHelper11;
                                confirmBookingUIStateFactory$create$1.L$9 = chaloTextStyleHelper14;
                                confirmBookingUIStateFactory$create$1.label = 13;
                                stringProvider3 = stringProvider2;
                                objB12 = stringProvider3.b(StringEnum.SOMETHING_WENT_WRONG, new Object[0], confirmBookingUIStateFactory$create$1);
                                obj14 = obj13;
                                if (objB12 == obj14) {
                                    return obj14;
                                }
                                journeyDetailsUiState11 = journeyDetailsUiState9;
                                priceDetailsUiState8 = priceDetailsUiState6;
                                function11 = function10;
                                confirmBookingScreenDataState17 = confirmBookingScreenDataState15;
                                obj15 = objB12;
                                tnCDialogUIState6 = tnCDialogUIState4;
                                chaloTextStyleHelper15 = chaloTextStyleHelper14;
                                chaloTextUIStateB = ChaloTextStyleHelper.b(chaloTextStyleHelper15, (String) obj15, ChaloColorToken.White.f9870a, 0, null, null, null, null, 124);
                                confirmBookingUIStateFactory$create$1.L$0 = confirmBookingScreenDataState17;
                                confirmBookingUIStateFactory$create$1.L$1 = function11;
                                confirmBookingUIStateFactory$create$1.L$2 = loadingDialogUIState11;
                                confirmBookingUIStateFactory$create$1.L$3 = toolbarUIState8;
                                confirmBookingUIStateFactory$create$1.L$4 = journeyDetailsUiState11;
                                confirmBookingUIStateFactory$create$1.L$5 = priceDetailsUiState8;
                                confirmBookingUIStateFactory$create$1.L$6 = termsAndConditionsUiState2;
                                confirmBookingUIStateFactory$create$1.L$7 = tnCDialogUIState6;
                                confirmBookingUIStateFactory$create$1.L$8 = buttonUIStateG;
                                confirmBookingUIStateFactory$create$1.L$9 = chaloTextUIStateB;
                                confirmBookingUIStateFactory$create$1.L$10 = chaloTextStyleHelper14;
                                confirmBookingScreenDataState18 = confirmBookingScreenDataState17;
                                confirmBookingUIStateFactory$create$1.label = 14;
                                objB13 = stringProvider3.b(StringEnum.RETRY, new Object[0], confirmBookingUIStateFactory$create$1);
                                if (objB13 == obj14) {
                                    return obj14;
                                }
                                toolbarUIState10 = toolbarUIState8;
                                termsAndConditionsUiState4 = termsAndConditionsUiState2;
                                confirmBookingScreenDataState19 = confirmBookingScreenDataState18;
                                function12 = function11;
                                chaloTextUIState3 = chaloTextUIStateB;
                                obj16 = objB13;
                                priceDetailsUiState9 = priceDetailsUiState8;
                                chaloTextStyleHelper16 = chaloTextStyleHelper14;
                                loadingDialogUIState13 = loadingDialogUIState11;
                                journeyDetailsUiState12 = journeyDetailsUiState11;
                                ChaloColorToken.OrangePrimary orangePrimary17 = orangePrimary;
                                priceDetailsUiState7 = priceDetailsUiState9;
                                tnCDialogUIState5 = tnCDialogUIState6;
                                termsAndConditionsUiState3 = termsAndConditionsUiState4;
                                snackbarUIState = new SnackbarUIState(chaloTextUIState3, ChaloTextStyleHelper.b(chaloTextStyleHelper16, (String) obj16, orangePrimary17, 0, null, UIFontWeight.SemiBold, null, null, 108), UiEventHandler.Companion.a(new bp(function12, 16)));
                                journeyDetailsUiState10 = journeyDetailsUiState12;
                                toolbarUIState9 = toolbarUIState10;
                                loadingDialogUIState12 = loadingDialogUIState13;
                                confirmBookingScreenDataState16 = confirmBookingScreenDataState19;
                            } else {
                                confirmBookingScreenDataState16 = confirmBookingScreenDataState15;
                                journeyDetailsUiState10 = journeyDetailsUiState9;
                                tnCDialogUIState5 = tnCDialogUIState4;
                                loadingDialogUIState12 = loadingDialogUIState11;
                                toolbarUIState9 = toolbarUIState8;
                                termsAndConditionsUiState3 = termsAndConditionsUiState2;
                                priceDetailsUiState7 = priceDetailsUiState6;
                                snackbarUIState = null;
                            }
                            ButtonUIState buttonUIState16 = buttonUIStateG;
                            boolean z17 = confirmBookingScreenDataState16.k;
                            if (confirmBookingScreenDataState16.c) {
                                loadingDialogUIState14 = loadingDialogUIState12;
                            } else {
                                loadingDialogUIState14 = null;
                            }
                            return new ConfirmBookingScreenViewState(toolbarUIState9, journeyDetailsUiState10, priceDetailsUiState7, termsAndConditionsUiState3, tnCDialogUIState5, buttonUIState16, snackbarUIState, z17, loadingDialogUIState14);
                        }
                        return obj11;
                    }
                    obj9 = obj7;
                    chaloTextStyleHelper11 = chaloTextStyleHelper17;
                    tnCDialogUIState = null;
                    termsAndConditionsUiState = null;
                    journeyDetailsUiState4 = journeyDetailsUiState3;
                    str9 = str8;
                    toolbarUIState4 = toolbarUIState3;
                    priceDetailsUiState2 = priceDetailsUiState;
                    loadingDialogUIState6 = loadingDialogUIState5;
                    confirmBookingScreenDataState11 = confirmBookingScreenDataState10;
                    z = confirmBookingScreenDataState11.m;
                    List list11110 = confirmBookingScreenDataState11.j;
                    if (z) {
                        break;
                    }
                    obj11 = obj9;
                    JourneyDetailsUiState journeyDetailsUiState119 = journeyDetailsUiState4;
                    priceDetailsUiState5 = priceDetailsUiState2;
                    loadingDialogUIState9 = loadingDialogUIState6;
                    toolbarUIState7 = toolbarUIState4;
                    journeyDetailsUiState8 = journeyDetailsUiState119;
                    Function1 function1112 = function7;
                    confirmBookingScreenDataState13 = confirmBookingScreenDataState11;
                    function9 = function1112;
                    tnCDialogUIState2 = tnCDialogUIState;
                    StringEnum stringEnum17 = StringEnum.FARE_DETAILS_PAY;
                    Object[] objArr17 = {str9};
                    confirmBookingUIStateFactory$create$1.L$0 = confirmBookingScreenDataState13;
                    confirmBookingUIStateFactory$create$1.L$1 = function9;
                    confirmBookingUIStateFactory$create$1.L$2 = loadingDialogUIState9;
                    confirmBookingUIStateFactory$create$1.L$3 = toolbarUIState7;
                    confirmBookingUIStateFactory$create$1.L$4 = journeyDetailsUiState8;
                    confirmBookingUIStateFactory$create$1.L$5 = priceDetailsUiState5;
                    confirmBookingUIStateFactory$create$1.L$6 = termsAndConditionsUiState;
                    confirmBookingUIStateFactory$create$1.L$7 = tnCDialogUIState2;
                    buttonUIStateFactory = ButtonUIStateFactory.f9921a;
                    confirmBookingUIStateFactory$create$1.L$8 = buttonUIStateFactory;
                    confirmBookingUIStateFactory$create$1.L$9 = tnCDialogUIState;
                    confirmBookingUIStateFactory$create$1.L$10 = tnCDialogUIState;
                    confirmBookingUIStateFactory$create$1.label = 12;
                    objB11 = stringProvider.b(stringEnum17, objArr17, confirmBookingUIStateFactory$create$1);
                    if (objB11 != obj11) {
                        priceDetailsUiState6 = priceDetailsUiState5;
                        termsAndConditionsUiState2 = termsAndConditionsUiState;
                        confirmBookingScreenDataState14 = confirmBookingScreenDataState13;
                        loadingDialogUIState10 = loadingDialogUIState9;
                        buttonUIStateFactory2 = buttonUIStateFactory;
                        tnCDialogUIState3 = tnCDialogUIState2;
                        function10 = function9;
                        confirmBookingScreenDataState15 = confirmBookingScreenDataState14;
                        journeyDetailsUiState9 = journeyDetailsUiState8;
                        tnCDialogUIState4 = tnCDialogUIState3;
                        loadingDialogUIState11 = loadingDialogUIState10;
                        stringProvider2 = stringProvider;
                        obj13 = obj11;
                        toolbarUIState8 = toolbarUIState7;
                        buttonUIStateG = ButtonUIStateFactory.g(buttonUIStateFactory2, (String) objB11, new bp(function10, 15), null, UIShape.d, true, 0.0f, 36);
                        if (confirmBookingScreenDataState15.l) {
                            confirmBookingUIStateFactory$create$1.L$0 = confirmBookingScreenDataState15;
                            confirmBookingUIStateFactory$create$1.L$1 = function10;
                            confirmBookingUIStateFactory$create$1.L$2 = loadingDialogUIState11;
                            confirmBookingUIStateFactory$create$1.L$3 = toolbarUIState8;
                            confirmBookingUIStateFactory$create$1.L$4 = journeyDetailsUiState9;
                            confirmBookingUIStateFactory$create$1.L$5 = priceDetailsUiState6;
                            confirmBookingUIStateFactory$create$1.L$6 = termsAndConditionsUiState2;
                            confirmBookingUIStateFactory$create$1.L$7 = tnCDialogUIState4;
                            confirmBookingUIStateFactory$create$1.L$8 = buttonUIStateG;
                            chaloTextStyleHelper14 = chaloTextStyleHelper11;
                            confirmBookingUIStateFactory$create$1.L$9 = chaloTextStyleHelper14;
                            confirmBookingUIStateFactory$create$1.label = 13;
                            stringProvider3 = stringProvider2;
                            objB12 = stringProvider3.b(StringEnum.SOMETHING_WENT_WRONG, new Object[0], confirmBookingUIStateFactory$create$1);
                            obj14 = obj13;
                            if (objB12 == obj14) {
                                return obj14;
                            }
                            journeyDetailsUiState11 = journeyDetailsUiState9;
                            priceDetailsUiState8 = priceDetailsUiState6;
                            function11 = function10;
                            confirmBookingScreenDataState17 = confirmBookingScreenDataState15;
                            obj15 = objB12;
                            tnCDialogUIState6 = tnCDialogUIState4;
                            chaloTextStyleHelper15 = chaloTextStyleHelper14;
                            chaloTextUIStateB = ChaloTextStyleHelper.b(chaloTextStyleHelper15, (String) obj15, ChaloColorToken.White.f9870a, 0, null, null, null, null, 124);
                            confirmBookingUIStateFactory$create$1.L$0 = confirmBookingScreenDataState17;
                            confirmBookingUIStateFactory$create$1.L$1 = function11;
                            confirmBookingUIStateFactory$create$1.L$2 = loadingDialogUIState11;
                            confirmBookingUIStateFactory$create$1.L$3 = toolbarUIState8;
                            confirmBookingUIStateFactory$create$1.L$4 = journeyDetailsUiState11;
                            confirmBookingUIStateFactory$create$1.L$5 = priceDetailsUiState8;
                            confirmBookingUIStateFactory$create$1.L$6 = termsAndConditionsUiState2;
                            confirmBookingUIStateFactory$create$1.L$7 = tnCDialogUIState6;
                            confirmBookingUIStateFactory$create$1.L$8 = buttonUIStateG;
                            confirmBookingUIStateFactory$create$1.L$9 = chaloTextUIStateB;
                            confirmBookingUIStateFactory$create$1.L$10 = chaloTextStyleHelper14;
                            confirmBookingScreenDataState18 = confirmBookingScreenDataState17;
                            confirmBookingUIStateFactory$create$1.label = 14;
                            objB13 = stringProvider3.b(StringEnum.RETRY, new Object[0], confirmBookingUIStateFactory$create$1);
                            if (objB13 == obj14) {
                                return obj14;
                            }
                            toolbarUIState10 = toolbarUIState8;
                            termsAndConditionsUiState4 = termsAndConditionsUiState2;
                            confirmBookingScreenDataState19 = confirmBookingScreenDataState18;
                            function12 = function11;
                            chaloTextUIState3 = chaloTextUIStateB;
                            obj16 = objB13;
                            priceDetailsUiState9 = priceDetailsUiState8;
                            chaloTextStyleHelper16 = chaloTextStyleHelper14;
                            loadingDialogUIState13 = loadingDialogUIState11;
                            journeyDetailsUiState12 = journeyDetailsUiState11;
                            ChaloColorToken.OrangePrimary orangePrimary18 = orangePrimary;
                            priceDetailsUiState7 = priceDetailsUiState9;
                            tnCDialogUIState5 = tnCDialogUIState6;
                            termsAndConditionsUiState3 = termsAndConditionsUiState4;
                            snackbarUIState = new SnackbarUIState(chaloTextUIState3, ChaloTextStyleHelper.b(chaloTextStyleHelper16, (String) obj16, orangePrimary18, 0, null, UIFontWeight.SemiBold, null, null, 108), UiEventHandler.Companion.a(new bp(function12, 16)));
                            journeyDetailsUiState10 = journeyDetailsUiState12;
                            toolbarUIState9 = toolbarUIState10;
                            loadingDialogUIState12 = loadingDialogUIState13;
                            confirmBookingScreenDataState16 = confirmBookingScreenDataState19;
                        } else {
                            confirmBookingScreenDataState16 = confirmBookingScreenDataState15;
                            journeyDetailsUiState10 = journeyDetailsUiState9;
                            tnCDialogUIState5 = tnCDialogUIState4;
                            loadingDialogUIState12 = loadingDialogUIState11;
                            toolbarUIState9 = toolbarUIState8;
                            termsAndConditionsUiState3 = termsAndConditionsUiState2;
                            priceDetailsUiState7 = priceDetailsUiState6;
                            snackbarUIState = null;
                        }
                        ButtonUIState buttonUIState17 = buttonUIStateG;
                        boolean z18 = confirmBookingScreenDataState16.k;
                        if (confirmBookingScreenDataState16.c) {
                            loadingDialogUIState14 = loadingDialogUIState12;
                        } else {
                            loadingDialogUIState14 = null;
                        }
                        return new ConfirmBookingScreenViewState(toolbarUIState9, journeyDetailsUiState10, priceDetailsUiState7, termsAndConditionsUiState3, tnCDialogUIState5, buttonUIState17, snackbarUIState, z18, loadingDialogUIState14);
                    }
                    return obj11;
                }
                return obj17;
            case 4:
                ChaloTextStyleHelper chaloTextStyleHelper31 = (ChaloTextStyleHelper) confirmBookingUIStateFactory$create$1.L$7;
                stopDetailUiState2 = (StopDetailUiState) confirmBookingUIStateFactory$create$1.L$6;
                list3 = (List) confirmBookingUIStateFactory$create$1.L$5;
                toolbarUIState3 = (ToolbarUIState) confirmBookingUIStateFactory$create$1.L$4;
                iconType4 = (IconType) confirmBookingUIStateFactory$create$1.L$3;
                LoadingDialogUIState loadingDialogUIState16 = (LoadingDialogUIState) confirmBookingUIStateFactory$create$1.L$2;
                Function1 function22 = (Function1) confirmBookingUIStateFactory$create$1.L$1;
                ConfirmBookingScreenDataState confirmBookingScreenDataState22 = (ConfirmBookingScreenDataState) confirmBookingUIStateFactory$create$1.L$0;
                ResultKt.b(obj16);
                str13 = "";
                orangePrimary = orangePrimary;
                loadingDialogUIState3 = loadingDialogUIState16;
                function5 = function22;
                stringProvider = stringProvider4;
                chaloTextStyleHelper5 = chaloTextStyleHelper17;
                chaloTextStyleHelper6 = chaloTextStyleHelper31;
                confirmBookingScreenDataState6 = confirmBookingScreenDataState22;
                obj3 = obj16;
                String str119 = (String) obj3;
                ChaloTextStyleHelper chaloTextStyleHelper214 = chaloTextStyleHelper5;
                confirmBookingScreenDataState7 = confirmBookingScreenDataState6;
                TextUIState.ChaloTextUIState chaloTextUIStateC9 = ChaloTextStyleHelper.c(chaloTextStyleHelper6, str119, shadyGray, null, null, null, null, 124);
                confirmationScreenTripDetails2 = confirmBookingScreenDataState7.f;
                if (confirmationScreenTripDetails2 != null) {
                    str3 = str13;
                } else {
                    str3 = str13;
                }
                list4 = list3;
                chaloTextStyleHelper7 = chaloTextStyleHelper214;
                StopDetailUiState stopDetailUiState7 = new StopDetailUiState(new ImageUIState(iconType4, (String) null, (ChaloColorToken) null, new ImageUISize(Dp.m7276boximpl(ChaloThemeHelper.a().i), Dp.m7276boximpl(ChaloThemeHelper.a().i)), (UIContentScale) null, 0.0f, (UiEventHandler) null, 246), chaloTextUIStateC9, ChaloTextStyleHelper.b(chaloTextStyleHelper214, str3, null, 0, null, null, null, null, WebSocketProtocol.PAYLOAD_SHORT));
                if (list4 == null) {
                    list5 = EmptyList.f17557a;
                } else {
                    list5 = list4;
                }
                journeyDetailsUiState = new JourneyDetailsUiState(stopDetailUiState2, stopDetailUiState7, list5, new DividerUIState(0.0f, null, null, 7));
                l = confirmBookingScreenDataState7.h;
                if (l != null) {
                    jLongValue = l.longValue();
                } else {
                    jLongValue = 0;
                }
                strA = currencyFeature.a(jLongValue, CurrencyRoundOffLogic.ROUND_OFF_LOGIC_NO_ROUNDING);
                list6 = confirmBookingScreenDataState7.i;
                if (list6 != null) {
                    arrayList3 = new ArrayList();
                    while (r12.hasNext()) {
                        if (((FareBreakupAppModel) obj18).b == FareBreakupOperationType.SUBTRACTION) {
                            arrayList3.add(obj18);
                        }
                    }
                    size = arrayList3.size();
                    obj4 = obj17;
                    str4 = strA;
                    j = 0;
                    while (i < size) {
                        j += ((FareBreakupAppModel) arrayList3.get(i)).c;
                        size = size;
                    }
                    l2 = new Long(j);
                    if (l2.longValue() <= 0) {
                        l2 = null;
                    }
                    if (l2 != null) {
                    }
                    if (strA2 != null) {
                        productBannerSpec = new ProductBannerSpec();
                        confirmBookingUIStateFactory$create$1.L$0 = confirmBookingScreenDataState7;
                        confirmBookingUIStateFactory$create$1.L$1 = function5;
                        confirmBookingUIStateFactory$create$1.L$2 = loadingDialogUIState3;
                        confirmBookingUIStateFactory$create$1.L$3 = toolbarUIState3;
                        confirmBookingUIStateFactory$create$1.L$4 = journeyDetailsUiState;
                        confirmBookingUIStateFactory$create$1.L$5 = str4;
                        confirmBookingUIStateFactory$create$1.L$6 = chaloTextStyleHelper7;
                        confirmBookingUIStateFactory$create$1.L$7 = productBannerSpec;
                        confirmBookingUIStateFactory$create$1.label = 5;
                        objB5 = stringProvider.b(StringEnum.DISCOUNT_TEXT_COPY, new Object[]{strA2}, confirmBookingUIStateFactory$create$1);
                        obj5 = obj4;
                        if (objB5 == obj5) {
                            return obj5;
                        }
                        function6 = function5;
                        confirmBookingScreenDataState8 = confirmBookingScreenDataState7;
                        obj6 = objB5;
                        loadingDialogUIState4 = loadingDialogUIState3;
                        journeyDetailsUiState2 = journeyDetailsUiState;
                        chaloTextStyleHelper8 = chaloTextStyleHelper7;
                        productBannerUIState = new ProductBannerUIState(productBannerSpec, ChaloTextStyleHelper.c(chaloTextStyleHelper8, (String) obj6, null, null, UIFontWeight.SemiBold, null, null, FacebookMediationAdapter.ERROR_FAILED_TO_PRESENT_AD), new ImageUIState(IconType.DISCOUNT_GREEN, (String) null, (ChaloColorToken) null, (ImageUISize) null, (UIContentScale) null, 0.0f, (UiEventHandler) null, 254));
                        confirmBookingScreenDataState7 = confirmBookingScreenDataState8;
                    } else {
                        obj5 = obj4;
                        loadingDialogUIState4 = loadingDialogUIState3;
                        function6 = function5;
                        journeyDetailsUiState2 = journeyDetailsUiState;
                        productBannerUIState = null;
                    }
                    list7 = confirmBookingScreenDataState7.i;
                    if (list7 != null) {
                        List list11111 = list7;
                        arrayList4 = new ArrayList(CollectionsKt.v(list11111, 10));
                        it2 = list11111.iterator();
                        while (it2.hasNext()) {
                            FareBreakupAppModel fareBreakupAppModel9 = (FareBreakupAppModel) it2.next();
                            FareBreakupOperationUIProperties fareBreakupOperationUIPropertiesA9 = FareBreakupOperationUIPropertiesKt.a(fareBreakupAppModel9.b, (3 & 1) != 0 ? ChaloColorToken.Black.f9759a : ChaloColorToken.AlmostBlackColor.f9756a, (3 & 2) != 0);
                            ChaloTextStyleHelper chaloTextStyleHelper215 = chaloTextStyleHelper7;
                            arrayList4.add(new FareLineUiState(ChaloTextStyleHelper.c(chaloTextStyleHelper215, fareBreakupAppModel9.f3890a, null, null, null, null, null, WebSocketProtocol.PAYLOAD_SHORT), ChaloTextStyleHelper.c(chaloTextStyleHelper215, vo1.A(fareBreakupOperationUIPropertiesA9.f8267a, currencyFeature.a(fareBreakupAppModel9.c, CurrencyRoundOffLogic.ROUND_OFF_LOGIC_NO_ROUNDING)), fareBreakupOperationUIPropertiesA9.b, null, UIFontWeight.Bold, null, null, 108)));
                            it2 = it2;
                            chaloTextStyleHelper7 = chaloTextStyleHelper215;
                            obj5 = obj5;
                        }
                    } else {
                        arrayList4 = null;
                    }
                    chaloTextStyleHelper17 = chaloTextStyleHelper7;
                    Object obj117 = obj5;
                    confirmBookingUIStateFactory$create$1.L$0 = confirmBookingScreenDataState7;
                    confirmBookingUIStateFactory$create$1.L$1 = function6;
                    confirmBookingUIStateFactory$create$1.L$2 = loadingDialogUIState4;
                    confirmBookingUIStateFactory$create$1.L$3 = toolbarUIState3;
                    confirmBookingUIStateFactory$create$1.L$4 = journeyDetailsUiState2;
                    confirmBookingUIStateFactory$create$1.L$5 = str4;
                    confirmBookingUIStateFactory$create$1.L$6 = productBannerUIState;
                    confirmBookingUIStateFactory$create$1.L$7 = arrayList4;
                    confirmBookingUIStateFactory$create$1.L$8 = chaloTextStyleHelper17;
                    confirmBookingUIStateFactory$create$1.label = 6;
                    objB6 = stringProvider.b(StringEnum.TOTAL, new Object[0], confirmBookingUIStateFactory$create$1);
                    obj7 = obj117;
                    if (objB6 == obj7) {
                        return obj7;
                    }
                    list8 = arrayList4;
                    str6 = str4;
                    productBannerUIState2 = productBannerUIState;
                    chaloTextStyleHelper9 = chaloTextStyleHelper17;
                    confirmBookingScreenDataState9 = confirmBookingScreenDataState7;
                    obj8 = objB6;
                    str7 = str6;
                    fareLineUiState = new FareLineUiState(ChaloTextStyleHelper.c(chaloTextStyleHelper9, (String) obj8, null, null, null, null, null, WebSocketProtocol.PAYLOAD_SHORT), ChaloTextStyleHelper.c(chaloTextStyleHelper17, str6, null, null, UIFontWeight.Bold, null, null, FacebookMediationAdapter.ERROR_FAILED_TO_PRESENT_AD));
                    confirmBookingUIStateFactory$create$1.L$0 = confirmBookingScreenDataState9;
                    confirmBookingUIStateFactory$create$1.L$1 = function6;
                    confirmBookingUIStateFactory$create$1.L$2 = loadingDialogUIState4;
                    confirmBookingUIStateFactory$create$1.L$3 = toolbarUIState3;
                    confirmBookingUIStateFactory$create$1.L$4 = journeyDetailsUiState2;
                    confirmBookingUIStateFactory$create$1.L$5 = str7;
                    confirmBookingUIStateFactory$create$1.L$6 = productBannerUIState2;
                    confirmBookingUIStateFactory$create$1.L$7 = list8;
                    confirmBookingUIStateFactory$create$1.L$8 = fareLineUiState;
                    confirmBookingUIStateFactory$create$1.L$9 = chaloTextStyleHelper17;
                    confirmBookingUIStateFactory$create$1.label = 7;
                    objB7 = stringProvider.b(StringEnum.PRICE_DETAILS, new Object[0], confirmBookingUIStateFactory$create$1);
                    if (objB7 == obj7) {
                        return obj7;
                    }
                    fareLineUiState2 = fareLineUiState;
                    chaloTextStyleHelper10 = chaloTextStyleHelper17;
                    confirmBookingScreenDataState10 = confirmBookingScreenDataState9;
                    function7 = function6;
                    loadingDialogUIState5 = loadingDialogUIState4;
                    journeyDetailsUiState3 = journeyDetailsUiState2;
                    str8 = str7;
                    TextUIState.ChaloTextUIState chaloTextUIStateA10 = ChaloTextStyleHelper.a(chaloTextStyleHelper10, (String) objB7, null, UIFontWeight.Bold, null, FacebookMediationAdapter.ERROR_FAILED_TO_PRESENT_AD);
                    if (list8 == null) {
                        list8 = EmptyList.f17557a;
                    }
                    priceDetailsUiState = new PriceDetailsUiState(chaloTextUIStateA10, list8, fareLineUiState2, productBannerUIState2);
                    list9 = confirmBookingScreenDataState10.j;
                    if (list9 != null) {
                        if (list9.isEmpty()) {
                            list9 = null;
                        }
                        if (list9 != null) {
                            List listX8 = CollectionsKt.x0(list9, 3);
                            arrayList5 = new ArrayList(CollectionsKt.v(listX8, 10));
                            it3 = listX8.iterator();
                            i2 = 0;
                            while (it3.hasNext()) {
                                next = it3.next();
                                i3 = i2 + 1;
                                if (i2 < 0) {
                                    CollectionsKt.z0();
                                    throw null;
                                }
                                arrayList5.add(ChaloTextStyleHelper.c(chaloTextStyleHelper17, i3 + ". " + ((String) next), null, null, null, null, null, WebSocketProtocol.PAYLOAD_SHORT));
                                it3 = it3;
                                i2 = i3;
                            }
                            chaloTextStyleHelper12 = chaloTextStyleHelper17;
                            confirmBookingUIStateFactory$create$1.L$0 = confirmBookingScreenDataState10;
                            confirmBookingUIStateFactory$create$1.L$1 = function7;
                            confirmBookingUIStateFactory$create$1.L$2 = loadingDialogUIState5;
                            confirmBookingUIStateFactory$create$1.L$3 = toolbarUIState3;
                            confirmBookingUIStateFactory$create$1.L$4 = journeyDetailsUiState3;
                            confirmBookingUIStateFactory$create$1.L$5 = str8;
                            confirmBookingUIStateFactory$create$1.L$6 = priceDetailsUiState;
                            confirmBookingUIStateFactory$create$1.L$7 = arrayList5;
                            confirmBookingUIStateFactory$create$1.L$8 = chaloTextStyleHelper12;
                            confirmBookingUIStateFactory$create$1.L$9 = null;
                            confirmBookingUIStateFactory$create$1.label = 8;
                            objB8 = stringProvider.b(StringEnum.TERMS_AND_CONDITIONS, new Object[0], confirmBookingUIStateFactory$create$1);
                            if (objB8 == obj7) {
                                return obj7;
                            }
                            chaloTextStyleHelper13 = chaloTextStyleHelper12;
                            str10 = str8;
                            journeyDetailsUiState5 = journeyDetailsUiState3;
                            list10 = arrayList5;
                            chaloTextUIStateA = ChaloTextStyleHelper.a(chaloTextStyleHelper13, (String) objB8, null, UIFontWeight.Bold, null, FacebookMediationAdapter.ERROR_FAILED_TO_PRESENT_AD);
                            styledTextDataUIStateArr = new StyledTextDataUIState[2];
                            chaloTextStyleHelper11 = chaloTextStyleHelper12;
                            confirmBookingUIStateFactory$create$1.L$0 = confirmBookingScreenDataState10;
                            confirmBookingUIStateFactory$create$1.L$1 = function7;
                            confirmBookingUIStateFactory$create$1.L$2 = loadingDialogUIState5;
                            confirmBookingUIStateFactory$create$1.L$3 = toolbarUIState3;
                            confirmBookingUIStateFactory$create$1.L$4 = journeyDetailsUiState5;
                            confirmBookingUIStateFactory$create$1.L$5 = str10;
                            confirmBookingUIStateFactory$create$1.L$6 = priceDetailsUiState;
                            confirmBookingUIStateFactory$create$1.L$7 = styledTextDataUIStateArr;
                            confirmBookingUIStateFactory$create$1.L$8 = chaloTextUIStateA;
                            confirmBookingUIStateFactory$create$1.L$9 = list10;
                            confirmBookingUIStateFactory$create$1.L$10 = styledTextDataUIStateArr;
                            confirmBookingUIStateFactory$create$1.I$0 = 0;
                            confirmBookingUIStateFactory$create$1.label = 9;
                            objB9 = stringProvider.b(StringEnum.ALL_TNC_PREFIX, new Object[0], confirmBookingUIStateFactory$create$1);
                            if (objB9 == obj7) {
                                return obj7;
                            }
                            styledTextDataUIStateArr2 = styledTextDataUIStateArr;
                            toolbarUIState5 = toolbarUIState3;
                            priceDetailsUiState3 = priceDetailsUiState;
                            loadingDialogUIState7 = loadingDialogUIState5;
                            i4 = 0;
                            journeyDetailsUiState6 = journeyDetailsUiState5;
                            str11 = str10;
                            chaloTextUIState = chaloTextUIStateA;
                            obj10 = objB9;
                            list11 = list10;
                            styledTextDataUIStateArr2[i4] = new StyledTextDataUIState(obj10 + " ", null, null, UITextStyle.BodySmall, null, null, null, 1014);
                            confirmBookingUIStateFactory$create$1.L$0 = confirmBookingScreenDataState10;
                            confirmBookingUIStateFactory$create$1.L$1 = function7;
                            confirmBookingUIStateFactory$create$1.L$2 = loadingDialogUIState7;
                            confirmBookingUIStateFactory$create$1.L$3 = toolbarUIState5;
                            confirmBookingUIStateFactory$create$1.L$4 = journeyDetailsUiState6;
                            confirmBookingUIStateFactory$create$1.L$5 = str11;
                            confirmBookingUIStateFactory$create$1.L$6 = priceDetailsUiState3;
                            confirmBookingUIStateFactory$create$1.L$7 = styledTextDataUIStateArr;
                            confirmBookingUIStateFactory$create$1.L$8 = chaloTextUIState;
                            confirmBookingUIStateFactory$create$1.L$9 = list11;
                            confirmBookingUIStateFactory$create$1.L$10 = styledTextDataUIStateArr;
                            confirmBookingUIStateFactory$create$1.I$0 = 1;
                            confirmBookingUIStateFactory$create$1.label = 10;
                            objB10 = stringProvider.b(StringEnum.TNC_CLICKABLE_TEXT, new Object[0], confirmBookingUIStateFactory$create$1);
                            if (objB10 == obj7) {
                                return obj7;
                            }
                            styledTextDataUIStateArr3 = styledTextDataUIStateArr;
                            str12 = str11;
                            loadingDialogUIState8 = loadingDialogUIState7;
                            confirmBookingScreenDataState12 = confirmBookingScreenDataState10;
                            toolbarUIState6 = toolbarUIState5;
                            i5 = 1;
                            chaloTextUIState2 = chaloTextUIState;
                            function8 = function7;
                            list12 = list11;
                            styledTextDataUIStateArr4 = styledTextDataUIStateArr3;
                            priceDetailsUiState4 = priceDetailsUiState3;
                            journeyDetailsUiState7 = journeyDetailsUiState6;
                            String str1110 = (String) objB10;
                            obj9 = obj7;
                            tnCDialogUIState = null;
                            styledTextDataUIStateArr4[i5] = new StyledTextDataUIState(str1110, orangePrimary, UIFontWeight.Bold, UITextStyle.BodySmall, null, null, new StyledTextClickHandler() { // from class: app.chalo.metro.ui.confirmbooking.uistate.ConfirmBookingUIStateFactory$create$termsAndConditionsUiState$2$1
                                @Override // app.chalo.uistate.text.StyledTextClickHandler
                                public final void a() {
                                    function8.invoke(ConfirmBookingScreenViewIntent.OnTermsAndConditionsClicked.f5468a);
                                }

                                @Override // app.chalo.uistate.text.StyledTextClickHandler
                                /* JADX INFO: renamed from: b */
                                public final String getB() {
                                    return "TNC_CLICKABLE_TEXT";
                                }

                                @Override // app.chalo.uistate.text.StyledTextClickHandler
                                /* JADX INFO: renamed from: getTag */
                                public final String getF10085a() {
                                    return "TNC_CLICKABLE_TEXT";
                                }
                            }, 496);
                            termsAndConditionsUiState = new TermsAndConditionsUiState(chaloTextUIState2, list12, new TextUIState.StyledTextUIState(CollectionsKt.S(styledTextDataUIStateArr3), null, null, 30));
                            function7 = function8;
                            confirmBookingScreenDataState11 = confirmBookingScreenDataState12;
                            priceDetailsUiState2 = priceDetailsUiState4;
                            str9 = str12;
                            journeyDetailsUiState4 = journeyDetailsUiState7;
                            loadingDialogUIState6 = loadingDialogUIState8;
                            toolbarUIState4 = toolbarUIState6;
                        }
                        z = confirmBookingScreenDataState11.m;
                        List list11112 = confirmBookingScreenDataState11.j;
                        if (z) {
                            break;
                        }
                        obj11 = obj9;
                        JourneyDetailsUiState journeyDetailsUiState1110 = journeyDetailsUiState4;
                        priceDetailsUiState5 = priceDetailsUiState2;
                        loadingDialogUIState9 = loadingDialogUIState6;
                        toolbarUIState7 = toolbarUIState4;
                        journeyDetailsUiState8 = journeyDetailsUiState1110;
                        Function1 function1113 = function7;
                        confirmBookingScreenDataState13 = confirmBookingScreenDataState11;
                        function9 = function1113;
                        tnCDialogUIState2 = tnCDialogUIState;
                        StringEnum stringEnum18 = StringEnum.FARE_DETAILS_PAY;
                        Object[] objArr18 = {str9};
                        confirmBookingUIStateFactory$create$1.L$0 = confirmBookingScreenDataState13;
                        confirmBookingUIStateFactory$create$1.L$1 = function9;
                        confirmBookingUIStateFactory$create$1.L$2 = loadingDialogUIState9;
                        confirmBookingUIStateFactory$create$1.L$3 = toolbarUIState7;
                        confirmBookingUIStateFactory$create$1.L$4 = journeyDetailsUiState8;
                        confirmBookingUIStateFactory$create$1.L$5 = priceDetailsUiState5;
                        confirmBookingUIStateFactory$create$1.L$6 = termsAndConditionsUiState;
                        confirmBookingUIStateFactory$create$1.L$7 = tnCDialogUIState2;
                        buttonUIStateFactory = ButtonUIStateFactory.f9921a;
                        confirmBookingUIStateFactory$create$1.L$8 = buttonUIStateFactory;
                        confirmBookingUIStateFactory$create$1.L$9 = tnCDialogUIState;
                        confirmBookingUIStateFactory$create$1.L$10 = tnCDialogUIState;
                        confirmBookingUIStateFactory$create$1.label = 12;
                        objB11 = stringProvider.b(stringEnum18, objArr18, confirmBookingUIStateFactory$create$1);
                        if (objB11 != obj11) {
                            priceDetailsUiState6 = priceDetailsUiState5;
                            termsAndConditionsUiState2 = termsAndConditionsUiState;
                            confirmBookingScreenDataState14 = confirmBookingScreenDataState13;
                            loadingDialogUIState10 = loadingDialogUIState9;
                            buttonUIStateFactory2 = buttonUIStateFactory;
                            tnCDialogUIState3 = tnCDialogUIState2;
                            function10 = function9;
                            confirmBookingScreenDataState15 = confirmBookingScreenDataState14;
                            journeyDetailsUiState9 = journeyDetailsUiState8;
                            tnCDialogUIState4 = tnCDialogUIState3;
                            loadingDialogUIState11 = loadingDialogUIState10;
                            stringProvider2 = stringProvider;
                            obj13 = obj11;
                            toolbarUIState8 = toolbarUIState7;
                            buttonUIStateG = ButtonUIStateFactory.g(buttonUIStateFactory2, (String) objB11, new bp(function10, 15), null, UIShape.d, true, 0.0f, 36);
                            if (confirmBookingScreenDataState15.l) {
                                confirmBookingUIStateFactory$create$1.L$0 = confirmBookingScreenDataState15;
                                confirmBookingUIStateFactory$create$1.L$1 = function10;
                                confirmBookingUIStateFactory$create$1.L$2 = loadingDialogUIState11;
                                confirmBookingUIStateFactory$create$1.L$3 = toolbarUIState8;
                                confirmBookingUIStateFactory$create$1.L$4 = journeyDetailsUiState9;
                                confirmBookingUIStateFactory$create$1.L$5 = priceDetailsUiState6;
                                confirmBookingUIStateFactory$create$1.L$6 = termsAndConditionsUiState2;
                                confirmBookingUIStateFactory$create$1.L$7 = tnCDialogUIState4;
                                confirmBookingUIStateFactory$create$1.L$8 = buttonUIStateG;
                                chaloTextStyleHelper14 = chaloTextStyleHelper11;
                                confirmBookingUIStateFactory$create$1.L$9 = chaloTextStyleHelper14;
                                confirmBookingUIStateFactory$create$1.label = 13;
                                stringProvider3 = stringProvider2;
                                objB12 = stringProvider3.b(StringEnum.SOMETHING_WENT_WRONG, new Object[0], confirmBookingUIStateFactory$create$1);
                                obj14 = obj13;
                                if (objB12 == obj14) {
                                    return obj14;
                                }
                                journeyDetailsUiState11 = journeyDetailsUiState9;
                                priceDetailsUiState8 = priceDetailsUiState6;
                                function11 = function10;
                                confirmBookingScreenDataState17 = confirmBookingScreenDataState15;
                                obj15 = objB12;
                                tnCDialogUIState6 = tnCDialogUIState4;
                                chaloTextStyleHelper15 = chaloTextStyleHelper14;
                                chaloTextUIStateB = ChaloTextStyleHelper.b(chaloTextStyleHelper15, (String) obj15, ChaloColorToken.White.f9870a, 0, null, null, null, null, 124);
                                confirmBookingUIStateFactory$create$1.L$0 = confirmBookingScreenDataState17;
                                confirmBookingUIStateFactory$create$1.L$1 = function11;
                                confirmBookingUIStateFactory$create$1.L$2 = loadingDialogUIState11;
                                confirmBookingUIStateFactory$create$1.L$3 = toolbarUIState8;
                                confirmBookingUIStateFactory$create$1.L$4 = journeyDetailsUiState11;
                                confirmBookingUIStateFactory$create$1.L$5 = priceDetailsUiState8;
                                confirmBookingUIStateFactory$create$1.L$6 = termsAndConditionsUiState2;
                                confirmBookingUIStateFactory$create$1.L$7 = tnCDialogUIState6;
                                confirmBookingUIStateFactory$create$1.L$8 = buttonUIStateG;
                                confirmBookingUIStateFactory$create$1.L$9 = chaloTextUIStateB;
                                confirmBookingUIStateFactory$create$1.L$10 = chaloTextStyleHelper14;
                                confirmBookingScreenDataState18 = confirmBookingScreenDataState17;
                                confirmBookingUIStateFactory$create$1.label = 14;
                                objB13 = stringProvider3.b(StringEnum.RETRY, new Object[0], confirmBookingUIStateFactory$create$1);
                                if (objB13 == obj14) {
                                    return obj14;
                                }
                                toolbarUIState10 = toolbarUIState8;
                                termsAndConditionsUiState4 = termsAndConditionsUiState2;
                                confirmBookingScreenDataState19 = confirmBookingScreenDataState18;
                                function12 = function11;
                                chaloTextUIState3 = chaloTextUIStateB;
                                obj16 = objB13;
                                priceDetailsUiState9 = priceDetailsUiState8;
                                chaloTextStyleHelper16 = chaloTextStyleHelper14;
                                loadingDialogUIState13 = loadingDialogUIState11;
                                journeyDetailsUiState12 = journeyDetailsUiState11;
                                ChaloColorToken.OrangePrimary orangePrimary19 = orangePrimary;
                                priceDetailsUiState7 = priceDetailsUiState9;
                                tnCDialogUIState5 = tnCDialogUIState6;
                                termsAndConditionsUiState3 = termsAndConditionsUiState4;
                                snackbarUIState = new SnackbarUIState(chaloTextUIState3, ChaloTextStyleHelper.b(chaloTextStyleHelper16, (String) obj16, orangePrimary19, 0, null, UIFontWeight.SemiBold, null, null, 108), UiEventHandler.Companion.a(new bp(function12, 16)));
                                journeyDetailsUiState10 = journeyDetailsUiState12;
                                toolbarUIState9 = toolbarUIState10;
                                loadingDialogUIState12 = loadingDialogUIState13;
                                confirmBookingScreenDataState16 = confirmBookingScreenDataState19;
                            } else {
                                confirmBookingScreenDataState16 = confirmBookingScreenDataState15;
                                journeyDetailsUiState10 = journeyDetailsUiState9;
                                tnCDialogUIState5 = tnCDialogUIState4;
                                loadingDialogUIState12 = loadingDialogUIState11;
                                toolbarUIState9 = toolbarUIState8;
                                termsAndConditionsUiState3 = termsAndConditionsUiState2;
                                priceDetailsUiState7 = priceDetailsUiState6;
                                snackbarUIState = null;
                            }
                            ButtonUIState buttonUIState18 = buttonUIStateG;
                            boolean z19 = confirmBookingScreenDataState16.k;
                            if (confirmBookingScreenDataState16.c) {
                                loadingDialogUIState14 = loadingDialogUIState12;
                            } else {
                                loadingDialogUIState14 = null;
                            }
                            return new ConfirmBookingScreenViewState(toolbarUIState9, journeyDetailsUiState10, priceDetailsUiState7, termsAndConditionsUiState3, tnCDialogUIState5, buttonUIState18, snackbarUIState, z19, loadingDialogUIState14);
                        }
                        return obj11;
                    }
                    obj9 = obj7;
                    chaloTextStyleHelper11 = chaloTextStyleHelper17;
                    tnCDialogUIState = null;
                    termsAndConditionsUiState = null;
                    journeyDetailsUiState4 = journeyDetailsUiState3;
                    str9 = str8;
                    toolbarUIState4 = toolbarUIState3;
                    priceDetailsUiState2 = priceDetailsUiState;
                    loadingDialogUIState6 = loadingDialogUIState5;
                    confirmBookingScreenDataState11 = confirmBookingScreenDataState10;
                    z = confirmBookingScreenDataState11.m;
                    List list11113 = confirmBookingScreenDataState11.j;
                    if (z) {
                        break;
                    }
                    obj11 = obj9;
                    JourneyDetailsUiState journeyDetailsUiState1111 = journeyDetailsUiState4;
                    priceDetailsUiState5 = priceDetailsUiState2;
                    loadingDialogUIState9 = loadingDialogUIState6;
                    toolbarUIState7 = toolbarUIState4;
                    journeyDetailsUiState8 = journeyDetailsUiState1111;
                    Function1 function1114 = function7;
                    confirmBookingScreenDataState13 = confirmBookingScreenDataState11;
                    function9 = function1114;
                    tnCDialogUIState2 = tnCDialogUIState;
                    StringEnum stringEnum19 = StringEnum.FARE_DETAILS_PAY;
                    Object[] objArr19 = {str9};
                    confirmBookingUIStateFactory$create$1.L$0 = confirmBookingScreenDataState13;
                    confirmBookingUIStateFactory$create$1.L$1 = function9;
                    confirmBookingUIStateFactory$create$1.L$2 = loadingDialogUIState9;
                    confirmBookingUIStateFactory$create$1.L$3 = toolbarUIState7;
                    confirmBookingUIStateFactory$create$1.L$4 = journeyDetailsUiState8;
                    confirmBookingUIStateFactory$create$1.L$5 = priceDetailsUiState5;
                    confirmBookingUIStateFactory$create$1.L$6 = termsAndConditionsUiState;
                    confirmBookingUIStateFactory$create$1.L$7 = tnCDialogUIState2;
                    buttonUIStateFactory = ButtonUIStateFactory.f9921a;
                    confirmBookingUIStateFactory$create$1.L$8 = buttonUIStateFactory;
                    confirmBookingUIStateFactory$create$1.L$9 = tnCDialogUIState;
                    confirmBookingUIStateFactory$create$1.L$10 = tnCDialogUIState;
                    confirmBookingUIStateFactory$create$1.label = 12;
                    objB11 = stringProvider.b(stringEnum19, objArr19, confirmBookingUIStateFactory$create$1);
                    if (objB11 != obj11) {
                        priceDetailsUiState6 = priceDetailsUiState5;
                        termsAndConditionsUiState2 = termsAndConditionsUiState;
                        confirmBookingScreenDataState14 = confirmBookingScreenDataState13;
                        loadingDialogUIState10 = loadingDialogUIState9;
                        buttonUIStateFactory2 = buttonUIStateFactory;
                        tnCDialogUIState3 = tnCDialogUIState2;
                        function10 = function9;
                        confirmBookingScreenDataState15 = confirmBookingScreenDataState14;
                        journeyDetailsUiState9 = journeyDetailsUiState8;
                        tnCDialogUIState4 = tnCDialogUIState3;
                        loadingDialogUIState11 = loadingDialogUIState10;
                        stringProvider2 = stringProvider;
                        obj13 = obj11;
                        toolbarUIState8 = toolbarUIState7;
                        buttonUIStateG = ButtonUIStateFactory.g(buttonUIStateFactory2, (String) objB11, new bp(function10, 15), null, UIShape.d, true, 0.0f, 36);
                        if (confirmBookingScreenDataState15.l) {
                            confirmBookingUIStateFactory$create$1.L$0 = confirmBookingScreenDataState15;
                            confirmBookingUIStateFactory$create$1.L$1 = function10;
                            confirmBookingUIStateFactory$create$1.L$2 = loadingDialogUIState11;
                            confirmBookingUIStateFactory$create$1.L$3 = toolbarUIState8;
                            confirmBookingUIStateFactory$create$1.L$4 = journeyDetailsUiState9;
                            confirmBookingUIStateFactory$create$1.L$5 = priceDetailsUiState6;
                            confirmBookingUIStateFactory$create$1.L$6 = termsAndConditionsUiState2;
                            confirmBookingUIStateFactory$create$1.L$7 = tnCDialogUIState4;
                            confirmBookingUIStateFactory$create$1.L$8 = buttonUIStateG;
                            chaloTextStyleHelper14 = chaloTextStyleHelper11;
                            confirmBookingUIStateFactory$create$1.L$9 = chaloTextStyleHelper14;
                            confirmBookingUIStateFactory$create$1.label = 13;
                            stringProvider3 = stringProvider2;
                            objB12 = stringProvider3.b(StringEnum.SOMETHING_WENT_WRONG, new Object[0], confirmBookingUIStateFactory$create$1);
                            obj14 = obj13;
                            if (objB12 == obj14) {
                                return obj14;
                            }
                            journeyDetailsUiState11 = journeyDetailsUiState9;
                            priceDetailsUiState8 = priceDetailsUiState6;
                            function11 = function10;
                            confirmBookingScreenDataState17 = confirmBookingScreenDataState15;
                            obj15 = objB12;
                            tnCDialogUIState6 = tnCDialogUIState4;
                            chaloTextStyleHelper15 = chaloTextStyleHelper14;
                            chaloTextUIStateB = ChaloTextStyleHelper.b(chaloTextStyleHelper15, (String) obj15, ChaloColorToken.White.f9870a, 0, null, null, null, null, 124);
                            confirmBookingUIStateFactory$create$1.L$0 = confirmBookingScreenDataState17;
                            confirmBookingUIStateFactory$create$1.L$1 = function11;
                            confirmBookingUIStateFactory$create$1.L$2 = loadingDialogUIState11;
                            confirmBookingUIStateFactory$create$1.L$3 = toolbarUIState8;
                            confirmBookingUIStateFactory$create$1.L$4 = journeyDetailsUiState11;
                            confirmBookingUIStateFactory$create$1.L$5 = priceDetailsUiState8;
                            confirmBookingUIStateFactory$create$1.L$6 = termsAndConditionsUiState2;
                            confirmBookingUIStateFactory$create$1.L$7 = tnCDialogUIState6;
                            confirmBookingUIStateFactory$create$1.L$8 = buttonUIStateG;
                            confirmBookingUIStateFactory$create$1.L$9 = chaloTextUIStateB;
                            confirmBookingUIStateFactory$create$1.L$10 = chaloTextStyleHelper14;
                            confirmBookingScreenDataState18 = confirmBookingScreenDataState17;
                            confirmBookingUIStateFactory$create$1.label = 14;
                            objB13 = stringProvider3.b(StringEnum.RETRY, new Object[0], confirmBookingUIStateFactory$create$1);
                            if (objB13 == obj14) {
                                return obj14;
                            }
                            toolbarUIState10 = toolbarUIState8;
                            termsAndConditionsUiState4 = termsAndConditionsUiState2;
                            confirmBookingScreenDataState19 = confirmBookingScreenDataState18;
                            function12 = function11;
                            chaloTextUIState3 = chaloTextUIStateB;
                            obj16 = objB13;
                            priceDetailsUiState9 = priceDetailsUiState8;
                            chaloTextStyleHelper16 = chaloTextStyleHelper14;
                            loadingDialogUIState13 = loadingDialogUIState11;
                            journeyDetailsUiState12 = journeyDetailsUiState11;
                            ChaloColorToken.OrangePrimary orangePrimary110 = orangePrimary;
                            priceDetailsUiState7 = priceDetailsUiState9;
                            tnCDialogUIState5 = tnCDialogUIState6;
                            termsAndConditionsUiState3 = termsAndConditionsUiState4;
                            snackbarUIState = new SnackbarUIState(chaloTextUIState3, ChaloTextStyleHelper.b(chaloTextStyleHelper16, (String) obj16, orangePrimary110, 0, null, UIFontWeight.SemiBold, null, null, 108), UiEventHandler.Companion.a(new bp(function12, 16)));
                            journeyDetailsUiState10 = journeyDetailsUiState12;
                            toolbarUIState9 = toolbarUIState10;
                            loadingDialogUIState12 = loadingDialogUIState13;
                            confirmBookingScreenDataState16 = confirmBookingScreenDataState19;
                        } else {
                            confirmBookingScreenDataState16 = confirmBookingScreenDataState15;
                            journeyDetailsUiState10 = journeyDetailsUiState9;
                            tnCDialogUIState5 = tnCDialogUIState4;
                            loadingDialogUIState12 = loadingDialogUIState11;
                            toolbarUIState9 = toolbarUIState8;
                            termsAndConditionsUiState3 = termsAndConditionsUiState2;
                            priceDetailsUiState7 = priceDetailsUiState6;
                            snackbarUIState = null;
                        }
                        ButtonUIState buttonUIState19 = buttonUIStateG;
                        boolean z110 = confirmBookingScreenDataState16.k;
                        if (confirmBookingScreenDataState16.c) {
                            loadingDialogUIState14 = loadingDialogUIState12;
                        } else {
                            loadingDialogUIState14 = null;
                        }
                        return new ConfirmBookingScreenViewState(toolbarUIState9, journeyDetailsUiState10, priceDetailsUiState7, termsAndConditionsUiState3, tnCDialogUIState5, buttonUIState19, snackbarUIState, z110, loadingDialogUIState14);
                    }
                    return obj11;
                }
                obj4 = obj17;
                str4 = strA;
                if (strA2 != null) {
                    productBannerSpec = new ProductBannerSpec();
                    confirmBookingUIStateFactory$create$1.L$0 = confirmBookingScreenDataState7;
                    confirmBookingUIStateFactory$create$1.L$1 = function5;
                    confirmBookingUIStateFactory$create$1.L$2 = loadingDialogUIState3;
                    confirmBookingUIStateFactory$create$1.L$3 = toolbarUIState3;
                    confirmBookingUIStateFactory$create$1.L$4 = journeyDetailsUiState;
                    confirmBookingUIStateFactory$create$1.L$5 = str4;
                    confirmBookingUIStateFactory$create$1.L$6 = chaloTextStyleHelper7;
                    confirmBookingUIStateFactory$create$1.L$7 = productBannerSpec;
                    confirmBookingUIStateFactory$create$1.label = 5;
                    objB5 = stringProvider.b(StringEnum.DISCOUNT_TEXT_COPY, new Object[]{strA2}, confirmBookingUIStateFactory$create$1);
                    obj5 = obj4;
                    if (objB5 == obj5) {
                        return obj5;
                    }
                    function6 = function5;
                    confirmBookingScreenDataState8 = confirmBookingScreenDataState7;
                    obj6 = objB5;
                    loadingDialogUIState4 = loadingDialogUIState3;
                    journeyDetailsUiState2 = journeyDetailsUiState;
                    chaloTextStyleHelper8 = chaloTextStyleHelper7;
                    productBannerUIState = new ProductBannerUIState(productBannerSpec, ChaloTextStyleHelper.c(chaloTextStyleHelper8, (String) obj6, null, null, UIFontWeight.SemiBold, null, null, FacebookMediationAdapter.ERROR_FAILED_TO_PRESENT_AD), new ImageUIState(IconType.DISCOUNT_GREEN, (String) null, (ChaloColorToken) null, (ImageUISize) null, (UIContentScale) null, 0.0f, (UiEventHandler) null, 254));
                    confirmBookingScreenDataState7 = confirmBookingScreenDataState8;
                } else {
                    obj5 = obj4;
                    loadingDialogUIState4 = loadingDialogUIState3;
                    function6 = function5;
                    journeyDetailsUiState2 = journeyDetailsUiState;
                    productBannerUIState = null;
                }
                list7 = confirmBookingScreenDataState7.i;
                if (list7 != null) {
                    List list11114 = list7;
                    arrayList4 = new ArrayList(CollectionsKt.v(list11114, 10));
                    it2 = list11114.iterator();
                    while (it2.hasNext()) {
                        FareBreakupAppModel fareBreakupAppModel10 = (FareBreakupAppModel) it2.next();
                        FareBreakupOperationUIProperties fareBreakupOperationUIPropertiesA10 = FareBreakupOperationUIPropertiesKt.a(fareBreakupAppModel10.b, (3 & 1) != 0 ? ChaloColorToken.Black.f9759a : ChaloColorToken.AlmostBlackColor.f9756a, (3 & 2) != 0);
                        ChaloTextStyleHelper chaloTextStyleHelper216 = chaloTextStyleHelper7;
                        arrayList4.add(new FareLineUiState(ChaloTextStyleHelper.c(chaloTextStyleHelper216, fareBreakupAppModel10.f3890a, null, null, null, null, null, WebSocketProtocol.PAYLOAD_SHORT), ChaloTextStyleHelper.c(chaloTextStyleHelper216, vo1.A(fareBreakupOperationUIPropertiesA10.f8267a, currencyFeature.a(fareBreakupAppModel10.c, CurrencyRoundOffLogic.ROUND_OFF_LOGIC_NO_ROUNDING)), fareBreakupOperationUIPropertiesA10.b, null, UIFontWeight.Bold, null, null, 108)));
                        it2 = it2;
                        chaloTextStyleHelper7 = chaloTextStyleHelper216;
                        obj5 = obj5;
                    }
                } else {
                    arrayList4 = null;
                }
                chaloTextStyleHelper17 = chaloTextStyleHelper7;
                Object obj118 = obj5;
                confirmBookingUIStateFactory$create$1.L$0 = confirmBookingScreenDataState7;
                confirmBookingUIStateFactory$create$1.L$1 = function6;
                confirmBookingUIStateFactory$create$1.L$2 = loadingDialogUIState4;
                confirmBookingUIStateFactory$create$1.L$3 = toolbarUIState3;
                confirmBookingUIStateFactory$create$1.L$4 = journeyDetailsUiState2;
                confirmBookingUIStateFactory$create$1.L$5 = str4;
                confirmBookingUIStateFactory$create$1.L$6 = productBannerUIState;
                confirmBookingUIStateFactory$create$1.L$7 = arrayList4;
                confirmBookingUIStateFactory$create$1.L$8 = chaloTextStyleHelper17;
                confirmBookingUIStateFactory$create$1.label = 6;
                objB6 = stringProvider.b(StringEnum.TOTAL, new Object[0], confirmBookingUIStateFactory$create$1);
                obj7 = obj118;
                if (objB6 == obj7) {
                    return obj7;
                }
                list8 = arrayList4;
                str6 = str4;
                productBannerUIState2 = productBannerUIState;
                chaloTextStyleHelper9 = chaloTextStyleHelper17;
                confirmBookingScreenDataState9 = confirmBookingScreenDataState7;
                obj8 = objB6;
                str7 = str6;
                fareLineUiState = new FareLineUiState(ChaloTextStyleHelper.c(chaloTextStyleHelper9, (String) obj8, null, null, null, null, null, WebSocketProtocol.PAYLOAD_SHORT), ChaloTextStyleHelper.c(chaloTextStyleHelper17, str6, null, null, UIFontWeight.Bold, null, null, FacebookMediationAdapter.ERROR_FAILED_TO_PRESENT_AD));
                confirmBookingUIStateFactory$create$1.L$0 = confirmBookingScreenDataState9;
                confirmBookingUIStateFactory$create$1.L$1 = function6;
                confirmBookingUIStateFactory$create$1.L$2 = loadingDialogUIState4;
                confirmBookingUIStateFactory$create$1.L$3 = toolbarUIState3;
                confirmBookingUIStateFactory$create$1.L$4 = journeyDetailsUiState2;
                confirmBookingUIStateFactory$create$1.L$5 = str7;
                confirmBookingUIStateFactory$create$1.L$6 = productBannerUIState2;
                confirmBookingUIStateFactory$create$1.L$7 = list8;
                confirmBookingUIStateFactory$create$1.L$8 = fareLineUiState;
                confirmBookingUIStateFactory$create$1.L$9 = chaloTextStyleHelper17;
                confirmBookingUIStateFactory$create$1.label = 7;
                objB7 = stringProvider.b(StringEnum.PRICE_DETAILS, new Object[0], confirmBookingUIStateFactory$create$1);
                if (objB7 == obj7) {
                    return obj7;
                }
                fareLineUiState2 = fareLineUiState;
                chaloTextStyleHelper10 = chaloTextStyleHelper17;
                confirmBookingScreenDataState10 = confirmBookingScreenDataState9;
                function7 = function6;
                loadingDialogUIState5 = loadingDialogUIState4;
                journeyDetailsUiState3 = journeyDetailsUiState2;
                str8 = str7;
                TextUIState.ChaloTextUIState chaloTextUIStateA11 = ChaloTextStyleHelper.a(chaloTextStyleHelper10, (String) objB7, null, UIFontWeight.Bold, null, FacebookMediationAdapter.ERROR_FAILED_TO_PRESENT_AD);
                if (list8 == null) {
                    list8 = EmptyList.f17557a;
                }
                priceDetailsUiState = new PriceDetailsUiState(chaloTextUIStateA11, list8, fareLineUiState2, productBannerUIState2);
                list9 = confirmBookingScreenDataState10.j;
                if (list9 != null) {
                    if (list9.isEmpty()) {
                        list9 = null;
                    }
                    if (list9 != null) {
                        List listX9 = CollectionsKt.x0(list9, 3);
                        arrayList5 = new ArrayList(CollectionsKt.v(listX9, 10));
                        it3 = listX9.iterator();
                        i2 = 0;
                        while (it3.hasNext()) {
                            next = it3.next();
                            i3 = i2 + 1;
                            if (i2 < 0) {
                                CollectionsKt.z0();
                                throw null;
                            }
                            arrayList5.add(ChaloTextStyleHelper.c(chaloTextStyleHelper17, i3 + ". " + ((String) next), null, null, null, null, null, WebSocketProtocol.PAYLOAD_SHORT));
                            it3 = it3;
                            i2 = i3;
                        }
                        chaloTextStyleHelper12 = chaloTextStyleHelper17;
                        confirmBookingUIStateFactory$create$1.L$0 = confirmBookingScreenDataState10;
                        confirmBookingUIStateFactory$create$1.L$1 = function7;
                        confirmBookingUIStateFactory$create$1.L$2 = loadingDialogUIState5;
                        confirmBookingUIStateFactory$create$1.L$3 = toolbarUIState3;
                        confirmBookingUIStateFactory$create$1.L$4 = journeyDetailsUiState3;
                        confirmBookingUIStateFactory$create$1.L$5 = str8;
                        confirmBookingUIStateFactory$create$1.L$6 = priceDetailsUiState;
                        confirmBookingUIStateFactory$create$1.L$7 = arrayList5;
                        confirmBookingUIStateFactory$create$1.L$8 = chaloTextStyleHelper12;
                        confirmBookingUIStateFactory$create$1.L$9 = null;
                        confirmBookingUIStateFactory$create$1.label = 8;
                        objB8 = stringProvider.b(StringEnum.TERMS_AND_CONDITIONS, new Object[0], confirmBookingUIStateFactory$create$1);
                        if (objB8 == obj7) {
                            return obj7;
                        }
                        chaloTextStyleHelper13 = chaloTextStyleHelper12;
                        str10 = str8;
                        journeyDetailsUiState5 = journeyDetailsUiState3;
                        list10 = arrayList5;
                        chaloTextUIStateA = ChaloTextStyleHelper.a(chaloTextStyleHelper13, (String) objB8, null, UIFontWeight.Bold, null, FacebookMediationAdapter.ERROR_FAILED_TO_PRESENT_AD);
                        styledTextDataUIStateArr = new StyledTextDataUIState[2];
                        chaloTextStyleHelper11 = chaloTextStyleHelper12;
                        confirmBookingUIStateFactory$create$1.L$0 = confirmBookingScreenDataState10;
                        confirmBookingUIStateFactory$create$1.L$1 = function7;
                        confirmBookingUIStateFactory$create$1.L$2 = loadingDialogUIState5;
                        confirmBookingUIStateFactory$create$1.L$3 = toolbarUIState3;
                        confirmBookingUIStateFactory$create$1.L$4 = journeyDetailsUiState5;
                        confirmBookingUIStateFactory$create$1.L$5 = str10;
                        confirmBookingUIStateFactory$create$1.L$6 = priceDetailsUiState;
                        confirmBookingUIStateFactory$create$1.L$7 = styledTextDataUIStateArr;
                        confirmBookingUIStateFactory$create$1.L$8 = chaloTextUIStateA;
                        confirmBookingUIStateFactory$create$1.L$9 = list10;
                        confirmBookingUIStateFactory$create$1.L$10 = styledTextDataUIStateArr;
                        confirmBookingUIStateFactory$create$1.I$0 = 0;
                        confirmBookingUIStateFactory$create$1.label = 9;
                        objB9 = stringProvider.b(StringEnum.ALL_TNC_PREFIX, new Object[0], confirmBookingUIStateFactory$create$1);
                        if (objB9 == obj7) {
                            return obj7;
                        }
                        styledTextDataUIStateArr2 = styledTextDataUIStateArr;
                        toolbarUIState5 = toolbarUIState3;
                        priceDetailsUiState3 = priceDetailsUiState;
                        loadingDialogUIState7 = loadingDialogUIState5;
                        i4 = 0;
                        journeyDetailsUiState6 = journeyDetailsUiState5;
                        str11 = str10;
                        chaloTextUIState = chaloTextUIStateA;
                        obj10 = objB9;
                        list11 = list10;
                        styledTextDataUIStateArr2[i4] = new StyledTextDataUIState(obj10 + " ", null, null, UITextStyle.BodySmall, null, null, null, 1014);
                        confirmBookingUIStateFactory$create$1.L$0 = confirmBookingScreenDataState10;
                        confirmBookingUIStateFactory$create$1.L$1 = function7;
                        confirmBookingUIStateFactory$create$1.L$2 = loadingDialogUIState7;
                        confirmBookingUIStateFactory$create$1.L$3 = toolbarUIState5;
                        confirmBookingUIStateFactory$create$1.L$4 = journeyDetailsUiState6;
                        confirmBookingUIStateFactory$create$1.L$5 = str11;
                        confirmBookingUIStateFactory$create$1.L$6 = priceDetailsUiState3;
                        confirmBookingUIStateFactory$create$1.L$7 = styledTextDataUIStateArr;
                        confirmBookingUIStateFactory$create$1.L$8 = chaloTextUIState;
                        confirmBookingUIStateFactory$create$1.L$9 = list11;
                        confirmBookingUIStateFactory$create$1.L$10 = styledTextDataUIStateArr;
                        confirmBookingUIStateFactory$create$1.I$0 = 1;
                        confirmBookingUIStateFactory$create$1.label = 10;
                        objB10 = stringProvider.b(StringEnum.TNC_CLICKABLE_TEXT, new Object[0], confirmBookingUIStateFactory$create$1);
                        if (objB10 == obj7) {
                            return obj7;
                        }
                        styledTextDataUIStateArr3 = styledTextDataUIStateArr;
                        str12 = str11;
                        loadingDialogUIState8 = loadingDialogUIState7;
                        confirmBookingScreenDataState12 = confirmBookingScreenDataState10;
                        toolbarUIState6 = toolbarUIState5;
                        i5 = 1;
                        chaloTextUIState2 = chaloTextUIState;
                        function8 = function7;
                        list12 = list11;
                        styledTextDataUIStateArr4 = styledTextDataUIStateArr3;
                        priceDetailsUiState4 = priceDetailsUiState3;
                        journeyDetailsUiState7 = journeyDetailsUiState6;
                        String str1111 = (String) objB10;
                        obj9 = obj7;
                        tnCDialogUIState = null;
                        styledTextDataUIStateArr4[i5] = new StyledTextDataUIState(str1111, orangePrimary, UIFontWeight.Bold, UITextStyle.BodySmall, null, null, new StyledTextClickHandler() { // from class: app.chalo.metro.ui.confirmbooking.uistate.ConfirmBookingUIStateFactory$create$termsAndConditionsUiState$2$1
                            @Override // app.chalo.uistate.text.StyledTextClickHandler
                            public final void a() {
                                function8.invoke(ConfirmBookingScreenViewIntent.OnTermsAndConditionsClicked.f5468a);
                            }

                            @Override // app.chalo.uistate.text.StyledTextClickHandler
                            /* JADX INFO: renamed from: b */
                            public final String getB() {
                                return "TNC_CLICKABLE_TEXT";
                            }

                            @Override // app.chalo.uistate.text.StyledTextClickHandler
                            /* JADX INFO: renamed from: getTag */
                            public final String getF10085a() {
                                return "TNC_CLICKABLE_TEXT";
                            }
                        }, 496);
                        termsAndConditionsUiState = new TermsAndConditionsUiState(chaloTextUIState2, list12, new TextUIState.StyledTextUIState(CollectionsKt.S(styledTextDataUIStateArr3), null, null, 30));
                        function7 = function8;
                        confirmBookingScreenDataState11 = confirmBookingScreenDataState12;
                        priceDetailsUiState2 = priceDetailsUiState4;
                        str9 = str12;
                        journeyDetailsUiState4 = journeyDetailsUiState7;
                        loadingDialogUIState6 = loadingDialogUIState8;
                        toolbarUIState4 = toolbarUIState6;
                    }
                    z = confirmBookingScreenDataState11.m;
                    List list11115 = confirmBookingScreenDataState11.j;
                    if (z) {
                        break;
                    }
                    obj11 = obj9;
                    JourneyDetailsUiState journeyDetailsUiState1112 = journeyDetailsUiState4;
                    priceDetailsUiState5 = priceDetailsUiState2;
                    loadingDialogUIState9 = loadingDialogUIState6;
                    toolbarUIState7 = toolbarUIState4;
                    journeyDetailsUiState8 = journeyDetailsUiState1112;
                    Function1 function1115 = function7;
                    confirmBookingScreenDataState13 = confirmBookingScreenDataState11;
                    function9 = function1115;
                    tnCDialogUIState2 = tnCDialogUIState;
                    StringEnum stringEnum110 = StringEnum.FARE_DETAILS_PAY;
                    Object[] objArr110 = {str9};
                    confirmBookingUIStateFactory$create$1.L$0 = confirmBookingScreenDataState13;
                    confirmBookingUIStateFactory$create$1.L$1 = function9;
                    confirmBookingUIStateFactory$create$1.L$2 = loadingDialogUIState9;
                    confirmBookingUIStateFactory$create$1.L$3 = toolbarUIState7;
                    confirmBookingUIStateFactory$create$1.L$4 = journeyDetailsUiState8;
                    confirmBookingUIStateFactory$create$1.L$5 = priceDetailsUiState5;
                    confirmBookingUIStateFactory$create$1.L$6 = termsAndConditionsUiState;
                    confirmBookingUIStateFactory$create$1.L$7 = tnCDialogUIState2;
                    buttonUIStateFactory = ButtonUIStateFactory.f9921a;
                    confirmBookingUIStateFactory$create$1.L$8 = buttonUIStateFactory;
                    confirmBookingUIStateFactory$create$1.L$9 = tnCDialogUIState;
                    confirmBookingUIStateFactory$create$1.L$10 = tnCDialogUIState;
                    confirmBookingUIStateFactory$create$1.label = 12;
                    objB11 = stringProvider.b(stringEnum110, objArr110, confirmBookingUIStateFactory$create$1);
                    if (objB11 != obj11) {
                        priceDetailsUiState6 = priceDetailsUiState5;
                        termsAndConditionsUiState2 = termsAndConditionsUiState;
                        confirmBookingScreenDataState14 = confirmBookingScreenDataState13;
                        loadingDialogUIState10 = loadingDialogUIState9;
                        buttonUIStateFactory2 = buttonUIStateFactory;
                        tnCDialogUIState3 = tnCDialogUIState2;
                        function10 = function9;
                        confirmBookingScreenDataState15 = confirmBookingScreenDataState14;
                        journeyDetailsUiState9 = journeyDetailsUiState8;
                        tnCDialogUIState4 = tnCDialogUIState3;
                        loadingDialogUIState11 = loadingDialogUIState10;
                        stringProvider2 = stringProvider;
                        obj13 = obj11;
                        toolbarUIState8 = toolbarUIState7;
                        buttonUIStateG = ButtonUIStateFactory.g(buttonUIStateFactory2, (String) objB11, new bp(function10, 15), null, UIShape.d, true, 0.0f, 36);
                        if (confirmBookingScreenDataState15.l) {
                            confirmBookingUIStateFactory$create$1.L$0 = confirmBookingScreenDataState15;
                            confirmBookingUIStateFactory$create$1.L$1 = function10;
                            confirmBookingUIStateFactory$create$1.L$2 = loadingDialogUIState11;
                            confirmBookingUIStateFactory$create$1.L$3 = toolbarUIState8;
                            confirmBookingUIStateFactory$create$1.L$4 = journeyDetailsUiState9;
                            confirmBookingUIStateFactory$create$1.L$5 = priceDetailsUiState6;
                            confirmBookingUIStateFactory$create$1.L$6 = termsAndConditionsUiState2;
                            confirmBookingUIStateFactory$create$1.L$7 = tnCDialogUIState4;
                            confirmBookingUIStateFactory$create$1.L$8 = buttonUIStateG;
                            chaloTextStyleHelper14 = chaloTextStyleHelper11;
                            confirmBookingUIStateFactory$create$1.L$9 = chaloTextStyleHelper14;
                            confirmBookingUIStateFactory$create$1.label = 13;
                            stringProvider3 = stringProvider2;
                            objB12 = stringProvider3.b(StringEnum.SOMETHING_WENT_WRONG, new Object[0], confirmBookingUIStateFactory$create$1);
                            obj14 = obj13;
                            if (objB12 == obj14) {
                                return obj14;
                            }
                            journeyDetailsUiState11 = journeyDetailsUiState9;
                            priceDetailsUiState8 = priceDetailsUiState6;
                            function11 = function10;
                            confirmBookingScreenDataState17 = confirmBookingScreenDataState15;
                            obj15 = objB12;
                            tnCDialogUIState6 = tnCDialogUIState4;
                            chaloTextStyleHelper15 = chaloTextStyleHelper14;
                            chaloTextUIStateB = ChaloTextStyleHelper.b(chaloTextStyleHelper15, (String) obj15, ChaloColorToken.White.f9870a, 0, null, null, null, null, 124);
                            confirmBookingUIStateFactory$create$1.L$0 = confirmBookingScreenDataState17;
                            confirmBookingUIStateFactory$create$1.L$1 = function11;
                            confirmBookingUIStateFactory$create$1.L$2 = loadingDialogUIState11;
                            confirmBookingUIStateFactory$create$1.L$3 = toolbarUIState8;
                            confirmBookingUIStateFactory$create$1.L$4 = journeyDetailsUiState11;
                            confirmBookingUIStateFactory$create$1.L$5 = priceDetailsUiState8;
                            confirmBookingUIStateFactory$create$1.L$6 = termsAndConditionsUiState2;
                            confirmBookingUIStateFactory$create$1.L$7 = tnCDialogUIState6;
                            confirmBookingUIStateFactory$create$1.L$8 = buttonUIStateG;
                            confirmBookingUIStateFactory$create$1.L$9 = chaloTextUIStateB;
                            confirmBookingUIStateFactory$create$1.L$10 = chaloTextStyleHelper14;
                            confirmBookingScreenDataState18 = confirmBookingScreenDataState17;
                            confirmBookingUIStateFactory$create$1.label = 14;
                            objB13 = stringProvider3.b(StringEnum.RETRY, new Object[0], confirmBookingUIStateFactory$create$1);
                            if (objB13 == obj14) {
                                return obj14;
                            }
                            toolbarUIState10 = toolbarUIState8;
                            termsAndConditionsUiState4 = termsAndConditionsUiState2;
                            confirmBookingScreenDataState19 = confirmBookingScreenDataState18;
                            function12 = function11;
                            chaloTextUIState3 = chaloTextUIStateB;
                            obj16 = objB13;
                            priceDetailsUiState9 = priceDetailsUiState8;
                            chaloTextStyleHelper16 = chaloTextStyleHelper14;
                            loadingDialogUIState13 = loadingDialogUIState11;
                            journeyDetailsUiState12 = journeyDetailsUiState11;
                            ChaloColorToken.OrangePrimary orangePrimary111 = orangePrimary;
                            priceDetailsUiState7 = priceDetailsUiState9;
                            tnCDialogUIState5 = tnCDialogUIState6;
                            termsAndConditionsUiState3 = termsAndConditionsUiState4;
                            snackbarUIState = new SnackbarUIState(chaloTextUIState3, ChaloTextStyleHelper.b(chaloTextStyleHelper16, (String) obj16, orangePrimary111, 0, null, UIFontWeight.SemiBold, null, null, 108), UiEventHandler.Companion.a(new bp(function12, 16)));
                            journeyDetailsUiState10 = journeyDetailsUiState12;
                            toolbarUIState9 = toolbarUIState10;
                            loadingDialogUIState12 = loadingDialogUIState13;
                            confirmBookingScreenDataState16 = confirmBookingScreenDataState19;
                        } else {
                            confirmBookingScreenDataState16 = confirmBookingScreenDataState15;
                            journeyDetailsUiState10 = journeyDetailsUiState9;
                            tnCDialogUIState5 = tnCDialogUIState4;
                            loadingDialogUIState12 = loadingDialogUIState11;
                            toolbarUIState9 = toolbarUIState8;
                            termsAndConditionsUiState3 = termsAndConditionsUiState2;
                            priceDetailsUiState7 = priceDetailsUiState6;
                            snackbarUIState = null;
                        }
                        ButtonUIState buttonUIState110 = buttonUIStateG;
                        boolean z111 = confirmBookingScreenDataState16.k;
                        if (confirmBookingScreenDataState16.c) {
                            loadingDialogUIState14 = loadingDialogUIState12;
                        } else {
                            loadingDialogUIState14 = null;
                        }
                        return new ConfirmBookingScreenViewState(toolbarUIState9, journeyDetailsUiState10, priceDetailsUiState7, termsAndConditionsUiState3, tnCDialogUIState5, buttonUIState110, snackbarUIState, z111, loadingDialogUIState14);
                    }
                    return obj11;
                }
                obj9 = obj7;
                chaloTextStyleHelper11 = chaloTextStyleHelper17;
                tnCDialogUIState = null;
                termsAndConditionsUiState = null;
                journeyDetailsUiState4 = journeyDetailsUiState3;
                str9 = str8;
                toolbarUIState4 = toolbarUIState3;
                priceDetailsUiState2 = priceDetailsUiState;
                loadingDialogUIState6 = loadingDialogUIState5;
                confirmBookingScreenDataState11 = confirmBookingScreenDataState10;
                z = confirmBookingScreenDataState11.m;
                List list11116 = confirmBookingScreenDataState11.j;
                if (z) {
                    break;
                }
                obj11 = obj9;
                JourneyDetailsUiState journeyDetailsUiState1113 = journeyDetailsUiState4;
                priceDetailsUiState5 = priceDetailsUiState2;
                loadingDialogUIState9 = loadingDialogUIState6;
                toolbarUIState7 = toolbarUIState4;
                journeyDetailsUiState8 = journeyDetailsUiState1113;
                Function1 function1116 = function7;
                confirmBookingScreenDataState13 = confirmBookingScreenDataState11;
                function9 = function1116;
                tnCDialogUIState2 = tnCDialogUIState;
                StringEnum stringEnum111 = StringEnum.FARE_DETAILS_PAY;
                Object[] objArr111 = {str9};
                confirmBookingUIStateFactory$create$1.L$0 = confirmBookingScreenDataState13;
                confirmBookingUIStateFactory$create$1.L$1 = function9;
                confirmBookingUIStateFactory$create$1.L$2 = loadingDialogUIState9;
                confirmBookingUIStateFactory$create$1.L$3 = toolbarUIState7;
                confirmBookingUIStateFactory$create$1.L$4 = journeyDetailsUiState8;
                confirmBookingUIStateFactory$create$1.L$5 = priceDetailsUiState5;
                confirmBookingUIStateFactory$create$1.L$6 = termsAndConditionsUiState;
                confirmBookingUIStateFactory$create$1.L$7 = tnCDialogUIState2;
                buttonUIStateFactory = ButtonUIStateFactory.f9921a;
                confirmBookingUIStateFactory$create$1.L$8 = buttonUIStateFactory;
                confirmBookingUIStateFactory$create$1.L$9 = tnCDialogUIState;
                confirmBookingUIStateFactory$create$1.L$10 = tnCDialogUIState;
                confirmBookingUIStateFactory$create$1.label = 12;
                objB11 = stringProvider.b(stringEnum111, objArr111, confirmBookingUIStateFactory$create$1);
                if (objB11 != obj11) {
                    priceDetailsUiState6 = priceDetailsUiState5;
                    termsAndConditionsUiState2 = termsAndConditionsUiState;
                    confirmBookingScreenDataState14 = confirmBookingScreenDataState13;
                    loadingDialogUIState10 = loadingDialogUIState9;
                    buttonUIStateFactory2 = buttonUIStateFactory;
                    tnCDialogUIState3 = tnCDialogUIState2;
                    function10 = function9;
                    confirmBookingScreenDataState15 = confirmBookingScreenDataState14;
                    journeyDetailsUiState9 = journeyDetailsUiState8;
                    tnCDialogUIState4 = tnCDialogUIState3;
                    loadingDialogUIState11 = loadingDialogUIState10;
                    stringProvider2 = stringProvider;
                    obj13 = obj11;
                    toolbarUIState8 = toolbarUIState7;
                    buttonUIStateG = ButtonUIStateFactory.g(buttonUIStateFactory2, (String) objB11, new bp(function10, 15), null, UIShape.d, true, 0.0f, 36);
                    if (confirmBookingScreenDataState15.l) {
                        confirmBookingUIStateFactory$create$1.L$0 = confirmBookingScreenDataState15;
                        confirmBookingUIStateFactory$create$1.L$1 = function10;
                        confirmBookingUIStateFactory$create$1.L$2 = loadingDialogUIState11;
                        confirmBookingUIStateFactory$create$1.L$3 = toolbarUIState8;
                        confirmBookingUIStateFactory$create$1.L$4 = journeyDetailsUiState9;
                        confirmBookingUIStateFactory$create$1.L$5 = priceDetailsUiState6;
                        confirmBookingUIStateFactory$create$1.L$6 = termsAndConditionsUiState2;
                        confirmBookingUIStateFactory$create$1.L$7 = tnCDialogUIState4;
                        confirmBookingUIStateFactory$create$1.L$8 = buttonUIStateG;
                        chaloTextStyleHelper14 = chaloTextStyleHelper11;
                        confirmBookingUIStateFactory$create$1.L$9 = chaloTextStyleHelper14;
                        confirmBookingUIStateFactory$create$1.label = 13;
                        stringProvider3 = stringProvider2;
                        objB12 = stringProvider3.b(StringEnum.SOMETHING_WENT_WRONG, new Object[0], confirmBookingUIStateFactory$create$1);
                        obj14 = obj13;
                        if (objB12 == obj14) {
                            return obj14;
                        }
                        journeyDetailsUiState11 = journeyDetailsUiState9;
                        priceDetailsUiState8 = priceDetailsUiState6;
                        function11 = function10;
                        confirmBookingScreenDataState17 = confirmBookingScreenDataState15;
                        obj15 = objB12;
                        tnCDialogUIState6 = tnCDialogUIState4;
                        chaloTextStyleHelper15 = chaloTextStyleHelper14;
                        chaloTextUIStateB = ChaloTextStyleHelper.b(chaloTextStyleHelper15, (String) obj15, ChaloColorToken.White.f9870a, 0, null, null, null, null, 124);
                        confirmBookingUIStateFactory$create$1.L$0 = confirmBookingScreenDataState17;
                        confirmBookingUIStateFactory$create$1.L$1 = function11;
                        confirmBookingUIStateFactory$create$1.L$2 = loadingDialogUIState11;
                        confirmBookingUIStateFactory$create$1.L$3 = toolbarUIState8;
                        confirmBookingUIStateFactory$create$1.L$4 = journeyDetailsUiState11;
                        confirmBookingUIStateFactory$create$1.L$5 = priceDetailsUiState8;
                        confirmBookingUIStateFactory$create$1.L$6 = termsAndConditionsUiState2;
                        confirmBookingUIStateFactory$create$1.L$7 = tnCDialogUIState6;
                        confirmBookingUIStateFactory$create$1.L$8 = buttonUIStateG;
                        confirmBookingUIStateFactory$create$1.L$9 = chaloTextUIStateB;
                        confirmBookingUIStateFactory$create$1.L$10 = chaloTextStyleHelper14;
                        confirmBookingScreenDataState18 = confirmBookingScreenDataState17;
                        confirmBookingUIStateFactory$create$1.label = 14;
                        objB13 = stringProvider3.b(StringEnum.RETRY, new Object[0], confirmBookingUIStateFactory$create$1);
                        if (objB13 == obj14) {
                            return obj14;
                        }
                        toolbarUIState10 = toolbarUIState8;
                        termsAndConditionsUiState4 = termsAndConditionsUiState2;
                        confirmBookingScreenDataState19 = confirmBookingScreenDataState18;
                        function12 = function11;
                        chaloTextUIState3 = chaloTextUIStateB;
                        obj16 = objB13;
                        priceDetailsUiState9 = priceDetailsUiState8;
                        chaloTextStyleHelper16 = chaloTextStyleHelper14;
                        loadingDialogUIState13 = loadingDialogUIState11;
                        journeyDetailsUiState12 = journeyDetailsUiState11;
                        ChaloColorToken.OrangePrimary orangePrimary112 = orangePrimary;
                        priceDetailsUiState7 = priceDetailsUiState9;
                        tnCDialogUIState5 = tnCDialogUIState6;
                        termsAndConditionsUiState3 = termsAndConditionsUiState4;
                        snackbarUIState = new SnackbarUIState(chaloTextUIState3, ChaloTextStyleHelper.b(chaloTextStyleHelper16, (String) obj16, orangePrimary112, 0, null, UIFontWeight.SemiBold, null, null, 108), UiEventHandler.Companion.a(new bp(function12, 16)));
                        journeyDetailsUiState10 = journeyDetailsUiState12;
                        toolbarUIState9 = toolbarUIState10;
                        loadingDialogUIState12 = loadingDialogUIState13;
                        confirmBookingScreenDataState16 = confirmBookingScreenDataState19;
                    } else {
                        confirmBookingScreenDataState16 = confirmBookingScreenDataState15;
                        journeyDetailsUiState10 = journeyDetailsUiState9;
                        tnCDialogUIState5 = tnCDialogUIState4;
                        loadingDialogUIState12 = loadingDialogUIState11;
                        toolbarUIState9 = toolbarUIState8;
                        termsAndConditionsUiState3 = termsAndConditionsUiState2;
                        priceDetailsUiState7 = priceDetailsUiState6;
                        snackbarUIState = null;
                    }
                    ButtonUIState buttonUIState111 = buttonUIStateG;
                    boolean z112 = confirmBookingScreenDataState16.k;
                    if (confirmBookingScreenDataState16.c) {
                        loadingDialogUIState14 = loadingDialogUIState12;
                    } else {
                        loadingDialogUIState14 = null;
                    }
                    return new ConfirmBookingScreenViewState(toolbarUIState9, journeyDetailsUiState10, priceDetailsUiState7, termsAndConditionsUiState3, tnCDialogUIState5, buttonUIState111, snackbarUIState, z112, loadingDialogUIState14);
                }
                return obj11;
            case 5:
                ProductBannerSpec productBannerSpec2 = (ProductBannerSpec) confirmBookingUIStateFactory$create$1.L$7;
                ChaloTextStyleHelper chaloTextStyleHelper32 = (ChaloTextStyleHelper) confirmBookingUIStateFactory$create$1.L$6;
                String str20 = (String) confirmBookingUIStateFactory$create$1.L$5;
                journeyDetailsUiState2 = (JourneyDetailsUiState) confirmBookingUIStateFactory$create$1.L$4;
                toolbarUIState3 = (ToolbarUIState) confirmBookingUIStateFactory$create$1.L$3;
                LoadingDialogUIState loadingDialogUIState17 = (LoadingDialogUIState) confirmBookingUIStateFactory$create$1.L$2;
                function6 = (Function1) confirmBookingUIStateFactory$create$1.L$1;
                ConfirmBookingScreenDataState confirmBookingScreenDataState23 = (ConfirmBookingScreenDataState) confirmBookingUIStateFactory$create$1.L$0;
                ResultKt.b(obj16);
                obj5 = obj17;
                loadingDialogUIState4 = loadingDialogUIState17;
                chaloTextStyleHelper8 = chaloTextStyleHelper32;
                orangePrimary = orangePrimary;
                confirmBookingScreenDataState8 = confirmBookingScreenDataState23;
                stringProvider = stringProvider4;
                productBannerSpec = productBannerSpec2;
                str4 = str20;
                chaloTextStyleHelper7 = chaloTextStyleHelper17;
                obj6 = obj16;
                productBannerUIState = new ProductBannerUIState(productBannerSpec, ChaloTextStyleHelper.c(chaloTextStyleHelper8, (String) obj6, null, null, UIFontWeight.SemiBold, null, null, FacebookMediationAdapter.ERROR_FAILED_TO_PRESENT_AD), new ImageUIState(IconType.DISCOUNT_GREEN, (String) null, (ChaloColorToken) null, (ImageUISize) null, (UIContentScale) null, 0.0f, (UiEventHandler) null, 254));
                confirmBookingScreenDataState7 = confirmBookingScreenDataState8;
                list7 = confirmBookingScreenDataState7.i;
                if (list7 != null) {
                    List list11117 = list7;
                    arrayList4 = new ArrayList(CollectionsKt.v(list11117, 10));
                    it2 = list11117.iterator();
                    while (it2.hasNext()) {
                        FareBreakupAppModel fareBreakupAppModel11 = (FareBreakupAppModel) it2.next();
                        FareBreakupOperationUIProperties fareBreakupOperationUIPropertiesA11 = FareBreakupOperationUIPropertiesKt.a(fareBreakupAppModel11.b, (3 & 1) != 0 ? ChaloColorToken.Black.f9759a : ChaloColorToken.AlmostBlackColor.f9756a, (3 & 2) != 0);
                        ChaloTextStyleHelper chaloTextStyleHelper217 = chaloTextStyleHelper7;
                        arrayList4.add(new FareLineUiState(ChaloTextStyleHelper.c(chaloTextStyleHelper217, fareBreakupAppModel11.f3890a, null, null, null, null, null, WebSocketProtocol.PAYLOAD_SHORT), ChaloTextStyleHelper.c(chaloTextStyleHelper217, vo1.A(fareBreakupOperationUIPropertiesA11.f8267a, currencyFeature.a(fareBreakupAppModel11.c, CurrencyRoundOffLogic.ROUND_OFF_LOGIC_NO_ROUNDING)), fareBreakupOperationUIPropertiesA11.b, null, UIFontWeight.Bold, null, null, 108)));
                        it2 = it2;
                        chaloTextStyleHelper7 = chaloTextStyleHelper217;
                        obj5 = obj5;
                    }
                } else {
                    arrayList4 = null;
                }
                chaloTextStyleHelper17 = chaloTextStyleHelper7;
                Object obj119 = obj5;
                confirmBookingUIStateFactory$create$1.L$0 = confirmBookingScreenDataState7;
                confirmBookingUIStateFactory$create$1.L$1 = function6;
                confirmBookingUIStateFactory$create$1.L$2 = loadingDialogUIState4;
                confirmBookingUIStateFactory$create$1.L$3 = toolbarUIState3;
                confirmBookingUIStateFactory$create$1.L$4 = journeyDetailsUiState2;
                confirmBookingUIStateFactory$create$1.L$5 = str4;
                confirmBookingUIStateFactory$create$1.L$6 = productBannerUIState;
                confirmBookingUIStateFactory$create$1.L$7 = arrayList4;
                confirmBookingUIStateFactory$create$1.L$8 = chaloTextStyleHelper17;
                confirmBookingUIStateFactory$create$1.label = 6;
                objB6 = stringProvider.b(StringEnum.TOTAL, new Object[0], confirmBookingUIStateFactory$create$1);
                obj7 = obj119;
                if (objB6 == obj7) {
                    return obj7;
                }
                list8 = arrayList4;
                str6 = str4;
                productBannerUIState2 = productBannerUIState;
                chaloTextStyleHelper9 = chaloTextStyleHelper17;
                confirmBookingScreenDataState9 = confirmBookingScreenDataState7;
                obj8 = objB6;
                str7 = str6;
                fareLineUiState = new FareLineUiState(ChaloTextStyleHelper.c(chaloTextStyleHelper9, (String) obj8, null, null, null, null, null, WebSocketProtocol.PAYLOAD_SHORT), ChaloTextStyleHelper.c(chaloTextStyleHelper17, str6, null, null, UIFontWeight.Bold, null, null, FacebookMediationAdapter.ERROR_FAILED_TO_PRESENT_AD));
                confirmBookingUIStateFactory$create$1.L$0 = confirmBookingScreenDataState9;
                confirmBookingUIStateFactory$create$1.L$1 = function6;
                confirmBookingUIStateFactory$create$1.L$2 = loadingDialogUIState4;
                confirmBookingUIStateFactory$create$1.L$3 = toolbarUIState3;
                confirmBookingUIStateFactory$create$1.L$4 = journeyDetailsUiState2;
                confirmBookingUIStateFactory$create$1.L$5 = str7;
                confirmBookingUIStateFactory$create$1.L$6 = productBannerUIState2;
                confirmBookingUIStateFactory$create$1.L$7 = list8;
                confirmBookingUIStateFactory$create$1.L$8 = fareLineUiState;
                confirmBookingUIStateFactory$create$1.L$9 = chaloTextStyleHelper17;
                confirmBookingUIStateFactory$create$1.label = 7;
                objB7 = stringProvider.b(StringEnum.PRICE_DETAILS, new Object[0], confirmBookingUIStateFactory$create$1);
                if (objB7 == obj7) {
                    return obj7;
                }
                fareLineUiState2 = fareLineUiState;
                chaloTextStyleHelper10 = chaloTextStyleHelper17;
                confirmBookingScreenDataState10 = confirmBookingScreenDataState9;
                function7 = function6;
                loadingDialogUIState5 = loadingDialogUIState4;
                journeyDetailsUiState3 = journeyDetailsUiState2;
                str8 = str7;
                TextUIState.ChaloTextUIState chaloTextUIStateA12 = ChaloTextStyleHelper.a(chaloTextStyleHelper10, (String) objB7, null, UIFontWeight.Bold, null, FacebookMediationAdapter.ERROR_FAILED_TO_PRESENT_AD);
                if (list8 == null) {
                    list8 = EmptyList.f17557a;
                }
                priceDetailsUiState = new PriceDetailsUiState(chaloTextUIStateA12, list8, fareLineUiState2, productBannerUIState2);
                list9 = confirmBookingScreenDataState10.j;
                if (list9 != null) {
                    if (list9.isEmpty()) {
                        list9 = null;
                    }
                    if (list9 != null) {
                        List listX10 = CollectionsKt.x0(list9, 3);
                        arrayList5 = new ArrayList(CollectionsKt.v(listX10, 10));
                        it3 = listX10.iterator();
                        i2 = 0;
                        while (it3.hasNext()) {
                            next = it3.next();
                            i3 = i2 + 1;
                            if (i2 < 0) {
                                CollectionsKt.z0();
                                throw null;
                            }
                            arrayList5.add(ChaloTextStyleHelper.c(chaloTextStyleHelper17, i3 + ". " + ((String) next), null, null, null, null, null, WebSocketProtocol.PAYLOAD_SHORT));
                            it3 = it3;
                            i2 = i3;
                        }
                        chaloTextStyleHelper12 = chaloTextStyleHelper17;
                        confirmBookingUIStateFactory$create$1.L$0 = confirmBookingScreenDataState10;
                        confirmBookingUIStateFactory$create$1.L$1 = function7;
                        confirmBookingUIStateFactory$create$1.L$2 = loadingDialogUIState5;
                        confirmBookingUIStateFactory$create$1.L$3 = toolbarUIState3;
                        confirmBookingUIStateFactory$create$1.L$4 = journeyDetailsUiState3;
                        confirmBookingUIStateFactory$create$1.L$5 = str8;
                        confirmBookingUIStateFactory$create$1.L$6 = priceDetailsUiState;
                        confirmBookingUIStateFactory$create$1.L$7 = arrayList5;
                        confirmBookingUIStateFactory$create$1.L$8 = chaloTextStyleHelper12;
                        confirmBookingUIStateFactory$create$1.L$9 = null;
                        confirmBookingUIStateFactory$create$1.label = 8;
                        objB8 = stringProvider.b(StringEnum.TERMS_AND_CONDITIONS, new Object[0], confirmBookingUIStateFactory$create$1);
                        if (objB8 == obj7) {
                            return obj7;
                        }
                        chaloTextStyleHelper13 = chaloTextStyleHelper12;
                        str10 = str8;
                        journeyDetailsUiState5 = journeyDetailsUiState3;
                        list10 = arrayList5;
                        chaloTextUIStateA = ChaloTextStyleHelper.a(chaloTextStyleHelper13, (String) objB8, null, UIFontWeight.Bold, null, FacebookMediationAdapter.ERROR_FAILED_TO_PRESENT_AD);
                        styledTextDataUIStateArr = new StyledTextDataUIState[2];
                        chaloTextStyleHelper11 = chaloTextStyleHelper12;
                        confirmBookingUIStateFactory$create$1.L$0 = confirmBookingScreenDataState10;
                        confirmBookingUIStateFactory$create$1.L$1 = function7;
                        confirmBookingUIStateFactory$create$1.L$2 = loadingDialogUIState5;
                        confirmBookingUIStateFactory$create$1.L$3 = toolbarUIState3;
                        confirmBookingUIStateFactory$create$1.L$4 = journeyDetailsUiState5;
                        confirmBookingUIStateFactory$create$1.L$5 = str10;
                        confirmBookingUIStateFactory$create$1.L$6 = priceDetailsUiState;
                        confirmBookingUIStateFactory$create$1.L$7 = styledTextDataUIStateArr;
                        confirmBookingUIStateFactory$create$1.L$8 = chaloTextUIStateA;
                        confirmBookingUIStateFactory$create$1.L$9 = list10;
                        confirmBookingUIStateFactory$create$1.L$10 = styledTextDataUIStateArr;
                        confirmBookingUIStateFactory$create$1.I$0 = 0;
                        confirmBookingUIStateFactory$create$1.label = 9;
                        objB9 = stringProvider.b(StringEnum.ALL_TNC_PREFIX, new Object[0], confirmBookingUIStateFactory$create$1);
                        if (objB9 == obj7) {
                            return obj7;
                        }
                        styledTextDataUIStateArr2 = styledTextDataUIStateArr;
                        toolbarUIState5 = toolbarUIState3;
                        priceDetailsUiState3 = priceDetailsUiState;
                        loadingDialogUIState7 = loadingDialogUIState5;
                        i4 = 0;
                        journeyDetailsUiState6 = journeyDetailsUiState5;
                        str11 = str10;
                        chaloTextUIState = chaloTextUIStateA;
                        obj10 = objB9;
                        list11 = list10;
                        styledTextDataUIStateArr2[i4] = new StyledTextDataUIState(obj10 + " ", null, null, UITextStyle.BodySmall, null, null, null, 1014);
                        confirmBookingUIStateFactory$create$1.L$0 = confirmBookingScreenDataState10;
                        confirmBookingUIStateFactory$create$1.L$1 = function7;
                        confirmBookingUIStateFactory$create$1.L$2 = loadingDialogUIState7;
                        confirmBookingUIStateFactory$create$1.L$3 = toolbarUIState5;
                        confirmBookingUIStateFactory$create$1.L$4 = journeyDetailsUiState6;
                        confirmBookingUIStateFactory$create$1.L$5 = str11;
                        confirmBookingUIStateFactory$create$1.L$6 = priceDetailsUiState3;
                        confirmBookingUIStateFactory$create$1.L$7 = styledTextDataUIStateArr;
                        confirmBookingUIStateFactory$create$1.L$8 = chaloTextUIState;
                        confirmBookingUIStateFactory$create$1.L$9 = list11;
                        confirmBookingUIStateFactory$create$1.L$10 = styledTextDataUIStateArr;
                        confirmBookingUIStateFactory$create$1.I$0 = 1;
                        confirmBookingUIStateFactory$create$1.label = 10;
                        objB10 = stringProvider.b(StringEnum.TNC_CLICKABLE_TEXT, new Object[0], confirmBookingUIStateFactory$create$1);
                        if (objB10 == obj7) {
                            return obj7;
                        }
                        styledTextDataUIStateArr3 = styledTextDataUIStateArr;
                        str12 = str11;
                        loadingDialogUIState8 = loadingDialogUIState7;
                        confirmBookingScreenDataState12 = confirmBookingScreenDataState10;
                        toolbarUIState6 = toolbarUIState5;
                        i5 = 1;
                        chaloTextUIState2 = chaloTextUIState;
                        function8 = function7;
                        list12 = list11;
                        styledTextDataUIStateArr4 = styledTextDataUIStateArr3;
                        priceDetailsUiState4 = priceDetailsUiState3;
                        journeyDetailsUiState7 = journeyDetailsUiState6;
                        String str1112 = (String) objB10;
                        obj9 = obj7;
                        tnCDialogUIState = null;
                        styledTextDataUIStateArr4[i5] = new StyledTextDataUIState(str1112, orangePrimary, UIFontWeight.Bold, UITextStyle.BodySmall, null, null, new StyledTextClickHandler() { // from class: app.chalo.metro.ui.confirmbooking.uistate.ConfirmBookingUIStateFactory$create$termsAndConditionsUiState$2$1
                            @Override // app.chalo.uistate.text.StyledTextClickHandler
                            public final void a() {
                                function8.invoke(ConfirmBookingScreenViewIntent.OnTermsAndConditionsClicked.f5468a);
                            }

                            @Override // app.chalo.uistate.text.StyledTextClickHandler
                            /* JADX INFO: renamed from: b */
                            public final String getB() {
                                return "TNC_CLICKABLE_TEXT";
                            }

                            @Override // app.chalo.uistate.text.StyledTextClickHandler
                            /* JADX INFO: renamed from: getTag */
                            public final String getF10085a() {
                                return "TNC_CLICKABLE_TEXT";
                            }
                        }, 496);
                        termsAndConditionsUiState = new TermsAndConditionsUiState(chaloTextUIState2, list12, new TextUIState.StyledTextUIState(CollectionsKt.S(styledTextDataUIStateArr3), null, null, 30));
                        function7 = function8;
                        confirmBookingScreenDataState11 = confirmBookingScreenDataState12;
                        priceDetailsUiState2 = priceDetailsUiState4;
                        str9 = str12;
                        journeyDetailsUiState4 = journeyDetailsUiState7;
                        loadingDialogUIState6 = loadingDialogUIState8;
                        toolbarUIState4 = toolbarUIState6;
                    }
                    z = confirmBookingScreenDataState11.m;
                    List list11118 = confirmBookingScreenDataState11.j;
                    if (z) {
                        break;
                    }
                    obj11 = obj9;
                    JourneyDetailsUiState journeyDetailsUiState1114 = journeyDetailsUiState4;
                    priceDetailsUiState5 = priceDetailsUiState2;
                    loadingDialogUIState9 = loadingDialogUIState6;
                    toolbarUIState7 = toolbarUIState4;
                    journeyDetailsUiState8 = journeyDetailsUiState1114;
                    Function1 function1117 = function7;
                    confirmBookingScreenDataState13 = confirmBookingScreenDataState11;
                    function9 = function1117;
                    tnCDialogUIState2 = tnCDialogUIState;
                    StringEnum stringEnum112 = StringEnum.FARE_DETAILS_PAY;
                    Object[] objArr112 = {str9};
                    confirmBookingUIStateFactory$create$1.L$0 = confirmBookingScreenDataState13;
                    confirmBookingUIStateFactory$create$1.L$1 = function9;
                    confirmBookingUIStateFactory$create$1.L$2 = loadingDialogUIState9;
                    confirmBookingUIStateFactory$create$1.L$3 = toolbarUIState7;
                    confirmBookingUIStateFactory$create$1.L$4 = journeyDetailsUiState8;
                    confirmBookingUIStateFactory$create$1.L$5 = priceDetailsUiState5;
                    confirmBookingUIStateFactory$create$1.L$6 = termsAndConditionsUiState;
                    confirmBookingUIStateFactory$create$1.L$7 = tnCDialogUIState2;
                    buttonUIStateFactory = ButtonUIStateFactory.f9921a;
                    confirmBookingUIStateFactory$create$1.L$8 = buttonUIStateFactory;
                    confirmBookingUIStateFactory$create$1.L$9 = tnCDialogUIState;
                    confirmBookingUIStateFactory$create$1.L$10 = tnCDialogUIState;
                    confirmBookingUIStateFactory$create$1.label = 12;
                    objB11 = stringProvider.b(stringEnum112, objArr112, confirmBookingUIStateFactory$create$1);
                    if (objB11 != obj11) {
                        priceDetailsUiState6 = priceDetailsUiState5;
                        termsAndConditionsUiState2 = termsAndConditionsUiState;
                        confirmBookingScreenDataState14 = confirmBookingScreenDataState13;
                        loadingDialogUIState10 = loadingDialogUIState9;
                        buttonUIStateFactory2 = buttonUIStateFactory;
                        tnCDialogUIState3 = tnCDialogUIState2;
                        function10 = function9;
                        confirmBookingScreenDataState15 = confirmBookingScreenDataState14;
                        journeyDetailsUiState9 = journeyDetailsUiState8;
                        tnCDialogUIState4 = tnCDialogUIState3;
                        loadingDialogUIState11 = loadingDialogUIState10;
                        stringProvider2 = stringProvider;
                        obj13 = obj11;
                        toolbarUIState8 = toolbarUIState7;
                        buttonUIStateG = ButtonUIStateFactory.g(buttonUIStateFactory2, (String) objB11, new bp(function10, 15), null, UIShape.d, true, 0.0f, 36);
                        if (confirmBookingScreenDataState15.l) {
                            confirmBookingUIStateFactory$create$1.L$0 = confirmBookingScreenDataState15;
                            confirmBookingUIStateFactory$create$1.L$1 = function10;
                            confirmBookingUIStateFactory$create$1.L$2 = loadingDialogUIState11;
                            confirmBookingUIStateFactory$create$1.L$3 = toolbarUIState8;
                            confirmBookingUIStateFactory$create$1.L$4 = journeyDetailsUiState9;
                            confirmBookingUIStateFactory$create$1.L$5 = priceDetailsUiState6;
                            confirmBookingUIStateFactory$create$1.L$6 = termsAndConditionsUiState2;
                            confirmBookingUIStateFactory$create$1.L$7 = tnCDialogUIState4;
                            confirmBookingUIStateFactory$create$1.L$8 = buttonUIStateG;
                            chaloTextStyleHelper14 = chaloTextStyleHelper11;
                            confirmBookingUIStateFactory$create$1.L$9 = chaloTextStyleHelper14;
                            confirmBookingUIStateFactory$create$1.label = 13;
                            stringProvider3 = stringProvider2;
                            objB12 = stringProvider3.b(StringEnum.SOMETHING_WENT_WRONG, new Object[0], confirmBookingUIStateFactory$create$1);
                            obj14 = obj13;
                            if (objB12 == obj14) {
                                return obj14;
                            }
                            journeyDetailsUiState11 = journeyDetailsUiState9;
                            priceDetailsUiState8 = priceDetailsUiState6;
                            function11 = function10;
                            confirmBookingScreenDataState17 = confirmBookingScreenDataState15;
                            obj15 = objB12;
                            tnCDialogUIState6 = tnCDialogUIState4;
                            chaloTextStyleHelper15 = chaloTextStyleHelper14;
                            chaloTextUIStateB = ChaloTextStyleHelper.b(chaloTextStyleHelper15, (String) obj15, ChaloColorToken.White.f9870a, 0, null, null, null, null, 124);
                            confirmBookingUIStateFactory$create$1.L$0 = confirmBookingScreenDataState17;
                            confirmBookingUIStateFactory$create$1.L$1 = function11;
                            confirmBookingUIStateFactory$create$1.L$2 = loadingDialogUIState11;
                            confirmBookingUIStateFactory$create$1.L$3 = toolbarUIState8;
                            confirmBookingUIStateFactory$create$1.L$4 = journeyDetailsUiState11;
                            confirmBookingUIStateFactory$create$1.L$5 = priceDetailsUiState8;
                            confirmBookingUIStateFactory$create$1.L$6 = termsAndConditionsUiState2;
                            confirmBookingUIStateFactory$create$1.L$7 = tnCDialogUIState6;
                            confirmBookingUIStateFactory$create$1.L$8 = buttonUIStateG;
                            confirmBookingUIStateFactory$create$1.L$9 = chaloTextUIStateB;
                            confirmBookingUIStateFactory$create$1.L$10 = chaloTextStyleHelper14;
                            confirmBookingScreenDataState18 = confirmBookingScreenDataState17;
                            confirmBookingUIStateFactory$create$1.label = 14;
                            objB13 = stringProvider3.b(StringEnum.RETRY, new Object[0], confirmBookingUIStateFactory$create$1);
                            if (objB13 == obj14) {
                                return obj14;
                            }
                            toolbarUIState10 = toolbarUIState8;
                            termsAndConditionsUiState4 = termsAndConditionsUiState2;
                            confirmBookingScreenDataState19 = confirmBookingScreenDataState18;
                            function12 = function11;
                            chaloTextUIState3 = chaloTextUIStateB;
                            obj16 = objB13;
                            priceDetailsUiState9 = priceDetailsUiState8;
                            chaloTextStyleHelper16 = chaloTextStyleHelper14;
                            loadingDialogUIState13 = loadingDialogUIState11;
                            journeyDetailsUiState12 = journeyDetailsUiState11;
                            ChaloColorToken.OrangePrimary orangePrimary113 = orangePrimary;
                            priceDetailsUiState7 = priceDetailsUiState9;
                            tnCDialogUIState5 = tnCDialogUIState6;
                            termsAndConditionsUiState3 = termsAndConditionsUiState4;
                            snackbarUIState = new SnackbarUIState(chaloTextUIState3, ChaloTextStyleHelper.b(chaloTextStyleHelper16, (String) obj16, orangePrimary113, 0, null, UIFontWeight.SemiBold, null, null, 108), UiEventHandler.Companion.a(new bp(function12, 16)));
                            journeyDetailsUiState10 = journeyDetailsUiState12;
                            toolbarUIState9 = toolbarUIState10;
                            loadingDialogUIState12 = loadingDialogUIState13;
                            confirmBookingScreenDataState16 = confirmBookingScreenDataState19;
                        } else {
                            confirmBookingScreenDataState16 = confirmBookingScreenDataState15;
                            journeyDetailsUiState10 = journeyDetailsUiState9;
                            tnCDialogUIState5 = tnCDialogUIState4;
                            loadingDialogUIState12 = loadingDialogUIState11;
                            toolbarUIState9 = toolbarUIState8;
                            termsAndConditionsUiState3 = termsAndConditionsUiState2;
                            priceDetailsUiState7 = priceDetailsUiState6;
                            snackbarUIState = null;
                        }
                        ButtonUIState buttonUIState112 = buttonUIStateG;
                        boolean z113 = confirmBookingScreenDataState16.k;
                        if (confirmBookingScreenDataState16.c) {
                            loadingDialogUIState14 = loadingDialogUIState12;
                        } else {
                            loadingDialogUIState14 = null;
                        }
                        return new ConfirmBookingScreenViewState(toolbarUIState9, journeyDetailsUiState10, priceDetailsUiState7, termsAndConditionsUiState3, tnCDialogUIState5, buttonUIState112, snackbarUIState, z113, loadingDialogUIState14);
                    }
                    return obj11;
                }
                obj9 = obj7;
                chaloTextStyleHelper11 = chaloTextStyleHelper17;
                tnCDialogUIState = null;
                termsAndConditionsUiState = null;
                journeyDetailsUiState4 = journeyDetailsUiState3;
                str9 = str8;
                toolbarUIState4 = toolbarUIState3;
                priceDetailsUiState2 = priceDetailsUiState;
                loadingDialogUIState6 = loadingDialogUIState5;
                confirmBookingScreenDataState11 = confirmBookingScreenDataState10;
                z = confirmBookingScreenDataState11.m;
                List list11119 = confirmBookingScreenDataState11.j;
                if (z) {
                    break;
                }
                obj11 = obj9;
                JourneyDetailsUiState journeyDetailsUiState1115 = journeyDetailsUiState4;
                priceDetailsUiState5 = priceDetailsUiState2;
                loadingDialogUIState9 = loadingDialogUIState6;
                toolbarUIState7 = toolbarUIState4;
                journeyDetailsUiState8 = journeyDetailsUiState1115;
                Function1 function1118 = function7;
                confirmBookingScreenDataState13 = confirmBookingScreenDataState11;
                function9 = function1118;
                tnCDialogUIState2 = tnCDialogUIState;
                StringEnum stringEnum113 = StringEnum.FARE_DETAILS_PAY;
                Object[] objArr113 = {str9};
                confirmBookingUIStateFactory$create$1.L$0 = confirmBookingScreenDataState13;
                confirmBookingUIStateFactory$create$1.L$1 = function9;
                confirmBookingUIStateFactory$create$1.L$2 = loadingDialogUIState9;
                confirmBookingUIStateFactory$create$1.L$3 = toolbarUIState7;
                confirmBookingUIStateFactory$create$1.L$4 = journeyDetailsUiState8;
                confirmBookingUIStateFactory$create$1.L$5 = priceDetailsUiState5;
                confirmBookingUIStateFactory$create$1.L$6 = termsAndConditionsUiState;
                confirmBookingUIStateFactory$create$1.L$7 = tnCDialogUIState2;
                buttonUIStateFactory = ButtonUIStateFactory.f9921a;
                confirmBookingUIStateFactory$create$1.L$8 = buttonUIStateFactory;
                confirmBookingUIStateFactory$create$1.L$9 = tnCDialogUIState;
                confirmBookingUIStateFactory$create$1.L$10 = tnCDialogUIState;
                confirmBookingUIStateFactory$create$1.label = 12;
                objB11 = stringProvider.b(stringEnum113, objArr113, confirmBookingUIStateFactory$create$1);
                if (objB11 != obj11) {
                    priceDetailsUiState6 = priceDetailsUiState5;
                    termsAndConditionsUiState2 = termsAndConditionsUiState;
                    confirmBookingScreenDataState14 = confirmBookingScreenDataState13;
                    loadingDialogUIState10 = loadingDialogUIState9;
                    buttonUIStateFactory2 = buttonUIStateFactory;
                    tnCDialogUIState3 = tnCDialogUIState2;
                    function10 = function9;
                    confirmBookingScreenDataState15 = confirmBookingScreenDataState14;
                    journeyDetailsUiState9 = journeyDetailsUiState8;
                    tnCDialogUIState4 = tnCDialogUIState3;
                    loadingDialogUIState11 = loadingDialogUIState10;
                    stringProvider2 = stringProvider;
                    obj13 = obj11;
                    toolbarUIState8 = toolbarUIState7;
                    buttonUIStateG = ButtonUIStateFactory.g(buttonUIStateFactory2, (String) objB11, new bp(function10, 15), null, UIShape.d, true, 0.0f, 36);
                    if (confirmBookingScreenDataState15.l) {
                        confirmBookingUIStateFactory$create$1.L$0 = confirmBookingScreenDataState15;
                        confirmBookingUIStateFactory$create$1.L$1 = function10;
                        confirmBookingUIStateFactory$create$1.L$2 = loadingDialogUIState11;
                        confirmBookingUIStateFactory$create$1.L$3 = toolbarUIState8;
                        confirmBookingUIStateFactory$create$1.L$4 = journeyDetailsUiState9;
                        confirmBookingUIStateFactory$create$1.L$5 = priceDetailsUiState6;
                        confirmBookingUIStateFactory$create$1.L$6 = termsAndConditionsUiState2;
                        confirmBookingUIStateFactory$create$1.L$7 = tnCDialogUIState4;
                        confirmBookingUIStateFactory$create$1.L$8 = buttonUIStateG;
                        chaloTextStyleHelper14 = chaloTextStyleHelper11;
                        confirmBookingUIStateFactory$create$1.L$9 = chaloTextStyleHelper14;
                        confirmBookingUIStateFactory$create$1.label = 13;
                        stringProvider3 = stringProvider2;
                        objB12 = stringProvider3.b(StringEnum.SOMETHING_WENT_WRONG, new Object[0], confirmBookingUIStateFactory$create$1);
                        obj14 = obj13;
                        if (objB12 == obj14) {
                            return obj14;
                        }
                        journeyDetailsUiState11 = journeyDetailsUiState9;
                        priceDetailsUiState8 = priceDetailsUiState6;
                        function11 = function10;
                        confirmBookingScreenDataState17 = confirmBookingScreenDataState15;
                        obj15 = objB12;
                        tnCDialogUIState6 = tnCDialogUIState4;
                        chaloTextStyleHelper15 = chaloTextStyleHelper14;
                        chaloTextUIStateB = ChaloTextStyleHelper.b(chaloTextStyleHelper15, (String) obj15, ChaloColorToken.White.f9870a, 0, null, null, null, null, 124);
                        confirmBookingUIStateFactory$create$1.L$0 = confirmBookingScreenDataState17;
                        confirmBookingUIStateFactory$create$1.L$1 = function11;
                        confirmBookingUIStateFactory$create$1.L$2 = loadingDialogUIState11;
                        confirmBookingUIStateFactory$create$1.L$3 = toolbarUIState8;
                        confirmBookingUIStateFactory$create$1.L$4 = journeyDetailsUiState11;
                        confirmBookingUIStateFactory$create$1.L$5 = priceDetailsUiState8;
                        confirmBookingUIStateFactory$create$1.L$6 = termsAndConditionsUiState2;
                        confirmBookingUIStateFactory$create$1.L$7 = tnCDialogUIState6;
                        confirmBookingUIStateFactory$create$1.L$8 = buttonUIStateG;
                        confirmBookingUIStateFactory$create$1.L$9 = chaloTextUIStateB;
                        confirmBookingUIStateFactory$create$1.L$10 = chaloTextStyleHelper14;
                        confirmBookingScreenDataState18 = confirmBookingScreenDataState17;
                        confirmBookingUIStateFactory$create$1.label = 14;
                        objB13 = stringProvider3.b(StringEnum.RETRY, new Object[0], confirmBookingUIStateFactory$create$1);
                        if (objB13 == obj14) {
                            return obj14;
                        }
                        toolbarUIState10 = toolbarUIState8;
                        termsAndConditionsUiState4 = termsAndConditionsUiState2;
                        confirmBookingScreenDataState19 = confirmBookingScreenDataState18;
                        function12 = function11;
                        chaloTextUIState3 = chaloTextUIStateB;
                        obj16 = objB13;
                        priceDetailsUiState9 = priceDetailsUiState8;
                        chaloTextStyleHelper16 = chaloTextStyleHelper14;
                        loadingDialogUIState13 = loadingDialogUIState11;
                        journeyDetailsUiState12 = journeyDetailsUiState11;
                        ChaloColorToken.OrangePrimary orangePrimary114 = orangePrimary;
                        priceDetailsUiState7 = priceDetailsUiState9;
                        tnCDialogUIState5 = tnCDialogUIState6;
                        termsAndConditionsUiState3 = termsAndConditionsUiState4;
                        snackbarUIState = new SnackbarUIState(chaloTextUIState3, ChaloTextStyleHelper.b(chaloTextStyleHelper16, (String) obj16, orangePrimary114, 0, null, UIFontWeight.SemiBold, null, null, 108), UiEventHandler.Companion.a(new bp(function12, 16)));
                        journeyDetailsUiState10 = journeyDetailsUiState12;
                        toolbarUIState9 = toolbarUIState10;
                        loadingDialogUIState12 = loadingDialogUIState13;
                        confirmBookingScreenDataState16 = confirmBookingScreenDataState19;
                    } else {
                        confirmBookingScreenDataState16 = confirmBookingScreenDataState15;
                        journeyDetailsUiState10 = journeyDetailsUiState9;
                        tnCDialogUIState5 = tnCDialogUIState4;
                        loadingDialogUIState12 = loadingDialogUIState11;
                        toolbarUIState9 = toolbarUIState8;
                        termsAndConditionsUiState3 = termsAndConditionsUiState2;
                        priceDetailsUiState7 = priceDetailsUiState6;
                        snackbarUIState = null;
                    }
                    ButtonUIState buttonUIState113 = buttonUIStateG;
                    boolean z114 = confirmBookingScreenDataState16.k;
                    if (confirmBookingScreenDataState16.c) {
                        loadingDialogUIState14 = loadingDialogUIState12;
                    } else {
                        loadingDialogUIState14 = null;
                    }
                    return new ConfirmBookingScreenViewState(toolbarUIState9, journeyDetailsUiState10, priceDetailsUiState7, termsAndConditionsUiState3, tnCDialogUIState5, buttonUIState113, snackbarUIState, z114, loadingDialogUIState14);
                }
                return obj11;
            case 6:
                ChaloTextStyleHelper chaloTextStyleHelper33 = (ChaloTextStyleHelper) confirmBookingUIStateFactory$create$1.L$8;
                List list20 = (List) confirmBookingUIStateFactory$create$1.L$7;
                ProductBannerUIState productBannerUIState3 = (ProductBannerUIState) confirmBookingUIStateFactory$create$1.L$6;
                String str21 = (String) confirmBookingUIStateFactory$create$1.L$5;
                journeyDetailsUiState2 = (JourneyDetailsUiState) confirmBookingUIStateFactory$create$1.L$4;
                toolbarUIState3 = (ToolbarUIState) confirmBookingUIStateFactory$create$1.L$3;
                LoadingDialogUIState loadingDialogUIState18 = (LoadingDialogUIState) confirmBookingUIStateFactory$create$1.L$2;
                function6 = (Function1) confirmBookingUIStateFactory$create$1.L$1;
                confirmBookingScreenDataState9 = (ConfirmBookingScreenDataState) confirmBookingUIStateFactory$create$1.L$0;
                ResultKt.b(obj16);
                obj7 = obj17;
                loadingDialogUIState4 = loadingDialogUIState18;
                chaloTextStyleHelper9 = chaloTextStyleHelper33;
                orangePrimary = orangePrimary;
                stringProvider = stringProvider4;
                obj8 = obj16;
                str6 = str21;
                productBannerUIState2 = productBannerUIState3;
                list8 = list20;
                str7 = str6;
                fareLineUiState = new FareLineUiState(ChaloTextStyleHelper.c(chaloTextStyleHelper9, (String) obj8, null, null, null, null, null, WebSocketProtocol.PAYLOAD_SHORT), ChaloTextStyleHelper.c(chaloTextStyleHelper17, str6, null, null, UIFontWeight.Bold, null, null, FacebookMediationAdapter.ERROR_FAILED_TO_PRESENT_AD));
                confirmBookingUIStateFactory$create$1.L$0 = confirmBookingScreenDataState9;
                confirmBookingUIStateFactory$create$1.L$1 = function6;
                confirmBookingUIStateFactory$create$1.L$2 = loadingDialogUIState4;
                confirmBookingUIStateFactory$create$1.L$3 = toolbarUIState3;
                confirmBookingUIStateFactory$create$1.L$4 = journeyDetailsUiState2;
                confirmBookingUIStateFactory$create$1.L$5 = str7;
                confirmBookingUIStateFactory$create$1.L$6 = productBannerUIState2;
                confirmBookingUIStateFactory$create$1.L$7 = list8;
                confirmBookingUIStateFactory$create$1.L$8 = fareLineUiState;
                confirmBookingUIStateFactory$create$1.L$9 = chaloTextStyleHelper17;
                confirmBookingUIStateFactory$create$1.label = 7;
                objB7 = stringProvider.b(StringEnum.PRICE_DETAILS, new Object[0], confirmBookingUIStateFactory$create$1);
                if (objB7 == obj7) {
                    return obj7;
                }
                fareLineUiState2 = fareLineUiState;
                chaloTextStyleHelper10 = chaloTextStyleHelper17;
                confirmBookingScreenDataState10 = confirmBookingScreenDataState9;
                function7 = function6;
                loadingDialogUIState5 = loadingDialogUIState4;
                journeyDetailsUiState3 = journeyDetailsUiState2;
                str8 = str7;
                TextUIState.ChaloTextUIState chaloTextUIStateA13 = ChaloTextStyleHelper.a(chaloTextStyleHelper10, (String) objB7, null, UIFontWeight.Bold, null, FacebookMediationAdapter.ERROR_FAILED_TO_PRESENT_AD);
                if (list8 == null) {
                    list8 = EmptyList.f17557a;
                }
                priceDetailsUiState = new PriceDetailsUiState(chaloTextUIStateA13, list8, fareLineUiState2, productBannerUIState2);
                list9 = confirmBookingScreenDataState10.j;
                if (list9 != null) {
                    if (list9.isEmpty()) {
                        list9 = null;
                    }
                    if (list9 != null) {
                        List listX11 = CollectionsKt.x0(list9, 3);
                        arrayList5 = new ArrayList(CollectionsKt.v(listX11, 10));
                        it3 = listX11.iterator();
                        i2 = 0;
                        while (it3.hasNext()) {
                            next = it3.next();
                            i3 = i2 + 1;
                            if (i2 < 0) {
                                CollectionsKt.z0();
                                throw null;
                            }
                            arrayList5.add(ChaloTextStyleHelper.c(chaloTextStyleHelper17, i3 + ". " + ((String) next), null, null, null, null, null, WebSocketProtocol.PAYLOAD_SHORT));
                            it3 = it3;
                            i2 = i3;
                        }
                        chaloTextStyleHelper12 = chaloTextStyleHelper17;
                        confirmBookingUIStateFactory$create$1.L$0 = confirmBookingScreenDataState10;
                        confirmBookingUIStateFactory$create$1.L$1 = function7;
                        confirmBookingUIStateFactory$create$1.L$2 = loadingDialogUIState5;
                        confirmBookingUIStateFactory$create$1.L$3 = toolbarUIState3;
                        confirmBookingUIStateFactory$create$1.L$4 = journeyDetailsUiState3;
                        confirmBookingUIStateFactory$create$1.L$5 = str8;
                        confirmBookingUIStateFactory$create$1.L$6 = priceDetailsUiState;
                        confirmBookingUIStateFactory$create$1.L$7 = arrayList5;
                        confirmBookingUIStateFactory$create$1.L$8 = chaloTextStyleHelper12;
                        confirmBookingUIStateFactory$create$1.L$9 = null;
                        confirmBookingUIStateFactory$create$1.label = 8;
                        objB8 = stringProvider.b(StringEnum.TERMS_AND_CONDITIONS, new Object[0], confirmBookingUIStateFactory$create$1);
                        if (objB8 == obj7) {
                            return obj7;
                        }
                        chaloTextStyleHelper13 = chaloTextStyleHelper12;
                        str10 = str8;
                        journeyDetailsUiState5 = journeyDetailsUiState3;
                        list10 = arrayList5;
                        chaloTextUIStateA = ChaloTextStyleHelper.a(chaloTextStyleHelper13, (String) objB8, null, UIFontWeight.Bold, null, FacebookMediationAdapter.ERROR_FAILED_TO_PRESENT_AD);
                        styledTextDataUIStateArr = new StyledTextDataUIState[2];
                        chaloTextStyleHelper11 = chaloTextStyleHelper12;
                        confirmBookingUIStateFactory$create$1.L$0 = confirmBookingScreenDataState10;
                        confirmBookingUIStateFactory$create$1.L$1 = function7;
                        confirmBookingUIStateFactory$create$1.L$2 = loadingDialogUIState5;
                        confirmBookingUIStateFactory$create$1.L$3 = toolbarUIState3;
                        confirmBookingUIStateFactory$create$1.L$4 = journeyDetailsUiState5;
                        confirmBookingUIStateFactory$create$1.L$5 = str10;
                        confirmBookingUIStateFactory$create$1.L$6 = priceDetailsUiState;
                        confirmBookingUIStateFactory$create$1.L$7 = styledTextDataUIStateArr;
                        confirmBookingUIStateFactory$create$1.L$8 = chaloTextUIStateA;
                        confirmBookingUIStateFactory$create$1.L$9 = list10;
                        confirmBookingUIStateFactory$create$1.L$10 = styledTextDataUIStateArr;
                        confirmBookingUIStateFactory$create$1.I$0 = 0;
                        confirmBookingUIStateFactory$create$1.label = 9;
                        objB9 = stringProvider.b(StringEnum.ALL_TNC_PREFIX, new Object[0], confirmBookingUIStateFactory$create$1);
                        if (objB9 == obj7) {
                            return obj7;
                        }
                        styledTextDataUIStateArr2 = styledTextDataUIStateArr;
                        toolbarUIState5 = toolbarUIState3;
                        priceDetailsUiState3 = priceDetailsUiState;
                        loadingDialogUIState7 = loadingDialogUIState5;
                        i4 = 0;
                        journeyDetailsUiState6 = journeyDetailsUiState5;
                        str11 = str10;
                        chaloTextUIState = chaloTextUIStateA;
                        obj10 = objB9;
                        list11 = list10;
                        styledTextDataUIStateArr2[i4] = new StyledTextDataUIState(obj10 + " ", null, null, UITextStyle.BodySmall, null, null, null, 1014);
                        confirmBookingUIStateFactory$create$1.L$0 = confirmBookingScreenDataState10;
                        confirmBookingUIStateFactory$create$1.L$1 = function7;
                        confirmBookingUIStateFactory$create$1.L$2 = loadingDialogUIState7;
                        confirmBookingUIStateFactory$create$1.L$3 = toolbarUIState5;
                        confirmBookingUIStateFactory$create$1.L$4 = journeyDetailsUiState6;
                        confirmBookingUIStateFactory$create$1.L$5 = str11;
                        confirmBookingUIStateFactory$create$1.L$6 = priceDetailsUiState3;
                        confirmBookingUIStateFactory$create$1.L$7 = styledTextDataUIStateArr;
                        confirmBookingUIStateFactory$create$1.L$8 = chaloTextUIState;
                        confirmBookingUIStateFactory$create$1.L$9 = list11;
                        confirmBookingUIStateFactory$create$1.L$10 = styledTextDataUIStateArr;
                        confirmBookingUIStateFactory$create$1.I$0 = 1;
                        confirmBookingUIStateFactory$create$1.label = 10;
                        objB10 = stringProvider.b(StringEnum.TNC_CLICKABLE_TEXT, new Object[0], confirmBookingUIStateFactory$create$1);
                        if (objB10 == obj7) {
                            return obj7;
                        }
                        styledTextDataUIStateArr3 = styledTextDataUIStateArr;
                        str12 = str11;
                        loadingDialogUIState8 = loadingDialogUIState7;
                        confirmBookingScreenDataState12 = confirmBookingScreenDataState10;
                        toolbarUIState6 = toolbarUIState5;
                        i5 = 1;
                        chaloTextUIState2 = chaloTextUIState;
                        function8 = function7;
                        list12 = list11;
                        styledTextDataUIStateArr4 = styledTextDataUIStateArr3;
                        priceDetailsUiState4 = priceDetailsUiState3;
                        journeyDetailsUiState7 = journeyDetailsUiState6;
                        String str1113 = (String) objB10;
                        obj9 = obj7;
                        tnCDialogUIState = null;
                        styledTextDataUIStateArr4[i5] = new StyledTextDataUIState(str1113, orangePrimary, UIFontWeight.Bold, UITextStyle.BodySmall, null, null, new StyledTextClickHandler() { // from class: app.chalo.metro.ui.confirmbooking.uistate.ConfirmBookingUIStateFactory$create$termsAndConditionsUiState$2$1
                            @Override // app.chalo.uistate.text.StyledTextClickHandler
                            public final void a() {
                                function8.invoke(ConfirmBookingScreenViewIntent.OnTermsAndConditionsClicked.f5468a);
                            }

                            @Override // app.chalo.uistate.text.StyledTextClickHandler
                            /* JADX INFO: renamed from: b */
                            public final String getB() {
                                return "TNC_CLICKABLE_TEXT";
                            }

                            @Override // app.chalo.uistate.text.StyledTextClickHandler
                            /* JADX INFO: renamed from: getTag */
                            public final String getF10085a() {
                                return "TNC_CLICKABLE_TEXT";
                            }
                        }, 496);
                        termsAndConditionsUiState = new TermsAndConditionsUiState(chaloTextUIState2, list12, new TextUIState.StyledTextUIState(CollectionsKt.S(styledTextDataUIStateArr3), null, null, 30));
                        function7 = function8;
                        confirmBookingScreenDataState11 = confirmBookingScreenDataState12;
                        priceDetailsUiState2 = priceDetailsUiState4;
                        str9 = str12;
                        journeyDetailsUiState4 = journeyDetailsUiState7;
                        loadingDialogUIState6 = loadingDialogUIState8;
                        toolbarUIState4 = toolbarUIState6;
                    }
                    z = confirmBookingScreenDataState11.m;
                    List list111110 = confirmBookingScreenDataState11.j;
                    if (z) {
                        break;
                    }
                    obj11 = obj9;
                    JourneyDetailsUiState journeyDetailsUiState1116 = journeyDetailsUiState4;
                    priceDetailsUiState5 = priceDetailsUiState2;
                    loadingDialogUIState9 = loadingDialogUIState6;
                    toolbarUIState7 = toolbarUIState4;
                    journeyDetailsUiState8 = journeyDetailsUiState1116;
                    Function1 function1119 = function7;
                    confirmBookingScreenDataState13 = confirmBookingScreenDataState11;
                    function9 = function1119;
                    tnCDialogUIState2 = tnCDialogUIState;
                    StringEnum stringEnum114 = StringEnum.FARE_DETAILS_PAY;
                    Object[] objArr114 = {str9};
                    confirmBookingUIStateFactory$create$1.L$0 = confirmBookingScreenDataState13;
                    confirmBookingUIStateFactory$create$1.L$1 = function9;
                    confirmBookingUIStateFactory$create$1.L$2 = loadingDialogUIState9;
                    confirmBookingUIStateFactory$create$1.L$3 = toolbarUIState7;
                    confirmBookingUIStateFactory$create$1.L$4 = journeyDetailsUiState8;
                    confirmBookingUIStateFactory$create$1.L$5 = priceDetailsUiState5;
                    confirmBookingUIStateFactory$create$1.L$6 = termsAndConditionsUiState;
                    confirmBookingUIStateFactory$create$1.L$7 = tnCDialogUIState2;
                    buttonUIStateFactory = ButtonUIStateFactory.f9921a;
                    confirmBookingUIStateFactory$create$1.L$8 = buttonUIStateFactory;
                    confirmBookingUIStateFactory$create$1.L$9 = tnCDialogUIState;
                    confirmBookingUIStateFactory$create$1.L$10 = tnCDialogUIState;
                    confirmBookingUIStateFactory$create$1.label = 12;
                    objB11 = stringProvider.b(stringEnum114, objArr114, confirmBookingUIStateFactory$create$1);
                    if (objB11 != obj11) {
                        priceDetailsUiState6 = priceDetailsUiState5;
                        termsAndConditionsUiState2 = termsAndConditionsUiState;
                        confirmBookingScreenDataState14 = confirmBookingScreenDataState13;
                        loadingDialogUIState10 = loadingDialogUIState9;
                        buttonUIStateFactory2 = buttonUIStateFactory;
                        tnCDialogUIState3 = tnCDialogUIState2;
                        function10 = function9;
                        confirmBookingScreenDataState15 = confirmBookingScreenDataState14;
                        journeyDetailsUiState9 = journeyDetailsUiState8;
                        tnCDialogUIState4 = tnCDialogUIState3;
                        loadingDialogUIState11 = loadingDialogUIState10;
                        stringProvider2 = stringProvider;
                        obj13 = obj11;
                        toolbarUIState8 = toolbarUIState7;
                        buttonUIStateG = ButtonUIStateFactory.g(buttonUIStateFactory2, (String) objB11, new bp(function10, 15), null, UIShape.d, true, 0.0f, 36);
                        if (confirmBookingScreenDataState15.l) {
                            confirmBookingUIStateFactory$create$1.L$0 = confirmBookingScreenDataState15;
                            confirmBookingUIStateFactory$create$1.L$1 = function10;
                            confirmBookingUIStateFactory$create$1.L$2 = loadingDialogUIState11;
                            confirmBookingUIStateFactory$create$1.L$3 = toolbarUIState8;
                            confirmBookingUIStateFactory$create$1.L$4 = journeyDetailsUiState9;
                            confirmBookingUIStateFactory$create$1.L$5 = priceDetailsUiState6;
                            confirmBookingUIStateFactory$create$1.L$6 = termsAndConditionsUiState2;
                            confirmBookingUIStateFactory$create$1.L$7 = tnCDialogUIState4;
                            confirmBookingUIStateFactory$create$1.L$8 = buttonUIStateG;
                            chaloTextStyleHelper14 = chaloTextStyleHelper11;
                            confirmBookingUIStateFactory$create$1.L$9 = chaloTextStyleHelper14;
                            confirmBookingUIStateFactory$create$1.label = 13;
                            stringProvider3 = stringProvider2;
                            objB12 = stringProvider3.b(StringEnum.SOMETHING_WENT_WRONG, new Object[0], confirmBookingUIStateFactory$create$1);
                            obj14 = obj13;
                            if (objB12 == obj14) {
                                return obj14;
                            }
                            journeyDetailsUiState11 = journeyDetailsUiState9;
                            priceDetailsUiState8 = priceDetailsUiState6;
                            function11 = function10;
                            confirmBookingScreenDataState17 = confirmBookingScreenDataState15;
                            obj15 = objB12;
                            tnCDialogUIState6 = tnCDialogUIState4;
                            chaloTextStyleHelper15 = chaloTextStyleHelper14;
                            chaloTextUIStateB = ChaloTextStyleHelper.b(chaloTextStyleHelper15, (String) obj15, ChaloColorToken.White.f9870a, 0, null, null, null, null, 124);
                            confirmBookingUIStateFactory$create$1.L$0 = confirmBookingScreenDataState17;
                            confirmBookingUIStateFactory$create$1.L$1 = function11;
                            confirmBookingUIStateFactory$create$1.L$2 = loadingDialogUIState11;
                            confirmBookingUIStateFactory$create$1.L$3 = toolbarUIState8;
                            confirmBookingUIStateFactory$create$1.L$4 = journeyDetailsUiState11;
                            confirmBookingUIStateFactory$create$1.L$5 = priceDetailsUiState8;
                            confirmBookingUIStateFactory$create$1.L$6 = termsAndConditionsUiState2;
                            confirmBookingUIStateFactory$create$1.L$7 = tnCDialogUIState6;
                            confirmBookingUIStateFactory$create$1.L$8 = buttonUIStateG;
                            confirmBookingUIStateFactory$create$1.L$9 = chaloTextUIStateB;
                            confirmBookingUIStateFactory$create$1.L$10 = chaloTextStyleHelper14;
                            confirmBookingScreenDataState18 = confirmBookingScreenDataState17;
                            confirmBookingUIStateFactory$create$1.label = 14;
                            objB13 = stringProvider3.b(StringEnum.RETRY, new Object[0], confirmBookingUIStateFactory$create$1);
                            if (objB13 == obj14) {
                                return obj14;
                            }
                            toolbarUIState10 = toolbarUIState8;
                            termsAndConditionsUiState4 = termsAndConditionsUiState2;
                            confirmBookingScreenDataState19 = confirmBookingScreenDataState18;
                            function12 = function11;
                            chaloTextUIState3 = chaloTextUIStateB;
                            obj16 = objB13;
                            priceDetailsUiState9 = priceDetailsUiState8;
                            chaloTextStyleHelper16 = chaloTextStyleHelper14;
                            loadingDialogUIState13 = loadingDialogUIState11;
                            journeyDetailsUiState12 = journeyDetailsUiState11;
                            ChaloColorToken.OrangePrimary orangePrimary115 = orangePrimary;
                            priceDetailsUiState7 = priceDetailsUiState9;
                            tnCDialogUIState5 = tnCDialogUIState6;
                            termsAndConditionsUiState3 = termsAndConditionsUiState4;
                            snackbarUIState = new SnackbarUIState(chaloTextUIState3, ChaloTextStyleHelper.b(chaloTextStyleHelper16, (String) obj16, orangePrimary115, 0, null, UIFontWeight.SemiBold, null, null, 108), UiEventHandler.Companion.a(new bp(function12, 16)));
                            journeyDetailsUiState10 = journeyDetailsUiState12;
                            toolbarUIState9 = toolbarUIState10;
                            loadingDialogUIState12 = loadingDialogUIState13;
                            confirmBookingScreenDataState16 = confirmBookingScreenDataState19;
                        } else {
                            confirmBookingScreenDataState16 = confirmBookingScreenDataState15;
                            journeyDetailsUiState10 = journeyDetailsUiState9;
                            tnCDialogUIState5 = tnCDialogUIState4;
                            loadingDialogUIState12 = loadingDialogUIState11;
                            toolbarUIState9 = toolbarUIState8;
                            termsAndConditionsUiState3 = termsAndConditionsUiState2;
                            priceDetailsUiState7 = priceDetailsUiState6;
                            snackbarUIState = null;
                        }
                        ButtonUIState buttonUIState114 = buttonUIStateG;
                        boolean z115 = confirmBookingScreenDataState16.k;
                        if (confirmBookingScreenDataState16.c) {
                            loadingDialogUIState14 = loadingDialogUIState12;
                        } else {
                            loadingDialogUIState14 = null;
                        }
                        return new ConfirmBookingScreenViewState(toolbarUIState9, journeyDetailsUiState10, priceDetailsUiState7, termsAndConditionsUiState3, tnCDialogUIState5, buttonUIState114, snackbarUIState, z115, loadingDialogUIState14);
                    }
                    return obj11;
                }
                obj9 = obj7;
                chaloTextStyleHelper11 = chaloTextStyleHelper17;
                tnCDialogUIState = null;
                termsAndConditionsUiState = null;
                journeyDetailsUiState4 = journeyDetailsUiState3;
                str9 = str8;
                toolbarUIState4 = toolbarUIState3;
                priceDetailsUiState2 = priceDetailsUiState;
                loadingDialogUIState6 = loadingDialogUIState5;
                confirmBookingScreenDataState11 = confirmBookingScreenDataState10;
                z = confirmBookingScreenDataState11.m;
                List list111111 = confirmBookingScreenDataState11.j;
                if (z) {
                    break;
                }
                obj11 = obj9;
                JourneyDetailsUiState journeyDetailsUiState1117 = journeyDetailsUiState4;
                priceDetailsUiState5 = priceDetailsUiState2;
                loadingDialogUIState9 = loadingDialogUIState6;
                toolbarUIState7 = toolbarUIState4;
                journeyDetailsUiState8 = journeyDetailsUiState1117;
                Function1 function11110 = function7;
                confirmBookingScreenDataState13 = confirmBookingScreenDataState11;
                function9 = function11110;
                tnCDialogUIState2 = tnCDialogUIState;
                StringEnum stringEnum115 = StringEnum.FARE_DETAILS_PAY;
                Object[] objArr115 = {str9};
                confirmBookingUIStateFactory$create$1.L$0 = confirmBookingScreenDataState13;
                confirmBookingUIStateFactory$create$1.L$1 = function9;
                confirmBookingUIStateFactory$create$1.L$2 = loadingDialogUIState9;
                confirmBookingUIStateFactory$create$1.L$3 = toolbarUIState7;
                confirmBookingUIStateFactory$create$1.L$4 = journeyDetailsUiState8;
                confirmBookingUIStateFactory$create$1.L$5 = priceDetailsUiState5;
                confirmBookingUIStateFactory$create$1.L$6 = termsAndConditionsUiState;
                confirmBookingUIStateFactory$create$1.L$7 = tnCDialogUIState2;
                buttonUIStateFactory = ButtonUIStateFactory.f9921a;
                confirmBookingUIStateFactory$create$1.L$8 = buttonUIStateFactory;
                confirmBookingUIStateFactory$create$1.L$9 = tnCDialogUIState;
                confirmBookingUIStateFactory$create$1.L$10 = tnCDialogUIState;
                confirmBookingUIStateFactory$create$1.label = 12;
                objB11 = stringProvider.b(stringEnum115, objArr115, confirmBookingUIStateFactory$create$1);
                if (objB11 != obj11) {
                    priceDetailsUiState6 = priceDetailsUiState5;
                    termsAndConditionsUiState2 = termsAndConditionsUiState;
                    confirmBookingScreenDataState14 = confirmBookingScreenDataState13;
                    loadingDialogUIState10 = loadingDialogUIState9;
                    buttonUIStateFactory2 = buttonUIStateFactory;
                    tnCDialogUIState3 = tnCDialogUIState2;
                    function10 = function9;
                    confirmBookingScreenDataState15 = confirmBookingScreenDataState14;
                    journeyDetailsUiState9 = journeyDetailsUiState8;
                    tnCDialogUIState4 = tnCDialogUIState3;
                    loadingDialogUIState11 = loadingDialogUIState10;
                    stringProvider2 = stringProvider;
                    obj13 = obj11;
                    toolbarUIState8 = toolbarUIState7;
                    buttonUIStateG = ButtonUIStateFactory.g(buttonUIStateFactory2, (String) objB11, new bp(function10, 15), null, UIShape.d, true, 0.0f, 36);
                    if (confirmBookingScreenDataState15.l) {
                        confirmBookingUIStateFactory$create$1.L$0 = confirmBookingScreenDataState15;
                        confirmBookingUIStateFactory$create$1.L$1 = function10;
                        confirmBookingUIStateFactory$create$1.L$2 = loadingDialogUIState11;
                        confirmBookingUIStateFactory$create$1.L$3 = toolbarUIState8;
                        confirmBookingUIStateFactory$create$1.L$4 = journeyDetailsUiState9;
                        confirmBookingUIStateFactory$create$1.L$5 = priceDetailsUiState6;
                        confirmBookingUIStateFactory$create$1.L$6 = termsAndConditionsUiState2;
                        confirmBookingUIStateFactory$create$1.L$7 = tnCDialogUIState4;
                        confirmBookingUIStateFactory$create$1.L$8 = buttonUIStateG;
                        chaloTextStyleHelper14 = chaloTextStyleHelper11;
                        confirmBookingUIStateFactory$create$1.L$9 = chaloTextStyleHelper14;
                        confirmBookingUIStateFactory$create$1.label = 13;
                        stringProvider3 = stringProvider2;
                        objB12 = stringProvider3.b(StringEnum.SOMETHING_WENT_WRONG, new Object[0], confirmBookingUIStateFactory$create$1);
                        obj14 = obj13;
                        if (objB12 == obj14) {
                            return obj14;
                        }
                        journeyDetailsUiState11 = journeyDetailsUiState9;
                        priceDetailsUiState8 = priceDetailsUiState6;
                        function11 = function10;
                        confirmBookingScreenDataState17 = confirmBookingScreenDataState15;
                        obj15 = objB12;
                        tnCDialogUIState6 = tnCDialogUIState4;
                        chaloTextStyleHelper15 = chaloTextStyleHelper14;
                        chaloTextUIStateB = ChaloTextStyleHelper.b(chaloTextStyleHelper15, (String) obj15, ChaloColorToken.White.f9870a, 0, null, null, null, null, 124);
                        confirmBookingUIStateFactory$create$1.L$0 = confirmBookingScreenDataState17;
                        confirmBookingUIStateFactory$create$1.L$1 = function11;
                        confirmBookingUIStateFactory$create$1.L$2 = loadingDialogUIState11;
                        confirmBookingUIStateFactory$create$1.L$3 = toolbarUIState8;
                        confirmBookingUIStateFactory$create$1.L$4 = journeyDetailsUiState11;
                        confirmBookingUIStateFactory$create$1.L$5 = priceDetailsUiState8;
                        confirmBookingUIStateFactory$create$1.L$6 = termsAndConditionsUiState2;
                        confirmBookingUIStateFactory$create$1.L$7 = tnCDialogUIState6;
                        confirmBookingUIStateFactory$create$1.L$8 = buttonUIStateG;
                        confirmBookingUIStateFactory$create$1.L$9 = chaloTextUIStateB;
                        confirmBookingUIStateFactory$create$1.L$10 = chaloTextStyleHelper14;
                        confirmBookingScreenDataState18 = confirmBookingScreenDataState17;
                        confirmBookingUIStateFactory$create$1.label = 14;
                        objB13 = stringProvider3.b(StringEnum.RETRY, new Object[0], confirmBookingUIStateFactory$create$1);
                        if (objB13 == obj14) {
                            return obj14;
                        }
                        toolbarUIState10 = toolbarUIState8;
                        termsAndConditionsUiState4 = termsAndConditionsUiState2;
                        confirmBookingScreenDataState19 = confirmBookingScreenDataState18;
                        function12 = function11;
                        chaloTextUIState3 = chaloTextUIStateB;
                        obj16 = objB13;
                        priceDetailsUiState9 = priceDetailsUiState8;
                        chaloTextStyleHelper16 = chaloTextStyleHelper14;
                        loadingDialogUIState13 = loadingDialogUIState11;
                        journeyDetailsUiState12 = journeyDetailsUiState11;
                        ChaloColorToken.OrangePrimary orangePrimary116 = orangePrimary;
                        priceDetailsUiState7 = priceDetailsUiState9;
                        tnCDialogUIState5 = tnCDialogUIState6;
                        termsAndConditionsUiState3 = termsAndConditionsUiState4;
                        snackbarUIState = new SnackbarUIState(chaloTextUIState3, ChaloTextStyleHelper.b(chaloTextStyleHelper16, (String) obj16, orangePrimary116, 0, null, UIFontWeight.SemiBold, null, null, 108), UiEventHandler.Companion.a(new bp(function12, 16)));
                        journeyDetailsUiState10 = journeyDetailsUiState12;
                        toolbarUIState9 = toolbarUIState10;
                        loadingDialogUIState12 = loadingDialogUIState13;
                        confirmBookingScreenDataState16 = confirmBookingScreenDataState19;
                    } else {
                        confirmBookingScreenDataState16 = confirmBookingScreenDataState15;
                        journeyDetailsUiState10 = journeyDetailsUiState9;
                        tnCDialogUIState5 = tnCDialogUIState4;
                        loadingDialogUIState12 = loadingDialogUIState11;
                        toolbarUIState9 = toolbarUIState8;
                        termsAndConditionsUiState3 = termsAndConditionsUiState2;
                        priceDetailsUiState7 = priceDetailsUiState6;
                        snackbarUIState = null;
                    }
                    ButtonUIState buttonUIState115 = buttonUIStateG;
                    boolean z116 = confirmBookingScreenDataState16.k;
                    if (confirmBookingScreenDataState16.c) {
                        loadingDialogUIState14 = loadingDialogUIState12;
                    } else {
                        loadingDialogUIState14 = null;
                    }
                    return new ConfirmBookingScreenViewState(toolbarUIState9, journeyDetailsUiState10, priceDetailsUiState7, termsAndConditionsUiState3, tnCDialogUIState5, buttonUIState115, snackbarUIState, z116, loadingDialogUIState14);
                }
                return obj11;
            case 7:
                ChaloTextStyleHelper chaloTextStyleHelper34 = (ChaloTextStyleHelper) confirmBookingUIStateFactory$create$1.L$9;
                fareLineUiState2 = (FareLineUiState) confirmBookingUIStateFactory$create$1.L$8;
                list8 = (List) confirmBookingUIStateFactory$create$1.L$7;
                productBannerUIState2 = (ProductBannerUIState) confirmBookingUIStateFactory$create$1.L$6;
                str8 = (String) confirmBookingUIStateFactory$create$1.L$5;
                JourneyDetailsUiState journeyDetailsUiState20 = (JourneyDetailsUiState) confirmBookingUIStateFactory$create$1.L$4;
                ToolbarUIState toolbarUIState15 = (ToolbarUIState) confirmBookingUIStateFactory$create$1.L$3;
                LoadingDialogUIState loadingDialogUIState19 = (LoadingDialogUIState) confirmBookingUIStateFactory$create$1.L$2;
                Function1 function23 = (Function1) confirmBookingUIStateFactory$create$1.L$1;
                ConfirmBookingScreenDataState confirmBookingScreenDataState24 = (ConfirmBookingScreenDataState) confirmBookingUIStateFactory$create$1.L$0;
                ResultKt.b(obj16);
                chaloTextStyleHelper10 = chaloTextStyleHelper34;
                objB7 = obj16;
                obj7 = obj17;
                journeyDetailsUiState3 = journeyDetailsUiState20;
                confirmBookingScreenDataState10 = confirmBookingScreenDataState24;
                toolbarUIState3 = toolbarUIState15;
                loadingDialogUIState5 = loadingDialogUIState19;
                function7 = function23;
                orangePrimary = orangePrimary;
                stringProvider = stringProvider4;
                TextUIState.ChaloTextUIState chaloTextUIStateA14 = ChaloTextStyleHelper.a(chaloTextStyleHelper10, (String) objB7, null, UIFontWeight.Bold, null, FacebookMediationAdapter.ERROR_FAILED_TO_PRESENT_AD);
                if (list8 == null) {
                    list8 = EmptyList.f17557a;
                }
                priceDetailsUiState = new PriceDetailsUiState(chaloTextUIStateA14, list8, fareLineUiState2, productBannerUIState2);
                list9 = confirmBookingScreenDataState10.j;
                if (list9 != null) {
                    if (list9.isEmpty()) {
                        list9 = null;
                    }
                    if (list9 != null) {
                        List listX12 = CollectionsKt.x0(list9, 3);
                        arrayList5 = new ArrayList(CollectionsKt.v(listX12, 10));
                        it3 = listX12.iterator();
                        i2 = 0;
                        while (it3.hasNext()) {
                            next = it3.next();
                            i3 = i2 + 1;
                            if (i2 < 0) {
                                CollectionsKt.z0();
                                throw null;
                            }
                            arrayList5.add(ChaloTextStyleHelper.c(chaloTextStyleHelper17, i3 + ". " + ((String) next), null, null, null, null, null, WebSocketProtocol.PAYLOAD_SHORT));
                            it3 = it3;
                            i2 = i3;
                        }
                        chaloTextStyleHelper12 = chaloTextStyleHelper17;
                        confirmBookingUIStateFactory$create$1.L$0 = confirmBookingScreenDataState10;
                        confirmBookingUIStateFactory$create$1.L$1 = function7;
                        confirmBookingUIStateFactory$create$1.L$2 = loadingDialogUIState5;
                        confirmBookingUIStateFactory$create$1.L$3 = toolbarUIState3;
                        confirmBookingUIStateFactory$create$1.L$4 = journeyDetailsUiState3;
                        confirmBookingUIStateFactory$create$1.L$5 = str8;
                        confirmBookingUIStateFactory$create$1.L$6 = priceDetailsUiState;
                        confirmBookingUIStateFactory$create$1.L$7 = arrayList5;
                        confirmBookingUIStateFactory$create$1.L$8 = chaloTextStyleHelper12;
                        confirmBookingUIStateFactory$create$1.L$9 = null;
                        confirmBookingUIStateFactory$create$1.label = 8;
                        objB8 = stringProvider.b(StringEnum.TERMS_AND_CONDITIONS, new Object[0], confirmBookingUIStateFactory$create$1);
                        if (objB8 == obj7) {
                            return obj7;
                        }
                        chaloTextStyleHelper13 = chaloTextStyleHelper12;
                        str10 = str8;
                        journeyDetailsUiState5 = journeyDetailsUiState3;
                        list10 = arrayList5;
                        chaloTextUIStateA = ChaloTextStyleHelper.a(chaloTextStyleHelper13, (String) objB8, null, UIFontWeight.Bold, null, FacebookMediationAdapter.ERROR_FAILED_TO_PRESENT_AD);
                        styledTextDataUIStateArr = new StyledTextDataUIState[2];
                        chaloTextStyleHelper11 = chaloTextStyleHelper12;
                        confirmBookingUIStateFactory$create$1.L$0 = confirmBookingScreenDataState10;
                        confirmBookingUIStateFactory$create$1.L$1 = function7;
                        confirmBookingUIStateFactory$create$1.L$2 = loadingDialogUIState5;
                        confirmBookingUIStateFactory$create$1.L$3 = toolbarUIState3;
                        confirmBookingUIStateFactory$create$1.L$4 = journeyDetailsUiState5;
                        confirmBookingUIStateFactory$create$1.L$5 = str10;
                        confirmBookingUIStateFactory$create$1.L$6 = priceDetailsUiState;
                        confirmBookingUIStateFactory$create$1.L$7 = styledTextDataUIStateArr;
                        confirmBookingUIStateFactory$create$1.L$8 = chaloTextUIStateA;
                        confirmBookingUIStateFactory$create$1.L$9 = list10;
                        confirmBookingUIStateFactory$create$1.L$10 = styledTextDataUIStateArr;
                        confirmBookingUIStateFactory$create$1.I$0 = 0;
                        confirmBookingUIStateFactory$create$1.label = 9;
                        objB9 = stringProvider.b(StringEnum.ALL_TNC_PREFIX, new Object[0], confirmBookingUIStateFactory$create$1);
                        if (objB9 == obj7) {
                            return obj7;
                        }
                        styledTextDataUIStateArr2 = styledTextDataUIStateArr;
                        toolbarUIState5 = toolbarUIState3;
                        priceDetailsUiState3 = priceDetailsUiState;
                        loadingDialogUIState7 = loadingDialogUIState5;
                        i4 = 0;
                        journeyDetailsUiState6 = journeyDetailsUiState5;
                        str11 = str10;
                        chaloTextUIState = chaloTextUIStateA;
                        obj10 = objB9;
                        list11 = list10;
                        styledTextDataUIStateArr2[i4] = new StyledTextDataUIState(obj10 + " ", null, null, UITextStyle.BodySmall, null, null, null, 1014);
                        confirmBookingUIStateFactory$create$1.L$0 = confirmBookingScreenDataState10;
                        confirmBookingUIStateFactory$create$1.L$1 = function7;
                        confirmBookingUIStateFactory$create$1.L$2 = loadingDialogUIState7;
                        confirmBookingUIStateFactory$create$1.L$3 = toolbarUIState5;
                        confirmBookingUIStateFactory$create$1.L$4 = journeyDetailsUiState6;
                        confirmBookingUIStateFactory$create$1.L$5 = str11;
                        confirmBookingUIStateFactory$create$1.L$6 = priceDetailsUiState3;
                        confirmBookingUIStateFactory$create$1.L$7 = styledTextDataUIStateArr;
                        confirmBookingUIStateFactory$create$1.L$8 = chaloTextUIState;
                        confirmBookingUIStateFactory$create$1.L$9 = list11;
                        confirmBookingUIStateFactory$create$1.L$10 = styledTextDataUIStateArr;
                        confirmBookingUIStateFactory$create$1.I$0 = 1;
                        confirmBookingUIStateFactory$create$1.label = 10;
                        objB10 = stringProvider.b(StringEnum.TNC_CLICKABLE_TEXT, new Object[0], confirmBookingUIStateFactory$create$1);
                        if (objB10 == obj7) {
                            return obj7;
                        }
                        styledTextDataUIStateArr3 = styledTextDataUIStateArr;
                        str12 = str11;
                        loadingDialogUIState8 = loadingDialogUIState7;
                        confirmBookingScreenDataState12 = confirmBookingScreenDataState10;
                        toolbarUIState6 = toolbarUIState5;
                        i5 = 1;
                        chaloTextUIState2 = chaloTextUIState;
                        function8 = function7;
                        list12 = list11;
                        styledTextDataUIStateArr4 = styledTextDataUIStateArr3;
                        priceDetailsUiState4 = priceDetailsUiState3;
                        journeyDetailsUiState7 = journeyDetailsUiState6;
                        String str1114 = (String) objB10;
                        obj9 = obj7;
                        tnCDialogUIState = null;
                        styledTextDataUIStateArr4[i5] = new StyledTextDataUIState(str1114, orangePrimary, UIFontWeight.Bold, UITextStyle.BodySmall, null, null, new StyledTextClickHandler() { // from class: app.chalo.metro.ui.confirmbooking.uistate.ConfirmBookingUIStateFactory$create$termsAndConditionsUiState$2$1
                            @Override // app.chalo.uistate.text.StyledTextClickHandler
                            public final void a() {
                                function8.invoke(ConfirmBookingScreenViewIntent.OnTermsAndConditionsClicked.f5468a);
                            }

                            @Override // app.chalo.uistate.text.StyledTextClickHandler
                            /* JADX INFO: renamed from: b */
                            public final String getB() {
                                return "TNC_CLICKABLE_TEXT";
                            }

                            @Override // app.chalo.uistate.text.StyledTextClickHandler
                            /* JADX INFO: renamed from: getTag */
                            public final String getF10085a() {
                                return "TNC_CLICKABLE_TEXT";
                            }
                        }, 496);
                        termsAndConditionsUiState = new TermsAndConditionsUiState(chaloTextUIState2, list12, new TextUIState.StyledTextUIState(CollectionsKt.S(styledTextDataUIStateArr3), null, null, 30));
                        function7 = function8;
                        confirmBookingScreenDataState11 = confirmBookingScreenDataState12;
                        priceDetailsUiState2 = priceDetailsUiState4;
                        str9 = str12;
                        journeyDetailsUiState4 = journeyDetailsUiState7;
                        loadingDialogUIState6 = loadingDialogUIState8;
                        toolbarUIState4 = toolbarUIState6;
                    }
                    z = confirmBookingScreenDataState11.m;
                    List list111112 = confirmBookingScreenDataState11.j;
                    if (z) {
                        break;
                    }
                    obj11 = obj9;
                    JourneyDetailsUiState journeyDetailsUiState1118 = journeyDetailsUiState4;
                    priceDetailsUiState5 = priceDetailsUiState2;
                    loadingDialogUIState9 = loadingDialogUIState6;
                    toolbarUIState7 = toolbarUIState4;
                    journeyDetailsUiState8 = journeyDetailsUiState1118;
                    Function1 function11111 = function7;
                    confirmBookingScreenDataState13 = confirmBookingScreenDataState11;
                    function9 = function11111;
                    tnCDialogUIState2 = tnCDialogUIState;
                    StringEnum stringEnum116 = StringEnum.FARE_DETAILS_PAY;
                    Object[] objArr116 = {str9};
                    confirmBookingUIStateFactory$create$1.L$0 = confirmBookingScreenDataState13;
                    confirmBookingUIStateFactory$create$1.L$1 = function9;
                    confirmBookingUIStateFactory$create$1.L$2 = loadingDialogUIState9;
                    confirmBookingUIStateFactory$create$1.L$3 = toolbarUIState7;
                    confirmBookingUIStateFactory$create$1.L$4 = journeyDetailsUiState8;
                    confirmBookingUIStateFactory$create$1.L$5 = priceDetailsUiState5;
                    confirmBookingUIStateFactory$create$1.L$6 = termsAndConditionsUiState;
                    confirmBookingUIStateFactory$create$1.L$7 = tnCDialogUIState2;
                    buttonUIStateFactory = ButtonUIStateFactory.f9921a;
                    confirmBookingUIStateFactory$create$1.L$8 = buttonUIStateFactory;
                    confirmBookingUIStateFactory$create$1.L$9 = tnCDialogUIState;
                    confirmBookingUIStateFactory$create$1.L$10 = tnCDialogUIState;
                    confirmBookingUIStateFactory$create$1.label = 12;
                    objB11 = stringProvider.b(stringEnum116, objArr116, confirmBookingUIStateFactory$create$1);
                    if (objB11 != obj11) {
                        priceDetailsUiState6 = priceDetailsUiState5;
                        termsAndConditionsUiState2 = termsAndConditionsUiState;
                        confirmBookingScreenDataState14 = confirmBookingScreenDataState13;
                        loadingDialogUIState10 = loadingDialogUIState9;
                        buttonUIStateFactory2 = buttonUIStateFactory;
                        tnCDialogUIState3 = tnCDialogUIState2;
                        function10 = function9;
                        confirmBookingScreenDataState15 = confirmBookingScreenDataState14;
                        journeyDetailsUiState9 = journeyDetailsUiState8;
                        tnCDialogUIState4 = tnCDialogUIState3;
                        loadingDialogUIState11 = loadingDialogUIState10;
                        stringProvider2 = stringProvider;
                        obj13 = obj11;
                        toolbarUIState8 = toolbarUIState7;
                        buttonUIStateG = ButtonUIStateFactory.g(buttonUIStateFactory2, (String) objB11, new bp(function10, 15), null, UIShape.d, true, 0.0f, 36);
                        if (confirmBookingScreenDataState15.l) {
                            confirmBookingUIStateFactory$create$1.L$0 = confirmBookingScreenDataState15;
                            confirmBookingUIStateFactory$create$1.L$1 = function10;
                            confirmBookingUIStateFactory$create$1.L$2 = loadingDialogUIState11;
                            confirmBookingUIStateFactory$create$1.L$3 = toolbarUIState8;
                            confirmBookingUIStateFactory$create$1.L$4 = journeyDetailsUiState9;
                            confirmBookingUIStateFactory$create$1.L$5 = priceDetailsUiState6;
                            confirmBookingUIStateFactory$create$1.L$6 = termsAndConditionsUiState2;
                            confirmBookingUIStateFactory$create$1.L$7 = tnCDialogUIState4;
                            confirmBookingUIStateFactory$create$1.L$8 = buttonUIStateG;
                            chaloTextStyleHelper14 = chaloTextStyleHelper11;
                            confirmBookingUIStateFactory$create$1.L$9 = chaloTextStyleHelper14;
                            confirmBookingUIStateFactory$create$1.label = 13;
                            stringProvider3 = stringProvider2;
                            objB12 = stringProvider3.b(StringEnum.SOMETHING_WENT_WRONG, new Object[0], confirmBookingUIStateFactory$create$1);
                            obj14 = obj13;
                            if (objB12 == obj14) {
                                return obj14;
                            }
                            journeyDetailsUiState11 = journeyDetailsUiState9;
                            priceDetailsUiState8 = priceDetailsUiState6;
                            function11 = function10;
                            confirmBookingScreenDataState17 = confirmBookingScreenDataState15;
                            obj15 = objB12;
                            tnCDialogUIState6 = tnCDialogUIState4;
                            chaloTextStyleHelper15 = chaloTextStyleHelper14;
                            chaloTextUIStateB = ChaloTextStyleHelper.b(chaloTextStyleHelper15, (String) obj15, ChaloColorToken.White.f9870a, 0, null, null, null, null, 124);
                            confirmBookingUIStateFactory$create$1.L$0 = confirmBookingScreenDataState17;
                            confirmBookingUIStateFactory$create$1.L$1 = function11;
                            confirmBookingUIStateFactory$create$1.L$2 = loadingDialogUIState11;
                            confirmBookingUIStateFactory$create$1.L$3 = toolbarUIState8;
                            confirmBookingUIStateFactory$create$1.L$4 = journeyDetailsUiState11;
                            confirmBookingUIStateFactory$create$1.L$5 = priceDetailsUiState8;
                            confirmBookingUIStateFactory$create$1.L$6 = termsAndConditionsUiState2;
                            confirmBookingUIStateFactory$create$1.L$7 = tnCDialogUIState6;
                            confirmBookingUIStateFactory$create$1.L$8 = buttonUIStateG;
                            confirmBookingUIStateFactory$create$1.L$9 = chaloTextUIStateB;
                            confirmBookingUIStateFactory$create$1.L$10 = chaloTextStyleHelper14;
                            confirmBookingScreenDataState18 = confirmBookingScreenDataState17;
                            confirmBookingUIStateFactory$create$1.label = 14;
                            objB13 = stringProvider3.b(StringEnum.RETRY, new Object[0], confirmBookingUIStateFactory$create$1);
                            if (objB13 == obj14) {
                                return obj14;
                            }
                            toolbarUIState10 = toolbarUIState8;
                            termsAndConditionsUiState4 = termsAndConditionsUiState2;
                            confirmBookingScreenDataState19 = confirmBookingScreenDataState18;
                            function12 = function11;
                            chaloTextUIState3 = chaloTextUIStateB;
                            obj16 = objB13;
                            priceDetailsUiState9 = priceDetailsUiState8;
                            chaloTextStyleHelper16 = chaloTextStyleHelper14;
                            loadingDialogUIState13 = loadingDialogUIState11;
                            journeyDetailsUiState12 = journeyDetailsUiState11;
                            ChaloColorToken.OrangePrimary orangePrimary117 = orangePrimary;
                            priceDetailsUiState7 = priceDetailsUiState9;
                            tnCDialogUIState5 = tnCDialogUIState6;
                            termsAndConditionsUiState3 = termsAndConditionsUiState4;
                            snackbarUIState = new SnackbarUIState(chaloTextUIState3, ChaloTextStyleHelper.b(chaloTextStyleHelper16, (String) obj16, orangePrimary117, 0, null, UIFontWeight.SemiBold, null, null, 108), UiEventHandler.Companion.a(new bp(function12, 16)));
                            journeyDetailsUiState10 = journeyDetailsUiState12;
                            toolbarUIState9 = toolbarUIState10;
                            loadingDialogUIState12 = loadingDialogUIState13;
                            confirmBookingScreenDataState16 = confirmBookingScreenDataState19;
                        } else {
                            confirmBookingScreenDataState16 = confirmBookingScreenDataState15;
                            journeyDetailsUiState10 = journeyDetailsUiState9;
                            tnCDialogUIState5 = tnCDialogUIState4;
                            loadingDialogUIState12 = loadingDialogUIState11;
                            toolbarUIState9 = toolbarUIState8;
                            termsAndConditionsUiState3 = termsAndConditionsUiState2;
                            priceDetailsUiState7 = priceDetailsUiState6;
                            snackbarUIState = null;
                        }
                        ButtonUIState buttonUIState116 = buttonUIStateG;
                        boolean z117 = confirmBookingScreenDataState16.k;
                        if (confirmBookingScreenDataState16.c) {
                            loadingDialogUIState14 = loadingDialogUIState12;
                        } else {
                            loadingDialogUIState14 = null;
                        }
                        return new ConfirmBookingScreenViewState(toolbarUIState9, journeyDetailsUiState10, priceDetailsUiState7, termsAndConditionsUiState3, tnCDialogUIState5, buttonUIState116, snackbarUIState, z117, loadingDialogUIState14);
                    }
                    return obj11;
                }
                obj9 = obj7;
                chaloTextStyleHelper11 = chaloTextStyleHelper17;
                tnCDialogUIState = null;
                termsAndConditionsUiState = null;
                journeyDetailsUiState4 = journeyDetailsUiState3;
                str9 = str8;
                toolbarUIState4 = toolbarUIState3;
                priceDetailsUiState2 = priceDetailsUiState;
                loadingDialogUIState6 = loadingDialogUIState5;
                confirmBookingScreenDataState11 = confirmBookingScreenDataState10;
                z = confirmBookingScreenDataState11.m;
                List list111113 = confirmBookingScreenDataState11.j;
                if (z) {
                    break;
                }
                obj11 = obj9;
                JourneyDetailsUiState journeyDetailsUiState1119 = journeyDetailsUiState4;
                priceDetailsUiState5 = priceDetailsUiState2;
                loadingDialogUIState9 = loadingDialogUIState6;
                toolbarUIState7 = toolbarUIState4;
                journeyDetailsUiState8 = journeyDetailsUiState1119;
                Function1 function11112 = function7;
                confirmBookingScreenDataState13 = confirmBookingScreenDataState11;
                function9 = function11112;
                tnCDialogUIState2 = tnCDialogUIState;
                StringEnum stringEnum117 = StringEnum.FARE_DETAILS_PAY;
                Object[] objArr117 = {str9};
                confirmBookingUIStateFactory$create$1.L$0 = confirmBookingScreenDataState13;
                confirmBookingUIStateFactory$create$1.L$1 = function9;
                confirmBookingUIStateFactory$create$1.L$2 = loadingDialogUIState9;
                confirmBookingUIStateFactory$create$1.L$3 = toolbarUIState7;
                confirmBookingUIStateFactory$create$1.L$4 = journeyDetailsUiState8;
                confirmBookingUIStateFactory$create$1.L$5 = priceDetailsUiState5;
                confirmBookingUIStateFactory$create$1.L$6 = termsAndConditionsUiState;
                confirmBookingUIStateFactory$create$1.L$7 = tnCDialogUIState2;
                buttonUIStateFactory = ButtonUIStateFactory.f9921a;
                confirmBookingUIStateFactory$create$1.L$8 = buttonUIStateFactory;
                confirmBookingUIStateFactory$create$1.L$9 = tnCDialogUIState;
                confirmBookingUIStateFactory$create$1.L$10 = tnCDialogUIState;
                confirmBookingUIStateFactory$create$1.label = 12;
                objB11 = stringProvider.b(stringEnum117, objArr117, confirmBookingUIStateFactory$create$1);
                if (objB11 != obj11) {
                    priceDetailsUiState6 = priceDetailsUiState5;
                    termsAndConditionsUiState2 = termsAndConditionsUiState;
                    confirmBookingScreenDataState14 = confirmBookingScreenDataState13;
                    loadingDialogUIState10 = loadingDialogUIState9;
                    buttonUIStateFactory2 = buttonUIStateFactory;
                    tnCDialogUIState3 = tnCDialogUIState2;
                    function10 = function9;
                    confirmBookingScreenDataState15 = confirmBookingScreenDataState14;
                    journeyDetailsUiState9 = journeyDetailsUiState8;
                    tnCDialogUIState4 = tnCDialogUIState3;
                    loadingDialogUIState11 = loadingDialogUIState10;
                    stringProvider2 = stringProvider;
                    obj13 = obj11;
                    toolbarUIState8 = toolbarUIState7;
                    buttonUIStateG = ButtonUIStateFactory.g(buttonUIStateFactory2, (String) objB11, new bp(function10, 15), null, UIShape.d, true, 0.0f, 36);
                    if (confirmBookingScreenDataState15.l) {
                        confirmBookingUIStateFactory$create$1.L$0 = confirmBookingScreenDataState15;
                        confirmBookingUIStateFactory$create$1.L$1 = function10;
                        confirmBookingUIStateFactory$create$1.L$2 = loadingDialogUIState11;
                        confirmBookingUIStateFactory$create$1.L$3 = toolbarUIState8;
                        confirmBookingUIStateFactory$create$1.L$4 = journeyDetailsUiState9;
                        confirmBookingUIStateFactory$create$1.L$5 = priceDetailsUiState6;
                        confirmBookingUIStateFactory$create$1.L$6 = termsAndConditionsUiState2;
                        confirmBookingUIStateFactory$create$1.L$7 = tnCDialogUIState4;
                        confirmBookingUIStateFactory$create$1.L$8 = buttonUIStateG;
                        chaloTextStyleHelper14 = chaloTextStyleHelper11;
                        confirmBookingUIStateFactory$create$1.L$9 = chaloTextStyleHelper14;
                        confirmBookingUIStateFactory$create$1.label = 13;
                        stringProvider3 = stringProvider2;
                        objB12 = stringProvider3.b(StringEnum.SOMETHING_WENT_WRONG, new Object[0], confirmBookingUIStateFactory$create$1);
                        obj14 = obj13;
                        if (objB12 == obj14) {
                            return obj14;
                        }
                        journeyDetailsUiState11 = journeyDetailsUiState9;
                        priceDetailsUiState8 = priceDetailsUiState6;
                        function11 = function10;
                        confirmBookingScreenDataState17 = confirmBookingScreenDataState15;
                        obj15 = objB12;
                        tnCDialogUIState6 = tnCDialogUIState4;
                        chaloTextStyleHelper15 = chaloTextStyleHelper14;
                        chaloTextUIStateB = ChaloTextStyleHelper.b(chaloTextStyleHelper15, (String) obj15, ChaloColorToken.White.f9870a, 0, null, null, null, null, 124);
                        confirmBookingUIStateFactory$create$1.L$0 = confirmBookingScreenDataState17;
                        confirmBookingUIStateFactory$create$1.L$1 = function11;
                        confirmBookingUIStateFactory$create$1.L$2 = loadingDialogUIState11;
                        confirmBookingUIStateFactory$create$1.L$3 = toolbarUIState8;
                        confirmBookingUIStateFactory$create$1.L$4 = journeyDetailsUiState11;
                        confirmBookingUIStateFactory$create$1.L$5 = priceDetailsUiState8;
                        confirmBookingUIStateFactory$create$1.L$6 = termsAndConditionsUiState2;
                        confirmBookingUIStateFactory$create$1.L$7 = tnCDialogUIState6;
                        confirmBookingUIStateFactory$create$1.L$8 = buttonUIStateG;
                        confirmBookingUIStateFactory$create$1.L$9 = chaloTextUIStateB;
                        confirmBookingUIStateFactory$create$1.L$10 = chaloTextStyleHelper14;
                        confirmBookingScreenDataState18 = confirmBookingScreenDataState17;
                        confirmBookingUIStateFactory$create$1.label = 14;
                        objB13 = stringProvider3.b(StringEnum.RETRY, new Object[0], confirmBookingUIStateFactory$create$1);
                        if (objB13 == obj14) {
                            return obj14;
                        }
                        toolbarUIState10 = toolbarUIState8;
                        termsAndConditionsUiState4 = termsAndConditionsUiState2;
                        confirmBookingScreenDataState19 = confirmBookingScreenDataState18;
                        function12 = function11;
                        chaloTextUIState3 = chaloTextUIStateB;
                        obj16 = objB13;
                        priceDetailsUiState9 = priceDetailsUiState8;
                        chaloTextStyleHelper16 = chaloTextStyleHelper14;
                        loadingDialogUIState13 = loadingDialogUIState11;
                        journeyDetailsUiState12 = journeyDetailsUiState11;
                        ChaloColorToken.OrangePrimary orangePrimary118 = orangePrimary;
                        priceDetailsUiState7 = priceDetailsUiState9;
                        tnCDialogUIState5 = tnCDialogUIState6;
                        termsAndConditionsUiState3 = termsAndConditionsUiState4;
                        snackbarUIState = new SnackbarUIState(chaloTextUIState3, ChaloTextStyleHelper.b(chaloTextStyleHelper16, (String) obj16, orangePrimary118, 0, null, UIFontWeight.SemiBold, null, null, 108), UiEventHandler.Companion.a(new bp(function12, 16)));
                        journeyDetailsUiState10 = journeyDetailsUiState12;
                        toolbarUIState9 = toolbarUIState10;
                        loadingDialogUIState12 = loadingDialogUIState13;
                        confirmBookingScreenDataState16 = confirmBookingScreenDataState19;
                    } else {
                        confirmBookingScreenDataState16 = confirmBookingScreenDataState15;
                        journeyDetailsUiState10 = journeyDetailsUiState9;
                        tnCDialogUIState5 = tnCDialogUIState4;
                        loadingDialogUIState12 = loadingDialogUIState11;
                        toolbarUIState9 = toolbarUIState8;
                        termsAndConditionsUiState3 = termsAndConditionsUiState2;
                        priceDetailsUiState7 = priceDetailsUiState6;
                        snackbarUIState = null;
                    }
                    ButtonUIState buttonUIState117 = buttonUIStateG;
                    boolean z118 = confirmBookingScreenDataState16.k;
                    if (confirmBookingScreenDataState16.c) {
                        loadingDialogUIState14 = loadingDialogUIState12;
                    } else {
                        loadingDialogUIState14 = null;
                    }
                    return new ConfirmBookingScreenViewState(toolbarUIState9, journeyDetailsUiState10, priceDetailsUiState7, termsAndConditionsUiState3, tnCDialogUIState5, buttonUIState117, snackbarUIState, z118, loadingDialogUIState14);
                }
                return obj11;
            case 8:
                ChaloTextStyleHelper chaloTextStyleHelper35 = (ChaloTextStyleHelper) confirmBookingUIStateFactory$create$1.L$8;
                List list21 = (List) confirmBookingUIStateFactory$create$1.L$7;
                PriceDetailsUiState priceDetailsUiState10 = (PriceDetailsUiState) confirmBookingUIStateFactory$create$1.L$6;
                str10 = (String) confirmBookingUIStateFactory$create$1.L$5;
                journeyDetailsUiState5 = (JourneyDetailsUiState) confirmBookingUIStateFactory$create$1.L$4;
                ToolbarUIState toolbarUIState16 = (ToolbarUIState) confirmBookingUIStateFactory$create$1.L$3;
                loadingDialogUIState5 = (LoadingDialogUIState) confirmBookingUIStateFactory$create$1.L$2;
                function7 = (Function1) confirmBookingUIStateFactory$create$1.L$1;
                confirmBookingScreenDataState10 = (ConfirmBookingScreenDataState) confirmBookingUIStateFactory$create$1.L$0;
                ResultKt.b(obj16);
                chaloTextStyleHelper13 = chaloTextStyleHelper35;
                objB8 = obj16;
                orangePrimary = orangePrimary;
                toolbarUIState3 = toolbarUIState16;
                stringProvider = stringProvider4;
                obj7 = obj17;
                priceDetailsUiState = priceDetailsUiState10;
                chaloTextStyleHelper12 = chaloTextStyleHelper17;
                list10 = list21;
                chaloTextUIStateA = ChaloTextStyleHelper.a(chaloTextStyleHelper13, (String) objB8, null, UIFontWeight.Bold, null, FacebookMediationAdapter.ERROR_FAILED_TO_PRESENT_AD);
                styledTextDataUIStateArr = new StyledTextDataUIState[2];
                chaloTextStyleHelper11 = chaloTextStyleHelper12;
                confirmBookingUIStateFactory$create$1.L$0 = confirmBookingScreenDataState10;
                confirmBookingUIStateFactory$create$1.L$1 = function7;
                confirmBookingUIStateFactory$create$1.L$2 = loadingDialogUIState5;
                confirmBookingUIStateFactory$create$1.L$3 = toolbarUIState3;
                confirmBookingUIStateFactory$create$1.L$4 = journeyDetailsUiState5;
                confirmBookingUIStateFactory$create$1.L$5 = str10;
                confirmBookingUIStateFactory$create$1.L$6 = priceDetailsUiState;
                confirmBookingUIStateFactory$create$1.L$7 = styledTextDataUIStateArr;
                confirmBookingUIStateFactory$create$1.L$8 = chaloTextUIStateA;
                confirmBookingUIStateFactory$create$1.L$9 = list10;
                confirmBookingUIStateFactory$create$1.L$10 = styledTextDataUIStateArr;
                confirmBookingUIStateFactory$create$1.I$0 = 0;
                confirmBookingUIStateFactory$create$1.label = 9;
                objB9 = stringProvider.b(StringEnum.ALL_TNC_PREFIX, new Object[0], confirmBookingUIStateFactory$create$1);
                if (objB9 == obj7) {
                    return obj7;
                }
                styledTextDataUIStateArr2 = styledTextDataUIStateArr;
                toolbarUIState5 = toolbarUIState3;
                priceDetailsUiState3 = priceDetailsUiState;
                loadingDialogUIState7 = loadingDialogUIState5;
                i4 = 0;
                journeyDetailsUiState6 = journeyDetailsUiState5;
                str11 = str10;
                chaloTextUIState = chaloTextUIStateA;
                obj10 = objB9;
                list11 = list10;
                styledTextDataUIStateArr2[i4] = new StyledTextDataUIState(obj10 + " ", null, null, UITextStyle.BodySmall, null, null, null, 1014);
                confirmBookingUIStateFactory$create$1.L$0 = confirmBookingScreenDataState10;
                confirmBookingUIStateFactory$create$1.L$1 = function7;
                confirmBookingUIStateFactory$create$1.L$2 = loadingDialogUIState7;
                confirmBookingUIStateFactory$create$1.L$3 = toolbarUIState5;
                confirmBookingUIStateFactory$create$1.L$4 = journeyDetailsUiState6;
                confirmBookingUIStateFactory$create$1.L$5 = str11;
                confirmBookingUIStateFactory$create$1.L$6 = priceDetailsUiState3;
                confirmBookingUIStateFactory$create$1.L$7 = styledTextDataUIStateArr;
                confirmBookingUIStateFactory$create$1.L$8 = chaloTextUIState;
                confirmBookingUIStateFactory$create$1.L$9 = list11;
                confirmBookingUIStateFactory$create$1.L$10 = styledTextDataUIStateArr;
                confirmBookingUIStateFactory$create$1.I$0 = 1;
                confirmBookingUIStateFactory$create$1.label = 10;
                objB10 = stringProvider.b(StringEnum.TNC_CLICKABLE_TEXT, new Object[0], confirmBookingUIStateFactory$create$1);
                if (objB10 == obj7) {
                    return obj7;
                }
                styledTextDataUIStateArr3 = styledTextDataUIStateArr;
                str12 = str11;
                loadingDialogUIState8 = loadingDialogUIState7;
                confirmBookingScreenDataState12 = confirmBookingScreenDataState10;
                toolbarUIState6 = toolbarUIState5;
                i5 = 1;
                chaloTextUIState2 = chaloTextUIState;
                function8 = function7;
                list12 = list11;
                styledTextDataUIStateArr4 = styledTextDataUIStateArr3;
                priceDetailsUiState4 = priceDetailsUiState3;
                journeyDetailsUiState7 = journeyDetailsUiState6;
                String str1115 = (String) objB10;
                obj9 = obj7;
                tnCDialogUIState = null;
                styledTextDataUIStateArr4[i5] = new StyledTextDataUIState(str1115, orangePrimary, UIFontWeight.Bold, UITextStyle.BodySmall, null, null, new StyledTextClickHandler() { // from class: app.chalo.metro.ui.confirmbooking.uistate.ConfirmBookingUIStateFactory$create$termsAndConditionsUiState$2$1
                    @Override // app.chalo.uistate.text.StyledTextClickHandler
                    public final void a() {
                        function8.invoke(ConfirmBookingScreenViewIntent.OnTermsAndConditionsClicked.f5468a);
                    }

                    @Override // app.chalo.uistate.text.StyledTextClickHandler
                    /* JADX INFO: renamed from: b */
                    public final String getB() {
                        return "TNC_CLICKABLE_TEXT";
                    }

                    @Override // app.chalo.uistate.text.StyledTextClickHandler
                    /* JADX INFO: renamed from: getTag */
                    public final String getF10085a() {
                        return "TNC_CLICKABLE_TEXT";
                    }
                }, 496);
                termsAndConditionsUiState = new TermsAndConditionsUiState(chaloTextUIState2, list12, new TextUIState.StyledTextUIState(CollectionsKt.S(styledTextDataUIStateArr3), null, null, 30));
                function7 = function8;
                confirmBookingScreenDataState11 = confirmBookingScreenDataState12;
                priceDetailsUiState2 = priceDetailsUiState4;
                str9 = str12;
                journeyDetailsUiState4 = journeyDetailsUiState7;
                loadingDialogUIState6 = loadingDialogUIState8;
                toolbarUIState4 = toolbarUIState6;
                z = confirmBookingScreenDataState11.m;
                List list111114 = confirmBookingScreenDataState11.j;
                if (z) {
                    break;
                }
                obj11 = obj9;
                JourneyDetailsUiState journeyDetailsUiState11110 = journeyDetailsUiState4;
                priceDetailsUiState5 = priceDetailsUiState2;
                loadingDialogUIState9 = loadingDialogUIState6;
                toolbarUIState7 = toolbarUIState4;
                journeyDetailsUiState8 = journeyDetailsUiState11110;
                Function1 function11113 = function7;
                confirmBookingScreenDataState13 = confirmBookingScreenDataState11;
                function9 = function11113;
                tnCDialogUIState2 = tnCDialogUIState;
                StringEnum stringEnum118 = StringEnum.FARE_DETAILS_PAY;
                Object[] objArr118 = {str9};
                confirmBookingUIStateFactory$create$1.L$0 = confirmBookingScreenDataState13;
                confirmBookingUIStateFactory$create$1.L$1 = function9;
                confirmBookingUIStateFactory$create$1.L$2 = loadingDialogUIState9;
                confirmBookingUIStateFactory$create$1.L$3 = toolbarUIState7;
                confirmBookingUIStateFactory$create$1.L$4 = journeyDetailsUiState8;
                confirmBookingUIStateFactory$create$1.L$5 = priceDetailsUiState5;
                confirmBookingUIStateFactory$create$1.L$6 = termsAndConditionsUiState;
                confirmBookingUIStateFactory$create$1.L$7 = tnCDialogUIState2;
                buttonUIStateFactory = ButtonUIStateFactory.f9921a;
                confirmBookingUIStateFactory$create$1.L$8 = buttonUIStateFactory;
                confirmBookingUIStateFactory$create$1.L$9 = tnCDialogUIState;
                confirmBookingUIStateFactory$create$1.L$10 = tnCDialogUIState;
                confirmBookingUIStateFactory$create$1.label = 12;
                objB11 = stringProvider.b(stringEnum118, objArr118, confirmBookingUIStateFactory$create$1);
                if (objB11 != obj11) {
                    priceDetailsUiState6 = priceDetailsUiState5;
                    termsAndConditionsUiState2 = termsAndConditionsUiState;
                    confirmBookingScreenDataState14 = confirmBookingScreenDataState13;
                    loadingDialogUIState10 = loadingDialogUIState9;
                    buttonUIStateFactory2 = buttonUIStateFactory;
                    tnCDialogUIState3 = tnCDialogUIState2;
                    function10 = function9;
                    confirmBookingScreenDataState15 = confirmBookingScreenDataState14;
                    journeyDetailsUiState9 = journeyDetailsUiState8;
                    tnCDialogUIState4 = tnCDialogUIState3;
                    loadingDialogUIState11 = loadingDialogUIState10;
                    stringProvider2 = stringProvider;
                    obj13 = obj11;
                    toolbarUIState8 = toolbarUIState7;
                    buttonUIStateG = ButtonUIStateFactory.g(buttonUIStateFactory2, (String) objB11, new bp(function10, 15), null, UIShape.d, true, 0.0f, 36);
                    if (confirmBookingScreenDataState15.l) {
                        confirmBookingUIStateFactory$create$1.L$0 = confirmBookingScreenDataState15;
                        confirmBookingUIStateFactory$create$1.L$1 = function10;
                        confirmBookingUIStateFactory$create$1.L$2 = loadingDialogUIState11;
                        confirmBookingUIStateFactory$create$1.L$3 = toolbarUIState8;
                        confirmBookingUIStateFactory$create$1.L$4 = journeyDetailsUiState9;
                        confirmBookingUIStateFactory$create$1.L$5 = priceDetailsUiState6;
                        confirmBookingUIStateFactory$create$1.L$6 = termsAndConditionsUiState2;
                        confirmBookingUIStateFactory$create$1.L$7 = tnCDialogUIState4;
                        confirmBookingUIStateFactory$create$1.L$8 = buttonUIStateG;
                        chaloTextStyleHelper14 = chaloTextStyleHelper11;
                        confirmBookingUIStateFactory$create$1.L$9 = chaloTextStyleHelper14;
                        confirmBookingUIStateFactory$create$1.label = 13;
                        stringProvider3 = stringProvider2;
                        objB12 = stringProvider3.b(StringEnum.SOMETHING_WENT_WRONG, new Object[0], confirmBookingUIStateFactory$create$1);
                        obj14 = obj13;
                        if (objB12 == obj14) {
                            return obj14;
                        }
                        journeyDetailsUiState11 = journeyDetailsUiState9;
                        priceDetailsUiState8 = priceDetailsUiState6;
                        function11 = function10;
                        confirmBookingScreenDataState17 = confirmBookingScreenDataState15;
                        obj15 = objB12;
                        tnCDialogUIState6 = tnCDialogUIState4;
                        chaloTextStyleHelper15 = chaloTextStyleHelper14;
                        chaloTextUIStateB = ChaloTextStyleHelper.b(chaloTextStyleHelper15, (String) obj15, ChaloColorToken.White.f9870a, 0, null, null, null, null, 124);
                        confirmBookingUIStateFactory$create$1.L$0 = confirmBookingScreenDataState17;
                        confirmBookingUIStateFactory$create$1.L$1 = function11;
                        confirmBookingUIStateFactory$create$1.L$2 = loadingDialogUIState11;
                        confirmBookingUIStateFactory$create$1.L$3 = toolbarUIState8;
                        confirmBookingUIStateFactory$create$1.L$4 = journeyDetailsUiState11;
                        confirmBookingUIStateFactory$create$1.L$5 = priceDetailsUiState8;
                        confirmBookingUIStateFactory$create$1.L$6 = termsAndConditionsUiState2;
                        confirmBookingUIStateFactory$create$1.L$7 = tnCDialogUIState6;
                        confirmBookingUIStateFactory$create$1.L$8 = buttonUIStateG;
                        confirmBookingUIStateFactory$create$1.L$9 = chaloTextUIStateB;
                        confirmBookingUIStateFactory$create$1.L$10 = chaloTextStyleHelper14;
                        confirmBookingScreenDataState18 = confirmBookingScreenDataState17;
                        confirmBookingUIStateFactory$create$1.label = 14;
                        objB13 = stringProvider3.b(StringEnum.RETRY, new Object[0], confirmBookingUIStateFactory$create$1);
                        if (objB13 == obj14) {
                            return obj14;
                        }
                        toolbarUIState10 = toolbarUIState8;
                        termsAndConditionsUiState4 = termsAndConditionsUiState2;
                        confirmBookingScreenDataState19 = confirmBookingScreenDataState18;
                        function12 = function11;
                        chaloTextUIState3 = chaloTextUIStateB;
                        obj16 = objB13;
                        priceDetailsUiState9 = priceDetailsUiState8;
                        chaloTextStyleHelper16 = chaloTextStyleHelper14;
                        loadingDialogUIState13 = loadingDialogUIState11;
                        journeyDetailsUiState12 = journeyDetailsUiState11;
                        ChaloColorToken.OrangePrimary orangePrimary119 = orangePrimary;
                        priceDetailsUiState7 = priceDetailsUiState9;
                        tnCDialogUIState5 = tnCDialogUIState6;
                        termsAndConditionsUiState3 = termsAndConditionsUiState4;
                        snackbarUIState = new SnackbarUIState(chaloTextUIState3, ChaloTextStyleHelper.b(chaloTextStyleHelper16, (String) obj16, orangePrimary119, 0, null, UIFontWeight.SemiBold, null, null, 108), UiEventHandler.Companion.a(new bp(function12, 16)));
                        journeyDetailsUiState10 = journeyDetailsUiState12;
                        toolbarUIState9 = toolbarUIState10;
                        loadingDialogUIState12 = loadingDialogUIState13;
                        confirmBookingScreenDataState16 = confirmBookingScreenDataState19;
                    } else {
                        confirmBookingScreenDataState16 = confirmBookingScreenDataState15;
                        journeyDetailsUiState10 = journeyDetailsUiState9;
                        tnCDialogUIState5 = tnCDialogUIState4;
                        loadingDialogUIState12 = loadingDialogUIState11;
                        toolbarUIState9 = toolbarUIState8;
                        termsAndConditionsUiState3 = termsAndConditionsUiState2;
                        priceDetailsUiState7 = priceDetailsUiState6;
                        snackbarUIState = null;
                    }
                    ButtonUIState buttonUIState118 = buttonUIStateG;
                    boolean z119 = confirmBookingScreenDataState16.k;
                    if (confirmBookingScreenDataState16.c) {
                        loadingDialogUIState14 = loadingDialogUIState12;
                    } else {
                        loadingDialogUIState14 = null;
                    }
                    return new ConfirmBookingScreenViewState(toolbarUIState9, journeyDetailsUiState10, priceDetailsUiState7, termsAndConditionsUiState3, tnCDialogUIState5, buttonUIState118, snackbarUIState, z119, loadingDialogUIState14);
                }
                return obj11;
            case 9:
                int i8 = confirmBookingUIStateFactory$create$1.I$0;
                StyledTextDataUIState[] styledTextDataUIStateArr5 = (StyledTextDataUIState[]) confirmBookingUIStateFactory$create$1.L$10;
                List list22 = (List) confirmBookingUIStateFactory$create$1.L$9;
                chaloTextUIState = (TextUIState.ChaloTextUIState) confirmBookingUIStateFactory$create$1.L$8;
                StyledTextDataUIState[] styledTextDataUIStateArr6 = (StyledTextDataUIState[]) confirmBookingUIStateFactory$create$1.L$7;
                priceDetailsUiState3 = (PriceDetailsUiState) confirmBookingUIStateFactory$create$1.L$6;
                String str22 = (String) confirmBookingUIStateFactory$create$1.L$5;
                JourneyDetailsUiState journeyDetailsUiState21 = (JourneyDetailsUiState) confirmBookingUIStateFactory$create$1.L$4;
                ToolbarUIState toolbarUIState17 = (ToolbarUIState) confirmBookingUIStateFactory$create$1.L$3;
                LoadingDialogUIState loadingDialogUIState20 = (LoadingDialogUIState) confirmBookingUIStateFactory$create$1.L$2;
                Function1 function24 = (Function1) confirmBookingUIStateFactory$create$1.L$1;
                ConfirmBookingScreenDataState confirmBookingScreenDataState25 = (ConfirmBookingScreenDataState) confirmBookingUIStateFactory$create$1.L$0;
                ResultKt.b(obj16);
                obj7 = obj17;
                styledTextDataUIStateArr = styledTextDataUIStateArr6;
                str11 = str22;
                chaloTextStyleHelper11 = chaloTextStyleHelper17;
                i4 = i8;
                orangePrimary = orangePrimary;
                loadingDialogUIState7 = loadingDialogUIState20;
                journeyDetailsUiState6 = journeyDetailsUiState21;
                stringProvider = stringProvider4;
                function7 = function24;
                styledTextDataUIStateArr2 = styledTextDataUIStateArr5;
                toolbarUIState5 = toolbarUIState17;
                confirmBookingScreenDataState10 = confirmBookingScreenDataState25;
                obj10 = obj16;
                list11 = list22;
                styledTextDataUIStateArr2[i4] = new StyledTextDataUIState(obj10 + " ", null, null, UITextStyle.BodySmall, null, null, null, 1014);
                confirmBookingUIStateFactory$create$1.L$0 = confirmBookingScreenDataState10;
                confirmBookingUIStateFactory$create$1.L$1 = function7;
                confirmBookingUIStateFactory$create$1.L$2 = loadingDialogUIState7;
                confirmBookingUIStateFactory$create$1.L$3 = toolbarUIState5;
                confirmBookingUIStateFactory$create$1.L$4 = journeyDetailsUiState6;
                confirmBookingUIStateFactory$create$1.L$5 = str11;
                confirmBookingUIStateFactory$create$1.L$6 = priceDetailsUiState3;
                confirmBookingUIStateFactory$create$1.L$7 = styledTextDataUIStateArr;
                confirmBookingUIStateFactory$create$1.L$8 = chaloTextUIState;
                confirmBookingUIStateFactory$create$1.L$9 = list11;
                confirmBookingUIStateFactory$create$1.L$10 = styledTextDataUIStateArr;
                confirmBookingUIStateFactory$create$1.I$0 = 1;
                confirmBookingUIStateFactory$create$1.label = 10;
                objB10 = stringProvider.b(StringEnum.TNC_CLICKABLE_TEXT, new Object[0], confirmBookingUIStateFactory$create$1);
                if (objB10 == obj7) {
                    return obj7;
                }
                styledTextDataUIStateArr3 = styledTextDataUIStateArr;
                str12 = str11;
                loadingDialogUIState8 = loadingDialogUIState7;
                confirmBookingScreenDataState12 = confirmBookingScreenDataState10;
                toolbarUIState6 = toolbarUIState5;
                i5 = 1;
                chaloTextUIState2 = chaloTextUIState;
                function8 = function7;
                list12 = list11;
                styledTextDataUIStateArr4 = styledTextDataUIStateArr3;
                priceDetailsUiState4 = priceDetailsUiState3;
                journeyDetailsUiState7 = journeyDetailsUiState6;
                String str1116 = (String) objB10;
                obj9 = obj7;
                tnCDialogUIState = null;
                styledTextDataUIStateArr4[i5] = new StyledTextDataUIState(str1116, orangePrimary, UIFontWeight.Bold, UITextStyle.BodySmall, null, null, new StyledTextClickHandler() { // from class: app.chalo.metro.ui.confirmbooking.uistate.ConfirmBookingUIStateFactory$create$termsAndConditionsUiState$2$1
                    @Override // app.chalo.uistate.text.StyledTextClickHandler
                    public final void a() {
                        function8.invoke(ConfirmBookingScreenViewIntent.OnTermsAndConditionsClicked.f5468a);
                    }

                    @Override // app.chalo.uistate.text.StyledTextClickHandler
                    /* JADX INFO: renamed from: b */
                    public final String getB() {
                        return "TNC_CLICKABLE_TEXT";
                    }

                    @Override // app.chalo.uistate.text.StyledTextClickHandler
                    /* JADX INFO: renamed from: getTag */
                    public final String getF10085a() {
                        return "TNC_CLICKABLE_TEXT";
                    }
                }, 496);
                termsAndConditionsUiState = new TermsAndConditionsUiState(chaloTextUIState2, list12, new TextUIState.StyledTextUIState(CollectionsKt.S(styledTextDataUIStateArr3), null, null, 30));
                function7 = function8;
                confirmBookingScreenDataState11 = confirmBookingScreenDataState12;
                priceDetailsUiState2 = priceDetailsUiState4;
                str9 = str12;
                journeyDetailsUiState4 = journeyDetailsUiState7;
                loadingDialogUIState6 = loadingDialogUIState8;
                toolbarUIState4 = toolbarUIState6;
                z = confirmBookingScreenDataState11.m;
                List list111115 = confirmBookingScreenDataState11.j;
                if (z) {
                    break;
                }
                obj11 = obj9;
                JourneyDetailsUiState journeyDetailsUiState11111 = journeyDetailsUiState4;
                priceDetailsUiState5 = priceDetailsUiState2;
                loadingDialogUIState9 = loadingDialogUIState6;
                toolbarUIState7 = toolbarUIState4;
                journeyDetailsUiState8 = journeyDetailsUiState11111;
                Function1 function11114 = function7;
                confirmBookingScreenDataState13 = confirmBookingScreenDataState11;
                function9 = function11114;
                tnCDialogUIState2 = tnCDialogUIState;
                StringEnum stringEnum119 = StringEnum.FARE_DETAILS_PAY;
                Object[] objArr119 = {str9};
                confirmBookingUIStateFactory$create$1.L$0 = confirmBookingScreenDataState13;
                confirmBookingUIStateFactory$create$1.L$1 = function9;
                confirmBookingUIStateFactory$create$1.L$2 = loadingDialogUIState9;
                confirmBookingUIStateFactory$create$1.L$3 = toolbarUIState7;
                confirmBookingUIStateFactory$create$1.L$4 = journeyDetailsUiState8;
                confirmBookingUIStateFactory$create$1.L$5 = priceDetailsUiState5;
                confirmBookingUIStateFactory$create$1.L$6 = termsAndConditionsUiState;
                confirmBookingUIStateFactory$create$1.L$7 = tnCDialogUIState2;
                buttonUIStateFactory = ButtonUIStateFactory.f9921a;
                confirmBookingUIStateFactory$create$1.L$8 = buttonUIStateFactory;
                confirmBookingUIStateFactory$create$1.L$9 = tnCDialogUIState;
                confirmBookingUIStateFactory$create$1.L$10 = tnCDialogUIState;
                confirmBookingUIStateFactory$create$1.label = 12;
                objB11 = stringProvider.b(stringEnum119, objArr119, confirmBookingUIStateFactory$create$1);
                if (objB11 != obj11) {
                    priceDetailsUiState6 = priceDetailsUiState5;
                    termsAndConditionsUiState2 = termsAndConditionsUiState;
                    confirmBookingScreenDataState14 = confirmBookingScreenDataState13;
                    loadingDialogUIState10 = loadingDialogUIState9;
                    buttonUIStateFactory2 = buttonUIStateFactory;
                    tnCDialogUIState3 = tnCDialogUIState2;
                    function10 = function9;
                    confirmBookingScreenDataState15 = confirmBookingScreenDataState14;
                    journeyDetailsUiState9 = journeyDetailsUiState8;
                    tnCDialogUIState4 = tnCDialogUIState3;
                    loadingDialogUIState11 = loadingDialogUIState10;
                    stringProvider2 = stringProvider;
                    obj13 = obj11;
                    toolbarUIState8 = toolbarUIState7;
                    buttonUIStateG = ButtonUIStateFactory.g(buttonUIStateFactory2, (String) objB11, new bp(function10, 15), null, UIShape.d, true, 0.0f, 36);
                    if (confirmBookingScreenDataState15.l) {
                        confirmBookingUIStateFactory$create$1.L$0 = confirmBookingScreenDataState15;
                        confirmBookingUIStateFactory$create$1.L$1 = function10;
                        confirmBookingUIStateFactory$create$1.L$2 = loadingDialogUIState11;
                        confirmBookingUIStateFactory$create$1.L$3 = toolbarUIState8;
                        confirmBookingUIStateFactory$create$1.L$4 = journeyDetailsUiState9;
                        confirmBookingUIStateFactory$create$1.L$5 = priceDetailsUiState6;
                        confirmBookingUIStateFactory$create$1.L$6 = termsAndConditionsUiState2;
                        confirmBookingUIStateFactory$create$1.L$7 = tnCDialogUIState4;
                        confirmBookingUIStateFactory$create$1.L$8 = buttonUIStateG;
                        chaloTextStyleHelper14 = chaloTextStyleHelper11;
                        confirmBookingUIStateFactory$create$1.L$9 = chaloTextStyleHelper14;
                        confirmBookingUIStateFactory$create$1.label = 13;
                        stringProvider3 = stringProvider2;
                        objB12 = stringProvider3.b(StringEnum.SOMETHING_WENT_WRONG, new Object[0], confirmBookingUIStateFactory$create$1);
                        obj14 = obj13;
                        if (objB12 == obj14) {
                            return obj14;
                        }
                        journeyDetailsUiState11 = journeyDetailsUiState9;
                        priceDetailsUiState8 = priceDetailsUiState6;
                        function11 = function10;
                        confirmBookingScreenDataState17 = confirmBookingScreenDataState15;
                        obj15 = objB12;
                        tnCDialogUIState6 = tnCDialogUIState4;
                        chaloTextStyleHelper15 = chaloTextStyleHelper14;
                        chaloTextUIStateB = ChaloTextStyleHelper.b(chaloTextStyleHelper15, (String) obj15, ChaloColorToken.White.f9870a, 0, null, null, null, null, 124);
                        confirmBookingUIStateFactory$create$1.L$0 = confirmBookingScreenDataState17;
                        confirmBookingUIStateFactory$create$1.L$1 = function11;
                        confirmBookingUIStateFactory$create$1.L$2 = loadingDialogUIState11;
                        confirmBookingUIStateFactory$create$1.L$3 = toolbarUIState8;
                        confirmBookingUIStateFactory$create$1.L$4 = journeyDetailsUiState11;
                        confirmBookingUIStateFactory$create$1.L$5 = priceDetailsUiState8;
                        confirmBookingUIStateFactory$create$1.L$6 = termsAndConditionsUiState2;
                        confirmBookingUIStateFactory$create$1.L$7 = tnCDialogUIState6;
                        confirmBookingUIStateFactory$create$1.L$8 = buttonUIStateG;
                        confirmBookingUIStateFactory$create$1.L$9 = chaloTextUIStateB;
                        confirmBookingUIStateFactory$create$1.L$10 = chaloTextStyleHelper14;
                        confirmBookingScreenDataState18 = confirmBookingScreenDataState17;
                        confirmBookingUIStateFactory$create$1.label = 14;
                        objB13 = stringProvider3.b(StringEnum.RETRY, new Object[0], confirmBookingUIStateFactory$create$1);
                        if (objB13 == obj14) {
                            return obj14;
                        }
                        toolbarUIState10 = toolbarUIState8;
                        termsAndConditionsUiState4 = termsAndConditionsUiState2;
                        confirmBookingScreenDataState19 = confirmBookingScreenDataState18;
                        function12 = function11;
                        chaloTextUIState3 = chaloTextUIStateB;
                        obj16 = objB13;
                        priceDetailsUiState9 = priceDetailsUiState8;
                        chaloTextStyleHelper16 = chaloTextStyleHelper14;
                        loadingDialogUIState13 = loadingDialogUIState11;
                        journeyDetailsUiState12 = journeyDetailsUiState11;
                        ChaloColorToken.OrangePrimary orangePrimary1110 = orangePrimary;
                        priceDetailsUiState7 = priceDetailsUiState9;
                        tnCDialogUIState5 = tnCDialogUIState6;
                        termsAndConditionsUiState3 = termsAndConditionsUiState4;
                        snackbarUIState = new SnackbarUIState(chaloTextUIState3, ChaloTextStyleHelper.b(chaloTextStyleHelper16, (String) obj16, orangePrimary1110, 0, null, UIFontWeight.SemiBold, null, null, 108), UiEventHandler.Companion.a(new bp(function12, 16)));
                        journeyDetailsUiState10 = journeyDetailsUiState12;
                        toolbarUIState9 = toolbarUIState10;
                        loadingDialogUIState12 = loadingDialogUIState13;
                        confirmBookingScreenDataState16 = confirmBookingScreenDataState19;
                    } else {
                        confirmBookingScreenDataState16 = confirmBookingScreenDataState15;
                        journeyDetailsUiState10 = journeyDetailsUiState9;
                        tnCDialogUIState5 = tnCDialogUIState4;
                        loadingDialogUIState12 = loadingDialogUIState11;
                        toolbarUIState9 = toolbarUIState8;
                        termsAndConditionsUiState3 = termsAndConditionsUiState2;
                        priceDetailsUiState7 = priceDetailsUiState6;
                        snackbarUIState = null;
                    }
                    ButtonUIState buttonUIState119 = buttonUIStateG;
                    boolean z1110 = confirmBookingScreenDataState16.k;
                    if (confirmBookingScreenDataState16.c) {
                        loadingDialogUIState14 = loadingDialogUIState12;
                    } else {
                        loadingDialogUIState14 = null;
                    }
                    return new ConfirmBookingScreenViewState(toolbarUIState9, journeyDetailsUiState10, priceDetailsUiState7, termsAndConditionsUiState3, tnCDialogUIState5, buttonUIState119, snackbarUIState, z1110, loadingDialogUIState14);
                }
                return obj11;
            case 10:
                int i9 = confirmBookingUIStateFactory$create$1.I$0;
                StyledTextDataUIState[] styledTextDataUIStateArr7 = (StyledTextDataUIState[]) confirmBookingUIStateFactory$create$1.L$10;
                List list23 = (List) confirmBookingUIStateFactory$create$1.L$9;
                TextUIState.ChaloTextUIState chaloTextUIState4 = (TextUIState.ChaloTextUIState) confirmBookingUIStateFactory$create$1.L$8;
                StyledTextDataUIState[] styledTextDataUIStateArr8 = (StyledTextDataUIState[]) confirmBookingUIStateFactory$create$1.L$7;
                PriceDetailsUiState priceDetailsUiState11 = (PriceDetailsUiState) confirmBookingUIStateFactory$create$1.L$6;
                String str23 = (String) confirmBookingUIStateFactory$create$1.L$5;
                JourneyDetailsUiState journeyDetailsUiState22 = (JourneyDetailsUiState) confirmBookingUIStateFactory$create$1.L$4;
                ToolbarUIState toolbarUIState18 = (ToolbarUIState) confirmBookingUIStateFactory$create$1.L$3;
                LoadingDialogUIState loadingDialogUIState21 = (LoadingDialogUIState) confirmBookingUIStateFactory$create$1.L$2;
                Function1 function25 = (Function1) confirmBookingUIStateFactory$create$1.L$1;
                ConfirmBookingScreenDataState confirmBookingScreenDataState26 = (ConfirmBookingScreenDataState) confirmBookingUIStateFactory$create$1.L$0;
                ResultKt.b(obj16);
                confirmBookingScreenDataState12 = confirmBookingScreenDataState26;
                objB10 = obj16;
                styledTextDataUIStateArr3 = styledTextDataUIStateArr8;
                chaloTextUIState2 = chaloTextUIState4;
                list12 = list23;
                styledTextDataUIStateArr4 = styledTextDataUIStateArr7;
                orangePrimary = orangePrimary;
                str12 = str23;
                loadingDialogUIState8 = loadingDialogUIState21;
                toolbarUIState6 = toolbarUIState18;
                stringProvider = stringProvider4;
                chaloTextStyleHelper11 = chaloTextStyleHelper17;
                i5 = i9;
                obj7 = obj17;
                function8 = function25;
                journeyDetailsUiState7 = journeyDetailsUiState22;
                priceDetailsUiState4 = priceDetailsUiState11;
                String str1117 = (String) objB10;
                obj9 = obj7;
                tnCDialogUIState = null;
                styledTextDataUIStateArr4[i5] = new StyledTextDataUIState(str1117, orangePrimary, UIFontWeight.Bold, UITextStyle.BodySmall, null, null, new StyledTextClickHandler() { // from class: app.chalo.metro.ui.confirmbooking.uistate.ConfirmBookingUIStateFactory$create$termsAndConditionsUiState$2$1
                    @Override // app.chalo.uistate.text.StyledTextClickHandler
                    public final void a() {
                        function8.invoke(ConfirmBookingScreenViewIntent.OnTermsAndConditionsClicked.f5468a);
                    }

                    @Override // app.chalo.uistate.text.StyledTextClickHandler
                    /* JADX INFO: renamed from: b */
                    public final String getB() {
                        return "TNC_CLICKABLE_TEXT";
                    }

                    @Override // app.chalo.uistate.text.StyledTextClickHandler
                    /* JADX INFO: renamed from: getTag */
                    public final String getF10085a() {
                        return "TNC_CLICKABLE_TEXT";
                    }
                }, 496);
                termsAndConditionsUiState = new TermsAndConditionsUiState(chaloTextUIState2, list12, new TextUIState.StyledTextUIState(CollectionsKt.S(styledTextDataUIStateArr3), null, null, 30));
                function7 = function8;
                confirmBookingScreenDataState11 = confirmBookingScreenDataState12;
                priceDetailsUiState2 = priceDetailsUiState4;
                str9 = str12;
                journeyDetailsUiState4 = journeyDetailsUiState7;
                loadingDialogUIState6 = loadingDialogUIState8;
                toolbarUIState4 = toolbarUIState6;
                z = confirmBookingScreenDataState11.m;
                List list111116 = confirmBookingScreenDataState11.j;
                if (z) {
                    break;
                }
                obj11 = obj9;
                JourneyDetailsUiState journeyDetailsUiState11112 = journeyDetailsUiState4;
                priceDetailsUiState5 = priceDetailsUiState2;
                loadingDialogUIState9 = loadingDialogUIState6;
                toolbarUIState7 = toolbarUIState4;
                journeyDetailsUiState8 = journeyDetailsUiState11112;
                Function1 function11115 = function7;
                confirmBookingScreenDataState13 = confirmBookingScreenDataState11;
                function9 = function11115;
                tnCDialogUIState2 = tnCDialogUIState;
                StringEnum stringEnum1110 = StringEnum.FARE_DETAILS_PAY;
                Object[] objArr1110 = {str9};
                confirmBookingUIStateFactory$create$1.L$0 = confirmBookingScreenDataState13;
                confirmBookingUIStateFactory$create$1.L$1 = function9;
                confirmBookingUIStateFactory$create$1.L$2 = loadingDialogUIState9;
                confirmBookingUIStateFactory$create$1.L$3 = toolbarUIState7;
                confirmBookingUIStateFactory$create$1.L$4 = journeyDetailsUiState8;
                confirmBookingUIStateFactory$create$1.L$5 = priceDetailsUiState5;
                confirmBookingUIStateFactory$create$1.L$6 = termsAndConditionsUiState;
                confirmBookingUIStateFactory$create$1.L$7 = tnCDialogUIState2;
                buttonUIStateFactory = ButtonUIStateFactory.f9921a;
                confirmBookingUIStateFactory$create$1.L$8 = buttonUIStateFactory;
                confirmBookingUIStateFactory$create$1.L$9 = tnCDialogUIState;
                confirmBookingUIStateFactory$create$1.L$10 = tnCDialogUIState;
                confirmBookingUIStateFactory$create$1.label = 12;
                objB11 = stringProvider.b(stringEnum1110, objArr1110, confirmBookingUIStateFactory$create$1);
                if (objB11 != obj11) {
                    priceDetailsUiState6 = priceDetailsUiState5;
                    termsAndConditionsUiState2 = termsAndConditionsUiState;
                    confirmBookingScreenDataState14 = confirmBookingScreenDataState13;
                    loadingDialogUIState10 = loadingDialogUIState9;
                    buttonUIStateFactory2 = buttonUIStateFactory;
                    tnCDialogUIState3 = tnCDialogUIState2;
                    function10 = function9;
                    confirmBookingScreenDataState15 = confirmBookingScreenDataState14;
                    journeyDetailsUiState9 = journeyDetailsUiState8;
                    tnCDialogUIState4 = tnCDialogUIState3;
                    loadingDialogUIState11 = loadingDialogUIState10;
                    stringProvider2 = stringProvider;
                    obj13 = obj11;
                    toolbarUIState8 = toolbarUIState7;
                    buttonUIStateG = ButtonUIStateFactory.g(buttonUIStateFactory2, (String) objB11, new bp(function10, 15), null, UIShape.d, true, 0.0f, 36);
                    if (confirmBookingScreenDataState15.l) {
                        confirmBookingUIStateFactory$create$1.L$0 = confirmBookingScreenDataState15;
                        confirmBookingUIStateFactory$create$1.L$1 = function10;
                        confirmBookingUIStateFactory$create$1.L$2 = loadingDialogUIState11;
                        confirmBookingUIStateFactory$create$1.L$3 = toolbarUIState8;
                        confirmBookingUIStateFactory$create$1.L$4 = journeyDetailsUiState9;
                        confirmBookingUIStateFactory$create$1.L$5 = priceDetailsUiState6;
                        confirmBookingUIStateFactory$create$1.L$6 = termsAndConditionsUiState2;
                        confirmBookingUIStateFactory$create$1.L$7 = tnCDialogUIState4;
                        confirmBookingUIStateFactory$create$1.L$8 = buttonUIStateG;
                        chaloTextStyleHelper14 = chaloTextStyleHelper11;
                        confirmBookingUIStateFactory$create$1.L$9 = chaloTextStyleHelper14;
                        confirmBookingUIStateFactory$create$1.label = 13;
                        stringProvider3 = stringProvider2;
                        objB12 = stringProvider3.b(StringEnum.SOMETHING_WENT_WRONG, new Object[0], confirmBookingUIStateFactory$create$1);
                        obj14 = obj13;
                        if (objB12 == obj14) {
                            return obj14;
                        }
                        journeyDetailsUiState11 = journeyDetailsUiState9;
                        priceDetailsUiState8 = priceDetailsUiState6;
                        function11 = function10;
                        confirmBookingScreenDataState17 = confirmBookingScreenDataState15;
                        obj15 = objB12;
                        tnCDialogUIState6 = tnCDialogUIState4;
                        chaloTextStyleHelper15 = chaloTextStyleHelper14;
                        chaloTextUIStateB = ChaloTextStyleHelper.b(chaloTextStyleHelper15, (String) obj15, ChaloColorToken.White.f9870a, 0, null, null, null, null, 124);
                        confirmBookingUIStateFactory$create$1.L$0 = confirmBookingScreenDataState17;
                        confirmBookingUIStateFactory$create$1.L$1 = function11;
                        confirmBookingUIStateFactory$create$1.L$2 = loadingDialogUIState11;
                        confirmBookingUIStateFactory$create$1.L$3 = toolbarUIState8;
                        confirmBookingUIStateFactory$create$1.L$4 = journeyDetailsUiState11;
                        confirmBookingUIStateFactory$create$1.L$5 = priceDetailsUiState8;
                        confirmBookingUIStateFactory$create$1.L$6 = termsAndConditionsUiState2;
                        confirmBookingUIStateFactory$create$1.L$7 = tnCDialogUIState6;
                        confirmBookingUIStateFactory$create$1.L$8 = buttonUIStateG;
                        confirmBookingUIStateFactory$create$1.L$9 = chaloTextUIStateB;
                        confirmBookingUIStateFactory$create$1.L$10 = chaloTextStyleHelper14;
                        confirmBookingScreenDataState18 = confirmBookingScreenDataState17;
                        confirmBookingUIStateFactory$create$1.label = 14;
                        objB13 = stringProvider3.b(StringEnum.RETRY, new Object[0], confirmBookingUIStateFactory$create$1);
                        if (objB13 == obj14) {
                            return obj14;
                        }
                        toolbarUIState10 = toolbarUIState8;
                        termsAndConditionsUiState4 = termsAndConditionsUiState2;
                        confirmBookingScreenDataState19 = confirmBookingScreenDataState18;
                        function12 = function11;
                        chaloTextUIState3 = chaloTextUIStateB;
                        obj16 = objB13;
                        priceDetailsUiState9 = priceDetailsUiState8;
                        chaloTextStyleHelper16 = chaloTextStyleHelper14;
                        loadingDialogUIState13 = loadingDialogUIState11;
                        journeyDetailsUiState12 = journeyDetailsUiState11;
                        ChaloColorToken.OrangePrimary orangePrimary1111 = orangePrimary;
                        priceDetailsUiState7 = priceDetailsUiState9;
                        tnCDialogUIState5 = tnCDialogUIState6;
                        termsAndConditionsUiState3 = termsAndConditionsUiState4;
                        snackbarUIState = new SnackbarUIState(chaloTextUIState3, ChaloTextStyleHelper.b(chaloTextStyleHelper16, (String) obj16, orangePrimary1111, 0, null, UIFontWeight.SemiBold, null, null, 108), UiEventHandler.Companion.a(new bp(function12, 16)));
                        journeyDetailsUiState10 = journeyDetailsUiState12;
                        toolbarUIState9 = toolbarUIState10;
                        loadingDialogUIState12 = loadingDialogUIState13;
                        confirmBookingScreenDataState16 = confirmBookingScreenDataState19;
                    } else {
                        confirmBookingScreenDataState16 = confirmBookingScreenDataState15;
                        journeyDetailsUiState10 = journeyDetailsUiState9;
                        tnCDialogUIState5 = tnCDialogUIState4;
                        loadingDialogUIState12 = loadingDialogUIState11;
                        toolbarUIState9 = toolbarUIState8;
                        termsAndConditionsUiState3 = termsAndConditionsUiState2;
                        priceDetailsUiState7 = priceDetailsUiState6;
                        snackbarUIState = null;
                    }
                    ButtonUIState buttonUIState1110 = buttonUIStateG;
                    boolean z1111 = confirmBookingScreenDataState16.k;
                    if (confirmBookingScreenDataState16.c) {
                        loadingDialogUIState14 = loadingDialogUIState12;
                    } else {
                        loadingDialogUIState14 = null;
                    }
                    return new ConfirmBookingScreenViewState(toolbarUIState9, journeyDetailsUiState10, priceDetailsUiState7, termsAndConditionsUiState3, tnCDialogUIState5, buttonUIState1110, snackbarUIState, z1111, loadingDialogUIState14);
                }
                return obj11;
            case 11:
                obj12 = obj16;
                TermsAndConditionsUiState termsAndConditionsUiState5 = (TermsAndConditionsUiState) confirmBookingUIStateFactory$create$1.L$7;
                priceDetailsUiState2 = (PriceDetailsUiState) confirmBookingUIStateFactory$create$1.L$6;
                str9 = (String) confirmBookingUIStateFactory$create$1.L$5;
                journeyDetailsUiState4 = (JourneyDetailsUiState) confirmBookingUIStateFactory$create$1.L$4;
                toolbarUIState4 = (ToolbarUIState) confirmBookingUIStateFactory$create$1.L$3;
                loadingDialogUIState6 = (LoadingDialogUIState) confirmBookingUIStateFactory$create$1.L$2;
                Function1 function26 = (Function1) confirmBookingUIStateFactory$create$1.L$1;
                confirmBookingScreenDataState11 = (ConfirmBookingScreenDataState) confirmBookingUIStateFactory$create$1.L$0;
                ResultKt.b(obj12);
                obj11 = obj17;
                orangePrimary = orangePrimary;
                function7 = function26;
                chaloTextStyleHelper11 = chaloTextStyleHelper17;
                termsAndConditionsUiState = termsAndConditionsUiState5;
                stringProvider = stringProvider4;
                tnCDialogUIState = null;
                tnCDialogUIState2 = (TnCDialogUIState) obj12;
                JourneyDetailsUiState journeyDetailsUiState120 = journeyDetailsUiState4;
                priceDetailsUiState5 = priceDetailsUiState2;
                loadingDialogUIState9 = loadingDialogUIState6;
                toolbarUIState7 = toolbarUIState4;
                journeyDetailsUiState8 = journeyDetailsUiState120;
                Function1 function120 = function7;
                confirmBookingScreenDataState13 = confirmBookingScreenDataState11;
                function9 = function120;
                StringEnum stringEnum1111 = StringEnum.FARE_DETAILS_PAY;
                Object[] objArr1111 = {str9};
                confirmBookingUIStateFactory$create$1.L$0 = confirmBookingScreenDataState13;
                confirmBookingUIStateFactory$create$1.L$1 = function9;
                confirmBookingUIStateFactory$create$1.L$2 = loadingDialogUIState9;
                confirmBookingUIStateFactory$create$1.L$3 = toolbarUIState7;
                confirmBookingUIStateFactory$create$1.L$4 = journeyDetailsUiState8;
                confirmBookingUIStateFactory$create$1.L$5 = priceDetailsUiState5;
                confirmBookingUIStateFactory$create$1.L$6 = termsAndConditionsUiState;
                confirmBookingUIStateFactory$create$1.L$7 = tnCDialogUIState2;
                buttonUIStateFactory = ButtonUIStateFactory.f9921a;
                confirmBookingUIStateFactory$create$1.L$8 = buttonUIStateFactory;
                confirmBookingUIStateFactory$create$1.L$9 = tnCDialogUIState;
                confirmBookingUIStateFactory$create$1.L$10 = tnCDialogUIState;
                confirmBookingUIStateFactory$create$1.label = 12;
                objB11 = stringProvider.b(stringEnum1111, objArr1111, confirmBookingUIStateFactory$create$1);
                if (objB11 != obj11) {
                    priceDetailsUiState6 = priceDetailsUiState5;
                    termsAndConditionsUiState2 = termsAndConditionsUiState;
                    confirmBookingScreenDataState14 = confirmBookingScreenDataState13;
                    loadingDialogUIState10 = loadingDialogUIState9;
                    buttonUIStateFactory2 = buttonUIStateFactory;
                    tnCDialogUIState3 = tnCDialogUIState2;
                    function10 = function9;
                    confirmBookingScreenDataState15 = confirmBookingScreenDataState14;
                    journeyDetailsUiState9 = journeyDetailsUiState8;
                    tnCDialogUIState4 = tnCDialogUIState3;
                    loadingDialogUIState11 = loadingDialogUIState10;
                    stringProvider2 = stringProvider;
                    obj13 = obj11;
                    toolbarUIState8 = toolbarUIState7;
                    buttonUIStateG = ButtonUIStateFactory.g(buttonUIStateFactory2, (String) objB11, new bp(function10, 15), null, UIShape.d, true, 0.0f, 36);
                    if (confirmBookingScreenDataState15.l) {
                        confirmBookingUIStateFactory$create$1.L$0 = confirmBookingScreenDataState15;
                        confirmBookingUIStateFactory$create$1.L$1 = function10;
                        confirmBookingUIStateFactory$create$1.L$2 = loadingDialogUIState11;
                        confirmBookingUIStateFactory$create$1.L$3 = toolbarUIState8;
                        confirmBookingUIStateFactory$create$1.L$4 = journeyDetailsUiState9;
                        confirmBookingUIStateFactory$create$1.L$5 = priceDetailsUiState6;
                        confirmBookingUIStateFactory$create$1.L$6 = termsAndConditionsUiState2;
                        confirmBookingUIStateFactory$create$1.L$7 = tnCDialogUIState4;
                        confirmBookingUIStateFactory$create$1.L$8 = buttonUIStateG;
                        chaloTextStyleHelper14 = chaloTextStyleHelper11;
                        confirmBookingUIStateFactory$create$1.L$9 = chaloTextStyleHelper14;
                        confirmBookingUIStateFactory$create$1.label = 13;
                        stringProvider3 = stringProvider2;
                        objB12 = stringProvider3.b(StringEnum.SOMETHING_WENT_WRONG, new Object[0], confirmBookingUIStateFactory$create$1);
                        obj14 = obj13;
                        if (objB12 == obj14) {
                            return obj14;
                        }
                        journeyDetailsUiState11 = journeyDetailsUiState9;
                        priceDetailsUiState8 = priceDetailsUiState6;
                        function11 = function10;
                        confirmBookingScreenDataState17 = confirmBookingScreenDataState15;
                        obj15 = objB12;
                        tnCDialogUIState6 = tnCDialogUIState4;
                        chaloTextStyleHelper15 = chaloTextStyleHelper14;
                        chaloTextUIStateB = ChaloTextStyleHelper.b(chaloTextStyleHelper15, (String) obj15, ChaloColorToken.White.f9870a, 0, null, null, null, null, 124);
                        confirmBookingUIStateFactory$create$1.L$0 = confirmBookingScreenDataState17;
                        confirmBookingUIStateFactory$create$1.L$1 = function11;
                        confirmBookingUIStateFactory$create$1.L$2 = loadingDialogUIState11;
                        confirmBookingUIStateFactory$create$1.L$3 = toolbarUIState8;
                        confirmBookingUIStateFactory$create$1.L$4 = journeyDetailsUiState11;
                        confirmBookingUIStateFactory$create$1.L$5 = priceDetailsUiState8;
                        confirmBookingUIStateFactory$create$1.L$6 = termsAndConditionsUiState2;
                        confirmBookingUIStateFactory$create$1.L$7 = tnCDialogUIState6;
                        confirmBookingUIStateFactory$create$1.L$8 = buttonUIStateG;
                        confirmBookingUIStateFactory$create$1.L$9 = chaloTextUIStateB;
                        confirmBookingUIStateFactory$create$1.L$10 = chaloTextStyleHelper14;
                        confirmBookingScreenDataState18 = confirmBookingScreenDataState17;
                        confirmBookingUIStateFactory$create$1.label = 14;
                        objB13 = stringProvider3.b(StringEnum.RETRY, new Object[0], confirmBookingUIStateFactory$create$1);
                        if (objB13 == obj14) {
                            return obj14;
                        }
                        toolbarUIState10 = toolbarUIState8;
                        termsAndConditionsUiState4 = termsAndConditionsUiState2;
                        confirmBookingScreenDataState19 = confirmBookingScreenDataState18;
                        function12 = function11;
                        chaloTextUIState3 = chaloTextUIStateB;
                        obj16 = objB13;
                        priceDetailsUiState9 = priceDetailsUiState8;
                        chaloTextStyleHelper16 = chaloTextStyleHelper14;
                        loadingDialogUIState13 = loadingDialogUIState11;
                        journeyDetailsUiState12 = journeyDetailsUiState11;
                        ChaloColorToken.OrangePrimary orangePrimary1112 = orangePrimary;
                        priceDetailsUiState7 = priceDetailsUiState9;
                        tnCDialogUIState5 = tnCDialogUIState6;
                        termsAndConditionsUiState3 = termsAndConditionsUiState4;
                        snackbarUIState = new SnackbarUIState(chaloTextUIState3, ChaloTextStyleHelper.b(chaloTextStyleHelper16, (String) obj16, orangePrimary1112, 0, null, UIFontWeight.SemiBold, null, null, 108), UiEventHandler.Companion.a(new bp(function12, 16)));
                        journeyDetailsUiState10 = journeyDetailsUiState12;
                        toolbarUIState9 = toolbarUIState10;
                        loadingDialogUIState12 = loadingDialogUIState13;
                        confirmBookingScreenDataState16 = confirmBookingScreenDataState19;
                    } else {
                        confirmBookingScreenDataState16 = confirmBookingScreenDataState15;
                        journeyDetailsUiState10 = journeyDetailsUiState9;
                        tnCDialogUIState5 = tnCDialogUIState4;
                        loadingDialogUIState12 = loadingDialogUIState11;
                        toolbarUIState9 = toolbarUIState8;
                        termsAndConditionsUiState3 = termsAndConditionsUiState2;
                        priceDetailsUiState7 = priceDetailsUiState6;
                        snackbarUIState = null;
                    }
                    ButtonUIState buttonUIState1111 = buttonUIStateG;
                    boolean z1112 = confirmBookingScreenDataState16.k;
                    if (confirmBookingScreenDataState16.c) {
                        loadingDialogUIState14 = loadingDialogUIState12;
                    } else {
                        loadingDialogUIState14 = null;
                    }
                    return new ConfirmBookingScreenViewState(toolbarUIState9, journeyDetailsUiState10, priceDetailsUiState7, termsAndConditionsUiState3, tnCDialogUIState5, buttonUIState1111, snackbarUIState, z1112, loadingDialogUIState14);
                }
                return obj11;
            case 12:
                ButtonUIStateFactory buttonUIStateFactory3 = (ButtonUIStateFactory) confirmBookingUIStateFactory$create$1.L$8;
                TnCDialogUIState tnCDialogUIState7 = (TnCDialogUIState) confirmBookingUIStateFactory$create$1.L$7;
                TermsAndConditionsUiState termsAndConditionsUiState6 = (TermsAndConditionsUiState) confirmBookingUIStateFactory$create$1.L$6;
                PriceDetailsUiState priceDetailsUiState12 = (PriceDetailsUiState) confirmBookingUIStateFactory$create$1.L$5;
                journeyDetailsUiState8 = (JourneyDetailsUiState) confirmBookingUIStateFactory$create$1.L$4;
                toolbarUIState7 = (ToolbarUIState) confirmBookingUIStateFactory$create$1.L$3;
                loadingDialogUIState10 = (LoadingDialogUIState) confirmBookingUIStateFactory$create$1.L$2;
                function9 = (Function1) confirmBookingUIStateFactory$create$1.L$1;
                ConfirmBookingScreenDataState confirmBookingScreenDataState27 = (ConfirmBookingScreenDataState) confirmBookingUIStateFactory$create$1.L$0;
                ResultKt.b(obj16);
                obj11 = obj17;
                orangePrimary = orangePrimary;
                chaloTextStyleHelper11 = chaloTextStyleHelper17;
                priceDetailsUiState6 = priceDetailsUiState12;
                confirmBookingScreenDataState14 = confirmBookingScreenDataState27;
                stringProvider = stringProvider4;
                tnCDialogUIState3 = tnCDialogUIState7;
                termsAndConditionsUiState2 = termsAndConditionsUiState6;
                buttonUIStateFactory2 = buttonUIStateFactory3;
                objB11 = obj16;
                function10 = function9;
                confirmBookingScreenDataState15 = confirmBookingScreenDataState14;
                journeyDetailsUiState9 = journeyDetailsUiState8;
                tnCDialogUIState4 = tnCDialogUIState3;
                loadingDialogUIState11 = loadingDialogUIState10;
                stringProvider2 = stringProvider;
                obj13 = obj11;
                toolbarUIState8 = toolbarUIState7;
                buttonUIStateG = ButtonUIStateFactory.g(buttonUIStateFactory2, (String) objB11, new bp(function10, 15), null, UIShape.d, true, 0.0f, 36);
                if (confirmBookingScreenDataState15.l) {
                    confirmBookingUIStateFactory$create$1.L$0 = confirmBookingScreenDataState15;
                    confirmBookingUIStateFactory$create$1.L$1 = function10;
                    confirmBookingUIStateFactory$create$1.L$2 = loadingDialogUIState11;
                    confirmBookingUIStateFactory$create$1.L$3 = toolbarUIState8;
                    confirmBookingUIStateFactory$create$1.L$4 = journeyDetailsUiState9;
                    confirmBookingUIStateFactory$create$1.L$5 = priceDetailsUiState6;
                    confirmBookingUIStateFactory$create$1.L$6 = termsAndConditionsUiState2;
                    confirmBookingUIStateFactory$create$1.L$7 = tnCDialogUIState4;
                    confirmBookingUIStateFactory$create$1.L$8 = buttonUIStateG;
                    chaloTextStyleHelper14 = chaloTextStyleHelper11;
                    confirmBookingUIStateFactory$create$1.L$9 = chaloTextStyleHelper14;
                    confirmBookingUIStateFactory$create$1.label = 13;
                    stringProvider3 = stringProvider2;
                    objB12 = stringProvider3.b(StringEnum.SOMETHING_WENT_WRONG, new Object[0], confirmBookingUIStateFactory$create$1);
                    obj14 = obj13;
                    if (objB12 == obj14) {
                        return obj14;
                    }
                    journeyDetailsUiState11 = journeyDetailsUiState9;
                    priceDetailsUiState8 = priceDetailsUiState6;
                    function11 = function10;
                    confirmBookingScreenDataState17 = confirmBookingScreenDataState15;
                    obj15 = objB12;
                    tnCDialogUIState6 = tnCDialogUIState4;
                    chaloTextStyleHelper15 = chaloTextStyleHelper14;
                    chaloTextUIStateB = ChaloTextStyleHelper.b(chaloTextStyleHelper15, (String) obj15, ChaloColorToken.White.f9870a, 0, null, null, null, null, 124);
                    confirmBookingUIStateFactory$create$1.L$0 = confirmBookingScreenDataState17;
                    confirmBookingUIStateFactory$create$1.L$1 = function11;
                    confirmBookingUIStateFactory$create$1.L$2 = loadingDialogUIState11;
                    confirmBookingUIStateFactory$create$1.L$3 = toolbarUIState8;
                    confirmBookingUIStateFactory$create$1.L$4 = journeyDetailsUiState11;
                    confirmBookingUIStateFactory$create$1.L$5 = priceDetailsUiState8;
                    confirmBookingUIStateFactory$create$1.L$6 = termsAndConditionsUiState2;
                    confirmBookingUIStateFactory$create$1.L$7 = tnCDialogUIState6;
                    confirmBookingUIStateFactory$create$1.L$8 = buttonUIStateG;
                    confirmBookingUIStateFactory$create$1.L$9 = chaloTextUIStateB;
                    confirmBookingUIStateFactory$create$1.L$10 = chaloTextStyleHelper14;
                    confirmBookingScreenDataState18 = confirmBookingScreenDataState17;
                    confirmBookingUIStateFactory$create$1.label = 14;
                    objB13 = stringProvider3.b(StringEnum.RETRY, new Object[0], confirmBookingUIStateFactory$create$1);
                    if (objB13 == obj14) {
                        return obj14;
                    }
                    toolbarUIState10 = toolbarUIState8;
                    termsAndConditionsUiState4 = termsAndConditionsUiState2;
                    confirmBookingScreenDataState19 = confirmBookingScreenDataState18;
                    function12 = function11;
                    chaloTextUIState3 = chaloTextUIStateB;
                    obj16 = objB13;
                    priceDetailsUiState9 = priceDetailsUiState8;
                    chaloTextStyleHelper16 = chaloTextStyleHelper14;
                    loadingDialogUIState13 = loadingDialogUIState11;
                    journeyDetailsUiState12 = journeyDetailsUiState11;
                    ChaloColorToken.OrangePrimary orangePrimary1113 = orangePrimary;
                    priceDetailsUiState7 = priceDetailsUiState9;
                    tnCDialogUIState5 = tnCDialogUIState6;
                    termsAndConditionsUiState3 = termsAndConditionsUiState4;
                    snackbarUIState = new SnackbarUIState(chaloTextUIState3, ChaloTextStyleHelper.b(chaloTextStyleHelper16, (String) obj16, orangePrimary1113, 0, null, UIFontWeight.SemiBold, null, null, 108), UiEventHandler.Companion.a(new bp(function12, 16)));
                    journeyDetailsUiState10 = journeyDetailsUiState12;
                    toolbarUIState9 = toolbarUIState10;
                    loadingDialogUIState12 = loadingDialogUIState13;
                    confirmBookingScreenDataState16 = confirmBookingScreenDataState19;
                } else {
                    confirmBookingScreenDataState16 = confirmBookingScreenDataState15;
                    journeyDetailsUiState10 = journeyDetailsUiState9;
                    tnCDialogUIState5 = tnCDialogUIState4;
                    loadingDialogUIState12 = loadingDialogUIState11;
                    toolbarUIState9 = toolbarUIState8;
                    termsAndConditionsUiState3 = termsAndConditionsUiState2;
                    priceDetailsUiState7 = priceDetailsUiState6;
                    snackbarUIState = null;
                }
                ButtonUIState buttonUIState1112 = buttonUIStateG;
                boolean z1113 = confirmBookingScreenDataState16.k;
                if (confirmBookingScreenDataState16.c) {
                    loadingDialogUIState14 = loadingDialogUIState12;
                } else {
                    loadingDialogUIState14 = null;
                }
                return new ConfirmBookingScreenViewState(toolbarUIState9, journeyDetailsUiState10, priceDetailsUiState7, termsAndConditionsUiState3, tnCDialogUIState5, buttonUIState1112, snackbarUIState, z1113, loadingDialogUIState14);
            case 13:
                ChaloTextStyleHelper chaloTextStyleHelper36 = (ChaloTextStyleHelper) confirmBookingUIStateFactory$create$1.L$9;
                ButtonUIState buttonUIState20 = (ButtonUIState) confirmBookingUIStateFactory$create$1.L$8;
                TnCDialogUIState tnCDialogUIState8 = (TnCDialogUIState) confirmBookingUIStateFactory$create$1.L$7;
                TermsAndConditionsUiState termsAndConditionsUiState7 = (TermsAndConditionsUiState) confirmBookingUIStateFactory$create$1.L$6;
                PriceDetailsUiState priceDetailsUiState13 = (PriceDetailsUiState) confirmBookingUIStateFactory$create$1.L$5;
                JourneyDetailsUiState journeyDetailsUiState23 = (JourneyDetailsUiState) confirmBookingUIStateFactory$create$1.L$4;
                toolbarUIState8 = (ToolbarUIState) confirmBookingUIStateFactory$create$1.L$3;
                LoadingDialogUIState loadingDialogUIState22 = (LoadingDialogUIState) confirmBookingUIStateFactory$create$1.L$2;
                Function1 function27 = (Function1) confirmBookingUIStateFactory$create$1.L$1;
                ConfirmBookingScreenDataState confirmBookingScreenDataState28 = (ConfirmBookingScreenDataState) confirmBookingUIStateFactory$create$1.L$0;
                ResultKt.b(obj16);
                obj14 = obj17;
                function11 = function27;
                tnCDialogUIState6 = tnCDialogUIState8;
                priceDetailsUiState8 = priceDetailsUiState13;
                chaloTextStyleHelper14 = chaloTextStyleHelper17;
                chaloTextStyleHelper15 = chaloTextStyleHelper36;
                buttonUIStateG = buttonUIState20;
                stringProvider3 = stringProvider4;
                termsAndConditionsUiState2 = termsAndConditionsUiState7;
                journeyDetailsUiState11 = journeyDetailsUiState23;
                loadingDialogUIState11 = loadingDialogUIState22;
                confirmBookingScreenDataState17 = confirmBookingScreenDataState28;
                orangePrimary = orangePrimary;
                obj15 = obj16;
                chaloTextUIStateB = ChaloTextStyleHelper.b(chaloTextStyleHelper15, (String) obj15, ChaloColorToken.White.f9870a, 0, null, null, null, null, 124);
                confirmBookingUIStateFactory$create$1.L$0 = confirmBookingScreenDataState17;
                confirmBookingUIStateFactory$create$1.L$1 = function11;
                confirmBookingUIStateFactory$create$1.L$2 = loadingDialogUIState11;
                confirmBookingUIStateFactory$create$1.L$3 = toolbarUIState8;
                confirmBookingUIStateFactory$create$1.L$4 = journeyDetailsUiState11;
                confirmBookingUIStateFactory$create$1.L$5 = priceDetailsUiState8;
                confirmBookingUIStateFactory$create$1.L$6 = termsAndConditionsUiState2;
                confirmBookingUIStateFactory$create$1.L$7 = tnCDialogUIState6;
                confirmBookingUIStateFactory$create$1.L$8 = buttonUIStateG;
                confirmBookingUIStateFactory$create$1.L$9 = chaloTextUIStateB;
                confirmBookingUIStateFactory$create$1.L$10 = chaloTextStyleHelper14;
                confirmBookingScreenDataState18 = confirmBookingScreenDataState17;
                confirmBookingUIStateFactory$create$1.label = 14;
                objB13 = stringProvider3.b(StringEnum.RETRY, new Object[0], confirmBookingUIStateFactory$create$1);
                if (objB13 == obj14) {
                    return obj14;
                }
                toolbarUIState10 = toolbarUIState8;
                termsAndConditionsUiState4 = termsAndConditionsUiState2;
                confirmBookingScreenDataState19 = confirmBookingScreenDataState18;
                function12 = function11;
                chaloTextUIState3 = chaloTextUIStateB;
                obj16 = objB13;
                priceDetailsUiState9 = priceDetailsUiState8;
                chaloTextStyleHelper16 = chaloTextStyleHelper14;
                loadingDialogUIState13 = loadingDialogUIState11;
                journeyDetailsUiState12 = journeyDetailsUiState11;
                ChaloColorToken.OrangePrimary orangePrimary1114 = orangePrimary;
                priceDetailsUiState7 = priceDetailsUiState9;
                tnCDialogUIState5 = tnCDialogUIState6;
                termsAndConditionsUiState3 = termsAndConditionsUiState4;
                snackbarUIState = new SnackbarUIState(chaloTextUIState3, ChaloTextStyleHelper.b(chaloTextStyleHelper16, (String) obj16, orangePrimary1114, 0, null, UIFontWeight.SemiBold, null, null, 108), UiEventHandler.Companion.a(new bp(function12, 16)));
                journeyDetailsUiState10 = journeyDetailsUiState12;
                toolbarUIState9 = toolbarUIState10;
                loadingDialogUIState12 = loadingDialogUIState13;
                confirmBookingScreenDataState16 = confirmBookingScreenDataState19;
                ButtonUIState buttonUIState1113 = buttonUIStateG;
                boolean z1114 = confirmBookingScreenDataState16.k;
                if (confirmBookingScreenDataState16.c) {
                    loadingDialogUIState14 = loadingDialogUIState12;
                } else {
                    loadingDialogUIState14 = null;
                }
                return new ConfirmBookingScreenViewState(toolbarUIState9, journeyDetailsUiState10, priceDetailsUiState7, termsAndConditionsUiState3, tnCDialogUIState5, buttonUIState1113, snackbarUIState, z1114, loadingDialogUIState14);
            case 14:
                ChaloTextStyleHelper chaloTextStyleHelper37 = (ChaloTextStyleHelper) confirmBookingUIStateFactory$create$1.L$10;
                chaloTextUIState3 = (TextUIState.ChaloTextUIState) confirmBookingUIStateFactory$create$1.L$9;
                buttonUIStateG = (ButtonUIState) confirmBookingUIStateFactory$create$1.L$8;
                tnCDialogUIState6 = (TnCDialogUIState) confirmBookingUIStateFactory$create$1.L$7;
                termsAndConditionsUiState4 = (TermsAndConditionsUiState) confirmBookingUIStateFactory$create$1.L$6;
                PriceDetailsUiState priceDetailsUiState14 = (PriceDetailsUiState) confirmBookingUIStateFactory$create$1.L$5;
                JourneyDetailsUiState journeyDetailsUiState24 = (JourneyDetailsUiState) confirmBookingUIStateFactory$create$1.L$4;
                ToolbarUIState toolbarUIState19 = (ToolbarUIState) confirmBookingUIStateFactory$create$1.L$3;
                LoadingDialogUIState loadingDialogUIState23 = (LoadingDialogUIState) confirmBookingUIStateFactory$create$1.L$2;
                function12 = (Function1) confirmBookingUIStateFactory$create$1.L$1;
                confirmBookingScreenDataState19 = (ConfirmBookingScreenDataState) confirmBookingUIStateFactory$create$1.L$0;
                ResultKt.b(obj16);
                priceDetailsUiState9 = priceDetailsUiState14;
                orangePrimary = orangePrimary;
                toolbarUIState10 = toolbarUIState19;
                chaloTextStyleHelper16 = chaloTextStyleHelper37;
                journeyDetailsUiState12 = journeyDetailsUiState24;
                loadingDialogUIState13 = loadingDialogUIState23;
                ChaloColorToken.OrangePrimary orangePrimary1115 = orangePrimary;
                priceDetailsUiState7 = priceDetailsUiState9;
                tnCDialogUIState5 = tnCDialogUIState6;
                termsAndConditionsUiState3 = termsAndConditionsUiState4;
                snackbarUIState = new SnackbarUIState(chaloTextUIState3, ChaloTextStyleHelper.b(chaloTextStyleHelper16, (String) obj16, orangePrimary1115, 0, null, UIFontWeight.SemiBold, null, null, 108), UiEventHandler.Companion.a(new bp(function12, 16)));
                journeyDetailsUiState10 = journeyDetailsUiState12;
                toolbarUIState9 = toolbarUIState10;
                loadingDialogUIState12 = loadingDialogUIState13;
                confirmBookingScreenDataState16 = confirmBookingScreenDataState19;
                ButtonUIState buttonUIState1114 = buttonUIStateG;
                boolean z1115 = confirmBookingScreenDataState16.k;
                if (confirmBookingScreenDataState16.c) {
                    loadingDialogUIState14 = loadingDialogUIState12;
                } else {
                    loadingDialogUIState14 = null;
                }
                return new ConfirmBookingScreenViewState(toolbarUIState9, journeyDetailsUiState10, priceDetailsUiState7, termsAndConditionsUiState3, tnCDialogUIState5, buttonUIState1114, snackbarUIState, z1115, loadingDialogUIState14);
            default:
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    public final Object b(List list, Function1 function1, ContinuationImpl continuationImpl) {
        ConfirmBookingUIStateFactory$getTncDialogueUiState$1 confirmBookingUIStateFactory$getTncDialogueUiState$1;
        List list2;
        Function1 function2;
        List list3;
        Function1 function3;
        ButtonContainerUISpecs buttonContainerUISpecs;
        TextUIState.ChaloTextUIState chaloTextUIState;
        if (continuationImpl instanceof ConfirmBookingUIStateFactory$getTncDialogueUiState$1) {
            confirmBookingUIStateFactory$getTncDialogueUiState$1 = (ConfirmBookingUIStateFactory$getTncDialogueUiState$1) continuationImpl;
            int i = confirmBookingUIStateFactory$getTncDialogueUiState$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                confirmBookingUIStateFactory$getTncDialogueUiState$1.label = i - Integer.MIN_VALUE;
            } else {
                confirmBookingUIStateFactory$getTncDialogueUiState$1 = new ConfirmBookingUIStateFactory$getTncDialogueUiState$1(this, continuationImpl);
            }
        } else {
            confirmBookingUIStateFactory$getTncDialogueUiState$1 = new ConfirmBookingUIStateFactory$getTncDialogueUiState$1(this, continuationImpl);
        }
        Object objB = confirmBookingUIStateFactory$getTncDialogueUiState$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = confirmBookingUIStateFactory$getTncDialogueUiState$1.label;
        StringProvider stringProvider = this.f5476a;
        if (i2 == 0) {
            ResultKt.b(objB);
            confirmBookingUIStateFactory$getTncDialogueUiState$1.L$0 = list;
            confirmBookingUIStateFactory$getTncDialogueUiState$1.L$1 = function1;
            confirmBookingUIStateFactory$getTncDialogueUiState$1.label = 1;
            objB = stringProvider.b(StringEnum.TERMS_AND_CONDITIONS, new Object[0], confirmBookingUIStateFactory$getTncDialogueUiState$1);
            if (objB != coroutineSingletons) {
                list2 = list;
                function2 = function1;
            }
            return coroutineSingletons;
        }
        if (i2 == 1) {
            function2 = (Function1) confirmBookingUIStateFactory$getTncDialogueUiState$1.L$1;
            list2 = (List) confirmBookingUIStateFactory$getTncDialogueUiState$1.L$0;
            ResultKt.b(objB);
        } else {
            if (i2 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            buttonContainerUISpecs = (ButtonContainerUISpecs) confirmBookingUIStateFactory$getTncDialogueUiState$1.L$3;
            List list4 = (List) confirmBookingUIStateFactory$getTncDialogueUiState$1.L$2;
            TextUIState.ChaloTextUIState chaloTextUIState2 = (TextUIState.ChaloTextUIState) confirmBookingUIStateFactory$getTncDialogueUiState$1.L$1;
            function3 = (Function1) confirmBookingUIStateFactory$getTncDialogueUiState$1.L$0;
            ResultKt.b(objB);
            list3 = list4;
            chaloTextUIState = chaloTextUIState2;
        }
        return new TnCDialogUIState(DialogUIEventHandler.d, chaloTextUIState, list3, new ButtonContainerUIState(buttonContainerUISpecs, null, new ButtonUIState(new TextUIState.ChaloTextUIState((String) objB, UITextStyle.HeadlineMedium, ChaloColorToken.OrangePrimary.f9835a, 0, UITextAlign.Right, (UIFontWeight) null, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8152), false, null, null, null, UiEventHandler.Companion.a(new bp(function3, 17)), 0.0f, null, 222), 8), 1);
        TextUIState.ChaloTextUIState chaloTextUIState3 = new TextUIState.ChaloTextUIState((String) objB, UITextStyle.DisplaySmall, (ChaloColorToken) null, 0, UITextAlign.Center, (UIFontWeight) null, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8156);
        List list5 = list2;
        ArrayList arrayList = new ArrayList(CollectionsKt.v(list5, 10));
        int i3 = 0;
        for (Object obj : list5) {
            int i4 = i3 + 1;
            if (i3 < 0) {
                CollectionsKt.z0();
                throw null;
            }
            String strH = cb0.h(i4, CLConstants.DOT_SALT_DELIMETER);
            UITextStyle uITextStyle = UITextStyle.BodyMedium;
            ChaloColorToken.Black_60 black_60 = ChaloColorToken.Black_60.f9766a;
            arrayList.add(new TermTextUIState(new TextUIState.ChaloTextUIState(strH, uITextStyle, black_60, 0, (UITextAlign) null, (UIFontWeight) null, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8184), new TextUIState.ChaloTextUIState((String) obj, uITextStyle, black_60, 0, (UITextAlign) null, (UIFontWeight) null, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8184)));
            i3 = i4;
        }
        ButtonContainerUISpecs buttonContainerUISpecs2 = new ButtonContainerUISpecs(11);
        confirmBookingUIStateFactory$getTncDialogueUiState$1.L$0 = function2;
        confirmBookingUIStateFactory$getTncDialogueUiState$1.L$1 = chaloTextUIState3;
        confirmBookingUIStateFactory$getTncDialogueUiState$1.L$2 = arrayList;
        confirmBookingUIStateFactory$getTncDialogueUiState$1.L$3 = buttonContainerUISpecs2;
        confirmBookingUIStateFactory$getTncDialogueUiState$1.label = 2;
        Object objB2 = stringProvider.b(StringEnum.OKAY, new Object[0], confirmBookingUIStateFactory$getTncDialogueUiState$1);
        if (objB2 != coroutineSingletons) {
            list3 = arrayList;
            objB = objB2;
            function3 = function2;
            buttonContainerUISpecs = buttonContainerUISpecs2;
            chaloTextUIState = chaloTextUIState3;
            return new TnCDialogUIState(DialogUIEventHandler.d, chaloTextUIState, list3, new ButtonContainerUIState(buttonContainerUISpecs, null, new ButtonUIState(new TextUIState.ChaloTextUIState((String) objB, UITextStyle.HeadlineMedium, ChaloColorToken.OrangePrimary.f9835a, 0, UITextAlign.Right, (UIFontWeight) null, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8152), false, null, null, null, UiEventHandler.Companion.a(new bp(function3, 17)), 0.0f, null, 222), 8), 1);
        }
        return coroutineSingletons;
    }
}
